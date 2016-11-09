/**
 * generated by Xtext 2.10.0
 */
package des.missionrobot.robotDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Move Backward</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link des.missionrobot.robotDSL.MoveBackward#getBspeed <em>Bspeed</em>}</li>
 * </ul>
 *
 * @see des.missionrobot.robotDSL.RobotDSLPackage#getMoveBackward()
 * @model
 * @generated
 */
public interface MoveBackward extends Movement
{
  /**
   * Returns the value of the '<em><b>Bspeed</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bspeed</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bspeed</em>' attribute.
   * @see #setBspeed(int)
   * @see des.missionrobot.robotDSL.RobotDSLPackage#getMoveBackward_Bspeed()
   * @model
   * @generated
   */
  int getBspeed();

  /**
   * Sets the value of the '{@link des.missionrobot.robotDSL.MoveBackward#getBspeed <em>Bspeed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bspeed</em>' attribute.
   * @see #getBspeed()
   * @generated
   */
  void setBspeed(int value);

} // MoveBackward
