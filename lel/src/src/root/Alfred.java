package root;

import java.io.IOException;
import java.io.PrintWriter;

import lejos.hardware.Sound;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3GyroSensor;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.remote.nxt.BTConnector;
import lejos.remote.nxt.NXTConnection;

public class Alfred {

	private static EV3UltrasonicSensor frontUltrasonic = null;
	private static EV3TouchSensor leftTouch = null;
	private static EV3TouchSensor rightTouch = null;
	private static EV3GyroSensor gyroSensor = null;
	private static SlaveSensorManager slaveSensorManager;
	
	private static NXTConnection connection;	
	private static PrintWriter writer;
	private static BTConReader reader;
	private static String readValue;
	
	private static int setUpCommSlave(){
		int success = 0;
		BTConnector connector = new BTConnector();
		connection = connector.waitForConnection(60000, NXTConnection.RAW);
		writer = new PrintWriter(connection.openOutputStream());
		reader = new BTConReader(connection.openInputStream());
		
		try {
			readValue = reader.readThatLine();
		} catch (IOException e) {
			Sound.buzz();			
		}

		if(readValue.equals("REQUEST:CONNECT")){
			Sound.beepSequenceUp();
			writer.println("ACK:CONNECT");
			writer.flush();
			System.out.println("Communication setup!");
			success = 1;
		}
		return success;
	}
	
	public static void main(String args[]){
		int retval = setUpCommSlave();
		if(retval != 1){
			System.out.println("Something went wrong comms, abort!");
			return;
		}
		
		frontUltrasonic = new EV3UltrasonicSensor(SensorPort.S3);
		leftTouch = new EV3TouchSensor(SensorPort.S1);
		rightTouch = new EV3TouchSensor(SensorPort.S2);
		gyroSensor = new EV3GyroSensor(SensorPort.S4);
			
		slaveSensorManager = new SlaveSensorManager(writer, frontUltrasonic, leftTouch, rightTouch, gyroSensor, 100);
		slaveSensorManager.start();
		System.out.println("SSm started");
		
		while(true){
			Thread.yield();
		}
		
	}
	
}