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
      case CupidoPackage.EXPR: return createExpr();
      case CupidoPackage.EVENT: return createEvent();
      case CupidoPackage.TIME_STAMP: return createTimeStamp();
      case CupidoPackage.EEXPR: return createEExpr();
      case CupidoPackage.OEXPR: return createOExpr();
      case CupidoPackage.AEXPR: return createAExpr();
      case CupidoPackage.WEXPR: return createWExpr();
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
  public EExpr createEExpr()
  {
    EExprImpl eExpr = new EExprImpl();
    return eExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OExpr createOExpr()
  {
    OExprImpl oExpr = new OExprImpl();
    return oExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AExpr createAExpr()
  {
    AExprImpl aExpr = new AExprImpl();
    return aExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WExpr createWExpr()
  {
    WExprImpl wExpr = new WExprImpl();
    return wExpr;
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
