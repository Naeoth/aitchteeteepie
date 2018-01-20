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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCurlBetterThanHttpieParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WS", "RULE_STRING", "RULE_INT", "RULE_VALUE", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_DIGIT", "'http'", "'://'", "':'", "'/'", "'--'", "'--header'", "'-t'", "'--body'", "'-b'", "'--json'", "'-j'", "'--form'", "'f'", "'--proxy'", "'a'", "'--auth'", "'-a'", "'@'", "'--download'", "'-d'", "'--help'", "'-h'", "'--version'", "'--verbose'", "'-v'", "'--timeout'", "'='", "'=='", "'{'", "'\\''", "'\"'", "'}'", "'GET'", "'POST'", "'PUT'", "'DELETE'"
    };
    public static final int RULE_BOOLEAN=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_DIGIT=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_VALUE=7;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=4;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_FLOAT=8;
    public static final int T__46=46;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalCurlBetterThanHttpieParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCurlBetterThanHttpieParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCurlBetterThanHttpieParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCurlBetterThanHttpie.g"; }



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




    // $ANTLR start "entryRuleCommandLineInterface"
    // InternalCurlBetterThanHttpie.g:65:1: entryRuleCommandLineInterface returns [EObject current=null] : iv_ruleCommandLineInterface= ruleCommandLineInterface EOF ;
    public final EObject entryRuleCommandLineInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommandLineInterface = null;


        try {
            // InternalCurlBetterThanHttpie.g:65:61: (iv_ruleCommandLineInterface= ruleCommandLineInterface EOF )
            // InternalCurlBetterThanHttpie.g:66:2: iv_ruleCommandLineInterface= ruleCommandLineInterface EOF
            {
             newCompositeNode(grammarAccess.getCommandLineInterfaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommandLineInterface=ruleCommandLineInterface();

            state._fsp--;

             current =iv_ruleCommandLineInterface; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommandLineInterface"


    // $ANTLR start "ruleCommandLineInterface"
    // InternalCurlBetterThanHttpie.g:72:1: ruleCommandLineInterface returns [EObject current=null] : ( () otherlv_1= 'http' this_WS_2= RULE_WS ( ( (lv_flags_3_0= ruleFlag ) ) this_WS_4= RULE_WS )* ( (lv_method_5_0= ruleMethod ) )? this_WS_6= RULE_WS ( ( (lv_protocol_7_0= RULE_STRING ) ) otherlv_8= '://' )? ( ( ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ':' ( (lv_port_11_0= RULE_INT ) ) )? ) | (otherlv_12= ':' ( (lv_port_13_0= RULE_INT ) )? ) ) (otherlv_14= '/' ( (lv_resource_15_0= RULE_STRING ) ) )? this_WS_16= RULE_WS (otherlv_17= '--' this_WS_18= RULE_WS )? ( ( (lv_items_19_0= ruleItem ) ) this_WS_20= RULE_WS )* ) ;
    public final EObject ruleCommandLineInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_WS_2=null;
        Token this_WS_4=null;
        Token this_WS_6=null;
        Token lv_protocol_7_0=null;
        Token otherlv_8=null;
        Token lv_url_9_0=null;
        Token otherlv_10=null;
        Token lv_port_11_0=null;
        Token otherlv_12=null;
        Token lv_port_13_0=null;
        Token otherlv_14=null;
        Token lv_resource_15_0=null;
        Token this_WS_16=null;
        Token otherlv_17=null;
        Token this_WS_18=null;
        Token this_WS_20=null;
        EObject lv_flags_3_0 = null;

        Enumerator lv_method_5_0 = null;

        EObject lv_items_19_0 = null;



        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:78:2: ( ( () otherlv_1= 'http' this_WS_2= RULE_WS ( ( (lv_flags_3_0= ruleFlag ) ) this_WS_4= RULE_WS )* ( (lv_method_5_0= ruleMethod ) )? this_WS_6= RULE_WS ( ( (lv_protocol_7_0= RULE_STRING ) ) otherlv_8= '://' )? ( ( ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ':' ( (lv_port_11_0= RULE_INT ) ) )? ) | (otherlv_12= ':' ( (lv_port_13_0= RULE_INT ) )? ) ) (otherlv_14= '/' ( (lv_resource_15_0= RULE_STRING ) ) )? this_WS_16= RULE_WS (otherlv_17= '--' this_WS_18= RULE_WS )? ( ( (lv_items_19_0= ruleItem ) ) this_WS_20= RULE_WS )* ) )
            // InternalCurlBetterThanHttpie.g:79:2: ( () otherlv_1= 'http' this_WS_2= RULE_WS ( ( (lv_flags_3_0= ruleFlag ) ) this_WS_4= RULE_WS )* ( (lv_method_5_0= ruleMethod ) )? this_WS_6= RULE_WS ( ( (lv_protocol_7_0= RULE_STRING ) ) otherlv_8= '://' )? ( ( ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ':' ( (lv_port_11_0= RULE_INT ) ) )? ) | (otherlv_12= ':' ( (lv_port_13_0= RULE_INT ) )? ) ) (otherlv_14= '/' ( (lv_resource_15_0= RULE_STRING ) ) )? this_WS_16= RULE_WS (otherlv_17= '--' this_WS_18= RULE_WS )? ( ( (lv_items_19_0= ruleItem ) ) this_WS_20= RULE_WS )* )
            {
            // InternalCurlBetterThanHttpie.g:79:2: ( () otherlv_1= 'http' this_WS_2= RULE_WS ( ( (lv_flags_3_0= ruleFlag ) ) this_WS_4= RULE_WS )* ( (lv_method_5_0= ruleMethod ) )? this_WS_6= RULE_WS ( ( (lv_protocol_7_0= RULE_STRING ) ) otherlv_8= '://' )? ( ( ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ':' ( (lv_port_11_0= RULE_INT ) ) )? ) | (otherlv_12= ':' ( (lv_port_13_0= RULE_INT ) )? ) ) (otherlv_14= '/' ( (lv_resource_15_0= RULE_STRING ) ) )? this_WS_16= RULE_WS (otherlv_17= '--' this_WS_18= RULE_WS )? ( ( (lv_items_19_0= ruleItem ) ) this_WS_20= RULE_WS )* )
            // InternalCurlBetterThanHttpie.g:80:3: () otherlv_1= 'http' this_WS_2= RULE_WS ( ( (lv_flags_3_0= ruleFlag ) ) this_WS_4= RULE_WS )* ( (lv_method_5_0= ruleMethod ) )? this_WS_6= RULE_WS ( ( (lv_protocol_7_0= RULE_STRING ) ) otherlv_8= '://' )? ( ( ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ':' ( (lv_port_11_0= RULE_INT ) ) )? ) | (otherlv_12= ':' ( (lv_port_13_0= RULE_INT ) )? ) ) (otherlv_14= '/' ( (lv_resource_15_0= RULE_STRING ) ) )? this_WS_16= RULE_WS (otherlv_17= '--' this_WS_18= RULE_WS )? ( ( (lv_items_19_0= ruleItem ) ) this_WS_20= RULE_WS )*
            {
            // InternalCurlBetterThanHttpie.g:80:3: ()
            // InternalCurlBetterThanHttpie.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCommandLineInterfaceAccess().getCommandLineInterfaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCommandLineInterfaceAccess().getHttpKeyword_1());
            		
            this_WS_2=(Token)match(input,RULE_WS,FOLLOW_4); 

            			newLeafNode(this_WS_2, grammarAccess.getCommandLineInterfaceAccess().getWSTerminalRuleCall_2());
            		
            // InternalCurlBetterThanHttpie.g:95:3: ( ( (lv_flags_3_0= ruleFlag ) ) this_WS_4= RULE_WS )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=16 && LA1_0<=24)||(LA1_0>=26 && LA1_0<=27)||(LA1_0>=29 && LA1_0<=36)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCurlBetterThanHttpie.g:96:4: ( (lv_flags_3_0= ruleFlag ) ) this_WS_4= RULE_WS
            	    {
            	    // InternalCurlBetterThanHttpie.g:96:4: ( (lv_flags_3_0= ruleFlag ) )
            	    // InternalCurlBetterThanHttpie.g:97:5: (lv_flags_3_0= ruleFlag )
            	    {
            	    // InternalCurlBetterThanHttpie.g:97:5: (lv_flags_3_0= ruleFlag )
            	    // InternalCurlBetterThanHttpie.g:98:6: lv_flags_3_0= ruleFlag
            	    {

            	    						newCompositeNode(grammarAccess.getCommandLineInterfaceAccess().getFlagsFlagParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_flags_3_0=ruleFlag();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCommandLineInterfaceRule());
            	    						}
            	    						add(
            	    							current,
            	    							"flags",
            	    							lv_flags_3_0,
            	    							"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.Flag");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_4); 

            	    				newLeafNode(this_WS_4, grammarAccess.getCommandLineInterfaceAccess().getWSTerminalRuleCall_3_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalCurlBetterThanHttpie.g:120:3: ( (lv_method_5_0= ruleMethod ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=43 && LA2_0<=46)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:121:4: (lv_method_5_0= ruleMethod )
                    {
                    // InternalCurlBetterThanHttpie.g:121:4: (lv_method_5_0= ruleMethod )
                    // InternalCurlBetterThanHttpie.g:122:5: lv_method_5_0= ruleMethod
                    {

                    					newCompositeNode(grammarAccess.getCommandLineInterfaceAccess().getMethodMethodEnumRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_method_5_0=ruleMethod();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCommandLineInterfaceRule());
                    					}
                    					set(
                    						current,
                    						"method",
                    						lv_method_5_0,
                    						"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.Method");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_WS_6=(Token)match(input,RULE_WS,FOLLOW_5); 

            			newLeafNode(this_WS_6, grammarAccess.getCommandLineInterfaceAccess().getWSTerminalRuleCall_5());
            		
            // InternalCurlBetterThanHttpie.g:143:3: ( ( (lv_protocol_7_0= RULE_STRING ) ) otherlv_8= '://' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==12) ) {
                    alt3=1;
                }
            }
            switch (alt3) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:144:4: ( (lv_protocol_7_0= RULE_STRING ) ) otherlv_8= '://'
                    {
                    // InternalCurlBetterThanHttpie.g:144:4: ( (lv_protocol_7_0= RULE_STRING ) )
                    // InternalCurlBetterThanHttpie.g:145:5: (lv_protocol_7_0= RULE_STRING )
                    {
                    // InternalCurlBetterThanHttpie.g:145:5: (lv_protocol_7_0= RULE_STRING )
                    // InternalCurlBetterThanHttpie.g:146:6: lv_protocol_7_0= RULE_STRING
                    {
                    lv_protocol_7_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

                    						newLeafNode(lv_protocol_7_0, grammarAccess.getCommandLineInterfaceAccess().getProtocolSTRINGTerminalRuleCall_6_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCommandLineInterfaceRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"protocol",
                    							lv_protocol_7_0,
                    							"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.STRING");
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_8, grammarAccess.getCommandLineInterfaceAccess().getColonSolidusSolidusKeyword_6_1());
                    			

                    }
                    break;

            }

            // InternalCurlBetterThanHttpie.g:167:3: ( ( ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ':' ( (lv_port_11_0= RULE_INT ) ) )? ) | (otherlv_12= ':' ( (lv_port_13_0= RULE_INT ) )? ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==13) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:168:4: ( ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ':' ( (lv_port_11_0= RULE_INT ) ) )? )
                    {
                    // InternalCurlBetterThanHttpie.g:168:4: ( ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ':' ( (lv_port_11_0= RULE_INT ) ) )? )
                    // InternalCurlBetterThanHttpie.g:169:5: ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ':' ( (lv_port_11_0= RULE_INT ) ) )?
                    {
                    // InternalCurlBetterThanHttpie.g:169:5: ( (lv_url_9_0= RULE_STRING ) )
                    // InternalCurlBetterThanHttpie.g:170:6: (lv_url_9_0= RULE_STRING )
                    {
                    // InternalCurlBetterThanHttpie.g:170:6: (lv_url_9_0= RULE_STRING )
                    // InternalCurlBetterThanHttpie.g:171:7: lv_url_9_0= RULE_STRING
                    {
                    lv_url_9_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

                    							newLeafNode(lv_url_9_0, grammarAccess.getCommandLineInterfaceAccess().getUrlSTRINGTerminalRuleCall_7_0_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getCommandLineInterfaceRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"url",
                    								lv_url_9_0,
                    								"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.STRING");
                    						

                    }


                    }

                    // InternalCurlBetterThanHttpie.g:187:5: (otherlv_10= ':' ( (lv_port_11_0= RULE_INT ) ) )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==13) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalCurlBetterThanHttpie.g:188:6: otherlv_10= ':' ( (lv_port_11_0= RULE_INT ) )
                            {
                            otherlv_10=(Token)match(input,13,FOLLOW_8); 

                            						newLeafNode(otherlv_10, grammarAccess.getCommandLineInterfaceAccess().getColonKeyword_7_0_1_0());
                            					
                            // InternalCurlBetterThanHttpie.g:192:6: ( (lv_port_11_0= RULE_INT ) )
                            // InternalCurlBetterThanHttpie.g:193:7: (lv_port_11_0= RULE_INT )
                            {
                            // InternalCurlBetterThanHttpie.g:193:7: (lv_port_11_0= RULE_INT )
                            // InternalCurlBetterThanHttpie.g:194:8: lv_port_11_0= RULE_INT
                            {
                            lv_port_11_0=(Token)match(input,RULE_INT,FOLLOW_9); 

                            								newLeafNode(lv_port_11_0, grammarAccess.getCommandLineInterfaceAccess().getPortINTTerminalRuleCall_7_0_1_1_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getCommandLineInterfaceRule());
                            								}
                            								setWithLastConsumed(
                            									current,
                            									"port",
                            									lv_port_11_0,
                            									"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.INT");
                            							

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:213:4: (otherlv_12= ':' ( (lv_port_13_0= RULE_INT ) )? )
                    {
                    // InternalCurlBetterThanHttpie.g:213:4: (otherlv_12= ':' ( (lv_port_13_0= RULE_INT ) )? )
                    // InternalCurlBetterThanHttpie.g:214:5: otherlv_12= ':' ( (lv_port_13_0= RULE_INT ) )?
                    {
                    otherlv_12=(Token)match(input,13,FOLLOW_10); 

                    					newLeafNode(otherlv_12, grammarAccess.getCommandLineInterfaceAccess().getColonKeyword_7_1_0());
                    				
                    // InternalCurlBetterThanHttpie.g:218:5: ( (lv_port_13_0= RULE_INT ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==RULE_INT) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalCurlBetterThanHttpie.g:219:6: (lv_port_13_0= RULE_INT )
                            {
                            // InternalCurlBetterThanHttpie.g:219:6: (lv_port_13_0= RULE_INT )
                            // InternalCurlBetterThanHttpie.g:220:7: lv_port_13_0= RULE_INT
                            {
                            lv_port_13_0=(Token)match(input,RULE_INT,FOLLOW_9); 

                            							newLeafNode(lv_port_13_0, grammarAccess.getCommandLineInterfaceAccess().getPortINTTerminalRuleCall_7_1_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getCommandLineInterfaceRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"port",
                            								lv_port_13_0,
                            								"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.INT");
                            						

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // InternalCurlBetterThanHttpie.g:238:3: (otherlv_14= '/' ( (lv_resource_15_0= RULE_STRING ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:239:4: otherlv_14= '/' ( (lv_resource_15_0= RULE_STRING ) )
                    {
                    otherlv_14=(Token)match(input,14,FOLLOW_11); 

                    				newLeafNode(otherlv_14, grammarAccess.getCommandLineInterfaceAccess().getSolidusKeyword_8_0());
                    			
                    // InternalCurlBetterThanHttpie.g:243:4: ( (lv_resource_15_0= RULE_STRING ) )
                    // InternalCurlBetterThanHttpie.g:244:5: (lv_resource_15_0= RULE_STRING )
                    {
                    // InternalCurlBetterThanHttpie.g:244:5: (lv_resource_15_0= RULE_STRING )
                    // InternalCurlBetterThanHttpie.g:245:6: lv_resource_15_0= RULE_STRING
                    {
                    lv_resource_15_0=(Token)match(input,RULE_STRING,FOLLOW_3); 

                    						newLeafNode(lv_resource_15_0, grammarAccess.getCommandLineInterfaceAccess().getResourceSTRINGTerminalRuleCall_8_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCommandLineInterfaceRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"resource",
                    							lv_resource_15_0,
                    							"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            this_WS_16=(Token)match(input,RULE_WS,FOLLOW_12); 

            			newLeafNode(this_WS_16, grammarAccess.getCommandLineInterfaceAccess().getWSTerminalRuleCall_9());
            		
            // InternalCurlBetterThanHttpie.g:266:3: (otherlv_17= '--' this_WS_18= RULE_WS )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:267:4: otherlv_17= '--' this_WS_18= RULE_WS
                    {
                    otherlv_17=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_17, grammarAccess.getCommandLineInterfaceAccess().getHyphenMinusHyphenMinusKeyword_10_0());
                    			
                    this_WS_18=(Token)match(input,RULE_WS,FOLLOW_13); 

                    				newLeafNode(this_WS_18, grammarAccess.getCommandLineInterfaceAccess().getWSTerminalRuleCall_10_1());
                    			

                    }
                    break;

            }

            // InternalCurlBetterThanHttpie.g:276:3: ( ( (lv_items_19_0= ruleItem ) ) this_WS_20= RULE_WS )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_WS && LA9_0<=RULE_STRING)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalCurlBetterThanHttpie.g:277:4: ( (lv_items_19_0= ruleItem ) ) this_WS_20= RULE_WS
            	    {
            	    // InternalCurlBetterThanHttpie.g:277:4: ( (lv_items_19_0= ruleItem ) )
            	    // InternalCurlBetterThanHttpie.g:278:5: (lv_items_19_0= ruleItem )
            	    {
            	    // InternalCurlBetterThanHttpie.g:278:5: (lv_items_19_0= ruleItem )
            	    // InternalCurlBetterThanHttpie.g:279:6: lv_items_19_0= ruleItem
            	    {

            	    						newCompositeNode(grammarAccess.getCommandLineInterfaceAccess().getItemsItemParserRuleCall_11_0_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_items_19_0=ruleItem();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCommandLineInterfaceRule());
            	    						}
            	    						add(
            	    							current,
            	    							"items",
            	    							lv_items_19_0,
            	    							"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.Item");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    this_WS_20=(Token)match(input,RULE_WS,FOLLOW_13); 

            	    				newLeafNode(this_WS_20, grammarAccess.getCommandLineInterfaceAccess().getWSTerminalRuleCall_11_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommandLineInterface"


    // $ANTLR start "entryRuleFlag"
    // InternalCurlBetterThanHttpie.g:305:1: entryRuleFlag returns [EObject current=null] : iv_ruleFlag= ruleFlag EOF ;
    public final EObject entryRuleFlag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlag = null;


        try {
            // InternalCurlBetterThanHttpie.g:305:45: (iv_ruleFlag= ruleFlag EOF )
            // InternalCurlBetterThanHttpie.g:306:2: iv_ruleFlag= ruleFlag EOF
            {
             newCompositeNode(grammarAccess.getFlagRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFlag=ruleFlag();

            state._fsp--;

             current =iv_ruleFlag; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFlag"


    // $ANTLR start "ruleFlag"
    // InternalCurlBetterThanHttpie.g:312:1: ruleFlag returns [EObject current=null] : (this_ProxyFlag_0= ruleProxyFlag | this_FormFlag_1= ruleFormFlag | this_AuthFlag_2= ruleAuthFlag | this_DownloadFlag_3= ruleDownloadFlag | this_BodyFlag_4= ruleBodyFlag | this_VersionFlag_5= ruleVersionFlag | this_JsonFlag_6= ruleJsonFlag | this_HelpFlag_7= ruleHelpFlag | this_HeadersFlag_8= ruleHeadersFlag | this_VerboseFlag_9= ruleVerboseFlag | this_TimeoutFlag_10= ruleTimeoutFlag ) ;
    public final EObject ruleFlag() throws RecognitionException {
        EObject current = null;

        EObject this_ProxyFlag_0 = null;

        EObject this_FormFlag_1 = null;

        EObject this_AuthFlag_2 = null;

        EObject this_DownloadFlag_3 = null;

        EObject this_BodyFlag_4 = null;

        EObject this_VersionFlag_5 = null;

        EObject this_JsonFlag_6 = null;

        EObject this_HelpFlag_7 = null;

        EObject this_HeadersFlag_8 = null;

        EObject this_VerboseFlag_9 = null;

        EObject this_TimeoutFlag_10 = null;



        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:318:2: ( (this_ProxyFlag_0= ruleProxyFlag | this_FormFlag_1= ruleFormFlag | this_AuthFlag_2= ruleAuthFlag | this_DownloadFlag_3= ruleDownloadFlag | this_BodyFlag_4= ruleBodyFlag | this_VersionFlag_5= ruleVersionFlag | this_JsonFlag_6= ruleJsonFlag | this_HelpFlag_7= ruleHelpFlag | this_HeadersFlag_8= ruleHeadersFlag | this_VerboseFlag_9= ruleVerboseFlag | this_TimeoutFlag_10= ruleTimeoutFlag ) )
            // InternalCurlBetterThanHttpie.g:319:2: (this_ProxyFlag_0= ruleProxyFlag | this_FormFlag_1= ruleFormFlag | this_AuthFlag_2= ruleAuthFlag | this_DownloadFlag_3= ruleDownloadFlag | this_BodyFlag_4= ruleBodyFlag | this_VersionFlag_5= ruleVersionFlag | this_JsonFlag_6= ruleJsonFlag | this_HelpFlag_7= ruleHelpFlag | this_HeadersFlag_8= ruleHeadersFlag | this_VerboseFlag_9= ruleVerboseFlag | this_TimeoutFlag_10= ruleTimeoutFlag )
            {
            // InternalCurlBetterThanHttpie.g:319:2: (this_ProxyFlag_0= ruleProxyFlag | this_FormFlag_1= ruleFormFlag | this_AuthFlag_2= ruleAuthFlag | this_DownloadFlag_3= ruleDownloadFlag | this_BodyFlag_4= ruleBodyFlag | this_VersionFlag_5= ruleVersionFlag | this_JsonFlag_6= ruleJsonFlag | this_HelpFlag_7= ruleHelpFlag | this_HeadersFlag_8= ruleHeadersFlag | this_VerboseFlag_9= ruleVerboseFlag | this_TimeoutFlag_10= ruleTimeoutFlag )
            int alt10=11;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt10=1;
                }
                break;
            case 22:
            case 23:
                {
                alt10=2;
                }
                break;
            case 26:
            case 27:
                {
                alt10=3;
                }
                break;
            case 29:
            case 30:
                {
                alt10=4;
                }
                break;
            case 18:
            case 19:
                {
                alt10=5;
                }
                break;
            case 33:
                {
                alt10=6;
                }
                break;
            case 20:
            case 21:
                {
                alt10=7;
                }
                break;
            case 31:
            case 32:
                {
                alt10=8;
                }
                break;
            case 16:
            case 17:
                {
                alt10=9;
                }
                break;
            case 34:
            case 35:
                {
                alt10=10;
                }
                break;
            case 36:
                {
                alt10=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:320:3: this_ProxyFlag_0= ruleProxyFlag
                    {

                    			newCompositeNode(grammarAccess.getFlagAccess().getProxyFlagParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProxyFlag_0=ruleProxyFlag();

                    state._fsp--;


                    			current = this_ProxyFlag_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:329:3: this_FormFlag_1= ruleFormFlag
                    {

                    			newCompositeNode(grammarAccess.getFlagAccess().getFormFlagParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FormFlag_1=ruleFormFlag();

                    state._fsp--;


                    			current = this_FormFlag_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalCurlBetterThanHttpie.g:338:3: this_AuthFlag_2= ruleAuthFlag
                    {

                    			newCompositeNode(grammarAccess.getFlagAccess().getAuthFlagParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_AuthFlag_2=ruleAuthFlag();

                    state._fsp--;


                    			current = this_AuthFlag_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalCurlBetterThanHttpie.g:347:3: this_DownloadFlag_3= ruleDownloadFlag
                    {

                    			newCompositeNode(grammarAccess.getFlagAccess().getDownloadFlagParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_DownloadFlag_3=ruleDownloadFlag();

                    state._fsp--;


                    			current = this_DownloadFlag_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalCurlBetterThanHttpie.g:356:3: this_BodyFlag_4= ruleBodyFlag
                    {

                    			newCompositeNode(grammarAccess.getFlagAccess().getBodyFlagParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_BodyFlag_4=ruleBodyFlag();

                    state._fsp--;


                    			current = this_BodyFlag_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalCurlBetterThanHttpie.g:365:3: this_VersionFlag_5= ruleVersionFlag
                    {

                    			newCompositeNode(grammarAccess.getFlagAccess().getVersionFlagParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_VersionFlag_5=ruleVersionFlag();

                    state._fsp--;


                    			current = this_VersionFlag_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalCurlBetterThanHttpie.g:374:3: this_JsonFlag_6= ruleJsonFlag
                    {

                    			newCompositeNode(grammarAccess.getFlagAccess().getJsonFlagParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_JsonFlag_6=ruleJsonFlag();

                    state._fsp--;


                    			current = this_JsonFlag_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalCurlBetterThanHttpie.g:383:3: this_HelpFlag_7= ruleHelpFlag
                    {

                    			newCompositeNode(grammarAccess.getFlagAccess().getHelpFlagParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_HelpFlag_7=ruleHelpFlag();

                    state._fsp--;


                    			current = this_HelpFlag_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalCurlBetterThanHttpie.g:392:3: this_HeadersFlag_8= ruleHeadersFlag
                    {

                    			newCompositeNode(grammarAccess.getFlagAccess().getHeadersFlagParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_HeadersFlag_8=ruleHeadersFlag();

                    state._fsp--;


                    			current = this_HeadersFlag_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalCurlBetterThanHttpie.g:401:3: this_VerboseFlag_9= ruleVerboseFlag
                    {

                    			newCompositeNode(grammarAccess.getFlagAccess().getVerboseFlagParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_VerboseFlag_9=ruleVerboseFlag();

                    state._fsp--;


                    			current = this_VerboseFlag_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalCurlBetterThanHttpie.g:410:3: this_TimeoutFlag_10= ruleTimeoutFlag
                    {

                    			newCompositeNode(grammarAccess.getFlagAccess().getTimeoutFlagParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_TimeoutFlag_10=ruleTimeoutFlag();

                    state._fsp--;


                    			current = this_TimeoutFlag_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFlag"


    // $ANTLR start "entryRuleHeadersFlag"
    // InternalCurlBetterThanHttpie.g:422:1: entryRuleHeadersFlag returns [EObject current=null] : iv_ruleHeadersFlag= ruleHeadersFlag EOF ;
    public final EObject entryRuleHeadersFlag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeadersFlag = null;


        try {
            // InternalCurlBetterThanHttpie.g:422:52: (iv_ruleHeadersFlag= ruleHeadersFlag EOF )
            // InternalCurlBetterThanHttpie.g:423:2: iv_ruleHeadersFlag= ruleHeadersFlag EOF
            {
             newCompositeNode(grammarAccess.getHeadersFlagRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHeadersFlag=ruleHeadersFlag();

            state._fsp--;

             current =iv_ruleHeadersFlag; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHeadersFlag"


    // $ANTLR start "ruleHeadersFlag"
    // InternalCurlBetterThanHttpie.g:429:1: ruleHeadersFlag returns [EObject current=null] : ( () (otherlv_1= '--header' | otherlv_2= '-t' ) ) ;
    public final EObject ruleHeadersFlag() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:435:2: ( ( () (otherlv_1= '--header' | otherlv_2= '-t' ) ) )
            // InternalCurlBetterThanHttpie.g:436:2: ( () (otherlv_1= '--header' | otherlv_2= '-t' ) )
            {
            // InternalCurlBetterThanHttpie.g:436:2: ( () (otherlv_1= '--header' | otherlv_2= '-t' ) )
            // InternalCurlBetterThanHttpie.g:437:3: () (otherlv_1= '--header' | otherlv_2= '-t' )
            {
            // InternalCurlBetterThanHttpie.g:437:3: ()
            // InternalCurlBetterThanHttpie.g:438:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHeadersFlagAccess().getHeadersFlagAction_0(),
            					current);
            			

            }

            // InternalCurlBetterThanHttpie.g:444:3: (otherlv_1= '--header' | otherlv_2= '-t' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==16) ) {
                alt11=1;
            }
            else if ( (LA11_0==17) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:445:4: otherlv_1= '--header'
                    {
                    otherlv_1=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getHeadersFlagAccess().getHeaderKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:450:4: otherlv_2= '-t'
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getHeadersFlagAccess().getTKeyword_1_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHeadersFlag"


    // $ANTLR start "entryRuleBodyFlag"
    // InternalCurlBetterThanHttpie.g:459:1: entryRuleBodyFlag returns [EObject current=null] : iv_ruleBodyFlag= ruleBodyFlag EOF ;
    public final EObject entryRuleBodyFlag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyFlag = null;


        try {
            // InternalCurlBetterThanHttpie.g:459:49: (iv_ruleBodyFlag= ruleBodyFlag EOF )
            // InternalCurlBetterThanHttpie.g:460:2: iv_ruleBodyFlag= ruleBodyFlag EOF
            {
             newCompositeNode(grammarAccess.getBodyFlagRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBodyFlag=ruleBodyFlag();

            state._fsp--;

             current =iv_ruleBodyFlag; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBodyFlag"


    // $ANTLR start "ruleBodyFlag"
    // InternalCurlBetterThanHttpie.g:466:1: ruleBodyFlag returns [EObject current=null] : ( () (otherlv_1= '--body' | otherlv_2= '-b' ) ) ;
    public final EObject ruleBodyFlag() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:472:2: ( ( () (otherlv_1= '--body' | otherlv_2= '-b' ) ) )
            // InternalCurlBetterThanHttpie.g:473:2: ( () (otherlv_1= '--body' | otherlv_2= '-b' ) )
            {
            // InternalCurlBetterThanHttpie.g:473:2: ( () (otherlv_1= '--body' | otherlv_2= '-b' ) )
            // InternalCurlBetterThanHttpie.g:474:3: () (otherlv_1= '--body' | otherlv_2= '-b' )
            {
            // InternalCurlBetterThanHttpie.g:474:3: ()
            // InternalCurlBetterThanHttpie.g:475:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBodyFlagAccess().getBodyFlagAction_0(),
            					current);
            			

            }

            // InternalCurlBetterThanHttpie.g:481:3: (otherlv_1= '--body' | otherlv_2= '-b' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            else if ( (LA12_0==19) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:482:4: otherlv_1= '--body'
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getBodyFlagAccess().getBodyKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:487:4: otherlv_2= '-b'
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getBodyFlagAccess().getBKeyword_1_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBodyFlag"


    // $ANTLR start "entryRuleJsonFlag"
    // InternalCurlBetterThanHttpie.g:496:1: entryRuleJsonFlag returns [EObject current=null] : iv_ruleJsonFlag= ruleJsonFlag EOF ;
    public final EObject entryRuleJsonFlag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonFlag = null;


        try {
            // InternalCurlBetterThanHttpie.g:496:49: (iv_ruleJsonFlag= ruleJsonFlag EOF )
            // InternalCurlBetterThanHttpie.g:497:2: iv_ruleJsonFlag= ruleJsonFlag EOF
            {
             newCompositeNode(grammarAccess.getJsonFlagRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJsonFlag=ruleJsonFlag();

            state._fsp--;

             current =iv_ruleJsonFlag; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJsonFlag"


    // $ANTLR start "ruleJsonFlag"
    // InternalCurlBetterThanHttpie.g:503:1: ruleJsonFlag returns [EObject current=null] : ( () (otherlv_1= '--json' | otherlv_2= '-j' ) ) ;
    public final EObject ruleJsonFlag() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:509:2: ( ( () (otherlv_1= '--json' | otherlv_2= '-j' ) ) )
            // InternalCurlBetterThanHttpie.g:510:2: ( () (otherlv_1= '--json' | otherlv_2= '-j' ) )
            {
            // InternalCurlBetterThanHttpie.g:510:2: ( () (otherlv_1= '--json' | otherlv_2= '-j' ) )
            // InternalCurlBetterThanHttpie.g:511:3: () (otherlv_1= '--json' | otherlv_2= '-j' )
            {
            // InternalCurlBetterThanHttpie.g:511:3: ()
            // InternalCurlBetterThanHttpie.g:512:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getJsonFlagAccess().getJsonFlagAction_0(),
            					current);
            			

            }

            // InternalCurlBetterThanHttpie.g:518:3: (otherlv_1= '--json' | otherlv_2= '-j' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==20) ) {
                alt13=1;
            }
            else if ( (LA13_0==21) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:519:4: otherlv_1= '--json'
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getJsonFlagAccess().getJsonKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:524:4: otherlv_2= '-j'
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getJsonFlagAccess().getJKeyword_1_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJsonFlag"


    // $ANTLR start "entryRuleFormFlag"
    // InternalCurlBetterThanHttpie.g:533:1: entryRuleFormFlag returns [EObject current=null] : iv_ruleFormFlag= ruleFormFlag EOF ;
    public final EObject entryRuleFormFlag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormFlag = null;


        try {
            // InternalCurlBetterThanHttpie.g:533:49: (iv_ruleFormFlag= ruleFormFlag EOF )
            // InternalCurlBetterThanHttpie.g:534:2: iv_ruleFormFlag= ruleFormFlag EOF
            {
             newCompositeNode(grammarAccess.getFormFlagRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFormFlag=ruleFormFlag();

            state._fsp--;

             current =iv_ruleFormFlag; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFormFlag"


    // $ANTLR start "ruleFormFlag"
    // InternalCurlBetterThanHttpie.g:540:1: ruleFormFlag returns [EObject current=null] : ( () (otherlv_1= '--form' | otherlv_2= 'f' ) ) ;
    public final EObject ruleFormFlag() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:546:2: ( ( () (otherlv_1= '--form' | otherlv_2= 'f' ) ) )
            // InternalCurlBetterThanHttpie.g:547:2: ( () (otherlv_1= '--form' | otherlv_2= 'f' ) )
            {
            // InternalCurlBetterThanHttpie.g:547:2: ( () (otherlv_1= '--form' | otherlv_2= 'f' ) )
            // InternalCurlBetterThanHttpie.g:548:3: () (otherlv_1= '--form' | otherlv_2= 'f' )
            {
            // InternalCurlBetterThanHttpie.g:548:3: ()
            // InternalCurlBetterThanHttpie.g:549:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFormFlagAccess().getFormFlagAction_0(),
            					current);
            			

            }

            // InternalCurlBetterThanHttpie.g:555:3: (otherlv_1= '--form' | otherlv_2= 'f' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            else if ( (LA14_0==23) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:556:4: otherlv_1= '--form'
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getFormFlagAccess().getFormKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:561:4: otherlv_2= 'f'
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getFormFlagAccess().getFKeyword_1_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFormFlag"


    // $ANTLR start "entryRuleProxyFlag"
    // InternalCurlBetterThanHttpie.g:570:1: entryRuleProxyFlag returns [EObject current=null] : iv_ruleProxyFlag= ruleProxyFlag EOF ;
    public final EObject entryRuleProxyFlag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProxyFlag = null;


        try {
            // InternalCurlBetterThanHttpie.g:570:50: (iv_ruleProxyFlag= ruleProxyFlag EOF )
            // InternalCurlBetterThanHttpie.g:571:2: iv_ruleProxyFlag= ruleProxyFlag EOF
            {
             newCompositeNode(grammarAccess.getProxyFlagRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProxyFlag=ruleProxyFlag();

            state._fsp--;

             current =iv_ruleProxyFlag; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProxyFlag"


    // $ANTLR start "ruleProxyFlag"
    // InternalCurlBetterThanHttpie.g:577:1: ruleProxyFlag returns [EObject current=null] : (otherlv_0= '--proxy' this_VALUE_1= RULE_VALUE ( ( (lv_protocol_2_0= RULE_STRING ) ) otherlv_3= ':' )? ( ( (lv_proxyProtocol_4_0= RULE_STRING ) ) otherlv_5= '://' )? ( ( (lv_username_6_0= RULE_STRING ) ) otherlv_7= ':' ( (lv_password_8_0= RULE_STRING ) ) otherlv_9= 'a' )? ( (lv_hostname_10_0= RULE_STRING ) ) (otherlv_11= ':' ( (lv_port_12_0= RULE_INT ) ) )? ) ;
    public final EObject ruleProxyFlag() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_VALUE_1=null;
        Token lv_protocol_2_0=null;
        Token otherlv_3=null;
        Token lv_proxyProtocol_4_0=null;
        Token otherlv_5=null;
        Token lv_username_6_0=null;
        Token otherlv_7=null;
        Token lv_password_8_0=null;
        Token otherlv_9=null;
        Token lv_hostname_10_0=null;
        Token otherlv_11=null;
        Token lv_port_12_0=null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:583:2: ( (otherlv_0= '--proxy' this_VALUE_1= RULE_VALUE ( ( (lv_protocol_2_0= RULE_STRING ) ) otherlv_3= ':' )? ( ( (lv_proxyProtocol_4_0= RULE_STRING ) ) otherlv_5= '://' )? ( ( (lv_username_6_0= RULE_STRING ) ) otherlv_7= ':' ( (lv_password_8_0= RULE_STRING ) ) otherlv_9= 'a' )? ( (lv_hostname_10_0= RULE_STRING ) ) (otherlv_11= ':' ( (lv_port_12_0= RULE_INT ) ) )? ) )
            // InternalCurlBetterThanHttpie.g:584:2: (otherlv_0= '--proxy' this_VALUE_1= RULE_VALUE ( ( (lv_protocol_2_0= RULE_STRING ) ) otherlv_3= ':' )? ( ( (lv_proxyProtocol_4_0= RULE_STRING ) ) otherlv_5= '://' )? ( ( (lv_username_6_0= RULE_STRING ) ) otherlv_7= ':' ( (lv_password_8_0= RULE_STRING ) ) otherlv_9= 'a' )? ( (lv_hostname_10_0= RULE_STRING ) ) (otherlv_11= ':' ( (lv_port_12_0= RULE_INT ) ) )? )
            {
            // InternalCurlBetterThanHttpie.g:584:2: (otherlv_0= '--proxy' this_VALUE_1= RULE_VALUE ( ( (lv_protocol_2_0= RULE_STRING ) ) otherlv_3= ':' )? ( ( (lv_proxyProtocol_4_0= RULE_STRING ) ) otherlv_5= '://' )? ( ( (lv_username_6_0= RULE_STRING ) ) otherlv_7= ':' ( (lv_password_8_0= RULE_STRING ) ) otherlv_9= 'a' )? ( (lv_hostname_10_0= RULE_STRING ) ) (otherlv_11= ':' ( (lv_port_12_0= RULE_INT ) ) )? )
            // InternalCurlBetterThanHttpie.g:585:3: otherlv_0= '--proxy' this_VALUE_1= RULE_VALUE ( ( (lv_protocol_2_0= RULE_STRING ) ) otherlv_3= ':' )? ( ( (lv_proxyProtocol_4_0= RULE_STRING ) ) otherlv_5= '://' )? ( ( (lv_username_6_0= RULE_STRING ) ) otherlv_7= ':' ( (lv_password_8_0= RULE_STRING ) ) otherlv_9= 'a' )? ( (lv_hostname_10_0= RULE_STRING ) ) (otherlv_11= ':' ( (lv_port_12_0= RULE_INT ) ) )?
            {
            otherlv_0=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getProxyFlagAccess().getProxyKeyword_0());
            		
            this_VALUE_1=(Token)match(input,RULE_VALUE,FOLLOW_11); 

            			newLeafNode(this_VALUE_1, grammarAccess.getProxyFlagAccess().getVALUETerminalRuleCall_1());
            		
            // InternalCurlBetterThanHttpie.g:593:3: ( ( (lv_protocol_2_0= RULE_STRING ) ) otherlv_3= ':' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==13) ) {
                    int LA15_2 = input.LA(3);

                    if ( (LA15_2==RULE_STRING) ) {
                        int LA15_4 = input.LA(4);

                        if ( (LA15_4==EOF||LA15_4==RULE_WS||(LA15_4>=12 && LA15_4<=13)) ) {
                            alt15=1;
                        }
                    }
                }
            }
            switch (alt15) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:594:4: ( (lv_protocol_2_0= RULE_STRING ) ) otherlv_3= ':'
                    {
                    // InternalCurlBetterThanHttpie.g:594:4: ( (lv_protocol_2_0= RULE_STRING ) )
                    // InternalCurlBetterThanHttpie.g:595:5: (lv_protocol_2_0= RULE_STRING )
                    {
                    // InternalCurlBetterThanHttpie.g:595:5: (lv_protocol_2_0= RULE_STRING )
                    // InternalCurlBetterThanHttpie.g:596:6: lv_protocol_2_0= RULE_STRING
                    {
                    lv_protocol_2_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

                    						newLeafNode(lv_protocol_2_0, grammarAccess.getProxyFlagAccess().getProtocolSTRINGTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProxyFlagRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"protocol",
                    							lv_protocol_2_0,
                    							"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.STRING");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,13,FOLLOW_11); 

                    				newLeafNode(otherlv_3, grammarAccess.getProxyFlagAccess().getColonKeyword_2_1());
                    			

                    }
                    break;

            }

            // InternalCurlBetterThanHttpie.g:617:3: ( ( (lv_proxyProtocol_4_0= RULE_STRING ) ) otherlv_5= '://' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==12) ) {
                    alt16=1;
                }
            }
            switch (alt16) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:618:4: ( (lv_proxyProtocol_4_0= RULE_STRING ) ) otherlv_5= '://'
                    {
                    // InternalCurlBetterThanHttpie.g:618:4: ( (lv_proxyProtocol_4_0= RULE_STRING ) )
                    // InternalCurlBetterThanHttpie.g:619:5: (lv_proxyProtocol_4_0= RULE_STRING )
                    {
                    // InternalCurlBetterThanHttpie.g:619:5: (lv_proxyProtocol_4_0= RULE_STRING )
                    // InternalCurlBetterThanHttpie.g:620:6: lv_proxyProtocol_4_0= RULE_STRING
                    {
                    lv_proxyProtocol_4_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

                    						newLeafNode(lv_proxyProtocol_4_0, grammarAccess.getProxyFlagAccess().getProxyProtocolSTRINGTerminalRuleCall_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProxyFlagRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"proxyProtocol",
                    							lv_proxyProtocol_4_0,
                    							"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.STRING");
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,12,FOLLOW_11); 

                    				newLeafNode(otherlv_5, grammarAccess.getProxyFlagAccess().getColonSolidusSolidusKeyword_3_1());
                    			

                    }
                    break;

            }

            // InternalCurlBetterThanHttpie.g:641:3: ( ( (lv_username_6_0= RULE_STRING ) ) otherlv_7= ':' ( (lv_password_8_0= RULE_STRING ) ) otherlv_9= 'a' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==13) ) {
                    int LA17_2 = input.LA(3);

                    if ( (LA17_2==RULE_STRING) ) {
                        alt17=1;
                    }
                }
            }
            switch (alt17) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:642:4: ( (lv_username_6_0= RULE_STRING ) ) otherlv_7= ':' ( (lv_password_8_0= RULE_STRING ) ) otherlv_9= 'a'
                    {
                    // InternalCurlBetterThanHttpie.g:642:4: ( (lv_username_6_0= RULE_STRING ) )
                    // InternalCurlBetterThanHttpie.g:643:5: (lv_username_6_0= RULE_STRING )
                    {
                    // InternalCurlBetterThanHttpie.g:643:5: (lv_username_6_0= RULE_STRING )
                    // InternalCurlBetterThanHttpie.g:644:6: lv_username_6_0= RULE_STRING
                    {
                    lv_username_6_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

                    						newLeafNode(lv_username_6_0, grammarAccess.getProxyFlagAccess().getUsernameSTRINGTerminalRuleCall_4_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProxyFlagRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"username",
                    							lv_username_6_0,
                    							"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.STRING");
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,13,FOLLOW_11); 

                    				newLeafNode(otherlv_7, grammarAccess.getProxyFlagAccess().getColonKeyword_4_1());
                    			
                    // InternalCurlBetterThanHttpie.g:664:4: ( (lv_password_8_0= RULE_STRING ) )
                    // InternalCurlBetterThanHttpie.g:665:5: (lv_password_8_0= RULE_STRING )
                    {
                    // InternalCurlBetterThanHttpie.g:665:5: (lv_password_8_0= RULE_STRING )
                    // InternalCurlBetterThanHttpie.g:666:6: lv_password_8_0= RULE_STRING
                    {
                    lv_password_8_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

                    						newLeafNode(lv_password_8_0, grammarAccess.getProxyFlagAccess().getPasswordSTRINGTerminalRuleCall_4_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProxyFlagRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"password",
                    							lv_password_8_0,
                    							"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.STRING");
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,25,FOLLOW_11); 

                    				newLeafNode(otherlv_9, grammarAccess.getProxyFlagAccess().getAKeyword_4_3());
                    			

                    }
                    break;

            }

            // InternalCurlBetterThanHttpie.g:687:3: ( (lv_hostname_10_0= RULE_STRING ) )
            // InternalCurlBetterThanHttpie.g:688:4: (lv_hostname_10_0= RULE_STRING )
            {
            // InternalCurlBetterThanHttpie.g:688:4: (lv_hostname_10_0= RULE_STRING )
            // InternalCurlBetterThanHttpie.g:689:5: lv_hostname_10_0= RULE_STRING
            {
            lv_hostname_10_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_hostname_10_0, grammarAccess.getProxyFlagAccess().getHostnameSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProxyFlagRule());
            					}
            					setWithLastConsumed(
            						current,
            						"hostname",
            						lv_hostname_10_0,
            						"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.STRING");
            				

            }


            }

            // InternalCurlBetterThanHttpie.g:705:3: (otherlv_11= ':' ( (lv_port_12_0= RULE_INT ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==13) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:706:4: otherlv_11= ':' ( (lv_port_12_0= RULE_INT ) )
                    {
                    otherlv_11=(Token)match(input,13,FOLLOW_8); 

                    				newLeafNode(otherlv_11, grammarAccess.getProxyFlagAccess().getColonKeyword_6_0());
                    			
                    // InternalCurlBetterThanHttpie.g:710:4: ( (lv_port_12_0= RULE_INT ) )
                    // InternalCurlBetterThanHttpie.g:711:5: (lv_port_12_0= RULE_INT )
                    {
                    // InternalCurlBetterThanHttpie.g:711:5: (lv_port_12_0= RULE_INT )
                    // InternalCurlBetterThanHttpie.g:712:6: lv_port_12_0= RULE_INT
                    {
                    lv_port_12_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_port_12_0, grammarAccess.getProxyFlagAccess().getPortINTTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProxyFlagRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"port",
                    							lv_port_12_0,
                    							"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.INT");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProxyFlag"


    // $ANTLR start "entryRuleAuthFlag"
    // InternalCurlBetterThanHttpie.g:733:1: entryRuleAuthFlag returns [EObject current=null] : iv_ruleAuthFlag= ruleAuthFlag EOF ;
    public final EObject entryRuleAuthFlag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAuthFlag = null;


        try {
            // InternalCurlBetterThanHttpie.g:733:49: (iv_ruleAuthFlag= ruleAuthFlag EOF )
            // InternalCurlBetterThanHttpie.g:734:2: iv_ruleAuthFlag= ruleAuthFlag EOF
            {
             newCompositeNode(grammarAccess.getAuthFlagRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAuthFlag=ruleAuthFlag();

            state._fsp--;

             current =iv_ruleAuthFlag; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAuthFlag"


    // $ANTLR start "ruleAuthFlag"
    // InternalCurlBetterThanHttpie.g:740:1: ruleAuthFlag returns [EObject current=null] : ( (otherlv_0= '--auth' | otherlv_1= '-a' ) this_VALUE_2= RULE_VALUE ( (lv_username_3_0= RULE_STRING ) ) (otherlv_4= ':' ( (lv_password_5_0= RULE_STRING ) ) )? (otherlv_6= '@' ( (lv_hostname_7_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleAuthFlag() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_VALUE_2=null;
        Token lv_username_3_0=null;
        Token otherlv_4=null;
        Token lv_password_5_0=null;
        Token otherlv_6=null;
        Token lv_hostname_7_0=null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:746:2: ( ( (otherlv_0= '--auth' | otherlv_1= '-a' ) this_VALUE_2= RULE_VALUE ( (lv_username_3_0= RULE_STRING ) ) (otherlv_4= ':' ( (lv_password_5_0= RULE_STRING ) ) )? (otherlv_6= '@' ( (lv_hostname_7_0= RULE_STRING ) ) )? ) )
            // InternalCurlBetterThanHttpie.g:747:2: ( (otherlv_0= '--auth' | otherlv_1= '-a' ) this_VALUE_2= RULE_VALUE ( (lv_username_3_0= RULE_STRING ) ) (otherlv_4= ':' ( (lv_password_5_0= RULE_STRING ) ) )? (otherlv_6= '@' ( (lv_hostname_7_0= RULE_STRING ) ) )? )
            {
            // InternalCurlBetterThanHttpie.g:747:2: ( (otherlv_0= '--auth' | otherlv_1= '-a' ) this_VALUE_2= RULE_VALUE ( (lv_username_3_0= RULE_STRING ) ) (otherlv_4= ':' ( (lv_password_5_0= RULE_STRING ) ) )? (otherlv_6= '@' ( (lv_hostname_7_0= RULE_STRING ) ) )? )
            // InternalCurlBetterThanHttpie.g:748:3: (otherlv_0= '--auth' | otherlv_1= '-a' ) this_VALUE_2= RULE_VALUE ( (lv_username_3_0= RULE_STRING ) ) (otherlv_4= ':' ( (lv_password_5_0= RULE_STRING ) ) )? (otherlv_6= '@' ( (lv_hostname_7_0= RULE_STRING ) ) )?
            {
            // InternalCurlBetterThanHttpie.g:748:3: (otherlv_0= '--auth' | otherlv_1= '-a' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==26) ) {
                alt19=1;
            }
            else if ( (LA19_0==27) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:749:4: otherlv_0= '--auth'
                    {
                    otherlv_0=(Token)match(input,26,FOLLOW_14); 

                    				newLeafNode(otherlv_0, grammarAccess.getAuthFlagAccess().getAuthKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:754:4: otherlv_1= '-a'
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_14); 

                    				newLeafNode(otherlv_1, grammarAccess.getAuthFlagAccess().getAKeyword_0_1());
                    			

                    }
                    break;

            }

            this_VALUE_2=(Token)match(input,RULE_VALUE,FOLLOW_11); 

            			newLeafNode(this_VALUE_2, grammarAccess.getAuthFlagAccess().getVALUETerminalRuleCall_1());
            		
            // InternalCurlBetterThanHttpie.g:763:3: ( (lv_username_3_0= RULE_STRING ) )
            // InternalCurlBetterThanHttpie.g:764:4: (lv_username_3_0= RULE_STRING )
            {
            // InternalCurlBetterThanHttpie.g:764:4: (lv_username_3_0= RULE_STRING )
            // InternalCurlBetterThanHttpie.g:765:5: lv_username_3_0= RULE_STRING
            {
            lv_username_3_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            					newLeafNode(lv_username_3_0, grammarAccess.getAuthFlagAccess().getUsernameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAuthFlagRule());
            					}
            					setWithLastConsumed(
            						current,
            						"username",
            						lv_username_3_0,
            						"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.STRING");
            				

            }


            }

            // InternalCurlBetterThanHttpie.g:781:3: (otherlv_4= ':' ( (lv_password_5_0= RULE_STRING ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==13) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:782:4: otherlv_4= ':' ( (lv_password_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_11); 

                    				newLeafNode(otherlv_4, grammarAccess.getAuthFlagAccess().getColonKeyword_3_0());
                    			
                    // InternalCurlBetterThanHttpie.g:786:4: ( (lv_password_5_0= RULE_STRING ) )
                    // InternalCurlBetterThanHttpie.g:787:5: (lv_password_5_0= RULE_STRING )
                    {
                    // InternalCurlBetterThanHttpie.g:787:5: (lv_password_5_0= RULE_STRING )
                    // InternalCurlBetterThanHttpie.g:788:6: lv_password_5_0= RULE_STRING
                    {
                    lv_password_5_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

                    						newLeafNode(lv_password_5_0, grammarAccess.getAuthFlagAccess().getPasswordSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAuthFlagRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"password",
                    							lv_password_5_0,
                    							"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCurlBetterThanHttpie.g:805:3: (otherlv_6= '@' ( (lv_hostname_7_0= RULE_STRING ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==28) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:806:4: otherlv_6= '@' ( (lv_hostname_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,28,FOLLOW_11); 

                    				newLeafNode(otherlv_6, grammarAccess.getAuthFlagAccess().getCommercialAtKeyword_4_0());
                    			
                    // InternalCurlBetterThanHttpie.g:810:4: ( (lv_hostname_7_0= RULE_STRING ) )
                    // InternalCurlBetterThanHttpie.g:811:5: (lv_hostname_7_0= RULE_STRING )
                    {
                    // InternalCurlBetterThanHttpie.g:811:5: (lv_hostname_7_0= RULE_STRING )
                    // InternalCurlBetterThanHttpie.g:812:6: lv_hostname_7_0= RULE_STRING
                    {
                    lv_hostname_7_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_hostname_7_0, grammarAccess.getAuthFlagAccess().getHostnameSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAuthFlagRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"hostname",
                    							lv_hostname_7_0,
                    							"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.STRING");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAuthFlag"


    // $ANTLR start "entryRuleDownloadFlag"
    // InternalCurlBetterThanHttpie.g:833:1: entryRuleDownloadFlag returns [EObject current=null] : iv_ruleDownloadFlag= ruleDownloadFlag EOF ;
    public final EObject entryRuleDownloadFlag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDownloadFlag = null;


        try {
            // InternalCurlBetterThanHttpie.g:833:53: (iv_ruleDownloadFlag= ruleDownloadFlag EOF )
            // InternalCurlBetterThanHttpie.g:834:2: iv_ruleDownloadFlag= ruleDownloadFlag EOF
            {
             newCompositeNode(grammarAccess.getDownloadFlagRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDownloadFlag=ruleDownloadFlag();

            state._fsp--;

             current =iv_ruleDownloadFlag; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDownloadFlag"


    // $ANTLR start "ruleDownloadFlag"
    // InternalCurlBetterThanHttpie.g:840:1: ruleDownloadFlag returns [EObject current=null] : ( () (otherlv_1= '--download' | otherlv_2= '-d' ) ) ;
    public final EObject ruleDownloadFlag() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:846:2: ( ( () (otherlv_1= '--download' | otherlv_2= '-d' ) ) )
            // InternalCurlBetterThanHttpie.g:847:2: ( () (otherlv_1= '--download' | otherlv_2= '-d' ) )
            {
            // InternalCurlBetterThanHttpie.g:847:2: ( () (otherlv_1= '--download' | otherlv_2= '-d' ) )
            // InternalCurlBetterThanHttpie.g:848:3: () (otherlv_1= '--download' | otherlv_2= '-d' )
            {
            // InternalCurlBetterThanHttpie.g:848:3: ()
            // InternalCurlBetterThanHttpie.g:849:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDownloadFlagAccess().getDownloadFlagAction_0(),
            					current);
            			

            }

            // InternalCurlBetterThanHttpie.g:855:3: (otherlv_1= '--download' | otherlv_2= '-d' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==29) ) {
                alt22=1;
            }
            else if ( (LA22_0==30) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:856:4: otherlv_1= '--download'
                    {
                    otherlv_1=(Token)match(input,29,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getDownloadFlagAccess().getDownloadKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:861:4: otherlv_2= '-d'
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getDownloadFlagAccess().getDKeyword_1_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDownloadFlag"


    // $ANTLR start "entryRuleHelpFlag"
    // InternalCurlBetterThanHttpie.g:870:1: entryRuleHelpFlag returns [EObject current=null] : iv_ruleHelpFlag= ruleHelpFlag EOF ;
    public final EObject entryRuleHelpFlag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHelpFlag = null;


        try {
            // InternalCurlBetterThanHttpie.g:870:49: (iv_ruleHelpFlag= ruleHelpFlag EOF )
            // InternalCurlBetterThanHttpie.g:871:2: iv_ruleHelpFlag= ruleHelpFlag EOF
            {
             newCompositeNode(grammarAccess.getHelpFlagRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHelpFlag=ruleHelpFlag();

            state._fsp--;

             current =iv_ruleHelpFlag; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHelpFlag"


    // $ANTLR start "ruleHelpFlag"
    // InternalCurlBetterThanHttpie.g:877:1: ruleHelpFlag returns [EObject current=null] : ( () (otherlv_1= '--help' | otherlv_2= '-h' ) ) ;
    public final EObject ruleHelpFlag() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:883:2: ( ( () (otherlv_1= '--help' | otherlv_2= '-h' ) ) )
            // InternalCurlBetterThanHttpie.g:884:2: ( () (otherlv_1= '--help' | otherlv_2= '-h' ) )
            {
            // InternalCurlBetterThanHttpie.g:884:2: ( () (otherlv_1= '--help' | otherlv_2= '-h' ) )
            // InternalCurlBetterThanHttpie.g:885:3: () (otherlv_1= '--help' | otherlv_2= '-h' )
            {
            // InternalCurlBetterThanHttpie.g:885:3: ()
            // InternalCurlBetterThanHttpie.g:886:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHelpFlagAccess().getHelpFlagAction_0(),
            					current);
            			

            }

            // InternalCurlBetterThanHttpie.g:892:3: (otherlv_1= '--help' | otherlv_2= '-h' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==31) ) {
                alt23=1;
            }
            else if ( (LA23_0==32) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:893:4: otherlv_1= '--help'
                    {
                    otherlv_1=(Token)match(input,31,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getHelpFlagAccess().getHelpKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:898:4: otherlv_2= '-h'
                    {
                    otherlv_2=(Token)match(input,32,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getHelpFlagAccess().getHKeyword_1_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHelpFlag"


    // $ANTLR start "entryRuleVersionFlag"
    // InternalCurlBetterThanHttpie.g:907:1: entryRuleVersionFlag returns [EObject current=null] : iv_ruleVersionFlag= ruleVersionFlag EOF ;
    public final EObject entryRuleVersionFlag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersionFlag = null;


        try {
            // InternalCurlBetterThanHttpie.g:907:52: (iv_ruleVersionFlag= ruleVersionFlag EOF )
            // InternalCurlBetterThanHttpie.g:908:2: iv_ruleVersionFlag= ruleVersionFlag EOF
            {
             newCompositeNode(grammarAccess.getVersionFlagRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVersionFlag=ruleVersionFlag();

            state._fsp--;

             current =iv_ruleVersionFlag; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVersionFlag"


    // $ANTLR start "ruleVersionFlag"
    // InternalCurlBetterThanHttpie.g:914:1: ruleVersionFlag returns [EObject current=null] : ( () otherlv_1= '--version' ) ;
    public final EObject ruleVersionFlag() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:920:2: ( ( () otherlv_1= '--version' ) )
            // InternalCurlBetterThanHttpie.g:921:2: ( () otherlv_1= '--version' )
            {
            // InternalCurlBetterThanHttpie.g:921:2: ( () otherlv_1= '--version' )
            // InternalCurlBetterThanHttpie.g:922:3: () otherlv_1= '--version'
            {
            // InternalCurlBetterThanHttpie.g:922:3: ()
            // InternalCurlBetterThanHttpie.g:923:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVersionFlagAccess().getVersionFlagAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getVersionFlagAccess().getVersionKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVersionFlag"


    // $ANTLR start "entryRuleVerboseFlag"
    // InternalCurlBetterThanHttpie.g:937:1: entryRuleVerboseFlag returns [EObject current=null] : iv_ruleVerboseFlag= ruleVerboseFlag EOF ;
    public final EObject entryRuleVerboseFlag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerboseFlag = null;


        try {
            // InternalCurlBetterThanHttpie.g:937:52: (iv_ruleVerboseFlag= ruleVerboseFlag EOF )
            // InternalCurlBetterThanHttpie.g:938:2: iv_ruleVerboseFlag= ruleVerboseFlag EOF
            {
             newCompositeNode(grammarAccess.getVerboseFlagRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVerboseFlag=ruleVerboseFlag();

            state._fsp--;

             current =iv_ruleVerboseFlag; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVerboseFlag"


    // $ANTLR start "ruleVerboseFlag"
    // InternalCurlBetterThanHttpie.g:944:1: ruleVerboseFlag returns [EObject current=null] : ( () (otherlv_1= '--verbose' | otherlv_2= '-v' ) ) ;
    public final EObject ruleVerboseFlag() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:950:2: ( ( () (otherlv_1= '--verbose' | otherlv_2= '-v' ) ) )
            // InternalCurlBetterThanHttpie.g:951:2: ( () (otherlv_1= '--verbose' | otherlv_2= '-v' ) )
            {
            // InternalCurlBetterThanHttpie.g:951:2: ( () (otherlv_1= '--verbose' | otherlv_2= '-v' ) )
            // InternalCurlBetterThanHttpie.g:952:3: () (otherlv_1= '--verbose' | otherlv_2= '-v' )
            {
            // InternalCurlBetterThanHttpie.g:952:3: ()
            // InternalCurlBetterThanHttpie.g:953:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVerboseFlagAccess().getVerboseFlagAction_0(),
            					current);
            			

            }

            // InternalCurlBetterThanHttpie.g:959:3: (otherlv_1= '--verbose' | otherlv_2= '-v' )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==34) ) {
                alt24=1;
            }
            else if ( (LA24_0==35) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:960:4: otherlv_1= '--verbose'
                    {
                    otherlv_1=(Token)match(input,34,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getVerboseFlagAccess().getVerboseKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:965:4: otherlv_2= '-v'
                    {
                    otherlv_2=(Token)match(input,35,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getVerboseFlagAccess().getVKeyword_1_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVerboseFlag"


    // $ANTLR start "entryRuleTimeoutFlag"
    // InternalCurlBetterThanHttpie.g:974:1: entryRuleTimeoutFlag returns [EObject current=null] : iv_ruleTimeoutFlag= ruleTimeoutFlag EOF ;
    public final EObject entryRuleTimeoutFlag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeoutFlag = null;


        try {
            // InternalCurlBetterThanHttpie.g:974:52: (iv_ruleTimeoutFlag= ruleTimeoutFlag EOF )
            // InternalCurlBetterThanHttpie.g:975:2: iv_ruleTimeoutFlag= ruleTimeoutFlag EOF
            {
             newCompositeNode(grammarAccess.getTimeoutFlagRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimeoutFlag=ruleTimeoutFlag();

            state._fsp--;

             current =iv_ruleTimeoutFlag; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTimeoutFlag"


    // $ANTLR start "ruleTimeoutFlag"
    // InternalCurlBetterThanHttpie.g:981:1: ruleTimeoutFlag returns [EObject current=null] : (otherlv_0= '--timeout' this_VALUE_1= RULE_VALUE ( (lv_timeout_2_0= RULE_FLOAT ) ) ) ;
    public final EObject ruleTimeoutFlag() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_VALUE_1=null;
        Token lv_timeout_2_0=null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:987:2: ( (otherlv_0= '--timeout' this_VALUE_1= RULE_VALUE ( (lv_timeout_2_0= RULE_FLOAT ) ) ) )
            // InternalCurlBetterThanHttpie.g:988:2: (otherlv_0= '--timeout' this_VALUE_1= RULE_VALUE ( (lv_timeout_2_0= RULE_FLOAT ) ) )
            {
            // InternalCurlBetterThanHttpie.g:988:2: (otherlv_0= '--timeout' this_VALUE_1= RULE_VALUE ( (lv_timeout_2_0= RULE_FLOAT ) ) )
            // InternalCurlBetterThanHttpie.g:989:3: otherlv_0= '--timeout' this_VALUE_1= RULE_VALUE ( (lv_timeout_2_0= RULE_FLOAT ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getTimeoutFlagAccess().getTimeoutKeyword_0());
            		
            this_VALUE_1=(Token)match(input,RULE_VALUE,FOLLOW_20); 

            			newLeafNode(this_VALUE_1, grammarAccess.getTimeoutFlagAccess().getVALUETerminalRuleCall_1());
            		
            // InternalCurlBetterThanHttpie.g:997:3: ( (lv_timeout_2_0= RULE_FLOAT ) )
            // InternalCurlBetterThanHttpie.g:998:4: (lv_timeout_2_0= RULE_FLOAT )
            {
            // InternalCurlBetterThanHttpie.g:998:4: (lv_timeout_2_0= RULE_FLOAT )
            // InternalCurlBetterThanHttpie.g:999:5: lv_timeout_2_0= RULE_FLOAT
            {
            lv_timeout_2_0=(Token)match(input,RULE_FLOAT,FOLLOW_2); 

            					newLeafNode(lv_timeout_2_0, grammarAccess.getTimeoutFlagAccess().getTimeoutFLOATTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTimeoutFlagRule());
            					}
            					setWithLastConsumed(
            						current,
            						"timeout",
            						lv_timeout_2_0,
            						"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.FLOAT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimeoutFlag"


    // $ANTLR start "entryRuleItem"
    // InternalCurlBetterThanHttpie.g:1019:1: entryRuleItem returns [EObject current=null] : iv_ruleItem= ruleItem EOF ;
    public final EObject entryRuleItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItem = null;


        try {
            // InternalCurlBetterThanHttpie.g:1019:45: (iv_ruleItem= ruleItem EOF )
            // InternalCurlBetterThanHttpie.g:1020:2: iv_ruleItem= ruleItem EOF
            {
             newCompositeNode(grammarAccess.getItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleItem=ruleItem();

            state._fsp--;

             current =iv_ruleItem; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleItem"


    // $ANTLR start "ruleItem"
    // InternalCurlBetterThanHttpie.g:1026:1: ruleItem returns [EObject current=null] : (this_FormFileFieldItem_0= ruleFormFileFieldItem | this_DataFieldItem_1= ruleDataFieldItem | this_HttpHeaderItem_2= ruleHttpHeaderItem | this_UrlParameterItem_3= ruleUrlParameterItem | this_RawJsonFieldItem_4= ruleRawJsonFieldItem ) ;
    public final EObject ruleItem() throws RecognitionException {
        EObject current = null;

        EObject this_FormFileFieldItem_0 = null;

        EObject this_DataFieldItem_1 = null;

        EObject this_HttpHeaderItem_2 = null;

        EObject this_UrlParameterItem_3 = null;

        EObject this_RawJsonFieldItem_4 = null;



        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:1032:2: ( (this_FormFileFieldItem_0= ruleFormFileFieldItem | this_DataFieldItem_1= ruleDataFieldItem | this_HttpHeaderItem_2= ruleHttpHeaderItem | this_UrlParameterItem_3= ruleUrlParameterItem | this_RawJsonFieldItem_4= ruleRawJsonFieldItem ) )
            // InternalCurlBetterThanHttpie.g:1033:2: (this_FormFileFieldItem_0= ruleFormFileFieldItem | this_DataFieldItem_1= ruleDataFieldItem | this_HttpHeaderItem_2= ruleHttpHeaderItem | this_UrlParameterItem_3= ruleUrlParameterItem | this_RawJsonFieldItem_4= ruleRawJsonFieldItem )
            {
            // InternalCurlBetterThanHttpie.g:1033:2: (this_FormFileFieldItem_0= ruleFormFileFieldItem | this_DataFieldItem_1= ruleDataFieldItem | this_HttpHeaderItem_2= ruleHttpHeaderItem | this_UrlParameterItem_3= ruleUrlParameterItem | this_RawJsonFieldItem_4= ruleRawJsonFieldItem )
            int alt25=5;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_STRING) ) {
                switch ( input.LA(2) ) {
                case 38:
                    {
                    alt25=4;
                    }
                    break;
                case 37:
                    {
                    alt25=2;
                    }
                    break;
                case 13:
                    {
                    alt25=3;
                    }
                    break;
                case 28:
                    {
                    alt25=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA25_0==EOF||LA25_0==RULE_WS) ) {
                alt25=5;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1034:3: this_FormFileFieldItem_0= ruleFormFileFieldItem
                    {

                    			newCompositeNode(grammarAccess.getItemAccess().getFormFileFieldItemParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_FormFileFieldItem_0=ruleFormFileFieldItem();

                    state._fsp--;


                    			current = this_FormFileFieldItem_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:1043:3: this_DataFieldItem_1= ruleDataFieldItem
                    {

                    			newCompositeNode(grammarAccess.getItemAccess().getDataFieldItemParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataFieldItem_1=ruleDataFieldItem();

                    state._fsp--;


                    			current = this_DataFieldItem_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalCurlBetterThanHttpie.g:1052:3: this_HttpHeaderItem_2= ruleHttpHeaderItem
                    {

                    			newCompositeNode(grammarAccess.getItemAccess().getHttpHeaderItemParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_HttpHeaderItem_2=ruleHttpHeaderItem();

                    state._fsp--;


                    			current = this_HttpHeaderItem_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalCurlBetterThanHttpie.g:1061:3: this_UrlParameterItem_3= ruleUrlParameterItem
                    {

                    			newCompositeNode(grammarAccess.getItemAccess().getUrlParameterItemParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_UrlParameterItem_3=ruleUrlParameterItem();

                    state._fsp--;


                    			current = this_UrlParameterItem_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalCurlBetterThanHttpie.g:1070:3: this_RawJsonFieldItem_4= ruleRawJsonFieldItem
                    {

                    			newCompositeNode(grammarAccess.getItemAccess().getRawJsonFieldItemParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_RawJsonFieldItem_4=ruleRawJsonFieldItem();

                    state._fsp--;


                    			current = this_RawJsonFieldItem_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleItem"


    // $ANTLR start "entryRuleFormFileFieldItem"
    // InternalCurlBetterThanHttpie.g:1082:1: entryRuleFormFileFieldItem returns [EObject current=null] : iv_ruleFormFileFieldItem= ruleFormFileFieldItem EOF ;
    public final EObject entryRuleFormFileFieldItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormFileFieldItem = null;


        try {
            // InternalCurlBetterThanHttpie.g:1082:58: (iv_ruleFormFileFieldItem= ruleFormFileFieldItem EOF )
            // InternalCurlBetterThanHttpie.g:1083:2: iv_ruleFormFileFieldItem= ruleFormFileFieldItem EOF
            {
             newCompositeNode(grammarAccess.getFormFileFieldItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFormFileFieldItem=ruleFormFileFieldItem();

            state._fsp--;

             current =iv_ruleFormFileFieldItem; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFormFileFieldItem"


    // $ANTLR start "ruleFormFileFieldItem"
    // InternalCurlBetterThanHttpie.g:1089:1: ruleFormFileFieldItem returns [EObject current=null] : ( ( (lv_field_0_0= RULE_STRING ) ) otherlv_1= '@' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleFormFileFieldItem() throws RecognitionException {
        EObject current = null;

        Token lv_field_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:1095:2: ( ( ( (lv_field_0_0= RULE_STRING ) ) otherlv_1= '@' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalCurlBetterThanHttpie.g:1096:2: ( ( (lv_field_0_0= RULE_STRING ) ) otherlv_1= '@' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalCurlBetterThanHttpie.g:1096:2: ( ( (lv_field_0_0= RULE_STRING ) ) otherlv_1= '@' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalCurlBetterThanHttpie.g:1097:3: ( (lv_field_0_0= RULE_STRING ) ) otherlv_1= '@' ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalCurlBetterThanHttpie.g:1097:3: ( (lv_field_0_0= RULE_STRING ) )
            // InternalCurlBetterThanHttpie.g:1098:4: (lv_field_0_0= RULE_STRING )
            {
            // InternalCurlBetterThanHttpie.g:1098:4: (lv_field_0_0= RULE_STRING )
            // InternalCurlBetterThanHttpie.g:1099:5: lv_field_0_0= RULE_STRING
            {
            lv_field_0_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

            					newLeafNode(lv_field_0_0, grammarAccess.getFormFileFieldItemAccess().getFieldSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFormFileFieldItemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"field",
            						lv_field_0_0,
            						"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.STRING");
            				

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getFormFileFieldItemAccess().getCommercialAtKeyword_1());
            		
            // InternalCurlBetterThanHttpie.g:1119:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalCurlBetterThanHttpie.g:1120:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalCurlBetterThanHttpie.g:1120:4: (lv_value_2_0= RULE_STRING )
            // InternalCurlBetterThanHttpie.g:1121:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getFormFileFieldItemAccess().getValueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFormFileFieldItemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFormFileFieldItem"


    // $ANTLR start "entryRuleDataFieldItem"
    // InternalCurlBetterThanHttpie.g:1141:1: entryRuleDataFieldItem returns [EObject current=null] : iv_ruleDataFieldItem= ruleDataFieldItem EOF ;
    public final EObject entryRuleDataFieldItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataFieldItem = null;


        try {
            // InternalCurlBetterThanHttpie.g:1141:54: (iv_ruleDataFieldItem= ruleDataFieldItem EOF )
            // InternalCurlBetterThanHttpie.g:1142:2: iv_ruleDataFieldItem= ruleDataFieldItem EOF
            {
             newCompositeNode(grammarAccess.getDataFieldItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataFieldItem=ruleDataFieldItem();

            state._fsp--;

             current =iv_ruleDataFieldItem; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataFieldItem"


    // $ANTLR start "ruleDataFieldItem"
    // InternalCurlBetterThanHttpie.g:1148:1: ruleDataFieldItem returns [EObject current=null] : ( ( (lv_field_0_0= RULE_STRING ) ) otherlv_1= '=' ( ( (lv_value_2_0= RULE_STRING ) ) | (otherlv_3= '@' ( (lv_value_4_0= RULE_STRING ) ) ) ) ) ;
    public final EObject ruleDataFieldItem() throws RecognitionException {
        EObject current = null;

        Token lv_field_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;
        Token lv_value_4_0=null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:1154:2: ( ( ( (lv_field_0_0= RULE_STRING ) ) otherlv_1= '=' ( ( (lv_value_2_0= RULE_STRING ) ) | (otherlv_3= '@' ( (lv_value_4_0= RULE_STRING ) ) ) ) ) )
            // InternalCurlBetterThanHttpie.g:1155:2: ( ( (lv_field_0_0= RULE_STRING ) ) otherlv_1= '=' ( ( (lv_value_2_0= RULE_STRING ) ) | (otherlv_3= '@' ( (lv_value_4_0= RULE_STRING ) ) ) ) )
            {
            // InternalCurlBetterThanHttpie.g:1155:2: ( ( (lv_field_0_0= RULE_STRING ) ) otherlv_1= '=' ( ( (lv_value_2_0= RULE_STRING ) ) | (otherlv_3= '@' ( (lv_value_4_0= RULE_STRING ) ) ) ) )
            // InternalCurlBetterThanHttpie.g:1156:3: ( (lv_field_0_0= RULE_STRING ) ) otherlv_1= '=' ( ( (lv_value_2_0= RULE_STRING ) ) | (otherlv_3= '@' ( (lv_value_4_0= RULE_STRING ) ) ) )
            {
            // InternalCurlBetterThanHttpie.g:1156:3: ( (lv_field_0_0= RULE_STRING ) )
            // InternalCurlBetterThanHttpie.g:1157:4: (lv_field_0_0= RULE_STRING )
            {
            // InternalCurlBetterThanHttpie.g:1157:4: (lv_field_0_0= RULE_STRING )
            // InternalCurlBetterThanHttpie.g:1158:5: lv_field_0_0= RULE_STRING
            {
            lv_field_0_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

            					newLeafNode(lv_field_0_0, grammarAccess.getDataFieldItemAccess().getFieldSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataFieldItemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"field",
            						lv_field_0_0,
            						"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.STRING");
            				

            }


            }

            otherlv_1=(Token)match(input,37,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getDataFieldItemAccess().getEqualsSignKeyword_1());
            		
            // InternalCurlBetterThanHttpie.g:1178:3: ( ( (lv_value_2_0= RULE_STRING ) ) | (otherlv_3= '@' ( (lv_value_4_0= RULE_STRING ) ) ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_STRING) ) {
                alt26=1;
            }
            else if ( (LA26_0==28) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1179:4: ( (lv_value_2_0= RULE_STRING ) )
                    {
                    // InternalCurlBetterThanHttpie.g:1179:4: ( (lv_value_2_0= RULE_STRING ) )
                    // InternalCurlBetterThanHttpie.g:1180:5: (lv_value_2_0= RULE_STRING )
                    {
                    // InternalCurlBetterThanHttpie.g:1180:5: (lv_value_2_0= RULE_STRING )
                    // InternalCurlBetterThanHttpie.g:1181:6: lv_value_2_0= RULE_STRING
                    {
                    lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_2_0, grammarAccess.getDataFieldItemAccess().getValueSTRINGTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDataFieldItemRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_2_0,
                    							"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.STRING");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:1198:4: (otherlv_3= '@' ( (lv_value_4_0= RULE_STRING ) ) )
                    {
                    // InternalCurlBetterThanHttpie.g:1198:4: (otherlv_3= '@' ( (lv_value_4_0= RULE_STRING ) ) )
                    // InternalCurlBetterThanHttpie.g:1199:5: otherlv_3= '@' ( (lv_value_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_11); 

                    					newLeafNode(otherlv_3, grammarAccess.getDataFieldItemAccess().getCommercialAtKeyword_2_1_0());
                    				
                    // InternalCurlBetterThanHttpie.g:1203:5: ( (lv_value_4_0= RULE_STRING ) )
                    // InternalCurlBetterThanHttpie.g:1204:6: (lv_value_4_0= RULE_STRING )
                    {
                    // InternalCurlBetterThanHttpie.g:1204:6: (lv_value_4_0= RULE_STRING )
                    // InternalCurlBetterThanHttpie.g:1205:7: lv_value_4_0= RULE_STRING
                    {
                    lv_value_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    							newLeafNode(lv_value_4_0, grammarAccess.getDataFieldItemAccess().getValueSTRINGTerminalRuleCall_2_1_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getDataFieldItemRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"value",
                    								lv_value_4_0,
                    								"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.STRING");
                    						

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataFieldItem"


    // $ANTLR start "entryRuleHttpHeaderItem"
    // InternalCurlBetterThanHttpie.g:1227:1: entryRuleHttpHeaderItem returns [EObject current=null] : iv_ruleHttpHeaderItem= ruleHttpHeaderItem EOF ;
    public final EObject entryRuleHttpHeaderItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHttpHeaderItem = null;


        try {
            // InternalCurlBetterThanHttpie.g:1227:55: (iv_ruleHttpHeaderItem= ruleHttpHeaderItem EOF )
            // InternalCurlBetterThanHttpie.g:1228:2: iv_ruleHttpHeaderItem= ruleHttpHeaderItem EOF
            {
             newCompositeNode(grammarAccess.getHttpHeaderItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHttpHeaderItem=ruleHttpHeaderItem();

            state._fsp--;

             current =iv_ruleHttpHeaderItem; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHttpHeaderItem"


    // $ANTLR start "ruleHttpHeaderItem"
    // InternalCurlBetterThanHttpie.g:1234:1: ruleHttpHeaderItem returns [EObject current=null] : ( ( (lv_field_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleHttpHeaderItem() throws RecognitionException {
        EObject current = null;

        Token lv_field_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:1240:2: ( ( ( (lv_field_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalCurlBetterThanHttpie.g:1241:2: ( ( (lv_field_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalCurlBetterThanHttpie.g:1241:2: ( ( (lv_field_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalCurlBetterThanHttpie.g:1242:3: ( (lv_field_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalCurlBetterThanHttpie.g:1242:3: ( (lv_field_0_0= RULE_STRING ) )
            // InternalCurlBetterThanHttpie.g:1243:4: (lv_field_0_0= RULE_STRING )
            {
            // InternalCurlBetterThanHttpie.g:1243:4: (lv_field_0_0= RULE_STRING )
            // InternalCurlBetterThanHttpie.g:1244:5: lv_field_0_0= RULE_STRING
            {
            lv_field_0_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_field_0_0, grammarAccess.getHttpHeaderItemAccess().getFieldSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHttpHeaderItemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"field",
            						lv_field_0_0,
            						"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.STRING");
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getHttpHeaderItemAccess().getColonKeyword_1());
            		
            // InternalCurlBetterThanHttpie.g:1264:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalCurlBetterThanHttpie.g:1265:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalCurlBetterThanHttpie.g:1265:4: (lv_value_2_0= RULE_STRING )
            // InternalCurlBetterThanHttpie.g:1266:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getHttpHeaderItemAccess().getValueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHttpHeaderItemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHttpHeaderItem"


    // $ANTLR start "entryRuleUrlParameterItem"
    // InternalCurlBetterThanHttpie.g:1286:1: entryRuleUrlParameterItem returns [EObject current=null] : iv_ruleUrlParameterItem= ruleUrlParameterItem EOF ;
    public final EObject entryRuleUrlParameterItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUrlParameterItem = null;


        try {
            // InternalCurlBetterThanHttpie.g:1286:57: (iv_ruleUrlParameterItem= ruleUrlParameterItem EOF )
            // InternalCurlBetterThanHttpie.g:1287:2: iv_ruleUrlParameterItem= ruleUrlParameterItem EOF
            {
             newCompositeNode(grammarAccess.getUrlParameterItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUrlParameterItem=ruleUrlParameterItem();

            state._fsp--;

             current =iv_ruleUrlParameterItem; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUrlParameterItem"


    // $ANTLR start "ruleUrlParameterItem"
    // InternalCurlBetterThanHttpie.g:1293:1: ruleUrlParameterItem returns [EObject current=null] : ( ( (lv_field_0_0= RULE_STRING ) ) otherlv_1= '==' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleUrlParameterItem() throws RecognitionException {
        EObject current = null;

        Token lv_field_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:1299:2: ( ( ( (lv_field_0_0= RULE_STRING ) ) otherlv_1= '==' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalCurlBetterThanHttpie.g:1300:2: ( ( (lv_field_0_0= RULE_STRING ) ) otherlv_1= '==' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalCurlBetterThanHttpie.g:1300:2: ( ( (lv_field_0_0= RULE_STRING ) ) otherlv_1= '==' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalCurlBetterThanHttpie.g:1301:3: ( (lv_field_0_0= RULE_STRING ) ) otherlv_1= '==' ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalCurlBetterThanHttpie.g:1301:3: ( (lv_field_0_0= RULE_STRING ) )
            // InternalCurlBetterThanHttpie.g:1302:4: (lv_field_0_0= RULE_STRING )
            {
            // InternalCurlBetterThanHttpie.g:1302:4: (lv_field_0_0= RULE_STRING )
            // InternalCurlBetterThanHttpie.g:1303:5: lv_field_0_0= RULE_STRING
            {
            lv_field_0_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

            					newLeafNode(lv_field_0_0, grammarAccess.getUrlParameterItemAccess().getFieldSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUrlParameterItemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"field",
            						lv_field_0_0,
            						"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.STRING");
            				

            }


            }

            otherlv_1=(Token)match(input,38,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getUrlParameterItemAccess().getEqualsSignEqualsSignKeyword_1());
            		
            // InternalCurlBetterThanHttpie.g:1323:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalCurlBetterThanHttpie.g:1324:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalCurlBetterThanHttpie.g:1324:4: (lv_value_2_0= RULE_STRING )
            // InternalCurlBetterThanHttpie.g:1325:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getUrlParameterItemAccess().getValueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUrlParameterItemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUrlParameterItem"


    // $ANTLR start "entryRuleRawJsonFieldItem"
    // InternalCurlBetterThanHttpie.g:1345:1: entryRuleRawJsonFieldItem returns [EObject current=null] : iv_ruleRawJsonFieldItem= ruleRawJsonFieldItem EOF ;
    public final EObject entryRuleRawJsonFieldItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRawJsonFieldItem = null;


        try {
            // InternalCurlBetterThanHttpie.g:1345:57: (iv_ruleRawJsonFieldItem= ruleRawJsonFieldItem EOF )
            // InternalCurlBetterThanHttpie.g:1346:2: iv_ruleRawJsonFieldItem= ruleRawJsonFieldItem EOF
            {
             newCompositeNode(grammarAccess.getRawJsonFieldItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRawJsonFieldItem=ruleRawJsonFieldItem();

            state._fsp--;

             current =iv_ruleRawJsonFieldItem; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRawJsonFieldItem"


    // $ANTLR start "ruleRawJsonFieldItem"
    // InternalCurlBetterThanHttpie.g:1352:1: ruleRawJsonFieldItem returns [EObject current=null] : () ;
    public final EObject ruleRawJsonFieldItem() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:1358:2: ( () )
            // InternalCurlBetterThanHttpie.g:1359:2: ()
            {
            // InternalCurlBetterThanHttpie.g:1359:2: ()
            // InternalCurlBetterThanHttpie.g:1360:3: 
            {

            			current = forceCreateModelElement(
            				grammarAccess.getRawJsonFieldItemAccess().getRawJsonFieldItemAction(),
            				current);
            		

            }


            }


            	leaveRule();

        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRawJsonFieldItem"


    // $ANTLR start "entryRuleJsonBoolean"
    // InternalCurlBetterThanHttpie.g:1369:1: entryRuleJsonBoolean returns [EObject current=null] : iv_ruleJsonBoolean= ruleJsonBoolean EOF ;
    public final EObject entryRuleJsonBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonBoolean = null;


        try {
            // InternalCurlBetterThanHttpie.g:1369:52: (iv_ruleJsonBoolean= ruleJsonBoolean EOF )
            // InternalCurlBetterThanHttpie.g:1370:2: iv_ruleJsonBoolean= ruleJsonBoolean EOF
            {
             newCompositeNode(grammarAccess.getJsonBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJsonBoolean=ruleJsonBoolean();

            state._fsp--;

             current =iv_ruleJsonBoolean; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJsonBoolean"


    // $ANTLR start "ruleJsonBoolean"
    // InternalCurlBetterThanHttpie.g:1376:1: ruleJsonBoolean returns [EObject current=null] : ( () this_BOOLEAN_1= RULE_BOOLEAN ) ;
    public final EObject ruleJsonBoolean() throws RecognitionException {
        EObject current = null;

        Token this_BOOLEAN_1=null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:1382:2: ( ( () this_BOOLEAN_1= RULE_BOOLEAN ) )
            // InternalCurlBetterThanHttpie.g:1383:2: ( () this_BOOLEAN_1= RULE_BOOLEAN )
            {
            // InternalCurlBetterThanHttpie.g:1383:2: ( () this_BOOLEAN_1= RULE_BOOLEAN )
            // InternalCurlBetterThanHttpie.g:1384:3: () this_BOOLEAN_1= RULE_BOOLEAN
            {
            // InternalCurlBetterThanHttpie.g:1384:3: ()
            // InternalCurlBetterThanHttpie.g:1385:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getJsonBooleanAccess().getJsonBooleanAction_0(),
            					current);
            			

            }

            this_BOOLEAN_1=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); 

            			newLeafNode(this_BOOLEAN_1, grammarAccess.getJsonBooleanAccess().getBOOLEANTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJsonBoolean"


    // $ANTLR start "entryRuleJsonObject"
    // InternalCurlBetterThanHttpie.g:1399:1: entryRuleJsonObject returns [EObject current=null] : iv_ruleJsonObject= ruleJsonObject EOF ;
    public final EObject entryRuleJsonObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonObject = null;


        try {
            // InternalCurlBetterThanHttpie.g:1399:51: (iv_ruleJsonObject= ruleJsonObject EOF )
            // InternalCurlBetterThanHttpie.g:1400:2: iv_ruleJsonObject= ruleJsonObject EOF
            {
             newCompositeNode(grammarAccess.getJsonObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJsonObject=ruleJsonObject();

            state._fsp--;

             current =iv_ruleJsonObject; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJsonObject"


    // $ANTLR start "ruleJsonObject"
    // InternalCurlBetterThanHttpie.g:1406:1: ruleJsonObject returns [EObject current=null] : ( () otherlv_1= '{' (otherlv_2= '\\'' | otherlv_3= '\"' ) otherlv_4= '}' ) ;
    public final EObject ruleJsonObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:1412:2: ( ( () otherlv_1= '{' (otherlv_2= '\\'' | otherlv_3= '\"' ) otherlv_4= '}' ) )
            // InternalCurlBetterThanHttpie.g:1413:2: ( () otherlv_1= '{' (otherlv_2= '\\'' | otherlv_3= '\"' ) otherlv_4= '}' )
            {
            // InternalCurlBetterThanHttpie.g:1413:2: ( () otherlv_1= '{' (otherlv_2= '\\'' | otherlv_3= '\"' ) otherlv_4= '}' )
            // InternalCurlBetterThanHttpie.g:1414:3: () otherlv_1= '{' (otherlv_2= '\\'' | otherlv_3= '\"' ) otherlv_4= '}'
            {
            // InternalCurlBetterThanHttpie.g:1414:3: ()
            // InternalCurlBetterThanHttpie.g:1415:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getJsonObjectAccess().getJsonObjectAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getJsonObjectAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalCurlBetterThanHttpie.g:1425:3: (otherlv_2= '\\'' | otherlv_3= '\"' )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==40) ) {
                alt27=1;
            }
            else if ( (LA27_0==41) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1426:4: otherlv_2= '\\''
                    {
                    otherlv_2=(Token)match(input,40,FOLLOW_26); 

                    				newLeafNode(otherlv_2, grammarAccess.getJsonObjectAccess().getApostropheKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:1431:4: otherlv_3= '\"'
                    {
                    otherlv_3=(Token)match(input,41,FOLLOW_26); 

                    				newLeafNode(otherlv_3, grammarAccess.getJsonObjectAccess().getQuotationMarkKeyword_2_1());
                    			

                    }
                    break;

            }

            otherlv_4=(Token)match(input,42,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getJsonObjectAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJsonObject"


    // $ANTLR start "entryRuleJsonArray"
    // InternalCurlBetterThanHttpie.g:1444:1: entryRuleJsonArray returns [EObject current=null] : iv_ruleJsonArray= ruleJsonArray EOF ;
    public final EObject entryRuleJsonArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonArray = null;


        try {
            // InternalCurlBetterThanHttpie.g:1444:50: (iv_ruleJsonArray= ruleJsonArray EOF )
            // InternalCurlBetterThanHttpie.g:1445:2: iv_ruleJsonArray= ruleJsonArray EOF
            {
             newCompositeNode(grammarAccess.getJsonArrayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJsonArray=ruleJsonArray();

            state._fsp--;

             current =iv_ruleJsonArray; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJsonArray"


    // $ANTLR start "ruleJsonArray"
    // InternalCurlBetterThanHttpie.g:1451:1: ruleJsonArray returns [EObject current=null] : () ;
    public final EObject ruleJsonArray() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:1457:2: ( () )
            // InternalCurlBetterThanHttpie.g:1458:2: ()
            {
            // InternalCurlBetterThanHttpie.g:1458:2: ()
            // InternalCurlBetterThanHttpie.g:1459:3: 
            {

            			current = forceCreateModelElement(
            				grammarAccess.getJsonArrayAccess().getJsonArrayAction(),
            				current);
            		

            }


            }


            	leaveRule();

        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJsonArray"


    // $ANTLR start "entryRuleJsonNumber"
    // InternalCurlBetterThanHttpie.g:1468:1: entryRuleJsonNumber returns [EObject current=null] : iv_ruleJsonNumber= ruleJsonNumber EOF ;
    public final EObject entryRuleJsonNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonNumber = null;


        try {
            // InternalCurlBetterThanHttpie.g:1468:51: (iv_ruleJsonNumber= ruleJsonNumber EOF )
            // InternalCurlBetterThanHttpie.g:1469:2: iv_ruleJsonNumber= ruleJsonNumber EOF
            {
             newCompositeNode(grammarAccess.getJsonNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJsonNumber=ruleJsonNumber();

            state._fsp--;

             current =iv_ruleJsonNumber; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJsonNumber"


    // $ANTLR start "ruleJsonNumber"
    // InternalCurlBetterThanHttpie.g:1475:1: ruleJsonNumber returns [EObject current=null] : () ;
    public final EObject ruleJsonNumber() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:1481:2: ( () )
            // InternalCurlBetterThanHttpie.g:1482:2: ()
            {
            // InternalCurlBetterThanHttpie.g:1482:2: ()
            // InternalCurlBetterThanHttpie.g:1483:3: 
            {

            			current = forceCreateModelElement(
            				grammarAccess.getJsonNumberAccess().getJsonNumberAction(),
            				current);
            		

            }


            }


            	leaveRule();

        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJsonNumber"


    // $ANTLR start "ruleMethod"
    // InternalCurlBetterThanHttpie.g:1492:1: ruleMethod returns [Enumerator current=null] : ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) ) ;
    public final Enumerator ruleMethod() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:1498:2: ( ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) ) )
            // InternalCurlBetterThanHttpie.g:1499:2: ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) )
            {
            // InternalCurlBetterThanHttpie.g:1499:2: ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) )
            int alt28=4;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt28=1;
                }
                break;
            case 44:
                {
                alt28=2;
                }
                break;
            case 45:
                {
                alt28=3;
                }
                break;
            case 46:
                {
                alt28=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1500:3: (enumLiteral_0= 'GET' )
                    {
                    // InternalCurlBetterThanHttpie.g:1500:3: (enumLiteral_0= 'GET' )
                    // InternalCurlBetterThanHttpie.g:1501:4: enumLiteral_0= 'GET'
                    {
                    enumLiteral_0=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getMethodAccess().getGETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMethodAccess().getGETEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:1508:3: (enumLiteral_1= 'POST' )
                    {
                    // InternalCurlBetterThanHttpie.g:1508:3: (enumLiteral_1= 'POST' )
                    // InternalCurlBetterThanHttpie.g:1509:4: enumLiteral_1= 'POST'
                    {
                    enumLiteral_1=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getMethodAccess().getPOSTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMethodAccess().getPOSTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCurlBetterThanHttpie.g:1516:3: (enumLiteral_2= 'PUT' )
                    {
                    // InternalCurlBetterThanHttpie.g:1516:3: (enumLiteral_2= 'PUT' )
                    // InternalCurlBetterThanHttpie.g:1517:4: enumLiteral_2= 'PUT'
                    {
                    enumLiteral_2=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getMethodAccess().getPUTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMethodAccess().getPUTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalCurlBetterThanHttpie.g:1524:3: (enumLiteral_3= 'DELETE' )
                    {
                    // InternalCurlBetterThanHttpie.g:1524:3: (enumLiteral_3= 'DELETE' )
                    // InternalCurlBetterThanHttpie.g:1525:4: enumLiteral_3= 'DELETE'
                    {
                    enumLiteral_3=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getMethodAccess().getDELETEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getMethodAccess().getDELETEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMethod"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000781FEDFF0010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000006010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004050L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008022L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010002002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000040000000000L});

}