package root;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintWriter;

import lejos.hardware.Button;
import lejos.hardware.Sound;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3GyroSensor;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.remote.nxt.BTConnector;
import lejos.remote.nxt.NXTConnection;

public class Slave {

	private static EV3UltrasonicSensor frontUltrasonic = null;
	private static EV3TouchSensor leftTouch = null;
	private static EV3TouchSensor rightTouch = null;
	private static EV3GyroSensor gyroSensor = null;
	private static SlaveSensorManager slaveSensorManager;
	
	private static BTConnector connector;
	private static NXTConnection connection;
	private static PrintWriter writer;
	private static DataInputStream reader;
	private static String readValue;
	
	public static void main(String args[]){
		//rediscover communication
		connector = new BTConnector();
		connection = connector.waitForConnection(60000, NXTConnection.RAW);
		System.out.println("Connection received!");
		writer = new PrintWriter(connection.openOutputStream());
		reader = connection.openDataInputStream();
		System.out.println("Reader and writer up!");
		
		try {
			readValue = reader.readLine();
		} catch (IOException e) {
			Sound.buzz();			
		}

		if(readValue.equals("REQUEST:CONNECT")){
			Sound.beepSequenceUp();
			System.out.println("Val read:" + readValue);
			writer.println("ACK:CONNECT");
			writer.flush();
		}
		//both robots are now communicating
		
		frontUltrasonic = new EV3UltrasonicSensor(SensorPort.S3);
		leftTouch = new EV3TouchSensor(SensorPort.S1);
		rightTouch = new EV3TouchSensor(SensorPort.S2);
		gyroSensor = new EV3GyroSensor(SensorPort.S4);
			
		slaveSensorManager = new SlaveSensorManager(writer, frontUltrasonic, leftTouch, rightTouch, gyroSensor, 1000);
		slaveSensorManager.start();
		
		while(Button.ENTER.isUp()){
			Thread.yield();
		}
		
	}
	
}