package unused;

import lejos.hardware.lcd.LCD;
import root.SensorManager;

public class PrinterThread extends Thread{
	
	public SensorManager sM;
	
	public PrinterThread(SensorManager senMgr){
		sM = senMgr;
	}
	
	public void run() {
		while(true){
			LCD.clearDisplay();
			long startTime = System.currentTimeMillis();
			LCD.drawString("Color:" + sM.getColor(), 0, 1);
			LCD.drawString("LeftLight:" + sM.getLeftLight(), 0, 2);
			LCD.drawString("RightLight:" + sM.getRightLight(), 0, 3);
			LCD.drawString("BackUS:" + sM.getBackUltrasonic(), 0, 4);
			long curTime = System.currentTimeMillis();
			while(curTime < startTime+10){
				Thread.yield();	
				curTime = System.currentTimeMillis();
			}
		}
	}
}
