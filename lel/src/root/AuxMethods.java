package root;
	
	import lejos.hardware.motor.EV3LargeRegulatedMotor;
	import lejos.robotics.Color;
	
	public class AuxMethods {
	
		static public void waitMs(int waitTime) {
			long startTime = System.currentTimeMillis();
			long curTime = startTime;
			while(curTime < startTime + waitTime){
				curTime = System.currentTimeMillis();
				Thread.yield();
			}
		}
		
		public static void clearScreen(){
			for (int i = 0; i < 10; i++) {
				System.out.println("");
			}
		}
		
		static public void turnDegrees(boolean turnRight, int turnDeg, EV3LargeRegulatedMotor leftMotor, EV3LargeRegulatedMotor rightMotor){
			leftMotor.stop(true);
			rightMotor.stop();
			if(turnRight){
				leftMotor.forward();
				rightMotor.backward();			
			}else{
				rightMotor.forward();
				leftMotor.backward();
			}
			waitMs(turnDeg);
			rightMotor.stop(true);
			leftMotor.stop();
		}
		
		static public void centralize(SensorManager sMgr, EV3LargeRegulatedMotor lMtr, EV3LargeRegulatedMotor rMtr){
			lMtr.stop(true);
			rMtr.stop(true);
			lMtr.setSpeed(lMtr.getMaxSpeed()*0.3f);
			rMtr.setSpeed(rMtr.getMaxSpeed()*0.3f);
			while(!(sMgr.getLeftLight() < sMgr.blackThreshold && sMgr.getRightLight() < sMgr.blackThreshold && sMgr.getColor() != Color.BLACK)){
				
				while(sMgr.getLeftLight() > sMgr.blackThreshold){
					lMtr.backward();
				}
				waitMs(100);
				lMtr.stop();
				while(sMgr.getRightLight() > sMgr.blackThreshold){
					rMtr.backward();
				}
				waitMs(100);
				rMtr.stop();
				if(sMgr.getColor() == Color.BLACK){
					lMtr.forward();
					rMtr.forward();
					waitMs(100);
					lMtr.stop(true);
					rMtr.stop(true);
				}
			}
		}
		
	}