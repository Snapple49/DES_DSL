package root;
			
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
	
	}