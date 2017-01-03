package root;

import java.io.IOException;
import java.io.PrintWriter;

import lejos.hardware.Button;
import lejos.hardware.Sound;
import lejos.hardware.ev3.LocalEV3;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.motor.EV3MediumRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.hardware.sensor.NXTLightSensor;
import lejos.remote.nxt.BTConnector;
import lejos.remote.nxt.NXTConnection;
import lejos.utility.Delay;
import root.MoveAndAvoidEdges.*;

public class MasterBruce {
		
	//devices
	private static EV3LargeRegulatedMotor leftMotor = null;
	private static EV3LargeRegulatedMotor rightMotor = null;
	private static EV3MediumRegulatedMotor armMotor = null;
	private static EV3ColorSensor colorSensor = null;
	private static NXTLightSensor leftLight = null;
	private static NXTLightSensor rightLight = null;
	private static EV3UltrasonicSensor backUltrasonic = null;
	private static SensorUpdater sensorUpdater;
	private static SensorManager sensorManager;
	
	//comms
	private static PrintWriter writer;
	private static BTConReader reader;
	private static NXTConnection connection;
	private static String readVal;
	
	private static int setupCommMaster(){
		int success = 0;
		String self = LocalEV3.get().getName();
		String other;
		switch (self) {
		case "Rover5":
			other = "Rover6";
			break;
		case "Rover7":
			other = "Rover8";
			break;
		default:
			other = "Rover10";
			break;
		}
		BTConnector connector = new BTConnector();
		connection = connector.connect(other, NXTConnection.RAW);
		writer = new PrintWriter(connection.openOutputStream());
		writer.println("REQUEST:CONNECT");
		writer.flush();
		reader = new BTConReader(connection.openInputStream());
		
		try {
			readVal = reader.readThatLine();
		}
		catch (IOException e) {
			Sound.buzz();
			e.printStackTrace();
		}
		if(readVal.equals("ACK:CONNECT")){
			success = 1;
			Sound.beepSequenceUp();
		}else{
			Sound.beepSequence();
		}	
		
		return success;
	}
	
	public static void main(String[] args) {
		int retval = setupCommMaster();
		if(retval != 1){
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
		AuxMethods.clearScreen();
		while(true){
			Delay.msDelay(100);
			if(Button.ENTER.isDown()){
				m1.RunArbitrator();				
			}
		}
	}
}