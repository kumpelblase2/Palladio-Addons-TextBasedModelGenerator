/**
 * generated by Xtext 2.22.0
 */
package com.palladiosimulator.textual.repository.repoLang.impl;

import com.palladiosimulator.textual.repository.repoLang.Component;
import com.palladiosimulator.textual.repository.repoLang.CompositeComponent;
import com.palladiosimulator.textual.repository.repoLang.RepoLangPackage;
import com.palladiosimulator.textual.repository.repoLang.RoleSpecification;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.palladiosimulator.textual.repository.repoLang.impl.CompositeComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.palladiosimulator.textual.repository.repoLang.impl.CompositeComponentImpl#getProvides <em>Provides</em>}</li>
 *   <li>{@link com.palladiosimulator.textual.repository.repoLang.impl.CompositeComponentImpl#getRequires <em>Requires</em>}</li>
 *   <li>{@link com.palladiosimulator.textual.repository.repoLang.impl.CompositeComponentImpl#getComponents <em>Components</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeComponentImpl extends MinimalEObjectImpl.Container implements CompositeComponent
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getProvides() <em>Provides</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProvides()
   * @generated
   * @ordered
   */
  protected EList<RoleSpecification> provides;

  /**
   * The cached value of the '{@link #getRequires() <em>Requires</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequires()
   * @generated
   * @ordered
   */
  protected EList<RoleSpecification> requires;

  /**
   * The cached value of the '{@link #getComponents() <em>Components</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponents()
   * @generated
   * @ordered
   */
  protected EList<Component> components;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CompositeComponentImpl()
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
    return RepoLangPackage.Literals.COMPOSITE_COMPONENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RepoLangPackage.COMPOSITE_COMPONENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<RoleSpecification> getProvides()
  {
    if (provides == null)
    {
      provides = new EObjectContainmentEList<RoleSpecification>(RoleSpecification.class, this, RepoLangPackage.COMPOSITE_COMPONENT__PROVIDES);
    }
    return provides;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<RoleSpecification> getRequires()
  {
    if (requires == null)
    {
      requires = new EObjectContainmentEList<RoleSpecification>(RoleSpecification.class, this, RepoLangPackage.COMPOSITE_COMPONENT__REQUIRES);
    }
    return requires;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Component> getComponents()
  {
    if (components == null)
    {
      components = new EObjectResolvingEList<Component>(Component.class, this, RepoLangPackage.COMPOSITE_COMPONENT__COMPONENTS);
    }
    return components;
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
      case RepoLangPackage.COMPOSITE_COMPONENT__PROVIDES:
        return ((InternalEList<?>)getProvides()).basicRemove(otherEnd, msgs);
      case RepoLangPackage.COMPOSITE_COMPONENT__REQUIRES:
        return ((InternalEList<?>)getRequires()).basicRemove(otherEnd, msgs);
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
      case RepoLangPackage.COMPOSITE_COMPONENT__NAME:
        return getName();
      case RepoLangPackage.COMPOSITE_COMPONENT__PROVIDES:
        return getProvides();
      case RepoLangPackage.COMPOSITE_COMPONENT__REQUIRES:
        return getRequires();
      case RepoLangPackage.COMPOSITE_COMPONENT__COMPONENTS:
        return getComponents();
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
      case RepoLangPackage.COMPOSITE_COMPONENT__NAME:
        setName((String)newValue);
        return;
      case RepoLangPackage.COMPOSITE_COMPONENT__PROVIDES:
        getProvides().clear();
        getProvides().addAll((Collection<? extends RoleSpecification>)newValue);
        return;
      case RepoLangPackage.COMPOSITE_COMPONENT__REQUIRES:
        getRequires().clear();
        getRequires().addAll((Collection<? extends RoleSpecification>)newValue);
        return;
      case RepoLangPackage.COMPOSITE_COMPONENT__COMPONENTS:
        getComponents().clear();
        getComponents().addAll((Collection<? extends Component>)newValue);
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
      case RepoLangPackage.COMPOSITE_COMPONENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RepoLangPackage.COMPOSITE_COMPONENT__PROVIDES:
        getProvides().clear();
        return;
      case RepoLangPackage.COMPOSITE_COMPONENT__REQUIRES:
        getRequires().clear();
        return;
      case RepoLangPackage.COMPOSITE_COMPONENT__COMPONENTS:
        getComponents().clear();
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
      case RepoLangPackage.COMPOSITE_COMPONENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RepoLangPackage.COMPOSITE_COMPONENT__PROVIDES:
        return provides != null && !provides.isEmpty();
      case RepoLangPackage.COMPOSITE_COMPONENT__REQUIRES:
        return requires != null && !requires.isEmpty();
      case RepoLangPackage.COMPOSITE_COMPONENT__COMPONENTS:
        return components != null && !components.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //CompositeComponentImpl
