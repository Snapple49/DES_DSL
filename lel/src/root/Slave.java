package root;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;

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
	private static BTConnector connector;
	private static NXTConnection connection;
	private static PrintWriter writer;
	private static DataInputStream reader;
	private static int readValue;
	
	public static void main(String args[]){
		frontUltrasonic = new EV3UltrasonicSensor(SensorPort.S3);
		leftTouch = new EV3TouchSensor(SensorPort.S1);
		rightTouch = new EV3TouchSensor(SensorPort.S2);
		gyroSensor = new EV3GyroSensor(SensorPort.S4);
		
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
		
		while(Button.ENTER.isUp()){
			
		}
		
	}
	
}