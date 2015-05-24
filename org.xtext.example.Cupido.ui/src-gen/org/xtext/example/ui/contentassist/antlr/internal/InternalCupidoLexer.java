package org.xtext.example.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCupidoLexer extends Lexer {
    public static final int RULE_DETACH=27;
    public static final int RULE_LEQ=10;
    public static final int RULE_ID=31;
    public static final int RULE_EXCEPT=16;
    public static final int RULE_COMMIT=23;
    public static final int RULE_CREATE=25;
    public static final int RULE_KEY=20;
    public static final int RULE_ANY_OTHER=38;
    public static final int RULE_PLUS=30;
    public static final int RULE_OR=15;
    public static final int RULE_CREATED=4;
    public static final int RULE_COMMA=22;
    public static final int RULE_AND=14;
    public static final int RULE_LBRACKET=28;
    public static final int RULE_EXPIRED=7;
    public static final int RULE_WHERE=32;
    public static final int RULE_SL_COMMENT=36;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=35;
    public static final int RULE_LT=9;
    public static final int RULE_TO=24;
    public static final int RULE_DISCHARGE=26;
    public static final int RULE_STRING=34;
    public static final int RULE_GEQ=13;
    public static final int RULE_LPAREN=18;
    public static final int RULE_GT=12;
    public static final int RULE_EQ=11;
    public static final int RULE_TIME=21;
    public static final int RULE_INT=33;
    public static final int RULE_RPAREN=19;
    public static final int RULE_DISCHARGED=6;
    public static final int RULE_WS=37;
    public static final int RULE_RBRACKET=29;
    public static final int RULE_DETACHED=5;
    public static final int RULE_VIOLATED=8;
    public static final int RULE_SCHEMA=17;

    // delegates
    // delegators

    public InternalCupidoLexer() {;} 
    public InternalCupidoLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalCupidoLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g"; }

    // $ANTLR start "RULE_SCHEMA"
    public final void mRULE_SCHEMA() throws RecognitionException {
        try {
            int _type = RULE_SCHEMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3487:13: ( 'schema' )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3487:15: 'schema'
            {
            match("schema"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SCHEMA"

    // $ANTLR start "RULE_KEY"
    public final void mRULE_KEY() throws RecognitionException {
        try {
            int _type = RULE_KEY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3489:10: ( 'key' )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3489:12: 'key'
            {
            match("key"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KEY"

    // $ANTLR start "RULE_TIME"
    public final void mRULE_TIME() throws RecognitionException {
        try {
            int _type = RULE_TIME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3491:11: ( 'time' )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3491:13: 'time'
            {
            match("time"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TIME"

    // $ANTLR start "RULE_COMMIT"
    public final void mRULE_COMMIT() throws RecognitionException {
        try {
            int _type = RULE_COMMIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3493:13: ( 'commitment' )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3493:15: 'commitment'
            {
            match("commitment"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMIT"

    // $ANTLR start "RULE_CREATE"
    public final void mRULE_CREATE() throws RecognitionException {
        try {
            int _type = RULE_CREATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3495:13: ( 'create' )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3495:15: 'create'
            {
            match("create"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CREATE"

    // $ANTLR start "RULE_DETACH"
    public final void mRULE_DETACH() throws RecognitionException {
        try {
            int _type = RULE_DETACH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3497:13: ( 'detach' )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3497:15: 'detach'
            {
            match("detach"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DETACH"

    // $ANTLR start "RULE_DISCHARGE"
    public final void mRULE_DISCHARGE() throws RecognitionException {
        try {
            int _type = RULE_DISCHARGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3499:16: ( 'discharge' )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3499:18: 'discharge'
            {
            match("discharge"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DISCHARGE"

    // $ANTLR start "RULE_TO"
    public final void mRULE_TO() throws RecognitionException {
        try {
            int _type = RULE_TO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3501:9: ( 'to' )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3501:11: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TO"

    // $ANTLR start "RULE_EXCEPT"
    public final void mRULE_EXCEPT() throws RecognitionException {
        try {
            int _type = RULE_EXCEPT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3503:13: ( 'except' )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3503:15: 'except'
            {
            match("except"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXCEPT"

    // $ANTLR start "RULE_AND"
    public final void mRULE_AND() throws RecognitionException {
        try {
            int _type = RULE_AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3505:10: ( 'and' )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3505:12: 'and'
            {
            match("and"); 


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
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3507:9: ( 'or' )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3507:11: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OR"

    // $ANTLR start "RULE_WHERE"
    public final void mRULE_WHERE() throws RecognitionException {
        try {
            int _type = RULE_WHERE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3509:12: ( 'where' )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3509:14: 'where'
            {
            match("where"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WHERE"

    // $ANTLR start "RULE_CREATED"
    public final void mRULE_CREATED() throws RecognitionException {
        try {
            int _type = RULE_CREATED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3511:14: ( 'created' )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3511:16: 'created'
            {
            match("created"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CREATED"

    // $ANTLR start "RULE_DETACHED"
    public final void mRULE_DETACHED() throws RecognitionException {
        try {
            int _type = RULE_DETACHED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3513:15: ( 'detached' )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3513:17: 'detached'
            {
            match("detached"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DETACHED"

    // $ANTLR start "RULE_DISCHARGED"
    public final void mRULE_DISCHARGED() throws RecognitionException {
        try {
            int _type = RULE_DISCHARGED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3515:17: ( 'discharged' )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3515:19: 'discharged'
            {
            match("discharged"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DISCHARGED"

    // $ANTLR start "RULE_EXPIRED"
    public final void mRULE_EXPIRED() throws RecognitionException {
        try {
            int _type = RULE_EXPIRED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3517:14: ( 'expired' )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3517:16: 'expired'
            {
            match("expired"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXPIRED"

    // $ANTLR start "RULE_VIOLATED"
    public final void mRULE_VIOLATED() throws RecognitionException {
        try {
            int _type = RULE_VIOLATED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3519:15: ( 'violated' )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3519:17: 'violated'
            {
            match("violated"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VIOLATED"

    // $ANTLR start "RULE_COMMA"
    public final void mRULE_COMMA() throws RecognitionException {
        try {
            int _type = RULE_COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3521:12: ( ',' )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3521:14: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMA"

    // $ANTLR start "RULE_LBRACKET"
    public final void mRULE_LBRACKET() throws RecognitionException {
        try {
            int _type = RULE_LBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3523:15: ( '[' )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3523:17: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LBRACKET"

    // $ANTLR start "RULE_RBRACKET"
    public final void mRULE_RBRACKET() throws RecognitionException {
        try {
            int _type = RULE_RBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3525:15: ( ']' )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3525:17: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RBRACKET"

    // $ANTLR start "RULE_LPAREN"
    public final void mRULE_LPAREN() throws RecognitionException {
        try {
            int _type = RULE_LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3527:13: ( '(' )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3527:15: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LPAREN"

    // $ANTLR start "RULE_RPAREN"
    public final void mRULE_RPAREN() throws RecognitionException {
        try {
            int _type = RULE_RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3529:13: ( ')' )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3529:15: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RPAREN"

    // $ANTLR start "RULE_PLUS"
    public final void mRULE_PLUS() throws RecognitionException {
        try {
            int _type = RULE_PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3531:11: ( '+' )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3531:13: '+'
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

    // $ANTLR start "RULE_LT"
    public final void mRULE_LT() throws RecognitionException {
        try {
            int _type = RULE_LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3533:9: ( '<' )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3533:11: '<'
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

    // $ANTLR start "RULE_LEQ"
    public final void mRULE_LEQ() throws RecognitionException {
        try {
            int _type = RULE_LEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3535:10: ( '<=' )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3535:12: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LEQ"

    // $ANTLR start "RULE_EQ"
    public final void mRULE_EQ() throws RecognitionException {
        try {
            int _type = RULE_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3537:9: ( '=' )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3537:11: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EQ"

    // $ANTLR start "RULE_GT"
    public final void mRULE_GT() throws RecognitionException {
        try {
            int _type = RULE_GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3539:9: ( '>' )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3539:11: '>'
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

    // $ANTLR start "RULE_GEQ"
    public final void mRULE_GEQ() throws RecognitionException {
        try {
            int _type = RULE_GEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3541:10: ( '>=' )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3541:12: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_GEQ"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3543:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3543:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3543:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3543:11: '^'
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

            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3543:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:
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
            	    break loop2;
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
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3545:10: ( ( '0' .. '9' )+ )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3545:12: ( '0' .. '9' )+
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3545:12: ( '0' .. '9' )+
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
            	    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3545:13: '0' .. '9'
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
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3547:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3547:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3547:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3547:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3547:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3547:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3547:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3547:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3547:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3547:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3547:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop5;
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
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3549:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3549:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3549:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3549:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
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
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3551:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3551:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3551:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3551:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop8;
                }
            } while (true);

            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3551:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3551:41: ( '\\r' )? '\\n'
                    {
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3551:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3551:41: '\\r'
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
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3553:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3553:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3553:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:
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
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3555:16: ( . )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3555:18: .
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
        // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1:8: ( RULE_SCHEMA | RULE_KEY | RULE_TIME | RULE_COMMIT | RULE_CREATE | RULE_DETACH | RULE_DISCHARGE | RULE_TO | RULE_EXCEPT | RULE_AND | RULE_OR | RULE_WHERE | RULE_CREATED | RULE_DETACHED | RULE_DISCHARGED | RULE_EXPIRED | RULE_VIOLATED | RULE_COMMA | RULE_LBRACKET | RULE_RBRACKET | RULE_LPAREN | RULE_RPAREN | RULE_PLUS | RULE_LT | RULE_LEQ | RULE_EQ | RULE_GT | RULE_GEQ | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=35;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1:10: RULE_SCHEMA
                {
                mRULE_SCHEMA(); 

                }
                break;
            case 2 :
                // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1:22: RULE_KEY
                {
                mRULE_KEY(); 

                }
                break;
            case 3 :
                // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1:31: RULE_TIME
                {
                mRULE_TIME(); 

                }
                break;
            case 4 :
                // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1:41: RULE_COMMIT
                {
                mRULE_COMMIT(); 

                }
                break;
            case 5 :
                // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1:53: RULE_CREATE
                {
                mRULE_CREATE(); 

                }
                break;
            case 6 :
                // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1:65: RULE_DETACH
                {
                mRULE_DETACH(); 

                }
                break;
            case 7 :
                // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1:77: RULE_DISCHARGE
                {
                mRULE_DISCHARGE(); 

                }
                break;
            case 8 :
                // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1:92: RULE_TO
                {
                mRULE_TO(); 

                }
                break;
            case 9 :
                // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1:100: RULE_EXCEPT
                {
                mRULE_EXCEPT(); 

                }
                break;
            case 10 :
                // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1:112: RULE_AND
                {
                mRULE_AND(); 

                }
                break;
            case 11 :
                // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1:121: RULE_OR
                {
                mRULE_OR(); 

                }
                break;
            case 12 :
                // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1:129: RULE_WHERE
                {
                mRULE_WHERE(); 

                }
                break;
            case 13 :
                // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1:140: RULE_CREATED
                {
                mRULE_CREATED(); 

                }
                break;
            case 14 :
                // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1:153: RULE_DETACHED
                {
                mRULE_DETACHED(); 

                }
                break;
            case 15 :
                // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1:167: RULE_DISCHARGED
                {
                mRULE_DISCHARGED(); 

                }
                break;
            case 16 :
                // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1:183: RULE_EXPIRED
                {
                mRULE_EXPIRED(); 

                }
                break;
            case 17 :
                // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1:196: RULE_VIOLATED
                {
                mRULE_VIOLATED(); 

                }
                break;
            case 18 :
                // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1:210: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 19 :
                // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1:221: RULE_LBRACKET
                {
                mRULE_LBRACKET(); 

                }
                break;
            case 20 :
                // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1:235: RULE_RBRACKET
                {
                mRULE_RBRACKET(); 

                }
                break;
            case 21 :
                // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1:249: RULE_LPAREN
                {
                mRULE_LPAREN(); 

                }
                break;
            case 22 :
                // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1:261: RULE_RPAREN
                {
                mRULE_RPAREN(); 

                }
                break;
            case 23 :
                // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1:273: RULE_PLUS
                {
                mRULE_PLUS(); 

                }
                break;
            case 24 :
                // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1:283: RULE_LT
                {
                mRULE_LT(); 

                }
                break;
            case 25 :
                // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1:291: RULE_LEQ
                {
                mRULE_LEQ(); 

                }
                break;
            case 26 :
                // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1:300: RULE_EQ
                {
                mRULE_EQ(); 

                }
                break;
            case 27 :
                // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1:308: RULE_GT
                {
                mRULE_GT(); 

                }
                break;
            case 28 :
                // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1:316: RULE_GEQ
                {
                mRULE_GEQ(); 

                }
                break;
            case 29 :
                // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1:325: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 30 :
                // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1:333: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 31 :
                // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1:342: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 32 :
                // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1:354: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 33 :
                // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1:370: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 34 :
                // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1:386: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 35 :
                // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1:394: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\12\35\6\uffff\1\61\1\uffff\1\64\1\33\2\uffff\3\33\2\uffff\1\35\1\uffff\2\35\1\75\6\35\1\105\2\35\20\uffff\1\35\1\111\1\35\1\uffff\6\35\1\121\1\uffff\3\35\1\uffff\1\125\6\35\1\uffff\3\35\1\uffff\6\35\1\145\1\35\1\147\1\35\1\152\1\154\1\35\1\156\1\35\1\uffff\1\35\1\uffff\1\35\1\162\1\uffff\1\35\1\uffff\1\35\1\uffff\1\165\2\35\1\uffff\1\170\1\35\1\uffff\1\172\1\35\1\uffff\1\175\1\uffff\1\176\1\177\3\uffff";
    static final String DFA12_eofS =
        "\u0080\uffff";
    static final String DFA12_minS =
        "\1\0\1\143\1\145\1\151\1\157\1\145\1\170\1\156\1\162\1\150\1\151\6\uffff\1\75\1\uffff\1\75\1\101\2\uffff\2\0\1\52\2\uffff\1\150\1\uffff\1\171\1\155\1\60\1\155\1\145\1\164\1\163\1\143\1\144\1\60\1\145\1\157\20\uffff\1\145\1\60\1\145\1\uffff\1\155\2\141\1\143\1\145\1\151\1\60\1\uffff\1\162\1\154\1\155\1\uffff\1\60\1\151\1\164\1\143\1\150\1\160\1\162\1\uffff\1\145\2\141\1\uffff\1\164\1\145\1\150\1\141\1\164\1\145\1\60\1\164\1\60\1\155\2\60\1\162\1\60\1\144\1\uffff\1\145\1\uffff\1\145\1\60\1\uffff\1\144\1\uffff\1\147\1\uffff\1\60\1\144\1\156\1\uffff\1\60\1\145\1\uffff\1\60\1\164\1\uffff\1\60\1\uffff\2\60\3\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\143\1\145\1\157\1\162\1\151\1\170\1\156\1\162\1\150\1\151\6\uffff\1\75\1\uffff\1\75\1\172\2\uffff\2\uffff\1\57\2\uffff\1\150\1\uffff\1\171\1\155\1\172\1\155\1\145\1\164\1\163\1\160\1\144\1\172\1\145\1\157\20\uffff\1\145\1\172\1\145\1\uffff\1\155\2\141\1\143\1\145\1\151\1\172\1\uffff\1\162\1\154\1\155\1\uffff\1\172\1\151\1\164\1\143\1\150\1\160\1\162\1\uffff\1\145\2\141\1\uffff\1\164\1\145\1\150\1\141\1\164\1\145\1\172\1\164\1\172\1\155\2\172\1\162\1\172\1\144\1\uffff\1\145\1\uffff\1\145\1\172\1\uffff\1\144\1\uffff\1\147\1\uffff\1\172\1\144\1\156\1\uffff\1\172\1\145\1\uffff\1\172\1\164\1\uffff\1\172\1\uffff\2\172\3\uffff";
    static final String DFA12_acceptS =
        "\13\uffff\1\22\1\23\1\24\1\25\1\26\1\27\1\uffff\1\32\2\uffff\1\35\1\36\3\uffff\1\42\1\43\1\uffff\1\35\14\uffff\1\22\1\23\1\24\1\25\1\26\1\27\1\31\1\30\1\32\1\34\1\33\1\36\1\37\1\40\1\41\1\42\3\uffff\1\10\7\uffff\1\13\3\uffff\1\2\7\uffff\1\12\3\uffff\1\3\17\uffff\1\14\1\uffff\1\1\2\uffff\1\5\1\uffff\1\6\1\uffff\1\11\3\uffff\1\15\2\uffff\1\20\2\uffff\1\16\1\uffff\1\21\2\uffff\1\7\1\4\1\17";
    static final String DFA12_specialS =
        "\1\2\26\uffff\1\1\1\0\147\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\33\2\32\2\33\1\32\22\33\1\32\1\33\1\27\4\33\1\30\1\16\1\17\1\33\1\20\1\13\2\33\1\31\12\26\2\33\1\21\1\22\1\23\2\33\32\25\1\14\1\33\1\15\1\24\1\25\1\33\1\7\1\25\1\4\1\5\1\6\5\25\1\2\3\25\1\10\3\25\1\1\1\3\1\25\1\12\1\11\3\25\uff85\33",
            "\1\34",
            "\1\36",
            "\1\37\5\uffff\1\40",
            "\1\41\2\uffff\1\42",
            "\1\43\3\uffff\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\60",
            "",
            "\1\63",
            "\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "",
            "\0\66",
            "\0\66",
            "\1\67\4\uffff\1\70",
            "",
            "",
            "\1\72",
            "",
            "\1\73",
            "\1\74",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102\14\uffff\1\103",
            "\1\104",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\106",
            "\1\107",
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
            "\1\110",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\112",
            "",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "\1\122",
            "\1\123",
            "\1\124",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "",
            "\1\134",
            "\1\135",
            "\1\136",
            "",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\146",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\150",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\3\35\1\151\26\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\4\35\1\153\25\35",
            "\1\155",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\157",
            "",
            "\1\160",
            "",
            "\1\161",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "\1\163",
            "",
            "\1\164",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\166",
            "\1\167",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\171",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\173",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\3\35\1\174\26\35",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
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
            return "1:1: Tokens : ( RULE_SCHEMA | RULE_KEY | RULE_TIME | RULE_COMMIT | RULE_CREATE | RULE_DETACH | RULE_DISCHARGE | RULE_TO | RULE_EXCEPT | RULE_AND | RULE_OR | RULE_WHERE | RULE_CREATED | RULE_DETACHED | RULE_DISCHARGED | RULE_EXPIRED | RULE_VIOLATED | RULE_COMMA | RULE_LBRACKET | RULE_RBRACKET | RULE_LPAREN | RULE_RPAREN | RULE_PLUS | RULE_LT | RULE_LEQ | RULE_EQ | RULE_GT | RULE_GEQ | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_24 = input.LA(1);

                        s = -1;
                        if ( ((LA12_24>='\u0000' && LA12_24<='\uFFFF')) ) {s = 54;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_23 = input.LA(1);

                        s = -1;
                        if ( ((LA12_23>='\u0000' && LA12_23<='\uFFFF')) ) {s = 54;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='s') ) {s = 1;}

                        else if ( (LA12_0=='k') ) {s = 2;}

                        else if ( (LA12_0=='t') ) {s = 3;}

                        else if ( (LA12_0=='c') ) {s = 4;}

                        else if ( (LA12_0=='d') ) {s = 5;}

                        else if ( (LA12_0=='e') ) {s = 6;}

                        else if ( (LA12_0=='a') ) {s = 7;}

                        else if ( (LA12_0=='o') ) {s = 8;}

                        else if ( (LA12_0=='w') ) {s = 9;}

                        else if ( (LA12_0=='v') ) {s = 10;}

                        else if ( (LA12_0==',') ) {s = 11;}

                        else if ( (LA12_0=='[') ) {s = 12;}

                        else if ( (LA12_0==']') ) {s = 13;}

                        else if ( (LA12_0=='(') ) {s = 14;}

                        else if ( (LA12_0==')') ) {s = 15;}

                        else if ( (LA12_0=='+') ) {s = 16;}

                        else if ( (LA12_0=='<') ) {s = 17;}

                        else if ( (LA12_0=='=') ) {s = 18;}

                        else if ( (LA12_0=='>') ) {s = 19;}

                        else if ( (LA12_0=='^') ) {s = 20;}

                        else if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='b'||(LA12_0>='f' && LA12_0<='j')||(LA12_0>='l' && LA12_0<='n')||(LA12_0>='p' && LA12_0<='r')||LA12_0=='u'||(LA12_0>='x' && LA12_0<='z')) ) {s = 21;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 22;}

                        else if ( (LA12_0=='\"') ) {s = 23;}

                        else if ( (LA12_0=='\'') ) {s = 24;}

                        else if ( (LA12_0=='/') ) {s = 25;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 26;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||LA12_0=='*'||(LA12_0>='-' && LA12_0<='.')||(LA12_0>=':' && LA12_0<=';')||(LA12_0>='?' && LA12_0<='@')||LA12_0=='\\'||LA12_0=='`'||(LA12_0>='{' && LA12_0<='\uFFFF')) ) {s = 27;}

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