/**
 * generated by Xtext 2.22.0
 */
package com.palladiosimulator.textual.repository.repoLang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Seff Branch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.palladiosimulator.textual.repository.repoLang.SeffBranch#getName <em>Name</em>}</li>
 *   <li>{@link com.palladiosimulator.textual.repository.repoLang.SeffBranch#getSeff <em>Seff</em>}</li>
 * </ul>
 *
 * @see com.palladiosimulator.textual.repository.repoLang.RepoLangPackage#getSeffBranch()
 * @model
 * @generated
 */
public interface SeffBranch extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.palladiosimulator.textual.repository.repoLang.RepoLangPackage#getSeffBranch_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.palladiosimulator.textual.repository.repoLang.SeffBranch#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Seff</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Seff</em>' containment reference.
   * @see #setSeff(SubSeff)
   * @see com.palladiosimulator.textual.repository.repoLang.RepoLangPackage#getSeffBranch_Seff()
   * @model containment="true"
   * @generated
   */
  SubSeff getSeff();

  /**
   * Sets the value of the '{@link com.palladiosimulator.textual.repository.repoLang.SeffBranch#getSeff <em>Seff</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Seff</em>' containment reference.
   * @see #getSeff()
   * @generated
   */
  void setSeff(SubSeff value);

} // SeffBranch
