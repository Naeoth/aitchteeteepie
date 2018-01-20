/*
 * generated by Xtext 2.13.0
 */
grammar InternalCurlBetterThanHttpie;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package aitchteeteepie.xtext.dsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package aitchteeteepie.xtext.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import aitchteeteepie.xtext.dsl.services.CurlBetterThanHttpieGrammarAccess;

}

@parser::members {

 	private CurlBetterThanHttpieGrammarAccess grammarAccess;

    public InternalCurlBetterThanHttpieParser(TokenStream input, CurlBetterThanHttpieGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "CommandLineInterface";
   	}

   	@Override
   	protected CurlBetterThanHttpieGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleCommandLineInterface
entryRuleCommandLineInterface returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCommandLineInterfaceRule()); }
	iv_ruleCommandLineInterface=ruleCommandLineInterface
	{ $current=$iv_ruleCommandLineInterface.current; }
	EOF;

// Rule CommandLineInterface
ruleCommandLineInterface returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getCommandLineInterfaceAccess().getCommandLineInterfaceAction_0(),
					$current);
			}
		)
		otherlv_1='http'
		{
			newLeafNode(otherlv_1, grammarAccess.getCommandLineInterfaceAccess().getHttpKeyword_1());
		}
		this_WS_2=RULE_WS
		{
			newLeafNode(this_WS_2, grammarAccess.getCommandLineInterfaceAccess().getWSTerminalRuleCall_2());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getCommandLineInterfaceAccess().getFlagsFlagParserRuleCall_3_0_0());
					}
					lv_flags_3_0=ruleFlag
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCommandLineInterfaceRule());
						}
						add(
							$current,
							"flags",
							lv_flags_3_0,
							"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.Flag");
						afterParserOrEnumRuleCall();
					}
				)
			)
			this_WS_4=RULE_WS
			{
				newLeafNode(this_WS_4, grammarAccess.getCommandLineInterfaceAccess().getWSTerminalRuleCall_3_1());
			}
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getCommandLineInterfaceAccess().getMethodMethodEnumRuleCall_4_0());
				}
				lv_method_5_0=ruleMethod
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCommandLineInterfaceRule());
					}
					set(
						$current,
						"method",
						lv_method_5_0,
						"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.Method");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		this_WS_6=RULE_WS
		{
			newLeafNode(this_WS_6, grammarAccess.getCommandLineInterfaceAccess().getWSTerminalRuleCall_5());
		}
		(
			(
				(
					lv_protocol_7_0=RULE_STRING
					{
						newLeafNode(lv_protocol_7_0, grammarAccess.getCommandLineInterfaceAccess().getProtocolSTRINGTerminalRuleCall_6_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getCommandLineInterfaceRule());
						}
						setWithLastConsumed(
							$current,
							"protocol",
							lv_protocol_7_0,
							"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.STRING");
					}
				)
			)
			otherlv_8='://'
			{
				newLeafNode(otherlv_8, grammarAccess.getCommandLineInterfaceAccess().getColonSolidusSolidusKeyword_6_1());
			}
		)?
		(
			(
				(
					(
						lv_url_9_0=RULE_STRING
						{
							newLeafNode(lv_url_9_0, grammarAccess.getCommandLineInterfaceAccess().getUrlSTRINGTerminalRuleCall_7_0_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getCommandLineInterfaceRule());
							}
							setWithLastConsumed(
								$current,
								"url",
								lv_url_9_0,
								"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.STRING");
						}
					)
				)
				(
					otherlv_10=':'
					{
						newLeafNode(otherlv_10, grammarAccess.getCommandLineInterfaceAccess().getColonKeyword_7_0_1_0());
					}
					(
						(
							lv_port_11_0=RULE_INT
							{
								newLeafNode(lv_port_11_0, grammarAccess.getCommandLineInterfaceAccess().getPortINTTerminalRuleCall_7_0_1_1_0());
							}
							{
								if ($current==null) {
									$current = createModelElement(grammarAccess.getCommandLineInterfaceRule());
								}
								setWithLastConsumed(
									$current,
									"port",
									lv_port_11_0,
									"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.INT");
							}
						)
					)
				)?
			)
			    |
			(
				otherlv_12=':'
				{
					newLeafNode(otherlv_12, grammarAccess.getCommandLineInterfaceAccess().getColonKeyword_7_1_0());
				}
				(
					(
						lv_port_13_0=RULE_INT
						{
							newLeafNode(lv_port_13_0, grammarAccess.getCommandLineInterfaceAccess().getPortINTTerminalRuleCall_7_1_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getCommandLineInterfaceRule());
							}
							setWithLastConsumed(
								$current,
								"port",
								lv_port_13_0,
								"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.INT");
						}
					)
				)?
			)
		)
		(
			otherlv_14='/'
			{
				newLeafNode(otherlv_14, grammarAccess.getCommandLineInterfaceAccess().getSolidusKeyword_8_0());
			}
			(
				(
					lv_resource_15_0=RULE_STRING
					{
						newLeafNode(lv_resource_15_0, grammarAccess.getCommandLineInterfaceAccess().getResourceSTRINGTerminalRuleCall_8_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getCommandLineInterfaceRule());
						}
						setWithLastConsumed(
							$current,
							"resource",
							lv_resource_15_0,
							"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.STRING");
					}
				)
			)
		)?
		this_WS_16=RULE_WS
		{
			newLeafNode(this_WS_16, grammarAccess.getCommandLineInterfaceAccess().getWSTerminalRuleCall_9());
		}
		(
			otherlv_17='--'
			{
				newLeafNode(otherlv_17, grammarAccess.getCommandLineInterfaceAccess().getHyphenMinusHyphenMinusKeyword_10_0());
			}
			this_WS_18=RULE_WS
			{
				newLeafNode(this_WS_18, grammarAccess.getCommandLineInterfaceAccess().getWSTerminalRuleCall_10_1());
			}
		)?
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getCommandLineInterfaceAccess().getItemsItemParserRuleCall_11_0_0());
					}
					lv_items_19_0=ruleItem
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCommandLineInterfaceRule());
						}
						add(
							$current,
							"items",
							lv_items_19_0,
							"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.Item");
						afterParserOrEnumRuleCall();
					}
				)
			)
			this_WS_20=RULE_WS
			{
				newLeafNode(this_WS_20, grammarAccess.getCommandLineInterfaceAccess().getWSTerminalRuleCall_11_1());
			}
		)*
	)
