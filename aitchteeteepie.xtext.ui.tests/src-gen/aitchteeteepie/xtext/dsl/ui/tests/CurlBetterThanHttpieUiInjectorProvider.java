/*
 * generated by Xtext 2.13.0
 */
package aitchteeteepie.xtext.dsl.ui.tests;

import aitchteeteepie.xtext.ui.internal.XtextActivator;
import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;

public class CurlBetterThanHttpieUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return XtextActivator.getInstance().getInjector("aitchteeteepie.xtext.dsl.CurlBetterThanHttpie");
	}

}
