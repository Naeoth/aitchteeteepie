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

    public InternalCurlBetterThanHttpieLexer() {;} 
    public InternalCurlBetterThanHttpieLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalCurlBetterThanHttpieLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalCurlBetterThanHttpie.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
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
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
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
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
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
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
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
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
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
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
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
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
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
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:18:7: ( '-f' )
            // InternalCurlBetterThanHttpie.g:18:9: '-f'
            {
            match("-f"); 


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
            // InternalCurlBetterThanHttpie.g:19:7: ( '=' )
            // InternalCurlBetterThanHttpie.g:19:9: '='
            {
            match('='); 

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
            // InternalCurlBetterThanHttpie.g:20:7: ( '--auth' )
            // InternalCurlBetterThanHttpie.g:20:9: '--auth'
            {
            match("--auth"); 


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
            // InternalCurlBetterThanHttpie.g:21:7: ( '-a' )
            // InternalCurlBetterThanHttpie.g:21:9: '-a'
            {
            match("-a"); 


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
            // InternalCurlBetterThanHttpie.g:22:7: ( ':' )
            // InternalCurlBetterThanHttpie.g:22:9: ':'
            {
            match(':'); 

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
            // InternalCurlBetterThanHttpie.g:23:7: ( '--download' )
            // InternalCurlBetterThanHttpie.g:23:9: '--download'
            {
            match("--download"); 


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
            // InternalCurlBetterThanHttpie.g:24:7: ( '-d' )
            // InternalCurlBetterThanHttpie.g:24:9: '-d'
            {
            match("-d"); 


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
            // InternalCurlBetterThanHttpie.g:25:7: ( '--help' )
            // InternalCurlBetterThanHttpie.g:25:9: '--help'
            {
            match("--help"); 


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
            // InternalCurlBetterThanHttpie.g:26:7: ( '-h' )
            // InternalCurlBetterThanHttpie.g:26:9: '-h'
            {
            match("-h"); 


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
            // InternalCurlBetterThanHttpie.g:27:7: ( '--verbose' )
            // InternalCurlBetterThanHttpie.g:27:9: '--verbose'
            {
            match("--verbose"); 


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
            // InternalCurlBetterThanHttpie.g:28:7: ( '-v' )
            // InternalCurlBetterThanHttpie.g:28:9: '-v'
            {
            match("-v"); 


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
            // InternalCurlBetterThanHttpie.g:29:7: ( 'GET' )
            // InternalCurlBetterThanHttpie.g:29:9: 'GET'
            {
            match("GET"); 


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
            // InternalCurlBetterThanHttpie.g:30:7: ( 'POST' )
            // InternalCurlBetterThanHttpie.g:30:9: 'POST'
            {
            match("POST"); 


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
            // InternalCurlBetterThanHttpie.g:31:7: ( 'PUT' )
            // InternalCurlBetterThanHttpie.g:31:9: 'PUT'
            {
            match("PUT"); 


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
            // InternalCurlBetterThanHttpie.g:32:7: ( 'DELETE' )
            // InternalCurlBetterThanHttpie.g:32:9: 'DELETE'
            {
            match("DELETE"); 


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
            // InternalCurlBetterThanHttpie.g:33:7: ( '://' )
            // InternalCurlBetterThanHttpie.g:33:9: '://'
            {
            match("://"); 


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
            // InternalCurlBetterThanHttpie.g:34:7: ( '/' )
            // InternalCurlBetterThanHttpie.g:34:9: '/'
            {
            match('/'); 

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
            // InternalCurlBetterThanHttpie.g:35:7: ( '--' )
            // InternalCurlBetterThanHttpie.g:35:9: '--'
            {
            match("--"); 


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
            // InternalCurlBetterThanHttpie.g:36:7: ( '--proxy' )
            // InternalCurlBetterThanHttpie.g:36:9: '--proxy'
            {
            match("--proxy"); 


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
            // InternalCurlBetterThanHttpie.g:37:7: ( '@' )
            // InternalCurlBetterThanHttpie.g:37:9: '@'
            {
            match('@'); 

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
            // InternalCurlBetterThanHttpie.g:38:7: ( '--version' )
            // InternalCurlBetterThanHttpie.g:38:9: '--version'
            {
            match("--version"); 


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
            // InternalCurlBetterThanHttpie.g:39:7: ( '--timeout' )
            // InternalCurlBetterThanHttpie.g:39:9: '--timeout'
            {
            match("--timeout"); 


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
            // InternalCurlBetterThanHttpie.g:40:7: ( '==' )
            // InternalCurlBetterThanHttpie.g:40:9: '=='
            {
            match("=="); 


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
            // InternalCurlBetterThanHttpie.g:41:7: ( ':=' )
            // InternalCurlBetterThanHttpie.g:41:9: ':='
            {
            match(":="); 


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
            // InternalCurlBetterThanHttpie.g:42:7: ( '\"' )
            // InternalCurlBetterThanHttpie.g:42:9: '\"'
            {
            match('\"'); 

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
            // InternalCurlBetterThanHttpie.g:43:7: ( '\\'' )
            // InternalCurlBetterThanHttpie.g:43:9: '\\''
            {
            match('\''); 

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
            // InternalCurlBetterThanHttpie.g:44:7: ( '{' )
            // InternalCurlBetterThanHttpie.g:44:9: '{'
            {
            match('{'); 

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
            // InternalCurlBetterThanHttpie.g:45:7: ( '}' )
            // InternalCurlBetterThanHttpie.g:45:9: '}'
            {
            match('}'); 

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
            // InternalCurlBetterThanHttpie.g:46:7: ( ',' )
            // InternalCurlBetterThanHttpie.g:46:9: ','
            {
            match(','); 

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
            // InternalCurlBetterThanHttpie.g:47:7: ( '[' )
            // InternalCurlBetterThanHttpie.g:47:9: '['
            {
            match('['); 

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
            // InternalCurlBetterThanHttpie.g:48:7: ( ']' )
            // InternalCurlBetterThanHttpie.g:48:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            // InternalCurlBetterThanHttpie.g:6455:21: ( '0' .. '9' )
            // InternalCurlBetterThanHttpie.g:6455:23: '0' .. '9'
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
            // InternalCurlBetterThanHttpie.g:6457:22: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) )
            // InternalCurlBetterThanHttpie.g:6457:24: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
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

    // $ANTLR start "RULE_BOOLEAN"
    public final void mRULE_BOOLEAN() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:6459:14: ( ( 'true' | 'false' ) )
            // InternalCurlBetterThanHttpie.g:6459:16: ( 'true' | 'false' )
            {
            // InternalCurlBetterThanHttpie.g:6459:16: ( 'true' | 'false' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='t') ) {
                alt1=1;
            }
            else if ( (LA1_0=='f') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:6459:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:6459:24: 'false'
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
            // InternalCurlBetterThanHttpie.g:6461:11: ( 'null' )
            // InternalCurlBetterThanHttpie.g:6461:13: 'null'
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

    // $ANTLR start "RULE_HTTP"
    public final void mRULE_HTTP() throws RecognitionException {
        try {
            int _type = RULE_HTTP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:6463:11: ( 'http' )
            // InternalCurlBetterThanHttpie.g:6463:13: 'http'
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
            // InternalCurlBetterThanHttpie.g:6465:10: ( ( 'localhost' | RULE_ID '.' RULE_ID ) )
            // InternalCurlBetterThanHttpie.g:6465:12: ( 'localhost' | RULE_ID '.' RULE_ID )
            {
            // InternalCurlBetterThanHttpie.g:6465:12: ( 'localhost' | RULE_ID '.' RULE_ID )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:6465:13: 'localhost'
                    {
                    match("localhost"); 


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:6465:25: RULE_ID '.' RULE_ID
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
            // InternalCurlBetterThanHttpie.g:6467:10: ( ( '0' | '1' .. '9' ( RULE_DIGIT )* ) )
            // InternalCurlBetterThanHttpie.g:6467:12: ( '0' | '1' .. '9' ( RULE_DIGIT )* )
            {
            // InternalCurlBetterThanHttpie.g:6467:12: ( '0' | '1' .. '9' ( RULE_DIGIT )* )
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
                    // InternalCurlBetterThanHttpie.g:6467:13: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:6467:17: '1' .. '9' ( RULE_DIGIT )*
                    {
                    matchRange('1','9'); 
                    // InternalCurlBetterThanHttpie.g:6467:26: ( RULE_DIGIT )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalCurlBetterThanHttpie.g:6467:26: RULE_DIGIT
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
            // InternalCurlBetterThanHttpie.g:6469:12: ( ( '-' )? RULE_INT ( '.' ( RULE_DIGIT )* ( ( 'E' | 'e' ) ( '-' )? RULE_INT )? )? )
            // InternalCurlBetterThanHttpie.g:6469:14: ( '-' )? RULE_INT ( '.' ( RULE_DIGIT )* ( ( 'E' | 'e' ) ( '-' )? RULE_INT )? )?
            {
            // InternalCurlBetterThanHttpie.g:6469:14: ( '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='-') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:6469:14: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            mRULE_INT(); 
            // InternalCurlBetterThanHttpie.g:6469:28: ( '.' ( RULE_DIGIT )* ( ( 'E' | 'e' ) ( '-' )? RULE_INT )? )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='.') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:6469:29: '.' ( RULE_DIGIT )* ( ( 'E' | 'e' ) ( '-' )? RULE_INT )?
                    {
                    match('.'); 
                    // InternalCurlBetterThanHttpie.g:6469:33: ( RULE_DIGIT )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalCurlBetterThanHttpie.g:6469:33: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    // InternalCurlBetterThanHttpie.g:6469:45: ( ( 'E' | 'e' ) ( '-' )? RULE_INT )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='E'||LA8_0=='e') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalCurlBetterThanHttpie.g:6469:46: ( 'E' | 'e' ) ( '-' )? RULE_INT
                            {
                            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            // InternalCurlBetterThanHttpie.g:6469:56: ( '-' )?
                            int alt7=2;
                            int LA7_0 = input.LA(1);

                            if ( (LA7_0=='-') ) {
                                alt7=1;
                            }
                            switch (alt7) {
                                case 1 :
                                    // InternalCurlBetterThanHttpie.g:6469:56: '-'
                                    {
                                    match('-'); 

                                    }
                                    break;

                            }

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

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:6471:9: ( ( ' ' | '\\t' )+ )
            // InternalCurlBetterThanHttpie.g:6471:11: ( ' ' | '\\t' )+
            {
            // InternalCurlBetterThanHttpie.g:6471:11: ( ' ' | '\\t' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='\t'||LA10_0==' ') ) {
                    alt10=1;
                }


                switch (alt10) {
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
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
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
            // InternalCurlBetterThanHttpie.g:6473:9: ( RULE_LETTER ( RULE_LETTER | RULE_DIGIT )* )
            // InternalCurlBetterThanHttpie.g:6473:11: RULE_LETTER ( RULE_LETTER | RULE_DIGIT )*
            {
            mRULE_LETTER(); 
            // InternalCurlBetterThanHttpie.g:6473:23: ( RULE_LETTER | RULE_DIGIT )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')||(LA11_0>='A' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='z')) ) {
                    alt11=1;
                }


                switch (alt11) {
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
            	    break loop11;
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
        // InternalCurlBetterThanHttpie.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | RULE_BOOLEAN | RULE_NULL | RULE_HTTP | RULE_URL | RULE_INT | RULE_FLOAT | RULE_WS | RULE_ID )
        int alt12=46;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalCurlBetterThanHttpie.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // InternalCurlBetterThanHttpie.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // InternalCurlBetterThanHttpie.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // InternalCurlBetterThanHttpie.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // InternalCurlBetterThanHttpie.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // InternalCurlBetterThanHttpie.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // InternalCurlBetterThanHttpie.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // InternalCurlBetterThanHttpie.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // InternalCurlBetterThanHttpie.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // InternalCurlBetterThanHttpie.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // InternalCurlBetterThanHttpie.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // InternalCurlBetterThanHttpie.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // InternalCurlBetterThanHttpie.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // InternalCurlBetterThanHttpie.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // InternalCurlBetterThanHttpie.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // InternalCurlBetterThanHttpie.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // InternalCurlBetterThanHttpie.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // InternalCurlBetterThanHttpie.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // InternalCurlBetterThanHttpie.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // InternalCurlBetterThanHttpie.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // InternalCurlBetterThanHttpie.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // InternalCurlBetterThanHttpie.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // InternalCurlBetterThanHttpie.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // InternalCurlBetterThanHttpie.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // InternalCurlBetterThanHttpie.g:1:154: T__38
                {
                mT__38(); 

                }
                break;
            case 26 :
                // InternalCurlBetterThanHttpie.g:1:160: T__39
                {
                mT__39(); 

                }
                break;
            case 27 :
                // InternalCurlBetterThanHttpie.g:1:166: T__40
                {
                mT__40(); 

                }
                break;
            case 28 :
                // InternalCurlBetterThanHttpie.g:1:172: T__41
                {
                mT__41(); 

                }
                break;
            case 29 :
                // InternalCurlBetterThanHttpie.g:1:178: T__42
                {
                mT__42(); 

                }
                break;
            case 30 :
                // InternalCurlBetterThanHttpie.g:1:184: T__43
                {
                mT__43(); 

                }
                break;
            case 31 :
                // InternalCurlBetterThanHttpie.g:1:190: T__44
                {
                mT__44(); 

                }
                break;
            case 32 :
                // InternalCurlBetterThanHttpie.g:1:196: T__45
                {
                mT__45(); 

                }
                break;
            case 33 :
                // InternalCurlBetterThanHttpie.g:1:202: T__46
                {
                mT__46(); 

                }
                break;
            case 34 :
                // InternalCurlBetterThanHttpie.g:1:208: T__47
                {
                mT__47(); 

                }
                break;
            case 35 :
                // InternalCurlBetterThanHttpie.g:1:214: T__48
                {
                mT__48(); 

                }
                break;
            case 36 :
                // InternalCurlBetterThanHttpie.g:1:220: T__49
                {
                mT__49(); 

                }
                break;
            case 37 :
                // InternalCurlBetterThanHttpie.g:1:226: T__50
                {
                mT__50(); 

                }
                break;
            case 38 :
                // InternalCurlBetterThanHttpie.g:1:232: T__51
                {
                mT__51(); 

                }
                break;
            case 39 :
                // InternalCurlBetterThanHttpie.g:1:238: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 40 :
                // InternalCurlBetterThanHttpie.g:1:251: RULE_NULL
                {
                mRULE_NULL(); 

                }
                break;
            case 41 :
                // InternalCurlBetterThanHttpie.g:1:261: RULE_HTTP
                {
                mRULE_HTTP(); 

                }
                break;
            case 42 :
                // InternalCurlBetterThanHttpie.g:1:271: RULE_URL
                {
                mRULE_URL(); 

                }
                break;
            case 43 :
                // InternalCurlBetterThanHttpie.g:1:280: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 44 :
                // InternalCurlBetterThanHttpie.g:1:289: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 45 :
                // InternalCurlBetterThanHttpie.g:1:300: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 46 :
                // InternalCurlBetterThanHttpie.g:1:308: RULE_ID
                {
                mRULE_ID(); 

                }
                break;

        }

    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA2_eotS =
        "\12\uffff\1\13\1\uffff";
    static final String DFA2_eofS =
        "\14\uffff";
    static final String DFA2_minS =
        "\1\101\1\56\1\uffff\10\56\1\uffff";
    static final String DFA2_maxS =
        "\2\172\1\uffff\10\172\1\uffff";
    static final String DFA2_acceptS =
        "\2\uffff\1\2\10\uffff\1\1";
    static final String DFA2_specialS =
        "\14\uffff}>";
    static final String[] DFA2_transitionS = {
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

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "6465:12: ( 'localhost' | RULE_ID '.' RULE_ID )";
        }
    }
    static final String DFA12_eotS =
        "\2\uffff\1\44\1\47\3\51\11\uffff\6\51\2\64\1\uffff\1\77\16\uffff\1\51\1\uffff\1\51\1\uffff\10\51\1\uffff\1\64\12\uffff\1\113\1\51\1\115\6\51\3\uffff\1\127\1\uffff\1\51\1\131\1\51\1\133\1\134\1\51\4\uffff\1\51\1\uffff\1\131\2\uffff\1\51\2\uffff\1\142\1\51\1\uffff\2\51\1\53";
    static final String DFA12_eofS =
        "\146\uffff";
    static final String DFA12_minS =
        "\1\11\1\55\1\75\1\57\3\56\11\uffff\10\56\1\uffff\1\141\16\uffff\1\56\1\uffff\1\56\1\uffff\10\56\1\uffff\1\56\1\145\5\uffff\1\145\3\uffff\11\56\1\141\1\162\1\uffff\1\56\1\uffff\6\56\2\uffff\1\142\1\uffff\1\56\1\uffff\1\56\2\uffff\1\56\2\uffff\2\56\1\uffff\2\56\1\60";
    static final String DFA12_maxS =
        "\1\175\1\166\2\75\3\172\11\uffff\6\172\1\56\1\71\1\uffff\1\166\16\uffff\1\172\1\uffff\1\172\1\uffff\10\172\1\uffff\1\71\1\145\5\uffff\1\145\3\uffff\11\172\1\154\1\162\1\uffff\1\172\1\uffff\6\172\2\uffff\1\163\1\uffff\1\172\1\uffff\1\172\2\uffff\1\172\2\uffff\2\172\1\uffff\3\172";
    static final String DFA12_acceptS =
        "\7\uffff\1\30\1\33\1\40\1\41\1\42\1\43\1\44\1\45\1\46\10\uffff\1\55\1\uffff\1\2\1\4\1\6\1\10\1\13\1\16\1\20\1\22\1\54\1\36\1\11\1\27\1\37\1\14\1\uffff\1\56\1\uffff\1\52\10\uffff\1\53\2\uffff\1\3\1\5\1\7\1\12\1\15\1\uffff\1\32\1\35\1\31\13\uffff\1\23\1\uffff\1\25\6\uffff\1\1\1\17\1\uffff\1\24\1\uffff\1\47\1\uffff\1\50\1\51\1\uffff\1\21\1\34\2\uffff\1\26\3\uffff";
    static final String DFA12_specialS =
        "\146\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\30\26\uffff\1\30\1\uffff\1\11\4\uffff\1\12\4\uffff\1\15\1\1\1\uffff\1\7\1\26\11\27\1\3\2\uffff\1\2\2\uffff\1\10\3\25\1\6\2\25\1\4\10\25\1\5\12\25\1\16\1\uffff\1\17\1\uffff\1\25\1\uffff\5\25\1\21\1\25\1\23\3\25\1\24\1\25\1\22\5\25\1\20\6\25\1\13\1\uffff\1\14",
            "\1\31\2\uffff\12\42\47\uffff\1\36\1\33\1\uffff\1\37\1\uffff\1\35\1\uffff\1\40\1\uffff\1\34\11\uffff\1\32\1\uffff\1\41",
            "\1\43",
            "\1\45\15\uffff\1\46",
            "\1\53\1\uffff\12\52\7\uffff\4\52\1\50\25\52\4\uffff\1\52\1\uffff\32\52",
            "\1\53\1\uffff\12\52\7\uffff\16\52\1\54\5\52\1\55\5\52\4\uffff\1\52\1\uffff\32\52",
            "\1\53\1\uffff\12\52\7\uffff\4\52\1\56\25\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\53\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\21\52\1\57\10\52",
            "\1\53\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\1\60\31\52",
            "\1\53\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\24\52\1\61\5\52",
            "\1\53\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\23\52\1\62\6\52",
            "\1\53\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\16\52\1\63\13\52",
            "\1\53\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\42",
            "\1\42\1\uffff\12\65",
            "",
            "\1\72\1\67\1\uffff\1\73\1\uffff\1\71\1\uffff\1\66\1\uffff\1\70\5\uffff\1\75\3\uffff\1\76\1\uffff\1\74",
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
            "\1\53\1\uffff\12\52\7\uffff\23\52\1\100\6\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\53\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\53\1\uffff\12\52\7\uffff\22\52\1\101\7\52\4\uffff\1\52\1\uffff\32\52",
            "\1\53\1\uffff\12\52\7\uffff\23\52\1\102\6\52\4\uffff\1\52\1\uffff\32\52",
            "\1\53\1\uffff\12\52\7\uffff\13\52\1\103\16\52\4\uffff\1\52\1\uffff\32\52",
            "\1\53\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\24\52\1\104\5\52",
            "\1\53\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\13\52\1\105\16\52",
            "\1\53\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\13\52\1\106\16\52",
            "\1\53\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\23\52\1\107\6\52",
            "\1\53\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\2\52\1\110\27\52",
            "",
            "\1\42\1\uffff\12\65",
            "\1\111",
            "",
            "",
            "",
            "",
            "",
            "\1\112",
            "",
            "",
            "",
            "\1\53\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\53\1\uffff\12\52\7\uffff\23\52\1\114\6\52\4\uffff\1\52\1\uffff\32\52",
            "\1\53\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\53\1\uffff\12\52\7\uffff\4\52\1\116\25\52\4\uffff\1\52\1\uffff\32\52",
            "\1\53\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\117\25\52",
            "\1\53\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\22\52\1\120\7\52",
            "\1\53\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\13\52\1\121\16\52",
            "\1\53\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\17\52\1\122\12\52",
            "\1\53\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\1\123\31\52",
            "\1\124\12\uffff\1\125",
            "\1\126",
            "",
            "\1\53\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\53\1\uffff\12\52\7\uffff\23\52\1\130\6\52\4\uffff\1\52\1\uffff\32\52",
            "\1\53\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\53\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\132\25\52",
            "\1\53\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\53\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\53\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\13\52\1\135\16\52",
            "",
            "",
            "\1\136\20\uffff\1\137",
            "",
            "\1\53\1\uffff\12\52\7\uffff\4\52\1\140\25\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\53\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\1\53\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\7\52\1\141\22\52",
            "",
            "",
            "\1\53\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\53\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\16\52\1\143\13\52",
            "",
            "\1\53\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\22\52\1\144\7\52",
            "\1\53\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\23\52\1\145\6\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52"
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
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | RULE_BOOLEAN | RULE_NULL | RULE_HTTP | RULE_URL | RULE_INT | RULE_FLOAT | RULE_WS | RULE_ID );";
        }
    }
 

}