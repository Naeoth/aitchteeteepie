/**
 * generated by Xtext 2.13.0
 */
package aitchteeteepie.xtext.dsl;

import aitchteeteepie.xtext.dsl.CurlBetterThanHttpieStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class CurlBetterThanHttpieStandaloneSetup extends CurlBetterThanHttpieStandaloneSetupGenerated {
  public static void doSetup() {
    new CurlBetterThanHttpieStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
