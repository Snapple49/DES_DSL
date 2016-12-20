package root;

import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.hardware.sensor.NXTLightSensor;
import lejos.robotics.SampleProvider;

public class SensorManager extends Thread{
	
	public float blackThreshold = 0.5f;
	public float whiteThreshold = 0.55f;
	
	public boolean running;
	
	private EV3ColorSensor colorSensor = null;
	private NXTLightSensor leftLight = null;
	private NXTLightSensor rightLight = null;
	private EV3UltrasonicSensor backUltrasonic = null;
	
	//master devices
	SampleProvider colorSampleProvider;
	SampleProvider leftLightSampleProvider;
	SampleProvider rightLightSampleProvider;
	SampleProvider backUltrasonicSampleProvider;
	float[] colorSamples;
	float[] leftLightSamples;
	float[] rightLightSamples;
	float[] backUltrasonicSamples;
	
	//slave devices
	float leftTouchSamples;
	float rightTouchSamples;
	float gyroSamples;
	float frontUltrasonicSamples;
	
	public SensorManager(EV3ColorSensor clS, NXTLightSensor lLi, NXTLightSensor rLi, EV3UltrasonicSensor bUs){
		this.colorSensor = clS;
		colorSampleProvider = colorSensor.getColorIDMode();
		colorSamples = new float[colorSampleProvider.sampleSize()];
		this.leftLight = lLi;
		leftLightSampleProvider = leftLight.getRedMode();
		leftLightSamples = new float[leftLightSampleProvider.sampleSize()];
		this.rightLight = rLi;
		rightLightSampleProvider = rightLight.getRedMode();
		rightLightSamples = new float[rightLightSampleProvider.sampleSize()];
		this.backUltrasonic = bUs;
		backUltrasonicSampleProvider = backUltrasonic.getDistanceMode();
		backUltrasonicSamples = new float[backUltrasonicSampleProvider.sampleSize()];
	}
	
	@Override
	public void run() {
		running = true;
		while(running){
			colorSampleProvider.fetchSample(colorSamples, 0);
			leftLightSampleProvider.fetchSample(leftLightSamples, 0);
			rightLightSampleProvider.fetchSample(rightLightSamples, 0);
			backUltrasonicSampleProvider.fetchSample(backUltrasonicSamples, 0);
		}
	}
	
	public float getColor(){
		return colorSamples[0];
	}

	public float getLeftLight(){
		return leftLightSamples[0];
	}
	
	public float getRightLight(){
		return rightLightSamples[0];
	}
	
	public float getBackUltrasonic(){
		return backUltrasonicSamples[0];
	}
	
	public float getLeftTouch(){
		return leftTouchSamples;
	}

	public float getRightTouch(){
		return rightTouchSamples;
	}
	
	public float getFrontUltrasonic(){
		return frontUltrasonicSamples;
	}
	
	public float getGyro(){
		return gyroSamples;
	}
	
	public void updateSlaveDevices(float[] values){
		leftTouchSamples = values[0];
		rightTouchSamples = values[1];
		frontUltrasonicSamples = values[2];
		gyroSamples = values[3];
	}
}

