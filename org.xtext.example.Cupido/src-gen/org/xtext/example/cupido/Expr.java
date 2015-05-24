/**
 */
package org.xtext.example.cupido;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.cupido.Expr#getInterval <em>Interval</em>}</li>
 *   <li>{@link org.xtext.example.cupido.Expr#getLeft <em>Left</em>}</li>
 *   <li>{@link org.xtext.example.cupido.Expr#getOp <em>Op</em>}</li>
 *   <li>{@link org.xtext.example.cupido.Expr#getRight <em>Right</em>}</li>
 *   <li>{@link org.xtext.example.cupido.Expr#getExpr <em>Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.cupido.CupidoPackage#getExpr()
 * @model
 * @generated
 */
public interface Expr extends EObject
{
  /**
   * Returns the value of the '<em><b>Interval</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interval</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interval</em>' containment reference.
   * @see #setInterval(Interval)
   * @see org.xtext.example.cupido.CupidoPackage#getExpr_Interval()
   * @model containment="true"
   * @generated
   */
  Interval getInterval();

  /**
   * Sets the value of the '{@link org.xtext.example.cupido.Expr#getInterval <em>Interval</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interval</em>' containment reference.
   * @see #getInterval()
   * @generated
   */
  void setInterval(Interval value);

  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Interval)
   * @see org.xtext.example.cupido.CupidoPackage#getExpr_Left()
   * @model containment="true"
   * @generated
   */
  Interval getLeft();

  /**
   * Sets the value of the '{@link org.xtext.example.cupido.Expr#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Interval value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see org.xtext.example.cupido.CupidoPackage#getExpr_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link org.xtext.example.cupido.Expr#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Expr)
   * @see org.xtext.example.cupido.CupidoPackage#getExpr_Right()
   * @model containment="true"
   * @generated
   */
  Expr getRight();

  /**
   * Sets the value of the '{@link org.xtext.example.cupido.Expr#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Expr value);

  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(Expr)
   * @see org.xtext.example.cupido.CupidoPackage#getExpr_Expr()
   * @model containment="true"
   * @generated
   */
  Expr getExpr();

  /**
   * Sets the value of the '{@link org.xtext.example.cupido.Expr#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(Expr value);

} // Expr
