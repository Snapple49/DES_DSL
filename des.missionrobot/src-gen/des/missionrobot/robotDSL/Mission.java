/**
 * generated by Xtext 2.10.0
 */
package des.missionrobot.robotDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link des.missionrobot.robotDSL.Mission#getName <em>Name</em>}</li>
 *   <li>{@link des.missionrobot.robotDSL.Mission#getBehaviourList <em>Behaviour List</em>}</li>
 *   <li>{@link des.missionrobot.robotDSL.Mission#getGoalCondition <em>Goal Condition</em>}</li>
 * </ul>
 *
 * @see des.missionrobot.robotDSL.RobotDSLPackage#getMission()
 * @model
 * @generated
 */
public interface Mission extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see des.missionrobot.robotDSL.RobotDSLPackage#getMission_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link des.missionrobot.robotDSL.Mission#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Behaviour List</b></em>' containment reference list.
   * The list contents are of type {@link des.missionrobot.robotDSL.Behaviour}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Behaviour List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Behaviour List</em>' containment reference list.
   * @see des.missionrobot.robotDSL.RobotDSLPackage#getMission_BehaviourList()
   * @model containment="true"
   * @generated
   */
  EList<Behaviour> getBehaviourList();

  /**
   * Returns the value of the '<em><b>Goal Condition</b></em>' containment reference list.
   * The list contents are of type {@link des.missionrobot.robotDSL.Trigger}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Goal Condition</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Goal Condition</em>' containment reference list.
   * @see des.missionrobot.robotDSL.RobotDSLPackage#getMission_GoalCondition()
   * @model containment="true"
   * @generated
   */
  EList<Trigger> getGoalCondition();

} // Mission