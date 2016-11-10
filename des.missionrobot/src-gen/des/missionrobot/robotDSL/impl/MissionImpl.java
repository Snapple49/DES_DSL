/**
 * generated by Xtext 2.10.0
 */
package des.missionrobot.robotDSL.impl;

import des.missionrobot.robotDSL.Behaviour;
import des.missionrobot.robotDSL.Mission;
import des.missionrobot.robotDSL.RobotDSLPackage;
import des.missionrobot.robotDSL.Trigger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mission</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link des.missionrobot.robotDSL.impl.MissionImpl#getName <em>Name</em>}</li>
 *   <li>{@link des.missionrobot.robotDSL.impl.MissionImpl#getBehaviourList <em>Behaviour List</em>}</li>
 *   <li>{@link des.missionrobot.robotDSL.impl.MissionImpl#getGoalCondition <em>Goal Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MissionImpl extends MinimalEObjectImpl.Container implements Mission
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getBehaviourList() <em>Behaviour List</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBehaviourList()
   * @generated
   * @ordered
   */
  protected EList<Behaviour> behaviourList;

  /**
   * The cached value of the '{@link #getGoalCondition() <em>Goal Condition</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGoalCondition()
   * @generated
   * @ordered
   */
  protected EList<Trigger> goalCondition;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MissionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return RobotDSLPackage.Literals.MISSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RobotDSLPackage.MISSION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Behaviour> getBehaviourList()
  {
    if (behaviourList == null)
    {
      behaviourList = new EObjectContainmentEList<Behaviour>(Behaviour.class, this, RobotDSLPackage.MISSION__BEHAVIOUR_LIST);
    }
    return behaviourList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Trigger> getGoalCondition()
  {
    if (goalCondition == null)
    {
      goalCondition = new EObjectContainmentEList<Trigger>(Trigger.class, this, RobotDSLPackage.MISSION__GOAL_CONDITION);
    }
    return goalCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case RobotDSLPackage.MISSION__BEHAVIOUR_LIST:
        return ((InternalEList<?>)getBehaviourList()).basicRemove(otherEnd, msgs);
      case RobotDSLPackage.MISSION__GOAL_CONDITION:
        return ((InternalEList<?>)getGoalCondition()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case RobotDSLPackage.MISSION__NAME:
        return getName();
      case RobotDSLPackage.MISSION__BEHAVIOUR_LIST:
        return getBehaviourList();
      case RobotDSLPackage.MISSION__GOAL_CONDITION:
        return getGoalCondition();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RobotDSLPackage.MISSION__NAME:
        setName((String)newValue);
        return;
      case RobotDSLPackage.MISSION__BEHAVIOUR_LIST:
        getBehaviourList().clear();
        getBehaviourList().addAll((Collection<? extends Behaviour>)newValue);
        return;
      case RobotDSLPackage.MISSION__GOAL_CONDITION:
        getGoalCondition().clear();
        getGoalCondition().addAll((Collection<? extends Trigger>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case RobotDSLPackage.MISSION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RobotDSLPackage.MISSION__BEHAVIOUR_LIST:
        getBehaviourList().clear();
        return;
      case RobotDSLPackage.MISSION__GOAL_CONDITION:
        getGoalCondition().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case RobotDSLPackage.MISSION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RobotDSLPackage.MISSION__BEHAVIOUR_LIST:
        return behaviourList != null && !behaviourList.isEmpty();
      case RobotDSLPackage.MISSION__GOAL_CONDITION:
        return goalCondition != null && !goalCondition.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //MissionImpl