;

// Entry rule entryRuleFlag
entryRuleFlag returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFlagRule()); }
	iv_ruleFlag=ruleFlag
	{ $current=$iv_ruleFlag.current; }
	EOF;

// Rule Flag
ruleFlag returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getFlagAccess().getProxyFlagParserRuleCall_0());
		}
		this_ProxyFlag_0=ruleProxyFlag
		{
			$current = $this_ProxyFlag_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getFlagAccess().getFormFlagParserRuleCall_1());
		}
		this_FormFlag_1=ruleFormFlag
		{
			$current = $this_FormFlag_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getFlagAccess().getAuthFlagParserRuleCall_2());
		}
		this_AuthFlag_2=ruleAuthFlag
		{
			$current = $this_AuthFlag_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getFlagAccess().getDownloadFlagParserRuleCall_3());
		}
		this_DownloadFlag_3=ruleDownloadFlag
		{
			$current = $this_DownloadFlag_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getFlagAccess().getBodyFlagParserRuleCall_4());
		}
		this_BodyFlag_4=ruleBodyFlag
		{
			$current = $this_BodyFlag_4.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getFlagAccess().getVersionFlagParserRuleCall_5());
		}
		this_VersionFlag_5=ruleVersionFlag
		{
			$current = $this_VersionFlag_5.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getFlagAccess().getJsonFlagParserRuleCall_6());
		}
		this_JsonFlag_6=ruleJsonFlag
		{
			$current = $this_JsonFlag_6.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getFlagAccess().getHelpFlagParserRuleCall_7());
		}
		this_HelpFlag_7=ruleHelpFlag
		{
			$current = $this_HelpFlag_7.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getFlagAccess().getHeadersFlagParserRuleCall_8());
		}
		this_HeadersFlag_8=ruleHeadersFlag
		{
			$current = $this_HeadersFlag_8.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getFlagAccess().getVerboseFlagParserRuleCall_9());
		}
		this_VerboseFlag_9=ruleVerboseFlag
		{
			$current = $this_VerboseFlag_9.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getFlagAccess().getTimeoutFlagParserRuleCall_10());
		}
		this_TimeoutFlag_10=ruleTimeoutFlag
		{
			$current = $this_TimeoutFlag_10.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleHeadersFlag
entryRuleHeadersFlag returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getHeadersFlagRule()); }
	iv_ruleHeadersFlag=ruleHeadersFlag
	{ $current=$iv_ruleHeadersFlag.current; }
	EOF;

