/*
 * generated by Xtext 2.10.0
 */
package com.palladiosimulator.textual.repository

import com.palladiosimulator.textual.repository.naming.RepositoryNameProvider
import com.palladiosimulator.textual.repository.scoping.RepoLangImportURIGlobalScopeProvider

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class RepoLangRuntimeModule extends AbstractRepoLangRuntimeModule {
	
	override bindIQualifiedNameProvider() {
		RepositoryNameProvider
	}

    override bindIGlobalScopeProvider() {
        RepoLangImportURIGlobalScopeProvider
    }
}
