/*
 * generated by Xtext 2.13.0
 */
package aitchteeteepie.xtext.dsl.ide.contentassist.antlr;

import aitchteeteepie.xtext.dsl.ide.contentassist.antlr.internal.InternalCurlBetterThanHttpieParser;
import aitchteeteepie.xtext.dsl.services.CurlBetterThanHttpieGrammarAccess;
import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class CurlBetterThanHttpieParser extends AbstractContentAssistParser {

	@Inject
	private CurlBetterThanHttpieGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalCurlBetterThanHttpieParser createParser() {
		InternalCurlBetterThanHttpieParser result = new InternalCurlBetterThanHttpieParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getFlagAccess().getAlternatives(), "rule__Flag__Alternatives");
					put(grammarAccess.getHeadersFlagAccess().getAlternatives_1(), "rule__HeadersFlag__Alternatives_1");
					put(grammarAccess.getBodyFlagAccess().getAlternatives_1(), "rule__BodyFlag__Alternatives_1");
					put(grammarAccess.getJsonFlagAccess().getAlternatives_1(), "rule__JsonFlag__Alternatives_1");
					put(grammarAccess.getFormFlagAccess().getAlternatives_1(), "rule__FormFlag__Alternatives_1");
					put(grammarAccess.getAuthFlagAccess().getAlternatives_0(), "rule__AuthFlag__Alternatives_0");
					put(grammarAccess.getDownloadFlagAccess().getAlternatives_1(), "rule__DownloadFlag__Alternatives_1");
					put(grammarAccess.getHelpFlagAccess().getAlternatives_1(), "rule__HelpFlag__Alternatives_1");
					put(grammarAccess.getVerboseFlagAccess().getAlternatives_1(), "rule__VerboseFlag__Alternatives_1");
					put(grammarAccess.getMethodAccess().getAlternatives(), "rule__Method__Alternatives");
					put(grammarAccess.getCommandLineInterfaceAccess().getGroup(), "rule__CommandLineInterface__Group__0");
					put(grammarAccess.getCommandLineInterfaceAccess().getGroup_2(), "rule__CommandLineInterface__Group_2__0");
					put(grammarAccess.getCommandLineInterfaceAccess().getGroup_3(), "rule__CommandLineInterface__Group_3__0");
					put(grammarAccess.getHeadersFlagAccess().getGroup(), "rule__HeadersFlag__Group__0");
					put(grammarAccess.getBodyFlagAccess().getGroup(), "rule__BodyFlag__Group__0");
					put(grammarAccess.getJsonFlagAccess().getGroup(), "rule__JsonFlag__Group__0");
					put(grammarAccess.getFormFlagAccess().getGroup(), "rule__FormFlag__Group__0");
					put(grammarAccess.getProxyFlagAccess().getGroup(), "rule__ProxyFlag__Group__0");
					put(grammarAccess.getProxyFlagAccess().getGroup_2(), "rule__ProxyFlag__Group_2__0");
					put(grammarAccess.getProxyFlagAccess().getGroup_3(), "rule__ProxyFlag__Group_3__0");
					put(grammarAccess.getProxyFlagAccess().getGroup_4(), "rule__ProxyFlag__Group_4__0");
					put(grammarAccess.getProxyFlagAccess().getGroup_6(), "rule__ProxyFlag__Group_6__0");
					put(grammarAccess.getAuthFlagAccess().getGroup(), "rule__AuthFlag__Group__0");
					put(grammarAccess.getAuthFlagAccess().getGroup_3(), "rule__AuthFlag__Group_3__0");
					put(grammarAccess.getAuthFlagAccess().getGroup_4(), "rule__AuthFlag__Group_4__0");
					put(grammarAccess.getDownloadFlagAccess().getGroup(), "rule__DownloadFlag__Group__0");
					put(grammarAccess.getHelpFlagAccess().getGroup(), "rule__HelpFlag__Group__0");
					put(grammarAccess.getVersionFlagAccess().getGroup(), "rule__VersionFlag__Group__0");
					put(grammarAccess.getVerboseFlagAccess().getGroup(), "rule__VerboseFlag__Group__0");
					put(grammarAccess.getTimeoutFlagAccess().getGroup(), "rule__TimeoutFlag__Group__0");
					put(grammarAccess.getCommandLineInterfaceAccess().getFlagsAssignment_2_1(), "rule__CommandLineInterface__FlagsAssignment_2_1");
					put(grammarAccess.getCommandLineInterfaceAccess().getMethodAssignment_3_1(), "rule__CommandLineInterface__MethodAssignment_3_1");
					put(grammarAccess.getProxyFlagAccess().getProtocolAssignment_2_0(), "rule__ProxyFlag__ProtocolAssignment_2_0");
					put(grammarAccess.getProxyFlagAccess().getProxyProtocolAssignment_3_0(), "rule__ProxyFlag__ProxyProtocolAssignment_3_0");
					put(grammarAccess.getProxyFlagAccess().getUsernameAssignment_4_0(), "rule__ProxyFlag__UsernameAssignment_4_0");
					put(grammarAccess.getProxyFlagAccess().getPasswordAssignment_4_2(), "rule__ProxyFlag__PasswordAssignment_4_2");
					put(grammarAccess.getProxyFlagAccess().getHostnameAssignment_5(), "rule__ProxyFlag__HostnameAssignment_5");
					put(grammarAccess.getProxyFlagAccess().getPortAssignment_6_1(), "rule__ProxyFlag__PortAssignment_6_1");
					put(grammarAccess.getAuthFlagAccess().getUsernameAssignment_2(), "rule__AuthFlag__UsernameAssignment_2");
					put(grammarAccess.getAuthFlagAccess().getPasswordAssignment_3_1(), "rule__AuthFlag__PasswordAssignment_3_1");
					put(grammarAccess.getAuthFlagAccess().getHostnameAssignment_4_1(), "rule__AuthFlag__HostnameAssignment_4_1");
					put(grammarAccess.getTimeoutFlagAccess().getTimeoutAssignment_2(), "rule__TimeoutFlag__TimeoutAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] {  };
	}

	public CurlBetterThanHttpieGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(CurlBetterThanHttpieGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
