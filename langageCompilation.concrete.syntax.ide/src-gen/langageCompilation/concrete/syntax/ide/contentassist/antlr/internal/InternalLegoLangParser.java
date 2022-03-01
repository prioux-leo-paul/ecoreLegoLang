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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'Program'", "'{'", "'}'", "'WheelEngine'", "'ColorSensor'", "'LaserSensor'", "'GPSSensor'", "'GyroSensor'", "'UltraSonicSensor'", "'Car'", "':'", "'vitesse'", "'='", "'get'", "'color'", "'('", "')'", "'intensity'", "'range'", "'x'", "'y'", "'angle'", "'distance'", "'if'", "'and'", "'or'", "'else{'", "'while'", "'print('", "');'", "','", "'-'", "'+'", "'*'", "'/'", "'>'", "'<'", "'=='", "'!='", "'<='", "'>='", "'+='", "'-='", "'int'", "';'", "'double'", "'.'", "'bool'", "'string'", "'const'"
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


    // $ANTLR start "entryRuleConditionEtat"
    // InternalLegoLang.g:679:1: entryRuleConditionEtat : ruleConditionEtat EOF ;
    public final void entryRuleConditionEtat() throws RecognitionException {
        try {
            // InternalLegoLang.g:680:1: ( ruleConditionEtat EOF )
            // InternalLegoLang.g:681:1: ruleConditionEtat EOF
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
    // InternalLegoLang.g:688:1: ruleConditionEtat : ( ( rule__ConditionEtat__Group__0 ) ) ;
    public final void ruleConditionEtat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:692:2: ( ( ( rule__ConditionEtat__Group__0 ) ) )
            // InternalLegoLang.g:693:2: ( ( rule__ConditionEtat__Group__0 ) )
            {
            // InternalLegoLang.g:693:2: ( ( rule__ConditionEtat__Group__0 ) )
            // InternalLegoLang.g:694:3: ( rule__ConditionEtat__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionEtatAccess().getGroup()); 
            }
            // InternalLegoLang.g:695:3: ( rule__ConditionEtat__Group__0 )
            // InternalLegoLang.g:695:4: rule__ConditionEtat__Group__0
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
    // InternalLegoLang.g:704:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalLegoLang.g:705:1: ( ruleEString EOF )
            // InternalLegoLang.g:706:1: ruleEString EOF
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
    // InternalLegoLang.g:713:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:717:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalLegoLang.g:718:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalLegoLang.g:718:2: ( ( rule__EString__Alternatives ) )
            // InternalLegoLang.g:719:3: ( rule__EString__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringAccess().getAlternatives()); 
            }
            // InternalLegoLang.g:720:3: ( rule__EString__Alternatives )
            // InternalLegoLang.g:720:4: rule__EString__Alternatives
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
    // InternalLegoLang.g:729:1: entryRuleWhileLoop : ruleWhileLoop EOF ;
    public final void entryRuleWhileLoop() throws RecognitionException {
        try {
            // InternalLegoLang.g:730:1: ( ruleWhileLoop EOF )
            // InternalLegoLang.g:731:1: ruleWhileLoop EOF
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
    // InternalLegoLang.g:738:1: ruleWhileLoop : ( ( rule__WhileLoop__Group__0 ) ) ;
    public final void ruleWhileLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:742:2: ( ( ( rule__WhileLoop__Group__0 ) ) )
            // InternalLegoLang.g:743:2: ( ( rule__WhileLoop__Group__0 ) )
            {
            // InternalLegoLang.g:743:2: ( ( rule__WhileLoop__Group__0 ) )
            // InternalLegoLang.g:744:3: ( rule__WhileLoop__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileLoopAccess().getGroup()); 
            }
            // InternalLegoLang.g:745:3: ( rule__WhileLoop__Group__0 )
            // InternalLegoLang.g:745:4: rule__WhileLoop__Group__0
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
    // InternalLegoLang.g:754:1: entryRuleMethodePrint : ruleMethodePrint EOF ;
    public final void entryRuleMethodePrint() throws RecognitionException {
        try {
            // InternalLegoLang.g:755:1: ( ruleMethodePrint EOF )
            // InternalLegoLang.g:756:1: ruleMethodePrint EOF
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
    // InternalLegoLang.g:763:1: ruleMethodePrint : ( ( rule__MethodePrint__Group__0 ) ) ;
    public final void ruleMethodePrint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:767:2: ( ( ( rule__MethodePrint__Group__0 ) ) )
            // InternalLegoLang.g:768:2: ( ( rule__MethodePrint__Group__0 ) )
            {
            // InternalLegoLang.g:768:2: ( ( rule__MethodePrint__Group__0 ) )
            // InternalLegoLang.g:769:3: ( rule__MethodePrint__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodePrintAccess().getGroup()); 
            }
            // InternalLegoLang.g:770:3: ( rule__MethodePrint__Group__0 )
            // InternalLegoLang.g:770:4: rule__MethodePrint__Group__0
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
    // InternalLegoLang.g:779:1: entryRuleVariableRef : ruleVariableRef EOF ;
    public final void entryRuleVariableRef() throws RecognitionException {
        try {
            // InternalLegoLang.g:780:1: ( ruleVariableRef EOF )
            // InternalLegoLang.g:781:1: ruleVariableRef EOF
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
    // InternalLegoLang.g:788:1: ruleVariableRef : ( ( rule__VariableRef__VariableAssignment ) ) ;
    public final void ruleVariableRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:792:2: ( ( ( rule__VariableRef__VariableAssignment ) ) )
            // InternalLegoLang.g:793:2: ( ( rule__VariableRef__VariableAssignment ) )
            {
            // InternalLegoLang.g:793:2: ( ( rule__VariableRef__VariableAssignment ) )
            // InternalLegoLang.g:794:3: ( rule__VariableRef__VariableAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableRefAccess().getVariableAssignment()); 
            }
            // InternalLegoLang.g:795:3: ( rule__VariableRef__VariableAssignment )
            // InternalLegoLang.g:795:4: rule__VariableRef__VariableAssignment
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
    // InternalLegoLang.g:804:1: entryRuleSubstraction : ruleSubstraction EOF ;
    public final void entryRuleSubstraction() throws RecognitionException {
        try {
            // InternalLegoLang.g:805:1: ( ruleSubstraction EOF )
            // InternalLegoLang.g:806:1: ruleSubstraction EOF
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
    // InternalLegoLang.g:813:1: ruleSubstraction : ( ( rule__Substraction__Group__0 ) ) ;
    public final void ruleSubstraction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:817:2: ( ( ( rule__Substraction__Group__0 ) ) )
            // InternalLegoLang.g:818:2: ( ( rule__Substraction__Group__0 ) )
            {
            // InternalLegoLang.g:818:2: ( ( rule__Substraction__Group__0 ) )
            // InternalLegoLang.g:819:3: ( rule__Substraction__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstractionAccess().getGroup()); 
            }
            // InternalLegoLang.g:820:3: ( rule__Substraction__Group__0 )
            // InternalLegoLang.g:820:4: rule__Substraction__Group__0
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
    // InternalLegoLang.g:829:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // InternalLegoLang.g:830:1: ( ruleAddition EOF )
            // InternalLegoLang.g:831:1: ruleAddition EOF
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
    // InternalLegoLang.g:838:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:842:2: ( ( ( rule__Addition__Group__0 ) ) )
            // InternalLegoLang.g:843:2: ( ( rule__Addition__Group__0 ) )
            {
            // InternalLegoLang.g:843:2: ( ( rule__Addition__Group__0 ) )
            // InternalLegoLang.g:844:3: ( rule__Addition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getGroup()); 
            }
            // InternalLegoLang.g:845:3: ( rule__Addition__Group__0 )
            // InternalLegoLang.g:845:4: rule__Addition__Group__0
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
    // InternalLegoLang.g:854:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // InternalLegoLang.g:855:1: ( ruleMultiplication EOF )
            // InternalLegoLang.g:856:1: ruleMultiplication EOF
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
    // InternalLegoLang.g:863:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:867:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // InternalLegoLang.g:868:2: ( ( rule__Multiplication__Group__0 ) )
            {
            // InternalLegoLang.g:868:2: ( ( rule__Multiplication__Group__0 ) )
            // InternalLegoLang.g:869:3: ( rule__Multiplication__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getGroup()); 
            }
            // InternalLegoLang.g:870:3: ( rule__Multiplication__Group__0 )
            // InternalLegoLang.g:870:4: rule__Multiplication__Group__0
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
    // InternalLegoLang.g:879:1: entryRuleDivision : ruleDivision EOF ;
    public final void entryRuleDivision() throws RecognitionException {
        try {
            // InternalLegoLang.g:880:1: ( ruleDivision EOF )
            // InternalLegoLang.g:881:1: ruleDivision EOF
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
    // InternalLegoLang.g:888:1: ruleDivision : ( ( rule__Division__Group__0 ) ) ;
    public final void ruleDivision() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:892:2: ( ( ( rule__Division__Group__0 ) ) )
            // InternalLegoLang.g:893:2: ( ( rule__Division__Group__0 ) )
            {
            // InternalLegoLang.g:893:2: ( ( rule__Division__Group__0 ) )
            // InternalLegoLang.g:894:3: ( rule__Division__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivisionAccess().getGroup()); 
            }
            // InternalLegoLang.g:895:3: ( rule__Division__Group__0 )
            // InternalLegoLang.g:895:4: rule__Division__Group__0
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
    // InternalLegoLang.g:904:1: entryRuleGT : ruleGT EOF ;
    public final void entryRuleGT() throws RecognitionException {
        try {
            // InternalLegoLang.g:905:1: ( ruleGT EOF )
            // InternalLegoLang.g:906:1: ruleGT EOF
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
    // InternalLegoLang.g:913:1: ruleGT : ( ( rule__GT__Group__0 ) ) ;
    public final void ruleGT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:917:2: ( ( ( rule__GT__Group__0 ) ) )
            // InternalLegoLang.g:918:2: ( ( rule__GT__Group__0 ) )
            {
            // InternalLegoLang.g:918:2: ( ( rule__GT__Group__0 ) )
            // InternalLegoLang.g:919:3: ( rule__GT__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTAccess().getGroup()); 
            }
            // InternalLegoLang.g:920:3: ( rule__GT__Group__0 )
            // InternalLegoLang.g:920:4: rule__GT__Group__0
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
    // InternalLegoLang.g:929:1: entryRuleLT : ruleLT EOF ;
    public final void entryRuleLT() throws RecognitionException {
        try {
            // InternalLegoLang.g:930:1: ( ruleLT EOF )
            // InternalLegoLang.g:931:1: ruleLT EOF
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
    // InternalLegoLang.g:938:1: ruleLT : ( ( rule__LT__Group__0 ) ) ;
    public final void ruleLT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:942:2: ( ( ( rule__LT__Group__0 ) ) )
            // InternalLegoLang.g:943:2: ( ( rule__LT__Group__0 ) )
            {
            // InternalLegoLang.g:943:2: ( ( rule__LT__Group__0 ) )
            // InternalLegoLang.g:944:3: ( rule__LT__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTAccess().getGroup()); 
            }
            // InternalLegoLang.g:945:3: ( rule__LT__Group__0 )
            // InternalLegoLang.g:945:4: rule__LT__Group__0
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
    // InternalLegoLang.g:954:1: entryRuleEqual : ruleEqual EOF ;
    public final void entryRuleEqual() throws RecognitionException {
        try {
            // InternalLegoLang.g:955:1: ( ruleEqual EOF )
            // InternalLegoLang.g:956:1: ruleEqual EOF
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
    // InternalLegoLang.g:963:1: ruleEqual : ( ( rule__Equal__Group__0 ) ) ;
    public final void ruleEqual() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:967:2: ( ( ( rule__Equal__Group__0 ) ) )
            // InternalLegoLang.g:968:2: ( ( rule__Equal__Group__0 ) )
            {
            // InternalLegoLang.g:968:2: ( ( rule__Equal__Group__0 ) )
            // InternalLegoLang.g:969:3: ( rule__Equal__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualAccess().getGroup()); 
            }
            // InternalLegoLang.g:970:3: ( rule__Equal__Group__0 )
            // InternalLegoLang.g:970:4: rule__Equal__Group__0
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
    // InternalLegoLang.g:979:1: entryRuleDifferent : ruleDifferent EOF ;
    public final void entryRuleDifferent() throws RecognitionException {
        try {
            // InternalLegoLang.g:980:1: ( ruleDifferent EOF )
            // InternalLegoLang.g:981:1: ruleDifferent EOF
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
    // InternalLegoLang.g:988:1: ruleDifferent : ( ( rule__Different__Group__0 ) ) ;
    public final void ruleDifferent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:992:2: ( ( ( rule__Different__Group__0 ) ) )
            // InternalLegoLang.g:993:2: ( ( rule__Different__Group__0 ) )
            {
            // InternalLegoLang.g:993:2: ( ( rule__Different__Group__0 ) )
            // InternalLegoLang.g:994:3: ( rule__Different__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDifferentAccess().getGroup()); 
            }
            // InternalLegoLang.g:995:3: ( rule__Different__Group__0 )
            // InternalLegoLang.g:995:4: rule__Different__Group__0
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
    // InternalLegoLang.g:1004:1: entryRuleLTorEqual : ruleLTorEqual EOF ;
    public final void entryRuleLTorEqual() throws RecognitionException {
        try {
            // InternalLegoLang.g:1005:1: ( ruleLTorEqual EOF )
            // InternalLegoLang.g:1006:1: ruleLTorEqual EOF
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
    // InternalLegoLang.g:1013:1: ruleLTorEqual : ( ( rule__LTorEqual__Group__0 ) ) ;
    public final void ruleLTorEqual() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1017:2: ( ( ( rule__LTorEqual__Group__0 ) ) )
            // InternalLegoLang.g:1018:2: ( ( rule__LTorEqual__Group__0 ) )
            {
            // InternalLegoLang.g:1018:2: ( ( rule__LTorEqual__Group__0 ) )
            // InternalLegoLang.g:1019:3: ( rule__LTorEqual__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTorEqualAccess().getGroup()); 
            }
            // InternalLegoLang.g:1020:3: ( rule__LTorEqual__Group__0 )
            // InternalLegoLang.g:1020:4: rule__LTorEqual__Group__0
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
    // InternalLegoLang.g:1029:1: entryRuleGTorEqual : ruleGTorEqual EOF ;
    public final void entryRuleGTorEqual() throws RecognitionException {
        try {
            // InternalLegoLang.g:1030:1: ( ruleGTorEqual EOF )
            // InternalLegoLang.g:1031:1: ruleGTorEqual EOF
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
    // InternalLegoLang.g:1038:1: ruleGTorEqual : ( ( rule__GTorEqual__Group__0 ) ) ;
    public final void ruleGTorEqual() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1042:2: ( ( ( rule__GTorEqual__Group__0 ) ) )
            // InternalLegoLang.g:1043:2: ( ( rule__GTorEqual__Group__0 ) )
            {
            // InternalLegoLang.g:1043:2: ( ( rule__GTorEqual__Group__0 ) )
            // InternalLegoLang.g:1044:3: ( rule__GTorEqual__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTorEqualAccess().getGroup()); 
            }
            // InternalLegoLang.g:1045:3: ( rule__GTorEqual__Group__0 )
            // InternalLegoLang.g:1045:4: rule__GTorEqual__Group__0
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
    // InternalLegoLang.g:1054:1: entryRuleAssignement : ruleAssignement EOF ;
    public final void entryRuleAssignement() throws RecognitionException {
        try {
            // InternalLegoLang.g:1055:1: ( ruleAssignement EOF )
            // InternalLegoLang.g:1056:1: ruleAssignement EOF
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
    // InternalLegoLang.g:1063:1: ruleAssignement : ( ( rule__Assignement__Group__0 ) ) ;
    public final void ruleAssignement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1067:2: ( ( ( rule__Assignement__Group__0 ) ) )
            // InternalLegoLang.g:1068:2: ( ( rule__Assignement__Group__0 ) )
            {
            // InternalLegoLang.g:1068:2: ( ( rule__Assignement__Group__0 ) )
            // InternalLegoLang.g:1069:3: ( rule__Assignement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignementAccess().getGroup()); 
            }
            // InternalLegoLang.g:1070:3: ( rule__Assignement__Group__0 )
            // InternalLegoLang.g:1070:4: rule__Assignement__Group__0
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
    // InternalLegoLang.g:1079:1: entryRulePlusEqual : rulePlusEqual EOF ;
    public final void entryRulePlusEqual() throws RecognitionException {
        try {
            // InternalLegoLang.g:1080:1: ( rulePlusEqual EOF )
            // InternalLegoLang.g:1081:1: rulePlusEqual EOF
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
    // InternalLegoLang.g:1088:1: rulePlusEqual : ( ( rule__PlusEqual__Group__0 ) ) ;
    public final void rulePlusEqual() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1092:2: ( ( ( rule__PlusEqual__Group__0 ) ) )
            // InternalLegoLang.g:1093:2: ( ( rule__PlusEqual__Group__0 ) )
            {
            // InternalLegoLang.g:1093:2: ( ( rule__PlusEqual__Group__0 ) )
            // InternalLegoLang.g:1094:3: ( rule__PlusEqual__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusEqualAccess().getGroup()); 
            }
            // InternalLegoLang.g:1095:3: ( rule__PlusEqual__Group__0 )
            // InternalLegoLang.g:1095:4: rule__PlusEqual__Group__0
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
    // InternalLegoLang.g:1104:1: entryRuleMinusEqual : ruleMinusEqual EOF ;
    public final void entryRuleMinusEqual() throws RecognitionException {
        try {
            // InternalLegoLang.g:1105:1: ( ruleMinusEqual EOF )
            // InternalLegoLang.g:1106:1: ruleMinusEqual EOF
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
    // InternalLegoLang.g:1113:1: ruleMinusEqual : ( ( rule__MinusEqual__Group__0 ) ) ;
    public final void ruleMinusEqual() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1117:2: ( ( ( rule__MinusEqual__Group__0 ) ) )
            // InternalLegoLang.g:1118:2: ( ( rule__MinusEqual__Group__0 ) )
            {
            // InternalLegoLang.g:1118:2: ( ( rule__MinusEqual__Group__0 ) )
            // InternalLegoLang.g:1119:3: ( rule__MinusEqual__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinusEqualAccess().getGroup()); 
            }
            // InternalLegoLang.g:1120:3: ( rule__MinusEqual__Group__0 )
            // InternalLegoLang.g:1120:4: rule__MinusEqual__Group__0
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
    // InternalLegoLang.g:1129:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalLegoLang.g:1130:1: ( ruleEBoolean EOF )
            // InternalLegoLang.g:1131:1: ruleEBoolean EOF
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
    // InternalLegoLang.g:1138:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1142:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalLegoLang.g:1143:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalLegoLang.g:1143:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalLegoLang.g:1144:3: ( rule__EBoolean__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            }
            // InternalLegoLang.g:1145:3: ( rule__EBoolean__Alternatives )
            // InternalLegoLang.g:1145:4: rule__EBoolean__Alternatives
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
    // InternalLegoLang.g:1154:1: entryRuleUnInteger : ruleUnInteger EOF ;
    public final void entryRuleUnInteger() throws RecognitionException {
        try {
            // InternalLegoLang.g:1155:1: ( ruleUnInteger EOF )
            // InternalLegoLang.g:1156:1: ruleUnInteger EOF
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
    // InternalLegoLang.g:1163:1: ruleUnInteger : ( ( rule__UnInteger__Group__0 ) ) ;
    public final void ruleUnInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1167:2: ( ( ( rule__UnInteger__Group__0 ) ) )
            // InternalLegoLang.g:1168:2: ( ( rule__UnInteger__Group__0 ) )
            {
            // InternalLegoLang.g:1168:2: ( ( rule__UnInteger__Group__0 ) )
            // InternalLegoLang.g:1169:3: ( rule__UnInteger__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnIntegerAccess().getGroup()); 
            }
            // InternalLegoLang.g:1170:3: ( rule__UnInteger__Group__0 )
            // InternalLegoLang.g:1170:4: rule__UnInteger__Group__0
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
    // InternalLegoLang.g:1179:1: entryRuleUnDouble : ruleUnDouble EOF ;
    public final void entryRuleUnDouble() throws RecognitionException {
        try {
            // InternalLegoLang.g:1180:1: ( ruleUnDouble EOF )
            // InternalLegoLang.g:1181:1: ruleUnDouble EOF
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
    // InternalLegoLang.g:1188:1: ruleUnDouble : ( ( rule__UnDouble__Group__0 ) ) ;
    public final void ruleUnDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1192:2: ( ( ( rule__UnDouble__Group__0 ) ) )
            // InternalLegoLang.g:1193:2: ( ( rule__UnDouble__Group__0 ) )
            {
            // InternalLegoLang.g:1193:2: ( ( rule__UnDouble__Group__0 ) )
            // InternalLegoLang.g:1194:3: ( rule__UnDouble__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnDoubleAccess().getGroup()); 
            }
            // InternalLegoLang.g:1195:3: ( rule__UnDouble__Group__0 )
            // InternalLegoLang.g:1195:4: rule__UnDouble__Group__0
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
    // InternalLegoLang.g:1204:1: entryRuleUnBoolean : ruleUnBoolean EOF ;
    public final void entryRuleUnBoolean() throws RecognitionException {
        try {
            // InternalLegoLang.g:1205:1: ( ruleUnBoolean EOF )
            // InternalLegoLang.g:1206:1: ruleUnBoolean EOF
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
    // InternalLegoLang.g:1213:1: ruleUnBoolean : ( ( rule__UnBoolean__Group__0 ) ) ;
    public final void ruleUnBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1217:2: ( ( ( rule__UnBoolean__Group__0 ) ) )
            // InternalLegoLang.g:1218:2: ( ( rule__UnBoolean__Group__0 ) )
            {
            // InternalLegoLang.g:1218:2: ( ( rule__UnBoolean__Group__0 ) )
            // InternalLegoLang.g:1219:3: ( rule__UnBoolean__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnBooleanAccess().getGroup()); 
            }
            // InternalLegoLang.g:1220:3: ( rule__UnBoolean__Group__0 )
            // InternalLegoLang.g:1220:4: rule__UnBoolean__Group__0
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
    // InternalLegoLang.g:1229:1: entryRuleUnString : ruleUnString EOF ;
    public final void entryRuleUnString() throws RecognitionException {
        try {
            // InternalLegoLang.g:1230:1: ( ruleUnString EOF )
            // InternalLegoLang.g:1231:1: ruleUnString EOF
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
    // InternalLegoLang.g:1238:1: ruleUnString : ( ( rule__UnString__Group__0 ) ) ;
    public final void ruleUnString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1242:2: ( ( ( rule__UnString__Group__0 ) ) )
            // InternalLegoLang.g:1243:2: ( ( rule__UnString__Group__0 ) )
            {
            // InternalLegoLang.g:1243:2: ( ( rule__UnString__Group__0 ) )
            // InternalLegoLang.g:1244:3: ( rule__UnString__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnStringAccess().getGroup()); 
            }
            // InternalLegoLang.g:1245:3: ( rule__UnString__Group__0 )
            // InternalLegoLang.g:1245:4: rule__UnString__Group__0
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
    // InternalLegoLang.g:1254:1: entryRuleTheDouble : ruleTheDouble EOF ;
    public final void entryRuleTheDouble() throws RecognitionException {
        try {
            // InternalLegoLang.g:1255:1: ( ruleTheDouble EOF )
            // InternalLegoLang.g:1256:1: ruleTheDouble EOF
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
    // InternalLegoLang.g:1263:1: ruleTheDouble : ( ( rule__TheDouble__Group__0 ) ) ;
    public final void ruleTheDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1267:2: ( ( ( rule__TheDouble__Group__0 ) ) )
            // InternalLegoLang.g:1268:2: ( ( rule__TheDouble__Group__0 ) )
            {
            // InternalLegoLang.g:1268:2: ( ( rule__TheDouble__Group__0 ) )
            // InternalLegoLang.g:1269:3: ( rule__TheDouble__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheDoubleAccess().getGroup()); 
            }
            // InternalLegoLang.g:1270:3: ( rule__TheDouble__Group__0 )
            // InternalLegoLang.g:1270:4: rule__TheDouble__Group__0
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
    // InternalLegoLang.g:1279:1: entryRuleTheInt : ruleTheInt EOF ;
    public final void entryRuleTheInt() throws RecognitionException {
        try {
            // InternalLegoLang.g:1280:1: ( ruleTheInt EOF )
            // InternalLegoLang.g:1281:1: ruleTheInt EOF
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
    // InternalLegoLang.g:1288:1: ruleTheInt : ( ( rule__TheInt__Group__0 ) ) ;
    public final void ruleTheInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1292:2: ( ( ( rule__TheInt__Group__0 ) ) )
            // InternalLegoLang.g:1293:2: ( ( rule__TheInt__Group__0 ) )
            {
            // InternalLegoLang.g:1293:2: ( ( rule__TheInt__Group__0 ) )
            // InternalLegoLang.g:1294:3: ( rule__TheInt__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheIntAccess().getGroup()); 
            }
            // InternalLegoLang.g:1295:3: ( rule__TheInt__Group__0 )
            // InternalLegoLang.g:1295:4: rule__TheInt__Group__0
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
    // InternalLegoLang.g:1304:1: entryRuleTheBoolean : ruleTheBoolean EOF ;
    public final void entryRuleTheBoolean() throws RecognitionException {
        try {
            // InternalLegoLang.g:1305:1: ( ruleTheBoolean EOF )
            // InternalLegoLang.g:1306:1: ruleTheBoolean EOF
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
    // InternalLegoLang.g:1313:1: ruleTheBoolean : ( ( rule__TheBoolean__Group__0 ) ) ;
    public final void ruleTheBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1317:2: ( ( ( rule__TheBoolean__Group__0 ) ) )
            // InternalLegoLang.g:1318:2: ( ( rule__TheBoolean__Group__0 ) )
            {
            // InternalLegoLang.g:1318:2: ( ( rule__TheBoolean__Group__0 ) )
            // InternalLegoLang.g:1319:3: ( rule__TheBoolean__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheBooleanAccess().getGroup()); 
            }
            // InternalLegoLang.g:1320:3: ( rule__TheBoolean__Group__0 )
            // InternalLegoLang.g:1320:4: rule__TheBoolean__Group__0
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
    // InternalLegoLang.g:1329:1: entryRuleTheString : ruleTheString EOF ;
    public final void entryRuleTheString() throws RecognitionException {
        try {
            // InternalLegoLang.g:1330:1: ( ruleTheString EOF )
            // InternalLegoLang.g:1331:1: ruleTheString EOF
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
    // InternalLegoLang.g:1338:1: ruleTheString : ( ( rule__TheString__Group__0 ) ) ;
    public final void ruleTheString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1342:2: ( ( ( rule__TheString__Group__0 ) ) )
            // InternalLegoLang.g:1343:2: ( ( rule__TheString__Group__0 ) )
            {
            // InternalLegoLang.g:1343:2: ( ( rule__TheString__Group__0 ) )
            // InternalLegoLang.g:1344:3: ( rule__TheString__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheStringAccess().getGroup()); 
            }
            // InternalLegoLang.g:1345:3: ( rule__TheString__Group__0 )
            // InternalLegoLang.g:1345:4: rule__TheString__Group__0
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
    // InternalLegoLang.g:1354:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // InternalLegoLang.g:1355:1: ( ruleFQN EOF )
            // InternalLegoLang.g:1356:1: ruleFQN EOF
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
    // InternalLegoLang.g:1363:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1367:2: ( ( ( rule__FQN__Group__0 ) ) )
            // InternalLegoLang.g:1368:2: ( ( rule__FQN__Group__0 ) )
            {
            // InternalLegoLang.g:1368:2: ( ( rule__FQN__Group__0 ) )
            // InternalLegoLang.g:1369:3: ( rule__FQN__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getGroup()); 
            }
            // InternalLegoLang.g:1370:3: ( rule__FQN__Group__0 )
            // InternalLegoLang.g:1370:4: rule__FQN__Group__0
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
    // InternalLegoLang.g:1379:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalLegoLang.g:1380:1: ( ruleEInt EOF )
            // InternalLegoLang.g:1381:1: ruleEInt EOF
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
    // InternalLegoLang.g:1388:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1392:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalLegoLang.g:1393:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalLegoLang.g:1393:2: ( ( rule__EInt__Group__0 ) )
            // InternalLegoLang.g:1394:3: ( rule__EInt__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntAccess().getGroup()); 
            }
            // InternalLegoLang.g:1395:3: ( rule__EInt__Group__0 )
            // InternalLegoLang.g:1395:4: rule__EInt__Group__0
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
    // InternalLegoLang.g:1403:1: rule__Statement__Alternatives : ( ( ruleWhileLoop ) | ( ruleVariable ) | ( ruleExpression ) | ( ruleConditionEtat ) | ( ruleMethodePrint ) | ( ruleCar ) | ( ruleSensor ) | ( ruleEngine ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1407:1: ( ( ruleWhileLoop ) | ( ruleVariable ) | ( ruleExpression ) | ( ruleConditionEtat ) | ( ruleMethodePrint ) | ( ruleCar ) | ( ruleSensor ) | ( ruleEngine ) )
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
            case 26:
            case 28:
            case 44:
                {
                alt1=3;
                }
                break;
            case 36:
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
                    // InternalLegoLang.g:1408:2: ( ruleWhileLoop )
                    {
                    // InternalLegoLang.g:1408:2: ( ruleWhileLoop )
                    // InternalLegoLang.g:1409:3: ruleWhileLoop
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
                    // InternalLegoLang.g:1414:2: ( ruleVariable )
                    {
                    // InternalLegoLang.g:1414:2: ( ruleVariable )
                    // InternalLegoLang.g:1415:3: ruleVariable
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
                    // InternalLegoLang.g:1420:2: ( ruleExpression )
                    {
                    // InternalLegoLang.g:1420:2: ( ruleExpression )
                    // InternalLegoLang.g:1421:3: ruleExpression
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
                    // InternalLegoLang.g:1426:2: ( ruleConditionEtat )
                    {
                    // InternalLegoLang.g:1426:2: ( ruleConditionEtat )
                    // InternalLegoLang.g:1427:3: ruleConditionEtat
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
                    // InternalLegoLang.g:1432:2: ( ruleMethodePrint )
                    {
                    // InternalLegoLang.g:1432:2: ( ruleMethodePrint )
                    // InternalLegoLang.g:1433:3: ruleMethodePrint
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
                    // InternalLegoLang.g:1438:2: ( ruleCar )
                    {
                    // InternalLegoLang.g:1438:2: ( ruleCar )
                    // InternalLegoLang.g:1439:3: ruleCar
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
                    // InternalLegoLang.g:1444:2: ( ruleSensor )
                    {
                    // InternalLegoLang.g:1444:2: ( ruleSensor )
                    // InternalLegoLang.g:1445:3: ruleSensor
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
                    // InternalLegoLang.g:1450:2: ( ruleEngine )
                    {
                    // InternalLegoLang.g:1450:2: ( ruleEngine )
                    // InternalLegoLang.g:1451:3: ruleEngine
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
    // InternalLegoLang.g:1460:1: rule__Expression__Alternatives : ( ( ruleVariableRef ) | ( ruleBinaryOperation ) | ( ruleTheString ) | ( ruleTheDouble ) | ( ruleTheInt ) | ( ruleTheBoolean ) | ( ruleEngineOperation ) | ( ruleSensorOperation ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1464:1: ( ( ruleVariableRef ) | ( ruleBinaryOperation ) | ( ruleTheString ) | ( ruleTheDouble ) | ( ruleTheInt ) | ( ruleTheBoolean ) | ( ruleEngineOperation ) | ( ruleSensorOperation ) )
            int alt2=8;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalLegoLang.g:1465:2: ( ruleVariableRef )
                    {
                    // InternalLegoLang.g:1465:2: ( ruleVariableRef )
                    // InternalLegoLang.g:1466:3: ruleVariableRef
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
                    // InternalLegoLang.g:1471:2: ( ruleBinaryOperation )
                    {
                    // InternalLegoLang.g:1471:2: ( ruleBinaryOperation )
                    // InternalLegoLang.g:1472:3: ruleBinaryOperation
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
                    // InternalLegoLang.g:1477:2: ( ruleTheString )
                    {
                    // InternalLegoLang.g:1477:2: ( ruleTheString )
                    // InternalLegoLang.g:1478:3: ruleTheString
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
                    // InternalLegoLang.g:1483:2: ( ruleTheDouble )
                    {
                    // InternalLegoLang.g:1483:2: ( ruleTheDouble )
                    // InternalLegoLang.g:1484:3: ruleTheDouble
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
                    // InternalLegoLang.g:1489:2: ( ruleTheInt )
                    {
                    // InternalLegoLang.g:1489:2: ( ruleTheInt )
                    // InternalLegoLang.g:1490:3: ruleTheInt
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
                    // InternalLegoLang.g:1495:2: ( ruleTheBoolean )
                    {
                    // InternalLegoLang.g:1495:2: ( ruleTheBoolean )
                    // InternalLegoLang.g:1496:3: ruleTheBoolean
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
                    // InternalLegoLang.g:1501:2: ( ruleEngineOperation )
                    {
                    // InternalLegoLang.g:1501:2: ( ruleEngineOperation )
                    // InternalLegoLang.g:1502:3: ruleEngineOperation
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
                    // InternalLegoLang.g:1507:2: ( ruleSensorOperation )
                    {
                    // InternalLegoLang.g:1507:2: ( ruleSensorOperation )
                    // InternalLegoLang.g:1508:3: ruleSensorOperation
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

            }
        }
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
    // InternalLegoLang.g:1517:1: rule__BinaryOperation__Alternatives : ( ( ruleSubstraction ) | ( ruleComparaison ) | ( ruleAssignement ) | ( ruleDivision ) | ( ruleMultiplication ) | ( ruleAddition ) | ( ruleMinusEqual ) | ( rulePlusEqual ) );
    public final void rule__BinaryOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1521:1: ( ( ruleSubstraction ) | ( ruleComparaison ) | ( ruleAssignement ) | ( ruleDivision ) | ( ruleMultiplication ) | ( ruleAddition ) | ( ruleMinusEqual ) | ( rulePlusEqual ) )
            int alt3=8;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalLegoLang.g:1522:2: ( ruleSubstraction )
                    {
                    // InternalLegoLang.g:1522:2: ( ruleSubstraction )
                    // InternalLegoLang.g:1523:3: ruleSubstraction
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
                    // InternalLegoLang.g:1528:2: ( ruleComparaison )
                    {
                    // InternalLegoLang.g:1528:2: ( ruleComparaison )
                    // InternalLegoLang.g:1529:3: ruleComparaison
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
                    // InternalLegoLang.g:1534:2: ( ruleAssignement )
                    {
                    // InternalLegoLang.g:1534:2: ( ruleAssignement )
                    // InternalLegoLang.g:1535:3: ruleAssignement
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
                    // InternalLegoLang.g:1540:2: ( ruleDivision )
                    {
                    // InternalLegoLang.g:1540:2: ( ruleDivision )
                    // InternalLegoLang.g:1541:3: ruleDivision
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
                    // InternalLegoLang.g:1546:2: ( ruleMultiplication )
                    {
                    // InternalLegoLang.g:1546:2: ( ruleMultiplication )
                    // InternalLegoLang.g:1547:3: ruleMultiplication
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
                    // InternalLegoLang.g:1552:2: ( ruleAddition )
                    {
                    // InternalLegoLang.g:1552:2: ( ruleAddition )
                    // InternalLegoLang.g:1553:3: ruleAddition
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
                    // InternalLegoLang.g:1558:2: ( ruleMinusEqual )
                    {
                    // InternalLegoLang.g:1558:2: ( ruleMinusEqual )
                    // InternalLegoLang.g:1559:3: ruleMinusEqual
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
                    // InternalLegoLang.g:1564:2: ( rulePlusEqual )
                    {
                    // InternalLegoLang.g:1564:2: ( rulePlusEqual )
                    // InternalLegoLang.g:1565:3: rulePlusEqual
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
    // InternalLegoLang.g:1574:1: rule__Variable__Alternatives : ( ( ruleUnInteger ) | ( ruleUnString ) | ( ruleUnBoolean ) | ( ruleUnDouble ) );
    public final void rule__Variable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1578:1: ( ( ruleUnInteger ) | ( ruleUnString ) | ( ruleUnBoolean ) | ( ruleUnDouble ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 62:
                {
                switch ( input.LA(2) ) {
                case 60:
                    {
                    alt4=3;
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
                case 58:
                    {
                    alt4=4;
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
                    // InternalLegoLang.g:1579:2: ( ruleUnInteger )
                    {
                    // InternalLegoLang.g:1579:2: ( ruleUnInteger )
                    // InternalLegoLang.g:1580:3: ruleUnInteger
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
                    // InternalLegoLang.g:1585:2: ( ruleUnString )
                    {
                    // InternalLegoLang.g:1585:2: ( ruleUnString )
                    // InternalLegoLang.g:1586:3: ruleUnString
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
                    // InternalLegoLang.g:1591:2: ( ruleUnBoolean )
                    {
                    // InternalLegoLang.g:1591:2: ( ruleUnBoolean )
                    // InternalLegoLang.g:1592:3: ruleUnBoolean
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
                    // InternalLegoLang.g:1597:2: ( ruleUnDouble )
                    {
                    // InternalLegoLang.g:1597:2: ( ruleUnDouble )
                    // InternalLegoLang.g:1598:3: ruleUnDouble
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
    // InternalLegoLang.g:1607:1: rule__Comparaison__Alternatives : ( ( ruleGT ) | ( ruleEqual ) | ( ruleLT ) | ( ruleDifferent ) | ( ruleGTorEqual ) | ( ruleLTorEqual ) );
    public final void rule__Comparaison__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1611:1: ( ( ruleGT ) | ( ruleEqual ) | ( ruleLT ) | ( ruleDifferent ) | ( ruleGTorEqual ) | ( ruleLTorEqual ) )
            int alt5=6;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==28) ) {
                int LA5_1 = input.LA(2);

                if ( (synpred25_InternalLegoLang()) ) {
                    alt5=1;
                }
                else if ( (synpred26_InternalLegoLang()) ) {
                    alt5=2;
                }
                else if ( (synpred27_InternalLegoLang()) ) {
                    alt5=3;
                }
                else if ( (synpred28_InternalLegoLang()) ) {
                    alt5=4;
                }
                else if ( (synpred29_InternalLegoLang()) ) {
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
                    // InternalLegoLang.g:1612:2: ( ruleGT )
                    {
                    // InternalLegoLang.g:1612:2: ( ruleGT )
                    // InternalLegoLang.g:1613:3: ruleGT
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
                    // InternalLegoLang.g:1618:2: ( ruleEqual )
                    {
                    // InternalLegoLang.g:1618:2: ( ruleEqual )
                    // InternalLegoLang.g:1619:3: ruleEqual
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
                    // InternalLegoLang.g:1624:2: ( ruleLT )
                    {
                    // InternalLegoLang.g:1624:2: ( ruleLT )
                    // InternalLegoLang.g:1625:3: ruleLT
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
                    // InternalLegoLang.g:1630:2: ( ruleDifferent )
                    {
                    // InternalLegoLang.g:1630:2: ( ruleDifferent )
                    // InternalLegoLang.g:1631:3: ruleDifferent
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
                    // InternalLegoLang.g:1636:2: ( ruleGTorEqual )
                    {
                    // InternalLegoLang.g:1636:2: ( ruleGTorEqual )
                    // InternalLegoLang.g:1637:3: ruleGTorEqual
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
                    // InternalLegoLang.g:1642:2: ( ruleLTorEqual )
                    {
                    // InternalLegoLang.g:1642:2: ( ruleLTorEqual )
                    // InternalLegoLang.g:1643:3: ruleLTorEqual
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
    // InternalLegoLang.g:1652:1: rule__Sensor__Alternatives : ( ( ruleLaserSensor ) | ( ruleColorSensor ) | ( ruleUltraSonicSensor ) | ( ruleGyroSensor ) | ( ruleGPSSensor ) );
    public final void rule__Sensor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1656:1: ( ( ruleLaserSensor ) | ( ruleColorSensor ) | ( ruleUltraSonicSensor ) | ( ruleGyroSensor ) | ( ruleGPSSensor ) )
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
                    // InternalLegoLang.g:1657:2: ( ruleLaserSensor )
                    {
                    // InternalLegoLang.g:1657:2: ( ruleLaserSensor )
                    // InternalLegoLang.g:1658:3: ruleLaserSensor
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
                    // InternalLegoLang.g:1663:2: ( ruleColorSensor )
                    {
                    // InternalLegoLang.g:1663:2: ( ruleColorSensor )
                    // InternalLegoLang.g:1664:3: ruleColorSensor
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
                    // InternalLegoLang.g:1669:2: ( ruleUltraSonicSensor )
                    {
                    // InternalLegoLang.g:1669:2: ( ruleUltraSonicSensor )
                    // InternalLegoLang.g:1670:3: ruleUltraSonicSensor
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
                    // InternalLegoLang.g:1675:2: ( ruleGyroSensor )
                    {
                    // InternalLegoLang.g:1675:2: ( ruleGyroSensor )
                    // InternalLegoLang.g:1676:3: ruleGyroSensor
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
                    // InternalLegoLang.g:1681:2: ( ruleGPSSensor )
                    {
                    // InternalLegoLang.g:1681:2: ( ruleGPSSensor )
                    // InternalLegoLang.g:1682:3: ruleGPSSensor
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
    // InternalLegoLang.g:1691:1: rule__SensorOperation__Alternatives : ( ( ruleRangeOperation ) | ( ruleColorOperation ) | ( ruleIntensityOperation ) | ( ruleXGPSOperation ) | ( ruleYGPSOperation ) | ( ruleAngleOperation ) | ( ruleDistanceOperation ) );
    public final void rule__SensorOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1695:1: ( ( ruleRangeOperation ) | ( ruleColorOperation ) | ( ruleIntensityOperation ) | ( ruleXGPSOperation ) | ( ruleYGPSOperation ) | ( ruleAngleOperation ) | ( ruleDistanceOperation ) )
            int alt7=7;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                switch ( input.LA(2) ) {
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
                case 30:
                    {
                    alt7=3;
                    }
                    break;
                case 27:
                    {
                    alt7=2;
                    }
                    break;
                case 35:
                    {
                    alt7=7;
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
                    // InternalLegoLang.g:1696:2: ( ruleRangeOperation )
                    {
                    // InternalLegoLang.g:1696:2: ( ruleRangeOperation )
                    // InternalLegoLang.g:1697:3: ruleRangeOperation
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
                    // InternalLegoLang.g:1702:2: ( ruleColorOperation )
                    {
                    // InternalLegoLang.g:1702:2: ( ruleColorOperation )
                    // InternalLegoLang.g:1703:3: ruleColorOperation
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
                    // InternalLegoLang.g:1708:2: ( ruleIntensityOperation )
                    {
                    // InternalLegoLang.g:1708:2: ( ruleIntensityOperation )
                    // InternalLegoLang.g:1709:3: ruleIntensityOperation
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
                    // InternalLegoLang.g:1714:2: ( ruleXGPSOperation )
                    {
                    // InternalLegoLang.g:1714:2: ( ruleXGPSOperation )
                    // InternalLegoLang.g:1715:3: ruleXGPSOperation
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
                    // InternalLegoLang.g:1720:2: ( ruleYGPSOperation )
                    {
                    // InternalLegoLang.g:1720:2: ( ruleYGPSOperation )
                    // InternalLegoLang.g:1721:3: ruleYGPSOperation
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
                    // InternalLegoLang.g:1726:2: ( ruleAngleOperation )
                    {
                    // InternalLegoLang.g:1726:2: ( ruleAngleOperation )
                    // InternalLegoLang.g:1727:3: ruleAngleOperation
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
                    // InternalLegoLang.g:1732:2: ( ruleDistanceOperation )
                    {
                    // InternalLegoLang.g:1732:2: ( ruleDistanceOperation )
                    // InternalLegoLang.g:1733:3: ruleDistanceOperation
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


    // $ANTLR start "rule__EString__Alternatives"
    // InternalLegoLang.g:1742:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1746:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalLegoLang.g:1747:2: ( RULE_STRING )
                    {
                    // InternalLegoLang.g:1747:2: ( RULE_STRING )
                    // InternalLegoLang.g:1748:3: RULE_STRING
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
                    // InternalLegoLang.g:1753:2: ( RULE_ID )
                    {
                    // InternalLegoLang.g:1753:2: ( RULE_ID )
                    // InternalLegoLang.g:1754:3: RULE_ID
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
    // InternalLegoLang.g:1763:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1767:1: ( ( 'true' ) | ( 'false' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==11) ) {
                alt9=1;
            }
            else if ( (LA9_0==12) ) {
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
                    // InternalLegoLang.g:1768:2: ( 'true' )
                    {
                    // InternalLegoLang.g:1768:2: ( 'true' )
                    // InternalLegoLang.g:1769:3: 'true'
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
                    // InternalLegoLang.g:1774:2: ( 'false' )
                    {
                    // InternalLegoLang.g:1774:2: ( 'false' )
                    // InternalLegoLang.g:1775:3: 'false'
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
    // InternalLegoLang.g:1784:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1788:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalLegoLang.g:1789:2: rule__Program__Group__0__Impl rule__Program__Group__1
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
    // InternalLegoLang.g:1796:1: rule__Program__Group__0__Impl : ( () ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1800:1: ( ( () ) )
            // InternalLegoLang.g:1801:1: ( () )
            {
            // InternalLegoLang.g:1801:1: ( () )
            // InternalLegoLang.g:1802:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getProgramAction_0()); 
            }
            // InternalLegoLang.g:1803:2: ()
            // InternalLegoLang.g:1803:3: 
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
    // InternalLegoLang.g:1811:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1815:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // InternalLegoLang.g:1816:2: rule__Program__Group__1__Impl rule__Program__Group__2
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
    // InternalLegoLang.g:1823:1: rule__Program__Group__1__Impl : ( 'Program' ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1827:1: ( ( 'Program' ) )
            // InternalLegoLang.g:1828:1: ( 'Program' )
            {
            // InternalLegoLang.g:1828:1: ( 'Program' )
            // InternalLegoLang.g:1829:2: 'Program'
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
    // InternalLegoLang.g:1838:1: rule__Program__Group__2 : rule__Program__Group__2__Impl rule__Program__Group__3 ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1842:1: ( rule__Program__Group__2__Impl rule__Program__Group__3 )
            // InternalLegoLang.g:1843:2: rule__Program__Group__2__Impl rule__Program__Group__3
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
    // InternalLegoLang.g:1850:1: rule__Program__Group__2__Impl : ( ( rule__Program__NameAssignment_2 ) ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1854:1: ( ( ( rule__Program__NameAssignment_2 ) ) )
            // InternalLegoLang.g:1855:1: ( ( rule__Program__NameAssignment_2 ) )
            {
            // InternalLegoLang.g:1855:1: ( ( rule__Program__NameAssignment_2 ) )
            // InternalLegoLang.g:1856:2: ( rule__Program__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getNameAssignment_2()); 
            }
            // InternalLegoLang.g:1857:2: ( rule__Program__NameAssignment_2 )
            // InternalLegoLang.g:1857:3: rule__Program__NameAssignment_2
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
    // InternalLegoLang.g:1865:1: rule__Program__Group__3 : rule__Program__Group__3__Impl rule__Program__Group__4 ;
    public final void rule__Program__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1869:1: ( rule__Program__Group__3__Impl rule__Program__Group__4 )
            // InternalLegoLang.g:1870:2: rule__Program__Group__3__Impl rule__Program__Group__4
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
    // InternalLegoLang.g:1877:1: rule__Program__Group__3__Impl : ( '{' ) ;
    public final void rule__Program__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1881:1: ( ( '{' ) )
            // InternalLegoLang.g:1882:1: ( '{' )
            {
            // InternalLegoLang.g:1882:1: ( '{' )
            // InternalLegoLang.g:1883:2: '{'
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
    // InternalLegoLang.g:1892:1: rule__Program__Group__4 : rule__Program__Group__4__Impl rule__Program__Group__5 ;
    public final void rule__Program__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1896:1: ( rule__Program__Group__4__Impl rule__Program__Group__5 )
            // InternalLegoLang.g:1897:2: rule__Program__Group__4__Impl rule__Program__Group__5
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
    // InternalLegoLang.g:1904:1: rule__Program__Group__4__Impl : ( ( rule__Program__StatementAssignment_4 )* ) ;
    public final void rule__Program__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1908:1: ( ( ( rule__Program__StatementAssignment_4 )* ) )
            // InternalLegoLang.g:1909:1: ( ( rule__Program__StatementAssignment_4 )* )
            {
            // InternalLegoLang.g:1909:1: ( ( rule__Program__StatementAssignment_4 )* )
            // InternalLegoLang.g:1910:2: ( rule__Program__StatementAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getStatementAssignment_4()); 
            }
            // InternalLegoLang.g:1911:2: ( rule__Program__StatementAssignment_4 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_STRING && LA10_0<=RULE_INT)||(LA10_0>=11 && LA10_0<=12)||(LA10_0>=16 && LA10_0<=22)||LA10_0==26||LA10_0==28||LA10_0==36||(LA10_0>=40 && LA10_0<=41)||LA10_0==44||LA10_0==56||LA10_0==58||(LA10_0>=60 && LA10_0<=62)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalLegoLang.g:1911:3: rule__Program__StatementAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Program__StatementAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalLegoLang.g:1919:1: rule__Program__Group__5 : rule__Program__Group__5__Impl ;
    public final void rule__Program__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1923:1: ( rule__Program__Group__5__Impl )
            // InternalLegoLang.g:1924:2: rule__Program__Group__5__Impl
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
    // InternalLegoLang.g:1930:1: rule__Program__Group__5__Impl : ( '}' ) ;
    public final void rule__Program__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1934:1: ( ( '}' ) )
            // InternalLegoLang.g:1935:1: ( '}' )
            {
            // InternalLegoLang.g:1935:1: ( '}' )
            // InternalLegoLang.g:1936:2: '}'
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
    // InternalLegoLang.g:1946:1: rule__WheelEngine__Group__0 : rule__WheelEngine__Group__0__Impl rule__WheelEngine__Group__1 ;
    public final void rule__WheelEngine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1950:1: ( rule__WheelEngine__Group__0__Impl rule__WheelEngine__Group__1 )
            // InternalLegoLang.g:1951:2: rule__WheelEngine__Group__0__Impl rule__WheelEngine__Group__1
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
    // InternalLegoLang.g:1958:1: rule__WheelEngine__Group__0__Impl : ( 'WheelEngine' ) ;
    public final void rule__WheelEngine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1962:1: ( ( 'WheelEngine' ) )
            // InternalLegoLang.g:1963:1: ( 'WheelEngine' )
            {
            // InternalLegoLang.g:1963:1: ( 'WheelEngine' )
            // InternalLegoLang.g:1964:2: 'WheelEngine'
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
    // InternalLegoLang.g:1973:1: rule__WheelEngine__Group__1 : rule__WheelEngine__Group__1__Impl rule__WheelEngine__Group__2 ;
    public final void rule__WheelEngine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1977:1: ( rule__WheelEngine__Group__1__Impl rule__WheelEngine__Group__2 )
            // InternalLegoLang.g:1978:2: rule__WheelEngine__Group__1__Impl rule__WheelEngine__Group__2
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
    // InternalLegoLang.g:1985:1: rule__WheelEngine__Group__1__Impl : ( ( rule__WheelEngine__NameAssignment_1 ) ) ;
    public final void rule__WheelEngine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:1989:1: ( ( ( rule__WheelEngine__NameAssignment_1 ) ) )
            // InternalLegoLang.g:1990:1: ( ( rule__WheelEngine__NameAssignment_1 ) )
            {
            // InternalLegoLang.g:1990:1: ( ( rule__WheelEngine__NameAssignment_1 ) )
            // InternalLegoLang.g:1991:2: ( rule__WheelEngine__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWheelEngineAccess().getNameAssignment_1()); 
            }
            // InternalLegoLang.g:1992:2: ( rule__WheelEngine__NameAssignment_1 )
            // InternalLegoLang.g:1992:3: rule__WheelEngine__NameAssignment_1
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
    // InternalLegoLang.g:2000:1: rule__WheelEngine__Group__2 : rule__WheelEngine__Group__2__Impl ;
    public final void rule__WheelEngine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2004:1: ( rule__WheelEngine__Group__2__Impl )
            // InternalLegoLang.g:2005:2: rule__WheelEngine__Group__2__Impl
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
    // InternalLegoLang.g:2011:1: rule__WheelEngine__Group__2__Impl : ( ( rule__WheelEngine__PositionAssignment_2 ) ) ;
    public final void rule__WheelEngine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2015:1: ( ( ( rule__WheelEngine__PositionAssignment_2 ) ) )
            // InternalLegoLang.g:2016:1: ( ( rule__WheelEngine__PositionAssignment_2 ) )
            {
            // InternalLegoLang.g:2016:1: ( ( rule__WheelEngine__PositionAssignment_2 ) )
            // InternalLegoLang.g:2017:2: ( rule__WheelEngine__PositionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWheelEngineAccess().getPositionAssignment_2()); 
            }
            // InternalLegoLang.g:2018:2: ( rule__WheelEngine__PositionAssignment_2 )
            // InternalLegoLang.g:2018:3: rule__WheelEngine__PositionAssignment_2
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
    // InternalLegoLang.g:2027:1: rule__ColorSensor__Group__0 : rule__ColorSensor__Group__0__Impl rule__ColorSensor__Group__1 ;
    public final void rule__ColorSensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2031:1: ( rule__ColorSensor__Group__0__Impl rule__ColorSensor__Group__1 )
            // InternalLegoLang.g:2032:2: rule__ColorSensor__Group__0__Impl rule__ColorSensor__Group__1
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
    // InternalLegoLang.g:2039:1: rule__ColorSensor__Group__0__Impl : ( 'ColorSensor' ) ;
    public final void rule__ColorSensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2043:1: ( ( 'ColorSensor' ) )
            // InternalLegoLang.g:2044:1: ( 'ColorSensor' )
            {
            // InternalLegoLang.g:2044:1: ( 'ColorSensor' )
            // InternalLegoLang.g:2045:2: 'ColorSensor'
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
    // InternalLegoLang.g:2054:1: rule__ColorSensor__Group__1 : rule__ColorSensor__Group__1__Impl rule__ColorSensor__Group__2 ;
    public final void rule__ColorSensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2058:1: ( rule__ColorSensor__Group__1__Impl rule__ColorSensor__Group__2 )
            // InternalLegoLang.g:2059:2: rule__ColorSensor__Group__1__Impl rule__ColorSensor__Group__2
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
    // InternalLegoLang.g:2066:1: rule__ColorSensor__Group__1__Impl : ( ( rule__ColorSensor__NameAssignment_1 ) ) ;
    public final void rule__ColorSensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2070:1: ( ( ( rule__ColorSensor__NameAssignment_1 ) ) )
            // InternalLegoLang.g:2071:1: ( ( rule__ColorSensor__NameAssignment_1 ) )
            {
            // InternalLegoLang.g:2071:1: ( ( rule__ColorSensor__NameAssignment_1 ) )
            // InternalLegoLang.g:2072:2: ( rule__ColorSensor__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorSensorAccess().getNameAssignment_1()); 
            }
            // InternalLegoLang.g:2073:2: ( rule__ColorSensor__NameAssignment_1 )
            // InternalLegoLang.g:2073:3: rule__ColorSensor__NameAssignment_1
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
    // InternalLegoLang.g:2081:1: rule__ColorSensor__Group__2 : rule__ColorSensor__Group__2__Impl ;
    public final void rule__ColorSensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2085:1: ( rule__ColorSensor__Group__2__Impl )
            // InternalLegoLang.g:2086:2: rule__ColorSensor__Group__2__Impl
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
    // InternalLegoLang.g:2092:1: rule__ColorSensor__Group__2__Impl : ( ( rule__ColorSensor__PositionAssignment_2 ) ) ;
    public final void rule__ColorSensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2096:1: ( ( ( rule__ColorSensor__PositionAssignment_2 ) ) )
            // InternalLegoLang.g:2097:1: ( ( rule__ColorSensor__PositionAssignment_2 ) )
            {
            // InternalLegoLang.g:2097:1: ( ( rule__ColorSensor__PositionAssignment_2 ) )
            // InternalLegoLang.g:2098:2: ( rule__ColorSensor__PositionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorSensorAccess().getPositionAssignment_2()); 
            }
            // InternalLegoLang.g:2099:2: ( rule__ColorSensor__PositionAssignment_2 )
            // InternalLegoLang.g:2099:3: rule__ColorSensor__PositionAssignment_2
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
    // InternalLegoLang.g:2108:1: rule__LaserSensor__Group__0 : rule__LaserSensor__Group__0__Impl rule__LaserSensor__Group__1 ;
    public final void rule__LaserSensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2112:1: ( rule__LaserSensor__Group__0__Impl rule__LaserSensor__Group__1 )
            // InternalLegoLang.g:2113:2: rule__LaserSensor__Group__0__Impl rule__LaserSensor__Group__1
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
    // InternalLegoLang.g:2120:1: rule__LaserSensor__Group__0__Impl : ( 'LaserSensor' ) ;
    public final void rule__LaserSensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2124:1: ( ( 'LaserSensor' ) )
            // InternalLegoLang.g:2125:1: ( 'LaserSensor' )
            {
            // InternalLegoLang.g:2125:1: ( 'LaserSensor' )
            // InternalLegoLang.g:2126:2: 'LaserSensor'
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
    // InternalLegoLang.g:2135:1: rule__LaserSensor__Group__1 : rule__LaserSensor__Group__1__Impl rule__LaserSensor__Group__2 ;
    public final void rule__LaserSensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2139:1: ( rule__LaserSensor__Group__1__Impl rule__LaserSensor__Group__2 )
            // InternalLegoLang.g:2140:2: rule__LaserSensor__Group__1__Impl rule__LaserSensor__Group__2
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
    // InternalLegoLang.g:2147:1: rule__LaserSensor__Group__1__Impl : ( ( rule__LaserSensor__NameAssignment_1 ) ) ;
    public final void rule__LaserSensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2151:1: ( ( ( rule__LaserSensor__NameAssignment_1 ) ) )
            // InternalLegoLang.g:2152:1: ( ( rule__LaserSensor__NameAssignment_1 ) )
            {
            // InternalLegoLang.g:2152:1: ( ( rule__LaserSensor__NameAssignment_1 ) )
            // InternalLegoLang.g:2153:2: ( rule__LaserSensor__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLaserSensorAccess().getNameAssignment_1()); 
            }
            // InternalLegoLang.g:2154:2: ( rule__LaserSensor__NameAssignment_1 )
            // InternalLegoLang.g:2154:3: rule__LaserSensor__NameAssignment_1
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
    // InternalLegoLang.g:2162:1: rule__LaserSensor__Group__2 : rule__LaserSensor__Group__2__Impl ;
    public final void rule__LaserSensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2166:1: ( rule__LaserSensor__Group__2__Impl )
            // InternalLegoLang.g:2167:2: rule__LaserSensor__Group__2__Impl
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
    // InternalLegoLang.g:2173:1: rule__LaserSensor__Group__2__Impl : ( ( rule__LaserSensor__PositionAssignment_2 ) ) ;
    public final void rule__LaserSensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2177:1: ( ( ( rule__LaserSensor__PositionAssignment_2 ) ) )
            // InternalLegoLang.g:2178:1: ( ( rule__LaserSensor__PositionAssignment_2 ) )
            {
            // InternalLegoLang.g:2178:1: ( ( rule__LaserSensor__PositionAssignment_2 ) )
            // InternalLegoLang.g:2179:2: ( rule__LaserSensor__PositionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLaserSensorAccess().getPositionAssignment_2()); 
            }
            // InternalLegoLang.g:2180:2: ( rule__LaserSensor__PositionAssignment_2 )
            // InternalLegoLang.g:2180:3: rule__LaserSensor__PositionAssignment_2
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
    // InternalLegoLang.g:2189:1: rule__GPSSensor__Group__0 : rule__GPSSensor__Group__0__Impl rule__GPSSensor__Group__1 ;
    public final void rule__GPSSensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2193:1: ( rule__GPSSensor__Group__0__Impl rule__GPSSensor__Group__1 )
            // InternalLegoLang.g:2194:2: rule__GPSSensor__Group__0__Impl rule__GPSSensor__Group__1
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
    // InternalLegoLang.g:2201:1: rule__GPSSensor__Group__0__Impl : ( 'GPSSensor' ) ;
    public final void rule__GPSSensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2205:1: ( ( 'GPSSensor' ) )
            // InternalLegoLang.g:2206:1: ( 'GPSSensor' )
            {
            // InternalLegoLang.g:2206:1: ( 'GPSSensor' )
            // InternalLegoLang.g:2207:2: 'GPSSensor'
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
    // InternalLegoLang.g:2216:1: rule__GPSSensor__Group__1 : rule__GPSSensor__Group__1__Impl rule__GPSSensor__Group__2 ;
    public final void rule__GPSSensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2220:1: ( rule__GPSSensor__Group__1__Impl rule__GPSSensor__Group__2 )
            // InternalLegoLang.g:2221:2: rule__GPSSensor__Group__1__Impl rule__GPSSensor__Group__2
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
    // InternalLegoLang.g:2228:1: rule__GPSSensor__Group__1__Impl : ( ( rule__GPSSensor__NameAssignment_1 ) ) ;
    public final void rule__GPSSensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2232:1: ( ( ( rule__GPSSensor__NameAssignment_1 ) ) )
            // InternalLegoLang.g:2233:1: ( ( rule__GPSSensor__NameAssignment_1 ) )
            {
            // InternalLegoLang.g:2233:1: ( ( rule__GPSSensor__NameAssignment_1 ) )
            // InternalLegoLang.g:2234:2: ( rule__GPSSensor__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGPSSensorAccess().getNameAssignment_1()); 
            }
            // InternalLegoLang.g:2235:2: ( rule__GPSSensor__NameAssignment_1 )
            // InternalLegoLang.g:2235:3: rule__GPSSensor__NameAssignment_1
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
    // InternalLegoLang.g:2243:1: rule__GPSSensor__Group__2 : rule__GPSSensor__Group__2__Impl ;
    public final void rule__GPSSensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2247:1: ( rule__GPSSensor__Group__2__Impl )
            // InternalLegoLang.g:2248:2: rule__GPSSensor__Group__2__Impl
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
    // InternalLegoLang.g:2254:1: rule__GPSSensor__Group__2__Impl : ( ( rule__GPSSensor__PositionAssignment_2 ) ) ;
    public final void rule__GPSSensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2258:1: ( ( ( rule__GPSSensor__PositionAssignment_2 ) ) )
            // InternalLegoLang.g:2259:1: ( ( rule__GPSSensor__PositionAssignment_2 ) )
            {
            // InternalLegoLang.g:2259:1: ( ( rule__GPSSensor__PositionAssignment_2 ) )
            // InternalLegoLang.g:2260:2: ( rule__GPSSensor__PositionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGPSSensorAccess().getPositionAssignment_2()); 
            }
            // InternalLegoLang.g:2261:2: ( rule__GPSSensor__PositionAssignment_2 )
            // InternalLegoLang.g:2261:3: rule__GPSSensor__PositionAssignment_2
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
    // InternalLegoLang.g:2270:1: rule__GyroSensor__Group__0 : rule__GyroSensor__Group__0__Impl rule__GyroSensor__Group__1 ;
    public final void rule__GyroSensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2274:1: ( rule__GyroSensor__Group__0__Impl rule__GyroSensor__Group__1 )
            // InternalLegoLang.g:2275:2: rule__GyroSensor__Group__0__Impl rule__GyroSensor__Group__1
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
    // InternalLegoLang.g:2282:1: rule__GyroSensor__Group__0__Impl : ( 'GyroSensor' ) ;
    public final void rule__GyroSensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2286:1: ( ( 'GyroSensor' ) )
            // InternalLegoLang.g:2287:1: ( 'GyroSensor' )
            {
            // InternalLegoLang.g:2287:1: ( 'GyroSensor' )
            // InternalLegoLang.g:2288:2: 'GyroSensor'
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
    // InternalLegoLang.g:2297:1: rule__GyroSensor__Group__1 : rule__GyroSensor__Group__1__Impl rule__GyroSensor__Group__2 ;
    public final void rule__GyroSensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2301:1: ( rule__GyroSensor__Group__1__Impl rule__GyroSensor__Group__2 )
            // InternalLegoLang.g:2302:2: rule__GyroSensor__Group__1__Impl rule__GyroSensor__Group__2
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
    // InternalLegoLang.g:2309:1: rule__GyroSensor__Group__1__Impl : ( ( rule__GyroSensor__NameAssignment_1 ) ) ;
    public final void rule__GyroSensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2313:1: ( ( ( rule__GyroSensor__NameAssignment_1 ) ) )
            // InternalLegoLang.g:2314:1: ( ( rule__GyroSensor__NameAssignment_1 ) )
            {
            // InternalLegoLang.g:2314:1: ( ( rule__GyroSensor__NameAssignment_1 ) )
            // InternalLegoLang.g:2315:2: ( rule__GyroSensor__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGyroSensorAccess().getNameAssignment_1()); 
            }
            // InternalLegoLang.g:2316:2: ( rule__GyroSensor__NameAssignment_1 )
            // InternalLegoLang.g:2316:3: rule__GyroSensor__NameAssignment_1
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
    // InternalLegoLang.g:2324:1: rule__GyroSensor__Group__2 : rule__GyroSensor__Group__2__Impl ;
    public final void rule__GyroSensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2328:1: ( rule__GyroSensor__Group__2__Impl )
            // InternalLegoLang.g:2329:2: rule__GyroSensor__Group__2__Impl
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
    // InternalLegoLang.g:2335:1: rule__GyroSensor__Group__2__Impl : ( ( rule__GyroSensor__PositionAssignment_2 ) ) ;
    public final void rule__GyroSensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2339:1: ( ( ( rule__GyroSensor__PositionAssignment_2 ) ) )
            // InternalLegoLang.g:2340:1: ( ( rule__GyroSensor__PositionAssignment_2 ) )
            {
            // InternalLegoLang.g:2340:1: ( ( rule__GyroSensor__PositionAssignment_2 ) )
            // InternalLegoLang.g:2341:2: ( rule__GyroSensor__PositionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGyroSensorAccess().getPositionAssignment_2()); 
            }
            // InternalLegoLang.g:2342:2: ( rule__GyroSensor__PositionAssignment_2 )
            // InternalLegoLang.g:2342:3: rule__GyroSensor__PositionAssignment_2
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
    // InternalLegoLang.g:2351:1: rule__UltraSonicSensor__Group__0 : rule__UltraSonicSensor__Group__0__Impl rule__UltraSonicSensor__Group__1 ;
    public final void rule__UltraSonicSensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2355:1: ( rule__UltraSonicSensor__Group__0__Impl rule__UltraSonicSensor__Group__1 )
            // InternalLegoLang.g:2356:2: rule__UltraSonicSensor__Group__0__Impl rule__UltraSonicSensor__Group__1
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
    // InternalLegoLang.g:2363:1: rule__UltraSonicSensor__Group__0__Impl : ( 'UltraSonicSensor' ) ;
    public final void rule__UltraSonicSensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2367:1: ( ( 'UltraSonicSensor' ) )
            // InternalLegoLang.g:2368:1: ( 'UltraSonicSensor' )
            {
            // InternalLegoLang.g:2368:1: ( 'UltraSonicSensor' )
            // InternalLegoLang.g:2369:2: 'UltraSonicSensor'
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
    // InternalLegoLang.g:2378:1: rule__UltraSonicSensor__Group__1 : rule__UltraSonicSensor__Group__1__Impl rule__UltraSonicSensor__Group__2 ;
    public final void rule__UltraSonicSensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2382:1: ( rule__UltraSonicSensor__Group__1__Impl rule__UltraSonicSensor__Group__2 )
            // InternalLegoLang.g:2383:2: rule__UltraSonicSensor__Group__1__Impl rule__UltraSonicSensor__Group__2
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
    // InternalLegoLang.g:2390:1: rule__UltraSonicSensor__Group__1__Impl : ( ( rule__UltraSonicSensor__NameAssignment_1 ) ) ;
    public final void rule__UltraSonicSensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2394:1: ( ( ( rule__UltraSonicSensor__NameAssignment_1 ) ) )
            // InternalLegoLang.g:2395:1: ( ( rule__UltraSonicSensor__NameAssignment_1 ) )
            {
            // InternalLegoLang.g:2395:1: ( ( rule__UltraSonicSensor__NameAssignment_1 ) )
            // InternalLegoLang.g:2396:2: ( rule__UltraSonicSensor__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUltraSonicSensorAccess().getNameAssignment_1()); 
            }
            // InternalLegoLang.g:2397:2: ( rule__UltraSonicSensor__NameAssignment_1 )
            // InternalLegoLang.g:2397:3: rule__UltraSonicSensor__NameAssignment_1
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
    // InternalLegoLang.g:2405:1: rule__UltraSonicSensor__Group__2 : rule__UltraSonicSensor__Group__2__Impl ;
    public final void rule__UltraSonicSensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2409:1: ( rule__UltraSonicSensor__Group__2__Impl )
            // InternalLegoLang.g:2410:2: rule__UltraSonicSensor__Group__2__Impl
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
    // InternalLegoLang.g:2416:1: rule__UltraSonicSensor__Group__2__Impl : ( ( rule__UltraSonicSensor__PositionAssignment_2 ) ) ;
    public final void rule__UltraSonicSensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2420:1: ( ( ( rule__UltraSonicSensor__PositionAssignment_2 ) ) )
            // InternalLegoLang.g:2421:1: ( ( rule__UltraSonicSensor__PositionAssignment_2 ) )
            {
            // InternalLegoLang.g:2421:1: ( ( rule__UltraSonicSensor__PositionAssignment_2 ) )
            // InternalLegoLang.g:2422:2: ( rule__UltraSonicSensor__PositionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUltraSonicSensorAccess().getPositionAssignment_2()); 
            }
            // InternalLegoLang.g:2423:2: ( rule__UltraSonicSensor__PositionAssignment_2 )
            // InternalLegoLang.g:2423:3: rule__UltraSonicSensor__PositionAssignment_2
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
    // InternalLegoLang.g:2432:1: rule__Car__Group__0 : rule__Car__Group__0__Impl rule__Car__Group__1 ;
    public final void rule__Car__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2436:1: ( rule__Car__Group__0__Impl rule__Car__Group__1 )
            // InternalLegoLang.g:2437:2: rule__Car__Group__0__Impl rule__Car__Group__1
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
    // InternalLegoLang.g:2444:1: rule__Car__Group__0__Impl : ( 'Car' ) ;
    public final void rule__Car__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2448:1: ( ( 'Car' ) )
            // InternalLegoLang.g:2449:1: ( 'Car' )
            {
            // InternalLegoLang.g:2449:1: ( 'Car' )
            // InternalLegoLang.g:2450:2: 'Car'
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
    // InternalLegoLang.g:2459:1: rule__Car__Group__1 : rule__Car__Group__1__Impl rule__Car__Group__2 ;
    public final void rule__Car__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2463:1: ( rule__Car__Group__1__Impl rule__Car__Group__2 )
            // InternalLegoLang.g:2464:2: rule__Car__Group__1__Impl rule__Car__Group__2
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
    // InternalLegoLang.g:2471:1: rule__Car__Group__1__Impl : ( ( rule__Car__NameAssignment_1 ) ) ;
    public final void rule__Car__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2475:1: ( ( ( rule__Car__NameAssignment_1 ) ) )
            // InternalLegoLang.g:2476:1: ( ( rule__Car__NameAssignment_1 ) )
            {
            // InternalLegoLang.g:2476:1: ( ( rule__Car__NameAssignment_1 ) )
            // InternalLegoLang.g:2477:2: ( rule__Car__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCarAccess().getNameAssignment_1()); 
            }
            // InternalLegoLang.g:2478:2: ( rule__Car__NameAssignment_1 )
            // InternalLegoLang.g:2478:3: rule__Car__NameAssignment_1
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
    // InternalLegoLang.g:2486:1: rule__Car__Group__2 : rule__Car__Group__2__Impl rule__Car__Group__3 ;
    public final void rule__Car__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2490:1: ( rule__Car__Group__2__Impl rule__Car__Group__3 )
            // InternalLegoLang.g:2491:2: rule__Car__Group__2__Impl rule__Car__Group__3
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
    // InternalLegoLang.g:2498:1: rule__Car__Group__2__Impl : ( '{' ) ;
    public final void rule__Car__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2502:1: ( ( '{' ) )
            // InternalLegoLang.g:2503:1: ( '{' )
            {
            // InternalLegoLang.g:2503:1: ( '{' )
            // InternalLegoLang.g:2504:2: '{'
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
    // InternalLegoLang.g:2513:1: rule__Car__Group__3 : rule__Car__Group__3__Impl rule__Car__Group__4 ;
    public final void rule__Car__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2517:1: ( rule__Car__Group__3__Impl rule__Car__Group__4 )
            // InternalLegoLang.g:2518:2: rule__Car__Group__3__Impl rule__Car__Group__4
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
    // InternalLegoLang.g:2525:1: rule__Car__Group__3__Impl : ( ( rule__Car__SensorAssignment_3 )* ) ;
    public final void rule__Car__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2529:1: ( ( ( rule__Car__SensorAssignment_3 )* ) )
            // InternalLegoLang.g:2530:1: ( ( rule__Car__SensorAssignment_3 )* )
            {
            // InternalLegoLang.g:2530:1: ( ( rule__Car__SensorAssignment_3 )* )
            // InternalLegoLang.g:2531:2: ( rule__Car__SensorAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCarAccess().getSensorAssignment_3()); 
            }
            // InternalLegoLang.g:2532:2: ( rule__Car__SensorAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=17 && LA11_0<=21)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalLegoLang.g:2532:3: rule__Car__SensorAssignment_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Car__SensorAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalLegoLang.g:2540:1: rule__Car__Group__4 : rule__Car__Group__4__Impl rule__Car__Group__5 ;
    public final void rule__Car__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2544:1: ( rule__Car__Group__4__Impl rule__Car__Group__5 )
            // InternalLegoLang.g:2545:2: rule__Car__Group__4__Impl rule__Car__Group__5
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
    // InternalLegoLang.g:2552:1: rule__Car__Group__4__Impl : ( ( rule__Car__EngineAssignment_4 )* ) ;
    public final void rule__Car__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2556:1: ( ( ( rule__Car__EngineAssignment_4 )* ) )
            // InternalLegoLang.g:2557:1: ( ( rule__Car__EngineAssignment_4 )* )
            {
            // InternalLegoLang.g:2557:1: ( ( rule__Car__EngineAssignment_4 )* )
            // InternalLegoLang.g:2558:2: ( rule__Car__EngineAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCarAccess().getEngineAssignment_4()); 
            }
            // InternalLegoLang.g:2559:2: ( rule__Car__EngineAssignment_4 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==16) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalLegoLang.g:2559:3: rule__Car__EngineAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Car__EngineAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalLegoLang.g:2567:1: rule__Car__Group__5 : rule__Car__Group__5__Impl ;
    public final void rule__Car__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2571:1: ( rule__Car__Group__5__Impl )
            // InternalLegoLang.g:2572:2: rule__Car__Group__5__Impl
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
    // InternalLegoLang.g:2578:1: rule__Car__Group__5__Impl : ( '}' ) ;
    public final void rule__Car__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2582:1: ( ( '}' ) )
            // InternalLegoLang.g:2583:1: ( '}' )
            {
            // InternalLegoLang.g:2583:1: ( '}' )
            // InternalLegoLang.g:2584:2: '}'
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
    // InternalLegoLang.g:2594:1: rule__VitesseOperation__Group__0 : rule__VitesseOperation__Group__0__Impl rule__VitesseOperation__Group__1 ;
    public final void rule__VitesseOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2598:1: ( rule__VitesseOperation__Group__0__Impl rule__VitesseOperation__Group__1 )
            // InternalLegoLang.g:2599:2: rule__VitesseOperation__Group__0__Impl rule__VitesseOperation__Group__1
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
    // InternalLegoLang.g:2606:1: rule__VitesseOperation__Group__0__Impl : ( ( rule__VitesseOperation__WheelengineAssignment_0 ) ) ;
    public final void rule__VitesseOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2610:1: ( ( ( rule__VitesseOperation__WheelengineAssignment_0 ) ) )
            // InternalLegoLang.g:2611:1: ( ( rule__VitesseOperation__WheelengineAssignment_0 ) )
            {
            // InternalLegoLang.g:2611:1: ( ( rule__VitesseOperation__WheelengineAssignment_0 ) )
            // InternalLegoLang.g:2612:2: ( rule__VitesseOperation__WheelengineAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVitesseOperationAccess().getWheelengineAssignment_0()); 
            }
            // InternalLegoLang.g:2613:2: ( rule__VitesseOperation__WheelengineAssignment_0 )
            // InternalLegoLang.g:2613:3: rule__VitesseOperation__WheelengineAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__VitesseOperation__WheelengineAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVitesseOperationAccess().getWheelengineAssignment_0()); 
            }

            }


            }

        }
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
    // InternalLegoLang.g:2621:1: rule__VitesseOperation__Group__1 : rule__VitesseOperation__Group__1__Impl rule__VitesseOperation__Group__2 ;
    public final void rule__VitesseOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2625:1: ( rule__VitesseOperation__Group__1__Impl rule__VitesseOperation__Group__2 )
            // InternalLegoLang.g:2626:2: rule__VitesseOperation__Group__1__Impl rule__VitesseOperation__Group__2
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
    // InternalLegoLang.g:2633:1: rule__VitesseOperation__Group__1__Impl : ( ':' ) ;
    public final void rule__VitesseOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2637:1: ( ( ':' ) )
            // InternalLegoLang.g:2638:1: ( ':' )
            {
            // InternalLegoLang.g:2638:1: ( ':' )
            // InternalLegoLang.g:2639:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVitesseOperationAccess().getColonKeyword_1()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVitesseOperationAccess().getColonKeyword_1()); 
            }

            }


            }

        }
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
    // InternalLegoLang.g:2648:1: rule__VitesseOperation__Group__2 : rule__VitesseOperation__Group__2__Impl rule__VitesseOperation__Group__3 ;
    public final void rule__VitesseOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2652:1: ( rule__VitesseOperation__Group__2__Impl rule__VitesseOperation__Group__3 )
            // InternalLegoLang.g:2653:2: rule__VitesseOperation__Group__2__Impl rule__VitesseOperation__Group__3
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
    // InternalLegoLang.g:2660:1: rule__VitesseOperation__Group__2__Impl : ( 'vitesse' ) ;
    public final void rule__VitesseOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2664:1: ( ( 'vitesse' ) )
            // InternalLegoLang.g:2665:1: ( 'vitesse' )
            {
            // InternalLegoLang.g:2665:1: ( 'vitesse' )
            // InternalLegoLang.g:2666:2: 'vitesse'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVitesseOperationAccess().getVitesseKeyword_2()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVitesseOperationAccess().getVitesseKeyword_2()); 
            }

            }


            }

        }
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
    // InternalLegoLang.g:2675:1: rule__VitesseOperation__Group__3 : rule__VitesseOperation__Group__3__Impl rule__VitesseOperation__Group__4 ;
    public final void rule__VitesseOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2679:1: ( rule__VitesseOperation__Group__3__Impl rule__VitesseOperation__Group__4 )
            // InternalLegoLang.g:2680:2: rule__VitesseOperation__Group__3__Impl rule__VitesseOperation__Group__4
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
    // InternalLegoLang.g:2687:1: rule__VitesseOperation__Group__3__Impl : ( '=' ) ;
    public final void rule__VitesseOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2691:1: ( ( '=' ) )
            // InternalLegoLang.g:2692:1: ( '=' )
            {
            // InternalLegoLang.g:2692:1: ( '=' )
            // InternalLegoLang.g:2693:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVitesseOperationAccess().getEqualsSignKeyword_3()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVitesseOperationAccess().getEqualsSignKeyword_3()); 
            }

            }


            }

        }
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
    // InternalLegoLang.g:2702:1: rule__VitesseOperation__Group__4 : rule__VitesseOperation__Group__4__Impl ;
    public final void rule__VitesseOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2706:1: ( rule__VitesseOperation__Group__4__Impl )
            // InternalLegoLang.g:2707:2: rule__VitesseOperation__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VitesseOperation__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalLegoLang.g:2713:1: rule__VitesseOperation__Group__4__Impl : ( ( rule__VitesseOperation__RightAssignment_4 ) ) ;
    public final void rule__VitesseOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2717:1: ( ( ( rule__VitesseOperation__RightAssignment_4 ) ) )
            // InternalLegoLang.g:2718:1: ( ( rule__VitesseOperation__RightAssignment_4 ) )
            {
            // InternalLegoLang.g:2718:1: ( ( rule__VitesseOperation__RightAssignment_4 ) )
            // InternalLegoLang.g:2719:2: ( rule__VitesseOperation__RightAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVitesseOperationAccess().getRightAssignment_4()); 
            }
            // InternalLegoLang.g:2720:2: ( rule__VitesseOperation__RightAssignment_4 )
            // InternalLegoLang.g:2720:3: rule__VitesseOperation__RightAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__VitesseOperation__RightAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVitesseOperationAccess().getRightAssignment_4()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__ColorOperation__Group__0"
    // InternalLegoLang.g:2729:1: rule__ColorOperation__Group__0 : rule__ColorOperation__Group__0__Impl rule__ColorOperation__Group__1 ;
    public final void rule__ColorOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2733:1: ( rule__ColorOperation__Group__0__Impl rule__ColorOperation__Group__1 )
            // InternalLegoLang.g:2734:2: rule__ColorOperation__Group__0__Impl rule__ColorOperation__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalLegoLang.g:2741:1: rule__ColorOperation__Group__0__Impl : ( 'get' ) ;
    public final void rule__ColorOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2745:1: ( ( 'get' ) )
            // InternalLegoLang.g:2746:1: ( 'get' )
            {
            // InternalLegoLang.g:2746:1: ( 'get' )
            // InternalLegoLang.g:2747:2: 'get'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorOperationAccess().getGetKeyword_0()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:2756:1: rule__ColorOperation__Group__1 : rule__ColorOperation__Group__1__Impl rule__ColorOperation__Group__2 ;
    public final void rule__ColorOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2760:1: ( rule__ColorOperation__Group__1__Impl rule__ColorOperation__Group__2 )
            // InternalLegoLang.g:2761:2: rule__ColorOperation__Group__1__Impl rule__ColorOperation__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalLegoLang.g:2768:1: rule__ColorOperation__Group__1__Impl : ( 'color' ) ;
    public final void rule__ColorOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2772:1: ( ( 'color' ) )
            // InternalLegoLang.g:2773:1: ( 'color' )
            {
            // InternalLegoLang.g:2773:1: ( 'color' )
            // InternalLegoLang.g:2774:2: 'color'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorOperationAccess().getColorKeyword_1()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:2783:1: rule__ColorOperation__Group__2 : rule__ColorOperation__Group__2__Impl rule__ColorOperation__Group__3 ;
    public final void rule__ColorOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2787:1: ( rule__ColorOperation__Group__2__Impl rule__ColorOperation__Group__3 )
            // InternalLegoLang.g:2788:2: rule__ColorOperation__Group__2__Impl rule__ColorOperation__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalLegoLang.g:2795:1: rule__ColorOperation__Group__2__Impl : ( '(' ) ;
    public final void rule__ColorOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2799:1: ( ( '(' ) )
            // InternalLegoLang.g:2800:1: ( '(' )
            {
            // InternalLegoLang.g:2800:1: ( '(' )
            // InternalLegoLang.g:2801:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorOperationAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:2810:1: rule__ColorOperation__Group__3 : rule__ColorOperation__Group__3__Impl rule__ColorOperation__Group__4 ;
    public final void rule__ColorOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2814:1: ( rule__ColorOperation__Group__3__Impl rule__ColorOperation__Group__4 )
            // InternalLegoLang.g:2815:2: rule__ColorOperation__Group__3__Impl rule__ColorOperation__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalLegoLang.g:2822:1: rule__ColorOperation__Group__3__Impl : ( ( rule__ColorOperation__ColorsensorAssignment_3 ) ) ;
    public final void rule__ColorOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2826:1: ( ( ( rule__ColorOperation__ColorsensorAssignment_3 ) ) )
            // InternalLegoLang.g:2827:1: ( ( rule__ColorOperation__ColorsensorAssignment_3 ) )
            {
            // InternalLegoLang.g:2827:1: ( ( rule__ColorOperation__ColorsensorAssignment_3 ) )
            // InternalLegoLang.g:2828:2: ( rule__ColorOperation__ColorsensorAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorOperationAccess().getColorsensorAssignment_3()); 
            }
            // InternalLegoLang.g:2829:2: ( rule__ColorOperation__ColorsensorAssignment_3 )
            // InternalLegoLang.g:2829:3: rule__ColorOperation__ColorsensorAssignment_3
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
    // InternalLegoLang.g:2837:1: rule__ColorOperation__Group__4 : rule__ColorOperation__Group__4__Impl ;
    public final void rule__ColorOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2841:1: ( rule__ColorOperation__Group__4__Impl )
            // InternalLegoLang.g:2842:2: rule__ColorOperation__Group__4__Impl
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
    // InternalLegoLang.g:2848:1: rule__ColorOperation__Group__4__Impl : ( ')' ) ;
    public final void rule__ColorOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2852:1: ( ( ')' ) )
            // InternalLegoLang.g:2853:1: ( ')' )
            {
            // InternalLegoLang.g:2853:1: ( ')' )
            // InternalLegoLang.g:2854:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorOperationAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:2864:1: rule__IntensityOperation__Group__0 : rule__IntensityOperation__Group__0__Impl rule__IntensityOperation__Group__1 ;
    public final void rule__IntensityOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2868:1: ( rule__IntensityOperation__Group__0__Impl rule__IntensityOperation__Group__1 )
            // InternalLegoLang.g:2869:2: rule__IntensityOperation__Group__0__Impl rule__IntensityOperation__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalLegoLang.g:2876:1: rule__IntensityOperation__Group__0__Impl : ( 'get' ) ;
    public final void rule__IntensityOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2880:1: ( ( 'get' ) )
            // InternalLegoLang.g:2881:1: ( 'get' )
            {
            // InternalLegoLang.g:2881:1: ( 'get' )
            // InternalLegoLang.g:2882:2: 'get'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntensityOperationAccess().getGetKeyword_0()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:2891:1: rule__IntensityOperation__Group__1 : rule__IntensityOperation__Group__1__Impl rule__IntensityOperation__Group__2 ;
    public final void rule__IntensityOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2895:1: ( rule__IntensityOperation__Group__1__Impl rule__IntensityOperation__Group__2 )
            // InternalLegoLang.g:2896:2: rule__IntensityOperation__Group__1__Impl rule__IntensityOperation__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalLegoLang.g:2903:1: rule__IntensityOperation__Group__1__Impl : ( 'intensity' ) ;
    public final void rule__IntensityOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2907:1: ( ( 'intensity' ) )
            // InternalLegoLang.g:2908:1: ( 'intensity' )
            {
            // InternalLegoLang.g:2908:1: ( 'intensity' )
            // InternalLegoLang.g:2909:2: 'intensity'
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
    // InternalLegoLang.g:2918:1: rule__IntensityOperation__Group__2 : rule__IntensityOperation__Group__2__Impl rule__IntensityOperation__Group__3 ;
    public final void rule__IntensityOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2922:1: ( rule__IntensityOperation__Group__2__Impl rule__IntensityOperation__Group__3 )
            // InternalLegoLang.g:2923:2: rule__IntensityOperation__Group__2__Impl rule__IntensityOperation__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalLegoLang.g:2930:1: rule__IntensityOperation__Group__2__Impl : ( '(' ) ;
    public final void rule__IntensityOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2934:1: ( ( '(' ) )
            // InternalLegoLang.g:2935:1: ( '(' )
            {
            // InternalLegoLang.g:2935:1: ( '(' )
            // InternalLegoLang.g:2936:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntensityOperationAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:2945:1: rule__IntensityOperation__Group__3 : rule__IntensityOperation__Group__3__Impl rule__IntensityOperation__Group__4 ;
    public final void rule__IntensityOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2949:1: ( rule__IntensityOperation__Group__3__Impl rule__IntensityOperation__Group__4 )
            // InternalLegoLang.g:2950:2: rule__IntensityOperation__Group__3__Impl rule__IntensityOperation__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalLegoLang.g:2957:1: rule__IntensityOperation__Group__3__Impl : ( ( rule__IntensityOperation__ColorsensorAssignment_3 ) ) ;
    public final void rule__IntensityOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2961:1: ( ( ( rule__IntensityOperation__ColorsensorAssignment_3 ) ) )
            // InternalLegoLang.g:2962:1: ( ( rule__IntensityOperation__ColorsensorAssignment_3 ) )
            {
            // InternalLegoLang.g:2962:1: ( ( rule__IntensityOperation__ColorsensorAssignment_3 ) )
            // InternalLegoLang.g:2963:2: ( rule__IntensityOperation__ColorsensorAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntensityOperationAccess().getColorsensorAssignment_3()); 
            }
            // InternalLegoLang.g:2964:2: ( rule__IntensityOperation__ColorsensorAssignment_3 )
            // InternalLegoLang.g:2964:3: rule__IntensityOperation__ColorsensorAssignment_3
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
    // InternalLegoLang.g:2972:1: rule__IntensityOperation__Group__4 : rule__IntensityOperation__Group__4__Impl ;
    public final void rule__IntensityOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2976:1: ( rule__IntensityOperation__Group__4__Impl )
            // InternalLegoLang.g:2977:2: rule__IntensityOperation__Group__4__Impl
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
    // InternalLegoLang.g:2983:1: rule__IntensityOperation__Group__4__Impl : ( ')' ) ;
    public final void rule__IntensityOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:2987:1: ( ( ')' ) )
            // InternalLegoLang.g:2988:1: ( ')' )
            {
            // InternalLegoLang.g:2988:1: ( ')' )
            // InternalLegoLang.g:2989:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntensityOperationAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:2999:1: rule__RangeOperation__Group__0 : rule__RangeOperation__Group__0__Impl rule__RangeOperation__Group__1 ;
    public final void rule__RangeOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3003:1: ( rule__RangeOperation__Group__0__Impl rule__RangeOperation__Group__1 )
            // InternalLegoLang.g:3004:2: rule__RangeOperation__Group__0__Impl rule__RangeOperation__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalLegoLang.g:3011:1: rule__RangeOperation__Group__0__Impl : ( 'get' ) ;
    public final void rule__RangeOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3015:1: ( ( 'get' ) )
            // InternalLegoLang.g:3016:1: ( 'get' )
            {
            // InternalLegoLang.g:3016:1: ( 'get' )
            // InternalLegoLang.g:3017:2: 'get'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeOperationAccess().getGetKeyword_0()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:3026:1: rule__RangeOperation__Group__1 : rule__RangeOperation__Group__1__Impl rule__RangeOperation__Group__2 ;
    public final void rule__RangeOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3030:1: ( rule__RangeOperation__Group__1__Impl rule__RangeOperation__Group__2 )
            // InternalLegoLang.g:3031:2: rule__RangeOperation__Group__1__Impl rule__RangeOperation__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalLegoLang.g:3038:1: rule__RangeOperation__Group__1__Impl : ( 'range' ) ;
    public final void rule__RangeOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3042:1: ( ( 'range' ) )
            // InternalLegoLang.g:3043:1: ( 'range' )
            {
            // InternalLegoLang.g:3043:1: ( 'range' )
            // InternalLegoLang.g:3044:2: 'range'
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
    // InternalLegoLang.g:3053:1: rule__RangeOperation__Group__2 : rule__RangeOperation__Group__2__Impl rule__RangeOperation__Group__3 ;
    public final void rule__RangeOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3057:1: ( rule__RangeOperation__Group__2__Impl rule__RangeOperation__Group__3 )
            // InternalLegoLang.g:3058:2: rule__RangeOperation__Group__2__Impl rule__RangeOperation__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalLegoLang.g:3065:1: rule__RangeOperation__Group__2__Impl : ( '(' ) ;
    public final void rule__RangeOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3069:1: ( ( '(' ) )
            // InternalLegoLang.g:3070:1: ( '(' )
            {
            // InternalLegoLang.g:3070:1: ( '(' )
            // InternalLegoLang.g:3071:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeOperationAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:3080:1: rule__RangeOperation__Group__3 : rule__RangeOperation__Group__3__Impl rule__RangeOperation__Group__4 ;
    public final void rule__RangeOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3084:1: ( rule__RangeOperation__Group__3__Impl rule__RangeOperation__Group__4 )
            // InternalLegoLang.g:3085:2: rule__RangeOperation__Group__3__Impl rule__RangeOperation__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalLegoLang.g:3092:1: rule__RangeOperation__Group__3__Impl : ( ( rule__RangeOperation__LasersensorAssignment_3 ) ) ;
    public final void rule__RangeOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3096:1: ( ( ( rule__RangeOperation__LasersensorAssignment_3 ) ) )
            // InternalLegoLang.g:3097:1: ( ( rule__RangeOperation__LasersensorAssignment_3 ) )
            {
            // InternalLegoLang.g:3097:1: ( ( rule__RangeOperation__LasersensorAssignment_3 ) )
            // InternalLegoLang.g:3098:2: ( rule__RangeOperation__LasersensorAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeOperationAccess().getLasersensorAssignment_3()); 
            }
            // InternalLegoLang.g:3099:2: ( rule__RangeOperation__LasersensorAssignment_3 )
            // InternalLegoLang.g:3099:3: rule__RangeOperation__LasersensorAssignment_3
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
    // InternalLegoLang.g:3107:1: rule__RangeOperation__Group__4 : rule__RangeOperation__Group__4__Impl ;
    public final void rule__RangeOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3111:1: ( rule__RangeOperation__Group__4__Impl )
            // InternalLegoLang.g:3112:2: rule__RangeOperation__Group__4__Impl
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
    // InternalLegoLang.g:3118:1: rule__RangeOperation__Group__4__Impl : ( ')' ) ;
    public final void rule__RangeOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3122:1: ( ( ')' ) )
            // InternalLegoLang.g:3123:1: ( ')' )
            {
            // InternalLegoLang.g:3123:1: ( ')' )
            // InternalLegoLang.g:3124:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeOperationAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:3134:1: rule__XGPSOperation__Group__0 : rule__XGPSOperation__Group__0__Impl rule__XGPSOperation__Group__1 ;
    public final void rule__XGPSOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3138:1: ( rule__XGPSOperation__Group__0__Impl rule__XGPSOperation__Group__1 )
            // InternalLegoLang.g:3139:2: rule__XGPSOperation__Group__0__Impl rule__XGPSOperation__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalLegoLang.g:3146:1: rule__XGPSOperation__Group__0__Impl : ( 'get' ) ;
    public final void rule__XGPSOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3150:1: ( ( 'get' ) )
            // InternalLegoLang.g:3151:1: ( 'get' )
            {
            // InternalLegoLang.g:3151:1: ( 'get' )
            // InternalLegoLang.g:3152:2: 'get'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGPSOperationAccess().getGetKeyword_0()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:3161:1: rule__XGPSOperation__Group__1 : rule__XGPSOperation__Group__1__Impl rule__XGPSOperation__Group__2 ;
    public final void rule__XGPSOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3165:1: ( rule__XGPSOperation__Group__1__Impl rule__XGPSOperation__Group__2 )
            // InternalLegoLang.g:3166:2: rule__XGPSOperation__Group__1__Impl rule__XGPSOperation__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalLegoLang.g:3173:1: rule__XGPSOperation__Group__1__Impl : ( 'x' ) ;
    public final void rule__XGPSOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3177:1: ( ( 'x' ) )
            // InternalLegoLang.g:3178:1: ( 'x' )
            {
            // InternalLegoLang.g:3178:1: ( 'x' )
            // InternalLegoLang.g:3179:2: 'x'
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
    // InternalLegoLang.g:3188:1: rule__XGPSOperation__Group__2 : rule__XGPSOperation__Group__2__Impl rule__XGPSOperation__Group__3 ;
    public final void rule__XGPSOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3192:1: ( rule__XGPSOperation__Group__2__Impl rule__XGPSOperation__Group__3 )
            // InternalLegoLang.g:3193:2: rule__XGPSOperation__Group__2__Impl rule__XGPSOperation__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalLegoLang.g:3200:1: rule__XGPSOperation__Group__2__Impl : ( '(' ) ;
    public final void rule__XGPSOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3204:1: ( ( '(' ) )
            // InternalLegoLang.g:3205:1: ( '(' )
            {
            // InternalLegoLang.g:3205:1: ( '(' )
            // InternalLegoLang.g:3206:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGPSOperationAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:3215:1: rule__XGPSOperation__Group__3 : rule__XGPSOperation__Group__3__Impl rule__XGPSOperation__Group__4 ;
    public final void rule__XGPSOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3219:1: ( rule__XGPSOperation__Group__3__Impl rule__XGPSOperation__Group__4 )
            // InternalLegoLang.g:3220:2: rule__XGPSOperation__Group__3__Impl rule__XGPSOperation__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalLegoLang.g:3227:1: rule__XGPSOperation__Group__3__Impl : ( ( rule__XGPSOperation__GpssensorAssignment_3 ) ) ;
    public final void rule__XGPSOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3231:1: ( ( ( rule__XGPSOperation__GpssensorAssignment_3 ) ) )
            // InternalLegoLang.g:3232:1: ( ( rule__XGPSOperation__GpssensorAssignment_3 ) )
            {
            // InternalLegoLang.g:3232:1: ( ( rule__XGPSOperation__GpssensorAssignment_3 ) )
            // InternalLegoLang.g:3233:2: ( rule__XGPSOperation__GpssensorAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGPSOperationAccess().getGpssensorAssignment_3()); 
            }
            // InternalLegoLang.g:3234:2: ( rule__XGPSOperation__GpssensorAssignment_3 )
            // InternalLegoLang.g:3234:3: rule__XGPSOperation__GpssensorAssignment_3
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
    // InternalLegoLang.g:3242:1: rule__XGPSOperation__Group__4 : rule__XGPSOperation__Group__4__Impl ;
    public final void rule__XGPSOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3246:1: ( rule__XGPSOperation__Group__4__Impl )
            // InternalLegoLang.g:3247:2: rule__XGPSOperation__Group__4__Impl
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
    // InternalLegoLang.g:3253:1: rule__XGPSOperation__Group__4__Impl : ( ')' ) ;
    public final void rule__XGPSOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3257:1: ( ( ')' ) )
            // InternalLegoLang.g:3258:1: ( ')' )
            {
            // InternalLegoLang.g:3258:1: ( ')' )
            // InternalLegoLang.g:3259:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGPSOperationAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:3269:1: rule__YGPSOperation__Group__0 : rule__YGPSOperation__Group__0__Impl rule__YGPSOperation__Group__1 ;
    public final void rule__YGPSOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3273:1: ( rule__YGPSOperation__Group__0__Impl rule__YGPSOperation__Group__1 )
            // InternalLegoLang.g:3274:2: rule__YGPSOperation__Group__0__Impl rule__YGPSOperation__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalLegoLang.g:3281:1: rule__YGPSOperation__Group__0__Impl : ( 'get' ) ;
    public final void rule__YGPSOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3285:1: ( ( 'get' ) )
            // InternalLegoLang.g:3286:1: ( 'get' )
            {
            // InternalLegoLang.g:3286:1: ( 'get' )
            // InternalLegoLang.g:3287:2: 'get'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYGPSOperationAccess().getGetKeyword_0()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:3296:1: rule__YGPSOperation__Group__1 : rule__YGPSOperation__Group__1__Impl rule__YGPSOperation__Group__2 ;
    public final void rule__YGPSOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3300:1: ( rule__YGPSOperation__Group__1__Impl rule__YGPSOperation__Group__2 )
            // InternalLegoLang.g:3301:2: rule__YGPSOperation__Group__1__Impl rule__YGPSOperation__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalLegoLang.g:3308:1: rule__YGPSOperation__Group__1__Impl : ( 'y' ) ;
    public final void rule__YGPSOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3312:1: ( ( 'y' ) )
            // InternalLegoLang.g:3313:1: ( 'y' )
            {
            // InternalLegoLang.g:3313:1: ( 'y' )
            // InternalLegoLang.g:3314:2: 'y'
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
    // InternalLegoLang.g:3323:1: rule__YGPSOperation__Group__2 : rule__YGPSOperation__Group__2__Impl rule__YGPSOperation__Group__3 ;
    public final void rule__YGPSOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3327:1: ( rule__YGPSOperation__Group__2__Impl rule__YGPSOperation__Group__3 )
            // InternalLegoLang.g:3328:2: rule__YGPSOperation__Group__2__Impl rule__YGPSOperation__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalLegoLang.g:3335:1: rule__YGPSOperation__Group__2__Impl : ( '(' ) ;
    public final void rule__YGPSOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3339:1: ( ( '(' ) )
            // InternalLegoLang.g:3340:1: ( '(' )
            {
            // InternalLegoLang.g:3340:1: ( '(' )
            // InternalLegoLang.g:3341:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYGPSOperationAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:3350:1: rule__YGPSOperation__Group__3 : rule__YGPSOperation__Group__3__Impl rule__YGPSOperation__Group__4 ;
    public final void rule__YGPSOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3354:1: ( rule__YGPSOperation__Group__3__Impl rule__YGPSOperation__Group__4 )
            // InternalLegoLang.g:3355:2: rule__YGPSOperation__Group__3__Impl rule__YGPSOperation__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalLegoLang.g:3362:1: rule__YGPSOperation__Group__3__Impl : ( ( rule__YGPSOperation__GpssensorAssignment_3 ) ) ;
    public final void rule__YGPSOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3366:1: ( ( ( rule__YGPSOperation__GpssensorAssignment_3 ) ) )
            // InternalLegoLang.g:3367:1: ( ( rule__YGPSOperation__GpssensorAssignment_3 ) )
            {
            // InternalLegoLang.g:3367:1: ( ( rule__YGPSOperation__GpssensorAssignment_3 ) )
            // InternalLegoLang.g:3368:2: ( rule__YGPSOperation__GpssensorAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYGPSOperationAccess().getGpssensorAssignment_3()); 
            }
            // InternalLegoLang.g:3369:2: ( rule__YGPSOperation__GpssensorAssignment_3 )
            // InternalLegoLang.g:3369:3: rule__YGPSOperation__GpssensorAssignment_3
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
    // InternalLegoLang.g:3377:1: rule__YGPSOperation__Group__4 : rule__YGPSOperation__Group__4__Impl ;
    public final void rule__YGPSOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3381:1: ( rule__YGPSOperation__Group__4__Impl )
            // InternalLegoLang.g:3382:2: rule__YGPSOperation__Group__4__Impl
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
    // InternalLegoLang.g:3388:1: rule__YGPSOperation__Group__4__Impl : ( ')' ) ;
    public final void rule__YGPSOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3392:1: ( ( ')' ) )
            // InternalLegoLang.g:3393:1: ( ')' )
            {
            // InternalLegoLang.g:3393:1: ( ')' )
            // InternalLegoLang.g:3394:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYGPSOperationAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:3404:1: rule__AngleOperation__Group__0 : rule__AngleOperation__Group__0__Impl rule__AngleOperation__Group__1 ;
    public final void rule__AngleOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3408:1: ( rule__AngleOperation__Group__0__Impl rule__AngleOperation__Group__1 )
            // InternalLegoLang.g:3409:2: rule__AngleOperation__Group__0__Impl rule__AngleOperation__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalLegoLang.g:3416:1: rule__AngleOperation__Group__0__Impl : ( 'get' ) ;
    public final void rule__AngleOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3420:1: ( ( 'get' ) )
            // InternalLegoLang.g:3421:1: ( 'get' )
            {
            // InternalLegoLang.g:3421:1: ( 'get' )
            // InternalLegoLang.g:3422:2: 'get'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAngleOperationAccess().getGetKeyword_0()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:3431:1: rule__AngleOperation__Group__1 : rule__AngleOperation__Group__1__Impl rule__AngleOperation__Group__2 ;
    public final void rule__AngleOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3435:1: ( rule__AngleOperation__Group__1__Impl rule__AngleOperation__Group__2 )
            // InternalLegoLang.g:3436:2: rule__AngleOperation__Group__1__Impl rule__AngleOperation__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalLegoLang.g:3443:1: rule__AngleOperation__Group__1__Impl : ( 'angle' ) ;
    public final void rule__AngleOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3447:1: ( ( 'angle' ) )
            // InternalLegoLang.g:3448:1: ( 'angle' )
            {
            // InternalLegoLang.g:3448:1: ( 'angle' )
            // InternalLegoLang.g:3449:2: 'angle'
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
    // InternalLegoLang.g:3458:1: rule__AngleOperation__Group__2 : rule__AngleOperation__Group__2__Impl rule__AngleOperation__Group__3 ;
    public final void rule__AngleOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3462:1: ( rule__AngleOperation__Group__2__Impl rule__AngleOperation__Group__3 )
            // InternalLegoLang.g:3463:2: rule__AngleOperation__Group__2__Impl rule__AngleOperation__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalLegoLang.g:3470:1: rule__AngleOperation__Group__2__Impl : ( '(' ) ;
    public final void rule__AngleOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3474:1: ( ( '(' ) )
            // InternalLegoLang.g:3475:1: ( '(' )
            {
            // InternalLegoLang.g:3475:1: ( '(' )
            // InternalLegoLang.g:3476:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAngleOperationAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:3485:1: rule__AngleOperation__Group__3 : rule__AngleOperation__Group__3__Impl rule__AngleOperation__Group__4 ;
    public final void rule__AngleOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3489:1: ( rule__AngleOperation__Group__3__Impl rule__AngleOperation__Group__4 )
            // InternalLegoLang.g:3490:2: rule__AngleOperation__Group__3__Impl rule__AngleOperation__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalLegoLang.g:3497:1: rule__AngleOperation__Group__3__Impl : ( ( rule__AngleOperation__GyrosensorAssignment_3 ) ) ;
    public final void rule__AngleOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3501:1: ( ( ( rule__AngleOperation__GyrosensorAssignment_3 ) ) )
            // InternalLegoLang.g:3502:1: ( ( rule__AngleOperation__GyrosensorAssignment_3 ) )
            {
            // InternalLegoLang.g:3502:1: ( ( rule__AngleOperation__GyrosensorAssignment_3 ) )
            // InternalLegoLang.g:3503:2: ( rule__AngleOperation__GyrosensorAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAngleOperationAccess().getGyrosensorAssignment_3()); 
            }
            // InternalLegoLang.g:3504:2: ( rule__AngleOperation__GyrosensorAssignment_3 )
            // InternalLegoLang.g:3504:3: rule__AngleOperation__GyrosensorAssignment_3
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
    // InternalLegoLang.g:3512:1: rule__AngleOperation__Group__4 : rule__AngleOperation__Group__4__Impl ;
    public final void rule__AngleOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3516:1: ( rule__AngleOperation__Group__4__Impl )
            // InternalLegoLang.g:3517:2: rule__AngleOperation__Group__4__Impl
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
    // InternalLegoLang.g:3523:1: rule__AngleOperation__Group__4__Impl : ( ')' ) ;
    public final void rule__AngleOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3527:1: ( ( ')' ) )
            // InternalLegoLang.g:3528:1: ( ')' )
            {
            // InternalLegoLang.g:3528:1: ( ')' )
            // InternalLegoLang.g:3529:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAngleOperationAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:3539:1: rule__DistanceOperation__Group__0 : rule__DistanceOperation__Group__0__Impl rule__DistanceOperation__Group__1 ;
    public final void rule__DistanceOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3543:1: ( rule__DistanceOperation__Group__0__Impl rule__DistanceOperation__Group__1 )
            // InternalLegoLang.g:3544:2: rule__DistanceOperation__Group__0__Impl rule__DistanceOperation__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalLegoLang.g:3551:1: rule__DistanceOperation__Group__0__Impl : ( 'get' ) ;
    public final void rule__DistanceOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3555:1: ( ( 'get' ) )
            // InternalLegoLang.g:3556:1: ( 'get' )
            {
            // InternalLegoLang.g:3556:1: ( 'get' )
            // InternalLegoLang.g:3557:2: 'get'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDistanceOperationAccess().getGetKeyword_0()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:3566:1: rule__DistanceOperation__Group__1 : rule__DistanceOperation__Group__1__Impl rule__DistanceOperation__Group__2 ;
    public final void rule__DistanceOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3570:1: ( rule__DistanceOperation__Group__1__Impl rule__DistanceOperation__Group__2 )
            // InternalLegoLang.g:3571:2: rule__DistanceOperation__Group__1__Impl rule__DistanceOperation__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalLegoLang.g:3578:1: rule__DistanceOperation__Group__1__Impl : ( 'distance' ) ;
    public final void rule__DistanceOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3582:1: ( ( 'distance' ) )
            // InternalLegoLang.g:3583:1: ( 'distance' )
            {
            // InternalLegoLang.g:3583:1: ( 'distance' )
            // InternalLegoLang.g:3584:2: 'distance'
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
    // InternalLegoLang.g:3593:1: rule__DistanceOperation__Group__2 : rule__DistanceOperation__Group__2__Impl rule__DistanceOperation__Group__3 ;
    public final void rule__DistanceOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3597:1: ( rule__DistanceOperation__Group__2__Impl rule__DistanceOperation__Group__3 )
            // InternalLegoLang.g:3598:2: rule__DistanceOperation__Group__2__Impl rule__DistanceOperation__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalLegoLang.g:3605:1: rule__DistanceOperation__Group__2__Impl : ( '(' ) ;
    public final void rule__DistanceOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3609:1: ( ( '(' ) )
            // InternalLegoLang.g:3610:1: ( '(' )
            {
            // InternalLegoLang.g:3610:1: ( '(' )
            // InternalLegoLang.g:3611:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDistanceOperationAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:3620:1: rule__DistanceOperation__Group__3 : rule__DistanceOperation__Group__3__Impl rule__DistanceOperation__Group__4 ;
    public final void rule__DistanceOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3624:1: ( rule__DistanceOperation__Group__3__Impl rule__DistanceOperation__Group__4 )
            // InternalLegoLang.g:3625:2: rule__DistanceOperation__Group__3__Impl rule__DistanceOperation__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalLegoLang.g:3632:1: rule__DistanceOperation__Group__3__Impl : ( ( rule__DistanceOperation__UltrasonicsensorAssignment_3 ) ) ;
    public final void rule__DistanceOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3636:1: ( ( ( rule__DistanceOperation__UltrasonicsensorAssignment_3 ) ) )
            // InternalLegoLang.g:3637:1: ( ( rule__DistanceOperation__UltrasonicsensorAssignment_3 ) )
            {
            // InternalLegoLang.g:3637:1: ( ( rule__DistanceOperation__UltrasonicsensorAssignment_3 ) )
            // InternalLegoLang.g:3638:2: ( rule__DistanceOperation__UltrasonicsensorAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDistanceOperationAccess().getUltrasonicsensorAssignment_3()); 
            }
            // InternalLegoLang.g:3639:2: ( rule__DistanceOperation__UltrasonicsensorAssignment_3 )
            // InternalLegoLang.g:3639:3: rule__DistanceOperation__UltrasonicsensorAssignment_3
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
    // InternalLegoLang.g:3647:1: rule__DistanceOperation__Group__4 : rule__DistanceOperation__Group__4__Impl ;
    public final void rule__DistanceOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3651:1: ( rule__DistanceOperation__Group__4__Impl )
            // InternalLegoLang.g:3652:2: rule__DistanceOperation__Group__4__Impl
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
    // InternalLegoLang.g:3658:1: rule__DistanceOperation__Group__4__Impl : ( ')' ) ;
    public final void rule__DistanceOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3662:1: ( ( ')' ) )
            // InternalLegoLang.g:3663:1: ( ')' )
            {
            // InternalLegoLang.g:3663:1: ( ')' )
            // InternalLegoLang.g:3664:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDistanceOperationAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__ConditionEtat__Group__0"
    // InternalLegoLang.g:3674:1: rule__ConditionEtat__Group__0 : rule__ConditionEtat__Group__0__Impl rule__ConditionEtat__Group__1 ;
    public final void rule__ConditionEtat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3678:1: ( rule__ConditionEtat__Group__0__Impl rule__ConditionEtat__Group__1 )
            // InternalLegoLang.g:3679:2: rule__ConditionEtat__Group__0__Impl rule__ConditionEtat__Group__1
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
    // InternalLegoLang.g:3686:1: rule__ConditionEtat__Group__0__Impl : ( 'if' ) ;
    public final void rule__ConditionEtat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3690:1: ( ( 'if' ) )
            // InternalLegoLang.g:3691:1: ( 'if' )
            {
            // InternalLegoLang.g:3691:1: ( 'if' )
            // InternalLegoLang.g:3692:2: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionEtatAccess().getIfKeyword_0()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:3701:1: rule__ConditionEtat__Group__1 : rule__ConditionEtat__Group__1__Impl rule__ConditionEtat__Group__2 ;
    public final void rule__ConditionEtat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3705:1: ( rule__ConditionEtat__Group__1__Impl rule__ConditionEtat__Group__2 )
            // InternalLegoLang.g:3706:2: rule__ConditionEtat__Group__1__Impl rule__ConditionEtat__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalLegoLang.g:3713:1: rule__ConditionEtat__Group__1__Impl : ( ( rule__ConditionEtat__ConditionAssignment_1 ) ) ;
    public final void rule__ConditionEtat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3717:1: ( ( ( rule__ConditionEtat__ConditionAssignment_1 ) ) )
            // InternalLegoLang.g:3718:1: ( ( rule__ConditionEtat__ConditionAssignment_1 ) )
            {
            // InternalLegoLang.g:3718:1: ( ( rule__ConditionEtat__ConditionAssignment_1 ) )
            // InternalLegoLang.g:3719:2: ( rule__ConditionEtat__ConditionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionEtatAccess().getConditionAssignment_1()); 
            }
            // InternalLegoLang.g:3720:2: ( rule__ConditionEtat__ConditionAssignment_1 )
            // InternalLegoLang.g:3720:3: rule__ConditionEtat__ConditionAssignment_1
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
    // InternalLegoLang.g:3728:1: rule__ConditionEtat__Group__2 : rule__ConditionEtat__Group__2__Impl rule__ConditionEtat__Group__3 ;
    public final void rule__ConditionEtat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3732:1: ( rule__ConditionEtat__Group__2__Impl rule__ConditionEtat__Group__3 )
            // InternalLegoLang.g:3733:2: rule__ConditionEtat__Group__2__Impl rule__ConditionEtat__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalLegoLang.g:3740:1: rule__ConditionEtat__Group__2__Impl : ( ( rule__ConditionEtat__Group_2__0 )* ) ;
    public final void rule__ConditionEtat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3744:1: ( ( ( rule__ConditionEtat__Group_2__0 )* ) )
            // InternalLegoLang.g:3745:1: ( ( rule__ConditionEtat__Group_2__0 )* )
            {
            // InternalLegoLang.g:3745:1: ( ( rule__ConditionEtat__Group_2__0 )* )
            // InternalLegoLang.g:3746:2: ( rule__ConditionEtat__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionEtatAccess().getGroup_2()); 
            }
            // InternalLegoLang.g:3747:2: ( rule__ConditionEtat__Group_2__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==37) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalLegoLang.g:3747:3: rule__ConditionEtat__Group_2__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__ConditionEtat__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionEtatAccess().getGroup_2()); 
            }

            }


            }

        }
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
    // InternalLegoLang.g:3755:1: rule__ConditionEtat__Group__3 : rule__ConditionEtat__Group__3__Impl rule__ConditionEtat__Group__4 ;
    public final void rule__ConditionEtat__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3759:1: ( rule__ConditionEtat__Group__3__Impl rule__ConditionEtat__Group__4 )
            // InternalLegoLang.g:3760:2: rule__ConditionEtat__Group__3__Impl rule__ConditionEtat__Group__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalLegoLang.g:3767:1: rule__ConditionEtat__Group__3__Impl : ( ( rule__ConditionEtat__Group_3__0 )* ) ;
    public final void rule__ConditionEtat__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3771:1: ( ( ( rule__ConditionEtat__Group_3__0 )* ) )
            // InternalLegoLang.g:3772:1: ( ( rule__ConditionEtat__Group_3__0 )* )
            {
            // InternalLegoLang.g:3772:1: ( ( rule__ConditionEtat__Group_3__0 )* )
            // InternalLegoLang.g:3773:2: ( rule__ConditionEtat__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionEtatAccess().getGroup_3()); 
            }
            // InternalLegoLang.g:3774:2: ( rule__ConditionEtat__Group_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==38) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalLegoLang.g:3774:3: rule__ConditionEtat__Group_3__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__ConditionEtat__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionEtatAccess().getGroup_3()); 
            }

            }


            }

        }
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
    // InternalLegoLang.g:3782:1: rule__ConditionEtat__Group__4 : rule__ConditionEtat__Group__4__Impl rule__ConditionEtat__Group__5 ;
    public final void rule__ConditionEtat__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3786:1: ( rule__ConditionEtat__Group__4__Impl rule__ConditionEtat__Group__5 )
            // InternalLegoLang.g:3787:2: rule__ConditionEtat__Group__4__Impl rule__ConditionEtat__Group__5
            {
            pushFollow(FOLLOW_6);
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
    // InternalLegoLang.g:3794:1: rule__ConditionEtat__Group__4__Impl : ( '{' ) ;
    public final void rule__ConditionEtat__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3798:1: ( ( '{' ) )
            // InternalLegoLang.g:3799:1: ( '{' )
            {
            // InternalLegoLang.g:3799:1: ( '{' )
            // InternalLegoLang.g:3800:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionEtatAccess().getLeftCurlyBracketKeyword_4()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionEtatAccess().getLeftCurlyBracketKeyword_4()); 
            }

            }


            }

        }
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
    // InternalLegoLang.g:3809:1: rule__ConditionEtat__Group__5 : rule__ConditionEtat__Group__5__Impl rule__ConditionEtat__Group__6 ;
    public final void rule__ConditionEtat__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3813:1: ( rule__ConditionEtat__Group__5__Impl rule__ConditionEtat__Group__6 )
            // InternalLegoLang.g:3814:2: rule__ConditionEtat__Group__5__Impl rule__ConditionEtat__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__ConditionEtat__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConditionEtat__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalLegoLang.g:3821:1: rule__ConditionEtat__Group__5__Impl : ( ( rule__ConditionEtat__ThenAssignment_5 )* ) ;
    public final void rule__ConditionEtat__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3825:1: ( ( ( rule__ConditionEtat__ThenAssignment_5 )* ) )
            // InternalLegoLang.g:3826:1: ( ( rule__ConditionEtat__ThenAssignment_5 )* )
            {
            // InternalLegoLang.g:3826:1: ( ( rule__ConditionEtat__ThenAssignment_5 )* )
            // InternalLegoLang.g:3827:2: ( rule__ConditionEtat__ThenAssignment_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionEtatAccess().getThenAssignment_5()); 
            }
            // InternalLegoLang.g:3828:2: ( rule__ConditionEtat__ThenAssignment_5 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=RULE_STRING && LA15_0<=RULE_INT)||(LA15_0>=11 && LA15_0<=12)||(LA15_0>=16 && LA15_0<=22)||LA15_0==26||LA15_0==28||LA15_0==36||(LA15_0>=40 && LA15_0<=41)||LA15_0==44||LA15_0==56||LA15_0==58||(LA15_0>=60 && LA15_0<=62)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalLegoLang.g:3828:3: rule__ConditionEtat__ThenAssignment_5
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__ConditionEtat__ThenAssignment_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionEtatAccess().getThenAssignment_5()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__ConditionEtat__Group__6"
    // InternalLegoLang.g:3836:1: rule__ConditionEtat__Group__6 : rule__ConditionEtat__Group__6__Impl rule__ConditionEtat__Group__7 ;
    public final void rule__ConditionEtat__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3840:1: ( rule__ConditionEtat__Group__6__Impl rule__ConditionEtat__Group__7 )
            // InternalLegoLang.g:3841:2: rule__ConditionEtat__Group__6__Impl rule__ConditionEtat__Group__7
            {
            pushFollow(FOLLOW_27);
            rule__ConditionEtat__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConditionEtat__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionEtat__Group__6"


    // $ANTLR start "rule__ConditionEtat__Group__6__Impl"
    // InternalLegoLang.g:3848:1: rule__ConditionEtat__Group__6__Impl : ( '}' ) ;
    public final void rule__ConditionEtat__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3852:1: ( ( '}' ) )
            // InternalLegoLang.g:3853:1: ( '}' )
            {
            // InternalLegoLang.g:3853:1: ( '}' )
            // InternalLegoLang.g:3854:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionEtatAccess().getRightCurlyBracketKeyword_6()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionEtatAccess().getRightCurlyBracketKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionEtat__Group__6__Impl"


    // $ANTLR start "rule__ConditionEtat__Group__7"
    // InternalLegoLang.g:3863:1: rule__ConditionEtat__Group__7 : rule__ConditionEtat__Group__7__Impl ;
    public final void rule__ConditionEtat__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3867:1: ( rule__ConditionEtat__Group__7__Impl )
            // InternalLegoLang.g:3868:2: rule__ConditionEtat__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConditionEtat__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionEtat__Group__7"


    // $ANTLR start "rule__ConditionEtat__Group__7__Impl"
    // InternalLegoLang.g:3874:1: rule__ConditionEtat__Group__7__Impl : ( ( rule__ConditionEtat__Group_7__0 )? ) ;
    public final void rule__ConditionEtat__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3878:1: ( ( ( rule__ConditionEtat__Group_7__0 )? ) )
            // InternalLegoLang.g:3879:1: ( ( rule__ConditionEtat__Group_7__0 )? )
            {
            // InternalLegoLang.g:3879:1: ( ( rule__ConditionEtat__Group_7__0 )? )
            // InternalLegoLang.g:3880:2: ( rule__ConditionEtat__Group_7__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionEtatAccess().getGroup_7()); 
            }
            // InternalLegoLang.g:3881:2: ( rule__ConditionEtat__Group_7__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==39) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalLegoLang.g:3881:3: rule__ConditionEtat__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConditionEtat__Group_7__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionEtatAccess().getGroup_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionEtat__Group__7__Impl"


    // $ANTLR start "rule__ConditionEtat__Group_2__0"
    // InternalLegoLang.g:3890:1: rule__ConditionEtat__Group_2__0 : rule__ConditionEtat__Group_2__0__Impl rule__ConditionEtat__Group_2__1 ;
    public final void rule__ConditionEtat__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3894:1: ( rule__ConditionEtat__Group_2__0__Impl rule__ConditionEtat__Group_2__1 )
            // InternalLegoLang.g:3895:2: rule__ConditionEtat__Group_2__0__Impl rule__ConditionEtat__Group_2__1
            {
            pushFollow(FOLLOW_15);
            rule__ConditionEtat__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConditionEtat__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionEtat__Group_2__0"


    // $ANTLR start "rule__ConditionEtat__Group_2__0__Impl"
    // InternalLegoLang.g:3902:1: rule__ConditionEtat__Group_2__0__Impl : ( 'and' ) ;
    public final void rule__ConditionEtat__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3906:1: ( ( 'and' ) )
            // InternalLegoLang.g:3907:1: ( 'and' )
            {
            // InternalLegoLang.g:3907:1: ( 'and' )
            // InternalLegoLang.g:3908:2: 'and'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionEtatAccess().getAndKeyword_2_0()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionEtatAccess().getAndKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionEtat__Group_2__0__Impl"


    // $ANTLR start "rule__ConditionEtat__Group_2__1"
    // InternalLegoLang.g:3917:1: rule__ConditionEtat__Group_2__1 : rule__ConditionEtat__Group_2__1__Impl ;
    public final void rule__ConditionEtat__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3921:1: ( rule__ConditionEtat__Group_2__1__Impl )
            // InternalLegoLang.g:3922:2: rule__ConditionEtat__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConditionEtat__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionEtat__Group_2__1"


    // $ANTLR start "rule__ConditionEtat__Group_2__1__Impl"
    // InternalLegoLang.g:3928:1: rule__ConditionEtat__Group_2__1__Impl : ( ( rule__ConditionEtat__ConditionAssignment_2_1 ) ) ;
    public final void rule__ConditionEtat__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3932:1: ( ( ( rule__ConditionEtat__ConditionAssignment_2_1 ) ) )
            // InternalLegoLang.g:3933:1: ( ( rule__ConditionEtat__ConditionAssignment_2_1 ) )
            {
            // InternalLegoLang.g:3933:1: ( ( rule__ConditionEtat__ConditionAssignment_2_1 ) )
            // InternalLegoLang.g:3934:2: ( rule__ConditionEtat__ConditionAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionEtatAccess().getConditionAssignment_2_1()); 
            }
            // InternalLegoLang.g:3935:2: ( rule__ConditionEtat__ConditionAssignment_2_1 )
            // InternalLegoLang.g:3935:3: rule__ConditionEtat__ConditionAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ConditionEtat__ConditionAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionEtatAccess().getConditionAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionEtat__Group_2__1__Impl"


    // $ANTLR start "rule__ConditionEtat__Group_3__0"
    // InternalLegoLang.g:3944:1: rule__ConditionEtat__Group_3__0 : rule__ConditionEtat__Group_3__0__Impl rule__ConditionEtat__Group_3__1 ;
    public final void rule__ConditionEtat__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3948:1: ( rule__ConditionEtat__Group_3__0__Impl rule__ConditionEtat__Group_3__1 )
            // InternalLegoLang.g:3949:2: rule__ConditionEtat__Group_3__0__Impl rule__ConditionEtat__Group_3__1
            {
            pushFollow(FOLLOW_15);
            rule__ConditionEtat__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConditionEtat__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionEtat__Group_3__0"


    // $ANTLR start "rule__ConditionEtat__Group_3__0__Impl"
    // InternalLegoLang.g:3956:1: rule__ConditionEtat__Group_3__0__Impl : ( 'or' ) ;
    public final void rule__ConditionEtat__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3960:1: ( ( 'or' ) )
            // InternalLegoLang.g:3961:1: ( 'or' )
            {
            // InternalLegoLang.g:3961:1: ( 'or' )
            // InternalLegoLang.g:3962:2: 'or'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionEtatAccess().getOrKeyword_3_0()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionEtatAccess().getOrKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionEtat__Group_3__0__Impl"


    // $ANTLR start "rule__ConditionEtat__Group_3__1"
    // InternalLegoLang.g:3971:1: rule__ConditionEtat__Group_3__1 : rule__ConditionEtat__Group_3__1__Impl ;
    public final void rule__ConditionEtat__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3975:1: ( rule__ConditionEtat__Group_3__1__Impl )
            // InternalLegoLang.g:3976:2: rule__ConditionEtat__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConditionEtat__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionEtat__Group_3__1"


    // $ANTLR start "rule__ConditionEtat__Group_3__1__Impl"
    // InternalLegoLang.g:3982:1: rule__ConditionEtat__Group_3__1__Impl : ( ( rule__ConditionEtat__ConditionAssignment_3_1 ) ) ;
    public final void rule__ConditionEtat__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:3986:1: ( ( ( rule__ConditionEtat__ConditionAssignment_3_1 ) ) )
            // InternalLegoLang.g:3987:1: ( ( rule__ConditionEtat__ConditionAssignment_3_1 ) )
            {
            // InternalLegoLang.g:3987:1: ( ( rule__ConditionEtat__ConditionAssignment_3_1 ) )
            // InternalLegoLang.g:3988:2: ( rule__ConditionEtat__ConditionAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionEtatAccess().getConditionAssignment_3_1()); 
            }
            // InternalLegoLang.g:3989:2: ( rule__ConditionEtat__ConditionAssignment_3_1 )
            // InternalLegoLang.g:3989:3: rule__ConditionEtat__ConditionAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ConditionEtat__ConditionAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionEtatAccess().getConditionAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionEtat__Group_3__1__Impl"


    // $ANTLR start "rule__ConditionEtat__Group_7__0"
    // InternalLegoLang.g:3998:1: rule__ConditionEtat__Group_7__0 : rule__ConditionEtat__Group_7__0__Impl rule__ConditionEtat__Group_7__1 ;
    public final void rule__ConditionEtat__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4002:1: ( rule__ConditionEtat__Group_7__0__Impl rule__ConditionEtat__Group_7__1 )
            // InternalLegoLang.g:4003:2: rule__ConditionEtat__Group_7__0__Impl rule__ConditionEtat__Group_7__1
            {
            pushFollow(FOLLOW_28);
            rule__ConditionEtat__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConditionEtat__Group_7__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionEtat__Group_7__0"


    // $ANTLR start "rule__ConditionEtat__Group_7__0__Impl"
    // InternalLegoLang.g:4010:1: rule__ConditionEtat__Group_7__0__Impl : ( 'else{' ) ;
    public final void rule__ConditionEtat__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4014:1: ( ( 'else{' ) )
            // InternalLegoLang.g:4015:1: ( 'else{' )
            {
            // InternalLegoLang.g:4015:1: ( 'else{' )
            // InternalLegoLang.g:4016:2: 'else{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionEtatAccess().getElseKeyword_7_0()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionEtatAccess().getElseKeyword_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionEtat__Group_7__0__Impl"


    // $ANTLR start "rule__ConditionEtat__Group_7__1"
    // InternalLegoLang.g:4025:1: rule__ConditionEtat__Group_7__1 : rule__ConditionEtat__Group_7__1__Impl rule__ConditionEtat__Group_7__2 ;
    public final void rule__ConditionEtat__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4029:1: ( rule__ConditionEtat__Group_7__1__Impl rule__ConditionEtat__Group_7__2 )
            // InternalLegoLang.g:4030:2: rule__ConditionEtat__Group_7__1__Impl rule__ConditionEtat__Group_7__2
            {
            pushFollow(FOLLOW_29);
            rule__ConditionEtat__Group_7__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConditionEtat__Group_7__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionEtat__Group_7__1"


    // $ANTLR start "rule__ConditionEtat__Group_7__1__Impl"
    // InternalLegoLang.g:4037:1: rule__ConditionEtat__Group_7__1__Impl : ( ( rule__ConditionEtat__ElseAssignment_7_1 ) ) ;
    public final void rule__ConditionEtat__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4041:1: ( ( ( rule__ConditionEtat__ElseAssignment_7_1 ) ) )
            // InternalLegoLang.g:4042:1: ( ( rule__ConditionEtat__ElseAssignment_7_1 ) )
            {
            // InternalLegoLang.g:4042:1: ( ( rule__ConditionEtat__ElseAssignment_7_1 ) )
            // InternalLegoLang.g:4043:2: ( rule__ConditionEtat__ElseAssignment_7_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionEtatAccess().getElseAssignment_7_1()); 
            }
            // InternalLegoLang.g:4044:2: ( rule__ConditionEtat__ElseAssignment_7_1 )
            // InternalLegoLang.g:4044:3: rule__ConditionEtat__ElseAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__ConditionEtat__ElseAssignment_7_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionEtatAccess().getElseAssignment_7_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionEtat__Group_7__1__Impl"


    // $ANTLR start "rule__ConditionEtat__Group_7__2"
    // InternalLegoLang.g:4052:1: rule__ConditionEtat__Group_7__2 : rule__ConditionEtat__Group_7__2__Impl ;
    public final void rule__ConditionEtat__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4056:1: ( rule__ConditionEtat__Group_7__2__Impl )
            // InternalLegoLang.g:4057:2: rule__ConditionEtat__Group_7__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConditionEtat__Group_7__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionEtat__Group_7__2"


    // $ANTLR start "rule__ConditionEtat__Group_7__2__Impl"
    // InternalLegoLang.g:4063:1: rule__ConditionEtat__Group_7__2__Impl : ( '}' ) ;
    public final void rule__ConditionEtat__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4067:1: ( ( '}' ) )
            // InternalLegoLang.g:4068:1: ( '}' )
            {
            // InternalLegoLang.g:4068:1: ( '}' )
            // InternalLegoLang.g:4069:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionEtatAccess().getRightCurlyBracketKeyword_7_2()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionEtatAccess().getRightCurlyBracketKeyword_7_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionEtat__Group_7__2__Impl"


    // $ANTLR start "rule__WhileLoop__Group__0"
    // InternalLegoLang.g:4079:1: rule__WhileLoop__Group__0 : rule__WhileLoop__Group__0__Impl rule__WhileLoop__Group__1 ;
    public final void rule__WhileLoop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4083:1: ( rule__WhileLoop__Group__0__Impl rule__WhileLoop__Group__1 )
            // InternalLegoLang.g:4084:2: rule__WhileLoop__Group__0__Impl rule__WhileLoop__Group__1
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
    // InternalLegoLang.g:4091:1: rule__WhileLoop__Group__0__Impl : ( 'while' ) ;
    public final void rule__WhileLoop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4095:1: ( ( 'while' ) )
            // InternalLegoLang.g:4096:1: ( 'while' )
            {
            // InternalLegoLang.g:4096:1: ( 'while' )
            // InternalLegoLang.g:4097:2: 'while'
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
    // InternalLegoLang.g:4106:1: rule__WhileLoop__Group__1 : rule__WhileLoop__Group__1__Impl rule__WhileLoop__Group__2 ;
    public final void rule__WhileLoop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4110:1: ( rule__WhileLoop__Group__1__Impl rule__WhileLoop__Group__2 )
            // InternalLegoLang.g:4111:2: rule__WhileLoop__Group__1__Impl rule__WhileLoop__Group__2
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
    // InternalLegoLang.g:4118:1: rule__WhileLoop__Group__1__Impl : ( ( rule__WhileLoop__LoopConditionAssignment_1 ) ) ;
    public final void rule__WhileLoop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4122:1: ( ( ( rule__WhileLoop__LoopConditionAssignment_1 ) ) )
            // InternalLegoLang.g:4123:1: ( ( rule__WhileLoop__LoopConditionAssignment_1 ) )
            {
            // InternalLegoLang.g:4123:1: ( ( rule__WhileLoop__LoopConditionAssignment_1 ) )
            // InternalLegoLang.g:4124:2: ( rule__WhileLoop__LoopConditionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileLoopAccess().getLoopConditionAssignment_1()); 
            }
            // InternalLegoLang.g:4125:2: ( rule__WhileLoop__LoopConditionAssignment_1 )
            // InternalLegoLang.g:4125:3: rule__WhileLoop__LoopConditionAssignment_1
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
    // InternalLegoLang.g:4133:1: rule__WhileLoop__Group__2 : rule__WhileLoop__Group__2__Impl rule__WhileLoop__Group__3 ;
    public final void rule__WhileLoop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4137:1: ( rule__WhileLoop__Group__2__Impl rule__WhileLoop__Group__3 )
            // InternalLegoLang.g:4138:2: rule__WhileLoop__Group__2__Impl rule__WhileLoop__Group__3
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
    // InternalLegoLang.g:4145:1: rule__WhileLoop__Group__2__Impl : ( '{' ) ;
    public final void rule__WhileLoop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4149:1: ( ( '{' ) )
            // InternalLegoLang.g:4150:1: ( '{' )
            {
            // InternalLegoLang.g:4150:1: ( '{' )
            // InternalLegoLang.g:4151:2: '{'
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
    // InternalLegoLang.g:4160:1: rule__WhileLoop__Group__3 : rule__WhileLoop__Group__3__Impl rule__WhileLoop__Group__4 ;
    public final void rule__WhileLoop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4164:1: ( rule__WhileLoop__Group__3__Impl rule__WhileLoop__Group__4 )
            // InternalLegoLang.g:4165:2: rule__WhileLoop__Group__3__Impl rule__WhileLoop__Group__4
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
    // InternalLegoLang.g:4172:1: rule__WhileLoop__Group__3__Impl : ( ( rule__WhileLoop__StatementAssignment_3 )* ) ;
    public final void rule__WhileLoop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4176:1: ( ( ( rule__WhileLoop__StatementAssignment_3 )* ) )
            // InternalLegoLang.g:4177:1: ( ( rule__WhileLoop__StatementAssignment_3 )* )
            {
            // InternalLegoLang.g:4177:1: ( ( rule__WhileLoop__StatementAssignment_3 )* )
            // InternalLegoLang.g:4178:2: ( rule__WhileLoop__StatementAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileLoopAccess().getStatementAssignment_3()); 
            }
            // InternalLegoLang.g:4179:2: ( rule__WhileLoop__StatementAssignment_3 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_STRING && LA17_0<=RULE_INT)||(LA17_0>=11 && LA17_0<=12)||(LA17_0>=16 && LA17_0<=22)||LA17_0==26||LA17_0==28||LA17_0==36||(LA17_0>=40 && LA17_0<=41)||LA17_0==44||LA17_0==56||LA17_0==58||(LA17_0>=60 && LA17_0<=62)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalLegoLang.g:4179:3: rule__WhileLoop__StatementAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__WhileLoop__StatementAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalLegoLang.g:4187:1: rule__WhileLoop__Group__4 : rule__WhileLoop__Group__4__Impl ;
    public final void rule__WhileLoop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4191:1: ( rule__WhileLoop__Group__4__Impl )
            // InternalLegoLang.g:4192:2: rule__WhileLoop__Group__4__Impl
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
    // InternalLegoLang.g:4198:1: rule__WhileLoop__Group__4__Impl : ( '}' ) ;
    public final void rule__WhileLoop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4202:1: ( ( '}' ) )
            // InternalLegoLang.g:4203:1: ( '}' )
            {
            // InternalLegoLang.g:4203:1: ( '}' )
            // InternalLegoLang.g:4204:2: '}'
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
    // InternalLegoLang.g:4214:1: rule__MethodePrint__Group__0 : rule__MethodePrint__Group__0__Impl rule__MethodePrint__Group__1 ;
    public final void rule__MethodePrint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4218:1: ( rule__MethodePrint__Group__0__Impl rule__MethodePrint__Group__1 )
            // InternalLegoLang.g:4219:2: rule__MethodePrint__Group__0__Impl rule__MethodePrint__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalLegoLang.g:4226:1: rule__MethodePrint__Group__0__Impl : ( () ) ;
    public final void rule__MethodePrint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4230:1: ( ( () ) )
            // InternalLegoLang.g:4231:1: ( () )
            {
            // InternalLegoLang.g:4231:1: ( () )
            // InternalLegoLang.g:4232:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodePrintAccess().getMethodePrintAction_0()); 
            }
            // InternalLegoLang.g:4233:2: ()
            // InternalLegoLang.g:4233:3: 
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
    // InternalLegoLang.g:4241:1: rule__MethodePrint__Group__1 : rule__MethodePrint__Group__1__Impl rule__MethodePrint__Group__2 ;
    public final void rule__MethodePrint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4245:1: ( rule__MethodePrint__Group__1__Impl rule__MethodePrint__Group__2 )
            // InternalLegoLang.g:4246:2: rule__MethodePrint__Group__1__Impl rule__MethodePrint__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalLegoLang.g:4253:1: rule__MethodePrint__Group__1__Impl : ( 'print(' ) ;
    public final void rule__MethodePrint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4257:1: ( ( 'print(' ) )
            // InternalLegoLang.g:4258:1: ( 'print(' )
            {
            // InternalLegoLang.g:4258:1: ( 'print(' )
            // InternalLegoLang.g:4259:2: 'print('
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
    // InternalLegoLang.g:4268:1: rule__MethodePrint__Group__2 : rule__MethodePrint__Group__2__Impl rule__MethodePrint__Group__3 ;
    public final void rule__MethodePrint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4272:1: ( rule__MethodePrint__Group__2__Impl rule__MethodePrint__Group__3 )
            // InternalLegoLang.g:4273:2: rule__MethodePrint__Group__2__Impl rule__MethodePrint__Group__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalLegoLang.g:4280:1: rule__MethodePrint__Group__2__Impl : ( ( ( rule__MethodePrint__Group_2__0 ) ) ( ( rule__MethodePrint__Group_2__0 )* ) ) ;
    public final void rule__MethodePrint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4284:1: ( ( ( ( rule__MethodePrint__Group_2__0 ) ) ( ( rule__MethodePrint__Group_2__0 )* ) ) )
            // InternalLegoLang.g:4285:1: ( ( ( rule__MethodePrint__Group_2__0 ) ) ( ( rule__MethodePrint__Group_2__0 )* ) )
            {
            // InternalLegoLang.g:4285:1: ( ( ( rule__MethodePrint__Group_2__0 ) ) ( ( rule__MethodePrint__Group_2__0 )* ) )
            // InternalLegoLang.g:4286:2: ( ( rule__MethodePrint__Group_2__0 ) ) ( ( rule__MethodePrint__Group_2__0 )* )
            {
            // InternalLegoLang.g:4286:2: ( ( rule__MethodePrint__Group_2__0 ) )
            // InternalLegoLang.g:4287:3: ( rule__MethodePrint__Group_2__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodePrintAccess().getGroup_2()); 
            }
            // InternalLegoLang.g:4288:3: ( rule__MethodePrint__Group_2__0 )
            // InternalLegoLang.g:4288:4: rule__MethodePrint__Group_2__0
            {
            pushFollow(FOLLOW_32);
            rule__MethodePrint__Group_2__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodePrintAccess().getGroup_2()); 
            }

            }

            // InternalLegoLang.g:4291:2: ( ( rule__MethodePrint__Group_2__0 )* )
            // InternalLegoLang.g:4292:3: ( rule__MethodePrint__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodePrintAccess().getGroup_2()); 
            }
            // InternalLegoLang.g:4293:3: ( rule__MethodePrint__Group_2__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=RULE_STRING && LA18_0<=RULE_INT)||(LA18_0>=11 && LA18_0<=12)||LA18_0==26||LA18_0==28||LA18_0==44) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalLegoLang.g:4293:4: rule__MethodePrint__Group_2__0
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__MethodePrint__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalLegoLang.g:4302:1: rule__MethodePrint__Group__3 : rule__MethodePrint__Group__3__Impl ;
    public final void rule__MethodePrint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4306:1: ( rule__MethodePrint__Group__3__Impl )
            // InternalLegoLang.g:4307:2: rule__MethodePrint__Group__3__Impl
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
    // InternalLegoLang.g:4313:1: rule__MethodePrint__Group__3__Impl : ( ');' ) ;
    public final void rule__MethodePrint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4317:1: ( ( ');' ) )
            // InternalLegoLang.g:4318:1: ( ');' )
            {
            // InternalLegoLang.g:4318:1: ( ');' )
            // InternalLegoLang.g:4319:2: ');'
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
    // InternalLegoLang.g:4329:1: rule__MethodePrint__Group_2__0 : rule__MethodePrint__Group_2__0__Impl rule__MethodePrint__Group_2__1 ;
    public final void rule__MethodePrint__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4333:1: ( rule__MethodePrint__Group_2__0__Impl rule__MethodePrint__Group_2__1 )
            // InternalLegoLang.g:4334:2: rule__MethodePrint__Group_2__0__Impl rule__MethodePrint__Group_2__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalLegoLang.g:4341:1: rule__MethodePrint__Group_2__0__Impl : ( ( rule__MethodePrint__ExpressionAssignment_2_0 ) ) ;
    public final void rule__MethodePrint__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4345:1: ( ( ( rule__MethodePrint__ExpressionAssignment_2_0 ) ) )
            // InternalLegoLang.g:4346:1: ( ( rule__MethodePrint__ExpressionAssignment_2_0 ) )
            {
            // InternalLegoLang.g:4346:1: ( ( rule__MethodePrint__ExpressionAssignment_2_0 ) )
            // InternalLegoLang.g:4347:2: ( rule__MethodePrint__ExpressionAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodePrintAccess().getExpressionAssignment_2_0()); 
            }
            // InternalLegoLang.g:4348:2: ( rule__MethodePrint__ExpressionAssignment_2_0 )
            // InternalLegoLang.g:4348:3: rule__MethodePrint__ExpressionAssignment_2_0
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
    // InternalLegoLang.g:4356:1: rule__MethodePrint__Group_2__1 : rule__MethodePrint__Group_2__1__Impl ;
    public final void rule__MethodePrint__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4360:1: ( rule__MethodePrint__Group_2__1__Impl )
            // InternalLegoLang.g:4361:2: rule__MethodePrint__Group_2__1__Impl
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
    // InternalLegoLang.g:4367:1: rule__MethodePrint__Group_2__1__Impl : ( ',' ) ;
    public final void rule__MethodePrint__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4371:1: ( ( ',' ) )
            // InternalLegoLang.g:4372:1: ( ',' )
            {
            // InternalLegoLang.g:4372:1: ( ',' )
            // InternalLegoLang.g:4373:2: ','
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
    // InternalLegoLang.g:4383:1: rule__Substraction__Group__0 : rule__Substraction__Group__0__Impl rule__Substraction__Group__1 ;
    public final void rule__Substraction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4387:1: ( rule__Substraction__Group__0__Impl rule__Substraction__Group__1 )
            // InternalLegoLang.g:4388:2: rule__Substraction__Group__0__Impl rule__Substraction__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalLegoLang.g:4395:1: rule__Substraction__Group__0__Impl : ( '(' ) ;
    public final void rule__Substraction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4399:1: ( ( '(' ) )
            // InternalLegoLang.g:4400:1: ( '(' )
            {
            // InternalLegoLang.g:4400:1: ( '(' )
            // InternalLegoLang.g:4401:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstractionAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:4410:1: rule__Substraction__Group__1 : rule__Substraction__Group__1__Impl rule__Substraction__Group__2 ;
    public final void rule__Substraction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4414:1: ( rule__Substraction__Group__1__Impl rule__Substraction__Group__2 )
            // InternalLegoLang.g:4415:2: rule__Substraction__Group__1__Impl rule__Substraction__Group__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalLegoLang.g:4422:1: rule__Substraction__Group__1__Impl : ( ( rule__Substraction__LeftAssignment_1 ) ) ;
    public final void rule__Substraction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4426:1: ( ( ( rule__Substraction__LeftAssignment_1 ) ) )
            // InternalLegoLang.g:4427:1: ( ( rule__Substraction__LeftAssignment_1 ) )
            {
            // InternalLegoLang.g:4427:1: ( ( rule__Substraction__LeftAssignment_1 ) )
            // InternalLegoLang.g:4428:2: ( rule__Substraction__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstractionAccess().getLeftAssignment_1()); 
            }
            // InternalLegoLang.g:4429:2: ( rule__Substraction__LeftAssignment_1 )
            // InternalLegoLang.g:4429:3: rule__Substraction__LeftAssignment_1
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
    // InternalLegoLang.g:4437:1: rule__Substraction__Group__2 : rule__Substraction__Group__2__Impl rule__Substraction__Group__3 ;
    public final void rule__Substraction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4441:1: ( rule__Substraction__Group__2__Impl rule__Substraction__Group__3 )
            // InternalLegoLang.g:4442:2: rule__Substraction__Group__2__Impl rule__Substraction__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalLegoLang.g:4449:1: rule__Substraction__Group__2__Impl : ( '-' ) ;
    public final void rule__Substraction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4453:1: ( ( '-' ) )
            // InternalLegoLang.g:4454:1: ( '-' )
            {
            // InternalLegoLang.g:4454:1: ( '-' )
            // InternalLegoLang.g:4455:2: '-'
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
    // InternalLegoLang.g:4464:1: rule__Substraction__Group__3 : rule__Substraction__Group__3__Impl rule__Substraction__Group__4 ;
    public final void rule__Substraction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4468:1: ( rule__Substraction__Group__3__Impl rule__Substraction__Group__4 )
            // InternalLegoLang.g:4469:2: rule__Substraction__Group__3__Impl rule__Substraction__Group__4
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
    // InternalLegoLang.g:4476:1: rule__Substraction__Group__3__Impl : ( ( rule__Substraction__RightAssignment_3 ) ) ;
    public final void rule__Substraction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4480:1: ( ( ( rule__Substraction__RightAssignment_3 ) ) )
            // InternalLegoLang.g:4481:1: ( ( rule__Substraction__RightAssignment_3 ) )
            {
            // InternalLegoLang.g:4481:1: ( ( rule__Substraction__RightAssignment_3 ) )
            // InternalLegoLang.g:4482:2: ( rule__Substraction__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstractionAccess().getRightAssignment_3()); 
            }
            // InternalLegoLang.g:4483:2: ( rule__Substraction__RightAssignment_3 )
            // InternalLegoLang.g:4483:3: rule__Substraction__RightAssignment_3
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
    // InternalLegoLang.g:4491:1: rule__Substraction__Group__4 : rule__Substraction__Group__4__Impl ;
    public final void rule__Substraction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4495:1: ( rule__Substraction__Group__4__Impl )
            // InternalLegoLang.g:4496:2: rule__Substraction__Group__4__Impl
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
    // InternalLegoLang.g:4502:1: rule__Substraction__Group__4__Impl : ( ')' ) ;
    public final void rule__Substraction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4506:1: ( ( ')' ) )
            // InternalLegoLang.g:4507:1: ( ')' )
            {
            // InternalLegoLang.g:4507:1: ( ')' )
            // InternalLegoLang.g:4508:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstractionAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:4518:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4522:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // InternalLegoLang.g:4523:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalLegoLang.g:4530:1: rule__Addition__Group__0__Impl : ( '(' ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4534:1: ( ( '(' ) )
            // InternalLegoLang.g:4535:1: ( '(' )
            {
            // InternalLegoLang.g:4535:1: ( '(' )
            // InternalLegoLang.g:4536:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:4545:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl rule__Addition__Group__2 ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4549:1: ( rule__Addition__Group__1__Impl rule__Addition__Group__2 )
            // InternalLegoLang.g:4550:2: rule__Addition__Group__1__Impl rule__Addition__Group__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalLegoLang.g:4557:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__LeftAssignment_1 ) ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4561:1: ( ( ( rule__Addition__LeftAssignment_1 ) ) )
            // InternalLegoLang.g:4562:1: ( ( rule__Addition__LeftAssignment_1 ) )
            {
            // InternalLegoLang.g:4562:1: ( ( rule__Addition__LeftAssignment_1 ) )
            // InternalLegoLang.g:4563:2: ( rule__Addition__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getLeftAssignment_1()); 
            }
            // InternalLegoLang.g:4564:2: ( rule__Addition__LeftAssignment_1 )
            // InternalLegoLang.g:4564:3: rule__Addition__LeftAssignment_1
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
    // InternalLegoLang.g:4572:1: rule__Addition__Group__2 : rule__Addition__Group__2__Impl rule__Addition__Group__3 ;
    public final void rule__Addition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4576:1: ( rule__Addition__Group__2__Impl rule__Addition__Group__3 )
            // InternalLegoLang.g:4577:2: rule__Addition__Group__2__Impl rule__Addition__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalLegoLang.g:4584:1: rule__Addition__Group__2__Impl : ( '+' ) ;
    public final void rule__Addition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4588:1: ( ( '+' ) )
            // InternalLegoLang.g:4589:1: ( '+' )
            {
            // InternalLegoLang.g:4589:1: ( '+' )
            // InternalLegoLang.g:4590:2: '+'
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
    // InternalLegoLang.g:4599:1: rule__Addition__Group__3 : rule__Addition__Group__3__Impl rule__Addition__Group__4 ;
    public final void rule__Addition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4603:1: ( rule__Addition__Group__3__Impl rule__Addition__Group__4 )
            // InternalLegoLang.g:4604:2: rule__Addition__Group__3__Impl rule__Addition__Group__4
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
    // InternalLegoLang.g:4611:1: rule__Addition__Group__3__Impl : ( ( rule__Addition__RightAssignment_3 ) ) ;
    public final void rule__Addition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4615:1: ( ( ( rule__Addition__RightAssignment_3 ) ) )
            // InternalLegoLang.g:4616:1: ( ( rule__Addition__RightAssignment_3 ) )
            {
            // InternalLegoLang.g:4616:1: ( ( rule__Addition__RightAssignment_3 ) )
            // InternalLegoLang.g:4617:2: ( rule__Addition__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getRightAssignment_3()); 
            }
            // InternalLegoLang.g:4618:2: ( rule__Addition__RightAssignment_3 )
            // InternalLegoLang.g:4618:3: rule__Addition__RightAssignment_3
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
    // InternalLegoLang.g:4626:1: rule__Addition__Group__4 : rule__Addition__Group__4__Impl ;
    public final void rule__Addition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4630:1: ( rule__Addition__Group__4__Impl )
            // InternalLegoLang.g:4631:2: rule__Addition__Group__4__Impl
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
    // InternalLegoLang.g:4637:1: rule__Addition__Group__4__Impl : ( ')' ) ;
    public final void rule__Addition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4641:1: ( ( ')' ) )
            // InternalLegoLang.g:4642:1: ( ')' )
            {
            // InternalLegoLang.g:4642:1: ( ')' )
            // InternalLegoLang.g:4643:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:4653:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4657:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // InternalLegoLang.g:4658:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalLegoLang.g:4665:1: rule__Multiplication__Group__0__Impl : ( '(' ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4669:1: ( ( '(' ) )
            // InternalLegoLang.g:4670:1: ( '(' )
            {
            // InternalLegoLang.g:4670:1: ( '(' )
            // InternalLegoLang.g:4671:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:4680:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl rule__Multiplication__Group__2 ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4684:1: ( rule__Multiplication__Group__1__Impl rule__Multiplication__Group__2 )
            // InternalLegoLang.g:4685:2: rule__Multiplication__Group__1__Impl rule__Multiplication__Group__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalLegoLang.g:4692:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__LeftAssignment_1 ) ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4696:1: ( ( ( rule__Multiplication__LeftAssignment_1 ) ) )
            // InternalLegoLang.g:4697:1: ( ( rule__Multiplication__LeftAssignment_1 ) )
            {
            // InternalLegoLang.g:4697:1: ( ( rule__Multiplication__LeftAssignment_1 ) )
            // InternalLegoLang.g:4698:2: ( rule__Multiplication__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getLeftAssignment_1()); 
            }
            // InternalLegoLang.g:4699:2: ( rule__Multiplication__LeftAssignment_1 )
            // InternalLegoLang.g:4699:3: rule__Multiplication__LeftAssignment_1
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
    // InternalLegoLang.g:4707:1: rule__Multiplication__Group__2 : rule__Multiplication__Group__2__Impl rule__Multiplication__Group__3 ;
    public final void rule__Multiplication__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4711:1: ( rule__Multiplication__Group__2__Impl rule__Multiplication__Group__3 )
            // InternalLegoLang.g:4712:2: rule__Multiplication__Group__2__Impl rule__Multiplication__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalLegoLang.g:4719:1: rule__Multiplication__Group__2__Impl : ( '*' ) ;
    public final void rule__Multiplication__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4723:1: ( ( '*' ) )
            // InternalLegoLang.g:4724:1: ( '*' )
            {
            // InternalLegoLang.g:4724:1: ( '*' )
            // InternalLegoLang.g:4725:2: '*'
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
    // InternalLegoLang.g:4734:1: rule__Multiplication__Group__3 : rule__Multiplication__Group__3__Impl rule__Multiplication__Group__4 ;
    public final void rule__Multiplication__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4738:1: ( rule__Multiplication__Group__3__Impl rule__Multiplication__Group__4 )
            // InternalLegoLang.g:4739:2: rule__Multiplication__Group__3__Impl rule__Multiplication__Group__4
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
    // InternalLegoLang.g:4746:1: rule__Multiplication__Group__3__Impl : ( ( rule__Multiplication__RightAssignment_3 ) ) ;
    public final void rule__Multiplication__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4750:1: ( ( ( rule__Multiplication__RightAssignment_3 ) ) )
            // InternalLegoLang.g:4751:1: ( ( rule__Multiplication__RightAssignment_3 ) )
            {
            // InternalLegoLang.g:4751:1: ( ( rule__Multiplication__RightAssignment_3 ) )
            // InternalLegoLang.g:4752:2: ( rule__Multiplication__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getRightAssignment_3()); 
            }
            // InternalLegoLang.g:4753:2: ( rule__Multiplication__RightAssignment_3 )
            // InternalLegoLang.g:4753:3: rule__Multiplication__RightAssignment_3
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
    // InternalLegoLang.g:4761:1: rule__Multiplication__Group__4 : rule__Multiplication__Group__4__Impl ;
    public final void rule__Multiplication__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4765:1: ( rule__Multiplication__Group__4__Impl )
            // InternalLegoLang.g:4766:2: rule__Multiplication__Group__4__Impl
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
    // InternalLegoLang.g:4772:1: rule__Multiplication__Group__4__Impl : ( ')' ) ;
    public final void rule__Multiplication__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4776:1: ( ( ')' ) )
            // InternalLegoLang.g:4777:1: ( ')' )
            {
            // InternalLegoLang.g:4777:1: ( ')' )
            // InternalLegoLang.g:4778:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:4788:1: rule__Division__Group__0 : rule__Division__Group__0__Impl rule__Division__Group__1 ;
    public final void rule__Division__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4792:1: ( rule__Division__Group__0__Impl rule__Division__Group__1 )
            // InternalLegoLang.g:4793:2: rule__Division__Group__0__Impl rule__Division__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalLegoLang.g:4800:1: rule__Division__Group__0__Impl : ( '(' ) ;
    public final void rule__Division__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4804:1: ( ( '(' ) )
            // InternalLegoLang.g:4805:1: ( '(' )
            {
            // InternalLegoLang.g:4805:1: ( '(' )
            // InternalLegoLang.g:4806:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivisionAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:4815:1: rule__Division__Group__1 : rule__Division__Group__1__Impl rule__Division__Group__2 ;
    public final void rule__Division__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4819:1: ( rule__Division__Group__1__Impl rule__Division__Group__2 )
            // InternalLegoLang.g:4820:2: rule__Division__Group__1__Impl rule__Division__Group__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalLegoLang.g:4827:1: rule__Division__Group__1__Impl : ( ( rule__Division__LeftAssignment_1 ) ) ;
    public final void rule__Division__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4831:1: ( ( ( rule__Division__LeftAssignment_1 ) ) )
            // InternalLegoLang.g:4832:1: ( ( rule__Division__LeftAssignment_1 ) )
            {
            // InternalLegoLang.g:4832:1: ( ( rule__Division__LeftAssignment_1 ) )
            // InternalLegoLang.g:4833:2: ( rule__Division__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivisionAccess().getLeftAssignment_1()); 
            }
            // InternalLegoLang.g:4834:2: ( rule__Division__LeftAssignment_1 )
            // InternalLegoLang.g:4834:3: rule__Division__LeftAssignment_1
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
    // InternalLegoLang.g:4842:1: rule__Division__Group__2 : rule__Division__Group__2__Impl rule__Division__Group__3 ;
    public final void rule__Division__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4846:1: ( rule__Division__Group__2__Impl rule__Division__Group__3 )
            // InternalLegoLang.g:4847:2: rule__Division__Group__2__Impl rule__Division__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalLegoLang.g:4854:1: rule__Division__Group__2__Impl : ( '/' ) ;
    public final void rule__Division__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4858:1: ( ( '/' ) )
            // InternalLegoLang.g:4859:1: ( '/' )
            {
            // InternalLegoLang.g:4859:1: ( '/' )
            // InternalLegoLang.g:4860:2: '/'
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
    // InternalLegoLang.g:4869:1: rule__Division__Group__3 : rule__Division__Group__3__Impl rule__Division__Group__4 ;
    public final void rule__Division__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4873:1: ( rule__Division__Group__3__Impl rule__Division__Group__4 )
            // InternalLegoLang.g:4874:2: rule__Division__Group__3__Impl rule__Division__Group__4
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
    // InternalLegoLang.g:4881:1: rule__Division__Group__3__Impl : ( ( rule__Division__RightAssignment_3 ) ) ;
    public final void rule__Division__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4885:1: ( ( ( rule__Division__RightAssignment_3 ) ) )
            // InternalLegoLang.g:4886:1: ( ( rule__Division__RightAssignment_3 ) )
            {
            // InternalLegoLang.g:4886:1: ( ( rule__Division__RightAssignment_3 ) )
            // InternalLegoLang.g:4887:2: ( rule__Division__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivisionAccess().getRightAssignment_3()); 
            }
            // InternalLegoLang.g:4888:2: ( rule__Division__RightAssignment_3 )
            // InternalLegoLang.g:4888:3: rule__Division__RightAssignment_3
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
    // InternalLegoLang.g:4896:1: rule__Division__Group__4 : rule__Division__Group__4__Impl ;
    public final void rule__Division__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4900:1: ( rule__Division__Group__4__Impl )
            // InternalLegoLang.g:4901:2: rule__Division__Group__4__Impl
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
    // InternalLegoLang.g:4907:1: rule__Division__Group__4__Impl : ( ')' ) ;
    public final void rule__Division__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4911:1: ( ( ')' ) )
            // InternalLegoLang.g:4912:1: ( ')' )
            {
            // InternalLegoLang.g:4912:1: ( ')' )
            // InternalLegoLang.g:4913:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivisionAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:4923:1: rule__GT__Group__0 : rule__GT__Group__0__Impl rule__GT__Group__1 ;
    public final void rule__GT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4927:1: ( rule__GT__Group__0__Impl rule__GT__Group__1 )
            // InternalLegoLang.g:4928:2: rule__GT__Group__0__Impl rule__GT__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalLegoLang.g:4935:1: rule__GT__Group__0__Impl : ( '(' ) ;
    public final void rule__GT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4939:1: ( ( '(' ) )
            // InternalLegoLang.g:4940:1: ( '(' )
            {
            // InternalLegoLang.g:4940:1: ( '(' )
            // InternalLegoLang.g:4941:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:4950:1: rule__GT__Group__1 : rule__GT__Group__1__Impl rule__GT__Group__2 ;
    public final void rule__GT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4954:1: ( rule__GT__Group__1__Impl rule__GT__Group__2 )
            // InternalLegoLang.g:4955:2: rule__GT__Group__1__Impl rule__GT__Group__2
            {
            pushFollow(FOLLOW_38);
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
    // InternalLegoLang.g:4962:1: rule__GT__Group__1__Impl : ( ( rule__GT__LeftAssignment_1 ) ) ;
    public final void rule__GT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4966:1: ( ( ( rule__GT__LeftAssignment_1 ) ) )
            // InternalLegoLang.g:4967:1: ( ( rule__GT__LeftAssignment_1 ) )
            {
            // InternalLegoLang.g:4967:1: ( ( rule__GT__LeftAssignment_1 ) )
            // InternalLegoLang.g:4968:2: ( rule__GT__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTAccess().getLeftAssignment_1()); 
            }
            // InternalLegoLang.g:4969:2: ( rule__GT__LeftAssignment_1 )
            // InternalLegoLang.g:4969:3: rule__GT__LeftAssignment_1
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
    // InternalLegoLang.g:4977:1: rule__GT__Group__2 : rule__GT__Group__2__Impl rule__GT__Group__3 ;
    public final void rule__GT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4981:1: ( rule__GT__Group__2__Impl rule__GT__Group__3 )
            // InternalLegoLang.g:4982:2: rule__GT__Group__2__Impl rule__GT__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalLegoLang.g:4989:1: rule__GT__Group__2__Impl : ( '>' ) ;
    public final void rule__GT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:4993:1: ( ( '>' ) )
            // InternalLegoLang.g:4994:1: ( '>' )
            {
            // InternalLegoLang.g:4994:1: ( '>' )
            // InternalLegoLang.g:4995:2: '>'
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
    // InternalLegoLang.g:5004:1: rule__GT__Group__3 : rule__GT__Group__3__Impl rule__GT__Group__4 ;
    public final void rule__GT__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5008:1: ( rule__GT__Group__3__Impl rule__GT__Group__4 )
            // InternalLegoLang.g:5009:2: rule__GT__Group__3__Impl rule__GT__Group__4
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
    // InternalLegoLang.g:5016:1: rule__GT__Group__3__Impl : ( ( rule__GT__RightAssignment_3 ) ) ;
    public final void rule__GT__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5020:1: ( ( ( rule__GT__RightAssignment_3 ) ) )
            // InternalLegoLang.g:5021:1: ( ( rule__GT__RightAssignment_3 ) )
            {
            // InternalLegoLang.g:5021:1: ( ( rule__GT__RightAssignment_3 ) )
            // InternalLegoLang.g:5022:2: ( rule__GT__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTAccess().getRightAssignment_3()); 
            }
            // InternalLegoLang.g:5023:2: ( rule__GT__RightAssignment_3 )
            // InternalLegoLang.g:5023:3: rule__GT__RightAssignment_3
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
    // InternalLegoLang.g:5031:1: rule__GT__Group__4 : rule__GT__Group__4__Impl ;
    public final void rule__GT__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5035:1: ( rule__GT__Group__4__Impl )
            // InternalLegoLang.g:5036:2: rule__GT__Group__4__Impl
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
    // InternalLegoLang.g:5042:1: rule__GT__Group__4__Impl : ( ')' ) ;
    public final void rule__GT__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5046:1: ( ( ')' ) )
            // InternalLegoLang.g:5047:1: ( ')' )
            {
            // InternalLegoLang.g:5047:1: ( ')' )
            // InternalLegoLang.g:5048:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:5058:1: rule__LT__Group__0 : rule__LT__Group__0__Impl rule__LT__Group__1 ;
    public final void rule__LT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5062:1: ( rule__LT__Group__0__Impl rule__LT__Group__1 )
            // InternalLegoLang.g:5063:2: rule__LT__Group__0__Impl rule__LT__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalLegoLang.g:5070:1: rule__LT__Group__0__Impl : ( '(' ) ;
    public final void rule__LT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5074:1: ( ( '(' ) )
            // InternalLegoLang.g:5075:1: ( '(' )
            {
            // InternalLegoLang.g:5075:1: ( '(' )
            // InternalLegoLang.g:5076:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:5085:1: rule__LT__Group__1 : rule__LT__Group__1__Impl rule__LT__Group__2 ;
    public final void rule__LT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5089:1: ( rule__LT__Group__1__Impl rule__LT__Group__2 )
            // InternalLegoLang.g:5090:2: rule__LT__Group__1__Impl rule__LT__Group__2
            {
            pushFollow(FOLLOW_39);
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
    // InternalLegoLang.g:5097:1: rule__LT__Group__1__Impl : ( ( rule__LT__LeftAssignment_1 ) ) ;
    public final void rule__LT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5101:1: ( ( ( rule__LT__LeftAssignment_1 ) ) )
            // InternalLegoLang.g:5102:1: ( ( rule__LT__LeftAssignment_1 ) )
            {
            // InternalLegoLang.g:5102:1: ( ( rule__LT__LeftAssignment_1 ) )
            // InternalLegoLang.g:5103:2: ( rule__LT__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTAccess().getLeftAssignment_1()); 
            }
            // InternalLegoLang.g:5104:2: ( rule__LT__LeftAssignment_1 )
            // InternalLegoLang.g:5104:3: rule__LT__LeftAssignment_1
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
    // InternalLegoLang.g:5112:1: rule__LT__Group__2 : rule__LT__Group__2__Impl rule__LT__Group__3 ;
    public final void rule__LT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5116:1: ( rule__LT__Group__2__Impl rule__LT__Group__3 )
            // InternalLegoLang.g:5117:2: rule__LT__Group__2__Impl rule__LT__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalLegoLang.g:5124:1: rule__LT__Group__2__Impl : ( '<' ) ;
    public final void rule__LT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5128:1: ( ( '<' ) )
            // InternalLegoLang.g:5129:1: ( '<' )
            {
            // InternalLegoLang.g:5129:1: ( '<' )
            // InternalLegoLang.g:5130:2: '<'
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
    // InternalLegoLang.g:5139:1: rule__LT__Group__3 : rule__LT__Group__3__Impl rule__LT__Group__4 ;
    public final void rule__LT__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5143:1: ( rule__LT__Group__3__Impl rule__LT__Group__4 )
            // InternalLegoLang.g:5144:2: rule__LT__Group__3__Impl rule__LT__Group__4
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
    // InternalLegoLang.g:5151:1: rule__LT__Group__3__Impl : ( ( rule__LT__RightAssignment_3 ) ) ;
    public final void rule__LT__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5155:1: ( ( ( rule__LT__RightAssignment_3 ) ) )
            // InternalLegoLang.g:5156:1: ( ( rule__LT__RightAssignment_3 ) )
            {
            // InternalLegoLang.g:5156:1: ( ( rule__LT__RightAssignment_3 ) )
            // InternalLegoLang.g:5157:2: ( rule__LT__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTAccess().getRightAssignment_3()); 
            }
            // InternalLegoLang.g:5158:2: ( rule__LT__RightAssignment_3 )
            // InternalLegoLang.g:5158:3: rule__LT__RightAssignment_3
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
    // InternalLegoLang.g:5166:1: rule__LT__Group__4 : rule__LT__Group__4__Impl ;
    public final void rule__LT__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5170:1: ( rule__LT__Group__4__Impl )
            // InternalLegoLang.g:5171:2: rule__LT__Group__4__Impl
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
    // InternalLegoLang.g:5177:1: rule__LT__Group__4__Impl : ( ')' ) ;
    public final void rule__LT__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5181:1: ( ( ')' ) )
            // InternalLegoLang.g:5182:1: ( ')' )
            {
            // InternalLegoLang.g:5182:1: ( ')' )
            // InternalLegoLang.g:5183:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:5193:1: rule__Equal__Group__0 : rule__Equal__Group__0__Impl rule__Equal__Group__1 ;
    public final void rule__Equal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5197:1: ( rule__Equal__Group__0__Impl rule__Equal__Group__1 )
            // InternalLegoLang.g:5198:2: rule__Equal__Group__0__Impl rule__Equal__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalLegoLang.g:5205:1: rule__Equal__Group__0__Impl : ( '(' ) ;
    public final void rule__Equal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5209:1: ( ( '(' ) )
            // InternalLegoLang.g:5210:1: ( '(' )
            {
            // InternalLegoLang.g:5210:1: ( '(' )
            // InternalLegoLang.g:5211:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:5220:1: rule__Equal__Group__1 : rule__Equal__Group__1__Impl rule__Equal__Group__2 ;
    public final void rule__Equal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5224:1: ( rule__Equal__Group__1__Impl rule__Equal__Group__2 )
            // InternalLegoLang.g:5225:2: rule__Equal__Group__1__Impl rule__Equal__Group__2
            {
            pushFollow(FOLLOW_40);
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
    // InternalLegoLang.g:5232:1: rule__Equal__Group__1__Impl : ( ( rule__Equal__LeftAssignment_1 ) ) ;
    public final void rule__Equal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5236:1: ( ( ( rule__Equal__LeftAssignment_1 ) ) )
            // InternalLegoLang.g:5237:1: ( ( rule__Equal__LeftAssignment_1 ) )
            {
            // InternalLegoLang.g:5237:1: ( ( rule__Equal__LeftAssignment_1 ) )
            // InternalLegoLang.g:5238:2: ( rule__Equal__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualAccess().getLeftAssignment_1()); 
            }
            // InternalLegoLang.g:5239:2: ( rule__Equal__LeftAssignment_1 )
            // InternalLegoLang.g:5239:3: rule__Equal__LeftAssignment_1
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
    // InternalLegoLang.g:5247:1: rule__Equal__Group__2 : rule__Equal__Group__2__Impl rule__Equal__Group__3 ;
    public final void rule__Equal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5251:1: ( rule__Equal__Group__2__Impl rule__Equal__Group__3 )
            // InternalLegoLang.g:5252:2: rule__Equal__Group__2__Impl rule__Equal__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalLegoLang.g:5259:1: rule__Equal__Group__2__Impl : ( '==' ) ;
    public final void rule__Equal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5263:1: ( ( '==' ) )
            // InternalLegoLang.g:5264:1: ( '==' )
            {
            // InternalLegoLang.g:5264:1: ( '==' )
            // InternalLegoLang.g:5265:2: '=='
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
    // InternalLegoLang.g:5274:1: rule__Equal__Group__3 : rule__Equal__Group__3__Impl rule__Equal__Group__4 ;
    public final void rule__Equal__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5278:1: ( rule__Equal__Group__3__Impl rule__Equal__Group__4 )
            // InternalLegoLang.g:5279:2: rule__Equal__Group__3__Impl rule__Equal__Group__4
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
    // InternalLegoLang.g:5286:1: rule__Equal__Group__3__Impl : ( ( rule__Equal__RightAssignment_3 ) ) ;
    public final void rule__Equal__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5290:1: ( ( ( rule__Equal__RightAssignment_3 ) ) )
            // InternalLegoLang.g:5291:1: ( ( rule__Equal__RightAssignment_3 ) )
            {
            // InternalLegoLang.g:5291:1: ( ( rule__Equal__RightAssignment_3 ) )
            // InternalLegoLang.g:5292:2: ( rule__Equal__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualAccess().getRightAssignment_3()); 
            }
            // InternalLegoLang.g:5293:2: ( rule__Equal__RightAssignment_3 )
            // InternalLegoLang.g:5293:3: rule__Equal__RightAssignment_3
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
    // InternalLegoLang.g:5301:1: rule__Equal__Group__4 : rule__Equal__Group__4__Impl ;
    public final void rule__Equal__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5305:1: ( rule__Equal__Group__4__Impl )
            // InternalLegoLang.g:5306:2: rule__Equal__Group__4__Impl
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
    // InternalLegoLang.g:5312:1: rule__Equal__Group__4__Impl : ( ')' ) ;
    public final void rule__Equal__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5316:1: ( ( ')' ) )
            // InternalLegoLang.g:5317:1: ( ')' )
            {
            // InternalLegoLang.g:5317:1: ( ')' )
            // InternalLegoLang.g:5318:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:5328:1: rule__Different__Group__0 : rule__Different__Group__0__Impl rule__Different__Group__1 ;
    public final void rule__Different__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5332:1: ( rule__Different__Group__0__Impl rule__Different__Group__1 )
            // InternalLegoLang.g:5333:2: rule__Different__Group__0__Impl rule__Different__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalLegoLang.g:5340:1: rule__Different__Group__0__Impl : ( '(' ) ;
    public final void rule__Different__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5344:1: ( ( '(' ) )
            // InternalLegoLang.g:5345:1: ( '(' )
            {
            // InternalLegoLang.g:5345:1: ( '(' )
            // InternalLegoLang.g:5346:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDifferentAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:5355:1: rule__Different__Group__1 : rule__Different__Group__1__Impl rule__Different__Group__2 ;
    public final void rule__Different__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5359:1: ( rule__Different__Group__1__Impl rule__Different__Group__2 )
            // InternalLegoLang.g:5360:2: rule__Different__Group__1__Impl rule__Different__Group__2
            {
            pushFollow(FOLLOW_41);
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
    // InternalLegoLang.g:5367:1: rule__Different__Group__1__Impl : ( ( rule__Different__LeftAssignment_1 ) ) ;
    public final void rule__Different__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5371:1: ( ( ( rule__Different__LeftAssignment_1 ) ) )
            // InternalLegoLang.g:5372:1: ( ( rule__Different__LeftAssignment_1 ) )
            {
            // InternalLegoLang.g:5372:1: ( ( rule__Different__LeftAssignment_1 ) )
            // InternalLegoLang.g:5373:2: ( rule__Different__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDifferentAccess().getLeftAssignment_1()); 
            }
            // InternalLegoLang.g:5374:2: ( rule__Different__LeftAssignment_1 )
            // InternalLegoLang.g:5374:3: rule__Different__LeftAssignment_1
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
    // InternalLegoLang.g:5382:1: rule__Different__Group__2 : rule__Different__Group__2__Impl rule__Different__Group__3 ;
    public final void rule__Different__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5386:1: ( rule__Different__Group__2__Impl rule__Different__Group__3 )
            // InternalLegoLang.g:5387:2: rule__Different__Group__2__Impl rule__Different__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalLegoLang.g:5394:1: rule__Different__Group__2__Impl : ( '!=' ) ;
    public final void rule__Different__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5398:1: ( ( '!=' ) )
            // InternalLegoLang.g:5399:1: ( '!=' )
            {
            // InternalLegoLang.g:5399:1: ( '!=' )
            // InternalLegoLang.g:5400:2: '!='
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
    // InternalLegoLang.g:5409:1: rule__Different__Group__3 : rule__Different__Group__3__Impl rule__Different__Group__4 ;
    public final void rule__Different__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5413:1: ( rule__Different__Group__3__Impl rule__Different__Group__4 )
            // InternalLegoLang.g:5414:2: rule__Different__Group__3__Impl rule__Different__Group__4
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
    // InternalLegoLang.g:5421:1: rule__Different__Group__3__Impl : ( ( rule__Different__RightAssignment_3 ) ) ;
    public final void rule__Different__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5425:1: ( ( ( rule__Different__RightAssignment_3 ) ) )
            // InternalLegoLang.g:5426:1: ( ( rule__Different__RightAssignment_3 ) )
            {
            // InternalLegoLang.g:5426:1: ( ( rule__Different__RightAssignment_3 ) )
            // InternalLegoLang.g:5427:2: ( rule__Different__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDifferentAccess().getRightAssignment_3()); 
            }
            // InternalLegoLang.g:5428:2: ( rule__Different__RightAssignment_3 )
            // InternalLegoLang.g:5428:3: rule__Different__RightAssignment_3
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
    // InternalLegoLang.g:5436:1: rule__Different__Group__4 : rule__Different__Group__4__Impl ;
    public final void rule__Different__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5440:1: ( rule__Different__Group__4__Impl )
            // InternalLegoLang.g:5441:2: rule__Different__Group__4__Impl
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
    // InternalLegoLang.g:5447:1: rule__Different__Group__4__Impl : ( ')' ) ;
    public final void rule__Different__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5451:1: ( ( ')' ) )
            // InternalLegoLang.g:5452:1: ( ')' )
            {
            // InternalLegoLang.g:5452:1: ( ')' )
            // InternalLegoLang.g:5453:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDifferentAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:5463:1: rule__LTorEqual__Group__0 : rule__LTorEqual__Group__0__Impl rule__LTorEqual__Group__1 ;
    public final void rule__LTorEqual__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5467:1: ( rule__LTorEqual__Group__0__Impl rule__LTorEqual__Group__1 )
            // InternalLegoLang.g:5468:2: rule__LTorEqual__Group__0__Impl rule__LTorEqual__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalLegoLang.g:5475:1: rule__LTorEqual__Group__0__Impl : ( '(' ) ;
    public final void rule__LTorEqual__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5479:1: ( ( '(' ) )
            // InternalLegoLang.g:5480:1: ( '(' )
            {
            // InternalLegoLang.g:5480:1: ( '(' )
            // InternalLegoLang.g:5481:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTorEqualAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:5490:1: rule__LTorEqual__Group__1 : rule__LTorEqual__Group__1__Impl rule__LTorEqual__Group__2 ;
    public final void rule__LTorEqual__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5494:1: ( rule__LTorEqual__Group__1__Impl rule__LTorEqual__Group__2 )
            // InternalLegoLang.g:5495:2: rule__LTorEqual__Group__1__Impl rule__LTorEqual__Group__2
            {
            pushFollow(FOLLOW_42);
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
    // InternalLegoLang.g:5502:1: rule__LTorEqual__Group__1__Impl : ( ( rule__LTorEqual__LeftAssignment_1 ) ) ;
    public final void rule__LTorEqual__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5506:1: ( ( ( rule__LTorEqual__LeftAssignment_1 ) ) )
            // InternalLegoLang.g:5507:1: ( ( rule__LTorEqual__LeftAssignment_1 ) )
            {
            // InternalLegoLang.g:5507:1: ( ( rule__LTorEqual__LeftAssignment_1 ) )
            // InternalLegoLang.g:5508:2: ( rule__LTorEqual__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTorEqualAccess().getLeftAssignment_1()); 
            }
            // InternalLegoLang.g:5509:2: ( rule__LTorEqual__LeftAssignment_1 )
            // InternalLegoLang.g:5509:3: rule__LTorEqual__LeftAssignment_1
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
    // InternalLegoLang.g:5517:1: rule__LTorEqual__Group__2 : rule__LTorEqual__Group__2__Impl rule__LTorEqual__Group__3 ;
    public final void rule__LTorEqual__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5521:1: ( rule__LTorEqual__Group__2__Impl rule__LTorEqual__Group__3 )
            // InternalLegoLang.g:5522:2: rule__LTorEqual__Group__2__Impl rule__LTorEqual__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalLegoLang.g:5529:1: rule__LTorEqual__Group__2__Impl : ( '<=' ) ;
    public final void rule__LTorEqual__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5533:1: ( ( '<=' ) )
            // InternalLegoLang.g:5534:1: ( '<=' )
            {
            // InternalLegoLang.g:5534:1: ( '<=' )
            // InternalLegoLang.g:5535:2: '<='
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
    // InternalLegoLang.g:5544:1: rule__LTorEqual__Group__3 : rule__LTorEqual__Group__3__Impl rule__LTorEqual__Group__4 ;
    public final void rule__LTorEqual__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5548:1: ( rule__LTorEqual__Group__3__Impl rule__LTorEqual__Group__4 )
            // InternalLegoLang.g:5549:2: rule__LTorEqual__Group__3__Impl rule__LTorEqual__Group__4
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
    // InternalLegoLang.g:5556:1: rule__LTorEqual__Group__3__Impl : ( ( rule__LTorEqual__RightAssignment_3 ) ) ;
    public final void rule__LTorEqual__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5560:1: ( ( ( rule__LTorEqual__RightAssignment_3 ) ) )
            // InternalLegoLang.g:5561:1: ( ( rule__LTorEqual__RightAssignment_3 ) )
            {
            // InternalLegoLang.g:5561:1: ( ( rule__LTorEqual__RightAssignment_3 ) )
            // InternalLegoLang.g:5562:2: ( rule__LTorEqual__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTorEqualAccess().getRightAssignment_3()); 
            }
            // InternalLegoLang.g:5563:2: ( rule__LTorEqual__RightAssignment_3 )
            // InternalLegoLang.g:5563:3: rule__LTorEqual__RightAssignment_3
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
    // InternalLegoLang.g:5571:1: rule__LTorEqual__Group__4 : rule__LTorEqual__Group__4__Impl ;
    public final void rule__LTorEqual__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5575:1: ( rule__LTorEqual__Group__4__Impl )
            // InternalLegoLang.g:5576:2: rule__LTorEqual__Group__4__Impl
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
    // InternalLegoLang.g:5582:1: rule__LTorEqual__Group__4__Impl : ( ')' ) ;
    public final void rule__LTorEqual__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5586:1: ( ( ')' ) )
            // InternalLegoLang.g:5587:1: ( ')' )
            {
            // InternalLegoLang.g:5587:1: ( ')' )
            // InternalLegoLang.g:5588:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTorEqualAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:5598:1: rule__GTorEqual__Group__0 : rule__GTorEqual__Group__0__Impl rule__GTorEqual__Group__1 ;
    public final void rule__GTorEqual__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5602:1: ( rule__GTorEqual__Group__0__Impl rule__GTorEqual__Group__1 )
            // InternalLegoLang.g:5603:2: rule__GTorEqual__Group__0__Impl rule__GTorEqual__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalLegoLang.g:5610:1: rule__GTorEqual__Group__0__Impl : ( '(' ) ;
    public final void rule__GTorEqual__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5614:1: ( ( '(' ) )
            // InternalLegoLang.g:5615:1: ( '(' )
            {
            // InternalLegoLang.g:5615:1: ( '(' )
            // InternalLegoLang.g:5616:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTorEqualAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:5625:1: rule__GTorEqual__Group__1 : rule__GTorEqual__Group__1__Impl rule__GTorEqual__Group__2 ;
    public final void rule__GTorEqual__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5629:1: ( rule__GTorEqual__Group__1__Impl rule__GTorEqual__Group__2 )
            // InternalLegoLang.g:5630:2: rule__GTorEqual__Group__1__Impl rule__GTorEqual__Group__2
            {
            pushFollow(FOLLOW_43);
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
    // InternalLegoLang.g:5637:1: rule__GTorEqual__Group__1__Impl : ( ( rule__GTorEqual__LeftAssignment_1 ) ) ;
    public final void rule__GTorEqual__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5641:1: ( ( ( rule__GTorEqual__LeftAssignment_1 ) ) )
            // InternalLegoLang.g:5642:1: ( ( rule__GTorEqual__LeftAssignment_1 ) )
            {
            // InternalLegoLang.g:5642:1: ( ( rule__GTorEqual__LeftAssignment_1 ) )
            // InternalLegoLang.g:5643:2: ( rule__GTorEqual__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTorEqualAccess().getLeftAssignment_1()); 
            }
            // InternalLegoLang.g:5644:2: ( rule__GTorEqual__LeftAssignment_1 )
            // InternalLegoLang.g:5644:3: rule__GTorEqual__LeftAssignment_1
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
    // InternalLegoLang.g:5652:1: rule__GTorEqual__Group__2 : rule__GTorEqual__Group__2__Impl rule__GTorEqual__Group__3 ;
    public final void rule__GTorEqual__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5656:1: ( rule__GTorEqual__Group__2__Impl rule__GTorEqual__Group__3 )
            // InternalLegoLang.g:5657:2: rule__GTorEqual__Group__2__Impl rule__GTorEqual__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalLegoLang.g:5664:1: rule__GTorEqual__Group__2__Impl : ( '>=' ) ;
    public final void rule__GTorEqual__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5668:1: ( ( '>=' ) )
            // InternalLegoLang.g:5669:1: ( '>=' )
            {
            // InternalLegoLang.g:5669:1: ( '>=' )
            // InternalLegoLang.g:5670:2: '>='
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
    // InternalLegoLang.g:5679:1: rule__GTorEqual__Group__3 : rule__GTorEqual__Group__3__Impl rule__GTorEqual__Group__4 ;
    public final void rule__GTorEqual__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5683:1: ( rule__GTorEqual__Group__3__Impl rule__GTorEqual__Group__4 )
            // InternalLegoLang.g:5684:2: rule__GTorEqual__Group__3__Impl rule__GTorEqual__Group__4
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
    // InternalLegoLang.g:5691:1: rule__GTorEqual__Group__3__Impl : ( ( rule__GTorEqual__RightAssignment_3 ) ) ;
    public final void rule__GTorEqual__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5695:1: ( ( ( rule__GTorEqual__RightAssignment_3 ) ) )
            // InternalLegoLang.g:5696:1: ( ( rule__GTorEqual__RightAssignment_3 ) )
            {
            // InternalLegoLang.g:5696:1: ( ( rule__GTorEqual__RightAssignment_3 ) )
            // InternalLegoLang.g:5697:2: ( rule__GTorEqual__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTorEqualAccess().getRightAssignment_3()); 
            }
            // InternalLegoLang.g:5698:2: ( rule__GTorEqual__RightAssignment_3 )
            // InternalLegoLang.g:5698:3: rule__GTorEqual__RightAssignment_3
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
    // InternalLegoLang.g:5706:1: rule__GTorEqual__Group__4 : rule__GTorEqual__Group__4__Impl ;
    public final void rule__GTorEqual__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5710:1: ( rule__GTorEqual__Group__4__Impl )
            // InternalLegoLang.g:5711:2: rule__GTorEqual__Group__4__Impl
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
    // InternalLegoLang.g:5717:1: rule__GTorEqual__Group__4__Impl : ( ')' ) ;
    public final void rule__GTorEqual__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5721:1: ( ( ')' ) )
            // InternalLegoLang.g:5722:1: ( ')' )
            {
            // InternalLegoLang.g:5722:1: ( ')' )
            // InternalLegoLang.g:5723:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGTorEqualAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:5733:1: rule__Assignement__Group__0 : rule__Assignement__Group__0__Impl rule__Assignement__Group__1 ;
    public final void rule__Assignement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5737:1: ( rule__Assignement__Group__0__Impl rule__Assignement__Group__1 )
            // InternalLegoLang.g:5738:2: rule__Assignement__Group__0__Impl rule__Assignement__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalLegoLang.g:5745:1: rule__Assignement__Group__0__Impl : ( () ) ;
    public final void rule__Assignement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5749:1: ( ( () ) )
            // InternalLegoLang.g:5750:1: ( () )
            {
            // InternalLegoLang.g:5750:1: ( () )
            // InternalLegoLang.g:5751:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignementAccess().getAssignementAction_0()); 
            }
            // InternalLegoLang.g:5752:2: ()
            // InternalLegoLang.g:5752:3: 
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
    // InternalLegoLang.g:5760:1: rule__Assignement__Group__1 : rule__Assignement__Group__1__Impl rule__Assignement__Group__2 ;
    public final void rule__Assignement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5764:1: ( rule__Assignement__Group__1__Impl rule__Assignement__Group__2 )
            // InternalLegoLang.g:5765:2: rule__Assignement__Group__1__Impl rule__Assignement__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalLegoLang.g:5772:1: rule__Assignement__Group__1__Impl : ( '(' ) ;
    public final void rule__Assignement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5776:1: ( ( '(' ) )
            // InternalLegoLang.g:5777:1: ( '(' )
            {
            // InternalLegoLang.g:5777:1: ( '(' )
            // InternalLegoLang.g:5778:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignementAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:5787:1: rule__Assignement__Group__2 : rule__Assignement__Group__2__Impl rule__Assignement__Group__3 ;
    public final void rule__Assignement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5791:1: ( rule__Assignement__Group__2__Impl rule__Assignement__Group__3 )
            // InternalLegoLang.g:5792:2: rule__Assignement__Group__2__Impl rule__Assignement__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalLegoLang.g:5799:1: rule__Assignement__Group__2__Impl : ( ( rule__Assignement__LeftAssignment_2 ) ) ;
    public final void rule__Assignement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5803:1: ( ( ( rule__Assignement__LeftAssignment_2 ) ) )
            // InternalLegoLang.g:5804:1: ( ( rule__Assignement__LeftAssignment_2 ) )
            {
            // InternalLegoLang.g:5804:1: ( ( rule__Assignement__LeftAssignment_2 ) )
            // InternalLegoLang.g:5805:2: ( rule__Assignement__LeftAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignementAccess().getLeftAssignment_2()); 
            }
            // InternalLegoLang.g:5806:2: ( rule__Assignement__LeftAssignment_2 )
            // InternalLegoLang.g:5806:3: rule__Assignement__LeftAssignment_2
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
    // InternalLegoLang.g:5814:1: rule__Assignement__Group__3 : rule__Assignement__Group__3__Impl rule__Assignement__Group__4 ;
    public final void rule__Assignement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5818:1: ( rule__Assignement__Group__3__Impl rule__Assignement__Group__4 )
            // InternalLegoLang.g:5819:2: rule__Assignement__Group__3__Impl rule__Assignement__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalLegoLang.g:5826:1: rule__Assignement__Group__3__Impl : ( '=' ) ;
    public final void rule__Assignement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5830:1: ( ( '=' ) )
            // InternalLegoLang.g:5831:1: ( '=' )
            {
            // InternalLegoLang.g:5831:1: ( '=' )
            // InternalLegoLang.g:5832:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignementAccess().getEqualsSignKeyword_3()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:5841:1: rule__Assignement__Group__4 : rule__Assignement__Group__4__Impl rule__Assignement__Group__5 ;
    public final void rule__Assignement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5845:1: ( rule__Assignement__Group__4__Impl rule__Assignement__Group__5 )
            // InternalLegoLang.g:5846:2: rule__Assignement__Group__4__Impl rule__Assignement__Group__5
            {
            pushFollow(FOLLOW_31);
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
    // InternalLegoLang.g:5853:1: rule__Assignement__Group__4__Impl : ( ( rule__Assignement__RightAssignment_4 ) ) ;
    public final void rule__Assignement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5857:1: ( ( ( rule__Assignement__RightAssignment_4 ) ) )
            // InternalLegoLang.g:5858:1: ( ( rule__Assignement__RightAssignment_4 ) )
            {
            // InternalLegoLang.g:5858:1: ( ( rule__Assignement__RightAssignment_4 ) )
            // InternalLegoLang.g:5859:2: ( rule__Assignement__RightAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignementAccess().getRightAssignment_4()); 
            }
            // InternalLegoLang.g:5860:2: ( rule__Assignement__RightAssignment_4 )
            // InternalLegoLang.g:5860:3: rule__Assignement__RightAssignment_4
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
    // InternalLegoLang.g:5868:1: rule__Assignement__Group__5 : rule__Assignement__Group__5__Impl ;
    public final void rule__Assignement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5872:1: ( rule__Assignement__Group__5__Impl )
            // InternalLegoLang.g:5873:2: rule__Assignement__Group__5__Impl
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
    // InternalLegoLang.g:5879:1: rule__Assignement__Group__5__Impl : ( ');' ) ;
    public final void rule__Assignement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5883:1: ( ( ');' ) )
            // InternalLegoLang.g:5884:1: ( ');' )
            {
            // InternalLegoLang.g:5884:1: ( ');' )
            // InternalLegoLang.g:5885:2: ');'
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
    // InternalLegoLang.g:5895:1: rule__PlusEqual__Group__0 : rule__PlusEqual__Group__0__Impl rule__PlusEqual__Group__1 ;
    public final void rule__PlusEqual__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5899:1: ( rule__PlusEqual__Group__0__Impl rule__PlusEqual__Group__1 )
            // InternalLegoLang.g:5900:2: rule__PlusEqual__Group__0__Impl rule__PlusEqual__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalLegoLang.g:5907:1: rule__PlusEqual__Group__0__Impl : ( () ) ;
    public final void rule__PlusEqual__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5911:1: ( ( () ) )
            // InternalLegoLang.g:5912:1: ( () )
            {
            // InternalLegoLang.g:5912:1: ( () )
            // InternalLegoLang.g:5913:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusEqualAccess().getPlusEqualAction_0()); 
            }
            // InternalLegoLang.g:5914:2: ()
            // InternalLegoLang.g:5914:3: 
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
    // InternalLegoLang.g:5922:1: rule__PlusEqual__Group__1 : rule__PlusEqual__Group__1__Impl rule__PlusEqual__Group__2 ;
    public final void rule__PlusEqual__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5926:1: ( rule__PlusEqual__Group__1__Impl rule__PlusEqual__Group__2 )
            // InternalLegoLang.g:5927:2: rule__PlusEqual__Group__1__Impl rule__PlusEqual__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalLegoLang.g:5934:1: rule__PlusEqual__Group__1__Impl : ( '(' ) ;
    public final void rule__PlusEqual__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5938:1: ( ( '(' ) )
            // InternalLegoLang.g:5939:1: ( '(' )
            {
            // InternalLegoLang.g:5939:1: ( '(' )
            // InternalLegoLang.g:5940:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusEqualAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:5949:1: rule__PlusEqual__Group__2 : rule__PlusEqual__Group__2__Impl rule__PlusEqual__Group__3 ;
    public final void rule__PlusEqual__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5953:1: ( rule__PlusEqual__Group__2__Impl rule__PlusEqual__Group__3 )
            // InternalLegoLang.g:5954:2: rule__PlusEqual__Group__2__Impl rule__PlusEqual__Group__3
            {
            pushFollow(FOLLOW_44);
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
    // InternalLegoLang.g:5961:1: rule__PlusEqual__Group__2__Impl : ( ( rule__PlusEqual__LeftAssignment_2 ) ) ;
    public final void rule__PlusEqual__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5965:1: ( ( ( rule__PlusEqual__LeftAssignment_2 ) ) )
            // InternalLegoLang.g:5966:1: ( ( rule__PlusEqual__LeftAssignment_2 ) )
            {
            // InternalLegoLang.g:5966:1: ( ( rule__PlusEqual__LeftAssignment_2 ) )
            // InternalLegoLang.g:5967:2: ( rule__PlusEqual__LeftAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusEqualAccess().getLeftAssignment_2()); 
            }
            // InternalLegoLang.g:5968:2: ( rule__PlusEqual__LeftAssignment_2 )
            // InternalLegoLang.g:5968:3: rule__PlusEqual__LeftAssignment_2
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
    // InternalLegoLang.g:5976:1: rule__PlusEqual__Group__3 : rule__PlusEqual__Group__3__Impl rule__PlusEqual__Group__4 ;
    public final void rule__PlusEqual__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5980:1: ( rule__PlusEqual__Group__3__Impl rule__PlusEqual__Group__4 )
            // InternalLegoLang.g:5981:2: rule__PlusEqual__Group__3__Impl rule__PlusEqual__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalLegoLang.g:5988:1: rule__PlusEqual__Group__3__Impl : ( '+=' ) ;
    public final void rule__PlusEqual__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:5992:1: ( ( '+=' ) )
            // InternalLegoLang.g:5993:1: ( '+=' )
            {
            // InternalLegoLang.g:5993:1: ( '+=' )
            // InternalLegoLang.g:5994:2: '+='
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
    // InternalLegoLang.g:6003:1: rule__PlusEqual__Group__4 : rule__PlusEqual__Group__4__Impl rule__PlusEqual__Group__5 ;
    public final void rule__PlusEqual__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6007:1: ( rule__PlusEqual__Group__4__Impl rule__PlusEqual__Group__5 )
            // InternalLegoLang.g:6008:2: rule__PlusEqual__Group__4__Impl rule__PlusEqual__Group__5
            {
            pushFollow(FOLLOW_31);
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
    // InternalLegoLang.g:6015:1: rule__PlusEqual__Group__4__Impl : ( ( rule__PlusEqual__RightAssignment_4 ) ) ;
    public final void rule__PlusEqual__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6019:1: ( ( ( rule__PlusEqual__RightAssignment_4 ) ) )
            // InternalLegoLang.g:6020:1: ( ( rule__PlusEqual__RightAssignment_4 ) )
            {
            // InternalLegoLang.g:6020:1: ( ( rule__PlusEqual__RightAssignment_4 ) )
            // InternalLegoLang.g:6021:2: ( rule__PlusEqual__RightAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusEqualAccess().getRightAssignment_4()); 
            }
            // InternalLegoLang.g:6022:2: ( rule__PlusEqual__RightAssignment_4 )
            // InternalLegoLang.g:6022:3: rule__PlusEqual__RightAssignment_4
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
    // InternalLegoLang.g:6030:1: rule__PlusEqual__Group__5 : rule__PlusEqual__Group__5__Impl ;
    public final void rule__PlusEqual__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6034:1: ( rule__PlusEqual__Group__5__Impl )
            // InternalLegoLang.g:6035:2: rule__PlusEqual__Group__5__Impl
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
    // InternalLegoLang.g:6041:1: rule__PlusEqual__Group__5__Impl : ( ');' ) ;
    public final void rule__PlusEqual__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6045:1: ( ( ');' ) )
            // InternalLegoLang.g:6046:1: ( ');' )
            {
            // InternalLegoLang.g:6046:1: ( ');' )
            // InternalLegoLang.g:6047:2: ');'
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
    // InternalLegoLang.g:6057:1: rule__MinusEqual__Group__0 : rule__MinusEqual__Group__0__Impl rule__MinusEqual__Group__1 ;
    public final void rule__MinusEqual__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6061:1: ( rule__MinusEqual__Group__0__Impl rule__MinusEqual__Group__1 )
            // InternalLegoLang.g:6062:2: rule__MinusEqual__Group__0__Impl rule__MinusEqual__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalLegoLang.g:6069:1: rule__MinusEqual__Group__0__Impl : ( () ) ;
    public final void rule__MinusEqual__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6073:1: ( ( () ) )
            // InternalLegoLang.g:6074:1: ( () )
            {
            // InternalLegoLang.g:6074:1: ( () )
            // InternalLegoLang.g:6075:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinusEqualAccess().getMinusEqualAction_0()); 
            }
            // InternalLegoLang.g:6076:2: ()
            // InternalLegoLang.g:6076:3: 
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
    // InternalLegoLang.g:6084:1: rule__MinusEqual__Group__1 : rule__MinusEqual__Group__1__Impl rule__MinusEqual__Group__2 ;
    public final void rule__MinusEqual__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6088:1: ( rule__MinusEqual__Group__1__Impl rule__MinusEqual__Group__2 )
            // InternalLegoLang.g:6089:2: rule__MinusEqual__Group__1__Impl rule__MinusEqual__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalLegoLang.g:6096:1: rule__MinusEqual__Group__1__Impl : ( '(' ) ;
    public final void rule__MinusEqual__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6100:1: ( ( '(' ) )
            // InternalLegoLang.g:6101:1: ( '(' )
            {
            // InternalLegoLang.g:6101:1: ( '(' )
            // InternalLegoLang.g:6102:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinusEqualAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:6111:1: rule__MinusEqual__Group__2 : rule__MinusEqual__Group__2__Impl rule__MinusEqual__Group__3 ;
    public final void rule__MinusEqual__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6115:1: ( rule__MinusEqual__Group__2__Impl rule__MinusEqual__Group__3 )
            // InternalLegoLang.g:6116:2: rule__MinusEqual__Group__2__Impl rule__MinusEqual__Group__3
            {
            pushFollow(FOLLOW_45);
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
    // InternalLegoLang.g:6123:1: rule__MinusEqual__Group__2__Impl : ( ( rule__MinusEqual__LeftAssignment_2 ) ) ;
    public final void rule__MinusEqual__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6127:1: ( ( ( rule__MinusEqual__LeftAssignment_2 ) ) )
            // InternalLegoLang.g:6128:1: ( ( rule__MinusEqual__LeftAssignment_2 ) )
            {
            // InternalLegoLang.g:6128:1: ( ( rule__MinusEqual__LeftAssignment_2 ) )
            // InternalLegoLang.g:6129:2: ( rule__MinusEqual__LeftAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinusEqualAccess().getLeftAssignment_2()); 
            }
            // InternalLegoLang.g:6130:2: ( rule__MinusEqual__LeftAssignment_2 )
            // InternalLegoLang.g:6130:3: rule__MinusEqual__LeftAssignment_2
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
    // InternalLegoLang.g:6138:1: rule__MinusEqual__Group__3 : rule__MinusEqual__Group__3__Impl rule__MinusEqual__Group__4 ;
    public final void rule__MinusEqual__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6142:1: ( rule__MinusEqual__Group__3__Impl rule__MinusEqual__Group__4 )
            // InternalLegoLang.g:6143:2: rule__MinusEqual__Group__3__Impl rule__MinusEqual__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalLegoLang.g:6150:1: rule__MinusEqual__Group__3__Impl : ( '-=' ) ;
    public final void rule__MinusEqual__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6154:1: ( ( '-=' ) )
            // InternalLegoLang.g:6155:1: ( '-=' )
            {
            // InternalLegoLang.g:6155:1: ( '-=' )
            // InternalLegoLang.g:6156:2: '-='
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
    // InternalLegoLang.g:6165:1: rule__MinusEqual__Group__4 : rule__MinusEqual__Group__4__Impl rule__MinusEqual__Group__5 ;
    public final void rule__MinusEqual__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6169:1: ( rule__MinusEqual__Group__4__Impl rule__MinusEqual__Group__5 )
            // InternalLegoLang.g:6170:2: rule__MinusEqual__Group__4__Impl rule__MinusEqual__Group__5
            {
            pushFollow(FOLLOW_31);
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
    // InternalLegoLang.g:6177:1: rule__MinusEqual__Group__4__Impl : ( ( rule__MinusEqual__RightAssignment_4 ) ) ;
    public final void rule__MinusEqual__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6181:1: ( ( ( rule__MinusEqual__RightAssignment_4 ) ) )
            // InternalLegoLang.g:6182:1: ( ( rule__MinusEqual__RightAssignment_4 ) )
            {
            // InternalLegoLang.g:6182:1: ( ( rule__MinusEqual__RightAssignment_4 ) )
            // InternalLegoLang.g:6183:2: ( rule__MinusEqual__RightAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinusEqualAccess().getRightAssignment_4()); 
            }
            // InternalLegoLang.g:6184:2: ( rule__MinusEqual__RightAssignment_4 )
            // InternalLegoLang.g:6184:3: rule__MinusEqual__RightAssignment_4
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
    // InternalLegoLang.g:6192:1: rule__MinusEqual__Group__5 : rule__MinusEqual__Group__5__Impl ;
    public final void rule__MinusEqual__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6196:1: ( rule__MinusEqual__Group__5__Impl )
            // InternalLegoLang.g:6197:2: rule__MinusEqual__Group__5__Impl
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
    // InternalLegoLang.g:6203:1: rule__MinusEqual__Group__5__Impl : ( ');' ) ;
    public final void rule__MinusEqual__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6207:1: ( ( ');' ) )
            // InternalLegoLang.g:6208:1: ( ');' )
            {
            // InternalLegoLang.g:6208:1: ( ');' )
            // InternalLegoLang.g:6209:2: ');'
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
    // InternalLegoLang.g:6219:1: rule__UnInteger__Group__0 : rule__UnInteger__Group__0__Impl rule__UnInteger__Group__1 ;
    public final void rule__UnInteger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6223:1: ( rule__UnInteger__Group__0__Impl rule__UnInteger__Group__1 )
            // InternalLegoLang.g:6224:2: rule__UnInteger__Group__0__Impl rule__UnInteger__Group__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalLegoLang.g:6231:1: rule__UnInteger__Group__0__Impl : ( () ) ;
    public final void rule__UnInteger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6235:1: ( ( () ) )
            // InternalLegoLang.g:6236:1: ( () )
            {
            // InternalLegoLang.g:6236:1: ( () )
            // InternalLegoLang.g:6237:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnIntegerAccess().getUnIntegerAction_0()); 
            }
            // InternalLegoLang.g:6238:2: ()
            // InternalLegoLang.g:6238:3: 
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
    // InternalLegoLang.g:6246:1: rule__UnInteger__Group__1 : rule__UnInteger__Group__1__Impl rule__UnInteger__Group__2 ;
    public final void rule__UnInteger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6250:1: ( rule__UnInteger__Group__1__Impl rule__UnInteger__Group__2 )
            // InternalLegoLang.g:6251:2: rule__UnInteger__Group__1__Impl rule__UnInteger__Group__2
            {
            pushFollow(FOLLOW_46);
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
    // InternalLegoLang.g:6258:1: rule__UnInteger__Group__1__Impl : ( ( rule__UnInteger__IsConstAssignment_1 )? ) ;
    public final void rule__UnInteger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6262:1: ( ( ( rule__UnInteger__IsConstAssignment_1 )? ) )
            // InternalLegoLang.g:6263:1: ( ( rule__UnInteger__IsConstAssignment_1 )? )
            {
            // InternalLegoLang.g:6263:1: ( ( rule__UnInteger__IsConstAssignment_1 )? )
            // InternalLegoLang.g:6264:2: ( rule__UnInteger__IsConstAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnIntegerAccess().getIsConstAssignment_1()); 
            }
            // InternalLegoLang.g:6265:2: ( rule__UnInteger__IsConstAssignment_1 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==62) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalLegoLang.g:6265:3: rule__UnInteger__IsConstAssignment_1
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
    // InternalLegoLang.g:6273:1: rule__UnInteger__Group__2 : rule__UnInteger__Group__2__Impl rule__UnInteger__Group__3 ;
    public final void rule__UnInteger__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6277:1: ( rule__UnInteger__Group__2__Impl rule__UnInteger__Group__3 )
            // InternalLegoLang.g:6278:2: rule__UnInteger__Group__2__Impl rule__UnInteger__Group__3
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
    // InternalLegoLang.g:6285:1: rule__UnInteger__Group__2__Impl : ( 'int' ) ;
    public final void rule__UnInteger__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6289:1: ( ( 'int' ) )
            // InternalLegoLang.g:6290:1: ( 'int' )
            {
            // InternalLegoLang.g:6290:1: ( 'int' )
            // InternalLegoLang.g:6291:2: 'int'
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
    // InternalLegoLang.g:6300:1: rule__UnInteger__Group__3 : rule__UnInteger__Group__3__Impl rule__UnInteger__Group__4 ;
    public final void rule__UnInteger__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6304:1: ( rule__UnInteger__Group__3__Impl rule__UnInteger__Group__4 )
            // InternalLegoLang.g:6305:2: rule__UnInteger__Group__3__Impl rule__UnInteger__Group__4
            {
            pushFollow(FOLLOW_47);
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
    // InternalLegoLang.g:6312:1: rule__UnInteger__Group__3__Impl : ( ( rule__UnInteger__NameAssignment_3 ) ) ;
    public final void rule__UnInteger__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6316:1: ( ( ( rule__UnInteger__NameAssignment_3 ) ) )
            // InternalLegoLang.g:6317:1: ( ( rule__UnInteger__NameAssignment_3 ) )
            {
            // InternalLegoLang.g:6317:1: ( ( rule__UnInteger__NameAssignment_3 ) )
            // InternalLegoLang.g:6318:2: ( rule__UnInteger__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnIntegerAccess().getNameAssignment_3()); 
            }
            // InternalLegoLang.g:6319:2: ( rule__UnInteger__NameAssignment_3 )
            // InternalLegoLang.g:6319:3: rule__UnInteger__NameAssignment_3
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
    // InternalLegoLang.g:6327:1: rule__UnInteger__Group__4 : rule__UnInteger__Group__4__Impl rule__UnInteger__Group__5 ;
    public final void rule__UnInteger__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6331:1: ( rule__UnInteger__Group__4__Impl rule__UnInteger__Group__5 )
            // InternalLegoLang.g:6332:2: rule__UnInteger__Group__4__Impl rule__UnInteger__Group__5
            {
            pushFollow(FOLLOW_47);
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
    // InternalLegoLang.g:6339:1: rule__UnInteger__Group__4__Impl : ( ( rule__UnInteger__Group_4__0 )? ) ;
    public final void rule__UnInteger__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6343:1: ( ( ( rule__UnInteger__Group_4__0 )? ) )
            // InternalLegoLang.g:6344:1: ( ( rule__UnInteger__Group_4__0 )? )
            {
            // InternalLegoLang.g:6344:1: ( ( rule__UnInteger__Group_4__0 )? )
            // InternalLegoLang.g:6345:2: ( rule__UnInteger__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnIntegerAccess().getGroup_4()); 
            }
            // InternalLegoLang.g:6346:2: ( rule__UnInteger__Group_4__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==25) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalLegoLang.g:6346:3: rule__UnInteger__Group_4__0
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
    // InternalLegoLang.g:6354:1: rule__UnInteger__Group__5 : rule__UnInteger__Group__5__Impl ;
    public final void rule__UnInteger__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6358:1: ( rule__UnInteger__Group__5__Impl )
            // InternalLegoLang.g:6359:2: rule__UnInteger__Group__5__Impl
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
    // InternalLegoLang.g:6365:1: rule__UnInteger__Group__5__Impl : ( ';' ) ;
    public final void rule__UnInteger__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6369:1: ( ( ';' ) )
            // InternalLegoLang.g:6370:1: ( ';' )
            {
            // InternalLegoLang.g:6370:1: ( ';' )
            // InternalLegoLang.g:6371:2: ';'
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
    // InternalLegoLang.g:6381:1: rule__UnInteger__Group_4__0 : rule__UnInteger__Group_4__0__Impl rule__UnInteger__Group_4__1 ;
    public final void rule__UnInteger__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6385:1: ( rule__UnInteger__Group_4__0__Impl rule__UnInteger__Group_4__1 )
            // InternalLegoLang.g:6386:2: rule__UnInteger__Group_4__0__Impl rule__UnInteger__Group_4__1
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
    // InternalLegoLang.g:6393:1: rule__UnInteger__Group_4__0__Impl : ( '=' ) ;
    public final void rule__UnInteger__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6397:1: ( ( '=' ) )
            // InternalLegoLang.g:6398:1: ( '=' )
            {
            // InternalLegoLang.g:6398:1: ( '=' )
            // InternalLegoLang.g:6399:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnIntegerAccess().getEqualsSignKeyword_4_0()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:6408:1: rule__UnInteger__Group_4__1 : rule__UnInteger__Group_4__1__Impl ;
    public final void rule__UnInteger__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6412:1: ( rule__UnInteger__Group_4__1__Impl )
            // InternalLegoLang.g:6413:2: rule__UnInteger__Group_4__1__Impl
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
    // InternalLegoLang.g:6419:1: rule__UnInteger__Group_4__1__Impl : ( ( rule__UnInteger__InitialeValueAssignment_4_1 ) ) ;
    public final void rule__UnInteger__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6423:1: ( ( ( rule__UnInteger__InitialeValueAssignment_4_1 ) ) )
            // InternalLegoLang.g:6424:1: ( ( rule__UnInteger__InitialeValueAssignment_4_1 ) )
            {
            // InternalLegoLang.g:6424:1: ( ( rule__UnInteger__InitialeValueAssignment_4_1 ) )
            // InternalLegoLang.g:6425:2: ( rule__UnInteger__InitialeValueAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnIntegerAccess().getInitialeValueAssignment_4_1()); 
            }
            // InternalLegoLang.g:6426:2: ( rule__UnInteger__InitialeValueAssignment_4_1 )
            // InternalLegoLang.g:6426:3: rule__UnInteger__InitialeValueAssignment_4_1
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
    // InternalLegoLang.g:6435:1: rule__UnDouble__Group__0 : rule__UnDouble__Group__0__Impl rule__UnDouble__Group__1 ;
    public final void rule__UnDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6439:1: ( rule__UnDouble__Group__0__Impl rule__UnDouble__Group__1 )
            // InternalLegoLang.g:6440:2: rule__UnDouble__Group__0__Impl rule__UnDouble__Group__1
            {
            pushFollow(FOLLOW_48);
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
    // InternalLegoLang.g:6447:1: rule__UnDouble__Group__0__Impl : ( () ) ;
    public final void rule__UnDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6451:1: ( ( () ) )
            // InternalLegoLang.g:6452:1: ( () )
            {
            // InternalLegoLang.g:6452:1: ( () )
            // InternalLegoLang.g:6453:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnDoubleAccess().getUnDoubleAction_0()); 
            }
            // InternalLegoLang.g:6454:2: ()
            // InternalLegoLang.g:6454:3: 
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
    // InternalLegoLang.g:6462:1: rule__UnDouble__Group__1 : rule__UnDouble__Group__1__Impl rule__UnDouble__Group__2 ;
    public final void rule__UnDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6466:1: ( rule__UnDouble__Group__1__Impl rule__UnDouble__Group__2 )
            // InternalLegoLang.g:6467:2: rule__UnDouble__Group__1__Impl rule__UnDouble__Group__2
            {
            pushFollow(FOLLOW_48);
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
    // InternalLegoLang.g:6474:1: rule__UnDouble__Group__1__Impl : ( ( rule__UnDouble__IsConstAssignment_1 )? ) ;
    public final void rule__UnDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6478:1: ( ( ( rule__UnDouble__IsConstAssignment_1 )? ) )
            // InternalLegoLang.g:6479:1: ( ( rule__UnDouble__IsConstAssignment_1 )? )
            {
            // InternalLegoLang.g:6479:1: ( ( rule__UnDouble__IsConstAssignment_1 )? )
            // InternalLegoLang.g:6480:2: ( rule__UnDouble__IsConstAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnDoubleAccess().getIsConstAssignment_1()); 
            }
            // InternalLegoLang.g:6481:2: ( rule__UnDouble__IsConstAssignment_1 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==62) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalLegoLang.g:6481:3: rule__UnDouble__IsConstAssignment_1
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
    // InternalLegoLang.g:6489:1: rule__UnDouble__Group__2 : rule__UnDouble__Group__2__Impl rule__UnDouble__Group__3 ;
    public final void rule__UnDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6493:1: ( rule__UnDouble__Group__2__Impl rule__UnDouble__Group__3 )
            // InternalLegoLang.g:6494:2: rule__UnDouble__Group__2__Impl rule__UnDouble__Group__3
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
    // InternalLegoLang.g:6501:1: rule__UnDouble__Group__2__Impl : ( 'double' ) ;
    public final void rule__UnDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6505:1: ( ( 'double' ) )
            // InternalLegoLang.g:6506:1: ( 'double' )
            {
            // InternalLegoLang.g:6506:1: ( 'double' )
            // InternalLegoLang.g:6507:2: 'double'
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
    // InternalLegoLang.g:6516:1: rule__UnDouble__Group__3 : rule__UnDouble__Group__3__Impl rule__UnDouble__Group__4 ;
    public final void rule__UnDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6520:1: ( rule__UnDouble__Group__3__Impl rule__UnDouble__Group__4 )
            // InternalLegoLang.g:6521:2: rule__UnDouble__Group__3__Impl rule__UnDouble__Group__4
            {
            pushFollow(FOLLOW_47);
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
    // InternalLegoLang.g:6528:1: rule__UnDouble__Group__3__Impl : ( ( rule__UnDouble__NameAssignment_3 ) ) ;
    public final void rule__UnDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6532:1: ( ( ( rule__UnDouble__NameAssignment_3 ) ) )
            // InternalLegoLang.g:6533:1: ( ( rule__UnDouble__NameAssignment_3 ) )
            {
            // InternalLegoLang.g:6533:1: ( ( rule__UnDouble__NameAssignment_3 ) )
            // InternalLegoLang.g:6534:2: ( rule__UnDouble__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnDoubleAccess().getNameAssignment_3()); 
            }
            // InternalLegoLang.g:6535:2: ( rule__UnDouble__NameAssignment_3 )
            // InternalLegoLang.g:6535:3: rule__UnDouble__NameAssignment_3
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
    // InternalLegoLang.g:6543:1: rule__UnDouble__Group__4 : rule__UnDouble__Group__4__Impl rule__UnDouble__Group__5 ;
    public final void rule__UnDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6547:1: ( rule__UnDouble__Group__4__Impl rule__UnDouble__Group__5 )
            // InternalLegoLang.g:6548:2: rule__UnDouble__Group__4__Impl rule__UnDouble__Group__5
            {
            pushFollow(FOLLOW_47);
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
    // InternalLegoLang.g:6555:1: rule__UnDouble__Group__4__Impl : ( ( rule__UnDouble__Group_4__0 )? ) ;
    public final void rule__UnDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6559:1: ( ( ( rule__UnDouble__Group_4__0 )? ) )
            // InternalLegoLang.g:6560:1: ( ( rule__UnDouble__Group_4__0 )? )
            {
            // InternalLegoLang.g:6560:1: ( ( rule__UnDouble__Group_4__0 )? )
            // InternalLegoLang.g:6561:2: ( rule__UnDouble__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnDoubleAccess().getGroup_4()); 
            }
            // InternalLegoLang.g:6562:2: ( rule__UnDouble__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==25) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalLegoLang.g:6562:3: rule__UnDouble__Group_4__0
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
    // InternalLegoLang.g:6570:1: rule__UnDouble__Group__5 : rule__UnDouble__Group__5__Impl ;
    public final void rule__UnDouble__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6574:1: ( rule__UnDouble__Group__5__Impl )
            // InternalLegoLang.g:6575:2: rule__UnDouble__Group__5__Impl
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
    // InternalLegoLang.g:6581:1: rule__UnDouble__Group__5__Impl : ( ';' ) ;
    public final void rule__UnDouble__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6585:1: ( ( ';' ) )
            // InternalLegoLang.g:6586:1: ( ';' )
            {
            // InternalLegoLang.g:6586:1: ( ';' )
            // InternalLegoLang.g:6587:2: ';'
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
    // InternalLegoLang.g:6597:1: rule__UnDouble__Group_4__0 : rule__UnDouble__Group_4__0__Impl rule__UnDouble__Group_4__1 ;
    public final void rule__UnDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6601:1: ( rule__UnDouble__Group_4__0__Impl rule__UnDouble__Group_4__1 )
            // InternalLegoLang.g:6602:2: rule__UnDouble__Group_4__0__Impl rule__UnDouble__Group_4__1
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
    // InternalLegoLang.g:6609:1: rule__UnDouble__Group_4__0__Impl : ( '=' ) ;
    public final void rule__UnDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6613:1: ( ( '=' ) )
            // InternalLegoLang.g:6614:1: ( '=' )
            {
            // InternalLegoLang.g:6614:1: ( '=' )
            // InternalLegoLang.g:6615:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnDoubleAccess().getEqualsSignKeyword_4_0()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:6624:1: rule__UnDouble__Group_4__1 : rule__UnDouble__Group_4__1__Impl rule__UnDouble__Group_4__2 ;
    public final void rule__UnDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6628:1: ( rule__UnDouble__Group_4__1__Impl rule__UnDouble__Group_4__2 )
            // InternalLegoLang.g:6629:2: rule__UnDouble__Group_4__1__Impl rule__UnDouble__Group_4__2
            {
            pushFollow(FOLLOW_49);
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
    // InternalLegoLang.g:6636:1: rule__UnDouble__Group_4__1__Impl : ( ( rule__UnDouble__InitialeValue1Assignment_4_1 ) ) ;
    public final void rule__UnDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6640:1: ( ( ( rule__UnDouble__InitialeValue1Assignment_4_1 ) ) )
            // InternalLegoLang.g:6641:1: ( ( rule__UnDouble__InitialeValue1Assignment_4_1 ) )
            {
            // InternalLegoLang.g:6641:1: ( ( rule__UnDouble__InitialeValue1Assignment_4_1 ) )
            // InternalLegoLang.g:6642:2: ( rule__UnDouble__InitialeValue1Assignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnDoubleAccess().getInitialeValue1Assignment_4_1()); 
            }
            // InternalLegoLang.g:6643:2: ( rule__UnDouble__InitialeValue1Assignment_4_1 )
            // InternalLegoLang.g:6643:3: rule__UnDouble__InitialeValue1Assignment_4_1
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
    // InternalLegoLang.g:6651:1: rule__UnDouble__Group_4__2 : rule__UnDouble__Group_4__2__Impl ;
    public final void rule__UnDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6655:1: ( rule__UnDouble__Group_4__2__Impl )
            // InternalLegoLang.g:6656:2: rule__UnDouble__Group_4__2__Impl
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
    // InternalLegoLang.g:6662:1: rule__UnDouble__Group_4__2__Impl : ( ( rule__UnDouble__Group_4_2__0 )? ) ;
    public final void rule__UnDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6666:1: ( ( ( rule__UnDouble__Group_4_2__0 )? ) )
            // InternalLegoLang.g:6667:1: ( ( rule__UnDouble__Group_4_2__0 )? )
            {
            // InternalLegoLang.g:6667:1: ( ( rule__UnDouble__Group_4_2__0 )? )
            // InternalLegoLang.g:6668:2: ( rule__UnDouble__Group_4_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnDoubleAccess().getGroup_4_2()); 
            }
            // InternalLegoLang.g:6669:2: ( rule__UnDouble__Group_4_2__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==59) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalLegoLang.g:6669:3: rule__UnDouble__Group_4_2__0
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
    // InternalLegoLang.g:6678:1: rule__UnDouble__Group_4_2__0 : rule__UnDouble__Group_4_2__0__Impl rule__UnDouble__Group_4_2__1 ;
    public final void rule__UnDouble__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6682:1: ( rule__UnDouble__Group_4_2__0__Impl rule__UnDouble__Group_4_2__1 )
            // InternalLegoLang.g:6683:2: rule__UnDouble__Group_4_2__0__Impl rule__UnDouble__Group_4_2__1
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
    // InternalLegoLang.g:6690:1: rule__UnDouble__Group_4_2__0__Impl : ( '.' ) ;
    public final void rule__UnDouble__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6694:1: ( ( '.' ) )
            // InternalLegoLang.g:6695:1: ( '.' )
            {
            // InternalLegoLang.g:6695:1: ( '.' )
            // InternalLegoLang.g:6696:2: '.'
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
    // InternalLegoLang.g:6705:1: rule__UnDouble__Group_4_2__1 : rule__UnDouble__Group_4_2__1__Impl ;
    public final void rule__UnDouble__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6709:1: ( rule__UnDouble__Group_4_2__1__Impl )
            // InternalLegoLang.g:6710:2: rule__UnDouble__Group_4_2__1__Impl
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
    // InternalLegoLang.g:6716:1: rule__UnDouble__Group_4_2__1__Impl : ( ( rule__UnDouble__InitialeValue2Assignment_4_2_1 ) ) ;
    public final void rule__UnDouble__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6720:1: ( ( ( rule__UnDouble__InitialeValue2Assignment_4_2_1 ) ) )
            // InternalLegoLang.g:6721:1: ( ( rule__UnDouble__InitialeValue2Assignment_4_2_1 ) )
            {
            // InternalLegoLang.g:6721:1: ( ( rule__UnDouble__InitialeValue2Assignment_4_2_1 ) )
            // InternalLegoLang.g:6722:2: ( rule__UnDouble__InitialeValue2Assignment_4_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnDoubleAccess().getInitialeValue2Assignment_4_2_1()); 
            }
            // InternalLegoLang.g:6723:2: ( rule__UnDouble__InitialeValue2Assignment_4_2_1 )
            // InternalLegoLang.g:6723:3: rule__UnDouble__InitialeValue2Assignment_4_2_1
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
    // InternalLegoLang.g:6732:1: rule__UnBoolean__Group__0 : rule__UnBoolean__Group__0__Impl rule__UnBoolean__Group__1 ;
    public final void rule__UnBoolean__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6736:1: ( rule__UnBoolean__Group__0__Impl rule__UnBoolean__Group__1 )
            // InternalLegoLang.g:6737:2: rule__UnBoolean__Group__0__Impl rule__UnBoolean__Group__1
            {
            pushFollow(FOLLOW_50);
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
    // InternalLegoLang.g:6744:1: rule__UnBoolean__Group__0__Impl : ( () ) ;
    public final void rule__UnBoolean__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6748:1: ( ( () ) )
            // InternalLegoLang.g:6749:1: ( () )
            {
            // InternalLegoLang.g:6749:1: ( () )
            // InternalLegoLang.g:6750:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnBooleanAccess().getUnBooleanAction_0()); 
            }
            // InternalLegoLang.g:6751:2: ()
            // InternalLegoLang.g:6751:3: 
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
    // InternalLegoLang.g:6759:1: rule__UnBoolean__Group__1 : rule__UnBoolean__Group__1__Impl rule__UnBoolean__Group__2 ;
    public final void rule__UnBoolean__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6763:1: ( rule__UnBoolean__Group__1__Impl rule__UnBoolean__Group__2 )
            // InternalLegoLang.g:6764:2: rule__UnBoolean__Group__1__Impl rule__UnBoolean__Group__2
            {
            pushFollow(FOLLOW_50);
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
    // InternalLegoLang.g:6771:1: rule__UnBoolean__Group__1__Impl : ( ( rule__UnBoolean__IsConstAssignment_1 )? ) ;
    public final void rule__UnBoolean__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6775:1: ( ( ( rule__UnBoolean__IsConstAssignment_1 )? ) )
            // InternalLegoLang.g:6776:1: ( ( rule__UnBoolean__IsConstAssignment_1 )? )
            {
            // InternalLegoLang.g:6776:1: ( ( rule__UnBoolean__IsConstAssignment_1 )? )
            // InternalLegoLang.g:6777:2: ( rule__UnBoolean__IsConstAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnBooleanAccess().getIsConstAssignment_1()); 
            }
            // InternalLegoLang.g:6778:2: ( rule__UnBoolean__IsConstAssignment_1 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==62) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalLegoLang.g:6778:3: rule__UnBoolean__IsConstAssignment_1
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
    // InternalLegoLang.g:6786:1: rule__UnBoolean__Group__2 : rule__UnBoolean__Group__2__Impl rule__UnBoolean__Group__3 ;
    public final void rule__UnBoolean__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6790:1: ( rule__UnBoolean__Group__2__Impl rule__UnBoolean__Group__3 )
            // InternalLegoLang.g:6791:2: rule__UnBoolean__Group__2__Impl rule__UnBoolean__Group__3
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
    // InternalLegoLang.g:6798:1: rule__UnBoolean__Group__2__Impl : ( 'bool' ) ;
    public final void rule__UnBoolean__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6802:1: ( ( 'bool' ) )
            // InternalLegoLang.g:6803:1: ( 'bool' )
            {
            // InternalLegoLang.g:6803:1: ( 'bool' )
            // InternalLegoLang.g:6804:2: 'bool'
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
    // InternalLegoLang.g:6813:1: rule__UnBoolean__Group__3 : rule__UnBoolean__Group__3__Impl rule__UnBoolean__Group__4 ;
    public final void rule__UnBoolean__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6817:1: ( rule__UnBoolean__Group__3__Impl rule__UnBoolean__Group__4 )
            // InternalLegoLang.g:6818:2: rule__UnBoolean__Group__3__Impl rule__UnBoolean__Group__4
            {
            pushFollow(FOLLOW_47);
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
    // InternalLegoLang.g:6825:1: rule__UnBoolean__Group__3__Impl : ( ( rule__UnBoolean__NameAssignment_3 ) ) ;
    public final void rule__UnBoolean__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6829:1: ( ( ( rule__UnBoolean__NameAssignment_3 ) ) )
            // InternalLegoLang.g:6830:1: ( ( rule__UnBoolean__NameAssignment_3 ) )
            {
            // InternalLegoLang.g:6830:1: ( ( rule__UnBoolean__NameAssignment_3 ) )
            // InternalLegoLang.g:6831:2: ( rule__UnBoolean__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnBooleanAccess().getNameAssignment_3()); 
            }
            // InternalLegoLang.g:6832:2: ( rule__UnBoolean__NameAssignment_3 )
            // InternalLegoLang.g:6832:3: rule__UnBoolean__NameAssignment_3
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
    // InternalLegoLang.g:6840:1: rule__UnBoolean__Group__4 : rule__UnBoolean__Group__4__Impl rule__UnBoolean__Group__5 ;
    public final void rule__UnBoolean__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6844:1: ( rule__UnBoolean__Group__4__Impl rule__UnBoolean__Group__5 )
            // InternalLegoLang.g:6845:2: rule__UnBoolean__Group__4__Impl rule__UnBoolean__Group__5
            {
            pushFollow(FOLLOW_47);
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
    // InternalLegoLang.g:6852:1: rule__UnBoolean__Group__4__Impl : ( ( rule__UnBoolean__Group_4__0 )? ) ;
    public final void rule__UnBoolean__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6856:1: ( ( ( rule__UnBoolean__Group_4__0 )? ) )
            // InternalLegoLang.g:6857:1: ( ( rule__UnBoolean__Group_4__0 )? )
            {
            // InternalLegoLang.g:6857:1: ( ( rule__UnBoolean__Group_4__0 )? )
            // InternalLegoLang.g:6858:2: ( rule__UnBoolean__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnBooleanAccess().getGroup_4()); 
            }
            // InternalLegoLang.g:6859:2: ( rule__UnBoolean__Group_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==25) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalLegoLang.g:6859:3: rule__UnBoolean__Group_4__0
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
    // InternalLegoLang.g:6867:1: rule__UnBoolean__Group__5 : rule__UnBoolean__Group__5__Impl ;
    public final void rule__UnBoolean__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6871:1: ( rule__UnBoolean__Group__5__Impl )
            // InternalLegoLang.g:6872:2: rule__UnBoolean__Group__5__Impl
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
    // InternalLegoLang.g:6878:1: rule__UnBoolean__Group__5__Impl : ( ';' ) ;
    public final void rule__UnBoolean__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6882:1: ( ( ';' ) )
            // InternalLegoLang.g:6883:1: ( ';' )
            {
            // InternalLegoLang.g:6883:1: ( ';' )
            // InternalLegoLang.g:6884:2: ';'
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
    // InternalLegoLang.g:6894:1: rule__UnBoolean__Group_4__0 : rule__UnBoolean__Group_4__0__Impl rule__UnBoolean__Group_4__1 ;
    public final void rule__UnBoolean__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6898:1: ( rule__UnBoolean__Group_4__0__Impl rule__UnBoolean__Group_4__1 )
            // InternalLegoLang.g:6899:2: rule__UnBoolean__Group_4__0__Impl rule__UnBoolean__Group_4__1
            {
            pushFollow(FOLLOW_51);
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
    // InternalLegoLang.g:6906:1: rule__UnBoolean__Group_4__0__Impl : ( '=' ) ;
    public final void rule__UnBoolean__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6910:1: ( ( '=' ) )
            // InternalLegoLang.g:6911:1: ( '=' )
            {
            // InternalLegoLang.g:6911:1: ( '=' )
            // InternalLegoLang.g:6912:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnBooleanAccess().getEqualsSignKeyword_4_0()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:6921:1: rule__UnBoolean__Group_4__1 : rule__UnBoolean__Group_4__1__Impl ;
    public final void rule__UnBoolean__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6925:1: ( rule__UnBoolean__Group_4__1__Impl )
            // InternalLegoLang.g:6926:2: rule__UnBoolean__Group_4__1__Impl
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
    // InternalLegoLang.g:6932:1: rule__UnBoolean__Group_4__1__Impl : ( ( rule__UnBoolean__InitialeValueAssignment_4_1 ) ) ;
    public final void rule__UnBoolean__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6936:1: ( ( ( rule__UnBoolean__InitialeValueAssignment_4_1 ) ) )
            // InternalLegoLang.g:6937:1: ( ( rule__UnBoolean__InitialeValueAssignment_4_1 ) )
            {
            // InternalLegoLang.g:6937:1: ( ( rule__UnBoolean__InitialeValueAssignment_4_1 ) )
            // InternalLegoLang.g:6938:2: ( rule__UnBoolean__InitialeValueAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnBooleanAccess().getInitialeValueAssignment_4_1()); 
            }
            // InternalLegoLang.g:6939:2: ( rule__UnBoolean__InitialeValueAssignment_4_1 )
            // InternalLegoLang.g:6939:3: rule__UnBoolean__InitialeValueAssignment_4_1
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
    // InternalLegoLang.g:6948:1: rule__UnString__Group__0 : rule__UnString__Group__0__Impl rule__UnString__Group__1 ;
    public final void rule__UnString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6952:1: ( rule__UnString__Group__0__Impl rule__UnString__Group__1 )
            // InternalLegoLang.g:6953:2: rule__UnString__Group__0__Impl rule__UnString__Group__1
            {
            pushFollow(FOLLOW_52);
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
    // InternalLegoLang.g:6960:1: rule__UnString__Group__0__Impl : ( () ) ;
    public final void rule__UnString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6964:1: ( ( () ) )
            // InternalLegoLang.g:6965:1: ( () )
            {
            // InternalLegoLang.g:6965:1: ( () )
            // InternalLegoLang.g:6966:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnStringAccess().getUnStringAction_0()); 
            }
            // InternalLegoLang.g:6967:2: ()
            // InternalLegoLang.g:6967:3: 
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
    // InternalLegoLang.g:6975:1: rule__UnString__Group__1 : rule__UnString__Group__1__Impl rule__UnString__Group__2 ;
    public final void rule__UnString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6979:1: ( rule__UnString__Group__1__Impl rule__UnString__Group__2 )
            // InternalLegoLang.g:6980:2: rule__UnString__Group__1__Impl rule__UnString__Group__2
            {
            pushFollow(FOLLOW_52);
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
    // InternalLegoLang.g:6987:1: rule__UnString__Group__1__Impl : ( ( rule__UnString__IsConstAssignment_1 )? ) ;
    public final void rule__UnString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:6991:1: ( ( ( rule__UnString__IsConstAssignment_1 )? ) )
            // InternalLegoLang.g:6992:1: ( ( rule__UnString__IsConstAssignment_1 )? )
            {
            // InternalLegoLang.g:6992:1: ( ( rule__UnString__IsConstAssignment_1 )? )
            // InternalLegoLang.g:6993:2: ( rule__UnString__IsConstAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnStringAccess().getIsConstAssignment_1()); 
            }
            // InternalLegoLang.g:6994:2: ( rule__UnString__IsConstAssignment_1 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==62) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalLegoLang.g:6994:3: rule__UnString__IsConstAssignment_1
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
    // InternalLegoLang.g:7002:1: rule__UnString__Group__2 : rule__UnString__Group__2__Impl rule__UnString__Group__3 ;
    public final void rule__UnString__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7006:1: ( rule__UnString__Group__2__Impl rule__UnString__Group__3 )
            // InternalLegoLang.g:7007:2: rule__UnString__Group__2__Impl rule__UnString__Group__3
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
    // InternalLegoLang.g:7014:1: rule__UnString__Group__2__Impl : ( 'string' ) ;
    public final void rule__UnString__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7018:1: ( ( 'string' ) )
            // InternalLegoLang.g:7019:1: ( 'string' )
            {
            // InternalLegoLang.g:7019:1: ( 'string' )
            // InternalLegoLang.g:7020:2: 'string'
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
    // InternalLegoLang.g:7029:1: rule__UnString__Group__3 : rule__UnString__Group__3__Impl rule__UnString__Group__4 ;
    public final void rule__UnString__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7033:1: ( rule__UnString__Group__3__Impl rule__UnString__Group__4 )
            // InternalLegoLang.g:7034:2: rule__UnString__Group__3__Impl rule__UnString__Group__4
            {
            pushFollow(FOLLOW_47);
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
    // InternalLegoLang.g:7041:1: rule__UnString__Group__3__Impl : ( ( rule__UnString__NameAssignment_3 ) ) ;
    public final void rule__UnString__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7045:1: ( ( ( rule__UnString__NameAssignment_3 ) ) )
            // InternalLegoLang.g:7046:1: ( ( rule__UnString__NameAssignment_3 ) )
            {
            // InternalLegoLang.g:7046:1: ( ( rule__UnString__NameAssignment_3 ) )
            // InternalLegoLang.g:7047:2: ( rule__UnString__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnStringAccess().getNameAssignment_3()); 
            }
            // InternalLegoLang.g:7048:2: ( rule__UnString__NameAssignment_3 )
            // InternalLegoLang.g:7048:3: rule__UnString__NameAssignment_3
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
    // InternalLegoLang.g:7056:1: rule__UnString__Group__4 : rule__UnString__Group__4__Impl rule__UnString__Group__5 ;
    public final void rule__UnString__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7060:1: ( rule__UnString__Group__4__Impl rule__UnString__Group__5 )
            // InternalLegoLang.g:7061:2: rule__UnString__Group__4__Impl rule__UnString__Group__5
            {
            pushFollow(FOLLOW_47);
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
    // InternalLegoLang.g:7068:1: rule__UnString__Group__4__Impl : ( ( rule__UnString__Group_4__0 )? ) ;
    public final void rule__UnString__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7072:1: ( ( ( rule__UnString__Group_4__0 )? ) )
            // InternalLegoLang.g:7073:1: ( ( rule__UnString__Group_4__0 )? )
            {
            // InternalLegoLang.g:7073:1: ( ( rule__UnString__Group_4__0 )? )
            // InternalLegoLang.g:7074:2: ( rule__UnString__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnStringAccess().getGroup_4()); 
            }
            // InternalLegoLang.g:7075:2: ( rule__UnString__Group_4__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==25) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalLegoLang.g:7075:3: rule__UnString__Group_4__0
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
    // InternalLegoLang.g:7083:1: rule__UnString__Group__5 : rule__UnString__Group__5__Impl ;
    public final void rule__UnString__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7087:1: ( rule__UnString__Group__5__Impl )
            // InternalLegoLang.g:7088:2: rule__UnString__Group__5__Impl
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
    // InternalLegoLang.g:7094:1: rule__UnString__Group__5__Impl : ( ';' ) ;
    public final void rule__UnString__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7098:1: ( ( ';' ) )
            // InternalLegoLang.g:7099:1: ( ';' )
            {
            // InternalLegoLang.g:7099:1: ( ';' )
            // InternalLegoLang.g:7100:2: ';'
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
    // InternalLegoLang.g:7110:1: rule__UnString__Group_4__0 : rule__UnString__Group_4__0__Impl rule__UnString__Group_4__1 ;
    public final void rule__UnString__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7114:1: ( rule__UnString__Group_4__0__Impl rule__UnString__Group_4__1 )
            // InternalLegoLang.g:7115:2: rule__UnString__Group_4__0__Impl rule__UnString__Group_4__1
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
    // InternalLegoLang.g:7122:1: rule__UnString__Group_4__0__Impl : ( '=' ) ;
    public final void rule__UnString__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7126:1: ( ( '=' ) )
            // InternalLegoLang.g:7127:1: ( '=' )
            {
            // InternalLegoLang.g:7127:1: ( '=' )
            // InternalLegoLang.g:7128:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnStringAccess().getEqualsSignKeyword_4_0()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
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
    // InternalLegoLang.g:7137:1: rule__UnString__Group_4__1 : rule__UnString__Group_4__1__Impl ;
    public final void rule__UnString__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7141:1: ( rule__UnString__Group_4__1__Impl )
            // InternalLegoLang.g:7142:2: rule__UnString__Group_4__1__Impl
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
    // InternalLegoLang.g:7148:1: rule__UnString__Group_4__1__Impl : ( ( rule__UnString__InitialeValueAssignment_4_1 ) ) ;
    public final void rule__UnString__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7152:1: ( ( ( rule__UnString__InitialeValueAssignment_4_1 ) ) )
            // InternalLegoLang.g:7153:1: ( ( rule__UnString__InitialeValueAssignment_4_1 ) )
            {
            // InternalLegoLang.g:7153:1: ( ( rule__UnString__InitialeValueAssignment_4_1 ) )
            // InternalLegoLang.g:7154:2: ( rule__UnString__InitialeValueAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnStringAccess().getInitialeValueAssignment_4_1()); 
            }
            // InternalLegoLang.g:7155:2: ( rule__UnString__InitialeValueAssignment_4_1 )
            // InternalLegoLang.g:7155:3: rule__UnString__InitialeValueAssignment_4_1
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
    // InternalLegoLang.g:7164:1: rule__TheDouble__Group__0 : rule__TheDouble__Group__0__Impl rule__TheDouble__Group__1 ;
    public final void rule__TheDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7168:1: ( rule__TheDouble__Group__0__Impl rule__TheDouble__Group__1 )
            // InternalLegoLang.g:7169:2: rule__TheDouble__Group__0__Impl rule__TheDouble__Group__1
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
    // InternalLegoLang.g:7176:1: rule__TheDouble__Group__0__Impl : ( () ) ;
    public final void rule__TheDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7180:1: ( ( () ) )
            // InternalLegoLang.g:7181:1: ( () )
            {
            // InternalLegoLang.g:7181:1: ( () )
            // InternalLegoLang.g:7182:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheDoubleAccess().getTheDoubleAction_0()); 
            }
            // InternalLegoLang.g:7183:2: ()
            // InternalLegoLang.g:7183:3: 
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
    // InternalLegoLang.g:7191:1: rule__TheDouble__Group__1 : rule__TheDouble__Group__1__Impl rule__TheDouble__Group__2 ;
    public final void rule__TheDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7195:1: ( rule__TheDouble__Group__1__Impl rule__TheDouble__Group__2 )
            // InternalLegoLang.g:7196:2: rule__TheDouble__Group__1__Impl rule__TheDouble__Group__2
            {
            pushFollow(FOLLOW_49);
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
    // InternalLegoLang.g:7203:1: rule__TheDouble__Group__1__Impl : ( ( rule__TheDouble__Value1Assignment_1 ) ) ;
    public final void rule__TheDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7207:1: ( ( ( rule__TheDouble__Value1Assignment_1 ) ) )
            // InternalLegoLang.g:7208:1: ( ( rule__TheDouble__Value1Assignment_1 ) )
            {
            // InternalLegoLang.g:7208:1: ( ( rule__TheDouble__Value1Assignment_1 ) )
            // InternalLegoLang.g:7209:2: ( rule__TheDouble__Value1Assignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheDoubleAccess().getValue1Assignment_1()); 
            }
            // InternalLegoLang.g:7210:2: ( rule__TheDouble__Value1Assignment_1 )
            // InternalLegoLang.g:7210:3: rule__TheDouble__Value1Assignment_1
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
    // InternalLegoLang.g:7218:1: rule__TheDouble__Group__2 : rule__TheDouble__Group__2__Impl rule__TheDouble__Group__3 ;
    public final void rule__TheDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7222:1: ( rule__TheDouble__Group__2__Impl rule__TheDouble__Group__3 )
            // InternalLegoLang.g:7223:2: rule__TheDouble__Group__2__Impl rule__TheDouble__Group__3
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
    // InternalLegoLang.g:7230:1: rule__TheDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__TheDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7234:1: ( ( '.' ) )
            // InternalLegoLang.g:7235:1: ( '.' )
            {
            // InternalLegoLang.g:7235:1: ( '.' )
            // InternalLegoLang.g:7236:2: '.'
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
    // InternalLegoLang.g:7245:1: rule__TheDouble__Group__3 : rule__TheDouble__Group__3__Impl ;
    public final void rule__TheDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7249:1: ( rule__TheDouble__Group__3__Impl )
            // InternalLegoLang.g:7250:2: rule__TheDouble__Group__3__Impl
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
    // InternalLegoLang.g:7256:1: rule__TheDouble__Group__3__Impl : ( ( rule__TheDouble__Value2Assignment_3 ) ) ;
    public final void rule__TheDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7260:1: ( ( ( rule__TheDouble__Value2Assignment_3 ) ) )
            // InternalLegoLang.g:7261:1: ( ( rule__TheDouble__Value2Assignment_3 ) )
            {
            // InternalLegoLang.g:7261:1: ( ( rule__TheDouble__Value2Assignment_3 ) )
            // InternalLegoLang.g:7262:2: ( rule__TheDouble__Value2Assignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheDoubleAccess().getValue2Assignment_3()); 
            }
            // InternalLegoLang.g:7263:2: ( rule__TheDouble__Value2Assignment_3 )
            // InternalLegoLang.g:7263:3: rule__TheDouble__Value2Assignment_3
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
    // InternalLegoLang.g:7272:1: rule__TheInt__Group__0 : rule__TheInt__Group__0__Impl rule__TheInt__Group__1 ;
    public final void rule__TheInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7276:1: ( rule__TheInt__Group__0__Impl rule__TheInt__Group__1 )
            // InternalLegoLang.g:7277:2: rule__TheInt__Group__0__Impl rule__TheInt__Group__1
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
    // InternalLegoLang.g:7284:1: rule__TheInt__Group__0__Impl : ( () ) ;
    public final void rule__TheInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7288:1: ( ( () ) )
            // InternalLegoLang.g:7289:1: ( () )
            {
            // InternalLegoLang.g:7289:1: ( () )
            // InternalLegoLang.g:7290:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheIntAccess().getTheIntAction_0()); 
            }
            // InternalLegoLang.g:7291:2: ()
            // InternalLegoLang.g:7291:3: 
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
    // InternalLegoLang.g:7299:1: rule__TheInt__Group__1 : rule__TheInt__Group__1__Impl ;
    public final void rule__TheInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7303:1: ( rule__TheInt__Group__1__Impl )
            // InternalLegoLang.g:7304:2: rule__TheInt__Group__1__Impl
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
    // InternalLegoLang.g:7310:1: rule__TheInt__Group__1__Impl : ( ( rule__TheInt__ValueAssignment_1 ) ) ;
    public final void rule__TheInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7314:1: ( ( ( rule__TheInt__ValueAssignment_1 ) ) )
            // InternalLegoLang.g:7315:1: ( ( rule__TheInt__ValueAssignment_1 ) )
            {
            // InternalLegoLang.g:7315:1: ( ( rule__TheInt__ValueAssignment_1 ) )
            // InternalLegoLang.g:7316:2: ( rule__TheInt__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheIntAccess().getValueAssignment_1()); 
            }
            // InternalLegoLang.g:7317:2: ( rule__TheInt__ValueAssignment_1 )
            // InternalLegoLang.g:7317:3: rule__TheInt__ValueAssignment_1
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
    // InternalLegoLang.g:7326:1: rule__TheBoolean__Group__0 : rule__TheBoolean__Group__0__Impl rule__TheBoolean__Group__1 ;
    public final void rule__TheBoolean__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7330:1: ( rule__TheBoolean__Group__0__Impl rule__TheBoolean__Group__1 )
            // InternalLegoLang.g:7331:2: rule__TheBoolean__Group__0__Impl rule__TheBoolean__Group__1
            {
            pushFollow(FOLLOW_51);
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
    // InternalLegoLang.g:7338:1: rule__TheBoolean__Group__0__Impl : ( () ) ;
    public final void rule__TheBoolean__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7342:1: ( ( () ) )
            // InternalLegoLang.g:7343:1: ( () )
            {
            // InternalLegoLang.g:7343:1: ( () )
            // InternalLegoLang.g:7344:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheBooleanAccess().getTheBooleanAction_0()); 
            }
            // InternalLegoLang.g:7345:2: ()
            // InternalLegoLang.g:7345:3: 
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
    // InternalLegoLang.g:7353:1: rule__TheBoolean__Group__1 : rule__TheBoolean__Group__1__Impl ;
    public final void rule__TheBoolean__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7357:1: ( rule__TheBoolean__Group__1__Impl )
            // InternalLegoLang.g:7358:2: rule__TheBoolean__Group__1__Impl
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
    // InternalLegoLang.g:7364:1: rule__TheBoolean__Group__1__Impl : ( ( rule__TheBoolean__ValueAssignment_1 ) ) ;
    public final void rule__TheBoolean__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7368:1: ( ( ( rule__TheBoolean__ValueAssignment_1 ) ) )
            // InternalLegoLang.g:7369:1: ( ( rule__TheBoolean__ValueAssignment_1 ) )
            {
            // InternalLegoLang.g:7369:1: ( ( rule__TheBoolean__ValueAssignment_1 ) )
            // InternalLegoLang.g:7370:2: ( rule__TheBoolean__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheBooleanAccess().getValueAssignment_1()); 
            }
            // InternalLegoLang.g:7371:2: ( rule__TheBoolean__ValueAssignment_1 )
            // InternalLegoLang.g:7371:3: rule__TheBoolean__ValueAssignment_1
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
    // InternalLegoLang.g:7380:1: rule__TheString__Group__0 : rule__TheString__Group__0__Impl rule__TheString__Group__1 ;
    public final void rule__TheString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7384:1: ( rule__TheString__Group__0__Impl rule__TheString__Group__1 )
            // InternalLegoLang.g:7385:2: rule__TheString__Group__0__Impl rule__TheString__Group__1
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
    // InternalLegoLang.g:7392:1: rule__TheString__Group__0__Impl : ( () ) ;
    public final void rule__TheString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7396:1: ( ( () ) )
            // InternalLegoLang.g:7397:1: ( () )
            {
            // InternalLegoLang.g:7397:1: ( () )
            // InternalLegoLang.g:7398:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheStringAccess().getTheStringAction_0()); 
            }
            // InternalLegoLang.g:7399:2: ()
            // InternalLegoLang.g:7399:3: 
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
    // InternalLegoLang.g:7407:1: rule__TheString__Group__1 : rule__TheString__Group__1__Impl ;
    public final void rule__TheString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7411:1: ( rule__TheString__Group__1__Impl )
            // InternalLegoLang.g:7412:2: rule__TheString__Group__1__Impl
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
    // InternalLegoLang.g:7418:1: rule__TheString__Group__1__Impl : ( ( rule__TheString__ValueAssignment_1 ) ) ;
    public final void rule__TheString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7422:1: ( ( ( rule__TheString__ValueAssignment_1 ) ) )
            // InternalLegoLang.g:7423:1: ( ( rule__TheString__ValueAssignment_1 ) )
            {
            // InternalLegoLang.g:7423:1: ( ( rule__TheString__ValueAssignment_1 ) )
            // InternalLegoLang.g:7424:2: ( rule__TheString__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheStringAccess().getValueAssignment_1()); 
            }
            // InternalLegoLang.g:7425:2: ( rule__TheString__ValueAssignment_1 )
            // InternalLegoLang.g:7425:3: rule__TheString__ValueAssignment_1
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
    // InternalLegoLang.g:7434:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7438:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalLegoLang.g:7439:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_49);
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
    // InternalLegoLang.g:7446:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7450:1: ( ( RULE_ID ) )
            // InternalLegoLang.g:7451:1: ( RULE_ID )
            {
            // InternalLegoLang.g:7451:1: ( RULE_ID )
            // InternalLegoLang.g:7452:2: RULE_ID
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
    // InternalLegoLang.g:7461:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7465:1: ( rule__FQN__Group__1__Impl )
            // InternalLegoLang.g:7466:2: rule__FQN__Group__1__Impl
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
    // InternalLegoLang.g:7472:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7476:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalLegoLang.g:7477:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalLegoLang.g:7477:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalLegoLang.g:7478:2: ( rule__FQN__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getGroup_1()); 
            }
            // InternalLegoLang.g:7479:2: ( rule__FQN__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==59) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalLegoLang.g:7479:3: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_53);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalLegoLang.g:7488:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7492:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalLegoLang.g:7493:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalLegoLang.g:7500:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7504:1: ( ( '.' ) )
            // InternalLegoLang.g:7505:1: ( '.' )
            {
            // InternalLegoLang.g:7505:1: ( '.' )
            // InternalLegoLang.g:7506:2: '.'
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
    // InternalLegoLang.g:7515:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7519:1: ( rule__FQN__Group_1__1__Impl )
            // InternalLegoLang.g:7520:2: rule__FQN__Group_1__1__Impl
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
    // InternalLegoLang.g:7526:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7530:1: ( ( RULE_ID ) )
            // InternalLegoLang.g:7531:1: ( RULE_ID )
            {
            // InternalLegoLang.g:7531:1: ( RULE_ID )
            // InternalLegoLang.g:7532:2: RULE_ID
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
    // InternalLegoLang.g:7542:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7546:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalLegoLang.g:7547:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
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
    // InternalLegoLang.g:7554:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7558:1: ( ( ( '-' )? ) )
            // InternalLegoLang.g:7559:1: ( ( '-' )? )
            {
            // InternalLegoLang.g:7559:1: ( ( '-' )? )
            // InternalLegoLang.g:7560:2: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            }
            // InternalLegoLang.g:7561:2: ( '-' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==44) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalLegoLang.g:7561:3: '-'
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
    // InternalLegoLang.g:7569:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7573:1: ( rule__EInt__Group__1__Impl )
            // InternalLegoLang.g:7574:2: rule__EInt__Group__1__Impl
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
    // InternalLegoLang.g:7580:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7584:1: ( ( RULE_INT ) )
            // InternalLegoLang.g:7585:1: ( RULE_INT )
            {
            // InternalLegoLang.g:7585:1: ( RULE_INT )
            // InternalLegoLang.g:7586:2: RULE_INT
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
    // InternalLegoLang.g:7596:1: rule__Program__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Program__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7600:1: ( ( ruleEString ) )
            // InternalLegoLang.g:7601:2: ( ruleEString )
            {
            // InternalLegoLang.g:7601:2: ( ruleEString )
            // InternalLegoLang.g:7602:3: ruleEString
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
    // InternalLegoLang.g:7611:1: rule__Program__StatementAssignment_4 : ( ruleStatement ) ;
    public final void rule__Program__StatementAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7615:1: ( ( ruleStatement ) )
            // InternalLegoLang.g:7616:2: ( ruleStatement )
            {
            // InternalLegoLang.g:7616:2: ( ruleStatement )
            // InternalLegoLang.g:7617:3: ruleStatement
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
    // InternalLegoLang.g:7626:1: rule__WheelEngine__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__WheelEngine__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7630:1: ( ( ruleEString ) )
            // InternalLegoLang.g:7631:2: ( ruleEString )
            {
            // InternalLegoLang.g:7631:2: ( ruleEString )
            // InternalLegoLang.g:7632:3: ruleEString
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
    // InternalLegoLang.g:7641:1: rule__WheelEngine__PositionAssignment_2 : ( ruleEString ) ;
    public final void rule__WheelEngine__PositionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7645:1: ( ( ruleEString ) )
            // InternalLegoLang.g:7646:2: ( ruleEString )
            {
            // InternalLegoLang.g:7646:2: ( ruleEString )
            // InternalLegoLang.g:7647:3: ruleEString
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
    // InternalLegoLang.g:7656:1: rule__ColorSensor__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__ColorSensor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7660:1: ( ( ruleEString ) )
            // InternalLegoLang.g:7661:2: ( ruleEString )
            {
            // InternalLegoLang.g:7661:2: ( ruleEString )
            // InternalLegoLang.g:7662:3: ruleEString
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
    // InternalLegoLang.g:7671:1: rule__ColorSensor__PositionAssignment_2 : ( ruleEInt ) ;
    public final void rule__ColorSensor__PositionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7675:1: ( ( ruleEInt ) )
            // InternalLegoLang.g:7676:2: ( ruleEInt )
            {
            // InternalLegoLang.g:7676:2: ( ruleEInt )
            // InternalLegoLang.g:7677:3: ruleEInt
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
    // InternalLegoLang.g:7686:1: rule__LaserSensor__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__LaserSensor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7690:1: ( ( ruleEString ) )
            // InternalLegoLang.g:7691:2: ( ruleEString )
            {
            // InternalLegoLang.g:7691:2: ( ruleEString )
            // InternalLegoLang.g:7692:3: ruleEString
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
    // InternalLegoLang.g:7701:1: rule__LaserSensor__PositionAssignment_2 : ( ruleEInt ) ;
    public final void rule__LaserSensor__PositionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7705:1: ( ( ruleEInt ) )
            // InternalLegoLang.g:7706:2: ( ruleEInt )
            {
            // InternalLegoLang.g:7706:2: ( ruleEInt )
            // InternalLegoLang.g:7707:3: ruleEInt
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
    // InternalLegoLang.g:7716:1: rule__GPSSensor__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__GPSSensor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7720:1: ( ( ruleEString ) )
            // InternalLegoLang.g:7721:2: ( ruleEString )
            {
            // InternalLegoLang.g:7721:2: ( ruleEString )
            // InternalLegoLang.g:7722:3: ruleEString
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
    // InternalLegoLang.g:7731:1: rule__GPSSensor__PositionAssignment_2 : ( ruleEInt ) ;
    public final void rule__GPSSensor__PositionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7735:1: ( ( ruleEInt ) )
            // InternalLegoLang.g:7736:2: ( ruleEInt )
            {
            // InternalLegoLang.g:7736:2: ( ruleEInt )
            // InternalLegoLang.g:7737:3: ruleEInt
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
    // InternalLegoLang.g:7746:1: rule__GyroSensor__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__GyroSensor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7750:1: ( ( ruleEString ) )
            // InternalLegoLang.g:7751:2: ( ruleEString )
            {
            // InternalLegoLang.g:7751:2: ( ruleEString )
            // InternalLegoLang.g:7752:3: ruleEString
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
    // InternalLegoLang.g:7761:1: rule__GyroSensor__PositionAssignment_2 : ( ruleEInt ) ;
    public final void rule__GyroSensor__PositionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7765:1: ( ( ruleEInt ) )
            // InternalLegoLang.g:7766:2: ( ruleEInt )
            {
            // InternalLegoLang.g:7766:2: ( ruleEInt )
            // InternalLegoLang.g:7767:3: ruleEInt
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
    // InternalLegoLang.g:7776:1: rule__UltraSonicSensor__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__UltraSonicSensor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7780:1: ( ( ruleEString ) )
            // InternalLegoLang.g:7781:2: ( ruleEString )
            {
            // InternalLegoLang.g:7781:2: ( ruleEString )
            // InternalLegoLang.g:7782:3: ruleEString
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
    // InternalLegoLang.g:7791:1: rule__UltraSonicSensor__PositionAssignment_2 : ( ruleEInt ) ;
    public final void rule__UltraSonicSensor__PositionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7795:1: ( ( ruleEInt ) )
            // InternalLegoLang.g:7796:2: ( ruleEInt )
            {
            // InternalLegoLang.g:7796:2: ( ruleEInt )
            // InternalLegoLang.g:7797:3: ruleEInt
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
    // InternalLegoLang.g:7806:1: rule__Car__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Car__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7810:1: ( ( ruleEString ) )
            // InternalLegoLang.g:7811:2: ( ruleEString )
            {
            // InternalLegoLang.g:7811:2: ( ruleEString )
            // InternalLegoLang.g:7812:3: ruleEString
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
    // InternalLegoLang.g:7821:1: rule__Car__SensorAssignment_3 : ( ruleSensor ) ;
    public final void rule__Car__SensorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7825:1: ( ( ruleSensor ) )
            // InternalLegoLang.g:7826:2: ( ruleSensor )
            {
            // InternalLegoLang.g:7826:2: ( ruleSensor )
            // InternalLegoLang.g:7827:3: ruleSensor
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
    // InternalLegoLang.g:7836:1: rule__Car__EngineAssignment_4 : ( ruleEngine ) ;
    public final void rule__Car__EngineAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7840:1: ( ( ruleEngine ) )
            // InternalLegoLang.g:7841:2: ( ruleEngine )
            {
            // InternalLegoLang.g:7841:2: ( ruleEngine )
            // InternalLegoLang.g:7842:3: ruleEngine
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


    // $ANTLR start "rule__VitesseOperation__WheelengineAssignment_0"
    // InternalLegoLang.g:7851:1: rule__VitesseOperation__WheelengineAssignment_0 : ( ( ruleFQN ) ) ;
    public final void rule__VitesseOperation__WheelengineAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7855:1: ( ( ( ruleFQN ) ) )
            // InternalLegoLang.g:7856:2: ( ( ruleFQN ) )
            {
            // InternalLegoLang.g:7856:2: ( ( ruleFQN ) )
            // InternalLegoLang.g:7857:3: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVitesseOperationAccess().getWheelengineWheelEngineCrossReference_0_0()); 
            }
            // InternalLegoLang.g:7858:3: ( ruleFQN )
            // InternalLegoLang.g:7859:4: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVitesseOperationAccess().getWheelengineWheelEngineFQNParserRuleCall_0_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVitesseOperationAccess().getWheelengineWheelEngineFQNParserRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVitesseOperationAccess().getWheelengineWheelEngineCrossReference_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VitesseOperation__WheelengineAssignment_0"


    // $ANTLR start "rule__VitesseOperation__RightAssignment_4"
    // InternalLegoLang.g:7870:1: rule__VitesseOperation__RightAssignment_4 : ( ruleExpression ) ;
    public final void rule__VitesseOperation__RightAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7874:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:7875:2: ( ruleExpression )
            {
            // InternalLegoLang.g:7875:2: ( ruleExpression )
            // InternalLegoLang.g:7876:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVitesseOperationAccess().getRightExpressionParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVitesseOperationAccess().getRightExpressionParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VitesseOperation__RightAssignment_4"


    // $ANTLR start "rule__ColorOperation__ColorsensorAssignment_3"
    // InternalLegoLang.g:7885:1: rule__ColorOperation__ColorsensorAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__ColorOperation__ColorsensorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7889:1: ( ( ( ruleFQN ) ) )
            // InternalLegoLang.g:7890:2: ( ( ruleFQN ) )
            {
            // InternalLegoLang.g:7890:2: ( ( ruleFQN ) )
            // InternalLegoLang.g:7891:3: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorOperationAccess().getColorsensorColorSensorCrossReference_3_0()); 
            }
            // InternalLegoLang.g:7892:3: ( ruleFQN )
            // InternalLegoLang.g:7893:4: ruleFQN
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
    // InternalLegoLang.g:7904:1: rule__IntensityOperation__ColorsensorAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__IntensityOperation__ColorsensorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7908:1: ( ( ( ruleFQN ) ) )
            // InternalLegoLang.g:7909:2: ( ( ruleFQN ) )
            {
            // InternalLegoLang.g:7909:2: ( ( ruleFQN ) )
            // InternalLegoLang.g:7910:3: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntensityOperationAccess().getColorsensorColorSensorCrossReference_3_0()); 
            }
            // InternalLegoLang.g:7911:3: ( ruleFQN )
            // InternalLegoLang.g:7912:4: ruleFQN
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
    // InternalLegoLang.g:7923:1: rule__RangeOperation__LasersensorAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__RangeOperation__LasersensorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7927:1: ( ( ( ruleFQN ) ) )
            // InternalLegoLang.g:7928:2: ( ( ruleFQN ) )
            {
            // InternalLegoLang.g:7928:2: ( ( ruleFQN ) )
            // InternalLegoLang.g:7929:3: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeOperationAccess().getLasersensorLaserSensorCrossReference_3_0()); 
            }
            // InternalLegoLang.g:7930:3: ( ruleFQN )
            // InternalLegoLang.g:7931:4: ruleFQN
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
    // InternalLegoLang.g:7942:1: rule__XGPSOperation__GpssensorAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__XGPSOperation__GpssensorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7946:1: ( ( ( ruleFQN ) ) )
            // InternalLegoLang.g:7947:2: ( ( ruleFQN ) )
            {
            // InternalLegoLang.g:7947:2: ( ( ruleFQN ) )
            // InternalLegoLang.g:7948:3: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGPSOperationAccess().getGpssensorGPSSensorCrossReference_3_0()); 
            }
            // InternalLegoLang.g:7949:3: ( ruleFQN )
            // InternalLegoLang.g:7950:4: ruleFQN
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
    // InternalLegoLang.g:7961:1: rule__YGPSOperation__GpssensorAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__YGPSOperation__GpssensorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7965:1: ( ( ( ruleFQN ) ) )
            // InternalLegoLang.g:7966:2: ( ( ruleFQN ) )
            {
            // InternalLegoLang.g:7966:2: ( ( ruleFQN ) )
            // InternalLegoLang.g:7967:3: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYGPSOperationAccess().getGpssensorGPSSensorCrossReference_3_0()); 
            }
            // InternalLegoLang.g:7968:3: ( ruleFQN )
            // InternalLegoLang.g:7969:4: ruleFQN
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
    // InternalLegoLang.g:7980:1: rule__AngleOperation__GyrosensorAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__AngleOperation__GyrosensorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:7984:1: ( ( ( ruleFQN ) ) )
            // InternalLegoLang.g:7985:2: ( ( ruleFQN ) )
            {
            // InternalLegoLang.g:7985:2: ( ( ruleFQN ) )
            // InternalLegoLang.g:7986:3: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAngleOperationAccess().getGyrosensorGyroSensorCrossReference_3_0()); 
            }
            // InternalLegoLang.g:7987:3: ( ruleFQN )
            // InternalLegoLang.g:7988:4: ruleFQN
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
    // InternalLegoLang.g:7999:1: rule__DistanceOperation__UltrasonicsensorAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__DistanceOperation__UltrasonicsensorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8003:1: ( ( ( ruleFQN ) ) )
            // InternalLegoLang.g:8004:2: ( ( ruleFQN ) )
            {
            // InternalLegoLang.g:8004:2: ( ( ruleFQN ) )
            // InternalLegoLang.g:8005:3: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDistanceOperationAccess().getUltrasonicsensorUltraSonicSensorCrossReference_3_0()); 
            }
            // InternalLegoLang.g:8006:3: ( ruleFQN )
            // InternalLegoLang.g:8007:4: ruleFQN
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


    // $ANTLR start "rule__ConditionEtat__ConditionAssignment_1"
    // InternalLegoLang.g:8018:1: rule__ConditionEtat__ConditionAssignment_1 : ( ruleComparaison ) ;
    public final void rule__ConditionEtat__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8022:1: ( ( ruleComparaison ) )
            // InternalLegoLang.g:8023:2: ( ruleComparaison )
            {
            // InternalLegoLang.g:8023:2: ( ruleComparaison )
            // InternalLegoLang.g:8024:3: ruleComparaison
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


    // $ANTLR start "rule__ConditionEtat__ConditionAssignment_2_1"
    // InternalLegoLang.g:8033:1: rule__ConditionEtat__ConditionAssignment_2_1 : ( ruleComparaison ) ;
    public final void rule__ConditionEtat__ConditionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8037:1: ( ( ruleComparaison ) )
            // InternalLegoLang.g:8038:2: ( ruleComparaison )
            {
            // InternalLegoLang.g:8038:2: ( ruleComparaison )
            // InternalLegoLang.g:8039:3: ruleComparaison
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionEtatAccess().getConditionComparaisonParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleComparaison();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionEtatAccess().getConditionComparaisonParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionEtat__ConditionAssignment_2_1"


    // $ANTLR start "rule__ConditionEtat__ConditionAssignment_3_1"
    // InternalLegoLang.g:8048:1: rule__ConditionEtat__ConditionAssignment_3_1 : ( ruleComparaison ) ;
    public final void rule__ConditionEtat__ConditionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8052:1: ( ( ruleComparaison ) )
            // InternalLegoLang.g:8053:2: ( ruleComparaison )
            {
            // InternalLegoLang.g:8053:2: ( ruleComparaison )
            // InternalLegoLang.g:8054:3: ruleComparaison
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionEtatAccess().getConditionComparaisonParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleComparaison();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionEtatAccess().getConditionComparaisonParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionEtat__ConditionAssignment_3_1"


    // $ANTLR start "rule__ConditionEtat__ThenAssignment_5"
    // InternalLegoLang.g:8063:1: rule__ConditionEtat__ThenAssignment_5 : ( ruleStatement ) ;
    public final void rule__ConditionEtat__ThenAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8067:1: ( ( ruleStatement ) )
            // InternalLegoLang.g:8068:2: ( ruleStatement )
            {
            // InternalLegoLang.g:8068:2: ( ruleStatement )
            // InternalLegoLang.g:8069:3: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionEtatAccess().getThenStatementParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionEtatAccess().getThenStatementParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionEtat__ThenAssignment_5"


    // $ANTLR start "rule__ConditionEtat__ElseAssignment_7_1"
    // InternalLegoLang.g:8078:1: rule__ConditionEtat__ElseAssignment_7_1 : ( ruleStatement ) ;
    public final void rule__ConditionEtat__ElseAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8082:1: ( ( ruleStatement ) )
            // InternalLegoLang.g:8083:2: ( ruleStatement )
            {
            // InternalLegoLang.g:8083:2: ( ruleStatement )
            // InternalLegoLang.g:8084:3: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionEtatAccess().getElseStatementParserRuleCall_7_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionEtatAccess().getElseStatementParserRuleCall_7_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionEtat__ElseAssignment_7_1"


    // $ANTLR start "rule__WhileLoop__LoopConditionAssignment_1"
    // InternalLegoLang.g:8093:1: rule__WhileLoop__LoopConditionAssignment_1 : ( ruleComparaison ) ;
    public final void rule__WhileLoop__LoopConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8097:1: ( ( ruleComparaison ) )
            // InternalLegoLang.g:8098:2: ( ruleComparaison )
            {
            // InternalLegoLang.g:8098:2: ( ruleComparaison )
            // InternalLegoLang.g:8099:3: ruleComparaison
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
    // InternalLegoLang.g:8108:1: rule__WhileLoop__StatementAssignment_3 : ( ruleStatement ) ;
    public final void rule__WhileLoop__StatementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8112:1: ( ( ruleStatement ) )
            // InternalLegoLang.g:8113:2: ( ruleStatement )
            {
            // InternalLegoLang.g:8113:2: ( ruleStatement )
            // InternalLegoLang.g:8114:3: ruleStatement
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
    // InternalLegoLang.g:8123:1: rule__MethodePrint__ExpressionAssignment_2_0 : ( ruleExpression ) ;
    public final void rule__MethodePrint__ExpressionAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8127:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:8128:2: ( ruleExpression )
            {
            // InternalLegoLang.g:8128:2: ( ruleExpression )
            // InternalLegoLang.g:8129:3: ruleExpression
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
    // InternalLegoLang.g:8138:1: rule__VariableRef__VariableAssignment : ( ( ruleEString ) ) ;
    public final void rule__VariableRef__VariableAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8142:1: ( ( ( ruleEString ) ) )
            // InternalLegoLang.g:8143:2: ( ( ruleEString ) )
            {
            // InternalLegoLang.g:8143:2: ( ( ruleEString ) )
            // InternalLegoLang.g:8144:3: ( ruleEString )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableRefAccess().getVariableVariableCrossReference_0()); 
            }
            // InternalLegoLang.g:8145:3: ( ruleEString )
            // InternalLegoLang.g:8146:4: ruleEString
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
    // InternalLegoLang.g:8157:1: rule__Substraction__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__Substraction__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8161:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:8162:2: ( ruleExpression )
            {
            // InternalLegoLang.g:8162:2: ( ruleExpression )
            // InternalLegoLang.g:8163:3: ruleExpression
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
    // InternalLegoLang.g:8172:1: rule__Substraction__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__Substraction__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8176:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:8177:2: ( ruleExpression )
            {
            // InternalLegoLang.g:8177:2: ( ruleExpression )
            // InternalLegoLang.g:8178:3: ruleExpression
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
    // InternalLegoLang.g:8187:1: rule__Addition__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__Addition__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8191:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:8192:2: ( ruleExpression )
            {
            // InternalLegoLang.g:8192:2: ( ruleExpression )
            // InternalLegoLang.g:8193:3: ruleExpression
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
    // InternalLegoLang.g:8202:1: rule__Addition__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__Addition__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8206:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:8207:2: ( ruleExpression )
            {
            // InternalLegoLang.g:8207:2: ( ruleExpression )
            // InternalLegoLang.g:8208:3: ruleExpression
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
    // InternalLegoLang.g:8217:1: rule__Multiplication__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__Multiplication__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8221:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:8222:2: ( ruleExpression )
            {
            // InternalLegoLang.g:8222:2: ( ruleExpression )
            // InternalLegoLang.g:8223:3: ruleExpression
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
    // InternalLegoLang.g:8232:1: rule__Multiplication__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__Multiplication__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8236:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:8237:2: ( ruleExpression )
            {
            // InternalLegoLang.g:8237:2: ( ruleExpression )
            // InternalLegoLang.g:8238:3: ruleExpression
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
    // InternalLegoLang.g:8247:1: rule__Division__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__Division__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8251:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:8252:2: ( ruleExpression )
            {
            // InternalLegoLang.g:8252:2: ( ruleExpression )
            // InternalLegoLang.g:8253:3: ruleExpression
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
    // InternalLegoLang.g:8262:1: rule__Division__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__Division__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8266:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:8267:2: ( ruleExpression )
            {
            // InternalLegoLang.g:8267:2: ( ruleExpression )
            // InternalLegoLang.g:8268:3: ruleExpression
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
    // InternalLegoLang.g:8277:1: rule__GT__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__GT__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8281:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:8282:2: ( ruleExpression )
            {
            // InternalLegoLang.g:8282:2: ( ruleExpression )
            // InternalLegoLang.g:8283:3: ruleExpression
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
    // InternalLegoLang.g:8292:1: rule__GT__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__GT__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8296:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:8297:2: ( ruleExpression )
            {
            // InternalLegoLang.g:8297:2: ( ruleExpression )
            // InternalLegoLang.g:8298:3: ruleExpression
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
    // InternalLegoLang.g:8307:1: rule__LT__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__LT__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8311:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:8312:2: ( ruleExpression )
            {
            // InternalLegoLang.g:8312:2: ( ruleExpression )
            // InternalLegoLang.g:8313:3: ruleExpression
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
    // InternalLegoLang.g:8322:1: rule__LT__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__LT__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8326:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:8327:2: ( ruleExpression )
            {
            // InternalLegoLang.g:8327:2: ( ruleExpression )
            // InternalLegoLang.g:8328:3: ruleExpression
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
    // InternalLegoLang.g:8337:1: rule__Equal__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__Equal__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8341:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:8342:2: ( ruleExpression )
            {
            // InternalLegoLang.g:8342:2: ( ruleExpression )
            // InternalLegoLang.g:8343:3: ruleExpression
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
    // InternalLegoLang.g:8352:1: rule__Equal__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__Equal__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8356:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:8357:2: ( ruleExpression )
            {
            // InternalLegoLang.g:8357:2: ( ruleExpression )
            // InternalLegoLang.g:8358:3: ruleExpression
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
    // InternalLegoLang.g:8367:1: rule__Different__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__Different__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8371:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:8372:2: ( ruleExpression )
            {
            // InternalLegoLang.g:8372:2: ( ruleExpression )
            // InternalLegoLang.g:8373:3: ruleExpression
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
    // InternalLegoLang.g:8382:1: rule__Different__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__Different__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8386:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:8387:2: ( ruleExpression )
            {
            // InternalLegoLang.g:8387:2: ( ruleExpression )
            // InternalLegoLang.g:8388:3: ruleExpression
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
    // InternalLegoLang.g:8397:1: rule__LTorEqual__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__LTorEqual__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8401:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:8402:2: ( ruleExpression )
            {
            // InternalLegoLang.g:8402:2: ( ruleExpression )
            // InternalLegoLang.g:8403:3: ruleExpression
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
    // InternalLegoLang.g:8412:1: rule__LTorEqual__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__LTorEqual__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8416:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:8417:2: ( ruleExpression )
            {
            // InternalLegoLang.g:8417:2: ( ruleExpression )
            // InternalLegoLang.g:8418:3: ruleExpression
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
    // InternalLegoLang.g:8427:1: rule__GTorEqual__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__GTorEqual__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8431:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:8432:2: ( ruleExpression )
            {
            // InternalLegoLang.g:8432:2: ( ruleExpression )
            // InternalLegoLang.g:8433:3: ruleExpression
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
    // InternalLegoLang.g:8442:1: rule__GTorEqual__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__GTorEqual__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8446:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:8447:2: ( ruleExpression )
            {
            // InternalLegoLang.g:8447:2: ( ruleExpression )
            // InternalLegoLang.g:8448:3: ruleExpression
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
    // InternalLegoLang.g:8457:1: rule__Assignement__LeftAssignment_2 : ( ruleExpression ) ;
    public final void rule__Assignement__LeftAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8461:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:8462:2: ( ruleExpression )
            {
            // InternalLegoLang.g:8462:2: ( ruleExpression )
            // InternalLegoLang.g:8463:3: ruleExpression
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
    // InternalLegoLang.g:8472:1: rule__Assignement__RightAssignment_4 : ( ruleExpression ) ;
    public final void rule__Assignement__RightAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8476:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:8477:2: ( ruleExpression )
            {
            // InternalLegoLang.g:8477:2: ( ruleExpression )
            // InternalLegoLang.g:8478:3: ruleExpression
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
    // InternalLegoLang.g:8487:1: rule__PlusEqual__LeftAssignment_2 : ( ruleExpression ) ;
    public final void rule__PlusEqual__LeftAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8491:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:8492:2: ( ruleExpression )
            {
            // InternalLegoLang.g:8492:2: ( ruleExpression )
            // InternalLegoLang.g:8493:3: ruleExpression
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
    // InternalLegoLang.g:8502:1: rule__PlusEqual__RightAssignment_4 : ( ruleExpression ) ;
    public final void rule__PlusEqual__RightAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8506:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:8507:2: ( ruleExpression )
            {
            // InternalLegoLang.g:8507:2: ( ruleExpression )
            // InternalLegoLang.g:8508:3: ruleExpression
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
    // InternalLegoLang.g:8517:1: rule__MinusEqual__LeftAssignment_2 : ( ruleExpression ) ;
    public final void rule__MinusEqual__LeftAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8521:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:8522:2: ( ruleExpression )
            {
            // InternalLegoLang.g:8522:2: ( ruleExpression )
            // InternalLegoLang.g:8523:3: ruleExpression
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
    // InternalLegoLang.g:8532:1: rule__MinusEqual__RightAssignment_4 : ( ruleExpression ) ;
    public final void rule__MinusEqual__RightAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8536:1: ( ( ruleExpression ) )
            // InternalLegoLang.g:8537:2: ( ruleExpression )
            {
            // InternalLegoLang.g:8537:2: ( ruleExpression )
            // InternalLegoLang.g:8538:3: ruleExpression
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
    // InternalLegoLang.g:8547:1: rule__UnInteger__IsConstAssignment_1 : ( ( 'const' ) ) ;
    public final void rule__UnInteger__IsConstAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8551:1: ( ( ( 'const' ) ) )
            // InternalLegoLang.g:8552:2: ( ( 'const' ) )
            {
            // InternalLegoLang.g:8552:2: ( ( 'const' ) )
            // InternalLegoLang.g:8553:3: ( 'const' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnIntegerAccess().getIsConstConstKeyword_1_0()); 
            }
            // InternalLegoLang.g:8554:3: ( 'const' )
            // InternalLegoLang.g:8555:4: 'const'
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
    // InternalLegoLang.g:8566:1: rule__UnInteger__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__UnInteger__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8570:1: ( ( ruleEString ) )
            // InternalLegoLang.g:8571:2: ( ruleEString )
            {
            // InternalLegoLang.g:8571:2: ( ruleEString )
            // InternalLegoLang.g:8572:3: ruleEString
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
    // InternalLegoLang.g:8581:1: rule__UnInteger__InitialeValueAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__UnInteger__InitialeValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8585:1: ( ( ruleEInt ) )
            // InternalLegoLang.g:8586:2: ( ruleEInt )
            {
            // InternalLegoLang.g:8586:2: ( ruleEInt )
            // InternalLegoLang.g:8587:3: ruleEInt
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
    // InternalLegoLang.g:8596:1: rule__UnDouble__IsConstAssignment_1 : ( ( 'const' ) ) ;
    public final void rule__UnDouble__IsConstAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8600:1: ( ( ( 'const' ) ) )
            // InternalLegoLang.g:8601:2: ( ( 'const' ) )
            {
            // InternalLegoLang.g:8601:2: ( ( 'const' ) )
            // InternalLegoLang.g:8602:3: ( 'const' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnDoubleAccess().getIsConstConstKeyword_1_0()); 
            }
            // InternalLegoLang.g:8603:3: ( 'const' )
            // InternalLegoLang.g:8604:4: 'const'
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
    // InternalLegoLang.g:8615:1: rule__UnDouble__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__UnDouble__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8619:1: ( ( ruleEString ) )
            // InternalLegoLang.g:8620:2: ( ruleEString )
            {
            // InternalLegoLang.g:8620:2: ( ruleEString )
            // InternalLegoLang.g:8621:3: ruleEString
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
    // InternalLegoLang.g:8630:1: rule__UnDouble__InitialeValue1Assignment_4_1 : ( ruleEInt ) ;
    public final void rule__UnDouble__InitialeValue1Assignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8634:1: ( ( ruleEInt ) )
            // InternalLegoLang.g:8635:2: ( ruleEInt )
            {
            // InternalLegoLang.g:8635:2: ( ruleEInt )
            // InternalLegoLang.g:8636:3: ruleEInt
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
    // InternalLegoLang.g:8645:1: rule__UnDouble__InitialeValue2Assignment_4_2_1 : ( ruleEInt ) ;
    public final void rule__UnDouble__InitialeValue2Assignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8649:1: ( ( ruleEInt ) )
            // InternalLegoLang.g:8650:2: ( ruleEInt )
            {
            // InternalLegoLang.g:8650:2: ( ruleEInt )
            // InternalLegoLang.g:8651:3: ruleEInt
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
    // InternalLegoLang.g:8660:1: rule__UnBoolean__IsConstAssignment_1 : ( ( 'const' ) ) ;
    public final void rule__UnBoolean__IsConstAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8664:1: ( ( ( 'const' ) ) )
            // InternalLegoLang.g:8665:2: ( ( 'const' ) )
            {
            // InternalLegoLang.g:8665:2: ( ( 'const' ) )
            // InternalLegoLang.g:8666:3: ( 'const' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnBooleanAccess().getIsConstConstKeyword_1_0()); 
            }
            // InternalLegoLang.g:8667:3: ( 'const' )
            // InternalLegoLang.g:8668:4: 'const'
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
    // InternalLegoLang.g:8679:1: rule__UnBoolean__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__UnBoolean__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8683:1: ( ( ruleEString ) )
            // InternalLegoLang.g:8684:2: ( ruleEString )
            {
            // InternalLegoLang.g:8684:2: ( ruleEString )
            // InternalLegoLang.g:8685:3: ruleEString
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
    // InternalLegoLang.g:8694:1: rule__UnBoolean__InitialeValueAssignment_4_1 : ( ruleEBoolean ) ;
    public final void rule__UnBoolean__InitialeValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8698:1: ( ( ruleEBoolean ) )
            // InternalLegoLang.g:8699:2: ( ruleEBoolean )
            {
            // InternalLegoLang.g:8699:2: ( ruleEBoolean )
            // InternalLegoLang.g:8700:3: ruleEBoolean
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
    // InternalLegoLang.g:8709:1: rule__UnString__IsConstAssignment_1 : ( ( 'const' ) ) ;
    public final void rule__UnString__IsConstAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8713:1: ( ( ( 'const' ) ) )
            // InternalLegoLang.g:8714:2: ( ( 'const' ) )
            {
            // InternalLegoLang.g:8714:2: ( ( 'const' ) )
            // InternalLegoLang.g:8715:3: ( 'const' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnStringAccess().getIsConstConstKeyword_1_0()); 
            }
            // InternalLegoLang.g:8716:3: ( 'const' )
            // InternalLegoLang.g:8717:4: 'const'
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
    // InternalLegoLang.g:8728:1: rule__UnString__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__UnString__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8732:1: ( ( ruleEString ) )
            // InternalLegoLang.g:8733:2: ( ruleEString )
            {
            // InternalLegoLang.g:8733:2: ( ruleEString )
            // InternalLegoLang.g:8734:3: ruleEString
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
    // InternalLegoLang.g:8743:1: rule__UnString__InitialeValueAssignment_4_1 : ( ruleEString ) ;
    public final void rule__UnString__InitialeValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8747:1: ( ( ruleEString ) )
            // InternalLegoLang.g:8748:2: ( ruleEString )
            {
            // InternalLegoLang.g:8748:2: ( ruleEString )
            // InternalLegoLang.g:8749:3: ruleEString
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
    // InternalLegoLang.g:8758:1: rule__TheDouble__Value1Assignment_1 : ( ruleEInt ) ;
    public final void rule__TheDouble__Value1Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8762:1: ( ( ruleEInt ) )
            // InternalLegoLang.g:8763:2: ( ruleEInt )
            {
            // InternalLegoLang.g:8763:2: ( ruleEInt )
            // InternalLegoLang.g:8764:3: ruleEInt
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
    // InternalLegoLang.g:8773:1: rule__TheDouble__Value2Assignment_3 : ( ruleEInt ) ;
    public final void rule__TheDouble__Value2Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8777:1: ( ( ruleEInt ) )
            // InternalLegoLang.g:8778:2: ( ruleEInt )
            {
            // InternalLegoLang.g:8778:2: ( ruleEInt )
            // InternalLegoLang.g:8779:3: ruleEInt
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
    // InternalLegoLang.g:8788:1: rule__TheInt__ValueAssignment_1 : ( ruleEInt ) ;
    public final void rule__TheInt__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8792:1: ( ( ruleEInt ) )
            // InternalLegoLang.g:8793:2: ( ruleEInt )
            {
            // InternalLegoLang.g:8793:2: ( ruleEInt )
            // InternalLegoLang.g:8794:3: ruleEInt
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
    // InternalLegoLang.g:8803:1: rule__TheBoolean__ValueAssignment_1 : ( ruleEBoolean ) ;
    public final void rule__TheBoolean__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8807:1: ( ( ruleEBoolean ) )
            // InternalLegoLang.g:8808:2: ( ruleEBoolean )
            {
            // InternalLegoLang.g:8808:2: ( ruleEBoolean )
            // InternalLegoLang.g:8809:3: ruleEBoolean
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
    // InternalLegoLang.g:8818:1: rule__TheString__ValueAssignment_1 : ( ruleEString ) ;
    public final void rule__TheString__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLegoLang.g:8822:1: ( ( ruleEString ) )
            // InternalLegoLang.g:8823:2: ( ruleEString )
            {
            // InternalLegoLang.g:8823:2: ( ruleEString )
            // InternalLegoLang.g:8824:3: ruleEString
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
        // InternalLegoLang.g:1465:2: ( ( ruleVariableRef ) )
        // InternalLegoLang.g:1465:2: ( ruleVariableRef )
        {
        // InternalLegoLang.g:1465:2: ( ruleVariableRef )
        // InternalLegoLang.g:1466:3: ruleVariableRef
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

    // $ANTLR start synpred10_InternalLegoLang
    public final void synpred10_InternalLegoLang_fragment() throws RecognitionException {   
        // InternalLegoLang.g:1477:2: ( ( ruleTheString ) )
        // InternalLegoLang.g:1477:2: ( ruleTheString )
        {
        // InternalLegoLang.g:1477:2: ( ruleTheString )
        // InternalLegoLang.g:1478:3: ruleTheString
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

    // $ANTLR start synpred15_InternalLegoLang
    public final void synpred15_InternalLegoLang_fragment() throws RecognitionException {   
        // InternalLegoLang.g:1522:2: ( ( ruleSubstraction ) )
        // InternalLegoLang.g:1522:2: ( ruleSubstraction )
        {
        // InternalLegoLang.g:1522:2: ( ruleSubstraction )
        // InternalLegoLang.g:1523:3: ruleSubstraction
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
    // $ANTLR end synpred15_InternalLegoLang

    // $ANTLR start synpred16_InternalLegoLang
    public final void synpred16_InternalLegoLang_fragment() throws RecognitionException {   
        // InternalLegoLang.g:1528:2: ( ( ruleComparaison ) )
        // InternalLegoLang.g:1528:2: ( ruleComparaison )
        {
        // InternalLegoLang.g:1528:2: ( ruleComparaison )
        // InternalLegoLang.g:1529:3: ruleComparaison
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
    // $ANTLR end synpred16_InternalLegoLang

    // $ANTLR start synpred17_InternalLegoLang
    public final void synpred17_InternalLegoLang_fragment() throws RecognitionException {   
        // InternalLegoLang.g:1534:2: ( ( ruleAssignement ) )
        // InternalLegoLang.g:1534:2: ( ruleAssignement )
        {
        // InternalLegoLang.g:1534:2: ( ruleAssignement )
        // InternalLegoLang.g:1535:3: ruleAssignement
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
    // $ANTLR end synpred17_InternalLegoLang

    // $ANTLR start synpred18_InternalLegoLang
    public final void synpred18_InternalLegoLang_fragment() throws RecognitionException {   
        // InternalLegoLang.g:1540:2: ( ( ruleDivision ) )
        // InternalLegoLang.g:1540:2: ( ruleDivision )
        {
        // InternalLegoLang.g:1540:2: ( ruleDivision )
        // InternalLegoLang.g:1541:3: ruleDivision
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
    // $ANTLR end synpred18_InternalLegoLang

    // $ANTLR start synpred19_InternalLegoLang
    public final void synpred19_InternalLegoLang_fragment() throws RecognitionException {   
        // InternalLegoLang.g:1546:2: ( ( ruleMultiplication ) )
        // InternalLegoLang.g:1546:2: ( ruleMultiplication )
        {
        // InternalLegoLang.g:1546:2: ( ruleMultiplication )
        // InternalLegoLang.g:1547:3: ruleMultiplication
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
    // $ANTLR end synpred19_InternalLegoLang

    // $ANTLR start synpred20_InternalLegoLang
    public final void synpred20_InternalLegoLang_fragment() throws RecognitionException {   
        // InternalLegoLang.g:1552:2: ( ( ruleAddition ) )
        // InternalLegoLang.g:1552:2: ( ruleAddition )
        {
        // InternalLegoLang.g:1552:2: ( ruleAddition )
        // InternalLegoLang.g:1553:3: ruleAddition
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
    // $ANTLR end synpred20_InternalLegoLang

    // $ANTLR start synpred21_InternalLegoLang
    public final void synpred21_InternalLegoLang_fragment() throws RecognitionException {   
        // InternalLegoLang.g:1558:2: ( ( ruleMinusEqual ) )
        // InternalLegoLang.g:1558:2: ( ruleMinusEqual )
        {
        // InternalLegoLang.g:1558:2: ( ruleMinusEqual )
        // InternalLegoLang.g:1559:3: ruleMinusEqual
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
    // $ANTLR end synpred21_InternalLegoLang

    // $ANTLR start synpred25_InternalLegoLang
    public final void synpred25_InternalLegoLang_fragment() throws RecognitionException {   
        // InternalLegoLang.g:1612:2: ( ( ruleGT ) )
        // InternalLegoLang.g:1612:2: ( ruleGT )
        {
        // InternalLegoLang.g:1612:2: ( ruleGT )
        // InternalLegoLang.g:1613:3: ruleGT
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
    // $ANTLR end synpred25_InternalLegoLang

    // $ANTLR start synpred26_InternalLegoLang
    public final void synpred26_InternalLegoLang_fragment() throws RecognitionException {   
        // InternalLegoLang.g:1618:2: ( ( ruleEqual ) )
        // InternalLegoLang.g:1618:2: ( ruleEqual )
        {
        // InternalLegoLang.g:1618:2: ( ruleEqual )
        // InternalLegoLang.g:1619:3: ruleEqual
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
    // $ANTLR end synpred26_InternalLegoLang

    // $ANTLR start synpred27_InternalLegoLang
    public final void synpred27_InternalLegoLang_fragment() throws RecognitionException {   
        // InternalLegoLang.g:1624:2: ( ( ruleLT ) )
        // InternalLegoLang.g:1624:2: ( ruleLT )
        {
        // InternalLegoLang.g:1624:2: ( ruleLT )
        // InternalLegoLang.g:1625:3: ruleLT
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
    // $ANTLR end synpred27_InternalLegoLang

    // $ANTLR start synpred28_InternalLegoLang
    public final void synpred28_InternalLegoLang_fragment() throws RecognitionException {   
        // InternalLegoLang.g:1630:2: ( ( ruleDifferent ) )
        // InternalLegoLang.g:1630:2: ( ruleDifferent )
        {
        // InternalLegoLang.g:1630:2: ( ruleDifferent )
        // InternalLegoLang.g:1631:3: ruleDifferent
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
    // $ANTLR end synpred28_InternalLegoLang

    // $ANTLR start synpred29_InternalLegoLang
    public final void synpred29_InternalLegoLang_fragment() throws RecognitionException {   
        // InternalLegoLang.g:1636:2: ( ( ruleGTorEqual ) )
        // InternalLegoLang.g:1636:2: ( ruleGTorEqual )
        {
        // InternalLegoLang.g:1636:2: ( ruleGTorEqual )
        // InternalLegoLang.g:1637:3: ruleGTorEqual
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
    // $ANTLR end synpred29_InternalLegoLang

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
    public final boolean synpred25_InternalLegoLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalLegoLang_fragment(); // can never throw exception
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
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\5\uffff\1\13\7\uffff";
    static final String dfa_3s = "\1\4\1\0\1\27\1\uffff\1\6\1\4\7\uffff";
    static final String dfa_4s = "\1\54\1\0\1\73\1\uffff\1\6\1\76\7\uffff";
    static final String dfa_5s = "\3\uffff\1\2\2\uffff\1\6\1\10\1\1\1\3\1\7\1\5\1\4";
    static final String dfa_6s = "\1\uffff\1\0\1\1\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\2\1\5\4\uffff\2\6\15\uffff\1\7\1\uffff\1\3\17\uffff\1\4",
            "\1\uffff",
            "\1\12\43\uffff\1\12",
            "",
            "\1\5",
            "\3\13\4\uffff\2\13\2\uffff\10\13\2\uffff\2\13\1\uffff\2\13\6\uffff\1\13\3\uffff\21\13\1\uffff\1\13\1\14\3\13",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1460:1: rule__Expression__Alternatives : ( ( ruleVariableRef ) | ( ruleBinaryOperation ) | ( ruleTheString ) | ( ruleTheDouble ) | ( ruleTheInt ) | ( ruleTheBoolean ) | ( ruleEngineOperation ) | ( ruleSensorOperation ) );";
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
                        if ( (synpred8_InternalLegoLang()) ) {s = 8;}

                        else if ( (synpred10_InternalLegoLang()) ) {s = 9;}

                         
                        input.seek(index2_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA2_2 = input.LA(1);

                         
                        int index2_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA2_2==23||LA2_2==59) ) {s = 10;}

                        else if ( (synpred8_InternalLegoLang()) ) {s = 8;}

                        else if ( (synpred10_InternalLegoLang()) ) {s = 9;}

                         
                        input.seek(index2_2);
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
    static final String dfa_8s = "\12\uffff";
    static final String dfa_9s = "\1\34\1\0\10\uffff";
    static final String dfa_10s = "\2\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String dfa_11s = "\1\uffff\1\0\10\uffff}>";
    static final String[] dfa_12s = {
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

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "1517:1: rule__BinaryOperation__Alternatives : ( ( ruleSubstraction ) | ( ruleComparaison ) | ( ruleAssignement ) | ( ruleDivision ) | ( ruleMultiplication ) | ( ruleAddition ) | ( ruleMinusEqual ) | ( rulePlusEqual ) );";
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
                        if ( (synpred15_InternalLegoLang()) ) {s = 2;}

                        else if ( (synpred16_InternalLegoLang()) ) {s = 3;}

                        else if ( (synpred17_InternalLegoLang()) ) {s = 4;}

                        else if ( (synpred18_InternalLegoLang()) ) {s = 5;}

                        else if ( (synpred19_InternalLegoLang()) ) {s = 6;}

                        else if ( (synpred20_InternalLegoLang()) ) {s = 7;}

                        else if ( (synpred21_InternalLegoLang()) ) {s = 8;}

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
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x75001310147F9870L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x75001310147F1872L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000100000000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000003E0002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000100014001870L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000006000004000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x75001310147F1870L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000100014001872L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x4100000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0200000002000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x7500000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x5000000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x6000000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0800000000000002L});

}