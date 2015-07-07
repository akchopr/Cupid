/**
 */
package org.xtext.example.cupido;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schemata</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.cupido.Schemata#getCommitments <em>Commitments</em>}</li>
 *   <li>{@link org.xtext.example.cupido.Schemata#getSchemata <em>Schemata</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.cupido.CupidoPackage#getSchemata()
 * @model
 * @generated
 */
public interface Schemata extends Cupido
{
  /**
   * Returns the value of the '<em><b>Commitments</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.cupido.Commitment}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Commitments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Commitments</em>' containment reference list.
   * @see org.xtext.example.cupido.CupidoPackage#getSchemata_Commitments()
   * @model containment="true"
   * @generated
   */
  EList<Commitment> getCommitments();

  /**
   * Returns the value of the '<em><b>Schemata</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.cupido.EventRelation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Schemata</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Schemata</em>' containment reference list.
   * @see org.xtext.example.cupido.CupidoPackage#getSchemata_Schemata()
   * @model containment="true"
   * @generated
   */
  EList<EventRelation> getSchemata();

} // Schemata