// Rule HeadersFlag
ruleHeadersFlag returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getHeadersFlagAccess().getHeadersFlagAction_0(),
					$current);
			}
		)
		(
			otherlv_1='--header'
			{
				newLeafNode(otherlv_1, grammarAccess.getHeadersFlagAccess().getHeaderKeyword_1_0());
			}
			    |
			otherlv_2='-t'
			{
				newLeafNode(otherlv_2, grammarAccess.getHeadersFlagAccess().getTKeyword_1_1());
			}
		)
	)
;

// Entry rule entryRuleBodyFlag
entryRuleBodyFlag returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBodyFlagRule()); }
	iv_ruleBodyFlag=ruleBodyFlag
	{ $current=$iv_ruleBodyFlag.current; }
	EOF;

// Rule BodyFlag
ruleBodyFlag returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getBodyFlagAccess().getBodyFlagAction_0(),
					$current);
			}
		)
		(
			otherlv_1='--body'
			{
				newLeafNode(otherlv_1, grammarAccess.getBodyFlagAccess().getBodyKeyword_1_0());
			}
			    |
			otherlv_2='-b'
			{
				newLeafNode(otherlv_2, grammarAccess.getBodyFlagAccess().getBKeyword_1_1());
			}
		)
	)
;

// Entry rule entryRuleJsonFlag
entryRuleJsonFlag returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getJsonFlagRule()); }
	iv_ruleJsonFlag=ruleJsonFlag
	{ $current=$iv_ruleJsonFlag.current; }
	EOF;

// Rule JsonFlag
ruleJsonFlag returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getJsonFlagAccess().getJsonFlagAction_0(),
					$current);
			}
		)
		(
			otherlv_1='--json'
			{
				newLeafNode(otherlv_1, grammarAccess.getJsonFlagAccess().getJsonKeyword_1_0());
			}
			    |
			otherlv_2='-j'
			{
				newLeafNode(otherlv_2, grammarAccess.getJsonFlagAccess().getJKeyword_1_1());
			}
		)
	)
;

// Entry rule entryRuleFormFlag
entryRuleFormFlag returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFormFlagRule()); }
	iv_ruleFormFlag=ruleFormFlag
	{ $current=$iv_ruleFormFlag.current; }
	EOF;

// Rule FormFlag
ruleFormFlag returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getFormFlagAccess().getFormFlagAction_0(),
					$current);
			}
		)
		(
			otherlv_1='--form'
			{
				newLeafNode(otherlv_1, grammarAccess.getFormFlagAccess().getFormKeyword_1_0());
			}
			    |
			otherlv_2='f'
			{
				newLeafNode(otherlv_2, grammarAccess.getFormFlagAccess().getFKeyword_1_1());
			}
		)
	)
;

// Entry rule entryRuleProxyFlag
entryRuleProxyFlag returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProxyFlagRule()); }
	iv_ruleProxyFlag=ruleProxyFlag
	{ $current=$iv_ruleProxyFlag.current; }
	EOF;

