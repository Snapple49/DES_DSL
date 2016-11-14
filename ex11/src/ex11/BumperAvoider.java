package ex11;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.robotics.SampleProvider;

public class BumperAvoider extends Movement{

	static EV3TouchSensor leftBmpr, rightBmpr;
	SampleProvider lTouch, rTouch;
	float[] lSamples, rSamples;
	private boolean suppressed, lCollided, rCollided;
	
	public BumperAvoider(EV3TouchSensor lBmp, EV3TouchSensor rBmp, EV3LargeRegulatedMotor lMtr, EV3LargeRegulatedMotor rMtr) {
		leftMotor = lMtr;
		rightMotor = rMtr;
		leftBmpr = lBmp;
		rightBmpr = rBmp;
		
		lTouch = leftBmpr.getTouchMode();
		rTouch = rightBmpr.getTouchMode();
		lSamples = new float[lTouch.sampleSize()];
		rSamples = new float[rTouch.sampleSize()];
	}
	
	@Override
	public boolean takeControl() {
		lTouch.fetchSample(lSamples, 0);
		rTouch.fetchSample(rSamples, 0);
		lCollided = (lSamples[0] > 0);
		rCollided = (rSamples[0] > 0);
		return (lCollided || rCollided);
	}

	@Override
	public void action() {
		suppressed = false;
		while(!suppressed){
			if(lCollided && rCollided){
				backAndTurn(true, 400, 1000);
				break;
			}else if(lCollided && !rCollided){
				backAndTurn(true, 400, 200);
				break;
			}else if(rCollided){
				backAndTurn(false, 400, 200);
				break;
			}
			lCollided = false;
			rCollided = false;
		}
	}

	@Override
	public void suppress() {
		rightMotor.stop(true);
		leftMotor.stop();
		lCollided = false;
		rCollided = false;
		suppressed = true;
	}
	

}
