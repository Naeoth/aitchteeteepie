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
    public static final int T__55=55;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=6;
    public static final int RULE_DIGIT=14;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int RULE_URL=7;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=16;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_SEP2=13;
    public static final int RULE_STRING=15;
    public static final int RULE_NULL=11;
    public static final int RULE_HTTP=4;
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
    public static final int RULE_WS=5;
    public static final int RULE_ANY_OTHER=18;
    public static final int RULE_NUMBER=12;
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

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
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
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
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
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
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
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
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
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
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
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
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
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
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
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
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
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
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
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
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
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
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
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
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
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
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
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
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
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
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
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
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
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
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
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
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
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
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
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
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
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
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
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
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
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
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
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
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
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
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
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
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
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
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
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:38:7: ( '\\'' )
            // InternalCurlBetterThanHttpie.g:38:9: '\\''
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
            // InternalCurlBetterThanHttpie.g:39:7: ( '{' )
            // InternalCurlBetterThanHttpie.g:39:9: '{'
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
            // InternalCurlBetterThanHttpie.g:40:7: ( ',' )
            // InternalCurlBetterThanHttpie.g:40:9: ','
            {
            match(','); 

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
            // InternalCurlBetterThanHttpie.g:41:7: ( '}' )
            // InternalCurlBetterThanHttpie.g:41:9: '}'
            {
            match('}'); 

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
            // InternalCurlBetterThanHttpie.g:42:7: ( '[' )
            // InternalCurlBetterThanHttpie.g:42:9: '['
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
            // InternalCurlBetterThanHttpie.g:43:7: ( ']' )
            // InternalCurlBetterThanHttpie.g:43:9: ']'
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

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:44:7: ( 'GET' )
            // InternalCurlBetterThanHttpie.g:44:9: 'GET'
            {
            match("GET"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:45:7: ( 'POST' )
            // InternalCurlBetterThanHttpie.g:45:9: 'POST'
            {
            match("POST"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:46:7: ( 'PUT' )
            // InternalCurlBetterThanHttpie.g:46:9: 'PUT'
            {
            match("PUT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:47:7: ( 'DELETE' )
            // InternalCurlBetterThanHttpie.g:47:9: 'DELETE'
            {
            match("DELETE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "RULE_SEP2"
    public final void mRULE_SEP2() throws RecognitionException {
        try {
            int _type = RULE_SEP2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:2438:11: ( '\"' )
            // InternalCurlBetterThanHttpie.g:2438:13: '\"'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SEP2"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            // InternalCurlBetterThanHttpie.g:2440:21: ( '0' .. '9' )
            // InternalCurlBetterThanHttpie.g:2440:23: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:2442:9: ( ( ' ' | '\\t' )+ )
            // InternalCurlBetterThanHttpie.g:2442:11: ( ' ' | '\\t' )+
            {
            // InternalCurlBetterThanHttpie.g:2442:11: ( ' ' | '\\t' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\t'||LA1_0==' ') ) {
                    alt1=1;
                }


                switch (alt1) {
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

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:2444:10: ( ( '0' | '1' .. '9' ( RULE_DIGIT )* ) )
            // InternalCurlBetterThanHttpie.g:2444:12: ( '0' | '1' .. '9' ( RULE_DIGIT )* )
            {
            // InternalCurlBetterThanHttpie.g:2444:12: ( '0' | '1' .. '9' ( RULE_DIGIT )* )
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
                    // InternalCurlBetterThanHttpie.g:2444:13: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:2444:17: '1' .. '9' ( RULE_DIGIT )*
                    {
                    matchRange('1','9'); 
                    // InternalCurlBetterThanHttpie.g:2444:26: ( RULE_DIGIT )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalCurlBetterThanHttpie.g:2444:26: RULE_DIGIT
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

    // $ANTLR start "RULE_URL"
    public final void mRULE_URL() throws RecognitionException {
        try {
            int _type = RULE_URL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:2446:10: ( ( 'localhost' | RULE_ID '.' RULE_ID ) )
            // InternalCurlBetterThanHttpie.g:2446:12: ( 'localhost' | RULE_ID '.' RULE_ID )
            {
            // InternalCurlBetterThanHttpie.g:2446:12: ( 'localhost' | RULE_ID '.' RULE_ID )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:2446:13: 'localhost'
                    {
                    match("localhost"); 


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:2446:25: RULE_ID '.' RULE_ID
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

    // $ANTLR start "RULE_HTTP"
    public final void mRULE_HTTP() throws RecognitionException {
        try {
            int _type = RULE_HTTP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:2448:11: ( 'http' )
            // InternalCurlBetterThanHttpie.g:2448:13: 'http'
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

    // $ANTLR start "RULE_BOOLEAN"
    public final void mRULE_BOOLEAN() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:2450:14: ( ( 'true' | 'false' ) )
            // InternalCurlBetterThanHttpie.g:2450:16: ( 'true' | 'false' )
            {
            // InternalCurlBetterThanHttpie.g:2450:16: ( 'true' | 'false' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='t') ) {
                alt5=1;
            }
            else if ( (LA5_0=='f') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:2450:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:2450:24: 'false'
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
            // InternalCurlBetterThanHttpie.g:2452:11: ( 'null' )
            // InternalCurlBetterThanHttpie.g:2452:13: 'null'
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

    // $ANTLR start "RULE_FLOAT"
    public final void mRULE_FLOAT() throws RecognitionException {
        try {
            int _type = RULE_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:2454:12: ( ( RULE_INT | ( RULE_INT )? '.' ( RULE_DIGIT )* ( ( 'E' | 'e' ) RULE_INT )? ) )
            // InternalCurlBetterThanHttpie.g:2454:14: ( RULE_INT | ( RULE_INT )? '.' ( RULE_DIGIT )* ( ( 'E' | 'e' ) RULE_INT )? )
            {
            // InternalCurlBetterThanHttpie.g:2454:14: ( RULE_INT | ( RULE_INT )? '.' ( RULE_DIGIT )* ( ( 'E' | 'e' ) RULE_INT )? )
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:2454:15: RULE_INT
                    {
                    mRULE_INT(); 

                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:2454:24: ( RULE_INT )? '.' ( RULE_DIGIT )* ( ( 'E' | 'e' ) RULE_INT )?
                    {
                    // InternalCurlBetterThanHttpie.g:2454:24: ( RULE_INT )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalCurlBetterThanHttpie.g:2454:24: RULE_INT
                            {
                            mRULE_INT(); 

                            }
                            break;

                    }

                    match('.'); 
                    // InternalCurlBetterThanHttpie.g:2454:38: ( RULE_DIGIT )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalCurlBetterThanHttpie.g:2454:38: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    // InternalCurlBetterThanHttpie.g:2454:50: ( ( 'E' | 'e' ) RULE_INT )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='E'||LA8_0=='e') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalCurlBetterThanHttpie.g:2454:51: ( 'E' | 'e' ) RULE_INT
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

    // $ANTLR start "RULE_NUMBER"
    public final void mRULE_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:2456:13: ( ( '-' )? ( RULE_DIGIT )* '.' ( RULE_DIGIT )* ( ( 'E' | 'e' ) ( '-' )? ( RULE_DIGIT )* )? )
            // InternalCurlBetterThanHttpie.g:2456:15: ( '-' )? ( RULE_DIGIT )* '.' ( RULE_DIGIT )* ( ( 'E' | 'e' ) ( '-' )? ( RULE_DIGIT )* )?
            {
            // InternalCurlBetterThanHttpie.g:2456:15: ( '-' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='-') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:2456:15: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // InternalCurlBetterThanHttpie.g:2456:20: ( RULE_DIGIT )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalCurlBetterThanHttpie.g:2456:20: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            match('.'); 
            // InternalCurlBetterThanHttpie.g:2456:36: ( RULE_DIGIT )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalCurlBetterThanHttpie.g:2456:36: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // InternalCurlBetterThanHttpie.g:2456:48: ( ( 'E' | 'e' ) ( '-' )? ( RULE_DIGIT )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='E'||LA15_0=='e') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:2456:49: ( 'E' | 'e' ) ( '-' )? ( RULE_DIGIT )*
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalCurlBetterThanHttpie.g:2456:59: ( '-' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='-') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalCurlBetterThanHttpie.g:2456:59: '-'
                            {
                            match('-'); 

                            }
                            break;

                    }

                    // InternalCurlBetterThanHttpie.g:2456:64: ( RULE_DIGIT )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>='0' && LA14_0<='9')) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalCurlBetterThanHttpie.g:2456:64: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
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

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:2458:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalCurlBetterThanHttpie.g:2458:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalCurlBetterThanHttpie.g:2458:11: ( '^' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='^') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:2458:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalCurlBetterThanHttpie.g:2458:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='0' && LA17_0<='9')||(LA17_0>='A' && LA17_0<='Z')||LA17_0=='_'||(LA17_0>='a' && LA17_0<='z')) ) {
                    alt17=1;
                }


                switch (alt17) {
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
            	    break loop17;
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

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:2460:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalCurlBetterThanHttpie.g:2460:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalCurlBetterThanHttpie.g:2460:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='\"') ) {
                alt20=1;
            }
            else if ( (LA20_0=='\'') ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:2460:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalCurlBetterThanHttpie.g:2460:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop18:
                    do {
                        int alt18=3;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0=='\\') ) {
                            alt18=1;
                        }
                        else if ( ((LA18_0>='\u0000' && LA18_0<='!')||(LA18_0>='#' && LA18_0<='[')||(LA18_0>=']' && LA18_0<='\uFFFF')) ) {
                            alt18=2;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalCurlBetterThanHttpie.g:2460:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalCurlBetterThanHttpie.g:2460:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop18;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:2460:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalCurlBetterThanHttpie.g:2460:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop19:
                    do {
                        int alt19=3;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0=='\\') ) {
                            alt19=1;
                        }
                        else if ( ((LA19_0>='\u0000' && LA19_0<='&')||(LA19_0>='(' && LA19_0<='[')||(LA19_0>=']' && LA19_0<='\uFFFF')) ) {
                            alt19=2;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalCurlBetterThanHttpie.g:2460:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalCurlBetterThanHttpie.g:2460:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop19;
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

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:2462:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalCurlBetterThanHttpie.g:2462:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalCurlBetterThanHttpie.g:2462:24: ( options {greedy=false; } : . )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0=='*') ) {
                    int LA21_1 = input.LA(2);

                    if ( (LA21_1=='/') ) {
                        alt21=2;
                    }
                    else if ( ((LA21_1>='\u0000' && LA21_1<='.')||(LA21_1>='0' && LA21_1<='\uFFFF')) ) {
                        alt21=1;
                    }


                }
                else if ( ((LA21_0>='\u0000' && LA21_0<=')')||(LA21_0>='+' && LA21_0<='\uFFFF')) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalCurlBetterThanHttpie.g:2462:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:2464:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalCurlBetterThanHttpie.g:2464:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalCurlBetterThanHttpie.g:2464:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>='\u0000' && LA22_0<='\t')||(LA22_0>='\u000B' && LA22_0<='\f')||(LA22_0>='\u000E' && LA22_0<='\uFFFF')) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalCurlBetterThanHttpie.g:2464:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            // InternalCurlBetterThanHttpie.g:2464:40: ( ( '\\r' )? '\\n' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0=='\n'||LA24_0=='\r') ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:2464:41: ( '\\r' )? '\\n'
                    {
                    // InternalCurlBetterThanHttpie.g:2464:41: ( '\\r' )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0=='\r') ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalCurlBetterThanHttpie.g:2464:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

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
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:2466:16: ( . )
            // InternalCurlBetterThanHttpie.g:2466:18: .
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
        // InternalCurlBetterThanHttpie.g:1:8: ( T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | RULE_SEP2 | RULE_WS | RULE_INT | RULE_URL | RULE_HTTP | RULE_BOOLEAN | RULE_NULL | RULE_FLOAT | RULE_NUMBER | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_ANY_OTHER )
        int alt25=51;
        alt25 = dfa25.predict(input);
        switch (alt25) {
            case 1 :
                // InternalCurlBetterThanHttpie.g:1:10: T__19
                {
                mT__19(); 

                }
                break;
            case 2 :
                // InternalCurlBetterThanHttpie.g:1:16: T__20
                {
                mT__20(); 

                }
                break;
            case 3 :
                // InternalCurlBetterThanHttpie.g:1:22: T__21
                {
                mT__21(); 

                }
                break;
            case 4 :
                // InternalCurlBetterThanHttpie.g:1:28: T__22
                {
                mT__22(); 

                }
                break;
            case 5 :
                // InternalCurlBetterThanHttpie.g:1:34: T__23
                {
                mT__23(); 

                }
                break;
            case 6 :
                // InternalCurlBetterThanHttpie.g:1:40: T__24
                {
                mT__24(); 

                }
                break;
            case 7 :
                // InternalCurlBetterThanHttpie.g:1:46: T__25
                {
                mT__25(); 

                }
                break;
            case 8 :
                // InternalCurlBetterThanHttpie.g:1:52: T__26
                {
                mT__26(); 

                }
                break;
            case 9 :
                // InternalCurlBetterThanHttpie.g:1:58: T__27
                {
                mT__27(); 

                }
                break;
            case 10 :
                // InternalCurlBetterThanHttpie.g:1:64: T__28
                {
                mT__28(); 

                }
                break;
            case 11 :
                // InternalCurlBetterThanHttpie.g:1:70: T__29
                {
                mT__29(); 

                }
                break;
            case 12 :
                // InternalCurlBetterThanHttpie.g:1:76: T__30
                {
                mT__30(); 

                }
                break;
            case 13 :
                // InternalCurlBetterThanHttpie.g:1:82: T__31
                {
                mT__31(); 

                }
                break;
            case 14 :
                // InternalCurlBetterThanHttpie.g:1:88: T__32
                {
                mT__32(); 

                }
                break;
            case 15 :
                // InternalCurlBetterThanHttpie.g:1:94: T__33
                {
                mT__33(); 

                }
                break;
            case 16 :
                // InternalCurlBetterThanHttpie.g:1:100: T__34
                {
                mT__34(); 

                }
                break;
            case 17 :
                // InternalCurlBetterThanHttpie.g:1:106: T__35
                {
                mT__35(); 

                }
                break;
            case 18 :
                // InternalCurlBetterThanHttpie.g:1:112: T__36
                {
                mT__36(); 

                }
                break;
            case 19 :
                // InternalCurlBetterThanHttpie.g:1:118: T__37
                {
                mT__37(); 

                }
                break;
            case 20 :
                // InternalCurlBetterThanHttpie.g:1:124: T__38
                {
                mT__38(); 

                }
                break;
            case 21 :
                // InternalCurlBetterThanHttpie.g:1:130: T__39
                {
                mT__39(); 

                }
                break;
            case 22 :
                // InternalCurlBetterThanHttpie.g:1:136: T__40
                {
                mT__40(); 

                }
                break;
            case 23 :
                // InternalCurlBetterThanHttpie.g:1:142: T__41
                {
                mT__41(); 

                }
                break;
            case 24 :
                // InternalCurlBetterThanHttpie.g:1:148: T__42
                {
                mT__42(); 

                }
                break;
            case 25 :
                // InternalCurlBetterThanHttpie.g:1:154: T__43
                {
                mT__43(); 

                }
                break;
            case 26 :
                // InternalCurlBetterThanHttpie.g:1:160: T__44
                {
                mT__44(); 

                }
                break;
            case 27 :
                // InternalCurlBetterThanHttpie.g:1:166: T__45
                {
                mT__45(); 

                }
                break;
            case 28 :
                // InternalCurlBetterThanHttpie.g:1:172: T__46
                {
                mT__46(); 

                }
                break;
            case 29 :
                // InternalCurlBetterThanHttpie.g:1:178: T__47
                {
                mT__47(); 

                }
                break;
            case 30 :
                // InternalCurlBetterThanHttpie.g:1:184: T__48
                {
                mT__48(); 

                }
                break;
            case 31 :
                // InternalCurlBetterThanHttpie.g:1:190: T__49
                {
                mT__49(); 

                }
                break;
            case 32 :
                // InternalCurlBetterThanHttpie.g:1:196: T__50
                {
                mT__50(); 

                }
                break;
            case 33 :
                // InternalCurlBetterThanHttpie.g:1:202: T__51
                {
                mT__51(); 

                }
                break;
            case 34 :
                // InternalCurlBetterThanHttpie.g:1:208: T__52
                {
                mT__52(); 

                }
                break;
            case 35 :
                // InternalCurlBetterThanHttpie.g:1:214: T__53
                {
                mT__53(); 

                }
                break;
            case 36 :
                // InternalCurlBetterThanHttpie.g:1:220: T__54
                {
                mT__54(); 

                }
                break;
            case 37 :
                // InternalCurlBetterThanHttpie.g:1:226: T__55
                {
                mT__55(); 

                }
                break;
            case 38 :
                // InternalCurlBetterThanHttpie.g:1:232: RULE_SEP2
                {
                mRULE_SEP2(); 

                }
                break;
            case 39 :
                // InternalCurlBetterThanHttpie.g:1:242: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 40 :
                // InternalCurlBetterThanHttpie.g:1:250: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 41 :
                // InternalCurlBetterThanHttpie.g:1:259: RULE_URL
                {
                mRULE_URL(); 

                }
                break;
            case 42 :
                // InternalCurlBetterThanHttpie.g:1:268: RULE_HTTP
                {
                mRULE_HTTP(); 

                }
                break;
            case 43 :
                // InternalCurlBetterThanHttpie.g:1:278: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 44 :
                // InternalCurlBetterThanHttpie.g:1:291: RULE_NULL
                {
                mRULE_NULL(); 

                }
                break;
            case 45 :
                // InternalCurlBetterThanHttpie.g:1:301: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 46 :
                // InternalCurlBetterThanHttpie.g:1:312: RULE_NUMBER
                {
                mRULE_NUMBER(); 

                }
                break;
            case 47 :
                // InternalCurlBetterThanHttpie.g:1:324: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 48 :
                // InternalCurlBetterThanHttpie.g:1:332: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 49 :
                // InternalCurlBetterThanHttpie.g:1:344: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 50 :
                // InternalCurlBetterThanHttpie.g:1:360: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 51 :
                // InternalCurlBetterThanHttpie.g:1:376: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA25 dfa25 = new DFA25(this);
    static final String DFA4_eotS =
        "\12\uffff\1\13\1\uffff";
    static final String DFA4_eofS =
        "\14\uffff";
    static final String DFA4_minS =
        "\1\101\1\56\1\uffff\10\56\1\uffff";
    static final String DFA4_maxS =
        "\2\172\1\uffff\10\172\1\uffff";
    static final String DFA4_acceptS =
        "\2\uffff\1\2\10\uffff\1\1";
    static final String DFA4_specialS =
        "\14\uffff}>";
    static final String[] DFA4_transitionS = {
            "\32\2\3\uffff\2\2\1\uffff\13\2\1\1\16\2",
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

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "2446:12: ( 'localhost' | RULE_ID '.' RULE_ID )";
        }
    }
    static final String DFA9_eotS =
        "\1\uffff\2\4\2\uffff\1\4";
    static final String DFA9_eofS =
        "\6\uffff";
    static final String DFA9_minS =
        "\3\56\2\uffff\1\56";
    static final String DFA9_maxS =
        "\1\71\1\56\1\71\2\uffff\1\71";
    static final String DFA9_acceptS =
        "\3\uffff\1\2\1\1\1\uffff";
    static final String DFA9_specialS =
        "\6\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\3\1\uffff\1\1\11\2",
            "\1\3",
            "\1\3\1\uffff\12\5",
            "",
            "",
            "\1\3\1\uffff\12\5"
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "2454:14: ( RULE_INT | ( RULE_INT )? '.' ( RULE_DIGIT )* ( ( 'E' | 'e' ) RULE_INT )? )";
        }
    }
    static final String DFA25_eotS =
        "\1\uffff\1\36\1\41\1\33\1\55\1\uffff\1\60\5\uffff\3\70\1\75\1\uffff\2\77\1\70\1\33\5\70\1\112\7\uffff\1\124\23\uffff\2\70\2\uffff\3\70\3\uffff\1\112\1\77\6\70\1\112\1\53\13\uffff\1\142\1\70\1\144\6\70\2\112\3\uffff\1\157\1\uffff\2\70\1\162\1\163\1\70\1\165\1\112\4\uffff\2\70\2\uffff\1\163\3\uffff\1\172\1\70\1\uffff\2\70\1\71";
    static final String DFA25_eofS =
        "\176\uffff";
    static final String DFA25_minS =
        "\1\0\1\57\1\52\1\55\1\75\1\uffff\1\0\5\uffff\3\56\1\0\1\uffff\3\56\1\101\5\56\1\60\7\uffff\1\141\23\uffff\2\56\2\uffff\3\56\3\uffff\1\60\7\56\2\60\1\uffff\1\145\6\uffff\1\145\2\uffff\11\56\2\60\1\141\1\162\1\uffff\1\56\1\uffff\6\56\1\60\2\uffff\1\142\1\uffff\2\56\2\uffff\1\56\3\uffff\2\56\1\uffff\2\56\1\60";
    static final String DFA25_maxS =
        "\1\uffff\1\75\1\57\1\166\1\75\1\uffff\1\uffff\5\uffff\3\172\1\uffff\1\uffff\2\71\7\172\1\145\7\uffff\1\166\23\uffff\2\172\2\uffff\3\172\3\uffff\1\145\1\71\6\172\1\145\1\71\1\uffff\1\145\6\uffff\1\145\2\uffff\11\172\2\71\1\154\1\162\1\uffff\1\172\1\uffff\6\172\1\71\2\uffff\1\163\1\uffff\2\172\2\uffff\1\172\3\uffff\2\172\1\uffff\3\172";
    static final String DFA25_acceptS =
        "\5\uffff\1\17\1\uffff\1\35\1\36\1\37\1\40\1\41\4\uffff\1\47\12\uffff\1\63\1\1\1\33\1\2\1\61\1\62\1\3\1\uffff\1\6\1\10\1\12\1\14\1\21\1\23\1\25\1\30\1\56\1\32\1\16\1\17\1\60\1\34\1\35\1\36\1\37\1\40\1\41\2\uffff\1\57\1\51\3\uffff\1\46\1\47\1\50\12\uffff\1\55\1\uffff\1\7\1\11\1\13\1\15\1\20\1\22\1\uffff\1\31\1\4\15\uffff\1\42\1\uffff\1\44\7\uffff\1\5\1\24\1\uffff\1\43\2\uffff\1\52\1\53\1\uffff\1\54\1\26\1\27\2\uffff\1\45\3\uffff";
    static final String DFA25_specialS =
        "\1\1\5\uffff\1\0\10\uffff\1\2\156\uffff}>";
    static final String[] DFA25_transitionS = {
            "\11\33\1\20\26\33\1\20\1\33\1\17\4\33\1\6\4\33\1\10\1\3\1\32\1\2\1\21\11\22\1\1\2\33\1\4\2\33\1\5\3\31\1\16\2\31\1\14\10\31\1\15\12\31\1\12\1\33\1\13\1\24\1\31\1\33\5\31\1\27\1\31\1\25\3\31\1\23\1\31\1\30\5\31\1\26\6\31\1\7\1\33\1\11\uff82\33",
            "\1\34\15\uffff\1\35",
            "\1\37\4\uffff\1\40",
            "\1\42\1\53\1\uffff\12\53\47\uffff\1\47\1\44\1\uffff\1\50\1\uffff\1\46\1\uffff\1\51\1\uffff\1\45\11\uffff\1\43\1\uffff\1\52",
            "\1\54",
            "",
            "\0\57",
            "",
            "",
            "",
            "",
            "",
            "\1\71\1\uffff\12\67\7\uffff\4\67\1\66\25\67\4\uffff\1\67\1\uffff\32\67",
            "\1\71\1\uffff\12\67\7\uffff\16\67\1\72\5\67\1\73\5\67\4\uffff\1\67\1\uffff\32\67",
            "\1\71\1\uffff\12\67\7\uffff\4\67\1\74\25\67\4\uffff\1\67\1\uffff\32\67",
            "\0\57",
            "",
            "\1\100\1\uffff\12\53",
            "\1\100\1\uffff\12\101",
            "\1\71\1\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\16\67\1\102\13\67",
            "\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\71\1\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\23\67\1\104\6\67",
            "\1\71\1\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\21\67\1\105\10\67",
            "\1\71\1\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\1\106\31\67",
            "\1\71\1\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\24\67\1\107\5\67",
            "\1\71\1\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\110\13\uffff\1\111\37\uffff\1\111",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\120\1\114\1\uffff\1\121\1\uffff\1\116\1\uffff\1\113\1\uffff\1\115\5\uffff\1\117\3\uffff\1\123\1\uffff\1\122",
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
            "",
            "\1\71\1\uffff\12\67\7\uffff\23\67\1\125\6\67\4\uffff\1\67\1\uffff\32\67",
            "\1\71\1\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "",
            "\1\71\1\uffff\12\67\7\uffff\22\67\1\126\7\67\4\uffff\1\67\1\uffff\32\67",
            "\1\71\1\uffff\12\67\7\uffff\23\67\1\127\6\67\4\uffff\1\67\1\uffff\32\67",
            "\1\71\1\uffff\12\67\7\uffff\13\67\1\130\16\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "",
            "",
            "\12\110\13\uffff\1\111\37\uffff\1\111",
            "\1\100\1\uffff\12\101",
            "\1\71\1\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\2\67\1\131\27\67",
            "\1\71\1\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\71\1\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\23\67\1\132\6\67",
            "\1\71\1\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\24\67\1\133\5\67",
            "\1\71\1\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\13\67\1\134\16\67",
            "\1\71\1\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\13\67\1\135\16\67",
            "\12\110\13\uffff\1\111\37\uffff\1\111",
            "\1\136\11\137",
            "",
            "\1\140",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\141",
            "",
            "",
            "\1\71\1\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\71\1\uffff\12\67\7\uffff\23\67\1\143\6\67\4\uffff\1\67\1\uffff\32\67",
            "\1\71\1\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\71\1\uffff\12\67\7\uffff\4\67\1\145\25\67\4\uffff\1\67\1\uffff\32\67",
            "\1\71\1\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\1\146\31\67",
            "\1\71\1\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\17\67\1\147\12\67",
            "\1\71\1\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\4\67\1\150\25\67",
            "\1\71\1\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\22\67\1\151\7\67",
            "\1\71\1\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\13\67\1\152\16\67",
            "\12\53",
            "\12\153",
            "\1\154\12\uffff\1\155",
            "\1\156",
            "",
            "\1\71\1\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\1\71\1\uffff\12\67\7\uffff\23\67\1\160\6\67\4\uffff\1\67\1\uffff\32\67",
            "\1\71\1\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\13\67\1\161\16\67",
            "\1\71\1\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\71\1\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\71\1\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\4\67\1\164\25\67",
            "\1\71\1\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\153",
            "",
            "",
            "\1\167\20\uffff\1\166",
            "",
            "\1\71\1\uffff\12\67\7\uffff\4\67\1\170\25\67\4\uffff\1\67\1\uffff\32\67",
            "\1\71\1\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\7\67\1\171\22\67",
            "",
            "",
            "\1\71\1\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "",
            "",
            "\1\71\1\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\71\1\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\16\67\1\173\13\67",
            "",
            "\1\71\1\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\22\67\1\174\7\67",
            "\1\71\1\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\23\67\1\175\6\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67"
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | RULE_SEP2 | RULE_WS | RULE_INT | RULE_URL | RULE_HTTP | RULE_BOOLEAN | RULE_NULL | RULE_FLOAT | RULE_NUMBER | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA25_6 = input.LA(1);

                        s = -1;
                        if ( ((LA25_6>='\u0000' && LA25_6<='\uFFFF')) ) {s = 47;}

                        else s = 48;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA25_0 = input.LA(1);

                        s = -1;
                        if ( (LA25_0==':') ) {s = 1;}

                        else if ( (LA25_0=='/') ) {s = 2;}

                        else if ( (LA25_0=='-') ) {s = 3;}

                        else if ( (LA25_0=='=') ) {s = 4;}

                        else if ( (LA25_0=='@') ) {s = 5;}

                        else if ( (LA25_0=='\'') ) {s = 6;}

                        else if ( (LA25_0=='{') ) {s = 7;}

                        else if ( (LA25_0==',') ) {s = 8;}

                        else if ( (LA25_0=='}') ) {s = 9;}

                        else if ( (LA25_0=='[') ) {s = 10;}

                        else if ( (LA25_0==']') ) {s = 11;}

                        else if ( (LA25_0=='G') ) {s = 12;}

                        else if ( (LA25_0=='P') ) {s = 13;}

                        else if ( (LA25_0=='D') ) {s = 14;}

                        else if ( (LA25_0=='\"') ) {s = 15;}

                        else if ( (LA25_0=='\t'||LA25_0==' ') ) {s = 16;}

                        else if ( (LA25_0=='0') ) {s = 17;}

                        else if ( ((LA25_0>='1' && LA25_0<='9')) ) {s = 18;}

                        else if ( (LA25_0=='l') ) {s = 19;}

                        else if ( (LA25_0=='^') ) {s = 20;}

                        else if ( (LA25_0=='h') ) {s = 21;}

                        else if ( (LA25_0=='t') ) {s = 22;}

                        else if ( (LA25_0=='f') ) {s = 23;}

                        else if ( (LA25_0=='n') ) {s = 24;}

                        else if ( ((LA25_0>='A' && LA25_0<='C')||(LA25_0>='E' && LA25_0<='F')||(LA25_0>='H' && LA25_0<='O')||(LA25_0>='Q' && LA25_0<='Z')||LA25_0=='_'||(LA25_0>='a' && LA25_0<='e')||LA25_0=='g'||(LA25_0>='i' && LA25_0<='k')||LA25_0=='m'||(LA25_0>='o' && LA25_0<='s')||(LA25_0>='u' && LA25_0<='z')) ) {s = 25;}

                        else if ( (LA25_0=='.') ) {s = 26;}

                        else if ( ((LA25_0>='\u0000' && LA25_0<='\b')||(LA25_0>='\n' && LA25_0<='\u001F')||LA25_0=='!'||(LA25_0>='#' && LA25_0<='&')||(LA25_0>='(' && LA25_0<='+')||(LA25_0>=';' && LA25_0<='<')||(LA25_0>='>' && LA25_0<='?')||LA25_0=='\\'||LA25_0=='`'||LA25_0=='|'||(LA25_0>='~' && LA25_0<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA25_15 = input.LA(1);

                        s = -1;
                        if ( ((LA25_15>='\u0000' && LA25_15<='\uFFFF')) ) {s = 47;}

                        else s = 61;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 25, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}