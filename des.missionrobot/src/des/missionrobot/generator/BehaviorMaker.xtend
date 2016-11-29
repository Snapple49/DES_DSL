package des.missionrobot.generator

import des.missionrobot.robotDSL.Behavior
import des.missionrobot.robotDSL.Device
import des.missionrobot.robotDSL.Trigger
import des.missionrobot.robotDSL.SensorType
import des.missionrobot.robotDSL.DeviceType
import des.missionrobot.robotDSL.MoveForward
import des.missionrobot.robotDSL.Action


class BehaviorMaker {
	def static makeBehaviorClass(Behavior b){'''
		import lejos.hardware.motor.EV3LargeRegulatedMotor;
		import lejos.hardware.sensor.EV3TouchSensor;
		import lejos.hardware.sensor.EV3UltrasonicSensor;
		import lejos.hardware.sensor.EV3ColorSensor;
		import lejos.hardware.Sound;
		import lejos.robotics.Color;
		import lejos.robotics.SampleProvider;
		import lejos.robotics.subsumption.Behavior;
		
		public class «b.name» implements Behavior{
		
			private boolean suppressed;
			// instantiate motors, sensors and sensor related variables
			«FOR Device d : b.deviceList»static «Auxiliary.deviceName(d)»;«"\n"» «ENDFOR»
			«FOR Device d: b.deviceList»«IF d.type == DeviceType.SENSOR»SampleProvider «d.name»SampleProvider;
			float[] «d.name»Samples;«"\n"»«ENDIF»«ENDFOR»
		
		
			public «b.name»(«FOR d : b.deviceList SEPARATOR ", "»«Auxiliary.deviceName(d)»«ENDFOR»){
				«FOR Device d : b.deviceList»this.«d.name»=«d.name»;«"\n"» «ENDFOR»
				«FOR Device d : b.deviceList»«IF d.type == DeviceType.SENSOR»«sensorInitializer(d)»«ENDIF»«ENDFOR»
				
				
				
			}
		
		
			public boolean takeControl() {
				«FOR Trigger t : b.triggerList»«takeControlFetchMaker(t)»«ENDFOR»
				return («FOR Trigger t : b.triggerList SEPARATOR "||"»«takeControlReturnMaker(t)»«ENDFOR»);
				}
		
			public void action() {
				suppressed = false;
				
				«actionMaker(b)»
				
				/*while(!suppressed){
					
					switch ((int)colorSamples[0]){
					case Color.RED: colorsFound.put("Red", true);
					writer.write(redFound);
					writer.flush();
					break;
					case Color.YELLOW: colorsFound.put("Yellow", true);
					writer.write(yellowFound);
					writer.flush();
					break;
					case Color.BLUE: colorsFound.put("Blue", true);
					writer.write(blueFound);
					writer.flush();
					break;
					}
					Sound.beepSequence();
		
		
					break;
				}*/
			}
		
			public void suppress() {
				«FOR d : b.deviceList»«IF d.type == DeviceType.MOTOR»«d.name».stop(true);«"\n"»«ENDIF»«ENDFOR»
				suppressed = true;
			}
		
		}
		
	'''}
	
	def static takeControlFetchMaker(Trigger t){
		if (t.sensorTrigger != null){
			switch(t.sensorTrigger.type){
				case SensorType::COLOR: return '''«t.sensorTrigger.name».fetchSample(colorSamples, 0);«"\n"»'''
				case SensorType::TOUCH: return '''«t.sensorTrigger.name».fetchSample(lSamples, 0);«"\n"»'''
				case SensorType::ULTRASONIC: return '''«t.sensorTrigger.name».fetchSample(distanceSamples, 0);«"\n"»'''
			}
		
		}
	}
	def static takeControlReturnMaker(Trigger t){
		if (t.sensorTrigger != null){
			switch(t.sensorTrigger.type){
				case SensorType::COLOR: return '''«t.sensorTrigger.name»Samples[0] == Color.«t.condition»«"\n"»'''
				case SensorType::TOUCH: return '''«t.sensorTrigger.name»Samples[0] > 0«"\n"»'''
				case SensorType::ULTRASONIC: return '''«t.sensorTrigger.name»Samples[0] < «t.condition»«"\n"»'''
			}
		}
	}
	def static sensorInitializer(Device d){
		if (d.type == DeviceType.SENSOR){
			switch(d.sensorType){
				case SensorType::COLOR: return '''«d.name»SampleProvider = «d.name»Sensor.getColorIDMode();
				«d.name»Samples = new float[«d.name»SampleProvider.sampleSize()];«"\n"»'''
			}
		}
	}
	def static actionMaker(Behavior b){'''
		«FOR a : b.actionList»«IF a.duration.equals(null)»
		«FOR d : b.deviceList»«IF d.type == DeviceType.MOTOR»«d.name».setSpeed(«a.moveForward.fspeed»);
				«d.name».forward();«"\n"»«ENDIF»«ENDFOR»
				while(!suppressed){
					Thread.yield();			
				}
				«ELSE»
				«FOR d : b.deviceList»«IF d.type == DeviceType.MOTOR»«d.name».setSpeed(«a.moveForward.fspeed»);
				«d.name».forward();«"\n"»«ENDIF»«ENDFOR»
				waitMs(«a.duration»);
				«FOR d : b.deviceList»«IF d.type == DeviceType.MOTOR»«d.name».stop(true);«"\n"»«ENDIF»«ENDFOR»
				«ENDIF»«ENDFOR»'''
	}
	
}