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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'Program'", "'{'", "'}'", "'WheelEngine'", "'ColorSensor'", "'LaserSensor'", "'GPSSensor'", "'GyroSensor'", "'UltraSonicSensor'", "'Car'", "'set'", "'vitesse'", "'('", "')'", "'='", "'get'", "'color'", "'intensity'", "'range'", "'x'", "'y'", "'angle'", "'distance'", "'and'", "'or'", "'if'", "'else{'", "'while'", "'print('", "');'", "','", "'-'", "'+'", "'*'", "'/'", "'>'", "'<'", "'=='", "'!='", "'<='", "'>='", "'+='", "'-='", "'int'", "';'", "'double'", "'.'", "'bool'", "'string'", "'const'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
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
    public static final int T__62=62;
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


    // $ANTLR start "entryRuleEngine"
    // InternalLegoLang.g:204:1: entryRuleEngine : ruleEngine EOF ;
    public final void entryRuleEngine() throws RecognitionException {
        try {
            // InternalLegoLang.g:205:1: ( ruleEngine EOF )
            // InternalLegoLang.g:206:1: ruleEngine EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEngineRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEngine();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEngineRule()); 
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
    // $ANTLR end "entryRuleEngine"


    // $ANTLR start "ruleEngine"
    // InternalLegoLang.g:213:1: ruleEngine : ( ruleWheelEngine ) ;
    public final void ruleEngine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:217:2: ( ( ruleWheelEngine ) )
            // InternalLegoLang.g:218:2: ( ruleWheelEngine )
            {
            // InternalLegoLang.g:218:2: ( ruleWheelEngine )
            // InternalLegoLang.g:219:3: ruleWheelEngine
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEngineAccess().getWheelEngineParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleWheelEngine();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEngineAccess().getWheelEngineParserRuleCall()); 
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
    // $ANTLR end "ruleEngine"


    // $ANTLR start "entryRuleSensor"
    // InternalLegoLang.g:229:1: entryRuleSensor : ruleSensor EOF ;
    public final void entryRuleSensor() throws RecognitionException {
        try {
            // InternalLegoLang.g:230:1: ( ruleSensor EOF )
            // InternalLegoLang.g:231:1: ruleSensor EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSensorRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSensor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSensorRule()); 
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
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // InternalLegoLang.g:238:1: ruleSensor : ( ( rule__Sensor__Alternatives ) ) ;
    public final void ruleSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:242:2: ( ( ( rule__Sensor__Alternatives ) ) )
            // InternalLegoLang.g:243:2: ( ( rule__Sensor__Alternatives ) )
            {
            // InternalLegoLang.g:243:2: ( ( rule__Sensor__Alternatives ) )
            // InternalLegoLang.g:244:3: ( rule__Sensor__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSensorAccess().getAlternatives()); 
            }
            // InternalLegoLang.g:245:3: ( rule__Sensor__Alternatives )
            // InternalLegoLang.g:245:4: rule__Sensor__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSensorAccess().getAlternatives()); 
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
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleWheelEngine"
    // InternalLegoLang.g:254:1: entryRuleWheelEngine : ruleWheelEngine EOF ;
    public final void entryRuleWheelEngine() throws RecognitionException {
        try {
            // InternalLegoLang.g:255:1: ( ruleWheelEngine EOF )
            // InternalLegoLang.g:256:1: ruleWheelEngine EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWheelEngineRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleWheelEngine();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWheelEngineRule()); 
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
    // $ANTLR end "entryRuleWheelEngine"


    // $ANTLR start "ruleWheelEngine"
    // InternalLegoLang.g:263:1: ruleWheelEngine : ( ( rule__WheelEngine__Group__0 ) ) ;
    public final void ruleWheelEngine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:267:2: ( ( ( rule__WheelEngine__Group__0 ) ) )
            // InternalLegoLang.g:268:2: ( ( rule__WheelEngine__Group__0 ) )
            {
            // InternalLegoLang.g:268:2: ( ( rule__WheelEngine__Group__0 ) )
            // InternalLegoLang.g:269:3: ( rule__WheelEngine__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWheelEngineAccess().getGroup()); 
            }
            // InternalLegoLang.g:270:3: ( rule__WheelEngine__Group__0 )
            // InternalLegoLang.g:270:4: rule__WheelEngine__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WheelEngine__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWheelEngineAccess().getGroup()); 
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
    // $ANTLR end "ruleWheelEngine"


    // $ANTLR start "entryRuleColorSensor"
    // InternalLegoLang.g:279:1: entryRuleColorSensor : ruleColorSensor EOF ;
    public final void entryRuleColorSensor() throws RecognitionException {
        try {
            // InternalLegoLang.g:280:1: ( ruleColorSensor EOF )
            // InternalLegoLang.g:281:1: ruleColorSensor EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorSensorRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleColorSensor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getColorSensorRule()); 
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
    // $ANTLR end "entryRuleColorSensor"


    // $ANTLR start "ruleColorSensor"
    // InternalLegoLang.g:288:1: ruleColorSensor : ( ( rule__ColorSensor__Group__0 ) ) ;
    public final void ruleColorSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:292:2: ( ( ( rule__ColorSensor__Group__0 ) ) )
            // InternalLegoLang.g:293:2: ( ( rule__ColorSensor__Group__0 ) )
            {
            // InternalLegoLang.g:293:2: ( ( rule__ColorSensor__Group__0 ) )
            // InternalLegoLang.g:294:3: ( rule__ColorSensor__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorSensorAccess().getGroup()); 
            }
            // InternalLegoLang.g:295:3: ( rule__ColorSensor__Group__0 )
            // InternalLegoLang.g:295:4: rule__ColorSensor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ColorSensor__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getColorSensorAccess().getGroup()); 
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
    // $ANTLR end "ruleColorSensor"


    // $ANTLR start "entryRuleLaserSensor"
    // InternalLegoLang.g:304:1: entryRuleLaserSensor : ruleLaserSensor EOF ;
    public final void entryRuleLaserSensor() throws RecognitionException {
        try {
            // InternalLegoLang.g:305:1: ( ruleLaserSensor EOF )
            // InternalLegoLang.g:306:1: ruleLaserSensor EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLaserSensorRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLaserSensor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLaserSensorRule()); 
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
    // $ANTLR end "entryRuleLaserSensor"


    // $ANTLR start "ruleLaserSensor"
    // InternalLegoLang.g:313:1: ruleLaserSensor : ( ( rule__LaserSensor__Group__0 ) ) ;
    public final void ruleLaserSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:317:2: ( ( ( rule__LaserSensor__Group__0 ) ) )
            // InternalLegoLang.g:318:2: ( ( rule__LaserSensor__Group__0 ) )
            {
            // InternalLegoLang.g:318:2: ( ( rule__LaserSensor__Group__0 ) )
            // InternalLegoLang.g:319:3: ( rule__LaserSensor__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLaserSensorAccess().getGroup()); 
            }
            // InternalLegoLang.g:320:3: ( rule__LaserSensor__Group__0 )
            // InternalLegoLang.g:320:4: rule__LaserSensor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LaserSensor__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLaserSensorAccess().getGroup()); 
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
    // $ANTLR end "ruleLaserSensor"


    // $ANTLR start "entryRuleGPSSensor"
    // InternalLegoLang.g:329:1: entryRuleGPSSensor : ruleGPSSensor EOF ;
    public final void entryRuleGPSSensor() throws RecognitionException {
        try {
            // InternalLegoLang.g:330:1: ( ruleGPSSensor EOF )
            // InternalLegoLang.g:331:1: ruleGPSSensor EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGPSSensorRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGPSSensor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGPSSensorRule()); 
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
    // $ANTLR end "entryRuleGPSSensor"


    // $ANTLR start "ruleGPSSensor"
    // InternalLegoLang.g:338:1: ruleGPSSensor : ( ( rule__GPSSensor__Group__0 ) ) ;
    public final void ruleGPSSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:342:2: ( ( ( rule__GPSSensor__Group__0 ) ) )
            // InternalLegoLang.g:343:2: ( ( rule__GPSSensor__Group__0 ) )
            {
            // InternalLegoLang.g:343:2: ( ( rule__GPSSensor__Group__0 ) )
            // InternalLegoLang.g:344:3: ( rule__GPSSensor__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGPSSensorAccess().getGroup()); 
            }
            // InternalLegoLang.g:345:3: ( rule__GPSSensor__Group__0 )
            // InternalLegoLang.g:345:4: rule__GPSSensor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GPSSensor__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGPSSensorAccess().getGroup()); 
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
    // $ANTLR end "ruleGPSSensor"


    // $ANTLR start "entryRuleGyroSensor"
    // InternalLegoLang.g:354:1: entryRuleGyroSensor : ruleGyroSensor EOF ;
    public final void entryRuleGyroSensor() throws RecognitionException {
        try {
            // InternalLegoLang.g:355:1: ( ruleGyroSensor EOF )
            // InternalLegoLang.g:356:1: ruleGyroSensor EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGyroSensorRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGyroSensor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGyroSensorRule()); 
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
    // $ANTLR end "entryRuleGyroSensor"


    // $ANTLR start "ruleGyroSensor"
    // InternalLegoLang.g:363:1: ruleGyroSensor : ( ( rule__GyroSensor__Group__0 ) ) ;
    public final void ruleGyroSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:367:2: ( ( ( rule__GyroSensor__Group__0 ) ) )
            // InternalLegoLang.g:368:2: ( ( rule__GyroSensor__Group__0 ) )
            {
            // InternalLegoLang.g:368:2: ( ( rule__GyroSensor__Group__0 ) )
            // InternalLegoLang.g:369:3: ( rule__GyroSensor__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGyroSensorAccess().getGroup()); 
            }
            // InternalLegoLang.g:370:3: ( rule__GyroSensor__Group__0 )
            // InternalLegoLang.g:370:4: rule__GyroSensor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GyroSensor__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGyroSensorAccess().getGroup()); 
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
    // $ANTLR end "ruleGyroSensor"


    // $ANTLR start "entryRuleUltraSonicSensor"
    // InternalLegoLang.g:379:1: entryRuleUltraSonicSensor : ruleUltraSonicSensor EOF ;
    public final void entryRuleUltraSonicSensor() throws RecognitionException {
        try {
            // InternalLegoLang.g:380:1: ( ruleUltraSonicSensor EOF )
            // InternalLegoLang.g:381:1: ruleUltraSonicSensor EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUltraSonicSensorRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleUltraSonicSensor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUltraSonicSensorRule()); 
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
    // $ANTLR end "entryRuleUltraSonicSensor"


    // $ANTLR start "ruleUltraSonicSensor"
    // InternalLegoLang.g:388:1: ruleUltraSonicSensor : ( ( rule__UltraSonicSensor__Group__0 ) ) ;
    public final void ruleUltraSonicSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:392:2: ( ( ( rule__UltraSonicSensor__Group__0 ) ) )
            // InternalLegoLang.g:393:2: ( ( rule__UltraSonicSensor__Group__0 ) )
            {
            // InternalLegoLang.g:393:2: ( ( rule__UltraSonicSensor__Group__0 ) )
            // InternalLegoLang.g:394:3: ( rule__UltraSonicSensor__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUltraSonicSensorAccess().getGroup()); 
            }
            // InternalLegoLang.g:395:3: ( rule__UltraSonicSensor__Group__0 )
            // InternalLegoLang.g:395:4: rule__UltraSonicSensor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UltraSonicSensor__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUltraSonicSensorAccess().getGroup()); 
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
    // $ANTLR end "ruleUltraSonicSensor"


    // $ANTLR start "entryRuleCar"
    // InternalLegoLang.g:404:1: entryRuleCar : ruleCar EOF ;
    public final void entryRuleCar() throws RecognitionException {
        try {
            // InternalLegoLang.g:405:1: ( ruleCar EOF )
            // InternalLegoLang.g:406:1: ruleCar EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCarRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCar();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCarRule()); 
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
    // $ANTLR end "entryRuleCar"


    // $ANTLR start "ruleCar"
    // InternalLegoLang.g:413:1: ruleCar : ( ( rule__Car__Group__0 ) ) ;
    public final void ruleCar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:417:2: ( ( ( rule__Car__Group__0 ) ) )
            // InternalLegoLang.g:418:2: ( ( rule__Car__Group__0 ) )
            {
            // InternalLegoLang.g:418:2: ( ( rule__Car__Group__0 ) )
            // InternalLegoLang.g:419:3: ( rule__Car__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCarAccess().getGroup()); 
            }
            // InternalLegoLang.g:420:3: ( rule__Car__Group__0 )
            // InternalLegoLang.g:420:4: rule__Car__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Car__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCarAccess().getGroup()); 
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
    // $ANTLR end "ruleCar"


    // $ANTLR start "entryRuleEngineOperation"
    // InternalLegoLang.g:429:1: entryRuleEngineOperation : ruleEngineOperation EOF ;
    public final void entryRuleEngineOperation() throws RecognitionException {
        try {
            // InternalLegoLang.g:430:1: ( ruleEngineOperation EOF )
            // InternalLegoLang.g:431:1: ruleEngineOperation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEngineOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEngineOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEngineOperationRule()); 
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
    // $ANTLR end "entryRuleEngineOperation"


    // $ANTLR start "ruleEngineOperation"
    // InternalLegoLang.g:438:1: ruleEngineOperation : ( ruleVitesseOperation ) ;
    public final void ruleEngineOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:442:2: ( ( ruleVitesseOperation ) )
            // InternalLegoLang.g:443:2: ( ruleVitesseOperation )
            {
            // InternalLegoLang.g:443:2: ( ruleVitesseOperation )
            // InternalLegoLang.g:444:3: ruleVitesseOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEngineOperationAccess().getVitesseOperationParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleVitesseOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEngineOperationAccess().getVitesseOperationParserRuleCall()); 
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
    // $ANTLR end "ruleEngineOperation"


    // $ANTLR start "entryRuleSensorOperation"
    // InternalLegoLang.g:454:1: entryRuleSensorOperation : ruleSensorOperation EOF ;
    public final void entryRuleSensorOperation() throws RecognitionException {
        try {
            // InternalLegoLang.g:455:1: ( ruleSensorOperation EOF )
            // InternalLegoLang.g:456:1: ruleSensorOperation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSensorOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSensorOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSensorOperationRule()); 
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
    // $ANTLR end "entryRuleSensorOperation"


    // $ANTLR start "ruleSensorOperation"
    // InternalLegoLang.g:463:1: ruleSensorOperation : ( ( rule__SensorOperation__Alternatives ) ) ;
    public final void ruleSensorOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:467:2: ( ( ( rule__SensorOperation__Alternatives ) ) )
            // InternalLegoLang.g:468:2: ( ( rule__SensorOperation__Alternatives ) )
            {
            // InternalLegoLang.g:468:2: ( ( rule__SensorOperation__Alternatives ) )
            // InternalLegoLang.g:469:3: ( rule__SensorOperation__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSensorOperationAccess().getAlternatives()); 
            }
            // InternalLegoLang.g:470:3: ( rule__SensorOperation__Alternatives )
            // InternalLegoLang.g:470:4: rule__SensorOperation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SensorOperation__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSensorOperationAccess().getAlternatives()); 
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
    // $ANTLR end "ruleSensorOperation"


    // $ANTLR start "entryRuleVitesseOperation"
    // InternalLegoLang.g:479:1: entryRuleVitesseOperation : ruleVitesseOperation EOF ;
    public final void entryRuleVitesseOperation() throws RecognitionException {
        try {
            // InternalLegoLang.g:480:1: ( ruleVitesseOperation EOF )
            // InternalLegoLang.g:481:1: ruleVitesseOperation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVitesseOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleVitesseOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVitesseOperationRule()); 
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
    // $ANTLR end "entryRuleVitesseOperation"


    // $ANTLR start "ruleVitesseOperation"
    // InternalLegoLang.g:488:1: ruleVitesseOperation : ( ( rule__VitesseOperation__Group__0 ) ) ;
    public final void ruleVitesseOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:492:2: ( ( ( rule__VitesseOperation__Group__0 ) ) )
            // InternalLegoLang.g:493:2: ( ( rule__VitesseOperation__Group__0 ) )
            {
            // InternalLegoLang.g:493:2: ( ( rule__VitesseOperation__Group__0 ) )
            // InternalLegoLang.g:494:3: ( rule__VitesseOperation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVitesseOperationAccess().getGroup()); 
            }
            // InternalLegoLang.g:495:3: ( rule__VitesseOperation__Group__0 )
            // InternalLegoLang.g:495:4: rule__VitesseOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VitesseOperation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVitesseOperationAccess().getGroup()); 
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
    // $ANTLR end "ruleVitesseOperation"


    // $ANTLR start "entryRuleColorOperation"
    // InternalLegoLang.g:504:1: entryRuleColorOperation : ruleColorOperation EOF ;
    public final void entryRuleColorOperation() throws RecognitionException {
        try {
            // InternalLegoLang.g:505:1: ( ruleColorOperation EOF )
            // InternalLegoLang.g:506:1: ruleColorOperation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleColorOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getColorOperationRule()); 
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
    // $ANTLR end "entryRuleColorOperation"


    // $ANTLR start "ruleColorOperation"
    // InternalLegoLang.g:513:1: ruleColorOperation : ( ( rule__ColorOperation__Group__0 ) ) ;
    public final void ruleColorOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:517:2: ( ( ( rule__ColorOperation__Group__0 ) ) )
            // InternalLegoLang.g:518:2: ( ( rule__ColorOperation__Group__0 ) )
            {
            // InternalLegoLang.g:518:2: ( ( rule__ColorOperation__Group__0 ) )
            // InternalLegoLang.g:519:3: ( rule__ColorOperation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorOperationAccess().getGroup()); 
            }
            // InternalLegoLang.g:520:3: ( rule__ColorOperation__Group__0 )
            // InternalLegoLang.g:520:4: rule__ColorOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ColorOperation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getColorOperationAccess().getGroup()); 
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
    // $ANTLR end "ruleColorOperation"


    // $ANTLR start "entryRuleIntensityOperation"
    // InternalLegoLang.g:529:1: entryRuleIntensityOperation : ruleIntensityOperation EOF ;
    public final void entryRuleIntensityOperation() throws RecognitionException {
        try {
            // InternalLegoLang.g:530:1: ( ruleIntensityOperation EOF )
            // InternalLegoLang.g:531:1: ruleIntensityOperation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntensityOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleIntensityOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntensityOperationRule()); 
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
    // $ANTLR end "entryRuleIntensityOperation"


    // $ANTLR start "ruleIntensityOperation"
    // InternalLegoLang.g:538:1: ruleIntensityOperation : ( ( rule__IntensityOperation__Group__0 ) ) ;
    public final void ruleIntensityOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:542:2: ( ( ( rule__IntensityOperation__Group__0 ) ) )
            // InternalLegoLang.g:543:2: ( ( rule__IntensityOperation__Group__0 ) )
            {
            // InternalLegoLang.g:543:2: ( ( rule__IntensityOperation__Group__0 ) )
            // InternalLegoLang.g:544:3: ( rule__IntensityOperation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntensityOperationAccess().getGroup()); 
            }
            // InternalLegoLang.g:545:3: ( rule__IntensityOperation__Group__0 )
            // InternalLegoLang.g:545:4: rule__IntensityOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IntensityOperation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntensityOperationAccess().getGroup()); 
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
    // $ANTLR end "ruleIntensityOperation"


    // $ANTLR start "entryRuleRangeOperation"
    // InternalLegoLang.g:554:1: entryRuleRangeOperation : ruleRangeOperation EOF ;
    public final void entryRuleRangeOperation() throws RecognitionException {
        try {
            // InternalLegoLang.g:555:1: ( ruleRangeOperation EOF )
            // InternalLegoLang.g:556:1: ruleRangeOperation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRangeOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeOperationRule()); 
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
    // $ANTLR end "entryRuleRangeOperation"


    // $ANTLR start "ruleRangeOperation"
    // InternalLegoLang.g:563:1: ruleRangeOperation : ( ( rule__RangeOperation__Group__0 ) ) ;
    public final void ruleRangeOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:567:2: ( ( ( rule__RangeOperation__Group__0 ) ) )
            // InternalLegoLang.g:568:2: ( ( rule__RangeOperation__Group__0 ) )
            {
            // InternalLegoLang.g:568:2: ( ( rule__RangeOperation__Group__0 ) )
            // InternalLegoLang.g:569:3: ( rule__RangeOperation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeOperationAccess().getGroup()); 
            }
            // InternalLegoLang.g:570:3: ( rule__RangeOperation__Group__0 )
            // InternalLegoLang.g:570:4: rule__RangeOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RangeOperation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeOperationAccess().getGroup()); 
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
    // $ANTLR end "ruleRangeOperation"


    // $ANTLR start "entryRuleXGPSOperation"
    // InternalLegoLang.g:579:1: entryRuleXGPSOperation : ruleXGPSOperation EOF ;
    public final void entryRuleXGPSOperation() throws RecognitionException {
        try {
            // InternalLegoLang.g:580:1: ( ruleXGPSOperation EOF )
            // InternalLegoLang.g:581:1: ruleXGPSOperation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGPSOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleXGPSOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGPSOperationRule()); 
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
    // $ANTLR end "entryRuleXGPSOperation"


    // $ANTLR start "ruleXGPSOperation"
    // InternalLegoLang.g:588:1: ruleXGPSOperation : ( ( rule__XGPSOperation__Group__0 ) ) ;
    public final void ruleXGPSOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:592:2: ( ( ( rule__XGPSOperation__Group__0 ) ) )
            // InternalLegoLang.g:593:2: ( ( rule__XGPSOperation__Group__0 ) )
            {
            // InternalLegoLang.g:593:2: ( ( rule__XGPSOperation__Group__0 ) )
            // InternalLegoLang.g:594:3: ( rule__XGPSOperation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGPSOperationAccess().getGroup()); 
            }
            // InternalLegoLang.g:595:3: ( rule__XGPSOperation__Group__0 )
            // InternalLegoLang.g:595:4: rule__XGPSOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XGPSOperation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGPSOperationAccess().getGroup()); 
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
    // $ANTLR end "ruleXGPSOperation"


    // $ANTLR start "entryRuleYGPSOperation"
    // InternalLegoLang.g:604:1: entryRuleYGPSOperation : ruleYGPSOperation EOF ;
    public final void entryRuleYGPSOperation() throws RecognitionException {
        try {
            // InternalLegoLang.g:605:1: ( ruleYGPSOperation EOF )
            // InternalLegoLang.g:606:1: ruleYGPSOperation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYGPSOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleYGPSOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYGPSOperationRule()); 
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
    // $ANTLR end "entryRuleYGPSOperation"


    // $ANTLR start "ruleYGPSOperation"
    // InternalLegoLang.g:613:1: ruleYGPSOperation : ( ( rule__YGPSOperation__Group__0 ) ) ;
    public final void ruleYGPSOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:617:2: ( ( ( rule__YGPSOperation__Group__0 ) ) )
            // InternalLegoLang.g:618:2: ( ( rule__YGPSOperation__Group__0 ) )
            {
            // InternalLegoLang.g:618:2: ( ( rule__YGPSOperation__Group__0 ) )
            // InternalLegoLang.g:619:3: ( rule__YGPSOperation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYGPSOperationAccess().getGroup()); 
            }
            // InternalLegoLang.g:620:3: ( rule__YGPSOperation__Group__0 )
            // InternalLegoLang.g:620:4: rule__YGPSOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__YGPSOperation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYGPSOperationAccess().getGroup()); 
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
    // $ANTLR end "ruleYGPSOperation"


    // $ANTLR start "entryRuleAngleOperation"
    // InternalLegoLang.g:629:1: entryRuleAngleOperation : ruleAngleOperation EOF ;
    public final void entryRuleAngleOperation() throws RecognitionException {
        try {
            // InternalLegoLang.g:630:1: ( ruleAngleOperation EOF )
            // InternalLegoLang.g:631:1: ruleAngleOperation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAngleOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAngleOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAngleOperationRule()); 
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
    // $ANTLR end "entryRuleAngleOperation"


    // $ANTLR start "ruleAngleOperation"
    // InternalLegoLang.g:638:1: ruleAngleOperation : ( ( rule__AngleOperation__Group__0 ) ) ;
    public final void ruleAngleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:642:2: ( ( ( rule__AngleOperation__Group__0 ) ) )
            // InternalLegoLang.g:643:2: ( ( rule__AngleOperation__Group__0 ) )
            {
            // InternalLegoLang.g:643:2: ( ( rule__AngleOperation__Group__0 ) )
            // InternalLegoLang.g:644:3: ( rule__AngleOperation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAngleOperationAccess().getGroup()); 
            }
            // InternalLegoLang.g:645:3: ( rule__AngleOperation__Group__0 )
            // InternalLegoLang.g:645:4: rule__AngleOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AngleOperation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAngleOperationAccess().getGroup()); 
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
    // $ANTLR end "ruleAngleOperation"


    // $ANTLR start "entryRuleDistanceOperation"
    // InternalLegoLang.g:654:1: entryRuleDistanceOperation : ruleDistanceOperation EOF ;
    public final void entryRuleDistanceOperation() throws RecognitionException {
        try {
            // InternalLegoLang.g:655:1: ( ruleDistanceOperation EOF )
            // InternalLegoLang.g:656:1: ruleDistanceOperation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDistanceOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDistanceOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDistanceOperationRule()); 
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
    // $ANTLR end "entryRuleDistanceOperation"


    // $ANTLR start "ruleDistanceOperation"
    // InternalLegoLang.g:663:1: ruleDistanceOperation : ( ( rule__DistanceOperation__Group__0 ) ) ;
    public final void ruleDistanceOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:667:2: ( ( ( rule__DistanceOperation__Group__0 ) ) )
            // InternalLegoLang.g:668:2: ( ( rule__DistanceOperation__Group__0 ) )
            {
            // InternalLegoLang.g:668:2: ( ( rule__DistanceOperation__Group__0 ) )
            // InternalLegoLang.g:669:3: ( rule__DistanceOperation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDistanceOperationAccess().getGroup()); 
            }
            // InternalLegoLang.g:670:3: ( rule__DistanceOperation__Group__0 )
            // InternalLegoLang.g:670:4: rule__DistanceOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DistanceOperation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDistanceOperationAccess().getGroup()); 
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
    // $ANTLR end "ruleDistanceOperation"


    // $ANTLR start "entryRuleBooleanExpression"
    // InternalLegoLang.g:679:1: entryRuleBooleanExpression : ruleBooleanExpression EOF ;
    public final void entryRuleBooleanExpression() throws RecognitionException {
        try {
            // InternalLegoLang.g:680:1: ( ruleBooleanExpression EOF )
            // InternalLegoLang.g:681:1: ruleBooleanExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBooleanExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionRule()); 
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
    // $ANTLR end "entryRuleBooleanExpression"


    // $ANTLR start "ruleBooleanExpression"
    // InternalLegoLang.g:688:1: ruleBooleanExpression : ( ( rule__BooleanExpression__Alternatives ) ) ;
    public final void ruleBooleanExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:692:2: ( ( ( rule__BooleanExpression__Alternatives ) ) )
            // InternalLegoLang.g:693:2: ( ( rule__BooleanExpression__Alternatives ) )
            {
            // InternalLegoLang.g:693:2: ( ( rule__BooleanExpression__Alternatives ) )
            // InternalLegoLang.g:694:3: ( rule__BooleanExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionAccess().getAlternatives()); 
            }
            // InternalLegoLang.g:695:3: ( rule__BooleanExpression__Alternatives )
            // InternalLegoLang.g:695:4: rule__BooleanExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionAccess().getAlternatives()); 
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
    // $ANTLR end "ruleBooleanExpression"


    // $ANTLR start "entryRuleAnd"
    // InternalLegoLang.g:704:1: entryRuleAnd : ruleAnd EOF ;
    public final void entryRuleAnd() throws RecognitionException {
        try {
            // InternalLegoLang.g:705:1: ( ruleAnd EOF )
            // InternalLegoLang.g:706:1: ruleAnd EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndRule()); 
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
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalLegoLang.g:713:1: ruleAnd : ( ( rule__And__Group__0 ) ) ;
    public final void ruleAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:717:2: ( ( ( rule__And__Group__0 ) ) )
            // InternalLegoLang.g:718:2: ( ( rule__And__Group__0 ) )
            {
            // InternalLegoLang.g:718:2: ( ( rule__And__Group__0 ) )
            // InternalLegoLang.g:719:3: ( rule__And__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getGroup()); 
            }
            // InternalLegoLang.g:720:3: ( rule__And__Group__0 )
            // InternalLegoLang.g:720:4: rule__And__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__And__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getGroup()); 
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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleOr"
    // InternalLegoLang.g:729:1: entryRuleOr : ruleOr EOF ;
    public final void entryRuleOr() throws RecognitionException {
        try {
            // InternalLegoLang.g:730:1: ( ruleOr EOF )
            // InternalLegoLang.g:731:1: ruleOr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrRule()); 
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
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // InternalLegoLang.g:738:1: ruleOr : ( ( rule__Or__Group__0 ) ) ;
    public final void ruleOr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:742:2: ( ( ( rule__Or__Group__0 ) ) )
            // InternalLegoLang.g:743:2: ( ( rule__Or__Group__0 ) )
            {
            // InternalLegoLang.g:743:2: ( ( rule__Or__Group__0 ) )
            // InternalLegoLang.g:744:3: ( rule__Or__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getGroup()); 
            }
            // InternalLegoLang.g:745:3: ( rule__Or__Group__0 )
            // InternalLegoLang.g:745:4: rule__Or__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getGroup()); 
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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleConditionEtat"
    // InternalLegoLang.g:754:1: entryRuleConditionEtat : ruleConditionEtat EOF ;
    public final void entryRuleConditionEtat() throws RecognitionException {
        try {
            // InternalLegoLang.g:755:1: ( ruleConditionEtat EOF )
            // InternalLegoLang.g:756:1: ruleConditionEtat EOF
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
    // InternalLegoLang.g:763:1: ruleConditionEtat : ( ( rule__ConditionEtat__Group__0 ) ) ;
    public final void ruleConditionEtat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:767:2: ( ( ( rule__ConditionEtat__Group__0 ) ) )
            // InternalLegoLang.g:768:2: ( ( rule__ConditionEtat__Group__0 ) )
            {
            // InternalLegoLang.g:768:2: ( ( rule__ConditionEtat__Group__0 ) )
            // InternalLegoLang.g:769:3: ( rule__ConditionEtat__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionEtatAccess().getGroup()); 
            }
            // InternalLegoLang.g:770:3: ( rule__ConditionEtat__Group__0 )
            // InternalLegoLang.g:770:4: rule__ConditionEtat__Group__0
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
    // InternalLegoLang.g:779:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalLegoLang.g:780:1: ( ruleEString EOF )
            // InternalLegoLang.g:781:1: ruleEString EOF
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
    // InternalLegoLang.g:788:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:792:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalLegoLang.g:793:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalLegoLang.g:793:2: ( ( rule__EString__Alternatives ) )
            // InternalLegoLang.g:794:3: ( rule__EString__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringAccess().getAlternatives()); 
            }
            // InternalLegoLang.g:795:3: ( rule__EString__Alternatives )
            // InternalLegoLang.g:795:4: rule__EString__Alternatives
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
    // InternalLegoLang.g:804:1: entryRuleWhileLoop : ruleWhileLoop EOF ;
    public final void entryRuleWhileLoop() throws RecognitionException {
        try {
            // InternalLegoLang.g:805:1: ( ruleWhileLoop EOF )
            // InternalLegoLang.g:806:1: ruleWhileLoop EOF
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
    // InternalLegoLang.g:813:1: ruleWhileLoop : ( ( rule__WhileLoop__Group__0 ) ) ;
    public final void ruleWhileLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:817:2: ( ( ( rule__WhileLoop__Group__0 ) ) )
            // InternalLegoLang.g:818:2: ( ( rule__WhileLoop__Group__0 ) )
            {
            // InternalLegoLang.g:818:2: ( ( rule__WhileLoop__Group__0 ) )
            // InternalLegoLang.g:819:3: ( rule__WhileLoop__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileLoopAccess().getGroup()); 
            }
            // InternalLegoLang.g:820:3: ( rule__WhileLoop__Group__0 )
            // InternalLegoLang.g:820:4: rule__WhileLoop__Group__0
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
    // InternalLegoLang.g:829:1: entryRuleMethodePrint : ruleMethodePrint EOF ;
    public final void entryRuleMethodePrint() throws RecognitionException {
        try {
            // InternalLegoLang.g:830:1: ( ruleMethodePrint EOF )
            // InternalLegoLang.g:831:1: ruleMethodePrint EOF
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
    // InternalLegoLang.g:838:1: ruleMethodePrint : ( ( rule__MethodePrint__Group__0 ) ) ;
    public final void ruleMethodePrint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:842:2: ( ( ( rule__MethodePrint__Group__0 ) ) )
            // InternalLegoLang.g:843:2: ( ( rule__MethodePrint__Group__0 ) )
            {
            // InternalLegoLang.g:843:2: ( ( rule__MethodePrint__Group__0 ) )
            // InternalLegoLang.g:844:3: ( rule__MethodePrint__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodePrintAccess().getGroup()); 
            }
            // InternalLegoLang.g:845:3: ( rule__MethodePrint__Group__0 )
            // InternalLegoLang.g:845:4: rule__MethodePrint__Group__0
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
    // InternalLegoLang.g:854:1: entryRuleVariableRef : ruleVariableRef EOF ;
    public final void entryRuleVariableRef() throws RecognitionException {
        try {
            // InternalLegoLang.g:855:1: ( ruleVariableRef EOF )
            // InternalLegoLang.g:856:1: ruleVariableRef EOF
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
    // InternalLegoLang.g:863:1: ruleVariableRef : ( ( rule__VariableRef__VariableAssignment ) ) ;
    public final void ruleVariableRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:867:2: ( ( ( rule__VariableRef__VariableAssignment ) ) )
            // InternalLegoLang.g:868:2: ( ( rule__VariableRef__VariableAssignment ) )
            {
            // InternalLegoLang.g:868:2: ( ( rule__VariableRef__VariableAssignment ) )
            // InternalLegoLang.g:869:3: ( rule__VariableRef__VariableAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableRefAccess().getVariableAssignment()); 
            }
            // InternalLegoLang.g:870:3: ( rule__VariableRef__VariableAssignment )
            // InternalLegoLang.g:870:4: rule__VariableRef__VariableAssignment
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
    // InternalLegoLang.g:879:1: entryRuleSubstraction : ruleSubstraction EOF ;
    public final void entryRuleSubstraction() throws RecognitionException {
        try {
            // InternalLegoLang.g:880:1: ( ruleSubstraction EOF )
            // InternalLegoLang.g:881:1: ruleSubstraction EOF
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
    // InternalLegoLang.g:888:1: ruleSubstraction : ( ( rule__Substraction__Group__0 ) ) ;
    public final void ruleSubstraction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:892:2: ( ( ( rule__Substraction__Group__0 ) ) )
            // InternalLegoLang.g:893:2: ( ( rule__Substraction__Group__0 ) )
            {
            // InternalLegoLang.g:893:2: ( ( rule__Substraction__Group__0 ) )
            // InternalLegoLang.g:894:3: ( rule__Substraction__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstractionAccess().getGroup()); 
            }
            // InternalLegoLang.g:895:3: ( rule__Substraction__Group__0 )
            // InternalLegoLang.g:895:4: rule__Substraction__Group__0
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
    // InternalLegoLang.g:904:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // InternalLegoLang.g:905:1: ( ruleAddition EOF )
            // InternalLegoLang.g:906:1: ruleAddition EOF
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
    // InternalLegoLang.g:913:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:917:2: ( ( ( rule__Addition__Group__0 ) ) )
            // InternalLegoLang.g:918:2: ( ( rule__Addition__Group__0 ) )
            {
            // InternalLegoLang.g:918:2: ( ( rule__Addition__Group__0 ) )
            // InternalLegoLang.g:919:3: ( rule__Addition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getGroup()); 
            }
            // InternalLegoLang.g:920:3: ( rule__Addition__Group__0 )
            // InternalLegoLang.g:920:4: rule__Addition__Group__0
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
    // InternalLegoLang.g:929:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // InternalLegoLang.g:930:1: ( ruleMultiplication EOF )
            // InternalLegoLang.g:931:1: ruleMultiplication EOF
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
    // InternalLegoLang.g:938:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:942:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // InternalLegoLang.g:943:2: ( ( rule__Multiplication__Group__0 ) )
            {
            // InternalLegoLang.g:943:2: ( ( rule__Multiplication__Group__0 ) )
            // InternalLegoLang.g:944:3: ( rule__Multiplication__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getGroup()); 
            }
            // InternalLegoLang.g:945:3: ( rule__Multiplication__Group__0 )
            // InternalLegoLang.g:945:4: rule__Multiplication__Group__0
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
    // InternalLegoLang.g:954:1: entryRuleDivision : ruleDivision EOF ;
    public final void entryRuleDivision() throws RecognitionException {
        try {
            // InternalLegoLang.g:955:1: ( ruleDivision EOF )
            // InternalLegoLang.g:956:1: ruleDivision EOF
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
    // InternalLegoLang.g:963:1: ruleDivision : ( ( rule__Division__Group__0 ) ) ;
    public final void ruleDivision() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:967:2: ( ( ( rule__Division__Group__0 ) ) )
            // InternalLegoLang.g:968:2: ( ( rule__Division__Group__0 ) )
            {
            // InternalLegoLang.g:968:2: ( ( rule__Division__Group__0 ) )
            // InternalLegoLang.g:969:3: ( rule__Division__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivisionAccess().getGroup()); 
            }
            // InternalLegoLang.g:970:3: ( rule__Division__Group__0 )
            // InternalLegoLang.g:970:4: rule__Division__Group__0
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
    // InternalLegoLang.g:979:1: entryRuleGT : ruleGT EOF ;
    public final void entryRuleGT() throws RecognitionException {
        try {
            // InternalLegoLang.g:980:1: ( ruleGT EOF )
            // InternalLegoLang.g:981:1: ruleGT EOF
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
    // InternalLegoLang.g:988:1: ruleGT : ( ( rule__GT__Group__0 ) ) ;
    public final void ruleGT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:992:2: ( ( ( rule__GT__Group__0 ) ) )
            // InternalLegoLang.g:993:2: ( ( rule__GT__Group__0 ) )
            {
            // InternalLegoLang.g:993:2: ( ( rule__GT__Group__0 ) )
            // InternalLegoLang.g:994:3: ( rule__GT__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTAccess().getGroup()); 
            }
            // InternalLegoLang.g:995:3: ( rule__GT__Group__0 )
            // InternalLegoLang.g:995:4: rule__GT__Group__0
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
    // InternalLegoLang.g:1004:1: entryRuleLT : ruleLT EOF ;
    public final void entryRuleLT() throws RecognitionException {
        try {
            // InternalLegoLang.g:1005:1: ( ruleLT EOF )
            // InternalLegoLang.g:1006:1: ruleLT EOF
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
    // InternalLegoLang.g:1013:1: ruleLT : ( ( rule__LT__Group__0 ) ) ;
    public final void ruleLT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1017:2: ( ( ( rule__LT__Group__0 ) ) )
            // InternalLegoLang.g:1018:2: ( ( rule__LT__Group__0 ) )
            {
            // InternalLegoLang.g:1018:2: ( ( rule__LT__Group__0 ) )
            // InternalLegoLang.g:1019:3: ( rule__LT__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTAccess().getGroup()); 
            }
            // InternalLegoLang.g:1020:3: ( rule__LT__Group__0 )
            // InternalLegoLang.g:1020:4: rule__LT__Group__0
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
    // InternalLegoLang.g:1029:1: entryRuleEqual : ruleEqual EOF ;
    public final void entryRuleEqual() throws RecognitionException {
        try {
            // InternalLegoLang.g:1030:1: ( ruleEqual EOF )
            // InternalLegoLang.g:1031:1: ruleEqual EOF
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
    // InternalLegoLang.g:1038:1: ruleEqual : ( ( rule__Equal__Group__0 ) ) ;
    public final void ruleEqual() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1042:2: ( ( ( rule__Equal__Group__0 ) ) )
            // InternalLegoLang.g:1043:2: ( ( rule__Equal__Group__0 ) )
            {
            // InternalLegoLang.g:1043:2: ( ( rule__Equal__Group__0 ) )
            // InternalLegoLang.g:1044:3: ( rule__Equal__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualAccess().getGroup()); 
            }
            // InternalLegoLang.g:1045:3: ( rule__Equal__Group__0 )
            // InternalLegoLang.g:1045:4: rule__Equal__Group__0
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
    // InternalLegoLang.g:1054:1: entryRuleDifferent : ruleDifferent EOF ;
    public final void entryRuleDifferent() throws RecognitionException {
        try {
            // InternalLegoLang.g:1055:1: ( ruleDifferent EOF )
            // InternalLegoLang.g:1056:1: ruleDifferent EOF
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
    // InternalLegoLang.g:1063:1: ruleDifferent : ( ( rule__Different__Group__0 ) ) ;
    public final void ruleDifferent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1067:2: ( ( ( rule__Different__Group__0 ) ) )
            // InternalLegoLang.g:1068:2: ( ( rule__Different__Group__0 ) )
            {
            // InternalLegoLang.g:1068:2: ( ( rule__Different__Group__0 ) )
            // InternalLegoLang.g:1069:3: ( rule__Different__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDifferentAccess().getGroup()); 
            }
            // InternalLegoLang.g:1070:3: ( rule__Different__Group__0 )
            // InternalLegoLang.g:1070:4: rule__Different__Group__0
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
    // InternalLegoLang.g:1079:1: entryRuleLTorEqual : ruleLTorEqual EOF ;
    public final void entryRuleLTorEqual() throws RecognitionException {
        try {
            // InternalLegoLang.g:1080:1: ( ruleLTorEqual EOF )
            // InternalLegoLang.g:1081:1: ruleLTorEqual EOF
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
    // InternalLegoLang.g:1088:1: ruleLTorEqual : ( ( rule__LTorEqual__Group__0 ) ) ;
    public final void ruleLTorEqual() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1092:2: ( ( ( rule__LTorEqual__Group__0 ) ) )
            // InternalLegoLang.g:1093:2: ( ( rule__LTorEqual__Group__0 ) )
            {
            // InternalLegoLang.g:1093:2: ( ( rule__LTorEqual__Group__0 ) )
            // InternalLegoLang.g:1094:3: ( rule__LTorEqual__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTorEqualAccess().getGroup()); 
            }
            // InternalLegoLang.g:1095:3: ( rule__LTorEqual__Group__0 )
            // InternalLegoLang.g:1095:4: rule__LTorEqual__Group__0
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
    // InternalLegoLang.g:1104:1: entryRuleGTorEqual : ruleGTorEqual EOF ;
    public final void entryRuleGTorEqual() throws RecognitionException {
        try {
            // InternalLegoLang.g:1105:1: ( ruleGTorEqual EOF )
            // InternalLegoLang.g:1106:1: ruleGTorEqual EOF
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
    // InternalLegoLang.g:1113:1: ruleGTorEqual : ( ( rule__GTorEqual__Group__0 ) ) ;
    public final void ruleGTorEqual() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1117:2: ( ( ( rule__GTorEqual__Group__0 ) ) )
            // InternalLegoLang.g:1118:2: ( ( rule__GTorEqual__Group__0 ) )
            {
            // InternalLegoLang.g:1118:2: ( ( rule__GTorEqual__Group__0 ) )
            // InternalLegoLang.g:1119:3: ( rule__GTorEqual__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTorEqualAccess().getGroup()); 
            }
            // InternalLegoLang.g:1120:3: ( rule__GTorEqual__Group__0 )
            // InternalLegoLang.g:1120:4: rule__GTorEqual__Group__0
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
    // InternalLegoLang.g:1129:1: entryRuleAssignement : ruleAssignement EOF ;
    public final void entryRuleAssignement() throws RecognitionException {
        try {
            // InternalLegoLang.g:1130:1: ( ruleAssignement EOF )
            // InternalLegoLang.g:1131:1: ruleAssignement EOF
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
    // InternalLegoLang.g:1138:1: ruleAssignement : ( ( rule__Assignement__Group__0 ) ) ;
    public final void ruleAssignement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1142:2: ( ( ( rule__Assignement__Group__0 ) ) )
            // InternalLegoLang.g:1143:2: ( ( rule__Assignement__Group__0 ) )
            {
            // InternalLegoLang.g:1143:2: ( ( rule__Assignement__Group__0 ) )
            // InternalLegoLang.g:1144:3: ( rule__Assignement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignementAccess().getGroup()); 
            }
            // InternalLegoLang.g:1145:3: ( rule__Assignement__Group__0 )
            // InternalLegoLang.g:1145:4: rule__Assignement__Group__0
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
    // InternalLegoLang.g:1154:1: entryRulePlusEqual : rulePlusEqual EOF ;
    public final void entryRulePlusEqual() throws RecognitionException {
        try {
            // InternalLegoLang.g:1155:1: ( rulePlusEqual EOF )
            // InternalLegoLang.g:1156:1: rulePlusEqual EOF
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
    // InternalLegoLang.g:1163:1: rulePlusEqual : ( ( rule__PlusEqual__Group__0 ) ) ;
    public final void rulePlusEqual() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1167:2: ( ( ( rule__PlusEqual__Group__0 ) ) )
            // InternalLegoLang.g:1168:2: ( ( rule__PlusEqual__Group__0 ) )
            {
            // InternalLegoLang.g:1168:2: ( ( rule__PlusEqual__Group__0 ) )
            // InternalLegoLang.g:1169:3: ( rule__PlusEqual__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusEqualAccess().getGroup()); 
            }
            // InternalLegoLang.g:1170:3: ( rule__PlusEqual__Group__0 )
            // InternalLegoLang.g:1170:4: rule__PlusEqual__Group__0
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
    // InternalLegoLang.g:1179:1: entryRuleMinusEqual : ruleMinusEqual EOF ;
    public final void entryRuleMinusEqual() throws RecognitionException {
        try {
            // InternalLegoLang.g:1180:1: ( ruleMinusEqual EOF )
            // InternalLegoLang.g:1181:1: ruleMinusEqual EOF
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
    // InternalLegoLang.g:1188:1: ruleMinusEqual : ( ( rule__MinusEqual__Group__0 ) ) ;
    public final void ruleMinusEqual() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1192:2: ( ( ( rule__MinusEqual__Group__0 ) ) )
            // InternalLegoLang.g:1193:2: ( ( rule__MinusEqual__Group__0 ) )
            {
            // InternalLegoLang.g:1193:2: ( ( rule__MinusEqual__Group__0 ) )
            // InternalLegoLang.g:1194:3: ( rule__MinusEqual__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinusEqualAccess().getGroup()); 
            }
            // InternalLegoLang.g:1195:3: ( rule__MinusEqual__Group__0 )
            // InternalLegoLang.g:1195:4: rule__MinusEqual__Group__0
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
    // InternalLegoLang.g:1204:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalLegoLang.g:1205:1: ( ruleEBoolean EOF )
            // InternalLegoLang.g:1206:1: ruleEBoolean EOF
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
    // InternalLegoLang.g:1213:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1217:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalLegoLang.g:1218:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalLegoLang.g:1218:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalLegoLang.g:1219:3: ( rule__EBoolean__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            }
            // InternalLegoLang.g:1220:3: ( rule__EBoolean__Alternatives )
            // InternalLegoLang.g:1220:4: rule__EBoolean__Alternatives
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
    // InternalLegoLang.g:1229:1: entryRuleUnInteger : ruleUnInteger EOF ;
    public final void entryRuleUnInteger() throws RecognitionException {
        try {
            // InternalLegoLang.g:1230:1: ( ruleUnInteger EOF )
            // InternalLegoLang.g:1231:1: ruleUnInteger EOF
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
    // InternalLegoLang.g:1238:1: ruleUnInteger : ( ( rule__UnInteger__Group__0 ) ) ;
    public final void ruleUnInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1242:2: ( ( ( rule__UnInteger__Group__0 ) ) )
            // InternalLegoLang.g:1243:2: ( ( rule__UnInteger__Group__0 ) )
            {
            // InternalLegoLang.g:1243:2: ( ( rule__UnInteger__Group__0 ) )
            // InternalLegoLang.g:1244:3: ( rule__UnInteger__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnIntegerAccess().getGroup()); 
            }
            // InternalLegoLang.g:1245:3: ( rule__UnInteger__Group__0 )
            // InternalLegoLang.g:1245:4: rule__UnInteger__Group__0
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
    // InternalLegoLang.g:1254:1: entryRuleUnDouble : ruleUnDouble EOF ;
    public final void entryRuleUnDouble() throws RecognitionException {
        try {
            // InternalLegoLang.g:1255:1: ( ruleUnDouble EOF )
            // InternalLegoLang.g:1256:1: ruleUnDouble EOF
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
    // InternalLegoLang.g:1263:1: ruleUnDouble : ( ( rule__UnDouble__Group__0 ) ) ;
    public final void ruleUnDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1267:2: ( ( ( rule__UnDouble__Group__0 ) ) )
            // InternalLegoLang.g:1268:2: ( ( rule__UnDouble__Group__0 ) )
            {
            // InternalLegoLang.g:1268:2: ( ( rule__UnDouble__Group__0 ) )
            // InternalLegoLang.g:1269:3: ( rule__UnDouble__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnDoubleAccess().getGroup()); 
            }
            // InternalLegoLang.g:1270:3: ( rule__UnDouble__Group__0 )
            // InternalLegoLang.g:1270:4: rule__UnDouble__Group__0
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
    // InternalLegoLang.g:1279:1: entryRuleUnBoolean : ruleUnBoolean EOF ;
    public final void entryRuleUnBoolean() throws RecognitionException {
        try {
            // InternalLegoLang.g:1280:1: ( ruleUnBoolean EOF )
            // InternalLegoLang.g:1281:1: ruleUnBoolean EOF
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
    // InternalLegoLang.g:1288:1: ruleUnBoolean : ( ( rule__UnBoolean__Group__0 ) ) ;
    public final void ruleUnBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1292:2: ( ( ( rule__UnBoolean__Group__0 ) ) )
            // InternalLegoLang.g:1293:2: ( ( rule__UnBoolean__Group__0 ) )
            {
            // InternalLegoLang.g:1293:2: ( ( rule__UnBoolean__Group__0 ) )
            // InternalLegoLang.g:1294:3: ( rule__UnBoolean__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnBooleanAccess().getGroup()); 
            }
            // InternalLegoLang.g:1295:3: ( rule__UnBoolean__Group__0 )
            // InternalLegoLang.g:1295:4: rule__UnBoolean__Group__0
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
    // InternalLegoLang.g:1304:1: entryRuleUnString : ruleUnString EOF ;
    public final void entryRuleUnString() throws RecognitionException {
        try {
            // InternalLegoLang.g:1305:1: ( ruleUnString EOF )
            // InternalLegoLang.g:1306:1: ruleUnString EOF
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
    // InternalLegoLang.g:1313:1: ruleUnString : ( ( rule__UnString__Group__0 ) ) ;
    public final void ruleUnString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1317:2: ( ( ( rule__UnString__Group__0 ) ) )
            // InternalLegoLang.g:1318:2: ( ( rule__UnString__Group__0 ) )
            {
            // InternalLegoLang.g:1318:2: ( ( rule__UnString__Group__0 ) )
            // InternalLegoLang.g:1319:3: ( rule__UnString__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnStringAccess().getGroup()); 
            }
            // InternalLegoLang.g:1320:3: ( rule__UnString__Group__0 )
            // InternalLegoLang.g:1320:4: rule__UnString__Group__0
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
    // InternalLegoLang.g:1329:1: entryRuleTheDouble : ruleTheDouble EOF ;
    public final void entryRuleTheDouble() throws RecognitionException {
        try {
            // InternalLegoLang.g:1330:1: ( ruleTheDouble EOF )
            // InternalLegoLang.g:1331:1: ruleTheDouble EOF
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
    // InternalLegoLang.g:1338:1: ruleTheDouble : ( ( rule__TheDouble__Group__0 ) ) ;
    public final void ruleTheDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1342:2: ( ( ( rule__TheDouble__Group__0 ) ) )
            // InternalLegoLang.g:1343:2: ( ( rule__TheDouble__Group__0 ) )
            {
            // InternalLegoLang.g:1343:2: ( ( rule__TheDouble__Group__0 ) )
            // InternalLegoLang.g:1344:3: ( rule__TheDouble__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheDoubleAccess().getGroup()); 
            }
            // InternalLegoLang.g:1345:3: ( rule__TheDouble__Group__0 )
            // InternalLegoLang.g:1345:4: rule__TheDouble__Group__0
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
    // InternalLegoLang.g:1354:1: entryRuleTheInt : ruleTheInt EOF ;
    public final void entryRuleTheInt() throws RecognitionException {
        try {
            // InternalLegoLang.g:1355:1: ( ruleTheInt EOF )
            // InternalLegoLang.g:1356:1: ruleTheInt EOF
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
    // InternalLegoLang.g:1363:1: ruleTheInt : ( ( rule__TheInt__Group__0 ) ) ;
    public final void ruleTheInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1367:2: ( ( ( rule__TheInt__Group__0 ) ) )
            // InternalLegoLang.g:1368:2: ( ( rule__TheInt__Group__0 ) )
            {
            // InternalLegoLang.g:1368:2: ( ( rule__TheInt__Group__0 ) )
            // InternalLegoLang.g:1369:3: ( rule__TheInt__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheIntAccess().getGroup()); 
            }
            // InternalLegoLang.g:1370:3: ( rule__TheInt__Group__0 )
            // InternalLegoLang.g:1370:4: rule__TheInt__Group__0
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
    // InternalLegoLang.g:1379:1: entryRuleTheBoolean : ruleTheBoolean EOF ;
    public final void entryRuleTheBoolean() throws RecognitionException {
        try {
            // InternalLegoLang.g:1380:1: ( ruleTheBoolean EOF )
            // InternalLegoLang.g:1381:1: ruleTheBoolean EOF
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
    // InternalLegoLang.g:1388:1: ruleTheBoolean : ( ( rule__TheBoolean__Group__0 ) ) ;
    public final void ruleTheBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1392:2: ( ( ( rule__TheBoolean__Group__0 ) ) )
            // InternalLegoLang.g:1393:2: ( ( rule__TheBoolean__Group__0 ) )
            {
            // InternalLegoLang.g:1393:2: ( ( rule__TheBoolean__Group__0 ) )
            // InternalLegoLang.g:1394:3: ( rule__TheBoolean__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheBooleanAccess().getGroup()); 
            }
            // InternalLegoLang.g:1395:3: ( rule__TheBoolean__Group__0 )
            // InternalLegoLang.g:1395:4: rule__TheBoolean__Group__0
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
    // InternalLegoLang.g:1404:1: entryRuleTheString : ruleTheString EOF ;
    public final void entryRuleTheString() throws RecognitionException {
        try {
            // InternalLegoLang.g:1405:1: ( ruleTheString EOF )
            // InternalLegoLang.g:1406:1: ruleTheString EOF
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
    // InternalLegoLang.g:1413:1: ruleTheString : ( ( rule__TheString__Group__0 ) ) ;
    public final void ruleTheString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1417:2: ( ( ( rule__TheString__Group__0 ) ) )
            // InternalLegoLang.g:1418:2: ( ( rule__TheString__Group__0 ) )
            {
            // InternalLegoLang.g:1418:2: ( ( rule__TheString__Group__0 ) )
            // InternalLegoLang.g:1419:3: ( rule__TheString__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheStringAccess().getGroup()); 
            }
            // InternalLegoLang.g:1420:3: ( rule__TheString__Group__0 )
            // InternalLegoLang.g:1420:4: rule__TheString__Group__0
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


    // $ANTLR start "entryRuleFQN"
    // InternalLegoLang.g:1429:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // InternalLegoLang.g:1430:1: ( ruleFQN EOF )
            // InternalLegoLang.g:1431:1: ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFQNRule()); 
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
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // InternalLegoLang.g:1438:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1442:2: ( ( ( rule__FQN__Group__0 ) ) )
            // InternalLegoLang.g:1443:2: ( ( rule__FQN__Group__0 ) )
            {
            // InternalLegoLang.g:1443:2: ( ( rule__FQN__Group__0 ) )
            // InternalLegoLang.g:1444:3: ( rule__FQN__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getGroup()); 
            }
            // InternalLegoLang.g:1445:3: ( rule__FQN__Group__0 )
            // InternalLegoLang.g:1445:4: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FQN__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFQNAccess().getGroup()); 
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
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleEInt"
    // InternalLegoLang.g:1454:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalLegoLang.g:1455:1: ( ruleEInt EOF )
            // InternalLegoLang.g:1456:1: ruleEInt EOF
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
    // InternalLegoLang.g:1463:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1467:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalLegoLang.g:1468:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalLegoLang.g:1468:2: ( ( rule__EInt__Group__0 ) )
            // InternalLegoLang.g:1469:3: ( rule__EInt__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntAccess().getGroup()); 
            }
            // InternalLegoLang.g:1470:3: ( rule__EInt__Group__0 )
            // InternalLegoLang.g:1470:4: rule__EInt__Group__0
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
    // InternalLegoLang.g:1478:1: rule__Statement__Alternatives : ( ( ruleWhileLoop ) | ( ruleVariable ) | ( ruleExpression ) | ( ruleConditionEtat ) | ( ruleMethodePrint ) | ( ruleCar ) | ( ruleSensor ) | ( ruleEngine ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1482:1: ( ( ruleWhileLoop ) | ( ruleVariable ) | ( ruleExpression ) | ( ruleConditionEtat ) | ( ruleMethodePrint ) | ( ruleCar ) | ( ruleSensor ) | ( ruleEngine ) )
            int alt1=8;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt1=1;
                }
                break;
            case 56:
            case 58:
            case 60:
            case 61:
            case 62:
                {
                alt1=2;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
            case RULE_INT:
            case 11:
            case 12:
            case 23:
            case 25:
            case 28:
            case 44:
                {
                alt1=3;
                }
                break;
            case 38:
                {
                alt1=4;
                }
                break;
            case 41:
                {
                alt1=5;
                }
                break;
            case 22:
                {
                alt1=6;
                }
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                {
                alt1=7;
                }
                break;
            case 16:
                {
                alt1=8;
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
                    // InternalLegoLang.g:1483:2: ( ruleWhileLoop )
                    {
                    // InternalLegoLang.g:1483:2: ( ruleWhileLoop )
                    // InternalLegoLang.g:1484:3: ruleWhileLoop
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
                    // InternalLegoLang.g:1489:2: ( ruleVariable )
                    {
                    // InternalLegoLang.g:1489:2: ( ruleVariable )
                    // InternalLegoLang.g:1490:3: ruleVariable
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
                    // InternalLegoLang.g:1495:2: ( ruleExpression )
                    {
                    // InternalLegoLang.g:1495:2: ( ruleExpression )
                    // InternalLegoLang.g:1496:3: ruleExpression
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
                    // InternalLegoLang.g:1501:2: ( ruleConditionEtat )
                    {
                    // InternalLegoLang.g:1501:2: ( ruleConditionEtat )
                    // InternalLegoLang.g:1502:3: ruleConditionEtat
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
                    // InternalLegoLang.g:1507:2: ( ruleMethodePrint )
                    {
                    // InternalLegoLang.g:1507:2: ( ruleMethodePrint )
                    // InternalLegoLang.g:1508:3: ruleMethodePrint
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
                case 6 :
                    // InternalLegoLang.g:1513:2: ( ruleCar )
                    {
                    // InternalLegoLang.g:1513:2: ( ruleCar )
                    // InternalLegoLang.g:1514:3: ruleCar
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getCarParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleCar();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getCarParserRuleCall_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalLegoLang.g:1519:2: ( ruleSensor )
                    {
                    // InternalLegoLang.g:1519:2: ( ruleSensor )
                    // InternalLegoLang.g:1520:3: ruleSensor
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getSensorParserRuleCall_6()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleSensor();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getSensorParserRuleCall_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalLegoLang.g:1525:2: ( ruleEngine )
                    {
                    // InternalLegoLang.g:1525:2: ( ruleEngine )
                    // InternalLegoLang.g:1526:3: ruleEngine
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getEngineParserRuleCall_7()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleEngine();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getEngineParserRuleCall_7()); 
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
    // InternalLegoLang.g:1535:1: rule__Expression__Alternatives : ( ( ruleVariableRef ) | ( ruleBinaryOperation ) | ( ruleTheString ) | ( ruleTheDouble ) | ( ruleTheInt ) | ( ruleTheBoolean ) | ( ruleEngineOperation ) | ( ruleSensorOperation ) | ( ruleBooleanExpression ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1539:1: ( ( ruleVariableRef ) | ( ruleBinaryOperation ) | ( ruleTheString ) | ( ruleTheDouble ) | ( ruleTheInt ) | ( ruleTheBoolean ) | ( ruleEngineOperation ) | ( ruleSensorOperation ) | ( ruleBooleanExpression ) )
            int alt2=9;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalLegoLang.g:1540:2: ( ruleVariableRef )
                    {
                    // InternalLegoLang.g:1540:2: ( ruleVariableRef )
                    // InternalLegoLang.g:1541:3: ruleVariableRef
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
                    // InternalLegoLang.g:1546:2: ( ruleBinaryOperation )
                    {
                    // InternalLegoLang.g:1546:2: ( ruleBinaryOperation )
                    // InternalLegoLang.g:1547:3: ruleBinaryOperation
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
                    // InternalLegoLang.g:1552:2: ( ruleTheString )
                    {
                    // InternalLegoLang.g:1552:2: ( ruleTheString )
                    // InternalLegoLang.g:1553:3: ruleTheString
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
                    // InternalLegoLang.g:1558:2: ( ruleTheDouble )
                    {
                    // InternalLegoLang.g:1558:2: ( ruleTheDouble )
                    // InternalLegoLang.g:1559:3: ruleTheDouble
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
                    // InternalLegoLang.g:1564:2: ( ruleTheInt )
                    {
                    // InternalLegoLang.g:1564:2: ( ruleTheInt )
                    // InternalLegoLang.g:1565:3: ruleTheInt
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
                    // InternalLegoLang.g:1570:2: ( ruleTheBoolean )
                    {
                    // InternalLegoLang.g:1570:2: ( ruleTheBoolean )
                    // InternalLegoLang.g:1571:3: ruleTheBoolean
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
                case 7 :
                    // InternalLegoLang.g:1576:2: ( ruleEngineOperation )
                    {
                    // InternalLegoLang.g:1576:2: ( ruleEngineOperation )
                    // InternalLegoLang.g:1577:3: ruleEngineOperation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getEngineOperationParserRuleCall_6()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleEngineOperation();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getEngineOperationParserRuleCall_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalLegoLang.g:1582:2: ( ruleSensorOperation )
                    {
                    // InternalLegoLang.g:1582:2: ( ruleSensorOperation )
                    // InternalLegoLang.g:1583:3: ruleSensorOperation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getSensorOperationParserRuleCall_7()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleSensorOperation();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getSensorOperationParserRuleCall_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalLegoLang.g:1588:2: ( ruleBooleanExpression )
                    {
                    // InternalLegoLang.g:1588:2: ( ruleBooleanExpression )
                    // InternalLegoLang.g:1589:3: ruleBooleanExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getBooleanExpressionParserRuleCall_8()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBooleanExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getBooleanExpressionParserRuleCall_8()); 
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
    // InternalLegoLang.g:1598:1: rule__BinaryOperation__Alternatives : ( ( ruleSubstraction ) | ( ruleComparaison ) | ( ruleAssignement ) | ( ruleDivision ) | ( ruleMultiplication ) | ( ruleAddition ) | ( ruleMinusEqual ) | ( rulePlusEqual ) );
    public final void rule__BinaryOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1602:1: ( ( ruleSubstraction ) | ( ruleComparaison ) | ( ruleAssignement ) | ( ruleDivision ) | ( ruleMultiplication ) | ( ruleAddition ) | ( ruleMinusEqual ) | ( rulePlusEqual ) )
            int alt3=8;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalLegoLang.g:1603:2: ( ruleSubstraction )
                    {
                    // InternalLegoLang.g:1603:2: ( ruleSubstraction )
                    // InternalLegoLang.g:1604:3: ruleSubstraction
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
                    // InternalLegoLang.g:1609:2: ( ruleComparaison )
                    {
                    // InternalLegoLang.g:1609:2: ( ruleComparaison )
                    // InternalLegoLang.g:1610:3: ruleComparaison
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
                    // InternalLegoLang.g:1615:2: ( ruleAssignement )
                    {
                    // InternalLegoLang.g:1615:2: ( ruleAssignement )
                    // InternalLegoLang.g:1616:3: ruleAssignement
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
                    // InternalLegoLang.g:1621:2: ( ruleDivision )
                    {
                    // InternalLegoLang.g:1621:2: ( ruleDivision )
                    // InternalLegoLang.g:1622:3: ruleDivision
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
                    // InternalLegoLang.g:1627:2: ( ruleMultiplication )
                    {
                    // InternalLegoLang.g:1627:2: ( ruleMultiplication )
                    // InternalLegoLang.g:1628:3: ruleMultiplication
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
                    // InternalLegoLang.g:1633:2: ( ruleAddition )
                    {
                    // InternalLegoLang.g:1633:2: ( ruleAddition )
                    // InternalLegoLang.g:1634:3: ruleAddition
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
                    // InternalLegoLang.g:1639:2: ( ruleMinusEqual )
                    {
                    // InternalLegoLang.g:1639:2: ( ruleMinusEqual )
                    // InternalLegoLang.g:1640:3: ruleMinusEqual
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
                    // InternalLegoLang.g:1645:2: ( rulePlusEqual )
                    {
                    // InternalLegoLang.g:1645:2: ( rulePlusEqual )
                    // InternalLegoLang.g:1646:3: rulePlusEqual
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
    // InternalLegoLang.g:1655:1: rule__Variable__Alternatives : ( ( ruleUnInteger ) | ( ruleUnString ) | ( ruleUnBoolean ) | ( ruleUnDouble ) );
    public final void rule__Variable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1659:1: ( ( ruleUnInteger ) | ( ruleUnString ) | ( ruleUnBoolean ) | ( ruleUnDouble ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 62:
                {
                switch ( input.LA(2) ) {
                case 56:
                    {
                    alt4=1;
                    }
                    break;
                case 61:
                    {
                    alt4=2;
                    }
                    break;
                case 58:
                    {
                    alt4=4;
                    }
                    break;
                case 60:
                    {
                    alt4=3;
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
            case 56:
                {
                alt4=1;
                }
                break;
            case 61:
                {
                alt4=2;
                }
                break;
            case 60:
                {
                alt4=3;
                }
                break;
            case 58:
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
                    // InternalLegoLang.g:1660:2: ( ruleUnInteger )
                    {
                    // InternalLegoLang.g:1660:2: ( ruleUnInteger )
                    // InternalLegoLang.g:1661:3: ruleUnInteger
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
                    // InternalLegoLang.g:1666:2: ( ruleUnString )
                    {
                    // InternalLegoLang.g:1666:2: ( ruleUnString )
                    // InternalLegoLang.g:1667:3: ruleUnString
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
                    // InternalLegoLang.g:1672:2: ( ruleUnBoolean )
                    {
                    // InternalLegoLang.g:1672:2: ( ruleUnBoolean )
                    // InternalLegoLang.g:1673:3: ruleUnBoolean
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
                    // InternalLegoLang.g:1678:2: ( ruleUnDouble )
                    {
                    // InternalLegoLang.g:1678:2: ( ruleUnDouble )
                    // InternalLegoLang.g:1679:3: ruleUnDouble
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
    // InternalLegoLang.g:1688:1: rule__Comparaison__Alternatives : ( ( ruleGT ) | ( ruleEqual ) | ( ruleLT ) | ( ruleDifferent ) | ( ruleGTorEqual ) | ( ruleLTorEqual ) );
    public final void rule__Comparaison__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1692:1: ( ( ruleGT ) | ( ruleEqual ) | ( ruleLT ) | ( ruleDifferent ) | ( ruleGTorEqual ) | ( ruleLTorEqual ) )
            int alt5=6;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==25) ) {
                int LA5_1 = input.LA(2);

                if ( (synpred26_InternalLegoLang()) ) {
                    alt5=1;
                }
                else if ( (synpred27_InternalLegoLang()) ) {
                    alt5=2;
                }
                else if ( (synpred28_InternalLegoLang()) ) {
                    alt5=3;
                }
                else if ( (synpred29_InternalLegoLang()) ) {
                    alt5=4;
                }
                else if ( (synpred30_InternalLegoLang()) ) {
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
                    // InternalLegoLang.g:1693:2: ( ruleGT )
                    {
                    // InternalLegoLang.g:1693:2: ( ruleGT )
                    // InternalLegoLang.g:1694:3: ruleGT
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
                    // InternalLegoLang.g:1699:2: ( ruleEqual )
                    {
                    // InternalLegoLang.g:1699:2: ( ruleEqual )
                    // InternalLegoLang.g:1700:3: ruleEqual
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
                    // InternalLegoLang.g:1705:2: ( ruleLT )
                    {
                    // InternalLegoLang.g:1705:2: ( ruleLT )
                    // InternalLegoLang.g:1706:3: ruleLT
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
                    // InternalLegoLang.g:1711:2: ( ruleDifferent )
                    {
                    // InternalLegoLang.g:1711:2: ( ruleDifferent )
                    // InternalLegoLang.g:1712:3: ruleDifferent
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
                    // InternalLegoLang.g:1717:2: ( ruleGTorEqual )
                    {
                    // InternalLegoLang.g:1717:2: ( ruleGTorEqual )
                    // InternalLegoLang.g:1718:3: ruleGTorEqual
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
                    // InternalLegoLang.g:1723:2: ( ruleLTorEqual )
                    {
                    // InternalLegoLang.g:1723:2: ( ruleLTorEqual )
                    // InternalLegoLang.g:1724:3: ruleLTorEqual
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


    // $ANTLR start "rule__Sensor__Alternatives"
    // InternalLegoLang.g:1733:1: rule__Sensor__Alternatives : ( ( ruleLaserSensor ) | ( ruleColorSensor ) | ( ruleUltraSonicSensor ) | ( ruleGyroSensor ) | ( ruleGPSSensor ) );
    public final void rule__Sensor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1737:1: ( ( ruleLaserSensor ) | ( ruleColorSensor ) | ( ruleUltraSonicSensor ) | ( ruleGyroSensor ) | ( ruleGPSSensor ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt6=1;
                }
                break;
            case 17:
                {
                alt6=2;
                }
                break;
            case 21:
                {
                alt6=3;
                }
                break;
            case 20:
                {
                alt6=4;
                }
                break;
            case 19:
                {
                alt6=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalLegoLang.g:1738:2: ( ruleLaserSensor )
                    {
                    // InternalLegoLang.g:1738:2: ( ruleLaserSensor )
                    // InternalLegoLang.g:1739:3: ruleLaserSensor
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSensorAccess().getLaserSensorParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleLaserSensor();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSensorAccess().getLaserSensorParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalLegoLang.g:1744:2: ( ruleColorSensor )
                    {
                    // InternalLegoLang.g:1744:2: ( ruleColorSensor )
                    // InternalLegoLang.g:1745:3: ruleColorSensor
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSensorAccess().getColorSensorParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleColorSensor();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSensorAccess().getColorSensorParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalLegoLang.g:1750:2: ( ruleUltraSonicSensor )
                    {
                    // InternalLegoLang.g:1750:2: ( ruleUltraSonicSensor )
                    // InternalLegoLang.g:1751:3: ruleUltraSonicSensor
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSensorAccess().getUltraSonicSensorParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleUltraSonicSensor();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSensorAccess().getUltraSonicSensorParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalLegoLang.g:1756:2: ( ruleGyroSensor )
                    {
                    // InternalLegoLang.g:1756:2: ( ruleGyroSensor )
                    // InternalLegoLang.g:1757:3: ruleGyroSensor
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSensorAccess().getGyroSensorParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleGyroSensor();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSensorAccess().getGyroSensorParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalLegoLang.g:1762:2: ( ruleGPSSensor )
                    {
                    // InternalLegoLang.g:1762:2: ( ruleGPSSensor )
                    // InternalLegoLang.g:1763:3: ruleGPSSensor
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSensorAccess().getGPSSensorParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleGPSSensor();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSensorAccess().getGPSSensorParserRuleCall_4()); 
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
    // $ANTLR end "rule__Sensor__Alternatives"


    // $ANTLR start "rule__SensorOperation__Alternatives"
    // InternalLegoLang.g:1772:1: rule__SensorOperation__Alternatives : ( ( ruleRangeOperation ) | ( ruleColorOperation ) | ( ruleIntensityOperation ) | ( ruleXGPSOperation ) | ( ruleYGPSOperation ) | ( ruleAngleOperation ) | ( ruleDistanceOperation ) );
    public final void rule__SensorOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1776:1: ( ( ruleRangeOperation ) | ( ruleColorOperation ) | ( ruleIntensityOperation ) | ( ruleXGPSOperation ) | ( ruleYGPSOperation ) | ( ruleAngleOperation ) | ( ruleDistanceOperation ) )
            int alt7=7;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==28) ) {
                switch ( input.LA(2) ) {
                case 30:
                    {
                    alt7=3;
                    }
                    break;
                case 29:
                    {
                    alt7=2;
                    }
                    break;
                case 35:
                    {
                    alt7=7;
                    }
                    break;
                case 34:
                    {
                    alt7=6;
                    }
                    break;
                case 31:
                    {
                    alt7=1;
                    }
                    break;
                case 33:
                    {
                    alt7=5;
                    }
                    break;
                case 32:
                    {
                    alt7=4;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalLegoLang.g:1777:2: ( ruleRangeOperation )
                    {
                    // InternalLegoLang.g:1777:2: ( ruleRangeOperation )
                    // InternalLegoLang.g:1778:3: ruleRangeOperation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSensorOperationAccess().getRangeOperationParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleRangeOperation();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSensorOperationAccess().getRangeOperationParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalLegoLang.g:1783:2: ( ruleColorOperation )
                    {
                    // InternalLegoLang.g:1783:2: ( ruleColorOperation )
                    // InternalLegoLang.g:1784:3: ruleColorOperation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSensorOperationAccess().getColorOperationParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleColorOperation();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSensorOperationAccess().getColorOperationParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalLegoLang.g:1789:2: ( ruleIntensityOperation )
                    {
                    // InternalLegoLang.g:1789:2: ( ruleIntensityOperation )
                    // InternalLegoLang.g:1790:3: ruleIntensityOperation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSensorOperationAccess().getIntensityOperationParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleIntensityOperation();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSensorOperationAccess().getIntensityOperationParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalLegoLang.g:1795:2: ( ruleXGPSOperation )
                    {
                    // InternalLegoLang.g:1795:2: ( ruleXGPSOperation )
                    // InternalLegoLang.g:1796:3: ruleXGPSOperation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSensorOperationAccess().getXGPSOperationParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleXGPSOperation();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSensorOperationAccess().getXGPSOperationParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalLegoLang.g:1801:2: ( ruleYGPSOperation )
                    {
                    // InternalLegoLang.g:1801:2: ( ruleYGPSOperation )
                    // InternalLegoLang.g:1802:3: ruleYGPSOperation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSensorOperationAccess().getYGPSOperationParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleYGPSOperation();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSensorOperationAccess().getYGPSOperationParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalLegoLang.g:1807:2: ( ruleAngleOperation )
                    {
                    // InternalLegoLang.g:1807:2: ( ruleAngleOperation )
                    // InternalLegoLang.g:1808:3: ruleAngleOperation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSensorOperationAccess().getAngleOperationParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleAngleOperation();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSensorOperationAccess().getAngleOperationParserRuleCall_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalLegoLang.g:1813:2: ( ruleDistanceOperation )
                    {
                    // InternalLegoLang.g:1813:2: ( ruleDistanceOperation )
                    // InternalLegoLang.g:1814:3: ruleDistanceOperation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSensorOperationAccess().getDistanceOperationParserRuleCall_6()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleDistanceOperation();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSensorOperationAccess().getDistanceOperationParserRuleCall_6()); 
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
    // $ANTLR end "rule__SensorOperation__Alternatives"


    // $ANTLR start "rule__BooleanExpression__Alternatives"
    // InternalLegoLang.g:1823:1: rule__BooleanExpression__Alternatives : ( ( ruleAnd ) | ( ruleOr ) );
    public final void rule__BooleanExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1827:1: ( ( ruleAnd ) | ( ruleOr ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                int LA8_1 = input.LA(2);

                if ( (synpred41_InternalLegoLang()) ) {
                    alt8=1;
                }
                else if ( (true) ) {
                    alt8=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalLegoLang.g:1828:2: ( ruleAnd )
                    {
                    // InternalLegoLang.g:1828:2: ( ruleAnd )
                    // InternalLegoLang.g:1829:3: ruleAnd
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanExpressionAccess().getAndParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleAnd();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanExpressionAccess().getAndParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalLegoLang.g:1834:2: ( ruleOr )
                    {
                    // InternalLegoLang.g:1834:2: ( ruleOr )
                    // InternalLegoLang.g:1835:3: ruleOr
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanExpressionAccess().getOrParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleOr();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanExpressionAccess().getOrParserRuleCall_1()); 
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
    // $ANTLR end "rule__BooleanExpression__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalLegoLang.g:1844:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1848:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalLegoLang.g:1849:2: ( RULE_STRING )
                    {
                    // InternalLegoLang.g:1849:2: ( RULE_STRING )
                    // InternalLegoLang.g:1850:3: RULE_STRING
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
                    // InternalLegoLang.g:1855:2: ( RULE_ID )
                    {
                    // InternalLegoLang.g:1855:2: ( RULE_ID )
                    // InternalLegoLang.g:1856:3: RULE_ID
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
    // InternalLegoLang.g:1865:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1869:1: ( ( 'true' ) | ( 'false' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==11) ) {
                alt10=1;
            }
            else if ( (LA10_0==12) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalLegoLang.g:1870:2: ( 'true' )
                    {
                    // InternalLegoLang.g:1870:2: ( 'true' )
                    // InternalLegoLang.g:1871:3: 'true'
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
                    // InternalLegoLang.g:1876:2: ( 'false' )
                    {
                    // InternalLegoLang.g:1876:2: ( 'false' )
                    // InternalLegoLang.g:1877:3: 'false'
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
    // InternalLegoLang.g:1886:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1890:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalLegoLang.g:1891:2: rule__Program__Group__0__Impl rule__Program__Group__1
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
    // InternalLegoLang.g:1898:1: rule__Program__Group__0__Impl : ( () ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1902:1: ( ( () ) )
            // InternalLegoLang.g:1903:1: ( () )
            {
            // InternalLegoLang.g:1903:1: ( () )
            // InternalLegoLang.g:1904:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getProgramAction_0()); 
            }
            // InternalLegoLang.g:1905:2: ()
            // InternalLegoLang.g:1905:3: 
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
    // InternalLegoLang.g:1913:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1917:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // InternalLegoLang.g:1918:2: rule__Program__Group__1__Impl rule__Program__Group__2
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
    // InternalLegoLang.g:1925:1: rule__Program__Group__1__Impl : ( 'Program' ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1929:1: ( ( 'Program' ) )
            // InternalLegoLang.g:1930:1: ( 'Program' )
            {
            // InternalLegoLang.g:1930:1: ( 'Program' )
            // InternalLegoLang.g:1931:2: 'Program'
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
    // InternalLegoLang.g:1940:1: rule__Program__Group__2 : rule__Program__Group__2__Impl rule__Program__Group__3 ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1944:1: ( rule__Program__Group__2__Impl rule__Program__Group__3 )
            // InternalLegoLang.g:1945:2: rule__Program__Group__2__Impl rule__Program__Group__3
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
    // InternalLegoLang.g:1952:1: rule__Program__Group__2__Impl : ( ( rule__Program__NameAssignment_2 ) ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1956:1: ( ( ( rule__Program__NameAssignment_2 ) ) )
            // InternalLegoLang.g:1957:1: ( ( rule__Program__NameAssignment_2 ) )
            {
            // InternalLegoLang.g:1957:1: ( ( rule__Program__NameAssignment_2 ) )
            // InternalLegoLang.g:1958:2: ( rule__Program__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getNameAssignment_2()); 
            }
            // InternalLegoLang.g:1959:2: ( rule__Program__NameAssignment_2 )
            // InternalLegoLang.g:1959:3: rule__Program__NameAssignment_2
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
    // InternalLegoLang.g:1967:1: rule__Program__Group__3 : rule__Program__Group__3__Impl rule__Program__Group__4 ;
    public final void rule__Program__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1971:1: ( rule__Program__Group__3__Impl rule__Program__Group__4 )
            // InternalLegoLang.g:1972:2: rule__Program__Group__3__Impl rule__Program__Group__4
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
    // InternalLegoLang.g:1979:1: rule__Program__Group__3__Impl : ( '{' ) ;
    public final void rule__Program__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1983:1: ( ( '{' ) )
            // InternalLegoLang.g:1984:1: ( '{' )
            {
            // InternalLegoLang.g:1984:1: ( '{' )
            // InternalLegoLang.g:1985:2: '{'
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
    // InternalLegoLang.g:1994:1: rule__Program__Group__4 : rule__Program__Group__4__Impl rule__Program__Group__5 ;
    public final void rule__Program__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1998:1: ( rule__Program__Group__4__Impl rule__Program__Group__5 )
            // InternalLegoLang.g:1999:2: rule__Program__Group__4__Impl rule__Program__Group__5
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
    // InternalLegoLang.g:2006:1: rule__Program__Group__4__Impl : ( ( rule__Program__StatementAssignment_4 )* ) ;
    public final void rule__Program__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2010:1: ( ( ( rule__Program__StatementAssignment_4 )* ) )
            // InternalLegoLang.g:2011:1: ( ( rule__Program__StatementAssignment_4 )* )
            {
            // InternalLegoLang.g:2011:1: ( ( rule__Program__StatementAssignment_4 )* )
            // InternalLegoLang.g:2012:2: ( rule__Program__StatementAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getStatementAssignment_4()); 
            }
            // InternalLegoLang.g:2013:2: ( rule__Program__StatementAssignment_4 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_STRING && LA11_0<=RULE_INT)||(LA11_0>=11 && LA11_0<=12)||(LA11_0>=16 && LA11_0<=23)||LA11_0==25||LA11_0==28||LA11_0==38||(LA11_0>=40 && LA11_0<=41)||LA11_0==44||LA11_0==56||LA11_0==58||(LA11_0>=60 && LA11_0<=62)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalLegoLang.g:2013:3: rule__Program__StatementAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Program__StatementAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalLegoLang.g:2021:1: rule__Program__Group__5 : rule__Program__Group__5__Impl ;
    public final void rule__Program__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2025:1: ( rule__Program__Group__5__Impl )
            // InternalLegoLang.g:2026:2: rule__Program__Group__5__Impl
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
    // InternalLegoLang.g:2032:1: rule__Program__Group__5__Impl : ( '}' ) ;
    public final void rule__Program__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2036:1: ( ( '}' ) )
            // InternalLegoLang.g:2037:1: ( '}' )
            {
            // InternalLegoLang.g:2037:1: ( '}' )
            // InternalLegoLang.g:2038:2: '}'
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


    // $ANTLR start "rule__WheelEngine__Group__0"
    // InternalLegoLang.g:2048:1: rule__WheelEngine__Group__0 : rule__WheelEngine__Group__0__Impl rule__WheelEngine__Group__1 ;
    public final void rule__WheelEngine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2052:1: ( rule__WheelEngine__Group__0__Impl rule__WheelEngine__Group__1 )
            // InternalLegoLang.g:2053:2: rule__WheelEngine__Group__0__Impl rule__WheelEngine__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__WheelEngine__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WheelEngine__Group__1();

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
    // $ANTLR end "rule__WheelEngine__Group__0"


    // $ANTLR start "rule__WheelEngine__Group__0__Impl"
    // InternalLegoLang.g:2060:1: rule__WheelEngine__Group__0__Impl : ( 'WheelEngine' ) ;
    public final void rule__WheelEngine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2064:1: ( ( 'WheelEngine' ) )
            // InternalLegoLang.g:2065:1: ( 'WheelEngine' )
            {
            // InternalLegoLang.g:2065:1: ( 'WheelEngine' )
            // InternalLegoLang.g:2066:2: 'WheelEngine'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWheelEngineAccess().getWheelEngineKeyword_0()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWheelEngineAccess().getWheelEngineKeyword_0()); 
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
    // $ANTLR end "rule__WheelEngine__Group__0__Impl"


    // $ANTLR start "rule__WheelEngine__Group__1"
    // InternalLegoLang.g:2075:1: rule__WheelEngine__Group__1 : rule__WheelEngine__Group__1__Impl rule__WheelEngine__Group__2 ;
    public final void rule__WheelEngine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2079:1: ( rule__WheelEngine__Group__1__Impl rule__WheelEngine__Group__2 )
            // InternalLegoLang.g:2080:2: rule__WheelEngine__Group__1__Impl rule__WheelEngine__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__WheelEngine__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WheelEngine__Group__2();

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
    // $ANTLR end "rule__WheelEngine__Group__1"


    // $ANTLR start "rule__WheelEngine__Group__1__Impl"
    // InternalLegoLang.g:2087:1: rule__WheelEngine__Group__1__Impl : ( ( rule__WheelEngine__NameAssignment_1 ) ) ;
    public final void rule__WheelEngine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2091:1: ( ( ( rule__WheelEngine__NameAssignment_1 ) ) )
            // InternalLegoLang.g:2092:1: ( ( rule__WheelEngine__NameAssignment_1 ) )
            {
            // InternalLegoLang.g:2092:1: ( ( rule__WheelEngine__NameAssignment_1 ) )
            // InternalLegoLang.g:2093:2: ( rule__WheelEngine__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWheelEngineAccess().getNameAssignment_1()); 
            }
            // InternalLegoLang.g:2094:2: ( rule__WheelEngine__NameAssignment_1 )
            // InternalLegoLang.g:2094:3: rule__WheelEngine__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__WheelEngine__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWheelEngineAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__WheelEngine__Group__1__Impl"


    // $ANTLR start "rule__WheelEngine__Group__2"
    // InternalLegoLang.g:2102:1: rule__WheelEngine__Group__2 : rule__WheelEngine__Group__2__Impl ;
    public final void rule__WheelEngine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2106:1: ( rule__WheelEngine__Group__2__Impl )
            // InternalLegoLang.g:2107:2: rule__WheelEngine__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WheelEngine__Group__2__Impl();

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
    // $ANTLR end "rule__WheelEngine__Group__2"


    // $ANTLR start "rule__WheelEngine__Group__2__Impl"
    // InternalLegoLang.g:2113:1: rule__WheelEngine__Group__2__Impl : ( ( rule__WheelEngine__PositionAssignment_2 ) ) ;
    public final void rule__WheelEngine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2117:1: ( ( ( rule__WheelEngine__PositionAssignment_2 ) ) )
            // InternalLegoLang.g:2118:1: ( ( rule__WheelEngine__PositionAssignment_2 ) )
            {
            // InternalLegoLang.g:2118:1: ( ( rule__WheelEngine__PositionAssignment_2 ) )
            // InternalLegoLang.g:2119:2: ( rule__WheelEngine__PositionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWheelEngineAccess().getPositionAssignment_2()); 
            }
            // InternalLegoLang.g:2120:2: ( rule__WheelEngine__PositionAssignment_2 )
            // InternalLegoLang.g:2120:3: rule__WheelEngine__PositionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__WheelEngine__PositionAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWheelEngineAccess().getPositionAssignment_2()); 
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
    // $ANTLR end "rule__WheelEngine__Group__2__Impl"


    // $ANTLR start "rule__ColorSensor__Group__0"
    // InternalLegoLang.g:2129:1: rule__ColorSensor__Group__0 : rule__ColorSensor__Group__0__Impl rule__ColorSensor__Group__1 ;
    public final void rule__ColorSensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2133:1: ( rule__ColorSensor__Group__0__Impl rule__ColorSensor__Group__1 )
            // InternalLegoLang.g:2134:2: rule__ColorSensor__Group__0__Impl rule__ColorSensor__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ColorSensor__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ColorSensor__Group__1();

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
    // $ANTLR end "rule__ColorSensor__Group__0"


    // $ANTLR start "rule__ColorSensor__Group__0__Impl"
    // InternalLegoLang.g:2141:1: rule__ColorSensor__Group__0__Impl : ( 'ColorSensor' ) ;
    public final void rule__ColorSensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2145:1: ( ( 'ColorSensor' ) )
            // InternalLegoLang.g:2146:1: ( 'ColorSensor' )
            {
            // InternalLegoLang.g:2146:1: ( 'ColorSensor' )
            // InternalLegoLang.g:2147:2: 'ColorSensor'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorSensorAccess().getColorSensorKeyword_0()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getColorSensorAccess().getColorSensorKeyword_0()); 
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
    // $ANTLR end "rule__ColorSensor__Group__0__Impl"


    // $ANTLR start "rule__ColorSensor__Group__1"
    // InternalLegoLang.g:2156:1: rule__ColorSensor__Group__1 : rule__ColorSensor__Group__1__Impl rule__ColorSensor__Group__2 ;
    public final void rule__ColorSensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2160:1: ( rule__ColorSensor__Group__1__Impl rule__ColorSensor__Group__2 )
            // InternalLegoLang.g:2161:2: rule__ColorSensor__Group__1__Impl rule__ColorSensor__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__ColorSensor__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ColorSensor__Group__2();

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
    // $ANTLR end "rule__ColorSensor__Group__1"


    // $ANTLR start "rule__ColorSensor__Group__1__Impl"
    // InternalLegoLang.g:2168:1: rule__ColorSensor__Group__1__Impl : ( ( rule__ColorSensor__NameAssignment_1 ) ) ;
    public final void rule__ColorSensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2172:1: ( ( ( rule__ColorSensor__NameAssignment_1 ) ) )
            // InternalLegoLang.g:2173:1: ( ( rule__ColorSensor__NameAssignment_1 ) )
            {
            // InternalLegoLang.g:2173:1: ( ( rule__ColorSensor__NameAssignment_1 ) )
            // InternalLegoLang.g:2174:2: ( rule__ColorSensor__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorSensorAccess().getNameAssignment_1()); 
            }
            // InternalLegoLang.g:2175:2: ( rule__ColorSensor__NameAssignment_1 )
            // InternalLegoLang.g:2175:3: rule__ColorSensor__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ColorSensor__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getColorSensorAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__ColorSensor__Group__1__Impl"


    // $ANTLR start "rule__ColorSensor__Group__2"
    // InternalLegoLang.g:2183:1: rule__ColorSensor__Group__2 : rule__ColorSensor__Group__2__Impl ;
    public final void rule__ColorSensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2187:1: ( rule__ColorSensor__Group__2__Impl )
            // InternalLegoLang.g:2188:2: rule__ColorSensor__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ColorSensor__Group__2__Impl();

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
    // $ANTLR end "rule__ColorSensor__Group__2"


    // $ANTLR start "rule__ColorSensor__Group__2__Impl"
    // InternalLegoLang.g:2194:1: rule__ColorSensor__Group__2__Impl : ( ( rule__ColorSensor__PositionAssignment_2 ) ) ;
    public final void rule__ColorSensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2198:1: ( ( ( rule__ColorSensor__PositionAssignment_2 ) ) )
            // InternalLegoLang.g:2199:1: ( ( rule__ColorSensor__PositionAssignment_2 ) )
            {
            // InternalLegoLang.g:2199:1: ( ( rule__ColorSensor__PositionAssignment_2 ) )
            // InternalLegoLang.g:2200:2: ( rule__ColorSensor__PositionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorSensorAccess().getPositionAssignment_2()); 
            }
            // InternalLegoLang.g:2201:2: ( rule__ColorSensor__PositionAssignment_2 )
            // InternalLegoLang.g:2201:3: rule__ColorSensor__PositionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ColorSensor__PositionAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getColorSensorAccess().getPositionAssignment_2()); 
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
    // $ANTLR end "rule__ColorSensor__Group__2__Impl"


    // $ANTLR start "rule__LaserSensor__Group__0"
    // InternalLegoLang.g:2210:1: rule__LaserSensor__Group__0 : rule__LaserSensor__Group__0__Impl rule__LaserSensor__Group__1 ;
    public final void rule__LaserSensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2214:1: ( rule__LaserSensor__Group__0__Impl rule__LaserSensor__Group__1 )
            // InternalLegoLang.g:2215:2: rule__LaserSensor__Group__0__Impl rule__LaserSensor__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__LaserSensor__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LaserSensor__Group__1();

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
    // $ANTLR end "rule__LaserSensor__Group__0"


    // $ANTLR start "rule__LaserSensor__Group__0__Impl"
    // InternalLegoLang.g:2222:1: rule__LaserSensor__Group__0__Impl : ( 'LaserSensor' ) ;
    public final void rule__LaserSensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2226:1: ( ( 'LaserSensor' ) )
            // InternalLegoLang.g:2227:1: ( 'LaserSensor' )
            {
            // InternalLegoLang.g:2227:1: ( 'LaserSensor' )
            // InternalLegoLang.g:2228:2: 'LaserSensor'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLaserSensorAccess().getLaserSensorKeyword_0()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLaserSensorAccess().getLaserSensorKeyword_0()); 
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
    // $ANTLR end "rule__LaserSensor__Group__0__Impl"


    // $ANTLR start "rule__LaserSensor__Group__1"
    // InternalLegoLang.g:2237:1: rule__LaserSensor__Group__1 : rule__LaserSensor__Group__1__Impl rule__LaserSensor__Group__2 ;
    public final void rule__LaserSensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2241:1: ( rule__LaserSensor__Group__1__Impl rule__LaserSensor__Group__2 )
            // InternalLegoLang.g:2242:2: rule__LaserSensor__Group__1__Impl rule__LaserSensor__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__LaserSensor__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LaserSensor__Group__2();

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
    // $ANTLR end "rule__LaserSensor__Group__1"


    // $ANTLR start "rule__LaserSensor__Group__1__Impl"
    // InternalLegoLang.g:2249:1: rule__LaserSensor__Group__1__Impl : ( ( rule__LaserSensor__NameAssignment_1 ) ) ;
    public final void rule__LaserSensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2253:1: ( ( ( rule__LaserSensor__NameAssignment_1 ) ) )
            // InternalLegoLang.g:2254:1: ( ( rule__LaserSensor__NameAssignment_1 ) )
            {
            // InternalLegoLang.g:2254:1: ( ( rule__LaserSensor__NameAssignment_1 ) )
            // InternalLegoLang.g:2255:2: ( rule__LaserSensor__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLaserSensorAccess().getNameAssignment_1()); 
            }
            // InternalLegoLang.g:2256:2: ( rule__LaserSensor__NameAssignment_1 )
            // InternalLegoLang.g:2256:3: rule__LaserSensor__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LaserSensor__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLaserSensorAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__LaserSensor__Group__1__Impl"


    // $ANTLR start "rule__LaserSensor__Group__2"
    // InternalLegoLang.g:2264:1: rule__LaserSensor__Group__2 : rule__LaserSensor__Group__2__Impl ;
    public final void rule__LaserSensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2268:1: ( rule__LaserSensor__Group__2__Impl )
            // InternalLegoLang.g:2269:2: rule__LaserSensor__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LaserSensor__Group__2__Impl();

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
    // $ANTLR end "rule__LaserSensor__Group__2"


    // $ANTLR start "rule__LaserSensor__Group__2__Impl"
    // InternalLegoLang.g:2275:1: rule__LaserSensor__Group__2__Impl : ( ( rule__LaserSensor__PositionAssignment_2 ) ) ;
    public final void rule__LaserSensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2279:1: ( ( ( rule__LaserSensor__PositionAssignment_2 ) ) )
            // InternalLegoLang.g:2280:1: ( ( rule__LaserSensor__PositionAssignment_2 ) )
            {
            // InternalLegoLang.g:2280:1: ( ( rule__LaserSensor__PositionAssignment_2 ) )
            // InternalLegoLang.g:2281:2: ( rule__LaserSensor__PositionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLaserSensorAccess().getPositionAssignment_2()); 
            }
            // InternalLegoLang.g:2282:2: ( rule__LaserSensor__PositionAssignment_2 )
            // InternalLegoLang.g:2282:3: rule__LaserSensor__PositionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LaserSensor__PositionAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLaserSensorAccess().getPositionAssignment_2()); 
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
    // $ANTLR end "rule__LaserSensor__Group__2__Impl"


    // $ANTLR start "rule__GPSSensor__Group__0"
    // InternalLegoLang.g:2291:1: rule__GPSSensor__Group__0 : rule__GPSSensor__Group__0__Impl rule__GPSSensor__Group__1 ;
    public final void rule__GPSSensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2295:1: ( rule__GPSSensor__Group__0__Impl rule__GPSSensor__Group__1 )
            // InternalLegoLang.g:2296:2: rule__GPSSensor__Group__0__Impl rule__GPSSensor__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__GPSSensor__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GPSSensor__Group__1();

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
    // $ANTLR end "rule__GPSSensor__Group__0"


    // $ANTLR start "rule__GPSSensor__Group__0__Impl"
    // InternalLegoLang.g:2303:1: rule__GPSSensor__Group__0__Impl : ( 'GPSSensor' ) ;
    public final void rule__GPSSensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2307:1: ( ( 'GPSSensor' ) )
            // InternalLegoLang.g:2308:1: ( 'GPSSensor' )
            {
            // InternalLegoLang.g:2308:1: ( 'GPSSensor' )
            // InternalLegoLang.g:2309:2: 'GPSSensor'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGPSSensorAccess().getGPSSensorKeyword_0()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGPSSensorAccess().getGPSSensorKeyword_0()); 
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
    // $ANTLR end "rule__GPSSensor__Group__0__Impl"


    // $ANTLR start "rule__GPSSensor__Group__1"
    // InternalLegoLang.g:2318:1: rule__GPSSensor__Group__1 : rule__GPSSensor__Group__1__Impl rule__GPSSensor__Group__2 ;
    public final void rule__GPSSensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2322:1: ( rule__GPSSensor__Group__1__Impl rule__GPSSensor__Group__2 )
            // InternalLegoLang.g:2323:2: rule__GPSSensor__Group__1__Impl rule__GPSSensor__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__GPSSensor__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GPSSensor__Group__2();

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
    // $ANTLR end "rule__GPSSensor__Group__1"


    // $ANTLR start "rule__GPSSensor__Group__1__Impl"
    // InternalLegoLang.g:2330:1: rule__GPSSensor__Group__1__Impl : ( ( rule__GPSSensor__NameAssignment_1 ) ) ;
    public final void rule__GPSSensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2334:1: ( ( ( rule__GPSSensor__NameAssignment_1 ) ) )
            // InternalLegoLang.g:2335:1: ( ( rule__GPSSensor__NameAssignment_1 ) )
            {
            // InternalLegoLang.g:2335:1: ( ( rule__GPSSensor__NameAssignment_1 ) )
            // InternalLegoLang.g:2336:2: ( rule__GPSSensor__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGPSSensorAccess().getNameAssignment_1()); 
            }
            // InternalLegoLang.g:2337:2: ( rule__GPSSensor__NameAssignment_1 )
            // InternalLegoLang.g:2337:3: rule__GPSSensor__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__GPSSensor__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGPSSensorAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__GPSSensor__Group__1__Impl"


    // $ANTLR start "rule__GPSSensor__Group__2"
    // InternalLegoLang.g:2345:1: rule__GPSSensor__Group__2 : rule__GPSSensor__Group__2__Impl ;
    public final void rule__GPSSensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2349:1: ( rule__GPSSensor__Group__2__Impl )
            // InternalLegoLang.g:2350:2: rule__GPSSensor__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GPSSensor__Group__2__Impl();

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
    // $ANTLR end "rule__GPSSensor__Group__2"


    // $ANTLR start "rule__GPSSensor__Group__2__Impl"
    // InternalLegoLang.g:2356:1: rule__GPSSensor__Group__2__Impl : ( ( rule__GPSSensor__PositionAssignment_2 ) ) ;
    public final void rule__GPSSensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2360:1: ( ( ( rule__GPSSensor__PositionAssignment_2 ) ) )
            // InternalLegoLang.g:2361:1: ( ( rule__GPSSensor__PositionAssignment_2 ) )
            {
            // InternalLegoLang.g:2361:1: ( ( rule__GPSSensor__PositionAssignment_2 ) )
            // InternalLegoLang.g:2362:2: ( rule__GPSSensor__PositionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGPSSensorAccess().getPositionAssignment_2()); 
            }
            // InternalLegoLang.g:2363:2: ( rule__GPSSensor__PositionAssignment_2 )
            // InternalLegoLang.g:2363:3: rule__GPSSensor__PositionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GPSSensor__PositionAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGPSSensorAccess().getPositionAssignment_2()); 
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
    // $ANTLR end "rule__GPSSensor__Group__2__Impl"


    // $ANTLR start "rule__GyroSensor__Group__0"
    // InternalLegoLang.g:2372:1: rule__GyroSensor__Group__0 : rule__GyroSensor__Group__0__Impl rule__GyroSensor__Group__1 ;
    public final void rule__GyroSensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2376:1: ( rule__GyroSensor__Group__0__Impl rule__GyroSensor__Group__1 )
            // InternalLegoLang.g:2377:2: rule__GyroSensor__Group__0__Impl rule__GyroSensor__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__GyroSensor__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GyroSensor__Group__1();

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
    // $ANTLR end "rule__GyroSensor__Group__0"


    // $ANTLR start "rule__GyroSensor__Group__0__Impl"
    // InternalLegoLang.g:2384:1: rule__GyroSensor__Group__0__Impl : ( 'GyroSensor' ) ;
    public final void rule__GyroSensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2388:1: ( ( 'GyroSensor' ) )
            // InternalLegoLang.g:2389:1: ( 'GyroSensor' )
            {
            // InternalLegoLang.g:2389:1: ( 'GyroSensor' )
            // InternalLegoLang.g:2390:2: 'GyroSensor'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGyroSensorAccess().getGyroSensorKeyword_0()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGyroSensorAccess().getGyroSensorKeyword_0()); 
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
    // $ANTLR end "rule__GyroSensor__Group__0__Impl"


    // $ANTLR start "rule__GyroSensor__Group__1"
    // InternalLegoLang.g:2399:1: rule__GyroSensor__Group__1 : rule__GyroSensor__Group__1__Impl rule__GyroSensor__Group__2 ;
    public final void rule__GyroSensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2403:1: ( rule__GyroSensor__Group__1__Impl rule__GyroSensor__Group__2 )
            // InternalLegoLang.g:2404:2: rule__GyroSensor__Group__1__Impl rule__GyroSensor__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__GyroSensor__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GyroSensor__Group__2();

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
    // $ANTLR end "rule__GyroSensor__Group__1"


    // $ANTLR start "rule__GyroSensor__Group__1__Impl"
    // InternalLegoLang.g:2411:1: rule__GyroSensor__Group__1__Impl : ( ( rule__GyroSensor__NameAssignment_1 ) ) ;
    public final void rule__GyroSensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2415:1: ( ( ( rule__GyroSensor__NameAssignment_1 ) ) )
            // InternalLegoLang.g:2416:1: ( ( rule__GyroSensor__NameAssignment_1 ) )
            {
            // InternalLegoLang.g:2416:1: ( ( rule__GyroSensor__NameAssignment_1 ) )
            // InternalLegoLang.g:2417:2: ( rule__GyroSensor__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGyroSensorAccess().getNameAssignment_1()); 
            }
            // InternalLegoLang.g:2418:2: ( rule__GyroSensor__NameAssignment_1 )
            // InternalLegoLang.g:2418:3: rule__GyroSensor__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__GyroSensor__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGyroSensorAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__GyroSensor__Group__1__Impl"


    // $ANTLR start "rule__GyroSensor__Group__2"
    // InternalLegoLang.g:2426:1: rule__GyroSensor__Group__2 : rule__GyroSensor__Group__2__Impl ;
    public final void rule__GyroSensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2430:1: ( rule__GyroSensor__Group__2__Impl )
            // InternalLegoLang.g:2431:2: rule__GyroSensor__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GyroSensor__Group__2__Impl();

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
    // $ANTLR end "rule__GyroSensor__Group__2"


    // $ANTLR start "rule__GyroSensor__Group__2__Impl"
    // InternalLegoLang.g:2437:1: rule__GyroSensor__Group__2__Impl : ( ( rule__GyroSensor__PositionAssignment_2 ) ) ;
    public final void rule__GyroSensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2441:1: ( ( ( rule__GyroSensor__PositionAssignment_2 ) ) )
            // InternalLegoLang.g:2442:1: ( ( rule__GyroSensor__PositionAssignment_2 ) )
            {
            // InternalLegoLang.g:2442:1: ( ( rule__GyroSensor__PositionAssignment_2 ) )
            // InternalLegoLang.g:2443:2: ( rule__GyroSensor__PositionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGyroSensorAccess().getPositionAssignment_2()); 
            }
            // InternalLegoLang.g:2444:2: ( rule__GyroSensor__PositionAssignment_2 )
            // InternalLegoLang.g:2444:3: rule__GyroSensor__PositionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GyroSensor__PositionAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGyroSensorAccess().getPositionAssignment_2()); 
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
    // $ANTLR end "rule__GyroSensor__Group__2__Impl"


    // $ANTLR start "rule__UltraSonicSensor__Group__0"
    // InternalLegoLang.g:2453:1: rule__UltraSonicSensor__Group__0 : rule__UltraSonicSensor__Group__0__Impl rule__UltraSonicSensor__Group__1 ;
    public final void rule__UltraSonicSensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2457:1: ( rule__UltraSonicSensor__Group__0__Impl rule__UltraSonicSensor__Group__1 )
            // InternalLegoLang.g:2458:2: rule__UltraSonicSensor__Group__0__Impl rule__UltraSonicSensor__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__UltraSonicSensor__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UltraSonicSensor__Group__1();

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
    // $ANTLR end "rule__UltraSonicSensor__Group__0"


    // $ANTLR start "rule__UltraSonicSensor__Group__0__Impl"
    // InternalLegoLang.g:2465:1: rule__UltraSonicSensor__Group__0__Impl : ( 'UltraSonicSensor' ) ;
    public final void rule__UltraSonicSensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2469:1: ( ( 'UltraSonicSensor' ) )
            // InternalLegoLang.g:2470:1: ( 'UltraSonicSensor' )
            {
            // InternalLegoLang.g:2470:1: ( 'UltraSonicSensor' )
            // InternalLegoLang.g:2471:2: 'UltraSonicSensor'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUltraSonicSensorAccess().getUltraSonicSensorKeyword_0()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUltraSonicSensorAccess().getUltraSonicSensorKeyword_0()); 
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
    // $ANTLR end "rule__UltraSonicSensor__Group__0__Impl"


    // $ANTLR start "rule__UltraSonicSensor__Group__1"
    // InternalLegoLang.g:2480:1: rule__UltraSonicSensor__Group__1 : rule__UltraSonicSensor__Group__1__Impl rule__UltraSonicSensor__Group__2 ;
    public final void rule__UltraSonicSensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2484:1: ( rule__UltraSonicSensor__Group__1__Impl rule__UltraSonicSensor__Group__2 )
            // InternalLegoLang.g:2485:2: rule__UltraSonicSensor__Group__1__Impl rule__UltraSonicSensor__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__UltraSonicSensor__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UltraSonicSensor__Group__2();

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
    // $ANTLR end "rule__UltraSonicSensor__Group__1"


    // $ANTLR start "rule__UltraSonicSensor__Group__1__Impl"
    // InternalLegoLang.g:2492:1: rule__UltraSonicSensor__Group__1__Impl : ( ( rule__UltraSonicSensor__NameAssignment_1 ) ) ;
    public final void rule__UltraSonicSensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2496:1: ( ( ( rule__UltraSonicSensor__NameAssignment_1 ) ) )
            // InternalLegoLang.g:2497:1: ( ( rule__UltraSonicSensor__NameAssignment_1 ) )
            {
            // InternalLegoLang.g:2497:1: ( ( rule__UltraSonicSensor__NameAssignment_1 ) )
            // InternalLegoLang.g:2498:2: ( rule__UltraSonicSensor__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUltraSonicSensorAccess().getNameAssignment_1()); 
            }
            // InternalLegoLang.g:2499:2: ( rule__UltraSonicSensor__NameAssignment_1 )
            // InternalLegoLang.g:2499:3: rule__UltraSonicSensor__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__UltraSonicSensor__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUltraSonicSensorAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__UltraSonicSensor__Group__1__Impl"


    // $ANTLR start "rule__UltraSonicSensor__Group__2"
    // InternalLegoLang.g:2507:1: rule__UltraSonicSensor__Group__2 : rule__UltraSonicSensor__Group__2__Impl ;
    public final void rule__UltraSonicSensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2511:1: ( rule__UltraSonicSensor__Group__2__Impl )
            // InternalLegoLang.g:2512:2: rule__UltraSonicSensor__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UltraSonicSensor__Group__2__Impl();

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
    // $ANTLR end "rule__UltraSonicSensor__Group__2"


    // $ANTLR start "rule__UltraSonicSensor__Group__2__Impl"
    // InternalLegoLang.g:2518:1: rule__UltraSonicSensor__Group__2__Impl : ( ( rule__UltraSonicSensor__PositionAssignment_2 ) ) ;
    public final void rule__UltraSonicSensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2522:1: ( ( ( rule__UltraSonicSensor__PositionAssignment_2 ) ) )
            // InternalLegoLang.g:2523:1: ( ( rule__UltraSonicSensor__PositionAssignment_2 ) )
            {
            // InternalLegoLang.g:2523:1: ( ( rule__UltraSonicSensor__PositionAssignment_2 ) )
            // InternalLegoLang.g:2524:2: ( rule__UltraSonicSensor__PositionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUltraSonicSensorAccess().getPositionAssignment_2()); 
            }
            // InternalLegoLang.g:2525:2: ( rule__UltraSonicSensor__PositionAssignment_2 )
            // InternalLegoLang.g:2525:3: rule__UltraSonicSensor__PositionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__UltraSonicSensor__PositionAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUltraSonicSensorAccess().getPositionAssignment_2()); 
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
    // $ANTLR end "rule__UltraSonicSensor__Group__2__Impl"


    // $ANTLR start "rule__Car__Group__0"
    // InternalLegoLang.g:2534:1: rule__Car__Group__0 : rule__Car__Group__0__Impl rule__Car__Group__1 ;
    public final void rule__Car__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2538:1: ( rule__Car__Group__0__Impl rule__Car__Group__1 )
            // InternalLegoLang.g:2539:2: rule__Car__Group__0__Impl rule__Car__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Car__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Car__Group__1();

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
    // $ANTLR end "rule__Car__Group__0"


    // $ANTLR start "rule__Car__Group__0__Impl"
    // InternalLegoLang.g:2546:1: rule__Car__Group__0__Impl : ( 'Car' ) ;
    public final void rule__Car__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2550:1: ( ( 'Car' ) )
            // InternalLegoLang.g:2551:1: ( 'Car' )
            {
            // InternalLegoLang.g:2551:1: ( 'Car' )
            // InternalLegoLang.g:2552:2: 'Car'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCarAccess().getCarKeyword_0()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCarAccess().getCarKeyword_0()); 
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
    // $ANTLR end "rule__Car__Group__0__Impl"


    // $ANTLR start "rule__Car__Group__1"
    // InternalLegoLang.g:2561:1: rule__Car__Group__1 : rule__Car__Group__1__Impl rule__Car__Group__2 ;
    public final void rule__Car__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2565:1: ( rule__Car__Group__1__Impl rule__Car__Group__2 )
            // InternalLegoLang.g:2566:2: rule__Car__Group__1__Impl rule__Car__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Car__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Car__Group__2();

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
    // $ANTLR end "rule__Car__Group__1"


    // $ANTLR start "rule__Car__Group__1__Impl"
    // InternalLegoLang.g:2573:1: rule__Car__Group__1__Impl : ( ( rule__Car__NameAssignment_1 ) ) ;
    public final void rule__Car__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2577:1: ( ( ( rule__Car__NameAssignment_1 ) ) )
            // InternalLegoLang.g:2578:1: ( ( rule__Car__NameAssignment_1 ) )
            {
            // InternalLegoLang.g:2578:1: ( ( rule__Car__NameAssignment_1 ) )
            // InternalLegoLang.g:2579:2: ( rule__Car__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCarAccess().getNameAssignment_1()); 
            }
            // InternalLegoLang.g:2580:2: ( rule__Car__NameAssignment_1 )
            // InternalLegoLang.g:2580:3: rule__Car__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Car__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCarAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__Car__Group__1__Impl"


    // $ANTLR start "rule__Car__Group__2"
    // InternalLegoLang.g:2588:1: rule__Car__Group__2 : rule__Car__Group__2__Impl rule__Car__Group__3 ;
    public final void rule__Car__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2592:1: ( rule__Car__Group__2__Impl rule__Car__Group__3 )
            // InternalLegoLang.g:2593:2: rule__Car__Group__2__Impl rule__Car__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Car__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Car__Group__3();

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
    // $ANTLR end "rule__Car__Group__2"


    // $ANTLR start "rule__Car__Group__2__Impl"
    // InternalLegoLang.g:2600:1: rule__Car__Group__2__Impl : ( '{' ) ;
    public final void rule__Car__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2604:1: ( ( '{' ) )
            // InternalLegoLang.g:2605:1: ( '{' )
            {
            // InternalLegoLang.g:2605:1: ( '{' )
            // InternalLegoLang.g:2606:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCarAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCarAccess().getLeftCurlyBracketKeyword_2()); 
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
    // $ANTLR end "rule__Car__Group__2__Impl"


    // $ANTLR start "rule__Car__Group__3"
    // InternalLegoLang.g:2615:1: rule__Car__Group__3 : rule__Car__Group__3__Impl rule__Car__Group__4 ;
    public final void rule__Car__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2619:1: ( rule__Car__Group__3__Impl rule__Car__Group__4 )
            // InternalLegoLang.g:2620:2: rule__Car__Group__3__Impl rule__Car__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Car__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Car__Group__4();

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
    // $ANTLR end "rule__Car__Group__3"


    // $ANTLR start "rule__Car__Group__3__Impl"
    // InternalLegoLang.g:2627:1: rule__Car__Group__3__Impl : ( ( rule__Car__SensorAssignment_3 )* ) ;
    public final void rule__Car__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2631:1: ( ( ( rule__Car__SensorAssignment_3 )* ) )
            // InternalLegoLang.g:2632:1: ( ( rule__Car__SensorAssignment_3 )* )
            {
            // InternalLegoLang.g:2632:1: ( ( rule__Car__SensorAssignment_3 )* )
            // InternalLegoLang.g:2633:2: ( rule__Car__SensorAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCarAccess().getSensorAssignment_3()); 
            }
            // InternalLegoLang.g:2634:2: ( rule__Car__SensorAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=17 && LA12_0<=21)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalLegoLang.g:2634:3: rule__Car__SensorAssignment_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Car__SensorAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCarAccess().getSensorAssignment_3()); 
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
    // $ANTLR end "rule__Car__Group__3__Impl"


    // $ANTLR start "rule__Car__Group__4"
    // InternalLegoLang.g:2642:1: rule__Car__Group__4 : rule__Car__Group__4__Impl rule__Car__Group__5 ;
    public final void rule__Car__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2646:1: ( rule__Car__Group__4__Impl rule__Car__Group__5 )
            // InternalLegoLang.g:2647:2: rule__Car__Group__4__Impl rule__Car__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Car__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Car__Group__5();

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
    // $ANTLR end "rule__Car__Group__4"


    // $ANTLR start "rule__Car__Group__4__Impl"
    // InternalLegoLang.g:2654:1: rule__Car__Group__4__Impl : ( ( rule__Car__EngineAssignment_4 )* ) ;
    public final void rule__Car__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2658:1: ( ( ( rule__Car__EngineAssignment_4 )* ) )
            // InternalLegoLang.g:2659:1: ( ( rule__Car__EngineAssignment_4 )* )
            {
            // InternalLegoLang.g:2659:1: ( ( rule__Car__EngineAssignment_4 )* )
            // InternalLegoLang.g:2660:2: ( rule__Car__EngineAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCarAccess().getEngineAssignment_4()); 
            }
            // InternalLegoLang.g:2661:2: ( rule__Car__EngineAssignment_4 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==16) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalLegoLang.g:2661:3: rule__Car__EngineAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Car__EngineAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCarAccess().getEngineAssignment_4()); 
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
    // $ANTLR end "rule__Car__Group__4__Impl"


    // $ANTLR start "rule__Car__Group__5"
    // InternalLegoLang.g:2669:1: rule__Car__Group__5 : rule__Car__Group__5__Impl ;
    public final void rule__Car__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2673:1: ( rule__Car__Group__5__Impl )
            // InternalLegoLang.g:2674:2: rule__Car__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Car__Group__5__Impl();

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
    // $ANTLR end "rule__Car__Group__5"


    // $ANTLR start "rule__Car__Group__5__Impl"
    // InternalLegoLang.g:2680:1: rule__Car__Group__5__Impl : ( '}' ) ;
    public final void rule__Car__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2684:1: ( ( '}' ) )
            // InternalLegoLang.g:2685:1: ( '}' )
            {
            // InternalLegoLang.g:2685:1: ( '}' )
            // InternalLegoLang.g:2686:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCarAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCarAccess().getRightCurlyBracketKeyword_5()); 
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
    // $ANTLR end "rule__Car__Group__5__Impl"


    // $ANTLR start "rule__VitesseOperation__Group__0"
    // InternalLegoLang.g:2696:1: rule__VitesseOperation__Group__0 : rule__VitesseOperation__Group__0__Impl rule__VitesseOperation__Group__1 ;
    public final void rule__VitesseOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2700:1: ( rule__VitesseOperation__Group__0__Impl rule__VitesseOperation__Group__1 )
            // InternalLegoLang.g:2701:2: rule__VitesseOperation__Group__0__Impl rule__VitesseOperation__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__VitesseOperation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VitesseOperation__Group__1();

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
    // $ANTLR end "rule__VitesseOperation__Group__0"


    // $ANTLR start "rule__VitesseOperation__Group__0__Impl"
    // InternalLegoLang.g:2708:1: rule__VitesseOperation__Group__0__Impl : ( 'set' ) ;
    public final void rule__VitesseOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2712:1: ( ( 'set' ) )
            // InternalLegoLang.g:2713:1: ( 'set' )
            {
            // InternalLegoLang.g:2713:1: ( 'set' )
            // InternalLegoLang.g:2714:2: 'set'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVitesseOperationAccess().getSetKeyword_0()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVitesseOperationAccess().getSetKeyword_0()); 
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
    // $ANTLR end "rule__VitesseOperation__Group__0__Impl"


    // $ANTLR start "rule__VitesseOperation__Group__1"
    // InternalLegoLang.g:2723:1: rule__VitesseOperation__Group__1 : rule__VitesseOperation__Group__1__Impl rule__VitesseOperation__Group__2 ;
    public final void rule__VitesseOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2727:1: ( rule__VitesseOperation__Group__1__Impl rule__VitesseOperation__Group__2 )
            // InternalLegoLang.g:2728:2: rule__VitesseOperation__Group__1__Impl rule__VitesseOperation__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__VitesseOperation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VitesseOperation__Group__2();

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
    // $ANTLR end "rule__VitesseOperation__Group__1"


    // $ANTLR start "rule__VitesseOperation__Group__1__Impl"
    // InternalLegoLang.g:2735:1: rule__VitesseOperation__Group__1__Impl : ( 'vitesse' ) ;
    public final void rule__VitesseOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2739:1: ( ( 'vitesse' ) )
            // InternalLegoLang.g:2740:1: ( 'vitesse' )
            {
            // InternalLegoLang.g:2740:1: ( 'vitesse' )
            // InternalLegoLang.g:2741:2: 'vitesse'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVitesseOperationAccess().getVitesseKeyword_1()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVitesseOperationAccess().getVitesseKeyword_1()); 
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
    // $ANTLR end "rule__VitesseOperation__Group__1__Impl"


    // $ANTLR start "rule__VitesseOperation__Group__2"
    // InternalLegoLang.g:2750:1: rule__VitesseOperation__Group__2 : rule__VitesseOperation__Group__2__Impl rule__VitesseOperation__Group__3 ;
    public final void rule__VitesseOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2754:1: ( rule__VitesseOperation__Group__2__Impl rule__VitesseOperation__Group__3 )
            // InternalLegoLang.g:2755:2: rule__VitesseOperation__Group__2__Impl rule__VitesseOperation__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__VitesseOperation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VitesseOperation__Group__3();

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
    // $ANTLR end "rule__VitesseOperation__Group__2"


    // $ANTLR start "rule__VitesseOperation__Group__2__Impl"
    // InternalLegoLang.g:2762:1: rule__VitesseOperation__Group__2__Impl : ( '(' ) ;
    public final void rule__VitesseOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2766:1: ( ( '(' ) )
            // InternalLegoLang.g:2767:1: ( '(' )
            {
            // InternalLegoLang.g:2767:1: ( '(' )
            // InternalLegoLang.g:2768:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVitesseOperationAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVitesseOperationAccess().getLeftParenthesisKeyword_2()); 
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
    // $ANTLR end "rule__VitesseOperation__Group__2__Impl"


    // $ANTLR start "rule__VitesseOperation__Group__3"
    // InternalLegoLang.g:2777:1: rule__VitesseOperation__Group__3 : rule__VitesseOperation__Group__3__Impl rule__VitesseOperation__Group__4 ;
    public final void rule__VitesseOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2781:1: ( rule__VitesseOperation__Group__3__Impl rule__VitesseOperation__Group__4 )
            // InternalLegoLang.g:2782:2: rule__VitesseOperation__Group__3__Impl rule__VitesseOperation__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__VitesseOperation__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VitesseOperation__Group__4();

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
    // $ANTLR end "rule__VitesseOperation__Group__3"


    // $ANTLR start "rule__VitesseOperation__Group__3__Impl"
    // InternalLegoLang.g:2789:1: rule__VitesseOperation__Group__3__Impl : ( ( rule__VitesseOperation__WheelengineAssignment_3 ) ) ;
    public final void rule__VitesseOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2793:1: ( ( ( rule__VitesseOperation__WheelengineAssignment_3 ) ) )
            // InternalLegoLang.g:2794:1: ( ( rule__VitesseOperation__WheelengineAssignment_3 ) )
            {
            // InternalLegoLang.g:2794:1: ( ( rule__VitesseOperation__WheelengineAssignment_3 ) )
            // InternalLegoLang.g:2795:2: ( rule__VitesseOperation__WheelengineAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVitesseOperationAccess().getWheelengineAssignment_3()); 
            }
            // InternalLegoLang.g:2796:2: ( rule__VitesseOperation__WheelengineAssignment_3 )
            // InternalLegoLang.g:2796:3: rule__VitesseOperation__WheelengineAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__VitesseOperation__WheelengineAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVitesseOperationAccess().getWheelengineAssignment_3()); 
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
    // $ANTLR end "rule__VitesseOperation__Group__3__Impl"


    // $ANTLR start "rule__VitesseOperation__Group__4"
    // InternalLegoLang.g:2804:1: rule__VitesseOperation__Group__4 : rule__VitesseOperation__Group__4__Impl rule__VitesseOperation__Group__5 ;
    public final void rule__VitesseOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2808:1: ( rule__VitesseOperation__Group__4__Impl rule__VitesseOperation__Group__5 )
            // InternalLegoLang.g:2809:2: rule__VitesseOperation__Group__4__Impl rule__VitesseOperation__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__VitesseOperation__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VitesseOperation__Group__5();

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
    // $ANTLR end "rule__VitesseOperation__Group__4"


    // $ANTLR start "rule__VitesseOperation__Group__4__Impl"
    // InternalLegoLang.g:2816:1: rule__VitesseOperation__Group__4__Impl : ( ')' ) ;
    public final void rule__VitesseOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2820:1: ( ( ')' ) )
            // InternalLegoLang.g:2821:1: ( ')' )
            {
            // InternalLegoLang.g:2821:1: ( ')' )
            // InternalLegoLang.g:2822:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVitesseOperationAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVitesseOperationAccess().getRightParenthesisKeyword_4()); 
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
    // $ANTLR end "rule__VitesseOperation__Group__4__Impl"


    // $ANTLR start "rule__VitesseOperation__Group__5"
    // InternalLegoLang.g:2831:1: rule__VitesseOperation__Group__5 : rule__VitesseOperation__Group__5__Impl rule__VitesseOperation__Group__6 ;
    public final void rule__VitesseOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2835:1: ( rule__VitesseOperation__Group__5__Impl rule__VitesseOperation__Group__6 )
            // InternalLegoLang.g:2836:2: rule__VitesseOperation__Group__5__Impl rule__VitesseOperation__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__VitesseOperation__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VitesseOperation__Group__6();

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
    // $ANTLR end "rule__VitesseOperation__Group__5"


    // $ANTLR start "rule__VitesseOperation__Group__5__Impl"
    // InternalLegoLang.g:2843:1: rule__VitesseOperation__Group__5__Impl : ( '=' ) ;
    public final void rule__VitesseOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2847:1: ( ( '=' ) )
            // InternalLegoLang.g:2848:1: ( '=' )
            {
            // InternalLegoLang.g:2848:1: ( '=' )
            // InternalLegoLang.g:2849:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVitesseOperationAccess().getEqualsSignKeyword_5()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVitesseOperationAccess().getEqualsSignKeyword_5()); 
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
    // $ANTLR end "rule__VitesseOperation__Group__5__Impl"


    // $ANTLR start "rule__VitesseOperation__Group__6"
    // InternalLegoLang.g:2858:1: rule__VitesseOperation__Group__6 : rule__VitesseOperation__Group__6__Impl ;
    public final void rule__VitesseOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2862:1: ( rule__VitesseOperation__Group__6__Impl )
            // InternalLegoLang.g:2863:2: rule__VitesseOperation__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VitesseOperation__Group__6__Impl();

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
    // $ANTLR end "rule__VitesseOperation__Group__6"


    // $ANTLR start "rule__VitesseOperation__Group__6__Impl"
    // InternalLegoLang.g:2869:1: rule__VitesseOperation__Group__6__Impl : ( ( rule__VitesseOperation__RightAssignment_6 ) ) ;
    public final void rule__VitesseOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2873:1: ( ( ( rule__VitesseOperation__RightAssignment_6 ) ) )
            // InternalLegoLang.g:2874:1: ( ( rule__VitesseOperation__RightAssignment_6 ) )
            {
            // InternalLegoLang.g:2874:1: ( ( rule__VitesseOperation__RightAssignment_6 ) )
            // InternalLegoLang.g:2875:2: ( rule__VitesseOperation__RightAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVitesseOperationAccess().getRightAssignment_6()); 
            }
            // InternalLegoLang.g:2876:2: ( rule__VitesseOperation__RightAssignment_6 )
            // InternalLegoLang.g:2876:3: rule__VitesseOperation__RightAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__VitesseOperation__RightAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVitesseOperationAccess().getRightAssignment_6()); 
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
    // $ANTLR end "rule__VitesseOperation__Group__6__Impl"


    // $ANTLR start "rule__ColorOperation__Group__0"
    // InternalLegoLang.g:2885:1: rule__ColorOperation__Group__0 : rule__ColorOperation__Group__0__Impl rule__ColorOperation__Group__1 ;
    public final void rule__ColorOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2889:1: ( rule__ColorOperation__Group__0__Impl rule__ColorOperation__Group__1 )
            // InternalLegoLang.g:2890:2: rule__ColorOperation__Group__0__Impl rule__ColorOperation__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__ColorOperation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ColorOperation__Group__1();

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
    // $ANTLR end "rule__ColorOperation__Group__0"


    // $ANTLR start "rule__ColorOperation__Group__0__Impl"
    // InternalLegoLang.g:2897:1: rule__ColorOperation__Group__0__Impl : ( 'get' ) ;
    public final void rule__ColorOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2901:1: ( ( 'get' ) )
            // InternalLegoLang.g:2902:1: ( 'get' )
            {
            // InternalLegoLang.g:2902:1: ( 'get' )
            // InternalLegoLang.g:2903:2: 'get'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorOperationAccess().getGetKeyword_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getColorOperationAccess().getGetKeyword_0()); 
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
    // $ANTLR end "rule__ColorOperation__Group__0__Impl"


    // $ANTLR start "rule__ColorOperation__Group__1"
    // InternalLegoLang.g:2912:1: rule__ColorOperation__Group__1 : rule__ColorOperation__Group__1__Impl rule__ColorOperation__Group__2 ;
    public final void rule__ColorOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2916:1: ( rule__ColorOperation__Group__1__Impl rule__ColorOperation__Group__2 )
            // InternalLegoLang.g:2917:2: rule__ColorOperation__Group__1__Impl rule__ColorOperation__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__ColorOperation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ColorOperation__Group__2();

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
    // $ANTLR end "rule__ColorOperation__Group__1"


    // $ANTLR start "rule__ColorOperation__Group__1__Impl"
    // InternalLegoLang.g:2924:1: rule__ColorOperation__Group__1__Impl : ( 'color' ) ;
    public final void rule__ColorOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2928:1: ( ( 'color' ) )
            // InternalLegoLang.g:2929:1: ( 'color' )
            {
            // InternalLegoLang.g:2929:1: ( 'color' )
            // InternalLegoLang.g:2930:2: 'color'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorOperationAccess().getColorKeyword_1()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getColorOperationAccess().getColorKeyword_1()); 
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
    // $ANTLR end "rule__ColorOperation__Group__1__Impl"


    // $ANTLR start "rule__ColorOperation__Group__2"
    // InternalLegoLang.g:2939:1: rule__ColorOperation__Group__2 : rule__ColorOperation__Group__2__Impl rule__ColorOperation__Group__3 ;
    public final void rule__ColorOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2943:1: ( rule__ColorOperation__Group__2__Impl rule__ColorOperation__Group__3 )
            // InternalLegoLang.g:2944:2: rule__ColorOperation__Group__2__Impl rule__ColorOperation__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__ColorOperation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ColorOperation__Group__3();

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
    // $ANTLR end "rule__ColorOperation__Group__2"


    // $ANTLR start "rule__ColorOperation__Group__2__Impl"
    // InternalLegoLang.g:2951:1: rule__ColorOperation__Group__2__Impl : ( '(' ) ;
    public final void rule__ColorOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2955:1: ( ( '(' ) )
            // InternalLegoLang.g:2956:1: ( '(' )
            {
            // InternalLegoLang.g:2956:1: ( '(' )
            // InternalLegoLang.g:2957:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorOperationAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getColorOperationAccess().getLeftParenthesisKeyword_2()); 
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
    // $ANTLR end "rule__ColorOperation__Group__2__Impl"


    // $ANTLR start "rule__ColorOperation__Group__3"
    // InternalLegoLang.g:2966:1: rule__ColorOperation__Group__3 : rule__ColorOperation__Group__3__Impl rule__ColorOperation__Group__4 ;
    public final void rule__ColorOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2970:1: ( rule__ColorOperation__Group__3__Impl rule__ColorOperation__Group__4 )
            // InternalLegoLang.g:2971:2: rule__ColorOperation__Group__3__Impl rule__ColorOperation__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__ColorOperation__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ColorOperation__Group__4();

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
    // $ANTLR end "rule__ColorOperation__Group__3"


    // $ANTLR start "rule__ColorOperation__Group__3__Impl"
    // InternalLegoLang.g:2978:1: rule__ColorOperation__Group__3__Impl : ( ( rule__ColorOperation__ColorsensorAssignment_3 ) ) ;
    public final void rule__ColorOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2982:1: ( ( ( rule__ColorOperation__ColorsensorAssignment_3 ) ) )
            // InternalLegoLang.g:2983:1: ( ( rule__ColorOperation__ColorsensorAssignment_3 ) )
            {
            // InternalLegoLang.g:2983:1: ( ( rule__ColorOperation__ColorsensorAssignment_3 ) )
            // InternalLegoLang.g:2984:2: ( rule__ColorOperation__ColorsensorAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorOperationAccess().getColorsensorAssignment_3()); 
            }
            // InternalLegoLang.g:2985:2: ( rule__ColorOperation__ColorsensorAssignment_3 )
            // InternalLegoLang.g:2985:3: rule__ColorOperation__ColorsensorAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ColorOperation__ColorsensorAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getColorOperationAccess().getColorsensorAssignment_3()); 
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
    // $ANTLR end "rule__ColorOperation__Group__3__Impl"


    // $ANTLR start "rule__ColorOperation__Group__4"
    // InternalLegoLang.g:2993:1: rule__ColorOperation__Group__4 : rule__ColorOperation__Group__4__Impl ;
    public final void rule__ColorOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2997:1: ( rule__ColorOperation__Group__4__Impl )
            // InternalLegoLang.g:2998:2: rule__ColorOperation__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ColorOperation__Group__4__Impl();

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
    // $ANTLR end "rule__ColorOperation__Group__4"


    // $ANTLR start "rule__ColorOperation__Group__4__Impl"
    // InternalLegoLang.g:3004:1: rule__ColorOperation__Group__4__Impl : ( ')' ) ;
    public final void rule__ColorOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3008:1: ( ( ')' ) )
            // InternalLegoLang.g:3009:1: ( ')' )
            {
            // InternalLegoLang.g:3009:1: ( ')' )
            // InternalLegoLang.g:3010:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorOperationAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getColorOperationAccess().getRightParenthesisKeyword_4()); 
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
    // $ANTLR end "rule__ColorOperation__Group__4__Impl"


    // $ANTLR start "rule__IntensityOperation__Group__0"
    // InternalLegoLang.g:3020:1: rule__IntensityOperation__Group__0 : rule__IntensityOperation__Group__0__Impl rule__IntensityOperation__Group__1 ;
    public final void rule__IntensityOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3024:1: ( rule__IntensityOperation__Group__0__Impl rule__IntensityOperation__Group__1 )
            // InternalLegoLang.g:3025:2: rule__IntensityOperation__Group__0__Impl rule__IntensityOperation__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__IntensityOperation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IntensityOperation__Group__1();

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
    // $ANTLR end "rule__IntensityOperation__Group__0"


    // $ANTLR start "rule__IntensityOperation__Group__0__Impl"
    // InternalLegoLang.g:3032:1: rule__IntensityOperation__Group__0__Impl : ( 'get' ) ;
    public final void rule__IntensityOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3036:1: ( ( 'get' ) )
            // InternalLegoLang.g:3037:1: ( 'get' )
            {
            // InternalLegoLang.g:3037:1: ( 'get' )
            // InternalLegoLang.g:3038:2: 'get'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntensityOperationAccess().getGetKeyword_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntensityOperationAccess().getGetKeyword_0()); 
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
    // $ANTLR end "rule__IntensityOperation__Group__0__Impl"


    // $ANTLR start "rule__IntensityOperation__Group__1"
    // InternalLegoLang.g:3047:1: rule__IntensityOperation__Group__1 : rule__IntensityOperation__Group__1__Impl rule__IntensityOperation__Group__2 ;
    public final void rule__IntensityOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3051:1: ( rule__IntensityOperation__Group__1__Impl rule__IntensityOperation__Group__2 )
            // InternalLegoLang.g:3052:2: rule__IntensityOperation__Group__1__Impl rule__IntensityOperation__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__IntensityOperation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IntensityOperation__Group__2();

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
    // $ANTLR end "rule__IntensityOperation__Group__1"


    // $ANTLR start "rule__IntensityOperation__Group__1__Impl"
    // InternalLegoLang.g:3059:1: rule__IntensityOperation__Group__1__Impl : ( 'intensity' ) ;
    public final void rule__IntensityOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3063:1: ( ( 'intensity' ) )
            // InternalLegoLang.g:3064:1: ( 'intensity' )
            {
            // InternalLegoLang.g:3064:1: ( 'intensity' )
            // InternalLegoLang.g:3065:2: 'intensity'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntensityOperationAccess().getIntensityKeyword_1()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntensityOperationAccess().getIntensityKeyword_1()); 
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
    // $ANTLR end "rule__IntensityOperation__Group__1__Impl"


    // $ANTLR start "rule__IntensityOperation__Group__2"
    // InternalLegoLang.g:3074:1: rule__IntensityOperation__Group__2 : rule__IntensityOperation__Group__2__Impl rule__IntensityOperation__Group__3 ;
    public final void rule__IntensityOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3078:1: ( rule__IntensityOperation__Group__2__Impl rule__IntensityOperation__Group__3 )
            // InternalLegoLang.g:3079:2: rule__IntensityOperation__Group__2__Impl rule__IntensityOperation__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__IntensityOperation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IntensityOperation__Group__3();

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
    // $ANTLR end "rule__IntensityOperation__Group__2"


    // $ANTLR start "rule__IntensityOperation__Group__2__Impl"
    // InternalLegoLang.g:3086:1: rule__IntensityOperation__Group__2__Impl : ( '(' ) ;
    public final void rule__IntensityOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3090:1: ( ( '(' ) )
            // InternalLegoLang.g:3091:1: ( '(' )
            {
            // InternalLegoLang.g:3091:1: ( '(' )
            // InternalLegoLang.g:3092:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntensityOperationAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntensityOperationAccess().getLeftParenthesisKeyword_2()); 
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
    // $ANTLR end "rule__IntensityOperation__Group__2__Impl"


    // $ANTLR start "rule__IntensityOperation__Group__3"
    // InternalLegoLang.g:3101:1: rule__IntensityOperation__Group__3 : rule__IntensityOperation__Group__3__Impl rule__IntensityOperation__Group__4 ;
    public final void rule__IntensityOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3105:1: ( rule__IntensityOperation__Group__3__Impl rule__IntensityOperation__Group__4 )
            // InternalLegoLang.g:3106:2: rule__IntensityOperation__Group__3__Impl rule__IntensityOperation__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__IntensityOperation__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IntensityOperation__Group__4();

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
    // $ANTLR end "rule__IntensityOperation__Group__3"


    // $ANTLR start "rule__IntensityOperation__Group__3__Impl"
    // InternalLegoLang.g:3113:1: rule__IntensityOperation__Group__3__Impl : ( ( rule__IntensityOperation__ColorsensorAssignment_3 ) ) ;
    public final void rule__IntensityOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3117:1: ( ( ( rule__IntensityOperation__ColorsensorAssignment_3 ) ) )
            // InternalLegoLang.g:3118:1: ( ( rule__IntensityOperation__ColorsensorAssignment_3 ) )
            {
            // InternalLegoLang.g:3118:1: ( ( rule__IntensityOperation__ColorsensorAssignment_3 ) )
            // InternalLegoLang.g:3119:2: ( rule__IntensityOperation__ColorsensorAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntensityOperationAccess().getColorsensorAssignment_3()); 
            }
            // InternalLegoLang.g:3120:2: ( rule__IntensityOperation__ColorsensorAssignment_3 )
            // InternalLegoLang.g:3120:3: rule__IntensityOperation__ColorsensorAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__IntensityOperation__ColorsensorAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntensityOperationAccess().getColorsensorAssignment_3()); 
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
    // $ANTLR end "rule__IntensityOperation__Group__3__Impl"


    // $ANTLR start "rule__IntensityOperation__Group__4"
    // InternalLegoLang.g:3128:1: rule__IntensityOperation__Group__4 : rule__IntensityOperation__Group__4__Impl ;
    public final void rule__IntensityOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3132:1: ( rule__IntensityOperation__Group__4__Impl )
            // InternalLegoLang.g:3133:2: rule__IntensityOperation__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntensityOperation__Group__4__Impl();

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
    // $ANTLR end "rule__IntensityOperation__Group__4"


    // $ANTLR start "rule__IntensityOperation__Group__4__Impl"
    // InternalLegoLang.g:3139:1: rule__IntensityOperation__Group__4__Impl : ( ')' ) ;
    public final void rule__IntensityOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3143:1: ( ( ')' ) )
            // InternalLegoLang.g:3144:1: ( ')' )
            {
            // InternalLegoLang.g:3144:1: ( ')' )
            // InternalLegoLang.g:3145:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntensityOperationAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntensityOperationAccess().getRightParenthesisKeyword_4()); 
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
    // $ANTLR end "rule__IntensityOperation__Group__4__Impl"


    // $ANTLR start "rule__RangeOperation__Group__0"
    // InternalLegoLang.g:3155:1: rule__RangeOperation__Group__0 : rule__RangeOperation__Group__0__Impl rule__RangeOperation__Group__1 ;
    public final void rule__RangeOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3159:1: ( rule__RangeOperation__Group__0__Impl rule__RangeOperation__Group__1 )
            // InternalLegoLang.g:3160:2: rule__RangeOperation__Group__0__Impl rule__RangeOperation__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__RangeOperation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RangeOperation__Group__1();

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
    // $ANTLR end "rule__RangeOperation__Group__0"


    // $ANTLR start "rule__RangeOperation__Group__0__Impl"
    // InternalLegoLang.g:3167:1: rule__RangeOperation__Group__0__Impl : ( 'get' ) ;
    public final void rule__RangeOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3171:1: ( ( 'get' ) )
            // InternalLegoLang.g:3172:1: ( 'get' )
            {
            // InternalLegoLang.g:3172:1: ( 'get' )
            // InternalLegoLang.g:3173:2: 'get'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeOperationAccess().getGetKeyword_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeOperationAccess().getGetKeyword_0()); 
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
    // $ANTLR end "rule__RangeOperation__Group__0__Impl"


    // $ANTLR start "rule__RangeOperation__Group__1"
    // InternalLegoLang.g:3182:1: rule__RangeOperation__Group__1 : rule__RangeOperation__Group__1__Impl rule__RangeOperation__Group__2 ;
    public final void rule__RangeOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3186:1: ( rule__RangeOperation__Group__1__Impl rule__RangeOperation__Group__2 )
            // InternalLegoLang.g:3187:2: rule__RangeOperation__Group__1__Impl rule__RangeOperation__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__RangeOperation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RangeOperation__Group__2();

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
    // $ANTLR end "rule__RangeOperation__Group__1"


    // $ANTLR start "rule__RangeOperation__Group__1__Impl"
    // InternalLegoLang.g:3194:1: rule__RangeOperation__Group__1__Impl : ( 'range' ) ;
    public final void rule__RangeOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3198:1: ( ( 'range' ) )
            // InternalLegoLang.g:3199:1: ( 'range' )
            {
            // InternalLegoLang.g:3199:1: ( 'range' )
            // InternalLegoLang.g:3200:2: 'range'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeOperationAccess().getRangeKeyword_1()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeOperationAccess().getRangeKeyword_1()); 
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
    // $ANTLR end "rule__RangeOperation__Group__1__Impl"


    // $ANTLR start "rule__RangeOperation__Group__2"
    // InternalLegoLang.g:3209:1: rule__RangeOperation__Group__2 : rule__RangeOperation__Group__2__Impl rule__RangeOperation__Group__3 ;
    public final void rule__RangeOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3213:1: ( rule__RangeOperation__Group__2__Impl rule__RangeOperation__Group__3 )
            // InternalLegoLang.g:3214:2: rule__RangeOperation__Group__2__Impl rule__RangeOperation__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__RangeOperation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RangeOperation__Group__3();

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
    // $ANTLR end "rule__RangeOperation__Group__2"


    // $ANTLR start "rule__RangeOperation__Group__2__Impl"
    // InternalLegoLang.g:3221:1: rule__RangeOperation__Group__2__Impl : ( '(' ) ;
    public final void rule__RangeOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3225:1: ( ( '(' ) )
            // InternalLegoLang.g:3226:1: ( '(' )
            {
            // InternalLegoLang.g:3226:1: ( '(' )
            // InternalLegoLang.g:3227:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeOperationAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeOperationAccess().getLeftParenthesisKeyword_2()); 
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
    // $ANTLR end "rule__RangeOperation__Group__2__Impl"


    // $ANTLR start "rule__RangeOperation__Group__3"
    // InternalLegoLang.g:3236:1: rule__RangeOperation__Group__3 : rule__RangeOperation__Group__3__Impl rule__RangeOperation__Group__4 ;
    public final void rule__RangeOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3240:1: ( rule__RangeOperation__Group__3__Impl rule__RangeOperation__Group__4 )
            // InternalLegoLang.g:3241:2: rule__RangeOperation__Group__3__Impl rule__RangeOperation__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__RangeOperation__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RangeOperation__Group__4();

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
    // $ANTLR end "rule__RangeOperation__Group__3"


    // $ANTLR start "rule__RangeOperation__Group__3__Impl"
    // InternalLegoLang.g:3248:1: rule__RangeOperation__Group__3__Impl : ( ( rule__RangeOperation__LasersensorAssignment_3 ) ) ;
    public final void rule__RangeOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3252:1: ( ( ( rule__RangeOperation__LasersensorAssignment_3 ) ) )
            // InternalLegoLang.g:3253:1: ( ( rule__RangeOperation__LasersensorAssignment_3 ) )
            {
            // InternalLegoLang.g:3253:1: ( ( rule__RangeOperation__LasersensorAssignment_3 ) )
            // InternalLegoLang.g:3254:2: ( rule__RangeOperation__LasersensorAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeOperationAccess().getLasersensorAssignment_3()); 
            }
            // InternalLegoLang.g:3255:2: ( rule__RangeOperation__LasersensorAssignment_3 )
            // InternalLegoLang.g:3255:3: rule__RangeOperation__LasersensorAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__RangeOperation__LasersensorAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeOperationAccess().getLasersensorAssignment_3()); 
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
    // $ANTLR end "rule__RangeOperation__Group__3__Impl"


    // $ANTLR start "rule__RangeOperation__Group__4"
    // InternalLegoLang.g:3263:1: rule__RangeOperation__Group__4 : rule__RangeOperation__Group__4__Impl ;
    public final void rule__RangeOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3267:1: ( rule__RangeOperation__Group__4__Impl )
            // InternalLegoLang.g:3268:2: rule__RangeOperation__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RangeOperation__Group__4__Impl();

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
    // $ANTLR end "rule__RangeOperation__Group__4"


    // $ANTLR start "rule__RangeOperation__Group__4__Impl"
    // InternalLegoLang.g:3274:1: rule__RangeOperation__Group__4__Impl : ( ')' ) ;
    public final void rule__RangeOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3278:1: ( ( ')' ) )
            // InternalLegoLang.g:3279:1: ( ')' )
            {
            // InternalLegoLang.g:3279:1: ( ')' )
            // InternalLegoLang.g:3280:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeOperationAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeOperationAccess().getRightParenthesisKeyword_4()); 
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
    // $ANTLR end "rule__RangeOperation__Group__4__Impl"


    // $ANTLR start "rule__XGPSOperation__Group__0"
    // InternalLegoLang.g:3290:1: rule__XGPSOperation__Group__0 : rule__XGPSOperation__Group__0__Impl rule__XGPSOperation__Group__1 ;
    public final void rule__XGPSOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3294:1: ( rule__XGPSOperation__Group__0__Impl rule__XGPSOperation__Group__1 )
            // InternalLegoLang.g:3295:2: rule__XGPSOperation__Group__0__Impl rule__XGPSOperation__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__XGPSOperation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XGPSOperation__Group__1();

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
    // $ANTLR end "rule__XGPSOperation__Group__0"


    // $ANTLR start "rule__XGPSOperation__Group__0__Impl"
    // InternalLegoLang.g:3302:1: rule__XGPSOperation__Group__0__Impl : ( 'get' ) ;
    public final void rule__XGPSOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3306:1: ( ( 'get' ) )
            // InternalLegoLang.g:3307:1: ( 'get' )
            {
            // InternalLegoLang.g:3307:1: ( 'get' )
            // InternalLegoLang.g:3308:2: 'get'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGPSOperationAccess().getGetKeyword_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGPSOperationAccess().getGetKeyword_0()); 
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
    // $ANTLR end "rule__XGPSOperation__Group__0__Impl"


    // $ANTLR start "rule__XGPSOperation__Group__1"
    // InternalLegoLang.g:3317:1: rule__XGPSOperation__Group__1 : rule__XGPSOperation__Group__1__Impl rule__XGPSOperation__Group__2 ;
    public final void rule__XGPSOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3321:1: ( rule__XGPSOperation__Group__1__Impl rule__XGPSOperation__Group__2 )
            // InternalLegoLang.g:3322:2: rule__XGPSOperation__Group__1__Impl rule__XGPSOperation__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__XGPSOperation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XGPSOperation__Group__2();

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
    // $ANTLR end "rule__XGPSOperation__Group__1"


    // $ANTLR start "rule__XGPSOperation__Group__1__Impl"
    // InternalLegoLang.g:3329:1: rule__XGPSOperation__Group__1__Impl : ( 'x' ) ;
    public final void rule__XGPSOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3333:1: ( ( 'x' ) )
            // InternalLegoLang.g:3334:1: ( 'x' )
            {
            // InternalLegoLang.g:3334:1: ( 'x' )
            // InternalLegoLang.g:3335:2: 'x'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGPSOperationAccess().getXKeyword_1()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGPSOperationAccess().getXKeyword_1()); 
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
    // $ANTLR end "rule__XGPSOperation__Group__1__Impl"


    // $ANTLR start "rule__XGPSOperation__Group__2"
    // InternalLegoLang.g:3344:1: rule__XGPSOperation__Group__2 : rule__XGPSOperation__Group__2__Impl rule__XGPSOperation__Group__3 ;
    public final void rule__XGPSOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3348:1: ( rule__XGPSOperation__Group__2__Impl rule__XGPSOperation__Group__3 )
            // InternalLegoLang.g:3349:2: rule__XGPSOperation__Group__2__Impl rule__XGPSOperation__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__XGPSOperation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XGPSOperation__Group__3();

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
    // $ANTLR end "rule__XGPSOperation__Group__2"


    // $ANTLR start "rule__XGPSOperation__Group__2__Impl"
    // InternalLegoLang.g:3356:1: rule__XGPSOperation__Group__2__Impl : ( '(' ) ;
    public final void rule__XGPSOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3360:1: ( ( '(' ) )
            // InternalLegoLang.g:3361:1: ( '(' )
            {
            // InternalLegoLang.g:3361:1: ( '(' )
            // InternalLegoLang.g:3362:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGPSOperationAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGPSOperationAccess().getLeftParenthesisKeyword_2()); 
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
    // $ANTLR end "rule__XGPSOperation__Group__2__Impl"


    // $ANTLR start "rule__XGPSOperation__Group__3"
    // InternalLegoLang.g:3371:1: rule__XGPSOperation__Group__3 : rule__XGPSOperation__Group__3__Impl rule__XGPSOperation__Group__4 ;
    public final void rule__XGPSOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3375:1: ( rule__XGPSOperation__Group__3__Impl rule__XGPSOperation__Group__4 )
            // InternalLegoLang.g:3376:2: rule__XGPSOperation__Group__3__Impl rule__XGPSOperation__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__XGPSOperation__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XGPSOperation__Group__4();

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
    // $ANTLR end "rule__XGPSOperation__Group__3"


    // $ANTLR start "rule__XGPSOperation__Group__3__Impl"
    // InternalLegoLang.g:3383:1: rule__XGPSOperation__Group__3__Impl : ( ( rule__XGPSOperation__GpssensorAssignment_3 ) ) ;
    public final void rule__XGPSOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3387:1: ( ( ( rule__XGPSOperation__GpssensorAssignment_3 ) ) )
            // InternalLegoLang.g:3388:1: ( ( rule__XGPSOperation__GpssensorAssignment_3 ) )
            {
            // InternalLegoLang.g:3388:1: ( ( rule__XGPSOperation__GpssensorAssignment_3 ) )
            // InternalLegoLang.g:3389:2: ( rule__XGPSOperation__GpssensorAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGPSOperationAccess().getGpssensorAssignment_3()); 
            }
            // InternalLegoLang.g:3390:2: ( rule__XGPSOperation__GpssensorAssignment_3 )
            // InternalLegoLang.g:3390:3: rule__XGPSOperation__GpssensorAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__XGPSOperation__GpssensorAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGPSOperationAccess().getGpssensorAssignment_3()); 
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
    // $ANTLR end "rule__XGPSOperation__Group__3__Impl"


    // $ANTLR start "rule__XGPSOperation__Group__4"
    // InternalLegoLang.g:3398:1: rule__XGPSOperation__Group__4 : rule__XGPSOperation__Group__4__Impl ;
    public final void rule__XGPSOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3402:1: ( rule__XGPSOperation__Group__4__Impl )
            // InternalLegoLang.g:3403:2: rule__XGPSOperation__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XGPSOperation__Group__4__Impl();

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
    // $ANTLR end "rule__XGPSOperation__Group__4"


    // $ANTLR start "rule__XGPSOperation__Group__4__Impl"
    // InternalLegoLang.g:3409:1: rule__XGPSOperation__Group__4__Impl : ( ')' ) ;
    public final void rule__XGPSOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3413:1: ( ( ')' ) )
            // InternalLegoLang.g:3414:1: ( ')' )
            {
            // InternalLegoLang.g:3414:1: ( ')' )
            // InternalLegoLang.g:3415:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGPSOperationAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGPSOperationAccess().getRightParenthesisKeyword_4()); 
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
    // $ANTLR end "rule__XGPSOperation__Group__4__Impl"


    // $ANTLR start "rule__YGPSOperation__Group__0"
    // InternalLegoLang.g:3425:1: rule__YGPSOperation__Group__0 : rule__YGPSOperation__Group__0__Impl rule__YGPSOperation__Group__1 ;
    public final void rule__YGPSOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3429:1: ( rule__YGPSOperation__Group__0__Impl rule__YGPSOperation__Group__1 )
            // InternalLegoLang.g:3430:2: rule__YGPSOperation__Group__0__Impl rule__YGPSOperation__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__YGPSOperation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YGPSOperation__Group__1();

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
    // $ANTLR end "rule__YGPSOperation__Group__0"


    // $ANTLR start "rule__YGPSOperation__Group__0__Impl"
    // InternalLegoLang.g:3437:1: rule__YGPSOperation__Group__0__Impl : ( 'get' ) ;
    public final void rule__YGPSOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3441:1: ( ( 'get' ) )
            // InternalLegoLang.g:3442:1: ( 'get' )
            {
            // InternalLegoLang.g:3442:1: ( 'get' )
            // InternalLegoLang.g:3443:2: 'get'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYGPSOperationAccess().getGetKeyword_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYGPSOperationAccess().getGetKeyword_0()); 
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
    // $ANTLR end "rule__YGPSOperation__Group__0__Impl"


    // $ANTLR start "rule__YGPSOperation__Group__1"
    // InternalLegoLang.g:3452:1: rule__YGPSOperation__Group__1 : rule__YGPSOperation__Group__1__Impl rule__YGPSOperation__Group__2 ;
    public final void rule__YGPSOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3456:1: ( rule__YGPSOperation__Group__1__Impl rule__YGPSOperation__Group__2 )
            // InternalLegoLang.g:3457:2: rule__YGPSOperation__Group__1__Impl rule__YGPSOperation__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__YGPSOperation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YGPSOperation__Group__2();

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
    // $ANTLR end "rule__YGPSOperation__Group__1"


    // $ANTLR start "rule__YGPSOperation__Group__1__Impl"
    // InternalLegoLang.g:3464:1: rule__YGPSOperation__Group__1__Impl : ( 'y' ) ;
    public final void rule__YGPSOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3468:1: ( ( 'y' ) )
            // InternalLegoLang.g:3469:1: ( 'y' )
            {
            // InternalLegoLang.g:3469:1: ( 'y' )
            // InternalLegoLang.g:3470:2: 'y'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYGPSOperationAccess().getYKeyword_1()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYGPSOperationAccess().getYKeyword_1()); 
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
    // $ANTLR end "rule__YGPSOperation__Group__1__Impl"


    // $ANTLR start "rule__YGPSOperation__Group__2"
    // InternalLegoLang.g:3479:1: rule__YGPSOperation__Group__2 : rule__YGPSOperation__Group__2__Impl rule__YGPSOperation__Group__3 ;
    public final void rule__YGPSOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3483:1: ( rule__YGPSOperation__Group__2__Impl rule__YGPSOperation__Group__3 )
            // InternalLegoLang.g:3484:2: rule__YGPSOperation__Group__2__Impl rule__YGPSOperation__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__YGPSOperation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YGPSOperation__Group__3();

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
    // $ANTLR end "rule__YGPSOperation__Group__2"


    // $ANTLR start "rule__YGPSOperation__Group__2__Impl"
    // InternalLegoLang.g:3491:1: rule__YGPSOperation__Group__2__Impl : ( '(' ) ;
    public final void rule__YGPSOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3495:1: ( ( '(' ) )
            // InternalLegoLang.g:3496:1: ( '(' )
            {
            // InternalLegoLang.g:3496:1: ( '(' )
            // InternalLegoLang.g:3497:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYGPSOperationAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYGPSOperationAccess().getLeftParenthesisKeyword_2()); 
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
    // $ANTLR end "rule__YGPSOperation__Group__2__Impl"


    // $ANTLR start "rule__YGPSOperation__Group__3"
    // InternalLegoLang.g:3506:1: rule__YGPSOperation__Group__3 : rule__YGPSOperation__Group__3__Impl rule__YGPSOperation__Group__4 ;
    public final void rule__YGPSOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3510:1: ( rule__YGPSOperation__Group__3__Impl rule__YGPSOperation__Group__4 )
            // InternalLegoLang.g:3511:2: rule__YGPSOperation__Group__3__Impl rule__YGPSOperation__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__YGPSOperation__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YGPSOperation__Group__4();

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
    // $ANTLR end "rule__YGPSOperation__Group__3"


    // $ANTLR start "rule__YGPSOperation__Group__3__Impl"
    // InternalLegoLang.g:3518:1: rule__YGPSOperation__Group__3__Impl : ( ( rule__YGPSOperation__GpssensorAssignment_3 ) ) ;
    public final void rule__YGPSOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3522:1: ( ( ( rule__YGPSOperation__GpssensorAssignment_3 ) ) )
            // InternalLegoLang.g:3523:1: ( ( rule__YGPSOperation__GpssensorAssignment_3 ) )
            {
            // InternalLegoLang.g:3523:1: ( ( rule__YGPSOperation__GpssensorAssignment_3 ) )
            // InternalLegoLang.g:3524:2: ( rule__YGPSOperation__GpssensorAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYGPSOperationAccess().getGpssensorAssignment_3()); 
            }
            // InternalLegoLang.g:3525:2: ( rule__YGPSOperation__GpssensorAssignment_3 )
            // InternalLegoLang.g:3525:3: rule__YGPSOperation__GpssensorAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__YGPSOperation__GpssensorAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYGPSOperationAccess().getGpssensorAssignment_3()); 
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
    // $ANTLR end "rule__YGPSOperation__Group__3__Impl"


    // $ANTLR start "rule__YGPSOperation__Group__4"
    // InternalLegoLang.g:3533:1: rule__YGPSOperation__Group__4 : rule__YGPSOperation__Group__4__Impl ;
    public final void rule__YGPSOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3537:1: ( rule__YGPSOperation__Group__4__Impl )
            // InternalLegoLang.g:3538:2: rule__YGPSOperation__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__YGPSOperation__Group__4__Impl();

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
    // $ANTLR end "rule__YGPSOperation__Group__4"


    // $ANTLR start "rule__YGPSOperation__Group__4__Impl"
    // InternalLegoLang.g:3544:1: rule__YGPSOperation__Group__4__Impl : ( ')' ) ;
    public final void rule__YGPSOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3548:1: ( ( ')' ) )
            // InternalLegoLang.g:3549:1: ( ')' )
            {
            // InternalLegoLang.g:3549:1: ( ')' )
            // InternalLegoLang.g:3550:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYGPSOperationAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYGPSOperationAccess().getRightParenthesisKeyword_4()); 
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
    // $ANTLR end "rule__YGPSOperation__Group__4__Impl"


    // $ANTLR start "rule__AngleOperation__Group__0"
    // InternalLegoLang.g:3560:1: rule__AngleOperation__Group__0 : rule__AngleOperation__Group__0__Impl rule__AngleOperation__Group__1 ;
    public final void rule__AngleOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3564:1: ( rule__AngleOperation__Group__0__Impl rule__AngleOperation__Group__1 )
            // InternalLegoLang.g:3565:2: rule__AngleOperation__Group__0__Impl rule__AngleOperation__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__AngleOperation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AngleOperation__Group__1();

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
    // $ANTLR end "rule__AngleOperation__Group__0"


    // $ANTLR start "rule__AngleOperation__Group__0__Impl"
    // InternalLegoLang.g:3572:1: rule__AngleOperation__Group__0__Impl : ( 'get' ) ;
    public final void rule__AngleOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3576:1: ( ( 'get' ) )
            // InternalLegoLang.g:3577:1: ( 'get' )
            {
            // InternalLegoLang.g:3577:1: ( 'get' )
            // InternalLegoLang.g:3578:2: 'get'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAngleOperationAccess().getGetKeyword_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAngleOperationAccess().getGetKeyword_0()); 
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
    // $ANTLR end "rule__AngleOperation__Group__0__Impl"


    // $ANTLR start "rule__AngleOperation__Group__1"
    // InternalLegoLang.g:3587:1: rule__AngleOperation__Group__1 : rule__AngleOperation__Group__1__Impl rule__AngleOperation__Group__2 ;
    public final void rule__AngleOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3591:1: ( rule__AngleOperation__Group__1__Impl rule__AngleOperation__Group__2 )
            // InternalLegoLang.g:3592:2: rule__AngleOperation__Group__1__Impl rule__AngleOperation__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__AngleOperation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AngleOperation__Group__2();

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
    // $ANTLR end "rule__AngleOperation__Group__1"


    // $ANTLR start "rule__AngleOperation__Group__1__Impl"
    // InternalLegoLang.g:3599:1: rule__AngleOperation__Group__1__Impl : ( 'angle' ) ;
    public final void rule__AngleOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3603:1: ( ( 'angle' ) )
            // InternalLegoLang.g:3604:1: ( 'angle' )
            {
            // InternalLegoLang.g:3604:1: ( 'angle' )
            // InternalLegoLang.g:3605:2: 'angle'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAngleOperationAccess().getAngleKeyword_1()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAngleOperationAccess().getAngleKeyword_1()); 
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
    // $ANTLR end "rule__AngleOperation__Group__1__Impl"


    // $ANTLR start "rule__AngleOperation__Group__2"
    // InternalLegoLang.g:3614:1: rule__AngleOperation__Group__2 : rule__AngleOperation__Group__2__Impl rule__AngleOperation__Group__3 ;
    public final void rule__AngleOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3618:1: ( rule__AngleOperation__Group__2__Impl rule__AngleOperation__Group__3 )
            // InternalLegoLang.g:3619:2: rule__AngleOperation__Group__2__Impl rule__AngleOperation__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__AngleOperation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AngleOperation__Group__3();

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
    // $ANTLR end "rule__AngleOperation__Group__2"


    // $ANTLR start "rule__AngleOperation__Group__2__Impl"
    // InternalLegoLang.g:3626:1: rule__AngleOperation__Group__2__Impl : ( '(' ) ;
    public final void rule__AngleOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3630:1: ( ( '(' ) )
            // InternalLegoLang.g:3631:1: ( '(' )
            {
            // InternalLegoLang.g:3631:1: ( '(' )
            // InternalLegoLang.g:3632:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAngleOperationAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAngleOperationAccess().getLeftParenthesisKeyword_2()); 
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
    // $ANTLR end "rule__AngleOperation__Group__2__Impl"


    // $ANTLR start "rule__AngleOperation__Group__3"
    // InternalLegoLang.g:3641:1: rule__AngleOperation__Group__3 : rule__AngleOperation__Group__3__Impl rule__AngleOperation__Group__4 ;
    public final void rule__AngleOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3645:1: ( rule__AngleOperation__Group__3__Impl rule__AngleOperation__Group__4 )
            // InternalLegoLang.g:3646:2: rule__AngleOperation__Group__3__Impl rule__AngleOperation__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__AngleOperation__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AngleOperation__Group__4();

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
    // $ANTLR end "rule__AngleOperation__Group__3"


    // $ANTLR start "rule__AngleOperation__Group__3__Impl"
    // InternalLegoLang.g:3653:1: rule__AngleOperation__Group__3__Impl : ( ( rule__AngleOperation__GyrosensorAssignment_3 ) ) ;
    public final void rule__AngleOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3657:1: ( ( ( rule__AngleOperation__GyrosensorAssignment_3 ) ) )
            // InternalLegoLang.g:3658:1: ( ( rule__AngleOperation__GyrosensorAssignment_3 ) )
            {
            // InternalLegoLang.g:3658:1: ( ( rule__AngleOperation__GyrosensorAssignment_3 ) )
            // InternalLegoLang.g:3659:2: ( rule__AngleOperation__GyrosensorAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAngleOperationAccess().getGyrosensorAssignment_3()); 
            }
            // InternalLegoLang.g:3660:2: ( rule__AngleOperation__GyrosensorAssignment_3 )
            // InternalLegoLang.g:3660:3: rule__AngleOperation__GyrosensorAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AngleOperation__GyrosensorAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAngleOperationAccess().getGyrosensorAssignment_3()); 
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
    // $ANTLR end "rule__AngleOperation__Group__3__Impl"


    // $ANTLR start "rule__AngleOperation__Group__4"
    // InternalLegoLang.g:3668:1: rule__AngleOperation__Group__4 : rule__AngleOperation__Group__4__Impl ;
    public final void rule__AngleOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3672:1: ( rule__AngleOperation__Group__4__Impl )
            // InternalLegoLang.g:3673:2: rule__AngleOperation__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AngleOperation__Group__4__Impl();

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
    // $ANTLR end "rule__AngleOperation__Group__4"


    // $ANTLR start "rule__AngleOperation__Group__4__Impl"
    // InternalLegoLang.g:3679:1: rule__AngleOperation__Group__4__Impl : ( ')' ) ;
    public final void rule__AngleOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3683:1: ( ( ')' ) )
            // InternalLegoLang.g:3684:1: ( ')' )
            {
            // InternalLegoLang.g:3684:1: ( ')' )
            // InternalLegoLang.g:3685:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAngleOperationAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAngleOperationAccess().getRightParenthesisKeyword_4()); 
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
    // $ANTLR end "rule__AngleOperation__Group__4__Impl"


    // $ANTLR start "rule__DistanceOperation__Group__0"
    // InternalLegoLang.g:3695:1: rule__DistanceOperation__Group__0 : rule__DistanceOperation__Group__0__Impl rule__DistanceOperation__Group__1 ;
    public final void rule__DistanceOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3699:1: ( rule__DistanceOperation__Group__0__Impl rule__DistanceOperation__Group__1 )
            // InternalLegoLang.g:3700:2: rule__DistanceOperation__Group__0__Impl rule__DistanceOperation__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__DistanceOperation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DistanceOperation__Group__1();

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
    // $ANTLR end "rule__DistanceOperation__Group__0"


    // $ANTLR start "rule__DistanceOperation__Group__0__Impl"
    // InternalLegoLang.g:3707:1: rule__DistanceOperation__Group__0__Impl : ( 'get' ) ;
    public final void rule__DistanceOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3711:1: ( ( 'get' ) )
            // InternalLegoLang.g:3712:1: ( 'get' )
            {
            // InternalLegoLang.g:3712:1: ( 'get' )
            // InternalLegoLang.g:3713:2: 'get'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDistanceOperationAccess().getGetKeyword_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDistanceOperationAccess().getGetKeyword_0()); 
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
    // $ANTLR end "rule__DistanceOperation__Group__0__Impl"


    // $ANTLR start "rule__DistanceOperation__Group__1"
    // InternalLegoLang.g:3722:1: rule__DistanceOperation__Group__1 : rule__DistanceOperation__Group__1__Impl rule__DistanceOperation__Group__2 ;
    public final void rule__DistanceOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3726:1: ( rule__DistanceOperation__Group__1__Impl rule__DistanceOperation__Group__2 )
            // InternalLegoLang.g:3727:2: rule__DistanceOperation__Group__1__Impl rule__DistanceOperation__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__DistanceOperation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DistanceOperation__Group__2();

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
    // $ANTLR end "rule__DistanceOperation__Group__1"


    // $ANTLR start "rule__DistanceOperation__Group__1__Impl"
    // InternalLegoLang.g:3734:1: rule__DistanceOperation__Group__1__Impl : ( 'distance' ) ;
    public final void rule__DistanceOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3738:1: ( ( 'distance' ) )
            // InternalLegoLang.g:3739:1: ( 'distance' )
            {
            // InternalLegoLang.g:3739:1: ( 'distance' )
            // InternalLegoLang.g:3740:2: 'distance'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDistanceOperationAccess().getDistanceKeyword_1()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDistanceOperationAccess().getDistanceKeyword_1()); 
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
    // $ANTLR end "rule__DistanceOperation__Group__1__Impl"


    // $ANTLR start "rule__DistanceOperation__Group__2"
    // InternalLegoLang.g:3749:1: rule__DistanceOperation__Group__2 : rule__DistanceOperation__Group__2__Impl rule__DistanceOperation__Group__3 ;
    public final void rule__DistanceOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3753:1: ( rule__DistanceOperation__Group__2__Impl rule__DistanceOperation__Group__3 )
            // InternalLegoLang.g:3754:2: rule__DistanceOperation__Group__2__Impl rule__DistanceOperation__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__DistanceOperation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DistanceOperation__Group__3();

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
    // $ANTLR end "rule__DistanceOperation__Group__2"


    // $ANTLR start "rule__DistanceOperation__Group__2__Impl"
    // InternalLegoLang.g:3761:1: rule__DistanceOperation__Group__2__Impl : ( '(' ) ;
    public final void rule__DistanceOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3765:1: ( ( '(' ) )
            // InternalLegoLang.g:3766:1: ( '(' )
            {
            // InternalLegoLang.g:3766:1: ( '(' )
            // InternalLegoLang.g:3767:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDistanceOperationAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDistanceOperationAccess().getLeftParenthesisKeyword_2()); 
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
    // $ANTLR end "rule__DistanceOperation__Group__2__Impl"


    // $ANTLR start "rule__DistanceOperation__Group__3"
    // InternalLegoLang.g:3776:1: rule__DistanceOperation__Group__3 : rule__DistanceOperation__Group__3__Impl rule__DistanceOperation__Group__4 ;
    public final void rule__DistanceOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3780:1: ( rule__DistanceOperation__Group__3__Impl rule__DistanceOperation__Group__4 )
            // InternalLegoLang.g:3781:2: rule__DistanceOperation__Group__3__Impl rule__DistanceOperation__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__DistanceOperation__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DistanceOperation__Group__4();

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
    // $ANTLR end "rule__DistanceOperation__Group__3"


    // $ANTLR start "rule__DistanceOperation__Group__3__Impl"
    // InternalLegoLang.g:3788:1: rule__DistanceOperation__Group__3__Impl : ( ( rule__DistanceOperation__UltrasonicsensorAssignment_3 ) ) ;
    public final void rule__DistanceOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3792:1: ( ( ( rule__DistanceOperation__UltrasonicsensorAssignment_3 ) ) )
            // InternalLegoLang.g:3793:1: ( ( rule__DistanceOperation__UltrasonicsensorAssignment_3 ) )
            {
            // InternalLegoLang.g:3793:1: ( ( rule__DistanceOperation__UltrasonicsensorAssignment_3 ) )
            // InternalLegoLang.g:3794:2: ( rule__DistanceOperation__UltrasonicsensorAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDistanceOperationAccess().getUltrasonicsensorAssignment_3()); 
            }
            // InternalLegoLang.g:3795:2: ( rule__DistanceOperation__UltrasonicsensorAssignment_3 )
            // InternalLegoLang.g:3795:3: rule__DistanceOperation__UltrasonicsensorAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__DistanceOperation__UltrasonicsensorAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDistanceOperationAccess().getUltrasonicsensorAssignment_3()); 
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
    // $ANTLR end "rule__DistanceOperation__Group__3__Impl"


    // $ANTLR start "rule__DistanceOperation__Group__4"
    // InternalLegoLang.g:3803:1: rule__DistanceOperation__Group__4 : rule__DistanceOperation__Group__4__Impl ;
    public final void rule__DistanceOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3807:1: ( rule__DistanceOperation__Group__4__Impl )
            // InternalLegoLang.g:3808:2: rule__DistanceOperation__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DistanceOperation__Group__4__Impl();

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
    // $ANTLR end "rule__DistanceOperation__Group__4"


    // $ANTLR start "rule__DistanceOperation__Group__4__Impl"
    // InternalLegoLang.g:3814:1: rule__DistanceOperation__Group__4__Impl : ( ')' ) ;
    public final void rule__DistanceOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3818:1: ( ( ')' ) )
            // InternalLegoLang.g:3819:1: ( ')' )
            {
            // InternalLegoLang.g:3819:1: ( ')' )
            // InternalLegoLang.g:3820:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDistanceOperationAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDistanceOperationAccess().getRightParenthesisKeyword_4()); 
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
    // $ANTLR end "rule__DistanceOperation__Group__4__Impl"


    // $ANTLR start "rule__And__Group__0"
    // InternalLegoLang.g:3830:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3834:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // InternalLegoLang.g:3835:2: rule__And__Group__0__Impl rule__And__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__And__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__And__Group__1();

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
    // $ANTLR end "rule__And__Group__0"


    // $ANTLR start "rule__And__Group__0__Impl"
    // InternalLegoLang.g:3842:1: rule__And__Group__0__Impl : ( () ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3846:1: ( ( () ) )
            // InternalLegoLang.g:3847:1: ( () )
            {
            // InternalLegoLang.g:3847:1: ( () )
            // InternalLegoLang.g:3848:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getAndAction_0()); 
            }
            // InternalLegoLang.g:3849:2: ()
            // InternalLegoLang.g:3849:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getAndAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__0__Impl"


    // $ANTLR start "rule__And__Group__1"
    // InternalLegoLang.g:3857:1: rule__And__Group__1 : rule__And__Group__1__Impl rule__And__Group__2 ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3861:1: ( rule__And__Group__1__Impl rule__And__Group__2 )
            // InternalLegoLang.g:3862:2: rule__And__Group__1__Impl rule__And__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__And__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__And__Group__2();

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
    // $ANTLR end "rule__And__Group__1"


    // $ANTLR start "rule__And__Group__1__Impl"
    // InternalLegoLang.g:3869:1: rule__And__Group__1__Impl : ( '(' ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3873:1: ( ( '(' ) )
            // InternalLegoLang.g:3874:1: ( '(' )
            {
            // InternalLegoLang.g:3874:1: ( '(' )
            // InternalLegoLang.g:3875:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getLeftParenthesisKeyword_1()); 
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
    // $ANTLR end "rule__And__Group__1__Impl"


    // $ANTLR start "rule__And__Group__2"
    // InternalLegoLang.g:3884:1: rule__And__Group__2 : rule__And__Group__2__Impl rule__And__Group__3 ;
    public final void rule__And__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3888:1: ( rule__And__Group__2__Impl rule__And__Group__3 )
            // InternalLegoLang.g:3889:2: rule__And__Group__2__Impl rule__And__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__And__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__And__Group__3();

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
    // $ANTLR end "rule__And__Group__2"


    // $ANTLR start "rule__And__Group__2__Impl"
    // InternalLegoLang.g:3896:1: rule__And__Group__2__Impl : ( ( rule__And__LeftAssignment_2 ) ) ;
    public final void rule__And__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3900:1: ( ( ( rule__And__LeftAssignment_2 ) ) )
            // InternalLegoLang.g:3901:1: ( ( rule__And__LeftAssignment_2 ) )
            {
            // InternalLegoLang.g:3901:1: ( ( rule__And__LeftAssignment_2 ) )
            // InternalLegoLang.g:3902:2: ( rule__And__LeftAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getLeftAssignment_2()); 
            }
            // InternalLegoLang.g:3903:2: ( rule__And__LeftAssignment_2 )
            // InternalLegoLang.g:3903:3: rule__And__LeftAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__And__LeftAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getLeftAssignment_2()); 
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
    // $ANTLR end "rule__And__Group__2__Impl"


    // $ANTLR start "rule__And__Group__3"
    // InternalLegoLang.g:3911:1: rule__And__Group__3 : rule__And__Group__3__Impl rule__And__Group__4 ;
    public final void rule__And__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3915:1: ( rule__And__Group__3__Impl rule__And__Group__4 )
            // InternalLegoLang.g:3916:2: rule__And__Group__3__Impl rule__And__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__And__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__And__Group__4();

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
    // $ANTLR end "rule__And__Group__3"


    // $ANTLR start "rule__And__Group__3__Impl"
    // InternalLegoLang.g:3923:1: rule__And__Group__3__Impl : ( ( rule__And__Group_3__0 )? ) ;
    public final void rule__And__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3927:1: ( ( ( rule__And__Group_3__0 )? ) )
            // InternalLegoLang.g:3928:1: ( ( rule__And__Group_3__0 )? )
            {
            // InternalLegoLang.g:3928:1: ( ( rule__And__Group_3__0 )? )
            // InternalLegoLang.g:3929:2: ( rule__And__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getGroup_3()); 
            }
            // InternalLegoLang.g:3930:2: ( rule__And__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==36) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalLegoLang.g:3930:3: rule__And__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__And__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getGroup_3()); 
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
    // $ANTLR end "rule__And__Group__3__Impl"


    // $ANTLR start "rule__And__Group__4"
    // InternalLegoLang.g:3938:1: rule__And__Group__4 : rule__And__Group__4__Impl ;
    public final void rule__And__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3942:1: ( rule__And__Group__4__Impl )
            // InternalLegoLang.g:3943:2: rule__And__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__And__Group__4__Impl();

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
    // $ANTLR end "rule__And__Group__4"


    // $ANTLR start "rule__And__Group__4__Impl"
    // InternalLegoLang.g:3949:1: rule__And__Group__4__Impl : ( ')' ) ;
    public final void rule__And__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3953:1: ( ( ')' ) )
            // InternalLegoLang.g:3954:1: ( ')' )
            {
            // InternalLegoLang.g:3954:1: ( ')' )
            // InternalLegoLang.g:3955:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getRightParenthesisKeyword_4()); 
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
    // $ANTLR end "rule__And__Group__4__Impl"


    // $ANTLR start "rule__And__Group_3__0"
    // InternalLegoLang.g:3965:1: rule__And__Group_3__0 : rule__And__Group_3__0__Impl rule__And__Group_3__1 ;
    public final void rule__And__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3969:1: ( rule__And__Group_3__0__Impl rule__And__Group_3__1 )
            // InternalLegoLang.g:3970:2: rule__And__Group_3__0__Impl rule__And__Group_3__1
            {
            pushFollow(FOLLOW_15);
            rule__And__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__And__Group_3__1();

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
    // $ANTLR end "rule__And__Group_3__0"


    // $ANTLR start "rule__And__Group_3__0__Impl"
    // InternalLegoLang.g:3977:1: rule__And__Group_3__0__Impl : ( 'and' ) ;
    public final void rule__And__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3981:1: ( ( 'and' ) )
            // InternalLegoLang.g:3982:1: ( 'and' )
            {
            // InternalLegoLang.g:3982:1: ( 'and' )
            // InternalLegoLang.g:3983:2: 'and'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getAndKeyword_3_0()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getAndKeyword_3_0()); 
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
    // $ANTLR end "rule__And__Group_3__0__Impl"


    // $ANTLR start "rule__And__Group_3__1"
    // InternalLegoLang.g:3992:1: rule__And__Group_3__1 : rule__And__Group_3__1__Impl ;
    public final void rule__And__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3996:1: ( rule__And__Group_3__1__Impl )
            // InternalLegoLang.g:3997:2: rule__And__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__And__Group_3__1__Impl();

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
    // $ANTLR end "rule__And__Group_3__1"


    // $ANTLR start "rule__And__Group_3__1__Impl"
    // InternalLegoLang.g:4003:1: rule__And__Group_3__1__Impl : ( ( rule__And__RightAssignment_3_1 ) ) ;
    public final void rule__And__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4007:1: ( ( ( rule__And__RightAssignment_3_1 ) ) )
            // InternalLegoLang.g:4008:1: ( ( rule__And__RightAssignment_3_1 ) )
            {
            // InternalLegoLang.g:4008:1: ( ( rule__And__RightAssignment_3_1 ) )
            // InternalLegoLang.g:4009:2: ( rule__And__RightAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getRightAssignment_3_1()); 
            }
            // InternalLegoLang.g:4010:2: ( rule__And__RightAssignment_3_1 )
            // InternalLegoLang.g:4010:3: rule__And__RightAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__And__RightAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getRightAssignment_3_1()); 
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
    // $ANTLR end "rule__And__Group_3__1__Impl"


    // $ANTLR start "rule__Or__Group__0"
    // InternalLegoLang.g:4019:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4023:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // InternalLegoLang.g:4024:2: rule__Or__Group__0__Impl rule__Or__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Or__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Or__Group__1();

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
    // $ANTLR end "rule__Or__Group__0"


    // $ANTLR start "rule__Or__Group__0__Impl"
    // InternalLegoLang.g:4031:1: rule__Or__Group__0__Impl : ( () ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4035:1: ( ( () ) )
            // InternalLegoLang.g:4036:1: ( () )
            {
            // InternalLegoLang.g:4036:1: ( () )
            // InternalLegoLang.g:4037:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getOrAction_0()); 
            }
            // InternalLegoLang.g:4038:2: ()
            // InternalLegoLang.g:4038:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getOrAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__0__Impl"


    // $ANTLR start "rule__Or__Group__1"
    // InternalLegoLang.g:4046:1: rule__Or__Group__1 : rule__Or__Group__1__Impl rule__Or__Group__2 ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4050:1: ( rule__Or__Group__1__Impl rule__Or__Group__2 )
            // InternalLegoLang.g:4051:2: rule__Or__Group__1__Impl rule__Or__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Or__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Or__Group__2();

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
    // $ANTLR end "rule__Or__Group__1"


    // $ANTLR start "rule__Or__Group__1__Impl"
    // InternalLegoLang.g:4058:1: rule__Or__Group__1__Impl : ( '(' ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4062:1: ( ( '(' ) )
            // InternalLegoLang.g:4063:1: ( '(' )
            {
            // InternalLegoLang.g:4063:1: ( '(' )
            // InternalLegoLang.g:4064:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getLeftParenthesisKeyword_1()); 
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
    // $ANTLR end "rule__Or__Group__1__Impl"


    // $ANTLR start "rule__Or__Group__2"
    // InternalLegoLang.g:4073:1: rule__Or__Group__2 : rule__Or__Group__2__Impl rule__Or__Group__3 ;
    public final void rule__Or__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4077:1: ( rule__Or__Group__2__Impl rule__Or__Group__3 )
            // InternalLegoLang.g:4078:2: rule__Or__Group__2__Impl rule__Or__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__Or__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Or__Group__3();

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
    // $ANTLR end "rule__Or__Group__2"


    // $ANTLR start "rule__Or__Group__2__Impl"
    // InternalLegoLang.g:4085:1: rule__Or__Group__2__Impl : ( ( rule__Or__LeftAssignment_2 ) ) ;
    public final void rule__Or__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4089:1: ( ( ( rule__Or__LeftAssignment_2 ) ) )
            // InternalLegoLang.g:4090:1: ( ( rule__Or__LeftAssignment_2 ) )
            {
            // InternalLegoLang.g:4090:1: ( ( rule__Or__LeftAssignment_2 ) )
            // InternalLegoLang.g:4091:2: ( rule__Or__LeftAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getLeftAssignment_2()); 
            }
            // InternalLegoLang.g:4092:2: ( rule__Or__LeftAssignment_2 )
            // InternalLegoLang.g:4092:3: rule__Or__LeftAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Or__LeftAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getLeftAssignment_2()); 
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
    // $ANTLR end "rule__Or__Group__2__Impl"


    // $ANTLR start "rule__Or__Group__3"
    // InternalLegoLang.g:4100:1: rule__Or__Group__3 : rule__Or__Group__3__Impl rule__Or__Group__4 ;
    public final void rule__Or__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4104:1: ( rule__Or__Group__3__Impl rule__Or__Group__4 )
            // InternalLegoLang.g:4105:2: rule__Or__Group__3__Impl rule__Or__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__Or__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Or__Group__4();

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
    // $ANTLR end "rule__Or__Group__3"


    // $ANTLR start "rule__Or__Group__3__Impl"
    // InternalLegoLang.g:4112:1: rule__Or__Group__3__Impl : ( ( rule__Or__Group_3__0 )? ) ;
    public final void rule__Or__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4116:1: ( ( ( rule__Or__Group_3__0 )? ) )
            // InternalLegoLang.g:4117:1: ( ( rule__Or__Group_3__0 )? )
            {
            // InternalLegoLang.g:4117:1: ( ( rule__Or__Group_3__0 )? )
            // InternalLegoLang.g:4118:2: ( rule__Or__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getGroup_3()); 
            }
            // InternalLegoLang.g:4119:2: ( rule__Or__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==37) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalLegoLang.g:4119:3: rule__Or__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Or__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getGroup_3()); 
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
    // $ANTLR end "rule__Or__Group__3__Impl"


    // $ANTLR start "rule__Or__Group__4"
    // InternalLegoLang.g:4127:1: rule__Or__Group__4 : rule__Or__Group__4__Impl ;
    public final void rule__Or__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4131:1: ( rule__Or__Group__4__Impl )
            // InternalLegoLang.g:4132:2: rule__Or__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group__4__Impl();

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
    // $ANTLR end "rule__Or__Group__4"


    // $ANTLR start "rule__Or__Group__4__Impl"
    // InternalLegoLang.g:4138:1: rule__Or__Group__4__Impl : ( ')' ) ;
    public final void rule__Or__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4142:1: ( ( ')' ) )
            // InternalLegoLang.g:4143:1: ( ')' )
            {
            // InternalLegoLang.g:4143:1: ( ')' )
            // InternalLegoLang.g:4144:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getRightParenthesisKeyword_4()); 
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
    // $ANTLR end "rule__Or__Group__4__Impl"


    // $ANTLR start "rule__Or__Group_3__0"
    // InternalLegoLang.g:4154:1: rule__Or__Group_3__0 : rule__Or__Group_3__0__Impl rule__Or__Group_3__1 ;
    public final void rule__Or__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4158:1: ( rule__Or__Group_3__0__Impl rule__Or__Group_3__1 )
            // InternalLegoLang.g:4159:2: rule__Or__Group_3__0__Impl rule__Or__Group_3__1
            {
            pushFollow(FOLLOW_15);
            rule__Or__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Or__Group_3__1();

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
    // $ANTLR end "rule__Or__Group_3__0"


    // $ANTLR start "rule__Or__Group_3__0__Impl"
    // InternalLegoLang.g:4166:1: rule__Or__Group_3__0__Impl : ( 'or' ) ;
    public final void rule__Or__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4170:1: ( ( 'or' ) )
            // InternalLegoLang.g:4171:1: ( 'or' )
            {
            // InternalLegoLang.g:4171:1: ( 'or' )
            // InternalLegoLang.g:4172:2: 'or'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getOrKeyword_3_0()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getOrKeyword_3_0()); 
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
    // $ANTLR end "rule__Or__Group_3__0__Impl"


    // $ANTLR start "rule__Or__Group_3__1"
    // InternalLegoLang.g:4181:1: rule__Or__Group_3__1 : rule__Or__Group_3__1__Impl ;
    public final void rule__Or__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4185:1: ( rule__Or__Group_3__1__Impl )
            // InternalLegoLang.g:4186:2: rule__Or__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group_3__1__Impl();

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
    // $ANTLR end "rule__Or__Group_3__1"


    // $ANTLR start "rule__Or__Group_3__1__Impl"
    // InternalLegoLang.g:4192:1: rule__Or__Group_3__1__Impl : ( ( rule__Or__RightAssignment_3_1 ) ) ;
    public final void rule__Or__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4196:1: ( ( ( rule__Or__RightAssignment_3_1 ) ) )
            // InternalLegoLang.g:4197:1: ( ( rule__Or__RightAssignment_3_1 ) )
            {
            // InternalLegoLang.g:4197:1: ( ( rule__Or__RightAssignment_3_1 ) )
            // InternalLegoLang.g:4198:2: ( rule__Or__RightAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getRightAssignment_3_1()); 
            }
            // InternalLegoLang.g:4199:2: ( rule__Or__RightAssignment_3_1 )
            // InternalLegoLang.g:4199:3: rule__Or__RightAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Or__RightAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getRightAssignment_3_1()); 
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
    // $ANTLR end "rule__Or__Group_3__1__Impl"


    // $ANTLR start "rule__ConditionEtat__Group__0"
    // InternalLegoLang.g:4208:1: rule__ConditionEtat__Group__0 : rule__ConditionEtat__Group__0__Impl rule__ConditionEtat__Group__1 ;
    public final void rule__ConditionEtat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4212:1: ( rule__ConditionEtat__Group__0__Impl rule__ConditionEtat__Group__1 )
            // InternalLegoLang.g:4213:2: rule__ConditionEtat__Group__0__Impl rule__ConditionEtat__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalLegoLang.g:4220:1: rule__ConditionEtat__Group__0__Impl : ( 'if' ) ;
    public final void rule__ConditionEtat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4224:1: ( ( 'if' ) )
            // InternalLegoLang.g:4225:1: ( 'if' )
            {
            // InternalLegoLang.g:4225:1: ( 'if' )
            // InternalLegoLang.g:4226:2: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionEtatAccess().getIfKeyword_0()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:4235:1: rule__ConditionEtat__Group__1 : rule__ConditionEtat__Group__1__Impl rule__ConditionEtat__Group__2 ;
    public final void rule__ConditionEtat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4239:1: ( rule__ConditionEtat__Group__1__Impl rule__ConditionEtat__Group__2 )
            // InternalLegoLang.g:4240:2: rule__ConditionEtat__Group__1__Impl rule__ConditionEtat__Group__2
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
    // InternalLegoLang.g:4247:1: rule__ConditionEtat__Group__1__Impl : ( ( rule__ConditionEtat__ConditionAssignment_1 ) ) ;
    public final void rule__ConditionEtat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4251:1: ( ( ( rule__ConditionEtat__ConditionAssignment_1 ) ) )
            // InternalLegoLang.g:4252:1: ( ( rule__ConditionEtat__ConditionAssignment_1 ) )
            {
            // InternalLegoLang.g:4252:1: ( ( rule__ConditionEtat__ConditionAssignment_1 ) )
            // InternalLegoLang.g:4253:2: ( rule__ConditionEtat__ConditionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionEtatAccess().getConditionAssignment_1()); 
            }
            // InternalLegoLang.g:4254:2: ( rule__ConditionEtat__ConditionAssignment_1 )
            // InternalLegoLang.g:4254:3: rule__ConditionEtat__ConditionAssignment_1
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
    // InternalLegoLang.g:4262:1: rule__ConditionEtat__Group__2 : rule__ConditionEtat__Group__2__Impl rule__ConditionEtat__Group__3 ;
    public final void rule__ConditionEtat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4266:1: ( rule__ConditionEtat__Group__2__Impl rule__ConditionEtat__Group__3 )
            // InternalLegoLang.g:4267:2: rule__ConditionEtat__Group__2__Impl rule__ConditionEtat__Group__3
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
    // InternalLegoLang.g:4274:1: rule__ConditionEtat__Group__2__Impl : ( '{' ) ;
    public final void rule__ConditionEtat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4278:1: ( ( '{' ) )
            // InternalLegoLang.g:4279:1: ( '{' )
            {
            // InternalLegoLang.g:4279:1: ( '{' )
            // InternalLegoLang.g:4280:2: '{'
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
    // InternalLegoLang.g:4289:1: rule__ConditionEtat__Group__3 : rule__ConditionEtat__Group__3__Impl rule__ConditionEtat__Group__4 ;
    public final void rule__ConditionEtat__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4293:1: ( rule__ConditionEtat__Group__3__Impl rule__ConditionEtat__Group__4 )
            // InternalLegoLang.g:4294:2: rule__ConditionEtat__Group__3__Impl rule__ConditionEtat__Group__4
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
    // InternalLegoLang.g:4301:1: rule__ConditionEtat__Group__3__Impl : ( ( rule__ConditionEtat__ThenAssignment_3 )* ) ;
    public final void rule__ConditionEtat__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4305:1: ( ( ( rule__ConditionEtat__ThenAssignment_3 )* ) )
            // InternalLegoLang.g:4306:1: ( ( rule__ConditionEtat__ThenAssignment_3 )* )
            {
            // InternalLegoLang.g:4306:1: ( ( rule__ConditionEtat__ThenAssignment_3 )* )
            // InternalLegoLang.g:4307:2: ( rule__ConditionEtat__ThenAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionEtatAccess().getThenAssignment_3()); 
            }
            // InternalLegoLang.g:4308:2: ( rule__ConditionEtat__ThenAssignment_3 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_INT)||(LA16_0>=11 && LA16_0<=12)||(LA16_0>=16 && LA16_0<=23)||LA16_0==25||LA16_0==28||LA16_0==38||(LA16_0>=40 && LA16_0<=41)||LA16_0==44||LA16_0==56||LA16_0==58||(LA16_0>=60 && LA16_0<=62)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalLegoLang.g:4308:3: rule__ConditionEtat__ThenAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__ConditionEtat__ThenAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalLegoLang.g:4316:1: rule__ConditionEtat__Group__4 : rule__ConditionEtat__Group__4__Impl rule__ConditionEtat__Group__5 ;
    public final void rule__ConditionEtat__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4320:1: ( rule__ConditionEtat__Group__4__Impl rule__ConditionEtat__Group__5 )
            // InternalLegoLang.g:4321:2: rule__ConditionEtat__Group__4__Impl rule__ConditionEtat__Group__5
            {
            pushFollow(FOLLOW_25);
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
    // InternalLegoLang.g:4328:1: rule__ConditionEtat__Group__4__Impl : ( '}' ) ;
    public final void rule__ConditionEtat__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4332:1: ( ( '}' ) )
            // InternalLegoLang.g:4333:1: ( '}' )
            {
            // InternalLegoLang.g:4333:1: ( '}' )
            // InternalLegoLang.g:4334:2: '}'
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
    // InternalLegoLang.g:4343:1: rule__ConditionEtat__Group__5 : rule__ConditionEtat__Group__5__Impl ;
    public final void rule__ConditionEtat__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4347:1: ( rule__ConditionEtat__Group__5__Impl )
            // InternalLegoLang.g:4348:2: rule__ConditionEtat__Group__5__Impl
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
    // InternalLegoLang.g:4354:1: rule__ConditionEtat__Group__5__Impl : ( ( rule__ConditionEtat__Group_5__0 )? ) ;
    public final void rule__ConditionEtat__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4358:1: ( ( ( rule__ConditionEtat__Group_5__0 )? ) )
            // InternalLegoLang.g:4359:1: ( ( rule__ConditionEtat__Group_5__0 )? )
            {
            // InternalLegoLang.g:4359:1: ( ( rule__ConditionEtat__Group_5__0 )? )
            // InternalLegoLang.g:4360:2: ( rule__ConditionEtat__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionEtatAccess().getGroup_5()); 
            }
            // InternalLegoLang.g:4361:2: ( rule__ConditionEtat__Group_5__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==39) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalLegoLang.g:4361:3: rule__ConditionEtat__Group_5__0
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
    // InternalLegoLang.g:4370:1: rule__ConditionEtat__Group_5__0 : rule__ConditionEtat__Group_5__0__Impl rule__ConditionEtat__Group_5__1 ;
    public final void rule__ConditionEtat__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4374:1: ( rule__ConditionEtat__Group_5__0__Impl rule__ConditionEtat__Group_5__1 )
            // InternalLegoLang.g:4375:2: rule__ConditionEtat__Group_5__0__Impl rule__ConditionEtat__Group_5__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalLegoLang.g:4382:1: rule__ConditionEtat__Group_5__0__Impl : ( 'else{' ) ;
    public final void rule__ConditionEtat__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4386:1: ( ( 'else{' ) )
            // InternalLegoLang.g:4387:1: ( 'else{' )
            {
            // InternalLegoLang.g:4387:1: ( 'else{' )
            // InternalLegoLang.g:4388:2: 'else{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionEtatAccess().getElseKeyword_5_0()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:4397:1: rule__ConditionEtat__Group_5__1 : rule__ConditionEtat__Group_5__1__Impl rule__ConditionEtat__Group_5__2 ;
    public final void rule__ConditionEtat__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4401:1: ( rule__ConditionEtat__Group_5__1__Impl rule__ConditionEtat__Group_5__2 )
            // InternalLegoLang.g:4402:2: rule__ConditionEtat__Group_5__1__Impl rule__ConditionEtat__Group_5__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalLegoLang.g:4409:1: rule__ConditionEtat__Group_5__1__Impl : ( ( rule__ConditionEtat__ElseAssignment_5_1 ) ) ;
    public final void rule__ConditionEtat__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4413:1: ( ( ( rule__ConditionEtat__ElseAssignment_5_1 ) ) )
            // InternalLegoLang.g:4414:1: ( ( rule__ConditionEtat__ElseAssignment_5_1 ) )
            {
            // InternalLegoLang.g:4414:1: ( ( rule__ConditionEtat__ElseAssignment_5_1 ) )
            // InternalLegoLang.g:4415:2: ( rule__ConditionEtat__ElseAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionEtatAccess().getElseAssignment_5_1()); 
            }
            // InternalLegoLang.g:4416:2: ( rule__ConditionEtat__ElseAssignment_5_1 )
            // InternalLegoLang.g:4416:3: rule__ConditionEtat__ElseAssignment_5_1
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
    // InternalLegoLang.g:4424:1: rule__ConditionEtat__Group_5__2 : rule__ConditionEtat__Group_5__2__Impl ;
    public final void rule__ConditionEtat__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4428:1: ( rule__ConditionEtat__Group_5__2__Impl )
            // InternalLegoLang.g:4429:2: rule__ConditionEtat__Group_5__2__Impl
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
    // InternalLegoLang.g:4435:1: rule__ConditionEtat__Group_5__2__Impl : ( '}' ) ;
    public final void rule__ConditionEtat__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4439:1: ( ( '}' ) )
            // InternalLegoLang.g:4440:1: ( '}' )
            {
            // InternalLegoLang.g:4440:1: ( '}' )
            // InternalLegoLang.g:4441:2: '}'
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
    // InternalLegoLang.g:4451:1: rule__WhileLoop__Group__0 : rule__WhileLoop__Group__0__Impl rule__WhileLoop__Group__1 ;
    public final void rule__WhileLoop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4455:1: ( rule__WhileLoop__Group__0__Impl rule__WhileLoop__Group__1 )
            // InternalLegoLang.g:4456:2: rule__WhileLoop__Group__0__Impl rule__WhileLoop__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalLegoLang.g:4463:1: rule__WhileLoop__Group__0__Impl : ( 'while' ) ;
    public final void rule__WhileLoop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4467:1: ( ( 'while' ) )
            // InternalLegoLang.g:4468:1: ( 'while' )
            {
            // InternalLegoLang.g:4468:1: ( 'while' )
            // InternalLegoLang.g:4469:2: 'while'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileLoopAccess().getWhileKeyword_0()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:4478:1: rule__WhileLoop__Group__1 : rule__WhileLoop__Group__1__Impl rule__WhileLoop__Group__2 ;
    public final void rule__WhileLoop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4482:1: ( rule__WhileLoop__Group__1__Impl rule__WhileLoop__Group__2 )
            // InternalLegoLang.g:4483:2: rule__WhileLoop__Group__1__Impl rule__WhileLoop__Group__2
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
    // InternalLegoLang.g:4490:1: rule__WhileLoop__Group__1__Impl : ( ( rule__WhileLoop__LoopConditionAssignment_1 ) ) ;
    public final void rule__WhileLoop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4494:1: ( ( ( rule__WhileLoop__LoopConditionAssignment_1 ) ) )
            // InternalLegoLang.g:4495:1: ( ( rule__WhileLoop__LoopConditionAssignment_1 ) )
            {
            // InternalLegoLang.g:4495:1: ( ( rule__WhileLoop__LoopConditionAssignment_1 ) )
            // InternalLegoLang.g:4496:2: ( rule__WhileLoop__LoopConditionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileLoopAccess().getLoopConditionAssignment_1()); 
            }
            // InternalLegoLang.g:4497:2: ( rule__WhileLoop__LoopConditionAssignment_1 )
            // InternalLegoLang.g:4497:3: rule__WhileLoop__LoopConditionAssignment_1
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
    // InternalLegoLang.g:4505:1: rule__WhileLoop__Group__2 : rule__WhileLoop__Group__2__Impl rule__WhileLoop__Group__3 ;
    public final void rule__WhileLoop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4509:1: ( rule__WhileLoop__Group__2__Impl rule__WhileLoop__Group__3 )
            // InternalLegoLang.g:4510:2: rule__WhileLoop__Group__2__Impl rule__WhileLoop__Group__3
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
    // InternalLegoLang.g:4517:1: rule__WhileLoop__Group__2__Impl : ( '{' ) ;
    public final void rule__WhileLoop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4521:1: ( ( '{' ) )
            // InternalLegoLang.g:4522:1: ( '{' )
            {
            // InternalLegoLang.g:4522:1: ( '{' )
            // InternalLegoLang.g:4523:2: '{'
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
    // InternalLegoLang.g:4532:1: rule__WhileLoop__Group__3 : rule__WhileLoop__Group__3__Impl rule__WhileLoop__Group__4 ;
    public final void rule__WhileLoop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4536:1: ( rule__WhileLoop__Group__3__Impl rule__WhileLoop__Group__4 )
            // InternalLegoLang.g:4537:2: rule__WhileLoop__Group__3__Impl rule__WhileLoop__Group__4
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
    // InternalLegoLang.g:4544:1: rule__WhileLoop__Group__3__Impl : ( ( rule__WhileLoop__StatementAssignment_3 )* ) ;
    public final void rule__WhileLoop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4548:1: ( ( ( rule__WhileLoop__StatementAssignment_3 )* ) )
            // InternalLegoLang.g:4549:1: ( ( rule__WhileLoop__StatementAssignment_3 )* )
            {
            // InternalLegoLang.g:4549:1: ( ( rule__WhileLoop__StatementAssignment_3 )* )
            // InternalLegoLang.g:4550:2: ( rule__WhileLoop__StatementAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileLoopAccess().getStatementAssignment_3()); 
            }
            // InternalLegoLang.g:4551:2: ( rule__WhileLoop__StatementAssignment_3 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=RULE_STRING && LA18_0<=RULE_INT)||(LA18_0>=11 && LA18_0<=12)||(LA18_0>=16 && LA18_0<=23)||LA18_0==25||LA18_0==28||LA18_0==38||(LA18_0>=40 && LA18_0<=41)||LA18_0==44||LA18_0==56||LA18_0==58||(LA18_0>=60 && LA18_0<=62)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalLegoLang.g:4551:3: rule__WhileLoop__StatementAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__WhileLoop__StatementAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalLegoLang.g:4559:1: rule__WhileLoop__Group__4 : rule__WhileLoop__Group__4__Impl ;
    public final void rule__WhileLoop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4563:1: ( rule__WhileLoop__Group__4__Impl )
            // InternalLegoLang.g:4564:2: rule__WhileLoop__Group__4__Impl
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
    // InternalLegoLang.g:4570:1: rule__WhileLoop__Group__4__Impl : ( '}' ) ;
    public final void rule__WhileLoop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4574:1: ( ( '}' ) )
            // InternalLegoLang.g:4575:1: ( '}' )
            {
            // InternalLegoLang.g:4575:1: ( '}' )
            // InternalLegoLang.g:4576:2: '}'
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
    // InternalLegoLang.g:4586:1: rule__MethodePrint__Group__0 : rule__MethodePrint__Group__0__Impl rule__MethodePrint__Group__1 ;
    public final void rule__MethodePrint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4590:1: ( rule__MethodePrint__Group__0__Impl rule__MethodePrint__Group__1 )
            // InternalLegoLang.g:4591:2: rule__MethodePrint__Group__0__Impl rule__MethodePrint__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalLegoLang.g:4598:1: rule__MethodePrint__Group__0__Impl : ( () ) ;
    public final void rule__MethodePrint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4602:1: ( ( () ) )
            // InternalLegoLang.g:4603:1: ( () )
            {
            // InternalLegoLang.g:4603:1: ( () )
            // InternalLegoLang.g:4604:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodePrintAccess().getMethodePrintAction_0()); 
            }
            // InternalLegoLang.g:4605:2: ()
            // InternalLegoLang.g:4605:3: 
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
    // InternalLegoLang.g:4613:1: rule__MethodePrint__Group__1 : rule__MethodePrint__Group__1__Impl rule__MethodePrint__Group__2 ;
    public final void rule__MethodePrint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4617:1: ( rule__MethodePrint__Group__1__Impl rule__MethodePrint__Group__2 )
            // InternalLegoLang.g:4618:2: rule__MethodePrint__Group__1__Impl rule__MethodePrint__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalLegoLang.g:4625:1: rule__MethodePrint__Group__1__Impl : ( 'print(' ) ;
    public final void rule__MethodePrint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4629:1: ( ( 'print(' ) )
            // InternalLegoLang.g:4630:1: ( 'print(' )
            {
            // InternalLegoLang.g:4630:1: ( 'print(' )
            // InternalLegoLang.g:4631:2: 'print('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodePrintAccess().getPrintKeyword_1()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:4640:1: rule__MethodePrint__Group__2 : rule__MethodePrint__Group__2__Impl rule__MethodePrint__Group__3 ;
    public final void rule__MethodePrint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4644:1: ( rule__MethodePrint__Group__2__Impl rule__MethodePrint__Group__3 )
            // InternalLegoLang.g:4645:2: rule__MethodePrint__Group__2__Impl rule__MethodePrint__Group__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalLegoLang.g:4652:1: rule__MethodePrint__Group__2__Impl : ( ( ( rule__MethodePrint__Group_2__0 ) ) ( ( rule__MethodePrint__Group_2__0 )* ) ) ;
    public final void rule__MethodePrint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4656:1: ( ( ( ( rule__MethodePrint__Group_2__0 ) ) ( ( rule__MethodePrint__Group_2__0 )* ) ) )
            // InternalLegoLang.g:4657:1: ( ( ( rule__MethodePrint__Group_2__0 ) ) ( ( rule__MethodePrint__Group_2__0 )* ) )
            {
            // InternalLegoLang.g:4657:1: ( ( ( rule__MethodePrint__Group_2__0 ) ) ( ( rule__MethodePrint__Group_2__0 )* ) )
            // InternalLegoLang.g:4658:2: ( ( rule__MethodePrint__Group_2__0 ) ) ( ( rule__MethodePrint__Group_2__0 )* )
            {
            // InternalLegoLang.g:4658:2: ( ( rule__MethodePrint__Group_2__0 ) )
            // InternalLegoLang.g:4659:3: ( rule__MethodePrint__Group_2__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodePrintAccess().getGroup_2()); 
            }
            // InternalLegoLang.g:4660:3: ( rule__MethodePrint__Group_2__0 )
            // InternalLegoLang.g:4660:4: rule__MethodePrint__Group_2__0
            {
            pushFollow(FOLLOW_30);
            rule__MethodePrint__Group_2__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodePrintAccess().getGroup_2()); 
            }

            }

            // InternalLegoLang.g:4663:2: ( ( rule__MethodePrint__Group_2__0 )* )
            // InternalLegoLang.g:4664:3: ( rule__MethodePrint__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodePrintAccess().getGroup_2()); 
            }
            // InternalLegoLang.g:4665:3: ( rule__MethodePrint__Group_2__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=RULE_STRING && LA19_0<=RULE_INT)||(LA19_0>=11 && LA19_0<=12)||LA19_0==23||LA19_0==25||LA19_0==28||LA19_0==44) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalLegoLang.g:4665:4: rule__MethodePrint__Group_2__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__MethodePrint__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalLegoLang.g:4674:1: rule__MethodePrint__Group__3 : rule__MethodePrint__Group__3__Impl ;
    public final void rule__MethodePrint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4678:1: ( rule__MethodePrint__Group__3__Impl )
            // InternalLegoLang.g:4679:2: rule__MethodePrint__Group__3__Impl
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
    // InternalLegoLang.g:4685:1: rule__MethodePrint__Group__3__Impl : ( ');' ) ;
    public final void rule__MethodePrint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4689:1: ( ( ');' ) )
            // InternalLegoLang.g:4690:1: ( ');' )
            {
            // InternalLegoLang.g:4690:1: ( ');' )
            // InternalLegoLang.g:4691:2: ');'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodePrintAccess().getRightParenthesisSemicolonKeyword_3()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:4701:1: rule__MethodePrint__Group_2__0 : rule__MethodePrint__Group_2__0__Impl rule__MethodePrint__Group_2__1 ;
    public final void rule__MethodePrint__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4705:1: ( rule__MethodePrint__Group_2__0__Impl rule__MethodePrint__Group_2__1 )
            // InternalLegoLang.g:4706:2: rule__MethodePrint__Group_2__0__Impl rule__MethodePrint__Group_2__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalLegoLang.g:4713:1: rule__MethodePrint__Group_2__0__Impl : ( ( rule__MethodePrint__ExpressionAssignment_2_0 ) ) ;
    public final void rule__MethodePrint__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4717:1: ( ( ( rule__MethodePrint__ExpressionAssignment_2_0 ) ) )
            // InternalLegoLang.g:4718:1: ( ( rule__MethodePrint__ExpressionAssignment_2_0 ) )
            {
            // InternalLegoLang.g:4718:1: ( ( rule__MethodePrint__ExpressionAssignment_2_0 ) )
            // InternalLegoLang.g:4719:2: ( rule__MethodePrint__ExpressionAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodePrintAccess().getExpressionAssignment_2_0()); 
            }
            // InternalLegoLang.g:4720:2: ( rule__MethodePrint__ExpressionAssignment_2_0 )
            // InternalLegoLang.g:4720:3: rule__MethodePrint__ExpressionAssignment_2_0
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
    // InternalLegoLang.g:4728:1: rule__MethodePrint__Group_2__1 : rule__MethodePrint__Group_2__1__Impl ;
    public final void rule__MethodePrint__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4732:1: ( rule__MethodePrint__Group_2__1__Impl )
            // InternalLegoLang.g:4733:2: rule__MethodePrint__Group_2__1__Impl
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
    // InternalLegoLang.g:4739:1: rule__MethodePrint__Group_2__1__Impl : ( ',' ) ;
    public final void rule__MethodePrint__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4743:1: ( ( ',' ) )
            // InternalLegoLang.g:4744:1: ( ',' )
            {
            // InternalLegoLang.g:4744:1: ( ',' )
            // InternalLegoLang.g:4745:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodePrintAccess().getCommaKeyword_2_1()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:4755:1: rule__Substraction__Group__0 : rule__Substraction__Group__0__Impl rule__Substraction__Group__1 ;
    public final void rule__Substraction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4759:1: ( rule__Substraction__Group__0__Impl rule__Substraction__Group__1 )
            // InternalLegoLang.g:4760:2: rule__Substraction__Group__0__Impl rule__Substraction__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalLegoLang.g:4767:1: rule__Substraction__Group__0__Impl : ( '(' ) ;
    public final void rule__Substraction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4771:1: ( ( '(' ) )
            // InternalLegoLang.g:4772:1: ( '(' )
            {
            // InternalLegoLang.g:4772:1: ( '(' )
            // InternalLegoLang.g:4773:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstractionAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:4782:1: rule__Substraction__Group__1 : rule__Substraction__Group__1__Impl rule__Substraction__Group__2 ;
    public final void rule__Substraction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4786:1: ( rule__Substraction__Group__1__Impl rule__Substraction__Group__2 )
            // InternalLegoLang.g:4787:2: rule__Substraction__Group__1__Impl rule__Substraction__Group__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalLegoLang.g:4794:1: rule__Substraction__Group__1__Impl : ( ( rule__Substraction__LeftAssignment_1 ) ) ;
    public final void rule__Substraction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4798:1: ( ( ( rule__Substraction__LeftAssignment_1 ) ) )
            // InternalLegoLang.g:4799:1: ( ( rule__Substraction__LeftAssignment_1 ) )
            {
            // InternalLegoLang.g:4799:1: ( ( rule__Substraction__LeftAssignment_1 ) )
            // InternalLegoLang.g:4800:2: ( rule__Substraction__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstractionAccess().getLeftAssignment_1()); 
            }
            // InternalLegoLang.g:4801:2: ( rule__Substraction__LeftAssignment_1 )
            // InternalLegoLang.g:4801:3: rule__Substraction__LeftAssignment_1
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
    // InternalLegoLang.g:4809:1: rule__Substraction__Group__2 : rule__Substraction__Group__2__Impl rule__Substraction__Group__3 ;
    public final void rule__Substraction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4813:1: ( rule__Substraction__Group__2__Impl rule__Substraction__Group__3 )
            // InternalLegoLang.g:4814:2: rule__Substraction__Group__2__Impl rule__Substraction__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalLegoLang.g:4821:1: rule__Substraction__Group__2__Impl : ( '-' ) ;
    public final void rule__Substraction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4825:1: ( ( '-' ) )
            // InternalLegoLang.g:4826:1: ( '-' )
            {
            // InternalLegoLang.g:4826:1: ( '-' )
            // InternalLegoLang.g:4827:2: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstractionAccess().getHyphenMinusKeyword_2()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:4836:1: rule__Substraction__Group__3 : rule__Substraction__Group__3__Impl rule__Substraction__Group__4 ;
    public final void rule__Substraction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4840:1: ( rule__Substraction__Group__3__Impl rule__Substraction__Group__4 )
            // InternalLegoLang.g:4841:2: rule__Substraction__Group__3__Impl rule__Substraction__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalLegoLang.g:4848:1: rule__Substraction__Group__3__Impl : ( ( rule__Substraction__RightAssignment_3 ) ) ;
    public final void rule__Substraction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4852:1: ( ( ( rule__Substraction__RightAssignment_3 ) ) )
            // InternalLegoLang.g:4853:1: ( ( rule__Substraction__RightAssignment_3 ) )
            {
            // InternalLegoLang.g:4853:1: ( ( rule__Substraction__RightAssignment_3 ) )
            // InternalLegoLang.g:4854:2: ( rule__Substraction__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstractionAccess().getRightAssignment_3()); 
            }
            // InternalLegoLang.g:4855:2: ( rule__Substraction__RightAssignment_3 )
            // InternalLegoLang.g:4855:3: rule__Substraction__RightAssignment_3
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
    // InternalLegoLang.g:4863:1: rule__Substraction__Group__4 : rule__Substraction__Group__4__Impl ;
    public final void rule__Substraction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4867:1: ( rule__Substraction__Group__4__Impl )
            // InternalLegoLang.g:4868:2: rule__Substraction__Group__4__Impl
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
    // InternalLegoLang.g:4874:1: rule__Substraction__Group__4__Impl : ( ')' ) ;
    public final void rule__Substraction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4878:1: ( ( ')' ) )
            // InternalLegoLang.g:4879:1: ( ')' )
            {
            // InternalLegoLang.g:4879:1: ( ')' )
            // InternalLegoLang.g:4880:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstractionAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:4890:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4894:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // InternalLegoLang.g:4895:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalLegoLang.g:4902:1: rule__Addition__Group__0__Impl : ( '(' ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4906:1: ( ( '(' ) )
            // InternalLegoLang.g:4907:1: ( '(' )
            {
            // InternalLegoLang.g:4907:1: ( '(' )
            // InternalLegoLang.g:4908:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:4917:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl rule__Addition__Group__2 ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4921:1: ( rule__Addition__Group__1__Impl rule__Addition__Group__2 )
            // InternalLegoLang.g:4922:2: rule__Addition__Group__1__Impl rule__Addition__Group__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalLegoLang.g:4929:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__LeftAssignment_1 ) ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4933:1: ( ( ( rule__Addition__LeftAssignment_1 ) ) )
            // InternalLegoLang.g:4934:1: ( ( rule__Addition__LeftAssignment_1 ) )
            {
            // InternalLegoLang.g:4934:1: ( ( rule__Addition__LeftAssignment_1 ) )
            // InternalLegoLang.g:4935:2: ( rule__Addition__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getLeftAssignment_1()); 
            }
            // InternalLegoLang.g:4936:2: ( rule__Addition__LeftAssignment_1 )
            // InternalLegoLang.g:4936:3: rule__Addition__LeftAssignment_1
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
    // InternalLegoLang.g:4944:1: rule__Addition__Group__2 : rule__Addition__Group__2__Impl rule__Addition__Group__3 ;
    public final void rule__Addition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4948:1: ( rule__Addition__Group__2__Impl rule__Addition__Group__3 )
            // InternalLegoLang.g:4949:2: rule__Addition__Group__2__Impl rule__Addition__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalLegoLang.g:4956:1: rule__Addition__Group__2__Impl : ( '+' ) ;
    public final void rule__Addition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4960:1: ( ( '+' ) )
            // InternalLegoLang.g:4961:1: ( '+' )
            {
            // InternalLegoLang.g:4961:1: ( '+' )
            // InternalLegoLang.g:4962:2: '+'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getPlusSignKeyword_2()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:4971:1: rule__Addition__Group__3 : rule__Addition__Group__3__Impl rule__Addition__Group__4 ;
    public final void rule__Addition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4975:1: ( rule__Addition__Group__3__Impl rule__Addition__Group__4 )
            // InternalLegoLang.g:4976:2: rule__Addition__Group__3__Impl rule__Addition__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalLegoLang.g:4983:1: rule__Addition__Group__3__Impl : ( ( rule__Addition__RightAssignment_3 ) ) ;
    public final void rule__Addition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4987:1: ( ( ( rule__Addition__RightAssignment_3 ) ) )
            // InternalLegoLang.g:4988:1: ( ( rule__Addition__RightAssignment_3 ) )
            {
            // InternalLegoLang.g:4988:1: ( ( rule__Addition__RightAssignment_3 ) )
            // InternalLegoLang.g:4989:2: ( rule__Addition__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getRightAssignment_3()); 
            }
            // InternalLegoLang.g:4990:2: ( rule__Addition__RightAssignment_3 )
            // InternalLegoLang.g:4990:3: rule__Addition__RightAssignment_3
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
    // InternalLegoLang.g:4998:1: rule__Addition__Group__4 : rule__Addition__Group__4__Impl ;
    public final void rule__Addition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5002:1: ( rule__Addition__Group__4__Impl )
            // InternalLegoLang.g:5003:2: rule__Addition__Group__4__Impl
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
    // InternalLegoLang.g:5009:1: rule__Addition__Group__4__Impl : ( ')' ) ;
    public final void rule__Addition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5013:1: ( ( ')' ) )
            // InternalLegoLang.g:5014:1: ( ')' )
            {
            // InternalLegoLang.g:5014:1: ( ')' )
            // InternalLegoLang.g:5015:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:5025:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5029:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // InternalLegoLang.g:5030:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalLegoLang.g:5037:1: rule__Multiplication__Group__0__Impl : ( '(' ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5041:1: ( ( '(' ) )
            // InternalLegoLang.g:5042:1: ( '(' )
            {
            // InternalLegoLang.g:5042:1: ( '(' )
            // InternalLegoLang.g:5043:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:5052:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl rule__Multiplication__Group__2 ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5056:1: ( rule__Multiplication__Group__1__Impl rule__Multiplication__Group__2 )
            // InternalLegoLang.g:5057:2: rule__Multiplication__Group__1__Impl rule__Multiplication__Group__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalLegoLang.g:5064:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__LeftAssignment_1 ) ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5068:1: ( ( ( rule__Multiplication__LeftAssignment_1 ) ) )
            // InternalLegoLang.g:5069:1: ( ( rule__Multiplication__LeftAssignment_1 ) )
            {
            // InternalLegoLang.g:5069:1: ( ( rule__Multiplication__LeftAssignment_1 ) )
            // InternalLegoLang.g:5070:2: ( rule__Multiplication__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getLeftAssignment_1()); 
            }
            // InternalLegoLang.g:5071:2: ( rule__Multiplication__LeftAssignment_1 )
            // InternalLegoLang.g:5071:3: rule__Multiplication__LeftAssignment_1
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
    // InternalLegoLang.g:5079:1: rule__Multiplication__Group__2 : rule__Multiplication__Group__2__Impl rule__Multiplication__Group__3 ;
    public final void rule__Multiplication__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5083:1: ( rule__Multiplication__Group__2__Impl rule__Multiplication__Group__3 )
            // InternalLegoLang.g:5084:2: rule__Multiplication__Group__2__Impl rule__Multiplication__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalLegoLang.g:5091:1: rule__Multiplication__Group__2__Impl : ( '*' ) ;
    public final void rule__Multiplication__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5095:1: ( ( '*' ) )
            // InternalLegoLang.g:5096:1: ( '*' )
            {
            // InternalLegoLang.g:5096:1: ( '*' )
            // InternalLegoLang.g:5097:2: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_2()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:5106:1: rule__Multiplication__Group__3 : rule__Multiplication__Group__3__Impl rule__Multiplication__Group__4 ;
    public final void rule__Multiplication__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5110:1: ( rule__Multiplication__Group__3__Impl rule__Multiplication__Group__4 )
            // InternalLegoLang.g:5111:2: rule__Multiplication__Group__3__Impl rule__Multiplication__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalLegoLang.g:5118:1: rule__Multiplication__Group__3__Impl : ( ( rule__Multiplication__RightAssignment_3 ) ) ;
    public final void rule__Multiplication__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5122:1: ( ( ( rule__Multiplication__RightAssignment_3 ) ) )
            // InternalLegoLang.g:5123:1: ( ( rule__Multiplication__RightAssignment_3 ) )
            {
            // InternalLegoLang.g:5123:1: ( ( rule__Multiplication__RightAssignment_3 ) )
            // InternalLegoLang.g:5124:2: ( rule__Multiplication__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getRightAssignment_3()); 
            }
            // InternalLegoLang.g:5125:2: ( rule__Multiplication__RightAssignment_3 )
            // InternalLegoLang.g:5125:3: rule__Multiplication__RightAssignment_3
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
    // InternalLegoLang.g:5133:1: rule__Multiplication__Group__4 : rule__Multiplication__Group__4__Impl ;
    public final void rule__Multiplication__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5137:1: ( rule__Multiplication__Group__4__Impl )
            // InternalLegoLang.g:5138:2: rule__Multiplication__Group__4__Impl
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
    // InternalLegoLang.g:5144:1: rule__Multiplication__Group__4__Impl : ( ')' ) ;
    public final void rule__Multiplication__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5148:1: ( ( ')' ) )
            // InternalLegoLang.g:5149:1: ( ')' )
            {
            // InternalLegoLang.g:5149:1: ( ')' )
            // InternalLegoLang.g:5150:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:5160:1: rule__Division__Group__0 : rule__Division__Group__0__Impl rule__Division__Group__1 ;
    public final void rule__Division__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5164:1: ( rule__Division__Group__0__Impl rule__Division__Group__1 )
            // InternalLegoLang.g:5165:2: rule__Division__Group__0__Impl rule__Division__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalLegoLang.g:5172:1: rule__Division__Group__0__Impl : ( '(' ) ;
    public final void rule__Division__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5176:1: ( ( '(' ) )
            // InternalLegoLang.g:5177:1: ( '(' )
            {
            // InternalLegoLang.g:5177:1: ( '(' )
            // InternalLegoLang.g:5178:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivisionAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:5187:1: rule__Division__Group__1 : rule__Division__Group__1__Impl rule__Division__Group__2 ;
    public final void rule__Division__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5191:1: ( rule__Division__Group__1__Impl rule__Division__Group__2 )
            // InternalLegoLang.g:5192:2: rule__Division__Group__1__Impl rule__Division__Group__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalLegoLang.g:5199:1: rule__Division__Group__1__Impl : ( ( rule__Division__LeftAssignment_1 ) ) ;
    public final void rule__Division__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5203:1: ( ( ( rule__Division__LeftAssignment_1 ) ) )
            // InternalLegoLang.g:5204:1: ( ( rule__Division__LeftAssignment_1 ) )
            {
            // InternalLegoLang.g:5204:1: ( ( rule__Division__LeftAssignment_1 ) )
            // InternalLegoLang.g:5205:2: ( rule__Division__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivisionAccess().getLeftAssignment_1()); 
            }
            // InternalLegoLang.g:5206:2: ( rule__Division__LeftAssignment_1 )
            // InternalLegoLang.g:5206:3: rule__Division__LeftAssignment_1
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
    // InternalLegoLang.g:5214:1: rule__Division__Group__2 : rule__Division__Group__2__Impl rule__Division__Group__3 ;
    public final void rule__Division__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5218:1: ( rule__Division__Group__2__Impl rule__Division__Group__3 )
            // InternalLegoLang.g:5219:2: rule__Division__Group__2__Impl rule__Division__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalLegoLang.g:5226:1: rule__Division__Group__2__Impl : ( '/' ) ;
    public final void rule__Division__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5230:1: ( ( '/' ) )
            // InternalLegoLang.g:5231:1: ( '/' )
            {
            // InternalLegoLang.g:5231:1: ( '/' )
            // InternalLegoLang.g:5232:2: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivisionAccess().getSolidusKeyword_2()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:5241:1: rule__Division__Group__3 : rule__Division__Group__3__Impl rule__Division__Group__4 ;
    public final void rule__Division__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5245:1: ( rule__Division__Group__3__Impl rule__Division__Group__4 )
            // InternalLegoLang.g:5246:2: rule__Division__Group__3__Impl rule__Division__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalLegoLang.g:5253:1: rule__Division__Group__3__Impl : ( ( rule__Division__RightAssignment_3 ) ) ;
    public final void rule__Division__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5257:1: ( ( ( rule__Division__RightAssignment_3 ) ) )
            // InternalLegoLang.g:5258:1: ( ( rule__Division__RightAssignment_3 ) )
            {
            // InternalLegoLang.g:5258:1: ( ( rule__Division__RightAssignment_3 ) )
            // InternalLegoLang.g:5259:2: ( rule__Division__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivisionAccess().getRightAssignment_3()); 
            }
            // InternalLegoLang.g:5260:2: ( rule__Division__RightAssignment_3 )
            // InternalLegoLang.g:5260:3: rule__Division__RightAssignment_3
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
    // InternalLegoLang.g:5268:1: rule__Division__Group__4 : rule__Division__Group__4__Impl ;
    public final void rule__Division__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5272:1: ( rule__Division__Group__4__Impl )
            // InternalLegoLang.g:5273:2: rule__Division__Group__4__Impl
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
    // InternalLegoLang.g:5279:1: rule__Division__Group__4__Impl : ( ')' ) ;
    public final void rule__Division__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5283:1: ( ( ')' ) )
            // InternalLegoLang.g:5284:1: ( ')' )
            {
            // InternalLegoLang.g:5284:1: ( ')' )
            // InternalLegoLang.g:5285:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivisionAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:5295:1: rule__GT__Group__0 : rule__GT__Group__0__Impl rule__GT__Group__1 ;
    public final void rule__GT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5299:1: ( rule__GT__Group__0__Impl rule__GT__Group__1 )
            // InternalLegoLang.g:5300:2: rule__GT__Group__0__Impl rule__GT__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalLegoLang.g:5307:1: rule__GT__Group__0__Impl : ( '(' ) ;
    public final void rule__GT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5311:1: ( ( '(' ) )
            // InternalLegoLang.g:5312:1: ( '(' )
            {
            // InternalLegoLang.g:5312:1: ( '(' )
            // InternalLegoLang.g:5313:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:5322:1: rule__GT__Group__1 : rule__GT__Group__1__Impl rule__GT__Group__2 ;
    public final void rule__GT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5326:1: ( rule__GT__Group__1__Impl rule__GT__Group__2 )
            // InternalLegoLang.g:5327:2: rule__GT__Group__1__Impl rule__GT__Group__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalLegoLang.g:5334:1: rule__GT__Group__1__Impl : ( ( rule__GT__LeftAssignment_1 ) ) ;
    public final void rule__GT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5338:1: ( ( ( rule__GT__LeftAssignment_1 ) ) )
            // InternalLegoLang.g:5339:1: ( ( rule__GT__LeftAssignment_1 ) )
            {
            // InternalLegoLang.g:5339:1: ( ( rule__GT__LeftAssignment_1 ) )
            // InternalLegoLang.g:5340:2: ( rule__GT__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTAccess().getLeftAssignment_1()); 
            }
            // InternalLegoLang.g:5341:2: ( rule__GT__LeftAssignment_1 )
            // InternalLegoLang.g:5341:3: rule__GT__LeftAssignment_1
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
    // InternalLegoLang.g:5349:1: rule__GT__Group__2 : rule__GT__Group__2__Impl rule__GT__Group__3 ;
    public final void rule__GT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5353:1: ( rule__GT__Group__2__Impl rule__GT__Group__3 )
            // InternalLegoLang.g:5354:2: rule__GT__Group__2__Impl rule__GT__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalLegoLang.g:5361:1: rule__GT__Group__2__Impl : ( '>' ) ;
    public final void rule__GT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5365:1: ( ( '>' ) )
            // InternalLegoLang.g:5366:1: ( '>' )
            {
            // InternalLegoLang.g:5366:1: ( '>' )
            // InternalLegoLang.g:5367:2: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTAccess().getGreaterThanSignKeyword_2()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:5376:1: rule__GT__Group__3 : rule__GT__Group__3__Impl rule__GT__Group__4 ;
    public final void rule__GT__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5380:1: ( rule__GT__Group__3__Impl rule__GT__Group__4 )
            // InternalLegoLang.g:5381:2: rule__GT__Group__3__Impl rule__GT__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalLegoLang.g:5388:1: rule__GT__Group__3__Impl : ( ( rule__GT__RightAssignment_3 ) ) ;
    public final void rule__GT__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5392:1: ( ( ( rule__GT__RightAssignment_3 ) ) )
            // InternalLegoLang.g:5393:1: ( ( rule__GT__RightAssignment_3 ) )
            {
            // InternalLegoLang.g:5393:1: ( ( rule__GT__RightAssignment_3 ) )
            // InternalLegoLang.g:5394:2: ( rule__GT__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTAccess().getRightAssignment_3()); 
            }
            // InternalLegoLang.g:5395:2: ( rule__GT__RightAssignment_3 )
            // InternalLegoLang.g:5395:3: rule__GT__RightAssignment_3
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
    // InternalLegoLang.g:5403:1: rule__GT__Group__4 : rule__GT__Group__4__Impl ;
    public final void rule__GT__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5407:1: ( rule__GT__Group__4__Impl )
            // InternalLegoLang.g:5408:2: rule__GT__Group__4__Impl
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
    // InternalLegoLang.g:5414:1: rule__GT__Group__4__Impl : ( ')' ) ;
    public final void rule__GT__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5418:1: ( ( ')' ) )
            // InternalLegoLang.g:5419:1: ( ')' )
            {
            // InternalLegoLang.g:5419:1: ( ')' )
            // InternalLegoLang.g:5420:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:5430:1: rule__LT__Group__0 : rule__LT__Group__0__Impl rule__LT__Group__1 ;
    public final void rule__LT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5434:1: ( rule__LT__Group__0__Impl rule__LT__Group__1 )
            // InternalLegoLang.g:5435:2: rule__LT__Group__0__Impl rule__LT__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalLegoLang.g:5442:1: rule__LT__Group__0__Impl : ( '(' ) ;
    public final void rule__LT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5446:1: ( ( '(' ) )
            // InternalLegoLang.g:5447:1: ( '(' )
            {
            // InternalLegoLang.g:5447:1: ( '(' )
            // InternalLegoLang.g:5448:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:5457:1: rule__LT__Group__1 : rule__LT__Group__1__Impl rule__LT__Group__2 ;
    public final void rule__LT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5461:1: ( rule__LT__Group__1__Impl rule__LT__Group__2 )
            // InternalLegoLang.g:5462:2: rule__LT__Group__1__Impl rule__LT__Group__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalLegoLang.g:5469:1: rule__LT__Group__1__Impl : ( ( rule__LT__LeftAssignment_1 ) ) ;
    public final void rule__LT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5473:1: ( ( ( rule__LT__LeftAssignment_1 ) ) )
            // InternalLegoLang.g:5474:1: ( ( rule__LT__LeftAssignment_1 ) )
            {
            // InternalLegoLang.g:5474:1: ( ( rule__LT__LeftAssignment_1 ) )
            // InternalLegoLang.g:5475:2: ( rule__LT__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTAccess().getLeftAssignment_1()); 
            }
            // InternalLegoLang.g:5476:2: ( rule__LT__LeftAssignment_1 )
            // InternalLegoLang.g:5476:3: rule__LT__LeftAssignment_1
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
    // InternalLegoLang.g:5484:1: rule__LT__Group__2 : rule__LT__Group__2__Impl rule__LT__Group__3 ;
    public final void rule__LT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5488:1: ( rule__LT__Group__2__Impl rule__LT__Group__3 )
            // InternalLegoLang.g:5489:2: rule__LT__Group__2__Impl rule__LT__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalLegoLang.g:5496:1: rule__LT__Group__2__Impl : ( '<' ) ;
    public final void rule__LT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5500:1: ( ( '<' ) )
            // InternalLegoLang.g:5501:1: ( '<' )
            {
            // InternalLegoLang.g:5501:1: ( '<' )
            // InternalLegoLang.g:5502:2: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTAccess().getLessThanSignKeyword_2()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:5511:1: rule__LT__Group__3 : rule__LT__Group__3__Impl rule__LT__Group__4 ;
    public final void rule__LT__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5515:1: ( rule__LT__Group__3__Impl rule__LT__Group__4 )
            // InternalLegoLang.g:5516:2: rule__LT__Group__3__Impl rule__LT__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalLegoLang.g:5523:1: rule__LT__Group__3__Impl : ( ( rule__LT__RightAssignment_3 ) ) ;
    public final void rule__LT__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5527:1: ( ( ( rule__LT__RightAssignment_3 ) ) )
            // InternalLegoLang.g:5528:1: ( ( rule__LT__RightAssignment_3 ) )
            {
            // InternalLegoLang.g:5528:1: ( ( rule__LT__RightAssignment_3 ) )
            // InternalLegoLang.g:5529:2: ( rule__LT__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTAccess().getRightAssignment_3()); 
            }
            // InternalLegoLang.g:5530:2: ( rule__LT__RightAssignment_3 )
            // InternalLegoLang.g:5530:3: rule__LT__RightAssignment_3
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
    // InternalLegoLang.g:5538:1: rule__LT__Group__4 : rule__LT__Group__4__Impl ;
    public final void rule__LT__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5542:1: ( rule__LT__Group__4__Impl )
            // InternalLegoLang.g:5543:2: rule__LT__Group__4__Impl
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
    // InternalLegoLang.g:5549:1: rule__LT__Group__4__Impl : ( ')' ) ;
    public final void rule__LT__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5553:1: ( ( ')' ) )
            // InternalLegoLang.g:5554:1: ( ')' )
            {
            // InternalLegoLang.g:5554:1: ( ')' )
            // InternalLegoLang.g:5555:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:5565:1: rule__Equal__Group__0 : rule__Equal__Group__0__Impl rule__Equal__Group__1 ;
    public final void rule__Equal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5569:1: ( rule__Equal__Group__0__Impl rule__Equal__Group__1 )
            // InternalLegoLang.g:5570:2: rule__Equal__Group__0__Impl rule__Equal__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalLegoLang.g:5577:1: rule__Equal__Group__0__Impl : ( '(' ) ;
    public final void rule__Equal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5581:1: ( ( '(' ) )
            // InternalLegoLang.g:5582:1: ( '(' )
            {
            // InternalLegoLang.g:5582:1: ( '(' )
            // InternalLegoLang.g:5583:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:5592:1: rule__Equal__Group__1 : rule__Equal__Group__1__Impl rule__Equal__Group__2 ;
    public final void rule__Equal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5596:1: ( rule__Equal__Group__1__Impl rule__Equal__Group__2 )
            // InternalLegoLang.g:5597:2: rule__Equal__Group__1__Impl rule__Equal__Group__2
            {
            pushFollow(FOLLOW_38);
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
    // InternalLegoLang.g:5604:1: rule__Equal__Group__1__Impl : ( ( rule__Equal__LeftAssignment_1 ) ) ;
    public final void rule__Equal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5608:1: ( ( ( rule__Equal__LeftAssignment_1 ) ) )
            // InternalLegoLang.g:5609:1: ( ( rule__Equal__LeftAssignment_1 ) )
            {
            // InternalLegoLang.g:5609:1: ( ( rule__Equal__LeftAssignment_1 ) )
            // InternalLegoLang.g:5610:2: ( rule__Equal__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualAccess().getLeftAssignment_1()); 
            }
            // InternalLegoLang.g:5611:2: ( rule__Equal__LeftAssignment_1 )
            // InternalLegoLang.g:5611:3: rule__Equal__LeftAssignment_1
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
    // InternalLegoLang.g:5619:1: rule__Equal__Group__2 : rule__Equal__Group__2__Impl rule__Equal__Group__3 ;
    public final void rule__Equal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5623:1: ( rule__Equal__Group__2__Impl rule__Equal__Group__3 )
            // InternalLegoLang.g:5624:2: rule__Equal__Group__2__Impl rule__Equal__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalLegoLang.g:5631:1: rule__Equal__Group__2__Impl : ( '==' ) ;
    public final void rule__Equal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5635:1: ( ( '==' ) )
            // InternalLegoLang.g:5636:1: ( '==' )
            {
            // InternalLegoLang.g:5636:1: ( '==' )
            // InternalLegoLang.g:5637:2: '=='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualAccess().getEqualsSignEqualsSignKeyword_2()); 
            }
            match(input,50,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:5646:1: rule__Equal__Group__3 : rule__Equal__Group__3__Impl rule__Equal__Group__4 ;
    public final void rule__Equal__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5650:1: ( rule__Equal__Group__3__Impl rule__Equal__Group__4 )
            // InternalLegoLang.g:5651:2: rule__Equal__Group__3__Impl rule__Equal__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalLegoLang.g:5658:1: rule__Equal__Group__3__Impl : ( ( rule__Equal__RightAssignment_3 ) ) ;
    public final void rule__Equal__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5662:1: ( ( ( rule__Equal__RightAssignment_3 ) ) )
            // InternalLegoLang.g:5663:1: ( ( rule__Equal__RightAssignment_3 ) )
            {
            // InternalLegoLang.g:5663:1: ( ( rule__Equal__RightAssignment_3 ) )
            // InternalLegoLang.g:5664:2: ( rule__Equal__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualAccess().getRightAssignment_3()); 
            }
            // InternalLegoLang.g:5665:2: ( rule__Equal__RightAssignment_3 )
            // InternalLegoLang.g:5665:3: rule__Equal__RightAssignment_3
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
    // InternalLegoLang.g:5673:1: rule__Equal__Group__4 : rule__Equal__Group__4__Impl ;
    public final void rule__Equal__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5677:1: ( rule__Equal__Group__4__Impl )
            // InternalLegoLang.g:5678:2: rule__Equal__Group__4__Impl
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
    // InternalLegoLang.g:5684:1: rule__Equal__Group__4__Impl : ( ')' ) ;
    public final void rule__Equal__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5688:1: ( ( ')' ) )
            // InternalLegoLang.g:5689:1: ( ')' )
            {
            // InternalLegoLang.g:5689:1: ( ')' )
            // InternalLegoLang.g:5690:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:5700:1: rule__Different__Group__0 : rule__Different__Group__0__Impl rule__Different__Group__1 ;
    public final void rule__Different__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5704:1: ( rule__Different__Group__0__Impl rule__Different__Group__1 )
            // InternalLegoLang.g:5705:2: rule__Different__Group__0__Impl rule__Different__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalLegoLang.g:5712:1: rule__Different__Group__0__Impl : ( '(' ) ;
    public final void rule__Different__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5716:1: ( ( '(' ) )
            // InternalLegoLang.g:5717:1: ( '(' )
            {
            // InternalLegoLang.g:5717:1: ( '(' )
            // InternalLegoLang.g:5718:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDifferentAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:5727:1: rule__Different__Group__1 : rule__Different__Group__1__Impl rule__Different__Group__2 ;
    public final void rule__Different__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5731:1: ( rule__Different__Group__1__Impl rule__Different__Group__2 )
            // InternalLegoLang.g:5732:2: rule__Different__Group__1__Impl rule__Different__Group__2
            {
            pushFollow(FOLLOW_39);
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
    // InternalLegoLang.g:5739:1: rule__Different__Group__1__Impl : ( ( rule__Different__LeftAssignment_1 ) ) ;
    public final void rule__Different__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5743:1: ( ( ( rule__Different__LeftAssignment_1 ) ) )
            // InternalLegoLang.g:5744:1: ( ( rule__Different__LeftAssignment_1 ) )
            {
            // InternalLegoLang.g:5744:1: ( ( rule__Different__LeftAssignment_1 ) )
            // InternalLegoLang.g:5745:2: ( rule__Different__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDifferentAccess().getLeftAssignment_1()); 
            }
            // InternalLegoLang.g:5746:2: ( rule__Different__LeftAssignment_1 )
            // InternalLegoLang.g:5746:3: rule__Different__LeftAssignment_1
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
    // InternalLegoLang.g:5754:1: rule__Different__Group__2 : rule__Different__Group__2__Impl rule__Different__Group__3 ;
    public final void rule__Different__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5758:1: ( rule__Different__Group__2__Impl rule__Different__Group__3 )
            // InternalLegoLang.g:5759:2: rule__Different__Group__2__Impl rule__Different__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalLegoLang.g:5766:1: rule__Different__Group__2__Impl : ( '!=' ) ;
    public final void rule__Different__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5770:1: ( ( '!=' ) )
            // InternalLegoLang.g:5771:1: ( '!=' )
            {
            // InternalLegoLang.g:5771:1: ( '!=' )
            // InternalLegoLang.g:5772:2: '!='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDifferentAccess().getExclamationMarkEqualsSignKeyword_2()); 
            }
            match(input,51,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:5781:1: rule__Different__Group__3 : rule__Different__Group__3__Impl rule__Different__Group__4 ;
    public final void rule__Different__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5785:1: ( rule__Different__Group__3__Impl rule__Different__Group__4 )
            // InternalLegoLang.g:5786:2: rule__Different__Group__3__Impl rule__Different__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalLegoLang.g:5793:1: rule__Different__Group__3__Impl : ( ( rule__Different__RightAssignment_3 ) ) ;
    public final void rule__Different__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5797:1: ( ( ( rule__Different__RightAssignment_3 ) ) )
            // InternalLegoLang.g:5798:1: ( ( rule__Different__RightAssignment_3 ) )
            {
            // InternalLegoLang.g:5798:1: ( ( rule__Different__RightAssignment_3 ) )
            // InternalLegoLang.g:5799:2: ( rule__Different__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDifferentAccess().getRightAssignment_3()); 
            }
            // InternalLegoLang.g:5800:2: ( rule__Different__RightAssignment_3 )
            // InternalLegoLang.g:5800:3: rule__Different__RightAssignment_3
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
    // InternalLegoLang.g:5808:1: rule__Different__Group__4 : rule__Different__Group__4__Impl ;
    public final void rule__Different__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5812:1: ( rule__Different__Group__4__Impl )
            // InternalLegoLang.g:5813:2: rule__Different__Group__4__Impl
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
    // InternalLegoLang.g:5819:1: rule__Different__Group__4__Impl : ( ')' ) ;
    public final void rule__Different__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5823:1: ( ( ')' ) )
            // InternalLegoLang.g:5824:1: ( ')' )
            {
            // InternalLegoLang.g:5824:1: ( ')' )
            // InternalLegoLang.g:5825:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDifferentAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:5835:1: rule__LTorEqual__Group__0 : rule__LTorEqual__Group__0__Impl rule__LTorEqual__Group__1 ;
    public final void rule__LTorEqual__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5839:1: ( rule__LTorEqual__Group__0__Impl rule__LTorEqual__Group__1 )
            // InternalLegoLang.g:5840:2: rule__LTorEqual__Group__0__Impl rule__LTorEqual__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalLegoLang.g:5847:1: rule__LTorEqual__Group__0__Impl : ( '(' ) ;
    public final void rule__LTorEqual__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5851:1: ( ( '(' ) )
            // InternalLegoLang.g:5852:1: ( '(' )
            {
            // InternalLegoLang.g:5852:1: ( '(' )
            // InternalLegoLang.g:5853:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTorEqualAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:5862:1: rule__LTorEqual__Group__1 : rule__LTorEqual__Group__1__Impl rule__LTorEqual__Group__2 ;
    public final void rule__LTorEqual__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5866:1: ( rule__LTorEqual__Group__1__Impl rule__LTorEqual__Group__2 )
            // InternalLegoLang.g:5867:2: rule__LTorEqual__Group__1__Impl rule__LTorEqual__Group__2
            {
            pushFollow(FOLLOW_40);
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
    // InternalLegoLang.g:5874:1: rule__LTorEqual__Group__1__Impl : ( ( rule__LTorEqual__LeftAssignment_1 ) ) ;
    public final void rule__LTorEqual__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5878:1: ( ( ( rule__LTorEqual__LeftAssignment_1 ) ) )
            // InternalLegoLang.g:5879:1: ( ( rule__LTorEqual__LeftAssignment_1 ) )
            {
            // InternalLegoLang.g:5879:1: ( ( rule__LTorEqual__LeftAssignment_1 ) )
            // InternalLegoLang.g:5880:2: ( rule__LTorEqual__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTorEqualAccess().getLeftAssignment_1()); 
            }
            // InternalLegoLang.g:5881:2: ( rule__LTorEqual__LeftAssignment_1 )
            // InternalLegoLang.g:5881:3: rule__LTorEqual__LeftAssignment_1
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
    // InternalLegoLang.g:5889:1: rule__LTorEqual__Group__2 : rule__LTorEqual__Group__2__Impl rule__LTorEqual__Group__3 ;
    public final void rule__LTorEqual__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5893:1: ( rule__LTorEqual__Group__2__Impl rule__LTorEqual__Group__3 )
            // InternalLegoLang.g:5894:2: rule__LTorEqual__Group__2__Impl rule__LTorEqual__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalLegoLang.g:5901:1: rule__LTorEqual__Group__2__Impl : ( '<=' ) ;
    public final void rule__LTorEqual__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5905:1: ( ( '<=' ) )
            // InternalLegoLang.g:5906:1: ( '<=' )
            {
            // InternalLegoLang.g:5906:1: ( '<=' )
            // InternalLegoLang.g:5907:2: '<='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTorEqualAccess().getLessThanSignEqualsSignKeyword_2()); 
            }
            match(input,52,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:5916:1: rule__LTorEqual__Group__3 : rule__LTorEqual__Group__3__Impl rule__LTorEqual__Group__4 ;
    public final void rule__LTorEqual__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5920:1: ( rule__LTorEqual__Group__3__Impl rule__LTorEqual__Group__4 )
            // InternalLegoLang.g:5921:2: rule__LTorEqual__Group__3__Impl rule__LTorEqual__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalLegoLang.g:5928:1: rule__LTorEqual__Group__3__Impl : ( ( rule__LTorEqual__RightAssignment_3 ) ) ;
    public final void rule__LTorEqual__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5932:1: ( ( ( rule__LTorEqual__RightAssignment_3 ) ) )
            // InternalLegoLang.g:5933:1: ( ( rule__LTorEqual__RightAssignment_3 ) )
            {
            // InternalLegoLang.g:5933:1: ( ( rule__LTorEqual__RightAssignment_3 ) )
            // InternalLegoLang.g:5934:2: ( rule__LTorEqual__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTorEqualAccess().getRightAssignment_3()); 
            }
            // InternalLegoLang.g:5935:2: ( rule__LTorEqual__RightAssignment_3 )
            // InternalLegoLang.g:5935:3: rule__LTorEqual__RightAssignment_3
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
    // InternalLegoLang.g:5943:1: rule__LTorEqual__Group__4 : rule__LTorEqual__Group__4__Impl ;
    public final void rule__LTorEqual__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5947:1: ( rule__LTorEqual__Group__4__Impl )
            // InternalLegoLang.g:5948:2: rule__LTorEqual__Group__4__Impl
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
    // InternalLegoLang.g:5954:1: rule__LTorEqual__Group__4__Impl : ( ')' ) ;
    public final void rule__LTorEqual__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5958:1: ( ( ')' ) )
            // InternalLegoLang.g:5959:1: ( ')' )
            {
            // InternalLegoLang.g:5959:1: ( ')' )
            // InternalLegoLang.g:5960:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTorEqualAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:5970:1: rule__GTorEqual__Group__0 : rule__GTorEqual__Group__0__Impl rule__GTorEqual__Group__1 ;
    public final void rule__GTorEqual__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5974:1: ( rule__GTorEqual__Group__0__Impl rule__GTorEqual__Group__1 )
            // InternalLegoLang.g:5975:2: rule__GTorEqual__Group__0__Impl rule__GTorEqual__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalLegoLang.g:5982:1: rule__GTorEqual__Group__0__Impl : ( '(' ) ;
    public final void rule__GTorEqual__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5986:1: ( ( '(' ) )
            // InternalLegoLang.g:5987:1: ( '(' )
            {
            // InternalLegoLang.g:5987:1: ( '(' )
            // InternalLegoLang.g:5988:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTorEqualAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:5997:1: rule__GTorEqual__Group__1 : rule__GTorEqual__Group__1__Impl rule__GTorEqual__Group__2 ;
    public final void rule__GTorEqual__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6001:1: ( rule__GTorEqual__Group__1__Impl rule__GTorEqual__Group__2 )
            // InternalLegoLang.g:6002:2: rule__GTorEqual__Group__1__Impl rule__GTorEqual__Group__2
            {
            pushFollow(FOLLOW_41);
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
    // InternalLegoLang.g:6009:1: rule__GTorEqual__Group__1__Impl : ( ( rule__GTorEqual__LeftAssignment_1 ) ) ;
    public final void rule__GTorEqual__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6013:1: ( ( ( rule__GTorEqual__LeftAssignment_1 ) ) )
            // InternalLegoLang.g:6014:1: ( ( rule__GTorEqual__LeftAssignment_1 ) )
            {
            // InternalLegoLang.g:6014:1: ( ( rule__GTorEqual__LeftAssignment_1 ) )
            // InternalLegoLang.g:6015:2: ( rule__GTorEqual__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTorEqualAccess().getLeftAssignment_1()); 
            }
            // InternalLegoLang.g:6016:2: ( rule__GTorEqual__LeftAssignment_1 )
            // InternalLegoLang.g:6016:3: rule__GTorEqual__LeftAssignment_1
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
    // InternalLegoLang.g:6024:1: rule__GTorEqual__Group__2 : rule__GTorEqual__Group__2__Impl rule__GTorEqual__Group__3 ;
    public final void rule__GTorEqual__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6028:1: ( rule__GTorEqual__Group__2__Impl rule__GTorEqual__Group__3 )
            // InternalLegoLang.g:6029:2: rule__GTorEqual__Group__2__Impl rule__GTorEqual__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalLegoLang.g:6036:1: rule__GTorEqual__Group__2__Impl : ( '>=' ) ;
    public final void rule__GTorEqual__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6040:1: ( ( '>=' ) )
            // InternalLegoLang.g:6041:1: ( '>=' )
            {
            // InternalLegoLang.g:6041:1: ( '>=' )
            // InternalLegoLang.g:6042:2: '>='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTorEqualAccess().getGreaterThanSignEqualsSignKeyword_2()); 
            }
            match(input,53,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:6051:1: rule__GTorEqual__Group__3 : rule__GTorEqual__Group__3__Impl rule__GTorEqual__Group__4 ;
    public final void rule__GTorEqual__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6055:1: ( rule__GTorEqual__Group__3__Impl rule__GTorEqual__Group__4 )
            // InternalLegoLang.g:6056:2: rule__GTorEqual__Group__3__Impl rule__GTorEqual__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalLegoLang.g:6063:1: rule__GTorEqual__Group__3__Impl : ( ( rule__GTorEqual__RightAssignment_3 ) ) ;
    public final void rule__GTorEqual__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6067:1: ( ( ( rule__GTorEqual__RightAssignment_3 ) ) )
            // InternalLegoLang.g:6068:1: ( ( rule__GTorEqual__RightAssignment_3 ) )
            {
            // InternalLegoLang.g:6068:1: ( ( rule__GTorEqual__RightAssignment_3 ) )
            // InternalLegoLang.g:6069:2: ( rule__GTorEqual__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTorEqualAccess().getRightAssignment_3()); 
            }
            // InternalLegoLang.g:6070:2: ( rule__GTorEqual__RightAssignment_3 )
            // InternalLegoLang.g:6070:3: rule__GTorEqual__RightAssignment_3
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
    // InternalLegoLang.g:6078:1: rule__GTorEqual__Group__4 : rule__GTorEqual__Group__4__Impl ;
    public final void rule__GTorEqual__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6082:1: ( rule__GTorEqual__Group__4__Impl )
            // InternalLegoLang.g:6083:2: rule__GTorEqual__Group__4__Impl
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
    // InternalLegoLang.g:6089:1: rule__GTorEqual__Group__4__Impl : ( ')' ) ;
    public final void rule__GTorEqual__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6093:1: ( ( ')' ) )
            // InternalLegoLang.g:6094:1: ( ')' )
            {
            // InternalLegoLang.g:6094:1: ( ')' )
            // InternalLegoLang.g:6095:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTorEqualAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:6105:1: rule__Assignement__Group__0 : rule__Assignement__Group__0__Impl rule__Assignement__Group__1 ;
    public final void rule__Assignement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6109:1: ( rule__Assignement__Group__0__Impl rule__Assignement__Group__1 )
            // InternalLegoLang.g:6110:2: rule__Assignement__Group__0__Impl rule__Assignement__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalLegoLang.g:6117:1: rule__Assignement__Group__0__Impl : ( () ) ;
    public final void rule__Assignement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6121:1: ( ( () ) )
            // InternalLegoLang.g:6122:1: ( () )
            {
            // InternalLegoLang.g:6122:1: ( () )
            // InternalLegoLang.g:6123:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignementAccess().getAssignementAction_0()); 
            }
            // InternalLegoLang.g:6124:2: ()
            // InternalLegoLang.g:6124:3: 
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
    // InternalLegoLang.g:6132:1: rule__Assignement__Group__1 : rule__Assignement__Group__1__Impl rule__Assignement__Group__2 ;
    public final void rule__Assignement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6136:1: ( rule__Assignement__Group__1__Impl rule__Assignement__Group__2 )
            // InternalLegoLang.g:6137:2: rule__Assignement__Group__1__Impl rule__Assignement__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalLegoLang.g:6144:1: rule__Assignement__Group__1__Impl : ( '(' ) ;
    public final void rule__Assignement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6148:1: ( ( '(' ) )
            // InternalLegoLang.g:6149:1: ( '(' )
            {
            // InternalLegoLang.g:6149:1: ( '(' )
            // InternalLegoLang.g:6150:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignementAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:6159:1: rule__Assignement__Group__2 : rule__Assignement__Group__2__Impl rule__Assignement__Group__3 ;
    public final void rule__Assignement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6163:1: ( rule__Assignement__Group__2__Impl rule__Assignement__Group__3 )
            // InternalLegoLang.g:6164:2: rule__Assignement__Group__2__Impl rule__Assignement__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalLegoLang.g:6171:1: rule__Assignement__Group__2__Impl : ( ( rule__Assignement__LeftAssignment_2 ) ) ;
    public final void rule__Assignement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6175:1: ( ( ( rule__Assignement__LeftAssignment_2 ) ) )
            // InternalLegoLang.g:6176:1: ( ( rule__Assignement__LeftAssignment_2 ) )
            {
            // InternalLegoLang.g:6176:1: ( ( rule__Assignement__LeftAssignment_2 ) )
            // InternalLegoLang.g:6177:2: ( rule__Assignement__LeftAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignementAccess().getLeftAssignment_2()); 
            }
            // InternalLegoLang.g:6178:2: ( rule__Assignement__LeftAssignment_2 )
            // InternalLegoLang.g:6178:3: rule__Assignement__LeftAssignment_2
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
    // InternalLegoLang.g:6186:1: rule__Assignement__Group__3 : rule__Assignement__Group__3__Impl rule__Assignement__Group__4 ;
    public final void rule__Assignement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6190:1: ( rule__Assignement__Group__3__Impl rule__Assignement__Group__4 )
            // InternalLegoLang.g:6191:2: rule__Assignement__Group__3__Impl rule__Assignement__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalLegoLang.g:6198:1: rule__Assignement__Group__3__Impl : ( '=' ) ;
    public final void rule__Assignement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6202:1: ( ( '=' ) )
            // InternalLegoLang.g:6203:1: ( '=' )
            {
            // InternalLegoLang.g:6203:1: ( '=' )
            // InternalLegoLang.g:6204:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignementAccess().getEqualsSignKeyword_3()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:6213:1: rule__Assignement__Group__4 : rule__Assignement__Group__4__Impl rule__Assignement__Group__5 ;
    public final void rule__Assignement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6217:1: ( rule__Assignement__Group__4__Impl rule__Assignement__Group__5 )
            // InternalLegoLang.g:6218:2: rule__Assignement__Group__4__Impl rule__Assignement__Group__5
            {
            pushFollow(FOLLOW_29);
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
    // InternalLegoLang.g:6225:1: rule__Assignement__Group__4__Impl : ( ( rule__Assignement__RightAssignment_4 ) ) ;
    public final void rule__Assignement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6229:1: ( ( ( rule__Assignement__RightAssignment_4 ) ) )
            // InternalLegoLang.g:6230:1: ( ( rule__Assignement__RightAssignment_4 ) )
            {
            // InternalLegoLang.g:6230:1: ( ( rule__Assignement__RightAssignment_4 ) )
            // InternalLegoLang.g:6231:2: ( rule__Assignement__RightAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignementAccess().getRightAssignment_4()); 
            }
            // InternalLegoLang.g:6232:2: ( rule__Assignement__RightAssignment_4 )
            // InternalLegoLang.g:6232:3: rule__Assignement__RightAssignment_4
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
    // InternalLegoLang.g:6240:1: rule__Assignement__Group__5 : rule__Assignement__Group__5__Impl ;
    public final void rule__Assignement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6244:1: ( rule__Assignement__Group__5__Impl )
            // InternalLegoLang.g:6245:2: rule__Assignement__Group__5__Impl
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
    // InternalLegoLang.g:6251:1: rule__Assignement__Group__5__Impl : ( ');' ) ;
    public final void rule__Assignement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6255:1: ( ( ');' ) )
            // InternalLegoLang.g:6256:1: ( ');' )
            {
            // InternalLegoLang.g:6256:1: ( ');' )
            // InternalLegoLang.g:6257:2: ');'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignementAccess().getRightParenthesisSemicolonKeyword_5()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:6267:1: rule__PlusEqual__Group__0 : rule__PlusEqual__Group__0__Impl rule__PlusEqual__Group__1 ;
    public final void rule__PlusEqual__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6271:1: ( rule__PlusEqual__Group__0__Impl rule__PlusEqual__Group__1 )
            // InternalLegoLang.g:6272:2: rule__PlusEqual__Group__0__Impl rule__PlusEqual__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalLegoLang.g:6279:1: rule__PlusEqual__Group__0__Impl : ( () ) ;
    public final void rule__PlusEqual__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6283:1: ( ( () ) )
            // InternalLegoLang.g:6284:1: ( () )
            {
            // InternalLegoLang.g:6284:1: ( () )
            // InternalLegoLang.g:6285:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusEqualAccess().getPlusEqualAction_0()); 
            }
            // InternalLegoLang.g:6286:2: ()
            // InternalLegoLang.g:6286:3: 
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
    // InternalLegoLang.g:6294:1: rule__PlusEqual__Group__1 : rule__PlusEqual__Group__1__Impl rule__PlusEqual__Group__2 ;
    public final void rule__PlusEqual__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6298:1: ( rule__PlusEqual__Group__1__Impl rule__PlusEqual__Group__2 )
            // InternalLegoLang.g:6299:2: rule__PlusEqual__Group__1__Impl rule__PlusEqual__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalLegoLang.g:6306:1: rule__PlusEqual__Group__1__Impl : ( '(' ) ;
    public final void rule__PlusEqual__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6310:1: ( ( '(' ) )
            // InternalLegoLang.g:6311:1: ( '(' )
            {
            // InternalLegoLang.g:6311:1: ( '(' )
            // InternalLegoLang.g:6312:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusEqualAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:6321:1: rule__PlusEqual__Group__2 : rule__PlusEqual__Group__2__Impl rule__PlusEqual__Group__3 ;
    public final void rule__PlusEqual__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6325:1: ( rule__PlusEqual__Group__2__Impl rule__PlusEqual__Group__3 )
            // InternalLegoLang.g:6326:2: rule__PlusEqual__Group__2__Impl rule__PlusEqual__Group__3
            {
            pushFollow(FOLLOW_42);
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
    // InternalLegoLang.g:6333:1: rule__PlusEqual__Group__2__Impl : ( ( rule__PlusEqual__LeftAssignment_2 ) ) ;
    public final void rule__PlusEqual__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6337:1: ( ( ( rule__PlusEqual__LeftAssignment_2 ) ) )
            // InternalLegoLang.g:6338:1: ( ( rule__PlusEqual__LeftAssignment_2 ) )
            {
            // InternalLegoLang.g:6338:1: ( ( rule__PlusEqual__LeftAssignment_2 ) )
            // InternalLegoLang.g:6339:2: ( rule__PlusEqual__LeftAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusEqualAccess().getLeftAssignment_2()); 
            }
            // InternalLegoLang.g:6340:2: ( rule__PlusEqual__LeftAssignment_2 )
            // InternalLegoLang.g:6340:3: rule__PlusEqual__LeftAssignment_2
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
    // InternalLegoLang.g:6348:1: rule__PlusEqual__Group__3 : rule__PlusEqual__Group__3__Impl rule__PlusEqual__Group__4 ;
    public final void rule__PlusEqual__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6352:1: ( rule__PlusEqual__Group__3__Impl rule__PlusEqual__Group__4 )
            // InternalLegoLang.g:6353:2: rule__PlusEqual__Group__3__Impl rule__PlusEqual__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalLegoLang.g:6360:1: rule__PlusEqual__Group__3__Impl : ( '+=' ) ;
    public final void rule__PlusEqual__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6364:1: ( ( '+=' ) )
            // InternalLegoLang.g:6365:1: ( '+=' )
            {
            // InternalLegoLang.g:6365:1: ( '+=' )
            // InternalLegoLang.g:6366:2: '+='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusEqualAccess().getPlusSignEqualsSignKeyword_3()); 
            }
            match(input,54,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:6375:1: rule__PlusEqual__Group__4 : rule__PlusEqual__Group__4__Impl rule__PlusEqual__Group__5 ;
    public final void rule__PlusEqual__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6379:1: ( rule__PlusEqual__Group__4__Impl rule__PlusEqual__Group__5 )
            // InternalLegoLang.g:6380:2: rule__PlusEqual__Group__4__Impl rule__PlusEqual__Group__5
            {
            pushFollow(FOLLOW_29);
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
    // InternalLegoLang.g:6387:1: rule__PlusEqual__Group__4__Impl : ( ( rule__PlusEqual__RightAssignment_4 ) ) ;
    public final void rule__PlusEqual__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6391:1: ( ( ( rule__PlusEqual__RightAssignment_4 ) ) )
            // InternalLegoLang.g:6392:1: ( ( rule__PlusEqual__RightAssignment_4 ) )
            {
            // InternalLegoLang.g:6392:1: ( ( rule__PlusEqual__RightAssignment_4 ) )
            // InternalLegoLang.g:6393:2: ( rule__PlusEqual__RightAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusEqualAccess().getRightAssignment_4()); 
            }
            // InternalLegoLang.g:6394:2: ( rule__PlusEqual__RightAssignment_4 )
            // InternalLegoLang.g:6394:3: rule__PlusEqual__RightAssignment_4
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
    // InternalLegoLang.g:6402:1: rule__PlusEqual__Group__5 : rule__PlusEqual__Group__5__Impl ;
    public final void rule__PlusEqual__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6406:1: ( rule__PlusEqual__Group__5__Impl )
            // InternalLegoLang.g:6407:2: rule__PlusEqual__Group__5__Impl
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
    // InternalLegoLang.g:6413:1: rule__PlusEqual__Group__5__Impl : ( ');' ) ;
    public final void rule__PlusEqual__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6417:1: ( ( ');' ) )
            // InternalLegoLang.g:6418:1: ( ');' )
            {
            // InternalLegoLang.g:6418:1: ( ');' )
            // InternalLegoLang.g:6419:2: ');'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusEqualAccess().getRightParenthesisSemicolonKeyword_5()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:6429:1: rule__MinusEqual__Group__0 : rule__MinusEqual__Group__0__Impl rule__MinusEqual__Group__1 ;
    public final void rule__MinusEqual__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6433:1: ( rule__MinusEqual__Group__0__Impl rule__MinusEqual__Group__1 )
            // InternalLegoLang.g:6434:2: rule__MinusEqual__Group__0__Impl rule__MinusEqual__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalLegoLang.g:6441:1: rule__MinusEqual__Group__0__Impl : ( () ) ;
    public final void rule__MinusEqual__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6445:1: ( ( () ) )
            // InternalLegoLang.g:6446:1: ( () )
            {
            // InternalLegoLang.g:6446:1: ( () )
            // InternalLegoLang.g:6447:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinusEqualAccess().getMinusEqualAction_0()); 
            }
            // InternalLegoLang.g:6448:2: ()
            // InternalLegoLang.g:6448:3: 
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
    // InternalLegoLang.g:6456:1: rule__MinusEqual__Group__1 : rule__MinusEqual__Group__1__Impl rule__MinusEqual__Group__2 ;
    public final void rule__MinusEqual__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6460:1: ( rule__MinusEqual__Group__1__Impl rule__MinusEqual__Group__2 )
            // InternalLegoLang.g:6461:2: rule__MinusEqual__Group__1__Impl rule__MinusEqual__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalLegoLang.g:6468:1: rule__MinusEqual__Group__1__Impl : ( '(' ) ;
    public final void rule__MinusEqual__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6472:1: ( ( '(' ) )
            // InternalLegoLang.g:6473:1: ( '(' )
            {
            // InternalLegoLang.g:6473:1: ( '(' )
            // InternalLegoLang.g:6474:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinusEqualAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:6483:1: rule__MinusEqual__Group__2 : rule__MinusEqual__Group__2__Impl rule__MinusEqual__Group__3 ;
    public final void rule__MinusEqual__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6487:1: ( rule__MinusEqual__Group__2__Impl rule__MinusEqual__Group__3 )
            // InternalLegoLang.g:6488:2: rule__MinusEqual__Group__2__Impl rule__MinusEqual__Group__3
            {
            pushFollow(FOLLOW_43);
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
    // InternalLegoLang.g:6495:1: rule__MinusEqual__Group__2__Impl : ( ( rule__MinusEqual__LeftAssignment_2 ) ) ;
    public final void rule__MinusEqual__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6499:1: ( ( ( rule__MinusEqual__LeftAssignment_2 ) ) )
            // InternalLegoLang.g:6500:1: ( ( rule__MinusEqual__LeftAssignment_2 ) )
            {
            // InternalLegoLang.g:6500:1: ( ( rule__MinusEqual__LeftAssignment_2 ) )
            // InternalLegoLang.g:6501:2: ( rule__MinusEqual__LeftAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinusEqualAccess().getLeftAssignment_2()); 
            }
            // InternalLegoLang.g:6502:2: ( rule__MinusEqual__LeftAssignment_2 )
            // InternalLegoLang.g:6502:3: rule__MinusEqual__LeftAssignment_2
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
    // InternalLegoLang.g:6510:1: rule__MinusEqual__Group__3 : rule__MinusEqual__Group__3__Impl rule__MinusEqual__Group__4 ;
    public final void rule__MinusEqual__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6514:1: ( rule__MinusEqual__Group__3__Impl rule__MinusEqual__Group__4 )
            // InternalLegoLang.g:6515:2: rule__MinusEqual__Group__3__Impl rule__MinusEqual__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalLegoLang.g:6522:1: rule__MinusEqual__Group__3__Impl : ( '-=' ) ;
    public final void rule__MinusEqual__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6526:1: ( ( '-=' ) )
            // InternalLegoLang.g:6527:1: ( '-=' )
            {
            // InternalLegoLang.g:6527:1: ( '-=' )
            // InternalLegoLang.g:6528:2: '-='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinusEqualAccess().getHyphenMinusEqualsSignKeyword_3()); 
            }
            match(input,55,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:6537:1: rule__MinusEqual__Group__4 : rule__MinusEqual__Group__4__Impl rule__MinusEqual__Group__5 ;
    public final void rule__MinusEqual__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6541:1: ( rule__MinusEqual__Group__4__Impl rule__MinusEqual__Group__5 )
            // InternalLegoLang.g:6542:2: rule__MinusEqual__Group__4__Impl rule__MinusEqual__Group__5
            {
            pushFollow(FOLLOW_29);
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
    // InternalLegoLang.g:6549:1: rule__MinusEqual__Group__4__Impl : ( ( rule__MinusEqual__RightAssignment_4 ) ) ;
    public final void rule__MinusEqual__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6553:1: ( ( ( rule__MinusEqual__RightAssignment_4 ) ) )
            // InternalLegoLang.g:6554:1: ( ( rule__MinusEqual__RightAssignment_4 ) )
            {
            // InternalLegoLang.g:6554:1: ( ( rule__MinusEqual__RightAssignment_4 ) )
            // InternalLegoLang.g:6555:2: ( rule__MinusEqual__RightAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinusEqualAccess().getRightAssignment_4()); 
            }
            // InternalLegoLang.g:6556:2: ( rule__MinusEqual__RightAssignment_4 )
            // InternalLegoLang.g:6556:3: rule__MinusEqual__RightAssignment_4
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
    // InternalLegoLang.g:6564:1: rule__MinusEqual__Group__5 : rule__MinusEqual__Group__5__Impl ;
    public final void rule__MinusEqual__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6568:1: ( rule__MinusEqual__Group__5__Impl )
            // InternalLegoLang.g:6569:2: rule__MinusEqual__Group__5__Impl
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
    // InternalLegoLang.g:6575:1: rule__MinusEqual__Group__5__Impl : ( ');' ) ;
    public final void rule__MinusEqual__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6579:1: ( ( ');' ) )
            // InternalLegoLang.g:6580:1: ( ');' )
            {
            // InternalLegoLang.g:6580:1: ( ');' )
            // InternalLegoLang.g:6581:2: ');'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinusEqualAccess().getRightParenthesisSemicolonKeyword_5()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:6591:1: rule__UnInteger__Group__0 : rule__UnInteger__Group__0__Impl rule__UnInteger__Group__1 ;
    public final void rule__UnInteger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6595:1: ( rule__UnInteger__Group__0__Impl rule__UnInteger__Group__1 )
            // InternalLegoLang.g:6596:2: rule__UnInteger__Group__0__Impl rule__UnInteger__Group__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalLegoLang.g:6603:1: rule__UnInteger__Group__0__Impl : ( () ) ;
    public final void rule__UnInteger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6607:1: ( ( () ) )
            // InternalLegoLang.g:6608:1: ( () )
            {
            // InternalLegoLang.g:6608:1: ( () )
            // InternalLegoLang.g:6609:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnIntegerAccess().getUnIntegerAction_0()); 
            }
            // InternalLegoLang.g:6610:2: ()
            // InternalLegoLang.g:6610:3: 
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
    // InternalLegoLang.g:6618:1: rule__UnInteger__Group__1 : rule__UnInteger__Group__1__Impl rule__UnInteger__Group__2 ;
    public final void rule__UnInteger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6622:1: ( rule__UnInteger__Group__1__Impl rule__UnInteger__Group__2 )
            // InternalLegoLang.g:6623:2: rule__UnInteger__Group__1__Impl rule__UnInteger__Group__2
            {
            pushFollow(FOLLOW_44);
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
    // InternalLegoLang.g:6630:1: rule__UnInteger__Group__1__Impl : ( ( rule__UnInteger__IsConstAssignment_1 )? ) ;
    public final void rule__UnInteger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6634:1: ( ( ( rule__UnInteger__IsConstAssignment_1 )? ) )
            // InternalLegoLang.g:6635:1: ( ( rule__UnInteger__IsConstAssignment_1 )? )
            {
            // InternalLegoLang.g:6635:1: ( ( rule__UnInteger__IsConstAssignment_1 )? )
            // InternalLegoLang.g:6636:2: ( rule__UnInteger__IsConstAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnIntegerAccess().getIsConstAssignment_1()); 
            }
            // InternalLegoLang.g:6637:2: ( rule__UnInteger__IsConstAssignment_1 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==62) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalLegoLang.g:6637:3: rule__UnInteger__IsConstAssignment_1
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
    // InternalLegoLang.g:6645:1: rule__UnInteger__Group__2 : rule__UnInteger__Group__2__Impl rule__UnInteger__Group__3 ;
    public final void rule__UnInteger__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6649:1: ( rule__UnInteger__Group__2__Impl rule__UnInteger__Group__3 )
            // InternalLegoLang.g:6650:2: rule__UnInteger__Group__2__Impl rule__UnInteger__Group__3
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
    // InternalLegoLang.g:6657:1: rule__UnInteger__Group__2__Impl : ( 'int' ) ;
    public final void rule__UnInteger__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6661:1: ( ( 'int' ) )
            // InternalLegoLang.g:6662:1: ( 'int' )
            {
            // InternalLegoLang.g:6662:1: ( 'int' )
            // InternalLegoLang.g:6663:2: 'int'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnIntegerAccess().getIntKeyword_2()); 
            }
            match(input,56,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:6672:1: rule__UnInteger__Group__3 : rule__UnInteger__Group__3__Impl rule__UnInteger__Group__4 ;
    public final void rule__UnInteger__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6676:1: ( rule__UnInteger__Group__3__Impl rule__UnInteger__Group__4 )
            // InternalLegoLang.g:6677:2: rule__UnInteger__Group__3__Impl rule__UnInteger__Group__4
            {
            pushFollow(FOLLOW_45);
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
    // InternalLegoLang.g:6684:1: rule__UnInteger__Group__3__Impl : ( ( rule__UnInteger__NameAssignment_3 ) ) ;
    public final void rule__UnInteger__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6688:1: ( ( ( rule__UnInteger__NameAssignment_3 ) ) )
            // InternalLegoLang.g:6689:1: ( ( rule__UnInteger__NameAssignment_3 ) )
            {
            // InternalLegoLang.g:6689:1: ( ( rule__UnInteger__NameAssignment_3 ) )
            // InternalLegoLang.g:6690:2: ( rule__UnInteger__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnIntegerAccess().getNameAssignment_3()); 
            }
            // InternalLegoLang.g:6691:2: ( rule__UnInteger__NameAssignment_3 )
            // InternalLegoLang.g:6691:3: rule__UnInteger__NameAssignment_3
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
    // InternalLegoLang.g:6699:1: rule__UnInteger__Group__4 : rule__UnInteger__Group__4__Impl rule__UnInteger__Group__5 ;
    public final void rule__UnInteger__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6703:1: ( rule__UnInteger__Group__4__Impl rule__UnInteger__Group__5 )
            // InternalLegoLang.g:6704:2: rule__UnInteger__Group__4__Impl rule__UnInteger__Group__5
            {
            pushFollow(FOLLOW_45);
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
    // InternalLegoLang.g:6711:1: rule__UnInteger__Group__4__Impl : ( ( rule__UnInteger__Group_4__0 )? ) ;
    public final void rule__UnInteger__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6715:1: ( ( ( rule__UnInteger__Group_4__0 )? ) )
            // InternalLegoLang.g:6716:1: ( ( rule__UnInteger__Group_4__0 )? )
            {
            // InternalLegoLang.g:6716:1: ( ( rule__UnInteger__Group_4__0 )? )
            // InternalLegoLang.g:6717:2: ( rule__UnInteger__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnIntegerAccess().getGroup_4()); 
            }
            // InternalLegoLang.g:6718:2: ( rule__UnInteger__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==27) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalLegoLang.g:6718:3: rule__UnInteger__Group_4__0
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
    // InternalLegoLang.g:6726:1: rule__UnInteger__Group__5 : rule__UnInteger__Group__5__Impl ;
    public final void rule__UnInteger__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6730:1: ( rule__UnInteger__Group__5__Impl )
            // InternalLegoLang.g:6731:2: rule__UnInteger__Group__5__Impl
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
    // InternalLegoLang.g:6737:1: rule__UnInteger__Group__5__Impl : ( ';' ) ;
    public final void rule__UnInteger__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6741:1: ( ( ';' ) )
            // InternalLegoLang.g:6742:1: ( ';' )
            {
            // InternalLegoLang.g:6742:1: ( ';' )
            // InternalLegoLang.g:6743:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnIntegerAccess().getSemicolonKeyword_5()); 
            }
            match(input,57,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:6753:1: rule__UnInteger__Group_4__0 : rule__UnInteger__Group_4__0__Impl rule__UnInteger__Group_4__1 ;
    public final void rule__UnInteger__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6757:1: ( rule__UnInteger__Group_4__0__Impl rule__UnInteger__Group_4__1 )
            // InternalLegoLang.g:6758:2: rule__UnInteger__Group_4__0__Impl rule__UnInteger__Group_4__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalLegoLang.g:6765:1: rule__UnInteger__Group_4__0__Impl : ( '=' ) ;
    public final void rule__UnInteger__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6769:1: ( ( '=' ) )
            // InternalLegoLang.g:6770:1: ( '=' )
            {
            // InternalLegoLang.g:6770:1: ( '=' )
            // InternalLegoLang.g:6771:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnIntegerAccess().getEqualsSignKeyword_4_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:6780:1: rule__UnInteger__Group_4__1 : rule__UnInteger__Group_4__1__Impl ;
    public final void rule__UnInteger__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6784:1: ( rule__UnInteger__Group_4__1__Impl )
            // InternalLegoLang.g:6785:2: rule__UnInteger__Group_4__1__Impl
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
    // InternalLegoLang.g:6791:1: rule__UnInteger__Group_4__1__Impl : ( ( rule__UnInteger__InitialeValueAssignment_4_1 ) ) ;
    public final void rule__UnInteger__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6795:1: ( ( ( rule__UnInteger__InitialeValueAssignment_4_1 ) ) )
            // InternalLegoLang.g:6796:1: ( ( rule__UnInteger__InitialeValueAssignment_4_1 ) )
            {
            // InternalLegoLang.g:6796:1: ( ( rule__UnInteger__InitialeValueAssignment_4_1 ) )
            // InternalLegoLang.g:6797:2: ( rule__UnInteger__InitialeValueAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnIntegerAccess().getInitialeValueAssignment_4_1()); 
            }
            // InternalLegoLang.g:6798:2: ( rule__UnInteger__InitialeValueAssignment_4_1 )
            // InternalLegoLang.g:6798:3: rule__UnInteger__InitialeValueAssignment_4_1
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
    // InternalLegoLang.g:6807:1: rule__UnDouble__Group__0 : rule__UnDouble__Group__0__Impl rule__UnDouble__Group__1 ;
    public final void rule__UnDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6811:1: ( rule__UnDouble__Group__0__Impl rule__UnDouble__Group__1 )
            // InternalLegoLang.g:6812:2: rule__UnDouble__Group__0__Impl rule__UnDouble__Group__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalLegoLang.g:6819:1: rule__UnDouble__Group__0__Impl : ( () ) ;
    public final void rule__UnDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6823:1: ( ( () ) )
            // InternalLegoLang.g:6824:1: ( () )
            {
            // InternalLegoLang.g:6824:1: ( () )
            // InternalLegoLang.g:6825:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnDoubleAccess().getUnDoubleAction_0()); 
            }
            // InternalLegoLang.g:6826:2: ()
            // InternalLegoLang.g:6826:3: 
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
    // InternalLegoLang.g:6834:1: rule__UnDouble__Group__1 : rule__UnDouble__Group__1__Impl rule__UnDouble__Group__2 ;
    public final void rule__UnDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6838:1: ( rule__UnDouble__Group__1__Impl rule__UnDouble__Group__2 )
            // InternalLegoLang.g:6839:2: rule__UnDouble__Group__1__Impl rule__UnDouble__Group__2
            {
            pushFollow(FOLLOW_46);
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
    // InternalLegoLang.g:6846:1: rule__UnDouble__Group__1__Impl : ( ( rule__UnDouble__IsConstAssignment_1 )? ) ;
    public final void rule__UnDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6850:1: ( ( ( rule__UnDouble__IsConstAssignment_1 )? ) )
            // InternalLegoLang.g:6851:1: ( ( rule__UnDouble__IsConstAssignment_1 )? )
            {
            // InternalLegoLang.g:6851:1: ( ( rule__UnDouble__IsConstAssignment_1 )? )
            // InternalLegoLang.g:6852:2: ( rule__UnDouble__IsConstAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnDoubleAccess().getIsConstAssignment_1()); 
            }
            // InternalLegoLang.g:6853:2: ( rule__UnDouble__IsConstAssignment_1 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==62) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalLegoLang.g:6853:3: rule__UnDouble__IsConstAssignment_1
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
    // InternalLegoLang.g:6861:1: rule__UnDouble__Group__2 : rule__UnDouble__Group__2__Impl rule__UnDouble__Group__3 ;
    public final void rule__UnDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6865:1: ( rule__UnDouble__Group__2__Impl rule__UnDouble__Group__3 )
            // InternalLegoLang.g:6866:2: rule__UnDouble__Group__2__Impl rule__UnDouble__Group__3
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
    // InternalLegoLang.g:6873:1: rule__UnDouble__Group__2__Impl : ( 'double' ) ;
    public final void rule__UnDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6877:1: ( ( 'double' ) )
            // InternalLegoLang.g:6878:1: ( 'double' )
            {
            // InternalLegoLang.g:6878:1: ( 'double' )
            // InternalLegoLang.g:6879:2: 'double'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnDoubleAccess().getDoubleKeyword_2()); 
            }
            match(input,58,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:6888:1: rule__UnDouble__Group__3 : rule__UnDouble__Group__3__Impl rule__UnDouble__Group__4 ;
    public final void rule__UnDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6892:1: ( rule__UnDouble__Group__3__Impl rule__UnDouble__Group__4 )
            // InternalLegoLang.g:6893:2: rule__UnDouble__Group__3__Impl rule__UnDouble__Group__4
            {
            pushFollow(FOLLOW_45);
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
    // InternalLegoLang.g:6900:1: rule__UnDouble__Group__3__Impl : ( ( rule__UnDouble__NameAssignment_3 ) ) ;
    public final void rule__UnDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6904:1: ( ( ( rule__UnDouble__NameAssignment_3 ) ) )
            // InternalLegoLang.g:6905:1: ( ( rule__UnDouble__NameAssignment_3 ) )
            {
            // InternalLegoLang.g:6905:1: ( ( rule__UnDouble__NameAssignment_3 ) )
            // InternalLegoLang.g:6906:2: ( rule__UnDouble__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnDoubleAccess().getNameAssignment_3()); 
            }
            // InternalLegoLang.g:6907:2: ( rule__UnDouble__NameAssignment_3 )
            // InternalLegoLang.g:6907:3: rule__UnDouble__NameAssignment_3
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
    // InternalLegoLang.g:6915:1: rule__UnDouble__Group__4 : rule__UnDouble__Group__4__Impl rule__UnDouble__Group__5 ;
    public final void rule__UnDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6919:1: ( rule__UnDouble__Group__4__Impl rule__UnDouble__Group__5 )
            // InternalLegoLang.g:6920:2: rule__UnDouble__Group__4__Impl rule__UnDouble__Group__5
            {
            pushFollow(FOLLOW_45);
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
    // InternalLegoLang.g:6927:1: rule__UnDouble__Group__4__Impl : ( ( rule__UnDouble__Group_4__0 )? ) ;
    public final void rule__UnDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6931:1: ( ( ( rule__UnDouble__Group_4__0 )? ) )
            // InternalLegoLang.g:6932:1: ( ( rule__UnDouble__Group_4__0 )? )
            {
            // InternalLegoLang.g:6932:1: ( ( rule__UnDouble__Group_4__0 )? )
            // InternalLegoLang.g:6933:2: ( rule__UnDouble__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnDoubleAccess().getGroup_4()); 
            }
            // InternalLegoLang.g:6934:2: ( rule__UnDouble__Group_4__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==27) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalLegoLang.g:6934:3: rule__UnDouble__Group_4__0
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
    // InternalLegoLang.g:6942:1: rule__UnDouble__Group__5 : rule__UnDouble__Group__5__Impl ;
    public final void rule__UnDouble__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6946:1: ( rule__UnDouble__Group__5__Impl )
            // InternalLegoLang.g:6947:2: rule__UnDouble__Group__5__Impl
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
    // InternalLegoLang.g:6953:1: rule__UnDouble__Group__5__Impl : ( ';' ) ;
    public final void rule__UnDouble__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6957:1: ( ( ';' ) )
            // InternalLegoLang.g:6958:1: ( ';' )
            {
            // InternalLegoLang.g:6958:1: ( ';' )
            // InternalLegoLang.g:6959:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnDoubleAccess().getSemicolonKeyword_5()); 
            }
            match(input,57,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:6969:1: rule__UnDouble__Group_4__0 : rule__UnDouble__Group_4__0__Impl rule__UnDouble__Group_4__1 ;
    public final void rule__UnDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6973:1: ( rule__UnDouble__Group_4__0__Impl rule__UnDouble__Group_4__1 )
            // InternalLegoLang.g:6974:2: rule__UnDouble__Group_4__0__Impl rule__UnDouble__Group_4__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalLegoLang.g:6981:1: rule__UnDouble__Group_4__0__Impl : ( '=' ) ;
    public final void rule__UnDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6985:1: ( ( '=' ) )
            // InternalLegoLang.g:6986:1: ( '=' )
            {
            // InternalLegoLang.g:6986:1: ( '=' )
            // InternalLegoLang.g:6987:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnDoubleAccess().getEqualsSignKeyword_4_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:6996:1: rule__UnDouble__Group_4__1 : rule__UnDouble__Group_4__1__Impl rule__UnDouble__Group_4__2 ;
    public final void rule__UnDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7000:1: ( rule__UnDouble__Group_4__1__Impl rule__UnDouble__Group_4__2 )
            // InternalLegoLang.g:7001:2: rule__UnDouble__Group_4__1__Impl rule__UnDouble__Group_4__2
            {
            pushFollow(FOLLOW_47);
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
    // InternalLegoLang.g:7008:1: rule__UnDouble__Group_4__1__Impl : ( ( rule__UnDouble__InitialeValue1Assignment_4_1 ) ) ;
    public final void rule__UnDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7012:1: ( ( ( rule__UnDouble__InitialeValue1Assignment_4_1 ) ) )
            // InternalLegoLang.g:7013:1: ( ( rule__UnDouble__InitialeValue1Assignment_4_1 ) )
            {
            // InternalLegoLang.g:7013:1: ( ( rule__UnDouble__InitialeValue1Assignment_4_1 ) )
            // InternalLegoLang.g:7014:2: ( rule__UnDouble__InitialeValue1Assignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnDoubleAccess().getInitialeValue1Assignment_4_1()); 
            }
            // InternalLegoLang.g:7015:2: ( rule__UnDouble__InitialeValue1Assignment_4_1 )
            // InternalLegoLang.g:7015:3: rule__UnDouble__InitialeValue1Assignment_4_1
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
    // InternalLegoLang.g:7023:1: rule__UnDouble__Group_4__2 : rule__UnDouble__Group_4__2__Impl ;
    public final void rule__UnDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7027:1: ( rule__UnDouble__Group_4__2__Impl )
            // InternalLegoLang.g:7028:2: rule__UnDouble__Group_4__2__Impl
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
    // InternalLegoLang.g:7034:1: rule__UnDouble__Group_4__2__Impl : ( ( rule__UnDouble__Group_4_2__0 )? ) ;
    public final void rule__UnDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7038:1: ( ( ( rule__UnDouble__Group_4_2__0 )? ) )
            // InternalLegoLang.g:7039:1: ( ( rule__UnDouble__Group_4_2__0 )? )
            {
            // InternalLegoLang.g:7039:1: ( ( rule__UnDouble__Group_4_2__0 )? )
            // InternalLegoLang.g:7040:2: ( rule__UnDouble__Group_4_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnDoubleAccess().getGroup_4_2()); 
            }
            // InternalLegoLang.g:7041:2: ( rule__UnDouble__Group_4_2__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==59) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalLegoLang.g:7041:3: rule__UnDouble__Group_4_2__0
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
    // InternalLegoLang.g:7050:1: rule__UnDouble__Group_4_2__0 : rule__UnDouble__Group_4_2__0__Impl rule__UnDouble__Group_4_2__1 ;
    public final void rule__UnDouble__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7054:1: ( rule__UnDouble__Group_4_2__0__Impl rule__UnDouble__Group_4_2__1 )
            // InternalLegoLang.g:7055:2: rule__UnDouble__Group_4_2__0__Impl rule__UnDouble__Group_4_2__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalLegoLang.g:7062:1: rule__UnDouble__Group_4_2__0__Impl : ( '.' ) ;
    public final void rule__UnDouble__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7066:1: ( ( '.' ) )
            // InternalLegoLang.g:7067:1: ( '.' )
            {
            // InternalLegoLang.g:7067:1: ( '.' )
            // InternalLegoLang.g:7068:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnDoubleAccess().getFullStopKeyword_4_2_0()); 
            }
            match(input,59,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:7077:1: rule__UnDouble__Group_4_2__1 : rule__UnDouble__Group_4_2__1__Impl ;
    public final void rule__UnDouble__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7081:1: ( rule__UnDouble__Group_4_2__1__Impl )
            // InternalLegoLang.g:7082:2: rule__UnDouble__Group_4_2__1__Impl
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
    // InternalLegoLang.g:7088:1: rule__UnDouble__Group_4_2__1__Impl : ( ( rule__UnDouble__InitialeValue2Assignment_4_2_1 ) ) ;
    public final void rule__UnDouble__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7092:1: ( ( ( rule__UnDouble__InitialeValue2Assignment_4_2_1 ) ) )
            // InternalLegoLang.g:7093:1: ( ( rule__UnDouble__InitialeValue2Assignment_4_2_1 ) )
            {
            // InternalLegoLang.g:7093:1: ( ( rule__UnDouble__InitialeValue2Assignment_4_2_1 ) )
            // InternalLegoLang.g:7094:2: ( rule__UnDouble__InitialeValue2Assignment_4_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnDoubleAccess().getInitialeValue2Assignment_4_2_1()); 
            }
            // InternalLegoLang.g:7095:2: ( rule__UnDouble__InitialeValue2Assignment_4_2_1 )
            // InternalLegoLang.g:7095:3: rule__UnDouble__InitialeValue2Assignment_4_2_1
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
    // InternalLegoLang.g:7104:1: rule__UnBoolean__Group__0 : rule__UnBoolean__Group__0__Impl rule__UnBoolean__Group__1 ;
    public final void rule__UnBoolean__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7108:1: ( rule__UnBoolean__Group__0__Impl rule__UnBoolean__Group__1 )
            // InternalLegoLang.g:7109:2: rule__UnBoolean__Group__0__Impl rule__UnBoolean__Group__1
            {
            pushFollow(FOLLOW_48);
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
    // InternalLegoLang.g:7116:1: rule__UnBoolean__Group__0__Impl : ( () ) ;
    public final void rule__UnBoolean__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7120:1: ( ( () ) )
            // InternalLegoLang.g:7121:1: ( () )
            {
            // InternalLegoLang.g:7121:1: ( () )
            // InternalLegoLang.g:7122:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnBooleanAccess().getUnBooleanAction_0()); 
            }
            // InternalLegoLang.g:7123:2: ()
            // InternalLegoLang.g:7123:3: 
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
    // InternalLegoLang.g:7131:1: rule__UnBoolean__Group__1 : rule__UnBoolean__Group__1__Impl rule__UnBoolean__Group__2 ;
    public final void rule__UnBoolean__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7135:1: ( rule__UnBoolean__Group__1__Impl rule__UnBoolean__Group__2 )
            // InternalLegoLang.g:7136:2: rule__UnBoolean__Group__1__Impl rule__UnBoolean__Group__2
            {
            pushFollow(FOLLOW_48);
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
    // InternalLegoLang.g:7143:1: rule__UnBoolean__Group__1__Impl : ( ( rule__UnBoolean__IsConstAssignment_1 )? ) ;
    public final void rule__UnBoolean__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7147:1: ( ( ( rule__UnBoolean__IsConstAssignment_1 )? ) )
            // InternalLegoLang.g:7148:1: ( ( rule__UnBoolean__IsConstAssignment_1 )? )
            {
            // InternalLegoLang.g:7148:1: ( ( rule__UnBoolean__IsConstAssignment_1 )? )
            // InternalLegoLang.g:7149:2: ( rule__UnBoolean__IsConstAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnBooleanAccess().getIsConstAssignment_1()); 
            }
            // InternalLegoLang.g:7150:2: ( rule__UnBoolean__IsConstAssignment_1 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==62) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalLegoLang.g:7150:3: rule__UnBoolean__IsConstAssignment_1
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
    // InternalLegoLang.g:7158:1: rule__UnBoolean__Group__2 : rule__UnBoolean__Group__2__Impl rule__UnBoolean__Group__3 ;
    public final void rule__UnBoolean__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7162:1: ( rule__UnBoolean__Group__2__Impl rule__UnBoolean__Group__3 )
            // InternalLegoLang.g:7163:2: rule__UnBoolean__Group__2__Impl rule__UnBoolean__Group__3
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
    // InternalLegoLang.g:7170:1: rule__UnBoolean__Group__2__Impl : ( 'bool' ) ;
    public final void rule__UnBoolean__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7174:1: ( ( 'bool' ) )
            // InternalLegoLang.g:7175:1: ( 'bool' )
            {
            // InternalLegoLang.g:7175:1: ( 'bool' )
            // InternalLegoLang.g:7176:2: 'bool'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnBooleanAccess().getBoolKeyword_2()); 
            }
            match(input,60,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:7185:1: rule__UnBoolean__Group__3 : rule__UnBoolean__Group__3__Impl rule__UnBoolean__Group__4 ;
    public final void rule__UnBoolean__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7189:1: ( rule__UnBoolean__Group__3__Impl rule__UnBoolean__Group__4 )
            // InternalLegoLang.g:7190:2: rule__UnBoolean__Group__3__Impl rule__UnBoolean__Group__4
            {
            pushFollow(FOLLOW_45);
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
    // InternalLegoLang.g:7197:1: rule__UnBoolean__Group__3__Impl : ( ( rule__UnBoolean__NameAssignment_3 ) ) ;
    public final void rule__UnBoolean__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7201:1: ( ( ( rule__UnBoolean__NameAssignment_3 ) ) )
            // InternalLegoLang.g:7202:1: ( ( rule__UnBoolean__NameAssignment_3 ) )
            {
            // InternalLegoLang.g:7202:1: ( ( rule__UnBoolean__NameAssignment_3 ) )
            // InternalLegoLang.g:7203:2: ( rule__UnBoolean__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnBooleanAccess().getNameAssignment_3()); 
            }
            // InternalLegoLang.g:7204:2: ( rule__UnBoolean__NameAssignment_3 )
            // InternalLegoLang.g:7204:3: rule__UnBoolean__NameAssignment_3
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
    // InternalLegoLang.g:7212:1: rule__UnBoolean__Group__4 : rule__UnBoolean__Group__4__Impl rule__UnBoolean__Group__5 ;
    public final void rule__UnBoolean__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7216:1: ( rule__UnBoolean__Group__4__Impl rule__UnBoolean__Group__5 )
            // InternalLegoLang.g:7217:2: rule__UnBoolean__Group__4__Impl rule__UnBoolean__Group__5
            {
            pushFollow(FOLLOW_45);
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
    // InternalLegoLang.g:7224:1: rule__UnBoolean__Group__4__Impl : ( ( rule__UnBoolean__Group_4__0 )? ) ;
    public final void rule__UnBoolean__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7228:1: ( ( ( rule__UnBoolean__Group_4__0 )? ) )
            // InternalLegoLang.g:7229:1: ( ( rule__UnBoolean__Group_4__0 )? )
            {
            // InternalLegoLang.g:7229:1: ( ( rule__UnBoolean__Group_4__0 )? )
            // InternalLegoLang.g:7230:2: ( rule__UnBoolean__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnBooleanAccess().getGroup_4()); 
            }
            // InternalLegoLang.g:7231:2: ( rule__UnBoolean__Group_4__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==27) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalLegoLang.g:7231:3: rule__UnBoolean__Group_4__0
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
    // InternalLegoLang.g:7239:1: rule__UnBoolean__Group__5 : rule__UnBoolean__Group__5__Impl ;
    public final void rule__UnBoolean__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7243:1: ( rule__UnBoolean__Group__5__Impl )
            // InternalLegoLang.g:7244:2: rule__UnBoolean__Group__5__Impl
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
    // InternalLegoLang.g:7250:1: rule__UnBoolean__Group__5__Impl : ( ';' ) ;
    public final void rule__UnBoolean__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7254:1: ( ( ';' ) )
            // InternalLegoLang.g:7255:1: ( ';' )
            {
            // InternalLegoLang.g:7255:1: ( ';' )
            // InternalLegoLang.g:7256:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnBooleanAccess().getSemicolonKeyword_5()); 
            }
            match(input,57,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:7266:1: rule__UnBoolean__Group_4__0 : rule__UnBoolean__Group_4__0__Impl rule__UnBoolean__Group_4__1 ;
    public final void rule__UnBoolean__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7270:1: ( rule__UnBoolean__Group_4__0__Impl rule__UnBoolean__Group_4__1 )
            // InternalLegoLang.g:7271:2: rule__UnBoolean__Group_4__0__Impl rule__UnBoolean__Group_4__1
            {
            pushFollow(FOLLOW_49);
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
    // InternalLegoLang.g:7278:1: rule__UnBoolean__Group_4__0__Impl : ( '=' ) ;
    public final void rule__UnBoolean__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7282:1: ( ( '=' ) )
            // InternalLegoLang.g:7283:1: ( '=' )
            {
            // InternalLegoLang.g:7283:1: ( '=' )
            // InternalLegoLang.g:7284:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnBooleanAccess().getEqualsSignKeyword_4_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:7293:1: rule__UnBoolean__Group_4__1 : rule__UnBoolean__Group_4__1__Impl ;
    public final void rule__UnBoolean__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7297:1: ( rule__UnBoolean__Group_4__1__Impl )
            // InternalLegoLang.g:7298:2: rule__UnBoolean__Group_4__1__Impl
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
    // InternalLegoLang.g:7304:1: rule__UnBoolean__Group_4__1__Impl : ( ( rule__UnBoolean__InitialeValueAssignment_4_1 ) ) ;
    public final void rule__UnBoolean__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7308:1: ( ( ( rule__UnBoolean__InitialeValueAssignment_4_1 ) ) )
            // InternalLegoLang.g:7309:1: ( ( rule__UnBoolean__InitialeValueAssignment_4_1 ) )
            {
            // InternalLegoLang.g:7309:1: ( ( rule__UnBoolean__InitialeValueAssignment_4_1 ) )
            // InternalLegoLang.g:7310:2: ( rule__UnBoolean__InitialeValueAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnBooleanAccess().getInitialeValueAssignment_4_1()); 
            }
            // InternalLegoLang.g:7311:2: ( rule__UnBoolean__InitialeValueAssignment_4_1 )
            // InternalLegoLang.g:7311:3: rule__UnBoolean__InitialeValueAssignment_4_1
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
    // InternalLegoLang.g:7320:1: rule__UnString__Group__0 : rule__UnString__Group__0__Impl rule__UnString__Group__1 ;
    public final void rule__UnString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7324:1: ( rule__UnString__Group__0__Impl rule__UnString__Group__1 )
            // InternalLegoLang.g:7325:2: rule__UnString__Group__0__Impl rule__UnString__Group__1
            {
            pushFollow(FOLLOW_50);
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
    // InternalLegoLang.g:7332:1: rule__UnString__Group__0__Impl : ( () ) ;
    public final void rule__UnString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7336:1: ( ( () ) )
            // InternalLegoLang.g:7337:1: ( () )
            {
            // InternalLegoLang.g:7337:1: ( () )
            // InternalLegoLang.g:7338:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnStringAccess().getUnStringAction_0()); 
            }
            // InternalLegoLang.g:7339:2: ()
            // InternalLegoLang.g:7339:3: 
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
    // InternalLegoLang.g:7347:1: rule__UnString__Group__1 : rule__UnString__Group__1__Impl rule__UnString__Group__2 ;
    public final void rule__UnString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7351:1: ( rule__UnString__Group__1__Impl rule__UnString__Group__2 )
            // InternalLegoLang.g:7352:2: rule__UnString__Group__1__Impl rule__UnString__Group__2
            {
            pushFollow(FOLLOW_50);
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
    // InternalLegoLang.g:7359:1: rule__UnString__Group__1__Impl : ( ( rule__UnString__IsConstAssignment_1 )? ) ;
    public final void rule__UnString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7363:1: ( ( ( rule__UnString__IsConstAssignment_1 )? ) )
            // InternalLegoLang.g:7364:1: ( ( rule__UnString__IsConstAssignment_1 )? )
            {
            // InternalLegoLang.g:7364:1: ( ( rule__UnString__IsConstAssignment_1 )? )
            // InternalLegoLang.g:7365:2: ( rule__UnString__IsConstAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnStringAccess().getIsConstAssignment_1()); 
            }
            // InternalLegoLang.g:7366:2: ( rule__UnString__IsConstAssignment_1 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==62) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalLegoLang.g:7366:3: rule__UnString__IsConstAssignment_1
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
    // InternalLegoLang.g:7374:1: rule__UnString__Group__2 : rule__UnString__Group__2__Impl rule__UnString__Group__3 ;
    public final void rule__UnString__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7378:1: ( rule__UnString__Group__2__Impl rule__UnString__Group__3 )
            // InternalLegoLang.g:7379:2: rule__UnString__Group__2__Impl rule__UnString__Group__3
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
    // InternalLegoLang.g:7386:1: rule__UnString__Group__2__Impl : ( 'string' ) ;
    public final void rule__UnString__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7390:1: ( ( 'string' ) )
            // InternalLegoLang.g:7391:1: ( 'string' )
            {
            // InternalLegoLang.g:7391:1: ( 'string' )
            // InternalLegoLang.g:7392:2: 'string'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnStringAccess().getStringKeyword_2()); 
            }
            match(input,61,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:7401:1: rule__UnString__Group__3 : rule__UnString__Group__3__Impl rule__UnString__Group__4 ;
    public final void rule__UnString__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7405:1: ( rule__UnString__Group__3__Impl rule__UnString__Group__4 )
            // InternalLegoLang.g:7406:2: rule__UnString__Group__3__Impl rule__UnString__Group__4
            {
            pushFollow(FOLLOW_45);
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
    // InternalLegoLang.g:7413:1: rule__UnString__Group__3__Impl : ( ( rule__UnString__NameAssignment_3 ) ) ;
    public final void rule__UnString__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7417:1: ( ( ( rule__UnString__NameAssignment_3 ) ) )
            // InternalLegoLang.g:7418:1: ( ( rule__UnString__NameAssignment_3 ) )
            {
            // InternalLegoLang.g:7418:1: ( ( rule__UnString__NameAssignment_3 ) )
            // InternalLegoLang.g:7419:2: ( rule__UnString__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnStringAccess().getNameAssignment_3()); 
            }
            // InternalLegoLang.g:7420:2: ( rule__UnString__NameAssignment_3 )
            // InternalLegoLang.g:7420:3: rule__UnString__NameAssignment_3
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
    // InternalLegoLang.g:7428:1: rule__UnString__Group__4 : rule__UnString__Group__4__Impl rule__UnString__Group__5 ;
    public final void rule__UnString__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7432:1: ( rule__UnString__Group__4__Impl rule__UnString__Group__5 )
            // InternalLegoLang.g:7433:2: rule__UnString__Group__4__Impl rule__UnString__Group__5
            {
            pushFollow(FOLLOW_45);
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
    // InternalLegoLang.g:7440:1: rule__UnString__Group__4__Impl : ( ( rule__UnString__Group_4__0 )? ) ;
    public final void rule__UnString__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7444:1: ( ( ( rule__UnString__Group_4__0 )? ) )
            // InternalLegoLang.g:7445:1: ( ( rule__UnString__Group_4__0 )? )
            {
            // InternalLegoLang.g:7445:1: ( ( rule__UnString__Group_4__0 )? )
            // InternalLegoLang.g:7446:2: ( rule__UnString__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnStringAccess().getGroup_4()); 
            }
            // InternalLegoLang.g:7447:2: ( rule__UnString__Group_4__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==27) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalLegoLang.g:7447:3: rule__UnString__Group_4__0
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
    // InternalLegoLang.g:7455:1: rule__UnString__Group__5 : rule__UnString__Group__5__Impl ;
    public final void rule__UnString__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7459:1: ( rule__UnString__Group__5__Impl )
            // InternalLegoLang.g:7460:2: rule__UnString__Group__5__Impl
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
    // InternalLegoLang.g:7466:1: rule__UnString__Group__5__Impl : ( ';' ) ;
    public final void rule__UnString__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7470:1: ( ( ';' ) )
            // InternalLegoLang.g:7471:1: ( ';' )
            {
            // InternalLegoLang.g:7471:1: ( ';' )
            // InternalLegoLang.g:7472:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnStringAccess().getSemicolonKeyword_5()); 
            }
            match(input,57,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:7482:1: rule__UnString__Group_4__0 : rule__UnString__Group_4__0__Impl rule__UnString__Group_4__1 ;
    public final void rule__UnString__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7486:1: ( rule__UnString__Group_4__0__Impl rule__UnString__Group_4__1 )
            // InternalLegoLang.g:7487:2: rule__UnString__Group_4__0__Impl rule__UnString__Group_4__1
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
    // InternalLegoLang.g:7494:1: rule__UnString__Group_4__0__Impl : ( '=' ) ;
    public final void rule__UnString__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7498:1: ( ( '=' ) )
            // InternalLegoLang.g:7499:1: ( '=' )
            {
            // InternalLegoLang.g:7499:1: ( '=' )
            // InternalLegoLang.g:7500:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnStringAccess().getEqualsSignKeyword_4_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:7509:1: rule__UnString__Group_4__1 : rule__UnString__Group_4__1__Impl ;
    public final void rule__UnString__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7513:1: ( rule__UnString__Group_4__1__Impl )
            // InternalLegoLang.g:7514:2: rule__UnString__Group_4__1__Impl
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
    // InternalLegoLang.g:7520:1: rule__UnString__Group_4__1__Impl : ( ( rule__UnString__InitialeValueAssignment_4_1 ) ) ;
    public final void rule__UnString__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7524:1: ( ( ( rule__UnString__InitialeValueAssignment_4_1 ) ) )
            // InternalLegoLang.g:7525:1: ( ( rule__UnString__InitialeValueAssignment_4_1 ) )
            {
            // InternalLegoLang.g:7525:1: ( ( rule__UnString__InitialeValueAssignment_4_1 ) )
            // InternalLegoLang.g:7526:2: ( rule__UnString__InitialeValueAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnStringAccess().getInitialeValueAssignment_4_1()); 
            }
            // InternalLegoLang.g:7527:2: ( rule__UnString__InitialeValueAssignment_4_1 )
            // InternalLegoLang.g:7527:3: rule__UnString__InitialeValueAssignment_4_1
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
    // InternalLegoLang.g:7536:1: rule__TheDouble__Group__0 : rule__TheDouble__Group__0__Impl rule__TheDouble__Group__1 ;
    public final void rule__TheDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7540:1: ( rule__TheDouble__Group__0__Impl rule__TheDouble__Group__1 )
            // InternalLegoLang.g:7541:2: rule__TheDouble__Group__0__Impl rule__TheDouble__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalLegoLang.g:7548:1: rule__TheDouble__Group__0__Impl : ( () ) ;
    public final void rule__TheDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7552:1: ( ( () ) )
            // InternalLegoLang.g:7553:1: ( () )
            {
            // InternalLegoLang.g:7553:1: ( () )
            // InternalLegoLang.g:7554:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheDoubleAccess().getTheDoubleAction_0()); 
            }
            // InternalLegoLang.g:7555:2: ()
            // InternalLegoLang.g:7555:3: 
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
    // InternalLegoLang.g:7563:1: rule__TheDouble__Group__1 : rule__TheDouble__Group__1__Impl rule__TheDouble__Group__2 ;
    public final void rule__TheDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7567:1: ( rule__TheDouble__Group__1__Impl rule__TheDouble__Group__2 )
            // InternalLegoLang.g:7568:2: rule__TheDouble__Group__1__Impl rule__TheDouble__Group__2
            {
            pushFollow(FOLLOW_47);
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
    // InternalLegoLang.g:7575:1: rule__TheDouble__Group__1__Impl : ( ( rule__TheDouble__Value1Assignment_1 ) ) ;
    public final void rule__TheDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7579:1: ( ( ( rule__TheDouble__Value1Assignment_1 ) ) )
            // InternalLegoLang.g:7580:1: ( ( rule__TheDouble__Value1Assignment_1 ) )
            {
            // InternalLegoLang.g:7580:1: ( ( rule__TheDouble__Value1Assignment_1 ) )
            // InternalLegoLang.g:7581:2: ( rule__TheDouble__Value1Assignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheDoubleAccess().getValue1Assignment_1()); 
            }
            // InternalLegoLang.g:7582:2: ( rule__TheDouble__Value1Assignment_1 )
            // InternalLegoLang.g:7582:3: rule__TheDouble__Value1Assignment_1
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
    // InternalLegoLang.g:7590:1: rule__TheDouble__Group__2 : rule__TheDouble__Group__2__Impl rule__TheDouble__Group__3 ;
    public final void rule__TheDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7594:1: ( rule__TheDouble__Group__2__Impl rule__TheDouble__Group__3 )
            // InternalLegoLang.g:7595:2: rule__TheDouble__Group__2__Impl rule__TheDouble__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__TheDouble__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TheDouble__Group__3();

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
    // InternalLegoLang.g:7602:1: rule__TheDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__TheDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7606:1: ( ( '.' ) )
            // InternalLegoLang.g:7607:1: ( '.' )
            {
            // InternalLegoLang.g:7607:1: ( '.' )
            // InternalLegoLang.g:7608:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheDoubleAccess().getFullStopKeyword_2()); 
            }
            match(input,59,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTheDoubleAccess().getFullStopKeyword_2()); 
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


    // $ANTLR start "rule__TheDouble__Group__3"
    // InternalLegoLang.g:7617:1: rule__TheDouble__Group__3 : rule__TheDouble__Group__3__Impl ;
    public final void rule__TheDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7621:1: ( rule__TheDouble__Group__3__Impl )
            // InternalLegoLang.g:7622:2: rule__TheDouble__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TheDouble__Group__3__Impl();

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
    // $ANTLR end "rule__TheDouble__Group__3"


    // $ANTLR start "rule__TheDouble__Group__3__Impl"
    // InternalLegoLang.g:7628:1: rule__TheDouble__Group__3__Impl : ( ( rule__TheDouble__Value2Assignment_3 ) ) ;
    public final void rule__TheDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7632:1: ( ( ( rule__TheDouble__Value2Assignment_3 ) ) )
            // InternalLegoLang.g:7633:1: ( ( rule__TheDouble__Value2Assignment_3 ) )
            {
            // InternalLegoLang.g:7633:1: ( ( rule__TheDouble__Value2Assignment_3 ) )
            // InternalLegoLang.g:7634:2: ( rule__TheDouble__Value2Assignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheDoubleAccess().getValue2Assignment_3()); 
            }
            // InternalLegoLang.g:7635:2: ( rule__TheDouble__Value2Assignment_3 )
            // InternalLegoLang.g:7635:3: rule__TheDouble__Value2Assignment_3
            {
            pushFollow(FOLLOW_2);
            rule__TheDouble__Value2Assignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTheDoubleAccess().getValue2Assignment_3()); 
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
    // $ANTLR end "rule__TheDouble__Group__3__Impl"


    // $ANTLR start "rule__TheInt__Group__0"
    // InternalLegoLang.g:7644:1: rule__TheInt__Group__0 : rule__TheInt__Group__0__Impl rule__TheInt__Group__1 ;
    public final void rule__TheInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7648:1: ( rule__TheInt__Group__0__Impl rule__TheInt__Group__1 )
            // InternalLegoLang.g:7649:2: rule__TheInt__Group__0__Impl rule__TheInt__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalLegoLang.g:7656:1: rule__TheInt__Group__0__Impl : ( () ) ;
    public final void rule__TheInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7660:1: ( ( () ) )
            // InternalLegoLang.g:7661:1: ( () )
            {
            // InternalLegoLang.g:7661:1: ( () )
            // InternalLegoLang.g:7662:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheIntAccess().getTheIntAction_0()); 
            }
            // InternalLegoLang.g:7663:2: ()
            // InternalLegoLang.g:7663:3: 
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
    // InternalLegoLang.g:7671:1: rule__TheInt__Group__1 : rule__TheInt__Group__1__Impl ;
    public final void rule__TheInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7675:1: ( rule__TheInt__Group__1__Impl )
            // InternalLegoLang.g:7676:2: rule__TheInt__Group__1__Impl
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
    // InternalLegoLang.g:7682:1: rule__TheInt__Group__1__Impl : ( ( rule__TheInt__ValueAssignment_1 ) ) ;
    public final void rule__TheInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7686:1: ( ( ( rule__TheInt__ValueAssignment_1 ) ) )
            // InternalLegoLang.g:7687:1: ( ( rule__TheInt__ValueAssignment_1 ) )
            {
            // InternalLegoLang.g:7687:1: ( ( rule__TheInt__ValueAssignment_1 ) )
            // InternalLegoLang.g:7688:2: ( rule__TheInt__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheIntAccess().getValueAssignment_1()); 
            }
            // InternalLegoLang.g:7689:2: ( rule__TheInt__ValueAssignment_1 )
            // InternalLegoLang.g:7689:3: rule__TheInt__ValueAssignment_1
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
    // InternalLegoLang.g:7698:1: rule__TheBoolean__Group__0 : rule__TheBoolean__Group__0__Impl rule__TheBoolean__Group__1 ;
    public final void rule__TheBoolean__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7702:1: ( rule__TheBoolean__Group__0__Impl rule__TheBoolean__Group__1 )
            // InternalLegoLang.g:7703:2: rule__TheBoolean__Group__0__Impl rule__TheBoolean__Group__1
            {
            pushFollow(FOLLOW_49);
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
    // InternalLegoLang.g:7710:1: rule__TheBoolean__Group__0__Impl : ( () ) ;
    public final void rule__TheBoolean__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7714:1: ( ( () ) )
            // InternalLegoLang.g:7715:1: ( () )
            {
            // InternalLegoLang.g:7715:1: ( () )
            // InternalLegoLang.g:7716:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheBooleanAccess().getTheBooleanAction_0()); 
            }
            // InternalLegoLang.g:7717:2: ()
            // InternalLegoLang.g:7717:3: 
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
    // InternalLegoLang.g:7725:1: rule__TheBoolean__Group__1 : rule__TheBoolean__Group__1__Impl ;
    public final void rule__TheBoolean__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7729:1: ( rule__TheBoolean__Group__1__Impl )
            // InternalLegoLang.g:7730:2: rule__TheBoolean__Group__1__Impl
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
    // InternalLegoLang.g:7736:1: rule__TheBoolean__Group__1__Impl : ( ( rule__TheBoolean__ValueAssignment_1 ) ) ;
    public final void rule__TheBoolean__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7740:1: ( ( ( rule__TheBoolean__ValueAssignment_1 ) ) )
            // InternalLegoLang.g:7741:1: ( ( rule__TheBoolean__ValueAssignment_1 ) )
            {
            // InternalLegoLang.g:7741:1: ( ( rule__TheBoolean__ValueAssignment_1 ) )
            // InternalLegoLang.g:7742:2: ( rule__TheBoolean__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheBooleanAccess().getValueAssignment_1()); 
            }
            // InternalLegoLang.g:7743:2: ( rule__TheBoolean__ValueAssignment_1 )
            // InternalLegoLang.g:7743:3: rule__TheBoolean__ValueAssignment_1
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
    // InternalLegoLang.g:7752:1: rule__TheString__Group__0 : rule__TheString__Group__0__Impl rule__TheString__Group__1 ;
    public final void rule__TheString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7756:1: ( rule__TheString__Group__0__Impl rule__TheString__Group__1 )
            // InternalLegoLang.g:7757:2: rule__TheString__Group__0__Impl rule__TheString__Group__1
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
    // InternalLegoLang.g:7764:1: rule__TheString__Group__0__Impl : ( () ) ;
    public final void rule__TheString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7768:1: ( ( () ) )
            // InternalLegoLang.g:7769:1: ( () )
            {
            // InternalLegoLang.g:7769:1: ( () )
            // InternalLegoLang.g:7770:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheStringAccess().getTheStringAction_0()); 
            }
            // InternalLegoLang.g:7771:2: ()
            // InternalLegoLang.g:7771:3: 
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
    // InternalLegoLang.g:7779:1: rule__TheString__Group__1 : rule__TheString__Group__1__Impl ;
    public final void rule__TheString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7783:1: ( rule__TheString__Group__1__Impl )
            // InternalLegoLang.g:7784:2: rule__TheString__Group__1__Impl
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
    // InternalLegoLang.g:7790:1: rule__TheString__Group__1__Impl : ( ( rule__TheString__ValueAssignment_1 ) ) ;
    public final void rule__TheString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7794:1: ( ( ( rule__TheString__ValueAssignment_1 ) ) )
            // InternalLegoLang.g:7795:1: ( ( rule__TheString__ValueAssignment_1 ) )
            {
            // InternalLegoLang.g:7795:1: ( ( rule__TheString__ValueAssignment_1 ) )
            // InternalLegoLang.g:7796:2: ( rule__TheString__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheStringAccess().getValueAssignment_1()); 
            }
            // InternalLegoLang.g:7797:2: ( rule__TheString__ValueAssignment_1 )
            // InternalLegoLang.g:7797:3: rule__TheString__ValueAssignment_1
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


    // $ANTLR start "rule__FQN__Group__0"
    // InternalLegoLang.g:7806:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7810:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalLegoLang.g:7811:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_47);
            rule__FQN__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FQN__Group__1();

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
    // $ANTLR end "rule__FQN__Group__0"


    // $ANTLR start "rule__FQN__Group__0__Impl"
    // InternalLegoLang.g:7818:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7822:1: ( ( RULE_ID ) )
            // InternalLegoLang.g:7823:1: ( RULE_ID )
            {
            // InternalLegoLang.g:7823:1: ( RULE_ID )
            // InternalLegoLang.g:7824:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__FQN__Group__0__Impl"


    // $ANTLR start "rule__FQN__Group__1"
    // InternalLegoLang.g:7833:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7837:1: ( rule__FQN__Group__1__Impl )
            // InternalLegoLang.g:7838:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FQN__Group__1__Impl();

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
    // $ANTLR end "rule__FQN__Group__1"


    // $ANTLR start "rule__FQN__Group__1__Impl"
    // InternalLegoLang.g:7844:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7848:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalLegoLang.g:7849:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalLegoLang.g:7849:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalLegoLang.g:7850:2: ( rule__FQN__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getGroup_1()); 
            }
            // InternalLegoLang.g:7851:2: ( rule__FQN__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==59) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalLegoLang.g:7851:3: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_51);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFQNAccess().getGroup_1()); 
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
    // $ANTLR end "rule__FQN__Group__1__Impl"


    // $ANTLR start "rule__FQN__Group_1__0"
    // InternalLegoLang.g:7860:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7864:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalLegoLang.g:7865:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FQN__Group_1__1();

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
    // $ANTLR end "rule__FQN__Group_1__0"


    // $ANTLR start "rule__FQN__Group_1__0__Impl"
    // InternalLegoLang.g:7872:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7876:1: ( ( '.' ) )
            // InternalLegoLang.g:7877:1: ( '.' )
            {
            // InternalLegoLang.g:7877:1: ( '.' )
            // InternalLegoLang.g:7878:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            }
            match(input,59,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
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
    // $ANTLR end "rule__FQN__Group_1__0__Impl"


    // $ANTLR start "rule__FQN__Group_1__1"
    // InternalLegoLang.g:7887:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7891:1: ( rule__FQN__Group_1__1__Impl )
            // InternalLegoLang.g:7892:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FQN__Group_1__1__Impl();

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
    // $ANTLR end "rule__FQN__Group_1__1"


    // $ANTLR start "rule__FQN__Group_1__1__Impl"
    // InternalLegoLang.g:7898:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7902:1: ( ( RULE_ID ) )
            // InternalLegoLang.g:7903:1: ( RULE_ID )
            {
            // InternalLegoLang.g:7903:1: ( RULE_ID )
            // InternalLegoLang.g:7904:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
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
    // $ANTLR end "rule__FQN__Group_1__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalLegoLang.g:7914:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7918:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalLegoLang.g:7919:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalLegoLang.g:7926:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7930:1: ( ( ( '-' )? ) )
            // InternalLegoLang.g:7931:1: ( ( '-' )? )
            {
            // InternalLegoLang.g:7931:1: ( ( '-' )? )
            // InternalLegoLang.g:7932:2: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            }
            // InternalLegoLang.g:7933:2: ( '-' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==44) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalLegoLang.g:7933:3: '-'
                    {
                    match(input,44,FOLLOW_2); if (state.failed) return ;

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
    // InternalLegoLang.g:7941:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7945:1: ( rule__EInt__Group__1__Impl )
            // InternalLegoLang.g:7946:2: rule__EInt__Group__1__Impl
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
    // InternalLegoLang.g:7952:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7956:1: ( ( RULE_INT ) )
            // InternalLegoLang.g:7957:1: ( RULE_INT )
            {
            // InternalLegoLang.g:7957:1: ( RULE_INT )
            // InternalLegoLang.g:7958:2: RULE_INT
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
    // InternalLegoLang.g:7968:1: rule__Program__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Program__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7972:1: ( ( ruleEString ) )
            // InternalLegoLang.g:7973:2: ( ruleEString )
            {
            // InternalLegoLang.g:7973:2: ( ruleEString )
            // InternalLegoLang.g:7974:3: ruleEString
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
    // InternalLegoLang.g:7983:1: rule__Program__StatementAssignment_4 : ( ruleStatement ) ;
    public final void rule__Program__StatementAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7987:1: ( ( ruleStatement ) )
            // InternalLegoLang.g:7988:2: ( ruleStatement )
            {
            // InternalLegoLang.g:7988:2: ( ruleStatement )
            // InternalLegoLang.g:7989:3: ruleStatement
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


    // $ANTLR start "rule__WheelEngine__NameAssignment_1"
    // InternalLegoLang.g:7998:1: rule__WheelEngine__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__WheelEngine__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8002:1: ( ( ruleEString ) )
            // InternalLegoLang.g:8003:2: ( ruleEString )
            {
            // InternalLegoLang.g:8003:2: ( ruleEString )
            // InternalLegoLang.g:8004:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWheelEngineAccess().getNameEStringParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWheelEngineAccess().getNameEStringParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__WheelEngine__NameAssignment_1"


    // $ANTLR start "rule__WheelEngine__PositionAssignment_2"
    // InternalLegoLang.g:8013:1: rule__WheelEngine__PositionAssignment_2 : ( ruleEString ) ;
    public final void rule__WheelEngine__PositionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8017:1: ( ( ruleEString ) )
            // InternalLegoLang.g:8018:2: ( ruleEString )
            {
            // InternalLegoLang.g:8018:2: ( ruleEString )
            // InternalLegoLang.g:8019:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWheelEngineAccess().getPositionEStringParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWheelEngineAccess().getPositionEStringParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__WheelEngine__PositionAssignment_2"


    // $ANTLR start "rule__ColorSensor__NameAssignment_1"
    // InternalLegoLang.g:8028:1: rule__ColorSensor__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__ColorSensor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8032:1: ( ( ruleEString ) )
            // InternalLegoLang.g:8033:2: ( ruleEString )
            {
            // InternalLegoLang.g:8033:2: ( ruleEString )
            // InternalLegoLang.g:8034:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorSensorAccess().getNameEStringParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getColorSensorAccess().getNameEStringParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__ColorSensor__NameAssignment_1"


    // $ANTLR start "rule__ColorSensor__PositionAssignment_2"
    // InternalLegoLang.g:8043:1: rule__ColorSensor__PositionAssignment_2 : ( ruleEInt ) ;
    public final void rule__ColorSensor__PositionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8047:1: ( ( ruleEInt ) )
            // InternalLegoLang.g:8048:2: ( ruleEInt )
            {
            // InternalLegoLang.g:8048:2: ( ruleEInt )
            // InternalLegoLang.g:8049:3: ruleEInt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorSensorAccess().getPositionEIntParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getColorSensorAccess().getPositionEIntParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__ColorSensor__PositionAssignment_2"


    // $ANTLR start "rule__LaserSensor__NameAssignment_1"
    // InternalLegoLang.g:8058:1: rule__LaserSensor__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__LaserSensor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8062:1: ( ( ruleEString ) )
            // InternalLegoLang.g:8063:2: ( ruleEString )
            {
            // InternalLegoLang.g:8063:2: ( ruleEString )
            // InternalLegoLang.g:8064:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLaserSensorAccess().getNameEStringParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLaserSensorAccess().getNameEStringParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__LaserSensor__NameAssignment_1"


    // $ANTLR start "rule__LaserSensor__PositionAssignment_2"
    // InternalLegoLang.g:8073:1: rule__LaserSensor__PositionAssignment_2 : ( ruleEInt ) ;
    public final void rule__LaserSensor__PositionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8077:1: ( ( ruleEInt ) )
            // InternalLegoLang.g:8078:2: ( ruleEInt )
            {
            // InternalLegoLang.g:8078:2: ( ruleEInt )
            // InternalLegoLang.g:8079:3: ruleEInt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLaserSensorAccess().getPositionEIntParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLaserSensorAccess().getPositionEIntParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__LaserSensor__PositionAssignment_2"


    // $ANTLR start "rule__GPSSensor__NameAssignment_1"
    // InternalLegoLang.g:8088:1: rule__GPSSensor__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__GPSSensor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8092:1: ( ( ruleEString ) )
            // InternalLegoLang.g:8093:2: ( ruleEString )
            {
            // InternalLegoLang.g:8093:2: ( ruleEString )
            // InternalLegoLang.g:8094:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGPSSensorAccess().getNameEStringParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGPSSensorAccess().getNameEStringParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__GPSSensor__NameAssignment_1"


    // $ANTLR start "rule__GPSSensor__PositionAssignment_2"
    // InternalLegoLang.g:8103:1: rule__GPSSensor__PositionAssignment_2 : ( ruleEInt ) ;
    public final void rule__GPSSensor__PositionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8107:1: ( ( ruleEInt ) )
            // InternalLegoLang.g:8108:2: ( ruleEInt )
            {
            // InternalLegoLang.g:8108:2: ( ruleEInt )
            // InternalLegoLang.g:8109:3: ruleEInt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGPSSensorAccess().getPositionEIntParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGPSSensorAccess().getPositionEIntParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__GPSSensor__PositionAssignment_2"


    // $ANTLR start "rule__GyroSensor__NameAssignment_1"
    // InternalLegoLang.g:8118:1: rule__GyroSensor__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__GyroSensor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8122:1: ( ( ruleEString ) )
            // InternalLegoLang.g:8123:2: ( ruleEString )
            {
            // InternalLegoLang.g:8123:2: ( ruleEString )
            // InternalLegoLang.g:8124:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGyroSensorAccess().getNameEStringParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGyroSensorAccess().getNameEStringParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__GyroSensor__NameAssignment_1"


    // $ANTLR start "rule__GyroSensor__PositionAssignment_2"
    // InternalLegoLang.g:8133:1: rule__GyroSensor__PositionAssignment_2 : ( ruleEInt ) ;
    public final void rule__GyroSensor__PositionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8137:1: ( ( ruleEInt ) )
            // InternalLegoLang.g:8138:2: ( ruleEInt )
            {
            // InternalLegoLang.g:8138:2: ( ruleEInt )
            // InternalLegoLang.g:8139:3: ruleEInt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGyroSensorAccess().getPositionEIntParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGyroSensorAccess().getPositionEIntParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__GyroSensor__PositionAssignment_2"


    // $ANTLR start "rule__UltraSonicSensor__NameAssignment_1"
    // InternalLegoLang.g:8148:1: rule__UltraSonicSensor__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__UltraSonicSensor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8152:1: ( ( ruleEString ) )
            // InternalLegoLang.g:8153:2: ( ruleEString )
            {
            // InternalLegoLang.g:8153:2: ( ruleEString )
            // InternalLegoLang.g:8154:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUltraSonicSensorAccess().getNameEStringParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUltraSonicSensorAccess().getNameEStringParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__UltraSonicSensor__NameAssignment_1"


    // $ANTLR start "rule__UltraSonicSensor__PositionAssignment_2"
    // InternalLegoLang.g:8163:1: rule__UltraSonicSensor__PositionAssignment_2 : ( ruleEInt ) ;
    public final void rule__UltraSonicSensor__PositionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8167:1: ( ( ruleEInt ) )
            // InternalLegoLang.g:8168:2: ( ruleEInt )
            {
            // InternalLegoLang.g:8168:2: ( ruleEInt )
            // InternalLegoLang.g:8169:3: ruleEInt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUltraSonicSensorAccess().getPositionEIntParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUltraSonicSensorAccess().getPositionEIntParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__UltraSonicSensor__PositionAssignment_2"


    // $ANTLR start "rule__Car__NameAssignment_1"
    // InternalLegoLang.g:8178:1: rule__Car__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Car__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8182:1: ( ( ruleEString ) )
            // InternalLegoLang.g:8183:2: ( ruleEString )
            {
            // InternalLegoLang.g:8183:2: ( ruleEString )
            // InternalLegoLang.g:8184:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCarAccess().getNameEStringParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCarAccess().getNameEStringParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Car__NameAssignment_1"


    // $ANTLR start "rule__Car__SensorAssignment_3"
    // InternalLegoLang.g:8193:1: rule__Car__SensorAssignment_3 : ( ruleSensor ) ;
    public final void rule__Car__SensorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8197:1: ( ( ruleSensor ) )
            // InternalLegoLang.g:8198:2: ( ruleSensor )
            {
            // InternalLegoLang.g:8198:2: ( ruleSensor )
            // InternalLegoLang.g:8199:3: ruleSensor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCarAccess().getSensorSensorParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSensor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCarAccess().getSensorSensorParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__Car__SensorAssignment_3"


    // $ANTLR start "rule__Car__EngineAssignment_4"
    // InternalLegoLang.g:8208:1: rule__Car__EngineAssignment_4 : ( ruleEngine ) ;
    public final void rule__Car__EngineAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8212:1: ( ( ruleEngine ) )
            // InternalLegoLang.g:8213:2: ( ruleEngine )
            {
            // InternalLegoLang.g:8213:2: ( ruleEngine )
            // InternalLegoLang.g:8214:3: ruleEngine
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCarAccess().getEngineEngineParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEngine();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCarAccess().getEngineEngineParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__Car__EngineAssignment_4"


    // $ANTLR start "rule__VitesseOperation__WheelengineAssignment_3"
    // InternalLegoLang.g:8223:1: rule__VitesseOperation__WheelengineAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__VitesseOperation__WheelengineAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8227:1: ( ( ( ruleFQN ) ) )
            // InternalLegoLang.g:8228:2: ( ( ruleFQN ) )
            {
            // InternalLegoLang.g:8228:2: ( ( ruleFQN ) )
            // InternalLegoLang.g:8229:3: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVitesseOperationAccess().getWheelengineWheelEngineCrossReference_3_0()); 
            }
            // InternalLegoLang.g:8230:3: ( ruleFQN )
            // InternalLegoLang.g:8231:4: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVitesseOperationAccess().getWheelengineWheelEngineFQNParserRuleCall_3_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVitesseOperationAccess().getWheelengineWheelEngineFQNParserRuleCall_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVitesseOperationAccess().getWheelengineWheelEngineCrossReference_3_0()); 
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
    // $ANTLR end "rule__VitesseOperation__WheelengineAssignment_3"


    // $ANTLR start "rule__VitesseOperation__RightAssignment_6"
    // InternalLegoLang.g:8242:1: rule__VitesseOperation__RightAssignment_6 : ( ruleExpression ) ;
    public final void rule__VitesseOperation__RightAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8246:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:8247:2: ( ruleExpression )
            {
            // InternalLegoLang.g:8247:2: ( ruleExpression )
            // InternalLegoLang.g:8248:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVitesseOperationAccess().getRightExpressionParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVitesseOperationAccess().getRightExpressionParserRuleCall_6_0()); 
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
    // $ANTLR end "rule__VitesseOperation__RightAssignment_6"


    // $ANTLR start "rule__ColorOperation__ColorsensorAssignment_3"
    // InternalLegoLang.g:8257:1: rule__ColorOperation__ColorsensorAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__ColorOperation__ColorsensorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8261:1: ( ( ( ruleFQN ) ) )
            // InternalLegoLang.g:8262:2: ( ( ruleFQN ) )
            {
            // InternalLegoLang.g:8262:2: ( ( ruleFQN ) )
            // InternalLegoLang.g:8263:3: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorOperationAccess().getColorsensorColorSensorCrossReference_3_0()); 
            }
            // InternalLegoLang.g:8264:3: ( ruleFQN )
            // InternalLegoLang.g:8265:4: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorOperationAccess().getColorsensorColorSensorFQNParserRuleCall_3_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getColorOperationAccess().getColorsensorColorSensorFQNParserRuleCall_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getColorOperationAccess().getColorsensorColorSensorCrossReference_3_0()); 
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
    // $ANTLR end "rule__ColorOperation__ColorsensorAssignment_3"


    // $ANTLR start "rule__IntensityOperation__ColorsensorAssignment_3"
    // InternalLegoLang.g:8276:1: rule__IntensityOperation__ColorsensorAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__IntensityOperation__ColorsensorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8280:1: ( ( ( ruleFQN ) ) )
            // InternalLegoLang.g:8281:2: ( ( ruleFQN ) )
            {
            // InternalLegoLang.g:8281:2: ( ( ruleFQN ) )
            // InternalLegoLang.g:8282:3: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntensityOperationAccess().getColorsensorColorSensorCrossReference_3_0()); 
            }
            // InternalLegoLang.g:8283:3: ( ruleFQN )
            // InternalLegoLang.g:8284:4: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntensityOperationAccess().getColorsensorColorSensorFQNParserRuleCall_3_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntensityOperationAccess().getColorsensorColorSensorFQNParserRuleCall_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntensityOperationAccess().getColorsensorColorSensorCrossReference_3_0()); 
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
    // $ANTLR end "rule__IntensityOperation__ColorsensorAssignment_3"


    // $ANTLR start "rule__RangeOperation__LasersensorAssignment_3"
    // InternalLegoLang.g:8295:1: rule__RangeOperation__LasersensorAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__RangeOperation__LasersensorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8299:1: ( ( ( ruleFQN ) ) )
            // InternalLegoLang.g:8300:2: ( ( ruleFQN ) )
            {
            // InternalLegoLang.g:8300:2: ( ( ruleFQN ) )
            // InternalLegoLang.g:8301:3: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeOperationAccess().getLasersensorLaserSensorCrossReference_3_0()); 
            }
            // InternalLegoLang.g:8302:3: ( ruleFQN )
            // InternalLegoLang.g:8303:4: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeOperationAccess().getLasersensorLaserSensorFQNParserRuleCall_3_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeOperationAccess().getLasersensorLaserSensorFQNParserRuleCall_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeOperationAccess().getLasersensorLaserSensorCrossReference_3_0()); 
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
    // $ANTLR end "rule__RangeOperation__LasersensorAssignment_3"


    // $ANTLR start "rule__XGPSOperation__GpssensorAssignment_3"
    // InternalLegoLang.g:8314:1: rule__XGPSOperation__GpssensorAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__XGPSOperation__GpssensorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8318:1: ( ( ( ruleFQN ) ) )
            // InternalLegoLang.g:8319:2: ( ( ruleFQN ) )
            {
            // InternalLegoLang.g:8319:2: ( ( ruleFQN ) )
            // InternalLegoLang.g:8320:3: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGPSOperationAccess().getGpssensorGPSSensorCrossReference_3_0()); 
            }
            // InternalLegoLang.g:8321:3: ( ruleFQN )
            // InternalLegoLang.g:8322:4: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGPSOperationAccess().getGpssensorGPSSensorFQNParserRuleCall_3_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGPSOperationAccess().getGpssensorGPSSensorFQNParserRuleCall_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGPSOperationAccess().getGpssensorGPSSensorCrossReference_3_0()); 
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
    // $ANTLR end "rule__XGPSOperation__GpssensorAssignment_3"


    // $ANTLR start "rule__YGPSOperation__GpssensorAssignment_3"
    // InternalLegoLang.g:8333:1: rule__YGPSOperation__GpssensorAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__YGPSOperation__GpssensorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8337:1: ( ( ( ruleFQN ) ) )
            // InternalLegoLang.g:8338:2: ( ( ruleFQN ) )
            {
            // InternalLegoLang.g:8338:2: ( ( ruleFQN ) )
            // InternalLegoLang.g:8339:3: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYGPSOperationAccess().getGpssensorGPSSensorCrossReference_3_0()); 
            }
            // InternalLegoLang.g:8340:3: ( ruleFQN )
            // InternalLegoLang.g:8341:4: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYGPSOperationAccess().getGpssensorGPSSensorFQNParserRuleCall_3_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYGPSOperationAccess().getGpssensorGPSSensorFQNParserRuleCall_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYGPSOperationAccess().getGpssensorGPSSensorCrossReference_3_0()); 
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
    // $ANTLR end "rule__YGPSOperation__GpssensorAssignment_3"


    // $ANTLR start "rule__AngleOperation__GyrosensorAssignment_3"
    // InternalLegoLang.g:8352:1: rule__AngleOperation__GyrosensorAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__AngleOperation__GyrosensorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8356:1: ( ( ( ruleFQN ) ) )
            // InternalLegoLang.g:8357:2: ( ( ruleFQN ) )
            {
            // InternalLegoLang.g:8357:2: ( ( ruleFQN ) )
            // InternalLegoLang.g:8358:3: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAngleOperationAccess().getGyrosensorGyroSensorCrossReference_3_0()); 
            }
            // InternalLegoLang.g:8359:3: ( ruleFQN )
            // InternalLegoLang.g:8360:4: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAngleOperationAccess().getGyrosensorGyroSensorFQNParserRuleCall_3_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAngleOperationAccess().getGyrosensorGyroSensorFQNParserRuleCall_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAngleOperationAccess().getGyrosensorGyroSensorCrossReference_3_0()); 
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
    // $ANTLR end "rule__AngleOperation__GyrosensorAssignment_3"


    // $ANTLR start "rule__DistanceOperation__UltrasonicsensorAssignment_3"
    // InternalLegoLang.g:8371:1: rule__DistanceOperation__UltrasonicsensorAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__DistanceOperation__UltrasonicsensorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8375:1: ( ( ( ruleFQN ) ) )
            // InternalLegoLang.g:8376:2: ( ( ruleFQN ) )
            {
            // InternalLegoLang.g:8376:2: ( ( ruleFQN ) )
            // InternalLegoLang.g:8377:3: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDistanceOperationAccess().getUltrasonicsensorUltraSonicSensorCrossReference_3_0()); 
            }
            // InternalLegoLang.g:8378:3: ( ruleFQN )
            // InternalLegoLang.g:8379:4: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDistanceOperationAccess().getUltrasonicsensorUltraSonicSensorFQNParserRuleCall_3_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDistanceOperationAccess().getUltrasonicsensorUltraSonicSensorFQNParserRuleCall_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDistanceOperationAccess().getUltrasonicsensorUltraSonicSensorCrossReference_3_0()); 
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
    // $ANTLR end "rule__DistanceOperation__UltrasonicsensorAssignment_3"


    // $ANTLR start "rule__And__LeftAssignment_2"
    // InternalLegoLang.g:8390:1: rule__And__LeftAssignment_2 : ( ruleExpression ) ;
    public final void rule__And__LeftAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8394:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:8395:2: ( ruleExpression )
            {
            // InternalLegoLang.g:8395:2: ( ruleExpression )
            // InternalLegoLang.g:8396:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getLeftExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getLeftExpressionParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__And__LeftAssignment_2"


    // $ANTLR start "rule__And__RightAssignment_3_1"
    // InternalLegoLang.g:8405:1: rule__And__RightAssignment_3_1 : ( ruleExpression ) ;
    public final void rule__And__RightAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8409:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:8410:2: ( ruleExpression )
            {
            // InternalLegoLang.g:8410:2: ( ruleExpression )
            // InternalLegoLang.g:8411:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getRightExpressionParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getRightExpressionParserRuleCall_3_1_0()); 
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
    // $ANTLR end "rule__And__RightAssignment_3_1"


    // $ANTLR start "rule__Or__LeftAssignment_2"
    // InternalLegoLang.g:8420:1: rule__Or__LeftAssignment_2 : ( ruleExpression ) ;
    public final void rule__Or__LeftAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8424:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:8425:2: ( ruleExpression )
            {
            // InternalLegoLang.g:8425:2: ( ruleExpression )
            // InternalLegoLang.g:8426:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getLeftExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getLeftExpressionParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Or__LeftAssignment_2"


    // $ANTLR start "rule__Or__RightAssignment_3_1"
    // InternalLegoLang.g:8435:1: rule__Or__RightAssignment_3_1 : ( ruleExpression ) ;
    public final void rule__Or__RightAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8439:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:8440:2: ( ruleExpression )
            {
            // InternalLegoLang.g:8440:2: ( ruleExpression )
            // InternalLegoLang.g:8441:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getRightExpressionParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getRightExpressionParserRuleCall_3_1_0()); 
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
    // $ANTLR end "rule__Or__RightAssignment_3_1"


    // $ANTLR start "rule__ConditionEtat__ConditionAssignment_1"
    // InternalLegoLang.g:8450:1: rule__ConditionEtat__ConditionAssignment_1 : ( ruleBooleanExpression ) ;
    public final void rule__ConditionEtat__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8454:1: ( ( ruleBooleanExpression ) )
            // InternalLegoLang.g:8455:2: ( ruleBooleanExpression )
            {
            // InternalLegoLang.g:8455:2: ( ruleBooleanExpression )
            // InternalLegoLang.g:8456:3: ruleBooleanExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionEtatAccess().getConditionBooleanExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBooleanExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionEtatAccess().getConditionBooleanExpressionParserRuleCall_1_0()); 
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
    // InternalLegoLang.g:8465:1: rule__ConditionEtat__ThenAssignment_3 : ( ruleStatement ) ;
    public final void rule__ConditionEtat__ThenAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8469:1: ( ( ruleStatement ) )
            // InternalLegoLang.g:8470:2: ( ruleStatement )
            {
            // InternalLegoLang.g:8470:2: ( ruleStatement )
            // InternalLegoLang.g:8471:3: ruleStatement
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
    // InternalLegoLang.g:8480:1: rule__ConditionEtat__ElseAssignment_5_1 : ( ruleStatement ) ;
    public final void rule__ConditionEtat__ElseAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8484:1: ( ( ruleStatement ) )
            // InternalLegoLang.g:8485:2: ( ruleStatement )
            {
            // InternalLegoLang.g:8485:2: ( ruleStatement )
            // InternalLegoLang.g:8486:3: ruleStatement
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
    // InternalLegoLang.g:8495:1: rule__WhileLoop__LoopConditionAssignment_1 : ( ruleBooleanExpression ) ;
    public final void rule__WhileLoop__LoopConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8499:1: ( ( ruleBooleanExpression ) )
            // InternalLegoLang.g:8500:2: ( ruleBooleanExpression )
            {
            // InternalLegoLang.g:8500:2: ( ruleBooleanExpression )
            // InternalLegoLang.g:8501:3: ruleBooleanExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileLoopAccess().getLoopConditionBooleanExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBooleanExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileLoopAccess().getLoopConditionBooleanExpressionParserRuleCall_1_0()); 
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
    // InternalLegoLang.g:8510:1: rule__WhileLoop__StatementAssignment_3 : ( ruleStatement ) ;
    public final void rule__WhileLoop__StatementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8514:1: ( ( ruleStatement ) )
            // InternalLegoLang.g:8515:2: ( ruleStatement )
            {
            // InternalLegoLang.g:8515:2: ( ruleStatement )
            // InternalLegoLang.g:8516:3: ruleStatement
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
    // InternalLegoLang.g:8525:1: rule__MethodePrint__ExpressionAssignment_2_0 : ( ruleExpression ) ;
    public final void rule__MethodePrint__ExpressionAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8529:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:8530:2: ( ruleExpression )
            {
            // InternalLegoLang.g:8530:2: ( ruleExpression )
            // InternalLegoLang.g:8531:3: ruleExpression
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
    // InternalLegoLang.g:8540:1: rule__VariableRef__VariableAssignment : ( ( ruleEString ) ) ;
    public final void rule__VariableRef__VariableAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8544:1: ( ( ( ruleEString ) ) )
            // InternalLegoLang.g:8545:2: ( ( ruleEString ) )
            {
            // InternalLegoLang.g:8545:2: ( ( ruleEString ) )
            // InternalLegoLang.g:8546:3: ( ruleEString )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableRefAccess().getVariableVariableCrossReference_0()); 
            }
            // InternalLegoLang.g:8547:3: ( ruleEString )
            // InternalLegoLang.g:8548:4: ruleEString
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
    // InternalLegoLang.g:8559:1: rule__Substraction__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__Substraction__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8563:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:8564:2: ( ruleExpression )
            {
            // InternalLegoLang.g:8564:2: ( ruleExpression )
            // InternalLegoLang.g:8565:3: ruleExpression
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
    // InternalLegoLang.g:8574:1: rule__Substraction__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__Substraction__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8578:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:8579:2: ( ruleExpression )
            {
            // InternalLegoLang.g:8579:2: ( ruleExpression )
            // InternalLegoLang.g:8580:3: ruleExpression
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
    // InternalLegoLang.g:8589:1: rule__Addition__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__Addition__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8593:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:8594:2: ( ruleExpression )
            {
            // InternalLegoLang.g:8594:2: ( ruleExpression )
            // InternalLegoLang.g:8595:3: ruleExpression
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
    // InternalLegoLang.g:8604:1: rule__Addition__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__Addition__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8608:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:8609:2: ( ruleExpression )
            {
            // InternalLegoLang.g:8609:2: ( ruleExpression )
            // InternalLegoLang.g:8610:3: ruleExpression
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
    // InternalLegoLang.g:8619:1: rule__Multiplication__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__Multiplication__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8623:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:8624:2: ( ruleExpression )
            {
            // InternalLegoLang.g:8624:2: ( ruleExpression )
            // InternalLegoLang.g:8625:3: ruleExpression
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
    // InternalLegoLang.g:8634:1: rule__Multiplication__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__Multiplication__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8638:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:8639:2: ( ruleExpression )
            {
            // InternalLegoLang.g:8639:2: ( ruleExpression )
            // InternalLegoLang.g:8640:3: ruleExpression
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
    // InternalLegoLang.g:8649:1: rule__Division__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__Division__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8653:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:8654:2: ( ruleExpression )
            {
            // InternalLegoLang.g:8654:2: ( ruleExpression )
            // InternalLegoLang.g:8655:3: ruleExpression
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
    // InternalLegoLang.g:8664:1: rule__Division__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__Division__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8668:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:8669:2: ( ruleExpression )
            {
            // InternalLegoLang.g:8669:2: ( ruleExpression )
            // InternalLegoLang.g:8670:3: ruleExpression
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
    // InternalLegoLang.g:8679:1: rule__GT__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__GT__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8683:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:8684:2: ( ruleExpression )
            {
            // InternalLegoLang.g:8684:2: ( ruleExpression )
            // InternalLegoLang.g:8685:3: ruleExpression
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
    // InternalLegoLang.g:8694:1: rule__GT__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__GT__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8698:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:8699:2: ( ruleExpression )
            {
            // InternalLegoLang.g:8699:2: ( ruleExpression )
            // InternalLegoLang.g:8700:3: ruleExpression
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
    // InternalLegoLang.g:8709:1: rule__LT__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__LT__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8713:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:8714:2: ( ruleExpression )
            {
            // InternalLegoLang.g:8714:2: ( ruleExpression )
            // InternalLegoLang.g:8715:3: ruleExpression
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
    // InternalLegoLang.g:8724:1: rule__LT__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__LT__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8728:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:8729:2: ( ruleExpression )
            {
            // InternalLegoLang.g:8729:2: ( ruleExpression )
            // InternalLegoLang.g:8730:3: ruleExpression
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
    // InternalLegoLang.g:8739:1: rule__Equal__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__Equal__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8743:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:8744:2: ( ruleExpression )
            {
            // InternalLegoLang.g:8744:2: ( ruleExpression )
            // InternalLegoLang.g:8745:3: ruleExpression
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
    // InternalLegoLang.g:8754:1: rule__Equal__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__Equal__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8758:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:8759:2: ( ruleExpression )
            {
            // InternalLegoLang.g:8759:2: ( ruleExpression )
            // InternalLegoLang.g:8760:3: ruleExpression
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
    // InternalLegoLang.g:8769:1: rule__Different__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__Different__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8773:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:8774:2: ( ruleExpression )
            {
            // InternalLegoLang.g:8774:2: ( ruleExpression )
            // InternalLegoLang.g:8775:3: ruleExpression
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
    // InternalLegoLang.g:8784:1: rule__Different__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__Different__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8788:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:8789:2: ( ruleExpression )
            {
            // InternalLegoLang.g:8789:2: ( ruleExpression )
            // InternalLegoLang.g:8790:3: ruleExpression
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
    // InternalLegoLang.g:8799:1: rule__LTorEqual__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__LTorEqual__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8803:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:8804:2: ( ruleExpression )
            {
            // InternalLegoLang.g:8804:2: ( ruleExpression )
            // InternalLegoLang.g:8805:3: ruleExpression
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
    // InternalLegoLang.g:8814:1: rule__LTorEqual__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__LTorEqual__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8818:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:8819:2: ( ruleExpression )
            {
            // InternalLegoLang.g:8819:2: ( ruleExpression )
            // InternalLegoLang.g:8820:3: ruleExpression
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
    // InternalLegoLang.g:8829:1: rule__GTorEqual__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__GTorEqual__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8833:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:8834:2: ( ruleExpression )
            {
            // InternalLegoLang.g:8834:2: ( ruleExpression )
            // InternalLegoLang.g:8835:3: ruleExpression
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
    // InternalLegoLang.g:8844:1: rule__GTorEqual__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__GTorEqual__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8848:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:8849:2: ( ruleExpression )
            {
            // InternalLegoLang.g:8849:2: ( ruleExpression )
            // InternalLegoLang.g:8850:3: ruleExpression
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
    // InternalLegoLang.g:8859:1: rule__Assignement__LeftAssignment_2 : ( ruleExpression ) ;
    public final void rule__Assignement__LeftAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8863:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:8864:2: ( ruleExpression )
            {
            // InternalLegoLang.g:8864:2: ( ruleExpression )
            // InternalLegoLang.g:8865:3: ruleExpression
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
    // InternalLegoLang.g:8874:1: rule__Assignement__RightAssignment_4 : ( ruleExpression ) ;
    public final void rule__Assignement__RightAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8878:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:8879:2: ( ruleExpression )
            {
            // InternalLegoLang.g:8879:2: ( ruleExpression )
            // InternalLegoLang.g:8880:3: ruleExpression
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
    // InternalLegoLang.g:8889:1: rule__PlusEqual__LeftAssignment_2 : ( ruleExpression ) ;
    public final void rule__PlusEqual__LeftAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8893:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:8894:2: ( ruleExpression )
            {
            // InternalLegoLang.g:8894:2: ( ruleExpression )
            // InternalLegoLang.g:8895:3: ruleExpression
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
    // InternalLegoLang.g:8904:1: rule__PlusEqual__RightAssignment_4 : ( ruleExpression ) ;
    public final void rule__PlusEqual__RightAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8908:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:8909:2: ( ruleExpression )
            {
            // InternalLegoLang.g:8909:2: ( ruleExpression )
            // InternalLegoLang.g:8910:3: ruleExpression
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
    // InternalLegoLang.g:8919:1: rule__MinusEqual__LeftAssignment_2 : ( ruleExpression ) ;
    public final void rule__MinusEqual__LeftAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8923:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:8924:2: ( ruleExpression )
            {
            // InternalLegoLang.g:8924:2: ( ruleExpression )
            // InternalLegoLang.g:8925:3: ruleExpression
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
    // InternalLegoLang.g:8934:1: rule__MinusEqual__RightAssignment_4 : ( ruleExpression ) ;
    public final void rule__MinusEqual__RightAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8938:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:8939:2: ( ruleExpression )
            {
            // InternalLegoLang.g:8939:2: ( ruleExpression )
            // InternalLegoLang.g:8940:3: ruleExpression
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
    // InternalLegoLang.g:8949:1: rule__UnInteger__IsConstAssignment_1 : ( ( 'const' ) ) ;
    public final void rule__UnInteger__IsConstAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8953:1: ( ( ( 'const' ) ) )
            // InternalLegoLang.g:8954:2: ( ( 'const' ) )
            {
            // InternalLegoLang.g:8954:2: ( ( 'const' ) )
            // InternalLegoLang.g:8955:3: ( 'const' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnIntegerAccess().getIsConstConstKeyword_1_0()); 
            }
            // InternalLegoLang.g:8956:3: ( 'const' )
            // InternalLegoLang.g:8957:4: 'const'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnIntegerAccess().getIsConstConstKeyword_1_0()); 
            }
            match(input,62,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:8968:1: rule__UnInteger__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__UnInteger__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8972:1: ( ( ruleEString ) )
            // InternalLegoLang.g:8973:2: ( ruleEString )
            {
            // InternalLegoLang.g:8973:2: ( ruleEString )
            // InternalLegoLang.g:8974:3: ruleEString
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
    // InternalLegoLang.g:8983:1: rule__UnInteger__InitialeValueAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__UnInteger__InitialeValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8987:1: ( ( ruleEInt ) )
            // InternalLegoLang.g:8988:2: ( ruleEInt )
            {
            // InternalLegoLang.g:8988:2: ( ruleEInt )
            // InternalLegoLang.g:8989:3: ruleEInt
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
    // InternalLegoLang.g:8998:1: rule__UnDouble__IsConstAssignment_1 : ( ( 'const' ) ) ;
    public final void rule__UnDouble__IsConstAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:9002:1: ( ( ( 'const' ) ) )
            // InternalLegoLang.g:9003:2: ( ( 'const' ) )
            {
            // InternalLegoLang.g:9003:2: ( ( 'const' ) )
            // InternalLegoLang.g:9004:3: ( 'const' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnDoubleAccess().getIsConstConstKeyword_1_0()); 
            }
            // InternalLegoLang.g:9005:3: ( 'const' )
            // InternalLegoLang.g:9006:4: 'const'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnDoubleAccess().getIsConstConstKeyword_1_0()); 
            }
            match(input,62,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:9017:1: rule__UnDouble__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__UnDouble__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:9021:1: ( ( ruleEString ) )
            // InternalLegoLang.g:9022:2: ( ruleEString )
            {
            // InternalLegoLang.g:9022:2: ( ruleEString )
            // InternalLegoLang.g:9023:3: ruleEString
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
    // InternalLegoLang.g:9032:1: rule__UnDouble__InitialeValue1Assignment_4_1 : ( ruleEInt ) ;
    public final void rule__UnDouble__InitialeValue1Assignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:9036:1: ( ( ruleEInt ) )
            // InternalLegoLang.g:9037:2: ( ruleEInt )
            {
            // InternalLegoLang.g:9037:2: ( ruleEInt )
            // InternalLegoLang.g:9038:3: ruleEInt
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
    // InternalLegoLang.g:9047:1: rule__UnDouble__InitialeValue2Assignment_4_2_1 : ( ruleEInt ) ;
    public final void rule__UnDouble__InitialeValue2Assignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:9051:1: ( ( ruleEInt ) )
            // InternalLegoLang.g:9052:2: ( ruleEInt )
            {
            // InternalLegoLang.g:9052:2: ( ruleEInt )
            // InternalLegoLang.g:9053:3: ruleEInt
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
    // InternalLegoLang.g:9062:1: rule__UnBoolean__IsConstAssignment_1 : ( ( 'const' ) ) ;
    public final void rule__UnBoolean__IsConstAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:9066:1: ( ( ( 'const' ) ) )
            // InternalLegoLang.g:9067:2: ( ( 'const' ) )
            {
            // InternalLegoLang.g:9067:2: ( ( 'const' ) )
            // InternalLegoLang.g:9068:3: ( 'const' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnBooleanAccess().getIsConstConstKeyword_1_0()); 
            }
            // InternalLegoLang.g:9069:3: ( 'const' )
            // InternalLegoLang.g:9070:4: 'const'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnBooleanAccess().getIsConstConstKeyword_1_0()); 
            }
            match(input,62,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:9081:1: rule__UnBoolean__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__UnBoolean__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:9085:1: ( ( ruleEString ) )
            // InternalLegoLang.g:9086:2: ( ruleEString )
            {
            // InternalLegoLang.g:9086:2: ( ruleEString )
            // InternalLegoLang.g:9087:3: ruleEString
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
    // InternalLegoLang.g:9096:1: rule__UnBoolean__InitialeValueAssignment_4_1 : ( ruleEBoolean ) ;
    public final void rule__UnBoolean__InitialeValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:9100:1: ( ( ruleEBoolean ) )
            // InternalLegoLang.g:9101:2: ( ruleEBoolean )
            {
            // InternalLegoLang.g:9101:2: ( ruleEBoolean )
            // InternalLegoLang.g:9102:3: ruleEBoolean
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
    // InternalLegoLang.g:9111:1: rule__UnString__IsConstAssignment_1 : ( ( 'const' ) ) ;
    public final void rule__UnString__IsConstAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:9115:1: ( ( ( 'const' ) ) )
            // InternalLegoLang.g:9116:2: ( ( 'const' ) )
            {
            // InternalLegoLang.g:9116:2: ( ( 'const' ) )
            // InternalLegoLang.g:9117:3: ( 'const' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnStringAccess().getIsConstConstKeyword_1_0()); 
            }
            // InternalLegoLang.g:9118:3: ( 'const' )
            // InternalLegoLang.g:9119:4: 'const'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnStringAccess().getIsConstConstKeyword_1_0()); 
            }
            match(input,62,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:9130:1: rule__UnString__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__UnString__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:9134:1: ( ( ruleEString ) )
            // InternalLegoLang.g:9135:2: ( ruleEString )
            {
            // InternalLegoLang.g:9135:2: ( ruleEString )
            // InternalLegoLang.g:9136:3: ruleEString
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
    // InternalLegoLang.g:9145:1: rule__UnString__InitialeValueAssignment_4_1 : ( ruleEString ) ;
    public final void rule__UnString__InitialeValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:9149:1: ( ( ruleEString ) )
            // InternalLegoLang.g:9150:2: ( ruleEString )
            {
            // InternalLegoLang.g:9150:2: ( ruleEString )
            // InternalLegoLang.g:9151:3: ruleEString
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
    // InternalLegoLang.g:9160:1: rule__TheDouble__Value1Assignment_1 : ( ruleEInt ) ;
    public final void rule__TheDouble__Value1Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:9164:1: ( ( ruleEInt ) )
            // InternalLegoLang.g:9165:2: ( ruleEInt )
            {
            // InternalLegoLang.g:9165:2: ( ruleEInt )
            // InternalLegoLang.g:9166:3: ruleEInt
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


    // $ANTLR start "rule__TheDouble__Value2Assignment_3"
    // InternalLegoLang.g:9175:1: rule__TheDouble__Value2Assignment_3 : ( ruleEInt ) ;
    public final void rule__TheDouble__Value2Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:9179:1: ( ( ruleEInt ) )
            // InternalLegoLang.g:9180:2: ( ruleEInt )
            {
            // InternalLegoLang.g:9180:2: ( ruleEInt )
            // InternalLegoLang.g:9181:3: ruleEInt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheDoubleAccess().getValue2EIntParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTheDoubleAccess().getValue2EIntParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__TheDouble__Value2Assignment_3"


    // $ANTLR start "rule__TheInt__ValueAssignment_1"
    // InternalLegoLang.g:9190:1: rule__TheInt__ValueAssignment_1 : ( ruleEInt ) ;
    public final void rule__TheInt__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:9194:1: ( ( ruleEInt ) )
            // InternalLegoLang.g:9195:2: ( ruleEInt )
            {
            // InternalLegoLang.g:9195:2: ( ruleEInt )
            // InternalLegoLang.g:9196:3: ruleEInt
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
    // InternalLegoLang.g:9205:1: rule__TheBoolean__ValueAssignment_1 : ( ruleEBoolean ) ;
    public final void rule__TheBoolean__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:9209:1: ( ( ruleEBoolean ) )
            // InternalLegoLang.g:9210:2: ( ruleEBoolean )
            {
            // InternalLegoLang.g:9210:2: ( ruleEBoolean )
            // InternalLegoLang.g:9211:3: ruleEBoolean
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
    // InternalLegoLang.g:9220:1: rule__TheString__ValueAssignment_1 : ( ruleEString ) ;
    public final void rule__TheString__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:9224:1: ( ( ruleEString ) )
            // InternalLegoLang.g:9225:2: ( ruleEString )
            {
            // InternalLegoLang.g:9225:2: ( ruleEString )
            // InternalLegoLang.g:9226:3: ruleEString
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

    // $ANTLR start synpred8_InternalLegoLang
    public final void synpred8_InternalLegoLang_fragment() throws RecognitionException {   
        // InternalLegoLang.g:1540:2: ( ( ruleVariableRef ) )
        // InternalLegoLang.g:1540:2: ( ruleVariableRef )
        {
        // InternalLegoLang.g:1540:2: ( ruleVariableRef )
        // InternalLegoLang.g:1541:3: ruleVariableRef
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
    // $ANTLR end synpred8_InternalLegoLang

    // $ANTLR start synpred9_InternalLegoLang
    public final void synpred9_InternalLegoLang_fragment() throws RecognitionException {   
        // InternalLegoLang.g:1546:2: ( ( ruleBinaryOperation ) )
        // InternalLegoLang.g:1546:2: ( ruleBinaryOperation )
        {
        // InternalLegoLang.g:1546:2: ( ruleBinaryOperation )
        // InternalLegoLang.g:1547:3: ruleBinaryOperation
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getExpressionAccess().getBinaryOperationParserRuleCall_1()); 
        }
        pushFollow(FOLLOW_2);
        ruleBinaryOperation();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred9_InternalLegoLang

    // $ANTLR start synpred10_InternalLegoLang
    public final void synpred10_InternalLegoLang_fragment() throws RecognitionException {   
        // InternalLegoLang.g:1552:2: ( ( ruleTheString ) )
        // InternalLegoLang.g:1552:2: ( ruleTheString )
        {
        // InternalLegoLang.g:1552:2: ( ruleTheString )
        // InternalLegoLang.g:1553:3: ruleTheString
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
    // $ANTLR end synpred10_InternalLegoLang

    // $ANTLR start synpred11_InternalLegoLang
    public final void synpred11_InternalLegoLang_fragment() throws RecognitionException {   
        // InternalLegoLang.g:1558:2: ( ( ruleTheDouble ) )
        // InternalLegoLang.g:1558:2: ( ruleTheDouble )
        {
        // InternalLegoLang.g:1558:2: ( ruleTheDouble )
        // InternalLegoLang.g:1559:3: ruleTheDouble
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
    // $ANTLR end synpred11_InternalLegoLang

    // $ANTLR start synpred12_InternalLegoLang
    public final void synpred12_InternalLegoLang_fragment() throws RecognitionException {   
        // InternalLegoLang.g:1564:2: ( ( ruleTheInt ) )
        // InternalLegoLang.g:1564:2: ( ruleTheInt )
        {
        // InternalLegoLang.g:1564:2: ( ruleTheInt )
        // InternalLegoLang.g:1565:3: ruleTheInt
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
    // $ANTLR end synpred12_InternalLegoLang

    // $ANTLR start synpred16_InternalLegoLang
    public final void synpred16_InternalLegoLang_fragment() throws RecognitionException {   
        // InternalLegoLang.g:1603:2: ( ( ruleSubstraction ) )
        // InternalLegoLang.g:1603:2: ( ruleSubstraction )
        {
        // InternalLegoLang.g:1603:2: ( ruleSubstraction )
        // InternalLegoLang.g:1604:3: ruleSubstraction
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
    // $ANTLR end synpred16_InternalLegoLang

    // $ANTLR start synpred17_InternalLegoLang
    public final void synpred17_InternalLegoLang_fragment() throws RecognitionException {   
        // InternalLegoLang.g:1609:2: ( ( ruleComparaison ) )
        // InternalLegoLang.g:1609:2: ( ruleComparaison )
        {
        // InternalLegoLang.g:1609:2: ( ruleComparaison )
        // InternalLegoLang.g:1610:3: ruleComparaison
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
    // $ANTLR end synpred17_InternalLegoLang

    // $ANTLR start synpred18_InternalLegoLang
    public final void synpred18_InternalLegoLang_fragment() throws RecognitionException {   
        // InternalLegoLang.g:1615:2: ( ( ruleAssignement ) )
        // InternalLegoLang.g:1615:2: ( ruleAssignement )
        {
        // InternalLegoLang.g:1615:2: ( ruleAssignement )
        // InternalLegoLang.g:1616:3: ruleAssignement
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
    // $ANTLR end synpred18_InternalLegoLang

    // $ANTLR start synpred19_InternalLegoLang
    public final void synpred19_InternalLegoLang_fragment() throws RecognitionException {   
        // InternalLegoLang.g:1621:2: ( ( ruleDivision ) )
        // InternalLegoLang.g:1621:2: ( ruleDivision )
        {
        // InternalLegoLang.g:1621:2: ( ruleDivision )
        // InternalLegoLang.g:1622:3: ruleDivision
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
    // $ANTLR end synpred19_InternalLegoLang

    // $ANTLR start synpred20_InternalLegoLang
    public final void synpred20_InternalLegoLang_fragment() throws RecognitionException {   
        // InternalLegoLang.g:1627:2: ( ( ruleMultiplication ) )
        // InternalLegoLang.g:1627:2: ( ruleMultiplication )
        {
        // InternalLegoLang.g:1627:2: ( ruleMultiplication )
        // InternalLegoLang.g:1628:3: ruleMultiplication
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
    // $ANTLR end synpred20_InternalLegoLang

    // $ANTLR start synpred21_InternalLegoLang
    public final void synpred21_InternalLegoLang_fragment() throws RecognitionException {   
        // InternalLegoLang.g:1633:2: ( ( ruleAddition ) )
        // InternalLegoLang.g:1633:2: ( ruleAddition )
        {
        // InternalLegoLang.g:1633:2: ( ruleAddition )
        // InternalLegoLang.g:1634:3: ruleAddition
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
    // $ANTLR end synpred21_InternalLegoLang

    // $ANTLR start synpred22_InternalLegoLang
    public final void synpred22_InternalLegoLang_fragment() throws RecognitionException {   
        // InternalLegoLang.g:1639:2: ( ( ruleMinusEqual ) )
        // InternalLegoLang.g:1639:2: ( ruleMinusEqual )
        {
        // InternalLegoLang.g:1639:2: ( ruleMinusEqual )
        // InternalLegoLang.g:1640:3: ruleMinusEqual
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
    // $ANTLR end synpred22_InternalLegoLang

    // $ANTLR start synpred26_InternalLegoLang
    public final void synpred26_InternalLegoLang_fragment() throws RecognitionException {   
        // InternalLegoLang.g:1693:2: ( ( ruleGT ) )
        // InternalLegoLang.g:1693:2: ( ruleGT )
        {
        // InternalLegoLang.g:1693:2: ( ruleGT )
        // InternalLegoLang.g:1694:3: ruleGT
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
    // $ANTLR end synpred26_InternalLegoLang

    // $ANTLR start synpred27_InternalLegoLang
    public final void synpred27_InternalLegoLang_fragment() throws RecognitionException {   
        // InternalLegoLang.g:1699:2: ( ( ruleEqual ) )
        // InternalLegoLang.g:1699:2: ( ruleEqual )
        {
        // InternalLegoLang.g:1699:2: ( ruleEqual )
        // InternalLegoLang.g:1700:3: ruleEqual
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
    // $ANTLR end synpred27_InternalLegoLang

    // $ANTLR start synpred28_InternalLegoLang
    public final void synpred28_InternalLegoLang_fragment() throws RecognitionException {   
        // InternalLegoLang.g:1705:2: ( ( ruleLT ) )
        // InternalLegoLang.g:1705:2: ( ruleLT )
        {
        // InternalLegoLang.g:1705:2: ( ruleLT )
        // InternalLegoLang.g:1706:3: ruleLT
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
    // $ANTLR end synpred28_InternalLegoLang

    // $ANTLR start synpred29_InternalLegoLang
    public final void synpred29_InternalLegoLang_fragment() throws RecognitionException {   
        // InternalLegoLang.g:1711:2: ( ( ruleDifferent ) )
        // InternalLegoLang.g:1711:2: ( ruleDifferent )
        {
        // InternalLegoLang.g:1711:2: ( ruleDifferent )
        // InternalLegoLang.g:1712:3: ruleDifferent
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
    // $ANTLR end synpred29_InternalLegoLang

    // $ANTLR start synpred30_InternalLegoLang
    public final void synpred30_InternalLegoLang_fragment() throws RecognitionException {   
        // InternalLegoLang.g:1717:2: ( ( ruleGTorEqual ) )
        // InternalLegoLang.g:1717:2: ( ruleGTorEqual )
        {
        // InternalLegoLang.g:1717:2: ( ruleGTorEqual )
        // InternalLegoLang.g:1718:3: ruleGTorEqual
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
    // $ANTLR end synpred30_InternalLegoLang

    // $ANTLR start synpred41_InternalLegoLang
    public final void synpred41_InternalLegoLang_fragment() throws RecognitionException {   
        // InternalLegoLang.g:1828:2: ( ( ruleAnd ) )
        // InternalLegoLang.g:1828:2: ( ruleAnd )
        {
        // InternalLegoLang.g:1828:2: ( ruleAnd )
        // InternalLegoLang.g:1829:3: ruleAnd
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getBooleanExpressionAccess().getAndParserRuleCall_0()); 
        }
        pushFollow(FOLLOW_2);
        ruleAnd();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred41_InternalLegoLang

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
    public final boolean synpred26_InternalLegoLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalLegoLang_fragment(); // can never throw exception
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
    public final boolean synpred29_InternalLegoLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_InternalLegoLang_fragment(); // can never throw exception
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
    public final boolean synpred18_InternalLegoLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalLegoLang_fragment(); // can never throw exception
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
    public final boolean synpred19_InternalLegoLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalLegoLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_InternalLegoLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalLegoLang_fragment(); // can never throw exception
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
    public final boolean synpred17_InternalLegoLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalLegoLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_InternalLegoLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_InternalLegoLang_fragment(); // can never throw exception
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
    public final boolean synpred28_InternalLegoLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_InternalLegoLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred41_InternalLegoLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred41_InternalLegoLang_fragment(); // can never throw exception
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
    static final String dfa_1s = "\20\uffff";
    static final String dfa_2s = "\1\4\5\0\12\uffff";
    static final String dfa_3s = "\1\54\5\0\12\uffff";
    static final String dfa_4s = "\6\uffff\1\6\1\uffff\1\7\1\10\1\1\1\3\1\2\1\11\1\4\1\5";
    static final String dfa_5s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\2\1\5\4\uffff\2\6\12\uffff\1\10\1\uffff\1\3\2\uffff\1\11\17\uffff\1\4",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
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
            return "1535:1: rule__Expression__Alternatives : ( ( ruleVariableRef ) | ( ruleBinaryOperation ) | ( ruleTheString ) | ( ruleTheDouble ) | ( ruleTheInt ) | ( ruleTheBoolean ) | ( ruleEngineOperation ) | ( ruleSensorOperation ) | ( ruleBooleanExpression ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA2_1 = input.LA(1);

                         
                        int index2_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalLegoLang()) ) {s = 10;}

                        else if ( (synpred10_InternalLegoLang()) ) {s = 11;}

                         
                        input.seek(index2_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA2_2 = input.LA(1);

                         
                        int index2_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalLegoLang()) ) {s = 10;}

                        else if ( (synpred10_InternalLegoLang()) ) {s = 11;}

                         
                        input.seek(index2_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA2_3 = input.LA(1);

                         
                        int index2_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalLegoLang()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index2_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA2_4 = input.LA(1);

                         
                        int index2_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalLegoLang()) ) {s = 14;}

                        else if ( (synpred12_InternalLegoLang()) ) {s = 15;}

                         
                        input.seek(index2_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA2_5 = input.LA(1);

                         
                        int index2_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalLegoLang()) ) {s = 14;}

                        else if ( (synpred12_InternalLegoLang()) ) {s = 15;}

                         
                        input.seek(index2_5);
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
    static final String dfa_8s = "\1\31\1\0\10\uffff";
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
            return "1598:1: rule__BinaryOperation__Alternatives : ( ( ruleSubstraction ) | ( ruleComparaison ) | ( ruleAssignement ) | ( ruleDivision ) | ( ruleMultiplication ) | ( ruleAddition ) | ( ruleMinusEqual ) | ( rulePlusEqual ) );";
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
                        if ( (synpred16_InternalLegoLang()) ) {s = 2;}

                        else if ( (synpred17_InternalLegoLang()) ) {s = 3;}

                        else if ( (synpred18_InternalLegoLang()) ) {s = 4;}

                        else if ( (synpred19_InternalLegoLang()) ) {s = 5;}

                        else if ( (synpred20_InternalLegoLang()) ) {s = 6;}

                        else if ( (synpred21_InternalLegoLang()) ) {s = 7;}

                        else if ( (synpred22_InternalLegoLang()) ) {s = 8;}

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
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x7500134012FF9870L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x7500134012FF1872L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000100000000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000003E0002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000100012801870L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001004000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000002004000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x7500134012FF1870L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000100012801872L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x4100000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0200000008000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x7500000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x5000000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x6000000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0800000000000002L});

}