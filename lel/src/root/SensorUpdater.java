package root;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;

import lejos.hardware.Sound;

public class SensorUpdater extends Thread{
	
	private BufferedReader reader;
	private SensorManager sMgr;
	private boolean running = false;
	private float[] def = {0.0f, 0.0f, 0.0f, 0.0f};
	private float[] floats = def;
	private String readValue;
	
	
	public SensorUpdater(SensorManager sMgr, BufferedReader reader){
		this.sMgr = sMgr;
		this.reader = reader;
	}
	
	@Override
	public void run(){
		running = true;
		while(running){
			try {
				Thread.yield();
				readValue = reader.readLine();
				System.out.println(readValue);
				//floats = def;//parseFloats(readValue);
			} catch (IOException e) {
				e.printStackTrace();
				Sound.buzz();
				return;
			}
		}
	}

	public float[] parseFloats(String s){
		String[] strings = s.split(" ");
		floats = new float[strings.length];
		for (int i = 0; i < strings.length; i++){
			floats[i] = Float.parseFloat(strings[i]);
			System.out.println(floats.toString());
			sMgr.updateSlaveDevices(floats);
		}
		return floats;
	}
	
}
