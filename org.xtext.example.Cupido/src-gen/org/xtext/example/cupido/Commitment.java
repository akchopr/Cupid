/**
 */
package org.xtext.example.cupido;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Commitment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.cupido.Commitment#getLabel <em>Label</em>}</li>
 *   <li>{@link org.xtext.example.cupido.Commitment#getDebtor <em>Debtor</em>}</li>
 *   <li>{@link org.xtext.example.cupido.Commitment#getCreditor <em>Creditor</em>}</li>
 *   <li>{@link org.xtext.example.cupido.Commitment#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link org.xtext.example.cupido.Commitment#getAntecedent <em>Antecedent</em>}</li>
 *   <li>{@link org.xtext.example.cupido.Commitment#getConsequent <em>Consequent</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.cupido.CupidoPackage#getCommitment()
 * @model
 * @generated
 */
public interface Commitment extends EObject
{
  /**
   * Returns the value of the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label</em>' attribute.
   * @see #setLabel(String)
   * @see org.xtext.example.cupido.CupidoPackage#getCommitment_Label()
   * @model
   * @generated
   */
  String getLabel();

  /**
   * Sets the value of the '{@link org.xtext.example.cupido.Commitment#getLabel <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' attribute.
   * @see #getLabel()
   * @generated
   */
  void setLabel(String value);

  /**
   * Returns the value of the '<em><b>Debtor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Debtor</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Debtor</em>' attribute.
   * @see #setDebtor(String)
   * @see org.xtext.example.cupido.CupidoPackage#getCommitment_Debtor()
   * @model
   * @generated
   */
  String getDebtor();

  /**
   * Sets the value of the '{@link org.xtext.example.cupido.Commitment#getDebtor <em>Debtor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Debtor</em>' attribute.
   * @see #getDebtor()
   * @generated
   */
  void setDebtor(String value);

  /**
   * Returns the value of the '<em><b>Creditor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Creditor</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Creditor</em>' attribute.
   * @see #setCreditor(String)
   * @see org.xtext.example.cupido.CupidoPackage#getCommitment_Creditor()
   * @model
   * @generated
   */
  String getCreditor();

  /**
   * Sets the value of the '{@link org.xtext.example.cupido.Commitment#getCreditor <em>Creditor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Creditor</em>' attribute.
   * @see #getCreditor()
   * @generated
   */
  void setCreditor(String value);

  /**
   * Returns the value of the '<em><b>Trigger</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Trigger</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trigger</em>' containment reference.
   * @see #setTrigger(GeneralExpr)
   * @see org.xtext.example.cupido.CupidoPackage#getCommitment_Trigger()
   * @model containment="true"
   * @generated
   */
  GeneralExpr getTrigger();

  /**
   * Sets the value of the '{@link org.xtext.example.cupido.Commitment#getTrigger <em>Trigger</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Trigger</em>' containment reference.
   * @see #getTrigger()
   * @generated
   */
  void setTrigger(GeneralExpr value);

  /**
   * Returns the value of the '<em><b>Antecedent</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Antecedent</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Antecedent</em>' containment reference.
   * @see #setAntecedent(GeneralExpr)
   * @see org.xtext.example.cupido.CupidoPackage#getCommitment_Antecedent()
   * @model containment="true"
   * @generated
   */
  GeneralExpr getAntecedent();

  /**
   * Sets the value of the '{@link org.xtext.example.cupido.Commitment#getAntecedent <em>Antecedent</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Antecedent</em>' containment reference.
   * @see #getAntecedent()
   * @generated
   */
  void setAntecedent(GeneralExpr value);

  /**
   * Returns the value of the '<em><b>Consequent</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Consequent</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Consequent</em>' containment reference.
   * @see #setConsequent(GeneralExpr)
   * @see org.xtext.example.cupido.CupidoPackage#getCommitment_Consequent()
   * @model containment="true"
   * @generated
   */
  GeneralExpr getConsequent();

  /**
   * Sets the value of the '{@link org.xtext.example.cupido.Commitment#getConsequent <em>Consequent</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Consequent</em>' containment reference.
   * @see #getConsequent()
   * @generated
   */
  void setConsequent(GeneralExpr value);

} // Commitment
