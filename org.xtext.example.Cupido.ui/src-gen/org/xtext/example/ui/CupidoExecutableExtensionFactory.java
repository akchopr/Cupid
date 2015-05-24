/*
 * generated by Xtext
 */
package org.xtext.example.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.xtext.example.ui.internal.CupidoActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class CupidoExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return CupidoActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return CupidoActivator.getInstance().getInjector(CupidoActivator.ORG_XTEXT_EXAMPLE_CUPIDO);
	}
	
}
