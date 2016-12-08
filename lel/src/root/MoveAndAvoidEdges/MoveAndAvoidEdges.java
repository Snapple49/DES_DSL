package root.MoveAndAvoidEdges;
import java.util.TreeMap;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.motor.EV3MediumRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3GyroSensor;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.hardware.sensor.NXTLightSensor;
import lejos.robotics.subsumption.Arbitrator;
import lejos.robotics.subsumption.Behavior;
import root.Mission;
import root.SensorManager;

public class MoveAndAvoidEdges extends Mission {		
	//public static void main(String [] args){
	public MoveAndAvoidEdges(SensorManager sMgr, EV3LargeRegulatedMotor lMtr, EV3LargeRegulatedMotor rMtr, EV3MediumRegulatedMotor aMtr){
		super(sMgr, lMtr, rMtr, aMtr);
		
		behaviorMap.put(1, new MoveAround(leftMotor, rightMotor, armMotor, sMgr));
		behaviorMap.put(91, new AvoidLeftEdge(leftMotor, rightMotor, armMotor, sMgr));
		behaviorMap.put(90, new AvoidRightEdge(leftMotor, rightMotor, armMotor, sMgr));
		behaviorMap.put(80, new AvoidEdgeFront(leftMotor, rightMotor, armMotor, sMgr));
		behaviorMap.put(85, new AvoidEdgeBehind(leftMotor, rightMotor, armMotor, sMgr));
		
		Behavior[] behaviors = sortBehaviors(behaviorMap);
		arby = new Arbitrator(behaviors);
	}

	
}

