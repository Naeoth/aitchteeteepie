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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WS", "RULE_VALUE", "RULE_BOOLEAN", "RULE_STRING", "RULE_INT", "RULE_FLOAT", "RULE_DIGIT", "'--header'", "'-t'", "'--body'", "'-b'", "'--json'", "'-j'", "'--form'", "'f'", "'--auth'", "'-a'", "'--download'", "'-d'", "'--help'", "'-h'", "'--verbose'", "'-v'", "'\\''", "'\"'", "'GET'", "'POST'", "'PUT'", "'DELETE'", "'http'", "'://'", "':'", "'/'", "'--'", "'--proxy'", "'a'", "'@'", "'--version'", "'--timeout'", "'='", "'=='", "'{'", "'}'"
    };
    public static final int RULE_BOOLEAN=6;
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
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=7;
    public static final int RULE_VALUE=5;
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
    public static final int RULE_FLOAT=9;
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


    // $ANTLR start "entryRuleFormFileFieldItem"
    // InternalCurlBetterThanHttpie.g:403:1: entryRuleFormFileFieldItem : ruleFormFileFieldItem EOF ;
    public final void entryRuleFormFileFieldItem() throws RecognitionException {
        try {
            // InternalCurlBetterThanHttpie.g:404:1: ( ruleFormFileFieldItem EOF )
            // InternalCurlBetterThanHttpie.g:405:1: ruleFormFileFieldItem EOF
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
    // InternalCurlBetterThanHttpie.g:412:1: ruleFormFileFieldItem : ( ( rule__FormFileFieldItem__Group__0 ) ) ;
    public final void ruleFormFileFieldItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:416:2: ( ( ( rule__FormFileFieldItem__Group__0 ) ) )
            // InternalCurlBetterThanHttpie.g:417:2: ( ( rule__FormFileFieldItem__Group__0 ) )
            {
            // InternalCurlBetterThanHttpie.g:417:2: ( ( rule__FormFileFieldItem__Group__0 ) )
            // InternalCurlBetterThanHttpie.g:418:3: ( rule__FormFileFieldItem__Group__0 )
            {
             before(grammarAccess.getFormFileFieldItemAccess().getGroup()); 
            // InternalCurlBetterThanHttpie.g:419:3: ( rule__FormFileFieldItem__Group__0 )
            // InternalCurlBetterThanHttpie.g:419:4: rule__FormFileFieldItem__Group__0
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
    // InternalCurlBetterThanHttpie.g:428:1: entryRuleDataFieldItem : ruleDataFieldItem EOF ;
    public final void entryRuleDataFieldItem() throws RecognitionException {
        try {
            // InternalCurlBetterThanHttpie.g:429:1: ( ruleDataFieldItem EOF )
            // InternalCurlBetterThanHttpie.g:430:1: ruleDataFieldItem EOF
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
    // InternalCurlBetterThanHttpie.g:437:1: ruleDataFieldItem : ( ( rule__DataFieldItem__Group__0 ) ) ;
    public final void ruleDataFieldItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:441:2: ( ( ( rule__DataFieldItem__Group__0 ) ) )
            // InternalCurlBetterThanHttpie.g:442:2: ( ( rule__DataFieldItem__Group__0 ) )
            {
            // InternalCurlBetterThanHttpie.g:442:2: ( ( rule__DataFieldItem__Group__0 ) )
            // InternalCurlBetterThanHttpie.g:443:3: ( rule__DataFieldItem__Group__0 )
            {
             before(grammarAccess.getDataFieldItemAccess().getGroup()); 
            // InternalCurlBetterThanHttpie.g:444:3: ( rule__DataFieldItem__Group__0 )
            // InternalCurlBetterThanHttpie.g:444:4: rule__DataFieldItem__Group__0
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


    // $ANTLR start "entryRuleHttpHeaderItem"
    // InternalCurlBetterThanHttpie.g:453:1: entryRuleHttpHeaderItem : ruleHttpHeaderItem EOF ;
    public final void entryRuleHttpHeaderItem() throws RecognitionException {
        try {
            // InternalCurlBetterThanHttpie.g:454:1: ( ruleHttpHeaderItem EOF )
            // InternalCurlBetterThanHttpie.g:455:1: ruleHttpHeaderItem EOF
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
    // InternalCurlBetterThanHttpie.g:462:1: ruleHttpHeaderItem : ( ( rule__HttpHeaderItem__Group__0 ) ) ;
    public final void ruleHttpHeaderItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:466:2: ( ( ( rule__HttpHeaderItem__Group__0 ) ) )
            // InternalCurlBetterThanHttpie.g:467:2: ( ( rule__HttpHeaderItem__Group__0 ) )
            {
            // InternalCurlBetterThanHttpie.g:467:2: ( ( rule__HttpHeaderItem__Group__0 ) )
            // InternalCurlBetterThanHttpie.g:468:3: ( rule__HttpHeaderItem__Group__0 )
            {
             before(grammarAccess.getHttpHeaderItemAccess().getGroup()); 
            // InternalCurlBetterThanHttpie.g:469:3: ( rule__HttpHeaderItem__Group__0 )
            // InternalCurlBetterThanHttpie.g:469:4: rule__HttpHeaderItem__Group__0
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
    // InternalCurlBetterThanHttpie.g:512:1: ruleRawJsonFieldItem : ( () ) ;
    public final void ruleRawJsonFieldItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:516:2: ( ( () ) )
            // InternalCurlBetterThanHttpie.g:517:2: ( () )
            {
            // InternalCurlBetterThanHttpie.g:517:2: ( () )
            // InternalCurlBetterThanHttpie.g:518:3: ()
            {
             before(grammarAccess.getRawJsonFieldItemAccess().getRawJsonFieldItemAction()); 
            // InternalCurlBetterThanHttpie.g:519:3: ()
            // InternalCurlBetterThanHttpie.g:519:4: 
            {
            }

             after(grammarAccess.getRawJsonFieldItemAccess().getRawJsonFieldItemAction()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRawJsonFieldItem"


    // $ANTLR start "entryRuleJsonBoolean"
    // InternalCurlBetterThanHttpie.g:528:1: entryRuleJsonBoolean : ruleJsonBoolean EOF ;
    public final void entryRuleJsonBoolean() throws RecognitionException {
        try {
            // InternalCurlBetterThanHttpie.g:529:1: ( ruleJsonBoolean EOF )
            // InternalCurlBetterThanHttpie.g:530:1: ruleJsonBoolean EOF
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
    // InternalCurlBetterThanHttpie.g:537:1: ruleJsonBoolean : ( ( rule__JsonBoolean__Group__0 ) ) ;
    public final void ruleJsonBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:541:2: ( ( ( rule__JsonBoolean__Group__0 ) ) )
            // InternalCurlBetterThanHttpie.g:542:2: ( ( rule__JsonBoolean__Group__0 ) )
            {
            // InternalCurlBetterThanHttpie.g:542:2: ( ( rule__JsonBoolean__Group__0 ) )
            // InternalCurlBetterThanHttpie.g:543:3: ( rule__JsonBoolean__Group__0 )
            {
             before(grammarAccess.getJsonBooleanAccess().getGroup()); 
            // InternalCurlBetterThanHttpie.g:544:3: ( rule__JsonBoolean__Group__0 )
            // InternalCurlBetterThanHttpie.g:544:4: rule__JsonBoolean__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__JsonBoolean__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJsonBooleanAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleJsonObject"
    // InternalCurlBetterThanHttpie.g:553:1: entryRuleJsonObject : ruleJsonObject EOF ;
    public final void entryRuleJsonObject() throws RecognitionException {
        try {
            // InternalCurlBetterThanHttpie.g:554:1: ( ruleJsonObject EOF )
            // InternalCurlBetterThanHttpie.g:555:1: ruleJsonObject EOF
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
    // InternalCurlBetterThanHttpie.g:562:1: ruleJsonObject : ( ( rule__JsonObject__Group__0 ) ) ;
    public final void ruleJsonObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:566:2: ( ( ( rule__JsonObject__Group__0 ) ) )
            // InternalCurlBetterThanHttpie.g:567:2: ( ( rule__JsonObject__Group__0 ) )
            {
            // InternalCurlBetterThanHttpie.g:567:2: ( ( rule__JsonObject__Group__0 ) )
            // InternalCurlBetterThanHttpie.g:568:3: ( rule__JsonObject__Group__0 )
            {
             before(grammarAccess.getJsonObjectAccess().getGroup()); 
            // InternalCurlBetterThanHttpie.g:569:3: ( rule__JsonObject__Group__0 )
            // InternalCurlBetterThanHttpie.g:569:4: rule__JsonObject__Group__0
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


    // $ANTLR start "entryRuleJsonArray"
    // InternalCurlBetterThanHttpie.g:578:1: entryRuleJsonArray : ruleJsonArray EOF ;
    public final void entryRuleJsonArray() throws RecognitionException {
        try {
            // InternalCurlBetterThanHttpie.g:579:1: ( ruleJsonArray EOF )
            // InternalCurlBetterThanHttpie.g:580:1: ruleJsonArray EOF
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
    // InternalCurlBetterThanHttpie.g:587:1: ruleJsonArray : ( () ) ;
    public final void ruleJsonArray() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:591:2: ( ( () ) )
            // InternalCurlBetterThanHttpie.g:592:2: ( () )
            {
            // InternalCurlBetterThanHttpie.g:592:2: ( () )
            // InternalCurlBetterThanHttpie.g:593:3: ()
            {
             before(grammarAccess.getJsonArrayAccess().getJsonArrayAction()); 
            // InternalCurlBetterThanHttpie.g:594:3: ()
            // InternalCurlBetterThanHttpie.g:594:4: 
            {
            }

             after(grammarAccess.getJsonArrayAccess().getJsonArrayAction()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJsonArray"


    // $ANTLR start "entryRuleJsonNumber"
    // InternalCurlBetterThanHttpie.g:603:1: entryRuleJsonNumber : ruleJsonNumber EOF ;
    public final void entryRuleJsonNumber() throws RecognitionException {
        try {
            // InternalCurlBetterThanHttpie.g:604:1: ( ruleJsonNumber EOF )
            // InternalCurlBetterThanHttpie.g:605:1: ruleJsonNumber EOF
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
    // InternalCurlBetterThanHttpie.g:612:1: ruleJsonNumber : ( () ) ;
    public final void ruleJsonNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:616:2: ( ( () ) )
            // InternalCurlBetterThanHttpie.g:617:2: ( () )
            {
            // InternalCurlBetterThanHttpie.g:617:2: ( () )
            // InternalCurlBetterThanHttpie.g:618:3: ()
            {
             before(grammarAccess.getJsonNumberAccess().getJsonNumberAction()); 
            // InternalCurlBetterThanHttpie.g:619:3: ()
            // InternalCurlBetterThanHttpie.g:619:4: 
            {
            }

             after(grammarAccess.getJsonNumberAccess().getJsonNumberAction()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJsonNumber"


    // $ANTLR start "ruleMethod"
    // InternalCurlBetterThanHttpie.g:628:1: ruleMethod : ( ( rule__Method__Alternatives ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:632:1: ( ( ( rule__Method__Alternatives ) ) )
            // InternalCurlBetterThanHttpie.g:633:2: ( ( rule__Method__Alternatives ) )
            {
            // InternalCurlBetterThanHttpie.g:633:2: ( ( rule__Method__Alternatives ) )
            // InternalCurlBetterThanHttpie.g:634:3: ( rule__Method__Alternatives )
            {
             before(grammarAccess.getMethodAccess().getAlternatives()); 
            // InternalCurlBetterThanHttpie.g:635:3: ( rule__Method__Alternatives )
            // InternalCurlBetterThanHttpie.g:635:4: rule__Method__Alternatives
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


    // $ANTLR start "rule__CommandLineInterface__Alternatives_7"
    // InternalCurlBetterThanHttpie.g:643:1: rule__CommandLineInterface__Alternatives_7 : ( ( ( rule__CommandLineInterface__Group_7_0__0 ) ) | ( ( rule__CommandLineInterface__Group_7_1__0 ) ) );
    public final void rule__CommandLineInterface__Alternatives_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:647:1: ( ( ( rule__CommandLineInterface__Group_7_0__0 ) ) | ( ( rule__CommandLineInterface__Group_7_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==35) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:648:2: ( ( rule__CommandLineInterface__Group_7_0__0 ) )
                    {
                    // InternalCurlBetterThanHttpie.g:648:2: ( ( rule__CommandLineInterface__Group_7_0__0 ) )
                    // InternalCurlBetterThanHttpie.g:649:3: ( rule__CommandLineInterface__Group_7_0__0 )
                    {
                     before(grammarAccess.getCommandLineInterfaceAccess().getGroup_7_0()); 
                    // InternalCurlBetterThanHttpie.g:650:3: ( rule__CommandLineInterface__Group_7_0__0 )
                    // InternalCurlBetterThanHttpie.g:650:4: rule__CommandLineInterface__Group_7_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CommandLineInterface__Group_7_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCommandLineInterfaceAccess().getGroup_7_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:654:2: ( ( rule__CommandLineInterface__Group_7_1__0 ) )
                    {
                    // InternalCurlBetterThanHttpie.g:654:2: ( ( rule__CommandLineInterface__Group_7_1__0 ) )
                    // InternalCurlBetterThanHttpie.g:655:3: ( rule__CommandLineInterface__Group_7_1__0 )
                    {
                     before(grammarAccess.getCommandLineInterfaceAccess().getGroup_7_1()); 
                    // InternalCurlBetterThanHttpie.g:656:3: ( rule__CommandLineInterface__Group_7_1__0 )
                    // InternalCurlBetterThanHttpie.g:656:4: rule__CommandLineInterface__Group_7_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CommandLineInterface__Group_7_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCommandLineInterfaceAccess().getGroup_7_1()); 

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
    // $ANTLR end "rule__CommandLineInterface__Alternatives_7"


    // $ANTLR start "rule__Flag__Alternatives"
    // InternalCurlBetterThanHttpie.g:664:1: rule__Flag__Alternatives : ( ( ruleProxyFlag ) | ( ruleFormFlag ) | ( ruleAuthFlag ) | ( ruleDownloadFlag ) | ( ruleBodyFlag ) | ( ruleVersionFlag ) | ( ruleJsonFlag ) | ( ruleHelpFlag ) | ( ruleHeadersFlag ) | ( ruleVerboseFlag ) | ( ruleTimeoutFlag ) );
    public final void rule__Flag__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:668:1: ( ( ruleProxyFlag ) | ( ruleFormFlag ) | ( ruleAuthFlag ) | ( ruleDownloadFlag ) | ( ruleBodyFlag ) | ( ruleVersionFlag ) | ( ruleJsonFlag ) | ( ruleHelpFlag ) | ( ruleHeadersFlag ) | ( ruleVerboseFlag ) | ( ruleTimeoutFlag ) )
            int alt2=11;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt2=1;
                }
                break;
            case 17:
            case 18:
                {
                alt2=2;
                }
                break;
            case 19:
            case 20:
                {
                alt2=3;
                }
                break;
            case 21:
            case 22:
                {
                alt2=4;
                }
                break;
            case 13:
            case 14:
                {
                alt2=5;
                }
                break;
            case 41:
                {
                alt2=6;
                }
                break;
            case 15:
            case 16:
                {
                alt2=7;
                }
                break;
            case 23:
            case 24:
                {
                alt2=8;
                }
                break;
            case 11:
            case 12:
                {
                alt2=9;
                }
                break;
            case 25:
            case 26:
                {
                alt2=10;
                }
                break;
            case 42:
                {
                alt2=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:669:2: ( ruleProxyFlag )
                    {
                    // InternalCurlBetterThanHttpie.g:669:2: ( ruleProxyFlag )
                    // InternalCurlBetterThanHttpie.g:670:3: ruleProxyFlag
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
                    // InternalCurlBetterThanHttpie.g:675:2: ( ruleFormFlag )
                    {
                    // InternalCurlBetterThanHttpie.g:675:2: ( ruleFormFlag )
                    // InternalCurlBetterThanHttpie.g:676:3: ruleFormFlag
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
                    // InternalCurlBetterThanHttpie.g:681:2: ( ruleAuthFlag )
                    {
                    // InternalCurlBetterThanHttpie.g:681:2: ( ruleAuthFlag )
                    // InternalCurlBetterThanHttpie.g:682:3: ruleAuthFlag
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
                    // InternalCurlBetterThanHttpie.g:687:2: ( ruleDownloadFlag )
                    {
                    // InternalCurlBetterThanHttpie.g:687:2: ( ruleDownloadFlag )
                    // InternalCurlBetterThanHttpie.g:688:3: ruleDownloadFlag
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
                    // InternalCurlBetterThanHttpie.g:693:2: ( ruleBodyFlag )
                    {
                    // InternalCurlBetterThanHttpie.g:693:2: ( ruleBodyFlag )
                    // InternalCurlBetterThanHttpie.g:694:3: ruleBodyFlag
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
                    // InternalCurlBetterThanHttpie.g:699:2: ( ruleVersionFlag )
                    {
                    // InternalCurlBetterThanHttpie.g:699:2: ( ruleVersionFlag )
                    // InternalCurlBetterThanHttpie.g:700:3: ruleVersionFlag
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
                    // InternalCurlBetterThanHttpie.g:705:2: ( ruleJsonFlag )
                    {
                    // InternalCurlBetterThanHttpie.g:705:2: ( ruleJsonFlag )
                    // InternalCurlBetterThanHttpie.g:706:3: ruleJsonFlag
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
                    // InternalCurlBetterThanHttpie.g:711:2: ( ruleHelpFlag )
                    {
                    // InternalCurlBetterThanHttpie.g:711:2: ( ruleHelpFlag )
                    // InternalCurlBetterThanHttpie.g:712:3: ruleHelpFlag
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
                    // InternalCurlBetterThanHttpie.g:717:2: ( ruleHeadersFlag )
                    {
                    // InternalCurlBetterThanHttpie.g:717:2: ( ruleHeadersFlag )
                    // InternalCurlBetterThanHttpie.g:718:3: ruleHeadersFlag
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
                    // InternalCurlBetterThanHttpie.g:723:2: ( ruleVerboseFlag )
                    {
                    // InternalCurlBetterThanHttpie.g:723:2: ( ruleVerboseFlag )
                    // InternalCurlBetterThanHttpie.g:724:3: ruleVerboseFlag
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
                    // InternalCurlBetterThanHttpie.g:729:2: ( ruleTimeoutFlag )
                    {
                    // InternalCurlBetterThanHttpie.g:729:2: ( ruleTimeoutFlag )
                    // InternalCurlBetterThanHttpie.g:730:3: ruleTimeoutFlag
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
    // InternalCurlBetterThanHttpie.g:739:1: rule__HeadersFlag__Alternatives_1 : ( ( '--header' ) | ( '-t' ) );
    public final void rule__HeadersFlag__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:743:1: ( ( '--header' ) | ( '-t' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:744:2: ( '--header' )
                    {
                    // InternalCurlBetterThanHttpie.g:744:2: ( '--header' )
                    // InternalCurlBetterThanHttpie.g:745:3: '--header'
                    {
                     before(grammarAccess.getHeadersFlagAccess().getHeaderKeyword_1_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getHeadersFlagAccess().getHeaderKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:750:2: ( '-t' )
                    {
                    // InternalCurlBetterThanHttpie.g:750:2: ( '-t' )
                    // InternalCurlBetterThanHttpie.g:751:3: '-t'
                    {
                     before(grammarAccess.getHeadersFlagAccess().getTKeyword_1_1()); 
                    match(input,12,FOLLOW_2); 
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
    // InternalCurlBetterThanHttpie.g:760:1: rule__BodyFlag__Alternatives_1 : ( ( '--body' ) | ( '-b' ) );
    public final void rule__BodyFlag__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:764:1: ( ( '--body' ) | ( '-b' ) )
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
                    // InternalCurlBetterThanHttpie.g:765:2: ( '--body' )
                    {
                    // InternalCurlBetterThanHttpie.g:765:2: ( '--body' )
                    // InternalCurlBetterThanHttpie.g:766:3: '--body'
                    {
                     before(grammarAccess.getBodyFlagAccess().getBodyKeyword_1_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getBodyFlagAccess().getBodyKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:771:2: ( '-b' )
                    {
                    // InternalCurlBetterThanHttpie.g:771:2: ( '-b' )
                    // InternalCurlBetterThanHttpie.g:772:3: '-b'
                    {
                     before(grammarAccess.getBodyFlagAccess().getBKeyword_1_1()); 
                    match(input,14,FOLLOW_2); 
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
    // InternalCurlBetterThanHttpie.g:781:1: rule__JsonFlag__Alternatives_1 : ( ( '--json' ) | ( '-j' ) );
    public final void rule__JsonFlag__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:785:1: ( ( '--json' ) | ( '-j' ) )
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
                    // InternalCurlBetterThanHttpie.g:786:2: ( '--json' )
                    {
                    // InternalCurlBetterThanHttpie.g:786:2: ( '--json' )
                    // InternalCurlBetterThanHttpie.g:787:3: '--json'
                    {
                     before(grammarAccess.getJsonFlagAccess().getJsonKeyword_1_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getJsonFlagAccess().getJsonKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:792:2: ( '-j' )
                    {
                    // InternalCurlBetterThanHttpie.g:792:2: ( '-j' )
                    // InternalCurlBetterThanHttpie.g:793:3: '-j'
                    {
                     before(grammarAccess.getJsonFlagAccess().getJKeyword_1_1()); 
                    match(input,16,FOLLOW_2); 
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
    // InternalCurlBetterThanHttpie.g:802:1: rule__FormFlag__Alternatives_1 : ( ( '--form' ) | ( 'f' ) );
    public final void rule__FormFlag__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:806:1: ( ( '--form' ) | ( 'f' ) )
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
                    // InternalCurlBetterThanHttpie.g:807:2: ( '--form' )
                    {
                    // InternalCurlBetterThanHttpie.g:807:2: ( '--form' )
                    // InternalCurlBetterThanHttpie.g:808:3: '--form'
                    {
                     before(grammarAccess.getFormFlagAccess().getFormKeyword_1_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getFormFlagAccess().getFormKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:813:2: ( 'f' )
                    {
                    // InternalCurlBetterThanHttpie.g:813:2: ( 'f' )
                    // InternalCurlBetterThanHttpie.g:814:3: 'f'
                    {
                     before(grammarAccess.getFormFlagAccess().getFKeyword_1_1()); 
                    match(input,18,FOLLOW_2); 
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


    // $ANTLR start "rule__AuthFlag__Alternatives_0"
    // InternalCurlBetterThanHttpie.g:823:1: rule__AuthFlag__Alternatives_0 : ( ( '--auth' ) | ( '-a' ) );
    public final void rule__AuthFlag__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:827:1: ( ( '--auth' ) | ( '-a' ) )
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
                    // InternalCurlBetterThanHttpie.g:828:2: ( '--auth' )
                    {
                    // InternalCurlBetterThanHttpie.g:828:2: ( '--auth' )
                    // InternalCurlBetterThanHttpie.g:829:3: '--auth'
                    {
                     before(grammarAccess.getAuthFlagAccess().getAuthKeyword_0_0()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getAuthFlagAccess().getAuthKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:834:2: ( '-a' )
                    {
                    // InternalCurlBetterThanHttpie.g:834:2: ( '-a' )
                    // InternalCurlBetterThanHttpie.g:835:3: '-a'
                    {
                     before(grammarAccess.getAuthFlagAccess().getAKeyword_0_1()); 
                    match(input,20,FOLLOW_2); 
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


    // $ANTLR start "rule__DownloadFlag__Alternatives_1"
    // InternalCurlBetterThanHttpie.g:844:1: rule__DownloadFlag__Alternatives_1 : ( ( '--download' ) | ( '-d' ) );
    public final void rule__DownloadFlag__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:848:1: ( ( '--download' ) | ( '-d' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            else if ( (LA8_0==22) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:849:2: ( '--download' )
                    {
                    // InternalCurlBetterThanHttpie.g:849:2: ( '--download' )
                    // InternalCurlBetterThanHttpie.g:850:3: '--download'
                    {
                     before(grammarAccess.getDownloadFlagAccess().getDownloadKeyword_1_0()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getDownloadFlagAccess().getDownloadKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:855:2: ( '-d' )
                    {
                    // InternalCurlBetterThanHttpie.g:855:2: ( '-d' )
                    // InternalCurlBetterThanHttpie.g:856:3: '-d'
                    {
                     before(grammarAccess.getDownloadFlagAccess().getDKeyword_1_1()); 
                    match(input,22,FOLLOW_2); 
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
    // InternalCurlBetterThanHttpie.g:865:1: rule__HelpFlag__Alternatives_1 : ( ( '--help' ) | ( '-h' ) );
    public final void rule__HelpFlag__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:869:1: ( ( '--help' ) | ( '-h' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            else if ( (LA9_0==24) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:870:2: ( '--help' )
                    {
                    // InternalCurlBetterThanHttpie.g:870:2: ( '--help' )
                    // InternalCurlBetterThanHttpie.g:871:3: '--help'
                    {
                     before(grammarAccess.getHelpFlagAccess().getHelpKeyword_1_0()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getHelpFlagAccess().getHelpKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:876:2: ( '-h' )
                    {
                    // InternalCurlBetterThanHttpie.g:876:2: ( '-h' )
                    // InternalCurlBetterThanHttpie.g:877:3: '-h'
                    {
                     before(grammarAccess.getHelpFlagAccess().getHKeyword_1_1()); 
                    match(input,24,FOLLOW_2); 
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
    // InternalCurlBetterThanHttpie.g:886:1: rule__VerboseFlag__Alternatives_1 : ( ( '--verbose' ) | ( '-v' ) );
    public final void rule__VerboseFlag__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:890:1: ( ( '--verbose' ) | ( '-v' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            else if ( (LA10_0==26) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:891:2: ( '--verbose' )
                    {
                    // InternalCurlBetterThanHttpie.g:891:2: ( '--verbose' )
                    // InternalCurlBetterThanHttpie.g:892:3: '--verbose'
                    {
                     before(grammarAccess.getVerboseFlagAccess().getVerboseKeyword_1_0()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getVerboseFlagAccess().getVerboseKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:897:2: ( '-v' )
                    {
                    // InternalCurlBetterThanHttpie.g:897:2: ( '-v' )
                    // InternalCurlBetterThanHttpie.g:898:3: '-v'
                    {
                     before(grammarAccess.getVerboseFlagAccess().getVKeyword_1_1()); 
                    match(input,26,FOLLOW_2); 
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


    // $ANTLR start "rule__Item__Alternatives"
    // InternalCurlBetterThanHttpie.g:907:1: rule__Item__Alternatives : ( ( ruleFormFileFieldItem ) | ( ruleDataFieldItem ) | ( ruleHttpHeaderItem ) | ( ruleUrlParameterItem ) | ( ruleRawJsonFieldItem ) );
    public final void rule__Item__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:911:1: ( ( ruleFormFileFieldItem ) | ( ruleDataFieldItem ) | ( ruleHttpHeaderItem ) | ( ruleUrlParameterItem ) | ( ruleRawJsonFieldItem ) )
            int alt11=5;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                switch ( input.LA(2) ) {
                case 40:
                    {
                    alt11=1;
                    }
                    break;
                case 44:
                    {
                    alt11=4;
                    }
                    break;
                case 43:
                    {
                    alt11=2;
                    }
                    break;
                case 35:
                    {
                    alt11=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA11_0==EOF||LA11_0==RULE_WS) ) {
                alt11=5;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:912:2: ( ruleFormFileFieldItem )
                    {
                    // InternalCurlBetterThanHttpie.g:912:2: ( ruleFormFileFieldItem )
                    // InternalCurlBetterThanHttpie.g:913:3: ruleFormFileFieldItem
                    {
                     before(grammarAccess.getItemAccess().getFormFileFieldItemParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFormFileFieldItem();

                    state._fsp--;

                     after(grammarAccess.getItemAccess().getFormFileFieldItemParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:918:2: ( ruleDataFieldItem )
                    {
                    // InternalCurlBetterThanHttpie.g:918:2: ( ruleDataFieldItem )
                    // InternalCurlBetterThanHttpie.g:919:3: ruleDataFieldItem
                    {
                     before(grammarAccess.getItemAccess().getDataFieldItemParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDataFieldItem();

                    state._fsp--;

                     after(grammarAccess.getItemAccess().getDataFieldItemParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCurlBetterThanHttpie.g:924:2: ( ruleHttpHeaderItem )
                    {
                    // InternalCurlBetterThanHttpie.g:924:2: ( ruleHttpHeaderItem )
                    // InternalCurlBetterThanHttpie.g:925:3: ruleHttpHeaderItem
                    {
                     before(grammarAccess.getItemAccess().getHttpHeaderItemParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleHttpHeaderItem();

                    state._fsp--;

                     after(grammarAccess.getItemAccess().getHttpHeaderItemParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCurlBetterThanHttpie.g:930:2: ( ruleUrlParameterItem )
                    {
                    // InternalCurlBetterThanHttpie.g:930:2: ( ruleUrlParameterItem )
                    // InternalCurlBetterThanHttpie.g:931:3: ruleUrlParameterItem
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
                    // InternalCurlBetterThanHttpie.g:936:2: ( ruleRawJsonFieldItem )
                    {
                    // InternalCurlBetterThanHttpie.g:936:2: ( ruleRawJsonFieldItem )
                    // InternalCurlBetterThanHttpie.g:937:3: ruleRawJsonFieldItem
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


    // $ANTLR start "rule__DataFieldItem__Alternatives_2"
    // InternalCurlBetterThanHttpie.g:946:1: rule__DataFieldItem__Alternatives_2 : ( ( ( rule__DataFieldItem__ValueAssignment_2_0 ) ) | ( ( rule__DataFieldItem__Group_2_1__0 ) ) );
    public final void rule__DataFieldItem__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:950:1: ( ( ( rule__DataFieldItem__ValueAssignment_2_0 ) ) | ( ( rule__DataFieldItem__Group_2_1__0 ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            else if ( (LA12_0==40) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:951:2: ( ( rule__DataFieldItem__ValueAssignment_2_0 ) )
                    {
                    // InternalCurlBetterThanHttpie.g:951:2: ( ( rule__DataFieldItem__ValueAssignment_2_0 ) )
                    // InternalCurlBetterThanHttpie.g:952:3: ( rule__DataFieldItem__ValueAssignment_2_0 )
                    {
                     before(grammarAccess.getDataFieldItemAccess().getValueAssignment_2_0()); 
                    // InternalCurlBetterThanHttpie.g:953:3: ( rule__DataFieldItem__ValueAssignment_2_0 )
                    // InternalCurlBetterThanHttpie.g:953:4: rule__DataFieldItem__ValueAssignment_2_0
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
                    // InternalCurlBetterThanHttpie.g:957:2: ( ( rule__DataFieldItem__Group_2_1__0 ) )
                    {
                    // InternalCurlBetterThanHttpie.g:957:2: ( ( rule__DataFieldItem__Group_2_1__0 ) )
                    // InternalCurlBetterThanHttpie.g:958:3: ( rule__DataFieldItem__Group_2_1__0 )
                    {
                     before(grammarAccess.getDataFieldItemAccess().getGroup_2_1()); 
                    // InternalCurlBetterThanHttpie.g:959:3: ( rule__DataFieldItem__Group_2_1__0 )
                    // InternalCurlBetterThanHttpie.g:959:4: rule__DataFieldItem__Group_2_1__0
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


    // $ANTLR start "rule__JsonObject__Alternatives_2"
    // InternalCurlBetterThanHttpie.g:967:1: rule__JsonObject__Alternatives_2 : ( ( '\\'' ) | ( '\"' ) );
    public final void rule__JsonObject__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:971:1: ( ( '\\'' ) | ( '\"' ) )
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
                    // InternalCurlBetterThanHttpie.g:972:2: ( '\\'' )
                    {
                    // InternalCurlBetterThanHttpie.g:972:2: ( '\\'' )
                    // InternalCurlBetterThanHttpie.g:973:3: '\\''
                    {
                     before(grammarAccess.getJsonObjectAccess().getApostropheKeyword_2_0()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getJsonObjectAccess().getApostropheKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:978:2: ( '\"' )
                    {
                    // InternalCurlBetterThanHttpie.g:978:2: ( '\"' )
                    // InternalCurlBetterThanHttpie.g:979:3: '\"'
                    {
                     before(grammarAccess.getJsonObjectAccess().getQuotationMarkKeyword_2_1()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getJsonObjectAccess().getQuotationMarkKeyword_2_1()); 

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
    // $ANTLR end "rule__JsonObject__Alternatives_2"


    // $ANTLR start "rule__Method__Alternatives"
    // InternalCurlBetterThanHttpie.g:988:1: rule__Method__Alternatives : ( ( ( 'GET' ) ) | ( ( 'POST' ) ) | ( ( 'PUT' ) ) | ( ( 'DELETE' ) ) );
    public final void rule__Method__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:992:1: ( ( ( 'GET' ) ) | ( ( 'POST' ) ) | ( ( 'PUT' ) ) | ( ( 'DELETE' ) ) )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt14=1;
                }
                break;
            case 30:
                {
                alt14=2;
                }
                break;
            case 31:
                {
                alt14=3;
                }
                break;
            case 32:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:993:2: ( ( 'GET' ) )
                    {
                    // InternalCurlBetterThanHttpie.g:993:2: ( ( 'GET' ) )
                    // InternalCurlBetterThanHttpie.g:994:3: ( 'GET' )
                    {
                     before(grammarAccess.getMethodAccess().getGETEnumLiteralDeclaration_0()); 
                    // InternalCurlBetterThanHttpie.g:995:3: ( 'GET' )
                    // InternalCurlBetterThanHttpie.g:995:4: 'GET'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getMethodAccess().getGETEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:999:2: ( ( 'POST' ) )
                    {
                    // InternalCurlBetterThanHttpie.g:999:2: ( ( 'POST' ) )
                    // InternalCurlBetterThanHttpie.g:1000:3: ( 'POST' )
                    {
                     before(grammarAccess.getMethodAccess().getPOSTEnumLiteralDeclaration_1()); 
                    // InternalCurlBetterThanHttpie.g:1001:3: ( 'POST' )
                    // InternalCurlBetterThanHttpie.g:1001:4: 'POST'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getMethodAccess().getPOSTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCurlBetterThanHttpie.g:1005:2: ( ( 'PUT' ) )
                    {
                    // InternalCurlBetterThanHttpie.g:1005:2: ( ( 'PUT' ) )
                    // InternalCurlBetterThanHttpie.g:1006:3: ( 'PUT' )
                    {
                     before(grammarAccess.getMethodAccess().getPUTEnumLiteralDeclaration_2()); 
                    // InternalCurlBetterThanHttpie.g:1007:3: ( 'PUT' )
                    // InternalCurlBetterThanHttpie.g:1007:4: 'PUT'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getMethodAccess().getPUTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCurlBetterThanHttpie.g:1011:2: ( ( 'DELETE' ) )
                    {
                    // InternalCurlBetterThanHttpie.g:1011:2: ( ( 'DELETE' ) )
                    // InternalCurlBetterThanHttpie.g:1012:3: ( 'DELETE' )
                    {
                     before(grammarAccess.getMethodAccess().getDELETEEnumLiteralDeclaration_3()); 
                    // InternalCurlBetterThanHttpie.g:1013:3: ( 'DELETE' )
                    // InternalCurlBetterThanHttpie.g:1013:4: 'DELETE'
                    {
                    match(input,32,FOLLOW_2); 

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
    // InternalCurlBetterThanHttpie.g:1021:1: rule__CommandLineInterface__Group__0 : rule__CommandLineInterface__Group__0__Impl rule__CommandLineInterface__Group__1 ;
    public final void rule__CommandLineInterface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1025:1: ( rule__CommandLineInterface__Group__0__Impl rule__CommandLineInterface__Group__1 )
            // InternalCurlBetterThanHttpie.g:1026:2: rule__CommandLineInterface__Group__0__Impl rule__CommandLineInterface__Group__1
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
    // InternalCurlBetterThanHttpie.g:1033:1: rule__CommandLineInterface__Group__0__Impl : ( () ) ;
    public final void rule__CommandLineInterface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1037:1: ( ( () ) )
            // InternalCurlBetterThanHttpie.g:1038:1: ( () )
            {
            // InternalCurlBetterThanHttpie.g:1038:1: ( () )
            // InternalCurlBetterThanHttpie.g:1039:2: ()
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getCommandLineInterfaceAction_0()); 
            // InternalCurlBetterThanHttpie.g:1040:2: ()
            // InternalCurlBetterThanHttpie.g:1040:3: 
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
    // InternalCurlBetterThanHttpie.g:1048:1: rule__CommandLineInterface__Group__1 : rule__CommandLineInterface__Group__1__Impl rule__CommandLineInterface__Group__2 ;
    public final void rule__CommandLineInterface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1052:1: ( rule__CommandLineInterface__Group__1__Impl rule__CommandLineInterface__Group__2 )
            // InternalCurlBetterThanHttpie.g:1053:2: rule__CommandLineInterface__Group__1__Impl rule__CommandLineInterface__Group__2
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
    // InternalCurlBetterThanHttpie.g:1060:1: rule__CommandLineInterface__Group__1__Impl : ( 'http' ) ;
    public final void rule__CommandLineInterface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1064:1: ( ( 'http' ) )
            // InternalCurlBetterThanHttpie.g:1065:1: ( 'http' )
            {
            // InternalCurlBetterThanHttpie.g:1065:1: ( 'http' )
            // InternalCurlBetterThanHttpie.g:1066:2: 'http'
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getHttpKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getCommandLineInterfaceAccess().getHttpKeyword_1()); 

            }


            }

        }
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
    // InternalCurlBetterThanHttpie.g:1075:1: rule__CommandLineInterface__Group__2 : rule__CommandLineInterface__Group__2__Impl rule__CommandLineInterface__Group__3 ;
    public final void rule__CommandLineInterface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1079:1: ( rule__CommandLineInterface__Group__2__Impl rule__CommandLineInterface__Group__3 )
            // InternalCurlBetterThanHttpie.g:1080:2: rule__CommandLineInterface__Group__2__Impl rule__CommandLineInterface__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalCurlBetterThanHttpie.g:1087:1: rule__CommandLineInterface__Group__2__Impl : ( RULE_WS ) ;
    public final void rule__CommandLineInterface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1091:1: ( ( RULE_WS ) )
            // InternalCurlBetterThanHttpie.g:1092:1: ( RULE_WS )
            {
            // InternalCurlBetterThanHttpie.g:1092:1: ( RULE_WS )
            // InternalCurlBetterThanHttpie.g:1093:2: RULE_WS
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getWSTerminalRuleCall_2()); 
            match(input,RULE_WS,FOLLOW_2); 
             after(grammarAccess.getCommandLineInterfaceAccess().getWSTerminalRuleCall_2()); 

            }


            }

        }
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
    // InternalCurlBetterThanHttpie.g:1102:1: rule__CommandLineInterface__Group__3 : rule__CommandLineInterface__Group__3__Impl rule__CommandLineInterface__Group__4 ;
    public final void rule__CommandLineInterface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1106:1: ( rule__CommandLineInterface__Group__3__Impl rule__CommandLineInterface__Group__4 )
            // InternalCurlBetterThanHttpie.g:1107:2: rule__CommandLineInterface__Group__3__Impl rule__CommandLineInterface__Group__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalCurlBetterThanHttpie.g:1114:1: rule__CommandLineInterface__Group__3__Impl : ( ( rule__CommandLineInterface__Group_3__0 )* ) ;
    public final void rule__CommandLineInterface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1118:1: ( ( ( rule__CommandLineInterface__Group_3__0 )* ) )
            // InternalCurlBetterThanHttpie.g:1119:1: ( ( rule__CommandLineInterface__Group_3__0 )* )
            {
            // InternalCurlBetterThanHttpie.g:1119:1: ( ( rule__CommandLineInterface__Group_3__0 )* )
            // InternalCurlBetterThanHttpie.g:1120:2: ( rule__CommandLineInterface__Group_3__0 )*
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getGroup_3()); 
            // InternalCurlBetterThanHttpie.g:1121:2: ( rule__CommandLineInterface__Group_3__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=11 && LA15_0<=26)||LA15_0==38||(LA15_0>=41 && LA15_0<=42)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalCurlBetterThanHttpie.g:1121:3: rule__CommandLineInterface__Group_3__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__CommandLineInterface__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

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
    // InternalCurlBetterThanHttpie.g:1129:1: rule__CommandLineInterface__Group__4 : rule__CommandLineInterface__Group__4__Impl rule__CommandLineInterface__Group__5 ;
    public final void rule__CommandLineInterface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1133:1: ( rule__CommandLineInterface__Group__4__Impl rule__CommandLineInterface__Group__5 )
            // InternalCurlBetterThanHttpie.g:1134:2: rule__CommandLineInterface__Group__4__Impl rule__CommandLineInterface__Group__5
            {
            pushFollow(FOLLOW_5);
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
    // InternalCurlBetterThanHttpie.g:1141:1: rule__CommandLineInterface__Group__4__Impl : ( ( rule__CommandLineInterface__MethodAssignment_4 )? ) ;
    public final void rule__CommandLineInterface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1145:1: ( ( ( rule__CommandLineInterface__MethodAssignment_4 )? ) )
            // InternalCurlBetterThanHttpie.g:1146:1: ( ( rule__CommandLineInterface__MethodAssignment_4 )? )
            {
            // InternalCurlBetterThanHttpie.g:1146:1: ( ( rule__CommandLineInterface__MethodAssignment_4 )? )
            // InternalCurlBetterThanHttpie.g:1147:2: ( rule__CommandLineInterface__MethodAssignment_4 )?
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getMethodAssignment_4()); 
            // InternalCurlBetterThanHttpie.g:1148:2: ( rule__CommandLineInterface__MethodAssignment_4 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=29 && LA16_0<=32)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1148:3: rule__CommandLineInterface__MethodAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__CommandLineInterface__MethodAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCommandLineInterfaceAccess().getMethodAssignment_4()); 

            }


            }

        }
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
    // InternalCurlBetterThanHttpie.g:1156:1: rule__CommandLineInterface__Group__5 : rule__CommandLineInterface__Group__5__Impl rule__CommandLineInterface__Group__6 ;
    public final void rule__CommandLineInterface__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1160:1: ( rule__CommandLineInterface__Group__5__Impl rule__CommandLineInterface__Group__6 )
            // InternalCurlBetterThanHttpie.g:1161:2: rule__CommandLineInterface__Group__5__Impl rule__CommandLineInterface__Group__6
            {
            pushFollow(FOLLOW_7);
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
    // InternalCurlBetterThanHttpie.g:1168:1: rule__CommandLineInterface__Group__5__Impl : ( RULE_WS ) ;
    public final void rule__CommandLineInterface__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1172:1: ( ( RULE_WS ) )
            // InternalCurlBetterThanHttpie.g:1173:1: ( RULE_WS )
            {
            // InternalCurlBetterThanHttpie.g:1173:1: ( RULE_WS )
            // InternalCurlBetterThanHttpie.g:1174:2: RULE_WS
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getWSTerminalRuleCall_5()); 
            match(input,RULE_WS,FOLLOW_2); 
             after(grammarAccess.getCommandLineInterfaceAccess().getWSTerminalRuleCall_5()); 

            }


            }

        }
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
    // InternalCurlBetterThanHttpie.g:1183:1: rule__CommandLineInterface__Group__6 : rule__CommandLineInterface__Group__6__Impl rule__CommandLineInterface__Group__7 ;
    public final void rule__CommandLineInterface__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1187:1: ( rule__CommandLineInterface__Group__6__Impl rule__CommandLineInterface__Group__7 )
            // InternalCurlBetterThanHttpie.g:1188:2: rule__CommandLineInterface__Group__6__Impl rule__CommandLineInterface__Group__7
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
    // InternalCurlBetterThanHttpie.g:1195:1: rule__CommandLineInterface__Group__6__Impl : ( ( rule__CommandLineInterface__Group_6__0 )? ) ;
    public final void rule__CommandLineInterface__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1199:1: ( ( ( rule__CommandLineInterface__Group_6__0 )? ) )
            // InternalCurlBetterThanHttpie.g:1200:1: ( ( rule__CommandLineInterface__Group_6__0 )? )
            {
            // InternalCurlBetterThanHttpie.g:1200:1: ( ( rule__CommandLineInterface__Group_6__0 )? )
            // InternalCurlBetterThanHttpie.g:1201:2: ( rule__CommandLineInterface__Group_6__0 )?
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getGroup_6()); 
            // InternalCurlBetterThanHttpie.g:1202:2: ( rule__CommandLineInterface__Group_6__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==34) ) {
                    alt17=1;
                }
            }
            switch (alt17) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1202:3: rule__CommandLineInterface__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CommandLineInterface__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCommandLineInterfaceAccess().getGroup_6()); 

            }


            }

        }
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
    // InternalCurlBetterThanHttpie.g:1210:1: rule__CommandLineInterface__Group__7 : rule__CommandLineInterface__Group__7__Impl rule__CommandLineInterface__Group__8 ;
    public final void rule__CommandLineInterface__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1214:1: ( rule__CommandLineInterface__Group__7__Impl rule__CommandLineInterface__Group__8 )
            // InternalCurlBetterThanHttpie.g:1215:2: rule__CommandLineInterface__Group__7__Impl rule__CommandLineInterface__Group__8
            {
            pushFollow(FOLLOW_8);
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
    // InternalCurlBetterThanHttpie.g:1222:1: rule__CommandLineInterface__Group__7__Impl : ( ( rule__CommandLineInterface__Alternatives_7 ) ) ;
    public final void rule__CommandLineInterface__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1226:1: ( ( ( rule__CommandLineInterface__Alternatives_7 ) ) )
            // InternalCurlBetterThanHttpie.g:1227:1: ( ( rule__CommandLineInterface__Alternatives_7 ) )
            {
            // InternalCurlBetterThanHttpie.g:1227:1: ( ( rule__CommandLineInterface__Alternatives_7 ) )
            // InternalCurlBetterThanHttpie.g:1228:2: ( rule__CommandLineInterface__Alternatives_7 )
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getAlternatives_7()); 
            // InternalCurlBetterThanHttpie.g:1229:2: ( rule__CommandLineInterface__Alternatives_7 )
            // InternalCurlBetterThanHttpie.g:1229:3: rule__CommandLineInterface__Alternatives_7
            {
            pushFollow(FOLLOW_2);
            rule__CommandLineInterface__Alternatives_7();

            state._fsp--;


            }

             after(grammarAccess.getCommandLineInterfaceAccess().getAlternatives_7()); 

            }


            }

        }
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
    // InternalCurlBetterThanHttpie.g:1237:1: rule__CommandLineInterface__Group__8 : rule__CommandLineInterface__Group__8__Impl rule__CommandLineInterface__Group__9 ;
    public final void rule__CommandLineInterface__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1241:1: ( rule__CommandLineInterface__Group__8__Impl rule__CommandLineInterface__Group__9 )
            // InternalCurlBetterThanHttpie.g:1242:2: rule__CommandLineInterface__Group__8__Impl rule__CommandLineInterface__Group__9
            {
            pushFollow(FOLLOW_8);
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
    // InternalCurlBetterThanHttpie.g:1249:1: rule__CommandLineInterface__Group__8__Impl : ( ( rule__CommandLineInterface__Group_8__0 )? ) ;
    public final void rule__CommandLineInterface__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1253:1: ( ( ( rule__CommandLineInterface__Group_8__0 )? ) )
            // InternalCurlBetterThanHttpie.g:1254:1: ( ( rule__CommandLineInterface__Group_8__0 )? )
            {
            // InternalCurlBetterThanHttpie.g:1254:1: ( ( rule__CommandLineInterface__Group_8__0 )? )
            // InternalCurlBetterThanHttpie.g:1255:2: ( rule__CommandLineInterface__Group_8__0 )?
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getGroup_8()); 
            // InternalCurlBetterThanHttpie.g:1256:2: ( rule__CommandLineInterface__Group_8__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==36) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1256:3: rule__CommandLineInterface__Group_8__0
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
    // InternalCurlBetterThanHttpie.g:1264:1: rule__CommandLineInterface__Group__9 : rule__CommandLineInterface__Group__9__Impl rule__CommandLineInterface__Group__10 ;
    public final void rule__CommandLineInterface__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1268:1: ( rule__CommandLineInterface__Group__9__Impl rule__CommandLineInterface__Group__10 )
            // InternalCurlBetterThanHttpie.g:1269:2: rule__CommandLineInterface__Group__9__Impl rule__CommandLineInterface__Group__10
            {
            pushFollow(FOLLOW_9);
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
    // InternalCurlBetterThanHttpie.g:1276:1: rule__CommandLineInterface__Group__9__Impl : ( RULE_WS ) ;
    public final void rule__CommandLineInterface__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1280:1: ( ( RULE_WS ) )
            // InternalCurlBetterThanHttpie.g:1281:1: ( RULE_WS )
            {
            // InternalCurlBetterThanHttpie.g:1281:1: ( RULE_WS )
            // InternalCurlBetterThanHttpie.g:1282:2: RULE_WS
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getWSTerminalRuleCall_9()); 
            match(input,RULE_WS,FOLLOW_2); 
             after(grammarAccess.getCommandLineInterfaceAccess().getWSTerminalRuleCall_9()); 

            }


            }

        }
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
    // InternalCurlBetterThanHttpie.g:1291:1: rule__CommandLineInterface__Group__10 : rule__CommandLineInterface__Group__10__Impl rule__CommandLineInterface__Group__11 ;
    public final void rule__CommandLineInterface__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1295:1: ( rule__CommandLineInterface__Group__10__Impl rule__CommandLineInterface__Group__11 )
            // InternalCurlBetterThanHttpie.g:1296:2: rule__CommandLineInterface__Group__10__Impl rule__CommandLineInterface__Group__11
            {
            pushFollow(FOLLOW_9);
            rule__CommandLineInterface__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandLineInterface__Group__11();

            state._fsp--;


            }

        }
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
    // InternalCurlBetterThanHttpie.g:1303:1: rule__CommandLineInterface__Group__10__Impl : ( ( rule__CommandLineInterface__Group_10__0 )? ) ;
    public final void rule__CommandLineInterface__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1307:1: ( ( ( rule__CommandLineInterface__Group_10__0 )? ) )
            // InternalCurlBetterThanHttpie.g:1308:1: ( ( rule__CommandLineInterface__Group_10__0 )? )
            {
            // InternalCurlBetterThanHttpie.g:1308:1: ( ( rule__CommandLineInterface__Group_10__0 )? )
            // InternalCurlBetterThanHttpie.g:1309:2: ( rule__CommandLineInterface__Group_10__0 )?
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getGroup_10()); 
            // InternalCurlBetterThanHttpie.g:1310:2: ( rule__CommandLineInterface__Group_10__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==37) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1310:3: rule__CommandLineInterface__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CommandLineInterface__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCommandLineInterfaceAccess().getGroup_10()); 

            }


            }

        }
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


    // $ANTLR start "rule__CommandLineInterface__Group__11"
    // InternalCurlBetterThanHttpie.g:1318:1: rule__CommandLineInterface__Group__11 : rule__CommandLineInterface__Group__11__Impl ;
    public final void rule__CommandLineInterface__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1322:1: ( rule__CommandLineInterface__Group__11__Impl )
            // InternalCurlBetterThanHttpie.g:1323:2: rule__CommandLineInterface__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CommandLineInterface__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group__11"


    // $ANTLR start "rule__CommandLineInterface__Group__11__Impl"
    // InternalCurlBetterThanHttpie.g:1329:1: rule__CommandLineInterface__Group__11__Impl : ( ( rule__CommandLineInterface__Group_11__0 )* ) ;
    public final void rule__CommandLineInterface__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1333:1: ( ( ( rule__CommandLineInterface__Group_11__0 )* ) )
            // InternalCurlBetterThanHttpie.g:1334:1: ( ( rule__CommandLineInterface__Group_11__0 )* )
            {
            // InternalCurlBetterThanHttpie.g:1334:1: ( ( rule__CommandLineInterface__Group_11__0 )* )
            // InternalCurlBetterThanHttpie.g:1335:2: ( rule__CommandLineInterface__Group_11__0 )*
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getGroup_11()); 
            // InternalCurlBetterThanHttpie.g:1336:2: ( rule__CommandLineInterface__Group_11__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_WS||LA20_0==RULE_STRING) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalCurlBetterThanHttpie.g:1336:3: rule__CommandLineInterface__Group_11__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__CommandLineInterface__Group_11__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getCommandLineInterfaceAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group__11__Impl"


    // $ANTLR start "rule__CommandLineInterface__Group_3__0"
    // InternalCurlBetterThanHttpie.g:1345:1: rule__CommandLineInterface__Group_3__0 : rule__CommandLineInterface__Group_3__0__Impl rule__CommandLineInterface__Group_3__1 ;
    public final void rule__CommandLineInterface__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1349:1: ( rule__CommandLineInterface__Group_3__0__Impl rule__CommandLineInterface__Group_3__1 )
            // InternalCurlBetterThanHttpie.g:1350:2: rule__CommandLineInterface__Group_3__0__Impl rule__CommandLineInterface__Group_3__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalCurlBetterThanHttpie.g:1357:1: rule__CommandLineInterface__Group_3__0__Impl : ( ( rule__CommandLineInterface__FlagsAssignment_3_0 ) ) ;
    public final void rule__CommandLineInterface__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1361:1: ( ( ( rule__CommandLineInterface__FlagsAssignment_3_0 ) ) )
            // InternalCurlBetterThanHttpie.g:1362:1: ( ( rule__CommandLineInterface__FlagsAssignment_3_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:1362:1: ( ( rule__CommandLineInterface__FlagsAssignment_3_0 ) )
            // InternalCurlBetterThanHttpie.g:1363:2: ( rule__CommandLineInterface__FlagsAssignment_3_0 )
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getFlagsAssignment_3_0()); 
            // InternalCurlBetterThanHttpie.g:1364:2: ( rule__CommandLineInterface__FlagsAssignment_3_0 )
            // InternalCurlBetterThanHttpie.g:1364:3: rule__CommandLineInterface__FlagsAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__CommandLineInterface__FlagsAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getCommandLineInterfaceAccess().getFlagsAssignment_3_0()); 

            }


            }

        }
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
    // InternalCurlBetterThanHttpie.g:1372:1: rule__CommandLineInterface__Group_3__1 : rule__CommandLineInterface__Group_3__1__Impl ;
    public final void rule__CommandLineInterface__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1376:1: ( rule__CommandLineInterface__Group_3__1__Impl )
            // InternalCurlBetterThanHttpie.g:1377:2: rule__CommandLineInterface__Group_3__1__Impl
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
    // InternalCurlBetterThanHttpie.g:1383:1: rule__CommandLineInterface__Group_3__1__Impl : ( RULE_WS ) ;
    public final void rule__CommandLineInterface__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1387:1: ( ( RULE_WS ) )
            // InternalCurlBetterThanHttpie.g:1388:1: ( RULE_WS )
            {
            // InternalCurlBetterThanHttpie.g:1388:1: ( RULE_WS )
            // InternalCurlBetterThanHttpie.g:1389:2: RULE_WS
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getWSTerminalRuleCall_3_1()); 
            match(input,RULE_WS,FOLLOW_2); 
             after(grammarAccess.getCommandLineInterfaceAccess().getWSTerminalRuleCall_3_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__CommandLineInterface__Group_6__0"
    // InternalCurlBetterThanHttpie.g:1399:1: rule__CommandLineInterface__Group_6__0 : rule__CommandLineInterface__Group_6__0__Impl rule__CommandLineInterface__Group_6__1 ;
    public final void rule__CommandLineInterface__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1403:1: ( rule__CommandLineInterface__Group_6__0__Impl rule__CommandLineInterface__Group_6__1 )
            // InternalCurlBetterThanHttpie.g:1404:2: rule__CommandLineInterface__Group_6__0__Impl rule__CommandLineInterface__Group_6__1
            {
            pushFollow(FOLLOW_11);
            rule__CommandLineInterface__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandLineInterface__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group_6__0"


    // $ANTLR start "rule__CommandLineInterface__Group_6__0__Impl"
    // InternalCurlBetterThanHttpie.g:1411:1: rule__CommandLineInterface__Group_6__0__Impl : ( ( rule__CommandLineInterface__ProtocolAssignment_6_0 ) ) ;
    public final void rule__CommandLineInterface__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1415:1: ( ( ( rule__CommandLineInterface__ProtocolAssignment_6_0 ) ) )
            // InternalCurlBetterThanHttpie.g:1416:1: ( ( rule__CommandLineInterface__ProtocolAssignment_6_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:1416:1: ( ( rule__CommandLineInterface__ProtocolAssignment_6_0 ) )
            // InternalCurlBetterThanHttpie.g:1417:2: ( rule__CommandLineInterface__ProtocolAssignment_6_0 )
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getProtocolAssignment_6_0()); 
            // InternalCurlBetterThanHttpie.g:1418:2: ( rule__CommandLineInterface__ProtocolAssignment_6_0 )
            // InternalCurlBetterThanHttpie.g:1418:3: rule__CommandLineInterface__ProtocolAssignment_6_0
            {
            pushFollow(FOLLOW_2);
            rule__CommandLineInterface__ProtocolAssignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getCommandLineInterfaceAccess().getProtocolAssignment_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group_6__0__Impl"


    // $ANTLR start "rule__CommandLineInterface__Group_6__1"
    // InternalCurlBetterThanHttpie.g:1426:1: rule__CommandLineInterface__Group_6__1 : rule__CommandLineInterface__Group_6__1__Impl ;
    public final void rule__CommandLineInterface__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1430:1: ( rule__CommandLineInterface__Group_6__1__Impl )
            // InternalCurlBetterThanHttpie.g:1431:2: rule__CommandLineInterface__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CommandLineInterface__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group_6__1"


    // $ANTLR start "rule__CommandLineInterface__Group_6__1__Impl"
    // InternalCurlBetterThanHttpie.g:1437:1: rule__CommandLineInterface__Group_6__1__Impl : ( '://' ) ;
    public final void rule__CommandLineInterface__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1441:1: ( ( '://' ) )
            // InternalCurlBetterThanHttpie.g:1442:1: ( '://' )
            {
            // InternalCurlBetterThanHttpie.g:1442:1: ( '://' )
            // InternalCurlBetterThanHttpie.g:1443:2: '://'
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getColonSolidusSolidusKeyword_6_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getCommandLineInterfaceAccess().getColonSolidusSolidusKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group_6__1__Impl"


    // $ANTLR start "rule__CommandLineInterface__Group_7_0__0"
    // InternalCurlBetterThanHttpie.g:1453:1: rule__CommandLineInterface__Group_7_0__0 : rule__CommandLineInterface__Group_7_0__0__Impl rule__CommandLineInterface__Group_7_0__1 ;
    public final void rule__CommandLineInterface__Group_7_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1457:1: ( rule__CommandLineInterface__Group_7_0__0__Impl rule__CommandLineInterface__Group_7_0__1 )
            // InternalCurlBetterThanHttpie.g:1458:2: rule__CommandLineInterface__Group_7_0__0__Impl rule__CommandLineInterface__Group_7_0__1
            {
            pushFollow(FOLLOW_12);
            rule__CommandLineInterface__Group_7_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandLineInterface__Group_7_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group_7_0__0"


    // $ANTLR start "rule__CommandLineInterface__Group_7_0__0__Impl"
    // InternalCurlBetterThanHttpie.g:1465:1: rule__CommandLineInterface__Group_7_0__0__Impl : ( ( rule__CommandLineInterface__UrlAssignment_7_0_0 ) ) ;
    public final void rule__CommandLineInterface__Group_7_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1469:1: ( ( ( rule__CommandLineInterface__UrlAssignment_7_0_0 ) ) )
            // InternalCurlBetterThanHttpie.g:1470:1: ( ( rule__CommandLineInterface__UrlAssignment_7_0_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:1470:1: ( ( rule__CommandLineInterface__UrlAssignment_7_0_0 ) )
            // InternalCurlBetterThanHttpie.g:1471:2: ( rule__CommandLineInterface__UrlAssignment_7_0_0 )
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getUrlAssignment_7_0_0()); 
            // InternalCurlBetterThanHttpie.g:1472:2: ( rule__CommandLineInterface__UrlAssignment_7_0_0 )
            // InternalCurlBetterThanHttpie.g:1472:3: rule__CommandLineInterface__UrlAssignment_7_0_0
            {
            pushFollow(FOLLOW_2);
            rule__CommandLineInterface__UrlAssignment_7_0_0();

            state._fsp--;


            }

             after(grammarAccess.getCommandLineInterfaceAccess().getUrlAssignment_7_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group_7_0__0__Impl"


    // $ANTLR start "rule__CommandLineInterface__Group_7_0__1"
    // InternalCurlBetterThanHttpie.g:1480:1: rule__CommandLineInterface__Group_7_0__1 : rule__CommandLineInterface__Group_7_0__1__Impl ;
    public final void rule__CommandLineInterface__Group_7_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1484:1: ( rule__CommandLineInterface__Group_7_0__1__Impl )
            // InternalCurlBetterThanHttpie.g:1485:2: rule__CommandLineInterface__Group_7_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CommandLineInterface__Group_7_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group_7_0__1"


    // $ANTLR start "rule__CommandLineInterface__Group_7_0__1__Impl"
    // InternalCurlBetterThanHttpie.g:1491:1: rule__CommandLineInterface__Group_7_0__1__Impl : ( ( rule__CommandLineInterface__Group_7_0_1__0 )? ) ;
    public final void rule__CommandLineInterface__Group_7_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1495:1: ( ( ( rule__CommandLineInterface__Group_7_0_1__0 )? ) )
            // InternalCurlBetterThanHttpie.g:1496:1: ( ( rule__CommandLineInterface__Group_7_0_1__0 )? )
            {
            // InternalCurlBetterThanHttpie.g:1496:1: ( ( rule__CommandLineInterface__Group_7_0_1__0 )? )
            // InternalCurlBetterThanHttpie.g:1497:2: ( rule__CommandLineInterface__Group_7_0_1__0 )?
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getGroup_7_0_1()); 
            // InternalCurlBetterThanHttpie.g:1498:2: ( rule__CommandLineInterface__Group_7_0_1__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==35) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1498:3: rule__CommandLineInterface__Group_7_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CommandLineInterface__Group_7_0_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCommandLineInterfaceAccess().getGroup_7_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group_7_0__1__Impl"


    // $ANTLR start "rule__CommandLineInterface__Group_7_0_1__0"
    // InternalCurlBetterThanHttpie.g:1507:1: rule__CommandLineInterface__Group_7_0_1__0 : rule__CommandLineInterface__Group_7_0_1__0__Impl rule__CommandLineInterface__Group_7_0_1__1 ;
    public final void rule__CommandLineInterface__Group_7_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1511:1: ( rule__CommandLineInterface__Group_7_0_1__0__Impl rule__CommandLineInterface__Group_7_0_1__1 )
            // InternalCurlBetterThanHttpie.g:1512:2: rule__CommandLineInterface__Group_7_0_1__0__Impl rule__CommandLineInterface__Group_7_0_1__1
            {
            pushFollow(FOLLOW_13);
            rule__CommandLineInterface__Group_7_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandLineInterface__Group_7_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group_7_0_1__0"


    // $ANTLR start "rule__CommandLineInterface__Group_7_0_1__0__Impl"
    // InternalCurlBetterThanHttpie.g:1519:1: rule__CommandLineInterface__Group_7_0_1__0__Impl : ( ':' ) ;
    public final void rule__CommandLineInterface__Group_7_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1523:1: ( ( ':' ) )
            // InternalCurlBetterThanHttpie.g:1524:1: ( ':' )
            {
            // InternalCurlBetterThanHttpie.g:1524:1: ( ':' )
            // InternalCurlBetterThanHttpie.g:1525:2: ':'
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getColonKeyword_7_0_1_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getCommandLineInterfaceAccess().getColonKeyword_7_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group_7_0_1__0__Impl"


    // $ANTLR start "rule__CommandLineInterface__Group_7_0_1__1"
    // InternalCurlBetterThanHttpie.g:1534:1: rule__CommandLineInterface__Group_7_0_1__1 : rule__CommandLineInterface__Group_7_0_1__1__Impl ;
    public final void rule__CommandLineInterface__Group_7_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1538:1: ( rule__CommandLineInterface__Group_7_0_1__1__Impl )
            // InternalCurlBetterThanHttpie.g:1539:2: rule__CommandLineInterface__Group_7_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CommandLineInterface__Group_7_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group_7_0_1__1"


    // $ANTLR start "rule__CommandLineInterface__Group_7_0_1__1__Impl"
    // InternalCurlBetterThanHttpie.g:1545:1: rule__CommandLineInterface__Group_7_0_1__1__Impl : ( ( rule__CommandLineInterface__PortAssignment_7_0_1_1 ) ) ;
    public final void rule__CommandLineInterface__Group_7_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1549:1: ( ( ( rule__CommandLineInterface__PortAssignment_7_0_1_1 ) ) )
            // InternalCurlBetterThanHttpie.g:1550:1: ( ( rule__CommandLineInterface__PortAssignment_7_0_1_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:1550:1: ( ( rule__CommandLineInterface__PortAssignment_7_0_1_1 ) )
            // InternalCurlBetterThanHttpie.g:1551:2: ( rule__CommandLineInterface__PortAssignment_7_0_1_1 )
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getPortAssignment_7_0_1_1()); 
            // InternalCurlBetterThanHttpie.g:1552:2: ( rule__CommandLineInterface__PortAssignment_7_0_1_1 )
            // InternalCurlBetterThanHttpie.g:1552:3: rule__CommandLineInterface__PortAssignment_7_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__CommandLineInterface__PortAssignment_7_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCommandLineInterfaceAccess().getPortAssignment_7_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group_7_0_1__1__Impl"


    // $ANTLR start "rule__CommandLineInterface__Group_7_1__0"
    // InternalCurlBetterThanHttpie.g:1561:1: rule__CommandLineInterface__Group_7_1__0 : rule__CommandLineInterface__Group_7_1__0__Impl rule__CommandLineInterface__Group_7_1__1 ;
    public final void rule__CommandLineInterface__Group_7_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1565:1: ( rule__CommandLineInterface__Group_7_1__0__Impl rule__CommandLineInterface__Group_7_1__1 )
            // InternalCurlBetterThanHttpie.g:1566:2: rule__CommandLineInterface__Group_7_1__0__Impl rule__CommandLineInterface__Group_7_1__1
            {
            pushFollow(FOLLOW_13);
            rule__CommandLineInterface__Group_7_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandLineInterface__Group_7_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group_7_1__0"


    // $ANTLR start "rule__CommandLineInterface__Group_7_1__0__Impl"
    // InternalCurlBetterThanHttpie.g:1573:1: rule__CommandLineInterface__Group_7_1__0__Impl : ( ':' ) ;
    public final void rule__CommandLineInterface__Group_7_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1577:1: ( ( ':' ) )
            // InternalCurlBetterThanHttpie.g:1578:1: ( ':' )
            {
            // InternalCurlBetterThanHttpie.g:1578:1: ( ':' )
            // InternalCurlBetterThanHttpie.g:1579:2: ':'
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getColonKeyword_7_1_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getCommandLineInterfaceAccess().getColonKeyword_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group_7_1__0__Impl"


    // $ANTLR start "rule__CommandLineInterface__Group_7_1__1"
    // InternalCurlBetterThanHttpie.g:1588:1: rule__CommandLineInterface__Group_7_1__1 : rule__CommandLineInterface__Group_7_1__1__Impl ;
    public final void rule__CommandLineInterface__Group_7_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1592:1: ( rule__CommandLineInterface__Group_7_1__1__Impl )
            // InternalCurlBetterThanHttpie.g:1593:2: rule__CommandLineInterface__Group_7_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CommandLineInterface__Group_7_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group_7_1__1"


    // $ANTLR start "rule__CommandLineInterface__Group_7_1__1__Impl"
    // InternalCurlBetterThanHttpie.g:1599:1: rule__CommandLineInterface__Group_7_1__1__Impl : ( ( rule__CommandLineInterface__PortAssignment_7_1_1 )? ) ;
    public final void rule__CommandLineInterface__Group_7_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1603:1: ( ( ( rule__CommandLineInterface__PortAssignment_7_1_1 )? ) )
            // InternalCurlBetterThanHttpie.g:1604:1: ( ( rule__CommandLineInterface__PortAssignment_7_1_1 )? )
            {
            // InternalCurlBetterThanHttpie.g:1604:1: ( ( rule__CommandLineInterface__PortAssignment_7_1_1 )? )
            // InternalCurlBetterThanHttpie.g:1605:2: ( rule__CommandLineInterface__PortAssignment_7_1_1 )?
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getPortAssignment_7_1_1()); 
            // InternalCurlBetterThanHttpie.g:1606:2: ( rule__CommandLineInterface__PortAssignment_7_1_1 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_INT) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1606:3: rule__CommandLineInterface__PortAssignment_7_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__CommandLineInterface__PortAssignment_7_1_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCommandLineInterfaceAccess().getPortAssignment_7_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group_7_1__1__Impl"


    // $ANTLR start "rule__CommandLineInterface__Group_8__0"
    // InternalCurlBetterThanHttpie.g:1615:1: rule__CommandLineInterface__Group_8__0 : rule__CommandLineInterface__Group_8__0__Impl rule__CommandLineInterface__Group_8__1 ;
    public final void rule__CommandLineInterface__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1619:1: ( rule__CommandLineInterface__Group_8__0__Impl rule__CommandLineInterface__Group_8__1 )
            // InternalCurlBetterThanHttpie.g:1620:2: rule__CommandLineInterface__Group_8__0__Impl rule__CommandLineInterface__Group_8__1
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
    // InternalCurlBetterThanHttpie.g:1627:1: rule__CommandLineInterface__Group_8__0__Impl : ( '/' ) ;
    public final void rule__CommandLineInterface__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1631:1: ( ( '/' ) )
            // InternalCurlBetterThanHttpie.g:1632:1: ( '/' )
            {
            // InternalCurlBetterThanHttpie.g:1632:1: ( '/' )
            // InternalCurlBetterThanHttpie.g:1633:2: '/'
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getSolidusKeyword_8_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getCommandLineInterfaceAccess().getSolidusKeyword_8_0()); 

            }


            }

        }
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
    // InternalCurlBetterThanHttpie.g:1642:1: rule__CommandLineInterface__Group_8__1 : rule__CommandLineInterface__Group_8__1__Impl ;
    public final void rule__CommandLineInterface__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1646:1: ( rule__CommandLineInterface__Group_8__1__Impl )
            // InternalCurlBetterThanHttpie.g:1647:2: rule__CommandLineInterface__Group_8__1__Impl
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
    // InternalCurlBetterThanHttpie.g:1653:1: rule__CommandLineInterface__Group_8__1__Impl : ( ( rule__CommandLineInterface__ResourceAssignment_8_1 ) ) ;
    public final void rule__CommandLineInterface__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1657:1: ( ( ( rule__CommandLineInterface__ResourceAssignment_8_1 ) ) )
            // InternalCurlBetterThanHttpie.g:1658:1: ( ( rule__CommandLineInterface__ResourceAssignment_8_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:1658:1: ( ( rule__CommandLineInterface__ResourceAssignment_8_1 ) )
            // InternalCurlBetterThanHttpie.g:1659:2: ( rule__CommandLineInterface__ResourceAssignment_8_1 )
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getResourceAssignment_8_1()); 
            // InternalCurlBetterThanHttpie.g:1660:2: ( rule__CommandLineInterface__ResourceAssignment_8_1 )
            // InternalCurlBetterThanHttpie.g:1660:3: rule__CommandLineInterface__ResourceAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__CommandLineInterface__ResourceAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getCommandLineInterfaceAccess().getResourceAssignment_8_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__CommandLineInterface__Group_10__0"
    // InternalCurlBetterThanHttpie.g:1669:1: rule__CommandLineInterface__Group_10__0 : rule__CommandLineInterface__Group_10__0__Impl rule__CommandLineInterface__Group_10__1 ;
    public final void rule__CommandLineInterface__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1673:1: ( rule__CommandLineInterface__Group_10__0__Impl rule__CommandLineInterface__Group_10__1 )
            // InternalCurlBetterThanHttpie.g:1674:2: rule__CommandLineInterface__Group_10__0__Impl rule__CommandLineInterface__Group_10__1
            {
            pushFollow(FOLLOW_4);
            rule__CommandLineInterface__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandLineInterface__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group_10__0"


    // $ANTLR start "rule__CommandLineInterface__Group_10__0__Impl"
    // InternalCurlBetterThanHttpie.g:1681:1: rule__CommandLineInterface__Group_10__0__Impl : ( '--' ) ;
    public final void rule__CommandLineInterface__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1685:1: ( ( '--' ) )
            // InternalCurlBetterThanHttpie.g:1686:1: ( '--' )
            {
            // InternalCurlBetterThanHttpie.g:1686:1: ( '--' )
            // InternalCurlBetterThanHttpie.g:1687:2: '--'
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getHyphenMinusHyphenMinusKeyword_10_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getCommandLineInterfaceAccess().getHyphenMinusHyphenMinusKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group_10__0__Impl"


    // $ANTLR start "rule__CommandLineInterface__Group_10__1"
    // InternalCurlBetterThanHttpie.g:1696:1: rule__CommandLineInterface__Group_10__1 : rule__CommandLineInterface__Group_10__1__Impl ;
    public final void rule__CommandLineInterface__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1700:1: ( rule__CommandLineInterface__Group_10__1__Impl )
            // InternalCurlBetterThanHttpie.g:1701:2: rule__CommandLineInterface__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CommandLineInterface__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group_10__1"


    // $ANTLR start "rule__CommandLineInterface__Group_10__1__Impl"
    // InternalCurlBetterThanHttpie.g:1707:1: rule__CommandLineInterface__Group_10__1__Impl : ( RULE_WS ) ;
    public final void rule__CommandLineInterface__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1711:1: ( ( RULE_WS ) )
            // InternalCurlBetterThanHttpie.g:1712:1: ( RULE_WS )
            {
            // InternalCurlBetterThanHttpie.g:1712:1: ( RULE_WS )
            // InternalCurlBetterThanHttpie.g:1713:2: RULE_WS
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getWSTerminalRuleCall_10_1()); 
            match(input,RULE_WS,FOLLOW_2); 
             after(grammarAccess.getCommandLineInterfaceAccess().getWSTerminalRuleCall_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group_10__1__Impl"


    // $ANTLR start "rule__CommandLineInterface__Group_11__0"
    // InternalCurlBetterThanHttpie.g:1723:1: rule__CommandLineInterface__Group_11__0 : rule__CommandLineInterface__Group_11__0__Impl rule__CommandLineInterface__Group_11__1 ;
    public final void rule__CommandLineInterface__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1727:1: ( rule__CommandLineInterface__Group_11__0__Impl rule__CommandLineInterface__Group_11__1 )
            // InternalCurlBetterThanHttpie.g:1728:2: rule__CommandLineInterface__Group_11__0__Impl rule__CommandLineInterface__Group_11__1
            {
            pushFollow(FOLLOW_4);
            rule__CommandLineInterface__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandLineInterface__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group_11__0"


    // $ANTLR start "rule__CommandLineInterface__Group_11__0__Impl"
    // InternalCurlBetterThanHttpie.g:1735:1: rule__CommandLineInterface__Group_11__0__Impl : ( ( rule__CommandLineInterface__ItemsAssignment_11_0 ) ) ;
    public final void rule__CommandLineInterface__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1739:1: ( ( ( rule__CommandLineInterface__ItemsAssignment_11_0 ) ) )
            // InternalCurlBetterThanHttpie.g:1740:1: ( ( rule__CommandLineInterface__ItemsAssignment_11_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:1740:1: ( ( rule__CommandLineInterface__ItemsAssignment_11_0 ) )
            // InternalCurlBetterThanHttpie.g:1741:2: ( rule__CommandLineInterface__ItemsAssignment_11_0 )
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getItemsAssignment_11_0()); 
            // InternalCurlBetterThanHttpie.g:1742:2: ( rule__CommandLineInterface__ItemsAssignment_11_0 )
            // InternalCurlBetterThanHttpie.g:1742:3: rule__CommandLineInterface__ItemsAssignment_11_0
            {
            pushFollow(FOLLOW_2);
            rule__CommandLineInterface__ItemsAssignment_11_0();

            state._fsp--;


            }

             after(grammarAccess.getCommandLineInterfaceAccess().getItemsAssignment_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group_11__0__Impl"


    // $ANTLR start "rule__CommandLineInterface__Group_11__1"
    // InternalCurlBetterThanHttpie.g:1750:1: rule__CommandLineInterface__Group_11__1 : rule__CommandLineInterface__Group_11__1__Impl ;
    public final void rule__CommandLineInterface__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1754:1: ( rule__CommandLineInterface__Group_11__1__Impl )
            // InternalCurlBetterThanHttpie.g:1755:2: rule__CommandLineInterface__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CommandLineInterface__Group_11__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group_11__1"


    // $ANTLR start "rule__CommandLineInterface__Group_11__1__Impl"
    // InternalCurlBetterThanHttpie.g:1761:1: rule__CommandLineInterface__Group_11__1__Impl : ( RULE_WS ) ;
    public final void rule__CommandLineInterface__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1765:1: ( ( RULE_WS ) )
            // InternalCurlBetterThanHttpie.g:1766:1: ( RULE_WS )
            {
            // InternalCurlBetterThanHttpie.g:1766:1: ( RULE_WS )
            // InternalCurlBetterThanHttpie.g:1767:2: RULE_WS
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getWSTerminalRuleCall_11_1()); 
            match(input,RULE_WS,FOLLOW_2); 
             after(grammarAccess.getCommandLineInterfaceAccess().getWSTerminalRuleCall_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__Group_11__1__Impl"


    // $ANTLR start "rule__HeadersFlag__Group__0"
    // InternalCurlBetterThanHttpie.g:1777:1: rule__HeadersFlag__Group__0 : rule__HeadersFlag__Group__0__Impl rule__HeadersFlag__Group__1 ;
    public final void rule__HeadersFlag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1781:1: ( rule__HeadersFlag__Group__0__Impl rule__HeadersFlag__Group__1 )
            // InternalCurlBetterThanHttpie.g:1782:2: rule__HeadersFlag__Group__0__Impl rule__HeadersFlag__Group__1
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
    // InternalCurlBetterThanHttpie.g:1789:1: rule__HeadersFlag__Group__0__Impl : ( () ) ;
    public final void rule__HeadersFlag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1793:1: ( ( () ) )
            // InternalCurlBetterThanHttpie.g:1794:1: ( () )
            {
            // InternalCurlBetterThanHttpie.g:1794:1: ( () )
            // InternalCurlBetterThanHttpie.g:1795:2: ()
            {
             before(grammarAccess.getHeadersFlagAccess().getHeadersFlagAction_0()); 
            // InternalCurlBetterThanHttpie.g:1796:2: ()
            // InternalCurlBetterThanHttpie.g:1796:3: 
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
    // InternalCurlBetterThanHttpie.g:1804:1: rule__HeadersFlag__Group__1 : rule__HeadersFlag__Group__1__Impl ;
    public final void rule__HeadersFlag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1808:1: ( rule__HeadersFlag__Group__1__Impl )
            // InternalCurlBetterThanHttpie.g:1809:2: rule__HeadersFlag__Group__1__Impl
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
    // InternalCurlBetterThanHttpie.g:1815:1: rule__HeadersFlag__Group__1__Impl : ( ( rule__HeadersFlag__Alternatives_1 ) ) ;
    public final void rule__HeadersFlag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1819:1: ( ( ( rule__HeadersFlag__Alternatives_1 ) ) )
            // InternalCurlBetterThanHttpie.g:1820:1: ( ( rule__HeadersFlag__Alternatives_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:1820:1: ( ( rule__HeadersFlag__Alternatives_1 ) )
            // InternalCurlBetterThanHttpie.g:1821:2: ( rule__HeadersFlag__Alternatives_1 )
            {
             before(grammarAccess.getHeadersFlagAccess().getAlternatives_1()); 
            // InternalCurlBetterThanHttpie.g:1822:2: ( rule__HeadersFlag__Alternatives_1 )
            // InternalCurlBetterThanHttpie.g:1822:3: rule__HeadersFlag__Alternatives_1
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
    // InternalCurlBetterThanHttpie.g:1831:1: rule__BodyFlag__Group__0 : rule__BodyFlag__Group__0__Impl rule__BodyFlag__Group__1 ;
    public final void rule__BodyFlag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1835:1: ( rule__BodyFlag__Group__0__Impl rule__BodyFlag__Group__1 )
            // InternalCurlBetterThanHttpie.g:1836:2: rule__BodyFlag__Group__0__Impl rule__BodyFlag__Group__1
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
    // InternalCurlBetterThanHttpie.g:1843:1: rule__BodyFlag__Group__0__Impl : ( () ) ;
    public final void rule__BodyFlag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1847:1: ( ( () ) )
            // InternalCurlBetterThanHttpie.g:1848:1: ( () )
            {
            // InternalCurlBetterThanHttpie.g:1848:1: ( () )
            // InternalCurlBetterThanHttpie.g:1849:2: ()
            {
             before(grammarAccess.getBodyFlagAccess().getBodyFlagAction_0()); 
            // InternalCurlBetterThanHttpie.g:1850:2: ()
            // InternalCurlBetterThanHttpie.g:1850:3: 
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
    // InternalCurlBetterThanHttpie.g:1858:1: rule__BodyFlag__Group__1 : rule__BodyFlag__Group__1__Impl ;
    public final void rule__BodyFlag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1862:1: ( rule__BodyFlag__Group__1__Impl )
            // InternalCurlBetterThanHttpie.g:1863:2: rule__BodyFlag__Group__1__Impl
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
    // InternalCurlBetterThanHttpie.g:1869:1: rule__BodyFlag__Group__1__Impl : ( ( rule__BodyFlag__Alternatives_1 ) ) ;
    public final void rule__BodyFlag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1873:1: ( ( ( rule__BodyFlag__Alternatives_1 ) ) )
            // InternalCurlBetterThanHttpie.g:1874:1: ( ( rule__BodyFlag__Alternatives_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:1874:1: ( ( rule__BodyFlag__Alternatives_1 ) )
            // InternalCurlBetterThanHttpie.g:1875:2: ( rule__BodyFlag__Alternatives_1 )
            {
             before(grammarAccess.getBodyFlagAccess().getAlternatives_1()); 
            // InternalCurlBetterThanHttpie.g:1876:2: ( rule__BodyFlag__Alternatives_1 )
            // InternalCurlBetterThanHttpie.g:1876:3: rule__BodyFlag__Alternatives_1
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
    // InternalCurlBetterThanHttpie.g:1885:1: rule__JsonFlag__Group__0 : rule__JsonFlag__Group__0__Impl rule__JsonFlag__Group__1 ;
    public final void rule__JsonFlag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1889:1: ( rule__JsonFlag__Group__0__Impl rule__JsonFlag__Group__1 )
            // InternalCurlBetterThanHttpie.g:1890:2: rule__JsonFlag__Group__0__Impl rule__JsonFlag__Group__1
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
    // InternalCurlBetterThanHttpie.g:1897:1: rule__JsonFlag__Group__0__Impl : ( () ) ;
    public final void rule__JsonFlag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1901:1: ( ( () ) )
            // InternalCurlBetterThanHttpie.g:1902:1: ( () )
            {
            // InternalCurlBetterThanHttpie.g:1902:1: ( () )
            // InternalCurlBetterThanHttpie.g:1903:2: ()
            {
             before(grammarAccess.getJsonFlagAccess().getJsonFlagAction_0()); 
            // InternalCurlBetterThanHttpie.g:1904:2: ()
            // InternalCurlBetterThanHttpie.g:1904:3: 
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
    // InternalCurlBetterThanHttpie.g:1912:1: rule__JsonFlag__Group__1 : rule__JsonFlag__Group__1__Impl ;
    public final void rule__JsonFlag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1916:1: ( rule__JsonFlag__Group__1__Impl )
            // InternalCurlBetterThanHttpie.g:1917:2: rule__JsonFlag__Group__1__Impl
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
    // InternalCurlBetterThanHttpie.g:1923:1: rule__JsonFlag__Group__1__Impl : ( ( rule__JsonFlag__Alternatives_1 ) ) ;
    public final void rule__JsonFlag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1927:1: ( ( ( rule__JsonFlag__Alternatives_1 ) ) )
            // InternalCurlBetterThanHttpie.g:1928:1: ( ( rule__JsonFlag__Alternatives_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:1928:1: ( ( rule__JsonFlag__Alternatives_1 ) )
            // InternalCurlBetterThanHttpie.g:1929:2: ( rule__JsonFlag__Alternatives_1 )
            {
             before(grammarAccess.getJsonFlagAccess().getAlternatives_1()); 
            // InternalCurlBetterThanHttpie.g:1930:2: ( rule__JsonFlag__Alternatives_1 )
            // InternalCurlBetterThanHttpie.g:1930:3: rule__JsonFlag__Alternatives_1
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
    // InternalCurlBetterThanHttpie.g:1939:1: rule__FormFlag__Group__0 : rule__FormFlag__Group__0__Impl rule__FormFlag__Group__1 ;
    public final void rule__FormFlag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1943:1: ( rule__FormFlag__Group__0__Impl rule__FormFlag__Group__1 )
            // InternalCurlBetterThanHttpie.g:1944:2: rule__FormFlag__Group__0__Impl rule__FormFlag__Group__1
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
    // InternalCurlBetterThanHttpie.g:1951:1: rule__FormFlag__Group__0__Impl : ( () ) ;
    public final void rule__FormFlag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1955:1: ( ( () ) )
            // InternalCurlBetterThanHttpie.g:1956:1: ( () )
            {
            // InternalCurlBetterThanHttpie.g:1956:1: ( () )
            // InternalCurlBetterThanHttpie.g:1957:2: ()
            {
             before(grammarAccess.getFormFlagAccess().getFormFlagAction_0()); 
            // InternalCurlBetterThanHttpie.g:1958:2: ()
            // InternalCurlBetterThanHttpie.g:1958:3: 
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
    // InternalCurlBetterThanHttpie.g:1966:1: rule__FormFlag__Group__1 : rule__FormFlag__Group__1__Impl ;
    public final void rule__FormFlag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1970:1: ( rule__FormFlag__Group__1__Impl )
            // InternalCurlBetterThanHttpie.g:1971:2: rule__FormFlag__Group__1__Impl
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
    // InternalCurlBetterThanHttpie.g:1977:1: rule__FormFlag__Group__1__Impl : ( ( rule__FormFlag__Alternatives_1 ) ) ;
    public final void rule__FormFlag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1981:1: ( ( ( rule__FormFlag__Alternatives_1 ) ) )
            // InternalCurlBetterThanHttpie.g:1982:1: ( ( rule__FormFlag__Alternatives_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:1982:1: ( ( rule__FormFlag__Alternatives_1 ) )
            // InternalCurlBetterThanHttpie.g:1983:2: ( rule__FormFlag__Alternatives_1 )
            {
             before(grammarAccess.getFormFlagAccess().getAlternatives_1()); 
            // InternalCurlBetterThanHttpie.g:1984:2: ( rule__FormFlag__Alternatives_1 )
            // InternalCurlBetterThanHttpie.g:1984:3: rule__FormFlag__Alternatives_1
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
    // InternalCurlBetterThanHttpie.g:1993:1: rule__ProxyFlag__Group__0 : rule__ProxyFlag__Group__0__Impl rule__ProxyFlag__Group__1 ;
    public final void rule__ProxyFlag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1997:1: ( rule__ProxyFlag__Group__0__Impl rule__ProxyFlag__Group__1 )
            // InternalCurlBetterThanHttpie.g:1998:2: rule__ProxyFlag__Group__0__Impl rule__ProxyFlag__Group__1
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
    // InternalCurlBetterThanHttpie.g:2005:1: rule__ProxyFlag__Group__0__Impl : ( '--proxy' ) ;
    public final void rule__ProxyFlag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2009:1: ( ( '--proxy' ) )
            // InternalCurlBetterThanHttpie.g:2010:1: ( '--proxy' )
            {
            // InternalCurlBetterThanHttpie.g:2010:1: ( '--proxy' )
            // InternalCurlBetterThanHttpie.g:2011:2: '--proxy'
            {
             before(grammarAccess.getProxyFlagAccess().getProxyKeyword_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalCurlBetterThanHttpie.g:2020:1: rule__ProxyFlag__Group__1 : rule__ProxyFlag__Group__1__Impl rule__ProxyFlag__Group__2 ;
    public final void rule__ProxyFlag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2024:1: ( rule__ProxyFlag__Group__1__Impl rule__ProxyFlag__Group__2 )
            // InternalCurlBetterThanHttpie.g:2025:2: rule__ProxyFlag__Group__1__Impl rule__ProxyFlag__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalCurlBetterThanHttpie.g:2032:1: rule__ProxyFlag__Group__1__Impl : ( RULE_VALUE ) ;
    public final void rule__ProxyFlag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2036:1: ( ( RULE_VALUE ) )
            // InternalCurlBetterThanHttpie.g:2037:1: ( RULE_VALUE )
            {
            // InternalCurlBetterThanHttpie.g:2037:1: ( RULE_VALUE )
            // InternalCurlBetterThanHttpie.g:2038:2: RULE_VALUE
            {
             before(grammarAccess.getProxyFlagAccess().getVALUETerminalRuleCall_1()); 
            match(input,RULE_VALUE,FOLLOW_2); 
             after(grammarAccess.getProxyFlagAccess().getVALUETerminalRuleCall_1()); 

            }


            }

        }
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
    // InternalCurlBetterThanHttpie.g:2047:1: rule__ProxyFlag__Group__2 : rule__ProxyFlag__Group__2__Impl rule__ProxyFlag__Group__3 ;
    public final void rule__ProxyFlag__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2051:1: ( rule__ProxyFlag__Group__2__Impl rule__ProxyFlag__Group__3 )
            // InternalCurlBetterThanHttpie.g:2052:2: rule__ProxyFlag__Group__2__Impl rule__ProxyFlag__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalCurlBetterThanHttpie.g:2059:1: rule__ProxyFlag__Group__2__Impl : ( ( rule__ProxyFlag__Group_2__0 )? ) ;
    public final void rule__ProxyFlag__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2063:1: ( ( ( rule__ProxyFlag__Group_2__0 )? ) )
            // InternalCurlBetterThanHttpie.g:2064:1: ( ( rule__ProxyFlag__Group_2__0 )? )
            {
            // InternalCurlBetterThanHttpie.g:2064:1: ( ( rule__ProxyFlag__Group_2__0 )? )
            // InternalCurlBetterThanHttpie.g:2065:2: ( rule__ProxyFlag__Group_2__0 )?
            {
             before(grammarAccess.getProxyFlagAccess().getGroup_2()); 
            // InternalCurlBetterThanHttpie.g:2066:2: ( rule__ProxyFlag__Group_2__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_STRING) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==35) ) {
                    int LA23_3 = input.LA(3);

                    if ( (LA23_3==RULE_STRING) ) {
                        int LA23_4 = input.LA(4);

                        if ( (LA23_4==EOF||LA23_4==RULE_WS||(LA23_4>=34 && LA23_4<=35)) ) {
                            alt23=1;
                        }
                    }
                }
            }
            switch (alt23) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:2066:3: rule__ProxyFlag__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProxyFlag__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProxyFlagAccess().getGroup_2()); 

            }


            }

        }
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
    // InternalCurlBetterThanHttpie.g:2074:1: rule__ProxyFlag__Group__3 : rule__ProxyFlag__Group__3__Impl rule__ProxyFlag__Group__4 ;
    public final void rule__ProxyFlag__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2078:1: ( rule__ProxyFlag__Group__3__Impl rule__ProxyFlag__Group__4 )
            // InternalCurlBetterThanHttpie.g:2079:2: rule__ProxyFlag__Group__3__Impl rule__ProxyFlag__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalCurlBetterThanHttpie.g:2086:1: rule__ProxyFlag__Group__3__Impl : ( ( rule__ProxyFlag__Group_3__0 )? ) ;
    public final void rule__ProxyFlag__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2090:1: ( ( ( rule__ProxyFlag__Group_3__0 )? ) )
            // InternalCurlBetterThanHttpie.g:2091:1: ( ( rule__ProxyFlag__Group_3__0 )? )
            {
            // InternalCurlBetterThanHttpie.g:2091:1: ( ( rule__ProxyFlag__Group_3__0 )? )
            // InternalCurlBetterThanHttpie.g:2092:2: ( rule__ProxyFlag__Group_3__0 )?
            {
             before(grammarAccess.getProxyFlagAccess().getGroup_3()); 
            // InternalCurlBetterThanHttpie.g:2093:2: ( rule__ProxyFlag__Group_3__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_STRING) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==34) ) {
                    alt24=1;
                }
            }
            switch (alt24) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:2093:3: rule__ProxyFlag__Group_3__0
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
    // InternalCurlBetterThanHttpie.g:2101:1: rule__ProxyFlag__Group__4 : rule__ProxyFlag__Group__4__Impl rule__ProxyFlag__Group__5 ;
    public final void rule__ProxyFlag__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2105:1: ( rule__ProxyFlag__Group__4__Impl rule__ProxyFlag__Group__5 )
            // InternalCurlBetterThanHttpie.g:2106:2: rule__ProxyFlag__Group__4__Impl rule__ProxyFlag__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__ProxyFlag__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProxyFlag__Group__5();

            state._fsp--;


            }

        }
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
    // InternalCurlBetterThanHttpie.g:2113:1: rule__ProxyFlag__Group__4__Impl : ( ( rule__ProxyFlag__Group_4__0 )? ) ;
    public final void rule__ProxyFlag__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2117:1: ( ( ( rule__ProxyFlag__Group_4__0 )? ) )
            // InternalCurlBetterThanHttpie.g:2118:1: ( ( rule__ProxyFlag__Group_4__0 )? )
            {
            // InternalCurlBetterThanHttpie.g:2118:1: ( ( rule__ProxyFlag__Group_4__0 )? )
            // InternalCurlBetterThanHttpie.g:2119:2: ( rule__ProxyFlag__Group_4__0 )?
            {
             before(grammarAccess.getProxyFlagAccess().getGroup_4()); 
            // InternalCurlBetterThanHttpie.g:2120:2: ( rule__ProxyFlag__Group_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_STRING) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==35) ) {
                    int LA25_2 = input.LA(3);

                    if ( (LA25_2==RULE_STRING) ) {
                        alt25=1;
                    }
                }
            }
            switch (alt25) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:2120:3: rule__ProxyFlag__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProxyFlag__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProxyFlagAccess().getGroup_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__ProxyFlag__Group__5"
    // InternalCurlBetterThanHttpie.g:2128:1: rule__ProxyFlag__Group__5 : rule__ProxyFlag__Group__5__Impl rule__ProxyFlag__Group__6 ;
    public final void rule__ProxyFlag__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2132:1: ( rule__ProxyFlag__Group__5__Impl rule__ProxyFlag__Group__6 )
            // InternalCurlBetterThanHttpie.g:2133:2: rule__ProxyFlag__Group__5__Impl rule__ProxyFlag__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__ProxyFlag__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProxyFlag__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Group__5"


    // $ANTLR start "rule__ProxyFlag__Group__5__Impl"
    // InternalCurlBetterThanHttpie.g:2140:1: rule__ProxyFlag__Group__5__Impl : ( ( rule__ProxyFlag__HostnameAssignment_5 ) ) ;
    public final void rule__ProxyFlag__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2144:1: ( ( ( rule__ProxyFlag__HostnameAssignment_5 ) ) )
            // InternalCurlBetterThanHttpie.g:2145:1: ( ( rule__ProxyFlag__HostnameAssignment_5 ) )
            {
            // InternalCurlBetterThanHttpie.g:2145:1: ( ( rule__ProxyFlag__HostnameAssignment_5 ) )
            // InternalCurlBetterThanHttpie.g:2146:2: ( rule__ProxyFlag__HostnameAssignment_5 )
            {
             before(grammarAccess.getProxyFlagAccess().getHostnameAssignment_5()); 
            // InternalCurlBetterThanHttpie.g:2147:2: ( rule__ProxyFlag__HostnameAssignment_5 )
            // InternalCurlBetterThanHttpie.g:2147:3: rule__ProxyFlag__HostnameAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ProxyFlag__HostnameAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getProxyFlagAccess().getHostnameAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Group__5__Impl"


    // $ANTLR start "rule__ProxyFlag__Group__6"
    // InternalCurlBetterThanHttpie.g:2155:1: rule__ProxyFlag__Group__6 : rule__ProxyFlag__Group__6__Impl ;
    public final void rule__ProxyFlag__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2159:1: ( rule__ProxyFlag__Group__6__Impl )
            // InternalCurlBetterThanHttpie.g:2160:2: rule__ProxyFlag__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProxyFlag__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Group__6"


    // $ANTLR start "rule__ProxyFlag__Group__6__Impl"
    // InternalCurlBetterThanHttpie.g:2166:1: rule__ProxyFlag__Group__6__Impl : ( ( rule__ProxyFlag__Group_6__0 )? ) ;
    public final void rule__ProxyFlag__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2170:1: ( ( ( rule__ProxyFlag__Group_6__0 )? ) )
            // InternalCurlBetterThanHttpie.g:2171:1: ( ( rule__ProxyFlag__Group_6__0 )? )
            {
            // InternalCurlBetterThanHttpie.g:2171:1: ( ( rule__ProxyFlag__Group_6__0 )? )
            // InternalCurlBetterThanHttpie.g:2172:2: ( rule__ProxyFlag__Group_6__0 )?
            {
             before(grammarAccess.getProxyFlagAccess().getGroup_6()); 
            // InternalCurlBetterThanHttpie.g:2173:2: ( rule__ProxyFlag__Group_6__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==35) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:2173:3: rule__ProxyFlag__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProxyFlag__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProxyFlagAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Group__6__Impl"


    // $ANTLR start "rule__ProxyFlag__Group_2__0"
    // InternalCurlBetterThanHttpie.g:2182:1: rule__ProxyFlag__Group_2__0 : rule__ProxyFlag__Group_2__0__Impl rule__ProxyFlag__Group_2__1 ;
    public final void rule__ProxyFlag__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2186:1: ( rule__ProxyFlag__Group_2__0__Impl rule__ProxyFlag__Group_2__1 )
            // InternalCurlBetterThanHttpie.g:2187:2: rule__ProxyFlag__Group_2__0__Impl rule__ProxyFlag__Group_2__1
            {
            pushFollow(FOLLOW_12);
            rule__ProxyFlag__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProxyFlag__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Group_2__0"


    // $ANTLR start "rule__ProxyFlag__Group_2__0__Impl"
    // InternalCurlBetterThanHttpie.g:2194:1: rule__ProxyFlag__Group_2__0__Impl : ( ( rule__ProxyFlag__ProtocolAssignment_2_0 ) ) ;
    public final void rule__ProxyFlag__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2198:1: ( ( ( rule__ProxyFlag__ProtocolAssignment_2_0 ) ) )
            // InternalCurlBetterThanHttpie.g:2199:1: ( ( rule__ProxyFlag__ProtocolAssignment_2_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:2199:1: ( ( rule__ProxyFlag__ProtocolAssignment_2_0 ) )
            // InternalCurlBetterThanHttpie.g:2200:2: ( rule__ProxyFlag__ProtocolAssignment_2_0 )
            {
             before(grammarAccess.getProxyFlagAccess().getProtocolAssignment_2_0()); 
            // InternalCurlBetterThanHttpie.g:2201:2: ( rule__ProxyFlag__ProtocolAssignment_2_0 )
            // InternalCurlBetterThanHttpie.g:2201:3: rule__ProxyFlag__ProtocolAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__ProxyFlag__ProtocolAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getProxyFlagAccess().getProtocolAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Group_2__0__Impl"


    // $ANTLR start "rule__ProxyFlag__Group_2__1"
    // InternalCurlBetterThanHttpie.g:2209:1: rule__ProxyFlag__Group_2__1 : rule__ProxyFlag__Group_2__1__Impl ;
    public final void rule__ProxyFlag__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2213:1: ( rule__ProxyFlag__Group_2__1__Impl )
            // InternalCurlBetterThanHttpie.g:2214:2: rule__ProxyFlag__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProxyFlag__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Group_2__1"


    // $ANTLR start "rule__ProxyFlag__Group_2__1__Impl"
    // InternalCurlBetterThanHttpie.g:2220:1: rule__ProxyFlag__Group_2__1__Impl : ( ':' ) ;
    public final void rule__ProxyFlag__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2224:1: ( ( ':' ) )
            // InternalCurlBetterThanHttpie.g:2225:1: ( ':' )
            {
            // InternalCurlBetterThanHttpie.g:2225:1: ( ':' )
            // InternalCurlBetterThanHttpie.g:2226:2: ':'
            {
             before(grammarAccess.getProxyFlagAccess().getColonKeyword_2_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getProxyFlagAccess().getColonKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Group_2__1__Impl"


    // $ANTLR start "rule__ProxyFlag__Group_3__0"
    // InternalCurlBetterThanHttpie.g:2236:1: rule__ProxyFlag__Group_3__0 : rule__ProxyFlag__Group_3__0__Impl rule__ProxyFlag__Group_3__1 ;
    public final void rule__ProxyFlag__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2240:1: ( rule__ProxyFlag__Group_3__0__Impl rule__ProxyFlag__Group_3__1 )
            // InternalCurlBetterThanHttpie.g:2241:2: rule__ProxyFlag__Group_3__0__Impl rule__ProxyFlag__Group_3__1
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
    // InternalCurlBetterThanHttpie.g:2248:1: rule__ProxyFlag__Group_3__0__Impl : ( ( rule__ProxyFlag__ProxyProtocolAssignment_3_0 ) ) ;
    public final void rule__ProxyFlag__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2252:1: ( ( ( rule__ProxyFlag__ProxyProtocolAssignment_3_0 ) ) )
            // InternalCurlBetterThanHttpie.g:2253:1: ( ( rule__ProxyFlag__ProxyProtocolAssignment_3_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:2253:1: ( ( rule__ProxyFlag__ProxyProtocolAssignment_3_0 ) )
            // InternalCurlBetterThanHttpie.g:2254:2: ( rule__ProxyFlag__ProxyProtocolAssignment_3_0 )
            {
             before(grammarAccess.getProxyFlagAccess().getProxyProtocolAssignment_3_0()); 
            // InternalCurlBetterThanHttpie.g:2255:2: ( rule__ProxyFlag__ProxyProtocolAssignment_3_0 )
            // InternalCurlBetterThanHttpie.g:2255:3: rule__ProxyFlag__ProxyProtocolAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__ProxyFlag__ProxyProtocolAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getProxyFlagAccess().getProxyProtocolAssignment_3_0()); 

            }


            }

        }
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
    // InternalCurlBetterThanHttpie.g:2263:1: rule__ProxyFlag__Group_3__1 : rule__ProxyFlag__Group_3__1__Impl ;
    public final void rule__ProxyFlag__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2267:1: ( rule__ProxyFlag__Group_3__1__Impl )
            // InternalCurlBetterThanHttpie.g:2268:2: rule__ProxyFlag__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProxyFlag__Group_3__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalCurlBetterThanHttpie.g:2274:1: rule__ProxyFlag__Group_3__1__Impl : ( '://' ) ;
    public final void rule__ProxyFlag__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2278:1: ( ( '://' ) )
            // InternalCurlBetterThanHttpie.g:2279:1: ( '://' )
            {
            // InternalCurlBetterThanHttpie.g:2279:1: ( '://' )
            // InternalCurlBetterThanHttpie.g:2280:2: '://'
            {
             before(grammarAccess.getProxyFlagAccess().getColonSolidusSolidusKeyword_3_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getProxyFlagAccess().getColonSolidusSolidusKeyword_3_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__ProxyFlag__Group_4__0"
    // InternalCurlBetterThanHttpie.g:2290:1: rule__ProxyFlag__Group_4__0 : rule__ProxyFlag__Group_4__0__Impl rule__ProxyFlag__Group_4__1 ;
    public final void rule__ProxyFlag__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2294:1: ( rule__ProxyFlag__Group_4__0__Impl rule__ProxyFlag__Group_4__1 )
            // InternalCurlBetterThanHttpie.g:2295:2: rule__ProxyFlag__Group_4__0__Impl rule__ProxyFlag__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__ProxyFlag__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProxyFlag__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Group_4__0"


    // $ANTLR start "rule__ProxyFlag__Group_4__0__Impl"
    // InternalCurlBetterThanHttpie.g:2302:1: rule__ProxyFlag__Group_4__0__Impl : ( ( rule__ProxyFlag__UsernameAssignment_4_0 ) ) ;
    public final void rule__ProxyFlag__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2306:1: ( ( ( rule__ProxyFlag__UsernameAssignment_4_0 ) ) )
            // InternalCurlBetterThanHttpie.g:2307:1: ( ( rule__ProxyFlag__UsernameAssignment_4_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:2307:1: ( ( rule__ProxyFlag__UsernameAssignment_4_0 ) )
            // InternalCurlBetterThanHttpie.g:2308:2: ( rule__ProxyFlag__UsernameAssignment_4_0 )
            {
             before(grammarAccess.getProxyFlagAccess().getUsernameAssignment_4_0()); 
            // InternalCurlBetterThanHttpie.g:2309:2: ( rule__ProxyFlag__UsernameAssignment_4_0 )
            // InternalCurlBetterThanHttpie.g:2309:3: rule__ProxyFlag__UsernameAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__ProxyFlag__UsernameAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getProxyFlagAccess().getUsernameAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Group_4__0__Impl"


    // $ANTLR start "rule__ProxyFlag__Group_4__1"
    // InternalCurlBetterThanHttpie.g:2317:1: rule__ProxyFlag__Group_4__1 : rule__ProxyFlag__Group_4__1__Impl rule__ProxyFlag__Group_4__2 ;
    public final void rule__ProxyFlag__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2321:1: ( rule__ProxyFlag__Group_4__1__Impl rule__ProxyFlag__Group_4__2 )
            // InternalCurlBetterThanHttpie.g:2322:2: rule__ProxyFlag__Group_4__1__Impl rule__ProxyFlag__Group_4__2
            {
            pushFollow(FOLLOW_14);
            rule__ProxyFlag__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProxyFlag__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Group_4__1"


    // $ANTLR start "rule__ProxyFlag__Group_4__1__Impl"
    // InternalCurlBetterThanHttpie.g:2329:1: rule__ProxyFlag__Group_4__1__Impl : ( ':' ) ;
    public final void rule__ProxyFlag__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2333:1: ( ( ':' ) )
            // InternalCurlBetterThanHttpie.g:2334:1: ( ':' )
            {
            // InternalCurlBetterThanHttpie.g:2334:1: ( ':' )
            // InternalCurlBetterThanHttpie.g:2335:2: ':'
            {
             before(grammarAccess.getProxyFlagAccess().getColonKeyword_4_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getProxyFlagAccess().getColonKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Group_4__1__Impl"


    // $ANTLR start "rule__ProxyFlag__Group_4__2"
    // InternalCurlBetterThanHttpie.g:2344:1: rule__ProxyFlag__Group_4__2 : rule__ProxyFlag__Group_4__2__Impl rule__ProxyFlag__Group_4__3 ;
    public final void rule__ProxyFlag__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2348:1: ( rule__ProxyFlag__Group_4__2__Impl rule__ProxyFlag__Group_4__3 )
            // InternalCurlBetterThanHttpie.g:2349:2: rule__ProxyFlag__Group_4__2__Impl rule__ProxyFlag__Group_4__3
            {
            pushFollow(FOLLOW_20);
            rule__ProxyFlag__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProxyFlag__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Group_4__2"


    // $ANTLR start "rule__ProxyFlag__Group_4__2__Impl"
    // InternalCurlBetterThanHttpie.g:2356:1: rule__ProxyFlag__Group_4__2__Impl : ( ( rule__ProxyFlag__PasswordAssignment_4_2 ) ) ;
    public final void rule__ProxyFlag__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2360:1: ( ( ( rule__ProxyFlag__PasswordAssignment_4_2 ) ) )
            // InternalCurlBetterThanHttpie.g:2361:1: ( ( rule__ProxyFlag__PasswordAssignment_4_2 ) )
            {
            // InternalCurlBetterThanHttpie.g:2361:1: ( ( rule__ProxyFlag__PasswordAssignment_4_2 ) )
            // InternalCurlBetterThanHttpie.g:2362:2: ( rule__ProxyFlag__PasswordAssignment_4_2 )
            {
             before(grammarAccess.getProxyFlagAccess().getPasswordAssignment_4_2()); 
            // InternalCurlBetterThanHttpie.g:2363:2: ( rule__ProxyFlag__PasswordAssignment_4_2 )
            // InternalCurlBetterThanHttpie.g:2363:3: rule__ProxyFlag__PasswordAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__ProxyFlag__PasswordAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getProxyFlagAccess().getPasswordAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Group_4__2__Impl"


    // $ANTLR start "rule__ProxyFlag__Group_4__3"
    // InternalCurlBetterThanHttpie.g:2371:1: rule__ProxyFlag__Group_4__3 : rule__ProxyFlag__Group_4__3__Impl ;
    public final void rule__ProxyFlag__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2375:1: ( rule__ProxyFlag__Group_4__3__Impl )
            // InternalCurlBetterThanHttpie.g:2376:2: rule__ProxyFlag__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProxyFlag__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Group_4__3"


    // $ANTLR start "rule__ProxyFlag__Group_4__3__Impl"
    // InternalCurlBetterThanHttpie.g:2382:1: rule__ProxyFlag__Group_4__3__Impl : ( 'a' ) ;
    public final void rule__ProxyFlag__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2386:1: ( ( 'a' ) )
            // InternalCurlBetterThanHttpie.g:2387:1: ( 'a' )
            {
            // InternalCurlBetterThanHttpie.g:2387:1: ( 'a' )
            // InternalCurlBetterThanHttpie.g:2388:2: 'a'
            {
             before(grammarAccess.getProxyFlagAccess().getAKeyword_4_3()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getProxyFlagAccess().getAKeyword_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Group_4__3__Impl"


    // $ANTLR start "rule__ProxyFlag__Group_6__0"
    // InternalCurlBetterThanHttpie.g:2398:1: rule__ProxyFlag__Group_6__0 : rule__ProxyFlag__Group_6__0__Impl rule__ProxyFlag__Group_6__1 ;
    public final void rule__ProxyFlag__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2402:1: ( rule__ProxyFlag__Group_6__0__Impl rule__ProxyFlag__Group_6__1 )
            // InternalCurlBetterThanHttpie.g:2403:2: rule__ProxyFlag__Group_6__0__Impl rule__ProxyFlag__Group_6__1
            {
            pushFollow(FOLLOW_13);
            rule__ProxyFlag__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProxyFlag__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Group_6__0"


    // $ANTLR start "rule__ProxyFlag__Group_6__0__Impl"
    // InternalCurlBetterThanHttpie.g:2410:1: rule__ProxyFlag__Group_6__0__Impl : ( ':' ) ;
    public final void rule__ProxyFlag__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2414:1: ( ( ':' ) )
            // InternalCurlBetterThanHttpie.g:2415:1: ( ':' )
            {
            // InternalCurlBetterThanHttpie.g:2415:1: ( ':' )
            // InternalCurlBetterThanHttpie.g:2416:2: ':'
            {
             before(grammarAccess.getProxyFlagAccess().getColonKeyword_6_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getProxyFlagAccess().getColonKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Group_6__0__Impl"


    // $ANTLR start "rule__ProxyFlag__Group_6__1"
    // InternalCurlBetterThanHttpie.g:2425:1: rule__ProxyFlag__Group_6__1 : rule__ProxyFlag__Group_6__1__Impl ;
    public final void rule__ProxyFlag__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2429:1: ( rule__ProxyFlag__Group_6__1__Impl )
            // InternalCurlBetterThanHttpie.g:2430:2: rule__ProxyFlag__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProxyFlag__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Group_6__1"


    // $ANTLR start "rule__ProxyFlag__Group_6__1__Impl"
    // InternalCurlBetterThanHttpie.g:2436:1: rule__ProxyFlag__Group_6__1__Impl : ( ( rule__ProxyFlag__PortAssignment_6_1 ) ) ;
    public final void rule__ProxyFlag__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2440:1: ( ( ( rule__ProxyFlag__PortAssignment_6_1 ) ) )
            // InternalCurlBetterThanHttpie.g:2441:1: ( ( rule__ProxyFlag__PortAssignment_6_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:2441:1: ( ( rule__ProxyFlag__PortAssignment_6_1 ) )
            // InternalCurlBetterThanHttpie.g:2442:2: ( rule__ProxyFlag__PortAssignment_6_1 )
            {
             before(grammarAccess.getProxyFlagAccess().getPortAssignment_6_1()); 
            // InternalCurlBetterThanHttpie.g:2443:2: ( rule__ProxyFlag__PortAssignment_6_1 )
            // InternalCurlBetterThanHttpie.g:2443:3: rule__ProxyFlag__PortAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__ProxyFlag__PortAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getProxyFlagAccess().getPortAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Group_6__1__Impl"


    // $ANTLR start "rule__AuthFlag__Group__0"
    // InternalCurlBetterThanHttpie.g:2452:1: rule__AuthFlag__Group__0 : rule__AuthFlag__Group__0__Impl rule__AuthFlag__Group__1 ;
    public final void rule__AuthFlag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2456:1: ( rule__AuthFlag__Group__0__Impl rule__AuthFlag__Group__1 )
            // InternalCurlBetterThanHttpie.g:2457:2: rule__AuthFlag__Group__0__Impl rule__AuthFlag__Group__1
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
    // InternalCurlBetterThanHttpie.g:2464:1: rule__AuthFlag__Group__0__Impl : ( ( rule__AuthFlag__Alternatives_0 ) ) ;
    public final void rule__AuthFlag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2468:1: ( ( ( rule__AuthFlag__Alternatives_0 ) ) )
            // InternalCurlBetterThanHttpie.g:2469:1: ( ( rule__AuthFlag__Alternatives_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:2469:1: ( ( rule__AuthFlag__Alternatives_0 ) )
            // InternalCurlBetterThanHttpie.g:2470:2: ( rule__AuthFlag__Alternatives_0 )
            {
             before(grammarAccess.getAuthFlagAccess().getAlternatives_0()); 
            // InternalCurlBetterThanHttpie.g:2471:2: ( rule__AuthFlag__Alternatives_0 )
            // InternalCurlBetterThanHttpie.g:2471:3: rule__AuthFlag__Alternatives_0
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
    // InternalCurlBetterThanHttpie.g:2479:1: rule__AuthFlag__Group__1 : rule__AuthFlag__Group__1__Impl rule__AuthFlag__Group__2 ;
    public final void rule__AuthFlag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2483:1: ( rule__AuthFlag__Group__1__Impl rule__AuthFlag__Group__2 )
            // InternalCurlBetterThanHttpie.g:2484:2: rule__AuthFlag__Group__1__Impl rule__AuthFlag__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalCurlBetterThanHttpie.g:2491:1: rule__AuthFlag__Group__1__Impl : ( RULE_VALUE ) ;
    public final void rule__AuthFlag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2495:1: ( ( RULE_VALUE ) )
            // InternalCurlBetterThanHttpie.g:2496:1: ( RULE_VALUE )
            {
            // InternalCurlBetterThanHttpie.g:2496:1: ( RULE_VALUE )
            // InternalCurlBetterThanHttpie.g:2497:2: RULE_VALUE
            {
             before(grammarAccess.getAuthFlagAccess().getVALUETerminalRuleCall_1()); 
            match(input,RULE_VALUE,FOLLOW_2); 
             after(grammarAccess.getAuthFlagAccess().getVALUETerminalRuleCall_1()); 

            }


            }

        }
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
    // InternalCurlBetterThanHttpie.g:2506:1: rule__AuthFlag__Group__2 : rule__AuthFlag__Group__2__Impl rule__AuthFlag__Group__3 ;
    public final void rule__AuthFlag__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2510:1: ( rule__AuthFlag__Group__2__Impl rule__AuthFlag__Group__3 )
            // InternalCurlBetterThanHttpie.g:2511:2: rule__AuthFlag__Group__2__Impl rule__AuthFlag__Group__3
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
    // InternalCurlBetterThanHttpie.g:2518:1: rule__AuthFlag__Group__2__Impl : ( ( rule__AuthFlag__UsernameAssignment_2 ) ) ;
    public final void rule__AuthFlag__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2522:1: ( ( ( rule__AuthFlag__UsernameAssignment_2 ) ) )
            // InternalCurlBetterThanHttpie.g:2523:1: ( ( rule__AuthFlag__UsernameAssignment_2 ) )
            {
            // InternalCurlBetterThanHttpie.g:2523:1: ( ( rule__AuthFlag__UsernameAssignment_2 ) )
            // InternalCurlBetterThanHttpie.g:2524:2: ( rule__AuthFlag__UsernameAssignment_2 )
            {
             before(grammarAccess.getAuthFlagAccess().getUsernameAssignment_2()); 
            // InternalCurlBetterThanHttpie.g:2525:2: ( rule__AuthFlag__UsernameAssignment_2 )
            // InternalCurlBetterThanHttpie.g:2525:3: rule__AuthFlag__UsernameAssignment_2
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
    // InternalCurlBetterThanHttpie.g:2533:1: rule__AuthFlag__Group__3 : rule__AuthFlag__Group__3__Impl rule__AuthFlag__Group__4 ;
    public final void rule__AuthFlag__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2537:1: ( rule__AuthFlag__Group__3__Impl rule__AuthFlag__Group__4 )
            // InternalCurlBetterThanHttpie.g:2538:2: rule__AuthFlag__Group__3__Impl rule__AuthFlag__Group__4
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
    // InternalCurlBetterThanHttpie.g:2545:1: rule__AuthFlag__Group__3__Impl : ( ( rule__AuthFlag__Group_3__0 )? ) ;
    public final void rule__AuthFlag__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2549:1: ( ( ( rule__AuthFlag__Group_3__0 )? ) )
            // InternalCurlBetterThanHttpie.g:2550:1: ( ( rule__AuthFlag__Group_3__0 )? )
            {
            // InternalCurlBetterThanHttpie.g:2550:1: ( ( rule__AuthFlag__Group_3__0 )? )
            // InternalCurlBetterThanHttpie.g:2551:2: ( rule__AuthFlag__Group_3__0 )?
            {
             before(grammarAccess.getAuthFlagAccess().getGroup_3()); 
            // InternalCurlBetterThanHttpie.g:2552:2: ( rule__AuthFlag__Group_3__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==35) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:2552:3: rule__AuthFlag__Group_3__0
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
    // InternalCurlBetterThanHttpie.g:2560:1: rule__AuthFlag__Group__4 : rule__AuthFlag__Group__4__Impl ;
    public final void rule__AuthFlag__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2564:1: ( rule__AuthFlag__Group__4__Impl )
            // InternalCurlBetterThanHttpie.g:2565:2: rule__AuthFlag__Group__4__Impl
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
    // InternalCurlBetterThanHttpie.g:2571:1: rule__AuthFlag__Group__4__Impl : ( ( rule__AuthFlag__Group_4__0 )? ) ;
    public final void rule__AuthFlag__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2575:1: ( ( ( rule__AuthFlag__Group_4__0 )? ) )
            // InternalCurlBetterThanHttpie.g:2576:1: ( ( rule__AuthFlag__Group_4__0 )? )
            {
            // InternalCurlBetterThanHttpie.g:2576:1: ( ( rule__AuthFlag__Group_4__0 )? )
            // InternalCurlBetterThanHttpie.g:2577:2: ( rule__AuthFlag__Group_4__0 )?
            {
             before(grammarAccess.getAuthFlagAccess().getGroup_4()); 
            // InternalCurlBetterThanHttpie.g:2578:2: ( rule__AuthFlag__Group_4__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==40) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:2578:3: rule__AuthFlag__Group_4__0
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
    // InternalCurlBetterThanHttpie.g:2587:1: rule__AuthFlag__Group_3__0 : rule__AuthFlag__Group_3__0__Impl rule__AuthFlag__Group_3__1 ;
    public final void rule__AuthFlag__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2591:1: ( rule__AuthFlag__Group_3__0__Impl rule__AuthFlag__Group_3__1 )
            // InternalCurlBetterThanHttpie.g:2592:2: rule__AuthFlag__Group_3__0__Impl rule__AuthFlag__Group_3__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalCurlBetterThanHttpie.g:2599:1: rule__AuthFlag__Group_3__0__Impl : ( ':' ) ;
    public final void rule__AuthFlag__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2603:1: ( ( ':' ) )
            // InternalCurlBetterThanHttpie.g:2604:1: ( ':' )
            {
            // InternalCurlBetterThanHttpie.g:2604:1: ( ':' )
            // InternalCurlBetterThanHttpie.g:2605:2: ':'
            {
             before(grammarAccess.getAuthFlagAccess().getColonKeyword_3_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalCurlBetterThanHttpie.g:2614:1: rule__AuthFlag__Group_3__1 : rule__AuthFlag__Group_3__1__Impl ;
    public final void rule__AuthFlag__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2618:1: ( rule__AuthFlag__Group_3__1__Impl )
            // InternalCurlBetterThanHttpie.g:2619:2: rule__AuthFlag__Group_3__1__Impl
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
    // InternalCurlBetterThanHttpie.g:2625:1: rule__AuthFlag__Group_3__1__Impl : ( ( rule__AuthFlag__PasswordAssignment_3_1 ) ) ;
    public final void rule__AuthFlag__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2629:1: ( ( ( rule__AuthFlag__PasswordAssignment_3_1 ) ) )
            // InternalCurlBetterThanHttpie.g:2630:1: ( ( rule__AuthFlag__PasswordAssignment_3_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:2630:1: ( ( rule__AuthFlag__PasswordAssignment_3_1 ) )
            // InternalCurlBetterThanHttpie.g:2631:2: ( rule__AuthFlag__PasswordAssignment_3_1 )
            {
             before(grammarAccess.getAuthFlagAccess().getPasswordAssignment_3_1()); 
            // InternalCurlBetterThanHttpie.g:2632:2: ( rule__AuthFlag__PasswordAssignment_3_1 )
            // InternalCurlBetterThanHttpie.g:2632:3: rule__AuthFlag__PasswordAssignment_3_1
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
    // InternalCurlBetterThanHttpie.g:2641:1: rule__AuthFlag__Group_4__0 : rule__AuthFlag__Group_4__0__Impl rule__AuthFlag__Group_4__1 ;
    public final void rule__AuthFlag__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2645:1: ( rule__AuthFlag__Group_4__0__Impl rule__AuthFlag__Group_4__1 )
            // InternalCurlBetterThanHttpie.g:2646:2: rule__AuthFlag__Group_4__0__Impl rule__AuthFlag__Group_4__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalCurlBetterThanHttpie.g:2653:1: rule__AuthFlag__Group_4__0__Impl : ( '@' ) ;
    public final void rule__AuthFlag__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2657:1: ( ( '@' ) )
            // InternalCurlBetterThanHttpie.g:2658:1: ( '@' )
            {
            // InternalCurlBetterThanHttpie.g:2658:1: ( '@' )
            // InternalCurlBetterThanHttpie.g:2659:2: '@'
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
    // InternalCurlBetterThanHttpie.g:2668:1: rule__AuthFlag__Group_4__1 : rule__AuthFlag__Group_4__1__Impl ;
    public final void rule__AuthFlag__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2672:1: ( rule__AuthFlag__Group_4__1__Impl )
            // InternalCurlBetterThanHttpie.g:2673:2: rule__AuthFlag__Group_4__1__Impl
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
    // InternalCurlBetterThanHttpie.g:2679:1: rule__AuthFlag__Group_4__1__Impl : ( ( rule__AuthFlag__HostnameAssignment_4_1 ) ) ;
    public final void rule__AuthFlag__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2683:1: ( ( ( rule__AuthFlag__HostnameAssignment_4_1 ) ) )
            // InternalCurlBetterThanHttpie.g:2684:1: ( ( rule__AuthFlag__HostnameAssignment_4_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:2684:1: ( ( rule__AuthFlag__HostnameAssignment_4_1 ) )
            // InternalCurlBetterThanHttpie.g:2685:2: ( rule__AuthFlag__HostnameAssignment_4_1 )
            {
             before(grammarAccess.getAuthFlagAccess().getHostnameAssignment_4_1()); 
            // InternalCurlBetterThanHttpie.g:2686:2: ( rule__AuthFlag__HostnameAssignment_4_1 )
            // InternalCurlBetterThanHttpie.g:2686:3: rule__AuthFlag__HostnameAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__AuthFlag__HostnameAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getAuthFlagAccess().getHostnameAssignment_4_1()); 

            }


            }

        }
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
    // InternalCurlBetterThanHttpie.g:2695:1: rule__DownloadFlag__Group__0 : rule__DownloadFlag__Group__0__Impl rule__DownloadFlag__Group__1 ;
    public final void rule__DownloadFlag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2699:1: ( rule__DownloadFlag__Group__0__Impl rule__DownloadFlag__Group__1 )
            // InternalCurlBetterThanHttpie.g:2700:2: rule__DownloadFlag__Group__0__Impl rule__DownloadFlag__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalCurlBetterThanHttpie.g:2707:1: rule__DownloadFlag__Group__0__Impl : ( () ) ;
    public final void rule__DownloadFlag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2711:1: ( ( () ) )
            // InternalCurlBetterThanHttpie.g:2712:1: ( () )
            {
            // InternalCurlBetterThanHttpie.g:2712:1: ( () )
            // InternalCurlBetterThanHttpie.g:2713:2: ()
            {
             before(grammarAccess.getDownloadFlagAccess().getDownloadFlagAction_0()); 
            // InternalCurlBetterThanHttpie.g:2714:2: ()
            // InternalCurlBetterThanHttpie.g:2714:3: 
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
    // InternalCurlBetterThanHttpie.g:2722:1: rule__DownloadFlag__Group__1 : rule__DownloadFlag__Group__1__Impl ;
    public final void rule__DownloadFlag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2726:1: ( rule__DownloadFlag__Group__1__Impl )
            // InternalCurlBetterThanHttpie.g:2727:2: rule__DownloadFlag__Group__1__Impl
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
    // InternalCurlBetterThanHttpie.g:2733:1: rule__DownloadFlag__Group__1__Impl : ( ( rule__DownloadFlag__Alternatives_1 ) ) ;
    public final void rule__DownloadFlag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2737:1: ( ( ( rule__DownloadFlag__Alternatives_1 ) ) )
            // InternalCurlBetterThanHttpie.g:2738:1: ( ( rule__DownloadFlag__Alternatives_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:2738:1: ( ( rule__DownloadFlag__Alternatives_1 ) )
            // InternalCurlBetterThanHttpie.g:2739:2: ( rule__DownloadFlag__Alternatives_1 )
            {
             before(grammarAccess.getDownloadFlagAccess().getAlternatives_1()); 
            // InternalCurlBetterThanHttpie.g:2740:2: ( rule__DownloadFlag__Alternatives_1 )
            // InternalCurlBetterThanHttpie.g:2740:3: rule__DownloadFlag__Alternatives_1
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
    // InternalCurlBetterThanHttpie.g:2749:1: rule__HelpFlag__Group__0 : rule__HelpFlag__Group__0__Impl rule__HelpFlag__Group__1 ;
    public final void rule__HelpFlag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2753:1: ( rule__HelpFlag__Group__0__Impl rule__HelpFlag__Group__1 )
            // InternalCurlBetterThanHttpie.g:2754:2: rule__HelpFlag__Group__0__Impl rule__HelpFlag__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalCurlBetterThanHttpie.g:2761:1: rule__HelpFlag__Group__0__Impl : ( () ) ;
    public final void rule__HelpFlag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2765:1: ( ( () ) )
            // InternalCurlBetterThanHttpie.g:2766:1: ( () )
            {
            // InternalCurlBetterThanHttpie.g:2766:1: ( () )
            // InternalCurlBetterThanHttpie.g:2767:2: ()
            {
             before(grammarAccess.getHelpFlagAccess().getHelpFlagAction_0()); 
            // InternalCurlBetterThanHttpie.g:2768:2: ()
            // InternalCurlBetterThanHttpie.g:2768:3: 
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
    // InternalCurlBetterThanHttpie.g:2776:1: rule__HelpFlag__Group__1 : rule__HelpFlag__Group__1__Impl ;
    public final void rule__HelpFlag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2780:1: ( rule__HelpFlag__Group__1__Impl )
            // InternalCurlBetterThanHttpie.g:2781:2: rule__HelpFlag__Group__1__Impl
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
    // InternalCurlBetterThanHttpie.g:2787:1: rule__HelpFlag__Group__1__Impl : ( ( rule__HelpFlag__Alternatives_1 ) ) ;
    public final void rule__HelpFlag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2791:1: ( ( ( rule__HelpFlag__Alternatives_1 ) ) )
            // InternalCurlBetterThanHttpie.g:2792:1: ( ( rule__HelpFlag__Alternatives_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:2792:1: ( ( rule__HelpFlag__Alternatives_1 ) )
            // InternalCurlBetterThanHttpie.g:2793:2: ( rule__HelpFlag__Alternatives_1 )
            {
             before(grammarAccess.getHelpFlagAccess().getAlternatives_1()); 
            // InternalCurlBetterThanHttpie.g:2794:2: ( rule__HelpFlag__Alternatives_1 )
            // InternalCurlBetterThanHttpie.g:2794:3: rule__HelpFlag__Alternatives_1
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
    // InternalCurlBetterThanHttpie.g:2803:1: rule__VersionFlag__Group__0 : rule__VersionFlag__Group__0__Impl rule__VersionFlag__Group__1 ;
    public final void rule__VersionFlag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2807:1: ( rule__VersionFlag__Group__0__Impl rule__VersionFlag__Group__1 )
            // InternalCurlBetterThanHttpie.g:2808:2: rule__VersionFlag__Group__0__Impl rule__VersionFlag__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalCurlBetterThanHttpie.g:2815:1: rule__VersionFlag__Group__0__Impl : ( () ) ;
    public final void rule__VersionFlag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2819:1: ( ( () ) )
            // InternalCurlBetterThanHttpie.g:2820:1: ( () )
            {
            // InternalCurlBetterThanHttpie.g:2820:1: ( () )
            // InternalCurlBetterThanHttpie.g:2821:2: ()
            {
             before(grammarAccess.getVersionFlagAccess().getVersionFlagAction_0()); 
            // InternalCurlBetterThanHttpie.g:2822:2: ()
            // InternalCurlBetterThanHttpie.g:2822:3: 
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
    // InternalCurlBetterThanHttpie.g:2830:1: rule__VersionFlag__Group__1 : rule__VersionFlag__Group__1__Impl ;
    public final void rule__VersionFlag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2834:1: ( rule__VersionFlag__Group__1__Impl )
            // InternalCurlBetterThanHttpie.g:2835:2: rule__VersionFlag__Group__1__Impl
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
    // InternalCurlBetterThanHttpie.g:2841:1: rule__VersionFlag__Group__1__Impl : ( '--version' ) ;
    public final void rule__VersionFlag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2845:1: ( ( '--version' ) )
            // InternalCurlBetterThanHttpie.g:2846:1: ( '--version' )
            {
            // InternalCurlBetterThanHttpie.g:2846:1: ( '--version' )
            // InternalCurlBetterThanHttpie.g:2847:2: '--version'
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
    // InternalCurlBetterThanHttpie.g:2857:1: rule__VerboseFlag__Group__0 : rule__VerboseFlag__Group__0__Impl rule__VerboseFlag__Group__1 ;
    public final void rule__VerboseFlag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2861:1: ( rule__VerboseFlag__Group__0__Impl rule__VerboseFlag__Group__1 )
            // InternalCurlBetterThanHttpie.g:2862:2: rule__VerboseFlag__Group__0__Impl rule__VerboseFlag__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalCurlBetterThanHttpie.g:2869:1: rule__VerboseFlag__Group__0__Impl : ( () ) ;
    public final void rule__VerboseFlag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2873:1: ( ( () ) )
            // InternalCurlBetterThanHttpie.g:2874:1: ( () )
            {
            // InternalCurlBetterThanHttpie.g:2874:1: ( () )
            // InternalCurlBetterThanHttpie.g:2875:2: ()
            {
             before(grammarAccess.getVerboseFlagAccess().getVerboseFlagAction_0()); 
            // InternalCurlBetterThanHttpie.g:2876:2: ()
            // InternalCurlBetterThanHttpie.g:2876:3: 
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
    // InternalCurlBetterThanHttpie.g:2884:1: rule__VerboseFlag__Group__1 : rule__VerboseFlag__Group__1__Impl ;
    public final void rule__VerboseFlag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2888:1: ( rule__VerboseFlag__Group__1__Impl )
            // InternalCurlBetterThanHttpie.g:2889:2: rule__VerboseFlag__Group__1__Impl
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
    // InternalCurlBetterThanHttpie.g:2895:1: rule__VerboseFlag__Group__1__Impl : ( ( rule__VerboseFlag__Alternatives_1 ) ) ;
    public final void rule__VerboseFlag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2899:1: ( ( ( rule__VerboseFlag__Alternatives_1 ) ) )
            // InternalCurlBetterThanHttpie.g:2900:1: ( ( rule__VerboseFlag__Alternatives_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:2900:1: ( ( rule__VerboseFlag__Alternatives_1 ) )
            // InternalCurlBetterThanHttpie.g:2901:2: ( rule__VerboseFlag__Alternatives_1 )
            {
             before(grammarAccess.getVerboseFlagAccess().getAlternatives_1()); 
            // InternalCurlBetterThanHttpie.g:2902:2: ( rule__VerboseFlag__Alternatives_1 )
            // InternalCurlBetterThanHttpie.g:2902:3: rule__VerboseFlag__Alternatives_1
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
    // InternalCurlBetterThanHttpie.g:2911:1: rule__TimeoutFlag__Group__0 : rule__TimeoutFlag__Group__0__Impl rule__TimeoutFlag__Group__1 ;
    public final void rule__TimeoutFlag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2915:1: ( rule__TimeoutFlag__Group__0__Impl rule__TimeoutFlag__Group__1 )
            // InternalCurlBetterThanHttpie.g:2916:2: rule__TimeoutFlag__Group__0__Impl rule__TimeoutFlag__Group__1
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
    // InternalCurlBetterThanHttpie.g:2923:1: rule__TimeoutFlag__Group__0__Impl : ( '--timeout' ) ;
    public final void rule__TimeoutFlag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2927:1: ( ( '--timeout' ) )
            // InternalCurlBetterThanHttpie.g:2928:1: ( '--timeout' )
            {
            // InternalCurlBetterThanHttpie.g:2928:1: ( '--timeout' )
            // InternalCurlBetterThanHttpie.g:2929:2: '--timeout'
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
    // InternalCurlBetterThanHttpie.g:2938:1: rule__TimeoutFlag__Group__1 : rule__TimeoutFlag__Group__1__Impl rule__TimeoutFlag__Group__2 ;
    public final void rule__TimeoutFlag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2942:1: ( rule__TimeoutFlag__Group__1__Impl rule__TimeoutFlag__Group__2 )
            // InternalCurlBetterThanHttpie.g:2943:2: rule__TimeoutFlag__Group__1__Impl rule__TimeoutFlag__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalCurlBetterThanHttpie.g:2950:1: rule__TimeoutFlag__Group__1__Impl : ( RULE_VALUE ) ;
    public final void rule__TimeoutFlag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2954:1: ( ( RULE_VALUE ) )
            // InternalCurlBetterThanHttpie.g:2955:1: ( RULE_VALUE )
            {
            // InternalCurlBetterThanHttpie.g:2955:1: ( RULE_VALUE )
            // InternalCurlBetterThanHttpie.g:2956:2: RULE_VALUE
            {
             before(grammarAccess.getTimeoutFlagAccess().getVALUETerminalRuleCall_1()); 
            match(input,RULE_VALUE,FOLLOW_2); 
             after(grammarAccess.getTimeoutFlagAccess().getVALUETerminalRuleCall_1()); 

            }


            }

        }
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
    // InternalCurlBetterThanHttpie.g:2965:1: rule__TimeoutFlag__Group__2 : rule__TimeoutFlag__Group__2__Impl ;
    public final void rule__TimeoutFlag__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2969:1: ( rule__TimeoutFlag__Group__2__Impl )
            // InternalCurlBetterThanHttpie.g:2970:2: rule__TimeoutFlag__Group__2__Impl
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
    // InternalCurlBetterThanHttpie.g:2976:1: rule__TimeoutFlag__Group__2__Impl : ( ( rule__TimeoutFlag__TimeoutAssignment_2 ) ) ;
    public final void rule__TimeoutFlag__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2980:1: ( ( ( rule__TimeoutFlag__TimeoutAssignment_2 ) ) )
            // InternalCurlBetterThanHttpie.g:2981:1: ( ( rule__TimeoutFlag__TimeoutAssignment_2 ) )
            {
            // InternalCurlBetterThanHttpie.g:2981:1: ( ( rule__TimeoutFlag__TimeoutAssignment_2 ) )
            // InternalCurlBetterThanHttpie.g:2982:2: ( rule__TimeoutFlag__TimeoutAssignment_2 )
            {
             before(grammarAccess.getTimeoutFlagAccess().getTimeoutAssignment_2()); 
            // InternalCurlBetterThanHttpie.g:2983:2: ( rule__TimeoutFlag__TimeoutAssignment_2 )
            // InternalCurlBetterThanHttpie.g:2983:3: rule__TimeoutFlag__TimeoutAssignment_2
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


    // $ANTLR start "rule__FormFileFieldItem__Group__0"
    // InternalCurlBetterThanHttpie.g:2992:1: rule__FormFileFieldItem__Group__0 : rule__FormFileFieldItem__Group__0__Impl rule__FormFileFieldItem__Group__1 ;
    public final void rule__FormFileFieldItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2996:1: ( rule__FormFileFieldItem__Group__0__Impl rule__FormFileFieldItem__Group__1 )
            // InternalCurlBetterThanHttpie.g:2997:2: rule__FormFileFieldItem__Group__0__Impl rule__FormFileFieldItem__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalCurlBetterThanHttpie.g:3004:1: rule__FormFileFieldItem__Group__0__Impl : ( ( rule__FormFileFieldItem__FieldAssignment_0 ) ) ;
    public final void rule__FormFileFieldItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3008:1: ( ( ( rule__FormFileFieldItem__FieldAssignment_0 ) ) )
            // InternalCurlBetterThanHttpie.g:3009:1: ( ( rule__FormFileFieldItem__FieldAssignment_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:3009:1: ( ( rule__FormFileFieldItem__FieldAssignment_0 ) )
            // InternalCurlBetterThanHttpie.g:3010:2: ( rule__FormFileFieldItem__FieldAssignment_0 )
            {
             before(grammarAccess.getFormFileFieldItemAccess().getFieldAssignment_0()); 
            // InternalCurlBetterThanHttpie.g:3011:2: ( rule__FormFileFieldItem__FieldAssignment_0 )
            // InternalCurlBetterThanHttpie.g:3011:3: rule__FormFileFieldItem__FieldAssignment_0
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
    // InternalCurlBetterThanHttpie.g:3019:1: rule__FormFileFieldItem__Group__1 : rule__FormFileFieldItem__Group__1__Impl rule__FormFileFieldItem__Group__2 ;
    public final void rule__FormFileFieldItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3023:1: ( rule__FormFileFieldItem__Group__1__Impl rule__FormFileFieldItem__Group__2 )
            // InternalCurlBetterThanHttpie.g:3024:2: rule__FormFileFieldItem__Group__1__Impl rule__FormFileFieldItem__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalCurlBetterThanHttpie.g:3031:1: rule__FormFileFieldItem__Group__1__Impl : ( '@' ) ;
    public final void rule__FormFileFieldItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3035:1: ( ( '@' ) )
            // InternalCurlBetterThanHttpie.g:3036:1: ( '@' )
            {
            // InternalCurlBetterThanHttpie.g:3036:1: ( '@' )
            // InternalCurlBetterThanHttpie.g:3037:2: '@'
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
    // InternalCurlBetterThanHttpie.g:3046:1: rule__FormFileFieldItem__Group__2 : rule__FormFileFieldItem__Group__2__Impl ;
    public final void rule__FormFileFieldItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3050:1: ( rule__FormFileFieldItem__Group__2__Impl )
            // InternalCurlBetterThanHttpie.g:3051:2: rule__FormFileFieldItem__Group__2__Impl
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
    // InternalCurlBetterThanHttpie.g:3057:1: rule__FormFileFieldItem__Group__2__Impl : ( ( rule__FormFileFieldItem__ValueAssignment_2 ) ) ;
    public final void rule__FormFileFieldItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3061:1: ( ( ( rule__FormFileFieldItem__ValueAssignment_2 ) ) )
            // InternalCurlBetterThanHttpie.g:3062:1: ( ( rule__FormFileFieldItem__ValueAssignment_2 ) )
            {
            // InternalCurlBetterThanHttpie.g:3062:1: ( ( rule__FormFileFieldItem__ValueAssignment_2 ) )
            // InternalCurlBetterThanHttpie.g:3063:2: ( rule__FormFileFieldItem__ValueAssignment_2 )
            {
             before(grammarAccess.getFormFileFieldItemAccess().getValueAssignment_2()); 
            // InternalCurlBetterThanHttpie.g:3064:2: ( rule__FormFileFieldItem__ValueAssignment_2 )
            // InternalCurlBetterThanHttpie.g:3064:3: rule__FormFileFieldItem__ValueAssignment_2
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
    // InternalCurlBetterThanHttpie.g:3073:1: rule__DataFieldItem__Group__0 : rule__DataFieldItem__Group__0__Impl rule__DataFieldItem__Group__1 ;
    public final void rule__DataFieldItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3077:1: ( rule__DataFieldItem__Group__0__Impl rule__DataFieldItem__Group__1 )
            // InternalCurlBetterThanHttpie.g:3078:2: rule__DataFieldItem__Group__0__Impl rule__DataFieldItem__Group__1
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
    // InternalCurlBetterThanHttpie.g:3085:1: rule__DataFieldItem__Group__0__Impl : ( ( rule__DataFieldItem__FieldAssignment_0 ) ) ;
    public final void rule__DataFieldItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3089:1: ( ( ( rule__DataFieldItem__FieldAssignment_0 ) ) )
            // InternalCurlBetterThanHttpie.g:3090:1: ( ( rule__DataFieldItem__FieldAssignment_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:3090:1: ( ( rule__DataFieldItem__FieldAssignment_0 ) )
            // InternalCurlBetterThanHttpie.g:3091:2: ( rule__DataFieldItem__FieldAssignment_0 )
            {
             before(grammarAccess.getDataFieldItemAccess().getFieldAssignment_0()); 
            // InternalCurlBetterThanHttpie.g:3092:2: ( rule__DataFieldItem__FieldAssignment_0 )
            // InternalCurlBetterThanHttpie.g:3092:3: rule__DataFieldItem__FieldAssignment_0
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
    // InternalCurlBetterThanHttpie.g:3100:1: rule__DataFieldItem__Group__1 : rule__DataFieldItem__Group__1__Impl rule__DataFieldItem__Group__2 ;
    public final void rule__DataFieldItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3104:1: ( rule__DataFieldItem__Group__1__Impl rule__DataFieldItem__Group__2 )
            // InternalCurlBetterThanHttpie.g:3105:2: rule__DataFieldItem__Group__1__Impl rule__DataFieldItem__Group__2
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
    // InternalCurlBetterThanHttpie.g:3112:1: rule__DataFieldItem__Group__1__Impl : ( '=' ) ;
    public final void rule__DataFieldItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3116:1: ( ( '=' ) )
            // InternalCurlBetterThanHttpie.g:3117:1: ( '=' )
            {
            // InternalCurlBetterThanHttpie.g:3117:1: ( '=' )
            // InternalCurlBetterThanHttpie.g:3118:2: '='
            {
             before(grammarAccess.getDataFieldItemAccess().getEqualsSignKeyword_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalCurlBetterThanHttpie.g:3127:1: rule__DataFieldItem__Group__2 : rule__DataFieldItem__Group__2__Impl ;
    public final void rule__DataFieldItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3131:1: ( rule__DataFieldItem__Group__2__Impl )
            // InternalCurlBetterThanHttpie.g:3132:2: rule__DataFieldItem__Group__2__Impl
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
    // InternalCurlBetterThanHttpie.g:3138:1: rule__DataFieldItem__Group__2__Impl : ( ( rule__DataFieldItem__Alternatives_2 ) ) ;
    public final void rule__DataFieldItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3142:1: ( ( ( rule__DataFieldItem__Alternatives_2 ) ) )
            // InternalCurlBetterThanHttpie.g:3143:1: ( ( rule__DataFieldItem__Alternatives_2 ) )
            {
            // InternalCurlBetterThanHttpie.g:3143:1: ( ( rule__DataFieldItem__Alternatives_2 ) )
            // InternalCurlBetterThanHttpie.g:3144:2: ( rule__DataFieldItem__Alternatives_2 )
            {
             before(grammarAccess.getDataFieldItemAccess().getAlternatives_2()); 
            // InternalCurlBetterThanHttpie.g:3145:2: ( rule__DataFieldItem__Alternatives_2 )
            // InternalCurlBetterThanHttpie.g:3145:3: rule__DataFieldItem__Alternatives_2
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
    // InternalCurlBetterThanHttpie.g:3154:1: rule__DataFieldItem__Group_2_1__0 : rule__DataFieldItem__Group_2_1__0__Impl rule__DataFieldItem__Group_2_1__1 ;
    public final void rule__DataFieldItem__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3158:1: ( rule__DataFieldItem__Group_2_1__0__Impl rule__DataFieldItem__Group_2_1__1 )
            // InternalCurlBetterThanHttpie.g:3159:2: rule__DataFieldItem__Group_2_1__0__Impl rule__DataFieldItem__Group_2_1__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalCurlBetterThanHttpie.g:3166:1: rule__DataFieldItem__Group_2_1__0__Impl : ( '@' ) ;
    public final void rule__DataFieldItem__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3170:1: ( ( '@' ) )
            // InternalCurlBetterThanHttpie.g:3171:1: ( '@' )
            {
            // InternalCurlBetterThanHttpie.g:3171:1: ( '@' )
            // InternalCurlBetterThanHttpie.g:3172:2: '@'
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
    // InternalCurlBetterThanHttpie.g:3181:1: rule__DataFieldItem__Group_2_1__1 : rule__DataFieldItem__Group_2_1__1__Impl ;
    public final void rule__DataFieldItem__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3185:1: ( rule__DataFieldItem__Group_2_1__1__Impl )
            // InternalCurlBetterThanHttpie.g:3186:2: rule__DataFieldItem__Group_2_1__1__Impl
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
    // InternalCurlBetterThanHttpie.g:3192:1: rule__DataFieldItem__Group_2_1__1__Impl : ( ( rule__DataFieldItem__ValueAssignment_2_1_1 ) ) ;
    public final void rule__DataFieldItem__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3196:1: ( ( ( rule__DataFieldItem__ValueAssignment_2_1_1 ) ) )
            // InternalCurlBetterThanHttpie.g:3197:1: ( ( rule__DataFieldItem__ValueAssignment_2_1_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:3197:1: ( ( rule__DataFieldItem__ValueAssignment_2_1_1 ) )
            // InternalCurlBetterThanHttpie.g:3198:2: ( rule__DataFieldItem__ValueAssignment_2_1_1 )
            {
             before(grammarAccess.getDataFieldItemAccess().getValueAssignment_2_1_1()); 
            // InternalCurlBetterThanHttpie.g:3199:2: ( rule__DataFieldItem__ValueAssignment_2_1_1 )
            // InternalCurlBetterThanHttpie.g:3199:3: rule__DataFieldItem__ValueAssignment_2_1_1
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


    // $ANTLR start "rule__HttpHeaderItem__Group__0"
    // InternalCurlBetterThanHttpie.g:3208:1: rule__HttpHeaderItem__Group__0 : rule__HttpHeaderItem__Group__0__Impl rule__HttpHeaderItem__Group__1 ;
    public final void rule__HttpHeaderItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3212:1: ( rule__HttpHeaderItem__Group__0__Impl rule__HttpHeaderItem__Group__1 )
            // InternalCurlBetterThanHttpie.g:3213:2: rule__HttpHeaderItem__Group__0__Impl rule__HttpHeaderItem__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalCurlBetterThanHttpie.g:3220:1: rule__HttpHeaderItem__Group__0__Impl : ( ( rule__HttpHeaderItem__FieldAssignment_0 ) ) ;
    public final void rule__HttpHeaderItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3224:1: ( ( ( rule__HttpHeaderItem__FieldAssignment_0 ) ) )
            // InternalCurlBetterThanHttpie.g:3225:1: ( ( rule__HttpHeaderItem__FieldAssignment_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:3225:1: ( ( rule__HttpHeaderItem__FieldAssignment_0 ) )
            // InternalCurlBetterThanHttpie.g:3226:2: ( rule__HttpHeaderItem__FieldAssignment_0 )
            {
             before(grammarAccess.getHttpHeaderItemAccess().getFieldAssignment_0()); 
            // InternalCurlBetterThanHttpie.g:3227:2: ( rule__HttpHeaderItem__FieldAssignment_0 )
            // InternalCurlBetterThanHttpie.g:3227:3: rule__HttpHeaderItem__FieldAssignment_0
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
    // InternalCurlBetterThanHttpie.g:3235:1: rule__HttpHeaderItem__Group__1 : rule__HttpHeaderItem__Group__1__Impl rule__HttpHeaderItem__Group__2 ;
    public final void rule__HttpHeaderItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3239:1: ( rule__HttpHeaderItem__Group__1__Impl rule__HttpHeaderItem__Group__2 )
            // InternalCurlBetterThanHttpie.g:3240:2: rule__HttpHeaderItem__Group__1__Impl rule__HttpHeaderItem__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalCurlBetterThanHttpie.g:3247:1: rule__HttpHeaderItem__Group__1__Impl : ( ':' ) ;
    public final void rule__HttpHeaderItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3251:1: ( ( ':' ) )
            // InternalCurlBetterThanHttpie.g:3252:1: ( ':' )
            {
            // InternalCurlBetterThanHttpie.g:3252:1: ( ':' )
            // InternalCurlBetterThanHttpie.g:3253:2: ':'
            {
             before(grammarAccess.getHttpHeaderItemAccess().getColonKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalCurlBetterThanHttpie.g:3262:1: rule__HttpHeaderItem__Group__2 : rule__HttpHeaderItem__Group__2__Impl ;
    public final void rule__HttpHeaderItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3266:1: ( rule__HttpHeaderItem__Group__2__Impl )
            // InternalCurlBetterThanHttpie.g:3267:2: rule__HttpHeaderItem__Group__2__Impl
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
    // InternalCurlBetterThanHttpie.g:3273:1: rule__HttpHeaderItem__Group__2__Impl : ( ( rule__HttpHeaderItem__ValueAssignment_2 ) ) ;
    public final void rule__HttpHeaderItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3277:1: ( ( ( rule__HttpHeaderItem__ValueAssignment_2 ) ) )
            // InternalCurlBetterThanHttpie.g:3278:1: ( ( rule__HttpHeaderItem__ValueAssignment_2 ) )
            {
            // InternalCurlBetterThanHttpie.g:3278:1: ( ( rule__HttpHeaderItem__ValueAssignment_2 ) )
            // InternalCurlBetterThanHttpie.g:3279:2: ( rule__HttpHeaderItem__ValueAssignment_2 )
            {
             before(grammarAccess.getHttpHeaderItemAccess().getValueAssignment_2()); 
            // InternalCurlBetterThanHttpie.g:3280:2: ( rule__HttpHeaderItem__ValueAssignment_2 )
            // InternalCurlBetterThanHttpie.g:3280:3: rule__HttpHeaderItem__ValueAssignment_2
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


    // $ANTLR start "rule__UrlParameterItem__Group__0"
    // InternalCurlBetterThanHttpie.g:3289:1: rule__UrlParameterItem__Group__0 : rule__UrlParameterItem__Group__0__Impl rule__UrlParameterItem__Group__1 ;
    public final void rule__UrlParameterItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3293:1: ( rule__UrlParameterItem__Group__0__Impl rule__UrlParameterItem__Group__1 )
            // InternalCurlBetterThanHttpie.g:3294:2: rule__UrlParameterItem__Group__0__Impl rule__UrlParameterItem__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalCurlBetterThanHttpie.g:3301:1: rule__UrlParameterItem__Group__0__Impl : ( ( rule__UrlParameterItem__FieldAssignment_0 ) ) ;
    public final void rule__UrlParameterItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3305:1: ( ( ( rule__UrlParameterItem__FieldAssignment_0 ) ) )
            // InternalCurlBetterThanHttpie.g:3306:1: ( ( rule__UrlParameterItem__FieldAssignment_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:3306:1: ( ( rule__UrlParameterItem__FieldAssignment_0 ) )
            // InternalCurlBetterThanHttpie.g:3307:2: ( rule__UrlParameterItem__FieldAssignment_0 )
            {
             before(grammarAccess.getUrlParameterItemAccess().getFieldAssignment_0()); 
            // InternalCurlBetterThanHttpie.g:3308:2: ( rule__UrlParameterItem__FieldAssignment_0 )
            // InternalCurlBetterThanHttpie.g:3308:3: rule__UrlParameterItem__FieldAssignment_0
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
    // InternalCurlBetterThanHttpie.g:3316:1: rule__UrlParameterItem__Group__1 : rule__UrlParameterItem__Group__1__Impl rule__UrlParameterItem__Group__2 ;
    public final void rule__UrlParameterItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3320:1: ( rule__UrlParameterItem__Group__1__Impl rule__UrlParameterItem__Group__2 )
            // InternalCurlBetterThanHttpie.g:3321:2: rule__UrlParameterItem__Group__1__Impl rule__UrlParameterItem__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalCurlBetterThanHttpie.g:3328:1: rule__UrlParameterItem__Group__1__Impl : ( '==' ) ;
    public final void rule__UrlParameterItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3332:1: ( ( '==' ) )
            // InternalCurlBetterThanHttpie.g:3333:1: ( '==' )
            {
            // InternalCurlBetterThanHttpie.g:3333:1: ( '==' )
            // InternalCurlBetterThanHttpie.g:3334:2: '=='
            {
             before(grammarAccess.getUrlParameterItemAccess().getEqualsSignEqualsSignKeyword_1()); 
            match(input,44,FOLLOW_2); 
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
    // InternalCurlBetterThanHttpie.g:3343:1: rule__UrlParameterItem__Group__2 : rule__UrlParameterItem__Group__2__Impl ;
    public final void rule__UrlParameterItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3347:1: ( rule__UrlParameterItem__Group__2__Impl )
            // InternalCurlBetterThanHttpie.g:3348:2: rule__UrlParameterItem__Group__2__Impl
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
    // InternalCurlBetterThanHttpie.g:3354:1: rule__UrlParameterItem__Group__2__Impl : ( ( rule__UrlParameterItem__ValueAssignment_2 ) ) ;
    public final void rule__UrlParameterItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3358:1: ( ( ( rule__UrlParameterItem__ValueAssignment_2 ) ) )
            // InternalCurlBetterThanHttpie.g:3359:1: ( ( rule__UrlParameterItem__ValueAssignment_2 ) )
            {
            // InternalCurlBetterThanHttpie.g:3359:1: ( ( rule__UrlParameterItem__ValueAssignment_2 ) )
            // InternalCurlBetterThanHttpie.g:3360:2: ( rule__UrlParameterItem__ValueAssignment_2 )
            {
             before(grammarAccess.getUrlParameterItemAccess().getValueAssignment_2()); 
            // InternalCurlBetterThanHttpie.g:3361:2: ( rule__UrlParameterItem__ValueAssignment_2 )
            // InternalCurlBetterThanHttpie.g:3361:3: rule__UrlParameterItem__ValueAssignment_2
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


    // $ANTLR start "rule__JsonBoolean__Group__0"
    // InternalCurlBetterThanHttpie.g:3370:1: rule__JsonBoolean__Group__0 : rule__JsonBoolean__Group__0__Impl rule__JsonBoolean__Group__1 ;
    public final void rule__JsonBoolean__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3374:1: ( rule__JsonBoolean__Group__0__Impl rule__JsonBoolean__Group__1 )
            // InternalCurlBetterThanHttpie.g:3375:2: rule__JsonBoolean__Group__0__Impl rule__JsonBoolean__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__JsonBoolean__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JsonBoolean__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonBoolean__Group__0"


    // $ANTLR start "rule__JsonBoolean__Group__0__Impl"
    // InternalCurlBetterThanHttpie.g:3382:1: rule__JsonBoolean__Group__0__Impl : ( () ) ;
    public final void rule__JsonBoolean__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3386:1: ( ( () ) )
            // InternalCurlBetterThanHttpie.g:3387:1: ( () )
            {
            // InternalCurlBetterThanHttpie.g:3387:1: ( () )
            // InternalCurlBetterThanHttpie.g:3388:2: ()
            {
             before(grammarAccess.getJsonBooleanAccess().getJsonBooleanAction_0()); 
            // InternalCurlBetterThanHttpie.g:3389:2: ()
            // InternalCurlBetterThanHttpie.g:3389:3: 
            {
            }

             after(grammarAccess.getJsonBooleanAccess().getJsonBooleanAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonBoolean__Group__0__Impl"


    // $ANTLR start "rule__JsonBoolean__Group__1"
    // InternalCurlBetterThanHttpie.g:3397:1: rule__JsonBoolean__Group__1 : rule__JsonBoolean__Group__1__Impl ;
    public final void rule__JsonBoolean__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3401:1: ( rule__JsonBoolean__Group__1__Impl )
            // InternalCurlBetterThanHttpie.g:3402:2: rule__JsonBoolean__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JsonBoolean__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonBoolean__Group__1"


    // $ANTLR start "rule__JsonBoolean__Group__1__Impl"
    // InternalCurlBetterThanHttpie.g:3408:1: rule__JsonBoolean__Group__1__Impl : ( RULE_BOOLEAN ) ;
    public final void rule__JsonBoolean__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3412:1: ( ( RULE_BOOLEAN ) )
            // InternalCurlBetterThanHttpie.g:3413:1: ( RULE_BOOLEAN )
            {
            // InternalCurlBetterThanHttpie.g:3413:1: ( RULE_BOOLEAN )
            // InternalCurlBetterThanHttpie.g:3414:2: RULE_BOOLEAN
            {
             before(grammarAccess.getJsonBooleanAccess().getBOOLEANTerminalRuleCall_1()); 
            match(input,RULE_BOOLEAN,FOLLOW_2); 
             after(grammarAccess.getJsonBooleanAccess().getBOOLEANTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonBoolean__Group__1__Impl"


    // $ANTLR start "rule__JsonObject__Group__0"
    // InternalCurlBetterThanHttpie.g:3424:1: rule__JsonObject__Group__0 : rule__JsonObject__Group__0__Impl rule__JsonObject__Group__1 ;
    public final void rule__JsonObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3428:1: ( rule__JsonObject__Group__0__Impl rule__JsonObject__Group__1 )
            // InternalCurlBetterThanHttpie.g:3429:2: rule__JsonObject__Group__0__Impl rule__JsonObject__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalCurlBetterThanHttpie.g:3436:1: rule__JsonObject__Group__0__Impl : ( () ) ;
    public final void rule__JsonObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3440:1: ( ( () ) )
            // InternalCurlBetterThanHttpie.g:3441:1: ( () )
            {
            // InternalCurlBetterThanHttpie.g:3441:1: ( () )
            // InternalCurlBetterThanHttpie.g:3442:2: ()
            {
             before(grammarAccess.getJsonObjectAccess().getJsonObjectAction_0()); 
            // InternalCurlBetterThanHttpie.g:3443:2: ()
            // InternalCurlBetterThanHttpie.g:3443:3: 
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
    // InternalCurlBetterThanHttpie.g:3451:1: rule__JsonObject__Group__1 : rule__JsonObject__Group__1__Impl rule__JsonObject__Group__2 ;
    public final void rule__JsonObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3455:1: ( rule__JsonObject__Group__1__Impl rule__JsonObject__Group__2 )
            // InternalCurlBetterThanHttpie.g:3456:2: rule__JsonObject__Group__1__Impl rule__JsonObject__Group__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalCurlBetterThanHttpie.g:3463:1: rule__JsonObject__Group__1__Impl : ( '{' ) ;
    public final void rule__JsonObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3467:1: ( ( '{' ) )
            // InternalCurlBetterThanHttpie.g:3468:1: ( '{' )
            {
            // InternalCurlBetterThanHttpie.g:3468:1: ( '{' )
            // InternalCurlBetterThanHttpie.g:3469:2: '{'
            {
             before(grammarAccess.getJsonObjectAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,45,FOLLOW_2); 
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
    // InternalCurlBetterThanHttpie.g:3478:1: rule__JsonObject__Group__2 : rule__JsonObject__Group__2__Impl rule__JsonObject__Group__3 ;
    public final void rule__JsonObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3482:1: ( rule__JsonObject__Group__2__Impl rule__JsonObject__Group__3 )
            // InternalCurlBetterThanHttpie.g:3483:2: rule__JsonObject__Group__2__Impl rule__JsonObject__Group__3
            {
            pushFollow(FOLLOW_34);
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
    // InternalCurlBetterThanHttpie.g:3490:1: rule__JsonObject__Group__2__Impl : ( ( rule__JsonObject__Alternatives_2 ) ) ;
    public final void rule__JsonObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3494:1: ( ( ( rule__JsonObject__Alternatives_2 ) ) )
            // InternalCurlBetterThanHttpie.g:3495:1: ( ( rule__JsonObject__Alternatives_2 ) )
            {
            // InternalCurlBetterThanHttpie.g:3495:1: ( ( rule__JsonObject__Alternatives_2 ) )
            // InternalCurlBetterThanHttpie.g:3496:2: ( rule__JsonObject__Alternatives_2 )
            {
             before(grammarAccess.getJsonObjectAccess().getAlternatives_2()); 
            // InternalCurlBetterThanHttpie.g:3497:2: ( rule__JsonObject__Alternatives_2 )
            // InternalCurlBetterThanHttpie.g:3497:3: rule__JsonObject__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__JsonObject__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getJsonObjectAccess().getAlternatives_2()); 

            }


            }

        }
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
    // InternalCurlBetterThanHttpie.g:3505:1: rule__JsonObject__Group__3 : rule__JsonObject__Group__3__Impl ;
    public final void rule__JsonObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3509:1: ( rule__JsonObject__Group__3__Impl )
            // InternalCurlBetterThanHttpie.g:3510:2: rule__JsonObject__Group__3__Impl
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
    // InternalCurlBetterThanHttpie.g:3516:1: rule__JsonObject__Group__3__Impl : ( '}' ) ;
    public final void rule__JsonObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3520:1: ( ( '}' ) )
            // InternalCurlBetterThanHttpie.g:3521:1: ( '}' )
            {
            // InternalCurlBetterThanHttpie.g:3521:1: ( '}' )
            // InternalCurlBetterThanHttpie.g:3522:2: '}'
            {
             before(grammarAccess.getJsonObjectAccess().getRightCurlyBracketKeyword_3()); 
            match(input,46,FOLLOW_2); 
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


    // $ANTLR start "rule__CommandLineInterface__FlagsAssignment_3_0"
    // InternalCurlBetterThanHttpie.g:3532:1: rule__CommandLineInterface__FlagsAssignment_3_0 : ( ruleFlag ) ;
    public final void rule__CommandLineInterface__FlagsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3536:1: ( ( ruleFlag ) )
            // InternalCurlBetterThanHttpie.g:3537:2: ( ruleFlag )
            {
            // InternalCurlBetterThanHttpie.g:3537:2: ( ruleFlag )
            // InternalCurlBetterThanHttpie.g:3538:3: ruleFlag
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getFlagsFlagParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFlag();

            state._fsp--;

             after(grammarAccess.getCommandLineInterfaceAccess().getFlagsFlagParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__FlagsAssignment_3_0"


    // $ANTLR start "rule__CommandLineInterface__MethodAssignment_4"
    // InternalCurlBetterThanHttpie.g:3547:1: rule__CommandLineInterface__MethodAssignment_4 : ( ruleMethod ) ;
    public final void rule__CommandLineInterface__MethodAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3551:1: ( ( ruleMethod ) )
            // InternalCurlBetterThanHttpie.g:3552:2: ( ruleMethod )
            {
            // InternalCurlBetterThanHttpie.g:3552:2: ( ruleMethod )
            // InternalCurlBetterThanHttpie.g:3553:3: ruleMethod
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getMethodMethodEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getCommandLineInterfaceAccess().getMethodMethodEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__MethodAssignment_4"


    // $ANTLR start "rule__CommandLineInterface__ProtocolAssignment_6_0"
    // InternalCurlBetterThanHttpie.g:3562:1: rule__CommandLineInterface__ProtocolAssignment_6_0 : ( RULE_STRING ) ;
    public final void rule__CommandLineInterface__ProtocolAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3566:1: ( ( RULE_STRING ) )
            // InternalCurlBetterThanHttpie.g:3567:2: ( RULE_STRING )
            {
            // InternalCurlBetterThanHttpie.g:3567:2: ( RULE_STRING )
            // InternalCurlBetterThanHttpie.g:3568:3: RULE_STRING
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getProtocolSTRINGTerminalRuleCall_6_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCommandLineInterfaceAccess().getProtocolSTRINGTerminalRuleCall_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__ProtocolAssignment_6_0"


    // $ANTLR start "rule__CommandLineInterface__UrlAssignment_7_0_0"
    // InternalCurlBetterThanHttpie.g:3577:1: rule__CommandLineInterface__UrlAssignment_7_0_0 : ( RULE_STRING ) ;
    public final void rule__CommandLineInterface__UrlAssignment_7_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3581:1: ( ( RULE_STRING ) )
            // InternalCurlBetterThanHttpie.g:3582:2: ( RULE_STRING )
            {
            // InternalCurlBetterThanHttpie.g:3582:2: ( RULE_STRING )
            // InternalCurlBetterThanHttpie.g:3583:3: RULE_STRING
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getUrlSTRINGTerminalRuleCall_7_0_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCommandLineInterfaceAccess().getUrlSTRINGTerminalRuleCall_7_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__UrlAssignment_7_0_0"


    // $ANTLR start "rule__CommandLineInterface__PortAssignment_7_0_1_1"
    // InternalCurlBetterThanHttpie.g:3592:1: rule__CommandLineInterface__PortAssignment_7_0_1_1 : ( RULE_INT ) ;
    public final void rule__CommandLineInterface__PortAssignment_7_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3596:1: ( ( RULE_INT ) )
            // InternalCurlBetterThanHttpie.g:3597:2: ( RULE_INT )
            {
            // InternalCurlBetterThanHttpie.g:3597:2: ( RULE_INT )
            // InternalCurlBetterThanHttpie.g:3598:3: RULE_INT
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getPortINTTerminalRuleCall_7_0_1_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCommandLineInterfaceAccess().getPortINTTerminalRuleCall_7_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__PortAssignment_7_0_1_1"


    // $ANTLR start "rule__CommandLineInterface__PortAssignment_7_1_1"
    // InternalCurlBetterThanHttpie.g:3607:1: rule__CommandLineInterface__PortAssignment_7_1_1 : ( RULE_INT ) ;
    public final void rule__CommandLineInterface__PortAssignment_7_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3611:1: ( ( RULE_INT ) )
            // InternalCurlBetterThanHttpie.g:3612:2: ( RULE_INT )
            {
            // InternalCurlBetterThanHttpie.g:3612:2: ( RULE_INT )
            // InternalCurlBetterThanHttpie.g:3613:3: RULE_INT
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getPortINTTerminalRuleCall_7_1_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCommandLineInterfaceAccess().getPortINTTerminalRuleCall_7_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__PortAssignment_7_1_1"


    // $ANTLR start "rule__CommandLineInterface__ResourceAssignment_8_1"
    // InternalCurlBetterThanHttpie.g:3622:1: rule__CommandLineInterface__ResourceAssignment_8_1 : ( RULE_STRING ) ;
    public final void rule__CommandLineInterface__ResourceAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3626:1: ( ( RULE_STRING ) )
            // InternalCurlBetterThanHttpie.g:3627:2: ( RULE_STRING )
            {
            // InternalCurlBetterThanHttpie.g:3627:2: ( RULE_STRING )
            // InternalCurlBetterThanHttpie.g:3628:3: RULE_STRING
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getResourceSTRINGTerminalRuleCall_8_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCommandLineInterfaceAccess().getResourceSTRINGTerminalRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__ResourceAssignment_8_1"


    // $ANTLR start "rule__CommandLineInterface__ItemsAssignment_11_0"
    // InternalCurlBetterThanHttpie.g:3637:1: rule__CommandLineInterface__ItemsAssignment_11_0 : ( ruleItem ) ;
    public final void rule__CommandLineInterface__ItemsAssignment_11_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3641:1: ( ( ruleItem ) )
            // InternalCurlBetterThanHttpie.g:3642:2: ( ruleItem )
            {
            // InternalCurlBetterThanHttpie.g:3642:2: ( ruleItem )
            // InternalCurlBetterThanHttpie.g:3643:3: ruleItem
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getItemsItemParserRuleCall_11_0_0()); 
            pushFollow(FOLLOW_2);
            ruleItem();

            state._fsp--;

             after(grammarAccess.getCommandLineInterfaceAccess().getItemsItemParserRuleCall_11_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLineInterface__ItemsAssignment_11_0"


    // $ANTLR start "rule__ProxyFlag__ProtocolAssignment_2_0"
    // InternalCurlBetterThanHttpie.g:3652:1: rule__ProxyFlag__ProtocolAssignment_2_0 : ( RULE_STRING ) ;
    public final void rule__ProxyFlag__ProtocolAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3656:1: ( ( RULE_STRING ) )
            // InternalCurlBetterThanHttpie.g:3657:2: ( RULE_STRING )
            {
            // InternalCurlBetterThanHttpie.g:3657:2: ( RULE_STRING )
            // InternalCurlBetterThanHttpie.g:3658:3: RULE_STRING
            {
             before(grammarAccess.getProxyFlagAccess().getProtocolSTRINGTerminalRuleCall_2_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getProxyFlagAccess().getProtocolSTRINGTerminalRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__ProtocolAssignment_2_0"


    // $ANTLR start "rule__ProxyFlag__ProxyProtocolAssignment_3_0"
    // InternalCurlBetterThanHttpie.g:3667:1: rule__ProxyFlag__ProxyProtocolAssignment_3_0 : ( RULE_STRING ) ;
    public final void rule__ProxyFlag__ProxyProtocolAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3671:1: ( ( RULE_STRING ) )
            // InternalCurlBetterThanHttpie.g:3672:2: ( RULE_STRING )
            {
            // InternalCurlBetterThanHttpie.g:3672:2: ( RULE_STRING )
            // InternalCurlBetterThanHttpie.g:3673:3: RULE_STRING
            {
             before(grammarAccess.getProxyFlagAccess().getProxyProtocolSTRINGTerminalRuleCall_3_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getProxyFlagAccess().getProxyProtocolSTRINGTerminalRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__ProxyProtocolAssignment_3_0"


    // $ANTLR start "rule__ProxyFlag__UsernameAssignment_4_0"
    // InternalCurlBetterThanHttpie.g:3682:1: rule__ProxyFlag__UsernameAssignment_4_0 : ( RULE_STRING ) ;
    public final void rule__ProxyFlag__UsernameAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3686:1: ( ( RULE_STRING ) )
            // InternalCurlBetterThanHttpie.g:3687:2: ( RULE_STRING )
            {
            // InternalCurlBetterThanHttpie.g:3687:2: ( RULE_STRING )
            // InternalCurlBetterThanHttpie.g:3688:3: RULE_STRING
            {
             before(grammarAccess.getProxyFlagAccess().getUsernameSTRINGTerminalRuleCall_4_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getProxyFlagAccess().getUsernameSTRINGTerminalRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__UsernameAssignment_4_0"


    // $ANTLR start "rule__ProxyFlag__PasswordAssignment_4_2"
    // InternalCurlBetterThanHttpie.g:3697:1: rule__ProxyFlag__PasswordAssignment_4_2 : ( RULE_STRING ) ;
    public final void rule__ProxyFlag__PasswordAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3701:1: ( ( RULE_STRING ) )
            // InternalCurlBetterThanHttpie.g:3702:2: ( RULE_STRING )
            {
            // InternalCurlBetterThanHttpie.g:3702:2: ( RULE_STRING )
            // InternalCurlBetterThanHttpie.g:3703:3: RULE_STRING
            {
             before(grammarAccess.getProxyFlagAccess().getPasswordSTRINGTerminalRuleCall_4_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getProxyFlagAccess().getPasswordSTRINGTerminalRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__PasswordAssignment_4_2"


    // $ANTLR start "rule__ProxyFlag__HostnameAssignment_5"
    // InternalCurlBetterThanHttpie.g:3712:1: rule__ProxyFlag__HostnameAssignment_5 : ( RULE_STRING ) ;
    public final void rule__ProxyFlag__HostnameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3716:1: ( ( RULE_STRING ) )
            // InternalCurlBetterThanHttpie.g:3717:2: ( RULE_STRING )
            {
            // InternalCurlBetterThanHttpie.g:3717:2: ( RULE_STRING )
            // InternalCurlBetterThanHttpie.g:3718:3: RULE_STRING
            {
             before(grammarAccess.getProxyFlagAccess().getHostnameSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getProxyFlagAccess().getHostnameSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__HostnameAssignment_5"


    // $ANTLR start "rule__ProxyFlag__PortAssignment_6_1"
    // InternalCurlBetterThanHttpie.g:3727:1: rule__ProxyFlag__PortAssignment_6_1 : ( RULE_INT ) ;
    public final void rule__ProxyFlag__PortAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3731:1: ( ( RULE_INT ) )
            // InternalCurlBetterThanHttpie.g:3732:2: ( RULE_INT )
            {
            // InternalCurlBetterThanHttpie.g:3732:2: ( RULE_INT )
            // InternalCurlBetterThanHttpie.g:3733:3: RULE_INT
            {
             before(grammarAccess.getProxyFlagAccess().getPortINTTerminalRuleCall_6_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getProxyFlagAccess().getPortINTTerminalRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__PortAssignment_6_1"


    // $ANTLR start "rule__AuthFlag__UsernameAssignment_2"
    // InternalCurlBetterThanHttpie.g:3742:1: rule__AuthFlag__UsernameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__AuthFlag__UsernameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3746:1: ( ( RULE_STRING ) )
            // InternalCurlBetterThanHttpie.g:3747:2: ( RULE_STRING )
            {
            // InternalCurlBetterThanHttpie.g:3747:2: ( RULE_STRING )
            // InternalCurlBetterThanHttpie.g:3748:3: RULE_STRING
            {
             before(grammarAccess.getAuthFlagAccess().getUsernameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAuthFlagAccess().getUsernameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
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
    // InternalCurlBetterThanHttpie.g:3757:1: rule__AuthFlag__PasswordAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__AuthFlag__PasswordAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3761:1: ( ( RULE_STRING ) )
            // InternalCurlBetterThanHttpie.g:3762:2: ( RULE_STRING )
            {
            // InternalCurlBetterThanHttpie.g:3762:2: ( RULE_STRING )
            // InternalCurlBetterThanHttpie.g:3763:3: RULE_STRING
            {
             before(grammarAccess.getAuthFlagAccess().getPasswordSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAuthFlagAccess().getPasswordSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__AuthFlag__HostnameAssignment_4_1"
    // InternalCurlBetterThanHttpie.g:3772:1: rule__AuthFlag__HostnameAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__AuthFlag__HostnameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3776:1: ( ( RULE_STRING ) )
            // InternalCurlBetterThanHttpie.g:3777:2: ( RULE_STRING )
            {
            // InternalCurlBetterThanHttpie.g:3777:2: ( RULE_STRING )
            // InternalCurlBetterThanHttpie.g:3778:3: RULE_STRING
            {
             before(grammarAccess.getAuthFlagAccess().getHostnameSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAuthFlagAccess().getHostnameSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthFlag__HostnameAssignment_4_1"


    // $ANTLR start "rule__TimeoutFlag__TimeoutAssignment_2"
    // InternalCurlBetterThanHttpie.g:3787:1: rule__TimeoutFlag__TimeoutAssignment_2 : ( RULE_FLOAT ) ;
    public final void rule__TimeoutFlag__TimeoutAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3791:1: ( ( RULE_FLOAT ) )
            // InternalCurlBetterThanHttpie.g:3792:2: ( RULE_FLOAT )
            {
            // InternalCurlBetterThanHttpie.g:3792:2: ( RULE_FLOAT )
            // InternalCurlBetterThanHttpie.g:3793:3: RULE_FLOAT
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


    // $ANTLR start "rule__FormFileFieldItem__FieldAssignment_0"
    // InternalCurlBetterThanHttpie.g:3802:1: rule__FormFileFieldItem__FieldAssignment_0 : ( RULE_STRING ) ;
    public final void rule__FormFileFieldItem__FieldAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3806:1: ( ( RULE_STRING ) )
            // InternalCurlBetterThanHttpie.g:3807:2: ( RULE_STRING )
            {
            // InternalCurlBetterThanHttpie.g:3807:2: ( RULE_STRING )
            // InternalCurlBetterThanHttpie.g:3808:3: RULE_STRING
            {
             before(grammarAccess.getFormFileFieldItemAccess().getFieldSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFormFileFieldItemAccess().getFieldSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
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
    // InternalCurlBetterThanHttpie.g:3817:1: rule__FormFileFieldItem__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__FormFileFieldItem__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3821:1: ( ( RULE_STRING ) )
            // InternalCurlBetterThanHttpie.g:3822:2: ( RULE_STRING )
            {
            // InternalCurlBetterThanHttpie.g:3822:2: ( RULE_STRING )
            // InternalCurlBetterThanHttpie.g:3823:3: RULE_STRING
            {
             before(grammarAccess.getFormFileFieldItemAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFormFileFieldItemAccess().getValueSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
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
    // InternalCurlBetterThanHttpie.g:3832:1: rule__DataFieldItem__FieldAssignment_0 : ( RULE_STRING ) ;
    public final void rule__DataFieldItem__FieldAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3836:1: ( ( RULE_STRING ) )
            // InternalCurlBetterThanHttpie.g:3837:2: ( RULE_STRING )
            {
            // InternalCurlBetterThanHttpie.g:3837:2: ( RULE_STRING )
            // InternalCurlBetterThanHttpie.g:3838:3: RULE_STRING
            {
             before(grammarAccess.getDataFieldItemAccess().getFieldSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDataFieldItemAccess().getFieldSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
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
    // InternalCurlBetterThanHttpie.g:3847:1: rule__DataFieldItem__ValueAssignment_2_0 : ( RULE_STRING ) ;
    public final void rule__DataFieldItem__ValueAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3851:1: ( ( RULE_STRING ) )
            // InternalCurlBetterThanHttpie.g:3852:2: ( RULE_STRING )
            {
            // InternalCurlBetterThanHttpie.g:3852:2: ( RULE_STRING )
            // InternalCurlBetterThanHttpie.g:3853:3: RULE_STRING
            {
             before(grammarAccess.getDataFieldItemAccess().getValueSTRINGTerminalRuleCall_2_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDataFieldItemAccess().getValueSTRINGTerminalRuleCall_2_0_0()); 

            }


            }

        }
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
    // InternalCurlBetterThanHttpie.g:3862:1: rule__DataFieldItem__ValueAssignment_2_1_1 : ( RULE_STRING ) ;
    public final void rule__DataFieldItem__ValueAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3866:1: ( ( RULE_STRING ) )
            // InternalCurlBetterThanHttpie.g:3867:2: ( RULE_STRING )
            {
            // InternalCurlBetterThanHttpie.g:3867:2: ( RULE_STRING )
            // InternalCurlBetterThanHttpie.g:3868:3: RULE_STRING
            {
             before(grammarAccess.getDataFieldItemAccess().getValueSTRINGTerminalRuleCall_2_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDataFieldItemAccess().getValueSTRINGTerminalRuleCall_2_1_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__HttpHeaderItem__FieldAssignment_0"
    // InternalCurlBetterThanHttpie.g:3877:1: rule__HttpHeaderItem__FieldAssignment_0 : ( RULE_STRING ) ;
    public final void rule__HttpHeaderItem__FieldAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3881:1: ( ( RULE_STRING ) )
            // InternalCurlBetterThanHttpie.g:3882:2: ( RULE_STRING )
            {
            // InternalCurlBetterThanHttpie.g:3882:2: ( RULE_STRING )
            // InternalCurlBetterThanHttpie.g:3883:3: RULE_STRING
            {
             before(grammarAccess.getHttpHeaderItemAccess().getFieldSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getHttpHeaderItemAccess().getFieldSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
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
    // InternalCurlBetterThanHttpie.g:3892:1: rule__HttpHeaderItem__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__HttpHeaderItem__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3896:1: ( ( RULE_STRING ) )
            // InternalCurlBetterThanHttpie.g:3897:2: ( RULE_STRING )
            {
            // InternalCurlBetterThanHttpie.g:3897:2: ( RULE_STRING )
            // InternalCurlBetterThanHttpie.g:3898:3: RULE_STRING
            {
             before(grammarAccess.getHttpHeaderItemAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getHttpHeaderItemAccess().getValueSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__UrlParameterItem__FieldAssignment_0"
    // InternalCurlBetterThanHttpie.g:3907:1: rule__UrlParameterItem__FieldAssignment_0 : ( RULE_STRING ) ;
    public final void rule__UrlParameterItem__FieldAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3911:1: ( ( RULE_STRING ) )
            // InternalCurlBetterThanHttpie.g:3912:2: ( RULE_STRING )
            {
            // InternalCurlBetterThanHttpie.g:3912:2: ( RULE_STRING )
            // InternalCurlBetterThanHttpie.g:3913:3: RULE_STRING
            {
             before(grammarAccess.getUrlParameterItemAccess().getFieldSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getUrlParameterItemAccess().getFieldSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
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
    // InternalCurlBetterThanHttpie.g:3922:1: rule__UrlParameterItem__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__UrlParameterItem__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:3926:1: ( ( RULE_STRING ) )
            // InternalCurlBetterThanHttpie.g:3927:2: ( RULE_STRING )
            {
            // InternalCurlBetterThanHttpie.g:3927:2: ( RULE_STRING )
            // InternalCurlBetterThanHttpie.g:3928:3: RULE_STRING
            {
             before(grammarAccess.getUrlParameterItemAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getUrlParameterItemAccess().getValueSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000641E7FFF810L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000064007FFF802L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000800000080L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000002000000080L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000010800000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000010000000080L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000400000000000L});

}