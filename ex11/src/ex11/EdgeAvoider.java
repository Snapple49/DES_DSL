package ex11;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.robotics.Color;
import lejos.robotics.SampleProvider;

public class EdgeAvoider extends Movement{

	private boolean suppressed;
	static EV3ColorSensor colorSensor;
	SampleProvider color;
	float[] colorSamples;
	static EV3LargeRegulatedMotor leftMotor, rightMotor;
	
	public EdgeAvoider(EV3ColorSensor clSensor , 
						EV3LargeRegulatedMotor lMtr, EV3LargeRegulatedMotor rMtr){
		colorSensor = clSensor;
		color = colorSensor.getColorIDMode();
		colorSamples = new float[color.sampleSize()];
		leftMotor = lMtr;
		rightMotor = rMtr;		
	}
	
	public boolean takeControl(){
		color.fetchSample(colorSamples, 0);
		return (colorSamples[0] == Color.BLACK);
	}

	public void action() {
		suppressed = false;
		while(!suppressed){
			backAndTurn(true, 300, 400);
			break;
		}
	}

	public void suppress() {
		rightMotor.stop(true);
		leftMotor.stop();
		suppressed = true;
	}

}
