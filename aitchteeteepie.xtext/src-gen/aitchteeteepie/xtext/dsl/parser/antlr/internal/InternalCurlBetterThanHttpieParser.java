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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_HTTP", "RULE_WS", "RULE_ID", "RULE_URL", "RULE_INT", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_NULL", "RULE_NUMBER", "RULE_DIGIT", "RULE_LETTER", "'://'", "':'", "'/'", "'--'", "'--header'", "'-t'", "'--body'", "'-b'", "'--json'", "'-j'", "'--form'", "'-f'", "'--proxy'", "'='", "'@'", "'--auth'", "'-a'", "'--download'", "'-d'", "'--help'", "'-h'", "'--version'", "'--verbose'", "'-v'", "'--timeout'", "'=='", "':='", "'\"'", "'\\''", "'{'", "','", "'}'", "'['", "']'", "'GET'", "'POST'", "'PUT'", "'DELETE'"
    };
    public static final int T__50=50;
    public static final int RULE_BOOLEAN=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int RULE_ID=6;
    public static final int RULE_DIGIT=13;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int RULE_URL=7;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_NULL=11;
    public static final int RULE_HTTP=4;
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
    public static final int RULE_WS=5;
    public static final int RULE_NUMBER=12;
    public static final int RULE_LETTER=14;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_FLOAT=9;
    public static final int T__46=46;
    public static final int T__47=47;
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
    // InternalCurlBetterThanHttpie.g:72:1: ruleCommandLineInterface returns [EObject current=null] : ( () this_HTTP_1= RULE_HTTP (this_WS_2= RULE_WS ( (lv_flags_3_0= ruleFlag ) ) )* (this_WS_4= RULE_WS ( (lv_method_5_0= ruleMethod ) ) )? this_WS_6= RULE_WS ( ( ( (lv_protocol_7_1= RULE_ID | lv_protocol_7_2= RULE_HTTP ) ) ) otherlv_8= '://' )? ( ( ( (lv_url_9_0= RULE_URL ) ) (otherlv_10= ':' ( (lv_port_11_0= RULE_INT ) ) )? ) | (otherlv_12= ':' ( (lv_port_13_0= RULE_INT ) )? ) ) (otherlv_14= '/' ( ( (lv_resource_15_1= RULE_ID | lv_resource_15_2= RULE_HTTP ) ) ) )? (this_WS_16= RULE_WS otherlv_17= '--' )? (this_WS_18= RULE_WS ( (lv_items_19_0= ruleItem ) ) )* ) ;
    public final EObject ruleCommandLineInterface() throws RecognitionException {
        EObject current = null;

        Token this_HTTP_1=null;
        Token this_WS_2=null;
        Token this_WS_4=null;
        Token this_WS_6=null;
        Token lv_protocol_7_1=null;
        Token lv_protocol_7_2=null;
        Token otherlv_8=null;
        Token lv_url_9_0=null;
        Token otherlv_10=null;
        Token lv_port_11_0=null;
        Token otherlv_12=null;
        Token lv_port_13_0=null;
        Token otherlv_14=null;
        Token lv_resource_15_1=null;
        Token lv_resource_15_2=null;
        Token this_WS_16=null;
        Token otherlv_17=null;
        Token this_WS_18=null;
        EObject lv_flags_3_0 = null;

        Enumerator lv_method_5_0 = null;

        EObject lv_items_19_0 = null;



        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:78:2: ( ( () this_HTTP_1= RULE_HTTP (this_WS_2= RULE_WS ( (lv_flags_3_0= ruleFlag ) ) )* (this_WS_4= RULE_WS ( (lv_method_5_0= ruleMethod ) ) )? this_WS_6= RULE_WS ( ( ( (lv_protocol_7_1= RULE_ID | lv_protocol_7_2= RULE_HTTP ) ) ) otherlv_8= '://' )? ( ( ( (lv_url_9_0= RULE_URL ) ) (otherlv_10= ':' ( (lv_port_11_0= RULE_INT ) ) )? ) | (otherlv_12= ':' ( (lv_port_13_0= RULE_INT ) )? ) ) (otherlv_14= '/' ( ( (lv_resource_15_1= RULE_ID | lv_resource_15_2= RULE_HTTP ) ) ) )? (this_WS_16= RULE_WS otherlv_17= '--' )? (this_WS_18= RULE_WS ( (lv_items_19_0= ruleItem ) ) )* ) )
            // InternalCurlBetterThanHttpie.g:79:2: ( () this_HTTP_1= RULE_HTTP (this_WS_2= RULE_WS ( (lv_flags_3_0= ruleFlag ) ) )* (this_WS_4= RULE_WS ( (lv_method_5_0= ruleMethod ) ) )? this_WS_6= RULE_WS ( ( ( (lv_protocol_7_1= RULE_ID | lv_protocol_7_2= RULE_HTTP ) ) ) otherlv_8= '://' )? ( ( ( (lv_url_9_0= RULE_URL ) ) (otherlv_10= ':' ( (lv_port_11_0= RULE_INT ) ) )? ) | (otherlv_12= ':' ( (lv_port_13_0= RULE_INT ) )? ) ) (otherlv_14= '/' ( ( (lv_resource_15_1= RULE_ID | lv_resource_15_2= RULE_HTTP ) ) ) )? (this_WS_16= RULE_WS otherlv_17= '--' )? (this_WS_18= RULE_WS ( (lv_items_19_0= ruleItem ) ) )* )
            {
            // InternalCurlBetterThanHttpie.g:79:2: ( () this_HTTP_1= RULE_HTTP (this_WS_2= RULE_WS ( (lv_flags_3_0= ruleFlag ) ) )* (this_WS_4= RULE_WS ( (lv_method_5_0= ruleMethod ) ) )? this_WS_6= RULE_WS ( ( ( (lv_protocol_7_1= RULE_ID | lv_protocol_7_2= RULE_HTTP ) ) ) otherlv_8= '://' )? ( ( ( (lv_url_9_0= RULE_URL ) ) (otherlv_10= ':' ( (lv_port_11_0= RULE_INT ) ) )? ) | (otherlv_12= ':' ( (lv_port_13_0= RULE_INT ) )? ) ) (otherlv_14= '/' ( ( (lv_resource_15_1= RULE_ID | lv_resource_15_2= RULE_HTTP ) ) ) )? (this_WS_16= RULE_WS otherlv_17= '--' )? (this_WS_18= RULE_WS ( (lv_items_19_0= ruleItem ) ) )* )
            // InternalCurlBetterThanHttpie.g:80:3: () this_HTTP_1= RULE_HTTP (this_WS_2= RULE_WS ( (lv_flags_3_0= ruleFlag ) ) )* (this_WS_4= RULE_WS ( (lv_method_5_0= ruleMethod ) ) )? this_WS_6= RULE_WS ( ( ( (lv_protocol_7_1= RULE_ID | lv_protocol_7_2= RULE_HTTP ) ) ) otherlv_8= '://' )? ( ( ( (lv_url_9_0= RULE_URL ) ) (otherlv_10= ':' ( (lv_port_11_0= RULE_INT ) ) )? ) | (otherlv_12= ':' ( (lv_port_13_0= RULE_INT ) )? ) ) (otherlv_14= '/' ( ( (lv_resource_15_1= RULE_ID | lv_resource_15_2= RULE_HTTP ) ) ) )? (this_WS_16= RULE_WS otherlv_17= '--' )? (this_WS_18= RULE_WS ( (lv_items_19_0= ruleItem ) ) )*
            {
            // InternalCurlBetterThanHttpie.g:80:3: ()
            // InternalCurlBetterThanHttpie.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCommandLineInterfaceAccess().getCommandLineInterfaceAction_0(),
            					current);
            			

            }

            this_HTTP_1=(Token)match(input,RULE_HTTP,FOLLOW_3); 

            			newLeafNode(this_HTTP_1, grammarAccess.getCommandLineInterfaceAccess().getHTTPTerminalRuleCall_1());
            		
            // InternalCurlBetterThanHttpie.g:91:3: (this_WS_2= RULE_WS ( (lv_flags_3_0= ruleFlag ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_WS) ) {
                    int LA1_1 = input.LA(2);

                    if ( ((LA1_1>=19 && LA1_1<=27)||(LA1_1>=30 && LA1_1<=39)) ) {
                        alt1=1;
                    }


                }


                switch (alt1) {
            	case 1 :
            	    // InternalCurlBetterThanHttpie.g:92:4: this_WS_2= RULE_WS ( (lv_flags_3_0= ruleFlag ) )
            	    {
            	    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_4); 

            	    				newLeafNode(this_WS_2, grammarAccess.getCommandLineInterfaceAccess().getWSTerminalRuleCall_2_0());
            	    			
            	    // InternalCurlBetterThanHttpie.g:96:4: ( (lv_flags_3_0= ruleFlag ) )
            	    // InternalCurlBetterThanHttpie.g:97:5: (lv_flags_3_0= ruleFlag )
            	    {
            	    // InternalCurlBetterThanHttpie.g:97:5: (lv_flags_3_0= ruleFlag )
            	    // InternalCurlBetterThanHttpie.g:98:6: lv_flags_3_0= ruleFlag
            	    {

            	    						newCompositeNode(grammarAccess.getCommandLineInterfaceAccess().getFlagsFlagParserRuleCall_2_1_0());
            	    					
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


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalCurlBetterThanHttpie.g:116:3: (this_WS_4= RULE_WS ( (lv_method_5_0= ruleMethod ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_WS) ) {
                int LA2_1 = input.LA(2);

                if ( ((LA2_1>=49 && LA2_1<=52)) ) {
                    alt2=1;
                }
            }
            switch (alt2) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:117:4: this_WS_4= RULE_WS ( (lv_method_5_0= ruleMethod ) )
                    {
                    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_5); 

                    				newLeafNode(this_WS_4, grammarAccess.getCommandLineInterfaceAccess().getWSTerminalRuleCall_3_0());
                    			
                    // InternalCurlBetterThanHttpie.g:121:4: ( (lv_method_5_0= ruleMethod ) )
                    // InternalCurlBetterThanHttpie.g:122:5: (lv_method_5_0= ruleMethod )
                    {
                    // InternalCurlBetterThanHttpie.g:122:5: (lv_method_5_0= ruleMethod )
                    // InternalCurlBetterThanHttpie.g:123:6: lv_method_5_0= ruleMethod
                    {

                    						newCompositeNode(grammarAccess.getCommandLineInterfaceAccess().getMethodMethodEnumRuleCall_3_1_0());
                    					
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


                    }
                    break;

            }

            this_WS_6=(Token)match(input,RULE_WS,FOLLOW_6); 

            			newLeafNode(this_WS_6, grammarAccess.getCommandLineInterfaceAccess().getWSTerminalRuleCall_4());
            		
            // InternalCurlBetterThanHttpie.g:145:3: ( ( ( (lv_protocol_7_1= RULE_ID | lv_protocol_7_2= RULE_HTTP ) ) ) otherlv_8= '://' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_HTTP||LA4_0==RULE_ID) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:146:4: ( ( (lv_protocol_7_1= RULE_ID | lv_protocol_7_2= RULE_HTTP ) ) ) otherlv_8= '://'
                    {
                    // InternalCurlBetterThanHttpie.g:146:4: ( ( (lv_protocol_7_1= RULE_ID | lv_protocol_7_2= RULE_HTTP ) ) )
                    // InternalCurlBetterThanHttpie.g:147:5: ( (lv_protocol_7_1= RULE_ID | lv_protocol_7_2= RULE_HTTP ) )
                    {
                    // InternalCurlBetterThanHttpie.g:147:5: ( (lv_protocol_7_1= RULE_ID | lv_protocol_7_2= RULE_HTTP ) )
                    // InternalCurlBetterThanHttpie.g:148:6: (lv_protocol_7_1= RULE_ID | lv_protocol_7_2= RULE_HTTP )
                    {
                    // InternalCurlBetterThanHttpie.g:148:6: (lv_protocol_7_1= RULE_ID | lv_protocol_7_2= RULE_HTTP )
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==RULE_ID) ) {
                        alt3=1;
                    }
                    else if ( (LA3_0==RULE_HTTP) ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 0, input);

                        throw nvae;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalCurlBetterThanHttpie.g:149:7: lv_protocol_7_1= RULE_ID
                            {
                            lv_protocol_7_1=(Token)match(input,RULE_ID,FOLLOW_7); 

                            							newLeafNode(lv_protocol_7_1, grammarAccess.getCommandLineInterfaceAccess().getProtocolIDTerminalRuleCall_5_0_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getCommandLineInterfaceRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"protocol",
                            								lv_protocol_7_1,
                            								"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.ID");
                            						

                            }
                            break;
                        case 2 :
                            // InternalCurlBetterThanHttpie.g:164:7: lv_protocol_7_2= RULE_HTTP
                            {
                            lv_protocol_7_2=(Token)match(input,RULE_HTTP,FOLLOW_7); 

                            							newLeafNode(lv_protocol_7_2, grammarAccess.getCommandLineInterfaceAccess().getProtocolHTTPTerminalRuleCall_5_0_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getCommandLineInterfaceRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"protocol",
                            								lv_protocol_7_2,
                            								"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.HTTP");
                            						

                            }
                            break;

                    }


                    }


                    }

                    otherlv_8=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_8, grammarAccess.getCommandLineInterfaceAccess().getColonSolidusSolidusKeyword_5_1());
                    			

                    }
                    break;

            }

            // InternalCurlBetterThanHttpie.g:186:3: ( ( ( (lv_url_9_0= RULE_URL ) ) (otherlv_10= ':' ( (lv_port_11_0= RULE_INT ) ) )? ) | (otherlv_12= ':' ( (lv_port_13_0= RULE_INT ) )? ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_URL) ) {
                alt7=1;
            }
            else if ( (LA7_0==16) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:187:4: ( ( (lv_url_9_0= RULE_URL ) ) (otherlv_10= ':' ( (lv_port_11_0= RULE_INT ) ) )? )
                    {
                    // InternalCurlBetterThanHttpie.g:187:4: ( ( (lv_url_9_0= RULE_URL ) ) (otherlv_10= ':' ( (lv_port_11_0= RULE_INT ) ) )? )
                    // InternalCurlBetterThanHttpie.g:188:5: ( (lv_url_9_0= RULE_URL ) ) (otherlv_10= ':' ( (lv_port_11_0= RULE_INT ) ) )?
                    {
                    // InternalCurlBetterThanHttpie.g:188:5: ( (lv_url_9_0= RULE_URL ) )
                    // InternalCurlBetterThanHttpie.g:189:6: (lv_url_9_0= RULE_URL )
                    {
                    // InternalCurlBetterThanHttpie.g:189:6: (lv_url_9_0= RULE_URL )
                    // InternalCurlBetterThanHttpie.g:190:7: lv_url_9_0= RULE_URL
                    {
                    lv_url_9_0=(Token)match(input,RULE_URL,FOLLOW_9); 

                    							newLeafNode(lv_url_9_0, grammarAccess.getCommandLineInterfaceAccess().getUrlURLTerminalRuleCall_6_0_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getCommandLineInterfaceRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"url",
                    								lv_url_9_0,
                    								"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.URL");
                    						

                    }


                    }

                    // InternalCurlBetterThanHttpie.g:206:5: (otherlv_10= ':' ( (lv_port_11_0= RULE_INT ) ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==16) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalCurlBetterThanHttpie.g:207:6: otherlv_10= ':' ( (lv_port_11_0= RULE_INT ) )
                            {
                            otherlv_10=(Token)match(input,16,FOLLOW_10); 

                            						newLeafNode(otherlv_10, grammarAccess.getCommandLineInterfaceAccess().getColonKeyword_6_0_1_0());
                            					
                            // InternalCurlBetterThanHttpie.g:211:6: ( (lv_port_11_0= RULE_INT ) )
                            // InternalCurlBetterThanHttpie.g:212:7: (lv_port_11_0= RULE_INT )
                            {
                            // InternalCurlBetterThanHttpie.g:212:7: (lv_port_11_0= RULE_INT )
                            // InternalCurlBetterThanHttpie.g:213:8: lv_port_11_0= RULE_INT
                            {
                            lv_port_11_0=(Token)match(input,RULE_INT,FOLLOW_11); 

                            								newLeafNode(lv_port_11_0, grammarAccess.getCommandLineInterfaceAccess().getPortINTTerminalRuleCall_6_0_1_1_0());
                            							

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
                    // InternalCurlBetterThanHttpie.g:232:4: (otherlv_12= ':' ( (lv_port_13_0= RULE_INT ) )? )
                    {
                    // InternalCurlBetterThanHttpie.g:232:4: (otherlv_12= ':' ( (lv_port_13_0= RULE_INT ) )? )
                    // InternalCurlBetterThanHttpie.g:233:5: otherlv_12= ':' ( (lv_port_13_0= RULE_INT ) )?
                    {
                    otherlv_12=(Token)match(input,16,FOLLOW_12); 

                    					newLeafNode(otherlv_12, grammarAccess.getCommandLineInterfaceAccess().getColonKeyword_6_1_0());
                    				
                    // InternalCurlBetterThanHttpie.g:237:5: ( (lv_port_13_0= RULE_INT ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==RULE_INT) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalCurlBetterThanHttpie.g:238:6: (lv_port_13_0= RULE_INT )
                            {
                            // InternalCurlBetterThanHttpie.g:238:6: (lv_port_13_0= RULE_INT )
                            // InternalCurlBetterThanHttpie.g:239:7: lv_port_13_0= RULE_INT
                            {
                            lv_port_13_0=(Token)match(input,RULE_INT,FOLLOW_11); 

                            							newLeafNode(lv_port_13_0, grammarAccess.getCommandLineInterfaceAccess().getPortINTTerminalRuleCall_6_1_1_0());
                            						

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

            // InternalCurlBetterThanHttpie.g:257:3: (otherlv_14= '/' ( ( (lv_resource_15_1= RULE_ID | lv_resource_15_2= RULE_HTTP ) ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:258:4: otherlv_14= '/' ( ( (lv_resource_15_1= RULE_ID | lv_resource_15_2= RULE_HTTP ) ) )
                    {
                    otherlv_14=(Token)match(input,17,FOLLOW_13); 

                    				newLeafNode(otherlv_14, grammarAccess.getCommandLineInterfaceAccess().getSolidusKeyword_7_0());
                    			
                    // InternalCurlBetterThanHttpie.g:262:4: ( ( (lv_resource_15_1= RULE_ID | lv_resource_15_2= RULE_HTTP ) ) )
                    // InternalCurlBetterThanHttpie.g:263:5: ( (lv_resource_15_1= RULE_ID | lv_resource_15_2= RULE_HTTP ) )
                    {
                    // InternalCurlBetterThanHttpie.g:263:5: ( (lv_resource_15_1= RULE_ID | lv_resource_15_2= RULE_HTTP ) )
                    // InternalCurlBetterThanHttpie.g:264:6: (lv_resource_15_1= RULE_ID | lv_resource_15_2= RULE_HTTP )
                    {
                    // InternalCurlBetterThanHttpie.g:264:6: (lv_resource_15_1= RULE_ID | lv_resource_15_2= RULE_HTTP )
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==RULE_ID) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==RULE_HTTP) ) {
                        alt8=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalCurlBetterThanHttpie.g:265:7: lv_resource_15_1= RULE_ID
                            {
                            lv_resource_15_1=(Token)match(input,RULE_ID,FOLLOW_14); 

                            							newLeafNode(lv_resource_15_1, grammarAccess.getCommandLineInterfaceAccess().getResourceIDTerminalRuleCall_7_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getCommandLineInterfaceRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"resource",
                            								lv_resource_15_1,
                            								"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.ID");
                            						

                            }
                            break;
                        case 2 :
                            // InternalCurlBetterThanHttpie.g:280:7: lv_resource_15_2= RULE_HTTP
                            {
                            lv_resource_15_2=(Token)match(input,RULE_HTTP,FOLLOW_14); 

                            							newLeafNode(lv_resource_15_2, grammarAccess.getCommandLineInterfaceAccess().getResourceHTTPTerminalRuleCall_7_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getCommandLineInterfaceRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"resource",
                            								lv_resource_15_2,
                            								"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.HTTP");
                            						

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalCurlBetterThanHttpie.g:298:3: (this_WS_16= RULE_WS otherlv_17= '--' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_WS) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==18) ) {
                    alt10=1;
                }
            }
            switch (alt10) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:299:4: this_WS_16= RULE_WS otherlv_17= '--'
                    {
                    this_WS_16=(Token)match(input,RULE_WS,FOLLOW_15); 

                    				newLeafNode(this_WS_16, grammarAccess.getCommandLineInterfaceAccess().getWSTerminalRuleCall_8_0());
                    			
                    otherlv_17=(Token)match(input,18,FOLLOW_14); 

                    				newLeafNode(otherlv_17, grammarAccess.getCommandLineInterfaceAccess().getHyphenMinusHyphenMinusKeyword_8_1());
                    			

                    }
                    break;

            }

            // InternalCurlBetterThanHttpie.g:308:3: (this_WS_18= RULE_WS ( (lv_items_19_0= ruleItem ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_WS) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalCurlBetterThanHttpie.g:309:4: this_WS_18= RULE_WS ( (lv_items_19_0= ruleItem ) )
            	    {
            	    this_WS_18=(Token)match(input,RULE_WS,FOLLOW_13); 

            	    				newLeafNode(this_WS_18, grammarAccess.getCommandLineInterfaceAccess().getWSTerminalRuleCall_9_0());
            	    			
            	    // InternalCurlBetterThanHttpie.g:313:4: ( (lv_items_19_0= ruleItem ) )
            	    // InternalCurlBetterThanHttpie.g:314:5: (lv_items_19_0= ruleItem )
            	    {
            	    // InternalCurlBetterThanHttpie.g:314:5: (lv_items_19_0= ruleItem )
            	    // InternalCurlBetterThanHttpie.g:315:6: lv_items_19_0= ruleItem
            	    {

            	    						newCompositeNode(grammarAccess.getCommandLineInterfaceAccess().getItemsItemParserRuleCall_9_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
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


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalCurlBetterThanHttpie.g:337:1: entryRuleFlag returns [EObject current=null] : iv_ruleFlag= ruleFlag EOF ;
    public final EObject entryRuleFlag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlag = null;


        try {
            // InternalCurlBetterThanHttpie.g:337:45: (iv_ruleFlag= ruleFlag EOF )
            // InternalCurlBetterThanHttpie.g:338:2: iv_ruleFlag= ruleFlag EOF
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
    // InternalCurlBetterThanHttpie.g:344:1: ruleFlag returns [EObject current=null] : (this_ProxyFlag_0= ruleProxyFlag | this_FormFlag_1= ruleFormFlag | this_AuthFlag_2= ruleAuthFlag | this_DownloadFlag_3= ruleDownloadFlag | this_BodyFlag_4= ruleBodyFlag | this_VersionFlag_5= ruleVersionFlag | this_JsonFlag_6= ruleJsonFlag | this_HelpFlag_7= ruleHelpFlag | this_HeadersFlag_8= ruleHeadersFlag | this_VerboseFlag_9= ruleVerboseFlag | this_TimeoutFlag_10= ruleTimeoutFlag ) ;
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
            // InternalCurlBetterThanHttpie.g:350:2: ( (this_ProxyFlag_0= ruleProxyFlag | this_FormFlag_1= ruleFormFlag | this_AuthFlag_2= ruleAuthFlag | this_DownloadFlag_3= ruleDownloadFlag | this_BodyFlag_4= ruleBodyFlag | this_VersionFlag_5= ruleVersionFlag | this_JsonFlag_6= ruleJsonFlag | this_HelpFlag_7= ruleHelpFlag | this_HeadersFlag_8= ruleHeadersFlag | this_VerboseFlag_9= ruleVerboseFlag | this_TimeoutFlag_10= ruleTimeoutFlag ) )
            // InternalCurlBetterThanHttpie.g:351:2: (this_ProxyFlag_0= ruleProxyFlag | this_FormFlag_1= ruleFormFlag | this_AuthFlag_2= ruleAuthFlag | this_DownloadFlag_3= ruleDownloadFlag | this_BodyFlag_4= ruleBodyFlag | this_VersionFlag_5= ruleVersionFlag | this_JsonFlag_6= ruleJsonFlag | this_HelpFlag_7= ruleHelpFlag | this_HeadersFlag_8= ruleHeadersFlag | this_VerboseFlag_9= ruleVerboseFlag | this_TimeoutFlag_10= ruleTimeoutFlag )
            {
            // InternalCurlBetterThanHttpie.g:351:2: (this_ProxyFlag_0= ruleProxyFlag | this_FormFlag_1= ruleFormFlag | this_AuthFlag_2= ruleAuthFlag | this_DownloadFlag_3= ruleDownloadFlag | this_BodyFlag_4= ruleBodyFlag | this_VersionFlag_5= ruleVersionFlag | this_JsonFlag_6= ruleJsonFlag | this_HelpFlag_7= ruleHelpFlag | this_HeadersFlag_8= ruleHeadersFlag | this_VerboseFlag_9= ruleVerboseFlag | this_TimeoutFlag_10= ruleTimeoutFlag )
            int alt12=11;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt12=1;
                }
                break;
            case 25:
            case 26:
                {
                alt12=2;
                }
                break;
            case 30:
            case 31:
                {
                alt12=3;
                }
                break;
            case 32:
            case 33:
                {
                alt12=4;
                }
                break;
            case 21:
            case 22:
                {
                alt12=5;
                }
                break;
            case 36:
                {
                alt12=6;
                }
                break;
            case 23:
            case 24:
                {
                alt12=7;
                }
                break;
            case 34:
            case 35:
                {
                alt12=8;
                }
                break;
            case 19:
            case 20:
                {
                alt12=9;
                }
                break;
            case 37:
            case 38:
                {
                alt12=10;
                }
                break;
            case 39:
                {
                alt12=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:352:3: this_ProxyFlag_0= ruleProxyFlag
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
                    // InternalCurlBetterThanHttpie.g:361:3: this_FormFlag_1= ruleFormFlag
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
                    // InternalCurlBetterThanHttpie.g:370:3: this_AuthFlag_2= ruleAuthFlag
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
                    // InternalCurlBetterThanHttpie.g:379:3: this_DownloadFlag_3= ruleDownloadFlag
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
                    // InternalCurlBetterThanHttpie.g:388:3: this_BodyFlag_4= ruleBodyFlag
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
                    // InternalCurlBetterThanHttpie.g:397:3: this_VersionFlag_5= ruleVersionFlag
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
                    // InternalCurlBetterThanHttpie.g:406:3: this_JsonFlag_6= ruleJsonFlag
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
                    // InternalCurlBetterThanHttpie.g:415:3: this_HelpFlag_7= ruleHelpFlag
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
                    // InternalCurlBetterThanHttpie.g:424:3: this_HeadersFlag_8= ruleHeadersFlag
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
                    // InternalCurlBetterThanHttpie.g:433:3: this_VerboseFlag_9= ruleVerboseFlag
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
                    // InternalCurlBetterThanHttpie.g:442:3: this_TimeoutFlag_10= ruleTimeoutFlag
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
    // InternalCurlBetterThanHttpie.g:454:1: entryRuleHeadersFlag returns [EObject current=null] : iv_ruleHeadersFlag= ruleHeadersFlag EOF ;
    public final EObject entryRuleHeadersFlag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeadersFlag = null;


        try {
            // InternalCurlBetterThanHttpie.g:454:52: (iv_ruleHeadersFlag= ruleHeadersFlag EOF )
            // InternalCurlBetterThanHttpie.g:455:2: iv_ruleHeadersFlag= ruleHeadersFlag EOF
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
    // InternalCurlBetterThanHttpie.g:461:1: ruleHeadersFlag returns [EObject current=null] : ( () (otherlv_1= '--header' | otherlv_2= '-t' ) ) ;
    public final EObject ruleHeadersFlag() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:467:2: ( ( () (otherlv_1= '--header' | otherlv_2= '-t' ) ) )
            // InternalCurlBetterThanHttpie.g:468:2: ( () (otherlv_1= '--header' | otherlv_2= '-t' ) )
            {
            // InternalCurlBetterThanHttpie.g:468:2: ( () (otherlv_1= '--header' | otherlv_2= '-t' ) )
            // InternalCurlBetterThanHttpie.g:469:3: () (otherlv_1= '--header' | otherlv_2= '-t' )
            {
            // InternalCurlBetterThanHttpie.g:469:3: ()
            // InternalCurlBetterThanHttpie.g:470:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHeadersFlagAccess().getHeadersFlagAction_0(),
            					current);
            			

            }

            // InternalCurlBetterThanHttpie.g:476:3: (otherlv_1= '--header' | otherlv_2= '-t' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==19) ) {
                alt13=1;
            }
            else if ( (LA13_0==20) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:477:4: otherlv_1= '--header'
                    {
                    otherlv_1=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getHeadersFlagAccess().getHeaderKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:482:4: otherlv_2= '-t'
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_2); 

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
    // InternalCurlBetterThanHttpie.g:491:1: entryRuleBodyFlag returns [EObject current=null] : iv_ruleBodyFlag= ruleBodyFlag EOF ;
    public final EObject entryRuleBodyFlag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyFlag = null;


        try {
            // InternalCurlBetterThanHttpie.g:491:49: (iv_ruleBodyFlag= ruleBodyFlag EOF )
            // InternalCurlBetterThanHttpie.g:492:2: iv_ruleBodyFlag= ruleBodyFlag EOF
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
    // InternalCurlBetterThanHttpie.g:498:1: ruleBodyFlag returns [EObject current=null] : ( () (otherlv_1= '--body' | otherlv_2= '-b' ) ) ;
    public final EObject ruleBodyFlag() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:504:2: ( ( () (otherlv_1= '--body' | otherlv_2= '-b' ) ) )
            // InternalCurlBetterThanHttpie.g:505:2: ( () (otherlv_1= '--body' | otherlv_2= '-b' ) )
            {
            // InternalCurlBetterThanHttpie.g:505:2: ( () (otherlv_1= '--body' | otherlv_2= '-b' ) )
            // InternalCurlBetterThanHttpie.g:506:3: () (otherlv_1= '--body' | otherlv_2= '-b' )
            {
            // InternalCurlBetterThanHttpie.g:506:3: ()
            // InternalCurlBetterThanHttpie.g:507:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBodyFlagAccess().getBodyFlagAction_0(),
            					current);
            			

            }

            // InternalCurlBetterThanHttpie.g:513:3: (otherlv_1= '--body' | otherlv_2= '-b' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                alt14=1;
            }
            else if ( (LA14_0==22) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:514:4: otherlv_1= '--body'
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getBodyFlagAccess().getBodyKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:519:4: otherlv_2= '-b'
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_2); 

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
    // InternalCurlBetterThanHttpie.g:528:1: entryRuleJsonFlag returns [EObject current=null] : iv_ruleJsonFlag= ruleJsonFlag EOF ;
    public final EObject entryRuleJsonFlag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonFlag = null;


        try {
            // InternalCurlBetterThanHttpie.g:528:49: (iv_ruleJsonFlag= ruleJsonFlag EOF )
            // InternalCurlBetterThanHttpie.g:529:2: iv_ruleJsonFlag= ruleJsonFlag EOF
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
    // InternalCurlBetterThanHttpie.g:535:1: ruleJsonFlag returns [EObject current=null] : ( () (otherlv_1= '--json' | otherlv_2= '-j' ) ) ;
    public final EObject ruleJsonFlag() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:541:2: ( ( () (otherlv_1= '--json' | otherlv_2= '-j' ) ) )
            // InternalCurlBetterThanHttpie.g:542:2: ( () (otherlv_1= '--json' | otherlv_2= '-j' ) )
            {
            // InternalCurlBetterThanHttpie.g:542:2: ( () (otherlv_1= '--json' | otherlv_2= '-j' ) )
            // InternalCurlBetterThanHttpie.g:543:3: () (otherlv_1= '--json' | otherlv_2= '-j' )
            {
            // InternalCurlBetterThanHttpie.g:543:3: ()
            // InternalCurlBetterThanHttpie.g:544:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getJsonFlagAccess().getJsonFlagAction_0(),
            					current);
            			

            }

            // InternalCurlBetterThanHttpie.g:550:3: (otherlv_1= '--json' | otherlv_2= '-j' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==23) ) {
                alt15=1;
            }
            else if ( (LA15_0==24) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:551:4: otherlv_1= '--json'
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getJsonFlagAccess().getJsonKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:556:4: otherlv_2= '-j'
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_2); 

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
    // InternalCurlBetterThanHttpie.g:565:1: entryRuleFormFlag returns [EObject current=null] : iv_ruleFormFlag= ruleFormFlag EOF ;
    public final EObject entryRuleFormFlag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormFlag = null;


        try {
            // InternalCurlBetterThanHttpie.g:565:49: (iv_ruleFormFlag= ruleFormFlag EOF )
            // InternalCurlBetterThanHttpie.g:566:2: iv_ruleFormFlag= ruleFormFlag EOF
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
    // InternalCurlBetterThanHttpie.g:572:1: ruleFormFlag returns [EObject current=null] : ( () (otherlv_1= '--form' | otherlv_2= '-f' ) ) ;
    public final EObject ruleFormFlag() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:578:2: ( ( () (otherlv_1= '--form' | otherlv_2= '-f' ) ) )
            // InternalCurlBetterThanHttpie.g:579:2: ( () (otherlv_1= '--form' | otherlv_2= '-f' ) )
            {
            // InternalCurlBetterThanHttpie.g:579:2: ( () (otherlv_1= '--form' | otherlv_2= '-f' ) )
            // InternalCurlBetterThanHttpie.g:580:3: () (otherlv_1= '--form' | otherlv_2= '-f' )
            {
            // InternalCurlBetterThanHttpie.g:580:3: ()
            // InternalCurlBetterThanHttpie.g:581:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFormFlagAccess().getFormFlagAction_0(),
            					current);
            			

            }

            // InternalCurlBetterThanHttpie.g:587:3: (otherlv_1= '--form' | otherlv_2= '-f' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            else if ( (LA16_0==26) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:588:4: otherlv_1= '--form'
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getFormFlagAccess().getFormKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:593:4: otherlv_2= '-f'
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_2); 

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
    // InternalCurlBetterThanHttpie.g:602:1: entryRuleProxyFlag returns [EObject current=null] : iv_ruleProxyFlag= ruleProxyFlag EOF ;
    public final EObject entryRuleProxyFlag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProxyFlag = null;


        try {
            // InternalCurlBetterThanHttpie.g:602:50: (iv_ruleProxyFlag= ruleProxyFlag EOF )
            // InternalCurlBetterThanHttpie.g:603:2: iv_ruleProxyFlag= ruleProxyFlag EOF
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
    // InternalCurlBetterThanHttpie.g:609:1: ruleProxyFlag returns [EObject current=null] : (otherlv_0= '--proxy' (otherlv_1= '=' | this_WS_2= RULE_WS ) ( ( ( ( (lv_protocol_3_1= RULE_ID | lv_protocol_3_2= RULE_HTTP ) ) ) otherlv_4= ':' ) | ( ( ( (lv_proxyProtocol_5_1= RULE_ID | lv_proxyProtocol_5_2= RULE_HTTP ) ) ) otherlv_6= '://' ) | ( ( ( (lv_protocol_7_1= RULE_ID | lv_protocol_7_2= RULE_HTTP ) ) ) otherlv_8= ':' ( ( (lv_proxyProtocol_9_1= RULE_ID | lv_proxyProtocol_9_2= RULE_HTTP ) ) ) otherlv_10= '://' ) ) ( ( ( (lv_username_11_1= RULE_ID | lv_username_11_2= RULE_HTTP ) ) ) otherlv_12= ':' ( ( (lv_password_13_1= RULE_ID | lv_password_13_2= RULE_HTTP ) ) ) otherlv_14= '@' )? ( ( ( (lv_hostname_15_0= RULE_URL ) ) (otherlv_16= ':' ( (lv_port_17_0= RULE_INT ) ) )? ) | (otherlv_18= ':' ( (lv_port_19_0= RULE_INT ) )? ) ) ) ;
    public final EObject ruleProxyFlag() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_WS_2=null;
        Token lv_protocol_3_1=null;
        Token lv_protocol_3_2=null;
        Token otherlv_4=null;
        Token lv_proxyProtocol_5_1=null;
        Token lv_proxyProtocol_5_2=null;
        Token otherlv_6=null;
        Token lv_protocol_7_1=null;
        Token lv_protocol_7_2=null;
        Token otherlv_8=null;
        Token lv_proxyProtocol_9_1=null;
        Token lv_proxyProtocol_9_2=null;
        Token otherlv_10=null;
        Token lv_username_11_1=null;
        Token lv_username_11_2=null;
        Token otherlv_12=null;
        Token lv_password_13_1=null;
        Token lv_password_13_2=null;
        Token otherlv_14=null;
        Token lv_hostname_15_0=null;
        Token otherlv_16=null;
        Token lv_port_17_0=null;
        Token otherlv_18=null;
        Token lv_port_19_0=null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:615:2: ( (otherlv_0= '--proxy' (otherlv_1= '=' | this_WS_2= RULE_WS ) ( ( ( ( (lv_protocol_3_1= RULE_ID | lv_protocol_3_2= RULE_HTTP ) ) ) otherlv_4= ':' ) | ( ( ( (lv_proxyProtocol_5_1= RULE_ID | lv_proxyProtocol_5_2= RULE_HTTP ) ) ) otherlv_6= '://' ) | ( ( ( (lv_protocol_7_1= RULE_ID | lv_protocol_7_2= RULE_HTTP ) ) ) otherlv_8= ':' ( ( (lv_proxyProtocol_9_1= RULE_ID | lv_proxyProtocol_9_2= RULE_HTTP ) ) ) otherlv_10= '://' ) ) ( ( ( (lv_username_11_1= RULE_ID | lv_username_11_2= RULE_HTTP ) ) ) otherlv_12= ':' ( ( (lv_password_13_1= RULE_ID | lv_password_13_2= RULE_HTTP ) ) ) otherlv_14= '@' )? ( ( ( (lv_hostname_15_0= RULE_URL ) ) (otherlv_16= ':' ( (lv_port_17_0= RULE_INT ) ) )? ) | (otherlv_18= ':' ( (lv_port_19_0= RULE_INT ) )? ) ) ) )
            // InternalCurlBetterThanHttpie.g:616:2: (otherlv_0= '--proxy' (otherlv_1= '=' | this_WS_2= RULE_WS ) ( ( ( ( (lv_protocol_3_1= RULE_ID | lv_protocol_3_2= RULE_HTTP ) ) ) otherlv_4= ':' ) | ( ( ( (lv_proxyProtocol_5_1= RULE_ID | lv_proxyProtocol_5_2= RULE_HTTP ) ) ) otherlv_6= '://' ) | ( ( ( (lv_protocol_7_1= RULE_ID | lv_protocol_7_2= RULE_HTTP ) ) ) otherlv_8= ':' ( ( (lv_proxyProtocol_9_1= RULE_ID | lv_proxyProtocol_9_2= RULE_HTTP ) ) ) otherlv_10= '://' ) ) ( ( ( (lv_username_11_1= RULE_ID | lv_username_11_2= RULE_HTTP ) ) ) otherlv_12= ':' ( ( (lv_password_13_1= RULE_ID | lv_password_13_2= RULE_HTTP ) ) ) otherlv_14= '@' )? ( ( ( (lv_hostname_15_0= RULE_URL ) ) (otherlv_16= ':' ( (lv_port_17_0= RULE_INT ) ) )? ) | (otherlv_18= ':' ( (lv_port_19_0= RULE_INT ) )? ) ) )
            {
            // InternalCurlBetterThanHttpie.g:616:2: (otherlv_0= '--proxy' (otherlv_1= '=' | this_WS_2= RULE_WS ) ( ( ( ( (lv_protocol_3_1= RULE_ID | lv_protocol_3_2= RULE_HTTP ) ) ) otherlv_4= ':' ) | ( ( ( (lv_proxyProtocol_5_1= RULE_ID | lv_proxyProtocol_5_2= RULE_HTTP ) ) ) otherlv_6= '://' ) | ( ( ( (lv_protocol_7_1= RULE_ID | lv_protocol_7_2= RULE_HTTP ) ) ) otherlv_8= ':' ( ( (lv_proxyProtocol_9_1= RULE_ID | lv_proxyProtocol_9_2= RULE_HTTP ) ) ) otherlv_10= '://' ) ) ( ( ( (lv_username_11_1= RULE_ID | lv_username_11_2= RULE_HTTP ) ) ) otherlv_12= ':' ( ( (lv_password_13_1= RULE_ID | lv_password_13_2= RULE_HTTP ) ) ) otherlv_14= '@' )? ( ( ( (lv_hostname_15_0= RULE_URL ) ) (otherlv_16= ':' ( (lv_port_17_0= RULE_INT ) ) )? ) | (otherlv_18= ':' ( (lv_port_19_0= RULE_INT ) )? ) ) )
            // InternalCurlBetterThanHttpie.g:617:3: otherlv_0= '--proxy' (otherlv_1= '=' | this_WS_2= RULE_WS ) ( ( ( ( (lv_protocol_3_1= RULE_ID | lv_protocol_3_2= RULE_HTTP ) ) ) otherlv_4= ':' ) | ( ( ( (lv_proxyProtocol_5_1= RULE_ID | lv_proxyProtocol_5_2= RULE_HTTP ) ) ) otherlv_6= '://' ) | ( ( ( (lv_protocol_7_1= RULE_ID | lv_protocol_7_2= RULE_HTTP ) ) ) otherlv_8= ':' ( ( (lv_proxyProtocol_9_1= RULE_ID | lv_proxyProtocol_9_2= RULE_HTTP ) ) ) otherlv_10= '://' ) ) ( ( ( (lv_username_11_1= RULE_ID | lv_username_11_2= RULE_HTTP ) ) ) otherlv_12= ':' ( ( (lv_password_13_1= RULE_ID | lv_password_13_2= RULE_HTTP ) ) ) otherlv_14= '@' )? ( ( ( (lv_hostname_15_0= RULE_URL ) ) (otherlv_16= ':' ( (lv_port_17_0= RULE_INT ) ) )? ) | (otherlv_18= ':' ( (lv_port_19_0= RULE_INT ) )? ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getProxyFlagAccess().getProxyKeyword_0());
            		
            // InternalCurlBetterThanHttpie.g:621:3: (otherlv_1= '=' | this_WS_2= RULE_WS )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_WS) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:622:4: otherlv_1= '='
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getProxyFlagAccess().getEqualsSignKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:627:4: this_WS_2= RULE_WS
                    {
                    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_13); 

                    				newLeafNode(this_WS_2, grammarAccess.getProxyFlagAccess().getWSTerminalRuleCall_1_1());
                    			

                    }
                    break;

            }

            // InternalCurlBetterThanHttpie.g:632:3: ( ( ( ( (lv_protocol_3_1= RULE_ID | lv_protocol_3_2= RULE_HTTP ) ) ) otherlv_4= ':' ) | ( ( ( (lv_proxyProtocol_5_1= RULE_ID | lv_proxyProtocol_5_2= RULE_HTTP ) ) ) otherlv_6= '://' ) | ( ( ( (lv_protocol_7_1= RULE_ID | lv_protocol_7_2= RULE_HTTP ) ) ) otherlv_8= ':' ( ( (lv_proxyProtocol_9_1= RULE_ID | lv_proxyProtocol_9_2= RULE_HTTP ) ) ) otherlv_10= '://' ) )
            int alt22=3;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==16) ) {
                    switch ( input.LA(3) ) {
                    case RULE_ID:
                        {
                        int LA22_5 = input.LA(4);

                        if ( (LA22_5==15) ) {
                            alt22=3;
                        }
                        else if ( (LA22_5==16) ) {
                            alt22=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 22, 5, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_HTTP:
                        {
                        int LA22_6 = input.LA(4);

                        if ( (LA22_6==16) ) {
                            alt22=1;
                        }
                        else if ( (LA22_6==15) ) {
                            alt22=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 22, 6, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_URL:
                    case 16:
                        {
                        alt22=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 3, input);

                        throw nvae;
                    }

                }
                else if ( (LA22_1==15) ) {
                    alt22=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA22_0==RULE_HTTP) ) {
                int LA22_2 = input.LA(2);

                if ( (LA22_2==15) ) {
                    alt22=2;
                }
                else if ( (LA22_2==16) ) {
                    switch ( input.LA(3) ) {
                    case RULE_ID:
                        {
                        int LA22_5 = input.LA(4);

                        if ( (LA22_5==15) ) {
                            alt22=3;
                        }
                        else if ( (LA22_5==16) ) {
                            alt22=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 22, 5, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_HTTP:
                        {
                        int LA22_6 = input.LA(4);

                        if ( (LA22_6==16) ) {
                            alt22=1;
                        }
                        else if ( (LA22_6==15) ) {
                            alt22=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 22, 6, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_URL:
                    case 16:
                        {
                        alt22=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 3, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:633:4: ( ( ( (lv_protocol_3_1= RULE_ID | lv_protocol_3_2= RULE_HTTP ) ) ) otherlv_4= ':' )
                    {
                    // InternalCurlBetterThanHttpie.g:633:4: ( ( ( (lv_protocol_3_1= RULE_ID | lv_protocol_3_2= RULE_HTTP ) ) ) otherlv_4= ':' )
                    // InternalCurlBetterThanHttpie.g:634:5: ( ( (lv_protocol_3_1= RULE_ID | lv_protocol_3_2= RULE_HTTP ) ) ) otherlv_4= ':'
                    {
                    // InternalCurlBetterThanHttpie.g:634:5: ( ( (lv_protocol_3_1= RULE_ID | lv_protocol_3_2= RULE_HTTP ) ) )
                    // InternalCurlBetterThanHttpie.g:635:6: ( (lv_protocol_3_1= RULE_ID | lv_protocol_3_2= RULE_HTTP ) )
                    {
                    // InternalCurlBetterThanHttpie.g:635:6: ( (lv_protocol_3_1= RULE_ID | lv_protocol_3_2= RULE_HTTP ) )
                    // InternalCurlBetterThanHttpie.g:636:7: (lv_protocol_3_1= RULE_ID | lv_protocol_3_2= RULE_HTTP )
                    {
                    // InternalCurlBetterThanHttpie.g:636:7: (lv_protocol_3_1= RULE_ID | lv_protocol_3_2= RULE_HTTP )
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==RULE_ID) ) {
                        alt18=1;
                    }
                    else if ( (LA18_0==RULE_HTTP) ) {
                        alt18=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 0, input);

                        throw nvae;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalCurlBetterThanHttpie.g:637:8: lv_protocol_3_1= RULE_ID
                            {
                            lv_protocol_3_1=(Token)match(input,RULE_ID,FOLLOW_17); 

                            								newLeafNode(lv_protocol_3_1, grammarAccess.getProxyFlagAccess().getProtocolIDTerminalRuleCall_2_0_0_0_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getProxyFlagRule());
                            								}
                            								setWithLastConsumed(
                            									current,
                            									"protocol",
                            									lv_protocol_3_1,
                            									"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.ID");
                            							

                            }
                            break;
                        case 2 :
                            // InternalCurlBetterThanHttpie.g:652:8: lv_protocol_3_2= RULE_HTTP
                            {
                            lv_protocol_3_2=(Token)match(input,RULE_HTTP,FOLLOW_17); 

                            								newLeafNode(lv_protocol_3_2, grammarAccess.getProxyFlagAccess().getProtocolHTTPTerminalRuleCall_2_0_0_0_1());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getProxyFlagRule());
                            								}
                            								setWithLastConsumed(
                            									current,
                            									"protocol",
                            									lv_protocol_3_2,
                            									"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.HTTP");
                            							

                            }
                            break;

                    }


                    }


                    }

                    otherlv_4=(Token)match(input,16,FOLLOW_6); 

                    					newLeafNode(otherlv_4, grammarAccess.getProxyFlagAccess().getColonKeyword_2_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:675:4: ( ( ( (lv_proxyProtocol_5_1= RULE_ID | lv_proxyProtocol_5_2= RULE_HTTP ) ) ) otherlv_6= '://' )
                    {
                    // InternalCurlBetterThanHttpie.g:675:4: ( ( ( (lv_proxyProtocol_5_1= RULE_ID | lv_proxyProtocol_5_2= RULE_HTTP ) ) ) otherlv_6= '://' )
                    // InternalCurlBetterThanHttpie.g:676:5: ( ( (lv_proxyProtocol_5_1= RULE_ID | lv_proxyProtocol_5_2= RULE_HTTP ) ) ) otherlv_6= '://'
                    {
                    // InternalCurlBetterThanHttpie.g:676:5: ( ( (lv_proxyProtocol_5_1= RULE_ID | lv_proxyProtocol_5_2= RULE_HTTP ) ) )
                    // InternalCurlBetterThanHttpie.g:677:6: ( (lv_proxyProtocol_5_1= RULE_ID | lv_proxyProtocol_5_2= RULE_HTTP ) )
                    {
                    // InternalCurlBetterThanHttpie.g:677:6: ( (lv_proxyProtocol_5_1= RULE_ID | lv_proxyProtocol_5_2= RULE_HTTP ) )
                    // InternalCurlBetterThanHttpie.g:678:7: (lv_proxyProtocol_5_1= RULE_ID | lv_proxyProtocol_5_2= RULE_HTTP )
                    {
                    // InternalCurlBetterThanHttpie.g:678:7: (lv_proxyProtocol_5_1= RULE_ID | lv_proxyProtocol_5_2= RULE_HTTP )
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==RULE_ID) ) {
                        alt19=1;
                    }
                    else if ( (LA19_0==RULE_HTTP) ) {
                        alt19=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 0, input);

                        throw nvae;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalCurlBetterThanHttpie.g:679:8: lv_proxyProtocol_5_1= RULE_ID
                            {
                            lv_proxyProtocol_5_1=(Token)match(input,RULE_ID,FOLLOW_7); 

                            								newLeafNode(lv_proxyProtocol_5_1, grammarAccess.getProxyFlagAccess().getProxyProtocolIDTerminalRuleCall_2_1_0_0_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getProxyFlagRule());
                            								}
                            								setWithLastConsumed(
                            									current,
                            									"proxyProtocol",
                            									lv_proxyProtocol_5_1,
                            									"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.ID");
                            							

                            }
                            break;
                        case 2 :
                            // InternalCurlBetterThanHttpie.g:694:8: lv_proxyProtocol_5_2= RULE_HTTP
                            {
                            lv_proxyProtocol_5_2=(Token)match(input,RULE_HTTP,FOLLOW_7); 

                            								newLeafNode(lv_proxyProtocol_5_2, grammarAccess.getProxyFlagAccess().getProxyProtocolHTTPTerminalRuleCall_2_1_0_0_1());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getProxyFlagRule());
                            								}
                            								setWithLastConsumed(
                            									current,
                            									"proxyProtocol",
                            									lv_proxyProtocol_5_2,
                            									"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.HTTP");
                            							

                            }
                            break;

                    }


                    }


                    }

                    otherlv_6=(Token)match(input,15,FOLLOW_6); 

                    					newLeafNode(otherlv_6, grammarAccess.getProxyFlagAccess().getColonSolidusSolidusKeyword_2_1_1());
                    				

                    }


                    }
                    break;
                case 3 :
                    // InternalCurlBetterThanHttpie.g:717:4: ( ( ( (lv_protocol_7_1= RULE_ID | lv_protocol_7_2= RULE_HTTP ) ) ) otherlv_8= ':' ( ( (lv_proxyProtocol_9_1= RULE_ID | lv_proxyProtocol_9_2= RULE_HTTP ) ) ) otherlv_10= '://' )
                    {
                    // InternalCurlBetterThanHttpie.g:717:4: ( ( ( (lv_protocol_7_1= RULE_ID | lv_protocol_7_2= RULE_HTTP ) ) ) otherlv_8= ':' ( ( (lv_proxyProtocol_9_1= RULE_ID | lv_proxyProtocol_9_2= RULE_HTTP ) ) ) otherlv_10= '://' )
                    // InternalCurlBetterThanHttpie.g:718:5: ( ( (lv_protocol_7_1= RULE_ID | lv_protocol_7_2= RULE_HTTP ) ) ) otherlv_8= ':' ( ( (lv_proxyProtocol_9_1= RULE_ID | lv_proxyProtocol_9_2= RULE_HTTP ) ) ) otherlv_10= '://'
                    {
                    // InternalCurlBetterThanHttpie.g:718:5: ( ( (lv_protocol_7_1= RULE_ID | lv_protocol_7_2= RULE_HTTP ) ) )
                    // InternalCurlBetterThanHttpie.g:719:6: ( (lv_protocol_7_1= RULE_ID | lv_protocol_7_2= RULE_HTTP ) )
                    {
                    // InternalCurlBetterThanHttpie.g:719:6: ( (lv_protocol_7_1= RULE_ID | lv_protocol_7_2= RULE_HTTP ) )
                    // InternalCurlBetterThanHttpie.g:720:7: (lv_protocol_7_1= RULE_ID | lv_protocol_7_2= RULE_HTTP )
                    {
                    // InternalCurlBetterThanHttpie.g:720:7: (lv_protocol_7_1= RULE_ID | lv_protocol_7_2= RULE_HTTP )
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==RULE_ID) ) {
                        alt20=1;
                    }
                    else if ( (LA20_0==RULE_HTTP) ) {
                        alt20=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 0, input);

                        throw nvae;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalCurlBetterThanHttpie.g:721:8: lv_protocol_7_1= RULE_ID
                            {
                            lv_protocol_7_1=(Token)match(input,RULE_ID,FOLLOW_17); 

                            								newLeafNode(lv_protocol_7_1, grammarAccess.getProxyFlagAccess().getProtocolIDTerminalRuleCall_2_2_0_0_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getProxyFlagRule());
                            								}
                            								setWithLastConsumed(
                            									current,
                            									"protocol",
                            									lv_protocol_7_1,
                            									"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.ID");
                            							

                            }
                            break;
                        case 2 :
                            // InternalCurlBetterThanHttpie.g:736:8: lv_protocol_7_2= RULE_HTTP
                            {
                            lv_protocol_7_2=(Token)match(input,RULE_HTTP,FOLLOW_17); 

                            								newLeafNode(lv_protocol_7_2, grammarAccess.getProxyFlagAccess().getProtocolHTTPTerminalRuleCall_2_2_0_0_1());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getProxyFlagRule());
                            								}
                            								setWithLastConsumed(
                            									current,
                            									"protocol",
                            									lv_protocol_7_2,
                            									"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.HTTP");
                            							

                            }
                            break;

                    }


                    }


                    }

                    otherlv_8=(Token)match(input,16,FOLLOW_13); 

                    					newLeafNode(otherlv_8, grammarAccess.getProxyFlagAccess().getColonKeyword_2_2_1());
                    				
                    // InternalCurlBetterThanHttpie.g:757:5: ( ( (lv_proxyProtocol_9_1= RULE_ID | lv_proxyProtocol_9_2= RULE_HTTP ) ) )
                    // InternalCurlBetterThanHttpie.g:758:6: ( (lv_proxyProtocol_9_1= RULE_ID | lv_proxyProtocol_9_2= RULE_HTTP ) )
                    {
                    // InternalCurlBetterThanHttpie.g:758:6: ( (lv_proxyProtocol_9_1= RULE_ID | lv_proxyProtocol_9_2= RULE_HTTP ) )
                    // InternalCurlBetterThanHttpie.g:759:7: (lv_proxyProtocol_9_1= RULE_ID | lv_proxyProtocol_9_2= RULE_HTTP )
                    {
                    // InternalCurlBetterThanHttpie.g:759:7: (lv_proxyProtocol_9_1= RULE_ID | lv_proxyProtocol_9_2= RULE_HTTP )
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==RULE_ID) ) {
                        alt21=1;
                    }
                    else if ( (LA21_0==RULE_HTTP) ) {
                        alt21=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalCurlBetterThanHttpie.g:760:8: lv_proxyProtocol_9_1= RULE_ID
                            {
                            lv_proxyProtocol_9_1=(Token)match(input,RULE_ID,FOLLOW_7); 

                            								newLeafNode(lv_proxyProtocol_9_1, grammarAccess.getProxyFlagAccess().getProxyProtocolIDTerminalRuleCall_2_2_2_0_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getProxyFlagRule());
                            								}
                            								setWithLastConsumed(
                            									current,
                            									"proxyProtocol",
                            									lv_proxyProtocol_9_1,
                            									"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.ID");
                            							

                            }
                            break;
                        case 2 :
                            // InternalCurlBetterThanHttpie.g:775:8: lv_proxyProtocol_9_2= RULE_HTTP
                            {
                            lv_proxyProtocol_9_2=(Token)match(input,RULE_HTTP,FOLLOW_7); 

                            								newLeafNode(lv_proxyProtocol_9_2, grammarAccess.getProxyFlagAccess().getProxyProtocolHTTPTerminalRuleCall_2_2_2_0_1());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getProxyFlagRule());
                            								}
                            								setWithLastConsumed(
                            									current,
                            									"proxyProtocol",
                            									lv_proxyProtocol_9_2,
                            									"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.HTTP");
                            							

                            }
                            break;

                    }


                    }


                    }

                    otherlv_10=(Token)match(input,15,FOLLOW_6); 

                    					newLeafNode(otherlv_10, grammarAccess.getProxyFlagAccess().getColonSolidusSolidusKeyword_2_2_3());
                    				

                    }


                    }
                    break;

            }

            // InternalCurlBetterThanHttpie.g:798:3: ( ( ( (lv_username_11_1= RULE_ID | lv_username_11_2= RULE_HTTP ) ) ) otherlv_12= ':' ( ( (lv_password_13_1= RULE_ID | lv_password_13_2= RULE_HTTP ) ) ) otherlv_14= '@' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_HTTP||LA25_0==RULE_ID) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:799:4: ( ( (lv_username_11_1= RULE_ID | lv_username_11_2= RULE_HTTP ) ) ) otherlv_12= ':' ( ( (lv_password_13_1= RULE_ID | lv_password_13_2= RULE_HTTP ) ) ) otherlv_14= '@'
                    {
                    // InternalCurlBetterThanHttpie.g:799:4: ( ( (lv_username_11_1= RULE_ID | lv_username_11_2= RULE_HTTP ) ) )
                    // InternalCurlBetterThanHttpie.g:800:5: ( (lv_username_11_1= RULE_ID | lv_username_11_2= RULE_HTTP ) )
                    {
                    // InternalCurlBetterThanHttpie.g:800:5: ( (lv_username_11_1= RULE_ID | lv_username_11_2= RULE_HTTP ) )
                    // InternalCurlBetterThanHttpie.g:801:6: (lv_username_11_1= RULE_ID | lv_username_11_2= RULE_HTTP )
                    {
                    // InternalCurlBetterThanHttpie.g:801:6: (lv_username_11_1= RULE_ID | lv_username_11_2= RULE_HTTP )
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==RULE_ID) ) {
                        alt23=1;
                    }
                    else if ( (LA23_0==RULE_HTTP) ) {
                        alt23=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 0, input);

                        throw nvae;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalCurlBetterThanHttpie.g:802:7: lv_username_11_1= RULE_ID
                            {
                            lv_username_11_1=(Token)match(input,RULE_ID,FOLLOW_17); 

                            							newLeafNode(lv_username_11_1, grammarAccess.getProxyFlagAccess().getUsernameIDTerminalRuleCall_3_0_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getProxyFlagRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"username",
                            								lv_username_11_1,
                            								"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.ID");
                            						

                            }
                            break;
                        case 2 :
                            // InternalCurlBetterThanHttpie.g:817:7: lv_username_11_2= RULE_HTTP
                            {
                            lv_username_11_2=(Token)match(input,RULE_HTTP,FOLLOW_17); 

                            							newLeafNode(lv_username_11_2, grammarAccess.getProxyFlagAccess().getUsernameHTTPTerminalRuleCall_3_0_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getProxyFlagRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"username",
                            								lv_username_11_2,
                            								"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.HTTP");
                            						

                            }
                            break;

                    }


                    }


                    }

                    otherlv_12=(Token)match(input,16,FOLLOW_13); 

                    				newLeafNode(otherlv_12, grammarAccess.getProxyFlagAccess().getColonKeyword_3_1());
                    			
                    // InternalCurlBetterThanHttpie.g:838:4: ( ( (lv_password_13_1= RULE_ID | lv_password_13_2= RULE_HTTP ) ) )
                    // InternalCurlBetterThanHttpie.g:839:5: ( (lv_password_13_1= RULE_ID | lv_password_13_2= RULE_HTTP ) )
                    {
                    // InternalCurlBetterThanHttpie.g:839:5: ( (lv_password_13_1= RULE_ID | lv_password_13_2= RULE_HTTP ) )
                    // InternalCurlBetterThanHttpie.g:840:6: (lv_password_13_1= RULE_ID | lv_password_13_2= RULE_HTTP )
                    {
                    // InternalCurlBetterThanHttpie.g:840:6: (lv_password_13_1= RULE_ID | lv_password_13_2= RULE_HTTP )
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==RULE_ID) ) {
                        alt24=1;
                    }
                    else if ( (LA24_0==RULE_HTTP) ) {
                        alt24=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 0, input);

                        throw nvae;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalCurlBetterThanHttpie.g:841:7: lv_password_13_1= RULE_ID
                            {
                            lv_password_13_1=(Token)match(input,RULE_ID,FOLLOW_18); 

                            							newLeafNode(lv_password_13_1, grammarAccess.getProxyFlagAccess().getPasswordIDTerminalRuleCall_3_2_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getProxyFlagRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"password",
                            								lv_password_13_1,
                            								"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.ID");
                            						

                            }
                            break;
                        case 2 :
                            // InternalCurlBetterThanHttpie.g:856:7: lv_password_13_2= RULE_HTTP
                            {
                            lv_password_13_2=(Token)match(input,RULE_HTTP,FOLLOW_18); 

                            							newLeafNode(lv_password_13_2, grammarAccess.getProxyFlagAccess().getPasswordHTTPTerminalRuleCall_3_2_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getProxyFlagRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"password",
                            								lv_password_13_2,
                            								"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.HTTP");
                            						

                            }
                            break;

                    }


                    }


                    }

                    otherlv_14=(Token)match(input,29,FOLLOW_8); 

                    				newLeafNode(otherlv_14, grammarAccess.getProxyFlagAccess().getCommercialAtKeyword_3_3());
                    			

                    }
                    break;

            }

            // InternalCurlBetterThanHttpie.g:878:3: ( ( ( (lv_hostname_15_0= RULE_URL ) ) (otherlv_16= ':' ( (lv_port_17_0= RULE_INT ) ) )? ) | (otherlv_18= ':' ( (lv_port_19_0= RULE_INT ) )? ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_URL) ) {
                alt28=1;
            }
            else if ( (LA28_0==16) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:879:4: ( ( (lv_hostname_15_0= RULE_URL ) ) (otherlv_16= ':' ( (lv_port_17_0= RULE_INT ) ) )? )
                    {
                    // InternalCurlBetterThanHttpie.g:879:4: ( ( (lv_hostname_15_0= RULE_URL ) ) (otherlv_16= ':' ( (lv_port_17_0= RULE_INT ) ) )? )
                    // InternalCurlBetterThanHttpie.g:880:5: ( (lv_hostname_15_0= RULE_URL ) ) (otherlv_16= ':' ( (lv_port_17_0= RULE_INT ) ) )?
                    {
                    // InternalCurlBetterThanHttpie.g:880:5: ( (lv_hostname_15_0= RULE_URL ) )
                    // InternalCurlBetterThanHttpie.g:881:6: (lv_hostname_15_0= RULE_URL )
                    {
                    // InternalCurlBetterThanHttpie.g:881:6: (lv_hostname_15_0= RULE_URL )
                    // InternalCurlBetterThanHttpie.g:882:7: lv_hostname_15_0= RULE_URL
                    {
                    lv_hostname_15_0=(Token)match(input,RULE_URL,FOLLOW_19); 

                    							newLeafNode(lv_hostname_15_0, grammarAccess.getProxyFlagAccess().getHostnameURLTerminalRuleCall_4_0_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getProxyFlagRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"hostname",
                    								lv_hostname_15_0,
                    								"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.URL");
                    						

                    }


                    }

                    // InternalCurlBetterThanHttpie.g:898:5: (otherlv_16= ':' ( (lv_port_17_0= RULE_INT ) ) )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==16) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalCurlBetterThanHttpie.g:899:6: otherlv_16= ':' ( (lv_port_17_0= RULE_INT ) )
                            {
                            otherlv_16=(Token)match(input,16,FOLLOW_10); 

                            						newLeafNode(otherlv_16, grammarAccess.getProxyFlagAccess().getColonKeyword_4_0_1_0());
                            					
                            // InternalCurlBetterThanHttpie.g:903:6: ( (lv_port_17_0= RULE_INT ) )
                            // InternalCurlBetterThanHttpie.g:904:7: (lv_port_17_0= RULE_INT )
                            {
                            // InternalCurlBetterThanHttpie.g:904:7: (lv_port_17_0= RULE_INT )
                            // InternalCurlBetterThanHttpie.g:905:8: lv_port_17_0= RULE_INT
                            {
                            lv_port_17_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                            								newLeafNode(lv_port_17_0, grammarAccess.getProxyFlagAccess().getPortINTTerminalRuleCall_4_0_1_1_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getProxyFlagRule());
                            								}
                            								setWithLastConsumed(
                            									current,
                            									"port",
                            									lv_port_17_0,
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
                    // InternalCurlBetterThanHttpie.g:924:4: (otherlv_18= ':' ( (lv_port_19_0= RULE_INT ) )? )
                    {
                    // InternalCurlBetterThanHttpie.g:924:4: (otherlv_18= ':' ( (lv_port_19_0= RULE_INT ) )? )
                    // InternalCurlBetterThanHttpie.g:925:5: otherlv_18= ':' ( (lv_port_19_0= RULE_INT ) )?
                    {
                    otherlv_18=(Token)match(input,16,FOLLOW_20); 

                    					newLeafNode(otherlv_18, grammarAccess.getProxyFlagAccess().getColonKeyword_4_1_0());
                    				
                    // InternalCurlBetterThanHttpie.g:929:5: ( (lv_port_19_0= RULE_INT ) )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==RULE_INT) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalCurlBetterThanHttpie.g:930:6: (lv_port_19_0= RULE_INT )
                            {
                            // InternalCurlBetterThanHttpie.g:930:6: (lv_port_19_0= RULE_INT )
                            // InternalCurlBetterThanHttpie.g:931:7: lv_port_19_0= RULE_INT
                            {
                            lv_port_19_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                            							newLeafNode(lv_port_19_0, grammarAccess.getProxyFlagAccess().getPortINTTerminalRuleCall_4_1_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getProxyFlagRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"port",
                            								lv_port_19_0,
                            								"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.INT");
                            						

                            }


                            }
                            break;

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
    // InternalCurlBetterThanHttpie.g:953:1: entryRuleAuthFlag returns [EObject current=null] : iv_ruleAuthFlag= ruleAuthFlag EOF ;
    public final EObject entryRuleAuthFlag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAuthFlag = null;


        try {
            // InternalCurlBetterThanHttpie.g:953:49: (iv_ruleAuthFlag= ruleAuthFlag EOF )
            // InternalCurlBetterThanHttpie.g:954:2: iv_ruleAuthFlag= ruleAuthFlag EOF
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
    // InternalCurlBetterThanHttpie.g:960:1: ruleAuthFlag returns [EObject current=null] : ( (otherlv_0= '--auth' | otherlv_1= '-a' ) (otherlv_2= '=' | this_WS_3= RULE_WS ) ( ( (lv_username_4_1= RULE_ID | lv_username_4_2= RULE_HTTP ) ) ) (otherlv_5= ':' ( ( (lv_password_6_1= RULE_ID | lv_password_6_2= RULE_HTTP ) ) ) )? (otherlv_7= '@' ( ( (lv_hostname_8_0= RULE_URL ) ) | otherlv_9= ':' ) )? ) ;
    public final EObject ruleAuthFlag() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_WS_3=null;
        Token lv_username_4_1=null;
        Token lv_username_4_2=null;
        Token otherlv_5=null;
        Token lv_password_6_1=null;
        Token lv_password_6_2=null;
        Token otherlv_7=null;
        Token lv_hostname_8_0=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:966:2: ( ( (otherlv_0= '--auth' | otherlv_1= '-a' ) (otherlv_2= '=' | this_WS_3= RULE_WS ) ( ( (lv_username_4_1= RULE_ID | lv_username_4_2= RULE_HTTP ) ) ) (otherlv_5= ':' ( ( (lv_password_6_1= RULE_ID | lv_password_6_2= RULE_HTTP ) ) ) )? (otherlv_7= '@' ( ( (lv_hostname_8_0= RULE_URL ) ) | otherlv_9= ':' ) )? ) )
            // InternalCurlBetterThanHttpie.g:967:2: ( (otherlv_0= '--auth' | otherlv_1= '-a' ) (otherlv_2= '=' | this_WS_3= RULE_WS ) ( ( (lv_username_4_1= RULE_ID | lv_username_4_2= RULE_HTTP ) ) ) (otherlv_5= ':' ( ( (lv_password_6_1= RULE_ID | lv_password_6_2= RULE_HTTP ) ) ) )? (otherlv_7= '@' ( ( (lv_hostname_8_0= RULE_URL ) ) | otherlv_9= ':' ) )? )
            {
            // InternalCurlBetterThanHttpie.g:967:2: ( (otherlv_0= '--auth' | otherlv_1= '-a' ) (otherlv_2= '=' | this_WS_3= RULE_WS ) ( ( (lv_username_4_1= RULE_ID | lv_username_4_2= RULE_HTTP ) ) ) (otherlv_5= ':' ( ( (lv_password_6_1= RULE_ID | lv_password_6_2= RULE_HTTP ) ) ) )? (otherlv_7= '@' ( ( (lv_hostname_8_0= RULE_URL ) ) | otherlv_9= ':' ) )? )
            // InternalCurlBetterThanHttpie.g:968:3: (otherlv_0= '--auth' | otherlv_1= '-a' ) (otherlv_2= '=' | this_WS_3= RULE_WS ) ( ( (lv_username_4_1= RULE_ID | lv_username_4_2= RULE_HTTP ) ) ) (otherlv_5= ':' ( ( (lv_password_6_1= RULE_ID | lv_password_6_2= RULE_HTTP ) ) ) )? (otherlv_7= '@' ( ( (lv_hostname_8_0= RULE_URL ) ) | otherlv_9= ':' ) )?
            {
            // InternalCurlBetterThanHttpie.g:968:3: (otherlv_0= '--auth' | otherlv_1= '-a' )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==30) ) {
                alt29=1;
            }
            else if ( (LA29_0==31) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:969:4: otherlv_0= '--auth'
                    {
                    otherlv_0=(Token)match(input,30,FOLLOW_16); 

                    				newLeafNode(otherlv_0, grammarAccess.getAuthFlagAccess().getAuthKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:974:4: otherlv_1= '-a'
                    {
                    otherlv_1=(Token)match(input,31,FOLLOW_16); 

                    				newLeafNode(otherlv_1, grammarAccess.getAuthFlagAccess().getAKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalCurlBetterThanHttpie.g:979:3: (otherlv_2= '=' | this_WS_3= RULE_WS )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==28) ) {
                alt30=1;
            }
            else if ( (LA30_0==RULE_WS) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:980:4: otherlv_2= '='
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_13); 

                    				newLeafNode(otherlv_2, grammarAccess.getAuthFlagAccess().getEqualsSignKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:985:4: this_WS_3= RULE_WS
                    {
                    this_WS_3=(Token)match(input,RULE_WS,FOLLOW_13); 

                    				newLeafNode(this_WS_3, grammarAccess.getAuthFlagAccess().getWSTerminalRuleCall_1_1());
                    			

                    }
                    break;

            }

            // InternalCurlBetterThanHttpie.g:990:3: ( ( (lv_username_4_1= RULE_ID | lv_username_4_2= RULE_HTTP ) ) )
            // InternalCurlBetterThanHttpie.g:991:4: ( (lv_username_4_1= RULE_ID | lv_username_4_2= RULE_HTTP ) )
            {
            // InternalCurlBetterThanHttpie.g:991:4: ( (lv_username_4_1= RULE_ID | lv_username_4_2= RULE_HTTP ) )
            // InternalCurlBetterThanHttpie.g:992:5: (lv_username_4_1= RULE_ID | lv_username_4_2= RULE_HTTP )
            {
            // InternalCurlBetterThanHttpie.g:992:5: (lv_username_4_1= RULE_ID | lv_username_4_2= RULE_HTTP )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID) ) {
                alt31=1;
            }
            else if ( (LA31_0==RULE_HTTP) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:993:6: lv_username_4_1= RULE_ID
                    {
                    lv_username_4_1=(Token)match(input,RULE_ID,FOLLOW_21); 

                    						newLeafNode(lv_username_4_1, grammarAccess.getAuthFlagAccess().getUsernameIDTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAuthFlagRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"username",
                    							lv_username_4_1,
                    							"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.ID");
                    					

                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:1008:6: lv_username_4_2= RULE_HTTP
                    {
                    lv_username_4_2=(Token)match(input,RULE_HTTP,FOLLOW_21); 

                    						newLeafNode(lv_username_4_2, grammarAccess.getAuthFlagAccess().getUsernameHTTPTerminalRuleCall_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAuthFlagRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"username",
                    							lv_username_4_2,
                    							"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.HTTP");
                    					

                    }
                    break;

            }


            }


            }

            // InternalCurlBetterThanHttpie.g:1025:3: (otherlv_5= ':' ( ( (lv_password_6_1= RULE_ID | lv_password_6_2= RULE_HTTP ) ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==16) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1026:4: otherlv_5= ':' ( ( (lv_password_6_1= RULE_ID | lv_password_6_2= RULE_HTTP ) ) )
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_13); 

                    				newLeafNode(otherlv_5, grammarAccess.getAuthFlagAccess().getColonKeyword_3_0());
                    			
                    // InternalCurlBetterThanHttpie.g:1030:4: ( ( (lv_password_6_1= RULE_ID | lv_password_6_2= RULE_HTTP ) ) )
                    // InternalCurlBetterThanHttpie.g:1031:5: ( (lv_password_6_1= RULE_ID | lv_password_6_2= RULE_HTTP ) )
                    {
                    // InternalCurlBetterThanHttpie.g:1031:5: ( (lv_password_6_1= RULE_ID | lv_password_6_2= RULE_HTTP ) )
                    // InternalCurlBetterThanHttpie.g:1032:6: (lv_password_6_1= RULE_ID | lv_password_6_2= RULE_HTTP )
                    {
                    // InternalCurlBetterThanHttpie.g:1032:6: (lv_password_6_1= RULE_ID | lv_password_6_2= RULE_HTTP )
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==RULE_ID) ) {
                        alt32=1;
                    }
                    else if ( (LA32_0==RULE_HTTP) ) {
                        alt32=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 0, input);

                        throw nvae;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalCurlBetterThanHttpie.g:1033:7: lv_password_6_1= RULE_ID
                            {
                            lv_password_6_1=(Token)match(input,RULE_ID,FOLLOW_22); 

                            							newLeafNode(lv_password_6_1, grammarAccess.getAuthFlagAccess().getPasswordIDTerminalRuleCall_3_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getAuthFlagRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"password",
                            								lv_password_6_1,
                            								"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.ID");
                            						

                            }
                            break;
                        case 2 :
                            // InternalCurlBetterThanHttpie.g:1048:7: lv_password_6_2= RULE_HTTP
                            {
                            lv_password_6_2=(Token)match(input,RULE_HTTP,FOLLOW_22); 

                            							newLeafNode(lv_password_6_2, grammarAccess.getAuthFlagAccess().getPasswordHTTPTerminalRuleCall_3_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getAuthFlagRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"password",
                            								lv_password_6_2,
                            								"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.HTTP");
                            						

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalCurlBetterThanHttpie.g:1066:3: (otherlv_7= '@' ( ( (lv_hostname_8_0= RULE_URL ) ) | otherlv_9= ':' ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==29) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1067:4: otherlv_7= '@' ( ( (lv_hostname_8_0= RULE_URL ) ) | otherlv_9= ':' )
                    {
                    otherlv_7=(Token)match(input,29,FOLLOW_8); 

                    				newLeafNode(otherlv_7, grammarAccess.getAuthFlagAccess().getCommercialAtKeyword_4_0());
                    			
                    // InternalCurlBetterThanHttpie.g:1071:4: ( ( (lv_hostname_8_0= RULE_URL ) ) | otherlv_9= ':' )
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==RULE_URL) ) {
                        alt34=1;
                    }
                    else if ( (LA34_0==16) ) {
                        alt34=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 0, input);

                        throw nvae;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalCurlBetterThanHttpie.g:1072:5: ( (lv_hostname_8_0= RULE_URL ) )
                            {
                            // InternalCurlBetterThanHttpie.g:1072:5: ( (lv_hostname_8_0= RULE_URL ) )
                            // InternalCurlBetterThanHttpie.g:1073:6: (lv_hostname_8_0= RULE_URL )
                            {
                            // InternalCurlBetterThanHttpie.g:1073:6: (lv_hostname_8_0= RULE_URL )
                            // InternalCurlBetterThanHttpie.g:1074:7: lv_hostname_8_0= RULE_URL
                            {
                            lv_hostname_8_0=(Token)match(input,RULE_URL,FOLLOW_2); 

                            							newLeafNode(lv_hostname_8_0, grammarAccess.getAuthFlagAccess().getHostnameURLTerminalRuleCall_4_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getAuthFlagRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"hostname",
                            								lv_hostname_8_0,
                            								"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.URL");
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalCurlBetterThanHttpie.g:1091:5: otherlv_9= ':'
                            {
                            otherlv_9=(Token)match(input,16,FOLLOW_2); 

                            					newLeafNode(otherlv_9, grammarAccess.getAuthFlagAccess().getColonKeyword_4_1_1());
                            				

                            }
                            break;

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
    // InternalCurlBetterThanHttpie.g:1101:1: entryRuleDownloadFlag returns [EObject current=null] : iv_ruleDownloadFlag= ruleDownloadFlag EOF ;
    public final EObject entryRuleDownloadFlag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDownloadFlag = null;


        try {
            // InternalCurlBetterThanHttpie.g:1101:53: (iv_ruleDownloadFlag= ruleDownloadFlag EOF )
            // InternalCurlBetterThanHttpie.g:1102:2: iv_ruleDownloadFlag= ruleDownloadFlag EOF
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
    // InternalCurlBetterThanHttpie.g:1108:1: ruleDownloadFlag returns [EObject current=null] : ( () (otherlv_1= '--download' | otherlv_2= '-d' ) ) ;
    public final EObject ruleDownloadFlag() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:1114:2: ( ( () (otherlv_1= '--download' | otherlv_2= '-d' ) ) )
            // InternalCurlBetterThanHttpie.g:1115:2: ( () (otherlv_1= '--download' | otherlv_2= '-d' ) )
            {
            // InternalCurlBetterThanHttpie.g:1115:2: ( () (otherlv_1= '--download' | otherlv_2= '-d' ) )
            // InternalCurlBetterThanHttpie.g:1116:3: () (otherlv_1= '--download' | otherlv_2= '-d' )
            {
            // InternalCurlBetterThanHttpie.g:1116:3: ()
            // InternalCurlBetterThanHttpie.g:1117:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDownloadFlagAccess().getDownloadFlagAction_0(),
            					current);
            			

            }

            // InternalCurlBetterThanHttpie.g:1123:3: (otherlv_1= '--download' | otherlv_2= '-d' )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==32) ) {
                alt36=1;
            }
            else if ( (LA36_0==33) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1124:4: otherlv_1= '--download'
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getDownloadFlagAccess().getDownloadKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:1129:4: otherlv_2= '-d'
                    {
                    otherlv_2=(Token)match(input,33,FOLLOW_2); 

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
    // InternalCurlBetterThanHttpie.g:1138:1: entryRuleHelpFlag returns [EObject current=null] : iv_ruleHelpFlag= ruleHelpFlag EOF ;
    public final EObject entryRuleHelpFlag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHelpFlag = null;


        try {
            // InternalCurlBetterThanHttpie.g:1138:49: (iv_ruleHelpFlag= ruleHelpFlag EOF )
            // InternalCurlBetterThanHttpie.g:1139:2: iv_ruleHelpFlag= ruleHelpFlag EOF
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
    // InternalCurlBetterThanHttpie.g:1145:1: ruleHelpFlag returns [EObject current=null] : ( () (otherlv_1= '--help' | otherlv_2= '-h' ) ) ;
    public final EObject ruleHelpFlag() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:1151:2: ( ( () (otherlv_1= '--help' | otherlv_2= '-h' ) ) )
            // InternalCurlBetterThanHttpie.g:1152:2: ( () (otherlv_1= '--help' | otherlv_2= '-h' ) )
            {
            // InternalCurlBetterThanHttpie.g:1152:2: ( () (otherlv_1= '--help' | otherlv_2= '-h' ) )
            // InternalCurlBetterThanHttpie.g:1153:3: () (otherlv_1= '--help' | otherlv_2= '-h' )
            {
            // InternalCurlBetterThanHttpie.g:1153:3: ()
            // InternalCurlBetterThanHttpie.g:1154:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHelpFlagAccess().getHelpFlagAction_0(),
            					current);
            			

            }

            // InternalCurlBetterThanHttpie.g:1160:3: (otherlv_1= '--help' | otherlv_2= '-h' )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==34) ) {
                alt37=1;
            }
            else if ( (LA37_0==35) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1161:4: otherlv_1= '--help'
                    {
                    otherlv_1=(Token)match(input,34,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getHelpFlagAccess().getHelpKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:1166:4: otherlv_2= '-h'
                    {
                    otherlv_2=(Token)match(input,35,FOLLOW_2); 

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
    // InternalCurlBetterThanHttpie.g:1175:1: entryRuleVersionFlag returns [EObject current=null] : iv_ruleVersionFlag= ruleVersionFlag EOF ;
    public final EObject entryRuleVersionFlag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersionFlag = null;


        try {
            // InternalCurlBetterThanHttpie.g:1175:52: (iv_ruleVersionFlag= ruleVersionFlag EOF )
            // InternalCurlBetterThanHttpie.g:1176:2: iv_ruleVersionFlag= ruleVersionFlag EOF
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
    // InternalCurlBetterThanHttpie.g:1182:1: ruleVersionFlag returns [EObject current=null] : ( () otherlv_1= '--version' ) ;
    public final EObject ruleVersionFlag() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:1188:2: ( ( () otherlv_1= '--version' ) )
            // InternalCurlBetterThanHttpie.g:1189:2: ( () otherlv_1= '--version' )
            {
            // InternalCurlBetterThanHttpie.g:1189:2: ( () otherlv_1= '--version' )
            // InternalCurlBetterThanHttpie.g:1190:3: () otherlv_1= '--version'
            {
            // InternalCurlBetterThanHttpie.g:1190:3: ()
            // InternalCurlBetterThanHttpie.g:1191:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVersionFlagAccess().getVersionFlagAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_2); 

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
    // InternalCurlBetterThanHttpie.g:1205:1: entryRuleVerboseFlag returns [EObject current=null] : iv_ruleVerboseFlag= ruleVerboseFlag EOF ;
    public final EObject entryRuleVerboseFlag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerboseFlag = null;


        try {
            // InternalCurlBetterThanHttpie.g:1205:52: (iv_ruleVerboseFlag= ruleVerboseFlag EOF )
            // InternalCurlBetterThanHttpie.g:1206:2: iv_ruleVerboseFlag= ruleVerboseFlag EOF
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
    // InternalCurlBetterThanHttpie.g:1212:1: ruleVerboseFlag returns [EObject current=null] : ( () (otherlv_1= '--verbose' | otherlv_2= '-v' ) ) ;
    public final EObject ruleVerboseFlag() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:1218:2: ( ( () (otherlv_1= '--verbose' | otherlv_2= '-v' ) ) )
            // InternalCurlBetterThanHttpie.g:1219:2: ( () (otherlv_1= '--verbose' | otherlv_2= '-v' ) )
            {
            // InternalCurlBetterThanHttpie.g:1219:2: ( () (otherlv_1= '--verbose' | otherlv_2= '-v' ) )
            // InternalCurlBetterThanHttpie.g:1220:3: () (otherlv_1= '--verbose' | otherlv_2= '-v' )
            {
            // InternalCurlBetterThanHttpie.g:1220:3: ()
            // InternalCurlBetterThanHttpie.g:1221:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVerboseFlagAccess().getVerboseFlagAction_0(),
            					current);
            			

            }

            // InternalCurlBetterThanHttpie.g:1227:3: (otherlv_1= '--verbose' | otherlv_2= '-v' )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==37) ) {
                alt38=1;
            }
            else if ( (LA38_0==38) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1228:4: otherlv_1= '--verbose'
                    {
                    otherlv_1=(Token)match(input,37,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getVerboseFlagAccess().getVerboseKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:1233:4: otherlv_2= '-v'
                    {
                    otherlv_2=(Token)match(input,38,FOLLOW_2); 

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
    // InternalCurlBetterThanHttpie.g:1242:1: entryRuleTimeoutFlag returns [EObject current=null] : iv_ruleTimeoutFlag= ruleTimeoutFlag EOF ;
    public final EObject entryRuleTimeoutFlag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeoutFlag = null;


        try {
            // InternalCurlBetterThanHttpie.g:1242:52: (iv_ruleTimeoutFlag= ruleTimeoutFlag EOF )
            // InternalCurlBetterThanHttpie.g:1243:2: iv_ruleTimeoutFlag= ruleTimeoutFlag EOF
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
    // InternalCurlBetterThanHttpie.g:1249:1: ruleTimeoutFlag returns [EObject current=null] : (otherlv_0= '--timeout' (otherlv_1= '=' | this_WS_2= RULE_WS ) ( (lv_timeout_3_0= RULE_FLOAT ) ) ) ;
    public final EObject ruleTimeoutFlag() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_WS_2=null;
        Token lv_timeout_3_0=null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:1255:2: ( (otherlv_0= '--timeout' (otherlv_1= '=' | this_WS_2= RULE_WS ) ( (lv_timeout_3_0= RULE_FLOAT ) ) ) )
            // InternalCurlBetterThanHttpie.g:1256:2: (otherlv_0= '--timeout' (otherlv_1= '=' | this_WS_2= RULE_WS ) ( (lv_timeout_3_0= RULE_FLOAT ) ) )
            {
            // InternalCurlBetterThanHttpie.g:1256:2: (otherlv_0= '--timeout' (otherlv_1= '=' | this_WS_2= RULE_WS ) ( (lv_timeout_3_0= RULE_FLOAT ) ) )
            // InternalCurlBetterThanHttpie.g:1257:3: otherlv_0= '--timeout' (otherlv_1= '=' | this_WS_2= RULE_WS ) ( (lv_timeout_3_0= RULE_FLOAT ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getTimeoutFlagAccess().getTimeoutKeyword_0());
            		
            // InternalCurlBetterThanHttpie.g:1261:3: (otherlv_1= '=' | this_WS_2= RULE_WS )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==28) ) {
                alt39=1;
            }
            else if ( (LA39_0==RULE_WS) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1262:4: otherlv_1= '='
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_23); 

                    				newLeafNode(otherlv_1, grammarAccess.getTimeoutFlagAccess().getEqualsSignKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:1267:4: this_WS_2= RULE_WS
                    {
                    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_23); 

                    				newLeafNode(this_WS_2, grammarAccess.getTimeoutFlagAccess().getWSTerminalRuleCall_1_1());
                    			

                    }
                    break;

            }

            // InternalCurlBetterThanHttpie.g:1272:3: ( (lv_timeout_3_0= RULE_FLOAT ) )
            // InternalCurlBetterThanHttpie.g:1273:4: (lv_timeout_3_0= RULE_FLOAT )
            {
            // InternalCurlBetterThanHttpie.g:1273:4: (lv_timeout_3_0= RULE_FLOAT )
            // InternalCurlBetterThanHttpie.g:1274:5: lv_timeout_3_0= RULE_FLOAT
            {
            lv_timeout_3_0=(Token)match(input,RULE_FLOAT,FOLLOW_2); 

            					newLeafNode(lv_timeout_3_0, grammarAccess.getTimeoutFlagAccess().getTimeoutFLOATTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTimeoutFlagRule());
            					}
            					setWithLastConsumed(
            						current,
            						"timeout",
            						lv_timeout_3_0,
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
    // InternalCurlBetterThanHttpie.g:1294:1: entryRuleItem returns [EObject current=null] : iv_ruleItem= ruleItem EOF ;
    public final EObject entryRuleItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItem = null;


        try {
            // InternalCurlBetterThanHttpie.g:1294:45: (iv_ruleItem= ruleItem EOF )
            // InternalCurlBetterThanHttpie.g:1295:2: iv_ruleItem= ruleItem EOF
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
    // InternalCurlBetterThanHttpie.g:1301:1: ruleItem returns [EObject current=null] : (this_HttpHeaderItem_0= ruleHttpHeaderItem | this_FormFileFieldItem_1= ruleFormFileFieldItem | this_DataFieldItem_2= ruleDataFieldItem | this_UrlParameterItem_3= ruleUrlParameterItem | this_RawJsonFieldItem_4= ruleRawJsonFieldItem ) ;
    public final EObject ruleItem() throws RecognitionException {
        EObject current = null;

        EObject this_HttpHeaderItem_0 = null;

        EObject this_FormFileFieldItem_1 = null;

        EObject this_DataFieldItem_2 = null;

        EObject this_UrlParameterItem_3 = null;

        EObject this_RawJsonFieldItem_4 = null;



        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:1307:2: ( (this_HttpHeaderItem_0= ruleHttpHeaderItem | this_FormFileFieldItem_1= ruleFormFileFieldItem | this_DataFieldItem_2= ruleDataFieldItem | this_UrlParameterItem_3= ruleUrlParameterItem | this_RawJsonFieldItem_4= ruleRawJsonFieldItem ) )
            // InternalCurlBetterThanHttpie.g:1308:2: (this_HttpHeaderItem_0= ruleHttpHeaderItem | this_FormFileFieldItem_1= ruleFormFileFieldItem | this_DataFieldItem_2= ruleDataFieldItem | this_UrlParameterItem_3= ruleUrlParameterItem | this_RawJsonFieldItem_4= ruleRawJsonFieldItem )
            {
            // InternalCurlBetterThanHttpie.g:1308:2: (this_HttpHeaderItem_0= ruleHttpHeaderItem | this_FormFileFieldItem_1= ruleFormFileFieldItem | this_DataFieldItem_2= ruleDataFieldItem | this_UrlParameterItem_3= ruleUrlParameterItem | this_RawJsonFieldItem_4= ruleRawJsonFieldItem )
            int alt40=5;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 41:
                    {
                    alt40=5;
                    }
                    break;
                case 29:
                    {
                    alt40=2;
                    }
                    break;
                case 40:
                    {
                    alt40=4;
                    }
                    break;
                case 16:
                    {
                    alt40=1;
                    }
                    break;
                case 28:
                    {
                    alt40=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA40_0==RULE_HTTP) ) {
                switch ( input.LA(2) ) {
                case 16:
                    {
                    alt40=1;
                    }
                    break;
                case 28:
                    {
                    alt40=3;
                    }
                    break;
                case 41:
                    {
                    alt40=5;
                    }
                    break;
                case 29:
                    {
                    alt40=2;
                    }
                    break;
                case 40:
                    {
                    alt40=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1309:3: this_HttpHeaderItem_0= ruleHttpHeaderItem
                    {

                    			newCompositeNode(grammarAccess.getItemAccess().getHttpHeaderItemParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_HttpHeaderItem_0=ruleHttpHeaderItem();

                    state._fsp--;


                    			current = this_HttpHeaderItem_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:1318:3: this_FormFileFieldItem_1= ruleFormFileFieldItem
                    {

                    			newCompositeNode(grammarAccess.getItemAccess().getFormFileFieldItemParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FormFileFieldItem_1=ruleFormFileFieldItem();

                    state._fsp--;


                    			current = this_FormFileFieldItem_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalCurlBetterThanHttpie.g:1327:3: this_DataFieldItem_2= ruleDataFieldItem
                    {

                    			newCompositeNode(grammarAccess.getItemAccess().getDataFieldItemParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataFieldItem_2=ruleDataFieldItem();

                    state._fsp--;


                    			current = this_DataFieldItem_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalCurlBetterThanHttpie.g:1336:3: this_UrlParameterItem_3= ruleUrlParameterItem
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
                    // InternalCurlBetterThanHttpie.g:1345:3: this_RawJsonFieldItem_4= ruleRawJsonFieldItem
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


    // $ANTLR start "entryRuleHttpHeaderItem"
    // InternalCurlBetterThanHttpie.g:1357:1: entryRuleHttpHeaderItem returns [EObject current=null] : iv_ruleHttpHeaderItem= ruleHttpHeaderItem EOF ;
    public final EObject entryRuleHttpHeaderItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHttpHeaderItem = null;


        try {
            // InternalCurlBetterThanHttpie.g:1357:55: (iv_ruleHttpHeaderItem= ruleHttpHeaderItem EOF )
            // InternalCurlBetterThanHttpie.g:1358:2: iv_ruleHttpHeaderItem= ruleHttpHeaderItem EOF
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
    // InternalCurlBetterThanHttpie.g:1364:1: ruleHttpHeaderItem returns [EObject current=null] : ( ( ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) ) ) otherlv_1= ':' ( ( (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP ) ) ) ) ;
    public final EObject ruleHttpHeaderItem() throws RecognitionException {
        EObject current = null;

        Token lv_field_0_1=null;
        Token lv_field_0_2=null;
        Token otherlv_1=null;
        Token lv_value_2_1=null;
        Token lv_value_2_2=null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:1370:2: ( ( ( ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) ) ) otherlv_1= ':' ( ( (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP ) ) ) ) )
            // InternalCurlBetterThanHttpie.g:1371:2: ( ( ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) ) ) otherlv_1= ':' ( ( (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP ) ) ) )
            {
            // InternalCurlBetterThanHttpie.g:1371:2: ( ( ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) ) ) otherlv_1= ':' ( ( (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP ) ) ) )
            // InternalCurlBetterThanHttpie.g:1372:3: ( ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) ) ) otherlv_1= ':' ( ( (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP ) ) )
            {
            // InternalCurlBetterThanHttpie.g:1372:3: ( ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) ) )
            // InternalCurlBetterThanHttpie.g:1373:4: ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) )
            {
            // InternalCurlBetterThanHttpie.g:1373:4: ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) )
            // InternalCurlBetterThanHttpie.g:1374:5: (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP )
            {
            // InternalCurlBetterThanHttpie.g:1374:5: (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_ID) ) {
                alt41=1;
            }
            else if ( (LA41_0==RULE_HTTP) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1375:6: lv_field_0_1= RULE_ID
                    {
                    lv_field_0_1=(Token)match(input,RULE_ID,FOLLOW_17); 

                    						newLeafNode(lv_field_0_1, grammarAccess.getHttpHeaderItemAccess().getFieldIDTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getHttpHeaderItemRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"field",
                    							lv_field_0_1,
                    							"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.ID");
                    					

                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:1390:6: lv_field_0_2= RULE_HTTP
                    {
                    lv_field_0_2=(Token)match(input,RULE_HTTP,FOLLOW_17); 

                    						newLeafNode(lv_field_0_2, grammarAccess.getHttpHeaderItemAccess().getFieldHTTPTerminalRuleCall_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getHttpHeaderItemRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"field",
                    							lv_field_0_2,
                    							"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.HTTP");
                    					

                    }
                    break;

            }


            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getHttpHeaderItemAccess().getColonKeyword_1());
            		
            // InternalCurlBetterThanHttpie.g:1411:3: ( ( (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP ) ) )
            // InternalCurlBetterThanHttpie.g:1412:4: ( (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP ) )
            {
            // InternalCurlBetterThanHttpie.g:1412:4: ( (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP ) )
            // InternalCurlBetterThanHttpie.g:1413:5: (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP )
            {
            // InternalCurlBetterThanHttpie.g:1413:5: (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_ID) ) {
                alt42=1;
            }
            else if ( (LA42_0==RULE_HTTP) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1414:6: lv_value_2_1= RULE_ID
                    {
                    lv_value_2_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_value_2_1, grammarAccess.getHttpHeaderItemAccess().getValueIDTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getHttpHeaderItemRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_2_1,
                    							"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.ID");
                    					

                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:1429:6: lv_value_2_2= RULE_HTTP
                    {
                    lv_value_2_2=(Token)match(input,RULE_HTTP,FOLLOW_2); 

                    						newLeafNode(lv_value_2_2, grammarAccess.getHttpHeaderItemAccess().getValueHTTPTerminalRuleCall_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getHttpHeaderItemRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_2_2,
                    							"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.HTTP");
                    					

                    }
                    break;

            }


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


    // $ANTLR start "entryRuleFormFileFieldItem"
    // InternalCurlBetterThanHttpie.g:1450:1: entryRuleFormFileFieldItem returns [EObject current=null] : iv_ruleFormFileFieldItem= ruleFormFileFieldItem EOF ;
    public final EObject entryRuleFormFileFieldItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormFileFieldItem = null;


        try {
            // InternalCurlBetterThanHttpie.g:1450:58: (iv_ruleFormFileFieldItem= ruleFormFileFieldItem EOF )
            // InternalCurlBetterThanHttpie.g:1451:2: iv_ruleFormFileFieldItem= ruleFormFileFieldItem EOF
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
    // InternalCurlBetterThanHttpie.g:1457:1: ruleFormFileFieldItem returns [EObject current=null] : ( ( ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) ) ) otherlv_1= '@' ( ( (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP ) ) ) ) ;
    public final EObject ruleFormFileFieldItem() throws RecognitionException {
        EObject current = null;

        Token lv_field_0_1=null;
        Token lv_field_0_2=null;
        Token otherlv_1=null;
        Token lv_value_2_1=null;
        Token lv_value_2_2=null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:1463:2: ( ( ( ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) ) ) otherlv_1= '@' ( ( (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP ) ) ) ) )
            // InternalCurlBetterThanHttpie.g:1464:2: ( ( ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) ) ) otherlv_1= '@' ( ( (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP ) ) ) )
            {
            // InternalCurlBetterThanHttpie.g:1464:2: ( ( ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) ) ) otherlv_1= '@' ( ( (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP ) ) ) )
            // InternalCurlBetterThanHttpie.g:1465:3: ( ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) ) ) otherlv_1= '@' ( ( (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP ) ) )
            {
            // InternalCurlBetterThanHttpie.g:1465:3: ( ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) ) )
            // InternalCurlBetterThanHttpie.g:1466:4: ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) )
            {
            // InternalCurlBetterThanHttpie.g:1466:4: ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) )
            // InternalCurlBetterThanHttpie.g:1467:5: (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP )
            {
            // InternalCurlBetterThanHttpie.g:1467:5: (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID) ) {
                alt43=1;
            }
            else if ( (LA43_0==RULE_HTTP) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1468:6: lv_field_0_1= RULE_ID
                    {
                    lv_field_0_1=(Token)match(input,RULE_ID,FOLLOW_18); 

                    						newLeafNode(lv_field_0_1, grammarAccess.getFormFileFieldItemAccess().getFieldIDTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFormFileFieldItemRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"field",
                    							lv_field_0_1,
                    							"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.ID");
                    					

                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:1483:6: lv_field_0_2= RULE_HTTP
                    {
                    lv_field_0_2=(Token)match(input,RULE_HTTP,FOLLOW_18); 

                    						newLeafNode(lv_field_0_2, grammarAccess.getFormFileFieldItemAccess().getFieldHTTPTerminalRuleCall_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFormFileFieldItemRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"field",
                    							lv_field_0_2,
                    							"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.HTTP");
                    					

                    }
                    break;

            }


            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getFormFileFieldItemAccess().getCommercialAtKeyword_1());
            		
            // InternalCurlBetterThanHttpie.g:1504:3: ( ( (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP ) ) )
            // InternalCurlBetterThanHttpie.g:1505:4: ( (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP ) )
            {
            // InternalCurlBetterThanHttpie.g:1505:4: ( (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP ) )
            // InternalCurlBetterThanHttpie.g:1506:5: (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP )
            {
            // InternalCurlBetterThanHttpie.g:1506:5: (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID) ) {
                alt44=1;
            }
            else if ( (LA44_0==RULE_HTTP) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1507:6: lv_value_2_1= RULE_ID
                    {
                    lv_value_2_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_value_2_1, grammarAccess.getFormFileFieldItemAccess().getValueIDTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFormFileFieldItemRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_2_1,
                    							"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.ID");
                    					

                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:1522:6: lv_value_2_2= RULE_HTTP
                    {
                    lv_value_2_2=(Token)match(input,RULE_HTTP,FOLLOW_2); 

                    						newLeafNode(lv_value_2_2, grammarAccess.getFormFileFieldItemAccess().getValueHTTPTerminalRuleCall_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFormFileFieldItemRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_2_2,
                    							"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.HTTP");
                    					

                    }
                    break;

            }


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
    // InternalCurlBetterThanHttpie.g:1543:1: entryRuleDataFieldItem returns [EObject current=null] : iv_ruleDataFieldItem= ruleDataFieldItem EOF ;
    public final EObject entryRuleDataFieldItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataFieldItem = null;


        try {
            // InternalCurlBetterThanHttpie.g:1543:54: (iv_ruleDataFieldItem= ruleDataFieldItem EOF )
            // InternalCurlBetterThanHttpie.g:1544:2: iv_ruleDataFieldItem= ruleDataFieldItem EOF
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
    // InternalCurlBetterThanHttpie.g:1550:1: ruleDataFieldItem returns [EObject current=null] : ( ( ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) ) ) otherlv_1= '=' ( ( ( (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP ) ) ) | (otherlv_3= '@' ( (lv_value_4_0= RULE_URL ) ) ) ) ) ;
    public final EObject ruleDataFieldItem() throws RecognitionException {
        EObject current = null;

        Token lv_field_0_1=null;
        Token lv_field_0_2=null;
        Token otherlv_1=null;
        Token lv_value_2_1=null;
        Token lv_value_2_2=null;
        Token otherlv_3=null;
        Token lv_value_4_0=null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:1556:2: ( ( ( ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) ) ) otherlv_1= '=' ( ( ( (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP ) ) ) | (otherlv_3= '@' ( (lv_value_4_0= RULE_URL ) ) ) ) ) )
            // InternalCurlBetterThanHttpie.g:1557:2: ( ( ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) ) ) otherlv_1= '=' ( ( ( (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP ) ) ) | (otherlv_3= '@' ( (lv_value_4_0= RULE_URL ) ) ) ) )
            {
            // InternalCurlBetterThanHttpie.g:1557:2: ( ( ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) ) ) otherlv_1= '=' ( ( ( (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP ) ) ) | (otherlv_3= '@' ( (lv_value_4_0= RULE_URL ) ) ) ) )
            // InternalCurlBetterThanHttpie.g:1558:3: ( ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) ) ) otherlv_1= '=' ( ( ( (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP ) ) ) | (otherlv_3= '@' ( (lv_value_4_0= RULE_URL ) ) ) )
            {
            // InternalCurlBetterThanHttpie.g:1558:3: ( ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) ) )
            // InternalCurlBetterThanHttpie.g:1559:4: ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) )
            {
            // InternalCurlBetterThanHttpie.g:1559:4: ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) )
            // InternalCurlBetterThanHttpie.g:1560:5: (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP )
            {
            // InternalCurlBetterThanHttpie.g:1560:5: (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ID) ) {
                alt45=1;
            }
            else if ( (LA45_0==RULE_HTTP) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1561:6: lv_field_0_1= RULE_ID
                    {
                    lv_field_0_1=(Token)match(input,RULE_ID,FOLLOW_24); 

                    						newLeafNode(lv_field_0_1, grammarAccess.getDataFieldItemAccess().getFieldIDTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDataFieldItemRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"field",
                    							lv_field_0_1,
                    							"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.ID");
                    					

                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:1576:6: lv_field_0_2= RULE_HTTP
                    {
                    lv_field_0_2=(Token)match(input,RULE_HTTP,FOLLOW_24); 

                    						newLeafNode(lv_field_0_2, grammarAccess.getDataFieldItemAccess().getFieldHTTPTerminalRuleCall_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDataFieldItemRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"field",
                    							lv_field_0_2,
                    							"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.HTTP");
                    					

                    }
                    break;

            }


            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getDataFieldItemAccess().getEqualsSignKeyword_1());
            		
            // InternalCurlBetterThanHttpie.g:1597:3: ( ( ( (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP ) ) ) | (otherlv_3= '@' ( (lv_value_4_0= RULE_URL ) ) ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_HTTP||LA47_0==RULE_ID) ) {
                alt47=1;
            }
            else if ( (LA47_0==29) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1598:4: ( ( (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP ) ) )
                    {
                    // InternalCurlBetterThanHttpie.g:1598:4: ( ( (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP ) ) )
                    // InternalCurlBetterThanHttpie.g:1599:5: ( (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP ) )
                    {
                    // InternalCurlBetterThanHttpie.g:1599:5: ( (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP ) )
                    // InternalCurlBetterThanHttpie.g:1600:6: (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP )
                    {
                    // InternalCurlBetterThanHttpie.g:1600:6: (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP )
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==RULE_ID) ) {
                        alt46=1;
                    }
                    else if ( (LA46_0==RULE_HTTP) ) {
                        alt46=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 46, 0, input);

                        throw nvae;
                    }
                    switch (alt46) {
                        case 1 :
                            // InternalCurlBetterThanHttpie.g:1601:7: lv_value_2_1= RULE_ID
                            {
                            lv_value_2_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                            							newLeafNode(lv_value_2_1, grammarAccess.getDataFieldItemAccess().getValueIDTerminalRuleCall_2_0_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getDataFieldItemRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"value",
                            								lv_value_2_1,
                            								"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.ID");
                            						

                            }
                            break;
                        case 2 :
                            // InternalCurlBetterThanHttpie.g:1616:7: lv_value_2_2= RULE_HTTP
                            {
                            lv_value_2_2=(Token)match(input,RULE_HTTP,FOLLOW_2); 

                            							newLeafNode(lv_value_2_2, grammarAccess.getDataFieldItemAccess().getValueHTTPTerminalRuleCall_2_0_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getDataFieldItemRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"value",
                            								lv_value_2_2,
                            								"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.HTTP");
                            						

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:1634:4: (otherlv_3= '@' ( (lv_value_4_0= RULE_URL ) ) )
                    {
                    // InternalCurlBetterThanHttpie.g:1634:4: (otherlv_3= '@' ( (lv_value_4_0= RULE_URL ) ) )
                    // InternalCurlBetterThanHttpie.g:1635:5: otherlv_3= '@' ( (lv_value_4_0= RULE_URL ) )
                    {
                    otherlv_3=(Token)match(input,29,FOLLOW_26); 

                    					newLeafNode(otherlv_3, grammarAccess.getDataFieldItemAccess().getCommercialAtKeyword_2_1_0());
                    				
                    // InternalCurlBetterThanHttpie.g:1639:5: ( (lv_value_4_0= RULE_URL ) )
                    // InternalCurlBetterThanHttpie.g:1640:6: (lv_value_4_0= RULE_URL )
                    {
                    // InternalCurlBetterThanHttpie.g:1640:6: (lv_value_4_0= RULE_URL )
                    // InternalCurlBetterThanHttpie.g:1641:7: lv_value_4_0= RULE_URL
                    {
                    lv_value_4_0=(Token)match(input,RULE_URL,FOLLOW_2); 

                    							newLeafNode(lv_value_4_0, grammarAccess.getDataFieldItemAccess().getValueURLTerminalRuleCall_2_1_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getDataFieldItemRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"value",
                    								lv_value_4_0,
                    								"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.URL");
                    						

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


    // $ANTLR start "entryRuleUrlParameterItem"
    // InternalCurlBetterThanHttpie.g:1663:1: entryRuleUrlParameterItem returns [EObject current=null] : iv_ruleUrlParameterItem= ruleUrlParameterItem EOF ;
    public final EObject entryRuleUrlParameterItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUrlParameterItem = null;


        try {
            // InternalCurlBetterThanHttpie.g:1663:57: (iv_ruleUrlParameterItem= ruleUrlParameterItem EOF )
            // InternalCurlBetterThanHttpie.g:1664:2: iv_ruleUrlParameterItem= ruleUrlParameterItem EOF
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
    // InternalCurlBetterThanHttpie.g:1670:1: ruleUrlParameterItem returns [EObject current=null] : ( ( ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) ) ) otherlv_1= '==' ( ( (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP ) ) ) ) ;
    public final EObject ruleUrlParameterItem() throws RecognitionException {
        EObject current = null;

        Token lv_field_0_1=null;
        Token lv_field_0_2=null;
        Token otherlv_1=null;
        Token lv_value_2_1=null;
        Token lv_value_2_2=null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:1676:2: ( ( ( ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) ) ) otherlv_1= '==' ( ( (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP ) ) ) ) )
            // InternalCurlBetterThanHttpie.g:1677:2: ( ( ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) ) ) otherlv_1= '==' ( ( (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP ) ) ) )
            {
            // InternalCurlBetterThanHttpie.g:1677:2: ( ( ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) ) ) otherlv_1= '==' ( ( (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP ) ) ) )
            // InternalCurlBetterThanHttpie.g:1678:3: ( ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) ) ) otherlv_1= '==' ( ( (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP ) ) )
            {
            // InternalCurlBetterThanHttpie.g:1678:3: ( ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) ) )
            // InternalCurlBetterThanHttpie.g:1679:4: ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) )
            {
            // InternalCurlBetterThanHttpie.g:1679:4: ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) )
            // InternalCurlBetterThanHttpie.g:1680:5: (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP )
            {
            // InternalCurlBetterThanHttpie.g:1680:5: (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_ID) ) {
                alt48=1;
            }
            else if ( (LA48_0==RULE_HTTP) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1681:6: lv_field_0_1= RULE_ID
                    {
                    lv_field_0_1=(Token)match(input,RULE_ID,FOLLOW_27); 

                    						newLeafNode(lv_field_0_1, grammarAccess.getUrlParameterItemAccess().getFieldIDTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUrlParameterItemRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"field",
                    							lv_field_0_1,
                    							"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.ID");
                    					

                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:1696:6: lv_field_0_2= RULE_HTTP
                    {
                    lv_field_0_2=(Token)match(input,RULE_HTTP,FOLLOW_27); 

                    						newLeafNode(lv_field_0_2, grammarAccess.getUrlParameterItemAccess().getFieldHTTPTerminalRuleCall_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUrlParameterItemRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"field",
                    							lv_field_0_2,
                    							"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.HTTP");
                    					

                    }
                    break;

            }


            }


            }

            otherlv_1=(Token)match(input,40,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getUrlParameterItemAccess().getEqualsSignEqualsSignKeyword_1());
            		
            // InternalCurlBetterThanHttpie.g:1717:3: ( ( (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP ) ) )
            // InternalCurlBetterThanHttpie.g:1718:4: ( (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP ) )
            {
            // InternalCurlBetterThanHttpie.g:1718:4: ( (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP ) )
            // InternalCurlBetterThanHttpie.g:1719:5: (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP )
            {
            // InternalCurlBetterThanHttpie.g:1719:5: (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_ID) ) {
                alt49=1;
            }
            else if ( (LA49_0==RULE_HTTP) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1720:6: lv_value_2_1= RULE_ID
                    {
                    lv_value_2_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_value_2_1, grammarAccess.getUrlParameterItemAccess().getValueIDTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUrlParameterItemRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_2_1,
                    							"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.ID");
                    					

                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:1735:6: lv_value_2_2= RULE_HTTP
                    {
                    lv_value_2_2=(Token)match(input,RULE_HTTP,FOLLOW_2); 

                    						newLeafNode(lv_value_2_2, grammarAccess.getUrlParameterItemAccess().getValueHTTPTerminalRuleCall_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUrlParameterItemRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_2_2,
                    							"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.HTTP");
                    					

                    }
                    break;

            }


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
    // InternalCurlBetterThanHttpie.g:1756:1: entryRuleRawJsonFieldItem returns [EObject current=null] : iv_ruleRawJsonFieldItem= ruleRawJsonFieldItem EOF ;
    public final EObject entryRuleRawJsonFieldItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRawJsonFieldItem = null;


        try {
            // InternalCurlBetterThanHttpie.g:1756:57: (iv_ruleRawJsonFieldItem= ruleRawJsonFieldItem EOF )
            // InternalCurlBetterThanHttpie.g:1757:2: iv_ruleRawJsonFieldItem= ruleRawJsonFieldItem EOF
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
    // InternalCurlBetterThanHttpie.g:1763:1: ruleRawJsonFieldItem returns [EObject current=null] : ( ( ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) ) ) otherlv_1= ':=' ( ( (lv_value_2_0= ruleJsonType ) ) | (otherlv_3= '@' ( (lv_value_4_0= ruleJsonString ) ) ) ) ) ;
    public final EObject ruleRawJsonFieldItem() throws RecognitionException {
        EObject current = null;

        Token lv_field_0_1=null;
        Token lv_field_0_2=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_value_2_0 = null;

        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:1769:2: ( ( ( ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) ) ) otherlv_1= ':=' ( ( (lv_value_2_0= ruleJsonType ) ) | (otherlv_3= '@' ( (lv_value_4_0= ruleJsonString ) ) ) ) ) )
            // InternalCurlBetterThanHttpie.g:1770:2: ( ( ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) ) ) otherlv_1= ':=' ( ( (lv_value_2_0= ruleJsonType ) ) | (otherlv_3= '@' ( (lv_value_4_0= ruleJsonString ) ) ) ) )
            {
            // InternalCurlBetterThanHttpie.g:1770:2: ( ( ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) ) ) otherlv_1= ':=' ( ( (lv_value_2_0= ruleJsonType ) ) | (otherlv_3= '@' ( (lv_value_4_0= ruleJsonString ) ) ) ) )
            // InternalCurlBetterThanHttpie.g:1771:3: ( ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) ) ) otherlv_1= ':=' ( ( (lv_value_2_0= ruleJsonType ) ) | (otherlv_3= '@' ( (lv_value_4_0= ruleJsonString ) ) ) )
            {
            // InternalCurlBetterThanHttpie.g:1771:3: ( ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) ) )
            // InternalCurlBetterThanHttpie.g:1772:4: ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) )
            {
            // InternalCurlBetterThanHttpie.g:1772:4: ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) )
            // InternalCurlBetterThanHttpie.g:1773:5: (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP )
            {
            // InternalCurlBetterThanHttpie.g:1773:5: (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_ID) ) {
                alt50=1;
            }
            else if ( (LA50_0==RULE_HTTP) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1774:6: lv_field_0_1= RULE_ID
                    {
                    lv_field_0_1=(Token)match(input,RULE_ID,FOLLOW_28); 

                    						newLeafNode(lv_field_0_1, grammarAccess.getRawJsonFieldItemAccess().getFieldIDTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRawJsonFieldItemRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"field",
                    							lv_field_0_1,
                    							"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.ID");
                    					

                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:1789:6: lv_field_0_2= RULE_HTTP
                    {
                    lv_field_0_2=(Token)match(input,RULE_HTTP,FOLLOW_28); 

                    						newLeafNode(lv_field_0_2, grammarAccess.getRawJsonFieldItemAccess().getFieldHTTPTerminalRuleCall_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRawJsonFieldItemRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"field",
                    							lv_field_0_2,
                    							"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.HTTP");
                    					

                    }
                    break;

            }


            }


            }

            otherlv_1=(Token)match(input,41,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getRawJsonFieldItemAccess().getColonEqualsSignKeyword_1());
            		
            // InternalCurlBetterThanHttpie.g:1810:3: ( ( (lv_value_2_0= ruleJsonType ) ) | (otherlv_3= '@' ( (lv_value_4_0= ruleJsonString ) ) ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_HTTP||LA51_0==RULE_ID||(LA51_0>=RULE_BOOLEAN && LA51_0<=RULE_NUMBER)||(LA51_0>=42 && LA51_0<=44)||LA51_0==47) ) {
                alt51=1;
            }
            else if ( (LA51_0==29) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1811:4: ( (lv_value_2_0= ruleJsonType ) )
                    {
                    // InternalCurlBetterThanHttpie.g:1811:4: ( (lv_value_2_0= ruleJsonType ) )
                    // InternalCurlBetterThanHttpie.g:1812:5: (lv_value_2_0= ruleJsonType )
                    {
                    // InternalCurlBetterThanHttpie.g:1812:5: (lv_value_2_0= ruleJsonType )
                    // InternalCurlBetterThanHttpie.g:1813:6: lv_value_2_0= ruleJsonType
                    {

                    						newCompositeNode(grammarAccess.getRawJsonFieldItemAccess().getValueJsonTypeParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_2_0=ruleJsonType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRawJsonFieldItemRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_2_0,
                    							"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.JsonType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:1831:4: (otherlv_3= '@' ( (lv_value_4_0= ruleJsonString ) ) )
                    {
                    // InternalCurlBetterThanHttpie.g:1831:4: (otherlv_3= '@' ( (lv_value_4_0= ruleJsonString ) ) )
                    // InternalCurlBetterThanHttpie.g:1832:5: otherlv_3= '@' ( (lv_value_4_0= ruleJsonString ) )
                    {
                    otherlv_3=(Token)match(input,29,FOLLOW_30); 

                    					newLeafNode(otherlv_3, grammarAccess.getRawJsonFieldItemAccess().getCommercialAtKeyword_2_1_0());
                    				
                    // InternalCurlBetterThanHttpie.g:1836:5: ( (lv_value_4_0= ruleJsonString ) )
                    // InternalCurlBetterThanHttpie.g:1837:6: (lv_value_4_0= ruleJsonString )
                    {
                    // InternalCurlBetterThanHttpie.g:1837:6: (lv_value_4_0= ruleJsonString )
                    // InternalCurlBetterThanHttpie.g:1838:7: lv_value_4_0= ruleJsonString
                    {

                    							newCompositeNode(grammarAccess.getRawJsonFieldItemAccess().getValueJsonStringParserRuleCall_2_1_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_value_4_0=ruleJsonString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getRawJsonFieldItemRule());
                    							}
                    							set(
                    								current,
                    								"value",
                    								lv_value_4_0,
                    								"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.JsonString");
                    							afterParserOrEnumRuleCall();
                    						

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
    // $ANTLR end "ruleRawJsonFieldItem"


    // $ANTLR start "entryRuleMember"
    // InternalCurlBetterThanHttpie.g:1861:1: entryRuleMember returns [EObject current=null] : iv_ruleMember= ruleMember EOF ;
    public final EObject entryRuleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMember = null;


        try {
            // InternalCurlBetterThanHttpie.g:1861:47: (iv_ruleMember= ruleMember EOF )
            // InternalCurlBetterThanHttpie.g:1862:2: iv_ruleMember= ruleMember EOF
            {
             newCompositeNode(grammarAccess.getMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMember=ruleMember();

            state._fsp--;

             current =iv_ruleMember; 
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
    // $ANTLR end "entryRuleMember"


    // $ANTLR start "ruleMember"
    // InternalCurlBetterThanHttpie.g:1868:1: ruleMember returns [EObject current=null] : ( ( (otherlv_0= '\"' ( ( (lv_key_1_1= RULE_ID | lv_key_1_2= RULE_HTTP ) ) ) otherlv_2= '\"' ) | (otherlv_3= '\\'' ( ( (lv_key_4_1= RULE_ID | lv_key_4_2= RULE_HTTP ) ) ) otherlv_5= '\\'' ) | ( ( (lv_key_6_1= RULE_ID | lv_key_6_2= RULE_HTTP ) ) ) ) (this_WS_7= RULE_WS )? otherlv_8= ':' (this_WS_9= RULE_WS )? ( (lv_value_10_0= ruleJsonType ) ) ) ;
    public final EObject ruleMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_key_1_1=null;
        Token lv_key_1_2=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_key_4_1=null;
        Token lv_key_4_2=null;
        Token otherlv_5=null;
        Token lv_key_6_1=null;
        Token lv_key_6_2=null;
        Token this_WS_7=null;
        Token otherlv_8=null;
        Token this_WS_9=null;
        EObject lv_value_10_0 = null;



        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:1874:2: ( ( ( (otherlv_0= '\"' ( ( (lv_key_1_1= RULE_ID | lv_key_1_2= RULE_HTTP ) ) ) otherlv_2= '\"' ) | (otherlv_3= '\\'' ( ( (lv_key_4_1= RULE_ID | lv_key_4_2= RULE_HTTP ) ) ) otherlv_5= '\\'' ) | ( ( (lv_key_6_1= RULE_ID | lv_key_6_2= RULE_HTTP ) ) ) ) (this_WS_7= RULE_WS )? otherlv_8= ':' (this_WS_9= RULE_WS )? ( (lv_value_10_0= ruleJsonType ) ) ) )
            // InternalCurlBetterThanHttpie.g:1875:2: ( ( (otherlv_0= '\"' ( ( (lv_key_1_1= RULE_ID | lv_key_1_2= RULE_HTTP ) ) ) otherlv_2= '\"' ) | (otherlv_3= '\\'' ( ( (lv_key_4_1= RULE_ID | lv_key_4_2= RULE_HTTP ) ) ) otherlv_5= '\\'' ) | ( ( (lv_key_6_1= RULE_ID | lv_key_6_2= RULE_HTTP ) ) ) ) (this_WS_7= RULE_WS )? otherlv_8= ':' (this_WS_9= RULE_WS )? ( (lv_value_10_0= ruleJsonType ) ) )
            {
            // InternalCurlBetterThanHttpie.g:1875:2: ( ( (otherlv_0= '\"' ( ( (lv_key_1_1= RULE_ID | lv_key_1_2= RULE_HTTP ) ) ) otherlv_2= '\"' ) | (otherlv_3= '\\'' ( ( (lv_key_4_1= RULE_ID | lv_key_4_2= RULE_HTTP ) ) ) otherlv_5= '\\'' ) | ( ( (lv_key_6_1= RULE_ID | lv_key_6_2= RULE_HTTP ) ) ) ) (this_WS_7= RULE_WS )? otherlv_8= ':' (this_WS_9= RULE_WS )? ( (lv_value_10_0= ruleJsonType ) ) )
            // InternalCurlBetterThanHttpie.g:1876:3: ( (otherlv_0= '\"' ( ( (lv_key_1_1= RULE_ID | lv_key_1_2= RULE_HTTP ) ) ) otherlv_2= '\"' ) | (otherlv_3= '\\'' ( ( (lv_key_4_1= RULE_ID | lv_key_4_2= RULE_HTTP ) ) ) otherlv_5= '\\'' ) | ( ( (lv_key_6_1= RULE_ID | lv_key_6_2= RULE_HTTP ) ) ) ) (this_WS_7= RULE_WS )? otherlv_8= ':' (this_WS_9= RULE_WS )? ( (lv_value_10_0= ruleJsonType ) )
            {
            // InternalCurlBetterThanHttpie.g:1876:3: ( (otherlv_0= '\"' ( ( (lv_key_1_1= RULE_ID | lv_key_1_2= RULE_HTTP ) ) ) otherlv_2= '\"' ) | (otherlv_3= '\\'' ( ( (lv_key_4_1= RULE_ID | lv_key_4_2= RULE_HTTP ) ) ) otherlv_5= '\\'' ) | ( ( (lv_key_6_1= RULE_ID | lv_key_6_2= RULE_HTTP ) ) ) )
            int alt55=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt55=1;
                }
                break;
            case 43:
                {
                alt55=2;
                }
                break;
            case RULE_HTTP:
            case RULE_ID:
                {
                alt55=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1877:4: (otherlv_0= '\"' ( ( (lv_key_1_1= RULE_ID | lv_key_1_2= RULE_HTTP ) ) ) otherlv_2= '\"' )
                    {
                    // InternalCurlBetterThanHttpie.g:1877:4: (otherlv_0= '\"' ( ( (lv_key_1_1= RULE_ID | lv_key_1_2= RULE_HTTP ) ) ) otherlv_2= '\"' )
                    // InternalCurlBetterThanHttpie.g:1878:5: otherlv_0= '\"' ( ( (lv_key_1_1= RULE_ID | lv_key_1_2= RULE_HTTP ) ) ) otherlv_2= '\"'
                    {
                    otherlv_0=(Token)match(input,42,FOLLOW_13); 

                    					newLeafNode(otherlv_0, grammarAccess.getMemberAccess().getQuotationMarkKeyword_0_0_0());
                    				
                    // InternalCurlBetterThanHttpie.g:1882:5: ( ( (lv_key_1_1= RULE_ID | lv_key_1_2= RULE_HTTP ) ) )
                    // InternalCurlBetterThanHttpie.g:1883:6: ( (lv_key_1_1= RULE_ID | lv_key_1_2= RULE_HTTP ) )
                    {
                    // InternalCurlBetterThanHttpie.g:1883:6: ( (lv_key_1_1= RULE_ID | lv_key_1_2= RULE_HTTP ) )
                    // InternalCurlBetterThanHttpie.g:1884:7: (lv_key_1_1= RULE_ID | lv_key_1_2= RULE_HTTP )
                    {
                    // InternalCurlBetterThanHttpie.g:1884:7: (lv_key_1_1= RULE_ID | lv_key_1_2= RULE_HTTP )
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==RULE_ID) ) {
                        alt52=1;
                    }
                    else if ( (LA52_0==RULE_HTTP) ) {
                        alt52=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 52, 0, input);

                        throw nvae;
                    }
                    switch (alt52) {
                        case 1 :
                            // InternalCurlBetterThanHttpie.g:1885:8: lv_key_1_1= RULE_ID
                            {
                            lv_key_1_1=(Token)match(input,RULE_ID,FOLLOW_31); 

                            								newLeafNode(lv_key_1_1, grammarAccess.getMemberAccess().getKeyIDTerminalRuleCall_0_0_1_0_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getMemberRule());
                            								}
                            								setWithLastConsumed(
                            									current,
                            									"key",
                            									lv_key_1_1,
                            									"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.ID");
                            							

                            }
                            break;
                        case 2 :
                            // InternalCurlBetterThanHttpie.g:1900:8: lv_key_1_2= RULE_HTTP
                            {
                            lv_key_1_2=(Token)match(input,RULE_HTTP,FOLLOW_31); 

                            								newLeafNode(lv_key_1_2, grammarAccess.getMemberAccess().getKeyHTTPTerminalRuleCall_0_0_1_0_1());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getMemberRule());
                            								}
                            								setWithLastConsumed(
                            									current,
                            									"key",
                            									lv_key_1_2,
                            									"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.HTTP");
                            							

                            }
                            break;

                    }


                    }


                    }

                    otherlv_2=(Token)match(input,42,FOLLOW_32); 

                    					newLeafNode(otherlv_2, grammarAccess.getMemberAccess().getQuotationMarkKeyword_0_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:1923:4: (otherlv_3= '\\'' ( ( (lv_key_4_1= RULE_ID | lv_key_4_2= RULE_HTTP ) ) ) otherlv_5= '\\'' )
                    {
                    // InternalCurlBetterThanHttpie.g:1923:4: (otherlv_3= '\\'' ( ( (lv_key_4_1= RULE_ID | lv_key_4_2= RULE_HTTP ) ) ) otherlv_5= '\\'' )
                    // InternalCurlBetterThanHttpie.g:1924:5: otherlv_3= '\\'' ( ( (lv_key_4_1= RULE_ID | lv_key_4_2= RULE_HTTP ) ) ) otherlv_5= '\\''
                    {
                    otherlv_3=(Token)match(input,43,FOLLOW_13); 

                    					newLeafNode(otherlv_3, grammarAccess.getMemberAccess().getApostropheKeyword_0_1_0());
                    				
                    // InternalCurlBetterThanHttpie.g:1928:5: ( ( (lv_key_4_1= RULE_ID | lv_key_4_2= RULE_HTTP ) ) )
                    // InternalCurlBetterThanHttpie.g:1929:6: ( (lv_key_4_1= RULE_ID | lv_key_4_2= RULE_HTTP ) )
                    {
                    // InternalCurlBetterThanHttpie.g:1929:6: ( (lv_key_4_1= RULE_ID | lv_key_4_2= RULE_HTTP ) )
                    // InternalCurlBetterThanHttpie.g:1930:7: (lv_key_4_1= RULE_ID | lv_key_4_2= RULE_HTTP )
                    {
                    // InternalCurlBetterThanHttpie.g:1930:7: (lv_key_4_1= RULE_ID | lv_key_4_2= RULE_HTTP )
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==RULE_ID) ) {
                        alt53=1;
                    }
                    else if ( (LA53_0==RULE_HTTP) ) {
                        alt53=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 53, 0, input);

                        throw nvae;
                    }
                    switch (alt53) {
                        case 1 :
                            // InternalCurlBetterThanHttpie.g:1931:8: lv_key_4_1= RULE_ID
                            {
                            lv_key_4_1=(Token)match(input,RULE_ID,FOLLOW_33); 

                            								newLeafNode(lv_key_4_1, grammarAccess.getMemberAccess().getKeyIDTerminalRuleCall_0_1_1_0_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getMemberRule());
                            								}
                            								setWithLastConsumed(
                            									current,
                            									"key",
                            									lv_key_4_1,
                            									"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.ID");
                            							

                            }
                            break;
                        case 2 :
                            // InternalCurlBetterThanHttpie.g:1946:8: lv_key_4_2= RULE_HTTP
                            {
                            lv_key_4_2=(Token)match(input,RULE_HTTP,FOLLOW_33); 

                            								newLeafNode(lv_key_4_2, grammarAccess.getMemberAccess().getKeyHTTPTerminalRuleCall_0_1_1_0_1());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getMemberRule());
                            								}
                            								setWithLastConsumed(
                            									current,
                            									"key",
                            									lv_key_4_2,
                            									"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.HTTP");
                            							

                            }
                            break;

                    }


                    }


                    }

                    otherlv_5=(Token)match(input,43,FOLLOW_32); 

                    					newLeafNode(otherlv_5, grammarAccess.getMemberAccess().getApostropheKeyword_0_1_2());
                    				

                    }


                    }
                    break;
                case 3 :
                    // InternalCurlBetterThanHttpie.g:1969:4: ( ( (lv_key_6_1= RULE_ID | lv_key_6_2= RULE_HTTP ) ) )
                    {
                    // InternalCurlBetterThanHttpie.g:1969:4: ( ( (lv_key_6_1= RULE_ID | lv_key_6_2= RULE_HTTP ) ) )
                    // InternalCurlBetterThanHttpie.g:1970:5: ( (lv_key_6_1= RULE_ID | lv_key_6_2= RULE_HTTP ) )
                    {
                    // InternalCurlBetterThanHttpie.g:1970:5: ( (lv_key_6_1= RULE_ID | lv_key_6_2= RULE_HTTP ) )
                    // InternalCurlBetterThanHttpie.g:1971:6: (lv_key_6_1= RULE_ID | lv_key_6_2= RULE_HTTP )
                    {
                    // InternalCurlBetterThanHttpie.g:1971:6: (lv_key_6_1= RULE_ID | lv_key_6_2= RULE_HTTP )
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==RULE_ID) ) {
                        alt54=1;
                    }
                    else if ( (LA54_0==RULE_HTTP) ) {
                        alt54=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 54, 0, input);

                        throw nvae;
                    }
                    switch (alt54) {
                        case 1 :
                            // InternalCurlBetterThanHttpie.g:1972:7: lv_key_6_1= RULE_ID
                            {
                            lv_key_6_1=(Token)match(input,RULE_ID,FOLLOW_32); 

                            							newLeafNode(lv_key_6_1, grammarAccess.getMemberAccess().getKeyIDTerminalRuleCall_0_2_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMemberRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"key",
                            								lv_key_6_1,
                            								"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.ID");
                            						

                            }
                            break;
                        case 2 :
                            // InternalCurlBetterThanHttpie.g:1987:7: lv_key_6_2= RULE_HTTP
                            {
                            lv_key_6_2=(Token)match(input,RULE_HTTP,FOLLOW_32); 

                            							newLeafNode(lv_key_6_2, grammarAccess.getMemberAccess().getKeyHTTPTerminalRuleCall_0_2_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMemberRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"key",
                            								lv_key_6_2,
                            								"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.HTTP");
                            						

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalCurlBetterThanHttpie.g:2005:3: (this_WS_7= RULE_WS )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_WS) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:2006:4: this_WS_7= RULE_WS
                    {
                    this_WS_7=(Token)match(input,RULE_WS,FOLLOW_17); 

                    				newLeafNode(this_WS_7, grammarAccess.getMemberAccess().getWSTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,16,FOLLOW_34); 

            			newLeafNode(otherlv_8, grammarAccess.getMemberAccess().getColonKeyword_2());
            		
            // InternalCurlBetterThanHttpie.g:2015:3: (this_WS_9= RULE_WS )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_WS) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:2016:4: this_WS_9= RULE_WS
                    {
                    this_WS_9=(Token)match(input,RULE_WS,FOLLOW_35); 

                    				newLeafNode(this_WS_9, grammarAccess.getMemberAccess().getWSTerminalRuleCall_3());
                    			

                    }
                    break;

            }

            // InternalCurlBetterThanHttpie.g:2021:3: ( (lv_value_10_0= ruleJsonType ) )
            // InternalCurlBetterThanHttpie.g:2022:4: (lv_value_10_0= ruleJsonType )
            {
            // InternalCurlBetterThanHttpie.g:2022:4: (lv_value_10_0= ruleJsonType )
            // InternalCurlBetterThanHttpie.g:2023:5: lv_value_10_0= ruleJsonType
            {

            					newCompositeNode(grammarAccess.getMemberAccess().getValueJsonTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_10_0=ruleJsonType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMemberRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_10_0,
            						"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.JsonType");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleMember"


    // $ANTLR start "entryRuleJsonType"
    // InternalCurlBetterThanHttpie.g:2044:1: entryRuleJsonType returns [EObject current=null] : iv_ruleJsonType= ruleJsonType EOF ;
    public final EObject entryRuleJsonType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonType = null;


        try {
            // InternalCurlBetterThanHttpie.g:2044:49: (iv_ruleJsonType= ruleJsonType EOF )
            // InternalCurlBetterThanHttpie.g:2045:2: iv_ruleJsonType= ruleJsonType EOF
            {
             newCompositeNode(grammarAccess.getJsonTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJsonType=ruleJsonType();

            state._fsp--;

             current =iv_ruleJsonType; 
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
    // $ANTLR end "entryRuleJsonType"


    // $ANTLR start "ruleJsonType"
    // InternalCurlBetterThanHttpie.g:2051:1: ruleJsonType returns [EObject current=null] : (this_JsonObject_0= ruleJsonObject | this_JsonString_1= ruleJsonString | this_JsonArray_2= ruleJsonArray | this_JsonBoolean_3= ruleJsonBoolean | this_JsonNull_4= ruleJsonNull | this_JsonNumber_5= ruleJsonNumber ) ;
    public final EObject ruleJsonType() throws RecognitionException {
        EObject current = null;

        EObject this_JsonObject_0 = null;

        EObject this_JsonString_1 = null;

        EObject this_JsonArray_2 = null;

        EObject this_JsonBoolean_3 = null;

        EObject this_JsonNull_4 = null;

        EObject this_JsonNumber_5 = null;



        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:2057:2: ( (this_JsonObject_0= ruleJsonObject | this_JsonString_1= ruleJsonString | this_JsonArray_2= ruleJsonArray | this_JsonBoolean_3= ruleJsonBoolean | this_JsonNull_4= ruleJsonNull | this_JsonNumber_5= ruleJsonNumber ) )
            // InternalCurlBetterThanHttpie.g:2058:2: (this_JsonObject_0= ruleJsonObject | this_JsonString_1= ruleJsonString | this_JsonArray_2= ruleJsonArray | this_JsonBoolean_3= ruleJsonBoolean | this_JsonNull_4= ruleJsonNull | this_JsonNumber_5= ruleJsonNumber )
            {
            // InternalCurlBetterThanHttpie.g:2058:2: (this_JsonObject_0= ruleJsonObject | this_JsonString_1= ruleJsonString | this_JsonArray_2= ruleJsonArray | this_JsonBoolean_3= ruleJsonBoolean | this_JsonNull_4= ruleJsonNull | this_JsonNumber_5= ruleJsonNumber )
            int alt58=6;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt58=1;
                }
                break;
            case RULE_HTTP:
            case RULE_ID:
            case 42:
            case 43:
                {
                alt58=2;
                }
                break;
            case 47:
                {
                alt58=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt58=4;
                }
                break;
            case RULE_NULL:
                {
                alt58=5;
                }
                break;
            case RULE_NUMBER:
                {
                alt58=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:2059:3: this_JsonObject_0= ruleJsonObject
                    {

                    			newCompositeNode(grammarAccess.getJsonTypeAccess().getJsonObjectParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_JsonObject_0=ruleJsonObject();

                    state._fsp--;


                    			current = this_JsonObject_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:2068:3: this_JsonString_1= ruleJsonString
                    {

                    			newCompositeNode(grammarAccess.getJsonTypeAccess().getJsonStringParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_JsonString_1=ruleJsonString();

                    state._fsp--;


                    			current = this_JsonString_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalCurlBetterThanHttpie.g:2077:3: this_JsonArray_2= ruleJsonArray
                    {

                    			newCompositeNode(grammarAccess.getJsonTypeAccess().getJsonArrayParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_JsonArray_2=ruleJsonArray();

                    state._fsp--;


                    			current = this_JsonArray_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalCurlBetterThanHttpie.g:2086:3: this_JsonBoolean_3= ruleJsonBoolean
                    {

                    			newCompositeNode(grammarAccess.getJsonTypeAccess().getJsonBooleanParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_JsonBoolean_3=ruleJsonBoolean();

                    state._fsp--;


                    			current = this_JsonBoolean_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalCurlBetterThanHttpie.g:2095:3: this_JsonNull_4= ruleJsonNull
                    {

                    			newCompositeNode(grammarAccess.getJsonTypeAccess().getJsonNullParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_JsonNull_4=ruleJsonNull();

                    state._fsp--;


                    			current = this_JsonNull_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalCurlBetterThanHttpie.g:2104:3: this_JsonNumber_5= ruleJsonNumber
                    {

                    			newCompositeNode(grammarAccess.getJsonTypeAccess().getJsonNumberParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_JsonNumber_5=ruleJsonNumber();

                    state._fsp--;


                    			current = this_JsonNumber_5;
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
    // $ANTLR end "ruleJsonType"


    // $ANTLR start "entryRuleJsonObject"
    // InternalCurlBetterThanHttpie.g:2116:1: entryRuleJsonObject returns [EObject current=null] : iv_ruleJsonObject= ruleJsonObject EOF ;
    public final EObject entryRuleJsonObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonObject = null;


        try {
            // InternalCurlBetterThanHttpie.g:2116:51: (iv_ruleJsonObject= ruleJsonObject EOF )
            // InternalCurlBetterThanHttpie.g:2117:2: iv_ruleJsonObject= ruleJsonObject EOF
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
    // InternalCurlBetterThanHttpie.g:2123:1: ruleJsonObject returns [EObject current=null] : ( () otherlv_1= '{' ( ( (this_WS_2= RULE_WS )? ( (lv_members_3_0= ruleMember ) ) ) ( (this_WS_4= RULE_WS )? otherlv_5= ',' (this_WS_6= RULE_WS )? ( (lv_members_7_0= ruleMember ) ) )* (this_WS_8= RULE_WS )? )? otherlv_9= '}' ) ;
    public final EObject ruleJsonObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_WS_2=null;
        Token this_WS_4=null;
        Token otherlv_5=null;
        Token this_WS_6=null;
        Token this_WS_8=null;
        Token otherlv_9=null;
        EObject lv_members_3_0 = null;

        EObject lv_members_7_0 = null;



        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:2129:2: ( ( () otherlv_1= '{' ( ( (this_WS_2= RULE_WS )? ( (lv_members_3_0= ruleMember ) ) ) ( (this_WS_4= RULE_WS )? otherlv_5= ',' (this_WS_6= RULE_WS )? ( (lv_members_7_0= ruleMember ) ) )* (this_WS_8= RULE_WS )? )? otherlv_9= '}' ) )
            // InternalCurlBetterThanHttpie.g:2130:2: ( () otherlv_1= '{' ( ( (this_WS_2= RULE_WS )? ( (lv_members_3_0= ruleMember ) ) ) ( (this_WS_4= RULE_WS )? otherlv_5= ',' (this_WS_6= RULE_WS )? ( (lv_members_7_0= ruleMember ) ) )* (this_WS_8= RULE_WS )? )? otherlv_9= '}' )
            {
            // InternalCurlBetterThanHttpie.g:2130:2: ( () otherlv_1= '{' ( ( (this_WS_2= RULE_WS )? ( (lv_members_3_0= ruleMember ) ) ) ( (this_WS_4= RULE_WS )? otherlv_5= ',' (this_WS_6= RULE_WS )? ( (lv_members_7_0= ruleMember ) ) )* (this_WS_8= RULE_WS )? )? otherlv_9= '}' )
            // InternalCurlBetterThanHttpie.g:2131:3: () otherlv_1= '{' ( ( (this_WS_2= RULE_WS )? ( (lv_members_3_0= ruleMember ) ) ) ( (this_WS_4= RULE_WS )? otherlv_5= ',' (this_WS_6= RULE_WS )? ( (lv_members_7_0= ruleMember ) ) )* (this_WS_8= RULE_WS )? )? otherlv_9= '}'
            {
            // InternalCurlBetterThanHttpie.g:2131:3: ()
            // InternalCurlBetterThanHttpie.g:2132:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getJsonObjectAccess().getJsonObjectAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,44,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getJsonObjectAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalCurlBetterThanHttpie.g:2142:3: ( ( (this_WS_2= RULE_WS )? ( (lv_members_3_0= ruleMember ) ) ) ( (this_WS_4= RULE_WS )? otherlv_5= ',' (this_WS_6= RULE_WS )? ( (lv_members_7_0= ruleMember ) ) )* (this_WS_8= RULE_WS )? )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( ((LA64_0>=RULE_HTTP && LA64_0<=RULE_ID)||(LA64_0>=42 && LA64_0<=43)) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:2143:4: ( (this_WS_2= RULE_WS )? ( (lv_members_3_0= ruleMember ) ) ) ( (this_WS_4= RULE_WS )? otherlv_5= ',' (this_WS_6= RULE_WS )? ( (lv_members_7_0= ruleMember ) ) )* (this_WS_8= RULE_WS )?
                    {
                    // InternalCurlBetterThanHttpie.g:2143:4: ( (this_WS_2= RULE_WS )? ( (lv_members_3_0= ruleMember ) ) )
                    // InternalCurlBetterThanHttpie.g:2144:5: (this_WS_2= RULE_WS )? ( (lv_members_3_0= ruleMember ) )
                    {
                    // InternalCurlBetterThanHttpie.g:2144:5: (this_WS_2= RULE_WS )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==RULE_WS) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // InternalCurlBetterThanHttpie.g:2145:6: this_WS_2= RULE_WS
                            {
                            this_WS_2=(Token)match(input,RULE_WS,FOLLOW_37); 

                            						newLeafNode(this_WS_2, grammarAccess.getJsonObjectAccess().getWSTerminalRuleCall_2_0_0());
                            					

                            }
                            break;

                    }

                    // InternalCurlBetterThanHttpie.g:2150:5: ( (lv_members_3_0= ruleMember ) )
                    // InternalCurlBetterThanHttpie.g:2151:6: (lv_members_3_0= ruleMember )
                    {
                    // InternalCurlBetterThanHttpie.g:2151:6: (lv_members_3_0= ruleMember )
                    // InternalCurlBetterThanHttpie.g:2152:7: lv_members_3_0= ruleMember
                    {

                    							newCompositeNode(grammarAccess.getJsonObjectAccess().getMembersMemberParserRuleCall_2_0_1_0());
                    						
                    pushFollow(FOLLOW_38);
                    lv_members_3_0=ruleMember();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getJsonObjectRule());
                    							}
                    							add(
                    								current,
                    								"members",
                    								lv_members_3_0,
                    								"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.Member");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }

                    // InternalCurlBetterThanHttpie.g:2170:4: ( (this_WS_4= RULE_WS )? otherlv_5= ',' (this_WS_6= RULE_WS )? ( (lv_members_7_0= ruleMember ) ) )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==RULE_WS) ) {
                            int LA62_1 = input.LA(2);

                            if ( (LA62_1==45) ) {
                                alt62=1;
                            }


                        }
                        else if ( (LA62_0==45) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // InternalCurlBetterThanHttpie.g:2171:5: (this_WS_4= RULE_WS )? otherlv_5= ',' (this_WS_6= RULE_WS )? ( (lv_members_7_0= ruleMember ) )
                    	    {
                    	    // InternalCurlBetterThanHttpie.g:2171:5: (this_WS_4= RULE_WS )?
                    	    int alt60=2;
                    	    int LA60_0 = input.LA(1);

                    	    if ( (LA60_0==RULE_WS) ) {
                    	        alt60=1;
                    	    }
                    	    switch (alt60) {
                    	        case 1 :
                    	            // InternalCurlBetterThanHttpie.g:2172:6: this_WS_4= RULE_WS
                    	            {
                    	            this_WS_4=(Token)match(input,RULE_WS,FOLLOW_39); 

                    	            						newLeafNode(this_WS_4, grammarAccess.getJsonObjectAccess().getWSTerminalRuleCall_2_1_0());
                    	            					

                    	            }
                    	            break;

                    	    }

                    	    otherlv_5=(Token)match(input,45,FOLLOW_37); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getJsonObjectAccess().getCommaKeyword_2_1_1());
                    	    				
                    	    // InternalCurlBetterThanHttpie.g:2181:5: (this_WS_6= RULE_WS )?
                    	    int alt61=2;
                    	    int LA61_0 = input.LA(1);

                    	    if ( (LA61_0==RULE_WS) ) {
                    	        alt61=1;
                    	    }
                    	    switch (alt61) {
                    	        case 1 :
                    	            // InternalCurlBetterThanHttpie.g:2182:6: this_WS_6= RULE_WS
                    	            {
                    	            this_WS_6=(Token)match(input,RULE_WS,FOLLOW_37); 

                    	            						newLeafNode(this_WS_6, grammarAccess.getJsonObjectAccess().getWSTerminalRuleCall_2_1_2());
                    	            					

                    	            }
                    	            break;

                    	    }

                    	    // InternalCurlBetterThanHttpie.g:2187:5: ( (lv_members_7_0= ruleMember ) )
                    	    // InternalCurlBetterThanHttpie.g:2188:6: (lv_members_7_0= ruleMember )
                    	    {
                    	    // InternalCurlBetterThanHttpie.g:2188:6: (lv_members_7_0= ruleMember )
                    	    // InternalCurlBetterThanHttpie.g:2189:7: lv_members_7_0= ruleMember
                    	    {

                    	    							newCompositeNode(grammarAccess.getJsonObjectAccess().getMembersMemberParserRuleCall_2_1_3_0());
                    	    						
                    	    pushFollow(FOLLOW_38);
                    	    lv_members_7_0=ruleMember();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getJsonObjectRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"members",
                    	    								lv_members_7_0,
                    	    								"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.Member");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop62;
                        }
                    } while (true);

                    // InternalCurlBetterThanHttpie.g:2207:4: (this_WS_8= RULE_WS )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==RULE_WS) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // InternalCurlBetterThanHttpie.g:2208:5: this_WS_8= RULE_WS
                            {
                            this_WS_8=(Token)match(input,RULE_WS,FOLLOW_40); 

                            					newLeafNode(this_WS_8, grammarAccess.getJsonObjectAccess().getWSTerminalRuleCall_2_2());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,46,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getJsonObjectAccess().getRightCurlyBracketKeyword_3());
            		

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


    // $ANTLR start "entryRuleJsonString"
    // InternalCurlBetterThanHttpie.g:2222:1: entryRuleJsonString returns [EObject current=null] : iv_ruleJsonString= ruleJsonString EOF ;
    public final EObject entryRuleJsonString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonString = null;


        try {
            // InternalCurlBetterThanHttpie.g:2222:51: (iv_ruleJsonString= ruleJsonString EOF )
            // InternalCurlBetterThanHttpie.g:2223:2: iv_ruleJsonString= ruleJsonString EOF
            {
             newCompositeNode(grammarAccess.getJsonStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJsonString=ruleJsonString();

            state._fsp--;

             current =iv_ruleJsonString; 
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
    // $ANTLR end "entryRuleJsonString"


    // $ANTLR start "ruleJsonString"
    // InternalCurlBetterThanHttpie.g:2229:1: ruleJsonString returns [EObject current=null] : ( (otherlv_0= '\"' ( ( (lv_value_1_1= RULE_ID | lv_value_1_2= RULE_HTTP ) ) ) otherlv_2= '\"' ) | (otherlv_3= '\\'' ( ( (lv_value_4_1= RULE_ID | lv_value_4_2= RULE_HTTP ) ) ) otherlv_5= '\\'' ) | ( ( (lv_value_6_1= RULE_ID | lv_value_6_2= RULE_HTTP ) ) ) ) ;
    public final EObject ruleJsonString() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_1=null;
        Token lv_value_1_2=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_value_4_1=null;
        Token lv_value_4_2=null;
        Token otherlv_5=null;
        Token lv_value_6_1=null;
        Token lv_value_6_2=null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:2235:2: ( ( (otherlv_0= '\"' ( ( (lv_value_1_1= RULE_ID | lv_value_1_2= RULE_HTTP ) ) ) otherlv_2= '\"' ) | (otherlv_3= '\\'' ( ( (lv_value_4_1= RULE_ID | lv_value_4_2= RULE_HTTP ) ) ) otherlv_5= '\\'' ) | ( ( (lv_value_6_1= RULE_ID | lv_value_6_2= RULE_HTTP ) ) ) ) )
            // InternalCurlBetterThanHttpie.g:2236:2: ( (otherlv_0= '\"' ( ( (lv_value_1_1= RULE_ID | lv_value_1_2= RULE_HTTP ) ) ) otherlv_2= '\"' ) | (otherlv_3= '\\'' ( ( (lv_value_4_1= RULE_ID | lv_value_4_2= RULE_HTTP ) ) ) otherlv_5= '\\'' ) | ( ( (lv_value_6_1= RULE_ID | lv_value_6_2= RULE_HTTP ) ) ) )
            {
            // InternalCurlBetterThanHttpie.g:2236:2: ( (otherlv_0= '\"' ( ( (lv_value_1_1= RULE_ID | lv_value_1_2= RULE_HTTP ) ) ) otherlv_2= '\"' ) | (otherlv_3= '\\'' ( ( (lv_value_4_1= RULE_ID | lv_value_4_2= RULE_HTTP ) ) ) otherlv_5= '\\'' ) | ( ( (lv_value_6_1= RULE_ID | lv_value_6_2= RULE_HTTP ) ) ) )
            int alt68=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt68=1;
                }
                break;
            case 43:
                {
                alt68=2;
                }
                break;
            case RULE_HTTP:
            case RULE_ID:
                {
                alt68=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }

            switch (alt68) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:2237:3: (otherlv_0= '\"' ( ( (lv_value_1_1= RULE_ID | lv_value_1_2= RULE_HTTP ) ) ) otherlv_2= '\"' )
                    {
                    // InternalCurlBetterThanHttpie.g:2237:3: (otherlv_0= '\"' ( ( (lv_value_1_1= RULE_ID | lv_value_1_2= RULE_HTTP ) ) ) otherlv_2= '\"' )
                    // InternalCurlBetterThanHttpie.g:2238:4: otherlv_0= '\"' ( ( (lv_value_1_1= RULE_ID | lv_value_1_2= RULE_HTTP ) ) ) otherlv_2= '\"'
                    {
                    otherlv_0=(Token)match(input,42,FOLLOW_13); 

                    				newLeafNode(otherlv_0, grammarAccess.getJsonStringAccess().getQuotationMarkKeyword_0_0());
                    			
                    // InternalCurlBetterThanHttpie.g:2242:4: ( ( (lv_value_1_1= RULE_ID | lv_value_1_2= RULE_HTTP ) ) )
                    // InternalCurlBetterThanHttpie.g:2243:5: ( (lv_value_1_1= RULE_ID | lv_value_1_2= RULE_HTTP ) )
                    {
                    // InternalCurlBetterThanHttpie.g:2243:5: ( (lv_value_1_1= RULE_ID | lv_value_1_2= RULE_HTTP ) )
                    // InternalCurlBetterThanHttpie.g:2244:6: (lv_value_1_1= RULE_ID | lv_value_1_2= RULE_HTTP )
                    {
                    // InternalCurlBetterThanHttpie.g:2244:6: (lv_value_1_1= RULE_ID | lv_value_1_2= RULE_HTTP )
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==RULE_ID) ) {
                        alt65=1;
                    }
                    else if ( (LA65_0==RULE_HTTP) ) {
                        alt65=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 65, 0, input);

                        throw nvae;
                    }
                    switch (alt65) {
                        case 1 :
                            // InternalCurlBetterThanHttpie.g:2245:7: lv_value_1_1= RULE_ID
                            {
                            lv_value_1_1=(Token)match(input,RULE_ID,FOLLOW_31); 

                            							newLeafNode(lv_value_1_1, grammarAccess.getJsonStringAccess().getValueIDTerminalRuleCall_0_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getJsonStringRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"value",
                            								lv_value_1_1,
                            								"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.ID");
                            						

                            }
                            break;
                        case 2 :
                            // InternalCurlBetterThanHttpie.g:2260:7: lv_value_1_2= RULE_HTTP
                            {
                            lv_value_1_2=(Token)match(input,RULE_HTTP,FOLLOW_31); 

                            							newLeafNode(lv_value_1_2, grammarAccess.getJsonStringAccess().getValueHTTPTerminalRuleCall_0_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getJsonStringRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"value",
                            								lv_value_1_2,
                            								"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.HTTP");
                            						

                            }
                            break;

                    }


                    }


                    }

                    otherlv_2=(Token)match(input,42,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getJsonStringAccess().getQuotationMarkKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:2283:3: (otherlv_3= '\\'' ( ( (lv_value_4_1= RULE_ID | lv_value_4_2= RULE_HTTP ) ) ) otherlv_5= '\\'' )
                    {
                    // InternalCurlBetterThanHttpie.g:2283:3: (otherlv_3= '\\'' ( ( (lv_value_4_1= RULE_ID | lv_value_4_2= RULE_HTTP ) ) ) otherlv_5= '\\'' )
                    // InternalCurlBetterThanHttpie.g:2284:4: otherlv_3= '\\'' ( ( (lv_value_4_1= RULE_ID | lv_value_4_2= RULE_HTTP ) ) ) otherlv_5= '\\''
                    {
                    otherlv_3=(Token)match(input,43,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getJsonStringAccess().getApostropheKeyword_1_0());
                    			
                    // InternalCurlBetterThanHttpie.g:2288:4: ( ( (lv_value_4_1= RULE_ID | lv_value_4_2= RULE_HTTP ) ) )
                    // InternalCurlBetterThanHttpie.g:2289:5: ( (lv_value_4_1= RULE_ID | lv_value_4_2= RULE_HTTP ) )
                    {
                    // InternalCurlBetterThanHttpie.g:2289:5: ( (lv_value_4_1= RULE_ID | lv_value_4_2= RULE_HTTP ) )
                    // InternalCurlBetterThanHttpie.g:2290:6: (lv_value_4_1= RULE_ID | lv_value_4_2= RULE_HTTP )
                    {
                    // InternalCurlBetterThanHttpie.g:2290:6: (lv_value_4_1= RULE_ID | lv_value_4_2= RULE_HTTP )
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==RULE_ID) ) {
                        alt66=1;
                    }
                    else if ( (LA66_0==RULE_HTTP) ) {
                        alt66=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 66, 0, input);

                        throw nvae;
                    }
                    switch (alt66) {
                        case 1 :
                            // InternalCurlBetterThanHttpie.g:2291:7: lv_value_4_1= RULE_ID
                            {
                            lv_value_4_1=(Token)match(input,RULE_ID,FOLLOW_33); 

                            							newLeafNode(lv_value_4_1, grammarAccess.getJsonStringAccess().getValueIDTerminalRuleCall_1_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getJsonStringRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"value",
                            								lv_value_4_1,
                            								"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.ID");
                            						

                            }
                            break;
                        case 2 :
                            // InternalCurlBetterThanHttpie.g:2306:7: lv_value_4_2= RULE_HTTP
                            {
                            lv_value_4_2=(Token)match(input,RULE_HTTP,FOLLOW_33); 

                            							newLeafNode(lv_value_4_2, grammarAccess.getJsonStringAccess().getValueHTTPTerminalRuleCall_1_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getJsonStringRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"value",
                            								lv_value_4_2,
                            								"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.HTTP");
                            						

                            }
                            break;

                    }


                    }


                    }

                    otherlv_5=(Token)match(input,43,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getJsonStringAccess().getApostropheKeyword_1_2());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCurlBetterThanHttpie.g:2329:3: ( ( (lv_value_6_1= RULE_ID | lv_value_6_2= RULE_HTTP ) ) )
                    {
                    // InternalCurlBetterThanHttpie.g:2329:3: ( ( (lv_value_6_1= RULE_ID | lv_value_6_2= RULE_HTTP ) ) )
                    // InternalCurlBetterThanHttpie.g:2330:4: ( (lv_value_6_1= RULE_ID | lv_value_6_2= RULE_HTTP ) )
                    {
                    // InternalCurlBetterThanHttpie.g:2330:4: ( (lv_value_6_1= RULE_ID | lv_value_6_2= RULE_HTTP ) )
                    // InternalCurlBetterThanHttpie.g:2331:5: (lv_value_6_1= RULE_ID | lv_value_6_2= RULE_HTTP )
                    {
                    // InternalCurlBetterThanHttpie.g:2331:5: (lv_value_6_1= RULE_ID | lv_value_6_2= RULE_HTTP )
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==RULE_ID) ) {
                        alt67=1;
                    }
                    else if ( (LA67_0==RULE_HTTP) ) {
                        alt67=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 67, 0, input);

                        throw nvae;
                    }
                    switch (alt67) {
                        case 1 :
                            // InternalCurlBetterThanHttpie.g:2332:6: lv_value_6_1= RULE_ID
                            {
                            lv_value_6_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                            						newLeafNode(lv_value_6_1, grammarAccess.getJsonStringAccess().getValueIDTerminalRuleCall_2_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getJsonStringRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"value",
                            							lv_value_6_1,
                            							"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.ID");
                            					

                            }
                            break;
                        case 2 :
                            // InternalCurlBetterThanHttpie.g:2347:6: lv_value_6_2= RULE_HTTP
                            {
                            lv_value_6_2=(Token)match(input,RULE_HTTP,FOLLOW_2); 

                            						newLeafNode(lv_value_6_2, grammarAccess.getJsonStringAccess().getValueHTTPTerminalRuleCall_2_0_1());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getJsonStringRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"value",
                            							lv_value_6_2,
                            							"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.HTTP");
                            					

                            }
                            break;

                    }


                    }


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
    // $ANTLR end "ruleJsonString"


    // $ANTLR start "entryRuleJsonArray"
    // InternalCurlBetterThanHttpie.g:2368:1: entryRuleJsonArray returns [EObject current=null] : iv_ruleJsonArray= ruleJsonArray EOF ;
    public final EObject entryRuleJsonArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonArray = null;


        try {
            // InternalCurlBetterThanHttpie.g:2368:50: (iv_ruleJsonArray= ruleJsonArray EOF )
            // InternalCurlBetterThanHttpie.g:2369:2: iv_ruleJsonArray= ruleJsonArray EOF
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
    // InternalCurlBetterThanHttpie.g:2375:1: ruleJsonArray returns [EObject current=null] : ( () otherlv_1= '[' ( ( (this_WS_2= RULE_WS )? ( (lv_values_3_0= ruleJsonType ) ) ) ( (this_WS_4= RULE_WS )? otherlv_5= ',' (this_WS_6= RULE_WS )? ( (lv_values_7_0= ruleJsonType ) ) )* (this_WS_8= RULE_WS )? )? otherlv_9= ']' ) ;
    public final EObject ruleJsonArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_WS_2=null;
        Token this_WS_4=null;
        Token otherlv_5=null;
        Token this_WS_6=null;
        Token this_WS_8=null;
        Token otherlv_9=null;
        EObject lv_values_3_0 = null;

        EObject lv_values_7_0 = null;



        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:2381:2: ( ( () otherlv_1= '[' ( ( (this_WS_2= RULE_WS )? ( (lv_values_3_0= ruleJsonType ) ) ) ( (this_WS_4= RULE_WS )? otherlv_5= ',' (this_WS_6= RULE_WS )? ( (lv_values_7_0= ruleJsonType ) ) )* (this_WS_8= RULE_WS )? )? otherlv_9= ']' ) )
            // InternalCurlBetterThanHttpie.g:2382:2: ( () otherlv_1= '[' ( ( (this_WS_2= RULE_WS )? ( (lv_values_3_0= ruleJsonType ) ) ) ( (this_WS_4= RULE_WS )? otherlv_5= ',' (this_WS_6= RULE_WS )? ( (lv_values_7_0= ruleJsonType ) ) )* (this_WS_8= RULE_WS )? )? otherlv_9= ']' )
            {
            // InternalCurlBetterThanHttpie.g:2382:2: ( () otherlv_1= '[' ( ( (this_WS_2= RULE_WS )? ( (lv_values_3_0= ruleJsonType ) ) ) ( (this_WS_4= RULE_WS )? otherlv_5= ',' (this_WS_6= RULE_WS )? ( (lv_values_7_0= ruleJsonType ) ) )* (this_WS_8= RULE_WS )? )? otherlv_9= ']' )
            // InternalCurlBetterThanHttpie.g:2383:3: () otherlv_1= '[' ( ( (this_WS_2= RULE_WS )? ( (lv_values_3_0= ruleJsonType ) ) ) ( (this_WS_4= RULE_WS )? otherlv_5= ',' (this_WS_6= RULE_WS )? ( (lv_values_7_0= ruleJsonType ) ) )* (this_WS_8= RULE_WS )? )? otherlv_9= ']'
            {
            // InternalCurlBetterThanHttpie.g:2383:3: ()
            // InternalCurlBetterThanHttpie.g:2384:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getJsonArrayAccess().getJsonArrayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,47,FOLLOW_41); 

            			newLeafNode(otherlv_1, grammarAccess.getJsonArrayAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalCurlBetterThanHttpie.g:2394:3: ( ( (this_WS_2= RULE_WS )? ( (lv_values_3_0= ruleJsonType ) ) ) ( (this_WS_4= RULE_WS )? otherlv_5= ',' (this_WS_6= RULE_WS )? ( (lv_values_7_0= ruleJsonType ) ) )* (this_WS_8= RULE_WS )? )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( ((LA74_0>=RULE_HTTP && LA74_0<=RULE_ID)||(LA74_0>=RULE_BOOLEAN && LA74_0<=RULE_NUMBER)||(LA74_0>=42 && LA74_0<=44)||LA74_0==47) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:2395:4: ( (this_WS_2= RULE_WS )? ( (lv_values_3_0= ruleJsonType ) ) ) ( (this_WS_4= RULE_WS )? otherlv_5= ',' (this_WS_6= RULE_WS )? ( (lv_values_7_0= ruleJsonType ) ) )* (this_WS_8= RULE_WS )?
                    {
                    // InternalCurlBetterThanHttpie.g:2395:4: ( (this_WS_2= RULE_WS )? ( (lv_values_3_0= ruleJsonType ) ) )
                    // InternalCurlBetterThanHttpie.g:2396:5: (this_WS_2= RULE_WS )? ( (lv_values_3_0= ruleJsonType ) )
                    {
                    // InternalCurlBetterThanHttpie.g:2396:5: (this_WS_2= RULE_WS )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==RULE_WS) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // InternalCurlBetterThanHttpie.g:2397:6: this_WS_2= RULE_WS
                            {
                            this_WS_2=(Token)match(input,RULE_WS,FOLLOW_35); 

                            						newLeafNode(this_WS_2, grammarAccess.getJsonArrayAccess().getWSTerminalRuleCall_2_0_0());
                            					

                            }
                            break;

                    }

                    // InternalCurlBetterThanHttpie.g:2402:5: ( (lv_values_3_0= ruleJsonType ) )
                    // InternalCurlBetterThanHttpie.g:2403:6: (lv_values_3_0= ruleJsonType )
                    {
                    // InternalCurlBetterThanHttpie.g:2403:6: (lv_values_3_0= ruleJsonType )
                    // InternalCurlBetterThanHttpie.g:2404:7: lv_values_3_0= ruleJsonType
                    {

                    							newCompositeNode(grammarAccess.getJsonArrayAccess().getValuesJsonTypeParserRuleCall_2_0_1_0());
                    						
                    pushFollow(FOLLOW_42);
                    lv_values_3_0=ruleJsonType();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getJsonArrayRule());
                    							}
                    							add(
                    								current,
                    								"values",
                    								lv_values_3_0,
                    								"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.JsonType");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }

                    // InternalCurlBetterThanHttpie.g:2422:4: ( (this_WS_4= RULE_WS )? otherlv_5= ',' (this_WS_6= RULE_WS )? ( (lv_values_7_0= ruleJsonType ) ) )*
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==RULE_WS) ) {
                            int LA72_1 = input.LA(2);

                            if ( (LA72_1==45) ) {
                                alt72=1;
                            }


                        }
                        else if ( (LA72_0==45) ) {
                            alt72=1;
                        }


                        switch (alt72) {
                    	case 1 :
                    	    // InternalCurlBetterThanHttpie.g:2423:5: (this_WS_4= RULE_WS )? otherlv_5= ',' (this_WS_6= RULE_WS )? ( (lv_values_7_0= ruleJsonType ) )
                    	    {
                    	    // InternalCurlBetterThanHttpie.g:2423:5: (this_WS_4= RULE_WS )?
                    	    int alt70=2;
                    	    int LA70_0 = input.LA(1);

                    	    if ( (LA70_0==RULE_WS) ) {
                    	        alt70=1;
                    	    }
                    	    switch (alt70) {
                    	        case 1 :
                    	            // InternalCurlBetterThanHttpie.g:2424:6: this_WS_4= RULE_WS
                    	            {
                    	            this_WS_4=(Token)match(input,RULE_WS,FOLLOW_39); 

                    	            						newLeafNode(this_WS_4, grammarAccess.getJsonArrayAccess().getWSTerminalRuleCall_2_1_0());
                    	            					

                    	            }
                    	            break;

                    	    }

                    	    otherlv_5=(Token)match(input,45,FOLLOW_34); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getJsonArrayAccess().getCommaKeyword_2_1_1());
                    	    				
                    	    // InternalCurlBetterThanHttpie.g:2433:5: (this_WS_6= RULE_WS )?
                    	    int alt71=2;
                    	    int LA71_0 = input.LA(1);

                    	    if ( (LA71_0==RULE_WS) ) {
                    	        alt71=1;
                    	    }
                    	    switch (alt71) {
                    	        case 1 :
                    	            // InternalCurlBetterThanHttpie.g:2434:6: this_WS_6= RULE_WS
                    	            {
                    	            this_WS_6=(Token)match(input,RULE_WS,FOLLOW_35); 

                    	            						newLeafNode(this_WS_6, grammarAccess.getJsonArrayAccess().getWSTerminalRuleCall_2_1_2());
                    	            					

                    	            }
                    	            break;

                    	    }

                    	    // InternalCurlBetterThanHttpie.g:2439:5: ( (lv_values_7_0= ruleJsonType ) )
                    	    // InternalCurlBetterThanHttpie.g:2440:6: (lv_values_7_0= ruleJsonType )
                    	    {
                    	    // InternalCurlBetterThanHttpie.g:2440:6: (lv_values_7_0= ruleJsonType )
                    	    // InternalCurlBetterThanHttpie.g:2441:7: lv_values_7_0= ruleJsonType
                    	    {

                    	    							newCompositeNode(grammarAccess.getJsonArrayAccess().getValuesJsonTypeParserRuleCall_2_1_3_0());
                    	    						
                    	    pushFollow(FOLLOW_42);
                    	    lv_values_7_0=ruleJsonType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getJsonArrayRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"values",
                    	    								lv_values_7_0,
                    	    								"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.JsonType");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop72;
                        }
                    } while (true);

                    // InternalCurlBetterThanHttpie.g:2459:4: (this_WS_8= RULE_WS )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==RULE_WS) ) {
                        alt73=1;
                    }
                    switch (alt73) {
                        case 1 :
                            // InternalCurlBetterThanHttpie.g:2460:5: this_WS_8= RULE_WS
                            {
                            this_WS_8=(Token)match(input,RULE_WS,FOLLOW_43); 

                            					newLeafNode(this_WS_8, grammarAccess.getJsonArrayAccess().getWSTerminalRuleCall_2_2());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,48,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getJsonArrayAccess().getRightSquareBracketKeyword_3());
            		

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
    // $ANTLR end "ruleJsonArray"


    // $ANTLR start "entryRuleJsonBoolean"
    // InternalCurlBetterThanHttpie.g:2474:1: entryRuleJsonBoolean returns [EObject current=null] : iv_ruleJsonBoolean= ruleJsonBoolean EOF ;
    public final EObject entryRuleJsonBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonBoolean = null;


        try {
            // InternalCurlBetterThanHttpie.g:2474:52: (iv_ruleJsonBoolean= ruleJsonBoolean EOF )
            // InternalCurlBetterThanHttpie.g:2475:2: iv_ruleJsonBoolean= ruleJsonBoolean EOF
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
    // InternalCurlBetterThanHttpie.g:2481:1: ruleJsonBoolean returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleJsonBoolean() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:2487:2: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // InternalCurlBetterThanHttpie.g:2488:2: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // InternalCurlBetterThanHttpie.g:2488:2: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // InternalCurlBetterThanHttpie.g:2489:3: (lv_value_0_0= RULE_BOOLEAN )
            {
            // InternalCurlBetterThanHttpie.g:2489:3: (lv_value_0_0= RULE_BOOLEAN )
            // InternalCurlBetterThanHttpie.g:2490:4: lv_value_0_0= RULE_BOOLEAN
            {
            lv_value_0_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getJsonBooleanAccess().getValueBOOLEANTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getJsonBooleanRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.BOOLEAN");
            			

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
    // $ANTLR end "ruleJsonBoolean"


    // $ANTLR start "entryRuleJsonNull"
    // InternalCurlBetterThanHttpie.g:2509:1: entryRuleJsonNull returns [EObject current=null] : iv_ruleJsonNull= ruleJsonNull EOF ;
    public final EObject entryRuleJsonNull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonNull = null;


        try {
            // InternalCurlBetterThanHttpie.g:2509:49: (iv_ruleJsonNull= ruleJsonNull EOF )
            // InternalCurlBetterThanHttpie.g:2510:2: iv_ruleJsonNull= ruleJsonNull EOF
            {
             newCompositeNode(grammarAccess.getJsonNullRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJsonNull=ruleJsonNull();

            state._fsp--;

             current =iv_ruleJsonNull; 
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
    // $ANTLR end "entryRuleJsonNull"


    // $ANTLR start "ruleJsonNull"
    // InternalCurlBetterThanHttpie.g:2516:1: ruleJsonNull returns [EObject current=null] : ( () this_NULL_1= RULE_NULL ) ;
    public final EObject ruleJsonNull() throws RecognitionException {
        EObject current = null;

        Token this_NULL_1=null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:2522:2: ( ( () this_NULL_1= RULE_NULL ) )
            // InternalCurlBetterThanHttpie.g:2523:2: ( () this_NULL_1= RULE_NULL )
            {
            // InternalCurlBetterThanHttpie.g:2523:2: ( () this_NULL_1= RULE_NULL )
            // InternalCurlBetterThanHttpie.g:2524:3: () this_NULL_1= RULE_NULL
            {
            // InternalCurlBetterThanHttpie.g:2524:3: ()
            // InternalCurlBetterThanHttpie.g:2525:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getJsonNullAccess().getJsonNullAction_0(),
            					current);
            			

            }

            this_NULL_1=(Token)match(input,RULE_NULL,FOLLOW_2); 

            			newLeafNode(this_NULL_1, grammarAccess.getJsonNullAccess().getNULLTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleJsonNull"


    // $ANTLR start "entryRuleJsonNumber"
    // InternalCurlBetterThanHttpie.g:2539:1: entryRuleJsonNumber returns [EObject current=null] : iv_ruleJsonNumber= ruleJsonNumber EOF ;
    public final EObject entryRuleJsonNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonNumber = null;


        try {
            // InternalCurlBetterThanHttpie.g:2539:51: (iv_ruleJsonNumber= ruleJsonNumber EOF )
            // InternalCurlBetterThanHttpie.g:2540:2: iv_ruleJsonNumber= ruleJsonNumber EOF
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
    // InternalCurlBetterThanHttpie.g:2546:1: ruleJsonNumber returns [EObject current=null] : ( (lv_value_0_0= RULE_NUMBER ) ) ;
    public final EObject ruleJsonNumber() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:2552:2: ( ( (lv_value_0_0= RULE_NUMBER ) ) )
            // InternalCurlBetterThanHttpie.g:2553:2: ( (lv_value_0_0= RULE_NUMBER ) )
            {
            // InternalCurlBetterThanHttpie.g:2553:2: ( (lv_value_0_0= RULE_NUMBER ) )
            // InternalCurlBetterThanHttpie.g:2554:3: (lv_value_0_0= RULE_NUMBER )
            {
            // InternalCurlBetterThanHttpie.g:2554:3: (lv_value_0_0= RULE_NUMBER )
            // InternalCurlBetterThanHttpie.g:2555:4: lv_value_0_0= RULE_NUMBER
            {
            lv_value_0_0=(Token)match(input,RULE_NUMBER,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getJsonNumberAccess().getValueNUMBERTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getJsonNumberRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.NUMBER");
            			

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
    // $ANTLR end "ruleJsonNumber"


    // $ANTLR start "ruleMethod"
    // InternalCurlBetterThanHttpie.g:2574:1: ruleMethod returns [Enumerator current=null] : ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) ) ;
    public final Enumerator ruleMethod() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:2580:2: ( ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) ) )
            // InternalCurlBetterThanHttpie.g:2581:2: ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) )
            {
            // InternalCurlBetterThanHttpie.g:2581:2: ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) )
            int alt75=4;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt75=1;
                }
                break;
            case 50:
                {
                alt75=2;
                }
                break;
            case 51:
                {
                alt75=3;
                }
                break;
            case 52:
                {
                alt75=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:2582:3: (enumLiteral_0= 'GET' )
                    {
                    // InternalCurlBetterThanHttpie.g:2582:3: (enumLiteral_0= 'GET' )
                    // InternalCurlBetterThanHttpie.g:2583:4: enumLiteral_0= 'GET'
                    {
                    enumLiteral_0=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getMethodAccess().getGETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMethodAccess().getGETEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:2590:3: (enumLiteral_1= 'POST' )
                    {
                    // InternalCurlBetterThanHttpie.g:2590:3: (enumLiteral_1= 'POST' )
                    // InternalCurlBetterThanHttpie.g:2591:4: enumLiteral_1= 'POST'
                    {
                    enumLiteral_1=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getMethodAccess().getPOSTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMethodAccess().getPOSTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCurlBetterThanHttpie.g:2598:3: (enumLiteral_2= 'PUT' )
                    {
                    // InternalCurlBetterThanHttpie.g:2598:3: (enumLiteral_2= 'PUT' )
                    // InternalCurlBetterThanHttpie.g:2599:4: enumLiteral_2= 'PUT'
                    {
                    enumLiteral_2=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getMethodAccess().getPUTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMethodAccess().getPUTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalCurlBetterThanHttpie.g:2606:3: (enumLiteral_3= 'DELETE' )
                    {
                    // InternalCurlBetterThanHttpie.g:2606:3: (enumLiteral_3= 'DELETE' )
                    // InternalCurlBetterThanHttpie.g:2607:4: enumLiteral_3= 'DELETE'
                    {
                    enumLiteral_3=(Token)match(input,52,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000FFCFF80000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x001E000000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000100D0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010080L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030022L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020022L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020122L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020010002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000050L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00009C0020001C50L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00000C0000000050L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00009C0000001C70L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00009C0000001C50L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00004C0000000070L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x00000C0000000070L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000600000000020L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x00019C0000001C70L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0001200000000020L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0001000000000000L});

}