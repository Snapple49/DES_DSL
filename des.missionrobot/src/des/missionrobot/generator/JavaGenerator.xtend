package des.missionrobot.generator

import des.missionrobot.robotDSL.Mission

class JavaGenerator {
	
	def static missionGenerator(Mission root){'''package root.«root.name»;
	
	import lejos.hardware.motor.EV3LargeRegulatedMotor;
	import lejos.hardware.motor.EV3MediumRegulatedMotor;
	import lejos.robotics.subsumption.Arbitrator;
	import lejos.robotics.subsumption.Behavior;
	import root.Mission;
	import root.SensorManager;
	
	public class «root.name» extends Mission {		
		//public static void main(String [] args){
		public MoveAndAvoidEdges(SensorManager sMgr, EV3LargeRegulatedMotor lMtr, EV3LargeRegulatedMotor rMtr, EV3MediumRegulatedMotor aMtr){
			super(sMgr, lMtr, rMtr, aMtr);
			
«FOR t : root.taskList»		behaviorMap.put(«t.prio», new «t.name»(leftMotor, rightMotor, armMotor, sMgr));«"\n"»«ENDFOR»
			
			
			Behavior[] behaviors = sortBehaviors(behaviorMap);
			arby = new Arbitrator(behaviors);
		}
	
		
	}
	'''}
	
	def static createSensorManager(){'''
	package root;
	
	import lejos.hardware.sensor.EV3ColorSensor;
	import lejos.hardware.sensor.EV3UltrasonicSensor;
	import lejos.hardware.sensor.NXTLightSensor;
	import lejos.robotics.SampleProvider;
	
	public class SensorManager extends Thread{
		
		public boolean running;
		
		private EV3ColorSensor colorSensor = null;
		private NXTLightSensor leftLight = null;
		private NXTLightSensor rightLight = null;
		private EV3UltrasonicSensor backUltrasonic = null;
		
		//master devices
		SampleProvider colorSampleProvider;
		SampleProvider leftLightSampleProvider;
		SampleProvider rightLightSampleProvider;
		SampleProvider backUltrasonicSampleProvider;
		float[] colorSamples;
		float[] leftLightSamples;
		float[] rightLightSamples;
		float[] backUltrasonicSamples;
		
		//slave devices
		float leftTouchSamples;
		float rightTouchSamples;
		float gyroSamples;
		float frontUltrasonicSamples;
		
		public SensorManager(EV3ColorSensor clS, NXTLightSensor lLi, NXTLightSensor rLi, EV3UltrasonicSensor bUs){
			this.colorSensor = clS;
			colorSampleProvider = colorSensor.getColorIDMode();
			colorSamples = new float[colorSampleProvider.sampleSize()];
			this.leftLight = lLi;
			leftLightSampleProvider = leftLight.getRedMode();
			leftLightSamples = new float[leftLightSampleProvider.sampleSize()];
			this.rightLight = rLi;
			rightLightSampleProvider = rightLight.getRedMode();
			rightLightSamples = new float[rightLightSampleProvider.sampleSize()];
			this.backUltrasonic = bUs;
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
		
		public float getLeftTouch(){
			return leftTouchSamples;
		}
	
		public float getRightTouch(){
			return rightTouchSamples;
		}
		
		public float getFrontUltrasonic(){
			return frontUltrasonicSamples;
		}
		
		public float getGyro(){
			return gyroSamples;
		}
		
		public void updateSlaveDevices(float[] values){
			leftTouchSamples = values[0];
			rightTouchSamples = values[1];
			frontUltrasonicSamples = values[2];
			gyroSamples = values[3];
		}
	}

	'''}
	
