package org.xtext.example.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.services.CupidoGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCupidoParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SCHEMA", "RULE_LPAREN", "RULE_COMMA", "RULE_RPAREN", "RULE_KEY", "RULE_TIME", "RULE_ID", "RULE_COMMIT", "RULE_TO", "RULE_CREATE", "RULE_DETACH", "RULE_DISCHARGE", "RULE_WHERE", "RULE_LBRACKET", "RULE_RBRACKET", "RULE_CREATED", "RULE_DETACHED", "RULE_DISCHARGED", "RULE_EXPIRED", "RULE_VIOLATED", "RULE_INT", "RULE_PLUS", "RULE_LT", "RULE_LEQ", "RULE_EQ", "RULE_GT", "RULE_GEQ", "RULE_AND", "RULE_OR", "RULE_EXCEPT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_DETACH=14;
    public static final int RULE_LEQ=27;
    public static final int RULE_ID=10;
    public static final int RULE_EXCEPT=33;
    public static final int RULE_COMMIT=11;
    public static final int RULE_KEY=8;
    public static final int RULE_CREATE=13;
    public static final int RULE_ANY_OTHER=38;
    public static final int RULE_PLUS=25;
    public static final int RULE_OR=32;
    public static final int RULE_CREATED=19;
    public static final int RULE_COMMA=6;
    public static final int RULE_AND=31;
    public static final int RULE_EXPIRED=22;
    public static final int RULE_LBRACKET=17;
    public static final int RULE_WHERE=16;
    public static final int RULE_SL_COMMENT=36;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=35;
    public static final int RULE_LT=26;
    public static final int RULE_TO=12;
    public static final int RULE_DISCHARGE=15;
    public static final int RULE_STRING=34;
    public static final int RULE_GEQ=30;
    public static final int RULE_LPAREN=5;
    public static final int RULE_GT=29;
    public static final int RULE_EQ=28;
    public static final int RULE_TIME=9;
    public static final int RULE_INT=24;
    public static final int RULE_RPAREN=7;
    public static final int RULE_WS=37;
    public static final int RULE_DISCHARGED=21;
    public static final int RULE_RBRACKET=18;
    public static final int RULE_DETACHED=20;
    public static final int RULE_VIOLATED=23;
    public static final int RULE_SCHEMA=4;

    // delegates
    // delegators


        public InternalCupidoParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCupidoParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCupidoParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g"; }



     	private CupidoGrammarAccess grammarAccess;
     	
        public InternalCupidoParser(TokenStream input, CupidoGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Cupido";	
       	}
       	
       	@Override
       	protected CupidoGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleCupido"
    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:67:1: entryRuleCupido returns [EObject current=null] : iv_ruleCupido= ruleCupido EOF ;
    public final EObject entryRuleCupido() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCupido = null;


        try {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:68:2: (iv_ruleCupido= ruleCupido EOF )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:69:2: iv_ruleCupido= ruleCupido EOF
            {
             newCompositeNode(grammarAccess.getCupidoRule()); 
            pushFollow(FOLLOW_ruleCupido_in_entryRuleCupido75);
            iv_ruleCupido=ruleCupido();

            state._fsp--;

             current =iv_ruleCupido; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCupido85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCupido"


    // $ANTLR start "ruleCupido"
    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:76:1: ruleCupido returns [EObject current=null] : (this_Schemata_0= ruleSchemata ( (lv_commitments_1_0= ruleCommitment ) )* ) ;
    public final EObject ruleCupido() throws RecognitionException {
        EObject current = null;

        EObject this_Schemata_0 = null;

        EObject lv_commitments_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:79:28: ( (this_Schemata_0= ruleSchemata ( (lv_commitments_1_0= ruleCommitment ) )* ) )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:80:1: (this_Schemata_0= ruleSchemata ( (lv_commitments_1_0= ruleCommitment ) )* )
            {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:80:1: (this_Schemata_0= ruleSchemata ( (lv_commitments_1_0= ruleCommitment ) )* )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:81:5: this_Schemata_0= ruleSchemata ( (lv_commitments_1_0= ruleCommitment ) )*
            {
             
                    newCompositeNode(grammarAccess.getCupidoAccess().getSchemataParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleSchemata_in_ruleCupido132);
            this_Schemata_0=ruleSchemata();

            state._fsp--;

             
                    current = this_Schemata_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:89:1: ( (lv_commitments_1_0= ruleCommitment ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_COMMIT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:90:1: (lv_commitments_1_0= ruleCommitment )
            	    {
            	    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:90:1: (lv_commitments_1_0= ruleCommitment )
            	    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:91:3: lv_commitments_1_0= ruleCommitment
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCupidoAccess().getCommitmentsCommitmentParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCommitment_in_ruleCupido152);
            	    lv_commitments_1_0=ruleCommitment();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCupidoRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"commitments",
            	            		lv_commitments_1_0, 
            	            		"Commitment");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCupido"


    // $ANTLR start "entryRuleSchemata"
    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:115:1: entryRuleSchemata returns [EObject current=null] : iv_ruleSchemata= ruleSchemata EOF ;
    public final EObject entryRuleSchemata() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemata = null;


        try {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:116:2: (iv_ruleSchemata= ruleSchemata EOF )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:117:2: iv_ruleSchemata= ruleSchemata EOF
            {
             newCompositeNode(grammarAccess.getSchemataRule()); 
            pushFollow(FOLLOW_ruleSchemata_in_entryRuleSchemata189);
            iv_ruleSchemata=ruleSchemata();

            state._fsp--;

             current =iv_ruleSchemata; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemata199); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSchemata"


    // $ANTLR start "ruleSchemata"
    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:124:1: ruleSchemata returns [EObject current=null] : (this_SCHEMA_0= RULE_SCHEMA ( (lv_schemata_1_0= ruleEventRelation ) )+ ) ;
    public final EObject ruleSchemata() throws RecognitionException {
        EObject current = null;

        Token this_SCHEMA_0=null;
        EObject lv_schemata_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:127:28: ( (this_SCHEMA_0= RULE_SCHEMA ( (lv_schemata_1_0= ruleEventRelation ) )+ ) )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:128:1: (this_SCHEMA_0= RULE_SCHEMA ( (lv_schemata_1_0= ruleEventRelation ) )+ )
            {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:128:1: (this_SCHEMA_0= RULE_SCHEMA ( (lv_schemata_1_0= ruleEventRelation ) )+ )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:128:2: this_SCHEMA_0= RULE_SCHEMA ( (lv_schemata_1_0= ruleEventRelation ) )+
            {
            this_SCHEMA_0=(Token)match(input,RULE_SCHEMA,FOLLOW_RULE_SCHEMA_in_ruleSchemata235); 
             
                newLeafNode(this_SCHEMA_0, grammarAccess.getSchemataAccess().getSCHEMATerminalRuleCall_0()); 
                
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:132:1: ( (lv_schemata_1_0= ruleEventRelation ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID||(LA2_0>=RULE_CREATED && LA2_0<=RULE_VIOLATED)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:133:1: (lv_schemata_1_0= ruleEventRelation )
            	    {
            	    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:133:1: (lv_schemata_1_0= ruleEventRelation )
            	    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:134:3: lv_schemata_1_0= ruleEventRelation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSchemataAccess().getSchemataEventRelationParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEventRelation_in_ruleSchemata255);
            	    lv_schemata_1_0=ruleEventRelation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSchemataRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"schemata",
            	            		lv_schemata_1_0, 
            	            		"EventRelation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


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


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSchemata"


    // $ANTLR start "entryRuleEventRelation"
    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:158:1: entryRuleEventRelation returns [EObject current=null] : iv_ruleEventRelation= ruleEventRelation EOF ;
    public final EObject entryRuleEventRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventRelation = null;


        try {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:159:2: (iv_ruleEventRelation= ruleEventRelation EOF )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:160:2: iv_ruleEventRelation= ruleEventRelation EOF
            {
             newCompositeNode(grammarAccess.getEventRelationRule()); 
            pushFollow(FOLLOW_ruleEventRelation_in_entryRuleEventRelation292);
            iv_ruleEventRelation=ruleEventRelation();

            state._fsp--;

             current =iv_ruleEventRelation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventRelation302); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEventRelation"


    // $ANTLR start "ruleEventRelation"
    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:167:1: ruleEventRelation returns [EObject current=null] : ( ( (lv_event_0_0= ruleEvent ) ) this_LPAREN_1= RULE_LPAREN ( (lv_params_2_0= ruleParam ) ) (this_COMMA_3= RULE_COMMA ( (lv_params_4_0= ruleParam ) ) )* this_RPAREN_5= RULE_RPAREN this_KEY_6= RULE_KEY ( (lv_keyParams_7_0= ruleParam ) ) (this_COMMA_8= RULE_COMMA ( (lv_keyParams_9_0= ruleParam ) ) )* this_TIME_10= RULE_TIME ( (lv_timeParam_11_0= ruleParam ) ) ) ;
    public final EObject ruleEventRelation() throws RecognitionException {
        EObject current = null;

        Token this_LPAREN_1=null;
        Token this_COMMA_3=null;
        Token this_RPAREN_5=null;
        Token this_KEY_6=null;
        Token this_COMMA_8=null;
        Token this_TIME_10=null;
        EObject lv_event_0_0 = null;

        EObject lv_params_2_0 = null;

        EObject lv_params_4_0 = null;

        EObject lv_keyParams_7_0 = null;

        EObject lv_keyParams_9_0 = null;

        EObject lv_timeParam_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:170:28: ( ( ( (lv_event_0_0= ruleEvent ) ) this_LPAREN_1= RULE_LPAREN ( (lv_params_2_0= ruleParam ) ) (this_COMMA_3= RULE_COMMA ( (lv_params_4_0= ruleParam ) ) )* this_RPAREN_5= RULE_RPAREN this_KEY_6= RULE_KEY ( (lv_keyParams_7_0= ruleParam ) ) (this_COMMA_8= RULE_COMMA ( (lv_keyParams_9_0= ruleParam ) ) )* this_TIME_10= RULE_TIME ( (lv_timeParam_11_0= ruleParam ) ) ) )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:171:1: ( ( (lv_event_0_0= ruleEvent ) ) this_LPAREN_1= RULE_LPAREN ( (lv_params_2_0= ruleParam ) ) (this_COMMA_3= RULE_COMMA ( (lv_params_4_0= ruleParam ) ) )* this_RPAREN_5= RULE_RPAREN this_KEY_6= RULE_KEY ( (lv_keyParams_7_0= ruleParam ) ) (this_COMMA_8= RULE_COMMA ( (lv_keyParams_9_0= ruleParam ) ) )* this_TIME_10= RULE_TIME ( (lv_timeParam_11_0= ruleParam ) ) )
            {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:171:1: ( ( (lv_event_0_0= ruleEvent ) ) this_LPAREN_1= RULE_LPAREN ( (lv_params_2_0= ruleParam ) ) (this_COMMA_3= RULE_COMMA ( (lv_params_4_0= ruleParam ) ) )* this_RPAREN_5= RULE_RPAREN this_KEY_6= RULE_KEY ( (lv_keyParams_7_0= ruleParam ) ) (this_COMMA_8= RULE_COMMA ( (lv_keyParams_9_0= ruleParam ) ) )* this_TIME_10= RULE_TIME ( (lv_timeParam_11_0= ruleParam ) ) )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:171:2: ( (lv_event_0_0= ruleEvent ) ) this_LPAREN_1= RULE_LPAREN ( (lv_params_2_0= ruleParam ) ) (this_COMMA_3= RULE_COMMA ( (lv_params_4_0= ruleParam ) ) )* this_RPAREN_5= RULE_RPAREN this_KEY_6= RULE_KEY ( (lv_keyParams_7_0= ruleParam ) ) (this_COMMA_8= RULE_COMMA ( (lv_keyParams_9_0= ruleParam ) ) )* this_TIME_10= RULE_TIME ( (lv_timeParam_11_0= ruleParam ) )
            {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:171:2: ( (lv_event_0_0= ruleEvent ) )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:172:1: (lv_event_0_0= ruleEvent )
            {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:172:1: (lv_event_0_0= ruleEvent )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:173:3: lv_event_0_0= ruleEvent
            {
             
            	        newCompositeNode(grammarAccess.getEventRelationAccess().getEventEventParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleEvent_in_ruleEventRelation348);
            lv_event_0_0=ruleEvent();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEventRelationRule());
            	        }
                   		set(
                   			current, 
                   			"event",
                    		lv_event_0_0, 
                    		"Event");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_LPAREN_1=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleEventRelation359); 
             
                newLeafNode(this_LPAREN_1, grammarAccess.getEventRelationAccess().getLPARENTerminalRuleCall_1()); 
                
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:193:1: ( (lv_params_2_0= ruleParam ) )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:194:1: (lv_params_2_0= ruleParam )
            {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:194:1: (lv_params_2_0= ruleParam )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:195:3: lv_params_2_0= ruleParam
            {
             
            	        newCompositeNode(grammarAccess.getEventRelationAccess().getParamsParamParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleParam_in_ruleEventRelation379);
            lv_params_2_0=ruleParam();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEventRelationRule());
            	        }
                   		add(
                   			current, 
                   			"params",
                    		lv_params_2_0, 
                    		"Param");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:211:2: (this_COMMA_3= RULE_COMMA ( (lv_params_4_0= ruleParam ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_COMMA) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:211:3: this_COMMA_3= RULE_COMMA ( (lv_params_4_0= ruleParam ) )
            	    {
            	    this_COMMA_3=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleEventRelation391); 
            	     
            	        newLeafNode(this_COMMA_3, grammarAccess.getEventRelationAccess().getCOMMATerminalRuleCall_3_0()); 
            	        
            	    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:215:1: ( (lv_params_4_0= ruleParam ) )
            	    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:216:1: (lv_params_4_0= ruleParam )
            	    {
            	    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:216:1: (lv_params_4_0= ruleParam )
            	    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:217:3: lv_params_4_0= ruleParam
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEventRelationAccess().getParamsParamParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleParam_in_ruleEventRelation411);
            	    lv_params_4_0=ruleParam();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEventRelationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"params",
            	            		lv_params_4_0, 
            	            		"Param");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            this_RPAREN_5=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleEventRelation424); 
             
                newLeafNode(this_RPAREN_5, grammarAccess.getEventRelationAccess().getRPARENTerminalRuleCall_4()); 
                
            this_KEY_6=(Token)match(input,RULE_KEY,FOLLOW_RULE_KEY_in_ruleEventRelation434); 
             
                newLeafNode(this_KEY_6, grammarAccess.getEventRelationAccess().getKEYTerminalRuleCall_5()); 
                
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:241:1: ( (lv_keyParams_7_0= ruleParam ) )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:242:1: (lv_keyParams_7_0= ruleParam )
            {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:242:1: (lv_keyParams_7_0= ruleParam )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:243:3: lv_keyParams_7_0= ruleParam
            {
             
            	        newCompositeNode(grammarAccess.getEventRelationAccess().getKeyParamsParamParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleParam_in_ruleEventRelation454);
            lv_keyParams_7_0=ruleParam();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEventRelationRule());
            	        }
                   		add(
                   			current, 
                   			"keyParams",
                    		lv_keyParams_7_0, 
                    		"Param");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:259:2: (this_COMMA_8= RULE_COMMA ( (lv_keyParams_9_0= ruleParam ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_COMMA) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:259:3: this_COMMA_8= RULE_COMMA ( (lv_keyParams_9_0= ruleParam ) )
            	    {
            	    this_COMMA_8=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleEventRelation466); 
            	     
            	        newLeafNode(this_COMMA_8, grammarAccess.getEventRelationAccess().getCOMMATerminalRuleCall_7_0()); 
            	        
            	    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:263:1: ( (lv_keyParams_9_0= ruleParam ) )
            	    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:264:1: (lv_keyParams_9_0= ruleParam )
            	    {
            	    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:264:1: (lv_keyParams_9_0= ruleParam )
            	    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:265:3: lv_keyParams_9_0= ruleParam
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEventRelationAccess().getKeyParamsParamParserRuleCall_7_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleParam_in_ruleEventRelation486);
            	    lv_keyParams_9_0=ruleParam();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEventRelationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"keyParams",
            	            		lv_keyParams_9_0, 
            	            		"Param");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            this_TIME_10=(Token)match(input,RULE_TIME,FOLLOW_RULE_TIME_in_ruleEventRelation499); 
             
                newLeafNode(this_TIME_10, grammarAccess.getEventRelationAccess().getTIMETerminalRuleCall_8()); 
                
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:285:1: ( (lv_timeParam_11_0= ruleParam ) )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:286:1: (lv_timeParam_11_0= ruleParam )
            {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:286:1: (lv_timeParam_11_0= ruleParam )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:287:3: lv_timeParam_11_0= ruleParam
            {
             
            	        newCompositeNode(grammarAccess.getEventRelationAccess().getTimeParamParamParserRuleCall_9_0()); 
            	    
            pushFollow(FOLLOW_ruleParam_in_ruleEventRelation519);
            lv_timeParam_11_0=ruleParam();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEventRelationRule());
            	        }
                   		set(
                   			current, 
                   			"timeParam",
                    		lv_timeParam_11_0, 
                    		"Param");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEventRelation"


    // $ANTLR start "entryRuleParam"
    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:311:1: entryRuleParam returns [EObject current=null] : iv_ruleParam= ruleParam EOF ;
    public final EObject entryRuleParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParam = null;


        try {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:312:2: (iv_ruleParam= ruleParam EOF )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:313:2: iv_ruleParam= ruleParam EOF
            {
             newCompositeNode(grammarAccess.getParamRule()); 
            pushFollow(FOLLOW_ruleParam_in_entryRuleParam555);
            iv_ruleParam=ruleParam();

            state._fsp--;

             current =iv_ruleParam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParam565); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParam"


    // $ANTLR start "ruleParam"
    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:320:1: ruleParam returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleParam() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:323:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:324:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:324:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:325:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:325:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:326:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParam606); 

            			newLeafNode(lv_name_0_0, grammarAccess.getParamAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getParamRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParam"


    // $ANTLR start "entryRuleCommitment"
    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:350:1: entryRuleCommitment returns [EObject current=null] : iv_ruleCommitment= ruleCommitment EOF ;
    public final EObject entryRuleCommitment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommitment = null;


        try {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:351:2: (iv_ruleCommitment= ruleCommitment EOF )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:352:2: iv_ruleCommitment= ruleCommitment EOF
            {
             newCompositeNode(grammarAccess.getCommitmentRule()); 
            pushFollow(FOLLOW_ruleCommitment_in_entryRuleCommitment646);
            iv_ruleCommitment=ruleCommitment();

            state._fsp--;

             current =iv_ruleCommitment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommitment656); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommitment"


    // $ANTLR start "ruleCommitment"
    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:359:1: ruleCommitment returns [EObject current=null] : (this_COMMIT_0= RULE_COMMIT ( (lv_label_1_0= RULE_ID ) ) ( (lv_debtor_2_0= RULE_ID ) ) this_TO_3= RULE_TO ( (lv_creditor_4_0= RULE_ID ) ) this_CREATE_5= RULE_CREATE ( (lv_trigger_6_0= ruleGeneralExpr ) ) (this_DETACH_7= RULE_DETACH ( (lv_antecedent_8_0= ruleGeneralExpr ) ) )? this_DISCHARGE_9= RULE_DISCHARGE ( (lv_consequent_10_0= ruleGeneralExpr ) ) ) ;
    public final EObject ruleCommitment() throws RecognitionException {
        EObject current = null;

        Token this_COMMIT_0=null;
        Token lv_label_1_0=null;
        Token lv_debtor_2_0=null;
        Token this_TO_3=null;
        Token lv_creditor_4_0=null;
        Token this_CREATE_5=null;
        Token this_DETACH_7=null;
        Token this_DISCHARGE_9=null;
        EObject lv_trigger_6_0 = null;

        EObject lv_antecedent_8_0 = null;

        EObject lv_consequent_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:362:28: ( (this_COMMIT_0= RULE_COMMIT ( (lv_label_1_0= RULE_ID ) ) ( (lv_debtor_2_0= RULE_ID ) ) this_TO_3= RULE_TO ( (lv_creditor_4_0= RULE_ID ) ) this_CREATE_5= RULE_CREATE ( (lv_trigger_6_0= ruleGeneralExpr ) ) (this_DETACH_7= RULE_DETACH ( (lv_antecedent_8_0= ruleGeneralExpr ) ) )? this_DISCHARGE_9= RULE_DISCHARGE ( (lv_consequent_10_0= ruleGeneralExpr ) ) ) )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:363:1: (this_COMMIT_0= RULE_COMMIT ( (lv_label_1_0= RULE_ID ) ) ( (lv_debtor_2_0= RULE_ID ) ) this_TO_3= RULE_TO ( (lv_creditor_4_0= RULE_ID ) ) this_CREATE_5= RULE_CREATE ( (lv_trigger_6_0= ruleGeneralExpr ) ) (this_DETACH_7= RULE_DETACH ( (lv_antecedent_8_0= ruleGeneralExpr ) ) )? this_DISCHARGE_9= RULE_DISCHARGE ( (lv_consequent_10_0= ruleGeneralExpr ) ) )
            {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:363:1: (this_COMMIT_0= RULE_COMMIT ( (lv_label_1_0= RULE_ID ) ) ( (lv_debtor_2_0= RULE_ID ) ) this_TO_3= RULE_TO ( (lv_creditor_4_0= RULE_ID ) ) this_CREATE_5= RULE_CREATE ( (lv_trigger_6_0= ruleGeneralExpr ) ) (this_DETACH_7= RULE_DETACH ( (lv_antecedent_8_0= ruleGeneralExpr ) ) )? this_DISCHARGE_9= RULE_DISCHARGE ( (lv_consequent_10_0= ruleGeneralExpr ) ) )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:363:2: this_COMMIT_0= RULE_COMMIT ( (lv_label_1_0= RULE_ID ) ) ( (lv_debtor_2_0= RULE_ID ) ) this_TO_3= RULE_TO ( (lv_creditor_4_0= RULE_ID ) ) this_CREATE_5= RULE_CREATE ( (lv_trigger_6_0= ruleGeneralExpr ) ) (this_DETACH_7= RULE_DETACH ( (lv_antecedent_8_0= ruleGeneralExpr ) ) )? this_DISCHARGE_9= RULE_DISCHARGE ( (lv_consequent_10_0= ruleGeneralExpr ) )
            {
            this_COMMIT_0=(Token)match(input,RULE_COMMIT,FOLLOW_RULE_COMMIT_in_ruleCommitment692); 
             
                newLeafNode(this_COMMIT_0, grammarAccess.getCommitmentAccess().getCOMMITTerminalRuleCall_0()); 
                
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:367:1: ( (lv_label_1_0= RULE_ID ) )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:368:1: (lv_label_1_0= RULE_ID )
            {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:368:1: (lv_label_1_0= RULE_ID )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:369:3: lv_label_1_0= RULE_ID
            {
            lv_label_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommitment708); 

            			newLeafNode(lv_label_1_0, grammarAccess.getCommitmentAccess().getLabelIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCommitmentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"label",
                    		lv_label_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:385:2: ( (lv_debtor_2_0= RULE_ID ) )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:386:1: (lv_debtor_2_0= RULE_ID )
            {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:386:1: (lv_debtor_2_0= RULE_ID )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:387:3: lv_debtor_2_0= RULE_ID
            {
            lv_debtor_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommitment730); 

            			newLeafNode(lv_debtor_2_0, grammarAccess.getCommitmentAccess().getDebtorIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCommitmentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"debtor",
                    		lv_debtor_2_0, 
                    		"ID");
            	    

            }


            }

            this_TO_3=(Token)match(input,RULE_TO,FOLLOW_RULE_TO_in_ruleCommitment746); 
             
                newLeafNode(this_TO_3, grammarAccess.getCommitmentAccess().getTOTerminalRuleCall_3()); 
                
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:407:1: ( (lv_creditor_4_0= RULE_ID ) )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:408:1: (lv_creditor_4_0= RULE_ID )
            {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:408:1: (lv_creditor_4_0= RULE_ID )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:409:3: lv_creditor_4_0= RULE_ID
            {
            lv_creditor_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommitment762); 

            			newLeafNode(lv_creditor_4_0, grammarAccess.getCommitmentAccess().getCreditorIDTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCommitmentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"creditor",
                    		lv_creditor_4_0, 
                    		"ID");
            	    

            }


            }

            this_CREATE_5=(Token)match(input,RULE_CREATE,FOLLOW_RULE_CREATE_in_ruleCommitment778); 
             
                newLeafNode(this_CREATE_5, grammarAccess.getCommitmentAccess().getCREATETerminalRuleCall_5()); 
                
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:429:1: ( (lv_trigger_6_0= ruleGeneralExpr ) )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:430:1: (lv_trigger_6_0= ruleGeneralExpr )
            {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:430:1: (lv_trigger_6_0= ruleGeneralExpr )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:431:3: lv_trigger_6_0= ruleGeneralExpr
            {
             
            	        newCompositeNode(grammarAccess.getCommitmentAccess().getTriggerGeneralExprParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleGeneralExpr_in_ruleCommitment798);
            lv_trigger_6_0=ruleGeneralExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCommitmentRule());
            	        }
                   		set(
                   			current, 
                   			"trigger",
                    		lv_trigger_6_0, 
                    		"GeneralExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:447:2: (this_DETACH_7= RULE_DETACH ( (lv_antecedent_8_0= ruleGeneralExpr ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_DETACH) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:447:3: this_DETACH_7= RULE_DETACH ( (lv_antecedent_8_0= ruleGeneralExpr ) )
                    {
                    this_DETACH_7=(Token)match(input,RULE_DETACH,FOLLOW_RULE_DETACH_in_ruleCommitment810); 
                     
                        newLeafNode(this_DETACH_7, grammarAccess.getCommitmentAccess().getDETACHTerminalRuleCall_7_0()); 
                        
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:451:1: ( (lv_antecedent_8_0= ruleGeneralExpr ) )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:452:1: (lv_antecedent_8_0= ruleGeneralExpr )
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:452:1: (lv_antecedent_8_0= ruleGeneralExpr )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:453:3: lv_antecedent_8_0= ruleGeneralExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getCommitmentAccess().getAntecedentGeneralExprParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleGeneralExpr_in_ruleCommitment830);
                    lv_antecedent_8_0=ruleGeneralExpr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCommitmentRule());
                    	        }
                           		set(
                           			current, 
                           			"antecedent",
                            		lv_antecedent_8_0, 
                            		"GeneralExpr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            this_DISCHARGE_9=(Token)match(input,RULE_DISCHARGE,FOLLOW_RULE_DISCHARGE_in_ruleCommitment843); 
             
                newLeafNode(this_DISCHARGE_9, grammarAccess.getCommitmentAccess().getDISCHARGETerminalRuleCall_8()); 
                
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:473:1: ( (lv_consequent_10_0= ruleGeneralExpr ) )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:474:1: (lv_consequent_10_0= ruleGeneralExpr )
            {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:474:1: (lv_consequent_10_0= ruleGeneralExpr )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:475:3: lv_consequent_10_0= ruleGeneralExpr
            {
             
            	        newCompositeNode(grammarAccess.getCommitmentAccess().getConsequentGeneralExprParserRuleCall_9_0()); 
            	    
            pushFollow(FOLLOW_ruleGeneralExpr_in_ruleCommitment863);
            lv_consequent_10_0=ruleGeneralExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCommitmentRule());
            	        }
                   		set(
                   			current, 
                   			"consequent",
                    		lv_consequent_10_0, 
                    		"GeneralExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommitment"


    // $ANTLR start "entryRuleGeneralExpr"
    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:499:1: entryRuleGeneralExpr returns [EObject current=null] : iv_ruleGeneralExpr= ruleGeneralExpr EOF ;
    public final EObject entryRuleGeneralExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralExpr = null;


        try {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:500:2: (iv_ruleGeneralExpr= ruleGeneralExpr EOF )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:501:2: iv_ruleGeneralExpr= ruleGeneralExpr EOF
            {
             newCompositeNode(grammarAccess.getGeneralExprRule()); 
            pushFollow(FOLLOW_ruleGeneralExpr_in_entryRuleGeneralExpr899);
            iv_ruleGeneralExpr=ruleGeneralExpr();

            state._fsp--;

             current =iv_ruleGeneralExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGeneralExpr909); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGeneralExpr"


    // $ANTLR start "ruleGeneralExpr"
    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:508:1: ruleGeneralExpr returns [EObject current=null] : ( ( (lv_expr_0_0= ruleExpr ) ) ( ( (lv_where_1_0= RULE_WHERE ) ) ( (lv_arith_2_0= ruleArithExpr ) ) )? ) ;
    public final EObject ruleGeneralExpr() throws RecognitionException {
        EObject current = null;

        Token lv_where_1_0=null;
        EObject lv_expr_0_0 = null;

        EObject lv_arith_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:511:28: ( ( ( (lv_expr_0_0= ruleExpr ) ) ( ( (lv_where_1_0= RULE_WHERE ) ) ( (lv_arith_2_0= ruleArithExpr ) ) )? ) )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:512:1: ( ( (lv_expr_0_0= ruleExpr ) ) ( ( (lv_where_1_0= RULE_WHERE ) ) ( (lv_arith_2_0= ruleArithExpr ) ) )? )
            {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:512:1: ( ( (lv_expr_0_0= ruleExpr ) ) ( ( (lv_where_1_0= RULE_WHERE ) ) ( (lv_arith_2_0= ruleArithExpr ) ) )? )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:512:2: ( (lv_expr_0_0= ruleExpr ) ) ( ( (lv_where_1_0= RULE_WHERE ) ) ( (lv_arith_2_0= ruleArithExpr ) ) )?
            {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:512:2: ( (lv_expr_0_0= ruleExpr ) )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:513:1: (lv_expr_0_0= ruleExpr )
            {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:513:1: (lv_expr_0_0= ruleExpr )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:514:3: lv_expr_0_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getGeneralExprAccess().getExprExprParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleGeneralExpr955);
            lv_expr_0_0=ruleExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGeneralExprRule());
            	        }
                   		set(
                   			current, 
                   			"expr",
                    		lv_expr_0_0, 
                    		"Expr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:530:2: ( ( (lv_where_1_0= RULE_WHERE ) ) ( (lv_arith_2_0= ruleArithExpr ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_WHERE) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:530:3: ( (lv_where_1_0= RULE_WHERE ) ) ( (lv_arith_2_0= ruleArithExpr ) )
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:530:3: ( (lv_where_1_0= RULE_WHERE ) )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:531:1: (lv_where_1_0= RULE_WHERE )
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:531:1: (lv_where_1_0= RULE_WHERE )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:532:3: lv_where_1_0= RULE_WHERE
                    {
                    lv_where_1_0=(Token)match(input,RULE_WHERE,FOLLOW_RULE_WHERE_in_ruleGeneralExpr973); 

                    			newLeafNode(lv_where_1_0, grammarAccess.getGeneralExprAccess().getWhereWHERETerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGeneralExprRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"where",
                            		lv_where_1_0, 
                            		"WHERE");
                    	    

                    }


                    }

                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:548:2: ( (lv_arith_2_0= ruleArithExpr ) )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:549:1: (lv_arith_2_0= ruleArithExpr )
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:549:1: (lv_arith_2_0= ruleArithExpr )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:550:3: lv_arith_2_0= ruleArithExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getGeneralExprAccess().getArithArithExprParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleArithExpr_in_ruleGeneralExpr999);
                    lv_arith_2_0=ruleArithExpr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGeneralExprRule());
                    	        }
                           		set(
                           			current, 
                           			"arith",
                            		lv_arith_2_0, 
                            		"ArithExpr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGeneralExpr"


    // $ANTLR start "entryRuleExpr"
    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:574:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:575:2: (iv_ruleExpr= ruleExpr EOF )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:576:2: iv_ruleExpr= ruleExpr EOF
            {
             newCompositeNode(grammarAccess.getExprRule()); 
            pushFollow(FOLLOW_ruleExpr_in_entryRuleExpr1037);
            iv_ruleExpr=ruleExpr();

            state._fsp--;

             current =iv_ruleExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpr1047); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpr"


    // $ANTLR start "ruleExpr"
    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:583:1: ruleExpr returns [EObject current=null] : ( ( (lv_interval_0_0= ruleInterval ) ) | ( ( (lv_left_1_0= ruleInterval ) ) ( (lv_op_2_0= ruleEventOperator ) ) ( (lv_right_3_0= ruleExpr ) ) ) | (this_LPAREN_4= RULE_LPAREN ( (lv_expr_5_0= ruleExpr ) ) this_RPAREN_6= RULE_RPAREN ) ) ;
    public final EObject ruleExpr() throws RecognitionException {
        EObject current = null;

        Token this_LPAREN_4=null;
        Token this_RPAREN_6=null;
        EObject lv_interval_0_0 = null;

        EObject lv_left_1_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_expr_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:586:28: ( ( ( (lv_interval_0_0= ruleInterval ) ) | ( ( (lv_left_1_0= ruleInterval ) ) ( (lv_op_2_0= ruleEventOperator ) ) ( (lv_right_3_0= ruleExpr ) ) ) | (this_LPAREN_4= RULE_LPAREN ( (lv_expr_5_0= ruleExpr ) ) this_RPAREN_6= RULE_RPAREN ) ) )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:587:1: ( ( (lv_interval_0_0= ruleInterval ) ) | ( ( (lv_left_1_0= ruleInterval ) ) ( (lv_op_2_0= ruleEventOperator ) ) ( (lv_right_3_0= ruleExpr ) ) ) | (this_LPAREN_4= RULE_LPAREN ( (lv_expr_5_0= ruleExpr ) ) this_RPAREN_6= RULE_RPAREN ) )
            {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:587:1: ( ( (lv_interval_0_0= ruleInterval ) ) | ( ( (lv_left_1_0= ruleInterval ) ) ( (lv_op_2_0= ruleEventOperator ) ) ( (lv_right_3_0= ruleExpr ) ) ) | (this_LPAREN_4= RULE_LPAREN ( (lv_expr_5_0= ruleExpr ) ) this_RPAREN_6= RULE_RPAREN ) )
            int alt7=3;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:587:2: ( (lv_interval_0_0= ruleInterval ) )
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:587:2: ( (lv_interval_0_0= ruleInterval ) )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:588:1: (lv_interval_0_0= ruleInterval )
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:588:1: (lv_interval_0_0= ruleInterval )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:589:3: lv_interval_0_0= ruleInterval
                    {
                     
                    	        newCompositeNode(grammarAccess.getExprAccess().getIntervalIntervalParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleInterval_in_ruleExpr1093);
                    lv_interval_0_0=ruleInterval();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExprRule());
                    	        }
                           		set(
                           			current, 
                           			"interval",
                            		lv_interval_0_0, 
                            		"Interval");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:606:6: ( ( (lv_left_1_0= ruleInterval ) ) ( (lv_op_2_0= ruleEventOperator ) ) ( (lv_right_3_0= ruleExpr ) ) )
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:606:6: ( ( (lv_left_1_0= ruleInterval ) ) ( (lv_op_2_0= ruleEventOperator ) ) ( (lv_right_3_0= ruleExpr ) ) )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:606:7: ( (lv_left_1_0= ruleInterval ) ) ( (lv_op_2_0= ruleEventOperator ) ) ( (lv_right_3_0= ruleExpr ) )
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:606:7: ( (lv_left_1_0= ruleInterval ) )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:607:1: (lv_left_1_0= ruleInterval )
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:607:1: (lv_left_1_0= ruleInterval )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:608:3: lv_left_1_0= ruleInterval
                    {
                     
                    	        newCompositeNode(grammarAccess.getExprAccess().getLeftIntervalParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleInterval_in_ruleExpr1121);
                    lv_left_1_0=ruleInterval();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExprRule());
                    	        }
                           		set(
                           			current, 
                           			"left",
                            		lv_left_1_0, 
                            		"Interval");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:624:2: ( (lv_op_2_0= ruleEventOperator ) )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:625:1: (lv_op_2_0= ruleEventOperator )
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:625:1: (lv_op_2_0= ruleEventOperator )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:626:3: lv_op_2_0= ruleEventOperator
                    {
                     
                    	        newCompositeNode(grammarAccess.getExprAccess().getOpEventOperatorParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEventOperator_in_ruleExpr1142);
                    lv_op_2_0=ruleEventOperator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExprRule());
                    	        }
                           		set(
                           			current, 
                           			"op",
                            		lv_op_2_0, 
                            		"EventOperator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:642:2: ( (lv_right_3_0= ruleExpr ) )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:643:1: (lv_right_3_0= ruleExpr )
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:643:1: (lv_right_3_0= ruleExpr )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:644:3: lv_right_3_0= ruleExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getExprAccess().getRightExprParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpr_in_ruleExpr1163);
                    lv_right_3_0=ruleExpr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExprRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_3_0, 
                            		"Expr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:661:6: (this_LPAREN_4= RULE_LPAREN ( (lv_expr_5_0= ruleExpr ) ) this_RPAREN_6= RULE_RPAREN )
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:661:6: (this_LPAREN_4= RULE_LPAREN ( (lv_expr_5_0= ruleExpr ) ) this_RPAREN_6= RULE_RPAREN )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:661:7: this_LPAREN_4= RULE_LPAREN ( (lv_expr_5_0= ruleExpr ) ) this_RPAREN_6= RULE_RPAREN
                    {
                    this_LPAREN_4=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleExpr1182); 
                     
                        newLeafNode(this_LPAREN_4, grammarAccess.getExprAccess().getLPARENTerminalRuleCall_2_0()); 
                        
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:665:1: ( (lv_expr_5_0= ruleExpr ) )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:666:1: (lv_expr_5_0= ruleExpr )
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:666:1: (lv_expr_5_0= ruleExpr )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:667:3: lv_expr_5_0= ruleExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getExprAccess().getExprExprParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpr_in_ruleExpr1202);
                    lv_expr_5_0=ruleExpr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExprRule());
                    	        }
                           		set(
                           			current, 
                           			"expr",
                            		lv_expr_5_0, 
                            		"Expr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    this_RPAREN_6=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleExpr1213); 
                     
                        newLeafNode(this_RPAREN_6, grammarAccess.getExprAccess().getRPARENTerminalRuleCall_2_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleInterval"
    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:695:1: entryRuleInterval returns [EObject current=null] : iv_ruleInterval= ruleInterval EOF ;
    public final EObject entryRuleInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterval = null;


        try {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:696:2: (iv_ruleInterval= ruleInterval EOF )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:697:2: iv_ruleInterval= ruleInterval EOF
            {
             newCompositeNode(grammarAccess.getIntervalRule()); 
            pushFollow(FOLLOW_ruleInterval_in_entryRuleInterval1249);
            iv_ruleInterval=ruleInterval();

            state._fsp--;

             current =iv_ruleInterval; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterval1259); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInterval"


    // $ANTLR start "ruleInterval"
    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:704:1: ruleInterval returns [EObject current=null] : ( ( (lv_event_0_0= ruleEvent ) ) | ( ( (lv_event_1_0= ruleEvent ) ) this_LBRACKET_2= RULE_LBRACKET ( (lv_left_3_0= ruleTimeStamp ) ) this_COMMA_4= RULE_COMMA ( (lv_right_5_0= ruleTimeStamp ) ) this_RBRACKET_6= RULE_RBRACKET ) | ( ( (lv_event_7_0= ruleEvent ) ) this_LBRACKET_8= RULE_LBRACKET this_COMMA_9= RULE_COMMA ( (lv_right_10_0= ruleTimeStamp ) ) this_RBRACKET_11= RULE_RBRACKET ) | ( ( (lv_event_12_0= ruleEvent ) ) this_LBRACKET_13= RULE_LBRACKET ( (lv_left_14_0= ruleTimeStamp ) ) this_COMMA_15= RULE_COMMA this_RBRACKET_16= RULE_RBRACKET ) | ( ( (lv_event_17_0= ruleEvent ) ) this_LBRACKET_18= RULE_LBRACKET this_COMMA_19= RULE_COMMA this_RBRACKET_20= RULE_RBRACKET ) ) ;
    public final EObject ruleInterval() throws RecognitionException {
        EObject current = null;

        Token this_LBRACKET_2=null;
        Token this_COMMA_4=null;
        Token this_RBRACKET_6=null;
        Token this_LBRACKET_8=null;
        Token this_COMMA_9=null;
        Token this_RBRACKET_11=null;
        Token this_LBRACKET_13=null;
        Token this_COMMA_15=null;
        Token this_RBRACKET_16=null;
        Token this_LBRACKET_18=null;
        Token this_COMMA_19=null;
        Token this_RBRACKET_20=null;
        EObject lv_event_0_0 = null;

        EObject lv_event_1_0 = null;

        EObject lv_left_3_0 = null;

        EObject lv_right_5_0 = null;

        EObject lv_event_7_0 = null;

        EObject lv_right_10_0 = null;

        EObject lv_event_12_0 = null;

        EObject lv_left_14_0 = null;

        EObject lv_event_17_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:707:28: ( ( ( (lv_event_0_0= ruleEvent ) ) | ( ( (lv_event_1_0= ruleEvent ) ) this_LBRACKET_2= RULE_LBRACKET ( (lv_left_3_0= ruleTimeStamp ) ) this_COMMA_4= RULE_COMMA ( (lv_right_5_0= ruleTimeStamp ) ) this_RBRACKET_6= RULE_RBRACKET ) | ( ( (lv_event_7_0= ruleEvent ) ) this_LBRACKET_8= RULE_LBRACKET this_COMMA_9= RULE_COMMA ( (lv_right_10_0= ruleTimeStamp ) ) this_RBRACKET_11= RULE_RBRACKET ) | ( ( (lv_event_12_0= ruleEvent ) ) this_LBRACKET_13= RULE_LBRACKET ( (lv_left_14_0= ruleTimeStamp ) ) this_COMMA_15= RULE_COMMA this_RBRACKET_16= RULE_RBRACKET ) | ( ( (lv_event_17_0= ruleEvent ) ) this_LBRACKET_18= RULE_LBRACKET this_COMMA_19= RULE_COMMA this_RBRACKET_20= RULE_RBRACKET ) ) )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:708:1: ( ( (lv_event_0_0= ruleEvent ) ) | ( ( (lv_event_1_0= ruleEvent ) ) this_LBRACKET_2= RULE_LBRACKET ( (lv_left_3_0= ruleTimeStamp ) ) this_COMMA_4= RULE_COMMA ( (lv_right_5_0= ruleTimeStamp ) ) this_RBRACKET_6= RULE_RBRACKET ) | ( ( (lv_event_7_0= ruleEvent ) ) this_LBRACKET_8= RULE_LBRACKET this_COMMA_9= RULE_COMMA ( (lv_right_10_0= ruleTimeStamp ) ) this_RBRACKET_11= RULE_RBRACKET ) | ( ( (lv_event_12_0= ruleEvent ) ) this_LBRACKET_13= RULE_LBRACKET ( (lv_left_14_0= ruleTimeStamp ) ) this_COMMA_15= RULE_COMMA this_RBRACKET_16= RULE_RBRACKET ) | ( ( (lv_event_17_0= ruleEvent ) ) this_LBRACKET_18= RULE_LBRACKET this_COMMA_19= RULE_COMMA this_RBRACKET_20= RULE_RBRACKET ) )
            {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:708:1: ( ( (lv_event_0_0= ruleEvent ) ) | ( ( (lv_event_1_0= ruleEvent ) ) this_LBRACKET_2= RULE_LBRACKET ( (lv_left_3_0= ruleTimeStamp ) ) this_COMMA_4= RULE_COMMA ( (lv_right_5_0= ruleTimeStamp ) ) this_RBRACKET_6= RULE_RBRACKET ) | ( ( (lv_event_7_0= ruleEvent ) ) this_LBRACKET_8= RULE_LBRACKET this_COMMA_9= RULE_COMMA ( (lv_right_10_0= ruleTimeStamp ) ) this_RBRACKET_11= RULE_RBRACKET ) | ( ( (lv_event_12_0= ruleEvent ) ) this_LBRACKET_13= RULE_LBRACKET ( (lv_left_14_0= ruleTimeStamp ) ) this_COMMA_15= RULE_COMMA this_RBRACKET_16= RULE_RBRACKET ) | ( ( (lv_event_17_0= ruleEvent ) ) this_LBRACKET_18= RULE_LBRACKET this_COMMA_19= RULE_COMMA this_RBRACKET_20= RULE_RBRACKET ) )
            int alt8=5;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:708:2: ( (lv_event_0_0= ruleEvent ) )
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:708:2: ( (lv_event_0_0= ruleEvent ) )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:709:1: (lv_event_0_0= ruleEvent )
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:709:1: (lv_event_0_0= ruleEvent )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:710:3: lv_event_0_0= ruleEvent
                    {
                     
                    	        newCompositeNode(grammarAccess.getIntervalAccess().getEventEventParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEvent_in_ruleInterval1305);
                    lv_event_0_0=ruleEvent();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIntervalRule());
                    	        }
                           		set(
                           			current, 
                           			"event",
                            		lv_event_0_0, 
                            		"Event");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:727:6: ( ( (lv_event_1_0= ruleEvent ) ) this_LBRACKET_2= RULE_LBRACKET ( (lv_left_3_0= ruleTimeStamp ) ) this_COMMA_4= RULE_COMMA ( (lv_right_5_0= ruleTimeStamp ) ) this_RBRACKET_6= RULE_RBRACKET )
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:727:6: ( ( (lv_event_1_0= ruleEvent ) ) this_LBRACKET_2= RULE_LBRACKET ( (lv_left_3_0= ruleTimeStamp ) ) this_COMMA_4= RULE_COMMA ( (lv_right_5_0= ruleTimeStamp ) ) this_RBRACKET_6= RULE_RBRACKET )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:727:7: ( (lv_event_1_0= ruleEvent ) ) this_LBRACKET_2= RULE_LBRACKET ( (lv_left_3_0= ruleTimeStamp ) ) this_COMMA_4= RULE_COMMA ( (lv_right_5_0= ruleTimeStamp ) ) this_RBRACKET_6= RULE_RBRACKET
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:727:7: ( (lv_event_1_0= ruleEvent ) )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:728:1: (lv_event_1_0= ruleEvent )
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:728:1: (lv_event_1_0= ruleEvent )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:729:3: lv_event_1_0= ruleEvent
                    {
                     
                    	        newCompositeNode(grammarAccess.getIntervalAccess().getEventEventParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEvent_in_ruleInterval1333);
                    lv_event_1_0=ruleEvent();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIntervalRule());
                    	        }
                           		set(
                           			current, 
                           			"event",
                            		lv_event_1_0, 
                            		"Event");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    this_LBRACKET_2=(Token)match(input,RULE_LBRACKET,FOLLOW_RULE_LBRACKET_in_ruleInterval1344); 
                     
                        newLeafNode(this_LBRACKET_2, grammarAccess.getIntervalAccess().getLBRACKETTerminalRuleCall_1_1()); 
                        
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:749:1: ( (lv_left_3_0= ruleTimeStamp ) )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:750:1: (lv_left_3_0= ruleTimeStamp )
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:750:1: (lv_left_3_0= ruleTimeStamp )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:751:3: lv_left_3_0= ruleTimeStamp
                    {
                     
                    	        newCompositeNode(grammarAccess.getIntervalAccess().getLeftTimeStampParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTimeStamp_in_ruleInterval1364);
                    lv_left_3_0=ruleTimeStamp();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIntervalRule());
                    	        }
                           		set(
                           			current, 
                           			"left",
                            		lv_left_3_0, 
                            		"TimeStamp");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    this_COMMA_4=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleInterval1375); 
                     
                        newLeafNode(this_COMMA_4, grammarAccess.getIntervalAccess().getCOMMATerminalRuleCall_1_3()); 
                        
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:771:1: ( (lv_right_5_0= ruleTimeStamp ) )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:772:1: (lv_right_5_0= ruleTimeStamp )
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:772:1: (lv_right_5_0= ruleTimeStamp )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:773:3: lv_right_5_0= ruleTimeStamp
                    {
                     
                    	        newCompositeNode(grammarAccess.getIntervalAccess().getRightTimeStampParserRuleCall_1_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTimeStamp_in_ruleInterval1395);
                    lv_right_5_0=ruleTimeStamp();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIntervalRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_5_0, 
                            		"TimeStamp");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    this_RBRACKET_6=(Token)match(input,RULE_RBRACKET,FOLLOW_RULE_RBRACKET_in_ruleInterval1406); 
                     
                        newLeafNode(this_RBRACKET_6, grammarAccess.getIntervalAccess().getRBRACKETTerminalRuleCall_1_5()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:794:6: ( ( (lv_event_7_0= ruleEvent ) ) this_LBRACKET_8= RULE_LBRACKET this_COMMA_9= RULE_COMMA ( (lv_right_10_0= ruleTimeStamp ) ) this_RBRACKET_11= RULE_RBRACKET )
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:794:6: ( ( (lv_event_7_0= ruleEvent ) ) this_LBRACKET_8= RULE_LBRACKET this_COMMA_9= RULE_COMMA ( (lv_right_10_0= ruleTimeStamp ) ) this_RBRACKET_11= RULE_RBRACKET )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:794:7: ( (lv_event_7_0= ruleEvent ) ) this_LBRACKET_8= RULE_LBRACKET this_COMMA_9= RULE_COMMA ( (lv_right_10_0= ruleTimeStamp ) ) this_RBRACKET_11= RULE_RBRACKET
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:794:7: ( (lv_event_7_0= ruleEvent ) )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:795:1: (lv_event_7_0= ruleEvent )
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:795:1: (lv_event_7_0= ruleEvent )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:796:3: lv_event_7_0= ruleEvent
                    {
                     
                    	        newCompositeNode(grammarAccess.getIntervalAccess().getEventEventParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEvent_in_ruleInterval1434);
                    lv_event_7_0=ruleEvent();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIntervalRule());
                    	        }
                           		set(
                           			current, 
                           			"event",
                            		lv_event_7_0, 
                            		"Event");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    this_LBRACKET_8=(Token)match(input,RULE_LBRACKET,FOLLOW_RULE_LBRACKET_in_ruleInterval1445); 
                     
                        newLeafNode(this_LBRACKET_8, grammarAccess.getIntervalAccess().getLBRACKETTerminalRuleCall_2_1()); 
                        
                    this_COMMA_9=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleInterval1455); 
                     
                        newLeafNode(this_COMMA_9, grammarAccess.getIntervalAccess().getCOMMATerminalRuleCall_2_2()); 
                        
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:820:1: ( (lv_right_10_0= ruleTimeStamp ) )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:821:1: (lv_right_10_0= ruleTimeStamp )
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:821:1: (lv_right_10_0= ruleTimeStamp )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:822:3: lv_right_10_0= ruleTimeStamp
                    {
                     
                    	        newCompositeNode(grammarAccess.getIntervalAccess().getRightTimeStampParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTimeStamp_in_ruleInterval1475);
                    lv_right_10_0=ruleTimeStamp();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIntervalRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_10_0, 
                            		"TimeStamp");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    this_RBRACKET_11=(Token)match(input,RULE_RBRACKET,FOLLOW_RULE_RBRACKET_in_ruleInterval1486); 
                     
                        newLeafNode(this_RBRACKET_11, grammarAccess.getIntervalAccess().getRBRACKETTerminalRuleCall_2_4()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:843:6: ( ( (lv_event_12_0= ruleEvent ) ) this_LBRACKET_13= RULE_LBRACKET ( (lv_left_14_0= ruleTimeStamp ) ) this_COMMA_15= RULE_COMMA this_RBRACKET_16= RULE_RBRACKET )
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:843:6: ( ( (lv_event_12_0= ruleEvent ) ) this_LBRACKET_13= RULE_LBRACKET ( (lv_left_14_0= ruleTimeStamp ) ) this_COMMA_15= RULE_COMMA this_RBRACKET_16= RULE_RBRACKET )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:843:7: ( (lv_event_12_0= ruleEvent ) ) this_LBRACKET_13= RULE_LBRACKET ( (lv_left_14_0= ruleTimeStamp ) ) this_COMMA_15= RULE_COMMA this_RBRACKET_16= RULE_RBRACKET
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:843:7: ( (lv_event_12_0= ruleEvent ) )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:844:1: (lv_event_12_0= ruleEvent )
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:844:1: (lv_event_12_0= ruleEvent )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:845:3: lv_event_12_0= ruleEvent
                    {
                     
                    	        newCompositeNode(grammarAccess.getIntervalAccess().getEventEventParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEvent_in_ruleInterval1514);
                    lv_event_12_0=ruleEvent();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIntervalRule());
                    	        }
                           		set(
                           			current, 
                           			"event",
                            		lv_event_12_0, 
                            		"Event");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    this_LBRACKET_13=(Token)match(input,RULE_LBRACKET,FOLLOW_RULE_LBRACKET_in_ruleInterval1525); 
                     
                        newLeafNode(this_LBRACKET_13, grammarAccess.getIntervalAccess().getLBRACKETTerminalRuleCall_3_1()); 
                        
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:865:1: ( (lv_left_14_0= ruleTimeStamp ) )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:866:1: (lv_left_14_0= ruleTimeStamp )
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:866:1: (lv_left_14_0= ruleTimeStamp )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:867:3: lv_left_14_0= ruleTimeStamp
                    {
                     
                    	        newCompositeNode(grammarAccess.getIntervalAccess().getLeftTimeStampParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTimeStamp_in_ruleInterval1545);
                    lv_left_14_0=ruleTimeStamp();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIntervalRule());
                    	        }
                           		set(
                           			current, 
                           			"left",
                            		lv_left_14_0, 
                            		"TimeStamp");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    this_COMMA_15=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleInterval1556); 
                     
                        newLeafNode(this_COMMA_15, grammarAccess.getIntervalAccess().getCOMMATerminalRuleCall_3_3()); 
                        
                    this_RBRACKET_16=(Token)match(input,RULE_RBRACKET,FOLLOW_RULE_RBRACKET_in_ruleInterval1566); 
                     
                        newLeafNode(this_RBRACKET_16, grammarAccess.getIntervalAccess().getRBRACKETTerminalRuleCall_3_4()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:892:6: ( ( (lv_event_17_0= ruleEvent ) ) this_LBRACKET_18= RULE_LBRACKET this_COMMA_19= RULE_COMMA this_RBRACKET_20= RULE_RBRACKET )
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:892:6: ( ( (lv_event_17_0= ruleEvent ) ) this_LBRACKET_18= RULE_LBRACKET this_COMMA_19= RULE_COMMA this_RBRACKET_20= RULE_RBRACKET )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:892:7: ( (lv_event_17_0= ruleEvent ) ) this_LBRACKET_18= RULE_LBRACKET this_COMMA_19= RULE_COMMA this_RBRACKET_20= RULE_RBRACKET
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:892:7: ( (lv_event_17_0= ruleEvent ) )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:893:1: (lv_event_17_0= ruleEvent )
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:893:1: (lv_event_17_0= ruleEvent )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:894:3: lv_event_17_0= ruleEvent
                    {
                     
                    	        newCompositeNode(grammarAccess.getIntervalAccess().getEventEventParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEvent_in_ruleInterval1594);
                    lv_event_17_0=ruleEvent();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIntervalRule());
                    	        }
                           		set(
                           			current, 
                           			"event",
                            		lv_event_17_0, 
                            		"Event");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    this_LBRACKET_18=(Token)match(input,RULE_LBRACKET,FOLLOW_RULE_LBRACKET_in_ruleInterval1605); 
                     
                        newLeafNode(this_LBRACKET_18, grammarAccess.getIntervalAccess().getLBRACKETTerminalRuleCall_4_1()); 
                        
                    this_COMMA_19=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleInterval1615); 
                     
                        newLeafNode(this_COMMA_19, grammarAccess.getIntervalAccess().getCOMMATerminalRuleCall_4_2()); 
                        
                    this_RBRACKET_20=(Token)match(input,RULE_RBRACKET,FOLLOW_RULE_RBRACKET_in_ruleInterval1625); 
                     
                        newLeafNode(this_RBRACKET_20, grammarAccess.getIntervalAccess().getRBRACKETTerminalRuleCall_4_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInterval"


    // $ANTLR start "entryRuleEvent"
    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:930:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:931:2: (iv_ruleEvent= ruleEvent EOF )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:932:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent1661);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent1671); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:939:1: ruleEvent returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) | ( ( ( (lv_lifeState_1_1= RULE_CREATED | lv_lifeState_1_2= RULE_DETACHED | lv_lifeState_1_3= RULE_DISCHARGED | lv_lifeState_1_4= RULE_EXPIRED | lv_lifeState_1_5= RULE_VIOLATED ) ) ) ( (lv_label_2_0= RULE_ID ) ) ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_lifeState_1_1=null;
        Token lv_lifeState_1_2=null;
        Token lv_lifeState_1_3=null;
        Token lv_lifeState_1_4=null;
        Token lv_lifeState_1_5=null;
        Token lv_label_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:942:28: ( ( ( (lv_name_0_0= RULE_ID ) ) | ( ( ( (lv_lifeState_1_1= RULE_CREATED | lv_lifeState_1_2= RULE_DETACHED | lv_lifeState_1_3= RULE_DISCHARGED | lv_lifeState_1_4= RULE_EXPIRED | lv_lifeState_1_5= RULE_VIOLATED ) ) ) ( (lv_label_2_0= RULE_ID ) ) ) ) )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:943:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( ( (lv_lifeState_1_1= RULE_CREATED | lv_lifeState_1_2= RULE_DETACHED | lv_lifeState_1_3= RULE_DISCHARGED | lv_lifeState_1_4= RULE_EXPIRED | lv_lifeState_1_5= RULE_VIOLATED ) ) ) ( (lv_label_2_0= RULE_ID ) ) ) )
            {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:943:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( ( (lv_lifeState_1_1= RULE_CREATED | lv_lifeState_1_2= RULE_DETACHED | lv_lifeState_1_3= RULE_DISCHARGED | lv_lifeState_1_4= RULE_EXPIRED | lv_lifeState_1_5= RULE_VIOLATED ) ) ) ( (lv_label_2_0= RULE_ID ) ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=RULE_CREATED && LA10_0<=RULE_VIOLATED)) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:943:2: ( (lv_name_0_0= RULE_ID ) )
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:943:2: ( (lv_name_0_0= RULE_ID ) )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:944:1: (lv_name_0_0= RULE_ID )
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:944:1: (lv_name_0_0= RULE_ID )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:945:3: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEvent1713); 

                    			newLeafNode(lv_name_0_0, grammarAccess.getEventAccess().getNameIDTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEventRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_0_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:962:6: ( ( ( (lv_lifeState_1_1= RULE_CREATED | lv_lifeState_1_2= RULE_DETACHED | lv_lifeState_1_3= RULE_DISCHARGED | lv_lifeState_1_4= RULE_EXPIRED | lv_lifeState_1_5= RULE_VIOLATED ) ) ) ( (lv_label_2_0= RULE_ID ) ) )
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:962:6: ( ( ( (lv_lifeState_1_1= RULE_CREATED | lv_lifeState_1_2= RULE_DETACHED | lv_lifeState_1_3= RULE_DISCHARGED | lv_lifeState_1_4= RULE_EXPIRED | lv_lifeState_1_5= RULE_VIOLATED ) ) ) ( (lv_label_2_0= RULE_ID ) ) )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:962:7: ( ( (lv_lifeState_1_1= RULE_CREATED | lv_lifeState_1_2= RULE_DETACHED | lv_lifeState_1_3= RULE_DISCHARGED | lv_lifeState_1_4= RULE_EXPIRED | lv_lifeState_1_5= RULE_VIOLATED ) ) ) ( (lv_label_2_0= RULE_ID ) )
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:962:7: ( ( (lv_lifeState_1_1= RULE_CREATED | lv_lifeState_1_2= RULE_DETACHED | lv_lifeState_1_3= RULE_DISCHARGED | lv_lifeState_1_4= RULE_EXPIRED | lv_lifeState_1_5= RULE_VIOLATED ) ) )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:963:1: ( (lv_lifeState_1_1= RULE_CREATED | lv_lifeState_1_2= RULE_DETACHED | lv_lifeState_1_3= RULE_DISCHARGED | lv_lifeState_1_4= RULE_EXPIRED | lv_lifeState_1_5= RULE_VIOLATED ) )
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:963:1: ( (lv_lifeState_1_1= RULE_CREATED | lv_lifeState_1_2= RULE_DETACHED | lv_lifeState_1_3= RULE_DISCHARGED | lv_lifeState_1_4= RULE_EXPIRED | lv_lifeState_1_5= RULE_VIOLATED ) )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:964:1: (lv_lifeState_1_1= RULE_CREATED | lv_lifeState_1_2= RULE_DETACHED | lv_lifeState_1_3= RULE_DISCHARGED | lv_lifeState_1_4= RULE_EXPIRED | lv_lifeState_1_5= RULE_VIOLATED )
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:964:1: (lv_lifeState_1_1= RULE_CREATED | lv_lifeState_1_2= RULE_DETACHED | lv_lifeState_1_3= RULE_DISCHARGED | lv_lifeState_1_4= RULE_EXPIRED | lv_lifeState_1_5= RULE_VIOLATED )
                    int alt9=5;
                    switch ( input.LA(1) ) {
                    case RULE_CREATED:
                        {
                        alt9=1;
                        }
                        break;
                    case RULE_DETACHED:
                        {
                        alt9=2;
                        }
                        break;
                    case RULE_DISCHARGED:
                        {
                        alt9=3;
                        }
                        break;
                    case RULE_EXPIRED:
                        {
                        alt9=4;
                        }
                        break;
                    case RULE_VIOLATED:
                        {
                        alt9=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }

                    switch (alt9) {
                        case 1 :
                            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:965:3: lv_lifeState_1_1= RULE_CREATED
                            {
                            lv_lifeState_1_1=(Token)match(input,RULE_CREATED,FOLLOW_RULE_CREATED_in_ruleEvent1744); 

                            			newLeafNode(lv_lifeState_1_1, grammarAccess.getEventAccess().getLifeStateCREATEDTerminalRuleCall_1_0_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getEventRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"lifeState",
                                    		lv_lifeState_1_1, 
                                    		"CREATED");
                            	    

                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:980:8: lv_lifeState_1_2= RULE_DETACHED
                            {
                            lv_lifeState_1_2=(Token)match(input,RULE_DETACHED,FOLLOW_RULE_DETACHED_in_ruleEvent1764); 

                            			newLeafNode(lv_lifeState_1_2, grammarAccess.getEventAccess().getLifeStateDETACHEDTerminalRuleCall_1_0_0_1()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getEventRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"lifeState",
                                    		lv_lifeState_1_2, 
                                    		"DETACHED");
                            	    

                            }
                            break;
                        case 3 :
                            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:995:8: lv_lifeState_1_3= RULE_DISCHARGED
                            {
                            lv_lifeState_1_3=(Token)match(input,RULE_DISCHARGED,FOLLOW_RULE_DISCHARGED_in_ruleEvent1784); 

                            			newLeafNode(lv_lifeState_1_3, grammarAccess.getEventAccess().getLifeStateDISCHARGEDTerminalRuleCall_1_0_0_2()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getEventRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"lifeState",
                                    		lv_lifeState_1_3, 
                                    		"DISCHARGED");
                            	    

                            }
                            break;
                        case 4 :
                            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1010:8: lv_lifeState_1_4= RULE_EXPIRED
                            {
                            lv_lifeState_1_4=(Token)match(input,RULE_EXPIRED,FOLLOW_RULE_EXPIRED_in_ruleEvent1804); 

                            			newLeafNode(lv_lifeState_1_4, grammarAccess.getEventAccess().getLifeStateEXPIREDTerminalRuleCall_1_0_0_3()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getEventRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"lifeState",
                                    		lv_lifeState_1_4, 
                                    		"EXPIRED");
                            	    

                            }
                            break;
                        case 5 :
                            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1025:8: lv_lifeState_1_5= RULE_VIOLATED
                            {
                            lv_lifeState_1_5=(Token)match(input,RULE_VIOLATED,FOLLOW_RULE_VIOLATED_in_ruleEvent1824); 

                            			newLeafNode(lv_lifeState_1_5, grammarAccess.getEventAccess().getLifeStateVIOLATEDTerminalRuleCall_1_0_0_4()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getEventRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"lifeState",
                                    		lv_lifeState_1_5, 
                                    		"VIOLATED");
                            	    

                            }
                            break;

                    }


                    }


                    }

                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1043:2: ( (lv_label_2_0= RULE_ID ) )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1044:1: (lv_label_2_0= RULE_ID )
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1044:1: (lv_label_2_0= RULE_ID )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1045:3: lv_label_2_0= RULE_ID
                    {
                    lv_label_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEvent1849); 

                    			newLeafNode(lv_label_2_0, grammarAccess.getEventAccess().getLabelIDTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEventRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"label",
                            		lv_label_2_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleArithExpr"
    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1069:1: entryRuleArithExpr returns [EObject current=null] : iv_ruleArithExpr= ruleArithExpr EOF ;
    public final EObject entryRuleArithExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithExpr = null;


        try {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1070:2: (iv_ruleArithExpr= ruleArithExpr EOF )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1071:2: iv_ruleArithExpr= ruleArithExpr EOF
            {
             newCompositeNode(grammarAccess.getArithExprRule()); 
            pushFollow(FOLLOW_ruleArithExpr_in_entryRuleArithExpr1891);
            iv_ruleArithExpr=ruleArithExpr();

            state._fsp--;

             current =iv_ruleArithExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArithExpr1901); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArithExpr"


    // $ANTLR start "ruleArithExpr"
    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1078:1: ruleArithExpr returns [EObject current=null] : ( ( (lv_leftAttr_0_0= ruleAttribute ) ) ( (lv_binOp_1_0= ruleBinaryOperator ) ) ( ( (lv_rightAttr_2_0= ruleAttribute ) ) | ( (lv_num_3_0= RULE_INT ) ) ) ) ;
    public final EObject ruleArithExpr() throws RecognitionException {
        EObject current = null;

        Token lv_num_3_0=null;
        EObject lv_leftAttr_0_0 = null;

        EObject lv_binOp_1_0 = null;

        EObject lv_rightAttr_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1081:28: ( ( ( (lv_leftAttr_0_0= ruleAttribute ) ) ( (lv_binOp_1_0= ruleBinaryOperator ) ) ( ( (lv_rightAttr_2_0= ruleAttribute ) ) | ( (lv_num_3_0= RULE_INT ) ) ) ) )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1082:1: ( ( (lv_leftAttr_0_0= ruleAttribute ) ) ( (lv_binOp_1_0= ruleBinaryOperator ) ) ( ( (lv_rightAttr_2_0= ruleAttribute ) ) | ( (lv_num_3_0= RULE_INT ) ) ) )
            {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1082:1: ( ( (lv_leftAttr_0_0= ruleAttribute ) ) ( (lv_binOp_1_0= ruleBinaryOperator ) ) ( ( (lv_rightAttr_2_0= ruleAttribute ) ) | ( (lv_num_3_0= RULE_INT ) ) ) )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1082:2: ( (lv_leftAttr_0_0= ruleAttribute ) ) ( (lv_binOp_1_0= ruleBinaryOperator ) ) ( ( (lv_rightAttr_2_0= ruleAttribute ) ) | ( (lv_num_3_0= RULE_INT ) ) )
            {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1082:2: ( (lv_leftAttr_0_0= ruleAttribute ) )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1083:1: (lv_leftAttr_0_0= ruleAttribute )
            {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1083:1: (lv_leftAttr_0_0= ruleAttribute )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1084:3: lv_leftAttr_0_0= ruleAttribute
            {
             
            	        newCompositeNode(grammarAccess.getArithExprAccess().getLeftAttrAttributeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAttribute_in_ruleArithExpr1947);
            lv_leftAttr_0_0=ruleAttribute();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getArithExprRule());
            	        }
                   		set(
                   			current, 
                   			"leftAttr",
                    		lv_leftAttr_0_0, 
                    		"Attribute");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1100:2: ( (lv_binOp_1_0= ruleBinaryOperator ) )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1101:1: (lv_binOp_1_0= ruleBinaryOperator )
            {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1101:1: (lv_binOp_1_0= ruleBinaryOperator )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1102:3: lv_binOp_1_0= ruleBinaryOperator
            {
             
            	        newCompositeNode(grammarAccess.getArithExprAccess().getBinOpBinaryOperatorParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBinaryOperator_in_ruleArithExpr1968);
            lv_binOp_1_0=ruleBinaryOperator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getArithExprRule());
            	        }
                   		set(
                   			current, 
                   			"binOp",
                    		lv_binOp_1_0, 
                    		"BinaryOperator");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1118:2: ( ( (lv_rightAttr_2_0= ruleAttribute ) ) | ( (lv_num_3_0= RULE_INT ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_INT) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1118:3: ( (lv_rightAttr_2_0= ruleAttribute ) )
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1118:3: ( (lv_rightAttr_2_0= ruleAttribute ) )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1119:1: (lv_rightAttr_2_0= ruleAttribute )
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1119:1: (lv_rightAttr_2_0= ruleAttribute )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1120:3: lv_rightAttr_2_0= ruleAttribute
                    {
                     
                    	        newCompositeNode(grammarAccess.getArithExprAccess().getRightAttrAttributeParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAttribute_in_ruleArithExpr1990);
                    lv_rightAttr_2_0=ruleAttribute();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArithExprRule());
                    	        }
                           		set(
                           			current, 
                           			"rightAttr",
                            		lv_rightAttr_2_0, 
                            		"Attribute");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1137:6: ( (lv_num_3_0= RULE_INT ) )
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1137:6: ( (lv_num_3_0= RULE_INT ) )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1138:1: (lv_num_3_0= RULE_INT )
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1138:1: (lv_num_3_0= RULE_INT )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1139:3: lv_num_3_0= RULE_INT
                    {
                    lv_num_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleArithExpr2013); 

                    			newLeafNode(lv_num_3_0, grammarAccess.getArithExprAccess().getNumINTTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArithExprRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"num",
                            		lv_num_3_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArithExpr"


    // $ANTLR start "entryRuleTimeStamp"
    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1163:1: entryRuleTimeStamp returns [EObject current=null] : iv_ruleTimeStamp= ruleTimeStamp EOF ;
    public final EObject entryRuleTimeStamp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeStamp = null;


        try {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1164:2: (iv_ruleTimeStamp= ruleTimeStamp EOF )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1165:2: iv_ruleTimeStamp= ruleTimeStamp EOF
            {
             newCompositeNode(grammarAccess.getTimeStampRule()); 
            pushFollow(FOLLOW_ruleTimeStamp_in_entryRuleTimeStamp2055);
            iv_ruleTimeStamp=ruleTimeStamp();

            state._fsp--;

             current =iv_ruleTimeStamp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimeStamp2065); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTimeStamp"


    // $ANTLR start "ruleTimeStamp"
    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1172:1: ruleTimeStamp returns [EObject current=null] : ( ( (lv_val_0_0= RULE_INT ) ) | ( ( (lv_eventReference_1_0= RULE_ID ) ) (this_PLUS_2= RULE_PLUS ( (lv_shift_3_0= RULE_INT ) ) )? ) ) ;
    public final EObject ruleTimeStamp() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;
        Token lv_eventReference_1_0=null;
        Token this_PLUS_2=null;
        Token lv_shift_3_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1175:28: ( ( ( (lv_val_0_0= RULE_INT ) ) | ( ( (lv_eventReference_1_0= RULE_ID ) ) (this_PLUS_2= RULE_PLUS ( (lv_shift_3_0= RULE_INT ) ) )? ) ) )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1176:1: ( ( (lv_val_0_0= RULE_INT ) ) | ( ( (lv_eventReference_1_0= RULE_ID ) ) (this_PLUS_2= RULE_PLUS ( (lv_shift_3_0= RULE_INT ) ) )? ) )
            {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1176:1: ( ( (lv_val_0_0= RULE_INT ) ) | ( ( (lv_eventReference_1_0= RULE_ID ) ) (this_PLUS_2= RULE_PLUS ( (lv_shift_3_0= RULE_INT ) ) )? ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INT) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1176:2: ( (lv_val_0_0= RULE_INT ) )
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1176:2: ( (lv_val_0_0= RULE_INT ) )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1177:1: (lv_val_0_0= RULE_INT )
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1177:1: (lv_val_0_0= RULE_INT )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1178:3: lv_val_0_0= RULE_INT
                    {
                    lv_val_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTimeStamp2107); 

                    			newLeafNode(lv_val_0_0, grammarAccess.getTimeStampAccess().getValINTTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTimeStampRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"val",
                            		lv_val_0_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1195:6: ( ( (lv_eventReference_1_0= RULE_ID ) ) (this_PLUS_2= RULE_PLUS ( (lv_shift_3_0= RULE_INT ) ) )? )
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1195:6: ( ( (lv_eventReference_1_0= RULE_ID ) ) (this_PLUS_2= RULE_PLUS ( (lv_shift_3_0= RULE_INT ) ) )? )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1195:7: ( (lv_eventReference_1_0= RULE_ID ) ) (this_PLUS_2= RULE_PLUS ( (lv_shift_3_0= RULE_INT ) ) )?
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1195:7: ( (lv_eventReference_1_0= RULE_ID ) )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1196:1: (lv_eventReference_1_0= RULE_ID )
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1196:1: (lv_eventReference_1_0= RULE_ID )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1197:3: lv_eventReference_1_0= RULE_ID
                    {
                    lv_eventReference_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTimeStamp2136); 

                    			newLeafNode(lv_eventReference_1_0, grammarAccess.getTimeStampAccess().getEventReferenceIDTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTimeStampRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"eventReference",
                            		lv_eventReference_1_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1213:2: (this_PLUS_2= RULE_PLUS ( (lv_shift_3_0= RULE_INT ) ) )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==RULE_PLUS) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1213:3: this_PLUS_2= RULE_PLUS ( (lv_shift_3_0= RULE_INT ) )
                            {
                            this_PLUS_2=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleTimeStamp2153); 
                             
                                newLeafNode(this_PLUS_2, grammarAccess.getTimeStampAccess().getPLUSTerminalRuleCall_1_1_0()); 
                                
                            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1217:1: ( (lv_shift_3_0= RULE_INT ) )
                            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1218:1: (lv_shift_3_0= RULE_INT )
                            {
                            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1218:1: (lv_shift_3_0= RULE_INT )
                            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1219:3: lv_shift_3_0= RULE_INT
                            {
                            lv_shift_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTimeStamp2169); 

                            			newLeafNode(lv_shift_3_0, grammarAccess.getTimeStampAccess().getShiftINTTerminalRuleCall_1_1_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getTimeStampRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"shift",
                                    		lv_shift_3_0, 
                                    		"INT");
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimeStamp"


    // $ANTLR start "entryRuleBinaryOperator"
    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1243:1: entryRuleBinaryOperator returns [EObject current=null] : iv_ruleBinaryOperator= ruleBinaryOperator EOF ;
    public final EObject entryRuleBinaryOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryOperator = null;


        try {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1244:2: (iv_ruleBinaryOperator= ruleBinaryOperator EOF )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1245:2: iv_ruleBinaryOperator= ruleBinaryOperator EOF
            {
             newCompositeNode(grammarAccess.getBinaryOperatorRule()); 
            pushFollow(FOLLOW_ruleBinaryOperator_in_entryRuleBinaryOperator2213);
            iv_ruleBinaryOperator=ruleBinaryOperator();

            state._fsp--;

             current =iv_ruleBinaryOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinaryOperator2223); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinaryOperator"


    // $ANTLR start "ruleBinaryOperator"
    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1252:1: ruleBinaryOperator returns [EObject current=null] : ( ( (lv_op_0_1= RULE_LT | lv_op_0_2= RULE_LEQ | lv_op_0_3= RULE_EQ | lv_op_0_4= RULE_GT | lv_op_0_5= RULE_GEQ ) ) ) ;
    public final EObject ruleBinaryOperator() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_1=null;
        Token lv_op_0_2=null;
        Token lv_op_0_3=null;
        Token lv_op_0_4=null;
        Token lv_op_0_5=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1255:28: ( ( ( (lv_op_0_1= RULE_LT | lv_op_0_2= RULE_LEQ | lv_op_0_3= RULE_EQ | lv_op_0_4= RULE_GT | lv_op_0_5= RULE_GEQ ) ) ) )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1256:1: ( ( (lv_op_0_1= RULE_LT | lv_op_0_2= RULE_LEQ | lv_op_0_3= RULE_EQ | lv_op_0_4= RULE_GT | lv_op_0_5= RULE_GEQ ) ) )
            {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1256:1: ( ( (lv_op_0_1= RULE_LT | lv_op_0_2= RULE_LEQ | lv_op_0_3= RULE_EQ | lv_op_0_4= RULE_GT | lv_op_0_5= RULE_GEQ ) ) )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1257:1: ( (lv_op_0_1= RULE_LT | lv_op_0_2= RULE_LEQ | lv_op_0_3= RULE_EQ | lv_op_0_4= RULE_GT | lv_op_0_5= RULE_GEQ ) )
            {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1257:1: ( (lv_op_0_1= RULE_LT | lv_op_0_2= RULE_LEQ | lv_op_0_3= RULE_EQ | lv_op_0_4= RULE_GT | lv_op_0_5= RULE_GEQ ) )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1258:1: (lv_op_0_1= RULE_LT | lv_op_0_2= RULE_LEQ | lv_op_0_3= RULE_EQ | lv_op_0_4= RULE_GT | lv_op_0_5= RULE_GEQ )
            {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1258:1: (lv_op_0_1= RULE_LT | lv_op_0_2= RULE_LEQ | lv_op_0_3= RULE_EQ | lv_op_0_4= RULE_GT | lv_op_0_5= RULE_GEQ )
            int alt14=5;
            switch ( input.LA(1) ) {
            case RULE_LT:
                {
                alt14=1;
                }
                break;
            case RULE_LEQ:
                {
                alt14=2;
                }
                break;
            case RULE_EQ:
                {
                alt14=3;
                }
                break;
            case RULE_GT:
                {
                alt14=4;
                }
                break;
            case RULE_GEQ:
                {
                alt14=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1259:3: lv_op_0_1= RULE_LT
                    {
                    lv_op_0_1=(Token)match(input,RULE_LT,FOLLOW_RULE_LT_in_ruleBinaryOperator2266); 

                    			newLeafNode(lv_op_0_1, grammarAccess.getBinaryOperatorAccess().getOpLTTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBinaryOperatorRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"op",
                            		lv_op_0_1, 
                            		"LT");
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1274:8: lv_op_0_2= RULE_LEQ
                    {
                    lv_op_0_2=(Token)match(input,RULE_LEQ,FOLLOW_RULE_LEQ_in_ruleBinaryOperator2286); 

                    			newLeafNode(lv_op_0_2, grammarAccess.getBinaryOperatorAccess().getOpLEQTerminalRuleCall_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBinaryOperatorRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"op",
                            		lv_op_0_2, 
                            		"LEQ");
                    	    

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1289:8: lv_op_0_3= RULE_EQ
                    {
                    lv_op_0_3=(Token)match(input,RULE_EQ,FOLLOW_RULE_EQ_in_ruleBinaryOperator2306); 

                    			newLeafNode(lv_op_0_3, grammarAccess.getBinaryOperatorAccess().getOpEQTerminalRuleCall_0_2()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBinaryOperatorRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"op",
                            		lv_op_0_3, 
                            		"EQ");
                    	    

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1304:8: lv_op_0_4= RULE_GT
                    {
                    lv_op_0_4=(Token)match(input,RULE_GT,FOLLOW_RULE_GT_in_ruleBinaryOperator2326); 

                    			newLeafNode(lv_op_0_4, grammarAccess.getBinaryOperatorAccess().getOpGTTerminalRuleCall_0_3()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBinaryOperatorRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"op",
                            		lv_op_0_4, 
                            		"GT");
                    	    

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1319:8: lv_op_0_5= RULE_GEQ
                    {
                    lv_op_0_5=(Token)match(input,RULE_GEQ,FOLLOW_RULE_GEQ_in_ruleBinaryOperator2346); 

                    			newLeafNode(lv_op_0_5, grammarAccess.getBinaryOperatorAccess().getOpGEQTerminalRuleCall_0_4()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBinaryOperatorRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"op",
                            		lv_op_0_5, 
                            		"GEQ");
                    	    

                    }
                    break;

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinaryOperator"


    // $ANTLR start "entryRuleAttribute"
    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1345:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1346:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1347:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute2389);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute2399); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1354:1: ruleAttribute returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1357:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1358:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1358:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1359:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1359:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1360:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute2440); 

            			newLeafNode(lv_name_0_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleEventOperator"
    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1384:1: entryRuleEventOperator returns [String current=null] : iv_ruleEventOperator= ruleEventOperator EOF ;
    public final String entryRuleEventOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEventOperator = null;


        try {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1385:2: (iv_ruleEventOperator= ruleEventOperator EOF )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1386:2: iv_ruleEventOperator= ruleEventOperator EOF
            {
             newCompositeNode(grammarAccess.getEventOperatorRule()); 
            pushFollow(FOLLOW_ruleEventOperator_in_entryRuleEventOperator2481);
            iv_ruleEventOperator=ruleEventOperator();

            state._fsp--;

             current =iv_ruleEventOperator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventOperator2492); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEventOperator"


    // $ANTLR start "ruleEventOperator"
    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1393:1: ruleEventOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_AND_0= RULE_AND | this_OR_1= RULE_OR | this_EXCEPT_2= RULE_EXCEPT ) ;
    public final AntlrDatatypeRuleToken ruleEventOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_AND_0=null;
        Token this_OR_1=null;
        Token this_EXCEPT_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1396:28: ( (this_AND_0= RULE_AND | this_OR_1= RULE_OR | this_EXCEPT_2= RULE_EXCEPT ) )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1397:1: (this_AND_0= RULE_AND | this_OR_1= RULE_OR | this_EXCEPT_2= RULE_EXCEPT )
            {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1397:1: (this_AND_0= RULE_AND | this_OR_1= RULE_OR | this_EXCEPT_2= RULE_EXCEPT )
            int alt15=3;
            switch ( input.LA(1) ) {
            case RULE_AND:
                {
                alt15=1;
                }
                break;
            case RULE_OR:
                {
                alt15=2;
                }
                break;
            case RULE_EXCEPT:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1397:6: this_AND_0= RULE_AND
                    {
                    this_AND_0=(Token)match(input,RULE_AND,FOLLOW_RULE_AND_in_ruleEventOperator2532); 

                    		current.merge(this_AND_0);
                        
                     
                        newLeafNode(this_AND_0, grammarAccess.getEventOperatorAccess().getANDTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1405:10: this_OR_1= RULE_OR
                    {
                    this_OR_1=(Token)match(input,RULE_OR,FOLLOW_RULE_OR_in_ruleEventOperator2558); 

                    		current.merge(this_OR_1);
                        
                     
                        newLeafNode(this_OR_1, grammarAccess.getEventOperatorAccess().getORTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1413:10: this_EXCEPT_2= RULE_EXCEPT
                    {
                    this_EXCEPT_2=(Token)match(input,RULE_EXCEPT,FOLLOW_RULE_EXCEPT_in_ruleEventOperator2584); 

                    		current.merge(this_EXCEPT_2);
                        
                     
                        newLeafNode(this_EXCEPT_2, grammarAccess.getEventOperatorAccess().getEXCEPTTerminalRuleCall_2()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEventOperator"

    // Delegated rules


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA7_eotS =
        "\36\uffff";
    static final String DFA7_eofS =
        "\1\uffff\1\12\11\uffff\1\12\5\uffff\1\12\2\uffff\1\12\3\uffff\1\12\2\uffff\1\12\2\uffff";
    static final String DFA7_minS =
        "\1\5\1\7\5\12\2\uffff\1\6\1\uffff\1\7\1\12\2\6\2\22\1\7\1\12\1\30\1\7\1\30\2\22\1\7\1\6\1\22\1\7\1\30\1\22";
    static final String DFA7_maxS =
        "\1\27\1\41\5\12\2\uffff\1\30\1\uffff\1\41\1\30\1\6\1\31\1\22\1\31\1\41\2\30\1\41\1\30\1\22\1\31\1\41\1\6\1\22\1\41\1\30\1\22";
    static final String DFA7_acceptS =
        "\7\uffff\1\3\1\2\1\uffff\1\1\23\uffff";
    static final String DFA7_specialS =
        "\36\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\7\4\uffff\1\1\10\uffff\1\2\1\3\1\4\1\5\1\6",
            "\1\12\3\uffff\1\12\2\uffff\3\12\1\11\15\uffff\3\10",
            "\1\13",
            "\1\13",
            "\1\13",
            "\1\13",
            "\1\13",
            "",
            "",
            "\1\14\3\uffff\1\16\15\uffff\1\15",
            "",
            "\1\12\3\uffff\1\12\2\uffff\3\12\1\11\15\uffff\3\10",
            "\1\20\7\uffff\1\21\5\uffff\1\17",
            "\1\22",
            "\1\22\22\uffff\1\23",
            "\1\24",
            "\1\24\6\uffff\1\25",
            "\1\12\3\uffff\1\12\2\uffff\3\12\16\uffff\3\10",
            "\1\27\7\uffff\1\30\5\uffff\1\26",
            "\1\31",
            "\1\12\3\uffff\1\12\2\uffff\3\12\16\uffff\3\10",
            "\1\32",
            "\1\33",
            "\1\33\6\uffff\1\34",
            "\1\12\3\uffff\1\12\2\uffff\3\12\16\uffff\3\10",
            "\1\22",
            "\1\24",
            "\1\12\3\uffff\1\12\2\uffff\3\12\16\uffff\3\10",
            "\1\35",
            "\1\33"
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
            return "587:1: ( ( (lv_interval_0_0= ruleInterval ) ) | ( ( (lv_left_1_0= ruleInterval ) ) ( (lv_op_2_0= ruleEventOperator ) ) ( (lv_right_3_0= ruleExpr ) ) ) | (this_LPAREN_4= RULE_LPAREN ( (lv_expr_5_0= ruleExpr ) ) this_RPAREN_6= RULE_RPAREN ) )";
        }
    }
    static final String DFA8_eotS =
        "\24\uffff";
    static final String DFA8_eofS =
        "\1\uffff\1\10\7\uffff\1\10\12\uffff";
    static final String DFA8_minS =
        "\1\12\1\7\5\12\1\6\1\uffff\1\7\1\12\2\6\2\uffff\1\12\1\30\2\uffff\1\6";
    static final String DFA8_maxS =
        "\1\27\1\41\5\12\1\30\1\uffff\1\41\1\30\1\6\1\31\2\uffff\2\30\2\uffff\1\6";
    static final String DFA8_acceptS =
        "\10\uffff\1\1\4\uffff\1\3\1\5\2\uffff\1\4\1\2\1\uffff";
    static final String DFA8_specialS =
        "\24\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\1\10\uffff\1\2\1\3\1\4\1\5\1\6",
            "\1\10\3\uffff\1\10\2\uffff\3\10\1\7\15\uffff\3\10",
            "\1\11",
            "\1\11",
            "\1\11",
            "\1\11",
            "\1\11",
            "\1\12\3\uffff\1\14\15\uffff\1\13",
            "",
            "\1\10\3\uffff\1\10\2\uffff\3\10\1\7\15\uffff\3\10",
            "\1\15\7\uffff\1\16\5\uffff\1\15",
            "\1\17",
            "\1\17\22\uffff\1\20",
            "",
            "",
            "\1\22\7\uffff\1\21\5\uffff\1\22",
            "\1\23",
            "",
            "",
            "\1\17"
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
            return "708:1: ( ( (lv_event_0_0= ruleEvent ) ) | ( ( (lv_event_1_0= ruleEvent ) ) this_LBRACKET_2= RULE_LBRACKET ( (lv_left_3_0= ruleTimeStamp ) ) this_COMMA_4= RULE_COMMA ( (lv_right_5_0= ruleTimeStamp ) ) this_RBRACKET_6= RULE_RBRACKET ) | ( ( (lv_event_7_0= ruleEvent ) ) this_LBRACKET_8= RULE_LBRACKET this_COMMA_9= RULE_COMMA ( (lv_right_10_0= ruleTimeStamp ) ) this_RBRACKET_11= RULE_RBRACKET ) | ( ( (lv_event_12_0= ruleEvent ) ) this_LBRACKET_13= RULE_LBRACKET ( (lv_left_14_0= ruleTimeStamp ) ) this_COMMA_15= RULE_COMMA this_RBRACKET_16= RULE_RBRACKET ) | ( ( (lv_event_17_0= ruleEvent ) ) this_LBRACKET_18= RULE_LBRACKET this_COMMA_19= RULE_COMMA this_RBRACKET_20= RULE_RBRACKET ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleCupido_in_entryRuleCupido75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCupido85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemata_in_ruleCupido132 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleCommitment_in_ruleCupido152 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleSchemata_in_entryRuleSchemata189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemata199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SCHEMA_in_ruleSchemata235 = new BitSet(new long[]{0x0000000000F80400L});
    public static final BitSet FOLLOW_ruleEventRelation_in_ruleSchemata255 = new BitSet(new long[]{0x0000000000F80402L});
    public static final BitSet FOLLOW_ruleEventRelation_in_entryRuleEventRelation292 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventRelation302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleEventRelation348 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleEventRelation359 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ruleParam_in_ruleEventRelation379 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleEventRelation391 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ruleParam_in_ruleEventRelation411 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleEventRelation424 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_KEY_in_ruleEventRelation434 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ruleParam_in_ruleEventRelation454 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleEventRelation466 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ruleParam_in_ruleEventRelation486 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_RULE_TIME_in_ruleEventRelation499 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ruleParam_in_ruleEventRelation519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_entryRuleParam555 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParam565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParam606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommitment_in_entryRuleCommitment646 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommitment656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMIT_in_ruleCommitment692 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCommitment708 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCommitment730 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_TO_in_ruleCommitment746 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCommitment762 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_CREATE_in_ruleCommitment778 = new BitSet(new long[]{0x0000000000F80420L});
    public static final BitSet FOLLOW_ruleGeneralExpr_in_ruleCommitment798 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_RULE_DETACH_in_ruleCommitment810 = new BitSet(new long[]{0x0000000000F80420L});
    public static final BitSet FOLLOW_ruleGeneralExpr_in_ruleCommitment830 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_DISCHARGE_in_ruleCommitment843 = new BitSet(new long[]{0x0000000000F80420L});
    public static final BitSet FOLLOW_ruleGeneralExpr_in_ruleCommitment863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGeneralExpr_in_entryRuleGeneralExpr899 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGeneralExpr909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleGeneralExpr955 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_RULE_WHERE_in_ruleGeneralExpr973 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ruleArithExpr_in_ruleGeneralExpr999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_entryRuleExpr1037 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpr1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterval_in_ruleExpr1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterval_in_ruleExpr1121 = new BitSet(new long[]{0x0000000380000000L});
    public static final BitSet FOLLOW_ruleEventOperator_in_ruleExpr1142 = new BitSet(new long[]{0x0000000000F80420L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExpr1163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleExpr1182 = new BitSet(new long[]{0x0000000000F80420L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExpr1202 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleExpr1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterval_in_entryRuleInterval1249 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterval1259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleInterval1305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleInterval1333 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RULE_LBRACKET_in_ruleInterval1344 = new BitSet(new long[]{0x0000000001000400L});
    public static final BitSet FOLLOW_ruleTimeStamp_in_ruleInterval1364 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleInterval1375 = new BitSet(new long[]{0x0000000001000400L});
    public static final BitSet FOLLOW_ruleTimeStamp_in_ruleInterval1395 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_RBRACKET_in_ruleInterval1406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleInterval1434 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RULE_LBRACKET_in_ruleInterval1445 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleInterval1455 = new BitSet(new long[]{0x0000000001000400L});
    public static final BitSet FOLLOW_ruleTimeStamp_in_ruleInterval1475 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_RBRACKET_in_ruleInterval1486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleInterval1514 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RULE_LBRACKET_in_ruleInterval1525 = new BitSet(new long[]{0x0000000001000400L});
    public static final BitSet FOLLOW_ruleTimeStamp_in_ruleInterval1545 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleInterval1556 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_RBRACKET_in_ruleInterval1566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleInterval1594 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RULE_LBRACKET_in_ruleInterval1605 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleInterval1615 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_RBRACKET_in_ruleInterval1625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent1661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent1671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEvent1713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CREATED_in_ruleEvent1744 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_DETACHED_in_ruleEvent1764 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_DISCHARGED_in_ruleEvent1784 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_EXPIRED_in_ruleEvent1804 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_VIOLATED_in_ruleEvent1824 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEvent1849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithExpr_in_entryRuleArithExpr1891 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArithExpr1901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleArithExpr1947 = new BitSet(new long[]{0x000000007C000000L});
    public static final BitSet FOLLOW_ruleBinaryOperator_in_ruleArithExpr1968 = new BitSet(new long[]{0x0000000001000400L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleArithExpr1990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleArithExpr2013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeStamp_in_entryRuleTimeStamp2055 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimeStamp2065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTimeStamp2107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTimeStamp2136 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleTimeStamp2153 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTimeStamp2169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryOperator_in_entryRuleBinaryOperator2213 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinaryOperator2223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LT_in_ruleBinaryOperator2266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LEQ_in_ruleBinaryOperator2286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EQ_in_ruleBinaryOperator2306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_GT_in_ruleBinaryOperator2326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_GEQ_in_ruleBinaryOperator2346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute2389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute2399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute2440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventOperator_in_entryRuleEventOperator2481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventOperator2492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_AND_in_ruleEventOperator2532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OR_in_ruleEventOperator2558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EXCEPT_in_ruleEventOperator2584 = new BitSet(new long[]{0x0000000000000002L});

}