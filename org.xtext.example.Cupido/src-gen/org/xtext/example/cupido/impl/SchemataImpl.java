/**
 */
package org.xtext.example.cupido.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.cupido.Commitment;
import org.xtext.example.cupido.CupidoPackage;
import org.xtext.example.cupido.EventRelation;
import org.xtext.example.cupido.Schemata;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schemata</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.cupido.impl.SchemataImpl#getCommitments <em>Commitments</em>}</li>
 *   <li>{@link org.xtext.example.cupido.impl.SchemataImpl#getSchemata <em>Schemata</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SchemataImpl extends CupidoImpl implements Schemata
{
  /**
   * The cached value of the '{@link #getCommitments() <em>Commitments</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCommitments()
   * @generated
   * @ordered
   */
  protected EList<Commitment> commitments;

  /**
   * The cached value of the '{@link #getSchemata() <em>Schemata</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSchemata()
   * @generated
   * @ordered
   */
  protected EList<EventRelation> schemata;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SchemataImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return CupidoPackage.Literals.SCHEMATA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Commitment> getCommitments()
  {
    if (commitments == null)
    {
      commitments = new EObjectContainmentEList<Commitment>(Commitment.class, this, CupidoPackage.SCHEMATA__COMMITMENTS);
    }
    return commitments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EventRelation> getSchemata()
  {
    if (schemata == null)
    {
      schemata = new EObjectContainmentEList<EventRelation>(EventRelation.class, this, CupidoPackage.SCHEMATA__SCHEMATA);
    }
    return schemata;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case CupidoPackage.SCHEMATA__COMMITMENTS:
        return ((InternalEList<?>)getCommitments()).basicRemove(otherEnd, msgs);
      case CupidoPackage.SCHEMATA__SCHEMATA:
        return ((InternalEList<?>)getSchemata()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case CupidoPackage.SCHEMATA__COMMITMENTS:
        return getCommitments();
      case CupidoPackage.SCHEMATA__SCHEMATA:
        return getSchemata();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CupidoPackage.SCHEMATA__COMMITMENTS:
        getCommitments().clear();
        getCommitments().addAll((Collection<? extends Commitment>)newValue);
        return;
      case CupidoPackage.SCHEMATA__SCHEMATA:
        getSchemata().clear();
        getSchemata().addAll((Collection<? extends EventRelation>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case CupidoPackage.SCHEMATA__COMMITMENTS:
        getCommitments().clear();
        return;
      case CupidoPackage.SCHEMATA__SCHEMATA:
        getSchemata().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case CupidoPackage.SCHEMATA__COMMITMENTS:
        return commitments != null && !commitments.isEmpty();
      case CupidoPackage.SCHEMATA__SCHEMATA:
        return schemata != null && !schemata.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SchemataImpl
