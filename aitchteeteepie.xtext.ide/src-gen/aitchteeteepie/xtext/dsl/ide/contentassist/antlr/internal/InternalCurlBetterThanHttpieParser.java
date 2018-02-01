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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_HTTP", "RULE_WS", "RULE_NULL", "RULE_URL", "RULE_INT", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_DIGIT", "RULE_LETTER", "'--header'", "'-t'", "'--body'", "'-b'", "'--json'", "'-j'", "'--form'", "'-f'", "'='", "'--auth'", "'-a'", "':'", "'--download'", "'-d'", "'--help'", "'-h'", "'--verbose'", "'-v'", "'GET'", "'POST'", "'PUT'", "'DELETE'", "'://'", "'/'", "'--'", "'--proxy'", "'@'", "'--version'", "'--timeout'", "'=='", "':='", "'\"'", "'\\''", "'{'", "'}'", "','", "'['", "']'"
    };
    public static final int T__50=50;
    public static final int RULE_BOOLEAN=11;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int RULE_ID=4;
    public static final int RULE_DIGIT=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=9;
    public static final int T__29=29;
    public static final int RULE_URL=8;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_NULL=7;
    public static final int RULE_HTTP=5;
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
    public static final int RULE_LETTER=13;
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
    // InternalCurlBetterThanHttpie.g:612:1: ruleJsonString : ( ( rule__JsonString__Alternatives ) ) ;
    public final void ruleJsonString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:616:2: ( ( ( rule__JsonString__Alternatives ) ) )
            // InternalCurlBetterThanHttpie.g:617:2: ( ( rule__JsonString__Alternatives ) )
            {
            // InternalCurlBetterThanHttpie.g:617:2: ( ( rule__JsonString__Alternatives ) )
            // InternalCurlBetterThanHttpie.g:618:3: ( rule__JsonString__Alternatives )
            {
             before(grammarAccess.getJsonStringAccess().getAlternatives()); 
            // InternalCurlBetterThanHttpie.g:619:3: ( rule__JsonString__Alternatives )
            // InternalCurlBetterThanHttpie.g:619:4: rule__JsonString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__JsonString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getJsonStringAccess().getAlternatives()); 

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
            else if ( (LA2_0==25) ) {
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
            case 39:
                {
                alt4=1;
                }
                break;
            case 20:
            case 21:
                {
                alt4=2;
                }
                break;
            case 23:
            case 24:
                {
                alt4=3;
                }
                break;
            case 26:
            case 27:
                {
                alt4=4;
                }
                break;
            case 16:
            case 17:
                {
                alt4=5;
                }
                break;
            case 41:
                {
                alt4=6;
                }
                break;
            case 18:
            case 19:
                {
                alt4=7;
                }
                break;
            case 28:
            case 29:
                {
                alt4=8;
                }
                break;
            case 14:
            case 15:
                {
                alt4=9;
                }
                break;
            case 30:
            case 31:
                {
                alt4=10;
                }
                break;
            case 42:
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

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            else if ( (LA5_0==15) ) {
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
                    match(input,14,FOLLOW_2); 
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
                    match(input,15,FOLLOW_2); 
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

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            else if ( (LA6_0==17) ) {
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
                    match(input,16,FOLLOW_2); 
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
                    match(input,17,FOLLOW_2); 
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

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            else if ( (LA7_0==19) ) {
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
                    match(input,18,FOLLOW_2); 
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
                    match(input,19,FOLLOW_2); 
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

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            else if ( (LA8_0==21) ) {
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
                    match(input,20,FOLLOW_2); 
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
                    match(input,21,FOLLOW_2); 
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

            if ( (LA9_0==22) ) {
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
                    match(input,22,FOLLOW_2); 
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

                if ( (LA10_1==25) ) {
                    switch ( input.LA(3) ) {
                    case RULE_ID:
                        {
                        int LA10_5 = input.LA(4);

                        if ( (LA10_5==36) ) {
                            alt10=3;
                        }
                        else if ( (LA10_5==25) ) {
                            alt10=1;
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

                        if ( (LA10_6==25) ) {
                            alt10=1;
                        }
                        else if ( (LA10_6==36) ) {
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
                    case 25:
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
                else if ( (LA10_1==36) ) {
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

                if ( (LA10_2==36) ) {
                    alt10=2;
                }
                else if ( (LA10_2==25) ) {
                    switch ( input.LA(3) ) {
                    case RULE_ID:
                        {
                        int LA10_5 = input.LA(4);

                        if ( (LA10_5==36) ) {
                            alt10=3;
                        }
                        else if ( (LA10_5==25) ) {
                            alt10=1;
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

                        if ( (LA10_6==25) ) {
                            alt10=1;
                        }
                        else if ( (LA10_6==36) ) {
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
                    case 25:
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

            if ( (LA18_0==23) ) {
                alt18=1;
            }
            else if ( (LA18_0==24) ) {
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
                    match(input,23,FOLLOW_2); 
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
                    match(input,24,FOLLOW_2); 
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

            if ( (LA19_0==22) ) {
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
                    match(input,22,FOLLOW_2); 
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
            else if ( (LA22_0==25) ) {
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
                    match(input,25,FOLLOW_2); 
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

            if ( (LA23_0==26) ) {
                alt23=1;
            }
            else if ( (LA23_0==27) ) {
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
                    match(input,26,FOLLOW_2); 
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
                    match(input,27,FOLLOW_2); 
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

            if ( (LA24_0==28) ) {
                alt24=1;
            }
            else if ( (LA24_0==29) ) {
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
                    match(input,28,FOLLOW_2); 
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
                    match(input,29,FOLLOW_2); 
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

            if ( (LA25_0==30) ) {
                alt25=1;
            }
            else if ( (LA25_0==31) ) {
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
                    match(input,30,FOLLOW_2); 
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
                    match(input,31,FOLLOW_2); 
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

            if ( (LA26_0==22) ) {
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
                    match(input,22,FOLLOW_2); 
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
                case 43:
                    {
                    alt27=4;
                    }
                    break;
                case 22:
                    {
                    alt27=3;
                    }
                    break;
                case 40:
                    {
                    alt27=2;
                    }
                    break;
                case 25:
                    {
                    alt27=1;
                    }
                    break;
                case 44:
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
                case 40:
                    {
                    alt27=2;
                    }
                    break;
                case 25:
                    {
                    alt27=1;
                    }
                    break;
                case 44:
                    {
                    alt27=5;
                    }
                    break;
                case 43:
                    {
                    alt27=4;
                    }
                    break;
                case 22:
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
            else if ( (LA33_0==40) ) {
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

            if ( ((LA38_0>=RULE_ID && LA38_0<=RULE_HTTP)||LA38_0==RULE_NULL||(LA38_0>=RULE_FLOAT && LA38_0<=RULE_BOOLEAN)||(LA38_0>=45 && LA38_0<=47)||LA38_0==50) ) {
                alt38=1;
            }
            else if ( (LA38_0==40) ) {
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


    // $ANTLR start "rule__Member__Alternatives_0"
    // InternalCurlBetterThanHttpie.g:1619:1: rule__Member__Alternatives_0 : ( ( ( rule__Member__Group_0_0__0 ) ) | ( ( rule__Member__Group_0_1__0 ) ) | ( ( rule__Member__KeyAssignment_0_2 ) ) );
    public final void rule__Member__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1623:1: ( ( ( rule__Member__Group_0_0__0 ) ) | ( ( rule__Member__Group_0_1__0 ) ) | ( ( rule__Member__KeyAssignment_0_2 ) ) )
            int alt39=3;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt39=1;
                }
                break;
            case 46:
                {
                alt39=2;
                }
                break;
            case RULE_ID:
            case RULE_HTTP:
                {
                alt39=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1624:2: ( ( rule__Member__Group_0_0__0 ) )
                    {
                    // InternalCurlBetterThanHttpie.g:1624:2: ( ( rule__Member__Group_0_0__0 ) )
                    // InternalCurlBetterThanHttpie.g:1625:3: ( rule__Member__Group_0_0__0 )
                    {
                     before(grammarAccess.getMemberAccess().getGroup_0_0()); 
                    // InternalCurlBetterThanHttpie.g:1626:3: ( rule__Member__Group_0_0__0 )
                    // InternalCurlBetterThanHttpie.g:1626:4: rule__Member__Group_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Member__Group_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMemberAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:1630:2: ( ( rule__Member__Group_0_1__0 ) )
                    {
                    // InternalCurlBetterThanHttpie.g:1630:2: ( ( rule__Member__Group_0_1__0 ) )
                    // InternalCurlBetterThanHttpie.g:1631:3: ( rule__Member__Group_0_1__0 )
                    {
                     before(grammarAccess.getMemberAccess().getGroup_0_1()); 
                    // InternalCurlBetterThanHttpie.g:1632:3: ( rule__Member__Group_0_1__0 )
                    // InternalCurlBetterThanHttpie.g:1632:4: rule__Member__Group_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Member__Group_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMemberAccess().getGroup_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCurlBetterThanHttpie.g:1636:2: ( ( rule__Member__KeyAssignment_0_2 ) )
                    {
                    // InternalCurlBetterThanHttpie.g:1636:2: ( ( rule__Member__KeyAssignment_0_2 ) )
                    // InternalCurlBetterThanHttpie.g:1637:3: ( rule__Member__KeyAssignment_0_2 )
                    {
                     before(grammarAccess.getMemberAccess().getKeyAssignment_0_2()); 
                    // InternalCurlBetterThanHttpie.g:1638:3: ( rule__Member__KeyAssignment_0_2 )
                    // InternalCurlBetterThanHttpie.g:1638:4: rule__Member__KeyAssignment_0_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Member__KeyAssignment_0_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getMemberAccess().getKeyAssignment_0_2()); 

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
    // $ANTLR end "rule__Member__Alternatives_0"


    // $ANTLR start "rule__Member__KeyAlternatives_0_0_1_0"
    // InternalCurlBetterThanHttpie.g:1646:1: rule__Member__KeyAlternatives_0_0_1_0 : ( ( RULE_ID ) | ( RULE_HTTP ) );
    public final void rule__Member__KeyAlternatives_0_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1650:1: ( ( RULE_ID ) | ( RULE_HTTP ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID) ) {
                alt40=1;
            }
            else if ( (LA40_0==RULE_HTTP) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1651:2: ( RULE_ID )
                    {
                    // InternalCurlBetterThanHttpie.g:1651:2: ( RULE_ID )
                    // InternalCurlBetterThanHttpie.g:1652:3: RULE_ID
                    {
                     before(grammarAccess.getMemberAccess().getKeyIDTerminalRuleCall_0_0_1_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getMemberAccess().getKeyIDTerminalRuleCall_0_0_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:1657:2: ( RULE_HTTP )
                    {
                    // InternalCurlBetterThanHttpie.g:1657:2: ( RULE_HTTP )
                    // InternalCurlBetterThanHttpie.g:1658:3: RULE_HTTP
                    {
                     before(grammarAccess.getMemberAccess().getKeyHTTPTerminalRuleCall_0_0_1_0_1()); 
                    match(input,RULE_HTTP,FOLLOW_2); 
                     after(grammarAccess.getMemberAccess().getKeyHTTPTerminalRuleCall_0_0_1_0_1()); 

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
    // $ANTLR end "rule__Member__KeyAlternatives_0_0_1_0"


    // $ANTLR start "rule__Member__KeyAlternatives_0_1_1_0"
    // InternalCurlBetterThanHttpie.g:1667:1: rule__Member__KeyAlternatives_0_1_1_0 : ( ( RULE_ID ) | ( RULE_HTTP ) );
    public final void rule__Member__KeyAlternatives_0_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1671:1: ( ( RULE_ID ) | ( RULE_HTTP ) )
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
                    // InternalCurlBetterThanHttpie.g:1672:2: ( RULE_ID )
                    {
                    // InternalCurlBetterThanHttpie.g:1672:2: ( RULE_ID )
                    // InternalCurlBetterThanHttpie.g:1673:3: RULE_ID
                    {
                     before(grammarAccess.getMemberAccess().getKeyIDTerminalRuleCall_0_1_1_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getMemberAccess().getKeyIDTerminalRuleCall_0_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:1678:2: ( RULE_HTTP )
                    {
                    // InternalCurlBetterThanHttpie.g:1678:2: ( RULE_HTTP )
                    // InternalCurlBetterThanHttpie.g:1679:3: RULE_HTTP
                    {
                     before(grammarAccess.getMemberAccess().getKeyHTTPTerminalRuleCall_0_1_1_0_1()); 
                    match(input,RULE_HTTP,FOLLOW_2); 
                     after(grammarAccess.getMemberAccess().getKeyHTTPTerminalRuleCall_0_1_1_0_1()); 

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
    // $ANTLR end "rule__Member__KeyAlternatives_0_1_1_0"


    // $ANTLR start "rule__Member__KeyAlternatives_0_2_0"
    // InternalCurlBetterThanHttpie.g:1688:1: rule__Member__KeyAlternatives_0_2_0 : ( ( RULE_ID ) | ( RULE_HTTP ) );
    public final void rule__Member__KeyAlternatives_0_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1692:1: ( ( RULE_ID ) | ( RULE_HTTP ) )
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
                    // InternalCurlBetterThanHttpie.g:1693:2: ( RULE_ID )
                    {
                    // InternalCurlBetterThanHttpie.g:1693:2: ( RULE_ID )
                    // InternalCurlBetterThanHttpie.g:1694:3: RULE_ID
                    {
                     before(grammarAccess.getMemberAccess().getKeyIDTerminalRuleCall_0_2_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getMemberAccess().getKeyIDTerminalRuleCall_0_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:1699:2: ( RULE_HTTP )
                    {
                    // InternalCurlBetterThanHttpie.g:1699:2: ( RULE_HTTP )
                    // InternalCurlBetterThanHttpie.g:1700:3: RULE_HTTP
                    {
                     before(grammarAccess.getMemberAccess().getKeyHTTPTerminalRuleCall_0_2_0_1()); 
                    match(input,RULE_HTTP,FOLLOW_2); 
                     after(grammarAccess.getMemberAccess().getKeyHTTPTerminalRuleCall_0_2_0_1()); 

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
    // $ANTLR end "rule__Member__KeyAlternatives_0_2_0"


    // $ANTLR start "rule__JsonType__Alternatives"
    // InternalCurlBetterThanHttpie.g:1709:1: rule__JsonType__Alternatives : ( ( ruleJsonObject ) | ( ruleJsonString ) | ( ruleJsonArray ) | ( ruleJsonBoolean ) | ( ruleJsonNull ) | ( ruleJsonNumber ) );
    public final void rule__JsonType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1713:1: ( ( ruleJsonObject ) | ( ruleJsonString ) | ( ruleJsonArray ) | ( ruleJsonBoolean ) | ( ruleJsonNull ) | ( ruleJsonNumber ) )
            int alt43=6;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt43=1;
                }
                break;
            case RULE_ID:
            case RULE_HTTP:
            case 45:
            case 46:
                {
                alt43=2;
                }
                break;
            case 50:
                {
                alt43=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt43=4;
                }
                break;
            case RULE_NULL:
                {
                alt43=5;
                }
                break;
            case RULE_FLOAT:
                {
                alt43=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1714:2: ( ruleJsonObject )
                    {
                    // InternalCurlBetterThanHttpie.g:1714:2: ( ruleJsonObject )
                    // InternalCurlBetterThanHttpie.g:1715:3: ruleJsonObject
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
                    // InternalCurlBetterThanHttpie.g:1720:2: ( ruleJsonString )
                    {
                    // InternalCurlBetterThanHttpie.g:1720:2: ( ruleJsonString )
                    // InternalCurlBetterThanHttpie.g:1721:3: ruleJsonString
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
                    // InternalCurlBetterThanHttpie.g:1726:2: ( ruleJsonArray )
                    {
                    // InternalCurlBetterThanHttpie.g:1726:2: ( ruleJsonArray )
                    // InternalCurlBetterThanHttpie.g:1727:3: ruleJsonArray
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
                    // InternalCurlBetterThanHttpie.g:1732:2: ( ruleJsonBoolean )
                    {
                    // InternalCurlBetterThanHttpie.g:1732:2: ( ruleJsonBoolean )
                    // InternalCurlBetterThanHttpie.g:1733:3: ruleJsonBoolean
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
                    // InternalCurlBetterThanHttpie.g:1738:2: ( ruleJsonNull )
                    {
                    // InternalCurlBetterThanHttpie.g:1738:2: ( ruleJsonNull )
                    // InternalCurlBetterThanHttpie.g:1739:3: ruleJsonNull
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
                    // InternalCurlBetterThanHttpie.g:1744:2: ( ruleJsonNumber )
                    {
                    // InternalCurlBetterThanHttpie.g:1744:2: ( ruleJsonNumber )
                    // InternalCurlBetterThanHttpie.g:1745:3: ruleJsonNumber
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


    // $ANTLR start "rule__JsonString__Alternatives"
    // InternalCurlBetterThanHttpie.g:1754:1: rule__JsonString__Alternatives : ( ( ( rule__JsonString__Group_0__0 ) ) | ( ( rule__JsonString__Group_1__0 ) ) | ( ( rule__JsonString__ValueAssignment_2 ) ) );
    public final void rule__JsonString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1758:1: ( ( ( rule__JsonString__Group_0__0 ) ) | ( ( rule__JsonString__Group_1__0 ) ) | ( ( rule__JsonString__ValueAssignment_2 ) ) )
            int alt44=3;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt44=1;
                }
                break;
            case 46:
                {
                alt44=2;
                }
                break;
            case RULE_ID:
            case RULE_HTTP:
                {
                alt44=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1759:2: ( ( rule__JsonString__Group_0__0 ) )
                    {
                    // InternalCurlBetterThanHttpie.g:1759:2: ( ( rule__JsonString__Group_0__0 ) )
                    // InternalCurlBetterThanHttpie.g:1760:3: ( rule__JsonString__Group_0__0 )
                    {
                     before(grammarAccess.getJsonStringAccess().getGroup_0()); 
                    // InternalCurlBetterThanHttpie.g:1761:3: ( rule__JsonString__Group_0__0 )
                    // InternalCurlBetterThanHttpie.g:1761:4: rule__JsonString__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__JsonString__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getJsonStringAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:1765:2: ( ( rule__JsonString__Group_1__0 ) )
                    {
                    // InternalCurlBetterThanHttpie.g:1765:2: ( ( rule__JsonString__Group_1__0 ) )
                    // InternalCurlBetterThanHttpie.g:1766:3: ( rule__JsonString__Group_1__0 )
                    {
                     before(grammarAccess.getJsonStringAccess().getGroup_1()); 
                    // InternalCurlBetterThanHttpie.g:1767:3: ( rule__JsonString__Group_1__0 )
                    // InternalCurlBetterThanHttpie.g:1767:4: rule__JsonString__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__JsonString__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getJsonStringAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCurlBetterThanHttpie.g:1771:2: ( ( rule__JsonString__ValueAssignment_2 ) )
                    {
                    // InternalCurlBetterThanHttpie.g:1771:2: ( ( rule__JsonString__ValueAssignment_2 ) )
                    // InternalCurlBetterThanHttpie.g:1772:3: ( rule__JsonString__ValueAssignment_2 )
                    {
                     before(grammarAccess.getJsonStringAccess().getValueAssignment_2()); 
                    // InternalCurlBetterThanHttpie.g:1773:3: ( rule__JsonString__ValueAssignment_2 )
                    // InternalCurlBetterThanHttpie.g:1773:4: rule__JsonString__ValueAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__JsonString__ValueAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getJsonStringAccess().getValueAssignment_2()); 

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
    // $ANTLR end "rule__JsonString__Alternatives"


    // $ANTLR start "rule__JsonString__ValueAlternatives_0_1_0"
    // InternalCurlBetterThanHttpie.g:1781:1: rule__JsonString__ValueAlternatives_0_1_0 : ( ( RULE_ID ) | ( RULE_HTTP ) );
    public final void rule__JsonString__ValueAlternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1785:1: ( ( RULE_ID ) | ( RULE_HTTP ) )
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
                    // InternalCurlBetterThanHttpie.g:1786:2: ( RULE_ID )
                    {
                    // InternalCurlBetterThanHttpie.g:1786:2: ( RULE_ID )
                    // InternalCurlBetterThanHttpie.g:1787:3: RULE_ID
                    {
                     before(grammarAccess.getJsonStringAccess().getValueIDTerminalRuleCall_0_1_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getJsonStringAccess().getValueIDTerminalRuleCall_0_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:1792:2: ( RULE_HTTP )
                    {
                    // InternalCurlBetterThanHttpie.g:1792:2: ( RULE_HTTP )
                    // InternalCurlBetterThanHttpie.g:1793:3: RULE_HTTP
                    {
                     before(grammarAccess.getJsonStringAccess().getValueHTTPTerminalRuleCall_0_1_0_1()); 
                    match(input,RULE_HTTP,FOLLOW_2); 
                     after(grammarAccess.getJsonStringAccess().getValueHTTPTerminalRuleCall_0_1_0_1()); 

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
    // $ANTLR end "rule__JsonString__ValueAlternatives_0_1_0"


    // $ANTLR start "rule__JsonString__ValueAlternatives_1_1_0"
    // InternalCurlBetterThanHttpie.g:1802:1: rule__JsonString__ValueAlternatives_1_1_0 : ( ( RULE_ID ) | ( RULE_HTTP ) );
    public final void rule__JsonString__ValueAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1806:1: ( ( RULE_ID ) | ( RULE_HTTP ) )
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
                    // InternalCurlBetterThanHttpie.g:1807:2: ( RULE_ID )
                    {
                    // InternalCurlBetterThanHttpie.g:1807:2: ( RULE_ID )
                    // InternalCurlBetterThanHttpie.g:1808:3: RULE_ID
                    {
                     before(grammarAccess.getJsonStringAccess().getValueIDTerminalRuleCall_1_1_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getJsonStringAccess().getValueIDTerminalRuleCall_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:1813:2: ( RULE_HTTP )
                    {
                    // InternalCurlBetterThanHttpie.g:1813:2: ( RULE_HTTP )
                    // InternalCurlBetterThanHttpie.g:1814:3: RULE_HTTP
                    {
                     before(grammarAccess.getJsonStringAccess().getValueHTTPTerminalRuleCall_1_1_0_1()); 
                    match(input,RULE_HTTP,FOLLOW_2); 
                     after(grammarAccess.getJsonStringAccess().getValueHTTPTerminalRuleCall_1_1_0_1()); 

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
    // $ANTLR end "rule__JsonString__ValueAlternatives_1_1_0"


    // $ANTLR start "rule__JsonString__ValueAlternatives_2_0"
    // InternalCurlBetterThanHttpie.g:1823:1: rule__JsonString__ValueAlternatives_2_0 : ( ( RULE_ID ) | ( RULE_HTTP ) );
    public final void rule__JsonString__ValueAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1827:1: ( ( RULE_ID ) | ( RULE_HTTP ) )
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
                    // InternalCurlBetterThanHttpie.g:1828:2: ( RULE_ID )
                    {
                    // InternalCurlBetterThanHttpie.g:1828:2: ( RULE_ID )
                    // InternalCurlBetterThanHttpie.g:1829:3: RULE_ID
                    {
                     before(grammarAccess.getJsonStringAccess().getValueIDTerminalRuleCall_2_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getJsonStringAccess().getValueIDTerminalRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:1834:2: ( RULE_HTTP )
                    {
                    // InternalCurlBetterThanHttpie.g:1834:2: ( RULE_HTTP )
                    // InternalCurlBetterThanHttpie.g:1835:3: RULE_HTTP
                    {
                     before(grammarAccess.getJsonStringAccess().getValueHTTPTerminalRuleCall_2_0_1()); 
                    match(input,RULE_HTTP,FOLLOW_2); 
                     after(grammarAccess.getJsonStringAccess().getValueHTTPTerminalRuleCall_2_0_1()); 

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
    // $ANTLR end "rule__JsonString__ValueAlternatives_2_0"


    // $ANTLR start "rule__Method__Alternatives"
    // InternalCurlBetterThanHttpie.g:1844:1: rule__Method__Alternatives : ( ( ( 'GET' ) ) | ( ( 'POST' ) ) | ( ( 'PUT' ) ) | ( ( 'DELETE' ) ) );
    public final void rule__Method__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1848:1: ( ( ( 'GET' ) ) | ( ( 'POST' ) ) | ( ( 'PUT' ) ) | ( ( 'DELETE' ) ) )
            int alt48=4;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt48=1;
                }
                break;
            case 33:
                {
                alt48=2;
                }
                break;
            case 34:
                {
                alt48=3;
                }
                break;
            case 35:
                {
                alt48=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1849:2: ( ( 'GET' ) )
                    {
                    // InternalCurlBetterThanHttpie.g:1849:2: ( ( 'GET' ) )
                    // InternalCurlBetterThanHttpie.g:1850:3: ( 'GET' )
                    {
                     before(grammarAccess.getMethodAccess().getGETEnumLiteralDeclaration_0()); 
                    // InternalCurlBetterThanHttpie.g:1851:3: ( 'GET' )
                    // InternalCurlBetterThanHttpie.g:1851:4: 'GET'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getMethodAccess().getGETEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:1855:2: ( ( 'POST' ) )
                    {
                    // InternalCurlBetterThanHttpie.g:1855:2: ( ( 'POST' ) )
                    // InternalCurlBetterThanHttpie.g:1856:3: ( 'POST' )
                    {
                     before(grammarAccess.getMethodAccess().getPOSTEnumLiteralDeclaration_1()); 
                    // InternalCurlBetterThanHttpie.g:1857:3: ( 'POST' )
                    // InternalCurlBetterThanHttpie.g:1857:4: 'POST'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getMethodAccess().getPOSTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCurlBetterThanHttpie.g:1861:2: ( ( 'PUT' ) )
                    {
                    // InternalCurlBetterThanHttpie.g:1861:2: ( ( 'PUT' ) )
                    // InternalCurlBetterThanHttpie.g:1862:3: ( 'PUT' )
                    {
                     before(grammarAccess.getMethodAccess().getPUTEnumLiteralDeclaration_2()); 
                    // InternalCurlBetterThanHttpie.g:1863:3: ( 'PUT' )
                    // InternalCurlBetterThanHttpie.g:1863:4: 'PUT'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getMethodAccess().getPUTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCurlBetterThanHttpie.g:1867:2: ( ( 'DELETE' ) )
                    {
                    // InternalCurlBetterThanHttpie.g:1867:2: ( ( 'DELETE' ) )
                    // InternalCurlBetterThanHttpie.g:1868:3: ( 'DELETE' )
                    {
                     before(grammarAccess.getMethodAccess().getDELETEEnumLiteralDeclaration_3()); 
                    // InternalCurlBetterThanHttpie.g:1869:3: ( 'DELETE' )
                    // InternalCurlBetterThanHttpie.g:1869:4: 'DELETE'
                    {
                    match(input,35,FOLLOW_2); 

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
    // InternalCurlBetterThanHttpie.g:1877:1: rule__CommandLineInterface__Group__0 : rule__CommandLineInterface__Group__0__Impl rule__CommandLineInterface__Group__1 ;
    public final void rule__CommandLineInterface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1881:1: ( rule__CommandLineInterface__Group__0__Impl rule__CommandLineInterface__Group__1 )
            // InternalCurlBetterThanHttpie.g:1882:2: rule__CommandLineInterface__Group__0__Impl rule__CommandLineInterface__Group__1
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
    // InternalCurlBetterThanHttpie.g:1889:1: rule__CommandLineInterface__Group__0__Impl : ( () ) ;
    public final void rule__CommandLineInterface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1893:1: ( ( () ) )
            // InternalCurlBetterThanHttpie.g:1894:1: ( () )
            {
            // InternalCurlBetterThanHttpie.g:1894:1: ( () )
            // InternalCurlBetterThanHttpie.g:1895:2: ()
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getCommandLineInterfaceAction_0()); 
            // InternalCurlBetterThanHttpie.g:1896:2: ()
            // InternalCurlBetterThanHttpie.g:1896:3: 
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
    // InternalCurlBetterThanHttpie.g:1904:1: rule__CommandLineInterface__Group__1 : rule__CommandLineInterface__Group__1__Impl rule__CommandLineInterface__Group__2 ;
    public final void rule__CommandLineInterface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1908:1: ( rule__CommandLineInterface__Group__1__Impl rule__CommandLineInterface__Group__2 )
            // InternalCurlBetterThanHttpie.g:1909:2: rule__CommandLineInterface__Group__1__Impl rule__CommandLineInterface__Group__2
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
    // InternalCurlBetterThanHttpie.g:1916:1: rule__CommandLineInterface__Group__1__Impl : ( RULE_HTTP ) ;
    public final void rule__CommandLineInterface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1920:1: ( ( RULE_HTTP ) )
            // InternalCurlBetterThanHttpie.g:1921:1: ( RULE_HTTP )
            {
            // InternalCurlBetterThanHttpie.g:1921:1: ( RULE_HTTP )
            // InternalCurlBetterThanHttpie.g:1922:2: RULE_HTTP
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
    // InternalCurlBetterThanHttpie.g:1931:1: rule__CommandLineInterface__Group__2 : rule__CommandLineInterface__Group__2__Impl rule__CommandLineInterface__Group__3 ;
    public final void rule__CommandLineInterface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1935:1: ( rule__CommandLineInterface__Group__2__Impl rule__CommandLineInterface__Group__3 )
            // InternalCurlBetterThanHttpie.g:1936:2: rule__CommandLineInterface__Group__2__Impl rule__CommandLineInterface__Group__3
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
    // InternalCurlBetterThanHttpie.g:1943:1: rule__CommandLineInterface__Group__2__Impl : ( ( rule__CommandLineInterface__Group_2__0 )* ) ;
    public final void rule__CommandLineInterface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1947:1: ( ( ( rule__CommandLineInterface__Group_2__0 )* ) )
            // InternalCurlBetterThanHttpie.g:1948:1: ( ( rule__CommandLineInterface__Group_2__0 )* )
            {
            // InternalCurlBetterThanHttpie.g:1948:1: ( ( rule__CommandLineInterface__Group_2__0 )* )
            // InternalCurlBetterThanHttpie.g:1949:2: ( rule__CommandLineInterface__Group_2__0 )*
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getGroup_2()); 
            // InternalCurlBetterThanHttpie.g:1950:2: ( rule__CommandLineInterface__Group_2__0 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==RULE_WS) ) {
                    int LA49_1 = input.LA(2);

                    if ( ((LA49_1>=14 && LA49_1<=21)||(LA49_1>=23 && LA49_1<=24)||(LA49_1>=26 && LA49_1<=31)||LA49_1==39||(LA49_1>=41 && LA49_1<=42)) ) {
                        alt49=1;
                    }


                }


                switch (alt49) {
            	case 1 :
            	    // InternalCurlBetterThanHttpie.g:1950:3: rule__CommandLineInterface__Group_2__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__CommandLineInterface__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
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
    // InternalCurlBetterThanHttpie.g:1958:1: rule__CommandLineInterface__Group__3 : rule__CommandLineInterface__Group__3__Impl rule__CommandLineInterface__Group__4 ;
    public final void rule__CommandLineInterface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1962:1: ( rule__CommandLineInterface__Group__3__Impl rule__CommandLineInterface__Group__4 )
            // InternalCurlBetterThanHttpie.g:1963:2: rule__CommandLineInterface__Group__3__Impl rule__CommandLineInterface__Group__4
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
    // InternalCurlBetterThanHttpie.g:1970:1: rule__CommandLineInterface__Group__3__Impl : ( ( rule__CommandLineInterface__Group_3__0 )? ) ;
    public final void rule__CommandLineInterface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1974:1: ( ( ( rule__CommandLineInterface__Group_3__0 )? ) )
            // InternalCurlBetterThanHttpie.g:1975:1: ( ( rule__CommandLineInterface__Group_3__0 )? )
            {
            // InternalCurlBetterThanHttpie.g:1975:1: ( ( rule__CommandLineInterface__Group_3__0 )? )
            // InternalCurlBetterThanHttpie.g:1976:2: ( rule__CommandLineInterface__Group_3__0 )?
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getGroup_3()); 
            // InternalCurlBetterThanHttpie.g:1977:2: ( rule__CommandLineInterface__Group_3__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_WS) ) {
                int LA50_1 = input.LA(2);

                if ( ((LA50_1>=32 && LA50_1<=35)) ) {
                    alt50=1;
                }
            }
            switch (alt50) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1977:3: rule__CommandLineInterface__Group_3__0
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
    // InternalCurlBetterThanHttpie.g:1985:1: rule__CommandLineInterface__Group__4 : rule__CommandLineInterface__Group__4__Impl rule__CommandLineInterface__Group__5 ;
    public final void rule__CommandLineInterface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1989:1: ( rule__CommandLineInterface__Group__4__Impl rule__CommandLineInterface__Group__5 )
            // InternalCurlBetterThanHttpie.g:1990:2: rule__CommandLineInterface__Group__4__Impl rule__CommandLineInterface__Group__5
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
    // InternalCurlBetterThanHttpie.g:1997:1: rule__CommandLineInterface__Group__4__Impl : ( RULE_WS ) ;
    public final void rule__CommandLineInterface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2001:1: ( ( RULE_WS ) )
            // InternalCurlBetterThanHttpie.g:2002:1: ( RULE_WS )
            {
            // InternalCurlBetterThanHttpie.g:2002:1: ( RULE_WS )
            // InternalCurlBetterThanHttpie.g:2003:2: RULE_WS
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
    // InternalCurlBetterThanHttpie.g:2012:1: rule__CommandLineInterface__Group__5 : rule__CommandLineInterface__Group__5__Impl rule__CommandLineInterface__Group__6 ;
    public final void rule__CommandLineInterface__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2016:1: ( rule__CommandLineInterface__Group__5__Impl rule__CommandLineInterface__Group__6 )
            // InternalCurlBetterThanHttpie.g:2017:2: rule__CommandLineInterface__Group__5__Impl rule__CommandLineInterface__Group__6
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
    // InternalCurlBetterThanHttpie.g:2024:1: rule__CommandLineInterface__Group__5__Impl : ( ( rule__CommandLineInterface__Group_5__0 )? ) ;
    public final void rule__CommandLineInterface__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2028:1: ( ( ( rule__CommandLineInterface__Group_5__0 )? ) )
            // InternalCurlBetterThanHttpie.g:2029:1: ( ( rule__CommandLineInterface__Group_5__0 )? )
            {
            // InternalCurlBetterThanHttpie.g:2029:1: ( ( rule__CommandLineInterface__Group_5__0 )? )
            // InternalCurlBetterThanHttpie.g:2030:2: ( rule__CommandLineInterface__Group_5__0 )?
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getGroup_5()); 
            // InternalCurlBetterThanHttpie.g:2031:2: ( rule__CommandLineInterface__Group_5__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=RULE_ID && LA51_0<=RULE_HTTP)) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:2031:3: rule__CommandLineInterface__Group_5__0
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
    // InternalCurlBetterThanHttpie.g:2039:1: rule__CommandLineInterface__Group__6 : rule__CommandLineInterface__Group__6__Impl rule__CommandLineInterface__Group__7 ;
    public final void rule__CommandLineInterface__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2043:1: ( rule__CommandLineInterface__Group__6__Impl rule__CommandLineInterface__Group__7 )
            // InternalCurlBetterThanHttpie.g:2044:2: rule__CommandLineInterface__Group__6__Impl rule__CommandLineInterface__Group__7
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
    // InternalCurlBetterThanHttpie.g:2051:1: rule__CommandLineInterface__Group__6__Impl : ( ( rule__CommandLineInterface__Alternatives_6 ) ) ;
    public final void rule__CommandLineInterface__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2055:1: ( ( ( rule__CommandLineInterface__Alternatives_6 ) ) )
            // InternalCurlBetterThanHttpie.g:2056:1: ( ( rule__CommandLineInterface__Alternatives_6 ) )
            {
            // InternalCurlBetterThanHttpie.g:2056:1: ( ( rule__CommandLineInterface__Alternatives_6 ) )
            // InternalCurlBetterThanHttpie.g:2057:2: ( rule__CommandLineInterface__Alternatives_6 )
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getAlternatives_6()); 
            // InternalCurlBetterThanHttpie.g:2058:2: ( rule__CommandLineInterface__Alternatives_6 )
            // InternalCurlBetterThanHttpie.g:2058:3: rule__CommandLineInterface__Alternatives_6
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
    // InternalCurlBetterThanHttpie.g:2066:1: rule__CommandLineInterface__Group__7 : rule__CommandLineInterface__Group__7__Impl rule__CommandLineInterface__Group__8 ;
    public final void rule__CommandLineInterface__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2070:1: ( rule__CommandLineInterface__Group__7__Impl rule__CommandLineInterface__Group__8 )
            // InternalCurlBetterThanHttpie.g:2071:2: rule__CommandLineInterface__Group__7__Impl rule__CommandLineInterface__Group__8
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
    // InternalCurlBetterThanHttpie.g:2078:1: rule__CommandLineInterface__Group__7__Impl : ( ( rule__CommandLineInterface__Group_7__0 )? ) ;
    public final void rule__CommandLineInterface__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2082:1: ( ( ( rule__CommandLineInterface__Group_7__0 )? ) )
            // InternalCurlBetterThanHttpie.g:2083:1: ( ( rule__CommandLineInterface__Group_7__0 )? )
            {
            // InternalCurlBetterThanHttpie.g:2083:1: ( ( rule__CommandLineInterface__Group_7__0 )? )
            // InternalCurlBetterThanHttpie.g:2084:2: ( rule__CommandLineInterface__Group_7__0 )?
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getGroup_7()); 
            // InternalCurlBetterThanHttpie.g:2085:2: ( rule__CommandLineInterface__Group_7__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==37) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:2085:3: rule__CommandLineInterface__Group_7__0
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
    // InternalCurlBetterThanHttpie.g:2093:1: rule__CommandLineInterface__Group__8 : rule__CommandLineInterface__Group__8__Impl rule__CommandLineInterface__Group__9 ;
    public final void rule__CommandLineInterface__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2097:1: ( rule__CommandLineInterface__Group__8__Impl rule__CommandLineInterface__Group__9 )
            // InternalCurlBetterThanHttpie.g:2098:2: rule__CommandLineInterface__Group__8__Impl rule__CommandLineInterface__Group__9
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
    // InternalCurlBetterThanHttpie.g:2105:1: rule__CommandLineInterface__Group__8__Impl : ( ( rule__CommandLineInterface__Group_8__0 )? ) ;
    public final void rule__CommandLineInterface__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2109:1: ( ( ( rule__CommandLineInterface__Group_8__0 )? ) )
            // InternalCurlBetterThanHttpie.g:2110:1: ( ( rule__CommandLineInterface__Group_8__0 )? )
            {
            // InternalCurlBetterThanHttpie.g:2110:1: ( ( rule__CommandLineInterface__Group_8__0 )? )
            // InternalCurlBetterThanHttpie.g:2111:2: ( rule__CommandLineInterface__Group_8__0 )?
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getGroup_8()); 
            // InternalCurlBetterThanHttpie.g:2112:2: ( rule__CommandLineInterface__Group_8__0 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_WS) ) {
                int LA53_1 = input.LA(2);

                if ( (LA53_1==38) ) {
                    alt53=1;
                }
            }
            switch (alt53) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:2112:3: rule__CommandLineInterface__Group_8__0
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
    // InternalCurlBetterThanHttpie.g:2120:1: rule__CommandLineInterface__Group__9 : rule__CommandLineInterface__Group__9__Impl rule__CommandLineInterface__Group__10 ;
    public final void rule__CommandLineInterface__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2124:1: ( rule__CommandLineInterface__Group__9__Impl rule__CommandLineInterface__Group__10 )
            // InternalCurlBetterThanHttpie.g:2125:2: rule__CommandLineInterface__Group__9__Impl rule__CommandLineInterface__Group__10
            {
            pushFollow(FOLLOW_7);
            rule__CommandLineInterface__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandLineInterface__Group__10();

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
    // InternalCurlBetterThanHttpie.g:2132:1: rule__CommandLineInterface__Group__9__Impl : ( ( rule__CommandLineInterface__Group_9__0 )* ) ;
    public final void rule__CommandLineInterface__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2136:1: ( ( ( rule__CommandLineInterface__Group_9__0 )* ) )
            // InternalCurlBetterThanHttpie.g:2137:1: ( ( rule__CommandLineInterface__Group_9__0 )* )
            {
            // InternalCurlBetterThanHttpie.g:2137:1: ( ( rule__CommandLineInterface__Group_9__0 )* )
            // InternalCurlBetterThanHttpie.g:2138:2: ( rule__CommandLineInterface__Group_9__0 )*
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getGroup_9()); 
            // InternalCurlBetterThanHttpie.g:2139:2: ( rule__CommandLineInterface__Group_9__0 )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==RULE_WS) ) {
                    int LA54_1 = input.LA(2);

                    if ( ((LA54_1>=RULE_ID && LA54_1<=RULE_HTTP)) ) {
                        alt54=1;
                    }


                }


                switch (alt54) {
            	case 1 :
            	    // InternalCurlBetterThanHttpie.g:2139:3: rule__CommandLineInterface__Group_9__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__CommandLineInterface__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop54;
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


    // $ANTLR start "rule__CommandLineInterface__Group__10"
    // InternalCurlBetterThanHttpie.g:2147:1: rule__CommandLineInterface__Group__10 : rule__CommandLineInterface__Group__10__Impl ;
    public final void rule__CommandLineInterface__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2151:1: ( rule__CommandLineInterface__Group__10__Impl )
            // InternalCurlBetterThanHttpie.g:2152:2: rule__CommandLineInterface__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CommandLineInterface__Group__10__Impl();

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
    // $ANTLR end "rule__CommandLineInterface__Group__10"


    // $ANTLR start "rule__CommandLineInterface__Group__10__Impl"
    // InternalCurlBetterThanHttpie.g:2158:1: rule__CommandLineInterface__Group__10__Impl : ( ( RULE_WS )? ) ;
    public final void rule__CommandLineInterface__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2162:1: ( ( ( RULE_WS )? ) )
            // InternalCurlBetterThanHttpie.g:2163:1: ( ( RULE_WS )? )
            {
            // InternalCurlBetterThanHttpie.g:2163:1: ( ( RULE_WS )? )
            // InternalCurlBetterThanHttpie.g:2164:2: ( RULE_WS )?
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getWSTerminalRuleCall_10()); 
            // InternalCurlBetterThanHttpie.g:2165:2: ( RULE_WS )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_WS) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:2165:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getCommandLineInterfaceAccess().getWSTerminalRuleCall_10()); 

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
    // $ANTLR end "rule__CommandLineInterface__Group__10__Impl"


    // $ANTLR start "rule__CommandLineInterface__Group_2__0"
    // InternalCurlBetterThanHttpie.g:2174:1: rule__CommandLineInterface__Group_2__0 : rule__CommandLineInterface__Group_2__0__Impl rule__CommandLineInterface__Group_2__1 ;
    public final void rule__CommandLineInterface__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2178:1: ( rule__CommandLineInterface__Group_2__0__Impl rule__CommandLineInterface__Group_2__1 )
            // InternalCurlBetterThanHttpie.g:2179:2: rule__CommandLineInterface__Group_2__0__Impl rule__CommandLineInterface__Group_2__1
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
    // InternalCurlBetterThanHttpie.g:2186:1: rule__CommandLineInterface__Group_2__0__Impl : ( RULE_WS ) ;
    public final void rule__CommandLineInterface__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2190:1: ( ( RULE_WS ) )
            // InternalCurlBetterThanHttpie.g:2191:1: ( RULE_WS )
            {
            // InternalCurlBetterThanHttpie.g:2191:1: ( RULE_WS )
            // InternalCurlBetterThanHttpie.g:2192:2: RULE_WS
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
    // InternalCurlBetterThanHttpie.g:2201:1: rule__CommandLineInterface__Group_2__1 : rule__CommandLineInterface__Group_2__1__Impl ;
    public final void rule__CommandLineInterface__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2205:1: ( rule__CommandLineInterface__Group_2__1__Impl )
            // InternalCurlBetterThanHttpie.g:2206:2: rule__CommandLineInterface__Group_2__1__Impl
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
    // InternalCurlBetterThanHttpie.g:2212:1: rule__CommandLineInterface__Group_2__1__Impl : ( ( rule__CommandLineInterface__FlagsAssignment_2_1 ) ) ;
    public final void rule__CommandLineInterface__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2216:1: ( ( ( rule__CommandLineInterface__FlagsAssignment_2_1 ) ) )
            // InternalCurlBetterThanHttpie.g:2217:1: ( ( rule__CommandLineInterface__FlagsAssignment_2_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:2217:1: ( ( rule__CommandLineInterface__FlagsAssignment_2_1 ) )
            // InternalCurlBetterThanHttpie.g:2218:2: ( rule__CommandLineInterface__FlagsAssignment_2_1 )
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getFlagsAssignment_2_1()); 
            // InternalCurlBetterThanHttpie.g:2219:2: ( rule__CommandLineInterface__FlagsAssignment_2_1 )
            // InternalCurlBetterThanHttpie.g:2219:3: rule__CommandLineInterface__FlagsAssignment_2_1
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
    // InternalCurlBetterThanHttpie.g:2228:1: rule__CommandLineInterface__Group_3__0 : rule__CommandLineInterface__Group_3__0__Impl rule__CommandLineInterface__Group_3__1 ;
    public final void rule__CommandLineInterface__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2232:1: ( rule__CommandLineInterface__Group_3__0__Impl rule__CommandLineInterface__Group_3__1 )
            // InternalCurlBetterThanHttpie.g:2233:2: rule__CommandLineInterface__Group_3__0__Impl rule__CommandLineInterface__Group_3__1
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
    // InternalCurlBetterThanHttpie.g:2240:1: rule__CommandLineInterface__Group_3__0__Impl : ( RULE_WS ) ;
    public final void rule__CommandLineInterface__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2244:1: ( ( RULE_WS ) )
            // InternalCurlBetterThanHttpie.g:2245:1: ( RULE_WS )
            {
            // InternalCurlBetterThanHttpie.g:2245:1: ( RULE_WS )
            // InternalCurlBetterThanHttpie.g:2246:2: RULE_WS
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
    // InternalCurlBetterThanHttpie.g:2255:1: rule__CommandLineInterface__Group_3__1 : rule__CommandLineInterface__Group_3__1__Impl ;
    public final void rule__CommandLineInterface__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2259:1: ( rule__CommandLineInterface__Group_3__1__Impl )
            // InternalCurlBetterThanHttpie.g:2260:2: rule__CommandLineInterface__Group_3__1__Impl
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
    // InternalCurlBetterThanHttpie.g:2266:1: rule__CommandLineInterface__Group_3__1__Impl : ( ( rule__CommandLineInterface__MethodAssignment_3_1 ) ) ;
    public final void rule__CommandLineInterface__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2270:1: ( ( ( rule__CommandLineInterface__MethodAssignment_3_1 ) ) )
            // InternalCurlBetterThanHttpie.g:2271:1: ( ( rule__CommandLineInterface__MethodAssignment_3_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:2271:1: ( ( rule__CommandLineInterface__MethodAssignment_3_1 ) )
            // InternalCurlBetterThanHttpie.g:2272:2: ( rule__CommandLineInterface__MethodAssignment_3_1 )
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getMethodAssignment_3_1()); 
            // InternalCurlBetterThanHttpie.g:2273:2: ( rule__CommandLineInterface__MethodAssignment_3_1 )
            // InternalCurlBetterThanHttpie.g:2273:3: rule__CommandLineInterface__MethodAssignment_3_1
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
    // InternalCurlBetterThanHttpie.g:2282:1: rule__CommandLineInterface__Group_5__0 : rule__CommandLineInterface__Group_5__0__Impl rule__CommandLineInterface__Group_5__1 ;
    public final void rule__CommandLineInterface__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2286:1: ( rule__CommandLineInterface__Group_5__0__Impl rule__CommandLineInterface__Group_5__1 )
            // InternalCurlBetterThanHttpie.g:2287:2: rule__CommandLineInterface__Group_5__0__Impl rule__CommandLineInterface__Group_5__1
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
    // InternalCurlBetterThanHttpie.g:2294:1: rule__CommandLineInterface__Group_5__0__Impl : ( ( rule__CommandLineInterface__ProtocolAssignment_5_0 ) ) ;
    public final void rule__CommandLineInterface__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2298:1: ( ( ( rule__CommandLineInterface__ProtocolAssignment_5_0 ) ) )
            // InternalCurlBetterThanHttpie.g:2299:1: ( ( rule__CommandLineInterface__ProtocolAssignment_5_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:2299:1: ( ( rule__CommandLineInterface__ProtocolAssignment_5_0 ) )
            // InternalCurlBetterThanHttpie.g:2300:2: ( rule__CommandLineInterface__ProtocolAssignment_5_0 )
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getProtocolAssignment_5_0()); 
            // InternalCurlBetterThanHttpie.g:2301:2: ( rule__CommandLineInterface__ProtocolAssignment_5_0 )
            // InternalCurlBetterThanHttpie.g:2301:3: rule__CommandLineInterface__ProtocolAssignment_5_0
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
    // InternalCurlBetterThanHttpie.g:2309:1: rule__CommandLineInterface__Group_5__1 : rule__CommandLineInterface__Group_5__1__Impl ;
    public final void rule__CommandLineInterface__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2313:1: ( rule__CommandLineInterface__Group_5__1__Impl )
            // InternalCurlBetterThanHttpie.g:2314:2: rule__CommandLineInterface__Group_5__1__Impl
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
    // InternalCurlBetterThanHttpie.g:2320:1: rule__CommandLineInterface__Group_5__1__Impl : ( '://' ) ;
    public final void rule__CommandLineInterface__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2324:1: ( ( '://' ) )
            // InternalCurlBetterThanHttpie.g:2325:1: ( '://' )
            {
            // InternalCurlBetterThanHttpie.g:2325:1: ( '://' )
            // InternalCurlBetterThanHttpie.g:2326:2: '://'
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getColonSolidusSolidusKeyword_5_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalCurlBetterThanHttpie.g:2336:1: rule__CommandLineInterface__Group_6_0__0 : rule__CommandLineInterface__Group_6_0__0__Impl rule__CommandLineInterface__Group_6_0__1 ;
    public final void rule__CommandLineInterface__Group_6_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2340:1: ( rule__CommandLineInterface__Group_6_0__0__Impl rule__CommandLineInterface__Group_6_0__1 )
            // InternalCurlBetterThanHttpie.g:2341:2: rule__CommandLineInterface__Group_6_0__0__Impl rule__CommandLineInterface__Group_6_0__1
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
    // InternalCurlBetterThanHttpie.g:2348:1: rule__CommandLineInterface__Group_6_0__0__Impl : ( ( rule__CommandLineInterface__UrlAssignment_6_0_0 ) ) ;
    public final void rule__CommandLineInterface__Group_6_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2352:1: ( ( ( rule__CommandLineInterface__UrlAssignment_6_0_0 ) ) )
            // InternalCurlBetterThanHttpie.g:2353:1: ( ( rule__CommandLineInterface__UrlAssignment_6_0_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:2353:1: ( ( rule__CommandLineInterface__UrlAssignment_6_0_0 ) )
            // InternalCurlBetterThanHttpie.g:2354:2: ( rule__CommandLineInterface__UrlAssignment_6_0_0 )
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getUrlAssignment_6_0_0()); 
            // InternalCurlBetterThanHttpie.g:2355:2: ( rule__CommandLineInterface__UrlAssignment_6_0_0 )
            // InternalCurlBetterThanHttpie.g:2355:3: rule__CommandLineInterface__UrlAssignment_6_0_0
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
    // InternalCurlBetterThanHttpie.g:2363:1: rule__CommandLineInterface__Group_6_0__1 : rule__CommandLineInterface__Group_6_0__1__Impl ;
    public final void rule__CommandLineInterface__Group_6_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2367:1: ( rule__CommandLineInterface__Group_6_0__1__Impl )
            // InternalCurlBetterThanHttpie.g:2368:2: rule__CommandLineInterface__Group_6_0__1__Impl
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
    // InternalCurlBetterThanHttpie.g:2374:1: rule__CommandLineInterface__Group_6_0__1__Impl : ( ( rule__CommandLineInterface__Group_6_0_1__0 )? ) ;
    public final void rule__CommandLineInterface__Group_6_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2378:1: ( ( ( rule__CommandLineInterface__Group_6_0_1__0 )? ) )
            // InternalCurlBetterThanHttpie.g:2379:1: ( ( rule__CommandLineInterface__Group_6_0_1__0 )? )
            {
            // InternalCurlBetterThanHttpie.g:2379:1: ( ( rule__CommandLineInterface__Group_6_0_1__0 )? )
            // InternalCurlBetterThanHttpie.g:2380:2: ( rule__CommandLineInterface__Group_6_0_1__0 )?
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getGroup_6_0_1()); 
            // InternalCurlBetterThanHttpie.g:2381:2: ( rule__CommandLineInterface__Group_6_0_1__0 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==25) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:2381:3: rule__CommandLineInterface__Group_6_0_1__0
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
    // InternalCurlBetterThanHttpie.g:2390:1: rule__CommandLineInterface__Group_6_0_1__0 : rule__CommandLineInterface__Group_6_0_1__0__Impl rule__CommandLineInterface__Group_6_0_1__1 ;
    public final void rule__CommandLineInterface__Group_6_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2394:1: ( rule__CommandLineInterface__Group_6_0_1__0__Impl rule__CommandLineInterface__Group_6_0_1__1 )
            // InternalCurlBetterThanHttpie.g:2395:2: rule__CommandLineInterface__Group_6_0_1__0__Impl rule__CommandLineInterface__Group_6_0_1__1
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
    // InternalCurlBetterThanHttpie.g:2402:1: rule__CommandLineInterface__Group_6_0_1__0__Impl : ( ':' ) ;
    public final void rule__CommandLineInterface__Group_6_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2406:1: ( ( ':' ) )
            // InternalCurlBetterThanHttpie.g:2407:1: ( ':' )
            {
            // InternalCurlBetterThanHttpie.g:2407:1: ( ':' )
            // InternalCurlBetterThanHttpie.g:2408:2: ':'
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getColonKeyword_6_0_1_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalCurlBetterThanHttpie.g:2417:1: rule__CommandLineInterface__Group_6_0_1__1 : rule__CommandLineInterface__Group_6_0_1__1__Impl ;
    public final void rule__CommandLineInterface__Group_6_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2421:1: ( rule__CommandLineInterface__Group_6_0_1__1__Impl )
            // InternalCurlBetterThanHttpie.g:2422:2: rule__CommandLineInterface__Group_6_0_1__1__Impl
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
    // InternalCurlBetterThanHttpie.g:2428:1: rule__CommandLineInterface__Group_6_0_1__1__Impl : ( ( rule__CommandLineInterface__PortAssignment_6_0_1_1 ) ) ;
    public final void rule__CommandLineInterface__Group_6_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2432:1: ( ( ( rule__CommandLineInterface__PortAssignment_6_0_1_1 ) ) )
            // InternalCurlBetterThanHttpie.g:2433:1: ( ( rule__CommandLineInterface__PortAssignment_6_0_1_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:2433:1: ( ( rule__CommandLineInterface__PortAssignment_6_0_1_1 ) )
            // InternalCurlBetterThanHttpie.g:2434:2: ( rule__CommandLineInterface__PortAssignment_6_0_1_1 )
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getPortAssignment_6_0_1_1()); 
            // InternalCurlBetterThanHttpie.g:2435:2: ( rule__CommandLineInterface__PortAssignment_6_0_1_1 )
            // InternalCurlBetterThanHttpie.g:2435:3: rule__CommandLineInterface__PortAssignment_6_0_1_1
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
    // InternalCurlBetterThanHttpie.g:2444:1: rule__CommandLineInterface__Group_6_1__0 : rule__CommandLineInterface__Group_6_1__0__Impl rule__CommandLineInterface__Group_6_1__1 ;
    public final void rule__CommandLineInterface__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2448:1: ( rule__CommandLineInterface__Group_6_1__0__Impl rule__CommandLineInterface__Group_6_1__1 )
            // InternalCurlBetterThanHttpie.g:2449:2: rule__CommandLineInterface__Group_6_1__0__Impl rule__CommandLineInterface__Group_6_1__1
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
    // InternalCurlBetterThanHttpie.g:2456:1: rule__CommandLineInterface__Group_6_1__0__Impl : ( ':' ) ;
    public final void rule__CommandLineInterface__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2460:1: ( ( ':' ) )
            // InternalCurlBetterThanHttpie.g:2461:1: ( ':' )
            {
            // InternalCurlBetterThanHttpie.g:2461:1: ( ':' )
            // InternalCurlBetterThanHttpie.g:2462:2: ':'
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getColonKeyword_6_1_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalCurlBetterThanHttpie.g:2471:1: rule__CommandLineInterface__Group_6_1__1 : rule__CommandLineInterface__Group_6_1__1__Impl ;
    public final void rule__CommandLineInterface__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2475:1: ( rule__CommandLineInterface__Group_6_1__1__Impl )
            // InternalCurlBetterThanHttpie.g:2476:2: rule__CommandLineInterface__Group_6_1__1__Impl
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
    // InternalCurlBetterThanHttpie.g:2482:1: rule__CommandLineInterface__Group_6_1__1__Impl : ( ( rule__CommandLineInterface__PortAssignment_6_1_1 )? ) ;
    public final void rule__CommandLineInterface__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2486:1: ( ( ( rule__CommandLineInterface__PortAssignment_6_1_1 )? ) )
            // InternalCurlBetterThanHttpie.g:2487:1: ( ( rule__CommandLineInterface__PortAssignment_6_1_1 )? )
            {
            // InternalCurlBetterThanHttpie.g:2487:1: ( ( rule__CommandLineInterface__PortAssignment_6_1_1 )? )
            // InternalCurlBetterThanHttpie.g:2488:2: ( rule__CommandLineInterface__PortAssignment_6_1_1 )?
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getPortAssignment_6_1_1()); 
            // InternalCurlBetterThanHttpie.g:2489:2: ( rule__CommandLineInterface__PortAssignment_6_1_1 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_INT) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:2489:3: rule__CommandLineInterface__PortAssignment_6_1_1
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
    // InternalCurlBetterThanHttpie.g:2498:1: rule__CommandLineInterface__Group_7__0 : rule__CommandLineInterface__Group_7__0__Impl rule__CommandLineInterface__Group_7__1 ;
    public final void rule__CommandLineInterface__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2502:1: ( rule__CommandLineInterface__Group_7__0__Impl rule__CommandLineInterface__Group_7__1 )
            // InternalCurlBetterThanHttpie.g:2503:2: rule__CommandLineInterface__Group_7__0__Impl rule__CommandLineInterface__Group_7__1
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
    // InternalCurlBetterThanHttpie.g:2510:1: rule__CommandLineInterface__Group_7__0__Impl : ( '/' ) ;
    public final void rule__CommandLineInterface__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2514:1: ( ( '/' ) )
            // InternalCurlBetterThanHttpie.g:2515:1: ( '/' )
            {
            // InternalCurlBetterThanHttpie.g:2515:1: ( '/' )
            // InternalCurlBetterThanHttpie.g:2516:2: '/'
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getSolidusKeyword_7_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalCurlBetterThanHttpie.g:2525:1: rule__CommandLineInterface__Group_7__1 : rule__CommandLineInterface__Group_7__1__Impl ;
    public final void rule__CommandLineInterface__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2529:1: ( rule__CommandLineInterface__Group_7__1__Impl )
            // InternalCurlBetterThanHttpie.g:2530:2: rule__CommandLineInterface__Group_7__1__Impl
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
    // InternalCurlBetterThanHttpie.g:2536:1: rule__CommandLineInterface__Group_7__1__Impl : ( ( rule__CommandLineInterface__ResourceAssignment_7_1 ) ) ;
    public final void rule__CommandLineInterface__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2540:1: ( ( ( rule__CommandLineInterface__ResourceAssignment_7_1 ) ) )
            // InternalCurlBetterThanHttpie.g:2541:1: ( ( rule__CommandLineInterface__ResourceAssignment_7_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:2541:1: ( ( rule__CommandLineInterface__ResourceAssignment_7_1 ) )
            // InternalCurlBetterThanHttpie.g:2542:2: ( rule__CommandLineInterface__ResourceAssignment_7_1 )
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getResourceAssignment_7_1()); 
            // InternalCurlBetterThanHttpie.g:2543:2: ( rule__CommandLineInterface__ResourceAssignment_7_1 )
            // InternalCurlBetterThanHttpie.g:2543:3: rule__CommandLineInterface__ResourceAssignment_7_1
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
    // InternalCurlBetterThanHttpie.g:2552:1: rule__CommandLineInterface__Group_8__0 : rule__CommandLineInterface__Group_8__0__Impl rule__CommandLineInterface__Group_8__1 ;
    public final void rule__CommandLineInterface__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2556:1: ( rule__CommandLineInterface__Group_8__0__Impl rule__CommandLineInterface__Group_8__1 )
            // InternalCurlBetterThanHttpie.g:2557:2: rule__CommandLineInterface__Group_8__0__Impl rule__CommandLineInterface__Group_8__1
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
    // InternalCurlBetterThanHttpie.g:2564:1: rule__CommandLineInterface__Group_8__0__Impl : ( RULE_WS ) ;
    public final void rule__CommandLineInterface__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2568:1: ( ( RULE_WS ) )
            // InternalCurlBetterThanHttpie.g:2569:1: ( RULE_WS )
            {
            // InternalCurlBetterThanHttpie.g:2569:1: ( RULE_WS )
            // InternalCurlBetterThanHttpie.g:2570:2: RULE_WS
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
    // InternalCurlBetterThanHttpie.g:2579:1: rule__CommandLineInterface__Group_8__1 : rule__CommandLineInterface__Group_8__1__Impl ;
    public final void rule__CommandLineInterface__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2583:1: ( rule__CommandLineInterface__Group_8__1__Impl )
            // InternalCurlBetterThanHttpie.g:2584:2: rule__CommandLineInterface__Group_8__1__Impl
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
    // InternalCurlBetterThanHttpie.g:2590:1: rule__CommandLineInterface__Group_8__1__Impl : ( '--' ) ;
    public final void rule__CommandLineInterface__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2594:1: ( ( '--' ) )
            // InternalCurlBetterThanHttpie.g:2595:1: ( '--' )
            {
            // InternalCurlBetterThanHttpie.g:2595:1: ( '--' )
            // InternalCurlBetterThanHttpie.g:2596:2: '--'
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getHyphenMinusHyphenMinusKeyword_8_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalCurlBetterThanHttpie.g:2606:1: rule__CommandLineInterface__Group_9__0 : rule__CommandLineInterface__Group_9__0__Impl rule__CommandLineInterface__Group_9__1 ;
    public final void rule__CommandLineInterface__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2610:1: ( rule__CommandLineInterface__Group_9__0__Impl rule__CommandLineInterface__Group_9__1 )
            // InternalCurlBetterThanHttpie.g:2611:2: rule__CommandLineInterface__Group_9__0__Impl rule__CommandLineInterface__Group_9__1
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
    // InternalCurlBetterThanHttpie.g:2618:1: rule__CommandLineInterface__Group_9__0__Impl : ( RULE_WS ) ;
    public final void rule__CommandLineInterface__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2622:1: ( ( RULE_WS ) )
            // InternalCurlBetterThanHttpie.g:2623:1: ( RULE_WS )
            {
            // InternalCurlBetterThanHttpie.g:2623:1: ( RULE_WS )
            // InternalCurlBetterThanHttpie.g:2624:2: RULE_WS
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
    // InternalCurlBetterThanHttpie.g:2633:1: rule__CommandLineInterface__Group_9__1 : rule__CommandLineInterface__Group_9__1__Impl ;
    public final void rule__CommandLineInterface__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2637:1: ( rule__CommandLineInterface__Group_9__1__Impl )
            // InternalCurlBetterThanHttpie.g:2638:2: rule__CommandLineInterface__Group_9__1__Impl
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
    // InternalCurlBetterThanHttpie.g:2644:1: rule__CommandLineInterface__Group_9__1__Impl : ( ( rule__CommandLineInterface__ItemsAssignment_9_1 ) ) ;
    public final void rule__CommandLineInterface__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2648:1: ( ( ( rule__CommandLineInterface__ItemsAssignment_9_1 ) ) )
            // InternalCurlBetterThanHttpie.g:2649:1: ( ( rule__CommandLineInterface__ItemsAssignment_9_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:2649:1: ( ( rule__CommandLineInterface__ItemsAssignment_9_1 ) )
            // InternalCurlBetterThanHttpie.g:2650:2: ( rule__CommandLineInterface__ItemsAssignment_9_1 )
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getItemsAssignment_9_1()); 
            // InternalCurlBetterThanHttpie.g:2651:2: ( rule__CommandLineInterface__ItemsAssignment_9_1 )
            // InternalCurlBetterThanHttpie.g:2651:3: rule__CommandLineInterface__ItemsAssignment_9_1
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
    // InternalCurlBetterThanHttpie.g:2660:1: rule__HeadersFlag__Group__0 : rule__HeadersFlag__Group__0__Impl rule__HeadersFlag__Group__1 ;
    public final void rule__HeadersFlag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2664:1: ( rule__HeadersFlag__Group__0__Impl rule__HeadersFlag__Group__1 )
            // InternalCurlBetterThanHttpie.g:2665:2: rule__HeadersFlag__Group__0__Impl rule__HeadersFlag__Group__1
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
    // InternalCurlBetterThanHttpie.g:2672:1: rule__HeadersFlag__Group__0__Impl : ( () ) ;
    public final void rule__HeadersFlag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2676:1: ( ( () ) )
            // InternalCurlBetterThanHttpie.g:2677:1: ( () )
            {
            // InternalCurlBetterThanHttpie.g:2677:1: ( () )
            // InternalCurlBetterThanHttpie.g:2678:2: ()
            {
             before(grammarAccess.getHeadersFlagAccess().getHeadersFlagAction_0()); 
            // InternalCurlBetterThanHttpie.g:2679:2: ()
            // InternalCurlBetterThanHttpie.g:2679:3: 
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
    // InternalCurlBetterThanHttpie.g:2687:1: rule__HeadersFlag__Group__1 : rule__HeadersFlag__Group__1__Impl ;
    public final void rule__HeadersFlag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2691:1: ( rule__HeadersFlag__Group__1__Impl )
            // InternalCurlBetterThanHttpie.g:2692:2: rule__HeadersFlag__Group__1__Impl
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
    // InternalCurlBetterThanHttpie.g:2698:1: rule__HeadersFlag__Group__1__Impl : ( ( rule__HeadersFlag__Alternatives_1 ) ) ;
    public final void rule__HeadersFlag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2702:1: ( ( ( rule__HeadersFlag__Alternatives_1 ) ) )
            // InternalCurlBetterThanHttpie.g:2703:1: ( ( rule__HeadersFlag__Alternatives_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:2703:1: ( ( rule__HeadersFlag__Alternatives_1 ) )
            // InternalCurlBetterThanHttpie.g:2704:2: ( rule__HeadersFlag__Alternatives_1 )
            {
             before(grammarAccess.getHeadersFlagAccess().getAlternatives_1()); 
            // InternalCurlBetterThanHttpie.g:2705:2: ( rule__HeadersFlag__Alternatives_1 )
            // InternalCurlBetterThanHttpie.g:2705:3: rule__HeadersFlag__Alternatives_1
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
    // InternalCurlBetterThanHttpie.g:2714:1: rule__BodyFlag__Group__0 : rule__BodyFlag__Group__0__Impl rule__BodyFlag__Group__1 ;
    public final void rule__BodyFlag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2718:1: ( rule__BodyFlag__Group__0__Impl rule__BodyFlag__Group__1 )
            // InternalCurlBetterThanHttpie.g:2719:2: rule__BodyFlag__Group__0__Impl rule__BodyFlag__Group__1
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
    // InternalCurlBetterThanHttpie.g:2726:1: rule__BodyFlag__Group__0__Impl : ( () ) ;
    public final void rule__BodyFlag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2730:1: ( ( () ) )
            // InternalCurlBetterThanHttpie.g:2731:1: ( () )
            {
            // InternalCurlBetterThanHttpie.g:2731:1: ( () )
            // InternalCurlBetterThanHttpie.g:2732:2: ()
            {
             before(grammarAccess.getBodyFlagAccess().getBodyFlagAction_0()); 
            // InternalCurlBetterThanHttpie.g:2733:2: ()
            // InternalCurlBetterThanHttpie.g:2733:3: 
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
    // InternalCurlBetterThanHttpie.g:2741:1: rule__BodyFlag__Group__1 : rule__BodyFlag__Group__1__Impl ;
    public final void rule__BodyFlag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2745:1: ( rule__BodyFlag__Group__1__Impl )
            // InternalCurlBetterThanHttpie.g:2746:2: rule__BodyFlag__Group__1__Impl
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
    // InternalCurlBetterThanHttpie.g:2752:1: rule__BodyFlag__Group__1__Impl : ( ( rule__BodyFlag__Alternatives_1 ) ) ;
    public final void rule__BodyFlag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2756:1: ( ( ( rule__BodyFlag__Alternatives_1 ) ) )
            // InternalCurlBetterThanHttpie.g:2757:1: ( ( rule__BodyFlag__Alternatives_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:2757:1: ( ( rule__BodyFlag__Alternatives_1 ) )
            // InternalCurlBetterThanHttpie.g:2758:2: ( rule__BodyFlag__Alternatives_1 )
            {
             before(grammarAccess.getBodyFlagAccess().getAlternatives_1()); 
            // InternalCurlBetterThanHttpie.g:2759:2: ( rule__BodyFlag__Alternatives_1 )
            // InternalCurlBetterThanHttpie.g:2759:3: rule__BodyFlag__Alternatives_1
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
    // InternalCurlBetterThanHttpie.g:2768:1: rule__JsonFlag__Group__0 : rule__JsonFlag__Group__0__Impl rule__JsonFlag__Group__1 ;
    public final void rule__JsonFlag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2772:1: ( rule__JsonFlag__Group__0__Impl rule__JsonFlag__Group__1 )
            // InternalCurlBetterThanHttpie.g:2773:2: rule__JsonFlag__Group__0__Impl rule__JsonFlag__Group__1
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
    // InternalCurlBetterThanHttpie.g:2780:1: rule__JsonFlag__Group__0__Impl : ( () ) ;
    public final void rule__JsonFlag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2784:1: ( ( () ) )
            // InternalCurlBetterThanHttpie.g:2785:1: ( () )
            {
            // InternalCurlBetterThanHttpie.g:2785:1: ( () )
            // InternalCurlBetterThanHttpie.g:2786:2: ()
            {
             before(grammarAccess.getJsonFlagAccess().getJsonFlagAction_0()); 
            // InternalCurlBetterThanHttpie.g:2787:2: ()
            // InternalCurlBetterThanHttpie.g:2787:3: 
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
    // InternalCurlBetterThanHttpie.g:2795:1: rule__JsonFlag__Group__1 : rule__JsonFlag__Group__1__Impl ;
    public final void rule__JsonFlag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2799:1: ( rule__JsonFlag__Group__1__Impl )
            // InternalCurlBetterThanHttpie.g:2800:2: rule__JsonFlag__Group__1__Impl
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
    // InternalCurlBetterThanHttpie.g:2806:1: rule__JsonFlag__Group__1__Impl : ( ( rule__JsonFlag__Alternatives_1 ) ) ;
    public final void rule__JsonFlag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2810:1: ( ( ( rule__JsonFlag__Alternatives_1 ) ) )
            // InternalCurlBetterThanHttpie.g:2811:1: ( ( rule__JsonFlag__Alternatives_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:2811:1: ( ( rule__JsonFlag__Alternatives_1 ) )
            // InternalCurlBetterThanHttpie.g:2812:2: ( rule__JsonFlag__Alternatives_1 )
            {
             before(grammarAccess.getJsonFlagAccess().getAlternatives_1()); 
            // InternalCurlBetterThanHttpie.g:2813:2: ( rule__JsonFlag__Alternatives_1 )
            // InternalCurlBetterThanHttpie.g:2813:3: rule__JsonFlag__Alternatives_1
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
    // InternalCurlBetterThanHttpie.g:2822:1: rule__FormFlag__Group__0 : rule__FormFlag__Group__0__Impl rule__FormFlag__Group__1 ;
    public final void rule__FormFlag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2826:1: ( rule__FormFlag__Group__0__Impl rule__FormFlag__Group__1 )
            // InternalCurlBetterThanHttpie.g:2827:2: rule__FormFlag__Group__0__Impl rule__FormFlag__Group__1
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
    // InternalCurlBetterThanHttpie.g:2834:1: rule__FormFlag__Group__0__Impl : ( () ) ;
    public final void rule__FormFlag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2838:1: ( ( () ) )
            // InternalCurlBetterThanHttpie.g:2839:1: ( () )
            {
            // InternalCurlBetterThanHttpie.g:2839:1: ( () )
            // InternalCurlBetterThanHttpie.g:2840:2: ()
            {
             before(grammarAccess.getFormFlagAccess().getFormFlagAction_0()); 
            // InternalCurlBetterThanHttpie.g:2841:2: ()
            // InternalCurlBetterThanHttpie.g:2841:3: 
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
    // InternalCurlBetterThanHttpie.g:2849:1: rule__FormFlag__Group__1 : rule__FormFlag__Group__1__Impl ;
    public final void rule__FormFlag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2853:1: ( rule__FormFlag__Group__1__Impl )
            // InternalCurlBetterThanHttpie.g:2854:2: rule__FormFlag__Group__1__Impl
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
    // InternalCurlBetterThanHttpie.g:2860:1: rule__FormFlag__Group__1__Impl : ( ( rule__FormFlag__Alternatives_1 ) ) ;
    public final void rule__FormFlag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2864:1: ( ( ( rule__FormFlag__Alternatives_1 ) ) )
            // InternalCurlBetterThanHttpie.g:2865:1: ( ( rule__FormFlag__Alternatives_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:2865:1: ( ( rule__FormFlag__Alternatives_1 ) )
            // InternalCurlBetterThanHttpie.g:2866:2: ( rule__FormFlag__Alternatives_1 )
            {
             before(grammarAccess.getFormFlagAccess().getAlternatives_1()); 
            // InternalCurlBetterThanHttpie.g:2867:2: ( rule__FormFlag__Alternatives_1 )
            // InternalCurlBetterThanHttpie.g:2867:3: rule__FormFlag__Alternatives_1
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
    // InternalCurlBetterThanHttpie.g:2876:1: rule__ProxyFlag__Group__0 : rule__ProxyFlag__Group__0__Impl rule__ProxyFlag__Group__1 ;
    public final void rule__ProxyFlag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2880:1: ( rule__ProxyFlag__Group__0__Impl rule__ProxyFlag__Group__1 )
            // InternalCurlBetterThanHttpie.g:2881:2: rule__ProxyFlag__Group__0__Impl rule__ProxyFlag__Group__1
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
    // InternalCurlBetterThanHttpie.g:2888:1: rule__ProxyFlag__Group__0__Impl : ( '--proxy' ) ;
    public final void rule__ProxyFlag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2892:1: ( ( '--proxy' ) )
            // InternalCurlBetterThanHttpie.g:2893:1: ( '--proxy' )
            {
            // InternalCurlBetterThanHttpie.g:2893:1: ( '--proxy' )
            // InternalCurlBetterThanHttpie.g:2894:2: '--proxy'
            {
             before(grammarAccess.getProxyFlagAccess().getProxyKeyword_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalCurlBetterThanHttpie.g:2903:1: rule__ProxyFlag__Group__1 : rule__ProxyFlag__Group__1__Impl rule__ProxyFlag__Group__2 ;
    public final void rule__ProxyFlag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2907:1: ( rule__ProxyFlag__Group__1__Impl rule__ProxyFlag__Group__2 )
            // InternalCurlBetterThanHttpie.g:2908:2: rule__ProxyFlag__Group__1__Impl rule__ProxyFlag__Group__2
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
    // InternalCurlBetterThanHttpie.g:2915:1: rule__ProxyFlag__Group__1__Impl : ( ( rule__ProxyFlag__Alternatives_1 ) ) ;
    public final void rule__ProxyFlag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2919:1: ( ( ( rule__ProxyFlag__Alternatives_1 ) ) )
            // InternalCurlBetterThanHttpie.g:2920:1: ( ( rule__ProxyFlag__Alternatives_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:2920:1: ( ( rule__ProxyFlag__Alternatives_1 ) )
            // InternalCurlBetterThanHttpie.g:2921:2: ( rule__ProxyFlag__Alternatives_1 )
            {
             before(grammarAccess.getProxyFlagAccess().getAlternatives_1()); 
            // InternalCurlBetterThanHttpie.g:2922:2: ( rule__ProxyFlag__Alternatives_1 )
            // InternalCurlBetterThanHttpie.g:2922:3: rule__ProxyFlag__Alternatives_1
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
    // InternalCurlBetterThanHttpie.g:2930:1: rule__ProxyFlag__Group__2 : rule__ProxyFlag__Group__2__Impl rule__ProxyFlag__Group__3 ;
    public final void rule__ProxyFlag__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2934:1: ( rule__ProxyFlag__Group__2__Impl rule__ProxyFlag__Group__3 )
            // InternalCurlBetterThanHttpie.g:2935:2: rule__ProxyFlag__Group__2__Impl rule__ProxyFlag__Group__3
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
    // InternalCurlBetterThanHttpie.g:2942:1: rule__ProxyFlag__Group__2__Impl : ( ( rule__ProxyFlag__Alternatives_2 ) ) ;
    public final void rule__ProxyFlag__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2946:1: ( ( ( rule__ProxyFlag__Alternatives_2 ) ) )
            // InternalCurlBetterThanHttpie.g:2947:1: ( ( rule__ProxyFlag__Alternatives_2 ) )
            {
            // InternalCurlBetterThanHttpie.g:2947:1: ( ( rule__ProxyFlag__Alternatives_2 ) )
            // InternalCurlBetterThanHttpie.g:2948:2: ( rule__ProxyFlag__Alternatives_2 )
            {
             before(grammarAccess.getProxyFlagAccess().getAlternatives_2()); 
            // InternalCurlBetterThanHttpie.g:2949:2: ( rule__ProxyFlag__Alternatives_2 )
            // InternalCurlBetterThanHttpie.g:2949:3: rule__ProxyFlag__Alternatives_2
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
    // InternalCurlBetterThanHttpie.g:2957:1: rule__ProxyFlag__Group__3 : rule__ProxyFlag__Group__3__Impl rule__ProxyFlag__Group__4 ;
    public final void rule__ProxyFlag__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2961:1: ( rule__ProxyFlag__Group__3__Impl rule__ProxyFlag__Group__4 )
            // InternalCurlBetterThanHttpie.g:2962:2: rule__ProxyFlag__Group__3__Impl rule__ProxyFlag__Group__4
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
    // InternalCurlBetterThanHttpie.g:2969:1: rule__ProxyFlag__Group__3__Impl : ( ( rule__ProxyFlag__Group_3__0 )? ) ;
    public final void rule__ProxyFlag__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2973:1: ( ( ( rule__ProxyFlag__Group_3__0 )? ) )
            // InternalCurlBetterThanHttpie.g:2974:1: ( ( rule__ProxyFlag__Group_3__0 )? )
            {
            // InternalCurlBetterThanHttpie.g:2974:1: ( ( rule__ProxyFlag__Group_3__0 )? )
            // InternalCurlBetterThanHttpie.g:2975:2: ( rule__ProxyFlag__Group_3__0 )?
            {
             before(grammarAccess.getProxyFlagAccess().getGroup_3()); 
            // InternalCurlBetterThanHttpie.g:2976:2: ( rule__ProxyFlag__Group_3__0 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( ((LA58_0>=RULE_ID && LA58_0<=RULE_HTTP)) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:2976:3: rule__ProxyFlag__Group_3__0
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
    // InternalCurlBetterThanHttpie.g:2984:1: rule__ProxyFlag__Group__4 : rule__ProxyFlag__Group__4__Impl ;
    public final void rule__ProxyFlag__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2988:1: ( rule__ProxyFlag__Group__4__Impl )
            // InternalCurlBetterThanHttpie.g:2989:2: rule__ProxyFlag__Group__4__Impl
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
    // InternalCurlBetterThanHttpie.g:2995:1: rule__ProxyFlag__Group__4__Impl : ( ( rule__ProxyFlag__Alternatives_4 ) ) ;
    public final void rule__ProxyFlag__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2999:1: ( ( ( rule__ProxyFlag__Alternatives_4 ) ) )
            // InternalCurlBetterThanHttpie.g:3000:1: ( ( rule__ProxyFlag__Alternatives_4 ) )
            {
            // InternalCurlBetterThanHttpie.g:3000:1: ( ( rule__ProxyFlag__Alternatives_4 ) )
            // InternalCurlBetterThanHttpie.g:3001:2: ( rule__ProxyFlag__Alternatives_4 )
            {
             before(grammarAccess.getProxyFlagAccess().getAlternatives_4()); 
            // InternalCurlBetterThanHttpie.g:3002:2: ( rule__ProxyFlag__Alternatives_4 )
            // InternalCurlBetterThanHttpie.g:3002:3: rule__ProxyFlag__Alternatives_4
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
    // InternalCurlBetterThanHttpie.g:3011:1: rule__ProxyFlag__Group_2_0__0 : rule__ProxyFlag__Group_2_0__0__Impl rule__ProxyFlag__Group_2_0__1 ;
    public final void rule__ProxyFlag__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3015:1: ( rule__ProxyFlag__Group_2_0__0__Impl rule__ProxyFlag__Group_2_0__1 )
            // InternalCurlBetterThanHttpie.g:3016:2: rule__ProxyFlag__Group_2_0__0__Impl rule__ProxyFlag__Group_2_0__1
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
    // InternalCurlBetterThanHttpie.g:3023:1: rule__ProxyFlag__Group_2_0__0__Impl : ( ( rule__ProxyFlag__ProtocolAssignment_2_0_0 ) ) ;
    public final void rule__ProxyFlag__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3027:1: ( ( ( rule__ProxyFlag__ProtocolAssignment_2_0_0 ) ) )
            // InternalCurlBetterThanHttpie.g:3028:1: ( ( rule__ProxyFlag__ProtocolAssignment_2_0_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:3028:1: ( ( rule__ProxyFlag__ProtocolAssignment_2_0_0 ) )
            // InternalCurlBetterThanHttpie.g:3029:2: ( rule__ProxyFlag__ProtocolAssignment_2_0_0 )
            {
             before(grammarAccess.getProxyFlagAccess().getProtocolAssignment_2_0_0()); 
            // InternalCurlBetterThanHttpie.g:3030:2: ( rule__ProxyFlag__ProtocolAssignment_2_0_0 )
            // InternalCurlBetterThanHttpie.g:3030:3: rule__ProxyFlag__ProtocolAssignment_2_0_0
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
    // InternalCurlBetterThanHttpie.g:3038:1: rule__ProxyFlag__Group_2_0__1 : rule__ProxyFlag__Group_2_0__1__Impl ;
    public final void rule__ProxyFlag__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3042:1: ( rule__ProxyFlag__Group_2_0__1__Impl )
            // InternalCurlBetterThanHttpie.g:3043:2: rule__ProxyFlag__Group_2_0__1__Impl
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
    // InternalCurlBetterThanHttpie.g:3049:1: rule__ProxyFlag__Group_2_0__1__Impl : ( ':' ) ;
    public final void rule__ProxyFlag__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3053:1: ( ( ':' ) )
            // InternalCurlBetterThanHttpie.g:3054:1: ( ':' )
            {
            // InternalCurlBetterThanHttpie.g:3054:1: ( ':' )
            // InternalCurlBetterThanHttpie.g:3055:2: ':'
            {
             before(grammarAccess.getProxyFlagAccess().getColonKeyword_2_0_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalCurlBetterThanHttpie.g:3065:1: rule__ProxyFlag__Group_2_1__0 : rule__ProxyFlag__Group_2_1__0__Impl rule__ProxyFlag__Group_2_1__1 ;
    public final void rule__ProxyFlag__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3069:1: ( rule__ProxyFlag__Group_2_1__0__Impl rule__ProxyFlag__Group_2_1__1 )
            // InternalCurlBetterThanHttpie.g:3070:2: rule__ProxyFlag__Group_2_1__0__Impl rule__ProxyFlag__Group_2_1__1
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
    // InternalCurlBetterThanHttpie.g:3077:1: rule__ProxyFlag__Group_2_1__0__Impl : ( ( rule__ProxyFlag__ProxyProtocolAssignment_2_1_0 ) ) ;
    public final void rule__ProxyFlag__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3081:1: ( ( ( rule__ProxyFlag__ProxyProtocolAssignment_2_1_0 ) ) )
            // InternalCurlBetterThanHttpie.g:3082:1: ( ( rule__ProxyFlag__ProxyProtocolAssignment_2_1_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:3082:1: ( ( rule__ProxyFlag__ProxyProtocolAssignment_2_1_0 ) )
            // InternalCurlBetterThanHttpie.g:3083:2: ( rule__ProxyFlag__ProxyProtocolAssignment_2_1_0 )
            {
             before(grammarAccess.getProxyFlagAccess().getProxyProtocolAssignment_2_1_0()); 
            // InternalCurlBetterThanHttpie.g:3084:2: ( rule__ProxyFlag__ProxyProtocolAssignment_2_1_0 )
            // InternalCurlBetterThanHttpie.g:3084:3: rule__ProxyFlag__ProxyProtocolAssignment_2_1_0
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
    // InternalCurlBetterThanHttpie.g:3092:1: rule__ProxyFlag__Group_2_1__1 : rule__ProxyFlag__Group_2_1__1__Impl ;
    public final void rule__ProxyFlag__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3096:1: ( rule__ProxyFlag__Group_2_1__1__Impl )
            // InternalCurlBetterThanHttpie.g:3097:2: rule__ProxyFlag__Group_2_1__1__Impl
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
    // InternalCurlBetterThanHttpie.g:3103:1: rule__ProxyFlag__Group_2_1__1__Impl : ( '://' ) ;
    public final void rule__ProxyFlag__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3107:1: ( ( '://' ) )
            // InternalCurlBetterThanHttpie.g:3108:1: ( '://' )
            {
            // InternalCurlBetterThanHttpie.g:3108:1: ( '://' )
            // InternalCurlBetterThanHttpie.g:3109:2: '://'
            {
             before(grammarAccess.getProxyFlagAccess().getColonSolidusSolidusKeyword_2_1_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalCurlBetterThanHttpie.g:3119:1: rule__ProxyFlag__Group_2_2__0 : rule__ProxyFlag__Group_2_2__0__Impl rule__ProxyFlag__Group_2_2__1 ;
    public final void rule__ProxyFlag__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3123:1: ( rule__ProxyFlag__Group_2_2__0__Impl rule__ProxyFlag__Group_2_2__1 )
            // InternalCurlBetterThanHttpie.g:3124:2: rule__ProxyFlag__Group_2_2__0__Impl rule__ProxyFlag__Group_2_2__1
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
    // InternalCurlBetterThanHttpie.g:3131:1: rule__ProxyFlag__Group_2_2__0__Impl : ( ( rule__ProxyFlag__ProtocolAssignment_2_2_0 ) ) ;
    public final void rule__ProxyFlag__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3135:1: ( ( ( rule__ProxyFlag__ProtocolAssignment_2_2_0 ) ) )
            // InternalCurlBetterThanHttpie.g:3136:1: ( ( rule__ProxyFlag__ProtocolAssignment_2_2_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:3136:1: ( ( rule__ProxyFlag__ProtocolAssignment_2_2_0 ) )
            // InternalCurlBetterThanHttpie.g:3137:2: ( rule__ProxyFlag__ProtocolAssignment_2_2_0 )
            {
             before(grammarAccess.getProxyFlagAccess().getProtocolAssignment_2_2_0()); 
            // InternalCurlBetterThanHttpie.g:3138:2: ( rule__ProxyFlag__ProtocolAssignment_2_2_0 )
            // InternalCurlBetterThanHttpie.g:3138:3: rule__ProxyFlag__ProtocolAssignment_2_2_0
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
    // InternalCurlBetterThanHttpie.g:3146:1: rule__ProxyFlag__Group_2_2__1 : rule__ProxyFlag__Group_2_2__1__Impl rule__ProxyFlag__Group_2_2__2 ;
    public final void rule__ProxyFlag__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3150:1: ( rule__ProxyFlag__Group_2_2__1__Impl rule__ProxyFlag__Group_2_2__2 )
            // InternalCurlBetterThanHttpie.g:3151:2: rule__ProxyFlag__Group_2_2__1__Impl rule__ProxyFlag__Group_2_2__2
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
    // InternalCurlBetterThanHttpie.g:3158:1: rule__ProxyFlag__Group_2_2__1__Impl : ( ':' ) ;
    public final void rule__ProxyFlag__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3162:1: ( ( ':' ) )
            // InternalCurlBetterThanHttpie.g:3163:1: ( ':' )
            {
            // InternalCurlBetterThanHttpie.g:3163:1: ( ':' )
            // InternalCurlBetterThanHttpie.g:3164:2: ':'
            {
             before(grammarAccess.getProxyFlagAccess().getColonKeyword_2_2_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalCurlBetterThanHttpie.g:3173:1: rule__ProxyFlag__Group_2_2__2 : rule__ProxyFlag__Group_2_2__2__Impl rule__ProxyFlag__Group_2_2__3 ;
    public final void rule__ProxyFlag__Group_2_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3177:1: ( rule__ProxyFlag__Group_2_2__2__Impl rule__ProxyFlag__Group_2_2__3 )
            // InternalCurlBetterThanHttpie.g:3178:2: rule__ProxyFlag__Group_2_2__2__Impl rule__ProxyFlag__Group_2_2__3
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
    // InternalCurlBetterThanHttpie.g:3185:1: rule__ProxyFlag__Group_2_2__2__Impl : ( ( rule__ProxyFlag__ProxyProtocolAssignment_2_2_2 ) ) ;
    public final void rule__ProxyFlag__Group_2_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3189:1: ( ( ( rule__ProxyFlag__ProxyProtocolAssignment_2_2_2 ) ) )
            // InternalCurlBetterThanHttpie.g:3190:1: ( ( rule__ProxyFlag__ProxyProtocolAssignment_2_2_2 ) )
            {
            // InternalCurlBetterThanHttpie.g:3190:1: ( ( rule__ProxyFlag__ProxyProtocolAssignment_2_2_2 ) )
            // InternalCurlBetterThanHttpie.g:3191:2: ( rule__ProxyFlag__ProxyProtocolAssignment_2_2_2 )
            {
             before(grammarAccess.getProxyFlagAccess().getProxyProtocolAssignment_2_2_2()); 
            // InternalCurlBetterThanHttpie.g:3192:2: ( rule__ProxyFlag__ProxyProtocolAssignment_2_2_2 )
            // InternalCurlBetterThanHttpie.g:3192:3: rule__ProxyFlag__ProxyProtocolAssignment_2_2_2
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
    // InternalCurlBetterThanHttpie.g:3200:1: rule__ProxyFlag__Group_2_2__3 : rule__ProxyFlag__Group_2_2__3__Impl ;
    public final void rule__ProxyFlag__Group_2_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3204:1: ( rule__ProxyFlag__Group_2_2__3__Impl )
            // InternalCurlBetterThanHttpie.g:3205:2: rule__ProxyFlag__Group_2_2__3__Impl
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
    // InternalCurlBetterThanHttpie.g:3211:1: rule__ProxyFlag__Group_2_2__3__Impl : ( '://' ) ;
    public final void rule__ProxyFlag__Group_2_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3215:1: ( ( '://' ) )
            // InternalCurlBetterThanHttpie.g:3216:1: ( '://' )
            {
            // InternalCurlBetterThanHttpie.g:3216:1: ( '://' )
            // InternalCurlBetterThanHttpie.g:3217:2: '://'
            {
             before(grammarAccess.getProxyFlagAccess().getColonSolidusSolidusKeyword_2_2_3()); 
            match(input,36,FOLLOW_2); 
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
    // InternalCurlBetterThanHttpie.g:3227:1: rule__ProxyFlag__Group_3__0 : rule__ProxyFlag__Group_3__0__Impl rule__ProxyFlag__Group_3__1 ;
    public final void rule__ProxyFlag__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3231:1: ( rule__ProxyFlag__Group_3__0__Impl rule__ProxyFlag__Group_3__1 )
            // InternalCurlBetterThanHttpie.g:3232:2: rule__ProxyFlag__Group_3__0__Impl rule__ProxyFlag__Group_3__1
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
    // InternalCurlBetterThanHttpie.g:3239:1: rule__ProxyFlag__Group_3__0__Impl : ( ( rule__ProxyFlag__UsernameAssignment_3_0 ) ) ;
    public final void rule__ProxyFlag__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3243:1: ( ( ( rule__ProxyFlag__UsernameAssignment_3_0 ) ) )
            // InternalCurlBetterThanHttpie.g:3244:1: ( ( rule__ProxyFlag__UsernameAssignment_3_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:3244:1: ( ( rule__ProxyFlag__UsernameAssignment_3_0 ) )
            // InternalCurlBetterThanHttpie.g:3245:2: ( rule__ProxyFlag__UsernameAssignment_3_0 )
            {
             before(grammarAccess.getProxyFlagAccess().getUsernameAssignment_3_0()); 
            // InternalCurlBetterThanHttpie.g:3246:2: ( rule__ProxyFlag__UsernameAssignment_3_0 )
            // InternalCurlBetterThanHttpie.g:3246:3: rule__ProxyFlag__UsernameAssignment_3_0
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
    // InternalCurlBetterThanHttpie.g:3254:1: rule__ProxyFlag__Group_3__1 : rule__ProxyFlag__Group_3__1__Impl rule__ProxyFlag__Group_3__2 ;
    public final void rule__ProxyFlag__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3258:1: ( rule__ProxyFlag__Group_3__1__Impl rule__ProxyFlag__Group_3__2 )
            // InternalCurlBetterThanHttpie.g:3259:2: rule__ProxyFlag__Group_3__1__Impl rule__ProxyFlag__Group_3__2
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
    // InternalCurlBetterThanHttpie.g:3266:1: rule__ProxyFlag__Group_3__1__Impl : ( ':' ) ;
    public final void rule__ProxyFlag__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3270:1: ( ( ':' ) )
            // InternalCurlBetterThanHttpie.g:3271:1: ( ':' )
            {
            // InternalCurlBetterThanHttpie.g:3271:1: ( ':' )
            // InternalCurlBetterThanHttpie.g:3272:2: ':'
            {
             before(grammarAccess.getProxyFlagAccess().getColonKeyword_3_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalCurlBetterThanHttpie.g:3281:1: rule__ProxyFlag__Group_3__2 : rule__ProxyFlag__Group_3__2__Impl rule__ProxyFlag__Group_3__3 ;
    public final void rule__ProxyFlag__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3285:1: ( rule__ProxyFlag__Group_3__2__Impl rule__ProxyFlag__Group_3__3 )
            // InternalCurlBetterThanHttpie.g:3286:2: rule__ProxyFlag__Group_3__2__Impl rule__ProxyFlag__Group_3__3
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
    // InternalCurlBetterThanHttpie.g:3293:1: rule__ProxyFlag__Group_3__2__Impl : ( ( rule__ProxyFlag__PasswordAssignment_3_2 ) ) ;
    public final void rule__ProxyFlag__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3297:1: ( ( ( rule__ProxyFlag__PasswordAssignment_3_2 ) ) )
            // InternalCurlBetterThanHttpie.g:3298:1: ( ( rule__ProxyFlag__PasswordAssignment_3_2 ) )
            {
            // InternalCurlBetterThanHttpie.g:3298:1: ( ( rule__ProxyFlag__PasswordAssignment_3_2 ) )
            // InternalCurlBetterThanHttpie.g:3299:2: ( rule__ProxyFlag__PasswordAssignment_3_2 )
            {
             before(grammarAccess.getProxyFlagAccess().getPasswordAssignment_3_2()); 
            // InternalCurlBetterThanHttpie.g:3300:2: ( rule__ProxyFlag__PasswordAssignment_3_2 )
            // InternalCurlBetterThanHttpie.g:3300:3: rule__ProxyFlag__PasswordAssignment_3_2
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
    // InternalCurlBetterThanHttpie.g:3308:1: rule__ProxyFlag__Group_3__3 : rule__ProxyFlag__Group_3__3__Impl ;
    public final void rule__ProxyFlag__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3312:1: ( rule__ProxyFlag__Group_3__3__Impl )
            // InternalCurlBetterThanHttpie.g:3313:2: rule__ProxyFlag__Group_3__3__Impl
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
    // InternalCurlBetterThanHttpie.g:3319:1: rule__ProxyFlag__Group_3__3__Impl : ( '@' ) ;
    public final void rule__ProxyFlag__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3323:1: ( ( '@' ) )
            // InternalCurlBetterThanHttpie.g:3324:1: ( '@' )
            {
            // InternalCurlBetterThanHttpie.g:3324:1: ( '@' )
            // InternalCurlBetterThanHttpie.g:3325:2: '@'
            {
             before(grammarAccess.getProxyFlagAccess().getCommercialAtKeyword_3_3()); 
            match(input,40,FOLLOW_2); 
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
    // InternalCurlBetterThanHttpie.g:3335:1: rule__ProxyFlag__Group_4_0__0 : rule__ProxyFlag__Group_4_0__0__Impl rule__ProxyFlag__Group_4_0__1 ;
    public final void rule__ProxyFlag__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3339:1: ( rule__ProxyFlag__Group_4_0__0__Impl rule__ProxyFlag__Group_4_0__1 )
            // InternalCurlBetterThanHttpie.g:3340:2: rule__ProxyFlag__Group_4_0__0__Impl rule__ProxyFlag__Group_4_0__1
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
    // InternalCurlBetterThanHttpie.g:3347:1: rule__ProxyFlag__Group_4_0__0__Impl : ( ( rule__ProxyFlag__HostnameAssignment_4_0_0 ) ) ;
    public final void rule__ProxyFlag__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3351:1: ( ( ( rule__ProxyFlag__HostnameAssignment_4_0_0 ) ) )
            // InternalCurlBetterThanHttpie.g:3352:1: ( ( rule__ProxyFlag__HostnameAssignment_4_0_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:3352:1: ( ( rule__ProxyFlag__HostnameAssignment_4_0_0 ) )
            // InternalCurlBetterThanHttpie.g:3353:2: ( rule__ProxyFlag__HostnameAssignment_4_0_0 )
            {
             before(grammarAccess.getProxyFlagAccess().getHostnameAssignment_4_0_0()); 
            // InternalCurlBetterThanHttpie.g:3354:2: ( rule__ProxyFlag__HostnameAssignment_4_0_0 )
            // InternalCurlBetterThanHttpie.g:3354:3: rule__ProxyFlag__HostnameAssignment_4_0_0
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
    // InternalCurlBetterThanHttpie.g:3362:1: rule__ProxyFlag__Group_4_0__1 : rule__ProxyFlag__Group_4_0__1__Impl ;
    public final void rule__ProxyFlag__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3366:1: ( rule__ProxyFlag__Group_4_0__1__Impl )
            // InternalCurlBetterThanHttpie.g:3367:2: rule__ProxyFlag__Group_4_0__1__Impl
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
    // InternalCurlBetterThanHttpie.g:3373:1: rule__ProxyFlag__Group_4_0__1__Impl : ( ( rule__ProxyFlag__Group_4_0_1__0 )? ) ;
    public final void rule__ProxyFlag__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3377:1: ( ( ( rule__ProxyFlag__Group_4_0_1__0 )? ) )
            // InternalCurlBetterThanHttpie.g:3378:1: ( ( rule__ProxyFlag__Group_4_0_1__0 )? )
            {
            // InternalCurlBetterThanHttpie.g:3378:1: ( ( rule__ProxyFlag__Group_4_0_1__0 )? )
            // InternalCurlBetterThanHttpie.g:3379:2: ( rule__ProxyFlag__Group_4_0_1__0 )?
            {
             before(grammarAccess.getProxyFlagAccess().getGroup_4_0_1()); 
            // InternalCurlBetterThanHttpie.g:3380:2: ( rule__ProxyFlag__Group_4_0_1__0 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==25) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:3380:3: rule__ProxyFlag__Group_4_0_1__0
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
    // InternalCurlBetterThanHttpie.g:3389:1: rule__ProxyFlag__Group_4_0_1__0 : rule__ProxyFlag__Group_4_0_1__0__Impl rule__ProxyFlag__Group_4_0_1__1 ;
    public final void rule__ProxyFlag__Group_4_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3393:1: ( rule__ProxyFlag__Group_4_0_1__0__Impl rule__ProxyFlag__Group_4_0_1__1 )
            // InternalCurlBetterThanHttpie.g:3394:2: rule__ProxyFlag__Group_4_0_1__0__Impl rule__ProxyFlag__Group_4_0_1__1
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
    // InternalCurlBetterThanHttpie.g:3401:1: rule__ProxyFlag__Group_4_0_1__0__Impl : ( ':' ) ;
    public final void rule__ProxyFlag__Group_4_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3405:1: ( ( ':' ) )
            // InternalCurlBetterThanHttpie.g:3406:1: ( ':' )
            {
            // InternalCurlBetterThanHttpie.g:3406:1: ( ':' )
            // InternalCurlBetterThanHttpie.g:3407:2: ':'
            {
             before(grammarAccess.getProxyFlagAccess().getColonKeyword_4_0_1_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalCurlBetterThanHttpie.g:3416:1: rule__ProxyFlag__Group_4_0_1__1 : rule__ProxyFlag__Group_4_0_1__1__Impl ;
    public final void rule__ProxyFlag__Group_4_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3420:1: ( rule__ProxyFlag__Group_4_0_1__1__Impl )
            // InternalCurlBetterThanHttpie.g:3421:2: rule__ProxyFlag__Group_4_0_1__1__Impl
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
    // InternalCurlBetterThanHttpie.g:3427:1: rule__ProxyFlag__Group_4_0_1__1__Impl : ( ( rule__ProxyFlag__PortAssignment_4_0_1_1 ) ) ;
    public final void rule__ProxyFlag__Group_4_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3431:1: ( ( ( rule__ProxyFlag__PortAssignment_4_0_1_1 ) ) )
            // InternalCurlBetterThanHttpie.g:3432:1: ( ( rule__ProxyFlag__PortAssignment_4_0_1_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:3432:1: ( ( rule__ProxyFlag__PortAssignment_4_0_1_1 ) )
            // InternalCurlBetterThanHttpie.g:3433:2: ( rule__ProxyFlag__PortAssignment_4_0_1_1 )
            {
             before(grammarAccess.getProxyFlagAccess().getPortAssignment_4_0_1_1()); 
            // InternalCurlBetterThanHttpie.g:3434:2: ( rule__ProxyFlag__PortAssignment_4_0_1_1 )
            // InternalCurlBetterThanHttpie.g:3434:3: rule__ProxyFlag__PortAssignment_4_0_1_1
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
    // InternalCurlBetterThanHttpie.g:3443:1: rule__ProxyFlag__Group_4_1__0 : rule__ProxyFlag__Group_4_1__0__Impl rule__ProxyFlag__Group_4_1__1 ;
    public final void rule__ProxyFlag__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3447:1: ( rule__ProxyFlag__Group_4_1__0__Impl rule__ProxyFlag__Group_4_1__1 )
            // InternalCurlBetterThanHttpie.g:3448:2: rule__ProxyFlag__Group_4_1__0__Impl rule__ProxyFlag__Group_4_1__1
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
    // InternalCurlBetterThanHttpie.g:3455:1: rule__ProxyFlag__Group_4_1__0__Impl : ( ':' ) ;
    public final void rule__ProxyFlag__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3459:1: ( ( ':' ) )
            // InternalCurlBetterThanHttpie.g:3460:1: ( ':' )
            {
            // InternalCurlBetterThanHttpie.g:3460:1: ( ':' )
            // InternalCurlBetterThanHttpie.g:3461:2: ':'
            {
             before(grammarAccess.getProxyFlagAccess().getColonKeyword_4_1_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalCurlBetterThanHttpie.g:3470:1: rule__ProxyFlag__Group_4_1__1 : rule__ProxyFlag__Group_4_1__1__Impl ;
    public final void rule__ProxyFlag__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3474:1: ( rule__ProxyFlag__Group_4_1__1__Impl )
            // InternalCurlBetterThanHttpie.g:3475:2: rule__ProxyFlag__Group_4_1__1__Impl
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
    // InternalCurlBetterThanHttpie.g:3481:1: rule__ProxyFlag__Group_4_1__1__Impl : ( ( rule__ProxyFlag__PortAssignment_4_1_1 )? ) ;
    public final void rule__ProxyFlag__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3485:1: ( ( ( rule__ProxyFlag__PortAssignment_4_1_1 )? ) )
            // InternalCurlBetterThanHttpie.g:3486:1: ( ( rule__ProxyFlag__PortAssignment_4_1_1 )? )
            {
            // InternalCurlBetterThanHttpie.g:3486:1: ( ( rule__ProxyFlag__PortAssignment_4_1_1 )? )
            // InternalCurlBetterThanHttpie.g:3487:2: ( rule__ProxyFlag__PortAssignment_4_1_1 )?
            {
             before(grammarAccess.getProxyFlagAccess().getPortAssignment_4_1_1()); 
            // InternalCurlBetterThanHttpie.g:3488:2: ( rule__ProxyFlag__PortAssignment_4_1_1 )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_INT) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:3488:3: rule__ProxyFlag__PortAssignment_4_1_1
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
    // InternalCurlBetterThanHttpie.g:3497:1: rule__AuthFlag__Group__0 : rule__AuthFlag__Group__0__Impl rule__AuthFlag__Group__1 ;
    public final void rule__AuthFlag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3501:1: ( rule__AuthFlag__Group__0__Impl rule__AuthFlag__Group__1 )
            // InternalCurlBetterThanHttpie.g:3502:2: rule__AuthFlag__Group__0__Impl rule__AuthFlag__Group__1
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
    // InternalCurlBetterThanHttpie.g:3509:1: rule__AuthFlag__Group__0__Impl : ( ( rule__AuthFlag__Alternatives_0 ) ) ;
    public final void rule__AuthFlag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3513:1: ( ( ( rule__AuthFlag__Alternatives_0 ) ) )
            // InternalCurlBetterThanHttpie.g:3514:1: ( ( rule__AuthFlag__Alternatives_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:3514:1: ( ( rule__AuthFlag__Alternatives_0 ) )
            // InternalCurlBetterThanHttpie.g:3515:2: ( rule__AuthFlag__Alternatives_0 )
            {
             before(grammarAccess.getAuthFlagAccess().getAlternatives_0()); 
            // InternalCurlBetterThanHttpie.g:3516:2: ( rule__AuthFlag__Alternatives_0 )
            // InternalCurlBetterThanHttpie.g:3516:3: rule__AuthFlag__Alternatives_0
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
    // InternalCurlBetterThanHttpie.g:3524:1: rule__AuthFlag__Group__1 : rule__AuthFlag__Group__1__Impl rule__AuthFlag__Group__2 ;
    public final void rule__AuthFlag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3528:1: ( rule__AuthFlag__Group__1__Impl rule__AuthFlag__Group__2 )
            // InternalCurlBetterThanHttpie.g:3529:2: rule__AuthFlag__Group__1__Impl rule__AuthFlag__Group__2
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
    // InternalCurlBetterThanHttpie.g:3536:1: rule__AuthFlag__Group__1__Impl : ( ( rule__AuthFlag__Alternatives_1 ) ) ;
    public final void rule__AuthFlag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3540:1: ( ( ( rule__AuthFlag__Alternatives_1 ) ) )
            // InternalCurlBetterThanHttpie.g:3541:1: ( ( rule__AuthFlag__Alternatives_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:3541:1: ( ( rule__AuthFlag__Alternatives_1 ) )
            // InternalCurlBetterThanHttpie.g:3542:2: ( rule__AuthFlag__Alternatives_1 )
            {
             before(grammarAccess.getAuthFlagAccess().getAlternatives_1()); 
            // InternalCurlBetterThanHttpie.g:3543:2: ( rule__AuthFlag__Alternatives_1 )
            // InternalCurlBetterThanHttpie.g:3543:3: rule__AuthFlag__Alternatives_1
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
    // InternalCurlBetterThanHttpie.g:3551:1: rule__AuthFlag__Group__2 : rule__AuthFlag__Group__2__Impl rule__AuthFlag__Group__3 ;
    public final void rule__AuthFlag__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3555:1: ( rule__AuthFlag__Group__2__Impl rule__AuthFlag__Group__3 )
            // InternalCurlBetterThanHttpie.g:3556:2: rule__AuthFlag__Group__2__Impl rule__AuthFlag__Group__3
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
    // InternalCurlBetterThanHttpie.g:3563:1: rule__AuthFlag__Group__2__Impl : ( ( rule__AuthFlag__UsernameAssignment_2 ) ) ;
    public final void rule__AuthFlag__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3567:1: ( ( ( rule__AuthFlag__UsernameAssignment_2 ) ) )
            // InternalCurlBetterThanHttpie.g:3568:1: ( ( rule__AuthFlag__UsernameAssignment_2 ) )
            {
            // InternalCurlBetterThanHttpie.g:3568:1: ( ( rule__AuthFlag__UsernameAssignment_2 ) )
            // InternalCurlBetterThanHttpie.g:3569:2: ( rule__AuthFlag__UsernameAssignment_2 )
            {
             before(grammarAccess.getAuthFlagAccess().getUsernameAssignment_2()); 
            // InternalCurlBetterThanHttpie.g:3570:2: ( rule__AuthFlag__UsernameAssignment_2 )
            // InternalCurlBetterThanHttpie.g:3570:3: rule__AuthFlag__UsernameAssignment_2
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
    // InternalCurlBetterThanHttpie.g:3578:1: rule__AuthFlag__Group__3 : rule__AuthFlag__Group__3__Impl rule__AuthFlag__Group__4 ;
    public final void rule__AuthFlag__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3582:1: ( rule__AuthFlag__Group__3__Impl rule__AuthFlag__Group__4 )
            // InternalCurlBetterThanHttpie.g:3583:2: rule__AuthFlag__Group__3__Impl rule__AuthFlag__Group__4
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
    // InternalCurlBetterThanHttpie.g:3590:1: rule__AuthFlag__Group__3__Impl : ( ( rule__AuthFlag__Group_3__0 )? ) ;
    public final void rule__AuthFlag__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3594:1: ( ( ( rule__AuthFlag__Group_3__0 )? ) )
            // InternalCurlBetterThanHttpie.g:3595:1: ( ( rule__AuthFlag__Group_3__0 )? )
            {
            // InternalCurlBetterThanHttpie.g:3595:1: ( ( rule__AuthFlag__Group_3__0 )? )
            // InternalCurlBetterThanHttpie.g:3596:2: ( rule__AuthFlag__Group_3__0 )?
            {
             before(grammarAccess.getAuthFlagAccess().getGroup_3()); 
            // InternalCurlBetterThanHttpie.g:3597:2: ( rule__AuthFlag__Group_3__0 )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==25) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:3597:3: rule__AuthFlag__Group_3__0
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
    // InternalCurlBetterThanHttpie.g:3605:1: rule__AuthFlag__Group__4 : rule__AuthFlag__Group__4__Impl ;
    public final void rule__AuthFlag__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3609:1: ( rule__AuthFlag__Group__4__Impl )
            // InternalCurlBetterThanHttpie.g:3610:2: rule__AuthFlag__Group__4__Impl
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
    // InternalCurlBetterThanHttpie.g:3616:1: rule__AuthFlag__Group__4__Impl : ( ( rule__AuthFlag__Group_4__0 )? ) ;
    public final void rule__AuthFlag__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3620:1: ( ( ( rule__AuthFlag__Group_4__0 )? ) )
            // InternalCurlBetterThanHttpie.g:3621:1: ( ( rule__AuthFlag__Group_4__0 )? )
            {
            // InternalCurlBetterThanHttpie.g:3621:1: ( ( rule__AuthFlag__Group_4__0 )? )
            // InternalCurlBetterThanHttpie.g:3622:2: ( rule__AuthFlag__Group_4__0 )?
            {
             before(grammarAccess.getAuthFlagAccess().getGroup_4()); 
            // InternalCurlBetterThanHttpie.g:3623:2: ( rule__AuthFlag__Group_4__0 )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==40) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:3623:3: rule__AuthFlag__Group_4__0
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
    // InternalCurlBetterThanHttpie.g:3632:1: rule__AuthFlag__Group_3__0 : rule__AuthFlag__Group_3__0__Impl rule__AuthFlag__Group_3__1 ;
    public final void rule__AuthFlag__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3636:1: ( rule__AuthFlag__Group_3__0__Impl rule__AuthFlag__Group_3__1 )
            // InternalCurlBetterThanHttpie.g:3637:2: rule__AuthFlag__Group_3__0__Impl rule__AuthFlag__Group_3__1
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
    // InternalCurlBetterThanHttpie.g:3644:1: rule__AuthFlag__Group_3__0__Impl : ( ':' ) ;
    public final void rule__AuthFlag__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3648:1: ( ( ':' ) )
            // InternalCurlBetterThanHttpie.g:3649:1: ( ':' )
            {
            // InternalCurlBetterThanHttpie.g:3649:1: ( ':' )
            // InternalCurlBetterThanHttpie.g:3650:2: ':'
            {
             before(grammarAccess.getAuthFlagAccess().getColonKeyword_3_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalCurlBetterThanHttpie.g:3659:1: rule__AuthFlag__Group_3__1 : rule__AuthFlag__Group_3__1__Impl ;
    public final void rule__AuthFlag__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3663:1: ( rule__AuthFlag__Group_3__1__Impl )
            // InternalCurlBetterThanHttpie.g:3664:2: rule__AuthFlag__Group_3__1__Impl
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
    // InternalCurlBetterThanHttpie.g:3670:1: rule__AuthFlag__Group_3__1__Impl : ( ( rule__AuthFlag__PasswordAssignment_3_1 ) ) ;
    public final void rule__AuthFlag__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3674:1: ( ( ( rule__AuthFlag__PasswordAssignment_3_1 ) ) )
            // InternalCurlBetterThanHttpie.g:3675:1: ( ( rule__AuthFlag__PasswordAssignment_3_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:3675:1: ( ( rule__AuthFlag__PasswordAssignment_3_1 ) )
            // InternalCurlBetterThanHttpie.g:3676:2: ( rule__AuthFlag__PasswordAssignment_3_1 )
            {
             before(grammarAccess.getAuthFlagAccess().getPasswordAssignment_3_1()); 
            // InternalCurlBetterThanHttpie.g:3677:2: ( rule__AuthFlag__PasswordAssignment_3_1 )
            // InternalCurlBetterThanHttpie.g:3677:3: rule__AuthFlag__PasswordAssignment_3_1
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
    // InternalCurlBetterThanHttpie.g:3686:1: rule__AuthFlag__Group_4__0 : rule__AuthFlag__Group_4__0__Impl rule__AuthFlag__Group_4__1 ;
    public final void rule__AuthFlag__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3690:1: ( rule__AuthFlag__Group_4__0__Impl rule__AuthFlag__Group_4__1 )
            // InternalCurlBetterThanHttpie.g:3691:2: rule__AuthFlag__Group_4__0__Impl rule__AuthFlag__Group_4__1
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
    // InternalCurlBetterThanHttpie.g:3698:1: rule__AuthFlag__Group_4__0__Impl : ( '@' ) ;
    public final void rule__AuthFlag__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3702:1: ( ( '@' ) )
            // InternalCurlBetterThanHttpie.g:3703:1: ( '@' )
            {
            // InternalCurlBetterThanHttpie.g:3703:1: ( '@' )
            // InternalCurlBetterThanHttpie.g:3704:2: '@'
            {
             before(grammarAccess.getAuthFlagAccess().getCommercialAtKeyword_4_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalCurlBetterThanHttpie.g:3713:1: rule__AuthFlag__Group_4__1 : rule__AuthFlag__Group_4__1__Impl ;
    public final void rule__AuthFlag__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3717:1: ( rule__AuthFlag__Group_4__1__Impl )
            // InternalCurlBetterThanHttpie.g:3718:2: rule__AuthFlag__Group_4__1__Impl
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
    // InternalCurlBetterThanHttpie.g:3724:1: rule__AuthFlag__Group_4__1__Impl : ( ( rule__AuthFlag__Alternatives_4_1 ) ) ;
    public final void rule__AuthFlag__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3728:1: ( ( ( rule__AuthFlag__Alternatives_4_1 ) ) )
            // InternalCurlBetterThanHttpie.g:3729:1: ( ( rule__AuthFlag__Alternatives_4_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:3729:1: ( ( rule__AuthFlag__Alternatives_4_1 ) )
            // InternalCurlBetterThanHttpie.g:3730:2: ( rule__AuthFlag__Alternatives_4_1 )
            {
             before(grammarAccess.getAuthFlagAccess().getAlternatives_4_1()); 
            // InternalCurlBetterThanHttpie.g:3731:2: ( rule__AuthFlag__Alternatives_4_1 )
            // InternalCurlBetterThanHttpie.g:3731:3: rule__AuthFlag__Alternatives_4_1
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
    // InternalCurlBetterThanHttpie.g:3740:1: rule__DownloadFlag__Group__0 : rule__DownloadFlag__Group__0__Impl rule__DownloadFlag__Group__1 ;
    public final void rule__DownloadFlag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3744:1: ( rule__DownloadFlag__Group__0__Impl rule__DownloadFlag__Group__1 )
            // InternalCurlBetterThanHttpie.g:3745:2: rule__DownloadFlag__Group__0__Impl rule__DownloadFlag__Group__1
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
    // InternalCurlBetterThanHttpie.g:3752:1: rule__DownloadFlag__Group__0__Impl : ( () ) ;
    public final void rule__DownloadFlag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3756:1: ( ( () ) )
            // InternalCurlBetterThanHttpie.g:3757:1: ( () )
            {
            // InternalCurlBetterThanHttpie.g:3757:1: ( () )
            // InternalCurlBetterThanHttpie.g:3758:2: ()
            {
             before(grammarAccess.getDownloadFlagAccess().getDownloadFlagAction_0()); 
            // InternalCurlBetterThanHttpie.g:3759:2: ()
            // InternalCurlBetterThanHttpie.g:3759:3: 
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
    // InternalCurlBetterThanHttpie.g:3767:1: rule__DownloadFlag__Group__1 : rule__DownloadFlag__Group__1__Impl ;
    public final void rule__DownloadFlag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3771:1: ( rule__DownloadFlag__Group__1__Impl )
            // InternalCurlBetterThanHttpie.g:3772:2: rule__DownloadFlag__Group__1__Impl
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
    // InternalCurlBetterThanHttpie.g:3778:1: rule__DownloadFlag__Group__1__Impl : ( ( rule__DownloadFlag__Alternatives_1 ) ) ;
    public final void rule__DownloadFlag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3782:1: ( ( ( rule__DownloadFlag__Alternatives_1 ) ) )
            // InternalCurlBetterThanHttpie.g:3783:1: ( ( rule__DownloadFlag__Alternatives_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:3783:1: ( ( rule__DownloadFlag__Alternatives_1 ) )
            // InternalCurlBetterThanHttpie.g:3784:2: ( rule__DownloadFlag__Alternatives_1 )
            {
             before(grammarAccess.getDownloadFlagAccess().getAlternatives_1()); 
            // InternalCurlBetterThanHttpie.g:3785:2: ( rule__DownloadFlag__Alternatives_1 )
            // InternalCurlBetterThanHttpie.g:3785:3: rule__DownloadFlag__Alternatives_1
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
    // InternalCurlBetterThanHttpie.g:3794:1: rule__HelpFlag__Group__0 : rule__HelpFlag__Group__0__Impl rule__HelpFlag__Group__1 ;
    public final void rule__HelpFlag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3798:1: ( rule__HelpFlag__Group__0__Impl rule__HelpFlag__Group__1 )
            // InternalCurlBetterThanHttpie.g:3799:2: rule__HelpFlag__Group__0__Impl rule__HelpFlag__Group__1
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
    // InternalCurlBetterThanHttpie.g:3806:1: rule__HelpFlag__Group__0__Impl : ( () ) ;
    public final void rule__HelpFlag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3810:1: ( ( () ) )
            // InternalCurlBetterThanHttpie.g:3811:1: ( () )
            {
            // InternalCurlBetterThanHttpie.g:3811:1: ( () )
            // InternalCurlBetterThanHttpie.g:3812:2: ()
            {
             before(grammarAccess.getHelpFlagAccess().getHelpFlagAction_0()); 
            // InternalCurlBetterThanHttpie.g:3813:2: ()
            // InternalCurlBetterThanHttpie.g:3813:3: 
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
    // InternalCurlBetterThanHttpie.g:3821:1: rule__HelpFlag__Group__1 : rule__HelpFlag__Group__1__Impl ;
    public final void rule__HelpFlag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3825:1: ( rule__HelpFlag__Group__1__Impl )
            // InternalCurlBetterThanHttpie.g:3826:2: rule__HelpFlag__Group__1__Impl
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
    // InternalCurlBetterThanHttpie.g:3832:1: rule__HelpFlag__Group__1__Impl : ( ( rule__HelpFlag__Alternatives_1 ) ) ;
    public final void rule__HelpFlag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3836:1: ( ( ( rule__HelpFlag__Alternatives_1 ) ) )
            // InternalCurlBetterThanHttpie.g:3837:1: ( ( rule__HelpFlag__Alternatives_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:3837:1: ( ( rule__HelpFlag__Alternatives_1 ) )
            // InternalCurlBetterThanHttpie.g:3838:2: ( rule__HelpFlag__Alternatives_1 )
            {
             before(grammarAccess.getHelpFlagAccess().getAlternatives_1()); 
            // InternalCurlBetterThanHttpie.g:3839:2: ( rule__HelpFlag__Alternatives_1 )
            // InternalCurlBetterThanHttpie.g:3839:3: rule__HelpFlag__Alternatives_1
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
    // InternalCurlBetterThanHttpie.g:3848:1: rule__VersionFlag__Group__0 : rule__VersionFlag__Group__0__Impl rule__VersionFlag__Group__1 ;
    public final void rule__VersionFlag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3852:1: ( rule__VersionFlag__Group__0__Impl rule__VersionFlag__Group__1 )
            // InternalCurlBetterThanHttpie.g:3853:2: rule__VersionFlag__Group__0__Impl rule__VersionFlag__Group__1
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
    // InternalCurlBetterThanHttpie.g:3860:1: rule__VersionFlag__Group__0__Impl : ( () ) ;
    public final void rule__VersionFlag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3864:1: ( ( () ) )
            // InternalCurlBetterThanHttpie.g:3865:1: ( () )
            {
            // InternalCurlBetterThanHttpie.g:3865:1: ( () )
            // InternalCurlBetterThanHttpie.g:3866:2: ()
            {
             before(grammarAccess.getVersionFlagAccess().getVersionFlagAction_0()); 
            // InternalCurlBetterThanHttpie.g:3867:2: ()
            // InternalCurlBetterThanHttpie.g:3867:3: 
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
    // InternalCurlBetterThanHttpie.g:3875:1: rule__VersionFlag__Group__1 : rule__VersionFlag__Group__1__Impl ;
    public final void rule__VersionFlag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3879:1: ( rule__VersionFlag__Group__1__Impl )
            // InternalCurlBetterThanHttpie.g:3880:2: rule__VersionFlag__Group__1__Impl
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
    // InternalCurlBetterThanHttpie.g:3886:1: rule__VersionFlag__Group__1__Impl : ( '--version' ) ;
    public final void rule__VersionFlag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3890:1: ( ( '--version' ) )
            // InternalCurlBetterThanHttpie.g:3891:1: ( '--version' )
            {
            // InternalCurlBetterThanHttpie.g:3891:1: ( '--version' )
            // InternalCurlBetterThanHttpie.g:3892:2: '--version'
            {
             before(grammarAccess.getVersionFlagAccess().getVersionKeyword_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalCurlBetterThanHttpie.g:3902:1: rule__VerboseFlag__Group__0 : rule__VerboseFlag__Group__0__Impl rule__VerboseFlag__Group__1 ;
    public final void rule__VerboseFlag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3906:1: ( rule__VerboseFlag__Group__0__Impl rule__VerboseFlag__Group__1 )
            // InternalCurlBetterThanHttpie.g:3907:2: rule__VerboseFlag__Group__0__Impl rule__VerboseFlag__Group__1
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
    // InternalCurlBetterThanHttpie.g:3914:1: rule__VerboseFlag__Group__0__Impl : ( () ) ;
    public final void rule__VerboseFlag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3918:1: ( ( () ) )
            // InternalCurlBetterThanHttpie.g:3919:1: ( () )
            {
            // InternalCurlBetterThanHttpie.g:3919:1: ( () )
            // InternalCurlBetterThanHttpie.g:3920:2: ()
            {
             before(grammarAccess.getVerboseFlagAccess().getVerboseFlagAction_0()); 
            // InternalCurlBetterThanHttpie.g:3921:2: ()
            // InternalCurlBetterThanHttpie.g:3921:3: 
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
    // InternalCurlBetterThanHttpie.g:3929:1: rule__VerboseFlag__Group__1 : rule__VerboseFlag__Group__1__Impl ;
    public final void rule__VerboseFlag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3933:1: ( rule__VerboseFlag__Group__1__Impl )
            // InternalCurlBetterThanHttpie.g:3934:2: rule__VerboseFlag__Group__1__Impl
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
    // InternalCurlBetterThanHttpie.g:3940:1: rule__VerboseFlag__Group__1__Impl : ( ( rule__VerboseFlag__Alternatives_1 ) ) ;
    public final void rule__VerboseFlag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3944:1: ( ( ( rule__VerboseFlag__Alternatives_1 ) ) )
            // InternalCurlBetterThanHttpie.g:3945:1: ( ( rule__VerboseFlag__Alternatives_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:3945:1: ( ( rule__VerboseFlag__Alternatives_1 ) )
            // InternalCurlBetterThanHttpie.g:3946:2: ( rule__VerboseFlag__Alternatives_1 )
            {
             before(grammarAccess.getVerboseFlagAccess().getAlternatives_1()); 
            // InternalCurlBetterThanHttpie.g:3947:2: ( rule__VerboseFlag__Alternatives_1 )
            // InternalCurlBetterThanHttpie.g:3947:3: rule__VerboseFlag__Alternatives_1
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
    // InternalCurlBetterThanHttpie.g:3956:1: rule__TimeoutFlag__Group__0 : rule__TimeoutFlag__Group__0__Impl rule__TimeoutFlag__Group__1 ;
    public final void rule__TimeoutFlag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3960:1: ( rule__TimeoutFlag__Group__0__Impl rule__TimeoutFlag__Group__1 )
            // InternalCurlBetterThanHttpie.g:3961:2: rule__TimeoutFlag__Group__0__Impl rule__TimeoutFlag__Group__1
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
    // InternalCurlBetterThanHttpie.g:3968:1: rule__TimeoutFlag__Group__0__Impl : ( '--timeout' ) ;
    public final void rule__TimeoutFlag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3972:1: ( ( '--timeout' ) )
            // InternalCurlBetterThanHttpie.g:3973:1: ( '--timeout' )
            {
            // InternalCurlBetterThanHttpie.g:3973:1: ( '--timeout' )
            // InternalCurlBetterThanHttpie.g:3974:2: '--timeout'
            {
             before(grammarAccess.getTimeoutFlagAccess().getTimeoutKeyword_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalCurlBetterThanHttpie.g:3983:1: rule__TimeoutFlag__Group__1 : rule__TimeoutFlag__Group__1__Impl rule__TimeoutFlag__Group__2 ;
    public final void rule__TimeoutFlag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3987:1: ( rule__TimeoutFlag__Group__1__Impl rule__TimeoutFlag__Group__2 )
            // InternalCurlBetterThanHttpie.g:3988:2: rule__TimeoutFlag__Group__1__Impl rule__TimeoutFlag__Group__2
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
    // InternalCurlBetterThanHttpie.g:3995:1: rule__TimeoutFlag__Group__1__Impl : ( ( rule__TimeoutFlag__Alternatives_1 ) ) ;
    public final void rule__TimeoutFlag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3999:1: ( ( ( rule__TimeoutFlag__Alternatives_1 ) ) )
            // InternalCurlBetterThanHttpie.g:4000:1: ( ( rule__TimeoutFlag__Alternatives_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:4000:1: ( ( rule__TimeoutFlag__Alternatives_1 ) )
            // InternalCurlBetterThanHttpie.g:4001:2: ( rule__TimeoutFlag__Alternatives_1 )
            {
             before(grammarAccess.getTimeoutFlagAccess().getAlternatives_1()); 
            // InternalCurlBetterThanHttpie.g:4002:2: ( rule__TimeoutFlag__Alternatives_1 )
            // InternalCurlBetterThanHttpie.g:4002:3: rule__TimeoutFlag__Alternatives_1
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
    // InternalCurlBetterThanHttpie.g:4010:1: rule__TimeoutFlag__Group__2 : rule__TimeoutFlag__Group__2__Impl ;
    public final void rule__TimeoutFlag__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4014:1: ( rule__TimeoutFlag__Group__2__Impl )
            // InternalCurlBetterThanHttpie.g:4015:2: rule__TimeoutFlag__Group__2__Impl
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
    // InternalCurlBetterThanHttpie.g:4021:1: rule__TimeoutFlag__Group__2__Impl : ( ( rule__TimeoutFlag__TimeoutAssignment_2 ) ) ;
    public final void rule__TimeoutFlag__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4025:1: ( ( ( rule__TimeoutFlag__TimeoutAssignment_2 ) ) )
            // InternalCurlBetterThanHttpie.g:4026:1: ( ( rule__TimeoutFlag__TimeoutAssignment_2 ) )
            {
            // InternalCurlBetterThanHttpie.g:4026:1: ( ( rule__TimeoutFlag__TimeoutAssignment_2 ) )
            // InternalCurlBetterThanHttpie.g:4027:2: ( rule__TimeoutFlag__TimeoutAssignment_2 )
            {
             before(grammarAccess.getTimeoutFlagAccess().getTimeoutAssignment_2()); 
            // InternalCurlBetterThanHttpie.g:4028:2: ( rule__TimeoutFlag__TimeoutAssignment_2 )
            // InternalCurlBetterThanHttpie.g:4028:3: rule__TimeoutFlag__TimeoutAssignment_2
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
    // InternalCurlBetterThanHttpie.g:4037:1: rule__HttpHeaderItem__Group__0 : rule__HttpHeaderItem__Group__0__Impl rule__HttpHeaderItem__Group__1 ;
    public final void rule__HttpHeaderItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4041:1: ( rule__HttpHeaderItem__Group__0__Impl rule__HttpHeaderItem__Group__1 )
            // InternalCurlBetterThanHttpie.g:4042:2: rule__HttpHeaderItem__Group__0__Impl rule__HttpHeaderItem__Group__1
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
    // InternalCurlBetterThanHttpie.g:4049:1: rule__HttpHeaderItem__Group__0__Impl : ( ( rule__HttpHeaderItem__FieldAssignment_0 ) ) ;
    public final void rule__HttpHeaderItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4053:1: ( ( ( rule__HttpHeaderItem__FieldAssignment_0 ) ) )
            // InternalCurlBetterThanHttpie.g:4054:1: ( ( rule__HttpHeaderItem__FieldAssignment_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:4054:1: ( ( rule__HttpHeaderItem__FieldAssignment_0 ) )
            // InternalCurlBetterThanHttpie.g:4055:2: ( rule__HttpHeaderItem__FieldAssignment_0 )
            {
             before(grammarAccess.getHttpHeaderItemAccess().getFieldAssignment_0()); 
            // InternalCurlBetterThanHttpie.g:4056:2: ( rule__HttpHeaderItem__FieldAssignment_0 )
            // InternalCurlBetterThanHttpie.g:4056:3: rule__HttpHeaderItem__FieldAssignment_0
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
    // InternalCurlBetterThanHttpie.g:4064:1: rule__HttpHeaderItem__Group__1 : rule__HttpHeaderItem__Group__1__Impl rule__HttpHeaderItem__Group__2 ;
    public final void rule__HttpHeaderItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4068:1: ( rule__HttpHeaderItem__Group__1__Impl rule__HttpHeaderItem__Group__2 )
            // InternalCurlBetterThanHttpie.g:4069:2: rule__HttpHeaderItem__Group__1__Impl rule__HttpHeaderItem__Group__2
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
    // InternalCurlBetterThanHttpie.g:4076:1: rule__HttpHeaderItem__Group__1__Impl : ( ':' ) ;
    public final void rule__HttpHeaderItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4080:1: ( ( ':' ) )
            // InternalCurlBetterThanHttpie.g:4081:1: ( ':' )
            {
            // InternalCurlBetterThanHttpie.g:4081:1: ( ':' )
            // InternalCurlBetterThanHttpie.g:4082:2: ':'
            {
             before(grammarAccess.getHttpHeaderItemAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalCurlBetterThanHttpie.g:4091:1: rule__HttpHeaderItem__Group__2 : rule__HttpHeaderItem__Group__2__Impl ;
    public final void rule__HttpHeaderItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4095:1: ( rule__HttpHeaderItem__Group__2__Impl )
            // InternalCurlBetterThanHttpie.g:4096:2: rule__HttpHeaderItem__Group__2__Impl
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
    // InternalCurlBetterThanHttpie.g:4102:1: rule__HttpHeaderItem__Group__2__Impl : ( ( rule__HttpHeaderItem__ValueAssignment_2 ) ) ;
    public final void rule__HttpHeaderItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4106:1: ( ( ( rule__HttpHeaderItem__ValueAssignment_2 ) ) )
            // InternalCurlBetterThanHttpie.g:4107:1: ( ( rule__HttpHeaderItem__ValueAssignment_2 ) )
            {
            // InternalCurlBetterThanHttpie.g:4107:1: ( ( rule__HttpHeaderItem__ValueAssignment_2 ) )
            // InternalCurlBetterThanHttpie.g:4108:2: ( rule__HttpHeaderItem__ValueAssignment_2 )
            {
             before(grammarAccess.getHttpHeaderItemAccess().getValueAssignment_2()); 
            // InternalCurlBetterThanHttpie.g:4109:2: ( rule__HttpHeaderItem__ValueAssignment_2 )
            // InternalCurlBetterThanHttpie.g:4109:3: rule__HttpHeaderItem__ValueAssignment_2
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
    // InternalCurlBetterThanHttpie.g:4118:1: rule__FormFileFieldItem__Group__0 : rule__FormFileFieldItem__Group__0__Impl rule__FormFileFieldItem__Group__1 ;
    public final void rule__FormFileFieldItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4122:1: ( rule__FormFileFieldItem__Group__0__Impl rule__FormFileFieldItem__Group__1 )
            // InternalCurlBetterThanHttpie.g:4123:2: rule__FormFileFieldItem__Group__0__Impl rule__FormFileFieldItem__Group__1
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
    // InternalCurlBetterThanHttpie.g:4130:1: rule__FormFileFieldItem__Group__0__Impl : ( ( rule__FormFileFieldItem__FieldAssignment_0 ) ) ;
    public final void rule__FormFileFieldItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4134:1: ( ( ( rule__FormFileFieldItem__FieldAssignment_0 ) ) )
            // InternalCurlBetterThanHttpie.g:4135:1: ( ( rule__FormFileFieldItem__FieldAssignment_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:4135:1: ( ( rule__FormFileFieldItem__FieldAssignment_0 ) )
            // InternalCurlBetterThanHttpie.g:4136:2: ( rule__FormFileFieldItem__FieldAssignment_0 )
            {
             before(grammarAccess.getFormFileFieldItemAccess().getFieldAssignment_0()); 
            // InternalCurlBetterThanHttpie.g:4137:2: ( rule__FormFileFieldItem__FieldAssignment_0 )
            // InternalCurlBetterThanHttpie.g:4137:3: rule__FormFileFieldItem__FieldAssignment_0
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
    // InternalCurlBetterThanHttpie.g:4145:1: rule__FormFileFieldItem__Group__1 : rule__FormFileFieldItem__Group__1__Impl rule__FormFileFieldItem__Group__2 ;
    public final void rule__FormFileFieldItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4149:1: ( rule__FormFileFieldItem__Group__1__Impl rule__FormFileFieldItem__Group__2 )
            // InternalCurlBetterThanHttpie.g:4150:2: rule__FormFileFieldItem__Group__1__Impl rule__FormFileFieldItem__Group__2
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
    // InternalCurlBetterThanHttpie.g:4157:1: rule__FormFileFieldItem__Group__1__Impl : ( '@' ) ;
    public final void rule__FormFileFieldItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4161:1: ( ( '@' ) )
            // InternalCurlBetterThanHttpie.g:4162:1: ( '@' )
            {
            // InternalCurlBetterThanHttpie.g:4162:1: ( '@' )
            // InternalCurlBetterThanHttpie.g:4163:2: '@'
            {
             before(grammarAccess.getFormFileFieldItemAccess().getCommercialAtKeyword_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalCurlBetterThanHttpie.g:4172:1: rule__FormFileFieldItem__Group__2 : rule__FormFileFieldItem__Group__2__Impl ;
    public final void rule__FormFileFieldItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4176:1: ( rule__FormFileFieldItem__Group__2__Impl )
            // InternalCurlBetterThanHttpie.g:4177:2: rule__FormFileFieldItem__Group__2__Impl
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
    // InternalCurlBetterThanHttpie.g:4183:1: rule__FormFileFieldItem__Group__2__Impl : ( ( rule__FormFileFieldItem__ValueAssignment_2 ) ) ;
    public final void rule__FormFileFieldItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4187:1: ( ( ( rule__FormFileFieldItem__ValueAssignment_2 ) ) )
            // InternalCurlBetterThanHttpie.g:4188:1: ( ( rule__FormFileFieldItem__ValueAssignment_2 ) )
            {
            // InternalCurlBetterThanHttpie.g:4188:1: ( ( rule__FormFileFieldItem__ValueAssignment_2 ) )
            // InternalCurlBetterThanHttpie.g:4189:2: ( rule__FormFileFieldItem__ValueAssignment_2 )
            {
             before(grammarAccess.getFormFileFieldItemAccess().getValueAssignment_2()); 
            // InternalCurlBetterThanHttpie.g:4190:2: ( rule__FormFileFieldItem__ValueAssignment_2 )
            // InternalCurlBetterThanHttpie.g:4190:3: rule__FormFileFieldItem__ValueAssignment_2
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
    // InternalCurlBetterThanHttpie.g:4199:1: rule__DataFieldItem__Group__0 : rule__DataFieldItem__Group__0__Impl rule__DataFieldItem__Group__1 ;
    public final void rule__DataFieldItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4203:1: ( rule__DataFieldItem__Group__0__Impl rule__DataFieldItem__Group__1 )
            // InternalCurlBetterThanHttpie.g:4204:2: rule__DataFieldItem__Group__0__Impl rule__DataFieldItem__Group__1
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
    // InternalCurlBetterThanHttpie.g:4211:1: rule__DataFieldItem__Group__0__Impl : ( ( rule__DataFieldItem__FieldAssignment_0 ) ) ;
    public final void rule__DataFieldItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4215:1: ( ( ( rule__DataFieldItem__FieldAssignment_0 ) ) )
            // InternalCurlBetterThanHttpie.g:4216:1: ( ( rule__DataFieldItem__FieldAssignment_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:4216:1: ( ( rule__DataFieldItem__FieldAssignment_0 ) )
            // InternalCurlBetterThanHttpie.g:4217:2: ( rule__DataFieldItem__FieldAssignment_0 )
            {
             before(grammarAccess.getDataFieldItemAccess().getFieldAssignment_0()); 
            // InternalCurlBetterThanHttpie.g:4218:2: ( rule__DataFieldItem__FieldAssignment_0 )
            // InternalCurlBetterThanHttpie.g:4218:3: rule__DataFieldItem__FieldAssignment_0
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
    // InternalCurlBetterThanHttpie.g:4226:1: rule__DataFieldItem__Group__1 : rule__DataFieldItem__Group__1__Impl rule__DataFieldItem__Group__2 ;
    public final void rule__DataFieldItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4230:1: ( rule__DataFieldItem__Group__1__Impl rule__DataFieldItem__Group__2 )
            // InternalCurlBetterThanHttpie.g:4231:2: rule__DataFieldItem__Group__1__Impl rule__DataFieldItem__Group__2
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
    // InternalCurlBetterThanHttpie.g:4238:1: rule__DataFieldItem__Group__1__Impl : ( '=' ) ;
    public final void rule__DataFieldItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4242:1: ( ( '=' ) )
            // InternalCurlBetterThanHttpie.g:4243:1: ( '=' )
            {
            // InternalCurlBetterThanHttpie.g:4243:1: ( '=' )
            // InternalCurlBetterThanHttpie.g:4244:2: '='
            {
             before(grammarAccess.getDataFieldItemAccess().getEqualsSignKeyword_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalCurlBetterThanHttpie.g:4253:1: rule__DataFieldItem__Group__2 : rule__DataFieldItem__Group__2__Impl ;
    public final void rule__DataFieldItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4257:1: ( rule__DataFieldItem__Group__2__Impl )
            // InternalCurlBetterThanHttpie.g:4258:2: rule__DataFieldItem__Group__2__Impl
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
    // InternalCurlBetterThanHttpie.g:4264:1: rule__DataFieldItem__Group__2__Impl : ( ( rule__DataFieldItem__Alternatives_2 ) ) ;
    public final void rule__DataFieldItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4268:1: ( ( ( rule__DataFieldItem__Alternatives_2 ) ) )
            // InternalCurlBetterThanHttpie.g:4269:1: ( ( rule__DataFieldItem__Alternatives_2 ) )
            {
            // InternalCurlBetterThanHttpie.g:4269:1: ( ( rule__DataFieldItem__Alternatives_2 ) )
            // InternalCurlBetterThanHttpie.g:4270:2: ( rule__DataFieldItem__Alternatives_2 )
            {
             before(grammarAccess.getDataFieldItemAccess().getAlternatives_2()); 
            // InternalCurlBetterThanHttpie.g:4271:2: ( rule__DataFieldItem__Alternatives_2 )
            // InternalCurlBetterThanHttpie.g:4271:3: rule__DataFieldItem__Alternatives_2
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
    // InternalCurlBetterThanHttpie.g:4280:1: rule__DataFieldItem__Group_2_1__0 : rule__DataFieldItem__Group_2_1__0__Impl rule__DataFieldItem__Group_2_1__1 ;
    public final void rule__DataFieldItem__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4284:1: ( rule__DataFieldItem__Group_2_1__0__Impl rule__DataFieldItem__Group_2_1__1 )
            // InternalCurlBetterThanHttpie.g:4285:2: rule__DataFieldItem__Group_2_1__0__Impl rule__DataFieldItem__Group_2_1__1
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
    // InternalCurlBetterThanHttpie.g:4292:1: rule__DataFieldItem__Group_2_1__0__Impl : ( '@' ) ;
    public final void rule__DataFieldItem__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4296:1: ( ( '@' ) )
            // InternalCurlBetterThanHttpie.g:4297:1: ( '@' )
            {
            // InternalCurlBetterThanHttpie.g:4297:1: ( '@' )
            // InternalCurlBetterThanHttpie.g:4298:2: '@'
            {
             before(grammarAccess.getDataFieldItemAccess().getCommercialAtKeyword_2_1_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalCurlBetterThanHttpie.g:4307:1: rule__DataFieldItem__Group_2_1__1 : rule__DataFieldItem__Group_2_1__1__Impl ;
    public final void rule__DataFieldItem__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4311:1: ( rule__DataFieldItem__Group_2_1__1__Impl )
            // InternalCurlBetterThanHttpie.g:4312:2: rule__DataFieldItem__Group_2_1__1__Impl
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
    // InternalCurlBetterThanHttpie.g:4318:1: rule__DataFieldItem__Group_2_1__1__Impl : ( ( rule__DataFieldItem__ValueAssignment_2_1_1 ) ) ;
    public final void rule__DataFieldItem__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4322:1: ( ( ( rule__DataFieldItem__ValueAssignment_2_1_1 ) ) )
            // InternalCurlBetterThanHttpie.g:4323:1: ( ( rule__DataFieldItem__ValueAssignment_2_1_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:4323:1: ( ( rule__DataFieldItem__ValueAssignment_2_1_1 ) )
            // InternalCurlBetterThanHttpie.g:4324:2: ( rule__DataFieldItem__ValueAssignment_2_1_1 )
            {
             before(grammarAccess.getDataFieldItemAccess().getValueAssignment_2_1_1()); 
            // InternalCurlBetterThanHttpie.g:4325:2: ( rule__DataFieldItem__ValueAssignment_2_1_1 )
            // InternalCurlBetterThanHttpie.g:4325:3: rule__DataFieldItem__ValueAssignment_2_1_1
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
    // InternalCurlBetterThanHttpie.g:4334:1: rule__UrlParameterItem__Group__0 : rule__UrlParameterItem__Group__0__Impl rule__UrlParameterItem__Group__1 ;
    public final void rule__UrlParameterItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4338:1: ( rule__UrlParameterItem__Group__0__Impl rule__UrlParameterItem__Group__1 )
            // InternalCurlBetterThanHttpie.g:4339:2: rule__UrlParameterItem__Group__0__Impl rule__UrlParameterItem__Group__1
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
    // InternalCurlBetterThanHttpie.g:4346:1: rule__UrlParameterItem__Group__0__Impl : ( ( rule__UrlParameterItem__FieldAssignment_0 ) ) ;
    public final void rule__UrlParameterItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4350:1: ( ( ( rule__UrlParameterItem__FieldAssignment_0 ) ) )
            // InternalCurlBetterThanHttpie.g:4351:1: ( ( rule__UrlParameterItem__FieldAssignment_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:4351:1: ( ( rule__UrlParameterItem__FieldAssignment_0 ) )
            // InternalCurlBetterThanHttpie.g:4352:2: ( rule__UrlParameterItem__FieldAssignment_0 )
            {
             before(grammarAccess.getUrlParameterItemAccess().getFieldAssignment_0()); 
            // InternalCurlBetterThanHttpie.g:4353:2: ( rule__UrlParameterItem__FieldAssignment_0 )
            // InternalCurlBetterThanHttpie.g:4353:3: rule__UrlParameterItem__FieldAssignment_0
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
    // InternalCurlBetterThanHttpie.g:4361:1: rule__UrlParameterItem__Group__1 : rule__UrlParameterItem__Group__1__Impl rule__UrlParameterItem__Group__2 ;
    public final void rule__UrlParameterItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4365:1: ( rule__UrlParameterItem__Group__1__Impl rule__UrlParameterItem__Group__2 )
            // InternalCurlBetterThanHttpie.g:4366:2: rule__UrlParameterItem__Group__1__Impl rule__UrlParameterItem__Group__2
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
    // InternalCurlBetterThanHttpie.g:4373:1: rule__UrlParameterItem__Group__1__Impl : ( '==' ) ;
    public final void rule__UrlParameterItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4377:1: ( ( '==' ) )
            // InternalCurlBetterThanHttpie.g:4378:1: ( '==' )
            {
            // InternalCurlBetterThanHttpie.g:4378:1: ( '==' )
            // InternalCurlBetterThanHttpie.g:4379:2: '=='
            {
             before(grammarAccess.getUrlParameterItemAccess().getEqualsSignEqualsSignKeyword_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalCurlBetterThanHttpie.g:4388:1: rule__UrlParameterItem__Group__2 : rule__UrlParameterItem__Group__2__Impl ;
    public final void rule__UrlParameterItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4392:1: ( rule__UrlParameterItem__Group__2__Impl )
            // InternalCurlBetterThanHttpie.g:4393:2: rule__UrlParameterItem__Group__2__Impl
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
    // InternalCurlBetterThanHttpie.g:4399:1: rule__UrlParameterItem__Group__2__Impl : ( ( rule__UrlParameterItem__ValueAssignment_2 ) ) ;
    public final void rule__UrlParameterItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4403:1: ( ( ( rule__UrlParameterItem__ValueAssignment_2 ) ) )
            // InternalCurlBetterThanHttpie.g:4404:1: ( ( rule__UrlParameterItem__ValueAssignment_2 ) )
            {
            // InternalCurlBetterThanHttpie.g:4404:1: ( ( rule__UrlParameterItem__ValueAssignment_2 ) )
            // InternalCurlBetterThanHttpie.g:4405:2: ( rule__UrlParameterItem__ValueAssignment_2 )
            {
             before(grammarAccess.getUrlParameterItemAccess().getValueAssignment_2()); 
            // InternalCurlBetterThanHttpie.g:4406:2: ( rule__UrlParameterItem__ValueAssignment_2 )
            // InternalCurlBetterThanHttpie.g:4406:3: rule__UrlParameterItem__ValueAssignment_2
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
    // InternalCurlBetterThanHttpie.g:4415:1: rule__RawJsonFieldItem__Group__0 : rule__RawJsonFieldItem__Group__0__Impl rule__RawJsonFieldItem__Group__1 ;
    public final void rule__RawJsonFieldItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4419:1: ( rule__RawJsonFieldItem__Group__0__Impl rule__RawJsonFieldItem__Group__1 )
            // InternalCurlBetterThanHttpie.g:4420:2: rule__RawJsonFieldItem__Group__0__Impl rule__RawJsonFieldItem__Group__1
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
    // InternalCurlBetterThanHttpie.g:4427:1: rule__RawJsonFieldItem__Group__0__Impl : ( ( rule__RawJsonFieldItem__FieldAssignment_0 ) ) ;
    public final void rule__RawJsonFieldItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4431:1: ( ( ( rule__RawJsonFieldItem__FieldAssignment_0 ) ) )
            // InternalCurlBetterThanHttpie.g:4432:1: ( ( rule__RawJsonFieldItem__FieldAssignment_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:4432:1: ( ( rule__RawJsonFieldItem__FieldAssignment_0 ) )
            // InternalCurlBetterThanHttpie.g:4433:2: ( rule__RawJsonFieldItem__FieldAssignment_0 )
            {
             before(grammarAccess.getRawJsonFieldItemAccess().getFieldAssignment_0()); 
            // InternalCurlBetterThanHttpie.g:4434:2: ( rule__RawJsonFieldItem__FieldAssignment_0 )
            // InternalCurlBetterThanHttpie.g:4434:3: rule__RawJsonFieldItem__FieldAssignment_0
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
    // InternalCurlBetterThanHttpie.g:4442:1: rule__RawJsonFieldItem__Group__1 : rule__RawJsonFieldItem__Group__1__Impl rule__RawJsonFieldItem__Group__2 ;
    public final void rule__RawJsonFieldItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4446:1: ( rule__RawJsonFieldItem__Group__1__Impl rule__RawJsonFieldItem__Group__2 )
            // InternalCurlBetterThanHttpie.g:4447:2: rule__RawJsonFieldItem__Group__1__Impl rule__RawJsonFieldItem__Group__2
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
    // InternalCurlBetterThanHttpie.g:4454:1: rule__RawJsonFieldItem__Group__1__Impl : ( ':=' ) ;
    public final void rule__RawJsonFieldItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4458:1: ( ( ':=' ) )
            // InternalCurlBetterThanHttpie.g:4459:1: ( ':=' )
            {
            // InternalCurlBetterThanHttpie.g:4459:1: ( ':=' )
            // InternalCurlBetterThanHttpie.g:4460:2: ':='
            {
             before(grammarAccess.getRawJsonFieldItemAccess().getColonEqualsSignKeyword_1()); 
            match(input,44,FOLLOW_2); 
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
    // InternalCurlBetterThanHttpie.g:4469:1: rule__RawJsonFieldItem__Group__2 : rule__RawJsonFieldItem__Group__2__Impl ;
    public final void rule__RawJsonFieldItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4473:1: ( rule__RawJsonFieldItem__Group__2__Impl )
            // InternalCurlBetterThanHttpie.g:4474:2: rule__RawJsonFieldItem__Group__2__Impl
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
    // InternalCurlBetterThanHttpie.g:4480:1: rule__RawJsonFieldItem__Group__2__Impl : ( ( rule__RawJsonFieldItem__Alternatives_2 ) ) ;
    public final void rule__RawJsonFieldItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4484:1: ( ( ( rule__RawJsonFieldItem__Alternatives_2 ) ) )
            // InternalCurlBetterThanHttpie.g:4485:1: ( ( rule__RawJsonFieldItem__Alternatives_2 ) )
            {
            // InternalCurlBetterThanHttpie.g:4485:1: ( ( rule__RawJsonFieldItem__Alternatives_2 ) )
            // InternalCurlBetterThanHttpie.g:4486:2: ( rule__RawJsonFieldItem__Alternatives_2 )
            {
             before(grammarAccess.getRawJsonFieldItemAccess().getAlternatives_2()); 
            // InternalCurlBetterThanHttpie.g:4487:2: ( rule__RawJsonFieldItem__Alternatives_2 )
            // InternalCurlBetterThanHttpie.g:4487:3: rule__RawJsonFieldItem__Alternatives_2
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
    // InternalCurlBetterThanHttpie.g:4496:1: rule__RawJsonFieldItem__Group_2_1__0 : rule__RawJsonFieldItem__Group_2_1__0__Impl rule__RawJsonFieldItem__Group_2_1__1 ;
    public final void rule__RawJsonFieldItem__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4500:1: ( rule__RawJsonFieldItem__Group_2_1__0__Impl rule__RawJsonFieldItem__Group_2_1__1 )
            // InternalCurlBetterThanHttpie.g:4501:2: rule__RawJsonFieldItem__Group_2_1__0__Impl rule__RawJsonFieldItem__Group_2_1__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalCurlBetterThanHttpie.g:4508:1: rule__RawJsonFieldItem__Group_2_1__0__Impl : ( '@' ) ;
    public final void rule__RawJsonFieldItem__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4512:1: ( ( '@' ) )
            // InternalCurlBetterThanHttpie.g:4513:1: ( '@' )
            {
            // InternalCurlBetterThanHttpie.g:4513:1: ( '@' )
            // InternalCurlBetterThanHttpie.g:4514:2: '@'
            {
             before(grammarAccess.getRawJsonFieldItemAccess().getCommercialAtKeyword_2_1_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalCurlBetterThanHttpie.g:4523:1: rule__RawJsonFieldItem__Group_2_1__1 : rule__RawJsonFieldItem__Group_2_1__1__Impl ;
    public final void rule__RawJsonFieldItem__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4527:1: ( rule__RawJsonFieldItem__Group_2_1__1__Impl )
            // InternalCurlBetterThanHttpie.g:4528:2: rule__RawJsonFieldItem__Group_2_1__1__Impl
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
    // InternalCurlBetterThanHttpie.g:4534:1: rule__RawJsonFieldItem__Group_2_1__1__Impl : ( ( rule__RawJsonFieldItem__ValueAssignment_2_1_1 ) ) ;
    public final void rule__RawJsonFieldItem__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4538:1: ( ( ( rule__RawJsonFieldItem__ValueAssignment_2_1_1 ) ) )
            // InternalCurlBetterThanHttpie.g:4539:1: ( ( rule__RawJsonFieldItem__ValueAssignment_2_1_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:4539:1: ( ( rule__RawJsonFieldItem__ValueAssignment_2_1_1 ) )
            // InternalCurlBetterThanHttpie.g:4540:2: ( rule__RawJsonFieldItem__ValueAssignment_2_1_1 )
            {
             before(grammarAccess.getRawJsonFieldItemAccess().getValueAssignment_2_1_1()); 
            // InternalCurlBetterThanHttpie.g:4541:2: ( rule__RawJsonFieldItem__ValueAssignment_2_1_1 )
            // InternalCurlBetterThanHttpie.g:4541:3: rule__RawJsonFieldItem__ValueAssignment_2_1_1
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
    // InternalCurlBetterThanHttpie.g:4550:1: rule__Member__Group__0 : rule__Member__Group__0__Impl rule__Member__Group__1 ;
    public final void rule__Member__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4554:1: ( rule__Member__Group__0__Impl rule__Member__Group__1 )
            // InternalCurlBetterThanHttpie.g:4555:2: rule__Member__Group__0__Impl rule__Member__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalCurlBetterThanHttpie.g:4562:1: rule__Member__Group__0__Impl : ( ( rule__Member__Alternatives_0 ) ) ;
    public final void rule__Member__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4566:1: ( ( ( rule__Member__Alternatives_0 ) ) )
            // InternalCurlBetterThanHttpie.g:4567:1: ( ( rule__Member__Alternatives_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:4567:1: ( ( rule__Member__Alternatives_0 ) )
            // InternalCurlBetterThanHttpie.g:4568:2: ( rule__Member__Alternatives_0 )
            {
             before(grammarAccess.getMemberAccess().getAlternatives_0()); 
            // InternalCurlBetterThanHttpie.g:4569:2: ( rule__Member__Alternatives_0 )
            // InternalCurlBetterThanHttpie.g:4569:3: rule__Member__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Member__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getMemberAccess().getAlternatives_0()); 

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
    // InternalCurlBetterThanHttpie.g:4577:1: rule__Member__Group__1 : rule__Member__Group__1__Impl rule__Member__Group__2 ;
    public final void rule__Member__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4581:1: ( rule__Member__Group__1__Impl rule__Member__Group__2 )
            // InternalCurlBetterThanHttpie.g:4582:2: rule__Member__Group__1__Impl rule__Member__Group__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalCurlBetterThanHttpie.g:4589:1: rule__Member__Group__1__Impl : ( ( RULE_WS )? ) ;
    public final void rule__Member__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4593:1: ( ( ( RULE_WS )? ) )
            // InternalCurlBetterThanHttpie.g:4594:1: ( ( RULE_WS )? )
            {
            // InternalCurlBetterThanHttpie.g:4594:1: ( ( RULE_WS )? )
            // InternalCurlBetterThanHttpie.g:4595:2: ( RULE_WS )?
            {
             before(grammarAccess.getMemberAccess().getWSTerminalRuleCall_1()); 
            // InternalCurlBetterThanHttpie.g:4596:2: ( RULE_WS )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_WS) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:4596:3: RULE_WS
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
    // InternalCurlBetterThanHttpie.g:4604:1: rule__Member__Group__2 : rule__Member__Group__2__Impl rule__Member__Group__3 ;
    public final void rule__Member__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4608:1: ( rule__Member__Group__2__Impl rule__Member__Group__3 )
            // InternalCurlBetterThanHttpie.g:4609:2: rule__Member__Group__2__Impl rule__Member__Group__3
            {
            pushFollow(FOLLOW_36);
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
    // InternalCurlBetterThanHttpie.g:4616:1: rule__Member__Group__2__Impl : ( ':' ) ;
    public final void rule__Member__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4620:1: ( ( ':' ) )
            // InternalCurlBetterThanHttpie.g:4621:1: ( ':' )
            {
            // InternalCurlBetterThanHttpie.g:4621:1: ( ':' )
            // InternalCurlBetterThanHttpie.g:4622:2: ':'
            {
             before(grammarAccess.getMemberAccess().getColonKeyword_2()); 
            match(input,25,FOLLOW_2); 
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
    // InternalCurlBetterThanHttpie.g:4631:1: rule__Member__Group__3 : rule__Member__Group__3__Impl rule__Member__Group__4 ;
    public final void rule__Member__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4635:1: ( rule__Member__Group__3__Impl rule__Member__Group__4 )
            // InternalCurlBetterThanHttpie.g:4636:2: rule__Member__Group__3__Impl rule__Member__Group__4
            {
            pushFollow(FOLLOW_36);
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
    // InternalCurlBetterThanHttpie.g:4643:1: rule__Member__Group__3__Impl : ( ( RULE_WS )? ) ;
    public final void rule__Member__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4647:1: ( ( ( RULE_WS )? ) )
            // InternalCurlBetterThanHttpie.g:4648:1: ( ( RULE_WS )? )
            {
            // InternalCurlBetterThanHttpie.g:4648:1: ( ( RULE_WS )? )
            // InternalCurlBetterThanHttpie.g:4649:2: ( RULE_WS )?
            {
             before(grammarAccess.getMemberAccess().getWSTerminalRuleCall_3()); 
            // InternalCurlBetterThanHttpie.g:4650:2: ( RULE_WS )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==RULE_WS) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:4650:3: RULE_WS
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
    // InternalCurlBetterThanHttpie.g:4658:1: rule__Member__Group__4 : rule__Member__Group__4__Impl ;
    public final void rule__Member__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4662:1: ( rule__Member__Group__4__Impl )
            // InternalCurlBetterThanHttpie.g:4663:2: rule__Member__Group__4__Impl
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
    // InternalCurlBetterThanHttpie.g:4669:1: rule__Member__Group__4__Impl : ( ( rule__Member__ValueAssignment_4 ) ) ;
    public final void rule__Member__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4673:1: ( ( ( rule__Member__ValueAssignment_4 ) ) )
            // InternalCurlBetterThanHttpie.g:4674:1: ( ( rule__Member__ValueAssignment_4 ) )
            {
            // InternalCurlBetterThanHttpie.g:4674:1: ( ( rule__Member__ValueAssignment_4 ) )
            // InternalCurlBetterThanHttpie.g:4675:2: ( rule__Member__ValueAssignment_4 )
            {
             before(grammarAccess.getMemberAccess().getValueAssignment_4()); 
            // InternalCurlBetterThanHttpie.g:4676:2: ( rule__Member__ValueAssignment_4 )
            // InternalCurlBetterThanHttpie.g:4676:3: rule__Member__ValueAssignment_4
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


    // $ANTLR start "rule__Member__Group_0_0__0"
    // InternalCurlBetterThanHttpie.g:4685:1: rule__Member__Group_0_0__0 : rule__Member__Group_0_0__0__Impl rule__Member__Group_0_0__1 ;
    public final void rule__Member__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4689:1: ( rule__Member__Group_0_0__0__Impl rule__Member__Group_0_0__1 )
            // InternalCurlBetterThanHttpie.g:4690:2: rule__Member__Group_0_0__0__Impl rule__Member__Group_0_0__1
            {
            pushFollow(FOLLOW_13);
            rule__Member__Group_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Member__Group_0_0__1();

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
    // $ANTLR end "rule__Member__Group_0_0__0"


    // $ANTLR start "rule__Member__Group_0_0__0__Impl"
    // InternalCurlBetterThanHttpie.g:4697:1: rule__Member__Group_0_0__0__Impl : ( '\"' ) ;
    public final void rule__Member__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4701:1: ( ( '\"' ) )
            // InternalCurlBetterThanHttpie.g:4702:1: ( '\"' )
            {
            // InternalCurlBetterThanHttpie.g:4702:1: ( '\"' )
            // InternalCurlBetterThanHttpie.g:4703:2: '\"'
            {
             before(grammarAccess.getMemberAccess().getQuotationMarkKeyword_0_0_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getMemberAccess().getQuotationMarkKeyword_0_0_0()); 

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
    // $ANTLR end "rule__Member__Group_0_0__0__Impl"


    // $ANTLR start "rule__Member__Group_0_0__1"
    // InternalCurlBetterThanHttpie.g:4712:1: rule__Member__Group_0_0__1 : rule__Member__Group_0_0__1__Impl rule__Member__Group_0_0__2 ;
    public final void rule__Member__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4716:1: ( rule__Member__Group_0_0__1__Impl rule__Member__Group_0_0__2 )
            // InternalCurlBetterThanHttpie.g:4717:2: rule__Member__Group_0_0__1__Impl rule__Member__Group_0_0__2
            {
            pushFollow(FOLLOW_37);
            rule__Member__Group_0_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Member__Group_0_0__2();

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
    // $ANTLR end "rule__Member__Group_0_0__1"


    // $ANTLR start "rule__Member__Group_0_0__1__Impl"
    // InternalCurlBetterThanHttpie.g:4724:1: rule__Member__Group_0_0__1__Impl : ( ( rule__Member__KeyAssignment_0_0_1 ) ) ;
    public final void rule__Member__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4728:1: ( ( ( rule__Member__KeyAssignment_0_0_1 ) ) )
            // InternalCurlBetterThanHttpie.g:4729:1: ( ( rule__Member__KeyAssignment_0_0_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:4729:1: ( ( rule__Member__KeyAssignment_0_0_1 ) )
            // InternalCurlBetterThanHttpie.g:4730:2: ( rule__Member__KeyAssignment_0_0_1 )
            {
             before(grammarAccess.getMemberAccess().getKeyAssignment_0_0_1()); 
            // InternalCurlBetterThanHttpie.g:4731:2: ( rule__Member__KeyAssignment_0_0_1 )
            // InternalCurlBetterThanHttpie.g:4731:3: rule__Member__KeyAssignment_0_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Member__KeyAssignment_0_0_1();

            state._fsp--;


            }

             after(grammarAccess.getMemberAccess().getKeyAssignment_0_0_1()); 

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
    // $ANTLR end "rule__Member__Group_0_0__1__Impl"


    // $ANTLR start "rule__Member__Group_0_0__2"
    // InternalCurlBetterThanHttpie.g:4739:1: rule__Member__Group_0_0__2 : rule__Member__Group_0_0__2__Impl ;
    public final void rule__Member__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4743:1: ( rule__Member__Group_0_0__2__Impl )
            // InternalCurlBetterThanHttpie.g:4744:2: rule__Member__Group_0_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Member__Group_0_0__2__Impl();

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
    // $ANTLR end "rule__Member__Group_0_0__2"


    // $ANTLR start "rule__Member__Group_0_0__2__Impl"
    // InternalCurlBetterThanHttpie.g:4750:1: rule__Member__Group_0_0__2__Impl : ( '\"' ) ;
    public final void rule__Member__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4754:1: ( ( '\"' ) )
            // InternalCurlBetterThanHttpie.g:4755:1: ( '\"' )
            {
            // InternalCurlBetterThanHttpie.g:4755:1: ( '\"' )
            // InternalCurlBetterThanHttpie.g:4756:2: '\"'
            {
             before(grammarAccess.getMemberAccess().getQuotationMarkKeyword_0_0_2()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getMemberAccess().getQuotationMarkKeyword_0_0_2()); 

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
    // $ANTLR end "rule__Member__Group_0_0__2__Impl"


    // $ANTLR start "rule__Member__Group_0_1__0"
    // InternalCurlBetterThanHttpie.g:4766:1: rule__Member__Group_0_1__0 : rule__Member__Group_0_1__0__Impl rule__Member__Group_0_1__1 ;
    public final void rule__Member__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4770:1: ( rule__Member__Group_0_1__0__Impl rule__Member__Group_0_1__1 )
            // InternalCurlBetterThanHttpie.g:4771:2: rule__Member__Group_0_1__0__Impl rule__Member__Group_0_1__1
            {
            pushFollow(FOLLOW_13);
            rule__Member__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Member__Group_0_1__1();

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
    // $ANTLR end "rule__Member__Group_0_1__0"


    // $ANTLR start "rule__Member__Group_0_1__0__Impl"
    // InternalCurlBetterThanHttpie.g:4778:1: rule__Member__Group_0_1__0__Impl : ( '\\'' ) ;
    public final void rule__Member__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4782:1: ( ( '\\'' ) )
            // InternalCurlBetterThanHttpie.g:4783:1: ( '\\'' )
            {
            // InternalCurlBetterThanHttpie.g:4783:1: ( '\\'' )
            // InternalCurlBetterThanHttpie.g:4784:2: '\\''
            {
             before(grammarAccess.getMemberAccess().getApostropheKeyword_0_1_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getMemberAccess().getApostropheKeyword_0_1_0()); 

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
    // $ANTLR end "rule__Member__Group_0_1__0__Impl"


    // $ANTLR start "rule__Member__Group_0_1__1"
    // InternalCurlBetterThanHttpie.g:4793:1: rule__Member__Group_0_1__1 : rule__Member__Group_0_1__1__Impl rule__Member__Group_0_1__2 ;
    public final void rule__Member__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4797:1: ( rule__Member__Group_0_1__1__Impl rule__Member__Group_0_1__2 )
            // InternalCurlBetterThanHttpie.g:4798:2: rule__Member__Group_0_1__1__Impl rule__Member__Group_0_1__2
            {
            pushFollow(FOLLOW_38);
            rule__Member__Group_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Member__Group_0_1__2();

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
    // $ANTLR end "rule__Member__Group_0_1__1"


    // $ANTLR start "rule__Member__Group_0_1__1__Impl"
    // InternalCurlBetterThanHttpie.g:4805:1: rule__Member__Group_0_1__1__Impl : ( ( rule__Member__KeyAssignment_0_1_1 ) ) ;
    public final void rule__Member__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4809:1: ( ( ( rule__Member__KeyAssignment_0_1_1 ) ) )
            // InternalCurlBetterThanHttpie.g:4810:1: ( ( rule__Member__KeyAssignment_0_1_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:4810:1: ( ( rule__Member__KeyAssignment_0_1_1 ) )
            // InternalCurlBetterThanHttpie.g:4811:2: ( rule__Member__KeyAssignment_0_1_1 )
            {
             before(grammarAccess.getMemberAccess().getKeyAssignment_0_1_1()); 
            // InternalCurlBetterThanHttpie.g:4812:2: ( rule__Member__KeyAssignment_0_1_1 )
            // InternalCurlBetterThanHttpie.g:4812:3: rule__Member__KeyAssignment_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Member__KeyAssignment_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMemberAccess().getKeyAssignment_0_1_1()); 

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
    // $ANTLR end "rule__Member__Group_0_1__1__Impl"


    // $ANTLR start "rule__Member__Group_0_1__2"
    // InternalCurlBetterThanHttpie.g:4820:1: rule__Member__Group_0_1__2 : rule__Member__Group_0_1__2__Impl ;
    public final void rule__Member__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4824:1: ( rule__Member__Group_0_1__2__Impl )
            // InternalCurlBetterThanHttpie.g:4825:2: rule__Member__Group_0_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Member__Group_0_1__2__Impl();

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
    // $ANTLR end "rule__Member__Group_0_1__2"


    // $ANTLR start "rule__Member__Group_0_1__2__Impl"
    // InternalCurlBetterThanHttpie.g:4831:1: rule__Member__Group_0_1__2__Impl : ( '\\'' ) ;
    public final void rule__Member__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4835:1: ( ( '\\'' ) )
            // InternalCurlBetterThanHttpie.g:4836:1: ( '\\'' )
            {
            // InternalCurlBetterThanHttpie.g:4836:1: ( '\\'' )
            // InternalCurlBetterThanHttpie.g:4837:2: '\\''
            {
             before(grammarAccess.getMemberAccess().getApostropheKeyword_0_1_2()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getMemberAccess().getApostropheKeyword_0_1_2()); 

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
    // $ANTLR end "rule__Member__Group_0_1__2__Impl"


    // $ANTLR start "rule__JsonObject__Group__0"
    // InternalCurlBetterThanHttpie.g:4847:1: rule__JsonObject__Group__0 : rule__JsonObject__Group__0__Impl rule__JsonObject__Group__1 ;
    public final void rule__JsonObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4851:1: ( rule__JsonObject__Group__0__Impl rule__JsonObject__Group__1 )
            // InternalCurlBetterThanHttpie.g:4852:2: rule__JsonObject__Group__0__Impl rule__JsonObject__Group__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalCurlBetterThanHttpie.g:4859:1: rule__JsonObject__Group__0__Impl : ( () ) ;
    public final void rule__JsonObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4863:1: ( ( () ) )
            // InternalCurlBetterThanHttpie.g:4864:1: ( () )
            {
            // InternalCurlBetterThanHttpie.g:4864:1: ( () )
            // InternalCurlBetterThanHttpie.g:4865:2: ()
            {
             before(grammarAccess.getJsonObjectAccess().getJsonObjectAction_0()); 
            // InternalCurlBetterThanHttpie.g:4866:2: ()
            // InternalCurlBetterThanHttpie.g:4866:3: 
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
    // InternalCurlBetterThanHttpie.g:4874:1: rule__JsonObject__Group__1 : rule__JsonObject__Group__1__Impl rule__JsonObject__Group__2 ;
    public final void rule__JsonObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4878:1: ( rule__JsonObject__Group__1__Impl rule__JsonObject__Group__2 )
            // InternalCurlBetterThanHttpie.g:4879:2: rule__JsonObject__Group__1__Impl rule__JsonObject__Group__2
            {
            pushFollow(FOLLOW_40);
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
    // InternalCurlBetterThanHttpie.g:4886:1: rule__JsonObject__Group__1__Impl : ( '{' ) ;
    public final void rule__JsonObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4890:1: ( ( '{' ) )
            // InternalCurlBetterThanHttpie.g:4891:1: ( '{' )
            {
            // InternalCurlBetterThanHttpie.g:4891:1: ( '{' )
            // InternalCurlBetterThanHttpie.g:4892:2: '{'
            {
             before(grammarAccess.getJsonObjectAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,47,FOLLOW_2); 
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
    // InternalCurlBetterThanHttpie.g:4901:1: rule__JsonObject__Group__2 : rule__JsonObject__Group__2__Impl rule__JsonObject__Group__3 ;
    public final void rule__JsonObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4905:1: ( rule__JsonObject__Group__2__Impl rule__JsonObject__Group__3 )
            // InternalCurlBetterThanHttpie.g:4906:2: rule__JsonObject__Group__2__Impl rule__JsonObject__Group__3
            {
            pushFollow(FOLLOW_40);
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
    // InternalCurlBetterThanHttpie.g:4913:1: rule__JsonObject__Group__2__Impl : ( ( rule__JsonObject__Group_2__0 )? ) ;
    public final void rule__JsonObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4917:1: ( ( ( rule__JsonObject__Group_2__0 )? ) )
            // InternalCurlBetterThanHttpie.g:4918:1: ( ( rule__JsonObject__Group_2__0 )? )
            {
            // InternalCurlBetterThanHttpie.g:4918:1: ( ( rule__JsonObject__Group_2__0 )? )
            // InternalCurlBetterThanHttpie.g:4919:2: ( rule__JsonObject__Group_2__0 )?
            {
             before(grammarAccess.getJsonObjectAccess().getGroup_2()); 
            // InternalCurlBetterThanHttpie.g:4920:2: ( rule__JsonObject__Group_2__0 )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( ((LA65_0>=RULE_ID && LA65_0<=RULE_WS)||(LA65_0>=45 && LA65_0<=46)) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:4920:3: rule__JsonObject__Group_2__0
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
    // InternalCurlBetterThanHttpie.g:4928:1: rule__JsonObject__Group__3 : rule__JsonObject__Group__3__Impl ;
    public final void rule__JsonObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4932:1: ( rule__JsonObject__Group__3__Impl )
            // InternalCurlBetterThanHttpie.g:4933:2: rule__JsonObject__Group__3__Impl
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
    // InternalCurlBetterThanHttpie.g:4939:1: rule__JsonObject__Group__3__Impl : ( '}' ) ;
    public final void rule__JsonObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4943:1: ( ( '}' ) )
            // InternalCurlBetterThanHttpie.g:4944:1: ( '}' )
            {
            // InternalCurlBetterThanHttpie.g:4944:1: ( '}' )
            // InternalCurlBetterThanHttpie.g:4945:2: '}'
            {
             before(grammarAccess.getJsonObjectAccess().getRightCurlyBracketKeyword_3()); 
            match(input,48,FOLLOW_2); 
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
    // InternalCurlBetterThanHttpie.g:4955:1: rule__JsonObject__Group_2__0 : rule__JsonObject__Group_2__0__Impl rule__JsonObject__Group_2__1 ;
    public final void rule__JsonObject__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4959:1: ( rule__JsonObject__Group_2__0__Impl rule__JsonObject__Group_2__1 )
            // InternalCurlBetterThanHttpie.g:4960:2: rule__JsonObject__Group_2__0__Impl rule__JsonObject__Group_2__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalCurlBetterThanHttpie.g:4967:1: rule__JsonObject__Group_2__0__Impl : ( ( rule__JsonObject__Group_2_0__0 ) ) ;
    public final void rule__JsonObject__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4971:1: ( ( ( rule__JsonObject__Group_2_0__0 ) ) )
            // InternalCurlBetterThanHttpie.g:4972:1: ( ( rule__JsonObject__Group_2_0__0 ) )
            {
            // InternalCurlBetterThanHttpie.g:4972:1: ( ( rule__JsonObject__Group_2_0__0 ) )
            // InternalCurlBetterThanHttpie.g:4973:2: ( rule__JsonObject__Group_2_0__0 )
            {
             before(grammarAccess.getJsonObjectAccess().getGroup_2_0()); 
            // InternalCurlBetterThanHttpie.g:4974:2: ( rule__JsonObject__Group_2_0__0 )
            // InternalCurlBetterThanHttpie.g:4974:3: rule__JsonObject__Group_2_0__0
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
    // InternalCurlBetterThanHttpie.g:4982:1: rule__JsonObject__Group_2__1 : rule__JsonObject__Group_2__1__Impl rule__JsonObject__Group_2__2 ;
    public final void rule__JsonObject__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4986:1: ( rule__JsonObject__Group_2__1__Impl rule__JsonObject__Group_2__2 )
            // InternalCurlBetterThanHttpie.g:4987:2: rule__JsonObject__Group_2__1__Impl rule__JsonObject__Group_2__2
            {
            pushFollow(FOLLOW_41);
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
    // InternalCurlBetterThanHttpie.g:4994:1: rule__JsonObject__Group_2__1__Impl : ( ( rule__JsonObject__Group_2_1__0 )* ) ;
    public final void rule__JsonObject__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:4998:1: ( ( ( rule__JsonObject__Group_2_1__0 )* ) )
            // InternalCurlBetterThanHttpie.g:4999:1: ( ( rule__JsonObject__Group_2_1__0 )* )
            {
            // InternalCurlBetterThanHttpie.g:4999:1: ( ( rule__JsonObject__Group_2_1__0 )* )
            // InternalCurlBetterThanHttpie.g:5000:2: ( rule__JsonObject__Group_2_1__0 )*
            {
             before(grammarAccess.getJsonObjectAccess().getGroup_2_1()); 
            // InternalCurlBetterThanHttpie.g:5001:2: ( rule__JsonObject__Group_2_1__0 )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==RULE_WS) ) {
                    int LA66_1 = input.LA(2);

                    if ( (LA66_1==49) ) {
                        alt66=1;
                    }


                }
                else if ( (LA66_0==49) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // InternalCurlBetterThanHttpie.g:5001:3: rule__JsonObject__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_42);
            	    rule__JsonObject__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop66;
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
    // InternalCurlBetterThanHttpie.g:5009:1: rule__JsonObject__Group_2__2 : rule__JsonObject__Group_2__2__Impl ;
    public final void rule__JsonObject__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5013:1: ( rule__JsonObject__Group_2__2__Impl )
            // InternalCurlBetterThanHttpie.g:5014:2: rule__JsonObject__Group_2__2__Impl
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
    // InternalCurlBetterThanHttpie.g:5020:1: rule__JsonObject__Group_2__2__Impl : ( ( RULE_WS )? ) ;
    public final void rule__JsonObject__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5024:1: ( ( ( RULE_WS )? ) )
            // InternalCurlBetterThanHttpie.g:5025:1: ( ( RULE_WS )? )
            {
            // InternalCurlBetterThanHttpie.g:5025:1: ( ( RULE_WS )? )
            // InternalCurlBetterThanHttpie.g:5026:2: ( RULE_WS )?
            {
             before(grammarAccess.getJsonObjectAccess().getWSTerminalRuleCall_2_2()); 
            // InternalCurlBetterThanHttpie.g:5027:2: ( RULE_WS )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_WS) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:5027:3: RULE_WS
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
    // InternalCurlBetterThanHttpie.g:5036:1: rule__JsonObject__Group_2_0__0 : rule__JsonObject__Group_2_0__0__Impl rule__JsonObject__Group_2_0__1 ;
    public final void rule__JsonObject__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5040:1: ( rule__JsonObject__Group_2_0__0__Impl rule__JsonObject__Group_2_0__1 )
            // InternalCurlBetterThanHttpie.g:5041:2: rule__JsonObject__Group_2_0__0__Impl rule__JsonObject__Group_2_0__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalCurlBetterThanHttpie.g:5048:1: rule__JsonObject__Group_2_0__0__Impl : ( ( RULE_WS )? ) ;
    public final void rule__JsonObject__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5052:1: ( ( ( RULE_WS )? ) )
            // InternalCurlBetterThanHttpie.g:5053:1: ( ( RULE_WS )? )
            {
            // InternalCurlBetterThanHttpie.g:5053:1: ( ( RULE_WS )? )
            // InternalCurlBetterThanHttpie.g:5054:2: ( RULE_WS )?
            {
             before(grammarAccess.getJsonObjectAccess().getWSTerminalRuleCall_2_0_0()); 
            // InternalCurlBetterThanHttpie.g:5055:2: ( RULE_WS )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==RULE_WS) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:5055:3: RULE_WS
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
    // InternalCurlBetterThanHttpie.g:5063:1: rule__JsonObject__Group_2_0__1 : rule__JsonObject__Group_2_0__1__Impl ;
    public final void rule__JsonObject__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5067:1: ( rule__JsonObject__Group_2_0__1__Impl )
            // InternalCurlBetterThanHttpie.g:5068:2: rule__JsonObject__Group_2_0__1__Impl
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
    // InternalCurlBetterThanHttpie.g:5074:1: rule__JsonObject__Group_2_0__1__Impl : ( ( rule__JsonObject__MembersAssignment_2_0_1 ) ) ;
    public final void rule__JsonObject__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5078:1: ( ( ( rule__JsonObject__MembersAssignment_2_0_1 ) ) )
            // InternalCurlBetterThanHttpie.g:5079:1: ( ( rule__JsonObject__MembersAssignment_2_0_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:5079:1: ( ( rule__JsonObject__MembersAssignment_2_0_1 ) )
            // InternalCurlBetterThanHttpie.g:5080:2: ( rule__JsonObject__MembersAssignment_2_0_1 )
            {
             before(grammarAccess.getJsonObjectAccess().getMembersAssignment_2_0_1()); 
            // InternalCurlBetterThanHttpie.g:5081:2: ( rule__JsonObject__MembersAssignment_2_0_1 )
            // InternalCurlBetterThanHttpie.g:5081:3: rule__JsonObject__MembersAssignment_2_0_1
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
    // InternalCurlBetterThanHttpie.g:5090:1: rule__JsonObject__Group_2_1__0 : rule__JsonObject__Group_2_1__0__Impl rule__JsonObject__Group_2_1__1 ;
    public final void rule__JsonObject__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5094:1: ( rule__JsonObject__Group_2_1__0__Impl rule__JsonObject__Group_2_1__1 )
            // InternalCurlBetterThanHttpie.g:5095:2: rule__JsonObject__Group_2_1__0__Impl rule__JsonObject__Group_2_1__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalCurlBetterThanHttpie.g:5102:1: rule__JsonObject__Group_2_1__0__Impl : ( ( RULE_WS )? ) ;
    public final void rule__JsonObject__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5106:1: ( ( ( RULE_WS )? ) )
            // InternalCurlBetterThanHttpie.g:5107:1: ( ( RULE_WS )? )
            {
            // InternalCurlBetterThanHttpie.g:5107:1: ( ( RULE_WS )? )
            // InternalCurlBetterThanHttpie.g:5108:2: ( RULE_WS )?
            {
             before(grammarAccess.getJsonObjectAccess().getWSTerminalRuleCall_2_1_0()); 
            // InternalCurlBetterThanHttpie.g:5109:2: ( RULE_WS )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==RULE_WS) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:5109:3: RULE_WS
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
    // InternalCurlBetterThanHttpie.g:5117:1: rule__JsonObject__Group_2_1__1 : rule__JsonObject__Group_2_1__1__Impl rule__JsonObject__Group_2_1__2 ;
    public final void rule__JsonObject__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5121:1: ( rule__JsonObject__Group_2_1__1__Impl rule__JsonObject__Group_2_1__2 )
            // InternalCurlBetterThanHttpie.g:5122:2: rule__JsonObject__Group_2_1__1__Impl rule__JsonObject__Group_2_1__2
            {
            pushFollow(FOLLOW_43);
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
    // InternalCurlBetterThanHttpie.g:5129:1: rule__JsonObject__Group_2_1__1__Impl : ( ',' ) ;
    public final void rule__JsonObject__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5133:1: ( ( ',' ) )
            // InternalCurlBetterThanHttpie.g:5134:1: ( ',' )
            {
            // InternalCurlBetterThanHttpie.g:5134:1: ( ',' )
            // InternalCurlBetterThanHttpie.g:5135:2: ','
            {
             before(grammarAccess.getJsonObjectAccess().getCommaKeyword_2_1_1()); 
            match(input,49,FOLLOW_2); 
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
    // InternalCurlBetterThanHttpie.g:5144:1: rule__JsonObject__Group_2_1__2 : rule__JsonObject__Group_2_1__2__Impl rule__JsonObject__Group_2_1__3 ;
    public final void rule__JsonObject__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5148:1: ( rule__JsonObject__Group_2_1__2__Impl rule__JsonObject__Group_2_1__3 )
            // InternalCurlBetterThanHttpie.g:5149:2: rule__JsonObject__Group_2_1__2__Impl rule__JsonObject__Group_2_1__3
            {
            pushFollow(FOLLOW_43);
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
    // InternalCurlBetterThanHttpie.g:5156:1: rule__JsonObject__Group_2_1__2__Impl : ( ( RULE_WS )? ) ;
    public final void rule__JsonObject__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5160:1: ( ( ( RULE_WS )? ) )
            // InternalCurlBetterThanHttpie.g:5161:1: ( ( RULE_WS )? )
            {
            // InternalCurlBetterThanHttpie.g:5161:1: ( ( RULE_WS )? )
            // InternalCurlBetterThanHttpie.g:5162:2: ( RULE_WS )?
            {
             before(grammarAccess.getJsonObjectAccess().getWSTerminalRuleCall_2_1_2()); 
            // InternalCurlBetterThanHttpie.g:5163:2: ( RULE_WS )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==RULE_WS) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:5163:3: RULE_WS
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
    // InternalCurlBetterThanHttpie.g:5171:1: rule__JsonObject__Group_2_1__3 : rule__JsonObject__Group_2_1__3__Impl ;
    public final void rule__JsonObject__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5175:1: ( rule__JsonObject__Group_2_1__3__Impl )
            // InternalCurlBetterThanHttpie.g:5176:2: rule__JsonObject__Group_2_1__3__Impl
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
    // InternalCurlBetterThanHttpie.g:5182:1: rule__JsonObject__Group_2_1__3__Impl : ( ( rule__JsonObject__MembersAssignment_2_1_3 ) ) ;
    public final void rule__JsonObject__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5186:1: ( ( ( rule__JsonObject__MembersAssignment_2_1_3 ) ) )
            // InternalCurlBetterThanHttpie.g:5187:1: ( ( rule__JsonObject__MembersAssignment_2_1_3 ) )
            {
            // InternalCurlBetterThanHttpie.g:5187:1: ( ( rule__JsonObject__MembersAssignment_2_1_3 ) )
            // InternalCurlBetterThanHttpie.g:5188:2: ( rule__JsonObject__MembersAssignment_2_1_3 )
            {
             before(grammarAccess.getJsonObjectAccess().getMembersAssignment_2_1_3()); 
            // InternalCurlBetterThanHttpie.g:5189:2: ( rule__JsonObject__MembersAssignment_2_1_3 )
            // InternalCurlBetterThanHttpie.g:5189:3: rule__JsonObject__MembersAssignment_2_1_3
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


    // $ANTLR start "rule__JsonString__Group_0__0"
    // InternalCurlBetterThanHttpie.g:5198:1: rule__JsonString__Group_0__0 : rule__JsonString__Group_0__0__Impl rule__JsonString__Group_0__1 ;
    public final void rule__JsonString__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5202:1: ( rule__JsonString__Group_0__0__Impl rule__JsonString__Group_0__1 )
            // InternalCurlBetterThanHttpie.g:5203:2: rule__JsonString__Group_0__0__Impl rule__JsonString__Group_0__1
            {
            pushFollow(FOLLOW_13);
            rule__JsonString__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JsonString__Group_0__1();

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
    // $ANTLR end "rule__JsonString__Group_0__0"


    // $ANTLR start "rule__JsonString__Group_0__0__Impl"
    // InternalCurlBetterThanHttpie.g:5210:1: rule__JsonString__Group_0__0__Impl : ( '\"' ) ;
    public final void rule__JsonString__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5214:1: ( ( '\"' ) )
            // InternalCurlBetterThanHttpie.g:5215:1: ( '\"' )
            {
            // InternalCurlBetterThanHttpie.g:5215:1: ( '\"' )
            // InternalCurlBetterThanHttpie.g:5216:2: '\"'
            {
             before(grammarAccess.getJsonStringAccess().getQuotationMarkKeyword_0_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getJsonStringAccess().getQuotationMarkKeyword_0_0()); 

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
    // $ANTLR end "rule__JsonString__Group_0__0__Impl"


    // $ANTLR start "rule__JsonString__Group_0__1"
    // InternalCurlBetterThanHttpie.g:5225:1: rule__JsonString__Group_0__1 : rule__JsonString__Group_0__1__Impl rule__JsonString__Group_0__2 ;
    public final void rule__JsonString__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5229:1: ( rule__JsonString__Group_0__1__Impl rule__JsonString__Group_0__2 )
            // InternalCurlBetterThanHttpie.g:5230:2: rule__JsonString__Group_0__1__Impl rule__JsonString__Group_0__2
            {
            pushFollow(FOLLOW_37);
            rule__JsonString__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JsonString__Group_0__2();

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
    // $ANTLR end "rule__JsonString__Group_0__1"


    // $ANTLR start "rule__JsonString__Group_0__1__Impl"
    // InternalCurlBetterThanHttpie.g:5237:1: rule__JsonString__Group_0__1__Impl : ( ( rule__JsonString__ValueAssignment_0_1 ) ) ;
    public final void rule__JsonString__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5241:1: ( ( ( rule__JsonString__ValueAssignment_0_1 ) ) )
            // InternalCurlBetterThanHttpie.g:5242:1: ( ( rule__JsonString__ValueAssignment_0_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:5242:1: ( ( rule__JsonString__ValueAssignment_0_1 ) )
            // InternalCurlBetterThanHttpie.g:5243:2: ( rule__JsonString__ValueAssignment_0_1 )
            {
             before(grammarAccess.getJsonStringAccess().getValueAssignment_0_1()); 
            // InternalCurlBetterThanHttpie.g:5244:2: ( rule__JsonString__ValueAssignment_0_1 )
            // InternalCurlBetterThanHttpie.g:5244:3: rule__JsonString__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__JsonString__ValueAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getJsonStringAccess().getValueAssignment_0_1()); 

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
    // $ANTLR end "rule__JsonString__Group_0__1__Impl"


    // $ANTLR start "rule__JsonString__Group_0__2"
    // InternalCurlBetterThanHttpie.g:5252:1: rule__JsonString__Group_0__2 : rule__JsonString__Group_0__2__Impl ;
    public final void rule__JsonString__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5256:1: ( rule__JsonString__Group_0__2__Impl )
            // InternalCurlBetterThanHttpie.g:5257:2: rule__JsonString__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JsonString__Group_0__2__Impl();

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
    // $ANTLR end "rule__JsonString__Group_0__2"


    // $ANTLR start "rule__JsonString__Group_0__2__Impl"
    // InternalCurlBetterThanHttpie.g:5263:1: rule__JsonString__Group_0__2__Impl : ( '\"' ) ;
    public final void rule__JsonString__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5267:1: ( ( '\"' ) )
            // InternalCurlBetterThanHttpie.g:5268:1: ( '\"' )
            {
            // InternalCurlBetterThanHttpie.g:5268:1: ( '\"' )
            // InternalCurlBetterThanHttpie.g:5269:2: '\"'
            {
             before(grammarAccess.getJsonStringAccess().getQuotationMarkKeyword_0_2()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getJsonStringAccess().getQuotationMarkKeyword_0_2()); 

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
    // $ANTLR end "rule__JsonString__Group_0__2__Impl"


    // $ANTLR start "rule__JsonString__Group_1__0"
    // InternalCurlBetterThanHttpie.g:5279:1: rule__JsonString__Group_1__0 : rule__JsonString__Group_1__0__Impl rule__JsonString__Group_1__1 ;
    public final void rule__JsonString__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5283:1: ( rule__JsonString__Group_1__0__Impl rule__JsonString__Group_1__1 )
            // InternalCurlBetterThanHttpie.g:5284:2: rule__JsonString__Group_1__0__Impl rule__JsonString__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__JsonString__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JsonString__Group_1__1();

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
    // $ANTLR end "rule__JsonString__Group_1__0"


    // $ANTLR start "rule__JsonString__Group_1__0__Impl"
    // InternalCurlBetterThanHttpie.g:5291:1: rule__JsonString__Group_1__0__Impl : ( '\\'' ) ;
    public final void rule__JsonString__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5295:1: ( ( '\\'' ) )
            // InternalCurlBetterThanHttpie.g:5296:1: ( '\\'' )
            {
            // InternalCurlBetterThanHttpie.g:5296:1: ( '\\'' )
            // InternalCurlBetterThanHttpie.g:5297:2: '\\''
            {
             before(grammarAccess.getJsonStringAccess().getApostropheKeyword_1_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getJsonStringAccess().getApostropheKeyword_1_0()); 

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
    // $ANTLR end "rule__JsonString__Group_1__0__Impl"


    // $ANTLR start "rule__JsonString__Group_1__1"
    // InternalCurlBetterThanHttpie.g:5306:1: rule__JsonString__Group_1__1 : rule__JsonString__Group_1__1__Impl rule__JsonString__Group_1__2 ;
    public final void rule__JsonString__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5310:1: ( rule__JsonString__Group_1__1__Impl rule__JsonString__Group_1__2 )
            // InternalCurlBetterThanHttpie.g:5311:2: rule__JsonString__Group_1__1__Impl rule__JsonString__Group_1__2
            {
            pushFollow(FOLLOW_38);
            rule__JsonString__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JsonString__Group_1__2();

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
    // $ANTLR end "rule__JsonString__Group_1__1"


    // $ANTLR start "rule__JsonString__Group_1__1__Impl"
    // InternalCurlBetterThanHttpie.g:5318:1: rule__JsonString__Group_1__1__Impl : ( ( rule__JsonString__ValueAssignment_1_1 ) ) ;
    public final void rule__JsonString__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5322:1: ( ( ( rule__JsonString__ValueAssignment_1_1 ) ) )
            // InternalCurlBetterThanHttpie.g:5323:1: ( ( rule__JsonString__ValueAssignment_1_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:5323:1: ( ( rule__JsonString__ValueAssignment_1_1 ) )
            // InternalCurlBetterThanHttpie.g:5324:2: ( rule__JsonString__ValueAssignment_1_1 )
            {
             before(grammarAccess.getJsonStringAccess().getValueAssignment_1_1()); 
            // InternalCurlBetterThanHttpie.g:5325:2: ( rule__JsonString__ValueAssignment_1_1 )
            // InternalCurlBetterThanHttpie.g:5325:3: rule__JsonString__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__JsonString__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getJsonStringAccess().getValueAssignment_1_1()); 

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
    // $ANTLR end "rule__JsonString__Group_1__1__Impl"


    // $ANTLR start "rule__JsonString__Group_1__2"
    // InternalCurlBetterThanHttpie.g:5333:1: rule__JsonString__Group_1__2 : rule__JsonString__Group_1__2__Impl ;
    public final void rule__JsonString__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5337:1: ( rule__JsonString__Group_1__2__Impl )
            // InternalCurlBetterThanHttpie.g:5338:2: rule__JsonString__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JsonString__Group_1__2__Impl();

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
    // $ANTLR end "rule__JsonString__Group_1__2"


    // $ANTLR start "rule__JsonString__Group_1__2__Impl"
    // InternalCurlBetterThanHttpie.g:5344:1: rule__JsonString__Group_1__2__Impl : ( '\\'' ) ;
    public final void rule__JsonString__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5348:1: ( ( '\\'' ) )
            // InternalCurlBetterThanHttpie.g:5349:1: ( '\\'' )
            {
            // InternalCurlBetterThanHttpie.g:5349:1: ( '\\'' )
            // InternalCurlBetterThanHttpie.g:5350:2: '\\''
            {
             before(grammarAccess.getJsonStringAccess().getApostropheKeyword_1_2()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getJsonStringAccess().getApostropheKeyword_1_2()); 

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
    // $ANTLR end "rule__JsonString__Group_1__2__Impl"


    // $ANTLR start "rule__JsonArray__Group__0"
    // InternalCurlBetterThanHttpie.g:5360:1: rule__JsonArray__Group__0 : rule__JsonArray__Group__0__Impl rule__JsonArray__Group__1 ;
    public final void rule__JsonArray__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5364:1: ( rule__JsonArray__Group__0__Impl rule__JsonArray__Group__1 )
            // InternalCurlBetterThanHttpie.g:5365:2: rule__JsonArray__Group__0__Impl rule__JsonArray__Group__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalCurlBetterThanHttpie.g:5372:1: rule__JsonArray__Group__0__Impl : ( () ) ;
    public final void rule__JsonArray__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5376:1: ( ( () ) )
            // InternalCurlBetterThanHttpie.g:5377:1: ( () )
            {
            // InternalCurlBetterThanHttpie.g:5377:1: ( () )
            // InternalCurlBetterThanHttpie.g:5378:2: ()
            {
             before(grammarAccess.getJsonArrayAccess().getJsonArrayAction_0()); 
            // InternalCurlBetterThanHttpie.g:5379:2: ()
            // InternalCurlBetterThanHttpie.g:5379:3: 
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
    // InternalCurlBetterThanHttpie.g:5387:1: rule__JsonArray__Group__1 : rule__JsonArray__Group__1__Impl rule__JsonArray__Group__2 ;
    public final void rule__JsonArray__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5391:1: ( rule__JsonArray__Group__1__Impl rule__JsonArray__Group__2 )
            // InternalCurlBetterThanHttpie.g:5392:2: rule__JsonArray__Group__1__Impl rule__JsonArray__Group__2
            {
            pushFollow(FOLLOW_45);
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
    // InternalCurlBetterThanHttpie.g:5399:1: rule__JsonArray__Group__1__Impl : ( '[' ) ;
    public final void rule__JsonArray__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5403:1: ( ( '[' ) )
            // InternalCurlBetterThanHttpie.g:5404:1: ( '[' )
            {
            // InternalCurlBetterThanHttpie.g:5404:1: ( '[' )
            // InternalCurlBetterThanHttpie.g:5405:2: '['
            {
             before(grammarAccess.getJsonArrayAccess().getLeftSquareBracketKeyword_1()); 
            match(input,50,FOLLOW_2); 
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
    // InternalCurlBetterThanHttpie.g:5414:1: rule__JsonArray__Group__2 : rule__JsonArray__Group__2__Impl rule__JsonArray__Group__3 ;
    public final void rule__JsonArray__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5418:1: ( rule__JsonArray__Group__2__Impl rule__JsonArray__Group__3 )
            // InternalCurlBetterThanHttpie.g:5419:2: rule__JsonArray__Group__2__Impl rule__JsonArray__Group__3
            {
            pushFollow(FOLLOW_45);
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
    // InternalCurlBetterThanHttpie.g:5426:1: rule__JsonArray__Group__2__Impl : ( ( rule__JsonArray__Group_2__0 )? ) ;
    public final void rule__JsonArray__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5430:1: ( ( ( rule__JsonArray__Group_2__0 )? ) )
            // InternalCurlBetterThanHttpie.g:5431:1: ( ( rule__JsonArray__Group_2__0 )? )
            {
            // InternalCurlBetterThanHttpie.g:5431:1: ( ( rule__JsonArray__Group_2__0 )? )
            // InternalCurlBetterThanHttpie.g:5432:2: ( rule__JsonArray__Group_2__0 )?
            {
             before(grammarAccess.getJsonArrayAccess().getGroup_2()); 
            // InternalCurlBetterThanHttpie.g:5433:2: ( rule__JsonArray__Group_2__0 )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( ((LA71_0>=RULE_ID && LA71_0<=RULE_NULL)||(LA71_0>=RULE_FLOAT && LA71_0<=RULE_BOOLEAN)||(LA71_0>=45 && LA71_0<=47)||LA71_0==50) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:5433:3: rule__JsonArray__Group_2__0
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
    // InternalCurlBetterThanHttpie.g:5441:1: rule__JsonArray__Group__3 : rule__JsonArray__Group__3__Impl ;
    public final void rule__JsonArray__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5445:1: ( rule__JsonArray__Group__3__Impl )
            // InternalCurlBetterThanHttpie.g:5446:2: rule__JsonArray__Group__3__Impl
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
    // InternalCurlBetterThanHttpie.g:5452:1: rule__JsonArray__Group__3__Impl : ( ']' ) ;
    public final void rule__JsonArray__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5456:1: ( ( ']' ) )
            // InternalCurlBetterThanHttpie.g:5457:1: ( ']' )
            {
            // InternalCurlBetterThanHttpie.g:5457:1: ( ']' )
            // InternalCurlBetterThanHttpie.g:5458:2: ']'
            {
             before(grammarAccess.getJsonArrayAccess().getRightSquareBracketKeyword_3()); 
            match(input,51,FOLLOW_2); 
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
    // InternalCurlBetterThanHttpie.g:5468:1: rule__JsonArray__Group_2__0 : rule__JsonArray__Group_2__0__Impl rule__JsonArray__Group_2__1 ;
    public final void rule__JsonArray__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5472:1: ( rule__JsonArray__Group_2__0__Impl rule__JsonArray__Group_2__1 )
            // InternalCurlBetterThanHttpie.g:5473:2: rule__JsonArray__Group_2__0__Impl rule__JsonArray__Group_2__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalCurlBetterThanHttpie.g:5480:1: rule__JsonArray__Group_2__0__Impl : ( ( rule__JsonArray__Group_2_0__0 ) ) ;
    public final void rule__JsonArray__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5484:1: ( ( ( rule__JsonArray__Group_2_0__0 ) ) )
            // InternalCurlBetterThanHttpie.g:5485:1: ( ( rule__JsonArray__Group_2_0__0 ) )
            {
            // InternalCurlBetterThanHttpie.g:5485:1: ( ( rule__JsonArray__Group_2_0__0 ) )
            // InternalCurlBetterThanHttpie.g:5486:2: ( rule__JsonArray__Group_2_0__0 )
            {
             before(grammarAccess.getJsonArrayAccess().getGroup_2_0()); 
            // InternalCurlBetterThanHttpie.g:5487:2: ( rule__JsonArray__Group_2_0__0 )
            // InternalCurlBetterThanHttpie.g:5487:3: rule__JsonArray__Group_2_0__0
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
    // InternalCurlBetterThanHttpie.g:5495:1: rule__JsonArray__Group_2__1 : rule__JsonArray__Group_2__1__Impl rule__JsonArray__Group_2__2 ;
    public final void rule__JsonArray__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5499:1: ( rule__JsonArray__Group_2__1__Impl rule__JsonArray__Group_2__2 )
            // InternalCurlBetterThanHttpie.g:5500:2: rule__JsonArray__Group_2__1__Impl rule__JsonArray__Group_2__2
            {
            pushFollow(FOLLOW_41);
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
    // InternalCurlBetterThanHttpie.g:5507:1: rule__JsonArray__Group_2__1__Impl : ( ( rule__JsonArray__Group_2_1__0 )* ) ;
    public final void rule__JsonArray__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5511:1: ( ( ( rule__JsonArray__Group_2_1__0 )* ) )
            // InternalCurlBetterThanHttpie.g:5512:1: ( ( rule__JsonArray__Group_2_1__0 )* )
            {
            // InternalCurlBetterThanHttpie.g:5512:1: ( ( rule__JsonArray__Group_2_1__0 )* )
            // InternalCurlBetterThanHttpie.g:5513:2: ( rule__JsonArray__Group_2_1__0 )*
            {
             before(grammarAccess.getJsonArrayAccess().getGroup_2_1()); 
            // InternalCurlBetterThanHttpie.g:5514:2: ( rule__JsonArray__Group_2_1__0 )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==RULE_WS) ) {
                    int LA72_1 = input.LA(2);

                    if ( (LA72_1==49) ) {
                        alt72=1;
                    }


                }
                else if ( (LA72_0==49) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // InternalCurlBetterThanHttpie.g:5514:3: rule__JsonArray__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_42);
            	    rule__JsonArray__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop72;
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
    // InternalCurlBetterThanHttpie.g:5522:1: rule__JsonArray__Group_2__2 : rule__JsonArray__Group_2__2__Impl ;
    public final void rule__JsonArray__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5526:1: ( rule__JsonArray__Group_2__2__Impl )
            // InternalCurlBetterThanHttpie.g:5527:2: rule__JsonArray__Group_2__2__Impl
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
    // InternalCurlBetterThanHttpie.g:5533:1: rule__JsonArray__Group_2__2__Impl : ( ( RULE_WS )? ) ;
    public final void rule__JsonArray__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5537:1: ( ( ( RULE_WS )? ) )
            // InternalCurlBetterThanHttpie.g:5538:1: ( ( RULE_WS )? )
            {
            // InternalCurlBetterThanHttpie.g:5538:1: ( ( RULE_WS )? )
            // InternalCurlBetterThanHttpie.g:5539:2: ( RULE_WS )?
            {
             before(grammarAccess.getJsonArrayAccess().getWSTerminalRuleCall_2_2()); 
            // InternalCurlBetterThanHttpie.g:5540:2: ( RULE_WS )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==RULE_WS) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:5540:3: RULE_WS
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
    // InternalCurlBetterThanHttpie.g:5549:1: rule__JsonArray__Group_2_0__0 : rule__JsonArray__Group_2_0__0__Impl rule__JsonArray__Group_2_0__1 ;
    public final void rule__JsonArray__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5553:1: ( rule__JsonArray__Group_2_0__0__Impl rule__JsonArray__Group_2_0__1 )
            // InternalCurlBetterThanHttpie.g:5554:2: rule__JsonArray__Group_2_0__0__Impl rule__JsonArray__Group_2_0__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalCurlBetterThanHttpie.g:5561:1: rule__JsonArray__Group_2_0__0__Impl : ( ( RULE_WS )? ) ;
    public final void rule__JsonArray__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5565:1: ( ( ( RULE_WS )? ) )
            // InternalCurlBetterThanHttpie.g:5566:1: ( ( RULE_WS )? )
            {
            // InternalCurlBetterThanHttpie.g:5566:1: ( ( RULE_WS )? )
            // InternalCurlBetterThanHttpie.g:5567:2: ( RULE_WS )?
            {
             before(grammarAccess.getJsonArrayAccess().getWSTerminalRuleCall_2_0_0()); 
            // InternalCurlBetterThanHttpie.g:5568:2: ( RULE_WS )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==RULE_WS) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:5568:3: RULE_WS
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
    // InternalCurlBetterThanHttpie.g:5576:1: rule__JsonArray__Group_2_0__1 : rule__JsonArray__Group_2_0__1__Impl ;
    public final void rule__JsonArray__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5580:1: ( rule__JsonArray__Group_2_0__1__Impl )
            // InternalCurlBetterThanHttpie.g:5581:2: rule__JsonArray__Group_2_0__1__Impl
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
    // InternalCurlBetterThanHttpie.g:5587:1: rule__JsonArray__Group_2_0__1__Impl : ( ( rule__JsonArray__ValuesAssignment_2_0_1 ) ) ;
    public final void rule__JsonArray__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5591:1: ( ( ( rule__JsonArray__ValuesAssignment_2_0_1 ) ) )
            // InternalCurlBetterThanHttpie.g:5592:1: ( ( rule__JsonArray__ValuesAssignment_2_0_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:5592:1: ( ( rule__JsonArray__ValuesAssignment_2_0_1 ) )
            // InternalCurlBetterThanHttpie.g:5593:2: ( rule__JsonArray__ValuesAssignment_2_0_1 )
            {
             before(grammarAccess.getJsonArrayAccess().getValuesAssignment_2_0_1()); 
            // InternalCurlBetterThanHttpie.g:5594:2: ( rule__JsonArray__ValuesAssignment_2_0_1 )
            // InternalCurlBetterThanHttpie.g:5594:3: rule__JsonArray__ValuesAssignment_2_0_1
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
    // InternalCurlBetterThanHttpie.g:5603:1: rule__JsonArray__Group_2_1__0 : rule__JsonArray__Group_2_1__0__Impl rule__JsonArray__Group_2_1__1 ;
    public final void rule__JsonArray__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5607:1: ( rule__JsonArray__Group_2_1__0__Impl rule__JsonArray__Group_2_1__1 )
            // InternalCurlBetterThanHttpie.g:5608:2: rule__JsonArray__Group_2_1__0__Impl rule__JsonArray__Group_2_1__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalCurlBetterThanHttpie.g:5615:1: rule__JsonArray__Group_2_1__0__Impl : ( ( RULE_WS )? ) ;
    public final void rule__JsonArray__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5619:1: ( ( ( RULE_WS )? ) )
            // InternalCurlBetterThanHttpie.g:5620:1: ( ( RULE_WS )? )
            {
            // InternalCurlBetterThanHttpie.g:5620:1: ( ( RULE_WS )? )
            // InternalCurlBetterThanHttpie.g:5621:2: ( RULE_WS )?
            {
             before(grammarAccess.getJsonArrayAccess().getWSTerminalRuleCall_2_1_0()); 
            // InternalCurlBetterThanHttpie.g:5622:2: ( RULE_WS )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==RULE_WS) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:5622:3: RULE_WS
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
    // InternalCurlBetterThanHttpie.g:5630:1: rule__JsonArray__Group_2_1__1 : rule__JsonArray__Group_2_1__1__Impl rule__JsonArray__Group_2_1__2 ;
    public final void rule__JsonArray__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5634:1: ( rule__JsonArray__Group_2_1__1__Impl rule__JsonArray__Group_2_1__2 )
            // InternalCurlBetterThanHttpie.g:5635:2: rule__JsonArray__Group_2_1__1__Impl rule__JsonArray__Group_2_1__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalCurlBetterThanHttpie.g:5642:1: rule__JsonArray__Group_2_1__1__Impl : ( ',' ) ;
    public final void rule__JsonArray__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5646:1: ( ( ',' ) )
            // InternalCurlBetterThanHttpie.g:5647:1: ( ',' )
            {
            // InternalCurlBetterThanHttpie.g:5647:1: ( ',' )
            // InternalCurlBetterThanHttpie.g:5648:2: ','
            {
             before(grammarAccess.getJsonArrayAccess().getCommaKeyword_2_1_1()); 
            match(input,49,FOLLOW_2); 
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
    // InternalCurlBetterThanHttpie.g:5657:1: rule__JsonArray__Group_2_1__2 : rule__JsonArray__Group_2_1__2__Impl rule__JsonArray__Group_2_1__3 ;
    public final void rule__JsonArray__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5661:1: ( rule__JsonArray__Group_2_1__2__Impl rule__JsonArray__Group_2_1__3 )
            // InternalCurlBetterThanHttpie.g:5662:2: rule__JsonArray__Group_2_1__2__Impl rule__JsonArray__Group_2_1__3
            {
            pushFollow(FOLLOW_36);
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
    // InternalCurlBetterThanHttpie.g:5669:1: rule__JsonArray__Group_2_1__2__Impl : ( ( RULE_WS )? ) ;
    public final void rule__JsonArray__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5673:1: ( ( ( RULE_WS )? ) )
            // InternalCurlBetterThanHttpie.g:5674:1: ( ( RULE_WS )? )
            {
            // InternalCurlBetterThanHttpie.g:5674:1: ( ( RULE_WS )? )
            // InternalCurlBetterThanHttpie.g:5675:2: ( RULE_WS )?
            {
             before(grammarAccess.getJsonArrayAccess().getWSTerminalRuleCall_2_1_2()); 
            // InternalCurlBetterThanHttpie.g:5676:2: ( RULE_WS )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==RULE_WS) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:5676:3: RULE_WS
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
    // InternalCurlBetterThanHttpie.g:5684:1: rule__JsonArray__Group_2_1__3 : rule__JsonArray__Group_2_1__3__Impl ;
    public final void rule__JsonArray__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5688:1: ( rule__JsonArray__Group_2_1__3__Impl )
            // InternalCurlBetterThanHttpie.g:5689:2: rule__JsonArray__Group_2_1__3__Impl
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
    // InternalCurlBetterThanHttpie.g:5695:1: rule__JsonArray__Group_2_1__3__Impl : ( ( rule__JsonArray__ValuesAssignment_2_1_3 ) ) ;
    public final void rule__JsonArray__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5699:1: ( ( ( rule__JsonArray__ValuesAssignment_2_1_3 ) ) )
            // InternalCurlBetterThanHttpie.g:5700:1: ( ( rule__JsonArray__ValuesAssignment_2_1_3 ) )
            {
            // InternalCurlBetterThanHttpie.g:5700:1: ( ( rule__JsonArray__ValuesAssignment_2_1_3 ) )
            // InternalCurlBetterThanHttpie.g:5701:2: ( rule__JsonArray__ValuesAssignment_2_1_3 )
            {
             before(grammarAccess.getJsonArrayAccess().getValuesAssignment_2_1_3()); 
            // InternalCurlBetterThanHttpie.g:5702:2: ( rule__JsonArray__ValuesAssignment_2_1_3 )
            // InternalCurlBetterThanHttpie.g:5702:3: rule__JsonArray__ValuesAssignment_2_1_3
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
    // InternalCurlBetterThanHttpie.g:5711:1: rule__JsonNull__Group__0 : rule__JsonNull__Group__0__Impl rule__JsonNull__Group__1 ;
    public final void rule__JsonNull__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5715:1: ( rule__JsonNull__Group__0__Impl rule__JsonNull__Group__1 )
            // InternalCurlBetterThanHttpie.g:5716:2: rule__JsonNull__Group__0__Impl rule__JsonNull__Group__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalCurlBetterThanHttpie.g:5723:1: rule__JsonNull__Group__0__Impl : ( () ) ;
    public final void rule__JsonNull__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5727:1: ( ( () ) )
            // InternalCurlBetterThanHttpie.g:5728:1: ( () )
            {
            // InternalCurlBetterThanHttpie.g:5728:1: ( () )
            // InternalCurlBetterThanHttpie.g:5729:2: ()
            {
             before(grammarAccess.getJsonNullAccess().getJsonNullAction_0()); 
            // InternalCurlBetterThanHttpie.g:5730:2: ()
            // InternalCurlBetterThanHttpie.g:5730:3: 
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
    // InternalCurlBetterThanHttpie.g:5738:1: rule__JsonNull__Group__1 : rule__JsonNull__Group__1__Impl ;
    public final void rule__JsonNull__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5742:1: ( rule__JsonNull__Group__1__Impl )
            // InternalCurlBetterThanHttpie.g:5743:2: rule__JsonNull__Group__1__Impl
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
    // InternalCurlBetterThanHttpie.g:5749:1: rule__JsonNull__Group__1__Impl : ( RULE_NULL ) ;
    public final void rule__JsonNull__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5753:1: ( ( RULE_NULL ) )
            // InternalCurlBetterThanHttpie.g:5754:1: ( RULE_NULL )
            {
            // InternalCurlBetterThanHttpie.g:5754:1: ( RULE_NULL )
            // InternalCurlBetterThanHttpie.g:5755:2: RULE_NULL
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
    // InternalCurlBetterThanHttpie.g:5765:1: rule__CommandLineInterface__FlagsAssignment_2_1 : ( ruleFlag ) ;
    public final void rule__CommandLineInterface__FlagsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5769:1: ( ( ruleFlag ) )
            // InternalCurlBetterThanHttpie.g:5770:2: ( ruleFlag )
            {
            // InternalCurlBetterThanHttpie.g:5770:2: ( ruleFlag )
            // InternalCurlBetterThanHttpie.g:5771:3: ruleFlag
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
    // InternalCurlBetterThanHttpie.g:5780:1: rule__CommandLineInterface__MethodAssignment_3_1 : ( ruleMethod ) ;
    public final void rule__CommandLineInterface__MethodAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5784:1: ( ( ruleMethod ) )
            // InternalCurlBetterThanHttpie.g:5785:2: ( ruleMethod )
            {
            // InternalCurlBetterThanHttpie.g:5785:2: ( ruleMethod )
            // InternalCurlBetterThanHttpie.g:5786:3: ruleMethod
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
    // InternalCurlBetterThanHttpie.g:5795:1: rule__CommandLineInterface__ProtocolAssignment_5_0 : ( ( rule__CommandLineInterface__ProtocolAlternatives_5_0_0 ) ) ;
    public final void rule__CommandLineInterface__ProtocolAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5799:1: ( ( ( rule__CommandLineInterface__ProtocolAlternatives_5_0_0 ) ) )
            // InternalCurlBetterThanHttpie.g:5800:2: ( ( rule__CommandLineInterface__ProtocolAlternatives_5_0_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:5800:2: ( ( rule__CommandLineInterface__ProtocolAlternatives_5_0_0 ) )
            // InternalCurlBetterThanHttpie.g:5801:3: ( rule__CommandLineInterface__ProtocolAlternatives_5_0_0 )
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getProtocolAlternatives_5_0_0()); 
            // InternalCurlBetterThanHttpie.g:5802:3: ( rule__CommandLineInterface__ProtocolAlternatives_5_0_0 )
            // InternalCurlBetterThanHttpie.g:5802:4: rule__CommandLineInterface__ProtocolAlternatives_5_0_0
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
    // InternalCurlBetterThanHttpie.g:5810:1: rule__CommandLineInterface__UrlAssignment_6_0_0 : ( RULE_URL ) ;
    public final void rule__CommandLineInterface__UrlAssignment_6_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5814:1: ( ( RULE_URL ) )
            // InternalCurlBetterThanHttpie.g:5815:2: ( RULE_URL )
            {
            // InternalCurlBetterThanHttpie.g:5815:2: ( RULE_URL )
            // InternalCurlBetterThanHttpie.g:5816:3: RULE_URL
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
    // InternalCurlBetterThanHttpie.g:5825:1: rule__CommandLineInterface__PortAssignment_6_0_1_1 : ( RULE_INT ) ;
    public final void rule__CommandLineInterface__PortAssignment_6_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5829:1: ( ( RULE_INT ) )
            // InternalCurlBetterThanHttpie.g:5830:2: ( RULE_INT )
            {
            // InternalCurlBetterThanHttpie.g:5830:2: ( RULE_INT )
            // InternalCurlBetterThanHttpie.g:5831:3: RULE_INT
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
    // InternalCurlBetterThanHttpie.g:5840:1: rule__CommandLineInterface__PortAssignment_6_1_1 : ( RULE_INT ) ;
    public final void rule__CommandLineInterface__PortAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5844:1: ( ( RULE_INT ) )
            // InternalCurlBetterThanHttpie.g:5845:2: ( RULE_INT )
            {
            // InternalCurlBetterThanHttpie.g:5845:2: ( RULE_INT )
            // InternalCurlBetterThanHttpie.g:5846:3: RULE_INT
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
    // InternalCurlBetterThanHttpie.g:5855:1: rule__CommandLineInterface__ResourceAssignment_7_1 : ( ( rule__CommandLineInterface__ResourceAlternatives_7_1_0 ) ) ;
    public final void rule__CommandLineInterface__ResourceAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5859:1: ( ( ( rule__CommandLineInterface__ResourceAlternatives_7_1_0 ) ) )
            // InternalCurlBetterThanHttpie.g:5860:2: ( ( rule__CommandLineInterface__ResourceAlternatives_7_1_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:5860:2: ( ( rule__CommandLineInterface__ResourceAlternatives_7_1_0 ) )
            // InternalCurlBetterThanHttpie.g:5861:3: ( rule__CommandLineInterface__ResourceAlternatives_7_1_0 )
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getResourceAlternatives_7_1_0()); 
            // InternalCurlBetterThanHttpie.g:5862:3: ( rule__CommandLineInterface__ResourceAlternatives_7_1_0 )
            // InternalCurlBetterThanHttpie.g:5862:4: rule__CommandLineInterface__ResourceAlternatives_7_1_0
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
    // InternalCurlBetterThanHttpie.g:5870:1: rule__CommandLineInterface__ItemsAssignment_9_1 : ( ruleItem ) ;
    public final void rule__CommandLineInterface__ItemsAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5874:1: ( ( ruleItem ) )
            // InternalCurlBetterThanHttpie.g:5875:2: ( ruleItem )
            {
            // InternalCurlBetterThanHttpie.g:5875:2: ( ruleItem )
            // InternalCurlBetterThanHttpie.g:5876:3: ruleItem
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
    // InternalCurlBetterThanHttpie.g:5885:1: rule__ProxyFlag__ProtocolAssignment_2_0_0 : ( ( rule__ProxyFlag__ProtocolAlternatives_2_0_0_0 ) ) ;
    public final void rule__ProxyFlag__ProtocolAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5889:1: ( ( ( rule__ProxyFlag__ProtocolAlternatives_2_0_0_0 ) ) )
            // InternalCurlBetterThanHttpie.g:5890:2: ( ( rule__ProxyFlag__ProtocolAlternatives_2_0_0_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:5890:2: ( ( rule__ProxyFlag__ProtocolAlternatives_2_0_0_0 ) )
            // InternalCurlBetterThanHttpie.g:5891:3: ( rule__ProxyFlag__ProtocolAlternatives_2_0_0_0 )
            {
             before(grammarAccess.getProxyFlagAccess().getProtocolAlternatives_2_0_0_0()); 
            // InternalCurlBetterThanHttpie.g:5892:3: ( rule__ProxyFlag__ProtocolAlternatives_2_0_0_0 )
            // InternalCurlBetterThanHttpie.g:5892:4: rule__ProxyFlag__ProtocolAlternatives_2_0_0_0
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
    // InternalCurlBetterThanHttpie.g:5900:1: rule__ProxyFlag__ProxyProtocolAssignment_2_1_0 : ( ( rule__ProxyFlag__ProxyProtocolAlternatives_2_1_0_0 ) ) ;
    public final void rule__ProxyFlag__ProxyProtocolAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5904:1: ( ( ( rule__ProxyFlag__ProxyProtocolAlternatives_2_1_0_0 ) ) )
            // InternalCurlBetterThanHttpie.g:5905:2: ( ( rule__ProxyFlag__ProxyProtocolAlternatives_2_1_0_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:5905:2: ( ( rule__ProxyFlag__ProxyProtocolAlternatives_2_1_0_0 ) )
            // InternalCurlBetterThanHttpie.g:5906:3: ( rule__ProxyFlag__ProxyProtocolAlternatives_2_1_0_0 )
            {
             before(grammarAccess.getProxyFlagAccess().getProxyProtocolAlternatives_2_1_0_0()); 
            // InternalCurlBetterThanHttpie.g:5907:3: ( rule__ProxyFlag__ProxyProtocolAlternatives_2_1_0_0 )
            // InternalCurlBetterThanHttpie.g:5907:4: rule__ProxyFlag__ProxyProtocolAlternatives_2_1_0_0
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
    // InternalCurlBetterThanHttpie.g:5915:1: rule__ProxyFlag__ProtocolAssignment_2_2_0 : ( ( rule__ProxyFlag__ProtocolAlternatives_2_2_0_0 ) ) ;
    public final void rule__ProxyFlag__ProtocolAssignment_2_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5919:1: ( ( ( rule__ProxyFlag__ProtocolAlternatives_2_2_0_0 ) ) )
            // InternalCurlBetterThanHttpie.g:5920:2: ( ( rule__ProxyFlag__ProtocolAlternatives_2_2_0_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:5920:2: ( ( rule__ProxyFlag__ProtocolAlternatives_2_2_0_0 ) )
            // InternalCurlBetterThanHttpie.g:5921:3: ( rule__ProxyFlag__ProtocolAlternatives_2_2_0_0 )
            {
             before(grammarAccess.getProxyFlagAccess().getProtocolAlternatives_2_2_0_0()); 
            // InternalCurlBetterThanHttpie.g:5922:3: ( rule__ProxyFlag__ProtocolAlternatives_2_2_0_0 )
            // InternalCurlBetterThanHttpie.g:5922:4: rule__ProxyFlag__ProtocolAlternatives_2_2_0_0
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
    // InternalCurlBetterThanHttpie.g:5930:1: rule__ProxyFlag__ProxyProtocolAssignment_2_2_2 : ( ( rule__ProxyFlag__ProxyProtocolAlternatives_2_2_2_0 ) ) ;
    public final void rule__ProxyFlag__ProxyProtocolAssignment_2_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5934:1: ( ( ( rule__ProxyFlag__ProxyProtocolAlternatives_2_2_2_0 ) ) )
            // InternalCurlBetterThanHttpie.g:5935:2: ( ( rule__ProxyFlag__ProxyProtocolAlternatives_2_2_2_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:5935:2: ( ( rule__ProxyFlag__ProxyProtocolAlternatives_2_2_2_0 ) )
            // InternalCurlBetterThanHttpie.g:5936:3: ( rule__ProxyFlag__ProxyProtocolAlternatives_2_2_2_0 )
            {
             before(grammarAccess.getProxyFlagAccess().getProxyProtocolAlternatives_2_2_2_0()); 
            // InternalCurlBetterThanHttpie.g:5937:3: ( rule__ProxyFlag__ProxyProtocolAlternatives_2_2_2_0 )
            // InternalCurlBetterThanHttpie.g:5937:4: rule__ProxyFlag__ProxyProtocolAlternatives_2_2_2_0
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
    // InternalCurlBetterThanHttpie.g:5945:1: rule__ProxyFlag__UsernameAssignment_3_0 : ( ( rule__ProxyFlag__UsernameAlternatives_3_0_0 ) ) ;
    public final void rule__ProxyFlag__UsernameAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5949:1: ( ( ( rule__ProxyFlag__UsernameAlternatives_3_0_0 ) ) )
            // InternalCurlBetterThanHttpie.g:5950:2: ( ( rule__ProxyFlag__UsernameAlternatives_3_0_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:5950:2: ( ( rule__ProxyFlag__UsernameAlternatives_3_0_0 ) )
            // InternalCurlBetterThanHttpie.g:5951:3: ( rule__ProxyFlag__UsernameAlternatives_3_0_0 )
            {
             before(grammarAccess.getProxyFlagAccess().getUsernameAlternatives_3_0_0()); 
            // InternalCurlBetterThanHttpie.g:5952:3: ( rule__ProxyFlag__UsernameAlternatives_3_0_0 )
            // InternalCurlBetterThanHttpie.g:5952:4: rule__ProxyFlag__UsernameAlternatives_3_0_0
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
    // InternalCurlBetterThanHttpie.g:5960:1: rule__ProxyFlag__PasswordAssignment_3_2 : ( ( rule__ProxyFlag__PasswordAlternatives_3_2_0 ) ) ;
    public final void rule__ProxyFlag__PasswordAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5964:1: ( ( ( rule__ProxyFlag__PasswordAlternatives_3_2_0 ) ) )
            // InternalCurlBetterThanHttpie.g:5965:2: ( ( rule__ProxyFlag__PasswordAlternatives_3_2_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:5965:2: ( ( rule__ProxyFlag__PasswordAlternatives_3_2_0 ) )
            // InternalCurlBetterThanHttpie.g:5966:3: ( rule__ProxyFlag__PasswordAlternatives_3_2_0 )
            {
             before(grammarAccess.getProxyFlagAccess().getPasswordAlternatives_3_2_0()); 
            // InternalCurlBetterThanHttpie.g:5967:3: ( rule__ProxyFlag__PasswordAlternatives_3_2_0 )
            // InternalCurlBetterThanHttpie.g:5967:4: rule__ProxyFlag__PasswordAlternatives_3_2_0
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
    // InternalCurlBetterThanHttpie.g:5975:1: rule__ProxyFlag__HostnameAssignment_4_0_0 : ( RULE_URL ) ;
    public final void rule__ProxyFlag__HostnameAssignment_4_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5979:1: ( ( RULE_URL ) )
            // InternalCurlBetterThanHttpie.g:5980:2: ( RULE_URL )
            {
            // InternalCurlBetterThanHttpie.g:5980:2: ( RULE_URL )
            // InternalCurlBetterThanHttpie.g:5981:3: RULE_URL
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
    // InternalCurlBetterThanHttpie.g:5990:1: rule__ProxyFlag__PortAssignment_4_0_1_1 : ( RULE_INT ) ;
    public final void rule__ProxyFlag__PortAssignment_4_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:5994:1: ( ( RULE_INT ) )
            // InternalCurlBetterThanHttpie.g:5995:2: ( RULE_INT )
            {
            // InternalCurlBetterThanHttpie.g:5995:2: ( RULE_INT )
            // InternalCurlBetterThanHttpie.g:5996:3: RULE_INT
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
    // InternalCurlBetterThanHttpie.g:6005:1: rule__ProxyFlag__PortAssignment_4_1_1 : ( RULE_INT ) ;
    public final void rule__ProxyFlag__PortAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:6009:1: ( ( RULE_INT ) )
            // InternalCurlBetterThanHttpie.g:6010:2: ( RULE_INT )
            {
            // InternalCurlBetterThanHttpie.g:6010:2: ( RULE_INT )
            // InternalCurlBetterThanHttpie.g:6011:3: RULE_INT
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
    // InternalCurlBetterThanHttpie.g:6020:1: rule__AuthFlag__UsernameAssignment_2 : ( ( rule__AuthFlag__UsernameAlternatives_2_0 ) ) ;
    public final void rule__AuthFlag__UsernameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:6024:1: ( ( ( rule__AuthFlag__UsernameAlternatives_2_0 ) ) )
            // InternalCurlBetterThanHttpie.g:6025:2: ( ( rule__AuthFlag__UsernameAlternatives_2_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:6025:2: ( ( rule__AuthFlag__UsernameAlternatives_2_0 ) )
            // InternalCurlBetterThanHttpie.g:6026:3: ( rule__AuthFlag__UsernameAlternatives_2_0 )
            {
             before(grammarAccess.getAuthFlagAccess().getUsernameAlternatives_2_0()); 
            // InternalCurlBetterThanHttpie.g:6027:3: ( rule__AuthFlag__UsernameAlternatives_2_0 )
            // InternalCurlBetterThanHttpie.g:6027:4: rule__AuthFlag__UsernameAlternatives_2_0
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
    // InternalCurlBetterThanHttpie.g:6035:1: rule__AuthFlag__PasswordAssignment_3_1 : ( ( rule__AuthFlag__PasswordAlternatives_3_1_0 ) ) ;
    public final void rule__AuthFlag__PasswordAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:6039:1: ( ( ( rule__AuthFlag__PasswordAlternatives_3_1_0 ) ) )
            // InternalCurlBetterThanHttpie.g:6040:2: ( ( rule__AuthFlag__PasswordAlternatives_3_1_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:6040:2: ( ( rule__AuthFlag__PasswordAlternatives_3_1_0 ) )
            // InternalCurlBetterThanHttpie.g:6041:3: ( rule__AuthFlag__PasswordAlternatives_3_1_0 )
            {
             before(grammarAccess.getAuthFlagAccess().getPasswordAlternatives_3_1_0()); 
            // InternalCurlBetterThanHttpie.g:6042:3: ( rule__AuthFlag__PasswordAlternatives_3_1_0 )
            // InternalCurlBetterThanHttpie.g:6042:4: rule__AuthFlag__PasswordAlternatives_3_1_0
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
    // InternalCurlBetterThanHttpie.g:6050:1: rule__AuthFlag__HostnameAssignment_4_1_0 : ( RULE_URL ) ;
    public final void rule__AuthFlag__HostnameAssignment_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:6054:1: ( ( RULE_URL ) )
            // InternalCurlBetterThanHttpie.g:6055:2: ( RULE_URL )
            {
            // InternalCurlBetterThanHttpie.g:6055:2: ( RULE_URL )
            // InternalCurlBetterThanHttpie.g:6056:3: RULE_URL
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
    // InternalCurlBetterThanHttpie.g:6065:1: rule__TimeoutFlag__TimeoutAssignment_2 : ( RULE_FLOAT ) ;
    public final void rule__TimeoutFlag__TimeoutAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:6069:1: ( ( RULE_FLOAT ) )
            // InternalCurlBetterThanHttpie.g:6070:2: ( RULE_FLOAT )
            {
            // InternalCurlBetterThanHttpie.g:6070:2: ( RULE_FLOAT )
            // InternalCurlBetterThanHttpie.g:6071:3: RULE_FLOAT
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
    // InternalCurlBetterThanHttpie.g:6080:1: rule__HttpHeaderItem__FieldAssignment_0 : ( ( rule__HttpHeaderItem__FieldAlternatives_0_0 ) ) ;
    public final void rule__HttpHeaderItem__FieldAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:6084:1: ( ( ( rule__HttpHeaderItem__FieldAlternatives_0_0 ) ) )
            // InternalCurlBetterThanHttpie.g:6085:2: ( ( rule__HttpHeaderItem__FieldAlternatives_0_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:6085:2: ( ( rule__HttpHeaderItem__FieldAlternatives_0_0 ) )
            // InternalCurlBetterThanHttpie.g:6086:3: ( rule__HttpHeaderItem__FieldAlternatives_0_0 )
            {
             before(grammarAccess.getHttpHeaderItemAccess().getFieldAlternatives_0_0()); 
            // InternalCurlBetterThanHttpie.g:6087:3: ( rule__HttpHeaderItem__FieldAlternatives_0_0 )
            // InternalCurlBetterThanHttpie.g:6087:4: rule__HttpHeaderItem__FieldAlternatives_0_0
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
    // InternalCurlBetterThanHttpie.g:6095:1: rule__HttpHeaderItem__ValueAssignment_2 : ( ( rule__HttpHeaderItem__ValueAlternatives_2_0 ) ) ;
    public final void rule__HttpHeaderItem__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:6099:1: ( ( ( rule__HttpHeaderItem__ValueAlternatives_2_0 ) ) )
            // InternalCurlBetterThanHttpie.g:6100:2: ( ( rule__HttpHeaderItem__ValueAlternatives_2_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:6100:2: ( ( rule__HttpHeaderItem__ValueAlternatives_2_0 ) )
            // InternalCurlBetterThanHttpie.g:6101:3: ( rule__HttpHeaderItem__ValueAlternatives_2_0 )
            {
             before(grammarAccess.getHttpHeaderItemAccess().getValueAlternatives_2_0()); 
            // InternalCurlBetterThanHttpie.g:6102:3: ( rule__HttpHeaderItem__ValueAlternatives_2_0 )
            // InternalCurlBetterThanHttpie.g:6102:4: rule__HttpHeaderItem__ValueAlternatives_2_0
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
    // InternalCurlBetterThanHttpie.g:6110:1: rule__FormFileFieldItem__FieldAssignment_0 : ( ( rule__FormFileFieldItem__FieldAlternatives_0_0 ) ) ;
    public final void rule__FormFileFieldItem__FieldAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:6114:1: ( ( ( rule__FormFileFieldItem__FieldAlternatives_0_0 ) ) )
            // InternalCurlBetterThanHttpie.g:6115:2: ( ( rule__FormFileFieldItem__FieldAlternatives_0_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:6115:2: ( ( rule__FormFileFieldItem__FieldAlternatives_0_0 ) )
            // InternalCurlBetterThanHttpie.g:6116:3: ( rule__FormFileFieldItem__FieldAlternatives_0_0 )
            {
             before(grammarAccess.getFormFileFieldItemAccess().getFieldAlternatives_0_0()); 
            // InternalCurlBetterThanHttpie.g:6117:3: ( rule__FormFileFieldItem__FieldAlternatives_0_0 )
            // InternalCurlBetterThanHttpie.g:6117:4: rule__FormFileFieldItem__FieldAlternatives_0_0
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
    // InternalCurlBetterThanHttpie.g:6125:1: rule__FormFileFieldItem__ValueAssignment_2 : ( ( rule__FormFileFieldItem__ValueAlternatives_2_0 ) ) ;
    public final void rule__FormFileFieldItem__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:6129:1: ( ( ( rule__FormFileFieldItem__ValueAlternatives_2_0 ) ) )
            // InternalCurlBetterThanHttpie.g:6130:2: ( ( rule__FormFileFieldItem__ValueAlternatives_2_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:6130:2: ( ( rule__FormFileFieldItem__ValueAlternatives_2_0 ) )
            // InternalCurlBetterThanHttpie.g:6131:3: ( rule__FormFileFieldItem__ValueAlternatives_2_0 )
            {
             before(grammarAccess.getFormFileFieldItemAccess().getValueAlternatives_2_0()); 
            // InternalCurlBetterThanHttpie.g:6132:3: ( rule__FormFileFieldItem__ValueAlternatives_2_0 )
            // InternalCurlBetterThanHttpie.g:6132:4: rule__FormFileFieldItem__ValueAlternatives_2_0
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
    // InternalCurlBetterThanHttpie.g:6140:1: rule__DataFieldItem__FieldAssignment_0 : ( ( rule__DataFieldItem__FieldAlternatives_0_0 ) ) ;
    public final void rule__DataFieldItem__FieldAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:6144:1: ( ( ( rule__DataFieldItem__FieldAlternatives_0_0 ) ) )
            // InternalCurlBetterThanHttpie.g:6145:2: ( ( rule__DataFieldItem__FieldAlternatives_0_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:6145:2: ( ( rule__DataFieldItem__FieldAlternatives_0_0 ) )
            // InternalCurlBetterThanHttpie.g:6146:3: ( rule__DataFieldItem__FieldAlternatives_0_0 )
            {
             before(grammarAccess.getDataFieldItemAccess().getFieldAlternatives_0_0()); 
            // InternalCurlBetterThanHttpie.g:6147:3: ( rule__DataFieldItem__FieldAlternatives_0_0 )
            // InternalCurlBetterThanHttpie.g:6147:4: rule__DataFieldItem__FieldAlternatives_0_0
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
    // InternalCurlBetterThanHttpie.g:6155:1: rule__DataFieldItem__ValueAssignment_2_0 : ( ( rule__DataFieldItem__ValueAlternatives_2_0_0 ) ) ;
    public final void rule__DataFieldItem__ValueAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:6159:1: ( ( ( rule__DataFieldItem__ValueAlternatives_2_0_0 ) ) )
            // InternalCurlBetterThanHttpie.g:6160:2: ( ( rule__DataFieldItem__ValueAlternatives_2_0_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:6160:2: ( ( rule__DataFieldItem__ValueAlternatives_2_0_0 ) )
            // InternalCurlBetterThanHttpie.g:6161:3: ( rule__DataFieldItem__ValueAlternatives_2_0_0 )
            {
             before(grammarAccess.getDataFieldItemAccess().getValueAlternatives_2_0_0()); 
            // InternalCurlBetterThanHttpie.g:6162:3: ( rule__DataFieldItem__ValueAlternatives_2_0_0 )
            // InternalCurlBetterThanHttpie.g:6162:4: rule__DataFieldItem__ValueAlternatives_2_0_0
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
    // InternalCurlBetterThanHttpie.g:6170:1: rule__DataFieldItem__ValueAssignment_2_1_1 : ( RULE_URL ) ;
    public final void rule__DataFieldItem__ValueAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:6174:1: ( ( RULE_URL ) )
            // InternalCurlBetterThanHttpie.g:6175:2: ( RULE_URL )
            {
            // InternalCurlBetterThanHttpie.g:6175:2: ( RULE_URL )
            // InternalCurlBetterThanHttpie.g:6176:3: RULE_URL
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
    // InternalCurlBetterThanHttpie.g:6185:1: rule__UrlParameterItem__FieldAssignment_0 : ( ( rule__UrlParameterItem__FieldAlternatives_0_0 ) ) ;
    public final void rule__UrlParameterItem__FieldAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:6189:1: ( ( ( rule__UrlParameterItem__FieldAlternatives_0_0 ) ) )
            // InternalCurlBetterThanHttpie.g:6190:2: ( ( rule__UrlParameterItem__FieldAlternatives_0_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:6190:2: ( ( rule__UrlParameterItem__FieldAlternatives_0_0 ) )
            // InternalCurlBetterThanHttpie.g:6191:3: ( rule__UrlParameterItem__FieldAlternatives_0_0 )
            {
             before(grammarAccess.getUrlParameterItemAccess().getFieldAlternatives_0_0()); 
            // InternalCurlBetterThanHttpie.g:6192:3: ( rule__UrlParameterItem__FieldAlternatives_0_0 )
            // InternalCurlBetterThanHttpie.g:6192:4: rule__UrlParameterItem__FieldAlternatives_0_0
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
    // InternalCurlBetterThanHttpie.g:6200:1: rule__UrlParameterItem__ValueAssignment_2 : ( ( rule__UrlParameterItem__ValueAlternatives_2_0 ) ) ;
    public final void rule__UrlParameterItem__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:6204:1: ( ( ( rule__UrlParameterItem__ValueAlternatives_2_0 ) ) )
            // InternalCurlBetterThanHttpie.g:6205:2: ( ( rule__UrlParameterItem__ValueAlternatives_2_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:6205:2: ( ( rule__UrlParameterItem__ValueAlternatives_2_0 ) )
            // InternalCurlBetterThanHttpie.g:6206:3: ( rule__UrlParameterItem__ValueAlternatives_2_0 )
            {
             before(grammarAccess.getUrlParameterItemAccess().getValueAlternatives_2_0()); 
            // InternalCurlBetterThanHttpie.g:6207:3: ( rule__UrlParameterItem__ValueAlternatives_2_0 )
            // InternalCurlBetterThanHttpie.g:6207:4: rule__UrlParameterItem__ValueAlternatives_2_0
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
    // InternalCurlBetterThanHttpie.g:6215:1: rule__RawJsonFieldItem__FieldAssignment_0 : ( ( rule__RawJsonFieldItem__FieldAlternatives_0_0 ) ) ;
    public final void rule__RawJsonFieldItem__FieldAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:6219:1: ( ( ( rule__RawJsonFieldItem__FieldAlternatives_0_0 ) ) )
            // InternalCurlBetterThanHttpie.g:6220:2: ( ( rule__RawJsonFieldItem__FieldAlternatives_0_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:6220:2: ( ( rule__RawJsonFieldItem__FieldAlternatives_0_0 ) )
            // InternalCurlBetterThanHttpie.g:6221:3: ( rule__RawJsonFieldItem__FieldAlternatives_0_0 )
            {
             before(grammarAccess.getRawJsonFieldItemAccess().getFieldAlternatives_0_0()); 
            // InternalCurlBetterThanHttpie.g:6222:3: ( rule__RawJsonFieldItem__FieldAlternatives_0_0 )
            // InternalCurlBetterThanHttpie.g:6222:4: rule__RawJsonFieldItem__FieldAlternatives_0_0
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
    // InternalCurlBetterThanHttpie.g:6230:1: rule__RawJsonFieldItem__ValueAssignment_2_0 : ( ruleJsonType ) ;
    public final void rule__RawJsonFieldItem__ValueAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:6234:1: ( ( ruleJsonType ) )
            // InternalCurlBetterThanHttpie.g:6235:2: ( ruleJsonType )
            {
            // InternalCurlBetterThanHttpie.g:6235:2: ( ruleJsonType )
            // InternalCurlBetterThanHttpie.g:6236:3: ruleJsonType
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
    // InternalCurlBetterThanHttpie.g:6245:1: rule__RawJsonFieldItem__ValueAssignment_2_1_1 : ( ruleJsonString ) ;
    public final void rule__RawJsonFieldItem__ValueAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:6249:1: ( ( ruleJsonString ) )
            // InternalCurlBetterThanHttpie.g:6250:2: ( ruleJsonString )
            {
            // InternalCurlBetterThanHttpie.g:6250:2: ( ruleJsonString )
            // InternalCurlBetterThanHttpie.g:6251:3: ruleJsonString
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


    // $ANTLR start "rule__Member__KeyAssignment_0_0_1"
    // InternalCurlBetterThanHttpie.g:6260:1: rule__Member__KeyAssignment_0_0_1 : ( ( rule__Member__KeyAlternatives_0_0_1_0 ) ) ;
    public final void rule__Member__KeyAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:6264:1: ( ( ( rule__Member__KeyAlternatives_0_0_1_0 ) ) )
            // InternalCurlBetterThanHttpie.g:6265:2: ( ( rule__Member__KeyAlternatives_0_0_1_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:6265:2: ( ( rule__Member__KeyAlternatives_0_0_1_0 ) )
            // InternalCurlBetterThanHttpie.g:6266:3: ( rule__Member__KeyAlternatives_0_0_1_0 )
            {
             before(grammarAccess.getMemberAccess().getKeyAlternatives_0_0_1_0()); 
            // InternalCurlBetterThanHttpie.g:6267:3: ( rule__Member__KeyAlternatives_0_0_1_0 )
            // InternalCurlBetterThanHttpie.g:6267:4: rule__Member__KeyAlternatives_0_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Member__KeyAlternatives_0_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMemberAccess().getKeyAlternatives_0_0_1_0()); 

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
    // $ANTLR end "rule__Member__KeyAssignment_0_0_1"


    // $ANTLR start "rule__Member__KeyAssignment_0_1_1"
    // InternalCurlBetterThanHttpie.g:6275:1: rule__Member__KeyAssignment_0_1_1 : ( ( rule__Member__KeyAlternatives_0_1_1_0 ) ) ;
    public final void rule__Member__KeyAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:6279:1: ( ( ( rule__Member__KeyAlternatives_0_1_1_0 ) ) )
            // InternalCurlBetterThanHttpie.g:6280:2: ( ( rule__Member__KeyAlternatives_0_1_1_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:6280:2: ( ( rule__Member__KeyAlternatives_0_1_1_0 ) )
            // InternalCurlBetterThanHttpie.g:6281:3: ( rule__Member__KeyAlternatives_0_1_1_0 )
            {
             before(grammarAccess.getMemberAccess().getKeyAlternatives_0_1_1_0()); 
            // InternalCurlBetterThanHttpie.g:6282:3: ( rule__Member__KeyAlternatives_0_1_1_0 )
            // InternalCurlBetterThanHttpie.g:6282:4: rule__Member__KeyAlternatives_0_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Member__KeyAlternatives_0_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMemberAccess().getKeyAlternatives_0_1_1_0()); 

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
    // $ANTLR end "rule__Member__KeyAssignment_0_1_1"


    // $ANTLR start "rule__Member__KeyAssignment_0_2"
    // InternalCurlBetterThanHttpie.g:6290:1: rule__Member__KeyAssignment_0_2 : ( ( rule__Member__KeyAlternatives_0_2_0 ) ) ;
    public final void rule__Member__KeyAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:6294:1: ( ( ( rule__Member__KeyAlternatives_0_2_0 ) ) )
            // InternalCurlBetterThanHttpie.g:6295:2: ( ( rule__Member__KeyAlternatives_0_2_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:6295:2: ( ( rule__Member__KeyAlternatives_0_2_0 ) )
            // InternalCurlBetterThanHttpie.g:6296:3: ( rule__Member__KeyAlternatives_0_2_0 )
            {
             before(grammarAccess.getMemberAccess().getKeyAlternatives_0_2_0()); 
            // InternalCurlBetterThanHttpie.g:6297:3: ( rule__Member__KeyAlternatives_0_2_0 )
            // InternalCurlBetterThanHttpie.g:6297:4: rule__Member__KeyAlternatives_0_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Member__KeyAlternatives_0_2_0();

            state._fsp--;


            }

             after(grammarAccess.getMemberAccess().getKeyAlternatives_0_2_0()); 

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
    // $ANTLR end "rule__Member__KeyAssignment_0_2"


    // $ANTLR start "rule__Member__ValueAssignment_4"
    // InternalCurlBetterThanHttpie.g:6305:1: rule__Member__ValueAssignment_4 : ( ruleJsonType ) ;
    public final void rule__Member__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:6309:1: ( ( ruleJsonType ) )
            // InternalCurlBetterThanHttpie.g:6310:2: ( ruleJsonType )
            {
            // InternalCurlBetterThanHttpie.g:6310:2: ( ruleJsonType )
            // InternalCurlBetterThanHttpie.g:6311:3: ruleJsonType
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
    // InternalCurlBetterThanHttpie.g:6320:1: rule__JsonObject__MembersAssignment_2_0_1 : ( ruleMember ) ;
    public final void rule__JsonObject__MembersAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:6324:1: ( ( ruleMember ) )
            // InternalCurlBetterThanHttpie.g:6325:2: ( ruleMember )
            {
            // InternalCurlBetterThanHttpie.g:6325:2: ( ruleMember )
            // InternalCurlBetterThanHttpie.g:6326:3: ruleMember
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
    // InternalCurlBetterThanHttpie.g:6335:1: rule__JsonObject__MembersAssignment_2_1_3 : ( ruleMember ) ;
    public final void rule__JsonObject__MembersAssignment_2_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:6339:1: ( ( ruleMember ) )
            // InternalCurlBetterThanHttpie.g:6340:2: ( ruleMember )
            {
            // InternalCurlBetterThanHttpie.g:6340:2: ( ruleMember )
            // InternalCurlBetterThanHttpie.g:6341:3: ruleMember
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


    // $ANTLR start "rule__JsonString__ValueAssignment_0_1"
    // InternalCurlBetterThanHttpie.g:6350:1: rule__JsonString__ValueAssignment_0_1 : ( ( rule__JsonString__ValueAlternatives_0_1_0 ) ) ;
    public final void rule__JsonString__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:6354:1: ( ( ( rule__JsonString__ValueAlternatives_0_1_0 ) ) )
            // InternalCurlBetterThanHttpie.g:6355:2: ( ( rule__JsonString__ValueAlternatives_0_1_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:6355:2: ( ( rule__JsonString__ValueAlternatives_0_1_0 ) )
            // InternalCurlBetterThanHttpie.g:6356:3: ( rule__JsonString__ValueAlternatives_0_1_0 )
            {
             before(grammarAccess.getJsonStringAccess().getValueAlternatives_0_1_0()); 
            // InternalCurlBetterThanHttpie.g:6357:3: ( rule__JsonString__ValueAlternatives_0_1_0 )
            // InternalCurlBetterThanHttpie.g:6357:4: rule__JsonString__ValueAlternatives_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__JsonString__ValueAlternatives_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getJsonStringAccess().getValueAlternatives_0_1_0()); 

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
    // $ANTLR end "rule__JsonString__ValueAssignment_0_1"


    // $ANTLR start "rule__JsonString__ValueAssignment_1_1"
    // InternalCurlBetterThanHttpie.g:6365:1: rule__JsonString__ValueAssignment_1_1 : ( ( rule__JsonString__ValueAlternatives_1_1_0 ) ) ;
    public final void rule__JsonString__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:6369:1: ( ( ( rule__JsonString__ValueAlternatives_1_1_0 ) ) )
            // InternalCurlBetterThanHttpie.g:6370:2: ( ( rule__JsonString__ValueAlternatives_1_1_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:6370:2: ( ( rule__JsonString__ValueAlternatives_1_1_0 ) )
            // InternalCurlBetterThanHttpie.g:6371:3: ( rule__JsonString__ValueAlternatives_1_1_0 )
            {
             before(grammarAccess.getJsonStringAccess().getValueAlternatives_1_1_0()); 
            // InternalCurlBetterThanHttpie.g:6372:3: ( rule__JsonString__ValueAlternatives_1_1_0 )
            // InternalCurlBetterThanHttpie.g:6372:4: rule__JsonString__ValueAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__JsonString__ValueAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getJsonStringAccess().getValueAlternatives_1_1_0()); 

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
    // $ANTLR end "rule__JsonString__ValueAssignment_1_1"


    // $ANTLR start "rule__JsonString__ValueAssignment_2"
    // InternalCurlBetterThanHttpie.g:6380:1: rule__JsonString__ValueAssignment_2 : ( ( rule__JsonString__ValueAlternatives_2_0 ) ) ;
    public final void rule__JsonString__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:6384:1: ( ( ( rule__JsonString__ValueAlternatives_2_0 ) ) )
            // InternalCurlBetterThanHttpie.g:6385:2: ( ( rule__JsonString__ValueAlternatives_2_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:6385:2: ( ( rule__JsonString__ValueAlternatives_2_0 ) )
            // InternalCurlBetterThanHttpie.g:6386:3: ( rule__JsonString__ValueAlternatives_2_0 )
            {
             before(grammarAccess.getJsonStringAccess().getValueAlternatives_2_0()); 
            // InternalCurlBetterThanHttpie.g:6387:3: ( rule__JsonString__ValueAlternatives_2_0 )
            // InternalCurlBetterThanHttpie.g:6387:4: rule__JsonString__ValueAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__JsonString__ValueAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getJsonStringAccess().getValueAlternatives_2_0()); 

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
    // $ANTLR end "rule__JsonString__ValueAssignment_2"


    // $ANTLR start "rule__JsonArray__ValuesAssignment_2_0_1"
    // InternalCurlBetterThanHttpie.g:6395:1: rule__JsonArray__ValuesAssignment_2_0_1 : ( ruleJsonType ) ;
    public final void rule__JsonArray__ValuesAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:6399:1: ( ( ruleJsonType ) )
            // InternalCurlBetterThanHttpie.g:6400:2: ( ruleJsonType )
            {
            // InternalCurlBetterThanHttpie.g:6400:2: ( ruleJsonType )
            // InternalCurlBetterThanHttpie.g:6401:3: ruleJsonType
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
    // InternalCurlBetterThanHttpie.g:6410:1: rule__JsonArray__ValuesAssignment_2_1_3 : ( ruleJsonType ) ;
    public final void rule__JsonArray__ValuesAssignment_2_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:6414:1: ( ( ruleJsonType ) )
            // InternalCurlBetterThanHttpie.g:6415:2: ( ruleJsonType )
            {
            // InternalCurlBetterThanHttpie.g:6415:2: ( ruleJsonType )
            // InternalCurlBetterThanHttpie.g:6416:3: ruleJsonType
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
    // InternalCurlBetterThanHttpie.g:6425:1: rule__JsonBoolean__ValueAssignment : ( RULE_BOOLEAN ) ;
    public final void rule__JsonBoolean__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:6429:1: ( ( RULE_BOOLEAN ) )
            // InternalCurlBetterThanHttpie.g:6430:2: ( RULE_BOOLEAN )
            {
            // InternalCurlBetterThanHttpie.g:6430:2: ( RULE_BOOLEAN )
            // InternalCurlBetterThanHttpie.g:6431:3: RULE_BOOLEAN
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
    // InternalCurlBetterThanHttpie.g:6440:1: rule__JsonNumber__ValueAssignment : ( RULE_FLOAT ) ;
    public final void rule__JsonNumber__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:6444:1: ( ( RULE_FLOAT ) )
            // InternalCurlBetterThanHttpie.g:6445:2: ( RULE_FLOAT )
            {
            // InternalCurlBetterThanHttpie.g:6445:2: ( RULE_FLOAT )
            // InternalCurlBetterThanHttpie.g:6446:3: RULE_FLOAT
            {
             before(grammarAccess.getJsonNumberAccess().getValueFLOATTerminalRuleCall_0()); 
            match(input,RULE_FLOAT,FOLLOW_2); 
             after(grammarAccess.getJsonNumberAccess().getValueFLOATTerminalRuleCall_0()); 

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
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000002000130L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000002000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000680FDBFC000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000F00000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000010002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000100L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000010000000030L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0004E10000000CB0L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000600000000030L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0004E00000000CF0L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0001600000000070L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0002000000000040L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0002000000000042L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000600000000070L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x000CE00000000CF0L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000080L});

}