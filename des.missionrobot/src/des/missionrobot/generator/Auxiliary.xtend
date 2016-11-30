package des.missionrobot.generator
/* 

class Auxiliary {
	def static makeDevice(Device theD){'''
		«theD.name» = new «deviceTypeToText(theD)»(LocalEV3.get().getPort("«theD.port»"));«"\n"»'''
		//leftMotor = new EV3LargeRegulatedMotor(LocalEV3.get().getPort("A"));
		
	}
	
	def static CharSequence deviceTypeToText(Device d){
		switch(d.type){
			case DeviceType::MOTOR: return '''EV3LargeRegulatedMotor'''
			case DeviceType::SENSOR: switch(d.sensorType) {
				case SensorType::ULTRASONIC: return '''EV3UltrasonicSensor'''
				case SensorType::TOUCH: return '''EV3TouchSensor'''
				case SensorType::COLOR: return '''EV3ColorSensor'''
			}
		}
	}
	
	def static deviceName(Device theD){'''
		«deviceTypeToText(theD)» «theD.name»'''
	}
	
	def static makeBehavior(Behavior b){'''
		Behavior b«b.prio» = new «b.name»(«FOR d: b.deviceList SEPARATOR ", "»«d.name»«ENDFOR»);«"\n"»'''
		
	}
}*/