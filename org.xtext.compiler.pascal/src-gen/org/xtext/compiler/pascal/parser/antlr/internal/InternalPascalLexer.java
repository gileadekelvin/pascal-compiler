package org.xtext.compiler.pascal.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPascalLexer extends Lexer {
    public static final int T__50=50;
    public static final int RULE_LE=24;
    public static final int RULE_GT=26;
    public static final int T__59=59;
    public static final int RULE_DIV=19;
    public static final int RULE_NIL=13;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int RULE_NOT_EQUAL=22;
    public static final int RULE_GE=25;
    public static final int T__51=51;
    public static final int RULE_DOTDOT=12;
    public static final int RULE_OR=16;
    public static final int RULE_STAR=17;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_EQUAL=5;
    public static final int RULE_MOD=20;
    public static final int RULE_ASSIGN=8;
    public static final int RULE_SLASH=18;
    public static final int RULE_LT=23;
    public static final int RULE_INT=33;
    public static final int RULE_ML_COMMENT=34;
    public static final int RULE_FALSE=31;
    public static final int RULE_FUNCTION=29;
    public static final int RULE_STRING=6;
    public static final int RULE_NOT=11;
    public static final int RULE_AND=21;
    public static final int RULE_PROCEDURE=28;
    public static final int RULE_SL_COMMENT=35;
    public static final int RULE_IN=27;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_TRUE=30;
    public static final int RULE_PLUS=9;
    public static final int EOF=-1;
    public static final int RULE_WS=36;
    public static final int RULE_NUM_REAL=15;
    public static final int RULE_ANY_OTHER=37;
    public static final int RULE_MINUS=10;
    public static final int RULE_EXPONENT=32;
    public static final int RULE_NUM_INT=14;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int RULE_VAR=7;

    // delegates
    // delegators

    public InternalPascalLexer() {;} 
    public InternalPascalLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalPascalLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalPascal.g"; }

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:11:7: ( '.' )
            // InternalPascal.g:11:9: '.'
            {
            match('.'); 

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
            // InternalPascal.g:12:7: ( 'program' )
            // InternalPascal.g:12:9: 'program'
            {
            match("program"); 


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
            // InternalPascal.g:13:7: ( '(' )
            // InternalPascal.g:13:9: '('
            {
            match('('); 

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
            // InternalPascal.g:14:7: ( ')' )
            // InternalPascal.g:14:9: ')'
            {
            match(')'); 

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
            // InternalPascal.g:15:7: ( ';' )
            // InternalPascal.g:15:9: ';'
            {
            match(';'); 

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
            // InternalPascal.g:16:7: ( ',' )
            // InternalPascal.g:16:9: ','
            {
            match(','); 

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
            // InternalPascal.g:17:7: ( 'const' )
            // InternalPascal.g:17:9: 'const'
            {
            match("const"); 


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
            // InternalPascal.g:18:7: ( ':' )
            // InternalPascal.g:18:9: ':'
            {
            match(':'); 

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
            // InternalPascal.g:19:7: ( 'begin' )
            // InternalPascal.g:19:9: 'begin'
            {
            match("begin"); 


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
            // InternalPascal.g:20:7: ( 'end' )
            // InternalPascal.g:20:9: 'end'
            {
            match("end"); 


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
            // InternalPascal.g:21:7: ( '@' )
            // InternalPascal.g:21:9: '@'
            {
            match('@'); 

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
            // InternalPascal.g:22:7: ( '[' )
            // InternalPascal.g:22:9: '['
            {
            match('['); 

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
            // InternalPascal.g:23:7: ( ']' )
            // InternalPascal.g:23:9: ']'
            {
            match(']'); 

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
            // InternalPascal.g:24:7: ( '(.' )
            // InternalPascal.g:24:9: '(.'
            {
            match("(."); 


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
            // InternalPascal.g:25:7: ( '.)' )
            // InternalPascal.g:25:9: '.)'
            {
            match(".)"); 


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
            // InternalPascal.g:26:7: ( '^' )
            // InternalPascal.g:26:9: '^'
            {
            match('^'); 

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
            // InternalPascal.g:27:7: ( 'CHAR' )
            // InternalPascal.g:27:9: 'CHAR'
            {
            match("CHAR"); 


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
            // InternalPascal.g:28:7: ( 'boolean' )
            // InternalPascal.g:28:9: 'boolean'
            {
            match("boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:29:7: ( 'integer' )
            // InternalPascal.g:29:9: 'integer'
            {
            match("integer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:30:7: ( 'real' )
            // InternalPascal.g:30:9: 'real'
            {
            match("real"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:31:7: ( 'string' )
            // InternalPascal.g:31:9: 'string'
            {
            match("string"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:32:7: ( 'chr' )
            // InternalPascal.g:32:9: 'chr'
            {
            match("chr"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:33:7: ( 'goto' )
            // InternalPascal.g:33:9: 'goto'
            {
            match("goto"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:34:7: ( 'structured' )
            // InternalPascal.g:34:9: 'structured'
            {
            match("structured"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "RULE_VAR"
    public final void mRULE_VAR() throws RecognitionException {
        try {
            int _type = RULE_VAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:3741:10: ( ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'R' | 'r' ) )
            // InternalPascal.g:3741:12: ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
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
    // $ANTLR end "RULE_VAR"

    // $ANTLR start "RULE_NIL"
    public final void mRULE_NIL() throws RecognitionException {
        try {
            int _type = RULE_NIL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:3743:10: ( ( 'N' | 'n' ) ( 'I' | 'i' ) ( 'L' | 'l' ) )
            // InternalPascal.g:3743:12: ( 'N' | 'n' ) ( 'I' | 'i' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
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
    // $ANTLR end "RULE_NIL"

    // $ANTLR start "RULE_DOTDOT"
    public final void mRULE_DOTDOT() throws RecognitionException {
        try {
            int _type = RULE_DOTDOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:3745:13: ( '..' )
            // InternalPascal.g:3745:15: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOTDOT"

    // $ANTLR start "RULE_NOT"
    public final void mRULE_NOT() throws RecognitionException {
        try {
            int _type = RULE_NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:3747:10: ( ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'T' | 't' ) )
            // InternalPascal.g:3747:12: ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
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
    // $ANTLR end "RULE_NOT"

    // $ANTLR start "RULE_TRUE"
    public final void mRULE_TRUE() throws RecognitionException {
        try {
            int _type = RULE_TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:3749:11: ( ( 'T' | 't' ) ( 'R' | 'r' ) ( 'U' | 'u' ) ( 'e' | 'E' ) )
            // InternalPascal.g:3749:13: ( 'T' | 't' ) ( 'R' | 'r' ) ( 'U' | 'u' ) ( 'e' | 'E' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
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
    // $ANTLR end "RULE_TRUE"

    // $ANTLR start "RULE_FALSE"
    public final void mRULE_FALSE() throws RecognitionException {
        try {
            int _type = RULE_FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:3751:12: ( ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            // InternalPascal.g:3751:14: ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
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
    // $ANTLR end "RULE_FALSE"

    // $ANTLR start "RULE_STAR"
    public final void mRULE_STAR() throws RecognitionException {
        try {
            int _type = RULE_STAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:3753:11: ( '*' )
            // InternalPascal.g:3753:13: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STAR"

    // $ANTLR start "RULE_SLASH"
    public final void mRULE_SLASH() throws RecognitionException {
        try {
            int _type = RULE_SLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:3755:12: ( '/' )
            // InternalPascal.g:3755:14: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SLASH"

    // $ANTLR start "RULE_DIV"
    public final void mRULE_DIV() throws RecognitionException {
        try {
            int _type = RULE_DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:3757:10: ( ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'V' | 'v' ) )
            // InternalPascal.g:3757:12: ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'V' | 'v' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
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
    // $ANTLR end "RULE_DIV"

    // $ANTLR start "RULE_MOD"
    public final void mRULE_MOD() throws RecognitionException {
        try {
            int _type = RULE_MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:3759:10: ( ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'D' | 'd' ) )
            // InternalPascal.g:3759:12: ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
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
    // $ANTLR end "RULE_MOD"

    // $ANTLR start "RULE_PLUS"
    public final void mRULE_PLUS() throws RecognitionException {
        try {
            int _type = RULE_PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:3761:11: ( '+' )
            // InternalPascal.g:3761:13: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PLUS"

    // $ANTLR start "RULE_MINUS"
    public final void mRULE_MINUS() throws RecognitionException {
        try {
            int _type = RULE_MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:3763:12: ( '-' )
            // InternalPascal.g:3763:14: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MINUS"

    // $ANTLR start "RULE_AND"
    public final void mRULE_AND() throws RecognitionException {
        try {
            int _type = RULE_AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:3765:10: ( ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' ) )
            // InternalPascal.g:3765:12: ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
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
    // $ANTLR end "RULE_AND"

    // $ANTLR start "RULE_OR"
    public final void mRULE_OR() throws RecognitionException {
        try {
            int _type = RULE_OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:3767:9: ( ( 'O' | 'o' ) ( 'R' | 'r' ) )
            // InternalPascal.g:3767:11: ( 'O' | 'o' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
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
    // $ANTLR end "RULE_OR"

    // $ANTLR start "RULE_ASSIGN"
    public final void mRULE_ASSIGN() throws RecognitionException {
        try {
            int _type = RULE_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:3769:13: ( ':=' )
            // InternalPascal.g:3769:15: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ASSIGN"

    // $ANTLR start "RULE_NUM_INT"
    public final void mRULE_NUM_INT() throws RecognitionException {
        try {
            int _type = RULE_NUM_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:3771:14: ( ( '0' .. '9' )+ )
            // InternalPascal.g:3771:16: ( '0' .. '9' )+
            {
            // InternalPascal.g:3771:16: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPascal.g:3771:17: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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
    // $ANTLR end "RULE_NUM_INT"

    // $ANTLR start "RULE_NUM_REAL"
    public final void mRULE_NUM_REAL() throws RecognitionException {
        try {
            int _type = RULE_NUM_REAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:3773:15: ( ( '0' .. '9' )+ ( ( '.' ( '0' .. '9' )+ ( RULE_EXPONENT )? )? | RULE_EXPONENT ) )
            // InternalPascal.g:3773:17: ( '0' .. '9' )+ ( ( '.' ( '0' .. '9' )+ ( RULE_EXPONENT )? )? | RULE_EXPONENT )
            {
            // InternalPascal.g:3773:17: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPascal.g:3773:18: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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

            // InternalPascal.g:3773:29: ( ( '.' ( '0' .. '9' )+ ( RULE_EXPONENT )? )? | RULE_EXPONENT )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='e') ) {
                alt6=2;
            }
            else {
                alt6=1;}
            switch (alt6) {
                case 1 :
                    // InternalPascal.g:3773:30: ( '.' ( '0' .. '9' )+ ( RULE_EXPONENT )? )?
                    {
                    // InternalPascal.g:3773:30: ( '.' ( '0' .. '9' )+ ( RULE_EXPONENT )? )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='.') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalPascal.g:3773:31: '.' ( '0' .. '9' )+ ( RULE_EXPONENT )?
                            {
                            match('.'); 
                            // InternalPascal.g:3773:35: ( '0' .. '9' )+
                            int cnt3=0;
                            loop3:
                            do {
                                int alt3=2;
                                int LA3_0 = input.LA(1);

                                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                                    alt3=1;
                                }


                                switch (alt3) {
                            	case 1 :
                            	    // InternalPascal.g:3773:36: '0' .. '9'
                            	    {
                            	    matchRange('0','9'); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt3 >= 1 ) break loop3;
                                        EarlyExitException eee =
                                            new EarlyExitException(3, input);
                                        throw eee;
                                }
                                cnt3++;
                            } while (true);

                            // InternalPascal.g:3773:47: ( RULE_EXPONENT )?
                            int alt4=2;
                            int LA4_0 = input.LA(1);

                            if ( (LA4_0=='e') ) {
                                alt4=1;
                            }
                            switch (alt4) {
                                case 1 :
                                    // InternalPascal.g:3773:47: RULE_EXPONENT
                                    {
                                    mRULE_EXPONENT(); 

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:3773:64: RULE_EXPONENT
                    {
                    mRULE_EXPONENT(); 

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
    // $ANTLR end "RULE_NUM_REAL"

    // $ANTLR start "RULE_EXPONENT"
    public final void mRULE_EXPONENT() throws RecognitionException {
        try {
            // InternalPascal.g:3775:24: ( 'e' ( RULE_PLUS | RULE_MINUS )? ( '0' .. '9' )+ )
            // InternalPascal.g:3775:26: 'e' ( RULE_PLUS | RULE_MINUS )? ( '0' .. '9' )+
            {
            match('e'); 
            // InternalPascal.g:3775:30: ( RULE_PLUS | RULE_MINUS )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='+'||LA7_0=='-') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalPascal.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // InternalPascal.g:3775:54: ( '0' .. '9' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalPascal.g:3775:55: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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

        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXPONENT"

    // $ANTLR start "RULE_EQUAL"
    public final void mRULE_EQUAL() throws RecognitionException {
        try {
            int _type = RULE_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:3777:12: ( '=' )
            // InternalPascal.g:3777:14: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EQUAL"

    // $ANTLR start "RULE_NOT_EQUAL"
    public final void mRULE_NOT_EQUAL() throws RecognitionException {
        try {
            int _type = RULE_NOT_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:3779:16: ( '<>' )
            // InternalPascal.g:3779:18: '<>'
            {
            match("<>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NOT_EQUAL"

    // $ANTLR start "RULE_LT"
    public final void mRULE_LT() throws RecognitionException {
        try {
            int _type = RULE_LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:3781:9: ( '<' )
            // InternalPascal.g:3781:11: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LT"

    // $ANTLR start "RULE_LE"
    public final void mRULE_LE() throws RecognitionException {
        try {
            int _type = RULE_LE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:3783:9: ( '<=' )
            // InternalPascal.g:3783:11: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LE"

    // $ANTLR start "RULE_GE"
    public final void mRULE_GE() throws RecognitionException {
        try {
            int _type = RULE_GE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:3785:9: ( '>=' )
            // InternalPascal.g:3785:11: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_GE"

    // $ANTLR start "RULE_GT"
    public final void mRULE_GT() throws RecognitionException {
        try {
            int _type = RULE_GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:3787:9: ( '>' )
            // InternalPascal.g:3787:11: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_GT"

    // $ANTLR start "RULE_IN"
    public final void mRULE_IN() throws RecognitionException {
        try {
            int _type = RULE_IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:3789:9: ( ( 'I' | 'i' ) ( 'N' | 'n' ) )
            // InternalPascal.g:3789:11: ( 'I' | 'i' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
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
    // $ANTLR end "RULE_IN"

    // $ANTLR start "RULE_PROCEDURE"
    public final void mRULE_PROCEDURE() throws RecognitionException {
        try {
            int _type = RULE_PROCEDURE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:3791:16: ( 'procedure' )
            // InternalPascal.g:3791:18: 'procedure'
            {
            match("procedure"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PROCEDURE"

    // $ANTLR start "RULE_FUNCTION"
    public final void mRULE_FUNCTION() throws RecognitionException {
        try {
            int _type = RULE_FUNCTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:3793:15: ( 'function' )
            // InternalPascal.g:3793:17: 'function'
            {
            match("function"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FUNCTION"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:3795:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalPascal.g:3795:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalPascal.g:3795:11: ( '^' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='^') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalPascal.g:3795:11: '^'
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

            // InternalPascal.g:3795:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')||(LA10_0>='A' && LA10_0<='Z')||LA10_0=='_'||(LA10_0>='a' && LA10_0<='z')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalPascal.g:
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
            	    break loop10;
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

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:3797:10: ( ( '0' .. '9' )+ )
            // InternalPascal.g:3797:12: ( '0' .. '9' )+
            {
            // InternalPascal.g:3797:12: ( '0' .. '9' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalPascal.g:3797:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:3799:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalPascal.g:3799:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalPascal.g:3799:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\"') ) {
                alt14=1;
            }
            else if ( (LA14_0=='\'') ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalPascal.g:3799:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalPascal.g:3799:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop12:
                    do {
                        int alt12=3;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0=='\\') ) {
                            alt12=1;
                        }
                        else if ( ((LA12_0>='\u0000' && LA12_0<='!')||(LA12_0>='#' && LA12_0<='[')||(LA12_0>=']' && LA12_0<='\uFFFF')) ) {
                            alt12=2;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalPascal.g:3799:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPascal.g:3799:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop12;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalPascal.g:3799:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalPascal.g:3799:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop13:
                    do {
                        int alt13=3;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0=='\\') ) {
                            alt13=1;
                        }
                        else if ( ((LA13_0>='\u0000' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='[')||(LA13_0>=']' && LA13_0<='\uFFFF')) ) {
                            alt13=2;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalPascal.g:3799:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPascal.g:3799:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop13;
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
            // InternalPascal.g:3801:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalPascal.g:3801:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalPascal.g:3801:24: ( options {greedy=false; } : . )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0=='*') ) {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1=='/') ) {
                        alt15=2;
                    }
                    else if ( ((LA15_1>='\u0000' && LA15_1<='.')||(LA15_1>='0' && LA15_1<='\uFFFF')) ) {
                        alt15=1;
                    }


                }
                else if ( ((LA15_0>='\u0000' && LA15_0<=')')||(LA15_0>='+' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalPascal.g:3801:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop15;
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
            // InternalPascal.g:3803:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalPascal.g:3803:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalPascal.g:3803:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\u0000' && LA16_0<='\t')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\uFFFF')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalPascal.g:3803:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop16;
                }
            } while (true);

            // InternalPascal.g:3803:40: ( ( '\\r' )? '\\n' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='\n'||LA18_0=='\r') ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalPascal.g:3803:41: ( '\\r' )? '\\n'
                    {
                    // InternalPascal.g:3803:41: ( '\\r' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0=='\r') ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalPascal.g:3803:41: '\\r'
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

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:3805:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalPascal.g:3805:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalPascal.g:3805:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='\t' && LA19_0<='\n')||LA19_0=='\r'||LA19_0==' ') ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalPascal.g:
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
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:3807:16: ( . )
            // InternalPascal.g:3807:18: .
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
        // InternalPascal.g:1:8: ( T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | RULE_VAR | RULE_NIL | RULE_DOTDOT | RULE_NOT | RULE_TRUE | RULE_FALSE | RULE_STAR | RULE_SLASH | RULE_DIV | RULE_MOD | RULE_PLUS | RULE_MINUS | RULE_AND | RULE_OR | RULE_ASSIGN | RULE_NUM_INT | RULE_NUM_REAL | RULE_EQUAL | RULE_NOT_EQUAL | RULE_LT | RULE_LE | RULE_GE | RULE_GT | RULE_IN | RULE_PROCEDURE | RULE_FUNCTION | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt20=57;
        alt20 = dfa20.predict(input);
        switch (alt20) {
            case 1 :
                // InternalPascal.g:1:10: T__38
                {
                mT__38(); 

                }
                break;
            case 2 :
                // InternalPascal.g:1:16: T__39
                {
                mT__39(); 

                }
                break;
            case 3 :
                // InternalPascal.g:1:22: T__40
                {
                mT__40(); 

                }
                break;
            case 4 :
                // InternalPascal.g:1:28: T__41
                {
                mT__41(); 

                }
                break;
            case 5 :
                // InternalPascal.g:1:34: T__42
                {
                mT__42(); 

                }
                break;
            case 6 :
                // InternalPascal.g:1:40: T__43
                {
                mT__43(); 

                }
                break;
            case 7 :
                // InternalPascal.g:1:46: T__44
                {
                mT__44(); 

                }
                break;
            case 8 :
                // InternalPascal.g:1:52: T__45
                {
                mT__45(); 

                }
                break;
            case 9 :
                // InternalPascal.g:1:58: T__46
                {
                mT__46(); 

                }
                break;
            case 10 :
                // InternalPascal.g:1:64: T__47
                {
                mT__47(); 

                }
                break;
            case 11 :
                // InternalPascal.g:1:70: T__48
                {
                mT__48(); 

                }
                break;
            case 12 :
                // InternalPascal.g:1:76: T__49
                {
                mT__49(); 

                }
                break;
            case 13 :
                // InternalPascal.g:1:82: T__50
                {
                mT__50(); 

                }
                break;
            case 14 :
                // InternalPascal.g:1:88: T__51
                {
                mT__51(); 

                }
                break;
            case 15 :
                // InternalPascal.g:1:94: T__52
                {
                mT__52(); 

                }
                break;
            case 16 :
                // InternalPascal.g:1:100: T__53
                {
                mT__53(); 

                }
                break;
            case 17 :
                // InternalPascal.g:1:106: T__54
                {
                mT__54(); 

                }
                break;
            case 18 :
                // InternalPascal.g:1:112: T__55
                {
                mT__55(); 

                }
                break;
            case 19 :
                // InternalPascal.g:1:118: T__56
                {
                mT__56(); 

                }
                break;
            case 20 :
                // InternalPascal.g:1:124: T__57
                {
                mT__57(); 

                }
                break;
            case 21 :
                // InternalPascal.g:1:130: T__58
                {
                mT__58(); 

                }
                break;
            case 22 :
                // InternalPascal.g:1:136: T__59
                {
                mT__59(); 

                }
                break;
            case 23 :
                // InternalPascal.g:1:142: T__60
                {
                mT__60(); 

                }
                break;
            case 24 :
                // InternalPascal.g:1:148: T__61
                {
                mT__61(); 

                }
                break;
            case 25 :
                // InternalPascal.g:1:154: RULE_VAR
                {
                mRULE_VAR(); 

                }
                break;
            case 26 :
                // InternalPascal.g:1:163: RULE_NIL
                {
                mRULE_NIL(); 

                }
                break;
            case 27 :
                // InternalPascal.g:1:172: RULE_DOTDOT
                {
                mRULE_DOTDOT(); 

                }
                break;
            case 28 :
                // InternalPascal.g:1:184: RULE_NOT
                {
                mRULE_NOT(); 

                }
                break;
            case 29 :
                // InternalPascal.g:1:193: RULE_TRUE
                {
                mRULE_TRUE(); 

                }
                break;
            case 30 :
                // InternalPascal.g:1:203: RULE_FALSE
                {
                mRULE_FALSE(); 

                }
                break;
            case 31 :
                // InternalPascal.g:1:214: RULE_STAR
                {
                mRULE_STAR(); 

                }
                break;
            case 32 :
                // InternalPascal.g:1:224: RULE_SLASH
                {
                mRULE_SLASH(); 

                }
                break;
            case 33 :
                // InternalPascal.g:1:235: RULE_DIV
                {
                mRULE_DIV(); 

                }
                break;
            case 34 :
                // InternalPascal.g:1:244: RULE_MOD
                {
                mRULE_MOD(); 

                }
                break;
            case 35 :
                // InternalPascal.g:1:253: RULE_PLUS
                {
                mRULE_PLUS(); 

                }
                break;
            case 36 :
                // InternalPascal.g:1:263: RULE_MINUS
                {
                mRULE_MINUS(); 

                }
                break;
            case 37 :
                // InternalPascal.g:1:274: RULE_AND
                {
                mRULE_AND(); 

                }
                break;
            case 38 :
                // InternalPascal.g:1:283: RULE_OR
                {
                mRULE_OR(); 

                }
                break;
            case 39 :
                // InternalPascal.g:1:291: RULE_ASSIGN
                {
                mRULE_ASSIGN(); 

                }
                break;
            case 40 :
                // InternalPascal.g:1:303: RULE_NUM_INT
                {
                mRULE_NUM_INT(); 

                }
                break;
            case 41 :
                // InternalPascal.g:1:316: RULE_NUM_REAL
                {
                mRULE_NUM_REAL(); 

                }
                break;
            case 42 :
                // InternalPascal.g:1:330: RULE_EQUAL
                {
                mRULE_EQUAL(); 

                }
                break;
            case 43 :
                // InternalPascal.g:1:341: RULE_NOT_EQUAL
                {
                mRULE_NOT_EQUAL(); 

                }
                break;
            case 44 :
                // InternalPascal.g:1:356: RULE_LT
                {
                mRULE_LT(); 

                }
                break;
            case 45 :
                // InternalPascal.g:1:364: RULE_LE
                {
                mRULE_LE(); 

                }
                break;
            case 46 :
                // InternalPascal.g:1:372: RULE_GE
                {
                mRULE_GE(); 

                }
                break;
            case 47 :
                // InternalPascal.g:1:380: RULE_GT
                {
                mRULE_GT(); 

                }
                break;
            case 48 :
                // InternalPascal.g:1:388: RULE_IN
                {
                mRULE_IN(); 

                }
                break;
            case 49 :
                // InternalPascal.g:1:396: RULE_PROCEDURE
                {
                mRULE_PROCEDURE(); 

                }
                break;
            case 50 :
                // InternalPascal.g:1:411: RULE_FUNCTION
                {
                mRULE_FUNCTION(); 

                }
                break;
            case 51 :
                // InternalPascal.g:1:425: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 52 :
                // InternalPascal.g:1:433: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 53 :
                // InternalPascal.g:1:442: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 54 :
                // InternalPascal.g:1:454: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 55 :
                // InternalPascal.g:1:470: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 56 :
                // InternalPascal.g:1:486: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 57 :
                // InternalPascal.g:1:494: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA20 dfa20 = new DFA20(this);
    static final String DFA20_eotS =
        "\1\uffff\1\55\1\57\1\61\3\uffff\1\57\1\70\2\57\3\uffff\1\77\11\57\1\uffff\1\117\2\57\2\uffff\2\57\1\127\1\uffff\1\134\1\136\2\57\1\uffff\2\52\5\uffff\1\57\6\uffff\2\57\2\uffff\3\57\4\uffff\1\57\2\151\11\57\4\uffff\2\57\2\uffff\1\57\1\166\2\uffff\1\127\10\uffff\2\57\1\172\2\57\1\175\2\57\1\uffff\3\57\1\u0084\1\u0085\1\u0086\3\57\1\u008a\1\u008b\1\u008c\1\uffff\3\57\1\uffff\2\57\1\uffff\1\u0092\1\57\1\u0094\2\57\1\u0097\3\uffff\1\u0098\2\57\3\uffff\2\57\1\u009d\1\u009e\1\57\1\uffff\1\57\1\uffff\2\57\2\uffff\1\u00a3\3\57\2\uffff\2\57\1\u00a9\1\57\1\uffff\1\57\1\u00ac\1\57\1\u00ae\1\u00af\1\uffff\2\57\1\uffff\1\57\2\uffff\1\57\1\u00b4\1\u00b5\1\57\2\uffff\1\u00b7\1\uffff";
    static final String DFA20_eofS =
        "\u00b8\uffff";
    static final String DFA20_minS =
        "\1\0\1\51\1\162\1\56\3\uffff\1\150\1\75\1\145\1\156\3\uffff\1\101\1\110\1\116\1\145\1\164\1\157\1\101\1\111\1\122\1\101\1\uffff\1\52\1\111\1\117\2\uffff\1\116\1\122\1\56\1\uffff\2\75\1\116\1\101\1\uffff\2\0\5\uffff\1\157\6\uffff\1\156\1\162\2\uffff\1\147\1\157\1\144\4\uffff\1\101\2\60\1\141\1\162\1\164\1\122\1\114\1\124\1\125\1\114\1\156\4\uffff\1\126\1\104\2\uffff\1\104\1\60\2\uffff\1\56\10\uffff\1\143\1\163\1\60\1\151\1\154\1\60\1\122\1\145\1\uffff\1\154\1\151\1\157\3\60\1\105\1\123\1\143\3\60\1\uffff\1\162\1\145\1\164\1\uffff\1\156\1\145\1\uffff\1\60\1\147\1\60\1\156\1\143\1\60\3\uffff\1\60\1\105\1\164\3\uffff\1\141\1\144\2\60\1\141\1\uffff\1\145\1\uffff\1\147\1\164\2\uffff\1\60\1\151\1\155\1\165\2\uffff\1\156\1\162\1\60\1\165\1\uffff\1\157\1\60\1\162\2\60\1\uffff\1\162\1\156\1\uffff\1\145\2\uffff\1\145\2\60\1\144\2\uffff\1\60\1\uffff";
    static final String DFA20_maxS =
        "\1\uffff\1\56\1\162\1\56\3\uffff\1\157\1\75\1\157\1\156\3\uffff\1\172\1\110\1\156\1\145\1\164\1\157\1\141\1\157\1\162\1\165\1\uffff\1\57\1\151\1\157\2\uffff\1\156\1\162\1\145\1\uffff\1\76\1\75\1\156\1\141\1\uffff\2\uffff\5\uffff\1\157\6\uffff\1\156\1\162\2\uffff\1\147\1\157\1\144\4\uffff\1\101\2\172\1\141\1\162\1\164\1\162\1\154\1\164\1\165\1\154\1\156\4\uffff\1\166\1\144\2\uffff\1\144\1\172\2\uffff\1\145\10\uffff\1\147\1\163\1\172\1\151\1\154\1\172\1\122\1\145\1\uffff\1\154\1\165\1\157\3\172\1\145\1\163\1\143\3\172\1\uffff\1\162\1\145\1\164\1\uffff\1\156\1\145\1\uffff\1\172\1\147\1\172\1\156\1\143\1\172\3\uffff\1\172\1\145\1\164\3\uffff\1\141\1\144\2\172\1\141\1\uffff\1\145\1\uffff\1\147\1\164\2\uffff\1\172\1\151\1\155\1\165\2\uffff\1\156\1\162\1\172\1\165\1\uffff\1\157\1\172\1\162\2\172\1\uffff\1\162\1\156\1\uffff\1\145\2\uffff\1\145\2\172\1\144\2\uffff\1\172\1\uffff";
    static final String DFA20_acceptS =
        "\4\uffff\1\4\1\5\1\6\4\uffff\1\13\1\14\1\15\12\uffff\1\37\3\uffff\1\43\1\44\3\uffff\1\52\4\uffff\1\63\2\uffff\1\70\1\71\1\17\1\33\1\1\1\uffff\1\63\1\16\1\3\1\4\1\5\1\6\2\uffff\1\47\1\10\3\uffff\1\13\1\14\1\15\1\20\14\uffff\1\37\1\66\1\67\1\40\2\uffff\1\43\1\44\2\uffff\1\51\1\50\1\uffff\1\52\1\53\1\55\1\54\1\56\1\57\1\65\1\70\10\uffff\1\60\14\uffff\1\46\3\uffff\1\26\2\uffff\1\12\6\uffff\1\31\1\32\1\34\3\uffff\1\41\1\42\1\45\5\uffff\1\21\1\uffff\1\24\2\uffff\1\27\1\35\4\uffff\1\7\1\11\4\uffff\1\36\5\uffff\1\25\2\uffff\1\2\1\uffff\1\22\1\23\4\uffff\1\62\1\61\1\uffff\1\30";
    static final String DFA20_specialS =
        "\1\1\46\uffff\1\0\1\2\u008f\uffff}>";
    static final String[] DFA20_transitionS = {
            "\11\52\2\51\2\52\1\51\22\52\1\51\1\52\1\47\4\52\1\50\1\3\1\4\1\30\1\34\1\6\1\35\1\1\1\31\12\40\1\10\1\5\1\42\1\41\1\43\1\52\1\13\1\36\1\46\1\17\1\32\1\46\1\45\2\46\1\44\3\46\1\33\1\25\1\37\4\46\1\26\1\46\1\24\4\46\1\14\1\52\1\15\1\16\1\46\1\52\1\36\1\11\1\7\1\32\1\12\1\27\1\23\1\46\1\20\3\46\1\33\1\25\1\37\1\2\1\46\1\21\1\22\1\26\1\46\1\24\4\46\uff85\52",
            "\1\53\4\uffff\1\54",
            "\1\56",
            "\1\60",
            "",
            "",
            "",
            "\1\66\6\uffff\1\65",
            "\1\67",
            "\1\71\11\uffff\1\72",
            "\1\73",
            "",
            "",
            "",
            "\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\100",
            "\1\102\37\uffff\1\101",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106\37\uffff\1\106",
            "\1\107\5\uffff\1\110\31\uffff\1\107\5\uffff\1\110",
            "\1\111\37\uffff\1\111",
            "\1\112\37\uffff\1\112\23\uffff\1\113",
            "",
            "\1\115\4\uffff\1\116",
            "\1\120\37\uffff\1\120",
            "\1\121\37\uffff\1\121",
            "",
            "",
            "\1\124\37\uffff\1\124",
            "\1\125\37\uffff\1\125",
            "\1\126\1\uffff\12\130\53\uffff\1\126",
            "",
            "\1\133\1\132",
            "\1\135",
            "\1\102\37\uffff\1\102",
            "\1\112\37\uffff\1\112",
            "",
            "\0\137",
            "\0\137",
            "",
            "",
            "",
            "",
            "",
            "\1\141",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\142",
            "\1\143",
            "",
            "",
            "\1\144",
            "\1\145",
            "\1\146",
            "",
            "",
            "",
            "",
            "\1\147",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\150\6\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155\37\uffff\1\155",
            "\1\156\37\uffff\1\156",
            "\1\157\37\uffff\1\157",
            "\1\160\37\uffff\1\160",
            "\1\161\37\uffff\1\161",
            "\1\162",
            "",
            "",
            "",
            "",
            "\1\163\37\uffff\1\163",
            "\1\164\37\uffff\1\164",
            "",
            "",
            "\1\165\37\uffff\1\165",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\1\126\1\uffff\12\130\53\uffff\1\126",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\170\3\uffff\1\167",
            "\1\171",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\173",
            "\1\174",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\176",
            "\1\177",
            "",
            "\1\u0080",
            "\1\u0081\13\uffff\1\u0082",
            "\1\u0083",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0087\37\uffff\1\u0087",
            "\1\u0088\37\uffff\1\u0088",
            "\1\u0089",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "",
            "\1\u0090",
            "\1\u0091",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0093",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0095",
            "\1\u0096",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0099\37\uffff\1\u0099",
            "\1\u009a",
            "",
            "",
            "",
            "\1\u009b",
            "\1\u009c",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u009f",
            "",
            "\1\u00a0",
            "",
            "\1\u00a1",
            "\1\u00a2",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "",
            "",
            "\1\u00a7",
            "\1\u00a8",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00aa",
            "",
            "\1\u00ab",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00ad",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u00b0",
            "\1\u00b1",
            "",
            "\1\u00b2",
            "",
            "",
            "\1\u00b3",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00b6",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            ""
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | RULE_VAR | RULE_NIL | RULE_DOTDOT | RULE_NOT | RULE_TRUE | RULE_FALSE | RULE_STAR | RULE_SLASH | RULE_DIV | RULE_MOD | RULE_PLUS | RULE_MINUS | RULE_AND | RULE_OR | RULE_ASSIGN | RULE_NUM_INT | RULE_NUM_REAL | RULE_EQUAL | RULE_NOT_EQUAL | RULE_LT | RULE_LE | RULE_GE | RULE_GT | RULE_IN | RULE_PROCEDURE | RULE_FUNCTION | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA20_39 = input.LA(1);

                        s = -1;
                        if ( ((LA20_39>='\u0000' && LA20_39<='\uFFFF')) ) {s = 95;}

                        else s = 42;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA20_0 = input.LA(1);

                        s = -1;
                        if ( (LA20_0=='.') ) {s = 1;}

                        else if ( (LA20_0=='p') ) {s = 2;}

                        else if ( (LA20_0=='(') ) {s = 3;}

                        else if ( (LA20_0==')') ) {s = 4;}

                        else if ( (LA20_0==';') ) {s = 5;}

                        else if ( (LA20_0==',') ) {s = 6;}

                        else if ( (LA20_0=='c') ) {s = 7;}

                        else if ( (LA20_0==':') ) {s = 8;}

                        else if ( (LA20_0=='b') ) {s = 9;}

                        else if ( (LA20_0=='e') ) {s = 10;}

                        else if ( (LA20_0=='@') ) {s = 11;}

                        else if ( (LA20_0=='[') ) {s = 12;}

                        else if ( (LA20_0==']') ) {s = 13;}

                        else if ( (LA20_0=='^') ) {s = 14;}

                        else if ( (LA20_0=='C') ) {s = 15;}

                        else if ( (LA20_0=='i') ) {s = 16;}

                        else if ( (LA20_0=='r') ) {s = 17;}

                        else if ( (LA20_0=='s') ) {s = 18;}

                        else if ( (LA20_0=='g') ) {s = 19;}

                        else if ( (LA20_0=='V'||LA20_0=='v') ) {s = 20;}

                        else if ( (LA20_0=='N'||LA20_0=='n') ) {s = 21;}

                        else if ( (LA20_0=='T'||LA20_0=='t') ) {s = 22;}

                        else if ( (LA20_0=='f') ) {s = 23;}

                        else if ( (LA20_0=='*') ) {s = 24;}

                        else if ( (LA20_0=='/') ) {s = 25;}

                        else if ( (LA20_0=='D'||LA20_0=='d') ) {s = 26;}

                        else if ( (LA20_0=='M'||LA20_0=='m') ) {s = 27;}

                        else if ( (LA20_0=='+') ) {s = 28;}

                        else if ( (LA20_0=='-') ) {s = 29;}

                        else if ( (LA20_0=='A'||LA20_0=='a') ) {s = 30;}

                        else if ( (LA20_0=='O'||LA20_0=='o') ) {s = 31;}

                        else if ( ((LA20_0>='0' && LA20_0<='9')) ) {s = 32;}

                        else if ( (LA20_0=='=') ) {s = 33;}

                        else if ( (LA20_0=='<') ) {s = 34;}

                        else if ( (LA20_0=='>') ) {s = 35;}

                        else if ( (LA20_0=='I') ) {s = 36;}

                        else if ( (LA20_0=='F') ) {s = 37;}

                        else if ( (LA20_0=='B'||LA20_0=='E'||(LA20_0>='G' && LA20_0<='H')||(LA20_0>='J' && LA20_0<='L')||(LA20_0>='P' && LA20_0<='S')||LA20_0=='U'||(LA20_0>='W' && LA20_0<='Z')||LA20_0=='_'||LA20_0=='h'||(LA20_0>='j' && LA20_0<='l')||LA20_0=='q'||LA20_0=='u'||(LA20_0>='w' && LA20_0<='z')) ) {s = 38;}

                        else if ( (LA20_0=='\"') ) {s = 39;}

                        else if ( (LA20_0=='\'') ) {s = 40;}

                        else if ( ((LA20_0>='\t' && LA20_0<='\n')||LA20_0=='\r'||LA20_0==' ') ) {s = 41;}

                        else if ( ((LA20_0>='\u0000' && LA20_0<='\b')||(LA20_0>='\u000B' && LA20_0<='\f')||(LA20_0>='\u000E' && LA20_0<='\u001F')||LA20_0=='!'||(LA20_0>='#' && LA20_0<='&')||LA20_0=='?'||LA20_0=='\\'||LA20_0=='`'||(LA20_0>='{' && LA20_0<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA20_40 = input.LA(1);

                        s = -1;
                        if ( ((LA20_40>='\u0000' && LA20_40<='\uFFFF')) ) {s = 95;}

                        else s = 42;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 20, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}