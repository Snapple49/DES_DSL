package root;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.robotics.Color;

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
		while(!(sMgr.getLeftLight() < sMgr.blackThreshold && sMgr.getRightLight() < sMgr.blackThreshold && sMgr.getColor() != Color.BLACK)){
			while(sMgr.getLeftLight() > sMgr.blackThreshold){
				lMtr.setSpeed(lMtr.getMaxSpeed()*0.2f);
				lMtr.backward();
			}
			lMtr.stop();
			while(sMgr.getRightLight() > sMgr.blackThreshold){
				rMtr.setSpeed(rMtr.getMaxSpeed()*0.2f);
				rMtr.backward();
			}
			rMtr.stop();
			if(sMgr.getColor() != Color.BLACK){
				lMtr.setSpeed(lMtr.getMaxSpeed()*0.2f);
				rMtr.setSpeed(rMtr.getMaxSpeed()*0.2f);
				lMtr.forward();
				rMtr.forward();
				waitMs(300);
				lMtr.stop();
				rMtr.stop();
			}
		}
	}
	
}