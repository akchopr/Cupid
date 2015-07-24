/**
 */
package org.xtext.example.cupido;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.cupido.CupidoPackage
 * @generated
 */
public interface CupidoFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CupidoFactory eINSTANCE = org.xtext.example.cupido.impl.CupidoFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Cupido</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cupido</em>'.
   * @generated
   */
  Cupido createCupido();

  /**
   * Returns a new object of class '<em>Schemata</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Schemata</em>'.
   * @generated
   */
  Schemata createSchemata();

  /**
   * Returns a new object of class '<em>Event Relation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Event Relation</em>'.
   * @generated
   */
  EventRelation createEventRelation();

  /**
   * Returns a new object of class '<em>Param</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Param</em>'.
   * @generated
   */
  Param createParam();

  /**
   * Returns a new object of class '<em>Commitment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Commitment</em>'.
   * @generated
   */
  Commitment createCommitment();

  /**
   * Returns a new object of class '<em>Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr</em>'.
   * @generated
   */
  Expr createExpr();

  /**
   * Returns a new object of class '<em>Interval</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interval</em>'.
   * @generated
   */
  Interval createInterval();

  /**
   * Returns a new object of class '<em>Event</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Event</em>'.
   * @generated
   */
  Event createEvent();

  /**
   * Returns a new object of class '<em>Time Stamp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Time Stamp</em>'.
   * @generated
   */
  TimeStamp createTimeStamp();

  /**
   * Returns a new object of class '<em>EExpr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EExpr</em>'.
   * @generated
   */
  EExpr createEExpr();

  /**
   * Returns a new object of class '<em>OExpr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>OExpr</em>'.
   * @generated
   */
  OExpr createOExpr();

  /**
   * Returns a new object of class '<em>AExpr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>AExpr</em>'.
   * @generated
   */
  AExpr createAExpr();

  /**
   * Returns a new object of class '<em>WExpr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>WExpr</em>'.
   * @generated
   */
  WExpr createWExpr();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  CupidoPackage getCupidoPackage();

} //CupidoFactory
