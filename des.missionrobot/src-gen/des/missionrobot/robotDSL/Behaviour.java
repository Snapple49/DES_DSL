/**
 * generated by Xtext 2.10.0
 */
package des.missionrobot.robotDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behaviour</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link des.missionrobot.robotDSL.Behaviour#getName <em>Name</em>}</li>
 *   <li>{@link des.missionrobot.robotDSL.Behaviour#getPrio <em>Prio</em>}</li>
 *   <li>{@link des.missionrobot.robotDSL.Behaviour#getActionList <em>Action List</em>}</li>
 *   <li>{@link des.missionrobot.robotDSL.Behaviour#getTriggerList <em>Trigger List</em>}</li>
 *   <li>{@link des.missionrobot.robotDSL.Behaviour#getDeviceList <em>Device List</em>}</li>
 * </ul>
 *
 * @see des.missionrobot.robotDSL.RobotDSLPackage#getBehaviour()
 * @model
 * @generated
 */
public interface Behaviour extends EObject
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
   * @see des.missionrobot.robotDSL.RobotDSLPackage#getBehaviour_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link des.missionrobot.robotDSL.Behaviour#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Prio</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prio</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prio</em>' attribute.
   * @see #setPrio(int)
   * @see des.missionrobot.robotDSL.RobotDSLPackage#getBehaviour_Prio()
   * @model
   * @generated
   */
  int getPrio();

  /**
   * Sets the value of the '{@link des.missionrobot.robotDSL.Behaviour#getPrio <em>Prio</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prio</em>' attribute.
   * @see #getPrio()
   * @generated
   */
  void setPrio(int value);

  /**
   * Returns the value of the '<em><b>Action List</b></em>' containment reference list.
   * The list contents are of type {@link des.missionrobot.robotDSL.Action}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action List</em>' containment reference list.
   * @see des.missionrobot.robotDSL.RobotDSLPackage#getBehaviour_ActionList()
   * @model containment="true"
   * @generated
   */
  EList<Action> getActionList();

  /**
   * Returns the value of the '<em><b>Trigger List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Trigger List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trigger List</em>' containment reference.
   * @see #setTriggerList(Trigger)
   * @see des.missionrobot.robotDSL.RobotDSLPackage#getBehaviour_TriggerList()
   * @model containment="true"
   * @generated
   */
  Trigger getTriggerList();

  /**
   * Sets the value of the '{@link des.missionrobot.robotDSL.Behaviour#getTriggerList <em>Trigger List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Trigger List</em>' containment reference.
   * @see #getTriggerList()
   * @generated
   */
  void setTriggerList(Trigger value);

  /**
   * Returns the value of the '<em><b>Device List</b></em>' containment reference list.
   * The list contents are of type {@link des.missionrobot.robotDSL.Device}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Device List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Device List</em>' containment reference list.
   * @see des.missionrobot.robotDSL.RobotDSLPackage#getBehaviour_DeviceList()
   * @model containment="true"
   * @generated
   */
  EList<Device> getDeviceList();

} // Behaviour
