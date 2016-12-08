package root;

import java.io.DataInputStream;
import java.io.IOException;

import lejos.hardware.Sound;

public class SensorUpdater extends Thread{
	
	private DataInputStream reader;
	private SensorManager sMgr;
	private boolean running;
	
	
	public SensorUpdater(SensorManager sMgr, DataInputStream reader){
		this.sMgr = sMgr;
		this.reader = reader;
	}
	
	public void run(){
		running = true;
		String readValue;
		while(running){
			try {
				readValue = reader.readUTF();
				float[] floats = parseFloats(readValue);
			} catch (IOException e) {
				Sound.buzz();
			}
		}
	}
		
	public float[] parseFloats(String s){
		String[] strings = s.split(" ");
		float[] floats = new float[strings.length];
		for (int i = 0; i < strings.length; i++){
			floats[i] = Float.parseFloat(strings[i]);
			sMgr.updateSlaveDevices(floats);
		}
		return floats;
	}
}
