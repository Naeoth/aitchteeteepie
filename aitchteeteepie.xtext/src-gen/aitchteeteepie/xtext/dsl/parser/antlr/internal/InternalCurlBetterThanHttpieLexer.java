package aitchteeteepie.xtext.dsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCurlBetterThanHttpieLexer extends Lexer {
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

    public InternalCurlBetterThanHttpieLexer() {;} 
    public InternalCurlBetterThanHttpieLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalCurlBetterThanHttpieLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalCurlBetterThanHttpie.g"; }

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:11:7: ( '://' )
            // InternalCurlBetterThanHttpie.g:11:9: '://'
            {
            match("://"); 


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
            // InternalCurlBetterThanHttpie.g:12:7: ( ':' )
            // InternalCurlBetterThanHttpie.g:12:9: ':'
            {
            match(':'); 

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
            // InternalCurlBetterThanHttpie.g:13:7: ( '/' )
            // InternalCurlBetterThanHttpie.g:13:9: '/'
            {
            match('/'); 

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
            // InternalCurlBetterThanHttpie.g:14:7: ( '--' )
            // InternalCurlBetterThanHttpie.g:14:9: '--'
            {
            match("--"); 


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
            // InternalCurlBetterThanHttpie.g:15:7: ( '--header' )
            // InternalCurlBetterThanHttpie.g:15:9: '--header'
            {
            match("--header"); 


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
            // InternalCurlBetterThanHttpie.g:16:7: ( '-t' )
            // InternalCurlBetterThanHttpie.g:16:9: '-t'
            {
            match("-t"); 


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
            // InternalCurlBetterThanHttpie.g:17:7: ( '--body' )
            // InternalCurlBetterThanHttpie.g:17:9: '--body'
            {
            match("--body"); 


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
            // InternalCurlBetterThanHttpie.g:18:7: ( '-b' )
            // InternalCurlBetterThanHttpie.g:18:9: '-b'
            {
            match("-b"); 


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
            // InternalCurlBetterThanHttpie.g:19:7: ( '--json' )
            // InternalCurlBetterThanHttpie.g:19:9: '--json'
            {
            match("--json"); 


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
            // InternalCurlBetterThanHttpie.g:20:7: ( '-j' )
            // InternalCurlBetterThanHttpie.g:20:9: '-j'
            {
            match("-j"); 


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
            // InternalCurlBetterThanHttpie.g:21:7: ( '--form' )
            // InternalCurlBetterThanHttpie.g:21:9: '--form'
            {
            match("--form"); 


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
            // InternalCurlBetterThanHttpie.g:22:7: ( '-f' )
            // InternalCurlBetterThanHttpie.g:22:9: '-f'
            {
            match("-f"); 


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
            // InternalCurlBetterThanHttpie.g:23:7: ( '--proxy' )
            // InternalCurlBetterThanHttpie.g:23:9: '--proxy'
            {
            match("--proxy"); 


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
            // InternalCurlBetterThanHttpie.g:24:7: ( '=' )
            // InternalCurlBetterThanHttpie.g:24:9: '='
            {
            match('='); 

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
            // InternalCurlBetterThanHttpie.g:25:7: ( '@' )
            // InternalCurlBetterThanHttpie.g:25:9: '@'
            {
            match('@'); 

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
            // InternalCurlBetterThanHttpie.g:26:7: ( '--auth' )
            // InternalCurlBetterThanHttpie.g:26:9: '--auth'
            {
            match("--auth"); 


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
            // InternalCurlBetterThanHttpie.g:27:7: ( '-a' )
            // InternalCurlBetterThanHttpie.g:27:9: '-a'
            {
            match("-a"); 


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
            // InternalCurlBetterThanHttpie.g:28:7: ( '--download' )
            // InternalCurlBetterThanHttpie.g:28:9: '--download'
            {
            match("--download"); 


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
            // InternalCurlBetterThanHttpie.g:29:7: ( '-d' )
            // InternalCurlBetterThanHttpie.g:29:9: '-d'
            {
            match("-d"); 


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
            // InternalCurlBetterThanHttpie.g:30:7: ( '--help' )
            // InternalCurlBetterThanHttpie.g:30:9: '--help'
            {
            match("--help"); 


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
            // InternalCurlBetterThanHttpie.g:31:7: ( '-h' )
            // InternalCurlBetterThanHttpie.g:31:9: '-h'
            {
            match("-h"); 


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
            // InternalCurlBetterThanHttpie.g:32:7: ( '--version' )
            // InternalCurlBetterThanHttpie.g:32:9: '--version'
            {
            match("--version"); 


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
            // InternalCurlBetterThanHttpie.g:33:7: ( '--verbose' )
            // InternalCurlBetterThanHttpie.g:33:9: '--verbose'
            {
            match("--verbose"); 


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
            // InternalCurlBetterThanHttpie.g:34:7: ( '-v' )
            // InternalCurlBetterThanHttpie.g:34:9: '-v'
            {
            match("-v"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:35:7: ( '--timeout' )
            // InternalCurlBetterThanHttpie.g:35:9: '--timeout'
            {
            match("--timeout"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:36:7: ( '==' )
            // InternalCurlBetterThanHttpie.g:36:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:37:7: ( ':=' )
            // InternalCurlBetterThanHttpie.g:37:9: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:38:7: ( '\"' )
            // InternalCurlBetterThanHttpie.g:38:9: '\"'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:39:7: ( '\\'' )
            // InternalCurlBetterThanHttpie.g:39:9: '\\''
            {
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:40:7: ( '{' )
            // InternalCurlBetterThanHttpie.g:40:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:41:7: ( ',' )
            // InternalCurlBetterThanHttpie.g:41:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:42:7: ( '}' )
            // InternalCurlBetterThanHttpie.g:42:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:43:7: ( '[' )
            // InternalCurlBetterThanHttpie.g:43:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:44:7: ( ']' )
            // InternalCurlBetterThanHttpie.g:44:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:45:7: ( 'GET' )
            // InternalCurlBetterThanHttpie.g:45:9: 'GET'
            {
            match("GET"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:46:7: ( 'POST' )
            // InternalCurlBetterThanHttpie.g:46:9: 'POST'
            {
            match("POST"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:47:7: ( 'PUT' )
            // InternalCurlBetterThanHttpie.g:47:9: 'PUT'
            {
            match("PUT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:48:7: ( 'DELETE' )
            // InternalCurlBetterThanHttpie.g:48:9: 'DELETE'
            {
            match("DELETE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            // InternalCurlBetterThanHttpie.g:2616:21: ( '0' .. '9' )
            // InternalCurlBetterThanHttpie.g:2616:23: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT"

    // $ANTLR start "RULE_LETTER"
    public final void mRULE_LETTER() throws RecognitionException {
        try {
            // InternalCurlBetterThanHttpie.g:2618:22: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) )
            // InternalCurlBetterThanHttpie.g:2618:24: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_LETTER"

    // $ANTLR start "RULE_HTTP"
    public final void mRULE_HTTP() throws RecognitionException {
        try {
            int _type = RULE_HTTP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:2620:11: ( 'http' )
            // InternalCurlBetterThanHttpie.g:2620:13: 'http'
            {
            match("http"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HTTP"

    // $ANTLR start "RULE_URL"
    public final void mRULE_URL() throws RecognitionException {
        try {
            int _type = RULE_URL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:2622:10: ( ( 'localhost' | RULE_ID '.' RULE_ID ) )
            // InternalCurlBetterThanHttpie.g:2622:12: ( 'localhost' | RULE_ID '.' RULE_ID )
            {
            // InternalCurlBetterThanHttpie.g:2622:12: ( 'localhost' | RULE_ID '.' RULE_ID )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:2622:13: 'localhost'
                    {
                    match("localhost"); 


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:2622:25: RULE_ID '.' RULE_ID
                    {
                    mRULE_ID(); 
                    match('.'); 
                    mRULE_ID(); 

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
    // $ANTLR end "RULE_URL"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:2624:10: ( ( '0' | '1' .. '9' ( RULE_DIGIT )* ) )
            // InternalCurlBetterThanHttpie.g:2624:12: ( '0' | '1' .. '9' ( RULE_DIGIT )* )
            {
            // InternalCurlBetterThanHttpie.g:2624:12: ( '0' | '1' .. '9' ( RULE_DIGIT )* )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='0') ) {
                alt3=1;
            }
            else if ( ((LA3_0>='1' && LA3_0<='9')) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:2624:13: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:2624:17: '1' .. '9' ( RULE_DIGIT )*
                    {
                    matchRange('1','9'); 
                    // InternalCurlBetterThanHttpie.g:2624:26: ( RULE_DIGIT )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalCurlBetterThanHttpie.g:2624:26: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
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
            // InternalCurlBetterThanHttpie.g:2626:12: ( ( RULE_INT | ( RULE_INT )? '.' ( RULE_DIGIT )* ( ( 'E' | 'e' ) RULE_INT )? ) )
            // InternalCurlBetterThanHttpie.g:2626:14: ( RULE_INT | ( RULE_INT )? '.' ( RULE_DIGIT )* ( ( 'E' | 'e' ) RULE_INT )? )
            {
            // InternalCurlBetterThanHttpie.g:2626:14: ( RULE_INT | ( RULE_INT )? '.' ( RULE_DIGIT )* ( ( 'E' | 'e' ) RULE_INT )? )
            int alt7=2;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:2626:15: RULE_INT
                    {
                    mRULE_INT(); 

                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:2626:24: ( RULE_INT )? '.' ( RULE_DIGIT )* ( ( 'E' | 'e' ) RULE_INT )?
                    {
                    // InternalCurlBetterThanHttpie.g:2626:24: ( RULE_INT )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalCurlBetterThanHttpie.g:2626:24: RULE_INT
                            {
                            mRULE_INT(); 

                            }
                            break;

                    }

                    match('.'); 
                    // InternalCurlBetterThanHttpie.g:2626:38: ( RULE_DIGIT )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalCurlBetterThanHttpie.g:2626:38: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    // InternalCurlBetterThanHttpie.g:2626:50: ( ( 'E' | 'e' ) RULE_INT )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='E'||LA6_0=='e') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalCurlBetterThanHttpie.g:2626:51: ( 'E' | 'e' ) RULE_INT
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

    // $ANTLR start "RULE_BOOLEAN"
    public final void mRULE_BOOLEAN() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:2628:14: ( ( 'true' | 'false' ) )
            // InternalCurlBetterThanHttpie.g:2628:16: ( 'true' | 'false' )
            {
            // InternalCurlBetterThanHttpie.g:2628:16: ( 'true' | 'false' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='t') ) {
                alt8=1;
            }
            else if ( (LA8_0=='f') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:2628:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:2628:24: 'false'
                    {
                    match("false"); 


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
    // $ANTLR end "RULE_BOOLEAN"

    // $ANTLR start "RULE_NULL"
    public final void mRULE_NULL() throws RecognitionException {
        try {
            int _type = RULE_NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:2630:11: ( 'null' )
            // InternalCurlBetterThanHttpie.g:2630:13: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NULL"

    // $ANTLR start "RULE_NUMBER"
    public final void mRULE_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:2632:13: ( ( '-' )? RULE_INT ( '.' ( RULE_DIGIT )* )? ( ( 'E' | 'e' ) ( '-' )? ( RULE_DIGIT )* )? )
            // InternalCurlBetterThanHttpie.g:2632:15: ( '-' )? RULE_INT ( '.' ( RULE_DIGIT )* )? ( ( 'E' | 'e' ) ( '-' )? ( RULE_DIGIT )* )?
            {
            // InternalCurlBetterThanHttpie.g:2632:15: ( '-' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='-') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:2632:15: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            mRULE_INT(); 
            // InternalCurlBetterThanHttpie.g:2632:29: ( '.' ( RULE_DIGIT )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='.') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:2632:30: '.' ( RULE_DIGIT )*
                    {
                    match('.'); 
                    // InternalCurlBetterThanHttpie.g:2632:34: ( RULE_DIGIT )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalCurlBetterThanHttpie.g:2632:34: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalCurlBetterThanHttpie.g:2632:48: ( ( 'E' | 'e' ) ( '-' )? ( RULE_DIGIT )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='E'||LA14_0=='e') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:2632:49: ( 'E' | 'e' ) ( '-' )? ( RULE_DIGIT )*
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalCurlBetterThanHttpie.g:2632:59: ( '-' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='-') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalCurlBetterThanHttpie.g:2632:59: '-'
                            {
                            match('-'); 

                            }
                            break;

                    }

                    // InternalCurlBetterThanHttpie.g:2632:64: ( RULE_DIGIT )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalCurlBetterThanHttpie.g:2632:64: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
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
    // $ANTLR end "RULE_NUMBER"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:2634:9: ( ( ' ' | '\\t' )+ )
            // InternalCurlBetterThanHttpie.g:2634:11: ( ' ' | '\\t' )+
            {
            // InternalCurlBetterThanHttpie.g:2634:11: ( ' ' | '\\t' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0=='\t'||LA15_0==' ') ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalCurlBetterThanHttpie.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:2636:9: ( RULE_LETTER ( RULE_LETTER | RULE_DIGIT )* )
            // InternalCurlBetterThanHttpie.g:2636:11: RULE_LETTER ( RULE_LETTER | RULE_DIGIT )*
            {
            mRULE_LETTER(); 
            // InternalCurlBetterThanHttpie.g:2636:23: ( RULE_LETTER | RULE_DIGIT )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='0' && LA16_0<='9')||(LA16_0>='A' && LA16_0<='Z')||LA16_0=='_'||(LA16_0>='a' && LA16_0<='z')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalCurlBetterThanHttpie.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    public void mTokens() throws RecognitionException {
        // InternalCurlBetterThanHttpie.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | RULE_HTTP | RULE_URL | RULE_INT | RULE_FLOAT | RULE_BOOLEAN | RULE_NULL | RULE_NUMBER | RULE_WS | RULE_ID )
        int alt17=47;
        alt17 = dfa17.predict(input);
        switch (alt17) {
            case 1 :
                // InternalCurlBetterThanHttpie.g:1:10: T__15
                {
                mT__15(); 

                }
                break;
            case 2 :
                // InternalCurlBetterThanHttpie.g:1:16: T__16
                {
                mT__16(); 

                }
                break;
            case 3 :
                // InternalCurlBetterThanHttpie.g:1:22: T__17
                {
                mT__17(); 

                }
                break;
            case 4 :
                // InternalCurlBetterThanHttpie.g:1:28: T__18
                {
                mT__18(); 

                }
                break;
            case 5 :
                // InternalCurlBetterThanHttpie.g:1:34: T__19
                {
                mT__19(); 

                }
                break;
            case 6 :
                // InternalCurlBetterThanHttpie.g:1:40: T__20
                {
                mT__20(); 

                }
                break;
            case 7 :
                // InternalCurlBetterThanHttpie.g:1:46: T__21
                {
                mT__21(); 

                }
                break;
            case 8 :
                // InternalCurlBetterThanHttpie.g:1:52: T__22
                {
                mT__22(); 

                }
                break;
            case 9 :
                // InternalCurlBetterThanHttpie.g:1:58: T__23
                {
                mT__23(); 

                }
                break;
            case 10 :
                // InternalCurlBetterThanHttpie.g:1:64: T__24
                {
                mT__24(); 

                }
                break;
            case 11 :
                // InternalCurlBetterThanHttpie.g:1:70: T__25
                {
                mT__25(); 

                }
                break;
            case 12 :
                // InternalCurlBetterThanHttpie.g:1:76: T__26
                {
                mT__26(); 

                }
                break;
            case 13 :
                // InternalCurlBetterThanHttpie.g:1:82: T__27
                {
                mT__27(); 

                }
                break;
            case 14 :
                // InternalCurlBetterThanHttpie.g:1:88: T__28
                {
                mT__28(); 

                }
                break;
            case 15 :
                // InternalCurlBetterThanHttpie.g:1:94: T__29
                {
                mT__29(); 

                }
                break;
            case 16 :
                // InternalCurlBetterThanHttpie.g:1:100: T__30
                {
                mT__30(); 

                }
                break;
            case 17 :
                // InternalCurlBetterThanHttpie.g:1:106: T__31
                {
                mT__31(); 

                }
                break;
            case 18 :
                // InternalCurlBetterThanHttpie.g:1:112: T__32
                {
                mT__32(); 

                }
                break;
            case 19 :
                // InternalCurlBetterThanHttpie.g:1:118: T__33
                {
                mT__33(); 

                }
                break;
            case 20 :
                // InternalCurlBetterThanHttpie.g:1:124: T__34
                {
                mT__34(); 

                }
                break;
            case 21 :
                // InternalCurlBetterThanHttpie.g:1:130: T__35
                {
                mT__35(); 

                }
                break;
            case 22 :
                // InternalCurlBetterThanHttpie.g:1:136: T__36
                {
                mT__36(); 

                }
                break;
            case 23 :
                // InternalCurlBetterThanHttpie.g:1:142: T__37
                {
                mT__37(); 

                }
                break;
            case 24 :
                // InternalCurlBetterThanHttpie.g:1:148: T__38
                {
                mT__38(); 

                }
                break;
            case 25 :
                // InternalCurlBetterThanHttpie.g:1:154: T__39
                {
                mT__39(); 

                }
                break;
            case 26 :
                // InternalCurlBetterThanHttpie.g:1:160: T__40
                {
                mT__40(); 

                }
                break;
            case 27 :
                // InternalCurlBetterThanHttpie.g:1:166: T__41
                {
                mT__41(); 

                }
                break;
            case 28 :
                // InternalCurlBetterThanHttpie.g:1:172: T__42
                {
                mT__42(); 

                }
                break;
            case 29 :
                // InternalCurlBetterThanHttpie.g:1:178: T__43
                {
                mT__43(); 

                }
                break;
            case 30 :
                // InternalCurlBetterThanHttpie.g:1:184: T__44
                {
                mT__44(); 

                }
                break;
            case 31 :
                // InternalCurlBetterThanHttpie.g:1:190: T__45
                {
                mT__45(); 

                }
                break;
            case 32 :
                // InternalCurlBetterThanHttpie.g:1:196: T__46
                {
                mT__46(); 

                }
                break;
            case 33 :
                // InternalCurlBetterThanHttpie.g:1:202: T__47
                {
                mT__47(); 

                }
                break;
            case 34 :
                // InternalCurlBetterThanHttpie.g:1:208: T__48
                {
                mT__48(); 

                }
                break;
            case 35 :
                // InternalCurlBetterThanHttpie.g:1:214: T__49
                {
                mT__49(); 

                }
                break;
            case 36 :
                // InternalCurlBetterThanHttpie.g:1:220: T__50
                {
                mT__50(); 

                }
                break;
            case 37 :
                // InternalCurlBetterThanHttpie.g:1:226: T__51
                {
                mT__51(); 

                }
                break;
            case 38 :
                // InternalCurlBetterThanHttpie.g:1:232: T__52
                {
                mT__52(); 

                }
                break;
            case 39 :
                // InternalCurlBetterThanHttpie.g:1:238: RULE_HTTP
                {
                mRULE_HTTP(); 

                }
                break;
            case 40 :
                // InternalCurlBetterThanHttpie.g:1:248: RULE_URL
                {
                mRULE_URL(); 

                }
                break;
            case 41 :
                // InternalCurlBetterThanHttpie.g:1:257: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 42 :
                // InternalCurlBetterThanHttpie.g:1:266: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 43 :
                // InternalCurlBetterThanHttpie.g:1:277: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 44 :
                // InternalCurlBetterThanHttpie.g:1:290: RULE_NULL
                {
                mRULE_NULL(); 

                }
                break;
            case 45 :
                // InternalCurlBetterThanHttpie.g:1:300: RULE_NUMBER
                {
                mRULE_NUMBER(); 

                }
                break;
            case 46 :
                // InternalCurlBetterThanHttpie.g:1:312: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 47 :
                // InternalCurlBetterThanHttpie.g:1:320: RULE_ID
                {
                mRULE_ID(); 

                }
                break;

        }

    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA1_eotS =
        "\12\uffff\1\13\1\uffff";
    static final String DFA1_eofS =
        "\14\uffff";
    static final String DFA1_minS =
        "\1\101\1\56\1\uffff\10\56\1\uffff";
    static final String DFA1_maxS =
        "\2\172\1\uffff\10\172\1\uffff";
    static final String DFA1_acceptS =
        "\2\uffff\1\2\10\uffff\1\1";
    static final String DFA1_specialS =
        "\14\uffff}>";
    static final String[] DFA1_transitionS = {
            "\32\2\4\uffff\1\2\1\uffff\13\2\1\1\16\2",
            "\1\2\1\uffff\12\2\7\uffff\32\2\4\uffff\1\2\1\uffff\16\2\1\3\13\2",
            "",
            "\1\2\1\uffff\12\2\7\uffff\32\2\4\uffff\1\2\1\uffff\2\2\1\4\27\2",
            "\1\2\1\uffff\12\2\7\uffff\32\2\4\uffff\1\2\1\uffff\1\5\31\2",
            "\1\2\1\uffff\12\2\7\uffff\32\2\4\uffff\1\2\1\uffff\13\2\1\6\16\2",
            "\1\2\1\uffff\12\2\7\uffff\32\2\4\uffff\1\2\1\uffff\7\2\1\7\22\2",
            "\1\2\1\uffff\12\2\7\uffff\32\2\4\uffff\1\2\1\uffff\16\2\1\10\13\2",
            "\1\2\1\uffff\12\2\7\uffff\32\2\4\uffff\1\2\1\uffff\22\2\1\11\7\2",
            "\1\2\1\uffff\12\2\7\uffff\32\2\4\uffff\1\2\1\uffff\23\2\1\12\6\2",
            "\1\2\1\uffff\12\2\7\uffff\32\2\4\uffff\1\2\1\uffff\32\2",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "2622:12: ( 'localhost' | RULE_ID '.' RULE_ID )";
        }
    }
    static final String DFA7_eotS =
        "\1\uffff\2\4\2\uffff\1\4";
    static final String DFA7_eofS =
        "\6\uffff";
    static final String DFA7_minS =
        "\3\56\2\uffff\1\56";
    static final String DFA7_maxS =
        "\1\71\1\56\1\71\2\uffff\1\71";
    static final String DFA7_acceptS =
        "\3\uffff\1\2\1\1\1\uffff";
    static final String DFA7_specialS =
        "\6\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\3\1\uffff\1\1\11\2",
            "\1\3",
            "\1\3\1\uffff\12\5",
            "",
            "",
            "\1\3\1\uffff\12\5"
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "2626:14: ( RULE_INT | ( RULE_INT )? '.' ( RULE_DIGIT )* ( ( 'E' | 'e' ) RULE_INT )? )";
        }
    }
    static final String DFA17_eotS =
        "\1\uffff\1\34\2\uffff\1\50\10\uffff\6\52\2\63\1\uffff\3\52\4\uffff\1\101\13\uffff\1\52\1\uffff\1\52\1\uffff\6\52\1\uffff\1\25\1\63\2\52\12\uffff\1\117\1\52\1\121\4\52\1\25\1\46\2\52\3\uffff\1\135\1\uffff\1\52\1\137\1\52\1\141\2\25\1\52\1\144\4\uffff\1\52\1\uffff\1\52\1\uffff\1\25\1\141\3\uffff\1\151\1\52\1\uffff\2\52\1\54";
    static final String DFA17_eofS =
        "\155\uffff";
    static final String DFA17_minS =
        "\1\11\1\57\1\uffff\1\55\1\75\10\uffff\10\56\1\uffff\3\56\4\uffff\1\141\13\uffff\1\56\1\uffff\1\56\1\uffff\6\56\1\uffff\1\60\3\56\1\145\6\uffff\1\145\2\uffff\7\56\2\60\2\56\1\141\1\162\1\uffff\1\56\1\uffff\4\56\2\60\2\56\2\uffff\1\142\1\uffff\1\56\1\uffff\1\56\1\uffff\1\60\1\56\3\uffff\2\56\1\uffff\2\56\1\60";
    static final String DFA17_maxS =
        "\1\175\1\75\1\uffff\1\166\1\75\10\uffff\6\172\2\145\1\uffff\3\172\4\uffff\1\166\13\uffff\1\172\1\uffff\1\172\1\uffff\6\172\1\uffff\2\145\2\172\1\145\6\uffff\1\145\2\uffff\7\172\1\145\1\71\2\172\1\154\1\162\1\uffff\1\172\1\uffff\4\172\2\71\2\172\2\uffff\1\163\1\uffff\1\172\1\uffff\1\172\1\uffff\1\71\1\172\3\uffff\2\172\1\uffff\3\172";
    static final String DFA17_acceptS =
        "\2\uffff\1\3\2\uffff\1\17\1\34\1\35\1\36\1\37\1\40\1\41\1\42\10\uffff\1\52\3\uffff\1\56\1\1\1\33\1\2\1\uffff\1\6\1\10\1\12\1\14\1\21\1\23\1\25\1\30\1\55\1\32\1\16\1\uffff\1\57\1\uffff\1\50\6\uffff\1\51\5\uffff\1\7\1\11\1\13\1\15\1\20\1\22\1\uffff\1\31\1\4\15\uffff\1\43\1\uffff\1\45\10\uffff\1\5\1\24\1\uffff\1\44\1\uffff\1\47\1\uffff\1\53\2\uffff\1\54\1\26\1\27\2\uffff\1\46\3\uffff";
    static final String DFA17_specialS =
        "\155\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\31\26\uffff\1\31\1\uffff\1\6\4\uffff\1\7\4\uffff\1\11\1\3\1\25\1\2\1\23\11\24\1\1\2\uffff\1\4\2\uffff\1\5\3\30\1\17\2\30\1\15\10\30\1\16\12\30\1\13\1\uffff\1\14\1\uffff\1\30\1\uffff\5\30\1\26\1\30\1\20\3\30\1\21\1\30\1\27\5\30\1\22\6\30\1\10\1\uffff\1\12",
            "\1\32\15\uffff\1\33",
            "",
            "\1\35\2\uffff\12\46\47\uffff\1\42\1\37\1\uffff\1\43\1\uffff\1\41\1\uffff\1\44\1\uffff\1\40\11\uffff\1\36\1\uffff\1\45",
            "\1\47",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\54\1\uffff\12\53\7\uffff\4\53\1\51\25\53\4\uffff\1\53\1\uffff\32\53",
            "\1\54\1\uffff\12\53\7\uffff\16\53\1\55\5\53\1\56\5\53\4\uffff\1\53\1\uffff\32\53",
            "\1\54\1\uffff\12\53\7\uffff\4\53\1\57\25\53\4\uffff\1\53\1\uffff\32\53",
            "\1\54\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\23\53\1\60\6\53",
            "\1\54\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\16\53\1\61\13\53",
            "\1\54\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\21\53\1\62\10\53",
            "\1\64\26\uffff\1\46\37\uffff\1\46",
            "\1\64\1\uffff\12\65\13\uffff\1\46\37\uffff\1\46",
            "",
            "\1\54\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\1\66\31\53",
            "\1\54\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\24\53\1\67\5\53",
            "\1\54\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "",
            "",
            "\1\75\1\71\1\uffff\1\76\1\uffff\1\73\1\uffff\1\70\1\uffff\1\72\5\uffff\1\74\3\uffff\1\100\1\uffff\1\77",
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
            "\1\54\1\uffff\12\53\7\uffff\23\53\1\102\6\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\1\54\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\1\54\1\uffff\12\53\7\uffff\22\53\1\103\7\53\4\uffff\1\53\1\uffff\32\53",
            "\1\54\1\uffff\12\53\7\uffff\23\53\1\104\6\53\4\uffff\1\53\1\uffff\32\53",
            "\1\54\1\uffff\12\53\7\uffff\13\53\1\105\16\53\4\uffff\1\53\1\uffff\32\53",
            "\1\54\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\23\53\1\106\6\53",
            "\1\54\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\2\53\1\107\27\53",
            "\1\54\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\24\53\1\110\5\53",
            "",
            "\12\111\13\uffff\1\112\37\uffff\1\112",
            "\1\64\1\uffff\12\65\13\uffff\1\46\37\uffff\1\46",
            "\1\54\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\13\53\1\113\16\53",
            "\1\54\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\13\53\1\114\16\53",
            "\1\115",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\116",
            "",
            "",
            "\1\54\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\54\1\uffff\12\53\7\uffff\23\53\1\120\6\53\4\uffff\1\53\1\uffff\32\53",
            "\1\54\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\54\1\uffff\12\53\7\uffff\4\53\1\122\25\53\4\uffff\1\53\1\uffff\32\53",
            "\1\54\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\17\53\1\123\12\53",
            "\1\54\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\1\124\31\53",
            "\1\54\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\125\25\53",
            "\12\111\13\uffff\1\112\37\uffff\1\112",
            "\1\126\11\127",
            "\1\54\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\22\53\1\130\7\53",
            "\1\54\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\13\53\1\131\16\53",
            "\1\132\12\uffff\1\133",
            "\1\134",
            "",
            "\1\54\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\1\54\1\uffff\12\53\7\uffff\23\53\1\136\6\53\4\uffff\1\53\1\uffff\32\53",
            "\1\54\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\54\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\13\53\1\140\16\53",
            "\1\54\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\46",
            "\12\142",
            "\1\54\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\143\25\53",
            "\1\54\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "\1\146\20\uffff\1\145",
            "",
            "\1\54\1\uffff\12\53\7\uffff\4\53\1\147\25\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\1\54\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\7\53\1\150\22\53",
            "",
            "\12\142",
            "\1\54\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "",
            "\1\54\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\54\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\16\53\1\152\13\53",
            "",
            "\1\54\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\22\53\1\153\7\53",
            "\1\54\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\23\53\1\154\6\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53"
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | RULE_HTTP | RULE_URL | RULE_INT | RULE_FLOAT | RULE_BOOLEAN | RULE_NULL | RULE_NUMBER | RULE_WS | RULE_ID );";
        }
    }
 

}