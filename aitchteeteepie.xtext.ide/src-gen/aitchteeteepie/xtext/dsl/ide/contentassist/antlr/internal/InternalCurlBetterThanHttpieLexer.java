package aitchteeteepie.xtext.dsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCurlBetterThanHttpieLexer extends Lexer {
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

    public InternalCurlBetterThanHttpieLexer() {;} 
    public InternalCurlBetterThanHttpieLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalCurlBetterThanHttpieLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalCurlBetterThanHttpie.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:11:7: ( '--header' )
            // InternalCurlBetterThanHttpie.g:11:9: '--header'
            {
            match("--header"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:12:7: ( '-t' )
            // InternalCurlBetterThanHttpie.g:12:9: '-t'
            {
            match("-t"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:13:7: ( '--body' )
            // InternalCurlBetterThanHttpie.g:13:9: '--body'
            {
            match("--body"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:14:7: ( '-b' )
            // InternalCurlBetterThanHttpie.g:14:9: '-b'
            {
            match("-b"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:15:7: ( '--json' )
            // InternalCurlBetterThanHttpie.g:15:9: '--json'
            {
            match("--json"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:16:7: ( '-j' )
            // InternalCurlBetterThanHttpie.g:16:9: '-j'
            {
            match("-j"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:17:7: ( '--form' )
            // InternalCurlBetterThanHttpie.g:17:9: '--form'
            {
            match("--form"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:18:7: ( 'f' )
            // InternalCurlBetterThanHttpie.g:18:9: 'f'
            {
            match('f'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:19:7: ( '--auth' )
            // InternalCurlBetterThanHttpie.g:19:9: '--auth'
            {
            match("--auth"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:20:7: ( '-a' )
            // InternalCurlBetterThanHttpie.g:20:9: '-a'
            {
            match("-a"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:21:7: ( '--download' )
            // InternalCurlBetterThanHttpie.g:21:9: '--download'
            {
            match("--download"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:22:7: ( '-d' )
            // InternalCurlBetterThanHttpie.g:22:9: '-d'
            {
            match("-d"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:23:7: ( '--help' )
            // InternalCurlBetterThanHttpie.g:23:9: '--help'
            {
            match("--help"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:24:7: ( '-h' )
            // InternalCurlBetterThanHttpie.g:24:9: '-h'
            {
            match("-h"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:25:7: ( '--verbose' )
            // InternalCurlBetterThanHttpie.g:25:9: '--verbose'
            {
            match("--verbose"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:26:7: ( '-v' )
            // InternalCurlBetterThanHttpie.g:26:9: '-v'
            {
            match("-v"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:27:7: ( 'GET' )
            // InternalCurlBetterThanHttpie.g:27:9: 'GET'
            {
            match("GET"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:28:7: ( 'POST' )
            // InternalCurlBetterThanHttpie.g:28:9: 'POST'
            {
            match("POST"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:29:7: ( 'PUT' )
            // InternalCurlBetterThanHttpie.g:29:9: 'PUT'
            {
            match("PUT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:30:7: ( 'DELETE' )
            // InternalCurlBetterThanHttpie.g:30:9: 'DELETE'
            {
            match("DELETE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:31:7: ( 'http' )
            // InternalCurlBetterThanHttpie.g:31:9: 'http'
            {
            match("http"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:32:7: ( '--proxy' )
            // InternalCurlBetterThanHttpie.g:32:9: '--proxy'
            {
            match("--proxy"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:33:7: ( ':' )
            // InternalCurlBetterThanHttpie.g:33:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:34:7: ( '://' )
            // InternalCurlBetterThanHttpie.g:34:9: '://'
            {
            match("://"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:35:7: ( 'a' )
            // InternalCurlBetterThanHttpie.g:35:9: 'a'
            {
            match('a'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:36:7: ( '@' )
            // InternalCurlBetterThanHttpie.g:36:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:37:7: ( '--version' )
            // InternalCurlBetterThanHttpie.g:37:9: '--version'
            {
            match("--version"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:38:7: ( '--timeout' )
            // InternalCurlBetterThanHttpie.g:38:9: '--timeout'
            {
            match("--timeout"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:2307:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalCurlBetterThanHttpie.g:2307:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalCurlBetterThanHttpie.g:2307:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\t' && LA1_0<='\n')||LA1_0=='\r'||LA1_0==' ') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCurlBetterThanHttpie.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_VALUE"
    public final void mRULE_VALUE() throws RecognitionException {
        try {
            int _type = RULE_VALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:2309:12: ( ( '=' | RULE_WS ) )
            // InternalCurlBetterThanHttpie.g:2309:14: ( '=' | RULE_WS )
            {
            // InternalCurlBetterThanHttpie.g:2309:14: ( '=' | RULE_WS )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='=') ) {
                alt2=1;
            }
            else if ( ((LA2_0>='\t' && LA2_0<='\n')||LA2_0=='\r'||LA2_0==' ') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:2309:15: '='
                    {
                    match('='); 

                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:2309:19: RULE_WS
                    {
                    mRULE_WS(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VALUE"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            // InternalCurlBetterThanHttpie.g:2311:21: ( '0' .. '9' )
            // InternalCurlBetterThanHttpie.g:2311:23: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:2313:10: ( ( '0' | '1' .. '9' ( RULE_DIGIT )* ) )
            // InternalCurlBetterThanHttpie.g:2313:12: ( '0' | '1' .. '9' ( RULE_DIGIT )* )
            {
            // InternalCurlBetterThanHttpie.g:2313:12: ( '0' | '1' .. '9' ( RULE_DIGIT )* )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='0') ) {
                alt4=1;
            }
            else if ( ((LA4_0>='1' && LA4_0<='9')) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:2313:13: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:2313:17: '1' .. '9' ( RULE_DIGIT )*
                    {
                    matchRange('1','9'); 
                    // InternalCurlBetterThanHttpie.g:2313:26: ( RULE_DIGIT )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalCurlBetterThanHttpie.g:2313:26: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_FLOAT"
    public final void mRULE_FLOAT() throws RecognitionException {
        try {
            int _type = RULE_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:2315:12: ( ( RULE_INT | ( RULE_INT )? '.' ( RULE_DIGIT )* ( ( 'E' | 'e' ) RULE_INT )? ) )
            // InternalCurlBetterThanHttpie.g:2315:14: ( RULE_INT | ( RULE_INT )? '.' ( RULE_DIGIT )* ( ( 'E' | 'e' ) RULE_INT )? )
            {
            // InternalCurlBetterThanHttpie.g:2315:14: ( RULE_INT | ( RULE_INT )? '.' ( RULE_DIGIT )* ( ( 'E' | 'e' ) RULE_INT )? )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:2315:15: RULE_INT
                    {
                    mRULE_INT(); 

                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:2315:24: ( RULE_INT )? '.' ( RULE_DIGIT )* ( ( 'E' | 'e' ) RULE_INT )?
                    {
                    // InternalCurlBetterThanHttpie.g:2315:24: ( RULE_INT )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalCurlBetterThanHttpie.g:2315:24: RULE_INT
                            {
                            mRULE_INT(); 

                            }
                            break;

                    }

                    match('.'); 
                    // InternalCurlBetterThanHttpie.g:2315:38: ( RULE_DIGIT )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalCurlBetterThanHttpie.g:2315:38: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    // InternalCurlBetterThanHttpie.g:2315:50: ( ( 'E' | 'e' ) RULE_INT )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='E'||LA7_0=='e') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalCurlBetterThanHttpie.g:2315:51: ( 'E' | 'e' ) RULE_INT
                            {
                            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            mRULE_INT(); 

                            }
                            break;

                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FLOAT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:2317:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalCurlBetterThanHttpie.g:2317:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalCurlBetterThanHttpie.g:2317:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\"') ) {
                alt11=1;
            }
            else if ( (LA11_0=='\'') ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:2317:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalCurlBetterThanHttpie.g:2317:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='!')||(LA9_0>='#' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalCurlBetterThanHttpie.g:2317:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalCurlBetterThanHttpie.g:2317:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:2317:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalCurlBetterThanHttpie.g:2317:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\\') ) {
                            alt10=1;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='&')||(LA10_0>='(' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalCurlBetterThanHttpie.g:2317:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalCurlBetterThanHttpie.g:2317:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:2319:16: ( . )
            // InternalCurlBetterThanHttpie.g:2319:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalCurlBetterThanHttpie.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | RULE_WS | RULE_VALUE | RULE_INT | RULE_FLOAT | RULE_STRING | RULE_ANY_OTHER )
        int alt12=34;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalCurlBetterThanHttpie.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // InternalCurlBetterThanHttpie.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // InternalCurlBetterThanHttpie.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // InternalCurlBetterThanHttpie.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // InternalCurlBetterThanHttpie.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // InternalCurlBetterThanHttpie.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // InternalCurlBetterThanHttpie.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // InternalCurlBetterThanHttpie.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // InternalCurlBetterThanHttpie.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // InternalCurlBetterThanHttpie.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // InternalCurlBetterThanHttpie.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // InternalCurlBetterThanHttpie.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // InternalCurlBetterThanHttpie.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // InternalCurlBetterThanHttpie.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // InternalCurlBetterThanHttpie.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // InternalCurlBetterThanHttpie.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // InternalCurlBetterThanHttpie.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // InternalCurlBetterThanHttpie.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // InternalCurlBetterThanHttpie.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // InternalCurlBetterThanHttpie.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // InternalCurlBetterThanHttpie.g:1:130: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // InternalCurlBetterThanHttpie.g:1:136: T__32
                {
                mT__32(); 

                }
                break;
            case 23 :
                // InternalCurlBetterThanHttpie.g:1:142: T__33
                {
                mT__33(); 

                }
                break;
            case 24 :
                // InternalCurlBetterThanHttpie.g:1:148: T__34
                {
                mT__34(); 

                }
                break;
            case 25 :
                // InternalCurlBetterThanHttpie.g:1:154: T__35
                {
                mT__35(); 

                }
                break;
            case 26 :
                // InternalCurlBetterThanHttpie.g:1:160: T__36
                {
                mT__36(); 

                }
                break;
            case 27 :
                // InternalCurlBetterThanHttpie.g:1:166: T__37
                {
                mT__37(); 

                }
                break;
            case 28 :
                // InternalCurlBetterThanHttpie.g:1:172: T__38
                {
                mT__38(); 

                }
                break;
            case 29 :
                // InternalCurlBetterThanHttpie.g:1:178: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 30 :
                // InternalCurlBetterThanHttpie.g:1:186: RULE_VALUE
                {
                mRULE_VALUE(); 

                }
                break;
            case 31 :
                // InternalCurlBetterThanHttpie.g:1:197: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 32 :
                // InternalCurlBetterThanHttpie.g:1:206: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 33 :
                // InternalCurlBetterThanHttpie.g:1:217: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 34 :
                // InternalCurlBetterThanHttpie.g:1:229: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA8_eotS =
        "\1\uffff\2\4\2\uffff\1\4";
    static final String DFA8_eofS =
        "\6\uffff";
    static final String DFA8_minS =
        "\3\56\2\uffff\1\56";
    static final String DFA8_maxS =
        "\1\71\1\56\1\71\2\uffff\1\71";
    static final String DFA8_acceptS =
        "\3\uffff\1\2\1\1\1\uffff";
    static final String DFA8_specialS =
        "\6\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\3\1\uffff\1\1\11\2",
            "\1\3",
            "\1\3\1\uffff\12\5",
            "",
            "",
            "\1\3\1\uffff\12\5"
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "2315:14: ( RULE_INT | ( RULE_INT )? '.' ( RULE_DIGIT )* ( ( 'E' | 'e' ) RULE_INT )? )";
        }
    }
    static final String DFA12_eotS =
        "\1\uffff\1\21\1\uffff\4\21\1\41\2\uffff\1\44\1\uffff\2\47\1\uffff\2\21\24\uffff\1\44\3\uffff\1\47\21\uffff";
    static final String DFA12_eofS =
        "\73\uffff";
    static final String DFA12_minS =
        "\1\0\1\55\1\uffff\1\105\1\117\1\105\1\164\1\57\2\uffff\1\11\1\uffff\2\56\1\uffff\2\0\1\uffff\1\141\22\uffff\1\11\3\uffff\1\56\1\uffff\1\145\5\uffff\1\145\2\uffff\1\141\1\162\2\uffff\1\142\2\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\166\1\uffff\1\105\1\125\1\105\1\164\1\57\2\uffff\1\40\1\uffff\1\56\1\71\1\uffff\2\uffff\1\uffff\1\166\22\uffff\1\40\3\uffff\1\71\1\uffff\1\145\5\uffff\1\145\2\uffff\1\154\1\162\2\uffff\1\163\2\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\10\5\uffff\1\31\1\32\1\uffff\1\36\2\uffff\1\40\2\uffff\1\42\1\uffff\1\2\1\4\1\6\1\12\1\14\1\16\1\20\1\10\1\21\1\22\1\23\1\24\1\25\1\30\1\27\1\31\1\32\1\35\1\uffff\1\36\1\37\1\40\1\uffff\1\41\1\uffff\1\3\1\5\1\7\1\11\1\13\1\uffff\1\26\1\34\2\uffff\1\1\1\15\1\uffff\1\17\1\33";
    static final String DFA12_specialS =
        "\1\2\16\uffff\1\1\1\0\52\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\21\2\12\2\21\1\12\22\21\1\12\1\21\1\17\4\21\1\20\5\21\1\1\1\16\1\21\1\14\11\15\1\7\2\21\1\13\2\21\1\11\3\21\1\5\2\21\1\3\10\21\1\4\20\21\1\10\4\21\1\2\1\21\1\6\uff97\21",
            "\1\22\63\uffff\1\26\1\24\1\uffff\1\27\3\uffff\1\30\1\uffff\1\25\11\uffff\1\23\1\uffff\1\31",
            "",
            "\1\33",
            "\1\34\5\uffff\1\35",
            "\1\36",
            "\1\37",
            "\1\40",
            "",
            "",
            "\2\45\2\uffff\1\45\22\uffff\1\45",
            "",
            "\1\50",
            "\1\50\1\uffff\12\51",
            "",
            "\0\52",
            "\0\52",
            "",
            "\1\57\1\54\1\uffff\1\60\1\uffff\1\56\1\uffff\1\53\1\uffff\1\55\5\uffff\1\62\3\uffff\1\63\1\uffff\1\61",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\45\2\uffff\1\45\22\uffff\1\45",
            "",
            "",
            "",
            "\1\50\1\uffff\12\51",
            "",
            "\1\64",
            "",
            "",
            "",
            "",
            "",
            "\1\65",
            "",
            "",
            "\1\66\12\uffff\1\67",
            "\1\70",
            "",
            "",
            "\1\71\20\uffff\1\72",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | RULE_WS | RULE_VALUE | RULE_INT | RULE_FLOAT | RULE_STRING | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_16 = input.LA(1);

                        s = -1;
                        if ( ((LA12_16>='\u0000' && LA12_16<='\uFFFF')) ) {s = 42;}

                        else s = 17;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_15 = input.LA(1);

                        s = -1;
                        if ( ((LA12_15>='\u0000' && LA12_15<='\uFFFF')) ) {s = 42;}

                        else s = 17;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='-') ) {s = 1;}

                        else if ( (LA12_0=='f') ) {s = 2;}

                        else if ( (LA12_0=='G') ) {s = 3;}

                        else if ( (LA12_0=='P') ) {s = 4;}

                        else if ( (LA12_0=='D') ) {s = 5;}

                        else if ( (LA12_0=='h') ) {s = 6;}

                        else if ( (LA12_0==':') ) {s = 7;}

                        else if ( (LA12_0=='a') ) {s = 8;}

                        else if ( (LA12_0=='@') ) {s = 9;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 10;}

                        else if ( (LA12_0=='=') ) {s = 11;}

                        else if ( (LA12_0=='0') ) {s = 12;}

                        else if ( ((LA12_0>='1' && LA12_0<='9')) ) {s = 13;}

                        else if ( (LA12_0=='.') ) {s = 14;}

                        else if ( (LA12_0=='\"') ) {s = 15;}

                        else if ( (LA12_0=='\'') ) {s = 16;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<=',')||LA12_0=='/'||(LA12_0>=';' && LA12_0<='<')||(LA12_0>='>' && LA12_0<='?')||(LA12_0>='A' && LA12_0<='C')||(LA12_0>='E' && LA12_0<='F')||(LA12_0>='H' && LA12_0<='O')||(LA12_0>='Q' && LA12_0<='`')||(LA12_0>='b' && LA12_0<='e')||LA12_0=='g'||(LA12_0>='i' && LA12_0<='\uFFFF')) ) {s = 17;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}