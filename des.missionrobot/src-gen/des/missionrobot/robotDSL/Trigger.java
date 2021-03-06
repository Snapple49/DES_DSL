/**
 * generated by Xtext 2.10.0
 */
package des.missionrobot.robotDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link des.missionrobot.robotDSL.Trigger#getBoolType <em>Bool Type</em>}</li>
 *   <li>{@link des.missionrobot.robotDSL.Trigger#getNeg <em>Neg</em>}</li>
 *   <li>{@link des.missionrobot.robotDSL.Trigger#getFlag <em>Flag</em>}</li>
 *   <li>{@link des.missionrobot.robotDSL.Trigger#getSensor <em>Sensor</em>}</li>
 *   <li>{@link des.missionrobot.robotDSL.Trigger#getColor <em>Color</em>}</li>
 *   <li>{@link des.missionrobot.robotDSL.Trigger#getDist <em>Dist</em>}</li>
 *   <li>{@link des.missionrobot.robotDSL.Trigger#getTouching <em>Touching</em>}</li>
 *   <li>{@link des.missionrobot.robotDSL.Trigger#getDegrees <em>Degrees</em>}</li>
 * </ul>
 *
 * @see des.missionrobot.robotDSL.RobotDSLPackage#getTrigger()
 * @model
 * @generated
 */
public interface Trigger extends EObject
{
  /**
   * Returns the value of the '<em><b>Bool Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bool Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bool Type</em>' containment reference.
   * @see #setBoolType(Bool)
   * @see des.missionrobot.robotDSL.RobotDSLPackage#getTrigger_BoolType()
   * @model containment="true"
   * @generated
   */
  Bool getBoolType();

  /**
   * Sets the value of the '{@link des.missionrobot.robotDSL.Trigger#getBoolType <em>Bool Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bool Type</em>' containment reference.
   * @see #getBoolType()
   * @generated
   */
  void setBoolType(Bool value);

  /**
   * Returns the value of the '<em><b>Neg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Neg</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Neg</em>' containment reference.
   * @see #setNeg(Negation)
   * @see des.missionrobot.robotDSL.RobotDSLPackage#getTrigger_Neg()
   * @model containment="true"
   * @generated
   */
  Negation getNeg();

  /**
   * Sets the value of the '{@link des.missionrobot.robotDSL.Trigger#getNeg <em>Neg</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Neg</em>' containment reference.
   * @see #getNeg()
   * @generated
   */
  void setNeg(Negation value);

  /**
   * Returns the value of the '<em><b>Flag</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Flag</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Flag</em>' reference.
   * @see #setFlag(Flag)
   * @see des.missionrobot.robotDSL.RobotDSLPackage#getTrigger_Flag()
   * @model
   * @generated
   */
  Flag getFlag();

  /**
   * Sets the value of the '{@link des.missionrobot.robotDSL.Trigger#getFlag <em>Flag</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Flag</em>' reference.
   * @see #getFlag()
   * @generated
   */
  void setFlag(Flag value);

  /**
   * Returns the value of the '<em><b>Sensor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sensor</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sensor</em>' containment reference.
   * @see #setSensor(Sensor)
   * @see des.missionrobot.robotDSL.RobotDSLPackage#getTrigger_Sensor()
   * @model containment="true"
   * @generated
   */
  Sensor getSensor();

  /**
   * Sets the value of the '{@link des.missionrobot.robotDSL.Trigger#getSensor <em>Sensor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sensor</em>' containment reference.
   * @see #getSensor()
   * @generated
   */
  void setSensor(Sensor value);

  /**
   * Returns the value of the '<em><b>Color</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Color</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Color</em>' containment reference.
   * @see #setColor(Color)
   * @see des.missionrobot.robotDSL.RobotDSLPackage#getTrigger_Color()
   * @model containment="true"
   * @generated
   */
  Color getColor();

  /**
   * Sets the value of the '{@link des.missionrobot.robotDSL.Trigger#getColor <em>Color</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Color</em>' containment reference.
   * @see #getColor()
   * @generated
   */
  void setColor(Color value);

  /**
   * Returns the value of the '<em><b>Dist</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dist</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dist</em>' containment reference.
   * @see #setDist(Distance)
   * @see des.missionrobot.robotDSL.RobotDSLPackage#getTrigger_Dist()
   * @model containment="true"
   * @generated
   */
  Distance getDist();

  /**
   * Sets the value of the '{@link des.missionrobot.robotDSL.Trigger#getDist <em>Dist</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dist</em>' containment reference.
   * @see #getDist()
   * @generated
   */
  void setDist(Distance value);

  /**
   * Returns the value of the '<em><b>Touching</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Touching</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Touching</em>' attribute.
   * @see #setTouching(String)
   * @see des.missionrobot.robotDSL.RobotDSLPackage#getTrigger_Touching()
   * @model
   * @generated
   */
  String getTouching();

  /**
   * Sets the value of the '{@link des.missionrobot.robotDSL.Trigger#getTouching <em>Touching</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Touching</em>' attribute.
   * @see #getTouching()
   * @generated
   */
  void setTouching(String value);

  /**
   * Returns the value of the '<em><b>Degrees</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Degrees</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Degrees</em>' attribute.
   * @see #setDegrees(int)
   * @see des.missionrobot.robotDSL.RobotDSLPackage#getTrigger_Degrees()
   * @model
   * @generated
   */
  int getDegrees();

  /**
   * Sets the value of the '{@link des.missionrobot.robotDSL.Trigger#getDegrees <em>Degrees</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Degrees</em>' attribute.
   * @see #getDegrees()
   * @generated
   */
  void setDegrees(int value);

} // Trigger
