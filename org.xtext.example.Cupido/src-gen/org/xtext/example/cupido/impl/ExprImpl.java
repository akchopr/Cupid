/**
 */
package org.xtext.example.cupido.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.cupido.CupidoPackage;
import org.xtext.example.cupido.Event;
import org.xtext.example.cupido.Expr;
import org.xtext.example.cupido.TimeStamp;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.cupido.impl.ExprImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link org.xtext.example.cupido.impl.ExprImpl#getLTime <em>LTime</em>}</li>
 *   <li>{@link org.xtext.example.cupido.impl.ExprImpl#getRTime <em>RTime</em>}</li>
 *   <li>{@link org.xtext.example.cupido.impl.ExprImpl#getLeft <em>Left</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExprImpl extends MinimalEObjectImpl.Container implements Expr
{
  /**
   * The cached value of the '{@link #getEvent() <em>Event</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvent()
   * @generated
   * @ordered
   */
  protected Event event;

  /**
   * The cached value of the '{@link #getLTime() <em>LTime</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLTime()
   * @generated
   * @ordered
   */
  protected TimeStamp lTime;

  /**
   * The cached value of the '{@link #getRTime() <em>RTime</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRTime()
   * @generated
   * @ordered
   */
  protected TimeStamp rTime;

  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected Expr left;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExprImpl()
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
    return CupidoPackage.Literals.EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Event getEvent()
  {
    return event;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEvent(Event newEvent, NotificationChain msgs)
  {
    Event oldEvent = event;
    event = newEvent;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CupidoPackage.EXPR__EVENT, oldEvent, newEvent);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEvent(Event newEvent)
  {
    if (newEvent != event)
    {
      NotificationChain msgs = null;
      if (event != null)
        msgs = ((InternalEObject)event).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CupidoPackage.EXPR__EVENT, null, msgs);
      if (newEvent != null)
        msgs = ((InternalEObject)newEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CupidoPackage.EXPR__EVENT, null, msgs);
      msgs = basicSetEvent(newEvent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CupidoPackage.EXPR__EVENT, newEvent, newEvent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimeStamp getLTime()
  {
    return lTime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLTime(TimeStamp newLTime, NotificationChain msgs)
  {
    TimeStamp oldLTime = lTime;
    lTime = newLTime;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CupidoPackage.EXPR__LTIME, oldLTime, newLTime);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLTime(TimeStamp newLTime)
  {
    if (newLTime != lTime)
    {
      NotificationChain msgs = null;
      if (lTime != null)
        msgs = ((InternalEObject)lTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CupidoPackage.EXPR__LTIME, null, msgs);
      if (newLTime != null)
        msgs = ((InternalEObject)newLTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CupidoPackage.EXPR__LTIME, null, msgs);
      msgs = basicSetLTime(newLTime, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CupidoPackage.EXPR__LTIME, newLTime, newLTime));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimeStamp getRTime()
  {
    return rTime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRTime(TimeStamp newRTime, NotificationChain msgs)
  {
    TimeStamp oldRTime = rTime;
    rTime = newRTime;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CupidoPackage.EXPR__RTIME, oldRTime, newRTime);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRTime(TimeStamp newRTime)
  {
    if (newRTime != rTime)
    {
      NotificationChain msgs = null;
      if (rTime != null)
        msgs = ((InternalEObject)rTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CupidoPackage.EXPR__RTIME, null, msgs);
      if (newRTime != null)
        msgs = ((InternalEObject)newRTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CupidoPackage.EXPR__RTIME, null, msgs);
      msgs = basicSetRTime(newRTime, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CupidoPackage.EXPR__RTIME, newRTime, newRTime));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft(Expr newLeft, NotificationChain msgs)
  {
    Expr oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CupidoPackage.EXPR__LEFT, oldLeft, newLeft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeft(Expr newLeft)
  {
    if (newLeft != left)
    {
      NotificationChain msgs = null;
      if (left != null)
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CupidoPackage.EXPR__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CupidoPackage.EXPR__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CupidoPackage.EXPR__LEFT, newLeft, newLeft));
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
      case CupidoPackage.EXPR__EVENT:
        return basicSetEvent(null, msgs);
      case CupidoPackage.EXPR__LTIME:
        return basicSetLTime(null, msgs);
      case CupidoPackage.EXPR__RTIME:
        return basicSetRTime(null, msgs);
      case CupidoPackage.EXPR__LEFT:
        return basicSetLeft(null, msgs);
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
      case CupidoPackage.EXPR__EVENT:
        return getEvent();
      case CupidoPackage.EXPR__LTIME:
        return getLTime();
      case CupidoPackage.EXPR__RTIME:
        return getRTime();
      case CupidoPackage.EXPR__LEFT:
        return getLeft();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CupidoPackage.EXPR__EVENT:
        setEvent((Event)newValue);
        return;
      case CupidoPackage.EXPR__LTIME:
        setLTime((TimeStamp)newValue);
        return;
      case CupidoPackage.EXPR__RTIME:
        setRTime((TimeStamp)newValue);
        return;
      case CupidoPackage.EXPR__LEFT:
        setLeft((Expr)newValue);
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
      case CupidoPackage.EXPR__EVENT:
        setEvent((Event)null);
        return;
      case CupidoPackage.EXPR__LTIME:
        setLTime((TimeStamp)null);
        return;
      case CupidoPackage.EXPR__RTIME:
        setRTime((TimeStamp)null);
        return;
      case CupidoPackage.EXPR__LEFT:
        setLeft((Expr)null);
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
      case CupidoPackage.EXPR__EVENT:
        return event != null;
      case CupidoPackage.EXPR__LTIME:
        return lTime != null;
      case CupidoPackage.EXPR__RTIME:
        return rTime != null;
      case CupidoPackage.EXPR__LEFT:
        return left != null;
    }
    return super.eIsSet(featureID);
  }

} //ExprImpl
