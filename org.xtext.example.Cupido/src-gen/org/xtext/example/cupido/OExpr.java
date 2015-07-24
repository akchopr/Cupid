/**
 */
package org.xtext.example.cupido;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OExpr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.cupido.OExpr#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.cupido.CupidoPackage#getOExpr()
 * @model
 * @generated
 */
public interface OExpr extends Expr
{
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
   * @see org.xtext.example.cupido.CupidoPackage#getOExpr_Right()
   * @model containment="true"
   * @generated
   */
  Expr getRight();

  /**
   * Sets the value of the '{@link org.xtext.example.cupido.OExpr#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Expr value);

} // OExpr
