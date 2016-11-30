package des.missionrobot.generator

import des.missionrobot.robotDSL.Mission
import des.missionrobot.robotDSL.Task

class JavaGenerator {
	def static arbitratorMain(Mission root){'''
package lel;
import java.util.TreeMap;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.motor.EV3MediumRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3GyroSensor;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.hardware.sensor.NXTLightSensor;
import lejos.robotics.subsumption.Arbitrator;
import lejos.robotics.subsumption.Behavior;

public class «root.name» {
	
	private static TreeMap<Integer, Behavior> behaviorMap = new TreeMap<>(); 
	
	//devices
	private static EV3LargeRegulatedMotor leftMotor = null;
	private static EV3LargeRegulatedMotor rightMotor = null;
	private static EV3MediumRegulatedMotor armMotor = null;
	private static EV3ColorSensor colorSensor = null;
	private static NXTLightSensor leftLight = null;
	private static NXTLightSensor rightLight = null;
	private static EV3UltrasonicSensor backUltrasonic = null;
	private static EV3UltrasonicSensor frontUltrasonic = null;
	private static EV3TouchSensor leftTouch = null;
	private static EV3TouchSensor rightTouch = null;
	private static EV3GyroSensor gyroSensor = null;
	
	static SensorManager sMgr;
	
	public static void main(String [] args){
		
		leftMotor = new EV3LargeRegulatedMotor(MotorPort.A);
		rightMotor = new EV3LargeRegulatedMotor(MotorPort.B);
		armMotor = new EV3MediumRegulatedMotor(MotorPort.C);
		leftLight = new NXTLightSensor(SensorPort.S1);
		rightLight = new NXTLightSensor(SensorPort.S2);
		backUltrasonic = new EV3UltrasonicSensor(SensorPort.S3);
		colorSensor = new EV3ColorSensor(SensorPort.S4);
		
		sMgr = new SensorManager(colorSensor, leftLight, rightLight, backUltrasonic);
		sMgr.start();
		
«FOR t : root.taskList»		behaviorMap.put(«t.prio», new «t.name»(leftMotor, rightMotor, armMotor, sMgr));«"\n"»«ENDFOR»
		Arbitrator arbitrator = new Arbitrator(sortBehaviors(behaviorMap));
		arbitrator.go();
	}

	private static Behavior[] sortBehaviors(TreeMap<Integer, Behavior> behaviorsToSort){
		
		Behavior[] behaviors = new Behavior[behaviorsToSort.keySet().size()];			
		Object[] temp = behaviorsToSort.values().toArray();
		for (int i = 0; i < behaviors.length; i++) {
			behaviors[i] = (Behavior) temp[i];
		}
		return behaviors;
	}
}

'''
	}
	
	def static sensorManager(){'''
	package lel;
	
	import lejos.hardware.port.Port;
	import lejos.hardware.port.SensorPort;
	import lejos.hardware.sensor.EV3ColorSensor;
	import lejos.hardware.sensor.EV3GyroSensor;
	import lejos.hardware.sensor.EV3TouchSensor;
	import lejos.hardware.sensor.EV3UltrasonicSensor;
	import lejos.hardware.sensor.NXTLightSensor;
	import lejos.robotics.Color;
	import lejos.robotics.SampleProvider;
	
	public class SensorManager extends Thread{
		
		public boolean running;
		
		private static EV3ColorSensor colorSensor = null;
		private static NXTLightSensor leftLight = null;
		private static NXTLightSensor rightLight = null;
		private static EV3UltrasonicSensor backUltrasonic = null;
		private static EV3UltrasonicSensor frontUltrasonic = null;
		private static EV3TouchSensor leftTouch = null;
		private static EV3TouchSensor rightTouch = null;
		private static EV3GyroSensor gyroSensor = null;
	
		SampleProvider colorSampleProvider;
		SampleProvider leftLightSampleProvider;
		SampleProvider rightLightSampleProvider;
		SampleProvider backUltrasonicSampleProvider;
		float[] colorSamples;
		float[] leftLightSamples;
		float[] rightLightSamples;
		float[] backUltrasonicSamples;
		
		public SensorManager(EV3ColorSensor colorSensor, NXTLightSensor leftLight, NXTLightSensor rightLight, EV3UltrasonicSensor backUltrasonic){
			this.colorSensor = colorSensor;
			colorSampleProvider = colorSensor.getColorIDMode();
			colorSamples = new float[colorSampleProvider.sampleSize()];
			this.leftLight = leftLight;
			leftLightSampleProvider = leftLight.getRedMode();
			leftLightSamples = new float[leftLightSampleProvider.sampleSize()];
			this.rightLight = rightLight;
			rightLightSampleProvider = rightLight.getRedMode();
			rightLightSamples = new float[rightLightSampleProvider.sampleSize()];
			this.backUltrasonic = backUltrasonic;
			backUltrasonicSampleProvider = backUltrasonic.getDistanceMode();
			backUltrasonicSamples = new float[backUltrasonicSampleProvider.sampleSize()];
		}
		
		@Override
		public void run() {
			running = true;
			while(running){
				colorSampleProvider.fetchSample(colorSamples, 0);
				leftLightSampleProvider.fetchSample(leftLightSamples, 0);
				rightLightSampleProvider.fetchSample(rightLightSamples, 0);
				backUltrasonicSampleProvider.fetchSample(backUltrasonicSamples, 0);
			}
		}
		
		public float getColor(){
			return colorSamples[0];
		}
	
		public float getLeftLight(){
			return leftLightSamples[0];
		}
		
		public float getRightLight(){
			return rightLightSamples[0];
		}
		
		public float getBackUltrasonic(){
			return backUltrasonicSamples[0];
		}
	}
	'''}
	
}