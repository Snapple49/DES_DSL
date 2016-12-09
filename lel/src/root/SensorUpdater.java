package root;

import java.io.DataInputStream;
import java.io.IOException;

import lejos.hardware.Sound;

public class SensorUpdater extends Thread{
	
	private DataInputStream reader;
	private SensorManager sMgr;
	private boolean running = false;
	private float[] floats;
	private float[] def = {0.0f, 0.0f, 0.0f, 0.0f};
	
	
	public SensorUpdater(SensorManager sMgr, DataInputStream reader){
		this.sMgr = sMgr;
		this.reader = reader;
	}
	
	@Override
	public void run(){
		running = true;
		String readValue;
		while(running){
			try {
				readValue = reader.readLine();
				System.out.println(readValue);
				floats = def;//parseFloats(readValue);
			} catch (IOException e) {
				floats = def;
				Sound.buzz();
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
