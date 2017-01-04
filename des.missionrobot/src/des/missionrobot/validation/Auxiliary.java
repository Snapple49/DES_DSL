package des.missionrobot.validation;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.EList;

import des.missionrobot.robotDSL.Task;

public class Auxiliary {

	public static boolean hasDuplicates(EList<Task> listContainingDuplicates) {
		 
		boolean returnBool = false;
		final Set<Integer> set1 = new HashSet<Integer>();
 
		for (Task t: listContainingDuplicates) {
			if (!set1.add(t.getPrio())) {
				returnBool = true;
			}
		}
		return returnBool;
	}
}
