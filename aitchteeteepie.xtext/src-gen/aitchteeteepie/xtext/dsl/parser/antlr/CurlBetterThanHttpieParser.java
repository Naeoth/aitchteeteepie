/*
 * generated by Xtext 2.13.0
 */
package aitchteeteepie.xtext.dsl.parser.antlr;

import aitchteeteepie.xtext.dsl.parser.antlr.internal.InternalCurlBetterThanHttpieParser;
import aitchteeteepie.xtext.dsl.services.CurlBetterThanHttpieGrammarAccess;
import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class CurlBetterThanHttpieParser extends AbstractAntlrParser {

	@Inject
	private CurlBetterThanHttpieGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens();
	}
	

	@Override
	protected InternalCurlBetterThanHttpieParser createParser(XtextTokenStream stream) {
		return new InternalCurlBetterThanHttpieParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "CommandLineInterface";
	}

	public CurlBetterThanHttpieGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(CurlBetterThanHttpieGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
