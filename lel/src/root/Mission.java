package root;
	
	import java.util.TreeMap;
	
	import lejos.hardware.motor.EV3LargeRegulatedMotor;
	import lejos.hardware.motor.EV3MediumRegulatedMotor;
	import lejos.robotics.subsumption.Behavior;
	
	public class Mission {
		protected static TreeMap<Integer, Behavior> behaviorMap = new TreeMap<>(); 
		protected BetterArbitrator arby;
		protected static EV3LargeRegulatedMotor leftMotor = null;
		protected static EV3LargeRegulatedMotor rightMotor = null;
		protected static EV3MediumRegulatedMotor armMotor = null;
		protected SensorManager sensorManager;
		
		public Mission(SensorManager sMgr, EV3LargeRegulatedMotor lMtr, EV3LargeRegulatedMotor rMtr, EV3MediumRegulatedMotor aMtr){
			leftMotor = lMtr;
			rightMotor = rMtr;
			armMotor = aMtr;
			sensorManager = sMgr;
		}
		
		public void RunArbitrator(){
			arby.go();
		}
		
		public void StopArbitrator(){
			arby.stop();
		}
		
		public static Behavior[] sortBehaviors(TreeMap<Integer, Behavior> behaviorsToSort){
			
			Behavior[] behaviors = new Behavior[behaviorsToSort.keySet().size()];			
			Object[] temp = behaviorsToSort.values().toArray();
			for (int i = 0; i < behaviors.length; i++) {
				behaviors[i] = (Behavior) temp[i];
			}
			return behaviors;
		}
	}