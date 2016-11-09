/**
 * generated by Xtext 2.10.0
 */
package des.missionrobot.robotDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Turn</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link des.missionrobot.robotDSL.Turn#getAngle <em>Angle</em>}</li>
 * </ul>
 *
 * @see des.missionrobot.robotDSL.RobotDSLPackage#getTurn()
 * @model
 * @generated
 */
public interface Turn extends Movement
{
  /**
   * Returns the value of the '<em><b>Angle</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Angle</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Angle</em>' attribute.
   * @see #setAngle(int)
   * @see des.missionrobot.robotDSL.RobotDSLPackage#getTurn_Angle()
   * @model
   * @generated
   */
  int getAngle();

  /**
   * Sets the value of the '{@link des.missionrobot.robotDSL.Turn#getAngle <em>Angle</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Angle</em>' attribute.
   * @see #getAngle()
   * @generated
   */
  void setAngle(int value);

} // Turn
