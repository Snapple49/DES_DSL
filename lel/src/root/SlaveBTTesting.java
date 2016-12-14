package root;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

import lejos.hardware.Sound;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3GyroSensor;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.remote.nxt.BTConnector;
import lejos.remote.nxt.NXTConnection;
import lejos.utility.Delay;

public class SlaveBTTesting {
	
	private static String readValue;
	private static BTConReader reader;
	private static PrintWriter writer;
	
	private static EV3UltrasonicSensor frontU;
	private static EV3TouchSensor leftT;
	private static EV3TouchSensor rightT;
	private static EV3GyroSensor gyroS;
	private static SlaveSensorManager ssm;
	
	
	
	private static int setUpCommSlave(){
		int success = 0;
		BTConnector connector = new BTConnector();
		NXTConnection connection = connector.waitForConnection(60000, NXTConnection.RAW);
		System.out.println("Connection received!");
		writer = new PrintWriter(connection.openOutputStream());
		reader = new BTConReader(connection.openInputStream());
		System.out.println("Reader and writer up!");
		
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
	
	public static void main(String[] args) {
		int retval = setUpCommSlave();
		
		frontU = new EV3UltrasonicSensor(SensorPort.S3);
		leftT = new EV3TouchSensor(SensorPort.S1);
		rightT = new EV3TouchSensor(SensorPort.S2);
		gyroS = new EV3GyroSensor(SensorPort.S4);
		
		ssm = new SlaveSensorManager(writer, frontU, leftT, rightT, gyroS, 1000);
		ssm.start();
		System.out.println("Ssm started!");
		
		while(true){
			System.out.println(Arrays.toString(ssm.readValues()));
			Delay.msDelay(1000);
		}
		
	}
	
}