// Rule ProxyFlag
ruleProxyFlag returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='--proxy'
		{
			newLeafNode(otherlv_0, grammarAccess.getProxyFlagAccess().getProxyKeyword_0());
		}
		this_VALUE_1=RULE_VALUE
		{
			newLeafNode(this_VALUE_1, grammarAccess.getProxyFlagAccess().getVALUETerminalRuleCall_1());
		}
		(
			(
				(
					lv_protocol_2_0=RULE_STRING
					{
						newLeafNode(lv_protocol_2_0, grammarAccess.getProxyFlagAccess().getProtocolSTRINGTerminalRuleCall_2_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getProxyFlagRule());
						}
						setWithLastConsumed(
							$current,
							"protocol",
							lv_protocol_2_0,
							"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.STRING");
					}
				)
			)
			otherlv_3=':'
			{
				newLeafNode(otherlv_3, grammarAccess.getProxyFlagAccess().getColonKeyword_2_1());
			}
		)?
		(
			(
				(
					lv_proxyProtocol_4_0=RULE_STRING
					{
						newLeafNode(lv_proxyProtocol_4_0, grammarAccess.getProxyFlagAccess().getProxyProtocolSTRINGTerminalRuleCall_3_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getProxyFlagRule());
						}
						setWithLastConsumed(
							$current,
							"proxyProtocol",
							lv_proxyProtocol_4_0,
							"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.STRING");
					}
				)
			)
			otherlv_5='://'
			{
				newLeafNode(otherlv_5, grammarAccess.getProxyFlagAccess().getColonSolidusSolidusKeyword_3_1());
			}
		)?
		(
			(
				(
					lv_username_6_0=RULE_STRING
					{
						newLeafNode(lv_username_6_0, grammarAccess.getProxyFlagAccess().getUsernameSTRINGTerminalRuleCall_4_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getProxyFlagRule());
						}
						setWithLastConsumed(
							$current,
							"username",
							lv_username_6_0,
							"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.STRING");
					}
				)
			)
			otherlv_7=':'
			{
				newLeafNode(otherlv_7, grammarAccess.getProxyFlagAccess().getColonKeyword_4_1());
			}
			(
				(
					lv_password_8_0=RULE_STRING
					{
						newLeafNode(lv_password_8_0, grammarAccess.getProxyFlagAccess().getPasswordSTRINGTerminalRuleCall_4_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getProxyFlagRule());
						}
						setWithLastConsumed(
							$current,
							"password",
							lv_password_8_0,
							"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.STRING");
					}
				)
			)
			otherlv_9='a'
			{
				newLeafNode(otherlv_9, grammarAccess.getProxyFlagAccess().getAKeyword_4_3());
			}
		)?
		(
			(
				lv_hostname_10_0=RULE_STRING
				{
					newLeafNode(lv_hostname_10_0, grammarAccess.getProxyFlagAccess().getHostnameSTRINGTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getProxyFlagRule());
					}
					setWithLastConsumed(
						$current,
						"hostname",
						lv_hostname_10_0,
						"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.STRING");
				}
			)
		)
		(
			otherlv_11=':'
			{
				newLeafNode(otherlv_11, grammarAccess.getProxyFlagAccess().getColonKeyword_6_0());
			}
			(
				(
					lv_port_12_0=RULE_INT
					{
						newLeafNode(lv_port_12_0, grammarAccess.getProxyFlagAccess().getPortINTTerminalRuleCall_6_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getProxyFlagRule());
						}
						setWithLastConsumed(
							$current,
							"port",
							lv_port_12_0,
							"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.INT");
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleAuthFlag
entryRuleAuthFlag returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAuthFlagRule()); }
	iv_ruleAuthFlag=ruleAuthFlag
	{ $current=$iv_ruleAuthFlag.current; }
	EOF;

// Rule AuthFlag
ruleAuthFlag returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='--auth'
			{
				newLeafNode(otherlv_0, grammarAccess.getAuthFlagAccess().getAuthKeyword_0_0());
			}
			    |
			otherlv_1='-a'
			{
				newLeafNode(otherlv_1, grammarAccess.getAuthFlagAccess().getAKeyword_0_1());
			}
		)
		this_VALUE_2=RULE_VALUE
		{
			newLeafNode(this_VALUE_2, grammarAccess.getAuthFlagAccess().getVALUETerminalRuleCall_1());
		}
		(
			(
				lv_username_3_0=RULE_STRING
				{
					newLeafNode(lv_username_3_0, grammarAccess.getAuthFlagAccess().getUsernameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAuthFlagRule());
					}
					setWithLastConsumed(
						$current,
						"username",
						lv_username_3_0,
						"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.STRING");
				}
			)
		)
		(
			otherlv_4=':'
			{
				newLeafNode(otherlv_4, grammarAccess.getAuthFlagAccess().getColonKeyword_3_0());
			}
			(
				(
					lv_password_5_0=RULE_STRING
					{
						newLeafNode(lv_password_5_0, grammarAccess.getAuthFlagAccess().getPasswordSTRINGTerminalRuleCall_3_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAuthFlagRule());
						}
						setWithLastConsumed(
							$current,
							"password",
							lv_password_5_0,
							"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.STRING");
					}
				)
			)
		)?
		(
			otherlv_6='@'
			{
				newLeafNode(otherlv_6, grammarAccess.getAuthFlagAccess().getCommercialAtKeyword_4_0());
			}
			(
				(
					lv_hostname_7_0=RULE_STRING
					{
						newLeafNode(lv_hostname_7_0, grammarAccess.getAuthFlagAccess().getHostnameSTRINGTerminalRuleCall_4_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAuthFlagRule());
						}
						setWithLastConsumed(
							$current,
							"hostname",
							lv_hostname_7_0,
							"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.STRING");
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleDownloadFlag
entryRuleDownloadFlag returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDownloadFlagRule()); }
	iv_ruleDownloadFlag=ruleDownloadFlag
	{ $current=$iv_ruleDownloadFlag.current; }
	EOF;

// Rule DownloadFlag
ruleDownloadFlag returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getDownloadFlagAccess().getDownloadFlagAction_0(),
					$current);
			}
		)
		(
			otherlv_1='--download'
			{
				newLeafNode(otherlv_1, grammarAccess.getDownloadFlagAccess().getDownloadKeyword_1_0());
			}
			    |
			otherlv_2='-d'
			{
				newLeafNode(otherlv_2, grammarAccess.getDownloadFlagAccess().getDKeyword_1_1());
			}
		)
	)
