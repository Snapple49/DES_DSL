/**
 * generated by Xtext 2.10.0
 */
package des.missionrobot.robotDSL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see des.missionrobot.robotDSL.RobotDSLFactory
 * @model kind="package"
 * @generated
 */
public interface RobotDSLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "robotDSL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.missionrobot.des/RobotDSL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "robotDSL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RobotDSLPackage eINSTANCE = des.missionrobot.robotDSL.impl.RobotDSLPackageImpl.init();

  /**
   * The meta object id for the '{@link des.missionrobot.robotDSL.impl.MissionImpl <em>Mission</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see des.missionrobot.robotDSL.impl.MissionImpl
   * @see des.missionrobot.robotDSL.impl.RobotDSLPackageImpl#getMission()
   * @generated
   */
  int MISSION = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MISSION__NAME = 0;

  /**
   * The feature id for the '<em><b>Behaviour List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MISSION__BEHAVIOUR_LIST = 1;

  /**
   * The feature id for the '<em><b>Goal Condition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MISSION__GOAL_CONDITION = 2;

  /**
   * The number of structural features of the '<em>Mission</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MISSION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link des.missionrobot.robotDSL.impl.BehaviourImpl <em>Behaviour</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see des.missionrobot.robotDSL.impl.BehaviourImpl
   * @see des.missionrobot.robotDSL.impl.RobotDSLPackageImpl#getBehaviour()
   * @generated
   */
  int BEHAVIOUR = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIOUR__NAME = 0;

  /**
   * The feature id for the '<em><b>Prio</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIOUR__PRIO = 1;

  /**
   * The feature id for the '<em><b>Action List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIOUR__ACTION_LIST = 2;

  /**
   * The feature id for the '<em><b>Trigger List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIOUR__TRIGGER_LIST = 3;

  /**
   * The feature id for the '<em><b>Device List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIOUR__DEVICE_LIST = 4;

  /**
   * The number of structural features of the '<em>Behaviour</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIOUR_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link des.missionrobot.robotDSL.impl.ActionImpl <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see des.missionrobot.robotDSL.impl.ActionImpl
   * @see des.missionrobot.robotDSL.impl.RobotDSLPackageImpl#getAction()
   * @generated
   */
  int ACTION = 2;

  /**
   * The number of structural features of the '<em>Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link des.missionrobot.robotDSL.impl.MovementImpl <em>Movement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see des.missionrobot.robotDSL.impl.MovementImpl
   * @see des.missionrobot.robotDSL.impl.RobotDSLPackageImpl#getMovement()
   * @generated
   */
  int MOVEMENT = 3;

  /**
   * The number of structural features of the '<em>Movement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVEMENT_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link des.missionrobot.robotDSL.impl.MoveForwardImpl <em>Move Forward</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see des.missionrobot.robotDSL.impl.MoveForwardImpl
   * @see des.missionrobot.robotDSL.impl.RobotDSLPackageImpl#getMoveForward()
   * @generated
   */
  int MOVE_FORWARD = 4;

  /**
   * The feature id for the '<em><b>Fspeed</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVE_FORWARD__FSPEED = MOVEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Move Forward</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVE_FORWARD_FEATURE_COUNT = MOVEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link des.missionrobot.robotDSL.impl.MoveBackwardImpl <em>Move Backward</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see des.missionrobot.robotDSL.impl.MoveBackwardImpl
   * @see des.missionrobot.robotDSL.impl.RobotDSLPackageImpl#getMoveBackward()
   * @generated
   */
  int MOVE_BACKWARD = 5;

  /**
   * The feature id for the '<em><b>Bspeed</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVE_BACKWARD__BSPEED = MOVEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Move Backward</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVE_BACKWARD_FEATURE_COUNT = MOVEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link des.missionrobot.robotDSL.impl.TurnImpl <em>Turn</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see des.missionrobot.robotDSL.impl.TurnImpl
   * @see des.missionrobot.robotDSL.impl.RobotDSLPackageImpl#getTurn()
   * @generated
   */
  int TURN = 6;

  /**
   * The feature id for the '<em><b>Angle</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TURN__ANGLE = MOVEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Turn</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TURN_FEATURE_COUNT = MOVEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link des.missionrobot.robotDSL.impl.StopImpl <em>Stop</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see des.missionrobot.robotDSL.impl.StopImpl
   * @see des.missionrobot.robotDSL.impl.RobotDSLPackageImpl#getStop()
   * @generated
   */
  int STOP = 7;

  /**
   * The feature id for the '<em><b>Duration</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STOP__DURATION = MOVEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Stop</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STOP_FEATURE_COUNT = MOVEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link des.missionrobot.robotDSL.impl.SoundImpl <em>Sound</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see des.missionrobot.robotDSL.impl.SoundImpl
   * @see des.missionrobot.robotDSL.impl.RobotDSLPackageImpl#getSound()
   * @generated
   */
  int SOUND = 8;

  /**
   * The feature id for the '<em><b>Sound Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOUND__SOUND_NAME = ACTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Sound</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOUND_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link des.missionrobot.robotDSL.impl.IOImpl <em>IO</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see des.missionrobot.robotDSL.impl.IOImpl
   * @see des.missionrobot.robotDSL.impl.RobotDSLPackageImpl#getIO()
   * @generated
   */
  int IO = 9;

  /**
   * The feature id for the '<em><b>Message</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IO__MESSAGE = ACTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>IO</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IO_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link des.missionrobot.robotDSL.impl.TriggerImpl <em>Trigger</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see des.missionrobot.robotDSL.impl.TriggerImpl
   * @see des.missionrobot.robotDSL.impl.RobotDSLPackageImpl#getTrigger()
   * @generated
   */
  int TRIGGER = 10;

  /**
   * The feature id for the '<em><b>Condition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIGGER__CONDITION = 0;

  /**
   * The number of structural features of the '<em>Trigger</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIGGER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link des.missionrobot.robotDSL.impl.DeviceImpl <em>Device</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see des.missionrobot.robotDSL.impl.DeviceImpl
   * @see des.missionrobot.robotDSL.impl.RobotDSLPackageImpl#getDevice()
   * @generated
   */
  int DEVICE = 11;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE__TYPE = 0;

  /**
   * The number of structural features of the '<em>Device</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link des.missionrobot.robotDSL.Mission <em>Mission</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mission</em>'.
   * @see des.missionrobot.robotDSL.Mission
   * @generated
   */
  EClass getMission();

  /**
   * Returns the meta object for the attribute '{@link des.missionrobot.robotDSL.Mission#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see des.missionrobot.robotDSL.Mission#getName()
   * @see #getMission()
   * @generated
   */
  EAttribute getMission_Name();

  /**
   * Returns the meta object for the containment reference list '{@link des.missionrobot.robotDSL.Mission#getBehaviourList <em>Behaviour List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Behaviour List</em>'.
   * @see des.missionrobot.robotDSL.Mission#getBehaviourList()
   * @see #getMission()
   * @generated
   */
  EReference getMission_BehaviourList();

  /**
   * Returns the meta object for the containment reference list '{@link des.missionrobot.robotDSL.Mission#getGoalCondition <em>Goal Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Goal Condition</em>'.
   * @see des.missionrobot.robotDSL.Mission#getGoalCondition()
   * @see #getMission()
   * @generated
   */
  EReference getMission_GoalCondition();

  /**
   * Returns the meta object for class '{@link des.missionrobot.robotDSL.Behaviour <em>Behaviour</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Behaviour</em>'.
   * @see des.missionrobot.robotDSL.Behaviour
   * @generated
   */
  EClass getBehaviour();

  /**
   * Returns the meta object for the attribute '{@link des.missionrobot.robotDSL.Behaviour#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see des.missionrobot.robotDSL.Behaviour#getName()
   * @see #getBehaviour()
   * @generated
   */
  EAttribute getBehaviour_Name();

  /**
   * Returns the meta object for the attribute '{@link des.missionrobot.robotDSL.Behaviour#getPrio <em>Prio</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Prio</em>'.
   * @see des.missionrobot.robotDSL.Behaviour#getPrio()
   * @see #getBehaviour()
   * @generated
   */
  EAttribute getBehaviour_Prio();

  /**
   * Returns the meta object for the containment reference list '{@link des.missionrobot.robotDSL.Behaviour#getActionList <em>Action List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Action List</em>'.
   * @see des.missionrobot.robotDSL.Behaviour#getActionList()
   * @see #getBehaviour()
   * @generated
   */
  EReference getBehaviour_ActionList();

  /**
   * Returns the meta object for the containment reference '{@link des.missionrobot.robotDSL.Behaviour#getTriggerList <em>Trigger List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Trigger List</em>'.
   * @see des.missionrobot.robotDSL.Behaviour#getTriggerList()
   * @see #getBehaviour()
   * @generated
   */
  EReference getBehaviour_TriggerList();

  /**
   * Returns the meta object for the containment reference list '{@link des.missionrobot.robotDSL.Behaviour#getDeviceList <em>Device List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Device List</em>'.
   * @see des.missionrobot.robotDSL.Behaviour#getDeviceList()
   * @see #getBehaviour()
   * @generated
   */
  EReference getBehaviour_DeviceList();

  /**
   * Returns the meta object for class '{@link des.missionrobot.robotDSL.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action</em>'.
   * @see des.missionrobot.robotDSL.Action
   * @generated
   */
  EClass getAction();

  /**
   * Returns the meta object for class '{@link des.missionrobot.robotDSL.Movement <em>Movement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Movement</em>'.
   * @see des.missionrobot.robotDSL.Movement
   * @generated
   */
  EClass getMovement();

  /**
   * Returns the meta object for class '{@link des.missionrobot.robotDSL.MoveForward <em>Move Forward</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Move Forward</em>'.
   * @see des.missionrobot.robotDSL.MoveForward
   * @generated
   */
  EClass getMoveForward();

  /**
   * Returns the meta object for the attribute '{@link des.missionrobot.robotDSL.MoveForward#getFspeed <em>Fspeed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fspeed</em>'.
   * @see des.missionrobot.robotDSL.MoveForward#getFspeed()
   * @see #getMoveForward()
   * @generated
   */
  EAttribute getMoveForward_Fspeed();

  /**
   * Returns the meta object for class '{@link des.missionrobot.robotDSL.MoveBackward <em>Move Backward</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Move Backward</em>'.
   * @see des.missionrobot.robotDSL.MoveBackward
   * @generated
   */
  EClass getMoveBackward();

  /**
   * Returns the meta object for the attribute '{@link des.missionrobot.robotDSL.MoveBackward#getBspeed <em>Bspeed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bspeed</em>'.
   * @see des.missionrobot.robotDSL.MoveBackward#getBspeed()
   * @see #getMoveBackward()
   * @generated
   */
  EAttribute getMoveBackward_Bspeed();

  /**
   * Returns the meta object for class '{@link des.missionrobot.robotDSL.Turn <em>Turn</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Turn</em>'.
   * @see des.missionrobot.robotDSL.Turn
   * @generated
   */
  EClass getTurn();

  /**
   * Returns the meta object for the attribute '{@link des.missionrobot.robotDSL.Turn#getAngle <em>Angle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Angle</em>'.
   * @see des.missionrobot.robotDSL.Turn#getAngle()
   * @see #getTurn()
   * @generated
   */
  EAttribute getTurn_Angle();

  /**
   * Returns the meta object for class '{@link des.missionrobot.robotDSL.Stop <em>Stop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Stop</em>'.
   * @see des.missionrobot.robotDSL.Stop
   * @generated
   */
  EClass getStop();

  /**
   * Returns the meta object for the attribute '{@link des.missionrobot.robotDSL.Stop#getDuration <em>Duration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Duration</em>'.
   * @see des.missionrobot.robotDSL.Stop#getDuration()
   * @see #getStop()
   * @generated
   */
  EAttribute getStop_Duration();

  /**
   * Returns the meta object for class '{@link des.missionrobot.robotDSL.Sound <em>Sound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sound</em>'.
   * @see des.missionrobot.robotDSL.Sound
   * @generated
   */
  EClass getSound();

  /**
   * Returns the meta object for the attribute '{@link des.missionrobot.robotDSL.Sound#getSoundName <em>Sound Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sound Name</em>'.
   * @see des.missionrobot.robotDSL.Sound#getSoundName()
   * @see #getSound()
   * @generated
   */
  EAttribute getSound_SoundName();

  /**
   * Returns the meta object for class '{@link des.missionrobot.robotDSL.IO <em>IO</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>IO</em>'.
   * @see des.missionrobot.robotDSL.IO
   * @generated
   */
  EClass getIO();

  /**
   * Returns the meta object for the attribute '{@link des.missionrobot.robotDSL.IO#getMessage <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Message</em>'.
   * @see des.missionrobot.robotDSL.IO#getMessage()
   * @see #getIO()
   * @generated
   */
  EAttribute getIO_Message();

  /**
   * Returns the meta object for class '{@link des.missionrobot.robotDSL.Trigger <em>Trigger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trigger</em>'.
   * @see des.missionrobot.robotDSL.Trigger
   * @generated
   */
  EClass getTrigger();

  /**
   * Returns the meta object for the attribute '{@link des.missionrobot.robotDSL.Trigger#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Condition</em>'.
   * @see des.missionrobot.robotDSL.Trigger#getCondition()
   * @see #getTrigger()
   * @generated
   */
  EAttribute getTrigger_Condition();

  /**
   * Returns the meta object for class '{@link des.missionrobot.robotDSL.Device <em>Device</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Device</em>'.
   * @see des.missionrobot.robotDSL.Device
   * @generated
   */
  EClass getDevice();

  /**
   * Returns the meta object for the attribute '{@link des.missionrobot.robotDSL.Device#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see des.missionrobot.robotDSL.Device#getType()
   * @see #getDevice()
   * @generated
   */
  EAttribute getDevice_Type();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  RobotDSLFactory getRobotDSLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link des.missionrobot.robotDSL.impl.MissionImpl <em>Mission</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see des.missionrobot.robotDSL.impl.MissionImpl
     * @see des.missionrobot.robotDSL.impl.RobotDSLPackageImpl#getMission()
     * @generated
     */
    EClass MISSION = eINSTANCE.getMission();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MISSION__NAME = eINSTANCE.getMission_Name();

    /**
     * The meta object literal for the '<em><b>Behaviour List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MISSION__BEHAVIOUR_LIST = eINSTANCE.getMission_BehaviourList();

    /**
     * The meta object literal for the '<em><b>Goal Condition</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MISSION__GOAL_CONDITION = eINSTANCE.getMission_GoalCondition();

    /**
     * The meta object literal for the '{@link des.missionrobot.robotDSL.impl.BehaviourImpl <em>Behaviour</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see des.missionrobot.robotDSL.impl.BehaviourImpl
     * @see des.missionrobot.robotDSL.impl.RobotDSLPackageImpl#getBehaviour()
     * @generated
     */
    EClass BEHAVIOUR = eINSTANCE.getBehaviour();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BEHAVIOUR__NAME = eINSTANCE.getBehaviour_Name();

    /**
     * The meta object literal for the '<em><b>Prio</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BEHAVIOUR__PRIO = eINSTANCE.getBehaviour_Prio();

    /**
     * The meta object literal for the '<em><b>Action List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BEHAVIOUR__ACTION_LIST = eINSTANCE.getBehaviour_ActionList();

    /**
     * The meta object literal for the '<em><b>Trigger List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BEHAVIOUR__TRIGGER_LIST = eINSTANCE.getBehaviour_TriggerList();

    /**
     * The meta object literal for the '<em><b>Device List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BEHAVIOUR__DEVICE_LIST = eINSTANCE.getBehaviour_DeviceList();

    /**
     * The meta object literal for the '{@link des.missionrobot.robotDSL.impl.ActionImpl <em>Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see des.missionrobot.robotDSL.impl.ActionImpl
     * @see des.missionrobot.robotDSL.impl.RobotDSLPackageImpl#getAction()
     * @generated
     */
    EClass ACTION = eINSTANCE.getAction();

    /**
     * The meta object literal for the '{@link des.missionrobot.robotDSL.impl.MovementImpl <em>Movement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see des.missionrobot.robotDSL.impl.MovementImpl
     * @see des.missionrobot.robotDSL.impl.RobotDSLPackageImpl#getMovement()
     * @generated
     */
    EClass MOVEMENT = eINSTANCE.getMovement();

    /**
     * The meta object literal for the '{@link des.missionrobot.robotDSL.impl.MoveForwardImpl <em>Move Forward</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see des.missionrobot.robotDSL.impl.MoveForwardImpl
     * @see des.missionrobot.robotDSL.impl.RobotDSLPackageImpl#getMoveForward()
     * @generated
     */
    EClass MOVE_FORWARD = eINSTANCE.getMoveForward();

    /**
     * The meta object literal for the '<em><b>Fspeed</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MOVE_FORWARD__FSPEED = eINSTANCE.getMoveForward_Fspeed();

    /**
     * The meta object literal for the '{@link des.missionrobot.robotDSL.impl.MoveBackwardImpl <em>Move Backward</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see des.missionrobot.robotDSL.impl.MoveBackwardImpl
     * @see des.missionrobot.robotDSL.impl.RobotDSLPackageImpl#getMoveBackward()
     * @generated
     */
    EClass MOVE_BACKWARD = eINSTANCE.getMoveBackward();

    /**
     * The meta object literal for the '<em><b>Bspeed</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MOVE_BACKWARD__BSPEED = eINSTANCE.getMoveBackward_Bspeed();

    /**
     * The meta object literal for the '{@link des.missionrobot.robotDSL.impl.TurnImpl <em>Turn</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see des.missionrobot.robotDSL.impl.TurnImpl
     * @see des.missionrobot.robotDSL.impl.RobotDSLPackageImpl#getTurn()
     * @generated
     */
    EClass TURN = eINSTANCE.getTurn();

    /**
     * The meta object literal for the '<em><b>Angle</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TURN__ANGLE = eINSTANCE.getTurn_Angle();

    /**
     * The meta object literal for the '{@link des.missionrobot.robotDSL.impl.StopImpl <em>Stop</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see des.missionrobot.robotDSL.impl.StopImpl
     * @see des.missionrobot.robotDSL.impl.RobotDSLPackageImpl#getStop()
     * @generated
     */
    EClass STOP = eINSTANCE.getStop();

    /**
     * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STOP__DURATION = eINSTANCE.getStop_Duration();

    /**
     * The meta object literal for the '{@link des.missionrobot.robotDSL.impl.SoundImpl <em>Sound</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see des.missionrobot.robotDSL.impl.SoundImpl
     * @see des.missionrobot.robotDSL.impl.RobotDSLPackageImpl#getSound()
     * @generated
     */
    EClass SOUND = eINSTANCE.getSound();

    /**
     * The meta object literal for the '<em><b>Sound Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SOUND__SOUND_NAME = eINSTANCE.getSound_SoundName();

    /**
     * The meta object literal for the '{@link des.missionrobot.robotDSL.impl.IOImpl <em>IO</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see des.missionrobot.robotDSL.impl.IOImpl
     * @see des.missionrobot.robotDSL.impl.RobotDSLPackageImpl#getIO()
     * @generated
     */
    EClass IO = eINSTANCE.getIO();

    /**
     * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IO__MESSAGE = eINSTANCE.getIO_Message();

    /**
     * The meta object literal for the '{@link des.missionrobot.robotDSL.impl.TriggerImpl <em>Trigger</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see des.missionrobot.robotDSL.impl.TriggerImpl
     * @see des.missionrobot.robotDSL.impl.RobotDSLPackageImpl#getTrigger()
     * @generated
     */
    EClass TRIGGER = eINSTANCE.getTrigger();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRIGGER__CONDITION = eINSTANCE.getTrigger_Condition();

    /**
     * The meta object literal for the '{@link des.missionrobot.robotDSL.impl.DeviceImpl <em>Device</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see des.missionrobot.robotDSL.impl.DeviceImpl
     * @see des.missionrobot.robotDSL.impl.RobotDSLPackageImpl#getDevice()
     * @generated
     */
    EClass DEVICE = eINSTANCE.getDevice();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEVICE__TYPE = eINSTANCE.getDevice_Type();

  }

} //RobotDSLPackage
