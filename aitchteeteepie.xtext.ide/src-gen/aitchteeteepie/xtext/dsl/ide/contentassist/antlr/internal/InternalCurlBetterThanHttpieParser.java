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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WS", "RULE_BASIC_STRING", "RULE_STRING_UP", "RULE_DIGIT", "RULE_LETTER", "RULE_SPECIAL_UP", "RULE_INT", "RULE_FLOAT", "'--timeout'", "'--header'", "'-t'", "'--body'", "'-b'", "'--json'", "'-j'", "'--form'", "'-f'", "'='", "'--auth'", "'-a'", "'--download'", "'-d'", "'--help'", "'-h'", "'--verbose'", "'-v'", "'http'", "'--proxy'", "':'", "'://'", "'--version'"
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
    // InternalCurlBetterThanHttpie.g:237:1: ruleAuthFlag : ( ( rule__AuthFlag__Alternatives ) ) ;
    public final void ruleAuthFlag() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:241:2: ( ( ( rule__AuthFlag__Alternatives ) ) )
            // InternalCurlBetterThanHttpie.g:242:2: ( ( rule__AuthFlag__Alternatives ) )
            {
            // InternalCurlBetterThanHttpie.g:242:2: ( ( rule__AuthFlag__Alternatives ) )
            // InternalCurlBetterThanHttpie.g:243:3: ( rule__AuthFlag__Alternatives )
            {
             before(grammarAccess.getAuthFlagAccess().getAlternatives()); 
            // InternalCurlBetterThanHttpie.g:244:3: ( rule__AuthFlag__Alternatives )
            // InternalCurlBetterThanHttpie.g:244:4: rule__AuthFlag__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AuthFlag__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAuthFlagAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalCurlBetterThanHttpie.g:362:1: ruleTimeoutFlag : ( '--timeout' ) ;
    public final void ruleTimeoutFlag() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:366:2: ( ( '--timeout' ) )
            // InternalCurlBetterThanHttpie.g:367:2: ( '--timeout' )
            {
            // InternalCurlBetterThanHttpie.g:367:2: ( '--timeout' )
            // InternalCurlBetterThanHttpie.g:368:3: '--timeout'
            {
             before(grammarAccess.getTimeoutFlagAccess().getTimeoutKeyword()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTimeoutFlagAccess().getTimeoutKeyword()); 

            }


            }

        }
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


    // $ANTLR start "rule__Flag__Alternatives"
    // InternalCurlBetterThanHttpie.g:377:1: rule__Flag__Alternatives : ( ( ruleProxyFlag ) | ( ruleFormFlag ) | ( ruleAuthFlag ) | ( ruleDownloadFlag ) | ( ruleBodyFlag ) | ( ruleVersionFlag ) | ( ruleJsonFlag ) | ( ruleHelpFlag ) | ( ruleHeadersFlag ) | ( ruleVerboseFlag ) | ( ruleTimeoutFlag ) );
    public final void rule__Flag__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:381:1: ( ( ruleProxyFlag ) | ( ruleFormFlag ) | ( ruleAuthFlag ) | ( ruleDownloadFlag ) | ( ruleBodyFlag ) | ( ruleVersionFlag ) | ( ruleJsonFlag ) | ( ruleHelpFlag ) | ( ruleHeadersFlag ) | ( ruleVerboseFlag ) | ( ruleTimeoutFlag ) )
            int alt1=11;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt1=1;
                }
                break;
            case 19:
            case 20:
                {
                alt1=2;
                }
                break;
            case 22:
            case 23:
                {
                alt1=3;
                }
                break;
            case 24:
            case 25:
                {
                alt1=4;
                }
                break;
            case 15:
            case 16:
                {
                alt1=5;
                }
                break;
            case 34:
                {
                alt1=6;
                }
                break;
            case 17:
            case 18:
                {
                alt1=7;
                }
                break;
            case 26:
            case 27:
                {
                alt1=8;
                }
                break;
            case 13:
            case 14:
                {
                alt1=9;
                }
                break;
            case 28:
            case 29:
                {
                alt1=10;
                }
                break;
            case 12:
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
                    // InternalCurlBetterThanHttpie.g:382:2: ( ruleProxyFlag )
                    {
                    // InternalCurlBetterThanHttpie.g:382:2: ( ruleProxyFlag )
                    // InternalCurlBetterThanHttpie.g:383:3: ruleProxyFlag
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
                    // InternalCurlBetterThanHttpie.g:388:2: ( ruleFormFlag )
                    {
                    // InternalCurlBetterThanHttpie.g:388:2: ( ruleFormFlag )
                    // InternalCurlBetterThanHttpie.g:389:3: ruleFormFlag
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
                    // InternalCurlBetterThanHttpie.g:394:2: ( ruleAuthFlag )
                    {
                    // InternalCurlBetterThanHttpie.g:394:2: ( ruleAuthFlag )
                    // InternalCurlBetterThanHttpie.g:395:3: ruleAuthFlag
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
                    // InternalCurlBetterThanHttpie.g:400:2: ( ruleDownloadFlag )
                    {
                    // InternalCurlBetterThanHttpie.g:400:2: ( ruleDownloadFlag )
                    // InternalCurlBetterThanHttpie.g:401:3: ruleDownloadFlag
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
                    // InternalCurlBetterThanHttpie.g:406:2: ( ruleBodyFlag )
                    {
                    // InternalCurlBetterThanHttpie.g:406:2: ( ruleBodyFlag )
                    // InternalCurlBetterThanHttpie.g:407:3: ruleBodyFlag
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
                    // InternalCurlBetterThanHttpie.g:412:2: ( ruleVersionFlag )
                    {
                    // InternalCurlBetterThanHttpie.g:412:2: ( ruleVersionFlag )
                    // InternalCurlBetterThanHttpie.g:413:3: ruleVersionFlag
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
                    // InternalCurlBetterThanHttpie.g:418:2: ( ruleJsonFlag )
                    {
                    // InternalCurlBetterThanHttpie.g:418:2: ( ruleJsonFlag )
                    // InternalCurlBetterThanHttpie.g:419:3: ruleJsonFlag
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
                    // InternalCurlBetterThanHttpie.g:424:2: ( ruleHelpFlag )
                    {
                    // InternalCurlBetterThanHttpie.g:424:2: ( ruleHelpFlag )
                    // InternalCurlBetterThanHttpie.g:425:3: ruleHelpFlag
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
                    // InternalCurlBetterThanHttpie.g:430:2: ( ruleHeadersFlag )
                    {
                    // InternalCurlBetterThanHttpie.g:430:2: ( ruleHeadersFlag )
                    // InternalCurlBetterThanHttpie.g:431:3: ruleHeadersFlag
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
                    // InternalCurlBetterThanHttpie.g:436:2: ( ruleVerboseFlag )
                    {
                    // InternalCurlBetterThanHttpie.g:436:2: ( ruleVerboseFlag )
                    // InternalCurlBetterThanHttpie.g:437:3: ruleVerboseFlag
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
                    // InternalCurlBetterThanHttpie.g:442:2: ( ruleTimeoutFlag )
                    {
                    // InternalCurlBetterThanHttpie.g:442:2: ( ruleTimeoutFlag )
                    // InternalCurlBetterThanHttpie.g:443:3: ruleTimeoutFlag
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
    // InternalCurlBetterThanHttpie.g:452:1: rule__HeadersFlag__Alternatives_1 : ( ( '--header' ) | ( '-t' ) );
    public final void rule__HeadersFlag__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:456:1: ( ( '--header' ) | ( '-t' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            else if ( (LA2_0==14) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:457:2: ( '--header' )
                    {
                    // InternalCurlBetterThanHttpie.g:457:2: ( '--header' )
                    // InternalCurlBetterThanHttpie.g:458:3: '--header'
                    {
                     before(grammarAccess.getHeadersFlagAccess().getHeaderKeyword_1_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getHeadersFlagAccess().getHeaderKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:463:2: ( '-t' )
                    {
                    // InternalCurlBetterThanHttpie.g:463:2: ( '-t' )
                    // InternalCurlBetterThanHttpie.g:464:3: '-t'
                    {
                     before(grammarAccess.getHeadersFlagAccess().getTKeyword_1_1()); 
                    match(input,14,FOLLOW_2); 
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
    // InternalCurlBetterThanHttpie.g:473:1: rule__BodyFlag__Alternatives_1 : ( ( '--body' ) | ( '-b' ) );
    public final void rule__BodyFlag__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:477:1: ( ( '--body' ) | ( '-b' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            else if ( (LA3_0==16) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:478:2: ( '--body' )
                    {
                    // InternalCurlBetterThanHttpie.g:478:2: ( '--body' )
                    // InternalCurlBetterThanHttpie.g:479:3: '--body'
                    {
                     before(grammarAccess.getBodyFlagAccess().getBodyKeyword_1_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getBodyFlagAccess().getBodyKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:484:2: ( '-b' )
                    {
                    // InternalCurlBetterThanHttpie.g:484:2: ( '-b' )
                    // InternalCurlBetterThanHttpie.g:485:3: '-b'
                    {
                     before(grammarAccess.getBodyFlagAccess().getBKeyword_1_1()); 
                    match(input,16,FOLLOW_2); 
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
    // InternalCurlBetterThanHttpie.g:494:1: rule__JsonFlag__Alternatives_1 : ( ( '--json' ) | ( '-j' ) );
    public final void rule__JsonFlag__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:498:1: ( ( '--json' ) | ( '-j' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            else if ( (LA4_0==18) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:499:2: ( '--json' )
                    {
                    // InternalCurlBetterThanHttpie.g:499:2: ( '--json' )
                    // InternalCurlBetterThanHttpie.g:500:3: '--json'
                    {
                     before(grammarAccess.getJsonFlagAccess().getJsonKeyword_1_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getJsonFlagAccess().getJsonKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:505:2: ( '-j' )
                    {
                    // InternalCurlBetterThanHttpie.g:505:2: ( '-j' )
                    // InternalCurlBetterThanHttpie.g:506:3: '-j'
                    {
                     before(grammarAccess.getJsonFlagAccess().getJKeyword_1_1()); 
                    match(input,18,FOLLOW_2); 
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
    // InternalCurlBetterThanHttpie.g:515:1: rule__FormFlag__Alternatives_1 : ( ( '--form' ) | ( '-f' ) );
    public final void rule__FormFlag__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:519:1: ( ( '--form' ) | ( '-f' ) )
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
                    // InternalCurlBetterThanHttpie.g:520:2: ( '--form' )
                    {
                    // InternalCurlBetterThanHttpie.g:520:2: ( '--form' )
                    // InternalCurlBetterThanHttpie.g:521:3: '--form'
                    {
                     before(grammarAccess.getFormFlagAccess().getFormKeyword_1_0()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getFormFlagAccess().getFormKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:526:2: ( '-f' )
                    {
                    // InternalCurlBetterThanHttpie.g:526:2: ( '-f' )
                    // InternalCurlBetterThanHttpie.g:527:3: '-f'
                    {
                     before(grammarAccess.getFormFlagAccess().getFKeyword_1_1()); 
                    match(input,20,FOLLOW_2); 
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
    // InternalCurlBetterThanHttpie.g:536:1: rule__ProxyFlag__Alternatives_1 : ( ( '=' ) | ( RULE_WS ) );
    public final void rule__ProxyFlag__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:540:1: ( ( '=' ) | ( RULE_WS ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_WS) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:541:2: ( '=' )
                    {
                    // InternalCurlBetterThanHttpie.g:541:2: ( '=' )
                    // InternalCurlBetterThanHttpie.g:542:3: '='
                    {
                     before(grammarAccess.getProxyFlagAccess().getEqualsSignKeyword_1_0()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getProxyFlagAccess().getEqualsSignKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:547:2: ( RULE_WS )
                    {
                    // InternalCurlBetterThanHttpie.g:547:2: ( RULE_WS )
                    // InternalCurlBetterThanHttpie.g:548:3: RULE_WS
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
    // InternalCurlBetterThanHttpie.g:557:1: rule__ProxyFlag__Alternatives_2 : ( ( ( rule__ProxyFlag__Group_2_0__0 ) ) | ( ( rule__ProxyFlag__Group_2_1__0 ) ) );
    public final void rule__ProxyFlag__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:561:1: ( ( ( rule__ProxyFlag__Group_2_0__0 ) ) | ( ( rule__ProxyFlag__Group_2_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_BASIC_STRING) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==33) ) {
                    alt7=2;
                }
                else if ( (LA7_1==32) ) {
                    alt7=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:562:2: ( ( rule__ProxyFlag__Group_2_0__0 ) )
                    {
                    // InternalCurlBetterThanHttpie.g:562:2: ( ( rule__ProxyFlag__Group_2_0__0 ) )
                    // InternalCurlBetterThanHttpie.g:563:3: ( rule__ProxyFlag__Group_2_0__0 )
                    {
                     before(grammarAccess.getProxyFlagAccess().getGroup_2_0()); 
                    // InternalCurlBetterThanHttpie.g:564:3: ( rule__ProxyFlag__Group_2_0__0 )
                    // InternalCurlBetterThanHttpie.g:564:4: rule__ProxyFlag__Group_2_0__0
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
                    // InternalCurlBetterThanHttpie.g:568:2: ( ( rule__ProxyFlag__Group_2_1__0 ) )
                    {
                    // InternalCurlBetterThanHttpie.g:568:2: ( ( rule__ProxyFlag__Group_2_1__0 ) )
                    // InternalCurlBetterThanHttpie.g:569:3: ( rule__ProxyFlag__Group_2_1__0 )
                    {
                     before(grammarAccess.getProxyFlagAccess().getGroup_2_1()); 
                    // InternalCurlBetterThanHttpie.g:570:3: ( rule__ProxyFlag__Group_2_1__0 )
                    // InternalCurlBetterThanHttpie.g:570:4: rule__ProxyFlag__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProxyFlag__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getProxyFlagAccess().getGroup_2_1()); 

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


    // $ANTLR start "rule__AuthFlag__Alternatives"
    // InternalCurlBetterThanHttpie.g:578:1: rule__AuthFlag__Alternatives : ( ( '--auth' ) | ( '-a' ) );
    public final void rule__AuthFlag__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:582:1: ( ( '--auth' ) | ( '-a' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            else if ( (LA8_0==23) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:583:2: ( '--auth' )
                    {
                    // InternalCurlBetterThanHttpie.g:583:2: ( '--auth' )
                    // InternalCurlBetterThanHttpie.g:584:3: '--auth'
                    {
                     before(grammarAccess.getAuthFlagAccess().getAuthKeyword_0()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getAuthFlagAccess().getAuthKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:589:2: ( '-a' )
                    {
                    // InternalCurlBetterThanHttpie.g:589:2: ( '-a' )
                    // InternalCurlBetterThanHttpie.g:590:3: '-a'
                    {
                     before(grammarAccess.getAuthFlagAccess().getAKeyword_1()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getAuthFlagAccess().getAKeyword_1()); 

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
    // $ANTLR end "rule__AuthFlag__Alternatives"


    // $ANTLR start "rule__DownloadFlag__Alternatives_1"
    // InternalCurlBetterThanHttpie.g:599:1: rule__DownloadFlag__Alternatives_1 : ( ( '--download' ) | ( '-d' ) );
    public final void rule__DownloadFlag__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:603:1: ( ( '--download' ) | ( '-d' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            else if ( (LA9_0==25) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:604:2: ( '--download' )
                    {
                    // InternalCurlBetterThanHttpie.g:604:2: ( '--download' )
                    // InternalCurlBetterThanHttpie.g:605:3: '--download'
                    {
                     before(grammarAccess.getDownloadFlagAccess().getDownloadKeyword_1_0()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getDownloadFlagAccess().getDownloadKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:610:2: ( '-d' )
                    {
                    // InternalCurlBetterThanHttpie.g:610:2: ( '-d' )
                    // InternalCurlBetterThanHttpie.g:611:3: '-d'
                    {
                     before(grammarAccess.getDownloadFlagAccess().getDKeyword_1_1()); 
                    match(input,25,FOLLOW_2); 
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
    // InternalCurlBetterThanHttpie.g:620:1: rule__HelpFlag__Alternatives_1 : ( ( '--help' ) | ( '-h' ) );
    public final void rule__HelpFlag__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:624:1: ( ( '--help' ) | ( '-h' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            else if ( (LA10_0==27) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:625:2: ( '--help' )
                    {
                    // InternalCurlBetterThanHttpie.g:625:2: ( '--help' )
                    // InternalCurlBetterThanHttpie.g:626:3: '--help'
                    {
                     before(grammarAccess.getHelpFlagAccess().getHelpKeyword_1_0()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getHelpFlagAccess().getHelpKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:631:2: ( '-h' )
                    {
                    // InternalCurlBetterThanHttpie.g:631:2: ( '-h' )
                    // InternalCurlBetterThanHttpie.g:632:3: '-h'
                    {
                     before(grammarAccess.getHelpFlagAccess().getHKeyword_1_1()); 
                    match(input,27,FOLLOW_2); 
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
    // InternalCurlBetterThanHttpie.g:641:1: rule__VerboseFlag__Alternatives_1 : ( ( '--verbose' ) | ( '-v' ) );
    public final void rule__VerboseFlag__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:645:1: ( ( '--verbose' ) | ( '-v' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==28) ) {
                alt11=1;
            }
            else if ( (LA11_0==29) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:646:2: ( '--verbose' )
                    {
                    // InternalCurlBetterThanHttpie.g:646:2: ( '--verbose' )
                    // InternalCurlBetterThanHttpie.g:647:3: '--verbose'
                    {
                     before(grammarAccess.getVerboseFlagAccess().getVerboseKeyword_1_0()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getVerboseFlagAccess().getVerboseKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:652:2: ( '-v' )
                    {
                    // InternalCurlBetterThanHttpie.g:652:2: ( '-v' )
                    // InternalCurlBetterThanHttpie.g:653:3: '-v'
                    {
                     before(grammarAccess.getVerboseFlagAccess().getVKeyword_1_1()); 
                    match(input,29,FOLLOW_2); 
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


    // $ANTLR start "rule__CommandLineInterface__Group__0"
    // InternalCurlBetterThanHttpie.g:662:1: rule__CommandLineInterface__Group__0 : rule__CommandLineInterface__Group__0__Impl rule__CommandLineInterface__Group__1 ;
    public final void rule__CommandLineInterface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:666:1: ( rule__CommandLineInterface__Group__0__Impl rule__CommandLineInterface__Group__1 )
            // InternalCurlBetterThanHttpie.g:667:2: rule__CommandLineInterface__Group__0__Impl rule__CommandLineInterface__Group__1
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
    // InternalCurlBetterThanHttpie.g:674:1: rule__CommandLineInterface__Group__0__Impl : ( () ) ;
    public final void rule__CommandLineInterface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:678:1: ( ( () ) )
            // InternalCurlBetterThanHttpie.g:679:1: ( () )
            {
            // InternalCurlBetterThanHttpie.g:679:1: ( () )
            // InternalCurlBetterThanHttpie.g:680:2: ()
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getCommandLineInterfaceAction_0()); 
            // InternalCurlBetterThanHttpie.g:681:2: ()
            // InternalCurlBetterThanHttpie.g:681:3: 
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
    // InternalCurlBetterThanHttpie.g:689:1: rule__CommandLineInterface__Group__1 : rule__CommandLineInterface__Group__1__Impl rule__CommandLineInterface__Group__2 ;
    public final void rule__CommandLineInterface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:693:1: ( rule__CommandLineInterface__Group__1__Impl rule__CommandLineInterface__Group__2 )
            // InternalCurlBetterThanHttpie.g:694:2: rule__CommandLineInterface__Group__1__Impl rule__CommandLineInterface__Group__2
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
    // InternalCurlBetterThanHttpie.g:701:1: rule__CommandLineInterface__Group__1__Impl : ( 'http' ) ;
    public final void rule__CommandLineInterface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:705:1: ( ( 'http' ) )
            // InternalCurlBetterThanHttpie.g:706:1: ( 'http' )
            {
            // InternalCurlBetterThanHttpie.g:706:1: ( 'http' )
            // InternalCurlBetterThanHttpie.g:707:2: 'http'
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getHttpKeyword_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalCurlBetterThanHttpie.g:716:1: rule__CommandLineInterface__Group__2 : rule__CommandLineInterface__Group__2__Impl rule__CommandLineInterface__Group__3 ;
    public final void rule__CommandLineInterface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:720:1: ( rule__CommandLineInterface__Group__2__Impl rule__CommandLineInterface__Group__3 )
            // InternalCurlBetterThanHttpie.g:721:2: rule__CommandLineInterface__Group__2__Impl rule__CommandLineInterface__Group__3
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
    // InternalCurlBetterThanHttpie.g:728:1: rule__CommandLineInterface__Group__2__Impl : ( ( rule__CommandLineInterface__Group_2__0 )* ) ;
    public final void rule__CommandLineInterface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:732:1: ( ( ( rule__CommandLineInterface__Group_2__0 )* ) )
            // InternalCurlBetterThanHttpie.g:733:1: ( ( rule__CommandLineInterface__Group_2__0 )* )
            {
            // InternalCurlBetterThanHttpie.g:733:1: ( ( rule__CommandLineInterface__Group_2__0 )* )
            // InternalCurlBetterThanHttpie.g:734:2: ( rule__CommandLineInterface__Group_2__0 )*
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getGroup_2()); 
            // InternalCurlBetterThanHttpie.g:735:2: ( rule__CommandLineInterface__Group_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_WS) ) {
                    int LA12_1 = input.LA(2);

                    if ( ((LA12_1>=12 && LA12_1<=20)||(LA12_1>=22 && LA12_1<=29)||LA12_1==31||LA12_1==34) ) {
                        alt12=1;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // InternalCurlBetterThanHttpie.g:735:3: rule__CommandLineInterface__Group_2__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__CommandLineInterface__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalCurlBetterThanHttpie.g:743:1: rule__CommandLineInterface__Group__3 : rule__CommandLineInterface__Group__3__Impl ;
    public final void rule__CommandLineInterface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:747:1: ( rule__CommandLineInterface__Group__3__Impl )
            // InternalCurlBetterThanHttpie.g:748:2: rule__CommandLineInterface__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CommandLineInterface__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalCurlBetterThanHttpie.g:754:1: rule__CommandLineInterface__Group__3__Impl : ( ( RULE_WS )? ) ;
    public final void rule__CommandLineInterface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:758:1: ( ( ( RULE_WS )? ) )
            // InternalCurlBetterThanHttpie.g:759:1: ( ( RULE_WS )? )
            {
            // InternalCurlBetterThanHttpie.g:759:1: ( ( RULE_WS )? )
            // InternalCurlBetterThanHttpie.g:760:2: ( RULE_WS )?
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getWSTerminalRuleCall_3()); 
            // InternalCurlBetterThanHttpie.g:761:2: ( RULE_WS )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_WS) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:761:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getCommandLineInterfaceAccess().getWSTerminalRuleCall_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__CommandLineInterface__Group_2__0"
    // InternalCurlBetterThanHttpie.g:770:1: rule__CommandLineInterface__Group_2__0 : rule__CommandLineInterface__Group_2__0__Impl rule__CommandLineInterface__Group_2__1 ;
    public final void rule__CommandLineInterface__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:774:1: ( rule__CommandLineInterface__Group_2__0__Impl rule__CommandLineInterface__Group_2__1 )
            // InternalCurlBetterThanHttpie.g:775:2: rule__CommandLineInterface__Group_2__0__Impl rule__CommandLineInterface__Group_2__1
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
    // InternalCurlBetterThanHttpie.g:782:1: rule__CommandLineInterface__Group_2__0__Impl : ( RULE_WS ) ;
    public final void rule__CommandLineInterface__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:786:1: ( ( RULE_WS ) )
            // InternalCurlBetterThanHttpie.g:787:1: ( RULE_WS )
            {
            // InternalCurlBetterThanHttpie.g:787:1: ( RULE_WS )
            // InternalCurlBetterThanHttpie.g:788:2: RULE_WS
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
    // InternalCurlBetterThanHttpie.g:797:1: rule__CommandLineInterface__Group_2__1 : rule__CommandLineInterface__Group_2__1__Impl ;
    public final void rule__CommandLineInterface__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:801:1: ( rule__CommandLineInterface__Group_2__1__Impl )
            // InternalCurlBetterThanHttpie.g:802:2: rule__CommandLineInterface__Group_2__1__Impl
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
    // InternalCurlBetterThanHttpie.g:808:1: rule__CommandLineInterface__Group_2__1__Impl : ( ( rule__CommandLineInterface__FlagsAssignment_2_1 ) ) ;
    public final void rule__CommandLineInterface__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:812:1: ( ( ( rule__CommandLineInterface__FlagsAssignment_2_1 ) ) )
            // InternalCurlBetterThanHttpie.g:813:1: ( ( rule__CommandLineInterface__FlagsAssignment_2_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:813:1: ( ( rule__CommandLineInterface__FlagsAssignment_2_1 ) )
            // InternalCurlBetterThanHttpie.g:814:2: ( rule__CommandLineInterface__FlagsAssignment_2_1 )
            {
             before(grammarAccess.getCommandLineInterfaceAccess().getFlagsAssignment_2_1()); 
            // InternalCurlBetterThanHttpie.g:815:2: ( rule__CommandLineInterface__FlagsAssignment_2_1 )
            // InternalCurlBetterThanHttpie.g:815:3: rule__CommandLineInterface__FlagsAssignment_2_1
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


    // $ANTLR start "rule__HeadersFlag__Group__0"
    // InternalCurlBetterThanHttpie.g:824:1: rule__HeadersFlag__Group__0 : rule__HeadersFlag__Group__0__Impl rule__HeadersFlag__Group__1 ;
    public final void rule__HeadersFlag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:828:1: ( rule__HeadersFlag__Group__0__Impl rule__HeadersFlag__Group__1 )
            // InternalCurlBetterThanHttpie.g:829:2: rule__HeadersFlag__Group__0__Impl rule__HeadersFlag__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalCurlBetterThanHttpie.g:836:1: rule__HeadersFlag__Group__0__Impl : ( () ) ;
    public final void rule__HeadersFlag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:840:1: ( ( () ) )
            // InternalCurlBetterThanHttpie.g:841:1: ( () )
            {
            // InternalCurlBetterThanHttpie.g:841:1: ( () )
            // InternalCurlBetterThanHttpie.g:842:2: ()
            {
             before(grammarAccess.getHeadersFlagAccess().getHeadersFlagAction_0()); 
            // InternalCurlBetterThanHttpie.g:843:2: ()
            // InternalCurlBetterThanHttpie.g:843:3: 
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
    // InternalCurlBetterThanHttpie.g:851:1: rule__HeadersFlag__Group__1 : rule__HeadersFlag__Group__1__Impl ;
    public final void rule__HeadersFlag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:855:1: ( rule__HeadersFlag__Group__1__Impl )
            // InternalCurlBetterThanHttpie.g:856:2: rule__HeadersFlag__Group__1__Impl
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
    // InternalCurlBetterThanHttpie.g:862:1: rule__HeadersFlag__Group__1__Impl : ( ( rule__HeadersFlag__Alternatives_1 ) ) ;
    public final void rule__HeadersFlag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:866:1: ( ( ( rule__HeadersFlag__Alternatives_1 ) ) )
            // InternalCurlBetterThanHttpie.g:867:1: ( ( rule__HeadersFlag__Alternatives_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:867:1: ( ( rule__HeadersFlag__Alternatives_1 ) )
            // InternalCurlBetterThanHttpie.g:868:2: ( rule__HeadersFlag__Alternatives_1 )
            {
             before(grammarAccess.getHeadersFlagAccess().getAlternatives_1()); 
            // InternalCurlBetterThanHttpie.g:869:2: ( rule__HeadersFlag__Alternatives_1 )
            // InternalCurlBetterThanHttpie.g:869:3: rule__HeadersFlag__Alternatives_1
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
    // InternalCurlBetterThanHttpie.g:878:1: rule__BodyFlag__Group__0 : rule__BodyFlag__Group__0__Impl rule__BodyFlag__Group__1 ;
    public final void rule__BodyFlag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:882:1: ( rule__BodyFlag__Group__0__Impl rule__BodyFlag__Group__1 )
            // InternalCurlBetterThanHttpie.g:883:2: rule__BodyFlag__Group__0__Impl rule__BodyFlag__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalCurlBetterThanHttpie.g:890:1: rule__BodyFlag__Group__0__Impl : ( () ) ;
    public final void rule__BodyFlag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:894:1: ( ( () ) )
            // InternalCurlBetterThanHttpie.g:895:1: ( () )
            {
            // InternalCurlBetterThanHttpie.g:895:1: ( () )
            // InternalCurlBetterThanHttpie.g:896:2: ()
            {
             before(grammarAccess.getBodyFlagAccess().getBodyFlagAction_0()); 
            // InternalCurlBetterThanHttpie.g:897:2: ()
            // InternalCurlBetterThanHttpie.g:897:3: 
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
    // InternalCurlBetterThanHttpie.g:905:1: rule__BodyFlag__Group__1 : rule__BodyFlag__Group__1__Impl ;
    public final void rule__BodyFlag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:909:1: ( rule__BodyFlag__Group__1__Impl )
            // InternalCurlBetterThanHttpie.g:910:2: rule__BodyFlag__Group__1__Impl
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
    // InternalCurlBetterThanHttpie.g:916:1: rule__BodyFlag__Group__1__Impl : ( ( rule__BodyFlag__Alternatives_1 ) ) ;
    public final void rule__BodyFlag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:920:1: ( ( ( rule__BodyFlag__Alternatives_1 ) ) )
            // InternalCurlBetterThanHttpie.g:921:1: ( ( rule__BodyFlag__Alternatives_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:921:1: ( ( rule__BodyFlag__Alternatives_1 ) )
            // InternalCurlBetterThanHttpie.g:922:2: ( rule__BodyFlag__Alternatives_1 )
            {
             before(grammarAccess.getBodyFlagAccess().getAlternatives_1()); 
            // InternalCurlBetterThanHttpie.g:923:2: ( rule__BodyFlag__Alternatives_1 )
            // InternalCurlBetterThanHttpie.g:923:3: rule__BodyFlag__Alternatives_1
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
    // InternalCurlBetterThanHttpie.g:932:1: rule__JsonFlag__Group__0 : rule__JsonFlag__Group__0__Impl rule__JsonFlag__Group__1 ;
    public final void rule__JsonFlag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:936:1: ( rule__JsonFlag__Group__0__Impl rule__JsonFlag__Group__1 )
            // InternalCurlBetterThanHttpie.g:937:2: rule__JsonFlag__Group__0__Impl rule__JsonFlag__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalCurlBetterThanHttpie.g:944:1: rule__JsonFlag__Group__0__Impl : ( () ) ;
    public final void rule__JsonFlag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:948:1: ( ( () ) )
            // InternalCurlBetterThanHttpie.g:949:1: ( () )
            {
            // InternalCurlBetterThanHttpie.g:949:1: ( () )
            // InternalCurlBetterThanHttpie.g:950:2: ()
            {
             before(grammarAccess.getJsonFlagAccess().getJsonFlagAction_0()); 
            // InternalCurlBetterThanHttpie.g:951:2: ()
            // InternalCurlBetterThanHttpie.g:951:3: 
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
    // InternalCurlBetterThanHttpie.g:959:1: rule__JsonFlag__Group__1 : rule__JsonFlag__Group__1__Impl ;
    public final void rule__JsonFlag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:963:1: ( rule__JsonFlag__Group__1__Impl )
            // InternalCurlBetterThanHttpie.g:964:2: rule__JsonFlag__Group__1__Impl
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
    // InternalCurlBetterThanHttpie.g:970:1: rule__JsonFlag__Group__1__Impl : ( ( rule__JsonFlag__Alternatives_1 ) ) ;
    public final void rule__JsonFlag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:974:1: ( ( ( rule__JsonFlag__Alternatives_1 ) ) )
            // InternalCurlBetterThanHttpie.g:975:1: ( ( rule__JsonFlag__Alternatives_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:975:1: ( ( rule__JsonFlag__Alternatives_1 ) )
            // InternalCurlBetterThanHttpie.g:976:2: ( rule__JsonFlag__Alternatives_1 )
            {
             before(grammarAccess.getJsonFlagAccess().getAlternatives_1()); 
            // InternalCurlBetterThanHttpie.g:977:2: ( rule__JsonFlag__Alternatives_1 )
            // InternalCurlBetterThanHttpie.g:977:3: rule__JsonFlag__Alternatives_1
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
    // InternalCurlBetterThanHttpie.g:986:1: rule__FormFlag__Group__0 : rule__FormFlag__Group__0__Impl rule__FormFlag__Group__1 ;
    public final void rule__FormFlag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:990:1: ( rule__FormFlag__Group__0__Impl rule__FormFlag__Group__1 )
            // InternalCurlBetterThanHttpie.g:991:2: rule__FormFlag__Group__0__Impl rule__FormFlag__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalCurlBetterThanHttpie.g:998:1: rule__FormFlag__Group__0__Impl : ( () ) ;
    public final void rule__FormFlag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1002:1: ( ( () ) )
            // InternalCurlBetterThanHttpie.g:1003:1: ( () )
            {
            // InternalCurlBetterThanHttpie.g:1003:1: ( () )
            // InternalCurlBetterThanHttpie.g:1004:2: ()
            {
             before(grammarAccess.getFormFlagAccess().getFormFlagAction_0()); 
            // InternalCurlBetterThanHttpie.g:1005:2: ()
            // InternalCurlBetterThanHttpie.g:1005:3: 
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
    // InternalCurlBetterThanHttpie.g:1013:1: rule__FormFlag__Group__1 : rule__FormFlag__Group__1__Impl ;
    public final void rule__FormFlag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1017:1: ( rule__FormFlag__Group__1__Impl )
            // InternalCurlBetterThanHttpie.g:1018:2: rule__FormFlag__Group__1__Impl
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
    // InternalCurlBetterThanHttpie.g:1024:1: rule__FormFlag__Group__1__Impl : ( ( rule__FormFlag__Alternatives_1 ) ) ;
    public final void rule__FormFlag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1028:1: ( ( ( rule__FormFlag__Alternatives_1 ) ) )
            // InternalCurlBetterThanHttpie.g:1029:1: ( ( rule__FormFlag__Alternatives_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:1029:1: ( ( rule__FormFlag__Alternatives_1 ) )
            // InternalCurlBetterThanHttpie.g:1030:2: ( rule__FormFlag__Alternatives_1 )
            {
             before(grammarAccess.getFormFlagAccess().getAlternatives_1()); 
            // InternalCurlBetterThanHttpie.g:1031:2: ( rule__FormFlag__Alternatives_1 )
            // InternalCurlBetterThanHttpie.g:1031:3: rule__FormFlag__Alternatives_1
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
    // InternalCurlBetterThanHttpie.g:1040:1: rule__ProxyFlag__Group__0 : rule__ProxyFlag__Group__0__Impl rule__ProxyFlag__Group__1 ;
    public final void rule__ProxyFlag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1044:1: ( rule__ProxyFlag__Group__0__Impl rule__ProxyFlag__Group__1 )
            // InternalCurlBetterThanHttpie.g:1045:2: rule__ProxyFlag__Group__0__Impl rule__ProxyFlag__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalCurlBetterThanHttpie.g:1052:1: rule__ProxyFlag__Group__0__Impl : ( '--proxy' ) ;
    public final void rule__ProxyFlag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1056:1: ( ( '--proxy' ) )
            // InternalCurlBetterThanHttpie.g:1057:1: ( '--proxy' )
            {
            // InternalCurlBetterThanHttpie.g:1057:1: ( '--proxy' )
            // InternalCurlBetterThanHttpie.g:1058:2: '--proxy'
            {
             before(grammarAccess.getProxyFlagAccess().getProxyKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalCurlBetterThanHttpie.g:1067:1: rule__ProxyFlag__Group__1 : rule__ProxyFlag__Group__1__Impl rule__ProxyFlag__Group__2 ;
    public final void rule__ProxyFlag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1071:1: ( rule__ProxyFlag__Group__1__Impl rule__ProxyFlag__Group__2 )
            // InternalCurlBetterThanHttpie.g:1072:2: rule__ProxyFlag__Group__1__Impl rule__ProxyFlag__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalCurlBetterThanHttpie.g:1079:1: rule__ProxyFlag__Group__1__Impl : ( ( rule__ProxyFlag__Alternatives_1 ) ) ;
    public final void rule__ProxyFlag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1083:1: ( ( ( rule__ProxyFlag__Alternatives_1 ) ) )
            // InternalCurlBetterThanHttpie.g:1084:1: ( ( rule__ProxyFlag__Alternatives_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:1084:1: ( ( rule__ProxyFlag__Alternatives_1 ) )
            // InternalCurlBetterThanHttpie.g:1085:2: ( rule__ProxyFlag__Alternatives_1 )
            {
             before(grammarAccess.getProxyFlagAccess().getAlternatives_1()); 
            // InternalCurlBetterThanHttpie.g:1086:2: ( rule__ProxyFlag__Alternatives_1 )
            // InternalCurlBetterThanHttpie.g:1086:3: rule__ProxyFlag__Alternatives_1
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
    // InternalCurlBetterThanHttpie.g:1094:1: rule__ProxyFlag__Group__2 : rule__ProxyFlag__Group__2__Impl rule__ProxyFlag__Group__3 ;
    public final void rule__ProxyFlag__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1098:1: ( rule__ProxyFlag__Group__2__Impl rule__ProxyFlag__Group__3 )
            // InternalCurlBetterThanHttpie.g:1099:2: rule__ProxyFlag__Group__2__Impl rule__ProxyFlag__Group__3
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
    // InternalCurlBetterThanHttpie.g:1106:1: rule__ProxyFlag__Group__2__Impl : ( ( rule__ProxyFlag__Alternatives_2 ) ) ;
    public final void rule__ProxyFlag__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1110:1: ( ( ( rule__ProxyFlag__Alternatives_2 ) ) )
            // InternalCurlBetterThanHttpie.g:1111:1: ( ( rule__ProxyFlag__Alternatives_2 ) )
            {
            // InternalCurlBetterThanHttpie.g:1111:1: ( ( rule__ProxyFlag__Alternatives_2 ) )
            // InternalCurlBetterThanHttpie.g:1112:2: ( rule__ProxyFlag__Alternatives_2 )
            {
             before(grammarAccess.getProxyFlagAccess().getAlternatives_2()); 
            // InternalCurlBetterThanHttpie.g:1113:2: ( rule__ProxyFlag__Alternatives_2 )
            // InternalCurlBetterThanHttpie.g:1113:3: rule__ProxyFlag__Alternatives_2
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
    // InternalCurlBetterThanHttpie.g:1121:1: rule__ProxyFlag__Group__3 : rule__ProxyFlag__Group__3__Impl ;
    public final void rule__ProxyFlag__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1125:1: ( rule__ProxyFlag__Group__3__Impl )
            // InternalCurlBetterThanHttpie.g:1126:2: rule__ProxyFlag__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProxyFlag__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalCurlBetterThanHttpie.g:1132:1: rule__ProxyFlag__Group__3__Impl : ( ( rule__ProxyFlag__Group_3__0 )? ) ;
    public final void rule__ProxyFlag__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1136:1: ( ( ( rule__ProxyFlag__Group_3__0 )? ) )
            // InternalCurlBetterThanHttpie.g:1137:1: ( ( rule__ProxyFlag__Group_3__0 )? )
            {
            // InternalCurlBetterThanHttpie.g:1137:1: ( ( rule__ProxyFlag__Group_3__0 )? )
            // InternalCurlBetterThanHttpie.g:1138:2: ( rule__ProxyFlag__Group_3__0 )?
            {
             before(grammarAccess.getProxyFlagAccess().getGroup_3()); 
            // InternalCurlBetterThanHttpie.g:1139:2: ( rule__ProxyFlag__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING_UP) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1139:3: rule__ProxyFlag__Group_3__0
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


    // $ANTLR start "rule__ProxyFlag__Group_2_0__0"
    // InternalCurlBetterThanHttpie.g:1148:1: rule__ProxyFlag__Group_2_0__0 : rule__ProxyFlag__Group_2_0__0__Impl rule__ProxyFlag__Group_2_0__1 ;
    public final void rule__ProxyFlag__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1152:1: ( rule__ProxyFlag__Group_2_0__0__Impl rule__ProxyFlag__Group_2_0__1 )
            // InternalCurlBetterThanHttpie.g:1153:2: rule__ProxyFlag__Group_2_0__0__Impl rule__ProxyFlag__Group_2_0__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalCurlBetterThanHttpie.g:1160:1: rule__ProxyFlag__Group_2_0__0__Impl : ( ( rule__ProxyFlag__Group_2_0_0__0 ) ) ;
    public final void rule__ProxyFlag__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1164:1: ( ( ( rule__ProxyFlag__Group_2_0_0__0 ) ) )
            // InternalCurlBetterThanHttpie.g:1165:1: ( ( rule__ProxyFlag__Group_2_0_0__0 ) )
            {
            // InternalCurlBetterThanHttpie.g:1165:1: ( ( rule__ProxyFlag__Group_2_0_0__0 ) )
            // InternalCurlBetterThanHttpie.g:1166:2: ( rule__ProxyFlag__Group_2_0_0__0 )
            {
             before(grammarAccess.getProxyFlagAccess().getGroup_2_0_0()); 
            // InternalCurlBetterThanHttpie.g:1167:2: ( rule__ProxyFlag__Group_2_0_0__0 )
            // InternalCurlBetterThanHttpie.g:1167:3: rule__ProxyFlag__Group_2_0_0__0
            {
            pushFollow(FOLLOW_2);
            rule__ProxyFlag__Group_2_0_0__0();

            state._fsp--;


            }

             after(grammarAccess.getProxyFlagAccess().getGroup_2_0_0()); 

            }


            }

        }
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
    // InternalCurlBetterThanHttpie.g:1175:1: rule__ProxyFlag__Group_2_0__1 : rule__ProxyFlag__Group_2_0__1__Impl ;
    public final void rule__ProxyFlag__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1179:1: ( rule__ProxyFlag__Group_2_0__1__Impl )
            // InternalCurlBetterThanHttpie.g:1180:2: rule__ProxyFlag__Group_2_0__1__Impl
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
    // InternalCurlBetterThanHttpie.g:1186:1: rule__ProxyFlag__Group_2_0__1__Impl : ( ( rule__ProxyFlag__Group_2_0_1__0 )? ) ;
    public final void rule__ProxyFlag__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1190:1: ( ( ( rule__ProxyFlag__Group_2_0_1__0 )? ) )
            // InternalCurlBetterThanHttpie.g:1191:1: ( ( rule__ProxyFlag__Group_2_0_1__0 )? )
            {
            // InternalCurlBetterThanHttpie.g:1191:1: ( ( rule__ProxyFlag__Group_2_0_1__0 )? )
            // InternalCurlBetterThanHttpie.g:1192:2: ( rule__ProxyFlag__Group_2_0_1__0 )?
            {
             before(grammarAccess.getProxyFlagAccess().getGroup_2_0_1()); 
            // InternalCurlBetterThanHttpie.g:1193:2: ( rule__ProxyFlag__Group_2_0_1__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_BASIC_STRING) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1193:3: rule__ProxyFlag__Group_2_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProxyFlag__Group_2_0_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProxyFlagAccess().getGroup_2_0_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__ProxyFlag__Group_2_0_0__0"
    // InternalCurlBetterThanHttpie.g:1202:1: rule__ProxyFlag__Group_2_0_0__0 : rule__ProxyFlag__Group_2_0_0__0__Impl rule__ProxyFlag__Group_2_0_0__1 ;
    public final void rule__ProxyFlag__Group_2_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1206:1: ( rule__ProxyFlag__Group_2_0_0__0__Impl rule__ProxyFlag__Group_2_0_0__1 )
            // InternalCurlBetterThanHttpie.g:1207:2: rule__ProxyFlag__Group_2_0_0__0__Impl rule__ProxyFlag__Group_2_0_0__1
            {
            pushFollow(FOLLOW_14);
            rule__ProxyFlag__Group_2_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProxyFlag__Group_2_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Group_2_0_0__0"


    // $ANTLR start "rule__ProxyFlag__Group_2_0_0__0__Impl"
    // InternalCurlBetterThanHttpie.g:1214:1: rule__ProxyFlag__Group_2_0_0__0__Impl : ( ( rule__ProxyFlag__ProtocolAssignment_2_0_0_0 ) ) ;
    public final void rule__ProxyFlag__Group_2_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1218:1: ( ( ( rule__ProxyFlag__ProtocolAssignment_2_0_0_0 ) ) )
            // InternalCurlBetterThanHttpie.g:1219:1: ( ( rule__ProxyFlag__ProtocolAssignment_2_0_0_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:1219:1: ( ( rule__ProxyFlag__ProtocolAssignment_2_0_0_0 ) )
            // InternalCurlBetterThanHttpie.g:1220:2: ( rule__ProxyFlag__ProtocolAssignment_2_0_0_0 )
            {
             before(grammarAccess.getProxyFlagAccess().getProtocolAssignment_2_0_0_0()); 
            // InternalCurlBetterThanHttpie.g:1221:2: ( rule__ProxyFlag__ProtocolAssignment_2_0_0_0 )
            // InternalCurlBetterThanHttpie.g:1221:3: rule__ProxyFlag__ProtocolAssignment_2_0_0_0
            {
            pushFollow(FOLLOW_2);
            rule__ProxyFlag__ProtocolAssignment_2_0_0_0();

            state._fsp--;


            }

             after(grammarAccess.getProxyFlagAccess().getProtocolAssignment_2_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Group_2_0_0__0__Impl"


    // $ANTLR start "rule__ProxyFlag__Group_2_0_0__1"
    // InternalCurlBetterThanHttpie.g:1229:1: rule__ProxyFlag__Group_2_0_0__1 : rule__ProxyFlag__Group_2_0_0__1__Impl ;
    public final void rule__ProxyFlag__Group_2_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1233:1: ( rule__ProxyFlag__Group_2_0_0__1__Impl )
            // InternalCurlBetterThanHttpie.g:1234:2: rule__ProxyFlag__Group_2_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProxyFlag__Group_2_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Group_2_0_0__1"


    // $ANTLR start "rule__ProxyFlag__Group_2_0_0__1__Impl"
    // InternalCurlBetterThanHttpie.g:1240:1: rule__ProxyFlag__Group_2_0_0__1__Impl : ( ':' ) ;
    public final void rule__ProxyFlag__Group_2_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1244:1: ( ( ':' ) )
            // InternalCurlBetterThanHttpie.g:1245:1: ( ':' )
            {
            // InternalCurlBetterThanHttpie.g:1245:1: ( ':' )
            // InternalCurlBetterThanHttpie.g:1246:2: ':'
            {
             before(grammarAccess.getProxyFlagAccess().getColonKeyword_2_0_0_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getProxyFlagAccess().getColonKeyword_2_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Group_2_0_0__1__Impl"


    // $ANTLR start "rule__ProxyFlag__Group_2_0_1__0"
    // InternalCurlBetterThanHttpie.g:1256:1: rule__ProxyFlag__Group_2_0_1__0 : rule__ProxyFlag__Group_2_0_1__0__Impl rule__ProxyFlag__Group_2_0_1__1 ;
    public final void rule__ProxyFlag__Group_2_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1260:1: ( rule__ProxyFlag__Group_2_0_1__0__Impl rule__ProxyFlag__Group_2_0_1__1 )
            // InternalCurlBetterThanHttpie.g:1261:2: rule__ProxyFlag__Group_2_0_1__0__Impl rule__ProxyFlag__Group_2_0_1__1
            {
            pushFollow(FOLLOW_15);
            rule__ProxyFlag__Group_2_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProxyFlag__Group_2_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Group_2_0_1__0"


    // $ANTLR start "rule__ProxyFlag__Group_2_0_1__0__Impl"
    // InternalCurlBetterThanHttpie.g:1268:1: rule__ProxyFlag__Group_2_0_1__0__Impl : ( ( rule__ProxyFlag__ProxyProtocolAssignment_2_0_1_0 ) ) ;
    public final void rule__ProxyFlag__Group_2_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1272:1: ( ( ( rule__ProxyFlag__ProxyProtocolAssignment_2_0_1_0 ) ) )
            // InternalCurlBetterThanHttpie.g:1273:1: ( ( rule__ProxyFlag__ProxyProtocolAssignment_2_0_1_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:1273:1: ( ( rule__ProxyFlag__ProxyProtocolAssignment_2_0_1_0 ) )
            // InternalCurlBetterThanHttpie.g:1274:2: ( rule__ProxyFlag__ProxyProtocolAssignment_2_0_1_0 )
            {
             before(grammarAccess.getProxyFlagAccess().getProxyProtocolAssignment_2_0_1_0()); 
            // InternalCurlBetterThanHttpie.g:1275:2: ( rule__ProxyFlag__ProxyProtocolAssignment_2_0_1_0 )
            // InternalCurlBetterThanHttpie.g:1275:3: rule__ProxyFlag__ProxyProtocolAssignment_2_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ProxyFlag__ProxyProtocolAssignment_2_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getProxyFlagAccess().getProxyProtocolAssignment_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Group_2_0_1__0__Impl"


    // $ANTLR start "rule__ProxyFlag__Group_2_0_1__1"
    // InternalCurlBetterThanHttpie.g:1283:1: rule__ProxyFlag__Group_2_0_1__1 : rule__ProxyFlag__Group_2_0_1__1__Impl ;
    public final void rule__ProxyFlag__Group_2_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1287:1: ( rule__ProxyFlag__Group_2_0_1__1__Impl )
            // InternalCurlBetterThanHttpie.g:1288:2: rule__ProxyFlag__Group_2_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProxyFlag__Group_2_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Group_2_0_1__1"


    // $ANTLR start "rule__ProxyFlag__Group_2_0_1__1__Impl"
    // InternalCurlBetterThanHttpie.g:1294:1: rule__ProxyFlag__Group_2_0_1__1__Impl : ( '://' ) ;
    public final void rule__ProxyFlag__Group_2_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1298:1: ( ( '://' ) )
            // InternalCurlBetterThanHttpie.g:1299:1: ( '://' )
            {
            // InternalCurlBetterThanHttpie.g:1299:1: ( '://' )
            // InternalCurlBetterThanHttpie.g:1300:2: '://'
            {
             before(grammarAccess.getProxyFlagAccess().getColonSolidusSolidusKeyword_2_0_1_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getProxyFlagAccess().getColonSolidusSolidusKeyword_2_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__Group_2_0_1__1__Impl"


    // $ANTLR start "rule__ProxyFlag__Group_2_1__0"
    // InternalCurlBetterThanHttpie.g:1310:1: rule__ProxyFlag__Group_2_1__0 : rule__ProxyFlag__Group_2_1__0__Impl rule__ProxyFlag__Group_2_1__1 ;
    public final void rule__ProxyFlag__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1314:1: ( rule__ProxyFlag__Group_2_1__0__Impl rule__ProxyFlag__Group_2_1__1 )
            // InternalCurlBetterThanHttpie.g:1315:2: rule__ProxyFlag__Group_2_1__0__Impl rule__ProxyFlag__Group_2_1__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalCurlBetterThanHttpie.g:1322:1: rule__ProxyFlag__Group_2_1__0__Impl : ( ( rule__ProxyFlag__ProxyProtocolAssignment_2_1_0 ) ) ;
    public final void rule__ProxyFlag__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1326:1: ( ( ( rule__ProxyFlag__ProxyProtocolAssignment_2_1_0 ) ) )
            // InternalCurlBetterThanHttpie.g:1327:1: ( ( rule__ProxyFlag__ProxyProtocolAssignment_2_1_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:1327:1: ( ( rule__ProxyFlag__ProxyProtocolAssignment_2_1_0 ) )
            // InternalCurlBetterThanHttpie.g:1328:2: ( rule__ProxyFlag__ProxyProtocolAssignment_2_1_0 )
            {
             before(grammarAccess.getProxyFlagAccess().getProxyProtocolAssignment_2_1_0()); 
            // InternalCurlBetterThanHttpie.g:1329:2: ( rule__ProxyFlag__ProxyProtocolAssignment_2_1_0 )
            // InternalCurlBetterThanHttpie.g:1329:3: rule__ProxyFlag__ProxyProtocolAssignment_2_1_0
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
    // InternalCurlBetterThanHttpie.g:1337:1: rule__ProxyFlag__Group_2_1__1 : rule__ProxyFlag__Group_2_1__1__Impl ;
    public final void rule__ProxyFlag__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1341:1: ( rule__ProxyFlag__Group_2_1__1__Impl )
            // InternalCurlBetterThanHttpie.g:1342:2: rule__ProxyFlag__Group_2_1__1__Impl
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
    // InternalCurlBetterThanHttpie.g:1348:1: rule__ProxyFlag__Group_2_1__1__Impl : ( '://' ) ;
    public final void rule__ProxyFlag__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1352:1: ( ( '://' ) )
            // InternalCurlBetterThanHttpie.g:1353:1: ( '://' )
            {
            // InternalCurlBetterThanHttpie.g:1353:1: ( '://' )
            // InternalCurlBetterThanHttpie.g:1354:2: '://'
            {
             before(grammarAccess.getProxyFlagAccess().getColonSolidusSolidusKeyword_2_1_1()); 
            match(input,33,FOLLOW_2); 
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


    // $ANTLR start "rule__ProxyFlag__Group_3__0"
    // InternalCurlBetterThanHttpie.g:1364:1: rule__ProxyFlag__Group_3__0 : rule__ProxyFlag__Group_3__0__Impl rule__ProxyFlag__Group_3__1 ;
    public final void rule__ProxyFlag__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1368:1: ( rule__ProxyFlag__Group_3__0__Impl rule__ProxyFlag__Group_3__1 )
            // InternalCurlBetterThanHttpie.g:1369:2: rule__ProxyFlag__Group_3__0__Impl rule__ProxyFlag__Group_3__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalCurlBetterThanHttpie.g:1376:1: rule__ProxyFlag__Group_3__0__Impl : ( ( rule__ProxyFlag__UsernameAssignment_3_0 ) ) ;
    public final void rule__ProxyFlag__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1380:1: ( ( ( rule__ProxyFlag__UsernameAssignment_3_0 ) ) )
            // InternalCurlBetterThanHttpie.g:1381:1: ( ( rule__ProxyFlag__UsernameAssignment_3_0 ) )
            {
            // InternalCurlBetterThanHttpie.g:1381:1: ( ( rule__ProxyFlag__UsernameAssignment_3_0 ) )
            // InternalCurlBetterThanHttpie.g:1382:2: ( rule__ProxyFlag__UsernameAssignment_3_0 )
            {
             before(grammarAccess.getProxyFlagAccess().getUsernameAssignment_3_0()); 
            // InternalCurlBetterThanHttpie.g:1383:2: ( rule__ProxyFlag__UsernameAssignment_3_0 )
            // InternalCurlBetterThanHttpie.g:1383:3: rule__ProxyFlag__UsernameAssignment_3_0
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
    // InternalCurlBetterThanHttpie.g:1391:1: rule__ProxyFlag__Group_3__1 : rule__ProxyFlag__Group_3__1__Impl rule__ProxyFlag__Group_3__2 ;
    public final void rule__ProxyFlag__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1395:1: ( rule__ProxyFlag__Group_3__1__Impl rule__ProxyFlag__Group_3__2 )
            // InternalCurlBetterThanHttpie.g:1396:2: rule__ProxyFlag__Group_3__1__Impl rule__ProxyFlag__Group_3__2
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
    // InternalCurlBetterThanHttpie.g:1403:1: rule__ProxyFlag__Group_3__1__Impl : ( ':' ) ;
    public final void rule__ProxyFlag__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1407:1: ( ( ':' ) )
            // InternalCurlBetterThanHttpie.g:1408:1: ( ':' )
            {
            // InternalCurlBetterThanHttpie.g:1408:1: ( ':' )
            // InternalCurlBetterThanHttpie.g:1409:2: ':'
            {
             before(grammarAccess.getProxyFlagAccess().getColonKeyword_3_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalCurlBetterThanHttpie.g:1418:1: rule__ProxyFlag__Group_3__2 : rule__ProxyFlag__Group_3__2__Impl ;
    public final void rule__ProxyFlag__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1422:1: ( rule__ProxyFlag__Group_3__2__Impl )
            // InternalCurlBetterThanHttpie.g:1423:2: rule__ProxyFlag__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProxyFlag__Group_3__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalCurlBetterThanHttpie.g:1429:1: rule__ProxyFlag__Group_3__2__Impl : ( ( rule__ProxyFlag__PasswordAssignment_3_2 ) ) ;
    public final void rule__ProxyFlag__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1433:1: ( ( ( rule__ProxyFlag__PasswordAssignment_3_2 ) ) )
            // InternalCurlBetterThanHttpie.g:1434:1: ( ( rule__ProxyFlag__PasswordAssignment_3_2 ) )
            {
            // InternalCurlBetterThanHttpie.g:1434:1: ( ( rule__ProxyFlag__PasswordAssignment_3_2 ) )
            // InternalCurlBetterThanHttpie.g:1435:2: ( rule__ProxyFlag__PasswordAssignment_3_2 )
            {
             before(grammarAccess.getProxyFlagAccess().getPasswordAssignment_3_2()); 
            // InternalCurlBetterThanHttpie.g:1436:2: ( rule__ProxyFlag__PasswordAssignment_3_2 )
            // InternalCurlBetterThanHttpie.g:1436:3: rule__ProxyFlag__PasswordAssignment_3_2
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


    // $ANTLR start "rule__DownloadFlag__Group__0"
    // InternalCurlBetterThanHttpie.g:1445:1: rule__DownloadFlag__Group__0 : rule__DownloadFlag__Group__0__Impl rule__DownloadFlag__Group__1 ;
    public final void rule__DownloadFlag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1449:1: ( rule__DownloadFlag__Group__0__Impl rule__DownloadFlag__Group__1 )
            // InternalCurlBetterThanHttpie.g:1450:2: rule__DownloadFlag__Group__0__Impl rule__DownloadFlag__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalCurlBetterThanHttpie.g:1457:1: rule__DownloadFlag__Group__0__Impl : ( () ) ;
    public final void rule__DownloadFlag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1461:1: ( ( () ) )
            // InternalCurlBetterThanHttpie.g:1462:1: ( () )
            {
            // InternalCurlBetterThanHttpie.g:1462:1: ( () )
            // InternalCurlBetterThanHttpie.g:1463:2: ()
            {
             before(grammarAccess.getDownloadFlagAccess().getDownloadFlagAction_0()); 
            // InternalCurlBetterThanHttpie.g:1464:2: ()
            // InternalCurlBetterThanHttpie.g:1464:3: 
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
    // InternalCurlBetterThanHttpie.g:1472:1: rule__DownloadFlag__Group__1 : rule__DownloadFlag__Group__1__Impl ;
    public final void rule__DownloadFlag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1476:1: ( rule__DownloadFlag__Group__1__Impl )
            // InternalCurlBetterThanHttpie.g:1477:2: rule__DownloadFlag__Group__1__Impl
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
    // InternalCurlBetterThanHttpie.g:1483:1: rule__DownloadFlag__Group__1__Impl : ( ( rule__DownloadFlag__Alternatives_1 ) ) ;
    public final void rule__DownloadFlag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1487:1: ( ( ( rule__DownloadFlag__Alternatives_1 ) ) )
            // InternalCurlBetterThanHttpie.g:1488:1: ( ( rule__DownloadFlag__Alternatives_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:1488:1: ( ( rule__DownloadFlag__Alternatives_1 ) )
            // InternalCurlBetterThanHttpie.g:1489:2: ( rule__DownloadFlag__Alternatives_1 )
            {
             before(grammarAccess.getDownloadFlagAccess().getAlternatives_1()); 
            // InternalCurlBetterThanHttpie.g:1490:2: ( rule__DownloadFlag__Alternatives_1 )
            // InternalCurlBetterThanHttpie.g:1490:3: rule__DownloadFlag__Alternatives_1
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
    // InternalCurlBetterThanHttpie.g:1499:1: rule__HelpFlag__Group__0 : rule__HelpFlag__Group__0__Impl rule__HelpFlag__Group__1 ;
    public final void rule__HelpFlag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1503:1: ( rule__HelpFlag__Group__0__Impl rule__HelpFlag__Group__1 )
            // InternalCurlBetterThanHttpie.g:1504:2: rule__HelpFlag__Group__0__Impl rule__HelpFlag__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalCurlBetterThanHttpie.g:1511:1: rule__HelpFlag__Group__0__Impl : ( () ) ;
    public final void rule__HelpFlag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1515:1: ( ( () ) )
            // InternalCurlBetterThanHttpie.g:1516:1: ( () )
            {
            // InternalCurlBetterThanHttpie.g:1516:1: ( () )
            // InternalCurlBetterThanHttpie.g:1517:2: ()
            {
             before(grammarAccess.getHelpFlagAccess().getHelpFlagAction_0()); 
            // InternalCurlBetterThanHttpie.g:1518:2: ()
            // InternalCurlBetterThanHttpie.g:1518:3: 
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
    // InternalCurlBetterThanHttpie.g:1526:1: rule__HelpFlag__Group__1 : rule__HelpFlag__Group__1__Impl ;
    public final void rule__HelpFlag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1530:1: ( rule__HelpFlag__Group__1__Impl )
            // InternalCurlBetterThanHttpie.g:1531:2: rule__HelpFlag__Group__1__Impl
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
    // InternalCurlBetterThanHttpie.g:1537:1: rule__HelpFlag__Group__1__Impl : ( ( rule__HelpFlag__Alternatives_1 ) ) ;
    public final void rule__HelpFlag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1541:1: ( ( ( rule__HelpFlag__Alternatives_1 ) ) )
            // InternalCurlBetterThanHttpie.g:1542:1: ( ( rule__HelpFlag__Alternatives_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:1542:1: ( ( rule__HelpFlag__Alternatives_1 ) )
            // InternalCurlBetterThanHttpie.g:1543:2: ( rule__HelpFlag__Alternatives_1 )
            {
             before(grammarAccess.getHelpFlagAccess().getAlternatives_1()); 
            // InternalCurlBetterThanHttpie.g:1544:2: ( rule__HelpFlag__Alternatives_1 )
            // InternalCurlBetterThanHttpie.g:1544:3: rule__HelpFlag__Alternatives_1
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
    // InternalCurlBetterThanHttpie.g:1553:1: rule__VersionFlag__Group__0 : rule__VersionFlag__Group__0__Impl rule__VersionFlag__Group__1 ;
    public final void rule__VersionFlag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1557:1: ( rule__VersionFlag__Group__0__Impl rule__VersionFlag__Group__1 )
            // InternalCurlBetterThanHttpie.g:1558:2: rule__VersionFlag__Group__0__Impl rule__VersionFlag__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalCurlBetterThanHttpie.g:1565:1: rule__VersionFlag__Group__0__Impl : ( () ) ;
    public final void rule__VersionFlag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1569:1: ( ( () ) )
            // InternalCurlBetterThanHttpie.g:1570:1: ( () )
            {
            // InternalCurlBetterThanHttpie.g:1570:1: ( () )
            // InternalCurlBetterThanHttpie.g:1571:2: ()
            {
             before(grammarAccess.getVersionFlagAccess().getVersionFlagAction_0()); 
            // InternalCurlBetterThanHttpie.g:1572:2: ()
            // InternalCurlBetterThanHttpie.g:1572:3: 
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
    // InternalCurlBetterThanHttpie.g:1580:1: rule__VersionFlag__Group__1 : rule__VersionFlag__Group__1__Impl ;
    public final void rule__VersionFlag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1584:1: ( rule__VersionFlag__Group__1__Impl )
            // InternalCurlBetterThanHttpie.g:1585:2: rule__VersionFlag__Group__1__Impl
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
    // InternalCurlBetterThanHttpie.g:1591:1: rule__VersionFlag__Group__1__Impl : ( '--version' ) ;
    public final void rule__VersionFlag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1595:1: ( ( '--version' ) )
            // InternalCurlBetterThanHttpie.g:1596:1: ( '--version' )
            {
            // InternalCurlBetterThanHttpie.g:1596:1: ( '--version' )
            // InternalCurlBetterThanHttpie.g:1597:2: '--version'
            {
             before(grammarAccess.getVersionFlagAccess().getVersionKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalCurlBetterThanHttpie.g:1607:1: rule__VerboseFlag__Group__0 : rule__VerboseFlag__Group__0__Impl rule__VerboseFlag__Group__1 ;
    public final void rule__VerboseFlag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1611:1: ( rule__VerboseFlag__Group__0__Impl rule__VerboseFlag__Group__1 )
            // InternalCurlBetterThanHttpie.g:1612:2: rule__VerboseFlag__Group__0__Impl rule__VerboseFlag__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalCurlBetterThanHttpie.g:1619:1: rule__VerboseFlag__Group__0__Impl : ( () ) ;
    public final void rule__VerboseFlag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1623:1: ( ( () ) )
            // InternalCurlBetterThanHttpie.g:1624:1: ( () )
            {
            // InternalCurlBetterThanHttpie.g:1624:1: ( () )
            // InternalCurlBetterThanHttpie.g:1625:2: ()
            {
             before(grammarAccess.getVerboseFlagAccess().getVerboseFlagAction_0()); 
            // InternalCurlBetterThanHttpie.g:1626:2: ()
            // InternalCurlBetterThanHttpie.g:1626:3: 
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
    // InternalCurlBetterThanHttpie.g:1634:1: rule__VerboseFlag__Group__1 : rule__VerboseFlag__Group__1__Impl ;
    public final void rule__VerboseFlag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1638:1: ( rule__VerboseFlag__Group__1__Impl )
            // InternalCurlBetterThanHttpie.g:1639:2: rule__VerboseFlag__Group__1__Impl
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
    // InternalCurlBetterThanHttpie.g:1645:1: rule__VerboseFlag__Group__1__Impl : ( ( rule__VerboseFlag__Alternatives_1 ) ) ;
    public final void rule__VerboseFlag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1649:1: ( ( ( rule__VerboseFlag__Alternatives_1 ) ) )
            // InternalCurlBetterThanHttpie.g:1650:1: ( ( rule__VerboseFlag__Alternatives_1 ) )
            {
            // InternalCurlBetterThanHttpie.g:1650:1: ( ( rule__VerboseFlag__Alternatives_1 ) )
            // InternalCurlBetterThanHttpie.g:1651:2: ( rule__VerboseFlag__Alternatives_1 )
            {
             before(grammarAccess.getVerboseFlagAccess().getAlternatives_1()); 
            // InternalCurlBetterThanHttpie.g:1652:2: ( rule__VerboseFlag__Alternatives_1 )
            // InternalCurlBetterThanHttpie.g:1652:3: rule__VerboseFlag__Alternatives_1
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


    // $ANTLR start "rule__CommandLineInterface__FlagsAssignment_2_1"
    // InternalCurlBetterThanHttpie.g:1661:1: rule__CommandLineInterface__FlagsAssignment_2_1 : ( ruleFlag ) ;
    public final void rule__CommandLineInterface__FlagsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1665:1: ( ( ruleFlag ) )
            // InternalCurlBetterThanHttpie.g:1666:2: ( ruleFlag )
            {
            // InternalCurlBetterThanHttpie.g:1666:2: ( ruleFlag )
            // InternalCurlBetterThanHttpie.g:1667:3: ruleFlag
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


    // $ANTLR start "rule__ProxyFlag__ProtocolAssignment_2_0_0_0"
    // InternalCurlBetterThanHttpie.g:1676:1: rule__ProxyFlag__ProtocolAssignment_2_0_0_0 : ( RULE_BASIC_STRING ) ;
    public final void rule__ProxyFlag__ProtocolAssignment_2_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1680:1: ( ( RULE_BASIC_STRING ) )
            // InternalCurlBetterThanHttpie.g:1681:2: ( RULE_BASIC_STRING )
            {
            // InternalCurlBetterThanHttpie.g:1681:2: ( RULE_BASIC_STRING )
            // InternalCurlBetterThanHttpie.g:1682:3: RULE_BASIC_STRING
            {
             before(grammarAccess.getProxyFlagAccess().getProtocolBASIC_STRINGTerminalRuleCall_2_0_0_0_0()); 
            match(input,RULE_BASIC_STRING,FOLLOW_2); 
             after(grammarAccess.getProxyFlagAccess().getProtocolBASIC_STRINGTerminalRuleCall_2_0_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__ProtocolAssignment_2_0_0_0"


    // $ANTLR start "rule__ProxyFlag__ProxyProtocolAssignment_2_0_1_0"
    // InternalCurlBetterThanHttpie.g:1691:1: rule__ProxyFlag__ProxyProtocolAssignment_2_0_1_0 : ( RULE_BASIC_STRING ) ;
    public final void rule__ProxyFlag__ProxyProtocolAssignment_2_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1695:1: ( ( RULE_BASIC_STRING ) )
            // InternalCurlBetterThanHttpie.g:1696:2: ( RULE_BASIC_STRING )
            {
            // InternalCurlBetterThanHttpie.g:1696:2: ( RULE_BASIC_STRING )
            // InternalCurlBetterThanHttpie.g:1697:3: RULE_BASIC_STRING
            {
             before(grammarAccess.getProxyFlagAccess().getProxyProtocolBASIC_STRINGTerminalRuleCall_2_0_1_0_0()); 
            match(input,RULE_BASIC_STRING,FOLLOW_2); 
             after(grammarAccess.getProxyFlagAccess().getProxyProtocolBASIC_STRINGTerminalRuleCall_2_0_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyFlag__ProxyProtocolAssignment_2_0_1_0"


    // $ANTLR start "rule__ProxyFlag__ProxyProtocolAssignment_2_1_0"
    // InternalCurlBetterThanHttpie.g:1706:1: rule__ProxyFlag__ProxyProtocolAssignment_2_1_0 : ( RULE_BASIC_STRING ) ;
    public final void rule__ProxyFlag__ProxyProtocolAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1710:1: ( ( RULE_BASIC_STRING ) )
            // InternalCurlBetterThanHttpie.g:1711:2: ( RULE_BASIC_STRING )
            {
            // InternalCurlBetterThanHttpie.g:1711:2: ( RULE_BASIC_STRING )
            // InternalCurlBetterThanHttpie.g:1712:3: RULE_BASIC_STRING
            {
             before(grammarAccess.getProxyFlagAccess().getProxyProtocolBASIC_STRINGTerminalRuleCall_2_1_0_0()); 
            match(input,RULE_BASIC_STRING,FOLLOW_2); 
             after(grammarAccess.getProxyFlagAccess().getProxyProtocolBASIC_STRINGTerminalRuleCall_2_1_0_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__ProxyFlag__UsernameAssignment_3_0"
    // InternalCurlBetterThanHttpie.g:1721:1: rule__ProxyFlag__UsernameAssignment_3_0 : ( RULE_STRING_UP ) ;
    public final void rule__ProxyFlag__UsernameAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1725:1: ( ( RULE_STRING_UP ) )
            // InternalCurlBetterThanHttpie.g:1726:2: ( RULE_STRING_UP )
            {
            // InternalCurlBetterThanHttpie.g:1726:2: ( RULE_STRING_UP )
            // InternalCurlBetterThanHttpie.g:1727:3: RULE_STRING_UP
            {
             before(grammarAccess.getProxyFlagAccess().getUsernameSTRING_UPTerminalRuleCall_3_0_0()); 
            match(input,RULE_STRING_UP,FOLLOW_2); 
             after(grammarAccess.getProxyFlagAccess().getUsernameSTRING_UPTerminalRuleCall_3_0_0()); 

            }


            }

        }
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
    // InternalCurlBetterThanHttpie.g:1736:1: rule__ProxyFlag__PasswordAssignment_3_2 : ( RULE_STRING_UP ) ;
    public final void rule__ProxyFlag__PasswordAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCurlBetterThanHttpie.g:1740:1: ( ( RULE_STRING_UP ) )
            // InternalCurlBetterThanHttpie.g:1741:2: ( RULE_STRING_UP )
            {
            // InternalCurlBetterThanHttpie.g:1741:2: ( RULE_STRING_UP )
            // InternalCurlBetterThanHttpie.g:1742:3: RULE_STRING_UP
            {
             before(grammarAccess.getProxyFlagAccess().getPasswordSTRING_UPTerminalRuleCall_3_2_0()); 
            match(input,RULE_STRING_UP,FOLLOW_2); 
             after(grammarAccess.getProxyFlagAccess().getPasswordSTRING_UPTerminalRuleCall_3_2_0()); 

            }


            }

        }
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000004BFDFF000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000030000000L});

}