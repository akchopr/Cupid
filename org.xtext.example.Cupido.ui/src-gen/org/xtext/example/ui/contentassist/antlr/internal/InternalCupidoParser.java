package org.xtext.example.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.services.CupidoGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCupidoParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_CREATED", "RULE_DETACHED", "RULE_DISCHARGED", "RULE_EXPIRED", "RULE_VIOLATED", "RULE_LT", "RULE_LEQ", "RULE_EQ", "RULE_GT", "RULE_GEQ", "RULE_AND", "RULE_OR", "RULE_EXCEPT", "RULE_SCHEMA", "RULE_LPAREN", "RULE_RPAREN", "RULE_KEY", "RULE_TIME", "RULE_COMMA", "RULE_COMMIT", "RULE_TO", "RULE_CREATE", "RULE_DISCHARGE", "RULE_DETACH", "RULE_LBRACKET", "RULE_RBRACKET", "RULE_PLUS", "RULE_ID", "RULE_WHERE", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_LBRACKET=28;
    public static final int RULE_TO=24;
    public static final int RULE_KEY=20;
    public static final int RULE_GT=12;
    public static final int RULE_GEQ=13;
    public static final int RULE_STRING=34;
    public static final int RULE_LPAREN=18;
    public static final int RULE_LEQ=10;
    public static final int RULE_AND=14;
    public static final int RULE_SCHEMA=17;
    public static final int RULE_SL_COMMENT=36;
    public static final int RULE_CREATE=25;
    public static final int RULE_EQ=11;
    public static final int RULE_TIME=21;
    public static final int RULE_PLUS=30;
    public static final int RULE_OR=15;
    public static final int EOF=-1;
    public static final int RULE_DETACH=27;
    public static final int RULE_ID=31;
    public static final int RULE_EXPIRED=7;
    public static final int RULE_COMMA=22;
    public static final int RULE_WS=37;
    public static final int RULE_DETACHED=5;
    public static final int RULE_WHERE=32;
    public static final int RULE_ANY_OTHER=38;
    public static final int RULE_LT=9;
    public static final int RULE_RPAREN=19;
    public static final int RULE_DISCHARGED=6;
    public static final int RULE_INT=33;
    public static final int RULE_VIOLATED=8;
    public static final int RULE_EXCEPT=16;
    public static final int RULE_ML_COMMENT=35;
    public static final int RULE_CREATED=4;
    public static final int RULE_COMMIT=23;
    public static final int RULE_DISCHARGE=26;
    public static final int RULE_RBRACKET=29;

    // delegates
    // delegators


        public InternalCupidoParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCupidoParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCupidoParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g"; }


     
     	private CupidoGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(CupidoGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleCupido"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:60:1: entryRuleCupido : ruleCupido EOF ;
    public final void entryRuleCupido() throws RecognitionException {
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:61:1: ( ruleCupido EOF )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:62:1: ruleCupido EOF
            {
             before(grammarAccess.getCupidoRule()); 
            pushFollow(FOLLOW_ruleCupido_in_entryRuleCupido61);
            ruleCupido();

            state._fsp--;

             after(grammarAccess.getCupidoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCupido68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCupido"


    // $ANTLR start "ruleCupido"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:69:1: ruleCupido : ( ( rule__Cupido__Group__0 ) ) ;
    public final void ruleCupido() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:73:2: ( ( ( rule__Cupido__Group__0 ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:74:1: ( ( rule__Cupido__Group__0 ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:74:1: ( ( rule__Cupido__Group__0 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:75:1: ( rule__Cupido__Group__0 )
            {
             before(grammarAccess.getCupidoAccess().getGroup()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:76:1: ( rule__Cupido__Group__0 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:76:2: rule__Cupido__Group__0
            {
            pushFollow(FOLLOW_rule__Cupido__Group__0_in_ruleCupido94);
            rule__Cupido__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCupidoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCupido"


    // $ANTLR start "entryRuleSchemata"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:88:1: entryRuleSchemata : ruleSchemata EOF ;
    public final void entryRuleSchemata() throws RecognitionException {
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:89:1: ( ruleSchemata EOF )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:90:1: ruleSchemata EOF
            {
             before(grammarAccess.getSchemataRule()); 
            pushFollow(FOLLOW_ruleSchemata_in_entryRuleSchemata121);
            ruleSchemata();

            state._fsp--;

             after(grammarAccess.getSchemataRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemata128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSchemata"


    // $ANTLR start "ruleSchemata"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:97:1: ruleSchemata : ( ( rule__Schemata__Group__0 ) ) ;
    public final void ruleSchemata() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:101:2: ( ( ( rule__Schemata__Group__0 ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:102:1: ( ( rule__Schemata__Group__0 ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:102:1: ( ( rule__Schemata__Group__0 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:103:1: ( rule__Schemata__Group__0 )
            {
             before(grammarAccess.getSchemataAccess().getGroup()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:104:1: ( rule__Schemata__Group__0 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:104:2: rule__Schemata__Group__0
            {
            pushFollow(FOLLOW_rule__Schemata__Group__0_in_ruleSchemata154);
            rule__Schemata__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSchemataAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSchemata"


    // $ANTLR start "entryRuleEventRelation"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:116:1: entryRuleEventRelation : ruleEventRelation EOF ;
    public final void entryRuleEventRelation() throws RecognitionException {
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:117:1: ( ruleEventRelation EOF )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:118:1: ruleEventRelation EOF
            {
             before(grammarAccess.getEventRelationRule()); 
            pushFollow(FOLLOW_ruleEventRelation_in_entryRuleEventRelation181);
            ruleEventRelation();

            state._fsp--;

             after(grammarAccess.getEventRelationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventRelation188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEventRelation"


    // $ANTLR start "ruleEventRelation"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:125:1: ruleEventRelation : ( ( rule__EventRelation__Group__0 ) ) ;
    public final void ruleEventRelation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:129:2: ( ( ( rule__EventRelation__Group__0 ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:130:1: ( ( rule__EventRelation__Group__0 ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:130:1: ( ( rule__EventRelation__Group__0 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:131:1: ( rule__EventRelation__Group__0 )
            {
             before(grammarAccess.getEventRelationAccess().getGroup()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:132:1: ( rule__EventRelation__Group__0 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:132:2: rule__EventRelation__Group__0
            {
            pushFollow(FOLLOW_rule__EventRelation__Group__0_in_ruleEventRelation214);
            rule__EventRelation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEventRelationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEventRelation"


    // $ANTLR start "entryRuleParam"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:144:1: entryRuleParam : ruleParam EOF ;
    public final void entryRuleParam() throws RecognitionException {
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:145:1: ( ruleParam EOF )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:146:1: ruleParam EOF
            {
             before(grammarAccess.getParamRule()); 
            pushFollow(FOLLOW_ruleParam_in_entryRuleParam241);
            ruleParam();

            state._fsp--;

             after(grammarAccess.getParamRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParam248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParam"


    // $ANTLR start "ruleParam"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:153:1: ruleParam : ( ( rule__Param__NameAssignment ) ) ;
    public final void ruleParam() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:157:2: ( ( ( rule__Param__NameAssignment ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:158:1: ( ( rule__Param__NameAssignment ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:158:1: ( ( rule__Param__NameAssignment ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:159:1: ( rule__Param__NameAssignment )
            {
             before(grammarAccess.getParamAccess().getNameAssignment()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:160:1: ( rule__Param__NameAssignment )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:160:2: rule__Param__NameAssignment
            {
            pushFollow(FOLLOW_rule__Param__NameAssignment_in_ruleParam274);
            rule__Param__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getParamAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParam"


    // $ANTLR start "entryRuleCommitment"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:172:1: entryRuleCommitment : ruleCommitment EOF ;
    public final void entryRuleCommitment() throws RecognitionException {
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:173:1: ( ruleCommitment EOF )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:174:1: ruleCommitment EOF
            {
             before(grammarAccess.getCommitmentRule()); 
            pushFollow(FOLLOW_ruleCommitment_in_entryRuleCommitment301);
            ruleCommitment();

            state._fsp--;

             after(grammarAccess.getCommitmentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommitment308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCommitment"


    // $ANTLR start "ruleCommitment"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:181:1: ruleCommitment : ( ( rule__Commitment__Group__0 ) ) ;
    public final void ruleCommitment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:185:2: ( ( ( rule__Commitment__Group__0 ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:186:1: ( ( rule__Commitment__Group__0 ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:186:1: ( ( rule__Commitment__Group__0 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:187:1: ( rule__Commitment__Group__0 )
            {
             before(grammarAccess.getCommitmentAccess().getGroup()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:188:1: ( rule__Commitment__Group__0 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:188:2: rule__Commitment__Group__0
            {
            pushFollow(FOLLOW_rule__Commitment__Group__0_in_ruleCommitment334);
            rule__Commitment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCommitmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommitment"


    // $ANTLR start "entryRuleGeneralExpr"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:200:1: entryRuleGeneralExpr : ruleGeneralExpr EOF ;
    public final void entryRuleGeneralExpr() throws RecognitionException {
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:201:1: ( ruleGeneralExpr EOF )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:202:1: ruleGeneralExpr EOF
            {
             before(grammarAccess.getGeneralExprRule()); 
            pushFollow(FOLLOW_ruleGeneralExpr_in_entryRuleGeneralExpr361);
            ruleGeneralExpr();

            state._fsp--;

             after(grammarAccess.getGeneralExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGeneralExpr368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGeneralExpr"


    // $ANTLR start "ruleGeneralExpr"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:209:1: ruleGeneralExpr : ( ( rule__GeneralExpr__Group__0 ) ) ;
    public final void ruleGeneralExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:213:2: ( ( ( rule__GeneralExpr__Group__0 ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:214:1: ( ( rule__GeneralExpr__Group__0 ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:214:1: ( ( rule__GeneralExpr__Group__0 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:215:1: ( rule__GeneralExpr__Group__0 )
            {
             before(grammarAccess.getGeneralExprAccess().getGroup()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:216:1: ( rule__GeneralExpr__Group__0 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:216:2: rule__GeneralExpr__Group__0
            {
            pushFollow(FOLLOW_rule__GeneralExpr__Group__0_in_ruleGeneralExpr394);
            rule__GeneralExpr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGeneralExprAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGeneralExpr"


    // $ANTLR start "entryRuleExpr"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:228:1: entryRuleExpr : ruleExpr EOF ;
    public final void entryRuleExpr() throws RecognitionException {
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:229:1: ( ruleExpr EOF )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:230:1: ruleExpr EOF
            {
             before(grammarAccess.getExprRule()); 
            pushFollow(FOLLOW_ruleExpr_in_entryRuleExpr421);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpr428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpr"


    // $ANTLR start "ruleExpr"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:237:1: ruleExpr : ( ( rule__Expr__Alternatives ) ) ;
    public final void ruleExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:241:2: ( ( ( rule__Expr__Alternatives ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:242:1: ( ( rule__Expr__Alternatives ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:242:1: ( ( rule__Expr__Alternatives ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:243:1: ( rule__Expr__Alternatives )
            {
             before(grammarAccess.getExprAccess().getAlternatives()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:244:1: ( rule__Expr__Alternatives )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:244:2: rule__Expr__Alternatives
            {
            pushFollow(FOLLOW_rule__Expr__Alternatives_in_ruleExpr454);
            rule__Expr__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExprAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleInterval"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:256:1: entryRuleInterval : ruleInterval EOF ;
    public final void entryRuleInterval() throws RecognitionException {
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:257:1: ( ruleInterval EOF )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:258:1: ruleInterval EOF
            {
             before(grammarAccess.getIntervalRule()); 
            pushFollow(FOLLOW_ruleInterval_in_entryRuleInterval481);
            ruleInterval();

            state._fsp--;

             after(grammarAccess.getIntervalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterval488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInterval"


    // $ANTLR start "ruleInterval"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:265:1: ruleInterval : ( ( rule__Interval__Alternatives ) ) ;
    public final void ruleInterval() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:269:2: ( ( ( rule__Interval__Alternatives ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:270:1: ( ( rule__Interval__Alternatives ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:270:1: ( ( rule__Interval__Alternatives ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:271:1: ( rule__Interval__Alternatives )
            {
             before(grammarAccess.getIntervalAccess().getAlternatives()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:272:1: ( rule__Interval__Alternatives )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:272:2: rule__Interval__Alternatives
            {
            pushFollow(FOLLOW_rule__Interval__Alternatives_in_ruleInterval514);
            rule__Interval__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getIntervalAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInterval"


    // $ANTLR start "entryRuleEvent"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:284:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:285:1: ( ruleEvent EOF )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:286:1: ruleEvent EOF
            {
             before(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent541);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getEventRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:293:1: ruleEvent : ( ( rule__Event__Alternatives ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:297:2: ( ( ( rule__Event__Alternatives ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:298:1: ( ( rule__Event__Alternatives ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:298:1: ( ( rule__Event__Alternatives ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:299:1: ( rule__Event__Alternatives )
            {
             before(grammarAccess.getEventAccess().getAlternatives()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:300:1: ( rule__Event__Alternatives )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:300:2: rule__Event__Alternatives
            {
            pushFollow(FOLLOW_rule__Event__Alternatives_in_ruleEvent574);
            rule__Event__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleArithExpr"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:312:1: entryRuleArithExpr : ruleArithExpr EOF ;
    public final void entryRuleArithExpr() throws RecognitionException {
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:313:1: ( ruleArithExpr EOF )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:314:1: ruleArithExpr EOF
            {
             before(grammarAccess.getArithExprRule()); 
            pushFollow(FOLLOW_ruleArithExpr_in_entryRuleArithExpr601);
            ruleArithExpr();

            state._fsp--;

             after(grammarAccess.getArithExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArithExpr608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArithExpr"


    // $ANTLR start "ruleArithExpr"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:321:1: ruleArithExpr : ( ( rule__ArithExpr__Group__0 ) ) ;
    public final void ruleArithExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:325:2: ( ( ( rule__ArithExpr__Group__0 ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:326:1: ( ( rule__ArithExpr__Group__0 ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:326:1: ( ( rule__ArithExpr__Group__0 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:327:1: ( rule__ArithExpr__Group__0 )
            {
             before(grammarAccess.getArithExprAccess().getGroup()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:328:1: ( rule__ArithExpr__Group__0 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:328:2: rule__ArithExpr__Group__0
            {
            pushFollow(FOLLOW_rule__ArithExpr__Group__0_in_ruleArithExpr634);
            rule__ArithExpr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArithExprAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArithExpr"


    // $ANTLR start "entryRuleTimeStamp"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:340:1: entryRuleTimeStamp : ruleTimeStamp EOF ;
    public final void entryRuleTimeStamp() throws RecognitionException {
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:341:1: ( ruleTimeStamp EOF )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:342:1: ruleTimeStamp EOF
            {
             before(grammarAccess.getTimeStampRule()); 
            pushFollow(FOLLOW_ruleTimeStamp_in_entryRuleTimeStamp661);
            ruleTimeStamp();

            state._fsp--;

             after(grammarAccess.getTimeStampRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimeStamp668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTimeStamp"


    // $ANTLR start "ruleTimeStamp"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:349:1: ruleTimeStamp : ( ( rule__TimeStamp__Alternatives ) ) ;
    public final void ruleTimeStamp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:353:2: ( ( ( rule__TimeStamp__Alternatives ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:354:1: ( ( rule__TimeStamp__Alternatives ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:354:1: ( ( rule__TimeStamp__Alternatives ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:355:1: ( rule__TimeStamp__Alternatives )
            {
             before(grammarAccess.getTimeStampAccess().getAlternatives()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:356:1: ( rule__TimeStamp__Alternatives )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:356:2: rule__TimeStamp__Alternatives
            {
            pushFollow(FOLLOW_rule__TimeStamp__Alternatives_in_ruleTimeStamp694);
            rule__TimeStamp__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTimeStampAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTimeStamp"


    // $ANTLR start "entryRuleBinaryOperator"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:368:1: entryRuleBinaryOperator : ruleBinaryOperator EOF ;
    public final void entryRuleBinaryOperator() throws RecognitionException {
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:369:1: ( ruleBinaryOperator EOF )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:370:1: ruleBinaryOperator EOF
            {
             before(grammarAccess.getBinaryOperatorRule()); 
            pushFollow(FOLLOW_ruleBinaryOperator_in_entryRuleBinaryOperator721);
            ruleBinaryOperator();

            state._fsp--;

             after(grammarAccess.getBinaryOperatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinaryOperator728); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBinaryOperator"


    // $ANTLR start "ruleBinaryOperator"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:377:1: ruleBinaryOperator : ( ( rule__BinaryOperator__OpAssignment ) ) ;
    public final void ruleBinaryOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:381:2: ( ( ( rule__BinaryOperator__OpAssignment ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:382:1: ( ( rule__BinaryOperator__OpAssignment ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:382:1: ( ( rule__BinaryOperator__OpAssignment ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:383:1: ( rule__BinaryOperator__OpAssignment )
            {
             before(grammarAccess.getBinaryOperatorAccess().getOpAssignment()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:384:1: ( rule__BinaryOperator__OpAssignment )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:384:2: rule__BinaryOperator__OpAssignment
            {
            pushFollow(FOLLOW_rule__BinaryOperator__OpAssignment_in_ruleBinaryOperator754);
            rule__BinaryOperator__OpAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBinaryOperatorAccess().getOpAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBinaryOperator"


    // $ANTLR start "entryRuleAttribute"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:396:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:397:1: ( ruleAttribute EOF )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:398:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute781);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute788); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:405:1: ruleAttribute : ( ( rule__Attribute__NameAssignment ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:409:2: ( ( ( rule__Attribute__NameAssignment ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:410:1: ( ( rule__Attribute__NameAssignment ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:410:1: ( ( rule__Attribute__NameAssignment ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:411:1: ( rule__Attribute__NameAssignment )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:412:1: ( rule__Attribute__NameAssignment )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:412:2: rule__Attribute__NameAssignment
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_in_ruleAttribute814);
            rule__Attribute__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleEventOperator"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:424:1: entryRuleEventOperator : ruleEventOperator EOF ;
    public final void entryRuleEventOperator() throws RecognitionException {
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:425:1: ( ruleEventOperator EOF )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:426:1: ruleEventOperator EOF
            {
             before(grammarAccess.getEventOperatorRule()); 
            pushFollow(FOLLOW_ruleEventOperator_in_entryRuleEventOperator841);
            ruleEventOperator();

            state._fsp--;

             after(grammarAccess.getEventOperatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventOperator848); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEventOperator"


    // $ANTLR start "ruleEventOperator"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:433:1: ruleEventOperator : ( ( rule__EventOperator__Alternatives ) ) ;
    public final void ruleEventOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:437:2: ( ( ( rule__EventOperator__Alternatives ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:438:1: ( ( rule__EventOperator__Alternatives ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:438:1: ( ( rule__EventOperator__Alternatives ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:439:1: ( rule__EventOperator__Alternatives )
            {
             before(grammarAccess.getEventOperatorAccess().getAlternatives()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:440:1: ( rule__EventOperator__Alternatives )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:440:2: rule__EventOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__EventOperator__Alternatives_in_ruleEventOperator874);
            rule__EventOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEventOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEventOperator"


    // $ANTLR start "rule__Expr__Alternatives"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:452:1: rule__Expr__Alternatives : ( ( ( rule__Expr__IntervalAssignment_0 ) ) | ( ( rule__Expr__Group_1__0 ) ) | ( ( rule__Expr__Group_2__0 ) ) );
    public final void rule__Expr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:456:1: ( ( ( rule__Expr__IntervalAssignment_0 ) ) | ( ( rule__Expr__Group_1__0 ) ) | ( ( rule__Expr__Group_2__0 ) ) )
            int alt1=3;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:457:1: ( ( rule__Expr__IntervalAssignment_0 ) )
                    {
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:457:1: ( ( rule__Expr__IntervalAssignment_0 ) )
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:458:1: ( rule__Expr__IntervalAssignment_0 )
                    {
                     before(grammarAccess.getExprAccess().getIntervalAssignment_0()); 
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:459:1: ( rule__Expr__IntervalAssignment_0 )
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:459:2: rule__Expr__IntervalAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Expr__IntervalAssignment_0_in_rule__Expr__Alternatives910);
                    rule__Expr__IntervalAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExprAccess().getIntervalAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:463:6: ( ( rule__Expr__Group_1__0 ) )
                    {
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:463:6: ( ( rule__Expr__Group_1__0 ) )
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:464:1: ( rule__Expr__Group_1__0 )
                    {
                     before(grammarAccess.getExprAccess().getGroup_1()); 
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:465:1: ( rule__Expr__Group_1__0 )
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:465:2: rule__Expr__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Expr__Group_1__0_in_rule__Expr__Alternatives928);
                    rule__Expr__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExprAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:469:6: ( ( rule__Expr__Group_2__0 ) )
                    {
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:469:6: ( ( rule__Expr__Group_2__0 ) )
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:470:1: ( rule__Expr__Group_2__0 )
                    {
                     before(grammarAccess.getExprAccess().getGroup_2()); 
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:471:1: ( rule__Expr__Group_2__0 )
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:471:2: rule__Expr__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Expr__Group_2__0_in_rule__Expr__Alternatives946);
                    rule__Expr__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExprAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Alternatives"


    // $ANTLR start "rule__Interval__Alternatives"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:480:1: rule__Interval__Alternatives : ( ( ( rule__Interval__EventAssignment_0 ) ) | ( ( rule__Interval__Group_1__0 ) ) | ( ( rule__Interval__Group_2__0 ) ) | ( ( rule__Interval__Group_3__0 ) ) | ( ( rule__Interval__Group_4__0 ) ) );
    public final void rule__Interval__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:484:1: ( ( ( rule__Interval__EventAssignment_0 ) ) | ( ( rule__Interval__Group_1__0 ) ) | ( ( rule__Interval__Group_2__0 ) ) | ( ( rule__Interval__Group_3__0 ) ) | ( ( rule__Interval__Group_4__0 ) ) )
            int alt2=5;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:485:1: ( ( rule__Interval__EventAssignment_0 ) )
                    {
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:485:1: ( ( rule__Interval__EventAssignment_0 ) )
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:486:1: ( rule__Interval__EventAssignment_0 )
                    {
                     before(grammarAccess.getIntervalAccess().getEventAssignment_0()); 
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:487:1: ( rule__Interval__EventAssignment_0 )
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:487:2: rule__Interval__EventAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Interval__EventAssignment_0_in_rule__Interval__Alternatives979);
                    rule__Interval__EventAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIntervalAccess().getEventAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:491:6: ( ( rule__Interval__Group_1__0 ) )
                    {
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:491:6: ( ( rule__Interval__Group_1__0 ) )
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:492:1: ( rule__Interval__Group_1__0 )
                    {
                     before(grammarAccess.getIntervalAccess().getGroup_1()); 
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:493:1: ( rule__Interval__Group_1__0 )
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:493:2: rule__Interval__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Interval__Group_1__0_in_rule__Interval__Alternatives997);
                    rule__Interval__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIntervalAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:497:6: ( ( rule__Interval__Group_2__0 ) )
                    {
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:497:6: ( ( rule__Interval__Group_2__0 ) )
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:498:1: ( rule__Interval__Group_2__0 )
                    {
                     before(grammarAccess.getIntervalAccess().getGroup_2()); 
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:499:1: ( rule__Interval__Group_2__0 )
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:499:2: rule__Interval__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Interval__Group_2__0_in_rule__Interval__Alternatives1015);
                    rule__Interval__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIntervalAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:503:6: ( ( rule__Interval__Group_3__0 ) )
                    {
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:503:6: ( ( rule__Interval__Group_3__0 ) )
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:504:1: ( rule__Interval__Group_3__0 )
                    {
                     before(grammarAccess.getIntervalAccess().getGroup_3()); 
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:505:1: ( rule__Interval__Group_3__0 )
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:505:2: rule__Interval__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Interval__Group_3__0_in_rule__Interval__Alternatives1033);
                    rule__Interval__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIntervalAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:509:6: ( ( rule__Interval__Group_4__0 ) )
                    {
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:509:6: ( ( rule__Interval__Group_4__0 ) )
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:510:1: ( rule__Interval__Group_4__0 )
                    {
                     before(grammarAccess.getIntervalAccess().getGroup_4()); 
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:511:1: ( rule__Interval__Group_4__0 )
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:511:2: rule__Interval__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Interval__Group_4__0_in_rule__Interval__Alternatives1051);
                    rule__Interval__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIntervalAccess().getGroup_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Alternatives"


    // $ANTLR start "rule__Event__Alternatives"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:520:1: rule__Event__Alternatives : ( ( ( rule__Event__NameAssignment_0 ) ) | ( ( rule__Event__Group_1__0 ) ) );
    public final void rule__Event__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:524:1: ( ( ( rule__Event__NameAssignment_0 ) ) | ( ( rule__Event__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=RULE_CREATED && LA3_0<=RULE_VIOLATED)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:525:1: ( ( rule__Event__NameAssignment_0 ) )
                    {
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:525:1: ( ( rule__Event__NameAssignment_0 ) )
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:526:1: ( rule__Event__NameAssignment_0 )
                    {
                     before(grammarAccess.getEventAccess().getNameAssignment_0()); 
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:527:1: ( rule__Event__NameAssignment_0 )
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:527:2: rule__Event__NameAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Event__NameAssignment_0_in_rule__Event__Alternatives1084);
                    rule__Event__NameAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEventAccess().getNameAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:531:6: ( ( rule__Event__Group_1__0 ) )
                    {
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:531:6: ( ( rule__Event__Group_1__0 ) )
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:532:1: ( rule__Event__Group_1__0 )
                    {
                     before(grammarAccess.getEventAccess().getGroup_1()); 
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:533:1: ( rule__Event__Group_1__0 )
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:533:2: rule__Event__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Event__Group_1__0_in_rule__Event__Alternatives1102);
                    rule__Event__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEventAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Alternatives"


    // $ANTLR start "rule__Event__LifeStateAlternatives_1_0_0"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:542:1: rule__Event__LifeStateAlternatives_1_0_0 : ( ( RULE_CREATED ) | ( RULE_DETACHED ) | ( RULE_DISCHARGED ) | ( RULE_EXPIRED ) | ( RULE_VIOLATED ) );
    public final void rule__Event__LifeStateAlternatives_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:546:1: ( ( RULE_CREATED ) | ( RULE_DETACHED ) | ( RULE_DISCHARGED ) | ( RULE_EXPIRED ) | ( RULE_VIOLATED ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case RULE_CREATED:
                {
                alt4=1;
                }
                break;
            case RULE_DETACHED:
                {
                alt4=2;
                }
                break;
            case RULE_DISCHARGED:
                {
                alt4=3;
                }
                break;
            case RULE_EXPIRED:
                {
                alt4=4;
                }
                break;
            case RULE_VIOLATED:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:547:1: ( RULE_CREATED )
                    {
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:547:1: ( RULE_CREATED )
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:548:1: RULE_CREATED
                    {
                     before(grammarAccess.getEventAccess().getLifeStateCREATEDTerminalRuleCall_1_0_0_0()); 
                    match(input,RULE_CREATED,FOLLOW_RULE_CREATED_in_rule__Event__LifeStateAlternatives_1_0_01135); 
                     after(grammarAccess.getEventAccess().getLifeStateCREATEDTerminalRuleCall_1_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:553:6: ( RULE_DETACHED )
                    {
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:553:6: ( RULE_DETACHED )
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:554:1: RULE_DETACHED
                    {
                     before(grammarAccess.getEventAccess().getLifeStateDETACHEDTerminalRuleCall_1_0_0_1()); 
                    match(input,RULE_DETACHED,FOLLOW_RULE_DETACHED_in_rule__Event__LifeStateAlternatives_1_0_01152); 
                     after(grammarAccess.getEventAccess().getLifeStateDETACHEDTerminalRuleCall_1_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:559:6: ( RULE_DISCHARGED )
                    {
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:559:6: ( RULE_DISCHARGED )
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:560:1: RULE_DISCHARGED
                    {
                     before(grammarAccess.getEventAccess().getLifeStateDISCHARGEDTerminalRuleCall_1_0_0_2()); 
                    match(input,RULE_DISCHARGED,FOLLOW_RULE_DISCHARGED_in_rule__Event__LifeStateAlternatives_1_0_01169); 
                     after(grammarAccess.getEventAccess().getLifeStateDISCHARGEDTerminalRuleCall_1_0_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:565:6: ( RULE_EXPIRED )
                    {
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:565:6: ( RULE_EXPIRED )
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:566:1: RULE_EXPIRED
                    {
                     before(grammarAccess.getEventAccess().getLifeStateEXPIREDTerminalRuleCall_1_0_0_3()); 
                    match(input,RULE_EXPIRED,FOLLOW_RULE_EXPIRED_in_rule__Event__LifeStateAlternatives_1_0_01186); 
                     after(grammarAccess.getEventAccess().getLifeStateEXPIREDTerminalRuleCall_1_0_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:571:6: ( RULE_VIOLATED )
                    {
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:571:6: ( RULE_VIOLATED )
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:572:1: RULE_VIOLATED
                    {
                     before(grammarAccess.getEventAccess().getLifeStateVIOLATEDTerminalRuleCall_1_0_0_4()); 
                    match(input,RULE_VIOLATED,FOLLOW_RULE_VIOLATED_in_rule__Event__LifeStateAlternatives_1_0_01203); 
                     after(grammarAccess.getEventAccess().getLifeStateVIOLATEDTerminalRuleCall_1_0_0_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__LifeStateAlternatives_1_0_0"


    // $ANTLR start "rule__ArithExpr__Alternatives_2"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:582:1: rule__ArithExpr__Alternatives_2 : ( ( ( rule__ArithExpr__RightAttrAssignment_2_0 ) ) | ( ( rule__ArithExpr__NumAssignment_2_1 ) ) );
    public final void rule__ArithExpr__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:586:1: ( ( ( rule__ArithExpr__RightAttrAssignment_2_0 ) ) | ( ( rule__ArithExpr__NumAssignment_2_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_INT) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:587:1: ( ( rule__ArithExpr__RightAttrAssignment_2_0 ) )
                    {
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:587:1: ( ( rule__ArithExpr__RightAttrAssignment_2_0 ) )
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:588:1: ( rule__ArithExpr__RightAttrAssignment_2_0 )
                    {
                     before(grammarAccess.getArithExprAccess().getRightAttrAssignment_2_0()); 
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:589:1: ( rule__ArithExpr__RightAttrAssignment_2_0 )
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:589:2: rule__ArithExpr__RightAttrAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__ArithExpr__RightAttrAssignment_2_0_in_rule__ArithExpr__Alternatives_21235);
                    rule__ArithExpr__RightAttrAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getArithExprAccess().getRightAttrAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:593:6: ( ( rule__ArithExpr__NumAssignment_2_1 ) )
                    {
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:593:6: ( ( rule__ArithExpr__NumAssignment_2_1 ) )
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:594:1: ( rule__ArithExpr__NumAssignment_2_1 )
                    {
                     before(grammarAccess.getArithExprAccess().getNumAssignment_2_1()); 
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:595:1: ( rule__ArithExpr__NumAssignment_2_1 )
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:595:2: rule__ArithExpr__NumAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__ArithExpr__NumAssignment_2_1_in_rule__ArithExpr__Alternatives_21253);
                    rule__ArithExpr__NumAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getArithExprAccess().getNumAssignment_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArithExpr__Alternatives_2"


    // $ANTLR start "rule__TimeStamp__Alternatives"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:604:1: rule__TimeStamp__Alternatives : ( ( ( rule__TimeStamp__ValAssignment_0 ) ) | ( ( rule__TimeStamp__Group_1__0 ) ) );
    public final void rule__TimeStamp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:608:1: ( ( ( rule__TimeStamp__ValAssignment_0 ) ) | ( ( rule__TimeStamp__Group_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:609:1: ( ( rule__TimeStamp__ValAssignment_0 ) )
                    {
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:609:1: ( ( rule__TimeStamp__ValAssignment_0 ) )
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:610:1: ( rule__TimeStamp__ValAssignment_0 )
                    {
                     before(grammarAccess.getTimeStampAccess().getValAssignment_0()); 
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:611:1: ( rule__TimeStamp__ValAssignment_0 )
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:611:2: rule__TimeStamp__ValAssignment_0
                    {
                    pushFollow(FOLLOW_rule__TimeStamp__ValAssignment_0_in_rule__TimeStamp__Alternatives1286);
                    rule__TimeStamp__ValAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTimeStampAccess().getValAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:615:6: ( ( rule__TimeStamp__Group_1__0 ) )
                    {
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:615:6: ( ( rule__TimeStamp__Group_1__0 ) )
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:616:1: ( rule__TimeStamp__Group_1__0 )
                    {
                     before(grammarAccess.getTimeStampAccess().getGroup_1()); 
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:617:1: ( rule__TimeStamp__Group_1__0 )
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:617:2: rule__TimeStamp__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__TimeStamp__Group_1__0_in_rule__TimeStamp__Alternatives1304);
                    rule__TimeStamp__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTimeStampAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeStamp__Alternatives"


    // $ANTLR start "rule__BinaryOperator__OpAlternatives_0"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:626:1: rule__BinaryOperator__OpAlternatives_0 : ( ( RULE_LT ) | ( RULE_LEQ ) | ( RULE_EQ ) | ( RULE_GT ) | ( RULE_GEQ ) );
    public final void rule__BinaryOperator__OpAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:630:1: ( ( RULE_LT ) | ( RULE_LEQ ) | ( RULE_EQ ) | ( RULE_GT ) | ( RULE_GEQ ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case RULE_LT:
                {
                alt7=1;
                }
                break;
            case RULE_LEQ:
                {
                alt7=2;
                }
                break;
            case RULE_EQ:
                {
                alt7=3;
                }
                break;
            case RULE_GT:
                {
                alt7=4;
                }
                break;
            case RULE_GEQ:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:631:1: ( RULE_LT )
                    {
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:631:1: ( RULE_LT )
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:632:1: RULE_LT
                    {
                     before(grammarAccess.getBinaryOperatorAccess().getOpLTTerminalRuleCall_0_0()); 
                    match(input,RULE_LT,FOLLOW_RULE_LT_in_rule__BinaryOperator__OpAlternatives_01337); 
                     after(grammarAccess.getBinaryOperatorAccess().getOpLTTerminalRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:637:6: ( RULE_LEQ )
                    {
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:637:6: ( RULE_LEQ )
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:638:1: RULE_LEQ
                    {
                     before(grammarAccess.getBinaryOperatorAccess().getOpLEQTerminalRuleCall_0_1()); 
                    match(input,RULE_LEQ,FOLLOW_RULE_LEQ_in_rule__BinaryOperator__OpAlternatives_01354); 
                     after(grammarAccess.getBinaryOperatorAccess().getOpLEQTerminalRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:643:6: ( RULE_EQ )
                    {
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:643:6: ( RULE_EQ )
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:644:1: RULE_EQ
                    {
                     before(grammarAccess.getBinaryOperatorAccess().getOpEQTerminalRuleCall_0_2()); 
                    match(input,RULE_EQ,FOLLOW_RULE_EQ_in_rule__BinaryOperator__OpAlternatives_01371); 
                     after(grammarAccess.getBinaryOperatorAccess().getOpEQTerminalRuleCall_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:649:6: ( RULE_GT )
                    {
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:649:6: ( RULE_GT )
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:650:1: RULE_GT
                    {
                     before(grammarAccess.getBinaryOperatorAccess().getOpGTTerminalRuleCall_0_3()); 
                    match(input,RULE_GT,FOLLOW_RULE_GT_in_rule__BinaryOperator__OpAlternatives_01388); 
                     after(grammarAccess.getBinaryOperatorAccess().getOpGTTerminalRuleCall_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:655:6: ( RULE_GEQ )
                    {
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:655:6: ( RULE_GEQ )
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:656:1: RULE_GEQ
                    {
                     before(grammarAccess.getBinaryOperatorAccess().getOpGEQTerminalRuleCall_0_4()); 
                    match(input,RULE_GEQ,FOLLOW_RULE_GEQ_in_rule__BinaryOperator__OpAlternatives_01405); 
                     after(grammarAccess.getBinaryOperatorAccess().getOpGEQTerminalRuleCall_0_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryOperator__OpAlternatives_0"


    // $ANTLR start "rule__EventOperator__Alternatives"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:666:1: rule__EventOperator__Alternatives : ( ( RULE_AND ) | ( RULE_OR ) | ( RULE_EXCEPT ) );
    public final void rule__EventOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:670:1: ( ( RULE_AND ) | ( RULE_OR ) | ( RULE_EXCEPT ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case RULE_AND:
                {
                alt8=1;
                }
                break;
            case RULE_OR:
                {
                alt8=2;
                }
                break;
            case RULE_EXCEPT:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:671:1: ( RULE_AND )
                    {
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:671:1: ( RULE_AND )
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:672:1: RULE_AND
                    {
                     before(grammarAccess.getEventOperatorAccess().getANDTerminalRuleCall_0()); 
                    match(input,RULE_AND,FOLLOW_RULE_AND_in_rule__EventOperator__Alternatives1437); 
                     after(grammarAccess.getEventOperatorAccess().getANDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:677:6: ( RULE_OR )
                    {
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:677:6: ( RULE_OR )
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:678:1: RULE_OR
                    {
                     before(grammarAccess.getEventOperatorAccess().getORTerminalRuleCall_1()); 
                    match(input,RULE_OR,FOLLOW_RULE_OR_in_rule__EventOperator__Alternatives1454); 
                     after(grammarAccess.getEventOperatorAccess().getORTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:683:6: ( RULE_EXCEPT )
                    {
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:683:6: ( RULE_EXCEPT )
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:684:1: RULE_EXCEPT
                    {
                     before(grammarAccess.getEventOperatorAccess().getEXCEPTTerminalRuleCall_2()); 
                    match(input,RULE_EXCEPT,FOLLOW_RULE_EXCEPT_in_rule__EventOperator__Alternatives1471); 
                     after(grammarAccess.getEventOperatorAccess().getEXCEPTTerminalRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventOperator__Alternatives"


    // $ANTLR start "rule__Cupido__Group__0"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:696:1: rule__Cupido__Group__0 : rule__Cupido__Group__0__Impl rule__Cupido__Group__1 ;
    public final void rule__Cupido__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:700:1: ( rule__Cupido__Group__0__Impl rule__Cupido__Group__1 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:701:2: rule__Cupido__Group__0__Impl rule__Cupido__Group__1
            {
            pushFollow(FOLLOW_rule__Cupido__Group__0__Impl_in_rule__Cupido__Group__01501);
            rule__Cupido__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Cupido__Group__1_in_rule__Cupido__Group__01504);
            rule__Cupido__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cupido__Group__0"


    // $ANTLR start "rule__Cupido__Group__0__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:708:1: rule__Cupido__Group__0__Impl : ( ruleSchemata ) ;
    public final void rule__Cupido__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:712:1: ( ( ruleSchemata ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:713:1: ( ruleSchemata )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:713:1: ( ruleSchemata )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:714:1: ruleSchemata
            {
             before(grammarAccess.getCupidoAccess().getSchemataParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleSchemata_in_rule__Cupido__Group__0__Impl1531);
            ruleSchemata();

            state._fsp--;

             after(grammarAccess.getCupidoAccess().getSchemataParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cupido__Group__0__Impl"


    // $ANTLR start "rule__Cupido__Group__1"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:725:1: rule__Cupido__Group__1 : rule__Cupido__Group__1__Impl ;
    public final void rule__Cupido__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:729:1: ( rule__Cupido__Group__1__Impl )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:730:2: rule__Cupido__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Cupido__Group__1__Impl_in_rule__Cupido__Group__11560);
            rule__Cupido__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cupido__Group__1"


    // $ANTLR start "rule__Cupido__Group__1__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:736:1: rule__Cupido__Group__1__Impl : ( ( rule__Cupido__CommitmentsAssignment_1 )* ) ;
    public final void rule__Cupido__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:740:1: ( ( ( rule__Cupido__CommitmentsAssignment_1 )* ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:741:1: ( ( rule__Cupido__CommitmentsAssignment_1 )* )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:741:1: ( ( rule__Cupido__CommitmentsAssignment_1 )* )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:742:1: ( rule__Cupido__CommitmentsAssignment_1 )*
            {
             before(grammarAccess.getCupidoAccess().getCommitmentsAssignment_1()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:743:1: ( rule__Cupido__CommitmentsAssignment_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_COMMIT) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:743:2: rule__Cupido__CommitmentsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Cupido__CommitmentsAssignment_1_in_rule__Cupido__Group__1__Impl1587);
            	    rule__Cupido__CommitmentsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getCupidoAccess().getCommitmentsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cupido__Group__1__Impl"


    // $ANTLR start "rule__Schemata__Group__0"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:757:1: rule__Schemata__Group__0 : rule__Schemata__Group__0__Impl rule__Schemata__Group__1 ;
    public final void rule__Schemata__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:761:1: ( rule__Schemata__Group__0__Impl rule__Schemata__Group__1 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:762:2: rule__Schemata__Group__0__Impl rule__Schemata__Group__1
            {
            pushFollow(FOLLOW_rule__Schemata__Group__0__Impl_in_rule__Schemata__Group__01622);
            rule__Schemata__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Schemata__Group__1_in_rule__Schemata__Group__01625);
            rule__Schemata__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schemata__Group__0"


    // $ANTLR start "rule__Schemata__Group__0__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:769:1: rule__Schemata__Group__0__Impl : ( RULE_SCHEMA ) ;
    public final void rule__Schemata__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:773:1: ( ( RULE_SCHEMA ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:774:1: ( RULE_SCHEMA )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:774:1: ( RULE_SCHEMA )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:775:1: RULE_SCHEMA
            {
             before(grammarAccess.getSchemataAccess().getSCHEMATerminalRuleCall_0()); 
            match(input,RULE_SCHEMA,FOLLOW_RULE_SCHEMA_in_rule__Schemata__Group__0__Impl1652); 
             after(grammarAccess.getSchemataAccess().getSCHEMATerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schemata__Group__0__Impl"


    // $ANTLR start "rule__Schemata__Group__1"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:786:1: rule__Schemata__Group__1 : rule__Schemata__Group__1__Impl ;
    public final void rule__Schemata__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:790:1: ( rule__Schemata__Group__1__Impl )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:791:2: rule__Schemata__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Schemata__Group__1__Impl_in_rule__Schemata__Group__11681);
            rule__Schemata__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schemata__Group__1"


    // $ANTLR start "rule__Schemata__Group__1__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:797:1: rule__Schemata__Group__1__Impl : ( ( ( rule__Schemata__SchemataAssignment_1 ) ) ( ( rule__Schemata__SchemataAssignment_1 )* ) ) ;
    public final void rule__Schemata__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:801:1: ( ( ( ( rule__Schemata__SchemataAssignment_1 ) ) ( ( rule__Schemata__SchemataAssignment_1 )* ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:802:1: ( ( ( rule__Schemata__SchemataAssignment_1 ) ) ( ( rule__Schemata__SchemataAssignment_1 )* ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:802:1: ( ( ( rule__Schemata__SchemataAssignment_1 ) ) ( ( rule__Schemata__SchemataAssignment_1 )* ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:803:1: ( ( rule__Schemata__SchemataAssignment_1 ) ) ( ( rule__Schemata__SchemataAssignment_1 )* )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:803:1: ( ( rule__Schemata__SchemataAssignment_1 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:804:1: ( rule__Schemata__SchemataAssignment_1 )
            {
             before(grammarAccess.getSchemataAccess().getSchemataAssignment_1()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:805:1: ( rule__Schemata__SchemataAssignment_1 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:805:2: rule__Schemata__SchemataAssignment_1
            {
            pushFollow(FOLLOW_rule__Schemata__SchemataAssignment_1_in_rule__Schemata__Group__1__Impl1710);
            rule__Schemata__SchemataAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSchemataAccess().getSchemataAssignment_1()); 

            }

            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:808:1: ( ( rule__Schemata__SchemataAssignment_1 )* )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:809:1: ( rule__Schemata__SchemataAssignment_1 )*
            {
             before(grammarAccess.getSchemataAccess().getSchemataAssignment_1()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:810:1: ( rule__Schemata__SchemataAssignment_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_CREATED && LA10_0<=RULE_VIOLATED)||LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:810:2: rule__Schemata__SchemataAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Schemata__SchemataAssignment_1_in_rule__Schemata__Group__1__Impl1722);
            	    rule__Schemata__SchemataAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getSchemataAccess().getSchemataAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schemata__Group__1__Impl"


    // $ANTLR start "rule__EventRelation__Group__0"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:825:1: rule__EventRelation__Group__0 : rule__EventRelation__Group__0__Impl rule__EventRelation__Group__1 ;
    public final void rule__EventRelation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:829:1: ( rule__EventRelation__Group__0__Impl rule__EventRelation__Group__1 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:830:2: rule__EventRelation__Group__0__Impl rule__EventRelation__Group__1
            {
            pushFollow(FOLLOW_rule__EventRelation__Group__0__Impl_in_rule__EventRelation__Group__01759);
            rule__EventRelation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EventRelation__Group__1_in_rule__EventRelation__Group__01762);
            rule__EventRelation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__Group__0"


    // $ANTLR start "rule__EventRelation__Group__0__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:837:1: rule__EventRelation__Group__0__Impl : ( ( rule__EventRelation__EventAssignment_0 ) ) ;
    public final void rule__EventRelation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:841:1: ( ( ( rule__EventRelation__EventAssignment_0 ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:842:1: ( ( rule__EventRelation__EventAssignment_0 ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:842:1: ( ( rule__EventRelation__EventAssignment_0 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:843:1: ( rule__EventRelation__EventAssignment_0 )
            {
             before(grammarAccess.getEventRelationAccess().getEventAssignment_0()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:844:1: ( rule__EventRelation__EventAssignment_0 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:844:2: rule__EventRelation__EventAssignment_0
            {
            pushFollow(FOLLOW_rule__EventRelation__EventAssignment_0_in_rule__EventRelation__Group__0__Impl1789);
            rule__EventRelation__EventAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEventRelationAccess().getEventAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__Group__0__Impl"


    // $ANTLR start "rule__EventRelation__Group__1"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:854:1: rule__EventRelation__Group__1 : rule__EventRelation__Group__1__Impl rule__EventRelation__Group__2 ;
    public final void rule__EventRelation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:858:1: ( rule__EventRelation__Group__1__Impl rule__EventRelation__Group__2 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:859:2: rule__EventRelation__Group__1__Impl rule__EventRelation__Group__2
            {
            pushFollow(FOLLOW_rule__EventRelation__Group__1__Impl_in_rule__EventRelation__Group__11819);
            rule__EventRelation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EventRelation__Group__2_in_rule__EventRelation__Group__11822);
            rule__EventRelation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__Group__1"


    // $ANTLR start "rule__EventRelation__Group__1__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:866:1: rule__EventRelation__Group__1__Impl : ( RULE_LPAREN ) ;
    public final void rule__EventRelation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:870:1: ( ( RULE_LPAREN ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:871:1: ( RULE_LPAREN )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:871:1: ( RULE_LPAREN )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:872:1: RULE_LPAREN
            {
             before(grammarAccess.getEventRelationAccess().getLPARENTerminalRuleCall_1()); 
            match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_rule__EventRelation__Group__1__Impl1849); 
             after(grammarAccess.getEventRelationAccess().getLPARENTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__Group__1__Impl"


    // $ANTLR start "rule__EventRelation__Group__2"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:883:1: rule__EventRelation__Group__2 : rule__EventRelation__Group__2__Impl rule__EventRelation__Group__3 ;
    public final void rule__EventRelation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:887:1: ( rule__EventRelation__Group__2__Impl rule__EventRelation__Group__3 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:888:2: rule__EventRelation__Group__2__Impl rule__EventRelation__Group__3
            {
            pushFollow(FOLLOW_rule__EventRelation__Group__2__Impl_in_rule__EventRelation__Group__21878);
            rule__EventRelation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EventRelation__Group__3_in_rule__EventRelation__Group__21881);
            rule__EventRelation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__Group__2"


    // $ANTLR start "rule__EventRelation__Group__2__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:895:1: rule__EventRelation__Group__2__Impl : ( ( rule__EventRelation__ParamsAssignment_2 ) ) ;
    public final void rule__EventRelation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:899:1: ( ( ( rule__EventRelation__ParamsAssignment_2 ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:900:1: ( ( rule__EventRelation__ParamsAssignment_2 ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:900:1: ( ( rule__EventRelation__ParamsAssignment_2 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:901:1: ( rule__EventRelation__ParamsAssignment_2 )
            {
             before(grammarAccess.getEventRelationAccess().getParamsAssignment_2()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:902:1: ( rule__EventRelation__ParamsAssignment_2 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:902:2: rule__EventRelation__ParamsAssignment_2
            {
            pushFollow(FOLLOW_rule__EventRelation__ParamsAssignment_2_in_rule__EventRelation__Group__2__Impl1908);
            rule__EventRelation__ParamsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEventRelationAccess().getParamsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__Group__2__Impl"


    // $ANTLR start "rule__EventRelation__Group__3"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:912:1: rule__EventRelation__Group__3 : rule__EventRelation__Group__3__Impl rule__EventRelation__Group__4 ;
    public final void rule__EventRelation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:916:1: ( rule__EventRelation__Group__3__Impl rule__EventRelation__Group__4 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:917:2: rule__EventRelation__Group__3__Impl rule__EventRelation__Group__4
            {
            pushFollow(FOLLOW_rule__EventRelation__Group__3__Impl_in_rule__EventRelation__Group__31938);
            rule__EventRelation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EventRelation__Group__4_in_rule__EventRelation__Group__31941);
            rule__EventRelation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__Group__3"


    // $ANTLR start "rule__EventRelation__Group__3__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:924:1: rule__EventRelation__Group__3__Impl : ( ( rule__EventRelation__Group_3__0 )* ) ;
    public final void rule__EventRelation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:928:1: ( ( ( rule__EventRelation__Group_3__0 )* ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:929:1: ( ( rule__EventRelation__Group_3__0 )* )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:929:1: ( ( rule__EventRelation__Group_3__0 )* )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:930:1: ( rule__EventRelation__Group_3__0 )*
            {
             before(grammarAccess.getEventRelationAccess().getGroup_3()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:931:1: ( rule__EventRelation__Group_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_COMMA) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:931:2: rule__EventRelation__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__EventRelation__Group_3__0_in_rule__EventRelation__Group__3__Impl1968);
            	    rule__EventRelation__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getEventRelationAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__Group__3__Impl"


    // $ANTLR start "rule__EventRelation__Group__4"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:941:1: rule__EventRelation__Group__4 : rule__EventRelation__Group__4__Impl rule__EventRelation__Group__5 ;
    public final void rule__EventRelation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:945:1: ( rule__EventRelation__Group__4__Impl rule__EventRelation__Group__5 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:946:2: rule__EventRelation__Group__4__Impl rule__EventRelation__Group__5
            {
            pushFollow(FOLLOW_rule__EventRelation__Group__4__Impl_in_rule__EventRelation__Group__41999);
            rule__EventRelation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EventRelation__Group__5_in_rule__EventRelation__Group__42002);
            rule__EventRelation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__Group__4"


    // $ANTLR start "rule__EventRelation__Group__4__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:953:1: rule__EventRelation__Group__4__Impl : ( RULE_RPAREN ) ;
    public final void rule__EventRelation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:957:1: ( ( RULE_RPAREN ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:958:1: ( RULE_RPAREN )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:958:1: ( RULE_RPAREN )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:959:1: RULE_RPAREN
            {
             before(grammarAccess.getEventRelationAccess().getRPARENTerminalRuleCall_4()); 
            match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_rule__EventRelation__Group__4__Impl2029); 
             after(grammarAccess.getEventRelationAccess().getRPARENTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__Group__4__Impl"


    // $ANTLR start "rule__EventRelation__Group__5"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:970:1: rule__EventRelation__Group__5 : rule__EventRelation__Group__5__Impl rule__EventRelation__Group__6 ;
    public final void rule__EventRelation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:974:1: ( rule__EventRelation__Group__5__Impl rule__EventRelation__Group__6 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:975:2: rule__EventRelation__Group__5__Impl rule__EventRelation__Group__6
            {
            pushFollow(FOLLOW_rule__EventRelation__Group__5__Impl_in_rule__EventRelation__Group__52058);
            rule__EventRelation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EventRelation__Group__6_in_rule__EventRelation__Group__52061);
            rule__EventRelation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__Group__5"


    // $ANTLR start "rule__EventRelation__Group__5__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:982:1: rule__EventRelation__Group__5__Impl : ( RULE_KEY ) ;
    public final void rule__EventRelation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:986:1: ( ( RULE_KEY ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:987:1: ( RULE_KEY )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:987:1: ( RULE_KEY )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:988:1: RULE_KEY
            {
             before(grammarAccess.getEventRelationAccess().getKEYTerminalRuleCall_5()); 
            match(input,RULE_KEY,FOLLOW_RULE_KEY_in_rule__EventRelation__Group__5__Impl2088); 
             after(grammarAccess.getEventRelationAccess().getKEYTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__Group__5__Impl"


    // $ANTLR start "rule__EventRelation__Group__6"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:999:1: rule__EventRelation__Group__6 : rule__EventRelation__Group__6__Impl rule__EventRelation__Group__7 ;
    public final void rule__EventRelation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1003:1: ( rule__EventRelation__Group__6__Impl rule__EventRelation__Group__7 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1004:2: rule__EventRelation__Group__6__Impl rule__EventRelation__Group__7
            {
            pushFollow(FOLLOW_rule__EventRelation__Group__6__Impl_in_rule__EventRelation__Group__62117);
            rule__EventRelation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EventRelation__Group__7_in_rule__EventRelation__Group__62120);
            rule__EventRelation__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__Group__6"


    // $ANTLR start "rule__EventRelation__Group__6__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1011:1: rule__EventRelation__Group__6__Impl : ( ( rule__EventRelation__KeyParamsAssignment_6 ) ) ;
    public final void rule__EventRelation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1015:1: ( ( ( rule__EventRelation__KeyParamsAssignment_6 ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1016:1: ( ( rule__EventRelation__KeyParamsAssignment_6 ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1016:1: ( ( rule__EventRelation__KeyParamsAssignment_6 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1017:1: ( rule__EventRelation__KeyParamsAssignment_6 )
            {
             before(grammarAccess.getEventRelationAccess().getKeyParamsAssignment_6()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1018:1: ( rule__EventRelation__KeyParamsAssignment_6 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1018:2: rule__EventRelation__KeyParamsAssignment_6
            {
            pushFollow(FOLLOW_rule__EventRelation__KeyParamsAssignment_6_in_rule__EventRelation__Group__6__Impl2147);
            rule__EventRelation__KeyParamsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getEventRelationAccess().getKeyParamsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__Group__6__Impl"


    // $ANTLR start "rule__EventRelation__Group__7"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1028:1: rule__EventRelation__Group__7 : rule__EventRelation__Group__7__Impl rule__EventRelation__Group__8 ;
    public final void rule__EventRelation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1032:1: ( rule__EventRelation__Group__7__Impl rule__EventRelation__Group__8 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1033:2: rule__EventRelation__Group__7__Impl rule__EventRelation__Group__8
            {
            pushFollow(FOLLOW_rule__EventRelation__Group__7__Impl_in_rule__EventRelation__Group__72177);
            rule__EventRelation__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EventRelation__Group__8_in_rule__EventRelation__Group__72180);
            rule__EventRelation__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__Group__7"


    // $ANTLR start "rule__EventRelation__Group__7__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1040:1: rule__EventRelation__Group__7__Impl : ( ( rule__EventRelation__Group_7__0 )* ) ;
    public final void rule__EventRelation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1044:1: ( ( ( rule__EventRelation__Group_7__0 )* ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1045:1: ( ( rule__EventRelation__Group_7__0 )* )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1045:1: ( ( rule__EventRelation__Group_7__0 )* )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1046:1: ( rule__EventRelation__Group_7__0 )*
            {
             before(grammarAccess.getEventRelationAccess().getGroup_7()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1047:1: ( rule__EventRelation__Group_7__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_COMMA) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1047:2: rule__EventRelation__Group_7__0
            	    {
            	    pushFollow(FOLLOW_rule__EventRelation__Group_7__0_in_rule__EventRelation__Group__7__Impl2207);
            	    rule__EventRelation__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getEventRelationAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__Group__7__Impl"


    // $ANTLR start "rule__EventRelation__Group__8"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1057:1: rule__EventRelation__Group__8 : rule__EventRelation__Group__8__Impl rule__EventRelation__Group__9 ;
    public final void rule__EventRelation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1061:1: ( rule__EventRelation__Group__8__Impl rule__EventRelation__Group__9 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1062:2: rule__EventRelation__Group__8__Impl rule__EventRelation__Group__9
            {
            pushFollow(FOLLOW_rule__EventRelation__Group__8__Impl_in_rule__EventRelation__Group__82238);
            rule__EventRelation__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EventRelation__Group__9_in_rule__EventRelation__Group__82241);
            rule__EventRelation__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__Group__8"


    // $ANTLR start "rule__EventRelation__Group__8__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1069:1: rule__EventRelation__Group__8__Impl : ( RULE_TIME ) ;
    public final void rule__EventRelation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1073:1: ( ( RULE_TIME ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1074:1: ( RULE_TIME )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1074:1: ( RULE_TIME )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1075:1: RULE_TIME
            {
             before(grammarAccess.getEventRelationAccess().getTIMETerminalRuleCall_8()); 
            match(input,RULE_TIME,FOLLOW_RULE_TIME_in_rule__EventRelation__Group__8__Impl2268); 
             after(grammarAccess.getEventRelationAccess().getTIMETerminalRuleCall_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__Group__8__Impl"


    // $ANTLR start "rule__EventRelation__Group__9"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1086:1: rule__EventRelation__Group__9 : rule__EventRelation__Group__9__Impl ;
    public final void rule__EventRelation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1090:1: ( rule__EventRelation__Group__9__Impl )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1091:2: rule__EventRelation__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__EventRelation__Group__9__Impl_in_rule__EventRelation__Group__92297);
            rule__EventRelation__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__Group__9"


    // $ANTLR start "rule__EventRelation__Group__9__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1097:1: rule__EventRelation__Group__9__Impl : ( ( rule__EventRelation__TimeParamAssignment_9 ) ) ;
    public final void rule__EventRelation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1101:1: ( ( ( rule__EventRelation__TimeParamAssignment_9 ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1102:1: ( ( rule__EventRelation__TimeParamAssignment_9 ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1102:1: ( ( rule__EventRelation__TimeParamAssignment_9 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1103:1: ( rule__EventRelation__TimeParamAssignment_9 )
            {
             before(grammarAccess.getEventRelationAccess().getTimeParamAssignment_9()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1104:1: ( rule__EventRelation__TimeParamAssignment_9 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1104:2: rule__EventRelation__TimeParamAssignment_9
            {
            pushFollow(FOLLOW_rule__EventRelation__TimeParamAssignment_9_in_rule__EventRelation__Group__9__Impl2324);
            rule__EventRelation__TimeParamAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getEventRelationAccess().getTimeParamAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__Group__9__Impl"


    // $ANTLR start "rule__EventRelation__Group_3__0"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1134:1: rule__EventRelation__Group_3__0 : rule__EventRelation__Group_3__0__Impl rule__EventRelation__Group_3__1 ;
    public final void rule__EventRelation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1138:1: ( rule__EventRelation__Group_3__0__Impl rule__EventRelation__Group_3__1 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1139:2: rule__EventRelation__Group_3__0__Impl rule__EventRelation__Group_3__1
            {
            pushFollow(FOLLOW_rule__EventRelation__Group_3__0__Impl_in_rule__EventRelation__Group_3__02374);
            rule__EventRelation__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EventRelation__Group_3__1_in_rule__EventRelation__Group_3__02377);
            rule__EventRelation__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__Group_3__0"


    // $ANTLR start "rule__EventRelation__Group_3__0__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1146:1: rule__EventRelation__Group_3__0__Impl : ( RULE_COMMA ) ;
    public final void rule__EventRelation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1150:1: ( ( RULE_COMMA ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1151:1: ( RULE_COMMA )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1151:1: ( RULE_COMMA )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1152:1: RULE_COMMA
            {
             before(grammarAccess.getEventRelationAccess().getCOMMATerminalRuleCall_3_0()); 
            match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rule__EventRelation__Group_3__0__Impl2404); 
             after(grammarAccess.getEventRelationAccess().getCOMMATerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__Group_3__0__Impl"


    // $ANTLR start "rule__EventRelation__Group_3__1"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1163:1: rule__EventRelation__Group_3__1 : rule__EventRelation__Group_3__1__Impl ;
    public final void rule__EventRelation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1167:1: ( rule__EventRelation__Group_3__1__Impl )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1168:2: rule__EventRelation__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__EventRelation__Group_3__1__Impl_in_rule__EventRelation__Group_3__12433);
            rule__EventRelation__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__Group_3__1"


    // $ANTLR start "rule__EventRelation__Group_3__1__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1174:1: rule__EventRelation__Group_3__1__Impl : ( ( rule__EventRelation__ParamsAssignment_3_1 ) ) ;
    public final void rule__EventRelation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1178:1: ( ( ( rule__EventRelation__ParamsAssignment_3_1 ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1179:1: ( ( rule__EventRelation__ParamsAssignment_3_1 ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1179:1: ( ( rule__EventRelation__ParamsAssignment_3_1 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1180:1: ( rule__EventRelation__ParamsAssignment_3_1 )
            {
             before(grammarAccess.getEventRelationAccess().getParamsAssignment_3_1()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1181:1: ( rule__EventRelation__ParamsAssignment_3_1 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1181:2: rule__EventRelation__ParamsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__EventRelation__ParamsAssignment_3_1_in_rule__EventRelation__Group_3__1__Impl2460);
            rule__EventRelation__ParamsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEventRelationAccess().getParamsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__Group_3__1__Impl"


    // $ANTLR start "rule__EventRelation__Group_7__0"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1195:1: rule__EventRelation__Group_7__0 : rule__EventRelation__Group_7__0__Impl rule__EventRelation__Group_7__1 ;
    public final void rule__EventRelation__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1199:1: ( rule__EventRelation__Group_7__0__Impl rule__EventRelation__Group_7__1 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1200:2: rule__EventRelation__Group_7__0__Impl rule__EventRelation__Group_7__1
            {
            pushFollow(FOLLOW_rule__EventRelation__Group_7__0__Impl_in_rule__EventRelation__Group_7__02494);
            rule__EventRelation__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EventRelation__Group_7__1_in_rule__EventRelation__Group_7__02497);
            rule__EventRelation__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__Group_7__0"


    // $ANTLR start "rule__EventRelation__Group_7__0__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1207:1: rule__EventRelation__Group_7__0__Impl : ( RULE_COMMA ) ;
    public final void rule__EventRelation__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1211:1: ( ( RULE_COMMA ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1212:1: ( RULE_COMMA )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1212:1: ( RULE_COMMA )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1213:1: RULE_COMMA
            {
             before(grammarAccess.getEventRelationAccess().getCOMMATerminalRuleCall_7_0()); 
            match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rule__EventRelation__Group_7__0__Impl2524); 
             after(grammarAccess.getEventRelationAccess().getCOMMATerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__Group_7__0__Impl"


    // $ANTLR start "rule__EventRelation__Group_7__1"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1224:1: rule__EventRelation__Group_7__1 : rule__EventRelation__Group_7__1__Impl ;
    public final void rule__EventRelation__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1228:1: ( rule__EventRelation__Group_7__1__Impl )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1229:2: rule__EventRelation__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__EventRelation__Group_7__1__Impl_in_rule__EventRelation__Group_7__12553);
            rule__EventRelation__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__Group_7__1"


    // $ANTLR start "rule__EventRelation__Group_7__1__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1235:1: rule__EventRelation__Group_7__1__Impl : ( ( rule__EventRelation__KeyParamsAssignment_7_1 ) ) ;
    public final void rule__EventRelation__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1239:1: ( ( ( rule__EventRelation__KeyParamsAssignment_7_1 ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1240:1: ( ( rule__EventRelation__KeyParamsAssignment_7_1 ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1240:1: ( ( rule__EventRelation__KeyParamsAssignment_7_1 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1241:1: ( rule__EventRelation__KeyParamsAssignment_7_1 )
            {
             before(grammarAccess.getEventRelationAccess().getKeyParamsAssignment_7_1()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1242:1: ( rule__EventRelation__KeyParamsAssignment_7_1 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1242:2: rule__EventRelation__KeyParamsAssignment_7_1
            {
            pushFollow(FOLLOW_rule__EventRelation__KeyParamsAssignment_7_1_in_rule__EventRelation__Group_7__1__Impl2580);
            rule__EventRelation__KeyParamsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getEventRelationAccess().getKeyParamsAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__Group_7__1__Impl"


    // $ANTLR start "rule__Commitment__Group__0"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1256:1: rule__Commitment__Group__0 : rule__Commitment__Group__0__Impl rule__Commitment__Group__1 ;
    public final void rule__Commitment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1260:1: ( rule__Commitment__Group__0__Impl rule__Commitment__Group__1 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1261:2: rule__Commitment__Group__0__Impl rule__Commitment__Group__1
            {
            pushFollow(FOLLOW_rule__Commitment__Group__0__Impl_in_rule__Commitment__Group__02614);
            rule__Commitment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Commitment__Group__1_in_rule__Commitment__Group__02617);
            rule__Commitment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commitment__Group__0"


    // $ANTLR start "rule__Commitment__Group__0__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1268:1: rule__Commitment__Group__0__Impl : ( RULE_COMMIT ) ;
    public final void rule__Commitment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1272:1: ( ( RULE_COMMIT ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1273:1: ( RULE_COMMIT )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1273:1: ( RULE_COMMIT )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1274:1: RULE_COMMIT
            {
             before(grammarAccess.getCommitmentAccess().getCOMMITTerminalRuleCall_0()); 
            match(input,RULE_COMMIT,FOLLOW_RULE_COMMIT_in_rule__Commitment__Group__0__Impl2644); 
             after(grammarAccess.getCommitmentAccess().getCOMMITTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commitment__Group__0__Impl"


    // $ANTLR start "rule__Commitment__Group__1"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1285:1: rule__Commitment__Group__1 : rule__Commitment__Group__1__Impl rule__Commitment__Group__2 ;
    public final void rule__Commitment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1289:1: ( rule__Commitment__Group__1__Impl rule__Commitment__Group__2 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1290:2: rule__Commitment__Group__1__Impl rule__Commitment__Group__2
            {
            pushFollow(FOLLOW_rule__Commitment__Group__1__Impl_in_rule__Commitment__Group__12673);
            rule__Commitment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Commitment__Group__2_in_rule__Commitment__Group__12676);
            rule__Commitment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commitment__Group__1"


    // $ANTLR start "rule__Commitment__Group__1__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1297:1: rule__Commitment__Group__1__Impl : ( ( rule__Commitment__LabelAssignment_1 ) ) ;
    public final void rule__Commitment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1301:1: ( ( ( rule__Commitment__LabelAssignment_1 ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1302:1: ( ( rule__Commitment__LabelAssignment_1 ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1302:1: ( ( rule__Commitment__LabelAssignment_1 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1303:1: ( rule__Commitment__LabelAssignment_1 )
            {
             before(grammarAccess.getCommitmentAccess().getLabelAssignment_1()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1304:1: ( rule__Commitment__LabelAssignment_1 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1304:2: rule__Commitment__LabelAssignment_1
            {
            pushFollow(FOLLOW_rule__Commitment__LabelAssignment_1_in_rule__Commitment__Group__1__Impl2703);
            rule__Commitment__LabelAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCommitmentAccess().getLabelAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commitment__Group__1__Impl"


    // $ANTLR start "rule__Commitment__Group__2"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1314:1: rule__Commitment__Group__2 : rule__Commitment__Group__2__Impl rule__Commitment__Group__3 ;
    public final void rule__Commitment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1318:1: ( rule__Commitment__Group__2__Impl rule__Commitment__Group__3 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1319:2: rule__Commitment__Group__2__Impl rule__Commitment__Group__3
            {
            pushFollow(FOLLOW_rule__Commitment__Group__2__Impl_in_rule__Commitment__Group__22733);
            rule__Commitment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Commitment__Group__3_in_rule__Commitment__Group__22736);
            rule__Commitment__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commitment__Group__2"


    // $ANTLR start "rule__Commitment__Group__2__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1326:1: rule__Commitment__Group__2__Impl : ( ( rule__Commitment__DebtorAssignment_2 ) ) ;
    public final void rule__Commitment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1330:1: ( ( ( rule__Commitment__DebtorAssignment_2 ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1331:1: ( ( rule__Commitment__DebtorAssignment_2 ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1331:1: ( ( rule__Commitment__DebtorAssignment_2 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1332:1: ( rule__Commitment__DebtorAssignment_2 )
            {
             before(grammarAccess.getCommitmentAccess().getDebtorAssignment_2()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1333:1: ( rule__Commitment__DebtorAssignment_2 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1333:2: rule__Commitment__DebtorAssignment_2
            {
            pushFollow(FOLLOW_rule__Commitment__DebtorAssignment_2_in_rule__Commitment__Group__2__Impl2763);
            rule__Commitment__DebtorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCommitmentAccess().getDebtorAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commitment__Group__2__Impl"


    // $ANTLR start "rule__Commitment__Group__3"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1343:1: rule__Commitment__Group__3 : rule__Commitment__Group__3__Impl rule__Commitment__Group__4 ;
    public final void rule__Commitment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1347:1: ( rule__Commitment__Group__3__Impl rule__Commitment__Group__4 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1348:2: rule__Commitment__Group__3__Impl rule__Commitment__Group__4
            {
            pushFollow(FOLLOW_rule__Commitment__Group__3__Impl_in_rule__Commitment__Group__32793);
            rule__Commitment__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Commitment__Group__4_in_rule__Commitment__Group__32796);
            rule__Commitment__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commitment__Group__3"


    // $ANTLR start "rule__Commitment__Group__3__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1355:1: rule__Commitment__Group__3__Impl : ( RULE_TO ) ;
    public final void rule__Commitment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1359:1: ( ( RULE_TO ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1360:1: ( RULE_TO )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1360:1: ( RULE_TO )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1361:1: RULE_TO
            {
             before(grammarAccess.getCommitmentAccess().getTOTerminalRuleCall_3()); 
            match(input,RULE_TO,FOLLOW_RULE_TO_in_rule__Commitment__Group__3__Impl2823); 
             after(grammarAccess.getCommitmentAccess().getTOTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commitment__Group__3__Impl"


    // $ANTLR start "rule__Commitment__Group__4"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1372:1: rule__Commitment__Group__4 : rule__Commitment__Group__4__Impl rule__Commitment__Group__5 ;
    public final void rule__Commitment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1376:1: ( rule__Commitment__Group__4__Impl rule__Commitment__Group__5 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1377:2: rule__Commitment__Group__4__Impl rule__Commitment__Group__5
            {
            pushFollow(FOLLOW_rule__Commitment__Group__4__Impl_in_rule__Commitment__Group__42852);
            rule__Commitment__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Commitment__Group__5_in_rule__Commitment__Group__42855);
            rule__Commitment__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commitment__Group__4"


    // $ANTLR start "rule__Commitment__Group__4__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1384:1: rule__Commitment__Group__4__Impl : ( ( rule__Commitment__CreditorAssignment_4 ) ) ;
    public final void rule__Commitment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1388:1: ( ( ( rule__Commitment__CreditorAssignment_4 ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1389:1: ( ( rule__Commitment__CreditorAssignment_4 ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1389:1: ( ( rule__Commitment__CreditorAssignment_4 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1390:1: ( rule__Commitment__CreditorAssignment_4 )
            {
             before(grammarAccess.getCommitmentAccess().getCreditorAssignment_4()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1391:1: ( rule__Commitment__CreditorAssignment_4 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1391:2: rule__Commitment__CreditorAssignment_4
            {
            pushFollow(FOLLOW_rule__Commitment__CreditorAssignment_4_in_rule__Commitment__Group__4__Impl2882);
            rule__Commitment__CreditorAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCommitmentAccess().getCreditorAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commitment__Group__4__Impl"


    // $ANTLR start "rule__Commitment__Group__5"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1401:1: rule__Commitment__Group__5 : rule__Commitment__Group__5__Impl rule__Commitment__Group__6 ;
    public final void rule__Commitment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1405:1: ( rule__Commitment__Group__5__Impl rule__Commitment__Group__6 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1406:2: rule__Commitment__Group__5__Impl rule__Commitment__Group__6
            {
            pushFollow(FOLLOW_rule__Commitment__Group__5__Impl_in_rule__Commitment__Group__52912);
            rule__Commitment__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Commitment__Group__6_in_rule__Commitment__Group__52915);
            rule__Commitment__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commitment__Group__5"


    // $ANTLR start "rule__Commitment__Group__5__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1413:1: rule__Commitment__Group__5__Impl : ( RULE_CREATE ) ;
    public final void rule__Commitment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1417:1: ( ( RULE_CREATE ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1418:1: ( RULE_CREATE )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1418:1: ( RULE_CREATE )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1419:1: RULE_CREATE
            {
             before(grammarAccess.getCommitmentAccess().getCREATETerminalRuleCall_5()); 
            match(input,RULE_CREATE,FOLLOW_RULE_CREATE_in_rule__Commitment__Group__5__Impl2942); 
             after(grammarAccess.getCommitmentAccess().getCREATETerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commitment__Group__5__Impl"


    // $ANTLR start "rule__Commitment__Group__6"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1430:1: rule__Commitment__Group__6 : rule__Commitment__Group__6__Impl rule__Commitment__Group__7 ;
    public final void rule__Commitment__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1434:1: ( rule__Commitment__Group__6__Impl rule__Commitment__Group__7 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1435:2: rule__Commitment__Group__6__Impl rule__Commitment__Group__7
            {
            pushFollow(FOLLOW_rule__Commitment__Group__6__Impl_in_rule__Commitment__Group__62971);
            rule__Commitment__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Commitment__Group__7_in_rule__Commitment__Group__62974);
            rule__Commitment__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commitment__Group__6"


    // $ANTLR start "rule__Commitment__Group__6__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1442:1: rule__Commitment__Group__6__Impl : ( ( rule__Commitment__TriggerAssignment_6 ) ) ;
    public final void rule__Commitment__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1446:1: ( ( ( rule__Commitment__TriggerAssignment_6 ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1447:1: ( ( rule__Commitment__TriggerAssignment_6 ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1447:1: ( ( rule__Commitment__TriggerAssignment_6 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1448:1: ( rule__Commitment__TriggerAssignment_6 )
            {
             before(grammarAccess.getCommitmentAccess().getTriggerAssignment_6()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1449:1: ( rule__Commitment__TriggerAssignment_6 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1449:2: rule__Commitment__TriggerAssignment_6
            {
            pushFollow(FOLLOW_rule__Commitment__TriggerAssignment_6_in_rule__Commitment__Group__6__Impl3001);
            rule__Commitment__TriggerAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getCommitmentAccess().getTriggerAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commitment__Group__6__Impl"


    // $ANTLR start "rule__Commitment__Group__7"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1459:1: rule__Commitment__Group__7 : rule__Commitment__Group__7__Impl rule__Commitment__Group__8 ;
    public final void rule__Commitment__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1463:1: ( rule__Commitment__Group__7__Impl rule__Commitment__Group__8 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1464:2: rule__Commitment__Group__7__Impl rule__Commitment__Group__8
            {
            pushFollow(FOLLOW_rule__Commitment__Group__7__Impl_in_rule__Commitment__Group__73031);
            rule__Commitment__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Commitment__Group__8_in_rule__Commitment__Group__73034);
            rule__Commitment__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commitment__Group__7"


    // $ANTLR start "rule__Commitment__Group__7__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1471:1: rule__Commitment__Group__7__Impl : ( ( rule__Commitment__Group_7__0 )? ) ;
    public final void rule__Commitment__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1475:1: ( ( ( rule__Commitment__Group_7__0 )? ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1476:1: ( ( rule__Commitment__Group_7__0 )? )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1476:1: ( ( rule__Commitment__Group_7__0 )? )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1477:1: ( rule__Commitment__Group_7__0 )?
            {
             before(grammarAccess.getCommitmentAccess().getGroup_7()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1478:1: ( rule__Commitment__Group_7__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_DETACH) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1478:2: rule__Commitment__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Commitment__Group_7__0_in_rule__Commitment__Group__7__Impl3061);
                    rule__Commitment__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCommitmentAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commitment__Group__7__Impl"


    // $ANTLR start "rule__Commitment__Group__8"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1488:1: rule__Commitment__Group__8 : rule__Commitment__Group__8__Impl rule__Commitment__Group__9 ;
    public final void rule__Commitment__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1492:1: ( rule__Commitment__Group__8__Impl rule__Commitment__Group__9 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1493:2: rule__Commitment__Group__8__Impl rule__Commitment__Group__9
            {
            pushFollow(FOLLOW_rule__Commitment__Group__8__Impl_in_rule__Commitment__Group__83092);
            rule__Commitment__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Commitment__Group__9_in_rule__Commitment__Group__83095);
            rule__Commitment__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commitment__Group__8"


    // $ANTLR start "rule__Commitment__Group__8__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1500:1: rule__Commitment__Group__8__Impl : ( RULE_DISCHARGE ) ;
    public final void rule__Commitment__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1504:1: ( ( RULE_DISCHARGE ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1505:1: ( RULE_DISCHARGE )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1505:1: ( RULE_DISCHARGE )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1506:1: RULE_DISCHARGE
            {
             before(grammarAccess.getCommitmentAccess().getDISCHARGETerminalRuleCall_8()); 
            match(input,RULE_DISCHARGE,FOLLOW_RULE_DISCHARGE_in_rule__Commitment__Group__8__Impl3122); 
             after(grammarAccess.getCommitmentAccess().getDISCHARGETerminalRuleCall_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commitment__Group__8__Impl"


    // $ANTLR start "rule__Commitment__Group__9"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1517:1: rule__Commitment__Group__9 : rule__Commitment__Group__9__Impl ;
    public final void rule__Commitment__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1521:1: ( rule__Commitment__Group__9__Impl )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1522:2: rule__Commitment__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__Commitment__Group__9__Impl_in_rule__Commitment__Group__93151);
            rule__Commitment__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commitment__Group__9"


    // $ANTLR start "rule__Commitment__Group__9__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1528:1: rule__Commitment__Group__9__Impl : ( ( rule__Commitment__ConsequentAssignment_9 ) ) ;
    public final void rule__Commitment__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1532:1: ( ( ( rule__Commitment__ConsequentAssignment_9 ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1533:1: ( ( rule__Commitment__ConsequentAssignment_9 ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1533:1: ( ( rule__Commitment__ConsequentAssignment_9 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1534:1: ( rule__Commitment__ConsequentAssignment_9 )
            {
             before(grammarAccess.getCommitmentAccess().getConsequentAssignment_9()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1535:1: ( rule__Commitment__ConsequentAssignment_9 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1535:2: rule__Commitment__ConsequentAssignment_9
            {
            pushFollow(FOLLOW_rule__Commitment__ConsequentAssignment_9_in_rule__Commitment__Group__9__Impl3178);
            rule__Commitment__ConsequentAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getCommitmentAccess().getConsequentAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commitment__Group__9__Impl"


    // $ANTLR start "rule__Commitment__Group_7__0"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1565:1: rule__Commitment__Group_7__0 : rule__Commitment__Group_7__0__Impl rule__Commitment__Group_7__1 ;
    public final void rule__Commitment__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1569:1: ( rule__Commitment__Group_7__0__Impl rule__Commitment__Group_7__1 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1570:2: rule__Commitment__Group_7__0__Impl rule__Commitment__Group_7__1
            {
            pushFollow(FOLLOW_rule__Commitment__Group_7__0__Impl_in_rule__Commitment__Group_7__03228);
            rule__Commitment__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Commitment__Group_7__1_in_rule__Commitment__Group_7__03231);
            rule__Commitment__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commitment__Group_7__0"


    // $ANTLR start "rule__Commitment__Group_7__0__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1577:1: rule__Commitment__Group_7__0__Impl : ( RULE_DETACH ) ;
    public final void rule__Commitment__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1581:1: ( ( RULE_DETACH ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1582:1: ( RULE_DETACH )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1582:1: ( RULE_DETACH )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1583:1: RULE_DETACH
            {
             before(grammarAccess.getCommitmentAccess().getDETACHTerminalRuleCall_7_0()); 
            match(input,RULE_DETACH,FOLLOW_RULE_DETACH_in_rule__Commitment__Group_7__0__Impl3258); 
             after(grammarAccess.getCommitmentAccess().getDETACHTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commitment__Group_7__0__Impl"


    // $ANTLR start "rule__Commitment__Group_7__1"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1594:1: rule__Commitment__Group_7__1 : rule__Commitment__Group_7__1__Impl ;
    public final void rule__Commitment__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1598:1: ( rule__Commitment__Group_7__1__Impl )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1599:2: rule__Commitment__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__Commitment__Group_7__1__Impl_in_rule__Commitment__Group_7__13287);
            rule__Commitment__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commitment__Group_7__1"


    // $ANTLR start "rule__Commitment__Group_7__1__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1605:1: rule__Commitment__Group_7__1__Impl : ( ( rule__Commitment__AntecedentAssignment_7_1 ) ) ;
    public final void rule__Commitment__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1609:1: ( ( ( rule__Commitment__AntecedentAssignment_7_1 ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1610:1: ( ( rule__Commitment__AntecedentAssignment_7_1 ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1610:1: ( ( rule__Commitment__AntecedentAssignment_7_1 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1611:1: ( rule__Commitment__AntecedentAssignment_7_1 )
            {
             before(grammarAccess.getCommitmentAccess().getAntecedentAssignment_7_1()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1612:1: ( rule__Commitment__AntecedentAssignment_7_1 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1612:2: rule__Commitment__AntecedentAssignment_7_1
            {
            pushFollow(FOLLOW_rule__Commitment__AntecedentAssignment_7_1_in_rule__Commitment__Group_7__1__Impl3314);
            rule__Commitment__AntecedentAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getCommitmentAccess().getAntecedentAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commitment__Group_7__1__Impl"


    // $ANTLR start "rule__GeneralExpr__Group__0"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1626:1: rule__GeneralExpr__Group__0 : rule__GeneralExpr__Group__0__Impl rule__GeneralExpr__Group__1 ;
    public final void rule__GeneralExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1630:1: ( rule__GeneralExpr__Group__0__Impl rule__GeneralExpr__Group__1 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1631:2: rule__GeneralExpr__Group__0__Impl rule__GeneralExpr__Group__1
            {
            pushFollow(FOLLOW_rule__GeneralExpr__Group__0__Impl_in_rule__GeneralExpr__Group__03348);
            rule__GeneralExpr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GeneralExpr__Group__1_in_rule__GeneralExpr__Group__03351);
            rule__GeneralExpr__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralExpr__Group__0"


    // $ANTLR start "rule__GeneralExpr__Group__0__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1638:1: rule__GeneralExpr__Group__0__Impl : ( ( rule__GeneralExpr__ExprAssignment_0 ) ) ;
    public final void rule__GeneralExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1642:1: ( ( ( rule__GeneralExpr__ExprAssignment_0 ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1643:1: ( ( rule__GeneralExpr__ExprAssignment_0 ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1643:1: ( ( rule__GeneralExpr__ExprAssignment_0 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1644:1: ( rule__GeneralExpr__ExprAssignment_0 )
            {
             before(grammarAccess.getGeneralExprAccess().getExprAssignment_0()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1645:1: ( rule__GeneralExpr__ExprAssignment_0 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1645:2: rule__GeneralExpr__ExprAssignment_0
            {
            pushFollow(FOLLOW_rule__GeneralExpr__ExprAssignment_0_in_rule__GeneralExpr__Group__0__Impl3378);
            rule__GeneralExpr__ExprAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getGeneralExprAccess().getExprAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralExpr__Group__0__Impl"


    // $ANTLR start "rule__GeneralExpr__Group__1"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1655:1: rule__GeneralExpr__Group__1 : rule__GeneralExpr__Group__1__Impl ;
    public final void rule__GeneralExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1659:1: ( rule__GeneralExpr__Group__1__Impl )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1660:2: rule__GeneralExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GeneralExpr__Group__1__Impl_in_rule__GeneralExpr__Group__13408);
            rule__GeneralExpr__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralExpr__Group__1"


    // $ANTLR start "rule__GeneralExpr__Group__1__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1666:1: rule__GeneralExpr__Group__1__Impl : ( ( rule__GeneralExpr__Group_1__0 )? ) ;
    public final void rule__GeneralExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1670:1: ( ( ( rule__GeneralExpr__Group_1__0 )? ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1671:1: ( ( rule__GeneralExpr__Group_1__0 )? )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1671:1: ( ( rule__GeneralExpr__Group_1__0 )? )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1672:1: ( rule__GeneralExpr__Group_1__0 )?
            {
             before(grammarAccess.getGeneralExprAccess().getGroup_1()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1673:1: ( rule__GeneralExpr__Group_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_WHERE) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1673:2: rule__GeneralExpr__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__GeneralExpr__Group_1__0_in_rule__GeneralExpr__Group__1__Impl3435);
                    rule__GeneralExpr__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGeneralExprAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralExpr__Group__1__Impl"


    // $ANTLR start "rule__GeneralExpr__Group_1__0"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1687:1: rule__GeneralExpr__Group_1__0 : rule__GeneralExpr__Group_1__0__Impl rule__GeneralExpr__Group_1__1 ;
    public final void rule__GeneralExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1691:1: ( rule__GeneralExpr__Group_1__0__Impl rule__GeneralExpr__Group_1__1 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1692:2: rule__GeneralExpr__Group_1__0__Impl rule__GeneralExpr__Group_1__1
            {
            pushFollow(FOLLOW_rule__GeneralExpr__Group_1__0__Impl_in_rule__GeneralExpr__Group_1__03470);
            rule__GeneralExpr__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GeneralExpr__Group_1__1_in_rule__GeneralExpr__Group_1__03473);
            rule__GeneralExpr__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralExpr__Group_1__0"


    // $ANTLR start "rule__GeneralExpr__Group_1__0__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1699:1: rule__GeneralExpr__Group_1__0__Impl : ( ( rule__GeneralExpr__WhereAssignment_1_0 ) ) ;
    public final void rule__GeneralExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1703:1: ( ( ( rule__GeneralExpr__WhereAssignment_1_0 ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1704:1: ( ( rule__GeneralExpr__WhereAssignment_1_0 ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1704:1: ( ( rule__GeneralExpr__WhereAssignment_1_0 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1705:1: ( rule__GeneralExpr__WhereAssignment_1_0 )
            {
             before(grammarAccess.getGeneralExprAccess().getWhereAssignment_1_0()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1706:1: ( rule__GeneralExpr__WhereAssignment_1_0 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1706:2: rule__GeneralExpr__WhereAssignment_1_0
            {
            pushFollow(FOLLOW_rule__GeneralExpr__WhereAssignment_1_0_in_rule__GeneralExpr__Group_1__0__Impl3500);
            rule__GeneralExpr__WhereAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getGeneralExprAccess().getWhereAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralExpr__Group_1__0__Impl"


    // $ANTLR start "rule__GeneralExpr__Group_1__1"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1716:1: rule__GeneralExpr__Group_1__1 : rule__GeneralExpr__Group_1__1__Impl ;
    public final void rule__GeneralExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1720:1: ( rule__GeneralExpr__Group_1__1__Impl )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1721:2: rule__GeneralExpr__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__GeneralExpr__Group_1__1__Impl_in_rule__GeneralExpr__Group_1__13530);
            rule__GeneralExpr__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralExpr__Group_1__1"


    // $ANTLR start "rule__GeneralExpr__Group_1__1__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1727:1: rule__GeneralExpr__Group_1__1__Impl : ( ( rule__GeneralExpr__ArithAssignment_1_1 ) ) ;
    public final void rule__GeneralExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1731:1: ( ( ( rule__GeneralExpr__ArithAssignment_1_1 ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1732:1: ( ( rule__GeneralExpr__ArithAssignment_1_1 ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1732:1: ( ( rule__GeneralExpr__ArithAssignment_1_1 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1733:1: ( rule__GeneralExpr__ArithAssignment_1_1 )
            {
             before(grammarAccess.getGeneralExprAccess().getArithAssignment_1_1()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1734:1: ( rule__GeneralExpr__ArithAssignment_1_1 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1734:2: rule__GeneralExpr__ArithAssignment_1_1
            {
            pushFollow(FOLLOW_rule__GeneralExpr__ArithAssignment_1_1_in_rule__GeneralExpr__Group_1__1__Impl3557);
            rule__GeneralExpr__ArithAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getGeneralExprAccess().getArithAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralExpr__Group_1__1__Impl"


    // $ANTLR start "rule__Expr__Group_1__0"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1748:1: rule__Expr__Group_1__0 : rule__Expr__Group_1__0__Impl rule__Expr__Group_1__1 ;
    public final void rule__Expr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1752:1: ( rule__Expr__Group_1__0__Impl rule__Expr__Group_1__1 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1753:2: rule__Expr__Group_1__0__Impl rule__Expr__Group_1__1
            {
            pushFollow(FOLLOW_rule__Expr__Group_1__0__Impl_in_rule__Expr__Group_1__03591);
            rule__Expr__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expr__Group_1__1_in_rule__Expr__Group_1__03594);
            rule__Expr__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group_1__0"


    // $ANTLR start "rule__Expr__Group_1__0__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1760:1: rule__Expr__Group_1__0__Impl : ( ( rule__Expr__LeftAssignment_1_0 ) ) ;
    public final void rule__Expr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1764:1: ( ( ( rule__Expr__LeftAssignment_1_0 ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1765:1: ( ( rule__Expr__LeftAssignment_1_0 ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1765:1: ( ( rule__Expr__LeftAssignment_1_0 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1766:1: ( rule__Expr__LeftAssignment_1_0 )
            {
             before(grammarAccess.getExprAccess().getLeftAssignment_1_0()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1767:1: ( rule__Expr__LeftAssignment_1_0 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1767:2: rule__Expr__LeftAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Expr__LeftAssignment_1_0_in_rule__Expr__Group_1__0__Impl3621);
            rule__Expr__LeftAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getExprAccess().getLeftAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group_1__0__Impl"


    // $ANTLR start "rule__Expr__Group_1__1"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1777:1: rule__Expr__Group_1__1 : rule__Expr__Group_1__1__Impl rule__Expr__Group_1__2 ;
    public final void rule__Expr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1781:1: ( rule__Expr__Group_1__1__Impl rule__Expr__Group_1__2 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1782:2: rule__Expr__Group_1__1__Impl rule__Expr__Group_1__2
            {
            pushFollow(FOLLOW_rule__Expr__Group_1__1__Impl_in_rule__Expr__Group_1__13651);
            rule__Expr__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expr__Group_1__2_in_rule__Expr__Group_1__13654);
            rule__Expr__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group_1__1"


    // $ANTLR start "rule__Expr__Group_1__1__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1789:1: rule__Expr__Group_1__1__Impl : ( ( rule__Expr__OpAssignment_1_1 ) ) ;
    public final void rule__Expr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1793:1: ( ( ( rule__Expr__OpAssignment_1_1 ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1794:1: ( ( rule__Expr__OpAssignment_1_1 ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1794:1: ( ( rule__Expr__OpAssignment_1_1 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1795:1: ( rule__Expr__OpAssignment_1_1 )
            {
             before(grammarAccess.getExprAccess().getOpAssignment_1_1()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1796:1: ( rule__Expr__OpAssignment_1_1 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1796:2: rule__Expr__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Expr__OpAssignment_1_1_in_rule__Expr__Group_1__1__Impl3681);
            rule__Expr__OpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExprAccess().getOpAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group_1__1__Impl"


    // $ANTLR start "rule__Expr__Group_1__2"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1806:1: rule__Expr__Group_1__2 : rule__Expr__Group_1__2__Impl ;
    public final void rule__Expr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1810:1: ( rule__Expr__Group_1__2__Impl )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1811:2: rule__Expr__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Expr__Group_1__2__Impl_in_rule__Expr__Group_1__23711);
            rule__Expr__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group_1__2"


    // $ANTLR start "rule__Expr__Group_1__2__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1817:1: rule__Expr__Group_1__2__Impl : ( ( rule__Expr__RightAssignment_1_2 ) ) ;
    public final void rule__Expr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1821:1: ( ( ( rule__Expr__RightAssignment_1_2 ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1822:1: ( ( rule__Expr__RightAssignment_1_2 ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1822:1: ( ( rule__Expr__RightAssignment_1_2 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1823:1: ( rule__Expr__RightAssignment_1_2 )
            {
             before(grammarAccess.getExprAccess().getRightAssignment_1_2()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1824:1: ( rule__Expr__RightAssignment_1_2 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1824:2: rule__Expr__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Expr__RightAssignment_1_2_in_rule__Expr__Group_1__2__Impl3738);
            rule__Expr__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getExprAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group_1__2__Impl"


    // $ANTLR start "rule__Expr__Group_2__0"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1840:1: rule__Expr__Group_2__0 : rule__Expr__Group_2__0__Impl rule__Expr__Group_2__1 ;
    public final void rule__Expr__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1844:1: ( rule__Expr__Group_2__0__Impl rule__Expr__Group_2__1 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1845:2: rule__Expr__Group_2__0__Impl rule__Expr__Group_2__1
            {
            pushFollow(FOLLOW_rule__Expr__Group_2__0__Impl_in_rule__Expr__Group_2__03774);
            rule__Expr__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expr__Group_2__1_in_rule__Expr__Group_2__03777);
            rule__Expr__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group_2__0"


    // $ANTLR start "rule__Expr__Group_2__0__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1852:1: rule__Expr__Group_2__0__Impl : ( RULE_LPAREN ) ;
    public final void rule__Expr__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1856:1: ( ( RULE_LPAREN ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1857:1: ( RULE_LPAREN )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1857:1: ( RULE_LPAREN )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1858:1: RULE_LPAREN
            {
             before(grammarAccess.getExprAccess().getLPARENTerminalRuleCall_2_0()); 
            match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_rule__Expr__Group_2__0__Impl3804); 
             after(grammarAccess.getExprAccess().getLPARENTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group_2__0__Impl"


    // $ANTLR start "rule__Expr__Group_2__1"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1869:1: rule__Expr__Group_2__1 : rule__Expr__Group_2__1__Impl rule__Expr__Group_2__2 ;
    public final void rule__Expr__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1873:1: ( rule__Expr__Group_2__1__Impl rule__Expr__Group_2__2 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1874:2: rule__Expr__Group_2__1__Impl rule__Expr__Group_2__2
            {
            pushFollow(FOLLOW_rule__Expr__Group_2__1__Impl_in_rule__Expr__Group_2__13833);
            rule__Expr__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expr__Group_2__2_in_rule__Expr__Group_2__13836);
            rule__Expr__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group_2__1"


    // $ANTLR start "rule__Expr__Group_2__1__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1881:1: rule__Expr__Group_2__1__Impl : ( ( rule__Expr__ExprAssignment_2_1 ) ) ;
    public final void rule__Expr__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1885:1: ( ( ( rule__Expr__ExprAssignment_2_1 ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1886:1: ( ( rule__Expr__ExprAssignment_2_1 ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1886:1: ( ( rule__Expr__ExprAssignment_2_1 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1887:1: ( rule__Expr__ExprAssignment_2_1 )
            {
             before(grammarAccess.getExprAccess().getExprAssignment_2_1()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1888:1: ( rule__Expr__ExprAssignment_2_1 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1888:2: rule__Expr__ExprAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Expr__ExprAssignment_2_1_in_rule__Expr__Group_2__1__Impl3863);
            rule__Expr__ExprAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getExprAccess().getExprAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group_2__1__Impl"


    // $ANTLR start "rule__Expr__Group_2__2"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1898:1: rule__Expr__Group_2__2 : rule__Expr__Group_2__2__Impl ;
    public final void rule__Expr__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1902:1: ( rule__Expr__Group_2__2__Impl )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1903:2: rule__Expr__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Expr__Group_2__2__Impl_in_rule__Expr__Group_2__23893);
            rule__Expr__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group_2__2"


    // $ANTLR start "rule__Expr__Group_2__2__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1909:1: rule__Expr__Group_2__2__Impl : ( RULE_RPAREN ) ;
    public final void rule__Expr__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1913:1: ( ( RULE_RPAREN ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1914:1: ( RULE_RPAREN )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1914:1: ( RULE_RPAREN )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1915:1: RULE_RPAREN
            {
             before(grammarAccess.getExprAccess().getRPARENTerminalRuleCall_2_2()); 
            match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_rule__Expr__Group_2__2__Impl3920); 
             after(grammarAccess.getExprAccess().getRPARENTerminalRuleCall_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group_2__2__Impl"


    // $ANTLR start "rule__Interval__Group_1__0"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1932:1: rule__Interval__Group_1__0 : rule__Interval__Group_1__0__Impl rule__Interval__Group_1__1 ;
    public final void rule__Interval__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1936:1: ( rule__Interval__Group_1__0__Impl rule__Interval__Group_1__1 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1937:2: rule__Interval__Group_1__0__Impl rule__Interval__Group_1__1
            {
            pushFollow(FOLLOW_rule__Interval__Group_1__0__Impl_in_rule__Interval__Group_1__03955);
            rule__Interval__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interval__Group_1__1_in_rule__Interval__Group_1__03958);
            rule__Interval__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group_1__0"


    // $ANTLR start "rule__Interval__Group_1__0__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1944:1: rule__Interval__Group_1__0__Impl : ( ( rule__Interval__EventAssignment_1_0 ) ) ;
    public final void rule__Interval__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1948:1: ( ( ( rule__Interval__EventAssignment_1_0 ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1949:1: ( ( rule__Interval__EventAssignment_1_0 ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1949:1: ( ( rule__Interval__EventAssignment_1_0 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1950:1: ( rule__Interval__EventAssignment_1_0 )
            {
             before(grammarAccess.getIntervalAccess().getEventAssignment_1_0()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1951:1: ( rule__Interval__EventAssignment_1_0 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1951:2: rule__Interval__EventAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Interval__EventAssignment_1_0_in_rule__Interval__Group_1__0__Impl3985);
            rule__Interval__EventAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getIntervalAccess().getEventAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group_1__0__Impl"


    // $ANTLR start "rule__Interval__Group_1__1"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1961:1: rule__Interval__Group_1__1 : rule__Interval__Group_1__1__Impl rule__Interval__Group_1__2 ;
    public final void rule__Interval__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1965:1: ( rule__Interval__Group_1__1__Impl rule__Interval__Group_1__2 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1966:2: rule__Interval__Group_1__1__Impl rule__Interval__Group_1__2
            {
            pushFollow(FOLLOW_rule__Interval__Group_1__1__Impl_in_rule__Interval__Group_1__14015);
            rule__Interval__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interval__Group_1__2_in_rule__Interval__Group_1__14018);
            rule__Interval__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group_1__1"


    // $ANTLR start "rule__Interval__Group_1__1__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1973:1: rule__Interval__Group_1__1__Impl : ( RULE_LBRACKET ) ;
    public final void rule__Interval__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1977:1: ( ( RULE_LBRACKET ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1978:1: ( RULE_LBRACKET )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1978:1: ( RULE_LBRACKET )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1979:1: RULE_LBRACKET
            {
             before(grammarAccess.getIntervalAccess().getLBRACKETTerminalRuleCall_1_1()); 
            match(input,RULE_LBRACKET,FOLLOW_RULE_LBRACKET_in_rule__Interval__Group_1__1__Impl4045); 
             after(grammarAccess.getIntervalAccess().getLBRACKETTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group_1__1__Impl"


    // $ANTLR start "rule__Interval__Group_1__2"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1990:1: rule__Interval__Group_1__2 : rule__Interval__Group_1__2__Impl rule__Interval__Group_1__3 ;
    public final void rule__Interval__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1994:1: ( rule__Interval__Group_1__2__Impl rule__Interval__Group_1__3 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1995:2: rule__Interval__Group_1__2__Impl rule__Interval__Group_1__3
            {
            pushFollow(FOLLOW_rule__Interval__Group_1__2__Impl_in_rule__Interval__Group_1__24074);
            rule__Interval__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interval__Group_1__3_in_rule__Interval__Group_1__24077);
            rule__Interval__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group_1__2"


    // $ANTLR start "rule__Interval__Group_1__2__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2002:1: rule__Interval__Group_1__2__Impl : ( ( rule__Interval__LeftAssignment_1_2 ) ) ;
    public final void rule__Interval__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2006:1: ( ( ( rule__Interval__LeftAssignment_1_2 ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2007:1: ( ( rule__Interval__LeftAssignment_1_2 ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2007:1: ( ( rule__Interval__LeftAssignment_1_2 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2008:1: ( rule__Interval__LeftAssignment_1_2 )
            {
             before(grammarAccess.getIntervalAccess().getLeftAssignment_1_2()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2009:1: ( rule__Interval__LeftAssignment_1_2 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2009:2: rule__Interval__LeftAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Interval__LeftAssignment_1_2_in_rule__Interval__Group_1__2__Impl4104);
            rule__Interval__LeftAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getIntervalAccess().getLeftAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group_1__2__Impl"


    // $ANTLR start "rule__Interval__Group_1__3"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2019:1: rule__Interval__Group_1__3 : rule__Interval__Group_1__3__Impl rule__Interval__Group_1__4 ;
    public final void rule__Interval__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2023:1: ( rule__Interval__Group_1__3__Impl rule__Interval__Group_1__4 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2024:2: rule__Interval__Group_1__3__Impl rule__Interval__Group_1__4
            {
            pushFollow(FOLLOW_rule__Interval__Group_1__3__Impl_in_rule__Interval__Group_1__34134);
            rule__Interval__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interval__Group_1__4_in_rule__Interval__Group_1__34137);
            rule__Interval__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group_1__3"


    // $ANTLR start "rule__Interval__Group_1__3__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2031:1: rule__Interval__Group_1__3__Impl : ( RULE_COMMA ) ;
    public final void rule__Interval__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2035:1: ( ( RULE_COMMA ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2036:1: ( RULE_COMMA )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2036:1: ( RULE_COMMA )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2037:1: RULE_COMMA
            {
             before(grammarAccess.getIntervalAccess().getCOMMATerminalRuleCall_1_3()); 
            match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rule__Interval__Group_1__3__Impl4164); 
             after(grammarAccess.getIntervalAccess().getCOMMATerminalRuleCall_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group_1__3__Impl"


    // $ANTLR start "rule__Interval__Group_1__4"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2048:1: rule__Interval__Group_1__4 : rule__Interval__Group_1__4__Impl rule__Interval__Group_1__5 ;
    public final void rule__Interval__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2052:1: ( rule__Interval__Group_1__4__Impl rule__Interval__Group_1__5 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2053:2: rule__Interval__Group_1__4__Impl rule__Interval__Group_1__5
            {
            pushFollow(FOLLOW_rule__Interval__Group_1__4__Impl_in_rule__Interval__Group_1__44193);
            rule__Interval__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interval__Group_1__5_in_rule__Interval__Group_1__44196);
            rule__Interval__Group_1__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group_1__4"


    // $ANTLR start "rule__Interval__Group_1__4__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2060:1: rule__Interval__Group_1__4__Impl : ( ( rule__Interval__RightAssignment_1_4 ) ) ;
    public final void rule__Interval__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2064:1: ( ( ( rule__Interval__RightAssignment_1_4 ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2065:1: ( ( rule__Interval__RightAssignment_1_4 ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2065:1: ( ( rule__Interval__RightAssignment_1_4 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2066:1: ( rule__Interval__RightAssignment_1_4 )
            {
             before(grammarAccess.getIntervalAccess().getRightAssignment_1_4()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2067:1: ( rule__Interval__RightAssignment_1_4 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2067:2: rule__Interval__RightAssignment_1_4
            {
            pushFollow(FOLLOW_rule__Interval__RightAssignment_1_4_in_rule__Interval__Group_1__4__Impl4223);
            rule__Interval__RightAssignment_1_4();

            state._fsp--;


            }

             after(grammarAccess.getIntervalAccess().getRightAssignment_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group_1__4__Impl"


    // $ANTLR start "rule__Interval__Group_1__5"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2077:1: rule__Interval__Group_1__5 : rule__Interval__Group_1__5__Impl ;
    public final void rule__Interval__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2081:1: ( rule__Interval__Group_1__5__Impl )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2082:2: rule__Interval__Group_1__5__Impl
            {
            pushFollow(FOLLOW_rule__Interval__Group_1__5__Impl_in_rule__Interval__Group_1__54253);
            rule__Interval__Group_1__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group_1__5"


    // $ANTLR start "rule__Interval__Group_1__5__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2088:1: rule__Interval__Group_1__5__Impl : ( RULE_RBRACKET ) ;
    public final void rule__Interval__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2092:1: ( ( RULE_RBRACKET ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2093:1: ( RULE_RBRACKET )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2093:1: ( RULE_RBRACKET )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2094:1: RULE_RBRACKET
            {
             before(grammarAccess.getIntervalAccess().getRBRACKETTerminalRuleCall_1_5()); 
            match(input,RULE_RBRACKET,FOLLOW_RULE_RBRACKET_in_rule__Interval__Group_1__5__Impl4280); 
             after(grammarAccess.getIntervalAccess().getRBRACKETTerminalRuleCall_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group_1__5__Impl"


    // $ANTLR start "rule__Interval__Group_2__0"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2117:1: rule__Interval__Group_2__0 : rule__Interval__Group_2__0__Impl rule__Interval__Group_2__1 ;
    public final void rule__Interval__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2121:1: ( rule__Interval__Group_2__0__Impl rule__Interval__Group_2__1 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2122:2: rule__Interval__Group_2__0__Impl rule__Interval__Group_2__1
            {
            pushFollow(FOLLOW_rule__Interval__Group_2__0__Impl_in_rule__Interval__Group_2__04321);
            rule__Interval__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interval__Group_2__1_in_rule__Interval__Group_2__04324);
            rule__Interval__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group_2__0"


    // $ANTLR start "rule__Interval__Group_2__0__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2129:1: rule__Interval__Group_2__0__Impl : ( ( rule__Interval__EventAssignment_2_0 ) ) ;
    public final void rule__Interval__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2133:1: ( ( ( rule__Interval__EventAssignment_2_0 ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2134:1: ( ( rule__Interval__EventAssignment_2_0 ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2134:1: ( ( rule__Interval__EventAssignment_2_0 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2135:1: ( rule__Interval__EventAssignment_2_0 )
            {
             before(grammarAccess.getIntervalAccess().getEventAssignment_2_0()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2136:1: ( rule__Interval__EventAssignment_2_0 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2136:2: rule__Interval__EventAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Interval__EventAssignment_2_0_in_rule__Interval__Group_2__0__Impl4351);
            rule__Interval__EventAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getIntervalAccess().getEventAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group_2__0__Impl"


    // $ANTLR start "rule__Interval__Group_2__1"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2146:1: rule__Interval__Group_2__1 : rule__Interval__Group_2__1__Impl rule__Interval__Group_2__2 ;
    public final void rule__Interval__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2150:1: ( rule__Interval__Group_2__1__Impl rule__Interval__Group_2__2 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2151:2: rule__Interval__Group_2__1__Impl rule__Interval__Group_2__2
            {
            pushFollow(FOLLOW_rule__Interval__Group_2__1__Impl_in_rule__Interval__Group_2__14381);
            rule__Interval__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interval__Group_2__2_in_rule__Interval__Group_2__14384);
            rule__Interval__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group_2__1"


    // $ANTLR start "rule__Interval__Group_2__1__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2158:1: rule__Interval__Group_2__1__Impl : ( RULE_LBRACKET ) ;
    public final void rule__Interval__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2162:1: ( ( RULE_LBRACKET ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2163:1: ( RULE_LBRACKET )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2163:1: ( RULE_LBRACKET )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2164:1: RULE_LBRACKET
            {
             before(grammarAccess.getIntervalAccess().getLBRACKETTerminalRuleCall_2_1()); 
            match(input,RULE_LBRACKET,FOLLOW_RULE_LBRACKET_in_rule__Interval__Group_2__1__Impl4411); 
             after(grammarAccess.getIntervalAccess().getLBRACKETTerminalRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group_2__1__Impl"


    // $ANTLR start "rule__Interval__Group_2__2"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2175:1: rule__Interval__Group_2__2 : rule__Interval__Group_2__2__Impl rule__Interval__Group_2__3 ;
    public final void rule__Interval__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2179:1: ( rule__Interval__Group_2__2__Impl rule__Interval__Group_2__3 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2180:2: rule__Interval__Group_2__2__Impl rule__Interval__Group_2__3
            {
            pushFollow(FOLLOW_rule__Interval__Group_2__2__Impl_in_rule__Interval__Group_2__24440);
            rule__Interval__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interval__Group_2__3_in_rule__Interval__Group_2__24443);
            rule__Interval__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group_2__2"


    // $ANTLR start "rule__Interval__Group_2__2__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2187:1: rule__Interval__Group_2__2__Impl : ( RULE_COMMA ) ;
    public final void rule__Interval__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2191:1: ( ( RULE_COMMA ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2192:1: ( RULE_COMMA )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2192:1: ( RULE_COMMA )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2193:1: RULE_COMMA
            {
             before(grammarAccess.getIntervalAccess().getCOMMATerminalRuleCall_2_2()); 
            match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rule__Interval__Group_2__2__Impl4470); 
             after(grammarAccess.getIntervalAccess().getCOMMATerminalRuleCall_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group_2__2__Impl"


    // $ANTLR start "rule__Interval__Group_2__3"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2204:1: rule__Interval__Group_2__3 : rule__Interval__Group_2__3__Impl rule__Interval__Group_2__4 ;
    public final void rule__Interval__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2208:1: ( rule__Interval__Group_2__3__Impl rule__Interval__Group_2__4 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2209:2: rule__Interval__Group_2__3__Impl rule__Interval__Group_2__4
            {
            pushFollow(FOLLOW_rule__Interval__Group_2__3__Impl_in_rule__Interval__Group_2__34499);
            rule__Interval__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interval__Group_2__4_in_rule__Interval__Group_2__34502);
            rule__Interval__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group_2__3"


    // $ANTLR start "rule__Interval__Group_2__3__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2216:1: rule__Interval__Group_2__3__Impl : ( ( rule__Interval__RightAssignment_2_3 ) ) ;
    public final void rule__Interval__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2220:1: ( ( ( rule__Interval__RightAssignment_2_3 ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2221:1: ( ( rule__Interval__RightAssignment_2_3 ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2221:1: ( ( rule__Interval__RightAssignment_2_3 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2222:1: ( rule__Interval__RightAssignment_2_3 )
            {
             before(grammarAccess.getIntervalAccess().getRightAssignment_2_3()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2223:1: ( rule__Interval__RightAssignment_2_3 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2223:2: rule__Interval__RightAssignment_2_3
            {
            pushFollow(FOLLOW_rule__Interval__RightAssignment_2_3_in_rule__Interval__Group_2__3__Impl4529);
            rule__Interval__RightAssignment_2_3();

            state._fsp--;


            }

             after(grammarAccess.getIntervalAccess().getRightAssignment_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group_2__3__Impl"


    // $ANTLR start "rule__Interval__Group_2__4"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2233:1: rule__Interval__Group_2__4 : rule__Interval__Group_2__4__Impl ;
    public final void rule__Interval__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2237:1: ( rule__Interval__Group_2__4__Impl )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2238:2: rule__Interval__Group_2__4__Impl
            {
            pushFollow(FOLLOW_rule__Interval__Group_2__4__Impl_in_rule__Interval__Group_2__44559);
            rule__Interval__Group_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group_2__4"


    // $ANTLR start "rule__Interval__Group_2__4__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2244:1: rule__Interval__Group_2__4__Impl : ( RULE_RBRACKET ) ;
    public final void rule__Interval__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2248:1: ( ( RULE_RBRACKET ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2249:1: ( RULE_RBRACKET )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2249:1: ( RULE_RBRACKET )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2250:1: RULE_RBRACKET
            {
             before(grammarAccess.getIntervalAccess().getRBRACKETTerminalRuleCall_2_4()); 
            match(input,RULE_RBRACKET,FOLLOW_RULE_RBRACKET_in_rule__Interval__Group_2__4__Impl4586); 
             after(grammarAccess.getIntervalAccess().getRBRACKETTerminalRuleCall_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group_2__4__Impl"


    // $ANTLR start "rule__Interval__Group_3__0"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2271:1: rule__Interval__Group_3__0 : rule__Interval__Group_3__0__Impl rule__Interval__Group_3__1 ;
    public final void rule__Interval__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2275:1: ( rule__Interval__Group_3__0__Impl rule__Interval__Group_3__1 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2276:2: rule__Interval__Group_3__0__Impl rule__Interval__Group_3__1
            {
            pushFollow(FOLLOW_rule__Interval__Group_3__0__Impl_in_rule__Interval__Group_3__04625);
            rule__Interval__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interval__Group_3__1_in_rule__Interval__Group_3__04628);
            rule__Interval__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group_3__0"


    // $ANTLR start "rule__Interval__Group_3__0__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2283:1: rule__Interval__Group_3__0__Impl : ( ( rule__Interval__EventAssignment_3_0 ) ) ;
    public final void rule__Interval__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2287:1: ( ( ( rule__Interval__EventAssignment_3_0 ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2288:1: ( ( rule__Interval__EventAssignment_3_0 ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2288:1: ( ( rule__Interval__EventAssignment_3_0 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2289:1: ( rule__Interval__EventAssignment_3_0 )
            {
             before(grammarAccess.getIntervalAccess().getEventAssignment_3_0()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2290:1: ( rule__Interval__EventAssignment_3_0 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2290:2: rule__Interval__EventAssignment_3_0
            {
            pushFollow(FOLLOW_rule__Interval__EventAssignment_3_0_in_rule__Interval__Group_3__0__Impl4655);
            rule__Interval__EventAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getIntervalAccess().getEventAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group_3__0__Impl"


    // $ANTLR start "rule__Interval__Group_3__1"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2300:1: rule__Interval__Group_3__1 : rule__Interval__Group_3__1__Impl rule__Interval__Group_3__2 ;
    public final void rule__Interval__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2304:1: ( rule__Interval__Group_3__1__Impl rule__Interval__Group_3__2 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2305:2: rule__Interval__Group_3__1__Impl rule__Interval__Group_3__2
            {
            pushFollow(FOLLOW_rule__Interval__Group_3__1__Impl_in_rule__Interval__Group_3__14685);
            rule__Interval__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interval__Group_3__2_in_rule__Interval__Group_3__14688);
            rule__Interval__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group_3__1"


    // $ANTLR start "rule__Interval__Group_3__1__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2312:1: rule__Interval__Group_3__1__Impl : ( RULE_LBRACKET ) ;
    public final void rule__Interval__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2316:1: ( ( RULE_LBRACKET ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2317:1: ( RULE_LBRACKET )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2317:1: ( RULE_LBRACKET )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2318:1: RULE_LBRACKET
            {
             before(grammarAccess.getIntervalAccess().getLBRACKETTerminalRuleCall_3_1()); 
            match(input,RULE_LBRACKET,FOLLOW_RULE_LBRACKET_in_rule__Interval__Group_3__1__Impl4715); 
             after(grammarAccess.getIntervalAccess().getLBRACKETTerminalRuleCall_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group_3__1__Impl"


    // $ANTLR start "rule__Interval__Group_3__2"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2329:1: rule__Interval__Group_3__2 : rule__Interval__Group_3__2__Impl rule__Interval__Group_3__3 ;
    public final void rule__Interval__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2333:1: ( rule__Interval__Group_3__2__Impl rule__Interval__Group_3__3 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2334:2: rule__Interval__Group_3__2__Impl rule__Interval__Group_3__3
            {
            pushFollow(FOLLOW_rule__Interval__Group_3__2__Impl_in_rule__Interval__Group_3__24744);
            rule__Interval__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interval__Group_3__3_in_rule__Interval__Group_3__24747);
            rule__Interval__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group_3__2"


    // $ANTLR start "rule__Interval__Group_3__2__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2341:1: rule__Interval__Group_3__2__Impl : ( ( rule__Interval__LeftAssignment_3_2 ) ) ;
    public final void rule__Interval__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2345:1: ( ( ( rule__Interval__LeftAssignment_3_2 ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2346:1: ( ( rule__Interval__LeftAssignment_3_2 ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2346:1: ( ( rule__Interval__LeftAssignment_3_2 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2347:1: ( rule__Interval__LeftAssignment_3_2 )
            {
             before(grammarAccess.getIntervalAccess().getLeftAssignment_3_2()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2348:1: ( rule__Interval__LeftAssignment_3_2 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2348:2: rule__Interval__LeftAssignment_3_2
            {
            pushFollow(FOLLOW_rule__Interval__LeftAssignment_3_2_in_rule__Interval__Group_3__2__Impl4774);
            rule__Interval__LeftAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getIntervalAccess().getLeftAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group_3__2__Impl"


    // $ANTLR start "rule__Interval__Group_3__3"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2358:1: rule__Interval__Group_3__3 : rule__Interval__Group_3__3__Impl rule__Interval__Group_3__4 ;
    public final void rule__Interval__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2362:1: ( rule__Interval__Group_3__3__Impl rule__Interval__Group_3__4 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2363:2: rule__Interval__Group_3__3__Impl rule__Interval__Group_3__4
            {
            pushFollow(FOLLOW_rule__Interval__Group_3__3__Impl_in_rule__Interval__Group_3__34804);
            rule__Interval__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interval__Group_3__4_in_rule__Interval__Group_3__34807);
            rule__Interval__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group_3__3"


    // $ANTLR start "rule__Interval__Group_3__3__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2370:1: rule__Interval__Group_3__3__Impl : ( RULE_COMMA ) ;
    public final void rule__Interval__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2374:1: ( ( RULE_COMMA ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2375:1: ( RULE_COMMA )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2375:1: ( RULE_COMMA )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2376:1: RULE_COMMA
            {
             before(grammarAccess.getIntervalAccess().getCOMMATerminalRuleCall_3_3()); 
            match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rule__Interval__Group_3__3__Impl4834); 
             after(grammarAccess.getIntervalAccess().getCOMMATerminalRuleCall_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group_3__3__Impl"


    // $ANTLR start "rule__Interval__Group_3__4"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2387:1: rule__Interval__Group_3__4 : rule__Interval__Group_3__4__Impl ;
    public final void rule__Interval__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2391:1: ( rule__Interval__Group_3__4__Impl )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2392:2: rule__Interval__Group_3__4__Impl
            {
            pushFollow(FOLLOW_rule__Interval__Group_3__4__Impl_in_rule__Interval__Group_3__44863);
            rule__Interval__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group_3__4"


    // $ANTLR start "rule__Interval__Group_3__4__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2398:1: rule__Interval__Group_3__4__Impl : ( RULE_RBRACKET ) ;
    public final void rule__Interval__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2402:1: ( ( RULE_RBRACKET ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2403:1: ( RULE_RBRACKET )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2403:1: ( RULE_RBRACKET )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2404:1: RULE_RBRACKET
            {
             before(grammarAccess.getIntervalAccess().getRBRACKETTerminalRuleCall_3_4()); 
            match(input,RULE_RBRACKET,FOLLOW_RULE_RBRACKET_in_rule__Interval__Group_3__4__Impl4890); 
             after(grammarAccess.getIntervalAccess().getRBRACKETTerminalRuleCall_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group_3__4__Impl"


    // $ANTLR start "rule__Interval__Group_4__0"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2425:1: rule__Interval__Group_4__0 : rule__Interval__Group_4__0__Impl rule__Interval__Group_4__1 ;
    public final void rule__Interval__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2429:1: ( rule__Interval__Group_4__0__Impl rule__Interval__Group_4__1 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2430:2: rule__Interval__Group_4__0__Impl rule__Interval__Group_4__1
            {
            pushFollow(FOLLOW_rule__Interval__Group_4__0__Impl_in_rule__Interval__Group_4__04929);
            rule__Interval__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interval__Group_4__1_in_rule__Interval__Group_4__04932);
            rule__Interval__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group_4__0"


    // $ANTLR start "rule__Interval__Group_4__0__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2437:1: rule__Interval__Group_4__0__Impl : ( ( rule__Interval__EventAssignment_4_0 ) ) ;
    public final void rule__Interval__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2441:1: ( ( ( rule__Interval__EventAssignment_4_0 ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2442:1: ( ( rule__Interval__EventAssignment_4_0 ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2442:1: ( ( rule__Interval__EventAssignment_4_0 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2443:1: ( rule__Interval__EventAssignment_4_0 )
            {
             before(grammarAccess.getIntervalAccess().getEventAssignment_4_0()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2444:1: ( rule__Interval__EventAssignment_4_0 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2444:2: rule__Interval__EventAssignment_4_0
            {
            pushFollow(FOLLOW_rule__Interval__EventAssignment_4_0_in_rule__Interval__Group_4__0__Impl4959);
            rule__Interval__EventAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getIntervalAccess().getEventAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group_4__0__Impl"


    // $ANTLR start "rule__Interval__Group_4__1"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2454:1: rule__Interval__Group_4__1 : rule__Interval__Group_4__1__Impl rule__Interval__Group_4__2 ;
    public final void rule__Interval__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2458:1: ( rule__Interval__Group_4__1__Impl rule__Interval__Group_4__2 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2459:2: rule__Interval__Group_4__1__Impl rule__Interval__Group_4__2
            {
            pushFollow(FOLLOW_rule__Interval__Group_4__1__Impl_in_rule__Interval__Group_4__14989);
            rule__Interval__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interval__Group_4__2_in_rule__Interval__Group_4__14992);
            rule__Interval__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group_4__1"


    // $ANTLR start "rule__Interval__Group_4__1__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2466:1: rule__Interval__Group_4__1__Impl : ( RULE_LBRACKET ) ;
    public final void rule__Interval__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2470:1: ( ( RULE_LBRACKET ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2471:1: ( RULE_LBRACKET )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2471:1: ( RULE_LBRACKET )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2472:1: RULE_LBRACKET
            {
             before(grammarAccess.getIntervalAccess().getLBRACKETTerminalRuleCall_4_1()); 
            match(input,RULE_LBRACKET,FOLLOW_RULE_LBRACKET_in_rule__Interval__Group_4__1__Impl5019); 
             after(grammarAccess.getIntervalAccess().getLBRACKETTerminalRuleCall_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group_4__1__Impl"


    // $ANTLR start "rule__Interval__Group_4__2"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2483:1: rule__Interval__Group_4__2 : rule__Interval__Group_4__2__Impl rule__Interval__Group_4__3 ;
    public final void rule__Interval__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2487:1: ( rule__Interval__Group_4__2__Impl rule__Interval__Group_4__3 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2488:2: rule__Interval__Group_4__2__Impl rule__Interval__Group_4__3
            {
            pushFollow(FOLLOW_rule__Interval__Group_4__2__Impl_in_rule__Interval__Group_4__25048);
            rule__Interval__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interval__Group_4__3_in_rule__Interval__Group_4__25051);
            rule__Interval__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group_4__2"


    // $ANTLR start "rule__Interval__Group_4__2__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2495:1: rule__Interval__Group_4__2__Impl : ( RULE_COMMA ) ;
    public final void rule__Interval__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2499:1: ( ( RULE_COMMA ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2500:1: ( RULE_COMMA )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2500:1: ( RULE_COMMA )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2501:1: RULE_COMMA
            {
             before(grammarAccess.getIntervalAccess().getCOMMATerminalRuleCall_4_2()); 
            match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rule__Interval__Group_4__2__Impl5078); 
             after(grammarAccess.getIntervalAccess().getCOMMATerminalRuleCall_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group_4__2__Impl"


    // $ANTLR start "rule__Interval__Group_4__3"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2512:1: rule__Interval__Group_4__3 : rule__Interval__Group_4__3__Impl ;
    public final void rule__Interval__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2516:1: ( rule__Interval__Group_4__3__Impl )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2517:2: rule__Interval__Group_4__3__Impl
            {
            pushFollow(FOLLOW_rule__Interval__Group_4__3__Impl_in_rule__Interval__Group_4__35107);
            rule__Interval__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group_4__3"


    // $ANTLR start "rule__Interval__Group_4__3__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2523:1: rule__Interval__Group_4__3__Impl : ( RULE_RBRACKET ) ;
    public final void rule__Interval__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2527:1: ( ( RULE_RBRACKET ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2528:1: ( RULE_RBRACKET )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2528:1: ( RULE_RBRACKET )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2529:1: RULE_RBRACKET
            {
             before(grammarAccess.getIntervalAccess().getRBRACKETTerminalRuleCall_4_3()); 
            match(input,RULE_RBRACKET,FOLLOW_RULE_RBRACKET_in_rule__Interval__Group_4__3__Impl5134); 
             after(grammarAccess.getIntervalAccess().getRBRACKETTerminalRuleCall_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group_4__3__Impl"


    // $ANTLR start "rule__Event__Group_1__0"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2548:1: rule__Event__Group_1__0 : rule__Event__Group_1__0__Impl rule__Event__Group_1__1 ;
    public final void rule__Event__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2552:1: ( rule__Event__Group_1__0__Impl rule__Event__Group_1__1 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2553:2: rule__Event__Group_1__0__Impl rule__Event__Group_1__1
            {
            pushFollow(FOLLOW_rule__Event__Group_1__0__Impl_in_rule__Event__Group_1__05171);
            rule__Event__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group_1__1_in_rule__Event__Group_1__05174);
            rule__Event__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_1__0"


    // $ANTLR start "rule__Event__Group_1__0__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2560:1: rule__Event__Group_1__0__Impl : ( ( rule__Event__LifeStateAssignment_1_0 ) ) ;
    public final void rule__Event__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2564:1: ( ( ( rule__Event__LifeStateAssignment_1_0 ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2565:1: ( ( rule__Event__LifeStateAssignment_1_0 ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2565:1: ( ( rule__Event__LifeStateAssignment_1_0 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2566:1: ( rule__Event__LifeStateAssignment_1_0 )
            {
             before(grammarAccess.getEventAccess().getLifeStateAssignment_1_0()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2567:1: ( rule__Event__LifeStateAssignment_1_0 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2567:2: rule__Event__LifeStateAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Event__LifeStateAssignment_1_0_in_rule__Event__Group_1__0__Impl5201);
            rule__Event__LifeStateAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getLifeStateAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_1__0__Impl"


    // $ANTLR start "rule__Event__Group_1__1"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2577:1: rule__Event__Group_1__1 : rule__Event__Group_1__1__Impl ;
    public final void rule__Event__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2581:1: ( rule__Event__Group_1__1__Impl )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2582:2: rule__Event__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Event__Group_1__1__Impl_in_rule__Event__Group_1__15231);
            rule__Event__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_1__1"


    // $ANTLR start "rule__Event__Group_1__1__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2588:1: rule__Event__Group_1__1__Impl : ( ( rule__Event__LabelAssignment_1_1 ) ) ;
    public final void rule__Event__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2592:1: ( ( ( rule__Event__LabelAssignment_1_1 ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2593:1: ( ( rule__Event__LabelAssignment_1_1 ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2593:1: ( ( rule__Event__LabelAssignment_1_1 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2594:1: ( rule__Event__LabelAssignment_1_1 )
            {
             before(grammarAccess.getEventAccess().getLabelAssignment_1_1()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2595:1: ( rule__Event__LabelAssignment_1_1 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2595:2: rule__Event__LabelAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Event__LabelAssignment_1_1_in_rule__Event__Group_1__1__Impl5258);
            rule__Event__LabelAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getLabelAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_1__1__Impl"


    // $ANTLR start "rule__ArithExpr__Group__0"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2609:1: rule__ArithExpr__Group__0 : rule__ArithExpr__Group__0__Impl rule__ArithExpr__Group__1 ;
    public final void rule__ArithExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2613:1: ( rule__ArithExpr__Group__0__Impl rule__ArithExpr__Group__1 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2614:2: rule__ArithExpr__Group__0__Impl rule__ArithExpr__Group__1
            {
            pushFollow(FOLLOW_rule__ArithExpr__Group__0__Impl_in_rule__ArithExpr__Group__05292);
            rule__ArithExpr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArithExpr__Group__1_in_rule__ArithExpr__Group__05295);
            rule__ArithExpr__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArithExpr__Group__0"


    // $ANTLR start "rule__ArithExpr__Group__0__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2621:1: rule__ArithExpr__Group__0__Impl : ( ( rule__ArithExpr__LeftAttrAssignment_0 ) ) ;
    public final void rule__ArithExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2625:1: ( ( ( rule__ArithExpr__LeftAttrAssignment_0 ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2626:1: ( ( rule__ArithExpr__LeftAttrAssignment_0 ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2626:1: ( ( rule__ArithExpr__LeftAttrAssignment_0 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2627:1: ( rule__ArithExpr__LeftAttrAssignment_0 )
            {
             before(grammarAccess.getArithExprAccess().getLeftAttrAssignment_0()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2628:1: ( rule__ArithExpr__LeftAttrAssignment_0 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2628:2: rule__ArithExpr__LeftAttrAssignment_0
            {
            pushFollow(FOLLOW_rule__ArithExpr__LeftAttrAssignment_0_in_rule__ArithExpr__Group__0__Impl5322);
            rule__ArithExpr__LeftAttrAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getArithExprAccess().getLeftAttrAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArithExpr__Group__0__Impl"


    // $ANTLR start "rule__ArithExpr__Group__1"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2638:1: rule__ArithExpr__Group__1 : rule__ArithExpr__Group__1__Impl rule__ArithExpr__Group__2 ;
    public final void rule__ArithExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2642:1: ( rule__ArithExpr__Group__1__Impl rule__ArithExpr__Group__2 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2643:2: rule__ArithExpr__Group__1__Impl rule__ArithExpr__Group__2
            {
            pushFollow(FOLLOW_rule__ArithExpr__Group__1__Impl_in_rule__ArithExpr__Group__15352);
            rule__ArithExpr__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArithExpr__Group__2_in_rule__ArithExpr__Group__15355);
            rule__ArithExpr__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArithExpr__Group__1"


    // $ANTLR start "rule__ArithExpr__Group__1__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2650:1: rule__ArithExpr__Group__1__Impl : ( ( rule__ArithExpr__BinOpAssignment_1 ) ) ;
    public final void rule__ArithExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2654:1: ( ( ( rule__ArithExpr__BinOpAssignment_1 ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2655:1: ( ( rule__ArithExpr__BinOpAssignment_1 ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2655:1: ( ( rule__ArithExpr__BinOpAssignment_1 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2656:1: ( rule__ArithExpr__BinOpAssignment_1 )
            {
             before(grammarAccess.getArithExprAccess().getBinOpAssignment_1()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2657:1: ( rule__ArithExpr__BinOpAssignment_1 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2657:2: rule__ArithExpr__BinOpAssignment_1
            {
            pushFollow(FOLLOW_rule__ArithExpr__BinOpAssignment_1_in_rule__ArithExpr__Group__1__Impl5382);
            rule__ArithExpr__BinOpAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getArithExprAccess().getBinOpAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArithExpr__Group__1__Impl"


    // $ANTLR start "rule__ArithExpr__Group__2"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2667:1: rule__ArithExpr__Group__2 : rule__ArithExpr__Group__2__Impl ;
    public final void rule__ArithExpr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2671:1: ( rule__ArithExpr__Group__2__Impl )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2672:2: rule__ArithExpr__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ArithExpr__Group__2__Impl_in_rule__ArithExpr__Group__25412);
            rule__ArithExpr__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArithExpr__Group__2"


    // $ANTLR start "rule__ArithExpr__Group__2__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2678:1: rule__ArithExpr__Group__2__Impl : ( ( rule__ArithExpr__Alternatives_2 ) ) ;
    public final void rule__ArithExpr__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2682:1: ( ( ( rule__ArithExpr__Alternatives_2 ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2683:1: ( ( rule__ArithExpr__Alternatives_2 ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2683:1: ( ( rule__ArithExpr__Alternatives_2 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2684:1: ( rule__ArithExpr__Alternatives_2 )
            {
             before(grammarAccess.getArithExprAccess().getAlternatives_2()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2685:1: ( rule__ArithExpr__Alternatives_2 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2685:2: rule__ArithExpr__Alternatives_2
            {
            pushFollow(FOLLOW_rule__ArithExpr__Alternatives_2_in_rule__ArithExpr__Group__2__Impl5439);
            rule__ArithExpr__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getArithExprAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArithExpr__Group__2__Impl"


    // $ANTLR start "rule__TimeStamp__Group_1__0"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2701:1: rule__TimeStamp__Group_1__0 : rule__TimeStamp__Group_1__0__Impl rule__TimeStamp__Group_1__1 ;
    public final void rule__TimeStamp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2705:1: ( rule__TimeStamp__Group_1__0__Impl rule__TimeStamp__Group_1__1 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2706:2: rule__TimeStamp__Group_1__0__Impl rule__TimeStamp__Group_1__1
            {
            pushFollow(FOLLOW_rule__TimeStamp__Group_1__0__Impl_in_rule__TimeStamp__Group_1__05475);
            rule__TimeStamp__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeStamp__Group_1__1_in_rule__TimeStamp__Group_1__05478);
            rule__TimeStamp__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeStamp__Group_1__0"


    // $ANTLR start "rule__TimeStamp__Group_1__0__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2713:1: rule__TimeStamp__Group_1__0__Impl : ( ( rule__TimeStamp__EventReferenceAssignment_1_0 ) ) ;
    public final void rule__TimeStamp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2717:1: ( ( ( rule__TimeStamp__EventReferenceAssignment_1_0 ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2718:1: ( ( rule__TimeStamp__EventReferenceAssignment_1_0 ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2718:1: ( ( rule__TimeStamp__EventReferenceAssignment_1_0 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2719:1: ( rule__TimeStamp__EventReferenceAssignment_1_0 )
            {
             before(grammarAccess.getTimeStampAccess().getEventReferenceAssignment_1_0()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2720:1: ( rule__TimeStamp__EventReferenceAssignment_1_0 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2720:2: rule__TimeStamp__EventReferenceAssignment_1_0
            {
            pushFollow(FOLLOW_rule__TimeStamp__EventReferenceAssignment_1_0_in_rule__TimeStamp__Group_1__0__Impl5505);
            rule__TimeStamp__EventReferenceAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTimeStampAccess().getEventReferenceAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeStamp__Group_1__0__Impl"


    // $ANTLR start "rule__TimeStamp__Group_1__1"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2730:1: rule__TimeStamp__Group_1__1 : rule__TimeStamp__Group_1__1__Impl ;
    public final void rule__TimeStamp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2734:1: ( rule__TimeStamp__Group_1__1__Impl )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2735:2: rule__TimeStamp__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TimeStamp__Group_1__1__Impl_in_rule__TimeStamp__Group_1__15535);
            rule__TimeStamp__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeStamp__Group_1__1"


    // $ANTLR start "rule__TimeStamp__Group_1__1__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2741:1: rule__TimeStamp__Group_1__1__Impl : ( ( rule__TimeStamp__Group_1_1__0 )? ) ;
    public final void rule__TimeStamp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2745:1: ( ( ( rule__TimeStamp__Group_1_1__0 )? ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2746:1: ( ( rule__TimeStamp__Group_1_1__0 )? )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2746:1: ( ( rule__TimeStamp__Group_1_1__0 )? )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2747:1: ( rule__TimeStamp__Group_1_1__0 )?
            {
             before(grammarAccess.getTimeStampAccess().getGroup_1_1()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2748:1: ( rule__TimeStamp__Group_1_1__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_PLUS) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2748:2: rule__TimeStamp__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__TimeStamp__Group_1_1__0_in_rule__TimeStamp__Group_1__1__Impl5562);
                    rule__TimeStamp__Group_1_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTimeStampAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeStamp__Group_1__1__Impl"


    // $ANTLR start "rule__TimeStamp__Group_1_1__0"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2762:1: rule__TimeStamp__Group_1_1__0 : rule__TimeStamp__Group_1_1__0__Impl rule__TimeStamp__Group_1_1__1 ;
    public final void rule__TimeStamp__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2766:1: ( rule__TimeStamp__Group_1_1__0__Impl rule__TimeStamp__Group_1_1__1 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2767:2: rule__TimeStamp__Group_1_1__0__Impl rule__TimeStamp__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__TimeStamp__Group_1_1__0__Impl_in_rule__TimeStamp__Group_1_1__05597);
            rule__TimeStamp__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeStamp__Group_1_1__1_in_rule__TimeStamp__Group_1_1__05600);
            rule__TimeStamp__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeStamp__Group_1_1__0"


    // $ANTLR start "rule__TimeStamp__Group_1_1__0__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2774:1: rule__TimeStamp__Group_1_1__0__Impl : ( RULE_PLUS ) ;
    public final void rule__TimeStamp__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2778:1: ( ( RULE_PLUS ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2779:1: ( RULE_PLUS )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2779:1: ( RULE_PLUS )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2780:1: RULE_PLUS
            {
             before(grammarAccess.getTimeStampAccess().getPLUSTerminalRuleCall_1_1_0()); 
            match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_rule__TimeStamp__Group_1_1__0__Impl5627); 
             after(grammarAccess.getTimeStampAccess().getPLUSTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeStamp__Group_1_1__0__Impl"


    // $ANTLR start "rule__TimeStamp__Group_1_1__1"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2791:1: rule__TimeStamp__Group_1_1__1 : rule__TimeStamp__Group_1_1__1__Impl ;
    public final void rule__TimeStamp__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2795:1: ( rule__TimeStamp__Group_1_1__1__Impl )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2796:2: rule__TimeStamp__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TimeStamp__Group_1_1__1__Impl_in_rule__TimeStamp__Group_1_1__15656);
            rule__TimeStamp__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeStamp__Group_1_1__1"


    // $ANTLR start "rule__TimeStamp__Group_1_1__1__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2802:1: rule__TimeStamp__Group_1_1__1__Impl : ( ( rule__TimeStamp__ShiftAssignment_1_1_1 ) ) ;
    public final void rule__TimeStamp__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2806:1: ( ( ( rule__TimeStamp__ShiftAssignment_1_1_1 ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2807:1: ( ( rule__TimeStamp__ShiftAssignment_1_1_1 ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2807:1: ( ( rule__TimeStamp__ShiftAssignment_1_1_1 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2808:1: ( rule__TimeStamp__ShiftAssignment_1_1_1 )
            {
             before(grammarAccess.getTimeStampAccess().getShiftAssignment_1_1_1()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2809:1: ( rule__TimeStamp__ShiftAssignment_1_1_1 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2809:2: rule__TimeStamp__ShiftAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__TimeStamp__ShiftAssignment_1_1_1_in_rule__TimeStamp__Group_1_1__1__Impl5683);
            rule__TimeStamp__ShiftAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTimeStampAccess().getShiftAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeStamp__Group_1_1__1__Impl"


    // $ANTLR start "rule__Cupido__CommitmentsAssignment_1"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2824:1: rule__Cupido__CommitmentsAssignment_1 : ( ruleCommitment ) ;
    public final void rule__Cupido__CommitmentsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2828:1: ( ( ruleCommitment ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2829:1: ( ruleCommitment )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2829:1: ( ruleCommitment )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2830:1: ruleCommitment
            {
             before(grammarAccess.getCupidoAccess().getCommitmentsCommitmentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleCommitment_in_rule__Cupido__CommitmentsAssignment_15722);
            ruleCommitment();

            state._fsp--;

             after(grammarAccess.getCupidoAccess().getCommitmentsCommitmentParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cupido__CommitmentsAssignment_1"


    // $ANTLR start "rule__Schemata__SchemataAssignment_1"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2839:1: rule__Schemata__SchemataAssignment_1 : ( ruleEventRelation ) ;
    public final void rule__Schemata__SchemataAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2843:1: ( ( ruleEventRelation ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2844:1: ( ruleEventRelation )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2844:1: ( ruleEventRelation )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2845:1: ruleEventRelation
            {
             before(grammarAccess.getSchemataAccess().getSchemataEventRelationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEventRelation_in_rule__Schemata__SchemataAssignment_15753);
            ruleEventRelation();

            state._fsp--;

             after(grammarAccess.getSchemataAccess().getSchemataEventRelationParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schemata__SchemataAssignment_1"


    // $ANTLR start "rule__EventRelation__EventAssignment_0"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2854:1: rule__EventRelation__EventAssignment_0 : ( ruleEvent ) ;
    public final void rule__EventRelation__EventAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2858:1: ( ( ruleEvent ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2859:1: ( ruleEvent )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2859:1: ( ruleEvent )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2860:1: ruleEvent
            {
             before(grammarAccess.getEventRelationAccess().getEventEventParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleEvent_in_rule__EventRelation__EventAssignment_05784);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getEventRelationAccess().getEventEventParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__EventAssignment_0"


    // $ANTLR start "rule__EventRelation__ParamsAssignment_2"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2869:1: rule__EventRelation__ParamsAssignment_2 : ( ruleParam ) ;
    public final void rule__EventRelation__ParamsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2873:1: ( ( ruleParam ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2874:1: ( ruleParam )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2874:1: ( ruleParam )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2875:1: ruleParam
            {
             before(grammarAccess.getEventRelationAccess().getParamsParamParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleParam_in_rule__EventRelation__ParamsAssignment_25815);
            ruleParam();

            state._fsp--;

             after(grammarAccess.getEventRelationAccess().getParamsParamParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__ParamsAssignment_2"


    // $ANTLR start "rule__EventRelation__ParamsAssignment_3_1"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2884:1: rule__EventRelation__ParamsAssignment_3_1 : ( ruleParam ) ;
    public final void rule__EventRelation__ParamsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2888:1: ( ( ruleParam ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2889:1: ( ruleParam )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2889:1: ( ruleParam )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2890:1: ruleParam
            {
             before(grammarAccess.getEventRelationAccess().getParamsParamParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleParam_in_rule__EventRelation__ParamsAssignment_3_15846);
            ruleParam();

            state._fsp--;

             after(grammarAccess.getEventRelationAccess().getParamsParamParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__ParamsAssignment_3_1"


    // $ANTLR start "rule__EventRelation__KeyParamsAssignment_6"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2899:1: rule__EventRelation__KeyParamsAssignment_6 : ( ruleParam ) ;
    public final void rule__EventRelation__KeyParamsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2903:1: ( ( ruleParam ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2904:1: ( ruleParam )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2904:1: ( ruleParam )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2905:1: ruleParam
            {
             before(grammarAccess.getEventRelationAccess().getKeyParamsParamParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleParam_in_rule__EventRelation__KeyParamsAssignment_65877);
            ruleParam();

            state._fsp--;

             after(grammarAccess.getEventRelationAccess().getKeyParamsParamParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__KeyParamsAssignment_6"


    // $ANTLR start "rule__EventRelation__KeyParamsAssignment_7_1"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2914:1: rule__EventRelation__KeyParamsAssignment_7_1 : ( ruleParam ) ;
    public final void rule__EventRelation__KeyParamsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2918:1: ( ( ruleParam ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2919:1: ( ruleParam )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2919:1: ( ruleParam )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2920:1: ruleParam
            {
             before(grammarAccess.getEventRelationAccess().getKeyParamsParamParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_ruleParam_in_rule__EventRelation__KeyParamsAssignment_7_15908);
            ruleParam();

            state._fsp--;

             after(grammarAccess.getEventRelationAccess().getKeyParamsParamParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__KeyParamsAssignment_7_1"


    // $ANTLR start "rule__EventRelation__TimeParamAssignment_9"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2929:1: rule__EventRelation__TimeParamAssignment_9 : ( ruleParam ) ;
    public final void rule__EventRelation__TimeParamAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2933:1: ( ( ruleParam ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2934:1: ( ruleParam )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2934:1: ( ruleParam )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2935:1: ruleParam
            {
             before(grammarAccess.getEventRelationAccess().getTimeParamParamParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleParam_in_rule__EventRelation__TimeParamAssignment_95939);
            ruleParam();

            state._fsp--;

             after(grammarAccess.getEventRelationAccess().getTimeParamParamParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__TimeParamAssignment_9"


    // $ANTLR start "rule__Param__NameAssignment"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2944:1: rule__Param__NameAssignment : ( RULE_ID ) ;
    public final void rule__Param__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2948:1: ( ( RULE_ID ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2949:1: ( RULE_ID )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2949:1: ( RULE_ID )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2950:1: RULE_ID
            {
             before(grammarAccess.getParamAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Param__NameAssignment5970); 
             after(grammarAccess.getParamAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Param__NameAssignment"


    // $ANTLR start "rule__Commitment__LabelAssignment_1"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2959:1: rule__Commitment__LabelAssignment_1 : ( RULE_ID ) ;
    public final void rule__Commitment__LabelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2963:1: ( ( RULE_ID ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2964:1: ( RULE_ID )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2964:1: ( RULE_ID )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2965:1: RULE_ID
            {
             before(grammarAccess.getCommitmentAccess().getLabelIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Commitment__LabelAssignment_16001); 
             after(grammarAccess.getCommitmentAccess().getLabelIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commitment__LabelAssignment_1"


    // $ANTLR start "rule__Commitment__DebtorAssignment_2"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2974:1: rule__Commitment__DebtorAssignment_2 : ( RULE_ID ) ;
    public final void rule__Commitment__DebtorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2978:1: ( ( RULE_ID ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2979:1: ( RULE_ID )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2979:1: ( RULE_ID )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2980:1: RULE_ID
            {
             before(grammarAccess.getCommitmentAccess().getDebtorIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Commitment__DebtorAssignment_26032); 
             after(grammarAccess.getCommitmentAccess().getDebtorIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commitment__DebtorAssignment_2"


    // $ANTLR start "rule__Commitment__CreditorAssignment_4"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2989:1: rule__Commitment__CreditorAssignment_4 : ( RULE_ID ) ;
    public final void rule__Commitment__CreditorAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2993:1: ( ( RULE_ID ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2994:1: ( RULE_ID )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2994:1: ( RULE_ID )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2995:1: RULE_ID
            {
             before(grammarAccess.getCommitmentAccess().getCreditorIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Commitment__CreditorAssignment_46063); 
             after(grammarAccess.getCommitmentAccess().getCreditorIDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commitment__CreditorAssignment_4"


    // $ANTLR start "rule__Commitment__TriggerAssignment_6"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3004:1: rule__Commitment__TriggerAssignment_6 : ( ruleGeneralExpr ) ;
    public final void rule__Commitment__TriggerAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3008:1: ( ( ruleGeneralExpr ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3009:1: ( ruleGeneralExpr )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3009:1: ( ruleGeneralExpr )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3010:1: ruleGeneralExpr
            {
             before(grammarAccess.getCommitmentAccess().getTriggerGeneralExprParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleGeneralExpr_in_rule__Commitment__TriggerAssignment_66094);
            ruleGeneralExpr();

            state._fsp--;

             after(grammarAccess.getCommitmentAccess().getTriggerGeneralExprParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commitment__TriggerAssignment_6"


    // $ANTLR start "rule__Commitment__AntecedentAssignment_7_1"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3019:1: rule__Commitment__AntecedentAssignment_7_1 : ( ruleGeneralExpr ) ;
    public final void rule__Commitment__AntecedentAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3023:1: ( ( ruleGeneralExpr ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3024:1: ( ruleGeneralExpr )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3024:1: ( ruleGeneralExpr )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3025:1: ruleGeneralExpr
            {
             before(grammarAccess.getCommitmentAccess().getAntecedentGeneralExprParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_ruleGeneralExpr_in_rule__Commitment__AntecedentAssignment_7_16125);
            ruleGeneralExpr();

            state._fsp--;

             after(grammarAccess.getCommitmentAccess().getAntecedentGeneralExprParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commitment__AntecedentAssignment_7_1"


    // $ANTLR start "rule__Commitment__ConsequentAssignment_9"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3034:1: rule__Commitment__ConsequentAssignment_9 : ( ruleGeneralExpr ) ;
    public final void rule__Commitment__ConsequentAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3038:1: ( ( ruleGeneralExpr ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3039:1: ( ruleGeneralExpr )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3039:1: ( ruleGeneralExpr )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3040:1: ruleGeneralExpr
            {
             before(grammarAccess.getCommitmentAccess().getConsequentGeneralExprParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleGeneralExpr_in_rule__Commitment__ConsequentAssignment_96156);
            ruleGeneralExpr();

            state._fsp--;

             after(grammarAccess.getCommitmentAccess().getConsequentGeneralExprParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commitment__ConsequentAssignment_9"


    // $ANTLR start "rule__GeneralExpr__ExprAssignment_0"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3049:1: rule__GeneralExpr__ExprAssignment_0 : ( ruleExpr ) ;
    public final void rule__GeneralExpr__ExprAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3053:1: ( ( ruleExpr ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3054:1: ( ruleExpr )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3054:1: ( ruleExpr )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3055:1: ruleExpr
            {
             before(grammarAccess.getGeneralExprAccess().getExprExprParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleExpr_in_rule__GeneralExpr__ExprAssignment_06187);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getGeneralExprAccess().getExprExprParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralExpr__ExprAssignment_0"


    // $ANTLR start "rule__GeneralExpr__WhereAssignment_1_0"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3064:1: rule__GeneralExpr__WhereAssignment_1_0 : ( RULE_WHERE ) ;
    public final void rule__GeneralExpr__WhereAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3068:1: ( ( RULE_WHERE ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3069:1: ( RULE_WHERE )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3069:1: ( RULE_WHERE )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3070:1: RULE_WHERE
            {
             before(grammarAccess.getGeneralExprAccess().getWhereWHERETerminalRuleCall_1_0_0()); 
            match(input,RULE_WHERE,FOLLOW_RULE_WHERE_in_rule__GeneralExpr__WhereAssignment_1_06218); 
             after(grammarAccess.getGeneralExprAccess().getWhereWHERETerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralExpr__WhereAssignment_1_0"


    // $ANTLR start "rule__GeneralExpr__ArithAssignment_1_1"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3079:1: rule__GeneralExpr__ArithAssignment_1_1 : ( ruleArithExpr ) ;
    public final void rule__GeneralExpr__ArithAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3083:1: ( ( ruleArithExpr ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3084:1: ( ruleArithExpr )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3084:1: ( ruleArithExpr )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3085:1: ruleArithExpr
            {
             before(grammarAccess.getGeneralExprAccess().getArithArithExprParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleArithExpr_in_rule__GeneralExpr__ArithAssignment_1_16249);
            ruleArithExpr();

            state._fsp--;

             after(grammarAccess.getGeneralExprAccess().getArithArithExprParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralExpr__ArithAssignment_1_1"


    // $ANTLR start "rule__Expr__IntervalAssignment_0"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3094:1: rule__Expr__IntervalAssignment_0 : ( ruleInterval ) ;
    public final void rule__Expr__IntervalAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3098:1: ( ( ruleInterval ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3099:1: ( ruleInterval )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3099:1: ( ruleInterval )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3100:1: ruleInterval
            {
             before(grammarAccess.getExprAccess().getIntervalIntervalParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleInterval_in_rule__Expr__IntervalAssignment_06280);
            ruleInterval();

            state._fsp--;

             after(grammarAccess.getExprAccess().getIntervalIntervalParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__IntervalAssignment_0"


    // $ANTLR start "rule__Expr__LeftAssignment_1_0"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3109:1: rule__Expr__LeftAssignment_1_0 : ( ruleInterval ) ;
    public final void rule__Expr__LeftAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3113:1: ( ( ruleInterval ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3114:1: ( ruleInterval )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3114:1: ( ruleInterval )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3115:1: ruleInterval
            {
             before(grammarAccess.getExprAccess().getLeftIntervalParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleInterval_in_rule__Expr__LeftAssignment_1_06311);
            ruleInterval();

            state._fsp--;

             after(grammarAccess.getExprAccess().getLeftIntervalParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__LeftAssignment_1_0"


    // $ANTLR start "rule__Expr__OpAssignment_1_1"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3124:1: rule__Expr__OpAssignment_1_1 : ( ruleEventOperator ) ;
    public final void rule__Expr__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3128:1: ( ( ruleEventOperator ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3129:1: ( ruleEventOperator )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3129:1: ( ruleEventOperator )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3130:1: ruleEventOperator
            {
             before(grammarAccess.getExprAccess().getOpEventOperatorParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleEventOperator_in_rule__Expr__OpAssignment_1_16342);
            ruleEventOperator();

            state._fsp--;

             after(grammarAccess.getExprAccess().getOpEventOperatorParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__OpAssignment_1_1"


    // $ANTLR start "rule__Expr__RightAssignment_1_2"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3139:1: rule__Expr__RightAssignment_1_2 : ( ruleExpr ) ;
    public final void rule__Expr__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3143:1: ( ( ruleExpr ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3144:1: ( ruleExpr )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3144:1: ( ruleExpr )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3145:1: ruleExpr
            {
             before(grammarAccess.getExprAccess().getRightExprParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleExpr_in_rule__Expr__RightAssignment_1_26373);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getExprAccess().getRightExprParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__RightAssignment_1_2"


    // $ANTLR start "rule__Expr__ExprAssignment_2_1"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3154:1: rule__Expr__ExprAssignment_2_1 : ( ruleExpr ) ;
    public final void rule__Expr__ExprAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3158:1: ( ( ruleExpr ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3159:1: ( ruleExpr )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3159:1: ( ruleExpr )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3160:1: ruleExpr
            {
             before(grammarAccess.getExprAccess().getExprExprParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleExpr_in_rule__Expr__ExprAssignment_2_16404);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getExprAccess().getExprExprParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__ExprAssignment_2_1"


    // $ANTLR start "rule__Interval__EventAssignment_0"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3169:1: rule__Interval__EventAssignment_0 : ( ruleEvent ) ;
    public final void rule__Interval__EventAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3173:1: ( ( ruleEvent ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3174:1: ( ruleEvent )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3174:1: ( ruleEvent )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3175:1: ruleEvent
            {
             before(grammarAccess.getIntervalAccess().getEventEventParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleEvent_in_rule__Interval__EventAssignment_06435);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getIntervalAccess().getEventEventParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__EventAssignment_0"


    // $ANTLR start "rule__Interval__EventAssignment_1_0"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3184:1: rule__Interval__EventAssignment_1_0 : ( ruleEvent ) ;
    public final void rule__Interval__EventAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3188:1: ( ( ruleEvent ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3189:1: ( ruleEvent )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3189:1: ( ruleEvent )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3190:1: ruleEvent
            {
             before(grammarAccess.getIntervalAccess().getEventEventParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleEvent_in_rule__Interval__EventAssignment_1_06466);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getIntervalAccess().getEventEventParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__EventAssignment_1_0"


    // $ANTLR start "rule__Interval__LeftAssignment_1_2"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3199:1: rule__Interval__LeftAssignment_1_2 : ( ruleTimeStamp ) ;
    public final void rule__Interval__LeftAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3203:1: ( ( ruleTimeStamp ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3204:1: ( ruleTimeStamp )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3204:1: ( ruleTimeStamp )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3205:1: ruleTimeStamp
            {
             before(grammarAccess.getIntervalAccess().getLeftTimeStampParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleTimeStamp_in_rule__Interval__LeftAssignment_1_26497);
            ruleTimeStamp();

            state._fsp--;

             after(grammarAccess.getIntervalAccess().getLeftTimeStampParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__LeftAssignment_1_2"


    // $ANTLR start "rule__Interval__RightAssignment_1_4"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3214:1: rule__Interval__RightAssignment_1_4 : ( ruleTimeStamp ) ;
    public final void rule__Interval__RightAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3218:1: ( ( ruleTimeStamp ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3219:1: ( ruleTimeStamp )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3219:1: ( ruleTimeStamp )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3220:1: ruleTimeStamp
            {
             before(grammarAccess.getIntervalAccess().getRightTimeStampParserRuleCall_1_4_0()); 
            pushFollow(FOLLOW_ruleTimeStamp_in_rule__Interval__RightAssignment_1_46528);
            ruleTimeStamp();

            state._fsp--;

             after(grammarAccess.getIntervalAccess().getRightTimeStampParserRuleCall_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__RightAssignment_1_4"


    // $ANTLR start "rule__Interval__EventAssignment_2_0"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3229:1: rule__Interval__EventAssignment_2_0 : ( ruleEvent ) ;
    public final void rule__Interval__EventAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3233:1: ( ( ruleEvent ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3234:1: ( ruleEvent )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3234:1: ( ruleEvent )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3235:1: ruleEvent
            {
             before(grammarAccess.getIntervalAccess().getEventEventParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleEvent_in_rule__Interval__EventAssignment_2_06559);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getIntervalAccess().getEventEventParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__EventAssignment_2_0"


    // $ANTLR start "rule__Interval__RightAssignment_2_3"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3244:1: rule__Interval__RightAssignment_2_3 : ( ruleTimeStamp ) ;
    public final void rule__Interval__RightAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3248:1: ( ( ruleTimeStamp ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3249:1: ( ruleTimeStamp )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3249:1: ( ruleTimeStamp )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3250:1: ruleTimeStamp
            {
             before(grammarAccess.getIntervalAccess().getRightTimeStampParserRuleCall_2_3_0()); 
            pushFollow(FOLLOW_ruleTimeStamp_in_rule__Interval__RightAssignment_2_36590);
            ruleTimeStamp();

            state._fsp--;

             after(grammarAccess.getIntervalAccess().getRightTimeStampParserRuleCall_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__RightAssignment_2_3"


    // $ANTLR start "rule__Interval__EventAssignment_3_0"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3259:1: rule__Interval__EventAssignment_3_0 : ( ruleEvent ) ;
    public final void rule__Interval__EventAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3263:1: ( ( ruleEvent ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3264:1: ( ruleEvent )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3264:1: ( ruleEvent )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3265:1: ruleEvent
            {
             before(grammarAccess.getIntervalAccess().getEventEventParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_ruleEvent_in_rule__Interval__EventAssignment_3_06621);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getIntervalAccess().getEventEventParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__EventAssignment_3_0"


    // $ANTLR start "rule__Interval__LeftAssignment_3_2"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3274:1: rule__Interval__LeftAssignment_3_2 : ( ruleTimeStamp ) ;
    public final void rule__Interval__LeftAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3278:1: ( ( ruleTimeStamp ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3279:1: ( ruleTimeStamp )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3279:1: ( ruleTimeStamp )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3280:1: ruleTimeStamp
            {
             before(grammarAccess.getIntervalAccess().getLeftTimeStampParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_ruleTimeStamp_in_rule__Interval__LeftAssignment_3_26652);
            ruleTimeStamp();

            state._fsp--;

             after(grammarAccess.getIntervalAccess().getLeftTimeStampParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__LeftAssignment_3_2"


    // $ANTLR start "rule__Interval__EventAssignment_4_0"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3289:1: rule__Interval__EventAssignment_4_0 : ( ruleEvent ) ;
    public final void rule__Interval__EventAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3293:1: ( ( ruleEvent ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3294:1: ( ruleEvent )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3294:1: ( ruleEvent )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3295:1: ruleEvent
            {
             before(grammarAccess.getIntervalAccess().getEventEventParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleEvent_in_rule__Interval__EventAssignment_4_06683);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getIntervalAccess().getEventEventParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__EventAssignment_4_0"


    // $ANTLR start "rule__Event__NameAssignment_0"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3304:1: rule__Event__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Event__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3308:1: ( ( RULE_ID ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3309:1: ( RULE_ID )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3309:1: ( RULE_ID )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3310:1: RULE_ID
            {
             before(grammarAccess.getEventAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Event__NameAssignment_06714); 
             after(grammarAccess.getEventAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__NameAssignment_0"


    // $ANTLR start "rule__Event__LifeStateAssignment_1_0"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3319:1: rule__Event__LifeStateAssignment_1_0 : ( ( rule__Event__LifeStateAlternatives_1_0_0 ) ) ;
    public final void rule__Event__LifeStateAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3323:1: ( ( ( rule__Event__LifeStateAlternatives_1_0_0 ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3324:1: ( ( rule__Event__LifeStateAlternatives_1_0_0 ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3324:1: ( ( rule__Event__LifeStateAlternatives_1_0_0 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3325:1: ( rule__Event__LifeStateAlternatives_1_0_0 )
            {
             before(grammarAccess.getEventAccess().getLifeStateAlternatives_1_0_0()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3326:1: ( rule__Event__LifeStateAlternatives_1_0_0 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3326:2: rule__Event__LifeStateAlternatives_1_0_0
            {
            pushFollow(FOLLOW_rule__Event__LifeStateAlternatives_1_0_0_in_rule__Event__LifeStateAssignment_1_06745);
            rule__Event__LifeStateAlternatives_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getLifeStateAlternatives_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__LifeStateAssignment_1_0"


    // $ANTLR start "rule__Event__LabelAssignment_1_1"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3335:1: rule__Event__LabelAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Event__LabelAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3339:1: ( ( RULE_ID ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3340:1: ( RULE_ID )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3340:1: ( RULE_ID )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3341:1: RULE_ID
            {
             before(grammarAccess.getEventAccess().getLabelIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Event__LabelAssignment_1_16778); 
             after(grammarAccess.getEventAccess().getLabelIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__LabelAssignment_1_1"


    // $ANTLR start "rule__ArithExpr__LeftAttrAssignment_0"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3350:1: rule__ArithExpr__LeftAttrAssignment_0 : ( ruleAttribute ) ;
    public final void rule__ArithExpr__LeftAttrAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3354:1: ( ( ruleAttribute ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3355:1: ( ruleAttribute )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3355:1: ( ruleAttribute )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3356:1: ruleAttribute
            {
             before(grammarAccess.getArithExprAccess().getLeftAttrAttributeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__ArithExpr__LeftAttrAssignment_06809);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getArithExprAccess().getLeftAttrAttributeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArithExpr__LeftAttrAssignment_0"


    // $ANTLR start "rule__ArithExpr__BinOpAssignment_1"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3365:1: rule__ArithExpr__BinOpAssignment_1 : ( ruleBinaryOperator ) ;
    public final void rule__ArithExpr__BinOpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3369:1: ( ( ruleBinaryOperator ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3370:1: ( ruleBinaryOperator )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3370:1: ( ruleBinaryOperator )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3371:1: ruleBinaryOperator
            {
             before(grammarAccess.getArithExprAccess().getBinOpBinaryOperatorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBinaryOperator_in_rule__ArithExpr__BinOpAssignment_16840);
            ruleBinaryOperator();

            state._fsp--;

             after(grammarAccess.getArithExprAccess().getBinOpBinaryOperatorParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArithExpr__BinOpAssignment_1"


    // $ANTLR start "rule__ArithExpr__RightAttrAssignment_2_0"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3380:1: rule__ArithExpr__RightAttrAssignment_2_0 : ( ruleAttribute ) ;
    public final void rule__ArithExpr__RightAttrAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3384:1: ( ( ruleAttribute ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3385:1: ( ruleAttribute )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3385:1: ( ruleAttribute )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3386:1: ruleAttribute
            {
             before(grammarAccess.getArithExprAccess().getRightAttrAttributeParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__ArithExpr__RightAttrAssignment_2_06871);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getArithExprAccess().getRightAttrAttributeParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArithExpr__RightAttrAssignment_2_0"


    // $ANTLR start "rule__ArithExpr__NumAssignment_2_1"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3395:1: rule__ArithExpr__NumAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__ArithExpr__NumAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3399:1: ( ( RULE_INT ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3400:1: ( RULE_INT )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3400:1: ( RULE_INT )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3401:1: RULE_INT
            {
             before(grammarAccess.getArithExprAccess().getNumINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ArithExpr__NumAssignment_2_16902); 
             after(grammarAccess.getArithExprAccess().getNumINTTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArithExpr__NumAssignment_2_1"


    // $ANTLR start "rule__TimeStamp__ValAssignment_0"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3410:1: rule__TimeStamp__ValAssignment_0 : ( RULE_INT ) ;
    public final void rule__TimeStamp__ValAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3414:1: ( ( RULE_INT ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3415:1: ( RULE_INT )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3415:1: ( RULE_INT )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3416:1: RULE_INT
            {
             before(grammarAccess.getTimeStampAccess().getValINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__TimeStamp__ValAssignment_06933); 
             after(grammarAccess.getTimeStampAccess().getValINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeStamp__ValAssignment_0"


    // $ANTLR start "rule__TimeStamp__EventReferenceAssignment_1_0"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3425:1: rule__TimeStamp__EventReferenceAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__TimeStamp__EventReferenceAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3429:1: ( ( RULE_ID ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3430:1: ( RULE_ID )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3430:1: ( RULE_ID )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3431:1: RULE_ID
            {
             before(grammarAccess.getTimeStampAccess().getEventReferenceIDTerminalRuleCall_1_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TimeStamp__EventReferenceAssignment_1_06964); 
             after(grammarAccess.getTimeStampAccess().getEventReferenceIDTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeStamp__EventReferenceAssignment_1_0"


    // $ANTLR start "rule__TimeStamp__ShiftAssignment_1_1_1"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3440:1: rule__TimeStamp__ShiftAssignment_1_1_1 : ( RULE_INT ) ;
    public final void rule__TimeStamp__ShiftAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3444:1: ( ( RULE_INT ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3445:1: ( RULE_INT )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3445:1: ( RULE_INT )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3446:1: RULE_INT
            {
             before(grammarAccess.getTimeStampAccess().getShiftINTTerminalRuleCall_1_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__TimeStamp__ShiftAssignment_1_1_16995); 
             after(grammarAccess.getTimeStampAccess().getShiftINTTerminalRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeStamp__ShiftAssignment_1_1_1"


    // $ANTLR start "rule__BinaryOperator__OpAssignment"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3455:1: rule__BinaryOperator__OpAssignment : ( ( rule__BinaryOperator__OpAlternatives_0 ) ) ;
    public final void rule__BinaryOperator__OpAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3459:1: ( ( ( rule__BinaryOperator__OpAlternatives_0 ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3460:1: ( ( rule__BinaryOperator__OpAlternatives_0 ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3460:1: ( ( rule__BinaryOperator__OpAlternatives_0 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3461:1: ( rule__BinaryOperator__OpAlternatives_0 )
            {
             before(grammarAccess.getBinaryOperatorAccess().getOpAlternatives_0()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3462:1: ( rule__BinaryOperator__OpAlternatives_0 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3462:2: rule__BinaryOperator__OpAlternatives_0
            {
            pushFollow(FOLLOW_rule__BinaryOperator__OpAlternatives_0_in_rule__BinaryOperator__OpAssignment7026);
            rule__BinaryOperator__OpAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getBinaryOperatorAccess().getOpAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryOperator__OpAssignment"


    // $ANTLR start "rule__Attribute__NameAssignment"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3471:1: rule__Attribute__NameAssignment : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3475:1: ( ( RULE_ID ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3476:1: ( RULE_ID )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3476:1: ( RULE_ID )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3477:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment7059); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA2 dfa2 = new DFA2(this);
    static final String DFA1_eotS =
        "\36\uffff";
    static final String DFA1_eofS =
        "\1\uffff\1\11\11\uffff\1\11\5\uffff\1\11\2\uffff\1\11\1\uffff\1"+
        "\11\4\uffff\1\11\2\uffff";
    static final String DFA1_minS =
        "\1\4\1\16\5\37\1\uffff\1\26\2\uffff\1\16\1\35\2\26\2\35\1\16\1"+
        "\35\1\41\1\16\1\41\1\16\2\35\1\26\1\35\1\16\1\41\1\35";
    static final String DFA1_maxS =
        "\1\37\1\40\5\37\1\uffff\1\41\2\uffff\1\40\1\41\1\26\1\36\1\35\1"+
        "\36\1\40\2\41\1\40\1\41\1\40\1\35\1\36\1\26\1\35\1\40\1\41\1\35";
    static final String DFA1_acceptS =
        "\7\uffff\1\3\1\uffff\1\1\1\2\23\uffff";
    static final String DFA1_specialS =
        "\36\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\2\1\3\1\4\1\5\1\6\11\uffff\1\7\14\uffff\1\1",
            "\3\12\2\uffff\1\11\3\uffff\1\11\2\uffff\2\11\1\10\3\uffff"+
            "\1\11",
            "\1\13",
            "\1\13",
            "\1\13",
            "\1\13",
            "\1\13",
            "",
            "\1\14\10\uffff\1\16\1\uffff\1\15",
            "",
            "",
            "\3\12\2\uffff\1\11\3\uffff\1\11\2\uffff\2\11\1\10\3\uffff"+
            "\1\11",
            "\1\21\1\uffff\1\20\1\uffff\1\17",
            "\1\22",
            "\1\22\7\uffff\1\23",
            "\1\24",
            "\1\24\1\25",
            "\3\12\2\uffff\1\11\3\uffff\1\11\2\uffff\2\11\4\uffff\1\11",
            "\1\26\1\uffff\1\30\1\uffff\1\27",
            "\1\31",
            "\3\12\2\uffff\1\11\3\uffff\1\11\2\uffff\2\11\4\uffff\1\11",
            "\1\32",
            "\3\12\2\uffff\1\11\3\uffff\1\11\2\uffff\2\11\4\uffff\1\11",
            "\1\33",
            "\1\33\1\34",
            "\1\22",
            "\1\24",
            "\3\12\2\uffff\1\11\3\uffff\1\11\2\uffff\2\11\4\uffff\1\11",
            "\1\35",
            "\1\33"
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
            return "452:1: rule__Expr__Alternatives : ( ( ( rule__Expr__IntervalAssignment_0 ) ) | ( ( rule__Expr__Group_1__0 ) ) | ( ( rule__Expr__Group_2__0 ) ) );";
        }
    }
    static final String DFA2_eotS =
        "\24\uffff";
    static final String DFA2_eofS =
        "\1\uffff\1\10\7\uffff\1\10\12\uffff";
    static final String DFA2_minS =
        "\1\4\1\16\5\37\1\26\1\uffff\1\16\1\35\2\26\2\uffff\1\35\1\41\2"+
        "\uffff\1\26";
    static final String DFA2_maxS =
        "\1\37\1\40\5\37\1\41\1\uffff\1\40\1\41\1\26\1\36\2\uffff\2\41\2"+
        "\uffff\1\26";
    static final String DFA2_acceptS =
        "\10\uffff\1\1\4\uffff\1\5\1\3\2\uffff\1\2\1\4\1\uffff";
    static final String DFA2_specialS =
        "\24\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\2\1\3\1\4\1\5\1\6\26\uffff\1\1",
            "\3\10\2\uffff\1\10\3\uffff\1\10\2\uffff\2\10\1\7\3\uffff\1"+
            "\10",
            "\1\11",
            "\1\11",
            "\1\11",
            "\1\11",
            "\1\11",
            "\1\12\10\uffff\1\14\1\uffff\1\13",
            "",
            "\3\10\2\uffff\1\10\3\uffff\1\10\2\uffff\2\10\1\7\3\uffff\1"+
            "\10",
            "\1\15\1\uffff\1\16\1\uffff\1\16",
            "\1\17",
            "\1\17\7\uffff\1\20",
            "",
            "",
            "\1\22\1\uffff\1\21\1\uffff\1\21",
            "\1\23",
            "",
            "",
            "\1\17"
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
            return "480:1: rule__Interval__Alternatives : ( ( ( rule__Interval__EventAssignment_0 ) ) | ( ( rule__Interval__Group_1__0 ) ) | ( ( rule__Interval__Group_2__0 ) ) | ( ( rule__Interval__Group_3__0 ) ) | ( ( rule__Interval__Group_4__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleCupido_in_entryRuleCupido61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCupido68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cupido__Group__0_in_ruleCupido94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemata_in_entryRuleSchemata121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemata128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Schemata__Group__0_in_ruleSchemata154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventRelation_in_entryRuleEventRelation181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventRelation188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventRelation__Group__0_in_ruleEventRelation214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_entryRuleParam241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParam248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__NameAssignment_in_ruleParam274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommitment_in_entryRuleCommitment301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommitment308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commitment__Group__0_in_ruleCommitment334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGeneralExpr_in_entryRuleGeneralExpr361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGeneralExpr368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GeneralExpr__Group__0_in_ruleGeneralExpr394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_entryRuleExpr421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpr428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__Alternatives_in_ruleExpr454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterval_in_entryRuleInterval481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterval488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__Alternatives_in_ruleInterval514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Alternatives_in_ruleEvent574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithExpr_in_entryRuleArithExpr601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArithExpr608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArithExpr__Group__0_in_ruleArithExpr634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeStamp_in_entryRuleTimeStamp661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimeStamp668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeStamp__Alternatives_in_ruleTimeStamp694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryOperator_in_entryRuleBinaryOperator721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinaryOperator728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryOperator__OpAssignment_in_ruleBinaryOperator754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_in_ruleAttribute814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventOperator_in_entryRuleEventOperator841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventOperator848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventOperator__Alternatives_in_ruleEventOperator874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__IntervalAssignment_0_in_rule__Expr__Alternatives910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__Group_1__0_in_rule__Expr__Alternatives928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__Group_2__0_in_rule__Expr__Alternatives946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__EventAssignment_0_in_rule__Interval__Alternatives979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__Group_1__0_in_rule__Interval__Alternatives997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__Group_2__0_in_rule__Interval__Alternatives1015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__Group_3__0_in_rule__Interval__Alternatives1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__Group_4__0_in_rule__Interval__Alternatives1051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__NameAssignment_0_in_rule__Event__Alternatives1084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group_1__0_in_rule__Event__Alternatives1102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CREATED_in_rule__Event__LifeStateAlternatives_1_0_01135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DETACHED_in_rule__Event__LifeStateAlternatives_1_0_01152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DISCHARGED_in_rule__Event__LifeStateAlternatives_1_0_01169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EXPIRED_in_rule__Event__LifeStateAlternatives_1_0_01186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VIOLATED_in_rule__Event__LifeStateAlternatives_1_0_01203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArithExpr__RightAttrAssignment_2_0_in_rule__ArithExpr__Alternatives_21235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArithExpr__NumAssignment_2_1_in_rule__ArithExpr__Alternatives_21253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeStamp__ValAssignment_0_in_rule__TimeStamp__Alternatives1286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeStamp__Group_1__0_in_rule__TimeStamp__Alternatives1304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LT_in_rule__BinaryOperator__OpAlternatives_01337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LEQ_in_rule__BinaryOperator__OpAlternatives_01354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EQ_in_rule__BinaryOperator__OpAlternatives_01371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_GT_in_rule__BinaryOperator__OpAlternatives_01388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_GEQ_in_rule__BinaryOperator__OpAlternatives_01405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_AND_in_rule__EventOperator__Alternatives1437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OR_in_rule__EventOperator__Alternatives1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EXCEPT_in_rule__EventOperator__Alternatives1471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cupido__Group__0__Impl_in_rule__Cupido__Group__01501 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Cupido__Group__1_in_rule__Cupido__Group__01504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemata_in_rule__Cupido__Group__0__Impl1531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cupido__Group__1__Impl_in_rule__Cupido__Group__11560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cupido__CommitmentsAssignment_1_in_rule__Cupido__Group__1__Impl1587 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Schemata__Group__0__Impl_in_rule__Schemata__Group__01622 = new BitSet(new long[]{0x00000000800001F0L});
    public static final BitSet FOLLOW_rule__Schemata__Group__1_in_rule__Schemata__Group__01625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SCHEMA_in_rule__Schemata__Group__0__Impl1652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Schemata__Group__1__Impl_in_rule__Schemata__Group__11681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Schemata__SchemataAssignment_1_in_rule__Schemata__Group__1__Impl1710 = new BitSet(new long[]{0x00000000800001F2L});
    public static final BitSet FOLLOW_rule__Schemata__SchemataAssignment_1_in_rule__Schemata__Group__1__Impl1722 = new BitSet(new long[]{0x00000000800001F2L});
    public static final BitSet FOLLOW_rule__EventRelation__Group__0__Impl_in_rule__EventRelation__Group__01759 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__EventRelation__Group__1_in_rule__EventRelation__Group__01762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventRelation__EventAssignment_0_in_rule__EventRelation__Group__0__Impl1789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventRelation__Group__1__Impl_in_rule__EventRelation__Group__11819 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__EventRelation__Group__2_in_rule__EventRelation__Group__11822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_rule__EventRelation__Group__1__Impl1849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventRelation__Group__2__Impl_in_rule__EventRelation__Group__21878 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_rule__EventRelation__Group__3_in_rule__EventRelation__Group__21881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventRelation__ParamsAssignment_2_in_rule__EventRelation__Group__2__Impl1908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventRelation__Group__3__Impl_in_rule__EventRelation__Group__31938 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_rule__EventRelation__Group__4_in_rule__EventRelation__Group__31941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventRelation__Group_3__0_in_rule__EventRelation__Group__3__Impl1968 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__EventRelation__Group__4__Impl_in_rule__EventRelation__Group__41999 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__EventRelation__Group__5_in_rule__EventRelation__Group__42002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_rule__EventRelation__Group__4__Impl2029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventRelation__Group__5__Impl_in_rule__EventRelation__Group__52058 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__EventRelation__Group__6_in_rule__EventRelation__Group__52061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KEY_in_rule__EventRelation__Group__5__Impl2088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventRelation__Group__6__Impl_in_rule__EventRelation__Group__62117 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__EventRelation__Group__7_in_rule__EventRelation__Group__62120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventRelation__KeyParamsAssignment_6_in_rule__EventRelation__Group__6__Impl2147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventRelation__Group__7__Impl_in_rule__EventRelation__Group__72177 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__EventRelation__Group__8_in_rule__EventRelation__Group__72180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventRelation__Group_7__0_in_rule__EventRelation__Group__7__Impl2207 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__EventRelation__Group__8__Impl_in_rule__EventRelation__Group__82238 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__EventRelation__Group__9_in_rule__EventRelation__Group__82241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TIME_in_rule__EventRelation__Group__8__Impl2268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventRelation__Group__9__Impl_in_rule__EventRelation__Group__92297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventRelation__TimeParamAssignment_9_in_rule__EventRelation__Group__9__Impl2324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventRelation__Group_3__0__Impl_in_rule__EventRelation__Group_3__02374 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__EventRelation__Group_3__1_in_rule__EventRelation__Group_3__02377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rule__EventRelation__Group_3__0__Impl2404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventRelation__Group_3__1__Impl_in_rule__EventRelation__Group_3__12433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventRelation__ParamsAssignment_3_1_in_rule__EventRelation__Group_3__1__Impl2460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventRelation__Group_7__0__Impl_in_rule__EventRelation__Group_7__02494 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__EventRelation__Group_7__1_in_rule__EventRelation__Group_7__02497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rule__EventRelation__Group_7__0__Impl2524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventRelation__Group_7__1__Impl_in_rule__EventRelation__Group_7__12553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventRelation__KeyParamsAssignment_7_1_in_rule__EventRelation__Group_7__1__Impl2580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commitment__Group__0__Impl_in_rule__Commitment__Group__02614 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Commitment__Group__1_in_rule__Commitment__Group__02617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMIT_in_rule__Commitment__Group__0__Impl2644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commitment__Group__1__Impl_in_rule__Commitment__Group__12673 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Commitment__Group__2_in_rule__Commitment__Group__12676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commitment__LabelAssignment_1_in_rule__Commitment__Group__1__Impl2703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commitment__Group__2__Impl_in_rule__Commitment__Group__22733 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Commitment__Group__3_in_rule__Commitment__Group__22736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commitment__DebtorAssignment_2_in_rule__Commitment__Group__2__Impl2763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commitment__Group__3__Impl_in_rule__Commitment__Group__32793 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Commitment__Group__4_in_rule__Commitment__Group__32796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TO_in_rule__Commitment__Group__3__Impl2823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commitment__Group__4__Impl_in_rule__Commitment__Group__42852 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Commitment__Group__5_in_rule__Commitment__Group__42855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commitment__CreditorAssignment_4_in_rule__Commitment__Group__4__Impl2882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commitment__Group__5__Impl_in_rule__Commitment__Group__52912 = new BitSet(new long[]{0x00000000800401F0L});
    public static final BitSet FOLLOW_rule__Commitment__Group__6_in_rule__Commitment__Group__52915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CREATE_in_rule__Commitment__Group__5__Impl2942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commitment__Group__6__Impl_in_rule__Commitment__Group__62971 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_rule__Commitment__Group__7_in_rule__Commitment__Group__62974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commitment__TriggerAssignment_6_in_rule__Commitment__Group__6__Impl3001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commitment__Group__7__Impl_in_rule__Commitment__Group__73031 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_rule__Commitment__Group__8_in_rule__Commitment__Group__73034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commitment__Group_7__0_in_rule__Commitment__Group__7__Impl3061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commitment__Group__8__Impl_in_rule__Commitment__Group__83092 = new BitSet(new long[]{0x00000000800401F0L});
    public static final BitSet FOLLOW_rule__Commitment__Group__9_in_rule__Commitment__Group__83095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DISCHARGE_in_rule__Commitment__Group__8__Impl3122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commitment__Group__9__Impl_in_rule__Commitment__Group__93151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commitment__ConsequentAssignment_9_in_rule__Commitment__Group__9__Impl3178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commitment__Group_7__0__Impl_in_rule__Commitment__Group_7__03228 = new BitSet(new long[]{0x00000000800401F0L});
    public static final BitSet FOLLOW_rule__Commitment__Group_7__1_in_rule__Commitment__Group_7__03231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DETACH_in_rule__Commitment__Group_7__0__Impl3258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commitment__Group_7__1__Impl_in_rule__Commitment__Group_7__13287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commitment__AntecedentAssignment_7_1_in_rule__Commitment__Group_7__1__Impl3314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GeneralExpr__Group__0__Impl_in_rule__GeneralExpr__Group__03348 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__GeneralExpr__Group__1_in_rule__GeneralExpr__Group__03351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GeneralExpr__ExprAssignment_0_in_rule__GeneralExpr__Group__0__Impl3378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GeneralExpr__Group__1__Impl_in_rule__GeneralExpr__Group__13408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GeneralExpr__Group_1__0_in_rule__GeneralExpr__Group__1__Impl3435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GeneralExpr__Group_1__0__Impl_in_rule__GeneralExpr__Group_1__03470 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__GeneralExpr__Group_1__1_in_rule__GeneralExpr__Group_1__03473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GeneralExpr__WhereAssignment_1_0_in_rule__GeneralExpr__Group_1__0__Impl3500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GeneralExpr__Group_1__1__Impl_in_rule__GeneralExpr__Group_1__13530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GeneralExpr__ArithAssignment_1_1_in_rule__GeneralExpr__Group_1__1__Impl3557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__Group_1__0__Impl_in_rule__Expr__Group_1__03591 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_rule__Expr__Group_1__1_in_rule__Expr__Group_1__03594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__LeftAssignment_1_0_in_rule__Expr__Group_1__0__Impl3621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__Group_1__1__Impl_in_rule__Expr__Group_1__13651 = new BitSet(new long[]{0x00000000800401F0L});
    public static final BitSet FOLLOW_rule__Expr__Group_1__2_in_rule__Expr__Group_1__13654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__OpAssignment_1_1_in_rule__Expr__Group_1__1__Impl3681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__Group_1__2__Impl_in_rule__Expr__Group_1__23711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__RightAssignment_1_2_in_rule__Expr__Group_1__2__Impl3738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__Group_2__0__Impl_in_rule__Expr__Group_2__03774 = new BitSet(new long[]{0x00000000800401F0L});
    public static final BitSet FOLLOW_rule__Expr__Group_2__1_in_rule__Expr__Group_2__03777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_rule__Expr__Group_2__0__Impl3804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__Group_2__1__Impl_in_rule__Expr__Group_2__13833 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Expr__Group_2__2_in_rule__Expr__Group_2__13836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__ExprAssignment_2_1_in_rule__Expr__Group_2__1__Impl3863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__Group_2__2__Impl_in_rule__Expr__Group_2__23893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_rule__Expr__Group_2__2__Impl3920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__Group_1__0__Impl_in_rule__Interval__Group_1__03955 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Interval__Group_1__1_in_rule__Interval__Group_1__03958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__EventAssignment_1_0_in_rule__Interval__Group_1__0__Impl3985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__Group_1__1__Impl_in_rule__Interval__Group_1__14015 = new BitSet(new long[]{0x0000000280000000L});
    public static final BitSet FOLLOW_rule__Interval__Group_1__2_in_rule__Interval__Group_1__14018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LBRACKET_in_rule__Interval__Group_1__1__Impl4045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__Group_1__2__Impl_in_rule__Interval__Group_1__24074 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Interval__Group_1__3_in_rule__Interval__Group_1__24077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__LeftAssignment_1_2_in_rule__Interval__Group_1__2__Impl4104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__Group_1__3__Impl_in_rule__Interval__Group_1__34134 = new BitSet(new long[]{0x0000000280000000L});
    public static final BitSet FOLLOW_rule__Interval__Group_1__4_in_rule__Interval__Group_1__34137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rule__Interval__Group_1__3__Impl4164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__Group_1__4__Impl_in_rule__Interval__Group_1__44193 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Interval__Group_1__5_in_rule__Interval__Group_1__44196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__RightAssignment_1_4_in_rule__Interval__Group_1__4__Impl4223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__Group_1__5__Impl_in_rule__Interval__Group_1__54253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RBRACKET_in_rule__Interval__Group_1__5__Impl4280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__Group_2__0__Impl_in_rule__Interval__Group_2__04321 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Interval__Group_2__1_in_rule__Interval__Group_2__04324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__EventAssignment_2_0_in_rule__Interval__Group_2__0__Impl4351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__Group_2__1__Impl_in_rule__Interval__Group_2__14381 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Interval__Group_2__2_in_rule__Interval__Group_2__14384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LBRACKET_in_rule__Interval__Group_2__1__Impl4411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__Group_2__2__Impl_in_rule__Interval__Group_2__24440 = new BitSet(new long[]{0x0000000280000000L});
    public static final BitSet FOLLOW_rule__Interval__Group_2__3_in_rule__Interval__Group_2__24443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rule__Interval__Group_2__2__Impl4470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__Group_2__3__Impl_in_rule__Interval__Group_2__34499 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Interval__Group_2__4_in_rule__Interval__Group_2__34502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__RightAssignment_2_3_in_rule__Interval__Group_2__3__Impl4529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__Group_2__4__Impl_in_rule__Interval__Group_2__44559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RBRACKET_in_rule__Interval__Group_2__4__Impl4586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__Group_3__0__Impl_in_rule__Interval__Group_3__04625 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Interval__Group_3__1_in_rule__Interval__Group_3__04628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__EventAssignment_3_0_in_rule__Interval__Group_3__0__Impl4655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__Group_3__1__Impl_in_rule__Interval__Group_3__14685 = new BitSet(new long[]{0x0000000280000000L});
    public static final BitSet FOLLOW_rule__Interval__Group_3__2_in_rule__Interval__Group_3__14688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LBRACKET_in_rule__Interval__Group_3__1__Impl4715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__Group_3__2__Impl_in_rule__Interval__Group_3__24744 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Interval__Group_3__3_in_rule__Interval__Group_3__24747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__LeftAssignment_3_2_in_rule__Interval__Group_3__2__Impl4774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__Group_3__3__Impl_in_rule__Interval__Group_3__34804 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Interval__Group_3__4_in_rule__Interval__Group_3__34807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rule__Interval__Group_3__3__Impl4834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__Group_3__4__Impl_in_rule__Interval__Group_3__44863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RBRACKET_in_rule__Interval__Group_3__4__Impl4890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__Group_4__0__Impl_in_rule__Interval__Group_4__04929 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Interval__Group_4__1_in_rule__Interval__Group_4__04932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__EventAssignment_4_0_in_rule__Interval__Group_4__0__Impl4959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__Group_4__1__Impl_in_rule__Interval__Group_4__14989 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Interval__Group_4__2_in_rule__Interval__Group_4__14992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LBRACKET_in_rule__Interval__Group_4__1__Impl5019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__Group_4__2__Impl_in_rule__Interval__Group_4__25048 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Interval__Group_4__3_in_rule__Interval__Group_4__25051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rule__Interval__Group_4__2__Impl5078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__Group_4__3__Impl_in_rule__Interval__Group_4__35107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RBRACKET_in_rule__Interval__Group_4__3__Impl5134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group_1__0__Impl_in_rule__Event__Group_1__05171 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Event__Group_1__1_in_rule__Event__Group_1__05174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__LifeStateAssignment_1_0_in_rule__Event__Group_1__0__Impl5201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group_1__1__Impl_in_rule__Event__Group_1__15231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__LabelAssignment_1_1_in_rule__Event__Group_1__1__Impl5258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArithExpr__Group__0__Impl_in_rule__ArithExpr__Group__05292 = new BitSet(new long[]{0x0000000000003E00L});
    public static final BitSet FOLLOW_rule__ArithExpr__Group__1_in_rule__ArithExpr__Group__05295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArithExpr__LeftAttrAssignment_0_in_rule__ArithExpr__Group__0__Impl5322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArithExpr__Group__1__Impl_in_rule__ArithExpr__Group__15352 = new BitSet(new long[]{0x0000000280000000L});
    public static final BitSet FOLLOW_rule__ArithExpr__Group__2_in_rule__ArithExpr__Group__15355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArithExpr__BinOpAssignment_1_in_rule__ArithExpr__Group__1__Impl5382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArithExpr__Group__2__Impl_in_rule__ArithExpr__Group__25412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArithExpr__Alternatives_2_in_rule__ArithExpr__Group__2__Impl5439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeStamp__Group_1__0__Impl_in_rule__TimeStamp__Group_1__05475 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__TimeStamp__Group_1__1_in_rule__TimeStamp__Group_1__05478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeStamp__EventReferenceAssignment_1_0_in_rule__TimeStamp__Group_1__0__Impl5505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeStamp__Group_1__1__Impl_in_rule__TimeStamp__Group_1__15535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeStamp__Group_1_1__0_in_rule__TimeStamp__Group_1__1__Impl5562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeStamp__Group_1_1__0__Impl_in_rule__TimeStamp__Group_1_1__05597 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__TimeStamp__Group_1_1__1_in_rule__TimeStamp__Group_1_1__05600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PLUS_in_rule__TimeStamp__Group_1_1__0__Impl5627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeStamp__Group_1_1__1__Impl_in_rule__TimeStamp__Group_1_1__15656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeStamp__ShiftAssignment_1_1_1_in_rule__TimeStamp__Group_1_1__1__Impl5683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommitment_in_rule__Cupido__CommitmentsAssignment_15722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventRelation_in_rule__Schemata__SchemataAssignment_15753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_rule__EventRelation__EventAssignment_05784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_rule__EventRelation__ParamsAssignment_25815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_rule__EventRelation__ParamsAssignment_3_15846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_rule__EventRelation__KeyParamsAssignment_65877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_rule__EventRelation__KeyParamsAssignment_7_15908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_rule__EventRelation__TimeParamAssignment_95939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Param__NameAssignment5970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Commitment__LabelAssignment_16001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Commitment__DebtorAssignment_26032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Commitment__CreditorAssignment_46063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGeneralExpr_in_rule__Commitment__TriggerAssignment_66094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGeneralExpr_in_rule__Commitment__AntecedentAssignment_7_16125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGeneralExpr_in_rule__Commitment__ConsequentAssignment_96156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__GeneralExpr__ExprAssignment_06187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WHERE_in_rule__GeneralExpr__WhereAssignment_1_06218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithExpr_in_rule__GeneralExpr__ArithAssignment_1_16249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterval_in_rule__Expr__IntervalAssignment_06280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterval_in_rule__Expr__LeftAssignment_1_06311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventOperator_in_rule__Expr__OpAssignment_1_16342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Expr__RightAssignment_1_26373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Expr__ExprAssignment_2_16404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_rule__Interval__EventAssignment_06435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_rule__Interval__EventAssignment_1_06466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeStamp_in_rule__Interval__LeftAssignment_1_26497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeStamp_in_rule__Interval__RightAssignment_1_46528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_rule__Interval__EventAssignment_2_06559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeStamp_in_rule__Interval__RightAssignment_2_36590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_rule__Interval__EventAssignment_3_06621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeStamp_in_rule__Interval__LeftAssignment_3_26652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_rule__Interval__EventAssignment_4_06683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Event__NameAssignment_06714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__LifeStateAlternatives_1_0_0_in_rule__Event__LifeStateAssignment_1_06745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Event__LabelAssignment_1_16778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__ArithExpr__LeftAttrAssignment_06809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryOperator_in_rule__ArithExpr__BinOpAssignment_16840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__ArithExpr__RightAttrAssignment_2_06871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ArithExpr__NumAssignment_2_16902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__TimeStamp__ValAssignment_06933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TimeStamp__EventReferenceAssignment_1_06964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__TimeStamp__ShiftAssignment_1_1_16995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryOperator__OpAlternatives_0_in_rule__BinaryOperator__OpAssignment7026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment7059 = new BitSet(new long[]{0x0000000000000002L});

}