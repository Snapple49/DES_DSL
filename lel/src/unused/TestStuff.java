package unused;

import java.util.Arrays;

public class TestStuff {
	static float[] src = {0.5f, 3.0f, 0.0f};
	static float[] dest;
	static float[] expected = {0.5f, 3.0f, 0.0f};
	static String packet;
	static float[] floats = null;
	
	public static float[] parseFloats(String s){
		String[] strings = s.split(" ");
		floats = new float[strings.length];
		for (int i = 0; i < strings.length; i++){
			floats[i] = Float.parseFloat(strings[i]);
			//sMgr.updateSlaveDevices(floats);
		}
		return floats;
	}
	
	public static String serializeFloats(float[] floats){
		String s = Float.toString(floats[0]);
		for (int i = 1; i < floats.length; i++){
			s = s + " " + Float.toString(floats[i]);
		}
		return s;
	}
	
	
	
	public static void main(String[] args) {
		
		byte[] bytes = new byte[128];
		for (int i = 0; i < bytes.length-1; i++) {
			bytes[i] = 'c';
		}
		String s = new String(bytes);
		System.out.println(s);
		
		/*
		System.out.println(src);
		System.out.println(expected);
		System.out.println(Arrays.equals(src, expected));
		packet = serializeFloats(src);
		System.out.println("\"" + packet + "\"");
		dest = parseFloats(packet);
		System.out.println("Src:" + src.toString() + " Dest: " + dest.toString() + " packet:" + packet + " Equals:" + Arrays.equals(dest, expected));
		*/
	}
}
