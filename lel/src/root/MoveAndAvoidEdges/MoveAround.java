package root.MoveAndAvoidEdges;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.motor.EV3MediumRegulatedMotor;
import lejos.robotics.subsumption.Behavior;
import root.SensorManager;


public class MoveAround implements Behavior{

	//devices
	private static EV3LargeRegulatedMotor leftMotor;
	private static EV3LargeRegulatedMotor rightMotor;
	private static EV3MediumRegulatedMotor armMotor;
	private SensorManager sensorManager;
	
	//flags
	private boolean suppressed = false;
	
	private long startTime = 0;
	private long curTime = 0;
	
	public MoveAround(EV3LargeRegulatedMotor lMotor,
					EV3LargeRegulatedMotor rMotor,
					EV3MediumRegulatedMotor aMotor,
					SensorManager sM)
	{
		leftMotor = lMotor;
		rightMotor = rMotor;
		armMotor = aMotor;
		sensorManager = sM;
	}
	
	public void turnDegrees(boolean turnRight, int turnDeg){
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
	
	public void waitMs(int waitTime) {
		startTime = System.currentTimeMillis();
		curTime = startTime;
		while(curTime < startTime + waitTime){
			curTime = System.currentTimeMillis();
			Thread.yield();
		}
	}
	
	@Override
	public boolean takeControl() {
		return (true);
	}

	@Override
	public void action() {
		suppressed = false;
		leftMotor.setSpeed((int)( leftMotor.getMaxSpeed()*0.5));
		rightMotor.setSpeed((int)( leftMotor.getMaxSpeed()*0.5));
		leftMotor.forward();
		rightMotor.forward();
		while(!suppressed){
			Thread.yield();
		}
	}

	@Override
	public void suppress() {
		suppressed = true;
	}
	

}
