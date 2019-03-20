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
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.cupido.Expr#getEvent <em>Event</em>}</li>
 *   <li>{@link org.xtext.example.cupido.Expr#getLTime <em>LTime</em>}</li>
 *   <li>{@link org.xtext.example.cupido.Expr#getRTime <em>RTime</em>}</li>
 *   <li>{@link org.xtext.example.cupido.Expr#getLeft <em>Left</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.cupido.CupidoPackage#getExpr()
 * @model
 * @generated
 */
public interface Expr extends EObject
{
  /**
   * Returns the value of the '<em><b>Event</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Event</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Event</em>' containment reference.
   * @see #setEvent(Event)
   * @see org.xtext.example.cupido.CupidoPackage#getExpr_Event()
   * @model containment="true"
   * @generated
   */
  Event getEvent();

  /**
   * Sets the value of the '{@link org.xtext.example.cupido.Expr#getEvent <em>Event</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Event</em>' containment reference.
   * @see #getEvent()
   * @generated
   */
  void setEvent(Event value);

  /**
   * Returns the value of the '<em><b>LTime</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>LTime</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>LTime</em>' containment reference.
   * @see #setLTime(TimeStamp)
   * @see org.xtext.example.cupido.CupidoPackage#getExpr_LTime()
   * @model containment="true"
   * @generated
   */
  TimeStamp getLTime();

  /**
   * Sets the value of the '{@link org.xtext.example.cupido.Expr#getLTime <em>LTime</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>LTime</em>' containment reference.
   * @see #getLTime()
   * @generated
   */
  void setLTime(TimeStamp value);

  /**
   * Returns the value of the '<em><b>RTime</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>RTime</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>RTime</em>' containment reference.
   * @see #setRTime(TimeStamp)
   * @see org.xtext.example.cupido.CupidoPackage#getExpr_RTime()
   * @model containment="true"
   * @generated
   */
  TimeStamp getRTime();

  /**
   * Sets the value of the '{@link org.xtext.example.cupido.Expr#getRTime <em>RTime</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>RTime</em>' containment reference.
   * @see #getRTime()
   * @generated
   */
  void setRTime(TimeStamp value);

  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Expr)
   * @see org.xtext.example.cupido.CupidoPackage#getExpr_Left()
   * @model containment="true"
   * @generated
   */
  Expr getLeft();

  /**
   * Sets the value of the '{@link org.xtext.example.cupido.Expr#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Expr value);

} // Expr
