/**
 */
package org.xtext.example.cupido;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WExpr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.cupido.WExpr#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.cupido.CupidoPackage#getWExpr()
 * @model
 * @generated
 */
public interface WExpr extends Expr
{
  /**
   * Returns the value of the '<em><b>Right</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' attribute.
   * @see #setRight(String)
   * @see org.xtext.example.cupido.CupidoPackage#getWExpr_Right()
   * @model
   * @generated
   */
  String getRight();

  /**
   * Sets the value of the '{@link org.xtext.example.cupido.WExpr#getRight <em>Right</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' attribute.
   * @see #getRight()
   * @generated
   */
  void setRight(String value);

} // WExpr
