package root.Test;

import lejos.hardware.Sound;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.motor.EV3MediumRegulatedMotor;
import lejos.robotics.subsumption.Behavior;
import root.SensorManager;
import root.AuxMethods;
import lejos.robotics.Color;

public class Goal implements Behavior{
	
	private Test parent;
	
	//devices
	private static EV3LargeRegulatedMotor leftMotor;
	private static EV3LargeRegulatedMotor rightMotor;
	private static EV3MediumRegulatedMotor armMotor;
	private SensorManager sensorManager;
	
	//flags
	private boolean suppressed = false;
	
	private long timeToLive = 0;
	
	public Goal(Test par,
					EV3LargeRegulatedMotor lMotor,
					EV3LargeRegulatedMotor rMotor,
					EV3MediumRegulatedMotor aMotor,
					SensorManager sM)
	{
		leftMotor = lMotor;
		rightMotor = rMotor;
		armMotor = aMotor;
		sensorManager = sM;
		parent = par;
		timeToLive = System.currentTimeMillis() + (600 * 1000);
	}
	
	@Override
	public boolean takeControl() {
		return ((sensorManager.getColor() == Color.BLACK) || System.currentTimeMillis() > timeToLive);
	}

	@Override
	public void action() {
		while(!suppressed){
		break;
		}
		parent.StopArbitrator();
	}

	@Override
	public void suppress() {
	}
	

}