package ex11;

import java.io.PrintWriter;
import java.util.HashMap;

import lejos.hardware.Sound;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.robotics.Color;
import lejos.robotics.SampleProvider;
import lejos.robotics.subsumption.Behavior;

public class ColorFound implements Behavior{

	private boolean suppressed;
	private HashMap<String, Boolean> colorsFound; 
	private PrintWriter writer;
	private final static int redFound = 2;
	private final static int yellowFound = 3;
	private final static int blueFound = 4;

	static EV3ColorSensor colorSensor;
	SampleProvider color;
	float[] colorSamples;

	static EV3LargeRegulatedMotor leftMotor, rightMotor;


	public ColorFound(EV3LargeRegulatedMotor lMtr, EV3LargeRegulatedMotor rMtr,
			EV3ColorSensor clSensor, PrintWriter wrtr, HashMap<String, Boolean> colorsFnd){
		leftMotor = lMtr;
		rightMotor = rMtr;
		colorSensor = clSensor;
		color = colorSensor.getColorIDMode();
		colorSamples = new float[color.sampleSize()];
		writer = wrtr;
		colorsFound = colorsFnd;
	}


	public boolean takeControl() {
		color.fetchSample(colorSamples, 0);
		return ((colorSamples[0] == Color.RED && !colorsFound.get("Red")) || 
				(colorSamples[0] == Color.YELLOW  && !colorsFound.get("Yellow")) ||
				(colorSamples[0] == Color.BLUE && !colorsFound.get("Blue")));
	}

	public void action() {
		suppressed = false;
		while(!suppressed){
			
			switch ((int)colorSamples[0]){
			case Color.RED: colorsFound.put("Red", true);
			writer.write(redFound);
			writer.flush();
			break;
			case Color.YELLOW: colorsFound.put("Yellow", true);
			writer.write(yellowFound);
			writer.flush();
			break;
			case Color.BLUE: colorsFound.put("Blue", true);
			writer.write(blueFound);
			writer.flush();
			break;
			}
			Sound.beepSequence();


			break;
		}
	}

	public void suppress() {
		leftMotor.stop(true);
		rightMotor.stop();
		suppressed = true;
	}

}
