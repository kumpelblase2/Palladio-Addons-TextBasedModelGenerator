/**
 * generated by Xtext 2.17.0
 */
package com.palladiosimulator.textual.repository.repoLang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Seff Set Return Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.palladiosimulator.textual.repository.repoLang.SeffSetReturnAction#getReturnValue <em>Return Value</em>}</li>
 * </ul>
 *
 * @see com.palladiosimulator.textual.repository.repoLang.RepoLangPackage#getSeffSetReturnAction()
 * @model
 * @generated
 */
public interface SeffSetReturnAction extends SeffAction
{
  /**
   * Returns the value of the '<em><b>Return Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return Value</em>' containment reference.
   * @see #setReturnValue(SeffReturnParameter)
   * @see com.palladiosimulator.textual.repository.repoLang.RepoLangPackage#getSeffSetReturnAction_ReturnValue()
   * @model containment="true"
   * @generated
   */
  SeffReturnParameter getReturnValue();

  /**
   * Sets the value of the '{@link com.palladiosimulator.textual.repository.repoLang.SeffSetReturnAction#getReturnValue <em>Return Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Value</em>' containment reference.
   * @see #getReturnValue()
   * @generated
   */
  void setReturnValue(SeffReturnParameter value);

} // SeffSetReturnAction