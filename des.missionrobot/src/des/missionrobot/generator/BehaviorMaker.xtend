package des.missionrobot.generator

import des.missionrobot.robotDSL.Trigger
import des.missionrobot.robotDSL.Action
import des.missionrobot.robotDSL.Task
import java.util.List
import des.missionrobot.robotDSL.Speed
import des.missionrobot.robotDSL.BoolType

class BehaviorMaker {
	
	
	
	static String sensor = ""
	static String value = ""
	static String action = ""
	static String actions = ""
	static String prebool = ""
	static int onlyOnce = 0
	
	
	def static makeBehaviorClass(Task t, String missionName){'''
package root.«missionName»;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.motor.EV3MediumRegulatedMotor;
import lejos.robotics.subsumption.Behavior;
import root.SensorManager;
import root.AuxMethods;
import root.AuxMethods.*;
import lejos.robotics.Color;
import lejos.hardware.Sound;



public class «t.name» implements Behavior{
	
	private «missionName» parent;
	
	//devices
	private static EV3LargeRegulatedMotor leftMotor;
	private static EV3LargeRegulatedMotor rightMotor;
	private static EV3MediumRegulatedMotor armMotor;
	private SensorManager sensorManager;
	
	//flags
	private boolean suppressed = false;
	
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
		return («IF t.triggerList.size == 0»!parent.done«ELSE»«FOR trig : t.triggerList»«toCondition(trig)»«ENDFOR»«ENDIF»);
	}

	@Override
	public void action() {
		suppressed = false;
		«actionMaker(t.actionList)»
	}

	@Override
	public void suppress() {
		leftMotor.stop(true);
		rightMotor.stop(true);
		armMotor.stop();
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
				case FRONTUS : {sensor = "sensorManager.getFrontUltrasonic()"}
				case LEFTTOUCH : {sensor = "sensorManager.getLeftTouch()"}
				case RIGHTTOUCH : {sensor = "sensorManager.getRightTouch()"}
				default : {sensor = ""}
			}
			if (trig.dist == null){
				switch (trig.color.colorName) {
					case WHITE : {
						switch (trig.sensor.sensorType){
							case LEFTLIGHT: {value = " > sensorManager.leftWhiteThreshold"}
							case RIGHTLIGHT: {value = " > sensorManager.rightWhiteThreshold"}
							default: {value = " == Color.WHITE"}
						}
					}
					case BLACK : {
						switch (trig.sensor.sensorType){
							case LEFTLIGHT: {value = " > sensorManager.leftBlackThreshold"}
							case RIGHTLIGHT: {value = " > sensorManager.rightBlackThreshold"}
							default: {value = " == Color.BLACK"}
						}
					}
					case BLUE: {value = " == Color.BLUE"}
					case GREEN: {value = " == Color.GREEN"}
					case RED: {value = " == Color.RED"}
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
			value = toFlag(trig)
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
		
		return prebool + sensor + value
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
		AuxMethods.setMotorSpeed(leftMotor, SpeedLevel.''' + getSpeed(act.speed) + ''');
AuxMethods.setMotorSpeed(rightMotor, SpeedLevel.''' + getSpeed(act.speed) + ''');
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
				'''AuxMethods.waitMs(«act.duration»);
				'''						
			}
		}else if(act.turnDir != null){ //action is a turn
			switch (act.turnDir.dir) {
				case LEFT: {
					action = action + 
					'''AuxMethods.turnDegrees(false, «act.degr», leftMotor, rightMotor, sensorManager);
					'''
				}
				case RIGHT: {
					action = action + 
					'''AuxMethods.turnDegrees(true, «act.degr», leftMotor, rightMotor, sensorManager);
					'''
				}
				default: {
					return action = "error"
				}
			}
		}else if(act.op != null){ //action is arm operation
			switch (act.op.opType) {
				case UP: {
					action = '''armMotor.rotate(90);
					'''
				}
				default: {
					action = '''armMotor.rotate(-90);
					'''
				}
			}
		}else if(act.flag != null){ //action is update flag
			action = "parent." + act.flag.name
			if (act.bool.boolType == BoolType.TRUE){
				action = action + ''' = true;
				'''
			}else{
				action = action + '''= false;
				'''
			}
		}else if(act.sound != null){ //action is sound
			switch (act.sound.soundName) {
				case FANFARE: {
					action = '''Sound.beepSequenceUp();
					'''
				}
				default: {
					action = '''Sound.buzz();
					'''
				}
			}
		} else { //action is centralize 
			action = '''AuxMethods.centralize(sensorManager, leftMotor, rightMotor);
			'''
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
			return "MID"
		}
		switch (speed.speed) {
			case HIGH: {
				return "HIGH"
			}
			case LOW: {
				return "LOW"	
			}
			case MED:{
				return "MID"
			}
		}
	}
}

