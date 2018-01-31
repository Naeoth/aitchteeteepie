package aitchteeteepie.xtext.dsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import aitchteeteepie.xtext.dsl.services.CurlBetterThanHttpieGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCurlBetterThanHttpieParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_HTTP", "RULE_WS", "RULE_NULL", "RULE_URL", "RULE_INT", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_NUMBER", "RULE_SEP2", "RULE_DIGIT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'--header'", "'-t'", "'--body'", "'-b'", "'--json'", "'-j'", "'--form'", "'-f'", "'='", "'--auth'", "'-a'", "':'", "'--download'", "'-d'", "'--help'", "'-h'", "'--verbose'", "'-v'", "'GET'", "'POST'", "'PUT'", "'DELETE'", "'://'", "'/'", "'--'", "'--proxy'", "'@'", "'--version'", "'--timeout'", "'=='", "':='", "'\\''", "'{'", "'}'", "','", "'['", "']'"
    };
    public static final int T__50=50;
    public static final int RULE_BOOLEAN=11;
    public static final int T__19=19;
    public static final int T__55=55;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=4;
    public static final int RULE_DIGIT=14;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=9;
    public static final int T__29=29;
    public static final int RULE_URL=8;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=16;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_SEP2=13;
    public static final int RULE_STRING=15;
    public static final int RULE_NULL=7;
    public static final int RULE_HTTP=5;
    public static final int RULE_SL_COMMENT=17;
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
    public static final int RULE_WS=6;
    public static final int RULE_ANY_OTHER=18;
    public static final int RULE_NUMBER=12;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_FLOAT=10;
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

    	public void setGrammarAccess(CurlBetterThanHttpieGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleCommandLineInterface"
    // InternalCurlBetterThanHttpie.g:53:1: entryRuleCommandLineInterface : ruleCommandLineInterface EOF ;
    public final void entryRuleCommandLineInterface() throws RecognitionException {
        try {
            // InternalCurlBetterThanHttpie.g:54:1: ( ruleCommandLineInterface EOF )
            // InternalCurlBetterThanHttpie.g:55:1: ruleCommandLineInterface EOF
            {
             before(grammarAccess.getCommandLineInterfaceRule()); 
            pushFollow(FOLLOW_1);
            ruleCommandLineInterface();

            state._fsp--;

             after(grammarAccess.getCommandLineInterfaceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCommandLineInterface"


    // $ANTLR start "ruleCommandLineInterface"
    // InternalCurlBetterThanHttpie.g:62:1: ruleCommandLineInterface : ( ( rule__CommandLineInterface__Group__0 ) ) ;
    public final void ruleCommandLineInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:66:2: ( ( ( rule__CommandLineInterface__Group__0 ) ) )
            // InternalCurlBetterThanHttpie.g:67:2: ( ( rule__CommandLineInterface__Group__0 ) )
            {
            // InternalCurlBetterThanHttpie.g:67:2: ( ( rule__CommandLineInterface__Group__0 ) )
            // InternalCurlBetterThanHttpie.g:68:3: ( rule__CommandLineInterface__Group__0 )
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getGroup()); 
            // InternalCurlBetterThanHttpie.g:69:3: ( rule__CommandLineInterface__Group__0 )
            // InternalCurlBetterThanHttpie.g:69:4: rule__CommandLineInterface__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CommandLineInterface__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCommandLineInterfaceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommandLineInterface"


    // $ANTLR start "entryRuleFlag"
    // InternalCurlBetterThanHttpie.g:78:1: entryRuleFlag : ruleFlag EOF ;
    public final void entryRuleFlag() throws RecognitionException {
        try {
            // InternalCurlBetterThanHttpie.g:79:1: ( ruleFlag EOF )
            // InternalCurlBetterThanHttpie.g:80:1: ruleFlag EOF
            {
             before(grammarAccess.getFlagRule()); 
            pushFollow(FOLLOW_1);
            ruleFlag();

            state._fsp--;

             after(grammarAccess.getFlagRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFlag"


    // $ANTLR start "ruleFlag"
    // InternalCurlBetterThanHttpie.g:87:1: ruleFlag : ( ( rule__Flag__Alternatives ) ) ;
    public final void ruleFlag() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:91:2: ( ( ( rule__Flag__Alternatives ) ) )
            // InternalCurlBetterThanHttpie.g:92:2: ( ( rule__Flag__Alternatives ) )
            {
            // InternalCurlBetterThanHttpie.g:92:2: ( ( rule__Flag__Alternatives ) )
            // InternalCurlBetterThanHttpie.g:93:3: ( rule__Flag__Alternatives )
            {
             before(grammarAccess.getFlagAccess().getAlternatives()); 
            // InternalCurlBetterThanHttpie.g:94:3: ( rule__Flag__Alternatives )
            // InternalCurlBetterThanHttpie.g:94:4: rule__Flag__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Flag__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFlagAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFlag"


    // $ANTLR start "entryRuleHeadersFlag"
    // InternalCurlBetterThanHttpie.g:103:1: entryRuleHeadersFlag : ruleHeadersFlag EOF ;
    public final void entryRuleHeadersFlag() throws RecognitionException {
        try {
            // InternalCurlBetterThanHttpie.g:104:1: ( ruleHeadersFlag EOF )
            // InternalCurlBetterThanHttpie.g:105:1: ruleHeadersFlag EOF
            {
             before(grammarAccess.getHeadersFlagRule()); 
            pushFollow(FOLLOW_1);
            ruleHeadersFlag();

            state._fsp--;

             after(grammarAccess.getHeadersFlagRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHeadersFlag"


    // $ANTLR start "ruleHeadersFlag"
    // InternalCurlBetterThanHttpie.g:112:1: ruleHeadersFlag : ( ( rule__HeadersFlag__Group__0 ) ) ;
    public final void ruleHeadersFlag() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:116:2: ( ( ( rule__HeadersFlag__Group__0 ) ) )
            // InternalCurlBetterThanHttpie.g:117:2: ( ( rule__HeadersFlag__Group__0 ) )
            {
            // InternalCurlBetterThanHttpie.g:117:2: ( ( rule__HeadersFlag__Group__0 ) )
            // InternalCurlBetterThanHttpie.g:118:3: ( rule__HeadersFlag__Group__0 )
            {
             before(grammarAccess.getHeadersFlagAccess().getGroup()); 
            // InternalCurlBetterThanHttpie.g:119:3: ( rule__HeadersFlag__Group__0 )
            // InternalCurlBetterThanHttpie.g:119:4: rule__HeadersFlag__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HeadersFlag__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHeadersFlagAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHeadersFlag"


    // $ANTLR start "entryRuleBodyFlag"
    // InternalCurlBetterThanHttpie.g:128:1: entryRuleBodyFlag : ruleBodyFlag EOF ;
    public final void entryRuleBodyFlag() throws RecognitionException {
        try {
            // InternalCurlBetterThanHttpie.g:129:1: ( ruleBodyFlag EOF )
            // InternalCurlBetterThanHttpie.g:130:1: ruleBodyFlag EOF
            {
             before(grammarAccess.getBodyFlagRule()); 
            pushFollow(FOLLOW_1);
            ruleBodyFlag();

            state._fsp--;

             after(grammarAccess.getBodyFlagRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBodyFlag"


    // $ANTLR start "ruleBodyFlag"
    // InternalCurlBetterThanHttpie.g:137:1: ruleBodyFlag : ( ( rule__BodyFlag__Group__0 ) ) ;
    public final void ruleBodyFlag() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:141:2: ( ( ( rule__BodyFlag__Group__0 ) ) )
            // InternalCurlBetterThanHttpie.g:142:2: ( ( rule__BodyFlag__Group__0 ) )
            {
            // InternalCurlBetterThanHttpie.g:142:2: ( ( rule__BodyFlag__Group__0 ) )
            // InternalCurlBetterThanHttpie.g:143:3: ( rule__BodyFlag__Group__0 )
            {
             before(grammarAccess.getBodyFlagAccess().getGroup()); 
            // InternalCurlBetterThanHttpie.g:144:3: ( rule__BodyFlag__Group__0 )
            // InternalCurlBetterThanHttpie.g:144:4: rule__BodyFlag__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BodyFlag__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBodyFlagAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBodyFlag"


    // $ANTLR start "entryRuleJsonFlag"
    // InternalCurlBetterThanHttpie.g:153:1: entryRuleJsonFlag : ruleJsonFlag EOF ;
    public final void entryRuleJsonFlag() throws RecognitionException {
        try {
            // InternalCurlBetterThanHttpie.g:154:1: ( ruleJsonFlag EOF )
            // InternalCurlBetterThanHttpie.g:155:1: ruleJsonFlag EOF
            {
             before(grammarAccess.getJsonFlagRule()); 
            pushFollow(FOLLOW_1);
            ruleJsonFlag();

            state._fsp--;

             after(grammarAccess.getJsonFlagRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJsonFlag"


    // $ANTLR start "ruleJsonFlag"
    // InternalCurlBetterThanHttpie.g:162:1: ruleJsonFlag : ( ( rule__JsonFlag__Group__0 ) ) ;
    public final void ruleJsonFlag() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:166:2: ( ( ( rule__JsonFlag__Group__0 ) ) )
            // InternalCurlBetterThanHttpie.g:167:2: ( ( rule__JsonFlag__Group__0 ) )
            {
            // InternalCurlBetterThanHttpie.g:167:2: ( ( rule__JsonFlag__Group__0 ) )
            // InternalCurlBetterThanHttpie.g:168:3: ( rule__JsonFlag__Group__0 )
            {
             before(grammarAccess.getJsonFlagAccess().getGroup()); 
            // InternalCurlBetterThanHttpie.g:169:3: ( rule__JsonFlag__Group__0 )
            // InternalCurlBetterThanHttpie.g:169:4: rule__JsonFlag__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__JsonFlag__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJsonFlagAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJsonFlag"


    // $ANTLR start "entryRuleFormFlag"
    // InternalCurlBetterThanHttpie.g:178:1: entryRuleFormFlag : ruleFormFlag EOF ;
    public final void entryRuleFormFlag() throws RecognitionException {
        try {
            // InternalCurlBetterThanHttpie.g:179:1: ( ruleFormFlag EOF )
            // InternalCurlBetterThanHttpie.g:180:1: ruleFormFlag EOF
            {
             before(grammarAccess.getFormFlagRule()); 
            pushFollow(FOLLOW_1);
            ruleFormFlag();

            state._fsp--;

             after(grammarAccess.getFormFlagRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFormFlag"


    // $ANTLR start "ruleFormFlag"
    // InternalCurlBetterThanHttpie.g:187:1: ruleFormFlag : ( ( rule__FormFlag__Group__0 ) ) ;
    public final void ruleFormFlag() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:191:2: ( ( ( rule__FormFlag__Group__0 ) ) )
            // InternalCurlBetterThanHttpie.g:192:2: ( ( rule__FormFlag__Group__0 ) )
            {
            // InternalCurlBetterThanHttpie.g:192:2: ( ( rule__FormFlag__Group__0 ) )
            // InternalCurlBetterThanHttpie.g:193:3: ( rule__FormFlag__Group__0 )
            {
             before(grammarAccess.getFormFlagAccess().getGroup()); 
            // InternalCurlBetterThanHttpie.g:194:3: ( rule__FormFlag__Group__0 )
            // InternalCurlBetterThanHttpie.g:194:4: rule__FormFlag__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FormFlag__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFormFlagAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFormFlag"


    // $ANTLR start "entryRuleProxyFlag"
    // InternalCurlBetterThanHttpie.g:203:1: entryRuleProxyFlag : ruleProxyFlag EOF ;
    public final void entryRuleProxyFlag() throws RecognitionException {
        try {
            // InternalCurlBetterThanHttpie.g:204:1: ( ruleProxyFlag EOF )
            // InternalCurlBetterThanHttpie.g:205:1: ruleProxyFlag EOF
            {
             before(grammarAccess.getProxyFlagRule()); 
            pushFollow(FOLLOW_1);
            ruleProxyFlag();

            state._fsp--;

             after(grammarAccess.getProxyFlagRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProxyFlag"


    // $ANTLR start "ruleProxyFlag"
    // InternalCurlBetterThanHttpie.g:212:1: ruleProxyFlag : ( ( rule__ProxyFlag__Group__0 ) ) ;
    public final void ruleProxyFlag() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:216:2: ( ( ( rule__ProxyFlag__Group__0 ) ) )
            // InternalCurlBetterThanHttpie.g:217:2: ( ( rule__ProxyFlag__Group__0 ) )
            {
            // InternalCurlBetterThanHttpie.g:217:2: ( ( rule__ProxyFlag__Group__0 ) )
            // InternalCurlBetterThanHttpie.g:218:3: ( rule__ProxyFlag__Group__0 )
            {
             before(grammarAccess.getProxyFlagAccess().getGroup()); 
            // InternalCurlBetterThanHttpie.g:219:3: ( rule__ProxyFlag__Group__0 )
            // InternalCurlBetterThanHttpie.g:219:4: rule__ProxyFlag__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProxyFlag__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProxyFlagAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProxyFlag"


    // $ANTLR start "entryRuleAuthFlag"
    // InternalCurlBetterThanHttpie.g:228:1: entryRuleAuthFlag : ruleAuthFlag EOF ;
    public final void entryRuleAuthFlag() throws RecognitionException {
        try {
            // InternalCurlBetterThanHttpie.g:229:1: ( ruleAuthFlag EOF )
            // InternalCurlBetterThanHttpie.g:230:1: ruleAuthFlag EOF
            {
             before(grammarAccess.getAuthFlagRule()); 
            pushFollow(FOLLOW_1);
            ruleAuthFlag();

            state._fsp--;

             after(grammarAccess.getAuthFlagRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAuthFlag"


    // $ANTLR start "ruleAuthFlag"
    // InternalCurlBetterThanHttpie.g:237:1: ruleAuthFlag : ( ( rule__AuthFlag__Group__0 ) ) ;
    public final void ruleAuthFlag() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:241:2: ( ( ( rule__AuthFlag__Group__0 ) ) )
            // InternalCurlBetterThanHttpie.g:242:2: ( ( rule__AuthFlag__Group__0 ) )
            {
            // InternalCurlBetterThanHttpie.g:242:2: ( ( rule__AuthFlag__Group__0 ) )
            // InternalCurlBetterThanHttpie.g:243:3: ( rule__AuthFlag__Group__0 )
            {
             before(grammarAccess.getAuthFlagAccess().getGroup()); 
            // InternalCurlBetterThanHttpie.g:244:3: ( rule__AuthFlag__Group__0 )
            // InternalCurlBetterThanHttpie.g:244:4: rule__AuthFlag__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AuthFlag__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAuthFlagAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAuthFlag"


    // $ANTLR start "entryRuleDownloadFlag"
    // InternalCurlBetterThanHttpie.g:253:1: entryRuleDownloadFlag : ruleDownloadFlag EOF ;
    public final void entryRuleDownloadFlag() throws RecognitionException {
        try {
            // InternalCurlBetterThanHttpie.g:254:1: ( ruleDownloadFlag EOF )
            // InternalCurlBetterThanHttpie.g:255:1: ruleDownloadFlag EOF
            {
             before(grammarAccess.getDownloadFlagRule()); 
            pushFollow(FOLLOW_1);
            ruleDownloadFlag();

            state._fsp--;

             after(grammarAccess.getDownloadFlagRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDownloadFlag"


    // $ANTLR start "ruleDownloadFlag"
    // InternalCurlBetterThanHttpie.g:262:1: ruleDownloadFlag : ( ( rule__DownloadFlag__Group__0 ) ) ;
    public final void ruleDownloadFlag() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:266:2: ( ( ( rule__DownloadFlag__Group__0 ) ) )
            // InternalCurlBetterThanHttpie.g:267:2: ( ( rule__DownloadFlag__Group__0 ) )
            {
            // InternalCurlBetterThanHttpie.g:267:2: ( ( rule__DownloadFlag__Group__0 ) )
            // InternalCurlBetterThanHttpie.g:268:3: ( rule__DownloadFlag__Group__0 )
            {
             before(grammarAccess.getDownloadFlagAccess().getGroup()); 
            // InternalCurlBetterThanHttpie.g:269:3: ( rule__DownloadFlag__Group__0 )
            // InternalCurlBetterThanHttpie.g:269:4: rule__DownloadFlag__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DownloadFlag__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDownloadFlagAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDownloadFlag"


    // $ANTLR start "entryRuleHelpFlag"
    // InternalCurlBetterThanHttpie.g:278:1: entryRuleHelpFlag : ruleHelpFlag EOF ;
    public final void entryRuleHelpFlag() throws RecognitionException {
        try {
            // InternalCurlBetterThanHttpie.g:279:1: ( ruleHelpFlag EOF )
            // InternalCurlBetterThanHttpie.g:280:1: ruleHelpFlag EOF
            {
             before(grammarAccess.getHelpFlagRule()); 
            pushFollow(FOLLOW_1);
            ruleHelpFlag();

            state._fsp--;

             after(grammarAccess.getHelpFlagRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHelpFlag"


    // $ANTLR start "ruleHelpFlag"
    // InternalCurlBetterThanHttpie.g:287:1: ruleHelpFlag : ( ( rule__HelpFlag__Group__0 ) ) ;
    public final void ruleHelpFlag() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:291:2: ( ( ( rule__HelpFlag__Group__0 ) ) )
            // InternalCurlBetterThanHttpie.g:292:2: ( ( rule__HelpFlag__Group__0 ) )
            {
            // InternalCurlBetterThanHttpie.g:292:2: ( ( rule__HelpFlag__Group__0 ) )
            // InternalCurlBetterThanHttpie.g:293:3: ( rule__HelpFlag__Group__0 )
            {
             before(grammarAccess.getHelpFlagAccess().getGroup()); 
            // InternalCurlBetterThanHttpie.g:294:3: ( rule__HelpFlag__Group__0 )
            // InternalCurlBetterThanHttpie.g:294:4: rule__HelpFlag__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HelpFlag__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHelpFlagAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHelpFlag"


    // $ANTLR start "entryRuleVersionFlag"
    // InternalCurlBetterThanHttpie.g:303:1: entryRuleVersionFlag : ruleVersionFlag EOF ;
    public final void entryRuleVersionFlag() throws RecognitionException {
        try {
            // InternalCurlBetterThanHttpie.g:304:1: ( ruleVersionFlag EOF )
            // InternalCurlBetterThanHttpie.g:305:1: ruleVersionFlag EOF
            {
             before(grammarAccess.getVersionFlagRule()); 
            pushFollow(FOLLOW_1);
            ruleVersionFlag();

            state._fsp--;

             after(grammarAccess.getVersionFlagRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVersionFlag"


    // $ANTLR start "ruleVersionFlag"
    // InternalCurlBetterThanHttpie.g:312:1: ruleVersionFlag : ( ( rule__VersionFlag__Group__0 ) ) ;
    public final void ruleVersionFlag() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:316:2: ( ( ( rule__VersionFlag__Group__0 ) ) )
            // InternalCurlBetterThanHttpie.g:317:2: ( ( rule__VersionFlag__Group__0 ) )
            {
            // InternalCurlBetterThanHttpie.g:317:2: ( ( rule__VersionFlag__Group__0 ) )
            // InternalCurlBetterThanHttpie.g:318:3: ( rule__VersionFlag__Group__0 )
            {
             before(grammarAccess.getVersionFlagAccess().getGroup()); 
            // InternalCurlBetterThanHttpie.g:319:3: ( rule__VersionFlag__Group__0 )
            // InternalCurlBetterThanHttpie.g:319:4: rule__VersionFlag__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VersionFlag__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVersionFlagAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVersionFlag"


    // $ANTLR start "entryRuleVerboseFlag"
    // InternalCurlBetterThanHttpie.g:328:1: entryRuleVerboseFlag : ruleVerboseFlag EOF ;
    public final void entryRuleVerboseFlag() throws RecognitionException {
        try {
            // InternalCurlBetterThanHttpie.g:329:1: ( ruleVerboseFlag EOF )
            // InternalCurlBetterThanHttpie.g:330:1: ruleVerboseFlag EOF
            {
             before(grammarAccess.getVerboseFlagRule()); 
            pushFollow(FOLLOW_1);
            ruleVerboseFlag();

            state._fsp--;

             after(grammarAccess.getVerboseFlagRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVerboseFlag"


    // $ANTLR start "ruleVerboseFlag"
    // InternalCurlBetterThanHttpie.g:337:1: ruleVerboseFlag : ( ( rule__VerboseFlag__Group__0 ) ) ;
    public final void ruleVerboseFlag() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:341:2: ( ( ( rule__VerboseFlag__Group__0 ) ) )
            // InternalCurlBetterThanHttpie.g:342:2: ( ( rule__VerboseFlag__Group__0 ) )
            {
            // InternalCurlBetterThanHttpie.g:342:2: ( ( rule__VerboseFlag__Group__0 ) )
            // InternalCurlBetterThanHttpie.g:343:3: ( rule__VerboseFlag__Group__0 )
            {
             before(grammarAccess.getVerboseFlagAccess().getGroup()); 
            // InternalCurlBetterThanHttpie.g:344:3: ( rule__VerboseFlag__Group__0 )
            // InternalCurlBetterThanHttpie.g:344:4: rule__VerboseFlag__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VerboseFlag__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVerboseFlagAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVerboseFlag"


    // $ANTLR start "entryRuleTimeoutFlag"
    // InternalCurlBetterThanHttpie.g:353:1: entryRuleTimeoutFlag : ruleTimeoutFlag EOF ;
    public final void entryRuleTimeoutFlag() throws RecognitionException {
        try {
            // InternalCurlBetterThanHttpie.g:354:1: ( ruleTimeoutFlag EOF )
            // InternalCurlBetterThanHttpie.g:355:1: ruleTimeoutFlag EOF
            {
             before(grammarAccess.getTimeoutFlagRule()); 
            pushFollow(FOLLOW_1);
            ruleTimeoutFlag();

            state._fsp--;

             after(grammarAccess.getTimeoutFlagRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTimeoutFlag"


    // $ANTLR start "ruleTimeoutFlag"
    // InternalCurlBetterThanHttpie.g:362:1: ruleTimeoutFlag : ( ( rule__TimeoutFlag__Group__0 ) ) ;
    public final void ruleTimeoutFlag() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:366:2: ( ( ( rule__TimeoutFlag__Group__0 ) ) )
            // InternalCurlBetterThanHttpie.g:367:2: ( ( rule__TimeoutFlag__Group__0 ) )
            {
            // InternalCurlBetterThanHttpie.g:367:2: ( ( rule__TimeoutFlag__Group__0 ) )
            // InternalCurlBetterThanHttpie.g:368:3: ( rule__TimeoutFlag__Group__0 )
            {
             before(grammarAccess.getTimeoutFlagAccess().getGroup()); 
            // InternalCurlBetterThanHttpie.g:369:3: ( rule__TimeoutFlag__Group__0 )
            // InternalCurlBetterThanHttpie.g:369:4: rule__TimeoutFlag__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TimeoutFlag__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTimeoutFlagAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTimeoutFlag"


    // $ANTLR start "entryRuleItem"
    // InternalCurlBetterThanHttpie.g:378:1: entryRuleItem : ruleItem EOF ;
    public final void entryRuleItem() throws RecognitionException {
        try {
            // InternalCurlBetterThanHttpie.g:379:1: ( ruleItem EOF )
            // InternalCurlBetterThanHttpie.g:380:1: ruleItem EOF
            {
             before(grammarAccess.getItemRule()); 
            pushFollow(FOLLOW_1);
            ruleItem();

            state._fsp--;

             after(grammarAccess.getItemRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleItem"


    // $ANTLR start "ruleItem"
    // InternalCurlBetterThanHttpie.g:387:1: ruleItem : ( ( rule__Item__Alternatives ) ) ;
    public final void ruleItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:391:2: ( ( ( rule__Item__Alternatives ) ) )
            // InternalCurlBetterThanHttpie.g:392:2: ( ( rule__Item__Alternatives ) )
            {
            // InternalCurlBetterThanHttpie.g:392:2: ( ( rule__Item__Alternatives ) )
            // InternalCurlBetterThanHttpie.g:393:3: ( rule__Item__Alternatives )
            {
             before(grammarAccess.getItemAccess().getAlternatives()); 
            // InternalCurlBetterThanHttpie.g:394:3: ( rule__Item__Alternatives )
            // InternalCurlBetterThanHttpie.g:394:4: rule__Item__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Item__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getItemAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleItem"


    // $ANTLR start "entryRuleHttpHeaderItem"
    // InternalCurlBetterThanHttpie.g:403:1: entryRuleHttpHeaderItem : ruleHttpHeaderItem EOF ;
    public final void entryRuleHttpHeaderItem() throws RecognitionException {
        try {
            // InternalCurlBetterThanHttpie.g:404:1: ( ruleHttpHeaderItem EOF )
            // InternalCurlBetterThanHttpie.g:405:1: ruleHttpHeaderItem EOF
            {
             before(grammarAccess.getHttpHeaderItemRule()); 
            pushFollow(FOLLOW_1);
            ruleHttpHeaderItem();

            state._fsp--;

             after(grammarAccess.getHttpHeaderItemRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHttpHeaderItem"


    // $ANTLR start "ruleHttpHeaderItem"
    // InternalCurlBetterThanHttpie.g:412:1: ruleHttpHeaderItem : ( ( rule__HttpHeaderItem__Group__0 ) ) ;
    public final void ruleHttpHeaderItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:416:2: ( ( ( rule__HttpHeaderItem__Group__0 ) ) )
            // InternalCurlBetterThanHttpie.g:417:2: ( ( rule__HttpHeaderItem__Group__0 ) )
            {
            // InternalCurlBetterThanHttpie.g:417:2: ( ( rule__HttpHeaderItem__Group__0 ) )
            // InternalCurlBetterThanHttpie.g:418:3: ( rule__HttpHeaderItem__Group__0 )
            {
             before(grammarAccess.getHttpHeaderItemAccess().getGroup()); 
            // InternalCurlBetterThanHttpie.g:419:3: ( rule__HttpHeaderItem__Group__0 )
            // InternalCurlBetterThanHttpie.g:419:4: rule__HttpHeaderItem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HttpHeaderItem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHttpHeaderItemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHttpHeaderItem"


    // $ANTLR start "entryRuleFormFileFieldItem"
    // InternalCurlBetterThanHttpie.g:428:1: entryRuleFormFileFieldItem : ruleFormFileFieldItem EOF ;
    public final void entryRuleFormFileFieldItem() throws RecognitionException {
        try {
            // InternalCurlBetterThanHttpie.g:429:1: ( ruleFormFileFieldItem EOF )
            // InternalCurlBetterThanHttpie.g:430:1: ruleFormFileFieldItem EOF
            {
             before(grammarAccess.getFormFileFieldItemRule()); 
            pushFollow(FOLLOW_1);
            ruleFormFileFieldItem();

            state._fsp--;

             after(grammarAccess.getFormFileFieldItemRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFormFileFieldItem"


    // $ANTLR start "ruleFormFileFieldItem"
    // InternalCurlBetterThanHttpie.g:437:1: ruleFormFileFieldItem : ( ( rule__FormFileFieldItem__Group__0 ) ) ;
    public final void ruleFormFileFieldItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:441:2: ( ( ( rule__FormFileFieldItem__Group__0 ) ) )
            // InternalCurlBetterThanHttpie.g:442:2: ( ( rule__FormFileFieldItem__Group__0 ) )
            {
            // InternalCurlBetterThanHttpie.g:442:2: ( ( rule__FormFileFieldItem__Group__0 ) )
            // InternalCurlBetterThanHttpie.g:443:3: ( rule__FormFileFieldItem__Group__0 )
            {
             before(grammarAccess.getFormFileFieldItemAccess().getGroup()); 
            // InternalCurlBetterThanHttpie.g:444:3: ( rule__FormFileFieldItem__Group__0 )
            // InternalCurlBetterThanHttpie.g:444:4: rule__FormFileFieldItem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FormFileFieldItem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFormFileFieldItemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFormFileFieldItem"


    // $ANTLR start "entryRuleDataFieldItem"
    // InternalCurlBetterThanHttpie.g:453:1: entryRuleDataFieldItem : ruleDataFieldItem EOF ;
    public final void entryRuleDataFieldItem() throws RecognitionException {
        try {
            // InternalCurlBetterThanHttpie.g:454:1: ( ruleDataFieldItem EOF )
            // InternalCurlBetterThanHttpie.g:455:1: ruleDataFieldItem EOF
            {
             before(grammarAccess.getDataFieldItemRule()); 
            pushFollow(FOLLOW_1);
            ruleDataFieldItem();

            state._fsp--;

             after(grammarAccess.getDataFieldItemRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDataFieldItem"


    // $ANTLR start "ruleDataFieldItem"
    // InternalCurlBetterThanHttpie.g:462:1: ruleDataFieldItem : ( ( rule__DataFieldItem__Group__0 ) ) ;
    public final void ruleDataFieldItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:466:2: ( ( ( rule__DataFieldItem__Group__0 ) ) )
            // InternalCurlBetterThanHttpie.g:467:2: ( ( rule__DataFieldItem__Group__0 ) )
            {
            // InternalCurlBetterThanHttpie.g:467:2: ( ( rule__DataFieldItem__Group__0 ) )
            // InternalCurlBetterThanHttpie.g:468:3: ( rule__DataFieldItem__Group__0 )
            {
             before(grammarAccess.getDataFieldItemAccess().getGroup()); 
            // InternalCurlBetterThanHttpie.g:469:3: ( rule__DataFieldItem__Group__0 )
            // InternalCurlBetterThanHttpie.g:469:4: rule__DataFieldItem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataFieldItem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataFieldItemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataFieldItem"


    // $ANTLR start "entryRuleUrlParameterItem"
    // InternalCurlBetterThanHttpie.g:478:1: entryRuleUrlParameterItem : ruleUrlParameterItem EOF ;
    public final void entryRuleUrlParameterItem() throws RecognitionException {
        try {
            // InternalCurlBetterThanHttpie.g:479:1: ( ruleUrlParameterItem EOF )
            // InternalCurlBetterThanHttpie.g:480:1: ruleUrlParameterItem EOF
            {
             before(grammarAccess.getUrlParameterItemRule()); 
            pushFollow(FOLLOW_1);
            ruleUrlParameterItem();

            state._fsp--;

             after(grammarAccess.getUrlParameterItemRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUrlParameterItem"


    // $ANTLR start "ruleUrlParameterItem"
    // InternalCurlBetterThanHttpie.g:487:1: ruleUrlParameterItem : ( ( rule__UrlParameterItem__Group__0 ) ) ;
    public final void ruleUrlParameterItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:491:2: ( ( ( rule__UrlParameterItem__Group__0 ) ) )
            // InternalCurlBetterThanHttpie.g:492:2: ( ( rule__UrlParameterItem__Group__0 ) )
            {
            // InternalCurlBetterThanHttpie.g:492:2: ( ( rule__UrlParameterItem__Group__0 ) )
            // InternalCurlBetterThanHttpie.g:493:3: ( rule__UrlParameterItem__Group__0 )
            {
             before(grammarAccess.getUrlParameterItemAccess().getGroup()); 
            // InternalCurlBetterThanHttpie.g:494:3: ( rule__UrlParameterItem__Group__0 )
            // InternalCurlBetterThanHttpie.g:494:4: rule__UrlParameterItem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UrlParameterItem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUrlParameterItemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUrlParameterItem"


    // $ANTLR start "entryRuleRawJsonFieldItem"
    // InternalCurlBetterThanHttpie.g:503:1: entryRuleRawJsonFieldItem : ruleRawJsonFieldItem EOF ;
    public final void entryRuleRawJsonFieldItem() throws RecognitionException {
        try {
            // InternalCurlBetterThanHttpie.g:504:1: ( ruleRawJsonFieldItem EOF )
            // InternalCurlBetterThanHttpie.g:505:1: ruleRawJsonFieldItem EOF
            {
             before(grammarAccess.getRawJsonFieldItemRule()); 
            pushFollow(FOLLOW_1);
            ruleRawJsonFieldItem();

            state._fsp--;

             after(grammarAccess.getRawJsonFieldItemRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRawJsonFieldItem"


    // $ANTLR start "ruleRawJsonFieldItem"
    // InternalCurlBetterThanHttpie.g:512:1: ruleRawJsonFieldItem : ( ( rule__RawJsonFieldItem__Group__0 ) ) ;
    public final void ruleRawJsonFieldItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:516:2: ( ( ( rule__RawJsonFieldItem__Group__0 ) ) )
            // InternalCurlBetterThanHttpie.g:517:2: ( ( rule__RawJsonFieldItem__Group__0 ) )
            {
            // InternalCurlBetterThanHttpie.g:517:2: ( ( rule__RawJsonFieldItem__Group__0 ) )
            // InternalCurlBetterThanHttpie.g:518:3: ( rule__RawJsonFieldItem__Group__0 )
            {
             before(grammarAccess.getRawJsonFieldItemAccess().getGroup()); 
            // InternalCurlBetterThanHttpie.g:519:3: ( rule__RawJsonFieldItem__Group__0 )
            // InternalCurlBetterThanHttpie.g:519:4: rule__RawJsonFieldItem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RawJsonFieldItem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRawJsonFieldItemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRawJsonFieldItem"


    // $ANTLR start "entryRuleMember"
    // InternalCurlBetterThanHttpie.g:528:1: entryRuleMember : ruleMember EOF ;
    public final void entryRuleMember() throws RecognitionException {
        try {
            // InternalCurlBetterThanHttpie.g:529:1: ( ruleMember EOF )
            // InternalCurlBetterThanHttpie.g:530:1: ruleMember EOF
            {
             before(grammarAccess.getMemberRule()); 
            pushFollow(FOLLOW_1);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getMemberRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMember"


    // $ANTLR start "ruleMember"
    // InternalCurlBetterThanHttpie.g:537:1: ruleMember : ( ( rule__Member__Group__0 ) ) ;
    public final void ruleMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:541:2: ( ( ( rule__Member__Group__0 ) ) )
            // InternalCurlBetterThanHttpie.g:542:2: ( ( rule__Member__Group__0 ) )
            {
            // InternalCurlBetterThanHttpie.g:542:2: ( ( rule__Member__Group__0 ) )
            // InternalCurlBetterThanHttpie.g:543:3: ( rule__Member__Group__0 )
            {
             before(grammarAccess.getMemberAccess().getGroup()); 
            // InternalCurlBetterThanHttpie.g:544:3: ( rule__Member__Group__0 )
            // InternalCurlBetterThanHttpie.g:544:4: rule__Member__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Member__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMemberAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMember"


    // $ANTLR start "entryRuleJsonType"
    // InternalCurlBetterThanHttpie.g:553:1: entryRuleJsonType : ruleJsonType EOF ;
    public final void entryRuleJsonType() throws RecognitionException {
        try {
            // InternalCurlBetterThanHttpie.g:554:1: ( ruleJsonType EOF )
            // InternalCurlBetterThanHttpie.g:555:1: ruleJsonType EOF
            {
             before(grammarAccess.getJsonTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleJsonType();

            state._fsp--;

             after(grammarAccess.getJsonTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJsonType"


    // $ANTLR start "ruleJsonType"
    // InternalCurlBetterThanHttpie.g:562:1: ruleJsonType : ( ( rule__JsonType__Alternatives ) ) ;
    public final void ruleJsonType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:566:2: ( ( ( rule__JsonType__Alternatives ) ) )
            // InternalCurlBetterThanHttpie.g:567:2: ( ( rule__JsonType__Alternatives ) )
            {
            // InternalCurlBetterThanHttpie.g:567:2: ( ( rule__JsonType__Alternatives ) )
            // InternalCurlBetterThanHttpie.g:568:3: ( rule__JsonType__Alternatives )
            {
             before(grammarAccess.getJsonTypeAccess().getAlternatives()); 
            // InternalCurlBetterThanHttpie.g:569:3: ( rule__JsonType__Alternatives )
            // InternalCurlBetterThanHttpie.g:569:4: rule__JsonType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__JsonType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getJsonTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJsonType"


    // $ANTLR start "entryRuleJsonObject"
    // InternalCurlBetterThanHttpie.g:578:1: entryRuleJsonObject : ruleJsonObject EOF ;
    public final void entryRuleJsonObject() throws RecognitionException {
        try {
            // InternalCurlBetterThanHttpie.g:579:1: ( ruleJsonObject EOF )
            // InternalCurlBetterThanHttpie.g:580:1: ruleJsonObject EOF
            {
             before(grammarAccess.getJsonObjectRule()); 
            pushFollow(FOLLOW_1);
            ruleJsonObject();

            state._fsp--;

             after(grammarAccess.getJsonObjectRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJsonObject"


    // $ANTLR start "ruleJsonObject"
    // InternalCurlBetterThanHttpie.g:587:1: ruleJsonObject : ( ( rule__JsonObject__Group__0 ) ) ;
    public final void ruleJsonObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:591:2: ( ( ( rule__JsonObject__Group__0 ) ) )
            // InternalCurlBetterThanHttpie.g:592:2: ( ( rule__JsonObject__Group__0 ) )
            {
            // InternalCurlBetterThanHttpie.g:592:2: ( ( rule__JsonObject__Group__0 ) )
            // InternalCurlBetterThanHttpie.g:593:3: ( rule__JsonObject__Group__0 )
            {
             before(grammarAccess.getJsonObjectAccess().getGroup()); 
            // InternalCurlBetterThanHttpie.g:594:3: ( rule__JsonObject__Group__0 )
            // InternalCurlBetterThanHttpie.g:594:4: rule__JsonObject__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__JsonObject__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJsonObjectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJsonObject"


    // $ANTLR start "entryRuleJsonString"
    // InternalCurlBetterThanHttpie.g:603:1: entryRuleJsonString : ruleJsonString EOF ;
    public final void entryRuleJsonString() throws RecognitionException {
        try {
            // InternalCurlBetterThanHttpie.g:604:1: ( ruleJsonString EOF )
            // InternalCurlBetterThanHttpie.g:605:1: ruleJsonString EOF
            {
             before(grammarAccess.getJsonStringRule()); 
            pushFollow(FOLLOW_1);
            ruleJsonString();

            state._fsp--;

             after(grammarAccess.getJsonStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJsonString"


    // $ANTLR start "ruleJsonString"
    // InternalCurlBetterThanHttpie.g:612:1: ruleJsonString : ( ( rule__JsonString__ValueAssignment ) ) ;
    public final void ruleJsonString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:616:2: ( ( ( rule__JsonString__ValueAssignment ) ) )
            // InternalCurlBetterThanHttpie.g:617:2: ( ( rule__JsonString__ValueAssignment ) )
            {
            // InternalCurlBetterThanHttpie.g:617:2: ( ( rule__JsonString__ValueAssignment ) )
            // InternalCurlBetterThanHttpie.g:618:3: ( rule__JsonString__ValueAssignment )
            {
             before(grammarAccess.getJsonStringAccess().getValueAssignment()); 
            // InternalCurlBetterThanHttpie.g:619:3: ( rule__JsonString__ValueAssignment )
            // InternalCurlBetterThanHttpie.g:619:4: rule__JsonString__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__JsonString__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getJsonStringAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJsonString"


    // $ANTLR start "entryRuleJsonArray"
    // InternalCurlBetterThanHttpie.g:628:1: entryRuleJsonArray : ruleJsonArray EOF ;
    public final void entryRuleJsonArray() throws RecognitionException {
        try {
            // InternalCurlBetterThanHttpie.g:629:1: ( ruleJsonArray EOF )
            // InternalCurlBetterThanHttpie.g:630:1: ruleJsonArray EOF
            {
             before(grammarAccess.getJsonArrayRule()); 
            pushFollow(FOLLOW_1);
            ruleJsonArray();

            state._fsp--;

             after(grammarAccess.getJsonArrayRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJsonArray"


    // $ANTLR start "ruleJsonArray"
    // InternalCurlBetterThanHttpie.g:637:1: ruleJsonArray : ( ( rule__JsonArray__Group__0 ) ) ;
    public final void ruleJsonArray() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:641:2: ( ( ( rule__JsonArray__Group__0 ) ) )
            // InternalCurlBetterThanHttpie.g:642:2: ( ( rule__JsonArray__Group__0 ) )
            {
            // InternalCurlBetterThanHttpie.g:642:2: ( ( rule__JsonArray__Group__0 ) )
            // InternalCurlBetterThanHttpie.g:643:3: ( rule__JsonArray__Group__0 )
            {
             before(grammarAccess.getJsonArrayAccess().getGroup()); 
            // InternalCurlBetterThanHttpie.g:644:3: ( rule__JsonArray__Group__0 )
            // InternalCurlBetterThanHttpie.g:644:4: rule__JsonArray__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__JsonArray__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJsonArrayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJsonArray"


    // $ANTLR start "entryRuleJsonBoolean"
    // InternalCurlBetterThanHttpie.g:653:1: entryRuleJsonBoolean : ruleJsonBoolean EOF ;
    public final void entryRuleJsonBoolean() throws RecognitionException {
        try {
            // InternalCurlBetterThanHttpie.g:654:1: ( ruleJsonBoolean EOF )
            // InternalCurlBetterThanHttpie.g:655:1: ruleJsonBoolean EOF
            {
             before(grammarAccess.getJsonBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleJsonBoolean();

            state._fsp--;

             after(grammarAccess.getJsonBooleanRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJsonBoolean"


    // $ANTLR start "ruleJsonBoolean"
    // InternalCurlBetterThanHttpie.g:662:1: ruleJsonBoolean : ( ( rule__JsonBoolean__ValueAssignment ) ) ;
    public final void ruleJsonBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:666:2: ( ( ( rule__JsonBoolean__ValueAssignment ) ) )
            // InternalCurlBetterThanHttpie.g:667:2: ( ( rule__JsonBoolean__ValueAssignment ) )
            {
            // InternalCurlBetterThanHttpie.g:667:2: ( ( rule__JsonBoolean__ValueAssignment ) )
            // InternalCurlBetterThanHttpie.g:668:3: ( rule__JsonBoolean__ValueAssignment )
            {
             before(grammarAccess.getJsonBooleanAccess().getValueAssignment()); 
            // InternalCurlBetterThanHttpie.g:669:3: ( rule__JsonBoolean__ValueAssignment )
            // InternalCurlBetterThanHttpie.g:669:4: rule__JsonBoolean__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__JsonBoolean__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getJsonBooleanAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJsonBoolean"


    // $ANTLR start "entryRuleJsonNull"
    // InternalCurlBetterThanHttpie.g:678:1: entryRuleJsonNull : ruleJsonNull EOF ;
    public final void entryRuleJsonNull() throws RecognitionException {
        try {
            // InternalCurlBetterThanHttpie.g:679:1: ( ruleJsonNull EOF )
            // InternalCurlBetterThanHttpie.g:680:1: ruleJsonNull EOF
            {
             before(grammarAccess.getJsonNullRule()); 
            pushFollow(FOLLOW_1);
            ruleJsonNull();

            state._fsp--;

             after(grammarAccess.getJsonNullRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJsonNull"


    // $ANTLR start "ruleJsonNull"
    // InternalCurlBetterThanHttpie.g:687:1: ruleJsonNull : ( ( rule__JsonNull__Group__0 ) ) ;
    public final void ruleJsonNull() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:691:2: ( ( ( rule__JsonNull__Group__0 ) ) )
            // InternalCurlBetterThanHttpie.g:692:2: ( ( rule__JsonNull__Group__0 ) )
            {
            // InternalCurlBetterThanHttpie.g:692:2: ( ( rule__JsonNull__Group__0 ) )
            // InternalCurlBetterThanHttpie.g:693:3: ( rule__JsonNull__Group__0 )
            {
             before(grammarAccess.getJsonNullAccess().getGroup()); 
            // InternalCurlBetterThanHttpie.g:694:3: ( rule__JsonNull__Group__0 )
            // InternalCurlBetterThanHttpie.g:694:4: rule__JsonNull__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__JsonNull__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJsonNullAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJsonNull"


    // $ANTLR start "entryRuleJsonNumber"
    // InternalCurlBetterThanHttpie.g:703:1: entryRuleJsonNumber : ruleJsonNumber EOF ;
    public final void entryRuleJsonNumber() throws RecognitionException {
        try {
            // InternalCurlBetterThanHttpie.g:704:1: ( ruleJsonNumber EOF )
            // InternalCurlBetterThanHttpie.g:705:1: ruleJsonNumber EOF
            {
             before(grammarAccess.getJsonNumberRule()); 
            pushFollow(FOLLOW_1);
            ruleJsonNumber();

            state._fsp--;

             after(grammarAccess.getJsonNumberRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJsonNumber"


    // $ANTLR start "ruleJsonNumber"
    // InternalCurlBetterThanHttpie.g:712:1: ruleJsonNumber : ( ( rule__JsonNumber__ValueAssignment ) ) ;
    public final void ruleJsonNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:716:2: ( ( ( rule__JsonNumber__ValueAssignment ) ) )
            // InternalCurlBetterThanHttpie.g:717:2: ( ( rule__JsonNumber__ValueAssignment ) )
            {
            // InternalCurlBetterThanHttpie.g:717:2: ( ( rule__JsonNumber__ValueAssignment ) )
            // InternalCurlBetterThanHttpie.g:718:3: ( rule__JsonNumber__ValueAssignment )
            {
             before(grammarAccess.getJsonNumberAccess().getValueAssignment()); 
            // InternalCurlBetterThanHttpie.g:719:3: ( rule__JsonNumber__ValueAssignment )
            // InternalCurlBetterThanHttpie.g:719:4: rule__JsonNumber__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__JsonNumber__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getJsonNumberAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJsonNumber"


    // $ANTLR start "ruleMethod"
    // InternalCurlBetterThanHttpie.g:728:1: ruleMethod : ( ( rule__Method__Alternatives ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:732:1: ( ( ( rule__Method__Alternatives ) ) )
            // InternalCurlBetterThanHttpie.g:733:2: ( ( rule__Method__Alternatives ) )
            {
            // InternalCurlBetterThanHttpie.g:733:2: ( ( rule__Method__Alternatives ) )
            // InternalCurlBetterThanHttpie.g:734:3: ( rule__Method__Alternatives )
            {
             before(grammarAccess.getMethodAccess().getAlternatives()); 
            // InternalCurlBetterThanHttpie.g:735:3: ( rule__Method__Alternatives )
            // InternalCurlBetterThanHttpie.g:735:4: rule__Method__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Method__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMethod"


    // $ANTLR start "rule__CommandLineInterface__ProtocolAlternatives_5_0_0"
    // InternalCurlBetterThanHttpie.g:743:1: rule__CommandLineInterface__ProtocolAlternatives_5_0_0 : ( ( RULE_ID ) | ( RULE_HTTP ) );
    public final void rule__CommandLineInterface__ProtocolAlternatives_5_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:747:1: ( ( RULE_ID ) | ( RULE_HTTP ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_HTTP) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:748:2: ( RULE_ID )
                    {
                    // InternalCurlBetterThanHttpie.g:748:2: ( RULE_ID )
                    // InternalCurlBetterThanHttpie.g:749:3: RULE_ID
                    {
                     before(grammarAccess.getCommandLineInterfaceAccess().getProtocolIDTerminalRuleCall_5_0_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getCommandLineInterfaceAccess().getProtocolIDTerminalRuleCall_5_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:754:2: ( RULE_HTTP )
                    {
                    // InternalCurlBetterThanHttpie.g:754:2: ( RULE_HTTP )
                    // InternalCurlBetterThanHttpie.g:755:3: RULE_HTTP
                    {
                     before(grammarAccess.getCommandLineInterfaceAccess().getProtocolHTTPTerminalRuleCall_5_0_0_1()); 
                    match(input,RULE_HTTP,FOLLOW_2); 
                     after(grammarAccess.getCommandLineInterfaceAccess().getProtocolHTTPTerminalRuleCall_5_0_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__ProtocolAlternatives_5_0_0"


    // $ANTLR start "rule__CommandLineInterface__Alternatives_6"
    // InternalCurlBetterThanHttpie.g:764:1: rule__CommandLineInterface__Alternatives_6 : ( ( ( rule__CommandLineInterface__Group_6_0__0 ) ) | ( ( rule__CommandLineInterface__Group_6_1__0 ) ) );
    public final void rule__CommandLineInterface__Alternatives_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:768:1: ( ( ( rule__CommandLineInterface__Group_6_0__0 ) ) | ( ( rule__CommandLineInterface__Group_6_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_URL) ) {
                alt2=1;
            }
            else if ( (LA2_0==30) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:769:2: ( ( rule__CommandLineInterface__Group_6_0__0 ) )
                    {
                    // InternalCurlBetterThanHttpie.g:769:2: ( ( rule__CommandLineInterface__Group_6_0__0 ) )
                    // InternalCurlBetterThanHttpie.g:770:3: ( rule__CommandLineInterface__Group_6_0__0 )
                    {
                     before(grammarAccess.getCommandLineInterfaceAccess().getGroup_6_0()); 
                    // InternalCurlBetterThanHttpie.g:771:3: ( rule__CommandLineInterface__Group_6_0__0 )
                    // InternalCurlBetterThanHttpie.g:771:4: rule__CommandLineInterface__Group_6_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CommandLineInterface__Group_6_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCommandLineInterfaceAccess().getGroup_6_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:775:2: ( ( rule__CommandLineInterface__Group_6_1__0 ) )
                    {
                    // InternalCurlBetterThanHttpie.g:775:2: ( ( rule__CommandLineInterface__Group_6_1__0 ) )
                    // InternalCurlBetterThanHttpie.g:776:3: ( rule__CommandLineInterface__Group_6_1__0 )
                    {
                     before(grammarAccess.getCommandLineInterfaceAccess().getGroup_6_1()); 
                    // InternalCurlBetterThanHttpie.g:777:3: ( rule__CommandLineInterface__Group_6_1__0 )
                    // InternalCurlBetterThanHttpie.g:777:4: rule__CommandLineInterface__Group_6_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CommandLineInterface__Group_6_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCommandLineInterfaceAccess().getGroup_6_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Alternatives_6"


    // $ANTLR start "rule__CommandLineInterface__ResourceAlternatives_7_1_0"
    // InternalCurlBetterThanHttpie.g:785:1: rule__CommandLineInterface__ResourceAlternatives_7_1_0 : ( ( RULE_ID ) | ( RULE_HTTP ) );
    public final void rule__CommandLineInterface__ResourceAlternatives_7_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:789:1: ( ( RULE_ID ) | ( RULE_HTTP ) )
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
                    // InternalCurlBetterThanHttpie.g:790:2: ( RULE_ID )
                    {
                    // InternalCurlBetterThanHttpie.g:790:2: ( RULE_ID )
                    // InternalCurlBetterThanHttpie.g:791:3: RULE_ID
                    {
                     before(grammarAccess.getCommandLineInterfaceAccess().getResourceIDTerminalRuleCall_7_1_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getCommandLineInterfaceAccess().getResourceIDTerminalRuleCall_7_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:796:2: ( RULE_HTTP )
                    {
                    // InternalCurlBetterThanHttpie.g:796:2: ( RULE_HTTP )
                    // InternalCurlBetterThanHttpie.g:797:3: RULE_HTTP
                    {
                     before(grammarAccess.getCommandLineInterfaceAccess().getResourceHTTPTerminalRuleCall_7_1_0_1()); 
                    match(input,RULE_HTTP,FOLLOW_2); 
                     after(grammarAccess.getCommandLineInterfaceAccess().getResourceHTTPTerminalRuleCall_7_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__ResourceAlternatives_7_1_0"


    // $ANTLR start "rule__Flag__Alternatives"
    // InternalCurlBetterThanHttpie.g:806:1: rule__Flag__Alternatives : ( ( ruleProxyFlag ) | ( ruleFormFlag ) | ( ruleAuthFlag ) | ( ruleDownloadFlag ) | ( ruleBodyFlag ) | ( ruleVersionFlag ) | ( ruleJsonFlag ) | ( ruleHelpFlag ) | ( ruleHeadersFlag ) | ( ruleVerboseFlag ) | ( ruleTimeoutFlag ) );
    public final void rule__Flag__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:810:1: ( ( ruleProxyFlag ) | ( ruleFormFlag ) | ( ruleAuthFlag ) | ( ruleDownloadFlag ) | ( ruleBodyFlag ) | ( ruleVersionFlag ) | ( ruleJsonFlag ) | ( ruleHelpFlag ) | ( ruleHeadersFlag ) | ( ruleVerboseFlag ) | ( ruleTimeoutFlag ) )
            int alt4=11;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt4=1;
                }
                break;
            case 25:
            case 26:
                {
                alt4=2;
                }
                break;
            case 28:
            case 29:
                {
                alt4=3;
                }
                break;
            case 31:
            case 32:
                {
                alt4=4;
                }
                break;
            case 21:
            case 22:
                {
                alt4=5;
                }
                break;
            case 46:
                {
                alt4=6;
                }
                break;
            case 23:
            case 24:
                {
                alt4=7;
                }
                break;
            case 33:
            case 34:
                {
                alt4=8;
                }
                break;
            case 19:
            case 20:
                {
                alt4=9;
                }
                break;
            case 35:
            case 36:
                {
                alt4=10;
                }
                break;
            case 47:
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
                    // InternalCurlBetterThanHttpie.g:811:2: ( ruleProxyFlag )
                    {
                    // InternalCurlBetterThanHttpie.g:811:2: ( ruleProxyFlag )
                    // InternalCurlBetterThanHttpie.g:812:3: ruleProxyFlag
                    {
                     before(grammarAccess.getFlagAccess().getProxyFlagParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleProxyFlag();

                    state._fsp--;

                     after(grammarAccess.getFlagAccess().getProxyFlagParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:817:2: ( ruleFormFlag )
                    {
                    // InternalCurlBetterThanHttpie.g:817:2: ( ruleFormFlag )
                    // InternalCurlBetterThanHttpie.g:818:3: ruleFormFlag
                    {
                     before(grammarAccess.getFlagAccess().getFormFlagParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFormFlag();

                    state._fsp--;

                     after(grammarAccess.getFlagAccess().getFormFlagParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCurlBetterThanHttpie.g:823:2: ( ruleAuthFlag )
                    {
                    // InternalCurlBetterThanHttpie.g:823:2: ( ruleAuthFlag )
                    // InternalCurlBetterThanHttpie.g:824:3: ruleAuthFlag
                    {
                     before(grammarAccess.getFlagAccess().getAuthFlagParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleAuthFlag();

                    state._fsp--;

                     after(grammarAccess.getFlagAccess().getAuthFlagParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCurlBetterThanHttpie.g:829:2: ( ruleDownloadFlag )
                    {
                    // InternalCurlBetterThanHttpie.g:829:2: ( ruleDownloadFlag )
                    // InternalCurlBetterThanHttpie.g:830:3: ruleDownloadFlag
                    {
                     before(grammarAccess.getFlagAccess().getDownloadFlagParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleDownloadFlag();

                    state._fsp--;

                     after(grammarAccess.getFlagAccess().getDownloadFlagParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCurlBetterThanHttpie.g:835:2: ( ruleBodyFlag )
                    {
                    // InternalCurlBetterThanHttpie.g:835:2: ( ruleBodyFlag )
                    // InternalCurlBetterThanHttpie.g:836:3: ruleBodyFlag
                    {
                     before(grammarAccess.getFlagAccess().getBodyFlagParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleBodyFlag();

                    state._fsp--;

                     after(grammarAccess.getFlagAccess().getBodyFlagParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalCurlBetterThanHttpie.g:841:2: ( ruleVersionFlag )
                    {
                    // InternalCurlBetterThanHttpie.g:841:2: ( ruleVersionFlag )
                    // InternalCurlBetterThanHttpie.g:842:3: ruleVersionFlag
                    {
                     before(grammarAccess.getFlagAccess().getVersionFlagParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleVersionFlag();

                    state._fsp--;

                     after(grammarAccess.getFlagAccess().getVersionFlagParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalCurlBetterThanHttpie.g:847:2: ( ruleJsonFlag )
                    {
                    // InternalCurlBetterThanHttpie.g:847:2: ( ruleJsonFlag )
                    // InternalCurlBetterThanHttpie.g:848:3: ruleJsonFlag
                    {
                     before(grammarAccess.getFlagAccess().getJsonFlagParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleJsonFlag();

                    state._fsp--;

                     after(grammarAccess.getFlagAccess().getJsonFlagParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalCurlBetterThanHttpie.g:853:2: ( ruleHelpFlag )
                    {
                    // InternalCurlBetterThanHttpie.g:853:2: ( ruleHelpFlag )
                    // InternalCurlBetterThanHttpie.g:854:3: ruleHelpFlag
                    {
                     before(grammarAccess.getFlagAccess().getHelpFlagParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleHelpFlag();

                    state._fsp--;

                     after(grammarAccess.getFlagAccess().getHelpFlagParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalCurlBetterThanHttpie.g:859:2: ( ruleHeadersFlag )
                    {
                    // InternalCurlBetterThanHttpie.g:859:2: ( ruleHeadersFlag )
                    // InternalCurlBetterThanHttpie.g:860:3: ruleHeadersFlag
                    {
                     before(grammarAccess.getFlagAccess().getHeadersFlagParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleHeadersFlag();

                    state._fsp--;

                     after(grammarAccess.getFlagAccess().getHeadersFlagParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalCurlBetterThanHttpie.g:865:2: ( ruleVerboseFlag )
                    {
                    // InternalCurlBetterThanHttpie.g:865:2: ( ruleVerboseFlag )
                    // InternalCurlBetterThanHttpie.g:866:3: ruleVerboseFlag
                    {
                     before(grammarAccess.getFlagAccess().getVerboseFlagParserRuleCall_9()); 
                    pushFollow(FOLLOW_2);
                    ruleVerboseFlag();

                    state._fsp--;

                     after(grammarAccess.getFlagAccess().getVerboseFlagParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalCurlBetterThanHttpie.g:871:2: ( ruleTimeoutFlag )
                    {
                    // InternalCurlBetterThanHttpie.g:871:2: ( ruleTimeoutFlag )
                    // InternalCurlBetterThanHttpie.g:872:3: ruleTimeoutFlag
                    {
                     before(grammarAccess.getFlagAccess().getTimeoutFlagParserRuleCall_10()); 
                    pushFollow(FOLLOW_2);
                    ruleTimeoutFlag();

                    state._fsp--;

                     after(grammarAccess.getFlagAccess().getTimeoutFlagParserRuleCall_10()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Flag__Alternatives"


    // $ANTLR start "rule__HeadersFlag__Alternatives_1"
    // InternalCurlBetterThanHttpie.g:881:1: rule__HeadersFlag__Alternatives_1 : ( ( '--header' ) | ( '-t' ) );
    public final void rule__HeadersFlag__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:885:1: ( ( '--header' ) | ( '-t' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            else if ( (LA5_0==20) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:886:2: ( '--header' )
                    {
                    // InternalCurlBetterThanHttpie.g:886:2: ( '--header' )
                    // InternalCurlBetterThanHttpie.g:887:3: '--header'
                    {
                     before(grammarAccess.getHeadersFlagAccess().getHeaderKeyword_1_0()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getHeadersFlagAccess().getHeaderKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:892:2: ( '-t' )
                    {
                    // InternalCurlBetterThanHttpie.g:892:2: ( '-t' )
                    // InternalCurlBetterThanHttpie.g:893:3: '-t'
                    {
                     before(grammarAccess.getHeadersFlagAccess().getTKeyword_1_1()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getHeadersFlagAccess().getTKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HeadersFlag__Alternatives_1"


    // $ANTLR start "rule__BodyFlag__Alternatives_1"
    // InternalCurlBetterThanHttpie.g:902:1: rule__BodyFlag__Alternatives_1 : ( ( '--body' ) | ( '-b' ) );
    public final void rule__BodyFlag__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:906:1: ( ( '--body' ) | ( '-b' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            else if ( (LA6_0==22) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:907:2: ( '--body' )
                    {
                    // InternalCurlBetterThanHttpie.g:907:2: ( '--body' )
                    // InternalCurlBetterThanHttpie.g:908:3: '--body'
                    {
                     before(grammarAccess.getBodyFlagAccess().getBodyKeyword_1_0()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getBodyFlagAccess().getBodyKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:913:2: ( '-b' )
                    {
                    // InternalCurlBetterThanHttpie.g:913:2: ( '-b' )
                    // InternalCurlBetterThanHttpie.g:914:3: '-b'
                    {
                     before(grammarAccess.getBodyFlagAccess().getBKeyword_1_1()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getBodyFlagAccess().getBKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BodyFlag__Alternatives_1"


    // $ANTLR start "rule__JsonFlag__Alternatives_1"
    // InternalCurlBetterThanHttpie.g:923:1: rule__JsonFlag__Alternatives_1 : ( ( '--json' ) | ( '-j' ) );
    public final void rule__JsonFlag__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:927:1: ( ( '--json' ) | ( '-j' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            else if ( (LA7_0==24) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:928:2: ( '--json' )
                    {
                    // InternalCurlBetterThanHttpie.g:928:2: ( '--json' )
                    // InternalCurlBetterThanHttpie.g:929:3: '--json'
                    {
                     before(grammarAccess.getJsonFlagAccess().getJsonKeyword_1_0()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getJsonFlagAccess().getJsonKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:934:2: ( '-j' )
                    {
                    // InternalCurlBetterThanHttpie.g:934:2: ( '-j' )
                    // InternalCurlBetterThanHttpie.g:935:3: '-j'
                    {
                     before(grammarAccess.getJsonFlagAccess().getJKeyword_1_1()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getJsonFlagAccess().getJKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonFlag__Alternatives_1"


    // $ANTLR start "rule__FormFlag__Alternatives_1"
    // InternalCurlBetterThanHttpie.g:944:1: rule__FormFlag__Alternatives_1 : ( ( '--form' ) | ( '-f' ) );
    public final void rule__FormFlag__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:948:1: ( ( '--form' ) | ( '-f' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            else if ( (LA8_0==26) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:949:2: ( '--form' )
                    {
                    // InternalCurlBetterThanHttpie.g:949:2: ( '--form' )
                    // InternalCurlBetterThanHttpie.g:950:3: '--form'
                    {
                     before(grammarAccess.getFormFlagAccess().getFormKeyword_1_0()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getFormFlagAccess().getFormKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:955:2: ( '-f' )
                    {
                    // InternalCurlBetterThanHttpie.g:955:2: ( '-f' )
                    // InternalCurlBetterThanHttpie.g:956:3: '-f'
                    {
                     before(grammarAccess.getFormFlagAccess().getFKeyword_1_1()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getFormFlagAccess().getFKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormFlag__Alternatives_1"


    // $ANTLR start "rule__ProxyFlag__Alternatives_1"
    // InternalCurlBetterThanHttpie.g:965:1: rule__ProxyFlag__Alternatives_1 : ( ( '=' ) | ( RULE_WS ) );
    public final void rule__ProxyFlag__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:969:1: ( ( '=' ) | ( RULE_WS ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_WS) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:970:2: ( '=' )
                    {
                    // InternalCurlBetterThanHttpie.g:970:2: ( '=' )
                    // InternalCurlBetterThanHttpie.g:971:3: '='
                    {
                     before(grammarAccess.getProxyFlagAccess().getEqualsSignKeyword_1_0()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getProxyFlagAccess().getEqualsSignKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:976:2: ( RULE_WS )
                    {
                    // InternalCurlBetterThanHttpie.g:976:2: ( RULE_WS )
                    // InternalCurlBetterThanHttpie.g:977:3: RULE_WS
                    {
                     before(grammarAccess.getProxyFlagAccess().getWSTerminalRuleCall_1_1()); 
                    match(input,RULE_WS,FOLLOW_2); 
                     after(grammarAccess.getProxyFlagAccess().getWSTerminalRuleCall_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Alternatives_1"


    // $ANTLR start "rule__ProxyFlag__Alternatives_2"
    // InternalCurlBetterThanHttpie.g:986:1: rule__ProxyFlag__Alternatives_2 : ( ( ( rule__ProxyFlag__Group_2_0__0 ) ) | ( ( rule__ProxyFlag__Group_2_1__0 ) ) | ( ( rule__ProxyFlag__Group_2_2__0 ) ) );
    public final void rule__ProxyFlag__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:990:1: ( ( ( rule__ProxyFlag__Group_2_0__0 ) ) | ( ( rule__ProxyFlag__Group_2_1__0 ) ) | ( ( rule__ProxyFlag__Group_2_2__0 ) ) )
            int alt10=3;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==30) ) {
                    switch ( input.LA(3) ) {
                    case RULE_ID:
                        {
                        int LA10_5 = input.LA(4);

                        if ( (LA10_5==30) ) {
                            alt10=1;
                        }
                        else if ( (LA10_5==41) ) {
                            alt10=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 10, 5, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_HTTP:
                        {
                        int LA10_6 = input.LA(4);

                        if ( (LA10_6==30) ) {
                            alt10=1;
                        }
                        else if ( (LA10_6==41) ) {
                            alt10=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 10, 6, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_URL:
                    case 30:
                        {
                        alt10=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 3, input);

                        throw nvae;
                    }

                }
                else if ( (LA10_1==41) ) {
                    alt10=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA10_0==RULE_HTTP) ) {
                int LA10_2 = input.LA(2);

                if ( (LA10_2==41) ) {
                    alt10=2;
                }
                else if ( (LA10_2==30) ) {
                    switch ( input.LA(3) ) {
                    case RULE_ID:
                        {
                        int LA10_5 = input.LA(4);

                        if ( (LA10_5==30) ) {
                            alt10=1;
                        }
                        else if ( (LA10_5==41) ) {
                            alt10=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 10, 5, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_HTTP:
                        {
                        int LA10_6 = input.LA(4);

                        if ( (LA10_6==30) ) {
                            alt10=1;
                        }
                        else if ( (LA10_6==41) ) {
                            alt10=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 10, 6, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_URL:
                    case 30:
                        {
                        alt10=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 3, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 2, input);

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
                    // InternalCurlBetterThanHttpie.g:991:2: ( ( rule__ProxyFlag__Group_2_0__0 ) )
                    {
                    // InternalCurlBetterThanHttpie.g:991:2: ( ( rule__ProxyFlag__Group_2_0__0 ) )
                    // InternalCurlBetterThanHttpie.g:992:3: ( rule__ProxyFlag__Group_2_0__0 )
                    {
                     before(grammarAccess.getProxyFlagAccess().getGroup_2_0()); 
                    // InternalCurlBetterThanHttpie.g:993:3: ( rule__ProxyFlag__Group_2_0__0 )
                    // InternalCurlBetterThanHttpie.g:993:4: rule__ProxyFlag__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProxyFlag__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getProxyFlagAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:997:2: ( ( rule__ProxyFlag__Group_2_1__0 ) )
                    {
                    // InternalCurlBetterThanHttpie.g:997:2: ( ( rule__ProxyFlag__Group_2_1__0 ) )
                    // InternalCurlBetterThanHttpie.g:998:3: ( rule__ProxyFlag__Group_2_1__0 )
                    {
                     before(grammarAccess.getProxyFlagAccess().getGroup_2_1()); 
                    // InternalCurlBetterThanHttpie.g:999:3: ( rule__ProxyFlag__Group_2_1__0 )
                    // InternalCurlBetterThanHttpie.g:999:4: rule__ProxyFlag__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProxyFlag__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getProxyFlagAccess().getGroup_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCurlBetterThanHttpie.g:1003:2: ( ( rule__ProxyFlag__Group_2_2__0 ) )
                    {
                    // InternalCurlBetterThanHttpie.g:1003:2: ( ( rule__ProxyFlag__Group_2_2__0 ) )
                    // InternalCurlBetterThanHttpie.g:1004:3: ( rule__ProxyFlag__Group_2_2__0 )
                    {
                     before(grammarAccess.getProxyFlagAccess().getGroup_2_2()); 
                    // InternalCurlBetterThanHttpie.g:1005:3: ( rule__ProxyFlag__Group_2_2__0 )
                    // InternalCurlBetterThanHttpie.g:1005:4: rule__ProxyFlag__Group_2_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProxyFlag__Group_2_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getProxyFlagAccess().getGroup_2_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Alternatives_2"


    // $ANTLR start "rule__ProxyFlag__ProtocolAlternatives_2_0_0_0"
    // InternalCurlBetterThanHttpie.g:1013:1: rule__ProxyFlag__ProtocolAlternatives_2_0_0_0 : ( ( RULE_ID ) | ( RULE_HTTP ) );
    public final void rule__ProxyFlag__ProtocolAlternatives_2_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1017:1: ( ( RULE_ID ) | ( RULE_HTTP ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_HTTP) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1018:2: ( RULE_ID )
                    {
                    // InternalCurlBetterThanHttpie.g:1018:2: ( RULE_ID )
                    // InternalCurlBetterThanHttpie.g:1019:3: RULE_ID
                    {
                     before(grammarAccess.getProxyFlagAccess().getProtocolIDTerminalRuleCall_2_0_0_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getProxyFlagAccess().getProtocolIDTerminalRuleCall_2_0_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:1024:2: ( RULE_HTTP )
                    {
                    // InternalCurlBetterThanHttpie.g:1024:2: ( RULE_HTTP )
                    // InternalCurlBetterThanHttpie.g:1025:3: RULE_HTTP
                    {
                     before(grammarAccess.getProxyFlagAccess().getProtocolHTTPTerminalRuleCall_2_0_0_0_1()); 
                    match(input,RULE_HTTP,FOLLOW_2); 
                     after(grammarAccess.getProxyFlagAccess().getProtocolHTTPTerminalRuleCall_2_0_0_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__ProtocolAlternatives_2_0_0_0"


    // $ANTLR start "rule__ProxyFlag__ProxyProtocolAlternatives_2_1_0_0"
    // InternalCurlBetterThanHttpie.g:1034:1: rule__ProxyFlag__ProxyProtocolAlternatives_2_1_0_0 : ( ( RULE_ID ) | ( RULE_HTTP ) );
    public final void rule__ProxyFlag__ProxyProtocolAlternatives_2_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1038:1: ( ( RULE_ID ) | ( RULE_HTTP ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_HTTP) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1039:2: ( RULE_ID )
                    {
                    // InternalCurlBetterThanHttpie.g:1039:2: ( RULE_ID )
                    // InternalCurlBetterThanHttpie.g:1040:3: RULE_ID
                    {
                     before(grammarAccess.getProxyFlagAccess().getProxyProtocolIDTerminalRuleCall_2_1_0_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getProxyFlagAccess().getProxyProtocolIDTerminalRuleCall_2_1_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:1045:2: ( RULE_HTTP )
                    {
                    // InternalCurlBetterThanHttpie.g:1045:2: ( RULE_HTTP )
                    // InternalCurlBetterThanHttpie.g:1046:3: RULE_HTTP
                    {
                     before(grammarAccess.getProxyFlagAccess().getProxyProtocolHTTPTerminalRuleCall_2_1_0_0_1()); 
                    match(input,RULE_HTTP,FOLLOW_2); 
                     after(grammarAccess.getProxyFlagAccess().getProxyProtocolHTTPTerminalRuleCall_2_1_0_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__ProxyProtocolAlternatives_2_1_0_0"


    // $ANTLR start "rule__ProxyFlag__ProtocolAlternatives_2_2_0_0"
    // InternalCurlBetterThanHttpie.g:1055:1: rule__ProxyFlag__ProtocolAlternatives_2_2_0_0 : ( ( RULE_ID ) | ( RULE_HTTP ) );
    public final void rule__ProxyFlag__ProtocolAlternatives_2_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1059:1: ( ( RULE_ID ) | ( RULE_HTTP ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_HTTP) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1060:2: ( RULE_ID )
                    {
                    // InternalCurlBetterThanHttpie.g:1060:2: ( RULE_ID )
                    // InternalCurlBetterThanHttpie.g:1061:3: RULE_ID
                    {
                     before(grammarAccess.getProxyFlagAccess().getProtocolIDTerminalRuleCall_2_2_0_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getProxyFlagAccess().getProtocolIDTerminalRuleCall_2_2_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:1066:2: ( RULE_HTTP )
                    {
                    // InternalCurlBetterThanHttpie.g:1066:2: ( RULE_HTTP )
                    // InternalCurlBetterThanHttpie.g:1067:3: RULE_HTTP
                    {
                     before(grammarAccess.getProxyFlagAccess().getProtocolHTTPTerminalRuleCall_2_2_0_0_1()); 
                    match(input,RULE_HTTP,FOLLOW_2); 
                     after(grammarAccess.getProxyFlagAccess().getProtocolHTTPTerminalRuleCall_2_2_0_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__ProtocolAlternatives_2_2_0_0"


    // $ANTLR start "rule__ProxyFlag__ProxyProtocolAlternatives_2_2_2_0"
    // InternalCurlBetterThanHttpie.g:1076:1: rule__ProxyFlag__ProxyProtocolAlternatives_2_2_2_0 : ( ( RULE_ID ) | ( RULE_HTTP ) );
    public final void rule__ProxyFlag__ProxyProtocolAlternatives_2_2_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1080:1: ( ( RULE_ID ) | ( RULE_HTTP ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_HTTP) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1081:2: ( RULE_ID )
                    {
                    // InternalCurlBetterThanHttpie.g:1081:2: ( RULE_ID )
                    // InternalCurlBetterThanHttpie.g:1082:3: RULE_ID
                    {
                     before(grammarAccess.getProxyFlagAccess().getProxyProtocolIDTerminalRuleCall_2_2_2_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getProxyFlagAccess().getProxyProtocolIDTerminalRuleCall_2_2_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:1087:2: ( RULE_HTTP )
                    {
                    // InternalCurlBetterThanHttpie.g:1087:2: ( RULE_HTTP )
                    // InternalCurlBetterThanHttpie.g:1088:3: RULE_HTTP
                    {
                     before(grammarAccess.getProxyFlagAccess().getProxyProtocolHTTPTerminalRuleCall_2_2_2_0_1()); 
                    match(input,RULE_HTTP,FOLLOW_2); 
                     after(grammarAccess.getProxyFlagAccess().getProxyProtocolHTTPTerminalRuleCall_2_2_2_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__ProxyProtocolAlternatives_2_2_2_0"


    // $ANTLR start "rule__ProxyFlag__UsernameAlternatives_3_0_0"
    // InternalCurlBetterThanHttpie.g:1097:1: rule__ProxyFlag__UsernameAlternatives_3_0_0 : ( ( RULE_ID ) | ( RULE_HTTP ) );
    public final void rule__ProxyFlag__UsernameAlternatives_3_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1101:1: ( ( RULE_ID ) | ( RULE_HTTP ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_HTTP) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1102:2: ( RULE_ID )
                    {
                    // InternalCurlBetterThanHttpie.g:1102:2: ( RULE_ID )
                    // InternalCurlBetterThanHttpie.g:1103:3: RULE_ID
                    {
                     before(grammarAccess.getProxyFlagAccess().getUsernameIDTerminalRuleCall_3_0_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getProxyFlagAccess().getUsernameIDTerminalRuleCall_3_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:1108:2: ( RULE_HTTP )
                    {
                    // InternalCurlBetterThanHttpie.g:1108:2: ( RULE_HTTP )
                    // InternalCurlBetterThanHttpie.g:1109:3: RULE_HTTP
                    {
                     before(grammarAccess.getProxyFlagAccess().getUsernameHTTPTerminalRuleCall_3_0_0_1()); 
                    match(input,RULE_HTTP,FOLLOW_2); 
                     after(grammarAccess.getProxyFlagAccess().getUsernameHTTPTerminalRuleCall_3_0_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__UsernameAlternatives_3_0_0"


    // $ANTLR start "rule__ProxyFlag__PasswordAlternatives_3_2_0"
    // InternalCurlBetterThanHttpie.g:1118:1: rule__ProxyFlag__PasswordAlternatives_3_2_0 : ( ( RULE_ID ) | ( RULE_HTTP ) );
    public final void rule__ProxyFlag__PasswordAlternatives_3_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1122:1: ( ( RULE_ID ) | ( RULE_HTTP ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_HTTP) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1123:2: ( RULE_ID )
                    {
                    // InternalCurlBetterThanHttpie.g:1123:2: ( RULE_ID )
                    // InternalCurlBetterThanHttpie.g:1124:3: RULE_ID
                    {
                     before(grammarAccess.getProxyFlagAccess().getPasswordIDTerminalRuleCall_3_2_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getProxyFlagAccess().getPasswordIDTerminalRuleCall_3_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:1129:2: ( RULE_HTTP )
                    {
                    // InternalCurlBetterThanHttpie.g:1129:2: ( RULE_HTTP )
                    // InternalCurlBetterThanHttpie.g:1130:3: RULE_HTTP
                    {
                     before(grammarAccess.getProxyFlagAccess().getPasswordHTTPTerminalRuleCall_3_2_0_1()); 
                    match(input,RULE_HTTP,FOLLOW_2); 
                     after(grammarAccess.getProxyFlagAccess().getPasswordHTTPTerminalRuleCall_3_2_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__PasswordAlternatives_3_2_0"


    // $ANTLR start "rule__ProxyFlag__Alternatives_4"
    // InternalCurlBetterThanHttpie.g:1139:1: rule__ProxyFlag__Alternatives_4 : ( ( ( rule__ProxyFlag__Group_4_0__0 ) ) | ( ( rule__ProxyFlag__Group_4_1__0 ) ) );
    public final void rule__ProxyFlag__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1143:1: ( ( ( rule__ProxyFlag__Group_4_0__0 ) ) | ( ( rule__ProxyFlag__Group_4_1__0 ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_URL) ) {
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
                    // InternalCurlBetterThanHttpie.g:1144:2: ( ( rule__ProxyFlag__Group_4_0__0 ) )
                    {
                    // InternalCurlBetterThanHttpie.g:1144:2: ( ( rule__ProxyFlag__Group_4_0__0 ) )
                    // InternalCurlBetterThanHttpie.g:1145:3: ( rule__ProxyFlag__Group_4_0__0 )
                    {
                     before(grammarAccess.getProxyFlagAccess().getGroup_4_0()); 
                    // InternalCurlBetterThanHttpie.g:1146:3: ( rule__ProxyFlag__Group_4_0__0 )
                    // InternalCurlBetterThanHttpie.g:1146:4: rule__ProxyFlag__Group_4_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProxyFlag__Group_4_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getProxyFlagAccess().getGroup_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:1150:2: ( ( rule__ProxyFlag__Group_4_1__0 ) )
                    {
                    // InternalCurlBetterThanHttpie.g:1150:2: ( ( rule__ProxyFlag__Group_4_1__0 ) )
                    // InternalCurlBetterThanHttpie.g:1151:3: ( rule__ProxyFlag__Group_4_1__0 )
                    {
                     before(grammarAccess.getProxyFlagAccess().getGroup_4_1()); 
                    // InternalCurlBetterThanHttpie.g:1152:3: ( rule__ProxyFlag__Group_4_1__0 )
                    // InternalCurlBetterThanHttpie.g:1152:4: rule__ProxyFlag__Group_4_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProxyFlag__Group_4_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getProxyFlagAccess().getGroup_4_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Alternatives_4"


    // $ANTLR start "rule__AuthFlag__Alternatives_0"
    // InternalCurlBetterThanHttpie.g:1160:1: rule__AuthFlag__Alternatives_0 : ( ( '--auth' ) | ( '-a' ) );
    public final void rule__AuthFlag__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1164:1: ( ( '--auth' ) | ( '-a' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            else if ( (LA18_0==29) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1165:2: ( '--auth' )
                    {
                    // InternalCurlBetterThanHttpie.g:1165:2: ( '--auth' )
                    // InternalCurlBetterThanHttpie.g:1166:3: '--auth'
                    {
                     before(grammarAccess.getAuthFlagAccess().getAuthKeyword_0_0()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getAuthFlagAccess().getAuthKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:1171:2: ( '-a' )
                    {
                    // InternalCurlBetterThanHttpie.g:1171:2: ( '-a' )
                    // InternalCurlBetterThanHttpie.g:1172:3: '-a'
                    {
                     before(grammarAccess.getAuthFlagAccess().getAKeyword_0_1()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getAuthFlagAccess().getAKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthFlag__Alternatives_0"


    // $ANTLR start "rule__AuthFlag__Alternatives_1"
    // InternalCurlBetterThanHttpie.g:1181:1: rule__AuthFlag__Alternatives_1 : ( ( '=' ) | ( RULE_WS ) );
    public final void rule__AuthFlag__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1185:1: ( ( '=' ) | ( RULE_WS ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==27) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_WS) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1186:2: ( '=' )
                    {
                    // InternalCurlBetterThanHttpie.g:1186:2: ( '=' )
                    // InternalCurlBetterThanHttpie.g:1187:3: '='
                    {
                     before(grammarAccess.getAuthFlagAccess().getEqualsSignKeyword_1_0()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getAuthFlagAccess().getEqualsSignKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:1192:2: ( RULE_WS )
                    {
                    // InternalCurlBetterThanHttpie.g:1192:2: ( RULE_WS )
                    // InternalCurlBetterThanHttpie.g:1193:3: RULE_WS
                    {
                     before(grammarAccess.getAuthFlagAccess().getWSTerminalRuleCall_1_1()); 
                    match(input,RULE_WS,FOLLOW_2); 
                     after(grammarAccess.getAuthFlagAccess().getWSTerminalRuleCall_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthFlag__Alternatives_1"


    // $ANTLR start "rule__AuthFlag__UsernameAlternatives_2_0"
    // InternalCurlBetterThanHttpie.g:1202:1: rule__AuthFlag__UsernameAlternatives_2_0 : ( ( RULE_ID ) | ( RULE_HTTP ) );
    public final void rule__AuthFlag__UsernameAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1206:1: ( ( RULE_ID ) | ( RULE_HTTP ) )
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
                    // InternalCurlBetterThanHttpie.g:1207:2: ( RULE_ID )
                    {
                    // InternalCurlBetterThanHttpie.g:1207:2: ( RULE_ID )
                    // InternalCurlBetterThanHttpie.g:1208:3: RULE_ID
                    {
                     before(grammarAccess.getAuthFlagAccess().getUsernameIDTerminalRuleCall_2_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getAuthFlagAccess().getUsernameIDTerminalRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:1213:2: ( RULE_HTTP )
                    {
                    // InternalCurlBetterThanHttpie.g:1213:2: ( RULE_HTTP )
                    // InternalCurlBetterThanHttpie.g:1214:3: RULE_HTTP
                    {
                     before(grammarAccess.getAuthFlagAccess().getUsernameHTTPTerminalRuleCall_2_0_1()); 
                    match(input,RULE_HTTP,FOLLOW_2); 
                     after(grammarAccess.getAuthFlagAccess().getUsernameHTTPTerminalRuleCall_2_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthFlag__UsernameAlternatives_2_0"


    // $ANTLR start "rule__AuthFlag__PasswordAlternatives_3_1_0"
    // InternalCurlBetterThanHttpie.g:1223:1: rule__AuthFlag__PasswordAlternatives_3_1_0 : ( ( RULE_ID ) | ( RULE_HTTP ) );
    public final void rule__AuthFlag__PasswordAlternatives_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1227:1: ( ( RULE_ID ) | ( RULE_HTTP ) )
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
                    // InternalCurlBetterThanHttpie.g:1228:2: ( RULE_ID )
                    {
                    // InternalCurlBetterThanHttpie.g:1228:2: ( RULE_ID )
                    // InternalCurlBetterThanHttpie.g:1229:3: RULE_ID
                    {
                     before(grammarAccess.getAuthFlagAccess().getPasswordIDTerminalRuleCall_3_1_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getAuthFlagAccess().getPasswordIDTerminalRuleCall_3_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:1234:2: ( RULE_HTTP )
                    {
                    // InternalCurlBetterThanHttpie.g:1234:2: ( RULE_HTTP )
                    // InternalCurlBetterThanHttpie.g:1235:3: RULE_HTTP
                    {
                     before(grammarAccess.getAuthFlagAccess().getPasswordHTTPTerminalRuleCall_3_1_0_1()); 
                    match(input,RULE_HTTP,FOLLOW_2); 
                     after(grammarAccess.getAuthFlagAccess().getPasswordHTTPTerminalRuleCall_3_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthFlag__PasswordAlternatives_3_1_0"


    // $ANTLR start "rule__AuthFlag__Alternatives_4_1"
    // InternalCurlBetterThanHttpie.g:1244:1: rule__AuthFlag__Alternatives_4_1 : ( ( ( rule__AuthFlag__HostnameAssignment_4_1_0 ) ) | ( ':' ) );
    public final void rule__AuthFlag__Alternatives_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1248:1: ( ( ( rule__AuthFlag__HostnameAssignment_4_1_0 ) ) | ( ':' ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_URL) ) {
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
                    // InternalCurlBetterThanHttpie.g:1249:2: ( ( rule__AuthFlag__HostnameAssignment_4_1_0 ) )
                    {
                    // InternalCurlBetterThanHttpie.g:1249:2: ( ( rule__AuthFlag__HostnameAssignment_4_1_0 ) )
                    // InternalCurlBetterThanHttpie.g:1250:3: ( rule__AuthFlag__HostnameAssignment_4_1_0 )
                    {
                     before(grammarAccess.getAuthFlagAccess().getHostnameAssignment_4_1_0()); 
                    // InternalCurlBetterThanHttpie.g:1251:3: ( rule__AuthFlag__HostnameAssignment_4_1_0 )
                    // InternalCurlBetterThanHttpie.g:1251:4: rule__AuthFlag__HostnameAssignment_4_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AuthFlag__HostnameAssignment_4_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAuthFlagAccess().getHostnameAssignment_4_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:1255:2: ( ':' )
                    {
                    // InternalCurlBetterThanHttpie.g:1255:2: ( ':' )
                    // InternalCurlBetterThanHttpie.g:1256:3: ':'
                    {
                     before(grammarAccess.getAuthFlagAccess().getColonKeyword_4_1_1()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getAuthFlagAccess().getColonKeyword_4_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthFlag__Alternatives_4_1"


    // $ANTLR start "rule__DownloadFlag__Alternatives_1"
    // InternalCurlBetterThanHttpie.g:1265:1: rule__DownloadFlag__Alternatives_1 : ( ( '--download' ) | ( '-d' ) );
    public final void rule__DownloadFlag__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1269:1: ( ( '--download' ) | ( '-d' ) )
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
                    // InternalCurlBetterThanHttpie.g:1270:2: ( '--download' )
                    {
                    // InternalCurlBetterThanHttpie.g:1270:2: ( '--download' )
                    // InternalCurlBetterThanHttpie.g:1271:3: '--download'
                    {
                     before(grammarAccess.getDownloadFlagAccess().getDownloadKeyword_1_0()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getDownloadFlagAccess().getDownloadKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:1276:2: ( '-d' )
                    {
                    // InternalCurlBetterThanHttpie.g:1276:2: ( '-d' )
                    // InternalCurlBetterThanHttpie.g:1277:3: '-d'
                    {
                     before(grammarAccess.getDownloadFlagAccess().getDKeyword_1_1()); 
                    match(input,32,FOLLOW_2); 
                     after(grammarAccess.getDownloadFlagAccess().getDKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DownloadFlag__Alternatives_1"


    // $ANTLR start "rule__HelpFlag__Alternatives_1"
    // InternalCurlBetterThanHttpie.g:1286:1: rule__HelpFlag__Alternatives_1 : ( ( '--help' ) | ( '-h' ) );
    public final void rule__HelpFlag__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1290:1: ( ( '--help' ) | ( '-h' ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==33) ) {
                alt24=1;
            }
            else if ( (LA24_0==34) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1291:2: ( '--help' )
                    {
                    // InternalCurlBetterThanHttpie.g:1291:2: ( '--help' )
                    // InternalCurlBetterThanHttpie.g:1292:3: '--help'
                    {
                     before(grammarAccess.getHelpFlagAccess().getHelpKeyword_1_0()); 
                    match(input,33,FOLLOW_2); 
                     after(grammarAccess.getHelpFlagAccess().getHelpKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:1297:2: ( '-h' )
                    {
                    // InternalCurlBetterThanHttpie.g:1297:2: ( '-h' )
                    // InternalCurlBetterThanHttpie.g:1298:3: '-h'
                    {
                     before(grammarAccess.getHelpFlagAccess().getHKeyword_1_1()); 
                    match(input,34,FOLLOW_2); 
                     after(grammarAccess.getHelpFlagAccess().getHKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelpFlag__Alternatives_1"


    // $ANTLR start "rule__VerboseFlag__Alternatives_1"
    // InternalCurlBetterThanHttpie.g:1307:1: rule__VerboseFlag__Alternatives_1 : ( ( '--verbose' ) | ( '-v' ) );
    public final void rule__VerboseFlag__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1311:1: ( ( '--verbose' ) | ( '-v' ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==35) ) {
                alt25=1;
            }
            else if ( (LA25_0==36) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1312:2: ( '--verbose' )
                    {
                    // InternalCurlBetterThanHttpie.g:1312:2: ( '--verbose' )
                    // InternalCurlBetterThanHttpie.g:1313:3: '--verbose'
                    {
                     before(grammarAccess.getVerboseFlagAccess().getVerboseKeyword_1_0()); 
                    match(input,35,FOLLOW_2); 
                     after(grammarAccess.getVerboseFlagAccess().getVerboseKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:1318:2: ( '-v' )
                    {
                    // InternalCurlBetterThanHttpie.g:1318:2: ( '-v' )
                    // InternalCurlBetterThanHttpie.g:1319:3: '-v'
                    {
                     before(grammarAccess.getVerboseFlagAccess().getVKeyword_1_1()); 
                    match(input,36,FOLLOW_2); 
                     after(grammarAccess.getVerboseFlagAccess().getVKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerboseFlag__Alternatives_1"


    // $ANTLR start "rule__TimeoutFlag__Alternatives_1"
    // InternalCurlBetterThanHttpie.g:1328:1: rule__TimeoutFlag__Alternatives_1 : ( ( '=' ) | ( RULE_WS ) );
    public final void rule__TimeoutFlag__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1332:1: ( ( '=' ) | ( RULE_WS ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==27) ) {
                alt26=1;
            }
            else if ( (LA26_0==RULE_WS) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1333:2: ( '=' )
                    {
                    // InternalCurlBetterThanHttpie.g:1333:2: ( '=' )
                    // InternalCurlBetterThanHttpie.g:1334:3: '='
                    {
                     before(grammarAccess.getTimeoutFlagAccess().getEqualsSignKeyword_1_0()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getTimeoutFlagAccess().getEqualsSignKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:1339:2: ( RULE_WS )
                    {
                    // InternalCurlBetterThanHttpie.g:1339:2: ( RULE_WS )
                    // InternalCurlBetterThanHttpie.g:1340:3: RULE_WS
                    {
                     before(grammarAccess.getTimeoutFlagAccess().getWSTerminalRuleCall_1_1()); 
                    match(input,RULE_WS,FOLLOW_2); 
                     after(grammarAccess.getTimeoutFlagAccess().getWSTerminalRuleCall_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeoutFlag__Alternatives_1"


    // $ANTLR start "rule__Item__Alternatives"
    // InternalCurlBetterThanHttpie.g:1349:1: rule__Item__Alternatives : ( ( ruleHttpHeaderItem ) | ( ruleFormFileFieldItem ) | ( ruleDataFieldItem ) | ( ruleUrlParameterItem ) | ( ruleRawJsonFieldItem ) );
    public final void rule__Item__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1353:1: ( ( ruleHttpHeaderItem ) | ( ruleFormFileFieldItem ) | ( ruleDataFieldItem ) | ( ruleUrlParameterItem ) | ( ruleRawJsonFieldItem ) )
            int alt27=5;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 48:
                    {
                    alt27=4;
                    }
                    break;
                case 27:
                    {
                    alt27=3;
                    }
                    break;
                case 45:
                    {
                    alt27=2;
                    }
                    break;
                case 30:
                    {
                    alt27=1;
                    }
                    break;
                case 49:
                    {
                    alt27=5;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA27_0==RULE_HTTP) ) {
                switch ( input.LA(2) ) {
                case 45:
                    {
                    alt27=2;
                    }
                    break;
                case 30:
                    {
                    alt27=1;
                    }
                    break;
                case 49:
                    {
                    alt27=5;
                    }
                    break;
                case 48:
                    {
                    alt27=4;
                    }
                    break;
                case 27:
                    {
                    alt27=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1354:2: ( ruleHttpHeaderItem )
                    {
                    // InternalCurlBetterThanHttpie.g:1354:2: ( ruleHttpHeaderItem )
                    // InternalCurlBetterThanHttpie.g:1355:3: ruleHttpHeaderItem
                    {
                     before(grammarAccess.getItemAccess().getHttpHeaderItemParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleHttpHeaderItem();

                    state._fsp--;

                     after(grammarAccess.getItemAccess().getHttpHeaderItemParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:1360:2: ( ruleFormFileFieldItem )
                    {
                    // InternalCurlBetterThanHttpie.g:1360:2: ( ruleFormFileFieldItem )
                    // InternalCurlBetterThanHttpie.g:1361:3: ruleFormFileFieldItem
                    {
                     before(grammarAccess.getItemAccess().getFormFileFieldItemParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFormFileFieldItem();

                    state._fsp--;

                     after(grammarAccess.getItemAccess().getFormFileFieldItemParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCurlBetterThanHttpie.g:1366:2: ( ruleDataFieldItem )
                    {
                    // InternalCurlBetterThanHttpie.g:1366:2: ( ruleDataFieldItem )
                    // InternalCurlBetterThanHttpie.g:1367:3: ruleDataFieldItem
                    {
                     before(grammarAccess.getItemAccess().getDataFieldItemParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDataFieldItem();

                    state._fsp--;

                     after(grammarAccess.getItemAccess().getDataFieldItemParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCurlBetterThanHttpie.g:1372:2: ( ruleUrlParameterItem )
                    {
                    // InternalCurlBetterThanHttpie.g:1372:2: ( ruleUrlParameterItem )
                    // InternalCurlBetterThanHttpie.g:1373:3: ruleUrlParameterItem
                    {
                     before(grammarAccess.getItemAccess().getUrlParameterItemParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleUrlParameterItem();

                    state._fsp--;

                     after(grammarAccess.getItemAccess().getUrlParameterItemParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCurlBetterThanHttpie.g:1378:2: ( ruleRawJsonFieldItem )
                    {
                    // InternalCurlBetterThanHttpie.g:1378:2: ( ruleRawJsonFieldItem )
                    // InternalCurlBetterThanHttpie.g:1379:3: ruleRawJsonFieldItem
                    {
                     before(grammarAccess.getItemAccess().getRawJsonFieldItemParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleRawJsonFieldItem();

                    state._fsp--;

                     after(grammarAccess.getItemAccess().getRawJsonFieldItemParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Alternatives"


    // $ANTLR start "rule__HttpHeaderItem__FieldAlternatives_0_0"
    // InternalCurlBetterThanHttpie.g:1388:1: rule__HttpHeaderItem__FieldAlternatives_0_0 : ( ( RULE_ID ) | ( RULE_HTTP ) );
    public final void rule__HttpHeaderItem__FieldAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1392:1: ( ( RULE_ID ) | ( RULE_HTTP ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                alt28=1;
            }
            else if ( (LA28_0==RULE_HTTP) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1393:2: ( RULE_ID )
                    {
                    // InternalCurlBetterThanHttpie.g:1393:2: ( RULE_ID )
                    // InternalCurlBetterThanHttpie.g:1394:3: RULE_ID
                    {
                     before(grammarAccess.getHttpHeaderItemAccess().getFieldIDTerminalRuleCall_0_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getHttpHeaderItemAccess().getFieldIDTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:1399:2: ( RULE_HTTP )
                    {
                    // InternalCurlBetterThanHttpie.g:1399:2: ( RULE_HTTP )
                    // InternalCurlBetterThanHttpie.g:1400:3: RULE_HTTP
                    {
                     before(grammarAccess.getHttpHeaderItemAccess().getFieldHTTPTerminalRuleCall_0_0_1()); 
                    match(input,RULE_HTTP,FOLLOW_2); 
                     after(grammarAccess.getHttpHeaderItemAccess().getFieldHTTPTerminalRuleCall_0_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpHeaderItem__FieldAlternatives_0_0"


    // $ANTLR start "rule__HttpHeaderItem__ValueAlternatives_2_0"
    // InternalCurlBetterThanHttpie.g:1409:1: rule__HttpHeaderItem__ValueAlternatives_2_0 : ( ( RULE_ID ) | ( RULE_HTTP ) );
    public final void rule__HttpHeaderItem__ValueAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1413:1: ( ( RULE_ID ) | ( RULE_HTTP ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID) ) {
                alt29=1;
            }
            else if ( (LA29_0==RULE_HTTP) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1414:2: ( RULE_ID )
                    {
                    // InternalCurlBetterThanHttpie.g:1414:2: ( RULE_ID )
                    // InternalCurlBetterThanHttpie.g:1415:3: RULE_ID
                    {
                     before(grammarAccess.getHttpHeaderItemAccess().getValueIDTerminalRuleCall_2_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getHttpHeaderItemAccess().getValueIDTerminalRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:1420:2: ( RULE_HTTP )
                    {
                    // InternalCurlBetterThanHttpie.g:1420:2: ( RULE_HTTP )
                    // InternalCurlBetterThanHttpie.g:1421:3: RULE_HTTP
                    {
                     before(grammarAccess.getHttpHeaderItemAccess().getValueHTTPTerminalRuleCall_2_0_1()); 
                    match(input,RULE_HTTP,FOLLOW_2); 
                     after(grammarAccess.getHttpHeaderItemAccess().getValueHTTPTerminalRuleCall_2_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpHeaderItem__ValueAlternatives_2_0"


    // $ANTLR start "rule__FormFileFieldItem__FieldAlternatives_0_0"
    // InternalCurlBetterThanHttpie.g:1430:1: rule__FormFileFieldItem__FieldAlternatives_0_0 : ( ( RULE_ID ) | ( RULE_HTTP ) );
    public final void rule__FormFileFieldItem__FieldAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1434:1: ( ( RULE_ID ) | ( RULE_HTTP ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID) ) {
                alt30=1;
            }
            else if ( (LA30_0==RULE_HTTP) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1435:2: ( RULE_ID )
                    {
                    // InternalCurlBetterThanHttpie.g:1435:2: ( RULE_ID )
                    // InternalCurlBetterThanHttpie.g:1436:3: RULE_ID
                    {
                     before(grammarAccess.getFormFileFieldItemAccess().getFieldIDTerminalRuleCall_0_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getFormFileFieldItemAccess().getFieldIDTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:1441:2: ( RULE_HTTP )
                    {
                    // InternalCurlBetterThanHttpie.g:1441:2: ( RULE_HTTP )
                    // InternalCurlBetterThanHttpie.g:1442:3: RULE_HTTP
                    {
                     before(grammarAccess.getFormFileFieldItemAccess().getFieldHTTPTerminalRuleCall_0_0_1()); 
                    match(input,RULE_HTTP,FOLLOW_2); 
                     after(grammarAccess.getFormFileFieldItemAccess().getFieldHTTPTerminalRuleCall_0_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormFileFieldItem__FieldAlternatives_0_0"


    // $ANTLR start "rule__FormFileFieldItem__ValueAlternatives_2_0"
    // InternalCurlBetterThanHttpie.g:1451:1: rule__FormFileFieldItem__ValueAlternatives_2_0 : ( ( RULE_ID ) | ( RULE_HTTP ) );
    public final void rule__FormFileFieldItem__ValueAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1455:1: ( ( RULE_ID ) | ( RULE_HTTP ) )
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
                    // InternalCurlBetterThanHttpie.g:1456:2: ( RULE_ID )
                    {
                    // InternalCurlBetterThanHttpie.g:1456:2: ( RULE_ID )
                    // InternalCurlBetterThanHttpie.g:1457:3: RULE_ID
                    {
                     before(grammarAccess.getFormFileFieldItemAccess().getValueIDTerminalRuleCall_2_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getFormFileFieldItemAccess().getValueIDTerminalRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:1462:2: ( RULE_HTTP )
                    {
                    // InternalCurlBetterThanHttpie.g:1462:2: ( RULE_HTTP )
                    // InternalCurlBetterThanHttpie.g:1463:3: RULE_HTTP
                    {
                     before(grammarAccess.getFormFileFieldItemAccess().getValueHTTPTerminalRuleCall_2_0_1()); 
                    match(input,RULE_HTTP,FOLLOW_2); 
                     after(grammarAccess.getFormFileFieldItemAccess().getValueHTTPTerminalRuleCall_2_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormFileFieldItem__ValueAlternatives_2_0"


    // $ANTLR start "rule__DataFieldItem__FieldAlternatives_0_0"
    // InternalCurlBetterThanHttpie.g:1472:1: rule__DataFieldItem__FieldAlternatives_0_0 : ( ( RULE_ID ) | ( RULE_HTTP ) );
    public final void rule__DataFieldItem__FieldAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1476:1: ( ( RULE_ID ) | ( RULE_HTTP ) )
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
                    // InternalCurlBetterThanHttpie.g:1477:2: ( RULE_ID )
                    {
                    // InternalCurlBetterThanHttpie.g:1477:2: ( RULE_ID )
                    // InternalCurlBetterThanHttpie.g:1478:3: RULE_ID
                    {
                     before(grammarAccess.getDataFieldItemAccess().getFieldIDTerminalRuleCall_0_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getDataFieldItemAccess().getFieldIDTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:1483:2: ( RULE_HTTP )
                    {
                    // InternalCurlBetterThanHttpie.g:1483:2: ( RULE_HTTP )
                    // InternalCurlBetterThanHttpie.g:1484:3: RULE_HTTP
                    {
                     before(grammarAccess.getDataFieldItemAccess().getFieldHTTPTerminalRuleCall_0_0_1()); 
                    match(input,RULE_HTTP,FOLLOW_2); 
                     after(grammarAccess.getDataFieldItemAccess().getFieldHTTPTerminalRuleCall_0_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFieldItem__FieldAlternatives_0_0"


    // $ANTLR start "rule__DataFieldItem__Alternatives_2"
    // InternalCurlBetterThanHttpie.g:1493:1: rule__DataFieldItem__Alternatives_2 : ( ( ( rule__DataFieldItem__ValueAssignment_2_0 ) ) | ( ( rule__DataFieldItem__Group_2_1__0 ) ) );
    public final void rule__DataFieldItem__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1497:1: ( ( ( rule__DataFieldItem__ValueAssignment_2_0 ) ) | ( ( rule__DataFieldItem__Group_2_1__0 ) ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=RULE_ID && LA33_0<=RULE_HTTP)) ) {
                alt33=1;
            }
            else if ( (LA33_0==45) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1498:2: ( ( rule__DataFieldItem__ValueAssignment_2_0 ) )
                    {
                    // InternalCurlBetterThanHttpie.g:1498:2: ( ( rule__DataFieldItem__ValueAssignment_2_0 ) )
                    // InternalCurlBetterThanHttpie.g:1499:3: ( rule__DataFieldItem__ValueAssignment_2_0 )
                    {
                     before(grammarAccess.getDataFieldItemAccess().getValueAssignment_2_0()); 
                    // InternalCurlBetterThanHttpie.g:1500:3: ( rule__DataFieldItem__ValueAssignment_2_0 )
                    // InternalCurlBetterThanHttpie.g:1500:4: rule__DataFieldItem__ValueAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataFieldItem__ValueAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDataFieldItemAccess().getValueAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:1504:2: ( ( rule__DataFieldItem__Group_2_1__0 ) )
                    {
                    // InternalCurlBetterThanHttpie.g:1504:2: ( ( rule__DataFieldItem__Group_2_1__0 ) )
                    // InternalCurlBetterThanHttpie.g:1505:3: ( rule__DataFieldItem__Group_2_1__0 )
                    {
                     before(grammarAccess.getDataFieldItemAccess().getGroup_2_1()); 
                    // InternalCurlBetterThanHttpie.g:1506:3: ( rule__DataFieldItem__Group_2_1__0 )
                    // InternalCurlBetterThanHttpie.g:1506:4: rule__DataFieldItem__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataFieldItem__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDataFieldItemAccess().getGroup_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFieldItem__Alternatives_2"


    // $ANTLR start "rule__DataFieldItem__ValueAlternatives_2_0_0"
    // InternalCurlBetterThanHttpie.g:1514:1: rule__DataFieldItem__ValueAlternatives_2_0_0 : ( ( RULE_ID ) | ( RULE_HTTP ) );
    public final void rule__DataFieldItem__ValueAlternatives_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1518:1: ( ( RULE_ID ) | ( RULE_HTTP ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID) ) {
                alt34=1;
            }
            else if ( (LA34_0==RULE_HTTP) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1519:2: ( RULE_ID )
                    {
                    // InternalCurlBetterThanHttpie.g:1519:2: ( RULE_ID )
                    // InternalCurlBetterThanHttpie.g:1520:3: RULE_ID
                    {
                     before(grammarAccess.getDataFieldItemAccess().getValueIDTerminalRuleCall_2_0_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getDataFieldItemAccess().getValueIDTerminalRuleCall_2_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:1525:2: ( RULE_HTTP )
                    {
                    // InternalCurlBetterThanHttpie.g:1525:2: ( RULE_HTTP )
                    // InternalCurlBetterThanHttpie.g:1526:3: RULE_HTTP
                    {
                     before(grammarAccess.getDataFieldItemAccess().getValueHTTPTerminalRuleCall_2_0_0_1()); 
                    match(input,RULE_HTTP,FOLLOW_2); 
                     after(grammarAccess.getDataFieldItemAccess().getValueHTTPTerminalRuleCall_2_0_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFieldItem__ValueAlternatives_2_0_0"


    // $ANTLR start "rule__UrlParameterItem__FieldAlternatives_0_0"
    // InternalCurlBetterThanHttpie.g:1535:1: rule__UrlParameterItem__FieldAlternatives_0_0 : ( ( RULE_ID ) | ( RULE_HTTP ) );
    public final void rule__UrlParameterItem__FieldAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1539:1: ( ( RULE_ID ) | ( RULE_HTTP ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID) ) {
                alt35=1;
            }
            else if ( (LA35_0==RULE_HTTP) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1540:2: ( RULE_ID )
                    {
                    // InternalCurlBetterThanHttpie.g:1540:2: ( RULE_ID )
                    // InternalCurlBetterThanHttpie.g:1541:3: RULE_ID
                    {
                     before(grammarAccess.getUrlParameterItemAccess().getFieldIDTerminalRuleCall_0_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getUrlParameterItemAccess().getFieldIDTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:1546:2: ( RULE_HTTP )
                    {
                    // InternalCurlBetterThanHttpie.g:1546:2: ( RULE_HTTP )
                    // InternalCurlBetterThanHttpie.g:1547:3: RULE_HTTP
                    {
                     before(grammarAccess.getUrlParameterItemAccess().getFieldHTTPTerminalRuleCall_0_0_1()); 
                    match(input,RULE_HTTP,FOLLOW_2); 
                     after(grammarAccess.getUrlParameterItemAccess().getFieldHTTPTerminalRuleCall_0_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UrlParameterItem__FieldAlternatives_0_0"


    // $ANTLR start "rule__UrlParameterItem__ValueAlternatives_2_0"
    // InternalCurlBetterThanHttpie.g:1556:1: rule__UrlParameterItem__ValueAlternatives_2_0 : ( ( RULE_ID ) | ( RULE_HTTP ) );
    public final void rule__UrlParameterItem__ValueAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1560:1: ( ( RULE_ID ) | ( RULE_HTTP ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID) ) {
                alt36=1;
            }
            else if ( (LA36_0==RULE_HTTP) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1561:2: ( RULE_ID )
                    {
                    // InternalCurlBetterThanHttpie.g:1561:2: ( RULE_ID )
                    // InternalCurlBetterThanHttpie.g:1562:3: RULE_ID
                    {
                     before(grammarAccess.getUrlParameterItemAccess().getValueIDTerminalRuleCall_2_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getUrlParameterItemAccess().getValueIDTerminalRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:1567:2: ( RULE_HTTP )
                    {
                    // InternalCurlBetterThanHttpie.g:1567:2: ( RULE_HTTP )
                    // InternalCurlBetterThanHttpie.g:1568:3: RULE_HTTP
                    {
                     before(grammarAccess.getUrlParameterItemAccess().getValueHTTPTerminalRuleCall_2_0_1()); 
                    match(input,RULE_HTTP,FOLLOW_2); 
                     after(grammarAccess.getUrlParameterItemAccess().getValueHTTPTerminalRuleCall_2_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UrlParameterItem__ValueAlternatives_2_0"


    // $ANTLR start "rule__RawJsonFieldItem__FieldAlternatives_0_0"
    // InternalCurlBetterThanHttpie.g:1577:1: rule__RawJsonFieldItem__FieldAlternatives_0_0 : ( ( RULE_ID ) | ( RULE_HTTP ) );
    public final void rule__RawJsonFieldItem__FieldAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1581:1: ( ( RULE_ID ) | ( RULE_HTTP ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID) ) {
                alt37=1;
            }
            else if ( (LA37_0==RULE_HTTP) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1582:2: ( RULE_ID )
                    {
                    // InternalCurlBetterThanHttpie.g:1582:2: ( RULE_ID )
                    // InternalCurlBetterThanHttpie.g:1583:3: RULE_ID
                    {
                     before(grammarAccess.getRawJsonFieldItemAccess().getFieldIDTerminalRuleCall_0_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getRawJsonFieldItemAccess().getFieldIDTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:1588:2: ( RULE_HTTP )
                    {
                    // InternalCurlBetterThanHttpie.g:1588:2: ( RULE_HTTP )
                    // InternalCurlBetterThanHttpie.g:1589:3: RULE_HTTP
                    {
                     before(grammarAccess.getRawJsonFieldItemAccess().getFieldHTTPTerminalRuleCall_0_0_1()); 
                    match(input,RULE_HTTP,FOLLOW_2); 
                     after(grammarAccess.getRawJsonFieldItemAccess().getFieldHTTPTerminalRuleCall_0_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RawJsonFieldItem__FieldAlternatives_0_0"


    // $ANTLR start "rule__RawJsonFieldItem__Alternatives_2"
    // InternalCurlBetterThanHttpie.g:1598:1: rule__RawJsonFieldItem__Alternatives_2 : ( ( ( rule__RawJsonFieldItem__ValueAssignment_2_0 ) ) | ( ( rule__RawJsonFieldItem__Group_2_1__0 ) ) );
    public final void rule__RawJsonFieldItem__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1602:1: ( ( ( rule__RawJsonFieldItem__ValueAssignment_2_0 ) ) | ( ( rule__RawJsonFieldItem__Group_2_1__0 ) ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=RULE_ID && LA38_0<=RULE_HTTP)||LA38_0==RULE_NULL||(LA38_0>=RULE_BOOLEAN && LA38_0<=RULE_NUMBER)||LA38_0==51||LA38_0==54) ) {
                alt38=1;
            }
            else if ( (LA38_0==45) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1603:2: ( ( rule__RawJsonFieldItem__ValueAssignment_2_0 ) )
                    {
                    // InternalCurlBetterThanHttpie.g:1603:2: ( ( rule__RawJsonFieldItem__ValueAssignment_2_0 ) )
                    // InternalCurlBetterThanHttpie.g:1604:3: ( rule__RawJsonFieldItem__ValueAssignment_2_0 )
                    {
                     before(grammarAccess.getRawJsonFieldItemAccess().getValueAssignment_2_0()); 
                    // InternalCurlBetterThanHttpie.g:1605:3: ( rule__RawJsonFieldItem__ValueAssignment_2_0 )
                    // InternalCurlBetterThanHttpie.g:1605:4: rule__RawJsonFieldItem__ValueAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RawJsonFieldItem__ValueAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRawJsonFieldItemAccess().getValueAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:1609:2: ( ( rule__RawJsonFieldItem__Group_2_1__0 ) )
                    {
                    // InternalCurlBetterThanHttpie.g:1609:2: ( ( rule__RawJsonFieldItem__Group_2_1__0 ) )
                    // InternalCurlBetterThanHttpie.g:1610:3: ( rule__RawJsonFieldItem__Group_2_1__0 )
                    {
                     before(grammarAccess.getRawJsonFieldItemAccess().getGroup_2_1()); 
                    // InternalCurlBetterThanHttpie.g:1611:3: ( rule__RawJsonFieldItem__Group_2_1__0 )
                    // InternalCurlBetterThanHttpie.g:1611:4: rule__RawJsonFieldItem__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RawJsonFieldItem__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRawJsonFieldItemAccess().getGroup_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RawJsonFieldItem__Alternatives_2"


    // $ANTLR start "rule__Member__KeyAlternatives_0_1_0"
    // InternalCurlBetterThanHttpie.g:1619:1: rule__Member__KeyAlternatives_0_1_0 : ( ( RULE_ID ) | ( RULE_HTTP ) );
    public final void rule__Member__KeyAlternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1623:1: ( ( RULE_ID ) | ( RULE_HTTP ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_ID) ) {
                alt39=1;
            }
            else if ( (LA39_0==RULE_HTTP) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1624:2: ( RULE_ID )
                    {
                    // InternalCurlBetterThanHttpie.g:1624:2: ( RULE_ID )
                    // InternalCurlBetterThanHttpie.g:1625:3: RULE_ID
                    {
                     before(grammarAccess.getMemberAccess().getKeyIDTerminalRuleCall_0_1_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getMemberAccess().getKeyIDTerminalRuleCall_0_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:1630:2: ( RULE_HTTP )
                    {
                    // InternalCurlBetterThanHttpie.g:1630:2: ( RULE_HTTP )
                    // InternalCurlBetterThanHttpie.g:1631:3: RULE_HTTP
                    {
                     before(grammarAccess.getMemberAccess().getKeyHTTPTerminalRuleCall_0_1_0_1()); 
                    match(input,RULE_HTTP,FOLLOW_2); 
                     after(grammarAccess.getMemberAccess().getKeyHTTPTerminalRuleCall_0_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__KeyAlternatives_0_1_0"


    // $ANTLR start "rule__JsonType__Alternatives"
    // InternalCurlBetterThanHttpie.g:1640:1: rule__JsonType__Alternatives : ( ( ruleJsonObject ) | ( ruleJsonString ) | ( ruleJsonArray ) | ( ruleJsonBoolean ) | ( ruleJsonNull ) | ( ruleJsonNumber ) );
    public final void rule__JsonType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1644:1: ( ( ruleJsonObject ) | ( ruleJsonString ) | ( ruleJsonArray ) | ( ruleJsonBoolean ) | ( ruleJsonNull ) | ( ruleJsonNumber ) )
            int alt40=6;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt40=1;
                }
                break;
            case RULE_ID:
            case RULE_HTTP:
                {
                alt40=2;
                }
                break;
            case 54:
                {
                alt40=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt40=4;
                }
                break;
            case RULE_NULL:
                {
                alt40=5;
                }
                break;
            case RULE_NUMBER:
                {
                alt40=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1645:2: ( ruleJsonObject )
                    {
                    // InternalCurlBetterThanHttpie.g:1645:2: ( ruleJsonObject )
                    // InternalCurlBetterThanHttpie.g:1646:3: ruleJsonObject
                    {
                     before(grammarAccess.getJsonTypeAccess().getJsonObjectParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleJsonObject();

                    state._fsp--;

                     after(grammarAccess.getJsonTypeAccess().getJsonObjectParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:1651:2: ( ruleJsonString )
                    {
                    // InternalCurlBetterThanHttpie.g:1651:2: ( ruleJsonString )
                    // InternalCurlBetterThanHttpie.g:1652:3: ruleJsonString
                    {
                     before(grammarAccess.getJsonTypeAccess().getJsonStringParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleJsonString();

                    state._fsp--;

                     after(grammarAccess.getJsonTypeAccess().getJsonStringParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCurlBetterThanHttpie.g:1657:2: ( ruleJsonArray )
                    {
                    // InternalCurlBetterThanHttpie.g:1657:2: ( ruleJsonArray )
                    // InternalCurlBetterThanHttpie.g:1658:3: ruleJsonArray
                    {
                     before(grammarAccess.getJsonTypeAccess().getJsonArrayParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleJsonArray();

                    state._fsp--;

                     after(grammarAccess.getJsonTypeAccess().getJsonArrayParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCurlBetterThanHttpie.g:1663:2: ( ruleJsonBoolean )
                    {
                    // InternalCurlBetterThanHttpie.g:1663:2: ( ruleJsonBoolean )
                    // InternalCurlBetterThanHttpie.g:1664:3: ruleJsonBoolean
                    {
                     before(grammarAccess.getJsonTypeAccess().getJsonBooleanParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleJsonBoolean();

                    state._fsp--;

                     after(grammarAccess.getJsonTypeAccess().getJsonBooleanParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCurlBetterThanHttpie.g:1669:2: ( ruleJsonNull )
                    {
                    // InternalCurlBetterThanHttpie.g:1669:2: ( ruleJsonNull )
                    // InternalCurlBetterThanHttpie.g:1670:3: ruleJsonNull
                    {
                     before(grammarAccess.getJsonTypeAccess().getJsonNullParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleJsonNull();

                    state._fsp--;

                     after(grammarAccess.getJsonTypeAccess().getJsonNullParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalCurlBetterThanHttpie.g:1675:2: ( ruleJsonNumber )
                    {
                    // InternalCurlBetterThanHttpie.g:1675:2: ( ruleJsonNumber )
                    // InternalCurlBetterThanHttpie.g:1676:3: ruleJsonNumber
                    {
                     before(grammarAccess.getJsonTypeAccess().getJsonNumberParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleJsonNumber();

                    state._fsp--;

                     after(grammarAccess.getJsonTypeAccess().getJsonNumberParserRuleCall_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonType__Alternatives"


    // $ANTLR start "rule__JsonString__ValueAlternatives_0"
    // InternalCurlBetterThanHttpie.g:1685:1: rule__JsonString__ValueAlternatives_0 : ( ( RULE_ID ) | ( RULE_HTTP ) );
    public final void rule__JsonString__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1689:1: ( ( RULE_ID ) | ( RULE_HTTP ) )
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
                    // InternalCurlBetterThanHttpie.g:1690:2: ( RULE_ID )
                    {
                    // InternalCurlBetterThanHttpie.g:1690:2: ( RULE_ID )
                    // InternalCurlBetterThanHttpie.g:1691:3: RULE_ID
                    {
                     before(grammarAccess.getJsonStringAccess().getValueIDTerminalRuleCall_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getJsonStringAccess().getValueIDTerminalRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:1696:2: ( RULE_HTTP )
                    {
                    // InternalCurlBetterThanHttpie.g:1696:2: ( RULE_HTTP )
                    // InternalCurlBetterThanHttpie.g:1697:3: RULE_HTTP
                    {
                     before(grammarAccess.getJsonStringAccess().getValueHTTPTerminalRuleCall_0_1()); 
                    match(input,RULE_HTTP,FOLLOW_2); 
                     after(grammarAccess.getJsonStringAccess().getValueHTTPTerminalRuleCall_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonString__ValueAlternatives_0"


    // $ANTLR start "rule__Method__Alternatives"
    // InternalCurlBetterThanHttpie.g:1706:1: rule__Method__Alternatives : ( ( ( 'GET' ) ) | ( ( 'POST' ) ) | ( ( 'PUT' ) ) | ( ( 'DELETE' ) ) );
    public final void rule__Method__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1710:1: ( ( ( 'GET' ) ) | ( ( 'POST' ) ) | ( ( 'PUT' ) ) | ( ( 'DELETE' ) ) )
            int alt42=4;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt42=1;
                }
                break;
            case 38:
                {
                alt42=2;
                }
                break;
            case 39:
                {
                alt42=3;
                }
                break;
            case 40:
                {
                alt42=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1711:2: ( ( 'GET' ) )
                    {
                    // InternalCurlBetterThanHttpie.g:1711:2: ( ( 'GET' ) )
                    // InternalCurlBetterThanHttpie.g:1712:3: ( 'GET' )
                    {
                     before(grammarAccess.getMethodAccess().getGETEnumLiteralDeclaration_0()); 
                    // InternalCurlBetterThanHttpie.g:1713:3: ( 'GET' )
                    // InternalCurlBetterThanHttpie.g:1713:4: 'GET'
                    {
                    match(input,37,FOLLOW_2); 

                    }

                     after(grammarAccess.getMethodAccess().getGETEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:1717:2: ( ( 'POST' ) )
                    {
                    // InternalCurlBetterThanHttpie.g:1717:2: ( ( 'POST' ) )
                    // InternalCurlBetterThanHttpie.g:1718:3: ( 'POST' )
                    {
                     before(grammarAccess.getMethodAccess().getPOSTEnumLiteralDeclaration_1()); 
                    // InternalCurlBetterThanHttpie.g:1719:3: ( 'POST' )
                    // InternalCurlBetterThanHttpie.g:1719:4: 'POST'
                    {
                    match(input,38,FOLLOW_2); 

                    }

                     after(grammarAccess.getMethodAccess().getPOSTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCurlBetterThanHttpie.g:1723:2: ( ( 'PUT' ) )
                    {
                    // InternalCurlBetterThanHttpie.g:1723:2: ( ( 'PUT' ) )
                    // InternalCurlBetterThanHttpie.g:1724:3: ( 'PUT' )
                    {
                     before(grammarAccess.getMethodAccess().getPUTEnumLiteralDeclaration_2()); 
                    // InternalCurlBetterThanHttpie.g:1725:3: ( 'PUT' )
                    // InternalCurlBetterThanHttpie.g:1725:4: 'PUT'
                    {
                    match(input,39,FOLLOW_2); 

                    }

                     after(grammarAccess.getMethodAccess().getPUTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCurlBetterThanHttpie.g:1729:2: ( ( 'DELETE' ) )
                    {
                    // InternalCurlBetterThanHttpie.g:1729:2: ( ( 'DELETE' ) )
                    // InternalCurlBetterThanHttpie.g:1730:3: ( 'DELETE' )
                    {
                     before(grammarAccess.getMethodAccess().getDELETEEnumLiteralDeclaration_3()); 
                    // InternalCurlBetterThanHttpie.g:1731:3: ( 'DELETE' )
                    // InternalCurlBetterThanHttpie.g:1731:4: 'DELETE'
                    {
                    match(input,40,FOLLOW_2); 

                    }

                     after(grammarAccess.getMethodAccess().getDELETEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Alternatives"


    // $ANTLR start "rule__CommandLineInterface__Group__0"
    // InternalCurlBetterThanHttpie.g:1739:1: rule__CommandLineInterface__Group__0 : rule__CommandLineInterface__Group__0__Impl rule__CommandLineInterface__Group__1 ;
    public final void rule__CommandLineInterface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1743:1: ( rule__CommandLineInterface__Group__0__Impl rule__CommandLineInterface__Group__1 )
            // InternalCurlBetterThanHttpie.g:1744:2: rule__CommandLineInterface__Group__0__Impl rule__CommandLineInterface__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__CommandLineInterface__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandLineInterface__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group__0"


    // $ANTLR start "rule__CommandLineInterface__Group__0__Impl"
    // InternalCurlBetterThanHttpie.g:1751:1: rule__CommandLineInterface__Group__0__Impl : ( () ) ;
    public final void rule__CommandLineInterface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1755:1: ( ( () ) )
            // InternalCurlBetterThanHttpie.g:1756:1: ( () )
            {
            // InternalCurlBetterThanHttpie.g:1756:1: ( () )
            // InternalCurlBetterThanHttpie.g:1757:2: ()
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getCommandLineInterfaceAction_0()); 
            // InternalCurlBetterThanHttpie.g:1758:2: ()
            // InternalCurlBetterThanHttpie.g:1758:3: 
            {
            }

             after(grammarAccess.getCommandLineInterfaceAccess().getCommandLineInterfaceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group__0__Impl"


    // $ANTLR start "rule__CommandLineInterface__Group__1"
    // InternalCurlBetterThanHttpie.g:1766:1: rule__CommandLineInterface__Group__1 : rule__CommandLineInterface__Group__1__Impl rule__CommandLineInterface__Group__2 ;
    public final void rule__CommandLineInterface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1770:1: ( rule__CommandLineInterface__Group__1__Impl rule__CommandLineInterface__Group__2 )
            // InternalCurlBetterThanHttpie.g:1771:2: rule__CommandLineInterface__Group__1__Impl rule__CommandLineInterface__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__CommandLineInterface__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandLineInterface__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group__1"


    // $ANTLR start "rule__CommandLineInterface__Group__1__Impl"
    // InternalCurlBetterThanHttpie.g:1778:1: rule__CommandLineInterface__Group__1__Impl : ( RULE_HTTP ) ;
    public final void rule__CommandLineInterface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1782:1: ( ( RULE_HTTP ) )
            // InternalCurlBetterThanHttpie.g:1783:1: ( RULE_HTTP )
            {
            // InternalCurlBetterThanHttpie.g:1783:1: ( RULE_HTTP )
            // InternalCurlBetterThanHttpie.g:1784:2: RULE_HTTP
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getHTTPTerminalRuleCall_1()); 
            match(input,RULE_HTTP,FOLLOW_2); 
             after(grammarAccess.getCommandLineInterfaceAccess().getHTTPTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group__1__Impl"


    // $ANTLR start "rule__CommandLineInterface__Group__2"
    // InternalCurlBetterThanHttpie.g:1793:1: rule__CommandLineInterface__Group__2 : rule__CommandLineInterface__Group__2__Impl rule__CommandLineInterface__Group__3 ;
    public final void rule__CommandLineInterface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1797:1: ( rule__CommandLineInterface__Group__2__Impl rule__CommandLineInterface__Group__3 )
            // InternalCurlBetterThanHttpie.g:1798:2: rule__CommandLineInterface__Group__2__Impl rule__CommandLineInterface__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__CommandLineInterface__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandLineInterface__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group__2"


    // $ANTLR start "rule__CommandLineInterface__Group__2__Impl"
    // InternalCurlBetterThanHttpie.g:1805:1: rule__CommandLineInterface__Group__2__Impl : ( ( rule__CommandLineInterface__Group_2__0 )* ) ;
    public final void rule__CommandLineInterface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1809:1: ( ( ( rule__CommandLineInterface__Group_2__0 )* ) )
            // InternalCurlBetterThanHttpie.g:1810:1: ( ( rule__CommandLineInterface__Group_2__0 )* )
            {
            // InternalCurlBetterThanHttpie.g:1810:1: ( ( rule__CommandLineInterface__Group_2__0 )* )
            // InternalCurlBetterThanHttpie.g:1811:2: ( rule__CommandLineInterface__Group_2__0 )*
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getGroup_2()); 
            // InternalCurlBetterThanHttpie.g:1812:2: ( rule__CommandLineInterface__Group_2__0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_WS) ) {
                    int LA43_1 = input.LA(2);

                    if ( ((LA43_1>=19 && LA43_1<=26)||(LA43_1>=28 && LA43_1<=29)||(LA43_1>=31 && LA43_1<=36)||LA43_1==44||(LA43_1>=46 && LA43_1<=47)) ) {
                        alt43=1;
                    }


                }


                switch (alt43) {
            	case 1 :
            	    // InternalCurlBetterThanHttpie.g:1812:3: rule__CommandLineInterface__Group_2__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__CommandLineInterface__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

             after(grammarAccess.getCommandLineInterfaceAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group__2__Impl"


    // $ANTLR start "rule__CommandLineInterface__Group__3"
    // InternalCurlBetterThanHttpie.g:1820:1: rule__CommandLineInterface__Group__3 : rule__CommandLineInterface__Group__3__Impl rule__CommandLineInterface__Group__4 ;
    public final void rule__CommandLineInterface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1824:1: ( rule__CommandLineInterface__Group__3__Impl rule__CommandLineInterface__Group__4 )
            // InternalCurlBetterThanHttpie.g:1825:2: rule__CommandLineInterface__Group__3__Impl rule__CommandLineInterface__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__CommandLineInterface__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandLineInterface__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group__3"


    // $ANTLR start "rule__CommandLineInterface__Group__3__Impl"
    // InternalCurlBetterThanHttpie.g:1832:1: rule__CommandLineInterface__Group__3__Impl : ( ( rule__CommandLineInterface__Group_3__0 )? ) ;
    public final void rule__CommandLineInterface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1836:1: ( ( ( rule__CommandLineInterface__Group_3__0 )? ) )
            // InternalCurlBetterThanHttpie.g:1837:1: ( ( rule__CommandLineInterface__Group_3__0 )? )
            {
            // InternalCurlBetterThanHttpie.g:1837:1: ( ( rule__CommandLineInterface__Group_3__0 )? )
            // InternalCurlBetterThanHttpie.g:1838:2: ( rule__CommandLineInterface__Group_3__0 )?
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getGroup_3()); 
            // InternalCurlBetterThanHttpie.g:1839:2: ( rule__CommandLineInterface__Group_3__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_WS) ) {
                int LA44_1 = input.LA(2);

                if ( ((LA44_1>=37 && LA44_1<=40)) ) {
                    alt44=1;
                }
            }
            switch (alt44) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1839:3: rule__CommandLineInterface__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CommandLineInterface__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCommandLineInterfaceAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group__3__Impl"


    // $ANTLR start "rule__CommandLineInterface__Group__4"
    // InternalCurlBetterThanHttpie.g:1847:1: rule__CommandLineInterface__Group__4 : rule__CommandLineInterface__Group__4__Impl rule__CommandLineInterface__Group__5 ;
    public final void rule__CommandLineInterface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1851:1: ( rule__CommandLineInterface__Group__4__Impl rule__CommandLineInterface__Group__5 )
            // InternalCurlBetterThanHttpie.g:1852:2: rule__CommandLineInterface__Group__4__Impl rule__CommandLineInterface__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__CommandLineInterface__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandLineInterface__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group__4"


    // $ANTLR start "rule__CommandLineInterface__Group__4__Impl"
    // InternalCurlBetterThanHttpie.g:1859:1: rule__CommandLineInterface__Group__4__Impl : ( RULE_WS ) ;
    public final void rule__CommandLineInterface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1863:1: ( ( RULE_WS ) )
            // InternalCurlBetterThanHttpie.g:1864:1: ( RULE_WS )
            {
            // InternalCurlBetterThanHttpie.g:1864:1: ( RULE_WS )
            // InternalCurlBetterThanHttpie.g:1865:2: RULE_WS
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getWSTerminalRuleCall_4()); 
            match(input,RULE_WS,FOLLOW_2); 
             after(grammarAccess.getCommandLineInterfaceAccess().getWSTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group__4__Impl"


    // $ANTLR start "rule__CommandLineInterface__Group__5"
    // InternalCurlBetterThanHttpie.g:1874:1: rule__CommandLineInterface__Group__5 : rule__CommandLineInterface__Group__5__Impl rule__CommandLineInterface__Group__6 ;
    public final void rule__CommandLineInterface__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1878:1: ( rule__CommandLineInterface__Group__5__Impl rule__CommandLineInterface__Group__6 )
            // InternalCurlBetterThanHttpie.g:1879:2: rule__CommandLineInterface__Group__5__Impl rule__CommandLineInterface__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__CommandLineInterface__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandLineInterface__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group__5"


    // $ANTLR start "rule__CommandLineInterface__Group__5__Impl"
    // InternalCurlBetterThanHttpie.g:1886:1: rule__CommandLineInterface__Group__5__Impl : ( ( rule__CommandLineInterface__Group_5__0 )? ) ;
    public final void rule__CommandLineInterface__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1890:1: ( ( ( rule__CommandLineInterface__Group_5__0 )? ) )
            // InternalCurlBetterThanHttpie.g:1891:1: ( ( rule__CommandLineInterface__Group_5__0 )? )
            {
            // InternalCurlBetterThanHttpie.g:1891:1: ( ( rule__CommandLineInterface__Group_5__0 )? )
            // InternalCurlBetterThanHttpie.g:1892:2: ( rule__CommandLineInterface__Group_5__0 )?
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getGroup_5()); 
            // InternalCurlBetterThanHttpie.g:1893:2: ( rule__CommandLineInterface__Group_5__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=RULE_ID && LA45_0<=RULE_HTTP)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1893:3: rule__CommandLineInterface__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CommandLineInterface__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCommandLineInterfaceAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group__5__Impl"


    // $ANTLR start "rule__CommandLineInterface__Group__6"
    // InternalCurlBetterThanHttpie.g:1901:1: rule__CommandLineInterface__Group__6 : rule__CommandLineInterface__Group__6__Impl rule__CommandLineInterface__Group__7 ;
    public final void rule__CommandLineInterface__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1905:1: ( rule__CommandLineInterface__Group__6__Impl rule__CommandLineInterface__Group__7 )
            // InternalCurlBetterThanHttpie.g:1906:2: rule__CommandLineInterface__Group__6__Impl rule__CommandLineInterface__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__CommandLineInterface__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandLineInterface__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group__6"


    // $ANTLR start "rule__CommandLineInterface__Group__6__Impl"
    // InternalCurlBetterThanHttpie.g:1913:1: rule__CommandLineInterface__Group__6__Impl : ( ( rule__CommandLineInterface__Alternatives_6 ) ) ;
    public final void rule__CommandLineInterface__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1917:1: ( ( ( rule__CommandLineInterface__Alternatives_6 ) ) )
            // InternalCurlBetterThanHttpie.g:1918:1: ( ( rule__CommandLineInterface__Alternatives_6 ) )
            {
            // InternalCurlBetterThanHttpie.g:1918:1: ( ( rule__CommandLineInterface__Alternatives_6 ) )
            // InternalCurlBetterThanHttpie.g:1919:2: ( rule__CommandLineInterface__Alternatives_6 )
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getAlternatives_6()); 
            // InternalCurlBetterThanHttpie.g:1920:2: ( rule__CommandLineInterface__Alternatives_6 )
            // InternalCurlBetterThanHttpie.g:1920:3: rule__CommandLineInterface__Alternatives_6
            {
            pushFollow(FOLLOW_2);
            rule__CommandLineInterface__Alternatives_6();

            state._fsp--;


            }

             after(grammarAccess.getCommandLineInterfaceAccess().getAlternatives_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group__6__Impl"


    // $ANTLR start "rule__CommandLineInterface__Group__7"
    // InternalCurlBetterThanHttpie.g:1928:1: rule__CommandLineInterface__Group__7 : rule__CommandLineInterface__Group__7__Impl rule__CommandLineInterface__Group__8 ;
    public final void rule__CommandLineInterface__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1932:1: ( rule__CommandLineInterface__Group__7__Impl rule__CommandLineInterface__Group__8 )
            // InternalCurlBetterThanHttpie.g:1933:2: rule__CommandLineInterface__Group__7__Impl rule__CommandLineInterface__Group__8
            {
            pushFollow(FOLLOW_7);
            rule__CommandLineInterface__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandLineInterface__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group__7"


    // $ANTLR start "rule__CommandLineInterface__Group__7__Impl"
    // InternalCurlBetterThanHttpie.g:1940:1: rule__CommandLineInterface__Group__7__Impl : ( ( rule__CommandLineInterface__Group_7__0 )? ) ;
    public final void rule__CommandLineInterface__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1944:1: ( ( ( rule__CommandLineInterface__Group_7__0 )? ) )
            // InternalCurlBetterThanHttpie.g:1945:1: ( ( rule__CommandLineInterface__Group_7__0 )? )
            {
            // InternalCurlBetterThanHttpie.g:1945:1: ( ( rule__CommandLineInterface__Group_7__0 )? )
            // InternalCurlBetterThanHttpie.g:1946:2: ( rule__CommandLineInterface__Group_7__0 )?
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getGroup_7()); 
            // InternalCurlBetterThanHttpie.g:1947:2: ( rule__CommandLineInterface__Group_7__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==42) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1947:3: rule__CommandLineInterface__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CommandLineInterface__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCommandLineInterfaceAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group__7__Impl"


    // $ANTLR start "rule__CommandLineInterface__Group__8"
    // InternalCurlBetterThanHttpie.g:1955:1: rule__CommandLineInterface__Group__8 : rule__CommandLineInterface__Group__8__Impl rule__CommandLineInterface__Group__9 ;
    public final void rule__CommandLineInterface__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1959:1: ( rule__CommandLineInterface__Group__8__Impl rule__CommandLineInterface__Group__9 )
            // InternalCurlBetterThanHttpie.g:1960:2: rule__CommandLineInterface__Group__8__Impl rule__CommandLineInterface__Group__9
            {
            pushFollow(FOLLOW_7);
            rule__CommandLineInterface__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandLineInterface__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group__8"


    // $ANTLR start "rule__CommandLineInterface__Group__8__Impl"
    // InternalCurlBetterThanHttpie.g:1967:1: rule__CommandLineInterface__Group__8__Impl : ( ( rule__CommandLineInterface__Group_8__0 )? ) ;
    public final void rule__CommandLineInterface__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1971:1: ( ( ( rule__CommandLineInterface__Group_8__0 )? ) )
            // InternalCurlBetterThanHttpie.g:1972:1: ( ( rule__CommandLineInterface__Group_8__0 )? )
            {
            // InternalCurlBetterThanHttpie.g:1972:1: ( ( rule__CommandLineInterface__Group_8__0 )? )
            // InternalCurlBetterThanHttpie.g:1973:2: ( rule__CommandLineInterface__Group_8__0 )?
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getGroup_8()); 
            // InternalCurlBetterThanHttpie.g:1974:2: ( rule__CommandLineInterface__Group_8__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_WS) ) {
                int LA47_1 = input.LA(2);

                if ( (LA47_1==43) ) {
                    alt47=1;
                }
            }
            switch (alt47) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1974:3: rule__CommandLineInterface__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CommandLineInterface__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCommandLineInterfaceAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group__8__Impl"


    // $ANTLR start "rule__CommandLineInterface__Group__9"
    // InternalCurlBetterThanHttpie.g:1982:1: rule__CommandLineInterface__Group__9 : rule__CommandLineInterface__Group__9__Impl ;
    public final void rule__CommandLineInterface__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1986:1: ( rule__CommandLineInterface__Group__9__Impl )
            // InternalCurlBetterThanHttpie.g:1987:2: rule__CommandLineInterface__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CommandLineInterface__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group__9"


    // $ANTLR start "rule__CommandLineInterface__Group__9__Impl"
    // InternalCurlBetterThanHttpie.g:1993:1: rule__CommandLineInterface__Group__9__Impl : ( ( rule__CommandLineInterface__Group_9__0 )* ) ;
    public final void rule__CommandLineInterface__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1997:1: ( ( ( rule__CommandLineInterface__Group_9__0 )* ) )
            // InternalCurlBetterThanHttpie.g:1998:1: ( ( rule__CommandLineInterface__Group_9__0 )* )
            {
            // InternalCurlBetterThanHttpie.g:1998:1: ( ( rule__CommandLineInterface__Group_9__0 )* )
            // InternalCurlBetterThanHttpie.g:1999:2: ( rule__CommandLineInterface__Group_9__0 )*
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getGroup_9()); 
            // InternalCurlBetterThanHttpie.g:2000:2: ( rule__CommandLineInterface__Group_9__0 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==RULE_WS) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalCurlBetterThanHttpie.g:2000:3: rule__CommandLineInterface__Group_9__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__CommandLineInterface__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

             after(grammarAccess.getCommandLineInterfaceAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group__9__Impl"


    // $ANTLR start "rule__CommandLineInterface__Group_2__0"
    // InternalCurlBetterThanHttpie.g:2009:1: rule__CommandLineInterface__Group_2__0 : rule__CommandLineInterface__Group_2__0__Impl rule__CommandLineInterface__Group_2__1 ;
    public final void rule__CommandLineInterface__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2013:1: ( rule__CommandLineInterface__Group_2__0__Impl rule__CommandLineInterface__Group_2__1 )
            // InternalCurlBetterThanHttpie.g:2014:2: rule__CommandLineInterface__Group_2__0__Impl rule__CommandLineInterface__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__CommandLineInterface__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandLineInterface__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group_2__0"


    // $ANTLR start "rule__CommandLineInterface__Group_2__0__Impl"
    // InternalCurlBetterThanHttpie.g:2021:1: rule__CommandLineInterface__Group_2__0__Impl : ( RULE_WS ) ;
    public final void rule__CommandLineInterface__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2025:1: ( ( RULE_WS ) )
            // InternalCurlBetterThanHttpie.g:2026:1: ( RULE_WS )
            {
            // InternalCurlBetterThanHttpie.g:2026:1: ( RULE_WS )
            // InternalCurlBetterThanHttpie.g:2027:2: RULE_WS
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getWSTerminalRuleCall_2_0()); 
            match(input,RULE_WS,FOLLOW_2); 
             after(grammarAccess.getCommandLineInterfaceAccess().getWSTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group_2__0__Impl"


    // $ANTLR start "rule__CommandLineInterface__Group_2__1"
    // InternalCurlBetterThanHttpie.g:2036:1: rule__CommandLineInterface__Group_2__1 : rule__CommandLineInterface__Group_2__1__Impl ;
    public final void rule__CommandLineInterface__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2040:1: ( rule__CommandLineInterface__Group_2__1__Impl )
            // InternalCurlBetterThanHttpie.g:2041:2: rule__CommandLineInterface__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CommandLineInterface__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group_2__1"


    // $ANTLR start "rule__CommandLineInterface__Group_2__1__Impl"
    // InternalCurlBetterThanHttpie.g:2047:1: rule__CommandLineInterface__Group_2__1__Impl : ( ( rule__CommandLineInterface__FlagsAssignment_2_1 ) ) ;
    public final void rule__CommandLineInterface__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2051:1: ( ( ( rule__CommandLineInterface__FlagsAssignment_2_1 ) ) )
            // InternalCurlBetterThanHttpie.g:2052:1: ( ( rule__CommandLineInterface__FlagsAssignment_2_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:2052:1: ( ( rule__CommandLineInterface__FlagsAssignment_2_1 ) )
            // InternalCurlBetterThanHttpie.g:2053:2: ( rule__CommandLineInterface__FlagsAssignment_2_1 )
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getFlagsAssignment_2_1()); 
            // InternalCurlBetterThanHttpie.g:2054:2: ( rule__CommandLineInterface__FlagsAssignment_2_1 )
            // InternalCurlBetterThanHttpie.g:2054:3: rule__CommandLineInterface__FlagsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__CommandLineInterface__FlagsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCommandLineInterfaceAccess().getFlagsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group_2__1__Impl"


    // $ANTLR start "rule__CommandLineInterface__Group_3__0"
    // InternalCurlBetterThanHttpie.g:2063:1: rule__CommandLineInterface__Group_3__0 : rule__CommandLineInterface__Group_3__0__Impl rule__CommandLineInterface__Group_3__1 ;
    public final void rule__CommandLineInterface__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2067:1: ( rule__CommandLineInterface__Group_3__0__Impl rule__CommandLineInterface__Group_3__1 )
            // InternalCurlBetterThanHttpie.g:2068:2: rule__CommandLineInterface__Group_3__0__Impl rule__CommandLineInterface__Group_3__1
            {
            pushFollow(FOLLOW_9);
            rule__CommandLineInterface__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandLineInterface__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group_3__0"


    // $ANTLR start "rule__CommandLineInterface__Group_3__0__Impl"
    // InternalCurlBetterThanHttpie.g:2075:1: rule__CommandLineInterface__Group_3__0__Impl : ( RULE_WS ) ;
    public final void rule__CommandLineInterface__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2079:1: ( ( RULE_WS ) )
            // InternalCurlBetterThanHttpie.g:2080:1: ( RULE_WS )
            {
            // InternalCurlBetterThanHttpie.g:2080:1: ( RULE_WS )
            // InternalCurlBetterThanHttpie.g:2081:2: RULE_WS
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getWSTerminalRuleCall_3_0()); 
            match(input,RULE_WS,FOLLOW_2); 
             after(grammarAccess.getCommandLineInterfaceAccess().getWSTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group_3__0__Impl"


    // $ANTLR start "rule__CommandLineInterface__Group_3__1"
    // InternalCurlBetterThanHttpie.g:2090:1: rule__CommandLineInterface__Group_3__1 : rule__CommandLineInterface__Group_3__1__Impl ;
    public final void rule__CommandLineInterface__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2094:1: ( rule__CommandLineInterface__Group_3__1__Impl )
            // InternalCurlBetterThanHttpie.g:2095:2: rule__CommandLineInterface__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CommandLineInterface__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group_3__1"


    // $ANTLR start "rule__CommandLineInterface__Group_3__1__Impl"
    // InternalCurlBetterThanHttpie.g:2101:1: rule__CommandLineInterface__Group_3__1__Impl : ( ( rule__CommandLineInterface__MethodAssignment_3_1 ) ) ;
    public final void rule__CommandLineInterface__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2105:1: ( ( ( rule__CommandLineInterface__MethodAssignment_3_1 ) ) )
            // InternalCurlBetterThanHttpie.g:2106:1: ( ( rule__CommandLineInterface__MethodAssignment_3_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:2106:1: ( ( rule__CommandLineInterface__MethodAssignment_3_1 ) )
            // InternalCurlBetterThanHttpie.g:2107:2: ( rule__CommandLineInterface__MethodAssignment_3_1 )
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getMethodAssignment_3_1()); 
            // InternalCurlBetterThanHttpie.g:2108:2: ( rule__CommandLineInterface__MethodAssignment_3_1 )
            // InternalCurlBetterThanHttpie.g:2108:3: rule__CommandLineInterface__MethodAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__CommandLineInterface__MethodAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCommandLineInterfaceAccess().getMethodAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group_3__1__Impl"


    // $ANTLR start "rule__CommandLineInterface__Group_5__0"
    // InternalCurlBetterThanHttpie.g:2117:1: rule__CommandLineInterface__Group_5__0 : rule__CommandLineInterface__Group_5__0__Impl rule__CommandLineInterface__Group_5__1 ;
    public final void rule__CommandLineInterface__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2121:1: ( rule__CommandLineInterface__Group_5__0__Impl rule__CommandLineInterface__Group_5__1 )
            // InternalCurlBetterThanHttpie.g:2122:2: rule__CommandLineInterface__Group_5__0__Impl rule__CommandLineInterface__Group_5__1
            {
            pushFollow(FOLLOW_10);
            rule__CommandLineInterface__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandLineInterface__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group_5__0"


    // $ANTLR start "rule__CommandLineInterface__Group_5__0__Impl"
    // InternalCurlBetterThanHttpie.g:2129:1: rule__CommandLineInterface__Group_5__0__Impl : ( ( rule__CommandLineInterface__ProtocolAssignment_5_0 ) ) ;
    public final void rule__CommandLineInterface__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2133:1: ( ( ( rule__CommandLineInterface__ProtocolAssignment_5_0 ) ) )
            // InternalCurlBetterThanHttpie.g:2134:1: ( ( rule__CommandLineInterface__ProtocolAssignment_5_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:2134:1: ( ( rule__CommandLineInterface__ProtocolAssignment_5_0 ) )
            // InternalCurlBetterThanHttpie.g:2135:2: ( rule__CommandLineInterface__ProtocolAssignment_5_0 )
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getProtocolAssignment_5_0()); 
            // InternalCurlBetterThanHttpie.g:2136:2: ( rule__CommandLineInterface__ProtocolAssignment_5_0 )
            // InternalCurlBetterThanHttpie.g:2136:3: rule__CommandLineInterface__ProtocolAssignment_5_0
            {
            pushFollow(FOLLOW_2);
            rule__CommandLineInterface__ProtocolAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getCommandLineInterfaceAccess().getProtocolAssignment_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group_5__0__Impl"


    // $ANTLR start "rule__CommandLineInterface__Group_5__1"
    // InternalCurlBetterThanHttpie.g:2144:1: rule__CommandLineInterface__Group_5__1 : rule__CommandLineInterface__Group_5__1__Impl ;
    public final void rule__CommandLineInterface__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2148:1: ( rule__CommandLineInterface__Group_5__1__Impl )
            // InternalCurlBetterThanHttpie.g:2149:2: rule__CommandLineInterface__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CommandLineInterface__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group_5__1"


    // $ANTLR start "rule__CommandLineInterface__Group_5__1__Impl"
    // InternalCurlBetterThanHttpie.g:2155:1: rule__CommandLineInterface__Group_5__1__Impl : ( '://' ) ;
    public final void rule__CommandLineInterface__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2159:1: ( ( '://' ) )
            // InternalCurlBetterThanHttpie.g:2160:1: ( '://' )
            {
            // InternalCurlBetterThanHttpie.g:2160:1: ( '://' )
            // InternalCurlBetterThanHttpie.g:2161:2: '://'
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getColonSolidusSolidusKeyword_5_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getCommandLineInterfaceAccess().getColonSolidusSolidusKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group_5__1__Impl"


    // $ANTLR start "rule__CommandLineInterface__Group_6_0__0"
    // InternalCurlBetterThanHttpie.g:2171:1: rule__CommandLineInterface__Group_6_0__0 : rule__CommandLineInterface__Group_6_0__0__Impl rule__CommandLineInterface__Group_6_0__1 ;
    public final void rule__CommandLineInterface__Group_6_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2175:1: ( rule__CommandLineInterface__Group_6_0__0__Impl rule__CommandLineInterface__Group_6_0__1 )
            // InternalCurlBetterThanHttpie.g:2176:2: rule__CommandLineInterface__Group_6_0__0__Impl rule__CommandLineInterface__Group_6_0__1
            {
            pushFollow(FOLLOW_11);
            rule__CommandLineInterface__Group_6_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandLineInterface__Group_6_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group_6_0__0"


    // $ANTLR start "rule__CommandLineInterface__Group_6_0__0__Impl"
    // InternalCurlBetterThanHttpie.g:2183:1: rule__CommandLineInterface__Group_6_0__0__Impl : ( ( rule__CommandLineInterface__UrlAssignment_6_0_0 ) ) ;
    public final void rule__CommandLineInterface__Group_6_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2187:1: ( ( ( rule__CommandLineInterface__UrlAssignment_6_0_0 ) ) )
            // InternalCurlBetterThanHttpie.g:2188:1: ( ( rule__CommandLineInterface__UrlAssignment_6_0_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:2188:1: ( ( rule__CommandLineInterface__UrlAssignment_6_0_0 ) )
            // InternalCurlBetterThanHttpie.g:2189:2: ( rule__CommandLineInterface__UrlAssignment_6_0_0 )
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getUrlAssignment_6_0_0()); 
            // InternalCurlBetterThanHttpie.g:2190:2: ( rule__CommandLineInterface__UrlAssignment_6_0_0 )
            // InternalCurlBetterThanHttpie.g:2190:3: rule__CommandLineInterface__UrlAssignment_6_0_0
            {
            pushFollow(FOLLOW_2);
            rule__CommandLineInterface__UrlAssignment_6_0_0();

            state._fsp--;


            }

             after(grammarAccess.getCommandLineInterfaceAccess().getUrlAssignment_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group_6_0__0__Impl"


    // $ANTLR start "rule__CommandLineInterface__Group_6_0__1"
    // InternalCurlBetterThanHttpie.g:2198:1: rule__CommandLineInterface__Group_6_0__1 : rule__CommandLineInterface__Group_6_0__1__Impl ;
    public final void rule__CommandLineInterface__Group_6_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2202:1: ( rule__CommandLineInterface__Group_6_0__1__Impl )
            // InternalCurlBetterThanHttpie.g:2203:2: rule__CommandLineInterface__Group_6_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CommandLineInterface__Group_6_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group_6_0__1"


    // $ANTLR start "rule__CommandLineInterface__Group_6_0__1__Impl"
    // InternalCurlBetterThanHttpie.g:2209:1: rule__CommandLineInterface__Group_6_0__1__Impl : ( ( rule__CommandLineInterface__Group_6_0_1__0 )? ) ;
    public final void rule__CommandLineInterface__Group_6_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2213:1: ( ( ( rule__CommandLineInterface__Group_6_0_1__0 )? ) )
            // InternalCurlBetterThanHttpie.g:2214:1: ( ( rule__CommandLineInterface__Group_6_0_1__0 )? )
            {
            // InternalCurlBetterThanHttpie.g:2214:1: ( ( rule__CommandLineInterface__Group_6_0_1__0 )? )
            // InternalCurlBetterThanHttpie.g:2215:2: ( rule__CommandLineInterface__Group_6_0_1__0 )?
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getGroup_6_0_1()); 
            // InternalCurlBetterThanHttpie.g:2216:2: ( rule__CommandLineInterface__Group_6_0_1__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==30) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:2216:3: rule__CommandLineInterface__Group_6_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CommandLineInterface__Group_6_0_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCommandLineInterfaceAccess().getGroup_6_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group_6_0__1__Impl"


    // $ANTLR start "rule__CommandLineInterface__Group_6_0_1__0"
    // InternalCurlBetterThanHttpie.g:2225:1: rule__CommandLineInterface__Group_6_0_1__0 : rule__CommandLineInterface__Group_6_0_1__0__Impl rule__CommandLineInterface__Group_6_0_1__1 ;
    public final void rule__CommandLineInterface__Group_6_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2229:1: ( rule__CommandLineInterface__Group_6_0_1__0__Impl rule__CommandLineInterface__Group_6_0_1__1 )
            // InternalCurlBetterThanHttpie.g:2230:2: rule__CommandLineInterface__Group_6_0_1__0__Impl rule__CommandLineInterface__Group_6_0_1__1
            {
            pushFollow(FOLLOW_12);
            rule__CommandLineInterface__Group_6_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandLineInterface__Group_6_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group_6_0_1__0"


    // $ANTLR start "rule__CommandLineInterface__Group_6_0_1__0__Impl"
    // InternalCurlBetterThanHttpie.g:2237:1: rule__CommandLineInterface__Group_6_0_1__0__Impl : ( ':' ) ;
    public final void rule__CommandLineInterface__Group_6_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2241:1: ( ( ':' ) )
            // InternalCurlBetterThanHttpie.g:2242:1: ( ':' )
            {
            // InternalCurlBetterThanHttpie.g:2242:1: ( ':' )
            // InternalCurlBetterThanHttpie.g:2243:2: ':'
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getColonKeyword_6_0_1_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getCommandLineInterfaceAccess().getColonKeyword_6_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group_6_0_1__0__Impl"


    // $ANTLR start "rule__CommandLineInterface__Group_6_0_1__1"
    // InternalCurlBetterThanHttpie.g:2252:1: rule__CommandLineInterface__Group_6_0_1__1 : rule__CommandLineInterface__Group_6_0_1__1__Impl ;
    public final void rule__CommandLineInterface__Group_6_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2256:1: ( rule__CommandLineInterface__Group_6_0_1__1__Impl )
            // InternalCurlBetterThanHttpie.g:2257:2: rule__CommandLineInterface__Group_6_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CommandLineInterface__Group_6_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group_6_0_1__1"


    // $ANTLR start "rule__CommandLineInterface__Group_6_0_1__1__Impl"
    // InternalCurlBetterThanHttpie.g:2263:1: rule__CommandLineInterface__Group_6_0_1__1__Impl : ( ( rule__CommandLineInterface__PortAssignment_6_0_1_1 ) ) ;
    public final void rule__CommandLineInterface__Group_6_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2267:1: ( ( ( rule__CommandLineInterface__PortAssignment_6_0_1_1 ) ) )
            // InternalCurlBetterThanHttpie.g:2268:1: ( ( rule__CommandLineInterface__PortAssignment_6_0_1_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:2268:1: ( ( rule__CommandLineInterface__PortAssignment_6_0_1_1 ) )
            // InternalCurlBetterThanHttpie.g:2269:2: ( rule__CommandLineInterface__PortAssignment_6_0_1_1 )
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getPortAssignment_6_0_1_1()); 
            // InternalCurlBetterThanHttpie.g:2270:2: ( rule__CommandLineInterface__PortAssignment_6_0_1_1 )
            // InternalCurlBetterThanHttpie.g:2270:3: rule__CommandLineInterface__PortAssignment_6_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__CommandLineInterface__PortAssignment_6_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCommandLineInterfaceAccess().getPortAssignment_6_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group_6_0_1__1__Impl"


    // $ANTLR start "rule__CommandLineInterface__Group_6_1__0"
    // InternalCurlBetterThanHttpie.g:2279:1: rule__CommandLineInterface__Group_6_1__0 : rule__CommandLineInterface__Group_6_1__0__Impl rule__CommandLineInterface__Group_6_1__1 ;
    public final void rule__CommandLineInterface__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2283:1: ( rule__CommandLineInterface__Group_6_1__0__Impl rule__CommandLineInterface__Group_6_1__1 )
            // InternalCurlBetterThanHttpie.g:2284:2: rule__CommandLineInterface__Group_6_1__0__Impl rule__CommandLineInterface__Group_6_1__1
            {
            pushFollow(FOLLOW_12);
            rule__CommandLineInterface__Group_6_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandLineInterface__Group_6_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group_6_1__0"


    // $ANTLR start "rule__CommandLineInterface__Group_6_1__0__Impl"
    // InternalCurlBetterThanHttpie.g:2291:1: rule__CommandLineInterface__Group_6_1__0__Impl : ( ':' ) ;
    public final void rule__CommandLineInterface__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2295:1: ( ( ':' ) )
            // InternalCurlBetterThanHttpie.g:2296:1: ( ':' )
            {
            // InternalCurlBetterThanHttpie.g:2296:1: ( ':' )
            // InternalCurlBetterThanHttpie.g:2297:2: ':'
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getColonKeyword_6_1_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getCommandLineInterfaceAccess().getColonKeyword_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group_6_1__0__Impl"


    // $ANTLR start "rule__CommandLineInterface__Group_6_1__1"
    // InternalCurlBetterThanHttpie.g:2306:1: rule__CommandLineInterface__Group_6_1__1 : rule__CommandLineInterface__Group_6_1__1__Impl ;
    public final void rule__CommandLineInterface__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2310:1: ( rule__CommandLineInterface__Group_6_1__1__Impl )
            // InternalCurlBetterThanHttpie.g:2311:2: rule__CommandLineInterface__Group_6_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CommandLineInterface__Group_6_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group_6_1__1"


    // $ANTLR start "rule__CommandLineInterface__Group_6_1__1__Impl"
    // InternalCurlBetterThanHttpie.g:2317:1: rule__CommandLineInterface__Group_6_1__1__Impl : ( ( rule__CommandLineInterface__PortAssignment_6_1_1 )? ) ;
    public final void rule__CommandLineInterface__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2321:1: ( ( ( rule__CommandLineInterface__PortAssignment_6_1_1 )? ) )
            // InternalCurlBetterThanHttpie.g:2322:1: ( ( rule__CommandLineInterface__PortAssignment_6_1_1 )? )
            {
            // InternalCurlBetterThanHttpie.g:2322:1: ( ( rule__CommandLineInterface__PortAssignment_6_1_1 )? )
            // InternalCurlBetterThanHttpie.g:2323:2: ( rule__CommandLineInterface__PortAssignment_6_1_1 )?
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getPortAssignment_6_1_1()); 
            // InternalCurlBetterThanHttpie.g:2324:2: ( rule__CommandLineInterface__PortAssignment_6_1_1 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_INT) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:2324:3: rule__CommandLineInterface__PortAssignment_6_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__CommandLineInterface__PortAssignment_6_1_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCommandLineInterfaceAccess().getPortAssignment_6_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group_6_1__1__Impl"


    // $ANTLR start "rule__CommandLineInterface__Group_7__0"
    // InternalCurlBetterThanHttpie.g:2333:1: rule__CommandLineInterface__Group_7__0 : rule__CommandLineInterface__Group_7__0__Impl rule__CommandLineInterface__Group_7__1 ;
    public final void rule__CommandLineInterface__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2337:1: ( rule__CommandLineInterface__Group_7__0__Impl rule__CommandLineInterface__Group_7__1 )
            // InternalCurlBetterThanHttpie.g:2338:2: rule__CommandLineInterface__Group_7__0__Impl rule__CommandLineInterface__Group_7__1
            {
            pushFollow(FOLLOW_13);
            rule__CommandLineInterface__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandLineInterface__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group_7__0"


    // $ANTLR start "rule__CommandLineInterface__Group_7__0__Impl"
    // InternalCurlBetterThanHttpie.g:2345:1: rule__CommandLineInterface__Group_7__0__Impl : ( '/' ) ;
    public final void rule__CommandLineInterface__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2349:1: ( ( '/' ) )
            // InternalCurlBetterThanHttpie.g:2350:1: ( '/' )
            {
            // InternalCurlBetterThanHttpie.g:2350:1: ( '/' )
            // InternalCurlBetterThanHttpie.g:2351:2: '/'
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getSolidusKeyword_7_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getCommandLineInterfaceAccess().getSolidusKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group_7__0__Impl"


    // $ANTLR start "rule__CommandLineInterface__Group_7__1"
    // InternalCurlBetterThanHttpie.g:2360:1: rule__CommandLineInterface__Group_7__1 : rule__CommandLineInterface__Group_7__1__Impl ;
    public final void rule__CommandLineInterface__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2364:1: ( rule__CommandLineInterface__Group_7__1__Impl )
            // InternalCurlBetterThanHttpie.g:2365:2: rule__CommandLineInterface__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CommandLineInterface__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group_7__1"


    // $ANTLR start "rule__CommandLineInterface__Group_7__1__Impl"
    // InternalCurlBetterThanHttpie.g:2371:1: rule__CommandLineInterface__Group_7__1__Impl : ( ( rule__CommandLineInterface__ResourceAssignment_7_1 ) ) ;
    public final void rule__CommandLineInterface__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2375:1: ( ( ( rule__CommandLineInterface__ResourceAssignment_7_1 ) ) )
            // InternalCurlBetterThanHttpie.g:2376:1: ( ( rule__CommandLineInterface__ResourceAssignment_7_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:2376:1: ( ( rule__CommandLineInterface__ResourceAssignment_7_1 ) )
            // InternalCurlBetterThanHttpie.g:2377:2: ( rule__CommandLineInterface__ResourceAssignment_7_1 )
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getResourceAssignment_7_1()); 
            // InternalCurlBetterThanHttpie.g:2378:2: ( rule__CommandLineInterface__ResourceAssignment_7_1 )
            // InternalCurlBetterThanHttpie.g:2378:3: rule__CommandLineInterface__ResourceAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__CommandLineInterface__ResourceAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getCommandLineInterfaceAccess().getResourceAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group_7__1__Impl"


    // $ANTLR start "rule__CommandLineInterface__Group_8__0"
    // InternalCurlBetterThanHttpie.g:2387:1: rule__CommandLineInterface__Group_8__0 : rule__CommandLineInterface__Group_8__0__Impl rule__CommandLineInterface__Group_8__1 ;
    public final void rule__CommandLineInterface__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2391:1: ( rule__CommandLineInterface__Group_8__0__Impl rule__CommandLineInterface__Group_8__1 )
            // InternalCurlBetterThanHttpie.g:2392:2: rule__CommandLineInterface__Group_8__0__Impl rule__CommandLineInterface__Group_8__1
            {
            pushFollow(FOLLOW_14);
            rule__CommandLineInterface__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandLineInterface__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group_8__0"


    // $ANTLR start "rule__CommandLineInterface__Group_8__0__Impl"
    // InternalCurlBetterThanHttpie.g:2399:1: rule__CommandLineInterface__Group_8__0__Impl : ( RULE_WS ) ;
    public final void rule__CommandLineInterface__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2403:1: ( ( RULE_WS ) )
            // InternalCurlBetterThanHttpie.g:2404:1: ( RULE_WS )
            {
            // InternalCurlBetterThanHttpie.g:2404:1: ( RULE_WS )
            // InternalCurlBetterThanHttpie.g:2405:2: RULE_WS
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getWSTerminalRuleCall_8_0()); 
            match(input,RULE_WS,FOLLOW_2); 
             after(grammarAccess.getCommandLineInterfaceAccess().getWSTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group_8__0__Impl"


    // $ANTLR start "rule__CommandLineInterface__Group_8__1"
    // InternalCurlBetterThanHttpie.g:2414:1: rule__CommandLineInterface__Group_8__1 : rule__CommandLineInterface__Group_8__1__Impl ;
    public final void rule__CommandLineInterface__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2418:1: ( rule__CommandLineInterface__Group_8__1__Impl )
            // InternalCurlBetterThanHttpie.g:2419:2: rule__CommandLineInterface__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CommandLineInterface__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group_8__1"


    // $ANTLR start "rule__CommandLineInterface__Group_8__1__Impl"
    // InternalCurlBetterThanHttpie.g:2425:1: rule__CommandLineInterface__Group_8__1__Impl : ( '--' ) ;
    public final void rule__CommandLineInterface__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2429:1: ( ( '--' ) )
            // InternalCurlBetterThanHttpie.g:2430:1: ( '--' )
            {
            // InternalCurlBetterThanHttpie.g:2430:1: ( '--' )
            // InternalCurlBetterThanHttpie.g:2431:2: '--'
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getHyphenMinusHyphenMinusKeyword_8_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getCommandLineInterfaceAccess().getHyphenMinusHyphenMinusKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group_8__1__Impl"


    // $ANTLR start "rule__CommandLineInterface__Group_9__0"
    // InternalCurlBetterThanHttpie.g:2441:1: rule__CommandLineInterface__Group_9__0 : rule__CommandLineInterface__Group_9__0__Impl rule__CommandLineInterface__Group_9__1 ;
    public final void rule__CommandLineInterface__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2445:1: ( rule__CommandLineInterface__Group_9__0__Impl rule__CommandLineInterface__Group_9__1 )
            // InternalCurlBetterThanHttpie.g:2446:2: rule__CommandLineInterface__Group_9__0__Impl rule__CommandLineInterface__Group_9__1
            {
            pushFollow(FOLLOW_13);
            rule__CommandLineInterface__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandLineInterface__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group_9__0"


    // $ANTLR start "rule__CommandLineInterface__Group_9__0__Impl"
    // InternalCurlBetterThanHttpie.g:2453:1: rule__CommandLineInterface__Group_9__0__Impl : ( RULE_WS ) ;
    public final void rule__CommandLineInterface__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2457:1: ( ( RULE_WS ) )
            // InternalCurlBetterThanHttpie.g:2458:1: ( RULE_WS )
            {
            // InternalCurlBetterThanHttpie.g:2458:1: ( RULE_WS )
            // InternalCurlBetterThanHttpie.g:2459:2: RULE_WS
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getWSTerminalRuleCall_9_0()); 
            match(input,RULE_WS,FOLLOW_2); 
             after(grammarAccess.getCommandLineInterfaceAccess().getWSTerminalRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group_9__0__Impl"


    // $ANTLR start "rule__CommandLineInterface__Group_9__1"
    // InternalCurlBetterThanHttpie.g:2468:1: rule__CommandLineInterface__Group_9__1 : rule__CommandLineInterface__Group_9__1__Impl ;
    public final void rule__CommandLineInterface__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2472:1: ( rule__CommandLineInterface__Group_9__1__Impl )
            // InternalCurlBetterThanHttpie.g:2473:2: rule__CommandLineInterface__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CommandLineInterface__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group_9__1"


    // $ANTLR start "rule__CommandLineInterface__Group_9__1__Impl"
    // InternalCurlBetterThanHttpie.g:2479:1: rule__CommandLineInterface__Group_9__1__Impl : ( ( rule__CommandLineInterface__ItemsAssignment_9_1 ) ) ;
    public final void rule__CommandLineInterface__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2483:1: ( ( ( rule__CommandLineInterface__ItemsAssignment_9_1 ) ) )
            // InternalCurlBetterThanHttpie.g:2484:1: ( ( rule__CommandLineInterface__ItemsAssignment_9_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:2484:1: ( ( rule__CommandLineInterface__ItemsAssignment_9_1 ) )
            // InternalCurlBetterThanHttpie.g:2485:2: ( rule__CommandLineInterface__ItemsAssignment_9_1 )
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getItemsAssignment_9_1()); 
            // InternalCurlBetterThanHttpie.g:2486:2: ( rule__CommandLineInterface__ItemsAssignment_9_1 )
            // InternalCurlBetterThanHttpie.g:2486:3: rule__CommandLineInterface__ItemsAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__CommandLineInterface__ItemsAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getCommandLineInterfaceAccess().getItemsAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group_9__1__Impl"


    // $ANTLR start "rule__HeadersFlag__Group__0"
    // InternalCurlBetterThanHttpie.g:2495:1: rule__HeadersFlag__Group__0 : rule__HeadersFlag__Group__0__Impl rule__HeadersFlag__Group__1 ;
    public final void rule__HeadersFlag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2499:1: ( rule__HeadersFlag__Group__0__Impl rule__HeadersFlag__Group__1 )
            // InternalCurlBetterThanHttpie.g:2500:2: rule__HeadersFlag__Group__0__Impl rule__HeadersFlag__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__HeadersFlag__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HeadersFlag__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HeadersFlag__Group__0"


    // $ANTLR start "rule__HeadersFlag__Group__0__Impl"
    // InternalCurlBetterThanHttpie.g:2507:1: rule__HeadersFlag__Group__0__Impl : ( () ) ;
    public final void rule__HeadersFlag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2511:1: ( ( () ) )
            // InternalCurlBetterThanHttpie.g:2512:1: ( () )
            {
            // InternalCurlBetterThanHttpie.g:2512:1: ( () )
            // InternalCurlBetterThanHttpie.g:2513:2: ()
            {
             before(grammarAccess.getHeadersFlagAccess().getHeadersFlagAction_0()); 
            // InternalCurlBetterThanHttpie.g:2514:2: ()
            // InternalCurlBetterThanHttpie.g:2514:3: 
            {
            }

             after(grammarAccess.getHeadersFlagAccess().getHeadersFlagAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HeadersFlag__Group__0__Impl"


    // $ANTLR start "rule__HeadersFlag__Group__1"
    // InternalCurlBetterThanHttpie.g:2522:1: rule__HeadersFlag__Group__1 : rule__HeadersFlag__Group__1__Impl ;
    public final void rule__HeadersFlag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2526:1: ( rule__HeadersFlag__Group__1__Impl )
            // InternalCurlBetterThanHttpie.g:2527:2: rule__HeadersFlag__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HeadersFlag__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HeadersFlag__Group__1"


    // $ANTLR start "rule__HeadersFlag__Group__1__Impl"
    // InternalCurlBetterThanHttpie.g:2533:1: rule__HeadersFlag__Group__1__Impl : ( ( rule__HeadersFlag__Alternatives_1 ) ) ;
    public final void rule__HeadersFlag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2537:1: ( ( ( rule__HeadersFlag__Alternatives_1 ) ) )
            // InternalCurlBetterThanHttpie.g:2538:1: ( ( rule__HeadersFlag__Alternatives_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:2538:1: ( ( rule__HeadersFlag__Alternatives_1 ) )
            // InternalCurlBetterThanHttpie.g:2539:2: ( rule__HeadersFlag__Alternatives_1 )
            {
             before(grammarAccess.getHeadersFlagAccess().getAlternatives_1()); 
            // InternalCurlBetterThanHttpie.g:2540:2: ( rule__HeadersFlag__Alternatives_1 )
            // InternalCurlBetterThanHttpie.g:2540:3: rule__HeadersFlag__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__HeadersFlag__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getHeadersFlagAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HeadersFlag__Group__1__Impl"


    // $ANTLR start "rule__BodyFlag__Group__0"
    // InternalCurlBetterThanHttpie.g:2549:1: rule__BodyFlag__Group__0 : rule__BodyFlag__Group__0__Impl rule__BodyFlag__Group__1 ;
    public final void rule__BodyFlag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2553:1: ( rule__BodyFlag__Group__0__Impl rule__BodyFlag__Group__1 )
            // InternalCurlBetterThanHttpie.g:2554:2: rule__BodyFlag__Group__0__Impl rule__BodyFlag__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__BodyFlag__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BodyFlag__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BodyFlag__Group__0"


    // $ANTLR start "rule__BodyFlag__Group__0__Impl"
    // InternalCurlBetterThanHttpie.g:2561:1: rule__BodyFlag__Group__0__Impl : ( () ) ;
    public final void rule__BodyFlag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2565:1: ( ( () ) )
            // InternalCurlBetterThanHttpie.g:2566:1: ( () )
            {
            // InternalCurlBetterThanHttpie.g:2566:1: ( () )
            // InternalCurlBetterThanHttpie.g:2567:2: ()
            {
             before(grammarAccess.getBodyFlagAccess().getBodyFlagAction_0()); 
            // InternalCurlBetterThanHttpie.g:2568:2: ()
            // InternalCurlBetterThanHttpie.g:2568:3: 
            {
            }

             after(grammarAccess.getBodyFlagAccess().getBodyFlagAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BodyFlag__Group__0__Impl"


    // $ANTLR start "rule__BodyFlag__Group__1"
    // InternalCurlBetterThanHttpie.g:2576:1: rule__BodyFlag__Group__1 : rule__BodyFlag__Group__1__Impl ;
    public final void rule__BodyFlag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2580:1: ( rule__BodyFlag__Group__1__Impl )
            // InternalCurlBetterThanHttpie.g:2581:2: rule__BodyFlag__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BodyFlag__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BodyFlag__Group__1"


    // $ANTLR start "rule__BodyFlag__Group__1__Impl"
    // InternalCurlBetterThanHttpie.g:2587:1: rule__BodyFlag__Group__1__Impl : ( ( rule__BodyFlag__Alternatives_1 ) ) ;
    public final void rule__BodyFlag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2591:1: ( ( ( rule__BodyFlag__Alternatives_1 ) ) )
            // InternalCurlBetterThanHttpie.g:2592:1: ( ( rule__BodyFlag__Alternatives_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:2592:1: ( ( rule__BodyFlag__Alternatives_1 ) )
            // InternalCurlBetterThanHttpie.g:2593:2: ( rule__BodyFlag__Alternatives_1 )
            {
             before(grammarAccess.getBodyFlagAccess().getAlternatives_1()); 
            // InternalCurlBetterThanHttpie.g:2594:2: ( rule__BodyFlag__Alternatives_1 )
            // InternalCurlBetterThanHttpie.g:2594:3: rule__BodyFlag__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__BodyFlag__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getBodyFlagAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BodyFlag__Group__1__Impl"


    // $ANTLR start "rule__JsonFlag__Group__0"
    // InternalCurlBetterThanHttpie.g:2603:1: rule__JsonFlag__Group__0 : rule__JsonFlag__Group__0__Impl rule__JsonFlag__Group__1 ;
    public final void rule__JsonFlag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2607:1: ( rule__JsonFlag__Group__0__Impl rule__JsonFlag__Group__1 )
            // InternalCurlBetterThanHttpie.g:2608:2: rule__JsonFlag__Group__0__Impl rule__JsonFlag__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__JsonFlag__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JsonFlag__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonFlag__Group__0"


    // $ANTLR start "rule__JsonFlag__Group__0__Impl"
    // InternalCurlBetterThanHttpie.g:2615:1: rule__JsonFlag__Group__0__Impl : ( () ) ;
    public final void rule__JsonFlag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2619:1: ( ( () ) )
            // InternalCurlBetterThanHttpie.g:2620:1: ( () )
            {
            // InternalCurlBetterThanHttpie.g:2620:1: ( () )
            // InternalCurlBetterThanHttpie.g:2621:2: ()
            {
             before(grammarAccess.getJsonFlagAccess().getJsonFlagAction_0()); 
            // InternalCurlBetterThanHttpie.g:2622:2: ()
            // InternalCurlBetterThanHttpie.g:2622:3: 
            {
            }

             after(grammarAccess.getJsonFlagAccess().getJsonFlagAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonFlag__Group__0__Impl"


    // $ANTLR start "rule__JsonFlag__Group__1"
    // InternalCurlBetterThanHttpie.g:2630:1: rule__JsonFlag__Group__1 : rule__JsonFlag__Group__1__Impl ;
    public final void rule__JsonFlag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2634:1: ( rule__JsonFlag__Group__1__Impl )
            // InternalCurlBetterThanHttpie.g:2635:2: rule__JsonFlag__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JsonFlag__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonFlag__Group__1"


    // $ANTLR start "rule__JsonFlag__Group__1__Impl"
    // InternalCurlBetterThanHttpie.g:2641:1: rule__JsonFlag__Group__1__Impl : ( ( rule__JsonFlag__Alternatives_1 ) ) ;
    public final void rule__JsonFlag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2645:1: ( ( ( rule__JsonFlag__Alternatives_1 ) ) )
            // InternalCurlBetterThanHttpie.g:2646:1: ( ( rule__JsonFlag__Alternatives_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:2646:1: ( ( rule__JsonFlag__Alternatives_1 ) )
            // InternalCurlBetterThanHttpie.g:2647:2: ( rule__JsonFlag__Alternatives_1 )
            {
             before(grammarAccess.getJsonFlagAccess().getAlternatives_1()); 
            // InternalCurlBetterThanHttpie.g:2648:2: ( rule__JsonFlag__Alternatives_1 )
            // InternalCurlBetterThanHttpie.g:2648:3: rule__JsonFlag__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__JsonFlag__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getJsonFlagAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonFlag__Group__1__Impl"


    // $ANTLR start "rule__FormFlag__Group__0"
    // InternalCurlBetterThanHttpie.g:2657:1: rule__FormFlag__Group__0 : rule__FormFlag__Group__0__Impl rule__FormFlag__Group__1 ;
    public final void rule__FormFlag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2661:1: ( rule__FormFlag__Group__0__Impl rule__FormFlag__Group__1 )
            // InternalCurlBetterThanHttpie.g:2662:2: rule__FormFlag__Group__0__Impl rule__FormFlag__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__FormFlag__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormFlag__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormFlag__Group__0"


    // $ANTLR start "rule__FormFlag__Group__0__Impl"
    // InternalCurlBetterThanHttpie.g:2669:1: rule__FormFlag__Group__0__Impl : ( () ) ;
    public final void rule__FormFlag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2673:1: ( ( () ) )
            // InternalCurlBetterThanHttpie.g:2674:1: ( () )
            {
            // InternalCurlBetterThanHttpie.g:2674:1: ( () )
            // InternalCurlBetterThanHttpie.g:2675:2: ()
            {
             before(grammarAccess.getFormFlagAccess().getFormFlagAction_0()); 
            // InternalCurlBetterThanHttpie.g:2676:2: ()
            // InternalCurlBetterThanHttpie.g:2676:3: 
            {
            }

             after(grammarAccess.getFormFlagAccess().getFormFlagAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormFlag__Group__0__Impl"


    // $ANTLR start "rule__FormFlag__Group__1"
    // InternalCurlBetterThanHttpie.g:2684:1: rule__FormFlag__Group__1 : rule__FormFlag__Group__1__Impl ;
    public final void rule__FormFlag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2688:1: ( rule__FormFlag__Group__1__Impl )
            // InternalCurlBetterThanHttpie.g:2689:2: rule__FormFlag__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FormFlag__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormFlag__Group__1"


    // $ANTLR start "rule__FormFlag__Group__1__Impl"
    // InternalCurlBetterThanHttpie.g:2695:1: rule__FormFlag__Group__1__Impl : ( ( rule__FormFlag__Alternatives_1 ) ) ;
    public final void rule__FormFlag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2699:1: ( ( ( rule__FormFlag__Alternatives_1 ) ) )
            // InternalCurlBetterThanHttpie.g:2700:1: ( ( rule__FormFlag__Alternatives_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:2700:1: ( ( rule__FormFlag__Alternatives_1 ) )
            // InternalCurlBetterThanHttpie.g:2701:2: ( rule__FormFlag__Alternatives_1 )
            {
             before(grammarAccess.getFormFlagAccess().getAlternatives_1()); 
            // InternalCurlBetterThanHttpie.g:2702:2: ( rule__FormFlag__Alternatives_1 )
            // InternalCurlBetterThanHttpie.g:2702:3: rule__FormFlag__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__FormFlag__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getFormFlagAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormFlag__Group__1__Impl"


    // $ANTLR start "rule__ProxyFlag__Group__0"
    // InternalCurlBetterThanHttpie.g:2711:1: rule__ProxyFlag__Group__0 : rule__ProxyFlag__Group__0__Impl rule__ProxyFlag__Group__1 ;
    public final void rule__ProxyFlag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2715:1: ( rule__ProxyFlag__Group__0__Impl rule__ProxyFlag__Group__1 )
            // InternalCurlBetterThanHttpie.g:2716:2: rule__ProxyFlag__Group__0__Impl rule__ProxyFlag__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__ProxyFlag__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProxyFlag__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Group__0"


    // $ANTLR start "rule__ProxyFlag__Group__0__Impl"
    // InternalCurlBetterThanHttpie.g:2723:1: rule__ProxyFlag__Group__0__Impl : ( '--proxy' ) ;
    public final void rule__ProxyFlag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2727:1: ( ( '--proxy' ) )
            // InternalCurlBetterThanHttpie.g:2728:1: ( '--proxy' )
            {
            // InternalCurlBetterThanHttpie.g:2728:1: ( '--proxy' )
            // InternalCurlBetterThanHttpie.g:2729:2: '--proxy'
            {
             before(grammarAccess.getProxyFlagAccess().getProxyKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getProxyFlagAccess().getProxyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Group__0__Impl"


    // $ANTLR start "rule__ProxyFlag__Group__1"
    // InternalCurlBetterThanHttpie.g:2738:1: rule__ProxyFlag__Group__1 : rule__ProxyFlag__Group__1__Impl rule__ProxyFlag__Group__2 ;
    public final void rule__ProxyFlag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2742:1: ( rule__ProxyFlag__Group__1__Impl rule__ProxyFlag__Group__2 )
            // InternalCurlBetterThanHttpie.g:2743:2: rule__ProxyFlag__Group__1__Impl rule__ProxyFlag__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__ProxyFlag__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProxyFlag__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Group__1"


    // $ANTLR start "rule__ProxyFlag__Group__1__Impl"
    // InternalCurlBetterThanHttpie.g:2750:1: rule__ProxyFlag__Group__1__Impl : ( ( rule__ProxyFlag__Alternatives_1 ) ) ;
    public final void rule__ProxyFlag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2754:1: ( ( ( rule__ProxyFlag__Alternatives_1 ) ) )
            // InternalCurlBetterThanHttpie.g:2755:1: ( ( rule__ProxyFlag__Alternatives_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:2755:1: ( ( rule__ProxyFlag__Alternatives_1 ) )
            // InternalCurlBetterThanHttpie.g:2756:2: ( rule__ProxyFlag__Alternatives_1 )
            {
             before(grammarAccess.getProxyFlagAccess().getAlternatives_1()); 
            // InternalCurlBetterThanHttpie.g:2757:2: ( rule__ProxyFlag__Alternatives_1 )
            // InternalCurlBetterThanHttpie.g:2757:3: rule__ProxyFlag__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__ProxyFlag__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getProxyFlagAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Group__1__Impl"


    // $ANTLR start "rule__ProxyFlag__Group__2"
    // InternalCurlBetterThanHttpie.g:2765:1: rule__ProxyFlag__Group__2 : rule__ProxyFlag__Group__2__Impl rule__ProxyFlag__Group__3 ;
    public final void rule__ProxyFlag__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2769:1: ( rule__ProxyFlag__Group__2__Impl rule__ProxyFlag__Group__3 )
            // InternalCurlBetterThanHttpie.g:2770:2: rule__ProxyFlag__Group__2__Impl rule__ProxyFlag__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__ProxyFlag__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProxyFlag__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Group__2"


    // $ANTLR start "rule__ProxyFlag__Group__2__Impl"
    // InternalCurlBetterThanHttpie.g:2777:1: rule__ProxyFlag__Group__2__Impl : ( ( rule__ProxyFlag__Alternatives_2 ) ) ;
    public final void rule__ProxyFlag__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2781:1: ( ( ( rule__ProxyFlag__Alternatives_2 ) ) )
            // InternalCurlBetterThanHttpie.g:2782:1: ( ( rule__ProxyFlag__Alternatives_2 ) )
            {
            // InternalCurlBetterThanHttpie.g:2782:1: ( ( rule__ProxyFlag__Alternatives_2 ) )
            // InternalCurlBetterThanHttpie.g:2783:2: ( rule__ProxyFlag__Alternatives_2 )
            {
             before(grammarAccess.getProxyFlagAccess().getAlternatives_2()); 
            // InternalCurlBetterThanHttpie.g:2784:2: ( rule__ProxyFlag__Alternatives_2 )
            // InternalCurlBetterThanHttpie.g:2784:3: rule__ProxyFlag__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__ProxyFlag__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getProxyFlagAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Group__2__Impl"


    // $ANTLR start "rule__ProxyFlag__Group__3"
    // InternalCurlBetterThanHttpie.g:2792:1: rule__ProxyFlag__Group__3 : rule__ProxyFlag__Group__3__Impl rule__ProxyFlag__Group__4 ;
    public final void rule__ProxyFlag__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2796:1: ( rule__ProxyFlag__Group__3__Impl rule__ProxyFlag__Group__4 )
            // InternalCurlBetterThanHttpie.g:2797:2: rule__ProxyFlag__Group__3__Impl rule__ProxyFlag__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__ProxyFlag__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProxyFlag__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Group__3"


    // $ANTLR start "rule__ProxyFlag__Group__3__Impl"
    // InternalCurlBetterThanHttpie.g:2804:1: rule__ProxyFlag__Group__3__Impl : ( ( rule__ProxyFlag__Group_3__0 )? ) ;
    public final void rule__ProxyFlag__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2808:1: ( ( ( rule__ProxyFlag__Group_3__0 )? ) )
            // InternalCurlBetterThanHttpie.g:2809:1: ( ( rule__ProxyFlag__Group_3__0 )? )
            {
            // InternalCurlBetterThanHttpie.g:2809:1: ( ( rule__ProxyFlag__Group_3__0 )? )
            // InternalCurlBetterThanHttpie.g:2810:2: ( rule__ProxyFlag__Group_3__0 )?
            {
             before(grammarAccess.getProxyFlagAccess().getGroup_3()); 
            // InternalCurlBetterThanHttpie.g:2811:2: ( rule__ProxyFlag__Group_3__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=RULE_ID && LA51_0<=RULE_HTTP)) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:2811:3: rule__ProxyFlag__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProxyFlag__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProxyFlagAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Group__3__Impl"


    // $ANTLR start "rule__ProxyFlag__Group__4"
    // InternalCurlBetterThanHttpie.g:2819:1: rule__ProxyFlag__Group__4 : rule__ProxyFlag__Group__4__Impl ;
    public final void rule__ProxyFlag__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2823:1: ( rule__ProxyFlag__Group__4__Impl )
            // InternalCurlBetterThanHttpie.g:2824:2: rule__ProxyFlag__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProxyFlag__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Group__4"


    // $ANTLR start "rule__ProxyFlag__Group__4__Impl"
    // InternalCurlBetterThanHttpie.g:2830:1: rule__ProxyFlag__Group__4__Impl : ( ( rule__ProxyFlag__Alternatives_4 ) ) ;
    public final void rule__ProxyFlag__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2834:1: ( ( ( rule__ProxyFlag__Alternatives_4 ) ) )
            // InternalCurlBetterThanHttpie.g:2835:1: ( ( rule__ProxyFlag__Alternatives_4 ) )
            {
            // InternalCurlBetterThanHttpie.g:2835:1: ( ( rule__ProxyFlag__Alternatives_4 ) )
            // InternalCurlBetterThanHttpie.g:2836:2: ( rule__ProxyFlag__Alternatives_4 )
            {
             before(grammarAccess.getProxyFlagAccess().getAlternatives_4()); 
            // InternalCurlBetterThanHttpie.g:2837:2: ( rule__ProxyFlag__Alternatives_4 )
            // InternalCurlBetterThanHttpie.g:2837:3: rule__ProxyFlag__Alternatives_4
            {
            pushFollow(FOLLOW_2);
            rule__ProxyFlag__Alternatives_4();

            state._fsp--;


            }

             after(grammarAccess.getProxyFlagAccess().getAlternatives_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Group__4__Impl"


    // $ANTLR start "rule__ProxyFlag__Group_2_0__0"
    // InternalCurlBetterThanHttpie.g:2846:1: rule__ProxyFlag__Group_2_0__0 : rule__ProxyFlag__Group_2_0__0__Impl rule__ProxyFlag__Group_2_0__1 ;
    public final void rule__ProxyFlag__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2850:1: ( rule__ProxyFlag__Group_2_0__0__Impl rule__ProxyFlag__Group_2_0__1 )
            // InternalCurlBetterThanHttpie.g:2851:2: rule__ProxyFlag__Group_2_0__0__Impl rule__ProxyFlag__Group_2_0__1
            {
            pushFollow(FOLLOW_11);
            rule__ProxyFlag__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProxyFlag__Group_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Group_2_0__0"


    // $ANTLR start "rule__ProxyFlag__Group_2_0__0__Impl"
    // InternalCurlBetterThanHttpie.g:2858:1: rule__ProxyFlag__Group_2_0__0__Impl : ( ( rule__ProxyFlag__ProtocolAssignment_2_0_0 ) ) ;
    public final void rule__ProxyFlag__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2862:1: ( ( ( rule__ProxyFlag__ProtocolAssignment_2_0_0 ) ) )
            // InternalCurlBetterThanHttpie.g:2863:1: ( ( rule__ProxyFlag__ProtocolAssignment_2_0_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:2863:1: ( ( rule__ProxyFlag__ProtocolAssignment_2_0_0 ) )
            // InternalCurlBetterThanHttpie.g:2864:2: ( rule__ProxyFlag__ProtocolAssignment_2_0_0 )
            {
             before(grammarAccess.getProxyFlagAccess().getProtocolAssignment_2_0_0()); 
            // InternalCurlBetterThanHttpie.g:2865:2: ( rule__ProxyFlag__ProtocolAssignment_2_0_0 )
            // InternalCurlBetterThanHttpie.g:2865:3: rule__ProxyFlag__ProtocolAssignment_2_0_0
            {
            pushFollow(FOLLOW_2);
            rule__ProxyFlag__ProtocolAssignment_2_0_0();

            state._fsp--;


            }

             after(grammarAccess.getProxyFlagAccess().getProtocolAssignment_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Group_2_0__0__Impl"


    // $ANTLR start "rule__ProxyFlag__Group_2_0__1"
    // InternalCurlBetterThanHttpie.g:2873:1: rule__ProxyFlag__Group_2_0__1 : rule__ProxyFlag__Group_2_0__1__Impl ;
    public final void rule__ProxyFlag__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2877:1: ( rule__ProxyFlag__Group_2_0__1__Impl )
            // InternalCurlBetterThanHttpie.g:2878:2: rule__ProxyFlag__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProxyFlag__Group_2_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Group_2_0__1"


    // $ANTLR start "rule__ProxyFlag__Group_2_0__1__Impl"
    // InternalCurlBetterThanHttpie.g:2884:1: rule__ProxyFlag__Group_2_0__1__Impl : ( ':' ) ;
    public final void rule__ProxyFlag__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2888:1: ( ( ':' ) )
            // InternalCurlBetterThanHttpie.g:2889:1: ( ':' )
            {
            // InternalCurlBetterThanHttpie.g:2889:1: ( ':' )
            // InternalCurlBetterThanHttpie.g:2890:2: ':'
            {
             before(grammarAccess.getProxyFlagAccess().getColonKeyword_2_0_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getProxyFlagAccess().getColonKeyword_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Group_2_0__1__Impl"


    // $ANTLR start "rule__ProxyFlag__Group_2_1__0"
    // InternalCurlBetterThanHttpie.g:2900:1: rule__ProxyFlag__Group_2_1__0 : rule__ProxyFlag__Group_2_1__0__Impl rule__ProxyFlag__Group_2_1__1 ;
    public final void rule__ProxyFlag__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2904:1: ( rule__ProxyFlag__Group_2_1__0__Impl rule__ProxyFlag__Group_2_1__1 )
            // InternalCurlBetterThanHttpie.g:2905:2: rule__ProxyFlag__Group_2_1__0__Impl rule__ProxyFlag__Group_2_1__1
            {
            pushFollow(FOLLOW_10);
            rule__ProxyFlag__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProxyFlag__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Group_2_1__0"


    // $ANTLR start "rule__ProxyFlag__Group_2_1__0__Impl"
    // InternalCurlBetterThanHttpie.g:2912:1: rule__ProxyFlag__Group_2_1__0__Impl : ( ( rule__ProxyFlag__ProxyProtocolAssignment_2_1_0 ) ) ;
    public final void rule__ProxyFlag__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2916:1: ( ( ( rule__ProxyFlag__ProxyProtocolAssignment_2_1_0 ) ) )
            // InternalCurlBetterThanHttpie.g:2917:1: ( ( rule__ProxyFlag__ProxyProtocolAssignment_2_1_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:2917:1: ( ( rule__ProxyFlag__ProxyProtocolAssignment_2_1_0 ) )
            // InternalCurlBetterThanHttpie.g:2918:2: ( rule__ProxyFlag__ProxyProtocolAssignment_2_1_0 )
            {
             before(grammarAccess.getProxyFlagAccess().getProxyProtocolAssignment_2_1_0()); 
            // InternalCurlBetterThanHttpie.g:2919:2: ( rule__ProxyFlag__ProxyProtocolAssignment_2_1_0 )
            // InternalCurlBetterThanHttpie.g:2919:3: rule__ProxyFlag__ProxyProtocolAssignment_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ProxyFlag__ProxyProtocolAssignment_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getProxyFlagAccess().getProxyProtocolAssignment_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Group_2_1__0__Impl"


    // $ANTLR start "rule__ProxyFlag__Group_2_1__1"
    // InternalCurlBetterThanHttpie.g:2927:1: rule__ProxyFlag__Group_2_1__1 : rule__ProxyFlag__Group_2_1__1__Impl ;
    public final void rule__ProxyFlag__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2931:1: ( rule__ProxyFlag__Group_2_1__1__Impl )
            // InternalCurlBetterThanHttpie.g:2932:2: rule__ProxyFlag__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProxyFlag__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Group_2_1__1"


    // $ANTLR start "rule__ProxyFlag__Group_2_1__1__Impl"
    // InternalCurlBetterThanHttpie.g:2938:1: rule__ProxyFlag__Group_2_1__1__Impl : ( '://' ) ;
    public final void rule__ProxyFlag__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2942:1: ( ( '://' ) )
            // InternalCurlBetterThanHttpie.g:2943:1: ( '://' )
            {
            // InternalCurlBetterThanHttpie.g:2943:1: ( '://' )
            // InternalCurlBetterThanHttpie.g:2944:2: '://'
            {
             before(grammarAccess.getProxyFlagAccess().getColonSolidusSolidusKeyword_2_1_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getProxyFlagAccess().getColonSolidusSolidusKeyword_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Group_2_1__1__Impl"


    // $ANTLR start "rule__ProxyFlag__Group_2_2__0"
    // InternalCurlBetterThanHttpie.g:2954:1: rule__ProxyFlag__Group_2_2__0 : rule__ProxyFlag__Group_2_2__0__Impl rule__ProxyFlag__Group_2_2__1 ;
    public final void rule__ProxyFlag__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2958:1: ( rule__ProxyFlag__Group_2_2__0__Impl rule__ProxyFlag__Group_2_2__1 )
            // InternalCurlBetterThanHttpie.g:2959:2: rule__ProxyFlag__Group_2_2__0__Impl rule__ProxyFlag__Group_2_2__1
            {
            pushFollow(FOLLOW_11);
            rule__ProxyFlag__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProxyFlag__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Group_2_2__0"


    // $ANTLR start "rule__ProxyFlag__Group_2_2__0__Impl"
    // InternalCurlBetterThanHttpie.g:2966:1: rule__ProxyFlag__Group_2_2__0__Impl : ( ( rule__ProxyFlag__ProtocolAssignment_2_2_0 ) ) ;
    public final void rule__ProxyFlag__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2970:1: ( ( ( rule__ProxyFlag__ProtocolAssignment_2_2_0 ) ) )
            // InternalCurlBetterThanHttpie.g:2971:1: ( ( rule__ProxyFlag__ProtocolAssignment_2_2_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:2971:1: ( ( rule__ProxyFlag__ProtocolAssignment_2_2_0 ) )
            // InternalCurlBetterThanHttpie.g:2972:2: ( rule__ProxyFlag__ProtocolAssignment_2_2_0 )
            {
             before(grammarAccess.getProxyFlagAccess().getProtocolAssignment_2_2_0()); 
            // InternalCurlBetterThanHttpie.g:2973:2: ( rule__ProxyFlag__ProtocolAssignment_2_2_0 )
            // InternalCurlBetterThanHttpie.g:2973:3: rule__ProxyFlag__ProtocolAssignment_2_2_0
            {
            pushFollow(FOLLOW_2);
            rule__ProxyFlag__ProtocolAssignment_2_2_0();

            state._fsp--;


            }

             after(grammarAccess.getProxyFlagAccess().getProtocolAssignment_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Group_2_2__0__Impl"


    // $ANTLR start "rule__ProxyFlag__Group_2_2__1"
    // InternalCurlBetterThanHttpie.g:2981:1: rule__ProxyFlag__Group_2_2__1 : rule__ProxyFlag__Group_2_2__1__Impl rule__ProxyFlag__Group_2_2__2 ;
    public final void rule__ProxyFlag__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2985:1: ( rule__ProxyFlag__Group_2_2__1__Impl rule__ProxyFlag__Group_2_2__2 )
            // InternalCurlBetterThanHttpie.g:2986:2: rule__ProxyFlag__Group_2_2__1__Impl rule__ProxyFlag__Group_2_2__2
            {
            pushFollow(FOLLOW_13);
            rule__ProxyFlag__Group_2_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProxyFlag__Group_2_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Group_2_2__1"


    // $ANTLR start "rule__ProxyFlag__Group_2_2__1__Impl"
    // InternalCurlBetterThanHttpie.g:2993:1: rule__ProxyFlag__Group_2_2__1__Impl : ( ':' ) ;
    public final void rule__ProxyFlag__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2997:1: ( ( ':' ) )
            // InternalCurlBetterThanHttpie.g:2998:1: ( ':' )
            {
            // InternalCurlBetterThanHttpie.g:2998:1: ( ':' )
            // InternalCurlBetterThanHttpie.g:2999:2: ':'
            {
             before(grammarAccess.getProxyFlagAccess().getColonKeyword_2_2_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getProxyFlagAccess().getColonKeyword_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Group_2_2__1__Impl"


    // $ANTLR start "rule__ProxyFlag__Group_2_2__2"
    // InternalCurlBetterThanHttpie.g:3008:1: rule__ProxyFlag__Group_2_2__2 : rule__ProxyFlag__Group_2_2__2__Impl rule__ProxyFlag__Group_2_2__3 ;
    public final void rule__ProxyFlag__Group_2_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3012:1: ( rule__ProxyFlag__Group_2_2__2__Impl rule__ProxyFlag__Group_2_2__3 )
            // InternalCurlBetterThanHttpie.g:3013:2: rule__ProxyFlag__Group_2_2__2__Impl rule__ProxyFlag__Group_2_2__3
            {
            pushFollow(FOLLOW_10);
            rule__ProxyFlag__Group_2_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProxyFlag__Group_2_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Group_2_2__2"


    // $ANTLR start "rule__ProxyFlag__Group_2_2__2__Impl"
    // InternalCurlBetterThanHttpie.g:3020:1: rule__ProxyFlag__Group_2_2__2__Impl : ( ( rule__ProxyFlag__ProxyProtocolAssignment_2_2_2 ) ) ;
    public final void rule__ProxyFlag__Group_2_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3024:1: ( ( ( rule__ProxyFlag__ProxyProtocolAssignment_2_2_2 ) ) )
            // InternalCurlBetterThanHttpie.g:3025:1: ( ( rule__ProxyFlag__ProxyProtocolAssignment_2_2_2 ) )
            {
            // InternalCurlBetterThanHttpie.g:3025:1: ( ( rule__ProxyFlag__ProxyProtocolAssignment_2_2_2 ) )
            // InternalCurlBetterThanHttpie.g:3026:2: ( rule__ProxyFlag__ProxyProtocolAssignment_2_2_2 )
            {
             before(grammarAccess.getProxyFlagAccess().getProxyProtocolAssignment_2_2_2()); 
            // InternalCurlBetterThanHttpie.g:3027:2: ( rule__ProxyFlag__ProxyProtocolAssignment_2_2_2 )
            // InternalCurlBetterThanHttpie.g:3027:3: rule__ProxyFlag__ProxyProtocolAssignment_2_2_2
            {
            pushFollow(FOLLOW_2);
            rule__ProxyFlag__ProxyProtocolAssignment_2_2_2();

            state._fsp--;


            }

             after(grammarAccess.getProxyFlagAccess().getProxyProtocolAssignment_2_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Group_2_2__2__Impl"


    // $ANTLR start "rule__ProxyFlag__Group_2_2__3"
    // InternalCurlBetterThanHttpie.g:3035:1: rule__ProxyFlag__Group_2_2__3 : rule__ProxyFlag__Group_2_2__3__Impl ;
    public final void rule__ProxyFlag__Group_2_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3039:1: ( rule__ProxyFlag__Group_2_2__3__Impl )
            // InternalCurlBetterThanHttpie.g:3040:2: rule__ProxyFlag__Group_2_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProxyFlag__Group_2_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Group_2_2__3"


    // $ANTLR start "rule__ProxyFlag__Group_2_2__3__Impl"
    // InternalCurlBetterThanHttpie.g:3046:1: rule__ProxyFlag__Group_2_2__3__Impl : ( '://' ) ;
    public final void rule__ProxyFlag__Group_2_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3050:1: ( ( '://' ) )
            // InternalCurlBetterThanHttpie.g:3051:1: ( '://' )
            {
            // InternalCurlBetterThanHttpie.g:3051:1: ( '://' )
            // InternalCurlBetterThanHttpie.g:3052:2: '://'
            {
             before(grammarAccess.getProxyFlagAccess().getColonSolidusSolidusKeyword_2_2_3()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getProxyFlagAccess().getColonSolidusSolidusKeyword_2_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Group_2_2__3__Impl"


    // $ANTLR start "rule__ProxyFlag__Group_3__0"
    // InternalCurlBetterThanHttpie.g:3062:1: rule__ProxyFlag__Group_3__0 : rule__ProxyFlag__Group_3__0__Impl rule__ProxyFlag__Group_3__1 ;
    public final void rule__ProxyFlag__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3066:1: ( rule__ProxyFlag__Group_3__0__Impl rule__ProxyFlag__Group_3__1 )
            // InternalCurlBetterThanHttpie.g:3067:2: rule__ProxyFlag__Group_3__0__Impl rule__ProxyFlag__Group_3__1
            {
            pushFollow(FOLLOW_11);
            rule__ProxyFlag__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProxyFlag__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Group_3__0"


    // $ANTLR start "rule__ProxyFlag__Group_3__0__Impl"
    // InternalCurlBetterThanHttpie.g:3074:1: rule__ProxyFlag__Group_3__0__Impl : ( ( rule__ProxyFlag__UsernameAssignment_3_0 ) ) ;
    public final void rule__ProxyFlag__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3078:1: ( ( ( rule__ProxyFlag__UsernameAssignment_3_0 ) ) )
            // InternalCurlBetterThanHttpie.g:3079:1: ( ( rule__ProxyFlag__UsernameAssignment_3_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:3079:1: ( ( rule__ProxyFlag__UsernameAssignment_3_0 ) )
            // InternalCurlBetterThanHttpie.g:3080:2: ( rule__ProxyFlag__UsernameAssignment_3_0 )
            {
             before(grammarAccess.getProxyFlagAccess().getUsernameAssignment_3_0()); 
            // InternalCurlBetterThanHttpie.g:3081:2: ( rule__ProxyFlag__UsernameAssignment_3_0 )
            // InternalCurlBetterThanHttpie.g:3081:3: rule__ProxyFlag__UsernameAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__ProxyFlag__UsernameAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getProxyFlagAccess().getUsernameAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Group_3__0__Impl"


    // $ANTLR start "rule__ProxyFlag__Group_3__1"
    // InternalCurlBetterThanHttpie.g:3089:1: rule__ProxyFlag__Group_3__1 : rule__ProxyFlag__Group_3__1__Impl rule__ProxyFlag__Group_3__2 ;
    public final void rule__ProxyFlag__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3093:1: ( rule__ProxyFlag__Group_3__1__Impl rule__ProxyFlag__Group_3__2 )
            // InternalCurlBetterThanHttpie.g:3094:2: rule__ProxyFlag__Group_3__1__Impl rule__ProxyFlag__Group_3__2
            {
            pushFollow(FOLLOW_13);
            rule__ProxyFlag__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProxyFlag__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Group_3__1"


    // $ANTLR start "rule__ProxyFlag__Group_3__1__Impl"
    // InternalCurlBetterThanHttpie.g:3101:1: rule__ProxyFlag__Group_3__1__Impl : ( ':' ) ;
    public final void rule__ProxyFlag__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3105:1: ( ( ':' ) )
            // InternalCurlBetterThanHttpie.g:3106:1: ( ':' )
            {
            // InternalCurlBetterThanHttpie.g:3106:1: ( ':' )
            // InternalCurlBetterThanHttpie.g:3107:2: ':'
            {
             before(grammarAccess.getProxyFlagAccess().getColonKeyword_3_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getProxyFlagAccess().getColonKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Group_3__1__Impl"


    // $ANTLR start "rule__ProxyFlag__Group_3__2"
    // InternalCurlBetterThanHttpie.g:3116:1: rule__ProxyFlag__Group_3__2 : rule__ProxyFlag__Group_3__2__Impl rule__ProxyFlag__Group_3__3 ;
    public final void rule__ProxyFlag__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3120:1: ( rule__ProxyFlag__Group_3__2__Impl rule__ProxyFlag__Group_3__3 )
            // InternalCurlBetterThanHttpie.g:3121:2: rule__ProxyFlag__Group_3__2__Impl rule__ProxyFlag__Group_3__3
            {
            pushFollow(FOLLOW_20);
            rule__ProxyFlag__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProxyFlag__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Group_3__2"


    // $ANTLR start "rule__ProxyFlag__Group_3__2__Impl"
    // InternalCurlBetterThanHttpie.g:3128:1: rule__ProxyFlag__Group_3__2__Impl : ( ( rule__ProxyFlag__PasswordAssignment_3_2 ) ) ;
    public final void rule__ProxyFlag__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3132:1: ( ( ( rule__ProxyFlag__PasswordAssignment_3_2 ) ) )
            // InternalCurlBetterThanHttpie.g:3133:1: ( ( rule__ProxyFlag__PasswordAssignment_3_2 ) )
            {
            // InternalCurlBetterThanHttpie.g:3133:1: ( ( rule__ProxyFlag__PasswordAssignment_3_2 ) )
            // InternalCurlBetterThanHttpie.g:3134:2: ( rule__ProxyFlag__PasswordAssignment_3_2 )
            {
             before(grammarAccess.getProxyFlagAccess().getPasswordAssignment_3_2()); 
            // InternalCurlBetterThanHttpie.g:3135:2: ( rule__ProxyFlag__PasswordAssignment_3_2 )
            // InternalCurlBetterThanHttpie.g:3135:3: rule__ProxyFlag__PasswordAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__ProxyFlag__PasswordAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getProxyFlagAccess().getPasswordAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Group_3__2__Impl"


    // $ANTLR start "rule__ProxyFlag__Group_3__3"
    // InternalCurlBetterThanHttpie.g:3143:1: rule__ProxyFlag__Group_3__3 : rule__ProxyFlag__Group_3__3__Impl ;
    public final void rule__ProxyFlag__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3147:1: ( rule__ProxyFlag__Group_3__3__Impl )
            // InternalCurlBetterThanHttpie.g:3148:2: rule__ProxyFlag__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProxyFlag__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Group_3__3"


    // $ANTLR start "rule__ProxyFlag__Group_3__3__Impl"
    // InternalCurlBetterThanHttpie.g:3154:1: rule__ProxyFlag__Group_3__3__Impl : ( '@' ) ;
    public final void rule__ProxyFlag__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3158:1: ( ( '@' ) )
            // InternalCurlBetterThanHttpie.g:3159:1: ( '@' )
            {
            // InternalCurlBetterThanHttpie.g:3159:1: ( '@' )
            // InternalCurlBetterThanHttpie.g:3160:2: '@'
            {
             before(grammarAccess.getProxyFlagAccess().getCommercialAtKeyword_3_3()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getProxyFlagAccess().getCommercialAtKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Group_3__3__Impl"


    // $ANTLR start "rule__ProxyFlag__Group_4_0__0"
    // InternalCurlBetterThanHttpie.g:3170:1: rule__ProxyFlag__Group_4_0__0 : rule__ProxyFlag__Group_4_0__0__Impl rule__ProxyFlag__Group_4_0__1 ;
    public final void rule__ProxyFlag__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3174:1: ( rule__ProxyFlag__Group_4_0__0__Impl rule__ProxyFlag__Group_4_0__1 )
            // InternalCurlBetterThanHttpie.g:3175:2: rule__ProxyFlag__Group_4_0__0__Impl rule__ProxyFlag__Group_4_0__1
            {
            pushFollow(FOLLOW_11);
            rule__ProxyFlag__Group_4_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProxyFlag__Group_4_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Group_4_0__0"


    // $ANTLR start "rule__ProxyFlag__Group_4_0__0__Impl"
    // InternalCurlBetterThanHttpie.g:3182:1: rule__ProxyFlag__Group_4_0__0__Impl : ( ( rule__ProxyFlag__HostnameAssignment_4_0_0 ) ) ;
    public final void rule__ProxyFlag__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3186:1: ( ( ( rule__ProxyFlag__HostnameAssignment_4_0_0 ) ) )
            // InternalCurlBetterThanHttpie.g:3187:1: ( ( rule__ProxyFlag__HostnameAssignment_4_0_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:3187:1: ( ( rule__ProxyFlag__HostnameAssignment_4_0_0 ) )
            // InternalCurlBetterThanHttpie.g:3188:2: ( rule__ProxyFlag__HostnameAssignment_4_0_0 )
            {
             before(grammarAccess.getProxyFlagAccess().getHostnameAssignment_4_0_0()); 
            // InternalCurlBetterThanHttpie.g:3189:2: ( rule__ProxyFlag__HostnameAssignment_4_0_0 )
            // InternalCurlBetterThanHttpie.g:3189:3: rule__ProxyFlag__HostnameAssignment_4_0_0
            {
            pushFollow(FOLLOW_2);
            rule__ProxyFlag__HostnameAssignment_4_0_0();

            state._fsp--;


            }

             after(grammarAccess.getProxyFlagAccess().getHostnameAssignment_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Group_4_0__0__Impl"


    // $ANTLR start "rule__ProxyFlag__Group_4_0__1"
    // InternalCurlBetterThanHttpie.g:3197:1: rule__ProxyFlag__Group_4_0__1 : rule__ProxyFlag__Group_4_0__1__Impl ;
    public final void rule__ProxyFlag__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3201:1: ( rule__ProxyFlag__Group_4_0__1__Impl )
            // InternalCurlBetterThanHttpie.g:3202:2: rule__ProxyFlag__Group_4_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProxyFlag__Group_4_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Group_4_0__1"


    // $ANTLR start "rule__ProxyFlag__Group_4_0__1__Impl"
    // InternalCurlBetterThanHttpie.g:3208:1: rule__ProxyFlag__Group_4_0__1__Impl : ( ( rule__ProxyFlag__Group_4_0_1__0 )? ) ;
    public final void rule__ProxyFlag__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3212:1: ( ( ( rule__ProxyFlag__Group_4_0_1__0 )? ) )
            // InternalCurlBetterThanHttpie.g:3213:1: ( ( rule__ProxyFlag__Group_4_0_1__0 )? )
            {
            // InternalCurlBetterThanHttpie.g:3213:1: ( ( rule__ProxyFlag__Group_4_0_1__0 )? )
            // InternalCurlBetterThanHttpie.g:3214:2: ( rule__ProxyFlag__Group_4_0_1__0 )?
            {
             before(grammarAccess.getProxyFlagAccess().getGroup_4_0_1()); 
            // InternalCurlBetterThanHttpie.g:3215:2: ( rule__ProxyFlag__Group_4_0_1__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==30) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:3215:3: rule__ProxyFlag__Group_4_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProxyFlag__Group_4_0_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProxyFlagAccess().getGroup_4_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Group_4_0__1__Impl"


    // $ANTLR start "rule__ProxyFlag__Group_4_0_1__0"
    // InternalCurlBetterThanHttpie.g:3224:1: rule__ProxyFlag__Group_4_0_1__0 : rule__ProxyFlag__Group_4_0_1__0__Impl rule__ProxyFlag__Group_4_0_1__1 ;
    public final void rule__ProxyFlag__Group_4_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3228:1: ( rule__ProxyFlag__Group_4_0_1__0__Impl rule__ProxyFlag__Group_4_0_1__1 )
            // InternalCurlBetterThanHttpie.g:3229:2: rule__ProxyFlag__Group_4_0_1__0__Impl rule__ProxyFlag__Group_4_0_1__1
            {
            pushFollow(FOLLOW_12);
            rule__ProxyFlag__Group_4_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProxyFlag__Group_4_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Group_4_0_1__0"


    // $ANTLR start "rule__ProxyFlag__Group_4_0_1__0__Impl"
    // InternalCurlBetterThanHttpie.g:3236:1: rule__ProxyFlag__Group_4_0_1__0__Impl : ( ':' ) ;
    public final void rule__ProxyFlag__Group_4_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3240:1: ( ( ':' ) )
            // InternalCurlBetterThanHttpie.g:3241:1: ( ':' )
            {
            // InternalCurlBetterThanHttpie.g:3241:1: ( ':' )
            // InternalCurlBetterThanHttpie.g:3242:2: ':'
            {
             before(grammarAccess.getProxyFlagAccess().getColonKeyword_4_0_1_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getProxyFlagAccess().getColonKeyword_4_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Group_4_0_1__0__Impl"


    // $ANTLR start "rule__ProxyFlag__Group_4_0_1__1"
    // InternalCurlBetterThanHttpie.g:3251:1: rule__ProxyFlag__Group_4_0_1__1 : rule__ProxyFlag__Group_4_0_1__1__Impl ;
    public final void rule__ProxyFlag__Group_4_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3255:1: ( rule__ProxyFlag__Group_4_0_1__1__Impl )
            // InternalCurlBetterThanHttpie.g:3256:2: rule__ProxyFlag__Group_4_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProxyFlag__Group_4_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Group_4_0_1__1"


    // $ANTLR start "rule__ProxyFlag__Group_4_0_1__1__Impl"
    // InternalCurlBetterThanHttpie.g:3262:1: rule__ProxyFlag__Group_4_0_1__1__Impl : ( ( rule__ProxyFlag__PortAssignment_4_0_1_1 ) ) ;
    public final void rule__ProxyFlag__Group_4_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3266:1: ( ( ( rule__ProxyFlag__PortAssignment_4_0_1_1 ) ) )
            // InternalCurlBetterThanHttpie.g:3267:1: ( ( rule__ProxyFlag__PortAssignment_4_0_1_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:3267:1: ( ( rule__ProxyFlag__PortAssignment_4_0_1_1 ) )
            // InternalCurlBetterThanHttpie.g:3268:2: ( rule__ProxyFlag__PortAssignment_4_0_1_1 )
            {
             before(grammarAccess.getProxyFlagAccess().getPortAssignment_4_0_1_1()); 
            // InternalCurlBetterThanHttpie.g:3269:2: ( rule__ProxyFlag__PortAssignment_4_0_1_1 )
            // InternalCurlBetterThanHttpie.g:3269:3: rule__ProxyFlag__PortAssignment_4_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ProxyFlag__PortAssignment_4_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getProxyFlagAccess().getPortAssignment_4_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Group_4_0_1__1__Impl"


    // $ANTLR start "rule__ProxyFlag__Group_4_1__0"
    // InternalCurlBetterThanHttpie.g:3278:1: rule__ProxyFlag__Group_4_1__0 : rule__ProxyFlag__Group_4_1__0__Impl rule__ProxyFlag__Group_4_1__1 ;
    public final void rule__ProxyFlag__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3282:1: ( rule__ProxyFlag__Group_4_1__0__Impl rule__ProxyFlag__Group_4_1__1 )
            // InternalCurlBetterThanHttpie.g:3283:2: rule__ProxyFlag__Group_4_1__0__Impl rule__ProxyFlag__Group_4_1__1
            {
            pushFollow(FOLLOW_12);
            rule__ProxyFlag__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProxyFlag__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Group_4_1__0"


    // $ANTLR start "rule__ProxyFlag__Group_4_1__0__Impl"
    // InternalCurlBetterThanHttpie.g:3290:1: rule__ProxyFlag__Group_4_1__0__Impl : ( ':' ) ;
    public final void rule__ProxyFlag__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3294:1: ( ( ':' ) )
            // InternalCurlBetterThanHttpie.g:3295:1: ( ':' )
            {
            // InternalCurlBetterThanHttpie.g:3295:1: ( ':' )
            // InternalCurlBetterThanHttpie.g:3296:2: ':'
            {
             before(grammarAccess.getProxyFlagAccess().getColonKeyword_4_1_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getProxyFlagAccess().getColonKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Group_4_1__0__Impl"


    // $ANTLR start "rule__ProxyFlag__Group_4_1__1"
    // InternalCurlBetterThanHttpie.g:3305:1: rule__ProxyFlag__Group_4_1__1 : rule__ProxyFlag__Group_4_1__1__Impl ;
    public final void rule__ProxyFlag__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3309:1: ( rule__ProxyFlag__Group_4_1__1__Impl )
            // InternalCurlBetterThanHttpie.g:3310:2: rule__ProxyFlag__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProxyFlag__Group_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Group_4_1__1"


    // $ANTLR start "rule__ProxyFlag__Group_4_1__1__Impl"
    // InternalCurlBetterThanHttpie.g:3316:1: rule__ProxyFlag__Group_4_1__1__Impl : ( ( rule__ProxyFlag__PortAssignment_4_1_1 )? ) ;
    public final void rule__ProxyFlag__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3320:1: ( ( ( rule__ProxyFlag__PortAssignment_4_1_1 )? ) )
            // InternalCurlBetterThanHttpie.g:3321:1: ( ( rule__ProxyFlag__PortAssignment_4_1_1 )? )
            {
            // InternalCurlBetterThanHttpie.g:3321:1: ( ( rule__ProxyFlag__PortAssignment_4_1_1 )? )
            // InternalCurlBetterThanHttpie.g:3322:2: ( rule__ProxyFlag__PortAssignment_4_1_1 )?
            {
             before(grammarAccess.getProxyFlagAccess().getPortAssignment_4_1_1()); 
            // InternalCurlBetterThanHttpie.g:3323:2: ( rule__ProxyFlag__PortAssignment_4_1_1 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_INT) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:3323:3: rule__ProxyFlag__PortAssignment_4_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProxyFlag__PortAssignment_4_1_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProxyFlagAccess().getPortAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Group_4_1__1__Impl"


    // $ANTLR start "rule__AuthFlag__Group__0"
    // InternalCurlBetterThanHttpie.g:3332:1: rule__AuthFlag__Group__0 : rule__AuthFlag__Group__0__Impl rule__AuthFlag__Group__1 ;
    public final void rule__AuthFlag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3336:1: ( rule__AuthFlag__Group__0__Impl rule__AuthFlag__Group__1 )
            // InternalCurlBetterThanHttpie.g:3337:2: rule__AuthFlag__Group__0__Impl rule__AuthFlag__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__AuthFlag__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AuthFlag__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthFlag__Group__0"


    // $ANTLR start "rule__AuthFlag__Group__0__Impl"
    // InternalCurlBetterThanHttpie.g:3344:1: rule__AuthFlag__Group__0__Impl : ( ( rule__AuthFlag__Alternatives_0 ) ) ;
    public final void rule__AuthFlag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3348:1: ( ( ( rule__AuthFlag__Alternatives_0 ) ) )
            // InternalCurlBetterThanHttpie.g:3349:1: ( ( rule__AuthFlag__Alternatives_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:3349:1: ( ( rule__AuthFlag__Alternatives_0 ) )
            // InternalCurlBetterThanHttpie.g:3350:2: ( rule__AuthFlag__Alternatives_0 )
            {
             before(grammarAccess.getAuthFlagAccess().getAlternatives_0()); 
            // InternalCurlBetterThanHttpie.g:3351:2: ( rule__AuthFlag__Alternatives_0 )
            // InternalCurlBetterThanHttpie.g:3351:3: rule__AuthFlag__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__AuthFlag__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getAuthFlagAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthFlag__Group__0__Impl"


    // $ANTLR start "rule__AuthFlag__Group__1"
    // InternalCurlBetterThanHttpie.g:3359:1: rule__AuthFlag__Group__1 : rule__AuthFlag__Group__1__Impl rule__AuthFlag__Group__2 ;
    public final void rule__AuthFlag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3363:1: ( rule__AuthFlag__Group__1__Impl rule__AuthFlag__Group__2 )
            // InternalCurlBetterThanHttpie.g:3364:2: rule__AuthFlag__Group__1__Impl rule__AuthFlag__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__AuthFlag__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AuthFlag__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthFlag__Group__1"


    // $ANTLR start "rule__AuthFlag__Group__1__Impl"
    // InternalCurlBetterThanHttpie.g:3371:1: rule__AuthFlag__Group__1__Impl : ( ( rule__AuthFlag__Alternatives_1 ) ) ;
    public final void rule__AuthFlag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3375:1: ( ( ( rule__AuthFlag__Alternatives_1 ) ) )
            // InternalCurlBetterThanHttpie.g:3376:1: ( ( rule__AuthFlag__Alternatives_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:3376:1: ( ( rule__AuthFlag__Alternatives_1 ) )
            // InternalCurlBetterThanHttpie.g:3377:2: ( rule__AuthFlag__Alternatives_1 )
            {
             before(grammarAccess.getAuthFlagAccess().getAlternatives_1()); 
            // InternalCurlBetterThanHttpie.g:3378:2: ( rule__AuthFlag__Alternatives_1 )
            // InternalCurlBetterThanHttpie.g:3378:3: rule__AuthFlag__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__AuthFlag__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getAuthFlagAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthFlag__Group__1__Impl"


    // $ANTLR start "rule__AuthFlag__Group__2"
    // InternalCurlBetterThanHttpie.g:3386:1: rule__AuthFlag__Group__2 : rule__AuthFlag__Group__2__Impl rule__AuthFlag__Group__3 ;
    public final void rule__AuthFlag__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3390:1: ( rule__AuthFlag__Group__2__Impl rule__AuthFlag__Group__3 )
            // InternalCurlBetterThanHttpie.g:3391:2: rule__AuthFlag__Group__2__Impl rule__AuthFlag__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__AuthFlag__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AuthFlag__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthFlag__Group__2"


    // $ANTLR start "rule__AuthFlag__Group__2__Impl"
    // InternalCurlBetterThanHttpie.g:3398:1: rule__AuthFlag__Group__2__Impl : ( ( rule__AuthFlag__UsernameAssignment_2 ) ) ;
    public final void rule__AuthFlag__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3402:1: ( ( ( rule__AuthFlag__UsernameAssignment_2 ) ) )
            // InternalCurlBetterThanHttpie.g:3403:1: ( ( rule__AuthFlag__UsernameAssignment_2 ) )
            {
            // InternalCurlBetterThanHttpie.g:3403:1: ( ( rule__AuthFlag__UsernameAssignment_2 ) )
            // InternalCurlBetterThanHttpie.g:3404:2: ( rule__AuthFlag__UsernameAssignment_2 )
            {
             before(grammarAccess.getAuthFlagAccess().getUsernameAssignment_2()); 
            // InternalCurlBetterThanHttpie.g:3405:2: ( rule__AuthFlag__UsernameAssignment_2 )
            // InternalCurlBetterThanHttpie.g:3405:3: rule__AuthFlag__UsernameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AuthFlag__UsernameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAuthFlagAccess().getUsernameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthFlag__Group__2__Impl"


    // $ANTLR start "rule__AuthFlag__Group__3"
    // InternalCurlBetterThanHttpie.g:3413:1: rule__AuthFlag__Group__3 : rule__AuthFlag__Group__3__Impl rule__AuthFlag__Group__4 ;
    public final void rule__AuthFlag__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3417:1: ( rule__AuthFlag__Group__3__Impl rule__AuthFlag__Group__4 )
            // InternalCurlBetterThanHttpie.g:3418:2: rule__AuthFlag__Group__3__Impl rule__AuthFlag__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__AuthFlag__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AuthFlag__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthFlag__Group__3"


    // $ANTLR start "rule__AuthFlag__Group__3__Impl"
    // InternalCurlBetterThanHttpie.g:3425:1: rule__AuthFlag__Group__3__Impl : ( ( rule__AuthFlag__Group_3__0 )? ) ;
    public final void rule__AuthFlag__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3429:1: ( ( ( rule__AuthFlag__Group_3__0 )? ) )
            // InternalCurlBetterThanHttpie.g:3430:1: ( ( rule__AuthFlag__Group_3__0 )? )
            {
            // InternalCurlBetterThanHttpie.g:3430:1: ( ( rule__AuthFlag__Group_3__0 )? )
            // InternalCurlBetterThanHttpie.g:3431:2: ( rule__AuthFlag__Group_3__0 )?
            {
             before(grammarAccess.getAuthFlagAccess().getGroup_3()); 
            // InternalCurlBetterThanHttpie.g:3432:2: ( rule__AuthFlag__Group_3__0 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==30) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:3432:3: rule__AuthFlag__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AuthFlag__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAuthFlagAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthFlag__Group__3__Impl"


    // $ANTLR start "rule__AuthFlag__Group__4"
    // InternalCurlBetterThanHttpie.g:3440:1: rule__AuthFlag__Group__4 : rule__AuthFlag__Group__4__Impl ;
    public final void rule__AuthFlag__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3444:1: ( rule__AuthFlag__Group__4__Impl )
            // InternalCurlBetterThanHttpie.g:3445:2: rule__AuthFlag__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AuthFlag__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthFlag__Group__4"


    // $ANTLR start "rule__AuthFlag__Group__4__Impl"
    // InternalCurlBetterThanHttpie.g:3451:1: rule__AuthFlag__Group__4__Impl : ( ( rule__AuthFlag__Group_4__0 )? ) ;
    public final void rule__AuthFlag__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3455:1: ( ( ( rule__AuthFlag__Group_4__0 )? ) )
            // InternalCurlBetterThanHttpie.g:3456:1: ( ( rule__AuthFlag__Group_4__0 )? )
            {
            // InternalCurlBetterThanHttpie.g:3456:1: ( ( rule__AuthFlag__Group_4__0 )? )
            // InternalCurlBetterThanHttpie.g:3457:2: ( rule__AuthFlag__Group_4__0 )?
            {
             before(grammarAccess.getAuthFlagAccess().getGroup_4()); 
            // InternalCurlBetterThanHttpie.g:3458:2: ( rule__AuthFlag__Group_4__0 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==45) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:3458:3: rule__AuthFlag__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AuthFlag__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAuthFlagAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthFlag__Group__4__Impl"


    // $ANTLR start "rule__AuthFlag__Group_3__0"
    // InternalCurlBetterThanHttpie.g:3467:1: rule__AuthFlag__Group_3__0 : rule__AuthFlag__Group_3__0__Impl rule__AuthFlag__Group_3__1 ;
    public final void rule__AuthFlag__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3471:1: ( rule__AuthFlag__Group_3__0__Impl rule__AuthFlag__Group_3__1 )
            // InternalCurlBetterThanHttpie.g:3472:2: rule__AuthFlag__Group_3__0__Impl rule__AuthFlag__Group_3__1
            {
            pushFollow(FOLLOW_13);
            rule__AuthFlag__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AuthFlag__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthFlag__Group_3__0"


    // $ANTLR start "rule__AuthFlag__Group_3__0__Impl"
    // InternalCurlBetterThanHttpie.g:3479:1: rule__AuthFlag__Group_3__0__Impl : ( ':' ) ;
    public final void rule__AuthFlag__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3483:1: ( ( ':' ) )
            // InternalCurlBetterThanHttpie.g:3484:1: ( ':' )
            {
            // InternalCurlBetterThanHttpie.g:3484:1: ( ':' )
            // InternalCurlBetterThanHttpie.g:3485:2: ':'
            {
             before(grammarAccess.getAuthFlagAccess().getColonKeyword_3_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getAuthFlagAccess().getColonKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthFlag__Group_3__0__Impl"


    // $ANTLR start "rule__AuthFlag__Group_3__1"
    // InternalCurlBetterThanHttpie.g:3494:1: rule__AuthFlag__Group_3__1 : rule__AuthFlag__Group_3__1__Impl ;
    public final void rule__AuthFlag__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3498:1: ( rule__AuthFlag__Group_3__1__Impl )
            // InternalCurlBetterThanHttpie.g:3499:2: rule__AuthFlag__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AuthFlag__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthFlag__Group_3__1"


    // $ANTLR start "rule__AuthFlag__Group_3__1__Impl"
    // InternalCurlBetterThanHttpie.g:3505:1: rule__AuthFlag__Group_3__1__Impl : ( ( rule__AuthFlag__PasswordAssignment_3_1 ) ) ;
    public final void rule__AuthFlag__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3509:1: ( ( ( rule__AuthFlag__PasswordAssignment_3_1 ) ) )
            // InternalCurlBetterThanHttpie.g:3510:1: ( ( rule__AuthFlag__PasswordAssignment_3_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:3510:1: ( ( rule__AuthFlag__PasswordAssignment_3_1 ) )
            // InternalCurlBetterThanHttpie.g:3511:2: ( rule__AuthFlag__PasswordAssignment_3_1 )
            {
             before(grammarAccess.getAuthFlagAccess().getPasswordAssignment_3_1()); 
            // InternalCurlBetterThanHttpie.g:3512:2: ( rule__AuthFlag__PasswordAssignment_3_1 )
            // InternalCurlBetterThanHttpie.g:3512:3: rule__AuthFlag__PasswordAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__AuthFlag__PasswordAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAuthFlagAccess().getPasswordAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthFlag__Group_3__1__Impl"


    // $ANTLR start "rule__AuthFlag__Group_4__0"
    // InternalCurlBetterThanHttpie.g:3521:1: rule__AuthFlag__Group_4__0 : rule__AuthFlag__Group_4__0__Impl rule__AuthFlag__Group_4__1 ;
    public final void rule__AuthFlag__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3525:1: ( rule__AuthFlag__Group_4__0__Impl rule__AuthFlag__Group_4__1 )
            // InternalCurlBetterThanHttpie.g:3526:2: rule__AuthFlag__Group_4__0__Impl rule__AuthFlag__Group_4__1
            {
            pushFollow(FOLLOW_22);
            rule__AuthFlag__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AuthFlag__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthFlag__Group_4__0"


    // $ANTLR start "rule__AuthFlag__Group_4__0__Impl"
    // InternalCurlBetterThanHttpie.g:3533:1: rule__AuthFlag__Group_4__0__Impl : ( '@' ) ;
    public final void rule__AuthFlag__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3537:1: ( ( '@' ) )
            // InternalCurlBetterThanHttpie.g:3538:1: ( '@' )
            {
            // InternalCurlBetterThanHttpie.g:3538:1: ( '@' )
            // InternalCurlBetterThanHttpie.g:3539:2: '@'
            {
             before(grammarAccess.getAuthFlagAccess().getCommercialAtKeyword_4_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getAuthFlagAccess().getCommercialAtKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthFlag__Group_4__0__Impl"


    // $ANTLR start "rule__AuthFlag__Group_4__1"
    // InternalCurlBetterThanHttpie.g:3548:1: rule__AuthFlag__Group_4__1 : rule__AuthFlag__Group_4__1__Impl ;
    public final void rule__AuthFlag__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3552:1: ( rule__AuthFlag__Group_4__1__Impl )
            // InternalCurlBetterThanHttpie.g:3553:2: rule__AuthFlag__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AuthFlag__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthFlag__Group_4__1"


    // $ANTLR start "rule__AuthFlag__Group_4__1__Impl"
    // InternalCurlBetterThanHttpie.g:3559:1: rule__AuthFlag__Group_4__1__Impl : ( ( rule__AuthFlag__Alternatives_4_1 ) ) ;
    public final void rule__AuthFlag__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3563:1: ( ( ( rule__AuthFlag__Alternatives_4_1 ) ) )
            // InternalCurlBetterThanHttpie.g:3564:1: ( ( rule__AuthFlag__Alternatives_4_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:3564:1: ( ( rule__AuthFlag__Alternatives_4_1 ) )
            // InternalCurlBetterThanHttpie.g:3565:2: ( rule__AuthFlag__Alternatives_4_1 )
            {
             before(grammarAccess.getAuthFlagAccess().getAlternatives_4_1()); 
            // InternalCurlBetterThanHttpie.g:3566:2: ( rule__AuthFlag__Alternatives_4_1 )
            // InternalCurlBetterThanHttpie.g:3566:3: rule__AuthFlag__Alternatives_4_1
            {
            pushFollow(FOLLOW_2);
            rule__AuthFlag__Alternatives_4_1();

            state._fsp--;


            }

             after(grammarAccess.getAuthFlagAccess().getAlternatives_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthFlag__Group_4__1__Impl"


    // $ANTLR start "rule__DownloadFlag__Group__0"
    // InternalCurlBetterThanHttpie.g:3575:1: rule__DownloadFlag__Group__0 : rule__DownloadFlag__Group__0__Impl rule__DownloadFlag__Group__1 ;
    public final void rule__DownloadFlag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3579:1: ( rule__DownloadFlag__Group__0__Impl rule__DownloadFlag__Group__1 )
            // InternalCurlBetterThanHttpie.g:3580:2: rule__DownloadFlag__Group__0__Impl rule__DownloadFlag__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__DownloadFlag__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DownloadFlag__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DownloadFlag__Group__0"


    // $ANTLR start "rule__DownloadFlag__Group__0__Impl"
    // InternalCurlBetterThanHttpie.g:3587:1: rule__DownloadFlag__Group__0__Impl : ( () ) ;
    public final void rule__DownloadFlag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3591:1: ( ( () ) )
            // InternalCurlBetterThanHttpie.g:3592:1: ( () )
            {
            // InternalCurlBetterThanHttpie.g:3592:1: ( () )
            // InternalCurlBetterThanHttpie.g:3593:2: ()
            {
             before(grammarAccess.getDownloadFlagAccess().getDownloadFlagAction_0()); 
            // InternalCurlBetterThanHttpie.g:3594:2: ()
            // InternalCurlBetterThanHttpie.g:3594:3: 
            {
            }

             after(grammarAccess.getDownloadFlagAccess().getDownloadFlagAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DownloadFlag__Group__0__Impl"


    // $ANTLR start "rule__DownloadFlag__Group__1"
    // InternalCurlBetterThanHttpie.g:3602:1: rule__DownloadFlag__Group__1 : rule__DownloadFlag__Group__1__Impl ;
    public final void rule__DownloadFlag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3606:1: ( rule__DownloadFlag__Group__1__Impl )
            // InternalCurlBetterThanHttpie.g:3607:2: rule__DownloadFlag__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DownloadFlag__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DownloadFlag__Group__1"


    // $ANTLR start "rule__DownloadFlag__Group__1__Impl"
    // InternalCurlBetterThanHttpie.g:3613:1: rule__DownloadFlag__Group__1__Impl : ( ( rule__DownloadFlag__Alternatives_1 ) ) ;
    public final void rule__DownloadFlag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3617:1: ( ( ( rule__DownloadFlag__Alternatives_1 ) ) )
            // InternalCurlBetterThanHttpie.g:3618:1: ( ( rule__DownloadFlag__Alternatives_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:3618:1: ( ( rule__DownloadFlag__Alternatives_1 ) )
            // InternalCurlBetterThanHttpie.g:3619:2: ( rule__DownloadFlag__Alternatives_1 )
            {
             before(grammarAccess.getDownloadFlagAccess().getAlternatives_1()); 
            // InternalCurlBetterThanHttpie.g:3620:2: ( rule__DownloadFlag__Alternatives_1 )
            // InternalCurlBetterThanHttpie.g:3620:3: rule__DownloadFlag__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__DownloadFlag__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getDownloadFlagAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DownloadFlag__Group__1__Impl"


    // $ANTLR start "rule__HelpFlag__Group__0"
    // InternalCurlBetterThanHttpie.g:3629:1: rule__HelpFlag__Group__0 : rule__HelpFlag__Group__0__Impl rule__HelpFlag__Group__1 ;
    public final void rule__HelpFlag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3633:1: ( rule__HelpFlag__Group__0__Impl rule__HelpFlag__Group__1 )
            // InternalCurlBetterThanHttpie.g:3634:2: rule__HelpFlag__Group__0__Impl rule__HelpFlag__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__HelpFlag__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HelpFlag__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelpFlag__Group__0"


    // $ANTLR start "rule__HelpFlag__Group__0__Impl"
    // InternalCurlBetterThanHttpie.g:3641:1: rule__HelpFlag__Group__0__Impl : ( () ) ;
    public final void rule__HelpFlag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3645:1: ( ( () ) )
            // InternalCurlBetterThanHttpie.g:3646:1: ( () )
            {
            // InternalCurlBetterThanHttpie.g:3646:1: ( () )
            // InternalCurlBetterThanHttpie.g:3647:2: ()
            {
             before(grammarAccess.getHelpFlagAccess().getHelpFlagAction_0()); 
            // InternalCurlBetterThanHttpie.g:3648:2: ()
            // InternalCurlBetterThanHttpie.g:3648:3: 
            {
            }

             after(grammarAccess.getHelpFlagAccess().getHelpFlagAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelpFlag__Group__0__Impl"


    // $ANTLR start "rule__HelpFlag__Group__1"
    // InternalCurlBetterThanHttpie.g:3656:1: rule__HelpFlag__Group__1 : rule__HelpFlag__Group__1__Impl ;
    public final void rule__HelpFlag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3660:1: ( rule__HelpFlag__Group__1__Impl )
            // InternalCurlBetterThanHttpie.g:3661:2: rule__HelpFlag__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HelpFlag__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelpFlag__Group__1"


    // $ANTLR start "rule__HelpFlag__Group__1__Impl"
    // InternalCurlBetterThanHttpie.g:3667:1: rule__HelpFlag__Group__1__Impl : ( ( rule__HelpFlag__Alternatives_1 ) ) ;
    public final void rule__HelpFlag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3671:1: ( ( ( rule__HelpFlag__Alternatives_1 ) ) )
            // InternalCurlBetterThanHttpie.g:3672:1: ( ( rule__HelpFlag__Alternatives_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:3672:1: ( ( rule__HelpFlag__Alternatives_1 ) )
            // InternalCurlBetterThanHttpie.g:3673:2: ( rule__HelpFlag__Alternatives_1 )
            {
             before(grammarAccess.getHelpFlagAccess().getAlternatives_1()); 
            // InternalCurlBetterThanHttpie.g:3674:2: ( rule__HelpFlag__Alternatives_1 )
            // InternalCurlBetterThanHttpie.g:3674:3: rule__HelpFlag__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__HelpFlag__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getHelpFlagAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelpFlag__Group__1__Impl"


    // $ANTLR start "rule__VersionFlag__Group__0"
    // InternalCurlBetterThanHttpie.g:3683:1: rule__VersionFlag__Group__0 : rule__VersionFlag__Group__0__Impl rule__VersionFlag__Group__1 ;
    public final void rule__VersionFlag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3687:1: ( rule__VersionFlag__Group__0__Impl rule__VersionFlag__Group__1 )
            // InternalCurlBetterThanHttpie.g:3688:2: rule__VersionFlag__Group__0__Impl rule__VersionFlag__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__VersionFlag__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VersionFlag__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionFlag__Group__0"


    // $ANTLR start "rule__VersionFlag__Group__0__Impl"
    // InternalCurlBetterThanHttpie.g:3695:1: rule__VersionFlag__Group__0__Impl : ( () ) ;
    public final void rule__VersionFlag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3699:1: ( ( () ) )
            // InternalCurlBetterThanHttpie.g:3700:1: ( () )
            {
            // InternalCurlBetterThanHttpie.g:3700:1: ( () )
            // InternalCurlBetterThanHttpie.g:3701:2: ()
            {
             before(grammarAccess.getVersionFlagAccess().getVersionFlagAction_0()); 
            // InternalCurlBetterThanHttpie.g:3702:2: ()
            // InternalCurlBetterThanHttpie.g:3702:3: 
            {
            }

             after(grammarAccess.getVersionFlagAccess().getVersionFlagAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionFlag__Group__0__Impl"


    // $ANTLR start "rule__VersionFlag__Group__1"
    // InternalCurlBetterThanHttpie.g:3710:1: rule__VersionFlag__Group__1 : rule__VersionFlag__Group__1__Impl ;
    public final void rule__VersionFlag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3714:1: ( rule__VersionFlag__Group__1__Impl )
            // InternalCurlBetterThanHttpie.g:3715:2: rule__VersionFlag__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VersionFlag__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionFlag__Group__1"


    // $ANTLR start "rule__VersionFlag__Group__1__Impl"
    // InternalCurlBetterThanHttpie.g:3721:1: rule__VersionFlag__Group__1__Impl : ( '--version' ) ;
    public final void rule__VersionFlag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3725:1: ( ( '--version' ) )
            // InternalCurlBetterThanHttpie.g:3726:1: ( '--version' )
            {
            // InternalCurlBetterThanHttpie.g:3726:1: ( '--version' )
            // InternalCurlBetterThanHttpie.g:3727:2: '--version'
            {
             before(grammarAccess.getVersionFlagAccess().getVersionKeyword_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getVersionFlagAccess().getVersionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionFlag__Group__1__Impl"


    // $ANTLR start "rule__VerboseFlag__Group__0"
    // InternalCurlBetterThanHttpie.g:3737:1: rule__VerboseFlag__Group__0 : rule__VerboseFlag__Group__0__Impl rule__VerboseFlag__Group__1 ;
    public final void rule__VerboseFlag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3741:1: ( rule__VerboseFlag__Group__0__Impl rule__VerboseFlag__Group__1 )
            // InternalCurlBetterThanHttpie.g:3742:2: rule__VerboseFlag__Group__0__Impl rule__VerboseFlag__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__VerboseFlag__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VerboseFlag__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerboseFlag__Group__0"


    // $ANTLR start "rule__VerboseFlag__Group__0__Impl"
    // InternalCurlBetterThanHttpie.g:3749:1: rule__VerboseFlag__Group__0__Impl : ( () ) ;
    public final void rule__VerboseFlag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3753:1: ( ( () ) )
            // InternalCurlBetterThanHttpie.g:3754:1: ( () )
            {
            // InternalCurlBetterThanHttpie.g:3754:1: ( () )
            // InternalCurlBetterThanHttpie.g:3755:2: ()
            {
             before(grammarAccess.getVerboseFlagAccess().getVerboseFlagAction_0()); 
            // InternalCurlBetterThanHttpie.g:3756:2: ()
            // InternalCurlBetterThanHttpie.g:3756:3: 
            {
            }

             after(grammarAccess.getVerboseFlagAccess().getVerboseFlagAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerboseFlag__Group__0__Impl"


    // $ANTLR start "rule__VerboseFlag__Group__1"
    // InternalCurlBetterThanHttpie.g:3764:1: rule__VerboseFlag__Group__1 : rule__VerboseFlag__Group__1__Impl ;
    public final void rule__VerboseFlag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3768:1: ( rule__VerboseFlag__Group__1__Impl )
            // InternalCurlBetterThanHttpie.g:3769:2: rule__VerboseFlag__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VerboseFlag__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerboseFlag__Group__1"


    // $ANTLR start "rule__VerboseFlag__Group__1__Impl"
    // InternalCurlBetterThanHttpie.g:3775:1: rule__VerboseFlag__Group__1__Impl : ( ( rule__VerboseFlag__Alternatives_1 ) ) ;
    public final void rule__VerboseFlag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3779:1: ( ( ( rule__VerboseFlag__Alternatives_1 ) ) )
            // InternalCurlBetterThanHttpie.g:3780:1: ( ( rule__VerboseFlag__Alternatives_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:3780:1: ( ( rule__VerboseFlag__Alternatives_1 ) )
            // InternalCurlBetterThanHttpie.g:3781:2: ( rule__VerboseFlag__Alternatives_1 )
            {
             before(grammarAccess.getVerboseFlagAccess().getAlternatives_1()); 
            // InternalCurlBetterThanHttpie.g:3782:2: ( rule__VerboseFlag__Alternatives_1 )
            // InternalCurlBetterThanHttpie.g:3782:3: rule__VerboseFlag__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__VerboseFlag__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getVerboseFlagAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerboseFlag__Group__1__Impl"


    // $ANTLR start "rule__TimeoutFlag__Group__0"
    // InternalCurlBetterThanHttpie.g:3791:1: rule__TimeoutFlag__Group__0 : rule__TimeoutFlag__Group__0__Impl rule__TimeoutFlag__Group__1 ;
    public final void rule__TimeoutFlag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3795:1: ( rule__TimeoutFlag__Group__0__Impl rule__TimeoutFlag__Group__1 )
            // InternalCurlBetterThanHttpie.g:3796:2: rule__TimeoutFlag__Group__0__Impl rule__TimeoutFlag__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__TimeoutFlag__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeoutFlag__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeoutFlag__Group__0"


    // $ANTLR start "rule__TimeoutFlag__Group__0__Impl"
    // InternalCurlBetterThanHttpie.g:3803:1: rule__TimeoutFlag__Group__0__Impl : ( '--timeout' ) ;
    public final void rule__TimeoutFlag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3807:1: ( ( '--timeout' ) )
            // InternalCurlBetterThanHttpie.g:3808:1: ( '--timeout' )
            {
            // InternalCurlBetterThanHttpie.g:3808:1: ( '--timeout' )
            // InternalCurlBetterThanHttpie.g:3809:2: '--timeout'
            {
             before(grammarAccess.getTimeoutFlagAccess().getTimeoutKeyword_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getTimeoutFlagAccess().getTimeoutKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeoutFlag__Group__0__Impl"


    // $ANTLR start "rule__TimeoutFlag__Group__1"
    // InternalCurlBetterThanHttpie.g:3818:1: rule__TimeoutFlag__Group__1 : rule__TimeoutFlag__Group__1__Impl rule__TimeoutFlag__Group__2 ;
    public final void rule__TimeoutFlag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3822:1: ( rule__TimeoutFlag__Group__1__Impl rule__TimeoutFlag__Group__2 )
            // InternalCurlBetterThanHttpie.g:3823:2: rule__TimeoutFlag__Group__1__Impl rule__TimeoutFlag__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__TimeoutFlag__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeoutFlag__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeoutFlag__Group__1"


    // $ANTLR start "rule__TimeoutFlag__Group__1__Impl"
    // InternalCurlBetterThanHttpie.g:3830:1: rule__TimeoutFlag__Group__1__Impl : ( ( rule__TimeoutFlag__Alternatives_1 ) ) ;
    public final void rule__TimeoutFlag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3834:1: ( ( ( rule__TimeoutFlag__Alternatives_1 ) ) )
            // InternalCurlBetterThanHttpie.g:3835:1: ( ( rule__TimeoutFlag__Alternatives_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:3835:1: ( ( rule__TimeoutFlag__Alternatives_1 ) )
            // InternalCurlBetterThanHttpie.g:3836:2: ( rule__TimeoutFlag__Alternatives_1 )
            {
             before(grammarAccess.getTimeoutFlagAccess().getAlternatives_1()); 
            // InternalCurlBetterThanHttpie.g:3837:2: ( rule__TimeoutFlag__Alternatives_1 )
            // InternalCurlBetterThanHttpie.g:3837:3: rule__TimeoutFlag__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__TimeoutFlag__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getTimeoutFlagAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeoutFlag__Group__1__Impl"


    // $ANTLR start "rule__TimeoutFlag__Group__2"
    // InternalCurlBetterThanHttpie.g:3845:1: rule__TimeoutFlag__Group__2 : rule__TimeoutFlag__Group__2__Impl ;
    public final void rule__TimeoutFlag__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3849:1: ( rule__TimeoutFlag__Group__2__Impl )
            // InternalCurlBetterThanHttpie.g:3850:2: rule__TimeoutFlag__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TimeoutFlag__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeoutFlag__Group__2"


    // $ANTLR start "rule__TimeoutFlag__Group__2__Impl"
    // InternalCurlBetterThanHttpie.g:3856:1: rule__TimeoutFlag__Group__2__Impl : ( ( rule__TimeoutFlag__TimeoutAssignment_2 ) ) ;
    public final void rule__TimeoutFlag__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3860:1: ( ( ( rule__TimeoutFlag__TimeoutAssignment_2 ) ) )
            // InternalCurlBetterThanHttpie.g:3861:1: ( ( rule__TimeoutFlag__TimeoutAssignment_2 ) )
            {
            // InternalCurlBetterThanHttpie.g:3861:1: ( ( rule__TimeoutFlag__TimeoutAssignment_2 ) )
            // InternalCurlBetterThanHttpie.g:3862:2: ( rule__TimeoutFlag__TimeoutAssignment_2 )
            {
             before(grammarAccess.getTimeoutFlagAccess().getTimeoutAssignment_2()); 
            // InternalCurlBetterThanHttpie.g:3863:2: ( rule__TimeoutFlag__TimeoutAssignment_2 )
            // InternalCurlBetterThanHttpie.g:3863:3: rule__TimeoutFlag__TimeoutAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TimeoutFlag__TimeoutAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTimeoutFlagAccess().getTimeoutAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeoutFlag__Group__2__Impl"


    // $ANTLR start "rule__HttpHeaderItem__Group__0"
    // InternalCurlBetterThanHttpie.g:3872:1: rule__HttpHeaderItem__Group__0 : rule__HttpHeaderItem__Group__0__Impl rule__HttpHeaderItem__Group__1 ;
    public final void rule__HttpHeaderItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3876:1: ( rule__HttpHeaderItem__Group__0__Impl rule__HttpHeaderItem__Group__1 )
            // InternalCurlBetterThanHttpie.g:3877:2: rule__HttpHeaderItem__Group__0__Impl rule__HttpHeaderItem__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__HttpHeaderItem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HttpHeaderItem__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpHeaderItem__Group__0"


    // $ANTLR start "rule__HttpHeaderItem__Group__0__Impl"
    // InternalCurlBetterThanHttpie.g:3884:1: rule__HttpHeaderItem__Group__0__Impl : ( ( rule__HttpHeaderItem__FieldAssignment_0 ) ) ;
    public final void rule__HttpHeaderItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3888:1: ( ( ( rule__HttpHeaderItem__FieldAssignment_0 ) ) )
            // InternalCurlBetterThanHttpie.g:3889:1: ( ( rule__HttpHeaderItem__FieldAssignment_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:3889:1: ( ( rule__HttpHeaderItem__FieldAssignment_0 ) )
            // InternalCurlBetterThanHttpie.g:3890:2: ( rule__HttpHeaderItem__FieldAssignment_0 )
            {
             before(grammarAccess.getHttpHeaderItemAccess().getFieldAssignment_0()); 
            // InternalCurlBetterThanHttpie.g:3891:2: ( rule__HttpHeaderItem__FieldAssignment_0 )
            // InternalCurlBetterThanHttpie.g:3891:3: rule__HttpHeaderItem__FieldAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__HttpHeaderItem__FieldAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getHttpHeaderItemAccess().getFieldAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpHeaderItem__Group__0__Impl"


    // $ANTLR start "rule__HttpHeaderItem__Group__1"
    // InternalCurlBetterThanHttpie.g:3899:1: rule__HttpHeaderItem__Group__1 : rule__HttpHeaderItem__Group__1__Impl rule__HttpHeaderItem__Group__2 ;
    public final void rule__HttpHeaderItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3903:1: ( rule__HttpHeaderItem__Group__1__Impl rule__HttpHeaderItem__Group__2 )
            // InternalCurlBetterThanHttpie.g:3904:2: rule__HttpHeaderItem__Group__1__Impl rule__HttpHeaderItem__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__HttpHeaderItem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HttpHeaderItem__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpHeaderItem__Group__1"


    // $ANTLR start "rule__HttpHeaderItem__Group__1__Impl"
    // InternalCurlBetterThanHttpie.g:3911:1: rule__HttpHeaderItem__Group__1__Impl : ( ':' ) ;
    public final void rule__HttpHeaderItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3915:1: ( ( ':' ) )
            // InternalCurlBetterThanHttpie.g:3916:1: ( ':' )
            {
            // InternalCurlBetterThanHttpie.g:3916:1: ( ':' )
            // InternalCurlBetterThanHttpie.g:3917:2: ':'
            {
             before(grammarAccess.getHttpHeaderItemAccess().getColonKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getHttpHeaderItemAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpHeaderItem__Group__1__Impl"


    // $ANTLR start "rule__HttpHeaderItem__Group__2"
    // InternalCurlBetterThanHttpie.g:3926:1: rule__HttpHeaderItem__Group__2 : rule__HttpHeaderItem__Group__2__Impl ;
    public final void rule__HttpHeaderItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3930:1: ( rule__HttpHeaderItem__Group__2__Impl )
            // InternalCurlBetterThanHttpie.g:3931:2: rule__HttpHeaderItem__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HttpHeaderItem__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpHeaderItem__Group__2"


    // $ANTLR start "rule__HttpHeaderItem__Group__2__Impl"
    // InternalCurlBetterThanHttpie.g:3937:1: rule__HttpHeaderItem__Group__2__Impl : ( ( rule__HttpHeaderItem__ValueAssignment_2 ) ) ;
    public final void rule__HttpHeaderItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3941:1: ( ( ( rule__HttpHeaderItem__ValueAssignment_2 ) ) )
            // InternalCurlBetterThanHttpie.g:3942:1: ( ( rule__HttpHeaderItem__ValueAssignment_2 ) )
            {
            // InternalCurlBetterThanHttpie.g:3942:1: ( ( rule__HttpHeaderItem__ValueAssignment_2 ) )
            // InternalCurlBetterThanHttpie.g:3943:2: ( rule__HttpHeaderItem__ValueAssignment_2 )
            {
             before(grammarAccess.getHttpHeaderItemAccess().getValueAssignment_2()); 
            // InternalCurlBetterThanHttpie.g:3944:2: ( rule__HttpHeaderItem__ValueAssignment_2 )
            // InternalCurlBetterThanHttpie.g:3944:3: rule__HttpHeaderItem__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__HttpHeaderItem__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getHttpHeaderItemAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpHeaderItem__Group__2__Impl"


    // $ANTLR start "rule__FormFileFieldItem__Group__0"
    // InternalCurlBetterThanHttpie.g:3953:1: rule__FormFileFieldItem__Group__0 : rule__FormFileFieldItem__Group__0__Impl rule__FormFileFieldItem__Group__1 ;
    public final void rule__FormFileFieldItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3957:1: ( rule__FormFileFieldItem__Group__0__Impl rule__FormFileFieldItem__Group__1 )
            // InternalCurlBetterThanHttpie.g:3958:2: rule__FormFileFieldItem__Group__0__Impl rule__FormFileFieldItem__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__FormFileFieldItem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormFileFieldItem__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormFileFieldItem__Group__0"


    // $ANTLR start "rule__FormFileFieldItem__Group__0__Impl"
    // InternalCurlBetterThanHttpie.g:3965:1: rule__FormFileFieldItem__Group__0__Impl : ( ( rule__FormFileFieldItem__FieldAssignment_0 ) ) ;
    public final void rule__FormFileFieldItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3969:1: ( ( ( rule__FormFileFieldItem__FieldAssignment_0 ) ) )
            // InternalCurlBetterThanHttpie.g:3970:1: ( ( rule__FormFileFieldItem__FieldAssignment_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:3970:1: ( ( rule__FormFileFieldItem__FieldAssignment_0 ) )
            // InternalCurlBetterThanHttpie.g:3971:2: ( rule__FormFileFieldItem__FieldAssignment_0 )
            {
             before(grammarAccess.getFormFileFieldItemAccess().getFieldAssignment_0()); 
            // InternalCurlBetterThanHttpie.g:3972:2: ( rule__FormFileFieldItem__FieldAssignment_0 )
            // InternalCurlBetterThanHttpie.g:3972:3: rule__FormFileFieldItem__FieldAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__FormFileFieldItem__FieldAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFormFileFieldItemAccess().getFieldAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormFileFieldItem__Group__0__Impl"


    // $ANTLR start "rule__FormFileFieldItem__Group__1"
    // InternalCurlBetterThanHttpie.g:3980:1: rule__FormFileFieldItem__Group__1 : rule__FormFileFieldItem__Group__1__Impl rule__FormFileFieldItem__Group__2 ;
    public final void rule__FormFileFieldItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3984:1: ( rule__FormFileFieldItem__Group__1__Impl rule__FormFileFieldItem__Group__2 )
            // InternalCurlBetterThanHttpie.g:3985:2: rule__FormFileFieldItem__Group__1__Impl rule__FormFileFieldItem__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__FormFileFieldItem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormFileFieldItem__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormFileFieldItem__Group__1"


    // $ANTLR start "rule__FormFileFieldItem__Group__1__Impl"
    // InternalCurlBetterThanHttpie.g:3992:1: rule__FormFileFieldItem__Group__1__Impl : ( '@' ) ;
    public final void rule__FormFileFieldItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3996:1: ( ( '@' ) )
            // InternalCurlBetterThanHttpie.g:3997:1: ( '@' )
            {
            // InternalCurlBetterThanHttpie.g:3997:1: ( '@' )
            // InternalCurlBetterThanHttpie.g:3998:2: '@'
            {
             before(grammarAccess.getFormFileFieldItemAccess().getCommercialAtKeyword_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getFormFileFieldItemAccess().getCommercialAtKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormFileFieldItem__Group__1__Impl"


    // $ANTLR start "rule__FormFileFieldItem__Group__2"
    // InternalCurlBetterThanHttpie.g:4007:1: rule__FormFileFieldItem__Group__2 : rule__FormFileFieldItem__Group__2__Impl ;
    public final void rule__FormFileFieldItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4011:1: ( rule__FormFileFieldItem__Group__2__Impl )
            // InternalCurlBetterThanHttpie.g:4012:2: rule__FormFileFieldItem__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FormFileFieldItem__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormFileFieldItem__Group__2"


    // $ANTLR start "rule__FormFileFieldItem__Group__2__Impl"
    // InternalCurlBetterThanHttpie.g:4018:1: rule__FormFileFieldItem__Group__2__Impl : ( ( rule__FormFileFieldItem__ValueAssignment_2 ) ) ;
    public final void rule__FormFileFieldItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4022:1: ( ( ( rule__FormFileFieldItem__ValueAssignment_2 ) ) )
            // InternalCurlBetterThanHttpie.g:4023:1: ( ( rule__FormFileFieldItem__ValueAssignment_2 ) )
            {
            // InternalCurlBetterThanHttpie.g:4023:1: ( ( rule__FormFileFieldItem__ValueAssignment_2 ) )
            // InternalCurlBetterThanHttpie.g:4024:2: ( rule__FormFileFieldItem__ValueAssignment_2 )
            {
             before(grammarAccess.getFormFileFieldItemAccess().getValueAssignment_2()); 
            // InternalCurlBetterThanHttpie.g:4025:2: ( rule__FormFileFieldItem__ValueAssignment_2 )
            // InternalCurlBetterThanHttpie.g:4025:3: rule__FormFileFieldItem__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FormFileFieldItem__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFormFileFieldItemAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormFileFieldItem__Group__2__Impl"


    // $ANTLR start "rule__DataFieldItem__Group__0"
    // InternalCurlBetterThanHttpie.g:4034:1: rule__DataFieldItem__Group__0 : rule__DataFieldItem__Group__0__Impl rule__DataFieldItem__Group__1 ;
    public final void rule__DataFieldItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4038:1: ( rule__DataFieldItem__Group__0__Impl rule__DataFieldItem__Group__1 )
            // InternalCurlBetterThanHttpie.g:4039:2: rule__DataFieldItem__Group__0__Impl rule__DataFieldItem__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__DataFieldItem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataFieldItem__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFieldItem__Group__0"


    // $ANTLR start "rule__DataFieldItem__Group__0__Impl"
    // InternalCurlBetterThanHttpie.g:4046:1: rule__DataFieldItem__Group__0__Impl : ( ( rule__DataFieldItem__FieldAssignment_0 ) ) ;
    public final void rule__DataFieldItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4050:1: ( ( ( rule__DataFieldItem__FieldAssignment_0 ) ) )
            // InternalCurlBetterThanHttpie.g:4051:1: ( ( rule__DataFieldItem__FieldAssignment_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:4051:1: ( ( rule__DataFieldItem__FieldAssignment_0 ) )
            // InternalCurlBetterThanHttpie.g:4052:2: ( rule__DataFieldItem__FieldAssignment_0 )
            {
             before(grammarAccess.getDataFieldItemAccess().getFieldAssignment_0()); 
            // InternalCurlBetterThanHttpie.g:4053:2: ( rule__DataFieldItem__FieldAssignment_0 )
            // InternalCurlBetterThanHttpie.g:4053:3: rule__DataFieldItem__FieldAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DataFieldItem__FieldAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDataFieldItemAccess().getFieldAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFieldItem__Group__0__Impl"


    // $ANTLR start "rule__DataFieldItem__Group__1"
    // InternalCurlBetterThanHttpie.g:4061:1: rule__DataFieldItem__Group__1 : rule__DataFieldItem__Group__1__Impl rule__DataFieldItem__Group__2 ;
    public final void rule__DataFieldItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4065:1: ( rule__DataFieldItem__Group__1__Impl rule__DataFieldItem__Group__2 )
            // InternalCurlBetterThanHttpie.g:4066:2: rule__DataFieldItem__Group__1__Impl rule__DataFieldItem__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__DataFieldItem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataFieldItem__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFieldItem__Group__1"


    // $ANTLR start "rule__DataFieldItem__Group__1__Impl"
    // InternalCurlBetterThanHttpie.g:4073:1: rule__DataFieldItem__Group__1__Impl : ( '=' ) ;
    public final void rule__DataFieldItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4077:1: ( ( '=' ) )
            // InternalCurlBetterThanHttpie.g:4078:1: ( '=' )
            {
            // InternalCurlBetterThanHttpie.g:4078:1: ( '=' )
            // InternalCurlBetterThanHttpie.g:4079:2: '='
            {
             before(grammarAccess.getDataFieldItemAccess().getEqualsSignKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getDataFieldItemAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFieldItem__Group__1__Impl"


    // $ANTLR start "rule__DataFieldItem__Group__2"
    // InternalCurlBetterThanHttpie.g:4088:1: rule__DataFieldItem__Group__2 : rule__DataFieldItem__Group__2__Impl ;
    public final void rule__DataFieldItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4092:1: ( rule__DataFieldItem__Group__2__Impl )
            // InternalCurlBetterThanHttpie.g:4093:2: rule__DataFieldItem__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataFieldItem__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFieldItem__Group__2"


    // $ANTLR start "rule__DataFieldItem__Group__2__Impl"
    // InternalCurlBetterThanHttpie.g:4099:1: rule__DataFieldItem__Group__2__Impl : ( ( rule__DataFieldItem__Alternatives_2 ) ) ;
    public final void rule__DataFieldItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4103:1: ( ( ( rule__DataFieldItem__Alternatives_2 ) ) )
            // InternalCurlBetterThanHttpie.g:4104:1: ( ( rule__DataFieldItem__Alternatives_2 ) )
            {
            // InternalCurlBetterThanHttpie.g:4104:1: ( ( rule__DataFieldItem__Alternatives_2 ) )
            // InternalCurlBetterThanHttpie.g:4105:2: ( rule__DataFieldItem__Alternatives_2 )
            {
             before(grammarAccess.getDataFieldItemAccess().getAlternatives_2()); 
            // InternalCurlBetterThanHttpie.g:4106:2: ( rule__DataFieldItem__Alternatives_2 )
            // InternalCurlBetterThanHttpie.g:4106:3: rule__DataFieldItem__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__DataFieldItem__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getDataFieldItemAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFieldItem__Group__2__Impl"


    // $ANTLR start "rule__DataFieldItem__Group_2_1__0"
    // InternalCurlBetterThanHttpie.g:4115:1: rule__DataFieldItem__Group_2_1__0 : rule__DataFieldItem__Group_2_1__0__Impl rule__DataFieldItem__Group_2_1__1 ;
    public final void rule__DataFieldItem__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4119:1: ( rule__DataFieldItem__Group_2_1__0__Impl rule__DataFieldItem__Group_2_1__1 )
            // InternalCurlBetterThanHttpie.g:4120:2: rule__DataFieldItem__Group_2_1__0__Impl rule__DataFieldItem__Group_2_1__1
            {
            pushFollow(FOLLOW_30);
            rule__DataFieldItem__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataFieldItem__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFieldItem__Group_2_1__0"


    // $ANTLR start "rule__DataFieldItem__Group_2_1__0__Impl"
    // InternalCurlBetterThanHttpie.g:4127:1: rule__DataFieldItem__Group_2_1__0__Impl : ( '@' ) ;
    public final void rule__DataFieldItem__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4131:1: ( ( '@' ) )
            // InternalCurlBetterThanHttpie.g:4132:1: ( '@' )
            {
            // InternalCurlBetterThanHttpie.g:4132:1: ( '@' )
            // InternalCurlBetterThanHttpie.g:4133:2: '@'
            {
             before(grammarAccess.getDataFieldItemAccess().getCommercialAtKeyword_2_1_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getDataFieldItemAccess().getCommercialAtKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFieldItem__Group_2_1__0__Impl"


    // $ANTLR start "rule__DataFieldItem__Group_2_1__1"
    // InternalCurlBetterThanHttpie.g:4142:1: rule__DataFieldItem__Group_2_1__1 : rule__DataFieldItem__Group_2_1__1__Impl ;
    public final void rule__DataFieldItem__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4146:1: ( rule__DataFieldItem__Group_2_1__1__Impl )
            // InternalCurlBetterThanHttpie.g:4147:2: rule__DataFieldItem__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataFieldItem__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFieldItem__Group_2_1__1"


    // $ANTLR start "rule__DataFieldItem__Group_2_1__1__Impl"
    // InternalCurlBetterThanHttpie.g:4153:1: rule__DataFieldItem__Group_2_1__1__Impl : ( ( rule__DataFieldItem__ValueAssignment_2_1_1 ) ) ;
    public final void rule__DataFieldItem__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4157:1: ( ( ( rule__DataFieldItem__ValueAssignment_2_1_1 ) ) )
            // InternalCurlBetterThanHttpie.g:4158:1: ( ( rule__DataFieldItem__ValueAssignment_2_1_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:4158:1: ( ( rule__DataFieldItem__ValueAssignment_2_1_1 ) )
            // InternalCurlBetterThanHttpie.g:4159:2: ( rule__DataFieldItem__ValueAssignment_2_1_1 )
            {
             before(grammarAccess.getDataFieldItemAccess().getValueAssignment_2_1_1()); 
            // InternalCurlBetterThanHttpie.g:4160:2: ( rule__DataFieldItem__ValueAssignment_2_1_1 )
            // InternalCurlBetterThanHttpie.g:4160:3: rule__DataFieldItem__ValueAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__DataFieldItem__ValueAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDataFieldItemAccess().getValueAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFieldItem__Group_2_1__1__Impl"


    // $ANTLR start "rule__UrlParameterItem__Group__0"
    // InternalCurlBetterThanHttpie.g:4169:1: rule__UrlParameterItem__Group__0 : rule__UrlParameterItem__Group__0__Impl rule__UrlParameterItem__Group__1 ;
    public final void rule__UrlParameterItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4173:1: ( rule__UrlParameterItem__Group__0__Impl rule__UrlParameterItem__Group__1 )
            // InternalCurlBetterThanHttpie.g:4174:2: rule__UrlParameterItem__Group__0__Impl rule__UrlParameterItem__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__UrlParameterItem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UrlParameterItem__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UrlParameterItem__Group__0"


    // $ANTLR start "rule__UrlParameterItem__Group__0__Impl"
    // InternalCurlBetterThanHttpie.g:4181:1: rule__UrlParameterItem__Group__0__Impl : ( ( rule__UrlParameterItem__FieldAssignment_0 ) ) ;
    public final void rule__UrlParameterItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4185:1: ( ( ( rule__UrlParameterItem__FieldAssignment_0 ) ) )
            // InternalCurlBetterThanHttpie.g:4186:1: ( ( rule__UrlParameterItem__FieldAssignment_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:4186:1: ( ( rule__UrlParameterItem__FieldAssignment_0 ) )
            // InternalCurlBetterThanHttpie.g:4187:2: ( rule__UrlParameterItem__FieldAssignment_0 )
            {
             before(grammarAccess.getUrlParameterItemAccess().getFieldAssignment_0()); 
            // InternalCurlBetterThanHttpie.g:4188:2: ( rule__UrlParameterItem__FieldAssignment_0 )
            // InternalCurlBetterThanHttpie.g:4188:3: rule__UrlParameterItem__FieldAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__UrlParameterItem__FieldAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getUrlParameterItemAccess().getFieldAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UrlParameterItem__Group__0__Impl"


    // $ANTLR start "rule__UrlParameterItem__Group__1"
    // InternalCurlBetterThanHttpie.g:4196:1: rule__UrlParameterItem__Group__1 : rule__UrlParameterItem__Group__1__Impl rule__UrlParameterItem__Group__2 ;
    public final void rule__UrlParameterItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4200:1: ( rule__UrlParameterItem__Group__1__Impl rule__UrlParameterItem__Group__2 )
            // InternalCurlBetterThanHttpie.g:4201:2: rule__UrlParameterItem__Group__1__Impl rule__UrlParameterItem__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__UrlParameterItem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UrlParameterItem__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UrlParameterItem__Group__1"


    // $ANTLR start "rule__UrlParameterItem__Group__1__Impl"
    // InternalCurlBetterThanHttpie.g:4208:1: rule__UrlParameterItem__Group__1__Impl : ( '==' ) ;
    public final void rule__UrlParameterItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4212:1: ( ( '==' ) )
            // InternalCurlBetterThanHttpie.g:4213:1: ( '==' )
            {
            // InternalCurlBetterThanHttpie.g:4213:1: ( '==' )
            // InternalCurlBetterThanHttpie.g:4214:2: '=='
            {
             before(grammarAccess.getUrlParameterItemAccess().getEqualsSignEqualsSignKeyword_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getUrlParameterItemAccess().getEqualsSignEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UrlParameterItem__Group__1__Impl"


    // $ANTLR start "rule__UrlParameterItem__Group__2"
    // InternalCurlBetterThanHttpie.g:4223:1: rule__UrlParameterItem__Group__2 : rule__UrlParameterItem__Group__2__Impl ;
    public final void rule__UrlParameterItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4227:1: ( rule__UrlParameterItem__Group__2__Impl )
            // InternalCurlBetterThanHttpie.g:4228:2: rule__UrlParameterItem__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UrlParameterItem__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UrlParameterItem__Group__2"


    // $ANTLR start "rule__UrlParameterItem__Group__2__Impl"
    // InternalCurlBetterThanHttpie.g:4234:1: rule__UrlParameterItem__Group__2__Impl : ( ( rule__UrlParameterItem__ValueAssignment_2 ) ) ;
    public final void rule__UrlParameterItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4238:1: ( ( ( rule__UrlParameterItem__ValueAssignment_2 ) ) )
            // InternalCurlBetterThanHttpie.g:4239:1: ( ( rule__UrlParameterItem__ValueAssignment_2 ) )
            {
            // InternalCurlBetterThanHttpie.g:4239:1: ( ( rule__UrlParameterItem__ValueAssignment_2 ) )
            // InternalCurlBetterThanHttpie.g:4240:2: ( rule__UrlParameterItem__ValueAssignment_2 )
            {
             before(grammarAccess.getUrlParameterItemAccess().getValueAssignment_2()); 
            // InternalCurlBetterThanHttpie.g:4241:2: ( rule__UrlParameterItem__ValueAssignment_2 )
            // InternalCurlBetterThanHttpie.g:4241:3: rule__UrlParameterItem__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__UrlParameterItem__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUrlParameterItemAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UrlParameterItem__Group__2__Impl"


    // $ANTLR start "rule__RawJsonFieldItem__Group__0"
    // InternalCurlBetterThanHttpie.g:4250:1: rule__RawJsonFieldItem__Group__0 : rule__RawJsonFieldItem__Group__0__Impl rule__RawJsonFieldItem__Group__1 ;
    public final void rule__RawJsonFieldItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4254:1: ( rule__RawJsonFieldItem__Group__0__Impl rule__RawJsonFieldItem__Group__1 )
            // InternalCurlBetterThanHttpie.g:4255:2: rule__RawJsonFieldItem__Group__0__Impl rule__RawJsonFieldItem__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__RawJsonFieldItem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RawJsonFieldItem__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RawJsonFieldItem__Group__0"


    // $ANTLR start "rule__RawJsonFieldItem__Group__0__Impl"
    // InternalCurlBetterThanHttpie.g:4262:1: rule__RawJsonFieldItem__Group__0__Impl : ( ( rule__RawJsonFieldItem__FieldAssignment_0 ) ) ;
    public final void rule__RawJsonFieldItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4266:1: ( ( ( rule__RawJsonFieldItem__FieldAssignment_0 ) ) )
            // InternalCurlBetterThanHttpie.g:4267:1: ( ( rule__RawJsonFieldItem__FieldAssignment_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:4267:1: ( ( rule__RawJsonFieldItem__FieldAssignment_0 ) )
            // InternalCurlBetterThanHttpie.g:4268:2: ( rule__RawJsonFieldItem__FieldAssignment_0 )
            {
             before(grammarAccess.getRawJsonFieldItemAccess().getFieldAssignment_0()); 
            // InternalCurlBetterThanHttpie.g:4269:2: ( rule__RawJsonFieldItem__FieldAssignment_0 )
            // InternalCurlBetterThanHttpie.g:4269:3: rule__RawJsonFieldItem__FieldAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RawJsonFieldItem__FieldAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRawJsonFieldItemAccess().getFieldAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RawJsonFieldItem__Group__0__Impl"


    // $ANTLR start "rule__RawJsonFieldItem__Group__1"
    // InternalCurlBetterThanHttpie.g:4277:1: rule__RawJsonFieldItem__Group__1 : rule__RawJsonFieldItem__Group__1__Impl rule__RawJsonFieldItem__Group__2 ;
    public final void rule__RawJsonFieldItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4281:1: ( rule__RawJsonFieldItem__Group__1__Impl rule__RawJsonFieldItem__Group__2 )
            // InternalCurlBetterThanHttpie.g:4282:2: rule__RawJsonFieldItem__Group__1__Impl rule__RawJsonFieldItem__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__RawJsonFieldItem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RawJsonFieldItem__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RawJsonFieldItem__Group__1"


    // $ANTLR start "rule__RawJsonFieldItem__Group__1__Impl"
    // InternalCurlBetterThanHttpie.g:4289:1: rule__RawJsonFieldItem__Group__1__Impl : ( ':=' ) ;
    public final void rule__RawJsonFieldItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4293:1: ( ( ':=' ) )
            // InternalCurlBetterThanHttpie.g:4294:1: ( ':=' )
            {
            // InternalCurlBetterThanHttpie.g:4294:1: ( ':=' )
            // InternalCurlBetterThanHttpie.g:4295:2: ':='
            {
             before(grammarAccess.getRawJsonFieldItemAccess().getColonEqualsSignKeyword_1()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getRawJsonFieldItemAccess().getColonEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RawJsonFieldItem__Group__1__Impl"


    // $ANTLR start "rule__RawJsonFieldItem__Group__2"
    // InternalCurlBetterThanHttpie.g:4304:1: rule__RawJsonFieldItem__Group__2 : rule__RawJsonFieldItem__Group__2__Impl ;
    public final void rule__RawJsonFieldItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4308:1: ( rule__RawJsonFieldItem__Group__2__Impl )
            // InternalCurlBetterThanHttpie.g:4309:2: rule__RawJsonFieldItem__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RawJsonFieldItem__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RawJsonFieldItem__Group__2"


    // $ANTLR start "rule__RawJsonFieldItem__Group__2__Impl"
    // InternalCurlBetterThanHttpie.g:4315:1: rule__RawJsonFieldItem__Group__2__Impl : ( ( rule__RawJsonFieldItem__Alternatives_2 ) ) ;
    public final void rule__RawJsonFieldItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4319:1: ( ( ( rule__RawJsonFieldItem__Alternatives_2 ) ) )
            // InternalCurlBetterThanHttpie.g:4320:1: ( ( rule__RawJsonFieldItem__Alternatives_2 ) )
            {
            // InternalCurlBetterThanHttpie.g:4320:1: ( ( rule__RawJsonFieldItem__Alternatives_2 ) )
            // InternalCurlBetterThanHttpie.g:4321:2: ( rule__RawJsonFieldItem__Alternatives_2 )
            {
             before(grammarAccess.getRawJsonFieldItemAccess().getAlternatives_2()); 
            // InternalCurlBetterThanHttpie.g:4322:2: ( rule__RawJsonFieldItem__Alternatives_2 )
            // InternalCurlBetterThanHttpie.g:4322:3: rule__RawJsonFieldItem__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__RawJsonFieldItem__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getRawJsonFieldItemAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RawJsonFieldItem__Group__2__Impl"


    // $ANTLR start "rule__RawJsonFieldItem__Group_2_1__0"
    // InternalCurlBetterThanHttpie.g:4331:1: rule__RawJsonFieldItem__Group_2_1__0 : rule__RawJsonFieldItem__Group_2_1__0__Impl rule__RawJsonFieldItem__Group_2_1__1 ;
    public final void rule__RawJsonFieldItem__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4335:1: ( rule__RawJsonFieldItem__Group_2_1__0__Impl rule__RawJsonFieldItem__Group_2_1__1 )
            // InternalCurlBetterThanHttpie.g:4336:2: rule__RawJsonFieldItem__Group_2_1__0__Impl rule__RawJsonFieldItem__Group_2_1__1
            {
            pushFollow(FOLLOW_13);
            rule__RawJsonFieldItem__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RawJsonFieldItem__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RawJsonFieldItem__Group_2_1__0"


    // $ANTLR start "rule__RawJsonFieldItem__Group_2_1__0__Impl"
    // InternalCurlBetterThanHttpie.g:4343:1: rule__RawJsonFieldItem__Group_2_1__0__Impl : ( '@' ) ;
    public final void rule__RawJsonFieldItem__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4347:1: ( ( '@' ) )
            // InternalCurlBetterThanHttpie.g:4348:1: ( '@' )
            {
            // InternalCurlBetterThanHttpie.g:4348:1: ( '@' )
            // InternalCurlBetterThanHttpie.g:4349:2: '@'
            {
             before(grammarAccess.getRawJsonFieldItemAccess().getCommercialAtKeyword_2_1_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getRawJsonFieldItemAccess().getCommercialAtKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RawJsonFieldItem__Group_2_1__0__Impl"


    // $ANTLR start "rule__RawJsonFieldItem__Group_2_1__1"
    // InternalCurlBetterThanHttpie.g:4358:1: rule__RawJsonFieldItem__Group_2_1__1 : rule__RawJsonFieldItem__Group_2_1__1__Impl ;
    public final void rule__RawJsonFieldItem__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4362:1: ( rule__RawJsonFieldItem__Group_2_1__1__Impl )
            // InternalCurlBetterThanHttpie.g:4363:2: rule__RawJsonFieldItem__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RawJsonFieldItem__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RawJsonFieldItem__Group_2_1__1"


    // $ANTLR start "rule__RawJsonFieldItem__Group_2_1__1__Impl"
    // InternalCurlBetterThanHttpie.g:4369:1: rule__RawJsonFieldItem__Group_2_1__1__Impl : ( ( rule__RawJsonFieldItem__ValueAssignment_2_1_1 ) ) ;
    public final void rule__RawJsonFieldItem__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4373:1: ( ( ( rule__RawJsonFieldItem__ValueAssignment_2_1_1 ) ) )
            // InternalCurlBetterThanHttpie.g:4374:1: ( ( rule__RawJsonFieldItem__ValueAssignment_2_1_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:4374:1: ( ( rule__RawJsonFieldItem__ValueAssignment_2_1_1 ) )
            // InternalCurlBetterThanHttpie.g:4375:2: ( rule__RawJsonFieldItem__ValueAssignment_2_1_1 )
            {
             before(grammarAccess.getRawJsonFieldItemAccess().getValueAssignment_2_1_1()); 
            // InternalCurlBetterThanHttpie.g:4376:2: ( rule__RawJsonFieldItem__ValueAssignment_2_1_1 )
            // InternalCurlBetterThanHttpie.g:4376:3: rule__RawJsonFieldItem__ValueAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__RawJsonFieldItem__ValueAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRawJsonFieldItemAccess().getValueAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RawJsonFieldItem__Group_2_1__1__Impl"


    // $ANTLR start "rule__Member__Group__0"
    // InternalCurlBetterThanHttpie.g:4385:1: rule__Member__Group__0 : rule__Member__Group__0__Impl rule__Member__Group__1 ;
    public final void rule__Member__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4389:1: ( rule__Member__Group__0__Impl rule__Member__Group__1 )
            // InternalCurlBetterThanHttpie.g:4390:2: rule__Member__Group__0__Impl rule__Member__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__Member__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Member__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__Group__0"


    // $ANTLR start "rule__Member__Group__0__Impl"
    // InternalCurlBetterThanHttpie.g:4397:1: rule__Member__Group__0__Impl : ( ( rule__Member__Group_0__0 ) ) ;
    public final void rule__Member__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4401:1: ( ( ( rule__Member__Group_0__0 ) ) )
            // InternalCurlBetterThanHttpie.g:4402:1: ( ( rule__Member__Group_0__0 ) )
            {
            // InternalCurlBetterThanHttpie.g:4402:1: ( ( rule__Member__Group_0__0 ) )
            // InternalCurlBetterThanHttpie.g:4403:2: ( rule__Member__Group_0__0 )
            {
             before(grammarAccess.getMemberAccess().getGroup_0()); 
            // InternalCurlBetterThanHttpie.g:4404:2: ( rule__Member__Group_0__0 )
            // InternalCurlBetterThanHttpie.g:4404:3: rule__Member__Group_0__0
            {
            pushFollow(FOLLOW_2);
            rule__Member__Group_0__0();

            state._fsp--;


            }

             after(grammarAccess.getMemberAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__Group__0__Impl"


    // $ANTLR start "rule__Member__Group__1"
    // InternalCurlBetterThanHttpie.g:4412:1: rule__Member__Group__1 : rule__Member__Group__1__Impl rule__Member__Group__2 ;
    public final void rule__Member__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4416:1: ( rule__Member__Group__1__Impl rule__Member__Group__2 )
            // InternalCurlBetterThanHttpie.g:4417:2: rule__Member__Group__1__Impl rule__Member__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__Member__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Member__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__Group__1"


    // $ANTLR start "rule__Member__Group__1__Impl"
    // InternalCurlBetterThanHttpie.g:4424:1: rule__Member__Group__1__Impl : ( ( RULE_WS )? ) ;
    public final void rule__Member__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4428:1: ( ( ( RULE_WS )? ) )
            // InternalCurlBetterThanHttpie.g:4429:1: ( ( RULE_WS )? )
            {
            // InternalCurlBetterThanHttpie.g:4429:1: ( ( RULE_WS )? )
            // InternalCurlBetterThanHttpie.g:4430:2: ( RULE_WS )?
            {
             before(grammarAccess.getMemberAccess().getWSTerminalRuleCall_1()); 
            // InternalCurlBetterThanHttpie.g:4431:2: ( RULE_WS )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_WS) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:4431:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getMemberAccess().getWSTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__Group__1__Impl"


    // $ANTLR start "rule__Member__Group__2"
    // InternalCurlBetterThanHttpie.g:4439:1: rule__Member__Group__2 : rule__Member__Group__2__Impl rule__Member__Group__3 ;
    public final void rule__Member__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4443:1: ( rule__Member__Group__2__Impl rule__Member__Group__3 )
            // InternalCurlBetterThanHttpie.g:4444:2: rule__Member__Group__2__Impl rule__Member__Group__3
            {
            pushFollow(FOLLOW_35);
            rule__Member__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Member__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__Group__2"


    // $ANTLR start "rule__Member__Group__2__Impl"
    // InternalCurlBetterThanHttpie.g:4451:1: rule__Member__Group__2__Impl : ( ':' ) ;
    public final void rule__Member__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4455:1: ( ( ':' ) )
            // InternalCurlBetterThanHttpie.g:4456:1: ( ':' )
            {
            // InternalCurlBetterThanHttpie.g:4456:1: ( ':' )
            // InternalCurlBetterThanHttpie.g:4457:2: ':'
            {
             before(grammarAccess.getMemberAccess().getColonKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getMemberAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__Group__2__Impl"


    // $ANTLR start "rule__Member__Group__3"
    // InternalCurlBetterThanHttpie.g:4466:1: rule__Member__Group__3 : rule__Member__Group__3__Impl rule__Member__Group__4 ;
    public final void rule__Member__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4470:1: ( rule__Member__Group__3__Impl rule__Member__Group__4 )
            // InternalCurlBetterThanHttpie.g:4471:2: rule__Member__Group__3__Impl rule__Member__Group__4
            {
            pushFollow(FOLLOW_35);
            rule__Member__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Member__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__Group__3"


    // $ANTLR start "rule__Member__Group__3__Impl"
    // InternalCurlBetterThanHttpie.g:4478:1: rule__Member__Group__3__Impl : ( ( RULE_WS )? ) ;
    public final void rule__Member__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4482:1: ( ( ( RULE_WS )? ) )
            // InternalCurlBetterThanHttpie.g:4483:1: ( ( RULE_WS )? )
            {
            // InternalCurlBetterThanHttpie.g:4483:1: ( ( RULE_WS )? )
            // InternalCurlBetterThanHttpie.g:4484:2: ( RULE_WS )?
            {
             before(grammarAccess.getMemberAccess().getWSTerminalRuleCall_3()); 
            // InternalCurlBetterThanHttpie.g:4485:2: ( RULE_WS )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_WS) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:4485:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getMemberAccess().getWSTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__Group__3__Impl"


    // $ANTLR start "rule__Member__Group__4"
    // InternalCurlBetterThanHttpie.g:4493:1: rule__Member__Group__4 : rule__Member__Group__4__Impl ;
    public final void rule__Member__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4497:1: ( rule__Member__Group__4__Impl )
            // InternalCurlBetterThanHttpie.g:4498:2: rule__Member__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Member__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__Group__4"


    // $ANTLR start "rule__Member__Group__4__Impl"
    // InternalCurlBetterThanHttpie.g:4504:1: rule__Member__Group__4__Impl : ( ( rule__Member__ValueAssignment_4 ) ) ;
    public final void rule__Member__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4508:1: ( ( ( rule__Member__ValueAssignment_4 ) ) )
            // InternalCurlBetterThanHttpie.g:4509:1: ( ( rule__Member__ValueAssignment_4 ) )
            {
            // InternalCurlBetterThanHttpie.g:4509:1: ( ( rule__Member__ValueAssignment_4 ) )
            // InternalCurlBetterThanHttpie.g:4510:2: ( rule__Member__ValueAssignment_4 )
            {
             before(grammarAccess.getMemberAccess().getValueAssignment_4()); 
            // InternalCurlBetterThanHttpie.g:4511:2: ( rule__Member__ValueAssignment_4 )
            // InternalCurlBetterThanHttpie.g:4511:3: rule__Member__ValueAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Member__ValueAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMemberAccess().getValueAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__Group__4__Impl"


    // $ANTLR start "rule__Member__Group_0__0"
    // InternalCurlBetterThanHttpie.g:4520:1: rule__Member__Group_0__0 : rule__Member__Group_0__0__Impl rule__Member__Group_0__1 ;
    public final void rule__Member__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4524:1: ( rule__Member__Group_0__0__Impl rule__Member__Group_0__1 )
            // InternalCurlBetterThanHttpie.g:4525:2: rule__Member__Group_0__0__Impl rule__Member__Group_0__1
            {
            pushFollow(FOLLOW_13);
            rule__Member__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Member__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__Group_0__0"


    // $ANTLR start "rule__Member__Group_0__0__Impl"
    // InternalCurlBetterThanHttpie.g:4532:1: rule__Member__Group_0__0__Impl : ( '\\'' ) ;
    public final void rule__Member__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4536:1: ( ( '\\'' ) )
            // InternalCurlBetterThanHttpie.g:4537:1: ( '\\'' )
            {
            // InternalCurlBetterThanHttpie.g:4537:1: ( '\\'' )
            // InternalCurlBetterThanHttpie.g:4538:2: '\\''
            {
             before(grammarAccess.getMemberAccess().getApostropheKeyword_0_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getMemberAccess().getApostropheKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__Group_0__0__Impl"


    // $ANTLR start "rule__Member__Group_0__1"
    // InternalCurlBetterThanHttpie.g:4547:1: rule__Member__Group_0__1 : rule__Member__Group_0__1__Impl rule__Member__Group_0__2 ;
    public final void rule__Member__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4551:1: ( rule__Member__Group_0__1__Impl rule__Member__Group_0__2 )
            // InternalCurlBetterThanHttpie.g:4552:2: rule__Member__Group_0__1__Impl rule__Member__Group_0__2
            {
            pushFollow(FOLLOW_36);
            rule__Member__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Member__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__Group_0__1"


    // $ANTLR start "rule__Member__Group_0__1__Impl"
    // InternalCurlBetterThanHttpie.g:4559:1: rule__Member__Group_0__1__Impl : ( ( rule__Member__KeyAssignment_0_1 ) ) ;
    public final void rule__Member__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4563:1: ( ( ( rule__Member__KeyAssignment_0_1 ) ) )
            // InternalCurlBetterThanHttpie.g:4564:1: ( ( rule__Member__KeyAssignment_0_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:4564:1: ( ( rule__Member__KeyAssignment_0_1 ) )
            // InternalCurlBetterThanHttpie.g:4565:2: ( rule__Member__KeyAssignment_0_1 )
            {
             before(grammarAccess.getMemberAccess().getKeyAssignment_0_1()); 
            // InternalCurlBetterThanHttpie.g:4566:2: ( rule__Member__KeyAssignment_0_1 )
            // InternalCurlBetterThanHttpie.g:4566:3: rule__Member__KeyAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Member__KeyAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getMemberAccess().getKeyAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__Group_0__1__Impl"


    // $ANTLR start "rule__Member__Group_0__2"
    // InternalCurlBetterThanHttpie.g:4574:1: rule__Member__Group_0__2 : rule__Member__Group_0__2__Impl ;
    public final void rule__Member__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4578:1: ( rule__Member__Group_0__2__Impl )
            // InternalCurlBetterThanHttpie.g:4579:2: rule__Member__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Member__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__Group_0__2"


    // $ANTLR start "rule__Member__Group_0__2__Impl"
    // InternalCurlBetterThanHttpie.g:4585:1: rule__Member__Group_0__2__Impl : ( '\\'' ) ;
    public final void rule__Member__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4589:1: ( ( '\\'' ) )
            // InternalCurlBetterThanHttpie.g:4590:1: ( '\\'' )
            {
            // InternalCurlBetterThanHttpie.g:4590:1: ( '\\'' )
            // InternalCurlBetterThanHttpie.g:4591:2: '\\''
            {
             before(grammarAccess.getMemberAccess().getApostropheKeyword_0_2()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getMemberAccess().getApostropheKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__Group_0__2__Impl"


    // $ANTLR start "rule__JsonObject__Group__0"
    // InternalCurlBetterThanHttpie.g:4601:1: rule__JsonObject__Group__0 : rule__JsonObject__Group__0__Impl rule__JsonObject__Group__1 ;
    public final void rule__JsonObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4605:1: ( rule__JsonObject__Group__0__Impl rule__JsonObject__Group__1 )
            // InternalCurlBetterThanHttpie.g:4606:2: rule__JsonObject__Group__0__Impl rule__JsonObject__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__JsonObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JsonObject__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonObject__Group__0"


    // $ANTLR start "rule__JsonObject__Group__0__Impl"
    // InternalCurlBetterThanHttpie.g:4613:1: rule__JsonObject__Group__0__Impl : ( () ) ;
    public final void rule__JsonObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4617:1: ( ( () ) )
            // InternalCurlBetterThanHttpie.g:4618:1: ( () )
            {
            // InternalCurlBetterThanHttpie.g:4618:1: ( () )
            // InternalCurlBetterThanHttpie.g:4619:2: ()
            {
             before(grammarAccess.getJsonObjectAccess().getJsonObjectAction_0()); 
            // InternalCurlBetterThanHttpie.g:4620:2: ()
            // InternalCurlBetterThanHttpie.g:4620:3: 
            {
            }

             after(grammarAccess.getJsonObjectAccess().getJsonObjectAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonObject__Group__0__Impl"


    // $ANTLR start "rule__JsonObject__Group__1"
    // InternalCurlBetterThanHttpie.g:4628:1: rule__JsonObject__Group__1 : rule__JsonObject__Group__1__Impl rule__JsonObject__Group__2 ;
    public final void rule__JsonObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4632:1: ( rule__JsonObject__Group__1__Impl rule__JsonObject__Group__2 )
            // InternalCurlBetterThanHttpie.g:4633:2: rule__JsonObject__Group__1__Impl rule__JsonObject__Group__2
            {
            pushFollow(FOLLOW_38);
            rule__JsonObject__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JsonObject__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonObject__Group__1"


    // $ANTLR start "rule__JsonObject__Group__1__Impl"
    // InternalCurlBetterThanHttpie.g:4640:1: rule__JsonObject__Group__1__Impl : ( '{' ) ;
    public final void rule__JsonObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4644:1: ( ( '{' ) )
            // InternalCurlBetterThanHttpie.g:4645:1: ( '{' )
            {
            // InternalCurlBetterThanHttpie.g:4645:1: ( '{' )
            // InternalCurlBetterThanHttpie.g:4646:2: '{'
            {
             before(grammarAccess.getJsonObjectAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getJsonObjectAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonObject__Group__1__Impl"


    // $ANTLR start "rule__JsonObject__Group__2"
    // InternalCurlBetterThanHttpie.g:4655:1: rule__JsonObject__Group__2 : rule__JsonObject__Group__2__Impl rule__JsonObject__Group__3 ;
    public final void rule__JsonObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4659:1: ( rule__JsonObject__Group__2__Impl rule__JsonObject__Group__3 )
            // InternalCurlBetterThanHttpie.g:4660:2: rule__JsonObject__Group__2__Impl rule__JsonObject__Group__3
            {
            pushFollow(FOLLOW_38);
            rule__JsonObject__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JsonObject__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonObject__Group__2"


    // $ANTLR start "rule__JsonObject__Group__2__Impl"
    // InternalCurlBetterThanHttpie.g:4667:1: rule__JsonObject__Group__2__Impl : ( ( rule__JsonObject__Group_2__0 )? ) ;
    public final void rule__JsonObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4671:1: ( ( ( rule__JsonObject__Group_2__0 )? ) )
            // InternalCurlBetterThanHttpie.g:4672:1: ( ( rule__JsonObject__Group_2__0 )? )
            {
            // InternalCurlBetterThanHttpie.g:4672:1: ( ( rule__JsonObject__Group_2__0 )? )
            // InternalCurlBetterThanHttpie.g:4673:2: ( rule__JsonObject__Group_2__0 )?
            {
             before(grammarAccess.getJsonObjectAccess().getGroup_2()); 
            // InternalCurlBetterThanHttpie.g:4674:2: ( rule__JsonObject__Group_2__0 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_WS||LA58_0==50) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:4674:3: rule__JsonObject__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__JsonObject__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJsonObjectAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonObject__Group__2__Impl"


    // $ANTLR start "rule__JsonObject__Group__3"
    // InternalCurlBetterThanHttpie.g:4682:1: rule__JsonObject__Group__3 : rule__JsonObject__Group__3__Impl ;
    public final void rule__JsonObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4686:1: ( rule__JsonObject__Group__3__Impl )
            // InternalCurlBetterThanHttpie.g:4687:2: rule__JsonObject__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JsonObject__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonObject__Group__3"


    // $ANTLR start "rule__JsonObject__Group__3__Impl"
    // InternalCurlBetterThanHttpie.g:4693:1: rule__JsonObject__Group__3__Impl : ( '}' ) ;
    public final void rule__JsonObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4697:1: ( ( '}' ) )
            // InternalCurlBetterThanHttpie.g:4698:1: ( '}' )
            {
            // InternalCurlBetterThanHttpie.g:4698:1: ( '}' )
            // InternalCurlBetterThanHttpie.g:4699:2: '}'
            {
             before(grammarAccess.getJsonObjectAccess().getRightCurlyBracketKeyword_3()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getJsonObjectAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonObject__Group__3__Impl"


    // $ANTLR start "rule__JsonObject__Group_2__0"
    // InternalCurlBetterThanHttpie.g:4709:1: rule__JsonObject__Group_2__0 : rule__JsonObject__Group_2__0__Impl rule__JsonObject__Group_2__1 ;
    public final void rule__JsonObject__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4713:1: ( rule__JsonObject__Group_2__0__Impl rule__JsonObject__Group_2__1 )
            // InternalCurlBetterThanHttpie.g:4714:2: rule__JsonObject__Group_2__0__Impl rule__JsonObject__Group_2__1
            {
            pushFollow(FOLLOW_39);
            rule__JsonObject__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JsonObject__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonObject__Group_2__0"


    // $ANTLR start "rule__JsonObject__Group_2__0__Impl"
    // InternalCurlBetterThanHttpie.g:4721:1: rule__JsonObject__Group_2__0__Impl : ( ( rule__JsonObject__Group_2_0__0 ) ) ;
    public final void rule__JsonObject__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4725:1: ( ( ( rule__JsonObject__Group_2_0__0 ) ) )
            // InternalCurlBetterThanHttpie.g:4726:1: ( ( rule__JsonObject__Group_2_0__0 ) )
            {
            // InternalCurlBetterThanHttpie.g:4726:1: ( ( rule__JsonObject__Group_2_0__0 ) )
            // InternalCurlBetterThanHttpie.g:4727:2: ( rule__JsonObject__Group_2_0__0 )
            {
             before(grammarAccess.getJsonObjectAccess().getGroup_2_0()); 
            // InternalCurlBetterThanHttpie.g:4728:2: ( rule__JsonObject__Group_2_0__0 )
            // InternalCurlBetterThanHttpie.g:4728:3: rule__JsonObject__Group_2_0__0
            {
            pushFollow(FOLLOW_2);
            rule__JsonObject__Group_2_0__0();

            state._fsp--;


            }

             after(grammarAccess.getJsonObjectAccess().getGroup_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonObject__Group_2__0__Impl"


    // $ANTLR start "rule__JsonObject__Group_2__1"
    // InternalCurlBetterThanHttpie.g:4736:1: rule__JsonObject__Group_2__1 : rule__JsonObject__Group_2__1__Impl rule__JsonObject__Group_2__2 ;
    public final void rule__JsonObject__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4740:1: ( rule__JsonObject__Group_2__1__Impl rule__JsonObject__Group_2__2 )
            // InternalCurlBetterThanHttpie.g:4741:2: rule__JsonObject__Group_2__1__Impl rule__JsonObject__Group_2__2
            {
            pushFollow(FOLLOW_39);
            rule__JsonObject__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JsonObject__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonObject__Group_2__1"


    // $ANTLR start "rule__JsonObject__Group_2__1__Impl"
    // InternalCurlBetterThanHttpie.g:4748:1: rule__JsonObject__Group_2__1__Impl : ( ( rule__JsonObject__Group_2_1__0 )* ) ;
    public final void rule__JsonObject__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4752:1: ( ( ( rule__JsonObject__Group_2_1__0 )* ) )
            // InternalCurlBetterThanHttpie.g:4753:1: ( ( rule__JsonObject__Group_2_1__0 )* )
            {
            // InternalCurlBetterThanHttpie.g:4753:1: ( ( rule__JsonObject__Group_2_1__0 )* )
            // InternalCurlBetterThanHttpie.g:4754:2: ( rule__JsonObject__Group_2_1__0 )*
            {
             before(grammarAccess.getJsonObjectAccess().getGroup_2_1()); 
            // InternalCurlBetterThanHttpie.g:4755:2: ( rule__JsonObject__Group_2_1__0 )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==RULE_WS) ) {
                    int LA59_1 = input.LA(2);

                    if ( (LA59_1==53) ) {
                        alt59=1;
                    }


                }
                else if ( (LA59_0==53) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalCurlBetterThanHttpie.g:4755:3: rule__JsonObject__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_40);
            	    rule__JsonObject__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);

             after(grammarAccess.getJsonObjectAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonObject__Group_2__1__Impl"


    // $ANTLR start "rule__JsonObject__Group_2__2"
    // InternalCurlBetterThanHttpie.g:4763:1: rule__JsonObject__Group_2__2 : rule__JsonObject__Group_2__2__Impl ;
    public final void rule__JsonObject__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4767:1: ( rule__JsonObject__Group_2__2__Impl )
            // InternalCurlBetterThanHttpie.g:4768:2: rule__JsonObject__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JsonObject__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonObject__Group_2__2"


    // $ANTLR start "rule__JsonObject__Group_2__2__Impl"
    // InternalCurlBetterThanHttpie.g:4774:1: rule__JsonObject__Group_2__2__Impl : ( ( RULE_WS )? ) ;
    public final void rule__JsonObject__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4778:1: ( ( ( RULE_WS )? ) )
            // InternalCurlBetterThanHttpie.g:4779:1: ( ( RULE_WS )? )
            {
            // InternalCurlBetterThanHttpie.g:4779:1: ( ( RULE_WS )? )
            // InternalCurlBetterThanHttpie.g:4780:2: ( RULE_WS )?
            {
             before(grammarAccess.getJsonObjectAccess().getWSTerminalRuleCall_2_2()); 
            // InternalCurlBetterThanHttpie.g:4781:2: ( RULE_WS )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_WS) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:4781:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getJsonObjectAccess().getWSTerminalRuleCall_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonObject__Group_2__2__Impl"


    // $ANTLR start "rule__JsonObject__Group_2_0__0"
    // InternalCurlBetterThanHttpie.g:4790:1: rule__JsonObject__Group_2_0__0 : rule__JsonObject__Group_2_0__0__Impl rule__JsonObject__Group_2_0__1 ;
    public final void rule__JsonObject__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4794:1: ( rule__JsonObject__Group_2_0__0__Impl rule__JsonObject__Group_2_0__1 )
            // InternalCurlBetterThanHttpie.g:4795:2: rule__JsonObject__Group_2_0__0__Impl rule__JsonObject__Group_2_0__1
            {
            pushFollow(FOLLOW_41);
            rule__JsonObject__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JsonObject__Group_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonObject__Group_2_0__0"


    // $ANTLR start "rule__JsonObject__Group_2_0__0__Impl"
    // InternalCurlBetterThanHttpie.g:4802:1: rule__JsonObject__Group_2_0__0__Impl : ( ( RULE_WS )? ) ;
    public final void rule__JsonObject__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4806:1: ( ( ( RULE_WS )? ) )
            // InternalCurlBetterThanHttpie.g:4807:1: ( ( RULE_WS )? )
            {
            // InternalCurlBetterThanHttpie.g:4807:1: ( ( RULE_WS )? )
            // InternalCurlBetterThanHttpie.g:4808:2: ( RULE_WS )?
            {
             before(grammarAccess.getJsonObjectAccess().getWSTerminalRuleCall_2_0_0()); 
            // InternalCurlBetterThanHttpie.g:4809:2: ( RULE_WS )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_WS) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:4809:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getJsonObjectAccess().getWSTerminalRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonObject__Group_2_0__0__Impl"


    // $ANTLR start "rule__JsonObject__Group_2_0__1"
    // InternalCurlBetterThanHttpie.g:4817:1: rule__JsonObject__Group_2_0__1 : rule__JsonObject__Group_2_0__1__Impl ;
    public final void rule__JsonObject__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4821:1: ( rule__JsonObject__Group_2_0__1__Impl )
            // InternalCurlBetterThanHttpie.g:4822:2: rule__JsonObject__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JsonObject__Group_2_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonObject__Group_2_0__1"


    // $ANTLR start "rule__JsonObject__Group_2_0__1__Impl"
    // InternalCurlBetterThanHttpie.g:4828:1: rule__JsonObject__Group_2_0__1__Impl : ( ( rule__JsonObject__MembersAssignment_2_0_1 ) ) ;
    public final void rule__JsonObject__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4832:1: ( ( ( rule__JsonObject__MembersAssignment_2_0_1 ) ) )
            // InternalCurlBetterThanHttpie.g:4833:1: ( ( rule__JsonObject__MembersAssignment_2_0_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:4833:1: ( ( rule__JsonObject__MembersAssignment_2_0_1 ) )
            // InternalCurlBetterThanHttpie.g:4834:2: ( rule__JsonObject__MembersAssignment_2_0_1 )
            {
             before(grammarAccess.getJsonObjectAccess().getMembersAssignment_2_0_1()); 
            // InternalCurlBetterThanHttpie.g:4835:2: ( rule__JsonObject__MembersAssignment_2_0_1 )
            // InternalCurlBetterThanHttpie.g:4835:3: rule__JsonObject__MembersAssignment_2_0_1
            {
            pushFollow(FOLLOW_2);
            rule__JsonObject__MembersAssignment_2_0_1();

            state._fsp--;


            }

             after(grammarAccess.getJsonObjectAccess().getMembersAssignment_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonObject__Group_2_0__1__Impl"


    // $ANTLR start "rule__JsonObject__Group_2_1__0"
    // InternalCurlBetterThanHttpie.g:4844:1: rule__JsonObject__Group_2_1__0 : rule__JsonObject__Group_2_1__0__Impl rule__JsonObject__Group_2_1__1 ;
    public final void rule__JsonObject__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4848:1: ( rule__JsonObject__Group_2_1__0__Impl rule__JsonObject__Group_2_1__1 )
            // InternalCurlBetterThanHttpie.g:4849:2: rule__JsonObject__Group_2_1__0__Impl rule__JsonObject__Group_2_1__1
            {
            pushFollow(FOLLOW_39);
            rule__JsonObject__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JsonObject__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonObject__Group_2_1__0"


    // $ANTLR start "rule__JsonObject__Group_2_1__0__Impl"
    // InternalCurlBetterThanHttpie.g:4856:1: rule__JsonObject__Group_2_1__0__Impl : ( ( RULE_WS )? ) ;
    public final void rule__JsonObject__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4860:1: ( ( ( RULE_WS )? ) )
            // InternalCurlBetterThanHttpie.g:4861:1: ( ( RULE_WS )? )
            {
            // InternalCurlBetterThanHttpie.g:4861:1: ( ( RULE_WS )? )
            // InternalCurlBetterThanHttpie.g:4862:2: ( RULE_WS )?
            {
             before(grammarAccess.getJsonObjectAccess().getWSTerminalRuleCall_2_1_0()); 
            // InternalCurlBetterThanHttpie.g:4863:2: ( RULE_WS )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_WS) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:4863:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getJsonObjectAccess().getWSTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonObject__Group_2_1__0__Impl"


    // $ANTLR start "rule__JsonObject__Group_2_1__1"
    // InternalCurlBetterThanHttpie.g:4871:1: rule__JsonObject__Group_2_1__1 : rule__JsonObject__Group_2_1__1__Impl rule__JsonObject__Group_2_1__2 ;
    public final void rule__JsonObject__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4875:1: ( rule__JsonObject__Group_2_1__1__Impl rule__JsonObject__Group_2_1__2 )
            // InternalCurlBetterThanHttpie.g:4876:2: rule__JsonObject__Group_2_1__1__Impl rule__JsonObject__Group_2_1__2
            {
            pushFollow(FOLLOW_41);
            rule__JsonObject__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JsonObject__Group_2_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonObject__Group_2_1__1"


    // $ANTLR start "rule__JsonObject__Group_2_1__1__Impl"
    // InternalCurlBetterThanHttpie.g:4883:1: rule__JsonObject__Group_2_1__1__Impl : ( ',' ) ;
    public final void rule__JsonObject__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4887:1: ( ( ',' ) )
            // InternalCurlBetterThanHttpie.g:4888:1: ( ',' )
            {
            // InternalCurlBetterThanHttpie.g:4888:1: ( ',' )
            // InternalCurlBetterThanHttpie.g:4889:2: ','
            {
             before(grammarAccess.getJsonObjectAccess().getCommaKeyword_2_1_1()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getJsonObjectAccess().getCommaKeyword_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonObject__Group_2_1__1__Impl"


    // $ANTLR start "rule__JsonObject__Group_2_1__2"
    // InternalCurlBetterThanHttpie.g:4898:1: rule__JsonObject__Group_2_1__2 : rule__JsonObject__Group_2_1__2__Impl rule__JsonObject__Group_2_1__3 ;
    public final void rule__JsonObject__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4902:1: ( rule__JsonObject__Group_2_1__2__Impl rule__JsonObject__Group_2_1__3 )
            // InternalCurlBetterThanHttpie.g:4903:2: rule__JsonObject__Group_2_1__2__Impl rule__JsonObject__Group_2_1__3
            {
            pushFollow(FOLLOW_41);
            rule__JsonObject__Group_2_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JsonObject__Group_2_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonObject__Group_2_1__2"


    // $ANTLR start "rule__JsonObject__Group_2_1__2__Impl"
    // InternalCurlBetterThanHttpie.g:4910:1: rule__JsonObject__Group_2_1__2__Impl : ( ( RULE_WS )? ) ;
    public final void rule__JsonObject__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4914:1: ( ( ( RULE_WS )? ) )
            // InternalCurlBetterThanHttpie.g:4915:1: ( ( RULE_WS )? )
            {
            // InternalCurlBetterThanHttpie.g:4915:1: ( ( RULE_WS )? )
            // InternalCurlBetterThanHttpie.g:4916:2: ( RULE_WS )?
            {
             before(grammarAccess.getJsonObjectAccess().getWSTerminalRuleCall_2_1_2()); 
            // InternalCurlBetterThanHttpie.g:4917:2: ( RULE_WS )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_WS) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:4917:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getJsonObjectAccess().getWSTerminalRuleCall_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonObject__Group_2_1__2__Impl"


    // $ANTLR start "rule__JsonObject__Group_2_1__3"
    // InternalCurlBetterThanHttpie.g:4925:1: rule__JsonObject__Group_2_1__3 : rule__JsonObject__Group_2_1__3__Impl ;
    public final void rule__JsonObject__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4929:1: ( rule__JsonObject__Group_2_1__3__Impl )
            // InternalCurlBetterThanHttpie.g:4930:2: rule__JsonObject__Group_2_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JsonObject__Group_2_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonObject__Group_2_1__3"


    // $ANTLR start "rule__JsonObject__Group_2_1__3__Impl"
    // InternalCurlBetterThanHttpie.g:4936:1: rule__JsonObject__Group_2_1__3__Impl : ( ( rule__JsonObject__MembersAssignment_2_1_3 ) ) ;
    public final void rule__JsonObject__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4940:1: ( ( ( rule__JsonObject__MembersAssignment_2_1_3 ) ) )
            // InternalCurlBetterThanHttpie.g:4941:1: ( ( rule__JsonObject__MembersAssignment_2_1_3 ) )
            {
            // InternalCurlBetterThanHttpie.g:4941:1: ( ( rule__JsonObject__MembersAssignment_2_1_3 ) )
            // InternalCurlBetterThanHttpie.g:4942:2: ( rule__JsonObject__MembersAssignment_2_1_3 )
            {
             before(grammarAccess.getJsonObjectAccess().getMembersAssignment_2_1_3()); 
            // InternalCurlBetterThanHttpie.g:4943:2: ( rule__JsonObject__MembersAssignment_2_1_3 )
            // InternalCurlBetterThanHttpie.g:4943:3: rule__JsonObject__MembersAssignment_2_1_3
            {
            pushFollow(FOLLOW_2);
            rule__JsonObject__MembersAssignment_2_1_3();

            state._fsp--;


            }

             after(grammarAccess.getJsonObjectAccess().getMembersAssignment_2_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonObject__Group_2_1__3__Impl"


    // $ANTLR start "rule__JsonArray__Group__0"
    // InternalCurlBetterThanHttpie.g:4952:1: rule__JsonArray__Group__0 : rule__JsonArray__Group__0__Impl rule__JsonArray__Group__1 ;
    public final void rule__JsonArray__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4956:1: ( rule__JsonArray__Group__0__Impl rule__JsonArray__Group__1 )
            // InternalCurlBetterThanHttpie.g:4957:2: rule__JsonArray__Group__0__Impl rule__JsonArray__Group__1
            {
            pushFollow(FOLLOW_42);
            rule__JsonArray__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JsonArray__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__Group__0"


    // $ANTLR start "rule__JsonArray__Group__0__Impl"
    // InternalCurlBetterThanHttpie.g:4964:1: rule__JsonArray__Group__0__Impl : ( () ) ;
    public final void rule__JsonArray__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4968:1: ( ( () ) )
            // InternalCurlBetterThanHttpie.g:4969:1: ( () )
            {
            // InternalCurlBetterThanHttpie.g:4969:1: ( () )
            // InternalCurlBetterThanHttpie.g:4970:2: ()
            {
             before(grammarAccess.getJsonArrayAccess().getJsonArrayAction_0()); 
            // InternalCurlBetterThanHttpie.g:4971:2: ()
            // InternalCurlBetterThanHttpie.g:4971:3: 
            {
            }

             after(grammarAccess.getJsonArrayAccess().getJsonArrayAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__Group__0__Impl"


    // $ANTLR start "rule__JsonArray__Group__1"
    // InternalCurlBetterThanHttpie.g:4979:1: rule__JsonArray__Group__1 : rule__JsonArray__Group__1__Impl rule__JsonArray__Group__2 ;
    public final void rule__JsonArray__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4983:1: ( rule__JsonArray__Group__1__Impl rule__JsonArray__Group__2 )
            // InternalCurlBetterThanHttpie.g:4984:2: rule__JsonArray__Group__1__Impl rule__JsonArray__Group__2
            {
            pushFollow(FOLLOW_43);
            rule__JsonArray__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JsonArray__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__Group__1"


    // $ANTLR start "rule__JsonArray__Group__1__Impl"
    // InternalCurlBetterThanHttpie.g:4991:1: rule__JsonArray__Group__1__Impl : ( '[' ) ;
    public final void rule__JsonArray__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4995:1: ( ( '[' ) )
            // InternalCurlBetterThanHttpie.g:4996:1: ( '[' )
            {
            // InternalCurlBetterThanHttpie.g:4996:1: ( '[' )
            // InternalCurlBetterThanHttpie.g:4997:2: '['
            {
             before(grammarAccess.getJsonArrayAccess().getLeftSquareBracketKeyword_1()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getJsonArrayAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__Group__1__Impl"


    // $ANTLR start "rule__JsonArray__Group__2"
    // InternalCurlBetterThanHttpie.g:5006:1: rule__JsonArray__Group__2 : rule__JsonArray__Group__2__Impl rule__JsonArray__Group__3 ;
    public final void rule__JsonArray__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5010:1: ( rule__JsonArray__Group__2__Impl rule__JsonArray__Group__3 )
            // InternalCurlBetterThanHttpie.g:5011:2: rule__JsonArray__Group__2__Impl rule__JsonArray__Group__3
            {
            pushFollow(FOLLOW_43);
            rule__JsonArray__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JsonArray__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__Group__2"


    // $ANTLR start "rule__JsonArray__Group__2__Impl"
    // InternalCurlBetterThanHttpie.g:5018:1: rule__JsonArray__Group__2__Impl : ( ( rule__JsonArray__Group_2__0 )? ) ;
    public final void rule__JsonArray__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5022:1: ( ( ( rule__JsonArray__Group_2__0 )? ) )
            // InternalCurlBetterThanHttpie.g:5023:1: ( ( rule__JsonArray__Group_2__0 )? )
            {
            // InternalCurlBetterThanHttpie.g:5023:1: ( ( rule__JsonArray__Group_2__0 )? )
            // InternalCurlBetterThanHttpie.g:5024:2: ( rule__JsonArray__Group_2__0 )?
            {
             before(grammarAccess.getJsonArrayAccess().getGroup_2()); 
            // InternalCurlBetterThanHttpie.g:5025:2: ( rule__JsonArray__Group_2__0 )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( ((LA64_0>=RULE_ID && LA64_0<=RULE_NULL)||(LA64_0>=RULE_BOOLEAN && LA64_0<=RULE_NUMBER)||LA64_0==51||LA64_0==54) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:5025:3: rule__JsonArray__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__JsonArray__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJsonArrayAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__Group__2__Impl"


    // $ANTLR start "rule__JsonArray__Group__3"
    // InternalCurlBetterThanHttpie.g:5033:1: rule__JsonArray__Group__3 : rule__JsonArray__Group__3__Impl ;
    public final void rule__JsonArray__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5037:1: ( rule__JsonArray__Group__3__Impl )
            // InternalCurlBetterThanHttpie.g:5038:2: rule__JsonArray__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JsonArray__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__Group__3"


    // $ANTLR start "rule__JsonArray__Group__3__Impl"
    // InternalCurlBetterThanHttpie.g:5044:1: rule__JsonArray__Group__3__Impl : ( ']' ) ;
    public final void rule__JsonArray__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5048:1: ( ( ']' ) )
            // InternalCurlBetterThanHttpie.g:5049:1: ( ']' )
            {
            // InternalCurlBetterThanHttpie.g:5049:1: ( ']' )
            // InternalCurlBetterThanHttpie.g:5050:2: ']'
            {
             before(grammarAccess.getJsonArrayAccess().getRightSquareBracketKeyword_3()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getJsonArrayAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__Group__3__Impl"


    // $ANTLR start "rule__JsonArray__Group_2__0"
    // InternalCurlBetterThanHttpie.g:5060:1: rule__JsonArray__Group_2__0 : rule__JsonArray__Group_2__0__Impl rule__JsonArray__Group_2__1 ;
    public final void rule__JsonArray__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5064:1: ( rule__JsonArray__Group_2__0__Impl rule__JsonArray__Group_2__1 )
            // InternalCurlBetterThanHttpie.g:5065:2: rule__JsonArray__Group_2__0__Impl rule__JsonArray__Group_2__1
            {
            pushFollow(FOLLOW_39);
            rule__JsonArray__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JsonArray__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__Group_2__0"


    // $ANTLR start "rule__JsonArray__Group_2__0__Impl"
    // InternalCurlBetterThanHttpie.g:5072:1: rule__JsonArray__Group_2__0__Impl : ( ( rule__JsonArray__Group_2_0__0 ) ) ;
    public final void rule__JsonArray__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5076:1: ( ( ( rule__JsonArray__Group_2_0__0 ) ) )
            // InternalCurlBetterThanHttpie.g:5077:1: ( ( rule__JsonArray__Group_2_0__0 ) )
            {
            // InternalCurlBetterThanHttpie.g:5077:1: ( ( rule__JsonArray__Group_2_0__0 ) )
            // InternalCurlBetterThanHttpie.g:5078:2: ( rule__JsonArray__Group_2_0__0 )
            {
             before(grammarAccess.getJsonArrayAccess().getGroup_2_0()); 
            // InternalCurlBetterThanHttpie.g:5079:2: ( rule__JsonArray__Group_2_0__0 )
            // InternalCurlBetterThanHttpie.g:5079:3: rule__JsonArray__Group_2_0__0
            {
            pushFollow(FOLLOW_2);
            rule__JsonArray__Group_2_0__0();

            state._fsp--;


            }

             after(grammarAccess.getJsonArrayAccess().getGroup_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__Group_2__0__Impl"


    // $ANTLR start "rule__JsonArray__Group_2__1"
    // InternalCurlBetterThanHttpie.g:5087:1: rule__JsonArray__Group_2__1 : rule__JsonArray__Group_2__1__Impl rule__JsonArray__Group_2__2 ;
    public final void rule__JsonArray__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5091:1: ( rule__JsonArray__Group_2__1__Impl rule__JsonArray__Group_2__2 )
            // InternalCurlBetterThanHttpie.g:5092:2: rule__JsonArray__Group_2__1__Impl rule__JsonArray__Group_2__2
            {
            pushFollow(FOLLOW_39);
            rule__JsonArray__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JsonArray__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__Group_2__1"


    // $ANTLR start "rule__JsonArray__Group_2__1__Impl"
    // InternalCurlBetterThanHttpie.g:5099:1: rule__JsonArray__Group_2__1__Impl : ( ( rule__JsonArray__Group_2_1__0 )* ) ;
    public final void rule__JsonArray__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5103:1: ( ( ( rule__JsonArray__Group_2_1__0 )* ) )
            // InternalCurlBetterThanHttpie.g:5104:1: ( ( rule__JsonArray__Group_2_1__0 )* )
            {
            // InternalCurlBetterThanHttpie.g:5104:1: ( ( rule__JsonArray__Group_2_1__0 )* )
            // InternalCurlBetterThanHttpie.g:5105:2: ( rule__JsonArray__Group_2_1__0 )*
            {
             before(grammarAccess.getJsonArrayAccess().getGroup_2_1()); 
            // InternalCurlBetterThanHttpie.g:5106:2: ( rule__JsonArray__Group_2_1__0 )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==RULE_WS) ) {
                    int LA65_1 = input.LA(2);

                    if ( (LA65_1==53) ) {
                        alt65=1;
                    }


                }
                else if ( (LA65_0==53) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // InternalCurlBetterThanHttpie.g:5106:3: rule__JsonArray__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_40);
            	    rule__JsonArray__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);

             after(grammarAccess.getJsonArrayAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__Group_2__1__Impl"


    // $ANTLR start "rule__JsonArray__Group_2__2"
    // InternalCurlBetterThanHttpie.g:5114:1: rule__JsonArray__Group_2__2 : rule__JsonArray__Group_2__2__Impl ;
    public final void rule__JsonArray__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5118:1: ( rule__JsonArray__Group_2__2__Impl )
            // InternalCurlBetterThanHttpie.g:5119:2: rule__JsonArray__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JsonArray__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__Group_2__2"


    // $ANTLR start "rule__JsonArray__Group_2__2__Impl"
    // InternalCurlBetterThanHttpie.g:5125:1: rule__JsonArray__Group_2__2__Impl : ( ( RULE_WS )? ) ;
    public final void rule__JsonArray__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5129:1: ( ( ( RULE_WS )? ) )
            // InternalCurlBetterThanHttpie.g:5130:1: ( ( RULE_WS )? )
            {
            // InternalCurlBetterThanHttpie.g:5130:1: ( ( RULE_WS )? )
            // InternalCurlBetterThanHttpie.g:5131:2: ( RULE_WS )?
            {
             before(grammarAccess.getJsonArrayAccess().getWSTerminalRuleCall_2_2()); 
            // InternalCurlBetterThanHttpie.g:5132:2: ( RULE_WS )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_WS) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:5132:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getJsonArrayAccess().getWSTerminalRuleCall_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__Group_2__2__Impl"


    // $ANTLR start "rule__JsonArray__Group_2_0__0"
    // InternalCurlBetterThanHttpie.g:5141:1: rule__JsonArray__Group_2_0__0 : rule__JsonArray__Group_2_0__0__Impl rule__JsonArray__Group_2_0__1 ;
    public final void rule__JsonArray__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5145:1: ( rule__JsonArray__Group_2_0__0__Impl rule__JsonArray__Group_2_0__1 )
            // InternalCurlBetterThanHttpie.g:5146:2: rule__JsonArray__Group_2_0__0__Impl rule__JsonArray__Group_2_0__1
            {
            pushFollow(FOLLOW_35);
            rule__JsonArray__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JsonArray__Group_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__Group_2_0__0"


    // $ANTLR start "rule__JsonArray__Group_2_0__0__Impl"
    // InternalCurlBetterThanHttpie.g:5153:1: rule__JsonArray__Group_2_0__0__Impl : ( ( RULE_WS )? ) ;
    public final void rule__JsonArray__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5157:1: ( ( ( RULE_WS )? ) )
            // InternalCurlBetterThanHttpie.g:5158:1: ( ( RULE_WS )? )
            {
            // InternalCurlBetterThanHttpie.g:5158:1: ( ( RULE_WS )? )
            // InternalCurlBetterThanHttpie.g:5159:2: ( RULE_WS )?
            {
             before(grammarAccess.getJsonArrayAccess().getWSTerminalRuleCall_2_0_0()); 
            // InternalCurlBetterThanHttpie.g:5160:2: ( RULE_WS )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_WS) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:5160:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getJsonArrayAccess().getWSTerminalRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__Group_2_0__0__Impl"


    // $ANTLR start "rule__JsonArray__Group_2_0__1"
    // InternalCurlBetterThanHttpie.g:5168:1: rule__JsonArray__Group_2_0__1 : rule__JsonArray__Group_2_0__1__Impl ;
    public final void rule__JsonArray__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5172:1: ( rule__JsonArray__Group_2_0__1__Impl )
            // InternalCurlBetterThanHttpie.g:5173:2: rule__JsonArray__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JsonArray__Group_2_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__Group_2_0__1"


    // $ANTLR start "rule__JsonArray__Group_2_0__1__Impl"
    // InternalCurlBetterThanHttpie.g:5179:1: rule__JsonArray__Group_2_0__1__Impl : ( ( rule__JsonArray__ValuesAssignment_2_0_1 ) ) ;
    public final void rule__JsonArray__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5183:1: ( ( ( rule__JsonArray__ValuesAssignment_2_0_1 ) ) )
            // InternalCurlBetterThanHttpie.g:5184:1: ( ( rule__JsonArray__ValuesAssignment_2_0_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:5184:1: ( ( rule__JsonArray__ValuesAssignment_2_0_1 ) )
            // InternalCurlBetterThanHttpie.g:5185:2: ( rule__JsonArray__ValuesAssignment_2_0_1 )
            {
             before(grammarAccess.getJsonArrayAccess().getValuesAssignment_2_0_1()); 
            // InternalCurlBetterThanHttpie.g:5186:2: ( rule__JsonArray__ValuesAssignment_2_0_1 )
            // InternalCurlBetterThanHttpie.g:5186:3: rule__JsonArray__ValuesAssignment_2_0_1
            {
            pushFollow(FOLLOW_2);
            rule__JsonArray__ValuesAssignment_2_0_1();

            state._fsp--;


            }

             after(grammarAccess.getJsonArrayAccess().getValuesAssignment_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__Group_2_0__1__Impl"


    // $ANTLR start "rule__JsonArray__Group_2_1__0"
    // InternalCurlBetterThanHttpie.g:5195:1: rule__JsonArray__Group_2_1__0 : rule__JsonArray__Group_2_1__0__Impl rule__JsonArray__Group_2_1__1 ;
    public final void rule__JsonArray__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5199:1: ( rule__JsonArray__Group_2_1__0__Impl rule__JsonArray__Group_2_1__1 )
            // InternalCurlBetterThanHttpie.g:5200:2: rule__JsonArray__Group_2_1__0__Impl rule__JsonArray__Group_2_1__1
            {
            pushFollow(FOLLOW_39);
            rule__JsonArray__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JsonArray__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__Group_2_1__0"


    // $ANTLR start "rule__JsonArray__Group_2_1__0__Impl"
    // InternalCurlBetterThanHttpie.g:5207:1: rule__JsonArray__Group_2_1__0__Impl : ( ( RULE_WS )? ) ;
    public final void rule__JsonArray__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5211:1: ( ( ( RULE_WS )? ) )
            // InternalCurlBetterThanHttpie.g:5212:1: ( ( RULE_WS )? )
            {
            // InternalCurlBetterThanHttpie.g:5212:1: ( ( RULE_WS )? )
            // InternalCurlBetterThanHttpie.g:5213:2: ( RULE_WS )?
            {
             before(grammarAccess.getJsonArrayAccess().getWSTerminalRuleCall_2_1_0()); 
            // InternalCurlBetterThanHttpie.g:5214:2: ( RULE_WS )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==RULE_WS) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:5214:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getJsonArrayAccess().getWSTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__Group_2_1__0__Impl"


    // $ANTLR start "rule__JsonArray__Group_2_1__1"
    // InternalCurlBetterThanHttpie.g:5222:1: rule__JsonArray__Group_2_1__1 : rule__JsonArray__Group_2_1__1__Impl rule__JsonArray__Group_2_1__2 ;
    public final void rule__JsonArray__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5226:1: ( rule__JsonArray__Group_2_1__1__Impl rule__JsonArray__Group_2_1__2 )
            // InternalCurlBetterThanHttpie.g:5227:2: rule__JsonArray__Group_2_1__1__Impl rule__JsonArray__Group_2_1__2
            {
            pushFollow(FOLLOW_35);
            rule__JsonArray__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JsonArray__Group_2_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__Group_2_1__1"


    // $ANTLR start "rule__JsonArray__Group_2_1__1__Impl"
    // InternalCurlBetterThanHttpie.g:5234:1: rule__JsonArray__Group_2_1__1__Impl : ( ',' ) ;
    public final void rule__JsonArray__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5238:1: ( ( ',' ) )
            // InternalCurlBetterThanHttpie.g:5239:1: ( ',' )
            {
            // InternalCurlBetterThanHttpie.g:5239:1: ( ',' )
            // InternalCurlBetterThanHttpie.g:5240:2: ','
            {
             before(grammarAccess.getJsonArrayAccess().getCommaKeyword_2_1_1()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getJsonArrayAccess().getCommaKeyword_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__Group_2_1__1__Impl"


    // $ANTLR start "rule__JsonArray__Group_2_1__2"
    // InternalCurlBetterThanHttpie.g:5249:1: rule__JsonArray__Group_2_1__2 : rule__JsonArray__Group_2_1__2__Impl rule__JsonArray__Group_2_1__3 ;
    public final void rule__JsonArray__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5253:1: ( rule__JsonArray__Group_2_1__2__Impl rule__JsonArray__Group_2_1__3 )
            // InternalCurlBetterThanHttpie.g:5254:2: rule__JsonArray__Group_2_1__2__Impl rule__JsonArray__Group_2_1__3
            {
            pushFollow(FOLLOW_35);
            rule__JsonArray__Group_2_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JsonArray__Group_2_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__Group_2_1__2"


    // $ANTLR start "rule__JsonArray__Group_2_1__2__Impl"
    // InternalCurlBetterThanHttpie.g:5261:1: rule__JsonArray__Group_2_1__2__Impl : ( ( RULE_WS )? ) ;
    public final void rule__JsonArray__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5265:1: ( ( ( RULE_WS )? ) )
            // InternalCurlBetterThanHttpie.g:5266:1: ( ( RULE_WS )? )
            {
            // InternalCurlBetterThanHttpie.g:5266:1: ( ( RULE_WS )? )
            // InternalCurlBetterThanHttpie.g:5267:2: ( RULE_WS )?
            {
             before(grammarAccess.getJsonArrayAccess().getWSTerminalRuleCall_2_1_2()); 
            // InternalCurlBetterThanHttpie.g:5268:2: ( RULE_WS )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==RULE_WS) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:5268:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getJsonArrayAccess().getWSTerminalRuleCall_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__Group_2_1__2__Impl"


    // $ANTLR start "rule__JsonArray__Group_2_1__3"
    // InternalCurlBetterThanHttpie.g:5276:1: rule__JsonArray__Group_2_1__3 : rule__JsonArray__Group_2_1__3__Impl ;
    public final void rule__JsonArray__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5280:1: ( rule__JsonArray__Group_2_1__3__Impl )
            // InternalCurlBetterThanHttpie.g:5281:2: rule__JsonArray__Group_2_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JsonArray__Group_2_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__Group_2_1__3"


    // $ANTLR start "rule__JsonArray__Group_2_1__3__Impl"
    // InternalCurlBetterThanHttpie.g:5287:1: rule__JsonArray__Group_2_1__3__Impl : ( ( rule__JsonArray__ValuesAssignment_2_1_3 ) ) ;
    public final void rule__JsonArray__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5291:1: ( ( ( rule__JsonArray__ValuesAssignment_2_1_3 ) ) )
            // InternalCurlBetterThanHttpie.g:5292:1: ( ( rule__JsonArray__ValuesAssignment_2_1_3 ) )
            {
            // InternalCurlBetterThanHttpie.g:5292:1: ( ( rule__JsonArray__ValuesAssignment_2_1_3 ) )
            // InternalCurlBetterThanHttpie.g:5293:2: ( rule__JsonArray__ValuesAssignment_2_1_3 )
            {
             before(grammarAccess.getJsonArrayAccess().getValuesAssignment_2_1_3()); 
            // InternalCurlBetterThanHttpie.g:5294:2: ( rule__JsonArray__ValuesAssignment_2_1_3 )
            // InternalCurlBetterThanHttpie.g:5294:3: rule__JsonArray__ValuesAssignment_2_1_3
            {
            pushFollow(FOLLOW_2);
            rule__JsonArray__ValuesAssignment_2_1_3();

            state._fsp--;


            }

             after(grammarAccess.getJsonArrayAccess().getValuesAssignment_2_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__Group_2_1__3__Impl"


    // $ANTLR start "rule__JsonNull__Group__0"
    // InternalCurlBetterThanHttpie.g:5303:1: rule__JsonNull__Group__0 : rule__JsonNull__Group__0__Impl rule__JsonNull__Group__1 ;
    public final void rule__JsonNull__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5307:1: ( rule__JsonNull__Group__0__Impl rule__JsonNull__Group__1 )
            // InternalCurlBetterThanHttpie.g:5308:2: rule__JsonNull__Group__0__Impl rule__JsonNull__Group__1
            {
            pushFollow(FOLLOW_44);
            rule__JsonNull__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JsonNull__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonNull__Group__0"


    // $ANTLR start "rule__JsonNull__Group__0__Impl"
    // InternalCurlBetterThanHttpie.g:5315:1: rule__JsonNull__Group__0__Impl : ( () ) ;
    public final void rule__JsonNull__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5319:1: ( ( () ) )
            // InternalCurlBetterThanHttpie.g:5320:1: ( () )
            {
            // InternalCurlBetterThanHttpie.g:5320:1: ( () )
            // InternalCurlBetterThanHttpie.g:5321:2: ()
            {
             before(grammarAccess.getJsonNullAccess().getJsonNullAction_0()); 
            // InternalCurlBetterThanHttpie.g:5322:2: ()
            // InternalCurlBetterThanHttpie.g:5322:3: 
            {
            }

             after(grammarAccess.getJsonNullAccess().getJsonNullAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonNull__Group__0__Impl"


    // $ANTLR start "rule__JsonNull__Group__1"
    // InternalCurlBetterThanHttpie.g:5330:1: rule__JsonNull__Group__1 : rule__JsonNull__Group__1__Impl ;
    public final void rule__JsonNull__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5334:1: ( rule__JsonNull__Group__1__Impl )
            // InternalCurlBetterThanHttpie.g:5335:2: rule__JsonNull__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JsonNull__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonNull__Group__1"


    // $ANTLR start "rule__JsonNull__Group__1__Impl"
    // InternalCurlBetterThanHttpie.g:5341:1: rule__JsonNull__Group__1__Impl : ( RULE_NULL ) ;
    public final void rule__JsonNull__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5345:1: ( ( RULE_NULL ) )
            // InternalCurlBetterThanHttpie.g:5346:1: ( RULE_NULL )
            {
            // InternalCurlBetterThanHttpie.g:5346:1: ( RULE_NULL )
            // InternalCurlBetterThanHttpie.g:5347:2: RULE_NULL
            {
             before(grammarAccess.getJsonNullAccess().getNULLTerminalRuleCall_1()); 
            match(input,RULE_NULL,FOLLOW_2); 
             after(grammarAccess.getJsonNullAccess().getNULLTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonNull__Group__1__Impl"


    // $ANTLR start "rule__CommandLineInterface__FlagsAssignment_2_1"
    // InternalCurlBetterThanHttpie.g:5357:1: rule__CommandLineInterface__FlagsAssignment_2_1 : ( ruleFlag ) ;
    public final void rule__CommandLineInterface__FlagsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5361:1: ( ( ruleFlag ) )
            // InternalCurlBetterThanHttpie.g:5362:2: ( ruleFlag )
            {
            // InternalCurlBetterThanHttpie.g:5362:2: ( ruleFlag )
            // InternalCurlBetterThanHttpie.g:5363:3: ruleFlag
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getFlagsFlagParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFlag();

            state._fsp--;

             after(grammarAccess.getCommandLineInterfaceAccess().getFlagsFlagParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__FlagsAssignment_2_1"


    // $ANTLR start "rule__CommandLineInterface__MethodAssignment_3_1"
    // InternalCurlBetterThanHttpie.g:5372:1: rule__CommandLineInterface__MethodAssignment_3_1 : ( ruleMethod ) ;
    public final void rule__CommandLineInterface__MethodAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5376:1: ( ( ruleMethod ) )
            // InternalCurlBetterThanHttpie.g:5377:2: ( ruleMethod )
            {
            // InternalCurlBetterThanHttpie.g:5377:2: ( ruleMethod )
            // InternalCurlBetterThanHttpie.g:5378:3: ruleMethod
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getMethodMethodEnumRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getCommandLineInterfaceAccess().getMethodMethodEnumRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__MethodAssignment_3_1"


    // $ANTLR start "rule__CommandLineInterface__ProtocolAssignment_5_0"
    // InternalCurlBetterThanHttpie.g:5387:1: rule__CommandLineInterface__ProtocolAssignment_5_0 : ( ( rule__CommandLineInterface__ProtocolAlternatives_5_0_0 ) ) ;
    public final void rule__CommandLineInterface__ProtocolAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5391:1: ( ( ( rule__CommandLineInterface__ProtocolAlternatives_5_0_0 ) ) )
            // InternalCurlBetterThanHttpie.g:5392:2: ( ( rule__CommandLineInterface__ProtocolAlternatives_5_0_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:5392:2: ( ( rule__CommandLineInterface__ProtocolAlternatives_5_0_0 ) )
            // InternalCurlBetterThanHttpie.g:5393:3: ( rule__CommandLineInterface__ProtocolAlternatives_5_0_0 )
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getProtocolAlternatives_5_0_0()); 
            // InternalCurlBetterThanHttpie.g:5394:3: ( rule__CommandLineInterface__ProtocolAlternatives_5_0_0 )
            // InternalCurlBetterThanHttpie.g:5394:4: rule__CommandLineInterface__ProtocolAlternatives_5_0_0
            {
            pushFollow(FOLLOW_2);
            rule__CommandLineInterface__ProtocolAlternatives_5_0_0();

            state._fsp--;


            }

             after(grammarAccess.getCommandLineInterfaceAccess().getProtocolAlternatives_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__ProtocolAssignment_5_0"


    // $ANTLR start "rule__CommandLineInterface__UrlAssignment_6_0_0"
    // InternalCurlBetterThanHttpie.g:5402:1: rule__CommandLineInterface__UrlAssignment_6_0_0 : ( RULE_URL ) ;
    public final void rule__CommandLineInterface__UrlAssignment_6_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5406:1: ( ( RULE_URL ) )
            // InternalCurlBetterThanHttpie.g:5407:2: ( RULE_URL )
            {
            // InternalCurlBetterThanHttpie.g:5407:2: ( RULE_URL )
            // InternalCurlBetterThanHttpie.g:5408:3: RULE_URL
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getUrlURLTerminalRuleCall_6_0_0_0()); 
            match(input,RULE_URL,FOLLOW_2); 
             after(grammarAccess.getCommandLineInterfaceAccess().getUrlURLTerminalRuleCall_6_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__UrlAssignment_6_0_0"


    // $ANTLR start "rule__CommandLineInterface__PortAssignment_6_0_1_1"
    // InternalCurlBetterThanHttpie.g:5417:1: rule__CommandLineInterface__PortAssignment_6_0_1_1 : ( RULE_INT ) ;
    public final void rule__CommandLineInterface__PortAssignment_6_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5421:1: ( ( RULE_INT ) )
            // InternalCurlBetterThanHttpie.g:5422:2: ( RULE_INT )
            {
            // InternalCurlBetterThanHttpie.g:5422:2: ( RULE_INT )
            // InternalCurlBetterThanHttpie.g:5423:3: RULE_INT
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getPortINTTerminalRuleCall_6_0_1_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCommandLineInterfaceAccess().getPortINTTerminalRuleCall_6_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__PortAssignment_6_0_1_1"


    // $ANTLR start "rule__CommandLineInterface__PortAssignment_6_1_1"
    // InternalCurlBetterThanHttpie.g:5432:1: rule__CommandLineInterface__PortAssignment_6_1_1 : ( RULE_INT ) ;
    public final void rule__CommandLineInterface__PortAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5436:1: ( ( RULE_INT ) )
            // InternalCurlBetterThanHttpie.g:5437:2: ( RULE_INT )
            {
            // InternalCurlBetterThanHttpie.g:5437:2: ( RULE_INT )
            // InternalCurlBetterThanHttpie.g:5438:3: RULE_INT
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getPortINTTerminalRuleCall_6_1_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCommandLineInterfaceAccess().getPortINTTerminalRuleCall_6_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__PortAssignment_6_1_1"


    // $ANTLR start "rule__CommandLineInterface__ResourceAssignment_7_1"
    // InternalCurlBetterThanHttpie.g:5447:1: rule__CommandLineInterface__ResourceAssignment_7_1 : ( ( rule__CommandLineInterface__ResourceAlternatives_7_1_0 ) ) ;
    public final void rule__CommandLineInterface__ResourceAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5451:1: ( ( ( rule__CommandLineInterface__ResourceAlternatives_7_1_0 ) ) )
            // InternalCurlBetterThanHttpie.g:5452:2: ( ( rule__CommandLineInterface__ResourceAlternatives_7_1_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:5452:2: ( ( rule__CommandLineInterface__ResourceAlternatives_7_1_0 ) )
            // InternalCurlBetterThanHttpie.g:5453:3: ( rule__CommandLineInterface__ResourceAlternatives_7_1_0 )
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getResourceAlternatives_7_1_0()); 
            // InternalCurlBetterThanHttpie.g:5454:3: ( rule__CommandLineInterface__ResourceAlternatives_7_1_0 )
            // InternalCurlBetterThanHttpie.g:5454:4: rule__CommandLineInterface__ResourceAlternatives_7_1_0
            {
            pushFollow(FOLLOW_2);
            rule__CommandLineInterface__ResourceAlternatives_7_1_0();

            state._fsp--;


            }

             after(grammarAccess.getCommandLineInterfaceAccess().getResourceAlternatives_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__ResourceAssignment_7_1"


    // $ANTLR start "rule__CommandLineInterface__ItemsAssignment_9_1"
    // InternalCurlBetterThanHttpie.g:5462:1: rule__CommandLineInterface__ItemsAssignment_9_1 : ( ruleItem ) ;
    public final void rule__CommandLineInterface__ItemsAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5466:1: ( ( ruleItem ) )
            // InternalCurlBetterThanHttpie.g:5467:2: ( ruleItem )
            {
            // InternalCurlBetterThanHttpie.g:5467:2: ( ruleItem )
            // InternalCurlBetterThanHttpie.g:5468:3: ruleItem
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getItemsItemParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleItem();

            state._fsp--;

             after(grammarAccess.getCommandLineInterfaceAccess().getItemsItemParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__ItemsAssignment_9_1"


    // $ANTLR start "rule__ProxyFlag__ProtocolAssignment_2_0_0"
    // InternalCurlBetterThanHttpie.g:5477:1: rule__ProxyFlag__ProtocolAssignment_2_0_0 : ( ( rule__ProxyFlag__ProtocolAlternatives_2_0_0_0 ) ) ;
    public final void rule__ProxyFlag__ProtocolAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5481:1: ( ( ( rule__ProxyFlag__ProtocolAlternatives_2_0_0_0 ) ) )
            // InternalCurlBetterThanHttpie.g:5482:2: ( ( rule__ProxyFlag__ProtocolAlternatives_2_0_0_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:5482:2: ( ( rule__ProxyFlag__ProtocolAlternatives_2_0_0_0 ) )
            // InternalCurlBetterThanHttpie.g:5483:3: ( rule__ProxyFlag__ProtocolAlternatives_2_0_0_0 )
            {
             before(grammarAccess.getProxyFlagAccess().getProtocolAlternatives_2_0_0_0()); 
            // InternalCurlBetterThanHttpie.g:5484:3: ( rule__ProxyFlag__ProtocolAlternatives_2_0_0_0 )
            // InternalCurlBetterThanHttpie.g:5484:4: rule__ProxyFlag__ProtocolAlternatives_2_0_0_0
            {
            pushFollow(FOLLOW_2);
            rule__ProxyFlag__ProtocolAlternatives_2_0_0_0();

            state._fsp--;


            }

             after(grammarAccess.getProxyFlagAccess().getProtocolAlternatives_2_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__ProtocolAssignment_2_0_0"


    // $ANTLR start "rule__ProxyFlag__ProxyProtocolAssignment_2_1_0"
    // InternalCurlBetterThanHttpie.g:5492:1: rule__ProxyFlag__ProxyProtocolAssignment_2_1_0 : ( ( rule__ProxyFlag__ProxyProtocolAlternatives_2_1_0_0 ) ) ;
    public final void rule__ProxyFlag__ProxyProtocolAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5496:1: ( ( ( rule__ProxyFlag__ProxyProtocolAlternatives_2_1_0_0 ) ) )
            // InternalCurlBetterThanHttpie.g:5497:2: ( ( rule__ProxyFlag__ProxyProtocolAlternatives_2_1_0_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:5497:2: ( ( rule__ProxyFlag__ProxyProtocolAlternatives_2_1_0_0 ) )
            // InternalCurlBetterThanHttpie.g:5498:3: ( rule__ProxyFlag__ProxyProtocolAlternatives_2_1_0_0 )
            {
             before(grammarAccess.getProxyFlagAccess().getProxyProtocolAlternatives_2_1_0_0()); 
            // InternalCurlBetterThanHttpie.g:5499:3: ( rule__ProxyFlag__ProxyProtocolAlternatives_2_1_0_0 )
            // InternalCurlBetterThanHttpie.g:5499:4: rule__ProxyFlag__ProxyProtocolAlternatives_2_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__ProxyFlag__ProxyProtocolAlternatives_2_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getProxyFlagAccess().getProxyProtocolAlternatives_2_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__ProxyProtocolAssignment_2_1_0"


    // $ANTLR start "rule__ProxyFlag__ProtocolAssignment_2_2_0"
    // InternalCurlBetterThanHttpie.g:5507:1: rule__ProxyFlag__ProtocolAssignment_2_2_0 : ( ( rule__ProxyFlag__ProtocolAlternatives_2_2_0_0 ) ) ;
    public final void rule__ProxyFlag__ProtocolAssignment_2_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5511:1: ( ( ( rule__ProxyFlag__ProtocolAlternatives_2_2_0_0 ) ) )
            // InternalCurlBetterThanHttpie.g:5512:2: ( ( rule__ProxyFlag__ProtocolAlternatives_2_2_0_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:5512:2: ( ( rule__ProxyFlag__ProtocolAlternatives_2_2_0_0 ) )
            // InternalCurlBetterThanHttpie.g:5513:3: ( rule__ProxyFlag__ProtocolAlternatives_2_2_0_0 )
            {
             before(grammarAccess.getProxyFlagAccess().getProtocolAlternatives_2_2_0_0()); 
            // InternalCurlBetterThanHttpie.g:5514:3: ( rule__ProxyFlag__ProtocolAlternatives_2_2_0_0 )
            // InternalCurlBetterThanHttpie.g:5514:4: rule__ProxyFlag__ProtocolAlternatives_2_2_0_0
            {
            pushFollow(FOLLOW_2);
            rule__ProxyFlag__ProtocolAlternatives_2_2_0_0();

            state._fsp--;


            }

             after(grammarAccess.getProxyFlagAccess().getProtocolAlternatives_2_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__ProtocolAssignment_2_2_0"


    // $ANTLR start "rule__ProxyFlag__ProxyProtocolAssignment_2_2_2"
    // InternalCurlBetterThanHttpie.g:5522:1: rule__ProxyFlag__ProxyProtocolAssignment_2_2_2 : ( ( rule__ProxyFlag__ProxyProtocolAlternatives_2_2_2_0 ) ) ;
    public final void rule__ProxyFlag__ProxyProtocolAssignment_2_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5526:1: ( ( ( rule__ProxyFlag__ProxyProtocolAlternatives_2_2_2_0 ) ) )
            // InternalCurlBetterThanHttpie.g:5527:2: ( ( rule__ProxyFlag__ProxyProtocolAlternatives_2_2_2_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:5527:2: ( ( rule__ProxyFlag__ProxyProtocolAlternatives_2_2_2_0 ) )
            // InternalCurlBetterThanHttpie.g:5528:3: ( rule__ProxyFlag__ProxyProtocolAlternatives_2_2_2_0 )
            {
             before(grammarAccess.getProxyFlagAccess().getProxyProtocolAlternatives_2_2_2_0()); 
            // InternalCurlBetterThanHttpie.g:5529:3: ( rule__ProxyFlag__ProxyProtocolAlternatives_2_2_2_0 )
            // InternalCurlBetterThanHttpie.g:5529:4: rule__ProxyFlag__ProxyProtocolAlternatives_2_2_2_0
            {
            pushFollow(FOLLOW_2);
            rule__ProxyFlag__ProxyProtocolAlternatives_2_2_2_0();

            state._fsp--;


            }

             after(grammarAccess.getProxyFlagAccess().getProxyProtocolAlternatives_2_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__ProxyProtocolAssignment_2_2_2"


    // $ANTLR start "rule__ProxyFlag__UsernameAssignment_3_0"
    // InternalCurlBetterThanHttpie.g:5537:1: rule__ProxyFlag__UsernameAssignment_3_0 : ( ( rule__ProxyFlag__UsernameAlternatives_3_0_0 ) ) ;
    public final void rule__ProxyFlag__UsernameAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5541:1: ( ( ( rule__ProxyFlag__UsernameAlternatives_3_0_0 ) ) )
            // InternalCurlBetterThanHttpie.g:5542:2: ( ( rule__ProxyFlag__UsernameAlternatives_3_0_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:5542:2: ( ( rule__ProxyFlag__UsernameAlternatives_3_0_0 ) )
            // InternalCurlBetterThanHttpie.g:5543:3: ( rule__ProxyFlag__UsernameAlternatives_3_0_0 )
            {
             before(grammarAccess.getProxyFlagAccess().getUsernameAlternatives_3_0_0()); 
            // InternalCurlBetterThanHttpie.g:5544:3: ( rule__ProxyFlag__UsernameAlternatives_3_0_0 )
            // InternalCurlBetterThanHttpie.g:5544:4: rule__ProxyFlag__UsernameAlternatives_3_0_0
            {
            pushFollow(FOLLOW_2);
            rule__ProxyFlag__UsernameAlternatives_3_0_0();

            state._fsp--;


            }

             after(grammarAccess.getProxyFlagAccess().getUsernameAlternatives_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__UsernameAssignment_3_0"


    // $ANTLR start "rule__ProxyFlag__PasswordAssignment_3_2"
    // InternalCurlBetterThanHttpie.g:5552:1: rule__ProxyFlag__PasswordAssignment_3_2 : ( ( rule__ProxyFlag__PasswordAlternatives_3_2_0 ) ) ;
    public final void rule__ProxyFlag__PasswordAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5556:1: ( ( ( rule__ProxyFlag__PasswordAlternatives_3_2_0 ) ) )
            // InternalCurlBetterThanHttpie.g:5557:2: ( ( rule__ProxyFlag__PasswordAlternatives_3_2_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:5557:2: ( ( rule__ProxyFlag__PasswordAlternatives_3_2_0 ) )
            // InternalCurlBetterThanHttpie.g:5558:3: ( rule__ProxyFlag__PasswordAlternatives_3_2_0 )
            {
             before(grammarAccess.getProxyFlagAccess().getPasswordAlternatives_3_2_0()); 
            // InternalCurlBetterThanHttpie.g:5559:3: ( rule__ProxyFlag__PasswordAlternatives_3_2_0 )
            // InternalCurlBetterThanHttpie.g:5559:4: rule__ProxyFlag__PasswordAlternatives_3_2_0
            {
            pushFollow(FOLLOW_2);
            rule__ProxyFlag__PasswordAlternatives_3_2_0();

            state._fsp--;


            }

             after(grammarAccess.getProxyFlagAccess().getPasswordAlternatives_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__PasswordAssignment_3_2"


    // $ANTLR start "rule__ProxyFlag__HostnameAssignment_4_0_0"
    // InternalCurlBetterThanHttpie.g:5567:1: rule__ProxyFlag__HostnameAssignment_4_0_0 : ( RULE_URL ) ;
    public final void rule__ProxyFlag__HostnameAssignment_4_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5571:1: ( ( RULE_URL ) )
            // InternalCurlBetterThanHttpie.g:5572:2: ( RULE_URL )
            {
            // InternalCurlBetterThanHttpie.g:5572:2: ( RULE_URL )
            // InternalCurlBetterThanHttpie.g:5573:3: RULE_URL
            {
             before(grammarAccess.getProxyFlagAccess().getHostnameURLTerminalRuleCall_4_0_0_0()); 
            match(input,RULE_URL,FOLLOW_2); 
             after(grammarAccess.getProxyFlagAccess().getHostnameURLTerminalRuleCall_4_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__HostnameAssignment_4_0_0"


    // $ANTLR start "rule__ProxyFlag__PortAssignment_4_0_1_1"
    // InternalCurlBetterThanHttpie.g:5582:1: rule__ProxyFlag__PortAssignment_4_0_1_1 : ( RULE_INT ) ;
    public final void rule__ProxyFlag__PortAssignment_4_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5586:1: ( ( RULE_INT ) )
            // InternalCurlBetterThanHttpie.g:5587:2: ( RULE_INT )
            {
            // InternalCurlBetterThanHttpie.g:5587:2: ( RULE_INT )
            // InternalCurlBetterThanHttpie.g:5588:3: RULE_INT
            {
             before(grammarAccess.getProxyFlagAccess().getPortINTTerminalRuleCall_4_0_1_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getProxyFlagAccess().getPortINTTerminalRuleCall_4_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__PortAssignment_4_0_1_1"


    // $ANTLR start "rule__ProxyFlag__PortAssignment_4_1_1"
    // InternalCurlBetterThanHttpie.g:5597:1: rule__ProxyFlag__PortAssignment_4_1_1 : ( RULE_INT ) ;
    public final void rule__ProxyFlag__PortAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5601:1: ( ( RULE_INT ) )
            // InternalCurlBetterThanHttpie.g:5602:2: ( RULE_INT )
            {
            // InternalCurlBetterThanHttpie.g:5602:2: ( RULE_INT )
            // InternalCurlBetterThanHttpie.g:5603:3: RULE_INT
            {
             before(grammarAccess.getProxyFlagAccess().getPortINTTerminalRuleCall_4_1_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getProxyFlagAccess().getPortINTTerminalRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__PortAssignment_4_1_1"


    // $ANTLR start "rule__AuthFlag__UsernameAssignment_2"
    // InternalCurlBetterThanHttpie.g:5612:1: rule__AuthFlag__UsernameAssignment_2 : ( ( rule__AuthFlag__UsernameAlternatives_2_0 ) ) ;
    public final void rule__AuthFlag__UsernameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5616:1: ( ( ( rule__AuthFlag__UsernameAlternatives_2_0 ) ) )
            // InternalCurlBetterThanHttpie.g:5617:2: ( ( rule__AuthFlag__UsernameAlternatives_2_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:5617:2: ( ( rule__AuthFlag__UsernameAlternatives_2_0 ) )
            // InternalCurlBetterThanHttpie.g:5618:3: ( rule__AuthFlag__UsernameAlternatives_2_0 )
            {
             before(grammarAccess.getAuthFlagAccess().getUsernameAlternatives_2_0()); 
            // InternalCurlBetterThanHttpie.g:5619:3: ( rule__AuthFlag__UsernameAlternatives_2_0 )
            // InternalCurlBetterThanHttpie.g:5619:4: rule__AuthFlag__UsernameAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__AuthFlag__UsernameAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getAuthFlagAccess().getUsernameAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthFlag__UsernameAssignment_2"


    // $ANTLR start "rule__AuthFlag__PasswordAssignment_3_1"
    // InternalCurlBetterThanHttpie.g:5627:1: rule__AuthFlag__PasswordAssignment_3_1 : ( ( rule__AuthFlag__PasswordAlternatives_3_1_0 ) ) ;
    public final void rule__AuthFlag__PasswordAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5631:1: ( ( ( rule__AuthFlag__PasswordAlternatives_3_1_0 ) ) )
            // InternalCurlBetterThanHttpie.g:5632:2: ( ( rule__AuthFlag__PasswordAlternatives_3_1_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:5632:2: ( ( rule__AuthFlag__PasswordAlternatives_3_1_0 ) )
            // InternalCurlBetterThanHttpie.g:5633:3: ( rule__AuthFlag__PasswordAlternatives_3_1_0 )
            {
             before(grammarAccess.getAuthFlagAccess().getPasswordAlternatives_3_1_0()); 
            // InternalCurlBetterThanHttpie.g:5634:3: ( rule__AuthFlag__PasswordAlternatives_3_1_0 )
            // InternalCurlBetterThanHttpie.g:5634:4: rule__AuthFlag__PasswordAlternatives_3_1_0
            {
            pushFollow(FOLLOW_2);
            rule__AuthFlag__PasswordAlternatives_3_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAuthFlagAccess().getPasswordAlternatives_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthFlag__PasswordAssignment_3_1"


    // $ANTLR start "rule__AuthFlag__HostnameAssignment_4_1_0"
    // InternalCurlBetterThanHttpie.g:5642:1: rule__AuthFlag__HostnameAssignment_4_1_0 : ( RULE_URL ) ;
    public final void rule__AuthFlag__HostnameAssignment_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5646:1: ( ( RULE_URL ) )
            // InternalCurlBetterThanHttpie.g:5647:2: ( RULE_URL )
            {
            // InternalCurlBetterThanHttpie.g:5647:2: ( RULE_URL )
            // InternalCurlBetterThanHttpie.g:5648:3: RULE_URL
            {
             before(grammarAccess.getAuthFlagAccess().getHostnameURLTerminalRuleCall_4_1_0_0()); 
            match(input,RULE_URL,FOLLOW_2); 
             after(grammarAccess.getAuthFlagAccess().getHostnameURLTerminalRuleCall_4_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthFlag__HostnameAssignment_4_1_0"


    // $ANTLR start "rule__TimeoutFlag__TimeoutAssignment_2"
    // InternalCurlBetterThanHttpie.g:5657:1: rule__TimeoutFlag__TimeoutAssignment_2 : ( RULE_FLOAT ) ;
    public final void rule__TimeoutFlag__TimeoutAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5661:1: ( ( RULE_FLOAT ) )
            // InternalCurlBetterThanHttpie.g:5662:2: ( RULE_FLOAT )
            {
            // InternalCurlBetterThanHttpie.g:5662:2: ( RULE_FLOAT )
            // InternalCurlBetterThanHttpie.g:5663:3: RULE_FLOAT
            {
             before(grammarAccess.getTimeoutFlagAccess().getTimeoutFLOATTerminalRuleCall_2_0()); 
            match(input,RULE_FLOAT,FOLLOW_2); 
             after(grammarAccess.getTimeoutFlagAccess().getTimeoutFLOATTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeoutFlag__TimeoutAssignment_2"


    // $ANTLR start "rule__HttpHeaderItem__FieldAssignment_0"
    // InternalCurlBetterThanHttpie.g:5672:1: rule__HttpHeaderItem__FieldAssignment_0 : ( ( rule__HttpHeaderItem__FieldAlternatives_0_0 ) ) ;
    public final void rule__HttpHeaderItem__FieldAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5676:1: ( ( ( rule__HttpHeaderItem__FieldAlternatives_0_0 ) ) )
            // InternalCurlBetterThanHttpie.g:5677:2: ( ( rule__HttpHeaderItem__FieldAlternatives_0_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:5677:2: ( ( rule__HttpHeaderItem__FieldAlternatives_0_0 ) )
            // InternalCurlBetterThanHttpie.g:5678:3: ( rule__HttpHeaderItem__FieldAlternatives_0_0 )
            {
             before(grammarAccess.getHttpHeaderItemAccess().getFieldAlternatives_0_0()); 
            // InternalCurlBetterThanHttpie.g:5679:3: ( rule__HttpHeaderItem__FieldAlternatives_0_0 )
            // InternalCurlBetterThanHttpie.g:5679:4: rule__HttpHeaderItem__FieldAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__HttpHeaderItem__FieldAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getHttpHeaderItemAccess().getFieldAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpHeaderItem__FieldAssignment_0"


    // $ANTLR start "rule__HttpHeaderItem__ValueAssignment_2"
    // InternalCurlBetterThanHttpie.g:5687:1: rule__HttpHeaderItem__ValueAssignment_2 : ( ( rule__HttpHeaderItem__ValueAlternatives_2_0 ) ) ;
    public final void rule__HttpHeaderItem__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5691:1: ( ( ( rule__HttpHeaderItem__ValueAlternatives_2_0 ) ) )
            // InternalCurlBetterThanHttpie.g:5692:2: ( ( rule__HttpHeaderItem__ValueAlternatives_2_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:5692:2: ( ( rule__HttpHeaderItem__ValueAlternatives_2_0 ) )
            // InternalCurlBetterThanHttpie.g:5693:3: ( rule__HttpHeaderItem__ValueAlternatives_2_0 )
            {
             before(grammarAccess.getHttpHeaderItemAccess().getValueAlternatives_2_0()); 
            // InternalCurlBetterThanHttpie.g:5694:3: ( rule__HttpHeaderItem__ValueAlternatives_2_0 )
            // InternalCurlBetterThanHttpie.g:5694:4: rule__HttpHeaderItem__ValueAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__HttpHeaderItem__ValueAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getHttpHeaderItemAccess().getValueAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpHeaderItem__ValueAssignment_2"


    // $ANTLR start "rule__FormFileFieldItem__FieldAssignment_0"
    // InternalCurlBetterThanHttpie.g:5702:1: rule__FormFileFieldItem__FieldAssignment_0 : ( ( rule__FormFileFieldItem__FieldAlternatives_0_0 ) ) ;
    public final void rule__FormFileFieldItem__FieldAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5706:1: ( ( ( rule__FormFileFieldItem__FieldAlternatives_0_0 ) ) )
            // InternalCurlBetterThanHttpie.g:5707:2: ( ( rule__FormFileFieldItem__FieldAlternatives_0_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:5707:2: ( ( rule__FormFileFieldItem__FieldAlternatives_0_0 ) )
            // InternalCurlBetterThanHttpie.g:5708:3: ( rule__FormFileFieldItem__FieldAlternatives_0_0 )
            {
             before(grammarAccess.getFormFileFieldItemAccess().getFieldAlternatives_0_0()); 
            // InternalCurlBetterThanHttpie.g:5709:3: ( rule__FormFileFieldItem__FieldAlternatives_0_0 )
            // InternalCurlBetterThanHttpie.g:5709:4: rule__FormFileFieldItem__FieldAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__FormFileFieldItem__FieldAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getFormFileFieldItemAccess().getFieldAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormFileFieldItem__FieldAssignment_0"


    // $ANTLR start "rule__FormFileFieldItem__ValueAssignment_2"
    // InternalCurlBetterThanHttpie.g:5717:1: rule__FormFileFieldItem__ValueAssignment_2 : ( ( rule__FormFileFieldItem__ValueAlternatives_2_0 ) ) ;
    public final void rule__FormFileFieldItem__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5721:1: ( ( ( rule__FormFileFieldItem__ValueAlternatives_2_0 ) ) )
            // InternalCurlBetterThanHttpie.g:5722:2: ( ( rule__FormFileFieldItem__ValueAlternatives_2_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:5722:2: ( ( rule__FormFileFieldItem__ValueAlternatives_2_0 ) )
            // InternalCurlBetterThanHttpie.g:5723:3: ( rule__FormFileFieldItem__ValueAlternatives_2_0 )
            {
             before(grammarAccess.getFormFileFieldItemAccess().getValueAlternatives_2_0()); 
            // InternalCurlBetterThanHttpie.g:5724:3: ( rule__FormFileFieldItem__ValueAlternatives_2_0 )
            // InternalCurlBetterThanHttpie.g:5724:4: rule__FormFileFieldItem__ValueAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__FormFileFieldItem__ValueAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getFormFileFieldItemAccess().getValueAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormFileFieldItem__ValueAssignment_2"


    // $ANTLR start "rule__DataFieldItem__FieldAssignment_0"
    // InternalCurlBetterThanHttpie.g:5732:1: rule__DataFieldItem__FieldAssignment_0 : ( ( rule__DataFieldItem__FieldAlternatives_0_0 ) ) ;
    public final void rule__DataFieldItem__FieldAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5736:1: ( ( ( rule__DataFieldItem__FieldAlternatives_0_0 ) ) )
            // InternalCurlBetterThanHttpie.g:5737:2: ( ( rule__DataFieldItem__FieldAlternatives_0_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:5737:2: ( ( rule__DataFieldItem__FieldAlternatives_0_0 ) )
            // InternalCurlBetterThanHttpie.g:5738:3: ( rule__DataFieldItem__FieldAlternatives_0_0 )
            {
             before(grammarAccess.getDataFieldItemAccess().getFieldAlternatives_0_0()); 
            // InternalCurlBetterThanHttpie.g:5739:3: ( rule__DataFieldItem__FieldAlternatives_0_0 )
            // InternalCurlBetterThanHttpie.g:5739:4: rule__DataFieldItem__FieldAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__DataFieldItem__FieldAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getDataFieldItemAccess().getFieldAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFieldItem__FieldAssignment_0"


    // $ANTLR start "rule__DataFieldItem__ValueAssignment_2_0"
    // InternalCurlBetterThanHttpie.g:5747:1: rule__DataFieldItem__ValueAssignment_2_0 : ( ( rule__DataFieldItem__ValueAlternatives_2_0_0 ) ) ;
    public final void rule__DataFieldItem__ValueAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5751:1: ( ( ( rule__DataFieldItem__ValueAlternatives_2_0_0 ) ) )
            // InternalCurlBetterThanHttpie.g:5752:2: ( ( rule__DataFieldItem__ValueAlternatives_2_0_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:5752:2: ( ( rule__DataFieldItem__ValueAlternatives_2_0_0 ) )
            // InternalCurlBetterThanHttpie.g:5753:3: ( rule__DataFieldItem__ValueAlternatives_2_0_0 )
            {
             before(grammarAccess.getDataFieldItemAccess().getValueAlternatives_2_0_0()); 
            // InternalCurlBetterThanHttpie.g:5754:3: ( rule__DataFieldItem__ValueAlternatives_2_0_0 )
            // InternalCurlBetterThanHttpie.g:5754:4: rule__DataFieldItem__ValueAlternatives_2_0_0
            {
            pushFollow(FOLLOW_2);
            rule__DataFieldItem__ValueAlternatives_2_0_0();

            state._fsp--;


            }

             after(grammarAccess.getDataFieldItemAccess().getValueAlternatives_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFieldItem__ValueAssignment_2_0"


    // $ANTLR start "rule__DataFieldItem__ValueAssignment_2_1_1"
    // InternalCurlBetterThanHttpie.g:5762:1: rule__DataFieldItem__ValueAssignment_2_1_1 : ( RULE_URL ) ;
    public final void rule__DataFieldItem__ValueAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5766:1: ( ( RULE_URL ) )
            // InternalCurlBetterThanHttpie.g:5767:2: ( RULE_URL )
            {
            // InternalCurlBetterThanHttpie.g:5767:2: ( RULE_URL )
            // InternalCurlBetterThanHttpie.g:5768:3: RULE_URL
            {
             before(grammarAccess.getDataFieldItemAccess().getValueURLTerminalRuleCall_2_1_1_0()); 
            match(input,RULE_URL,FOLLOW_2); 
             after(grammarAccess.getDataFieldItemAccess().getValueURLTerminalRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFieldItem__ValueAssignment_2_1_1"


    // $ANTLR start "rule__UrlParameterItem__FieldAssignment_0"
    // InternalCurlBetterThanHttpie.g:5777:1: rule__UrlParameterItem__FieldAssignment_0 : ( ( rule__UrlParameterItem__FieldAlternatives_0_0 ) ) ;
    public final void rule__UrlParameterItem__FieldAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5781:1: ( ( ( rule__UrlParameterItem__FieldAlternatives_0_0 ) ) )
            // InternalCurlBetterThanHttpie.g:5782:2: ( ( rule__UrlParameterItem__FieldAlternatives_0_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:5782:2: ( ( rule__UrlParameterItem__FieldAlternatives_0_0 ) )
            // InternalCurlBetterThanHttpie.g:5783:3: ( rule__UrlParameterItem__FieldAlternatives_0_0 )
            {
             before(grammarAccess.getUrlParameterItemAccess().getFieldAlternatives_0_0()); 
            // InternalCurlBetterThanHttpie.g:5784:3: ( rule__UrlParameterItem__FieldAlternatives_0_0 )
            // InternalCurlBetterThanHttpie.g:5784:4: rule__UrlParameterItem__FieldAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__UrlParameterItem__FieldAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getUrlParameterItemAccess().getFieldAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UrlParameterItem__FieldAssignment_0"


    // $ANTLR start "rule__UrlParameterItem__ValueAssignment_2"
    // InternalCurlBetterThanHttpie.g:5792:1: rule__UrlParameterItem__ValueAssignment_2 : ( ( rule__UrlParameterItem__ValueAlternatives_2_0 ) ) ;
    public final void rule__UrlParameterItem__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5796:1: ( ( ( rule__UrlParameterItem__ValueAlternatives_2_0 ) ) )
            // InternalCurlBetterThanHttpie.g:5797:2: ( ( rule__UrlParameterItem__ValueAlternatives_2_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:5797:2: ( ( rule__UrlParameterItem__ValueAlternatives_2_0 ) )
            // InternalCurlBetterThanHttpie.g:5798:3: ( rule__UrlParameterItem__ValueAlternatives_2_0 )
            {
             before(grammarAccess.getUrlParameterItemAccess().getValueAlternatives_2_0()); 
            // InternalCurlBetterThanHttpie.g:5799:3: ( rule__UrlParameterItem__ValueAlternatives_2_0 )
            // InternalCurlBetterThanHttpie.g:5799:4: rule__UrlParameterItem__ValueAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__UrlParameterItem__ValueAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getUrlParameterItemAccess().getValueAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UrlParameterItem__ValueAssignment_2"


    // $ANTLR start "rule__RawJsonFieldItem__FieldAssignment_0"
    // InternalCurlBetterThanHttpie.g:5807:1: rule__RawJsonFieldItem__FieldAssignment_0 : ( ( rule__RawJsonFieldItem__FieldAlternatives_0_0 ) ) ;
    public final void rule__RawJsonFieldItem__FieldAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5811:1: ( ( ( rule__RawJsonFieldItem__FieldAlternatives_0_0 ) ) )
            // InternalCurlBetterThanHttpie.g:5812:2: ( ( rule__RawJsonFieldItem__FieldAlternatives_0_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:5812:2: ( ( rule__RawJsonFieldItem__FieldAlternatives_0_0 ) )
            // InternalCurlBetterThanHttpie.g:5813:3: ( rule__RawJsonFieldItem__FieldAlternatives_0_0 )
            {
             before(grammarAccess.getRawJsonFieldItemAccess().getFieldAlternatives_0_0()); 
            // InternalCurlBetterThanHttpie.g:5814:3: ( rule__RawJsonFieldItem__FieldAlternatives_0_0 )
            // InternalCurlBetterThanHttpie.g:5814:4: rule__RawJsonFieldItem__FieldAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__RawJsonFieldItem__FieldAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getRawJsonFieldItemAccess().getFieldAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RawJsonFieldItem__FieldAssignment_0"


    // $ANTLR start "rule__RawJsonFieldItem__ValueAssignment_2_0"
    // InternalCurlBetterThanHttpie.g:5822:1: rule__RawJsonFieldItem__ValueAssignment_2_0 : ( ruleJsonType ) ;
    public final void rule__RawJsonFieldItem__ValueAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5826:1: ( ( ruleJsonType ) )
            // InternalCurlBetterThanHttpie.g:5827:2: ( ruleJsonType )
            {
            // InternalCurlBetterThanHttpie.g:5827:2: ( ruleJsonType )
            // InternalCurlBetterThanHttpie.g:5828:3: ruleJsonType
            {
             before(grammarAccess.getRawJsonFieldItemAccess().getValueJsonTypeParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleJsonType();

            state._fsp--;

             after(grammarAccess.getRawJsonFieldItemAccess().getValueJsonTypeParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RawJsonFieldItem__ValueAssignment_2_0"


    // $ANTLR start "rule__RawJsonFieldItem__ValueAssignment_2_1_1"
    // InternalCurlBetterThanHttpie.g:5837:1: rule__RawJsonFieldItem__ValueAssignment_2_1_1 : ( ruleJsonString ) ;
    public final void rule__RawJsonFieldItem__ValueAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5841:1: ( ( ruleJsonString ) )
            // InternalCurlBetterThanHttpie.g:5842:2: ( ruleJsonString )
            {
            // InternalCurlBetterThanHttpie.g:5842:2: ( ruleJsonString )
            // InternalCurlBetterThanHttpie.g:5843:3: ruleJsonString
            {
             before(grammarAccess.getRawJsonFieldItemAccess().getValueJsonStringParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleJsonString();

            state._fsp--;

             after(grammarAccess.getRawJsonFieldItemAccess().getValueJsonStringParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RawJsonFieldItem__ValueAssignment_2_1_1"


    // $ANTLR start "rule__Member__KeyAssignment_0_1"
    // InternalCurlBetterThanHttpie.g:5852:1: rule__Member__KeyAssignment_0_1 : ( ( rule__Member__KeyAlternatives_0_1_0 ) ) ;
    public final void rule__Member__KeyAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5856:1: ( ( ( rule__Member__KeyAlternatives_0_1_0 ) ) )
            // InternalCurlBetterThanHttpie.g:5857:2: ( ( rule__Member__KeyAlternatives_0_1_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:5857:2: ( ( rule__Member__KeyAlternatives_0_1_0 ) )
            // InternalCurlBetterThanHttpie.g:5858:3: ( rule__Member__KeyAlternatives_0_1_0 )
            {
             before(grammarAccess.getMemberAccess().getKeyAlternatives_0_1_0()); 
            // InternalCurlBetterThanHttpie.g:5859:3: ( rule__Member__KeyAlternatives_0_1_0 )
            // InternalCurlBetterThanHttpie.g:5859:4: rule__Member__KeyAlternatives_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Member__KeyAlternatives_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMemberAccess().getKeyAlternatives_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__KeyAssignment_0_1"


    // $ANTLR start "rule__Member__ValueAssignment_4"
    // InternalCurlBetterThanHttpie.g:5867:1: rule__Member__ValueAssignment_4 : ( ruleJsonType ) ;
    public final void rule__Member__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5871:1: ( ( ruleJsonType ) )
            // InternalCurlBetterThanHttpie.g:5872:2: ( ruleJsonType )
            {
            // InternalCurlBetterThanHttpie.g:5872:2: ( ruleJsonType )
            // InternalCurlBetterThanHttpie.g:5873:3: ruleJsonType
            {
             before(grammarAccess.getMemberAccess().getValueJsonTypeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleJsonType();

            state._fsp--;

             after(grammarAccess.getMemberAccess().getValueJsonTypeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__ValueAssignment_4"


    // $ANTLR start "rule__JsonObject__MembersAssignment_2_0_1"
    // InternalCurlBetterThanHttpie.g:5882:1: rule__JsonObject__MembersAssignment_2_0_1 : ( ruleMember ) ;
    public final void rule__JsonObject__MembersAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5886:1: ( ( ruleMember ) )
            // InternalCurlBetterThanHttpie.g:5887:2: ( ruleMember )
            {
            // InternalCurlBetterThanHttpie.g:5887:2: ( ruleMember )
            // InternalCurlBetterThanHttpie.g:5888:3: ruleMember
            {
             before(grammarAccess.getJsonObjectAccess().getMembersMemberParserRuleCall_2_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getJsonObjectAccess().getMembersMemberParserRuleCall_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonObject__MembersAssignment_2_0_1"


    // $ANTLR start "rule__JsonObject__MembersAssignment_2_1_3"
    // InternalCurlBetterThanHttpie.g:5897:1: rule__JsonObject__MembersAssignment_2_1_3 : ( ruleMember ) ;
    public final void rule__JsonObject__MembersAssignment_2_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5901:1: ( ( ruleMember ) )
            // InternalCurlBetterThanHttpie.g:5902:2: ( ruleMember )
            {
            // InternalCurlBetterThanHttpie.g:5902:2: ( ruleMember )
            // InternalCurlBetterThanHttpie.g:5903:3: ruleMember
            {
             before(grammarAccess.getJsonObjectAccess().getMembersMemberParserRuleCall_2_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getJsonObjectAccess().getMembersMemberParserRuleCall_2_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonObject__MembersAssignment_2_1_3"


    // $ANTLR start "rule__JsonString__ValueAssignment"
    // InternalCurlBetterThanHttpie.g:5912:1: rule__JsonString__ValueAssignment : ( ( rule__JsonString__ValueAlternatives_0 ) ) ;
    public final void rule__JsonString__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5916:1: ( ( ( rule__JsonString__ValueAlternatives_0 ) ) )
            // InternalCurlBetterThanHttpie.g:5917:2: ( ( rule__JsonString__ValueAlternatives_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:5917:2: ( ( rule__JsonString__ValueAlternatives_0 ) )
            // InternalCurlBetterThanHttpie.g:5918:3: ( rule__JsonString__ValueAlternatives_0 )
            {
             before(grammarAccess.getJsonStringAccess().getValueAlternatives_0()); 
            // InternalCurlBetterThanHttpie.g:5919:3: ( rule__JsonString__ValueAlternatives_0 )
            // InternalCurlBetterThanHttpie.g:5919:4: rule__JsonString__ValueAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__JsonString__ValueAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getJsonStringAccess().getValueAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonString__ValueAssignment"


    // $ANTLR start "rule__JsonArray__ValuesAssignment_2_0_1"
    // InternalCurlBetterThanHttpie.g:5927:1: rule__JsonArray__ValuesAssignment_2_0_1 : ( ruleJsonType ) ;
    public final void rule__JsonArray__ValuesAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5931:1: ( ( ruleJsonType ) )
            // InternalCurlBetterThanHttpie.g:5932:2: ( ruleJsonType )
            {
            // InternalCurlBetterThanHttpie.g:5932:2: ( ruleJsonType )
            // InternalCurlBetterThanHttpie.g:5933:3: ruleJsonType
            {
             before(grammarAccess.getJsonArrayAccess().getValuesJsonTypeParserRuleCall_2_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleJsonType();

            state._fsp--;

             after(grammarAccess.getJsonArrayAccess().getValuesJsonTypeParserRuleCall_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__ValuesAssignment_2_0_1"


    // $ANTLR start "rule__JsonArray__ValuesAssignment_2_1_3"
    // InternalCurlBetterThanHttpie.g:5942:1: rule__JsonArray__ValuesAssignment_2_1_3 : ( ruleJsonType ) ;
    public final void rule__JsonArray__ValuesAssignment_2_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5946:1: ( ( ruleJsonType ) )
            // InternalCurlBetterThanHttpie.g:5947:2: ( ruleJsonType )
            {
            // InternalCurlBetterThanHttpie.g:5947:2: ( ruleJsonType )
            // InternalCurlBetterThanHttpie.g:5948:3: ruleJsonType
            {
             before(grammarAccess.getJsonArrayAccess().getValuesJsonTypeParserRuleCall_2_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleJsonType();

            state._fsp--;

             after(grammarAccess.getJsonArrayAccess().getValuesJsonTypeParserRuleCall_2_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__ValuesAssignment_2_1_3"


    // $ANTLR start "rule__JsonBoolean__ValueAssignment"
    // InternalCurlBetterThanHttpie.g:5957:1: rule__JsonBoolean__ValueAssignment : ( RULE_BOOLEAN ) ;
    public final void rule__JsonBoolean__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5961:1: ( ( RULE_BOOLEAN ) )
            // InternalCurlBetterThanHttpie.g:5962:2: ( RULE_BOOLEAN )
            {
            // InternalCurlBetterThanHttpie.g:5962:2: ( RULE_BOOLEAN )
            // InternalCurlBetterThanHttpie.g:5963:3: RULE_BOOLEAN
            {
             before(grammarAccess.getJsonBooleanAccess().getValueBOOLEANTerminalRuleCall_0()); 
            match(input,RULE_BOOLEAN,FOLLOW_2); 
             after(grammarAccess.getJsonBooleanAccess().getValueBOOLEANTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonBoolean__ValueAssignment"


    // $ANTLR start "rule__JsonNumber__ValueAssignment"
    // InternalCurlBetterThanHttpie.g:5972:1: rule__JsonNumber__ValueAssignment : ( RULE_NUMBER ) ;
    public final void rule__JsonNumber__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5976:1: ( ( RULE_NUMBER ) )
            // InternalCurlBetterThanHttpie.g:5977:2: ( RULE_NUMBER )
            {
            // InternalCurlBetterThanHttpie.g:5977:2: ( RULE_NUMBER )
            // InternalCurlBetterThanHttpie.g:5978:3: RULE_NUMBER
            {
             before(grammarAccess.getJsonNumberAccess().getValueNUMBERTerminalRuleCall_0()); 
            match(input,RULE_NUMBER,FOLLOW_2); 
             after(grammarAccess.getJsonNumberAccess().getValueNUMBERTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonNumber__ValueAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000040000130L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000040000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000D01FB7F80000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000001E000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000200040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000100L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000200000000030L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00482000000018B0L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000040000040L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00480000000018F0L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0014000000000040L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0020000000000040L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0020000000000042L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0004000000000040L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x00C80000000018F0L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000080L});

}