;

// Entry rule entryRuleHelpFlag
entryRuleHelpFlag returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getHelpFlagRule()); }
	iv_ruleHelpFlag=ruleHelpFlag
	{ $current=$iv_ruleHelpFlag.current; }
	EOF;

// Rule HelpFlag
ruleHelpFlag returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getHelpFlagAccess().getHelpFlagAction_0(),
					$current);
			}
		)
		(
			otherlv_1='--help'
			{
				newLeafNode(otherlv_1, grammarAccess.getHelpFlagAccess().getHelpKeyword_1_0());
			}
			    |
			otherlv_2='-h'
			{
				newLeafNode(otherlv_2, grammarAccess.getHelpFlagAccess().getHKeyword_1_1());
			}
		)
	)
;

// Entry rule entryRuleVersionFlag
entryRuleVersionFlag returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVersionFlagRule()); }
	iv_ruleVersionFlag=ruleVersionFlag
	{ $current=$iv_ruleVersionFlag.current; }
	EOF;

// Rule VersionFlag
ruleVersionFlag returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getVersionFlagAccess().getVersionFlagAction_0(),
					$current);
			}
		)
		otherlv_1='--version'
		{
			newLeafNode(otherlv_1, grammarAccess.getVersionFlagAccess().getVersionKeyword_1());
		}
	)
;

