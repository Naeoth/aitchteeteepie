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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WS", "RULE_BASIC_STRING", "RULE_STRING_UP", "RULE_DIGIT", "RULE_LETTER", "RULE_SPECIAL_UP", "RULE_INT", "RULE_FLOAT", "'http'", "'--header'", "'-t'", "'--body'", "'-b'", "'--json'", "'-j'", "'--form'", "'-f'", "'--proxy'", "'='", "':'", "'://'", "'--auth'", "'-a'", "'--download'", "'-d'", "'--help'", "'-h'", "'--version'", "'--verbose'", "'-v'", "'--timeout'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_BASIC_STRING=5;
    public static final int RULE_SPECIAL_UP=9;
    public static final int RULE_WS=4;
    public static final int RULE_DIGIT=7;
    public static final int RULE_LETTER=8;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=10;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_STRING_UP=6;
    public static final int T__23=23;
    public static final int RULE_FLOAT=11;
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
    // InternalCurlBetterThanHttpie.g:72:1: ruleCommandLineInterface returns [EObject current=null] : ( () otherlv_1= 'http' (this_WS_2= RULE_WS ( (lv_flags_3_0= ruleFlag ) ) )* (this_WS_4= RULE_WS )? ) ;
    public final EObject ruleCommandLineInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_WS_2=null;
        Token this_WS_4=null;
        EObject lv_flags_3_0 = null;



        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:78:2: ( ( () otherlv_1= 'http' (this_WS_2= RULE_WS ( (lv_flags_3_0= ruleFlag ) ) )* (this_WS_4= RULE_WS )? ) )
            // InternalCurlBetterThanHttpie.g:79:2: ( () otherlv_1= 'http' (this_WS_2= RULE_WS ( (lv_flags_3_0= ruleFlag ) ) )* (this_WS_4= RULE_WS )? )
            {
            // InternalCurlBetterThanHttpie.g:79:2: ( () otherlv_1= 'http' (this_WS_2= RULE_WS ( (lv_flags_3_0= ruleFlag ) ) )* (this_WS_4= RULE_WS )? )
            // InternalCurlBetterThanHttpie.g:80:3: () otherlv_1= 'http' (this_WS_2= RULE_WS ( (lv_flags_3_0= ruleFlag ) ) )* (this_WS_4= RULE_WS )?
            {
            // InternalCurlBetterThanHttpie.g:80:3: ()
            // InternalCurlBetterThanHttpie.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCommandLineInterfaceAccess().getCommandLineInterfaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCommandLineInterfaceAccess().getHttpKeyword_1());
            		
            // InternalCurlBetterThanHttpie.g:91:3: (this_WS_2= RULE_WS ( (lv_flags_3_0= ruleFlag ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_WS) ) {
                    int LA1_1 = input.LA(2);

                    if ( ((LA1_1>=13 && LA1_1<=21)||(LA1_1>=25 && LA1_1<=34)) ) {
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

            // InternalCurlBetterThanHttpie.g:116:3: (this_WS_4= RULE_WS )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_WS) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:117:4: this_WS_4= RULE_WS
                    {
                    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_2); 

                    				newLeafNode(this_WS_4, grammarAccess.getCommandLineInterfaceAccess().getWSTerminalRuleCall_3());
                    			

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
    // InternalCurlBetterThanHttpie.g:126:1: entryRuleFlag returns [EObject current=null] : iv_ruleFlag= ruleFlag EOF ;
    public final EObject entryRuleFlag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlag = null;


        try {
            // InternalCurlBetterThanHttpie.g:126:45: (iv_ruleFlag= ruleFlag EOF )
            // InternalCurlBetterThanHttpie.g:127:2: iv_ruleFlag= ruleFlag EOF
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
    // InternalCurlBetterThanHttpie.g:133:1: ruleFlag returns [EObject current=null] : (this_ProxyFlag_0= ruleProxyFlag | this_FormFlag_1= ruleFormFlag | this_AuthFlag_2= ruleAuthFlag | this_DownloadFlag_3= ruleDownloadFlag | this_BodyFlag_4= ruleBodyFlag | this_VersionFlag_5= ruleVersionFlag | this_JsonFlag_6= ruleJsonFlag | this_HelpFlag_7= ruleHelpFlag | this_HeadersFlag_8= ruleHeadersFlag | this_VerboseFlag_9= ruleVerboseFlag | this_TimeoutFlag_10= ruleTimeoutFlag ) ;
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
            // InternalCurlBetterThanHttpie.g:139:2: ( (this_ProxyFlag_0= ruleProxyFlag | this_FormFlag_1= ruleFormFlag | this_AuthFlag_2= ruleAuthFlag | this_DownloadFlag_3= ruleDownloadFlag | this_BodyFlag_4= ruleBodyFlag | this_VersionFlag_5= ruleVersionFlag | this_JsonFlag_6= ruleJsonFlag | this_HelpFlag_7= ruleHelpFlag | this_HeadersFlag_8= ruleHeadersFlag | this_VerboseFlag_9= ruleVerboseFlag | this_TimeoutFlag_10= ruleTimeoutFlag ) )
            // InternalCurlBetterThanHttpie.g:140:2: (this_ProxyFlag_0= ruleProxyFlag | this_FormFlag_1= ruleFormFlag | this_AuthFlag_2= ruleAuthFlag | this_DownloadFlag_3= ruleDownloadFlag | this_BodyFlag_4= ruleBodyFlag | this_VersionFlag_5= ruleVersionFlag | this_JsonFlag_6= ruleJsonFlag | this_HelpFlag_7= ruleHelpFlag | this_HeadersFlag_8= ruleHeadersFlag | this_VerboseFlag_9= ruleVerboseFlag | this_TimeoutFlag_10= ruleTimeoutFlag )
            {
            // InternalCurlBetterThanHttpie.g:140:2: (this_ProxyFlag_0= ruleProxyFlag | this_FormFlag_1= ruleFormFlag | this_AuthFlag_2= ruleAuthFlag | this_DownloadFlag_3= ruleDownloadFlag | this_BodyFlag_4= ruleBodyFlag | this_VersionFlag_5= ruleVersionFlag | this_JsonFlag_6= ruleJsonFlag | this_HelpFlag_7= ruleHelpFlag | this_HeadersFlag_8= ruleHeadersFlag | this_VerboseFlag_9= ruleVerboseFlag | this_TimeoutFlag_10= ruleTimeoutFlag )
            int alt3=11;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt3=1;
                }
                break;
            case 19:
            case 20:
                {
                alt3=2;
                }
                break;
            case 25:
            case 26:
                {
                alt3=3;
                }
                break;
            case 27:
            case 28:
                {
                alt3=4;
                }
                break;
            case 15:
            case 16:
                {
                alt3=5;
                }
                break;
            case 31:
                {
                alt3=6;
                }
                break;
            case 17:
            case 18:
                {
                alt3=7;
                }
                break;
            case 29:
            case 30:
                {
                alt3=8;
                }
                break;
            case 13:
            case 14:
                {
                alt3=9;
                }
                break;
            case 32:
            case 33:
                {
                alt3=10;
                }
                break;
            case 34:
                {
                alt3=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:141:3: this_ProxyFlag_0= ruleProxyFlag
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
                    // InternalCurlBetterThanHttpie.g:150:3: this_FormFlag_1= ruleFormFlag
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
                    // InternalCurlBetterThanHttpie.g:159:3: this_AuthFlag_2= ruleAuthFlag
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
                    // InternalCurlBetterThanHttpie.g:168:3: this_DownloadFlag_3= ruleDownloadFlag
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
                    // InternalCurlBetterThanHttpie.g:177:3: this_BodyFlag_4= ruleBodyFlag
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
                    // InternalCurlBetterThanHttpie.g:186:3: this_VersionFlag_5= ruleVersionFlag
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
                    // InternalCurlBetterThanHttpie.g:195:3: this_JsonFlag_6= ruleJsonFlag
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
                    // InternalCurlBetterThanHttpie.g:204:3: this_HelpFlag_7= ruleHelpFlag
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
                    // InternalCurlBetterThanHttpie.g:213:3: this_HeadersFlag_8= ruleHeadersFlag
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
                    // InternalCurlBetterThanHttpie.g:222:3: this_VerboseFlag_9= ruleVerboseFlag
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
                    // InternalCurlBetterThanHttpie.g:231:3: this_TimeoutFlag_10= ruleTimeoutFlag
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
    // InternalCurlBetterThanHttpie.g:243:1: entryRuleHeadersFlag returns [EObject current=null] : iv_ruleHeadersFlag= ruleHeadersFlag EOF ;
    public final EObject entryRuleHeadersFlag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeadersFlag = null;


        try {
            // InternalCurlBetterThanHttpie.g:243:52: (iv_ruleHeadersFlag= ruleHeadersFlag EOF )
            // InternalCurlBetterThanHttpie.g:244:2: iv_ruleHeadersFlag= ruleHeadersFlag EOF
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
    // InternalCurlBetterThanHttpie.g:250:1: ruleHeadersFlag returns [EObject current=null] : ( () (otherlv_1= '--header' | otherlv_2= '-t' ) ) ;
    public final EObject ruleHeadersFlag() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:256:2: ( ( () (otherlv_1= '--header' | otherlv_2= '-t' ) ) )
            // InternalCurlBetterThanHttpie.g:257:2: ( () (otherlv_1= '--header' | otherlv_2= '-t' ) )
            {
            // InternalCurlBetterThanHttpie.g:257:2: ( () (otherlv_1= '--header' | otherlv_2= '-t' ) )
            // InternalCurlBetterThanHttpie.g:258:3: () (otherlv_1= '--header' | otherlv_2= '-t' )
            {
            // InternalCurlBetterThanHttpie.g:258:3: ()
            // InternalCurlBetterThanHttpie.g:259:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHeadersFlagAccess().getHeadersFlagAction_0(),
            					current);
            			

            }

            // InternalCurlBetterThanHttpie.g:265:3: (otherlv_1= '--header' | otherlv_2= '-t' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            else if ( (LA4_0==14) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:266:4: otherlv_1= '--header'
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getHeadersFlagAccess().getHeaderKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:271:4: otherlv_2= '-t'
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_2); 

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
    // InternalCurlBetterThanHttpie.g:280:1: entryRuleBodyFlag returns [EObject current=null] : iv_ruleBodyFlag= ruleBodyFlag EOF ;
    public final EObject entryRuleBodyFlag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyFlag = null;


        try {
            // InternalCurlBetterThanHttpie.g:280:49: (iv_ruleBodyFlag= ruleBodyFlag EOF )
            // InternalCurlBetterThanHttpie.g:281:2: iv_ruleBodyFlag= ruleBodyFlag EOF
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
    // InternalCurlBetterThanHttpie.g:287:1: ruleBodyFlag returns [EObject current=null] : ( () (otherlv_1= '--body' | otherlv_2= '-b' ) ) ;
    public final EObject ruleBodyFlag() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:293:2: ( ( () (otherlv_1= '--body' | otherlv_2= '-b' ) ) )
            // InternalCurlBetterThanHttpie.g:294:2: ( () (otherlv_1= '--body' | otherlv_2= '-b' ) )
            {
            // InternalCurlBetterThanHttpie.g:294:2: ( () (otherlv_1= '--body' | otherlv_2= '-b' ) )
            // InternalCurlBetterThanHttpie.g:295:3: () (otherlv_1= '--body' | otherlv_2= '-b' )
            {
            // InternalCurlBetterThanHttpie.g:295:3: ()
            // InternalCurlBetterThanHttpie.g:296:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBodyFlagAccess().getBodyFlagAction_0(),
            					current);
            			

            }

            // InternalCurlBetterThanHttpie.g:302:3: (otherlv_1= '--body' | otherlv_2= '-b' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            else if ( (LA5_0==16) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:303:4: otherlv_1= '--body'
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getBodyFlagAccess().getBodyKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:308:4: otherlv_2= '-b'
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_2); 

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
    // InternalCurlBetterThanHttpie.g:317:1: entryRuleJsonFlag returns [EObject current=null] : iv_ruleJsonFlag= ruleJsonFlag EOF ;
    public final EObject entryRuleJsonFlag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonFlag = null;


        try {
            // InternalCurlBetterThanHttpie.g:317:49: (iv_ruleJsonFlag= ruleJsonFlag EOF )
            // InternalCurlBetterThanHttpie.g:318:2: iv_ruleJsonFlag= ruleJsonFlag EOF
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
    // InternalCurlBetterThanHttpie.g:324:1: ruleJsonFlag returns [EObject current=null] : ( () (otherlv_1= '--json' | otherlv_2= '-j' ) ) ;
    public final EObject ruleJsonFlag() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:330:2: ( ( () (otherlv_1= '--json' | otherlv_2= '-j' ) ) )
            // InternalCurlBetterThanHttpie.g:331:2: ( () (otherlv_1= '--json' | otherlv_2= '-j' ) )
            {
            // InternalCurlBetterThanHttpie.g:331:2: ( () (otherlv_1= '--json' | otherlv_2= '-j' ) )
            // InternalCurlBetterThanHttpie.g:332:3: () (otherlv_1= '--json' | otherlv_2= '-j' )
            {
            // InternalCurlBetterThanHttpie.g:332:3: ()
            // InternalCurlBetterThanHttpie.g:333:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getJsonFlagAccess().getJsonFlagAction_0(),
            					current);
            			

            }

            // InternalCurlBetterThanHttpie.g:339:3: (otherlv_1= '--json' | otherlv_2= '-j' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            else if ( (LA6_0==18) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:340:4: otherlv_1= '--json'
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getJsonFlagAccess().getJsonKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:345:4: otherlv_2= '-j'
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_2); 

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
    // InternalCurlBetterThanHttpie.g:354:1: entryRuleFormFlag returns [EObject current=null] : iv_ruleFormFlag= ruleFormFlag EOF ;
    public final EObject entryRuleFormFlag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormFlag = null;


        try {
            // InternalCurlBetterThanHttpie.g:354:49: (iv_ruleFormFlag= ruleFormFlag EOF )
            // InternalCurlBetterThanHttpie.g:355:2: iv_ruleFormFlag= ruleFormFlag EOF
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
    // InternalCurlBetterThanHttpie.g:361:1: ruleFormFlag returns [EObject current=null] : ( () (otherlv_1= '--form' | otherlv_2= '-f' ) ) ;
    public final EObject ruleFormFlag() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:367:2: ( ( () (otherlv_1= '--form' | otherlv_2= '-f' ) ) )
            // InternalCurlBetterThanHttpie.g:368:2: ( () (otherlv_1= '--form' | otherlv_2= '-f' ) )
            {
            // InternalCurlBetterThanHttpie.g:368:2: ( () (otherlv_1= '--form' | otherlv_2= '-f' ) )
            // InternalCurlBetterThanHttpie.g:369:3: () (otherlv_1= '--form' | otherlv_2= '-f' )
            {
            // InternalCurlBetterThanHttpie.g:369:3: ()
            // InternalCurlBetterThanHttpie.g:370:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFormFlagAccess().getFormFlagAction_0(),
            					current);
            			

            }

            // InternalCurlBetterThanHttpie.g:376:3: (otherlv_1= '--form' | otherlv_2= '-f' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            else if ( (LA7_0==20) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:377:4: otherlv_1= '--form'
                    {
                    otherlv_1=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getFormFlagAccess().getFormKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:382:4: otherlv_2= '-f'
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_2); 

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
    // InternalCurlBetterThanHttpie.g:391:1: entryRuleProxyFlag returns [EObject current=null] : iv_ruleProxyFlag= ruleProxyFlag EOF ;
    public final EObject entryRuleProxyFlag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProxyFlag = null;


        try {
            // InternalCurlBetterThanHttpie.g:391:50: (iv_ruleProxyFlag= ruleProxyFlag EOF )
            // InternalCurlBetterThanHttpie.g:392:2: iv_ruleProxyFlag= ruleProxyFlag EOF
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
    // InternalCurlBetterThanHttpie.g:398:1: ruleProxyFlag returns [EObject current=null] : (otherlv_0= '--proxy' (otherlv_1= '=' | this_WS_2= RULE_WS ) ( ( ( ( (lv_protocol_3_0= RULE_BASIC_STRING ) ) otherlv_4= ':' ) ( ( (lv_proxyProtocol_5_0= RULE_BASIC_STRING ) ) otherlv_6= '://' )? ) | ( ( (lv_proxyProtocol_7_0= RULE_BASIC_STRING ) ) otherlv_8= '://' ) ) ( ( (lv_username_9_0= RULE_STRING_UP ) ) otherlv_10= ':' ( (lv_password_11_0= RULE_STRING_UP ) ) )? ) ;
    public final EObject ruleProxyFlag() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_WS_2=null;
        Token lv_protocol_3_0=null;
        Token otherlv_4=null;
        Token lv_proxyProtocol_5_0=null;
        Token otherlv_6=null;
        Token lv_proxyProtocol_7_0=null;
        Token otherlv_8=null;
        Token lv_username_9_0=null;
        Token otherlv_10=null;
        Token lv_password_11_0=null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:404:2: ( (otherlv_0= '--proxy' (otherlv_1= '=' | this_WS_2= RULE_WS ) ( ( ( ( (lv_protocol_3_0= RULE_BASIC_STRING ) ) otherlv_4= ':' ) ( ( (lv_proxyProtocol_5_0= RULE_BASIC_STRING ) ) otherlv_6= '://' )? ) | ( ( (lv_proxyProtocol_7_0= RULE_BASIC_STRING ) ) otherlv_8= '://' ) ) ( ( (lv_username_9_0= RULE_STRING_UP ) ) otherlv_10= ':' ( (lv_password_11_0= RULE_STRING_UP ) ) )? ) )
            // InternalCurlBetterThanHttpie.g:405:2: (otherlv_0= '--proxy' (otherlv_1= '=' | this_WS_2= RULE_WS ) ( ( ( ( (lv_protocol_3_0= RULE_BASIC_STRING ) ) otherlv_4= ':' ) ( ( (lv_proxyProtocol_5_0= RULE_BASIC_STRING ) ) otherlv_6= '://' )? ) | ( ( (lv_proxyProtocol_7_0= RULE_BASIC_STRING ) ) otherlv_8= '://' ) ) ( ( (lv_username_9_0= RULE_STRING_UP ) ) otherlv_10= ':' ( (lv_password_11_0= RULE_STRING_UP ) ) )? )
            {
            // InternalCurlBetterThanHttpie.g:405:2: (otherlv_0= '--proxy' (otherlv_1= '=' | this_WS_2= RULE_WS ) ( ( ( ( (lv_protocol_3_0= RULE_BASIC_STRING ) ) otherlv_4= ':' ) ( ( (lv_proxyProtocol_5_0= RULE_BASIC_STRING ) ) otherlv_6= '://' )? ) | ( ( (lv_proxyProtocol_7_0= RULE_BASIC_STRING ) ) otherlv_8= '://' ) ) ( ( (lv_username_9_0= RULE_STRING_UP ) ) otherlv_10= ':' ( (lv_password_11_0= RULE_STRING_UP ) ) )? )
            // InternalCurlBetterThanHttpie.g:406:3: otherlv_0= '--proxy' (otherlv_1= '=' | this_WS_2= RULE_WS ) ( ( ( ( (lv_protocol_3_0= RULE_BASIC_STRING ) ) otherlv_4= ':' ) ( ( (lv_proxyProtocol_5_0= RULE_BASIC_STRING ) ) otherlv_6= '://' )? ) | ( ( (lv_proxyProtocol_7_0= RULE_BASIC_STRING ) ) otherlv_8= '://' ) ) ( ( (lv_username_9_0= RULE_STRING_UP ) ) otherlv_10= ':' ( (lv_password_11_0= RULE_STRING_UP ) ) )?
            {
            otherlv_0=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getProxyFlagAccess().getProxyKeyword_0());
            		
            // InternalCurlBetterThanHttpie.g:410:3: (otherlv_1= '=' | this_WS_2= RULE_WS )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_WS) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:411:4: otherlv_1= '='
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getProxyFlagAccess().getEqualsSignKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:416:4: this_WS_2= RULE_WS
                    {
                    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_6); 

                    				newLeafNode(this_WS_2, grammarAccess.getProxyFlagAccess().getWSTerminalRuleCall_1_1());
                    			

                    }
                    break;

            }

            // InternalCurlBetterThanHttpie.g:421:3: ( ( ( ( (lv_protocol_3_0= RULE_BASIC_STRING ) ) otherlv_4= ':' ) ( ( (lv_proxyProtocol_5_0= RULE_BASIC_STRING ) ) otherlv_6= '://' )? ) | ( ( (lv_proxyProtocol_7_0= RULE_BASIC_STRING ) ) otherlv_8= '://' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_BASIC_STRING) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==24) ) {
                    alt10=2;
                }
                else if ( (LA10_1==23) ) {
                    alt10=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:422:4: ( ( ( (lv_protocol_3_0= RULE_BASIC_STRING ) ) otherlv_4= ':' ) ( ( (lv_proxyProtocol_5_0= RULE_BASIC_STRING ) ) otherlv_6= '://' )? )
                    {
                    // InternalCurlBetterThanHttpie.g:422:4: ( ( ( (lv_protocol_3_0= RULE_BASIC_STRING ) ) otherlv_4= ':' ) ( ( (lv_proxyProtocol_5_0= RULE_BASIC_STRING ) ) otherlv_6= '://' )? )
                    // InternalCurlBetterThanHttpie.g:423:5: ( ( (lv_protocol_3_0= RULE_BASIC_STRING ) ) otherlv_4= ':' ) ( ( (lv_proxyProtocol_5_0= RULE_BASIC_STRING ) ) otherlv_6= '://' )?
                    {
                    // InternalCurlBetterThanHttpie.g:423:5: ( ( (lv_protocol_3_0= RULE_BASIC_STRING ) ) otherlv_4= ':' )
                    // InternalCurlBetterThanHttpie.g:424:6: ( (lv_protocol_3_0= RULE_BASIC_STRING ) ) otherlv_4= ':'
                    {
                    // InternalCurlBetterThanHttpie.g:424:6: ( (lv_protocol_3_0= RULE_BASIC_STRING ) )
                    // InternalCurlBetterThanHttpie.g:425:7: (lv_protocol_3_0= RULE_BASIC_STRING )
                    {
                    // InternalCurlBetterThanHttpie.g:425:7: (lv_protocol_3_0= RULE_BASIC_STRING )
                    // InternalCurlBetterThanHttpie.g:426:8: lv_protocol_3_0= RULE_BASIC_STRING
                    {
                    lv_protocol_3_0=(Token)match(input,RULE_BASIC_STRING,FOLLOW_7); 

                    								newLeafNode(lv_protocol_3_0, grammarAccess.getProxyFlagAccess().getProtocolBASIC_STRINGTerminalRuleCall_2_0_0_0_0());
                    							

                    								if (current==null) {
                    									current = createModelElement(grammarAccess.getProxyFlagRule());
                    								}
                    								setWithLastConsumed(
                    									current,
                    									"protocol",
                    									lv_protocol_3_0,
                    									"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.BASIC_STRING");
                    							

                    }


                    }

                    otherlv_4=(Token)match(input,23,FOLLOW_8); 

                    						newLeafNode(otherlv_4, grammarAccess.getProxyFlagAccess().getColonKeyword_2_0_0_1());
                    					

                    }

                    // InternalCurlBetterThanHttpie.g:447:5: ( ( (lv_proxyProtocol_5_0= RULE_BASIC_STRING ) ) otherlv_6= '://' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==RULE_BASIC_STRING) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalCurlBetterThanHttpie.g:448:6: ( (lv_proxyProtocol_5_0= RULE_BASIC_STRING ) ) otherlv_6= '://'
                            {
                            // InternalCurlBetterThanHttpie.g:448:6: ( (lv_proxyProtocol_5_0= RULE_BASIC_STRING ) )
                            // InternalCurlBetterThanHttpie.g:449:7: (lv_proxyProtocol_5_0= RULE_BASIC_STRING )
                            {
                            // InternalCurlBetterThanHttpie.g:449:7: (lv_proxyProtocol_5_0= RULE_BASIC_STRING )
                            // InternalCurlBetterThanHttpie.g:450:8: lv_proxyProtocol_5_0= RULE_BASIC_STRING
                            {
                            lv_proxyProtocol_5_0=(Token)match(input,RULE_BASIC_STRING,FOLLOW_9); 

                            								newLeafNode(lv_proxyProtocol_5_0, grammarAccess.getProxyFlagAccess().getProxyProtocolBASIC_STRINGTerminalRuleCall_2_0_1_0_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getProxyFlagRule());
                            								}
                            								setWithLastConsumed(
                            									current,
                            									"proxyProtocol",
                            									lv_proxyProtocol_5_0,
                            									"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.BASIC_STRING");
                            							

                            }


                            }

                            otherlv_6=(Token)match(input,24,FOLLOW_10); 

                            						newLeafNode(otherlv_6, grammarAccess.getProxyFlagAccess().getColonSolidusSolidusKeyword_2_0_1_1());
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:473:4: ( ( (lv_proxyProtocol_7_0= RULE_BASIC_STRING ) ) otherlv_8= '://' )
                    {
                    // InternalCurlBetterThanHttpie.g:473:4: ( ( (lv_proxyProtocol_7_0= RULE_BASIC_STRING ) ) otherlv_8= '://' )
                    // InternalCurlBetterThanHttpie.g:474:5: ( (lv_proxyProtocol_7_0= RULE_BASIC_STRING ) ) otherlv_8= '://'
                    {
                    // InternalCurlBetterThanHttpie.g:474:5: ( (lv_proxyProtocol_7_0= RULE_BASIC_STRING ) )
                    // InternalCurlBetterThanHttpie.g:475:6: (lv_proxyProtocol_7_0= RULE_BASIC_STRING )
                    {
                    // InternalCurlBetterThanHttpie.g:475:6: (lv_proxyProtocol_7_0= RULE_BASIC_STRING )
                    // InternalCurlBetterThanHttpie.g:476:7: lv_proxyProtocol_7_0= RULE_BASIC_STRING
                    {
                    lv_proxyProtocol_7_0=(Token)match(input,RULE_BASIC_STRING,FOLLOW_9); 

                    							newLeafNode(lv_proxyProtocol_7_0, grammarAccess.getProxyFlagAccess().getProxyProtocolBASIC_STRINGTerminalRuleCall_2_1_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getProxyFlagRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"proxyProtocol",
                    								lv_proxyProtocol_7_0,
                    								"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.BASIC_STRING");
                    						

                    }


                    }

                    otherlv_8=(Token)match(input,24,FOLLOW_10); 

                    					newLeafNode(otherlv_8, grammarAccess.getProxyFlagAccess().getColonSolidusSolidusKeyword_2_1_1());
                    				

                    }


                    }
                    break;

            }

            // InternalCurlBetterThanHttpie.g:498:3: ( ( (lv_username_9_0= RULE_STRING_UP ) ) otherlv_10= ':' ( (lv_password_11_0= RULE_STRING_UP ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING_UP) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:499:4: ( (lv_username_9_0= RULE_STRING_UP ) ) otherlv_10= ':' ( (lv_password_11_0= RULE_STRING_UP ) )
                    {
                    // InternalCurlBetterThanHttpie.g:499:4: ( (lv_username_9_0= RULE_STRING_UP ) )
                    // InternalCurlBetterThanHttpie.g:500:5: (lv_username_9_0= RULE_STRING_UP )
                    {
                    // InternalCurlBetterThanHttpie.g:500:5: (lv_username_9_0= RULE_STRING_UP )
                    // InternalCurlBetterThanHttpie.g:501:6: lv_username_9_0= RULE_STRING_UP
                    {
                    lv_username_9_0=(Token)match(input,RULE_STRING_UP,FOLLOW_7); 

                    						newLeafNode(lv_username_9_0, grammarAccess.getProxyFlagAccess().getUsernameSTRING_UPTerminalRuleCall_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProxyFlagRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"username",
                    							lv_username_9_0,
                    							"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.STRING_UP");
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,23,FOLLOW_11); 

                    				newLeafNode(otherlv_10, grammarAccess.getProxyFlagAccess().getColonKeyword_3_1());
                    			
                    // InternalCurlBetterThanHttpie.g:521:4: ( (lv_password_11_0= RULE_STRING_UP ) )
                    // InternalCurlBetterThanHttpie.g:522:5: (lv_password_11_0= RULE_STRING_UP )
                    {
                    // InternalCurlBetterThanHttpie.g:522:5: (lv_password_11_0= RULE_STRING_UP )
                    // InternalCurlBetterThanHttpie.g:523:6: lv_password_11_0= RULE_STRING_UP
                    {
                    lv_password_11_0=(Token)match(input,RULE_STRING_UP,FOLLOW_2); 

                    						newLeafNode(lv_password_11_0, grammarAccess.getProxyFlagAccess().getPasswordSTRING_UPTerminalRuleCall_3_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProxyFlagRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"password",
                    							lv_password_11_0,
                    							"aitchteeteepie.xtext.dsl.CurlBetterThanHttpie.STRING_UP");
                    					

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
    // InternalCurlBetterThanHttpie.g:544:1: entryRuleAuthFlag returns [EObject current=null] : iv_ruleAuthFlag= ruleAuthFlag EOF ;
    public final EObject entryRuleAuthFlag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAuthFlag = null;


        try {
            // InternalCurlBetterThanHttpie.g:544:49: (iv_ruleAuthFlag= ruleAuthFlag EOF )
            // InternalCurlBetterThanHttpie.g:545:2: iv_ruleAuthFlag= ruleAuthFlag EOF
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
    // InternalCurlBetterThanHttpie.g:551:1: ruleAuthFlag returns [EObject current=null] : (otherlv_0= '--auth' | otherlv_1= '-a' ) ;
    public final EObject ruleAuthFlag() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:557:2: ( (otherlv_0= '--auth' | otherlv_1= '-a' ) )
            // InternalCurlBetterThanHttpie.g:558:2: (otherlv_0= '--auth' | otherlv_1= '-a' )
            {
            // InternalCurlBetterThanHttpie.g:558:2: (otherlv_0= '--auth' | otherlv_1= '-a' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            else if ( (LA12_0==26) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:559:3: otherlv_0= '--auth'
                    {
                    otherlv_0=(Token)match(input,25,FOLLOW_2); 

                    			newLeafNode(otherlv_0, grammarAccess.getAuthFlagAccess().getAuthKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:564:3: otherlv_1= '-a'
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_2); 

                    			newLeafNode(otherlv_1, grammarAccess.getAuthFlagAccess().getAKeyword_1());
                    		

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
    // $ANTLR end "ruleAuthFlag"


    // $ANTLR start "entryRuleDownloadFlag"
    // InternalCurlBetterThanHttpie.g:572:1: entryRuleDownloadFlag returns [EObject current=null] : iv_ruleDownloadFlag= ruleDownloadFlag EOF ;
    public final EObject entryRuleDownloadFlag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDownloadFlag = null;


        try {
            // InternalCurlBetterThanHttpie.g:572:53: (iv_ruleDownloadFlag= ruleDownloadFlag EOF )
            // InternalCurlBetterThanHttpie.g:573:2: iv_ruleDownloadFlag= ruleDownloadFlag EOF
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
    // InternalCurlBetterThanHttpie.g:579:1: ruleDownloadFlag returns [EObject current=null] : ( () (otherlv_1= '--download' | otherlv_2= '-d' ) ) ;
    public final EObject ruleDownloadFlag() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:585:2: ( ( () (otherlv_1= '--download' | otherlv_2= '-d' ) ) )
            // InternalCurlBetterThanHttpie.g:586:2: ( () (otherlv_1= '--download' | otherlv_2= '-d' ) )
            {
            // InternalCurlBetterThanHttpie.g:586:2: ( () (otherlv_1= '--download' | otherlv_2= '-d' ) )
            // InternalCurlBetterThanHttpie.g:587:3: () (otherlv_1= '--download' | otherlv_2= '-d' )
            {
            // InternalCurlBetterThanHttpie.g:587:3: ()
            // InternalCurlBetterThanHttpie.g:588:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDownloadFlagAccess().getDownloadFlagAction_0(),
            					current);
            			

            }

            // InternalCurlBetterThanHttpie.g:594:3: (otherlv_1= '--download' | otherlv_2= '-d' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            else if ( (LA13_0==28) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:595:4: otherlv_1= '--download'
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getDownloadFlagAccess().getDownloadKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:600:4: otherlv_2= '-d'
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
    // InternalCurlBetterThanHttpie.g:609:1: entryRuleHelpFlag returns [EObject current=null] : iv_ruleHelpFlag= ruleHelpFlag EOF ;
    public final EObject entryRuleHelpFlag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHelpFlag = null;


        try {
            // InternalCurlBetterThanHttpie.g:609:49: (iv_ruleHelpFlag= ruleHelpFlag EOF )
            // InternalCurlBetterThanHttpie.g:610:2: iv_ruleHelpFlag= ruleHelpFlag EOF
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
    // InternalCurlBetterThanHttpie.g:616:1: ruleHelpFlag returns [EObject current=null] : ( () (otherlv_1= '--help' | otherlv_2= '-h' ) ) ;
    public final EObject ruleHelpFlag() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:622:2: ( ( () (otherlv_1= '--help' | otherlv_2= '-h' ) ) )
            // InternalCurlBetterThanHttpie.g:623:2: ( () (otherlv_1= '--help' | otherlv_2= '-h' ) )
            {
            // InternalCurlBetterThanHttpie.g:623:2: ( () (otherlv_1= '--help' | otherlv_2= '-h' ) )
            // InternalCurlBetterThanHttpie.g:624:3: () (otherlv_1= '--help' | otherlv_2= '-h' )
            {
            // InternalCurlBetterThanHttpie.g:624:3: ()
            // InternalCurlBetterThanHttpie.g:625:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHelpFlagAccess().getHelpFlagAction_0(),
            					current);
            			

            }

            // InternalCurlBetterThanHttpie.g:631:3: (otherlv_1= '--help' | otherlv_2= '-h' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            else if ( (LA14_0==30) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:632:4: otherlv_1= '--help'
                    {
                    otherlv_1=(Token)match(input,29,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getHelpFlagAccess().getHelpKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:637:4: otherlv_2= '-h'
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
    // InternalCurlBetterThanHttpie.g:646:1: entryRuleVersionFlag returns [EObject current=null] : iv_ruleVersionFlag= ruleVersionFlag EOF ;
    public final EObject entryRuleVersionFlag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersionFlag = null;


        try {
            // InternalCurlBetterThanHttpie.g:646:52: (iv_ruleVersionFlag= ruleVersionFlag EOF )
            // InternalCurlBetterThanHttpie.g:647:2: iv_ruleVersionFlag= ruleVersionFlag EOF
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
    // InternalCurlBetterThanHttpie.g:653:1: ruleVersionFlag returns [EObject current=null] : ( () otherlv_1= '--version' ) ;
    public final EObject ruleVersionFlag() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:659:2: ( ( () otherlv_1= '--version' ) )
            // InternalCurlBetterThanHttpie.g:660:2: ( () otherlv_1= '--version' )
            {
            // InternalCurlBetterThanHttpie.g:660:2: ( () otherlv_1= '--version' )
            // InternalCurlBetterThanHttpie.g:661:3: () otherlv_1= '--version'
            {
            // InternalCurlBetterThanHttpie.g:661:3: ()
            // InternalCurlBetterThanHttpie.g:662:4: 
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
    // InternalCurlBetterThanHttpie.g:676:1: entryRuleVerboseFlag returns [EObject current=null] : iv_ruleVerboseFlag= ruleVerboseFlag EOF ;
    public final EObject entryRuleVerboseFlag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerboseFlag = null;


        try {
            // InternalCurlBetterThanHttpie.g:676:52: (iv_ruleVerboseFlag= ruleVerboseFlag EOF )
            // InternalCurlBetterThanHttpie.g:677:2: iv_ruleVerboseFlag= ruleVerboseFlag EOF
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
    // InternalCurlBetterThanHttpie.g:683:1: ruleVerboseFlag returns [EObject current=null] : ( () (otherlv_1= '--verbose' | otherlv_2= '-v' ) ) ;
    public final EObject ruleVerboseFlag() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:689:2: ( ( () (otherlv_1= '--verbose' | otherlv_2= '-v' ) ) )
            // InternalCurlBetterThanHttpie.g:690:2: ( () (otherlv_1= '--verbose' | otherlv_2= '-v' ) )
            {
            // InternalCurlBetterThanHttpie.g:690:2: ( () (otherlv_1= '--verbose' | otherlv_2= '-v' ) )
            // InternalCurlBetterThanHttpie.g:691:3: () (otherlv_1= '--verbose' | otherlv_2= '-v' )
            {
            // InternalCurlBetterThanHttpie.g:691:3: ()
            // InternalCurlBetterThanHttpie.g:692:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVerboseFlagAccess().getVerboseFlagAction_0(),
            					current);
            			

            }

            // InternalCurlBetterThanHttpie.g:698:3: (otherlv_1= '--verbose' | otherlv_2= '-v' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==32) ) {
                alt15=1;
            }
            else if ( (LA15_0==33) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:699:4: otherlv_1= '--verbose'
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getVerboseFlagAccess().getVerboseKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:704:4: otherlv_2= '-v'
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
    // InternalCurlBetterThanHttpie.g:713:1: entryRuleTimeoutFlag returns [EObject current=null] : iv_ruleTimeoutFlag= ruleTimeoutFlag EOF ;
    public final EObject entryRuleTimeoutFlag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeoutFlag = null;


        try {
            // InternalCurlBetterThanHttpie.g:713:52: (iv_ruleTimeoutFlag= ruleTimeoutFlag EOF )
            // InternalCurlBetterThanHttpie.g:714:2: iv_ruleTimeoutFlag= ruleTimeoutFlag EOF
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
    // InternalCurlBetterThanHttpie.g:720:1: ruleTimeoutFlag returns [EObject current=null] : otherlv_0= '--timeout' ;
    public final EObject ruleTimeoutFlag() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalCurlBetterThanHttpie.g:726:2: (otherlv_0= '--timeout' )
            // InternalCurlBetterThanHttpie.g:727:2: otherlv_0= '--timeout'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_2); 

            		newLeafNode(otherlv_0, grammarAccess.getTimeoutFlagAccess().getTimeoutKeyword());
            	

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000007FE3FE000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000040L});

}