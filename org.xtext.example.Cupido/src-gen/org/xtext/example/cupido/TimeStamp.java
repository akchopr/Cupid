/**
 */
package org.xtext.example.cupido;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Stamp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.cupido.TimeStamp#getVal <em>Val</em>}</li>
 *   <li>{@link org.xtext.example.cupido.TimeStamp#getEventReference <em>Event Reference</em>}</li>
 *   <li>{@link org.xtext.example.cupido.TimeStamp#getShift <em>Shift</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.cupido.CupidoPackage#getTimeStamp()
 * @model
 * @generated
 */
public interface TimeStamp extends EObject
{
  /**
   * Returns the value of the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Val</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val</em>' attribute.
   * @see #setVal(int)
   * @see org.xtext.example.cupido.CupidoPackage#getTimeStamp_Val()
   * @model
   * @generated
   */
  int getVal();

  /**
   * Sets the value of the '{@link org.xtext.example.cupido.TimeStamp#getVal <em>Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Val</em>' attribute.
   * @see #getVal()
   * @generated
   */
  void setVal(int value);

  /**
   * Returns the value of the '<em><b>Event Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Event Reference</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Event Reference</em>' containment reference.
   * @see #setEventReference(Event)
   * @see org.xtext.example.cupido.CupidoPackage#getTimeStamp_EventReference()
   * @model containment="true"
   * @generated
   */
  Event getEventReference();

  /**
   * Sets the value of the '{@link org.xtext.example.cupido.TimeStamp#getEventReference <em>Event Reference</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Event Reference</em>' containment reference.
   * @see #getEventReference()
   * @generated
   */
  void setEventReference(Event value);

  /**
   * Returns the value of the '<em><b>Shift</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Shift</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Shift</em>' attribute.
   * @see #setShift(int)
   * @see org.xtext.example.cupido.CupidoPackage#getTimeStamp_Shift()
   * @model
   * @generated
   */
  int getShift();

  /**
   * Sets the value of the '{@link org.xtext.example.cupido.TimeStamp#getShift <em>Shift</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Shift</em>' attribute.
   * @see #getShift()
   * @generated
   */
  void setShift(int value);

} // TimeStamp
