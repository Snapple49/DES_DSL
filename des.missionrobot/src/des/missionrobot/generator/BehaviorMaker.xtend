package des.missionrobot.generator

import des.missionrobot.robotDSL.Trigger
import des.missionrobot.robotDSL.Action
import des.missionrobot.robotDSL.Task
import java.util.List
import des.missionrobot.robotDSL.Speed
import javax.sound.sampled.BooleanControl.Type

class BehaviorMaker {
	
	
	
	static String sensor = ""
	static String value = ""
	static String action = ""
	static String actions = ""
	static String prebool
	static int onlyOnce = 0
	
	
	def static makeBehaviorClass(Task t, String missionName){'''
package root.«missionName»;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.motor.EV3MediumRegulatedMotor;
import lejos.robotics.subsumption.Behavior;
import root.SensorManager;
import root.AuxMethods.*;
import lejos.robotics.Color;



public class «t.name» implements Behavior{
	
	private «missionName» parent;
	
	//devices
	private static EV3LargeRegulatedMotor leftMotor;
	private static EV3LargeRegulatedMotor rightMotor;
	private static EV3MediumRegulatedMotor armMotor;
	private SensorManager sensorManager;
	
	//flags
	private boolean suppressed = false;
	
	private long startTime = 0;
	private long curTime = 0;
	
	public «t.name»(«missionName» par,
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
		return («IF t.triggerList.size == 0»true«ELSE»«FOR trig : t.triggerList»«toCondition(trig)»«ENDFOR»«ENDIF»);
	}

	@Override
	public void action() {
		suppressed = false;
		«actionMaker(t.actionList)»
	}

	@Override
	public void suppress() {
		suppressed = true;
	}
	

}
	'''
	}
	def static toCondition(Trigger trig){
		value = ""
		sensor = ""
		prebool = ""
		if(trig.sensor != null){//trig is sensor	
			switch (trig.sensor.sensorType) {
				case LEFTLIGHT: {sensor = "sensorManager.getLeftLight()"}
				case RIGHTLIGHT : {sensor = "sensorManager.getRightLight()"}
				case COLOR : {sensor = "sensorManager.getColor()"}
				case BACKUS :{sensor = "sensorManager.getBackUltrasonic()"}
				default : {sensor = ""}
			}
			if (trig.dist == null){
				switch (trig.color.colorName) {
					case BRIGHT : {value = " > 0.55"}
					case BLACK: {value = " == Color.BLACK"}
					case BLUE: {value = " == Color.BLUE"}
					case DARK: {value = " < 0.4"}
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
		else{ //trig is flag
			value = "parent." + negation(trig)
		}
		
		if(trig.boolType != null){
			switch (trig.boolType.boolType) {
				case AND: {
					prebool = " && "
				}
				case OR: {
					prebool = " || "
				}
				default: {
					prebool = ""
				}
			}
		}
		
		return sensor + value
	}
	
	def static toFlag(Trigger trig){
		if (trig.flag != null && trig.neg != null){
			return "!(parent." + trig.flag.name + ")"
		}else if(trig.flag != null){
			return "parent." + trig.flag.name
		}
	}
	
	def static toAction(Action act){
		action = ""
		if(act.moveDir != null){ // action is movement
			action = action +
					'''
		leftMotor.setSpeed(''' + getSpeed(act.speed) + ''');
rightMotor.setSpeed(''' + getSpeed(act.speed) + ''');
'''
			switch (act.moveDir.dir) {
				case FORWARD: {
					action = action +					
					'''
leftMotor.forward();
rightMotor.forward();
					'''
				}
				case BACKWARD:{
					action = action +					
					'''
leftMotor.backward();
rightMotor.backward();
					'''
				}
				default: {
					return action = "error"
				}
			}
			if(act.duration > 0){
				action = action + 
				'''waitMs(«act.duration»);
				'''						
			}
		}else if(act.turnDir != null){ //action is a turn
			switch (act.turnDir.dir) {
				case LEFT: {
					action = action + 
					'''turnDegrees(false, «act.degr*100»);
					'''
				}
				case RIGHT: {
					action = action + 
					'''turnDegrees(true, «act.degr*100»);
					'''
				}
				default: {
					return action = "error"
				}
			}
		}
		return action
	}
	
	def static actionMaker(List<Action> actionList){
		actions = ""
		onlyOnce = 1
		for (act : actionList) {
			if(act.moveDir != null && act.duration <= 0){
				onlyOnce = 0
			}
		}
		switch (onlyOnce) {
			case 0: {
				for (a : actionList) {					
					actions = actions + toAction(a)
				}
				actions = actions + '''while(!suppressed){
	Thread.yield();
}'''
			}
			default: {
				actions = actions + '''while(!suppressed){
					'''
				for (a : actionList) {					
					actions = actions + toAction(a)
				}
				actions = actions + '''
break;
}'''				
			}
		}
		
	}
	def static getSpeed(Speed speed){
		if (speed == null){
			return "(int)( leftMotor.getMaxSpeed()*0.5)"
		}
		switch (speed.speed) {
			case HIGH: {
				return "(int)( leftMotor.getMaxSpeed()*0.7)"
			}
			case LOW: {
				return "(int)( leftMotor.getMaxSpeed()*0.35)"	
			}
			default:{
				return "(int)( leftMotor.getMaxSpeed()*0.5)"
			}
		}
	}
}

