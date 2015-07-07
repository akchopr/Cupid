/**
 */
package org.xtext.example.cupido;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>General Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.cupido.GeneralExpr#getExpr <em>Expr</em>}</li>
 *   <li>{@link org.xtext.example.cupido.GeneralExpr#getWhere <em>Where</em>}</li>
 *   <li>{@link org.xtext.example.cupido.GeneralExpr#getArith <em>Arith</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.cupido.CupidoPackage#getGeneralExpr()
 * @model
 * @generated
 */
public interface GeneralExpr extends EObject
{
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
   * @see org.xtext.example.cupido.CupidoPackage#getGeneralExpr_Expr()
   * @model containment="true"
   * @generated
   */
  Expr getExpr();

  /**
   * Sets the value of the '{@link org.xtext.example.cupido.GeneralExpr#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(Expr value);

  /**
   * Returns the value of the '<em><b>Where</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Where</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Where</em>' attribute.
   * @see #setWhere(String)
   * @see org.xtext.example.cupido.CupidoPackage#getGeneralExpr_Where()
   * @model
   * @generated
   */
  String getWhere();

  /**
   * Sets the value of the '{@link org.xtext.example.cupido.GeneralExpr#getWhere <em>Where</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Where</em>' attribute.
   * @see #getWhere()
   * @generated
   */
  void setWhere(String value);

  /**
   * Returns the value of the '<em><b>Arith</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arith</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arith</em>' containment reference.
   * @see #setArith(ArithExpr)
   * @see org.xtext.example.cupido.CupidoPackage#getGeneralExpr_Arith()
   * @model containment="true"
   * @generated
   */
  ArithExpr getArith();

  /**
   * Sets the value of the '{@link org.xtext.example.cupido.GeneralExpr#getArith <em>Arith</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arith</em>' containment reference.
   * @see #getArith()
   * @generated
   */
  void setArith(ArithExpr value);

} // GeneralExpr
