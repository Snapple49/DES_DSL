/**
 * generated by Xtext 2.10.0
 */
package des.missionrobot.robotDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link des.missionrobot.robotDSL.IO#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @see des.missionrobot.robotDSL.RobotDSLPackage#getIO()
 * @model
 * @generated
 */
public interface IO extends Action
{
  /**
   * Returns the value of the '<em><b>Message</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Message</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Message</em>' attribute.
   * @see #setMessage(String)
   * @see des.missionrobot.robotDSL.RobotDSLPackage#getIO_Message()
   * @model
   * @generated
   */
  String getMessage();

  /**
   * Sets the value of the '{@link des.missionrobot.robotDSL.IO#getMessage <em>Message</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Message</em>' attribute.
   * @see #getMessage()
   * @generated
   */
  void setMessage(String value);

} // IO