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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WS", "RULE_VALUE", "RULE_STRING", "RULE_INT", "RULE_FLOAT", "RULE_DIGIT", "RULE_ANY_OTHER", "'--header'", "'-t'", "'--body'", "'-b'", "'--json'", "'-j'", "'--form'", "'f'", "'--auth'", "'-a'", "'--download'", "'-d'", "'--help'", "'-h'", "'--verbose'", "'-v'", "'GET'", "'POST'", "'PUT'", "'DELETE'", "'http'", "'--proxy'", "':'", "'://'", "'a'", "'@'", "'--version'", "'--timeout'"
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


    // $ANTLR start "ruleMethod"
    // InternalCurlBetterThanHttpie.g:378:1: ruleMethod : ( ( rule__Method__Alternatives ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:382:1: ( ( ( rule__Method__Alternatives ) ) )
            // InternalCurlBetterThanHttpie.g:383:2: ( ( rule__Method__Alternatives ) )
            {
            // InternalCurlBetterThanHttpie.g:383:2: ( ( rule__Method__Alternatives ) )
            // InternalCurlBetterThanHttpie.g:384:3: ( rule__Method__Alternatives )
            {
             before(grammarAccess.getMethodAccess().getAlternatives()); 
            // InternalCurlBetterThanHttpie.g:385:3: ( rule__Method__Alternatives )
            // InternalCurlBetterThanHttpie.g:385:4: rule__Method__Alternatives
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


    // $ANTLR start "rule__Flag__Alternatives"
    // InternalCurlBetterThanHttpie.g:393:1: rule__Flag__Alternatives : ( ( ruleProxyFlag ) | ( ruleFormFlag ) | ( ruleAuthFlag ) | ( ruleDownloadFlag ) | ( ruleBodyFlag ) | ( ruleVersionFlag ) | ( ruleJsonFlag ) | ( ruleHelpFlag ) | ( ruleHeadersFlag ) | ( ruleVerboseFlag ) | ( ruleTimeoutFlag ) );
    public final void rule__Flag__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:397:1: ( ( ruleProxyFlag ) | ( ruleFormFlag ) | ( ruleAuthFlag ) | ( ruleDownloadFlag ) | ( ruleBodyFlag ) | ( ruleVersionFlag ) | ( ruleJsonFlag ) | ( ruleHelpFlag ) | ( ruleHeadersFlag ) | ( ruleVerboseFlag ) | ( ruleTimeoutFlag ) )
            int alt1=11;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt1=1;
                }
                break;
            case 17:
            case 18:
                {
                alt1=2;
                }
                break;
            case 19:
            case 20:
                {
                alt1=3;
                }
                break;
            case 21:
            case 22:
                {
                alt1=4;
                }
                break;
            case 13:
            case 14:
                {
                alt1=5;
                }
                break;
            case 37:
                {
                alt1=6;
                }
                break;
            case 15:
            case 16:
                {
                alt1=7;
                }
                break;
            case 23:
            case 24:
                {
                alt1=8;
                }
                break;
            case 11:
            case 12:
                {
                alt1=9;
                }
                break;
            case 25:
            case 26:
                {
                alt1=10;
                }
                break;
            case 38:
                {
                alt1=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:398:2: ( ruleProxyFlag )
                    {
                    // InternalCurlBetterThanHttpie.g:398:2: ( ruleProxyFlag )
                    // InternalCurlBetterThanHttpie.g:399:3: ruleProxyFlag
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
                    // InternalCurlBetterThanHttpie.g:404:2: ( ruleFormFlag )
                    {
                    // InternalCurlBetterThanHttpie.g:404:2: ( ruleFormFlag )
                    // InternalCurlBetterThanHttpie.g:405:3: ruleFormFlag
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
                    // InternalCurlBetterThanHttpie.g:410:2: ( ruleAuthFlag )
                    {
                    // InternalCurlBetterThanHttpie.g:410:2: ( ruleAuthFlag )
                    // InternalCurlBetterThanHttpie.g:411:3: ruleAuthFlag
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
                    // InternalCurlBetterThanHttpie.g:416:2: ( ruleDownloadFlag )
                    {
                    // InternalCurlBetterThanHttpie.g:416:2: ( ruleDownloadFlag )
                    // InternalCurlBetterThanHttpie.g:417:3: ruleDownloadFlag
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
                    // InternalCurlBetterThanHttpie.g:422:2: ( ruleBodyFlag )
                    {
                    // InternalCurlBetterThanHttpie.g:422:2: ( ruleBodyFlag )
                    // InternalCurlBetterThanHttpie.g:423:3: ruleBodyFlag
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
                    // InternalCurlBetterThanHttpie.g:428:2: ( ruleVersionFlag )
                    {
                    // InternalCurlBetterThanHttpie.g:428:2: ( ruleVersionFlag )
                    // InternalCurlBetterThanHttpie.g:429:3: ruleVersionFlag
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
                    // InternalCurlBetterThanHttpie.g:434:2: ( ruleJsonFlag )
                    {
                    // InternalCurlBetterThanHttpie.g:434:2: ( ruleJsonFlag )
                    // InternalCurlBetterThanHttpie.g:435:3: ruleJsonFlag
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
                    // InternalCurlBetterThanHttpie.g:440:2: ( ruleHelpFlag )
                    {
                    // InternalCurlBetterThanHttpie.g:440:2: ( ruleHelpFlag )
                    // InternalCurlBetterThanHttpie.g:441:3: ruleHelpFlag
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
                    // InternalCurlBetterThanHttpie.g:446:2: ( ruleHeadersFlag )
                    {
                    // InternalCurlBetterThanHttpie.g:446:2: ( ruleHeadersFlag )
                    // InternalCurlBetterThanHttpie.g:447:3: ruleHeadersFlag
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
                    // InternalCurlBetterThanHttpie.g:452:2: ( ruleVerboseFlag )
                    {
                    // InternalCurlBetterThanHttpie.g:452:2: ( ruleVerboseFlag )
                    // InternalCurlBetterThanHttpie.g:453:3: ruleVerboseFlag
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
                    // InternalCurlBetterThanHttpie.g:458:2: ( ruleTimeoutFlag )
                    {
                    // InternalCurlBetterThanHttpie.g:458:2: ( ruleTimeoutFlag )
                    // InternalCurlBetterThanHttpie.g:459:3: ruleTimeoutFlag
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
    // InternalCurlBetterThanHttpie.g:468:1: rule__HeadersFlag__Alternatives_1 : ( ( '--header' ) | ( '-t' ) );
    public final void rule__HeadersFlag__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:472:1: ( ( '--header' ) | ( '-t' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:473:2: ( '--header' )
                    {
                    // InternalCurlBetterThanHttpie.g:473:2: ( '--header' )
                    // InternalCurlBetterThanHttpie.g:474:3: '--header'
                    {
                     before(grammarAccess.getHeadersFlagAccess().getHeaderKeyword_1_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getHeadersFlagAccess().getHeaderKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:479:2: ( '-t' )
                    {
                    // InternalCurlBetterThanHttpie.g:479:2: ( '-t' )
                    // InternalCurlBetterThanHttpie.g:480:3: '-t'
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
    // InternalCurlBetterThanHttpie.g:489:1: rule__BodyFlag__Alternatives_1 : ( ( '--body' ) | ( '-b' ) );
    public final void rule__BodyFlag__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:493:1: ( ( '--body' ) | ( '-b' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:494:2: ( '--body' )
                    {
                    // InternalCurlBetterThanHttpie.g:494:2: ( '--body' )
                    // InternalCurlBetterThanHttpie.g:495:3: '--body'
                    {
                     before(grammarAccess.getBodyFlagAccess().getBodyKeyword_1_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getBodyFlagAccess().getBodyKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:500:2: ( '-b' )
                    {
                    // InternalCurlBetterThanHttpie.g:500:2: ( '-b' )
                    // InternalCurlBetterThanHttpie.g:501:3: '-b'
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
    // InternalCurlBetterThanHttpie.g:510:1: rule__JsonFlag__Alternatives_1 : ( ( '--json' ) | ( '-j' ) );
    public final void rule__JsonFlag__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:514:1: ( ( '--json' ) | ( '-j' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            else if ( (LA4_0==16) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:515:2: ( '--json' )
                    {
                    // InternalCurlBetterThanHttpie.g:515:2: ( '--json' )
                    // InternalCurlBetterThanHttpie.g:516:3: '--json'
                    {
                     before(grammarAccess.getJsonFlagAccess().getJsonKeyword_1_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getJsonFlagAccess().getJsonKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:521:2: ( '-j' )
                    {
                    // InternalCurlBetterThanHttpie.g:521:2: ( '-j' )
                    // InternalCurlBetterThanHttpie.g:522:3: '-j'
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
    // InternalCurlBetterThanHttpie.g:531:1: rule__FormFlag__Alternatives_1 : ( ( '--form' ) | ( 'f' ) );
    public final void rule__FormFlag__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:535:1: ( ( '--form' ) | ( 'f' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            else if ( (LA5_0==18) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:536:2: ( '--form' )
                    {
                    // InternalCurlBetterThanHttpie.g:536:2: ( '--form' )
                    // InternalCurlBetterThanHttpie.g:537:3: '--form'
                    {
                     before(grammarAccess.getFormFlagAccess().getFormKeyword_1_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getFormFlagAccess().getFormKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:542:2: ( 'f' )
                    {
                    // InternalCurlBetterThanHttpie.g:542:2: ( 'f' )
                    // InternalCurlBetterThanHttpie.g:543:3: 'f'
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
    // InternalCurlBetterThanHttpie.g:552:1: rule__AuthFlag__Alternatives_0 : ( ( '--auth' ) | ( '-a' ) );
    public final void rule__AuthFlag__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:556:1: ( ( '--auth' ) | ( '-a' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            else if ( (LA6_0==20) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:557:2: ( '--auth' )
                    {
                    // InternalCurlBetterThanHttpie.g:557:2: ( '--auth' )
                    // InternalCurlBetterThanHttpie.g:558:3: '--auth'
                    {
                     before(grammarAccess.getAuthFlagAccess().getAuthKeyword_0_0()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getAuthFlagAccess().getAuthKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:563:2: ( '-a' )
                    {
                    // InternalCurlBetterThanHttpie.g:563:2: ( '-a' )
                    // InternalCurlBetterThanHttpie.g:564:3: '-a'
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
    // InternalCurlBetterThanHttpie.g:573:1: rule__DownloadFlag__Alternatives_1 : ( ( '--download' ) | ( '-d' ) );
    public final void rule__DownloadFlag__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:577:1: ( ( '--download' ) | ( '-d' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            else if ( (LA7_0==22) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:578:2: ( '--download' )
                    {
                    // InternalCurlBetterThanHttpie.g:578:2: ( '--download' )
                    // InternalCurlBetterThanHttpie.g:579:3: '--download'
                    {
                     before(grammarAccess.getDownloadFlagAccess().getDownloadKeyword_1_0()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getDownloadFlagAccess().getDownloadKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:584:2: ( '-d' )
                    {
                    // InternalCurlBetterThanHttpie.g:584:2: ( '-d' )
                    // InternalCurlBetterThanHttpie.g:585:3: '-d'
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
    // InternalCurlBetterThanHttpie.g:594:1: rule__HelpFlag__Alternatives_1 : ( ( '--help' ) | ( '-h' ) );
    public final void rule__HelpFlag__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:598:1: ( ( '--help' ) | ( '-h' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            else if ( (LA8_0==24) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:599:2: ( '--help' )
                    {
                    // InternalCurlBetterThanHttpie.g:599:2: ( '--help' )
                    // InternalCurlBetterThanHttpie.g:600:3: '--help'
                    {
                     before(grammarAccess.getHelpFlagAccess().getHelpKeyword_1_0()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getHelpFlagAccess().getHelpKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:605:2: ( '-h' )
                    {
                    // InternalCurlBetterThanHttpie.g:605:2: ( '-h' )
                    // InternalCurlBetterThanHttpie.g:606:3: '-h'
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
    // InternalCurlBetterThanHttpie.g:615:1: rule__VerboseFlag__Alternatives_1 : ( ( '--verbose' ) | ( '-v' ) );
    public final void rule__VerboseFlag__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:619:1: ( ( '--verbose' ) | ( '-v' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            else if ( (LA9_0==26) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:620:2: ( '--verbose' )
                    {
                    // InternalCurlBetterThanHttpie.g:620:2: ( '--verbose' )
                    // InternalCurlBetterThanHttpie.g:621:3: '--verbose'
                    {
                     before(grammarAccess.getVerboseFlagAccess().getVerboseKeyword_1_0()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getVerboseFlagAccess().getVerboseKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:626:2: ( '-v' )
                    {
                    // InternalCurlBetterThanHttpie.g:626:2: ( '-v' )
                    // InternalCurlBetterThanHttpie.g:627:3: '-v'
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


    // $ANTLR start "rule__Method__Alternatives"
    // InternalCurlBetterThanHttpie.g:636:1: rule__Method__Alternatives : ( ( ( 'GET' ) ) | ( ( 'POST' ) ) | ( ( 'PUT' ) ) | ( ( 'DELETE' ) ) );
    public final void rule__Method__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:640:1: ( ( ( 'GET' ) ) | ( ( 'POST' ) ) | ( ( 'PUT' ) ) | ( ( 'DELETE' ) ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt10=1;
                }
                break;
            case 28:
                {
                alt10=2;
                }
                break;
            case 29:
                {
                alt10=3;
                }
                break;
            case 30:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:641:2: ( ( 'GET' ) )
                    {
                    // InternalCurlBetterThanHttpie.g:641:2: ( ( 'GET' ) )
                    // InternalCurlBetterThanHttpie.g:642:3: ( 'GET' )
                    {
                     before(grammarAccess.getMethodAccess().getGETEnumLiteralDeclaration_0()); 
                    // InternalCurlBetterThanHttpie.g:643:3: ( 'GET' )
                    // InternalCurlBetterThanHttpie.g:643:4: 'GET'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getMethodAccess().getGETEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:647:2: ( ( 'POST' ) )
                    {
                    // InternalCurlBetterThanHttpie.g:647:2: ( ( 'POST' ) )
                    // InternalCurlBetterThanHttpie.g:648:3: ( 'POST' )
                    {
                     before(grammarAccess.getMethodAccess().getPOSTEnumLiteralDeclaration_1()); 
                    // InternalCurlBetterThanHttpie.g:649:3: ( 'POST' )
                    // InternalCurlBetterThanHttpie.g:649:4: 'POST'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getMethodAccess().getPOSTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCurlBetterThanHttpie.g:653:2: ( ( 'PUT' ) )
                    {
                    // InternalCurlBetterThanHttpie.g:653:2: ( ( 'PUT' ) )
                    // InternalCurlBetterThanHttpie.g:654:3: ( 'PUT' )
                    {
                     before(grammarAccess.getMethodAccess().getPUTEnumLiteralDeclaration_2()); 
                    // InternalCurlBetterThanHttpie.g:655:3: ( 'PUT' )
                    // InternalCurlBetterThanHttpie.g:655:4: 'PUT'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getMethodAccess().getPUTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCurlBetterThanHttpie.g:659:2: ( ( 'DELETE' ) )
                    {
                    // InternalCurlBetterThanHttpie.g:659:2: ( ( 'DELETE' ) )
                    // InternalCurlBetterThanHttpie.g:660:3: ( 'DELETE' )
                    {
                     before(grammarAccess.getMethodAccess().getDELETEEnumLiteralDeclaration_3()); 
                    // InternalCurlBetterThanHttpie.g:661:3: ( 'DELETE' )
                    // InternalCurlBetterThanHttpie.g:661:4: 'DELETE'
                    {
                    match(input,30,FOLLOW_2); 

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
    // InternalCurlBetterThanHttpie.g:669:1: rule__CommandLineInterface__Group__0 : rule__CommandLineInterface__Group__0__Impl rule__CommandLineInterface__Group__1 ;
    public final void rule__CommandLineInterface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:673:1: ( rule__CommandLineInterface__Group__0__Impl rule__CommandLineInterface__Group__1 )
            // InternalCurlBetterThanHttpie.g:674:2: rule__CommandLineInterface__Group__0__Impl rule__CommandLineInterface__Group__1
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
    // InternalCurlBetterThanHttpie.g:681:1: rule__CommandLineInterface__Group__0__Impl : ( () ) ;
    public final void rule__CommandLineInterface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:685:1: ( ( () ) )
            // InternalCurlBetterThanHttpie.g:686:1: ( () )
            {
            // InternalCurlBetterThanHttpie.g:686:1: ( () )
            // InternalCurlBetterThanHttpie.g:687:2: ()
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getCommandLineInterfaceAction_0()); 
            // InternalCurlBetterThanHttpie.g:688:2: ()
            // InternalCurlBetterThanHttpie.g:688:3: 
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
    // InternalCurlBetterThanHttpie.g:696:1: rule__CommandLineInterface__Group__1 : rule__CommandLineInterface__Group__1__Impl rule__CommandLineInterface__Group__2 ;
    public final void rule__CommandLineInterface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:700:1: ( rule__CommandLineInterface__Group__1__Impl rule__CommandLineInterface__Group__2 )
            // InternalCurlBetterThanHttpie.g:701:2: rule__CommandLineInterface__Group__1__Impl rule__CommandLineInterface__Group__2
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
    // InternalCurlBetterThanHttpie.g:708:1: rule__CommandLineInterface__Group__1__Impl : ( 'http' ) ;
    public final void rule__CommandLineInterface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:712:1: ( ( 'http' ) )
            // InternalCurlBetterThanHttpie.g:713:1: ( 'http' )
            {
            // InternalCurlBetterThanHttpie.g:713:1: ( 'http' )
            // InternalCurlBetterThanHttpie.g:714:2: 'http'
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getHttpKeyword_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalCurlBetterThanHttpie.g:723:1: rule__CommandLineInterface__Group__2 : rule__CommandLineInterface__Group__2__Impl rule__CommandLineInterface__Group__3 ;
    public final void rule__CommandLineInterface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:727:1: ( rule__CommandLineInterface__Group__2__Impl rule__CommandLineInterface__Group__3 )
            // InternalCurlBetterThanHttpie.g:728:2: rule__CommandLineInterface__Group__2__Impl rule__CommandLineInterface__Group__3
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
    // InternalCurlBetterThanHttpie.g:735:1: rule__CommandLineInterface__Group__2__Impl : ( ( rule__CommandLineInterface__Group_2__0 )* ) ;
    public final void rule__CommandLineInterface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:739:1: ( ( ( rule__CommandLineInterface__Group_2__0 )* ) )
            // InternalCurlBetterThanHttpie.g:740:1: ( ( rule__CommandLineInterface__Group_2__0 )* )
            {
            // InternalCurlBetterThanHttpie.g:740:1: ( ( rule__CommandLineInterface__Group_2__0 )* )
            // InternalCurlBetterThanHttpie.g:741:2: ( rule__CommandLineInterface__Group_2__0 )*
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getGroup_2()); 
            // InternalCurlBetterThanHttpie.g:742:2: ( rule__CommandLineInterface__Group_2__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_WS) ) {
                    int LA11_1 = input.LA(2);

                    if ( ((LA11_1>=11 && LA11_1<=26)||LA11_1==32||(LA11_1>=37 && LA11_1<=38)) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // InternalCurlBetterThanHttpie.g:742:3: rule__CommandLineInterface__Group_2__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__CommandLineInterface__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalCurlBetterThanHttpie.g:750:1: rule__CommandLineInterface__Group__3 : rule__CommandLineInterface__Group__3__Impl rule__CommandLineInterface__Group__4 ;
    public final void rule__CommandLineInterface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:754:1: ( rule__CommandLineInterface__Group__3__Impl rule__CommandLineInterface__Group__4 )
            // InternalCurlBetterThanHttpie.g:755:2: rule__CommandLineInterface__Group__3__Impl rule__CommandLineInterface__Group__4
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
    // InternalCurlBetterThanHttpie.g:762:1: rule__CommandLineInterface__Group__3__Impl : ( ( rule__CommandLineInterface__Group_3__0 )? ) ;
    public final void rule__CommandLineInterface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:766:1: ( ( ( rule__CommandLineInterface__Group_3__0 )? ) )
            // InternalCurlBetterThanHttpie.g:767:1: ( ( rule__CommandLineInterface__Group_3__0 )? )
            {
            // InternalCurlBetterThanHttpie.g:767:1: ( ( rule__CommandLineInterface__Group_3__0 )? )
            // InternalCurlBetterThanHttpie.g:768:2: ( rule__CommandLineInterface__Group_3__0 )?
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getGroup_3()); 
            // InternalCurlBetterThanHttpie.g:769:2: ( rule__CommandLineInterface__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_WS) ) {
                int LA12_1 = input.LA(2);

                if ( ((LA12_1>=27 && LA12_1<=30)) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:769:3: rule__CommandLineInterface__Group_3__0
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
    // InternalCurlBetterThanHttpie.g:777:1: rule__CommandLineInterface__Group__4 : rule__CommandLineInterface__Group__4__Impl ;
    public final void rule__CommandLineInterface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:781:1: ( rule__CommandLineInterface__Group__4__Impl )
            // InternalCurlBetterThanHttpie.g:782:2: rule__CommandLineInterface__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CommandLineInterface__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalCurlBetterThanHttpie.g:788:1: rule__CommandLineInterface__Group__4__Impl : ( ( RULE_WS )? ) ;
    public final void rule__CommandLineInterface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:792:1: ( ( ( RULE_WS )? ) )
            // InternalCurlBetterThanHttpie.g:793:1: ( ( RULE_WS )? )
            {
            // InternalCurlBetterThanHttpie.g:793:1: ( ( RULE_WS )? )
            // InternalCurlBetterThanHttpie.g:794:2: ( RULE_WS )?
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getWSTerminalRuleCall_4()); 
            // InternalCurlBetterThanHttpie.g:795:2: ( RULE_WS )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_WS) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:795:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_2); 

                    }
                    break;

            }

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


    // $ANTLR start "rule__CommandLineInterface__Group_2__0"
    // InternalCurlBetterThanHttpie.g:804:1: rule__CommandLineInterface__Group_2__0 : rule__CommandLineInterface__Group_2__0__Impl rule__CommandLineInterface__Group_2__1 ;
    public final void rule__CommandLineInterface__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:808:1: ( rule__CommandLineInterface__Group_2__0__Impl rule__CommandLineInterface__Group_2__1 )
            // InternalCurlBetterThanHttpie.g:809:2: rule__CommandLineInterface__Group_2__0__Impl rule__CommandLineInterface__Group_2__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalCurlBetterThanHttpie.g:816:1: rule__CommandLineInterface__Group_2__0__Impl : ( RULE_WS ) ;
    public final void rule__CommandLineInterface__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:820:1: ( ( RULE_WS ) )
            // InternalCurlBetterThanHttpie.g:821:1: ( RULE_WS )
            {
            // InternalCurlBetterThanHttpie.g:821:1: ( RULE_WS )
            // InternalCurlBetterThanHttpie.g:822:2: RULE_WS
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
    // InternalCurlBetterThanHttpie.g:831:1: rule__CommandLineInterface__Group_2__1 : rule__CommandLineInterface__Group_2__1__Impl ;
    public final void rule__CommandLineInterface__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:835:1: ( rule__CommandLineInterface__Group_2__1__Impl )
            // InternalCurlBetterThanHttpie.g:836:2: rule__CommandLineInterface__Group_2__1__Impl
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
    // InternalCurlBetterThanHttpie.g:842:1: rule__CommandLineInterface__Group_2__1__Impl : ( ( rule__CommandLineInterface__FlagsAssignment_2_1 ) ) ;
    public final void rule__CommandLineInterface__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:846:1: ( ( ( rule__CommandLineInterface__FlagsAssignment_2_1 ) ) )
            // InternalCurlBetterThanHttpie.g:847:1: ( ( rule__CommandLineInterface__FlagsAssignment_2_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:847:1: ( ( rule__CommandLineInterface__FlagsAssignment_2_1 ) )
            // InternalCurlBetterThanHttpie.g:848:2: ( rule__CommandLineInterface__FlagsAssignment_2_1 )
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getFlagsAssignment_2_1()); 
            // InternalCurlBetterThanHttpie.g:849:2: ( rule__CommandLineInterface__FlagsAssignment_2_1 )
            // InternalCurlBetterThanHttpie.g:849:3: rule__CommandLineInterface__FlagsAssignment_2_1
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
    // InternalCurlBetterThanHttpie.g:858:1: rule__CommandLineInterface__Group_3__0 : rule__CommandLineInterface__Group_3__0__Impl rule__CommandLineInterface__Group_3__1 ;
    public final void rule__CommandLineInterface__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:862:1: ( rule__CommandLineInterface__Group_3__0__Impl rule__CommandLineInterface__Group_3__1 )
            // InternalCurlBetterThanHttpie.g:863:2: rule__CommandLineInterface__Group_3__0__Impl rule__CommandLineInterface__Group_3__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalCurlBetterThanHttpie.g:870:1: rule__CommandLineInterface__Group_3__0__Impl : ( RULE_WS ) ;
    public final void rule__CommandLineInterface__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:874:1: ( ( RULE_WS ) )
            // InternalCurlBetterThanHttpie.g:875:1: ( RULE_WS )
            {
            // InternalCurlBetterThanHttpie.g:875:1: ( RULE_WS )
            // InternalCurlBetterThanHttpie.g:876:2: RULE_WS
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
    // InternalCurlBetterThanHttpie.g:885:1: rule__CommandLineInterface__Group_3__1 : rule__CommandLineInterface__Group_3__1__Impl ;
    public final void rule__CommandLineInterface__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:889:1: ( rule__CommandLineInterface__Group_3__1__Impl )
            // InternalCurlBetterThanHttpie.g:890:2: rule__CommandLineInterface__Group_3__1__Impl
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
    // InternalCurlBetterThanHttpie.g:896:1: rule__CommandLineInterface__Group_3__1__Impl : ( ( rule__CommandLineInterface__MethodAssignment_3_1 ) ) ;
    public final void rule__CommandLineInterface__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:900:1: ( ( ( rule__CommandLineInterface__MethodAssignment_3_1 ) ) )
            // InternalCurlBetterThanHttpie.g:901:1: ( ( rule__CommandLineInterface__MethodAssignment_3_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:901:1: ( ( rule__CommandLineInterface__MethodAssignment_3_1 ) )
            // InternalCurlBetterThanHttpie.g:902:2: ( rule__CommandLineInterface__MethodAssignment_3_1 )
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getMethodAssignment_3_1()); 
            // InternalCurlBetterThanHttpie.g:903:2: ( rule__CommandLineInterface__MethodAssignment_3_1 )
            // InternalCurlBetterThanHttpie.g:903:3: rule__CommandLineInterface__MethodAssignment_3_1
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


    // $ANTLR start "rule__HeadersFlag__Group__0"
    // InternalCurlBetterThanHttpie.g:912:1: rule__HeadersFlag__Group__0 : rule__HeadersFlag__Group__0__Impl rule__HeadersFlag__Group__1 ;
    public final void rule__HeadersFlag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:916:1: ( rule__HeadersFlag__Group__0__Impl rule__HeadersFlag__Group__1 )
            // InternalCurlBetterThanHttpie.g:917:2: rule__HeadersFlag__Group__0__Impl rule__HeadersFlag__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalCurlBetterThanHttpie.g:924:1: rule__HeadersFlag__Group__0__Impl : ( () ) ;
    public final void rule__HeadersFlag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:928:1: ( ( () ) )
            // InternalCurlBetterThanHttpie.g:929:1: ( () )
            {
            // InternalCurlBetterThanHttpie.g:929:1: ( () )
            // InternalCurlBetterThanHttpie.g:930:2: ()
            {
             before(grammarAccess.getHeadersFlagAccess().getHeadersFlagAction_0()); 
            // InternalCurlBetterThanHttpie.g:931:2: ()
            // InternalCurlBetterThanHttpie.g:931:3: 
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
    // InternalCurlBetterThanHttpie.g:939:1: rule__HeadersFlag__Group__1 : rule__HeadersFlag__Group__1__Impl ;
    public final void rule__HeadersFlag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:943:1: ( rule__HeadersFlag__Group__1__Impl )
            // InternalCurlBetterThanHttpie.g:944:2: rule__HeadersFlag__Group__1__Impl
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
    // InternalCurlBetterThanHttpie.g:950:1: rule__HeadersFlag__Group__1__Impl : ( ( rule__HeadersFlag__Alternatives_1 ) ) ;
    public final void rule__HeadersFlag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:954:1: ( ( ( rule__HeadersFlag__Alternatives_1 ) ) )
            // InternalCurlBetterThanHttpie.g:955:1: ( ( rule__HeadersFlag__Alternatives_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:955:1: ( ( rule__HeadersFlag__Alternatives_1 ) )
            // InternalCurlBetterThanHttpie.g:956:2: ( rule__HeadersFlag__Alternatives_1 )
            {
             before(grammarAccess.getHeadersFlagAccess().getAlternatives_1()); 
            // InternalCurlBetterThanHttpie.g:957:2: ( rule__HeadersFlag__Alternatives_1 )
            // InternalCurlBetterThanHttpie.g:957:3: rule__HeadersFlag__Alternatives_1
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
    // InternalCurlBetterThanHttpie.g:966:1: rule__BodyFlag__Group__0 : rule__BodyFlag__Group__0__Impl rule__BodyFlag__Group__1 ;
    public final void rule__BodyFlag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:970:1: ( rule__BodyFlag__Group__0__Impl rule__BodyFlag__Group__1 )
            // InternalCurlBetterThanHttpie.g:971:2: rule__BodyFlag__Group__0__Impl rule__BodyFlag__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalCurlBetterThanHttpie.g:978:1: rule__BodyFlag__Group__0__Impl : ( () ) ;
    public final void rule__BodyFlag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:982:1: ( ( () ) )
            // InternalCurlBetterThanHttpie.g:983:1: ( () )
            {
            // InternalCurlBetterThanHttpie.g:983:1: ( () )
            // InternalCurlBetterThanHttpie.g:984:2: ()
            {
             before(grammarAccess.getBodyFlagAccess().getBodyFlagAction_0()); 
            // InternalCurlBetterThanHttpie.g:985:2: ()
            // InternalCurlBetterThanHttpie.g:985:3: 
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
    // InternalCurlBetterThanHttpie.g:993:1: rule__BodyFlag__Group__1 : rule__BodyFlag__Group__1__Impl ;
    public final void rule__BodyFlag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:997:1: ( rule__BodyFlag__Group__1__Impl )
            // InternalCurlBetterThanHttpie.g:998:2: rule__BodyFlag__Group__1__Impl
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
    // InternalCurlBetterThanHttpie.g:1004:1: rule__BodyFlag__Group__1__Impl : ( ( rule__BodyFlag__Alternatives_1 ) ) ;
    public final void rule__BodyFlag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1008:1: ( ( ( rule__BodyFlag__Alternatives_1 ) ) )
            // InternalCurlBetterThanHttpie.g:1009:1: ( ( rule__BodyFlag__Alternatives_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:1009:1: ( ( rule__BodyFlag__Alternatives_1 ) )
            // InternalCurlBetterThanHttpie.g:1010:2: ( rule__BodyFlag__Alternatives_1 )
            {
             before(grammarAccess.getBodyFlagAccess().getAlternatives_1()); 
            // InternalCurlBetterThanHttpie.g:1011:2: ( rule__BodyFlag__Alternatives_1 )
            // InternalCurlBetterThanHttpie.g:1011:3: rule__BodyFlag__Alternatives_1
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
    // InternalCurlBetterThanHttpie.g:1020:1: rule__JsonFlag__Group__0 : rule__JsonFlag__Group__0__Impl rule__JsonFlag__Group__1 ;
    public final void rule__JsonFlag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1024:1: ( rule__JsonFlag__Group__0__Impl rule__JsonFlag__Group__1 )
            // InternalCurlBetterThanHttpie.g:1025:2: rule__JsonFlag__Group__0__Impl rule__JsonFlag__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalCurlBetterThanHttpie.g:1032:1: rule__JsonFlag__Group__0__Impl : ( () ) ;
    public final void rule__JsonFlag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1036:1: ( ( () ) )
            // InternalCurlBetterThanHttpie.g:1037:1: ( () )
            {
            // InternalCurlBetterThanHttpie.g:1037:1: ( () )
            // InternalCurlBetterThanHttpie.g:1038:2: ()
            {
             before(grammarAccess.getJsonFlagAccess().getJsonFlagAction_0()); 
            // InternalCurlBetterThanHttpie.g:1039:2: ()
            // InternalCurlBetterThanHttpie.g:1039:3: 
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
    // InternalCurlBetterThanHttpie.g:1047:1: rule__JsonFlag__Group__1 : rule__JsonFlag__Group__1__Impl ;
    public final void rule__JsonFlag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1051:1: ( rule__JsonFlag__Group__1__Impl )
            // InternalCurlBetterThanHttpie.g:1052:2: rule__JsonFlag__Group__1__Impl
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
    // InternalCurlBetterThanHttpie.g:1058:1: rule__JsonFlag__Group__1__Impl : ( ( rule__JsonFlag__Alternatives_1 ) ) ;
    public final void rule__JsonFlag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1062:1: ( ( ( rule__JsonFlag__Alternatives_1 ) ) )
            // InternalCurlBetterThanHttpie.g:1063:1: ( ( rule__JsonFlag__Alternatives_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:1063:1: ( ( rule__JsonFlag__Alternatives_1 ) )
            // InternalCurlBetterThanHttpie.g:1064:2: ( rule__JsonFlag__Alternatives_1 )
            {
             before(grammarAccess.getJsonFlagAccess().getAlternatives_1()); 
            // InternalCurlBetterThanHttpie.g:1065:2: ( rule__JsonFlag__Alternatives_1 )
            // InternalCurlBetterThanHttpie.g:1065:3: rule__JsonFlag__Alternatives_1
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
    // InternalCurlBetterThanHttpie.g:1074:1: rule__FormFlag__Group__0 : rule__FormFlag__Group__0__Impl rule__FormFlag__Group__1 ;
    public final void rule__FormFlag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1078:1: ( rule__FormFlag__Group__0__Impl rule__FormFlag__Group__1 )
            // InternalCurlBetterThanHttpie.g:1079:2: rule__FormFlag__Group__0__Impl rule__FormFlag__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalCurlBetterThanHttpie.g:1086:1: rule__FormFlag__Group__0__Impl : ( () ) ;
    public final void rule__FormFlag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1090:1: ( ( () ) )
            // InternalCurlBetterThanHttpie.g:1091:1: ( () )
            {
            // InternalCurlBetterThanHttpie.g:1091:1: ( () )
            // InternalCurlBetterThanHttpie.g:1092:2: ()
            {
             before(grammarAccess.getFormFlagAccess().getFormFlagAction_0()); 
            // InternalCurlBetterThanHttpie.g:1093:2: ()
            // InternalCurlBetterThanHttpie.g:1093:3: 
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
    // InternalCurlBetterThanHttpie.g:1101:1: rule__FormFlag__Group__1 : rule__FormFlag__Group__1__Impl ;
    public final void rule__FormFlag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1105:1: ( rule__FormFlag__Group__1__Impl )
            // InternalCurlBetterThanHttpie.g:1106:2: rule__FormFlag__Group__1__Impl
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
    // InternalCurlBetterThanHttpie.g:1112:1: rule__FormFlag__Group__1__Impl : ( ( rule__FormFlag__Alternatives_1 ) ) ;
    public final void rule__FormFlag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1116:1: ( ( ( rule__FormFlag__Alternatives_1 ) ) )
            // InternalCurlBetterThanHttpie.g:1117:1: ( ( rule__FormFlag__Alternatives_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:1117:1: ( ( rule__FormFlag__Alternatives_1 ) )
            // InternalCurlBetterThanHttpie.g:1118:2: ( rule__FormFlag__Alternatives_1 )
            {
             before(grammarAccess.getFormFlagAccess().getAlternatives_1()); 
            // InternalCurlBetterThanHttpie.g:1119:2: ( rule__FormFlag__Alternatives_1 )
            // InternalCurlBetterThanHttpie.g:1119:3: rule__FormFlag__Alternatives_1
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
    // InternalCurlBetterThanHttpie.g:1128:1: rule__ProxyFlag__Group__0 : rule__ProxyFlag__Group__0__Impl rule__ProxyFlag__Group__1 ;
    public final void rule__ProxyFlag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1132:1: ( rule__ProxyFlag__Group__0__Impl rule__ProxyFlag__Group__1 )
            // InternalCurlBetterThanHttpie.g:1133:2: rule__ProxyFlag__Group__0__Impl rule__ProxyFlag__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalCurlBetterThanHttpie.g:1140:1: rule__ProxyFlag__Group__0__Impl : ( '--proxy' ) ;
    public final void rule__ProxyFlag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1144:1: ( ( '--proxy' ) )
            // InternalCurlBetterThanHttpie.g:1145:1: ( '--proxy' )
            {
            // InternalCurlBetterThanHttpie.g:1145:1: ( '--proxy' )
            // InternalCurlBetterThanHttpie.g:1146:2: '--proxy'
            {
             before(grammarAccess.getProxyFlagAccess().getProxyKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalCurlBetterThanHttpie.g:1155:1: rule__ProxyFlag__Group__1 : rule__ProxyFlag__Group__1__Impl rule__ProxyFlag__Group__2 ;
    public final void rule__ProxyFlag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1159:1: ( rule__ProxyFlag__Group__1__Impl rule__ProxyFlag__Group__2 )
            // InternalCurlBetterThanHttpie.g:1160:2: rule__ProxyFlag__Group__1__Impl rule__ProxyFlag__Group__2
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
    // InternalCurlBetterThanHttpie.g:1167:1: rule__ProxyFlag__Group__1__Impl : ( RULE_VALUE ) ;
    public final void rule__ProxyFlag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1171:1: ( ( RULE_VALUE ) )
            // InternalCurlBetterThanHttpie.g:1172:1: ( RULE_VALUE )
            {
            // InternalCurlBetterThanHttpie.g:1172:1: ( RULE_VALUE )
            // InternalCurlBetterThanHttpie.g:1173:2: RULE_VALUE
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
    // InternalCurlBetterThanHttpie.g:1182:1: rule__ProxyFlag__Group__2 : rule__ProxyFlag__Group__2__Impl rule__ProxyFlag__Group__3 ;
    public final void rule__ProxyFlag__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1186:1: ( rule__ProxyFlag__Group__2__Impl rule__ProxyFlag__Group__3 )
            // InternalCurlBetterThanHttpie.g:1187:2: rule__ProxyFlag__Group__2__Impl rule__ProxyFlag__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalCurlBetterThanHttpie.g:1194:1: rule__ProxyFlag__Group__2__Impl : ( ( rule__ProxyFlag__Group_2__0 )? ) ;
    public final void rule__ProxyFlag__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1198:1: ( ( ( rule__ProxyFlag__Group_2__0 )? ) )
            // InternalCurlBetterThanHttpie.g:1199:1: ( ( rule__ProxyFlag__Group_2__0 )? )
            {
            // InternalCurlBetterThanHttpie.g:1199:1: ( ( rule__ProxyFlag__Group_2__0 )? )
            // InternalCurlBetterThanHttpie.g:1200:2: ( rule__ProxyFlag__Group_2__0 )?
            {
             before(grammarAccess.getProxyFlagAccess().getGroup_2()); 
            // InternalCurlBetterThanHttpie.g:1201:2: ( rule__ProxyFlag__Group_2__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==33) ) {
                    int LA14_2 = input.LA(3);

                    if ( (LA14_2==RULE_STRING) ) {
                        int LA14_4 = input.LA(4);

                        if ( (LA14_4==EOF||LA14_4==RULE_WS||(LA14_4>=33 && LA14_4<=34)) ) {
                            alt14=1;
                        }
                    }
                }
            }
            switch (alt14) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1201:3: rule__ProxyFlag__Group_2__0
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
    // InternalCurlBetterThanHttpie.g:1209:1: rule__ProxyFlag__Group__3 : rule__ProxyFlag__Group__3__Impl rule__ProxyFlag__Group__4 ;
    public final void rule__ProxyFlag__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1213:1: ( rule__ProxyFlag__Group__3__Impl rule__ProxyFlag__Group__4 )
            // InternalCurlBetterThanHttpie.g:1214:2: rule__ProxyFlag__Group__3__Impl rule__ProxyFlag__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalCurlBetterThanHttpie.g:1221:1: rule__ProxyFlag__Group__3__Impl : ( ( rule__ProxyFlag__Group_3__0 )? ) ;
    public final void rule__ProxyFlag__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1225:1: ( ( ( rule__ProxyFlag__Group_3__0 )? ) )
            // InternalCurlBetterThanHttpie.g:1226:1: ( ( rule__ProxyFlag__Group_3__0 )? )
            {
            // InternalCurlBetterThanHttpie.g:1226:1: ( ( rule__ProxyFlag__Group_3__0 )? )
            // InternalCurlBetterThanHttpie.g:1227:2: ( rule__ProxyFlag__Group_3__0 )?
            {
             before(grammarAccess.getProxyFlagAccess().getGroup_3()); 
            // InternalCurlBetterThanHttpie.g:1228:2: ( rule__ProxyFlag__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==34) ) {
                    alt15=1;
                }
            }
            switch (alt15) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1228:3: rule__ProxyFlag__Group_3__0
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
    // InternalCurlBetterThanHttpie.g:1236:1: rule__ProxyFlag__Group__4 : rule__ProxyFlag__Group__4__Impl rule__ProxyFlag__Group__5 ;
    public final void rule__ProxyFlag__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1240:1: ( rule__ProxyFlag__Group__4__Impl rule__ProxyFlag__Group__5 )
            // InternalCurlBetterThanHttpie.g:1241:2: rule__ProxyFlag__Group__4__Impl rule__ProxyFlag__Group__5
            {
            pushFollow(FOLLOW_13);
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
    // InternalCurlBetterThanHttpie.g:1248:1: rule__ProxyFlag__Group__4__Impl : ( ( rule__ProxyFlag__Group_4__0 )? ) ;
    public final void rule__ProxyFlag__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1252:1: ( ( ( rule__ProxyFlag__Group_4__0 )? ) )
            // InternalCurlBetterThanHttpie.g:1253:1: ( ( rule__ProxyFlag__Group_4__0 )? )
            {
            // InternalCurlBetterThanHttpie.g:1253:1: ( ( rule__ProxyFlag__Group_4__0 )? )
            // InternalCurlBetterThanHttpie.g:1254:2: ( rule__ProxyFlag__Group_4__0 )?
            {
             before(grammarAccess.getProxyFlagAccess().getGroup_4()); 
            // InternalCurlBetterThanHttpie.g:1255:2: ( rule__ProxyFlag__Group_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==33) ) {
                    int LA16_2 = input.LA(3);

                    if ( (LA16_2==RULE_STRING) ) {
                        alt16=1;
                    }
                }
            }
            switch (alt16) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1255:3: rule__ProxyFlag__Group_4__0
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
    // InternalCurlBetterThanHttpie.g:1263:1: rule__ProxyFlag__Group__5 : rule__ProxyFlag__Group__5__Impl rule__ProxyFlag__Group__6 ;
    public final void rule__ProxyFlag__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1267:1: ( rule__ProxyFlag__Group__5__Impl rule__ProxyFlag__Group__6 )
            // InternalCurlBetterThanHttpie.g:1268:2: rule__ProxyFlag__Group__5__Impl rule__ProxyFlag__Group__6
            {
            pushFollow(FOLLOW_14);
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
    // InternalCurlBetterThanHttpie.g:1275:1: rule__ProxyFlag__Group__5__Impl : ( ( rule__ProxyFlag__HostnameAssignment_5 ) ) ;
    public final void rule__ProxyFlag__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1279:1: ( ( ( rule__ProxyFlag__HostnameAssignment_5 ) ) )
            // InternalCurlBetterThanHttpie.g:1280:1: ( ( rule__ProxyFlag__HostnameAssignment_5 ) )
            {
            // InternalCurlBetterThanHttpie.g:1280:1: ( ( rule__ProxyFlag__HostnameAssignment_5 ) )
            // InternalCurlBetterThanHttpie.g:1281:2: ( rule__ProxyFlag__HostnameAssignment_5 )
            {
             before(grammarAccess.getProxyFlagAccess().getHostnameAssignment_5()); 
            // InternalCurlBetterThanHttpie.g:1282:2: ( rule__ProxyFlag__HostnameAssignment_5 )
            // InternalCurlBetterThanHttpie.g:1282:3: rule__ProxyFlag__HostnameAssignment_5
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
    // InternalCurlBetterThanHttpie.g:1290:1: rule__ProxyFlag__Group__6 : rule__ProxyFlag__Group__6__Impl ;
    public final void rule__ProxyFlag__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1294:1: ( rule__ProxyFlag__Group__6__Impl )
            // InternalCurlBetterThanHttpie.g:1295:2: rule__ProxyFlag__Group__6__Impl
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
    // InternalCurlBetterThanHttpie.g:1301:1: rule__ProxyFlag__Group__6__Impl : ( ( rule__ProxyFlag__Group_6__0 )? ) ;
    public final void rule__ProxyFlag__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1305:1: ( ( ( rule__ProxyFlag__Group_6__0 )? ) )
            // InternalCurlBetterThanHttpie.g:1306:1: ( ( rule__ProxyFlag__Group_6__0 )? )
            {
            // InternalCurlBetterThanHttpie.g:1306:1: ( ( rule__ProxyFlag__Group_6__0 )? )
            // InternalCurlBetterThanHttpie.g:1307:2: ( rule__ProxyFlag__Group_6__0 )?
            {
             before(grammarAccess.getProxyFlagAccess().getGroup_6()); 
            // InternalCurlBetterThanHttpie.g:1308:2: ( rule__ProxyFlag__Group_6__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==33) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1308:3: rule__ProxyFlag__Group_6__0
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
    // InternalCurlBetterThanHttpie.g:1317:1: rule__ProxyFlag__Group_2__0 : rule__ProxyFlag__Group_2__0__Impl rule__ProxyFlag__Group_2__1 ;
    public final void rule__ProxyFlag__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1321:1: ( rule__ProxyFlag__Group_2__0__Impl rule__ProxyFlag__Group_2__1 )
            // InternalCurlBetterThanHttpie.g:1322:2: rule__ProxyFlag__Group_2__0__Impl rule__ProxyFlag__Group_2__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalCurlBetterThanHttpie.g:1329:1: rule__ProxyFlag__Group_2__0__Impl : ( ( rule__ProxyFlag__ProtocolAssignment_2_0 ) ) ;
    public final void rule__ProxyFlag__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1333:1: ( ( ( rule__ProxyFlag__ProtocolAssignment_2_0 ) ) )
            // InternalCurlBetterThanHttpie.g:1334:1: ( ( rule__ProxyFlag__ProtocolAssignment_2_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:1334:1: ( ( rule__ProxyFlag__ProtocolAssignment_2_0 ) )
            // InternalCurlBetterThanHttpie.g:1335:2: ( rule__ProxyFlag__ProtocolAssignment_2_0 )
            {
             before(grammarAccess.getProxyFlagAccess().getProtocolAssignment_2_0()); 
            // InternalCurlBetterThanHttpie.g:1336:2: ( rule__ProxyFlag__ProtocolAssignment_2_0 )
            // InternalCurlBetterThanHttpie.g:1336:3: rule__ProxyFlag__ProtocolAssignment_2_0
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
    // InternalCurlBetterThanHttpie.g:1344:1: rule__ProxyFlag__Group_2__1 : rule__ProxyFlag__Group_2__1__Impl ;
    public final void rule__ProxyFlag__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1348:1: ( rule__ProxyFlag__Group_2__1__Impl )
            // InternalCurlBetterThanHttpie.g:1349:2: rule__ProxyFlag__Group_2__1__Impl
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
    // InternalCurlBetterThanHttpie.g:1355:1: rule__ProxyFlag__Group_2__1__Impl : ( ':' ) ;
    public final void rule__ProxyFlag__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1359:1: ( ( ':' ) )
            // InternalCurlBetterThanHttpie.g:1360:1: ( ':' )
            {
            // InternalCurlBetterThanHttpie.g:1360:1: ( ':' )
            // InternalCurlBetterThanHttpie.g:1361:2: ':'
            {
             before(grammarAccess.getProxyFlagAccess().getColonKeyword_2_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalCurlBetterThanHttpie.g:1371:1: rule__ProxyFlag__Group_3__0 : rule__ProxyFlag__Group_3__0__Impl rule__ProxyFlag__Group_3__1 ;
    public final void rule__ProxyFlag__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1375:1: ( rule__ProxyFlag__Group_3__0__Impl rule__ProxyFlag__Group_3__1 )
            // InternalCurlBetterThanHttpie.g:1376:2: rule__ProxyFlag__Group_3__0__Impl rule__ProxyFlag__Group_3__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalCurlBetterThanHttpie.g:1383:1: rule__ProxyFlag__Group_3__0__Impl : ( ( rule__ProxyFlag__ProxyProtocolAssignment_3_0 ) ) ;
    public final void rule__ProxyFlag__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1387:1: ( ( ( rule__ProxyFlag__ProxyProtocolAssignment_3_0 ) ) )
            // InternalCurlBetterThanHttpie.g:1388:1: ( ( rule__ProxyFlag__ProxyProtocolAssignment_3_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:1388:1: ( ( rule__ProxyFlag__ProxyProtocolAssignment_3_0 ) )
            // InternalCurlBetterThanHttpie.g:1389:2: ( rule__ProxyFlag__ProxyProtocolAssignment_3_0 )
            {
             before(grammarAccess.getProxyFlagAccess().getProxyProtocolAssignment_3_0()); 
            // InternalCurlBetterThanHttpie.g:1390:2: ( rule__ProxyFlag__ProxyProtocolAssignment_3_0 )
            // InternalCurlBetterThanHttpie.g:1390:3: rule__ProxyFlag__ProxyProtocolAssignment_3_0
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
    // InternalCurlBetterThanHttpie.g:1398:1: rule__ProxyFlag__Group_3__1 : rule__ProxyFlag__Group_3__1__Impl ;
    public final void rule__ProxyFlag__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1402:1: ( rule__ProxyFlag__Group_3__1__Impl )
            // InternalCurlBetterThanHttpie.g:1403:2: rule__ProxyFlag__Group_3__1__Impl
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
    // InternalCurlBetterThanHttpie.g:1409:1: rule__ProxyFlag__Group_3__1__Impl : ( '://' ) ;
    public final void rule__ProxyFlag__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1413:1: ( ( '://' ) )
            // InternalCurlBetterThanHttpie.g:1414:1: ( '://' )
            {
            // InternalCurlBetterThanHttpie.g:1414:1: ( '://' )
            // InternalCurlBetterThanHttpie.g:1415:2: '://'
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
    // InternalCurlBetterThanHttpie.g:1425:1: rule__ProxyFlag__Group_4__0 : rule__ProxyFlag__Group_4__0__Impl rule__ProxyFlag__Group_4__1 ;
    public final void rule__ProxyFlag__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1429:1: ( rule__ProxyFlag__Group_4__0__Impl rule__ProxyFlag__Group_4__1 )
            // InternalCurlBetterThanHttpie.g:1430:2: rule__ProxyFlag__Group_4__0__Impl rule__ProxyFlag__Group_4__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalCurlBetterThanHttpie.g:1437:1: rule__ProxyFlag__Group_4__0__Impl : ( ( rule__ProxyFlag__UsernameAssignment_4_0 ) ) ;
    public final void rule__ProxyFlag__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1441:1: ( ( ( rule__ProxyFlag__UsernameAssignment_4_0 ) ) )
            // InternalCurlBetterThanHttpie.g:1442:1: ( ( rule__ProxyFlag__UsernameAssignment_4_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:1442:1: ( ( rule__ProxyFlag__UsernameAssignment_4_0 ) )
            // InternalCurlBetterThanHttpie.g:1443:2: ( rule__ProxyFlag__UsernameAssignment_4_0 )
            {
             before(grammarAccess.getProxyFlagAccess().getUsernameAssignment_4_0()); 
            // InternalCurlBetterThanHttpie.g:1444:2: ( rule__ProxyFlag__UsernameAssignment_4_0 )
            // InternalCurlBetterThanHttpie.g:1444:3: rule__ProxyFlag__UsernameAssignment_4_0
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
    // InternalCurlBetterThanHttpie.g:1452:1: rule__ProxyFlag__Group_4__1 : rule__ProxyFlag__Group_4__1__Impl rule__ProxyFlag__Group_4__2 ;
    public final void rule__ProxyFlag__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1456:1: ( rule__ProxyFlag__Group_4__1__Impl rule__ProxyFlag__Group_4__2 )
            // InternalCurlBetterThanHttpie.g:1457:2: rule__ProxyFlag__Group_4__1__Impl rule__ProxyFlag__Group_4__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalCurlBetterThanHttpie.g:1464:1: rule__ProxyFlag__Group_4__1__Impl : ( ':' ) ;
    public final void rule__ProxyFlag__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1468:1: ( ( ':' ) )
            // InternalCurlBetterThanHttpie.g:1469:1: ( ':' )
            {
            // InternalCurlBetterThanHttpie.g:1469:1: ( ':' )
            // InternalCurlBetterThanHttpie.g:1470:2: ':'
            {
             before(grammarAccess.getProxyFlagAccess().getColonKeyword_4_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalCurlBetterThanHttpie.g:1479:1: rule__ProxyFlag__Group_4__2 : rule__ProxyFlag__Group_4__2__Impl rule__ProxyFlag__Group_4__3 ;
    public final void rule__ProxyFlag__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1483:1: ( rule__ProxyFlag__Group_4__2__Impl rule__ProxyFlag__Group_4__3 )
            // InternalCurlBetterThanHttpie.g:1484:2: rule__ProxyFlag__Group_4__2__Impl rule__ProxyFlag__Group_4__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalCurlBetterThanHttpie.g:1491:1: rule__ProxyFlag__Group_4__2__Impl : ( ( rule__ProxyFlag__PasswordAssignment_4_2 ) ) ;
    public final void rule__ProxyFlag__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1495:1: ( ( ( rule__ProxyFlag__PasswordAssignment_4_2 ) ) )
            // InternalCurlBetterThanHttpie.g:1496:1: ( ( rule__ProxyFlag__PasswordAssignment_4_2 ) )
            {
            // InternalCurlBetterThanHttpie.g:1496:1: ( ( rule__ProxyFlag__PasswordAssignment_4_2 ) )
            // InternalCurlBetterThanHttpie.g:1497:2: ( rule__ProxyFlag__PasswordAssignment_4_2 )
            {
             before(grammarAccess.getProxyFlagAccess().getPasswordAssignment_4_2()); 
            // InternalCurlBetterThanHttpie.g:1498:2: ( rule__ProxyFlag__PasswordAssignment_4_2 )
            // InternalCurlBetterThanHttpie.g:1498:3: rule__ProxyFlag__PasswordAssignment_4_2
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
    // InternalCurlBetterThanHttpie.g:1506:1: rule__ProxyFlag__Group_4__3 : rule__ProxyFlag__Group_4__3__Impl ;
    public final void rule__ProxyFlag__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1510:1: ( rule__ProxyFlag__Group_4__3__Impl )
            // InternalCurlBetterThanHttpie.g:1511:2: rule__ProxyFlag__Group_4__3__Impl
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
    // InternalCurlBetterThanHttpie.g:1517:1: rule__ProxyFlag__Group_4__3__Impl : ( 'a' ) ;
    public final void rule__ProxyFlag__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1521:1: ( ( 'a' ) )
            // InternalCurlBetterThanHttpie.g:1522:1: ( 'a' )
            {
            // InternalCurlBetterThanHttpie.g:1522:1: ( 'a' )
            // InternalCurlBetterThanHttpie.g:1523:2: 'a'
            {
             before(grammarAccess.getProxyFlagAccess().getAKeyword_4_3()); 
            match(input,35,FOLLOW_2); 
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
    // InternalCurlBetterThanHttpie.g:1533:1: rule__ProxyFlag__Group_6__0 : rule__ProxyFlag__Group_6__0__Impl rule__ProxyFlag__Group_6__1 ;
    public final void rule__ProxyFlag__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1537:1: ( rule__ProxyFlag__Group_6__0__Impl rule__ProxyFlag__Group_6__1 )
            // InternalCurlBetterThanHttpie.g:1538:2: rule__ProxyFlag__Group_6__0__Impl rule__ProxyFlag__Group_6__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalCurlBetterThanHttpie.g:1545:1: rule__ProxyFlag__Group_6__0__Impl : ( ':' ) ;
    public final void rule__ProxyFlag__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1549:1: ( ( ':' ) )
            // InternalCurlBetterThanHttpie.g:1550:1: ( ':' )
            {
            // InternalCurlBetterThanHttpie.g:1550:1: ( ':' )
            // InternalCurlBetterThanHttpie.g:1551:2: ':'
            {
             before(grammarAccess.getProxyFlagAccess().getColonKeyword_6_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalCurlBetterThanHttpie.g:1560:1: rule__ProxyFlag__Group_6__1 : rule__ProxyFlag__Group_6__1__Impl ;
    public final void rule__ProxyFlag__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1564:1: ( rule__ProxyFlag__Group_6__1__Impl )
            // InternalCurlBetterThanHttpie.g:1565:2: rule__ProxyFlag__Group_6__1__Impl
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
    // InternalCurlBetterThanHttpie.g:1571:1: rule__ProxyFlag__Group_6__1__Impl : ( ( rule__ProxyFlag__PortAssignment_6_1 ) ) ;
    public final void rule__ProxyFlag__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1575:1: ( ( ( rule__ProxyFlag__PortAssignment_6_1 ) ) )
            // InternalCurlBetterThanHttpie.g:1576:1: ( ( rule__ProxyFlag__PortAssignment_6_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:1576:1: ( ( rule__ProxyFlag__PortAssignment_6_1 ) )
            // InternalCurlBetterThanHttpie.g:1577:2: ( rule__ProxyFlag__PortAssignment_6_1 )
            {
             before(grammarAccess.getProxyFlagAccess().getPortAssignment_6_1()); 
            // InternalCurlBetterThanHttpie.g:1578:2: ( rule__ProxyFlag__PortAssignment_6_1 )
            // InternalCurlBetterThanHttpie.g:1578:3: rule__ProxyFlag__PortAssignment_6_1
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
    // InternalCurlBetterThanHttpie.g:1587:1: rule__AuthFlag__Group__0 : rule__AuthFlag__Group__0__Impl rule__AuthFlag__Group__1 ;
    public final void rule__AuthFlag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1591:1: ( rule__AuthFlag__Group__0__Impl rule__AuthFlag__Group__1 )
            // InternalCurlBetterThanHttpie.g:1592:2: rule__AuthFlag__Group__0__Impl rule__AuthFlag__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalCurlBetterThanHttpie.g:1599:1: rule__AuthFlag__Group__0__Impl : ( ( rule__AuthFlag__Alternatives_0 ) ) ;
    public final void rule__AuthFlag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1603:1: ( ( ( rule__AuthFlag__Alternatives_0 ) ) )
            // InternalCurlBetterThanHttpie.g:1604:1: ( ( rule__AuthFlag__Alternatives_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:1604:1: ( ( rule__AuthFlag__Alternatives_0 ) )
            // InternalCurlBetterThanHttpie.g:1605:2: ( rule__AuthFlag__Alternatives_0 )
            {
             before(grammarAccess.getAuthFlagAccess().getAlternatives_0()); 
            // InternalCurlBetterThanHttpie.g:1606:2: ( rule__AuthFlag__Alternatives_0 )
            // InternalCurlBetterThanHttpie.g:1606:3: rule__AuthFlag__Alternatives_0
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
    // InternalCurlBetterThanHttpie.g:1614:1: rule__AuthFlag__Group__1 : rule__AuthFlag__Group__1__Impl rule__AuthFlag__Group__2 ;
    public final void rule__AuthFlag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1618:1: ( rule__AuthFlag__Group__1__Impl rule__AuthFlag__Group__2 )
            // InternalCurlBetterThanHttpie.g:1619:2: rule__AuthFlag__Group__1__Impl rule__AuthFlag__Group__2
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
    // InternalCurlBetterThanHttpie.g:1626:1: rule__AuthFlag__Group__1__Impl : ( RULE_VALUE ) ;
    public final void rule__AuthFlag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1630:1: ( ( RULE_VALUE ) )
            // InternalCurlBetterThanHttpie.g:1631:1: ( RULE_VALUE )
            {
            // InternalCurlBetterThanHttpie.g:1631:1: ( RULE_VALUE )
            // InternalCurlBetterThanHttpie.g:1632:2: RULE_VALUE
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
    // InternalCurlBetterThanHttpie.g:1641:1: rule__AuthFlag__Group__2 : rule__AuthFlag__Group__2__Impl rule__AuthFlag__Group__3 ;
    public final void rule__AuthFlag__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1645:1: ( rule__AuthFlag__Group__2__Impl rule__AuthFlag__Group__3 )
            // InternalCurlBetterThanHttpie.g:1646:2: rule__AuthFlag__Group__2__Impl rule__AuthFlag__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalCurlBetterThanHttpie.g:1653:1: rule__AuthFlag__Group__2__Impl : ( ( rule__AuthFlag__UsernameAssignment_2 ) ) ;
    public final void rule__AuthFlag__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1657:1: ( ( ( rule__AuthFlag__UsernameAssignment_2 ) ) )
            // InternalCurlBetterThanHttpie.g:1658:1: ( ( rule__AuthFlag__UsernameAssignment_2 ) )
            {
            // InternalCurlBetterThanHttpie.g:1658:1: ( ( rule__AuthFlag__UsernameAssignment_2 ) )
            // InternalCurlBetterThanHttpie.g:1659:2: ( rule__AuthFlag__UsernameAssignment_2 )
            {
             before(grammarAccess.getAuthFlagAccess().getUsernameAssignment_2()); 
            // InternalCurlBetterThanHttpie.g:1660:2: ( rule__AuthFlag__UsernameAssignment_2 )
            // InternalCurlBetterThanHttpie.g:1660:3: rule__AuthFlag__UsernameAssignment_2
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
    // InternalCurlBetterThanHttpie.g:1668:1: rule__AuthFlag__Group__3 : rule__AuthFlag__Group__3__Impl rule__AuthFlag__Group__4 ;
    public final void rule__AuthFlag__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1672:1: ( rule__AuthFlag__Group__3__Impl rule__AuthFlag__Group__4 )
            // InternalCurlBetterThanHttpie.g:1673:2: rule__AuthFlag__Group__3__Impl rule__AuthFlag__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalCurlBetterThanHttpie.g:1680:1: rule__AuthFlag__Group__3__Impl : ( ( rule__AuthFlag__Group_3__0 )? ) ;
    public final void rule__AuthFlag__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1684:1: ( ( ( rule__AuthFlag__Group_3__0 )? ) )
            // InternalCurlBetterThanHttpie.g:1685:1: ( ( rule__AuthFlag__Group_3__0 )? )
            {
            // InternalCurlBetterThanHttpie.g:1685:1: ( ( rule__AuthFlag__Group_3__0 )? )
            // InternalCurlBetterThanHttpie.g:1686:2: ( rule__AuthFlag__Group_3__0 )?
            {
             before(grammarAccess.getAuthFlagAccess().getGroup_3()); 
            // InternalCurlBetterThanHttpie.g:1687:2: ( rule__AuthFlag__Group_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==33) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1687:3: rule__AuthFlag__Group_3__0
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
    // InternalCurlBetterThanHttpie.g:1695:1: rule__AuthFlag__Group__4 : rule__AuthFlag__Group__4__Impl ;
    public final void rule__AuthFlag__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1699:1: ( rule__AuthFlag__Group__4__Impl )
            // InternalCurlBetterThanHttpie.g:1700:2: rule__AuthFlag__Group__4__Impl
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
    // InternalCurlBetterThanHttpie.g:1706:1: rule__AuthFlag__Group__4__Impl : ( ( rule__AuthFlag__Group_4__0 )? ) ;
    public final void rule__AuthFlag__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1710:1: ( ( ( rule__AuthFlag__Group_4__0 )? ) )
            // InternalCurlBetterThanHttpie.g:1711:1: ( ( rule__AuthFlag__Group_4__0 )? )
            {
            // InternalCurlBetterThanHttpie.g:1711:1: ( ( rule__AuthFlag__Group_4__0 )? )
            // InternalCurlBetterThanHttpie.g:1712:2: ( rule__AuthFlag__Group_4__0 )?
            {
             before(grammarAccess.getAuthFlagAccess().getGroup_4()); 
            // InternalCurlBetterThanHttpie.g:1713:2: ( rule__AuthFlag__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==36) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1713:3: rule__AuthFlag__Group_4__0
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
    // InternalCurlBetterThanHttpie.g:1722:1: rule__AuthFlag__Group_3__0 : rule__AuthFlag__Group_3__0__Impl rule__AuthFlag__Group_3__1 ;
    public final void rule__AuthFlag__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1726:1: ( rule__AuthFlag__Group_3__0__Impl rule__AuthFlag__Group_3__1 )
            // InternalCurlBetterThanHttpie.g:1727:2: rule__AuthFlag__Group_3__0__Impl rule__AuthFlag__Group_3__1
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
    // InternalCurlBetterThanHttpie.g:1734:1: rule__AuthFlag__Group_3__0__Impl : ( ':' ) ;
    public final void rule__AuthFlag__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1738:1: ( ( ':' ) )
            // InternalCurlBetterThanHttpie.g:1739:1: ( ':' )
            {
            // InternalCurlBetterThanHttpie.g:1739:1: ( ':' )
            // InternalCurlBetterThanHttpie.g:1740:2: ':'
            {
             before(grammarAccess.getAuthFlagAccess().getColonKeyword_3_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalCurlBetterThanHttpie.g:1749:1: rule__AuthFlag__Group_3__1 : rule__AuthFlag__Group_3__1__Impl ;
    public final void rule__AuthFlag__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1753:1: ( rule__AuthFlag__Group_3__1__Impl )
            // InternalCurlBetterThanHttpie.g:1754:2: rule__AuthFlag__Group_3__1__Impl
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
    // InternalCurlBetterThanHttpie.g:1760:1: rule__AuthFlag__Group_3__1__Impl : ( ( rule__AuthFlag__PasswordAssignment_3_1 ) ) ;
    public final void rule__AuthFlag__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1764:1: ( ( ( rule__AuthFlag__PasswordAssignment_3_1 ) ) )
            // InternalCurlBetterThanHttpie.g:1765:1: ( ( rule__AuthFlag__PasswordAssignment_3_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:1765:1: ( ( rule__AuthFlag__PasswordAssignment_3_1 ) )
            // InternalCurlBetterThanHttpie.g:1766:2: ( rule__AuthFlag__PasswordAssignment_3_1 )
            {
             before(grammarAccess.getAuthFlagAccess().getPasswordAssignment_3_1()); 
            // InternalCurlBetterThanHttpie.g:1767:2: ( rule__AuthFlag__PasswordAssignment_3_1 )
            // InternalCurlBetterThanHttpie.g:1767:3: rule__AuthFlag__PasswordAssignment_3_1
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
    // InternalCurlBetterThanHttpie.g:1776:1: rule__AuthFlag__Group_4__0 : rule__AuthFlag__Group_4__0__Impl rule__AuthFlag__Group_4__1 ;
    public final void rule__AuthFlag__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1780:1: ( rule__AuthFlag__Group_4__0__Impl rule__AuthFlag__Group_4__1 )
            // InternalCurlBetterThanHttpie.g:1781:2: rule__AuthFlag__Group_4__0__Impl rule__AuthFlag__Group_4__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalCurlBetterThanHttpie.g:1788:1: rule__AuthFlag__Group_4__0__Impl : ( '@' ) ;
    public final void rule__AuthFlag__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1792:1: ( ( '@' ) )
            // InternalCurlBetterThanHttpie.g:1793:1: ( '@' )
            {
            // InternalCurlBetterThanHttpie.g:1793:1: ( '@' )
            // InternalCurlBetterThanHttpie.g:1794:2: '@'
            {
             before(grammarAccess.getAuthFlagAccess().getCommercialAtKeyword_4_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalCurlBetterThanHttpie.g:1803:1: rule__AuthFlag__Group_4__1 : rule__AuthFlag__Group_4__1__Impl ;
    public final void rule__AuthFlag__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1807:1: ( rule__AuthFlag__Group_4__1__Impl )
            // InternalCurlBetterThanHttpie.g:1808:2: rule__AuthFlag__Group_4__1__Impl
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
    // InternalCurlBetterThanHttpie.g:1814:1: rule__AuthFlag__Group_4__1__Impl : ( ( rule__AuthFlag__HostnameAssignment_4_1 ) ) ;
    public final void rule__AuthFlag__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1818:1: ( ( ( rule__AuthFlag__HostnameAssignment_4_1 ) ) )
            // InternalCurlBetterThanHttpie.g:1819:1: ( ( rule__AuthFlag__HostnameAssignment_4_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:1819:1: ( ( rule__AuthFlag__HostnameAssignment_4_1 ) )
            // InternalCurlBetterThanHttpie.g:1820:2: ( rule__AuthFlag__HostnameAssignment_4_1 )
            {
             before(grammarAccess.getAuthFlagAccess().getHostnameAssignment_4_1()); 
            // InternalCurlBetterThanHttpie.g:1821:2: ( rule__AuthFlag__HostnameAssignment_4_1 )
            // InternalCurlBetterThanHttpie.g:1821:3: rule__AuthFlag__HostnameAssignment_4_1
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
    // InternalCurlBetterThanHttpie.g:1830:1: rule__DownloadFlag__Group__0 : rule__DownloadFlag__Group__0__Impl rule__DownloadFlag__Group__1 ;
    public final void rule__DownloadFlag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1834:1: ( rule__DownloadFlag__Group__0__Impl rule__DownloadFlag__Group__1 )
            // InternalCurlBetterThanHttpie.g:1835:2: rule__DownloadFlag__Group__0__Impl rule__DownloadFlag__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalCurlBetterThanHttpie.g:1842:1: rule__DownloadFlag__Group__0__Impl : ( () ) ;
    public final void rule__DownloadFlag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1846:1: ( ( () ) )
            // InternalCurlBetterThanHttpie.g:1847:1: ( () )
            {
            // InternalCurlBetterThanHttpie.g:1847:1: ( () )
            // InternalCurlBetterThanHttpie.g:1848:2: ()
            {
             before(grammarAccess.getDownloadFlagAccess().getDownloadFlagAction_0()); 
            // InternalCurlBetterThanHttpie.g:1849:2: ()
            // InternalCurlBetterThanHttpie.g:1849:3: 
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
    // InternalCurlBetterThanHttpie.g:1857:1: rule__DownloadFlag__Group__1 : rule__DownloadFlag__Group__1__Impl ;
    public final void rule__DownloadFlag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1861:1: ( rule__DownloadFlag__Group__1__Impl )
            // InternalCurlBetterThanHttpie.g:1862:2: rule__DownloadFlag__Group__1__Impl
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
    // InternalCurlBetterThanHttpie.g:1868:1: rule__DownloadFlag__Group__1__Impl : ( ( rule__DownloadFlag__Alternatives_1 ) ) ;
    public final void rule__DownloadFlag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1872:1: ( ( ( rule__DownloadFlag__Alternatives_1 ) ) )
            // InternalCurlBetterThanHttpie.g:1873:1: ( ( rule__DownloadFlag__Alternatives_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:1873:1: ( ( rule__DownloadFlag__Alternatives_1 ) )
            // InternalCurlBetterThanHttpie.g:1874:2: ( rule__DownloadFlag__Alternatives_1 )
            {
             before(grammarAccess.getDownloadFlagAccess().getAlternatives_1()); 
            // InternalCurlBetterThanHttpie.g:1875:2: ( rule__DownloadFlag__Alternatives_1 )
            // InternalCurlBetterThanHttpie.g:1875:3: rule__DownloadFlag__Alternatives_1
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
    // InternalCurlBetterThanHttpie.g:1884:1: rule__HelpFlag__Group__0 : rule__HelpFlag__Group__0__Impl rule__HelpFlag__Group__1 ;
    public final void rule__HelpFlag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1888:1: ( rule__HelpFlag__Group__0__Impl rule__HelpFlag__Group__1 )
            // InternalCurlBetterThanHttpie.g:1889:2: rule__HelpFlag__Group__0__Impl rule__HelpFlag__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalCurlBetterThanHttpie.g:1896:1: rule__HelpFlag__Group__0__Impl : ( () ) ;
    public final void rule__HelpFlag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1900:1: ( ( () ) )
            // InternalCurlBetterThanHttpie.g:1901:1: ( () )
            {
            // InternalCurlBetterThanHttpie.g:1901:1: ( () )
            // InternalCurlBetterThanHttpie.g:1902:2: ()
            {
             before(grammarAccess.getHelpFlagAccess().getHelpFlagAction_0()); 
            // InternalCurlBetterThanHttpie.g:1903:2: ()
            // InternalCurlBetterThanHttpie.g:1903:3: 
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
    // InternalCurlBetterThanHttpie.g:1911:1: rule__HelpFlag__Group__1 : rule__HelpFlag__Group__1__Impl ;
    public final void rule__HelpFlag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1915:1: ( rule__HelpFlag__Group__1__Impl )
            // InternalCurlBetterThanHttpie.g:1916:2: rule__HelpFlag__Group__1__Impl
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
    // InternalCurlBetterThanHttpie.g:1922:1: rule__HelpFlag__Group__1__Impl : ( ( rule__HelpFlag__Alternatives_1 ) ) ;
    public final void rule__HelpFlag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1926:1: ( ( ( rule__HelpFlag__Alternatives_1 ) ) )
            // InternalCurlBetterThanHttpie.g:1927:1: ( ( rule__HelpFlag__Alternatives_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:1927:1: ( ( rule__HelpFlag__Alternatives_1 ) )
            // InternalCurlBetterThanHttpie.g:1928:2: ( rule__HelpFlag__Alternatives_1 )
            {
             before(grammarAccess.getHelpFlagAccess().getAlternatives_1()); 
            // InternalCurlBetterThanHttpie.g:1929:2: ( rule__HelpFlag__Alternatives_1 )
            // InternalCurlBetterThanHttpie.g:1929:3: rule__HelpFlag__Alternatives_1
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
    // InternalCurlBetterThanHttpie.g:1938:1: rule__VersionFlag__Group__0 : rule__VersionFlag__Group__0__Impl rule__VersionFlag__Group__1 ;
    public final void rule__VersionFlag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1942:1: ( rule__VersionFlag__Group__0__Impl rule__VersionFlag__Group__1 )
            // InternalCurlBetterThanHttpie.g:1943:2: rule__VersionFlag__Group__0__Impl rule__VersionFlag__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalCurlBetterThanHttpie.g:1950:1: rule__VersionFlag__Group__0__Impl : ( () ) ;
    public final void rule__VersionFlag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1954:1: ( ( () ) )
            // InternalCurlBetterThanHttpie.g:1955:1: ( () )
            {
            // InternalCurlBetterThanHttpie.g:1955:1: ( () )
            // InternalCurlBetterThanHttpie.g:1956:2: ()
            {
             before(grammarAccess.getVersionFlagAccess().getVersionFlagAction_0()); 
            // InternalCurlBetterThanHttpie.g:1957:2: ()
            // InternalCurlBetterThanHttpie.g:1957:3: 
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
    // InternalCurlBetterThanHttpie.g:1965:1: rule__VersionFlag__Group__1 : rule__VersionFlag__Group__1__Impl ;
    public final void rule__VersionFlag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1969:1: ( rule__VersionFlag__Group__1__Impl )
            // InternalCurlBetterThanHttpie.g:1970:2: rule__VersionFlag__Group__1__Impl
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
    // InternalCurlBetterThanHttpie.g:1976:1: rule__VersionFlag__Group__1__Impl : ( '--version' ) ;
    public final void rule__VersionFlag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1980:1: ( ( '--version' ) )
            // InternalCurlBetterThanHttpie.g:1981:1: ( '--version' )
            {
            // InternalCurlBetterThanHttpie.g:1981:1: ( '--version' )
            // InternalCurlBetterThanHttpie.g:1982:2: '--version'
            {
             before(grammarAccess.getVersionFlagAccess().getVersionKeyword_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalCurlBetterThanHttpie.g:1992:1: rule__VerboseFlag__Group__0 : rule__VerboseFlag__Group__0__Impl rule__VerboseFlag__Group__1 ;
    public final void rule__VerboseFlag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1996:1: ( rule__VerboseFlag__Group__0__Impl rule__VerboseFlag__Group__1 )
            // InternalCurlBetterThanHttpie.g:1997:2: rule__VerboseFlag__Group__0__Impl rule__VerboseFlag__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalCurlBetterThanHttpie.g:2004:1: rule__VerboseFlag__Group__0__Impl : ( () ) ;
    public final void rule__VerboseFlag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2008:1: ( ( () ) )
            // InternalCurlBetterThanHttpie.g:2009:1: ( () )
            {
            // InternalCurlBetterThanHttpie.g:2009:1: ( () )
            // InternalCurlBetterThanHttpie.g:2010:2: ()
            {
             before(grammarAccess.getVerboseFlagAccess().getVerboseFlagAction_0()); 
            // InternalCurlBetterThanHttpie.g:2011:2: ()
            // InternalCurlBetterThanHttpie.g:2011:3: 
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
    // InternalCurlBetterThanHttpie.g:2019:1: rule__VerboseFlag__Group__1 : rule__VerboseFlag__Group__1__Impl ;
    public final void rule__VerboseFlag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2023:1: ( rule__VerboseFlag__Group__1__Impl )
            // InternalCurlBetterThanHttpie.g:2024:2: rule__VerboseFlag__Group__1__Impl
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
    // InternalCurlBetterThanHttpie.g:2030:1: rule__VerboseFlag__Group__1__Impl : ( ( rule__VerboseFlag__Alternatives_1 ) ) ;
    public final void rule__VerboseFlag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2034:1: ( ( ( rule__VerboseFlag__Alternatives_1 ) ) )
            // InternalCurlBetterThanHttpie.g:2035:1: ( ( rule__VerboseFlag__Alternatives_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:2035:1: ( ( rule__VerboseFlag__Alternatives_1 ) )
            // InternalCurlBetterThanHttpie.g:2036:2: ( rule__VerboseFlag__Alternatives_1 )
            {
             before(grammarAccess.getVerboseFlagAccess().getAlternatives_1()); 
            // InternalCurlBetterThanHttpie.g:2037:2: ( rule__VerboseFlag__Alternatives_1 )
            // InternalCurlBetterThanHttpie.g:2037:3: rule__VerboseFlag__Alternatives_1
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
    // InternalCurlBetterThanHttpie.g:2046:1: rule__TimeoutFlag__Group__0 : rule__TimeoutFlag__Group__0__Impl rule__TimeoutFlag__Group__1 ;
    public final void rule__TimeoutFlag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2050:1: ( rule__TimeoutFlag__Group__0__Impl rule__TimeoutFlag__Group__1 )
            // InternalCurlBetterThanHttpie.g:2051:2: rule__TimeoutFlag__Group__0__Impl rule__TimeoutFlag__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalCurlBetterThanHttpie.g:2058:1: rule__TimeoutFlag__Group__0__Impl : ( '--timeout' ) ;
    public final void rule__TimeoutFlag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2062:1: ( ( '--timeout' ) )
            // InternalCurlBetterThanHttpie.g:2063:1: ( '--timeout' )
            {
            // InternalCurlBetterThanHttpie.g:2063:1: ( '--timeout' )
            // InternalCurlBetterThanHttpie.g:2064:2: '--timeout'
            {
             before(grammarAccess.getTimeoutFlagAccess().getTimeoutKeyword_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalCurlBetterThanHttpie.g:2073:1: rule__TimeoutFlag__Group__1 : rule__TimeoutFlag__Group__1__Impl rule__TimeoutFlag__Group__2 ;
    public final void rule__TimeoutFlag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2077:1: ( rule__TimeoutFlag__Group__1__Impl rule__TimeoutFlag__Group__2 )
            // InternalCurlBetterThanHttpie.g:2078:2: rule__TimeoutFlag__Group__1__Impl rule__TimeoutFlag__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalCurlBetterThanHttpie.g:2085:1: rule__TimeoutFlag__Group__1__Impl : ( RULE_VALUE ) ;
    public final void rule__TimeoutFlag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2089:1: ( ( RULE_VALUE ) )
            // InternalCurlBetterThanHttpie.g:2090:1: ( RULE_VALUE )
            {
            // InternalCurlBetterThanHttpie.g:2090:1: ( RULE_VALUE )
            // InternalCurlBetterThanHttpie.g:2091:2: RULE_VALUE
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
    // InternalCurlBetterThanHttpie.g:2100:1: rule__TimeoutFlag__Group__2 : rule__TimeoutFlag__Group__2__Impl ;
    public final void rule__TimeoutFlag__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2104:1: ( rule__TimeoutFlag__Group__2__Impl )
            // InternalCurlBetterThanHttpie.g:2105:2: rule__TimeoutFlag__Group__2__Impl
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
    // InternalCurlBetterThanHttpie.g:2111:1: rule__TimeoutFlag__Group__2__Impl : ( ( rule__TimeoutFlag__TimeoutAssignment_2 ) ) ;
    public final void rule__TimeoutFlag__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2115:1: ( ( ( rule__TimeoutFlag__TimeoutAssignment_2 ) ) )
            // InternalCurlBetterThanHttpie.g:2116:1: ( ( rule__TimeoutFlag__TimeoutAssignment_2 ) )
            {
            // InternalCurlBetterThanHttpie.g:2116:1: ( ( rule__TimeoutFlag__TimeoutAssignment_2 ) )
            // InternalCurlBetterThanHttpie.g:2117:2: ( rule__TimeoutFlag__TimeoutAssignment_2 )
            {
             before(grammarAccess.getTimeoutFlagAccess().getTimeoutAssignment_2()); 
            // InternalCurlBetterThanHttpie.g:2118:2: ( rule__TimeoutFlag__TimeoutAssignment_2 )
            // InternalCurlBetterThanHttpie.g:2118:3: rule__TimeoutFlag__TimeoutAssignment_2
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


    // $ANTLR start "rule__CommandLineInterface__FlagsAssignment_2_1"
    // InternalCurlBetterThanHttpie.g:2127:1: rule__CommandLineInterface__FlagsAssignment_2_1 : ( ruleFlag ) ;
    public final void rule__CommandLineInterface__FlagsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2131:1: ( ( ruleFlag ) )
            // InternalCurlBetterThanHttpie.g:2132:2: ( ruleFlag )
            {
            // InternalCurlBetterThanHttpie.g:2132:2: ( ruleFlag )
            // InternalCurlBetterThanHttpie.g:2133:3: ruleFlag
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
    // InternalCurlBetterThanHttpie.g:2142:1: rule__CommandLineInterface__MethodAssignment_3_1 : ( ruleMethod ) ;
    public final void rule__CommandLineInterface__MethodAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2146:1: ( ( ruleMethod ) )
            // InternalCurlBetterThanHttpie.g:2147:2: ( ruleMethod )
            {
            // InternalCurlBetterThanHttpie.g:2147:2: ( ruleMethod )
            // InternalCurlBetterThanHttpie.g:2148:3: ruleMethod
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


    // $ANTLR start "rule__ProxyFlag__ProtocolAssignment_2_0"
    // InternalCurlBetterThanHttpie.g:2157:1: rule__ProxyFlag__ProtocolAssignment_2_0 : ( RULE_STRING ) ;
    public final void rule__ProxyFlag__ProtocolAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2161:1: ( ( RULE_STRING ) )
            // InternalCurlBetterThanHttpie.g:2162:2: ( RULE_STRING )
            {
            // InternalCurlBetterThanHttpie.g:2162:2: ( RULE_STRING )
            // InternalCurlBetterThanHttpie.g:2163:3: RULE_STRING
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
    // InternalCurlBetterThanHttpie.g:2172:1: rule__ProxyFlag__ProxyProtocolAssignment_3_0 : ( RULE_STRING ) ;
    public final void rule__ProxyFlag__ProxyProtocolAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2176:1: ( ( RULE_STRING ) )
            // InternalCurlBetterThanHttpie.g:2177:2: ( RULE_STRING )
            {
            // InternalCurlBetterThanHttpie.g:2177:2: ( RULE_STRING )
            // InternalCurlBetterThanHttpie.g:2178:3: RULE_STRING
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
    // InternalCurlBetterThanHttpie.g:2187:1: rule__ProxyFlag__UsernameAssignment_4_0 : ( RULE_STRING ) ;
    public final void rule__ProxyFlag__UsernameAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2191:1: ( ( RULE_STRING ) )
            // InternalCurlBetterThanHttpie.g:2192:2: ( RULE_STRING )
            {
            // InternalCurlBetterThanHttpie.g:2192:2: ( RULE_STRING )
            // InternalCurlBetterThanHttpie.g:2193:3: RULE_STRING
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
    // InternalCurlBetterThanHttpie.g:2202:1: rule__ProxyFlag__PasswordAssignment_4_2 : ( RULE_STRING ) ;
    public final void rule__ProxyFlag__PasswordAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2206:1: ( ( RULE_STRING ) )
            // InternalCurlBetterThanHttpie.g:2207:2: ( RULE_STRING )
            {
            // InternalCurlBetterThanHttpie.g:2207:2: ( RULE_STRING )
            // InternalCurlBetterThanHttpie.g:2208:3: RULE_STRING
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
    // InternalCurlBetterThanHttpie.g:2217:1: rule__ProxyFlag__HostnameAssignment_5 : ( RULE_STRING ) ;
    public final void rule__ProxyFlag__HostnameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2221:1: ( ( RULE_STRING ) )
            // InternalCurlBetterThanHttpie.g:2222:2: ( RULE_STRING )
            {
            // InternalCurlBetterThanHttpie.g:2222:2: ( RULE_STRING )
            // InternalCurlBetterThanHttpie.g:2223:3: RULE_STRING
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
    // InternalCurlBetterThanHttpie.g:2232:1: rule__ProxyFlag__PortAssignment_6_1 : ( RULE_INT ) ;
    public final void rule__ProxyFlag__PortAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2236:1: ( ( RULE_INT ) )
            // InternalCurlBetterThanHttpie.g:2237:2: ( RULE_INT )
            {
            // InternalCurlBetterThanHttpie.g:2237:2: ( RULE_INT )
            // InternalCurlBetterThanHttpie.g:2238:3: RULE_INT
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
    // InternalCurlBetterThanHttpie.g:2247:1: rule__AuthFlag__UsernameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__AuthFlag__UsernameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2251:1: ( ( RULE_STRING ) )
            // InternalCurlBetterThanHttpie.g:2252:2: ( RULE_STRING )
            {
            // InternalCurlBetterThanHttpie.g:2252:2: ( RULE_STRING )
            // InternalCurlBetterThanHttpie.g:2253:3: RULE_STRING
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
    // InternalCurlBetterThanHttpie.g:2262:1: rule__AuthFlag__PasswordAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__AuthFlag__PasswordAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2266:1: ( ( RULE_STRING ) )
            // InternalCurlBetterThanHttpie.g:2267:2: ( RULE_STRING )
            {
            // InternalCurlBetterThanHttpie.g:2267:2: ( RULE_STRING )
            // InternalCurlBetterThanHttpie.g:2268:3: RULE_STRING
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
    // InternalCurlBetterThanHttpie.g:2277:1: rule__AuthFlag__HostnameAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__AuthFlag__HostnameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2281:1: ( ( RULE_STRING ) )
            // InternalCurlBetterThanHttpie.g:2282:2: ( RULE_STRING )
            {
            // InternalCurlBetterThanHttpie.g:2282:2: ( RULE_STRING )
            // InternalCurlBetterThanHttpie.g:2283:3: RULE_STRING
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
    // InternalCurlBetterThanHttpie.g:2292:1: rule__TimeoutFlag__TimeoutAssignment_2 : ( RULE_FLOAT ) ;
    public final void rule__TimeoutFlag__TimeoutAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:2296:1: ( ( RULE_FLOAT ) )
            // InternalCurlBetterThanHttpie.g:2297:2: ( RULE_FLOAT )
            {
            // InternalCurlBetterThanHttpie.g:2297:2: ( RULE_FLOAT )
            // InternalCurlBetterThanHttpie.g:2298:3: RULE_FLOAT
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000006107FFF800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000078000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000001200000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000100L});

}