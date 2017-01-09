package des.missionrobot.generator

import des.missionrobot.robotDSL.Mission
import java.util.List

class Auxiliary {
	def static createSensorManager(){'''package root;
		
		import lejos.hardware.sensor.EV3ColorSensor;
		import lejos.hardware.sensor.EV3UltrasonicSensor;
		import lejos.hardware.sensor.NXTLightSensor;
		import lejos.robotics.SampleProvider;
		
		public class SensorManager extends Thread{
			
			public float leftBlackThreshold = 0.4f;
			public float rightBlackThreshold = 0.4f;
			public float leftWhiteThreshold = 0.55f;
			public float rightWhiteThreshold = 0.55f;
			
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
	
	def static createMission(){'''package root;
	
	import java.util.TreeMap;
	
	import lejos.hardware.motor.EV3LargeRegulatedMotor;
	import lejos.hardware.motor.EV3MediumRegulatedMotor;
	import lejos.robotics.subsumption.Behavior;
	
	public class Mission {
		protected static TreeMap<Integer, Behavior> behaviorMap = new TreeMap<>(); 
		protected BetterArbitrator arby;
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
	
		public void StopArbitrator(){
			arby.stop();
			arby = null;
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

	def static createAuxMethods(){'''package root;
			
			
import lejos.hardware.Button;
import lejos.hardware.ev3.EV3;
import lejos.hardware.lcd.LCD;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.motor.EV3MediumRegulatedMotor;
import lejos.hardware.port.Port;
import lejos.hardware.port.SensorPort;
import lejos.robotics.Color;
		
public class AuxMethods {
	
	public enum SpeedLevel{
		HIGH,
		MID,
		LOW
	}

	static public void setMotorSpeed(EV3LargeRegulatedMotor mtr, SpeedLevel speed){
		switch (speed) {
		case HIGH:
			mtr.setSpeed(mtr.getMaxSpeed() * 0.5f);
			break;
		case MID:
			mtr.setSpeed(mtr.getMaxSpeed() * 0.3f);
			break;
		case LOW:
			mtr.setSpeed(mtr.getMaxSpeed() * 0.15f);
			break;
		}
	}
	
	static public void resetAll(EV3LargeRegulatedMotor lMtr, EV3LargeRegulatedMotor rMtr, EV3MediumRegulatedMotor aMtr, Mission mis){
		lMtr.stop(true);
		rMtr.stop(true);
		aMtr.stop(true);
		mis = null;
	}
	
	static public void waitMs(int waitTime) {
		long startTime = System.currentTimeMillis();
		long curTime = startTime;
		while(curTime < startTime + waitTime){
			curTime = System.currentTimeMillis();
			Thread.yield();
		}
	}

	static public void clearScreen(){
		for (int i = 0; i < 10; i++) {
			System.out.println("");
		}
		LCD.clear();
		LCD.clearDisplay();
	}

	static public boolean calibrate(SensorManager sm){
		boolean success = false;
		
		clearScreen();
		waitMs(1000);
		System.out.println("Put left light over white.");
		while(!Button.ENTER.isDown()){
		}
		sm.leftWhiteThreshold = sm.getLeftLight() - 0.02f;
		waitMs(500);
		System.out.println("Put right light over white.");
		while(!Button.ENTER.isDown()){
		}
		sm.rightWhiteThreshold = sm.getRightLight() - 0.02f;
		waitMs(500);
		System.out.println("Put left light over black.");
		while(!Button.ENTER.isDown()){
		}
		sm.leftBlackThreshold = sm.getLeftLight() + 0.02f;
		waitMs(500);
		System.out.println("Put right light over black.");
		while(!Button.ENTER.isDown()){
		}
		sm.rightBlackThreshold = sm.getRightLight() + 0.02f;
		waitMs(500);
		clearScreen();
		success = true;

		return success;
	}

	static public void turnDegrees(int turnDeg, EV3LargeRegulatedMotor leftMotor, EV3LargeRegulatedMotor rightMotor,
				SensorManager sMgr) {
			float startDeg = sMgr.getGyro();
			leftMotor.stop(true);
			rightMotor.stop();
			if (turnDeg >= 0) {
				leftMotor.forward();
				rightMotor.backward();
				while (sMgr.getGyro() > startDeg + turnDeg) {
					waitMs(50);
				}
			} else {
				rightMotor.forward();
				leftMotor.backward();
				while (sMgr.getGyro() < startDeg + turnDeg) {
					waitMs(50);
				}
			}
			rightMotor.stop(true);
			leftMotor.stop();
		}

	static public void centralize(SensorManager sMgr, EV3LargeRegulatedMotor lMtr, EV3LargeRegulatedMotor rMtr){
		lMtr.stop(true);
		rMtr.stop();
		setMotorSpeed(rMtr, SpeedLevel.LOW);
		setMotorSpeed(lMtr, SpeedLevel.LOW);
		while(!(sMgr.getLeftLight() < sMgr.leftBlackThreshold && sMgr.getRightLight() < sMgr.rightBlackThreshold && sMgr.getColor() != Color.BLACK)){

			while(sMgr.getLeftLight() > sMgr.leftBlackThreshold){
				lMtr.backward();
			}
			waitMs(100);
			lMtr.stop();
			while(sMgr.getRightLight() > sMgr.rightBlackThreshold){
				rMtr.backward();
			}
			waitMs(100);
			rMtr.stop();
			if(sMgr.getColor() == Color.BLACK){
				lMtr.forward();
				rMtr.forward();
				waitMs(100);
				lMtr.stop(true);
				rMtr.stop(true);
			}
		}
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

	def static createMasterBruce(List<Mission> mL, String missionSet){'''package root;
	
	import java.io.IOException;
	import java.io.PrintWriter;
	
	import lejos.hardware.lcd.LCD;
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
	import lejos.robotics.Calibrate;
	import lejos.utility.Delay;
	«FOR m : mL»
		import root.«m.name».*;
	«ENDFOR»
	
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
			String other = "";
			switch (self) {
			case "Rover5":
				other = "Rover6";
				break;
			case "Rover7":
				other = "Rover8";
				break;
			case "Rover9":
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

			AuxMethods.clearScreen();			
			Mission[] missions = new Mission[3];
			missions[0] = null;
			missions[1] = null;
			missions[2] = null;
			int i = 0;
	
			while(true){
				LCD.drawString("Missionset «missionSet»", 0, 0);
				LCD.drawString("Empty", 2, 1);
				LCD.drawString("Empty", 2, 2);
				LCD.drawString("Empty", 2, 3);
				«FOR m : mL»
					LCD.drawString("          ", 2, «mL.indexOf(m)+1»);
					LCD.drawString("«m.name»", 2, «mL.indexOf(m)+1»);
				«ENDFOR»
				LCD.drawString("Calibrate sensor", 2, 4);
				LCD.drawString(">", 0, i + 1);
				if(Button.DOWN.isDown()){
					i = (i + 1) % 4;
					AuxMethods.waitMs(50);
				}else if(Button.UP.isDown()){
					i = (i + 3) % 4;
					AuxMethods.waitMs(50);
				}else if(Button.ENTER.isDown()){
					switch (i) {
					case 0:
						«IF mL.length >= 1»missions[i] = new «mL.get(0).name»(sensorManager, leftMotor, rightMotor, armMotor);
						AuxMethods.clearScreen();
						missions[i].RunArbitrator();
						AuxMethods.resetAll(leftMotor, rightMotor, armMotor, missions[i]);«ENDIF»
						break;
					case 1:
						«IF mL.length >= 2»missions[i] = new «mL.get(1).name»(sensorManager, leftMotor, rightMotor, armMotor);
						AuxMethods.clearScreen();
						missions[i].RunArbitrator();
						AuxMethods.resetAll(leftMotor, rightMotor, armMotor, missions[i]);«ENDIF»
						break;
					case 2:
						«IF mL.length >= 3»missions[i] = new «mL.get(2).name»(sensorManager, leftMotor, rightMotor, armMotor);
						AuxMethods.clearScreen();
						missions[i].RunArbitrator();
						AuxMethods.resetAll(leftMotor, rightMotor, armMotor, missions[i]);«ENDIF»
						break;
					case 3:
						AuxMethods.calibrate(sensorManager);
						break;
					}
				}
				AuxMethods.waitMs(50);
				AuxMethods.clearScreen();
			}
		}
	}'''}

	def static createSensorUpdater(){'''package root;
			
	import java.io.IOException;
	import java.util.Arrays;
	
	import lejos.hardware.Sound;
	import lejos.hardware.lcd.LCD;
	
	public class SensorUpdater extends Thread{
	
		private BTConReader reader;
		private SensorManager sMgr;
		private boolean running = false;
		private float[] floats;
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
			float[] flts = new float[4];
			if(!s.isEmpty()){			
				String[] strings = s.split(" ");
				for (int i = 0; i < strings.length; i++){
					flts[i] = Float.parseFloat(strings[i]);
				}
			}
			return flts;
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
	
	def static createBetterArbitrator(){'''package root;
	import lejos.robotics.subsumption.Arbitrator;
	import lejos.robotics.subsumption.Behavior;
	
	/**
	 *An  Arbitrator object  manages a behavior control system by starting and stopping individual  behaviors  
	 *<br>  by the calling the <code>action()</code> and <code>suppress()</code> methods on them. 
	 *<br>  These Behavior objects are stored in an array, in order of increasing priority. 
	 *<br>  Arbitrator  has three major responsibilities: <br> 
	 * 1. Determine the highest priority  behavior among those that returns <b> true </b> to <code>takeControl() </code>. <br>   
	 * 2. Suppress the active behavior if its priority is less than highest
	 * priority.   These two taska are performed the Arbitrator's internal Monitor thread.<br>   
	 * 3. When the <code>action()</code> method exits, call <code> action() </code>on the Behavior of highest priority. <br>
	 *       This task is  performed by the Arbitrator main thread. 
	 * <br>  The Arbitrator assumes that a Behavior is no longer active when <code>action()</code> exits,
	 * <br>  therefore it will only call <code>suppress()</code> on the active Behavior i.e.  whose <code>action()</code> method is running.
	 * <br>  It can make consecutive calls of <code> action() </code>on the same Behavior.
	 * <br>  Requirements for a Behavior:
	 * <br>    When <code>suppress()</code> is called, terminate <code> action() </code>immediately.
	 * <br>    When<code> action() </code>exits, the robot is in a safe state (e.g. motors stopped)
	 * <br>    When the behavior should take control,  the <code> takeControl() </code> should continue to return <b> true </b>
	 * <br>    until its action starts. 
	 * <br> After your code instantiates the Arbitrator,  it should call <code>go() </code>to start it running.
	 * <br>    
	 * @see Behavior
	 * @author Roger Glassey
	 */
	public class BetterArbitrator
	{
	
	  private final int NONE = -1;
	  private Behavior[] _behavior;
	  // highest priority behavior that wants control ; set by start() used by monitor
	  private int _highestPriority = NONE;
	  private int _active = NONE; //  active behavior; set by monitor, used by start();
	  private boolean _returnWhenInactive;
	  public boolean keepRunning = true;
	  /**
	   * Monitor is an inner class.  It polls the behavior array to find the behavior of hightst
	   * priority.  If higher than the active behavior, it calls active.suppress()
	   */
	  private Monitor monitor;
	
	  /**
	   * Allocates an Arbitrator object and initializes it with an array of
	   * Behavior objects. The index of a behavior in this array is its priority level, so 
	   * the behavior of the largest index has the highest the priority level. 
	   * The behaviors in an Arbitrator can not
	   * be changed once the arbitrator is initialized.<BR>
	   * <B>NOTE:</B> Once the Arbitrator is initialized, the method go() must be
	   * called to begin the arbitration.
	   * @param behaviorList an array of Behavior objects.
	   * @param returnWhenInactive if <B>true</B>, the <B>go()</B> method returns when no Behavior is active.
	   */
	  public BetterArbitrator(Behavior[] behaviorList, boolean returnWhenInactive)
	  {
	    _behavior = behaviorList;
	    _returnWhenInactive = returnWhenInactive;
	    monitor = new Monitor();
	    monitor.setDaemon(true);
		System.out.println("Arbitrator created");
	  }
	
	  /**
	   * Same as Arbitrator(behaviorList, false) Arbitrator start() never exits
	   * @param behaviorList An array of Behavior objects.
	   */
	  public BetterArbitrator(Behavior[] behaviorList)
	  {
	    this(behaviorList, false);
	  }
	
	  /**
	   * This method starts the arbitration of Behaviors and runs an endless loop.  <BR>
	   * Note: Arbitrator does not run in a separate thread. The go()
	   * method will not return unless <br>1. <code> no action() </code>method is running  and
	   * <br>2. no behavior <code> takeControl() </code> returns <B> true </B>  and  
	   * <br> 3. the <B>returnWhenInacative </B> flag is true,
	   */
	  public void go()
	  {
	
	    monitor.start();
	    while (_highestPriority == NONE)
	    {
	      Thread.yield();//wait for some behavior to take control                    
	    }
	    while (keepRunning)
	    {
	      synchronized (monitor)
	      {
	        if (_highestPriority > NONE)
	        {
	          _active = _highestPriority;
	        }
	        else if (_returnWhenInactive)
	        {// no behavior wants to run
	          monitor.more = false;//9 shut down monitor thread
	          return;
	        }
	      }// monitor released before action is called
	      if (_active != NONE)  //_highestPrioirty could be NONE
	      {
	        _behavior[_active].action();
	        _active = NONE;  // no active behavior at the moment
	      }
	      Thread.yield();
	    }
	  }
	
	  public void stop() {
		  keepRunning = false;
	  }
	  
	  /**
	   * Finds the highest priority behavior that returns <B>true </B> to <code> takeControl()</code>;
	   * If this priority is higher than the active behavior, it calls active.suppress().
	   */
	  private class Monitor extends Thread
	  {
	
	    boolean more = true;
	    int maxPriority = _behavior.length - 1;
	
	    public void run()
	    {
	      while (keepRunning)
	      {
	        //FIND HIGHEST PRIORITY BEHAVIOR THAT WANTS CONTROL
	        synchronized (this)
	        {
	           _highestPriority = NONE; // -1
	          for (int i = maxPriority; i > _active; i--) // only behaviors with higher priority are interesting
	          {
	            if (_behavior[i].takeControl())
	            {
	              _highestPriority = i;
	              break;
	            }
	          }
	          int active = _active; // local copy in case _active is set to NONE by the primary thread
	          if (_active != NONE && _highestPriority > _active)
	          {
	            _behavior[active].suppress();
	          }
	        }// end synchronize block - main thread can run now
	        Thread.yield();
	      }
	    }
	  }
	}
	  
	'''
		
	}
}