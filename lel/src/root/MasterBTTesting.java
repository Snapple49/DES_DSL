package root;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import lejos.hardware.Sound;
import lejos.hardware.ev3.LocalEV3;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.hardware.sensor.NXTLightSensor;
import lejos.remote.nxt.BTConnector;
import lejos.remote.nxt.NXTConnection;

public class MasterBTTesting {
	private static String readVal;
	private static BufferedReader reader;
	private static PrintWriter writer;
	
	private static SensorManager sm;
	private static SensorUpdater su;
	private static EV3ColorSensor color;
	private static NXTLightSensor llight;
	private static NXTLightSensor rlight;
	private static EV3UltrasonicSensor bultrasonic;
	
	private static int setUpCommMaster(PrintWriter writer, BufferedReader reader){
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
		System.out.println("Request sent");
		
		reader = new BufferedReader(new InputStreamReader(connection.openInputStream()));
		
		
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
		int retval = setUpCommMaster(writer, reader);
		while(retval != 1){
			retval = setUpCommMaster(writer, reader);
		}
		llight = new NXTLightSensor(SensorPort.S1);
		rlight = new NXTLightSensor(SensorPort.S2);
		bultrasonic = new EV3UltrasonicSensor(SensorPort.S3);
		color = new EV3ColorSensor(SensorPort.S4);
		
		sm = new SensorManager(color, llight, rlight, bultrasonic);
		sm.start();
		System.out.println("Sensormanager up");
		
		su = new SensorUpdater(sm, reader);
		su.start();
		System.out.println("Sensorupdater up");
		
		while(true){
			
		}
	}
}
