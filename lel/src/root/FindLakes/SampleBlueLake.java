package root.FindLakes;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.motor.EV3MediumRegulatedMotor;
import lejos.robotics.subsumption.Behavior;
import root.SensorManager;
import root.AuxMethods;
import lejos.robotics.Color;



public class SampleBlueLake implements Behavior{
	
	private FindLakes parent;
	
	//devices
	private static EV3LargeRegulatedMotor leftMotor;
	private static EV3LargeRegulatedMotor rightMotor;
	private static EV3MediumRegulatedMotor armMotor;
	private SensorManager sensorManager;
	
	//flags
	private boolean suppressed = false;
	
	public SampleBlueLake(FindLakes par,
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
		return (sensorManager.getColor() == Color.BLUE && !(parent.BlueFound));
	}

	@Override
	public void action() {
		suppressed = false;
		while(!suppressed){
		parent.BlueFound = true;
		AuxMethods.centralize(sensorManager, leftMotor, rightMotor);
		armMotor.rotate(-90);
		armMotor.rotate(90);
		leftMotor.setSpeed(leftMotor.getMaxSpeed()*0.5f);
		rightMotor.setSpeed(leftMotor.getMaxSpeed()*0.5f);
		leftMotor.backward();
		rightMotor.backward();
		AuxMethods.waitMs(200);
		AuxMethods.turnDegrees(true, 400, leftMotor, rightMotor);
		break;
		}
	}

	@Override
	public void suppress() {
		suppressed = true;
	}
	

}
