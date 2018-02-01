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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_HTTP", "RULE_WS", "RULE_ID", "RULE_URL", "RULE_INT", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_NULL", "RULE_DIGIT", "RULE_LETTER", "'://'", "':'", "'/'", "'--'", "'--header'", "'-t'", "'--body'", "'-b'", "'--json'", "'-j'", "'--form'", "'-f'", "'--proxy'", "'='", "'@'", "'--auth'", "'-a'", "'--download'", "'-d'", "'--help'", "'-h'", "'--version'", "'--verbose'", "'-v'", "'--timeout'", "'=='", "':='", "'\"'", "'\\''", "'{'", "','", "'}'", "'['", "']'", "'GET'", "'POST'", "'PUT'", "'DELETE'"
    };
    public static final int T__50=50;
    public static final int RULE_BOOLEAN=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int RULE_ID=6;
    public static final int RULE_DIGIT=12;
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
    public static final int RULE_LETTER=13;
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
    // InternalCurlBetterThanHttpie.g:72:1: ruleCommandLineInterface returns [EObject current=null] : ( () this_HTTP_1= RULE_HTTP (this_WS_2= RULE_WS ( (lv_flags_3_0= ruleFlag ) ) )* (this_WS_4= RULE_WS ( (lv_method_5_0= ruleMethod ) ) )? this_WS_6= RULE_WS ( ( ( (lv_protocol_7_1= RULE_ID | lv_protocol_7_2= RULE_HTTP ) ) ) otherlv_8= '://' )? ( ( ( (lv_url_9_0= RULE_URL ) ) (otherlv_10= ':' ( (lv_port_11_0= RULE_INT ) ) )? ) | (otherlv_12= ':' ( (lv_port_13_0= RULE_INT ) )? ) ) (otherlv_14= '/' ( ( (lv_resource_15_1= RULE_ID | lv_resource_15_2= RULE_HTTP ) ) ) )? (this_WS_16= RULE_WS otherlv_17= '--' )? (this_WS_18= RULE_WS ( (lv_items_19_0= ruleItem ) ) )* (this_WS_20= RULE_WS )? ) ;
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
        Token this_WS_20=null;
        EObject lv_flags_3_0 = null;

        Enumerator lv_method_5_0 = null;

        EObject lv_items_19_0 = null;



        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:78:2: ( ( () this_HTTP_1= RULE_HTTP (this_WS_2= RULE_WS ( (lv_flags_3_0= ruleFlag ) ) )* (this_WS_4= RULE_WS ( (lv_method_5_0= ruleMethod ) ) )? this_WS_6= RULE_WS ( ( ( (lv_protocol_7_1= RULE_ID | lv_protocol_7_2= RULE_HTTP ) ) ) otherlv_8= '://' )? ( ( ( (lv_url_9_0= RULE_URL ) ) (otherlv_10= ':' ( (lv_port_11_0= RULE_INT ) ) )? ) | (otherlv_12= ':' ( (lv_port_13_0= RULE_INT ) )? ) ) (otherlv_14= '/' ( ( (lv_resource_15_1= RULE_ID | lv_resource_15_2= RULE_HTTP ) ) ) )? (this_WS_16= RULE_WS otherlv_17= '--' )? (this_WS_18= RULE_WS ( (lv_items_19_0= ruleItem ) ) )* (this_WS_20= RULE_WS )? ) )
            // InternalCurlBetterThanHttpie.g:79:2: ( () this_HTTP_1= RULE_HTTP (this_WS_2= RULE_WS ( (lv_flags_3_0= ruleFlag ) ) )* (this_WS_4= RULE_WS ( (lv_method_5_0= ruleMethod ) ) )? this_WS_6= RULE_WS ( ( ( (lv_protocol_7_1= RULE_ID | lv_protocol_7_2= RULE_HTTP ) ) ) otherlv_8= '://' )? ( ( ( (lv_url_9_0= RULE_URL ) ) (otherlv_10= ':' ( (lv_port_11_0= RULE_INT ) ) )? ) | (otherlv_12= ':' ( (lv_port_13_0= RULE_INT ) )? ) ) (otherlv_14= '/' ( ( (lv_resource_15_1= RULE_ID | lv_resource_15_2= RULE_HTTP ) ) ) )? (this_WS_16= RULE_WS otherlv_17= '--' )? (this_WS_18= RULE_WS ( (lv_items_19_0= ruleItem ) ) )* (this_WS_20= RULE_WS )? )
            {
            // InternalCurlBetterThanHttpie.g:79:2: ( () this_HTTP_1= RULE_HTTP (this_WS_2= RULE_WS ( (lv_flags_3_0= ruleFlag ) ) )* (this_WS_4= RULE_WS ( (lv_method_5_0= ruleMethod ) ) )? this_WS_6= RULE_WS ( ( ( (lv_protocol_7_1= RULE_ID | lv_protocol_7_2= RULE_HTTP ) ) ) otherlv_8= '://' )? ( ( ( (lv_url_9_0= RULE_URL ) ) (otherlv_10= ':' ( (lv_port_11_0= RULE_INT ) ) )? ) | (otherlv_12= ':' ( (lv_port_13_0= RULE_INT ) )? ) ) (otherlv_14= '/' ( ( (lv_resource_15_1= RULE_ID | lv_resource_15_2= RULE_HTTP ) ) ) )? (this_WS_16= RULE_WS otherlv_17= '--' )? (this_WS_18= RULE_WS ( (lv_items_19_0= ruleItem ) ) )* (this_WS_20= RULE_WS )? )
            // InternalCurlBetterThanHttpie.g:80:3: () this_HTTP_1= RULE_HTTP (this_WS_2= RULE_WS ( (lv_flags_3_0= ruleFlag ) ) )* (this_WS_4= RULE_WS ( (lv_method_5_0= ruleMethod ) ) )? this_WS_6= RULE_WS ( ( ( (lv_protocol_7_1= RULE_ID | lv_protocol_7_2= RULE_HTTP ) ) ) otherlv_8= '://' )? ( ( ( (lv_url_9_0= RULE_URL ) ) (otherlv_10= ':' ( (lv_port_11_0= RULE_INT ) ) )? ) | (otherlv_12= ':' ( (lv_port_13_0= RULE_INT ) )? ) ) (otherlv_14= '/' ( ( (lv_resource_15_1= RULE_ID | lv_resource_15_2= RULE_HTTP ) ) ) )? (this_WS_16= RULE_WS otherlv_17= '--' )? (this_WS_18= RULE_WS ( (lv_items_19_0= ruleItem ) ) )* (this_WS_20= RULE_WS )?
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

                    if ( ((LA1_1>=18 && LA1_1<=26)||(LA1_1>=29 && LA1_1<=38)) ) {
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

                if ( ((LA2_1>=48 && LA2_1<=51)) ) {
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

                    otherlv_8=(Token)match(input,14,FOLLOW_8); 

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
            else if ( (LA7_0==15) ) {
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

                    if ( (LA5_0==15) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalCurlBetterThanHttpie.g:207:6: otherlv_10= ':' ( (lv_port_11_0= RULE_INT ) )
                            {
                            otherlv_10=(Token)match(input,15,FOLLOW_10); 

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
                    otherlv_12=(Token)match(input,15,FOLLOW_12); 

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

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:258:4: otherlv_14= '/' ( ( (lv_resource_15_1= RULE_ID | lv_resource_15_2= RULE_HTTP ) ) )
                    {
                    otherlv_14=(Token)match(input,16,FOLLOW_13); 

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

                if ( (LA10_1==17) ) {
                    alt10=1;
                }
            }
            switch (alt10) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:299:4: this_WS_16= RULE_WS otherlv_17= '--'
                    {
                    this_WS_16=(Token)match(input,RULE_WS,FOLLOW_15); 

                    				newLeafNode(this_WS_16, grammarAccess.getCommandLineInterfaceAccess().getWSTerminalRuleCall_8_0());
                    			
                    otherlv_17=(Token)match(input,17,FOLLOW_14); 

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
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1==RULE_HTTP||LA11_1==RULE_ID) ) {
                        alt11=1;
                    }


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

            // InternalCurlBetterThanHttpie.g:333:3: (this_WS_20= RULE_WS )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_WS) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:334:4: this_WS_20= RULE_WS
                    {
                    this_WS_20=(Token)match(input,RULE_WS,FOLLOW_2); 

                    				newLeafNode(this_WS_20, grammarAccess.getCommandLineInterfaceAccess().getWSTerminalRuleCall_10());
                    			

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
    // $ANTLR end "ruleCommandLineInterface"


    // $ANTLR start "entryRuleFlag"
    // InternalCurlBetterThanHttpie.g:343:1: entryRuleFlag returns [EObject current=null] : iv_ruleFlag= ruleFlag EOF ;
    public final EObject entryRuleFlag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlag = null;


        try {
            // InternalCurlBetterThanHttpie.g:343:45: (iv_ruleFlag= ruleFlag EOF )
            // InternalCurlBetterThanHttpie.g:344:2: iv_ruleFlag= ruleFlag EOF
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
    // InternalCurlBetterThanHttpie.g:350:1: ruleFlag returns [EObject current=null] : (this_ProxyFlag_0= ruleProxyFlag | this_FormFlag_1= ruleFormFlag | this_AuthFlag_2= ruleAuthFlag | this_DownloadFlag_3= ruleDownloadFlag | this_BodyFlag_4= ruleBodyFlag | this_VersionFlag_5= ruleVersionFlag | this_JsonFlag_6= ruleJsonFlag | this_HelpFlag_7= ruleHelpFlag | this_HeadersFlag_8= ruleHeadersFlag | this_VerboseFlag_9= ruleVerboseFlag | this_TimeoutFlag_10= ruleTimeoutFlag ) ;
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
            // InternalCurlBetterThanHttpie.g:356:2: ( (this_ProxyFlag_0= ruleProxyFlag | this_FormFlag_1= ruleFormFlag | this_AuthFlag_2= ruleAuthFlag | this_DownloadFlag_3= ruleDownloadFlag | this_BodyFlag_4= ruleBodyFlag | this_VersionFlag_5= ruleVersionFlag | this_JsonFlag_6= ruleJsonFlag | this_HelpFlag_7= ruleHelpFlag | this_HeadersFlag_8= ruleHeadersFlag | this_VerboseFlag_9= ruleVerboseFlag | this_TimeoutFlag_10= ruleTimeoutFlag ) )
            // InternalCurlBetterThanHttpie.g:357:2: (this_ProxyFlag_0= ruleProxyFlag | this_FormFlag_1= ruleFormFlag | this_AuthFlag_2= ruleAuthFlag | this_DownloadFlag_3= ruleDownloadFlag | this_BodyFlag_4= ruleBodyFlag | this_VersionFlag_5= ruleVersionFlag | this_JsonFlag_6= ruleJsonFlag | this_HelpFlag_7= ruleHelpFlag | this_HeadersFlag_8= ruleHeadersFlag | this_VerboseFlag_9= ruleVerboseFlag | this_TimeoutFlag_10= ruleTimeoutFlag )
            {
            // InternalCurlBetterThanHttpie.g:357:2: (this_ProxyFlag_0= ruleProxyFlag | this_FormFlag_1= ruleFormFlag | this_AuthFlag_2= ruleAuthFlag | this_DownloadFlag_3= ruleDownloadFlag | this_BodyFlag_4= ruleBodyFlag | this_VersionFlag_5= ruleVersionFlag | this_JsonFlag_6= ruleJsonFlag | this_HelpFlag_7= ruleHelpFlag | this_HeadersFlag_8= ruleHeadersFlag | this_VerboseFlag_9= ruleVerboseFlag | this_TimeoutFlag_10= ruleTimeoutFlag )
            int alt13=11;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt13=1;
                }
                break;
            case 24:
            case 25:
                {
                alt13=2;
                }
                break;
            case 29:
            case 30:
                {
                alt13=3;
                }
                break;
            case 31:
            case 32:
                {
                alt13=4;
                }
                break;
            case 20:
            case 21:
                {
                alt13=5;
                }
                break;
            case 35:
                {
                alt13=6;
                }
                break;
            case 22:
            case 23:
                {
                alt13=7;
                }
                break;
            case 33:
            case 34:
                {
                alt13=8;
                }
                break;
            case 18:
            case 19:
                {
                alt13=9;
                }
                break;
            case 36:
            case 37:
                {
                alt13=10;
                }
                break;
            case 38:
                {
                alt13=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:358:3: this_ProxyFlag_0= ruleProxyFlag
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
                    // InternalCurlBetterThanHttpie.g:367:3: this_FormFlag_1= ruleFormFlag
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
                    // InternalCurlBetterThanHttpie.g:376:3: this_AuthFlag_2= ruleAuthFlag
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
                    // InternalCurlBetterThanHttpie.g:385:3: this_DownloadFlag_3= ruleDownloadFlag
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
                    // InternalCurlBetterThanHttpie.g:394:3: this_BodyFlag_4= ruleBodyFlag
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
                    // InternalCurlBetterThanHttpie.g:403:3: this_VersionFlag_5= ruleVersionFlag
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
                    // InternalCurlBetterThanHttpie.g:412:3: this_JsonFlag_6= ruleJsonFlag
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
                    // InternalCurlBetterThanHttpie.g:421:3: this_HelpFlag_7= ruleHelpFlag
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
                    // InternalCurlBetterThanHttpie.g:430:3: this_HeadersFlag_8= ruleHeadersFlag
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
                    // InternalCurlBetterThanHttpie.g:439:3: this_VerboseFlag_9= ruleVerboseFlag
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
                    // InternalCurlBetterThanHttpie.g:448:3: this_TimeoutFlag_10= ruleTimeoutFlag
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
    // InternalCurlBetterThanHttpie.g:460:1: entryRuleHeadersFlag returns [EObject current=null] : iv_ruleHeadersFlag= ruleHeadersFlag EOF ;
    public final EObject entryRuleHeadersFlag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeadersFlag = null;


        try {
            // InternalCurlBetterThanHttpie.g:460:52: (iv_ruleHeadersFlag= ruleHeadersFlag EOF )
            // InternalCurlBetterThanHttpie.g:461:2: iv_ruleHeadersFlag= ruleHeadersFlag EOF
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
    // InternalCurlBetterThanHttpie.g:467:1: ruleHeadersFlag returns [EObject current=null] : ( () (otherlv_1= '--header' | otherlv_2= '-t' ) ) ;
    public final EObject ruleHeadersFlag() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:473:2: ( ( () (otherlv_1= '--header' | otherlv_2= '-t' ) ) )
            // InternalCurlBetterThanHttpie.g:474:2: ( () (otherlv_1= '--header' | otherlv_2= '-t' ) )
            {
            // InternalCurlBetterThanHttpie.g:474:2: ( () (otherlv_1= '--header' | otherlv_2= '-t' ) )
            // InternalCurlBetterThanHttpie.g:475:3: () (otherlv_1= '--header' | otherlv_2= '-t' )
            {
            // InternalCurlBetterThanHttpie.g:475:3: ()
            // InternalCurlBetterThanHttpie.g:476:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHeadersFlagAccess().getHeadersFlagAction_0(),
            					current);
            			

            }

            // InternalCurlBetterThanHttpie.g:482:3: (otherlv_1= '--header' | otherlv_2= '-t' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==18) ) {
                alt14=1;
            }
            else if ( (LA14_0==19) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:483:4: otherlv_1= '--header'
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getHeadersFlagAccess().getHeaderKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:488:4: otherlv_2= '-t'
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_2); 

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
    // InternalCurlBetterThanHttpie.g:497:1: entryRuleBodyFlag returns [EObject current=null] : iv_ruleBodyFlag= ruleBodyFlag EOF ;
    public final EObject entryRuleBodyFlag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyFlag = null;


        try {
            // InternalCurlBetterThanHttpie.g:497:49: (iv_ruleBodyFlag= ruleBodyFlag EOF )
            // InternalCurlBetterThanHttpie.g:498:2: iv_ruleBodyFlag= ruleBodyFlag EOF
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
    // InternalCurlBetterThanHttpie.g:504:1: ruleBodyFlag returns [EObject current=null] : ( () (otherlv_1= '--body' | otherlv_2= '-b' ) ) ;
    public final EObject ruleBodyFlag() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:510:2: ( ( () (otherlv_1= '--body' | otherlv_2= '-b' ) ) )
            // InternalCurlBetterThanHttpie.g:511:2: ( () (otherlv_1= '--body' | otherlv_2= '-b' ) )
            {
            // InternalCurlBetterThanHttpie.g:511:2: ( () (otherlv_1= '--body' | otherlv_2= '-b' ) )
            // InternalCurlBetterThanHttpie.g:512:3: () (otherlv_1= '--body' | otherlv_2= '-b' )
            {
            // InternalCurlBetterThanHttpie.g:512:3: ()
            // InternalCurlBetterThanHttpie.g:513:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBodyFlagAccess().getBodyFlagAction_0(),
            					current);
            			

            }

            // InternalCurlBetterThanHttpie.g:519:3: (otherlv_1= '--body' | otherlv_2= '-b' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==20) ) {
                alt15=1;
            }
            else if ( (LA15_0==21) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:520:4: otherlv_1= '--body'
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getBodyFlagAccess().getBodyKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:525:4: otherlv_2= '-b'
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_2); 

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
    // InternalCurlBetterThanHttpie.g:534:1: entryRuleJsonFlag returns [EObject current=null] : iv_ruleJsonFlag= ruleJsonFlag EOF ;
    public final EObject entryRuleJsonFlag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonFlag = null;


        try {
            // InternalCurlBetterThanHttpie.g:534:49: (iv_ruleJsonFlag= ruleJsonFlag EOF )
            // InternalCurlBetterThanHttpie.g:535:2: iv_ruleJsonFlag= ruleJsonFlag EOF
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
    // InternalCurlBetterThanHttpie.g:541:1: ruleJsonFlag returns [EObject current=null] : ( () (otherlv_1= '--json' | otherlv_2= '-j' ) ) ;
    public final EObject ruleJsonFlag() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:547:2: ( ( () (otherlv_1= '--json' | otherlv_2= '-j' ) ) )
            // InternalCurlBetterThanHttpie.g:548:2: ( () (otherlv_1= '--json' | otherlv_2= '-j' ) )
            {
            // InternalCurlBetterThanHttpie.g:548:2: ( () (otherlv_1= '--json' | otherlv_2= '-j' ) )
            // InternalCurlBetterThanHttpie.g:549:3: () (otherlv_1= '--json' | otherlv_2= '-j' )
            {
            // InternalCurlBetterThanHttpie.g:549:3: ()
            // InternalCurlBetterThanHttpie.g:550:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getJsonFlagAccess().getJsonFlagAction_0(),
            					current);
            			

            }

            // InternalCurlBetterThanHttpie.g:556:3: (otherlv_1= '--json' | otherlv_2= '-j' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==22) ) {
                alt16=1;
            }
            else if ( (LA16_0==23) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:557:4: otherlv_1= '--json'
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getJsonFlagAccess().getJsonKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:562:4: otherlv_2= '-j'
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_2); 

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
    // InternalCurlBetterThanHttpie.g:571:1: entryRuleFormFlag returns [EObject current=null] : iv_ruleFormFlag= ruleFormFlag EOF ;
    public final EObject entryRuleFormFlag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormFlag = null;


        try {
            // InternalCurlBetterThanHttpie.g:571:49: (iv_ruleFormFlag= ruleFormFlag EOF )
            // InternalCurlBetterThanHttpie.g:572:2: iv_ruleFormFlag= ruleFormFlag EOF
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
    // InternalCurlBetterThanHttpie.g:578:1: ruleFormFlag returns [EObject current=null] : ( () (otherlv_1= '--form' | otherlv_2= '-f' ) ) ;
    public final EObject ruleFormFlag() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:584:2: ( ( () (otherlv_1= '--form' | otherlv_2= '-f' ) ) )
            // InternalCurlBetterThanHttpie.g:585:2: ( () (otherlv_1= '--form' | otherlv_2= '-f' ) )
            {
            // InternalCurlBetterThanHttpie.g:585:2: ( () (otherlv_1= '--form' | otherlv_2= '-f' ) )
            // InternalCurlBetterThanHttpie.g:586:3: () (otherlv_1= '--form' | otherlv_2= '-f' )
            {
            // InternalCurlBetterThanHttpie.g:586:3: ()
            // InternalCurlBetterThanHttpie.g:587:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFormFlagAccess().getFormFlagAction_0(),
            					current);
            			

            }

            // InternalCurlBetterThanHttpie.g:593:3: (otherlv_1= '--form' | otherlv_2= '-f' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==24) ) {
                alt17=1;
            }
            else if ( (LA17_0==25) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:594:4: otherlv_1= '--form'
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getFormFlagAccess().getFormKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:599:4: otherlv_2= '-f'
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_2); 

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
    // InternalCurlBetterThanHttpie.g:608:1: entryRuleProxyFlag returns [EObject current=null] : iv_ruleProxyFlag= ruleProxyFlag EOF ;
    public final EObject entryRuleProxyFlag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProxyFlag = null;


        try {
            // InternalCurlBetterThanHttpie.g:608:50: (iv_ruleProxyFlag= ruleProxyFlag EOF )
            // InternalCurlBetterThanHttpie.g:609:2: iv_ruleProxyFlag= ruleProxyFlag EOF
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
    // InternalCurlBetterThanHttpie.g:615:1: ruleProxyFlag returns [EObject current=null] : (otherlv_0= '--proxy' (otherlv_1= '=' | this_WS_2= RULE_WS ) ( ( ( ( (lv_protocol_3_1= RULE_ID | lv_protocol_3_2= RULE_HTTP ) ) ) otherlv_4= ':' ) | ( ( ( (lv_proxyProtocol_5_1= RULE_ID | lv_proxyProtocol_5_2= RULE_HTTP ) ) ) otherlv_6= '://' ) | ( ( ( (lv_protocol_7_1= RULE_ID | lv_protocol_7_2= RULE_HTTP ) ) ) otherlv_8= ':' ( ( (lv_proxyProtocol_9_1= RULE_ID | lv_proxyProtocol_9_2= RULE_HTTP ) ) ) otherlv_10= '://' ) ) ( ( ( (lv_username_11_1= RULE_ID | lv_username_11_2= RULE_HTTP ) ) ) otherlv_12= ':' ( ( (lv_password_13_1= RULE_ID | lv_password_13_2= RULE_HTTP ) ) ) otherlv_14= '@' )? ( ( ( (lv_hostname_15_0= RULE_URL ) ) (otherlv_16= ':' ( (lv_port_17_0= RULE_INT ) ) )? ) | (otherlv_18= ':' ( (lv_port_19_0= RULE_INT ) )? ) ) ) ;
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
            // InternalCurlBetterThanHttpie.g:621:2: ( (otherlv_0= '--proxy' (otherlv_1= '=' | this_WS_2= RULE_WS ) ( ( ( ( (lv_protocol_3_1= RULE_ID | lv_protocol_3_2= RULE_HTTP ) ) ) otherlv_4= ':' ) | ( ( ( (lv_proxyProtocol_5_1= RULE_ID | lv_proxyProtocol_5_2= RULE_HTTP ) ) ) otherlv_6= '://' ) | ( ( ( (lv_protocol_7_1= RULE_ID | lv_protocol_7_2= RULE_HTTP ) ) ) otherlv_8= ':' ( ( (lv_proxyProtocol_9_1= RULE_ID | lv_proxyProtocol_9_2= RULE_HTTP ) ) ) otherlv_10= '://' ) ) ( ( ( (lv_username_11_1= RULE_ID | lv_username_11_2= RULE_HTTP ) ) ) otherlv_12= ':' ( ( (lv_password_13_1= RULE_ID | lv_password_13_2= RULE_HTTP ) ) ) otherlv_14= '@' )? ( ( ( (lv_hostname_15_0= RULE_URL ) ) (otherlv_16= ':' ( (lv_port_17_0= RULE_INT ) ) )? ) | (otherlv_18= ':' ( (lv_port_19_0= RULE_INT ) )? ) ) ) )
            // InternalCurlBetterThanHttpie.g:622:2: (otherlv_0= '--proxy' (otherlv_1= '=' | this_WS_2= RULE_WS ) ( ( ( ( (lv_protocol_3_1= RULE_ID | lv_protocol_3_2= RULE_HTTP ) ) ) otherlv_4= ':' ) | ( ( ( (lv_proxyProtocol_5_1= RULE_ID | lv_proxyProtocol_5_2= RULE_HTTP ) ) ) otherlv_6= '://' ) | ( ( ( (lv_protocol_7_1= RULE_ID | lv_protocol_7_2= RULE_HTTP ) ) ) otherlv_8= ':' ( ( (lv_proxyProtocol_9_1= RULE_ID | lv_proxyProtocol_9_2= RULE_HTTP ) ) ) otherlv_10= '://' ) ) ( ( ( (lv_username_11_1= RULE_ID | lv_username_11_2= RULE_HTTP ) ) ) otherlv_12= ':' ( ( (lv_password_13_1= RULE_ID | lv_password_13_2= RULE_HTTP ) ) ) otherlv_14= '@' )? ( ( ( (lv_hostname_15_0= RULE_URL ) ) (otherlv_16= ':' ( (lv_port_17_0= RULE_INT ) ) )? ) | (otherlv_18= ':' ( (lv_port_19_0= RULE_INT ) )? ) ) )
            {
            // InternalCurlBetterThanHttpie.g:622:2: (otherlv_0= '--proxy' (otherlv_1= '=' | this_WS_2= RULE_WS ) ( ( ( ( (lv_protocol_3_1= RULE_ID | lv_protocol_3_2= RULE_HTTP ) ) ) otherlv_4= ':' ) | ( ( ( (lv_proxyProtocol_5_1= RULE_ID | lv_proxyProtocol_5_2= RULE_HTTP ) ) ) otherlv_6= '://' ) | ( ( ( (lv_protocol_7_1= RULE_ID | lv_protocol_7_2= RULE_HTTP ) ) ) otherlv_8= ':' ( ( (lv_proxyProtocol_9_1= RULE_ID | lv_proxyProtocol_9_2= RULE_HTTP ) ) ) otherlv_10= '://' ) ) ( ( ( (lv_username_11_1= RULE_ID | lv_username_11_2= RULE_HTTP ) ) ) otherlv_12= ':' ( ( (lv_password_13_1= RULE_ID | lv_password_13_2= RULE_HTTP ) ) ) otherlv_14= '@' )? ( ( ( (lv_hostname_15_0= RULE_URL ) ) (otherlv_16= ':' ( (lv_port_17_0= RULE_INT ) ) )? ) | (otherlv_18= ':' ( (lv_port_19_0= RULE_INT ) )? ) ) )
            // InternalCurlBetterThanHttpie.g:623:3: otherlv_0= '--proxy' (otherlv_1= '=' | this_WS_2= RULE_WS ) ( ( ( ( (lv_protocol_3_1= RULE_ID | lv_protocol_3_2= RULE_HTTP ) ) ) otherlv_4= ':' ) | ( ( ( (lv_proxyProtocol_5_1= RULE_ID | lv_proxyProtocol_5_2= RULE_HTTP ) ) ) otherlv_6= '://' ) | ( ( ( (lv_protocol_7_1= RULE_ID | lv_protocol_7_2= RULE_HTTP ) ) ) otherlv_8= ':' ( ( (lv_proxyProtocol_9_1= RULE_ID | lv_proxyProtocol_9_2= RULE_HTTP ) ) ) otherlv_10= '://' ) ) ( ( ( (lv_username_11_1= RULE_ID | lv_username_11_2= RULE_HTTP ) ) ) otherlv_12= ':' ( ( (lv_password_13_1= RULE_ID | lv_password_13_2= RULE_HTTP ) ) ) otherlv_14= '@' )? ( ( ( (lv_hostname_15_0= RULE_URL ) ) (otherlv_16= ':' ( (lv_port_17_0= RULE_INT ) ) )? ) | (otherlv_18= ':' ( (lv_port_19_0= RULE_INT ) )? ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getProxyFlagAccess().getProxyKeyword_0());
            		
            // InternalCurlBetterThanHttpie.g:627:3: (otherlv_1= '=' | this_WS_2= RULE_WS )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==27) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_WS) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:628:4: otherlv_1= '='
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getProxyFlagAccess().getEqualsSignKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:633:4: this_WS_2= RULE_WS
                    {
                    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_13); 

                    				newLeafNode(this_WS_2, grammarAccess.getProxyFlagAccess().getWSTerminalRuleCall_1_1());
                    			

                    }
                    break;

            }

            // InternalCurlBetterThanHttpie.g:638:3: ( ( ( ( (lv_protocol_3_1= RULE_ID | lv_protocol_3_2= RULE_HTTP ) ) ) otherlv_4= ':' ) | ( ( ( (lv_proxyProtocol_5_1= RULE_ID | lv_proxyProtocol_5_2= RULE_HTTP ) ) ) otherlv_6= '://' ) | ( ( ( (lv_protocol_7_1= RULE_ID | lv_protocol_7_2= RULE_HTTP ) ) ) otherlv_8= ':' ( ( (lv_proxyProtocol_9_1= RULE_ID | lv_proxyProtocol_9_2= RULE_HTTP ) ) ) otherlv_10= '://' ) )
            int alt23=3;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==14) ) {
                    alt23=2;
                }
                else if ( (LA23_1==15) ) {
                    switch ( input.LA(3) ) {
                    case RULE_ID:
                        {
                        int LA23_5 = input.LA(4);

                        if ( (LA23_5==15) ) {
                            alt23=1;
                        }
                        else if ( (LA23_5==14) ) {
                            alt23=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 23, 5, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_HTTP:
                        {
                        int LA23_6 = input.LA(4);

                        if ( (LA23_6==14) ) {
                            alt23=3;
                        }
                        else if ( (LA23_6==15) ) {
                            alt23=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 23, 6, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_URL:
                    case 15:
                        {
                        alt23=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 4, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA23_0==RULE_HTTP) ) {
                int LA23_2 = input.LA(2);

                if ( (LA23_2==15) ) {
                    switch ( input.LA(3) ) {
                    case RULE_ID:
                        {
                        int LA23_5 = input.LA(4);

                        if ( (LA23_5==15) ) {
                            alt23=1;
                        }
                        else if ( (LA23_5==14) ) {
                            alt23=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 23, 5, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_HTTP:
                        {
                        int LA23_6 = input.LA(4);

                        if ( (LA23_6==14) ) {
                            alt23=3;
                        }
                        else if ( (LA23_6==15) ) {
                            alt23=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 23, 6, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_URL:
                    case 15:
                        {
                        alt23=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 4, input);

                        throw nvae;
                    }

                }
                else if ( (LA23_2==14) ) {
                    alt23=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:639:4: ( ( ( (lv_protocol_3_1= RULE_ID | lv_protocol_3_2= RULE_HTTP ) ) ) otherlv_4= ':' )
                    {
                    // InternalCurlBetterThanHttpie.g:639:4: ( ( ( (lv_protocol_3_1= RULE_ID | lv_protocol_3_2= RULE_HTTP ) ) ) otherlv_4= ':' )
                    // InternalCurlBetterThanHttpie.g:640:5: ( ( (lv_protocol_3_1= RULE_ID | lv_protocol_3_2= RULE_HTTP ) ) ) otherlv_4= ':'
                    {
                    // InternalCurlBetterThanHttpie.g:640:5: ( ( (lv_protocol_3_1= RULE_ID | lv_protocol_3_2= RULE_HTTP ) ) )
                    // InternalCurlBetterThanHttpie.g:641:6: ( (lv_protocol_3_1= RULE_ID | lv_protocol_3_2= RULE_HTTP ) )
                    {
                    // InternalCurlBetterThanHttpie.g:641:6: ( (lv_protocol_3_1= RULE_ID | lv_protocol_3_2= RULE_HTTP ) )
                    // InternalCurlBetterThanHttpie.g:642:7: (lv_protocol_3_1= RULE_ID | lv_protocol_3_2= RULE_HTTP )
                    {
                    // InternalCurlBetterThanHttpie.g:642:7: (lv_protocol_3_1= RULE_ID | lv_protocol_3_2= RULE_HTTP )
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
                            // InternalCurlBetterThanHttpie.g:643:8: lv_protocol_3_1= RULE_ID
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
                            // InternalCurlBetterThanHttpie.g:658:8: lv_protocol_3_2= RULE_HTTP
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

                    otherlv_4=(Token)match(input,15,FOLLOW_6); 

                    					newLeafNode(otherlv_4, grammarAccess.getProxyFlagAccess().getColonKeyword_2_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:681:4: ( ( ( (lv_proxyProtocol_5_1= RULE_ID | lv_proxyProtocol_5_2= RULE_HTTP ) ) ) otherlv_6= '://' )
                    {
                    // InternalCurlBetterThanHttpie.g:681:4: ( ( ( (lv_proxyProtocol_5_1= RULE_ID | lv_proxyProtocol_5_2= RULE_HTTP ) ) ) otherlv_6= '://' )
                    // InternalCurlBetterThanHttpie.g:682:5: ( ( (lv_proxyProtocol_5_1= RULE_ID | lv_proxyProtocol_5_2= RULE_HTTP ) ) ) otherlv_6= '://'
                    {
                    // InternalCurlBetterThanHttpie.g:682:5: ( ( (lv_proxyProtocol_5_1= RULE_ID | lv_proxyProtocol_5_2= RULE_HTTP ) ) )
                    // InternalCurlBetterThanHttpie.g:683:6: ( (lv_proxyProtocol_5_1= RULE_ID | lv_proxyProtocol_5_2= RULE_HTTP ) )
                    {
                    // InternalCurlBetterThanHttpie.g:683:6: ( (lv_proxyProtocol_5_1= RULE_ID | lv_proxyProtocol_5_2= RULE_HTTP ) )
                    // InternalCurlBetterThanHttpie.g:684:7: (lv_proxyProtocol_5_1= RULE_ID | lv_proxyProtocol_5_2= RULE_HTTP )
                    {
                    // InternalCurlBetterThanHttpie.g:684:7: (lv_proxyProtocol_5_1= RULE_ID | lv_proxyProtocol_5_2= RULE_HTTP )
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
                            // InternalCurlBetterThanHttpie.g:685:8: lv_proxyProtocol_5_1= RULE_ID
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
                            // InternalCurlBetterThanHttpie.g:700:8: lv_proxyProtocol_5_2= RULE_HTTP
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

                    otherlv_6=(Token)match(input,14,FOLLOW_6); 

                    					newLeafNode(otherlv_6, grammarAccess.getProxyFlagAccess().getColonSolidusSolidusKeyword_2_1_1());
                    				

                    }


                    }
                    break;
                case 3 :
                    // InternalCurlBetterThanHttpie.g:723:4: ( ( ( (lv_protocol_7_1= RULE_ID | lv_protocol_7_2= RULE_HTTP ) ) ) otherlv_8= ':' ( ( (lv_proxyProtocol_9_1= RULE_ID | lv_proxyProtocol_9_2= RULE_HTTP ) ) ) otherlv_10= '://' )
                    {
                    // InternalCurlBetterThanHttpie.g:723:4: ( ( ( (lv_protocol_7_1= RULE_ID | lv_protocol_7_2= RULE_HTTP ) ) ) otherlv_8= ':' ( ( (lv_proxyProtocol_9_1= RULE_ID | lv_proxyProtocol_9_2= RULE_HTTP ) ) ) otherlv_10= '://' )
                    // InternalCurlBetterThanHttpie.g:724:5: ( ( (lv_protocol_7_1= RULE_ID | lv_protocol_7_2= RULE_HTTP ) ) ) otherlv_8= ':' ( ( (lv_proxyProtocol_9_1= RULE_ID | lv_proxyProtocol_9_2= RULE_HTTP ) ) ) otherlv_10= '://'
                    {
                    // InternalCurlBetterThanHttpie.g:724:5: ( ( (lv_protocol_7_1= RULE_ID | lv_protocol_7_2= RULE_HTTP ) ) )
                    // InternalCurlBetterThanHttpie.g:725:6: ( (lv_protocol_7_1= RULE_ID | lv_protocol_7_2= RULE_HTTP ) )
                    {
                    // InternalCurlBetterThanHttpie.g:725:6: ( (lv_protocol_7_1= RULE_ID | lv_protocol_7_2= RULE_HTTP ) )
                    // InternalCurlBetterThanHttpie.g:726:7: (lv_protocol_7_1= RULE_ID | lv_protocol_7_2= RULE_HTTP )
                    {
                    // InternalCurlBetterThanHttpie.g:726:7: (lv_protocol_7_1= RULE_ID | lv_protocol_7_2= RULE_HTTP )
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
                            // InternalCurlBetterThanHttpie.g:727:8: lv_protocol_7_1= RULE_ID
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
                            // InternalCurlBetterThanHttpie.g:742:8: lv_protocol_7_2= RULE_HTTP
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

                    otherlv_8=(Token)match(input,15,FOLLOW_13); 

                    					newLeafNode(otherlv_8, grammarAccess.getProxyFlagAccess().getColonKeyword_2_2_1());
                    				
                    // InternalCurlBetterThanHttpie.g:763:5: ( ( (lv_proxyProtocol_9_1= RULE_ID | lv_proxyProtocol_9_2= RULE_HTTP ) ) )
                    // InternalCurlBetterThanHttpie.g:764:6: ( (lv_proxyProtocol_9_1= RULE_ID | lv_proxyProtocol_9_2= RULE_HTTP ) )
                    {
                    // InternalCurlBetterThanHttpie.g:764:6: ( (lv_proxyProtocol_9_1= RULE_ID | lv_proxyProtocol_9_2= RULE_HTTP ) )
                    // InternalCurlBetterThanHttpie.g:765:7: (lv_proxyProtocol_9_1= RULE_ID | lv_proxyProtocol_9_2= RULE_HTTP )
                    {
                    // InternalCurlBetterThanHttpie.g:765:7: (lv_proxyProtocol_9_1= RULE_ID | lv_proxyProtocol_9_2= RULE_HTTP )
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==RULE_ID) ) {
                        alt22=1;
                    }
                    else if ( (LA22_0==RULE_HTTP) ) {
                        alt22=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 0, input);

                        throw nvae;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalCurlBetterThanHttpie.g:766:8: lv_proxyProtocol_9_1= RULE_ID
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
                            // InternalCurlBetterThanHttpie.g:781:8: lv_proxyProtocol_9_2= RULE_HTTP
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

                    otherlv_10=(Token)match(input,14,FOLLOW_6); 

                    					newLeafNode(otherlv_10, grammarAccess.getProxyFlagAccess().getColonSolidusSolidusKeyword_2_2_3());
                    				

                    }


                    }
                    break;

            }

            // InternalCurlBetterThanHttpie.g:804:3: ( ( ( (lv_username_11_1= RULE_ID | lv_username_11_2= RULE_HTTP ) ) ) otherlv_12= ':' ( ( (lv_password_13_1= RULE_ID | lv_password_13_2= RULE_HTTP ) ) ) otherlv_14= '@' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_HTTP||LA26_0==RULE_ID) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:805:4: ( ( (lv_username_11_1= RULE_ID | lv_username_11_2= RULE_HTTP ) ) ) otherlv_12= ':' ( ( (lv_password_13_1= RULE_ID | lv_password_13_2= RULE_HTTP ) ) ) otherlv_14= '@'
                    {
                    // InternalCurlBetterThanHttpie.g:805:4: ( ( (lv_username_11_1= RULE_ID | lv_username_11_2= RULE_HTTP ) ) )
                    // InternalCurlBetterThanHttpie.g:806:5: ( (lv_username_11_1= RULE_ID | lv_username_11_2= RULE_HTTP ) )
                    {
                    // InternalCurlBetterThanHttpie.g:806:5: ( (lv_username_11_1= RULE_ID | lv_username_11_2= RULE_HTTP ) )
                    // InternalCurlBetterThanHttpie.g:807:6: (lv_username_11_1= RULE_ID | lv_username_11_2= RULE_HTTP )
                    {
                    // InternalCurlBetterThanHttpie.g:807:6: (lv_username_11_1= RULE_ID | lv_username_11_2= RULE_HTTP )
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
                            // InternalCurlBetterThanHttpie.g:808:7: lv_username_11_1= RULE_ID
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
                            // InternalCurlBetterThanHttpie.g:823:7: lv_username_11_2= RULE_HTTP
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

                    otherlv_12=(Token)match(input,15,FOLLOW_13); 

                    				newLeafNode(otherlv_12, grammarAccess.getProxyFlagAccess().getColonKeyword_3_1());
                    			
                    // InternalCurlBetterThanHttpie.g:844:4: ( ( (lv_password_13_1= RULE_ID | lv_password_13_2= RULE_HTTP ) ) )
                    // InternalCurlBetterThanHttpie.g:845:5: ( (lv_password_13_1= RULE_ID | lv_password_13_2= RULE_HTTP ) )
                    {
                    // InternalCurlBetterThanHttpie.g:845:5: ( (lv_password_13_1= RULE_ID | lv_password_13_2= RULE_HTTP ) )
                    // InternalCurlBetterThanHttpie.g:846:6: (lv_password_13_1= RULE_ID | lv_password_13_2= RULE_HTTP )
                    {
                    // InternalCurlBetterThanHttpie.g:846:6: (lv_password_13_1= RULE_ID | lv_password_13_2= RULE_HTTP )
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==RULE_ID) ) {
                        alt25=1;
                    }
                    else if ( (LA25_0==RULE_HTTP) ) {
                        alt25=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 0, input);

                        throw nvae;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalCurlBetterThanHttpie.g:847:7: lv_password_13_1= RULE_ID
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
                            // InternalCurlBetterThanHttpie.g:862:7: lv_password_13_2= RULE_HTTP
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

                    otherlv_14=(Token)match(input,28,FOLLOW_8); 

                    				newLeafNode(otherlv_14, grammarAccess.getProxyFlagAccess().getCommercialAtKeyword_3_3());
                    			

                    }
                    break;

            }

            // InternalCurlBetterThanHttpie.g:884:3: ( ( ( (lv_hostname_15_0= RULE_URL ) ) (otherlv_16= ':' ( (lv_port_17_0= RULE_INT ) ) )? ) | (otherlv_18= ':' ( (lv_port_19_0= RULE_INT ) )? ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_URL) ) {
                alt29=1;
            }
            else if ( (LA29_0==15) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:885:4: ( ( (lv_hostname_15_0= RULE_URL ) ) (otherlv_16= ':' ( (lv_port_17_0= RULE_INT ) ) )? )
                    {
                    // InternalCurlBetterThanHttpie.g:885:4: ( ( (lv_hostname_15_0= RULE_URL ) ) (otherlv_16= ':' ( (lv_port_17_0= RULE_INT ) ) )? )
                    // InternalCurlBetterThanHttpie.g:886:5: ( (lv_hostname_15_0= RULE_URL ) ) (otherlv_16= ':' ( (lv_port_17_0= RULE_INT ) ) )?
                    {
                    // InternalCurlBetterThanHttpie.g:886:5: ( (lv_hostname_15_0= RULE_URL ) )
                    // InternalCurlBetterThanHttpie.g:887:6: (lv_hostname_15_0= RULE_URL )
                    {
                    // InternalCurlBetterThanHttpie.g:887:6: (lv_hostname_15_0= RULE_URL )
                    // InternalCurlBetterThanHttpie.g:888:7: lv_hostname_15_0= RULE_URL
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

                    // InternalCurlBetterThanHttpie.g:904:5: (otherlv_16= ':' ( (lv_port_17_0= RULE_INT ) ) )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==15) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalCurlBetterThanHttpie.g:905:6: otherlv_16= ':' ( (lv_port_17_0= RULE_INT ) )
                            {
                            otherlv_16=(Token)match(input,15,FOLLOW_10); 

                            						newLeafNode(otherlv_16, grammarAccess.getProxyFlagAccess().getColonKeyword_4_0_1_0());
                            					
                            // InternalCurlBetterThanHttpie.g:909:6: ( (lv_port_17_0= RULE_INT ) )
                            // InternalCurlBetterThanHttpie.g:910:7: (lv_port_17_0= RULE_INT )
                            {
                            // InternalCurlBetterThanHttpie.g:910:7: (lv_port_17_0= RULE_INT )
                            // InternalCurlBetterThanHttpie.g:911:8: lv_port_17_0= RULE_INT
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
                    // InternalCurlBetterThanHttpie.g:930:4: (otherlv_18= ':' ( (lv_port_19_0= RULE_INT ) )? )
                    {
                    // InternalCurlBetterThanHttpie.g:930:4: (otherlv_18= ':' ( (lv_port_19_0= RULE_INT ) )? )
                    // InternalCurlBetterThanHttpie.g:931:5: otherlv_18= ':' ( (lv_port_19_0= RULE_INT ) )?
                    {
                    otherlv_18=(Token)match(input,15,FOLLOW_20); 

                    					newLeafNode(otherlv_18, grammarAccess.getProxyFlagAccess().getColonKeyword_4_1_0());
                    				
                    // InternalCurlBetterThanHttpie.g:935:5: ( (lv_port_19_0= RULE_INT ) )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==RULE_INT) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalCurlBetterThanHttpie.g:936:6: (lv_port_19_0= RULE_INT )
                            {
                            // InternalCurlBetterThanHttpie.g:936:6: (lv_port_19_0= RULE_INT )
                            // InternalCurlBetterThanHttpie.g:937:7: lv_port_19_0= RULE_INT
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
    // InternalCurlBetterThanHttpie.g:959:1: entryRuleAuthFlag returns [EObject current=null] : iv_ruleAuthFlag= ruleAuthFlag EOF ;
    public final EObject entryRuleAuthFlag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAuthFlag = null;


        try {
            // InternalCurlBetterThanHttpie.g:959:49: (iv_ruleAuthFlag= ruleAuthFlag EOF )
            // InternalCurlBetterThanHttpie.g:960:2: iv_ruleAuthFlag= ruleAuthFlag EOF
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
    // InternalCurlBetterThanHttpie.g:966:1: ruleAuthFlag returns [EObject current=null] : ( (otherlv_0= '--auth' | otherlv_1= '-a' ) (otherlv_2= '=' | this_WS_3= RULE_WS ) ( ( (lv_username_4_1= RULE_ID | lv_username_4_2= RULE_HTTP ) ) ) (otherlv_5= ':' ( ( (lv_password_6_1= RULE_ID | lv_password_6_2= RULE_HTTP ) ) ) )? (otherlv_7= '@' ( ( (lv_hostname_8_0= RULE_URL ) ) | otherlv_9= ':' ) )? ) ;
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
            // InternalCurlBetterThanHttpie.g:972:2: ( ( (otherlv_0= '--auth' | otherlv_1= '-a' ) (otherlv_2= '=' | this_WS_3= RULE_WS ) ( ( (lv_username_4_1= RULE_ID | lv_username_4_2= RULE_HTTP ) ) ) (otherlv_5= ':' ( ( (lv_password_6_1= RULE_ID | lv_password_6_2= RULE_HTTP ) ) ) )? (otherlv_7= '@' ( ( (lv_hostname_8_0= RULE_URL ) ) | otherlv_9= ':' ) )? ) )
            // InternalCurlBetterThanHttpie.g:973:2: ( (otherlv_0= '--auth' | otherlv_1= '-a' ) (otherlv_2= '=' | this_WS_3= RULE_WS ) ( ( (lv_username_4_1= RULE_ID | lv_username_4_2= RULE_HTTP ) ) ) (otherlv_5= ':' ( ( (lv_password_6_1= RULE_ID | lv_password_6_2= RULE_HTTP ) ) ) )? (otherlv_7= '@' ( ( (lv_hostname_8_0= RULE_URL ) ) | otherlv_9= ':' ) )? )
            {
            // InternalCurlBetterThanHttpie.g:973:2: ( (otherlv_0= '--auth' | otherlv_1= '-a' ) (otherlv_2= '=' | this_WS_3= RULE_WS ) ( ( (lv_username_4_1= RULE_ID | lv_username_4_2= RULE_HTTP ) ) ) (otherlv_5= ':' ( ( (lv_password_6_1= RULE_ID | lv_password_6_2= RULE_HTTP ) ) ) )? (otherlv_7= '@' ( ( (lv_hostname_8_0= RULE_URL ) ) | otherlv_9= ':' ) )? )
            // InternalCurlBetterThanHttpie.g:974:3: (otherlv_0= '--auth' | otherlv_1= '-a' ) (otherlv_2= '=' | this_WS_3= RULE_WS ) ( ( (lv_username_4_1= RULE_ID | lv_username_4_2= RULE_HTTP ) ) ) (otherlv_5= ':' ( ( (lv_password_6_1= RULE_ID | lv_password_6_2= RULE_HTTP ) ) ) )? (otherlv_7= '@' ( ( (lv_hostname_8_0= RULE_URL ) ) | otherlv_9= ':' ) )?
            {
            // InternalCurlBetterThanHttpie.g:974:3: (otherlv_0= '--auth' | otherlv_1= '-a' )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==29) ) {
                alt30=1;
            }
            else if ( (LA30_0==30) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:975:4: otherlv_0= '--auth'
                    {
                    otherlv_0=(Token)match(input,29,FOLLOW_16); 

                    				newLeafNode(otherlv_0, grammarAccess.getAuthFlagAccess().getAuthKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:980:4: otherlv_1= '-a'
                    {
                    otherlv_1=(Token)match(input,30,FOLLOW_16); 

                    				newLeafNode(otherlv_1, grammarAccess.getAuthFlagAccess().getAKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalCurlBetterThanHttpie.g:985:3: (otherlv_2= '=' | this_WS_3= RULE_WS )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==27) ) {
                alt31=1;
            }
            else if ( (LA31_0==RULE_WS) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:986:4: otherlv_2= '='
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_13); 

                    				newLeafNode(otherlv_2, grammarAccess.getAuthFlagAccess().getEqualsSignKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:991:4: this_WS_3= RULE_WS
                    {
                    this_WS_3=(Token)match(input,RULE_WS,FOLLOW_13); 

                    				newLeafNode(this_WS_3, grammarAccess.getAuthFlagAccess().getWSTerminalRuleCall_1_1());
                    			

                    }
                    break;

            }

            // InternalCurlBetterThanHttpie.g:996:3: ( ( (lv_username_4_1= RULE_ID | lv_username_4_2= RULE_HTTP ) ) )
            // InternalCurlBetterThanHttpie.g:997:4: ( (lv_username_4_1= RULE_ID | lv_username_4_2= RULE_HTTP ) )
            {
            // InternalCurlBetterThanHttpie.g:997:4: ( (lv_username_4_1= RULE_ID | lv_username_4_2= RULE_HTTP ) )
            // InternalCurlBetterThanHttpie.g:998:5: (lv_username_4_1= RULE_ID | lv_username_4_2= RULE_HTTP )
            {
            // InternalCurlBetterThanHttpie.g:998:5: (lv_username_4_1= RULE_ID | lv_username_4_2= RULE_HTTP )
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
                    // InternalCurlBetterThanHttpie.g:999:6: lv_username_4_1= RULE_ID
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
                    // InternalCurlBetterThanHttpie.g:1014:6: lv_username_4_2= RULE_HTTP
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

            // InternalCurlBetterThanHttpie.g:1031:3: (otherlv_5= ':' ( ( (lv_password_6_1= RULE_ID | lv_password_6_2= RULE_HTTP ) ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==15) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1032:4: otherlv_5= ':' ( ( (lv_password_6_1= RULE_ID | lv_password_6_2= RULE_HTTP ) ) )
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_13); 

                    				newLeafNode(otherlv_5, grammarAccess.getAuthFlagAccess().getColonKeyword_3_0());
                    			
                    // InternalCurlBetterThanHttpie.g:1036:4: ( ( (lv_password_6_1= RULE_ID | lv_password_6_2= RULE_HTTP ) ) )
                    // InternalCurlBetterThanHttpie.g:1037:5: ( (lv_password_6_1= RULE_ID | lv_password_6_2= RULE_HTTP ) )
                    {
                    // InternalCurlBetterThanHttpie.g:1037:5: ( (lv_password_6_1= RULE_ID | lv_password_6_2= RULE_HTTP ) )
                    // InternalCurlBetterThanHttpie.g:1038:6: (lv_password_6_1= RULE_ID | lv_password_6_2= RULE_HTTP )
                    {
                    // InternalCurlBetterThanHttpie.g:1038:6: (lv_password_6_1= RULE_ID | lv_password_6_2= RULE_HTTP )
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==RULE_ID) ) {
                        alt33=1;
                    }
                    else if ( (LA33_0==RULE_HTTP) ) {
                        alt33=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 0, input);

                        throw nvae;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalCurlBetterThanHttpie.g:1039:7: lv_password_6_1= RULE_ID
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
                            // InternalCurlBetterThanHttpie.g:1054:7: lv_password_6_2= RULE_HTTP
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

            // InternalCurlBetterThanHttpie.g:1072:3: (otherlv_7= '@' ( ( (lv_hostname_8_0= RULE_URL ) ) | otherlv_9= ':' ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==28) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1073:4: otherlv_7= '@' ( ( (lv_hostname_8_0= RULE_URL ) ) | otherlv_9= ':' )
                    {
                    otherlv_7=(Token)match(input,28,FOLLOW_8); 

                    				newLeafNode(otherlv_7, grammarAccess.getAuthFlagAccess().getCommercialAtKeyword_4_0());
                    			
                    // InternalCurlBetterThanHttpie.g:1077:4: ( ( (lv_hostname_8_0= RULE_URL ) ) | otherlv_9= ':' )
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==RULE_URL) ) {
                        alt35=1;
                    }
                    else if ( (LA35_0==15) ) {
                        alt35=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 0, input);

                        throw nvae;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalCurlBetterThanHttpie.g:1078:5: ( (lv_hostname_8_0= RULE_URL ) )
                            {
                            // InternalCurlBetterThanHttpie.g:1078:5: ( (lv_hostname_8_0= RULE_URL ) )
                            // InternalCurlBetterThanHttpie.g:1079:6: (lv_hostname_8_0= RULE_URL )
                            {
                            // InternalCurlBetterThanHttpie.g:1079:6: (lv_hostname_8_0= RULE_URL )
                            // InternalCurlBetterThanHttpie.g:1080:7: lv_hostname_8_0= RULE_URL
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
                            // InternalCurlBetterThanHttpie.g:1097:5: otherlv_9= ':'
                            {
                            otherlv_9=(Token)match(input,15,FOLLOW_2); 

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
    // InternalCurlBetterThanHttpie.g:1107:1: entryRuleDownloadFlag returns [EObject current=null] : iv_ruleDownloadFlag= ruleDownloadFlag EOF ;
    public final EObject entryRuleDownloadFlag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDownloadFlag = null;


        try {
            // InternalCurlBetterThanHttpie.g:1107:53: (iv_ruleDownloadFlag= ruleDownloadFlag EOF )
            // InternalCurlBetterThanHttpie.g:1108:2: iv_ruleDownloadFlag= ruleDownloadFlag EOF
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
    // InternalCurlBetterThanHttpie.g:1114:1: ruleDownloadFlag returns [EObject current=null] : ( () (otherlv_1= '--download' | otherlv_2= '-d' ) ) ;
    public final EObject ruleDownloadFlag() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:1120:2: ( ( () (otherlv_1= '--download' | otherlv_2= '-d' ) ) )
            // InternalCurlBetterThanHttpie.g:1121:2: ( () (otherlv_1= '--download' | otherlv_2= '-d' ) )
            {
            // InternalCurlBetterThanHttpie.g:1121:2: ( () (otherlv_1= '--download' | otherlv_2= '-d' ) )
            // InternalCurlBetterThanHttpie.g:1122:3: () (otherlv_1= '--download' | otherlv_2= '-d' )
            {
            // InternalCurlBetterThanHttpie.g:1122:3: ()
            // InternalCurlBetterThanHttpie.g:1123:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDownloadFlagAccess().getDownloadFlagAction_0(),
            					current);
            			

            }

            // InternalCurlBetterThanHttpie.g:1129:3: (otherlv_1= '--download' | otherlv_2= '-d' )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==31) ) {
                alt37=1;
            }
            else if ( (LA37_0==32) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1130:4: otherlv_1= '--download'
                    {
                    otherlv_1=(Token)match(input,31,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getDownloadFlagAccess().getDownloadKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:1135:4: otherlv_2= '-d'
                    {
                    otherlv_2=(Token)match(input,32,FOLLOW_2); 

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
    // InternalCurlBetterThanHttpie.g:1144:1: entryRuleHelpFlag returns [EObject current=null] : iv_ruleHelpFlag= ruleHelpFlag EOF ;
    public final EObject entryRuleHelpFlag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHelpFlag = null;


        try {
            // InternalCurlBetterThanHttpie.g:1144:49: (iv_ruleHelpFlag= ruleHelpFlag EOF )
            // InternalCurlBetterThanHttpie.g:1145:2: iv_ruleHelpFlag= ruleHelpFlag EOF
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
    // InternalCurlBetterThanHttpie.g:1151:1: ruleHelpFlag returns [EObject current=null] : ( () (otherlv_1= '--help' | otherlv_2= '-h' ) ) ;
    public final EObject ruleHelpFlag() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:1157:2: ( ( () (otherlv_1= '--help' | otherlv_2= '-h' ) ) )
            // InternalCurlBetterThanHttpie.g:1158:2: ( () (otherlv_1= '--help' | otherlv_2= '-h' ) )
            {
            // InternalCurlBetterThanHttpie.g:1158:2: ( () (otherlv_1= '--help' | otherlv_2= '-h' ) )
            // InternalCurlBetterThanHttpie.g:1159:3: () (otherlv_1= '--help' | otherlv_2= '-h' )
            {
            // InternalCurlBetterThanHttpie.g:1159:3: ()
            // InternalCurlBetterThanHttpie.g:1160:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHelpFlagAccess().getHelpFlagAction_0(),
            					current);
            			

            }

            // InternalCurlBetterThanHttpie.g:1166:3: (otherlv_1= '--help' | otherlv_2= '-h' )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==33) ) {
                alt38=1;
            }
            else if ( (LA38_0==34) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1167:4: otherlv_1= '--help'
                    {
                    otherlv_1=(Token)match(input,33,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getHelpFlagAccess().getHelpKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:1172:4: otherlv_2= '-h'
                    {
                    otherlv_2=(Token)match(input,34,FOLLOW_2); 

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
    // InternalCurlBetterThanHttpie.g:1181:1: entryRuleVersionFlag returns [EObject current=null] : iv_ruleVersionFlag= ruleVersionFlag EOF ;
    public final EObject entryRuleVersionFlag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersionFlag = null;


        try {
            // InternalCurlBetterThanHttpie.g:1181:52: (iv_ruleVersionFlag= ruleVersionFlag EOF )
            // InternalCurlBetterThanHttpie.g:1182:2: iv_ruleVersionFlag= ruleVersionFlag EOF
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
    // InternalCurlBetterThanHttpie.g:1188:1: ruleVersionFlag returns [EObject current=null] : ( () otherlv_1= '--version' ) ;
    public final EObject ruleVersionFlag() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:1194:2: ( ( () otherlv_1= '--version' ) )
            // InternalCurlBetterThanHttpie.g:1195:2: ( () otherlv_1= '--version' )
            {
            // InternalCurlBetterThanHttpie.g:1195:2: ( () otherlv_1= '--version' )
            // InternalCurlBetterThanHttpie.g:1196:3: () otherlv_1= '--version'
            {
            // InternalCurlBetterThanHttpie.g:1196:3: ()
            // InternalCurlBetterThanHttpie.g:1197:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVersionFlagAccess().getVersionFlagAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_2); 

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
    // InternalCurlBetterThanHttpie.g:1211:1: entryRuleVerboseFlag returns [EObject current=null] : iv_ruleVerboseFlag= ruleVerboseFlag EOF ;
    public final EObject entryRuleVerboseFlag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerboseFlag = null;


        try {
            // InternalCurlBetterThanHttpie.g:1211:52: (iv_ruleVerboseFlag= ruleVerboseFlag EOF )
            // InternalCurlBetterThanHttpie.g:1212:2: iv_ruleVerboseFlag= ruleVerboseFlag EOF
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
    // InternalCurlBetterThanHttpie.g:1218:1: ruleVerboseFlag returns [EObject current=null] : ( () (otherlv_1= '--verbose' | otherlv_2= '-v' ) ) ;
    public final EObject ruleVerboseFlag() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:1224:2: ( ( () (otherlv_1= '--verbose' | otherlv_2= '-v' ) ) )
            // InternalCurlBetterThanHttpie.g:1225:2: ( () (otherlv_1= '--verbose' | otherlv_2= '-v' ) )
            {
            // InternalCurlBetterThanHttpie.g:1225:2: ( () (otherlv_1= '--verbose' | otherlv_2= '-v' ) )
            // InternalCurlBetterThanHttpie.g:1226:3: () (otherlv_1= '--verbose' | otherlv_2= '-v' )
            {
            // InternalCurlBetterThanHttpie.g:1226:3: ()
            // InternalCurlBetterThanHttpie.g:1227:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVerboseFlagAccess().getVerboseFlagAction_0(),
            					current);
            			

            }

            // InternalCurlBetterThanHttpie.g:1233:3: (otherlv_1= '--verbose' | otherlv_2= '-v' )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==36) ) {
                alt39=1;
            }
            else if ( (LA39_0==37) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1234:4: otherlv_1= '--verbose'
                    {
                    otherlv_1=(Token)match(input,36,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getVerboseFlagAccess().getVerboseKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:1239:4: otherlv_2= '-v'
                    {
                    otherlv_2=(Token)match(input,37,FOLLOW_2); 

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
    // InternalCurlBetterThanHttpie.g:1248:1: entryRuleTimeoutFlag returns [EObject current=null] : iv_ruleTimeoutFlag= ruleTimeoutFlag EOF ;
    public final EObject entryRuleTimeoutFlag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeoutFlag = null;


        try {
            // InternalCurlBetterThanHttpie.g:1248:52: (iv_ruleTimeoutFlag= ruleTimeoutFlag EOF )
            // InternalCurlBetterThanHttpie.g:1249:2: iv_ruleTimeoutFlag= ruleTimeoutFlag EOF
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
    // InternalCurlBetterThanHttpie.g:1255:1: ruleTimeoutFlag returns [EObject current=null] : (otherlv_0= '--timeout' (otherlv_1= '=' | this_WS_2= RULE_WS ) ( (lv_timeout_3_0= RULE_FLOAT ) ) ) ;
    public final EObject ruleTimeoutFlag() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_WS_2=null;
        Token lv_timeout_3_0=null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:1261:2: ( (otherlv_0= '--timeout' (otherlv_1= '=' | this_WS_2= RULE_WS ) ( (lv_timeout_3_0= RULE_FLOAT ) ) ) )
            // InternalCurlBetterThanHttpie.g:1262:2: (otherlv_0= '--timeout' (otherlv_1= '=' | this_WS_2= RULE_WS ) ( (lv_timeout_3_0= RULE_FLOAT ) ) )
            {
            // InternalCurlBetterThanHttpie.g:1262:2: (otherlv_0= '--timeout' (otherlv_1= '=' | this_WS_2= RULE_WS ) ( (lv_timeout_3_0= RULE_FLOAT ) ) )
            // InternalCurlBetterThanHttpie.g:1263:3: otherlv_0= '--timeout' (otherlv_1= '=' | this_WS_2= RULE_WS ) ( (lv_timeout_3_0= RULE_FLOAT ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getTimeoutFlagAccess().getTimeoutKeyword_0());
            		
            // InternalCurlBetterThanHttpie.g:1267:3: (otherlv_1= '=' | this_WS_2= RULE_WS )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==27) ) {
                alt40=1;
            }
            else if ( (LA40_0==RULE_WS) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1268:4: otherlv_1= '='
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_23); 

                    				newLeafNode(otherlv_1, grammarAccess.getTimeoutFlagAccess().getEqualsSignKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:1273:4: this_WS_2= RULE_WS
                    {
                    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_23); 

                    				newLeafNode(this_WS_2, grammarAccess.getTimeoutFlagAccess().getWSTerminalRuleCall_1_1());
                    			

                    }
                    break;

            }

            // InternalCurlBetterThanHttpie.g:1278:3: ( (lv_timeout_3_0= RULE_FLOAT ) )
            // InternalCurlBetterThanHttpie.g:1279:4: (lv_timeout_3_0= RULE_FLOAT )
            {
            // InternalCurlBetterThanHttpie.g:1279:4: (lv_timeout_3_0= RULE_FLOAT )
            // InternalCurlBetterThanHttpie.g:1280:5: lv_timeout_3_0= RULE_FLOAT
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
    // InternalCurlBetterThanHttpie.g:1300:1: entryRuleItem returns [EObject current=null] : iv_ruleItem= ruleItem EOF ;
    public final EObject entryRuleItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItem = null;


        try {
            // InternalCurlBetterThanHttpie.g:1300:45: (iv_ruleItem= ruleItem EOF )
            // InternalCurlBetterThanHttpie.g:1301:2: iv_ruleItem= ruleItem EOF
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
    // InternalCurlBetterThanHttpie.g:1307:1: ruleItem returns [EObject current=null] : (this_HttpHeaderItem_0= ruleHttpHeaderItem | this_FormFileFieldItem_1= ruleFormFileFieldItem | this_DataFieldItem_2= ruleDataFieldItem | this_UrlParameterItem_3= ruleUrlParameterItem | this_RawJsonFieldItem_4= ruleRawJsonFieldItem ) ;
    public final EObject ruleItem() throws RecognitionException {
        EObject current = null;

        EObject this_HttpHeaderItem_0 = null;

        EObject this_FormFileFieldItem_1 = null;

        EObject this_DataFieldItem_2 = null;

        EObject this_UrlParameterItem_3 = null;

        EObject this_RawJsonFieldItem_4 = null;



        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:1313:2: ( (this_HttpHeaderItem_0= ruleHttpHeaderItem | this_FormFileFieldItem_1= ruleFormFileFieldItem | this_DataFieldItem_2= ruleDataFieldItem | this_UrlParameterItem_3= ruleUrlParameterItem | this_RawJsonFieldItem_4= ruleRawJsonFieldItem ) )
            // InternalCurlBetterThanHttpie.g:1314:2: (this_HttpHeaderItem_0= ruleHttpHeaderItem | this_FormFileFieldItem_1= ruleFormFileFieldItem | this_DataFieldItem_2= ruleDataFieldItem | this_UrlParameterItem_3= ruleUrlParameterItem | this_RawJsonFieldItem_4= ruleRawJsonFieldItem )
            {
            // InternalCurlBetterThanHttpie.g:1314:2: (this_HttpHeaderItem_0= ruleHttpHeaderItem | this_FormFileFieldItem_1= ruleFormFileFieldItem | this_DataFieldItem_2= ruleDataFieldItem | this_UrlParameterItem_3= ruleUrlParameterItem | this_RawJsonFieldItem_4= ruleRawJsonFieldItem )
            int alt41=5;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 28:
                    {
                    alt41=2;
                    }
                    break;
                case 39:
                    {
                    alt41=4;
                    }
                    break;
                case 15:
                    {
                    alt41=1;
                    }
                    break;
                case 27:
                    {
                    alt41=3;
                    }
                    break;
                case 40:
                    {
                    alt41=5;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA41_0==RULE_HTTP) ) {
                switch ( input.LA(2) ) {
                case 15:
                    {
                    alt41=1;
                    }
                    break;
                case 27:
                    {
                    alt41=3;
                    }
                    break;
                case 40:
                    {
                    alt41=5;
                    }
                    break;
                case 28:
                    {
                    alt41=2;
                    }
                    break;
                case 39:
                    {
                    alt41=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1315:3: this_HttpHeaderItem_0= ruleHttpHeaderItem
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
                    // InternalCurlBetterThanHttpie.g:1324:3: this_FormFileFieldItem_1= ruleFormFileFieldItem
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
                    // InternalCurlBetterThanHttpie.g:1333:3: this_DataFieldItem_2= ruleDataFieldItem
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
                    // InternalCurlBetterThanHttpie.g:1342:3: this_UrlParameterItem_3= ruleUrlParameterItem
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
                    // InternalCurlBetterThanHttpie.g:1351:3: this_RawJsonFieldItem_4= ruleRawJsonFieldItem
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
    // InternalCurlBetterThanHttpie.g:1363:1: entryRuleHttpHeaderItem returns [EObject current=null] : iv_ruleHttpHeaderItem= ruleHttpHeaderItem EOF ;
    public final EObject entryRuleHttpHeaderItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHttpHeaderItem = null;


        try {
            // InternalCurlBetterThanHttpie.g:1363:55: (iv_ruleHttpHeaderItem= ruleHttpHeaderItem EOF )
            // InternalCurlBetterThanHttpie.g:1364:2: iv_ruleHttpHeaderItem= ruleHttpHeaderItem EOF
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
    // InternalCurlBetterThanHttpie.g:1370:1: ruleHttpHeaderItem returns [EObject current=null] : ( ( ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) ) ) otherlv_1= ':' ( ( (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP ) ) ) ) ;
    public final EObject ruleHttpHeaderItem() throws RecognitionException {
        EObject current = null;

        Token lv_field_0_1=null;
        Token lv_field_0_2=null;
        Token otherlv_1=null;
        Token lv_value_2_1=null;
        Token lv_value_2_2=null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:1376:2: ( ( ( ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) ) ) otherlv_1= ':' ( ( (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP ) ) ) ) )
            // InternalCurlBetterThanHttpie.g:1377:2: ( ( ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) ) ) otherlv_1= ':' ( ( (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP ) ) ) )
            {
            // InternalCurlBetterThanHttpie.g:1377:2: ( ( ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) ) ) otherlv_1= ':' ( ( (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP ) ) ) )
            // InternalCurlBetterThanHttpie.g:1378:3: ( ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) ) ) otherlv_1= ':' ( ( (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP ) ) )
            {
            // InternalCurlBetterThanHttpie.g:1378:3: ( ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) ) )
            // InternalCurlBetterThanHttpie.g:1379:4: ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) )
            {
            // InternalCurlBetterThanHttpie.g:1379:4: ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) )
            // InternalCurlBetterThanHttpie.g:1380:5: (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP )
            {
            // InternalCurlBetterThanHttpie.g:1380:5: (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP )
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
                    // InternalCurlBetterThanHttpie.g:1381:6: lv_field_0_1= RULE_ID
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
                    // InternalCurlBetterThanHttpie.g:1396:6: lv_field_0_2= RULE_HTTP
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

            otherlv_1=(Token)match(input,15,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getHttpHeaderItemAccess().getColonKeyword_1());
            		
            // InternalCurlBetterThanHttpie.g:1417:3: ( ( (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP ) ) )
            // InternalCurlBetterThanHttpie.g:1418:4: ( (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP ) )
            {
            // InternalCurlBetterThanHttpie.g:1418:4: ( (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP ) )
            // InternalCurlBetterThanHttpie.g:1419:5: (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP )
            {
            // InternalCurlBetterThanHttpie.g:1419:5: (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP )
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
                    // InternalCurlBetterThanHttpie.g:1420:6: lv_value_2_1= RULE_ID
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
                    // InternalCurlBetterThanHttpie.g:1435:6: lv_value_2_2= RULE_HTTP
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
    // InternalCurlBetterThanHttpie.g:1456:1: entryRuleFormFileFieldItem returns [EObject current=null] : iv_ruleFormFileFieldItem= ruleFormFileFieldItem EOF ;
    public final EObject entryRuleFormFileFieldItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormFileFieldItem = null;


        try {
            // InternalCurlBetterThanHttpie.g:1456:58: (iv_ruleFormFileFieldItem= ruleFormFileFieldItem EOF )
            // InternalCurlBetterThanHttpie.g:1457:2: iv_ruleFormFileFieldItem= ruleFormFileFieldItem EOF
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
    // InternalCurlBetterThanHttpie.g:1463:1: ruleFormFileFieldItem returns [EObject current=null] : ( ( ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) ) ) otherlv_1= '@' ( ( (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP ) ) ) ) ;
    public final EObject ruleFormFileFieldItem() throws RecognitionException {
        EObject current = null;

        Token lv_field_0_1=null;
        Token lv_field_0_2=null;
        Token otherlv_1=null;
        Token lv_value_2_1=null;
        Token lv_value_2_2=null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:1469:2: ( ( ( ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) ) ) otherlv_1= '@' ( ( (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP ) ) ) ) )
            // InternalCurlBetterThanHttpie.g:1470:2: ( ( ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) ) ) otherlv_1= '@' ( ( (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP ) ) ) )
            {
            // InternalCurlBetterThanHttpie.g:1470:2: ( ( ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) ) ) otherlv_1= '@' ( ( (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP ) ) ) )
            // InternalCurlBetterThanHttpie.g:1471:3: ( ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) ) ) otherlv_1= '@' ( ( (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP ) ) )
            {
            // InternalCurlBetterThanHttpie.g:1471:3: ( ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) ) )
            // InternalCurlBetterThanHttpie.g:1472:4: ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) )
            {
            // InternalCurlBetterThanHttpie.g:1472:4: ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) )
            // InternalCurlBetterThanHttpie.g:1473:5: (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP )
            {
            // InternalCurlBetterThanHttpie.g:1473:5: (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP )
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
                    // InternalCurlBetterThanHttpie.g:1474:6: lv_field_0_1= RULE_ID
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
                    // InternalCurlBetterThanHttpie.g:1489:6: lv_field_0_2= RULE_HTTP
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

            otherlv_1=(Token)match(input,28,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getFormFileFieldItemAccess().getCommercialAtKeyword_1());
            		
            // InternalCurlBetterThanHttpie.g:1510:3: ( ( (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP ) ) )
            // InternalCurlBetterThanHttpie.g:1511:4: ( (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP ) )
            {
            // InternalCurlBetterThanHttpie.g:1511:4: ( (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP ) )
            // InternalCurlBetterThanHttpie.g:1512:5: (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP )
            {
            // InternalCurlBetterThanHttpie.g:1512:5: (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP )
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
                    // InternalCurlBetterThanHttpie.g:1513:6: lv_value_2_1= RULE_ID
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
                    // InternalCurlBetterThanHttpie.g:1528:6: lv_value_2_2= RULE_HTTP
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
    // InternalCurlBetterThanHttpie.g:1549:1: entryRuleDataFieldItem returns [EObject current=null] : iv_ruleDataFieldItem= ruleDataFieldItem EOF ;
    public final EObject entryRuleDataFieldItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataFieldItem = null;


        try {
            // InternalCurlBetterThanHttpie.g:1549:54: (iv_ruleDataFieldItem= ruleDataFieldItem EOF )
            // InternalCurlBetterThanHttpie.g:1550:2: iv_ruleDataFieldItem= ruleDataFieldItem EOF
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
    // InternalCurlBetterThanHttpie.g:1556:1: ruleDataFieldItem returns [EObject current=null] : ( ( ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) ) ) otherlv_1= '=' ( ( ( (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP ) ) ) | (otherlv_3= '@' ( (lv_value_4_0= RULE_URL ) ) ) ) ) ;
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
            // InternalCurlBetterThanHttpie.g:1562:2: ( ( ( ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) ) ) otherlv_1= '=' ( ( ( (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP ) ) ) | (otherlv_3= '@' ( (lv_value_4_0= RULE_URL ) ) ) ) ) )
            // InternalCurlBetterThanHttpie.g:1563:2: ( ( ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) ) ) otherlv_1= '=' ( ( ( (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP ) ) ) | (otherlv_3= '@' ( (lv_value_4_0= RULE_URL ) ) ) ) )
            {
            // InternalCurlBetterThanHttpie.g:1563:2: ( ( ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) ) ) otherlv_1= '=' ( ( ( (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP ) ) ) | (otherlv_3= '@' ( (lv_value_4_0= RULE_URL ) ) ) ) )
            // InternalCurlBetterThanHttpie.g:1564:3: ( ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) ) ) otherlv_1= '=' ( ( ( (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP ) ) ) | (otherlv_3= '@' ( (lv_value_4_0= RULE_URL ) ) ) )
            {
            // InternalCurlBetterThanHttpie.g:1564:3: ( ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) ) )
            // InternalCurlBetterThanHttpie.g:1565:4: ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) )
            {
            // InternalCurlBetterThanHttpie.g:1565:4: ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) )
            // InternalCurlBetterThanHttpie.g:1566:5: (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP )
            {
            // InternalCurlBetterThanHttpie.g:1566:5: (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP )
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
                    // InternalCurlBetterThanHttpie.g:1567:6: lv_field_0_1= RULE_ID
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
                    // InternalCurlBetterThanHttpie.g:1582:6: lv_field_0_2= RULE_HTTP
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

            otherlv_1=(Token)match(input,27,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getDataFieldItemAccess().getEqualsSignKeyword_1());
            		
            // InternalCurlBetterThanHttpie.g:1603:3: ( ( ( (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP ) ) ) | (otherlv_3= '@' ( (lv_value_4_0= RULE_URL ) ) ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_HTTP||LA48_0==RULE_ID) ) {
                alt48=1;
            }
            else if ( (LA48_0==28) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1604:4: ( ( (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP ) ) )
                    {
                    // InternalCurlBetterThanHttpie.g:1604:4: ( ( (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP ) ) )
                    // InternalCurlBetterThanHttpie.g:1605:5: ( (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP ) )
                    {
                    // InternalCurlBetterThanHttpie.g:1605:5: ( (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP ) )
                    // InternalCurlBetterThanHttpie.g:1606:6: (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP )
                    {
                    // InternalCurlBetterThanHttpie.g:1606:6: (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP )
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==RULE_ID) ) {
                        alt47=1;
                    }
                    else if ( (LA47_0==RULE_HTTP) ) {
                        alt47=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 47, 0, input);

                        throw nvae;
                    }
                    switch (alt47) {
                        case 1 :
                            // InternalCurlBetterThanHttpie.g:1607:7: lv_value_2_1= RULE_ID
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
                            // InternalCurlBetterThanHttpie.g:1622:7: lv_value_2_2= RULE_HTTP
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
                    // InternalCurlBetterThanHttpie.g:1640:4: (otherlv_3= '@' ( (lv_value_4_0= RULE_URL ) ) )
                    {
                    // InternalCurlBetterThanHttpie.g:1640:4: (otherlv_3= '@' ( (lv_value_4_0= RULE_URL ) ) )
                    // InternalCurlBetterThanHttpie.g:1641:5: otherlv_3= '@' ( (lv_value_4_0= RULE_URL ) )
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_26); 

                    					newLeafNode(otherlv_3, grammarAccess.getDataFieldItemAccess().getCommercialAtKeyword_2_1_0());
                    				
                    // InternalCurlBetterThanHttpie.g:1645:5: ( (lv_value_4_0= RULE_URL ) )
                    // InternalCurlBetterThanHttpie.g:1646:6: (lv_value_4_0= RULE_URL )
                    {
                    // InternalCurlBetterThanHttpie.g:1646:6: (lv_value_4_0= RULE_URL )
                    // InternalCurlBetterThanHttpie.g:1647:7: lv_value_4_0= RULE_URL
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
    // InternalCurlBetterThanHttpie.g:1669:1: entryRuleUrlParameterItem returns [EObject current=null] : iv_ruleUrlParameterItem= ruleUrlParameterItem EOF ;
    public final EObject entryRuleUrlParameterItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUrlParameterItem = null;


        try {
            // InternalCurlBetterThanHttpie.g:1669:57: (iv_ruleUrlParameterItem= ruleUrlParameterItem EOF )
            // InternalCurlBetterThanHttpie.g:1670:2: iv_ruleUrlParameterItem= ruleUrlParameterItem EOF
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
    // InternalCurlBetterThanHttpie.g:1676:1: ruleUrlParameterItem returns [EObject current=null] : ( ( ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) ) ) otherlv_1= '==' ( ( (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP ) ) ) ) ;
    public final EObject ruleUrlParameterItem() throws RecognitionException {
        EObject current = null;

        Token lv_field_0_1=null;
        Token lv_field_0_2=null;
        Token otherlv_1=null;
        Token lv_value_2_1=null;
        Token lv_value_2_2=null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:1682:2: ( ( ( ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) ) ) otherlv_1= '==' ( ( (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP ) ) ) ) )
            // InternalCurlBetterThanHttpie.g:1683:2: ( ( ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) ) ) otherlv_1= '==' ( ( (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP ) ) ) )
            {
            // InternalCurlBetterThanHttpie.g:1683:2: ( ( ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) ) ) otherlv_1= '==' ( ( (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP ) ) ) )
            // InternalCurlBetterThanHttpie.g:1684:3: ( ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) ) ) otherlv_1= '==' ( ( (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP ) ) )
            {
            // InternalCurlBetterThanHttpie.g:1684:3: ( ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) ) )
            // InternalCurlBetterThanHttpie.g:1685:4: ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) )
            {
            // InternalCurlBetterThanHttpie.g:1685:4: ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) )
            // InternalCurlBetterThanHttpie.g:1686:5: (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP )
            {
            // InternalCurlBetterThanHttpie.g:1686:5: (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP )
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
                    // InternalCurlBetterThanHttpie.g:1687:6: lv_field_0_1= RULE_ID
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
                    // InternalCurlBetterThanHttpie.g:1702:6: lv_field_0_2= RULE_HTTP
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

            otherlv_1=(Token)match(input,39,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getUrlParameterItemAccess().getEqualsSignEqualsSignKeyword_1());
            		
            // InternalCurlBetterThanHttpie.g:1723:3: ( ( (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP ) ) )
            // InternalCurlBetterThanHttpie.g:1724:4: ( (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP ) )
            {
            // InternalCurlBetterThanHttpie.g:1724:4: ( (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP ) )
            // InternalCurlBetterThanHttpie.g:1725:5: (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP )
            {
            // InternalCurlBetterThanHttpie.g:1725:5: (lv_value_2_1= RULE_ID | lv_value_2_2= RULE_HTTP )
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
                    // InternalCurlBetterThanHttpie.g:1726:6: lv_value_2_1= RULE_ID
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
                    // InternalCurlBetterThanHttpie.g:1741:6: lv_value_2_2= RULE_HTTP
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
    // InternalCurlBetterThanHttpie.g:1762:1: entryRuleRawJsonFieldItem returns [EObject current=null] : iv_ruleRawJsonFieldItem= ruleRawJsonFieldItem EOF ;
    public final EObject entryRuleRawJsonFieldItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRawJsonFieldItem = null;


        try {
            // InternalCurlBetterThanHttpie.g:1762:57: (iv_ruleRawJsonFieldItem= ruleRawJsonFieldItem EOF )
            // InternalCurlBetterThanHttpie.g:1763:2: iv_ruleRawJsonFieldItem= ruleRawJsonFieldItem EOF
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
    // InternalCurlBetterThanHttpie.g:1769:1: ruleRawJsonFieldItem returns [EObject current=null] : ( ( ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) ) ) otherlv_1= ':=' ( ( (lv_value_2_0= ruleJsonType ) ) | (otherlv_3= '@' ( (lv_value_4_0= ruleJsonString ) ) ) ) ) ;
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
            // InternalCurlBetterThanHttpie.g:1775:2: ( ( ( ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) ) ) otherlv_1= ':=' ( ( (lv_value_2_0= ruleJsonType ) ) | (otherlv_3= '@' ( (lv_value_4_0= ruleJsonString ) ) ) ) ) )
            // InternalCurlBetterThanHttpie.g:1776:2: ( ( ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) ) ) otherlv_1= ':=' ( ( (lv_value_2_0= ruleJsonType ) ) | (otherlv_3= '@' ( (lv_value_4_0= ruleJsonString ) ) ) ) )
            {
            // InternalCurlBetterThanHttpie.g:1776:2: ( ( ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) ) ) otherlv_1= ':=' ( ( (lv_value_2_0= ruleJsonType ) ) | (otherlv_3= '@' ( (lv_value_4_0= ruleJsonString ) ) ) ) )
            // InternalCurlBetterThanHttpie.g:1777:3: ( ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) ) ) otherlv_1= ':=' ( ( (lv_value_2_0= ruleJsonType ) ) | (otherlv_3= '@' ( (lv_value_4_0= ruleJsonString ) ) ) )
            {
            // InternalCurlBetterThanHttpie.g:1777:3: ( ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) ) )
            // InternalCurlBetterThanHttpie.g:1778:4: ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) )
            {
            // InternalCurlBetterThanHttpie.g:1778:4: ( (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP ) )
            // InternalCurlBetterThanHttpie.g:1779:5: (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP )
            {
            // InternalCurlBetterThanHttpie.g:1779:5: (lv_field_0_1= RULE_ID | lv_field_0_2= RULE_HTTP )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ID) ) {
                alt51=1;
            }
            else if ( (LA51_0==RULE_HTTP) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1780:6: lv_field_0_1= RULE_ID
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
                    // InternalCurlBetterThanHttpie.g:1795:6: lv_field_0_2= RULE_HTTP
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

            otherlv_1=(Token)match(input,40,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getRawJsonFieldItemAccess().getColonEqualsSignKeyword_1());
            		
            // InternalCurlBetterThanHttpie.g:1816:3: ( ( (lv_value_2_0= ruleJsonType ) ) | (otherlv_3= '@' ( (lv_value_4_0= ruleJsonString ) ) ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_HTTP||LA52_0==RULE_ID||(LA52_0>=RULE_FLOAT && LA52_0<=RULE_NULL)||(LA52_0>=41 && LA52_0<=43)||LA52_0==46) ) {
                alt52=1;
            }
            else if ( (LA52_0==28) ) {
                alt52=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1817:4: ( (lv_value_2_0= ruleJsonType ) )
                    {
                    // InternalCurlBetterThanHttpie.g:1817:4: ( (lv_value_2_0= ruleJsonType ) )
                    // InternalCurlBetterThanHttpie.g:1818:5: (lv_value_2_0= ruleJsonType )
                    {
                    // InternalCurlBetterThanHttpie.g:1818:5: (lv_value_2_0= ruleJsonType )
                    // InternalCurlBetterThanHttpie.g:1819:6: lv_value_2_0= ruleJsonType
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
                    // InternalCurlBetterThanHttpie.g:1837:4: (otherlv_3= '@' ( (lv_value_4_0= ruleJsonString ) ) )
                    {
                    // InternalCurlBetterThanHttpie.g:1837:4: (otherlv_3= '@' ( (lv_value_4_0= ruleJsonString ) ) )
                    // InternalCurlBetterThanHttpie.g:1838:5: otherlv_3= '@' ( (lv_value_4_0= ruleJsonString ) )
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_30); 

                    					newLeafNode(otherlv_3, grammarAccess.getRawJsonFieldItemAccess().getCommercialAtKeyword_2_1_0());
                    				
                    // InternalCurlBetterThanHttpie.g:1842:5: ( (lv_value_4_0= ruleJsonString ) )
                    // InternalCurlBetterThanHttpie.g:1843:6: (lv_value_4_0= ruleJsonString )
                    {
                    // InternalCurlBetterThanHttpie.g:1843:6: (lv_value_4_0= ruleJsonString )
                    // InternalCurlBetterThanHttpie.g:1844:7: lv_value_4_0= ruleJsonString
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
    // InternalCurlBetterThanHttpie.g:1867:1: entryRuleMember returns [EObject current=null] : iv_ruleMember= ruleMember EOF ;
    public final EObject entryRuleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMember = null;


        try {
            // InternalCurlBetterThanHttpie.g:1867:47: (iv_ruleMember= ruleMember EOF )
            // InternalCurlBetterThanHttpie.g:1868:2: iv_ruleMember= ruleMember EOF
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
    // InternalCurlBetterThanHttpie.g:1874:1: ruleMember returns [EObject current=null] : ( ( (otherlv_0= '\"' ( ( (lv_key_1_1= RULE_ID | lv_key_1_2= RULE_HTTP ) ) ) otherlv_2= '\"' ) | (otherlv_3= '\\'' ( ( (lv_key_4_1= RULE_ID | lv_key_4_2= RULE_HTTP ) ) ) otherlv_5= '\\'' ) | ( ( (lv_key_6_1= RULE_ID | lv_key_6_2= RULE_HTTP ) ) ) ) (this_WS_7= RULE_WS )? otherlv_8= ':' (this_WS_9= RULE_WS )? ( (lv_value_10_0= ruleJsonType ) ) ) ;
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
            // InternalCurlBetterThanHttpie.g:1880:2: ( ( ( (otherlv_0= '\"' ( ( (lv_key_1_1= RULE_ID | lv_key_1_2= RULE_HTTP ) ) ) otherlv_2= '\"' ) | (otherlv_3= '\\'' ( ( (lv_key_4_1= RULE_ID | lv_key_4_2= RULE_HTTP ) ) ) otherlv_5= '\\'' ) | ( ( (lv_key_6_1= RULE_ID | lv_key_6_2= RULE_HTTP ) ) ) ) (this_WS_7= RULE_WS )? otherlv_8= ':' (this_WS_9= RULE_WS )? ( (lv_value_10_0= ruleJsonType ) ) ) )
            // InternalCurlBetterThanHttpie.g:1881:2: ( ( (otherlv_0= '\"' ( ( (lv_key_1_1= RULE_ID | lv_key_1_2= RULE_HTTP ) ) ) otherlv_2= '\"' ) | (otherlv_3= '\\'' ( ( (lv_key_4_1= RULE_ID | lv_key_4_2= RULE_HTTP ) ) ) otherlv_5= '\\'' ) | ( ( (lv_key_6_1= RULE_ID | lv_key_6_2= RULE_HTTP ) ) ) ) (this_WS_7= RULE_WS )? otherlv_8= ':' (this_WS_9= RULE_WS )? ( (lv_value_10_0= ruleJsonType ) ) )
            {
            // InternalCurlBetterThanHttpie.g:1881:2: ( ( (otherlv_0= '\"' ( ( (lv_key_1_1= RULE_ID | lv_key_1_2= RULE_HTTP ) ) ) otherlv_2= '\"' ) | (otherlv_3= '\\'' ( ( (lv_key_4_1= RULE_ID | lv_key_4_2= RULE_HTTP ) ) ) otherlv_5= '\\'' ) | ( ( (lv_key_6_1= RULE_ID | lv_key_6_2= RULE_HTTP ) ) ) ) (this_WS_7= RULE_WS )? otherlv_8= ':' (this_WS_9= RULE_WS )? ( (lv_value_10_0= ruleJsonType ) ) )
            // InternalCurlBetterThanHttpie.g:1882:3: ( (otherlv_0= '\"' ( ( (lv_key_1_1= RULE_ID | lv_key_1_2= RULE_HTTP ) ) ) otherlv_2= '\"' ) | (otherlv_3= '\\'' ( ( (lv_key_4_1= RULE_ID | lv_key_4_2= RULE_HTTP ) ) ) otherlv_5= '\\'' ) | ( ( (lv_key_6_1= RULE_ID | lv_key_6_2= RULE_HTTP ) ) ) ) (this_WS_7= RULE_WS )? otherlv_8= ':' (this_WS_9= RULE_WS )? ( (lv_value_10_0= ruleJsonType ) )
            {
            // InternalCurlBetterThanHttpie.g:1882:3: ( (otherlv_0= '\"' ( ( (lv_key_1_1= RULE_ID | lv_key_1_2= RULE_HTTP ) ) ) otherlv_2= '\"' ) | (otherlv_3= '\\'' ( ( (lv_key_4_1= RULE_ID | lv_key_4_2= RULE_HTTP ) ) ) otherlv_5= '\\'' ) | ( ( (lv_key_6_1= RULE_ID | lv_key_6_2= RULE_HTTP ) ) ) )
            int alt56=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt56=1;
                }
                break;
            case 42:
                {
                alt56=2;
                }
                break;
            case RULE_HTTP:
            case RULE_ID:
                {
                alt56=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1883:4: (otherlv_0= '\"' ( ( (lv_key_1_1= RULE_ID | lv_key_1_2= RULE_HTTP ) ) ) otherlv_2= '\"' )
                    {
                    // InternalCurlBetterThanHttpie.g:1883:4: (otherlv_0= '\"' ( ( (lv_key_1_1= RULE_ID | lv_key_1_2= RULE_HTTP ) ) ) otherlv_2= '\"' )
                    // InternalCurlBetterThanHttpie.g:1884:5: otherlv_0= '\"' ( ( (lv_key_1_1= RULE_ID | lv_key_1_2= RULE_HTTP ) ) ) otherlv_2= '\"'
                    {
                    otherlv_0=(Token)match(input,41,FOLLOW_13); 

                    					newLeafNode(otherlv_0, grammarAccess.getMemberAccess().getQuotationMarkKeyword_0_0_0());
                    				
                    // InternalCurlBetterThanHttpie.g:1888:5: ( ( (lv_key_1_1= RULE_ID | lv_key_1_2= RULE_HTTP ) ) )
                    // InternalCurlBetterThanHttpie.g:1889:6: ( (lv_key_1_1= RULE_ID | lv_key_1_2= RULE_HTTP ) )
                    {
                    // InternalCurlBetterThanHttpie.g:1889:6: ( (lv_key_1_1= RULE_ID | lv_key_1_2= RULE_HTTP ) )
                    // InternalCurlBetterThanHttpie.g:1890:7: (lv_key_1_1= RULE_ID | lv_key_1_2= RULE_HTTP )
                    {
                    // InternalCurlBetterThanHttpie.g:1890:7: (lv_key_1_1= RULE_ID | lv_key_1_2= RULE_HTTP )
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
                            // InternalCurlBetterThanHttpie.g:1891:8: lv_key_1_1= RULE_ID
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
                            // InternalCurlBetterThanHttpie.g:1906:8: lv_key_1_2= RULE_HTTP
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

                    otherlv_2=(Token)match(input,41,FOLLOW_32); 

                    					newLeafNode(otherlv_2, grammarAccess.getMemberAccess().getQuotationMarkKeyword_0_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:1929:4: (otherlv_3= '\\'' ( ( (lv_key_4_1= RULE_ID | lv_key_4_2= RULE_HTTP ) ) ) otherlv_5= '\\'' )
                    {
                    // InternalCurlBetterThanHttpie.g:1929:4: (otherlv_3= '\\'' ( ( (lv_key_4_1= RULE_ID | lv_key_4_2= RULE_HTTP ) ) ) otherlv_5= '\\'' )
                    // InternalCurlBetterThanHttpie.g:1930:5: otherlv_3= '\\'' ( ( (lv_key_4_1= RULE_ID | lv_key_4_2= RULE_HTTP ) ) ) otherlv_5= '\\''
                    {
                    otherlv_3=(Token)match(input,42,FOLLOW_13); 

                    					newLeafNode(otherlv_3, grammarAccess.getMemberAccess().getApostropheKeyword_0_1_0());
                    				
                    // InternalCurlBetterThanHttpie.g:1934:5: ( ( (lv_key_4_1= RULE_ID | lv_key_4_2= RULE_HTTP ) ) )
                    // InternalCurlBetterThanHttpie.g:1935:6: ( (lv_key_4_1= RULE_ID | lv_key_4_2= RULE_HTTP ) )
                    {
                    // InternalCurlBetterThanHttpie.g:1935:6: ( (lv_key_4_1= RULE_ID | lv_key_4_2= RULE_HTTP ) )
                    // InternalCurlBetterThanHttpie.g:1936:7: (lv_key_4_1= RULE_ID | lv_key_4_2= RULE_HTTP )
                    {
                    // InternalCurlBetterThanHttpie.g:1936:7: (lv_key_4_1= RULE_ID | lv_key_4_2= RULE_HTTP )
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
                            // InternalCurlBetterThanHttpie.g:1937:8: lv_key_4_1= RULE_ID
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
                            // InternalCurlBetterThanHttpie.g:1952:8: lv_key_4_2= RULE_HTTP
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

                    otherlv_5=(Token)match(input,42,FOLLOW_32); 

                    					newLeafNode(otherlv_5, grammarAccess.getMemberAccess().getApostropheKeyword_0_1_2());
                    				

                    }


                    }
                    break;
                case 3 :
                    // InternalCurlBetterThanHttpie.g:1975:4: ( ( (lv_key_6_1= RULE_ID | lv_key_6_2= RULE_HTTP ) ) )
                    {
                    // InternalCurlBetterThanHttpie.g:1975:4: ( ( (lv_key_6_1= RULE_ID | lv_key_6_2= RULE_HTTP ) ) )
                    // InternalCurlBetterThanHttpie.g:1976:5: ( (lv_key_6_1= RULE_ID | lv_key_6_2= RULE_HTTP ) )
                    {
                    // InternalCurlBetterThanHttpie.g:1976:5: ( (lv_key_6_1= RULE_ID | lv_key_6_2= RULE_HTTP ) )
                    // InternalCurlBetterThanHttpie.g:1977:6: (lv_key_6_1= RULE_ID | lv_key_6_2= RULE_HTTP )
                    {
                    // InternalCurlBetterThanHttpie.g:1977:6: (lv_key_6_1= RULE_ID | lv_key_6_2= RULE_HTTP )
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==RULE_ID) ) {
                        alt55=1;
                    }
                    else if ( (LA55_0==RULE_HTTP) ) {
                        alt55=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 55, 0, input);

                        throw nvae;
                    }
                    switch (alt55) {
                        case 1 :
                            // InternalCurlBetterThanHttpie.g:1978:7: lv_key_6_1= RULE_ID
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
                            // InternalCurlBetterThanHttpie.g:1993:7: lv_key_6_2= RULE_HTTP
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

            // InternalCurlBetterThanHttpie.g:2011:3: (this_WS_7= RULE_WS )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_WS) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:2012:4: this_WS_7= RULE_WS
                    {
                    this_WS_7=(Token)match(input,RULE_WS,FOLLOW_17); 

                    				newLeafNode(this_WS_7, grammarAccess.getMemberAccess().getWSTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FOLLOW_34); 

            			newLeafNode(otherlv_8, grammarAccess.getMemberAccess().getColonKeyword_2());
            		
            // InternalCurlBetterThanHttpie.g:2021:3: (this_WS_9= RULE_WS )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_WS) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:2022:4: this_WS_9= RULE_WS
                    {
                    this_WS_9=(Token)match(input,RULE_WS,FOLLOW_35); 

                    				newLeafNode(this_WS_9, grammarAccess.getMemberAccess().getWSTerminalRuleCall_3());
                    			

                    }
                    break;

            }

            // InternalCurlBetterThanHttpie.g:2027:3: ( (lv_value_10_0= ruleJsonType ) )
            // InternalCurlBetterThanHttpie.g:2028:4: (lv_value_10_0= ruleJsonType )
            {
            // InternalCurlBetterThanHttpie.g:2028:4: (lv_value_10_0= ruleJsonType )
            // InternalCurlBetterThanHttpie.g:2029:5: lv_value_10_0= ruleJsonType
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
    // InternalCurlBetterThanHttpie.g:2050:1: entryRuleJsonType returns [EObject current=null] : iv_ruleJsonType= ruleJsonType EOF ;
    public final EObject entryRuleJsonType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonType = null;


        try {
            // InternalCurlBetterThanHttpie.g:2050:49: (iv_ruleJsonType= ruleJsonType EOF )
            // InternalCurlBetterThanHttpie.g:2051:2: iv_ruleJsonType= ruleJsonType EOF
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
    // InternalCurlBetterThanHttpie.g:2057:1: ruleJsonType returns [EObject current=null] : (this_JsonObject_0= ruleJsonObject | this_JsonString_1= ruleJsonString | this_JsonArray_2= ruleJsonArray | this_JsonBoolean_3= ruleJsonBoolean | this_JsonNull_4= ruleJsonNull | this_JsonNumber_5= ruleJsonNumber ) ;
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
            // InternalCurlBetterThanHttpie.g:2063:2: ( (this_JsonObject_0= ruleJsonObject | this_JsonString_1= ruleJsonString | this_JsonArray_2= ruleJsonArray | this_JsonBoolean_3= ruleJsonBoolean | this_JsonNull_4= ruleJsonNull | this_JsonNumber_5= ruleJsonNumber ) )
            // InternalCurlBetterThanHttpie.g:2064:2: (this_JsonObject_0= ruleJsonObject | this_JsonString_1= ruleJsonString | this_JsonArray_2= ruleJsonArray | this_JsonBoolean_3= ruleJsonBoolean | this_JsonNull_4= ruleJsonNull | this_JsonNumber_5= ruleJsonNumber )
            {
            // InternalCurlBetterThanHttpie.g:2064:2: (this_JsonObject_0= ruleJsonObject | this_JsonString_1= ruleJsonString | this_JsonArray_2= ruleJsonArray | this_JsonBoolean_3= ruleJsonBoolean | this_JsonNull_4= ruleJsonNull | this_JsonNumber_5= ruleJsonNumber )
            int alt59=6;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt59=1;
                }
                break;
            case RULE_HTTP:
            case RULE_ID:
            case 41:
            case 42:
                {
                alt59=2;
                }
                break;
            case 46:
                {
                alt59=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt59=4;
                }
                break;
            case RULE_NULL:
                {
                alt59=5;
                }
                break;
            case RULE_FLOAT:
                {
                alt59=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:2065:3: this_JsonObject_0= ruleJsonObject
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
                    // InternalCurlBetterThanHttpie.g:2074:3: this_JsonString_1= ruleJsonString
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
                    // InternalCurlBetterThanHttpie.g:2083:3: this_JsonArray_2= ruleJsonArray
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
                    // InternalCurlBetterThanHttpie.g:2092:3: this_JsonBoolean_3= ruleJsonBoolean
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
                    // InternalCurlBetterThanHttpie.g:2101:3: this_JsonNull_4= ruleJsonNull
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
                    // InternalCurlBetterThanHttpie.g:2110:3: this_JsonNumber_5= ruleJsonNumber
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
    // InternalCurlBetterThanHttpie.g:2122:1: entryRuleJsonObject returns [EObject current=null] : iv_ruleJsonObject= ruleJsonObject EOF ;
    public final EObject entryRuleJsonObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonObject = null;


        try {
            // InternalCurlBetterThanHttpie.g:2122:51: (iv_ruleJsonObject= ruleJsonObject EOF )
            // InternalCurlBetterThanHttpie.g:2123:2: iv_ruleJsonObject= ruleJsonObject EOF
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
    // InternalCurlBetterThanHttpie.g:2129:1: ruleJsonObject returns [EObject current=null] : ( () otherlv_1= '{' ( ( (this_WS_2= RULE_WS )? ( (lv_members_3_0= ruleMember ) ) ) ( (this_WS_4= RULE_WS )? otherlv_5= ',' (this_WS_6= RULE_WS )? ( (lv_members_7_0= ruleMember ) ) )* (this_WS_8= RULE_WS )? )? otherlv_9= '}' ) ;
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
            // InternalCurlBetterThanHttpie.g:2135:2: ( ( () otherlv_1= '{' ( ( (this_WS_2= RULE_WS )? ( (lv_members_3_0= ruleMember ) ) ) ( (this_WS_4= RULE_WS )? otherlv_5= ',' (this_WS_6= RULE_WS )? ( (lv_members_7_0= ruleMember ) ) )* (this_WS_8= RULE_WS )? )? otherlv_9= '}' ) )
            // InternalCurlBetterThanHttpie.g:2136:2: ( () otherlv_1= '{' ( ( (this_WS_2= RULE_WS )? ( (lv_members_3_0= ruleMember ) ) ) ( (this_WS_4= RULE_WS )? otherlv_5= ',' (this_WS_6= RULE_WS )? ( (lv_members_7_0= ruleMember ) ) )* (this_WS_8= RULE_WS )? )? otherlv_9= '}' )
            {
            // InternalCurlBetterThanHttpie.g:2136:2: ( () otherlv_1= '{' ( ( (this_WS_2= RULE_WS )? ( (lv_members_3_0= ruleMember ) ) ) ( (this_WS_4= RULE_WS )? otherlv_5= ',' (this_WS_6= RULE_WS )? ( (lv_members_7_0= ruleMember ) ) )* (this_WS_8= RULE_WS )? )? otherlv_9= '}' )
            // InternalCurlBetterThanHttpie.g:2137:3: () otherlv_1= '{' ( ( (this_WS_2= RULE_WS )? ( (lv_members_3_0= ruleMember ) ) ) ( (this_WS_4= RULE_WS )? otherlv_5= ',' (this_WS_6= RULE_WS )? ( (lv_members_7_0= ruleMember ) ) )* (this_WS_8= RULE_WS )? )? otherlv_9= '}'
            {
            // InternalCurlBetterThanHttpie.g:2137:3: ()
            // InternalCurlBetterThanHttpie.g:2138:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getJsonObjectAccess().getJsonObjectAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,43,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getJsonObjectAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalCurlBetterThanHttpie.g:2148:3: ( ( (this_WS_2= RULE_WS )? ( (lv_members_3_0= ruleMember ) ) ) ( (this_WS_4= RULE_WS )? otherlv_5= ',' (this_WS_6= RULE_WS )? ( (lv_members_7_0= ruleMember ) ) )* (this_WS_8= RULE_WS )? )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( ((LA65_0>=RULE_HTTP && LA65_0<=RULE_ID)||(LA65_0>=41 && LA65_0<=42)) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:2149:4: ( (this_WS_2= RULE_WS )? ( (lv_members_3_0= ruleMember ) ) ) ( (this_WS_4= RULE_WS )? otherlv_5= ',' (this_WS_6= RULE_WS )? ( (lv_members_7_0= ruleMember ) ) )* (this_WS_8= RULE_WS )?
                    {
                    // InternalCurlBetterThanHttpie.g:2149:4: ( (this_WS_2= RULE_WS )? ( (lv_members_3_0= ruleMember ) ) )
                    // InternalCurlBetterThanHttpie.g:2150:5: (this_WS_2= RULE_WS )? ( (lv_members_3_0= ruleMember ) )
                    {
                    // InternalCurlBetterThanHttpie.g:2150:5: (this_WS_2= RULE_WS )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==RULE_WS) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // InternalCurlBetterThanHttpie.g:2151:6: this_WS_2= RULE_WS
                            {
                            this_WS_2=(Token)match(input,RULE_WS,FOLLOW_37); 

                            						newLeafNode(this_WS_2, grammarAccess.getJsonObjectAccess().getWSTerminalRuleCall_2_0_0());
                            					

                            }
                            break;

                    }

                    // InternalCurlBetterThanHttpie.g:2156:5: ( (lv_members_3_0= ruleMember ) )
                    // InternalCurlBetterThanHttpie.g:2157:6: (lv_members_3_0= ruleMember )
                    {
                    // InternalCurlBetterThanHttpie.g:2157:6: (lv_members_3_0= ruleMember )
                    // InternalCurlBetterThanHttpie.g:2158:7: lv_members_3_0= ruleMember
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

                    // InternalCurlBetterThanHttpie.g:2176:4: ( (this_WS_4= RULE_WS )? otherlv_5= ',' (this_WS_6= RULE_WS )? ( (lv_members_7_0= ruleMember ) ) )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==RULE_WS) ) {
                            int LA63_1 = input.LA(2);

                            if ( (LA63_1==44) ) {
                                alt63=1;
                            }


                        }
                        else if ( (LA63_0==44) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // InternalCurlBetterThanHttpie.g:2177:5: (this_WS_4= RULE_WS )? otherlv_5= ',' (this_WS_6= RULE_WS )? ( (lv_members_7_0= ruleMember ) )
                    	    {
                    	    // InternalCurlBetterThanHttpie.g:2177:5: (this_WS_4= RULE_WS )?
                    	    int alt61=2;
                    	    int LA61_0 = input.LA(1);

                    	    if ( (LA61_0==RULE_WS) ) {
                    	        alt61=1;
                    	    }
                    	    switch (alt61) {
                    	        case 1 :
                    	            // InternalCurlBetterThanHttpie.g:2178:6: this_WS_4= RULE_WS
                    	            {
                    	            this_WS_4=(Token)match(input,RULE_WS,FOLLOW_39); 

                    	            						newLeafNode(this_WS_4, grammarAccess.getJsonObjectAccess().getWSTerminalRuleCall_2_1_0());
                    	            					

                    	            }
                    	            break;

                    	    }

                    	    otherlv_5=(Token)match(input,44,FOLLOW_37); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getJsonObjectAccess().getCommaKeyword_2_1_1());
                    	    				
                    	    // InternalCurlBetterThanHttpie.g:2187:5: (this_WS_6= RULE_WS )?
                    	    int alt62=2;
                    	    int LA62_0 = input.LA(1);

                    	    if ( (LA62_0==RULE_WS) ) {
                    	        alt62=1;
                    	    }
                    	    switch (alt62) {
                    	        case 1 :
                    	            // InternalCurlBetterThanHttpie.g:2188:6: this_WS_6= RULE_WS
                    	            {
                    	            this_WS_6=(Token)match(input,RULE_WS,FOLLOW_37); 

                    	            						newLeafNode(this_WS_6, grammarAccess.getJsonObjectAccess().getWSTerminalRuleCall_2_1_2());
                    	            					

                    	            }
                    	            break;

                    	    }

                    	    // InternalCurlBetterThanHttpie.g:2193:5: ( (lv_members_7_0= ruleMember ) )
                    	    // InternalCurlBetterThanHttpie.g:2194:6: (lv_members_7_0= ruleMember )
                    	    {
                    	    // InternalCurlBetterThanHttpie.g:2194:6: (lv_members_7_0= ruleMember )
                    	    // InternalCurlBetterThanHttpie.g:2195:7: lv_members_7_0= ruleMember
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
                    	    break loop63;
                        }
                    } while (true);

                    // InternalCurlBetterThanHttpie.g:2213:4: (this_WS_8= RULE_WS )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==RULE_WS) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // InternalCurlBetterThanHttpie.g:2214:5: this_WS_8= RULE_WS
                            {
                            this_WS_8=(Token)match(input,RULE_WS,FOLLOW_40); 

                            					newLeafNode(this_WS_8, grammarAccess.getJsonObjectAccess().getWSTerminalRuleCall_2_2());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,45,FOLLOW_2); 

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
    // InternalCurlBetterThanHttpie.g:2228:1: entryRuleJsonString returns [EObject current=null] : iv_ruleJsonString= ruleJsonString EOF ;
    public final EObject entryRuleJsonString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonString = null;


        try {
            // InternalCurlBetterThanHttpie.g:2228:51: (iv_ruleJsonString= ruleJsonString EOF )
            // InternalCurlBetterThanHttpie.g:2229:2: iv_ruleJsonString= ruleJsonString EOF
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
    // InternalCurlBetterThanHttpie.g:2235:1: ruleJsonString returns [EObject current=null] : ( (otherlv_0= '\"' ( ( (lv_value_1_1= RULE_ID | lv_value_1_2= RULE_HTTP ) ) ) otherlv_2= '\"' ) | (otherlv_3= '\\'' ( ( (lv_value_4_1= RULE_ID | lv_value_4_2= RULE_HTTP ) ) ) otherlv_5= '\\'' ) | ( ( (lv_value_6_1= RULE_ID | lv_value_6_2= RULE_HTTP ) ) ) ) ;
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
            // InternalCurlBetterThanHttpie.g:2241:2: ( ( (otherlv_0= '\"' ( ( (lv_value_1_1= RULE_ID | lv_value_1_2= RULE_HTTP ) ) ) otherlv_2= '\"' ) | (otherlv_3= '\\'' ( ( (lv_value_4_1= RULE_ID | lv_value_4_2= RULE_HTTP ) ) ) otherlv_5= '\\'' ) | ( ( (lv_value_6_1= RULE_ID | lv_value_6_2= RULE_HTTP ) ) ) ) )
            // InternalCurlBetterThanHttpie.g:2242:2: ( (otherlv_0= '\"' ( ( (lv_value_1_1= RULE_ID | lv_value_1_2= RULE_HTTP ) ) ) otherlv_2= '\"' ) | (otherlv_3= '\\'' ( ( (lv_value_4_1= RULE_ID | lv_value_4_2= RULE_HTTP ) ) ) otherlv_5= '\\'' ) | ( ( (lv_value_6_1= RULE_ID | lv_value_6_2= RULE_HTTP ) ) ) )
            {
            // InternalCurlBetterThanHttpie.g:2242:2: ( (otherlv_0= '\"' ( ( (lv_value_1_1= RULE_ID | lv_value_1_2= RULE_HTTP ) ) ) otherlv_2= '\"' ) | (otherlv_3= '\\'' ( ( (lv_value_4_1= RULE_ID | lv_value_4_2= RULE_HTTP ) ) ) otherlv_5= '\\'' ) | ( ( (lv_value_6_1= RULE_ID | lv_value_6_2= RULE_HTTP ) ) ) )
            int alt69=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt69=1;
                }
                break;
            case 42:
                {
                alt69=2;
                }
                break;
            case RULE_HTTP:
            case RULE_ID:
                {
                alt69=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }

            switch (alt69) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:2243:3: (otherlv_0= '\"' ( ( (lv_value_1_1= RULE_ID | lv_value_1_2= RULE_HTTP ) ) ) otherlv_2= '\"' )
                    {
                    // InternalCurlBetterThanHttpie.g:2243:3: (otherlv_0= '\"' ( ( (lv_value_1_1= RULE_ID | lv_value_1_2= RULE_HTTP ) ) ) otherlv_2= '\"' )
                    // InternalCurlBetterThanHttpie.g:2244:4: otherlv_0= '\"' ( ( (lv_value_1_1= RULE_ID | lv_value_1_2= RULE_HTTP ) ) ) otherlv_2= '\"'
                    {
                    otherlv_0=(Token)match(input,41,FOLLOW_13); 

                    				newLeafNode(otherlv_0, grammarAccess.getJsonStringAccess().getQuotationMarkKeyword_0_0());
                    			
                    // InternalCurlBetterThanHttpie.g:2248:4: ( ( (lv_value_1_1= RULE_ID | lv_value_1_2= RULE_HTTP ) ) )
                    // InternalCurlBetterThanHttpie.g:2249:5: ( (lv_value_1_1= RULE_ID | lv_value_1_2= RULE_HTTP ) )
                    {
                    // InternalCurlBetterThanHttpie.g:2249:5: ( (lv_value_1_1= RULE_ID | lv_value_1_2= RULE_HTTP ) )
                    // InternalCurlBetterThanHttpie.g:2250:6: (lv_value_1_1= RULE_ID | lv_value_1_2= RULE_HTTP )
                    {
                    // InternalCurlBetterThanHttpie.g:2250:6: (lv_value_1_1= RULE_ID | lv_value_1_2= RULE_HTTP )
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
                            // InternalCurlBetterThanHttpie.g:2251:7: lv_value_1_1= RULE_ID
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
                            // InternalCurlBetterThanHttpie.g:2266:7: lv_value_1_2= RULE_HTTP
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

                    otherlv_2=(Token)match(input,41,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getJsonStringAccess().getQuotationMarkKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:2289:3: (otherlv_3= '\\'' ( ( (lv_value_4_1= RULE_ID | lv_value_4_2= RULE_HTTP ) ) ) otherlv_5= '\\'' )
                    {
                    // InternalCurlBetterThanHttpie.g:2289:3: (otherlv_3= '\\'' ( ( (lv_value_4_1= RULE_ID | lv_value_4_2= RULE_HTTP ) ) ) otherlv_5= '\\'' )
                    // InternalCurlBetterThanHttpie.g:2290:4: otherlv_3= '\\'' ( ( (lv_value_4_1= RULE_ID | lv_value_4_2= RULE_HTTP ) ) ) otherlv_5= '\\''
                    {
                    otherlv_3=(Token)match(input,42,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getJsonStringAccess().getApostropheKeyword_1_0());
                    			
                    // InternalCurlBetterThanHttpie.g:2294:4: ( ( (lv_value_4_1= RULE_ID | lv_value_4_2= RULE_HTTP ) ) )
                    // InternalCurlBetterThanHttpie.g:2295:5: ( (lv_value_4_1= RULE_ID | lv_value_4_2= RULE_HTTP ) )
                    {
                    // InternalCurlBetterThanHttpie.g:2295:5: ( (lv_value_4_1= RULE_ID | lv_value_4_2= RULE_HTTP ) )
                    // InternalCurlBetterThanHttpie.g:2296:6: (lv_value_4_1= RULE_ID | lv_value_4_2= RULE_HTTP )
                    {
                    // InternalCurlBetterThanHttpie.g:2296:6: (lv_value_4_1= RULE_ID | lv_value_4_2= RULE_HTTP )
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
                            // InternalCurlBetterThanHttpie.g:2297:7: lv_value_4_1= RULE_ID
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
                            // InternalCurlBetterThanHttpie.g:2312:7: lv_value_4_2= RULE_HTTP
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

                    otherlv_5=(Token)match(input,42,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getJsonStringAccess().getApostropheKeyword_1_2());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCurlBetterThanHttpie.g:2335:3: ( ( (lv_value_6_1= RULE_ID | lv_value_6_2= RULE_HTTP ) ) )
                    {
                    // InternalCurlBetterThanHttpie.g:2335:3: ( ( (lv_value_6_1= RULE_ID | lv_value_6_2= RULE_HTTP ) ) )
                    // InternalCurlBetterThanHttpie.g:2336:4: ( (lv_value_6_1= RULE_ID | lv_value_6_2= RULE_HTTP ) )
                    {
                    // InternalCurlBetterThanHttpie.g:2336:4: ( (lv_value_6_1= RULE_ID | lv_value_6_2= RULE_HTTP ) )
                    // InternalCurlBetterThanHttpie.g:2337:5: (lv_value_6_1= RULE_ID | lv_value_6_2= RULE_HTTP )
                    {
                    // InternalCurlBetterThanHttpie.g:2337:5: (lv_value_6_1= RULE_ID | lv_value_6_2= RULE_HTTP )
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==RULE_ID) ) {
                        alt68=1;
                    }
                    else if ( (LA68_0==RULE_HTTP) ) {
                        alt68=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 68, 0, input);

                        throw nvae;
                    }
                    switch (alt68) {
                        case 1 :
                            // InternalCurlBetterThanHttpie.g:2338:6: lv_value_6_1= RULE_ID
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
                            // InternalCurlBetterThanHttpie.g:2353:6: lv_value_6_2= RULE_HTTP
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
    // InternalCurlBetterThanHttpie.g:2374:1: entryRuleJsonArray returns [EObject current=null] : iv_ruleJsonArray= ruleJsonArray EOF ;
    public final EObject entryRuleJsonArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonArray = null;


        try {
            // InternalCurlBetterThanHttpie.g:2374:50: (iv_ruleJsonArray= ruleJsonArray EOF )
            // InternalCurlBetterThanHttpie.g:2375:2: iv_ruleJsonArray= ruleJsonArray EOF
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
    // InternalCurlBetterThanHttpie.g:2381:1: ruleJsonArray returns [EObject current=null] : ( () otherlv_1= '[' ( ( (this_WS_2= RULE_WS )? ( (lv_values_3_0= ruleJsonType ) ) ) ( (this_WS_4= RULE_WS )? otherlv_5= ',' (this_WS_6= RULE_WS )? ( (lv_values_7_0= ruleJsonType ) ) )* (this_WS_8= RULE_WS )? )? otherlv_9= ']' ) ;
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
            // InternalCurlBetterThanHttpie.g:2387:2: ( ( () otherlv_1= '[' ( ( (this_WS_2= RULE_WS )? ( (lv_values_3_0= ruleJsonType ) ) ) ( (this_WS_4= RULE_WS )? otherlv_5= ',' (this_WS_6= RULE_WS )? ( (lv_values_7_0= ruleJsonType ) ) )* (this_WS_8= RULE_WS )? )? otherlv_9= ']' ) )
            // InternalCurlBetterThanHttpie.g:2388:2: ( () otherlv_1= '[' ( ( (this_WS_2= RULE_WS )? ( (lv_values_3_0= ruleJsonType ) ) ) ( (this_WS_4= RULE_WS )? otherlv_5= ',' (this_WS_6= RULE_WS )? ( (lv_values_7_0= ruleJsonType ) ) )* (this_WS_8= RULE_WS )? )? otherlv_9= ']' )
            {
            // InternalCurlBetterThanHttpie.g:2388:2: ( () otherlv_1= '[' ( ( (this_WS_2= RULE_WS )? ( (lv_values_3_0= ruleJsonType ) ) ) ( (this_WS_4= RULE_WS )? otherlv_5= ',' (this_WS_6= RULE_WS )? ( (lv_values_7_0= ruleJsonType ) ) )* (this_WS_8= RULE_WS )? )? otherlv_9= ']' )
            // InternalCurlBetterThanHttpie.g:2389:3: () otherlv_1= '[' ( ( (this_WS_2= RULE_WS )? ( (lv_values_3_0= ruleJsonType ) ) ) ( (this_WS_4= RULE_WS )? otherlv_5= ',' (this_WS_6= RULE_WS )? ( (lv_values_7_0= ruleJsonType ) ) )* (this_WS_8= RULE_WS )? )? otherlv_9= ']'
            {
            // InternalCurlBetterThanHttpie.g:2389:3: ()
            // InternalCurlBetterThanHttpie.g:2390:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getJsonArrayAccess().getJsonArrayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,46,FOLLOW_41); 

            			newLeafNode(otherlv_1, grammarAccess.getJsonArrayAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalCurlBetterThanHttpie.g:2400:3: ( ( (this_WS_2= RULE_WS )? ( (lv_values_3_0= ruleJsonType ) ) ) ( (this_WS_4= RULE_WS )? otherlv_5= ',' (this_WS_6= RULE_WS )? ( (lv_values_7_0= ruleJsonType ) ) )* (this_WS_8= RULE_WS )? )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( ((LA75_0>=RULE_HTTP && LA75_0<=RULE_ID)||(LA75_0>=RULE_FLOAT && LA75_0<=RULE_NULL)||(LA75_0>=41 && LA75_0<=43)||LA75_0==46) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:2401:4: ( (this_WS_2= RULE_WS )? ( (lv_values_3_0= ruleJsonType ) ) ) ( (this_WS_4= RULE_WS )? otherlv_5= ',' (this_WS_6= RULE_WS )? ( (lv_values_7_0= ruleJsonType ) ) )* (this_WS_8= RULE_WS )?
                    {
                    // InternalCurlBetterThanHttpie.g:2401:4: ( (this_WS_2= RULE_WS )? ( (lv_values_3_0= ruleJsonType ) ) )
                    // InternalCurlBetterThanHttpie.g:2402:5: (this_WS_2= RULE_WS )? ( (lv_values_3_0= ruleJsonType ) )
                    {
                    // InternalCurlBetterThanHttpie.g:2402:5: (this_WS_2= RULE_WS )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==RULE_WS) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // InternalCurlBetterThanHttpie.g:2403:6: this_WS_2= RULE_WS
                            {
                            this_WS_2=(Token)match(input,RULE_WS,FOLLOW_35); 

                            						newLeafNode(this_WS_2, grammarAccess.getJsonArrayAccess().getWSTerminalRuleCall_2_0_0());
                            					

                            }
                            break;

                    }

                    // InternalCurlBetterThanHttpie.g:2408:5: ( (lv_values_3_0= ruleJsonType ) )
                    // InternalCurlBetterThanHttpie.g:2409:6: (lv_values_3_0= ruleJsonType )
                    {
                    // InternalCurlBetterThanHttpie.g:2409:6: (lv_values_3_0= ruleJsonType )
                    // InternalCurlBetterThanHttpie.g:2410:7: lv_values_3_0= ruleJsonType
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

                    // InternalCurlBetterThanHttpie.g:2428:4: ( (this_WS_4= RULE_WS )? otherlv_5= ',' (this_WS_6= RULE_WS )? ( (lv_values_7_0= ruleJsonType ) ) )*
                    loop73:
                    do {
                        int alt73=2;
                        int LA73_0 = input.LA(1);

                        if ( (LA73_0==RULE_WS) ) {
                            int LA73_1 = input.LA(2);

                            if ( (LA73_1==44) ) {
                                alt73=1;
                            }


                        }
                        else if ( (LA73_0==44) ) {
                            alt73=1;
                        }


                        switch (alt73) {
                    	case 1 :
                    	    // InternalCurlBetterThanHttpie.g:2429:5: (this_WS_4= RULE_WS )? otherlv_5= ',' (this_WS_6= RULE_WS )? ( (lv_values_7_0= ruleJsonType ) )
                    	    {
                    	    // InternalCurlBetterThanHttpie.g:2429:5: (this_WS_4= RULE_WS )?
                    	    int alt71=2;
                    	    int LA71_0 = input.LA(1);

                    	    if ( (LA71_0==RULE_WS) ) {
                    	        alt71=1;
                    	    }
                    	    switch (alt71) {
                    	        case 1 :
                    	            // InternalCurlBetterThanHttpie.g:2430:6: this_WS_4= RULE_WS
                    	            {
                    	            this_WS_4=(Token)match(input,RULE_WS,FOLLOW_39); 

                    	            						newLeafNode(this_WS_4, grammarAccess.getJsonArrayAccess().getWSTerminalRuleCall_2_1_0());
                    	            					

                    	            }
                    	            break;

                    	    }

                    	    otherlv_5=(Token)match(input,44,FOLLOW_34); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getJsonArrayAccess().getCommaKeyword_2_1_1());
                    	    				
                    	    // InternalCurlBetterThanHttpie.g:2439:5: (this_WS_6= RULE_WS )?
                    	    int alt72=2;
                    	    int LA72_0 = input.LA(1);

                    	    if ( (LA72_0==RULE_WS) ) {
                    	        alt72=1;
                    	    }
                    	    switch (alt72) {
                    	        case 1 :
                    	            // InternalCurlBetterThanHttpie.g:2440:6: this_WS_6= RULE_WS
                    	            {
                    	            this_WS_6=(Token)match(input,RULE_WS,FOLLOW_35); 

                    	            						newLeafNode(this_WS_6, grammarAccess.getJsonArrayAccess().getWSTerminalRuleCall_2_1_2());
                    	            					

                    	            }
                    	            break;

                    	    }

                    	    // InternalCurlBetterThanHttpie.g:2445:5: ( (lv_values_7_0= ruleJsonType ) )
                    	    // InternalCurlBetterThanHttpie.g:2446:6: (lv_values_7_0= ruleJsonType )
                    	    {
                    	    // InternalCurlBetterThanHttpie.g:2446:6: (lv_values_7_0= ruleJsonType )
                    	    // InternalCurlBetterThanHttpie.g:2447:7: lv_values_7_0= ruleJsonType
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
                    	    break loop73;
                        }
                    } while (true);

                    // InternalCurlBetterThanHttpie.g:2465:4: (this_WS_8= RULE_WS )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==RULE_WS) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // InternalCurlBetterThanHttpie.g:2466:5: this_WS_8= RULE_WS
                            {
                            this_WS_8=(Token)match(input,RULE_WS,FOLLOW_43); 

                            					newLeafNode(this_WS_8, grammarAccess.getJsonArrayAccess().getWSTerminalRuleCall_2_2());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,47,FOLLOW_2); 

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
    // InternalCurlBetterThanHttpie.g:2480:1: entryRuleJsonBoolean returns [EObject current=null] : iv_ruleJsonBoolean= ruleJsonBoolean EOF ;
    public final EObject entryRuleJsonBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonBoolean = null;


        try {
            // InternalCurlBetterThanHttpie.g:2480:52: (iv_ruleJsonBoolean= ruleJsonBoolean EOF )
            // InternalCurlBetterThanHttpie.g:2481:2: iv_ruleJsonBoolean= ruleJsonBoolean EOF
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
    // InternalCurlBetterThanHttpie.g:2487:1: ruleJsonBoolean returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleJsonBoolean() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:2493:2: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // InternalCurlBetterThanHttpie.g:2494:2: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // InternalCurlBetterThanHttpie.g:2494:2: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // InternalCurlBetterThanHttpie.g:2495:3: (lv_value_0_0= RULE_BOOLEAN )
            {
            // InternalCurlBetterThanHttpie.g:2495:3: (lv_value_0_0= RULE_BOOLEAN )
            // InternalCurlBetterThanHttpie.g:2496:4: lv_value_0_0= RULE_BOOLEAN
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
    // InternalCurlBetterThanHttpie.g:2515:1: entryRuleJsonNull returns [EObject current=null] : iv_ruleJsonNull= ruleJsonNull EOF ;
    public final EObject entryRuleJsonNull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonNull = null;


        try {
            // InternalCurlBetterThanHttpie.g:2515:49: (iv_ruleJsonNull= ruleJsonNull EOF )
            // InternalCurlBetterThanHttpie.g:2516:2: iv_ruleJsonNull= ruleJsonNull EOF
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
    // InternalCurlBetterThanHttpie.g:2522:1: ruleJsonNull returns [EObject current=null] : ( () this_NULL_1= RULE_NULL ) ;
    public final EObject ruleJsonNull() throws RecognitionException {
        EObject current = null;

        Token this_NULL_1=null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:2528:2: ( ( () this_NULL_1= RULE_NULL ) )
            // InternalCurlBetterThanHttpie.g:2529:2: ( () this_NULL_1= RULE_NULL )
            {
            // InternalCurlBetterThanHttpie.g:2529:2: ( () this_NULL_1= RULE_NULL )
            // InternalCurlBetterThanHttpie.g:2530:3: () this_NULL_1= RULE_NULL
            {
            // InternalCurlBetterThanHttpie.g:2530:3: ()
            // InternalCurlBetterThanHttpie.g:2531:4: 
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
    // InternalCurlBetterThanHttpie.g:2545:1: entryRuleJsonNumber returns [EObject current=null] : iv_ruleJsonNumber= ruleJsonNumber EOF ;
    public final EObject entryRuleJsonNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonNumber = null;


        try {
            // InternalCurlBetterThanHttpie.g:2545:51: (iv_ruleJsonNumber= ruleJsonNumber EOF )
            // InternalCurlBetterThanHttpie.g:2546:2: iv_ruleJsonNumber= ruleJsonNumber EOF
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
    // InternalCurlBetterThanHttpie.g:2552:1: ruleJsonNumber returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleJsonNumber() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:2558:2: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // InternalCurlBetterThanHttpie.g:2559:2: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // InternalCurlBetterThanHttpie.g:2559:2: ( (lv_value_0_0= RULE_FLOAT ) )
            // InternalCurlBetterThanHttpie.g:2560:3: (lv_value_0_0= RULE_FLOAT )
            {
            // InternalCurlBetterThanHttpie.g:2560:3: (lv_value_0_0= RULE_FLOAT )
            // InternalCurlBetterThanHttpie.g:2561:4: lv_value_0_0= RULE_FLOAT
            {
            lv_value_0_0=(Token)match(input,RULE_FLOAT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getJsonNumberAccess().getValueFLOATTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getJsonNumberRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.FLOAT");
            			

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
    // InternalCurlBetterThanHttpie.g:2580:1: ruleMethod returns [Enumerator current=null] : ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) ) ;
    public final Enumerator ruleMethod() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:2586:2: ( ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) ) )
            // InternalCurlBetterThanHttpie.g:2587:2: ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) )
            {
            // InternalCurlBetterThanHttpie.g:2587:2: ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) )
            int alt76=4;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt76=1;
                }
                break;
            case 49:
                {
                alt76=2;
                }
                break;
            case 50:
                {
                alt76=3;
                }
                break;
            case 51:
                {
                alt76=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:2588:3: (enumLiteral_0= 'GET' )
                    {
                    // InternalCurlBetterThanHttpie.g:2588:3: (enumLiteral_0= 'GET' )
                    // InternalCurlBetterThanHttpie.g:2589:4: enumLiteral_0= 'GET'
                    {
                    enumLiteral_0=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getMethodAccess().getGETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMethodAccess().getGETEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:2596:3: (enumLiteral_1= 'POST' )
                    {
                    // InternalCurlBetterThanHttpie.g:2596:3: (enumLiteral_1= 'POST' )
                    // InternalCurlBetterThanHttpie.g:2597:4: enumLiteral_1= 'POST'
                    {
                    enumLiteral_1=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getMethodAccess().getPOSTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMethodAccess().getPOSTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCurlBetterThanHttpie.g:2604:3: (enumLiteral_2= 'PUT' )
                    {
                    // InternalCurlBetterThanHttpie.g:2604:3: (enumLiteral_2= 'PUT' )
                    // InternalCurlBetterThanHttpie.g:2605:4: enumLiteral_2= 'PUT'
                    {
                    enumLiteral_2=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getMethodAccess().getPUTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMethodAccess().getPUTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalCurlBetterThanHttpie.g:2612:3: (enumLiteral_3= 'DELETE' )
                    {
                    // InternalCurlBetterThanHttpie.g:2612:3: (enumLiteral_3= 'DELETE' )
                    // InternalCurlBetterThanHttpie.g:2613:4: enumLiteral_3= 'DELETE'
                    {
                    enumLiteral_3=(Token)match(input,51,FOLLOW_2); 

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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000007FE7FC0000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000F000000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000080D0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008080L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000018022L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010022L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010122L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010008002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000050L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00004E0010000E50L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000060000000050L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00004E0000000E70L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00004E0000000E50L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000260000000070L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000060000000070L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000300000000020L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000CE0000000E70L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000900000000020L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000800000000000L});

}