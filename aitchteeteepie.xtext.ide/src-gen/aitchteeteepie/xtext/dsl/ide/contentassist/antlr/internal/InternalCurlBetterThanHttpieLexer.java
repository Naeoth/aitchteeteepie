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
    public static final int RULE_BOOLEAN=7;
    public static final int RULE_STRING=5;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=4;
    public static final int RULE_DIGIT=8;
    public static final int RULE_SPECIAL=10;
    public static final int RULE_LETTER=9;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=11;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int RULE_FLOAT=6;
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
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
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
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
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
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
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
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
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
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
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
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
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
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
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
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
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
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
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
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
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
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:22:7: ( '--download' )
            // InternalCurlBetterThanHttpie.g:22:9: '--download'
            {
            match("--download"); 


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
            // InternalCurlBetterThanHttpie.g:23:7: ( '-d' )
            // InternalCurlBetterThanHttpie.g:23:9: '-d'
            {
            match("-d"); 


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
            // InternalCurlBetterThanHttpie.g:24:7: ( '--help' )
            // InternalCurlBetterThanHttpie.g:24:9: '--help'
            {
            match("--help"); 


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
            // InternalCurlBetterThanHttpie.g:25:7: ( '-h' )
            // InternalCurlBetterThanHttpie.g:25:9: '-h'
            {
            match("-h"); 


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
            // InternalCurlBetterThanHttpie.g:26:7: ( '--verbose' )
            // InternalCurlBetterThanHttpie.g:26:9: '--verbose'
            {
            match("--verbose"); 


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
            // InternalCurlBetterThanHttpie.g:27:7: ( '-v' )
            // InternalCurlBetterThanHttpie.g:27:9: '-v'
            {
            match("-v"); 


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
            // InternalCurlBetterThanHttpie.g:28:7: ( 'http' )
            // InternalCurlBetterThanHttpie.g:28:9: 'http'
            {
            match("http"); 


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
            // InternalCurlBetterThanHttpie.g:29:7: ( '--proxy' )
            // InternalCurlBetterThanHttpie.g:29:9: '--proxy'
            {
            match("--proxy"); 


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
            // InternalCurlBetterThanHttpie.g:30:7: ( ':' )
            // InternalCurlBetterThanHttpie.g:30:9: ':'
            {
            match(':'); 

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
            // InternalCurlBetterThanHttpie.g:31:7: ( '--version' )
            // InternalCurlBetterThanHttpie.g:31:9: '--version'
            {
            match("--version"); 


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
            // InternalCurlBetterThanHttpie.g:32:7: ( '--timeout' )
            // InternalCurlBetterThanHttpie.g:32:9: '--timeout'
            {
            match("--timeout"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "RULE_BOOLEAN"
    public final void mRULE_BOOLEAN() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:1592:14: ( ( 'true' | 'false' ) )
            // InternalCurlBetterThanHttpie.g:1592:16: ( 'true' | 'false' )
            {
            // InternalCurlBetterThanHttpie.g:1592:16: ( 'true' | 'false' )
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
                    // InternalCurlBetterThanHttpie.g:1592:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:1592:24: 'false'
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

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            // InternalCurlBetterThanHttpie.g:1594:21: ( '0' .. '9' )
            // InternalCurlBetterThanHttpie.g:1594:23: '0' .. '9'
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
            // InternalCurlBetterThanHttpie.g:1596:22: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // InternalCurlBetterThanHttpie.g:1596:24: ( 'a' .. 'z' | 'A' .. 'Z' )
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

    // $ANTLR start "RULE_SPECIAL"
    public final void mRULE_SPECIAL() throws RecognitionException {
        try {
            // InternalCurlBetterThanHttpie.g:1598:23: ( ( '-' | '.' | '_' | '~' | '/' | '?' | '#' | '[' | ']' | '!' | '$' | '&' | '(' | ')' | '*' | '+' | ',' | '|' | ';' | '%' | ':' | '@' ) )
            // InternalCurlBetterThanHttpie.g:1598:25: ( '-' | '.' | '_' | '~' | '/' | '?' | '#' | '[' | ']' | '!' | '$' | '&' | '(' | ')' | '*' | '+' | ',' | '|' | ';' | '%' | ':' | '@' )
            {
            if ( input.LA(1)=='!'||(input.LA(1)>='#' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='/')||(input.LA(1)>=':' && input.LA(1)<=';')||(input.LA(1)>='?' && input.LA(1)<='@')||input.LA(1)=='['||input.LA(1)==']'||input.LA(1)=='_'||input.LA(1)=='|'||input.LA(1)=='~' ) {
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
    // $ANTLR end "RULE_SPECIAL"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCurlBetterThanHttpie.g:1600:9: ( ( ' ' | '\\t' )+ )
            // InternalCurlBetterThanHttpie.g:1600:11: ( ' ' | '\\t' )+
            {
            // InternalCurlBetterThanHttpie.g:1600:11: ( ' ' | '\\t' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\t'||LA2_0==' ') ) {
                    alt2=1;
                }


                switch (alt2) {
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
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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
            // InternalCurlBetterThanHttpie.g:1602:19: ( ( '0' | '1' .. '9' ( RULE_DIGIT )* ) )
            // InternalCurlBetterThanHttpie.g:1602:21: ( '0' | '1' .. '9' ( RULE_DIGIT )* )
            {
            // InternalCurlBetterThanHttpie.g:1602:21: ( '0' | '1' .. '9' ( RULE_DIGIT )* )
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
                    // InternalCurlBetterThanHttpie.g:1602:22: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:1602:26: '1' .. '9' ( RULE_DIGIT )*
                    {
                    matchRange('1','9'); 
                    // InternalCurlBetterThanHttpie.g:1602:35: ( RULE_DIGIT )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalCurlBetterThanHttpie.g:1602:35: RULE_DIGIT
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
            // InternalCurlBetterThanHttpie.g:1604:12: ( ( RULE_INT | ( RULE_INT )? '.' ( RULE_DIGIT )* ( ( 'E' | 'e' ) RULE_INT )? ) )
            // InternalCurlBetterThanHttpie.g:1604:14: ( RULE_INT | ( RULE_INT )? '.' ( RULE_DIGIT )* ( ( 'E' | 'e' ) RULE_INT )? )
            {
            // InternalCurlBetterThanHttpie.g:1604:14: ( RULE_INT | ( RULE_INT )? '.' ( RULE_DIGIT )* ( ( 'E' | 'e' ) RULE_INT )? )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalCurlBetterThanHttpie.g:1604:15: RULE_INT
                    {
                    mRULE_INT(); 

                    }
                    break;
                case 2 :
                    // InternalCurlBetterThanHttpie.g:1604:24: ( RULE_INT )? '.' ( RULE_DIGIT )* ( ( 'E' | 'e' ) RULE_INT )?
                    {
                    // InternalCurlBetterThanHttpie.g:1604:24: ( RULE_INT )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalCurlBetterThanHttpie.g:1604:24: RULE_INT
                            {
                            mRULE_INT(); 

                            }
                            break;

                    }

                    match('.'); 
                    // InternalCurlBetterThanHttpie.g:1604:38: ( RULE_DIGIT )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalCurlBetterThanHttpie.g:1604:38: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    // InternalCurlBetterThanHttpie.g:1604:50: ( ( 'E' | 'e' ) RULE_INT )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='E'||LA7_0=='e') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalCurlBetterThanHttpie.g:1604:51: ( 'E' | 'e' ) RULE_INT
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
            // InternalCurlBetterThanHttpie.g:1606:13: ( ( RULE_DIGIT | RULE_LETTER | RULE_SPECIAL )+ )
            // InternalCurlBetterThanHttpie.g:1606:15: ( RULE_DIGIT | RULE_LETTER | RULE_SPECIAL )+
            {
            // InternalCurlBetterThanHttpie.g:1606:15: ( RULE_DIGIT | RULE_LETTER | RULE_SPECIAL )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='!'||(LA9_0>='#' && LA9_0<='&')||(LA9_0>='(' && LA9_0<=';')||(LA9_0>='?' && LA9_0<='[')||LA9_0==']'||LA9_0=='_'||(LA9_0>='a' && LA9_0<='z')||LA9_0=='|'||LA9_0=='~') ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalCurlBetterThanHttpie.g:
            	    {
            	    if ( input.LA(1)=='!'||(input.LA(1)>='#' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<=';')||(input.LA(1)>='?' && input.LA(1)<='[')||input.LA(1)==']'||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='|'||input.LA(1)=='~' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    public void mTokens() throws RecognitionException {
        // InternalCurlBetterThanHttpie.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | RULE_BOOLEAN | RULE_WS | RULE_FLOAT | RULE_STRING )
        int alt10=26;
        alt10 = dfa10.predict(input);
        switch (alt10) {
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
                // InternalCurlBetterThanHttpie.g:1:142: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 24 :
                // InternalCurlBetterThanHttpie.g:1:155: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 25 :
                // InternalCurlBetterThanHttpie.g:1:163: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 26 :
                // InternalCurlBetterThanHttpie.g:1:174: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA10 dfa10 = new DFA10(this);
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
            return "1604:14: ( RULE_INT | ( RULE_INT )? '.' ( RULE_DIGIT )* ( ( 'E' | 'e' ) RULE_INT )? )";
        }
    }
    static final String DFA10_eotS =
        "\1\uffff\1\13\1\uffff\1\13\1\26\2\13\1\uffff\3\31\1\uffff\1\13\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\13\1\uffff\2\13\1\uffff\2\31\12\13\10\uffff\3\13\2\31\11\13\1\112\1\113\1\13\1\31\12\13\2\uffff\1\113\1\13\1\131\1\132\1\133\1\134\1\135\6\13\5\uffff\3\13\1\147\1\13\1\151\3\13\1\uffff\1\13\1\uffff\1\13\1\157\1\160\1\161\1\162\4\uffff";
    static final String DFA10_eofS =
        "\163\uffff";
    static final String DFA10_minS =
        "\1\11\1\55\1\uffff\1\164\1\41\1\162\1\141\1\uffff\3\41\1\uffff\1\141\10\41\1\164\1\uffff\1\165\1\154\1\uffff\2\41\1\60\1\145\1\157\1\163\1\157\1\165\1\157\1\145\1\162\1\151\10\uffff\1\160\1\145\1\163\2\41\1\141\1\144\1\157\1\162\1\164\1\167\1\162\1\157\1\155\2\41\1\145\1\41\1\144\1\160\1\171\1\156\1\155\1\150\1\156\1\142\1\170\1\145\2\uffff\1\41\1\145\5\41\1\154\1\157\1\151\1\171\1\157\1\162\5\uffff\1\157\1\163\1\157\1\41\1\165\1\41\1\141\1\145\1\156\1\uffff\1\164\1\uffff\1\144\4\41\4\uffff";
    static final String DFA10_maxS =
        "\1\176\1\166\1\uffff\1\164\1\176\1\162\1\141\1\uffff\3\176\1\uffff\1\166\10\176\1\164\1\uffff\1\165\1\154\1\uffff\2\176\1\71\1\145\1\157\1\163\1\157\1\165\1\157\1\145\1\162\1\151\10\uffff\1\160\1\145\1\163\2\176\1\154\1\144\1\157\1\162\1\164\1\167\1\162\1\157\1\155\2\176\1\145\1\176\1\144\1\160\1\171\1\156\1\155\1\150\1\156\1\163\1\170\1\145\2\uffff\1\176\1\145\5\176\1\154\1\157\1\151\1\171\1\157\1\162\5\uffff\1\157\1\163\1\157\1\176\1\165\1\176\1\141\1\145\1\156\1\uffff\1\164\1\uffff\1\144\4\176\4\uffff";
    static final String DFA10_acceptS =
        "\2\uffff\1\11\4\uffff\1\30\3\uffff\1\32\12\uffff\1\24\2\uffff\1\31\14\uffff\1\2\1\4\1\6\1\10\1\13\1\15\1\17\1\21\34\uffff\1\22\1\27\15\uffff\1\16\1\3\1\5\1\7\1\12\11\uffff\1\23\1\uffff\1\1\5\uffff\1\20\1\25\1\26\1\14";
    static final String DFA10_specialS =
        "\163\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\7\26\uffff\1\7\1\13\1\uffff\4\13\1\uffff\5\13\1\1\1\12\1\13\1\10\11\11\1\4\1\13\1\uffff\1\2\1\uffff\35\13\1\uffff\1\13\1\uffff\1\13\1\uffff\5\13\1\6\1\13\1\3\13\13\1\5\6\13\1\uffff\1\13\1\uffff\1\13",
            "\1\14\63\uffff\1\21\1\16\1\uffff\1\22\1\uffff\1\20\1\uffff\1\23\1\uffff\1\17\11\uffff\1\15\1\uffff\1\24",
            "",
            "\1\25",
            "\1\13\1\uffff\4\13\1\uffff\24\13\3\uffff\35\13\1\uffff\1\13\1\uffff\1\13\1\uffff\32\13\1\uffff\1\13\1\uffff\1\13",
            "\1\27",
            "\1\30",
            "",
            "\1\13\1\uffff\4\13\1\uffff\6\13\1\12\15\13\3\uffff\35\13\1\uffff\1\13\1\uffff\1\13\1\uffff\32\13\1\uffff\1\13\1\uffff\1\13",
            "\1\13\1\uffff\4\13\1\uffff\6\13\1\12\1\13\12\32\2\13\3\uffff\35\13\1\uffff\1\13\1\uffff\1\13\1\uffff\32\13\1\uffff\1\13\1\uffff\1\13",
            "\1\13\1\uffff\4\13\1\uffff\10\13\12\33\2\13\3\uffff\6\13\1\34\26\13\1\uffff\1\13\1\uffff\1\13\1\uffff\4\13\1\34\25\13\1\uffff\1\13\1\uffff\1\13",
            "",
            "\1\41\1\36\1\uffff\1\42\1\uffff\1\40\1\uffff\1\35\1\uffff\1\37\5\uffff\1\44\3\uffff\1\45\1\uffff\1\43",
            "\1\13\1\uffff\4\13\1\uffff\24\13\3\uffff\35\13\1\uffff\1\13\1\uffff\1\13\1\uffff\32\13\1\uffff\1\13\1\uffff\1\13",
            "\1\13\1\uffff\4\13\1\uffff\24\13\3\uffff\35\13\1\uffff\1\13\1\uffff\1\13\1\uffff\32\13\1\uffff\1\13\1\uffff\1\13",
            "\1\13\1\uffff\4\13\1\uffff\24\13\3\uffff\35\13\1\uffff\1\13\1\uffff\1\13\1\uffff\32\13\1\uffff\1\13\1\uffff\1\13",
            "\1\13\1\uffff\4\13\1\uffff\24\13\3\uffff\35\13\1\uffff\1\13\1\uffff\1\13\1\uffff\32\13\1\uffff\1\13\1\uffff\1\13",
            "\1\13\1\uffff\4\13\1\uffff\24\13\3\uffff\35\13\1\uffff\1\13\1\uffff\1\13\1\uffff\32\13\1\uffff\1\13\1\uffff\1\13",
            "\1\13\1\uffff\4\13\1\uffff\24\13\3\uffff\35\13\1\uffff\1\13\1\uffff\1\13\1\uffff\32\13\1\uffff\1\13\1\uffff\1\13",
            "\1\13\1\uffff\4\13\1\uffff\24\13\3\uffff\35\13\1\uffff\1\13\1\uffff\1\13\1\uffff\32\13\1\uffff\1\13\1\uffff\1\13",
            "\1\13\1\uffff\4\13\1\uffff\24\13\3\uffff\35\13\1\uffff\1\13\1\uffff\1\13\1\uffff\32\13\1\uffff\1\13\1\uffff\1\13",
            "\1\56",
            "",
            "\1\57",
            "\1\60",
            "",
            "\1\13\1\uffff\4\13\1\uffff\6\13\1\12\1\13\12\32\2\13\3\uffff\35\13\1\uffff\1\13\1\uffff\1\13\1\uffff\32\13\1\uffff\1\13\1\uffff\1\13",
            "\1\13\1\uffff\4\13\1\uffff\10\13\12\33\2\13\3\uffff\6\13\1\34\26\13\1\uffff\1\13\1\uffff\1\13\1\uffff\4\13\1\34\25\13\1\uffff\1\13\1\uffff\1\13",
            "\1\61\11\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\13\1\uffff\4\13\1\uffff\24\13\3\uffff\35\13\1\uffff\1\13\1\uffff\1\13\1\uffff\32\13\1\uffff\1\13\1\uffff\1\13",
            "\1\13\1\uffff\4\13\1\uffff\10\13\12\77\2\13\3\uffff\35\13\1\uffff\1\13\1\uffff\1\13\1\uffff\32\13\1\uffff\1\13\1\uffff\1\13",
            "\1\100\12\uffff\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\13\1\uffff\4\13\1\uffff\24\13\3\uffff\35\13\1\uffff\1\13\1\uffff\1\13\1\uffff\32\13\1\uffff\1\13\1\uffff\1\13",
            "\1\13\1\uffff\4\13\1\uffff\24\13\3\uffff\35\13\1\uffff\1\13\1\uffff\1\13\1\uffff\32\13\1\uffff\1\13\1\uffff\1\13",
            "\1\114",
            "\1\13\1\uffff\4\13\1\uffff\10\13\12\77\2\13\3\uffff\35\13\1\uffff\1\13\1\uffff\1\13\1\uffff\32\13\1\uffff\1\13\1\uffff\1\13",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124\20\uffff\1\125",
            "\1\126",
            "\1\127",
            "",
            "",
            "\1\13\1\uffff\4\13\1\uffff\24\13\3\uffff\35\13\1\uffff\1\13\1\uffff\1\13\1\uffff\32\13\1\uffff\1\13\1\uffff\1\13",
            "\1\130",
            "\1\13\1\uffff\4\13\1\uffff\24\13\3\uffff\35\13\1\uffff\1\13\1\uffff\1\13\1\uffff\32\13\1\uffff\1\13\1\uffff\1\13",
            "\1\13\1\uffff\4\13\1\uffff\24\13\3\uffff\35\13\1\uffff\1\13\1\uffff\1\13\1\uffff\32\13\1\uffff\1\13\1\uffff\1\13",
            "\1\13\1\uffff\4\13\1\uffff\24\13\3\uffff\35\13\1\uffff\1\13\1\uffff\1\13\1\uffff\32\13\1\uffff\1\13\1\uffff\1\13",
            "\1\13\1\uffff\4\13\1\uffff\24\13\3\uffff\35\13\1\uffff\1\13\1\uffff\1\13\1\uffff\32\13\1\uffff\1\13\1\uffff\1\13",
            "\1\13\1\uffff\4\13\1\uffff\24\13\3\uffff\35\13\1\uffff\1\13\1\uffff\1\13\1\uffff\32\13\1\uffff\1\13\1\uffff\1\13",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "",
            "",
            "",
            "",
            "",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\13\1\uffff\4\13\1\uffff\24\13\3\uffff\35\13\1\uffff\1\13\1\uffff\1\13\1\uffff\32\13\1\uffff\1\13\1\uffff\1\13",
            "\1\150",
            "\1\13\1\uffff\4\13\1\uffff\24\13\3\uffff\35\13\1\uffff\1\13\1\uffff\1\13\1\uffff\32\13\1\uffff\1\13\1\uffff\1\13",
            "\1\152",
            "\1\153",
            "\1\154",
            "",
            "\1\155",
            "",
            "\1\156",
            "\1\13\1\uffff\4\13\1\uffff\24\13\3\uffff\35\13\1\uffff\1\13\1\uffff\1\13\1\uffff\32\13\1\uffff\1\13\1\uffff\1\13",
            "\1\13\1\uffff\4\13\1\uffff\24\13\3\uffff\35\13\1\uffff\1\13\1\uffff\1\13\1\uffff\32\13\1\uffff\1\13\1\uffff\1\13",
            "\1\13\1\uffff\4\13\1\uffff\24\13\3\uffff\35\13\1\uffff\1\13\1\uffff\1\13\1\uffff\32\13\1\uffff\1\13\1\uffff\1\13",
            "\1\13\1\uffff\4\13\1\uffff\24\13\3\uffff\35\13\1\uffff\1\13\1\uffff\1\13\1\uffff\32\13\1\uffff\1\13\1\uffff\1\13",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | RULE_BOOLEAN | RULE_WS | RULE_FLOAT | RULE_STRING );";
        }
    }
 

}