/**
 */
package org.xtext.example.cupido;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arith Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.cupido.ArithExpr#getLeftAttr <em>Left Attr</em>}</li>
 *   <li>{@link org.xtext.example.cupido.ArithExpr#getBinOp <em>Bin Op</em>}</li>
 *   <li>{@link org.xtext.example.cupido.ArithExpr#getRightAttr <em>Right Attr</em>}</li>
 *   <li>{@link org.xtext.example.cupido.ArithExpr#getNum <em>Num</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.cupido.CupidoPackage#getArithExpr()
 * @model
 * @generated
 */
public interface ArithExpr extends EObject
{
  /**
   * Returns the value of the '<em><b>Left Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left Attr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left Attr</em>' containment reference.
   * @see #setLeftAttr(Attribute)
   * @see org.xtext.example.cupido.CupidoPackage#getArithExpr_LeftAttr()
   * @model containment="true"
   * @generated
   */
  Attribute getLeftAttr();

  /**
   * Sets the value of the '{@link org.xtext.example.cupido.ArithExpr#getLeftAttr <em>Left Attr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left Attr</em>' containment reference.
   * @see #getLeftAttr()
   * @generated
   */
  void setLeftAttr(Attribute value);

  /**
   * Returns the value of the '<em><b>Bin Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bin Op</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bin Op</em>' containment reference.
   * @see #setBinOp(BinaryOperator)
   * @see org.xtext.example.cupido.CupidoPackage#getArithExpr_BinOp()
   * @model containment="true"
   * @generated
   */
  BinaryOperator getBinOp();

  /**
   * Sets the value of the '{@link org.xtext.example.cupido.ArithExpr#getBinOp <em>Bin Op</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bin Op</em>' containment reference.
   * @see #getBinOp()
   * @generated
   */
  void setBinOp(BinaryOperator value);

  /**
   * Returns the value of the '<em><b>Right Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right Attr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right Attr</em>' containment reference.
   * @see #setRightAttr(Attribute)
   * @see org.xtext.example.cupido.CupidoPackage#getArithExpr_RightAttr()
   * @model containment="true"
   * @generated
   */
  Attribute getRightAttr();

  /**
   * Sets the value of the '{@link org.xtext.example.cupido.ArithExpr#getRightAttr <em>Right Attr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right Attr</em>' containment reference.
   * @see #getRightAttr()
   * @generated
   */
  void setRightAttr(Attribute value);

  /**
   * Returns the value of the '<em><b>Num</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Num</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Num</em>' attribute.
   * @see #setNum(int)
   * @see org.xtext.example.cupido.CupidoPackage#getArithExpr_Num()
   * @model
   * @generated
   */
  int getNum();

  /**
   * Sets the value of the '{@link org.xtext.example.cupido.ArithExpr#getNum <em>Num</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Num</em>' attribute.
   * @see #getNum()
   * @generated
   */
  void setNum(int value);

} // ArithExpr