// Entry rule entryRuleVerboseFlag
entryRuleVerboseFlag returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVerboseFlagRule()); }
	iv_ruleVerboseFlag=ruleVerboseFlag
	{ $current=$iv_ruleVerboseFlag.current; }
	EOF;

// Rule VerboseFlag
ruleVerboseFlag returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getVerboseFlagAccess().getVerboseFlagAction_0(),
					$current);
			}
		)
		(
			otherlv_1='--verbose'
			{
				newLeafNode(otherlv_1, grammarAccess.getVerboseFlagAccess().getVerboseKeyword_1_0());
			}
			    |
			otherlv_2='-v'
			{
				newLeafNode(otherlv_2, grammarAccess.getVerboseFlagAccess().getVKeyword_1_1());
			}
		)
	)
;

// Entry rule entryRuleTimeoutFlag
entryRuleTimeoutFlag returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTimeoutFlagRule()); }
	iv_ruleTimeoutFlag=ruleTimeoutFlag
	{ $current=$iv_ruleTimeoutFlag.current; }
	EOF;

// Rule TimeoutFlag
ruleTimeoutFlag returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='--timeout'
		{
			newLeafNode(otherlv_0, grammarAccess.getTimeoutFlagAccess().getTimeoutKeyword_0());
		}
		this_VALUE_1=RULE_VALUE
		{
			newLeafNode(this_VALUE_1, grammarAccess.getTimeoutFlagAccess().getVALUETerminalRuleCall_1());
		}
		(
			(
				lv_timeout_2_0=RULE_FLOAT
				{
					newLeafNode(lv_timeout_2_0, grammarAccess.getTimeoutFlagAccess().getTimeoutFLOATTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTimeoutFlagRule());
					}
					setWithLastConsumed(
						$current,
						"timeout",
						lv_timeout_2_0,
						"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.FLOAT");
				}
			)
		)
	)
;

// Entry rule entryRuleItem
entryRuleItem returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getItemRule()); }
	iv_ruleItem=ruleItem
	{ $current=$iv_ruleItem.current; }
	EOF;

// Rule Item
ruleItem returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getItemAccess().getFormFileFieldItemParserRuleCall_0());
		}
		this_FormFileFieldItem_0=ruleFormFileFieldItem
		{
			$current = $this_FormFileFieldItem_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getItemAccess().getDataFieldItemParserRuleCall_1());
		}
		this_DataFieldItem_1=ruleDataFieldItem
		{
			$current = $this_DataFieldItem_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getItemAccess().getHttpHeaderItemParserRuleCall_2());
		}
		this_HttpHeaderItem_2=ruleHttpHeaderItem
		{
			$current = $this_HttpHeaderItem_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getItemAccess().getUrlParameterItemParserRuleCall_3());
		}
		this_UrlParameterItem_3=ruleUrlParameterItem
		{
			$current = $this_UrlParameterItem_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getItemAccess().getRawJsonFieldItemParserRuleCall_4());
		}
		this_RawJsonFieldItem_4=ruleRawJsonFieldItem
		{
			$current = $this_RawJsonFieldItem_4.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleFormFileFieldItem
entryRuleFormFileFieldItem returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFormFileFieldItemRule()); }
	iv_ruleFormFileFieldItem=ruleFormFileFieldItem
	{ $current=$iv_ruleFormFileFieldItem.current; }
	EOF;

