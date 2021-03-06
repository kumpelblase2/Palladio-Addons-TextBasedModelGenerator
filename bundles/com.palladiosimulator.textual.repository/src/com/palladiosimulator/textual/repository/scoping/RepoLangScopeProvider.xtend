/*
 * generated by Xtext 2.10.0
 */
package com.palladiosimulator.textual.repository.scoping

import com.palladiosimulator.textual.repository.repoLang.Component
import com.palladiosimulator.textual.repository.repoLang.RepoLangPackage
import com.palladiosimulator.textual.repository.repoLang.Seff
import com.palladiosimulator.textual.repository.repoLang.SeffCallParameter
import com.palladiosimulator.textual.repository.repoLang.SeffExternalCallAction
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.scoping.Scopes
import org.palladiosimulator.pcm.repository.RepositoryPackage
import org.palladiosimulator.pcm.resourcetype.ResourcetypePackage

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class RepoLangScopeProvider extends AbstractRepoLangScopeProvider {

    override getScope(EObject context, EReference reference) {
        val scope = super.getScope(context, reference)
        if (RepositoryPackage.eINSTANCE.dataType.isSuperTypeOf(reference.EReferenceType)) {
            val rs = EcoreUtil2.getResourceSet(context);
            val types = EcoreUtil2.getAllContents(rs, true).filter(EObject).filter [
                RepositoryPackage.Literals.DATA_TYPE.isInstance(it)
            ].toList
            return Scopes.scopeFor(types, scope)
        } else if (ResourcetypePackage.eINSTANCE.resourceType.isSuperTypeOf(reference.EReferenceType)) {
            val rs = EcoreUtil2.getResourceSet(context);
            val types = EcoreUtil2.getAllContents(rs, true).filter(EObject).filter [
                ResourcetypePackage.Literals.RESOURCE_TYPE.isInstance(it)
            ].toList
            return Scopes.scopeFor(types, scope)
        } else if (context instanceof SeffExternalCallAction &&
            reference == RepoLangPackage.Literals.SEFF_EXTERNAL_CALL_ACTION__CALLED) {
            val extCall = context as SeffExternalCallAction;
            if (extCall.role !== null) {
                val candidates = extCall.role.interface.signature
                return Scopes.scopeFor(candidates)
            }

            val component = context.findComponent
            val candidates = component.requires.map[interface.signature].flatten
            return Scopes.scopeFor(candidates)
        } else if (context instanceof SeffExternalCallAction &&
            reference == RepoLangPackage.Literals.SEFF_EXTERNAL_CALL_ACTION__ROLE) {
            val component = context.findComponent
            val candidates = component.requires
            return Scopes.scopeFor(candidates)
        } else if (context instanceof SeffExternalCallAction &&
            reference == RepoLangPackage.Literals.SEFF_CALL_PARAMETER__PARAMETER) {
            val method = (context as SeffExternalCallAction).called
            val candidates = method.parameters
            return Scopes.scopeFor(candidates)
        } else if (context instanceof SeffCallParameter &&
            reference == RepoLangPackage.Literals.SEFF_CALL_PARAMETER__PARAMETER) {
            val method = (context.eContainer as SeffExternalCallAction).called
            val candidates = method.parameters
            return Scopes.scopeFor(candidates)
        } else if (context instanceof Seff && reference == RepoLangPackage.Literals.SEFF__SIGNATURE) {
            val component = context.findComponent
            val candidates = component.provides.map[interface.signature].flatten
            return Scopes.scopeFor(candidates)
        }

        return scope
    }

    def Component findComponent(EObject action) {
        var parent = action.eContainer
        while (!(parent instanceof Component))
            parent = parent.eContainer

        return parent as Component
    }
}
