/*
 * generated by Xtext 2.10.0
 */
package des.missionrobot.validation

import des.missionrobot.robotDSL.Missions
import org.eclipse.xtext.validation.Check
import des.missionrobot.robotDSL.Mission
import des.missionrobot.robotDSL.Task
import java.util.List
import java.util.HashSet
import java.util.Set
import org.eclipse.emf.common.util.EList
import des.missionrobot.robotDSL.RobotDSLPackage
import java.util.ArrayList
import des.missionrobot.robotDSL.Action
import des.missionrobot.robotDSL.DirectionVal
import des.missionrobot.robotDSL.Trigger
import des.missionrobot.robotDSL.Distance
import des.missionrobot.robotDSL.Time

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class RobotDSLValidator extends AbstractRobotDSLValidator {
	
//	public static val INVALID_NAME = 'invalidName'
//
//	@Check
//	def checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
//			warning('Name should start with a capital', 
//					RobotDSLPackage.Literals.GREETING__NAME,
//					INVALID_NAME)
//		}
//	}
	
	@Check
	def checkPriorityCorrect(Mission m){
		var prios = new HashSet<Integer>()
		var notUnique = false
		var notValid = false
		for (Task t : m.taskList) {
			if(!prios.add(t.prio)){
				notUnique = true
			}
			if(t.prio >= 99 || t.prio <= 0){
				notValid = true
			}
		}
		if(notValid){
			error('Task priorities must be between 2 and 98 including', null)
		}
		if(notUnique){
			error('Tasks must have unique priorities within mission', null)
		}
		
	}
	
	@Check
	def checkDurationCorrect(Action a){
		if(a.duration < 0){
			warning('Duration should be > 0', null)
		}
	}
	
	@Check
	def checkTurnDirCorrect(Action a){
		if(a.turnDir == DirectionVal.FORWARD || a.moveDir == DirectionVal.BACKWARD){
			warning('Turn can have directions \'left\' or \'right\'', null)
		}
	}
	
	@Check
	def checkDistCorrect(Distance d){
		if(d.distance < 0){
			warning('Distance has to be >= 0', null)
		}
	}
	
	@Check
	def checkTimeCorrect(Time t){
		if(t.sec < 0){
			warning('Time has to be >= 0', null)
		}
	}
	
	
}
