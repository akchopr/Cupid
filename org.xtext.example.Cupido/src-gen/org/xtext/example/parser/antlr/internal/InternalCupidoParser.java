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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SCHEMA", "RULE_LPAREN", "RULE_COMMA", "RULE_RPAREN", "RULE_KEY", "RULE_TIME", "RULE_ID", "RULE_COMMIT", "RULE_TO", "RULE_CREATE", "RULE_DETACH", "RULE_DISCHARGE", "RULE_EXCEPT", "RULE_OR", "RULE_AND", "RULE_WHERE", "RULE_STRING", "RULE_LBRACKET", "RULE_RBRACKET", "RULE_CREATED", "RULE_DETACHED", "RULE_DISCHARGED", "RULE_EXPIRED", "RULE_VIOLATED", "RULE_INT", "RULE_PLUS", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_LBRACKET=21;
    public static final int RULE_TO=12;
    public static final int RULE_KEY=8;
    public static final int RULE_STRING=20;
    public static final int RULE_LPAREN=5;
    public static final int RULE_SCHEMA=4;
    public static final int RULE_AND=18;
    public static final int RULE_SL_COMMENT=31;
    public static final int RULE_CREATE=13;
    public static final int RULE_TIME=9;
    public static final int RULE_PLUS=29;
    public static final int RULE_OR=17;
    public static final int EOF=-1;
    public static final int RULE_ID=10;
    public static final int RULE_DETACH=14;
    public static final int RULE_COMMA=6;
    public static final int RULE_EXPIRED=26;
    public static final int RULE_WS=32;
    public static final int RULE_DETACHED=24;
    public static final int RULE_WHERE=19;
    public static final int RULE_ANY_OTHER=33;
    public static final int RULE_RPAREN=7;
    public static final int RULE_DISCHARGED=25;
    public static final int RULE_INT=28;
    public static final int RULE_EXCEPT=16;
    public static final int RULE_VIOLATED=27;
    public static final int RULE_ML_COMMENT=30;
    public static final int RULE_CREATED=23;
    public static final int RULE_COMMIT=11;
    public static final int RULE_DISCHARGE=15;
    public static final int RULE_RBRACKET=22;

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
    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:359:1: ruleCommitment returns [EObject current=null] : (this_COMMIT_0= RULE_COMMIT ( (lv_label_1_0= RULE_ID ) ) ( (lv_debtor_2_0= RULE_ID ) ) this_TO_3= RULE_TO ( (lv_creditor_4_0= RULE_ID ) ) this_CREATE_5= RULE_CREATE ( (lv_trigger_6_0= ruleEExpr ) ) (this_DETACH_7= RULE_DETACH ( (lv_antecedent_8_0= ruleEExpr ) ) )? this_DISCHARGE_9= RULE_DISCHARGE ( (lv_consequent_10_0= ruleEExpr ) ) ) ;
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
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:362:28: ( (this_COMMIT_0= RULE_COMMIT ( (lv_label_1_0= RULE_ID ) ) ( (lv_debtor_2_0= RULE_ID ) ) this_TO_3= RULE_TO ( (lv_creditor_4_0= RULE_ID ) ) this_CREATE_5= RULE_CREATE ( (lv_trigger_6_0= ruleEExpr ) ) (this_DETACH_7= RULE_DETACH ( (lv_antecedent_8_0= ruleEExpr ) ) )? this_DISCHARGE_9= RULE_DISCHARGE ( (lv_consequent_10_0= ruleEExpr ) ) ) )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:363:1: (this_COMMIT_0= RULE_COMMIT ( (lv_label_1_0= RULE_ID ) ) ( (lv_debtor_2_0= RULE_ID ) ) this_TO_3= RULE_TO ( (lv_creditor_4_0= RULE_ID ) ) this_CREATE_5= RULE_CREATE ( (lv_trigger_6_0= ruleEExpr ) ) (this_DETACH_7= RULE_DETACH ( (lv_antecedent_8_0= ruleEExpr ) ) )? this_DISCHARGE_9= RULE_DISCHARGE ( (lv_consequent_10_0= ruleEExpr ) ) )
            {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:363:1: (this_COMMIT_0= RULE_COMMIT ( (lv_label_1_0= RULE_ID ) ) ( (lv_debtor_2_0= RULE_ID ) ) this_TO_3= RULE_TO ( (lv_creditor_4_0= RULE_ID ) ) this_CREATE_5= RULE_CREATE ( (lv_trigger_6_0= ruleEExpr ) ) (this_DETACH_7= RULE_DETACH ( (lv_antecedent_8_0= ruleEExpr ) ) )? this_DISCHARGE_9= RULE_DISCHARGE ( (lv_consequent_10_0= ruleEExpr ) ) )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:363:2: this_COMMIT_0= RULE_COMMIT ( (lv_label_1_0= RULE_ID ) ) ( (lv_debtor_2_0= RULE_ID ) ) this_TO_3= RULE_TO ( (lv_creditor_4_0= RULE_ID ) ) this_CREATE_5= RULE_CREATE ( (lv_trigger_6_0= ruleEExpr ) ) (this_DETACH_7= RULE_DETACH ( (lv_antecedent_8_0= ruleEExpr ) ) )? this_DISCHARGE_9= RULE_DISCHARGE ( (lv_consequent_10_0= ruleEExpr ) )
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
                
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:429:1: ( (lv_trigger_6_0= ruleEExpr ) )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:430:1: (lv_trigger_6_0= ruleEExpr )
            {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:430:1: (lv_trigger_6_0= ruleEExpr )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:431:3: lv_trigger_6_0= ruleEExpr
            {
             
            	        newCompositeNode(grammarAccess.getCommitmentAccess().getTriggerEExprParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleEExpr_in_ruleCommitment798);
            lv_trigger_6_0=ruleEExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCommitmentRule());
            	        }
                   		set(
                   			current, 
                   			"trigger",
                    		lv_trigger_6_0, 
                    		"EExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:447:2: (this_DETACH_7= RULE_DETACH ( (lv_antecedent_8_0= ruleEExpr ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_DETACH) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:447:3: this_DETACH_7= RULE_DETACH ( (lv_antecedent_8_0= ruleEExpr ) )
                    {
                    this_DETACH_7=(Token)match(input,RULE_DETACH,FOLLOW_RULE_DETACH_in_ruleCommitment810); 
                     
                        newLeafNode(this_DETACH_7, grammarAccess.getCommitmentAccess().getDETACHTerminalRuleCall_7_0()); 
                        
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:451:1: ( (lv_antecedent_8_0= ruleEExpr ) )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:452:1: (lv_antecedent_8_0= ruleEExpr )
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:452:1: (lv_antecedent_8_0= ruleEExpr )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:453:3: lv_antecedent_8_0= ruleEExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getCommitmentAccess().getAntecedentEExprParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEExpr_in_ruleCommitment830);
                    lv_antecedent_8_0=ruleEExpr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCommitmentRule());
                    	        }
                           		set(
                           			current, 
                           			"antecedent",
                            		lv_antecedent_8_0, 
                            		"EExpr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            this_DISCHARGE_9=(Token)match(input,RULE_DISCHARGE,FOLLOW_RULE_DISCHARGE_in_ruleCommitment843); 
             
                newLeafNode(this_DISCHARGE_9, grammarAccess.getCommitmentAccess().getDISCHARGETerminalRuleCall_8()); 
                
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:473:1: ( (lv_consequent_10_0= ruleEExpr ) )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:474:1: (lv_consequent_10_0= ruleEExpr )
            {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:474:1: (lv_consequent_10_0= ruleEExpr )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:475:3: lv_consequent_10_0= ruleEExpr
            {
             
            	        newCompositeNode(grammarAccess.getCommitmentAccess().getConsequentEExprParserRuleCall_9_0()); 
            	    
            pushFollow(FOLLOW_ruleEExpr_in_ruleCommitment863);
            lv_consequent_10_0=ruleEExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCommitmentRule());
            	        }
                   		set(
                   			current, 
                   			"consequent",
                    		lv_consequent_10_0, 
                    		"EExpr");
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


    // $ANTLR start "entryRuleEExpr"
    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:499:1: entryRuleEExpr returns [EObject current=null] : iv_ruleEExpr= ruleEExpr EOF ;
    public final EObject entryRuleEExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEExpr = null;


        try {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:500:2: (iv_ruleEExpr= ruleEExpr EOF )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:501:2: iv_ruleEExpr= ruleEExpr EOF
            {
             newCompositeNode(grammarAccess.getEExprRule()); 
            pushFollow(FOLLOW_ruleEExpr_in_entryRuleEExpr899);
            iv_ruleEExpr=ruleEExpr();

            state._fsp--;

             current =iv_ruleEExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEExpr909); 

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
    // $ANTLR end "entryRuleEExpr"


    // $ANTLR start "ruleEExpr"
    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:508:1: ruleEExpr returns [EObject current=null] : (this_OExpr_0= ruleOExpr ( () this_EXCEPT_2= RULE_EXCEPT ( (lv_right_3_0= ruleOExpr ) ) )* ) ;
    public final EObject ruleEExpr() throws RecognitionException {
        EObject current = null;

        Token this_EXCEPT_2=null;
        EObject this_OExpr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:511:28: ( (this_OExpr_0= ruleOExpr ( () this_EXCEPT_2= RULE_EXCEPT ( (lv_right_3_0= ruleOExpr ) ) )* ) )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:512:1: (this_OExpr_0= ruleOExpr ( () this_EXCEPT_2= RULE_EXCEPT ( (lv_right_3_0= ruleOExpr ) ) )* )
            {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:512:1: (this_OExpr_0= ruleOExpr ( () this_EXCEPT_2= RULE_EXCEPT ( (lv_right_3_0= ruleOExpr ) ) )* )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:513:5: this_OExpr_0= ruleOExpr ( () this_EXCEPT_2= RULE_EXCEPT ( (lv_right_3_0= ruleOExpr ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getEExprAccess().getOExprParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleOExpr_in_ruleEExpr956);
            this_OExpr_0=ruleOExpr();

            state._fsp--;

             
                    current = this_OExpr_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:521:1: ( () this_EXCEPT_2= RULE_EXCEPT ( (lv_right_3_0= ruleOExpr ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_EXCEPT) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:521:2: () this_EXCEPT_2= RULE_EXCEPT ( (lv_right_3_0= ruleOExpr ) )
            	    {
            	    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:521:2: ()
            	    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:522:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getEExprAccess().getEExprLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    this_EXCEPT_2=(Token)match(input,RULE_EXCEPT,FOLLOW_RULE_EXCEPT_in_ruleEExpr976); 
            	     
            	        newLeafNode(this_EXCEPT_2, grammarAccess.getEExprAccess().getEXCEPTTerminalRuleCall_1_1()); 
            	        
            	    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:531:1: ( (lv_right_3_0= ruleOExpr ) )
            	    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:532:1: (lv_right_3_0= ruleOExpr )
            	    {
            	    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:532:1: (lv_right_3_0= ruleOExpr )
            	    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:533:3: lv_right_3_0= ruleOExpr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEExprAccess().getRightOExprParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOExpr_in_ruleEExpr996);
            	    lv_right_3_0=ruleOExpr();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEExprRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"OExpr");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // $ANTLR end "ruleEExpr"


    // $ANTLR start "entryRuleOExpr"
    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:557:1: entryRuleOExpr returns [EObject current=null] : iv_ruleOExpr= ruleOExpr EOF ;
    public final EObject entryRuleOExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOExpr = null;


        try {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:558:2: (iv_ruleOExpr= ruleOExpr EOF )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:559:2: iv_ruleOExpr= ruleOExpr EOF
            {
             newCompositeNode(grammarAccess.getOExprRule()); 
            pushFollow(FOLLOW_ruleOExpr_in_entryRuleOExpr1034);
            iv_ruleOExpr=ruleOExpr();

            state._fsp--;

             current =iv_ruleOExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOExpr1044); 

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
    // $ANTLR end "entryRuleOExpr"


    // $ANTLR start "ruleOExpr"
    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:566:1: ruleOExpr returns [EObject current=null] : (this_AExpr_0= ruleAExpr ( () this_OR_2= RULE_OR ( (lv_right_3_0= ruleAExpr ) ) )* ) ;
    public final EObject ruleOExpr() throws RecognitionException {
        EObject current = null;

        Token this_OR_2=null;
        EObject this_AExpr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:569:28: ( (this_AExpr_0= ruleAExpr ( () this_OR_2= RULE_OR ( (lv_right_3_0= ruleAExpr ) ) )* ) )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:570:1: (this_AExpr_0= ruleAExpr ( () this_OR_2= RULE_OR ( (lv_right_3_0= ruleAExpr ) ) )* )
            {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:570:1: (this_AExpr_0= ruleAExpr ( () this_OR_2= RULE_OR ( (lv_right_3_0= ruleAExpr ) ) )* )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:571:5: this_AExpr_0= ruleAExpr ( () this_OR_2= RULE_OR ( (lv_right_3_0= ruleAExpr ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getOExprAccess().getAExprParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleAExpr_in_ruleOExpr1091);
            this_AExpr_0=ruleAExpr();

            state._fsp--;

             
                    current = this_AExpr_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:579:1: ( () this_OR_2= RULE_OR ( (lv_right_3_0= ruleAExpr ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_OR) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:579:2: () this_OR_2= RULE_OR ( (lv_right_3_0= ruleAExpr ) )
            	    {
            	    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:579:2: ()
            	    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:580:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getOExprAccess().getOExprLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    this_OR_2=(Token)match(input,RULE_OR,FOLLOW_RULE_OR_in_ruleOExpr1111); 
            	     
            	        newLeafNode(this_OR_2, grammarAccess.getOExprAccess().getORTerminalRuleCall_1_1()); 
            	        
            	    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:589:1: ( (lv_right_3_0= ruleAExpr ) )
            	    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:590:1: (lv_right_3_0= ruleAExpr )
            	    {
            	    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:590:1: (lv_right_3_0= ruleAExpr )
            	    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:591:3: lv_right_3_0= ruleAExpr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOExprAccess().getRightAExprParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAExpr_in_ruleOExpr1131);
            	    lv_right_3_0=ruleAExpr();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOExprRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"AExpr");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // $ANTLR end "ruleOExpr"


    // $ANTLR start "entryRuleAExpr"
    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:615:1: entryRuleAExpr returns [EObject current=null] : iv_ruleAExpr= ruleAExpr EOF ;
    public final EObject entryRuleAExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAExpr = null;


        try {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:616:2: (iv_ruleAExpr= ruleAExpr EOF )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:617:2: iv_ruleAExpr= ruleAExpr EOF
            {
             newCompositeNode(grammarAccess.getAExprRule()); 
            pushFollow(FOLLOW_ruleAExpr_in_entryRuleAExpr1169);
            iv_ruleAExpr=ruleAExpr();

            state._fsp--;

             current =iv_ruleAExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAExpr1179); 

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
    // $ANTLR end "entryRuleAExpr"


    // $ANTLR start "ruleAExpr"
    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:624:1: ruleAExpr returns [EObject current=null] : (this_WExpr_0= ruleWExpr ( () this_AND_2= RULE_AND ( (lv_right_3_0= ruleWExpr ) ) )* ) ;
    public final EObject ruleAExpr() throws RecognitionException {
        EObject current = null;

        Token this_AND_2=null;
        EObject this_WExpr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:627:28: ( (this_WExpr_0= ruleWExpr ( () this_AND_2= RULE_AND ( (lv_right_3_0= ruleWExpr ) ) )* ) )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:628:1: (this_WExpr_0= ruleWExpr ( () this_AND_2= RULE_AND ( (lv_right_3_0= ruleWExpr ) ) )* )
            {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:628:1: (this_WExpr_0= ruleWExpr ( () this_AND_2= RULE_AND ( (lv_right_3_0= ruleWExpr ) ) )* )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:629:5: this_WExpr_0= ruleWExpr ( () this_AND_2= RULE_AND ( (lv_right_3_0= ruleWExpr ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAExprAccess().getWExprParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleWExpr_in_ruleAExpr1226);
            this_WExpr_0=ruleWExpr();

            state._fsp--;

             
                    current = this_WExpr_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:637:1: ( () this_AND_2= RULE_AND ( (lv_right_3_0= ruleWExpr ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_AND) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:637:2: () this_AND_2= RULE_AND ( (lv_right_3_0= ruleWExpr ) )
            	    {
            	    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:637:2: ()
            	    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:638:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAExprAccess().getAExprLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    this_AND_2=(Token)match(input,RULE_AND,FOLLOW_RULE_AND_in_ruleAExpr1246); 
            	     
            	        newLeafNode(this_AND_2, grammarAccess.getAExprAccess().getANDTerminalRuleCall_1_1()); 
            	        
            	    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:647:1: ( (lv_right_3_0= ruleWExpr ) )
            	    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:648:1: (lv_right_3_0= ruleWExpr )
            	    {
            	    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:648:1: (lv_right_3_0= ruleWExpr )
            	    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:649:3: lv_right_3_0= ruleWExpr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAExprAccess().getRightWExprParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWExpr_in_ruleAExpr1266);
            	    lv_right_3_0=ruleWExpr();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAExprRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"WExpr");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // $ANTLR end "ruleAExpr"


    // $ANTLR start "entryRuleWExpr"
    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:673:1: entryRuleWExpr returns [EObject current=null] : iv_ruleWExpr= ruleWExpr EOF ;
    public final EObject entryRuleWExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWExpr = null;


        try {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:674:2: (iv_ruleWExpr= ruleWExpr EOF )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:675:2: iv_ruleWExpr= ruleWExpr EOF
            {
             newCompositeNode(grammarAccess.getWExprRule()); 
            pushFollow(FOLLOW_ruleWExpr_in_entryRuleWExpr1304);
            iv_ruleWExpr=ruleWExpr();

            state._fsp--;

             current =iv_ruleWExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWExpr1314); 

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
    // $ANTLR end "entryRuleWExpr"


    // $ANTLR start "ruleWExpr"
    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:682:1: ruleWExpr returns [EObject current=null] : (this_BExpr_0= ruleBExpr ( () this_WHERE_2= RULE_WHERE ( (lv_right_3_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleWExpr() throws RecognitionException {
        EObject current = null;

        Token this_WHERE_2=null;
        Token lv_right_3_0=null;
        EObject this_BExpr_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:685:28: ( (this_BExpr_0= ruleBExpr ( () this_WHERE_2= RULE_WHERE ( (lv_right_3_0= RULE_STRING ) ) )* ) )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:686:1: (this_BExpr_0= ruleBExpr ( () this_WHERE_2= RULE_WHERE ( (lv_right_3_0= RULE_STRING ) ) )* )
            {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:686:1: (this_BExpr_0= ruleBExpr ( () this_WHERE_2= RULE_WHERE ( (lv_right_3_0= RULE_STRING ) ) )* )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:687:5: this_BExpr_0= ruleBExpr ( () this_WHERE_2= RULE_WHERE ( (lv_right_3_0= RULE_STRING ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getWExprAccess().getBExprParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleBExpr_in_ruleWExpr1361);
            this_BExpr_0=ruleBExpr();

            state._fsp--;

             
                    current = this_BExpr_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:695:1: ( () this_WHERE_2= RULE_WHERE ( (lv_right_3_0= RULE_STRING ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_WHERE) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:695:2: () this_WHERE_2= RULE_WHERE ( (lv_right_3_0= RULE_STRING ) )
            	    {
            	    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:695:2: ()
            	    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:696:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getWExprAccess().getWExprLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    this_WHERE_2=(Token)match(input,RULE_WHERE,FOLLOW_RULE_WHERE_in_ruleWExpr1381); 
            	     
            	        newLeafNode(this_WHERE_2, grammarAccess.getWExprAccess().getWHERETerminalRuleCall_1_1()); 
            	        
            	    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:705:1: ( (lv_right_3_0= RULE_STRING ) )
            	    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:706:1: (lv_right_3_0= RULE_STRING )
            	    {
            	    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:706:1: (lv_right_3_0= RULE_STRING )
            	    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:707:3: lv_right_3_0= RULE_STRING
            	    {
            	    lv_right_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWExpr1397); 

            	    			newLeafNode(lv_right_3_0, grammarAccess.getWExprAccess().getRightSTRINGTerminalRuleCall_1_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getWExprRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // $ANTLR end "ruleWExpr"


    // $ANTLR start "entryRuleBExpr"
    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:731:1: entryRuleBExpr returns [EObject current=null] : iv_ruleBExpr= ruleBExpr EOF ;
    public final EObject entryRuleBExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBExpr = null;


        try {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:732:2: (iv_ruleBExpr= ruleBExpr EOF )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:733:2: iv_ruleBExpr= ruleBExpr EOF
            {
             newCompositeNode(grammarAccess.getBExprRule()); 
            pushFollow(FOLLOW_ruleBExpr_in_entryRuleBExpr1440);
            iv_ruleBExpr=ruleBExpr();

            state._fsp--;

             current =iv_ruleBExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBExpr1450); 

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
    // $ANTLR end "entryRuleBExpr"


    // $ANTLR start "ruleBExpr"
    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:740:1: ruleBExpr returns [EObject current=null] : (this_Interval_0= ruleInterval | (this_LPAREN_1= RULE_LPAREN this_EExpr_2= ruleEExpr this_RPAREN_3= RULE_RPAREN ) ) ;
    public final EObject ruleBExpr() throws RecognitionException {
        EObject current = null;

        Token this_LPAREN_1=null;
        Token this_RPAREN_3=null;
        EObject this_Interval_0 = null;

        EObject this_EExpr_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:743:28: ( (this_Interval_0= ruleInterval | (this_LPAREN_1= RULE_LPAREN this_EExpr_2= ruleEExpr this_RPAREN_3= RULE_RPAREN ) ) )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:744:1: (this_Interval_0= ruleInterval | (this_LPAREN_1= RULE_LPAREN this_EExpr_2= ruleEExpr this_RPAREN_3= RULE_RPAREN ) )
            {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:744:1: (this_Interval_0= ruleInterval | (this_LPAREN_1= RULE_LPAREN this_EExpr_2= ruleEExpr this_RPAREN_3= RULE_RPAREN ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID||(LA10_0>=RULE_CREATED && LA10_0<=RULE_VIOLATED)) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_LPAREN) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:745:5: this_Interval_0= ruleInterval
                    {
                     
                            newCompositeNode(grammarAccess.getBExprAccess().getIntervalParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleInterval_in_ruleBExpr1497);
                    this_Interval_0=ruleInterval();

                    state._fsp--;

                     
                            current = this_Interval_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:754:6: (this_LPAREN_1= RULE_LPAREN this_EExpr_2= ruleEExpr this_RPAREN_3= RULE_RPAREN )
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:754:6: (this_LPAREN_1= RULE_LPAREN this_EExpr_2= ruleEExpr this_RPAREN_3= RULE_RPAREN )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:754:7: this_LPAREN_1= RULE_LPAREN this_EExpr_2= ruleEExpr this_RPAREN_3= RULE_RPAREN
                    {
                    this_LPAREN_1=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleBExpr1514); 
                     
                        newLeafNode(this_LPAREN_1, grammarAccess.getBExprAccess().getLPARENTerminalRuleCall_1_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getBExprAccess().getEExprParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleEExpr_in_ruleBExpr1535);
                    this_EExpr_2=ruleEExpr();

                    state._fsp--;

                     
                            current = this_EExpr_2; 
                            afterParserOrEnumRuleCall();
                        
                    this_RPAREN_3=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleBExpr1545); 
                     
                        newLeafNode(this_RPAREN_3, grammarAccess.getBExprAccess().getRPARENTerminalRuleCall_1_2()); 
                        

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
    // $ANTLR end "ruleBExpr"


    // $ANTLR start "entryRuleInterval"
    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:779:1: entryRuleInterval returns [EObject current=null] : iv_ruleInterval= ruleInterval EOF ;
    public final EObject entryRuleInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterval = null;


        try {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:780:2: (iv_ruleInterval= ruleInterval EOF )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:781:2: iv_ruleInterval= ruleInterval EOF
            {
             newCompositeNode(grammarAccess.getIntervalRule()); 
            pushFollow(FOLLOW_ruleInterval_in_entryRuleInterval1581);
            iv_ruleInterval=ruleInterval();

            state._fsp--;

             current =iv_ruleInterval; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterval1591); 

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
    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:788:1: ruleInterval returns [EObject current=null] : ( ( (lv_event_0_0= ruleEvent ) ) | ( ( (lv_event_1_0= ruleEvent ) ) this_LBRACKET_2= RULE_LBRACKET ( (lv_lTime_3_0= ruleTimeStamp ) ) this_COMMA_4= RULE_COMMA ( (lv_rTime_5_0= ruleTimeStamp ) ) this_RBRACKET_6= RULE_RBRACKET ) | ( ( (lv_event_7_0= ruleEvent ) ) this_LBRACKET_8= RULE_LBRACKET this_COMMA_9= RULE_COMMA ( (lv_rTime_10_0= ruleTimeStamp ) ) this_RBRACKET_11= RULE_RBRACKET ) | ( ( (lv_event_12_0= ruleEvent ) ) this_LBRACKET_13= RULE_LBRACKET ( (lv_lTime_14_0= ruleTimeStamp ) ) this_COMMA_15= RULE_COMMA this_RBRACKET_16= RULE_RBRACKET ) | ( ( (lv_event_17_0= ruleEvent ) ) this_LBRACKET_18= RULE_LBRACKET this_COMMA_19= RULE_COMMA this_RBRACKET_20= RULE_RBRACKET ) ) ;
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

        EObject lv_lTime_3_0 = null;

        EObject lv_rTime_5_0 = null;

        EObject lv_event_7_0 = null;

        EObject lv_rTime_10_0 = null;

        EObject lv_event_12_0 = null;

        EObject lv_lTime_14_0 = null;

        EObject lv_event_17_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:791:28: ( ( ( (lv_event_0_0= ruleEvent ) ) | ( ( (lv_event_1_0= ruleEvent ) ) this_LBRACKET_2= RULE_LBRACKET ( (lv_lTime_3_0= ruleTimeStamp ) ) this_COMMA_4= RULE_COMMA ( (lv_rTime_5_0= ruleTimeStamp ) ) this_RBRACKET_6= RULE_RBRACKET ) | ( ( (lv_event_7_0= ruleEvent ) ) this_LBRACKET_8= RULE_LBRACKET this_COMMA_9= RULE_COMMA ( (lv_rTime_10_0= ruleTimeStamp ) ) this_RBRACKET_11= RULE_RBRACKET ) | ( ( (lv_event_12_0= ruleEvent ) ) this_LBRACKET_13= RULE_LBRACKET ( (lv_lTime_14_0= ruleTimeStamp ) ) this_COMMA_15= RULE_COMMA this_RBRACKET_16= RULE_RBRACKET ) | ( ( (lv_event_17_0= ruleEvent ) ) this_LBRACKET_18= RULE_LBRACKET this_COMMA_19= RULE_COMMA this_RBRACKET_20= RULE_RBRACKET ) ) )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:792:1: ( ( (lv_event_0_0= ruleEvent ) ) | ( ( (lv_event_1_0= ruleEvent ) ) this_LBRACKET_2= RULE_LBRACKET ( (lv_lTime_3_0= ruleTimeStamp ) ) this_COMMA_4= RULE_COMMA ( (lv_rTime_5_0= ruleTimeStamp ) ) this_RBRACKET_6= RULE_RBRACKET ) | ( ( (lv_event_7_0= ruleEvent ) ) this_LBRACKET_8= RULE_LBRACKET this_COMMA_9= RULE_COMMA ( (lv_rTime_10_0= ruleTimeStamp ) ) this_RBRACKET_11= RULE_RBRACKET ) | ( ( (lv_event_12_0= ruleEvent ) ) this_LBRACKET_13= RULE_LBRACKET ( (lv_lTime_14_0= ruleTimeStamp ) ) this_COMMA_15= RULE_COMMA this_RBRACKET_16= RULE_RBRACKET ) | ( ( (lv_event_17_0= ruleEvent ) ) this_LBRACKET_18= RULE_LBRACKET this_COMMA_19= RULE_COMMA this_RBRACKET_20= RULE_RBRACKET ) )
            {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:792:1: ( ( (lv_event_0_0= ruleEvent ) ) | ( ( (lv_event_1_0= ruleEvent ) ) this_LBRACKET_2= RULE_LBRACKET ( (lv_lTime_3_0= ruleTimeStamp ) ) this_COMMA_4= RULE_COMMA ( (lv_rTime_5_0= ruleTimeStamp ) ) this_RBRACKET_6= RULE_RBRACKET ) | ( ( (lv_event_7_0= ruleEvent ) ) this_LBRACKET_8= RULE_LBRACKET this_COMMA_9= RULE_COMMA ( (lv_rTime_10_0= ruleTimeStamp ) ) this_RBRACKET_11= RULE_RBRACKET ) | ( ( (lv_event_12_0= ruleEvent ) ) this_LBRACKET_13= RULE_LBRACKET ( (lv_lTime_14_0= ruleTimeStamp ) ) this_COMMA_15= RULE_COMMA this_RBRACKET_16= RULE_RBRACKET ) | ( ( (lv_event_17_0= ruleEvent ) ) this_LBRACKET_18= RULE_LBRACKET this_COMMA_19= RULE_COMMA this_RBRACKET_20= RULE_RBRACKET ) )
            int alt11=5;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:792:2: ( (lv_event_0_0= ruleEvent ) )
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:792:2: ( (lv_event_0_0= ruleEvent ) )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:793:1: (lv_event_0_0= ruleEvent )
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:793:1: (lv_event_0_0= ruleEvent )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:794:3: lv_event_0_0= ruleEvent
                    {
                     
                    	        newCompositeNode(grammarAccess.getIntervalAccess().getEventEventParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEvent_in_ruleInterval1637);
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
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:811:6: ( ( (lv_event_1_0= ruleEvent ) ) this_LBRACKET_2= RULE_LBRACKET ( (lv_lTime_3_0= ruleTimeStamp ) ) this_COMMA_4= RULE_COMMA ( (lv_rTime_5_0= ruleTimeStamp ) ) this_RBRACKET_6= RULE_RBRACKET )
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:811:6: ( ( (lv_event_1_0= ruleEvent ) ) this_LBRACKET_2= RULE_LBRACKET ( (lv_lTime_3_0= ruleTimeStamp ) ) this_COMMA_4= RULE_COMMA ( (lv_rTime_5_0= ruleTimeStamp ) ) this_RBRACKET_6= RULE_RBRACKET )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:811:7: ( (lv_event_1_0= ruleEvent ) ) this_LBRACKET_2= RULE_LBRACKET ( (lv_lTime_3_0= ruleTimeStamp ) ) this_COMMA_4= RULE_COMMA ( (lv_rTime_5_0= ruleTimeStamp ) ) this_RBRACKET_6= RULE_RBRACKET
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:811:7: ( (lv_event_1_0= ruleEvent ) )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:812:1: (lv_event_1_0= ruleEvent )
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:812:1: (lv_event_1_0= ruleEvent )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:813:3: lv_event_1_0= ruleEvent
                    {
                     
                    	        newCompositeNode(grammarAccess.getIntervalAccess().getEventEventParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEvent_in_ruleInterval1665);
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

                    this_LBRACKET_2=(Token)match(input,RULE_LBRACKET,FOLLOW_RULE_LBRACKET_in_ruleInterval1676); 
                     
                        newLeafNode(this_LBRACKET_2, grammarAccess.getIntervalAccess().getLBRACKETTerminalRuleCall_1_1()); 
                        
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:833:1: ( (lv_lTime_3_0= ruleTimeStamp ) )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:834:1: (lv_lTime_3_0= ruleTimeStamp )
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:834:1: (lv_lTime_3_0= ruleTimeStamp )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:835:3: lv_lTime_3_0= ruleTimeStamp
                    {
                     
                    	        newCompositeNode(grammarAccess.getIntervalAccess().getLTimeTimeStampParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTimeStamp_in_ruleInterval1696);
                    lv_lTime_3_0=ruleTimeStamp();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIntervalRule());
                    	        }
                           		set(
                           			current, 
                           			"lTime",
                            		lv_lTime_3_0, 
                            		"TimeStamp");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    this_COMMA_4=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleInterval1707); 
                     
                        newLeafNode(this_COMMA_4, grammarAccess.getIntervalAccess().getCOMMATerminalRuleCall_1_3()); 
                        
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:855:1: ( (lv_rTime_5_0= ruleTimeStamp ) )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:856:1: (lv_rTime_5_0= ruleTimeStamp )
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:856:1: (lv_rTime_5_0= ruleTimeStamp )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:857:3: lv_rTime_5_0= ruleTimeStamp
                    {
                     
                    	        newCompositeNode(grammarAccess.getIntervalAccess().getRTimeTimeStampParserRuleCall_1_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTimeStamp_in_ruleInterval1727);
                    lv_rTime_5_0=ruleTimeStamp();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIntervalRule());
                    	        }
                           		set(
                           			current, 
                           			"rTime",
                            		lv_rTime_5_0, 
                            		"TimeStamp");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    this_RBRACKET_6=(Token)match(input,RULE_RBRACKET,FOLLOW_RULE_RBRACKET_in_ruleInterval1738); 
                     
                        newLeafNode(this_RBRACKET_6, grammarAccess.getIntervalAccess().getRBRACKETTerminalRuleCall_1_5()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:878:6: ( ( (lv_event_7_0= ruleEvent ) ) this_LBRACKET_8= RULE_LBRACKET this_COMMA_9= RULE_COMMA ( (lv_rTime_10_0= ruleTimeStamp ) ) this_RBRACKET_11= RULE_RBRACKET )
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:878:6: ( ( (lv_event_7_0= ruleEvent ) ) this_LBRACKET_8= RULE_LBRACKET this_COMMA_9= RULE_COMMA ( (lv_rTime_10_0= ruleTimeStamp ) ) this_RBRACKET_11= RULE_RBRACKET )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:878:7: ( (lv_event_7_0= ruleEvent ) ) this_LBRACKET_8= RULE_LBRACKET this_COMMA_9= RULE_COMMA ( (lv_rTime_10_0= ruleTimeStamp ) ) this_RBRACKET_11= RULE_RBRACKET
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:878:7: ( (lv_event_7_0= ruleEvent ) )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:879:1: (lv_event_7_0= ruleEvent )
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:879:1: (lv_event_7_0= ruleEvent )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:880:3: lv_event_7_0= ruleEvent
                    {
                     
                    	        newCompositeNode(grammarAccess.getIntervalAccess().getEventEventParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEvent_in_ruleInterval1766);
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

                    this_LBRACKET_8=(Token)match(input,RULE_LBRACKET,FOLLOW_RULE_LBRACKET_in_ruleInterval1777); 
                     
                        newLeafNode(this_LBRACKET_8, grammarAccess.getIntervalAccess().getLBRACKETTerminalRuleCall_2_1()); 
                        
                    this_COMMA_9=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleInterval1787); 
                     
                        newLeafNode(this_COMMA_9, grammarAccess.getIntervalAccess().getCOMMATerminalRuleCall_2_2()); 
                        
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:904:1: ( (lv_rTime_10_0= ruleTimeStamp ) )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:905:1: (lv_rTime_10_0= ruleTimeStamp )
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:905:1: (lv_rTime_10_0= ruleTimeStamp )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:906:3: lv_rTime_10_0= ruleTimeStamp
                    {
                     
                    	        newCompositeNode(grammarAccess.getIntervalAccess().getRTimeTimeStampParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTimeStamp_in_ruleInterval1807);
                    lv_rTime_10_0=ruleTimeStamp();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIntervalRule());
                    	        }
                           		set(
                           			current, 
                           			"rTime",
                            		lv_rTime_10_0, 
                            		"TimeStamp");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    this_RBRACKET_11=(Token)match(input,RULE_RBRACKET,FOLLOW_RULE_RBRACKET_in_ruleInterval1818); 
                     
                        newLeafNode(this_RBRACKET_11, grammarAccess.getIntervalAccess().getRBRACKETTerminalRuleCall_2_4()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:927:6: ( ( (lv_event_12_0= ruleEvent ) ) this_LBRACKET_13= RULE_LBRACKET ( (lv_lTime_14_0= ruleTimeStamp ) ) this_COMMA_15= RULE_COMMA this_RBRACKET_16= RULE_RBRACKET )
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:927:6: ( ( (lv_event_12_0= ruleEvent ) ) this_LBRACKET_13= RULE_LBRACKET ( (lv_lTime_14_0= ruleTimeStamp ) ) this_COMMA_15= RULE_COMMA this_RBRACKET_16= RULE_RBRACKET )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:927:7: ( (lv_event_12_0= ruleEvent ) ) this_LBRACKET_13= RULE_LBRACKET ( (lv_lTime_14_0= ruleTimeStamp ) ) this_COMMA_15= RULE_COMMA this_RBRACKET_16= RULE_RBRACKET
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:927:7: ( (lv_event_12_0= ruleEvent ) )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:928:1: (lv_event_12_0= ruleEvent )
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:928:1: (lv_event_12_0= ruleEvent )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:929:3: lv_event_12_0= ruleEvent
                    {
                     
                    	        newCompositeNode(grammarAccess.getIntervalAccess().getEventEventParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEvent_in_ruleInterval1846);
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

                    this_LBRACKET_13=(Token)match(input,RULE_LBRACKET,FOLLOW_RULE_LBRACKET_in_ruleInterval1857); 
                     
                        newLeafNode(this_LBRACKET_13, grammarAccess.getIntervalAccess().getLBRACKETTerminalRuleCall_3_1()); 
                        
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:949:1: ( (lv_lTime_14_0= ruleTimeStamp ) )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:950:1: (lv_lTime_14_0= ruleTimeStamp )
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:950:1: (lv_lTime_14_0= ruleTimeStamp )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:951:3: lv_lTime_14_0= ruleTimeStamp
                    {
                     
                    	        newCompositeNode(grammarAccess.getIntervalAccess().getLTimeTimeStampParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTimeStamp_in_ruleInterval1877);
                    lv_lTime_14_0=ruleTimeStamp();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIntervalRule());
                    	        }
                           		set(
                           			current, 
                           			"lTime",
                            		lv_lTime_14_0, 
                            		"TimeStamp");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    this_COMMA_15=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleInterval1888); 
                     
                        newLeafNode(this_COMMA_15, grammarAccess.getIntervalAccess().getCOMMATerminalRuleCall_3_3()); 
                        
                    this_RBRACKET_16=(Token)match(input,RULE_RBRACKET,FOLLOW_RULE_RBRACKET_in_ruleInterval1898); 
                     
                        newLeafNode(this_RBRACKET_16, grammarAccess.getIntervalAccess().getRBRACKETTerminalRuleCall_3_4()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:976:6: ( ( (lv_event_17_0= ruleEvent ) ) this_LBRACKET_18= RULE_LBRACKET this_COMMA_19= RULE_COMMA this_RBRACKET_20= RULE_RBRACKET )
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:976:6: ( ( (lv_event_17_0= ruleEvent ) ) this_LBRACKET_18= RULE_LBRACKET this_COMMA_19= RULE_COMMA this_RBRACKET_20= RULE_RBRACKET )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:976:7: ( (lv_event_17_0= ruleEvent ) ) this_LBRACKET_18= RULE_LBRACKET this_COMMA_19= RULE_COMMA this_RBRACKET_20= RULE_RBRACKET
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:976:7: ( (lv_event_17_0= ruleEvent ) )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:977:1: (lv_event_17_0= ruleEvent )
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:977:1: (lv_event_17_0= ruleEvent )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:978:3: lv_event_17_0= ruleEvent
                    {
                     
                    	        newCompositeNode(grammarAccess.getIntervalAccess().getEventEventParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEvent_in_ruleInterval1926);
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

                    this_LBRACKET_18=(Token)match(input,RULE_LBRACKET,FOLLOW_RULE_LBRACKET_in_ruleInterval1937); 
                     
                        newLeafNode(this_LBRACKET_18, grammarAccess.getIntervalAccess().getLBRACKETTerminalRuleCall_4_1()); 
                        
                    this_COMMA_19=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleInterval1947); 
                     
                        newLeafNode(this_COMMA_19, grammarAccess.getIntervalAccess().getCOMMATerminalRuleCall_4_2()); 
                        
                    this_RBRACKET_20=(Token)match(input,RULE_RBRACKET,FOLLOW_RULE_RBRACKET_in_ruleInterval1957); 
                     
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
    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1014:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1015:2: (iv_ruleEvent= ruleEvent EOF )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1016:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent1993);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent2003); 

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
    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1023:1: ruleEvent returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) | ( ( ( (lv_lifeState_1_1= RULE_CREATED | lv_lifeState_1_2= RULE_DETACHED | lv_lifeState_1_3= RULE_DISCHARGED | lv_lifeState_1_4= RULE_EXPIRED | lv_lifeState_1_5= RULE_VIOLATED ) ) ) ( (lv_label_2_0= RULE_ID ) ) ) ) ;
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
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1026:28: ( ( ( (lv_name_0_0= RULE_ID ) ) | ( ( ( (lv_lifeState_1_1= RULE_CREATED | lv_lifeState_1_2= RULE_DETACHED | lv_lifeState_1_3= RULE_DISCHARGED | lv_lifeState_1_4= RULE_EXPIRED | lv_lifeState_1_5= RULE_VIOLATED ) ) ) ( (lv_label_2_0= RULE_ID ) ) ) ) )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1027:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( ( (lv_lifeState_1_1= RULE_CREATED | lv_lifeState_1_2= RULE_DETACHED | lv_lifeState_1_3= RULE_DISCHARGED | lv_lifeState_1_4= RULE_EXPIRED | lv_lifeState_1_5= RULE_VIOLATED ) ) ) ( (lv_label_2_0= RULE_ID ) ) ) )
            {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1027:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( ( (lv_lifeState_1_1= RULE_CREATED | lv_lifeState_1_2= RULE_DETACHED | lv_lifeState_1_3= RULE_DISCHARGED | lv_lifeState_1_4= RULE_EXPIRED | lv_lifeState_1_5= RULE_VIOLATED ) ) ) ( (lv_label_2_0= RULE_ID ) ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            else if ( ((LA13_0>=RULE_CREATED && LA13_0<=RULE_VIOLATED)) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1027:2: ( (lv_name_0_0= RULE_ID ) )
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1027:2: ( (lv_name_0_0= RULE_ID ) )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1028:1: (lv_name_0_0= RULE_ID )
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1028:1: (lv_name_0_0= RULE_ID )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1029:3: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEvent2045); 

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
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1046:6: ( ( ( (lv_lifeState_1_1= RULE_CREATED | lv_lifeState_1_2= RULE_DETACHED | lv_lifeState_1_3= RULE_DISCHARGED | lv_lifeState_1_4= RULE_EXPIRED | lv_lifeState_1_5= RULE_VIOLATED ) ) ) ( (lv_label_2_0= RULE_ID ) ) )
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1046:6: ( ( ( (lv_lifeState_1_1= RULE_CREATED | lv_lifeState_1_2= RULE_DETACHED | lv_lifeState_1_3= RULE_DISCHARGED | lv_lifeState_1_4= RULE_EXPIRED | lv_lifeState_1_5= RULE_VIOLATED ) ) ) ( (lv_label_2_0= RULE_ID ) ) )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1046:7: ( ( (lv_lifeState_1_1= RULE_CREATED | lv_lifeState_1_2= RULE_DETACHED | lv_lifeState_1_3= RULE_DISCHARGED | lv_lifeState_1_4= RULE_EXPIRED | lv_lifeState_1_5= RULE_VIOLATED ) ) ) ( (lv_label_2_0= RULE_ID ) )
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1046:7: ( ( (lv_lifeState_1_1= RULE_CREATED | lv_lifeState_1_2= RULE_DETACHED | lv_lifeState_1_3= RULE_DISCHARGED | lv_lifeState_1_4= RULE_EXPIRED | lv_lifeState_1_5= RULE_VIOLATED ) ) )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1047:1: ( (lv_lifeState_1_1= RULE_CREATED | lv_lifeState_1_2= RULE_DETACHED | lv_lifeState_1_3= RULE_DISCHARGED | lv_lifeState_1_4= RULE_EXPIRED | lv_lifeState_1_5= RULE_VIOLATED ) )
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1047:1: ( (lv_lifeState_1_1= RULE_CREATED | lv_lifeState_1_2= RULE_DETACHED | lv_lifeState_1_3= RULE_DISCHARGED | lv_lifeState_1_4= RULE_EXPIRED | lv_lifeState_1_5= RULE_VIOLATED ) )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1048:1: (lv_lifeState_1_1= RULE_CREATED | lv_lifeState_1_2= RULE_DETACHED | lv_lifeState_1_3= RULE_DISCHARGED | lv_lifeState_1_4= RULE_EXPIRED | lv_lifeState_1_5= RULE_VIOLATED )
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1048:1: (lv_lifeState_1_1= RULE_CREATED | lv_lifeState_1_2= RULE_DETACHED | lv_lifeState_1_3= RULE_DISCHARGED | lv_lifeState_1_4= RULE_EXPIRED | lv_lifeState_1_5= RULE_VIOLATED )
                    int alt12=5;
                    switch ( input.LA(1) ) {
                    case RULE_CREATED:
                        {
                        alt12=1;
                        }
                        break;
                    case RULE_DETACHED:
                        {
                        alt12=2;
                        }
                        break;
                    case RULE_DISCHARGED:
                        {
                        alt12=3;
                        }
                        break;
                    case RULE_EXPIRED:
                        {
                        alt12=4;
                        }
                        break;
                    case RULE_VIOLATED:
                        {
                        alt12=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 0, input);

                        throw nvae;
                    }

                    switch (alt12) {
                        case 1 :
                            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1049:3: lv_lifeState_1_1= RULE_CREATED
                            {
                            lv_lifeState_1_1=(Token)match(input,RULE_CREATED,FOLLOW_RULE_CREATED_in_ruleEvent2076); 

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
                            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1064:8: lv_lifeState_1_2= RULE_DETACHED
                            {
                            lv_lifeState_1_2=(Token)match(input,RULE_DETACHED,FOLLOW_RULE_DETACHED_in_ruleEvent2096); 

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
                            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1079:8: lv_lifeState_1_3= RULE_DISCHARGED
                            {
                            lv_lifeState_1_3=(Token)match(input,RULE_DISCHARGED,FOLLOW_RULE_DISCHARGED_in_ruleEvent2116); 

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
                            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1094:8: lv_lifeState_1_4= RULE_EXPIRED
                            {
                            lv_lifeState_1_4=(Token)match(input,RULE_EXPIRED,FOLLOW_RULE_EXPIRED_in_ruleEvent2136); 

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
                            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1109:8: lv_lifeState_1_5= RULE_VIOLATED
                            {
                            lv_lifeState_1_5=(Token)match(input,RULE_VIOLATED,FOLLOW_RULE_VIOLATED_in_ruleEvent2156); 

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

                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1127:2: ( (lv_label_2_0= RULE_ID ) )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1128:1: (lv_label_2_0= RULE_ID )
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1128:1: (lv_label_2_0= RULE_ID )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1129:3: lv_label_2_0= RULE_ID
                    {
                    lv_label_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEvent2181); 

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


    // $ANTLR start "entryRuleTimeStamp"
    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1153:1: entryRuleTimeStamp returns [EObject current=null] : iv_ruleTimeStamp= ruleTimeStamp EOF ;
    public final EObject entryRuleTimeStamp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeStamp = null;


        try {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1154:2: (iv_ruleTimeStamp= ruleTimeStamp EOF )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1155:2: iv_ruleTimeStamp= ruleTimeStamp EOF
            {
             newCompositeNode(grammarAccess.getTimeStampRule()); 
            pushFollow(FOLLOW_ruleTimeStamp_in_entryRuleTimeStamp2223);
            iv_ruleTimeStamp=ruleTimeStamp();

            state._fsp--;

             current =iv_ruleTimeStamp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimeStamp2233); 

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
    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1162:1: ruleTimeStamp returns [EObject current=null] : ( ( (lv_val_0_0= RULE_INT ) ) | ( ( (lv_eventReference_1_0= RULE_ID ) ) (this_PLUS_2= RULE_PLUS ( (lv_shift_3_0= RULE_INT ) ) )? ) ) ;
    public final EObject ruleTimeStamp() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;
        Token lv_eventReference_1_0=null;
        Token this_PLUS_2=null;
        Token lv_shift_3_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1165:28: ( ( ( (lv_val_0_0= RULE_INT ) ) | ( ( (lv_eventReference_1_0= RULE_ID ) ) (this_PLUS_2= RULE_PLUS ( (lv_shift_3_0= RULE_INT ) ) )? ) ) )
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1166:1: ( ( (lv_val_0_0= RULE_INT ) ) | ( ( (lv_eventReference_1_0= RULE_ID ) ) (this_PLUS_2= RULE_PLUS ( (lv_shift_3_0= RULE_INT ) ) )? ) )
            {
            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1166:1: ( ( (lv_val_0_0= RULE_INT ) ) | ( ( (lv_eventReference_1_0= RULE_ID ) ) (this_PLUS_2= RULE_PLUS ( (lv_shift_3_0= RULE_INT ) ) )? ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_INT) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_ID) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1166:2: ( (lv_val_0_0= RULE_INT ) )
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1166:2: ( (lv_val_0_0= RULE_INT ) )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1167:1: (lv_val_0_0= RULE_INT )
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1167:1: (lv_val_0_0= RULE_INT )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1168:3: lv_val_0_0= RULE_INT
                    {
                    lv_val_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTimeStamp2275); 

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
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1185:6: ( ( (lv_eventReference_1_0= RULE_ID ) ) (this_PLUS_2= RULE_PLUS ( (lv_shift_3_0= RULE_INT ) ) )? )
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1185:6: ( ( (lv_eventReference_1_0= RULE_ID ) ) (this_PLUS_2= RULE_PLUS ( (lv_shift_3_0= RULE_INT ) ) )? )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1185:7: ( (lv_eventReference_1_0= RULE_ID ) ) (this_PLUS_2= RULE_PLUS ( (lv_shift_3_0= RULE_INT ) ) )?
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1185:7: ( (lv_eventReference_1_0= RULE_ID ) )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1186:1: (lv_eventReference_1_0= RULE_ID )
                    {
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1186:1: (lv_eventReference_1_0= RULE_ID )
                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1187:3: lv_eventReference_1_0= RULE_ID
                    {
                    lv_eventReference_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTimeStamp2304); 

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

                    // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1203:2: (this_PLUS_2= RULE_PLUS ( (lv_shift_3_0= RULE_INT ) ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==RULE_PLUS) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1203:3: this_PLUS_2= RULE_PLUS ( (lv_shift_3_0= RULE_INT ) )
                            {
                            this_PLUS_2=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleTimeStamp2321); 
                             
                                newLeafNode(this_PLUS_2, grammarAccess.getTimeStampAccess().getPLUSTerminalRuleCall_1_1_0()); 
                                
                            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1207:1: ( (lv_shift_3_0= RULE_INT ) )
                            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1208:1: (lv_shift_3_0= RULE_INT )
                            {
                            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1208:1: (lv_shift_3_0= RULE_INT )
                            // ../org.xtext.example.Cupido/src-gen/org/xtext/example/parser/antlr/internal/InternalCupido.g:1209:3: lv_shift_3_0= RULE_INT
                            {
                            lv_shift_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTimeStamp2337); 

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

    // Delegated rules


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\24\uffff";
    static final String DFA11_eofS =
        "\1\uffff\1\10\7\uffff\1\10\12\uffff";
    static final String DFA11_minS =
        "\1\12\1\7\5\12\1\6\1\uffff\1\7\1\12\2\6\2\uffff\1\12\1\34\2\uffff"+
        "\1\6";
    static final String DFA11_maxS =
        "\1\33\1\25\5\12\1\34\1\uffff\1\25\1\34\1\6\1\35\2\uffff\2\34\2"+
        "\uffff\1\6";
    static final String DFA11_acceptS =
        "\10\uffff\1\1\4\uffff\1\3\1\5\2\uffff\1\4\1\2\1\uffff";
    static final String DFA11_specialS =
        "\24\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\1\14\uffff\1\2\1\3\1\4\1\5\1\6",
            "\1\10\3\uffff\1\10\2\uffff\6\10\1\uffff\1\7",
            "\1\11",
            "\1\11",
            "\1\11",
            "\1\11",
            "\1\11",
            "\1\12\3\uffff\1\14\21\uffff\1\13",
            "",
            "\1\10\3\uffff\1\10\2\uffff\6\10\1\uffff\1\7",
            "\1\15\13\uffff\1\16\5\uffff\1\15",
            "\1\17",
            "\1\17\26\uffff\1\20",
            "",
            "",
            "\1\22\13\uffff\1\21\5\uffff\1\22",
            "\1\23",
            "",
            "",
            "\1\17"
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "792:1: ( ( (lv_event_0_0= ruleEvent ) ) | ( ( (lv_event_1_0= ruleEvent ) ) this_LBRACKET_2= RULE_LBRACKET ( (lv_lTime_3_0= ruleTimeStamp ) ) this_COMMA_4= RULE_COMMA ( (lv_rTime_5_0= ruleTimeStamp ) ) this_RBRACKET_6= RULE_RBRACKET ) | ( ( (lv_event_7_0= ruleEvent ) ) this_LBRACKET_8= RULE_LBRACKET this_COMMA_9= RULE_COMMA ( (lv_rTime_10_0= ruleTimeStamp ) ) this_RBRACKET_11= RULE_RBRACKET ) | ( ( (lv_event_12_0= ruleEvent ) ) this_LBRACKET_13= RULE_LBRACKET ( (lv_lTime_14_0= ruleTimeStamp ) ) this_COMMA_15= RULE_COMMA this_RBRACKET_16= RULE_RBRACKET ) | ( ( (lv_event_17_0= ruleEvent ) ) this_LBRACKET_18= RULE_LBRACKET this_COMMA_19= RULE_COMMA this_RBRACKET_20= RULE_RBRACKET ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleCupido_in_entryRuleCupido75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCupido85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemata_in_ruleCupido132 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleCommitment_in_ruleCupido152 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleSchemata_in_entryRuleSchemata189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemata199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SCHEMA_in_ruleSchemata235 = new BitSet(new long[]{0x000000000F800400L});
    public static final BitSet FOLLOW_ruleEventRelation_in_ruleSchemata255 = new BitSet(new long[]{0x000000000F800402L});
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
    public static final BitSet FOLLOW_RULE_CREATE_in_ruleCommitment778 = new BitSet(new long[]{0x000000000F800420L});
    public static final BitSet FOLLOW_ruleEExpr_in_ruleCommitment798 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_RULE_DETACH_in_ruleCommitment810 = new BitSet(new long[]{0x000000000F800420L});
    public static final BitSet FOLLOW_ruleEExpr_in_ruleCommitment830 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_DISCHARGE_in_ruleCommitment843 = new BitSet(new long[]{0x000000000F800420L});
    public static final BitSet FOLLOW_ruleEExpr_in_ruleCommitment863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEExpr_in_entryRuleEExpr899 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEExpr909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOExpr_in_ruleEExpr956 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_RULE_EXCEPT_in_ruleEExpr976 = new BitSet(new long[]{0x000000000F800420L});
    public static final BitSet FOLLOW_ruleOExpr_in_ruleEExpr996 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleOExpr_in_entryRuleOExpr1034 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOExpr1044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAExpr_in_ruleOExpr1091 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_RULE_OR_in_ruleOExpr1111 = new BitSet(new long[]{0x000000000F800420L});
    public static final BitSet FOLLOW_ruleAExpr_in_ruleOExpr1131 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleAExpr_in_entryRuleAExpr1169 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAExpr1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWExpr_in_ruleAExpr1226 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_RULE_AND_in_ruleAExpr1246 = new BitSet(new long[]{0x000000000F800420L});
    public static final BitSet FOLLOW_ruleWExpr_in_ruleAExpr1266 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleWExpr_in_entryRuleWExpr1304 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWExpr1314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBExpr_in_ruleWExpr1361 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_RULE_WHERE_in_ruleWExpr1381 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWExpr1397 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleBExpr_in_entryRuleBExpr1440 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBExpr1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterval_in_ruleBExpr1497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleBExpr1514 = new BitSet(new long[]{0x000000000F800420L});
    public static final BitSet FOLLOW_ruleEExpr_in_ruleBExpr1535 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleBExpr1545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterval_in_entryRuleInterval1581 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterval1591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleInterval1637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleInterval1665 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RULE_LBRACKET_in_ruleInterval1676 = new BitSet(new long[]{0x0000000010000400L});
    public static final BitSet FOLLOW_ruleTimeStamp_in_ruleInterval1696 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleInterval1707 = new BitSet(new long[]{0x0000000010000400L});
    public static final BitSet FOLLOW_ruleTimeStamp_in_ruleInterval1727 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_RULE_RBRACKET_in_ruleInterval1738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleInterval1766 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RULE_LBRACKET_in_ruleInterval1777 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleInterval1787 = new BitSet(new long[]{0x0000000010000400L});
    public static final BitSet FOLLOW_ruleTimeStamp_in_ruleInterval1807 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_RULE_RBRACKET_in_ruleInterval1818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleInterval1846 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RULE_LBRACKET_in_ruleInterval1857 = new BitSet(new long[]{0x0000000010000400L});
    public static final BitSet FOLLOW_ruleTimeStamp_in_ruleInterval1877 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleInterval1888 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_RULE_RBRACKET_in_ruleInterval1898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleInterval1926 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RULE_LBRACKET_in_ruleInterval1937 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleInterval1947 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_RULE_RBRACKET_in_ruleInterval1957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent1993 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent2003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEvent2045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CREATED_in_ruleEvent2076 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_DETACHED_in_ruleEvent2096 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_DISCHARGED_in_ruleEvent2116 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_EXPIRED_in_ruleEvent2136 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_VIOLATED_in_ruleEvent2156 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEvent2181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeStamp_in_entryRuleTimeStamp2223 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimeStamp2233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTimeStamp2275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTimeStamp2304 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleTimeStamp2321 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTimeStamp2337 = new BitSet(new long[]{0x0000000000000002L});

}