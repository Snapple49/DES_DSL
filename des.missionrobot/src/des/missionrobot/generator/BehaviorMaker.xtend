package des.missionrobot.generator

import des.missionrobot.robotDSL.Trigger
import des.missionrobot.robotDSL.Action
import des.missionrobot.robotDSL.Task
import des.missionrobot.robotDSL.Sensor
import org.eclipse.emf.ecore.xmi.impl.RootXMLContentHandlerImpl.Describer

class BehaviorMaker {
	
	
	
	static String sensor = ""
	static String value = ""
	static String action = ""
	
	def static makeBehaviorClass(Task t){'''
package lel;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.motor.EV3MediumRegulatedMotor;
import lejos.robotics.subsumption.Behavior;


public class «t.name» implements Behavior{

	//devices
	private static EV3LargeRegulatedMotor leftMotor;
	private static EV3LargeRegulatedMotor rightMotor;
	private static EV3MediumRegulatedMotor armMotor;
	private SensorManager sensorManager;
	
	//flags
	private boolean suppressed = false;
	
	private long startTime = 0;
	private long curTime = 0;
	
	public «t.name»(EV3LargeRegulatedMotor lMotor,
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
		}else{
			rightMotor.forward();
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
		return («IF t.triggerList.size == 0»true«ELSE»«FOR trig : t.triggerList»«toCondition(trig)»«ENDFOR»«ENDIF»);
	}

	@Override
	public void action() {
		suppressed = false;
		while(!suppressed){
			«FOR a : t.actionList»«toAction(a)»«ENDFOR»
		}
	}

	@Override
	public void suppress() {
		leftMotor.stop(true);
		rightMotor.stop();
		suppressed = true;
	}
	

}
	'''
	}
	def static toCondition(Trigger trig){
		action = ""
		sensor = ""
		if(trig.sensor != null){	
			switch (trig.sensor.sensorType) {
				case LEFTLIGHT: {sensor = "sensorManager.getLeftLight()"}
				case RIGHTLIGHT : {sensor = "sensorManager.getRightLight()"}
				case COLOR : {sensor = "sensorManager.getColor()"}
				case BACKUS :{sensor = "sensorManager.getBackUltrasonic()"}
				default : {sensor = ""}
			}
			if (trig.dist == null){
				switch (trig.color.colorName) {
					case BRIGHT : {value = " > 0.5"}
					case BLACK: {value = " == Color.BLACK"}
					case BLUE: {value = " == Color.BLUE"}
					case DARK: {value = " < 0.5"}
					case GREEN: {value = " == Color.GREEN"}
					case RED: {value = " == Color.RED"}
					case WHITE: {value = " == Color.WHITE"}
					default : {value = ""}
				}
			}else{
				switch (trig.dist.rangeBool.boolType) {
					case G: {value = " > " + (trig.dist.distance as float) /100}
					case L: {value = " < " + (trig.dist.distance as float) /100}
					default : {value = ""}
				}
			}
		}
		else{
			return "false"
		}
		
		return sensor + value
	}
	
	def static toAction(Action act){
		action = ""
		if(act.moveDir != null){ // action is movement
			switch (act.moveDir.dir) {
				case FORWARD: {
					action = action +
					'''leftMotor.forward();
rightMotor.forward();
					'''
				}
				case BACKWARD:{
					action = action +					
					'''leftMotor.backward();
rightMotor.backward();
					'''
				}
				default: {
					return action = "error"
				}
			}
			if(act.duration > 0){
				action = action + 
				'''waitMs(«act.duration*100»);
				'''						
			}else{
				action = action + 
				'''Thread.yield();'''
			}
		}else if(act.turnDir != null){ //action is a turn
			switch (act.turnDir.dir) {
				case LEFT: {
					action = action + 
					'''turnDegrees(false, «act.degr»);
					'''
				}
				case RIGHT: {
					action = action + 
					'''turnDegrees(true, «act.degr»);
					'''
				}
				default: {
					return action = "error"
				}
			}
		}
		return action
	}
}