	def static createMission(){'''
	package root;
	
	import java.util.TreeMap;
	
	import lejos.hardware.motor.EV3LargeRegulatedMotor;
	import lejos.hardware.motor.EV3MediumRegulatedMotor;
	import lejos.robotics.subsumption.Arbitrator;
	import lejos.robotics.subsumption.Behavior;
	
	public class Mission {
		protected static TreeMap<Integer, Behavior> behaviorMap = new TreeMap<>(); 
		protected Arbitrator arby;
		protected static EV3LargeRegulatedMotor leftMotor = null;
		protected static EV3LargeRegulatedMotor rightMotor = null;
		protected static EV3MediumRegulatedMotor armMotor = null;
		protected SensorManager sensorManager;
		
		public Mission(SensorManager sMgr, EV3LargeRegulatedMotor lMtr, EV3LargeRegulatedMotor rMtr, EV3MediumRegulatedMotor aMtr){
			leftMotor = lMtr;
			rightMotor = rMtr;
			armMotor = aMtr;
			sensorManager = sMgr;
		}
		
		public void RunArbitrator(){
			arby.go();
		}
		
		public static Behavior[] sortBehaviors(TreeMap<Integer, Behavior> behaviorsToSort){
			
			Behavior[] behaviors = new Behavior[behaviorsToSort.keySet().size()];			
			Object[] temp = behaviorsToSort.values().toArray();
			for (int i = 0; i < behaviors.length; i++) {
				behaviors[i] = (Behavior) temp[i];
			}
			return behaviors;
		}
	}'''	
	}

	def static createAuxMethods(){'''
	package root;
	
	import lejos.hardware.motor.EV3LargeRegulatedMotor;
	
	public class AuxMethods {
	
		static public void waitMs(int waitTime) {
			long startTime = System.currentTimeMillis();
			long curTime = startTime;
			while(curTime < startTime + waitTime){
				curTime = System.currentTimeMillis();
				Thread.yield();
			}
		}
		
		public static void clearScreen(){
			for (int i = 0; i < 10; i++) {
				System.out.println("");
			}
		}
		
		static public void turnDegrees(boolean turnRight, int turnDeg, EV3LargeRegulatedMotor leftMotor, EV3LargeRegulatedMotor rightMotor){
			leftMotor.stop(true);
			rightMotor.stop();
			if(turnRight){
				leftMotor.forward();
				rightMotor.backward();			
			}else{
				rightMotor.forward();
				leftMotor.backward();
			}
			waitMs(turnDeg);
			rightMotor.stop(true);
			leftMotor.stop();
		}
		
		static public void centralize(SensorManager sMgr, EV3LargeRegulatedMotor lMtr, EV3LargeRegulatedMotor rMtr){
			
		}
		
	}'''
		
	}

	def static createAlfred(){'''
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
		
	}'''}

	def static createMasterBruce(){'''
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
	}'''}

	def static createSensorUpdater(){'''package root;
	
	import java.io.IOException;
	import java.util.Arrays;
	
	import lejos.hardware.Sound;
	
	public class SensorUpdater extends Thread{
	
		private BTConReader reader;
		private SensorManager sMgr;
		private boolean running = false;
		private float[] floats = {0.0f, 0.0f, 0.0f, 0.0f};
		private String readValue;
	
	
		public SensorUpdater(SensorManager sM, BTConReader rdr){
			this.sMgr = sM;
			this.reader = rdr;
		}
	
		@Override
		public void run(){
			running = true;
			while(running){
				try {
					Thread.yield();
					readValue = reader.readThatLine();
					System.out.println(readValue);
					floats = parseFloats(readValue);
					sMgr.updateSlaveDevices(floats);
				} catch (IOException e) {
					e.printStackTrace();
					Sound.buzz();
					return;
				}
			}
		}
	
		public float[] parseFloats(String s){
			if(!s.isEmpty()){			
				String[] strings = s.split(" ");
				float[] floats = new float[strings.length];
				for (int i = 0; i < strings.length; i++){
					floats[i] = Float.parseFloat(strings[i]);
					System.out.println(Arrays.toString(floats));
				}
			}
			return floats;
		}
	
	}'''}

