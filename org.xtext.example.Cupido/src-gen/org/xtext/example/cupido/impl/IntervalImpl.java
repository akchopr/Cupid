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
import org.xtext.example.cupido.Interval;
import org.xtext.example.cupido.TimeStamp;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interval</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.cupido.impl.IntervalImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link org.xtext.example.cupido.impl.IntervalImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link org.xtext.example.cupido.impl.IntervalImpl#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntervalImpl extends MinimalEObjectImpl.Container implements Interval
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
   * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected TimeStamp left;

  /**
   * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected TimeStamp right;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IntervalImpl()
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
    return CupidoPackage.Literals.INTERVAL;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CupidoPackage.INTERVAL__EVENT, oldEvent, newEvent);
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
        msgs = ((InternalEObject)event).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CupidoPackage.INTERVAL__EVENT, null, msgs);
      if (newEvent != null)
        msgs = ((InternalEObject)newEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CupidoPackage.INTERVAL__EVENT, null, msgs);
      msgs = basicSetEvent(newEvent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CupidoPackage.INTERVAL__EVENT, newEvent, newEvent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimeStamp getLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft(TimeStamp newLeft, NotificationChain msgs)
  {
    TimeStamp oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CupidoPackage.INTERVAL__LEFT, oldLeft, newLeft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeft(TimeStamp newLeft)
  {
    if (newLeft != left)
    {
      NotificationChain msgs = null;
      if (left != null)
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CupidoPackage.INTERVAL__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CupidoPackage.INTERVAL__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CupidoPackage.INTERVAL__LEFT, newLeft, newLeft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimeStamp getRight()
  {
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRight(TimeStamp newRight, NotificationChain msgs)
  {
    TimeStamp oldRight = right;
    right = newRight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CupidoPackage.INTERVAL__RIGHT, oldRight, newRight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRight(TimeStamp newRight)
  {
    if (newRight != right)
    {
      NotificationChain msgs = null;
      if (right != null)
        msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CupidoPackage.INTERVAL__RIGHT, null, msgs);
      if (newRight != null)
        msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CupidoPackage.INTERVAL__RIGHT, null, msgs);
      msgs = basicSetRight(newRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CupidoPackage.INTERVAL__RIGHT, newRight, newRight));
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
      case CupidoPackage.INTERVAL__EVENT:
        return basicSetEvent(null, msgs);
      case CupidoPackage.INTERVAL__LEFT:
        return basicSetLeft(null, msgs);
      case CupidoPackage.INTERVAL__RIGHT:
        return basicSetRight(null, msgs);
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
      case CupidoPackage.INTERVAL__EVENT:
        return getEvent();
      case CupidoPackage.INTERVAL__LEFT:
        return getLeft();
      case CupidoPackage.INTERVAL__RIGHT:
        return getRight();
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
      case CupidoPackage.INTERVAL__EVENT:
        setEvent((Event)newValue);
        return;
      case CupidoPackage.INTERVAL__LEFT:
        setLeft((TimeStamp)newValue);
        return;
      case CupidoPackage.INTERVAL__RIGHT:
        setRight((TimeStamp)newValue);
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
      case CupidoPackage.INTERVAL__EVENT:
        setEvent((Event)null);
        return;
      case CupidoPackage.INTERVAL__LEFT:
        setLeft((TimeStamp)null);
        return;
      case CupidoPackage.INTERVAL__RIGHT:
        setRight((TimeStamp)null);
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
      case CupidoPackage.INTERVAL__EVENT:
        return event != null;
      case CupidoPackage.INTERVAL__LEFT:
        return left != null;
      case CupidoPackage.INTERVAL__RIGHT:
        return right != null;
    }
    return super.eIsSet(featureID);
  }

} //IntervalImpl
