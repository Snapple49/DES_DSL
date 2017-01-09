package root.FindLakes;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.motor.EV3MediumRegulatedMotor;
import lejos.robotics.subsumption.Behavior;
import root.SensorManager;
import root.AuxMethods;
import lejos.robotics.Color;



public class AvoidEdgeFront implements Behavior{
	
	private FindLakes parent;
	
	//devices
	private static EV3LargeRegulatedMotor leftMotor;
	private static EV3LargeRegulatedMotor rightMotor;
	private static EV3MediumRegulatedMotor armMotor;
	private SensorManager sensorManager;
	
	//flags
	private boolean suppressed = false;
	
	public AvoidEdgeFront(FindLakes par,
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
		return (sensorManager.getColor() == Color.WHITE);
	}

	@Override
	public void action() {
		suppressed = false;
		while(!suppressed){
		leftMotor.setSpeed(leftMotor.getMaxSpeed()*0.35f);
		rightMotor.setSpeed(leftMotor.getMaxSpeed()*0.35f);
		leftMotor.backward();
		rightMotor.backward();
		AuxMethods.waitMs(400);
		AuxMethods.turnDegrees(false, 500, leftMotor, rightMotor);
		break;
		}
	}

	@Override
	public void suppress() {
		suppressed = true;
	}
	

}
