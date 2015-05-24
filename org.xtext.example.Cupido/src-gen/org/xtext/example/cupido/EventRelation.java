/**
 */
package org.xtext.example.cupido;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.cupido.EventRelation#getEvent <em>Event</em>}</li>
 *   <li>{@link org.xtext.example.cupido.EventRelation#getParams <em>Params</em>}</li>
 *   <li>{@link org.xtext.example.cupido.EventRelation#getKeyParams <em>Key Params</em>}</li>
 *   <li>{@link org.xtext.example.cupido.EventRelation#getTimeParam <em>Time Param</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.cupido.CupidoPackage#getEventRelation()
 * @model
 * @generated
 */
public interface EventRelation extends EObject
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
   * @see org.xtext.example.cupido.CupidoPackage#getEventRelation_Event()
   * @model containment="true"
   * @generated
   */
  Event getEvent();

  /**
   * Sets the value of the '{@link org.xtext.example.cupido.EventRelation#getEvent <em>Event</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Event</em>' containment reference.
   * @see #getEvent()
   * @generated
   */
  void setEvent(Event value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.cupido.Param}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see org.xtext.example.cupido.CupidoPackage#getEventRelation_Params()
   * @model containment="true"
   * @generated
   */
  EList<Param> getParams();

  /**
   * Returns the value of the '<em><b>Key Params</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.cupido.Param}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Key Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Key Params</em>' containment reference list.
   * @see org.xtext.example.cupido.CupidoPackage#getEventRelation_KeyParams()
   * @model containment="true"
   * @generated
   */
  EList<Param> getKeyParams();

  /**
   * Returns the value of the '<em><b>Time Param</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Time Param</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Time Param</em>' containment reference.
   * @see #setTimeParam(Param)
   * @see org.xtext.example.cupido.CupidoPackage#getEventRelation_TimeParam()
   * @model containment="true"
   * @generated
   */
  Param getTimeParam();

  /**
   * Sets the value of the '{@link org.xtext.example.cupido.EventRelation#getTimeParam <em>Time Param</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Time Param</em>' containment reference.
   * @see #getTimeParam()
   * @generated
   */
  void setTimeParam(Param value);

} // EventRelation
