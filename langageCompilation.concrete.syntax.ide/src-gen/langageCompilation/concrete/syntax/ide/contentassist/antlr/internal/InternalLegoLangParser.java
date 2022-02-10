package langageCompilation.concrete.syntax.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import langageCompilation.concrete.syntax.services.LegoLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalLegoLangParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'Program'", "'{'", "'}'", "'if'", "'else{'", "'while'", "'print('", "');'", "','", "'('", "'-'", "')'", "'+'", "'*'", "'/'", "'>'", "'<'", "'=='", "'!='", "'<='", "'>='", "'='", "'+='", "'-='", "'int'", "';'", "'double'", "'.'", "'bool'", "'string'", "'const'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
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
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalLegoLangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLegoLangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLegoLangParser.tokenNames; }
    public String getGrammarFileName() { return "InternalLegoLang.g"; }


    	private LegoLangGrammarAccess grammarAccess;

    	public void setGrammarAccess(LegoLangGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleProgram"
    // InternalLegoLang.g:54:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // InternalLegoLang.g:55:1: ( ruleProgram EOF )
            // InternalLegoLang.g:56:1: ruleProgram EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleProgram();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalLegoLang.g:63:1: ruleProgram : ( ( rule__Program__Group__0 ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:67:2: ( ( ( rule__Program__Group__0 ) ) )
            // InternalLegoLang.g:68:2: ( ( rule__Program__Group__0 ) )
            {
            // InternalLegoLang.g:68:2: ( ( rule__Program__Group__0 ) )
            // InternalLegoLang.g:69:3: ( rule__Program__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getGroup()); 
            }
            // InternalLegoLang.g:70:3: ( rule__Program__Group__0 )
            // InternalLegoLang.g:70:4: rule__Program__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getGroup()); 
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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleStatement"
    // InternalLegoLang.g:79:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalLegoLang.g:80:1: ( ruleStatement EOF )
            // InternalLegoLang.g:81:1: ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalLegoLang.g:88:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:92:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalLegoLang.g:93:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalLegoLang.g:93:2: ( ( rule__Statement__Alternatives ) )
            // InternalLegoLang.g:94:3: ( rule__Statement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getAlternatives()); 
            }
            // InternalLegoLang.g:95:3: ( rule__Statement__Alternatives )
            // InternalLegoLang.g:95:4: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getAlternatives()); 
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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleExpression"
    // InternalLegoLang.g:104:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalLegoLang.g:105:1: ( ruleExpression EOF )
            // InternalLegoLang.g:106:1: ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalLegoLang.g:113:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:117:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalLegoLang.g:118:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalLegoLang.g:118:2: ( ( rule__Expression__Alternatives ) )
            // InternalLegoLang.g:119:3: ( rule__Expression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getAlternatives()); 
            }
            // InternalLegoLang.g:120:3: ( rule__Expression__Alternatives )
            // InternalLegoLang.g:120:4: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getAlternatives()); 
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleBinaryOperation"
    // InternalLegoLang.g:129:1: entryRuleBinaryOperation : ruleBinaryOperation EOF ;
    public final void entryRuleBinaryOperation() throws RecognitionException {
        try {
            // InternalLegoLang.g:130:1: ( ruleBinaryOperation EOF )
            // InternalLegoLang.g:131:1: ruleBinaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBinaryOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryOperationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBinaryOperation"


    // $ANTLR start "ruleBinaryOperation"
    // InternalLegoLang.g:138:1: ruleBinaryOperation : ( ( rule__BinaryOperation__Alternatives ) ) ;
    public final void ruleBinaryOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:142:2: ( ( ( rule__BinaryOperation__Alternatives ) ) )
            // InternalLegoLang.g:143:2: ( ( rule__BinaryOperation__Alternatives ) )
            {
            // InternalLegoLang.g:143:2: ( ( rule__BinaryOperation__Alternatives ) )
            // InternalLegoLang.g:144:3: ( rule__BinaryOperation__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryOperationAccess().getAlternatives()); 
            }
            // InternalLegoLang.g:145:3: ( rule__BinaryOperation__Alternatives )
            // InternalLegoLang.g:145:4: rule__BinaryOperation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BinaryOperation__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryOperationAccess().getAlternatives()); 
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
    // $ANTLR end "ruleBinaryOperation"


    // $ANTLR start "entryRuleVariable"
    // InternalLegoLang.g:154:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalLegoLang.g:155:1: ( ruleVariable EOF )
            // InternalLegoLang.g:156:1: ruleVariable EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalLegoLang.g:163:1: ruleVariable : ( ( rule__Variable__Alternatives ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:167:2: ( ( ( rule__Variable__Alternatives ) ) )
            // InternalLegoLang.g:168:2: ( ( rule__Variable__Alternatives ) )
            {
            // InternalLegoLang.g:168:2: ( ( rule__Variable__Alternatives ) )
            // InternalLegoLang.g:169:3: ( rule__Variable__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getAlternatives()); 
            }
            // InternalLegoLang.g:170:3: ( rule__Variable__Alternatives )
            // InternalLegoLang.g:170:4: rule__Variable__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getAlternatives()); 
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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleComparaison"
    // InternalLegoLang.g:179:1: entryRuleComparaison : ruleComparaison EOF ;
    public final void entryRuleComparaison() throws RecognitionException {
        try {
            // InternalLegoLang.g:180:1: ( ruleComparaison EOF )
            // InternalLegoLang.g:181:1: ruleComparaison EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparaisonRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleComparaison();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparaisonRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleComparaison"


    // $ANTLR start "ruleComparaison"
    // InternalLegoLang.g:188:1: ruleComparaison : ( ( rule__Comparaison__Alternatives ) ) ;
    public final void ruleComparaison() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:192:2: ( ( ( rule__Comparaison__Alternatives ) ) )
            // InternalLegoLang.g:193:2: ( ( rule__Comparaison__Alternatives ) )
            {
            // InternalLegoLang.g:193:2: ( ( rule__Comparaison__Alternatives ) )
            // InternalLegoLang.g:194:3: ( rule__Comparaison__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparaisonAccess().getAlternatives()); 
            }
            // InternalLegoLang.g:195:3: ( rule__Comparaison__Alternatives )
            // InternalLegoLang.g:195:4: rule__Comparaison__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Comparaison__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparaisonAccess().getAlternatives()); 
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
    // $ANTLR end "ruleComparaison"


    // $ANTLR start "entryRuleConditionEtat"
    // InternalLegoLang.g:204:1: entryRuleConditionEtat : ruleConditionEtat EOF ;
    public final void entryRuleConditionEtat() throws RecognitionException {
        try {
            // InternalLegoLang.g:205:1: ( ruleConditionEtat EOF )
            // InternalLegoLang.g:206:1: ruleConditionEtat EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionEtatRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleConditionEtat();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionEtatRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleConditionEtat"


    // $ANTLR start "ruleConditionEtat"
    // InternalLegoLang.g:213:1: ruleConditionEtat : ( ( rule__ConditionEtat__Group__0 ) ) ;
    public final void ruleConditionEtat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:217:2: ( ( ( rule__ConditionEtat__Group__0 ) ) )
            // InternalLegoLang.g:218:2: ( ( rule__ConditionEtat__Group__0 ) )
            {
            // InternalLegoLang.g:218:2: ( ( rule__ConditionEtat__Group__0 ) )
            // InternalLegoLang.g:219:3: ( rule__ConditionEtat__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionEtatAccess().getGroup()); 
            }
            // InternalLegoLang.g:220:3: ( rule__ConditionEtat__Group__0 )
            // InternalLegoLang.g:220:4: rule__ConditionEtat__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConditionEtat__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionEtatAccess().getGroup()); 
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
    // $ANTLR end "ruleConditionEtat"


    // $ANTLR start "entryRuleEString"
    // InternalLegoLang.g:229:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalLegoLang.g:230:1: ( ruleEString EOF )
            // InternalLegoLang.g:231:1: ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEStringRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalLegoLang.g:238:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:242:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalLegoLang.g:243:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalLegoLang.g:243:2: ( ( rule__EString__Alternatives ) )
            // InternalLegoLang.g:244:3: ( rule__EString__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringAccess().getAlternatives()); 
            }
            // InternalLegoLang.g:245:3: ( rule__EString__Alternatives )
            // InternalLegoLang.g:245:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEStringAccess().getAlternatives()); 
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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleWhileLoop"
    // InternalLegoLang.g:254:1: entryRuleWhileLoop : ruleWhileLoop EOF ;
    public final void entryRuleWhileLoop() throws RecognitionException {
        try {
            // InternalLegoLang.g:255:1: ( ruleWhileLoop EOF )
            // InternalLegoLang.g:256:1: ruleWhileLoop EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileLoopRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleWhileLoop();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileLoopRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleWhileLoop"


    // $ANTLR start "ruleWhileLoop"
    // InternalLegoLang.g:263:1: ruleWhileLoop : ( ( rule__WhileLoop__Group__0 ) ) ;
    public final void ruleWhileLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:267:2: ( ( ( rule__WhileLoop__Group__0 ) ) )
            // InternalLegoLang.g:268:2: ( ( rule__WhileLoop__Group__0 ) )
            {
            // InternalLegoLang.g:268:2: ( ( rule__WhileLoop__Group__0 ) )
            // InternalLegoLang.g:269:3: ( rule__WhileLoop__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileLoopAccess().getGroup()); 
            }
            // InternalLegoLang.g:270:3: ( rule__WhileLoop__Group__0 )
            // InternalLegoLang.g:270:4: rule__WhileLoop__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WhileLoop__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileLoopAccess().getGroup()); 
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
    // $ANTLR end "ruleWhileLoop"


    // $ANTLR start "entryRuleMethodePrint"
    // InternalLegoLang.g:279:1: entryRuleMethodePrint : ruleMethodePrint EOF ;
    public final void entryRuleMethodePrint() throws RecognitionException {
        try {
            // InternalLegoLang.g:280:1: ( ruleMethodePrint EOF )
            // InternalLegoLang.g:281:1: ruleMethodePrint EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodePrintRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMethodePrint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodePrintRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMethodePrint"


    // $ANTLR start "ruleMethodePrint"
    // InternalLegoLang.g:288:1: ruleMethodePrint : ( ( rule__MethodePrint__Group__0 ) ) ;
    public final void ruleMethodePrint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:292:2: ( ( ( rule__MethodePrint__Group__0 ) ) )
            // InternalLegoLang.g:293:2: ( ( rule__MethodePrint__Group__0 ) )
            {
            // InternalLegoLang.g:293:2: ( ( rule__MethodePrint__Group__0 ) )
            // InternalLegoLang.g:294:3: ( rule__MethodePrint__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodePrintAccess().getGroup()); 
            }
            // InternalLegoLang.g:295:3: ( rule__MethodePrint__Group__0 )
            // InternalLegoLang.g:295:4: rule__MethodePrint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MethodePrint__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodePrintAccess().getGroup()); 
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
    // $ANTLR end "ruleMethodePrint"


    // $ANTLR start "entryRuleVariableRef"
    // InternalLegoLang.g:304:1: entryRuleVariableRef : ruleVariableRef EOF ;
    public final void entryRuleVariableRef() throws RecognitionException {
        try {
            // InternalLegoLang.g:305:1: ( ruleVariableRef EOF )
            // InternalLegoLang.g:306:1: ruleVariableRef EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableRefRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleVariableRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableRefRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleVariableRef"


    // $ANTLR start "ruleVariableRef"
    // InternalLegoLang.g:313:1: ruleVariableRef : ( ( rule__VariableRef__VariableAssignment ) ) ;
    public final void ruleVariableRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:317:2: ( ( ( rule__VariableRef__VariableAssignment ) ) )
            // InternalLegoLang.g:318:2: ( ( rule__VariableRef__VariableAssignment ) )
            {
            // InternalLegoLang.g:318:2: ( ( rule__VariableRef__VariableAssignment ) )
            // InternalLegoLang.g:319:3: ( rule__VariableRef__VariableAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableRefAccess().getVariableAssignment()); 
            }
            // InternalLegoLang.g:320:3: ( rule__VariableRef__VariableAssignment )
            // InternalLegoLang.g:320:4: rule__VariableRef__VariableAssignment
            {
            pushFollow(FOLLOW_2);
            rule__VariableRef__VariableAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableRefAccess().getVariableAssignment()); 
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
    // $ANTLR end "ruleVariableRef"


    // $ANTLR start "entryRuleSubstraction"
    // InternalLegoLang.g:329:1: entryRuleSubstraction : ruleSubstraction EOF ;
    public final void entryRuleSubstraction() throws RecognitionException {
        try {
            // InternalLegoLang.g:330:1: ( ruleSubstraction EOF )
            // InternalLegoLang.g:331:1: ruleSubstraction EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstractionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSubstraction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstractionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSubstraction"


    // $ANTLR start "ruleSubstraction"
    // InternalLegoLang.g:338:1: ruleSubstraction : ( ( rule__Substraction__Group__0 ) ) ;
    public final void ruleSubstraction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:342:2: ( ( ( rule__Substraction__Group__0 ) ) )
            // InternalLegoLang.g:343:2: ( ( rule__Substraction__Group__0 ) )
            {
            // InternalLegoLang.g:343:2: ( ( rule__Substraction__Group__0 ) )
            // InternalLegoLang.g:344:3: ( rule__Substraction__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstractionAccess().getGroup()); 
            }
            // InternalLegoLang.g:345:3: ( rule__Substraction__Group__0 )
            // InternalLegoLang.g:345:4: rule__Substraction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Substraction__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstractionAccess().getGroup()); 
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
    // $ANTLR end "ruleSubstraction"


    // $ANTLR start "entryRuleAddition"
    // InternalLegoLang.g:354:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // InternalLegoLang.g:355:1: ( ruleAddition EOF )
            // InternalLegoLang.g:356:1: ruleAddition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAddition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // InternalLegoLang.g:363:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:367:2: ( ( ( rule__Addition__Group__0 ) ) )
            // InternalLegoLang.g:368:2: ( ( rule__Addition__Group__0 ) )
            {
            // InternalLegoLang.g:368:2: ( ( rule__Addition__Group__0 ) )
            // InternalLegoLang.g:369:3: ( rule__Addition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getGroup()); 
            }
            // InternalLegoLang.g:370:3: ( rule__Addition__Group__0 )
            // InternalLegoLang.g:370:4: rule__Addition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getGroup()); 
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
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // InternalLegoLang.g:379:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // InternalLegoLang.g:380:1: ( ruleMultiplication EOF )
            // InternalLegoLang.g:381:1: ruleMultiplication EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMultiplication();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // InternalLegoLang.g:388:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:392:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // InternalLegoLang.g:393:2: ( ( rule__Multiplication__Group__0 ) )
            {
            // InternalLegoLang.g:393:2: ( ( rule__Multiplication__Group__0 ) )
            // InternalLegoLang.g:394:3: ( rule__Multiplication__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getGroup()); 
            }
            // InternalLegoLang.g:395:3: ( rule__Multiplication__Group__0 )
            // InternalLegoLang.g:395:4: rule__Multiplication__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getGroup()); 
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
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRuleDivision"
    // InternalLegoLang.g:404:1: entryRuleDivision : ruleDivision EOF ;
    public final void entryRuleDivision() throws RecognitionException {
        try {
            // InternalLegoLang.g:405:1: ( ruleDivision EOF )
            // InternalLegoLang.g:406:1: ruleDivision EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivisionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDivision();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDivisionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDivision"


    // $ANTLR start "ruleDivision"
    // InternalLegoLang.g:413:1: ruleDivision : ( ( rule__Division__Group__0 ) ) ;
    public final void ruleDivision() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:417:2: ( ( ( rule__Division__Group__0 ) ) )
            // InternalLegoLang.g:418:2: ( ( rule__Division__Group__0 ) )
            {
            // InternalLegoLang.g:418:2: ( ( rule__Division__Group__0 ) )
            // InternalLegoLang.g:419:3: ( rule__Division__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivisionAccess().getGroup()); 
            }
            // InternalLegoLang.g:420:3: ( rule__Division__Group__0 )
            // InternalLegoLang.g:420:4: rule__Division__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Division__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDivisionAccess().getGroup()); 
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
    // $ANTLR end "ruleDivision"


    // $ANTLR start "entryRuleGT"
    // InternalLegoLang.g:429:1: entryRuleGT : ruleGT EOF ;
    public final void entryRuleGT() throws RecognitionException {
        try {
            // InternalLegoLang.g:430:1: ( ruleGT EOF )
            // InternalLegoLang.g:431:1: ruleGT EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGT();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGTRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleGT"


    // $ANTLR start "ruleGT"
    // InternalLegoLang.g:438:1: ruleGT : ( ( rule__GT__Group__0 ) ) ;
    public final void ruleGT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:442:2: ( ( ( rule__GT__Group__0 ) ) )
            // InternalLegoLang.g:443:2: ( ( rule__GT__Group__0 ) )
            {
            // InternalLegoLang.g:443:2: ( ( rule__GT__Group__0 ) )
            // InternalLegoLang.g:444:3: ( rule__GT__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTAccess().getGroup()); 
            }
            // InternalLegoLang.g:445:3: ( rule__GT__Group__0 )
            // InternalLegoLang.g:445:4: rule__GT__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GT__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGTAccess().getGroup()); 
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
    // $ANTLR end "ruleGT"


    // $ANTLR start "entryRuleLT"
    // InternalLegoLang.g:454:1: entryRuleLT : ruleLT EOF ;
    public final void entryRuleLT() throws RecognitionException {
        try {
            // InternalLegoLang.g:455:1: ( ruleLT EOF )
            // InternalLegoLang.g:456:1: ruleLT EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLT();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLTRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleLT"


    // $ANTLR start "ruleLT"
    // InternalLegoLang.g:463:1: ruleLT : ( ( rule__LT__Group__0 ) ) ;
    public final void ruleLT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:467:2: ( ( ( rule__LT__Group__0 ) ) )
            // InternalLegoLang.g:468:2: ( ( rule__LT__Group__0 ) )
            {
            // InternalLegoLang.g:468:2: ( ( rule__LT__Group__0 ) )
            // InternalLegoLang.g:469:3: ( rule__LT__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTAccess().getGroup()); 
            }
            // InternalLegoLang.g:470:3: ( rule__LT__Group__0 )
            // InternalLegoLang.g:470:4: rule__LT__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LT__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLTAccess().getGroup()); 
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
    // $ANTLR end "ruleLT"


    // $ANTLR start "entryRuleEqual"
    // InternalLegoLang.g:479:1: entryRuleEqual : ruleEqual EOF ;
    public final void entryRuleEqual() throws RecognitionException {
        try {
            // InternalLegoLang.g:480:1: ( ruleEqual EOF )
            // InternalLegoLang.g:481:1: ruleEqual EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEqual();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEqual"


    // $ANTLR start "ruleEqual"
    // InternalLegoLang.g:488:1: ruleEqual : ( ( rule__Equal__Group__0 ) ) ;
    public final void ruleEqual() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:492:2: ( ( ( rule__Equal__Group__0 ) ) )
            // InternalLegoLang.g:493:2: ( ( rule__Equal__Group__0 ) )
            {
            // InternalLegoLang.g:493:2: ( ( rule__Equal__Group__0 ) )
            // InternalLegoLang.g:494:3: ( rule__Equal__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualAccess().getGroup()); 
            }
            // InternalLegoLang.g:495:3: ( rule__Equal__Group__0 )
            // InternalLegoLang.g:495:4: rule__Equal__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Equal__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualAccess().getGroup()); 
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
    // $ANTLR end "ruleEqual"


    // $ANTLR start "entryRuleDifferent"
    // InternalLegoLang.g:504:1: entryRuleDifferent : ruleDifferent EOF ;
    public final void entryRuleDifferent() throws RecognitionException {
        try {
            // InternalLegoLang.g:505:1: ( ruleDifferent EOF )
            // InternalLegoLang.g:506:1: ruleDifferent EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDifferentRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDifferent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDifferentRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDifferent"


    // $ANTLR start "ruleDifferent"
    // InternalLegoLang.g:513:1: ruleDifferent : ( ( rule__Different__Group__0 ) ) ;
    public final void ruleDifferent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:517:2: ( ( ( rule__Different__Group__0 ) ) )
            // InternalLegoLang.g:518:2: ( ( rule__Different__Group__0 ) )
            {
            // InternalLegoLang.g:518:2: ( ( rule__Different__Group__0 ) )
            // InternalLegoLang.g:519:3: ( rule__Different__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDifferentAccess().getGroup()); 
            }
            // InternalLegoLang.g:520:3: ( rule__Different__Group__0 )
            // InternalLegoLang.g:520:4: rule__Different__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Different__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDifferentAccess().getGroup()); 
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
    // $ANTLR end "ruleDifferent"


    // $ANTLR start "entryRuleLTorEqual"
    // InternalLegoLang.g:529:1: entryRuleLTorEqual : ruleLTorEqual EOF ;
    public final void entryRuleLTorEqual() throws RecognitionException {
        try {
            // InternalLegoLang.g:530:1: ( ruleLTorEqual EOF )
            // InternalLegoLang.g:531:1: ruleLTorEqual EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTorEqualRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLTorEqual();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLTorEqualRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleLTorEqual"


    // $ANTLR start "ruleLTorEqual"
    // InternalLegoLang.g:538:1: ruleLTorEqual : ( ( rule__LTorEqual__Group__0 ) ) ;
    public final void ruleLTorEqual() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:542:2: ( ( ( rule__LTorEqual__Group__0 ) ) )
            // InternalLegoLang.g:543:2: ( ( rule__LTorEqual__Group__0 ) )
            {
            // InternalLegoLang.g:543:2: ( ( rule__LTorEqual__Group__0 ) )
            // InternalLegoLang.g:544:3: ( rule__LTorEqual__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTorEqualAccess().getGroup()); 
            }
            // InternalLegoLang.g:545:3: ( rule__LTorEqual__Group__0 )
            // InternalLegoLang.g:545:4: rule__LTorEqual__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LTorEqual__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLTorEqualAccess().getGroup()); 
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
    // $ANTLR end "ruleLTorEqual"


    // $ANTLR start "entryRuleGTorEqual"
    // InternalLegoLang.g:554:1: entryRuleGTorEqual : ruleGTorEqual EOF ;
    public final void entryRuleGTorEqual() throws RecognitionException {
        try {
            // InternalLegoLang.g:555:1: ( ruleGTorEqual EOF )
            // InternalLegoLang.g:556:1: ruleGTorEqual EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTorEqualRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGTorEqual();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGTorEqualRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleGTorEqual"


    // $ANTLR start "ruleGTorEqual"
    // InternalLegoLang.g:563:1: ruleGTorEqual : ( ( rule__GTorEqual__Group__0 ) ) ;
    public final void ruleGTorEqual() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:567:2: ( ( ( rule__GTorEqual__Group__0 ) ) )
            // InternalLegoLang.g:568:2: ( ( rule__GTorEqual__Group__0 ) )
            {
            // InternalLegoLang.g:568:2: ( ( rule__GTorEqual__Group__0 ) )
            // InternalLegoLang.g:569:3: ( rule__GTorEqual__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTorEqualAccess().getGroup()); 
            }
            // InternalLegoLang.g:570:3: ( rule__GTorEqual__Group__0 )
            // InternalLegoLang.g:570:4: rule__GTorEqual__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GTorEqual__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGTorEqualAccess().getGroup()); 
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
    // $ANTLR end "ruleGTorEqual"


    // $ANTLR start "entryRuleAssignement"
    // InternalLegoLang.g:579:1: entryRuleAssignement : ruleAssignement EOF ;
    public final void entryRuleAssignement() throws RecognitionException {
        try {
            // InternalLegoLang.g:580:1: ( ruleAssignement EOF )
            // InternalLegoLang.g:581:1: ruleAssignement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAssignement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAssignement"


    // $ANTLR start "ruleAssignement"
    // InternalLegoLang.g:588:1: ruleAssignement : ( ( rule__Assignement__Group__0 ) ) ;
    public final void ruleAssignement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:592:2: ( ( ( rule__Assignement__Group__0 ) ) )
            // InternalLegoLang.g:593:2: ( ( rule__Assignement__Group__0 ) )
            {
            // InternalLegoLang.g:593:2: ( ( rule__Assignement__Group__0 ) )
            // InternalLegoLang.g:594:3: ( rule__Assignement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignementAccess().getGroup()); 
            }
            // InternalLegoLang.g:595:3: ( rule__Assignement__Group__0 )
            // InternalLegoLang.g:595:4: rule__Assignement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Assignement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignementAccess().getGroup()); 
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
    // $ANTLR end "ruleAssignement"


    // $ANTLR start "entryRulePlusEqual"
    // InternalLegoLang.g:604:1: entryRulePlusEqual : rulePlusEqual EOF ;
    public final void entryRulePlusEqual() throws RecognitionException {
        try {
            // InternalLegoLang.g:605:1: ( rulePlusEqual EOF )
            // InternalLegoLang.g:606:1: rulePlusEqual EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusEqualRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePlusEqual();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusEqualRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRulePlusEqual"


    // $ANTLR start "rulePlusEqual"
    // InternalLegoLang.g:613:1: rulePlusEqual : ( ( rule__PlusEqual__Group__0 ) ) ;
    public final void rulePlusEqual() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:617:2: ( ( ( rule__PlusEqual__Group__0 ) ) )
            // InternalLegoLang.g:618:2: ( ( rule__PlusEqual__Group__0 ) )
            {
            // InternalLegoLang.g:618:2: ( ( rule__PlusEqual__Group__0 ) )
            // InternalLegoLang.g:619:3: ( rule__PlusEqual__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusEqualAccess().getGroup()); 
            }
            // InternalLegoLang.g:620:3: ( rule__PlusEqual__Group__0 )
            // InternalLegoLang.g:620:4: rule__PlusEqual__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PlusEqual__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusEqualAccess().getGroup()); 
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
    // $ANTLR end "rulePlusEqual"


    // $ANTLR start "entryRuleMinusEqual"
    // InternalLegoLang.g:629:1: entryRuleMinusEqual : ruleMinusEqual EOF ;
    public final void entryRuleMinusEqual() throws RecognitionException {
        try {
            // InternalLegoLang.g:630:1: ( ruleMinusEqual EOF )
            // InternalLegoLang.g:631:1: ruleMinusEqual EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinusEqualRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMinusEqual();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMinusEqualRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMinusEqual"


    // $ANTLR start "ruleMinusEqual"
    // InternalLegoLang.g:638:1: ruleMinusEqual : ( ( rule__MinusEqual__Group__0 ) ) ;
    public final void ruleMinusEqual() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:642:2: ( ( ( rule__MinusEqual__Group__0 ) ) )
            // InternalLegoLang.g:643:2: ( ( rule__MinusEqual__Group__0 ) )
            {
            // InternalLegoLang.g:643:2: ( ( rule__MinusEqual__Group__0 ) )
            // InternalLegoLang.g:644:3: ( rule__MinusEqual__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinusEqualAccess().getGroup()); 
            }
            // InternalLegoLang.g:645:3: ( rule__MinusEqual__Group__0 )
            // InternalLegoLang.g:645:4: rule__MinusEqual__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MinusEqual__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMinusEqualAccess().getGroup()); 
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
    // $ANTLR end "ruleMinusEqual"


    // $ANTLR start "entryRuleEBoolean"
    // InternalLegoLang.g:654:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalLegoLang.g:655:1: ( ruleEBoolean EOF )
            // InternalLegoLang.g:656:1: ruleEBoolean EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEBooleanRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEBooleanRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalLegoLang.g:663:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:667:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalLegoLang.g:668:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalLegoLang.g:668:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalLegoLang.g:669:3: ( rule__EBoolean__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            }
            // InternalLegoLang.g:670:3: ( rule__EBoolean__Alternatives )
            // InternalLegoLang.g:670:4: rule__EBoolean__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EBoolean__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEBooleanAccess().getAlternatives()); 
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
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleUnInteger"
    // InternalLegoLang.g:679:1: entryRuleUnInteger : ruleUnInteger EOF ;
    public final void entryRuleUnInteger() throws RecognitionException {
        try {
            // InternalLegoLang.g:680:1: ( ruleUnInteger EOF )
            // InternalLegoLang.g:681:1: ruleUnInteger EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnIntegerRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleUnInteger();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnIntegerRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleUnInteger"


    // $ANTLR start "ruleUnInteger"
    // InternalLegoLang.g:688:1: ruleUnInteger : ( ( rule__UnInteger__Group__0 ) ) ;
    public final void ruleUnInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:692:2: ( ( ( rule__UnInteger__Group__0 ) ) )
            // InternalLegoLang.g:693:2: ( ( rule__UnInteger__Group__0 ) )
            {
            // InternalLegoLang.g:693:2: ( ( rule__UnInteger__Group__0 ) )
            // InternalLegoLang.g:694:3: ( rule__UnInteger__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnIntegerAccess().getGroup()); 
            }
            // InternalLegoLang.g:695:3: ( rule__UnInteger__Group__0 )
            // InternalLegoLang.g:695:4: rule__UnInteger__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UnInteger__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnIntegerAccess().getGroup()); 
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
    // $ANTLR end "ruleUnInteger"


    // $ANTLR start "entryRuleUnDouble"
    // InternalLegoLang.g:704:1: entryRuleUnDouble : ruleUnDouble EOF ;
    public final void entryRuleUnDouble() throws RecognitionException {
        try {
            // InternalLegoLang.g:705:1: ( ruleUnDouble EOF )
            // InternalLegoLang.g:706:1: ruleUnDouble EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnDoubleRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleUnDouble();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnDoubleRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleUnDouble"


    // $ANTLR start "ruleUnDouble"
    // InternalLegoLang.g:713:1: ruleUnDouble : ( ( rule__UnDouble__Group__0 ) ) ;
    public final void ruleUnDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:717:2: ( ( ( rule__UnDouble__Group__0 ) ) )
            // InternalLegoLang.g:718:2: ( ( rule__UnDouble__Group__0 ) )
            {
            // InternalLegoLang.g:718:2: ( ( rule__UnDouble__Group__0 ) )
            // InternalLegoLang.g:719:3: ( rule__UnDouble__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnDoubleAccess().getGroup()); 
            }
            // InternalLegoLang.g:720:3: ( rule__UnDouble__Group__0 )
            // InternalLegoLang.g:720:4: rule__UnDouble__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UnDouble__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnDoubleAccess().getGroup()); 
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
    // $ANTLR end "ruleUnDouble"


    // $ANTLR start "entryRuleUnBoolean"
    // InternalLegoLang.g:729:1: entryRuleUnBoolean : ruleUnBoolean EOF ;
    public final void entryRuleUnBoolean() throws RecognitionException {
        try {
            // InternalLegoLang.g:730:1: ( ruleUnBoolean EOF )
            // InternalLegoLang.g:731:1: ruleUnBoolean EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnBooleanRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleUnBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnBooleanRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleUnBoolean"


    // $ANTLR start "ruleUnBoolean"
    // InternalLegoLang.g:738:1: ruleUnBoolean : ( ( rule__UnBoolean__Group__0 ) ) ;
    public final void ruleUnBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:742:2: ( ( ( rule__UnBoolean__Group__0 ) ) )
            // InternalLegoLang.g:743:2: ( ( rule__UnBoolean__Group__0 ) )
            {
            // InternalLegoLang.g:743:2: ( ( rule__UnBoolean__Group__0 ) )
            // InternalLegoLang.g:744:3: ( rule__UnBoolean__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnBooleanAccess().getGroup()); 
            }
            // InternalLegoLang.g:745:3: ( rule__UnBoolean__Group__0 )
            // InternalLegoLang.g:745:4: rule__UnBoolean__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UnBoolean__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnBooleanAccess().getGroup()); 
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
    // $ANTLR end "ruleUnBoolean"


    // $ANTLR start "entryRuleUnString"
    // InternalLegoLang.g:754:1: entryRuleUnString : ruleUnString EOF ;
    public final void entryRuleUnString() throws RecognitionException {
        try {
            // InternalLegoLang.g:755:1: ( ruleUnString EOF )
            // InternalLegoLang.g:756:1: ruleUnString EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnStringRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleUnString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnStringRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleUnString"


    // $ANTLR start "ruleUnString"
    // InternalLegoLang.g:763:1: ruleUnString : ( ( rule__UnString__Group__0 ) ) ;
    public final void ruleUnString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:767:2: ( ( ( rule__UnString__Group__0 ) ) )
            // InternalLegoLang.g:768:2: ( ( rule__UnString__Group__0 ) )
            {
            // InternalLegoLang.g:768:2: ( ( rule__UnString__Group__0 ) )
            // InternalLegoLang.g:769:3: ( rule__UnString__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnStringAccess().getGroup()); 
            }
            // InternalLegoLang.g:770:3: ( rule__UnString__Group__0 )
            // InternalLegoLang.g:770:4: rule__UnString__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UnString__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnStringAccess().getGroup()); 
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
    // $ANTLR end "ruleUnString"


    // $ANTLR start "entryRuleTheDouble"
    // InternalLegoLang.g:779:1: entryRuleTheDouble : ruleTheDouble EOF ;
    public final void entryRuleTheDouble() throws RecognitionException {
        try {
            // InternalLegoLang.g:780:1: ( ruleTheDouble EOF )
            // InternalLegoLang.g:781:1: ruleTheDouble EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheDoubleRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTheDouble();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTheDoubleRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleTheDouble"


    // $ANTLR start "ruleTheDouble"
    // InternalLegoLang.g:788:1: ruleTheDouble : ( ( rule__TheDouble__Group__0 ) ) ;
    public final void ruleTheDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:792:2: ( ( ( rule__TheDouble__Group__0 ) ) )
            // InternalLegoLang.g:793:2: ( ( rule__TheDouble__Group__0 ) )
            {
            // InternalLegoLang.g:793:2: ( ( rule__TheDouble__Group__0 ) )
            // InternalLegoLang.g:794:3: ( rule__TheDouble__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheDoubleAccess().getGroup()); 
            }
            // InternalLegoLang.g:795:3: ( rule__TheDouble__Group__0 )
            // InternalLegoLang.g:795:4: rule__TheDouble__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TheDouble__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTheDoubleAccess().getGroup()); 
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
    // $ANTLR end "ruleTheDouble"


    // $ANTLR start "entryRuleTheInt"
    // InternalLegoLang.g:804:1: entryRuleTheInt : ruleTheInt EOF ;
    public final void entryRuleTheInt() throws RecognitionException {
        try {
            // InternalLegoLang.g:805:1: ( ruleTheInt EOF )
            // InternalLegoLang.g:806:1: ruleTheInt EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheIntRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTheInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTheIntRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleTheInt"


    // $ANTLR start "ruleTheInt"
    // InternalLegoLang.g:813:1: ruleTheInt : ( ( rule__TheInt__Group__0 ) ) ;
    public final void ruleTheInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:817:2: ( ( ( rule__TheInt__Group__0 ) ) )
            // InternalLegoLang.g:818:2: ( ( rule__TheInt__Group__0 ) )
            {
            // InternalLegoLang.g:818:2: ( ( rule__TheInt__Group__0 ) )
            // InternalLegoLang.g:819:3: ( rule__TheInt__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheIntAccess().getGroup()); 
            }
            // InternalLegoLang.g:820:3: ( rule__TheInt__Group__0 )
            // InternalLegoLang.g:820:4: rule__TheInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TheInt__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTheIntAccess().getGroup()); 
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
    // $ANTLR end "ruleTheInt"


    // $ANTLR start "entryRuleTheBoolean"
    // InternalLegoLang.g:829:1: entryRuleTheBoolean : ruleTheBoolean EOF ;
    public final void entryRuleTheBoolean() throws RecognitionException {
        try {
            // InternalLegoLang.g:830:1: ( ruleTheBoolean EOF )
            // InternalLegoLang.g:831:1: ruleTheBoolean EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheBooleanRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTheBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTheBooleanRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleTheBoolean"


    // $ANTLR start "ruleTheBoolean"
    // InternalLegoLang.g:838:1: ruleTheBoolean : ( ( rule__TheBoolean__Group__0 ) ) ;
    public final void ruleTheBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:842:2: ( ( ( rule__TheBoolean__Group__0 ) ) )
            // InternalLegoLang.g:843:2: ( ( rule__TheBoolean__Group__0 ) )
            {
            // InternalLegoLang.g:843:2: ( ( rule__TheBoolean__Group__0 ) )
            // InternalLegoLang.g:844:3: ( rule__TheBoolean__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheBooleanAccess().getGroup()); 
            }
            // InternalLegoLang.g:845:3: ( rule__TheBoolean__Group__0 )
            // InternalLegoLang.g:845:4: rule__TheBoolean__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TheBoolean__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTheBooleanAccess().getGroup()); 
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
    // $ANTLR end "ruleTheBoolean"


    // $ANTLR start "entryRuleTheString"
    // InternalLegoLang.g:854:1: entryRuleTheString : ruleTheString EOF ;
    public final void entryRuleTheString() throws RecognitionException {
        try {
            // InternalLegoLang.g:855:1: ( ruleTheString EOF )
            // InternalLegoLang.g:856:1: ruleTheString EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheStringRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTheString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTheStringRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleTheString"


    // $ANTLR start "ruleTheString"
    // InternalLegoLang.g:863:1: ruleTheString : ( ( rule__TheString__Group__0 ) ) ;
    public final void ruleTheString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:867:2: ( ( ( rule__TheString__Group__0 ) ) )
            // InternalLegoLang.g:868:2: ( ( rule__TheString__Group__0 ) )
            {
            // InternalLegoLang.g:868:2: ( ( rule__TheString__Group__0 ) )
            // InternalLegoLang.g:869:3: ( rule__TheString__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheStringAccess().getGroup()); 
            }
            // InternalLegoLang.g:870:3: ( rule__TheString__Group__0 )
            // InternalLegoLang.g:870:4: rule__TheString__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TheString__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTheStringAccess().getGroup()); 
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
    // $ANTLR end "ruleTheString"


    // $ANTLR start "entryRuleEInt"
    // InternalLegoLang.g:879:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalLegoLang.g:880:1: ( ruleEInt EOF )
            // InternalLegoLang.g:881:1: ruleEInt EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEIntRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalLegoLang.g:888:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:892:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalLegoLang.g:893:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalLegoLang.g:893:2: ( ( rule__EInt__Group__0 ) )
            // InternalLegoLang.g:894:3: ( rule__EInt__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntAccess().getGroup()); 
            }
            // InternalLegoLang.g:895:3: ( rule__EInt__Group__0 )
            // InternalLegoLang.g:895:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEIntAccess().getGroup()); 
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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalLegoLang.g:903:1: rule__Statement__Alternatives : ( ( ruleWhileLoop ) | ( ruleVariable ) | ( ruleExpression ) | ( ruleConditionEtat ) | ( ruleMethodePrint ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:907:1: ( ( ruleWhileLoop ) | ( ruleVariable ) | ( ruleExpression ) | ( ruleConditionEtat ) | ( ruleMethodePrint ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt1=1;
                }
                break;
            case 37:
            case 39:
            case 41:
            case 42:
            case 43:
                {
                alt1=2;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
            case RULE_INT:
            case 11:
            case 12:
            case 22:
            case 23:
                {
                alt1=3;
                }
                break;
            case 16:
                {
                alt1=4;
                }
                break;
            case 19:
                {
                alt1=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalLegoLang.g:908:2: ( ruleWhileLoop )
                    {
                    // InternalLegoLang.g:908:2: ( ruleWhileLoop )
                    // InternalLegoLang.g:909:3: ruleWhileLoop
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getWhileLoopParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleWhileLoop();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getWhileLoopParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalLegoLang.g:914:2: ( ruleVariable )
                    {
                    // InternalLegoLang.g:914:2: ( ruleVariable )
                    // InternalLegoLang.g:915:3: ruleVariable
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getVariableParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleVariable();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getVariableParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalLegoLang.g:920:2: ( ruleExpression )
                    {
                    // InternalLegoLang.g:920:2: ( ruleExpression )
                    // InternalLegoLang.g:921:3: ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getExpressionParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getExpressionParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalLegoLang.g:926:2: ( ruleConditionEtat )
                    {
                    // InternalLegoLang.g:926:2: ( ruleConditionEtat )
                    // InternalLegoLang.g:927:3: ruleConditionEtat
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getConditionEtatParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleConditionEtat();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getConditionEtatParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalLegoLang.g:932:2: ( ruleMethodePrint )
                    {
                    // InternalLegoLang.g:932:2: ( ruleMethodePrint )
                    // InternalLegoLang.g:933:3: ruleMethodePrint
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getMethodePrintParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleMethodePrint();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getMethodePrintParserRuleCall_4()); 
                    }

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
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__Expression__Alternatives"
    // InternalLegoLang.g:942:1: rule__Expression__Alternatives : ( ( ruleVariableRef ) | ( ruleBinaryOperation ) | ( ruleTheString ) | ( ruleTheDouble ) | ( ruleTheInt ) | ( ruleTheBoolean ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:946:1: ( ( ruleVariableRef ) | ( ruleBinaryOperation ) | ( ruleTheString ) | ( ruleTheDouble ) | ( ruleTheInt ) | ( ruleTheBoolean ) )
            int alt2=6;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalLegoLang.g:947:2: ( ruleVariableRef )
                    {
                    // InternalLegoLang.g:947:2: ( ruleVariableRef )
                    // InternalLegoLang.g:948:3: ruleVariableRef
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getVariableRefParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleVariableRef();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getVariableRefParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalLegoLang.g:953:2: ( ruleBinaryOperation )
                    {
                    // InternalLegoLang.g:953:2: ( ruleBinaryOperation )
                    // InternalLegoLang.g:954:3: ruleBinaryOperation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getBinaryOperationParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBinaryOperation();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getBinaryOperationParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalLegoLang.g:959:2: ( ruleTheString )
                    {
                    // InternalLegoLang.g:959:2: ( ruleTheString )
                    // InternalLegoLang.g:960:3: ruleTheString
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getTheStringParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleTheString();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getTheStringParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalLegoLang.g:965:2: ( ruleTheDouble )
                    {
                    // InternalLegoLang.g:965:2: ( ruleTheDouble )
                    // InternalLegoLang.g:966:3: ruleTheDouble
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getTheDoubleParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleTheDouble();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getTheDoubleParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalLegoLang.g:971:2: ( ruleTheInt )
                    {
                    // InternalLegoLang.g:971:2: ( ruleTheInt )
                    // InternalLegoLang.g:972:3: ruleTheInt
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getTheIntParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleTheInt();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getTheIntParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalLegoLang.g:977:2: ( ruleTheBoolean )
                    {
                    // InternalLegoLang.g:977:2: ( ruleTheBoolean )
                    // InternalLegoLang.g:978:3: ruleTheBoolean
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getTheBooleanParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleTheBoolean();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getTheBooleanParserRuleCall_5()); 
                    }

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
    // $ANTLR end "rule__Expression__Alternatives"


    // $ANTLR start "rule__BinaryOperation__Alternatives"
    // InternalLegoLang.g:987:1: rule__BinaryOperation__Alternatives : ( ( ruleSubstraction ) | ( ruleComparaison ) | ( ruleAssignement ) | ( ruleDivision ) | ( ruleMultiplication ) | ( ruleAddition ) | ( ruleMinusEqual ) | ( rulePlusEqual ) );
    public final void rule__BinaryOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:991:1: ( ( ruleSubstraction ) | ( ruleComparaison ) | ( ruleAssignement ) | ( ruleDivision ) | ( ruleMultiplication ) | ( ruleAddition ) | ( ruleMinusEqual ) | ( rulePlusEqual ) )
            int alt3=8;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalLegoLang.g:992:2: ( ruleSubstraction )
                    {
                    // InternalLegoLang.g:992:2: ( ruleSubstraction )
                    // InternalLegoLang.g:993:3: ruleSubstraction
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryOperationAccess().getSubstractionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleSubstraction();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryOperationAccess().getSubstractionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalLegoLang.g:998:2: ( ruleComparaison )
                    {
                    // InternalLegoLang.g:998:2: ( ruleComparaison )
                    // InternalLegoLang.g:999:3: ruleComparaison
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryOperationAccess().getComparaisonParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleComparaison();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryOperationAccess().getComparaisonParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalLegoLang.g:1004:2: ( ruleAssignement )
                    {
                    // InternalLegoLang.g:1004:2: ( ruleAssignement )
                    // InternalLegoLang.g:1005:3: ruleAssignement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryOperationAccess().getAssignementParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleAssignement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryOperationAccess().getAssignementParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalLegoLang.g:1010:2: ( ruleDivision )
                    {
                    // InternalLegoLang.g:1010:2: ( ruleDivision )
                    // InternalLegoLang.g:1011:3: ruleDivision
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryOperationAccess().getDivisionParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleDivision();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryOperationAccess().getDivisionParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalLegoLang.g:1016:2: ( ruleMultiplication )
                    {
                    // InternalLegoLang.g:1016:2: ( ruleMultiplication )
                    // InternalLegoLang.g:1017:3: ruleMultiplication
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryOperationAccess().getMultiplicationParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleMultiplication();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryOperationAccess().getMultiplicationParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalLegoLang.g:1022:2: ( ruleAddition )
                    {
                    // InternalLegoLang.g:1022:2: ( ruleAddition )
                    // InternalLegoLang.g:1023:3: ruleAddition
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryOperationAccess().getAdditionParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleAddition();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryOperationAccess().getAdditionParserRuleCall_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalLegoLang.g:1028:2: ( ruleMinusEqual )
                    {
                    // InternalLegoLang.g:1028:2: ( ruleMinusEqual )
                    // InternalLegoLang.g:1029:3: ruleMinusEqual
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryOperationAccess().getMinusEqualParserRuleCall_6()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleMinusEqual();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryOperationAccess().getMinusEqualParserRuleCall_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalLegoLang.g:1034:2: ( rulePlusEqual )
                    {
                    // InternalLegoLang.g:1034:2: ( rulePlusEqual )
                    // InternalLegoLang.g:1035:3: rulePlusEqual
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryOperationAccess().getPlusEqualParserRuleCall_7()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulePlusEqual();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryOperationAccess().getPlusEqualParserRuleCall_7()); 
                    }

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
    // $ANTLR end "rule__BinaryOperation__Alternatives"


    // $ANTLR start "rule__Variable__Alternatives"
    // InternalLegoLang.g:1044:1: rule__Variable__Alternatives : ( ( ruleUnInteger ) | ( ruleUnString ) | ( ruleUnBoolean ) | ( ruleUnDouble ) );
    public final void rule__Variable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1048:1: ( ( ruleUnInteger ) | ( ruleUnString ) | ( ruleUnBoolean ) | ( ruleUnDouble ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 43:
                {
                switch ( input.LA(2) ) {
                case 42:
                    {
                    alt4=2;
                    }
                    break;
                case 39:
                    {
                    alt4=4;
                    }
                    break;
                case 41:
                    {
                    alt4=3;
                    }
                    break;
                case 37:
                    {
                    alt4=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }

                }
                break;
            case 37:
                {
                alt4=1;
                }
                break;
            case 42:
                {
                alt4=2;
                }
                break;
            case 41:
                {
                alt4=3;
                }
                break;
            case 39:
                {
                alt4=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalLegoLang.g:1049:2: ( ruleUnInteger )
                    {
                    // InternalLegoLang.g:1049:2: ( ruleUnInteger )
                    // InternalLegoLang.g:1050:3: ruleUnInteger
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVariableAccess().getUnIntegerParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleUnInteger();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVariableAccess().getUnIntegerParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalLegoLang.g:1055:2: ( ruleUnString )
                    {
                    // InternalLegoLang.g:1055:2: ( ruleUnString )
                    // InternalLegoLang.g:1056:3: ruleUnString
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVariableAccess().getUnStringParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleUnString();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVariableAccess().getUnStringParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalLegoLang.g:1061:2: ( ruleUnBoolean )
                    {
                    // InternalLegoLang.g:1061:2: ( ruleUnBoolean )
                    // InternalLegoLang.g:1062:3: ruleUnBoolean
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVariableAccess().getUnBooleanParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleUnBoolean();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVariableAccess().getUnBooleanParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalLegoLang.g:1067:2: ( ruleUnDouble )
                    {
                    // InternalLegoLang.g:1067:2: ( ruleUnDouble )
                    // InternalLegoLang.g:1068:3: ruleUnDouble
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVariableAccess().getUnDoubleParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleUnDouble();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVariableAccess().getUnDoubleParserRuleCall_3()); 
                    }

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
    // $ANTLR end "rule__Variable__Alternatives"


    // $ANTLR start "rule__Comparaison__Alternatives"
    // InternalLegoLang.g:1077:1: rule__Comparaison__Alternatives : ( ( ruleGT ) | ( ruleEqual ) | ( ruleLT ) | ( ruleDifferent ) | ( ruleGTorEqual ) | ( ruleLTorEqual ) );
    public final void rule__Comparaison__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1081:1: ( ( ruleGT ) | ( ruleEqual ) | ( ruleLT ) | ( ruleDifferent ) | ( ruleGTorEqual ) | ( ruleLTorEqual ) )
            int alt5=6;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                int LA5_1 = input.LA(2);

                if ( (synpred20_InternalLegoLang()) ) {
                    alt5=1;
                }
                else if ( (synpred21_InternalLegoLang()) ) {
                    alt5=2;
                }
                else if ( (synpred22_InternalLegoLang()) ) {
                    alt5=3;
                }
                else if ( (synpred23_InternalLegoLang()) ) {
                    alt5=4;
                }
                else if ( (synpred24_InternalLegoLang()) ) {
                    alt5=5;
                }
                else if ( (true) ) {
                    alt5=6;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalLegoLang.g:1082:2: ( ruleGT )
                    {
                    // InternalLegoLang.g:1082:2: ( ruleGT )
                    // InternalLegoLang.g:1083:3: ruleGT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparaisonAccess().getGTParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleGT();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparaisonAccess().getGTParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalLegoLang.g:1088:2: ( ruleEqual )
                    {
                    // InternalLegoLang.g:1088:2: ( ruleEqual )
                    // InternalLegoLang.g:1089:3: ruleEqual
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparaisonAccess().getEqualParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleEqual();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparaisonAccess().getEqualParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalLegoLang.g:1094:2: ( ruleLT )
                    {
                    // InternalLegoLang.g:1094:2: ( ruleLT )
                    // InternalLegoLang.g:1095:3: ruleLT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparaisonAccess().getLTParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleLT();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparaisonAccess().getLTParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalLegoLang.g:1100:2: ( ruleDifferent )
                    {
                    // InternalLegoLang.g:1100:2: ( ruleDifferent )
                    // InternalLegoLang.g:1101:3: ruleDifferent
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparaisonAccess().getDifferentParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleDifferent();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparaisonAccess().getDifferentParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalLegoLang.g:1106:2: ( ruleGTorEqual )
                    {
                    // InternalLegoLang.g:1106:2: ( ruleGTorEqual )
                    // InternalLegoLang.g:1107:3: ruleGTorEqual
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparaisonAccess().getGTorEqualParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleGTorEqual();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparaisonAccess().getGTorEqualParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalLegoLang.g:1112:2: ( ruleLTorEqual )
                    {
                    // InternalLegoLang.g:1112:2: ( ruleLTorEqual )
                    // InternalLegoLang.g:1113:3: ruleLTorEqual
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparaisonAccess().getLTorEqualParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleLTorEqual();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparaisonAccess().getLTorEqualParserRuleCall_5()); 
                    }

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
    // $ANTLR end "rule__Comparaison__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalLegoLang.g:1122:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1126:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalLegoLang.g:1127:2: ( RULE_STRING )
                    {
                    // InternalLegoLang.g:1127:2: ( RULE_STRING )
                    // InternalLegoLang.g:1128:3: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }
                    match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalLegoLang.g:1133:2: ( RULE_ID )
                    {
                    // InternalLegoLang.g:1133:2: ( RULE_ID )
                    // InternalLegoLang.g:1134:3: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    }
                    match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    }

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__EBoolean__Alternatives"
    // InternalLegoLang.g:1143:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1147:1: ( ( 'true' ) | ( 'false' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==11) ) {
                alt7=1;
            }
            else if ( (LA7_0==12) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalLegoLang.g:1148:2: ( 'true' )
                    {
                    // InternalLegoLang.g:1148:2: ( 'true' )
                    // InternalLegoLang.g:1149:3: 'true'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    }
                    match(input,11,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalLegoLang.g:1154:2: ( 'false' )
                    {
                    // InternalLegoLang.g:1154:2: ( 'false' )
                    // InternalLegoLang.g:1155:3: 'false'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    }
                    match(input,12,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    }

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
    // $ANTLR end "rule__EBoolean__Alternatives"


    // $ANTLR start "rule__Program__Group__0"
    // InternalLegoLang.g:1164:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1168:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalLegoLang.g:1169:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Program__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Program__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0"


    // $ANTLR start "rule__Program__Group__0__Impl"
    // InternalLegoLang.g:1176:1: rule__Program__Group__0__Impl : ( () ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1180:1: ( ( () ) )
            // InternalLegoLang.g:1181:1: ( () )
            {
            // InternalLegoLang.g:1181:1: ( () )
            // InternalLegoLang.g:1182:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getProgramAction_0()); 
            }
            // InternalLegoLang.g:1183:2: ()
            // InternalLegoLang.g:1183:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getProgramAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0__Impl"


    // $ANTLR start "rule__Program__Group__1"
    // InternalLegoLang.g:1191:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1195:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // InternalLegoLang.g:1196:2: rule__Program__Group__1__Impl rule__Program__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Program__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Program__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1"


    // $ANTLR start "rule__Program__Group__1__Impl"
    // InternalLegoLang.g:1203:1: rule__Program__Group__1__Impl : ( 'Program' ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1207:1: ( ( 'Program' ) )
            // InternalLegoLang.g:1208:1: ( 'Program' )
            {
            // InternalLegoLang.g:1208:1: ( 'Program' )
            // InternalLegoLang.g:1209:2: 'Program'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getProgramKeyword_1()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getProgramKeyword_1()); 
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
    // $ANTLR end "rule__Program__Group__1__Impl"


    // $ANTLR start "rule__Program__Group__2"
    // InternalLegoLang.g:1218:1: rule__Program__Group__2 : rule__Program__Group__2__Impl rule__Program__Group__3 ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1222:1: ( rule__Program__Group__2__Impl rule__Program__Group__3 )
            // InternalLegoLang.g:1223:2: rule__Program__Group__2__Impl rule__Program__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Program__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Program__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__2"


    // $ANTLR start "rule__Program__Group__2__Impl"
    // InternalLegoLang.g:1230:1: rule__Program__Group__2__Impl : ( ( rule__Program__NameAssignment_2 ) ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1234:1: ( ( ( rule__Program__NameAssignment_2 ) ) )
            // InternalLegoLang.g:1235:1: ( ( rule__Program__NameAssignment_2 ) )
            {
            // InternalLegoLang.g:1235:1: ( ( rule__Program__NameAssignment_2 ) )
            // InternalLegoLang.g:1236:2: ( rule__Program__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getNameAssignment_2()); 
            }
            // InternalLegoLang.g:1237:2: ( rule__Program__NameAssignment_2 )
            // InternalLegoLang.g:1237:3: rule__Program__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Program__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getNameAssignment_2()); 
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
    // $ANTLR end "rule__Program__Group__2__Impl"


    // $ANTLR start "rule__Program__Group__3"
    // InternalLegoLang.g:1245:1: rule__Program__Group__3 : rule__Program__Group__3__Impl rule__Program__Group__4 ;
    public final void rule__Program__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1249:1: ( rule__Program__Group__3__Impl rule__Program__Group__4 )
            // InternalLegoLang.g:1250:2: rule__Program__Group__3__Impl rule__Program__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Program__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Program__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__3"


    // $ANTLR start "rule__Program__Group__3__Impl"
    // InternalLegoLang.g:1257:1: rule__Program__Group__3__Impl : ( '{' ) ;
    public final void rule__Program__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1261:1: ( ( '{' ) )
            // InternalLegoLang.g:1262:1: ( '{' )
            {
            // InternalLegoLang.g:1262:1: ( '{' )
            // InternalLegoLang.g:1263:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_3()); 
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
    // $ANTLR end "rule__Program__Group__3__Impl"


    // $ANTLR start "rule__Program__Group__4"
    // InternalLegoLang.g:1272:1: rule__Program__Group__4 : rule__Program__Group__4__Impl rule__Program__Group__5 ;
    public final void rule__Program__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1276:1: ( rule__Program__Group__4__Impl rule__Program__Group__5 )
            // InternalLegoLang.g:1277:2: rule__Program__Group__4__Impl rule__Program__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Program__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Program__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__4"


    // $ANTLR start "rule__Program__Group__4__Impl"
    // InternalLegoLang.g:1284:1: rule__Program__Group__4__Impl : ( ( rule__Program__StatementAssignment_4 )* ) ;
    public final void rule__Program__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1288:1: ( ( ( rule__Program__StatementAssignment_4 )* ) )
            // InternalLegoLang.g:1289:1: ( ( rule__Program__StatementAssignment_4 )* )
            {
            // InternalLegoLang.g:1289:1: ( ( rule__Program__StatementAssignment_4 )* )
            // InternalLegoLang.g:1290:2: ( rule__Program__StatementAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getStatementAssignment_4()); 
            }
            // InternalLegoLang.g:1291:2: ( rule__Program__StatementAssignment_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_STRING && LA8_0<=RULE_INT)||(LA8_0>=11 && LA8_0<=12)||LA8_0==16||(LA8_0>=18 && LA8_0<=19)||(LA8_0>=22 && LA8_0<=23)||LA8_0==37||LA8_0==39||(LA8_0>=41 && LA8_0<=43)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalLegoLang.g:1291:3: rule__Program__StatementAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Program__StatementAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getStatementAssignment_4()); 
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
    // $ANTLR end "rule__Program__Group__4__Impl"


    // $ANTLR start "rule__Program__Group__5"
    // InternalLegoLang.g:1299:1: rule__Program__Group__5 : rule__Program__Group__5__Impl ;
    public final void rule__Program__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1303:1: ( rule__Program__Group__5__Impl )
            // InternalLegoLang.g:1304:2: rule__Program__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__5"


    // $ANTLR start "rule__Program__Group__5__Impl"
    // InternalLegoLang.g:1310:1: rule__Program__Group__5__Impl : ( '}' ) ;
    public final void rule__Program__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1314:1: ( ( '}' ) )
            // InternalLegoLang.g:1315:1: ( '}' )
            {
            // InternalLegoLang.g:1315:1: ( '}' )
            // InternalLegoLang.g:1316:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_5()); 
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
    // $ANTLR end "rule__Program__Group__5__Impl"


    // $ANTLR start "rule__ConditionEtat__Group__0"
    // InternalLegoLang.g:1326:1: rule__ConditionEtat__Group__0 : rule__ConditionEtat__Group__0__Impl rule__ConditionEtat__Group__1 ;
    public final void rule__ConditionEtat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1330:1: ( rule__ConditionEtat__Group__0__Impl rule__ConditionEtat__Group__1 )
            // InternalLegoLang.g:1331:2: rule__ConditionEtat__Group__0__Impl rule__ConditionEtat__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ConditionEtat__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConditionEtat__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionEtat__Group__0"


    // $ANTLR start "rule__ConditionEtat__Group__0__Impl"
    // InternalLegoLang.g:1338:1: rule__ConditionEtat__Group__0__Impl : ( 'if' ) ;
    public final void rule__ConditionEtat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1342:1: ( ( 'if' ) )
            // InternalLegoLang.g:1343:1: ( 'if' )
            {
            // InternalLegoLang.g:1343:1: ( 'if' )
            // InternalLegoLang.g:1344:2: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionEtatAccess().getIfKeyword_0()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionEtatAccess().getIfKeyword_0()); 
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
    // $ANTLR end "rule__ConditionEtat__Group__0__Impl"


    // $ANTLR start "rule__ConditionEtat__Group__1"
    // InternalLegoLang.g:1353:1: rule__ConditionEtat__Group__1 : rule__ConditionEtat__Group__1__Impl rule__ConditionEtat__Group__2 ;
    public final void rule__ConditionEtat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1357:1: ( rule__ConditionEtat__Group__1__Impl rule__ConditionEtat__Group__2 )
            // InternalLegoLang.g:1358:2: rule__ConditionEtat__Group__1__Impl rule__ConditionEtat__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ConditionEtat__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConditionEtat__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionEtat__Group__1"


    // $ANTLR start "rule__ConditionEtat__Group__1__Impl"
    // InternalLegoLang.g:1365:1: rule__ConditionEtat__Group__1__Impl : ( ( rule__ConditionEtat__ConditionAssignment_1 ) ) ;
    public final void rule__ConditionEtat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1369:1: ( ( ( rule__ConditionEtat__ConditionAssignment_1 ) ) )
            // InternalLegoLang.g:1370:1: ( ( rule__ConditionEtat__ConditionAssignment_1 ) )
            {
            // InternalLegoLang.g:1370:1: ( ( rule__ConditionEtat__ConditionAssignment_1 ) )
            // InternalLegoLang.g:1371:2: ( rule__ConditionEtat__ConditionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionEtatAccess().getConditionAssignment_1()); 
            }
            // InternalLegoLang.g:1372:2: ( rule__ConditionEtat__ConditionAssignment_1 )
            // InternalLegoLang.g:1372:3: rule__ConditionEtat__ConditionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ConditionEtat__ConditionAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionEtatAccess().getConditionAssignment_1()); 
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
    // $ANTLR end "rule__ConditionEtat__Group__1__Impl"


    // $ANTLR start "rule__ConditionEtat__Group__2"
    // InternalLegoLang.g:1380:1: rule__ConditionEtat__Group__2 : rule__ConditionEtat__Group__2__Impl rule__ConditionEtat__Group__3 ;
    public final void rule__ConditionEtat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1384:1: ( rule__ConditionEtat__Group__2__Impl rule__ConditionEtat__Group__3 )
            // InternalLegoLang.g:1385:2: rule__ConditionEtat__Group__2__Impl rule__ConditionEtat__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__ConditionEtat__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConditionEtat__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionEtat__Group__2"


    // $ANTLR start "rule__ConditionEtat__Group__2__Impl"
    // InternalLegoLang.g:1392:1: rule__ConditionEtat__Group__2__Impl : ( '{' ) ;
    public final void rule__ConditionEtat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1396:1: ( ( '{' ) )
            // InternalLegoLang.g:1397:1: ( '{' )
            {
            // InternalLegoLang.g:1397:1: ( '{' )
            // InternalLegoLang.g:1398:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionEtatAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionEtatAccess().getLeftCurlyBracketKeyword_2()); 
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
    // $ANTLR end "rule__ConditionEtat__Group__2__Impl"


    // $ANTLR start "rule__ConditionEtat__Group__3"
    // InternalLegoLang.g:1407:1: rule__ConditionEtat__Group__3 : rule__ConditionEtat__Group__3__Impl rule__ConditionEtat__Group__4 ;
    public final void rule__ConditionEtat__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1411:1: ( rule__ConditionEtat__Group__3__Impl rule__ConditionEtat__Group__4 )
            // InternalLegoLang.g:1412:2: rule__ConditionEtat__Group__3__Impl rule__ConditionEtat__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__ConditionEtat__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConditionEtat__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionEtat__Group__3"


    // $ANTLR start "rule__ConditionEtat__Group__3__Impl"
    // InternalLegoLang.g:1419:1: rule__ConditionEtat__Group__3__Impl : ( ( rule__ConditionEtat__ThenAssignment_3 )* ) ;
    public final void rule__ConditionEtat__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1423:1: ( ( ( rule__ConditionEtat__ThenAssignment_3 )* ) )
            // InternalLegoLang.g:1424:1: ( ( rule__ConditionEtat__ThenAssignment_3 )* )
            {
            // InternalLegoLang.g:1424:1: ( ( rule__ConditionEtat__ThenAssignment_3 )* )
            // InternalLegoLang.g:1425:2: ( rule__ConditionEtat__ThenAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionEtatAccess().getThenAssignment_3()); 
            }
            // InternalLegoLang.g:1426:2: ( rule__ConditionEtat__ThenAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_INT)||(LA9_0>=11 && LA9_0<=12)||LA9_0==16||(LA9_0>=18 && LA9_0<=19)||(LA9_0>=22 && LA9_0<=23)||LA9_0==37||LA9_0==39||(LA9_0>=41 && LA9_0<=43)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalLegoLang.g:1426:3: rule__ConditionEtat__ThenAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__ConditionEtat__ThenAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionEtatAccess().getThenAssignment_3()); 
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
    // $ANTLR end "rule__ConditionEtat__Group__3__Impl"


    // $ANTLR start "rule__ConditionEtat__Group__4"
    // InternalLegoLang.g:1434:1: rule__ConditionEtat__Group__4 : rule__ConditionEtat__Group__4__Impl rule__ConditionEtat__Group__5 ;
    public final void rule__ConditionEtat__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1438:1: ( rule__ConditionEtat__Group__4__Impl rule__ConditionEtat__Group__5 )
            // InternalLegoLang.g:1439:2: rule__ConditionEtat__Group__4__Impl rule__ConditionEtat__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__ConditionEtat__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConditionEtat__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionEtat__Group__4"


    // $ANTLR start "rule__ConditionEtat__Group__4__Impl"
    // InternalLegoLang.g:1446:1: rule__ConditionEtat__Group__4__Impl : ( '}' ) ;
    public final void rule__ConditionEtat__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1450:1: ( ( '}' ) )
            // InternalLegoLang.g:1451:1: ( '}' )
            {
            // InternalLegoLang.g:1451:1: ( '}' )
            // InternalLegoLang.g:1452:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionEtatAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionEtatAccess().getRightCurlyBracketKeyword_4()); 
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
    // $ANTLR end "rule__ConditionEtat__Group__4__Impl"


    // $ANTLR start "rule__ConditionEtat__Group__5"
    // InternalLegoLang.g:1461:1: rule__ConditionEtat__Group__5 : rule__ConditionEtat__Group__5__Impl ;
    public final void rule__ConditionEtat__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1465:1: ( rule__ConditionEtat__Group__5__Impl )
            // InternalLegoLang.g:1466:2: rule__ConditionEtat__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConditionEtat__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionEtat__Group__5"


    // $ANTLR start "rule__ConditionEtat__Group__5__Impl"
    // InternalLegoLang.g:1472:1: rule__ConditionEtat__Group__5__Impl : ( ( rule__ConditionEtat__Group_5__0 )? ) ;
    public final void rule__ConditionEtat__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1476:1: ( ( ( rule__ConditionEtat__Group_5__0 )? ) )
            // InternalLegoLang.g:1477:1: ( ( rule__ConditionEtat__Group_5__0 )? )
            {
            // InternalLegoLang.g:1477:1: ( ( rule__ConditionEtat__Group_5__0 )? )
            // InternalLegoLang.g:1478:2: ( rule__ConditionEtat__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionEtatAccess().getGroup_5()); 
            }
            // InternalLegoLang.g:1479:2: ( rule__ConditionEtat__Group_5__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalLegoLang.g:1479:3: rule__ConditionEtat__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConditionEtat__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionEtatAccess().getGroup_5()); 
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
    // $ANTLR end "rule__ConditionEtat__Group__5__Impl"


    // $ANTLR start "rule__ConditionEtat__Group_5__0"
    // InternalLegoLang.g:1488:1: rule__ConditionEtat__Group_5__0 : rule__ConditionEtat__Group_5__0__Impl rule__ConditionEtat__Group_5__1 ;
    public final void rule__ConditionEtat__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1492:1: ( rule__ConditionEtat__Group_5__0__Impl rule__ConditionEtat__Group_5__1 )
            // InternalLegoLang.g:1493:2: rule__ConditionEtat__Group_5__0__Impl rule__ConditionEtat__Group_5__1
            {
            pushFollow(FOLLOW_10);
            rule__ConditionEtat__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConditionEtat__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionEtat__Group_5__0"


    // $ANTLR start "rule__ConditionEtat__Group_5__0__Impl"
    // InternalLegoLang.g:1500:1: rule__ConditionEtat__Group_5__0__Impl : ( 'else{' ) ;
    public final void rule__ConditionEtat__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1504:1: ( ( 'else{' ) )
            // InternalLegoLang.g:1505:1: ( 'else{' )
            {
            // InternalLegoLang.g:1505:1: ( 'else{' )
            // InternalLegoLang.g:1506:2: 'else{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionEtatAccess().getElseKeyword_5_0()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionEtatAccess().getElseKeyword_5_0()); 
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
    // $ANTLR end "rule__ConditionEtat__Group_5__0__Impl"


    // $ANTLR start "rule__ConditionEtat__Group_5__1"
    // InternalLegoLang.g:1515:1: rule__ConditionEtat__Group_5__1 : rule__ConditionEtat__Group_5__1__Impl rule__ConditionEtat__Group_5__2 ;
    public final void rule__ConditionEtat__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1519:1: ( rule__ConditionEtat__Group_5__1__Impl rule__ConditionEtat__Group_5__2 )
            // InternalLegoLang.g:1520:2: rule__ConditionEtat__Group_5__1__Impl rule__ConditionEtat__Group_5__2
            {
            pushFollow(FOLLOW_11);
            rule__ConditionEtat__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConditionEtat__Group_5__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionEtat__Group_5__1"


    // $ANTLR start "rule__ConditionEtat__Group_5__1__Impl"
    // InternalLegoLang.g:1527:1: rule__ConditionEtat__Group_5__1__Impl : ( ( rule__ConditionEtat__ElseAssignment_5_1 ) ) ;
    public final void rule__ConditionEtat__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1531:1: ( ( ( rule__ConditionEtat__ElseAssignment_5_1 ) ) )
            // InternalLegoLang.g:1532:1: ( ( rule__ConditionEtat__ElseAssignment_5_1 ) )
            {
            // InternalLegoLang.g:1532:1: ( ( rule__ConditionEtat__ElseAssignment_5_1 ) )
            // InternalLegoLang.g:1533:2: ( rule__ConditionEtat__ElseAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionEtatAccess().getElseAssignment_5_1()); 
            }
            // InternalLegoLang.g:1534:2: ( rule__ConditionEtat__ElseAssignment_5_1 )
            // InternalLegoLang.g:1534:3: rule__ConditionEtat__ElseAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__ConditionEtat__ElseAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionEtatAccess().getElseAssignment_5_1()); 
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
    // $ANTLR end "rule__ConditionEtat__Group_5__1__Impl"


    // $ANTLR start "rule__ConditionEtat__Group_5__2"
    // InternalLegoLang.g:1542:1: rule__ConditionEtat__Group_5__2 : rule__ConditionEtat__Group_5__2__Impl ;
    public final void rule__ConditionEtat__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1546:1: ( rule__ConditionEtat__Group_5__2__Impl )
            // InternalLegoLang.g:1547:2: rule__ConditionEtat__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConditionEtat__Group_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionEtat__Group_5__2"


    // $ANTLR start "rule__ConditionEtat__Group_5__2__Impl"
    // InternalLegoLang.g:1553:1: rule__ConditionEtat__Group_5__2__Impl : ( '}' ) ;
    public final void rule__ConditionEtat__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1557:1: ( ( '}' ) )
            // InternalLegoLang.g:1558:1: ( '}' )
            {
            // InternalLegoLang.g:1558:1: ( '}' )
            // InternalLegoLang.g:1559:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionEtatAccess().getRightCurlyBracketKeyword_5_2()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionEtatAccess().getRightCurlyBracketKeyword_5_2()); 
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
    // $ANTLR end "rule__ConditionEtat__Group_5__2__Impl"


    // $ANTLR start "rule__WhileLoop__Group__0"
    // InternalLegoLang.g:1569:1: rule__WhileLoop__Group__0 : rule__WhileLoop__Group__0__Impl rule__WhileLoop__Group__1 ;
    public final void rule__WhileLoop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1573:1: ( rule__WhileLoop__Group__0__Impl rule__WhileLoop__Group__1 )
            // InternalLegoLang.g:1574:2: rule__WhileLoop__Group__0__Impl rule__WhileLoop__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__WhileLoop__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WhileLoop__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__0"


    // $ANTLR start "rule__WhileLoop__Group__0__Impl"
    // InternalLegoLang.g:1581:1: rule__WhileLoop__Group__0__Impl : ( 'while' ) ;
    public final void rule__WhileLoop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1585:1: ( ( 'while' ) )
            // InternalLegoLang.g:1586:1: ( 'while' )
            {
            // InternalLegoLang.g:1586:1: ( 'while' )
            // InternalLegoLang.g:1587:2: 'while'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileLoopAccess().getWhileKeyword_0()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileLoopAccess().getWhileKeyword_0()); 
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
    // $ANTLR end "rule__WhileLoop__Group__0__Impl"


    // $ANTLR start "rule__WhileLoop__Group__1"
    // InternalLegoLang.g:1596:1: rule__WhileLoop__Group__1 : rule__WhileLoop__Group__1__Impl rule__WhileLoop__Group__2 ;
    public final void rule__WhileLoop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1600:1: ( rule__WhileLoop__Group__1__Impl rule__WhileLoop__Group__2 )
            // InternalLegoLang.g:1601:2: rule__WhileLoop__Group__1__Impl rule__WhileLoop__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__WhileLoop__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WhileLoop__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__1"


    // $ANTLR start "rule__WhileLoop__Group__1__Impl"
    // InternalLegoLang.g:1608:1: rule__WhileLoop__Group__1__Impl : ( ( rule__WhileLoop__LoopConditionAssignment_1 ) ) ;
    public final void rule__WhileLoop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1612:1: ( ( ( rule__WhileLoop__LoopConditionAssignment_1 ) ) )
            // InternalLegoLang.g:1613:1: ( ( rule__WhileLoop__LoopConditionAssignment_1 ) )
            {
            // InternalLegoLang.g:1613:1: ( ( rule__WhileLoop__LoopConditionAssignment_1 ) )
            // InternalLegoLang.g:1614:2: ( rule__WhileLoop__LoopConditionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileLoopAccess().getLoopConditionAssignment_1()); 
            }
            // InternalLegoLang.g:1615:2: ( rule__WhileLoop__LoopConditionAssignment_1 )
            // InternalLegoLang.g:1615:3: rule__WhileLoop__LoopConditionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__WhileLoop__LoopConditionAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileLoopAccess().getLoopConditionAssignment_1()); 
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
    // $ANTLR end "rule__WhileLoop__Group__1__Impl"


    // $ANTLR start "rule__WhileLoop__Group__2"
    // InternalLegoLang.g:1623:1: rule__WhileLoop__Group__2 : rule__WhileLoop__Group__2__Impl rule__WhileLoop__Group__3 ;
    public final void rule__WhileLoop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1627:1: ( rule__WhileLoop__Group__2__Impl rule__WhileLoop__Group__3 )
            // InternalLegoLang.g:1628:2: rule__WhileLoop__Group__2__Impl rule__WhileLoop__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__WhileLoop__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WhileLoop__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__2"


    // $ANTLR start "rule__WhileLoop__Group__2__Impl"
    // InternalLegoLang.g:1635:1: rule__WhileLoop__Group__2__Impl : ( '{' ) ;
    public final void rule__WhileLoop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1639:1: ( ( '{' ) )
            // InternalLegoLang.g:1640:1: ( '{' )
            {
            // InternalLegoLang.g:1640:1: ( '{' )
            // InternalLegoLang.g:1641:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileLoopAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileLoopAccess().getLeftCurlyBracketKeyword_2()); 
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
    // $ANTLR end "rule__WhileLoop__Group__2__Impl"


    // $ANTLR start "rule__WhileLoop__Group__3"
    // InternalLegoLang.g:1650:1: rule__WhileLoop__Group__3 : rule__WhileLoop__Group__3__Impl rule__WhileLoop__Group__4 ;
    public final void rule__WhileLoop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1654:1: ( rule__WhileLoop__Group__3__Impl rule__WhileLoop__Group__4 )
            // InternalLegoLang.g:1655:2: rule__WhileLoop__Group__3__Impl rule__WhileLoop__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__WhileLoop__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WhileLoop__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__3"


    // $ANTLR start "rule__WhileLoop__Group__3__Impl"
    // InternalLegoLang.g:1662:1: rule__WhileLoop__Group__3__Impl : ( ( rule__WhileLoop__StatementAssignment_3 )* ) ;
    public final void rule__WhileLoop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1666:1: ( ( ( rule__WhileLoop__StatementAssignment_3 )* ) )
            // InternalLegoLang.g:1667:1: ( ( rule__WhileLoop__StatementAssignment_3 )* )
            {
            // InternalLegoLang.g:1667:1: ( ( rule__WhileLoop__StatementAssignment_3 )* )
            // InternalLegoLang.g:1668:2: ( rule__WhileLoop__StatementAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileLoopAccess().getStatementAssignment_3()); 
            }
            // InternalLegoLang.g:1669:2: ( rule__WhileLoop__StatementAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_STRING && LA11_0<=RULE_INT)||(LA11_0>=11 && LA11_0<=12)||LA11_0==16||(LA11_0>=18 && LA11_0<=19)||(LA11_0>=22 && LA11_0<=23)||LA11_0==37||LA11_0==39||(LA11_0>=41 && LA11_0<=43)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalLegoLang.g:1669:3: rule__WhileLoop__StatementAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__WhileLoop__StatementAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileLoopAccess().getStatementAssignment_3()); 
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
    // $ANTLR end "rule__WhileLoop__Group__3__Impl"


    // $ANTLR start "rule__WhileLoop__Group__4"
    // InternalLegoLang.g:1677:1: rule__WhileLoop__Group__4 : rule__WhileLoop__Group__4__Impl ;
    public final void rule__WhileLoop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1681:1: ( rule__WhileLoop__Group__4__Impl )
            // InternalLegoLang.g:1682:2: rule__WhileLoop__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WhileLoop__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__4"


    // $ANTLR start "rule__WhileLoop__Group__4__Impl"
    // InternalLegoLang.g:1688:1: rule__WhileLoop__Group__4__Impl : ( '}' ) ;
    public final void rule__WhileLoop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1692:1: ( ( '}' ) )
            // InternalLegoLang.g:1693:1: ( '}' )
            {
            // InternalLegoLang.g:1693:1: ( '}' )
            // InternalLegoLang.g:1694:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileLoopAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileLoopAccess().getRightCurlyBracketKeyword_4()); 
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
    // $ANTLR end "rule__WhileLoop__Group__4__Impl"


    // $ANTLR start "rule__MethodePrint__Group__0"
    // InternalLegoLang.g:1704:1: rule__MethodePrint__Group__0 : rule__MethodePrint__Group__0__Impl rule__MethodePrint__Group__1 ;
    public final void rule__MethodePrint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1708:1: ( rule__MethodePrint__Group__0__Impl rule__MethodePrint__Group__1 )
            // InternalLegoLang.g:1709:2: rule__MethodePrint__Group__0__Impl rule__MethodePrint__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__MethodePrint__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MethodePrint__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodePrint__Group__0"


    // $ANTLR start "rule__MethodePrint__Group__0__Impl"
    // InternalLegoLang.g:1716:1: rule__MethodePrint__Group__0__Impl : ( () ) ;
    public final void rule__MethodePrint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1720:1: ( ( () ) )
            // InternalLegoLang.g:1721:1: ( () )
            {
            // InternalLegoLang.g:1721:1: ( () )
            // InternalLegoLang.g:1722:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodePrintAccess().getMethodePrintAction_0()); 
            }
            // InternalLegoLang.g:1723:2: ()
            // InternalLegoLang.g:1723:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodePrintAccess().getMethodePrintAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodePrint__Group__0__Impl"


    // $ANTLR start "rule__MethodePrint__Group__1"
    // InternalLegoLang.g:1731:1: rule__MethodePrint__Group__1 : rule__MethodePrint__Group__1__Impl rule__MethodePrint__Group__2 ;
    public final void rule__MethodePrint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1735:1: ( rule__MethodePrint__Group__1__Impl rule__MethodePrint__Group__2 )
            // InternalLegoLang.g:1736:2: rule__MethodePrint__Group__1__Impl rule__MethodePrint__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__MethodePrint__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MethodePrint__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodePrint__Group__1"


    // $ANTLR start "rule__MethodePrint__Group__1__Impl"
    // InternalLegoLang.g:1743:1: rule__MethodePrint__Group__1__Impl : ( 'print(' ) ;
    public final void rule__MethodePrint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1747:1: ( ( 'print(' ) )
            // InternalLegoLang.g:1748:1: ( 'print(' )
            {
            // InternalLegoLang.g:1748:1: ( 'print(' )
            // InternalLegoLang.g:1749:2: 'print('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodePrintAccess().getPrintKeyword_1()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodePrintAccess().getPrintKeyword_1()); 
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
    // $ANTLR end "rule__MethodePrint__Group__1__Impl"


    // $ANTLR start "rule__MethodePrint__Group__2"
    // InternalLegoLang.g:1758:1: rule__MethodePrint__Group__2 : rule__MethodePrint__Group__2__Impl rule__MethodePrint__Group__3 ;
    public final void rule__MethodePrint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1762:1: ( rule__MethodePrint__Group__2__Impl rule__MethodePrint__Group__3 )
            // InternalLegoLang.g:1763:2: rule__MethodePrint__Group__2__Impl rule__MethodePrint__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__MethodePrint__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MethodePrint__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodePrint__Group__2"


    // $ANTLR start "rule__MethodePrint__Group__2__Impl"
    // InternalLegoLang.g:1770:1: rule__MethodePrint__Group__2__Impl : ( ( ( rule__MethodePrint__Group_2__0 ) ) ( ( rule__MethodePrint__Group_2__0 )* ) ) ;
    public final void rule__MethodePrint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1774:1: ( ( ( ( rule__MethodePrint__Group_2__0 ) ) ( ( rule__MethodePrint__Group_2__0 )* ) ) )
            // InternalLegoLang.g:1775:1: ( ( ( rule__MethodePrint__Group_2__0 ) ) ( ( rule__MethodePrint__Group_2__0 )* ) )
            {
            // InternalLegoLang.g:1775:1: ( ( ( rule__MethodePrint__Group_2__0 ) ) ( ( rule__MethodePrint__Group_2__0 )* ) )
            // InternalLegoLang.g:1776:2: ( ( rule__MethodePrint__Group_2__0 ) ) ( ( rule__MethodePrint__Group_2__0 )* )
            {
            // InternalLegoLang.g:1776:2: ( ( rule__MethodePrint__Group_2__0 ) )
            // InternalLegoLang.g:1777:3: ( rule__MethodePrint__Group_2__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodePrintAccess().getGroup_2()); 
            }
            // InternalLegoLang.g:1778:3: ( rule__MethodePrint__Group_2__0 )
            // InternalLegoLang.g:1778:4: rule__MethodePrint__Group_2__0
            {
            pushFollow(FOLLOW_14);
            rule__MethodePrint__Group_2__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodePrintAccess().getGroup_2()); 
            }

            }

            // InternalLegoLang.g:1781:2: ( ( rule__MethodePrint__Group_2__0 )* )
            // InternalLegoLang.g:1782:3: ( rule__MethodePrint__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodePrintAccess().getGroup_2()); 
            }
            // InternalLegoLang.g:1783:3: ( rule__MethodePrint__Group_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_STRING && LA12_0<=RULE_INT)||(LA12_0>=11 && LA12_0<=12)||(LA12_0>=22 && LA12_0<=23)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalLegoLang.g:1783:4: rule__MethodePrint__Group_2__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__MethodePrint__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodePrintAccess().getGroup_2()); 
            }

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
    // $ANTLR end "rule__MethodePrint__Group__2__Impl"


    // $ANTLR start "rule__MethodePrint__Group__3"
    // InternalLegoLang.g:1792:1: rule__MethodePrint__Group__3 : rule__MethodePrint__Group__3__Impl ;
    public final void rule__MethodePrint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1796:1: ( rule__MethodePrint__Group__3__Impl )
            // InternalLegoLang.g:1797:2: rule__MethodePrint__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MethodePrint__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodePrint__Group__3"


    // $ANTLR start "rule__MethodePrint__Group__3__Impl"
    // InternalLegoLang.g:1803:1: rule__MethodePrint__Group__3__Impl : ( ');' ) ;
    public final void rule__MethodePrint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1807:1: ( ( ');' ) )
            // InternalLegoLang.g:1808:1: ( ');' )
            {
            // InternalLegoLang.g:1808:1: ( ');' )
            // InternalLegoLang.g:1809:2: ');'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodePrintAccess().getRightParenthesisSemicolonKeyword_3()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodePrintAccess().getRightParenthesisSemicolonKeyword_3()); 
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
    // $ANTLR end "rule__MethodePrint__Group__3__Impl"


    // $ANTLR start "rule__MethodePrint__Group_2__0"
    // InternalLegoLang.g:1819:1: rule__MethodePrint__Group_2__0 : rule__MethodePrint__Group_2__0__Impl rule__MethodePrint__Group_2__1 ;
    public final void rule__MethodePrint__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1823:1: ( rule__MethodePrint__Group_2__0__Impl rule__MethodePrint__Group_2__1 )
            // InternalLegoLang.g:1824:2: rule__MethodePrint__Group_2__0__Impl rule__MethodePrint__Group_2__1
            {
            pushFollow(FOLLOW_15);
            rule__MethodePrint__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MethodePrint__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodePrint__Group_2__0"


    // $ANTLR start "rule__MethodePrint__Group_2__0__Impl"
    // InternalLegoLang.g:1831:1: rule__MethodePrint__Group_2__0__Impl : ( ( rule__MethodePrint__ExpressionAssignment_2_0 ) ) ;
    public final void rule__MethodePrint__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1835:1: ( ( ( rule__MethodePrint__ExpressionAssignment_2_0 ) ) )
            // InternalLegoLang.g:1836:1: ( ( rule__MethodePrint__ExpressionAssignment_2_0 ) )
            {
            // InternalLegoLang.g:1836:1: ( ( rule__MethodePrint__ExpressionAssignment_2_0 ) )
            // InternalLegoLang.g:1837:2: ( rule__MethodePrint__ExpressionAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodePrintAccess().getExpressionAssignment_2_0()); 
            }
            // InternalLegoLang.g:1838:2: ( rule__MethodePrint__ExpressionAssignment_2_0 )
            // InternalLegoLang.g:1838:3: rule__MethodePrint__ExpressionAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__MethodePrint__ExpressionAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodePrintAccess().getExpressionAssignment_2_0()); 
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
    // $ANTLR end "rule__MethodePrint__Group_2__0__Impl"


    // $ANTLR start "rule__MethodePrint__Group_2__1"
    // InternalLegoLang.g:1846:1: rule__MethodePrint__Group_2__1 : rule__MethodePrint__Group_2__1__Impl ;
    public final void rule__MethodePrint__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1850:1: ( rule__MethodePrint__Group_2__1__Impl )
            // InternalLegoLang.g:1851:2: rule__MethodePrint__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MethodePrint__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodePrint__Group_2__1"


    // $ANTLR start "rule__MethodePrint__Group_2__1__Impl"
    // InternalLegoLang.g:1857:1: rule__MethodePrint__Group_2__1__Impl : ( ',' ) ;
    public final void rule__MethodePrint__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1861:1: ( ( ',' ) )
            // InternalLegoLang.g:1862:1: ( ',' )
            {
            // InternalLegoLang.g:1862:1: ( ',' )
            // InternalLegoLang.g:1863:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodePrintAccess().getCommaKeyword_2_1()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodePrintAccess().getCommaKeyword_2_1()); 
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
    // $ANTLR end "rule__MethodePrint__Group_2__1__Impl"


    // $ANTLR start "rule__Substraction__Group__0"
    // InternalLegoLang.g:1873:1: rule__Substraction__Group__0 : rule__Substraction__Group__0__Impl rule__Substraction__Group__1 ;
    public final void rule__Substraction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1877:1: ( rule__Substraction__Group__0__Impl rule__Substraction__Group__1 )
            // InternalLegoLang.g:1878:2: rule__Substraction__Group__0__Impl rule__Substraction__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Substraction__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Substraction__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Substraction__Group__0"


    // $ANTLR start "rule__Substraction__Group__0__Impl"
    // InternalLegoLang.g:1885:1: rule__Substraction__Group__0__Impl : ( '(' ) ;
    public final void rule__Substraction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1889:1: ( ( '(' ) )
            // InternalLegoLang.g:1890:1: ( '(' )
            {
            // InternalLegoLang.g:1890:1: ( '(' )
            // InternalLegoLang.g:1891:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstractionAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstractionAccess().getLeftParenthesisKeyword_0()); 
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
    // $ANTLR end "rule__Substraction__Group__0__Impl"


    // $ANTLR start "rule__Substraction__Group__1"
    // InternalLegoLang.g:1900:1: rule__Substraction__Group__1 : rule__Substraction__Group__1__Impl rule__Substraction__Group__2 ;
    public final void rule__Substraction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1904:1: ( rule__Substraction__Group__1__Impl rule__Substraction__Group__2 )
            // InternalLegoLang.g:1905:2: rule__Substraction__Group__1__Impl rule__Substraction__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Substraction__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Substraction__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Substraction__Group__1"


    // $ANTLR start "rule__Substraction__Group__1__Impl"
    // InternalLegoLang.g:1912:1: rule__Substraction__Group__1__Impl : ( ( rule__Substraction__LeftAssignment_1 ) ) ;
    public final void rule__Substraction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1916:1: ( ( ( rule__Substraction__LeftAssignment_1 ) ) )
            // InternalLegoLang.g:1917:1: ( ( rule__Substraction__LeftAssignment_1 ) )
            {
            // InternalLegoLang.g:1917:1: ( ( rule__Substraction__LeftAssignment_1 ) )
            // InternalLegoLang.g:1918:2: ( rule__Substraction__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstractionAccess().getLeftAssignment_1()); 
            }
            // InternalLegoLang.g:1919:2: ( rule__Substraction__LeftAssignment_1 )
            // InternalLegoLang.g:1919:3: rule__Substraction__LeftAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Substraction__LeftAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstractionAccess().getLeftAssignment_1()); 
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
    // $ANTLR end "rule__Substraction__Group__1__Impl"


    // $ANTLR start "rule__Substraction__Group__2"
    // InternalLegoLang.g:1927:1: rule__Substraction__Group__2 : rule__Substraction__Group__2__Impl rule__Substraction__Group__3 ;
    public final void rule__Substraction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1931:1: ( rule__Substraction__Group__2__Impl rule__Substraction__Group__3 )
            // InternalLegoLang.g:1932:2: rule__Substraction__Group__2__Impl rule__Substraction__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Substraction__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Substraction__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Substraction__Group__2"


    // $ANTLR start "rule__Substraction__Group__2__Impl"
    // InternalLegoLang.g:1939:1: rule__Substraction__Group__2__Impl : ( '-' ) ;
    public final void rule__Substraction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1943:1: ( ( '-' ) )
            // InternalLegoLang.g:1944:1: ( '-' )
            {
            // InternalLegoLang.g:1944:1: ( '-' )
            // InternalLegoLang.g:1945:2: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstractionAccess().getHyphenMinusKeyword_2()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstractionAccess().getHyphenMinusKeyword_2()); 
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
    // $ANTLR end "rule__Substraction__Group__2__Impl"


    // $ANTLR start "rule__Substraction__Group__3"
    // InternalLegoLang.g:1954:1: rule__Substraction__Group__3 : rule__Substraction__Group__3__Impl rule__Substraction__Group__4 ;
    public final void rule__Substraction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1958:1: ( rule__Substraction__Group__3__Impl rule__Substraction__Group__4 )
            // InternalLegoLang.g:1959:2: rule__Substraction__Group__3__Impl rule__Substraction__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Substraction__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Substraction__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Substraction__Group__3"


    // $ANTLR start "rule__Substraction__Group__3__Impl"
    // InternalLegoLang.g:1966:1: rule__Substraction__Group__3__Impl : ( ( rule__Substraction__RightAssignment_3 ) ) ;
    public final void rule__Substraction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1970:1: ( ( ( rule__Substraction__RightAssignment_3 ) ) )
            // InternalLegoLang.g:1971:1: ( ( rule__Substraction__RightAssignment_3 ) )
            {
            // InternalLegoLang.g:1971:1: ( ( rule__Substraction__RightAssignment_3 ) )
            // InternalLegoLang.g:1972:2: ( rule__Substraction__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstractionAccess().getRightAssignment_3()); 
            }
            // InternalLegoLang.g:1973:2: ( rule__Substraction__RightAssignment_3 )
            // InternalLegoLang.g:1973:3: rule__Substraction__RightAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Substraction__RightAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstractionAccess().getRightAssignment_3()); 
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
    // $ANTLR end "rule__Substraction__Group__3__Impl"


    // $ANTLR start "rule__Substraction__Group__4"
    // InternalLegoLang.g:1981:1: rule__Substraction__Group__4 : rule__Substraction__Group__4__Impl ;
    public final void rule__Substraction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1985:1: ( rule__Substraction__Group__4__Impl )
            // InternalLegoLang.g:1986:2: rule__Substraction__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Substraction__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Substraction__Group__4"


    // $ANTLR start "rule__Substraction__Group__4__Impl"
    // InternalLegoLang.g:1992:1: rule__Substraction__Group__4__Impl : ( ')' ) ;
    public final void rule__Substraction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1996:1: ( ( ')' ) )
            // InternalLegoLang.g:1997:1: ( ')' )
            {
            // InternalLegoLang.g:1997:1: ( ')' )
            // InternalLegoLang.g:1998:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstractionAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstractionAccess().getRightParenthesisKeyword_4()); 
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
    // $ANTLR end "rule__Substraction__Group__4__Impl"


    // $ANTLR start "rule__Addition__Group__0"
    // InternalLegoLang.g:2008:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2012:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // InternalLegoLang.g:2013:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Addition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Addition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__0"


    // $ANTLR start "rule__Addition__Group__0__Impl"
    // InternalLegoLang.g:2020:1: rule__Addition__Group__0__Impl : ( '(' ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2024:1: ( ( '(' ) )
            // InternalLegoLang.g:2025:1: ( '(' )
            {
            // InternalLegoLang.g:2025:1: ( '(' )
            // InternalLegoLang.g:2026:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getLeftParenthesisKeyword_0()); 
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
    // $ANTLR end "rule__Addition__Group__0__Impl"


    // $ANTLR start "rule__Addition__Group__1"
    // InternalLegoLang.g:2035:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl rule__Addition__Group__2 ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2039:1: ( rule__Addition__Group__1__Impl rule__Addition__Group__2 )
            // InternalLegoLang.g:2040:2: rule__Addition__Group__1__Impl rule__Addition__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Addition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Addition__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__1"


    // $ANTLR start "rule__Addition__Group__1__Impl"
    // InternalLegoLang.g:2047:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__LeftAssignment_1 ) ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2051:1: ( ( ( rule__Addition__LeftAssignment_1 ) ) )
            // InternalLegoLang.g:2052:1: ( ( rule__Addition__LeftAssignment_1 ) )
            {
            // InternalLegoLang.g:2052:1: ( ( rule__Addition__LeftAssignment_1 ) )
            // InternalLegoLang.g:2053:2: ( rule__Addition__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getLeftAssignment_1()); 
            }
            // InternalLegoLang.g:2054:2: ( rule__Addition__LeftAssignment_1 )
            // InternalLegoLang.g:2054:3: rule__Addition__LeftAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Addition__LeftAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getLeftAssignment_1()); 
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
    // $ANTLR end "rule__Addition__Group__1__Impl"


    // $ANTLR start "rule__Addition__Group__2"
    // InternalLegoLang.g:2062:1: rule__Addition__Group__2 : rule__Addition__Group__2__Impl rule__Addition__Group__3 ;
    public final void rule__Addition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2066:1: ( rule__Addition__Group__2__Impl rule__Addition__Group__3 )
            // InternalLegoLang.g:2067:2: rule__Addition__Group__2__Impl rule__Addition__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Addition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Addition__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__2"


    // $ANTLR start "rule__Addition__Group__2__Impl"
    // InternalLegoLang.g:2074:1: rule__Addition__Group__2__Impl : ( '+' ) ;
    public final void rule__Addition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2078:1: ( ( '+' ) )
            // InternalLegoLang.g:2079:1: ( '+' )
            {
            // InternalLegoLang.g:2079:1: ( '+' )
            // InternalLegoLang.g:2080:2: '+'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getPlusSignKeyword_2()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getPlusSignKeyword_2()); 
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
    // $ANTLR end "rule__Addition__Group__2__Impl"


    // $ANTLR start "rule__Addition__Group__3"
    // InternalLegoLang.g:2089:1: rule__Addition__Group__3 : rule__Addition__Group__3__Impl rule__Addition__Group__4 ;
    public final void rule__Addition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2093:1: ( rule__Addition__Group__3__Impl rule__Addition__Group__4 )
            // InternalLegoLang.g:2094:2: rule__Addition__Group__3__Impl rule__Addition__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Addition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Addition__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__3"


    // $ANTLR start "rule__Addition__Group__3__Impl"
    // InternalLegoLang.g:2101:1: rule__Addition__Group__3__Impl : ( ( rule__Addition__RightAssignment_3 ) ) ;
    public final void rule__Addition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2105:1: ( ( ( rule__Addition__RightAssignment_3 ) ) )
            // InternalLegoLang.g:2106:1: ( ( rule__Addition__RightAssignment_3 ) )
            {
            // InternalLegoLang.g:2106:1: ( ( rule__Addition__RightAssignment_3 ) )
            // InternalLegoLang.g:2107:2: ( rule__Addition__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getRightAssignment_3()); 
            }
            // InternalLegoLang.g:2108:2: ( rule__Addition__RightAssignment_3 )
            // InternalLegoLang.g:2108:3: rule__Addition__RightAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Addition__RightAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getRightAssignment_3()); 
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
    // $ANTLR end "rule__Addition__Group__3__Impl"


    // $ANTLR start "rule__Addition__Group__4"
    // InternalLegoLang.g:2116:1: rule__Addition__Group__4 : rule__Addition__Group__4__Impl ;
    public final void rule__Addition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2120:1: ( rule__Addition__Group__4__Impl )
            // InternalLegoLang.g:2121:2: rule__Addition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__4"


    // $ANTLR start "rule__Addition__Group__4__Impl"
    // InternalLegoLang.g:2127:1: rule__Addition__Group__4__Impl : ( ')' ) ;
    public final void rule__Addition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2131:1: ( ( ')' ) )
            // InternalLegoLang.g:2132:1: ( ')' )
            {
            // InternalLegoLang.g:2132:1: ( ')' )
            // InternalLegoLang.g:2133:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getRightParenthesisKeyword_4()); 
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
    // $ANTLR end "rule__Addition__Group__4__Impl"


    // $ANTLR start "rule__Multiplication__Group__0"
    // InternalLegoLang.g:2143:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2147:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // InternalLegoLang.g:2148:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Multiplication__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__0"


    // $ANTLR start "rule__Multiplication__Group__0__Impl"
    // InternalLegoLang.g:2155:1: rule__Multiplication__Group__0__Impl : ( '(' ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2159:1: ( ( '(' ) )
            // InternalLegoLang.g:2160:1: ( '(' )
            {
            // InternalLegoLang.g:2160:1: ( '(' )
            // InternalLegoLang.g:2161:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getLeftParenthesisKeyword_0()); 
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
    // $ANTLR end "rule__Multiplication__Group__0__Impl"


    // $ANTLR start "rule__Multiplication__Group__1"
    // InternalLegoLang.g:2170:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl rule__Multiplication__Group__2 ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2174:1: ( rule__Multiplication__Group__1__Impl rule__Multiplication__Group__2 )
            // InternalLegoLang.g:2175:2: rule__Multiplication__Group__1__Impl rule__Multiplication__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__Multiplication__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__1"


    // $ANTLR start "rule__Multiplication__Group__1__Impl"
    // InternalLegoLang.g:2182:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__LeftAssignment_1 ) ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2186:1: ( ( ( rule__Multiplication__LeftAssignment_1 ) ) )
            // InternalLegoLang.g:2187:1: ( ( rule__Multiplication__LeftAssignment_1 ) )
            {
            // InternalLegoLang.g:2187:1: ( ( rule__Multiplication__LeftAssignment_1 ) )
            // InternalLegoLang.g:2188:2: ( rule__Multiplication__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getLeftAssignment_1()); 
            }
            // InternalLegoLang.g:2189:2: ( rule__Multiplication__LeftAssignment_1 )
            // InternalLegoLang.g:2189:3: rule__Multiplication__LeftAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__LeftAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getLeftAssignment_1()); 
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
    // $ANTLR end "rule__Multiplication__Group__1__Impl"


    // $ANTLR start "rule__Multiplication__Group__2"
    // InternalLegoLang.g:2197:1: rule__Multiplication__Group__2 : rule__Multiplication__Group__2__Impl rule__Multiplication__Group__3 ;
    public final void rule__Multiplication__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2201:1: ( rule__Multiplication__Group__2__Impl rule__Multiplication__Group__3 )
            // InternalLegoLang.g:2202:2: rule__Multiplication__Group__2__Impl rule__Multiplication__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Multiplication__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__2"


    // $ANTLR start "rule__Multiplication__Group__2__Impl"
    // InternalLegoLang.g:2209:1: rule__Multiplication__Group__2__Impl : ( '*' ) ;
    public final void rule__Multiplication__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2213:1: ( ( '*' ) )
            // InternalLegoLang.g:2214:1: ( '*' )
            {
            // InternalLegoLang.g:2214:1: ( '*' )
            // InternalLegoLang.g:2215:2: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_2()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_2()); 
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
    // $ANTLR end "rule__Multiplication__Group__2__Impl"


    // $ANTLR start "rule__Multiplication__Group__3"
    // InternalLegoLang.g:2224:1: rule__Multiplication__Group__3 : rule__Multiplication__Group__3__Impl rule__Multiplication__Group__4 ;
    public final void rule__Multiplication__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2228:1: ( rule__Multiplication__Group__3__Impl rule__Multiplication__Group__4 )
            // InternalLegoLang.g:2229:2: rule__Multiplication__Group__3__Impl rule__Multiplication__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Multiplication__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__3"


    // $ANTLR start "rule__Multiplication__Group__3__Impl"
    // InternalLegoLang.g:2236:1: rule__Multiplication__Group__3__Impl : ( ( rule__Multiplication__RightAssignment_3 ) ) ;
    public final void rule__Multiplication__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2240:1: ( ( ( rule__Multiplication__RightAssignment_3 ) ) )
            // InternalLegoLang.g:2241:1: ( ( rule__Multiplication__RightAssignment_3 ) )
            {
            // InternalLegoLang.g:2241:1: ( ( rule__Multiplication__RightAssignment_3 ) )
            // InternalLegoLang.g:2242:2: ( rule__Multiplication__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getRightAssignment_3()); 
            }
            // InternalLegoLang.g:2243:2: ( rule__Multiplication__RightAssignment_3 )
            // InternalLegoLang.g:2243:3: rule__Multiplication__RightAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__RightAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getRightAssignment_3()); 
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
    // $ANTLR end "rule__Multiplication__Group__3__Impl"


    // $ANTLR start "rule__Multiplication__Group__4"
    // InternalLegoLang.g:2251:1: rule__Multiplication__Group__4 : rule__Multiplication__Group__4__Impl ;
    public final void rule__Multiplication__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2255:1: ( rule__Multiplication__Group__4__Impl )
            // InternalLegoLang.g:2256:2: rule__Multiplication__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__4"


    // $ANTLR start "rule__Multiplication__Group__4__Impl"
    // InternalLegoLang.g:2262:1: rule__Multiplication__Group__4__Impl : ( ')' ) ;
    public final void rule__Multiplication__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2266:1: ( ( ')' ) )
            // InternalLegoLang.g:2267:1: ( ')' )
            {
            // InternalLegoLang.g:2267:1: ( ')' )
            // InternalLegoLang.g:2268:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getRightParenthesisKeyword_4()); 
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
    // $ANTLR end "rule__Multiplication__Group__4__Impl"


    // $ANTLR start "rule__Division__Group__0"
    // InternalLegoLang.g:2278:1: rule__Division__Group__0 : rule__Division__Group__0__Impl rule__Division__Group__1 ;
    public final void rule__Division__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2282:1: ( rule__Division__Group__0__Impl rule__Division__Group__1 )
            // InternalLegoLang.g:2283:2: rule__Division__Group__0__Impl rule__Division__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Division__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Division__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Division__Group__0"


    // $ANTLR start "rule__Division__Group__0__Impl"
    // InternalLegoLang.g:2290:1: rule__Division__Group__0__Impl : ( '(' ) ;
    public final void rule__Division__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2294:1: ( ( '(' ) )
            // InternalLegoLang.g:2295:1: ( '(' )
            {
            // InternalLegoLang.g:2295:1: ( '(' )
            // InternalLegoLang.g:2296:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivisionAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDivisionAccess().getLeftParenthesisKeyword_0()); 
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
    // $ANTLR end "rule__Division__Group__0__Impl"


    // $ANTLR start "rule__Division__Group__1"
    // InternalLegoLang.g:2305:1: rule__Division__Group__1 : rule__Division__Group__1__Impl rule__Division__Group__2 ;
    public final void rule__Division__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2309:1: ( rule__Division__Group__1__Impl rule__Division__Group__2 )
            // InternalLegoLang.g:2310:2: rule__Division__Group__1__Impl rule__Division__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__Division__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Division__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Division__Group__1"


    // $ANTLR start "rule__Division__Group__1__Impl"
    // InternalLegoLang.g:2317:1: rule__Division__Group__1__Impl : ( ( rule__Division__LeftAssignment_1 ) ) ;
    public final void rule__Division__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2321:1: ( ( ( rule__Division__LeftAssignment_1 ) ) )
            // InternalLegoLang.g:2322:1: ( ( rule__Division__LeftAssignment_1 ) )
            {
            // InternalLegoLang.g:2322:1: ( ( rule__Division__LeftAssignment_1 ) )
            // InternalLegoLang.g:2323:2: ( rule__Division__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivisionAccess().getLeftAssignment_1()); 
            }
            // InternalLegoLang.g:2324:2: ( rule__Division__LeftAssignment_1 )
            // InternalLegoLang.g:2324:3: rule__Division__LeftAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Division__LeftAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDivisionAccess().getLeftAssignment_1()); 
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
    // $ANTLR end "rule__Division__Group__1__Impl"


    // $ANTLR start "rule__Division__Group__2"
    // InternalLegoLang.g:2332:1: rule__Division__Group__2 : rule__Division__Group__2__Impl rule__Division__Group__3 ;
    public final void rule__Division__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2336:1: ( rule__Division__Group__2__Impl rule__Division__Group__3 )
            // InternalLegoLang.g:2337:2: rule__Division__Group__2__Impl rule__Division__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Division__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Division__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Division__Group__2"


    // $ANTLR start "rule__Division__Group__2__Impl"
    // InternalLegoLang.g:2344:1: rule__Division__Group__2__Impl : ( '/' ) ;
    public final void rule__Division__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2348:1: ( ( '/' ) )
            // InternalLegoLang.g:2349:1: ( '/' )
            {
            // InternalLegoLang.g:2349:1: ( '/' )
            // InternalLegoLang.g:2350:2: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivisionAccess().getSolidusKeyword_2()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDivisionAccess().getSolidusKeyword_2()); 
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
    // $ANTLR end "rule__Division__Group__2__Impl"


    // $ANTLR start "rule__Division__Group__3"
    // InternalLegoLang.g:2359:1: rule__Division__Group__3 : rule__Division__Group__3__Impl rule__Division__Group__4 ;
    public final void rule__Division__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2363:1: ( rule__Division__Group__3__Impl rule__Division__Group__4 )
            // InternalLegoLang.g:2364:2: rule__Division__Group__3__Impl rule__Division__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Division__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Division__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Division__Group__3"


    // $ANTLR start "rule__Division__Group__3__Impl"
    // InternalLegoLang.g:2371:1: rule__Division__Group__3__Impl : ( ( rule__Division__RightAssignment_3 ) ) ;
    public final void rule__Division__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2375:1: ( ( ( rule__Division__RightAssignment_3 ) ) )
            // InternalLegoLang.g:2376:1: ( ( rule__Division__RightAssignment_3 ) )
            {
            // InternalLegoLang.g:2376:1: ( ( rule__Division__RightAssignment_3 ) )
            // InternalLegoLang.g:2377:2: ( rule__Division__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivisionAccess().getRightAssignment_3()); 
            }
            // InternalLegoLang.g:2378:2: ( rule__Division__RightAssignment_3 )
            // InternalLegoLang.g:2378:3: rule__Division__RightAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Division__RightAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDivisionAccess().getRightAssignment_3()); 
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
    // $ANTLR end "rule__Division__Group__3__Impl"


    // $ANTLR start "rule__Division__Group__4"
    // InternalLegoLang.g:2386:1: rule__Division__Group__4 : rule__Division__Group__4__Impl ;
    public final void rule__Division__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2390:1: ( rule__Division__Group__4__Impl )
            // InternalLegoLang.g:2391:2: rule__Division__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Division__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Division__Group__4"


    // $ANTLR start "rule__Division__Group__4__Impl"
    // InternalLegoLang.g:2397:1: rule__Division__Group__4__Impl : ( ')' ) ;
    public final void rule__Division__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2401:1: ( ( ')' ) )
            // InternalLegoLang.g:2402:1: ( ')' )
            {
            // InternalLegoLang.g:2402:1: ( ')' )
            // InternalLegoLang.g:2403:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivisionAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDivisionAccess().getRightParenthesisKeyword_4()); 
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
    // $ANTLR end "rule__Division__Group__4__Impl"


    // $ANTLR start "rule__GT__Group__0"
    // InternalLegoLang.g:2413:1: rule__GT__Group__0 : rule__GT__Group__0__Impl rule__GT__Group__1 ;
    public final void rule__GT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2417:1: ( rule__GT__Group__0__Impl rule__GT__Group__1 )
            // InternalLegoLang.g:2418:2: rule__GT__Group__0__Impl rule__GT__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__GT__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GT__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GT__Group__0"


    // $ANTLR start "rule__GT__Group__0__Impl"
    // InternalLegoLang.g:2425:1: rule__GT__Group__0__Impl : ( '(' ) ;
    public final void rule__GT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2429:1: ( ( '(' ) )
            // InternalLegoLang.g:2430:1: ( '(' )
            {
            // InternalLegoLang.g:2430:1: ( '(' )
            // InternalLegoLang.g:2431:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGTAccess().getLeftParenthesisKeyword_0()); 
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
    // $ANTLR end "rule__GT__Group__0__Impl"


    // $ANTLR start "rule__GT__Group__1"
    // InternalLegoLang.g:2440:1: rule__GT__Group__1 : rule__GT__Group__1__Impl rule__GT__Group__2 ;
    public final void rule__GT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2444:1: ( rule__GT__Group__1__Impl rule__GT__Group__2 )
            // InternalLegoLang.g:2445:2: rule__GT__Group__1__Impl rule__GT__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__GT__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GT__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GT__Group__1"


    // $ANTLR start "rule__GT__Group__1__Impl"
    // InternalLegoLang.g:2452:1: rule__GT__Group__1__Impl : ( ( rule__GT__LeftAssignment_1 ) ) ;
    public final void rule__GT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2456:1: ( ( ( rule__GT__LeftAssignment_1 ) ) )
            // InternalLegoLang.g:2457:1: ( ( rule__GT__LeftAssignment_1 ) )
            {
            // InternalLegoLang.g:2457:1: ( ( rule__GT__LeftAssignment_1 ) )
            // InternalLegoLang.g:2458:2: ( rule__GT__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTAccess().getLeftAssignment_1()); 
            }
            // InternalLegoLang.g:2459:2: ( rule__GT__LeftAssignment_1 )
            // InternalLegoLang.g:2459:3: rule__GT__LeftAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__GT__LeftAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGTAccess().getLeftAssignment_1()); 
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
    // $ANTLR end "rule__GT__Group__1__Impl"


    // $ANTLR start "rule__GT__Group__2"
    // InternalLegoLang.g:2467:1: rule__GT__Group__2 : rule__GT__Group__2__Impl rule__GT__Group__3 ;
    public final void rule__GT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2471:1: ( rule__GT__Group__2__Impl rule__GT__Group__3 )
            // InternalLegoLang.g:2472:2: rule__GT__Group__2__Impl rule__GT__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__GT__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GT__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GT__Group__2"


    // $ANTLR start "rule__GT__Group__2__Impl"
    // InternalLegoLang.g:2479:1: rule__GT__Group__2__Impl : ( '>' ) ;
    public final void rule__GT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2483:1: ( ( '>' ) )
            // InternalLegoLang.g:2484:1: ( '>' )
            {
            // InternalLegoLang.g:2484:1: ( '>' )
            // InternalLegoLang.g:2485:2: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTAccess().getGreaterThanSignKeyword_2()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGTAccess().getGreaterThanSignKeyword_2()); 
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
    // $ANTLR end "rule__GT__Group__2__Impl"


    // $ANTLR start "rule__GT__Group__3"
    // InternalLegoLang.g:2494:1: rule__GT__Group__3 : rule__GT__Group__3__Impl rule__GT__Group__4 ;
    public final void rule__GT__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2498:1: ( rule__GT__Group__3__Impl rule__GT__Group__4 )
            // InternalLegoLang.g:2499:2: rule__GT__Group__3__Impl rule__GT__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__GT__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GT__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GT__Group__3"


    // $ANTLR start "rule__GT__Group__3__Impl"
    // InternalLegoLang.g:2506:1: rule__GT__Group__3__Impl : ( ( rule__GT__RightAssignment_3 ) ) ;
    public final void rule__GT__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2510:1: ( ( ( rule__GT__RightAssignment_3 ) ) )
            // InternalLegoLang.g:2511:1: ( ( rule__GT__RightAssignment_3 ) )
            {
            // InternalLegoLang.g:2511:1: ( ( rule__GT__RightAssignment_3 ) )
            // InternalLegoLang.g:2512:2: ( rule__GT__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTAccess().getRightAssignment_3()); 
            }
            // InternalLegoLang.g:2513:2: ( rule__GT__RightAssignment_3 )
            // InternalLegoLang.g:2513:3: rule__GT__RightAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__GT__RightAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGTAccess().getRightAssignment_3()); 
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
    // $ANTLR end "rule__GT__Group__3__Impl"


    // $ANTLR start "rule__GT__Group__4"
    // InternalLegoLang.g:2521:1: rule__GT__Group__4 : rule__GT__Group__4__Impl ;
    public final void rule__GT__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2525:1: ( rule__GT__Group__4__Impl )
            // InternalLegoLang.g:2526:2: rule__GT__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GT__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GT__Group__4"


    // $ANTLR start "rule__GT__Group__4__Impl"
    // InternalLegoLang.g:2532:1: rule__GT__Group__4__Impl : ( ')' ) ;
    public final void rule__GT__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2536:1: ( ( ')' ) )
            // InternalLegoLang.g:2537:1: ( ')' )
            {
            // InternalLegoLang.g:2537:1: ( ')' )
            // InternalLegoLang.g:2538:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGTAccess().getRightParenthesisKeyword_4()); 
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
    // $ANTLR end "rule__GT__Group__4__Impl"


    // $ANTLR start "rule__LT__Group__0"
    // InternalLegoLang.g:2548:1: rule__LT__Group__0 : rule__LT__Group__0__Impl rule__LT__Group__1 ;
    public final void rule__LT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2552:1: ( rule__LT__Group__0__Impl rule__LT__Group__1 )
            // InternalLegoLang.g:2553:2: rule__LT__Group__0__Impl rule__LT__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__LT__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LT__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LT__Group__0"


    // $ANTLR start "rule__LT__Group__0__Impl"
    // InternalLegoLang.g:2560:1: rule__LT__Group__0__Impl : ( '(' ) ;
    public final void rule__LT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2564:1: ( ( '(' ) )
            // InternalLegoLang.g:2565:1: ( '(' )
            {
            // InternalLegoLang.g:2565:1: ( '(' )
            // InternalLegoLang.g:2566:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLTAccess().getLeftParenthesisKeyword_0()); 
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
    // $ANTLR end "rule__LT__Group__0__Impl"


    // $ANTLR start "rule__LT__Group__1"
    // InternalLegoLang.g:2575:1: rule__LT__Group__1 : rule__LT__Group__1__Impl rule__LT__Group__2 ;
    public final void rule__LT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2579:1: ( rule__LT__Group__1__Impl rule__LT__Group__2 )
            // InternalLegoLang.g:2580:2: rule__LT__Group__1__Impl rule__LT__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__LT__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LT__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LT__Group__1"


    // $ANTLR start "rule__LT__Group__1__Impl"
    // InternalLegoLang.g:2587:1: rule__LT__Group__1__Impl : ( ( rule__LT__LeftAssignment_1 ) ) ;
    public final void rule__LT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2591:1: ( ( ( rule__LT__LeftAssignment_1 ) ) )
            // InternalLegoLang.g:2592:1: ( ( rule__LT__LeftAssignment_1 ) )
            {
            // InternalLegoLang.g:2592:1: ( ( rule__LT__LeftAssignment_1 ) )
            // InternalLegoLang.g:2593:2: ( rule__LT__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTAccess().getLeftAssignment_1()); 
            }
            // InternalLegoLang.g:2594:2: ( rule__LT__LeftAssignment_1 )
            // InternalLegoLang.g:2594:3: rule__LT__LeftAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LT__LeftAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLTAccess().getLeftAssignment_1()); 
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
    // $ANTLR end "rule__LT__Group__1__Impl"


    // $ANTLR start "rule__LT__Group__2"
    // InternalLegoLang.g:2602:1: rule__LT__Group__2 : rule__LT__Group__2__Impl rule__LT__Group__3 ;
    public final void rule__LT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2606:1: ( rule__LT__Group__2__Impl rule__LT__Group__3 )
            // InternalLegoLang.g:2607:2: rule__LT__Group__2__Impl rule__LT__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__LT__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LT__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LT__Group__2"


    // $ANTLR start "rule__LT__Group__2__Impl"
    // InternalLegoLang.g:2614:1: rule__LT__Group__2__Impl : ( '<' ) ;
    public final void rule__LT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2618:1: ( ( '<' ) )
            // InternalLegoLang.g:2619:1: ( '<' )
            {
            // InternalLegoLang.g:2619:1: ( '<' )
            // InternalLegoLang.g:2620:2: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTAccess().getLessThanSignKeyword_2()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLTAccess().getLessThanSignKeyword_2()); 
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
    // $ANTLR end "rule__LT__Group__2__Impl"


    // $ANTLR start "rule__LT__Group__3"
    // InternalLegoLang.g:2629:1: rule__LT__Group__3 : rule__LT__Group__3__Impl rule__LT__Group__4 ;
    public final void rule__LT__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2633:1: ( rule__LT__Group__3__Impl rule__LT__Group__4 )
            // InternalLegoLang.g:2634:2: rule__LT__Group__3__Impl rule__LT__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__LT__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LT__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LT__Group__3"


    // $ANTLR start "rule__LT__Group__3__Impl"
    // InternalLegoLang.g:2641:1: rule__LT__Group__3__Impl : ( ( rule__LT__RightAssignment_3 ) ) ;
    public final void rule__LT__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2645:1: ( ( ( rule__LT__RightAssignment_3 ) ) )
            // InternalLegoLang.g:2646:1: ( ( rule__LT__RightAssignment_3 ) )
            {
            // InternalLegoLang.g:2646:1: ( ( rule__LT__RightAssignment_3 ) )
            // InternalLegoLang.g:2647:2: ( rule__LT__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTAccess().getRightAssignment_3()); 
            }
            // InternalLegoLang.g:2648:2: ( rule__LT__RightAssignment_3 )
            // InternalLegoLang.g:2648:3: rule__LT__RightAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__LT__RightAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLTAccess().getRightAssignment_3()); 
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
    // $ANTLR end "rule__LT__Group__3__Impl"


    // $ANTLR start "rule__LT__Group__4"
    // InternalLegoLang.g:2656:1: rule__LT__Group__4 : rule__LT__Group__4__Impl ;
    public final void rule__LT__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2660:1: ( rule__LT__Group__4__Impl )
            // InternalLegoLang.g:2661:2: rule__LT__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LT__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LT__Group__4"


    // $ANTLR start "rule__LT__Group__4__Impl"
    // InternalLegoLang.g:2667:1: rule__LT__Group__4__Impl : ( ')' ) ;
    public final void rule__LT__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2671:1: ( ( ')' ) )
            // InternalLegoLang.g:2672:1: ( ')' )
            {
            // InternalLegoLang.g:2672:1: ( ')' )
            // InternalLegoLang.g:2673:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLTAccess().getRightParenthesisKeyword_4()); 
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
    // $ANTLR end "rule__LT__Group__4__Impl"


    // $ANTLR start "rule__Equal__Group__0"
    // InternalLegoLang.g:2683:1: rule__Equal__Group__0 : rule__Equal__Group__0__Impl rule__Equal__Group__1 ;
    public final void rule__Equal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2687:1: ( rule__Equal__Group__0__Impl rule__Equal__Group__1 )
            // InternalLegoLang.g:2688:2: rule__Equal__Group__0__Impl rule__Equal__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Equal__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Equal__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equal__Group__0"


    // $ANTLR start "rule__Equal__Group__0__Impl"
    // InternalLegoLang.g:2695:1: rule__Equal__Group__0__Impl : ( '(' ) ;
    public final void rule__Equal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2699:1: ( ( '(' ) )
            // InternalLegoLang.g:2700:1: ( '(' )
            {
            // InternalLegoLang.g:2700:1: ( '(' )
            // InternalLegoLang.g:2701:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualAccess().getLeftParenthesisKeyword_0()); 
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
    // $ANTLR end "rule__Equal__Group__0__Impl"


    // $ANTLR start "rule__Equal__Group__1"
    // InternalLegoLang.g:2710:1: rule__Equal__Group__1 : rule__Equal__Group__1__Impl rule__Equal__Group__2 ;
    public final void rule__Equal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2714:1: ( rule__Equal__Group__1__Impl rule__Equal__Group__2 )
            // InternalLegoLang.g:2715:2: rule__Equal__Group__1__Impl rule__Equal__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__Equal__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Equal__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equal__Group__1"


    // $ANTLR start "rule__Equal__Group__1__Impl"
    // InternalLegoLang.g:2722:1: rule__Equal__Group__1__Impl : ( ( rule__Equal__LeftAssignment_1 ) ) ;
    public final void rule__Equal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2726:1: ( ( ( rule__Equal__LeftAssignment_1 ) ) )
            // InternalLegoLang.g:2727:1: ( ( rule__Equal__LeftAssignment_1 ) )
            {
            // InternalLegoLang.g:2727:1: ( ( rule__Equal__LeftAssignment_1 ) )
            // InternalLegoLang.g:2728:2: ( rule__Equal__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualAccess().getLeftAssignment_1()); 
            }
            // InternalLegoLang.g:2729:2: ( rule__Equal__LeftAssignment_1 )
            // InternalLegoLang.g:2729:3: rule__Equal__LeftAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Equal__LeftAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualAccess().getLeftAssignment_1()); 
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
    // $ANTLR end "rule__Equal__Group__1__Impl"


    // $ANTLR start "rule__Equal__Group__2"
    // InternalLegoLang.g:2737:1: rule__Equal__Group__2 : rule__Equal__Group__2__Impl rule__Equal__Group__3 ;
    public final void rule__Equal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2741:1: ( rule__Equal__Group__2__Impl rule__Equal__Group__3 )
            // InternalLegoLang.g:2742:2: rule__Equal__Group__2__Impl rule__Equal__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Equal__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Equal__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equal__Group__2"


    // $ANTLR start "rule__Equal__Group__2__Impl"
    // InternalLegoLang.g:2749:1: rule__Equal__Group__2__Impl : ( '==' ) ;
    public final void rule__Equal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2753:1: ( ( '==' ) )
            // InternalLegoLang.g:2754:1: ( '==' )
            {
            // InternalLegoLang.g:2754:1: ( '==' )
            // InternalLegoLang.g:2755:2: '=='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualAccess().getEqualsSignEqualsSignKeyword_2()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualAccess().getEqualsSignEqualsSignKeyword_2()); 
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
    // $ANTLR end "rule__Equal__Group__2__Impl"


    // $ANTLR start "rule__Equal__Group__3"
    // InternalLegoLang.g:2764:1: rule__Equal__Group__3 : rule__Equal__Group__3__Impl rule__Equal__Group__4 ;
    public final void rule__Equal__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2768:1: ( rule__Equal__Group__3__Impl rule__Equal__Group__4 )
            // InternalLegoLang.g:2769:2: rule__Equal__Group__3__Impl rule__Equal__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Equal__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Equal__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equal__Group__3"


    // $ANTLR start "rule__Equal__Group__3__Impl"
    // InternalLegoLang.g:2776:1: rule__Equal__Group__3__Impl : ( ( rule__Equal__RightAssignment_3 ) ) ;
    public final void rule__Equal__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2780:1: ( ( ( rule__Equal__RightAssignment_3 ) ) )
            // InternalLegoLang.g:2781:1: ( ( rule__Equal__RightAssignment_3 ) )
            {
            // InternalLegoLang.g:2781:1: ( ( rule__Equal__RightAssignment_3 ) )
            // InternalLegoLang.g:2782:2: ( rule__Equal__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualAccess().getRightAssignment_3()); 
            }
            // InternalLegoLang.g:2783:2: ( rule__Equal__RightAssignment_3 )
            // InternalLegoLang.g:2783:3: rule__Equal__RightAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Equal__RightAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualAccess().getRightAssignment_3()); 
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
    // $ANTLR end "rule__Equal__Group__3__Impl"


    // $ANTLR start "rule__Equal__Group__4"
    // InternalLegoLang.g:2791:1: rule__Equal__Group__4 : rule__Equal__Group__4__Impl ;
    public final void rule__Equal__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2795:1: ( rule__Equal__Group__4__Impl )
            // InternalLegoLang.g:2796:2: rule__Equal__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Equal__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equal__Group__4"


    // $ANTLR start "rule__Equal__Group__4__Impl"
    // InternalLegoLang.g:2802:1: rule__Equal__Group__4__Impl : ( ')' ) ;
    public final void rule__Equal__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2806:1: ( ( ')' ) )
            // InternalLegoLang.g:2807:1: ( ')' )
            {
            // InternalLegoLang.g:2807:1: ( ')' )
            // InternalLegoLang.g:2808:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualAccess().getRightParenthesisKeyword_4()); 
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
    // $ANTLR end "rule__Equal__Group__4__Impl"


    // $ANTLR start "rule__Different__Group__0"
    // InternalLegoLang.g:2818:1: rule__Different__Group__0 : rule__Different__Group__0__Impl rule__Different__Group__1 ;
    public final void rule__Different__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2822:1: ( rule__Different__Group__0__Impl rule__Different__Group__1 )
            // InternalLegoLang.g:2823:2: rule__Different__Group__0__Impl rule__Different__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Different__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Different__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Different__Group__0"


    // $ANTLR start "rule__Different__Group__0__Impl"
    // InternalLegoLang.g:2830:1: rule__Different__Group__0__Impl : ( '(' ) ;
    public final void rule__Different__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2834:1: ( ( '(' ) )
            // InternalLegoLang.g:2835:1: ( '(' )
            {
            // InternalLegoLang.g:2835:1: ( '(' )
            // InternalLegoLang.g:2836:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDifferentAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDifferentAccess().getLeftParenthesisKeyword_0()); 
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
    // $ANTLR end "rule__Different__Group__0__Impl"


    // $ANTLR start "rule__Different__Group__1"
    // InternalLegoLang.g:2845:1: rule__Different__Group__1 : rule__Different__Group__1__Impl rule__Different__Group__2 ;
    public final void rule__Different__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2849:1: ( rule__Different__Group__1__Impl rule__Different__Group__2 )
            // InternalLegoLang.g:2850:2: rule__Different__Group__1__Impl rule__Different__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__Different__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Different__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Different__Group__1"


    // $ANTLR start "rule__Different__Group__1__Impl"
    // InternalLegoLang.g:2857:1: rule__Different__Group__1__Impl : ( ( rule__Different__LeftAssignment_1 ) ) ;
    public final void rule__Different__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2861:1: ( ( ( rule__Different__LeftAssignment_1 ) ) )
            // InternalLegoLang.g:2862:1: ( ( rule__Different__LeftAssignment_1 ) )
            {
            // InternalLegoLang.g:2862:1: ( ( rule__Different__LeftAssignment_1 ) )
            // InternalLegoLang.g:2863:2: ( rule__Different__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDifferentAccess().getLeftAssignment_1()); 
            }
            // InternalLegoLang.g:2864:2: ( rule__Different__LeftAssignment_1 )
            // InternalLegoLang.g:2864:3: rule__Different__LeftAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Different__LeftAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDifferentAccess().getLeftAssignment_1()); 
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
    // $ANTLR end "rule__Different__Group__1__Impl"


    // $ANTLR start "rule__Different__Group__2"
    // InternalLegoLang.g:2872:1: rule__Different__Group__2 : rule__Different__Group__2__Impl rule__Different__Group__3 ;
    public final void rule__Different__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2876:1: ( rule__Different__Group__2__Impl rule__Different__Group__3 )
            // InternalLegoLang.g:2877:2: rule__Different__Group__2__Impl rule__Different__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Different__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Different__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Different__Group__2"


    // $ANTLR start "rule__Different__Group__2__Impl"
    // InternalLegoLang.g:2884:1: rule__Different__Group__2__Impl : ( '!=' ) ;
    public final void rule__Different__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2888:1: ( ( '!=' ) )
            // InternalLegoLang.g:2889:1: ( '!=' )
            {
            // InternalLegoLang.g:2889:1: ( '!=' )
            // InternalLegoLang.g:2890:2: '!='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDifferentAccess().getExclamationMarkEqualsSignKeyword_2()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDifferentAccess().getExclamationMarkEqualsSignKeyword_2()); 
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
    // $ANTLR end "rule__Different__Group__2__Impl"


    // $ANTLR start "rule__Different__Group__3"
    // InternalLegoLang.g:2899:1: rule__Different__Group__3 : rule__Different__Group__3__Impl rule__Different__Group__4 ;
    public final void rule__Different__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2903:1: ( rule__Different__Group__3__Impl rule__Different__Group__4 )
            // InternalLegoLang.g:2904:2: rule__Different__Group__3__Impl rule__Different__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Different__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Different__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Different__Group__3"


    // $ANTLR start "rule__Different__Group__3__Impl"
    // InternalLegoLang.g:2911:1: rule__Different__Group__3__Impl : ( ( rule__Different__RightAssignment_3 ) ) ;
    public final void rule__Different__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2915:1: ( ( ( rule__Different__RightAssignment_3 ) ) )
            // InternalLegoLang.g:2916:1: ( ( rule__Different__RightAssignment_3 ) )
            {
            // InternalLegoLang.g:2916:1: ( ( rule__Different__RightAssignment_3 ) )
            // InternalLegoLang.g:2917:2: ( rule__Different__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDifferentAccess().getRightAssignment_3()); 
            }
            // InternalLegoLang.g:2918:2: ( rule__Different__RightAssignment_3 )
            // InternalLegoLang.g:2918:3: rule__Different__RightAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Different__RightAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDifferentAccess().getRightAssignment_3()); 
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
    // $ANTLR end "rule__Different__Group__3__Impl"


    // $ANTLR start "rule__Different__Group__4"
    // InternalLegoLang.g:2926:1: rule__Different__Group__4 : rule__Different__Group__4__Impl ;
    public final void rule__Different__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2930:1: ( rule__Different__Group__4__Impl )
            // InternalLegoLang.g:2931:2: rule__Different__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Different__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Different__Group__4"


    // $ANTLR start "rule__Different__Group__4__Impl"
    // InternalLegoLang.g:2937:1: rule__Different__Group__4__Impl : ( ')' ) ;
    public final void rule__Different__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2941:1: ( ( ')' ) )
            // InternalLegoLang.g:2942:1: ( ')' )
            {
            // InternalLegoLang.g:2942:1: ( ')' )
            // InternalLegoLang.g:2943:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDifferentAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDifferentAccess().getRightParenthesisKeyword_4()); 
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
    // $ANTLR end "rule__Different__Group__4__Impl"


    // $ANTLR start "rule__LTorEqual__Group__0"
    // InternalLegoLang.g:2953:1: rule__LTorEqual__Group__0 : rule__LTorEqual__Group__0__Impl rule__LTorEqual__Group__1 ;
    public final void rule__LTorEqual__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2957:1: ( rule__LTorEqual__Group__0__Impl rule__LTorEqual__Group__1 )
            // InternalLegoLang.g:2958:2: rule__LTorEqual__Group__0__Impl rule__LTorEqual__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__LTorEqual__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LTorEqual__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LTorEqual__Group__0"


    // $ANTLR start "rule__LTorEqual__Group__0__Impl"
    // InternalLegoLang.g:2965:1: rule__LTorEqual__Group__0__Impl : ( '(' ) ;
    public final void rule__LTorEqual__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2969:1: ( ( '(' ) )
            // InternalLegoLang.g:2970:1: ( '(' )
            {
            // InternalLegoLang.g:2970:1: ( '(' )
            // InternalLegoLang.g:2971:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTorEqualAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLTorEqualAccess().getLeftParenthesisKeyword_0()); 
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
    // $ANTLR end "rule__LTorEqual__Group__0__Impl"


    // $ANTLR start "rule__LTorEqual__Group__1"
    // InternalLegoLang.g:2980:1: rule__LTorEqual__Group__1 : rule__LTorEqual__Group__1__Impl rule__LTorEqual__Group__2 ;
    public final void rule__LTorEqual__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2984:1: ( rule__LTorEqual__Group__1__Impl rule__LTorEqual__Group__2 )
            // InternalLegoLang.g:2985:2: rule__LTorEqual__Group__1__Impl rule__LTorEqual__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__LTorEqual__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LTorEqual__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LTorEqual__Group__1"


    // $ANTLR start "rule__LTorEqual__Group__1__Impl"
    // InternalLegoLang.g:2992:1: rule__LTorEqual__Group__1__Impl : ( ( rule__LTorEqual__LeftAssignment_1 ) ) ;
    public final void rule__LTorEqual__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2996:1: ( ( ( rule__LTorEqual__LeftAssignment_1 ) ) )
            // InternalLegoLang.g:2997:1: ( ( rule__LTorEqual__LeftAssignment_1 ) )
            {
            // InternalLegoLang.g:2997:1: ( ( rule__LTorEqual__LeftAssignment_1 ) )
            // InternalLegoLang.g:2998:2: ( rule__LTorEqual__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTorEqualAccess().getLeftAssignment_1()); 
            }
            // InternalLegoLang.g:2999:2: ( rule__LTorEqual__LeftAssignment_1 )
            // InternalLegoLang.g:2999:3: rule__LTorEqual__LeftAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LTorEqual__LeftAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLTorEqualAccess().getLeftAssignment_1()); 
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
    // $ANTLR end "rule__LTorEqual__Group__1__Impl"


    // $ANTLR start "rule__LTorEqual__Group__2"
    // InternalLegoLang.g:3007:1: rule__LTorEqual__Group__2 : rule__LTorEqual__Group__2__Impl rule__LTorEqual__Group__3 ;
    public final void rule__LTorEqual__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3011:1: ( rule__LTorEqual__Group__2__Impl rule__LTorEqual__Group__3 )
            // InternalLegoLang.g:3012:2: rule__LTorEqual__Group__2__Impl rule__LTorEqual__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__LTorEqual__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LTorEqual__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LTorEqual__Group__2"


    // $ANTLR start "rule__LTorEqual__Group__2__Impl"
    // InternalLegoLang.g:3019:1: rule__LTorEqual__Group__2__Impl : ( '<=' ) ;
    public final void rule__LTorEqual__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3023:1: ( ( '<=' ) )
            // InternalLegoLang.g:3024:1: ( '<=' )
            {
            // InternalLegoLang.g:3024:1: ( '<=' )
            // InternalLegoLang.g:3025:2: '<='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTorEqualAccess().getLessThanSignEqualsSignKeyword_2()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLTorEqualAccess().getLessThanSignEqualsSignKeyword_2()); 
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
    // $ANTLR end "rule__LTorEqual__Group__2__Impl"


    // $ANTLR start "rule__LTorEqual__Group__3"
    // InternalLegoLang.g:3034:1: rule__LTorEqual__Group__3 : rule__LTorEqual__Group__3__Impl rule__LTorEqual__Group__4 ;
    public final void rule__LTorEqual__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3038:1: ( rule__LTorEqual__Group__3__Impl rule__LTorEqual__Group__4 )
            // InternalLegoLang.g:3039:2: rule__LTorEqual__Group__3__Impl rule__LTorEqual__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__LTorEqual__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LTorEqual__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LTorEqual__Group__3"


    // $ANTLR start "rule__LTorEqual__Group__3__Impl"
    // InternalLegoLang.g:3046:1: rule__LTorEqual__Group__3__Impl : ( ( rule__LTorEqual__RightAssignment_3 ) ) ;
    public final void rule__LTorEqual__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3050:1: ( ( ( rule__LTorEqual__RightAssignment_3 ) ) )
            // InternalLegoLang.g:3051:1: ( ( rule__LTorEqual__RightAssignment_3 ) )
            {
            // InternalLegoLang.g:3051:1: ( ( rule__LTorEqual__RightAssignment_3 ) )
            // InternalLegoLang.g:3052:2: ( rule__LTorEqual__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTorEqualAccess().getRightAssignment_3()); 
            }
            // InternalLegoLang.g:3053:2: ( rule__LTorEqual__RightAssignment_3 )
            // InternalLegoLang.g:3053:3: rule__LTorEqual__RightAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__LTorEqual__RightAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLTorEqualAccess().getRightAssignment_3()); 
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
    // $ANTLR end "rule__LTorEqual__Group__3__Impl"


    // $ANTLR start "rule__LTorEqual__Group__4"
    // InternalLegoLang.g:3061:1: rule__LTorEqual__Group__4 : rule__LTorEqual__Group__4__Impl ;
    public final void rule__LTorEqual__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3065:1: ( rule__LTorEqual__Group__4__Impl )
            // InternalLegoLang.g:3066:2: rule__LTorEqual__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LTorEqual__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LTorEqual__Group__4"


    // $ANTLR start "rule__LTorEqual__Group__4__Impl"
    // InternalLegoLang.g:3072:1: rule__LTorEqual__Group__4__Impl : ( ')' ) ;
    public final void rule__LTorEqual__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3076:1: ( ( ')' ) )
            // InternalLegoLang.g:3077:1: ( ')' )
            {
            // InternalLegoLang.g:3077:1: ( ')' )
            // InternalLegoLang.g:3078:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTorEqualAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLTorEqualAccess().getRightParenthesisKeyword_4()); 
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
    // $ANTLR end "rule__LTorEqual__Group__4__Impl"


    // $ANTLR start "rule__GTorEqual__Group__0"
    // InternalLegoLang.g:3088:1: rule__GTorEqual__Group__0 : rule__GTorEqual__Group__0__Impl rule__GTorEqual__Group__1 ;
    public final void rule__GTorEqual__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3092:1: ( rule__GTorEqual__Group__0__Impl rule__GTorEqual__Group__1 )
            // InternalLegoLang.g:3093:2: rule__GTorEqual__Group__0__Impl rule__GTorEqual__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__GTorEqual__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GTorEqual__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GTorEqual__Group__0"


    // $ANTLR start "rule__GTorEqual__Group__0__Impl"
    // InternalLegoLang.g:3100:1: rule__GTorEqual__Group__0__Impl : ( '(' ) ;
    public final void rule__GTorEqual__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3104:1: ( ( '(' ) )
            // InternalLegoLang.g:3105:1: ( '(' )
            {
            // InternalLegoLang.g:3105:1: ( '(' )
            // InternalLegoLang.g:3106:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTorEqualAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGTorEqualAccess().getLeftParenthesisKeyword_0()); 
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
    // $ANTLR end "rule__GTorEqual__Group__0__Impl"


    // $ANTLR start "rule__GTorEqual__Group__1"
    // InternalLegoLang.g:3115:1: rule__GTorEqual__Group__1 : rule__GTorEqual__Group__1__Impl rule__GTorEqual__Group__2 ;
    public final void rule__GTorEqual__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3119:1: ( rule__GTorEqual__Group__1__Impl rule__GTorEqual__Group__2 )
            // InternalLegoLang.g:3120:2: rule__GTorEqual__Group__1__Impl rule__GTorEqual__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__GTorEqual__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GTorEqual__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GTorEqual__Group__1"


    // $ANTLR start "rule__GTorEqual__Group__1__Impl"
    // InternalLegoLang.g:3127:1: rule__GTorEqual__Group__1__Impl : ( ( rule__GTorEqual__LeftAssignment_1 ) ) ;
    public final void rule__GTorEqual__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3131:1: ( ( ( rule__GTorEqual__LeftAssignment_1 ) ) )
            // InternalLegoLang.g:3132:1: ( ( rule__GTorEqual__LeftAssignment_1 ) )
            {
            // InternalLegoLang.g:3132:1: ( ( rule__GTorEqual__LeftAssignment_1 ) )
            // InternalLegoLang.g:3133:2: ( rule__GTorEqual__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTorEqualAccess().getLeftAssignment_1()); 
            }
            // InternalLegoLang.g:3134:2: ( rule__GTorEqual__LeftAssignment_1 )
            // InternalLegoLang.g:3134:3: rule__GTorEqual__LeftAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__GTorEqual__LeftAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGTorEqualAccess().getLeftAssignment_1()); 
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
    // $ANTLR end "rule__GTorEqual__Group__1__Impl"


    // $ANTLR start "rule__GTorEqual__Group__2"
    // InternalLegoLang.g:3142:1: rule__GTorEqual__Group__2 : rule__GTorEqual__Group__2__Impl rule__GTorEqual__Group__3 ;
    public final void rule__GTorEqual__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3146:1: ( rule__GTorEqual__Group__2__Impl rule__GTorEqual__Group__3 )
            // InternalLegoLang.g:3147:2: rule__GTorEqual__Group__2__Impl rule__GTorEqual__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__GTorEqual__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GTorEqual__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GTorEqual__Group__2"


    // $ANTLR start "rule__GTorEqual__Group__2__Impl"
    // InternalLegoLang.g:3154:1: rule__GTorEqual__Group__2__Impl : ( '>=' ) ;
    public final void rule__GTorEqual__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3158:1: ( ( '>=' ) )
            // InternalLegoLang.g:3159:1: ( '>=' )
            {
            // InternalLegoLang.g:3159:1: ( '>=' )
            // InternalLegoLang.g:3160:2: '>='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTorEqualAccess().getGreaterThanSignEqualsSignKeyword_2()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGTorEqualAccess().getGreaterThanSignEqualsSignKeyword_2()); 
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
    // $ANTLR end "rule__GTorEqual__Group__2__Impl"


    // $ANTLR start "rule__GTorEqual__Group__3"
    // InternalLegoLang.g:3169:1: rule__GTorEqual__Group__3 : rule__GTorEqual__Group__3__Impl rule__GTorEqual__Group__4 ;
    public final void rule__GTorEqual__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3173:1: ( rule__GTorEqual__Group__3__Impl rule__GTorEqual__Group__4 )
            // InternalLegoLang.g:3174:2: rule__GTorEqual__Group__3__Impl rule__GTorEqual__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__GTorEqual__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GTorEqual__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GTorEqual__Group__3"


    // $ANTLR start "rule__GTorEqual__Group__3__Impl"
    // InternalLegoLang.g:3181:1: rule__GTorEqual__Group__3__Impl : ( ( rule__GTorEqual__RightAssignment_3 ) ) ;
    public final void rule__GTorEqual__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3185:1: ( ( ( rule__GTorEqual__RightAssignment_3 ) ) )
            // InternalLegoLang.g:3186:1: ( ( rule__GTorEqual__RightAssignment_3 ) )
            {
            // InternalLegoLang.g:3186:1: ( ( rule__GTorEqual__RightAssignment_3 ) )
            // InternalLegoLang.g:3187:2: ( rule__GTorEqual__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTorEqualAccess().getRightAssignment_3()); 
            }
            // InternalLegoLang.g:3188:2: ( rule__GTorEqual__RightAssignment_3 )
            // InternalLegoLang.g:3188:3: rule__GTorEqual__RightAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__GTorEqual__RightAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGTorEqualAccess().getRightAssignment_3()); 
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
    // $ANTLR end "rule__GTorEqual__Group__3__Impl"


    // $ANTLR start "rule__GTorEqual__Group__4"
    // InternalLegoLang.g:3196:1: rule__GTorEqual__Group__4 : rule__GTorEqual__Group__4__Impl ;
    public final void rule__GTorEqual__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3200:1: ( rule__GTorEqual__Group__4__Impl )
            // InternalLegoLang.g:3201:2: rule__GTorEqual__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GTorEqual__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GTorEqual__Group__4"


    // $ANTLR start "rule__GTorEqual__Group__4__Impl"
    // InternalLegoLang.g:3207:1: rule__GTorEqual__Group__4__Impl : ( ')' ) ;
    public final void rule__GTorEqual__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3211:1: ( ( ')' ) )
            // InternalLegoLang.g:3212:1: ( ')' )
            {
            // InternalLegoLang.g:3212:1: ( ')' )
            // InternalLegoLang.g:3213:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTorEqualAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGTorEqualAccess().getRightParenthesisKeyword_4()); 
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
    // $ANTLR end "rule__GTorEqual__Group__4__Impl"


    // $ANTLR start "rule__Assignement__Group__0"
    // InternalLegoLang.g:3223:1: rule__Assignement__Group__0 : rule__Assignement__Group__0__Impl rule__Assignement__Group__1 ;
    public final void rule__Assignement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3227:1: ( rule__Assignement__Group__0__Impl rule__Assignement__Group__1 )
            // InternalLegoLang.g:3228:2: rule__Assignement__Group__0__Impl rule__Assignement__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Assignement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Assignement__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignement__Group__0"


    // $ANTLR start "rule__Assignement__Group__0__Impl"
    // InternalLegoLang.g:3235:1: rule__Assignement__Group__0__Impl : ( () ) ;
    public final void rule__Assignement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3239:1: ( ( () ) )
            // InternalLegoLang.g:3240:1: ( () )
            {
            // InternalLegoLang.g:3240:1: ( () )
            // InternalLegoLang.g:3241:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignementAccess().getAssignementAction_0()); 
            }
            // InternalLegoLang.g:3242:2: ()
            // InternalLegoLang.g:3242:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignementAccess().getAssignementAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignement__Group__0__Impl"


    // $ANTLR start "rule__Assignement__Group__1"
    // InternalLegoLang.g:3250:1: rule__Assignement__Group__1 : rule__Assignement__Group__1__Impl rule__Assignement__Group__2 ;
    public final void rule__Assignement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3254:1: ( rule__Assignement__Group__1__Impl rule__Assignement__Group__2 )
            // InternalLegoLang.g:3255:2: rule__Assignement__Group__1__Impl rule__Assignement__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Assignement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Assignement__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignement__Group__1"


    // $ANTLR start "rule__Assignement__Group__1__Impl"
    // InternalLegoLang.g:3262:1: rule__Assignement__Group__1__Impl : ( '(' ) ;
    public final void rule__Assignement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3266:1: ( ( '(' ) )
            // InternalLegoLang.g:3267:1: ( '(' )
            {
            // InternalLegoLang.g:3267:1: ( '(' )
            // InternalLegoLang.g:3268:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignementAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignementAccess().getLeftParenthesisKeyword_1()); 
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
    // $ANTLR end "rule__Assignement__Group__1__Impl"


    // $ANTLR start "rule__Assignement__Group__2"
    // InternalLegoLang.g:3277:1: rule__Assignement__Group__2 : rule__Assignement__Group__2__Impl rule__Assignement__Group__3 ;
    public final void rule__Assignement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3281:1: ( rule__Assignement__Group__2__Impl rule__Assignement__Group__3 )
            // InternalLegoLang.g:3282:2: rule__Assignement__Group__2__Impl rule__Assignement__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__Assignement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Assignement__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignement__Group__2"


    // $ANTLR start "rule__Assignement__Group__2__Impl"
    // InternalLegoLang.g:3289:1: rule__Assignement__Group__2__Impl : ( ( rule__Assignement__LeftAssignment_2 ) ) ;
    public final void rule__Assignement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3293:1: ( ( ( rule__Assignement__LeftAssignment_2 ) ) )
            // InternalLegoLang.g:3294:1: ( ( rule__Assignement__LeftAssignment_2 ) )
            {
            // InternalLegoLang.g:3294:1: ( ( rule__Assignement__LeftAssignment_2 ) )
            // InternalLegoLang.g:3295:2: ( rule__Assignement__LeftAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignementAccess().getLeftAssignment_2()); 
            }
            // InternalLegoLang.g:3296:2: ( rule__Assignement__LeftAssignment_2 )
            // InternalLegoLang.g:3296:3: rule__Assignement__LeftAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Assignement__LeftAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignementAccess().getLeftAssignment_2()); 
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
    // $ANTLR end "rule__Assignement__Group__2__Impl"


    // $ANTLR start "rule__Assignement__Group__3"
    // InternalLegoLang.g:3304:1: rule__Assignement__Group__3 : rule__Assignement__Group__3__Impl rule__Assignement__Group__4 ;
    public final void rule__Assignement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3308:1: ( rule__Assignement__Group__3__Impl rule__Assignement__Group__4 )
            // InternalLegoLang.g:3309:2: rule__Assignement__Group__3__Impl rule__Assignement__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Assignement__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Assignement__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignement__Group__3"


    // $ANTLR start "rule__Assignement__Group__3__Impl"
    // InternalLegoLang.g:3316:1: rule__Assignement__Group__3__Impl : ( '=' ) ;
    public final void rule__Assignement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3320:1: ( ( '=' ) )
            // InternalLegoLang.g:3321:1: ( '=' )
            {
            // InternalLegoLang.g:3321:1: ( '=' )
            // InternalLegoLang.g:3322:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignementAccess().getEqualsSignKeyword_3()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignementAccess().getEqualsSignKeyword_3()); 
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
    // $ANTLR end "rule__Assignement__Group__3__Impl"


    // $ANTLR start "rule__Assignement__Group__4"
    // InternalLegoLang.g:3331:1: rule__Assignement__Group__4 : rule__Assignement__Group__4__Impl rule__Assignement__Group__5 ;
    public final void rule__Assignement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3335:1: ( rule__Assignement__Group__4__Impl rule__Assignement__Group__5 )
            // InternalLegoLang.g:3336:2: rule__Assignement__Group__4__Impl rule__Assignement__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Assignement__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Assignement__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignement__Group__4"


    // $ANTLR start "rule__Assignement__Group__4__Impl"
    // InternalLegoLang.g:3343:1: rule__Assignement__Group__4__Impl : ( ( rule__Assignement__RightAssignment_4 ) ) ;
    public final void rule__Assignement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3347:1: ( ( ( rule__Assignement__RightAssignment_4 ) ) )
            // InternalLegoLang.g:3348:1: ( ( rule__Assignement__RightAssignment_4 ) )
            {
            // InternalLegoLang.g:3348:1: ( ( rule__Assignement__RightAssignment_4 ) )
            // InternalLegoLang.g:3349:2: ( rule__Assignement__RightAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignementAccess().getRightAssignment_4()); 
            }
            // InternalLegoLang.g:3350:2: ( rule__Assignement__RightAssignment_4 )
            // InternalLegoLang.g:3350:3: rule__Assignement__RightAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Assignement__RightAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignementAccess().getRightAssignment_4()); 
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
    // $ANTLR end "rule__Assignement__Group__4__Impl"


    // $ANTLR start "rule__Assignement__Group__5"
    // InternalLegoLang.g:3358:1: rule__Assignement__Group__5 : rule__Assignement__Group__5__Impl ;
    public final void rule__Assignement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3362:1: ( rule__Assignement__Group__5__Impl )
            // InternalLegoLang.g:3363:2: rule__Assignement__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assignement__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignement__Group__5"


    // $ANTLR start "rule__Assignement__Group__5__Impl"
    // InternalLegoLang.g:3369:1: rule__Assignement__Group__5__Impl : ( ');' ) ;
    public final void rule__Assignement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3373:1: ( ( ');' ) )
            // InternalLegoLang.g:3374:1: ( ');' )
            {
            // InternalLegoLang.g:3374:1: ( ');' )
            // InternalLegoLang.g:3375:2: ');'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignementAccess().getRightParenthesisSemicolonKeyword_5()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignementAccess().getRightParenthesisSemicolonKeyword_5()); 
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
    // $ANTLR end "rule__Assignement__Group__5__Impl"


    // $ANTLR start "rule__PlusEqual__Group__0"
    // InternalLegoLang.g:3385:1: rule__PlusEqual__Group__0 : rule__PlusEqual__Group__0__Impl rule__PlusEqual__Group__1 ;
    public final void rule__PlusEqual__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3389:1: ( rule__PlusEqual__Group__0__Impl rule__PlusEqual__Group__1 )
            // InternalLegoLang.g:3390:2: rule__PlusEqual__Group__0__Impl rule__PlusEqual__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__PlusEqual__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PlusEqual__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusEqual__Group__0"


    // $ANTLR start "rule__PlusEqual__Group__0__Impl"
    // InternalLegoLang.g:3397:1: rule__PlusEqual__Group__0__Impl : ( () ) ;
    public final void rule__PlusEqual__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3401:1: ( ( () ) )
            // InternalLegoLang.g:3402:1: ( () )
            {
            // InternalLegoLang.g:3402:1: ( () )
            // InternalLegoLang.g:3403:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusEqualAccess().getPlusEqualAction_0()); 
            }
            // InternalLegoLang.g:3404:2: ()
            // InternalLegoLang.g:3404:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusEqualAccess().getPlusEqualAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusEqual__Group__0__Impl"


    // $ANTLR start "rule__PlusEqual__Group__1"
    // InternalLegoLang.g:3412:1: rule__PlusEqual__Group__1 : rule__PlusEqual__Group__1__Impl rule__PlusEqual__Group__2 ;
    public final void rule__PlusEqual__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3416:1: ( rule__PlusEqual__Group__1__Impl rule__PlusEqual__Group__2 )
            // InternalLegoLang.g:3417:2: rule__PlusEqual__Group__1__Impl rule__PlusEqual__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__PlusEqual__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PlusEqual__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusEqual__Group__1"


    // $ANTLR start "rule__PlusEqual__Group__1__Impl"
    // InternalLegoLang.g:3424:1: rule__PlusEqual__Group__1__Impl : ( '(' ) ;
    public final void rule__PlusEqual__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3428:1: ( ( '(' ) )
            // InternalLegoLang.g:3429:1: ( '(' )
            {
            // InternalLegoLang.g:3429:1: ( '(' )
            // InternalLegoLang.g:3430:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusEqualAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusEqualAccess().getLeftParenthesisKeyword_1()); 
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
    // $ANTLR end "rule__PlusEqual__Group__1__Impl"


    // $ANTLR start "rule__PlusEqual__Group__2"
    // InternalLegoLang.g:3439:1: rule__PlusEqual__Group__2 : rule__PlusEqual__Group__2__Impl rule__PlusEqual__Group__3 ;
    public final void rule__PlusEqual__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3443:1: ( rule__PlusEqual__Group__2__Impl rule__PlusEqual__Group__3 )
            // InternalLegoLang.g:3444:2: rule__PlusEqual__Group__2__Impl rule__PlusEqual__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__PlusEqual__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PlusEqual__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusEqual__Group__2"


    // $ANTLR start "rule__PlusEqual__Group__2__Impl"
    // InternalLegoLang.g:3451:1: rule__PlusEqual__Group__2__Impl : ( ( rule__PlusEqual__LeftAssignment_2 ) ) ;
    public final void rule__PlusEqual__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3455:1: ( ( ( rule__PlusEqual__LeftAssignment_2 ) ) )
            // InternalLegoLang.g:3456:1: ( ( rule__PlusEqual__LeftAssignment_2 ) )
            {
            // InternalLegoLang.g:3456:1: ( ( rule__PlusEqual__LeftAssignment_2 ) )
            // InternalLegoLang.g:3457:2: ( rule__PlusEqual__LeftAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusEqualAccess().getLeftAssignment_2()); 
            }
            // InternalLegoLang.g:3458:2: ( rule__PlusEqual__LeftAssignment_2 )
            // InternalLegoLang.g:3458:3: rule__PlusEqual__LeftAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PlusEqual__LeftAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusEqualAccess().getLeftAssignment_2()); 
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
    // $ANTLR end "rule__PlusEqual__Group__2__Impl"


    // $ANTLR start "rule__PlusEqual__Group__3"
    // InternalLegoLang.g:3466:1: rule__PlusEqual__Group__3 : rule__PlusEqual__Group__3__Impl rule__PlusEqual__Group__4 ;
    public final void rule__PlusEqual__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3470:1: ( rule__PlusEqual__Group__3__Impl rule__PlusEqual__Group__4 )
            // InternalLegoLang.g:3471:2: rule__PlusEqual__Group__3__Impl rule__PlusEqual__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__PlusEqual__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PlusEqual__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusEqual__Group__3"


    // $ANTLR start "rule__PlusEqual__Group__3__Impl"
    // InternalLegoLang.g:3478:1: rule__PlusEqual__Group__3__Impl : ( '+=' ) ;
    public final void rule__PlusEqual__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3482:1: ( ( '+=' ) )
            // InternalLegoLang.g:3483:1: ( '+=' )
            {
            // InternalLegoLang.g:3483:1: ( '+=' )
            // InternalLegoLang.g:3484:2: '+='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusEqualAccess().getPlusSignEqualsSignKeyword_3()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusEqualAccess().getPlusSignEqualsSignKeyword_3()); 
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
    // $ANTLR end "rule__PlusEqual__Group__3__Impl"


    // $ANTLR start "rule__PlusEqual__Group__4"
    // InternalLegoLang.g:3493:1: rule__PlusEqual__Group__4 : rule__PlusEqual__Group__4__Impl rule__PlusEqual__Group__5 ;
    public final void rule__PlusEqual__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3497:1: ( rule__PlusEqual__Group__4__Impl rule__PlusEqual__Group__5 )
            // InternalLegoLang.g:3498:2: rule__PlusEqual__Group__4__Impl rule__PlusEqual__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__PlusEqual__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PlusEqual__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusEqual__Group__4"


    // $ANTLR start "rule__PlusEqual__Group__4__Impl"
    // InternalLegoLang.g:3505:1: rule__PlusEqual__Group__4__Impl : ( ( rule__PlusEqual__RightAssignment_4 ) ) ;
    public final void rule__PlusEqual__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3509:1: ( ( ( rule__PlusEqual__RightAssignment_4 ) ) )
            // InternalLegoLang.g:3510:1: ( ( rule__PlusEqual__RightAssignment_4 ) )
            {
            // InternalLegoLang.g:3510:1: ( ( rule__PlusEqual__RightAssignment_4 ) )
            // InternalLegoLang.g:3511:2: ( rule__PlusEqual__RightAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusEqualAccess().getRightAssignment_4()); 
            }
            // InternalLegoLang.g:3512:2: ( rule__PlusEqual__RightAssignment_4 )
            // InternalLegoLang.g:3512:3: rule__PlusEqual__RightAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__PlusEqual__RightAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusEqualAccess().getRightAssignment_4()); 
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
    // $ANTLR end "rule__PlusEqual__Group__4__Impl"


    // $ANTLR start "rule__PlusEqual__Group__5"
    // InternalLegoLang.g:3520:1: rule__PlusEqual__Group__5 : rule__PlusEqual__Group__5__Impl ;
    public final void rule__PlusEqual__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3524:1: ( rule__PlusEqual__Group__5__Impl )
            // InternalLegoLang.g:3525:2: rule__PlusEqual__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusEqual__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusEqual__Group__5"


    // $ANTLR start "rule__PlusEqual__Group__5__Impl"
    // InternalLegoLang.g:3531:1: rule__PlusEqual__Group__5__Impl : ( ');' ) ;
    public final void rule__PlusEqual__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3535:1: ( ( ');' ) )
            // InternalLegoLang.g:3536:1: ( ');' )
            {
            // InternalLegoLang.g:3536:1: ( ');' )
            // InternalLegoLang.g:3537:2: ');'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusEqualAccess().getRightParenthesisSemicolonKeyword_5()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusEqualAccess().getRightParenthesisSemicolonKeyword_5()); 
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
    // $ANTLR end "rule__PlusEqual__Group__5__Impl"


    // $ANTLR start "rule__MinusEqual__Group__0"
    // InternalLegoLang.g:3547:1: rule__MinusEqual__Group__0 : rule__MinusEqual__Group__0__Impl rule__MinusEqual__Group__1 ;
    public final void rule__MinusEqual__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3551:1: ( rule__MinusEqual__Group__0__Impl rule__MinusEqual__Group__1 )
            // InternalLegoLang.g:3552:2: rule__MinusEqual__Group__0__Impl rule__MinusEqual__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__MinusEqual__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MinusEqual__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinusEqual__Group__0"


    // $ANTLR start "rule__MinusEqual__Group__0__Impl"
    // InternalLegoLang.g:3559:1: rule__MinusEqual__Group__0__Impl : ( () ) ;
    public final void rule__MinusEqual__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3563:1: ( ( () ) )
            // InternalLegoLang.g:3564:1: ( () )
            {
            // InternalLegoLang.g:3564:1: ( () )
            // InternalLegoLang.g:3565:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinusEqualAccess().getMinusEqualAction_0()); 
            }
            // InternalLegoLang.g:3566:2: ()
            // InternalLegoLang.g:3566:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMinusEqualAccess().getMinusEqualAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinusEqual__Group__0__Impl"


    // $ANTLR start "rule__MinusEqual__Group__1"
    // InternalLegoLang.g:3574:1: rule__MinusEqual__Group__1 : rule__MinusEqual__Group__1__Impl rule__MinusEqual__Group__2 ;
    public final void rule__MinusEqual__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3578:1: ( rule__MinusEqual__Group__1__Impl rule__MinusEqual__Group__2 )
            // InternalLegoLang.g:3579:2: rule__MinusEqual__Group__1__Impl rule__MinusEqual__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__MinusEqual__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MinusEqual__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinusEqual__Group__1"


    // $ANTLR start "rule__MinusEqual__Group__1__Impl"
    // InternalLegoLang.g:3586:1: rule__MinusEqual__Group__1__Impl : ( '(' ) ;
    public final void rule__MinusEqual__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3590:1: ( ( '(' ) )
            // InternalLegoLang.g:3591:1: ( '(' )
            {
            // InternalLegoLang.g:3591:1: ( '(' )
            // InternalLegoLang.g:3592:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinusEqualAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMinusEqualAccess().getLeftParenthesisKeyword_1()); 
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
    // $ANTLR end "rule__MinusEqual__Group__1__Impl"


    // $ANTLR start "rule__MinusEqual__Group__2"
    // InternalLegoLang.g:3601:1: rule__MinusEqual__Group__2 : rule__MinusEqual__Group__2__Impl rule__MinusEqual__Group__3 ;
    public final void rule__MinusEqual__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3605:1: ( rule__MinusEqual__Group__2__Impl rule__MinusEqual__Group__3 )
            // InternalLegoLang.g:3606:2: rule__MinusEqual__Group__2__Impl rule__MinusEqual__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__MinusEqual__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MinusEqual__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinusEqual__Group__2"


    // $ANTLR start "rule__MinusEqual__Group__2__Impl"
    // InternalLegoLang.g:3613:1: rule__MinusEqual__Group__2__Impl : ( ( rule__MinusEqual__LeftAssignment_2 ) ) ;
    public final void rule__MinusEqual__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3617:1: ( ( ( rule__MinusEqual__LeftAssignment_2 ) ) )
            // InternalLegoLang.g:3618:1: ( ( rule__MinusEqual__LeftAssignment_2 ) )
            {
            // InternalLegoLang.g:3618:1: ( ( rule__MinusEqual__LeftAssignment_2 ) )
            // InternalLegoLang.g:3619:2: ( rule__MinusEqual__LeftAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinusEqualAccess().getLeftAssignment_2()); 
            }
            // InternalLegoLang.g:3620:2: ( rule__MinusEqual__LeftAssignment_2 )
            // InternalLegoLang.g:3620:3: rule__MinusEqual__LeftAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MinusEqual__LeftAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMinusEqualAccess().getLeftAssignment_2()); 
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
    // $ANTLR end "rule__MinusEqual__Group__2__Impl"


    // $ANTLR start "rule__MinusEqual__Group__3"
    // InternalLegoLang.g:3628:1: rule__MinusEqual__Group__3 : rule__MinusEqual__Group__3__Impl rule__MinusEqual__Group__4 ;
    public final void rule__MinusEqual__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3632:1: ( rule__MinusEqual__Group__3__Impl rule__MinusEqual__Group__4 )
            // InternalLegoLang.g:3633:2: rule__MinusEqual__Group__3__Impl rule__MinusEqual__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__MinusEqual__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MinusEqual__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinusEqual__Group__3"


    // $ANTLR start "rule__MinusEqual__Group__3__Impl"
    // InternalLegoLang.g:3640:1: rule__MinusEqual__Group__3__Impl : ( '-=' ) ;
    public final void rule__MinusEqual__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3644:1: ( ( '-=' ) )
            // InternalLegoLang.g:3645:1: ( '-=' )
            {
            // InternalLegoLang.g:3645:1: ( '-=' )
            // InternalLegoLang.g:3646:2: '-='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinusEqualAccess().getHyphenMinusEqualsSignKeyword_3()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMinusEqualAccess().getHyphenMinusEqualsSignKeyword_3()); 
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
    // $ANTLR end "rule__MinusEqual__Group__3__Impl"


    // $ANTLR start "rule__MinusEqual__Group__4"
    // InternalLegoLang.g:3655:1: rule__MinusEqual__Group__4 : rule__MinusEqual__Group__4__Impl rule__MinusEqual__Group__5 ;
    public final void rule__MinusEqual__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3659:1: ( rule__MinusEqual__Group__4__Impl rule__MinusEqual__Group__5 )
            // InternalLegoLang.g:3660:2: rule__MinusEqual__Group__4__Impl rule__MinusEqual__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__MinusEqual__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MinusEqual__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinusEqual__Group__4"


    // $ANTLR start "rule__MinusEqual__Group__4__Impl"
    // InternalLegoLang.g:3667:1: rule__MinusEqual__Group__4__Impl : ( ( rule__MinusEqual__RightAssignment_4 ) ) ;
    public final void rule__MinusEqual__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3671:1: ( ( ( rule__MinusEqual__RightAssignment_4 ) ) )
            // InternalLegoLang.g:3672:1: ( ( rule__MinusEqual__RightAssignment_4 ) )
            {
            // InternalLegoLang.g:3672:1: ( ( rule__MinusEqual__RightAssignment_4 ) )
            // InternalLegoLang.g:3673:2: ( rule__MinusEqual__RightAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinusEqualAccess().getRightAssignment_4()); 
            }
            // InternalLegoLang.g:3674:2: ( rule__MinusEqual__RightAssignment_4 )
            // InternalLegoLang.g:3674:3: rule__MinusEqual__RightAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__MinusEqual__RightAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMinusEqualAccess().getRightAssignment_4()); 
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
    // $ANTLR end "rule__MinusEqual__Group__4__Impl"


    // $ANTLR start "rule__MinusEqual__Group__5"
    // InternalLegoLang.g:3682:1: rule__MinusEqual__Group__5 : rule__MinusEqual__Group__5__Impl ;
    public final void rule__MinusEqual__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3686:1: ( rule__MinusEqual__Group__5__Impl )
            // InternalLegoLang.g:3687:2: rule__MinusEqual__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MinusEqual__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinusEqual__Group__5"


    // $ANTLR start "rule__MinusEqual__Group__5__Impl"
    // InternalLegoLang.g:3693:1: rule__MinusEqual__Group__5__Impl : ( ');' ) ;
    public final void rule__MinusEqual__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3697:1: ( ( ');' ) )
            // InternalLegoLang.g:3698:1: ( ');' )
            {
            // InternalLegoLang.g:3698:1: ( ');' )
            // InternalLegoLang.g:3699:2: ');'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinusEqualAccess().getRightParenthesisSemicolonKeyword_5()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMinusEqualAccess().getRightParenthesisSemicolonKeyword_5()); 
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
    // $ANTLR end "rule__MinusEqual__Group__5__Impl"


    // $ANTLR start "rule__UnInteger__Group__0"
    // InternalLegoLang.g:3709:1: rule__UnInteger__Group__0 : rule__UnInteger__Group__0__Impl rule__UnInteger__Group__1 ;
    public final void rule__UnInteger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3713:1: ( rule__UnInteger__Group__0__Impl rule__UnInteger__Group__1 )
            // InternalLegoLang.g:3714:2: rule__UnInteger__Group__0__Impl rule__UnInteger__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__UnInteger__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UnInteger__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnInteger__Group__0"


    // $ANTLR start "rule__UnInteger__Group__0__Impl"
    // InternalLegoLang.g:3721:1: rule__UnInteger__Group__0__Impl : ( () ) ;
    public final void rule__UnInteger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3725:1: ( ( () ) )
            // InternalLegoLang.g:3726:1: ( () )
            {
            // InternalLegoLang.g:3726:1: ( () )
            // InternalLegoLang.g:3727:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnIntegerAccess().getUnIntegerAction_0()); 
            }
            // InternalLegoLang.g:3728:2: ()
            // InternalLegoLang.g:3728:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnIntegerAccess().getUnIntegerAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnInteger__Group__0__Impl"


    // $ANTLR start "rule__UnInteger__Group__1"
    // InternalLegoLang.g:3736:1: rule__UnInteger__Group__1 : rule__UnInteger__Group__1__Impl rule__UnInteger__Group__2 ;
    public final void rule__UnInteger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3740:1: ( rule__UnInteger__Group__1__Impl rule__UnInteger__Group__2 )
            // InternalLegoLang.g:3741:2: rule__UnInteger__Group__1__Impl rule__UnInteger__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__UnInteger__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UnInteger__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnInteger__Group__1"


    // $ANTLR start "rule__UnInteger__Group__1__Impl"
    // InternalLegoLang.g:3748:1: rule__UnInteger__Group__1__Impl : ( ( rule__UnInteger__IsConstAssignment_1 )? ) ;
    public final void rule__UnInteger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3752:1: ( ( ( rule__UnInteger__IsConstAssignment_1 )? ) )
            // InternalLegoLang.g:3753:1: ( ( rule__UnInteger__IsConstAssignment_1 )? )
            {
            // InternalLegoLang.g:3753:1: ( ( rule__UnInteger__IsConstAssignment_1 )? )
            // InternalLegoLang.g:3754:2: ( rule__UnInteger__IsConstAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnIntegerAccess().getIsConstAssignment_1()); 
            }
            // InternalLegoLang.g:3755:2: ( rule__UnInteger__IsConstAssignment_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==43) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalLegoLang.g:3755:3: rule__UnInteger__IsConstAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnInteger__IsConstAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnIntegerAccess().getIsConstAssignment_1()); 
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
    // $ANTLR end "rule__UnInteger__Group__1__Impl"


    // $ANTLR start "rule__UnInteger__Group__2"
    // InternalLegoLang.g:3763:1: rule__UnInteger__Group__2 : rule__UnInteger__Group__2__Impl rule__UnInteger__Group__3 ;
    public final void rule__UnInteger__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3767:1: ( rule__UnInteger__Group__2__Impl rule__UnInteger__Group__3 )
            // InternalLegoLang.g:3768:2: rule__UnInteger__Group__2__Impl rule__UnInteger__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__UnInteger__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UnInteger__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnInteger__Group__2"


    // $ANTLR start "rule__UnInteger__Group__2__Impl"
    // InternalLegoLang.g:3775:1: rule__UnInteger__Group__2__Impl : ( 'int' ) ;
    public final void rule__UnInteger__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3779:1: ( ( 'int' ) )
            // InternalLegoLang.g:3780:1: ( 'int' )
            {
            // InternalLegoLang.g:3780:1: ( 'int' )
            // InternalLegoLang.g:3781:2: 'int'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnIntegerAccess().getIntKeyword_2()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnIntegerAccess().getIntKeyword_2()); 
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
    // $ANTLR end "rule__UnInteger__Group__2__Impl"


    // $ANTLR start "rule__UnInteger__Group__3"
    // InternalLegoLang.g:3790:1: rule__UnInteger__Group__3 : rule__UnInteger__Group__3__Impl rule__UnInteger__Group__4 ;
    public final void rule__UnInteger__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3794:1: ( rule__UnInteger__Group__3__Impl rule__UnInteger__Group__4 )
            // InternalLegoLang.g:3795:2: rule__UnInteger__Group__3__Impl rule__UnInteger__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__UnInteger__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UnInteger__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnInteger__Group__3"


    // $ANTLR start "rule__UnInteger__Group__3__Impl"
    // InternalLegoLang.g:3802:1: rule__UnInteger__Group__3__Impl : ( ( rule__UnInteger__NameAssignment_3 ) ) ;
    public final void rule__UnInteger__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3806:1: ( ( ( rule__UnInteger__NameAssignment_3 ) ) )
            // InternalLegoLang.g:3807:1: ( ( rule__UnInteger__NameAssignment_3 ) )
            {
            // InternalLegoLang.g:3807:1: ( ( rule__UnInteger__NameAssignment_3 ) )
            // InternalLegoLang.g:3808:2: ( rule__UnInteger__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnIntegerAccess().getNameAssignment_3()); 
            }
            // InternalLegoLang.g:3809:2: ( rule__UnInteger__NameAssignment_3 )
            // InternalLegoLang.g:3809:3: rule__UnInteger__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__UnInteger__NameAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnIntegerAccess().getNameAssignment_3()); 
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
    // $ANTLR end "rule__UnInteger__Group__3__Impl"


    // $ANTLR start "rule__UnInteger__Group__4"
    // InternalLegoLang.g:3817:1: rule__UnInteger__Group__4 : rule__UnInteger__Group__4__Impl rule__UnInteger__Group__5 ;
    public final void rule__UnInteger__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3821:1: ( rule__UnInteger__Group__4__Impl rule__UnInteger__Group__5 )
            // InternalLegoLang.g:3822:2: rule__UnInteger__Group__4__Impl rule__UnInteger__Group__5
            {
            pushFollow(FOLLOW_31);
            rule__UnInteger__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UnInteger__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnInteger__Group__4"


    // $ANTLR start "rule__UnInteger__Group__4__Impl"
    // InternalLegoLang.g:3829:1: rule__UnInteger__Group__4__Impl : ( ( rule__UnInteger__Group_4__0 )? ) ;
    public final void rule__UnInteger__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3833:1: ( ( ( rule__UnInteger__Group_4__0 )? ) )
            // InternalLegoLang.g:3834:1: ( ( rule__UnInteger__Group_4__0 )? )
            {
            // InternalLegoLang.g:3834:1: ( ( rule__UnInteger__Group_4__0 )? )
            // InternalLegoLang.g:3835:2: ( rule__UnInteger__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnIntegerAccess().getGroup_4()); 
            }
            // InternalLegoLang.g:3836:2: ( rule__UnInteger__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==34) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalLegoLang.g:3836:3: rule__UnInteger__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnInteger__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnIntegerAccess().getGroup_4()); 
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
    // $ANTLR end "rule__UnInteger__Group__4__Impl"


    // $ANTLR start "rule__UnInteger__Group__5"
    // InternalLegoLang.g:3844:1: rule__UnInteger__Group__5 : rule__UnInteger__Group__5__Impl ;
    public final void rule__UnInteger__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3848:1: ( rule__UnInteger__Group__5__Impl )
            // InternalLegoLang.g:3849:2: rule__UnInteger__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnInteger__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnInteger__Group__5"


    // $ANTLR start "rule__UnInteger__Group__5__Impl"
    // InternalLegoLang.g:3855:1: rule__UnInteger__Group__5__Impl : ( ';' ) ;
    public final void rule__UnInteger__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3859:1: ( ( ';' ) )
            // InternalLegoLang.g:3860:1: ( ';' )
            {
            // InternalLegoLang.g:3860:1: ( ';' )
            // InternalLegoLang.g:3861:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnIntegerAccess().getSemicolonKeyword_5()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnIntegerAccess().getSemicolonKeyword_5()); 
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
    // $ANTLR end "rule__UnInteger__Group__5__Impl"


    // $ANTLR start "rule__UnInteger__Group_4__0"
    // InternalLegoLang.g:3871:1: rule__UnInteger__Group_4__0 : rule__UnInteger__Group_4__0__Impl rule__UnInteger__Group_4__1 ;
    public final void rule__UnInteger__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3875:1: ( rule__UnInteger__Group_4__0__Impl rule__UnInteger__Group_4__1 )
            // InternalLegoLang.g:3876:2: rule__UnInteger__Group_4__0__Impl rule__UnInteger__Group_4__1
            {
            pushFollow(FOLLOW_32);
            rule__UnInteger__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UnInteger__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnInteger__Group_4__0"


    // $ANTLR start "rule__UnInteger__Group_4__0__Impl"
    // InternalLegoLang.g:3883:1: rule__UnInteger__Group_4__0__Impl : ( '=' ) ;
    public final void rule__UnInteger__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3887:1: ( ( '=' ) )
            // InternalLegoLang.g:3888:1: ( '=' )
            {
            // InternalLegoLang.g:3888:1: ( '=' )
            // InternalLegoLang.g:3889:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnIntegerAccess().getEqualsSignKeyword_4_0()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnIntegerAccess().getEqualsSignKeyword_4_0()); 
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
    // $ANTLR end "rule__UnInteger__Group_4__0__Impl"


    // $ANTLR start "rule__UnInteger__Group_4__1"
    // InternalLegoLang.g:3898:1: rule__UnInteger__Group_4__1 : rule__UnInteger__Group_4__1__Impl ;
    public final void rule__UnInteger__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3902:1: ( rule__UnInteger__Group_4__1__Impl )
            // InternalLegoLang.g:3903:2: rule__UnInteger__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnInteger__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnInteger__Group_4__1"


    // $ANTLR start "rule__UnInteger__Group_4__1__Impl"
    // InternalLegoLang.g:3909:1: rule__UnInteger__Group_4__1__Impl : ( ( rule__UnInteger__InitialeValueAssignment_4_1 ) ) ;
    public final void rule__UnInteger__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3913:1: ( ( ( rule__UnInteger__InitialeValueAssignment_4_1 ) ) )
            // InternalLegoLang.g:3914:1: ( ( rule__UnInteger__InitialeValueAssignment_4_1 ) )
            {
            // InternalLegoLang.g:3914:1: ( ( rule__UnInteger__InitialeValueAssignment_4_1 ) )
            // InternalLegoLang.g:3915:2: ( rule__UnInteger__InitialeValueAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnIntegerAccess().getInitialeValueAssignment_4_1()); 
            }
            // InternalLegoLang.g:3916:2: ( rule__UnInteger__InitialeValueAssignment_4_1 )
            // InternalLegoLang.g:3916:3: rule__UnInteger__InitialeValueAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__UnInteger__InitialeValueAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnIntegerAccess().getInitialeValueAssignment_4_1()); 
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
    // $ANTLR end "rule__UnInteger__Group_4__1__Impl"


    // $ANTLR start "rule__UnDouble__Group__0"
    // InternalLegoLang.g:3925:1: rule__UnDouble__Group__0 : rule__UnDouble__Group__0__Impl rule__UnDouble__Group__1 ;
    public final void rule__UnDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3929:1: ( rule__UnDouble__Group__0__Impl rule__UnDouble__Group__1 )
            // InternalLegoLang.g:3930:2: rule__UnDouble__Group__0__Impl rule__UnDouble__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__UnDouble__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UnDouble__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnDouble__Group__0"


    // $ANTLR start "rule__UnDouble__Group__0__Impl"
    // InternalLegoLang.g:3937:1: rule__UnDouble__Group__0__Impl : ( () ) ;
    public final void rule__UnDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3941:1: ( ( () ) )
            // InternalLegoLang.g:3942:1: ( () )
            {
            // InternalLegoLang.g:3942:1: ( () )
            // InternalLegoLang.g:3943:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnDoubleAccess().getUnDoubleAction_0()); 
            }
            // InternalLegoLang.g:3944:2: ()
            // InternalLegoLang.g:3944:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnDoubleAccess().getUnDoubleAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnDouble__Group__0__Impl"


    // $ANTLR start "rule__UnDouble__Group__1"
    // InternalLegoLang.g:3952:1: rule__UnDouble__Group__1 : rule__UnDouble__Group__1__Impl rule__UnDouble__Group__2 ;
    public final void rule__UnDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3956:1: ( rule__UnDouble__Group__1__Impl rule__UnDouble__Group__2 )
            // InternalLegoLang.g:3957:2: rule__UnDouble__Group__1__Impl rule__UnDouble__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__UnDouble__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UnDouble__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnDouble__Group__1"


    // $ANTLR start "rule__UnDouble__Group__1__Impl"
    // InternalLegoLang.g:3964:1: rule__UnDouble__Group__1__Impl : ( ( rule__UnDouble__IsConstAssignment_1 )? ) ;
    public final void rule__UnDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3968:1: ( ( ( rule__UnDouble__IsConstAssignment_1 )? ) )
            // InternalLegoLang.g:3969:1: ( ( rule__UnDouble__IsConstAssignment_1 )? )
            {
            // InternalLegoLang.g:3969:1: ( ( rule__UnDouble__IsConstAssignment_1 )? )
            // InternalLegoLang.g:3970:2: ( rule__UnDouble__IsConstAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnDoubleAccess().getIsConstAssignment_1()); 
            }
            // InternalLegoLang.g:3971:2: ( rule__UnDouble__IsConstAssignment_1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==43) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalLegoLang.g:3971:3: rule__UnDouble__IsConstAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnDouble__IsConstAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnDoubleAccess().getIsConstAssignment_1()); 
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
    // $ANTLR end "rule__UnDouble__Group__1__Impl"


    // $ANTLR start "rule__UnDouble__Group__2"
    // InternalLegoLang.g:3979:1: rule__UnDouble__Group__2 : rule__UnDouble__Group__2__Impl rule__UnDouble__Group__3 ;
    public final void rule__UnDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3983:1: ( rule__UnDouble__Group__2__Impl rule__UnDouble__Group__3 )
            // InternalLegoLang.g:3984:2: rule__UnDouble__Group__2__Impl rule__UnDouble__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__UnDouble__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UnDouble__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnDouble__Group__2"


    // $ANTLR start "rule__UnDouble__Group__2__Impl"
    // InternalLegoLang.g:3991:1: rule__UnDouble__Group__2__Impl : ( 'double' ) ;
    public final void rule__UnDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3995:1: ( ( 'double' ) )
            // InternalLegoLang.g:3996:1: ( 'double' )
            {
            // InternalLegoLang.g:3996:1: ( 'double' )
            // InternalLegoLang.g:3997:2: 'double'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnDoubleAccess().getDoubleKeyword_2()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnDoubleAccess().getDoubleKeyword_2()); 
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
    // $ANTLR end "rule__UnDouble__Group__2__Impl"


    // $ANTLR start "rule__UnDouble__Group__3"
    // InternalLegoLang.g:4006:1: rule__UnDouble__Group__3 : rule__UnDouble__Group__3__Impl rule__UnDouble__Group__4 ;
    public final void rule__UnDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4010:1: ( rule__UnDouble__Group__3__Impl rule__UnDouble__Group__4 )
            // InternalLegoLang.g:4011:2: rule__UnDouble__Group__3__Impl rule__UnDouble__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__UnDouble__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UnDouble__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnDouble__Group__3"


    // $ANTLR start "rule__UnDouble__Group__3__Impl"
    // InternalLegoLang.g:4018:1: rule__UnDouble__Group__3__Impl : ( ( rule__UnDouble__NameAssignment_3 ) ) ;
    public final void rule__UnDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4022:1: ( ( ( rule__UnDouble__NameAssignment_3 ) ) )
            // InternalLegoLang.g:4023:1: ( ( rule__UnDouble__NameAssignment_3 ) )
            {
            // InternalLegoLang.g:4023:1: ( ( rule__UnDouble__NameAssignment_3 ) )
            // InternalLegoLang.g:4024:2: ( rule__UnDouble__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnDoubleAccess().getNameAssignment_3()); 
            }
            // InternalLegoLang.g:4025:2: ( rule__UnDouble__NameAssignment_3 )
            // InternalLegoLang.g:4025:3: rule__UnDouble__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__UnDouble__NameAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnDoubleAccess().getNameAssignment_3()); 
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
    // $ANTLR end "rule__UnDouble__Group__3__Impl"


    // $ANTLR start "rule__UnDouble__Group__4"
    // InternalLegoLang.g:4033:1: rule__UnDouble__Group__4 : rule__UnDouble__Group__4__Impl rule__UnDouble__Group__5 ;
    public final void rule__UnDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4037:1: ( rule__UnDouble__Group__4__Impl rule__UnDouble__Group__5 )
            // InternalLegoLang.g:4038:2: rule__UnDouble__Group__4__Impl rule__UnDouble__Group__5
            {
            pushFollow(FOLLOW_31);
            rule__UnDouble__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UnDouble__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnDouble__Group__4"


    // $ANTLR start "rule__UnDouble__Group__4__Impl"
    // InternalLegoLang.g:4045:1: rule__UnDouble__Group__4__Impl : ( ( rule__UnDouble__Group_4__0 )? ) ;
    public final void rule__UnDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4049:1: ( ( ( rule__UnDouble__Group_4__0 )? ) )
            // InternalLegoLang.g:4050:1: ( ( rule__UnDouble__Group_4__0 )? )
            {
            // InternalLegoLang.g:4050:1: ( ( rule__UnDouble__Group_4__0 )? )
            // InternalLegoLang.g:4051:2: ( rule__UnDouble__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnDoubleAccess().getGroup_4()); 
            }
            // InternalLegoLang.g:4052:2: ( rule__UnDouble__Group_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==34) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalLegoLang.g:4052:3: rule__UnDouble__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnDouble__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnDoubleAccess().getGroup_4()); 
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
    // $ANTLR end "rule__UnDouble__Group__4__Impl"


    // $ANTLR start "rule__UnDouble__Group__5"
    // InternalLegoLang.g:4060:1: rule__UnDouble__Group__5 : rule__UnDouble__Group__5__Impl ;
    public final void rule__UnDouble__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4064:1: ( rule__UnDouble__Group__5__Impl )
            // InternalLegoLang.g:4065:2: rule__UnDouble__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnDouble__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnDouble__Group__5"


    // $ANTLR start "rule__UnDouble__Group__5__Impl"
    // InternalLegoLang.g:4071:1: rule__UnDouble__Group__5__Impl : ( ';' ) ;
    public final void rule__UnDouble__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4075:1: ( ( ';' ) )
            // InternalLegoLang.g:4076:1: ( ';' )
            {
            // InternalLegoLang.g:4076:1: ( ';' )
            // InternalLegoLang.g:4077:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnDoubleAccess().getSemicolonKeyword_5()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnDoubleAccess().getSemicolonKeyword_5()); 
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
    // $ANTLR end "rule__UnDouble__Group__5__Impl"


    // $ANTLR start "rule__UnDouble__Group_4__0"
    // InternalLegoLang.g:4087:1: rule__UnDouble__Group_4__0 : rule__UnDouble__Group_4__0__Impl rule__UnDouble__Group_4__1 ;
    public final void rule__UnDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4091:1: ( rule__UnDouble__Group_4__0__Impl rule__UnDouble__Group_4__1 )
            // InternalLegoLang.g:4092:2: rule__UnDouble__Group_4__0__Impl rule__UnDouble__Group_4__1
            {
            pushFollow(FOLLOW_32);
            rule__UnDouble__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UnDouble__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnDouble__Group_4__0"


    // $ANTLR start "rule__UnDouble__Group_4__0__Impl"
    // InternalLegoLang.g:4099:1: rule__UnDouble__Group_4__0__Impl : ( '=' ) ;
    public final void rule__UnDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4103:1: ( ( '=' ) )
            // InternalLegoLang.g:4104:1: ( '=' )
            {
            // InternalLegoLang.g:4104:1: ( '=' )
            // InternalLegoLang.g:4105:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnDoubleAccess().getEqualsSignKeyword_4_0()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnDoubleAccess().getEqualsSignKeyword_4_0()); 
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
    // $ANTLR end "rule__UnDouble__Group_4__0__Impl"


    // $ANTLR start "rule__UnDouble__Group_4__1"
    // InternalLegoLang.g:4114:1: rule__UnDouble__Group_4__1 : rule__UnDouble__Group_4__1__Impl rule__UnDouble__Group_4__2 ;
    public final void rule__UnDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4118:1: ( rule__UnDouble__Group_4__1__Impl rule__UnDouble__Group_4__2 )
            // InternalLegoLang.g:4119:2: rule__UnDouble__Group_4__1__Impl rule__UnDouble__Group_4__2
            {
            pushFollow(FOLLOW_34);
            rule__UnDouble__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UnDouble__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnDouble__Group_4__1"


    // $ANTLR start "rule__UnDouble__Group_4__1__Impl"
    // InternalLegoLang.g:4126:1: rule__UnDouble__Group_4__1__Impl : ( ( rule__UnDouble__InitialeValue1Assignment_4_1 ) ) ;
    public final void rule__UnDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4130:1: ( ( ( rule__UnDouble__InitialeValue1Assignment_4_1 ) ) )
            // InternalLegoLang.g:4131:1: ( ( rule__UnDouble__InitialeValue1Assignment_4_1 ) )
            {
            // InternalLegoLang.g:4131:1: ( ( rule__UnDouble__InitialeValue1Assignment_4_1 ) )
            // InternalLegoLang.g:4132:2: ( rule__UnDouble__InitialeValue1Assignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnDoubleAccess().getInitialeValue1Assignment_4_1()); 
            }
            // InternalLegoLang.g:4133:2: ( rule__UnDouble__InitialeValue1Assignment_4_1 )
            // InternalLegoLang.g:4133:3: rule__UnDouble__InitialeValue1Assignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__UnDouble__InitialeValue1Assignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnDoubleAccess().getInitialeValue1Assignment_4_1()); 
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
    // $ANTLR end "rule__UnDouble__Group_4__1__Impl"


    // $ANTLR start "rule__UnDouble__Group_4__2"
    // InternalLegoLang.g:4141:1: rule__UnDouble__Group_4__2 : rule__UnDouble__Group_4__2__Impl ;
    public final void rule__UnDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4145:1: ( rule__UnDouble__Group_4__2__Impl )
            // InternalLegoLang.g:4146:2: rule__UnDouble__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnDouble__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnDouble__Group_4__2"


    // $ANTLR start "rule__UnDouble__Group_4__2__Impl"
    // InternalLegoLang.g:4152:1: rule__UnDouble__Group_4__2__Impl : ( ( rule__UnDouble__Group_4_2__0 )? ) ;
    public final void rule__UnDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4156:1: ( ( ( rule__UnDouble__Group_4_2__0 )? ) )
            // InternalLegoLang.g:4157:1: ( ( rule__UnDouble__Group_4_2__0 )? )
            {
            // InternalLegoLang.g:4157:1: ( ( rule__UnDouble__Group_4_2__0 )? )
            // InternalLegoLang.g:4158:2: ( rule__UnDouble__Group_4_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnDoubleAccess().getGroup_4_2()); 
            }
            // InternalLegoLang.g:4159:2: ( rule__UnDouble__Group_4_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==40) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalLegoLang.g:4159:3: rule__UnDouble__Group_4_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnDouble__Group_4_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnDoubleAccess().getGroup_4_2()); 
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
    // $ANTLR end "rule__UnDouble__Group_4__2__Impl"


    // $ANTLR start "rule__UnDouble__Group_4_2__0"
    // InternalLegoLang.g:4168:1: rule__UnDouble__Group_4_2__0 : rule__UnDouble__Group_4_2__0__Impl rule__UnDouble__Group_4_2__1 ;
    public final void rule__UnDouble__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4172:1: ( rule__UnDouble__Group_4_2__0__Impl rule__UnDouble__Group_4_2__1 )
            // InternalLegoLang.g:4173:2: rule__UnDouble__Group_4_2__0__Impl rule__UnDouble__Group_4_2__1
            {
            pushFollow(FOLLOW_32);
            rule__UnDouble__Group_4_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UnDouble__Group_4_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnDouble__Group_4_2__0"


    // $ANTLR start "rule__UnDouble__Group_4_2__0__Impl"
    // InternalLegoLang.g:4180:1: rule__UnDouble__Group_4_2__0__Impl : ( '.' ) ;
    public final void rule__UnDouble__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4184:1: ( ( '.' ) )
            // InternalLegoLang.g:4185:1: ( '.' )
            {
            // InternalLegoLang.g:4185:1: ( '.' )
            // InternalLegoLang.g:4186:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnDoubleAccess().getFullStopKeyword_4_2_0()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnDoubleAccess().getFullStopKeyword_4_2_0()); 
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
    // $ANTLR end "rule__UnDouble__Group_4_2__0__Impl"


    // $ANTLR start "rule__UnDouble__Group_4_2__1"
    // InternalLegoLang.g:4195:1: rule__UnDouble__Group_4_2__1 : rule__UnDouble__Group_4_2__1__Impl ;
    public final void rule__UnDouble__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4199:1: ( rule__UnDouble__Group_4_2__1__Impl )
            // InternalLegoLang.g:4200:2: rule__UnDouble__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnDouble__Group_4_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnDouble__Group_4_2__1"


    // $ANTLR start "rule__UnDouble__Group_4_2__1__Impl"
    // InternalLegoLang.g:4206:1: rule__UnDouble__Group_4_2__1__Impl : ( ( rule__UnDouble__InitialeValue2Assignment_4_2_1 ) ) ;
    public final void rule__UnDouble__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4210:1: ( ( ( rule__UnDouble__InitialeValue2Assignment_4_2_1 ) ) )
            // InternalLegoLang.g:4211:1: ( ( rule__UnDouble__InitialeValue2Assignment_4_2_1 ) )
            {
            // InternalLegoLang.g:4211:1: ( ( rule__UnDouble__InitialeValue2Assignment_4_2_1 ) )
            // InternalLegoLang.g:4212:2: ( rule__UnDouble__InitialeValue2Assignment_4_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnDoubleAccess().getInitialeValue2Assignment_4_2_1()); 
            }
            // InternalLegoLang.g:4213:2: ( rule__UnDouble__InitialeValue2Assignment_4_2_1 )
            // InternalLegoLang.g:4213:3: rule__UnDouble__InitialeValue2Assignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__UnDouble__InitialeValue2Assignment_4_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnDoubleAccess().getInitialeValue2Assignment_4_2_1()); 
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
    // $ANTLR end "rule__UnDouble__Group_4_2__1__Impl"


    // $ANTLR start "rule__UnBoolean__Group__0"
    // InternalLegoLang.g:4222:1: rule__UnBoolean__Group__0 : rule__UnBoolean__Group__0__Impl rule__UnBoolean__Group__1 ;
    public final void rule__UnBoolean__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4226:1: ( rule__UnBoolean__Group__0__Impl rule__UnBoolean__Group__1 )
            // InternalLegoLang.g:4227:2: rule__UnBoolean__Group__0__Impl rule__UnBoolean__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__UnBoolean__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UnBoolean__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnBoolean__Group__0"


    // $ANTLR start "rule__UnBoolean__Group__0__Impl"
    // InternalLegoLang.g:4234:1: rule__UnBoolean__Group__0__Impl : ( () ) ;
    public final void rule__UnBoolean__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4238:1: ( ( () ) )
            // InternalLegoLang.g:4239:1: ( () )
            {
            // InternalLegoLang.g:4239:1: ( () )
            // InternalLegoLang.g:4240:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnBooleanAccess().getUnBooleanAction_0()); 
            }
            // InternalLegoLang.g:4241:2: ()
            // InternalLegoLang.g:4241:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnBooleanAccess().getUnBooleanAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnBoolean__Group__0__Impl"


    // $ANTLR start "rule__UnBoolean__Group__1"
    // InternalLegoLang.g:4249:1: rule__UnBoolean__Group__1 : rule__UnBoolean__Group__1__Impl rule__UnBoolean__Group__2 ;
    public final void rule__UnBoolean__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4253:1: ( rule__UnBoolean__Group__1__Impl rule__UnBoolean__Group__2 )
            // InternalLegoLang.g:4254:2: rule__UnBoolean__Group__1__Impl rule__UnBoolean__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__UnBoolean__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UnBoolean__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnBoolean__Group__1"


    // $ANTLR start "rule__UnBoolean__Group__1__Impl"
    // InternalLegoLang.g:4261:1: rule__UnBoolean__Group__1__Impl : ( ( rule__UnBoolean__IsConstAssignment_1 )? ) ;
    public final void rule__UnBoolean__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4265:1: ( ( ( rule__UnBoolean__IsConstAssignment_1 )? ) )
            // InternalLegoLang.g:4266:1: ( ( rule__UnBoolean__IsConstAssignment_1 )? )
            {
            // InternalLegoLang.g:4266:1: ( ( rule__UnBoolean__IsConstAssignment_1 )? )
            // InternalLegoLang.g:4267:2: ( rule__UnBoolean__IsConstAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnBooleanAccess().getIsConstAssignment_1()); 
            }
            // InternalLegoLang.g:4268:2: ( rule__UnBoolean__IsConstAssignment_1 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==43) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalLegoLang.g:4268:3: rule__UnBoolean__IsConstAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnBoolean__IsConstAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnBooleanAccess().getIsConstAssignment_1()); 
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
    // $ANTLR end "rule__UnBoolean__Group__1__Impl"


    // $ANTLR start "rule__UnBoolean__Group__2"
    // InternalLegoLang.g:4276:1: rule__UnBoolean__Group__2 : rule__UnBoolean__Group__2__Impl rule__UnBoolean__Group__3 ;
    public final void rule__UnBoolean__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4280:1: ( rule__UnBoolean__Group__2__Impl rule__UnBoolean__Group__3 )
            // InternalLegoLang.g:4281:2: rule__UnBoolean__Group__2__Impl rule__UnBoolean__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__UnBoolean__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UnBoolean__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnBoolean__Group__2"


    // $ANTLR start "rule__UnBoolean__Group__2__Impl"
    // InternalLegoLang.g:4288:1: rule__UnBoolean__Group__2__Impl : ( 'bool' ) ;
    public final void rule__UnBoolean__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4292:1: ( ( 'bool' ) )
            // InternalLegoLang.g:4293:1: ( 'bool' )
            {
            // InternalLegoLang.g:4293:1: ( 'bool' )
            // InternalLegoLang.g:4294:2: 'bool'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnBooleanAccess().getBoolKeyword_2()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnBooleanAccess().getBoolKeyword_2()); 
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
    // $ANTLR end "rule__UnBoolean__Group__2__Impl"


    // $ANTLR start "rule__UnBoolean__Group__3"
    // InternalLegoLang.g:4303:1: rule__UnBoolean__Group__3 : rule__UnBoolean__Group__3__Impl rule__UnBoolean__Group__4 ;
    public final void rule__UnBoolean__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4307:1: ( rule__UnBoolean__Group__3__Impl rule__UnBoolean__Group__4 )
            // InternalLegoLang.g:4308:2: rule__UnBoolean__Group__3__Impl rule__UnBoolean__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__UnBoolean__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UnBoolean__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnBoolean__Group__3"


    // $ANTLR start "rule__UnBoolean__Group__3__Impl"
    // InternalLegoLang.g:4315:1: rule__UnBoolean__Group__3__Impl : ( ( rule__UnBoolean__NameAssignment_3 ) ) ;
    public final void rule__UnBoolean__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4319:1: ( ( ( rule__UnBoolean__NameAssignment_3 ) ) )
            // InternalLegoLang.g:4320:1: ( ( rule__UnBoolean__NameAssignment_3 ) )
            {
            // InternalLegoLang.g:4320:1: ( ( rule__UnBoolean__NameAssignment_3 ) )
            // InternalLegoLang.g:4321:2: ( rule__UnBoolean__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnBooleanAccess().getNameAssignment_3()); 
            }
            // InternalLegoLang.g:4322:2: ( rule__UnBoolean__NameAssignment_3 )
            // InternalLegoLang.g:4322:3: rule__UnBoolean__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__UnBoolean__NameAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnBooleanAccess().getNameAssignment_3()); 
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
    // $ANTLR end "rule__UnBoolean__Group__3__Impl"


    // $ANTLR start "rule__UnBoolean__Group__4"
    // InternalLegoLang.g:4330:1: rule__UnBoolean__Group__4 : rule__UnBoolean__Group__4__Impl rule__UnBoolean__Group__5 ;
    public final void rule__UnBoolean__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4334:1: ( rule__UnBoolean__Group__4__Impl rule__UnBoolean__Group__5 )
            // InternalLegoLang.g:4335:2: rule__UnBoolean__Group__4__Impl rule__UnBoolean__Group__5
            {
            pushFollow(FOLLOW_31);
            rule__UnBoolean__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UnBoolean__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnBoolean__Group__4"


    // $ANTLR start "rule__UnBoolean__Group__4__Impl"
    // InternalLegoLang.g:4342:1: rule__UnBoolean__Group__4__Impl : ( ( rule__UnBoolean__Group_4__0 )? ) ;
    public final void rule__UnBoolean__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4346:1: ( ( ( rule__UnBoolean__Group_4__0 )? ) )
            // InternalLegoLang.g:4347:1: ( ( rule__UnBoolean__Group_4__0 )? )
            {
            // InternalLegoLang.g:4347:1: ( ( rule__UnBoolean__Group_4__0 )? )
            // InternalLegoLang.g:4348:2: ( rule__UnBoolean__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnBooleanAccess().getGroup_4()); 
            }
            // InternalLegoLang.g:4349:2: ( rule__UnBoolean__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==34) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalLegoLang.g:4349:3: rule__UnBoolean__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnBoolean__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnBooleanAccess().getGroup_4()); 
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
    // $ANTLR end "rule__UnBoolean__Group__4__Impl"


    // $ANTLR start "rule__UnBoolean__Group__5"
    // InternalLegoLang.g:4357:1: rule__UnBoolean__Group__5 : rule__UnBoolean__Group__5__Impl ;
    public final void rule__UnBoolean__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4361:1: ( rule__UnBoolean__Group__5__Impl )
            // InternalLegoLang.g:4362:2: rule__UnBoolean__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnBoolean__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnBoolean__Group__5"


    // $ANTLR start "rule__UnBoolean__Group__5__Impl"
    // InternalLegoLang.g:4368:1: rule__UnBoolean__Group__5__Impl : ( ';' ) ;
    public final void rule__UnBoolean__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4372:1: ( ( ';' ) )
            // InternalLegoLang.g:4373:1: ( ';' )
            {
            // InternalLegoLang.g:4373:1: ( ';' )
            // InternalLegoLang.g:4374:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnBooleanAccess().getSemicolonKeyword_5()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnBooleanAccess().getSemicolonKeyword_5()); 
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
    // $ANTLR end "rule__UnBoolean__Group__5__Impl"


    // $ANTLR start "rule__UnBoolean__Group_4__0"
    // InternalLegoLang.g:4384:1: rule__UnBoolean__Group_4__0 : rule__UnBoolean__Group_4__0__Impl rule__UnBoolean__Group_4__1 ;
    public final void rule__UnBoolean__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4388:1: ( rule__UnBoolean__Group_4__0__Impl rule__UnBoolean__Group_4__1 )
            // InternalLegoLang.g:4389:2: rule__UnBoolean__Group_4__0__Impl rule__UnBoolean__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__UnBoolean__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UnBoolean__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnBoolean__Group_4__0"


    // $ANTLR start "rule__UnBoolean__Group_4__0__Impl"
    // InternalLegoLang.g:4396:1: rule__UnBoolean__Group_4__0__Impl : ( '=' ) ;
    public final void rule__UnBoolean__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4400:1: ( ( '=' ) )
            // InternalLegoLang.g:4401:1: ( '=' )
            {
            // InternalLegoLang.g:4401:1: ( '=' )
            // InternalLegoLang.g:4402:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnBooleanAccess().getEqualsSignKeyword_4_0()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnBooleanAccess().getEqualsSignKeyword_4_0()); 
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
    // $ANTLR end "rule__UnBoolean__Group_4__0__Impl"


    // $ANTLR start "rule__UnBoolean__Group_4__1"
    // InternalLegoLang.g:4411:1: rule__UnBoolean__Group_4__1 : rule__UnBoolean__Group_4__1__Impl ;
    public final void rule__UnBoolean__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4415:1: ( rule__UnBoolean__Group_4__1__Impl )
            // InternalLegoLang.g:4416:2: rule__UnBoolean__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnBoolean__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnBoolean__Group_4__1"


    // $ANTLR start "rule__UnBoolean__Group_4__1__Impl"
    // InternalLegoLang.g:4422:1: rule__UnBoolean__Group_4__1__Impl : ( ( rule__UnBoolean__InitialeValueAssignment_4_1 ) ) ;
    public final void rule__UnBoolean__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4426:1: ( ( ( rule__UnBoolean__InitialeValueAssignment_4_1 ) ) )
            // InternalLegoLang.g:4427:1: ( ( rule__UnBoolean__InitialeValueAssignment_4_1 ) )
            {
            // InternalLegoLang.g:4427:1: ( ( rule__UnBoolean__InitialeValueAssignment_4_1 ) )
            // InternalLegoLang.g:4428:2: ( rule__UnBoolean__InitialeValueAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnBooleanAccess().getInitialeValueAssignment_4_1()); 
            }
            // InternalLegoLang.g:4429:2: ( rule__UnBoolean__InitialeValueAssignment_4_1 )
            // InternalLegoLang.g:4429:3: rule__UnBoolean__InitialeValueAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__UnBoolean__InitialeValueAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnBooleanAccess().getInitialeValueAssignment_4_1()); 
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
    // $ANTLR end "rule__UnBoolean__Group_4__1__Impl"


    // $ANTLR start "rule__UnString__Group__0"
    // InternalLegoLang.g:4438:1: rule__UnString__Group__0 : rule__UnString__Group__0__Impl rule__UnString__Group__1 ;
    public final void rule__UnString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4442:1: ( rule__UnString__Group__0__Impl rule__UnString__Group__1 )
            // InternalLegoLang.g:4443:2: rule__UnString__Group__0__Impl rule__UnString__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__UnString__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UnString__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnString__Group__0"


    // $ANTLR start "rule__UnString__Group__0__Impl"
    // InternalLegoLang.g:4450:1: rule__UnString__Group__0__Impl : ( () ) ;
    public final void rule__UnString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4454:1: ( ( () ) )
            // InternalLegoLang.g:4455:1: ( () )
            {
            // InternalLegoLang.g:4455:1: ( () )
            // InternalLegoLang.g:4456:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnStringAccess().getUnStringAction_0()); 
            }
            // InternalLegoLang.g:4457:2: ()
            // InternalLegoLang.g:4457:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnStringAccess().getUnStringAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnString__Group__0__Impl"


    // $ANTLR start "rule__UnString__Group__1"
    // InternalLegoLang.g:4465:1: rule__UnString__Group__1 : rule__UnString__Group__1__Impl rule__UnString__Group__2 ;
    public final void rule__UnString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4469:1: ( rule__UnString__Group__1__Impl rule__UnString__Group__2 )
            // InternalLegoLang.g:4470:2: rule__UnString__Group__1__Impl rule__UnString__Group__2
            {
            pushFollow(FOLLOW_36);
            rule__UnString__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UnString__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnString__Group__1"


    // $ANTLR start "rule__UnString__Group__1__Impl"
    // InternalLegoLang.g:4477:1: rule__UnString__Group__1__Impl : ( ( rule__UnString__IsConstAssignment_1 )? ) ;
    public final void rule__UnString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4481:1: ( ( ( rule__UnString__IsConstAssignment_1 )? ) )
            // InternalLegoLang.g:4482:1: ( ( rule__UnString__IsConstAssignment_1 )? )
            {
            // InternalLegoLang.g:4482:1: ( ( rule__UnString__IsConstAssignment_1 )? )
            // InternalLegoLang.g:4483:2: ( rule__UnString__IsConstAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnStringAccess().getIsConstAssignment_1()); 
            }
            // InternalLegoLang.g:4484:2: ( rule__UnString__IsConstAssignment_1 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==43) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalLegoLang.g:4484:3: rule__UnString__IsConstAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnString__IsConstAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnStringAccess().getIsConstAssignment_1()); 
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
    // $ANTLR end "rule__UnString__Group__1__Impl"


    // $ANTLR start "rule__UnString__Group__2"
    // InternalLegoLang.g:4492:1: rule__UnString__Group__2 : rule__UnString__Group__2__Impl rule__UnString__Group__3 ;
    public final void rule__UnString__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4496:1: ( rule__UnString__Group__2__Impl rule__UnString__Group__3 )
            // InternalLegoLang.g:4497:2: rule__UnString__Group__2__Impl rule__UnString__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__UnString__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UnString__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnString__Group__2"


    // $ANTLR start "rule__UnString__Group__2__Impl"
    // InternalLegoLang.g:4504:1: rule__UnString__Group__2__Impl : ( 'string' ) ;
    public final void rule__UnString__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4508:1: ( ( 'string' ) )
            // InternalLegoLang.g:4509:1: ( 'string' )
            {
            // InternalLegoLang.g:4509:1: ( 'string' )
            // InternalLegoLang.g:4510:2: 'string'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnStringAccess().getStringKeyword_2()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnStringAccess().getStringKeyword_2()); 
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
    // $ANTLR end "rule__UnString__Group__2__Impl"


    // $ANTLR start "rule__UnString__Group__3"
    // InternalLegoLang.g:4519:1: rule__UnString__Group__3 : rule__UnString__Group__3__Impl rule__UnString__Group__4 ;
    public final void rule__UnString__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4523:1: ( rule__UnString__Group__3__Impl rule__UnString__Group__4 )
            // InternalLegoLang.g:4524:2: rule__UnString__Group__3__Impl rule__UnString__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__UnString__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UnString__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnString__Group__3"


    // $ANTLR start "rule__UnString__Group__3__Impl"
    // InternalLegoLang.g:4531:1: rule__UnString__Group__3__Impl : ( ( rule__UnString__NameAssignment_3 ) ) ;
    public final void rule__UnString__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4535:1: ( ( ( rule__UnString__NameAssignment_3 ) ) )
            // InternalLegoLang.g:4536:1: ( ( rule__UnString__NameAssignment_3 ) )
            {
            // InternalLegoLang.g:4536:1: ( ( rule__UnString__NameAssignment_3 ) )
            // InternalLegoLang.g:4537:2: ( rule__UnString__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnStringAccess().getNameAssignment_3()); 
            }
            // InternalLegoLang.g:4538:2: ( rule__UnString__NameAssignment_3 )
            // InternalLegoLang.g:4538:3: rule__UnString__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__UnString__NameAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnStringAccess().getNameAssignment_3()); 
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
    // $ANTLR end "rule__UnString__Group__3__Impl"


    // $ANTLR start "rule__UnString__Group__4"
    // InternalLegoLang.g:4546:1: rule__UnString__Group__4 : rule__UnString__Group__4__Impl rule__UnString__Group__5 ;
    public final void rule__UnString__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4550:1: ( rule__UnString__Group__4__Impl rule__UnString__Group__5 )
            // InternalLegoLang.g:4551:2: rule__UnString__Group__4__Impl rule__UnString__Group__5
            {
            pushFollow(FOLLOW_31);
            rule__UnString__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UnString__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnString__Group__4"


    // $ANTLR start "rule__UnString__Group__4__Impl"
    // InternalLegoLang.g:4558:1: rule__UnString__Group__4__Impl : ( ( rule__UnString__Group_4__0 )? ) ;
    public final void rule__UnString__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4562:1: ( ( ( rule__UnString__Group_4__0 )? ) )
            // InternalLegoLang.g:4563:1: ( ( rule__UnString__Group_4__0 )? )
            {
            // InternalLegoLang.g:4563:1: ( ( rule__UnString__Group_4__0 )? )
            // InternalLegoLang.g:4564:2: ( rule__UnString__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnStringAccess().getGroup_4()); 
            }
            // InternalLegoLang.g:4565:2: ( rule__UnString__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==34) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalLegoLang.g:4565:3: rule__UnString__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnString__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnStringAccess().getGroup_4()); 
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
    // $ANTLR end "rule__UnString__Group__4__Impl"


    // $ANTLR start "rule__UnString__Group__5"
    // InternalLegoLang.g:4573:1: rule__UnString__Group__5 : rule__UnString__Group__5__Impl ;
    public final void rule__UnString__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4577:1: ( rule__UnString__Group__5__Impl )
            // InternalLegoLang.g:4578:2: rule__UnString__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnString__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnString__Group__5"


    // $ANTLR start "rule__UnString__Group__5__Impl"
    // InternalLegoLang.g:4584:1: rule__UnString__Group__5__Impl : ( ';' ) ;
    public final void rule__UnString__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4588:1: ( ( ';' ) )
            // InternalLegoLang.g:4589:1: ( ';' )
            {
            // InternalLegoLang.g:4589:1: ( ';' )
            // InternalLegoLang.g:4590:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnStringAccess().getSemicolonKeyword_5()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnStringAccess().getSemicolonKeyword_5()); 
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
    // $ANTLR end "rule__UnString__Group__5__Impl"


    // $ANTLR start "rule__UnString__Group_4__0"
    // InternalLegoLang.g:4600:1: rule__UnString__Group_4__0 : rule__UnString__Group_4__0__Impl rule__UnString__Group_4__1 ;
    public final void rule__UnString__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4604:1: ( rule__UnString__Group_4__0__Impl rule__UnString__Group_4__1 )
            // InternalLegoLang.g:4605:2: rule__UnString__Group_4__0__Impl rule__UnString__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__UnString__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UnString__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnString__Group_4__0"


    // $ANTLR start "rule__UnString__Group_4__0__Impl"
    // InternalLegoLang.g:4612:1: rule__UnString__Group_4__0__Impl : ( '=' ) ;
    public final void rule__UnString__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4616:1: ( ( '=' ) )
            // InternalLegoLang.g:4617:1: ( '=' )
            {
            // InternalLegoLang.g:4617:1: ( '=' )
            // InternalLegoLang.g:4618:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnStringAccess().getEqualsSignKeyword_4_0()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnStringAccess().getEqualsSignKeyword_4_0()); 
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
    // $ANTLR end "rule__UnString__Group_4__0__Impl"


    // $ANTLR start "rule__UnString__Group_4__1"
    // InternalLegoLang.g:4627:1: rule__UnString__Group_4__1 : rule__UnString__Group_4__1__Impl ;
    public final void rule__UnString__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4631:1: ( rule__UnString__Group_4__1__Impl )
            // InternalLegoLang.g:4632:2: rule__UnString__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnString__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnString__Group_4__1"


    // $ANTLR start "rule__UnString__Group_4__1__Impl"
    // InternalLegoLang.g:4638:1: rule__UnString__Group_4__1__Impl : ( ( rule__UnString__InitialeValueAssignment_4_1 ) ) ;
    public final void rule__UnString__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4642:1: ( ( ( rule__UnString__InitialeValueAssignment_4_1 ) ) )
            // InternalLegoLang.g:4643:1: ( ( rule__UnString__InitialeValueAssignment_4_1 ) )
            {
            // InternalLegoLang.g:4643:1: ( ( rule__UnString__InitialeValueAssignment_4_1 ) )
            // InternalLegoLang.g:4644:2: ( rule__UnString__InitialeValueAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnStringAccess().getInitialeValueAssignment_4_1()); 
            }
            // InternalLegoLang.g:4645:2: ( rule__UnString__InitialeValueAssignment_4_1 )
            // InternalLegoLang.g:4645:3: rule__UnString__InitialeValueAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__UnString__InitialeValueAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnStringAccess().getInitialeValueAssignment_4_1()); 
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
    // $ANTLR end "rule__UnString__Group_4__1__Impl"


    // $ANTLR start "rule__TheDouble__Group__0"
    // InternalLegoLang.g:4654:1: rule__TheDouble__Group__0 : rule__TheDouble__Group__0__Impl rule__TheDouble__Group__1 ;
    public final void rule__TheDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4658:1: ( rule__TheDouble__Group__0__Impl rule__TheDouble__Group__1 )
            // InternalLegoLang.g:4659:2: rule__TheDouble__Group__0__Impl rule__TheDouble__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__TheDouble__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TheDouble__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TheDouble__Group__0"


    // $ANTLR start "rule__TheDouble__Group__0__Impl"
    // InternalLegoLang.g:4666:1: rule__TheDouble__Group__0__Impl : ( () ) ;
    public final void rule__TheDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4670:1: ( ( () ) )
            // InternalLegoLang.g:4671:1: ( () )
            {
            // InternalLegoLang.g:4671:1: ( () )
            // InternalLegoLang.g:4672:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheDoubleAccess().getTheDoubleAction_0()); 
            }
            // InternalLegoLang.g:4673:2: ()
            // InternalLegoLang.g:4673:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTheDoubleAccess().getTheDoubleAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TheDouble__Group__0__Impl"


    // $ANTLR start "rule__TheDouble__Group__1"
    // InternalLegoLang.g:4681:1: rule__TheDouble__Group__1 : rule__TheDouble__Group__1__Impl rule__TheDouble__Group__2 ;
    public final void rule__TheDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4685:1: ( rule__TheDouble__Group__1__Impl rule__TheDouble__Group__2 )
            // InternalLegoLang.g:4686:2: rule__TheDouble__Group__1__Impl rule__TheDouble__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__TheDouble__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TheDouble__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TheDouble__Group__1"


    // $ANTLR start "rule__TheDouble__Group__1__Impl"
    // InternalLegoLang.g:4693:1: rule__TheDouble__Group__1__Impl : ( ( rule__TheDouble__Value1Assignment_1 ) ) ;
    public final void rule__TheDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4697:1: ( ( ( rule__TheDouble__Value1Assignment_1 ) ) )
            // InternalLegoLang.g:4698:1: ( ( rule__TheDouble__Value1Assignment_1 ) )
            {
            // InternalLegoLang.g:4698:1: ( ( rule__TheDouble__Value1Assignment_1 ) )
            // InternalLegoLang.g:4699:2: ( rule__TheDouble__Value1Assignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheDoubleAccess().getValue1Assignment_1()); 
            }
            // InternalLegoLang.g:4700:2: ( rule__TheDouble__Value1Assignment_1 )
            // InternalLegoLang.g:4700:3: rule__TheDouble__Value1Assignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TheDouble__Value1Assignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTheDoubleAccess().getValue1Assignment_1()); 
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
    // $ANTLR end "rule__TheDouble__Group__1__Impl"


    // $ANTLR start "rule__TheDouble__Group__2"
    // InternalLegoLang.g:4708:1: rule__TheDouble__Group__2 : rule__TheDouble__Group__2__Impl ;
    public final void rule__TheDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4712:1: ( rule__TheDouble__Group__2__Impl )
            // InternalLegoLang.g:4713:2: rule__TheDouble__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TheDouble__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TheDouble__Group__2"


    // $ANTLR start "rule__TheDouble__Group__2__Impl"
    // InternalLegoLang.g:4719:1: rule__TheDouble__Group__2__Impl : ( ( rule__TheDouble__Group_2__0 )? ) ;
    public final void rule__TheDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4723:1: ( ( ( rule__TheDouble__Group_2__0 )? ) )
            // InternalLegoLang.g:4724:1: ( ( rule__TheDouble__Group_2__0 )? )
            {
            // InternalLegoLang.g:4724:1: ( ( rule__TheDouble__Group_2__0 )? )
            // InternalLegoLang.g:4725:2: ( rule__TheDouble__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheDoubleAccess().getGroup_2()); 
            }
            // InternalLegoLang.g:4726:2: ( rule__TheDouble__Group_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==40) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalLegoLang.g:4726:3: rule__TheDouble__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TheDouble__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTheDoubleAccess().getGroup_2()); 
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
    // $ANTLR end "rule__TheDouble__Group__2__Impl"


    // $ANTLR start "rule__TheDouble__Group_2__0"
    // InternalLegoLang.g:4735:1: rule__TheDouble__Group_2__0 : rule__TheDouble__Group_2__0__Impl rule__TheDouble__Group_2__1 ;
    public final void rule__TheDouble__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4739:1: ( rule__TheDouble__Group_2__0__Impl rule__TheDouble__Group_2__1 )
            // InternalLegoLang.g:4740:2: rule__TheDouble__Group_2__0__Impl rule__TheDouble__Group_2__1
            {
            pushFollow(FOLLOW_32);
            rule__TheDouble__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TheDouble__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TheDouble__Group_2__0"


    // $ANTLR start "rule__TheDouble__Group_2__0__Impl"
    // InternalLegoLang.g:4747:1: rule__TheDouble__Group_2__0__Impl : ( '.' ) ;
    public final void rule__TheDouble__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4751:1: ( ( '.' ) )
            // InternalLegoLang.g:4752:1: ( '.' )
            {
            // InternalLegoLang.g:4752:1: ( '.' )
            // InternalLegoLang.g:4753:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheDoubleAccess().getFullStopKeyword_2_0()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTheDoubleAccess().getFullStopKeyword_2_0()); 
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
    // $ANTLR end "rule__TheDouble__Group_2__0__Impl"


    // $ANTLR start "rule__TheDouble__Group_2__1"
    // InternalLegoLang.g:4762:1: rule__TheDouble__Group_2__1 : rule__TheDouble__Group_2__1__Impl ;
    public final void rule__TheDouble__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4766:1: ( rule__TheDouble__Group_2__1__Impl )
            // InternalLegoLang.g:4767:2: rule__TheDouble__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TheDouble__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TheDouble__Group_2__1"


    // $ANTLR start "rule__TheDouble__Group_2__1__Impl"
    // InternalLegoLang.g:4773:1: rule__TheDouble__Group_2__1__Impl : ( ( rule__TheDouble__Value2Assignment_2_1 ) ) ;
    public final void rule__TheDouble__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4777:1: ( ( ( rule__TheDouble__Value2Assignment_2_1 ) ) )
            // InternalLegoLang.g:4778:1: ( ( rule__TheDouble__Value2Assignment_2_1 ) )
            {
            // InternalLegoLang.g:4778:1: ( ( rule__TheDouble__Value2Assignment_2_1 ) )
            // InternalLegoLang.g:4779:2: ( rule__TheDouble__Value2Assignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheDoubleAccess().getValue2Assignment_2_1()); 
            }
            // InternalLegoLang.g:4780:2: ( rule__TheDouble__Value2Assignment_2_1 )
            // InternalLegoLang.g:4780:3: rule__TheDouble__Value2Assignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__TheDouble__Value2Assignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTheDoubleAccess().getValue2Assignment_2_1()); 
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
    // $ANTLR end "rule__TheDouble__Group_2__1__Impl"


    // $ANTLR start "rule__TheInt__Group__0"
    // InternalLegoLang.g:4789:1: rule__TheInt__Group__0 : rule__TheInt__Group__0__Impl rule__TheInt__Group__1 ;
    public final void rule__TheInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4793:1: ( rule__TheInt__Group__0__Impl rule__TheInt__Group__1 )
            // InternalLegoLang.g:4794:2: rule__TheInt__Group__0__Impl rule__TheInt__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__TheInt__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TheInt__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TheInt__Group__0"


    // $ANTLR start "rule__TheInt__Group__0__Impl"
    // InternalLegoLang.g:4801:1: rule__TheInt__Group__0__Impl : ( () ) ;
    public final void rule__TheInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4805:1: ( ( () ) )
            // InternalLegoLang.g:4806:1: ( () )
            {
            // InternalLegoLang.g:4806:1: ( () )
            // InternalLegoLang.g:4807:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheIntAccess().getTheIntAction_0()); 
            }
            // InternalLegoLang.g:4808:2: ()
            // InternalLegoLang.g:4808:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTheIntAccess().getTheIntAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TheInt__Group__0__Impl"


    // $ANTLR start "rule__TheInt__Group__1"
    // InternalLegoLang.g:4816:1: rule__TheInt__Group__1 : rule__TheInt__Group__1__Impl ;
    public final void rule__TheInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4820:1: ( rule__TheInt__Group__1__Impl )
            // InternalLegoLang.g:4821:2: rule__TheInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TheInt__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TheInt__Group__1"


    // $ANTLR start "rule__TheInt__Group__1__Impl"
    // InternalLegoLang.g:4827:1: rule__TheInt__Group__1__Impl : ( ( rule__TheInt__ValueAssignment_1 ) ) ;
    public final void rule__TheInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4831:1: ( ( ( rule__TheInt__ValueAssignment_1 ) ) )
            // InternalLegoLang.g:4832:1: ( ( rule__TheInt__ValueAssignment_1 ) )
            {
            // InternalLegoLang.g:4832:1: ( ( rule__TheInt__ValueAssignment_1 ) )
            // InternalLegoLang.g:4833:2: ( rule__TheInt__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheIntAccess().getValueAssignment_1()); 
            }
            // InternalLegoLang.g:4834:2: ( rule__TheInt__ValueAssignment_1 )
            // InternalLegoLang.g:4834:3: rule__TheInt__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TheInt__ValueAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTheIntAccess().getValueAssignment_1()); 
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
    // $ANTLR end "rule__TheInt__Group__1__Impl"


    // $ANTLR start "rule__TheBoolean__Group__0"
    // InternalLegoLang.g:4843:1: rule__TheBoolean__Group__0 : rule__TheBoolean__Group__0__Impl rule__TheBoolean__Group__1 ;
    public final void rule__TheBoolean__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4847:1: ( rule__TheBoolean__Group__0__Impl rule__TheBoolean__Group__1 )
            // InternalLegoLang.g:4848:2: rule__TheBoolean__Group__0__Impl rule__TheBoolean__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__TheBoolean__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TheBoolean__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TheBoolean__Group__0"


    // $ANTLR start "rule__TheBoolean__Group__0__Impl"
    // InternalLegoLang.g:4855:1: rule__TheBoolean__Group__0__Impl : ( () ) ;
    public final void rule__TheBoolean__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4859:1: ( ( () ) )
            // InternalLegoLang.g:4860:1: ( () )
            {
            // InternalLegoLang.g:4860:1: ( () )
            // InternalLegoLang.g:4861:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheBooleanAccess().getTheBooleanAction_0()); 
            }
            // InternalLegoLang.g:4862:2: ()
            // InternalLegoLang.g:4862:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTheBooleanAccess().getTheBooleanAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TheBoolean__Group__0__Impl"


    // $ANTLR start "rule__TheBoolean__Group__1"
    // InternalLegoLang.g:4870:1: rule__TheBoolean__Group__1 : rule__TheBoolean__Group__1__Impl ;
    public final void rule__TheBoolean__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4874:1: ( rule__TheBoolean__Group__1__Impl )
            // InternalLegoLang.g:4875:2: rule__TheBoolean__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TheBoolean__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TheBoolean__Group__1"


    // $ANTLR start "rule__TheBoolean__Group__1__Impl"
    // InternalLegoLang.g:4881:1: rule__TheBoolean__Group__1__Impl : ( ( rule__TheBoolean__ValueAssignment_1 ) ) ;
    public final void rule__TheBoolean__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4885:1: ( ( ( rule__TheBoolean__ValueAssignment_1 ) ) )
            // InternalLegoLang.g:4886:1: ( ( rule__TheBoolean__ValueAssignment_1 ) )
            {
            // InternalLegoLang.g:4886:1: ( ( rule__TheBoolean__ValueAssignment_1 ) )
            // InternalLegoLang.g:4887:2: ( rule__TheBoolean__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheBooleanAccess().getValueAssignment_1()); 
            }
            // InternalLegoLang.g:4888:2: ( rule__TheBoolean__ValueAssignment_1 )
            // InternalLegoLang.g:4888:3: rule__TheBoolean__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TheBoolean__ValueAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTheBooleanAccess().getValueAssignment_1()); 
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
    // $ANTLR end "rule__TheBoolean__Group__1__Impl"


    // $ANTLR start "rule__TheString__Group__0"
    // InternalLegoLang.g:4897:1: rule__TheString__Group__0 : rule__TheString__Group__0__Impl rule__TheString__Group__1 ;
    public final void rule__TheString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4901:1: ( rule__TheString__Group__0__Impl rule__TheString__Group__1 )
            // InternalLegoLang.g:4902:2: rule__TheString__Group__0__Impl rule__TheString__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__TheString__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TheString__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TheString__Group__0"


    // $ANTLR start "rule__TheString__Group__0__Impl"
    // InternalLegoLang.g:4909:1: rule__TheString__Group__0__Impl : ( () ) ;
    public final void rule__TheString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4913:1: ( ( () ) )
            // InternalLegoLang.g:4914:1: ( () )
            {
            // InternalLegoLang.g:4914:1: ( () )
            // InternalLegoLang.g:4915:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheStringAccess().getTheStringAction_0()); 
            }
            // InternalLegoLang.g:4916:2: ()
            // InternalLegoLang.g:4916:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTheStringAccess().getTheStringAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TheString__Group__0__Impl"


    // $ANTLR start "rule__TheString__Group__1"
    // InternalLegoLang.g:4924:1: rule__TheString__Group__1 : rule__TheString__Group__1__Impl ;
    public final void rule__TheString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4928:1: ( rule__TheString__Group__1__Impl )
            // InternalLegoLang.g:4929:2: rule__TheString__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TheString__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TheString__Group__1"


    // $ANTLR start "rule__TheString__Group__1__Impl"
    // InternalLegoLang.g:4935:1: rule__TheString__Group__1__Impl : ( ( rule__TheString__ValueAssignment_1 ) ) ;
    public final void rule__TheString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4939:1: ( ( ( rule__TheString__ValueAssignment_1 ) ) )
            // InternalLegoLang.g:4940:1: ( ( rule__TheString__ValueAssignment_1 ) )
            {
            // InternalLegoLang.g:4940:1: ( ( rule__TheString__ValueAssignment_1 ) )
            // InternalLegoLang.g:4941:2: ( rule__TheString__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheStringAccess().getValueAssignment_1()); 
            }
            // InternalLegoLang.g:4942:2: ( rule__TheString__ValueAssignment_1 )
            // InternalLegoLang.g:4942:3: rule__TheString__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TheString__ValueAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTheStringAccess().getValueAssignment_1()); 
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
    // $ANTLR end "rule__TheString__Group__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalLegoLang.g:4951:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4955:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalLegoLang.g:4956:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__EInt__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalLegoLang.g:4963:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4967:1: ( ( ( '-' )? ) )
            // InternalLegoLang.g:4968:1: ( ( '-' )? )
            {
            // InternalLegoLang.g:4968:1: ( ( '-' )? )
            // InternalLegoLang.g:4969:2: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            }
            // InternalLegoLang.g:4970:2: ( '-' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==23) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalLegoLang.g:4970:3: '-'
                    {
                    match(input,23,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
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
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalLegoLang.g:4978:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4982:1: ( rule__EInt__Group__1__Impl )
            // InternalLegoLang.g:4983:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalLegoLang.g:4989:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4993:1: ( ( RULE_INT ) )
            // InternalLegoLang.g:4994:1: ( RULE_INT )
            {
            // InternalLegoLang.g:4994:1: ( RULE_INT )
            // InternalLegoLang.g:4995:2: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
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
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__Program__NameAssignment_2"
    // InternalLegoLang.g:5005:1: rule__Program__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Program__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5009:1: ( ( ruleEString ) )
            // InternalLegoLang.g:5010:2: ( ruleEString )
            {
            // InternalLegoLang.g:5010:2: ( ruleEString )
            // InternalLegoLang.g:5011:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getNameEStringParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getNameEStringParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Program__NameAssignment_2"


    // $ANTLR start "rule__Program__StatementAssignment_4"
    // InternalLegoLang.g:5020:1: rule__Program__StatementAssignment_4 : ( ruleStatement ) ;
    public final void rule__Program__StatementAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5024:1: ( ( ruleStatement ) )
            // InternalLegoLang.g:5025:2: ( ruleStatement )
            {
            // InternalLegoLang.g:5025:2: ( ruleStatement )
            // InternalLegoLang.g:5026:3: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getStatementStatementParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getStatementStatementParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__Program__StatementAssignment_4"


    // $ANTLR start "rule__ConditionEtat__ConditionAssignment_1"
    // InternalLegoLang.g:5035:1: rule__ConditionEtat__ConditionAssignment_1 : ( ruleComparaison ) ;
    public final void rule__ConditionEtat__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5039:1: ( ( ruleComparaison ) )
            // InternalLegoLang.g:5040:2: ( ruleComparaison )
            {
            // InternalLegoLang.g:5040:2: ( ruleComparaison )
            // InternalLegoLang.g:5041:3: ruleComparaison
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionEtatAccess().getConditionComparaisonParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleComparaison();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionEtatAccess().getConditionComparaisonParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__ConditionEtat__ConditionAssignment_1"


    // $ANTLR start "rule__ConditionEtat__ThenAssignment_3"
    // InternalLegoLang.g:5050:1: rule__ConditionEtat__ThenAssignment_3 : ( ruleStatement ) ;
    public final void rule__ConditionEtat__ThenAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5054:1: ( ( ruleStatement ) )
            // InternalLegoLang.g:5055:2: ( ruleStatement )
            {
            // InternalLegoLang.g:5055:2: ( ruleStatement )
            // InternalLegoLang.g:5056:3: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionEtatAccess().getThenStatementParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionEtatAccess().getThenStatementParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__ConditionEtat__ThenAssignment_3"


    // $ANTLR start "rule__ConditionEtat__ElseAssignment_5_1"
    // InternalLegoLang.g:5065:1: rule__ConditionEtat__ElseAssignment_5_1 : ( ruleStatement ) ;
    public final void rule__ConditionEtat__ElseAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5069:1: ( ( ruleStatement ) )
            // InternalLegoLang.g:5070:2: ( ruleStatement )
            {
            // InternalLegoLang.g:5070:2: ( ruleStatement )
            // InternalLegoLang.g:5071:3: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionEtatAccess().getElseStatementParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionEtatAccess().getElseStatementParserRuleCall_5_1_0()); 
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
    // $ANTLR end "rule__ConditionEtat__ElseAssignment_5_1"


    // $ANTLR start "rule__WhileLoop__LoopConditionAssignment_1"
    // InternalLegoLang.g:5080:1: rule__WhileLoop__LoopConditionAssignment_1 : ( ruleComparaison ) ;
    public final void rule__WhileLoop__LoopConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5084:1: ( ( ruleComparaison ) )
            // InternalLegoLang.g:5085:2: ( ruleComparaison )
            {
            // InternalLegoLang.g:5085:2: ( ruleComparaison )
            // InternalLegoLang.g:5086:3: ruleComparaison
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileLoopAccess().getLoopConditionComparaisonParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleComparaison();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileLoopAccess().getLoopConditionComparaisonParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__WhileLoop__LoopConditionAssignment_1"


    // $ANTLR start "rule__WhileLoop__StatementAssignment_3"
    // InternalLegoLang.g:5095:1: rule__WhileLoop__StatementAssignment_3 : ( ruleStatement ) ;
    public final void rule__WhileLoop__StatementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5099:1: ( ( ruleStatement ) )
            // InternalLegoLang.g:5100:2: ( ruleStatement )
            {
            // InternalLegoLang.g:5100:2: ( ruleStatement )
            // InternalLegoLang.g:5101:3: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileLoopAccess().getStatementStatementParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileLoopAccess().getStatementStatementParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__WhileLoop__StatementAssignment_3"


    // $ANTLR start "rule__MethodePrint__ExpressionAssignment_2_0"
    // InternalLegoLang.g:5110:1: rule__MethodePrint__ExpressionAssignment_2_0 : ( ruleExpression ) ;
    public final void rule__MethodePrint__ExpressionAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5114:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:5115:2: ( ruleExpression )
            {
            // InternalLegoLang.g:5115:2: ( ruleExpression )
            // InternalLegoLang.g:5116:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodePrintAccess().getExpressionExpressionParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodePrintAccess().getExpressionExpressionParserRuleCall_2_0_0()); 
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
    // $ANTLR end "rule__MethodePrint__ExpressionAssignment_2_0"


    // $ANTLR start "rule__VariableRef__VariableAssignment"
    // InternalLegoLang.g:5125:1: rule__VariableRef__VariableAssignment : ( ( ruleEString ) ) ;
    public final void rule__VariableRef__VariableAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5129:1: ( ( ( ruleEString ) ) )
            // InternalLegoLang.g:5130:2: ( ( ruleEString ) )
            {
            // InternalLegoLang.g:5130:2: ( ( ruleEString ) )
            // InternalLegoLang.g:5131:3: ( ruleEString )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableRefAccess().getVariableVariableCrossReference_0()); 
            }
            // InternalLegoLang.g:5132:3: ( ruleEString )
            // InternalLegoLang.g:5133:4: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableRefAccess().getVariableVariableEStringParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableRefAccess().getVariableVariableEStringParserRuleCall_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableRefAccess().getVariableVariableCrossReference_0()); 
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
    // $ANTLR end "rule__VariableRef__VariableAssignment"


    // $ANTLR start "rule__Substraction__LeftAssignment_1"
    // InternalLegoLang.g:5144:1: rule__Substraction__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__Substraction__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5148:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:5149:2: ( ruleExpression )
            {
            // InternalLegoLang.g:5149:2: ( ruleExpression )
            // InternalLegoLang.g:5150:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstractionAccess().getLeftExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstractionAccess().getLeftExpressionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Substraction__LeftAssignment_1"


    // $ANTLR start "rule__Substraction__RightAssignment_3"
    // InternalLegoLang.g:5159:1: rule__Substraction__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__Substraction__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5163:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:5164:2: ( ruleExpression )
            {
            // InternalLegoLang.g:5164:2: ( ruleExpression )
            // InternalLegoLang.g:5165:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstractionAccess().getRightExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstractionAccess().getRightExpressionParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__Substraction__RightAssignment_3"


    // $ANTLR start "rule__Addition__LeftAssignment_1"
    // InternalLegoLang.g:5174:1: rule__Addition__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__Addition__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5178:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:5179:2: ( ruleExpression )
            {
            // InternalLegoLang.g:5179:2: ( ruleExpression )
            // InternalLegoLang.g:5180:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getLeftExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getLeftExpressionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Addition__LeftAssignment_1"


    // $ANTLR start "rule__Addition__RightAssignment_3"
    // InternalLegoLang.g:5189:1: rule__Addition__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__Addition__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5193:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:5194:2: ( ruleExpression )
            {
            // InternalLegoLang.g:5194:2: ( ruleExpression )
            // InternalLegoLang.g:5195:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getRightExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getRightExpressionParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__Addition__RightAssignment_3"


    // $ANTLR start "rule__Multiplication__LeftAssignment_1"
    // InternalLegoLang.g:5204:1: rule__Multiplication__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__Multiplication__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5208:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:5209:2: ( ruleExpression )
            {
            // InternalLegoLang.g:5209:2: ( ruleExpression )
            // InternalLegoLang.g:5210:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getLeftExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getLeftExpressionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Multiplication__LeftAssignment_1"


    // $ANTLR start "rule__Multiplication__RightAssignment_3"
    // InternalLegoLang.g:5219:1: rule__Multiplication__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__Multiplication__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5223:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:5224:2: ( ruleExpression )
            {
            // InternalLegoLang.g:5224:2: ( ruleExpression )
            // InternalLegoLang.g:5225:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getRightExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getRightExpressionParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__Multiplication__RightAssignment_3"


    // $ANTLR start "rule__Division__LeftAssignment_1"
    // InternalLegoLang.g:5234:1: rule__Division__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__Division__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5238:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:5239:2: ( ruleExpression )
            {
            // InternalLegoLang.g:5239:2: ( ruleExpression )
            // InternalLegoLang.g:5240:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivisionAccess().getLeftExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDivisionAccess().getLeftExpressionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Division__LeftAssignment_1"


    // $ANTLR start "rule__Division__RightAssignment_3"
    // InternalLegoLang.g:5249:1: rule__Division__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__Division__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5253:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:5254:2: ( ruleExpression )
            {
            // InternalLegoLang.g:5254:2: ( ruleExpression )
            // InternalLegoLang.g:5255:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivisionAccess().getRightExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDivisionAccess().getRightExpressionParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__Division__RightAssignment_3"


    // $ANTLR start "rule__GT__LeftAssignment_1"
    // InternalLegoLang.g:5264:1: rule__GT__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__GT__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5268:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:5269:2: ( ruleExpression )
            {
            // InternalLegoLang.g:5269:2: ( ruleExpression )
            // InternalLegoLang.g:5270:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTAccess().getLeftExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGTAccess().getLeftExpressionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__GT__LeftAssignment_1"


    // $ANTLR start "rule__GT__RightAssignment_3"
    // InternalLegoLang.g:5279:1: rule__GT__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__GT__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5283:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:5284:2: ( ruleExpression )
            {
            // InternalLegoLang.g:5284:2: ( ruleExpression )
            // InternalLegoLang.g:5285:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTAccess().getRightExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGTAccess().getRightExpressionParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__GT__RightAssignment_3"


    // $ANTLR start "rule__LT__LeftAssignment_1"
    // InternalLegoLang.g:5294:1: rule__LT__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__LT__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5298:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:5299:2: ( ruleExpression )
            {
            // InternalLegoLang.g:5299:2: ( ruleExpression )
            // InternalLegoLang.g:5300:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTAccess().getLeftExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLTAccess().getLeftExpressionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__LT__LeftAssignment_1"


    // $ANTLR start "rule__LT__RightAssignment_3"
    // InternalLegoLang.g:5309:1: rule__LT__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__LT__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5313:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:5314:2: ( ruleExpression )
            {
            // InternalLegoLang.g:5314:2: ( ruleExpression )
            // InternalLegoLang.g:5315:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTAccess().getRightExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLTAccess().getRightExpressionParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__LT__RightAssignment_3"


    // $ANTLR start "rule__Equal__LeftAssignment_1"
    // InternalLegoLang.g:5324:1: rule__Equal__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__Equal__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5328:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:5329:2: ( ruleExpression )
            {
            // InternalLegoLang.g:5329:2: ( ruleExpression )
            // InternalLegoLang.g:5330:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualAccess().getLeftExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualAccess().getLeftExpressionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Equal__LeftAssignment_1"


    // $ANTLR start "rule__Equal__RightAssignment_3"
    // InternalLegoLang.g:5339:1: rule__Equal__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__Equal__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5343:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:5344:2: ( ruleExpression )
            {
            // InternalLegoLang.g:5344:2: ( ruleExpression )
            // InternalLegoLang.g:5345:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualAccess().getRightExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualAccess().getRightExpressionParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__Equal__RightAssignment_3"


    // $ANTLR start "rule__Different__LeftAssignment_1"
    // InternalLegoLang.g:5354:1: rule__Different__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__Different__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5358:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:5359:2: ( ruleExpression )
            {
            // InternalLegoLang.g:5359:2: ( ruleExpression )
            // InternalLegoLang.g:5360:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDifferentAccess().getLeftExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDifferentAccess().getLeftExpressionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Different__LeftAssignment_1"


    // $ANTLR start "rule__Different__RightAssignment_3"
    // InternalLegoLang.g:5369:1: rule__Different__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__Different__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5373:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:5374:2: ( ruleExpression )
            {
            // InternalLegoLang.g:5374:2: ( ruleExpression )
            // InternalLegoLang.g:5375:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDifferentAccess().getRightExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDifferentAccess().getRightExpressionParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__Different__RightAssignment_3"


    // $ANTLR start "rule__LTorEqual__LeftAssignment_1"
    // InternalLegoLang.g:5384:1: rule__LTorEqual__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__LTorEqual__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5388:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:5389:2: ( ruleExpression )
            {
            // InternalLegoLang.g:5389:2: ( ruleExpression )
            // InternalLegoLang.g:5390:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTorEqualAccess().getLeftExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLTorEqualAccess().getLeftExpressionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__LTorEqual__LeftAssignment_1"


    // $ANTLR start "rule__LTorEqual__RightAssignment_3"
    // InternalLegoLang.g:5399:1: rule__LTorEqual__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__LTorEqual__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5403:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:5404:2: ( ruleExpression )
            {
            // InternalLegoLang.g:5404:2: ( ruleExpression )
            // InternalLegoLang.g:5405:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTorEqualAccess().getRightExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLTorEqualAccess().getRightExpressionParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__LTorEqual__RightAssignment_3"


    // $ANTLR start "rule__GTorEqual__LeftAssignment_1"
    // InternalLegoLang.g:5414:1: rule__GTorEqual__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__GTorEqual__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5418:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:5419:2: ( ruleExpression )
            {
            // InternalLegoLang.g:5419:2: ( ruleExpression )
            // InternalLegoLang.g:5420:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTorEqualAccess().getLeftExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGTorEqualAccess().getLeftExpressionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__GTorEqual__LeftAssignment_1"


    // $ANTLR start "rule__GTorEqual__RightAssignment_3"
    // InternalLegoLang.g:5429:1: rule__GTorEqual__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__GTorEqual__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5433:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:5434:2: ( ruleExpression )
            {
            // InternalLegoLang.g:5434:2: ( ruleExpression )
            // InternalLegoLang.g:5435:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTorEqualAccess().getRightExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGTorEqualAccess().getRightExpressionParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__GTorEqual__RightAssignment_3"


    // $ANTLR start "rule__Assignement__LeftAssignment_2"
    // InternalLegoLang.g:5444:1: rule__Assignement__LeftAssignment_2 : ( ruleExpression ) ;
    public final void rule__Assignement__LeftAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5448:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:5449:2: ( ruleExpression )
            {
            // InternalLegoLang.g:5449:2: ( ruleExpression )
            // InternalLegoLang.g:5450:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignementAccess().getLeftExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignementAccess().getLeftExpressionParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Assignement__LeftAssignment_2"


    // $ANTLR start "rule__Assignement__RightAssignment_4"
    // InternalLegoLang.g:5459:1: rule__Assignement__RightAssignment_4 : ( ruleExpression ) ;
    public final void rule__Assignement__RightAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5463:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:5464:2: ( ruleExpression )
            {
            // InternalLegoLang.g:5464:2: ( ruleExpression )
            // InternalLegoLang.g:5465:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignementAccess().getRightExpressionParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignementAccess().getRightExpressionParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__Assignement__RightAssignment_4"


    // $ANTLR start "rule__PlusEqual__LeftAssignment_2"
    // InternalLegoLang.g:5474:1: rule__PlusEqual__LeftAssignment_2 : ( ruleExpression ) ;
    public final void rule__PlusEqual__LeftAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5478:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:5479:2: ( ruleExpression )
            {
            // InternalLegoLang.g:5479:2: ( ruleExpression )
            // InternalLegoLang.g:5480:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusEqualAccess().getLeftExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusEqualAccess().getLeftExpressionParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__PlusEqual__LeftAssignment_2"


    // $ANTLR start "rule__PlusEqual__RightAssignment_4"
    // InternalLegoLang.g:5489:1: rule__PlusEqual__RightAssignment_4 : ( ruleExpression ) ;
    public final void rule__PlusEqual__RightAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5493:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:5494:2: ( ruleExpression )
            {
            // InternalLegoLang.g:5494:2: ( ruleExpression )
            // InternalLegoLang.g:5495:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusEqualAccess().getRightExpressionParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusEqualAccess().getRightExpressionParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__PlusEqual__RightAssignment_4"


    // $ANTLR start "rule__MinusEqual__LeftAssignment_2"
    // InternalLegoLang.g:5504:1: rule__MinusEqual__LeftAssignment_2 : ( ruleExpression ) ;
    public final void rule__MinusEqual__LeftAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5508:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:5509:2: ( ruleExpression )
            {
            // InternalLegoLang.g:5509:2: ( ruleExpression )
            // InternalLegoLang.g:5510:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinusEqualAccess().getLeftExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMinusEqualAccess().getLeftExpressionParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__MinusEqual__LeftAssignment_2"


    // $ANTLR start "rule__MinusEqual__RightAssignment_4"
    // InternalLegoLang.g:5519:1: rule__MinusEqual__RightAssignment_4 : ( ruleExpression ) ;
    public final void rule__MinusEqual__RightAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5523:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:5524:2: ( ruleExpression )
            {
            // InternalLegoLang.g:5524:2: ( ruleExpression )
            // InternalLegoLang.g:5525:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinusEqualAccess().getRightExpressionParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMinusEqualAccess().getRightExpressionParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__MinusEqual__RightAssignment_4"


    // $ANTLR start "rule__UnInteger__IsConstAssignment_1"
    // InternalLegoLang.g:5534:1: rule__UnInteger__IsConstAssignment_1 : ( ( 'const' ) ) ;
    public final void rule__UnInteger__IsConstAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5538:1: ( ( ( 'const' ) ) )
            // InternalLegoLang.g:5539:2: ( ( 'const' ) )
            {
            // InternalLegoLang.g:5539:2: ( ( 'const' ) )
            // InternalLegoLang.g:5540:3: ( 'const' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnIntegerAccess().getIsConstConstKeyword_1_0()); 
            }
            // InternalLegoLang.g:5541:3: ( 'const' )
            // InternalLegoLang.g:5542:4: 'const'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnIntegerAccess().getIsConstConstKeyword_1_0()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnIntegerAccess().getIsConstConstKeyword_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnIntegerAccess().getIsConstConstKeyword_1_0()); 
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
    // $ANTLR end "rule__UnInteger__IsConstAssignment_1"


    // $ANTLR start "rule__UnInteger__NameAssignment_3"
    // InternalLegoLang.g:5553:1: rule__UnInteger__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__UnInteger__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5557:1: ( ( ruleEString ) )
            // InternalLegoLang.g:5558:2: ( ruleEString )
            {
            // InternalLegoLang.g:5558:2: ( ruleEString )
            // InternalLegoLang.g:5559:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnIntegerAccess().getNameEStringParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnIntegerAccess().getNameEStringParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__UnInteger__NameAssignment_3"


    // $ANTLR start "rule__UnInteger__InitialeValueAssignment_4_1"
    // InternalLegoLang.g:5568:1: rule__UnInteger__InitialeValueAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__UnInteger__InitialeValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5572:1: ( ( ruleEInt ) )
            // InternalLegoLang.g:5573:2: ( ruleEInt )
            {
            // InternalLegoLang.g:5573:2: ( ruleEInt )
            // InternalLegoLang.g:5574:3: ruleEInt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnIntegerAccess().getInitialeValueEIntParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnIntegerAccess().getInitialeValueEIntParserRuleCall_4_1_0()); 
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
    // $ANTLR end "rule__UnInteger__InitialeValueAssignment_4_1"


    // $ANTLR start "rule__UnDouble__IsConstAssignment_1"
    // InternalLegoLang.g:5583:1: rule__UnDouble__IsConstAssignment_1 : ( ( 'const' ) ) ;
    public final void rule__UnDouble__IsConstAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5587:1: ( ( ( 'const' ) ) )
            // InternalLegoLang.g:5588:2: ( ( 'const' ) )
            {
            // InternalLegoLang.g:5588:2: ( ( 'const' ) )
            // InternalLegoLang.g:5589:3: ( 'const' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnDoubleAccess().getIsConstConstKeyword_1_0()); 
            }
            // InternalLegoLang.g:5590:3: ( 'const' )
            // InternalLegoLang.g:5591:4: 'const'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnDoubleAccess().getIsConstConstKeyword_1_0()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnDoubleAccess().getIsConstConstKeyword_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnDoubleAccess().getIsConstConstKeyword_1_0()); 
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
    // $ANTLR end "rule__UnDouble__IsConstAssignment_1"


    // $ANTLR start "rule__UnDouble__NameAssignment_3"
    // InternalLegoLang.g:5602:1: rule__UnDouble__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__UnDouble__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5606:1: ( ( ruleEString ) )
            // InternalLegoLang.g:5607:2: ( ruleEString )
            {
            // InternalLegoLang.g:5607:2: ( ruleEString )
            // InternalLegoLang.g:5608:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnDoubleAccess().getNameEStringParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnDoubleAccess().getNameEStringParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__UnDouble__NameAssignment_3"


    // $ANTLR start "rule__UnDouble__InitialeValue1Assignment_4_1"
    // InternalLegoLang.g:5617:1: rule__UnDouble__InitialeValue1Assignment_4_1 : ( ruleEInt ) ;
    public final void rule__UnDouble__InitialeValue1Assignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5621:1: ( ( ruleEInt ) )
            // InternalLegoLang.g:5622:2: ( ruleEInt )
            {
            // InternalLegoLang.g:5622:2: ( ruleEInt )
            // InternalLegoLang.g:5623:3: ruleEInt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnDoubleAccess().getInitialeValue1EIntParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnDoubleAccess().getInitialeValue1EIntParserRuleCall_4_1_0()); 
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
    // $ANTLR end "rule__UnDouble__InitialeValue1Assignment_4_1"


    // $ANTLR start "rule__UnDouble__InitialeValue2Assignment_4_2_1"
    // InternalLegoLang.g:5632:1: rule__UnDouble__InitialeValue2Assignment_4_2_1 : ( ruleEInt ) ;
    public final void rule__UnDouble__InitialeValue2Assignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5636:1: ( ( ruleEInt ) )
            // InternalLegoLang.g:5637:2: ( ruleEInt )
            {
            // InternalLegoLang.g:5637:2: ( ruleEInt )
            // InternalLegoLang.g:5638:3: ruleEInt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnDoubleAccess().getInitialeValue2EIntParserRuleCall_4_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnDoubleAccess().getInitialeValue2EIntParserRuleCall_4_2_1_0()); 
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
    // $ANTLR end "rule__UnDouble__InitialeValue2Assignment_4_2_1"


    // $ANTLR start "rule__UnBoolean__IsConstAssignment_1"
    // InternalLegoLang.g:5647:1: rule__UnBoolean__IsConstAssignment_1 : ( ( 'const' ) ) ;
    public final void rule__UnBoolean__IsConstAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5651:1: ( ( ( 'const' ) ) )
            // InternalLegoLang.g:5652:2: ( ( 'const' ) )
            {
            // InternalLegoLang.g:5652:2: ( ( 'const' ) )
            // InternalLegoLang.g:5653:3: ( 'const' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnBooleanAccess().getIsConstConstKeyword_1_0()); 
            }
            // InternalLegoLang.g:5654:3: ( 'const' )
            // InternalLegoLang.g:5655:4: 'const'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnBooleanAccess().getIsConstConstKeyword_1_0()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnBooleanAccess().getIsConstConstKeyword_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnBooleanAccess().getIsConstConstKeyword_1_0()); 
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
    // $ANTLR end "rule__UnBoolean__IsConstAssignment_1"


    // $ANTLR start "rule__UnBoolean__NameAssignment_3"
    // InternalLegoLang.g:5666:1: rule__UnBoolean__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__UnBoolean__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5670:1: ( ( ruleEString ) )
            // InternalLegoLang.g:5671:2: ( ruleEString )
            {
            // InternalLegoLang.g:5671:2: ( ruleEString )
            // InternalLegoLang.g:5672:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnBooleanAccess().getNameEStringParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnBooleanAccess().getNameEStringParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__UnBoolean__NameAssignment_3"


    // $ANTLR start "rule__UnBoolean__InitialeValueAssignment_4_1"
    // InternalLegoLang.g:5681:1: rule__UnBoolean__InitialeValueAssignment_4_1 : ( ruleEBoolean ) ;
    public final void rule__UnBoolean__InitialeValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5685:1: ( ( ruleEBoolean ) )
            // InternalLegoLang.g:5686:2: ( ruleEBoolean )
            {
            // InternalLegoLang.g:5686:2: ( ruleEBoolean )
            // InternalLegoLang.g:5687:3: ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnBooleanAccess().getInitialeValueEBooleanParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnBooleanAccess().getInitialeValueEBooleanParserRuleCall_4_1_0()); 
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
    // $ANTLR end "rule__UnBoolean__InitialeValueAssignment_4_1"


    // $ANTLR start "rule__UnString__IsConstAssignment_1"
    // InternalLegoLang.g:5696:1: rule__UnString__IsConstAssignment_1 : ( ( 'const' ) ) ;
    public final void rule__UnString__IsConstAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5700:1: ( ( ( 'const' ) ) )
            // InternalLegoLang.g:5701:2: ( ( 'const' ) )
            {
            // InternalLegoLang.g:5701:2: ( ( 'const' ) )
            // InternalLegoLang.g:5702:3: ( 'const' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnStringAccess().getIsConstConstKeyword_1_0()); 
            }
            // InternalLegoLang.g:5703:3: ( 'const' )
            // InternalLegoLang.g:5704:4: 'const'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnStringAccess().getIsConstConstKeyword_1_0()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnStringAccess().getIsConstConstKeyword_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnStringAccess().getIsConstConstKeyword_1_0()); 
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
    // $ANTLR end "rule__UnString__IsConstAssignment_1"


    // $ANTLR start "rule__UnString__NameAssignment_3"
    // InternalLegoLang.g:5715:1: rule__UnString__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__UnString__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5719:1: ( ( ruleEString ) )
            // InternalLegoLang.g:5720:2: ( ruleEString )
            {
            // InternalLegoLang.g:5720:2: ( ruleEString )
            // InternalLegoLang.g:5721:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnStringAccess().getNameEStringParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnStringAccess().getNameEStringParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__UnString__NameAssignment_3"


    // $ANTLR start "rule__UnString__InitialeValueAssignment_4_1"
    // InternalLegoLang.g:5730:1: rule__UnString__InitialeValueAssignment_4_1 : ( ruleEString ) ;
    public final void rule__UnString__InitialeValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5734:1: ( ( ruleEString ) )
            // InternalLegoLang.g:5735:2: ( ruleEString )
            {
            // InternalLegoLang.g:5735:2: ( ruleEString )
            // InternalLegoLang.g:5736:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnStringAccess().getInitialeValueEStringParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnStringAccess().getInitialeValueEStringParserRuleCall_4_1_0()); 
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
    // $ANTLR end "rule__UnString__InitialeValueAssignment_4_1"


    // $ANTLR start "rule__TheDouble__Value1Assignment_1"
    // InternalLegoLang.g:5745:1: rule__TheDouble__Value1Assignment_1 : ( ruleEInt ) ;
    public final void rule__TheDouble__Value1Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5749:1: ( ( ruleEInt ) )
            // InternalLegoLang.g:5750:2: ( ruleEInt )
            {
            // InternalLegoLang.g:5750:2: ( ruleEInt )
            // InternalLegoLang.g:5751:3: ruleEInt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheDoubleAccess().getValue1EIntParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTheDoubleAccess().getValue1EIntParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__TheDouble__Value1Assignment_1"


    // $ANTLR start "rule__TheDouble__Value2Assignment_2_1"
    // InternalLegoLang.g:5760:1: rule__TheDouble__Value2Assignment_2_1 : ( ruleEInt ) ;
    public final void rule__TheDouble__Value2Assignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5764:1: ( ( ruleEInt ) )
            // InternalLegoLang.g:5765:2: ( ruleEInt )
            {
            // InternalLegoLang.g:5765:2: ( ruleEInt )
            // InternalLegoLang.g:5766:3: ruleEInt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheDoubleAccess().getValue2EIntParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTheDoubleAccess().getValue2EIntParserRuleCall_2_1_0()); 
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
    // $ANTLR end "rule__TheDouble__Value2Assignment_2_1"


    // $ANTLR start "rule__TheInt__ValueAssignment_1"
    // InternalLegoLang.g:5775:1: rule__TheInt__ValueAssignment_1 : ( ruleEInt ) ;
    public final void rule__TheInt__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5779:1: ( ( ruleEInt ) )
            // InternalLegoLang.g:5780:2: ( ruleEInt )
            {
            // InternalLegoLang.g:5780:2: ( ruleEInt )
            // InternalLegoLang.g:5781:3: ruleEInt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheIntAccess().getValueEIntParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTheIntAccess().getValueEIntParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__TheInt__ValueAssignment_1"


    // $ANTLR start "rule__TheBoolean__ValueAssignment_1"
    // InternalLegoLang.g:5790:1: rule__TheBoolean__ValueAssignment_1 : ( ruleEBoolean ) ;
    public final void rule__TheBoolean__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5794:1: ( ( ruleEBoolean ) )
            // InternalLegoLang.g:5795:2: ( ruleEBoolean )
            {
            // InternalLegoLang.g:5795:2: ( ruleEBoolean )
            // InternalLegoLang.g:5796:3: ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheBooleanAccess().getValueEBooleanParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTheBooleanAccess().getValueEBooleanParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__TheBoolean__ValueAssignment_1"


    // $ANTLR start "rule__TheString__ValueAssignment_1"
    // InternalLegoLang.g:5805:1: rule__TheString__ValueAssignment_1 : ( ruleEString ) ;
    public final void rule__TheString__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5809:1: ( ( ruleEString ) )
            // InternalLegoLang.g:5810:2: ( ruleEString )
            {
            // InternalLegoLang.g:5810:2: ( ruleEString )
            // InternalLegoLang.g:5811:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheStringAccess().getValueEStringParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTheStringAccess().getValueEStringParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__TheString__ValueAssignment_1"

    // $ANTLR start synpred5_InternalLegoLang
    public final void synpred5_InternalLegoLang_fragment() throws RecognitionException {   
        // InternalLegoLang.g:947:2: ( ( ruleVariableRef ) )
        // InternalLegoLang.g:947:2: ( ruleVariableRef )
        {
        // InternalLegoLang.g:947:2: ( ruleVariableRef )
        // InternalLegoLang.g:948:3: ruleVariableRef
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getExpressionAccess().getVariableRefParserRuleCall_0()); 
        }
        pushFollow(FOLLOW_2);
        ruleVariableRef();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalLegoLang

    // $ANTLR start synpred7_InternalLegoLang
    public final void synpred7_InternalLegoLang_fragment() throws RecognitionException {   
        // InternalLegoLang.g:959:2: ( ( ruleTheString ) )
        // InternalLegoLang.g:959:2: ( ruleTheString )
        {
        // InternalLegoLang.g:959:2: ( ruleTheString )
        // InternalLegoLang.g:960:3: ruleTheString
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getExpressionAccess().getTheStringParserRuleCall_2()); 
        }
        pushFollow(FOLLOW_2);
        ruleTheString();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred7_InternalLegoLang

    // $ANTLR start synpred8_InternalLegoLang
    public final void synpred8_InternalLegoLang_fragment() throws RecognitionException {   
        // InternalLegoLang.g:965:2: ( ( ruleTheDouble ) )
        // InternalLegoLang.g:965:2: ( ruleTheDouble )
        {
        // InternalLegoLang.g:965:2: ( ruleTheDouble )
        // InternalLegoLang.g:966:3: ruleTheDouble
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getExpressionAccess().getTheDoubleParserRuleCall_3()); 
        }
        pushFollow(FOLLOW_2);
        ruleTheDouble();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred8_InternalLegoLang

    // $ANTLR start synpred9_InternalLegoLang
    public final void synpred9_InternalLegoLang_fragment() throws RecognitionException {   
        // InternalLegoLang.g:971:2: ( ( ruleTheInt ) )
        // InternalLegoLang.g:971:2: ( ruleTheInt )
        {
        // InternalLegoLang.g:971:2: ( ruleTheInt )
        // InternalLegoLang.g:972:3: ruleTheInt
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getExpressionAccess().getTheIntParserRuleCall_4()); 
        }
        pushFollow(FOLLOW_2);
        ruleTheInt();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred9_InternalLegoLang

    // $ANTLR start synpred10_InternalLegoLang
    public final void synpred10_InternalLegoLang_fragment() throws RecognitionException {   
        // InternalLegoLang.g:992:2: ( ( ruleSubstraction ) )
        // InternalLegoLang.g:992:2: ( ruleSubstraction )
        {
        // InternalLegoLang.g:992:2: ( ruleSubstraction )
        // InternalLegoLang.g:993:3: ruleSubstraction
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getBinaryOperationAccess().getSubstractionParserRuleCall_0()); 
        }
        pushFollow(FOLLOW_2);
        ruleSubstraction();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred10_InternalLegoLang

    // $ANTLR start synpred11_InternalLegoLang
    public final void synpred11_InternalLegoLang_fragment() throws RecognitionException {   
        // InternalLegoLang.g:998:2: ( ( ruleComparaison ) )
        // InternalLegoLang.g:998:2: ( ruleComparaison )
        {
        // InternalLegoLang.g:998:2: ( ruleComparaison )
        // InternalLegoLang.g:999:3: ruleComparaison
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getBinaryOperationAccess().getComparaisonParserRuleCall_1()); 
        }
        pushFollow(FOLLOW_2);
        ruleComparaison();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalLegoLang

    // $ANTLR start synpred12_InternalLegoLang
    public final void synpred12_InternalLegoLang_fragment() throws RecognitionException {   
        // InternalLegoLang.g:1004:2: ( ( ruleAssignement ) )
        // InternalLegoLang.g:1004:2: ( ruleAssignement )
        {
        // InternalLegoLang.g:1004:2: ( ruleAssignement )
        // InternalLegoLang.g:1005:3: ruleAssignement
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getBinaryOperationAccess().getAssignementParserRuleCall_2()); 
        }
        pushFollow(FOLLOW_2);
        ruleAssignement();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred12_InternalLegoLang

    // $ANTLR start synpred13_InternalLegoLang
    public final void synpred13_InternalLegoLang_fragment() throws RecognitionException {   
        // InternalLegoLang.g:1010:2: ( ( ruleDivision ) )
        // InternalLegoLang.g:1010:2: ( ruleDivision )
        {
        // InternalLegoLang.g:1010:2: ( ruleDivision )
        // InternalLegoLang.g:1011:3: ruleDivision
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getBinaryOperationAccess().getDivisionParserRuleCall_3()); 
        }
        pushFollow(FOLLOW_2);
        ruleDivision();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalLegoLang

    // $ANTLR start synpred14_InternalLegoLang
    public final void synpred14_InternalLegoLang_fragment() throws RecognitionException {   
        // InternalLegoLang.g:1016:2: ( ( ruleMultiplication ) )
        // InternalLegoLang.g:1016:2: ( ruleMultiplication )
        {
        // InternalLegoLang.g:1016:2: ( ruleMultiplication )
        // InternalLegoLang.g:1017:3: ruleMultiplication
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getBinaryOperationAccess().getMultiplicationParserRuleCall_4()); 
        }
        pushFollow(FOLLOW_2);
        ruleMultiplication();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred14_InternalLegoLang

    // $ANTLR start synpred15_InternalLegoLang
    public final void synpred15_InternalLegoLang_fragment() throws RecognitionException {   
        // InternalLegoLang.g:1022:2: ( ( ruleAddition ) )
        // InternalLegoLang.g:1022:2: ( ruleAddition )
        {
        // InternalLegoLang.g:1022:2: ( ruleAddition )
        // InternalLegoLang.g:1023:3: ruleAddition
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getBinaryOperationAccess().getAdditionParserRuleCall_5()); 
        }
        pushFollow(FOLLOW_2);
        ruleAddition();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalLegoLang

    // $ANTLR start synpred16_InternalLegoLang
    public final void synpred16_InternalLegoLang_fragment() throws RecognitionException {   
        // InternalLegoLang.g:1028:2: ( ( ruleMinusEqual ) )
        // InternalLegoLang.g:1028:2: ( ruleMinusEqual )
        {
        // InternalLegoLang.g:1028:2: ( ruleMinusEqual )
        // InternalLegoLang.g:1029:3: ruleMinusEqual
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getBinaryOperationAccess().getMinusEqualParserRuleCall_6()); 
        }
        pushFollow(FOLLOW_2);
        ruleMinusEqual();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred16_InternalLegoLang

    // $ANTLR start synpred20_InternalLegoLang
    public final void synpred20_InternalLegoLang_fragment() throws RecognitionException {   
        // InternalLegoLang.g:1082:2: ( ( ruleGT ) )
        // InternalLegoLang.g:1082:2: ( ruleGT )
        {
        // InternalLegoLang.g:1082:2: ( ruleGT )
        // InternalLegoLang.g:1083:3: ruleGT
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getComparaisonAccess().getGTParserRuleCall_0()); 
        }
        pushFollow(FOLLOW_2);
        ruleGT();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred20_InternalLegoLang

    // $ANTLR start synpred21_InternalLegoLang
    public final void synpred21_InternalLegoLang_fragment() throws RecognitionException {   
        // InternalLegoLang.g:1088:2: ( ( ruleEqual ) )
        // InternalLegoLang.g:1088:2: ( ruleEqual )
        {
        // InternalLegoLang.g:1088:2: ( ruleEqual )
        // InternalLegoLang.g:1089:3: ruleEqual
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getComparaisonAccess().getEqualParserRuleCall_1()); 
        }
        pushFollow(FOLLOW_2);
        ruleEqual();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred21_InternalLegoLang

    // $ANTLR start synpred22_InternalLegoLang
    public final void synpred22_InternalLegoLang_fragment() throws RecognitionException {   
        // InternalLegoLang.g:1094:2: ( ( ruleLT ) )
        // InternalLegoLang.g:1094:2: ( ruleLT )
        {
        // InternalLegoLang.g:1094:2: ( ruleLT )
        // InternalLegoLang.g:1095:3: ruleLT
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getComparaisonAccess().getLTParserRuleCall_2()); 
        }
        pushFollow(FOLLOW_2);
        ruleLT();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred22_InternalLegoLang

    // $ANTLR start synpred23_InternalLegoLang
    public final void synpred23_InternalLegoLang_fragment() throws RecognitionException {   
        // InternalLegoLang.g:1100:2: ( ( ruleDifferent ) )
        // InternalLegoLang.g:1100:2: ( ruleDifferent )
        {
        // InternalLegoLang.g:1100:2: ( ruleDifferent )
        // InternalLegoLang.g:1101:3: ruleDifferent
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getComparaisonAccess().getDifferentParserRuleCall_3()); 
        }
        pushFollow(FOLLOW_2);
        ruleDifferent();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred23_InternalLegoLang

    // $ANTLR start synpred24_InternalLegoLang
    public final void synpred24_InternalLegoLang_fragment() throws RecognitionException {   
        // InternalLegoLang.g:1106:2: ( ( ruleGTorEqual ) )
        // InternalLegoLang.g:1106:2: ( ruleGTorEqual )
        {
        // InternalLegoLang.g:1106:2: ( ruleGTorEqual )
        // InternalLegoLang.g:1107:3: ruleGTorEqual
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getComparaisonAccess().getGTorEqualParserRuleCall_4()); 
        }
        pushFollow(FOLLOW_2);
        ruleGTorEqual();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred24_InternalLegoLang

    // Delegated rules

    public final boolean synpred21_InternalLegoLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalLegoLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalLegoLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalLegoLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalLegoLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalLegoLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_InternalLegoLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalLegoLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalLegoLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalLegoLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalLegoLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalLegoLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalLegoLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalLegoLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalLegoLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalLegoLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalLegoLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalLegoLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalLegoLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalLegoLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalLegoLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalLegoLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_InternalLegoLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalLegoLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalLegoLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalLegoLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalLegoLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalLegoLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalLegoLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalLegoLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalLegoLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalLegoLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA3 dfa3 = new DFA3(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\4\2\0\1\uffff\1\6\1\0\5\uffff";
    static final String dfa_3s = "\1\27\2\0\1\uffff\1\6\1\0\5\uffff";
    static final String dfa_4s = "\3\uffff\1\2\2\uffff\1\6\1\1\1\3\1\4\1\5";
    static final String dfa_5s = "\1\uffff\1\2\1\0\2\uffff\1\1\5\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\2\1\5\4\uffff\2\6\11\uffff\1\3\1\4",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\5",
            "\1\uffff",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "942:1: rule__Expression__Alternatives : ( ( ruleVariableRef ) | ( ruleBinaryOperation ) | ( ruleTheString ) | ( ruleTheDouble ) | ( ruleTheInt ) | ( ruleTheBoolean ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA2_2 = input.LA(1);

                         
                        int index2_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalLegoLang()) ) {s = 7;}

                        else if ( (synpred7_InternalLegoLang()) ) {s = 8;}

                         
                        input.seek(index2_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA2_5 = input.LA(1);

                         
                        int index2_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalLegoLang()) ) {s = 9;}

                        else if ( (synpred9_InternalLegoLang()) ) {s = 10;}

                         
                        input.seek(index2_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA2_1 = input.LA(1);

                         
                        int index2_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalLegoLang()) ) {s = 7;}

                        else if ( (synpred7_InternalLegoLang()) ) {s = 8;}

                         
                        input.seek(index2_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 2, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_7s = "\12\uffff";
    static final String dfa_8s = "\1\26\1\0\10\uffff";
    static final String dfa_9s = "\2\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String dfa_10s = "\1\uffff\1\0\10\uffff}>";
    static final String[] dfa_11s = {
            "\1\1",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[][] dfa_11 = unpackEncodedStringArray(dfa_11s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_8;
            this.accept = dfa_9;
            this.special = dfa_10;
            this.transition = dfa_11;
        }
        public String getDescription() {
            return "987:1: rule__BinaryOperation__Alternatives : ( ( ruleSubstraction ) | ( ruleComparaison ) | ( ruleAssignement ) | ( ruleDivision ) | ( ruleMultiplication ) | ( ruleAddition ) | ( ruleMinusEqual ) | ( rulePlusEqual ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA3_1 = input.LA(1);

                         
                        int index3_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_InternalLegoLang()) ) {s = 2;}

                        else if ( (synpred11_InternalLegoLang()) ) {s = 3;}

                        else if ( (synpred12_InternalLegoLang()) ) {s = 4;}

                        else if ( (synpred13_InternalLegoLang()) ) {s = 5;}

                        else if ( (synpred14_InternalLegoLang()) ) {s = 6;}

                        else if ( (synpred15_InternalLegoLang()) ) {s = 7;}

                        else if ( (synpred16_InternalLegoLang()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index3_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 3, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000EA000CD9870L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000EA000CD1872L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000EA000CD1870L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000C01870L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000C01872L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000082000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000004400000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000800040L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00000EA000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00000A0000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00000C0000000000L});

}