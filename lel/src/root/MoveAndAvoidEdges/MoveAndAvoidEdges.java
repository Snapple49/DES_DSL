package root.MoveAndAvoidEdges;
	
	import lejos.hardware.motor.EV3LargeRegulatedMotor;
	import lejos.hardware.motor.EV3MediumRegulatedMotor;
	import lejos.robotics.subsumption.Arbitrator;
	import lejos.robotics.subsumption.Behavior;
	import root.Mission;
	import root.SensorManager;
	
	public class MoveAndAvoidEdges extends Mission {
		
		//flags
		public static boolean GreenFound;
		
		public MoveAndAvoidEdges(SensorManager sMgr, EV3LargeRegulatedMotor lMtr, EV3LargeRegulatedMotor rMtr, EV3MediumRegulatedMotor aMtr){
			super(sMgr, lMtr, rMtr, aMtr);
		behaviorMap.put(10, new SampleGreen(leftMotor, rightMotor, armMotor, sMgr));
		behaviorMap.put(1, new MoveAround(leftMotor, rightMotor, armMotor, sMgr));
		behaviorMap.put(91, new AvoidLeftEdge(leftMotor, rightMotor, armMotor, sMgr));
		behaviorMap.put(90, new AvoidRightEdge(leftMotor, rightMotor, armMotor, sMgr));
		behaviorMap.put(80, new AvoidEdgeFront(leftMotor, rightMotor, armMotor, sMgr));
		behaviorMap.put(85, new AvoidEdgeBehind(leftMotor, rightMotor, armMotor, sMgr));
			
			
			Behavior[] behaviors = sortBehaviors(behaviorMap);
			arby = new Arbitrator(behaviors);
		}
	
		
	}
