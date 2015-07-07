/**
 */
package org.xtext.example.cupido.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.cupido.CupidoPackage;
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
  protected static final int VAL_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getVal() <em>Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal()
   * @generated
   * @ordered
   */
  protected int val = VAL_EDEFAULT;

  /**
   * The default value of the '{@link #getEventReference() <em>Event Reference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEventReference()
   * @generated
   * @ordered
   */
  protected static final String EVENT_REFERENCE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEventReference() <em>Event Reference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEventReference()
   * @generated
   * @ordered
   */
  protected String eventReference = EVENT_REFERENCE_EDEFAULT;

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
  public int getVal()
  {
    return val;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVal(int newVal)
  {
    int oldVal = val;
    val = newVal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CupidoPackage.TIME_STAMP__VAL, oldVal, val));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEventReference()
  {
    return eventReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEventReference(String newEventReference)
  {
    String oldEventReference = eventReference;
    eventReference = newEventReference;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CupidoPackage.TIME_STAMP__EVENT_REFERENCE, oldEventReference, eventReference));
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
        setVal((Integer)newValue);
        return;
      case CupidoPackage.TIME_STAMP__EVENT_REFERENCE:
        setEventReference((String)newValue);
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
        setEventReference(EVENT_REFERENCE_EDEFAULT);
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
        return val != VAL_EDEFAULT;
      case CupidoPackage.TIME_STAMP__EVENT_REFERENCE:
        return EVENT_REFERENCE_EDEFAULT == null ? eventReference != null : !EVENT_REFERENCE_EDEFAULT.equals(eventReference);
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
    result.append(", eventReference: ");
    result.append(eventReference);
    result.append(", shift: ");
    result.append(shift);
    result.append(')');
    return result.toString();
  }

} //TimeStampImpl