// Rule FormFileFieldItem
ruleFormFileFieldItem returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_field_0_0=RULE_STRING
				{
					newLeafNode(lv_field_0_0, grammarAccess.getFormFileFieldItemAccess().getFieldSTRINGTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFormFileFieldItemRule());
					}
					setWithLastConsumed(
						$current,
						"field",
						lv_field_0_0,
						"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.STRING");
				}
			)
		)
		otherlv_1='@'
		{
			newLeafNode(otherlv_1, grammarAccess.getFormFileFieldItemAccess().getCommercialAtKeyword_1());
		}
		(
			(
				lv_value_2_0=RULE_STRING
				{
					newLeafNode(lv_value_2_0, grammarAccess.getFormFileFieldItemAccess().getValueSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFormFileFieldItemRule());
					}
					setWithLastConsumed(
						$current,
						"value",
						lv_value_2_0,
						"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleDataFieldItem
entryRuleDataFieldItem returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDataFieldItemRule()); }
	iv_ruleDataFieldItem=ruleDataFieldItem
	{ $current=$iv_ruleDataFieldItem.current; }
	EOF;

// Rule DataFieldItem
ruleDataFieldItem returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_field_0_0=RULE_STRING
				{
					newLeafNode(lv_field_0_0, grammarAccess.getDataFieldItemAccess().getFieldSTRINGTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDataFieldItemRule());
					}
					setWithLastConsumed(
						$current,
						"field",
						lv_field_0_0,
						"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.STRING");
				}
			)
		)
		otherlv_1='='
		{
			newLeafNode(otherlv_1, grammarAccess.getDataFieldItemAccess().getEqualsSignKeyword_1());
		}
		(
			(
				(
					lv_value_2_0=RULE_STRING
					{
						newLeafNode(lv_value_2_0, grammarAccess.getDataFieldItemAccess().getValueSTRINGTerminalRuleCall_2_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDataFieldItemRule());
						}
						setWithLastConsumed(
							$current,
							"value",
							lv_value_2_0,
							"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.STRING");
					}
				)
			)
			    |
			(
				otherlv_3='@'
				{
					newLeafNode(otherlv_3, grammarAccess.getDataFieldItemAccess().getCommercialAtKeyword_2_1_0());
				}
				(
					(
						lv_value_4_0=RULE_STRING
						{
							newLeafNode(lv_value_4_0, grammarAccess.getDataFieldItemAccess().getValueSTRINGTerminalRuleCall_2_1_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getDataFieldItemRule());
							}
							setWithLastConsumed(
								$current,
								"value",
								lv_value_4_0,
								"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.STRING");
						}
					)
				)
			)
		)
	)
;

// Entry rule entryRuleHttpHeaderItem
entryRuleHttpHeaderItem returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getHttpHeaderItemRule()); }
	iv_ruleHttpHeaderItem=ruleHttpHeaderItem
	{ $current=$iv_ruleHttpHeaderItem.current; }
	EOF;

// Rule HttpHeaderItem
ruleHttpHeaderItem returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_field_0_0=RULE_STRING
				{
					newLeafNode(lv_field_0_0, grammarAccess.getHttpHeaderItemAccess().getFieldSTRINGTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getHttpHeaderItemRule());
					}
					setWithLastConsumed(
						$current,
						"field",
						lv_field_0_0,
						"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.STRING");
				}
			)
		)
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getHttpHeaderItemAccess().getColonKeyword_1());
		}
		(
			(
				lv_value_2_0=RULE_STRING
				{
					newLeafNode(lv_value_2_0, grammarAccess.getHttpHeaderItemAccess().getValueSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getHttpHeaderItemRule());
					}
					setWithLastConsumed(
						$current,
						"value",
						lv_value_2_0,
						"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleUrlParameterItem
entryRuleUrlParameterItem returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUrlParameterItemRule()); }
	iv_ruleUrlParameterItem=ruleUrlParameterItem
	{ $current=$iv_ruleUrlParameterItem.current; }
	EOF;

// Rule UrlParameterItem
ruleUrlParameterItem returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_field_0_0=RULE_STRING
				{
					newLeafNode(lv_field_0_0, grammarAccess.getUrlParameterItemAccess().getFieldSTRINGTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUrlParameterItemRule());
					}
					setWithLastConsumed(
						$current,
						"field",
						lv_field_0_0,
						"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.STRING");
				}
			)
		)
		otherlv_1='=='
		{
			newLeafNode(otherlv_1, grammarAccess.getUrlParameterItemAccess().getEqualsSignEqualsSignKeyword_1());
		}
		(
			(
				lv_value_2_0=RULE_STRING
				{
					newLeafNode(lv_value_2_0, grammarAccess.getUrlParameterItemAccess().getValueSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUrlParameterItemRule());
					}
					setWithLastConsumed(
						$current,
						"value",
						lv_value_2_0,
						"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleRawJsonFieldItem
entryRuleRawJsonFieldItem returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRawJsonFieldItemRule()); }
	iv_ruleRawJsonFieldItem=ruleRawJsonFieldItem
	{ $current=$iv_ruleRawJsonFieldItem.current; }
	EOF;

// Rule RawJsonFieldItem
ruleRawJsonFieldItem returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			$current = forceCreateModelElement(
				grammarAccess.getRawJsonFieldItemAccess().getRawJsonFieldItemAction(),
				$current);
		}
	)
