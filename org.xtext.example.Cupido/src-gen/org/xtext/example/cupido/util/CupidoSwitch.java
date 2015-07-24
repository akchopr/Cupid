/**
 */
package org.xtext.example.cupido.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.example.cupido.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.example.cupido.CupidoPackage
 * @generated
 */
public class CupidoSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static CupidoPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CupidoSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = CupidoPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case CupidoPackage.CUPIDO:
      {
        Cupido cupido = (Cupido)theEObject;
        T result = caseCupido(cupido);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CupidoPackage.SCHEMATA:
      {
        Schemata schemata = (Schemata)theEObject;
        T result = caseSchemata(schemata);
        if (result == null) result = caseCupido(schemata);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CupidoPackage.EVENT_RELATION:
      {
        EventRelation eventRelation = (EventRelation)theEObject;
        T result = caseEventRelation(eventRelation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CupidoPackage.PARAM:
      {
        Param param = (Param)theEObject;
        T result = caseParam(param);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CupidoPackage.COMMITMENT:
      {
        Commitment commitment = (Commitment)theEObject;
        T result = caseCommitment(commitment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CupidoPackage.EXPR:
      {
        Expr expr = (Expr)theEObject;
        T result = caseExpr(expr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CupidoPackage.EVENT:
      {
        Event event = (Event)theEObject;
        T result = caseEvent(event);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CupidoPackage.TIME_STAMP:
      {
        TimeStamp timeStamp = (TimeStamp)theEObject;
        T result = caseTimeStamp(timeStamp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CupidoPackage.EEXPR:
      {
        EExpr eExpr = (EExpr)theEObject;
        T result = caseEExpr(eExpr);
        if (result == null) result = caseExpr(eExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CupidoPackage.OEXPR:
      {
        OExpr oExpr = (OExpr)theEObject;
        T result = caseOExpr(oExpr);
        if (result == null) result = caseExpr(oExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CupidoPackage.AEXPR:
      {
        AExpr aExpr = (AExpr)theEObject;
        T result = caseAExpr(aExpr);
        if (result == null) result = caseExpr(aExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CupidoPackage.WEXPR:
      {
        WExpr wExpr = (WExpr)theEObject;
        T result = caseWExpr(wExpr);
        if (result == null) result = caseExpr(wExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cupido</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cupido</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCupido(Cupido object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Schemata</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Schemata</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSchemata(Schemata object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Event Relation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event Relation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEventRelation(EventRelation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Param</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Param</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParam(Param object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Commitment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Commitment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCommitment(Commitment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpr(Expr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEvent(Event object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Time Stamp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Time Stamp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTimeStamp(TimeStamp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EExpr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EExpr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEExpr(EExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>OExpr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>OExpr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOExpr(OExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>AExpr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>AExpr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAExpr(AExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>WExpr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>WExpr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWExpr(WExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //CupidoSwitch
