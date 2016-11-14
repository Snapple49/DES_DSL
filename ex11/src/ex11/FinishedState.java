package ex11;

import java.io.File;
import java.util.HashMap;

import lejos.hardware.Sound;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.robotics.subsumption.Behavior;

public class FinishedState implements Behavior{
	private HashMap<String, Boolean> colorsFound;
	File file = new File("dada.wav");
	static EV3LargeRegulatedMotor leftMotor, rightMotor;

	
	public FinishedState(EV3LargeRegulatedMotor lMtr, EV3LargeRegulatedMotor rMtr, HashMap<String, Boolean> colorsFnd){
		colorsFound = colorsFnd;
		rightMotor = rMtr;
		leftMotor = lMtr;
	}
	
	public boolean takeControl() {
		return (!colorsFound.values().contains(false));
	}

	public void action() {
		rightMotor.stop(true);
		leftMotor.stop();
		Sound.playSample(file, 100);
		while(true){
			System.exit(0);
		}
	}

	public void suppress() {}
	
}
