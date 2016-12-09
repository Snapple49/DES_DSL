package root;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.TreeMap;

import lejos.hardware.Button;
import lejos.hardware.Sound;
import lejos.hardware.ev3.EV3;
import lejos.hardware.ev3.LocalEV3;
import lejos.hardware.lcd.LCD;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.motor.EV3MediumRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3GyroSensor;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.hardware.sensor.NXTLightSensor;
import lejos.remote.nxt.BTConnector;
import lejos.remote.nxt.NXTConnection;
import lejos.robotics.subsumption.Behavior;
import lejos.utility.Delay;
import root.MoveAndAvoidEdges.*;

public class MasterBruce {
	
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
	private static SensorUpdater sensorUpdater;
	private static SensorManager sensorManager;
	private static String readVal;
	
	//comms
	private static PrintWriter writer;
	private static DataInputStream reader;
	
	private static void clearScreen(){
		for (int i = 0; i < 10; i++) {
			System.out.println("");
		}
	}
	
	private static int setupCommunication(PrintWriter writer, DataInputStream reader){
		int success = 0;
		String self = LocalEV3.get().getName();
		String other;
		switch (self) {
		case "Rover5":
			other = "Rover6";
			break;
		default:
			other = "Rover8";
			break;
		}
		BTConnector connector = new BTConnector();
		NXTConnection connection = connector.connect(other, NXTConnection.RAW);
		writer = new PrintWriter(connection.openOutputStream());
		writer.println("REQUEST:CONNECT");
		writer.flush();
		
		reader = connection.openDataInputStream();
		try {
			readVal = reader.readLine();
			switch (readVal) {
			case "ACK:CONNECT":
				success = 1;
				Sound.beepSequenceUp();
				System.out.println("Connection success!" + readVal);
				break;
			default:
				Sound.beepSequence();
				break;
			}
			
		} catch (IOException e) {
			Sound.buzz();
			e.printStackTrace();
		}
		
		return success;
	}
	
	public static void main(String[] args) {
		
		if(setupCommunication(writer, reader) != 1){
			System.out.println("Communication failed");
			return;
		}
		
		leftMotor = new EV3LargeRegulatedMotor(MotorPort.A);
		rightMotor = new EV3LargeRegulatedMotor(MotorPort.B);
		armMotor = new EV3MediumRegulatedMotor(MotorPort.C);
		leftLight = new NXTLightSensor(SensorPort.S1);
		rightLight = new NXTLightSensor(SensorPort.S2);
		backUltrasonic = new EV3UltrasonicSensor(SensorPort.S3);
		colorSensor = new EV3ColorSensor(SensorPort.S4);
		
		sensorManager = new SensorManager(colorSensor, leftLight, rightLight, backUltrasonic);
		sensorManager.start();
	
		sensorUpdater = new SensorUpdater(sensorManager, reader);
		sensorUpdater.start();
		
		Mission m1 = new MoveAndAvoidEdges(sensorManager, leftMotor, rightMotor, armMotor);
		clearScreen();
		while(true){
			//LCD.drawString("Hello, select stuff", 0, 0);
			//LCD.drawString("Mission " + m1.toString(), 0, 1);
			Delay.msDelay(100);
			if(Button.ENTER.isDown()){
				//m1.RunArbitrator();				
			}
			System.out.println("Left Touch is: " + sensorManager.getLeftTouch());
		}
	}
}
