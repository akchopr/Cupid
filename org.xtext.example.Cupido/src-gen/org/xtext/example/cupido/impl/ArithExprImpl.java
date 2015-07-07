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
import org.xtext.example.cupido.Attribute;
import org.xtext.example.cupido.BinaryOperator;
import org.xtext.example.cupido.CupidoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arith Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.cupido.impl.ArithExprImpl#getLeftAttr <em>Left Attr</em>}</li>
 *   <li>{@link org.xtext.example.cupido.impl.ArithExprImpl#getBinOp <em>Bin Op</em>}</li>
 *   <li>{@link org.xtext.example.cupido.impl.ArithExprImpl#getRightAttr <em>Right Attr</em>}</li>
 *   <li>{@link org.xtext.example.cupido.impl.ArithExprImpl#getNum <em>Num</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArithExprImpl extends MinimalEObjectImpl.Container implements ArithExpr
{
  /**
   * The cached value of the '{@link #getLeftAttr() <em>Left Attr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftAttr()
   * @generated
   * @ordered
   */
  protected Attribute leftAttr;

  /**
   * The cached value of the '{@link #getBinOp() <em>Bin Op</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBinOp()
   * @generated
   * @ordered
   */
  protected BinaryOperator binOp;

  /**
   * The cached value of the '{@link #getRightAttr() <em>Right Attr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightAttr()
   * @generated
   * @ordered
   */
  protected Attribute rightAttr;

  /**
   * The default value of the '{@link #getNum() <em>Num</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNum()
   * @generated
   * @ordered
   */
  protected static final int NUM_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getNum() <em>Num</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNum()
   * @generated
   * @ordered
   */
  protected int num = NUM_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArithExprImpl()
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
    return CupidoPackage.Literals.ARITH_EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute getLeftAttr()
  {
    return leftAttr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeftAttr(Attribute newLeftAttr, NotificationChain msgs)
  {
    Attribute oldLeftAttr = leftAttr;
    leftAttr = newLeftAttr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CupidoPackage.ARITH_EXPR__LEFT_ATTR, oldLeftAttr, newLeftAttr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeftAttr(Attribute newLeftAttr)
  {
    if (newLeftAttr != leftAttr)
    {
      NotificationChain msgs = null;
      if (leftAttr != null)
        msgs = ((InternalEObject)leftAttr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CupidoPackage.ARITH_EXPR__LEFT_ATTR, null, msgs);
      if (newLeftAttr != null)
        msgs = ((InternalEObject)newLeftAttr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CupidoPackage.ARITH_EXPR__LEFT_ATTR, null, msgs);
      msgs = basicSetLeftAttr(newLeftAttr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CupidoPackage.ARITH_EXPR__LEFT_ATTR, newLeftAttr, newLeftAttr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinaryOperator getBinOp()
  {
    return binOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBinOp(BinaryOperator newBinOp, NotificationChain msgs)
  {
    BinaryOperator oldBinOp = binOp;
    binOp = newBinOp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CupidoPackage.ARITH_EXPR__BIN_OP, oldBinOp, newBinOp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBinOp(BinaryOperator newBinOp)
  {
    if (newBinOp != binOp)
    {
      NotificationChain msgs = null;
      if (binOp != null)
        msgs = ((InternalEObject)binOp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CupidoPackage.ARITH_EXPR__BIN_OP, null, msgs);
      if (newBinOp != null)
        msgs = ((InternalEObject)newBinOp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CupidoPackage.ARITH_EXPR__BIN_OP, null, msgs);
      msgs = basicSetBinOp(newBinOp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CupidoPackage.ARITH_EXPR__BIN_OP, newBinOp, newBinOp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute getRightAttr()
  {
    return rightAttr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRightAttr(Attribute newRightAttr, NotificationChain msgs)
  {
    Attribute oldRightAttr = rightAttr;
    rightAttr = newRightAttr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CupidoPackage.ARITH_EXPR__RIGHT_ATTR, oldRightAttr, newRightAttr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRightAttr(Attribute newRightAttr)
  {
    if (newRightAttr != rightAttr)
    {
      NotificationChain msgs = null;
      if (rightAttr != null)
        msgs = ((InternalEObject)rightAttr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CupidoPackage.ARITH_EXPR__RIGHT_ATTR, null, msgs);
      if (newRightAttr != null)
        msgs = ((InternalEObject)newRightAttr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CupidoPackage.ARITH_EXPR__RIGHT_ATTR, null, msgs);
      msgs = basicSetRightAttr(newRightAttr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CupidoPackage.ARITH_EXPR__RIGHT_ATTR, newRightAttr, newRightAttr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getNum()
  {
    return num;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNum(int newNum)
  {
    int oldNum = num;
    num = newNum;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CupidoPackage.ARITH_EXPR__NUM, oldNum, num));
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
      case CupidoPackage.ARITH_EXPR__LEFT_ATTR:
        return basicSetLeftAttr(null, msgs);
      case CupidoPackage.ARITH_EXPR__BIN_OP:
        return basicSetBinOp(null, msgs);
      case CupidoPackage.ARITH_EXPR__RIGHT_ATTR:
        return basicSetRightAttr(null, msgs);
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
      case CupidoPackage.ARITH_EXPR__LEFT_ATTR:
        return getLeftAttr();
      case CupidoPackage.ARITH_EXPR__BIN_OP:
        return getBinOp();
      case CupidoPackage.ARITH_EXPR__RIGHT_ATTR:
        return getRightAttr();
      case CupidoPackage.ARITH_EXPR__NUM:
        return getNum();
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
      case CupidoPackage.ARITH_EXPR__LEFT_ATTR:
        setLeftAttr((Attribute)newValue);
        return;
      case CupidoPackage.ARITH_EXPR__BIN_OP:
        setBinOp((BinaryOperator)newValue);
        return;
      case CupidoPackage.ARITH_EXPR__RIGHT_ATTR:
        setRightAttr((Attribute)newValue);
        return;
      case CupidoPackage.ARITH_EXPR__NUM:
        setNum((Integer)newValue);
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
      case CupidoPackage.ARITH_EXPR__LEFT_ATTR:
        setLeftAttr((Attribute)null);
        return;
      case CupidoPackage.ARITH_EXPR__BIN_OP:
        setBinOp((BinaryOperator)null);
        return;
      case CupidoPackage.ARITH_EXPR__RIGHT_ATTR:
        setRightAttr((Attribute)null);
        return;
      case CupidoPackage.ARITH_EXPR__NUM:
        setNum(NUM_EDEFAULT);
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
      case CupidoPackage.ARITH_EXPR__LEFT_ATTR:
        return leftAttr != null;
      case CupidoPackage.ARITH_EXPR__BIN_OP:
        return binOp != null;
      case CupidoPackage.ARITH_EXPR__RIGHT_ATTR:
        return rightAttr != null;
      case CupidoPackage.ARITH_EXPR__NUM:
        return num != NUM_EDEFAULT;
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
    result.append(" (num: ");
    result.append(num);
    result.append(')');
    return result.toString();
  }

} //ArithExprImpl
