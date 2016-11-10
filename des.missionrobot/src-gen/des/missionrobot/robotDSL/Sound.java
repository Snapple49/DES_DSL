/**
 * generated by Xtext 2.10.0
 */
package des.missionrobot.robotDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sound</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link des.missionrobot.robotDSL.Sound#getSoundName <em>Sound Name</em>}</li>
 * </ul>
 *
 * @see des.missionrobot.robotDSL.RobotDSLPackage#getSound()
 * @model
 * @generated
 */
public interface Sound extends Action
{
  /**
   * Returns the value of the '<em><b>Sound Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sound Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sound Name</em>' attribute.
   * @see #setSoundName(String)
   * @see des.missionrobot.robotDSL.RobotDSLPackage#getSound_SoundName()
   * @model
   * @generated
   */
  String getSoundName();

  /**
   * Sets the value of the '{@link des.missionrobot.robotDSL.Sound#getSoundName <em>Sound Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sound Name</em>' attribute.
   * @see #getSoundName()
   * @generated
   */
  void setSoundName(String value);

} // Sound
