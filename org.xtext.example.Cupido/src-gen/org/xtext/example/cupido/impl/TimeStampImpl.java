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
import org.xtext.example.cupido.TimeStamp;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Stamp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.cupido.impl.TimeStampImpl#getVal <em>Val</em>}</li>
 *   <li>{@link org.xtext.example.cupido.impl.TimeStampImpl#getEventReference <em>Event Reference</em>}</li>
 *   <li>{@link org.xtext.example.cupido.impl.TimeStampImpl#getShift <em>Shift</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeStampImpl extends MinimalEObjectImpl.Container implements TimeStamp
{
  /**
   * The default value of the '{@link #getVal() <em>Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal()
   * @generated
   * @ordered
   */
  protected static final String VAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVal() <em>Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal()
   * @generated
   * @ordered
   */
  protected String val = VAL_EDEFAULT;

  /**
   * The cached value of the '{@link #getEventReference() <em>Event Reference</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEventReference()
   * @generated
   * @ordered
   */
  protected Event eventReference;

  /**
   * The default value of the '{@link #getShift() <em>Shift</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShift()
   * @generated
   * @ordered
   */
  protected static final int SHIFT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getShift() <em>Shift</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShift()
   * @generated
   * @ordered
   */
  protected int shift = SHIFT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TimeStampImpl()
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
    return CupidoPackage.Literals.TIME_STAMP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVal()
  {
    return val;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVal(String newVal)
  {
    String oldVal = val;
    val = newVal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CupidoPackage.TIME_STAMP__VAL, oldVal, val));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Event getEventReference()
  {
    return eventReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEventReference(Event newEventReference, NotificationChain msgs)
  {
    Event oldEventReference = eventReference;
    eventReference = newEventReference;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CupidoPackage.TIME_STAMP__EVENT_REFERENCE, oldEventReference, newEventReference);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEventReference(Event newEventReference)
  {
    if (newEventReference != eventReference)
    {
      NotificationChain msgs = null;
      if (eventReference != null)
        msgs = ((InternalEObject)eventReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CupidoPackage.TIME_STAMP__EVENT_REFERENCE, null, msgs);
      if (newEventReference != null)
        msgs = ((InternalEObject)newEventReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CupidoPackage.TIME_STAMP__EVENT_REFERENCE, null, msgs);
      msgs = basicSetEventReference(newEventReference, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CupidoPackage.TIME_STAMP__EVENT_REFERENCE, newEventReference, newEventReference));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getShift()
  {
    return shift;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setShift(int newShift)
  {
    int oldShift = shift;
    shift = newShift;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CupidoPackage.TIME_STAMP__SHIFT, oldShift, shift));
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
      case CupidoPackage.TIME_STAMP__EVENT_REFERENCE:
        return basicSetEventReference(null, msgs);
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
      case CupidoPackage.TIME_STAMP__VAL:
        return getVal();
      case CupidoPackage.TIME_STAMP__EVENT_REFERENCE:
        return getEventReference();
      case CupidoPackage.TIME_STAMP__SHIFT:
        return getShift();
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
      case CupidoPackage.TIME_STAMP__VAL:
        setVal((String)newValue);
        return;
      case CupidoPackage.TIME_STAMP__EVENT_REFERENCE:
        setEventReference((Event)newValue);
        return;
      case CupidoPackage.TIME_STAMP__SHIFT:
        setShift((Integer)newValue);
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
      case CupidoPackage.TIME_STAMP__VAL:
        setVal(VAL_EDEFAULT);
        return;
      case CupidoPackage.TIME_STAMP__EVENT_REFERENCE:
        setEventReference((Event)null);
        return;
      case CupidoPackage.TIME_STAMP__SHIFT:
        setShift(SHIFT_EDEFAULT);
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
      case CupidoPackage.TIME_STAMP__VAL:
        return VAL_EDEFAULT == null ? val != null : !VAL_EDEFAULT.equals(val);
      case CupidoPackage.TIME_STAMP__EVENT_REFERENCE:
        return eventReference != null;
      case CupidoPackage.TIME_STAMP__SHIFT:
        return shift != SHIFT_EDEFAULT;
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
    result.append(" (val: ");
    result.append(val);
    result.append(", shift: ");
    result.append(shift);
    result.append(')');
    return result.toString();
  }

} //TimeStampImpl
