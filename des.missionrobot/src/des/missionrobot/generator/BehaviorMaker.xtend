package des.missionrobot.generator

import des.missionrobot.robotDSL.Trigger
import des.missionrobot.robotDSL.Action
import des.missionrobot.robotDSL.Task
import des.missionrobot.robotDSL.Sensor

class BehaviorMaker {
	
	
	
	static String sensor
	static String value
	
	def static makeBehaviorClass(Task t){'''
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.motor.EV3MediumRegulatedMotor;
/*import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3GyroSensor;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.hardware.sensor.NXTLightSensor;
import lejos.robotics.subsumption.Behavior;*/

public class MoveTest implements Behavior{

	//devices
	private static EV3LargeRegulatedMotor leftMotor;
	private static EV3LargeRegulatedMotor rightMotor;
	private static EV3MediumRegulatedMotor armMotor;
	/*private static EV3ColorSensor colorSensor;
	private static NXTLightSensor leftLight;
	private static NXTLightSensor rightLight;
	private static EV3UltrasonicSensor backUltrasonic;
	private static EV3UltrasonicSensor frontUltrasonic;
	private static EV3TouchSensor leftTouch;
	private static EV3TouchSensor rightTouch;
	private static EV3GyroSensor gyroSensor;*/
	
	//flags
	private boolean suppressed = false;
	
	public MoveTest(EV3LargeRegulatedMotor lMotor,
					EV3LargeRegulatedMotor rMotor,
					EV3MediumRegulatedMotor aMotor,
					/*EV3ColorSensor cSensor,
					NXTLightSensor lLight,
					NXTLightSensor rLight,
					EV3UltrasonicSensor bUltrasonic,
					EV3UltrasonicSensor fUltrasonic,
					EV3TouchSensor lTouch,
					EV3TouchSensor rTouch,
					EV3GyroSensor gSensor*/)
	{
		leftMotor = lMotor;
		rightMotor = rMotor;
		armMotor = aMotor;
		/*colorSensor = cSensor;
		leftLight = lLight;
		rightLight = rLight;
		backUltrasonic = bUltrasonic;
		frontUltrasonic = fUltrasonic;
		leftTouch = lTouch;
		rightTouch = rTouch;
		gyroSensor = gSensor;*/
	}
	
	@Override
	public boolean takeControl() {
		return («IF t.triggerList == null»true«ELSE»«FOR trig : t.triggerList»«toCondition(trig)»«ENDFOR»«ENDIF»);
	}

	@Override
	public void action() {
		suppressed = false;
		leftMotor.forward();
		rightMotor.forward();
		while(!suppressed){
			Thread.yield();
		}
	}

	@Override
	public void suppress() {
		leftMotor.stop(true);
		rightMotor.stop();
		suppressed = true;
	}
	

}
	'''
	}
	def static toCondition(Trigger trig){

		switch (trig.sensor) {
			case LEFTLIGHT: {
				sensor = "SensorManager.LeftLight"
			}
			case RIGHTLIGHT : {
				sensor = "SensorManager.RightLight"
			}
			case COLOR : {
				sensor = "SensorManager.Color"
			}
			case BACKUS :{
				sensor = "SensorManager.RearUS"
			}
			case FRONTUS: {
				sensor = ""
			}
			default : {
				sensor = ""
			}
		}
		
		switch (trig.color) {
			case BRIGHT : {
				value = " > 0.5"
			}
			case BLACK: {
				value = " == Color.BLACK" 
			}
			case BLUE: {
				value = " == Color.BLUE"
			}
			case DARK: {
				value = " < 0.5"
			}
			case GREEN: {
				value = " == Color.GREEN"
			}
			case RED: {
				value = " == Color.RED"
			}
			case WHITE: {
				value = " == Color.WHITE"
			}
			default : {
				value = ""
			}
			
		}
		/*
		switch (trig.dist.rangeBool) {
			case G: {
				value = " > " + trig.dist.distance
			}
			case L: {
				value = " < " + trig.dist.distance
			}
		}*/
		
		return sensor + value
	}
}

