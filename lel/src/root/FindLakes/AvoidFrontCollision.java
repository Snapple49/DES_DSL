package root.FindLakes;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.motor.EV3MediumRegulatedMotor;
import lejos.robotics.subsumption.Behavior;
import root.SensorManager;
import root.AuxMethods;
import lejos.robotics.Color;



public class AvoidFrontCollision implements Behavior{
	
	private FindLakes parent;
	
	//devices
	private static EV3LargeRegulatedMotor leftMotor;
	private static EV3LargeRegulatedMotor rightMotor;
	private static EV3MediumRegulatedMotor armMotor;
	private SensorManager sensorManager;
	
	//flags
	private boolean suppressed = false;
	
	public AvoidFrontCollision(FindLakes par,
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
	}
	
	@Override
	public boolean takeControl() {
		return (sensorManager.getFrontUltrasonic() < 0.2);
	}

	@Override
	public void action() {
		suppressed = false;
		while(!suppressed){
		AuxMethods.turnDegrees(false, 200, leftMotor, rightMotor);
		break;
		}
	}

	@Override
	public void suppress() {
		suppressed = true;
	}
	

}
