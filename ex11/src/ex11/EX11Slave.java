package ex11;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import lejos.hardware.Sound;
import lejos.hardware.ev3.LocalEV3;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.remote.nxt.BTConnector;
import lejos.remote.nxt.NXTConnection;
import lejos.robotics.subsumption.Arbitrator;
import lejos.robotics.subsumption.Behavior;

public class EX11Slave {
	/* ============= Made by Oliver Stein 4846524 and Albin Ohlsson 4846060 ============= */
	private static HashMap<String, Boolean> colorsFound;

	private static BTConnector connector;
	private static NXTConnection connection;
	private static PrintWriter writer;
	private static DataInputStream reader;
	private static int readValue;

	// create the sensor and motor objects
	static EV3UltrasonicSensor distanceSensor;
	static EV3LargeRegulatedMotor leftMotor, rightMotor;
	static EV3ColorSensor colorSensor;
	static EV3TouchSensor leftBmpr, rightBmpr;

	public static void main(String [] args){

		//initialize all sensors and motors with corresponding ports
		leftMotor = new EV3LargeRegulatedMotor(MotorPort.A);
		rightMotor = new EV3LargeRegulatedMotor(MotorPort.D);
		distanceSensor = new EV3UltrasonicSensor(LocalEV3.get().getPort("S3"));
		colorSensor = new EV3ColorSensor(LocalEV3.get().getPort("S2"));
		leftBmpr = new EV3TouchSensor(LocalEV3.get().getPort("S1"));
		rightBmpr = new EV3TouchSensor(LocalEV3.get().getPort("S4"));

		//rediscover communication
		connector = new BTConnector();
		connection = connector.waitForConnection(60000, NXTConnection.RAW);
		writer = new PrintWriter(connection.openOutputStream());
		reader = connection.openDataInputStream();
		
		try {
			readValue = (int)reader.readByte();
		} catch (IOException e) {
			Sound.beepSequence();			
		}

		if(readValue == 1){
			Sound.beepSequenceUp();
			writer.write(1);
			writer.flush();
		}
	

		//both robots are now communicating

		colorsFound = new HashMap<>();
		colorsFound.put("Red", false);
		colorsFound.put("Yellow", false);
		colorsFound.put("Blue", false);


	

		MessageListener listener = new MessageListener(reader, colorsFound);
		listener.start();

		//create the behaviors, providing the motor and sensor objects
		Behavior b1 = new Move(leftMotor, rightMotor, colorsFound);
		Behavior b2 = new EdgeAvoider(colorSensor, leftMotor, rightMotor);
		Behavior b3 = new BumperAvoider(leftBmpr, rightBmpr, leftMotor, rightMotor);
		Behavior b4 = new UltrasonicAvoider(distanceSensor, leftMotor, rightMotor);
		Behavior b5 = new ColorFound(leftMotor, leftMotor, colorSensor, writer, colorsFound);
		Behavior b6 = new FinishedState(leftMotor, rightMotor, colorsFound);

		//create and initialize the arbitrator with the behavior array, and run it
		Behavior [] behaviors = {b1, b5, b2, b3, b4, b6};
		Arbitrator arby = new Arbitrator(behaviors);
		arby.go();
	}
}