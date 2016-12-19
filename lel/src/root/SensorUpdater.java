package root;
	
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
	
	}