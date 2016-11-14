package ex11;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.robotics.SampleProvider;

public class UltrasonicAvoider extends Movement{
	static EV3UltrasonicSensor distanceSensor;
	SampleProvider distance;
	float[] distanceSamples;
	static EV3LargeRegulatedMotor leftMotor, rightMotor;
	
	private boolean suppressed;
	
	public UltrasonicAvoider(EV3UltrasonicSensor usSensor,
							EV3LargeRegulatedMotor lMtr, EV3LargeRegulatedMotor rMtr){
		distanceSensor = usSensor;
		distance = distanceSensor.getDistanceMode();
		distanceSamples = new float[distanceSensor.sampleSize()];
		leftMotor = lMtr;
		rightMotor = rMtr;
	}
	
	public boolean takeControl() {
			//fetch new sample data
			distance.fetchSample(distanceSamples, 0);
			
			//set collision flags depending on sample data
			return (distanceSamples[0] < 0.32);
	}

	public void action() {
		suppressed = false;
		while(!suppressed){			
			backAndTurn(true, 0, 400);
			break;
		}
	}

	public void suppress() {
		rightMotor.stop(true);
		leftMotor.stop();
		suppressed = true;
	}
	
	
		
}
