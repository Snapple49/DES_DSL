package root;

import lejos.hardware.motor.EV3LargeRegulatedMotor;

public class AuxMethods {

	static public void waitMs(int waitTime) {
		long startTime = System.currentTimeMillis();
		long curTime = startTime;
		while(curTime < startTime + waitTime){
			curTime = System.currentTimeMillis();
			Thread.yield();
		}
	}
	
	public static void clearScreen(){
		for (int i = 0; i < 10; i++) {
			System.out.println("");
		}
	}
	
	static public void turnDegrees(boolean turnRight, int turnDeg, EV3LargeRegulatedMotor leftMotor, EV3LargeRegulatedMotor rightMotor){
		leftMotor.stop(true);
		rightMotor.stop();
		if(turnRight){
			leftMotor.forward();
			rightMotor.backward();			
		}else{
			rightMotor.forward();
			leftMotor.backward();
		}
		waitMs(turnDeg);
		rightMotor.stop(true);
		leftMotor.stop();
	}
	
	static public void centralize(SensorManager sMgr, EV3LargeRegulatedMotor lMtr, EV3LargeRegulatedMotor rMtr){
		
	}
	
}