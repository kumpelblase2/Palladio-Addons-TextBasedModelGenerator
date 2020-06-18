/**
 * generated by Xtext 2.22.0
 */
package com.palladiosimulator.textual.repository.repoLang.impl;

import com.palladiosimulator.textual.repository.repoLang.RepoLangPackage;
import com.palladiosimulator.textual.repository.repoLang.RoleSpecification;
import com.palladiosimulator.textual.repository.repoLang.SeffCallParameter;
import com.palladiosimulator.textual.repository.repoLang.SeffExternalCallAction;
import com.palladiosimulator.textual.repository.repoLang.SeffReferenceParameter;
import com.palladiosimulator.textual.repository.repoLang.Signature;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Seff External Call Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.palladiosimulator.textual.repository.repoLang.impl.SeffExternalCallActionImpl#getRole <em>Role</em>}</li>
 *   <li>{@link com.palladiosimulator.textual.repository.repoLang.impl.SeffExternalCallActionImpl#getCalled <em>Called</em>}</li>
 *   <li>{@link com.palladiosimulator.textual.repository.repoLang.impl.SeffExternalCallActionImpl#getBindings <em>Bindings</em>}</li>
 *   <li>{@link com.palladiosimulator.textual.repository.repoLang.impl.SeffExternalCallActionImpl#getReturning <em>Returning</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SeffExternalCallActionImpl extends SeffActionImpl implements SeffExternalCallAction
{
  /**
   * The cached value of the '{@link #getRole() <em>Role</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRole()
   * @generated
   * @ordered
   */
  protected RoleSpecification role;

  /**
   * The cached value of the '{@link #getCalled() <em>Called</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCalled()
   * @generated
   * @ordered
   */
  protected Signature called;

  /**
   * The cached value of the '{@link #getBindings() <em>Bindings</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBindings()
   * @generated
   * @ordered
   */
  protected EList<SeffCallParameter> bindings;

  /**
   * The cached value of the '{@link #getReturning() <em>Returning</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturning()
   * @generated
   * @ordered
   */
  protected EList<SeffReferenceParameter> returning;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SeffExternalCallActionImpl()
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
    return RepoLangPackage.Literals.SEFF_EXTERNAL_CALL_ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RoleSpecification getRole()
  {
    if (role != null && role.eIsProxy())
    {
      InternalEObject oldRole = (InternalEObject)role;
      role = (RoleSpecification)eResolveProxy(oldRole);
      if (role != oldRole)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RepoLangPackage.SEFF_EXTERNAL_CALL_ACTION__ROLE, oldRole, role));
      }
    }
    return role;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RoleSpecification basicGetRole()
  {
    return role;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRole(RoleSpecification newRole)
  {
    RoleSpecification oldRole = role;
    role = newRole;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RepoLangPackage.SEFF_EXTERNAL_CALL_ACTION__ROLE, oldRole, role));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Signature getCalled()
  {
    if (called != null && called.eIsProxy())
    {
      InternalEObject oldCalled = (InternalEObject)called;
      called = (Signature)eResolveProxy(oldCalled);
      if (called != oldCalled)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RepoLangPackage.SEFF_EXTERNAL_CALL_ACTION__CALLED, oldCalled, called));
      }
    }
    return called;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Signature basicGetCalled()
  {
    return called;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCalled(Signature newCalled)
  {
    Signature oldCalled = called;
    called = newCalled;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RepoLangPackage.SEFF_EXTERNAL_CALL_ACTION__CALLED, oldCalled, called));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<SeffCallParameter> getBindings()
  {
    if (bindings == null)
    {
      bindings = new EObjectContainmentEList<SeffCallParameter>(SeffCallParameter.class, this, RepoLangPackage.SEFF_EXTERNAL_CALL_ACTION__BINDINGS);
    }
    return bindings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<SeffReferenceParameter> getReturning()
  {
    if (returning == null)
    {
      returning = new EObjectContainmentEList<SeffReferenceParameter>(SeffReferenceParameter.class, this, RepoLangPackage.SEFF_EXTERNAL_CALL_ACTION__RETURNING);
    }
    return returning;
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
      case RepoLangPackage.SEFF_EXTERNAL_CALL_ACTION__BINDINGS:
        return ((InternalEList<?>)getBindings()).basicRemove(otherEnd, msgs);
      case RepoLangPackage.SEFF_EXTERNAL_CALL_ACTION__RETURNING:
        return ((InternalEList<?>)getReturning()).basicRemove(otherEnd, msgs);
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
      case RepoLangPackage.SEFF_EXTERNAL_CALL_ACTION__ROLE:
        if (resolve) return getRole();
        return basicGetRole();
      case RepoLangPackage.SEFF_EXTERNAL_CALL_ACTION__CALLED:
        if (resolve) return getCalled();
        return basicGetCalled();
      case RepoLangPackage.SEFF_EXTERNAL_CALL_ACTION__BINDINGS:
        return getBindings();
      case RepoLangPackage.SEFF_EXTERNAL_CALL_ACTION__RETURNING:
        return getReturning();
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
      case RepoLangPackage.SEFF_EXTERNAL_CALL_ACTION__ROLE:
        setRole((RoleSpecification)newValue);
        return;
      case RepoLangPackage.SEFF_EXTERNAL_CALL_ACTION__CALLED:
        setCalled((Signature)newValue);
        return;
      case RepoLangPackage.SEFF_EXTERNAL_CALL_ACTION__BINDINGS:
        getBindings().clear();
        getBindings().addAll((Collection<? extends SeffCallParameter>)newValue);
        return;
      case RepoLangPackage.SEFF_EXTERNAL_CALL_ACTION__RETURNING:
        getReturning().clear();
        getReturning().addAll((Collection<? extends SeffReferenceParameter>)newValue);
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
      case RepoLangPackage.SEFF_EXTERNAL_CALL_ACTION__ROLE:
        setRole((RoleSpecification)null);
        return;
      case RepoLangPackage.SEFF_EXTERNAL_CALL_ACTION__CALLED:
        setCalled((Signature)null);
        return;
      case RepoLangPackage.SEFF_EXTERNAL_CALL_ACTION__BINDINGS:
        getBindings().clear();
        return;
      case RepoLangPackage.SEFF_EXTERNAL_CALL_ACTION__RETURNING:
        getReturning().clear();
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
      case RepoLangPackage.SEFF_EXTERNAL_CALL_ACTION__ROLE:
        return role != null;
      case RepoLangPackage.SEFF_EXTERNAL_CALL_ACTION__CALLED:
        return called != null;
      case RepoLangPackage.SEFF_EXTERNAL_CALL_ACTION__BINDINGS:
        return bindings != null && !bindings.isEmpty();
      case RepoLangPackage.SEFF_EXTERNAL_CALL_ACTION__RETURNING:
        return returning != null && !returning.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SeffExternalCallActionImpl
