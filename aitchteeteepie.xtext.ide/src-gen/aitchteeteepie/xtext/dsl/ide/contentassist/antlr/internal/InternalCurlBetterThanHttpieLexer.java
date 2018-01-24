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

    public InternalCurlBetterThanHttpieLexer() {;} 
    public InternalCurlBetterThanHttpieLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalCurlBetterThanHttpieLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalCurlBetterThanHttpie.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:11:7: ( '--timeout' )
            // InternalCurlBetterThanHttpie.g:11:9: '--timeout'
            {
            match("--timeout"); 


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
            // InternalCurlBetterThanHttpie.g:12:7: ( '--header' )
            // InternalCurlBetterThanHttpie.g:12:9: '--header'
            {
            match("--header"); 


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
            // InternalCurlBetterThanHttpie.g:13:7: ( '-t' )
            // InternalCurlBetterThanHttpie.g:13:9: '-t'
            {
            match("-t"); 


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
            // InternalCurlBetterThanHttpie.g:14:7: ( '--body' )
            // InternalCurlBetterThanHttpie.g:14:9: '--body'
            {
            match("--body"); 


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
            // InternalCurlBetterThanHttpie.g:15:7: ( '-b' )
            // InternalCurlBetterThanHttpie.g:15:9: '-b'
            {
            match("-b"); 


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
            // InternalCurlBetterThanHttpie.g:16:7: ( '--json' )
            // InternalCurlBetterThanHttpie.g:16:9: '--json'
            {
            match("--json"); 


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
            // InternalCurlBetterThanHttpie.g:17:7: ( '-j' )
            // InternalCurlBetterThanHttpie.g:17:9: '-j'
            {
            match("-j"); 


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
            // InternalCurlBetterThanHttpie.g:18:7: ( '--form' )
            // InternalCurlBetterThanHttpie.g:18:9: '--form'
            {
            match("--form"); 


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
            // InternalCurlBetterThanHttpie.g:19:7: ( '-f' )
            // InternalCurlBetterThanHttpie.g:19:9: '-f'
            {
            match("-f"); 


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
            // InternalCurlBetterThanHttpie.g:20:7: ( '=' )
            // InternalCurlBetterThanHttpie.g:20:9: '='
            {
            match('='); 

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
            // InternalCurlBetterThanHttpie.g:21:7: ( '--auth' )
            // InternalCurlBetterThanHttpie.g:21:9: '--auth'
            {
            match("--auth"); 


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
            // InternalCurlBetterThanHttpie.g:22:7: ( '-a' )
            // InternalCurlBetterThanHttpie.g:22:9: '-a'
            {
            match("-a"); 


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
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
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
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
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
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
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
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
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
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
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
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:29:7: ( 'http' )
            // InternalCurlBetterThanHttpie.g:29:9: 'http'
            {
            match("http"); 


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
            // InternalCurlBetterThanHttpie.g:30:7: ( '--proxy' )
            // InternalCurlBetterThanHttpie.g:30:9: '--proxy'
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
            // InternalCurlBetterThanHttpie.g:31:7: ( ':' )
            // InternalCurlBetterThanHttpie.g:31:9: ':'
            {
            match(':'); 

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
            // InternalCurlBetterThanHttpie.g:32:7: ( '://' )
            // InternalCurlBetterThanHttpie.g:32:9: '://'
            {
            match("://"); 


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
            // InternalCurlBetterThanHttpie.g:33:7: ( '--version' )
            // InternalCurlBetterThanHttpie.g:33:9: '--version'
            {
            match("--version"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            // InternalCurlBetterThanHttpie.g:1751:21: ( '0' .. '9' )
            // InternalCurlBetterThanHttpie.g:1751:23: '0' .. '9'
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
            // InternalCurlBetterThanHttpie.g:1753:22: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // InternalCurlBetterThanHttpie.g:1753:24: ( 'a' .. 'z' | 'A' .. 'Z' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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

    // $ANTLR start "RULE_SPECIAL_UP"
    public final void mRULE_SPECIAL_UP() throws RecognitionException {
        try {
            // InternalCurlBetterThanHttpie.g:1755:26: ( ( '-' | '.' | '_' | '~' | '/' | '?' | '#' | '[' | ']' | '!' | '$' | '&' | '(' | ')' | '*' | '+' | ',' | '|' | ';' ) )
            // InternalCurlBetterThanHttpie.g:1755:28: ( '-' | '.' | '_' | '~' | '/' | '?' | '#' | '[' | ']' | '!' | '$' | '&' | '(' | ')' | '*' | '+' | ',' | '|' | ';' )
            {
            if ( input.LA(1)=='!'||(input.LA(1)>='#' && input.LA(1)<='$')||input.LA(1)=='&'||(input.LA(1)>='(' && input.LA(1)<='/')||input.LA(1)==';'||input.LA(1)=='?'||input.LA(1)=='['||input.LA(1)==']'||input.LA(1)=='_'||input.LA(1)=='|'||input.LA(1)=='~' ) {
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
    // $ANTLR end "RULE_SPECIAL_UP"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:1757:9: ( ( ' ' | '\\t' )+ )
            // InternalCurlBetterThanHttpie.g:1757:11: ( ' ' | '\\t' )+
            {
            // InternalCurlBetterThanHttpie.g:1757:11: ( ' ' | '\\t' )+
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
            // InternalCurlBetterThanHttpie.g:1759:19: ( ( '0' | '1' .. '9' ( RULE_DIGIT )* ) )
            // InternalCurlBetterThanHttpie.g:1759:21: ( '0' | '1' .. '9' ( RULE_DIGIT )* )
            {
            // InternalCurlBetterThanHttpie.g:1759:21: ( '0' | '1' .. '9' ( RULE_DIGIT )* )
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
                    // InternalCurlBetterThanHttpie.g:1759:22: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:1759:26: '1' .. '9' ( RULE_DIGIT )*
                    {
                    matchRange('1','9'); 
                    // InternalCurlBetterThanHttpie.g:1759:35: ( RULE_DIGIT )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalCurlBetterThanHttpie.g:1759:35: RULE_DIGIT
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
            // InternalCurlBetterThanHttpie.g:1761:12: ( ( RULE_INT | ( RULE_INT )? '.' ( RULE_DIGIT )* ( ( 'E' | 'e' ) RULE_INT )? ) )
            // InternalCurlBetterThanHttpie.g:1761:14: ( RULE_INT | ( RULE_INT )? '.' ( RULE_DIGIT )* ( ( 'E' | 'e' ) RULE_INT )? )
            {
            // InternalCurlBetterThanHttpie.g:1761:14: ( RULE_INT | ( RULE_INT )? '.' ( RULE_DIGIT )* ( ( 'E' | 'e' ) RULE_INT )? )
            int alt7=2;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1761:15: RULE_INT
                    {
                    mRULE_INT(); 

                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:1761:24: ( RULE_INT )? '.' ( RULE_DIGIT )* ( ( 'E' | 'e' ) RULE_INT )?
                    {
                    // InternalCurlBetterThanHttpie.g:1761:24: ( RULE_INT )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalCurlBetterThanHttpie.g:1761:24: RULE_INT
                            {
                            mRULE_INT(); 

                            }
                            break;

                    }

                    match('.'); 
                    // InternalCurlBetterThanHttpie.g:1761:38: ( RULE_DIGIT )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalCurlBetterThanHttpie.g:1761:38: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    // InternalCurlBetterThanHttpie.g:1761:50: ( ( 'E' | 'e' ) RULE_INT )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='E'||LA6_0=='e') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalCurlBetterThanHttpie.g:1761:51: ( 'E' | 'e' ) RULE_INT
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

    // $ANTLR start "RULE_BASIC_STRING"
    public final void mRULE_BASIC_STRING() throws RecognitionException {
        try {
            int _type = RULE_BASIC_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:1763:19: ( ( RULE_DIGIT | RULE_LETTER )+ )
            // InternalCurlBetterThanHttpie.g:1763:21: ( RULE_DIGIT | RULE_LETTER )+
            {
            // InternalCurlBetterThanHttpie.g:1763:21: ( RULE_DIGIT | RULE_LETTER )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')||(LA8_0>='A' && LA8_0<='Z')||(LA8_0>='a' && LA8_0<='z')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCurlBetterThanHttpie.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BASIC_STRING"

    // $ANTLR start "RULE_STRING_UP"
    public final void mRULE_STRING_UP() throws RecognitionException {
        try {
            int _type = RULE_STRING_UP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:1765:16: ( ( RULE_DIGIT | RULE_LETTER | RULE_SPECIAL_UP ) )
            // InternalCurlBetterThanHttpie.g:1765:18: ( RULE_DIGIT | RULE_LETTER | RULE_SPECIAL_UP )
            {
            if ( input.LA(1)=='!'||(input.LA(1)>='#' && input.LA(1)<='$')||input.LA(1)=='&'||(input.LA(1)>='(' && input.LA(1)<='9')||input.LA(1)==';'||input.LA(1)=='?'||(input.LA(1)>='A' && input.LA(1)<='[')||input.LA(1)==']'||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='|'||input.LA(1)=='~' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING_UP"

    public void mTokens() throws RecognitionException {
        // InternalCurlBetterThanHttpie.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | RULE_WS | RULE_FLOAT | RULE_BASIC_STRING | RULE_STRING_UP )
        int alt9=27;
        alt9 = dfa9.predict(input);
        switch (alt9) {
            case 1 :
                // InternalCurlBetterThanHttpie.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalCurlBetterThanHttpie.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalCurlBetterThanHttpie.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalCurlBetterThanHttpie.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalCurlBetterThanHttpie.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalCurlBetterThanHttpie.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalCurlBetterThanHttpie.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalCurlBetterThanHttpie.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalCurlBetterThanHttpie.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalCurlBetterThanHttpie.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalCurlBetterThanHttpie.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalCurlBetterThanHttpie.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalCurlBetterThanHttpie.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalCurlBetterThanHttpie.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // InternalCurlBetterThanHttpie.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // InternalCurlBetterThanHttpie.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // InternalCurlBetterThanHttpie.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // InternalCurlBetterThanHttpie.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // InternalCurlBetterThanHttpie.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // InternalCurlBetterThanHttpie.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // InternalCurlBetterThanHttpie.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // InternalCurlBetterThanHttpie.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // InternalCurlBetterThanHttpie.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // InternalCurlBetterThanHttpie.g:1:148: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 25 :
                // InternalCurlBetterThanHttpie.g:1:156: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 26 :
                // InternalCurlBetterThanHttpie.g:1:167: RULE_BASIC_STRING
                {
                mRULE_BASIC_STRING(); 

                }
                break;
            case 27 :
                // InternalCurlBetterThanHttpie.g:1:185: RULE_STRING_UP
                {
                mRULE_STRING_UP(); 

                }
                break;

        }

    }


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA9 dfa9 = new DFA9(this);
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
            return "1761:14: ( RULE_INT | ( RULE_INT )? '.' ( RULE_DIGIT )* ( ( 'E' | 'e' ) RULE_INT )? )";
        }
    }
    static final String DFA9_eotS =
        "\1\uffff\1\12\1\uffff\1\25\1\27\1\uffff\2\30\14\uffff\1\25\4\uffff\1\30\11\uffff\1\25\2\uffff\1\52\6\uffff";
    static final String DFA9_eofS =
        "\55\uffff";
    static final String DFA9_minS =
        "\1\11\1\55\1\uffff\1\164\1\57\1\uffff\2\60\3\uffff\1\141\10\uffff\1\164\4\uffff\1\60\1\uffff\1\145\5\uffff\1\145\1\uffff\1\160\1\141\1\162\1\60\2\uffff\1\142\3\uffff";
    static final String DFA9_maxS =
        "\1\176\1\166\1\uffff\1\164\1\57\1\uffff\2\172\3\uffff\1\166\10\uffff\1\164\4\uffff\1\172\1\uffff\1\145\5\uffff\1\145\1\uffff\1\160\1\154\1\162\1\172\2\uffff\1\163\3\uffff";
    static final String DFA9_acceptS =
        "\2\uffff\1\12\2\uffff\1\30\2\uffff\1\31\1\32\1\33\1\uffff\1\3\1\5\1\7\1\11\1\14\1\16\1\20\1\22\1\uffff\1\32\1\26\1\25\1\31\1\uffff\1\1\1\uffff\1\4\1\6\1\10\1\13\1\15\1\uffff\1\24\4\uffff\1\2\1\17\1\uffff\1\23\1\21\1\27";
    static final String DFA9_specialS =
        "\55\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\5\26\uffff\1\5\1\12\1\uffff\2\12\1\uffff\1\12\1\uffff\5\12\1\1\1\10\1\12\1\6\11\7\1\4\1\12\1\uffff\1\2\1\uffff\1\12\1\uffff\32\11\1\12\1\uffff\1\12\1\uffff\1\12\1\uffff\7\11\1\3\22\11\1\uffff\1\12\1\uffff\1\12",
            "\1\13\63\uffff\1\20\1\15\1\uffff\1\21\1\uffff\1\17\1\uffff\1\22\1\uffff\1\16\11\uffff\1\14\1\uffff\1\23",
            "",
            "\1\24",
            "\1\26",
            "",
            "\12\25\7\uffff\32\25\6\uffff\32\25",
            "\12\31\7\uffff\32\25\6\uffff\32\25",
            "",
            "",
            "",
            "\1\37\1\34\1\uffff\1\40\1\uffff\1\36\1\uffff\1\33\1\uffff\1\35\5\uffff\1\42\3\uffff\1\32\1\uffff\1\41",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\43",
            "",
            "",
            "",
            "",
            "\12\31\7\uffff\32\25\6\uffff\32\25",
            "",
            "\1\44",
            "",
            "",
            "",
            "",
            "",
            "\1\45",
            "",
            "\1\46",
            "\1\47\12\uffff\1\50",
            "\1\51",
            "\12\25\7\uffff\32\25\6\uffff\32\25",
            "",
            "",
            "\1\53\20\uffff\1\54",
            "",
            "",
            ""
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
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | RULE_WS | RULE_FLOAT | RULE_BASIC_STRING | RULE_STRING_UP );";
        }
    }
 

}