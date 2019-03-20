/**
 */
package org.xtext.example.cupido.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.cupido.Commitment;
import org.xtext.example.cupido.CupidoPackage;
import org.xtext.example.cupido.Expr;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Commitment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.cupido.impl.CommitmentImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.xtext.example.cupido.impl.CommitmentImpl#getDebtor <em>Debtor</em>}</li>
 *   <li>{@link org.xtext.example.cupido.impl.CommitmentImpl#getCreditor <em>Creditor</em>}</li>
 *   <li>{@link org.xtext.example.cupido.impl.CommitmentImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link org.xtext.example.cupido.impl.CommitmentImpl#getAntecedent <em>Antecedent</em>}</li>
 *   <li>{@link org.xtext.example.cupido.impl.CommitmentImpl#getConsequent <em>Consequent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommitmentImpl extends MinimalEObjectImpl.Container implements Commitment
{
  /**
   * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected static final String LABEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected String label = LABEL_EDEFAULT;

  /**
   * The default value of the '{@link #getDebtor() <em>Debtor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDebtor()
   * @generated
   * @ordered
   */
  protected static final String DEBTOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDebtor() <em>Debtor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDebtor()
   * @generated
   * @ordered
   */
  protected String debtor = DEBTOR_EDEFAULT;

  /**
   * The default value of the '{@link #getCreditor() <em>Creditor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCreditor()
   * @generated
   * @ordered
   */
  protected static final String CREDITOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCreditor() <em>Creditor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCreditor()
   * @generated
   * @ordered
   */
  protected String creditor = CREDITOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrigger()
   * @generated
   * @ordered
   */
  protected Expr trigger;

  /**
   * The cached value of the '{@link #getAntecedent() <em>Antecedent</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAntecedent()
   * @generated
   * @ordered
   */
  protected Expr antecedent;

  /**
   * The cached value of the '{@link #getConsequent() <em>Consequent</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConsequent()
   * @generated
   * @ordered
   */
  protected Expr consequent;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CommitmentImpl()
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
    return CupidoPackage.Literals.COMMITMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLabel()
  {
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLabel(String newLabel)
  {
    String oldLabel = label;
    label = newLabel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CupidoPackage.COMMITMENT__LABEL, oldLabel, label));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDebtor()
  {
    return debtor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDebtor(String newDebtor)
  {
    String oldDebtor = debtor;
    debtor = newDebtor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CupidoPackage.COMMITMENT__DEBTOR, oldDebtor, debtor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCreditor()
  {
    return creditor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCreditor(String newCreditor)
  {
    String oldCreditor = creditor;
    creditor = newCreditor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CupidoPackage.COMMITMENT__CREDITOR, oldCreditor, creditor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getTrigger()
  {
    return trigger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTrigger(Expr newTrigger, NotificationChain msgs)
  {
    Expr oldTrigger = trigger;
    trigger = newTrigger;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CupidoPackage.COMMITMENT__TRIGGER, oldTrigger, newTrigger);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTrigger(Expr newTrigger)
  {
    if (newTrigger != trigger)
    {
      NotificationChain msgs = null;
      if (trigger != null)
        msgs = ((InternalEObject)trigger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CupidoPackage.COMMITMENT__TRIGGER, null, msgs);
      if (newTrigger != null)
        msgs = ((InternalEObject)newTrigger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CupidoPackage.COMMITMENT__TRIGGER, null, msgs);
      msgs = basicSetTrigger(newTrigger, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CupidoPackage.COMMITMENT__TRIGGER, newTrigger, newTrigger));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getAntecedent()
  {
    return antecedent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAntecedent(Expr newAntecedent, NotificationChain msgs)
  {
    Expr oldAntecedent = antecedent;
    antecedent = newAntecedent;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CupidoPackage.COMMITMENT__ANTECEDENT, oldAntecedent, newAntecedent);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAntecedent(Expr newAntecedent)
  {
    if (newAntecedent != antecedent)
    {
      NotificationChain msgs = null;
      if (antecedent != null)
        msgs = ((InternalEObject)antecedent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CupidoPackage.COMMITMENT__ANTECEDENT, null, msgs);
      if (newAntecedent != null)
        msgs = ((InternalEObject)newAntecedent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CupidoPackage.COMMITMENT__ANTECEDENT, null, msgs);
      msgs = basicSetAntecedent(newAntecedent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CupidoPackage.COMMITMENT__ANTECEDENT, newAntecedent, newAntecedent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getConsequent()
  {
    return consequent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConsequent(Expr newConsequent, NotificationChain msgs)
  {
    Expr oldConsequent = consequent;
    consequent = newConsequent;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CupidoPackage.COMMITMENT__CONSEQUENT, oldConsequent, newConsequent);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConsequent(Expr newConsequent)
  {
    if (newConsequent != consequent)
    {
      NotificationChain msgs = null;
      if (consequent != null)
        msgs = ((InternalEObject)consequent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CupidoPackage.COMMITMENT__CONSEQUENT, null, msgs);
      if (newConsequent != null)
        msgs = ((InternalEObject)newConsequent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CupidoPackage.COMMITMENT__CONSEQUENT, null, msgs);
      msgs = basicSetConsequent(newConsequent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CupidoPackage.COMMITMENT__CONSEQUENT, newConsequent, newConsequent));
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
      case CupidoPackage.COMMITMENT__TRIGGER:
        return basicSetTrigger(null, msgs);
      case CupidoPackage.COMMITMENT__ANTECEDENT:
        return basicSetAntecedent(null, msgs);
      case CupidoPackage.COMMITMENT__CONSEQUENT:
        return basicSetConsequent(null, msgs);
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
      case CupidoPackage.COMMITMENT__LABEL:
        return getLabel();
      case CupidoPackage.COMMITMENT__DEBTOR:
        return getDebtor();
      case CupidoPackage.COMMITMENT__CREDITOR:
        return getCreditor();
      case CupidoPackage.COMMITMENT__TRIGGER:
        return getTrigger();
      case CupidoPackage.COMMITMENT__ANTECEDENT:
        return getAntecedent();
      case CupidoPackage.COMMITMENT__CONSEQUENT:
        return getConsequent();
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
      case CupidoPackage.COMMITMENT__LABEL:
        setLabel((String)newValue);
        return;
      case CupidoPackage.COMMITMENT__DEBTOR:
        setDebtor((String)newValue);
        return;
      case CupidoPackage.COMMITMENT__CREDITOR:
        setCreditor((String)newValue);
        return;
      case CupidoPackage.COMMITMENT__TRIGGER:
        setTrigger((Expr)newValue);
        return;
      case CupidoPackage.COMMITMENT__ANTECEDENT:
        setAntecedent((Expr)newValue);
        return;
      case CupidoPackage.COMMITMENT__CONSEQUENT:
        setConsequent((Expr)newValue);
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
      case CupidoPackage.COMMITMENT__LABEL:
        setLabel(LABEL_EDEFAULT);
        return;
      case CupidoPackage.COMMITMENT__DEBTOR:
        setDebtor(DEBTOR_EDEFAULT);
        return;
      case CupidoPackage.COMMITMENT__CREDITOR:
        setCreditor(CREDITOR_EDEFAULT);
        return;
      case CupidoPackage.COMMITMENT__TRIGGER:
        setTrigger((Expr)null);
        return;
      case CupidoPackage.COMMITMENT__ANTECEDENT:
        setAntecedent((Expr)null);
        return;
      case CupidoPackage.COMMITMENT__CONSEQUENT:
        setConsequent((Expr)null);
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
      case CupidoPackage.COMMITMENT__LABEL:
        return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
      case CupidoPackage.COMMITMENT__DEBTOR:
        return DEBTOR_EDEFAULT == null ? debtor != null : !DEBTOR_EDEFAULT.equals(debtor);
      case CupidoPackage.COMMITMENT__CREDITOR:
        return CREDITOR_EDEFAULT == null ? creditor != null : !CREDITOR_EDEFAULT.equals(creditor);
      case CupidoPackage.COMMITMENT__TRIGGER:
        return trigger != null;
      case CupidoPackage.COMMITMENT__ANTECEDENT:
        return antecedent != null;
      case CupidoPackage.COMMITMENT__CONSEQUENT:
        return consequent != null;
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
    result.append(" (label: ");
    result.append(label);
    result.append(", debtor: ");
    result.append(debtor);
    result.append(", creditor: ");
    result.append(creditor);
    result.append(')');
    return result.toString();
  }

} //CommitmentImpl
