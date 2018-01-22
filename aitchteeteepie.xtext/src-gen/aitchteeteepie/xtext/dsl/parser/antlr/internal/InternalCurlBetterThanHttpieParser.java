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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WS", "RULE_VALUE", "RULE_STRING", "RULE_INT", "RULE_FLOAT", "RULE_DIGIT", "RULE_ANY_OTHER", "'http'", "'--header'", "'-t'", "'--body'", "'-b'", "'--json'", "'-j'", "'--form'", "'f'", "'--proxy'", "':'", "'://'", "'a'", "'--auth'", "'-a'", "'@'", "'--download'", "'-d'", "'--help'", "'-h'", "'--version'", "'--verbose'", "'-v'", "'--timeout'", "'GET'", "'POST'", "'PUT'", "'DELETE'"
    };
    public static final int RULE_STRING=6;
    public static final int T__19=19;
    public static final int RULE_VALUE=5;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=4;
    public static final int RULE_DIGIT=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int RULE_FLOAT=8;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

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
    // InternalCurlBetterThanHttpie.g:72:1: ruleCommandLineInterface returns [EObject current=null] : ( () otherlv_1= 'http' (this_WS_2= RULE_WS ( (lv_flags_3_0= ruleFlag ) ) )* (this_WS_4= RULE_WS ( (lv_method_5_0= ruleMethod ) ) )? (this_WS_6= RULE_WS )? ) ;
    public final EObject ruleCommandLineInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_WS_2=null;
        Token this_WS_4=null;
        Token this_WS_6=null;
        EObject lv_flags_3_0 = null;

        Enumerator lv_method_5_0 = null;



        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:78:2: ( ( () otherlv_1= 'http' (this_WS_2= RULE_WS ( (lv_flags_3_0= ruleFlag ) ) )* (this_WS_4= RULE_WS ( (lv_method_5_0= ruleMethod ) ) )? (this_WS_6= RULE_WS )? ) )
            // InternalCurlBetterThanHttpie.g:79:2: ( () otherlv_1= 'http' (this_WS_2= RULE_WS ( (lv_flags_3_0= ruleFlag ) ) )* (this_WS_4= RULE_WS ( (lv_method_5_0= ruleMethod ) ) )? (this_WS_6= RULE_WS )? )
            {
            // InternalCurlBetterThanHttpie.g:79:2: ( () otherlv_1= 'http' (this_WS_2= RULE_WS ( (lv_flags_3_0= ruleFlag ) ) )* (this_WS_4= RULE_WS ( (lv_method_5_0= ruleMethod ) ) )? (this_WS_6= RULE_WS )? )
            // InternalCurlBetterThanHttpie.g:80:3: () otherlv_1= 'http' (this_WS_2= RULE_WS ( (lv_flags_3_0= ruleFlag ) ) )* (this_WS_4= RULE_WS ( (lv_method_5_0= ruleMethod ) ) )? (this_WS_6= RULE_WS )?
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
            		
            // InternalCurlBetterThanHttpie.g:91:3: (this_WS_2= RULE_WS ( (lv_flags_3_0= ruleFlag ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_WS) ) {
                    int LA1_1 = input.LA(2);

                    if ( ((LA1_1>=12 && LA1_1<=20)||(LA1_1>=24 && LA1_1<=25)||(LA1_1>=27 && LA1_1<=34)) ) {
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

                if ( ((LA2_1>=35 && LA2_1<=38)) ) {
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

            // InternalCurlBetterThanHttpie.g:141:3: (this_WS_6= RULE_WS )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_WS) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:142:4: this_WS_6= RULE_WS
                    {
                    this_WS_6=(Token)match(input,RULE_WS,FOLLOW_2); 

                    				newLeafNode(this_WS_6, grammarAccess.getCommandLineInterfaceAccess().getWSTerminalRuleCall_4());
                    			

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
    // InternalCurlBetterThanHttpie.g:151:1: entryRuleFlag returns [EObject current=null] : iv_ruleFlag= ruleFlag EOF ;
    public final EObject entryRuleFlag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlag = null;


        try {
            // InternalCurlBetterThanHttpie.g:151:45: (iv_ruleFlag= ruleFlag EOF )
            // InternalCurlBetterThanHttpie.g:152:2: iv_ruleFlag= ruleFlag EOF
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
    // InternalCurlBetterThanHttpie.g:158:1: ruleFlag returns [EObject current=null] : (this_ProxyFlag_0= ruleProxyFlag | this_FormFlag_1= ruleFormFlag | this_AuthFlag_2= ruleAuthFlag | this_DownloadFlag_3= ruleDownloadFlag | this_BodyFlag_4= ruleBodyFlag | this_VersionFlag_5= ruleVersionFlag | this_JsonFlag_6= ruleJsonFlag | this_HelpFlag_7= ruleHelpFlag | this_HeadersFlag_8= ruleHeadersFlag | this_VerboseFlag_9= ruleVerboseFlag | this_TimeoutFlag_10= ruleTimeoutFlag ) ;
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
            // InternalCurlBetterThanHttpie.g:164:2: ( (this_ProxyFlag_0= ruleProxyFlag | this_FormFlag_1= ruleFormFlag | this_AuthFlag_2= ruleAuthFlag | this_DownloadFlag_3= ruleDownloadFlag | this_BodyFlag_4= ruleBodyFlag | this_VersionFlag_5= ruleVersionFlag | this_JsonFlag_6= ruleJsonFlag | this_HelpFlag_7= ruleHelpFlag | this_HeadersFlag_8= ruleHeadersFlag | this_VerboseFlag_9= ruleVerboseFlag | this_TimeoutFlag_10= ruleTimeoutFlag ) )
            // InternalCurlBetterThanHttpie.g:165:2: (this_ProxyFlag_0= ruleProxyFlag | this_FormFlag_1= ruleFormFlag | this_AuthFlag_2= ruleAuthFlag | this_DownloadFlag_3= ruleDownloadFlag | this_BodyFlag_4= ruleBodyFlag | this_VersionFlag_5= ruleVersionFlag | this_JsonFlag_6= ruleJsonFlag | this_HelpFlag_7= ruleHelpFlag | this_HeadersFlag_8= ruleHeadersFlag | this_VerboseFlag_9= ruleVerboseFlag | this_TimeoutFlag_10= ruleTimeoutFlag )
            {
            // InternalCurlBetterThanHttpie.g:165:2: (this_ProxyFlag_0= ruleProxyFlag | this_FormFlag_1= ruleFormFlag | this_AuthFlag_2= ruleAuthFlag | this_DownloadFlag_3= ruleDownloadFlag | this_BodyFlag_4= ruleBodyFlag | this_VersionFlag_5= ruleVersionFlag | this_JsonFlag_6= ruleJsonFlag | this_HelpFlag_7= ruleHelpFlag | this_HeadersFlag_8= ruleHeadersFlag | this_VerboseFlag_9= ruleVerboseFlag | this_TimeoutFlag_10= ruleTimeoutFlag )
            int alt4=11;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt4=1;
                }
                break;
            case 18:
            case 19:
                {
                alt4=2;
                }
                break;
            case 24:
            case 25:
                {
                alt4=3;
                }
                break;
            case 27:
            case 28:
                {
                alt4=4;
                }
                break;
            case 14:
            case 15:
                {
                alt4=5;
                }
                break;
            case 31:
                {
                alt4=6;
                }
                break;
            case 16:
            case 17:
                {
                alt4=7;
                }
                break;
            case 29:
            case 30:
                {
                alt4=8;
                }
                break;
            case 12:
            case 13:
                {
                alt4=9;
                }
                break;
            case 32:
            case 33:
                {
                alt4=10;
                }
                break;
            case 34:
                {
                alt4=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:166:3: this_ProxyFlag_0= ruleProxyFlag
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
                    // InternalCurlBetterThanHttpie.g:175:3: this_FormFlag_1= ruleFormFlag
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
                    // InternalCurlBetterThanHttpie.g:184:3: this_AuthFlag_2= ruleAuthFlag
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
                    // InternalCurlBetterThanHttpie.g:193:3: this_DownloadFlag_3= ruleDownloadFlag
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
                    // InternalCurlBetterThanHttpie.g:202:3: this_BodyFlag_4= ruleBodyFlag
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
                    // InternalCurlBetterThanHttpie.g:211:3: this_VersionFlag_5= ruleVersionFlag
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
                    // InternalCurlBetterThanHttpie.g:220:3: this_JsonFlag_6= ruleJsonFlag
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
                    // InternalCurlBetterThanHttpie.g:229:3: this_HelpFlag_7= ruleHelpFlag
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
                    // InternalCurlBetterThanHttpie.g:238:3: this_HeadersFlag_8= ruleHeadersFlag
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
                    // InternalCurlBetterThanHttpie.g:247:3: this_VerboseFlag_9= ruleVerboseFlag
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
                    // InternalCurlBetterThanHttpie.g:256:3: this_TimeoutFlag_10= ruleTimeoutFlag
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
    // InternalCurlBetterThanHttpie.g:268:1: entryRuleHeadersFlag returns [EObject current=null] : iv_ruleHeadersFlag= ruleHeadersFlag EOF ;
    public final EObject entryRuleHeadersFlag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeadersFlag = null;


        try {
            // InternalCurlBetterThanHttpie.g:268:52: (iv_ruleHeadersFlag= ruleHeadersFlag EOF )
            // InternalCurlBetterThanHttpie.g:269:2: iv_ruleHeadersFlag= ruleHeadersFlag EOF
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
    // InternalCurlBetterThanHttpie.g:275:1: ruleHeadersFlag returns [EObject current=null] : ( () (otherlv_1= '--header' | otherlv_2= '-t' ) ) ;
    public final EObject ruleHeadersFlag() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:281:2: ( ( () (otherlv_1= '--header' | otherlv_2= '-t' ) ) )
            // InternalCurlBetterThanHttpie.g:282:2: ( () (otherlv_1= '--header' | otherlv_2= '-t' ) )
            {
            // InternalCurlBetterThanHttpie.g:282:2: ( () (otherlv_1= '--header' | otherlv_2= '-t' ) )
            // InternalCurlBetterThanHttpie.g:283:3: () (otherlv_1= '--header' | otherlv_2= '-t' )
            {
            // InternalCurlBetterThanHttpie.g:283:3: ()
            // InternalCurlBetterThanHttpie.g:284:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHeadersFlagAccess().getHeadersFlagAction_0(),
            					current);
            			

            }

            // InternalCurlBetterThanHttpie.g:290:3: (otherlv_1= '--header' | otherlv_2= '-t' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            else if ( (LA5_0==13) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:291:4: otherlv_1= '--header'
                    {
                    otherlv_1=(Token)match(input,12,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getHeadersFlagAccess().getHeaderKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:296:4: otherlv_2= '-t'
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_2); 

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
    // InternalCurlBetterThanHttpie.g:305:1: entryRuleBodyFlag returns [EObject current=null] : iv_ruleBodyFlag= ruleBodyFlag EOF ;
    public final EObject entryRuleBodyFlag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyFlag = null;


        try {
            // InternalCurlBetterThanHttpie.g:305:49: (iv_ruleBodyFlag= ruleBodyFlag EOF )
            // InternalCurlBetterThanHttpie.g:306:2: iv_ruleBodyFlag= ruleBodyFlag EOF
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
    // InternalCurlBetterThanHttpie.g:312:1: ruleBodyFlag returns [EObject current=null] : ( () (otherlv_1= '--body' | otherlv_2= '-b' ) ) ;
    public final EObject ruleBodyFlag() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:318:2: ( ( () (otherlv_1= '--body' | otherlv_2= '-b' ) ) )
            // InternalCurlBetterThanHttpie.g:319:2: ( () (otherlv_1= '--body' | otherlv_2= '-b' ) )
            {
            // InternalCurlBetterThanHttpie.g:319:2: ( () (otherlv_1= '--body' | otherlv_2= '-b' ) )
            // InternalCurlBetterThanHttpie.g:320:3: () (otherlv_1= '--body' | otherlv_2= '-b' )
            {
            // InternalCurlBetterThanHttpie.g:320:3: ()
            // InternalCurlBetterThanHttpie.g:321:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBodyFlagAccess().getBodyFlagAction_0(),
            					current);
            			

            }

            // InternalCurlBetterThanHttpie.g:327:3: (otherlv_1= '--body' | otherlv_2= '-b' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            else if ( (LA6_0==15) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:328:4: otherlv_1= '--body'
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getBodyFlagAccess().getBodyKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:333:4: otherlv_2= '-b'
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_2); 

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
    // InternalCurlBetterThanHttpie.g:342:1: entryRuleJsonFlag returns [EObject current=null] : iv_ruleJsonFlag= ruleJsonFlag EOF ;
    public final EObject entryRuleJsonFlag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonFlag = null;


        try {
            // InternalCurlBetterThanHttpie.g:342:49: (iv_ruleJsonFlag= ruleJsonFlag EOF )
            // InternalCurlBetterThanHttpie.g:343:2: iv_ruleJsonFlag= ruleJsonFlag EOF
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
    // InternalCurlBetterThanHttpie.g:349:1: ruleJsonFlag returns [EObject current=null] : ( () (otherlv_1= '--json' | otherlv_2= '-j' ) ) ;
    public final EObject ruleJsonFlag() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:355:2: ( ( () (otherlv_1= '--json' | otherlv_2= '-j' ) ) )
            // InternalCurlBetterThanHttpie.g:356:2: ( () (otherlv_1= '--json' | otherlv_2= '-j' ) )
            {
            // InternalCurlBetterThanHttpie.g:356:2: ( () (otherlv_1= '--json' | otherlv_2= '-j' ) )
            // InternalCurlBetterThanHttpie.g:357:3: () (otherlv_1= '--json' | otherlv_2= '-j' )
            {
            // InternalCurlBetterThanHttpie.g:357:3: ()
            // InternalCurlBetterThanHttpie.g:358:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getJsonFlagAccess().getJsonFlagAction_0(),
            					current);
            			

            }

            // InternalCurlBetterThanHttpie.g:364:3: (otherlv_1= '--json' | otherlv_2= '-j' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            else if ( (LA7_0==17) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:365:4: otherlv_1= '--json'
                    {
                    otherlv_1=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getJsonFlagAccess().getJsonKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:370:4: otherlv_2= '-j'
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_2); 

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
    // InternalCurlBetterThanHttpie.g:379:1: entryRuleFormFlag returns [EObject current=null] : iv_ruleFormFlag= ruleFormFlag EOF ;
    public final EObject entryRuleFormFlag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormFlag = null;


        try {
            // InternalCurlBetterThanHttpie.g:379:49: (iv_ruleFormFlag= ruleFormFlag EOF )
            // InternalCurlBetterThanHttpie.g:380:2: iv_ruleFormFlag= ruleFormFlag EOF
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
    // InternalCurlBetterThanHttpie.g:386:1: ruleFormFlag returns [EObject current=null] : ( () (otherlv_1= '--form' | otherlv_2= 'f' ) ) ;
    public final EObject ruleFormFlag() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:392:2: ( ( () (otherlv_1= '--form' | otherlv_2= 'f' ) ) )
            // InternalCurlBetterThanHttpie.g:393:2: ( () (otherlv_1= '--form' | otherlv_2= 'f' ) )
            {
            // InternalCurlBetterThanHttpie.g:393:2: ( () (otherlv_1= '--form' | otherlv_2= 'f' ) )
            // InternalCurlBetterThanHttpie.g:394:3: () (otherlv_1= '--form' | otherlv_2= 'f' )
            {
            // InternalCurlBetterThanHttpie.g:394:3: ()
            // InternalCurlBetterThanHttpie.g:395:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFormFlagAccess().getFormFlagAction_0(),
            					current);
            			

            }

            // InternalCurlBetterThanHttpie.g:401:3: (otherlv_1= '--form' | otherlv_2= 'f' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            else if ( (LA8_0==19) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:402:4: otherlv_1= '--form'
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getFormFlagAccess().getFormKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:407:4: otherlv_2= 'f'
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_2); 

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
    // InternalCurlBetterThanHttpie.g:416:1: entryRuleProxyFlag returns [EObject current=null] : iv_ruleProxyFlag= ruleProxyFlag EOF ;
    public final EObject entryRuleProxyFlag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProxyFlag = null;


        try {
            // InternalCurlBetterThanHttpie.g:416:50: (iv_ruleProxyFlag= ruleProxyFlag EOF )
            // InternalCurlBetterThanHttpie.g:417:2: iv_ruleProxyFlag= ruleProxyFlag EOF
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
    // InternalCurlBetterThanHttpie.g:423:1: ruleProxyFlag returns [EObject current=null] : (otherlv_0= '--proxy' this_VALUE_1= RULE_VALUE ( ( (lv_protocol_2_0= RULE_STRING ) ) otherlv_3= ':' )? ( ( (lv_proxyProtocol_4_0= RULE_STRING ) ) otherlv_5= '://' )? ( ( (lv_username_6_0= RULE_STRING ) ) otherlv_7= ':' ( (lv_password_8_0= RULE_STRING ) ) otherlv_9= 'a' )? ( (lv_hostname_10_0= RULE_STRING ) ) (otherlv_11= ':' ( (lv_port_12_0= RULE_INT ) ) )? ) ;
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
            // InternalCurlBetterThanHttpie.g:429:2: ( (otherlv_0= '--proxy' this_VALUE_1= RULE_VALUE ( ( (lv_protocol_2_0= RULE_STRING ) ) otherlv_3= ':' )? ( ( (lv_proxyProtocol_4_0= RULE_STRING ) ) otherlv_5= '://' )? ( ( (lv_username_6_0= RULE_STRING ) ) otherlv_7= ':' ( (lv_password_8_0= RULE_STRING ) ) otherlv_9= 'a' )? ( (lv_hostname_10_0= RULE_STRING ) ) (otherlv_11= ':' ( (lv_port_12_0= RULE_INT ) ) )? ) )
            // InternalCurlBetterThanHttpie.g:430:2: (otherlv_0= '--proxy' this_VALUE_1= RULE_VALUE ( ( (lv_protocol_2_0= RULE_STRING ) ) otherlv_3= ':' )? ( ( (lv_proxyProtocol_4_0= RULE_STRING ) ) otherlv_5= '://' )? ( ( (lv_username_6_0= RULE_STRING ) ) otherlv_7= ':' ( (lv_password_8_0= RULE_STRING ) ) otherlv_9= 'a' )? ( (lv_hostname_10_0= RULE_STRING ) ) (otherlv_11= ':' ( (lv_port_12_0= RULE_INT ) ) )? )
            {
            // InternalCurlBetterThanHttpie.g:430:2: (otherlv_0= '--proxy' this_VALUE_1= RULE_VALUE ( ( (lv_protocol_2_0= RULE_STRING ) ) otherlv_3= ':' )? ( ( (lv_proxyProtocol_4_0= RULE_STRING ) ) otherlv_5= '://' )? ( ( (lv_username_6_0= RULE_STRING ) ) otherlv_7= ':' ( (lv_password_8_0= RULE_STRING ) ) otherlv_9= 'a' )? ( (lv_hostname_10_0= RULE_STRING ) ) (otherlv_11= ':' ( (lv_port_12_0= RULE_INT ) ) )? )
            // InternalCurlBetterThanHttpie.g:431:3: otherlv_0= '--proxy' this_VALUE_1= RULE_VALUE ( ( (lv_protocol_2_0= RULE_STRING ) ) otherlv_3= ':' )? ( ( (lv_proxyProtocol_4_0= RULE_STRING ) ) otherlv_5= '://' )? ( ( (lv_username_6_0= RULE_STRING ) ) otherlv_7= ':' ( (lv_password_8_0= RULE_STRING ) ) otherlv_9= 'a' )? ( (lv_hostname_10_0= RULE_STRING ) ) (otherlv_11= ':' ( (lv_port_12_0= RULE_INT ) ) )?
            {
            otherlv_0=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getProxyFlagAccess().getProxyKeyword_0());
            		
            this_VALUE_1=(Token)match(input,RULE_VALUE,FOLLOW_7); 

            			newLeafNode(this_VALUE_1, grammarAccess.getProxyFlagAccess().getVALUETerminalRuleCall_1());
            		
            // InternalCurlBetterThanHttpie.g:439:3: ( ( (lv_protocol_2_0= RULE_STRING ) ) otherlv_3= ':' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==21) ) {
                    int LA9_2 = input.LA(3);

                    if ( (LA9_2==RULE_STRING) ) {
                        int LA9_4 = input.LA(4);

                        if ( (LA9_4==EOF||LA9_4==RULE_WS||(LA9_4>=21 && LA9_4<=22)) ) {
                            alt9=1;
                        }
                    }
                }
            }
            switch (alt9) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:440:4: ( (lv_protocol_2_0= RULE_STRING ) ) otherlv_3= ':'
                    {
                    // InternalCurlBetterThanHttpie.g:440:4: ( (lv_protocol_2_0= RULE_STRING ) )
                    // InternalCurlBetterThanHttpie.g:441:5: (lv_protocol_2_0= RULE_STRING )
                    {
                    // InternalCurlBetterThanHttpie.g:441:5: (lv_protocol_2_0= RULE_STRING )
                    // InternalCurlBetterThanHttpie.g:442:6: lv_protocol_2_0= RULE_STRING
                    {
                    lv_protocol_2_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

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

                    otherlv_3=(Token)match(input,21,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getProxyFlagAccess().getColonKeyword_2_1());
                    			

                    }
                    break;

            }

            // InternalCurlBetterThanHttpie.g:463:3: ( ( (lv_proxyProtocol_4_0= RULE_STRING ) ) otherlv_5= '://' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==22) ) {
                    alt10=1;
                }
            }
            switch (alt10) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:464:4: ( (lv_proxyProtocol_4_0= RULE_STRING ) ) otherlv_5= '://'
                    {
                    // InternalCurlBetterThanHttpie.g:464:4: ( (lv_proxyProtocol_4_0= RULE_STRING ) )
                    // InternalCurlBetterThanHttpie.g:465:5: (lv_proxyProtocol_4_0= RULE_STRING )
                    {
                    // InternalCurlBetterThanHttpie.g:465:5: (lv_proxyProtocol_4_0= RULE_STRING )
                    // InternalCurlBetterThanHttpie.g:466:6: lv_proxyProtocol_4_0= RULE_STRING
                    {
                    lv_proxyProtocol_4_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

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

                    otherlv_5=(Token)match(input,22,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getProxyFlagAccess().getColonSolidusSolidusKeyword_3_1());
                    			

                    }
                    break;

            }

            // InternalCurlBetterThanHttpie.g:487:3: ( ( (lv_username_6_0= RULE_STRING ) ) otherlv_7= ':' ( (lv_password_8_0= RULE_STRING ) ) otherlv_9= 'a' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==21) ) {
                    int LA11_2 = input.LA(3);

                    if ( (LA11_2==RULE_STRING) ) {
                        alt11=1;
                    }
                }
            }
            switch (alt11) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:488:4: ( (lv_username_6_0= RULE_STRING ) ) otherlv_7= ':' ( (lv_password_8_0= RULE_STRING ) ) otherlv_9= 'a'
                    {
                    // InternalCurlBetterThanHttpie.g:488:4: ( (lv_username_6_0= RULE_STRING ) )
                    // InternalCurlBetterThanHttpie.g:489:5: (lv_username_6_0= RULE_STRING )
                    {
                    // InternalCurlBetterThanHttpie.g:489:5: (lv_username_6_0= RULE_STRING )
                    // InternalCurlBetterThanHttpie.g:490:6: lv_username_6_0= RULE_STRING
                    {
                    lv_username_6_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

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

                    otherlv_7=(Token)match(input,21,FOLLOW_7); 

                    				newLeafNode(otherlv_7, grammarAccess.getProxyFlagAccess().getColonKeyword_4_1());
                    			
                    // InternalCurlBetterThanHttpie.g:510:4: ( (lv_password_8_0= RULE_STRING ) )
                    // InternalCurlBetterThanHttpie.g:511:5: (lv_password_8_0= RULE_STRING )
                    {
                    // InternalCurlBetterThanHttpie.g:511:5: (lv_password_8_0= RULE_STRING )
                    // InternalCurlBetterThanHttpie.g:512:6: lv_password_8_0= RULE_STRING
                    {
                    lv_password_8_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

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

                    otherlv_9=(Token)match(input,23,FOLLOW_7); 

                    				newLeafNode(otherlv_9, grammarAccess.getProxyFlagAccess().getAKeyword_4_3());
                    			

                    }
                    break;

            }

            // InternalCurlBetterThanHttpie.g:533:3: ( (lv_hostname_10_0= RULE_STRING ) )
            // InternalCurlBetterThanHttpie.g:534:4: (lv_hostname_10_0= RULE_STRING )
            {
            // InternalCurlBetterThanHttpie.g:534:4: (lv_hostname_10_0= RULE_STRING )
            // InternalCurlBetterThanHttpie.g:535:5: lv_hostname_10_0= RULE_STRING
            {
            lv_hostname_10_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

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

            // InternalCurlBetterThanHttpie.g:551:3: (otherlv_11= ':' ( (lv_port_12_0= RULE_INT ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:552:4: otherlv_11= ':' ( (lv_port_12_0= RULE_INT ) )
                    {
                    otherlv_11=(Token)match(input,21,FOLLOW_12); 

                    				newLeafNode(otherlv_11, grammarAccess.getProxyFlagAccess().getColonKeyword_6_0());
                    			
                    // InternalCurlBetterThanHttpie.g:556:4: ( (lv_port_12_0= RULE_INT ) )
                    // InternalCurlBetterThanHttpie.g:557:5: (lv_port_12_0= RULE_INT )
                    {
                    // InternalCurlBetterThanHttpie.g:557:5: (lv_port_12_0= RULE_INT )
                    // InternalCurlBetterThanHttpie.g:558:6: lv_port_12_0= RULE_INT
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
    // InternalCurlBetterThanHttpie.g:579:1: entryRuleAuthFlag returns [EObject current=null] : iv_ruleAuthFlag= ruleAuthFlag EOF ;
    public final EObject entryRuleAuthFlag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAuthFlag = null;


        try {
            // InternalCurlBetterThanHttpie.g:579:49: (iv_ruleAuthFlag= ruleAuthFlag EOF )
            // InternalCurlBetterThanHttpie.g:580:2: iv_ruleAuthFlag= ruleAuthFlag EOF
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
    // InternalCurlBetterThanHttpie.g:586:1: ruleAuthFlag returns [EObject current=null] : ( (otherlv_0= '--auth' | otherlv_1= '-a' ) this_VALUE_2= RULE_VALUE ( (lv_username_3_0= RULE_STRING ) ) (otherlv_4= ':' ( (lv_password_5_0= RULE_STRING ) ) )? (otherlv_6= '@' ( (lv_hostname_7_0= RULE_STRING ) ) )? ) ;
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
            // InternalCurlBetterThanHttpie.g:592:2: ( ( (otherlv_0= '--auth' | otherlv_1= '-a' ) this_VALUE_2= RULE_VALUE ( (lv_username_3_0= RULE_STRING ) ) (otherlv_4= ':' ( (lv_password_5_0= RULE_STRING ) ) )? (otherlv_6= '@' ( (lv_hostname_7_0= RULE_STRING ) ) )? ) )
            // InternalCurlBetterThanHttpie.g:593:2: ( (otherlv_0= '--auth' | otherlv_1= '-a' ) this_VALUE_2= RULE_VALUE ( (lv_username_3_0= RULE_STRING ) ) (otherlv_4= ':' ( (lv_password_5_0= RULE_STRING ) ) )? (otherlv_6= '@' ( (lv_hostname_7_0= RULE_STRING ) ) )? )
            {
            // InternalCurlBetterThanHttpie.g:593:2: ( (otherlv_0= '--auth' | otherlv_1= '-a' ) this_VALUE_2= RULE_VALUE ( (lv_username_3_0= RULE_STRING ) ) (otherlv_4= ':' ( (lv_password_5_0= RULE_STRING ) ) )? (otherlv_6= '@' ( (lv_hostname_7_0= RULE_STRING ) ) )? )
            // InternalCurlBetterThanHttpie.g:594:3: (otherlv_0= '--auth' | otherlv_1= '-a' ) this_VALUE_2= RULE_VALUE ( (lv_username_3_0= RULE_STRING ) ) (otherlv_4= ':' ( (lv_password_5_0= RULE_STRING ) ) )? (otherlv_6= '@' ( (lv_hostname_7_0= RULE_STRING ) ) )?
            {
            // InternalCurlBetterThanHttpie.g:594:3: (otherlv_0= '--auth' | otherlv_1= '-a' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            else if ( (LA13_0==25) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:595:4: otherlv_0= '--auth'
                    {
                    otherlv_0=(Token)match(input,24,FOLLOW_6); 

                    				newLeafNode(otherlv_0, grammarAccess.getAuthFlagAccess().getAuthKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:600:4: otherlv_1= '-a'
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getAuthFlagAccess().getAKeyword_0_1());
                    			

                    }
                    break;

            }

            this_VALUE_2=(Token)match(input,RULE_VALUE,FOLLOW_7); 

            			newLeafNode(this_VALUE_2, grammarAccess.getAuthFlagAccess().getVALUETerminalRuleCall_1());
            		
            // InternalCurlBetterThanHttpie.g:609:3: ( (lv_username_3_0= RULE_STRING ) )
            // InternalCurlBetterThanHttpie.g:610:4: (lv_username_3_0= RULE_STRING )
            {
            // InternalCurlBetterThanHttpie.g:610:4: (lv_username_3_0= RULE_STRING )
            // InternalCurlBetterThanHttpie.g:611:5: lv_username_3_0= RULE_STRING
            {
            lv_username_3_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

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

            // InternalCurlBetterThanHttpie.g:627:3: (otherlv_4= ':' ( (lv_password_5_0= RULE_STRING ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:628:4: otherlv_4= ':' ( (lv_password_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getAuthFlagAccess().getColonKeyword_3_0());
                    			
                    // InternalCurlBetterThanHttpie.g:632:4: ( (lv_password_5_0= RULE_STRING ) )
                    // InternalCurlBetterThanHttpie.g:633:5: (lv_password_5_0= RULE_STRING )
                    {
                    // InternalCurlBetterThanHttpie.g:633:5: (lv_password_5_0= RULE_STRING )
                    // InternalCurlBetterThanHttpie.g:634:6: lv_password_5_0= RULE_STRING
                    {
                    lv_password_5_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

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

            // InternalCurlBetterThanHttpie.g:651:3: (otherlv_6= '@' ( (lv_hostname_7_0= RULE_STRING ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:652:4: otherlv_6= '@' ( (lv_hostname_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getAuthFlagAccess().getCommercialAtKeyword_4_0());
                    			
                    // InternalCurlBetterThanHttpie.g:656:4: ( (lv_hostname_7_0= RULE_STRING ) )
                    // InternalCurlBetterThanHttpie.g:657:5: (lv_hostname_7_0= RULE_STRING )
                    {
                    // InternalCurlBetterThanHttpie.g:657:5: (lv_hostname_7_0= RULE_STRING )
                    // InternalCurlBetterThanHttpie.g:658:6: lv_hostname_7_0= RULE_STRING
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
    // InternalCurlBetterThanHttpie.g:679:1: entryRuleDownloadFlag returns [EObject current=null] : iv_ruleDownloadFlag= ruleDownloadFlag EOF ;
    public final EObject entryRuleDownloadFlag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDownloadFlag = null;


        try {
            // InternalCurlBetterThanHttpie.g:679:53: (iv_ruleDownloadFlag= ruleDownloadFlag EOF )
            // InternalCurlBetterThanHttpie.g:680:2: iv_ruleDownloadFlag= ruleDownloadFlag EOF
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
    // InternalCurlBetterThanHttpie.g:686:1: ruleDownloadFlag returns [EObject current=null] : ( () (otherlv_1= '--download' | otherlv_2= '-d' ) ) ;
    public final EObject ruleDownloadFlag() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:692:2: ( ( () (otherlv_1= '--download' | otherlv_2= '-d' ) ) )
            // InternalCurlBetterThanHttpie.g:693:2: ( () (otherlv_1= '--download' | otherlv_2= '-d' ) )
            {
            // InternalCurlBetterThanHttpie.g:693:2: ( () (otherlv_1= '--download' | otherlv_2= '-d' ) )
            // InternalCurlBetterThanHttpie.g:694:3: () (otherlv_1= '--download' | otherlv_2= '-d' )
            {
            // InternalCurlBetterThanHttpie.g:694:3: ()
            // InternalCurlBetterThanHttpie.g:695:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDownloadFlagAccess().getDownloadFlagAction_0(),
            					current);
            			

            }

            // InternalCurlBetterThanHttpie.g:701:3: (otherlv_1= '--download' | otherlv_2= '-d' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==27) ) {
                alt16=1;
            }
            else if ( (LA16_0==28) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:702:4: otherlv_1= '--download'
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getDownloadFlagAccess().getDownloadKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:707:4: otherlv_2= '-d'
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_2); 

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
    // InternalCurlBetterThanHttpie.g:716:1: entryRuleHelpFlag returns [EObject current=null] : iv_ruleHelpFlag= ruleHelpFlag EOF ;
    public final EObject entryRuleHelpFlag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHelpFlag = null;


        try {
            // InternalCurlBetterThanHttpie.g:716:49: (iv_ruleHelpFlag= ruleHelpFlag EOF )
            // InternalCurlBetterThanHttpie.g:717:2: iv_ruleHelpFlag= ruleHelpFlag EOF
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
    // InternalCurlBetterThanHttpie.g:723:1: ruleHelpFlag returns [EObject current=null] : ( () (otherlv_1= '--help' | otherlv_2= '-h' ) ) ;
    public final EObject ruleHelpFlag() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:729:2: ( ( () (otherlv_1= '--help' | otherlv_2= '-h' ) ) )
            // InternalCurlBetterThanHttpie.g:730:2: ( () (otherlv_1= '--help' | otherlv_2= '-h' ) )
            {
            // InternalCurlBetterThanHttpie.g:730:2: ( () (otherlv_1= '--help' | otherlv_2= '-h' ) )
            // InternalCurlBetterThanHttpie.g:731:3: () (otherlv_1= '--help' | otherlv_2= '-h' )
            {
            // InternalCurlBetterThanHttpie.g:731:3: ()
            // InternalCurlBetterThanHttpie.g:732:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHelpFlagAccess().getHelpFlagAction_0(),
            					current);
            			

            }

            // InternalCurlBetterThanHttpie.g:738:3: (otherlv_1= '--help' | otherlv_2= '-h' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==29) ) {
                alt17=1;
            }
            else if ( (LA17_0==30) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:739:4: otherlv_1= '--help'
                    {
                    otherlv_1=(Token)match(input,29,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getHelpFlagAccess().getHelpKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:744:4: otherlv_2= '-h'
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_2); 

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
    // InternalCurlBetterThanHttpie.g:753:1: entryRuleVersionFlag returns [EObject current=null] : iv_ruleVersionFlag= ruleVersionFlag EOF ;
    public final EObject entryRuleVersionFlag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersionFlag = null;


        try {
            // InternalCurlBetterThanHttpie.g:753:52: (iv_ruleVersionFlag= ruleVersionFlag EOF )
            // InternalCurlBetterThanHttpie.g:754:2: iv_ruleVersionFlag= ruleVersionFlag EOF
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
    // InternalCurlBetterThanHttpie.g:760:1: ruleVersionFlag returns [EObject current=null] : ( () otherlv_1= '--version' ) ;
    public final EObject ruleVersionFlag() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:766:2: ( ( () otherlv_1= '--version' ) )
            // InternalCurlBetterThanHttpie.g:767:2: ( () otherlv_1= '--version' )
            {
            // InternalCurlBetterThanHttpie.g:767:2: ( () otherlv_1= '--version' )
            // InternalCurlBetterThanHttpie.g:768:3: () otherlv_1= '--version'
            {
            // InternalCurlBetterThanHttpie.g:768:3: ()
            // InternalCurlBetterThanHttpie.g:769:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVersionFlagAccess().getVersionFlagAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_2); 

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
    // InternalCurlBetterThanHttpie.g:783:1: entryRuleVerboseFlag returns [EObject current=null] : iv_ruleVerboseFlag= ruleVerboseFlag EOF ;
    public final EObject entryRuleVerboseFlag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerboseFlag = null;


        try {
            // InternalCurlBetterThanHttpie.g:783:52: (iv_ruleVerboseFlag= ruleVerboseFlag EOF )
            // InternalCurlBetterThanHttpie.g:784:2: iv_ruleVerboseFlag= ruleVerboseFlag EOF
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
    // InternalCurlBetterThanHttpie.g:790:1: ruleVerboseFlag returns [EObject current=null] : ( () (otherlv_1= '--verbose' | otherlv_2= '-v' ) ) ;
    public final EObject ruleVerboseFlag() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:796:2: ( ( () (otherlv_1= '--verbose' | otherlv_2= '-v' ) ) )
            // InternalCurlBetterThanHttpie.g:797:2: ( () (otherlv_1= '--verbose' | otherlv_2= '-v' ) )
            {
            // InternalCurlBetterThanHttpie.g:797:2: ( () (otherlv_1= '--verbose' | otherlv_2= '-v' ) )
            // InternalCurlBetterThanHttpie.g:798:3: () (otherlv_1= '--verbose' | otherlv_2= '-v' )
            {
            // InternalCurlBetterThanHttpie.g:798:3: ()
            // InternalCurlBetterThanHttpie.g:799:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVerboseFlagAccess().getVerboseFlagAction_0(),
            					current);
            			

            }

            // InternalCurlBetterThanHttpie.g:805:3: (otherlv_1= '--verbose' | otherlv_2= '-v' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==32) ) {
                alt18=1;
            }
            else if ( (LA18_0==33) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:806:4: otherlv_1= '--verbose'
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getVerboseFlagAccess().getVerboseKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:811:4: otherlv_2= '-v'
                    {
                    otherlv_2=(Token)match(input,33,FOLLOW_2); 

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
    // InternalCurlBetterThanHttpie.g:820:1: entryRuleTimeoutFlag returns [EObject current=null] : iv_ruleTimeoutFlag= ruleTimeoutFlag EOF ;
    public final EObject entryRuleTimeoutFlag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeoutFlag = null;


        try {
            // InternalCurlBetterThanHttpie.g:820:52: (iv_ruleTimeoutFlag= ruleTimeoutFlag EOF )
            // InternalCurlBetterThanHttpie.g:821:2: iv_ruleTimeoutFlag= ruleTimeoutFlag EOF
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
    // InternalCurlBetterThanHttpie.g:827:1: ruleTimeoutFlag returns [EObject current=null] : (otherlv_0= '--timeout' this_VALUE_1= RULE_VALUE ( (lv_timeout_2_0= RULE_FLOAT ) ) ) ;
    public final EObject ruleTimeoutFlag() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_VALUE_1=null;
        Token lv_timeout_2_0=null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:833:2: ( (otherlv_0= '--timeout' this_VALUE_1= RULE_VALUE ( (lv_timeout_2_0= RULE_FLOAT ) ) ) )
            // InternalCurlBetterThanHttpie.g:834:2: (otherlv_0= '--timeout' this_VALUE_1= RULE_VALUE ( (lv_timeout_2_0= RULE_FLOAT ) ) )
            {
            // InternalCurlBetterThanHttpie.g:834:2: (otherlv_0= '--timeout' this_VALUE_1= RULE_VALUE ( (lv_timeout_2_0= RULE_FLOAT ) ) )
            // InternalCurlBetterThanHttpie.g:835:3: otherlv_0= '--timeout' this_VALUE_1= RULE_VALUE ( (lv_timeout_2_0= RULE_FLOAT ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getTimeoutFlagAccess().getTimeoutKeyword_0());
            		
            this_VALUE_1=(Token)match(input,RULE_VALUE,FOLLOW_15); 

            			newLeafNode(this_VALUE_1, grammarAccess.getTimeoutFlagAccess().getVALUETerminalRuleCall_1());
            		
            // InternalCurlBetterThanHttpie.g:843:3: ( (lv_timeout_2_0= RULE_FLOAT ) )
            // InternalCurlBetterThanHttpie.g:844:4: (lv_timeout_2_0= RULE_FLOAT )
            {
            // InternalCurlBetterThanHttpie.g:844:4: (lv_timeout_2_0= RULE_FLOAT )
            // InternalCurlBetterThanHttpie.g:845:5: lv_timeout_2_0= RULE_FLOAT
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


    // $ANTLR start "ruleMethod"
    // InternalCurlBetterThanHttpie.g:865:1: ruleMethod returns [Enumerator current=null] : ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) ) ;
    public final Enumerator ruleMethod() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:871:2: ( ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) ) )
            // InternalCurlBetterThanHttpie.g:872:2: ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) )
            {
            // InternalCurlBetterThanHttpie.g:872:2: ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) )
            int alt19=4;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt19=1;
                }
                break;
            case 36:
                {
                alt19=2;
                }
                break;
            case 37:
                {
                alt19=3;
                }
                break;
            case 38:
                {
                alt19=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:873:3: (enumLiteral_0= 'GET' )
                    {
                    // InternalCurlBetterThanHttpie.g:873:3: (enumLiteral_0= 'GET' )
                    // InternalCurlBetterThanHttpie.g:874:4: enumLiteral_0= 'GET'
                    {
                    enumLiteral_0=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getMethodAccess().getGETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMethodAccess().getGETEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:881:3: (enumLiteral_1= 'POST' )
                    {
                    // InternalCurlBetterThanHttpie.g:881:3: (enumLiteral_1= 'POST' )
                    // InternalCurlBetterThanHttpie.g:882:4: enumLiteral_1= 'POST'
                    {
                    enumLiteral_1=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getMethodAccess().getPOSTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMethodAccess().getPOSTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCurlBetterThanHttpie.g:889:3: (enumLiteral_2= 'PUT' )
                    {
                    // InternalCurlBetterThanHttpie.g:889:3: (enumLiteral_2= 'PUT' )
                    // InternalCurlBetterThanHttpie.g:890:4: enumLiteral_2= 'PUT'
                    {
                    enumLiteral_2=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getMethodAccess().getPUTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMethodAccess().getPUTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalCurlBetterThanHttpie.g:897:3: (enumLiteral_3= 'DELETE' )
                    {
                    // InternalCurlBetterThanHttpie.g:897:3: (enumLiteral_3= 'DELETE' )
                    // InternalCurlBetterThanHttpie.g:898:4: enumLiteral_3= 'DELETE'
                    {
                    enumLiteral_3=(Token)match(input,38,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000007FB1FF000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000007800000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004200002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000100L});

}