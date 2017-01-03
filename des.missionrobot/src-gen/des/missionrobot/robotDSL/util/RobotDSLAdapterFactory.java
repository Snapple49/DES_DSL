/**
 * generated by Xtext 2.10.0
 */
package des.missionrobot.robotDSL.util;

import des.missionrobot.robotDSL.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see des.missionrobot.robotDSL.RobotDSLPackage
 * @generated
 */
public class RobotDSLAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static RobotDSLPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RobotDSLAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = RobotDSLPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RobotDSLSwitch<Adapter> modelSwitch =
    new RobotDSLSwitch<Adapter>()
    {
      @Override
      public Adapter caseMissions(Missions object)
      {
        return createMissionsAdapter();
      }
      @Override
      public Adapter caseMission(Mission object)
      {
        return createMissionAdapter();
      }
      @Override
      public Adapter caseGoal(Goal object)
      {
        return createGoalAdapter();
      }
      @Override
      public Adapter caseTask(Task object)
      {
        return createTaskAdapter();
      }
      @Override
      public Adapter caseAction(Action object)
      {
        return createActionAdapter();
      }
      @Override
      public Adapter caseTrigger(Trigger object)
      {
        return createTriggerAdapter();
      }
      @Override
      public Adapter caseDistance(Distance object)
      {
        return createDistanceAdapter();
      }
      @Override
      public Adapter caseFlag(Flag object)
      {
        return createFlagAdapter();
      }
      @Override
      public Adapter caseTime(Time object)
      {
        return createTimeAdapter();
      }
      @Override
      public Adapter caseDirection(Direction object)
      {
        return createDirectionAdapter();
      }
      @Override
      public Adapter caseSpeed(Speed object)
      {
        return createSpeedAdapter();
      }
      @Override
      public Adapter caseArmOp(ArmOp object)
      {
        return createArmOpAdapter();
      }
      @Override
      public Adapter caseSound(Sound object)
      {
        return createSoundAdapter();
      }
      @Override
      public Adapter caseSensor(Sensor object)
      {
        return createSensorAdapter();
      }
      @Override
      public Adapter caseColor(Color object)
      {
        return createColorAdapter();
      }
      @Override
      public Adapter caseBool(Bool object)
      {
        return createBoolAdapter();
      }
      @Override
      public Adapter caseNegation(Negation object)
      {
        return createNegationAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link des.missionrobot.robotDSL.Missions <em>Missions</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see des.missionrobot.robotDSL.Missions
   * @generated
   */
  public Adapter createMissionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link des.missionrobot.robotDSL.Mission <em>Mission</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see des.missionrobot.robotDSL.Mission
   * @generated
   */
  public Adapter createMissionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link des.missionrobot.robotDSL.Goal <em>Goal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see des.missionrobot.robotDSL.Goal
   * @generated
   */
  public Adapter createGoalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link des.missionrobot.robotDSL.Task <em>Task</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see des.missionrobot.robotDSL.Task
   * @generated
   */
  public Adapter createTaskAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link des.missionrobot.robotDSL.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see des.missionrobot.robotDSL.Action
   * @generated
   */
  public Adapter createActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link des.missionrobot.robotDSL.Trigger <em>Trigger</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see des.missionrobot.robotDSL.Trigger
   * @generated
   */
  public Adapter createTriggerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link des.missionrobot.robotDSL.Distance <em>Distance</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see des.missionrobot.robotDSL.Distance
   * @generated
   */
  public Adapter createDistanceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link des.missionrobot.robotDSL.Flag <em>Flag</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see des.missionrobot.robotDSL.Flag
   * @generated
   */
  public Adapter createFlagAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link des.missionrobot.robotDSL.Time <em>Time</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see des.missionrobot.robotDSL.Time
   * @generated
   */
  public Adapter createTimeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link des.missionrobot.robotDSL.Direction <em>Direction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see des.missionrobot.robotDSL.Direction
   * @generated
   */
  public Adapter createDirectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link des.missionrobot.robotDSL.Speed <em>Speed</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see des.missionrobot.robotDSL.Speed
   * @generated
   */
  public Adapter createSpeedAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link des.missionrobot.robotDSL.ArmOp <em>Arm Op</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see des.missionrobot.robotDSL.ArmOp
   * @generated
   */
  public Adapter createArmOpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link des.missionrobot.robotDSL.Sound <em>Sound</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see des.missionrobot.robotDSL.Sound
   * @generated
   */
  public Adapter createSoundAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link des.missionrobot.robotDSL.Sensor <em>Sensor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see des.missionrobot.robotDSL.Sensor
   * @generated
   */
  public Adapter createSensorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link des.missionrobot.robotDSL.Color <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see des.missionrobot.robotDSL.Color
   * @generated
   */
  public Adapter createColorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link des.missionrobot.robotDSL.Bool <em>Bool</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see des.missionrobot.robotDSL.Bool
   * @generated
   */
  public Adapter createBoolAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link des.missionrobot.robotDSL.Negation <em>Negation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see des.missionrobot.robotDSL.Negation
   * @generated
   */
  public Adapter createNegationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //RobotDSLAdapterFactory
