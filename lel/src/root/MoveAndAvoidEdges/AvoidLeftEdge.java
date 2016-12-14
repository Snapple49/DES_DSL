package root.MoveAndAvoidEdges;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.motor.EV3MediumRegulatedMotor;
import lejos.robotics.subsumption.Behavior;
import root.SensorManager;
import root.AuxMethods;


public class AvoidLeftEdge implements Behavior{

	//devices
	private static EV3LargeRegulatedMotor leftMotor;
	private static EV3LargeRegulatedMotor rightMotor;
	private static EV3MediumRegulatedMotor armMotor;
	private SensorManager sensorManager;
	
	//flags
	private boolean suppressed = false;
	
	private long startTime = 0;
	private long curTime = 0;
	
	public AvoidLeftEdge(EV3LargeRegulatedMotor lMotor,
					EV3LargeRegulatedMotor rMotor,
					EV3MediumRegulatedMotor aMotor,
					SensorManager sM)
	{
		leftMotor = lMotor;
		rightMotor = rMotor;
		armMotor = aMotor;
		sensorManager = sM;
	}
	
	@Override
	public boolean takeControl() {
		return (sensorManager.getLeftLight() > 0.55);
	}

	@Override
	public void action() {
		suppressed = false;
		while(!suppressed){
		leftMotor.setSpeed((int)( leftMotor.getMaxSpeed()*0.35));
		rightMotor.setSpeed((int)( leftMotor.getMaxSpeed()*0.35));
		leftMotor.backward();
		rightMotor.backward();
		AuxMethods.waitMs(300);
		AuxMethods.turnDegrees(true, 300, leftMotor, rightMotor);
		break;
		}
	}

	@Override
	public void suppress() {
		suppressed = true;
	}
	

}
