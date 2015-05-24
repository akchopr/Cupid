/**
 */
package org.xtext.example.cupido.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.cupido.ArithExpr;
import org.xtext.example.cupido.CupidoPackage;
import org.xtext.example.cupido.Expr;
import org.xtext.example.cupido.GeneralExpr;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>General Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.cupido.impl.GeneralExprImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link org.xtext.example.cupido.impl.GeneralExprImpl#getWhere <em>Where</em>}</li>
 *   <li>{@link org.xtext.example.cupido.impl.GeneralExprImpl#getArith <em>Arith</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneralExprImpl extends MinimalEObjectImpl.Container implements GeneralExpr
{
  /**
   * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected Expr expr;

  /**
   * The default value of the '{@link #getWhere() <em>Where</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhere()
   * @generated
   * @ordered
   */
  protected static final String WHERE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getWhere() <em>Where</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhere()
   * @generated
   * @ordered
   */
  protected String where = WHERE_EDEFAULT;

  /**
   * The cached value of the '{@link #getArith() <em>Arith</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArith()
   * @generated
   * @ordered
   */
  protected ArithExpr arith;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GeneralExprImpl()
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
    return CupidoPackage.Literals.GENERAL_EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getExpr()
  {
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpr(Expr newExpr, NotificationChain msgs)
  {
    Expr oldExpr = expr;
    expr = newExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CupidoPackage.GENERAL_EXPR__EXPR, oldExpr, newExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpr(Expr newExpr)
  {
    if (newExpr != expr)
    {
      NotificationChain msgs = null;
      if (expr != null)
        msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CupidoPackage.GENERAL_EXPR__EXPR, null, msgs);
      if (newExpr != null)
        msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CupidoPackage.GENERAL_EXPR__EXPR, null, msgs);
      msgs = basicSetExpr(newExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CupidoPackage.GENERAL_EXPR__EXPR, newExpr, newExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getWhere()
  {
    return where;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWhere(String newWhere)
  {
    String oldWhere = where;
    where = newWhere;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CupidoPackage.GENERAL_EXPR__WHERE, oldWhere, where));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArithExpr getArith()
  {
    return arith;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArith(ArithExpr newArith, NotificationChain msgs)
  {
    ArithExpr oldArith = arith;
    arith = newArith;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CupidoPackage.GENERAL_EXPR__ARITH, oldArith, newArith);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArith(ArithExpr newArith)
  {
    if (newArith != arith)
    {
      NotificationChain msgs = null;
      if (arith != null)
        msgs = ((InternalEObject)arith).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CupidoPackage.GENERAL_EXPR__ARITH, null, msgs);
      if (newArith != null)
        msgs = ((InternalEObject)newArith).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CupidoPackage.GENERAL_EXPR__ARITH, null, msgs);
      msgs = basicSetArith(newArith, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CupidoPackage.GENERAL_EXPR__ARITH, newArith, newArith));
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
      case CupidoPackage.GENERAL_EXPR__EXPR:
        return basicSetExpr(null, msgs);
      case CupidoPackage.GENERAL_EXPR__ARITH:
        return basicSetArith(null, msgs);
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
      case CupidoPackage.GENERAL_EXPR__EXPR:
        return getExpr();
      case CupidoPackage.GENERAL_EXPR__WHERE:
        return getWhere();
      case CupidoPackage.GENERAL_EXPR__ARITH:
        return getArith();
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
      case CupidoPackage.GENERAL_EXPR__EXPR:
        setExpr((Expr)newValue);
        return;
      case CupidoPackage.GENERAL_EXPR__WHERE:
        setWhere((String)newValue);
        return;
      case CupidoPackage.GENERAL_EXPR__ARITH:
        setArith((ArithExpr)newValue);
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
      case CupidoPackage.GENERAL_EXPR__EXPR:
        setExpr((Expr)null);
        return;
      case CupidoPackage.GENERAL_EXPR__WHERE:
        setWhere(WHERE_EDEFAULT);
        return;
      case CupidoPackage.GENERAL_EXPR__ARITH:
        setArith((ArithExpr)null);
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
      case CupidoPackage.GENERAL_EXPR__EXPR:
        return expr != null;
      case CupidoPackage.GENERAL_EXPR__WHERE:
        return WHERE_EDEFAULT == null ? where != null : !WHERE_EDEFAULT.equals(where);
      case CupidoPackage.GENERAL_EXPR__ARITH:
        return arith != null;
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
    result.append(" (where: ");
    result.append(where);
    result.append(')');
    return result.toString();
  }

} //GeneralExprImpl
