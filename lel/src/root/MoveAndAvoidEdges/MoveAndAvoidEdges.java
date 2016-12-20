package root.MoveAndAvoidEdges;
	
	import lejos.hardware.motor.EV3LargeRegulatedMotor;
	import lejos.hardware.motor.EV3MediumRegulatedMotor;
	import lejos.robotics.subsumption.Arbitrator;
	import lejos.robotics.subsumption.Behavior;
	import root.Mission;
	import root.SensorManager;
	
	public class MoveAndAvoidEdges extends Mission {
		
		public boolean RedFound = false;
				
		public MoveAndAvoidEdges(SensorManager sMgr, EV3LargeRegulatedMotor lMtr, EV3LargeRegulatedMotor rMtr, EV3MediumRegulatedMotor aMtr){
			super(sMgr, lMtr, rMtr, aMtr);
			
			behaviorMap.put(1, new MoveAround(this, leftMotor, rightMotor, armMotor, sMgr));
			behaviorMap.put(91, new AvoidLeftEdge(this, leftMotor, rightMotor, armMotor, sMgr));
			behaviorMap.put(90, new AvoidRightEdge(this, leftMotor, rightMotor, armMotor, sMgr));
			behaviorMap.put(10, new SampleGreen(this, leftMotor, rightMotor, armMotor, sMgr));
			behaviorMap.put(80, new AvoidEdgeFront(this, leftMotor, rightMotor, armMotor, sMgr));
			behaviorMap.put(85, new AvoidEdgeBehind(this, leftMotor, rightMotor, armMotor, sMgr));
			
			Behavior[] behaviors = sortBehaviors(behaviorMap);
			arby = new Arbitrator(behaviors);
		}
	
		
	}
