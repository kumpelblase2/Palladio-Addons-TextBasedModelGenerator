/**
 * generated by Xtext 2.17.0
 */
package com.palladiosimulator.textual.repository.repoLang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Seff External Call Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.palladiosimulator.textual.repository.repoLang.SeffExternalCallAction#getRole <em>Role</em>}</li>
 *   <li>{@link com.palladiosimulator.textual.repository.repoLang.SeffExternalCallAction#getCalled <em>Called</em>}</li>
 *   <li>{@link com.palladiosimulator.textual.repository.repoLang.SeffExternalCallAction#getBindings <em>Bindings</em>}</li>
 *   <li>{@link com.palladiosimulator.textual.repository.repoLang.SeffExternalCallAction#getReturning <em>Returning</em>}</li>
 * </ul>
 *
 * @see com.palladiosimulator.textual.repository.repoLang.RepoLangPackage#getSeffExternalCallAction()
 * @model
 * @generated
 */
public interface SeffExternalCallAction extends SeffAction
{
  /**
   * Returns the value of the '<em><b>Role</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Role</em>' reference.
   * @see #setRole(RoleSpecification)
   * @see com.palladiosimulator.textual.repository.repoLang.RepoLangPackage#getSeffExternalCallAction_Role()
   * @model
   * @generated
   */
  RoleSpecification getRole();

  /**
   * Sets the value of the '{@link com.palladiosimulator.textual.repository.repoLang.SeffExternalCallAction#getRole <em>Role</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Role</em>' reference.
   * @see #getRole()
   * @generated
   */
  void setRole(RoleSpecification value);

  /**
   * Returns the value of the '<em><b>Called</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Called</em>' reference.
   * @see #setCalled(Signature)
   * @see com.palladiosimulator.textual.repository.repoLang.RepoLangPackage#getSeffExternalCallAction_Called()
   * @model
   * @generated
   */
  Signature getCalled();

  /**
   * Sets the value of the '{@link com.palladiosimulator.textual.repository.repoLang.SeffExternalCallAction#getCalled <em>Called</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Called</em>' reference.
   * @see #getCalled()
   * @generated
   */
  void setCalled(Signature value);

  /**
   * Returns the value of the '<em><b>Bindings</b></em>' containment reference list.
   * The list contents are of type {@link com.palladiosimulator.textual.repository.repoLang.SeffCallParameter}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bindings</em>' containment reference list.
   * @see com.palladiosimulator.textual.repository.repoLang.RepoLangPackage#getSeffExternalCallAction_Bindings()
   * @model containment="true"
   * @generated
   */
  EList<SeffCallParameter> getBindings();

  /**
   * Returns the value of the '<em><b>Returning</b></em>' containment reference list.
   * The list contents are of type {@link com.palladiosimulator.textual.repository.repoLang.SeffReferenceParameter}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Returning</em>' containment reference list.
   * @see com.palladiosimulator.textual.repository.repoLang.RepoLangPackage#getSeffExternalCallAction_Returning()
   * @model containment="true"
   * @generated
   */
  EList<SeffReferenceParameter> getReturning();

} // SeffExternalCallAction