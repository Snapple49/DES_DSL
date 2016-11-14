package ex11;


import java.util.HashMap;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.robotics.subsumption.*;

public class Move implements Behavior {
	/* ============= Made by Oliver Stein 4846524 and Albin Ohlsson 4846060 ============= */
	
	//create all private variables and motor objects
	private boolean suppressed = false;
	static EV3LargeRegulatedMotor leftMotor, rightMotor;

	//set the motor objects to the provided initialized motor objects
	public Move(EV3LargeRegulatedMotor Lmtr, EV3LargeRegulatedMotor Rmtr){
		leftMotor = Lmtr;
		rightMotor = Rmtr;
	}
	//always run
	public boolean takeControl(){
		return true;
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
		leftMotor.setSpeed(5);
		leftMotor.forward();
		rightMotor.forward();
		while(!suppressed){
			Thread.yield();			
		}
	}
	
}
