/**
 * generated by Xtext 2.10.0
 */
package des.missionrobot.robotDSL;

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
 *   <li>{@link des.missionrobot.robotDSL.Behaviour#getMoves <em>Moves</em>}</li>
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
   * Returns the value of the '<em><b>Moves</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Moves</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Moves</em>' containment reference.
   * @see #setMoves(Movement)
   * @see des.missionrobot.robotDSL.RobotDSLPackage#getBehaviour_Moves()
   * @model containment="true"
   * @generated
   */
  Movement getMoves();

  /**
   * Sets the value of the '{@link des.missionrobot.robotDSL.Behaviour#getMoves <em>Moves</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Moves</em>' containment reference.
   * @see #getMoves()
   * @generated
   */
  void setMoves(Movement value);

} // Behaviour