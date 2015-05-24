/**
 */
package org.xtext.example.cupido.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.cupido.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CupidoFactoryImpl extends EFactoryImpl implements CupidoFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CupidoFactory init()
  {
    try
    {
      CupidoFactory theCupidoFactory = (CupidoFactory)EPackage.Registry.INSTANCE.getEFactory(CupidoPackage.eNS_URI);
      if (theCupidoFactory != null)
      {
        return theCupidoFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new CupidoFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CupidoFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case CupidoPackage.CUPIDO: return createCupido();
      case CupidoPackage.SCHEMATA: return createSchemata();
      case CupidoPackage.EVENT_RELATION: return createEventRelation();
      case CupidoPackage.PARAM: return createParam();
      case CupidoPackage.COMMITMENT: return createCommitment();
      case CupidoPackage.GENERAL_EXPR: return createGeneralExpr();
      case CupidoPackage.EXPR: return createExpr();
      case CupidoPackage.INTERVAL: return createInterval();
      case CupidoPackage.EVENT: return createEvent();
      case CupidoPackage.ARITH_EXPR: return createArithExpr();
      case CupidoPackage.TIME_STAMP: return createTimeStamp();
      case CupidoPackage.BINARY_OPERATOR: return createBinaryOperator();
      case CupidoPackage.ATTRIBUTE: return createAttribute();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cupido createCupido()
  {
    CupidoImpl cupido = new CupidoImpl();
    return cupido;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Schemata createSchemata()
  {
    SchemataImpl schemata = new SchemataImpl();
    return schemata;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventRelation createEventRelation()
  {
    EventRelationImpl eventRelation = new EventRelationImpl();
    return eventRelation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Param createParam()
  {
    ParamImpl param = new ParamImpl();
    return param;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Commitment createCommitment()
  {
    CommitmentImpl commitment = new CommitmentImpl();
    return commitment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GeneralExpr createGeneralExpr()
  {
    GeneralExprImpl generalExpr = new GeneralExprImpl();
    return generalExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr createExpr()
  {
    ExprImpl expr = new ExprImpl();
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interval createInterval()
  {
    IntervalImpl interval = new IntervalImpl();
    return interval;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Event createEvent()
  {
    EventImpl event = new EventImpl();
    return event;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArithExpr createArithExpr()
  {
    ArithExprImpl arithExpr = new ArithExprImpl();
    return arithExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimeStamp createTimeStamp()
  {
    TimeStampImpl timeStamp = new TimeStampImpl();
    return timeStamp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinaryOperator createBinaryOperator()
  {
    BinaryOperatorImpl binaryOperator = new BinaryOperatorImpl();
    return binaryOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CupidoPackage getCupidoPackage()
  {
    return (CupidoPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static CupidoPackage getPackage()
  {
    return CupidoPackage.eINSTANCE;
  }

} //CupidoFactoryImpl