	def static createSlaveSensorManager(){'''package root;
	
	import java.io.PrintWriter;
	import java.util.Arrays;
	
	import lejos.hardware.sensor.EV3GyroSensor;
	import lejos.hardware.sensor.EV3TouchSensor;
	import lejos.hardware.sensor.EV3UltrasonicSensor;
	import lejos.robotics.SampleProvider;
	
	public class SlaveSensorManager extends Thread{
		
		private PrintWriter writer;
		private EV3UltrasonicSensor frontUltrasonic = null;
		private EV3TouchSensor leftTouch = null;
		private EV3TouchSensor rightTouch = null;
		private EV3GyroSensor gyroSensor = null;
		private int period;
		private boolean running = false;
		SampleProvider gyroSampleProvider;
		SampleProvider leftBumperSampleProvider;
		SampleProvider rightBumperSampleProvider;
		SampleProvider frontUltrasonicSampleProvider;
		float[] gyroSamples;
		float[] leftBumperSamples;
		float[] rightBumperSamples;
		float[] frontUltrasonicSamples;
		float[] arrayToSend;
		
		public SlaveSensorManager(PrintWriter writer, EV3UltrasonicSensor frontU, EV3TouchSensor leftT, EV3TouchSensor rightT, EV3GyroSensor gyroS, int period){
			this.writer = writer;
			this.frontUltrasonic = frontU;
			frontUltrasonicSampleProvider = frontUltrasonic.getDistanceMode();
			frontUltrasonicSamples = new float[frontUltrasonicSampleProvider.sampleSize()];
			this.leftTouch = leftT;
			leftBumperSampleProvider = leftTouch.getTouchMode();
			leftBumperSamples = new float[leftBumperSampleProvider.sampleSize()];
			this.rightTouch = rightT;
			rightBumperSampleProvider = rightTouch.getTouchMode();
			rightBumperSamples = new float[rightBumperSampleProvider.sampleSize()];
			this.gyroSensor = gyroS;
			gyroSampleProvider = gyroSensor.getAngleMode();
			gyroSamples = new float[gyroSampleProvider.sampleSize()];
			this.period = period;
		}
		
		public void run(){
			running = true;
			while(running){
				arrayToSend = readValues();
				System.out.println(Arrays.toString(arrayToSend));
				this.transmit(serializeFloats(arrayToSend));
				waitMs(period);
			}
		}
		
		public void waitMs(int waitTime) {
			long startTime = System.currentTimeMillis();
			long curTime = startTime;
			while(curTime < startTime + waitTime){
				curTime = System.currentTimeMillis();
				Thread.yield();
			}
		}
		
		public void transmit(String s){
			if(s != null){
				writer.println(s);
				writer.flush();
			}
		}
		
		public float[] readValues(){
			frontUltrasonic.fetchSample(frontUltrasonicSamples, 0);
			leftTouch.fetchSample(leftBumperSamples, 0);
			rightTouch.fetchSample(rightBumperSamples, 0);
			gyroSensor.fetchSample(gyroSamples, 0);
			float[] floats = {leftBumperSamples[0], rightBumperSamples[0], frontUltrasonicSamples[0], gyroSamples[0]};
			return floats;
		}
		
		public String serializeFloats(float[] floats){
			String s = Float.toString(floats[0]);
			for (int i = 1; i < floats.length; i++){
				s = s + " " + Float.toString(floats[i]);
			}
			return s;
		}
		
	}'''}
	
	def static createBTConReader(){'''package root;
	
	import java.io.DataInputStream;
	import java.io.IOException;
	import java.io.InputStream;
	import java.util.Arrays;
	
	public class BTConReader extends DataInputStream{
		
		private String string;
		private int maxLen = 128;
		private byte[] bytes;
		private char[] chars;
		private int actualLen;
		
		public BTConReader(InputStream in) {
			super(in);
			bytes = new byte[maxLen];
		}
		
		public String readThatLine() throws IOException{
			actualLen = in.read(bytes, 0, maxLen);
			chars = new char[actualLen];
			int i = 0;
			while(bytes[i] != '\n' && i < actualLen){
				chars[i] = (char) bytes[i];
				i++;
			}
			chars = Arrays.copyOf(chars, i);
			string = new String(chars);
			chars = new char[maxLen];
			return string;
		}
	}'''}
}