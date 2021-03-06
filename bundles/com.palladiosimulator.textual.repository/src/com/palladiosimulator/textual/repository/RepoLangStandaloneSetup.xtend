/*
 * generated by Xtext 2.10.0
 */
package com.palladiosimulator.textual.repository

import com.google.inject.Guice
import com.google.inject.Injector
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.xtext.resource.IResourceServiceProvider

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class RepoLangStandaloneSetup extends RepoLangStandaloneSetupGenerated {

	def static void doSetup() {
		new RepoLangStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
	
    override createInjector() {
        return Guice.createInjector(new RepoLangStandaloneModule())
    }
	
    override register(Injector injector) {
        super.register(injector)
        
        val resourceFactory = new XMIResourceFactoryImpl()
        val serviceProvider = injector.getInstance(IResourceServiceProvider)
        
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("repository", resourceFactory)
        IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap().put("repository", serviceProvider)
    }    
}
