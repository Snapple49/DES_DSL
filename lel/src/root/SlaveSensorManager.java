package root;

import java.io.PrintWriter;

import lejos.hardware.sensor.EV3GyroSensor;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.robotics.SampleProvider;

public class SlaveSensorManager extends Thread{
	
	private PrintWriter writer;
	private EV3UltrasonicSensor frontUltrasonic = null;
	private EV3TouchSensor leftTouch = null;
	private EV3TouchSensor rightTouch = null;
	private EV3GyroSensor gyroSensor = null;
	private int period;
	private boolean running = false;
	SampleProvider gyroSampleProvider;
	SampleProvider leftBumperSampleProvider;
	SampleProvider rightBumperSampleProvider;
	SampleProvider frontUltrasonicSampleProvider;
	float[] gyroSamples;
	float[] leftBumperSamples;
	float[] rightBumperSamples;
	float[] frontUltrasonicSamples;
	float[] arrayToSend;
	
	public SlaveSensorManager(PrintWriter writer, EV3UltrasonicSensor frontU, EV3TouchSensor leftT, EV3TouchSensor rightT, EV3GyroSensor gyroS, int period){
		this.writer = writer;
		this.frontUltrasonic = frontU;
		frontUltrasonicSampleProvider = frontUltrasonic.getDistanceMode();
		frontUltrasonicSamples = new float[frontUltrasonicSampleProvider.sampleSize()];
		this.leftTouch = leftT;
		leftBumperSampleProvider = leftTouch.getTouchMode();
		leftBumperSamples = new float[leftBumperSampleProvider.sampleSize()];
		this.rightTouch = rightT;
		rightBumperSampleProvider = rightTouch.getTouchMode();
		rightBumperSamples = new float[rightBumperSampleProvider.sampleSize()];
		this.gyroSensor = gyroS;
		gyroSampleProvider = gyroSensor.getAngleMode();
		gyroSamples = new float[gyroSampleProvider.sampleSize()];
		this.period = period;
	}
	
	public void run(){
		running = true;
		while(running){
			arrayToSend = readValues();
			System.out.println(arrayToSend[0]);
			transmit(serializeFloats(arrayToSend));
			waitMs(period);
		}
	}
	
	public void waitMs(int waitTime) {
		long startTime = System.currentTimeMillis();
		long curTime = startTime;
		while(curTime < startTime + waitTime){
			curTime = System.currentTimeMillis();
			Thread.yield();
		}
	}
	
	public void transmit(String s){
		writer.write(s);
	}
	
	public float[] readValues(){
		frontUltrasonic.fetchSample(frontUltrasonicSamples, 0);
		leftTouch.fetchSample(leftBumperSamples, 0);
		rightTouch.fetchSample(rightBumperSamples, 0);
		gyroSensor.fetchSample(gyroSamples, 0);
		float[] floats = {leftBumperSamples[0], rightBumperSamples[0], frontUltrasonicSamples[0], gyroSamples[0]};
		return floats;
	}
	
	public String serializeFloats(float[] floats){
		String s = "";
		for (float f : floats){
			s = s + " " + Float.toString(f);
		}
		return s;
	}
	
}
