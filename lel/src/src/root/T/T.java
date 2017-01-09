package root.T;
	
	import lejos.hardware.motor.EV3LargeRegulatedMotor;
	import lejos.hardware.motor.EV3MediumRegulatedMotor;
	import lejos.robotics.subsumption.Behavior;
	import root.BetterArbitrator;
	import root.Mission;
	import root.SensorManager;
	
	public class T extends Mission {
		
				
		public T(SensorManager sMgr, EV3LargeRegulatedMotor lMtr, EV3LargeRegulatedMotor rMtr, EV3MediumRegulatedMotor aMtr){
			super(sMgr, lMtr, rMtr, aMtr);
			
			behaviorMap.put(3, new Kaas(this, leftMotor, rightMotor, armMotor, sensorManager));
			behaviorMap.put(99, new Goal(this, leftMotor, rightMotor, armMotor, sensorManager));
			
			Behavior[] behaviors = sortBehaviors(behaviorMap);
			arby = new BetterArbitrator(behaviors);
		}
	
		
	}
