/**
 */
package org.xtext.example.cupido;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AExpr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.cupido.AExpr#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.cupido.CupidoPackage#getAExpr()
 * @model
 * @generated
 */
public interface AExpr extends Expr
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
   * @see org.xtext.example.cupido.CupidoPackage#getAExpr_Right()
   * @model containment="true"
   * @generated
   */
  Expr getRight();

  /**
   * Sets the value of the '{@link org.xtext.example.cupido.AExpr#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Expr value);

} // AExpr
