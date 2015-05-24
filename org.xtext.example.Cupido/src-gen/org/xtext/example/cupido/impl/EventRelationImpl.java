/**
 */
package org.xtext.example.cupido.impl;

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

import org.xtext.example.cupido.CupidoPackage;
import org.xtext.example.cupido.Event;
import org.xtext.example.cupido.EventRelation;
import org.xtext.example.cupido.Param;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.cupido.impl.EventRelationImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link org.xtext.example.cupido.impl.EventRelationImpl#getParams <em>Params</em>}</li>
 *   <li>{@link org.xtext.example.cupido.impl.EventRelationImpl#getKeyParams <em>Key Params</em>}</li>
 *   <li>{@link org.xtext.example.cupido.impl.EventRelationImpl#getTimeParam <em>Time Param</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventRelationImpl extends MinimalEObjectImpl.Container implements EventRelation
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
   * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParams()
   * @generated
   * @ordered
   */
  protected EList<Param> params;

  /**
   * The cached value of the '{@link #getKeyParams() <em>Key Params</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKeyParams()
   * @generated
   * @ordered
   */
  protected EList<Param> keyParams;

  /**
   * The cached value of the '{@link #getTimeParam() <em>Time Param</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimeParam()
   * @generated
   * @ordered
   */
  protected Param timeParam;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EventRelationImpl()
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
    return CupidoPackage.Literals.EVENT_RELATION;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CupidoPackage.EVENT_RELATION__EVENT, oldEvent, newEvent);
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
        msgs = ((InternalEObject)event).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CupidoPackage.EVENT_RELATION__EVENT, null, msgs);
      if (newEvent != null)
        msgs = ((InternalEObject)newEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CupidoPackage.EVENT_RELATION__EVENT, null, msgs);
      msgs = basicSetEvent(newEvent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CupidoPackage.EVENT_RELATION__EVENT, newEvent, newEvent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Param> getParams()
  {
    if (params == null)
    {
      params = new EObjectContainmentEList<Param>(Param.class, this, CupidoPackage.EVENT_RELATION__PARAMS);
    }
    return params;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Param> getKeyParams()
  {
    if (keyParams == null)
    {
      keyParams = new EObjectContainmentEList<Param>(Param.class, this, CupidoPackage.EVENT_RELATION__KEY_PARAMS);
    }
    return keyParams;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Param getTimeParam()
  {
    return timeParam;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTimeParam(Param newTimeParam, NotificationChain msgs)
  {
    Param oldTimeParam = timeParam;
    timeParam = newTimeParam;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CupidoPackage.EVENT_RELATION__TIME_PARAM, oldTimeParam, newTimeParam);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTimeParam(Param newTimeParam)
  {
    if (newTimeParam != timeParam)
    {
      NotificationChain msgs = null;
      if (timeParam != null)
        msgs = ((InternalEObject)timeParam).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CupidoPackage.EVENT_RELATION__TIME_PARAM, null, msgs);
      if (newTimeParam != null)
        msgs = ((InternalEObject)newTimeParam).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CupidoPackage.EVENT_RELATION__TIME_PARAM, null, msgs);
      msgs = basicSetTimeParam(newTimeParam, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CupidoPackage.EVENT_RELATION__TIME_PARAM, newTimeParam, newTimeParam));
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
      case CupidoPackage.EVENT_RELATION__EVENT:
        return basicSetEvent(null, msgs);
      case CupidoPackage.EVENT_RELATION__PARAMS:
        return ((InternalEList<?>)getParams()).basicRemove(otherEnd, msgs);
      case CupidoPackage.EVENT_RELATION__KEY_PARAMS:
        return ((InternalEList<?>)getKeyParams()).basicRemove(otherEnd, msgs);
      case CupidoPackage.EVENT_RELATION__TIME_PARAM:
        return basicSetTimeParam(null, msgs);
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
      case CupidoPackage.EVENT_RELATION__EVENT:
        return getEvent();
      case CupidoPackage.EVENT_RELATION__PARAMS:
        return getParams();
      case CupidoPackage.EVENT_RELATION__KEY_PARAMS:
        return getKeyParams();
      case CupidoPackage.EVENT_RELATION__TIME_PARAM:
        return getTimeParam();
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
      case CupidoPackage.EVENT_RELATION__EVENT:
        setEvent((Event)newValue);
        return;
      case CupidoPackage.EVENT_RELATION__PARAMS:
        getParams().clear();
        getParams().addAll((Collection<? extends Param>)newValue);
        return;
      case CupidoPackage.EVENT_RELATION__KEY_PARAMS:
        getKeyParams().clear();
        getKeyParams().addAll((Collection<? extends Param>)newValue);
        return;
      case CupidoPackage.EVENT_RELATION__TIME_PARAM:
        setTimeParam((Param)newValue);
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
      case CupidoPackage.EVENT_RELATION__EVENT:
        setEvent((Event)null);
        return;
      case CupidoPackage.EVENT_RELATION__PARAMS:
        getParams().clear();
        return;
      case CupidoPackage.EVENT_RELATION__KEY_PARAMS:
        getKeyParams().clear();
        return;
      case CupidoPackage.EVENT_RELATION__TIME_PARAM:
        setTimeParam((Param)null);
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
      case CupidoPackage.EVENT_RELATION__EVENT:
        return event != null;
      case CupidoPackage.EVENT_RELATION__PARAMS:
        return params != null && !params.isEmpty();
      case CupidoPackage.EVENT_RELATION__KEY_PARAMS:
        return keyParams != null && !keyParams.isEmpty();
      case CupidoPackage.EVENT_RELATION__TIME_PARAM:
        return timeParam != null;
    }
    return super.eIsSet(featureID);
  }

} //EventRelationImpl