;

// Entry rule entryRuleJsonBoolean
entryRuleJsonBoolean returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getJsonBooleanRule()); }
	iv_ruleJsonBoolean=ruleJsonBoolean
	{ $current=$iv_ruleJsonBoolean.current; }
	EOF;

// Rule JsonBoolean
ruleJsonBoolean returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getJsonBooleanAccess().getJsonBooleanAction_0(),
					$current);
			}
		)
		this_BOOLEAN_1=RULE_BOOLEAN
		{
			newLeafNode(this_BOOLEAN_1, grammarAccess.getJsonBooleanAccess().getBOOLEANTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleJsonObject
entryRuleJsonObject returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getJsonObjectRule()); }
	iv_ruleJsonObject=ruleJsonObject
	{ $current=$iv_ruleJsonObject.current; }
	EOF;

// Rule JsonObject
ruleJsonObject returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getJsonObjectAccess().getJsonObjectAction_0(),
					$current);
			}
		)
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getJsonObjectAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			otherlv_2='\''
			{
				newLeafNode(otherlv_2, grammarAccess.getJsonObjectAccess().getApostropheKeyword_2_0());
			}
			    |
			otherlv_3='"'
			{
				newLeafNode(otherlv_3, grammarAccess.getJsonObjectAccess().getQuotationMarkKeyword_2_1());
			}
		)
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getJsonObjectAccess().getRightCurlyBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleJsonArray
entryRuleJsonArray returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getJsonArrayRule()); }
	iv_ruleJsonArray=ruleJsonArray
	{ $current=$iv_ruleJsonArray.current; }
	EOF;

// Rule JsonArray
ruleJsonArray returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			$current = forceCreateModelElement(
				grammarAccess.getJsonArrayAccess().getJsonArrayAction(),
				$current);
		}
	)
;

// Entry rule entryRuleJsonNumber
entryRuleJsonNumber returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getJsonNumberRule()); }
	iv_ruleJsonNumber=ruleJsonNumber
	{ $current=$iv_ruleJsonNumber.current; }
	EOF;

// Rule JsonNumber
ruleJsonNumber returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			$current = forceCreateModelElement(
				grammarAccess.getJsonNumberAccess().getJsonNumberAction(),
				$current);
		}
	)
;

// Rule Method
ruleMethod returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='GET'
			{
				$current = grammarAccess.getMethodAccess().getGETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getMethodAccess().getGETEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='POST'
			{
				$current = grammarAccess.getMethodAccess().getPOSTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getMethodAccess().getPOSTEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='PUT'
			{
				$current = grammarAccess.getMethodAccess().getPUTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getMethodAccess().getPUTEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='DELETE'
			{
				$current = grammarAccess.getMethodAccess().getDELETEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getMethodAccess().getDELETEEnumLiteralDeclaration_3());
			}
		)
	)
;

RULE_WS : (' '|'\t')+;

RULE_VALUE : ('='|RULE_WS);

fragment RULE_DIGIT : '0'..'9';

RULE_INT : ('0'|'1'..'9' RULE_DIGIT*);

RULE_FLOAT : (RULE_INT|RULE_INT? '.' RULE_DIGIT* (('E'|'e') RULE_INT)?);

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_BOOLEAN : ('true'|'false');
