/*
 * generated by Xtext
 */
package org.xtext.com;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class JavadslStandaloneSetup extends JavadslStandaloneSetupGenerated{

	public static void doSetup() {
		new JavadslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

