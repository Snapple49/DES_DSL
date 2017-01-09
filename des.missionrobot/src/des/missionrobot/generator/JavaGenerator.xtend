package des.missionrobot.generator

import des.missionrobot.robotDSL.Mission

class JavaGenerator {
	
	def static missionGenerator(Mission root){'''package root.«root.name»;
	
	import lejos.hardware.motor.EV3LargeRegulatedMotor;
	import lejos.hardware.motor.EV3MediumRegulatedMotor;
	import lejos.robotics.subsumption.Behavior;
	import root.BetterArbitrator;
	import root.Mission;
	import root.SensorManager;
	
	public class «root.name» extends Mission {
		
		«FOR f : root.flagsList»public boolean «f.name» = false;«"\n"»«ENDFOR»
				
		public «root.name»(SensorManager sMgr, EV3LargeRegulatedMotor lMtr, EV3LargeRegulatedMotor rMtr, EV3MediumRegulatedMotor aMtr){
			super(sMgr, lMtr, rMtr, aMtr);
			
			«FOR t : root.taskList»behaviorMap.put(«t.prio», new «t.name»(this, leftMotor, rightMotor, armMotor, sensorManager));«"\n"»«ENDFOR»
			behaviorMap.put(99, new root.«root.name».Goal(this, leftMotor, rightMotor, armMotor, sensorManager));
			
			Behavior[] behaviors = sortBehaviors(behaviorMap);
			arby = new BetterArbitrator(behaviors);
		}
	
		
	}
	'''}
	
}