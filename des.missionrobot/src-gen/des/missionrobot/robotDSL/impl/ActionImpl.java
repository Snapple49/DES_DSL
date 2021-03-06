/**
 * generated by Xtext 2.10.0
 */
package des.missionrobot.robotDSL.impl;

import des.missionrobot.robotDSL.Action;
import des.missionrobot.robotDSL.ArmOp;
import des.missionrobot.robotDSL.Bool;
import des.missionrobot.robotDSL.Direction;
import des.missionrobot.robotDSL.Flag;
import des.missionrobot.robotDSL.RobotDSLPackage;
import des.missionrobot.robotDSL.Sound;
import des.missionrobot.robotDSL.Speed;
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
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link des.missionrobot.robotDSL.impl.ActionImpl#getMoveDir <em>Move Dir</em>}</li>
 *   <li>{@link des.missionrobot.robotDSL.impl.ActionImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link des.missionrobot.robotDSL.impl.ActionImpl#getSpeed <em>Speed</em>}</li>
 *   <li>{@link des.missionrobot.robotDSL.impl.ActionImpl#getTurnDir <em>Turn Dir</em>}</li>
 *   <li>{@link des.missionrobot.robotDSL.impl.ActionImpl#getDegr <em>Degr</em>}</li>
 *   <li>{@link des.missionrobot.robotDSL.impl.ActionImpl#getTrig <em>Trig</em>}</li>
 *   <li>{@link des.missionrobot.robotDSL.impl.ActionImpl#getOp <em>Op</em>}</li>
 *   <li>{@link des.missionrobot.robotDSL.impl.ActionImpl#getSound <em>Sound</em>}</li>
 *   <li>{@link des.missionrobot.robotDSL.impl.ActionImpl#getFlag <em>Flag</em>}</li>
 *   <li>{@link des.missionrobot.robotDSL.impl.ActionImpl#getBool <em>Bool</em>}</li>
 *   <li>{@link des.missionrobot.robotDSL.impl.ActionImpl#getCent <em>Cent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionImpl extends MinimalEObjectImpl.Container implements Action
{
  /**
   * The cached value of the '{@link #getMoveDir() <em>Move Dir</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMoveDir()
   * @generated
   * @ordered
   */
  protected Direction moveDir;

  /**
   * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDuration()
   * @generated
   * @ordered
   */
  protected static final int DURATION_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDuration()
   * @generated
   * @ordered
   */
  protected int duration = DURATION_EDEFAULT;

  /**
   * The cached value of the '{@link #getSpeed() <em>Speed</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpeed()
   * @generated
   * @ordered
   */
  protected Speed speed;

  /**
   * The cached value of the '{@link #getTurnDir() <em>Turn Dir</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTurnDir()
   * @generated
   * @ordered
   */
  protected Direction turnDir;

  /**
   * The default value of the '{@link #getDegr() <em>Degr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDegr()
   * @generated
   * @ordered
   */
  protected static final int DEGR_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDegr() <em>Degr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDegr()
   * @generated
   * @ordered
   */
  protected int degr = DEGR_EDEFAULT;

  /**
   * The cached value of the '{@link #getTrig() <em>Trig</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrig()
   * @generated
   * @ordered
   */
  protected EList<Trigger> trig;

  /**
   * The cached value of the '{@link #getOp() <em>Op</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected ArmOp op;

  /**
   * The cached value of the '{@link #getSound() <em>Sound</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSound()
   * @generated
   * @ordered
   */
  protected Sound sound;

  /**
   * The cached value of the '{@link #getFlag() <em>Flag</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFlag()
   * @generated
   * @ordered
   */
  protected Flag flag;

  /**
   * The cached value of the '{@link #getBool() <em>Bool</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBool()
   * @generated
   * @ordered
   */
  protected Bool bool;

  /**
   * The default value of the '{@link #getCent() <em>Cent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCent()
   * @generated
   * @ordered
   */
  protected static final String CENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCent() <em>Cent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCent()
   * @generated
   * @ordered
   */
  protected String cent = CENT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActionImpl()
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
    return RobotDSLPackage.Literals.ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Direction getMoveDir()
  {
    return moveDir;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMoveDir(Direction newMoveDir, NotificationChain msgs)
  {
    Direction oldMoveDir = moveDir;
    moveDir = newMoveDir;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RobotDSLPackage.ACTION__MOVE_DIR, oldMoveDir, newMoveDir);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMoveDir(Direction newMoveDir)
  {
    if (newMoveDir != moveDir)
    {
      NotificationChain msgs = null;
      if (moveDir != null)
        msgs = ((InternalEObject)moveDir).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RobotDSLPackage.ACTION__MOVE_DIR, null, msgs);
      if (newMoveDir != null)
        msgs = ((InternalEObject)newMoveDir).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RobotDSLPackage.ACTION__MOVE_DIR, null, msgs);
      msgs = basicSetMoveDir(newMoveDir, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RobotDSLPackage.ACTION__MOVE_DIR, newMoveDir, newMoveDir));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getDuration()
  {
    return duration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDuration(int newDuration)
  {
    int oldDuration = duration;
    duration = newDuration;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RobotDSLPackage.ACTION__DURATION, oldDuration, duration));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Speed getSpeed()
  {
    return speed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSpeed(Speed newSpeed, NotificationChain msgs)
  {
    Speed oldSpeed = speed;
    speed = newSpeed;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RobotDSLPackage.ACTION__SPEED, oldSpeed, newSpeed);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSpeed(Speed newSpeed)
  {
    if (newSpeed != speed)
    {
      NotificationChain msgs = null;
      if (speed != null)
        msgs = ((InternalEObject)speed).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RobotDSLPackage.ACTION__SPEED, null, msgs);
      if (newSpeed != null)
        msgs = ((InternalEObject)newSpeed).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RobotDSLPackage.ACTION__SPEED, null, msgs);
      msgs = basicSetSpeed(newSpeed, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RobotDSLPackage.ACTION__SPEED, newSpeed, newSpeed));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Direction getTurnDir()
  {
    return turnDir;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTurnDir(Direction newTurnDir, NotificationChain msgs)
  {
    Direction oldTurnDir = turnDir;
    turnDir = newTurnDir;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RobotDSLPackage.ACTION__TURN_DIR, oldTurnDir, newTurnDir);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTurnDir(Direction newTurnDir)
  {
    if (newTurnDir != turnDir)
    {
      NotificationChain msgs = null;
      if (turnDir != null)
        msgs = ((InternalEObject)turnDir).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RobotDSLPackage.ACTION__TURN_DIR, null, msgs);
      if (newTurnDir != null)
        msgs = ((InternalEObject)newTurnDir).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RobotDSLPackage.ACTION__TURN_DIR, null, msgs);
      msgs = basicSetTurnDir(newTurnDir, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RobotDSLPackage.ACTION__TURN_DIR, newTurnDir, newTurnDir));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getDegr()
  {
    return degr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDegr(int newDegr)
  {
    int oldDegr = degr;
    degr = newDegr;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RobotDSLPackage.ACTION__DEGR, oldDegr, degr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Trigger> getTrig()
  {
    if (trig == null)
    {
      trig = new EObjectContainmentEList<Trigger>(Trigger.class, this, RobotDSLPackage.ACTION__TRIG);
    }
    return trig;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArmOp getOp()
  {
    return op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOp(ArmOp newOp, NotificationChain msgs)
  {
    ArmOp oldOp = op;
    op = newOp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RobotDSLPackage.ACTION__OP, oldOp, newOp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOp(ArmOp newOp)
  {
    if (newOp != op)
    {
      NotificationChain msgs = null;
      if (op != null)
        msgs = ((InternalEObject)op).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RobotDSLPackage.ACTION__OP, null, msgs);
      if (newOp != null)
        msgs = ((InternalEObject)newOp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RobotDSLPackage.ACTION__OP, null, msgs);
      msgs = basicSetOp(newOp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RobotDSLPackage.ACTION__OP, newOp, newOp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sound getSound()
  {
    return sound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSound(Sound newSound, NotificationChain msgs)
  {
    Sound oldSound = sound;
    sound = newSound;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RobotDSLPackage.ACTION__SOUND, oldSound, newSound);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSound(Sound newSound)
  {
    if (newSound != sound)
    {
      NotificationChain msgs = null;
      if (sound != null)
        msgs = ((InternalEObject)sound).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RobotDSLPackage.ACTION__SOUND, null, msgs);
      if (newSound != null)
        msgs = ((InternalEObject)newSound).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RobotDSLPackage.ACTION__SOUND, null, msgs);
      msgs = basicSetSound(newSound, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RobotDSLPackage.ACTION__SOUND, newSound, newSound));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Flag getFlag()
  {
    if (flag != null && flag.eIsProxy())
    {
      InternalEObject oldFlag = (InternalEObject)flag;
      flag = (Flag)eResolveProxy(oldFlag);
      if (flag != oldFlag)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RobotDSLPackage.ACTION__FLAG, oldFlag, flag));
      }
    }
    return flag;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Flag basicGetFlag()
  {
    return flag;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFlag(Flag newFlag)
  {
    Flag oldFlag = flag;
    flag = newFlag;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RobotDSLPackage.ACTION__FLAG, oldFlag, flag));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Bool getBool()
  {
    return bool;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBool(Bool newBool, NotificationChain msgs)
  {
    Bool oldBool = bool;
    bool = newBool;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RobotDSLPackage.ACTION__BOOL, oldBool, newBool);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBool(Bool newBool)
  {
    if (newBool != bool)
    {
      NotificationChain msgs = null;
      if (bool != null)
        msgs = ((InternalEObject)bool).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RobotDSLPackage.ACTION__BOOL, null, msgs);
      if (newBool != null)
        msgs = ((InternalEObject)newBool).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RobotDSLPackage.ACTION__BOOL, null, msgs);
      msgs = basicSetBool(newBool, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RobotDSLPackage.ACTION__BOOL, newBool, newBool));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCent()
  {
    return cent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCent(String newCent)
  {
    String oldCent = cent;
    cent = newCent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RobotDSLPackage.ACTION__CENT, oldCent, cent));
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
      case RobotDSLPackage.ACTION__MOVE_DIR:
        return basicSetMoveDir(null, msgs);
      case RobotDSLPackage.ACTION__SPEED:
        return basicSetSpeed(null, msgs);
      case RobotDSLPackage.ACTION__TURN_DIR:
        return basicSetTurnDir(null, msgs);
      case RobotDSLPackage.ACTION__TRIG:
        return ((InternalEList<?>)getTrig()).basicRemove(otherEnd, msgs);
      case RobotDSLPackage.ACTION__OP:
        return basicSetOp(null, msgs);
      case RobotDSLPackage.ACTION__SOUND:
        return basicSetSound(null, msgs);
      case RobotDSLPackage.ACTION__BOOL:
        return basicSetBool(null, msgs);
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
      case RobotDSLPackage.ACTION__MOVE_DIR:
        return getMoveDir();
      case RobotDSLPackage.ACTION__DURATION:
        return getDuration();
      case RobotDSLPackage.ACTION__SPEED:
        return getSpeed();
      case RobotDSLPackage.ACTION__TURN_DIR:
        return getTurnDir();
      case RobotDSLPackage.ACTION__DEGR:
        return getDegr();
      case RobotDSLPackage.ACTION__TRIG:
        return getTrig();
      case RobotDSLPackage.ACTION__OP:
        return getOp();
      case RobotDSLPackage.ACTION__SOUND:
        return getSound();
      case RobotDSLPackage.ACTION__FLAG:
        if (resolve) return getFlag();
        return basicGetFlag();
      case RobotDSLPackage.ACTION__BOOL:
        return getBool();
      case RobotDSLPackage.ACTION__CENT:
        return getCent();
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
      case RobotDSLPackage.ACTION__MOVE_DIR:
        setMoveDir((Direction)newValue);
        return;
      case RobotDSLPackage.ACTION__DURATION:
        setDuration((Integer)newValue);
        return;
      case RobotDSLPackage.ACTION__SPEED:
        setSpeed((Speed)newValue);
        return;
      case RobotDSLPackage.ACTION__TURN_DIR:
        setTurnDir((Direction)newValue);
        return;
      case RobotDSLPackage.ACTION__DEGR:
        setDegr((Integer)newValue);
        return;
      case RobotDSLPackage.ACTION__TRIG:
        getTrig().clear();
        getTrig().addAll((Collection<? extends Trigger>)newValue);
        return;
      case RobotDSLPackage.ACTION__OP:
        setOp((ArmOp)newValue);
        return;
      case RobotDSLPackage.ACTION__SOUND:
        setSound((Sound)newValue);
        return;
      case RobotDSLPackage.ACTION__FLAG:
        setFlag((Flag)newValue);
        return;
      case RobotDSLPackage.ACTION__BOOL:
        setBool((Bool)newValue);
        return;
      case RobotDSLPackage.ACTION__CENT:
        setCent((String)newValue);
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
      case RobotDSLPackage.ACTION__MOVE_DIR:
        setMoveDir((Direction)null);
        return;
      case RobotDSLPackage.ACTION__DURATION:
        setDuration(DURATION_EDEFAULT);
        return;
      case RobotDSLPackage.ACTION__SPEED:
        setSpeed((Speed)null);
        return;
      case RobotDSLPackage.ACTION__TURN_DIR:
        setTurnDir((Direction)null);
        return;
      case RobotDSLPackage.ACTION__DEGR:
        setDegr(DEGR_EDEFAULT);
        return;
      case RobotDSLPackage.ACTION__TRIG:
        getTrig().clear();
        return;
      case RobotDSLPackage.ACTION__OP:
        setOp((ArmOp)null);
        return;
      case RobotDSLPackage.ACTION__SOUND:
        setSound((Sound)null);
        return;
      case RobotDSLPackage.ACTION__FLAG:
        setFlag((Flag)null);
        return;
      case RobotDSLPackage.ACTION__BOOL:
        setBool((Bool)null);
        return;
      case RobotDSLPackage.ACTION__CENT:
        setCent(CENT_EDEFAULT);
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
      case RobotDSLPackage.ACTION__MOVE_DIR:
        return moveDir != null;
      case RobotDSLPackage.ACTION__DURATION:
        return duration != DURATION_EDEFAULT;
      case RobotDSLPackage.ACTION__SPEED:
        return speed != null;
      case RobotDSLPackage.ACTION__TURN_DIR:
        return turnDir != null;
      case RobotDSLPackage.ACTION__DEGR:
        return degr != DEGR_EDEFAULT;
      case RobotDSLPackage.ACTION__TRIG:
        return trig != null && !trig.isEmpty();
      case RobotDSLPackage.ACTION__OP:
        return op != null;
      case RobotDSLPackage.ACTION__SOUND:
        return sound != null;
      case RobotDSLPackage.ACTION__FLAG:
        return flag != null;
      case RobotDSLPackage.ACTION__BOOL:
        return bool != null;
      case RobotDSLPackage.ACTION__CENT:
        return CENT_EDEFAULT == null ? cent != null : !CENT_EDEFAULT.equals(cent);
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
    result.append(" (duration: ");
    result.append(duration);
    result.append(", degr: ");
    result.append(degr);
    result.append(", cent: ");
    result.append(cent);
    result.append(')');
    return result.toString();
  }

} //ActionImpl
