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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_CREATED", "RULE_DETACHED", "RULE_DISCHARGED", "RULE_EXPIRED", "RULE_VIOLATED", "RULE_SCHEMA", "RULE_LPAREN", "RULE_RPAREN", "RULE_KEY", "RULE_TIME", "RULE_COMMA", "RULE_COMMIT", "RULE_TO", "RULE_CREATE", "RULE_DISCHARGE", "RULE_DETACH", "RULE_EXCEPT", "RULE_OR", "RULE_AND", "RULE_WHERE", "RULE_LBRACKET", "RULE_RBRACKET", "RULE_PLUS", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_LBRACKET=24;
    public static final int RULE_TO=16;
    public static final int RULE_KEY=12;
    public static final int RULE_STRING=28;
    public static final int RULE_LPAREN=10;
    public static final int RULE_SCHEMA=9;
    public static final int RULE_AND=22;
    public static final int RULE_SL_COMMENT=31;
    public static final int RULE_CREATE=17;
    public static final int RULE_TIME=13;
    public static final int RULE_PLUS=26;
    public static final int RULE_OR=21;
    public static final int EOF=-1;
    public static final int RULE_DETACH=19;
    public static final int RULE_ID=27;
    public static final int RULE_EXPIRED=7;
    public static final int RULE_COMMA=14;
    public static final int RULE_WS=32;
    public static final int RULE_DETACHED=5;
    public static final int RULE_WHERE=23;
    public static final int RULE_ANY_OTHER=33;
    public static final int RULE_RPAREN=11;
    public static final int RULE_DISCHARGED=6;
    public static final int RULE_INT=29;
    public static final int RULE_VIOLATED=8;
    public static final int RULE_EXCEPT=20;
    public static final int RULE_ML_COMMENT=30;
    public static final int RULE_CREATED=4;
    public static final int RULE_COMMIT=15;
    public static final int RULE_DISCHARGE=18;
    public static final int RULE_RBRACKET=25;

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


    // $ANTLR start "entryRuleEExpr"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:200:1: entryRuleEExpr : ruleEExpr EOF ;
    public final void entryRuleEExpr() throws RecognitionException {
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:201:1: ( ruleEExpr EOF )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:202:1: ruleEExpr EOF
            {
             before(grammarAccess.getEExprRule()); 
            pushFollow(FOLLOW_ruleEExpr_in_entryRuleEExpr361);
            ruleEExpr();

            state._fsp--;

             after(grammarAccess.getEExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEExpr368); 

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
    // $ANTLR end "entryRuleEExpr"


    // $ANTLR start "ruleEExpr"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:209:1: ruleEExpr : ( ( rule__EExpr__Group__0 ) ) ;
    public final void ruleEExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:213:2: ( ( ( rule__EExpr__Group__0 ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:214:1: ( ( rule__EExpr__Group__0 ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:214:1: ( ( rule__EExpr__Group__0 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:215:1: ( rule__EExpr__Group__0 )
            {
             before(grammarAccess.getEExprAccess().getGroup()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:216:1: ( rule__EExpr__Group__0 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:216:2: rule__EExpr__Group__0
            {
            pushFollow(FOLLOW_rule__EExpr__Group__0_in_ruleEExpr394);
            rule__EExpr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEExprAccess().getGroup()); 

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
    // $ANTLR end "ruleEExpr"


    // $ANTLR start "entryRuleOExpr"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:228:1: entryRuleOExpr : ruleOExpr EOF ;
    public final void entryRuleOExpr() throws RecognitionException {
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:229:1: ( ruleOExpr EOF )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:230:1: ruleOExpr EOF
            {
             before(grammarAccess.getOExprRule()); 
            pushFollow(FOLLOW_ruleOExpr_in_entryRuleOExpr421);
            ruleOExpr();

            state._fsp--;

             after(grammarAccess.getOExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOExpr428); 

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
    // $ANTLR end "entryRuleOExpr"


    // $ANTLR start "ruleOExpr"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:237:1: ruleOExpr : ( ( rule__OExpr__Group__0 ) ) ;
    public final void ruleOExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:241:2: ( ( ( rule__OExpr__Group__0 ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:242:1: ( ( rule__OExpr__Group__0 ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:242:1: ( ( rule__OExpr__Group__0 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:243:1: ( rule__OExpr__Group__0 )
            {
             before(grammarAccess.getOExprAccess().getGroup()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:244:1: ( rule__OExpr__Group__0 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:244:2: rule__OExpr__Group__0
            {
            pushFollow(FOLLOW_rule__OExpr__Group__0_in_ruleOExpr454);
            rule__OExpr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOExprAccess().getGroup()); 

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
    // $ANTLR end "ruleOExpr"


    // $ANTLR start "entryRuleAExpr"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:256:1: entryRuleAExpr : ruleAExpr EOF ;
    public final void entryRuleAExpr() throws RecognitionException {
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:257:1: ( ruleAExpr EOF )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:258:1: ruleAExpr EOF
            {
             before(grammarAccess.getAExprRule()); 
            pushFollow(FOLLOW_ruleAExpr_in_entryRuleAExpr481);
            ruleAExpr();

            state._fsp--;

             after(grammarAccess.getAExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAExpr488); 

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
    // $ANTLR end "entryRuleAExpr"


    // $ANTLR start "ruleAExpr"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:265:1: ruleAExpr : ( ( rule__AExpr__Group__0 ) ) ;
    public final void ruleAExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:269:2: ( ( ( rule__AExpr__Group__0 ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:270:1: ( ( rule__AExpr__Group__0 ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:270:1: ( ( rule__AExpr__Group__0 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:271:1: ( rule__AExpr__Group__0 )
            {
             before(grammarAccess.getAExprAccess().getGroup()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:272:1: ( rule__AExpr__Group__0 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:272:2: rule__AExpr__Group__0
            {
            pushFollow(FOLLOW_rule__AExpr__Group__0_in_ruleAExpr514);
            rule__AExpr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAExprAccess().getGroup()); 

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
    // $ANTLR end "ruleAExpr"


    // $ANTLR start "entryRuleWExpr"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:284:1: entryRuleWExpr : ruleWExpr EOF ;
    public final void entryRuleWExpr() throws RecognitionException {
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:285:1: ( ruleWExpr EOF )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:286:1: ruleWExpr EOF
            {
             before(grammarAccess.getWExprRule()); 
            pushFollow(FOLLOW_ruleWExpr_in_entryRuleWExpr541);
            ruleWExpr();

            state._fsp--;

             after(grammarAccess.getWExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWExpr548); 

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
    // $ANTLR end "entryRuleWExpr"


    // $ANTLR start "ruleWExpr"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:293:1: ruleWExpr : ( ( rule__WExpr__Group__0 ) ) ;
    public final void ruleWExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:297:2: ( ( ( rule__WExpr__Group__0 ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:298:1: ( ( rule__WExpr__Group__0 ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:298:1: ( ( rule__WExpr__Group__0 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:299:1: ( rule__WExpr__Group__0 )
            {
             before(grammarAccess.getWExprAccess().getGroup()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:300:1: ( rule__WExpr__Group__0 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:300:2: rule__WExpr__Group__0
            {
            pushFollow(FOLLOW_rule__WExpr__Group__0_in_ruleWExpr574);
            rule__WExpr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWExprAccess().getGroup()); 

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
    // $ANTLR end "ruleWExpr"


    // $ANTLR start "entryRuleBExpr"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:312:1: entryRuleBExpr : ruleBExpr EOF ;
    public final void entryRuleBExpr() throws RecognitionException {
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:313:1: ( ruleBExpr EOF )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:314:1: ruleBExpr EOF
            {
             before(grammarAccess.getBExprRule()); 
            pushFollow(FOLLOW_ruleBExpr_in_entryRuleBExpr601);
            ruleBExpr();

            state._fsp--;

             after(grammarAccess.getBExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBExpr608); 

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
    // $ANTLR end "entryRuleBExpr"


    // $ANTLR start "ruleBExpr"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:321:1: ruleBExpr : ( ( rule__BExpr__Alternatives ) ) ;
    public final void ruleBExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:325:2: ( ( ( rule__BExpr__Alternatives ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:326:1: ( ( rule__BExpr__Alternatives ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:326:1: ( ( rule__BExpr__Alternatives ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:327:1: ( rule__BExpr__Alternatives )
            {
             before(grammarAccess.getBExprAccess().getAlternatives()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:328:1: ( rule__BExpr__Alternatives )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:328:2: rule__BExpr__Alternatives
            {
            pushFollow(FOLLOW_rule__BExpr__Alternatives_in_ruleBExpr634);
            rule__BExpr__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBExprAccess().getAlternatives()); 

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
    // $ANTLR end "ruleBExpr"


    // $ANTLR start "entryRuleInterval"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:340:1: entryRuleInterval : ruleInterval EOF ;
    public final void entryRuleInterval() throws RecognitionException {
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:341:1: ( ruleInterval EOF )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:342:1: ruleInterval EOF
            {
             before(grammarAccess.getIntervalRule()); 
            pushFollow(FOLLOW_ruleInterval_in_entryRuleInterval661);
            ruleInterval();

            state._fsp--;

             after(grammarAccess.getIntervalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterval668); 

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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:349:1: ruleInterval : ( ( rule__Interval__Alternatives ) ) ;
    public final void ruleInterval() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:353:2: ( ( ( rule__Interval__Alternatives ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:354:1: ( ( rule__Interval__Alternatives ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:354:1: ( ( rule__Interval__Alternatives ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:355:1: ( rule__Interval__Alternatives )
            {
             before(grammarAccess.getIntervalAccess().getAlternatives()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:356:1: ( rule__Interval__Alternatives )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:356:2: rule__Interval__Alternatives
            {
            pushFollow(FOLLOW_rule__Interval__Alternatives_in_ruleInterval694);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:368:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:369:1: ( ruleEvent EOF )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:370:1: ruleEvent EOF
            {
             before(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent721);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getEventRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent728); 

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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:377:1: ruleEvent : ( ( rule__Event__Alternatives ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:381:2: ( ( ( rule__Event__Alternatives ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:382:1: ( ( rule__Event__Alternatives ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:382:1: ( ( rule__Event__Alternatives ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:383:1: ( rule__Event__Alternatives )
            {
             before(grammarAccess.getEventAccess().getAlternatives()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:384:1: ( rule__Event__Alternatives )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:384:2: rule__Event__Alternatives
            {
            pushFollow(FOLLOW_rule__Event__Alternatives_in_ruleEvent754);
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


    // $ANTLR start "entryRuleTimeStamp"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:396:1: entryRuleTimeStamp : ruleTimeStamp EOF ;
    public final void entryRuleTimeStamp() throws RecognitionException {
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:397:1: ( ruleTimeStamp EOF )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:398:1: ruleTimeStamp EOF
            {
             before(grammarAccess.getTimeStampRule()); 
            pushFollow(FOLLOW_ruleTimeStamp_in_entryRuleTimeStamp781);
            ruleTimeStamp();

            state._fsp--;

             after(grammarAccess.getTimeStampRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimeStamp788); 

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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:405:1: ruleTimeStamp : ( ( rule__TimeStamp__Alternatives ) ) ;
    public final void ruleTimeStamp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:409:2: ( ( ( rule__TimeStamp__Alternatives ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:410:1: ( ( rule__TimeStamp__Alternatives ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:410:1: ( ( rule__TimeStamp__Alternatives ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:411:1: ( rule__TimeStamp__Alternatives )
            {
             before(grammarAccess.getTimeStampAccess().getAlternatives()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:412:1: ( rule__TimeStamp__Alternatives )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:412:2: rule__TimeStamp__Alternatives
            {
            pushFollow(FOLLOW_rule__TimeStamp__Alternatives_in_ruleTimeStamp814);
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


    // $ANTLR start "rule__BExpr__Alternatives"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:424:1: rule__BExpr__Alternatives : ( ( ( rule__BExpr__IntervalAssignment_0 ) ) | ( ( rule__BExpr__Group_1__0 ) ) );
    public final void rule__BExpr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:428:1: ( ( ( rule__BExpr__IntervalAssignment_0 ) ) | ( ( rule__BExpr__Group_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=RULE_CREATED && LA1_0<=RULE_VIOLATED)||LA1_0==RULE_ID) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_LPAREN) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:429:1: ( ( rule__BExpr__IntervalAssignment_0 ) )
                    {
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:429:1: ( ( rule__BExpr__IntervalAssignment_0 ) )
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:430:1: ( rule__BExpr__IntervalAssignment_0 )
                    {
                     before(grammarAccess.getBExprAccess().getIntervalAssignment_0()); 
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:431:1: ( rule__BExpr__IntervalAssignment_0 )
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:431:2: rule__BExpr__IntervalAssignment_0
                    {
                    pushFollow(FOLLOW_rule__BExpr__IntervalAssignment_0_in_rule__BExpr__Alternatives850);
                    rule__BExpr__IntervalAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBExprAccess().getIntervalAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:435:6: ( ( rule__BExpr__Group_1__0 ) )
                    {
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:435:6: ( ( rule__BExpr__Group_1__0 ) )
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:436:1: ( rule__BExpr__Group_1__0 )
                    {
                     before(grammarAccess.getBExprAccess().getGroup_1()); 
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:437:1: ( rule__BExpr__Group_1__0 )
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:437:2: rule__BExpr__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__BExpr__Group_1__0_in_rule__BExpr__Alternatives868);
                    rule__BExpr__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBExprAccess().getGroup_1()); 

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
    // $ANTLR end "rule__BExpr__Alternatives"


    // $ANTLR start "rule__Interval__Alternatives"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:446:1: rule__Interval__Alternatives : ( ( ( rule__Interval__EventAssignment_0 ) ) | ( ( rule__Interval__Group_1__0 ) ) | ( ( rule__Interval__Group_2__0 ) ) | ( ( rule__Interval__Group_3__0 ) ) | ( ( rule__Interval__Group_4__0 ) ) );
    public final void rule__Interval__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:450:1: ( ( ( rule__Interval__EventAssignment_0 ) ) | ( ( rule__Interval__Group_1__0 ) ) | ( ( rule__Interval__Group_2__0 ) ) | ( ( rule__Interval__Group_3__0 ) ) | ( ( rule__Interval__Group_4__0 ) ) )
            int alt2=5;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:451:1: ( ( rule__Interval__EventAssignment_0 ) )
                    {
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:451:1: ( ( rule__Interval__EventAssignment_0 ) )
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:452:1: ( rule__Interval__EventAssignment_0 )
                    {
                     before(grammarAccess.getIntervalAccess().getEventAssignment_0()); 
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:453:1: ( rule__Interval__EventAssignment_0 )
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:453:2: rule__Interval__EventAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Interval__EventAssignment_0_in_rule__Interval__Alternatives901);
                    rule__Interval__EventAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIntervalAccess().getEventAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:457:6: ( ( rule__Interval__Group_1__0 ) )
                    {
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:457:6: ( ( rule__Interval__Group_1__0 ) )
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:458:1: ( rule__Interval__Group_1__0 )
                    {
                     before(grammarAccess.getIntervalAccess().getGroup_1()); 
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:459:1: ( rule__Interval__Group_1__0 )
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:459:2: rule__Interval__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Interval__Group_1__0_in_rule__Interval__Alternatives919);
                    rule__Interval__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIntervalAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:463:6: ( ( rule__Interval__Group_2__0 ) )
                    {
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:463:6: ( ( rule__Interval__Group_2__0 ) )
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:464:1: ( rule__Interval__Group_2__0 )
                    {
                     before(grammarAccess.getIntervalAccess().getGroup_2()); 
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:465:1: ( rule__Interval__Group_2__0 )
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:465:2: rule__Interval__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Interval__Group_2__0_in_rule__Interval__Alternatives937);
                    rule__Interval__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIntervalAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:469:6: ( ( rule__Interval__Group_3__0 ) )
                    {
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:469:6: ( ( rule__Interval__Group_3__0 ) )
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:470:1: ( rule__Interval__Group_3__0 )
                    {
                     before(grammarAccess.getIntervalAccess().getGroup_3()); 
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:471:1: ( rule__Interval__Group_3__0 )
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:471:2: rule__Interval__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Interval__Group_3__0_in_rule__Interval__Alternatives955);
                    rule__Interval__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIntervalAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:475:6: ( ( rule__Interval__Group_4__0 ) )
                    {
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:475:6: ( ( rule__Interval__Group_4__0 ) )
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:476:1: ( rule__Interval__Group_4__0 )
                    {
                     before(grammarAccess.getIntervalAccess().getGroup_4()); 
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:477:1: ( rule__Interval__Group_4__0 )
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:477:2: rule__Interval__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Interval__Group_4__0_in_rule__Interval__Alternatives973);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:486:1: rule__Event__Alternatives : ( ( ( rule__Event__NameAssignment_0 ) ) | ( ( rule__Event__Group_1__0 ) ) );
    public final void rule__Event__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:490:1: ( ( ( rule__Event__NameAssignment_0 ) ) | ( ( rule__Event__Group_1__0 ) ) )
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
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:491:1: ( ( rule__Event__NameAssignment_0 ) )
                    {
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:491:1: ( ( rule__Event__NameAssignment_0 ) )
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:492:1: ( rule__Event__NameAssignment_0 )
                    {
                     before(grammarAccess.getEventAccess().getNameAssignment_0()); 
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:493:1: ( rule__Event__NameAssignment_0 )
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:493:2: rule__Event__NameAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Event__NameAssignment_0_in_rule__Event__Alternatives1006);
                    rule__Event__NameAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEventAccess().getNameAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:497:6: ( ( rule__Event__Group_1__0 ) )
                    {
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:497:6: ( ( rule__Event__Group_1__0 ) )
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:498:1: ( rule__Event__Group_1__0 )
                    {
                     before(grammarAccess.getEventAccess().getGroup_1()); 
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:499:1: ( rule__Event__Group_1__0 )
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:499:2: rule__Event__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Event__Group_1__0_in_rule__Event__Alternatives1024);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:508:1: rule__Event__LifeStateAlternatives_1_0_0 : ( ( RULE_CREATED ) | ( RULE_DETACHED ) | ( RULE_DISCHARGED ) | ( RULE_EXPIRED ) | ( RULE_VIOLATED ) );
    public final void rule__Event__LifeStateAlternatives_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:512:1: ( ( RULE_CREATED ) | ( RULE_DETACHED ) | ( RULE_DISCHARGED ) | ( RULE_EXPIRED ) | ( RULE_VIOLATED ) )
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
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:513:1: ( RULE_CREATED )
                    {
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:513:1: ( RULE_CREATED )
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:514:1: RULE_CREATED
                    {
                     before(grammarAccess.getEventAccess().getLifeStateCREATEDTerminalRuleCall_1_0_0_0()); 
                    match(input,RULE_CREATED,FOLLOW_RULE_CREATED_in_rule__Event__LifeStateAlternatives_1_0_01057); 
                     after(grammarAccess.getEventAccess().getLifeStateCREATEDTerminalRuleCall_1_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:519:6: ( RULE_DETACHED )
                    {
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:519:6: ( RULE_DETACHED )
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:520:1: RULE_DETACHED
                    {
                     before(grammarAccess.getEventAccess().getLifeStateDETACHEDTerminalRuleCall_1_0_0_1()); 
                    match(input,RULE_DETACHED,FOLLOW_RULE_DETACHED_in_rule__Event__LifeStateAlternatives_1_0_01074); 
                     after(grammarAccess.getEventAccess().getLifeStateDETACHEDTerminalRuleCall_1_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:525:6: ( RULE_DISCHARGED )
                    {
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:525:6: ( RULE_DISCHARGED )
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:526:1: RULE_DISCHARGED
                    {
                     before(grammarAccess.getEventAccess().getLifeStateDISCHARGEDTerminalRuleCall_1_0_0_2()); 
                    match(input,RULE_DISCHARGED,FOLLOW_RULE_DISCHARGED_in_rule__Event__LifeStateAlternatives_1_0_01091); 
                     after(grammarAccess.getEventAccess().getLifeStateDISCHARGEDTerminalRuleCall_1_0_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:531:6: ( RULE_EXPIRED )
                    {
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:531:6: ( RULE_EXPIRED )
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:532:1: RULE_EXPIRED
                    {
                     before(grammarAccess.getEventAccess().getLifeStateEXPIREDTerminalRuleCall_1_0_0_3()); 
                    match(input,RULE_EXPIRED,FOLLOW_RULE_EXPIRED_in_rule__Event__LifeStateAlternatives_1_0_01108); 
                     after(grammarAccess.getEventAccess().getLifeStateEXPIREDTerminalRuleCall_1_0_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:537:6: ( RULE_VIOLATED )
                    {
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:537:6: ( RULE_VIOLATED )
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:538:1: RULE_VIOLATED
                    {
                     before(grammarAccess.getEventAccess().getLifeStateVIOLATEDTerminalRuleCall_1_0_0_4()); 
                    match(input,RULE_VIOLATED,FOLLOW_RULE_VIOLATED_in_rule__Event__LifeStateAlternatives_1_0_01125); 
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


    // $ANTLR start "rule__TimeStamp__Alternatives"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:548:1: rule__TimeStamp__Alternatives : ( ( ( rule__TimeStamp__ValAssignment_0 ) ) | ( ( rule__TimeStamp__Group_1__0 ) ) );
    public final void rule__TimeStamp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:552:1: ( ( ( rule__TimeStamp__ValAssignment_0 ) ) | ( ( rule__TimeStamp__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:553:1: ( ( rule__TimeStamp__ValAssignment_0 ) )
                    {
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:553:1: ( ( rule__TimeStamp__ValAssignment_0 ) )
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:554:1: ( rule__TimeStamp__ValAssignment_0 )
                    {
                     before(grammarAccess.getTimeStampAccess().getValAssignment_0()); 
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:555:1: ( rule__TimeStamp__ValAssignment_0 )
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:555:2: rule__TimeStamp__ValAssignment_0
                    {
                    pushFollow(FOLLOW_rule__TimeStamp__ValAssignment_0_in_rule__TimeStamp__Alternatives1157);
                    rule__TimeStamp__ValAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTimeStampAccess().getValAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:559:6: ( ( rule__TimeStamp__Group_1__0 ) )
                    {
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:559:6: ( ( rule__TimeStamp__Group_1__0 ) )
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:560:1: ( rule__TimeStamp__Group_1__0 )
                    {
                     before(grammarAccess.getTimeStampAccess().getGroup_1()); 
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:561:1: ( rule__TimeStamp__Group_1__0 )
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:561:2: rule__TimeStamp__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__TimeStamp__Group_1__0_in_rule__TimeStamp__Alternatives1175);
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


    // $ANTLR start "rule__Cupido__Group__0"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:572:1: rule__Cupido__Group__0 : rule__Cupido__Group__0__Impl rule__Cupido__Group__1 ;
    public final void rule__Cupido__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:576:1: ( rule__Cupido__Group__0__Impl rule__Cupido__Group__1 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:577:2: rule__Cupido__Group__0__Impl rule__Cupido__Group__1
            {
            pushFollow(FOLLOW_rule__Cupido__Group__0__Impl_in_rule__Cupido__Group__01206);
            rule__Cupido__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Cupido__Group__1_in_rule__Cupido__Group__01209);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:584:1: rule__Cupido__Group__0__Impl : ( ruleSchemata ) ;
    public final void rule__Cupido__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:588:1: ( ( ruleSchemata ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:589:1: ( ruleSchemata )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:589:1: ( ruleSchemata )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:590:1: ruleSchemata
            {
             before(grammarAccess.getCupidoAccess().getSchemataParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleSchemata_in_rule__Cupido__Group__0__Impl1236);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:601:1: rule__Cupido__Group__1 : rule__Cupido__Group__1__Impl ;
    public final void rule__Cupido__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:605:1: ( rule__Cupido__Group__1__Impl )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:606:2: rule__Cupido__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Cupido__Group__1__Impl_in_rule__Cupido__Group__11265);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:612:1: rule__Cupido__Group__1__Impl : ( ( rule__Cupido__CommitmentsAssignment_1 )* ) ;
    public final void rule__Cupido__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:616:1: ( ( ( rule__Cupido__CommitmentsAssignment_1 )* ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:617:1: ( ( rule__Cupido__CommitmentsAssignment_1 )* )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:617:1: ( ( rule__Cupido__CommitmentsAssignment_1 )* )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:618:1: ( rule__Cupido__CommitmentsAssignment_1 )*
            {
             before(grammarAccess.getCupidoAccess().getCommitmentsAssignment_1()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:619:1: ( rule__Cupido__CommitmentsAssignment_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_COMMIT) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:619:2: rule__Cupido__CommitmentsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Cupido__CommitmentsAssignment_1_in_rule__Cupido__Group__1__Impl1292);
            	    rule__Cupido__CommitmentsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:633:1: rule__Schemata__Group__0 : rule__Schemata__Group__0__Impl rule__Schemata__Group__1 ;
    public final void rule__Schemata__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:637:1: ( rule__Schemata__Group__0__Impl rule__Schemata__Group__1 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:638:2: rule__Schemata__Group__0__Impl rule__Schemata__Group__1
            {
            pushFollow(FOLLOW_rule__Schemata__Group__0__Impl_in_rule__Schemata__Group__01327);
            rule__Schemata__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Schemata__Group__1_in_rule__Schemata__Group__01330);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:645:1: rule__Schemata__Group__0__Impl : ( RULE_SCHEMA ) ;
    public final void rule__Schemata__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:649:1: ( ( RULE_SCHEMA ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:650:1: ( RULE_SCHEMA )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:650:1: ( RULE_SCHEMA )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:651:1: RULE_SCHEMA
            {
             before(grammarAccess.getSchemataAccess().getSCHEMATerminalRuleCall_0()); 
            match(input,RULE_SCHEMA,FOLLOW_RULE_SCHEMA_in_rule__Schemata__Group__0__Impl1357); 
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:662:1: rule__Schemata__Group__1 : rule__Schemata__Group__1__Impl ;
    public final void rule__Schemata__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:666:1: ( rule__Schemata__Group__1__Impl )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:667:2: rule__Schemata__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Schemata__Group__1__Impl_in_rule__Schemata__Group__11386);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:673:1: rule__Schemata__Group__1__Impl : ( ( ( rule__Schemata__SchemataAssignment_1 ) ) ( ( rule__Schemata__SchemataAssignment_1 )* ) ) ;
    public final void rule__Schemata__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:677:1: ( ( ( ( rule__Schemata__SchemataAssignment_1 ) ) ( ( rule__Schemata__SchemataAssignment_1 )* ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:678:1: ( ( ( rule__Schemata__SchemataAssignment_1 ) ) ( ( rule__Schemata__SchemataAssignment_1 )* ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:678:1: ( ( ( rule__Schemata__SchemataAssignment_1 ) ) ( ( rule__Schemata__SchemataAssignment_1 )* ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:679:1: ( ( rule__Schemata__SchemataAssignment_1 ) ) ( ( rule__Schemata__SchemataAssignment_1 )* )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:679:1: ( ( rule__Schemata__SchemataAssignment_1 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:680:1: ( rule__Schemata__SchemataAssignment_1 )
            {
             before(grammarAccess.getSchemataAccess().getSchemataAssignment_1()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:681:1: ( rule__Schemata__SchemataAssignment_1 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:681:2: rule__Schemata__SchemataAssignment_1
            {
            pushFollow(FOLLOW_rule__Schemata__SchemataAssignment_1_in_rule__Schemata__Group__1__Impl1415);
            rule__Schemata__SchemataAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSchemataAccess().getSchemataAssignment_1()); 

            }

            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:684:1: ( ( rule__Schemata__SchemataAssignment_1 )* )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:685:1: ( rule__Schemata__SchemataAssignment_1 )*
            {
             before(grammarAccess.getSchemataAccess().getSchemataAssignment_1()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:686:1: ( rule__Schemata__SchemataAssignment_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_CREATED && LA7_0<=RULE_VIOLATED)||LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:686:2: rule__Schemata__SchemataAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Schemata__SchemataAssignment_1_in_rule__Schemata__Group__1__Impl1427);
            	    rule__Schemata__SchemataAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:701:1: rule__EventRelation__Group__0 : rule__EventRelation__Group__0__Impl rule__EventRelation__Group__1 ;
    public final void rule__EventRelation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:705:1: ( rule__EventRelation__Group__0__Impl rule__EventRelation__Group__1 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:706:2: rule__EventRelation__Group__0__Impl rule__EventRelation__Group__1
            {
            pushFollow(FOLLOW_rule__EventRelation__Group__0__Impl_in_rule__EventRelation__Group__01464);
            rule__EventRelation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EventRelation__Group__1_in_rule__EventRelation__Group__01467);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:713:1: rule__EventRelation__Group__0__Impl : ( ( rule__EventRelation__EventAssignment_0 ) ) ;
    public final void rule__EventRelation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:717:1: ( ( ( rule__EventRelation__EventAssignment_0 ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:718:1: ( ( rule__EventRelation__EventAssignment_0 ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:718:1: ( ( rule__EventRelation__EventAssignment_0 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:719:1: ( rule__EventRelation__EventAssignment_0 )
            {
             before(grammarAccess.getEventRelationAccess().getEventAssignment_0()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:720:1: ( rule__EventRelation__EventAssignment_0 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:720:2: rule__EventRelation__EventAssignment_0
            {
            pushFollow(FOLLOW_rule__EventRelation__EventAssignment_0_in_rule__EventRelation__Group__0__Impl1494);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:730:1: rule__EventRelation__Group__1 : rule__EventRelation__Group__1__Impl rule__EventRelation__Group__2 ;
    public final void rule__EventRelation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:734:1: ( rule__EventRelation__Group__1__Impl rule__EventRelation__Group__2 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:735:2: rule__EventRelation__Group__1__Impl rule__EventRelation__Group__2
            {
            pushFollow(FOLLOW_rule__EventRelation__Group__1__Impl_in_rule__EventRelation__Group__11524);
            rule__EventRelation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EventRelation__Group__2_in_rule__EventRelation__Group__11527);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:742:1: rule__EventRelation__Group__1__Impl : ( RULE_LPAREN ) ;
    public final void rule__EventRelation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:746:1: ( ( RULE_LPAREN ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:747:1: ( RULE_LPAREN )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:747:1: ( RULE_LPAREN )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:748:1: RULE_LPAREN
            {
             before(grammarAccess.getEventRelationAccess().getLPARENTerminalRuleCall_1()); 
            match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_rule__EventRelation__Group__1__Impl1554); 
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:759:1: rule__EventRelation__Group__2 : rule__EventRelation__Group__2__Impl rule__EventRelation__Group__3 ;
    public final void rule__EventRelation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:763:1: ( rule__EventRelation__Group__2__Impl rule__EventRelation__Group__3 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:764:2: rule__EventRelation__Group__2__Impl rule__EventRelation__Group__3
            {
            pushFollow(FOLLOW_rule__EventRelation__Group__2__Impl_in_rule__EventRelation__Group__21583);
            rule__EventRelation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EventRelation__Group__3_in_rule__EventRelation__Group__21586);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:771:1: rule__EventRelation__Group__2__Impl : ( ( rule__EventRelation__ParamsAssignment_2 ) ) ;
    public final void rule__EventRelation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:775:1: ( ( ( rule__EventRelation__ParamsAssignment_2 ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:776:1: ( ( rule__EventRelation__ParamsAssignment_2 ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:776:1: ( ( rule__EventRelation__ParamsAssignment_2 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:777:1: ( rule__EventRelation__ParamsAssignment_2 )
            {
             before(grammarAccess.getEventRelationAccess().getParamsAssignment_2()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:778:1: ( rule__EventRelation__ParamsAssignment_2 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:778:2: rule__EventRelation__ParamsAssignment_2
            {
            pushFollow(FOLLOW_rule__EventRelation__ParamsAssignment_2_in_rule__EventRelation__Group__2__Impl1613);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:788:1: rule__EventRelation__Group__3 : rule__EventRelation__Group__3__Impl rule__EventRelation__Group__4 ;
    public final void rule__EventRelation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:792:1: ( rule__EventRelation__Group__3__Impl rule__EventRelation__Group__4 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:793:2: rule__EventRelation__Group__3__Impl rule__EventRelation__Group__4
            {
            pushFollow(FOLLOW_rule__EventRelation__Group__3__Impl_in_rule__EventRelation__Group__31643);
            rule__EventRelation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EventRelation__Group__4_in_rule__EventRelation__Group__31646);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:800:1: rule__EventRelation__Group__3__Impl : ( ( rule__EventRelation__Group_3__0 )* ) ;
    public final void rule__EventRelation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:804:1: ( ( ( rule__EventRelation__Group_3__0 )* ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:805:1: ( ( rule__EventRelation__Group_3__0 )* )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:805:1: ( ( rule__EventRelation__Group_3__0 )* )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:806:1: ( rule__EventRelation__Group_3__0 )*
            {
             before(grammarAccess.getEventRelationAccess().getGroup_3()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:807:1: ( rule__EventRelation__Group_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_COMMA) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:807:2: rule__EventRelation__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__EventRelation__Group_3__0_in_rule__EventRelation__Group__3__Impl1673);
            	    rule__EventRelation__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:817:1: rule__EventRelation__Group__4 : rule__EventRelation__Group__4__Impl rule__EventRelation__Group__5 ;
    public final void rule__EventRelation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:821:1: ( rule__EventRelation__Group__4__Impl rule__EventRelation__Group__5 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:822:2: rule__EventRelation__Group__4__Impl rule__EventRelation__Group__5
            {
            pushFollow(FOLLOW_rule__EventRelation__Group__4__Impl_in_rule__EventRelation__Group__41704);
            rule__EventRelation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EventRelation__Group__5_in_rule__EventRelation__Group__41707);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:829:1: rule__EventRelation__Group__4__Impl : ( RULE_RPAREN ) ;
    public final void rule__EventRelation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:833:1: ( ( RULE_RPAREN ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:834:1: ( RULE_RPAREN )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:834:1: ( RULE_RPAREN )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:835:1: RULE_RPAREN
            {
             before(grammarAccess.getEventRelationAccess().getRPARENTerminalRuleCall_4()); 
            match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_rule__EventRelation__Group__4__Impl1734); 
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:846:1: rule__EventRelation__Group__5 : rule__EventRelation__Group__5__Impl rule__EventRelation__Group__6 ;
    public final void rule__EventRelation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:850:1: ( rule__EventRelation__Group__5__Impl rule__EventRelation__Group__6 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:851:2: rule__EventRelation__Group__5__Impl rule__EventRelation__Group__6
            {
            pushFollow(FOLLOW_rule__EventRelation__Group__5__Impl_in_rule__EventRelation__Group__51763);
            rule__EventRelation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EventRelation__Group__6_in_rule__EventRelation__Group__51766);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:858:1: rule__EventRelation__Group__5__Impl : ( RULE_KEY ) ;
    public final void rule__EventRelation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:862:1: ( ( RULE_KEY ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:863:1: ( RULE_KEY )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:863:1: ( RULE_KEY )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:864:1: RULE_KEY
            {
             before(grammarAccess.getEventRelationAccess().getKEYTerminalRuleCall_5()); 
            match(input,RULE_KEY,FOLLOW_RULE_KEY_in_rule__EventRelation__Group__5__Impl1793); 
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:875:1: rule__EventRelation__Group__6 : rule__EventRelation__Group__6__Impl rule__EventRelation__Group__7 ;
    public final void rule__EventRelation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:879:1: ( rule__EventRelation__Group__6__Impl rule__EventRelation__Group__7 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:880:2: rule__EventRelation__Group__6__Impl rule__EventRelation__Group__7
            {
            pushFollow(FOLLOW_rule__EventRelation__Group__6__Impl_in_rule__EventRelation__Group__61822);
            rule__EventRelation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EventRelation__Group__7_in_rule__EventRelation__Group__61825);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:887:1: rule__EventRelation__Group__6__Impl : ( ( rule__EventRelation__KeyParamsAssignment_6 ) ) ;
    public final void rule__EventRelation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:891:1: ( ( ( rule__EventRelation__KeyParamsAssignment_6 ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:892:1: ( ( rule__EventRelation__KeyParamsAssignment_6 ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:892:1: ( ( rule__EventRelation__KeyParamsAssignment_6 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:893:1: ( rule__EventRelation__KeyParamsAssignment_6 )
            {
             before(grammarAccess.getEventRelationAccess().getKeyParamsAssignment_6()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:894:1: ( rule__EventRelation__KeyParamsAssignment_6 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:894:2: rule__EventRelation__KeyParamsAssignment_6
            {
            pushFollow(FOLLOW_rule__EventRelation__KeyParamsAssignment_6_in_rule__EventRelation__Group__6__Impl1852);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:904:1: rule__EventRelation__Group__7 : rule__EventRelation__Group__7__Impl rule__EventRelation__Group__8 ;
    public final void rule__EventRelation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:908:1: ( rule__EventRelation__Group__7__Impl rule__EventRelation__Group__8 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:909:2: rule__EventRelation__Group__7__Impl rule__EventRelation__Group__8
            {
            pushFollow(FOLLOW_rule__EventRelation__Group__7__Impl_in_rule__EventRelation__Group__71882);
            rule__EventRelation__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EventRelation__Group__8_in_rule__EventRelation__Group__71885);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:916:1: rule__EventRelation__Group__7__Impl : ( ( rule__EventRelation__Group_7__0 )* ) ;
    public final void rule__EventRelation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:920:1: ( ( ( rule__EventRelation__Group_7__0 )* ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:921:1: ( ( rule__EventRelation__Group_7__0 )* )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:921:1: ( ( rule__EventRelation__Group_7__0 )* )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:922:1: ( rule__EventRelation__Group_7__0 )*
            {
             before(grammarAccess.getEventRelationAccess().getGroup_7()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:923:1: ( rule__EventRelation__Group_7__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_COMMA) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:923:2: rule__EventRelation__Group_7__0
            	    {
            	    pushFollow(FOLLOW_rule__EventRelation__Group_7__0_in_rule__EventRelation__Group__7__Impl1912);
            	    rule__EventRelation__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:933:1: rule__EventRelation__Group__8 : rule__EventRelation__Group__8__Impl rule__EventRelation__Group__9 ;
    public final void rule__EventRelation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:937:1: ( rule__EventRelation__Group__8__Impl rule__EventRelation__Group__9 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:938:2: rule__EventRelation__Group__8__Impl rule__EventRelation__Group__9
            {
            pushFollow(FOLLOW_rule__EventRelation__Group__8__Impl_in_rule__EventRelation__Group__81943);
            rule__EventRelation__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EventRelation__Group__9_in_rule__EventRelation__Group__81946);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:945:1: rule__EventRelation__Group__8__Impl : ( RULE_TIME ) ;
    public final void rule__EventRelation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:949:1: ( ( RULE_TIME ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:950:1: ( RULE_TIME )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:950:1: ( RULE_TIME )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:951:1: RULE_TIME
            {
             before(grammarAccess.getEventRelationAccess().getTIMETerminalRuleCall_8()); 
            match(input,RULE_TIME,FOLLOW_RULE_TIME_in_rule__EventRelation__Group__8__Impl1973); 
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:962:1: rule__EventRelation__Group__9 : rule__EventRelation__Group__9__Impl ;
    public final void rule__EventRelation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:966:1: ( rule__EventRelation__Group__9__Impl )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:967:2: rule__EventRelation__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__EventRelation__Group__9__Impl_in_rule__EventRelation__Group__92002);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:973:1: rule__EventRelation__Group__9__Impl : ( ( rule__EventRelation__TimeParamAssignment_9 ) ) ;
    public final void rule__EventRelation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:977:1: ( ( ( rule__EventRelation__TimeParamAssignment_9 ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:978:1: ( ( rule__EventRelation__TimeParamAssignment_9 ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:978:1: ( ( rule__EventRelation__TimeParamAssignment_9 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:979:1: ( rule__EventRelation__TimeParamAssignment_9 )
            {
             before(grammarAccess.getEventRelationAccess().getTimeParamAssignment_9()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:980:1: ( rule__EventRelation__TimeParamAssignment_9 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:980:2: rule__EventRelation__TimeParamAssignment_9
            {
            pushFollow(FOLLOW_rule__EventRelation__TimeParamAssignment_9_in_rule__EventRelation__Group__9__Impl2029);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1010:1: rule__EventRelation__Group_3__0 : rule__EventRelation__Group_3__0__Impl rule__EventRelation__Group_3__1 ;
    public final void rule__EventRelation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1014:1: ( rule__EventRelation__Group_3__0__Impl rule__EventRelation__Group_3__1 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1015:2: rule__EventRelation__Group_3__0__Impl rule__EventRelation__Group_3__1
            {
            pushFollow(FOLLOW_rule__EventRelation__Group_3__0__Impl_in_rule__EventRelation__Group_3__02079);
            rule__EventRelation__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EventRelation__Group_3__1_in_rule__EventRelation__Group_3__02082);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1022:1: rule__EventRelation__Group_3__0__Impl : ( RULE_COMMA ) ;
    public final void rule__EventRelation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1026:1: ( ( RULE_COMMA ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1027:1: ( RULE_COMMA )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1027:1: ( RULE_COMMA )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1028:1: RULE_COMMA
            {
             before(grammarAccess.getEventRelationAccess().getCOMMATerminalRuleCall_3_0()); 
            match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rule__EventRelation__Group_3__0__Impl2109); 
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1039:1: rule__EventRelation__Group_3__1 : rule__EventRelation__Group_3__1__Impl ;
    public final void rule__EventRelation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1043:1: ( rule__EventRelation__Group_3__1__Impl )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1044:2: rule__EventRelation__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__EventRelation__Group_3__1__Impl_in_rule__EventRelation__Group_3__12138);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1050:1: rule__EventRelation__Group_3__1__Impl : ( ( rule__EventRelation__ParamsAssignment_3_1 ) ) ;
    public final void rule__EventRelation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1054:1: ( ( ( rule__EventRelation__ParamsAssignment_3_1 ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1055:1: ( ( rule__EventRelation__ParamsAssignment_3_1 ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1055:1: ( ( rule__EventRelation__ParamsAssignment_3_1 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1056:1: ( rule__EventRelation__ParamsAssignment_3_1 )
            {
             before(grammarAccess.getEventRelationAccess().getParamsAssignment_3_1()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1057:1: ( rule__EventRelation__ParamsAssignment_3_1 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1057:2: rule__EventRelation__ParamsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__EventRelation__ParamsAssignment_3_1_in_rule__EventRelation__Group_3__1__Impl2165);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1071:1: rule__EventRelation__Group_7__0 : rule__EventRelation__Group_7__0__Impl rule__EventRelation__Group_7__1 ;
    public final void rule__EventRelation__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1075:1: ( rule__EventRelation__Group_7__0__Impl rule__EventRelation__Group_7__1 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1076:2: rule__EventRelation__Group_7__0__Impl rule__EventRelation__Group_7__1
            {
            pushFollow(FOLLOW_rule__EventRelation__Group_7__0__Impl_in_rule__EventRelation__Group_7__02199);
            rule__EventRelation__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EventRelation__Group_7__1_in_rule__EventRelation__Group_7__02202);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1083:1: rule__EventRelation__Group_7__0__Impl : ( RULE_COMMA ) ;
    public final void rule__EventRelation__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1087:1: ( ( RULE_COMMA ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1088:1: ( RULE_COMMA )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1088:1: ( RULE_COMMA )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1089:1: RULE_COMMA
            {
             before(grammarAccess.getEventRelationAccess().getCOMMATerminalRuleCall_7_0()); 
            match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rule__EventRelation__Group_7__0__Impl2229); 
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1100:1: rule__EventRelation__Group_7__1 : rule__EventRelation__Group_7__1__Impl ;
    public final void rule__EventRelation__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1104:1: ( rule__EventRelation__Group_7__1__Impl )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1105:2: rule__EventRelation__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__EventRelation__Group_7__1__Impl_in_rule__EventRelation__Group_7__12258);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1111:1: rule__EventRelation__Group_7__1__Impl : ( ( rule__EventRelation__KeyParamsAssignment_7_1 ) ) ;
    public final void rule__EventRelation__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1115:1: ( ( ( rule__EventRelation__KeyParamsAssignment_7_1 ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1116:1: ( ( rule__EventRelation__KeyParamsAssignment_7_1 ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1116:1: ( ( rule__EventRelation__KeyParamsAssignment_7_1 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1117:1: ( rule__EventRelation__KeyParamsAssignment_7_1 )
            {
             before(grammarAccess.getEventRelationAccess().getKeyParamsAssignment_7_1()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1118:1: ( rule__EventRelation__KeyParamsAssignment_7_1 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1118:2: rule__EventRelation__KeyParamsAssignment_7_1
            {
            pushFollow(FOLLOW_rule__EventRelation__KeyParamsAssignment_7_1_in_rule__EventRelation__Group_7__1__Impl2285);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1132:1: rule__Commitment__Group__0 : rule__Commitment__Group__0__Impl rule__Commitment__Group__1 ;
    public final void rule__Commitment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1136:1: ( rule__Commitment__Group__0__Impl rule__Commitment__Group__1 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1137:2: rule__Commitment__Group__0__Impl rule__Commitment__Group__1
            {
            pushFollow(FOLLOW_rule__Commitment__Group__0__Impl_in_rule__Commitment__Group__02319);
            rule__Commitment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Commitment__Group__1_in_rule__Commitment__Group__02322);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1144:1: rule__Commitment__Group__0__Impl : ( RULE_COMMIT ) ;
    public final void rule__Commitment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1148:1: ( ( RULE_COMMIT ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1149:1: ( RULE_COMMIT )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1149:1: ( RULE_COMMIT )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1150:1: RULE_COMMIT
            {
             before(grammarAccess.getCommitmentAccess().getCOMMITTerminalRuleCall_0()); 
            match(input,RULE_COMMIT,FOLLOW_RULE_COMMIT_in_rule__Commitment__Group__0__Impl2349); 
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1161:1: rule__Commitment__Group__1 : rule__Commitment__Group__1__Impl rule__Commitment__Group__2 ;
    public final void rule__Commitment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1165:1: ( rule__Commitment__Group__1__Impl rule__Commitment__Group__2 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1166:2: rule__Commitment__Group__1__Impl rule__Commitment__Group__2
            {
            pushFollow(FOLLOW_rule__Commitment__Group__1__Impl_in_rule__Commitment__Group__12378);
            rule__Commitment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Commitment__Group__2_in_rule__Commitment__Group__12381);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1173:1: rule__Commitment__Group__1__Impl : ( ( rule__Commitment__LabelAssignment_1 ) ) ;
    public final void rule__Commitment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1177:1: ( ( ( rule__Commitment__LabelAssignment_1 ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1178:1: ( ( rule__Commitment__LabelAssignment_1 ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1178:1: ( ( rule__Commitment__LabelAssignment_1 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1179:1: ( rule__Commitment__LabelAssignment_1 )
            {
             before(grammarAccess.getCommitmentAccess().getLabelAssignment_1()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1180:1: ( rule__Commitment__LabelAssignment_1 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1180:2: rule__Commitment__LabelAssignment_1
            {
            pushFollow(FOLLOW_rule__Commitment__LabelAssignment_1_in_rule__Commitment__Group__1__Impl2408);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1190:1: rule__Commitment__Group__2 : rule__Commitment__Group__2__Impl rule__Commitment__Group__3 ;
    public final void rule__Commitment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1194:1: ( rule__Commitment__Group__2__Impl rule__Commitment__Group__3 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1195:2: rule__Commitment__Group__2__Impl rule__Commitment__Group__3
            {
            pushFollow(FOLLOW_rule__Commitment__Group__2__Impl_in_rule__Commitment__Group__22438);
            rule__Commitment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Commitment__Group__3_in_rule__Commitment__Group__22441);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1202:1: rule__Commitment__Group__2__Impl : ( ( rule__Commitment__DebtorAssignment_2 ) ) ;
    public final void rule__Commitment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1206:1: ( ( ( rule__Commitment__DebtorAssignment_2 ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1207:1: ( ( rule__Commitment__DebtorAssignment_2 ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1207:1: ( ( rule__Commitment__DebtorAssignment_2 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1208:1: ( rule__Commitment__DebtorAssignment_2 )
            {
             before(grammarAccess.getCommitmentAccess().getDebtorAssignment_2()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1209:1: ( rule__Commitment__DebtorAssignment_2 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1209:2: rule__Commitment__DebtorAssignment_2
            {
            pushFollow(FOLLOW_rule__Commitment__DebtorAssignment_2_in_rule__Commitment__Group__2__Impl2468);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1219:1: rule__Commitment__Group__3 : rule__Commitment__Group__3__Impl rule__Commitment__Group__4 ;
    public final void rule__Commitment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1223:1: ( rule__Commitment__Group__3__Impl rule__Commitment__Group__4 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1224:2: rule__Commitment__Group__3__Impl rule__Commitment__Group__4
            {
            pushFollow(FOLLOW_rule__Commitment__Group__3__Impl_in_rule__Commitment__Group__32498);
            rule__Commitment__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Commitment__Group__4_in_rule__Commitment__Group__32501);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1231:1: rule__Commitment__Group__3__Impl : ( RULE_TO ) ;
    public final void rule__Commitment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1235:1: ( ( RULE_TO ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1236:1: ( RULE_TO )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1236:1: ( RULE_TO )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1237:1: RULE_TO
            {
             before(grammarAccess.getCommitmentAccess().getTOTerminalRuleCall_3()); 
            match(input,RULE_TO,FOLLOW_RULE_TO_in_rule__Commitment__Group__3__Impl2528); 
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1248:1: rule__Commitment__Group__4 : rule__Commitment__Group__4__Impl rule__Commitment__Group__5 ;
    public final void rule__Commitment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1252:1: ( rule__Commitment__Group__4__Impl rule__Commitment__Group__5 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1253:2: rule__Commitment__Group__4__Impl rule__Commitment__Group__5
            {
            pushFollow(FOLLOW_rule__Commitment__Group__4__Impl_in_rule__Commitment__Group__42557);
            rule__Commitment__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Commitment__Group__5_in_rule__Commitment__Group__42560);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1260:1: rule__Commitment__Group__4__Impl : ( ( rule__Commitment__CreditorAssignment_4 ) ) ;
    public final void rule__Commitment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1264:1: ( ( ( rule__Commitment__CreditorAssignment_4 ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1265:1: ( ( rule__Commitment__CreditorAssignment_4 ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1265:1: ( ( rule__Commitment__CreditorAssignment_4 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1266:1: ( rule__Commitment__CreditorAssignment_4 )
            {
             before(grammarAccess.getCommitmentAccess().getCreditorAssignment_4()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1267:1: ( rule__Commitment__CreditorAssignment_4 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1267:2: rule__Commitment__CreditorAssignment_4
            {
            pushFollow(FOLLOW_rule__Commitment__CreditorAssignment_4_in_rule__Commitment__Group__4__Impl2587);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1277:1: rule__Commitment__Group__5 : rule__Commitment__Group__5__Impl rule__Commitment__Group__6 ;
    public final void rule__Commitment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1281:1: ( rule__Commitment__Group__5__Impl rule__Commitment__Group__6 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1282:2: rule__Commitment__Group__5__Impl rule__Commitment__Group__6
            {
            pushFollow(FOLLOW_rule__Commitment__Group__5__Impl_in_rule__Commitment__Group__52617);
            rule__Commitment__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Commitment__Group__6_in_rule__Commitment__Group__52620);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1289:1: rule__Commitment__Group__5__Impl : ( RULE_CREATE ) ;
    public final void rule__Commitment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1293:1: ( ( RULE_CREATE ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1294:1: ( RULE_CREATE )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1294:1: ( RULE_CREATE )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1295:1: RULE_CREATE
            {
             before(grammarAccess.getCommitmentAccess().getCREATETerminalRuleCall_5()); 
            match(input,RULE_CREATE,FOLLOW_RULE_CREATE_in_rule__Commitment__Group__5__Impl2647); 
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1306:1: rule__Commitment__Group__6 : rule__Commitment__Group__6__Impl rule__Commitment__Group__7 ;
    public final void rule__Commitment__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1310:1: ( rule__Commitment__Group__6__Impl rule__Commitment__Group__7 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1311:2: rule__Commitment__Group__6__Impl rule__Commitment__Group__7
            {
            pushFollow(FOLLOW_rule__Commitment__Group__6__Impl_in_rule__Commitment__Group__62676);
            rule__Commitment__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Commitment__Group__7_in_rule__Commitment__Group__62679);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1318:1: rule__Commitment__Group__6__Impl : ( ( rule__Commitment__TriggerAssignment_6 ) ) ;
    public final void rule__Commitment__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1322:1: ( ( ( rule__Commitment__TriggerAssignment_6 ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1323:1: ( ( rule__Commitment__TriggerAssignment_6 ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1323:1: ( ( rule__Commitment__TriggerAssignment_6 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1324:1: ( rule__Commitment__TriggerAssignment_6 )
            {
             before(grammarAccess.getCommitmentAccess().getTriggerAssignment_6()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1325:1: ( rule__Commitment__TriggerAssignment_6 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1325:2: rule__Commitment__TriggerAssignment_6
            {
            pushFollow(FOLLOW_rule__Commitment__TriggerAssignment_6_in_rule__Commitment__Group__6__Impl2706);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1335:1: rule__Commitment__Group__7 : rule__Commitment__Group__7__Impl rule__Commitment__Group__8 ;
    public final void rule__Commitment__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1339:1: ( rule__Commitment__Group__7__Impl rule__Commitment__Group__8 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1340:2: rule__Commitment__Group__7__Impl rule__Commitment__Group__8
            {
            pushFollow(FOLLOW_rule__Commitment__Group__7__Impl_in_rule__Commitment__Group__72736);
            rule__Commitment__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Commitment__Group__8_in_rule__Commitment__Group__72739);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1347:1: rule__Commitment__Group__7__Impl : ( ( rule__Commitment__Group_7__0 )? ) ;
    public final void rule__Commitment__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1351:1: ( ( ( rule__Commitment__Group_7__0 )? ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1352:1: ( ( rule__Commitment__Group_7__0 )? )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1352:1: ( ( rule__Commitment__Group_7__0 )? )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1353:1: ( rule__Commitment__Group_7__0 )?
            {
             before(grammarAccess.getCommitmentAccess().getGroup_7()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1354:1: ( rule__Commitment__Group_7__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_DETACH) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1354:2: rule__Commitment__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Commitment__Group_7__0_in_rule__Commitment__Group__7__Impl2766);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1364:1: rule__Commitment__Group__8 : rule__Commitment__Group__8__Impl rule__Commitment__Group__9 ;
    public final void rule__Commitment__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1368:1: ( rule__Commitment__Group__8__Impl rule__Commitment__Group__9 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1369:2: rule__Commitment__Group__8__Impl rule__Commitment__Group__9
            {
            pushFollow(FOLLOW_rule__Commitment__Group__8__Impl_in_rule__Commitment__Group__82797);
            rule__Commitment__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Commitment__Group__9_in_rule__Commitment__Group__82800);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1376:1: rule__Commitment__Group__8__Impl : ( RULE_DISCHARGE ) ;
    public final void rule__Commitment__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1380:1: ( ( RULE_DISCHARGE ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1381:1: ( RULE_DISCHARGE )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1381:1: ( RULE_DISCHARGE )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1382:1: RULE_DISCHARGE
            {
             before(grammarAccess.getCommitmentAccess().getDISCHARGETerminalRuleCall_8()); 
            match(input,RULE_DISCHARGE,FOLLOW_RULE_DISCHARGE_in_rule__Commitment__Group__8__Impl2827); 
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1393:1: rule__Commitment__Group__9 : rule__Commitment__Group__9__Impl ;
    public final void rule__Commitment__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1397:1: ( rule__Commitment__Group__9__Impl )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1398:2: rule__Commitment__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__Commitment__Group__9__Impl_in_rule__Commitment__Group__92856);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1404:1: rule__Commitment__Group__9__Impl : ( ( rule__Commitment__ConsequentAssignment_9 ) ) ;
    public final void rule__Commitment__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1408:1: ( ( ( rule__Commitment__ConsequentAssignment_9 ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1409:1: ( ( rule__Commitment__ConsequentAssignment_9 ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1409:1: ( ( rule__Commitment__ConsequentAssignment_9 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1410:1: ( rule__Commitment__ConsequentAssignment_9 )
            {
             before(grammarAccess.getCommitmentAccess().getConsequentAssignment_9()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1411:1: ( rule__Commitment__ConsequentAssignment_9 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1411:2: rule__Commitment__ConsequentAssignment_9
            {
            pushFollow(FOLLOW_rule__Commitment__ConsequentAssignment_9_in_rule__Commitment__Group__9__Impl2883);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1441:1: rule__Commitment__Group_7__0 : rule__Commitment__Group_7__0__Impl rule__Commitment__Group_7__1 ;
    public final void rule__Commitment__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1445:1: ( rule__Commitment__Group_7__0__Impl rule__Commitment__Group_7__1 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1446:2: rule__Commitment__Group_7__0__Impl rule__Commitment__Group_7__1
            {
            pushFollow(FOLLOW_rule__Commitment__Group_7__0__Impl_in_rule__Commitment__Group_7__02933);
            rule__Commitment__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Commitment__Group_7__1_in_rule__Commitment__Group_7__02936);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1453:1: rule__Commitment__Group_7__0__Impl : ( RULE_DETACH ) ;
    public final void rule__Commitment__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1457:1: ( ( RULE_DETACH ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1458:1: ( RULE_DETACH )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1458:1: ( RULE_DETACH )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1459:1: RULE_DETACH
            {
             before(grammarAccess.getCommitmentAccess().getDETACHTerminalRuleCall_7_0()); 
            match(input,RULE_DETACH,FOLLOW_RULE_DETACH_in_rule__Commitment__Group_7__0__Impl2963); 
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1470:1: rule__Commitment__Group_7__1 : rule__Commitment__Group_7__1__Impl ;
    public final void rule__Commitment__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1474:1: ( rule__Commitment__Group_7__1__Impl )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1475:2: rule__Commitment__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__Commitment__Group_7__1__Impl_in_rule__Commitment__Group_7__12992);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1481:1: rule__Commitment__Group_7__1__Impl : ( ( rule__Commitment__AntecedentAssignment_7_1 ) ) ;
    public final void rule__Commitment__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1485:1: ( ( ( rule__Commitment__AntecedentAssignment_7_1 ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1486:1: ( ( rule__Commitment__AntecedentAssignment_7_1 ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1486:1: ( ( rule__Commitment__AntecedentAssignment_7_1 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1487:1: ( rule__Commitment__AntecedentAssignment_7_1 )
            {
             before(grammarAccess.getCommitmentAccess().getAntecedentAssignment_7_1()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1488:1: ( rule__Commitment__AntecedentAssignment_7_1 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1488:2: rule__Commitment__AntecedentAssignment_7_1
            {
            pushFollow(FOLLOW_rule__Commitment__AntecedentAssignment_7_1_in_rule__Commitment__Group_7__1__Impl3019);
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


    // $ANTLR start "rule__EExpr__Group__0"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1502:1: rule__EExpr__Group__0 : rule__EExpr__Group__0__Impl rule__EExpr__Group__1 ;
    public final void rule__EExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1506:1: ( rule__EExpr__Group__0__Impl rule__EExpr__Group__1 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1507:2: rule__EExpr__Group__0__Impl rule__EExpr__Group__1
            {
            pushFollow(FOLLOW_rule__EExpr__Group__0__Impl_in_rule__EExpr__Group__03053);
            rule__EExpr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EExpr__Group__1_in_rule__EExpr__Group__03056);
            rule__EExpr__Group__1();

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
    // $ANTLR end "rule__EExpr__Group__0"


    // $ANTLR start "rule__EExpr__Group__0__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1514:1: rule__EExpr__Group__0__Impl : ( ruleOExpr ) ;
    public final void rule__EExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1518:1: ( ( ruleOExpr ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1519:1: ( ruleOExpr )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1519:1: ( ruleOExpr )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1520:1: ruleOExpr
            {
             before(grammarAccess.getEExprAccess().getOExprParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleOExpr_in_rule__EExpr__Group__0__Impl3083);
            ruleOExpr();

            state._fsp--;

             after(grammarAccess.getEExprAccess().getOExprParserRuleCall_0()); 

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
    // $ANTLR end "rule__EExpr__Group__0__Impl"


    // $ANTLR start "rule__EExpr__Group__1"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1531:1: rule__EExpr__Group__1 : rule__EExpr__Group__1__Impl ;
    public final void rule__EExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1535:1: ( rule__EExpr__Group__1__Impl )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1536:2: rule__EExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EExpr__Group__1__Impl_in_rule__EExpr__Group__13112);
            rule__EExpr__Group__1__Impl();

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
    // $ANTLR end "rule__EExpr__Group__1"


    // $ANTLR start "rule__EExpr__Group__1__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1542:1: rule__EExpr__Group__1__Impl : ( ( rule__EExpr__Group_1__0 )* ) ;
    public final void rule__EExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1546:1: ( ( ( rule__EExpr__Group_1__0 )* ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1547:1: ( ( rule__EExpr__Group_1__0 )* )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1547:1: ( ( rule__EExpr__Group_1__0 )* )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1548:1: ( rule__EExpr__Group_1__0 )*
            {
             before(grammarAccess.getEExprAccess().getGroup_1()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1549:1: ( rule__EExpr__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_EXCEPT) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1549:2: rule__EExpr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__EExpr__Group_1__0_in_rule__EExpr__Group__1__Impl3139);
            	    rule__EExpr__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getEExprAccess().getGroup_1()); 

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
    // $ANTLR end "rule__EExpr__Group__1__Impl"


    // $ANTLR start "rule__EExpr__Group_1__0"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1563:1: rule__EExpr__Group_1__0 : rule__EExpr__Group_1__0__Impl rule__EExpr__Group_1__1 ;
    public final void rule__EExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1567:1: ( rule__EExpr__Group_1__0__Impl rule__EExpr__Group_1__1 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1568:2: rule__EExpr__Group_1__0__Impl rule__EExpr__Group_1__1
            {
            pushFollow(FOLLOW_rule__EExpr__Group_1__0__Impl_in_rule__EExpr__Group_1__03174);
            rule__EExpr__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EExpr__Group_1__1_in_rule__EExpr__Group_1__03177);
            rule__EExpr__Group_1__1();

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
    // $ANTLR end "rule__EExpr__Group_1__0"


    // $ANTLR start "rule__EExpr__Group_1__0__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1575:1: rule__EExpr__Group_1__0__Impl : ( () ) ;
    public final void rule__EExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1579:1: ( ( () ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1580:1: ( () )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1580:1: ( () )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1581:1: ()
            {
             before(grammarAccess.getEExprAccess().getEExprLeftAction_1_0()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1582:1: ()
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1584:1: 
            {
            }

             after(grammarAccess.getEExprAccess().getEExprLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EExpr__Group_1__0__Impl"


    // $ANTLR start "rule__EExpr__Group_1__1"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1594:1: rule__EExpr__Group_1__1 : rule__EExpr__Group_1__1__Impl rule__EExpr__Group_1__2 ;
    public final void rule__EExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1598:1: ( rule__EExpr__Group_1__1__Impl rule__EExpr__Group_1__2 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1599:2: rule__EExpr__Group_1__1__Impl rule__EExpr__Group_1__2
            {
            pushFollow(FOLLOW_rule__EExpr__Group_1__1__Impl_in_rule__EExpr__Group_1__13235);
            rule__EExpr__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EExpr__Group_1__2_in_rule__EExpr__Group_1__13238);
            rule__EExpr__Group_1__2();

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
    // $ANTLR end "rule__EExpr__Group_1__1"


    // $ANTLR start "rule__EExpr__Group_1__1__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1606:1: rule__EExpr__Group_1__1__Impl : ( RULE_EXCEPT ) ;
    public final void rule__EExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1610:1: ( ( RULE_EXCEPT ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1611:1: ( RULE_EXCEPT )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1611:1: ( RULE_EXCEPT )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1612:1: RULE_EXCEPT
            {
             before(grammarAccess.getEExprAccess().getEXCEPTTerminalRuleCall_1_1()); 
            match(input,RULE_EXCEPT,FOLLOW_RULE_EXCEPT_in_rule__EExpr__Group_1__1__Impl3265); 
             after(grammarAccess.getEExprAccess().getEXCEPTTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__EExpr__Group_1__1__Impl"


    // $ANTLR start "rule__EExpr__Group_1__2"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1623:1: rule__EExpr__Group_1__2 : rule__EExpr__Group_1__2__Impl ;
    public final void rule__EExpr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1627:1: ( rule__EExpr__Group_1__2__Impl )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1628:2: rule__EExpr__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__EExpr__Group_1__2__Impl_in_rule__EExpr__Group_1__23294);
            rule__EExpr__Group_1__2__Impl();

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
    // $ANTLR end "rule__EExpr__Group_1__2"


    // $ANTLR start "rule__EExpr__Group_1__2__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1634:1: rule__EExpr__Group_1__2__Impl : ( ( rule__EExpr__RightAssignment_1_2 ) ) ;
    public final void rule__EExpr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1638:1: ( ( ( rule__EExpr__RightAssignment_1_2 ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1639:1: ( ( rule__EExpr__RightAssignment_1_2 ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1639:1: ( ( rule__EExpr__RightAssignment_1_2 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1640:1: ( rule__EExpr__RightAssignment_1_2 )
            {
             before(grammarAccess.getEExprAccess().getRightAssignment_1_2()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1641:1: ( rule__EExpr__RightAssignment_1_2 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1641:2: rule__EExpr__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__EExpr__RightAssignment_1_2_in_rule__EExpr__Group_1__2__Impl3321);
            rule__EExpr__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getEExprAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__EExpr__Group_1__2__Impl"


    // $ANTLR start "rule__OExpr__Group__0"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1657:1: rule__OExpr__Group__0 : rule__OExpr__Group__0__Impl rule__OExpr__Group__1 ;
    public final void rule__OExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1661:1: ( rule__OExpr__Group__0__Impl rule__OExpr__Group__1 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1662:2: rule__OExpr__Group__0__Impl rule__OExpr__Group__1
            {
            pushFollow(FOLLOW_rule__OExpr__Group__0__Impl_in_rule__OExpr__Group__03357);
            rule__OExpr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OExpr__Group__1_in_rule__OExpr__Group__03360);
            rule__OExpr__Group__1();

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
    // $ANTLR end "rule__OExpr__Group__0"


    // $ANTLR start "rule__OExpr__Group__0__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1669:1: rule__OExpr__Group__0__Impl : ( ruleAExpr ) ;
    public final void rule__OExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1673:1: ( ( ruleAExpr ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1674:1: ( ruleAExpr )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1674:1: ( ruleAExpr )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1675:1: ruleAExpr
            {
             before(grammarAccess.getOExprAccess().getAExprParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAExpr_in_rule__OExpr__Group__0__Impl3387);
            ruleAExpr();

            state._fsp--;

             after(grammarAccess.getOExprAccess().getAExprParserRuleCall_0()); 

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
    // $ANTLR end "rule__OExpr__Group__0__Impl"


    // $ANTLR start "rule__OExpr__Group__1"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1686:1: rule__OExpr__Group__1 : rule__OExpr__Group__1__Impl ;
    public final void rule__OExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1690:1: ( rule__OExpr__Group__1__Impl )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1691:2: rule__OExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__OExpr__Group__1__Impl_in_rule__OExpr__Group__13416);
            rule__OExpr__Group__1__Impl();

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
    // $ANTLR end "rule__OExpr__Group__1"


    // $ANTLR start "rule__OExpr__Group__1__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1697:1: rule__OExpr__Group__1__Impl : ( ( rule__OExpr__Group_1__0 )* ) ;
    public final void rule__OExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1701:1: ( ( ( rule__OExpr__Group_1__0 )* ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1702:1: ( ( rule__OExpr__Group_1__0 )* )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1702:1: ( ( rule__OExpr__Group_1__0 )* )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1703:1: ( rule__OExpr__Group_1__0 )*
            {
             before(grammarAccess.getOExprAccess().getGroup_1()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1704:1: ( rule__OExpr__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_OR) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1704:2: rule__OExpr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__OExpr__Group_1__0_in_rule__OExpr__Group__1__Impl3443);
            	    rule__OExpr__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getOExprAccess().getGroup_1()); 

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
    // $ANTLR end "rule__OExpr__Group__1__Impl"


    // $ANTLR start "rule__OExpr__Group_1__0"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1718:1: rule__OExpr__Group_1__0 : rule__OExpr__Group_1__0__Impl rule__OExpr__Group_1__1 ;
    public final void rule__OExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1722:1: ( rule__OExpr__Group_1__0__Impl rule__OExpr__Group_1__1 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1723:2: rule__OExpr__Group_1__0__Impl rule__OExpr__Group_1__1
            {
            pushFollow(FOLLOW_rule__OExpr__Group_1__0__Impl_in_rule__OExpr__Group_1__03478);
            rule__OExpr__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OExpr__Group_1__1_in_rule__OExpr__Group_1__03481);
            rule__OExpr__Group_1__1();

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
    // $ANTLR end "rule__OExpr__Group_1__0"


    // $ANTLR start "rule__OExpr__Group_1__0__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1730:1: rule__OExpr__Group_1__0__Impl : ( () ) ;
    public final void rule__OExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1734:1: ( ( () ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1735:1: ( () )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1735:1: ( () )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1736:1: ()
            {
             before(grammarAccess.getOExprAccess().getOExprLeftAction_1_0()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1737:1: ()
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1739:1: 
            {
            }

             after(grammarAccess.getOExprAccess().getOExprLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OExpr__Group_1__0__Impl"


    // $ANTLR start "rule__OExpr__Group_1__1"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1749:1: rule__OExpr__Group_1__1 : rule__OExpr__Group_1__1__Impl rule__OExpr__Group_1__2 ;
    public final void rule__OExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1753:1: ( rule__OExpr__Group_1__1__Impl rule__OExpr__Group_1__2 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1754:2: rule__OExpr__Group_1__1__Impl rule__OExpr__Group_1__2
            {
            pushFollow(FOLLOW_rule__OExpr__Group_1__1__Impl_in_rule__OExpr__Group_1__13539);
            rule__OExpr__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OExpr__Group_1__2_in_rule__OExpr__Group_1__13542);
            rule__OExpr__Group_1__2();

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
    // $ANTLR end "rule__OExpr__Group_1__1"


    // $ANTLR start "rule__OExpr__Group_1__1__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1761:1: rule__OExpr__Group_1__1__Impl : ( RULE_OR ) ;
    public final void rule__OExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1765:1: ( ( RULE_OR ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1766:1: ( RULE_OR )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1766:1: ( RULE_OR )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1767:1: RULE_OR
            {
             before(grammarAccess.getOExprAccess().getORTerminalRuleCall_1_1()); 
            match(input,RULE_OR,FOLLOW_RULE_OR_in_rule__OExpr__Group_1__1__Impl3569); 
             after(grammarAccess.getOExprAccess().getORTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__OExpr__Group_1__1__Impl"


    // $ANTLR start "rule__OExpr__Group_1__2"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1778:1: rule__OExpr__Group_1__2 : rule__OExpr__Group_1__2__Impl ;
    public final void rule__OExpr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1782:1: ( rule__OExpr__Group_1__2__Impl )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1783:2: rule__OExpr__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__OExpr__Group_1__2__Impl_in_rule__OExpr__Group_1__23598);
            rule__OExpr__Group_1__2__Impl();

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
    // $ANTLR end "rule__OExpr__Group_1__2"


    // $ANTLR start "rule__OExpr__Group_1__2__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1789:1: rule__OExpr__Group_1__2__Impl : ( ( rule__OExpr__RightAssignment_1_2 ) ) ;
    public final void rule__OExpr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1793:1: ( ( ( rule__OExpr__RightAssignment_1_2 ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1794:1: ( ( rule__OExpr__RightAssignment_1_2 ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1794:1: ( ( rule__OExpr__RightAssignment_1_2 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1795:1: ( rule__OExpr__RightAssignment_1_2 )
            {
             before(grammarAccess.getOExprAccess().getRightAssignment_1_2()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1796:1: ( rule__OExpr__RightAssignment_1_2 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1796:2: rule__OExpr__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__OExpr__RightAssignment_1_2_in_rule__OExpr__Group_1__2__Impl3625);
            rule__OExpr__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getOExprAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__OExpr__Group_1__2__Impl"


    // $ANTLR start "rule__AExpr__Group__0"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1812:1: rule__AExpr__Group__0 : rule__AExpr__Group__0__Impl rule__AExpr__Group__1 ;
    public final void rule__AExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1816:1: ( rule__AExpr__Group__0__Impl rule__AExpr__Group__1 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1817:2: rule__AExpr__Group__0__Impl rule__AExpr__Group__1
            {
            pushFollow(FOLLOW_rule__AExpr__Group__0__Impl_in_rule__AExpr__Group__03661);
            rule__AExpr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AExpr__Group__1_in_rule__AExpr__Group__03664);
            rule__AExpr__Group__1();

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
    // $ANTLR end "rule__AExpr__Group__0"


    // $ANTLR start "rule__AExpr__Group__0__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1824:1: rule__AExpr__Group__0__Impl : ( ruleWExpr ) ;
    public final void rule__AExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1828:1: ( ( ruleWExpr ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1829:1: ( ruleWExpr )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1829:1: ( ruleWExpr )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1830:1: ruleWExpr
            {
             before(grammarAccess.getAExprAccess().getWExprParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleWExpr_in_rule__AExpr__Group__0__Impl3691);
            ruleWExpr();

            state._fsp--;

             after(grammarAccess.getAExprAccess().getWExprParserRuleCall_0()); 

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
    // $ANTLR end "rule__AExpr__Group__0__Impl"


    // $ANTLR start "rule__AExpr__Group__1"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1841:1: rule__AExpr__Group__1 : rule__AExpr__Group__1__Impl ;
    public final void rule__AExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1845:1: ( rule__AExpr__Group__1__Impl )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1846:2: rule__AExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AExpr__Group__1__Impl_in_rule__AExpr__Group__13720);
            rule__AExpr__Group__1__Impl();

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
    // $ANTLR end "rule__AExpr__Group__1"


    // $ANTLR start "rule__AExpr__Group__1__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1852:1: rule__AExpr__Group__1__Impl : ( ( rule__AExpr__Group_1__0 )* ) ;
    public final void rule__AExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1856:1: ( ( ( rule__AExpr__Group_1__0 )* ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1857:1: ( ( rule__AExpr__Group_1__0 )* )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1857:1: ( ( rule__AExpr__Group_1__0 )* )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1858:1: ( rule__AExpr__Group_1__0 )*
            {
             before(grammarAccess.getAExprAccess().getGroup_1()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1859:1: ( rule__AExpr__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_AND) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1859:2: rule__AExpr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AExpr__Group_1__0_in_rule__AExpr__Group__1__Impl3747);
            	    rule__AExpr__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getAExprAccess().getGroup_1()); 

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
    // $ANTLR end "rule__AExpr__Group__1__Impl"


    // $ANTLR start "rule__AExpr__Group_1__0"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1873:1: rule__AExpr__Group_1__0 : rule__AExpr__Group_1__0__Impl rule__AExpr__Group_1__1 ;
    public final void rule__AExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1877:1: ( rule__AExpr__Group_1__0__Impl rule__AExpr__Group_1__1 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1878:2: rule__AExpr__Group_1__0__Impl rule__AExpr__Group_1__1
            {
            pushFollow(FOLLOW_rule__AExpr__Group_1__0__Impl_in_rule__AExpr__Group_1__03782);
            rule__AExpr__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AExpr__Group_1__1_in_rule__AExpr__Group_1__03785);
            rule__AExpr__Group_1__1();

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
    // $ANTLR end "rule__AExpr__Group_1__0"


    // $ANTLR start "rule__AExpr__Group_1__0__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1885:1: rule__AExpr__Group_1__0__Impl : ( () ) ;
    public final void rule__AExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1889:1: ( ( () ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1890:1: ( () )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1890:1: ( () )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1891:1: ()
            {
             before(grammarAccess.getAExprAccess().getAExprLeftAction_1_0()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1892:1: ()
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1894:1: 
            {
            }

             after(grammarAccess.getAExprAccess().getAExprLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AExpr__Group_1__0__Impl"


    // $ANTLR start "rule__AExpr__Group_1__1"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1904:1: rule__AExpr__Group_1__1 : rule__AExpr__Group_1__1__Impl rule__AExpr__Group_1__2 ;
    public final void rule__AExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1908:1: ( rule__AExpr__Group_1__1__Impl rule__AExpr__Group_1__2 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1909:2: rule__AExpr__Group_1__1__Impl rule__AExpr__Group_1__2
            {
            pushFollow(FOLLOW_rule__AExpr__Group_1__1__Impl_in_rule__AExpr__Group_1__13843);
            rule__AExpr__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AExpr__Group_1__2_in_rule__AExpr__Group_1__13846);
            rule__AExpr__Group_1__2();

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
    // $ANTLR end "rule__AExpr__Group_1__1"


    // $ANTLR start "rule__AExpr__Group_1__1__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1916:1: rule__AExpr__Group_1__1__Impl : ( RULE_AND ) ;
    public final void rule__AExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1920:1: ( ( RULE_AND ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1921:1: ( RULE_AND )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1921:1: ( RULE_AND )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1922:1: RULE_AND
            {
             before(grammarAccess.getAExprAccess().getANDTerminalRuleCall_1_1()); 
            match(input,RULE_AND,FOLLOW_RULE_AND_in_rule__AExpr__Group_1__1__Impl3873); 
             after(grammarAccess.getAExprAccess().getANDTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__AExpr__Group_1__1__Impl"


    // $ANTLR start "rule__AExpr__Group_1__2"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1933:1: rule__AExpr__Group_1__2 : rule__AExpr__Group_1__2__Impl ;
    public final void rule__AExpr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1937:1: ( rule__AExpr__Group_1__2__Impl )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1938:2: rule__AExpr__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__AExpr__Group_1__2__Impl_in_rule__AExpr__Group_1__23902);
            rule__AExpr__Group_1__2__Impl();

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
    // $ANTLR end "rule__AExpr__Group_1__2"


    // $ANTLR start "rule__AExpr__Group_1__2__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1944:1: rule__AExpr__Group_1__2__Impl : ( ( rule__AExpr__RightAssignment_1_2 ) ) ;
    public final void rule__AExpr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1948:1: ( ( ( rule__AExpr__RightAssignment_1_2 ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1949:1: ( ( rule__AExpr__RightAssignment_1_2 ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1949:1: ( ( rule__AExpr__RightAssignment_1_2 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1950:1: ( rule__AExpr__RightAssignment_1_2 )
            {
             before(grammarAccess.getAExprAccess().getRightAssignment_1_2()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1951:1: ( rule__AExpr__RightAssignment_1_2 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1951:2: rule__AExpr__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__AExpr__RightAssignment_1_2_in_rule__AExpr__Group_1__2__Impl3929);
            rule__AExpr__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAExprAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__AExpr__Group_1__2__Impl"


    // $ANTLR start "rule__WExpr__Group__0"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1967:1: rule__WExpr__Group__0 : rule__WExpr__Group__0__Impl rule__WExpr__Group__1 ;
    public final void rule__WExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1971:1: ( rule__WExpr__Group__0__Impl rule__WExpr__Group__1 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1972:2: rule__WExpr__Group__0__Impl rule__WExpr__Group__1
            {
            pushFollow(FOLLOW_rule__WExpr__Group__0__Impl_in_rule__WExpr__Group__03965);
            rule__WExpr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WExpr__Group__1_in_rule__WExpr__Group__03968);
            rule__WExpr__Group__1();

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
    // $ANTLR end "rule__WExpr__Group__0"


    // $ANTLR start "rule__WExpr__Group__0__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1979:1: rule__WExpr__Group__0__Impl : ( ruleBExpr ) ;
    public final void rule__WExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1983:1: ( ( ruleBExpr ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1984:1: ( ruleBExpr )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1984:1: ( ruleBExpr )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1985:1: ruleBExpr
            {
             before(grammarAccess.getWExprAccess().getBExprParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleBExpr_in_rule__WExpr__Group__0__Impl3995);
            ruleBExpr();

            state._fsp--;

             after(grammarAccess.getWExprAccess().getBExprParserRuleCall_0()); 

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
    // $ANTLR end "rule__WExpr__Group__0__Impl"


    // $ANTLR start "rule__WExpr__Group__1"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:1996:1: rule__WExpr__Group__1 : rule__WExpr__Group__1__Impl ;
    public final void rule__WExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2000:1: ( rule__WExpr__Group__1__Impl )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2001:2: rule__WExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__WExpr__Group__1__Impl_in_rule__WExpr__Group__14024);
            rule__WExpr__Group__1__Impl();

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
    // $ANTLR end "rule__WExpr__Group__1"


    // $ANTLR start "rule__WExpr__Group__1__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2007:1: rule__WExpr__Group__1__Impl : ( ( rule__WExpr__Group_1__0 )* ) ;
    public final void rule__WExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2011:1: ( ( ( rule__WExpr__Group_1__0 )* ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2012:1: ( ( rule__WExpr__Group_1__0 )* )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2012:1: ( ( rule__WExpr__Group_1__0 )* )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2013:1: ( rule__WExpr__Group_1__0 )*
            {
             before(grammarAccess.getWExprAccess().getGroup_1()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2014:1: ( rule__WExpr__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_WHERE) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2014:2: rule__WExpr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__WExpr__Group_1__0_in_rule__WExpr__Group__1__Impl4051);
            	    rule__WExpr__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getWExprAccess().getGroup_1()); 

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
    // $ANTLR end "rule__WExpr__Group__1__Impl"


    // $ANTLR start "rule__WExpr__Group_1__0"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2028:1: rule__WExpr__Group_1__0 : rule__WExpr__Group_1__0__Impl rule__WExpr__Group_1__1 ;
    public final void rule__WExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2032:1: ( rule__WExpr__Group_1__0__Impl rule__WExpr__Group_1__1 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2033:2: rule__WExpr__Group_1__0__Impl rule__WExpr__Group_1__1
            {
            pushFollow(FOLLOW_rule__WExpr__Group_1__0__Impl_in_rule__WExpr__Group_1__04086);
            rule__WExpr__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WExpr__Group_1__1_in_rule__WExpr__Group_1__04089);
            rule__WExpr__Group_1__1();

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
    // $ANTLR end "rule__WExpr__Group_1__0"


    // $ANTLR start "rule__WExpr__Group_1__0__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2040:1: rule__WExpr__Group_1__0__Impl : ( () ) ;
    public final void rule__WExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2044:1: ( ( () ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2045:1: ( () )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2045:1: ( () )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2046:1: ()
            {
             before(grammarAccess.getWExprAccess().getWExprLeftAction_1_0()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2047:1: ()
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2049:1: 
            {
            }

             after(grammarAccess.getWExprAccess().getWExprLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WExpr__Group_1__0__Impl"


    // $ANTLR start "rule__WExpr__Group_1__1"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2059:1: rule__WExpr__Group_1__1 : rule__WExpr__Group_1__1__Impl rule__WExpr__Group_1__2 ;
    public final void rule__WExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2063:1: ( rule__WExpr__Group_1__1__Impl rule__WExpr__Group_1__2 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2064:2: rule__WExpr__Group_1__1__Impl rule__WExpr__Group_1__2
            {
            pushFollow(FOLLOW_rule__WExpr__Group_1__1__Impl_in_rule__WExpr__Group_1__14147);
            rule__WExpr__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WExpr__Group_1__2_in_rule__WExpr__Group_1__14150);
            rule__WExpr__Group_1__2();

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
    // $ANTLR end "rule__WExpr__Group_1__1"


    // $ANTLR start "rule__WExpr__Group_1__1__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2071:1: rule__WExpr__Group_1__1__Impl : ( RULE_WHERE ) ;
    public final void rule__WExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2075:1: ( ( RULE_WHERE ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2076:1: ( RULE_WHERE )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2076:1: ( RULE_WHERE )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2077:1: RULE_WHERE
            {
             before(grammarAccess.getWExprAccess().getWHERETerminalRuleCall_1_1()); 
            match(input,RULE_WHERE,FOLLOW_RULE_WHERE_in_rule__WExpr__Group_1__1__Impl4177); 
             after(grammarAccess.getWExprAccess().getWHERETerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__WExpr__Group_1__1__Impl"


    // $ANTLR start "rule__WExpr__Group_1__2"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2088:1: rule__WExpr__Group_1__2 : rule__WExpr__Group_1__2__Impl ;
    public final void rule__WExpr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2092:1: ( rule__WExpr__Group_1__2__Impl )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2093:2: rule__WExpr__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__WExpr__Group_1__2__Impl_in_rule__WExpr__Group_1__24206);
            rule__WExpr__Group_1__2__Impl();

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
    // $ANTLR end "rule__WExpr__Group_1__2"


    // $ANTLR start "rule__WExpr__Group_1__2__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2099:1: rule__WExpr__Group_1__2__Impl : ( ( rule__WExpr__RightAssignment_1_2 ) ) ;
    public final void rule__WExpr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2103:1: ( ( ( rule__WExpr__RightAssignment_1_2 ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2104:1: ( ( rule__WExpr__RightAssignment_1_2 ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2104:1: ( ( rule__WExpr__RightAssignment_1_2 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2105:1: ( rule__WExpr__RightAssignment_1_2 )
            {
             before(grammarAccess.getWExprAccess().getRightAssignment_1_2()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2106:1: ( rule__WExpr__RightAssignment_1_2 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2106:2: rule__WExpr__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__WExpr__RightAssignment_1_2_in_rule__WExpr__Group_1__2__Impl4233);
            rule__WExpr__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getWExprAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__WExpr__Group_1__2__Impl"


    // $ANTLR start "rule__BExpr__Group_1__0"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2122:1: rule__BExpr__Group_1__0 : rule__BExpr__Group_1__0__Impl rule__BExpr__Group_1__1 ;
    public final void rule__BExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2126:1: ( rule__BExpr__Group_1__0__Impl rule__BExpr__Group_1__1 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2127:2: rule__BExpr__Group_1__0__Impl rule__BExpr__Group_1__1
            {
            pushFollow(FOLLOW_rule__BExpr__Group_1__0__Impl_in_rule__BExpr__Group_1__04269);
            rule__BExpr__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BExpr__Group_1__1_in_rule__BExpr__Group_1__04272);
            rule__BExpr__Group_1__1();

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
    // $ANTLR end "rule__BExpr__Group_1__0"


    // $ANTLR start "rule__BExpr__Group_1__0__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2134:1: rule__BExpr__Group_1__0__Impl : ( RULE_LPAREN ) ;
    public final void rule__BExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2138:1: ( ( RULE_LPAREN ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2139:1: ( RULE_LPAREN )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2139:1: ( RULE_LPAREN )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2140:1: RULE_LPAREN
            {
             before(grammarAccess.getBExprAccess().getLPARENTerminalRuleCall_1_0()); 
            match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_rule__BExpr__Group_1__0__Impl4299); 
             after(grammarAccess.getBExprAccess().getLPARENTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__BExpr__Group_1__0__Impl"


    // $ANTLR start "rule__BExpr__Group_1__1"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2151:1: rule__BExpr__Group_1__1 : rule__BExpr__Group_1__1__Impl rule__BExpr__Group_1__2 ;
    public final void rule__BExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2155:1: ( rule__BExpr__Group_1__1__Impl rule__BExpr__Group_1__2 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2156:2: rule__BExpr__Group_1__1__Impl rule__BExpr__Group_1__2
            {
            pushFollow(FOLLOW_rule__BExpr__Group_1__1__Impl_in_rule__BExpr__Group_1__14328);
            rule__BExpr__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BExpr__Group_1__2_in_rule__BExpr__Group_1__14331);
            rule__BExpr__Group_1__2();

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
    // $ANTLR end "rule__BExpr__Group_1__1"


    // $ANTLR start "rule__BExpr__Group_1__1__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2163:1: rule__BExpr__Group_1__1__Impl : ( ruleEExpr ) ;
    public final void rule__BExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2167:1: ( ( ruleEExpr ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2168:1: ( ruleEExpr )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2168:1: ( ruleEExpr )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2169:1: ruleEExpr
            {
             before(grammarAccess.getBExprAccess().getEExprParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleEExpr_in_rule__BExpr__Group_1__1__Impl4358);
            ruleEExpr();

            state._fsp--;

             after(grammarAccess.getBExprAccess().getEExprParserRuleCall_1_1()); 

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
    // $ANTLR end "rule__BExpr__Group_1__1__Impl"


    // $ANTLR start "rule__BExpr__Group_1__2"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2180:1: rule__BExpr__Group_1__2 : rule__BExpr__Group_1__2__Impl ;
    public final void rule__BExpr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2184:1: ( rule__BExpr__Group_1__2__Impl )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2185:2: rule__BExpr__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__BExpr__Group_1__2__Impl_in_rule__BExpr__Group_1__24387);
            rule__BExpr__Group_1__2__Impl();

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
    // $ANTLR end "rule__BExpr__Group_1__2"


    // $ANTLR start "rule__BExpr__Group_1__2__Impl"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2191:1: rule__BExpr__Group_1__2__Impl : ( RULE_RPAREN ) ;
    public final void rule__BExpr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2195:1: ( ( RULE_RPAREN ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2196:1: ( RULE_RPAREN )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2196:1: ( RULE_RPAREN )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2197:1: RULE_RPAREN
            {
             before(grammarAccess.getBExprAccess().getRPARENTerminalRuleCall_1_2()); 
            match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_rule__BExpr__Group_1__2__Impl4414); 
             after(grammarAccess.getBExprAccess().getRPARENTerminalRuleCall_1_2()); 

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
    // $ANTLR end "rule__BExpr__Group_1__2__Impl"


    // $ANTLR start "rule__Interval__Group_1__0"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2214:1: rule__Interval__Group_1__0 : rule__Interval__Group_1__0__Impl rule__Interval__Group_1__1 ;
    public final void rule__Interval__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2218:1: ( rule__Interval__Group_1__0__Impl rule__Interval__Group_1__1 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2219:2: rule__Interval__Group_1__0__Impl rule__Interval__Group_1__1
            {
            pushFollow(FOLLOW_rule__Interval__Group_1__0__Impl_in_rule__Interval__Group_1__04449);
            rule__Interval__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interval__Group_1__1_in_rule__Interval__Group_1__04452);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2226:1: rule__Interval__Group_1__0__Impl : ( ( rule__Interval__EventAssignment_1_0 ) ) ;
    public final void rule__Interval__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2230:1: ( ( ( rule__Interval__EventAssignment_1_0 ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2231:1: ( ( rule__Interval__EventAssignment_1_0 ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2231:1: ( ( rule__Interval__EventAssignment_1_0 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2232:1: ( rule__Interval__EventAssignment_1_0 )
            {
             before(grammarAccess.getIntervalAccess().getEventAssignment_1_0()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2233:1: ( rule__Interval__EventAssignment_1_0 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2233:2: rule__Interval__EventAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Interval__EventAssignment_1_0_in_rule__Interval__Group_1__0__Impl4479);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2243:1: rule__Interval__Group_1__1 : rule__Interval__Group_1__1__Impl rule__Interval__Group_1__2 ;
    public final void rule__Interval__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2247:1: ( rule__Interval__Group_1__1__Impl rule__Interval__Group_1__2 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2248:2: rule__Interval__Group_1__1__Impl rule__Interval__Group_1__2
            {
            pushFollow(FOLLOW_rule__Interval__Group_1__1__Impl_in_rule__Interval__Group_1__14509);
            rule__Interval__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interval__Group_1__2_in_rule__Interval__Group_1__14512);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2255:1: rule__Interval__Group_1__1__Impl : ( RULE_LBRACKET ) ;
    public final void rule__Interval__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2259:1: ( ( RULE_LBRACKET ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2260:1: ( RULE_LBRACKET )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2260:1: ( RULE_LBRACKET )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2261:1: RULE_LBRACKET
            {
             before(grammarAccess.getIntervalAccess().getLBRACKETTerminalRuleCall_1_1()); 
            match(input,RULE_LBRACKET,FOLLOW_RULE_LBRACKET_in_rule__Interval__Group_1__1__Impl4539); 
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2272:1: rule__Interval__Group_1__2 : rule__Interval__Group_1__2__Impl rule__Interval__Group_1__3 ;
    public final void rule__Interval__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2276:1: ( rule__Interval__Group_1__2__Impl rule__Interval__Group_1__3 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2277:2: rule__Interval__Group_1__2__Impl rule__Interval__Group_1__3
            {
            pushFollow(FOLLOW_rule__Interval__Group_1__2__Impl_in_rule__Interval__Group_1__24568);
            rule__Interval__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interval__Group_1__3_in_rule__Interval__Group_1__24571);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2284:1: rule__Interval__Group_1__2__Impl : ( ( rule__Interval__LeftAssignment_1_2 ) ) ;
    public final void rule__Interval__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2288:1: ( ( ( rule__Interval__LeftAssignment_1_2 ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2289:1: ( ( rule__Interval__LeftAssignment_1_2 ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2289:1: ( ( rule__Interval__LeftAssignment_1_2 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2290:1: ( rule__Interval__LeftAssignment_1_2 )
            {
             before(grammarAccess.getIntervalAccess().getLeftAssignment_1_2()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2291:1: ( rule__Interval__LeftAssignment_1_2 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2291:2: rule__Interval__LeftAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Interval__LeftAssignment_1_2_in_rule__Interval__Group_1__2__Impl4598);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2301:1: rule__Interval__Group_1__3 : rule__Interval__Group_1__3__Impl rule__Interval__Group_1__4 ;
    public final void rule__Interval__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2305:1: ( rule__Interval__Group_1__3__Impl rule__Interval__Group_1__4 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2306:2: rule__Interval__Group_1__3__Impl rule__Interval__Group_1__4
            {
            pushFollow(FOLLOW_rule__Interval__Group_1__3__Impl_in_rule__Interval__Group_1__34628);
            rule__Interval__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interval__Group_1__4_in_rule__Interval__Group_1__34631);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2313:1: rule__Interval__Group_1__3__Impl : ( RULE_COMMA ) ;
    public final void rule__Interval__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2317:1: ( ( RULE_COMMA ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2318:1: ( RULE_COMMA )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2318:1: ( RULE_COMMA )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2319:1: RULE_COMMA
            {
             before(grammarAccess.getIntervalAccess().getCOMMATerminalRuleCall_1_3()); 
            match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rule__Interval__Group_1__3__Impl4658); 
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2330:1: rule__Interval__Group_1__4 : rule__Interval__Group_1__4__Impl rule__Interval__Group_1__5 ;
    public final void rule__Interval__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2334:1: ( rule__Interval__Group_1__4__Impl rule__Interval__Group_1__5 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2335:2: rule__Interval__Group_1__4__Impl rule__Interval__Group_1__5
            {
            pushFollow(FOLLOW_rule__Interval__Group_1__4__Impl_in_rule__Interval__Group_1__44687);
            rule__Interval__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interval__Group_1__5_in_rule__Interval__Group_1__44690);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2342:1: rule__Interval__Group_1__4__Impl : ( ( rule__Interval__RightAssignment_1_4 ) ) ;
    public final void rule__Interval__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2346:1: ( ( ( rule__Interval__RightAssignment_1_4 ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2347:1: ( ( rule__Interval__RightAssignment_1_4 ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2347:1: ( ( rule__Interval__RightAssignment_1_4 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2348:1: ( rule__Interval__RightAssignment_1_4 )
            {
             before(grammarAccess.getIntervalAccess().getRightAssignment_1_4()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2349:1: ( rule__Interval__RightAssignment_1_4 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2349:2: rule__Interval__RightAssignment_1_4
            {
            pushFollow(FOLLOW_rule__Interval__RightAssignment_1_4_in_rule__Interval__Group_1__4__Impl4717);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2359:1: rule__Interval__Group_1__5 : rule__Interval__Group_1__5__Impl ;
    public final void rule__Interval__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2363:1: ( rule__Interval__Group_1__5__Impl )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2364:2: rule__Interval__Group_1__5__Impl
            {
            pushFollow(FOLLOW_rule__Interval__Group_1__5__Impl_in_rule__Interval__Group_1__54747);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2370:1: rule__Interval__Group_1__5__Impl : ( RULE_RBRACKET ) ;
    public final void rule__Interval__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2374:1: ( ( RULE_RBRACKET ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2375:1: ( RULE_RBRACKET )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2375:1: ( RULE_RBRACKET )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2376:1: RULE_RBRACKET
            {
             before(grammarAccess.getIntervalAccess().getRBRACKETTerminalRuleCall_1_5()); 
            match(input,RULE_RBRACKET,FOLLOW_RULE_RBRACKET_in_rule__Interval__Group_1__5__Impl4774); 
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2399:1: rule__Interval__Group_2__0 : rule__Interval__Group_2__0__Impl rule__Interval__Group_2__1 ;
    public final void rule__Interval__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2403:1: ( rule__Interval__Group_2__0__Impl rule__Interval__Group_2__1 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2404:2: rule__Interval__Group_2__0__Impl rule__Interval__Group_2__1
            {
            pushFollow(FOLLOW_rule__Interval__Group_2__0__Impl_in_rule__Interval__Group_2__04815);
            rule__Interval__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interval__Group_2__1_in_rule__Interval__Group_2__04818);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2411:1: rule__Interval__Group_2__0__Impl : ( ( rule__Interval__EventAssignment_2_0 ) ) ;
    public final void rule__Interval__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2415:1: ( ( ( rule__Interval__EventAssignment_2_0 ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2416:1: ( ( rule__Interval__EventAssignment_2_0 ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2416:1: ( ( rule__Interval__EventAssignment_2_0 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2417:1: ( rule__Interval__EventAssignment_2_0 )
            {
             before(grammarAccess.getIntervalAccess().getEventAssignment_2_0()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2418:1: ( rule__Interval__EventAssignment_2_0 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2418:2: rule__Interval__EventAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Interval__EventAssignment_2_0_in_rule__Interval__Group_2__0__Impl4845);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2428:1: rule__Interval__Group_2__1 : rule__Interval__Group_2__1__Impl rule__Interval__Group_2__2 ;
    public final void rule__Interval__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2432:1: ( rule__Interval__Group_2__1__Impl rule__Interval__Group_2__2 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2433:2: rule__Interval__Group_2__1__Impl rule__Interval__Group_2__2
            {
            pushFollow(FOLLOW_rule__Interval__Group_2__1__Impl_in_rule__Interval__Group_2__14875);
            rule__Interval__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interval__Group_2__2_in_rule__Interval__Group_2__14878);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2440:1: rule__Interval__Group_2__1__Impl : ( RULE_LBRACKET ) ;
    public final void rule__Interval__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2444:1: ( ( RULE_LBRACKET ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2445:1: ( RULE_LBRACKET )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2445:1: ( RULE_LBRACKET )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2446:1: RULE_LBRACKET
            {
             before(grammarAccess.getIntervalAccess().getLBRACKETTerminalRuleCall_2_1()); 
            match(input,RULE_LBRACKET,FOLLOW_RULE_LBRACKET_in_rule__Interval__Group_2__1__Impl4905); 
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2457:1: rule__Interval__Group_2__2 : rule__Interval__Group_2__2__Impl rule__Interval__Group_2__3 ;
    public final void rule__Interval__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2461:1: ( rule__Interval__Group_2__2__Impl rule__Interval__Group_2__3 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2462:2: rule__Interval__Group_2__2__Impl rule__Interval__Group_2__3
            {
            pushFollow(FOLLOW_rule__Interval__Group_2__2__Impl_in_rule__Interval__Group_2__24934);
            rule__Interval__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interval__Group_2__3_in_rule__Interval__Group_2__24937);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2469:1: rule__Interval__Group_2__2__Impl : ( RULE_COMMA ) ;
    public final void rule__Interval__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2473:1: ( ( RULE_COMMA ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2474:1: ( RULE_COMMA )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2474:1: ( RULE_COMMA )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2475:1: RULE_COMMA
            {
             before(grammarAccess.getIntervalAccess().getCOMMATerminalRuleCall_2_2()); 
            match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rule__Interval__Group_2__2__Impl4964); 
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2486:1: rule__Interval__Group_2__3 : rule__Interval__Group_2__3__Impl rule__Interval__Group_2__4 ;
    public final void rule__Interval__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2490:1: ( rule__Interval__Group_2__3__Impl rule__Interval__Group_2__4 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2491:2: rule__Interval__Group_2__3__Impl rule__Interval__Group_2__4
            {
            pushFollow(FOLLOW_rule__Interval__Group_2__3__Impl_in_rule__Interval__Group_2__34993);
            rule__Interval__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interval__Group_2__4_in_rule__Interval__Group_2__34996);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2498:1: rule__Interval__Group_2__3__Impl : ( ( rule__Interval__RightAssignment_2_3 ) ) ;
    public final void rule__Interval__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2502:1: ( ( ( rule__Interval__RightAssignment_2_3 ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2503:1: ( ( rule__Interval__RightAssignment_2_3 ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2503:1: ( ( rule__Interval__RightAssignment_2_3 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2504:1: ( rule__Interval__RightAssignment_2_3 )
            {
             before(grammarAccess.getIntervalAccess().getRightAssignment_2_3()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2505:1: ( rule__Interval__RightAssignment_2_3 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2505:2: rule__Interval__RightAssignment_2_3
            {
            pushFollow(FOLLOW_rule__Interval__RightAssignment_2_3_in_rule__Interval__Group_2__3__Impl5023);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2515:1: rule__Interval__Group_2__4 : rule__Interval__Group_2__4__Impl ;
    public final void rule__Interval__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2519:1: ( rule__Interval__Group_2__4__Impl )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2520:2: rule__Interval__Group_2__4__Impl
            {
            pushFollow(FOLLOW_rule__Interval__Group_2__4__Impl_in_rule__Interval__Group_2__45053);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2526:1: rule__Interval__Group_2__4__Impl : ( RULE_RBRACKET ) ;
    public final void rule__Interval__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2530:1: ( ( RULE_RBRACKET ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2531:1: ( RULE_RBRACKET )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2531:1: ( RULE_RBRACKET )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2532:1: RULE_RBRACKET
            {
             before(grammarAccess.getIntervalAccess().getRBRACKETTerminalRuleCall_2_4()); 
            match(input,RULE_RBRACKET,FOLLOW_RULE_RBRACKET_in_rule__Interval__Group_2__4__Impl5080); 
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2553:1: rule__Interval__Group_3__0 : rule__Interval__Group_3__0__Impl rule__Interval__Group_3__1 ;
    public final void rule__Interval__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2557:1: ( rule__Interval__Group_3__0__Impl rule__Interval__Group_3__1 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2558:2: rule__Interval__Group_3__0__Impl rule__Interval__Group_3__1
            {
            pushFollow(FOLLOW_rule__Interval__Group_3__0__Impl_in_rule__Interval__Group_3__05119);
            rule__Interval__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interval__Group_3__1_in_rule__Interval__Group_3__05122);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2565:1: rule__Interval__Group_3__0__Impl : ( ( rule__Interval__EventAssignment_3_0 ) ) ;
    public final void rule__Interval__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2569:1: ( ( ( rule__Interval__EventAssignment_3_0 ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2570:1: ( ( rule__Interval__EventAssignment_3_0 ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2570:1: ( ( rule__Interval__EventAssignment_3_0 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2571:1: ( rule__Interval__EventAssignment_3_0 )
            {
             before(grammarAccess.getIntervalAccess().getEventAssignment_3_0()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2572:1: ( rule__Interval__EventAssignment_3_0 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2572:2: rule__Interval__EventAssignment_3_0
            {
            pushFollow(FOLLOW_rule__Interval__EventAssignment_3_0_in_rule__Interval__Group_3__0__Impl5149);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2582:1: rule__Interval__Group_3__1 : rule__Interval__Group_3__1__Impl rule__Interval__Group_3__2 ;
    public final void rule__Interval__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2586:1: ( rule__Interval__Group_3__1__Impl rule__Interval__Group_3__2 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2587:2: rule__Interval__Group_3__1__Impl rule__Interval__Group_3__2
            {
            pushFollow(FOLLOW_rule__Interval__Group_3__1__Impl_in_rule__Interval__Group_3__15179);
            rule__Interval__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interval__Group_3__2_in_rule__Interval__Group_3__15182);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2594:1: rule__Interval__Group_3__1__Impl : ( RULE_LBRACKET ) ;
    public final void rule__Interval__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2598:1: ( ( RULE_LBRACKET ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2599:1: ( RULE_LBRACKET )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2599:1: ( RULE_LBRACKET )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2600:1: RULE_LBRACKET
            {
             before(grammarAccess.getIntervalAccess().getLBRACKETTerminalRuleCall_3_1()); 
            match(input,RULE_LBRACKET,FOLLOW_RULE_LBRACKET_in_rule__Interval__Group_3__1__Impl5209); 
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2611:1: rule__Interval__Group_3__2 : rule__Interval__Group_3__2__Impl rule__Interval__Group_3__3 ;
    public final void rule__Interval__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2615:1: ( rule__Interval__Group_3__2__Impl rule__Interval__Group_3__3 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2616:2: rule__Interval__Group_3__2__Impl rule__Interval__Group_3__3
            {
            pushFollow(FOLLOW_rule__Interval__Group_3__2__Impl_in_rule__Interval__Group_3__25238);
            rule__Interval__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interval__Group_3__3_in_rule__Interval__Group_3__25241);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2623:1: rule__Interval__Group_3__2__Impl : ( ( rule__Interval__LeftAssignment_3_2 ) ) ;
    public final void rule__Interval__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2627:1: ( ( ( rule__Interval__LeftAssignment_3_2 ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2628:1: ( ( rule__Interval__LeftAssignment_3_2 ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2628:1: ( ( rule__Interval__LeftAssignment_3_2 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2629:1: ( rule__Interval__LeftAssignment_3_2 )
            {
             before(grammarAccess.getIntervalAccess().getLeftAssignment_3_2()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2630:1: ( rule__Interval__LeftAssignment_3_2 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2630:2: rule__Interval__LeftAssignment_3_2
            {
            pushFollow(FOLLOW_rule__Interval__LeftAssignment_3_2_in_rule__Interval__Group_3__2__Impl5268);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2640:1: rule__Interval__Group_3__3 : rule__Interval__Group_3__3__Impl rule__Interval__Group_3__4 ;
    public final void rule__Interval__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2644:1: ( rule__Interval__Group_3__3__Impl rule__Interval__Group_3__4 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2645:2: rule__Interval__Group_3__3__Impl rule__Interval__Group_3__4
            {
            pushFollow(FOLLOW_rule__Interval__Group_3__3__Impl_in_rule__Interval__Group_3__35298);
            rule__Interval__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interval__Group_3__4_in_rule__Interval__Group_3__35301);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2652:1: rule__Interval__Group_3__3__Impl : ( RULE_COMMA ) ;
    public final void rule__Interval__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2656:1: ( ( RULE_COMMA ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2657:1: ( RULE_COMMA )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2657:1: ( RULE_COMMA )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2658:1: RULE_COMMA
            {
             before(grammarAccess.getIntervalAccess().getCOMMATerminalRuleCall_3_3()); 
            match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rule__Interval__Group_3__3__Impl5328); 
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2669:1: rule__Interval__Group_3__4 : rule__Interval__Group_3__4__Impl ;
    public final void rule__Interval__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2673:1: ( rule__Interval__Group_3__4__Impl )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2674:2: rule__Interval__Group_3__4__Impl
            {
            pushFollow(FOLLOW_rule__Interval__Group_3__4__Impl_in_rule__Interval__Group_3__45357);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2680:1: rule__Interval__Group_3__4__Impl : ( RULE_RBRACKET ) ;
    public final void rule__Interval__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2684:1: ( ( RULE_RBRACKET ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2685:1: ( RULE_RBRACKET )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2685:1: ( RULE_RBRACKET )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2686:1: RULE_RBRACKET
            {
             before(grammarAccess.getIntervalAccess().getRBRACKETTerminalRuleCall_3_4()); 
            match(input,RULE_RBRACKET,FOLLOW_RULE_RBRACKET_in_rule__Interval__Group_3__4__Impl5384); 
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2707:1: rule__Interval__Group_4__0 : rule__Interval__Group_4__0__Impl rule__Interval__Group_4__1 ;
    public final void rule__Interval__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2711:1: ( rule__Interval__Group_4__0__Impl rule__Interval__Group_4__1 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2712:2: rule__Interval__Group_4__0__Impl rule__Interval__Group_4__1
            {
            pushFollow(FOLLOW_rule__Interval__Group_4__0__Impl_in_rule__Interval__Group_4__05423);
            rule__Interval__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interval__Group_4__1_in_rule__Interval__Group_4__05426);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2719:1: rule__Interval__Group_4__0__Impl : ( ( rule__Interval__EventAssignment_4_0 ) ) ;
    public final void rule__Interval__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2723:1: ( ( ( rule__Interval__EventAssignment_4_0 ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2724:1: ( ( rule__Interval__EventAssignment_4_0 ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2724:1: ( ( rule__Interval__EventAssignment_4_0 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2725:1: ( rule__Interval__EventAssignment_4_0 )
            {
             before(grammarAccess.getIntervalAccess().getEventAssignment_4_0()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2726:1: ( rule__Interval__EventAssignment_4_0 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2726:2: rule__Interval__EventAssignment_4_0
            {
            pushFollow(FOLLOW_rule__Interval__EventAssignment_4_0_in_rule__Interval__Group_4__0__Impl5453);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2736:1: rule__Interval__Group_4__1 : rule__Interval__Group_4__1__Impl rule__Interval__Group_4__2 ;
    public final void rule__Interval__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2740:1: ( rule__Interval__Group_4__1__Impl rule__Interval__Group_4__2 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2741:2: rule__Interval__Group_4__1__Impl rule__Interval__Group_4__2
            {
            pushFollow(FOLLOW_rule__Interval__Group_4__1__Impl_in_rule__Interval__Group_4__15483);
            rule__Interval__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interval__Group_4__2_in_rule__Interval__Group_4__15486);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2748:1: rule__Interval__Group_4__1__Impl : ( RULE_LBRACKET ) ;
    public final void rule__Interval__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2752:1: ( ( RULE_LBRACKET ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2753:1: ( RULE_LBRACKET )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2753:1: ( RULE_LBRACKET )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2754:1: RULE_LBRACKET
            {
             before(grammarAccess.getIntervalAccess().getLBRACKETTerminalRuleCall_4_1()); 
            match(input,RULE_LBRACKET,FOLLOW_RULE_LBRACKET_in_rule__Interval__Group_4__1__Impl5513); 
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2765:1: rule__Interval__Group_4__2 : rule__Interval__Group_4__2__Impl rule__Interval__Group_4__3 ;
    public final void rule__Interval__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2769:1: ( rule__Interval__Group_4__2__Impl rule__Interval__Group_4__3 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2770:2: rule__Interval__Group_4__2__Impl rule__Interval__Group_4__3
            {
            pushFollow(FOLLOW_rule__Interval__Group_4__2__Impl_in_rule__Interval__Group_4__25542);
            rule__Interval__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interval__Group_4__3_in_rule__Interval__Group_4__25545);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2777:1: rule__Interval__Group_4__2__Impl : ( RULE_COMMA ) ;
    public final void rule__Interval__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2781:1: ( ( RULE_COMMA ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2782:1: ( RULE_COMMA )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2782:1: ( RULE_COMMA )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2783:1: RULE_COMMA
            {
             before(grammarAccess.getIntervalAccess().getCOMMATerminalRuleCall_4_2()); 
            match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rule__Interval__Group_4__2__Impl5572); 
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2794:1: rule__Interval__Group_4__3 : rule__Interval__Group_4__3__Impl ;
    public final void rule__Interval__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2798:1: ( rule__Interval__Group_4__3__Impl )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2799:2: rule__Interval__Group_4__3__Impl
            {
            pushFollow(FOLLOW_rule__Interval__Group_4__3__Impl_in_rule__Interval__Group_4__35601);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2805:1: rule__Interval__Group_4__3__Impl : ( RULE_RBRACKET ) ;
    public final void rule__Interval__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2809:1: ( ( RULE_RBRACKET ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2810:1: ( RULE_RBRACKET )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2810:1: ( RULE_RBRACKET )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2811:1: RULE_RBRACKET
            {
             before(grammarAccess.getIntervalAccess().getRBRACKETTerminalRuleCall_4_3()); 
            match(input,RULE_RBRACKET,FOLLOW_RULE_RBRACKET_in_rule__Interval__Group_4__3__Impl5628); 
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2830:1: rule__Event__Group_1__0 : rule__Event__Group_1__0__Impl rule__Event__Group_1__1 ;
    public final void rule__Event__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2834:1: ( rule__Event__Group_1__0__Impl rule__Event__Group_1__1 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2835:2: rule__Event__Group_1__0__Impl rule__Event__Group_1__1
            {
            pushFollow(FOLLOW_rule__Event__Group_1__0__Impl_in_rule__Event__Group_1__05665);
            rule__Event__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group_1__1_in_rule__Event__Group_1__05668);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2842:1: rule__Event__Group_1__0__Impl : ( ( rule__Event__LifeStateAssignment_1_0 ) ) ;
    public final void rule__Event__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2846:1: ( ( ( rule__Event__LifeStateAssignment_1_0 ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2847:1: ( ( rule__Event__LifeStateAssignment_1_0 ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2847:1: ( ( rule__Event__LifeStateAssignment_1_0 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2848:1: ( rule__Event__LifeStateAssignment_1_0 )
            {
             before(grammarAccess.getEventAccess().getLifeStateAssignment_1_0()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2849:1: ( rule__Event__LifeStateAssignment_1_0 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2849:2: rule__Event__LifeStateAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Event__LifeStateAssignment_1_0_in_rule__Event__Group_1__0__Impl5695);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2859:1: rule__Event__Group_1__1 : rule__Event__Group_1__1__Impl ;
    public final void rule__Event__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2863:1: ( rule__Event__Group_1__1__Impl )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2864:2: rule__Event__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Event__Group_1__1__Impl_in_rule__Event__Group_1__15725);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2870:1: rule__Event__Group_1__1__Impl : ( ( rule__Event__LabelAssignment_1_1 ) ) ;
    public final void rule__Event__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2874:1: ( ( ( rule__Event__LabelAssignment_1_1 ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2875:1: ( ( rule__Event__LabelAssignment_1_1 ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2875:1: ( ( rule__Event__LabelAssignment_1_1 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2876:1: ( rule__Event__LabelAssignment_1_1 )
            {
             before(grammarAccess.getEventAccess().getLabelAssignment_1_1()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2877:1: ( rule__Event__LabelAssignment_1_1 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2877:2: rule__Event__LabelAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Event__LabelAssignment_1_1_in_rule__Event__Group_1__1__Impl5752);
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


    // $ANTLR start "rule__TimeStamp__Group_1__0"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2891:1: rule__TimeStamp__Group_1__0 : rule__TimeStamp__Group_1__0__Impl rule__TimeStamp__Group_1__1 ;
    public final void rule__TimeStamp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2895:1: ( rule__TimeStamp__Group_1__0__Impl rule__TimeStamp__Group_1__1 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2896:2: rule__TimeStamp__Group_1__0__Impl rule__TimeStamp__Group_1__1
            {
            pushFollow(FOLLOW_rule__TimeStamp__Group_1__0__Impl_in_rule__TimeStamp__Group_1__05786);
            rule__TimeStamp__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeStamp__Group_1__1_in_rule__TimeStamp__Group_1__05789);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2903:1: rule__TimeStamp__Group_1__0__Impl : ( ( rule__TimeStamp__EventReferenceAssignment_1_0 ) ) ;
    public final void rule__TimeStamp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2907:1: ( ( ( rule__TimeStamp__EventReferenceAssignment_1_0 ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2908:1: ( ( rule__TimeStamp__EventReferenceAssignment_1_0 ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2908:1: ( ( rule__TimeStamp__EventReferenceAssignment_1_0 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2909:1: ( rule__TimeStamp__EventReferenceAssignment_1_0 )
            {
             before(grammarAccess.getTimeStampAccess().getEventReferenceAssignment_1_0()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2910:1: ( rule__TimeStamp__EventReferenceAssignment_1_0 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2910:2: rule__TimeStamp__EventReferenceAssignment_1_0
            {
            pushFollow(FOLLOW_rule__TimeStamp__EventReferenceAssignment_1_0_in_rule__TimeStamp__Group_1__0__Impl5816);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2920:1: rule__TimeStamp__Group_1__1 : rule__TimeStamp__Group_1__1__Impl ;
    public final void rule__TimeStamp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2924:1: ( rule__TimeStamp__Group_1__1__Impl )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2925:2: rule__TimeStamp__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TimeStamp__Group_1__1__Impl_in_rule__TimeStamp__Group_1__15846);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2931:1: rule__TimeStamp__Group_1__1__Impl : ( ( rule__TimeStamp__Group_1_1__0 )? ) ;
    public final void rule__TimeStamp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2935:1: ( ( ( rule__TimeStamp__Group_1_1__0 )? ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2936:1: ( ( rule__TimeStamp__Group_1_1__0 )? )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2936:1: ( ( rule__TimeStamp__Group_1_1__0 )? )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2937:1: ( rule__TimeStamp__Group_1_1__0 )?
            {
             before(grammarAccess.getTimeStampAccess().getGroup_1_1()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2938:1: ( rule__TimeStamp__Group_1_1__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_PLUS) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2938:2: rule__TimeStamp__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__TimeStamp__Group_1_1__0_in_rule__TimeStamp__Group_1__1__Impl5873);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2952:1: rule__TimeStamp__Group_1_1__0 : rule__TimeStamp__Group_1_1__0__Impl rule__TimeStamp__Group_1_1__1 ;
    public final void rule__TimeStamp__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2956:1: ( rule__TimeStamp__Group_1_1__0__Impl rule__TimeStamp__Group_1_1__1 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2957:2: rule__TimeStamp__Group_1_1__0__Impl rule__TimeStamp__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__TimeStamp__Group_1_1__0__Impl_in_rule__TimeStamp__Group_1_1__05908);
            rule__TimeStamp__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeStamp__Group_1_1__1_in_rule__TimeStamp__Group_1_1__05911);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2964:1: rule__TimeStamp__Group_1_1__0__Impl : ( RULE_PLUS ) ;
    public final void rule__TimeStamp__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2968:1: ( ( RULE_PLUS ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2969:1: ( RULE_PLUS )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2969:1: ( RULE_PLUS )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2970:1: RULE_PLUS
            {
             before(grammarAccess.getTimeStampAccess().getPLUSTerminalRuleCall_1_1_0()); 
            match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_rule__TimeStamp__Group_1_1__0__Impl5938); 
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2981:1: rule__TimeStamp__Group_1_1__1 : rule__TimeStamp__Group_1_1__1__Impl ;
    public final void rule__TimeStamp__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2985:1: ( rule__TimeStamp__Group_1_1__1__Impl )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2986:2: rule__TimeStamp__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TimeStamp__Group_1_1__1__Impl_in_rule__TimeStamp__Group_1_1__15967);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2992:1: rule__TimeStamp__Group_1_1__1__Impl : ( ( rule__TimeStamp__ShiftAssignment_1_1_1 ) ) ;
    public final void rule__TimeStamp__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2996:1: ( ( ( rule__TimeStamp__ShiftAssignment_1_1_1 ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2997:1: ( ( rule__TimeStamp__ShiftAssignment_1_1_1 ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2997:1: ( ( rule__TimeStamp__ShiftAssignment_1_1_1 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2998:1: ( rule__TimeStamp__ShiftAssignment_1_1_1 )
            {
             before(grammarAccess.getTimeStampAccess().getShiftAssignment_1_1_1()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2999:1: ( rule__TimeStamp__ShiftAssignment_1_1_1 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:2999:2: rule__TimeStamp__ShiftAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__TimeStamp__ShiftAssignment_1_1_1_in_rule__TimeStamp__Group_1_1__1__Impl5994);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3014:1: rule__Cupido__CommitmentsAssignment_1 : ( ruleCommitment ) ;
    public final void rule__Cupido__CommitmentsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3018:1: ( ( ruleCommitment ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3019:1: ( ruleCommitment )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3019:1: ( ruleCommitment )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3020:1: ruleCommitment
            {
             before(grammarAccess.getCupidoAccess().getCommitmentsCommitmentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleCommitment_in_rule__Cupido__CommitmentsAssignment_16033);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3029:1: rule__Schemata__SchemataAssignment_1 : ( ruleEventRelation ) ;
    public final void rule__Schemata__SchemataAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3033:1: ( ( ruleEventRelation ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3034:1: ( ruleEventRelation )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3034:1: ( ruleEventRelation )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3035:1: ruleEventRelation
            {
             before(grammarAccess.getSchemataAccess().getSchemataEventRelationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEventRelation_in_rule__Schemata__SchemataAssignment_16064);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3044:1: rule__EventRelation__EventAssignment_0 : ( ruleEvent ) ;
    public final void rule__EventRelation__EventAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3048:1: ( ( ruleEvent ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3049:1: ( ruleEvent )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3049:1: ( ruleEvent )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3050:1: ruleEvent
            {
             before(grammarAccess.getEventRelationAccess().getEventEventParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleEvent_in_rule__EventRelation__EventAssignment_06095);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3059:1: rule__EventRelation__ParamsAssignment_2 : ( ruleParam ) ;
    public final void rule__EventRelation__ParamsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3063:1: ( ( ruleParam ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3064:1: ( ruleParam )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3064:1: ( ruleParam )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3065:1: ruleParam
            {
             before(grammarAccess.getEventRelationAccess().getParamsParamParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleParam_in_rule__EventRelation__ParamsAssignment_26126);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3074:1: rule__EventRelation__ParamsAssignment_3_1 : ( ruleParam ) ;
    public final void rule__EventRelation__ParamsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3078:1: ( ( ruleParam ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3079:1: ( ruleParam )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3079:1: ( ruleParam )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3080:1: ruleParam
            {
             before(grammarAccess.getEventRelationAccess().getParamsParamParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleParam_in_rule__EventRelation__ParamsAssignment_3_16157);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3089:1: rule__EventRelation__KeyParamsAssignment_6 : ( ruleParam ) ;
    public final void rule__EventRelation__KeyParamsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3093:1: ( ( ruleParam ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3094:1: ( ruleParam )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3094:1: ( ruleParam )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3095:1: ruleParam
            {
             before(grammarAccess.getEventRelationAccess().getKeyParamsParamParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleParam_in_rule__EventRelation__KeyParamsAssignment_66188);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3104:1: rule__EventRelation__KeyParamsAssignment_7_1 : ( ruleParam ) ;
    public final void rule__EventRelation__KeyParamsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3108:1: ( ( ruleParam ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3109:1: ( ruleParam )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3109:1: ( ruleParam )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3110:1: ruleParam
            {
             before(grammarAccess.getEventRelationAccess().getKeyParamsParamParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_ruleParam_in_rule__EventRelation__KeyParamsAssignment_7_16219);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3119:1: rule__EventRelation__TimeParamAssignment_9 : ( ruleParam ) ;
    public final void rule__EventRelation__TimeParamAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3123:1: ( ( ruleParam ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3124:1: ( ruleParam )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3124:1: ( ruleParam )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3125:1: ruleParam
            {
             before(grammarAccess.getEventRelationAccess().getTimeParamParamParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleParam_in_rule__EventRelation__TimeParamAssignment_96250);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3134:1: rule__Param__NameAssignment : ( RULE_ID ) ;
    public final void rule__Param__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3138:1: ( ( RULE_ID ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3139:1: ( RULE_ID )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3139:1: ( RULE_ID )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3140:1: RULE_ID
            {
             before(grammarAccess.getParamAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Param__NameAssignment6281); 
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3149:1: rule__Commitment__LabelAssignment_1 : ( RULE_ID ) ;
    public final void rule__Commitment__LabelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3153:1: ( ( RULE_ID ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3154:1: ( RULE_ID )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3154:1: ( RULE_ID )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3155:1: RULE_ID
            {
             before(grammarAccess.getCommitmentAccess().getLabelIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Commitment__LabelAssignment_16312); 
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3164:1: rule__Commitment__DebtorAssignment_2 : ( RULE_ID ) ;
    public final void rule__Commitment__DebtorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3168:1: ( ( RULE_ID ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3169:1: ( RULE_ID )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3169:1: ( RULE_ID )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3170:1: RULE_ID
            {
             before(grammarAccess.getCommitmentAccess().getDebtorIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Commitment__DebtorAssignment_26343); 
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3179:1: rule__Commitment__CreditorAssignment_4 : ( RULE_ID ) ;
    public final void rule__Commitment__CreditorAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3183:1: ( ( RULE_ID ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3184:1: ( RULE_ID )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3184:1: ( RULE_ID )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3185:1: RULE_ID
            {
             before(grammarAccess.getCommitmentAccess().getCreditorIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Commitment__CreditorAssignment_46374); 
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3194:1: rule__Commitment__TriggerAssignment_6 : ( ruleEExpr ) ;
    public final void rule__Commitment__TriggerAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3198:1: ( ( ruleEExpr ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3199:1: ( ruleEExpr )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3199:1: ( ruleEExpr )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3200:1: ruleEExpr
            {
             before(grammarAccess.getCommitmentAccess().getTriggerEExprParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleEExpr_in_rule__Commitment__TriggerAssignment_66405);
            ruleEExpr();

            state._fsp--;

             after(grammarAccess.getCommitmentAccess().getTriggerEExprParserRuleCall_6_0()); 

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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3209:1: rule__Commitment__AntecedentAssignment_7_1 : ( ruleEExpr ) ;
    public final void rule__Commitment__AntecedentAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3213:1: ( ( ruleEExpr ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3214:1: ( ruleEExpr )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3214:1: ( ruleEExpr )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3215:1: ruleEExpr
            {
             before(grammarAccess.getCommitmentAccess().getAntecedentEExprParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_ruleEExpr_in_rule__Commitment__AntecedentAssignment_7_16436);
            ruleEExpr();

            state._fsp--;

             after(grammarAccess.getCommitmentAccess().getAntecedentEExprParserRuleCall_7_1_0()); 

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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3224:1: rule__Commitment__ConsequentAssignment_9 : ( ruleEExpr ) ;
    public final void rule__Commitment__ConsequentAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3228:1: ( ( ruleEExpr ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3229:1: ( ruleEExpr )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3229:1: ( ruleEExpr )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3230:1: ruleEExpr
            {
             before(grammarAccess.getCommitmentAccess().getConsequentEExprParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleEExpr_in_rule__Commitment__ConsequentAssignment_96467);
            ruleEExpr();

            state._fsp--;

             after(grammarAccess.getCommitmentAccess().getConsequentEExprParserRuleCall_9_0()); 

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


    // $ANTLR start "rule__EExpr__RightAssignment_1_2"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3239:1: rule__EExpr__RightAssignment_1_2 : ( ruleOExpr ) ;
    public final void rule__EExpr__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3243:1: ( ( ruleOExpr ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3244:1: ( ruleOExpr )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3244:1: ( ruleOExpr )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3245:1: ruleOExpr
            {
             before(grammarAccess.getEExprAccess().getRightOExprParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleOExpr_in_rule__EExpr__RightAssignment_1_26498);
            ruleOExpr();

            state._fsp--;

             after(grammarAccess.getEExprAccess().getRightOExprParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__EExpr__RightAssignment_1_2"


    // $ANTLR start "rule__OExpr__RightAssignment_1_2"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3254:1: rule__OExpr__RightAssignment_1_2 : ( ruleAExpr ) ;
    public final void rule__OExpr__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3258:1: ( ( ruleAExpr ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3259:1: ( ruleAExpr )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3259:1: ( ruleAExpr )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3260:1: ruleAExpr
            {
             before(grammarAccess.getOExprAccess().getRightAExprParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleAExpr_in_rule__OExpr__RightAssignment_1_26529);
            ruleAExpr();

            state._fsp--;

             after(grammarAccess.getOExprAccess().getRightAExprParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__OExpr__RightAssignment_1_2"


    // $ANTLR start "rule__AExpr__RightAssignment_1_2"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3269:1: rule__AExpr__RightAssignment_1_2 : ( ruleWExpr ) ;
    public final void rule__AExpr__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3273:1: ( ( ruleWExpr ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3274:1: ( ruleWExpr )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3274:1: ( ruleWExpr )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3275:1: ruleWExpr
            {
             before(grammarAccess.getAExprAccess().getRightWExprParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleWExpr_in_rule__AExpr__RightAssignment_1_26560);
            ruleWExpr();

            state._fsp--;

             after(grammarAccess.getAExprAccess().getRightWExprParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__AExpr__RightAssignment_1_2"


    // $ANTLR start "rule__WExpr__RightAssignment_1_2"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3284:1: rule__WExpr__RightAssignment_1_2 : ( RULE_STRING ) ;
    public final void rule__WExpr__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3288:1: ( ( RULE_STRING ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3289:1: ( RULE_STRING )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3289:1: ( RULE_STRING )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3290:1: RULE_STRING
            {
             before(grammarAccess.getWExprAccess().getRightSTRINGTerminalRuleCall_1_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__WExpr__RightAssignment_1_26591); 
             after(grammarAccess.getWExprAccess().getRightSTRINGTerminalRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__WExpr__RightAssignment_1_2"


    // $ANTLR start "rule__BExpr__IntervalAssignment_0"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3299:1: rule__BExpr__IntervalAssignment_0 : ( ruleInterval ) ;
    public final void rule__BExpr__IntervalAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3303:1: ( ( ruleInterval ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3304:1: ( ruleInterval )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3304:1: ( ruleInterval )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3305:1: ruleInterval
            {
             before(grammarAccess.getBExprAccess().getIntervalIntervalParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleInterval_in_rule__BExpr__IntervalAssignment_06622);
            ruleInterval();

            state._fsp--;

             after(grammarAccess.getBExprAccess().getIntervalIntervalParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__BExpr__IntervalAssignment_0"


    // $ANTLR start "rule__Interval__EventAssignment_0"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3314:1: rule__Interval__EventAssignment_0 : ( ruleEvent ) ;
    public final void rule__Interval__EventAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3318:1: ( ( ruleEvent ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3319:1: ( ruleEvent )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3319:1: ( ruleEvent )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3320:1: ruleEvent
            {
             before(grammarAccess.getIntervalAccess().getEventEventParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleEvent_in_rule__Interval__EventAssignment_06653);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3329:1: rule__Interval__EventAssignment_1_0 : ( ruleEvent ) ;
    public final void rule__Interval__EventAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3333:1: ( ( ruleEvent ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3334:1: ( ruleEvent )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3334:1: ( ruleEvent )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3335:1: ruleEvent
            {
             before(grammarAccess.getIntervalAccess().getEventEventParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleEvent_in_rule__Interval__EventAssignment_1_06684);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3344:1: rule__Interval__LeftAssignment_1_2 : ( ruleTimeStamp ) ;
    public final void rule__Interval__LeftAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3348:1: ( ( ruleTimeStamp ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3349:1: ( ruleTimeStamp )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3349:1: ( ruleTimeStamp )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3350:1: ruleTimeStamp
            {
             before(grammarAccess.getIntervalAccess().getLeftTimeStampParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleTimeStamp_in_rule__Interval__LeftAssignment_1_26715);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3359:1: rule__Interval__RightAssignment_1_4 : ( ruleTimeStamp ) ;
    public final void rule__Interval__RightAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3363:1: ( ( ruleTimeStamp ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3364:1: ( ruleTimeStamp )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3364:1: ( ruleTimeStamp )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3365:1: ruleTimeStamp
            {
             before(grammarAccess.getIntervalAccess().getRightTimeStampParserRuleCall_1_4_0()); 
            pushFollow(FOLLOW_ruleTimeStamp_in_rule__Interval__RightAssignment_1_46746);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3374:1: rule__Interval__EventAssignment_2_0 : ( ruleEvent ) ;
    public final void rule__Interval__EventAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3378:1: ( ( ruleEvent ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3379:1: ( ruleEvent )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3379:1: ( ruleEvent )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3380:1: ruleEvent
            {
             before(grammarAccess.getIntervalAccess().getEventEventParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleEvent_in_rule__Interval__EventAssignment_2_06777);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3389:1: rule__Interval__RightAssignment_2_3 : ( ruleTimeStamp ) ;
    public final void rule__Interval__RightAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3393:1: ( ( ruleTimeStamp ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3394:1: ( ruleTimeStamp )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3394:1: ( ruleTimeStamp )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3395:1: ruleTimeStamp
            {
             before(grammarAccess.getIntervalAccess().getRightTimeStampParserRuleCall_2_3_0()); 
            pushFollow(FOLLOW_ruleTimeStamp_in_rule__Interval__RightAssignment_2_36808);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3404:1: rule__Interval__EventAssignment_3_0 : ( ruleEvent ) ;
    public final void rule__Interval__EventAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3408:1: ( ( ruleEvent ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3409:1: ( ruleEvent )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3409:1: ( ruleEvent )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3410:1: ruleEvent
            {
             before(grammarAccess.getIntervalAccess().getEventEventParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_ruleEvent_in_rule__Interval__EventAssignment_3_06839);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3419:1: rule__Interval__LeftAssignment_3_2 : ( ruleTimeStamp ) ;
    public final void rule__Interval__LeftAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3423:1: ( ( ruleTimeStamp ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3424:1: ( ruleTimeStamp )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3424:1: ( ruleTimeStamp )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3425:1: ruleTimeStamp
            {
             before(grammarAccess.getIntervalAccess().getLeftTimeStampParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_ruleTimeStamp_in_rule__Interval__LeftAssignment_3_26870);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3434:1: rule__Interval__EventAssignment_4_0 : ( ruleEvent ) ;
    public final void rule__Interval__EventAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3438:1: ( ( ruleEvent ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3439:1: ( ruleEvent )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3439:1: ( ruleEvent )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3440:1: ruleEvent
            {
             before(grammarAccess.getIntervalAccess().getEventEventParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleEvent_in_rule__Interval__EventAssignment_4_06901);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3449:1: rule__Event__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Event__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3453:1: ( ( RULE_ID ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3454:1: ( RULE_ID )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3454:1: ( RULE_ID )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3455:1: RULE_ID
            {
             before(grammarAccess.getEventAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Event__NameAssignment_06932); 
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3464:1: rule__Event__LifeStateAssignment_1_0 : ( ( rule__Event__LifeStateAlternatives_1_0_0 ) ) ;
    public final void rule__Event__LifeStateAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3468:1: ( ( ( rule__Event__LifeStateAlternatives_1_0_0 ) ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3469:1: ( ( rule__Event__LifeStateAlternatives_1_0_0 ) )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3469:1: ( ( rule__Event__LifeStateAlternatives_1_0_0 ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3470:1: ( rule__Event__LifeStateAlternatives_1_0_0 )
            {
             before(grammarAccess.getEventAccess().getLifeStateAlternatives_1_0_0()); 
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3471:1: ( rule__Event__LifeStateAlternatives_1_0_0 )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3471:2: rule__Event__LifeStateAlternatives_1_0_0
            {
            pushFollow(FOLLOW_rule__Event__LifeStateAlternatives_1_0_0_in_rule__Event__LifeStateAssignment_1_06963);
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3480:1: rule__Event__LabelAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Event__LabelAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3484:1: ( ( RULE_ID ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3485:1: ( RULE_ID )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3485:1: ( RULE_ID )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3486:1: RULE_ID
            {
             before(grammarAccess.getEventAccess().getLabelIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Event__LabelAssignment_1_16996); 
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


    // $ANTLR start "rule__TimeStamp__ValAssignment_0"
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3495:1: rule__TimeStamp__ValAssignment_0 : ( RULE_INT ) ;
    public final void rule__TimeStamp__ValAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3499:1: ( ( RULE_INT ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3500:1: ( RULE_INT )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3500:1: ( RULE_INT )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3501:1: RULE_INT
            {
             before(grammarAccess.getTimeStampAccess().getValINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__TimeStamp__ValAssignment_07027); 
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3510:1: rule__TimeStamp__EventReferenceAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__TimeStamp__EventReferenceAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3514:1: ( ( RULE_ID ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3515:1: ( RULE_ID )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3515:1: ( RULE_ID )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3516:1: RULE_ID
            {
             before(grammarAccess.getTimeStampAccess().getEventReferenceIDTerminalRuleCall_1_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TimeStamp__EventReferenceAssignment_1_07058); 
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
    // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3525:1: rule__TimeStamp__ShiftAssignment_1_1_1 : ( RULE_INT ) ;
    public final void rule__TimeStamp__ShiftAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3529:1: ( ( RULE_INT ) )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3530:1: ( RULE_INT )
            {
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3530:1: ( RULE_INT )
            // ../org.xtext.example.Cupido.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalCupido.g:3531:1: RULE_INT
            {
             before(grammarAccess.getTimeStampAccess().getShiftINTTerminalRuleCall_1_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__TimeStamp__ShiftAssignment_1_1_17089); 
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

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String DFA2_eotS =
        "\24\uffff";
    static final String DFA2_eofS =
        "\1\uffff\1\10\7\uffff\1\10\12\uffff";
    static final String DFA2_minS =
        "\1\4\1\13\5\33\1\16\1\uffff\1\13\1\31\2\16\2\uffff\1\31\1\35\2"+
        "\uffff\1\16";
    static final String DFA2_maxS =
        "\1\33\1\30\5\33\1\35\1\uffff\1\30\1\35\1\16\1\32\2\uffff\2\35\2"+
        "\uffff\1\16";
    static final String DFA2_acceptS =
        "\10\uffff\1\1\4\uffff\1\3\1\5\2\uffff\1\2\1\4\1\uffff";
    static final String DFA2_specialS =
        "\24\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\2\1\3\1\4\1\5\1\6\22\uffff\1\1",
            "\1\10\3\uffff\1\10\2\uffff\6\10\1\7",
            "\1\11",
            "\1\11",
            "\1\11",
            "\1\11",
            "\1\11",
            "\1\12\14\uffff\1\14\1\uffff\1\13",
            "",
            "\1\10\3\uffff\1\10\2\uffff\6\10\1\7",
            "\1\16\1\uffff\1\15\1\uffff\1\15",
            "\1\17",
            "\1\17\13\uffff\1\20",
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
            return "446:1: rule__Interval__Alternatives : ( ( ( rule__Interval__EventAssignment_0 ) ) | ( ( rule__Interval__Group_1__0 ) ) | ( ( rule__Interval__Group_2__0 ) ) | ( ( rule__Interval__Group_3__0 ) ) | ( ( rule__Interval__Group_4__0 ) ) );";
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
    public static final BitSet FOLLOW_ruleEExpr_in_entryRuleEExpr361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEExpr368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EExpr__Group__0_in_ruleEExpr394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOExpr_in_entryRuleOExpr421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOExpr428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OExpr__Group__0_in_ruleOExpr454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAExpr_in_entryRuleAExpr481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAExpr488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AExpr__Group__0_in_ruleAExpr514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWExpr_in_entryRuleWExpr541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWExpr548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WExpr__Group__0_in_ruleWExpr574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBExpr_in_entryRuleBExpr601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBExpr608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BExpr__Alternatives_in_ruleBExpr634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterval_in_entryRuleInterval661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterval668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__Alternatives_in_ruleInterval694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Alternatives_in_ruleEvent754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeStamp_in_entryRuleTimeStamp781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimeStamp788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeStamp__Alternatives_in_ruleTimeStamp814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BExpr__IntervalAssignment_0_in_rule__BExpr__Alternatives850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BExpr__Group_1__0_in_rule__BExpr__Alternatives868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__EventAssignment_0_in_rule__Interval__Alternatives901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__Group_1__0_in_rule__Interval__Alternatives919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__Group_2__0_in_rule__Interval__Alternatives937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__Group_3__0_in_rule__Interval__Alternatives955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__Group_4__0_in_rule__Interval__Alternatives973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__NameAssignment_0_in_rule__Event__Alternatives1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group_1__0_in_rule__Event__Alternatives1024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CREATED_in_rule__Event__LifeStateAlternatives_1_0_01057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DETACHED_in_rule__Event__LifeStateAlternatives_1_0_01074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DISCHARGED_in_rule__Event__LifeStateAlternatives_1_0_01091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EXPIRED_in_rule__Event__LifeStateAlternatives_1_0_01108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VIOLATED_in_rule__Event__LifeStateAlternatives_1_0_01125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeStamp__ValAssignment_0_in_rule__TimeStamp__Alternatives1157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeStamp__Group_1__0_in_rule__TimeStamp__Alternatives1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cupido__Group__0__Impl_in_rule__Cupido__Group__01206 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Cupido__Group__1_in_rule__Cupido__Group__01209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemata_in_rule__Cupido__Group__0__Impl1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cupido__Group__1__Impl_in_rule__Cupido__Group__11265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cupido__CommitmentsAssignment_1_in_rule__Cupido__Group__1__Impl1292 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__Schemata__Group__0__Impl_in_rule__Schemata__Group__01327 = new BitSet(new long[]{0x00000000080001F0L});
    public static final BitSet FOLLOW_rule__Schemata__Group__1_in_rule__Schemata__Group__01330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SCHEMA_in_rule__Schemata__Group__0__Impl1357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Schemata__Group__1__Impl_in_rule__Schemata__Group__11386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Schemata__SchemataAssignment_1_in_rule__Schemata__Group__1__Impl1415 = new BitSet(new long[]{0x00000000080001F2L});
    public static final BitSet FOLLOW_rule__Schemata__SchemataAssignment_1_in_rule__Schemata__Group__1__Impl1427 = new BitSet(new long[]{0x00000000080001F2L});
    public static final BitSet FOLLOW_rule__EventRelation__Group__0__Impl_in_rule__EventRelation__Group__01464 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__EventRelation__Group__1_in_rule__EventRelation__Group__01467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventRelation__EventAssignment_0_in_rule__EventRelation__Group__0__Impl1494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventRelation__Group__1__Impl_in_rule__EventRelation__Group__11524 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__EventRelation__Group__2_in_rule__EventRelation__Group__11527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_rule__EventRelation__Group__1__Impl1554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventRelation__Group__2__Impl_in_rule__EventRelation__Group__21583 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_rule__EventRelation__Group__3_in_rule__EventRelation__Group__21586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventRelation__ParamsAssignment_2_in_rule__EventRelation__Group__2__Impl1613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventRelation__Group__3__Impl_in_rule__EventRelation__Group__31643 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_rule__EventRelation__Group__4_in_rule__EventRelation__Group__31646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventRelation__Group_3__0_in_rule__EventRelation__Group__3__Impl1673 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__EventRelation__Group__4__Impl_in_rule__EventRelation__Group__41704 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__EventRelation__Group__5_in_rule__EventRelation__Group__41707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_rule__EventRelation__Group__4__Impl1734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventRelation__Group__5__Impl_in_rule__EventRelation__Group__51763 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__EventRelation__Group__6_in_rule__EventRelation__Group__51766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KEY_in_rule__EventRelation__Group__5__Impl1793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventRelation__Group__6__Impl_in_rule__EventRelation__Group__61822 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__EventRelation__Group__7_in_rule__EventRelation__Group__61825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventRelation__KeyParamsAssignment_6_in_rule__EventRelation__Group__6__Impl1852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventRelation__Group__7__Impl_in_rule__EventRelation__Group__71882 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__EventRelation__Group__8_in_rule__EventRelation__Group__71885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventRelation__Group_7__0_in_rule__EventRelation__Group__7__Impl1912 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__EventRelation__Group__8__Impl_in_rule__EventRelation__Group__81943 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__EventRelation__Group__9_in_rule__EventRelation__Group__81946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TIME_in_rule__EventRelation__Group__8__Impl1973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventRelation__Group__9__Impl_in_rule__EventRelation__Group__92002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventRelation__TimeParamAssignment_9_in_rule__EventRelation__Group__9__Impl2029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventRelation__Group_3__0__Impl_in_rule__EventRelation__Group_3__02079 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__EventRelation__Group_3__1_in_rule__EventRelation__Group_3__02082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rule__EventRelation__Group_3__0__Impl2109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventRelation__Group_3__1__Impl_in_rule__EventRelation__Group_3__12138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventRelation__ParamsAssignment_3_1_in_rule__EventRelation__Group_3__1__Impl2165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventRelation__Group_7__0__Impl_in_rule__EventRelation__Group_7__02199 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__EventRelation__Group_7__1_in_rule__EventRelation__Group_7__02202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rule__EventRelation__Group_7__0__Impl2229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventRelation__Group_7__1__Impl_in_rule__EventRelation__Group_7__12258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventRelation__KeyParamsAssignment_7_1_in_rule__EventRelation__Group_7__1__Impl2285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commitment__Group__0__Impl_in_rule__Commitment__Group__02319 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Commitment__Group__1_in_rule__Commitment__Group__02322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMIT_in_rule__Commitment__Group__0__Impl2349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commitment__Group__1__Impl_in_rule__Commitment__Group__12378 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Commitment__Group__2_in_rule__Commitment__Group__12381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commitment__LabelAssignment_1_in_rule__Commitment__Group__1__Impl2408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commitment__Group__2__Impl_in_rule__Commitment__Group__22438 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Commitment__Group__3_in_rule__Commitment__Group__22441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commitment__DebtorAssignment_2_in_rule__Commitment__Group__2__Impl2468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commitment__Group__3__Impl_in_rule__Commitment__Group__32498 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Commitment__Group__4_in_rule__Commitment__Group__32501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TO_in_rule__Commitment__Group__3__Impl2528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commitment__Group__4__Impl_in_rule__Commitment__Group__42557 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Commitment__Group__5_in_rule__Commitment__Group__42560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commitment__CreditorAssignment_4_in_rule__Commitment__Group__4__Impl2587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commitment__Group__5__Impl_in_rule__Commitment__Group__52617 = new BitSet(new long[]{0x00000000080005F0L});
    public static final BitSet FOLLOW_rule__Commitment__Group__6_in_rule__Commitment__Group__52620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CREATE_in_rule__Commitment__Group__5__Impl2647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commitment__Group__6__Impl_in_rule__Commitment__Group__62676 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__Commitment__Group__7_in_rule__Commitment__Group__62679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commitment__TriggerAssignment_6_in_rule__Commitment__Group__6__Impl2706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commitment__Group__7__Impl_in_rule__Commitment__Group__72736 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__Commitment__Group__8_in_rule__Commitment__Group__72739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commitment__Group_7__0_in_rule__Commitment__Group__7__Impl2766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commitment__Group__8__Impl_in_rule__Commitment__Group__82797 = new BitSet(new long[]{0x00000000080005F0L});
    public static final BitSet FOLLOW_rule__Commitment__Group__9_in_rule__Commitment__Group__82800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DISCHARGE_in_rule__Commitment__Group__8__Impl2827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commitment__Group__9__Impl_in_rule__Commitment__Group__92856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commitment__ConsequentAssignment_9_in_rule__Commitment__Group__9__Impl2883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commitment__Group_7__0__Impl_in_rule__Commitment__Group_7__02933 = new BitSet(new long[]{0x00000000080005F0L});
    public static final BitSet FOLLOW_rule__Commitment__Group_7__1_in_rule__Commitment__Group_7__02936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DETACH_in_rule__Commitment__Group_7__0__Impl2963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commitment__Group_7__1__Impl_in_rule__Commitment__Group_7__12992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commitment__AntecedentAssignment_7_1_in_rule__Commitment__Group_7__1__Impl3019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EExpr__Group__0__Impl_in_rule__EExpr__Group__03053 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__EExpr__Group__1_in_rule__EExpr__Group__03056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOExpr_in_rule__EExpr__Group__0__Impl3083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EExpr__Group__1__Impl_in_rule__EExpr__Group__13112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EExpr__Group_1__0_in_rule__EExpr__Group__1__Impl3139 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__EExpr__Group_1__0__Impl_in_rule__EExpr__Group_1__03174 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__EExpr__Group_1__1_in_rule__EExpr__Group_1__03177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EExpr__Group_1__1__Impl_in_rule__EExpr__Group_1__13235 = new BitSet(new long[]{0x00000000080005F0L});
    public static final BitSet FOLLOW_rule__EExpr__Group_1__2_in_rule__EExpr__Group_1__13238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EXCEPT_in_rule__EExpr__Group_1__1__Impl3265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EExpr__Group_1__2__Impl_in_rule__EExpr__Group_1__23294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EExpr__RightAssignment_1_2_in_rule__EExpr__Group_1__2__Impl3321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OExpr__Group__0__Impl_in_rule__OExpr__Group__03357 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__OExpr__Group__1_in_rule__OExpr__Group__03360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAExpr_in_rule__OExpr__Group__0__Impl3387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OExpr__Group__1__Impl_in_rule__OExpr__Group__13416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OExpr__Group_1__0_in_rule__OExpr__Group__1__Impl3443 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__OExpr__Group_1__0__Impl_in_rule__OExpr__Group_1__03478 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__OExpr__Group_1__1_in_rule__OExpr__Group_1__03481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OExpr__Group_1__1__Impl_in_rule__OExpr__Group_1__13539 = new BitSet(new long[]{0x00000000080005F0L});
    public static final BitSet FOLLOW_rule__OExpr__Group_1__2_in_rule__OExpr__Group_1__13542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OR_in_rule__OExpr__Group_1__1__Impl3569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OExpr__Group_1__2__Impl_in_rule__OExpr__Group_1__23598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OExpr__RightAssignment_1_2_in_rule__OExpr__Group_1__2__Impl3625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AExpr__Group__0__Impl_in_rule__AExpr__Group__03661 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__AExpr__Group__1_in_rule__AExpr__Group__03664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWExpr_in_rule__AExpr__Group__0__Impl3691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AExpr__Group__1__Impl_in_rule__AExpr__Group__13720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AExpr__Group_1__0_in_rule__AExpr__Group__1__Impl3747 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__AExpr__Group_1__0__Impl_in_rule__AExpr__Group_1__03782 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__AExpr__Group_1__1_in_rule__AExpr__Group_1__03785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AExpr__Group_1__1__Impl_in_rule__AExpr__Group_1__13843 = new BitSet(new long[]{0x00000000080005F0L});
    public static final BitSet FOLLOW_rule__AExpr__Group_1__2_in_rule__AExpr__Group_1__13846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_AND_in_rule__AExpr__Group_1__1__Impl3873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AExpr__Group_1__2__Impl_in_rule__AExpr__Group_1__23902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AExpr__RightAssignment_1_2_in_rule__AExpr__Group_1__2__Impl3929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WExpr__Group__0__Impl_in_rule__WExpr__Group__03965 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__WExpr__Group__1_in_rule__WExpr__Group__03968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBExpr_in_rule__WExpr__Group__0__Impl3995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WExpr__Group__1__Impl_in_rule__WExpr__Group__14024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WExpr__Group_1__0_in_rule__WExpr__Group__1__Impl4051 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__WExpr__Group_1__0__Impl_in_rule__WExpr__Group_1__04086 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__WExpr__Group_1__1_in_rule__WExpr__Group_1__04089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WExpr__Group_1__1__Impl_in_rule__WExpr__Group_1__14147 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__WExpr__Group_1__2_in_rule__WExpr__Group_1__14150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WHERE_in_rule__WExpr__Group_1__1__Impl4177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WExpr__Group_1__2__Impl_in_rule__WExpr__Group_1__24206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WExpr__RightAssignment_1_2_in_rule__WExpr__Group_1__2__Impl4233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BExpr__Group_1__0__Impl_in_rule__BExpr__Group_1__04269 = new BitSet(new long[]{0x00000000080005F0L});
    public static final BitSet FOLLOW_rule__BExpr__Group_1__1_in_rule__BExpr__Group_1__04272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_rule__BExpr__Group_1__0__Impl4299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BExpr__Group_1__1__Impl_in_rule__BExpr__Group_1__14328 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__BExpr__Group_1__2_in_rule__BExpr__Group_1__14331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEExpr_in_rule__BExpr__Group_1__1__Impl4358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BExpr__Group_1__2__Impl_in_rule__BExpr__Group_1__24387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_rule__BExpr__Group_1__2__Impl4414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__Group_1__0__Impl_in_rule__Interval__Group_1__04449 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Interval__Group_1__1_in_rule__Interval__Group_1__04452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__EventAssignment_1_0_in_rule__Interval__Group_1__0__Impl4479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__Group_1__1__Impl_in_rule__Interval__Group_1__14509 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_rule__Interval__Group_1__2_in_rule__Interval__Group_1__14512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LBRACKET_in_rule__Interval__Group_1__1__Impl4539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__Group_1__2__Impl_in_rule__Interval__Group_1__24568 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Interval__Group_1__3_in_rule__Interval__Group_1__24571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__LeftAssignment_1_2_in_rule__Interval__Group_1__2__Impl4598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__Group_1__3__Impl_in_rule__Interval__Group_1__34628 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_rule__Interval__Group_1__4_in_rule__Interval__Group_1__34631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rule__Interval__Group_1__3__Impl4658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__Group_1__4__Impl_in_rule__Interval__Group_1__44687 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Interval__Group_1__5_in_rule__Interval__Group_1__44690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__RightAssignment_1_4_in_rule__Interval__Group_1__4__Impl4717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__Group_1__5__Impl_in_rule__Interval__Group_1__54747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RBRACKET_in_rule__Interval__Group_1__5__Impl4774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__Group_2__0__Impl_in_rule__Interval__Group_2__04815 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Interval__Group_2__1_in_rule__Interval__Group_2__04818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__EventAssignment_2_0_in_rule__Interval__Group_2__0__Impl4845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__Group_2__1__Impl_in_rule__Interval__Group_2__14875 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Interval__Group_2__2_in_rule__Interval__Group_2__14878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LBRACKET_in_rule__Interval__Group_2__1__Impl4905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__Group_2__2__Impl_in_rule__Interval__Group_2__24934 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_rule__Interval__Group_2__3_in_rule__Interval__Group_2__24937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rule__Interval__Group_2__2__Impl4964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__Group_2__3__Impl_in_rule__Interval__Group_2__34993 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Interval__Group_2__4_in_rule__Interval__Group_2__34996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__RightAssignment_2_3_in_rule__Interval__Group_2__3__Impl5023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__Group_2__4__Impl_in_rule__Interval__Group_2__45053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RBRACKET_in_rule__Interval__Group_2__4__Impl5080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__Group_3__0__Impl_in_rule__Interval__Group_3__05119 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Interval__Group_3__1_in_rule__Interval__Group_3__05122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__EventAssignment_3_0_in_rule__Interval__Group_3__0__Impl5149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__Group_3__1__Impl_in_rule__Interval__Group_3__15179 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_rule__Interval__Group_3__2_in_rule__Interval__Group_3__15182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LBRACKET_in_rule__Interval__Group_3__1__Impl5209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__Group_3__2__Impl_in_rule__Interval__Group_3__25238 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Interval__Group_3__3_in_rule__Interval__Group_3__25241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__LeftAssignment_3_2_in_rule__Interval__Group_3__2__Impl5268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__Group_3__3__Impl_in_rule__Interval__Group_3__35298 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Interval__Group_3__4_in_rule__Interval__Group_3__35301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rule__Interval__Group_3__3__Impl5328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__Group_3__4__Impl_in_rule__Interval__Group_3__45357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RBRACKET_in_rule__Interval__Group_3__4__Impl5384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__Group_4__0__Impl_in_rule__Interval__Group_4__05423 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Interval__Group_4__1_in_rule__Interval__Group_4__05426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__EventAssignment_4_0_in_rule__Interval__Group_4__0__Impl5453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__Group_4__1__Impl_in_rule__Interval__Group_4__15483 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Interval__Group_4__2_in_rule__Interval__Group_4__15486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LBRACKET_in_rule__Interval__Group_4__1__Impl5513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__Group_4__2__Impl_in_rule__Interval__Group_4__25542 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Interval__Group_4__3_in_rule__Interval__Group_4__25545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rule__Interval__Group_4__2__Impl5572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interval__Group_4__3__Impl_in_rule__Interval__Group_4__35601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RBRACKET_in_rule__Interval__Group_4__3__Impl5628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group_1__0__Impl_in_rule__Event__Group_1__05665 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Event__Group_1__1_in_rule__Event__Group_1__05668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__LifeStateAssignment_1_0_in_rule__Event__Group_1__0__Impl5695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group_1__1__Impl_in_rule__Event__Group_1__15725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__LabelAssignment_1_1_in_rule__Event__Group_1__1__Impl5752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeStamp__Group_1__0__Impl_in_rule__TimeStamp__Group_1__05786 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__TimeStamp__Group_1__1_in_rule__TimeStamp__Group_1__05789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeStamp__EventReferenceAssignment_1_0_in_rule__TimeStamp__Group_1__0__Impl5816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeStamp__Group_1__1__Impl_in_rule__TimeStamp__Group_1__15846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeStamp__Group_1_1__0_in_rule__TimeStamp__Group_1__1__Impl5873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeStamp__Group_1_1__0__Impl_in_rule__TimeStamp__Group_1_1__05908 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__TimeStamp__Group_1_1__1_in_rule__TimeStamp__Group_1_1__05911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PLUS_in_rule__TimeStamp__Group_1_1__0__Impl5938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeStamp__Group_1_1__1__Impl_in_rule__TimeStamp__Group_1_1__15967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeStamp__ShiftAssignment_1_1_1_in_rule__TimeStamp__Group_1_1__1__Impl5994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommitment_in_rule__Cupido__CommitmentsAssignment_16033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventRelation_in_rule__Schemata__SchemataAssignment_16064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_rule__EventRelation__EventAssignment_06095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_rule__EventRelation__ParamsAssignment_26126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_rule__EventRelation__ParamsAssignment_3_16157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_rule__EventRelation__KeyParamsAssignment_66188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_rule__EventRelation__KeyParamsAssignment_7_16219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_rule__EventRelation__TimeParamAssignment_96250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Param__NameAssignment6281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Commitment__LabelAssignment_16312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Commitment__DebtorAssignment_26343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Commitment__CreditorAssignment_46374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEExpr_in_rule__Commitment__TriggerAssignment_66405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEExpr_in_rule__Commitment__AntecedentAssignment_7_16436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEExpr_in_rule__Commitment__ConsequentAssignment_96467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOExpr_in_rule__EExpr__RightAssignment_1_26498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAExpr_in_rule__OExpr__RightAssignment_1_26529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWExpr_in_rule__AExpr__RightAssignment_1_26560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__WExpr__RightAssignment_1_26591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterval_in_rule__BExpr__IntervalAssignment_06622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_rule__Interval__EventAssignment_06653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_rule__Interval__EventAssignment_1_06684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeStamp_in_rule__Interval__LeftAssignment_1_26715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeStamp_in_rule__Interval__RightAssignment_1_46746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_rule__Interval__EventAssignment_2_06777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeStamp_in_rule__Interval__RightAssignment_2_36808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_rule__Interval__EventAssignment_3_06839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeStamp_in_rule__Interval__LeftAssignment_3_26870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_rule__Interval__EventAssignment_4_06901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Event__NameAssignment_06932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__LifeStateAlternatives_1_0_0_in_rule__Event__LifeStateAssignment_1_06963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Event__LabelAssignment_1_16996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__TimeStamp__ValAssignment_07027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TimeStamp__EventReferenceAssignment_1_07058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__TimeStamp__ShiftAssignment_1_1_17089 = new BitSet(new long[]{0x0000000000000002L});

}