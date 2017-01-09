package root;
			
			
			import lejos.hardware.Button;
	import lejos.hardware.ev3.EV3;
	import lejos.hardware.lcd.LCD;
			import lejos.hardware.motor.EV3LargeRegulatedMotor;
	import lejos.hardware.motor.EV3MediumRegulatedMotor;
	import lejos.hardware.port.Port;
	import lejos.hardware.port.SensorPort;
	import lejos.robotics.Color;
			
			public class AuxMethods {
				
				public enum SpeedLevel{
					HIGH,
					MID,
					LOW
				}
			
				static public void setMotorSpeed(EV3LargeRegulatedMotor mtr, SpeedLevel speed){
					switch (speed) {
					case HIGH:
						mtr.setSpeed(mtr.getMaxSpeed() * 0.5f);
						break;
					case MID:
						mtr.setSpeed(mtr.getMaxSpeed() * 0.3f);
						break;
					case LOW:
						mtr.setSpeed(mtr.getMaxSpeed() * 0.15f);
						break;
					}
				}
				
				static public void resetAll(EV3LargeRegulatedMotor lMtr, EV3LargeRegulatedMotor rMtr, EV3MediumRegulatedMotor aMtr, Mission mis){
					lMtr.stop(true);
					rMtr.stop(true);
					aMtr.stop(true);
					mis = null;
				}
				
				static public void waitMs(int waitTime) {
					long startTime = System.currentTimeMillis();
					long curTime = startTime;
					while(curTime < startTime + waitTime){
						curTime = System.currentTimeMillis();
						Thread.yield();
					}
				}
			
				static public void clearScreen(){
					for (int i = 0; i < 10; i++) {
						System.out.println("");
					}
					LCD.clear();
					LCD.clearDisplay();
				}
			
				static public boolean calibrate(SensorManager sm){
					boolean success = false;
					
					clearScreen();
					waitMs(1000);
					System.out.println("Put left light over white.");
					while(!Button.ENTER.isDown()){
					}
					sm.leftWhiteThreshold = sm.getLeftLight() - 0.02f;
					waitMs(500);
					System.out.println("Put right light over white.");
					while(!Button.ENTER.isDown()){
					}
					sm.rightWhiteThreshold = sm.getRightLight() - 0.02f;
					waitMs(500);
					System.out.println("Put left light over black.");
					while(!Button.ENTER.isDown()){
					}
					sm.leftBlackThreshold = sm.getLeftLight() + 0.02f;
					waitMs(500);
					System.out.println("Put right light over black.");
					while(!Button.ENTER.isDown()){
					}
					sm.rightBlackThreshold = sm.getRightLight() + 0.02f;
					waitMs(500);
					clearScreen();
					success = true;
			
					return success;
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
					rMtr.stop();
					setMotorSpeed(rMtr, SpeedLevel.LOW);
					setMotorSpeed(lMtr, SpeedLevel.LOW);
					while(!(sMgr.getLeftLight() < sMgr.leftBlackThreshold && sMgr.getRightLight() < sMgr.rightBlackThreshold && sMgr.getColor() != Color.BLACK)){
			
						while(sMgr.getLeftLight() > sMgr.leftBlackThreshold){
							lMtr.backward();
						}
						waitMs(100);
						lMtr.stop();
						while(sMgr.getRightLight() > sMgr.rightBlackThreshold){
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