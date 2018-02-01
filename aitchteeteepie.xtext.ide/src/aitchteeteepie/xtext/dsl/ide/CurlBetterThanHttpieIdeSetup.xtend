/*
 * generated by Xtext 2.13.0
 */
package aitchteeteepie.xtext.dsl.ide

import aitchteeteepie.xtext.dsl.CurlBetterThanHttpieRuntimeModule
import aitchteeteepie.xtext.dsl.CurlBetterThanHttpieStandaloneSetup
import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class CurlBetterThanHttpieIdeSetup extends CurlBetterThanHttpieStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new CurlBetterThanHttpieRuntimeModule, new CurlBetterThanHttpieIdeModule))
	}
	
}
