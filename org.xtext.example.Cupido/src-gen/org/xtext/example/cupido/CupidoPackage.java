/**
 */
package org.xtext.example.cupido;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.cupido.CupidoFactory
 * @model kind="package"
 * @generated
 */
public interface CupidoPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "cupido";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/Cupido";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "cupido";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CupidoPackage eINSTANCE = org.xtext.example.cupido.impl.CupidoPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.cupido.impl.CupidoImpl <em>Cupido</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.cupido.impl.CupidoImpl
   * @see org.xtext.example.cupido.impl.CupidoPackageImpl#getCupido()
   * @generated
   */
  int CUPIDO = 0;

  /**
   * The number of structural features of the '<em>Cupido</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUPIDO_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.cupido.impl.SchemataImpl <em>Schemata</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.cupido.impl.SchemataImpl
   * @see org.xtext.example.cupido.impl.CupidoPackageImpl#getSchemata()
   * @generated
   */
  int SCHEMATA = 1;

  /**
   * The feature id for the '<em><b>Commitments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMATA__COMMITMENTS = CUPIDO_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Schemata</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMATA__SCHEMATA = CUPIDO_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Schemata</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMATA_FEATURE_COUNT = CUPIDO_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.cupido.impl.EventRelationImpl <em>Event Relation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.cupido.impl.EventRelationImpl
   * @see org.xtext.example.cupido.impl.CupidoPackageImpl#getEventRelation()
   * @generated
   */
  int EVENT_RELATION = 2;

  /**
   * The feature id for the '<em><b>Event</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_RELATION__EVENT = 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_RELATION__PARAMS = 1;

  /**
   * The feature id for the '<em><b>Key Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_RELATION__KEY_PARAMS = 2;

  /**
   * The feature id for the '<em><b>Time Param</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_RELATION__TIME_PARAM = 3;

  /**
   * The number of structural features of the '<em>Event Relation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_RELATION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.cupido.impl.ParamImpl <em>Param</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.cupido.impl.ParamImpl
   * @see org.xtext.example.cupido.impl.CupidoPackageImpl#getParam()
   * @generated
   */
  int PARAM = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM__NAME = 0;

  /**
   * The number of structural features of the '<em>Param</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.cupido.impl.CommitmentImpl <em>Commitment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.cupido.impl.CommitmentImpl
   * @see org.xtext.example.cupido.impl.CupidoPackageImpl#getCommitment()
   * @generated
   */
  int COMMITMENT = 4;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMITMENT__LABEL = 0;

  /**
   * The feature id for the '<em><b>Debtor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMITMENT__DEBTOR = 1;

  /**
   * The feature id for the '<em><b>Creditor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMITMENT__CREDITOR = 2;

  /**
   * The feature id for the '<em><b>Trigger</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMITMENT__TRIGGER = 3;

  /**
   * The feature id for the '<em><b>Antecedent</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMITMENT__ANTECEDENT = 4;

  /**
   * The feature id for the '<em><b>Consequent</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMITMENT__CONSEQUENT = 5;

  /**
   * The number of structural features of the '<em>Commitment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMITMENT_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.xtext.example.cupido.impl.GeneralExprImpl <em>General Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.cupido.impl.GeneralExprImpl
   * @see org.xtext.example.cupido.impl.CupidoPackageImpl#getGeneralExpr()
   * @generated
   */
  int GENERAL_EXPR = 5;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERAL_EXPR__EXPR = 0;

  /**
   * The feature id for the '<em><b>Where</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERAL_EXPR__WHERE = 1;

  /**
   * The feature id for the '<em><b>Arith</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERAL_EXPR__ARITH = 2;

  /**
   * The number of structural features of the '<em>General Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERAL_EXPR_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.cupido.impl.ExprImpl <em>Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.cupido.impl.ExprImpl
   * @see org.xtext.example.cupido.impl.CupidoPackageImpl#getExpr()
   * @generated
   */
  int EXPR = 6;

  /**
   * The feature id for the '<em><b>Interval</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__INTERVAL = 0;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__LEFT = 1;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__OP = 2;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__RIGHT = 3;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__EXPR = 4;

  /**
   * The number of structural features of the '<em>Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.example.cupido.impl.IntervalImpl <em>Interval</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.cupido.impl.IntervalImpl
   * @see org.xtext.example.cupido.impl.CupidoPackageImpl#getInterval()
   * @generated
   */
  int INTERVAL = 7;

  /**
   * The feature id for the '<em><b>Event</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERVAL__EVENT = 0;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERVAL__LEFT = 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERVAL__RIGHT = 2;

  /**
   * The number of structural features of the '<em>Interval</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERVAL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.cupido.impl.EventImpl <em>Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.cupido.impl.EventImpl
   * @see org.xtext.example.cupido.impl.CupidoPackageImpl#getEvent()
   * @generated
   */
  int EVENT = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Life State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__LIFE_STATE = 1;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__LABEL = 2;

  /**
   * The number of structural features of the '<em>Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.cupido.impl.ArithExprImpl <em>Arith Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.cupido.impl.ArithExprImpl
   * @see org.xtext.example.cupido.impl.CupidoPackageImpl#getArithExpr()
   * @generated
   */
  int ARITH_EXPR = 9;

  /**
   * The feature id for the '<em><b>Left Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARITH_EXPR__LEFT_ATTR = 0;

  /**
   * The feature id for the '<em><b>Bin Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARITH_EXPR__BIN_OP = 1;

  /**
   * The feature id for the '<em><b>Right Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARITH_EXPR__RIGHT_ATTR = 2;

  /**
   * The feature id for the '<em><b>Num</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARITH_EXPR__NUM = 3;

  /**
   * The number of structural features of the '<em>Arith Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARITH_EXPR_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.cupido.impl.TimeStampImpl <em>Time Stamp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.cupido.impl.TimeStampImpl
   * @see org.xtext.example.cupido.impl.CupidoPackageImpl#getTimeStamp()
   * @generated
   */
  int TIME_STAMP = 10;

  /**
   * The feature id for the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_STAMP__VAL = 0;

  /**
   * The feature id for the '<em><b>Event Reference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_STAMP__EVENT_REFERENCE = 1;

  /**
   * The feature id for the '<em><b>Shift</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_STAMP__SHIFT = 2;

  /**
   * The number of structural features of the '<em>Time Stamp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_STAMP_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.cupido.impl.BinaryOperatorImpl <em>Binary Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.cupido.impl.BinaryOperatorImpl
   * @see org.xtext.example.cupido.impl.CupidoPackageImpl#getBinaryOperator()
   * @generated
   */
  int BINARY_OPERATOR = 11;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_OPERATOR__OP = 0;

  /**
   * The number of structural features of the '<em>Binary Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_OPERATOR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.cupido.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.cupido.impl.AttributeImpl
   * @see org.xtext.example.cupido.impl.CupidoPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = 0;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link org.xtext.example.cupido.Cupido <em>Cupido</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cupido</em>'.
   * @see org.xtext.example.cupido.Cupido
   * @generated
   */
  EClass getCupido();

  /**
   * Returns the meta object for class '{@link org.xtext.example.cupido.Schemata <em>Schemata</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Schemata</em>'.
   * @see org.xtext.example.cupido.Schemata
   * @generated
   */
  EClass getSchemata();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.cupido.Schemata#getCommitments <em>Commitments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Commitments</em>'.
   * @see org.xtext.example.cupido.Schemata#getCommitments()
   * @see #getSchemata()
   * @generated
   */
  EReference getSchemata_Commitments();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.cupido.Schemata#getSchemata <em>Schemata</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Schemata</em>'.
   * @see org.xtext.example.cupido.Schemata#getSchemata()
   * @see #getSchemata()
   * @generated
   */
  EReference getSchemata_Schemata();

  /**
   * Returns the meta object for class '{@link org.xtext.example.cupido.EventRelation <em>Event Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event Relation</em>'.
   * @see org.xtext.example.cupido.EventRelation
   * @generated
   */
  EClass getEventRelation();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.cupido.EventRelation#getEvent <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Event</em>'.
   * @see org.xtext.example.cupido.EventRelation#getEvent()
   * @see #getEventRelation()
   * @generated
   */
  EReference getEventRelation_Event();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.cupido.EventRelation#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see org.xtext.example.cupido.EventRelation#getParams()
   * @see #getEventRelation()
   * @generated
   */
  EReference getEventRelation_Params();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.cupido.EventRelation#getKeyParams <em>Key Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Key Params</em>'.
   * @see org.xtext.example.cupido.EventRelation#getKeyParams()
   * @see #getEventRelation()
   * @generated
   */
  EReference getEventRelation_KeyParams();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.cupido.EventRelation#getTimeParam <em>Time Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Time Param</em>'.
   * @see org.xtext.example.cupido.EventRelation#getTimeParam()
   * @see #getEventRelation()
   * @generated
   */
  EReference getEventRelation_TimeParam();

  /**
   * Returns the meta object for class '{@link org.xtext.example.cupido.Param <em>Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Param</em>'.
   * @see org.xtext.example.cupido.Param
   * @generated
   */
  EClass getParam();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.cupido.Param#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.cupido.Param#getName()
   * @see #getParam()
   * @generated
   */
  EAttribute getParam_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.cupido.Commitment <em>Commitment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Commitment</em>'.
   * @see org.xtext.example.cupido.Commitment
   * @generated
   */
  EClass getCommitment();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.cupido.Commitment#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see org.xtext.example.cupido.Commitment#getLabel()
   * @see #getCommitment()
   * @generated
   */
  EAttribute getCommitment_Label();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.cupido.Commitment#getDebtor <em>Debtor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Debtor</em>'.
   * @see org.xtext.example.cupido.Commitment#getDebtor()
   * @see #getCommitment()
   * @generated
   */
  EAttribute getCommitment_Debtor();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.cupido.Commitment#getCreditor <em>Creditor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Creditor</em>'.
   * @see org.xtext.example.cupido.Commitment#getCreditor()
   * @see #getCommitment()
   * @generated
   */
  EAttribute getCommitment_Creditor();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.cupido.Commitment#getTrigger <em>Trigger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Trigger</em>'.
   * @see org.xtext.example.cupido.Commitment#getTrigger()
   * @see #getCommitment()
   * @generated
   */
  EReference getCommitment_Trigger();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.cupido.Commitment#getAntecedent <em>Antecedent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Antecedent</em>'.
   * @see org.xtext.example.cupido.Commitment#getAntecedent()
   * @see #getCommitment()
   * @generated
   */
  EReference getCommitment_Antecedent();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.cupido.Commitment#getConsequent <em>Consequent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Consequent</em>'.
   * @see org.xtext.example.cupido.Commitment#getConsequent()
   * @see #getCommitment()
   * @generated
   */
  EReference getCommitment_Consequent();

  /**
   * Returns the meta object for class '{@link org.xtext.example.cupido.GeneralExpr <em>General Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>General Expr</em>'.
   * @see org.xtext.example.cupido.GeneralExpr
   * @generated
   */
  EClass getGeneralExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.cupido.GeneralExpr#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.xtext.example.cupido.GeneralExpr#getExpr()
   * @see #getGeneralExpr()
   * @generated
   */
  EReference getGeneralExpr_Expr();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.cupido.GeneralExpr#getWhere <em>Where</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Where</em>'.
   * @see org.xtext.example.cupido.GeneralExpr#getWhere()
   * @see #getGeneralExpr()
   * @generated
   */
  EAttribute getGeneralExpr_Where();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.cupido.GeneralExpr#getArith <em>Arith</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Arith</em>'.
   * @see org.xtext.example.cupido.GeneralExpr#getArith()
   * @see #getGeneralExpr()
   * @generated
   */
  EReference getGeneralExpr_Arith();

  /**
   * Returns the meta object for class '{@link org.xtext.example.cupido.Expr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr</em>'.
   * @see org.xtext.example.cupido.Expr
   * @generated
   */
  EClass getExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.cupido.Expr#getInterval <em>Interval</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Interval</em>'.
   * @see org.xtext.example.cupido.Expr#getInterval()
   * @see #getExpr()
   * @generated
   */
  EReference getExpr_Interval();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.cupido.Expr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.example.cupido.Expr#getLeft()
   * @see #getExpr()
   * @generated
   */
  EReference getExpr_Left();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.cupido.Expr#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.xtext.example.cupido.Expr#getOp()
   * @see #getExpr()
   * @generated
   */
  EAttribute getExpr_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.cupido.Expr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.example.cupido.Expr#getRight()
   * @see #getExpr()
   * @generated
   */
  EReference getExpr_Right();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.cupido.Expr#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.xtext.example.cupido.Expr#getExpr()
   * @see #getExpr()
   * @generated
   */
  EReference getExpr_Expr();

  /**
   * Returns the meta object for class '{@link org.xtext.example.cupido.Interval <em>Interval</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interval</em>'.
   * @see org.xtext.example.cupido.Interval
   * @generated
   */
  EClass getInterval();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.cupido.Interval#getEvent <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Event</em>'.
   * @see org.xtext.example.cupido.Interval#getEvent()
   * @see #getInterval()
   * @generated
   */
  EReference getInterval_Event();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.cupido.Interval#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.example.cupido.Interval#getLeft()
   * @see #getInterval()
   * @generated
   */
  EReference getInterval_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.cupido.Interval#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.example.cupido.Interval#getRight()
   * @see #getInterval()
   * @generated
   */
  EReference getInterval_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.example.cupido.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event</em>'.
   * @see org.xtext.example.cupido.Event
   * @generated
   */
  EClass getEvent();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.cupido.Event#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.cupido.Event#getName()
   * @see #getEvent()
   * @generated
   */
  EAttribute getEvent_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.cupido.Event#getLifeState <em>Life State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Life State</em>'.
   * @see org.xtext.example.cupido.Event#getLifeState()
   * @see #getEvent()
   * @generated
   */
  EAttribute getEvent_LifeState();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.cupido.Event#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see org.xtext.example.cupido.Event#getLabel()
   * @see #getEvent()
   * @generated
   */
  EAttribute getEvent_Label();

  /**
   * Returns the meta object for class '{@link org.xtext.example.cupido.ArithExpr <em>Arith Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Arith Expr</em>'.
   * @see org.xtext.example.cupido.ArithExpr
   * @generated
   */
  EClass getArithExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.cupido.ArithExpr#getLeftAttr <em>Left Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Attr</em>'.
   * @see org.xtext.example.cupido.ArithExpr#getLeftAttr()
   * @see #getArithExpr()
   * @generated
   */
  EReference getArithExpr_LeftAttr();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.cupido.ArithExpr#getBinOp <em>Bin Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bin Op</em>'.
   * @see org.xtext.example.cupido.ArithExpr#getBinOp()
   * @see #getArithExpr()
   * @generated
   */
  EReference getArithExpr_BinOp();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.cupido.ArithExpr#getRightAttr <em>Right Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Attr</em>'.
   * @see org.xtext.example.cupido.ArithExpr#getRightAttr()
   * @see #getArithExpr()
   * @generated
   */
  EReference getArithExpr_RightAttr();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.cupido.ArithExpr#getNum <em>Num</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Num</em>'.
   * @see org.xtext.example.cupido.ArithExpr#getNum()
   * @see #getArithExpr()
   * @generated
   */
  EAttribute getArithExpr_Num();

  /**
   * Returns the meta object for class '{@link org.xtext.example.cupido.TimeStamp <em>Time Stamp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Time Stamp</em>'.
   * @see org.xtext.example.cupido.TimeStamp
   * @generated
   */
  EClass getTimeStamp();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.cupido.TimeStamp#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Val</em>'.
   * @see org.xtext.example.cupido.TimeStamp#getVal()
   * @see #getTimeStamp()
   * @generated
   */
  EAttribute getTimeStamp_Val();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.cupido.TimeStamp#getEventReference <em>Event Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Event Reference</em>'.
   * @see org.xtext.example.cupido.TimeStamp#getEventReference()
   * @see #getTimeStamp()
   * @generated
   */
  EAttribute getTimeStamp_EventReference();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.cupido.TimeStamp#getShift <em>Shift</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Shift</em>'.
   * @see org.xtext.example.cupido.TimeStamp#getShift()
   * @see #getTimeStamp()
   * @generated
   */
  EAttribute getTimeStamp_Shift();

  /**
   * Returns the meta object for class '{@link org.xtext.example.cupido.BinaryOperator <em>Binary Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binary Operator</em>'.
   * @see org.xtext.example.cupido.BinaryOperator
   * @generated
   */
  EClass getBinaryOperator();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.cupido.BinaryOperator#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.xtext.example.cupido.BinaryOperator#getOp()
   * @see #getBinaryOperator()
   * @generated
   */
  EAttribute getBinaryOperator_Op();

  /**
   * Returns the meta object for class '{@link org.xtext.example.cupido.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see org.xtext.example.cupido.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.cupido.Attribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.cupido.Attribute#getName()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Name();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  CupidoFactory getCupidoFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.cupido.impl.CupidoImpl <em>Cupido</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.cupido.impl.CupidoImpl
     * @see org.xtext.example.cupido.impl.CupidoPackageImpl#getCupido()
     * @generated
     */
    EClass CUPIDO = eINSTANCE.getCupido();

    /**
     * The meta object literal for the '{@link org.xtext.example.cupido.impl.SchemataImpl <em>Schemata</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.cupido.impl.SchemataImpl
     * @see org.xtext.example.cupido.impl.CupidoPackageImpl#getSchemata()
     * @generated
     */
    EClass SCHEMATA = eINSTANCE.getSchemata();

    /**
     * The meta object literal for the '<em><b>Commitments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCHEMATA__COMMITMENTS = eINSTANCE.getSchemata_Commitments();

    /**
     * The meta object literal for the '<em><b>Schemata</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCHEMATA__SCHEMATA = eINSTANCE.getSchemata_Schemata();

    /**
     * The meta object literal for the '{@link org.xtext.example.cupido.impl.EventRelationImpl <em>Event Relation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.cupido.impl.EventRelationImpl
     * @see org.xtext.example.cupido.impl.CupidoPackageImpl#getEventRelation()
     * @generated
     */
    EClass EVENT_RELATION = eINSTANCE.getEventRelation();

    /**
     * The meta object literal for the '<em><b>Event</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT_RELATION__EVENT = eINSTANCE.getEventRelation_Event();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT_RELATION__PARAMS = eINSTANCE.getEventRelation_Params();

    /**
     * The meta object literal for the '<em><b>Key Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT_RELATION__KEY_PARAMS = eINSTANCE.getEventRelation_KeyParams();

    /**
     * The meta object literal for the '<em><b>Time Param</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT_RELATION__TIME_PARAM = eINSTANCE.getEventRelation_TimeParam();

    /**
     * The meta object literal for the '{@link org.xtext.example.cupido.impl.ParamImpl <em>Param</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.cupido.impl.ParamImpl
     * @see org.xtext.example.cupido.impl.CupidoPackageImpl#getParam()
     * @generated
     */
    EClass PARAM = eINSTANCE.getParam();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAM__NAME = eINSTANCE.getParam_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.cupido.impl.CommitmentImpl <em>Commitment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.cupido.impl.CommitmentImpl
     * @see org.xtext.example.cupido.impl.CupidoPackageImpl#getCommitment()
     * @generated
     */
    EClass COMMITMENT = eINSTANCE.getCommitment();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMITMENT__LABEL = eINSTANCE.getCommitment_Label();

    /**
     * The meta object literal for the '<em><b>Debtor</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMITMENT__DEBTOR = eINSTANCE.getCommitment_Debtor();

    /**
     * The meta object literal for the '<em><b>Creditor</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMITMENT__CREDITOR = eINSTANCE.getCommitment_Creditor();

    /**
     * The meta object literal for the '<em><b>Trigger</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMITMENT__TRIGGER = eINSTANCE.getCommitment_Trigger();

    /**
     * The meta object literal for the '<em><b>Antecedent</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMITMENT__ANTECEDENT = eINSTANCE.getCommitment_Antecedent();

    /**
     * The meta object literal for the '<em><b>Consequent</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMITMENT__CONSEQUENT = eINSTANCE.getCommitment_Consequent();

    /**
     * The meta object literal for the '{@link org.xtext.example.cupido.impl.GeneralExprImpl <em>General Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.cupido.impl.GeneralExprImpl
     * @see org.xtext.example.cupido.impl.CupidoPackageImpl#getGeneralExpr()
     * @generated
     */
    EClass GENERAL_EXPR = eINSTANCE.getGeneralExpr();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GENERAL_EXPR__EXPR = eINSTANCE.getGeneralExpr_Expr();

    /**
     * The meta object literal for the '<em><b>Where</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GENERAL_EXPR__WHERE = eINSTANCE.getGeneralExpr_Where();

    /**
     * The meta object literal for the '<em><b>Arith</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GENERAL_EXPR__ARITH = eINSTANCE.getGeneralExpr_Arith();

    /**
     * The meta object literal for the '{@link org.xtext.example.cupido.impl.ExprImpl <em>Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.cupido.impl.ExprImpl
     * @see org.xtext.example.cupido.impl.CupidoPackageImpl#getExpr()
     * @generated
     */
    EClass EXPR = eINSTANCE.getExpr();

    /**
     * The meta object literal for the '<em><b>Interval</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR__INTERVAL = eINSTANCE.getExpr_Interval();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR__LEFT = eINSTANCE.getExpr_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPR__OP = eINSTANCE.getExpr_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR__RIGHT = eINSTANCE.getExpr_Right();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR__EXPR = eINSTANCE.getExpr_Expr();

    /**
     * The meta object literal for the '{@link org.xtext.example.cupido.impl.IntervalImpl <em>Interval</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.cupido.impl.IntervalImpl
     * @see org.xtext.example.cupido.impl.CupidoPackageImpl#getInterval()
     * @generated
     */
    EClass INTERVAL = eINSTANCE.getInterval();

    /**
     * The meta object literal for the '<em><b>Event</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERVAL__EVENT = eINSTANCE.getInterval_Event();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERVAL__LEFT = eINSTANCE.getInterval_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERVAL__RIGHT = eINSTANCE.getInterval_Right();

    /**
     * The meta object literal for the '{@link org.xtext.example.cupido.impl.EventImpl <em>Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.cupido.impl.EventImpl
     * @see org.xtext.example.cupido.impl.CupidoPackageImpl#getEvent()
     * @generated
     */
    EClass EVENT = eINSTANCE.getEvent();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT__NAME = eINSTANCE.getEvent_Name();

    /**
     * The meta object literal for the '<em><b>Life State</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT__LIFE_STATE = eINSTANCE.getEvent_LifeState();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT__LABEL = eINSTANCE.getEvent_Label();

    /**
     * The meta object literal for the '{@link org.xtext.example.cupido.impl.ArithExprImpl <em>Arith Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.cupido.impl.ArithExprImpl
     * @see org.xtext.example.cupido.impl.CupidoPackageImpl#getArithExpr()
     * @generated
     */
    EClass ARITH_EXPR = eINSTANCE.getArithExpr();

    /**
     * The meta object literal for the '<em><b>Left Attr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARITH_EXPR__LEFT_ATTR = eINSTANCE.getArithExpr_LeftAttr();

    /**
     * The meta object literal for the '<em><b>Bin Op</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARITH_EXPR__BIN_OP = eINSTANCE.getArithExpr_BinOp();

    /**
     * The meta object literal for the '<em><b>Right Attr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARITH_EXPR__RIGHT_ATTR = eINSTANCE.getArithExpr_RightAttr();

    /**
     * The meta object literal for the '<em><b>Num</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARITH_EXPR__NUM = eINSTANCE.getArithExpr_Num();

    /**
     * The meta object literal for the '{@link org.xtext.example.cupido.impl.TimeStampImpl <em>Time Stamp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.cupido.impl.TimeStampImpl
     * @see org.xtext.example.cupido.impl.CupidoPackageImpl#getTimeStamp()
     * @generated
     */
    EClass TIME_STAMP = eINSTANCE.getTimeStamp();

    /**
     * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TIME_STAMP__VAL = eINSTANCE.getTimeStamp_Val();

    /**
     * The meta object literal for the '<em><b>Event Reference</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TIME_STAMP__EVENT_REFERENCE = eINSTANCE.getTimeStamp_EventReference();

    /**
     * The meta object literal for the '<em><b>Shift</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TIME_STAMP__SHIFT = eINSTANCE.getTimeStamp_Shift();

    /**
     * The meta object literal for the '{@link org.xtext.example.cupido.impl.BinaryOperatorImpl <em>Binary Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.cupido.impl.BinaryOperatorImpl
     * @see org.xtext.example.cupido.impl.CupidoPackageImpl#getBinaryOperator()
     * @generated
     */
    EClass BINARY_OPERATOR = eINSTANCE.getBinaryOperator();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BINARY_OPERATOR__OP = eINSTANCE.getBinaryOperator_Op();

    /**
     * The meta object literal for the '{@link org.xtext.example.cupido.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.cupido.impl.AttributeImpl
     * @see org.xtext.example.cupido.impl.CupidoPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

  }

} //CupidoPackage
