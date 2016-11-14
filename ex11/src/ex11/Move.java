package ex11;


import java.util.HashMap;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.robotics.subsumption.*;

public class Move implements Behavior {
	/* ============= Made by Oliver Stein 4846524 and Albin Ohlsson 4846060 ============= */
	
	//create all private variables and motor objects
	private boolean suppressed = false;
	static EV3LargeRegulatedMotor leftMotor, rightMotor;
	HashMap<String, Boolean> colorsFound;

	//set the motor objects to the provided initialized motor objects
	public Move(EV3LargeRegulatedMotor Lmtr, EV3LargeRegulatedMotor Rmtr, HashMap<String, Boolean> colorsFnd){
		leftMotor = Lmtr;
		rightMotor = Rmtr;
		colorsFound = colorsFnd;
	}
	//always run
	public boolean takeControl(){
		return colorsFound.values().contains(false);
	}
	
	//stop motors when suppressed
	public void suppress(){
		leftMotor.stop(true);
		rightMotor.stop();
		suppressed = true;
	}
	
	//move forwards indefinitely 
	public void action(){
		
		suppressed = false;
		leftMotor.forward();
		rightMotor.forward();
		while(!suppressed){
			Thread.yield();			
		}
	}
	
}
