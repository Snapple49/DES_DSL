package ex11;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.robotics.subsumption.Behavior;

public abstract class Movement implements Behavior{

	static EV3LargeRegulatedMotor leftMotor, rightMotor;
	private long startTime = 0;
	private long curTime = 0;
	
	protected void backAndTurn(boolean turnRight, int backingTime, int turnTime){
		
		leftMotor.backward();
		rightMotor.backward();
		waitMs(backingTime);
		if(turnRight){
			leftMotor.forward();			
		}else{
			rightMotor.forward();
		}
		waitMs(turnTime);
		rightMotor.stop(true);
		leftMotor.stop();
	}

	protected void waitMs(int waitTime) {
		startTime = System.currentTimeMillis();
		curTime = startTime;
		while(curTime < startTime + waitTime){
			curTime = System.currentTimeMillis();
			Thread.yield();
		}
	}
	
}
