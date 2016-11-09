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
      public Adapter caseBehaviour(Behaviour object)
      {
        return createBehaviourAdapter();
      }
      @Override
      public Adapter caseMovement(Movement object)
      {
        return createMovementAdapter();
      }
      @Override
      public Adapter caseMoveForward(MoveForward object)
      {
        return createMoveForwardAdapter();
      }
      @Override
      public Adapter caseMoveBackward(MoveBackward object)
      {
        return createMoveBackwardAdapter();
      }
      @Override
      public Adapter caseTurn(Turn object)
      {
        return createTurnAdapter();
      }
      @Override
      public Adapter caseStop(Stop object)
      {
        return createStopAdapter();
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
   * Creates a new adapter for an object of class '{@link des.missionrobot.robotDSL.Behaviour <em>Behaviour</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see des.missionrobot.robotDSL.Behaviour
   * @generated
   */
  public Adapter createBehaviourAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link des.missionrobot.robotDSL.Movement <em>Movement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see des.missionrobot.robotDSL.Movement
   * @generated
   */
  public Adapter createMovementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link des.missionrobot.robotDSL.MoveForward <em>Move Forward</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see des.missionrobot.robotDSL.MoveForward
   * @generated
   */
  public Adapter createMoveForwardAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link des.missionrobot.robotDSL.MoveBackward <em>Move Backward</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see des.missionrobot.robotDSL.MoveBackward
   * @generated
   */
  public Adapter createMoveBackwardAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link des.missionrobot.robotDSL.Turn <em>Turn</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see des.missionrobot.robotDSL.Turn
   * @generated
   */
  public Adapter createTurnAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link des.missionrobot.robotDSL.Stop <em>Stop</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see des.missionrobot.robotDSL.Stop
   * @generated
   */
  public Adapter createStopAdapter()
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
