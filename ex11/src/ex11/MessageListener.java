package ex11;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.HashMap;

import lejos.hardware.Sound;

public class MessageListener extends Thread{
	private DataInputStream reader;
	private HashMap<String, Boolean> colorsFound;
	private int readValue;

	private final static int redFound = 2;
	private final static int yellowFound = 3;
	private final static int blueFound = 4;

	MessageListener(DataInputStream rdr, HashMap<String, Boolean> colorsFnd){
		reader = rdr;
		colorsFound = colorsFnd;

	}
	public void run(){
		while(colorsFound.values().contains(false)){
			try {
				readValue = (int)reader.readByte();
				System.out.println(readValue);
			} catch (IOException e) {
				Sound.buzz();
			}
			switch (readValue) {
			case redFound:
				colorsFound.put("Red", true);
				Sound.beepSequence();
				break;
			case yellowFound:
				colorsFound.put("Yellow", true);
				Sound.beepSequence();
				break;
			case blueFound:
				colorsFound.put("Blue", true);
				Sound.beepSequence();
				break;
			default:
				Sound.buzz();
				break;
			}
			if(!colorsFound.values().contains(false)){
				try {
					reader.close();
				} catch (IOException e) {}
			}
		}
	}
}
