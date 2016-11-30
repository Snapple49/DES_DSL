/*
 * generated by Xtext 2.10.0
 */
package des.missionrobot.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import des.missionrobot.robotDSL.Mission
import des.missionrobot.robotDSL.Task
import des.missionrobot.robotDSL.Missions

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class RobotDSLGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
 	val root = resource.allContents.head as Missions;
 	if (root != null) {
 		var path = "generated/" + resource.getURI().lastSegment + "/"
 		for (Mission m: root.missionList){
	 		fsa.generateFile(path+m.name + ".java", JavaGenerator.arbitratorMain(m))
	 		for (Task t: m.taskList) {
	 				fsa.generateFile(path+t.name + ".java", BehaviorMaker.makeBehaviorClass(t))
	 		}		
 		}
 	}
 	
	}
	
}
