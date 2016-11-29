package des.missionrobot.generator

import des.missionrobot.robotDSL.Mission
import des.missionrobot.robotDSL.Behavior

class JavaGenerator {
	def static arbitratorMain(Mission root){'''
	import java.io.DataInputStream;
	import java.io.IOException;
	import java.io.PrintWriter;
	import java.util.HashMap;
	
	import lejos.hardware.BrickFinder;
	import lejos.hardware.Sound;
	import lejos.hardware.ev3.LocalEV3;
	import lejos.hardware.motor.EV3LargeRegulatedMotor;
	import lejos.hardware.port.MotorPort;
	import lejos.hardware.sensor.EV3ColorSensor;
	import lejos.hardware.sensor.EV3TouchSensor;
	import lejos.hardware.sensor.EV3UltrasonicSensor;
	import lejos.remote.nxt.BTConnector;
	import lejos.remote.nxt.NXTConnection;
	import lejos.robotics.subsumption.*;
	
	
	public class «root.name» {
		/* ============= Made by Oliver Stein 4846524 and Albin Ohlsson 4846060 ============= */
		«FOR d : root.deviceList»static «Auxiliary.deviceName(d)»;«"\n"» «ENDFOR»
		// create the sensor and motor objects
		
		/*static EV3UltrasonicSensor distanceSensor;
		static EV3LargeRegulatedMotor leftMotor, rightMotor;
		static EV3ColorSensor colorSensor;
		static EV3TouchSensor leftBmpr, rightBmpr;*/
	
		public static void main(String [] args){
	
			//initialize all sensors and motors with corresponding ports
			«FOR d : root.deviceList»«Auxiliary.makeDevice(d)»«ENDFOR»
			
			/*leftMotor = new EV3LargeRegulatedMotor(LocalEV3.get().getPort("A"));
			rightMotor = new EV3LargeRegulatedMotor(LocalEV3.get().getPort("D"));
			distanceSensor = new EV3UltrasonicSensor(LocalEV3.get().getPort("S3"));
			colorSensor = new EV3ColorSensor(LocalEV3.get().getPort("S2"));
			leftBmpr = new EV3TouchSensor(LocalEV3.get().getPort("S1"));
			rightBmpr = new EV3TouchSensor(LocalEV3.get().getPort("S4"));*/
	
	
			//create the behaviors, providing the motor and sensor objects
			
			«FOR b : root.behaviorList»«Auxiliary.makeBehavior(b)»«ENDFOR»
			
			/*
			Behavior b1 = new Move(leftMotor, rightMotor);
			Behavior b2 = new EdgeAvoider(colorSensor, leftMotor, rightMotor);
			Behavior b3 = new BumperAvoider(leftBmpr, rightBmpr, leftMotor, rightMotor);
			Behavior b4 = new UltrasonicAvoider(distanceSensor, leftMotor, rightMotor);
			Behavior b5 = new ColorFound(leftMotor, leftMotor, colorSensor);
			Behavior b6 = new FinishedState(leftMotor, rightMotor);
			*/
			//create and initialize the arbitrator with the behavior array, and run it
			Behavior [] behaviors = {b1, b5, b2, b3, b4, b6};
			Arbitrator arby = new Arbitrator(behaviors);
			arby.go();
		}
	}
	
	'''}
}