/**
 * generated by Xtext 2.17.0
 */
package com.palladiosimulator.textual.repository.repoLang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Seff</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.palladiosimulator.textual.repository.repoLang.SubSeff#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @see com.palladiosimulator.textual.repository.repoLang.RepoLangPackage#getSubSeff()
 * @model
 * @generated
 */
public interface SubSeff extends EObject
{
  /**
   * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
   * The list contents are of type {@link com.palladiosimulator.textual.repository.repoLang.SeffAction}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actions</em>' containment reference list.
   * @see com.palladiosimulator.textual.repository.repoLang.RepoLangPackage#getSubSeff_Actions()
   * @model containment="true"
   * @generated
   */
  EList<SeffAction> getActions();

} // SubSeff