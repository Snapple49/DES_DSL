package root.FindLakes;
	
	import lejos.hardware.motor.EV3LargeRegulatedMotor;
	import lejos.hardware.motor.EV3MediumRegulatedMotor;
	import lejos.robotics.subsumption.Behavior;
	import root.BetterArbitrator;
	import root.Mission;
	import root.SensorManager;
	
	public class FindLakes extends Mission {
		
		public boolean RedFound = false;
		public boolean GreenFound = false;
		public boolean BlueFound = false;
				
		public FindLakes(SensorManager sMgr, EV3LargeRegulatedMotor lMtr, EV3LargeRegulatedMotor rMtr, EV3MediumRegulatedMotor aMtr){
			super(sMgr, lMtr, rMtr, aMtr);
			
			behaviorMap.put(1, new MoveAround(this, leftMotor, rightMotor, armMotor, sensorManager));
			behaviorMap.put(91, new AvoidLeftEdge(this, leftMotor, rightMotor, armMotor, sensorManager));
			behaviorMap.put(90, new AvoidRightEdge(this, leftMotor, rightMotor, armMotor, sensorManager));
			behaviorMap.put(98, new AvoidEdgeFront(this, leftMotor, rightMotor, armMotor, sensorManager));
			behaviorMap.put(85, new AvoidEdgeBehind(this, leftMotor, rightMotor, armMotor, sensorManager));
			behaviorMap.put(20, new SampleGreenLake(this, leftMotor, rightMotor, armMotor, sensorManager));
			behaviorMap.put(21, new SampleBlueLake(this, leftMotor, rightMotor, armMotor, sensorManager));
			behaviorMap.put(22, new SampleRedLake(this, leftMotor, rightMotor, armMotor, sensorManager));
			behaviorMap.put(75, new AvoidFrontCollision(this, leftMotor, rightMotor, armMotor, sensorManager));
			behaviorMap.put(99, new root.FindLakes.Goal(this, leftMotor, rightMotor, armMotor, sensorManager));
			
			Behavior[] behaviors = sortBehaviors(behaviorMap);
			arby = new BetterArbitrator(behaviors);
		}
	
		
	}
