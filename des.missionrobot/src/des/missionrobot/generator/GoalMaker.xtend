package des.missionrobot.generator

import des.missionrobot.robotDSL.Goal
import des.missionrobot.generator.BehaviorMaker

class GoalMaker {
	def static makeGoal(Goal g, String missionName){'''
package root.«missionName»;

import lejos.hardware.Sound;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.motor.EV3MediumRegulatedMotor;
import lejos.robotics.subsumption.Behavior;
import root.SensorManager;
import root.AuxMethods;
import lejos.robotics.Color;
import lejos.hardware.Button;


public class Goal implements Behavior{
	
	private «missionName» parent;
	
	//devices
	private static EV3LargeRegulatedMotor leftMotor;
	private static EV3LargeRegulatedMotor rightMotor;
	private static EV3MediumRegulatedMotor armMotor;
	private SensorManager sensorManager;
	
	//flags
	private boolean suppressed = false;
	
	private long timeToLive = 0;
	
	public Goal(«missionName» par,
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
		timeToLive = System.currentTimeMillis() + («IF g.timeout != null»«g.timeout.sec»«ELSE»600«ENDIF» * 1000);
	}
	
	@Override
	public boolean takeControl() {
		return (!parent.done && («IF g.goalEvents.size > 0 »(«FOR trig :g.goalEvents»«BehaviorMaker.toCondition(trig)»«ENDFOR») ||«ENDIF» System.currentTimeMillis() > timeToLive || Button.ESCAPE.isDown()));
	}

	@Override
	public void action() {
		«BehaviorMaker.actionMaker(g.finishActions)»
		leftMotor.stop(true);
		rightMotor.stop(true);
		armMotor.stop();
		parent.StopArbitrator();
	}

	@Override
	public void suppress() {
	}
	

}'''}
}