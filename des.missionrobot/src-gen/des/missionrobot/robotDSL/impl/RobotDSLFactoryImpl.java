/**
 * generated by Xtext 2.10.0
 */
package des.missionrobot.robotDSL.impl;

import des.missionrobot.robotDSL.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RobotDSLFactoryImpl extends EFactoryImpl implements RobotDSLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RobotDSLFactory init()
  {
    try
    {
      RobotDSLFactory theRobotDSLFactory = (RobotDSLFactory)EPackage.Registry.INSTANCE.getEFactory(RobotDSLPackage.eNS_URI);
      if (theRobotDSLFactory != null)
      {
        return theRobotDSLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new RobotDSLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RobotDSLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case RobotDSLPackage.MISSIONS: return createMissions();
      case RobotDSLPackage.MISSION: return createMission();
      case RobotDSLPackage.GOAL: return createGoal();
      case RobotDSLPackage.TASK: return createTask();
      case RobotDSLPackage.ACTION: return createAction();
      case RobotDSLPackage.TRIGGER: return createTrigger();
      case RobotDSLPackage.DISTANCE: return createDistance();
      case RobotDSLPackage.FLAG: return createFlag();
      case RobotDSLPackage.TIME: return createTime();
      case RobotDSLPackage.DIRECTION: return createDirection();
      case RobotDSLPackage.SPEED: return createSpeed();
      case RobotDSLPackage.ARM_OP: return createArmOp();
      case RobotDSLPackage.SOUND: return createSound();
      case RobotDSLPackage.SENSOR: return createSensor();
      case RobotDSLPackage.COLOR: return createColor();
      case RobotDSLPackage.BOOL: return createBool();
      case RobotDSLPackage.NEGATION: return createNegation();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case RobotDSLPackage.DIRECTION_VAL:
        return createDirectionValFromString(eDataType, initialValue);
      case RobotDSLPackage.SPEED_VAL:
        return createSpeedValFromString(eDataType, initialValue);
      case RobotDSLPackage.ARM_OP_TYPE:
        return createArmOpTypeFromString(eDataType, initialValue);
      case RobotDSLPackage.SOUND_NAME:
        return createSoundNameFromString(eDataType, initialValue);
      case RobotDSLPackage.SENSOR_TYPE:
        return createSensorTypeFromString(eDataType, initialValue);
      case RobotDSLPackage.COLOR_NAME:
        return createColorNameFromString(eDataType, initialValue);
      case RobotDSLPackage.BOOL_TYPE:
        return createBoolTypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case RobotDSLPackage.DIRECTION_VAL:
        return convertDirectionValToString(eDataType, instanceValue);
      case RobotDSLPackage.SPEED_VAL:
        return convertSpeedValToString(eDataType, instanceValue);
      case RobotDSLPackage.ARM_OP_TYPE:
        return convertArmOpTypeToString(eDataType, instanceValue);
      case RobotDSLPackage.SOUND_NAME:
        return convertSoundNameToString(eDataType, instanceValue);
      case RobotDSLPackage.SENSOR_TYPE:
        return convertSensorTypeToString(eDataType, instanceValue);
      case RobotDSLPackage.COLOR_NAME:
        return convertColorNameToString(eDataType, instanceValue);
      case RobotDSLPackage.BOOL_TYPE:
        return convertBoolTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Missions createMissions()
  {
    MissionsImpl missions = new MissionsImpl();
    return missions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mission createMission()
  {
    MissionImpl mission = new MissionImpl();
    return mission;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Goal createGoal()
  {
    GoalImpl goal = new GoalImpl();
    return goal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Task createTask()
  {
    TaskImpl task = new TaskImpl();
    return task;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action createAction()
  {
    ActionImpl action = new ActionImpl();
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Trigger createTrigger()
  {
    TriggerImpl trigger = new TriggerImpl();
    return trigger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Distance createDistance()
  {
    DistanceImpl distance = new DistanceImpl();
    return distance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Flag createFlag()
  {
    FlagImpl flag = new FlagImpl();
    return flag;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Time createTime()
  {
    TimeImpl time = new TimeImpl();
    return time;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Direction createDirection()
  {
    DirectionImpl direction = new DirectionImpl();
    return direction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Speed createSpeed()
  {
    SpeedImpl speed = new SpeedImpl();
    return speed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArmOp createArmOp()
  {
    ArmOpImpl armOp = new ArmOpImpl();
    return armOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sound createSound()
  {
    SoundImpl sound = new SoundImpl();
    return sound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sensor createSensor()
  {
    SensorImpl sensor = new SensorImpl();
    return sensor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color createColor()
  {
    ColorImpl color = new ColorImpl();
    return color;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Bool createBool()
  {
    BoolImpl bool = new BoolImpl();
    return bool;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Negation createNegation()
  {
    NegationImpl negation = new NegationImpl();
    return negation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DirectionVal createDirectionValFromString(EDataType eDataType, String initialValue)
  {
    DirectionVal result = DirectionVal.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDirectionValToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpeedVal createSpeedValFromString(EDataType eDataType, String initialValue)
  {
    SpeedVal result = SpeedVal.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertSpeedValToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArmOpType createArmOpTypeFromString(EDataType eDataType, String initialValue)
  {
    ArmOpType result = ArmOpType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertArmOpTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SoundName createSoundNameFromString(EDataType eDataType, String initialValue)
  {
    SoundName result = SoundName.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertSoundNameToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SensorType createSensorTypeFromString(EDataType eDataType, String initialValue)
  {
    SensorType result = SensorType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertSensorTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColorName createColorNameFromString(EDataType eDataType, String initialValue)
  {
    ColorName result = ColorName.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertColorNameToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoolType createBoolTypeFromString(EDataType eDataType, String initialValue)
  {
    BoolType result = BoolType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBoolTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RobotDSLPackage getRobotDSLPackage()
  {
    return (RobotDSLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static RobotDSLPackage getPackage()
  {
    return RobotDSLPackage.eINSTANCE;
  }

} //RobotDSLFactoryImpl
