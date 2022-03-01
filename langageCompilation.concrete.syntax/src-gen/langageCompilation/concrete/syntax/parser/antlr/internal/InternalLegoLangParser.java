package langageCompilation.concrete.syntax.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import langageCompilation.concrete.syntax.services.LegoLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalLegoLangParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Program'", "'{'", "'}'", "'WheelEngine'", "'ColorSensor'", "'LaserSensor'", "'GPSSensor'", "'GyroSensor'", "'UltraSonicSensor'", "'Car'", "':'", "'vitesse'", "'='", "'get'", "'color'", "'('", "')'", "'intensity'", "'range'", "'x'", "'y'", "'angle'", "'distance'", "'if'", "'and'", "'or'", "'else{'", "'while'", "'print('", "','", "');'", "'-'", "'+'", "'*'", "'/'", "'>'", "'<'", "'=='", "'!='", "'<='", "'>='", "'+='", "'-='", "'true'", "'false'", "'const'", "'int'", "';'", "'double'", "'.'", "'bool'", "'string'"
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



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private LegoLangGrammarAccess grammarAccess;

        public InternalLegoLangParser(TokenStream input, LegoLangGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Program";
       	}

       	@Override
       	protected LegoLangGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgram"
    // InternalLegoLang.g:70:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalLegoLang.g:70:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalLegoLang.g:71:2: iv_ruleProgram= ruleProgram EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProgramRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProgram; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalLegoLang.g:77:1: ruleProgram returns [EObject current=null] : ( () otherlv_1= 'Program' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_statement_4_0= ruleStatement ) )* otherlv_5= '}' ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_statement_4_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:83:2: ( ( () otherlv_1= 'Program' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_statement_4_0= ruleStatement ) )* otherlv_5= '}' ) )
            // InternalLegoLang.g:84:2: ( () otherlv_1= 'Program' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_statement_4_0= ruleStatement ) )* otherlv_5= '}' )
            {
            // InternalLegoLang.g:84:2: ( () otherlv_1= 'Program' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_statement_4_0= ruleStatement ) )* otherlv_5= '}' )
            // InternalLegoLang.g:85:3: () otherlv_1= 'Program' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_statement_4_0= ruleStatement ) )* otherlv_5= '}'
            {
            // InternalLegoLang.g:85:3: ()
            // InternalLegoLang.g:86:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getProgramAccess().getProgramAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getProgramAccess().getProgramKeyword_1());
              		
            }
            // InternalLegoLang.g:99:3: ( (lv_name_2_0= ruleEString ) )
            // InternalLegoLang.g:100:4: (lv_name_2_0= ruleEString )
            {
            // InternalLegoLang.g:100:4: (lv_name_2_0= ruleEString )
            // InternalLegoLang.g:101:5: lv_name_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getProgramAccess().getNameEStringParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getProgramRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_2_0,
              						"langageCompilation.concrete.syntax.LegoLang.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalLegoLang.g:122:3: ( (lv_statement_4_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_STRING && LA1_0<=RULE_INT)||(LA1_0>=14 && LA1_0<=20)||LA1_0==24||LA1_0==26||LA1_0==34||(LA1_0>=38 && LA1_0<=39)||LA1_0==42||(LA1_0>=54 && LA1_0<=57)||LA1_0==59||(LA1_0>=61 && LA1_0<=62)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalLegoLang.g:123:4: (lv_statement_4_0= ruleStatement )
            	    {
            	    // InternalLegoLang.g:123:4: (lv_statement_4_0= ruleStatement )
            	    // InternalLegoLang.g:124:5: lv_statement_4_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getProgramAccess().getStatementStatementParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_statement_4_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getProgramRule());
            	      					}
            	      					add(
            	      						current,
            	      						"statement",
            	      						lv_statement_4_0,
            	      						"langageCompilation.concrete.syntax.LegoLang.Statement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleStatement"
    // InternalLegoLang.g:149:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalLegoLang.g:149:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalLegoLang.g:150:2: iv_ruleStatement= ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalLegoLang.g:156:1: ruleStatement returns [EObject current=null] : (this_WhileLoop_0= ruleWhileLoop | this_Variable_1= ruleVariable | this_Expression_2= ruleExpression | this_ConditionEtat_3= ruleConditionEtat | this_MethodePrint_4= ruleMethodePrint | this_Car_5= ruleCar | this_Sensor_6= ruleSensor | this_Engine_7= ruleEngine ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_WhileLoop_0 = null;

        EObject this_Variable_1 = null;

        EObject this_Expression_2 = null;

        EObject this_ConditionEtat_3 = null;

        EObject this_MethodePrint_4 = null;

        EObject this_Car_5 = null;

        EObject this_Sensor_6 = null;

        EObject this_Engine_7 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:162:2: ( (this_WhileLoop_0= ruleWhileLoop | this_Variable_1= ruleVariable | this_Expression_2= ruleExpression | this_ConditionEtat_3= ruleConditionEtat | this_MethodePrint_4= ruleMethodePrint | this_Car_5= ruleCar | this_Sensor_6= ruleSensor | this_Engine_7= ruleEngine ) )
            // InternalLegoLang.g:163:2: (this_WhileLoop_0= ruleWhileLoop | this_Variable_1= ruleVariable | this_Expression_2= ruleExpression | this_ConditionEtat_3= ruleConditionEtat | this_MethodePrint_4= ruleMethodePrint | this_Car_5= ruleCar | this_Sensor_6= ruleSensor | this_Engine_7= ruleEngine )
            {
            // InternalLegoLang.g:163:2: (this_WhileLoop_0= ruleWhileLoop | this_Variable_1= ruleVariable | this_Expression_2= ruleExpression | this_ConditionEtat_3= ruleConditionEtat | this_MethodePrint_4= ruleMethodePrint | this_Car_5= ruleCar | this_Sensor_6= ruleSensor | this_Engine_7= ruleEngine )
            int alt2=8;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt2=1;
                }
                break;
            case 56:
            case 57:
            case 59:
            case 61:
            case 62:
                {
                alt2=2;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
            case RULE_INT:
            case 24:
            case 26:
            case 42:
            case 54:
            case 55:
                {
                alt2=3;
                }
                break;
            case 34:
                {
                alt2=4;
                }
                break;
            case 39:
                {
                alt2=5;
                }
                break;
            case 20:
                {
                alt2=6;
                }
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                {
                alt2=7;
                }
                break;
            case 14:
                {
                alt2=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalLegoLang.g:164:3: this_WhileLoop_0= ruleWhileLoop
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getWhileLoopParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_WhileLoop_0=ruleWhileLoop();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_WhileLoop_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalLegoLang.g:176:3: this_Variable_1= ruleVariable
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getVariableParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Variable_1=ruleVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Variable_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalLegoLang.g:188:3: this_Expression_2= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getExpressionParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Expression_2=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Expression_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalLegoLang.g:200:3: this_ConditionEtat_3= ruleConditionEtat
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getConditionEtatParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ConditionEtat_3=ruleConditionEtat();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ConditionEtat_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalLegoLang.g:212:3: this_MethodePrint_4= ruleMethodePrint
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getMethodePrintParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MethodePrint_4=ruleMethodePrint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MethodePrint_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalLegoLang.g:224:3: this_Car_5= ruleCar
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getCarParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Car_5=ruleCar();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Car_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalLegoLang.g:236:3: this_Sensor_6= ruleSensor
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getSensorParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Sensor_6=ruleSensor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Sensor_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalLegoLang.g:248:3: this_Engine_7= ruleEngine
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getEngineParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Engine_7=ruleEngine();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Engine_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleExpression"
    // InternalLegoLang.g:263:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalLegoLang.g:263:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalLegoLang.g:264:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalLegoLang.g:270:1: ruleExpression returns [EObject current=null] : (this_VariableRef_0= ruleVariableRef | this_BinaryOperation_1= ruleBinaryOperation | this_TheString_2= ruleTheString | this_TheDouble_3= ruleTheDouble | this_TheInt_4= ruleTheInt | this_TheBoolean_5= ruleTheBoolean | this_EngineOperation_6= ruleEngineOperation | this_SensorOperation_7= ruleSensorOperation ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_VariableRef_0 = null;

        EObject this_BinaryOperation_1 = null;

        EObject this_TheString_2 = null;

        EObject this_TheDouble_3 = null;

        EObject this_TheInt_4 = null;

        EObject this_TheBoolean_5 = null;

        EObject this_EngineOperation_6 = null;

        EObject this_SensorOperation_7 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:276:2: ( (this_VariableRef_0= ruleVariableRef | this_BinaryOperation_1= ruleBinaryOperation | this_TheString_2= ruleTheString | this_TheDouble_3= ruleTheDouble | this_TheInt_4= ruleTheInt | this_TheBoolean_5= ruleTheBoolean | this_EngineOperation_6= ruleEngineOperation | this_SensorOperation_7= ruleSensorOperation ) )
            // InternalLegoLang.g:277:2: (this_VariableRef_0= ruleVariableRef | this_BinaryOperation_1= ruleBinaryOperation | this_TheString_2= ruleTheString | this_TheDouble_3= ruleTheDouble | this_TheInt_4= ruleTheInt | this_TheBoolean_5= ruleTheBoolean | this_EngineOperation_6= ruleEngineOperation | this_SensorOperation_7= ruleSensorOperation )
            {
            // InternalLegoLang.g:277:2: (this_VariableRef_0= ruleVariableRef | this_BinaryOperation_1= ruleBinaryOperation | this_TheString_2= ruleTheString | this_TheDouble_3= ruleTheDouble | this_TheInt_4= ruleTheInt | this_TheBoolean_5= ruleTheBoolean | this_EngineOperation_6= ruleEngineOperation | this_SensorOperation_7= ruleSensorOperation )
            int alt3=8;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalLegoLang.g:278:3: this_VariableRef_0= ruleVariableRef
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getVariableRefParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_VariableRef_0=ruleVariableRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_VariableRef_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalLegoLang.g:290:3: this_BinaryOperation_1= ruleBinaryOperation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getBinaryOperationParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BinaryOperation_1=ruleBinaryOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BinaryOperation_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalLegoLang.g:302:3: this_TheString_2= ruleTheString
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getTheStringParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TheString_2=ruleTheString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TheString_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalLegoLang.g:314:3: this_TheDouble_3= ruleTheDouble
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getTheDoubleParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TheDouble_3=ruleTheDouble();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TheDouble_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalLegoLang.g:326:3: this_TheInt_4= ruleTheInt
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getTheIntParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TheInt_4=ruleTheInt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TheInt_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalLegoLang.g:338:3: this_TheBoolean_5= ruleTheBoolean
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getTheBooleanParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TheBoolean_5=ruleTheBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TheBoolean_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalLegoLang.g:350:3: this_EngineOperation_6= ruleEngineOperation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getEngineOperationParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EngineOperation_6=ruleEngineOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EngineOperation_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalLegoLang.g:362:3: this_SensorOperation_7= ruleSensorOperation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getSensorOperationParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SensorOperation_7=ruleSensorOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SensorOperation_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleBinaryOperation"
    // InternalLegoLang.g:377:1: entryRuleBinaryOperation returns [EObject current=null] : iv_ruleBinaryOperation= ruleBinaryOperation EOF ;
    public final EObject entryRuleBinaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryOperation = null;


        try {
            // InternalLegoLang.g:377:56: (iv_ruleBinaryOperation= ruleBinaryOperation EOF )
            // InternalLegoLang.g:378:2: iv_ruleBinaryOperation= ruleBinaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBinaryOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBinaryOperation=ruleBinaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBinaryOperation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBinaryOperation"


    // $ANTLR start "ruleBinaryOperation"
    // InternalLegoLang.g:384:1: ruleBinaryOperation returns [EObject current=null] : (this_Substraction_0= ruleSubstraction | this_Comparaison_1= ruleComparaison | this_Assignement_2= ruleAssignement | this_Division_3= ruleDivision | this_Multiplication_4= ruleMultiplication | this_Addition_5= ruleAddition | this_MinusEqual_6= ruleMinusEqual | this_PlusEqual_7= rulePlusEqual ) ;
    public final EObject ruleBinaryOperation() throws RecognitionException {
        EObject current = null;

        EObject this_Substraction_0 = null;

        EObject this_Comparaison_1 = null;

        EObject this_Assignement_2 = null;

        EObject this_Division_3 = null;

        EObject this_Multiplication_4 = null;

        EObject this_Addition_5 = null;

        EObject this_MinusEqual_6 = null;

        EObject this_PlusEqual_7 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:390:2: ( (this_Substraction_0= ruleSubstraction | this_Comparaison_1= ruleComparaison | this_Assignement_2= ruleAssignement | this_Division_3= ruleDivision | this_Multiplication_4= ruleMultiplication | this_Addition_5= ruleAddition | this_MinusEqual_6= ruleMinusEqual | this_PlusEqual_7= rulePlusEqual ) )
            // InternalLegoLang.g:391:2: (this_Substraction_0= ruleSubstraction | this_Comparaison_1= ruleComparaison | this_Assignement_2= ruleAssignement | this_Division_3= ruleDivision | this_Multiplication_4= ruleMultiplication | this_Addition_5= ruleAddition | this_MinusEqual_6= ruleMinusEqual | this_PlusEqual_7= rulePlusEqual )
            {
            // InternalLegoLang.g:391:2: (this_Substraction_0= ruleSubstraction | this_Comparaison_1= ruleComparaison | this_Assignement_2= ruleAssignement | this_Division_3= ruleDivision | this_Multiplication_4= ruleMultiplication | this_Addition_5= ruleAddition | this_MinusEqual_6= ruleMinusEqual | this_PlusEqual_7= rulePlusEqual )
            int alt4=8;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalLegoLang.g:392:3: this_Substraction_0= ruleSubstraction
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBinaryOperationAccess().getSubstractionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Substraction_0=ruleSubstraction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Substraction_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalLegoLang.g:404:3: this_Comparaison_1= ruleComparaison
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBinaryOperationAccess().getComparaisonParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Comparaison_1=ruleComparaison();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Comparaison_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalLegoLang.g:416:3: this_Assignement_2= ruleAssignement
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBinaryOperationAccess().getAssignementParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Assignement_2=ruleAssignement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Assignement_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalLegoLang.g:428:3: this_Division_3= ruleDivision
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBinaryOperationAccess().getDivisionParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Division_3=ruleDivision();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Division_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalLegoLang.g:440:3: this_Multiplication_4= ruleMultiplication
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBinaryOperationAccess().getMultiplicationParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Multiplication_4=ruleMultiplication();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Multiplication_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalLegoLang.g:452:3: this_Addition_5= ruleAddition
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBinaryOperationAccess().getAdditionParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Addition_5=ruleAddition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Addition_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalLegoLang.g:464:3: this_MinusEqual_6= ruleMinusEqual
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBinaryOperationAccess().getMinusEqualParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MinusEqual_6=ruleMinusEqual();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MinusEqual_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalLegoLang.g:476:3: this_PlusEqual_7= rulePlusEqual
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBinaryOperationAccess().getPlusEqualParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PlusEqual_7=rulePlusEqual();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PlusEqual_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBinaryOperation"


    // $ANTLR start "entryRuleVariable"
    // InternalLegoLang.g:491:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalLegoLang.g:491:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalLegoLang.g:492:2: iv_ruleVariable= ruleVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariable; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalLegoLang.g:498:1: ruleVariable returns [EObject current=null] : (this_UnInteger_0= ruleUnInteger | this_UnString_1= ruleUnString | this_UnBoolean_2= ruleUnBoolean | this_UnDouble_3= ruleUnDouble ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        EObject this_UnInteger_0 = null;

        EObject this_UnString_1 = null;

        EObject this_UnBoolean_2 = null;

        EObject this_UnDouble_3 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:504:2: ( (this_UnInteger_0= ruleUnInteger | this_UnString_1= ruleUnString | this_UnBoolean_2= ruleUnBoolean | this_UnDouble_3= ruleUnDouble ) )
            // InternalLegoLang.g:505:2: (this_UnInteger_0= ruleUnInteger | this_UnString_1= ruleUnString | this_UnBoolean_2= ruleUnBoolean | this_UnDouble_3= ruleUnDouble )
            {
            // InternalLegoLang.g:505:2: (this_UnInteger_0= ruleUnInteger | this_UnString_1= ruleUnString | this_UnBoolean_2= ruleUnBoolean | this_UnDouble_3= ruleUnDouble )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 56:
                {
                switch ( input.LA(2) ) {
                case 61:
                    {
                    alt5=3;
                    }
                    break;
                case 62:
                    {
                    alt5=2;
                    }
                    break;
                case 59:
                    {
                    alt5=4;
                    }
                    break;
                case 57:
                    {
                    alt5=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }

                }
                break;
            case 57:
                {
                alt5=1;
                }
                break;
            case 62:
                {
                alt5=2;
                }
                break;
            case 61:
                {
                alt5=3;
                }
                break;
            case 59:
                {
                alt5=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalLegoLang.g:506:3: this_UnInteger_0= ruleUnInteger
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getVariableAccess().getUnIntegerParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_UnInteger_0=ruleUnInteger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_UnInteger_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalLegoLang.g:518:3: this_UnString_1= ruleUnString
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getVariableAccess().getUnStringParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_UnString_1=ruleUnString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_UnString_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalLegoLang.g:530:3: this_UnBoolean_2= ruleUnBoolean
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getVariableAccess().getUnBooleanParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_UnBoolean_2=ruleUnBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_UnBoolean_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalLegoLang.g:542:3: this_UnDouble_3= ruleUnDouble
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getVariableAccess().getUnDoubleParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_UnDouble_3=ruleUnDouble();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_UnDouble_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleComparaison"
    // InternalLegoLang.g:557:1: entryRuleComparaison returns [EObject current=null] : iv_ruleComparaison= ruleComparaison EOF ;
    public final EObject entryRuleComparaison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparaison = null;


        try {
            // InternalLegoLang.g:557:52: (iv_ruleComparaison= ruleComparaison EOF )
            // InternalLegoLang.g:558:2: iv_ruleComparaison= ruleComparaison EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparaisonRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComparaison=ruleComparaison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparaison; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleComparaison"


    // $ANTLR start "ruleComparaison"
    // InternalLegoLang.g:564:1: ruleComparaison returns [EObject current=null] : (this_GT_0= ruleGT | this_Equal_1= ruleEqual | this_LT_2= ruleLT | this_Different_3= ruleDifferent | this_GTorEqual_4= ruleGTorEqual | this_LTorEqual_5= ruleLTorEqual ) ;
    public final EObject ruleComparaison() throws RecognitionException {
        EObject current = null;

        EObject this_GT_0 = null;

        EObject this_Equal_1 = null;

        EObject this_LT_2 = null;

        EObject this_Different_3 = null;

        EObject this_GTorEqual_4 = null;

        EObject this_LTorEqual_5 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:570:2: ( (this_GT_0= ruleGT | this_Equal_1= ruleEqual | this_LT_2= ruleLT | this_Different_3= ruleDifferent | this_GTorEqual_4= ruleGTorEqual | this_LTorEqual_5= ruleLTorEqual ) )
            // InternalLegoLang.g:571:2: (this_GT_0= ruleGT | this_Equal_1= ruleEqual | this_LT_2= ruleLT | this_Different_3= ruleDifferent | this_GTorEqual_4= ruleGTorEqual | this_LTorEqual_5= ruleLTorEqual )
            {
            // InternalLegoLang.g:571:2: (this_GT_0= ruleGT | this_Equal_1= ruleEqual | this_LT_2= ruleLT | this_Different_3= ruleDifferent | this_GTorEqual_4= ruleGTorEqual | this_LTorEqual_5= ruleLTorEqual )
            int alt6=6;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==26) ) {
                int LA6_1 = input.LA(2);

                if ( (synpred26_InternalLegoLang()) ) {
                    alt6=1;
                }
                else if ( (synpred27_InternalLegoLang()) ) {
                    alt6=2;
                }
                else if ( (synpred28_InternalLegoLang()) ) {
                    alt6=3;
                }
                else if ( (synpred29_InternalLegoLang()) ) {
                    alt6=4;
                }
                else if ( (synpred30_InternalLegoLang()) ) {
                    alt6=5;
                }
                else if ( (true) ) {
                    alt6=6;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalLegoLang.g:572:3: this_GT_0= ruleGT
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getComparaisonAccess().getGTParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_GT_0=ruleGT();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GT_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalLegoLang.g:584:3: this_Equal_1= ruleEqual
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getComparaisonAccess().getEqualParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Equal_1=ruleEqual();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Equal_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalLegoLang.g:596:3: this_LT_2= ruleLT
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getComparaisonAccess().getLTParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LT_2=ruleLT();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LT_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalLegoLang.g:608:3: this_Different_3= ruleDifferent
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getComparaisonAccess().getDifferentParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Different_3=ruleDifferent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Different_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalLegoLang.g:620:3: this_GTorEqual_4= ruleGTorEqual
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getComparaisonAccess().getGTorEqualParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_GTorEqual_4=ruleGTorEqual();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GTorEqual_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalLegoLang.g:632:3: this_LTorEqual_5= ruleLTorEqual
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getComparaisonAccess().getLTorEqualParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LTorEqual_5=ruleLTorEqual();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LTorEqual_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleComparaison"


    // $ANTLR start "entryRuleEngine"
    // InternalLegoLang.g:647:1: entryRuleEngine returns [EObject current=null] : iv_ruleEngine= ruleEngine EOF ;
    public final EObject entryRuleEngine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEngine = null;


        try {
            // InternalLegoLang.g:647:47: (iv_ruleEngine= ruleEngine EOF )
            // InternalLegoLang.g:648:2: iv_ruleEngine= ruleEngine EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEngineRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEngine=ruleEngine();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEngine; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEngine"


    // $ANTLR start "ruleEngine"
    // InternalLegoLang.g:654:1: ruleEngine returns [EObject current=null] : this_WheelEngine_0= ruleWheelEngine ;
    public final EObject ruleEngine() throws RecognitionException {
        EObject current = null;

        EObject this_WheelEngine_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:660:2: (this_WheelEngine_0= ruleWheelEngine )
            // InternalLegoLang.g:661:2: this_WheelEngine_0= ruleWheelEngine
            {
            if ( state.backtracking==0 ) {

              		/* */
              	
            }
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getEngineAccess().getWheelEngineParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_WheelEngine_0=ruleWheelEngine();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_WheelEngine_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEngine"


    // $ANTLR start "entryRuleSensor"
    // InternalLegoLang.g:675:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalLegoLang.g:675:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalLegoLang.g:676:2: iv_ruleSensor= ruleSensor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSensorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSensor=ruleSensor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSensor; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // InternalLegoLang.g:682:1: ruleSensor returns [EObject current=null] : (this_LaserSensor_0= ruleLaserSensor | this_ColorSensor_1= ruleColorSensor | this_UltraSonicSensor_2= ruleUltraSonicSensor | this_GyroSensor_3= ruleGyroSensor | this_GPSSensor_4= ruleGPSSensor ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        EObject this_LaserSensor_0 = null;

        EObject this_ColorSensor_1 = null;

        EObject this_UltraSonicSensor_2 = null;

        EObject this_GyroSensor_3 = null;

        EObject this_GPSSensor_4 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:688:2: ( (this_LaserSensor_0= ruleLaserSensor | this_ColorSensor_1= ruleColorSensor | this_UltraSonicSensor_2= ruleUltraSonicSensor | this_GyroSensor_3= ruleGyroSensor | this_GPSSensor_4= ruleGPSSensor ) )
            // InternalLegoLang.g:689:2: (this_LaserSensor_0= ruleLaserSensor | this_ColorSensor_1= ruleColorSensor | this_UltraSonicSensor_2= ruleUltraSonicSensor | this_GyroSensor_3= ruleGyroSensor | this_GPSSensor_4= ruleGPSSensor )
            {
            // InternalLegoLang.g:689:2: (this_LaserSensor_0= ruleLaserSensor | this_ColorSensor_1= ruleColorSensor | this_UltraSonicSensor_2= ruleUltraSonicSensor | this_GyroSensor_3= ruleGyroSensor | this_GPSSensor_4= ruleGPSSensor )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt7=1;
                }
                break;
            case 15:
                {
                alt7=2;
                }
                break;
            case 19:
                {
                alt7=3;
                }
                break;
            case 18:
                {
                alt7=4;
                }
                break;
            case 17:
                {
                alt7=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalLegoLang.g:690:3: this_LaserSensor_0= ruleLaserSensor
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSensorAccess().getLaserSensorParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LaserSensor_0=ruleLaserSensor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LaserSensor_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalLegoLang.g:702:3: this_ColorSensor_1= ruleColorSensor
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSensorAccess().getColorSensorParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ColorSensor_1=ruleColorSensor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ColorSensor_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalLegoLang.g:714:3: this_UltraSonicSensor_2= ruleUltraSonicSensor
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSensorAccess().getUltraSonicSensorParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_UltraSonicSensor_2=ruleUltraSonicSensor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_UltraSonicSensor_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalLegoLang.g:726:3: this_GyroSensor_3= ruleGyroSensor
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSensorAccess().getGyroSensorParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_GyroSensor_3=ruleGyroSensor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GyroSensor_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalLegoLang.g:738:3: this_GPSSensor_4= ruleGPSSensor
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSensorAccess().getGPSSensorParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_GPSSensor_4=ruleGPSSensor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GPSSensor_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleWheelEngine"
    // InternalLegoLang.g:753:1: entryRuleWheelEngine returns [EObject current=null] : iv_ruleWheelEngine= ruleWheelEngine EOF ;
    public final EObject entryRuleWheelEngine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWheelEngine = null;


        try {
            // InternalLegoLang.g:753:52: (iv_ruleWheelEngine= ruleWheelEngine EOF )
            // InternalLegoLang.g:754:2: iv_ruleWheelEngine= ruleWheelEngine EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWheelEngineRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWheelEngine=ruleWheelEngine();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWheelEngine; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleWheelEngine"


    // $ANTLR start "ruleWheelEngine"
    // InternalLegoLang.g:760:1: ruleWheelEngine returns [EObject current=null] : (otherlv_0= 'WheelEngine' ( (lv_name_1_0= ruleEString ) ) ( (lv_position_2_0= ruleEString ) ) ) ;
    public final EObject ruleWheelEngine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_position_2_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:766:2: ( (otherlv_0= 'WheelEngine' ( (lv_name_1_0= ruleEString ) ) ( (lv_position_2_0= ruleEString ) ) ) )
            // InternalLegoLang.g:767:2: (otherlv_0= 'WheelEngine' ( (lv_name_1_0= ruleEString ) ) ( (lv_position_2_0= ruleEString ) ) )
            {
            // InternalLegoLang.g:767:2: (otherlv_0= 'WheelEngine' ( (lv_name_1_0= ruleEString ) ) ( (lv_position_2_0= ruleEString ) ) )
            // InternalLegoLang.g:768:3: otherlv_0= 'WheelEngine' ( (lv_name_1_0= ruleEString ) ) ( (lv_position_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWheelEngineAccess().getWheelEngineKeyword_0());
              		
            }
            // InternalLegoLang.g:772:3: ( (lv_name_1_0= ruleEString ) )
            // InternalLegoLang.g:773:4: (lv_name_1_0= ruleEString )
            {
            // InternalLegoLang.g:773:4: (lv_name_1_0= ruleEString )
            // InternalLegoLang.g:774:5: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWheelEngineAccess().getNameEStringParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWheelEngineRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"langageCompilation.concrete.syntax.LegoLang.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalLegoLang.g:791:3: ( (lv_position_2_0= ruleEString ) )
            // InternalLegoLang.g:792:4: (lv_position_2_0= ruleEString )
            {
            // InternalLegoLang.g:792:4: (lv_position_2_0= ruleEString )
            // InternalLegoLang.g:793:5: lv_position_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWheelEngineAccess().getPositionEStringParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_position_2_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWheelEngineRule());
              					}
              					set(
              						current,
              						"position",
              						lv_position_2_0,
              						"langageCompilation.concrete.syntax.LegoLang.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleWheelEngine"


    // $ANTLR start "entryRuleColorSensor"
    // InternalLegoLang.g:814:1: entryRuleColorSensor returns [EObject current=null] : iv_ruleColorSensor= ruleColorSensor EOF ;
    public final EObject entryRuleColorSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorSensor = null;


        try {
            // InternalLegoLang.g:814:52: (iv_ruleColorSensor= ruleColorSensor EOF )
            // InternalLegoLang.g:815:2: iv_ruleColorSensor= ruleColorSensor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getColorSensorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleColorSensor=ruleColorSensor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleColorSensor; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleColorSensor"


    // $ANTLR start "ruleColorSensor"
    // InternalLegoLang.g:821:1: ruleColorSensor returns [EObject current=null] : (otherlv_0= 'ColorSensor' ( (lv_name_1_0= ruleEString ) ) ( (lv_position_2_0= ruleEInt ) ) ) ;
    public final EObject ruleColorSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_position_2_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:827:2: ( (otherlv_0= 'ColorSensor' ( (lv_name_1_0= ruleEString ) ) ( (lv_position_2_0= ruleEInt ) ) ) )
            // InternalLegoLang.g:828:2: (otherlv_0= 'ColorSensor' ( (lv_name_1_0= ruleEString ) ) ( (lv_position_2_0= ruleEInt ) ) )
            {
            // InternalLegoLang.g:828:2: (otherlv_0= 'ColorSensor' ( (lv_name_1_0= ruleEString ) ) ( (lv_position_2_0= ruleEInt ) ) )
            // InternalLegoLang.g:829:3: otherlv_0= 'ColorSensor' ( (lv_name_1_0= ruleEString ) ) ( (lv_position_2_0= ruleEInt ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getColorSensorAccess().getColorSensorKeyword_0());
              		
            }
            // InternalLegoLang.g:833:3: ( (lv_name_1_0= ruleEString ) )
            // InternalLegoLang.g:834:4: (lv_name_1_0= ruleEString )
            {
            // InternalLegoLang.g:834:4: (lv_name_1_0= ruleEString )
            // InternalLegoLang.g:835:5: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getColorSensorAccess().getNameEStringParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_6);
            lv_name_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getColorSensorRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"langageCompilation.concrete.syntax.LegoLang.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalLegoLang.g:852:3: ( (lv_position_2_0= ruleEInt ) )
            // InternalLegoLang.g:853:4: (lv_position_2_0= ruleEInt )
            {
            // InternalLegoLang.g:853:4: (lv_position_2_0= ruleEInt )
            // InternalLegoLang.g:854:5: lv_position_2_0= ruleEInt
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getColorSensorAccess().getPositionEIntParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_position_2_0=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getColorSensorRule());
              					}
              					set(
              						current,
              						"position",
              						lv_position_2_0,
              						"langageCompilation.concrete.syntax.LegoLang.EInt");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleColorSensor"


    // $ANTLR start "entryRuleLaserSensor"
    // InternalLegoLang.g:875:1: entryRuleLaserSensor returns [EObject current=null] : iv_ruleLaserSensor= ruleLaserSensor EOF ;
    public final EObject entryRuleLaserSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLaserSensor = null;


        try {
            // InternalLegoLang.g:875:52: (iv_ruleLaserSensor= ruleLaserSensor EOF )
            // InternalLegoLang.g:876:2: iv_ruleLaserSensor= ruleLaserSensor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLaserSensorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLaserSensor=ruleLaserSensor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLaserSensor; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLaserSensor"


    // $ANTLR start "ruleLaserSensor"
    // InternalLegoLang.g:882:1: ruleLaserSensor returns [EObject current=null] : (otherlv_0= 'LaserSensor' ( (lv_name_1_0= ruleEString ) ) ( (lv_position_2_0= ruleEInt ) ) ) ;
    public final EObject ruleLaserSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_position_2_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:888:2: ( (otherlv_0= 'LaserSensor' ( (lv_name_1_0= ruleEString ) ) ( (lv_position_2_0= ruleEInt ) ) ) )
            // InternalLegoLang.g:889:2: (otherlv_0= 'LaserSensor' ( (lv_name_1_0= ruleEString ) ) ( (lv_position_2_0= ruleEInt ) ) )
            {
            // InternalLegoLang.g:889:2: (otherlv_0= 'LaserSensor' ( (lv_name_1_0= ruleEString ) ) ( (lv_position_2_0= ruleEInt ) ) )
            // InternalLegoLang.g:890:3: otherlv_0= 'LaserSensor' ( (lv_name_1_0= ruleEString ) ) ( (lv_position_2_0= ruleEInt ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLaserSensorAccess().getLaserSensorKeyword_0());
              		
            }
            // InternalLegoLang.g:894:3: ( (lv_name_1_0= ruleEString ) )
            // InternalLegoLang.g:895:4: (lv_name_1_0= ruleEString )
            {
            // InternalLegoLang.g:895:4: (lv_name_1_0= ruleEString )
            // InternalLegoLang.g:896:5: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLaserSensorAccess().getNameEStringParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_6);
            lv_name_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLaserSensorRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"langageCompilation.concrete.syntax.LegoLang.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalLegoLang.g:913:3: ( (lv_position_2_0= ruleEInt ) )
            // InternalLegoLang.g:914:4: (lv_position_2_0= ruleEInt )
            {
            // InternalLegoLang.g:914:4: (lv_position_2_0= ruleEInt )
            // InternalLegoLang.g:915:5: lv_position_2_0= ruleEInt
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLaserSensorAccess().getPositionEIntParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_position_2_0=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLaserSensorRule());
              					}
              					set(
              						current,
              						"position",
              						lv_position_2_0,
              						"langageCompilation.concrete.syntax.LegoLang.EInt");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLaserSensor"


    // $ANTLR start "entryRuleGPSSensor"
    // InternalLegoLang.g:936:1: entryRuleGPSSensor returns [EObject current=null] : iv_ruleGPSSensor= ruleGPSSensor EOF ;
    public final EObject entryRuleGPSSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGPSSensor = null;


        try {
            // InternalLegoLang.g:936:50: (iv_ruleGPSSensor= ruleGPSSensor EOF )
            // InternalLegoLang.g:937:2: iv_ruleGPSSensor= ruleGPSSensor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGPSSensorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGPSSensor=ruleGPSSensor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGPSSensor; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGPSSensor"


    // $ANTLR start "ruleGPSSensor"
    // InternalLegoLang.g:943:1: ruleGPSSensor returns [EObject current=null] : (otherlv_0= 'GPSSensor' ( (lv_name_1_0= ruleEString ) ) ( (lv_position_2_0= ruleEInt ) ) ) ;
    public final EObject ruleGPSSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_position_2_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:949:2: ( (otherlv_0= 'GPSSensor' ( (lv_name_1_0= ruleEString ) ) ( (lv_position_2_0= ruleEInt ) ) ) )
            // InternalLegoLang.g:950:2: (otherlv_0= 'GPSSensor' ( (lv_name_1_0= ruleEString ) ) ( (lv_position_2_0= ruleEInt ) ) )
            {
            // InternalLegoLang.g:950:2: (otherlv_0= 'GPSSensor' ( (lv_name_1_0= ruleEString ) ) ( (lv_position_2_0= ruleEInt ) ) )
            // InternalLegoLang.g:951:3: otherlv_0= 'GPSSensor' ( (lv_name_1_0= ruleEString ) ) ( (lv_position_2_0= ruleEInt ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGPSSensorAccess().getGPSSensorKeyword_0());
              		
            }
            // InternalLegoLang.g:955:3: ( (lv_name_1_0= ruleEString ) )
            // InternalLegoLang.g:956:4: (lv_name_1_0= ruleEString )
            {
            // InternalLegoLang.g:956:4: (lv_name_1_0= ruleEString )
            // InternalLegoLang.g:957:5: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGPSSensorAccess().getNameEStringParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_6);
            lv_name_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGPSSensorRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"langageCompilation.concrete.syntax.LegoLang.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalLegoLang.g:974:3: ( (lv_position_2_0= ruleEInt ) )
            // InternalLegoLang.g:975:4: (lv_position_2_0= ruleEInt )
            {
            // InternalLegoLang.g:975:4: (lv_position_2_0= ruleEInt )
            // InternalLegoLang.g:976:5: lv_position_2_0= ruleEInt
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGPSSensorAccess().getPositionEIntParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_position_2_0=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGPSSensorRule());
              					}
              					set(
              						current,
              						"position",
              						lv_position_2_0,
              						"langageCompilation.concrete.syntax.LegoLang.EInt");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGPSSensor"


    // $ANTLR start "entryRuleGyroSensor"
    // InternalLegoLang.g:997:1: entryRuleGyroSensor returns [EObject current=null] : iv_ruleGyroSensor= ruleGyroSensor EOF ;
    public final EObject entryRuleGyroSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGyroSensor = null;


        try {
            // InternalLegoLang.g:997:51: (iv_ruleGyroSensor= ruleGyroSensor EOF )
            // InternalLegoLang.g:998:2: iv_ruleGyroSensor= ruleGyroSensor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGyroSensorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGyroSensor=ruleGyroSensor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGyroSensor; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGyroSensor"


    // $ANTLR start "ruleGyroSensor"
    // InternalLegoLang.g:1004:1: ruleGyroSensor returns [EObject current=null] : (otherlv_0= 'GyroSensor' ( (lv_name_1_0= ruleEString ) ) ( (lv_position_2_0= ruleEInt ) ) ) ;
    public final EObject ruleGyroSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_position_2_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:1010:2: ( (otherlv_0= 'GyroSensor' ( (lv_name_1_0= ruleEString ) ) ( (lv_position_2_0= ruleEInt ) ) ) )
            // InternalLegoLang.g:1011:2: (otherlv_0= 'GyroSensor' ( (lv_name_1_0= ruleEString ) ) ( (lv_position_2_0= ruleEInt ) ) )
            {
            // InternalLegoLang.g:1011:2: (otherlv_0= 'GyroSensor' ( (lv_name_1_0= ruleEString ) ) ( (lv_position_2_0= ruleEInt ) ) )
            // InternalLegoLang.g:1012:3: otherlv_0= 'GyroSensor' ( (lv_name_1_0= ruleEString ) ) ( (lv_position_2_0= ruleEInt ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGyroSensorAccess().getGyroSensorKeyword_0());
              		
            }
            // InternalLegoLang.g:1016:3: ( (lv_name_1_0= ruleEString ) )
            // InternalLegoLang.g:1017:4: (lv_name_1_0= ruleEString )
            {
            // InternalLegoLang.g:1017:4: (lv_name_1_0= ruleEString )
            // InternalLegoLang.g:1018:5: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGyroSensorAccess().getNameEStringParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_6);
            lv_name_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGyroSensorRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"langageCompilation.concrete.syntax.LegoLang.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalLegoLang.g:1035:3: ( (lv_position_2_0= ruleEInt ) )
            // InternalLegoLang.g:1036:4: (lv_position_2_0= ruleEInt )
            {
            // InternalLegoLang.g:1036:4: (lv_position_2_0= ruleEInt )
            // InternalLegoLang.g:1037:5: lv_position_2_0= ruleEInt
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGyroSensorAccess().getPositionEIntParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_position_2_0=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGyroSensorRule());
              					}
              					set(
              						current,
              						"position",
              						lv_position_2_0,
              						"langageCompilation.concrete.syntax.LegoLang.EInt");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGyroSensor"


    // $ANTLR start "entryRuleUltraSonicSensor"
    // InternalLegoLang.g:1058:1: entryRuleUltraSonicSensor returns [EObject current=null] : iv_ruleUltraSonicSensor= ruleUltraSonicSensor EOF ;
    public final EObject entryRuleUltraSonicSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUltraSonicSensor = null;


        try {
            // InternalLegoLang.g:1058:57: (iv_ruleUltraSonicSensor= ruleUltraSonicSensor EOF )
            // InternalLegoLang.g:1059:2: iv_ruleUltraSonicSensor= ruleUltraSonicSensor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUltraSonicSensorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUltraSonicSensor=ruleUltraSonicSensor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUltraSonicSensor; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUltraSonicSensor"


    // $ANTLR start "ruleUltraSonicSensor"
    // InternalLegoLang.g:1065:1: ruleUltraSonicSensor returns [EObject current=null] : (otherlv_0= 'UltraSonicSensor' ( (lv_name_1_0= ruleEString ) ) ( (lv_position_2_0= ruleEInt ) ) ) ;
    public final EObject ruleUltraSonicSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_position_2_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:1071:2: ( (otherlv_0= 'UltraSonicSensor' ( (lv_name_1_0= ruleEString ) ) ( (lv_position_2_0= ruleEInt ) ) ) )
            // InternalLegoLang.g:1072:2: (otherlv_0= 'UltraSonicSensor' ( (lv_name_1_0= ruleEString ) ) ( (lv_position_2_0= ruleEInt ) ) )
            {
            // InternalLegoLang.g:1072:2: (otherlv_0= 'UltraSonicSensor' ( (lv_name_1_0= ruleEString ) ) ( (lv_position_2_0= ruleEInt ) ) )
            // InternalLegoLang.g:1073:3: otherlv_0= 'UltraSonicSensor' ( (lv_name_1_0= ruleEString ) ) ( (lv_position_2_0= ruleEInt ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getUltraSonicSensorAccess().getUltraSonicSensorKeyword_0());
              		
            }
            // InternalLegoLang.g:1077:3: ( (lv_name_1_0= ruleEString ) )
            // InternalLegoLang.g:1078:4: (lv_name_1_0= ruleEString )
            {
            // InternalLegoLang.g:1078:4: (lv_name_1_0= ruleEString )
            // InternalLegoLang.g:1079:5: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getUltraSonicSensorAccess().getNameEStringParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_6);
            lv_name_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getUltraSonicSensorRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"langageCompilation.concrete.syntax.LegoLang.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalLegoLang.g:1096:3: ( (lv_position_2_0= ruleEInt ) )
            // InternalLegoLang.g:1097:4: (lv_position_2_0= ruleEInt )
            {
            // InternalLegoLang.g:1097:4: (lv_position_2_0= ruleEInt )
            // InternalLegoLang.g:1098:5: lv_position_2_0= ruleEInt
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getUltraSonicSensorAccess().getPositionEIntParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_position_2_0=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getUltraSonicSensorRule());
              					}
              					set(
              						current,
              						"position",
              						lv_position_2_0,
              						"langageCompilation.concrete.syntax.LegoLang.EInt");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleUltraSonicSensor"


    // $ANTLR start "entryRuleCar"
    // InternalLegoLang.g:1119:1: entryRuleCar returns [EObject current=null] : iv_ruleCar= ruleCar EOF ;
    public final EObject entryRuleCar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCar = null;


        try {
            // InternalLegoLang.g:1119:44: (iv_ruleCar= ruleCar EOF )
            // InternalLegoLang.g:1120:2: iv_ruleCar= ruleCar EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCarRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCar=ruleCar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCar; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCar"


    // $ANTLR start "ruleCar"
    // InternalLegoLang.g:1126:1: ruleCar returns [EObject current=null] : (otherlv_0= 'Car' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_sensor_3_0= ruleSensor ) )* ( (lv_engine_4_0= ruleEngine ) )* otherlv_5= '}' ) ;
    public final EObject ruleCar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_sensor_3_0 = null;

        EObject lv_engine_4_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:1132:2: ( (otherlv_0= 'Car' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_sensor_3_0= ruleSensor ) )* ( (lv_engine_4_0= ruleEngine ) )* otherlv_5= '}' ) )
            // InternalLegoLang.g:1133:2: (otherlv_0= 'Car' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_sensor_3_0= ruleSensor ) )* ( (lv_engine_4_0= ruleEngine ) )* otherlv_5= '}' )
            {
            // InternalLegoLang.g:1133:2: (otherlv_0= 'Car' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_sensor_3_0= ruleSensor ) )* ( (lv_engine_4_0= ruleEngine ) )* otherlv_5= '}' )
            // InternalLegoLang.g:1134:3: otherlv_0= 'Car' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_sensor_3_0= ruleSensor ) )* ( (lv_engine_4_0= ruleEngine ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getCarAccess().getCarKeyword_0());
              		
            }
            // InternalLegoLang.g:1138:3: ( (lv_name_1_0= ruleEString ) )
            // InternalLegoLang.g:1139:4: (lv_name_1_0= ruleEString )
            {
            // InternalLegoLang.g:1139:4: (lv_name_1_0= ruleEString )
            // InternalLegoLang.g:1140:5: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCarAccess().getNameEStringParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCarRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"langageCompilation.concrete.syntax.LegoLang.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getCarAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalLegoLang.g:1161:3: ( (lv_sensor_3_0= ruleSensor ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=15 && LA8_0<=19)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalLegoLang.g:1162:4: (lv_sensor_3_0= ruleSensor )
            	    {
            	    // InternalLegoLang.g:1162:4: (lv_sensor_3_0= ruleSensor )
            	    // InternalLegoLang.g:1163:5: lv_sensor_3_0= ruleSensor
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getCarAccess().getSensorSensorParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_sensor_3_0=ruleSensor();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getCarRule());
            	      					}
            	      					add(
            	      						current,
            	      						"sensor",
            	      						lv_sensor_3_0,
            	      						"langageCompilation.concrete.syntax.LegoLang.Sensor");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalLegoLang.g:1180:3: ( (lv_engine_4_0= ruleEngine ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==14) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalLegoLang.g:1181:4: (lv_engine_4_0= ruleEngine )
            	    {
            	    // InternalLegoLang.g:1181:4: (lv_engine_4_0= ruleEngine )
            	    // InternalLegoLang.g:1182:5: lv_engine_4_0= ruleEngine
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getCarAccess().getEngineEngineParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_engine_4_0=ruleEngine();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getCarRule());
            	      					}
            	      					add(
            	      						current,
            	      						"engine",
            	      						lv_engine_4_0,
            	      						"langageCompilation.concrete.syntax.LegoLang.Engine");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getCarAccess().getRightCurlyBracketKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCar"


    // $ANTLR start "entryRuleEngineOperation"
    // InternalLegoLang.g:1207:1: entryRuleEngineOperation returns [EObject current=null] : iv_ruleEngineOperation= ruleEngineOperation EOF ;
    public final EObject entryRuleEngineOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEngineOperation = null;


        try {
            // InternalLegoLang.g:1207:56: (iv_ruleEngineOperation= ruleEngineOperation EOF )
            // InternalLegoLang.g:1208:2: iv_ruleEngineOperation= ruleEngineOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEngineOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEngineOperation=ruleEngineOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEngineOperation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEngineOperation"


    // $ANTLR start "ruleEngineOperation"
    // InternalLegoLang.g:1214:1: ruleEngineOperation returns [EObject current=null] : this_VitesseOperation_0= ruleVitesseOperation ;
    public final EObject ruleEngineOperation() throws RecognitionException {
        EObject current = null;

        EObject this_VitesseOperation_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:1220:2: (this_VitesseOperation_0= ruleVitesseOperation )
            // InternalLegoLang.g:1221:2: this_VitesseOperation_0= ruleVitesseOperation
            {
            if ( state.backtracking==0 ) {

              		/* */
              	
            }
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getEngineOperationAccess().getVitesseOperationParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_VitesseOperation_0=ruleVitesseOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_VitesseOperation_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEngineOperation"


    // $ANTLR start "entryRuleSensorOperation"
    // InternalLegoLang.g:1235:1: entryRuleSensorOperation returns [EObject current=null] : iv_ruleSensorOperation= ruleSensorOperation EOF ;
    public final EObject entryRuleSensorOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorOperation = null;


        try {
            // InternalLegoLang.g:1235:56: (iv_ruleSensorOperation= ruleSensorOperation EOF )
            // InternalLegoLang.g:1236:2: iv_ruleSensorOperation= ruleSensorOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSensorOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSensorOperation=ruleSensorOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSensorOperation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSensorOperation"


    // $ANTLR start "ruleSensorOperation"
    // InternalLegoLang.g:1242:1: ruleSensorOperation returns [EObject current=null] : (this_RangeOperation_0= ruleRangeOperation | this_ColorOperation_1= ruleColorOperation | this_IntensityOperation_2= ruleIntensityOperation | this_XGPSOperation_3= ruleXGPSOperation | this_YGPSOperation_4= ruleYGPSOperation | this_AngleOperation_5= ruleAngleOperation | this_DistanceOperation_6= ruleDistanceOperation ) ;
    public final EObject ruleSensorOperation() throws RecognitionException {
        EObject current = null;

        EObject this_RangeOperation_0 = null;

        EObject this_ColorOperation_1 = null;

        EObject this_IntensityOperation_2 = null;

        EObject this_XGPSOperation_3 = null;

        EObject this_YGPSOperation_4 = null;

        EObject this_AngleOperation_5 = null;

        EObject this_DistanceOperation_6 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:1248:2: ( (this_RangeOperation_0= ruleRangeOperation | this_ColorOperation_1= ruleColorOperation | this_IntensityOperation_2= ruleIntensityOperation | this_XGPSOperation_3= ruleXGPSOperation | this_YGPSOperation_4= ruleYGPSOperation | this_AngleOperation_5= ruleAngleOperation | this_DistanceOperation_6= ruleDistanceOperation ) )
            // InternalLegoLang.g:1249:2: (this_RangeOperation_0= ruleRangeOperation | this_ColorOperation_1= ruleColorOperation | this_IntensityOperation_2= ruleIntensityOperation | this_XGPSOperation_3= ruleXGPSOperation | this_YGPSOperation_4= ruleYGPSOperation | this_AngleOperation_5= ruleAngleOperation | this_DistanceOperation_6= ruleDistanceOperation )
            {
            // InternalLegoLang.g:1249:2: (this_RangeOperation_0= ruleRangeOperation | this_ColorOperation_1= ruleColorOperation | this_IntensityOperation_2= ruleIntensityOperation | this_XGPSOperation_3= ruleXGPSOperation | this_YGPSOperation_4= ruleYGPSOperation | this_AngleOperation_5= ruleAngleOperation | this_DistanceOperation_6= ruleDistanceOperation )
            int alt10=7;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                switch ( input.LA(2) ) {
                case 28:
                    {
                    alt10=3;
                    }
                    break;
                case 31:
                    {
                    alt10=5;
                    }
                    break;
                case 29:
                    {
                    alt10=1;
                    }
                    break;
                case 32:
                    {
                    alt10=6;
                    }
                    break;
                case 33:
                    {
                    alt10=7;
                    }
                    break;
                case 25:
                    {
                    alt10=2;
                    }
                    break;
                case 30:
                    {
                    alt10=4;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalLegoLang.g:1250:3: this_RangeOperation_0= ruleRangeOperation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSensorOperationAccess().getRangeOperationParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RangeOperation_0=ruleRangeOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RangeOperation_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalLegoLang.g:1262:3: this_ColorOperation_1= ruleColorOperation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSensorOperationAccess().getColorOperationParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ColorOperation_1=ruleColorOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ColorOperation_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalLegoLang.g:1274:3: this_IntensityOperation_2= ruleIntensityOperation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSensorOperationAccess().getIntensityOperationParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IntensityOperation_2=ruleIntensityOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IntensityOperation_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalLegoLang.g:1286:3: this_XGPSOperation_3= ruleXGPSOperation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSensorOperationAccess().getXGPSOperationParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XGPSOperation_3=ruleXGPSOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XGPSOperation_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalLegoLang.g:1298:3: this_YGPSOperation_4= ruleYGPSOperation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSensorOperationAccess().getYGPSOperationParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_YGPSOperation_4=ruleYGPSOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_YGPSOperation_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalLegoLang.g:1310:3: this_AngleOperation_5= ruleAngleOperation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSensorOperationAccess().getAngleOperationParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AngleOperation_5=ruleAngleOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AngleOperation_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalLegoLang.g:1322:3: this_DistanceOperation_6= ruleDistanceOperation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSensorOperationAccess().getDistanceOperationParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DistanceOperation_6=ruleDistanceOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DistanceOperation_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSensorOperation"


    // $ANTLR start "entryRuleVitesseOperation"
    // InternalLegoLang.g:1337:1: entryRuleVitesseOperation returns [EObject current=null] : iv_ruleVitesseOperation= ruleVitesseOperation EOF ;
    public final EObject entryRuleVitesseOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVitesseOperation = null;


        try {
            // InternalLegoLang.g:1337:57: (iv_ruleVitesseOperation= ruleVitesseOperation EOF )
            // InternalLegoLang.g:1338:2: iv_ruleVitesseOperation= ruleVitesseOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVitesseOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVitesseOperation=ruleVitesseOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVitesseOperation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVitesseOperation"


    // $ANTLR start "ruleVitesseOperation"
    // InternalLegoLang.g:1344:1: ruleVitesseOperation returns [EObject current=null] : ( ( ( ruleFQN ) ) otherlv_1= ':' otherlv_2= 'vitesse' otherlv_3= '=' ( (lv_right_4_0= ruleExpression ) ) ) ;
    public final EObject ruleVitesseOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:1350:2: ( ( ( ( ruleFQN ) ) otherlv_1= ':' otherlv_2= 'vitesse' otherlv_3= '=' ( (lv_right_4_0= ruleExpression ) ) ) )
            // InternalLegoLang.g:1351:2: ( ( ( ruleFQN ) ) otherlv_1= ':' otherlv_2= 'vitesse' otherlv_3= '=' ( (lv_right_4_0= ruleExpression ) ) )
            {
            // InternalLegoLang.g:1351:2: ( ( ( ruleFQN ) ) otherlv_1= ':' otherlv_2= 'vitesse' otherlv_3= '=' ( (lv_right_4_0= ruleExpression ) ) )
            // InternalLegoLang.g:1352:3: ( ( ruleFQN ) ) otherlv_1= ':' otherlv_2= 'vitesse' otherlv_3= '=' ( (lv_right_4_0= ruleExpression ) )
            {
            // InternalLegoLang.g:1352:3: ( ( ruleFQN ) )
            // InternalLegoLang.g:1353:4: ( ruleFQN )
            {
            // InternalLegoLang.g:1353:4: ( ruleFQN )
            // InternalLegoLang.g:1354:5: ruleFQN
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVitesseOperationRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVitesseOperationAccess().getWheelengineWheelEngineCrossReference_0_0());
              				
            }
            pushFollow(FOLLOW_7);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVitesseOperationAccess().getColonKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,22,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getVitesseOperationAccess().getVitesseKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,23,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getVitesseOperationAccess().getEqualsSignKeyword_3());
              		
            }
            // InternalLegoLang.g:1383:3: ( (lv_right_4_0= ruleExpression ) )
            // InternalLegoLang.g:1384:4: (lv_right_4_0= ruleExpression )
            {
            // InternalLegoLang.g:1384:4: (lv_right_4_0= ruleExpression )
            // InternalLegoLang.g:1385:5: lv_right_4_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVitesseOperationAccess().getRightExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_right_4_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVitesseOperationRule());
              					}
              					set(
              						current,
              						"right",
              						lv_right_4_0,
              						"langageCompilation.concrete.syntax.LegoLang.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleVitesseOperation"


    // $ANTLR start "entryRuleColorOperation"
    // InternalLegoLang.g:1406:1: entryRuleColorOperation returns [EObject current=null] : iv_ruleColorOperation= ruleColorOperation EOF ;
    public final EObject entryRuleColorOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorOperation = null;


        try {
            // InternalLegoLang.g:1406:55: (iv_ruleColorOperation= ruleColorOperation EOF )
            // InternalLegoLang.g:1407:2: iv_ruleColorOperation= ruleColorOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getColorOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleColorOperation=ruleColorOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleColorOperation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleColorOperation"


    // $ANTLR start "ruleColorOperation"
    // InternalLegoLang.g:1413:1: ruleColorOperation returns [EObject current=null] : (otherlv_0= 'get' otherlv_1= 'color' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' ) ;
    public final EObject ruleColorOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalLegoLang.g:1419:2: ( (otherlv_0= 'get' otherlv_1= 'color' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' ) )
            // InternalLegoLang.g:1420:2: (otherlv_0= 'get' otherlv_1= 'color' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' )
            {
            // InternalLegoLang.g:1420:2: (otherlv_0= 'get' otherlv_1= 'color' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' )
            // InternalLegoLang.g:1421:3: otherlv_0= 'get' otherlv_1= 'color' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getColorOperationAccess().getGetKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,25,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getColorOperationAccess().getColorKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,26,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getColorOperationAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalLegoLang.g:1433:3: ( ( ruleFQN ) )
            // InternalLegoLang.g:1434:4: ( ruleFQN )
            {
            // InternalLegoLang.g:1434:4: ( ruleFQN )
            // InternalLegoLang.g:1435:5: ruleFQN
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getColorOperationRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getColorOperationAccess().getColorsensorColorSensorCrossReference_3_0());
              				
            }
            pushFollow(FOLLOW_14);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getColorOperationAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleColorOperation"


    // $ANTLR start "entryRuleIntensityOperation"
    // InternalLegoLang.g:1460:1: entryRuleIntensityOperation returns [EObject current=null] : iv_ruleIntensityOperation= ruleIntensityOperation EOF ;
    public final EObject entryRuleIntensityOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntensityOperation = null;


        try {
            // InternalLegoLang.g:1460:59: (iv_ruleIntensityOperation= ruleIntensityOperation EOF )
            // InternalLegoLang.g:1461:2: iv_ruleIntensityOperation= ruleIntensityOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntensityOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIntensityOperation=ruleIntensityOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntensityOperation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIntensityOperation"


    // $ANTLR start "ruleIntensityOperation"
    // InternalLegoLang.g:1467:1: ruleIntensityOperation returns [EObject current=null] : (otherlv_0= 'get' otherlv_1= 'intensity' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' ) ;
    public final EObject ruleIntensityOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalLegoLang.g:1473:2: ( (otherlv_0= 'get' otherlv_1= 'intensity' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' ) )
            // InternalLegoLang.g:1474:2: (otherlv_0= 'get' otherlv_1= 'intensity' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' )
            {
            // InternalLegoLang.g:1474:2: (otherlv_0= 'get' otherlv_1= 'intensity' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' )
            // InternalLegoLang.g:1475:3: otherlv_0= 'get' otherlv_1= 'intensity' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIntensityOperationAccess().getGetKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,28,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getIntensityOperationAccess().getIntensityKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,26,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getIntensityOperationAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalLegoLang.g:1487:3: ( ( ruleFQN ) )
            // InternalLegoLang.g:1488:4: ( ruleFQN )
            {
            // InternalLegoLang.g:1488:4: ( ruleFQN )
            // InternalLegoLang.g:1489:5: ruleFQN
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getIntensityOperationRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIntensityOperationAccess().getColorsensorColorSensorCrossReference_3_0());
              				
            }
            pushFollow(FOLLOW_14);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getIntensityOperationAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleIntensityOperation"


    // $ANTLR start "entryRuleRangeOperation"
    // InternalLegoLang.g:1514:1: entryRuleRangeOperation returns [EObject current=null] : iv_ruleRangeOperation= ruleRangeOperation EOF ;
    public final EObject entryRuleRangeOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRangeOperation = null;


        try {
            // InternalLegoLang.g:1514:55: (iv_ruleRangeOperation= ruleRangeOperation EOF )
            // InternalLegoLang.g:1515:2: iv_ruleRangeOperation= ruleRangeOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRangeOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRangeOperation=ruleRangeOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRangeOperation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRangeOperation"


    // $ANTLR start "ruleRangeOperation"
    // InternalLegoLang.g:1521:1: ruleRangeOperation returns [EObject current=null] : (otherlv_0= 'get' otherlv_1= 'range' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' ) ;
    public final EObject ruleRangeOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalLegoLang.g:1527:2: ( (otherlv_0= 'get' otherlv_1= 'range' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' ) )
            // InternalLegoLang.g:1528:2: (otherlv_0= 'get' otherlv_1= 'range' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' )
            {
            // InternalLegoLang.g:1528:2: (otherlv_0= 'get' otherlv_1= 'range' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' )
            // InternalLegoLang.g:1529:3: otherlv_0= 'get' otherlv_1= 'range' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRangeOperationAccess().getGetKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,29,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRangeOperationAccess().getRangeKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,26,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getRangeOperationAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalLegoLang.g:1541:3: ( ( ruleFQN ) )
            // InternalLegoLang.g:1542:4: ( ruleFQN )
            {
            // InternalLegoLang.g:1542:4: ( ruleFQN )
            // InternalLegoLang.g:1543:5: ruleFQN
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRangeOperationRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRangeOperationAccess().getLasersensorLaserSensorCrossReference_3_0());
              				
            }
            pushFollow(FOLLOW_14);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getRangeOperationAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRangeOperation"


    // $ANTLR start "entryRuleXGPSOperation"
    // InternalLegoLang.g:1568:1: entryRuleXGPSOperation returns [EObject current=null] : iv_ruleXGPSOperation= ruleXGPSOperation EOF ;
    public final EObject entryRuleXGPSOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXGPSOperation = null;


        try {
            // InternalLegoLang.g:1568:54: (iv_ruleXGPSOperation= ruleXGPSOperation EOF )
            // InternalLegoLang.g:1569:2: iv_ruleXGPSOperation= ruleXGPSOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXGPSOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXGPSOperation=ruleXGPSOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXGPSOperation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXGPSOperation"


    // $ANTLR start "ruleXGPSOperation"
    // InternalLegoLang.g:1575:1: ruleXGPSOperation returns [EObject current=null] : (otherlv_0= 'get' otherlv_1= 'x' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' ) ;
    public final EObject ruleXGPSOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalLegoLang.g:1581:2: ( (otherlv_0= 'get' otherlv_1= 'x' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' ) )
            // InternalLegoLang.g:1582:2: (otherlv_0= 'get' otherlv_1= 'x' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' )
            {
            // InternalLegoLang.g:1582:2: (otherlv_0= 'get' otherlv_1= 'x' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' )
            // InternalLegoLang.g:1583:3: otherlv_0= 'get' otherlv_1= 'x' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getXGPSOperationAccess().getGetKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,30,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getXGPSOperationAccess().getXKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,26,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getXGPSOperationAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalLegoLang.g:1595:3: ( ( ruleFQN ) )
            // InternalLegoLang.g:1596:4: ( ruleFQN )
            {
            // InternalLegoLang.g:1596:4: ( ruleFQN )
            // InternalLegoLang.g:1597:5: ruleFQN
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getXGPSOperationRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getXGPSOperationAccess().getGpssensorGPSSensorCrossReference_3_0());
              				
            }
            pushFollow(FOLLOW_14);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getXGPSOperationAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleXGPSOperation"


    // $ANTLR start "entryRuleYGPSOperation"
    // InternalLegoLang.g:1622:1: entryRuleYGPSOperation returns [EObject current=null] : iv_ruleYGPSOperation= ruleYGPSOperation EOF ;
    public final EObject entryRuleYGPSOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYGPSOperation = null;


        try {
            // InternalLegoLang.g:1622:54: (iv_ruleYGPSOperation= ruleYGPSOperation EOF )
            // InternalLegoLang.g:1623:2: iv_ruleYGPSOperation= ruleYGPSOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getYGPSOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleYGPSOperation=ruleYGPSOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleYGPSOperation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleYGPSOperation"


    // $ANTLR start "ruleYGPSOperation"
    // InternalLegoLang.g:1629:1: ruleYGPSOperation returns [EObject current=null] : (otherlv_0= 'get' otherlv_1= 'y' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' ) ;
    public final EObject ruleYGPSOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalLegoLang.g:1635:2: ( (otherlv_0= 'get' otherlv_1= 'y' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' ) )
            // InternalLegoLang.g:1636:2: (otherlv_0= 'get' otherlv_1= 'y' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' )
            {
            // InternalLegoLang.g:1636:2: (otherlv_0= 'get' otherlv_1= 'y' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' )
            // InternalLegoLang.g:1637:3: otherlv_0= 'get' otherlv_1= 'y' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getYGPSOperationAccess().getGetKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,31,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getYGPSOperationAccess().getYKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,26,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getYGPSOperationAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalLegoLang.g:1649:3: ( ( ruleFQN ) )
            // InternalLegoLang.g:1650:4: ( ruleFQN )
            {
            // InternalLegoLang.g:1650:4: ( ruleFQN )
            // InternalLegoLang.g:1651:5: ruleFQN
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getYGPSOperationRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getYGPSOperationAccess().getGpssensorGPSSensorCrossReference_3_0());
              				
            }
            pushFollow(FOLLOW_14);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getYGPSOperationAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleYGPSOperation"


    // $ANTLR start "entryRuleAngleOperation"
    // InternalLegoLang.g:1676:1: entryRuleAngleOperation returns [EObject current=null] : iv_ruleAngleOperation= ruleAngleOperation EOF ;
    public final EObject entryRuleAngleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAngleOperation = null;


        try {
            // InternalLegoLang.g:1676:55: (iv_ruleAngleOperation= ruleAngleOperation EOF )
            // InternalLegoLang.g:1677:2: iv_ruleAngleOperation= ruleAngleOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAngleOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAngleOperation=ruleAngleOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAngleOperation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAngleOperation"


    // $ANTLR start "ruleAngleOperation"
    // InternalLegoLang.g:1683:1: ruleAngleOperation returns [EObject current=null] : (otherlv_0= 'get' otherlv_1= 'angle' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' ) ;
    public final EObject ruleAngleOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalLegoLang.g:1689:2: ( (otherlv_0= 'get' otherlv_1= 'angle' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' ) )
            // InternalLegoLang.g:1690:2: (otherlv_0= 'get' otherlv_1= 'angle' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' )
            {
            // InternalLegoLang.g:1690:2: (otherlv_0= 'get' otherlv_1= 'angle' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' )
            // InternalLegoLang.g:1691:3: otherlv_0= 'get' otherlv_1= 'angle' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAngleOperationAccess().getGetKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,32,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAngleOperationAccess().getAngleKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,26,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getAngleOperationAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalLegoLang.g:1703:3: ( ( ruleFQN ) )
            // InternalLegoLang.g:1704:4: ( ruleFQN )
            {
            // InternalLegoLang.g:1704:4: ( ruleFQN )
            // InternalLegoLang.g:1705:5: ruleFQN
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAngleOperationRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAngleOperationAccess().getGyrosensorGyroSensorCrossReference_3_0());
              				
            }
            pushFollow(FOLLOW_14);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getAngleOperationAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAngleOperation"


    // $ANTLR start "entryRuleDistanceOperation"
    // InternalLegoLang.g:1730:1: entryRuleDistanceOperation returns [EObject current=null] : iv_ruleDistanceOperation= ruleDistanceOperation EOF ;
    public final EObject entryRuleDistanceOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDistanceOperation = null;


        try {
            // InternalLegoLang.g:1730:58: (iv_ruleDistanceOperation= ruleDistanceOperation EOF )
            // InternalLegoLang.g:1731:2: iv_ruleDistanceOperation= ruleDistanceOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDistanceOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDistanceOperation=ruleDistanceOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDistanceOperation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDistanceOperation"


    // $ANTLR start "ruleDistanceOperation"
    // InternalLegoLang.g:1737:1: ruleDistanceOperation returns [EObject current=null] : (otherlv_0= 'get' otherlv_1= 'distance' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' ) ;
    public final EObject ruleDistanceOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalLegoLang.g:1743:2: ( (otherlv_0= 'get' otherlv_1= 'distance' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' ) )
            // InternalLegoLang.g:1744:2: (otherlv_0= 'get' otherlv_1= 'distance' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' )
            {
            // InternalLegoLang.g:1744:2: (otherlv_0= 'get' otherlv_1= 'distance' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' )
            // InternalLegoLang.g:1745:3: otherlv_0= 'get' otherlv_1= 'distance' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDistanceOperationAccess().getGetKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,33,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDistanceOperationAccess().getDistanceKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,26,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDistanceOperationAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalLegoLang.g:1757:3: ( ( ruleFQN ) )
            // InternalLegoLang.g:1758:4: ( ruleFQN )
            {
            // InternalLegoLang.g:1758:4: ( ruleFQN )
            // InternalLegoLang.g:1759:5: ruleFQN
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDistanceOperationRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDistanceOperationAccess().getUltrasonicsensorUltraSonicSensorCrossReference_3_0());
              				
            }
            pushFollow(FOLLOW_14);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getDistanceOperationAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDistanceOperation"


    // $ANTLR start "entryRuleConditionEtat"
    // InternalLegoLang.g:1784:1: entryRuleConditionEtat returns [EObject current=null] : iv_ruleConditionEtat= ruleConditionEtat EOF ;
    public final EObject entryRuleConditionEtat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionEtat = null;


        try {
            // InternalLegoLang.g:1784:54: (iv_ruleConditionEtat= ruleConditionEtat EOF )
            // InternalLegoLang.g:1785:2: iv_ruleConditionEtat= ruleConditionEtat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionEtatRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConditionEtat=ruleConditionEtat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditionEtat; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConditionEtat"


    // $ANTLR start "ruleConditionEtat"
    // InternalLegoLang.g:1791:1: ruleConditionEtat returns [EObject current=null] : (otherlv_0= 'if' ( (lv_Condition_1_0= ruleComparaison ) ) (otherlv_2= 'and' ( (lv_Condition_3_0= ruleComparaison ) ) )* (otherlv_4= 'or' ( (lv_Condition_5_0= ruleComparaison ) ) )* otherlv_6= '{' ( (lv_then_7_0= ruleStatement ) )* otherlv_8= '}' (otherlv_9= 'else{' ( (lv_else_10_0= ruleStatement ) ) otherlv_11= '}' )? ) ;
    public final EObject ruleConditionEtat() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_Condition_1_0 = null;

        EObject lv_Condition_3_0 = null;

        EObject lv_Condition_5_0 = null;

        EObject lv_then_7_0 = null;

        EObject lv_else_10_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:1797:2: ( (otherlv_0= 'if' ( (lv_Condition_1_0= ruleComparaison ) ) (otherlv_2= 'and' ( (lv_Condition_3_0= ruleComparaison ) ) )* (otherlv_4= 'or' ( (lv_Condition_5_0= ruleComparaison ) ) )* otherlv_6= '{' ( (lv_then_7_0= ruleStatement ) )* otherlv_8= '}' (otherlv_9= 'else{' ( (lv_else_10_0= ruleStatement ) ) otherlv_11= '}' )? ) )
            // InternalLegoLang.g:1798:2: (otherlv_0= 'if' ( (lv_Condition_1_0= ruleComparaison ) ) (otherlv_2= 'and' ( (lv_Condition_3_0= ruleComparaison ) ) )* (otherlv_4= 'or' ( (lv_Condition_5_0= ruleComparaison ) ) )* otherlv_6= '{' ( (lv_then_7_0= ruleStatement ) )* otherlv_8= '}' (otherlv_9= 'else{' ( (lv_else_10_0= ruleStatement ) ) otherlv_11= '}' )? )
            {
            // InternalLegoLang.g:1798:2: (otherlv_0= 'if' ( (lv_Condition_1_0= ruleComparaison ) ) (otherlv_2= 'and' ( (lv_Condition_3_0= ruleComparaison ) ) )* (otherlv_4= 'or' ( (lv_Condition_5_0= ruleComparaison ) ) )* otherlv_6= '{' ( (lv_then_7_0= ruleStatement ) )* otherlv_8= '}' (otherlv_9= 'else{' ( (lv_else_10_0= ruleStatement ) ) otherlv_11= '}' )? )
            // InternalLegoLang.g:1799:3: otherlv_0= 'if' ( (lv_Condition_1_0= ruleComparaison ) ) (otherlv_2= 'and' ( (lv_Condition_3_0= ruleComparaison ) ) )* (otherlv_4= 'or' ( (lv_Condition_5_0= ruleComparaison ) ) )* otherlv_6= '{' ( (lv_then_7_0= ruleStatement ) )* otherlv_8= '}' (otherlv_9= 'else{' ( (lv_else_10_0= ruleStatement ) ) otherlv_11= '}' )?
            {
            otherlv_0=(Token)match(input,34,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConditionEtatAccess().getIfKeyword_0());
              		
            }
            // InternalLegoLang.g:1803:3: ( (lv_Condition_1_0= ruleComparaison ) )
            // InternalLegoLang.g:1804:4: (lv_Condition_1_0= ruleComparaison )
            {
            // InternalLegoLang.g:1804:4: (lv_Condition_1_0= ruleComparaison )
            // InternalLegoLang.g:1805:5: lv_Condition_1_0= ruleComparaison
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConditionEtatAccess().getConditionComparaisonParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_21);
            lv_Condition_1_0=ruleComparaison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConditionEtatRule());
              					}
              					add(
              						current,
              						"Condition",
              						lv_Condition_1_0,
              						"langageCompilation.concrete.syntax.LegoLang.Comparaison");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalLegoLang.g:1822:3: (otherlv_2= 'and' ( (lv_Condition_3_0= ruleComparaison ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==35) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalLegoLang.g:1823:4: otherlv_2= 'and' ( (lv_Condition_3_0= ruleComparaison ) )
            	    {
            	    otherlv_2=(Token)match(input,35,FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getConditionEtatAccess().getAndKeyword_2_0());
            	      			
            	    }
            	    // InternalLegoLang.g:1827:4: ( (lv_Condition_3_0= ruleComparaison ) )
            	    // InternalLegoLang.g:1828:5: (lv_Condition_3_0= ruleComparaison )
            	    {
            	    // InternalLegoLang.g:1828:5: (lv_Condition_3_0= ruleComparaison )
            	    // InternalLegoLang.g:1829:6: lv_Condition_3_0= ruleComparaison
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getConditionEtatAccess().getConditionComparaisonParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_21);
            	    lv_Condition_3_0=ruleComparaison();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getConditionEtatRule());
            	      						}
            	      						add(
            	      							current,
            	      							"Condition",
            	      							lv_Condition_3_0,
            	      							"langageCompilation.concrete.syntax.LegoLang.Comparaison");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalLegoLang.g:1847:3: (otherlv_4= 'or' ( (lv_Condition_5_0= ruleComparaison ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==36) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalLegoLang.g:1848:4: otherlv_4= 'or' ( (lv_Condition_5_0= ruleComparaison ) )
            	    {
            	    otherlv_4=(Token)match(input,36,FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getConditionEtatAccess().getOrKeyword_3_0());
            	      			
            	    }
            	    // InternalLegoLang.g:1852:4: ( (lv_Condition_5_0= ruleComparaison ) )
            	    // InternalLegoLang.g:1853:5: (lv_Condition_5_0= ruleComparaison )
            	    {
            	    // InternalLegoLang.g:1853:5: (lv_Condition_5_0= ruleComparaison )
            	    // InternalLegoLang.g:1854:6: lv_Condition_5_0= ruleComparaison
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getConditionEtatAccess().getConditionComparaisonParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_22);
            	    lv_Condition_5_0=ruleComparaison();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getConditionEtatRule());
            	      						}
            	      						add(
            	      							current,
            	      							"Condition",
            	      							lv_Condition_5_0,
            	      							"langageCompilation.concrete.syntax.LegoLang.Comparaison");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_6=(Token)match(input,12,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getConditionEtatAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalLegoLang.g:1876:3: ( (lv_then_7_0= ruleStatement ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_STRING && LA13_0<=RULE_INT)||(LA13_0>=14 && LA13_0<=20)||LA13_0==24||LA13_0==26||LA13_0==34||(LA13_0>=38 && LA13_0<=39)||LA13_0==42||(LA13_0>=54 && LA13_0<=57)||LA13_0==59||(LA13_0>=61 && LA13_0<=62)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalLegoLang.g:1877:4: (lv_then_7_0= ruleStatement )
            	    {
            	    // InternalLegoLang.g:1877:4: (lv_then_7_0= ruleStatement )
            	    // InternalLegoLang.g:1878:5: lv_then_7_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getConditionEtatAccess().getThenStatementParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_then_7_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getConditionEtatRule());
            	      					}
            	      					add(
            	      						current,
            	      						"then",
            	      						lv_then_7_0,
            	      						"langageCompilation.concrete.syntax.LegoLang.Statement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_8=(Token)match(input,13,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getConditionEtatAccess().getRightCurlyBracketKeyword_6());
              		
            }
            // InternalLegoLang.g:1899:3: (otherlv_9= 'else{' ( (lv_else_10_0= ruleStatement ) ) otherlv_11= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==37) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalLegoLang.g:1900:4: otherlv_9= 'else{' ( (lv_else_10_0= ruleStatement ) ) otherlv_11= '}'
                    {
                    otherlv_9=(Token)match(input,37,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getConditionEtatAccess().getElseKeyword_7_0());
                      			
                    }
                    // InternalLegoLang.g:1904:4: ( (lv_else_10_0= ruleStatement ) )
                    // InternalLegoLang.g:1905:5: (lv_else_10_0= ruleStatement )
                    {
                    // InternalLegoLang.g:1905:5: (lv_else_10_0= ruleStatement )
                    // InternalLegoLang.g:1906:6: lv_else_10_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConditionEtatAccess().getElseStatementParserRuleCall_7_1_0());
                      					
                    }
                    pushFollow(FOLLOW_25);
                    lv_else_10_0=ruleStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getConditionEtatRule());
                      						}
                      						add(
                      							current,
                      							"else",
                      							lv_else_10_0,
                      							"langageCompilation.concrete.syntax.LegoLang.Statement");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_11=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getConditionEtatAccess().getRightCurlyBracketKeyword_7_2());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleConditionEtat"


    // $ANTLR start "entryRuleEString"
    // InternalLegoLang.g:1932:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalLegoLang.g:1932:47: (iv_ruleEString= ruleEString EOF )
            // InternalLegoLang.g:1933:2: iv_ruleEString= ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStringRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEString.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalLegoLang.g:1939:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalLegoLang.g:1945:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalLegoLang.g:1946:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalLegoLang.g:1946:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_ID) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalLegoLang.g:1947:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_STRING_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalLegoLang.g:1955:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ID_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleWhileLoop"
    // InternalLegoLang.g:1966:1: entryRuleWhileLoop returns [EObject current=null] : iv_ruleWhileLoop= ruleWhileLoop EOF ;
    public final EObject entryRuleWhileLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileLoop = null;


        try {
            // InternalLegoLang.g:1966:50: (iv_ruleWhileLoop= ruleWhileLoop EOF )
            // InternalLegoLang.g:1967:2: iv_ruleWhileLoop= ruleWhileLoop EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhileLoopRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWhileLoop=ruleWhileLoop();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhileLoop; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleWhileLoop"


    // $ANTLR start "ruleWhileLoop"
    // InternalLegoLang.g:1973:1: ruleWhileLoop returns [EObject current=null] : (otherlv_0= 'while' ( (lv_LoopCondition_1_0= ruleComparaison ) ) otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= '}' ) ;
    public final EObject ruleWhileLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_LoopCondition_1_0 = null;

        EObject lv_statement_3_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:1979:2: ( (otherlv_0= 'while' ( (lv_LoopCondition_1_0= ruleComparaison ) ) otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= '}' ) )
            // InternalLegoLang.g:1980:2: (otherlv_0= 'while' ( (lv_LoopCondition_1_0= ruleComparaison ) ) otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= '}' )
            {
            // InternalLegoLang.g:1980:2: (otherlv_0= 'while' ( (lv_LoopCondition_1_0= ruleComparaison ) ) otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= '}' )
            // InternalLegoLang.g:1981:3: otherlv_0= 'while' ( (lv_LoopCondition_1_0= ruleComparaison ) ) otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWhileLoopAccess().getWhileKeyword_0());
              		
            }
            // InternalLegoLang.g:1985:3: ( (lv_LoopCondition_1_0= ruleComparaison ) )
            // InternalLegoLang.g:1986:4: (lv_LoopCondition_1_0= ruleComparaison )
            {
            // InternalLegoLang.g:1986:4: (lv_LoopCondition_1_0= ruleComparaison )
            // InternalLegoLang.g:1987:5: lv_LoopCondition_1_0= ruleComparaison
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWhileLoopAccess().getLoopConditionComparaisonParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_LoopCondition_1_0=ruleComparaison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWhileLoopRule());
              					}
              					set(
              						current,
              						"LoopCondition",
              						lv_LoopCondition_1_0,
              						"langageCompilation.concrete.syntax.LegoLang.Comparaison");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getWhileLoopAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalLegoLang.g:2008:3: ( (lv_statement_3_0= ruleStatement ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_INT)||(LA16_0>=14 && LA16_0<=20)||LA16_0==24||LA16_0==26||LA16_0==34||(LA16_0>=38 && LA16_0<=39)||LA16_0==42||(LA16_0>=54 && LA16_0<=57)||LA16_0==59||(LA16_0>=61 && LA16_0<=62)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalLegoLang.g:2009:4: (lv_statement_3_0= ruleStatement )
            	    {
            	    // InternalLegoLang.g:2009:4: (lv_statement_3_0= ruleStatement )
            	    // InternalLegoLang.g:2010:5: lv_statement_3_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getWhileLoopAccess().getStatementStatementParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_statement_3_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getWhileLoopRule());
            	      					}
            	      					add(
            	      						current,
            	      						"statement",
            	      						lv_statement_3_0,
            	      						"langageCompilation.concrete.syntax.LegoLang.Statement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getWhileLoopAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleWhileLoop"


    // $ANTLR start "entryRuleMethodePrint"
    // InternalLegoLang.g:2035:1: entryRuleMethodePrint returns [EObject current=null] : iv_ruleMethodePrint= ruleMethodePrint EOF ;
    public final EObject entryRuleMethodePrint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodePrint = null;


        try {
            // InternalLegoLang.g:2035:53: (iv_ruleMethodePrint= ruleMethodePrint EOF )
            // InternalLegoLang.g:2036:2: iv_ruleMethodePrint= ruleMethodePrint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethodePrintRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMethodePrint=ruleMethodePrint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethodePrint; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMethodePrint"


    // $ANTLR start "ruleMethodePrint"
    // InternalLegoLang.g:2042:1: ruleMethodePrint returns [EObject current=null] : ( () otherlv_1= 'print(' ( ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ',' )+ otherlv_4= ');' ) ;
    public final EObject ruleMethodePrint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:2048:2: ( ( () otherlv_1= 'print(' ( ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ',' )+ otherlv_4= ');' ) )
            // InternalLegoLang.g:2049:2: ( () otherlv_1= 'print(' ( ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ',' )+ otherlv_4= ');' )
            {
            // InternalLegoLang.g:2049:2: ( () otherlv_1= 'print(' ( ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ',' )+ otherlv_4= ');' )
            // InternalLegoLang.g:2050:3: () otherlv_1= 'print(' ( ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ',' )+ otherlv_4= ');'
            {
            // InternalLegoLang.g:2050:3: ()
            // InternalLegoLang.g:2051:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getMethodePrintAccess().getMethodePrintAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,39,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMethodePrintAccess().getPrintKeyword_1());
              		
            }
            // InternalLegoLang.g:2064:3: ( ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ',' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_STRING && LA17_0<=RULE_INT)||LA17_0==24||LA17_0==26||LA17_0==42||(LA17_0>=54 && LA17_0<=55)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalLegoLang.g:2065:4: ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ','
            	    {
            	    // InternalLegoLang.g:2065:4: ( (lv_expression_2_0= ruleExpression ) )
            	    // InternalLegoLang.g:2066:5: (lv_expression_2_0= ruleExpression )
            	    {
            	    // InternalLegoLang.g:2066:5: (lv_expression_2_0= ruleExpression )
            	    // InternalLegoLang.g:2067:6: lv_expression_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMethodePrintAccess().getExpressionExpressionParserRuleCall_2_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_26);
            	    lv_expression_2_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getMethodePrintRule());
            	      						}
            	      						add(
            	      							current,
            	      							"expression",
            	      							lv_expression_2_0,
            	      							"langageCompilation.concrete.syntax.LegoLang.Expression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    otherlv_3=(Token)match(input,40,FOLLOW_27); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getMethodePrintAccess().getCommaKeyword_2_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);

            otherlv_4=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getMethodePrintAccess().getRightParenthesisSemicolonKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMethodePrint"


    // $ANTLR start "entryRuleVariableRef"
    // InternalLegoLang.g:2097:1: entryRuleVariableRef returns [EObject current=null] : iv_ruleVariableRef= ruleVariableRef EOF ;
    public final EObject entryRuleVariableRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableRef = null;


        try {
            // InternalLegoLang.g:2097:52: (iv_ruleVariableRef= ruleVariableRef EOF )
            // InternalLegoLang.g:2098:2: iv_ruleVariableRef= ruleVariableRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableRefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVariableRef=ruleVariableRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableRef; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVariableRef"


    // $ANTLR start "ruleVariableRef"
    // InternalLegoLang.g:2104:1: ruleVariableRef returns [EObject current=null] : ( ( ruleEString ) ) ;
    public final EObject ruleVariableRef() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalLegoLang.g:2110:2: ( ( ( ruleEString ) ) )
            // InternalLegoLang.g:2111:2: ( ( ruleEString ) )
            {
            // InternalLegoLang.g:2111:2: ( ( ruleEString ) )
            // InternalLegoLang.g:2112:3: ( ruleEString )
            {
            // InternalLegoLang.g:2112:3: ( ruleEString )
            // InternalLegoLang.g:2113:4: ruleEString
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getVariableRefRule());
              				}
              			
            }
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getVariableRefAccess().getVariableVariableCrossReference_0());
              			
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleVariableRef"


    // $ANTLR start "entryRuleSubstraction"
    // InternalLegoLang.g:2133:1: entryRuleSubstraction returns [EObject current=null] : iv_ruleSubstraction= ruleSubstraction EOF ;
    public final EObject entryRuleSubstraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubstraction = null;


        try {
            // InternalLegoLang.g:2133:53: (iv_ruleSubstraction= ruleSubstraction EOF )
            // InternalLegoLang.g:2134:2: iv_ruleSubstraction= ruleSubstraction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubstractionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSubstraction=ruleSubstraction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubstraction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSubstraction"


    // $ANTLR start "ruleSubstraction"
    // InternalLegoLang.g:2140:1: ruleSubstraction returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '-' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleSubstraction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:2146:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '-' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalLegoLang.g:2147:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '-' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalLegoLang.g:2147:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '-' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalLegoLang.g:2148:3: otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '-' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSubstractionAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalLegoLang.g:2152:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalLegoLang.g:2153:4: (lv_left_1_0= ruleExpression )
            {
            // InternalLegoLang.g:2153:4: (lv_left_1_0= ruleExpression )
            // InternalLegoLang.g:2154:5: lv_left_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSubstractionAccess().getLeftExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_28);
            lv_left_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSubstractionRule());
              					}
              					set(
              						current,
              						"left",
              						lv_left_1_0,
              						"langageCompilation.concrete.syntax.LegoLang.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,42,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getSubstractionAccess().getHyphenMinusKeyword_2());
              		
            }
            // InternalLegoLang.g:2175:3: ( (lv_right_3_0= ruleExpression ) )
            // InternalLegoLang.g:2176:4: (lv_right_3_0= ruleExpression )
            {
            // InternalLegoLang.g:2176:4: (lv_right_3_0= ruleExpression )
            // InternalLegoLang.g:2177:5: lv_right_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSubstractionAccess().getRightExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_14);
            lv_right_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSubstractionRule());
              					}
              					set(
              						current,
              						"right",
              						lv_right_3_0,
              						"langageCompilation.concrete.syntax.LegoLang.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getSubstractionAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSubstraction"


    // $ANTLR start "entryRuleAddition"
    // InternalLegoLang.g:2202:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // InternalLegoLang.g:2202:49: (iv_ruleAddition= ruleAddition EOF )
            // InternalLegoLang.g:2203:2: iv_ruleAddition= ruleAddition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAddition=ruleAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // InternalLegoLang.g:2209:1: ruleAddition returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '+' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:2215:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '+' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalLegoLang.g:2216:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '+' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalLegoLang.g:2216:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '+' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalLegoLang.g:2217:3: otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '+' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAdditionAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalLegoLang.g:2221:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalLegoLang.g:2222:4: (lv_left_1_0= ruleExpression )
            {
            // InternalLegoLang.g:2222:4: (lv_left_1_0= ruleExpression )
            // InternalLegoLang.g:2223:5: lv_left_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAdditionAccess().getLeftExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_29);
            lv_left_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAdditionRule());
              					}
              					set(
              						current,
              						"left",
              						lv_left_1_0,
              						"langageCompilation.concrete.syntax.LegoLang.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,43,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getAdditionAccess().getPlusSignKeyword_2());
              		
            }
            // InternalLegoLang.g:2244:3: ( (lv_right_3_0= ruleExpression ) )
            // InternalLegoLang.g:2245:4: (lv_right_3_0= ruleExpression )
            {
            // InternalLegoLang.g:2245:4: (lv_right_3_0= ruleExpression )
            // InternalLegoLang.g:2246:5: lv_right_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAdditionAccess().getRightExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_14);
            lv_right_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAdditionRule());
              					}
              					set(
              						current,
              						"right",
              						lv_right_3_0,
              						"langageCompilation.concrete.syntax.LegoLang.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getAdditionAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // InternalLegoLang.g:2271:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // InternalLegoLang.g:2271:55: (iv_ruleMultiplication= ruleMultiplication EOF )
            // InternalLegoLang.g:2272:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMultiplication=ruleMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplication; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // InternalLegoLang.g:2278:1: ruleMultiplication returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '*' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:2284:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '*' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalLegoLang.g:2285:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '*' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalLegoLang.g:2285:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '*' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalLegoLang.g:2286:3: otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '*' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMultiplicationAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalLegoLang.g:2290:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalLegoLang.g:2291:4: (lv_left_1_0= ruleExpression )
            {
            // InternalLegoLang.g:2291:4: (lv_left_1_0= ruleExpression )
            // InternalLegoLang.g:2292:5: lv_left_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMultiplicationAccess().getLeftExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_30);
            lv_left_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMultiplicationRule());
              					}
              					set(
              						current,
              						"left",
              						lv_left_1_0,
              						"langageCompilation.concrete.syntax.LegoLang.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,44,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getMultiplicationAccess().getAsteriskKeyword_2());
              		
            }
            // InternalLegoLang.g:2313:3: ( (lv_right_3_0= ruleExpression ) )
            // InternalLegoLang.g:2314:4: (lv_right_3_0= ruleExpression )
            {
            // InternalLegoLang.g:2314:4: (lv_right_3_0= ruleExpression )
            // InternalLegoLang.g:2315:5: lv_right_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMultiplicationAccess().getRightExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_14);
            lv_right_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMultiplicationRule());
              					}
              					set(
              						current,
              						"right",
              						lv_right_3_0,
              						"langageCompilation.concrete.syntax.LegoLang.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getMultiplicationAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRuleDivision"
    // InternalLegoLang.g:2340:1: entryRuleDivision returns [EObject current=null] : iv_ruleDivision= ruleDivision EOF ;
    public final EObject entryRuleDivision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivision = null;


        try {
            // InternalLegoLang.g:2340:49: (iv_ruleDivision= ruleDivision EOF )
            // InternalLegoLang.g:2341:2: iv_ruleDivision= ruleDivision EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDivisionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDivision=ruleDivision();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDivision; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDivision"


    // $ANTLR start "ruleDivision"
    // InternalLegoLang.g:2347:1: ruleDivision returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '/' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleDivision() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:2353:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '/' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalLegoLang.g:2354:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '/' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalLegoLang.g:2354:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '/' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalLegoLang.g:2355:3: otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '/' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDivisionAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalLegoLang.g:2359:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalLegoLang.g:2360:4: (lv_left_1_0= ruleExpression )
            {
            // InternalLegoLang.g:2360:4: (lv_left_1_0= ruleExpression )
            // InternalLegoLang.g:2361:5: lv_left_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDivisionAccess().getLeftExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_31);
            lv_left_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDivisionRule());
              					}
              					set(
              						current,
              						"left",
              						lv_left_1_0,
              						"langageCompilation.concrete.syntax.LegoLang.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,45,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDivisionAccess().getSolidusKeyword_2());
              		
            }
            // InternalLegoLang.g:2382:3: ( (lv_right_3_0= ruleExpression ) )
            // InternalLegoLang.g:2383:4: (lv_right_3_0= ruleExpression )
            {
            // InternalLegoLang.g:2383:4: (lv_right_3_0= ruleExpression )
            // InternalLegoLang.g:2384:5: lv_right_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDivisionAccess().getRightExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_14);
            lv_right_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDivisionRule());
              					}
              					set(
              						current,
              						"right",
              						lv_right_3_0,
              						"langageCompilation.concrete.syntax.LegoLang.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getDivisionAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDivision"


    // $ANTLR start "entryRuleGT"
    // InternalLegoLang.g:2409:1: entryRuleGT returns [EObject current=null] : iv_ruleGT= ruleGT EOF ;
    public final EObject entryRuleGT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGT = null;


        try {
            // InternalLegoLang.g:2409:43: (iv_ruleGT= ruleGT EOF )
            // InternalLegoLang.g:2410:2: iv_ruleGT= ruleGT EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGTRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGT=ruleGT();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGT; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGT"


    // $ANTLR start "ruleGT"
    // InternalLegoLang.g:2416:1: ruleGT returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '>' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleGT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:2422:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '>' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalLegoLang.g:2423:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '>' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalLegoLang.g:2423:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '>' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalLegoLang.g:2424:3: otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '>' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGTAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalLegoLang.g:2428:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalLegoLang.g:2429:4: (lv_left_1_0= ruleExpression )
            {
            // InternalLegoLang.g:2429:4: (lv_left_1_0= ruleExpression )
            // InternalLegoLang.g:2430:5: lv_left_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGTAccess().getLeftExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_32);
            lv_left_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGTRule());
              					}
              					set(
              						current,
              						"left",
              						lv_left_1_0,
              						"langageCompilation.concrete.syntax.LegoLang.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,46,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGTAccess().getGreaterThanSignKeyword_2());
              		
            }
            // InternalLegoLang.g:2451:3: ( (lv_right_3_0= ruleExpression ) )
            // InternalLegoLang.g:2452:4: (lv_right_3_0= ruleExpression )
            {
            // InternalLegoLang.g:2452:4: (lv_right_3_0= ruleExpression )
            // InternalLegoLang.g:2453:5: lv_right_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGTAccess().getRightExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_14);
            lv_right_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGTRule());
              					}
              					set(
              						current,
              						"right",
              						lv_right_3_0,
              						"langageCompilation.concrete.syntax.LegoLang.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getGTAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGT"


    // $ANTLR start "entryRuleLT"
    // InternalLegoLang.g:2478:1: entryRuleLT returns [EObject current=null] : iv_ruleLT= ruleLT EOF ;
    public final EObject entryRuleLT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLT = null;


        try {
            // InternalLegoLang.g:2478:43: (iv_ruleLT= ruleLT EOF )
            // InternalLegoLang.g:2479:2: iv_ruleLT= ruleLT EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLTRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLT=ruleLT();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLT; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLT"


    // $ANTLR start "ruleLT"
    // InternalLegoLang.g:2485:1: ruleLT returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '<' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleLT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:2491:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '<' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalLegoLang.g:2492:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '<' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalLegoLang.g:2492:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '<' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalLegoLang.g:2493:3: otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '<' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLTAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalLegoLang.g:2497:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalLegoLang.g:2498:4: (lv_left_1_0= ruleExpression )
            {
            // InternalLegoLang.g:2498:4: (lv_left_1_0= ruleExpression )
            // InternalLegoLang.g:2499:5: lv_left_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLTAccess().getLeftExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_33);
            lv_left_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLTRule());
              					}
              					set(
              						current,
              						"left",
              						lv_left_1_0,
              						"langageCompilation.concrete.syntax.LegoLang.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,47,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getLTAccess().getLessThanSignKeyword_2());
              		
            }
            // InternalLegoLang.g:2520:3: ( (lv_right_3_0= ruleExpression ) )
            // InternalLegoLang.g:2521:4: (lv_right_3_0= ruleExpression )
            {
            // InternalLegoLang.g:2521:4: (lv_right_3_0= ruleExpression )
            // InternalLegoLang.g:2522:5: lv_right_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLTAccess().getRightExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_14);
            lv_right_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLTRule());
              					}
              					set(
              						current,
              						"right",
              						lv_right_3_0,
              						"langageCompilation.concrete.syntax.LegoLang.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getLTAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLT"


    // $ANTLR start "entryRuleEqual"
    // InternalLegoLang.g:2547:1: entryRuleEqual returns [EObject current=null] : iv_ruleEqual= ruleEqual EOF ;
    public final EObject entryRuleEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqual = null;


        try {
            // InternalLegoLang.g:2547:46: (iv_ruleEqual= ruleEqual EOF )
            // InternalLegoLang.g:2548:2: iv_ruleEqual= ruleEqual EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqualRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEqual=ruleEqual();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEqual; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEqual"


    // $ANTLR start "ruleEqual"
    // InternalLegoLang.g:2554:1: ruleEqual returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '==' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:2560:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '==' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalLegoLang.g:2561:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '==' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalLegoLang.g:2561:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '==' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalLegoLang.g:2562:3: otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '==' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEqualAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalLegoLang.g:2566:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalLegoLang.g:2567:4: (lv_left_1_0= ruleExpression )
            {
            // InternalLegoLang.g:2567:4: (lv_left_1_0= ruleExpression )
            // InternalLegoLang.g:2568:5: lv_left_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEqualAccess().getLeftExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_34);
            lv_left_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEqualRule());
              					}
              					set(
              						current,
              						"left",
              						lv_left_1_0,
              						"langageCompilation.concrete.syntax.LegoLang.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,48,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getEqualAccess().getEqualsSignEqualsSignKeyword_2());
              		
            }
            // InternalLegoLang.g:2589:3: ( (lv_right_3_0= ruleExpression ) )
            // InternalLegoLang.g:2590:4: (lv_right_3_0= ruleExpression )
            {
            // InternalLegoLang.g:2590:4: (lv_right_3_0= ruleExpression )
            // InternalLegoLang.g:2591:5: lv_right_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEqualAccess().getRightExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_14);
            lv_right_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEqualRule());
              					}
              					set(
              						current,
              						"right",
              						lv_right_3_0,
              						"langageCompilation.concrete.syntax.LegoLang.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getEqualAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEqual"


    // $ANTLR start "entryRuleDifferent"
    // InternalLegoLang.g:2616:1: entryRuleDifferent returns [EObject current=null] : iv_ruleDifferent= ruleDifferent EOF ;
    public final EObject entryRuleDifferent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDifferent = null;


        try {
            // InternalLegoLang.g:2616:50: (iv_ruleDifferent= ruleDifferent EOF )
            // InternalLegoLang.g:2617:2: iv_ruleDifferent= ruleDifferent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDifferentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDifferent=ruleDifferent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDifferent; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDifferent"


    // $ANTLR start "ruleDifferent"
    // InternalLegoLang.g:2623:1: ruleDifferent returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '!=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleDifferent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:2629:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '!=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalLegoLang.g:2630:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '!=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalLegoLang.g:2630:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '!=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalLegoLang.g:2631:3: otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '!=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDifferentAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalLegoLang.g:2635:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalLegoLang.g:2636:4: (lv_left_1_0= ruleExpression )
            {
            // InternalLegoLang.g:2636:4: (lv_left_1_0= ruleExpression )
            // InternalLegoLang.g:2637:5: lv_left_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDifferentAccess().getLeftExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_35);
            lv_left_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDifferentRule());
              					}
              					set(
              						current,
              						"left",
              						lv_left_1_0,
              						"langageCompilation.concrete.syntax.LegoLang.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,49,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDifferentAccess().getExclamationMarkEqualsSignKeyword_2());
              		
            }
            // InternalLegoLang.g:2658:3: ( (lv_right_3_0= ruleExpression ) )
            // InternalLegoLang.g:2659:4: (lv_right_3_0= ruleExpression )
            {
            // InternalLegoLang.g:2659:4: (lv_right_3_0= ruleExpression )
            // InternalLegoLang.g:2660:5: lv_right_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDifferentAccess().getRightExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_14);
            lv_right_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDifferentRule());
              					}
              					set(
              						current,
              						"right",
              						lv_right_3_0,
              						"langageCompilation.concrete.syntax.LegoLang.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getDifferentAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDifferent"


    // $ANTLR start "entryRuleLTorEqual"
    // InternalLegoLang.g:2685:1: entryRuleLTorEqual returns [EObject current=null] : iv_ruleLTorEqual= ruleLTorEqual EOF ;
    public final EObject entryRuleLTorEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLTorEqual = null;


        try {
            // InternalLegoLang.g:2685:50: (iv_ruleLTorEqual= ruleLTorEqual EOF )
            // InternalLegoLang.g:2686:2: iv_ruleLTorEqual= ruleLTorEqual EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLTorEqualRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLTorEqual=ruleLTorEqual();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLTorEqual; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLTorEqual"


    // $ANTLR start "ruleLTorEqual"
    // InternalLegoLang.g:2692:1: ruleLTorEqual returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '<=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleLTorEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:2698:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '<=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalLegoLang.g:2699:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '<=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalLegoLang.g:2699:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '<=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalLegoLang.g:2700:3: otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '<=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLTorEqualAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalLegoLang.g:2704:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalLegoLang.g:2705:4: (lv_left_1_0= ruleExpression )
            {
            // InternalLegoLang.g:2705:4: (lv_left_1_0= ruleExpression )
            // InternalLegoLang.g:2706:5: lv_left_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLTorEqualAccess().getLeftExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_36);
            lv_left_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLTorEqualRule());
              					}
              					set(
              						current,
              						"left",
              						lv_left_1_0,
              						"langageCompilation.concrete.syntax.LegoLang.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,50,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getLTorEqualAccess().getLessThanSignEqualsSignKeyword_2());
              		
            }
            // InternalLegoLang.g:2727:3: ( (lv_right_3_0= ruleExpression ) )
            // InternalLegoLang.g:2728:4: (lv_right_3_0= ruleExpression )
            {
            // InternalLegoLang.g:2728:4: (lv_right_3_0= ruleExpression )
            // InternalLegoLang.g:2729:5: lv_right_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLTorEqualAccess().getRightExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_14);
            lv_right_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLTorEqualRule());
              					}
              					set(
              						current,
              						"right",
              						lv_right_3_0,
              						"langageCompilation.concrete.syntax.LegoLang.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getLTorEqualAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLTorEqual"


    // $ANTLR start "entryRuleGTorEqual"
    // InternalLegoLang.g:2754:1: entryRuleGTorEqual returns [EObject current=null] : iv_ruleGTorEqual= ruleGTorEqual EOF ;
    public final EObject entryRuleGTorEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGTorEqual = null;


        try {
            // InternalLegoLang.g:2754:50: (iv_ruleGTorEqual= ruleGTorEqual EOF )
            // InternalLegoLang.g:2755:2: iv_ruleGTorEqual= ruleGTorEqual EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGTorEqualRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGTorEqual=ruleGTorEqual();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGTorEqual; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGTorEqual"


    // $ANTLR start "ruleGTorEqual"
    // InternalLegoLang.g:2761:1: ruleGTorEqual returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '>=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleGTorEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:2767:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '>=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalLegoLang.g:2768:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '>=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalLegoLang.g:2768:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '>=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalLegoLang.g:2769:3: otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '>=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGTorEqualAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalLegoLang.g:2773:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalLegoLang.g:2774:4: (lv_left_1_0= ruleExpression )
            {
            // InternalLegoLang.g:2774:4: (lv_left_1_0= ruleExpression )
            // InternalLegoLang.g:2775:5: lv_left_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGTorEqualAccess().getLeftExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_37);
            lv_left_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGTorEqualRule());
              					}
              					set(
              						current,
              						"left",
              						lv_left_1_0,
              						"langageCompilation.concrete.syntax.LegoLang.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,51,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGTorEqualAccess().getGreaterThanSignEqualsSignKeyword_2());
              		
            }
            // InternalLegoLang.g:2796:3: ( (lv_right_3_0= ruleExpression ) )
            // InternalLegoLang.g:2797:4: (lv_right_3_0= ruleExpression )
            {
            // InternalLegoLang.g:2797:4: (lv_right_3_0= ruleExpression )
            // InternalLegoLang.g:2798:5: lv_right_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGTorEqualAccess().getRightExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_14);
            lv_right_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGTorEqualRule());
              					}
              					set(
              						current,
              						"right",
              						lv_right_3_0,
              						"langageCompilation.concrete.syntax.LegoLang.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getGTorEqualAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGTorEqual"


    // $ANTLR start "entryRuleAssignement"
    // InternalLegoLang.g:2823:1: entryRuleAssignement returns [EObject current=null] : iv_ruleAssignement= ruleAssignement EOF ;
    public final EObject entryRuleAssignement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignement = null;


        try {
            // InternalLegoLang.g:2823:52: (iv_ruleAssignement= ruleAssignement EOF )
            // InternalLegoLang.g:2824:2: iv_ruleAssignement= ruleAssignement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAssignement=ruleAssignement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAssignement"


    // $ANTLR start "ruleAssignement"
    // InternalLegoLang.g:2830:1: ruleAssignement returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_left_2_0= ruleExpression ) ) otherlv_3= '=' ( (lv_right_4_0= ruleExpression ) ) otherlv_5= ');' ) ;
    public final EObject ruleAssignement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_left_2_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:2836:2: ( ( () otherlv_1= '(' ( (lv_left_2_0= ruleExpression ) ) otherlv_3= '=' ( (lv_right_4_0= ruleExpression ) ) otherlv_5= ');' ) )
            // InternalLegoLang.g:2837:2: ( () otherlv_1= '(' ( (lv_left_2_0= ruleExpression ) ) otherlv_3= '=' ( (lv_right_4_0= ruleExpression ) ) otherlv_5= ');' )
            {
            // InternalLegoLang.g:2837:2: ( () otherlv_1= '(' ( (lv_left_2_0= ruleExpression ) ) otherlv_3= '=' ( (lv_right_4_0= ruleExpression ) ) otherlv_5= ');' )
            // InternalLegoLang.g:2838:3: () otherlv_1= '(' ( (lv_left_2_0= ruleExpression ) ) otherlv_3= '=' ( (lv_right_4_0= ruleExpression ) ) otherlv_5= ');'
            {
            // InternalLegoLang.g:2838:3: ()
            // InternalLegoLang.g:2839:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getAssignementAccess().getAssignementAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,26,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAssignementAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalLegoLang.g:2852:3: ( (lv_left_2_0= ruleExpression ) )
            // InternalLegoLang.g:2853:4: (lv_left_2_0= ruleExpression )
            {
            // InternalLegoLang.g:2853:4: (lv_left_2_0= ruleExpression )
            // InternalLegoLang.g:2854:5: lv_left_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAssignementAccess().getLeftExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_9);
            lv_left_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAssignementRule());
              					}
              					set(
              						current,
              						"left",
              						lv_left_2_0,
              						"langageCompilation.concrete.syntax.LegoLang.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getAssignementAccess().getEqualsSignKeyword_3());
              		
            }
            // InternalLegoLang.g:2875:3: ( (lv_right_4_0= ruleExpression ) )
            // InternalLegoLang.g:2876:4: (lv_right_4_0= ruleExpression )
            {
            // InternalLegoLang.g:2876:4: (lv_right_4_0= ruleExpression )
            // InternalLegoLang.g:2877:5: lv_right_4_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAssignementAccess().getRightExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_38);
            lv_right_4_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAssignementRule());
              					}
              					set(
              						current,
              						"right",
              						lv_right_4_0,
              						"langageCompilation.concrete.syntax.LegoLang.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getAssignementAccess().getRightParenthesisSemicolonKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAssignement"


    // $ANTLR start "entryRulePlusEqual"
    // InternalLegoLang.g:2902:1: entryRulePlusEqual returns [EObject current=null] : iv_rulePlusEqual= rulePlusEqual EOF ;
    public final EObject entryRulePlusEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusEqual = null;


        try {
            // InternalLegoLang.g:2902:50: (iv_rulePlusEqual= rulePlusEqual EOF )
            // InternalLegoLang.g:2903:2: iv_rulePlusEqual= rulePlusEqual EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPlusEqualRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePlusEqual=rulePlusEqual();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePlusEqual; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePlusEqual"


    // $ANTLR start "rulePlusEqual"
    // InternalLegoLang.g:2909:1: rulePlusEqual returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_left_2_0= ruleExpression ) ) otherlv_3= '+=' ( (lv_right_4_0= ruleExpression ) ) otherlv_5= ');' ) ;
    public final EObject rulePlusEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_left_2_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:2915:2: ( ( () otherlv_1= '(' ( (lv_left_2_0= ruleExpression ) ) otherlv_3= '+=' ( (lv_right_4_0= ruleExpression ) ) otherlv_5= ');' ) )
            // InternalLegoLang.g:2916:2: ( () otherlv_1= '(' ( (lv_left_2_0= ruleExpression ) ) otherlv_3= '+=' ( (lv_right_4_0= ruleExpression ) ) otherlv_5= ');' )
            {
            // InternalLegoLang.g:2916:2: ( () otherlv_1= '(' ( (lv_left_2_0= ruleExpression ) ) otherlv_3= '+=' ( (lv_right_4_0= ruleExpression ) ) otherlv_5= ');' )
            // InternalLegoLang.g:2917:3: () otherlv_1= '(' ( (lv_left_2_0= ruleExpression ) ) otherlv_3= '+=' ( (lv_right_4_0= ruleExpression ) ) otherlv_5= ');'
            {
            // InternalLegoLang.g:2917:3: ()
            // InternalLegoLang.g:2918:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getPlusEqualAccess().getPlusEqualAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,26,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPlusEqualAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalLegoLang.g:2931:3: ( (lv_left_2_0= ruleExpression ) )
            // InternalLegoLang.g:2932:4: (lv_left_2_0= ruleExpression )
            {
            // InternalLegoLang.g:2932:4: (lv_left_2_0= ruleExpression )
            // InternalLegoLang.g:2933:5: lv_left_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPlusEqualAccess().getLeftExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_39);
            lv_left_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPlusEqualRule());
              					}
              					set(
              						current,
              						"left",
              						lv_left_2_0,
              						"langageCompilation.concrete.syntax.LegoLang.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,52,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getPlusEqualAccess().getPlusSignEqualsSignKeyword_3());
              		
            }
            // InternalLegoLang.g:2954:3: ( (lv_right_4_0= ruleExpression ) )
            // InternalLegoLang.g:2955:4: (lv_right_4_0= ruleExpression )
            {
            // InternalLegoLang.g:2955:4: (lv_right_4_0= ruleExpression )
            // InternalLegoLang.g:2956:5: lv_right_4_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPlusEqualAccess().getRightExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_38);
            lv_right_4_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPlusEqualRule());
              					}
              					set(
              						current,
              						"right",
              						lv_right_4_0,
              						"langageCompilation.concrete.syntax.LegoLang.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getPlusEqualAccess().getRightParenthesisSemicolonKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePlusEqual"


    // $ANTLR start "entryRuleMinusEqual"
    // InternalLegoLang.g:2981:1: entryRuleMinusEqual returns [EObject current=null] : iv_ruleMinusEqual= ruleMinusEqual EOF ;
    public final EObject entryRuleMinusEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinusEqual = null;


        try {
            // InternalLegoLang.g:2981:51: (iv_ruleMinusEqual= ruleMinusEqual EOF )
            // InternalLegoLang.g:2982:2: iv_ruleMinusEqual= ruleMinusEqual EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMinusEqualRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMinusEqual=ruleMinusEqual();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMinusEqual; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMinusEqual"


    // $ANTLR start "ruleMinusEqual"
    // InternalLegoLang.g:2988:1: ruleMinusEqual returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_left_2_0= ruleExpression ) ) otherlv_3= '-=' ( (lv_right_4_0= ruleExpression ) ) otherlv_5= ');' ) ;
    public final EObject ruleMinusEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_left_2_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:2994:2: ( ( () otherlv_1= '(' ( (lv_left_2_0= ruleExpression ) ) otherlv_3= '-=' ( (lv_right_4_0= ruleExpression ) ) otherlv_5= ');' ) )
            // InternalLegoLang.g:2995:2: ( () otherlv_1= '(' ( (lv_left_2_0= ruleExpression ) ) otherlv_3= '-=' ( (lv_right_4_0= ruleExpression ) ) otherlv_5= ');' )
            {
            // InternalLegoLang.g:2995:2: ( () otherlv_1= '(' ( (lv_left_2_0= ruleExpression ) ) otherlv_3= '-=' ( (lv_right_4_0= ruleExpression ) ) otherlv_5= ');' )
            // InternalLegoLang.g:2996:3: () otherlv_1= '(' ( (lv_left_2_0= ruleExpression ) ) otherlv_3= '-=' ( (lv_right_4_0= ruleExpression ) ) otherlv_5= ');'
            {
            // InternalLegoLang.g:2996:3: ()
            // InternalLegoLang.g:2997:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getMinusEqualAccess().getMinusEqualAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,26,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMinusEqualAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalLegoLang.g:3010:3: ( (lv_left_2_0= ruleExpression ) )
            // InternalLegoLang.g:3011:4: (lv_left_2_0= ruleExpression )
            {
            // InternalLegoLang.g:3011:4: (lv_left_2_0= ruleExpression )
            // InternalLegoLang.g:3012:5: lv_left_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMinusEqualAccess().getLeftExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_40);
            lv_left_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMinusEqualRule());
              					}
              					set(
              						current,
              						"left",
              						lv_left_2_0,
              						"langageCompilation.concrete.syntax.LegoLang.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,53,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getMinusEqualAccess().getHyphenMinusEqualsSignKeyword_3());
              		
            }
            // InternalLegoLang.g:3033:3: ( (lv_right_4_0= ruleExpression ) )
            // InternalLegoLang.g:3034:4: (lv_right_4_0= ruleExpression )
            {
            // InternalLegoLang.g:3034:4: (lv_right_4_0= ruleExpression )
            // InternalLegoLang.g:3035:5: lv_right_4_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMinusEqualAccess().getRightExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_38);
            lv_right_4_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMinusEqualRule());
              					}
              					set(
              						current,
              						"right",
              						lv_right_4_0,
              						"langageCompilation.concrete.syntax.LegoLang.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getMinusEqualAccess().getRightParenthesisSemicolonKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMinusEqual"


    // $ANTLR start "entryRuleEBoolean"
    // InternalLegoLang.g:3060:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalLegoLang.g:3060:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalLegoLang.g:3061:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEBooleanRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEBoolean.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalLegoLang.g:3067:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLegoLang.g:3073:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalLegoLang.g:3074:2: (kw= 'true' | kw= 'false' )
            {
            // InternalLegoLang.g:3074:2: (kw= 'true' | kw= 'false' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==54) ) {
                alt18=1;
            }
            else if ( (LA18_0==55) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalLegoLang.g:3075:3: kw= 'true'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalLegoLang.g:3081:3: kw= 'false'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleUnInteger"
    // InternalLegoLang.g:3090:1: entryRuleUnInteger returns [EObject current=null] : iv_ruleUnInteger= ruleUnInteger EOF ;
    public final EObject entryRuleUnInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnInteger = null;


        try {
            // InternalLegoLang.g:3090:50: (iv_ruleUnInteger= ruleUnInteger EOF )
            // InternalLegoLang.g:3091:2: iv_ruleUnInteger= ruleUnInteger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnIntegerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnInteger=ruleUnInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnInteger; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnInteger"


    // $ANTLR start "ruleUnInteger"
    // InternalLegoLang.g:3097:1: ruleUnInteger returns [EObject current=null] : ( () ( (lv_isConst_1_0= 'const' ) )? otherlv_2= 'int' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '=' ( (lv_initialeValue_5_0= ruleEInt ) ) )? otherlv_6= ';' ) ;
    public final EObject ruleUnInteger() throws RecognitionException {
        EObject current = null;

        Token lv_isConst_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_initialeValue_5_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:3103:2: ( ( () ( (lv_isConst_1_0= 'const' ) )? otherlv_2= 'int' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '=' ( (lv_initialeValue_5_0= ruleEInt ) ) )? otherlv_6= ';' ) )
            // InternalLegoLang.g:3104:2: ( () ( (lv_isConst_1_0= 'const' ) )? otherlv_2= 'int' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '=' ( (lv_initialeValue_5_0= ruleEInt ) ) )? otherlv_6= ';' )
            {
            // InternalLegoLang.g:3104:2: ( () ( (lv_isConst_1_0= 'const' ) )? otherlv_2= 'int' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '=' ( (lv_initialeValue_5_0= ruleEInt ) ) )? otherlv_6= ';' )
            // InternalLegoLang.g:3105:3: () ( (lv_isConst_1_0= 'const' ) )? otherlv_2= 'int' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '=' ( (lv_initialeValue_5_0= ruleEInt ) ) )? otherlv_6= ';'
            {
            // InternalLegoLang.g:3105:3: ()
            // InternalLegoLang.g:3106:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getUnIntegerAccess().getUnIntegerAction_0(),
              					current);
              			
            }

            }

            // InternalLegoLang.g:3115:3: ( (lv_isConst_1_0= 'const' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==56) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalLegoLang.g:3116:4: (lv_isConst_1_0= 'const' )
                    {
                    // InternalLegoLang.g:3116:4: (lv_isConst_1_0= 'const' )
                    // InternalLegoLang.g:3117:5: lv_isConst_1_0= 'const'
                    {
                    lv_isConst_1_0=(Token)match(input,56,FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isConst_1_0, grammarAccess.getUnIntegerAccess().getIsConstConstKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getUnIntegerRule());
                      					}
                      					setWithLastConsumed(current, "isConst", lv_isConst_1_0 != null, "const");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,57,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getUnIntegerAccess().getIntKeyword_2());
              		
            }
            // InternalLegoLang.g:3133:3: ( (lv_name_3_0= ruleEString ) )
            // InternalLegoLang.g:3134:4: (lv_name_3_0= ruleEString )
            {
            // InternalLegoLang.g:3134:4: (lv_name_3_0= ruleEString )
            // InternalLegoLang.g:3135:5: lv_name_3_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getUnIntegerAccess().getNameEStringParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_42);
            lv_name_3_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getUnIntegerRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_3_0,
              						"langageCompilation.concrete.syntax.LegoLang.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalLegoLang.g:3152:3: (otherlv_4= '=' ( (lv_initialeValue_5_0= ruleEInt ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==23) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalLegoLang.g:3153:4: otherlv_4= '=' ( (lv_initialeValue_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getUnIntegerAccess().getEqualsSignKeyword_4_0());
                      			
                    }
                    // InternalLegoLang.g:3157:4: ( (lv_initialeValue_5_0= ruleEInt ) )
                    // InternalLegoLang.g:3158:5: (lv_initialeValue_5_0= ruleEInt )
                    {
                    // InternalLegoLang.g:3158:5: (lv_initialeValue_5_0= ruleEInt )
                    // InternalLegoLang.g:3159:6: lv_initialeValue_5_0= ruleEInt
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getUnIntegerAccess().getInitialeValueEIntParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_43);
                    lv_initialeValue_5_0=ruleEInt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getUnIntegerRule());
                      						}
                      						set(
                      							current,
                      							"initialeValue",
                      							lv_initialeValue_5_0,
                      							"langageCompilation.concrete.syntax.LegoLang.EInt");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getUnIntegerAccess().getSemicolonKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleUnInteger"


    // $ANTLR start "entryRuleUnDouble"
    // InternalLegoLang.g:3185:1: entryRuleUnDouble returns [EObject current=null] : iv_ruleUnDouble= ruleUnDouble EOF ;
    public final EObject entryRuleUnDouble() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnDouble = null;


        try {
            // InternalLegoLang.g:3185:49: (iv_ruleUnDouble= ruleUnDouble EOF )
            // InternalLegoLang.g:3186:2: iv_ruleUnDouble= ruleUnDouble EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnDoubleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnDouble=ruleUnDouble();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnDouble; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnDouble"


    // $ANTLR start "ruleUnDouble"
    // InternalLegoLang.g:3192:1: ruleUnDouble returns [EObject current=null] : ( () ( (lv_isConst_1_0= 'const' ) )? otherlv_2= 'double' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '=' ( (lv_initialeValue1_5_0= ruleEInt ) ) (otherlv_6= '.' ( (lv_initialeValue2_7_0= ruleEInt ) ) )? )? otherlv_8= ';' ) ;
    public final EObject ruleUnDouble() throws RecognitionException {
        EObject current = null;

        Token lv_isConst_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_initialeValue1_5_0 = null;

        AntlrDatatypeRuleToken lv_initialeValue2_7_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:3198:2: ( ( () ( (lv_isConst_1_0= 'const' ) )? otherlv_2= 'double' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '=' ( (lv_initialeValue1_5_0= ruleEInt ) ) (otherlv_6= '.' ( (lv_initialeValue2_7_0= ruleEInt ) ) )? )? otherlv_8= ';' ) )
            // InternalLegoLang.g:3199:2: ( () ( (lv_isConst_1_0= 'const' ) )? otherlv_2= 'double' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '=' ( (lv_initialeValue1_5_0= ruleEInt ) ) (otherlv_6= '.' ( (lv_initialeValue2_7_0= ruleEInt ) ) )? )? otherlv_8= ';' )
            {
            // InternalLegoLang.g:3199:2: ( () ( (lv_isConst_1_0= 'const' ) )? otherlv_2= 'double' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '=' ( (lv_initialeValue1_5_0= ruleEInt ) ) (otherlv_6= '.' ( (lv_initialeValue2_7_0= ruleEInt ) ) )? )? otherlv_8= ';' )
            // InternalLegoLang.g:3200:3: () ( (lv_isConst_1_0= 'const' ) )? otherlv_2= 'double' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '=' ( (lv_initialeValue1_5_0= ruleEInt ) ) (otherlv_6= '.' ( (lv_initialeValue2_7_0= ruleEInt ) ) )? )? otherlv_8= ';'
            {
            // InternalLegoLang.g:3200:3: ()
            // InternalLegoLang.g:3201:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getUnDoubleAccess().getUnDoubleAction_0(),
              					current);
              			
            }

            }

            // InternalLegoLang.g:3210:3: ( (lv_isConst_1_0= 'const' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==56) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalLegoLang.g:3211:4: (lv_isConst_1_0= 'const' )
                    {
                    // InternalLegoLang.g:3211:4: (lv_isConst_1_0= 'const' )
                    // InternalLegoLang.g:3212:5: lv_isConst_1_0= 'const'
                    {
                    lv_isConst_1_0=(Token)match(input,56,FOLLOW_44); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isConst_1_0, grammarAccess.getUnDoubleAccess().getIsConstConstKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getUnDoubleRule());
                      					}
                      					setWithLastConsumed(current, "isConst", lv_isConst_1_0 != null, "const");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,59,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getUnDoubleAccess().getDoubleKeyword_2());
              		
            }
            // InternalLegoLang.g:3228:3: ( (lv_name_3_0= ruleEString ) )
            // InternalLegoLang.g:3229:4: (lv_name_3_0= ruleEString )
            {
            // InternalLegoLang.g:3229:4: (lv_name_3_0= ruleEString )
            // InternalLegoLang.g:3230:5: lv_name_3_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getUnDoubleAccess().getNameEStringParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_42);
            lv_name_3_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getUnDoubleRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_3_0,
              						"langageCompilation.concrete.syntax.LegoLang.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalLegoLang.g:3247:3: (otherlv_4= '=' ( (lv_initialeValue1_5_0= ruleEInt ) ) (otherlv_6= '.' ( (lv_initialeValue2_7_0= ruleEInt ) ) )? )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==23) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalLegoLang.g:3248:4: otherlv_4= '=' ( (lv_initialeValue1_5_0= ruleEInt ) ) (otherlv_6= '.' ( (lv_initialeValue2_7_0= ruleEInt ) ) )?
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getUnDoubleAccess().getEqualsSignKeyword_4_0());
                      			
                    }
                    // InternalLegoLang.g:3252:4: ( (lv_initialeValue1_5_0= ruleEInt ) )
                    // InternalLegoLang.g:3253:5: (lv_initialeValue1_5_0= ruleEInt )
                    {
                    // InternalLegoLang.g:3253:5: (lv_initialeValue1_5_0= ruleEInt )
                    // InternalLegoLang.g:3254:6: lv_initialeValue1_5_0= ruleEInt
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getUnDoubleAccess().getInitialeValue1EIntParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_45);
                    lv_initialeValue1_5_0=ruleEInt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getUnDoubleRule());
                      						}
                      						set(
                      							current,
                      							"initialeValue1",
                      							lv_initialeValue1_5_0,
                      							"langageCompilation.concrete.syntax.LegoLang.EInt");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalLegoLang.g:3271:4: (otherlv_6= '.' ( (lv_initialeValue2_7_0= ruleEInt ) ) )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==60) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalLegoLang.g:3272:5: otherlv_6= '.' ( (lv_initialeValue2_7_0= ruleEInt ) )
                            {
                            otherlv_6=(Token)match(input,60,FOLLOW_6); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_6, grammarAccess.getUnDoubleAccess().getFullStopKeyword_4_2_0());
                              				
                            }
                            // InternalLegoLang.g:3276:5: ( (lv_initialeValue2_7_0= ruleEInt ) )
                            // InternalLegoLang.g:3277:6: (lv_initialeValue2_7_0= ruleEInt )
                            {
                            // InternalLegoLang.g:3277:6: (lv_initialeValue2_7_0= ruleEInt )
                            // InternalLegoLang.g:3278:7: lv_initialeValue2_7_0= ruleEInt
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getUnDoubleAccess().getInitialeValue2EIntParserRuleCall_4_2_1_0());
                              						
                            }
                            pushFollow(FOLLOW_43);
                            lv_initialeValue2_7_0=ruleEInt();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getUnDoubleRule());
                              							}
                              							set(
                              								current,
                              								"initialeValue2",
                              								lv_initialeValue2_7_0,
                              								"langageCompilation.concrete.syntax.LegoLang.EInt");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getUnDoubleAccess().getSemicolonKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleUnDouble"


    // $ANTLR start "entryRuleUnBoolean"
    // InternalLegoLang.g:3305:1: entryRuleUnBoolean returns [EObject current=null] : iv_ruleUnBoolean= ruleUnBoolean EOF ;
    public final EObject entryRuleUnBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnBoolean = null;


        try {
            // InternalLegoLang.g:3305:50: (iv_ruleUnBoolean= ruleUnBoolean EOF )
            // InternalLegoLang.g:3306:2: iv_ruleUnBoolean= ruleUnBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnBooleanRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnBoolean=ruleUnBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnBoolean; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnBoolean"


    // $ANTLR start "ruleUnBoolean"
    // InternalLegoLang.g:3312:1: ruleUnBoolean returns [EObject current=null] : ( () ( (lv_isConst_1_0= 'const' ) )? otherlv_2= 'bool' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '=' ( (lv_initialeValue_5_0= ruleEBoolean ) ) )? otherlv_6= ';' ) ;
    public final EObject ruleUnBoolean() throws RecognitionException {
        EObject current = null;

        Token lv_isConst_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_initialeValue_5_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:3318:2: ( ( () ( (lv_isConst_1_0= 'const' ) )? otherlv_2= 'bool' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '=' ( (lv_initialeValue_5_0= ruleEBoolean ) ) )? otherlv_6= ';' ) )
            // InternalLegoLang.g:3319:2: ( () ( (lv_isConst_1_0= 'const' ) )? otherlv_2= 'bool' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '=' ( (lv_initialeValue_5_0= ruleEBoolean ) ) )? otherlv_6= ';' )
            {
            // InternalLegoLang.g:3319:2: ( () ( (lv_isConst_1_0= 'const' ) )? otherlv_2= 'bool' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '=' ( (lv_initialeValue_5_0= ruleEBoolean ) ) )? otherlv_6= ';' )
            // InternalLegoLang.g:3320:3: () ( (lv_isConst_1_0= 'const' ) )? otherlv_2= 'bool' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '=' ( (lv_initialeValue_5_0= ruleEBoolean ) ) )? otherlv_6= ';'
            {
            // InternalLegoLang.g:3320:3: ()
            // InternalLegoLang.g:3321:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getUnBooleanAccess().getUnBooleanAction_0(),
              					current);
              			
            }

            }

            // InternalLegoLang.g:3330:3: ( (lv_isConst_1_0= 'const' ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==56) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalLegoLang.g:3331:4: (lv_isConst_1_0= 'const' )
                    {
                    // InternalLegoLang.g:3331:4: (lv_isConst_1_0= 'const' )
                    // InternalLegoLang.g:3332:5: lv_isConst_1_0= 'const'
                    {
                    lv_isConst_1_0=(Token)match(input,56,FOLLOW_46); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isConst_1_0, grammarAccess.getUnBooleanAccess().getIsConstConstKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getUnBooleanRule());
                      					}
                      					setWithLastConsumed(current, "isConst", lv_isConst_1_0 != null, "const");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,61,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getUnBooleanAccess().getBoolKeyword_2());
              		
            }
            // InternalLegoLang.g:3348:3: ( (lv_name_3_0= ruleEString ) )
            // InternalLegoLang.g:3349:4: (lv_name_3_0= ruleEString )
            {
            // InternalLegoLang.g:3349:4: (lv_name_3_0= ruleEString )
            // InternalLegoLang.g:3350:5: lv_name_3_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getUnBooleanAccess().getNameEStringParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_42);
            lv_name_3_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getUnBooleanRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_3_0,
              						"langageCompilation.concrete.syntax.LegoLang.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalLegoLang.g:3367:3: (otherlv_4= '=' ( (lv_initialeValue_5_0= ruleEBoolean ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==23) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalLegoLang.g:3368:4: otherlv_4= '=' ( (lv_initialeValue_5_0= ruleEBoolean ) )
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_47); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getUnBooleanAccess().getEqualsSignKeyword_4_0());
                      			
                    }
                    // InternalLegoLang.g:3372:4: ( (lv_initialeValue_5_0= ruleEBoolean ) )
                    // InternalLegoLang.g:3373:5: (lv_initialeValue_5_0= ruleEBoolean )
                    {
                    // InternalLegoLang.g:3373:5: (lv_initialeValue_5_0= ruleEBoolean )
                    // InternalLegoLang.g:3374:6: lv_initialeValue_5_0= ruleEBoolean
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getUnBooleanAccess().getInitialeValueEBooleanParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_43);
                    lv_initialeValue_5_0=ruleEBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getUnBooleanRule());
                      						}
                      						set(
                      							current,
                      							"initialeValue",
                      							lv_initialeValue_5_0,
                      							"langageCompilation.concrete.syntax.LegoLang.EBoolean");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getUnBooleanAccess().getSemicolonKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleUnBoolean"


    // $ANTLR start "entryRuleUnString"
    // InternalLegoLang.g:3400:1: entryRuleUnString returns [EObject current=null] : iv_ruleUnString= ruleUnString EOF ;
    public final EObject entryRuleUnString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnString = null;


        try {
            // InternalLegoLang.g:3400:49: (iv_ruleUnString= ruleUnString EOF )
            // InternalLegoLang.g:3401:2: iv_ruleUnString= ruleUnString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnStringRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnString=ruleUnString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnString; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnString"


    // $ANTLR start "ruleUnString"
    // InternalLegoLang.g:3407:1: ruleUnString returns [EObject current=null] : ( () ( (lv_isConst_1_0= 'const' ) )? otherlv_2= 'string' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '=' ( (lv_initialeValue_5_0= ruleEString ) ) )? otherlv_6= ';' ) ;
    public final EObject ruleUnString() throws RecognitionException {
        EObject current = null;

        Token lv_isConst_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_initialeValue_5_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:3413:2: ( ( () ( (lv_isConst_1_0= 'const' ) )? otherlv_2= 'string' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '=' ( (lv_initialeValue_5_0= ruleEString ) ) )? otherlv_6= ';' ) )
            // InternalLegoLang.g:3414:2: ( () ( (lv_isConst_1_0= 'const' ) )? otherlv_2= 'string' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '=' ( (lv_initialeValue_5_0= ruleEString ) ) )? otherlv_6= ';' )
            {
            // InternalLegoLang.g:3414:2: ( () ( (lv_isConst_1_0= 'const' ) )? otherlv_2= 'string' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '=' ( (lv_initialeValue_5_0= ruleEString ) ) )? otherlv_6= ';' )
            // InternalLegoLang.g:3415:3: () ( (lv_isConst_1_0= 'const' ) )? otherlv_2= 'string' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '=' ( (lv_initialeValue_5_0= ruleEString ) ) )? otherlv_6= ';'
            {
            // InternalLegoLang.g:3415:3: ()
            // InternalLegoLang.g:3416:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getUnStringAccess().getUnStringAction_0(),
              					current);
              			
            }

            }

            // InternalLegoLang.g:3425:3: ( (lv_isConst_1_0= 'const' ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==56) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalLegoLang.g:3426:4: (lv_isConst_1_0= 'const' )
                    {
                    // InternalLegoLang.g:3426:4: (lv_isConst_1_0= 'const' )
                    // InternalLegoLang.g:3427:5: lv_isConst_1_0= 'const'
                    {
                    lv_isConst_1_0=(Token)match(input,56,FOLLOW_48); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isConst_1_0, grammarAccess.getUnStringAccess().getIsConstConstKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getUnStringRule());
                      					}
                      					setWithLastConsumed(current, "isConst", lv_isConst_1_0 != null, "const");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,62,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getUnStringAccess().getStringKeyword_2());
              		
            }
            // InternalLegoLang.g:3443:3: ( (lv_name_3_0= ruleEString ) )
            // InternalLegoLang.g:3444:4: (lv_name_3_0= ruleEString )
            {
            // InternalLegoLang.g:3444:4: (lv_name_3_0= ruleEString )
            // InternalLegoLang.g:3445:5: lv_name_3_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getUnStringAccess().getNameEStringParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_42);
            lv_name_3_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getUnStringRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_3_0,
              						"langageCompilation.concrete.syntax.LegoLang.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalLegoLang.g:3462:3: (otherlv_4= '=' ( (lv_initialeValue_5_0= ruleEString ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==23) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalLegoLang.g:3463:4: otherlv_4= '=' ( (lv_initialeValue_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getUnStringAccess().getEqualsSignKeyword_4_0());
                      			
                    }
                    // InternalLegoLang.g:3467:4: ( (lv_initialeValue_5_0= ruleEString ) )
                    // InternalLegoLang.g:3468:5: (lv_initialeValue_5_0= ruleEString )
                    {
                    // InternalLegoLang.g:3468:5: (lv_initialeValue_5_0= ruleEString )
                    // InternalLegoLang.g:3469:6: lv_initialeValue_5_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getUnStringAccess().getInitialeValueEStringParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_43);
                    lv_initialeValue_5_0=ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getUnStringRule());
                      						}
                      						set(
                      							current,
                      							"initialeValue",
                      							lv_initialeValue_5_0,
                      							"langageCompilation.concrete.syntax.LegoLang.EString");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getUnStringAccess().getSemicolonKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleUnString"


    // $ANTLR start "entryRuleTheDouble"
    // InternalLegoLang.g:3495:1: entryRuleTheDouble returns [EObject current=null] : iv_ruleTheDouble= ruleTheDouble EOF ;
    public final EObject entryRuleTheDouble() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTheDouble = null;


        try {
            // InternalLegoLang.g:3495:50: (iv_ruleTheDouble= ruleTheDouble EOF )
            // InternalLegoLang.g:3496:2: iv_ruleTheDouble= ruleTheDouble EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTheDoubleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTheDouble=ruleTheDouble();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTheDouble; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTheDouble"


    // $ANTLR start "ruleTheDouble"
    // InternalLegoLang.g:3502:1: ruleTheDouble returns [EObject current=null] : ( () ( (lv_value1_1_0= ruleEInt ) ) otherlv_2= '.' ( (lv_value2_3_0= ruleEInt ) ) ) ;
    public final EObject ruleTheDouble() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_value1_1_0 = null;

        AntlrDatatypeRuleToken lv_value2_3_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:3508:2: ( ( () ( (lv_value1_1_0= ruleEInt ) ) otherlv_2= '.' ( (lv_value2_3_0= ruleEInt ) ) ) )
            // InternalLegoLang.g:3509:2: ( () ( (lv_value1_1_0= ruleEInt ) ) otherlv_2= '.' ( (lv_value2_3_0= ruleEInt ) ) )
            {
            // InternalLegoLang.g:3509:2: ( () ( (lv_value1_1_0= ruleEInt ) ) otherlv_2= '.' ( (lv_value2_3_0= ruleEInt ) ) )
            // InternalLegoLang.g:3510:3: () ( (lv_value1_1_0= ruleEInt ) ) otherlv_2= '.' ( (lv_value2_3_0= ruleEInt ) )
            {
            // InternalLegoLang.g:3510:3: ()
            // InternalLegoLang.g:3511:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getTheDoubleAccess().getTheDoubleAction_0(),
              					current);
              			
            }

            }

            // InternalLegoLang.g:3520:3: ( (lv_value1_1_0= ruleEInt ) )
            // InternalLegoLang.g:3521:4: (lv_value1_1_0= ruleEInt )
            {
            // InternalLegoLang.g:3521:4: (lv_value1_1_0= ruleEInt )
            // InternalLegoLang.g:3522:5: lv_value1_1_0= ruleEInt
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTheDoubleAccess().getValue1EIntParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_49);
            lv_value1_1_0=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTheDoubleRule());
              					}
              					set(
              						current,
              						"value1",
              						lv_value1_1_0,
              						"langageCompilation.concrete.syntax.LegoLang.EInt");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,60,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTheDoubleAccess().getFullStopKeyword_2());
              		
            }
            // InternalLegoLang.g:3543:3: ( (lv_value2_3_0= ruleEInt ) )
            // InternalLegoLang.g:3544:4: (lv_value2_3_0= ruleEInt )
            {
            // InternalLegoLang.g:3544:4: (lv_value2_3_0= ruleEInt )
            // InternalLegoLang.g:3545:5: lv_value2_3_0= ruleEInt
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTheDoubleAccess().getValue2EIntParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_value2_3_0=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTheDoubleRule());
              					}
              					set(
              						current,
              						"value2",
              						lv_value2_3_0,
              						"langageCompilation.concrete.syntax.LegoLang.EInt");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTheDouble"


    // $ANTLR start "entryRuleTheInt"
    // InternalLegoLang.g:3566:1: entryRuleTheInt returns [EObject current=null] : iv_ruleTheInt= ruleTheInt EOF ;
    public final EObject entryRuleTheInt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTheInt = null;


        try {
            // InternalLegoLang.g:3566:47: (iv_ruleTheInt= ruleTheInt EOF )
            // InternalLegoLang.g:3567:2: iv_ruleTheInt= ruleTheInt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTheIntRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTheInt=ruleTheInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTheInt; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTheInt"


    // $ANTLR start "ruleTheInt"
    // InternalLegoLang.g:3573:1: ruleTheInt returns [EObject current=null] : ( () ( (lv_value_1_0= ruleEInt ) ) ) ;
    public final EObject ruleTheInt() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:3579:2: ( ( () ( (lv_value_1_0= ruleEInt ) ) ) )
            // InternalLegoLang.g:3580:2: ( () ( (lv_value_1_0= ruleEInt ) ) )
            {
            // InternalLegoLang.g:3580:2: ( () ( (lv_value_1_0= ruleEInt ) ) )
            // InternalLegoLang.g:3581:3: () ( (lv_value_1_0= ruleEInt ) )
            {
            // InternalLegoLang.g:3581:3: ()
            // InternalLegoLang.g:3582:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getTheIntAccess().getTheIntAction_0(),
              					current);
              			
            }

            }

            // InternalLegoLang.g:3591:3: ( (lv_value_1_0= ruleEInt ) )
            // InternalLegoLang.g:3592:4: (lv_value_1_0= ruleEInt )
            {
            // InternalLegoLang.g:3592:4: (lv_value_1_0= ruleEInt )
            // InternalLegoLang.g:3593:5: lv_value_1_0= ruleEInt
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTheIntAccess().getValueEIntParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTheIntRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_1_0,
              						"langageCompilation.concrete.syntax.LegoLang.EInt");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTheInt"


    // $ANTLR start "entryRuleTheBoolean"
    // InternalLegoLang.g:3614:1: entryRuleTheBoolean returns [EObject current=null] : iv_ruleTheBoolean= ruleTheBoolean EOF ;
    public final EObject entryRuleTheBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTheBoolean = null;


        try {
            // InternalLegoLang.g:3614:51: (iv_ruleTheBoolean= ruleTheBoolean EOF )
            // InternalLegoLang.g:3615:2: iv_ruleTheBoolean= ruleTheBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTheBooleanRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTheBoolean=ruleTheBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTheBoolean; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTheBoolean"


    // $ANTLR start "ruleTheBoolean"
    // InternalLegoLang.g:3621:1: ruleTheBoolean returns [EObject current=null] : ( () ( (lv_value_1_0= ruleEBoolean ) ) ) ;
    public final EObject ruleTheBoolean() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:3627:2: ( ( () ( (lv_value_1_0= ruleEBoolean ) ) ) )
            // InternalLegoLang.g:3628:2: ( () ( (lv_value_1_0= ruleEBoolean ) ) )
            {
            // InternalLegoLang.g:3628:2: ( () ( (lv_value_1_0= ruleEBoolean ) ) )
            // InternalLegoLang.g:3629:3: () ( (lv_value_1_0= ruleEBoolean ) )
            {
            // InternalLegoLang.g:3629:3: ()
            // InternalLegoLang.g:3630:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getTheBooleanAccess().getTheBooleanAction_0(),
              					current);
              			
            }

            }

            // InternalLegoLang.g:3639:3: ( (lv_value_1_0= ruleEBoolean ) )
            // InternalLegoLang.g:3640:4: (lv_value_1_0= ruleEBoolean )
            {
            // InternalLegoLang.g:3640:4: (lv_value_1_0= ruleEBoolean )
            // InternalLegoLang.g:3641:5: lv_value_1_0= ruleEBoolean
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTheBooleanAccess().getValueEBooleanParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleEBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTheBooleanRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_1_0,
              						"langageCompilation.concrete.syntax.LegoLang.EBoolean");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTheBoolean"


    // $ANTLR start "entryRuleTheString"
    // InternalLegoLang.g:3662:1: entryRuleTheString returns [EObject current=null] : iv_ruleTheString= ruleTheString EOF ;
    public final EObject entryRuleTheString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTheString = null;


        try {
            // InternalLegoLang.g:3662:50: (iv_ruleTheString= ruleTheString EOF )
            // InternalLegoLang.g:3663:2: iv_ruleTheString= ruleTheString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTheStringRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTheString=ruleTheString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTheString; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTheString"


    // $ANTLR start "ruleTheString"
    // InternalLegoLang.g:3669:1: ruleTheString returns [EObject current=null] : ( () ( (lv_value_1_0= ruleEString ) ) ) ;
    public final EObject ruleTheString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:3675:2: ( ( () ( (lv_value_1_0= ruleEString ) ) ) )
            // InternalLegoLang.g:3676:2: ( () ( (lv_value_1_0= ruleEString ) ) )
            {
            // InternalLegoLang.g:3676:2: ( () ( (lv_value_1_0= ruleEString ) ) )
            // InternalLegoLang.g:3677:3: () ( (lv_value_1_0= ruleEString ) )
            {
            // InternalLegoLang.g:3677:3: ()
            // InternalLegoLang.g:3678:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getTheStringAccess().getTheStringAction_0(),
              					current);
              			
            }

            }

            // InternalLegoLang.g:3687:3: ( (lv_value_1_0= ruleEString ) )
            // InternalLegoLang.g:3688:4: (lv_value_1_0= ruleEString )
            {
            // InternalLegoLang.g:3688:4: (lv_value_1_0= ruleEString )
            // InternalLegoLang.g:3689:5: lv_value_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTheStringAccess().getValueEStringParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTheStringRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_1_0,
              						"langageCompilation.concrete.syntax.LegoLang.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTheString"


    // $ANTLR start "entryRuleFQN"
    // InternalLegoLang.g:3710:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalLegoLang.g:3710:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalLegoLang.g:3711:2: iv_ruleFQN= ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFQNRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFQN=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFQN.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // InternalLegoLang.g:3717:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalLegoLang.g:3723:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalLegoLang.g:3724:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalLegoLang.g:3724:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalLegoLang.g:3725:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalLegoLang.g:3732:3: (kw= '.' this_ID_2= RULE_ID )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==60) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalLegoLang.g:3733:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,60,FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_50); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleEInt"
    // InternalLegoLang.g:3750:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalLegoLang.g:3750:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalLegoLang.g:3751:2: iv_ruleEInt= ruleEInt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEIntRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEInt.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalLegoLang.g:3757:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalLegoLang.g:3763:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalLegoLang.g:3764:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalLegoLang.g:3764:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalLegoLang.g:3765:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalLegoLang.g:3765:3: (kw= '-' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==42) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalLegoLang.g:3766:4: kw= '-'
                    {
                    kw=(Token)match(input,42,FOLLOW_51); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                      			
                    }

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_1);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEInt"

    // $ANTLR start synpred9_InternalLegoLang
    public final void synpred9_InternalLegoLang_fragment() throws RecognitionException {   
        EObject this_VariableRef_0 = null;


        // InternalLegoLang.g:278:3: (this_VariableRef_0= ruleVariableRef )
        // InternalLegoLang.g:278:3: this_VariableRef_0= ruleVariableRef
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_VariableRef_0=ruleVariableRef();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_InternalLegoLang

    // $ANTLR start synpred11_InternalLegoLang
    public final void synpred11_InternalLegoLang_fragment() throws RecognitionException {   
        EObject this_TheString_2 = null;


        // InternalLegoLang.g:302:3: (this_TheString_2= ruleTheString )
        // InternalLegoLang.g:302:3: this_TheString_2= ruleTheString
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_TheString_2=ruleTheString();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred11_InternalLegoLang

    // $ANTLR start synpred16_InternalLegoLang
    public final void synpred16_InternalLegoLang_fragment() throws RecognitionException {   
        EObject this_Substraction_0 = null;


        // InternalLegoLang.g:392:3: (this_Substraction_0= ruleSubstraction )
        // InternalLegoLang.g:392:3: this_Substraction_0= ruleSubstraction
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_Substraction_0=ruleSubstraction();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_InternalLegoLang

    // $ANTLR start synpred17_InternalLegoLang
    public final void synpred17_InternalLegoLang_fragment() throws RecognitionException {   
        EObject this_Comparaison_1 = null;


        // InternalLegoLang.g:404:3: (this_Comparaison_1= ruleComparaison )
        // InternalLegoLang.g:404:3: this_Comparaison_1= ruleComparaison
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_Comparaison_1=ruleComparaison();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred17_InternalLegoLang

    // $ANTLR start synpred18_InternalLegoLang
    public final void synpred18_InternalLegoLang_fragment() throws RecognitionException {   
        EObject this_Assignement_2 = null;


        // InternalLegoLang.g:416:3: (this_Assignement_2= ruleAssignement )
        // InternalLegoLang.g:416:3: this_Assignement_2= ruleAssignement
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_Assignement_2=ruleAssignement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_InternalLegoLang

    // $ANTLR start synpred19_InternalLegoLang
    public final void synpred19_InternalLegoLang_fragment() throws RecognitionException {   
        EObject this_Division_3 = null;


        // InternalLegoLang.g:428:3: (this_Division_3= ruleDivision )
        // InternalLegoLang.g:428:3: this_Division_3= ruleDivision
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_Division_3=ruleDivision();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred19_InternalLegoLang

    // $ANTLR start synpred20_InternalLegoLang
    public final void synpred20_InternalLegoLang_fragment() throws RecognitionException {   
        EObject this_Multiplication_4 = null;


        // InternalLegoLang.g:440:3: (this_Multiplication_4= ruleMultiplication )
        // InternalLegoLang.g:440:3: this_Multiplication_4= ruleMultiplication
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_Multiplication_4=ruleMultiplication();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred20_InternalLegoLang

    // $ANTLR start synpred21_InternalLegoLang
    public final void synpred21_InternalLegoLang_fragment() throws RecognitionException {   
        EObject this_Addition_5 = null;


        // InternalLegoLang.g:452:3: (this_Addition_5= ruleAddition )
        // InternalLegoLang.g:452:3: this_Addition_5= ruleAddition
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_Addition_5=ruleAddition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred21_InternalLegoLang

    // $ANTLR start synpred22_InternalLegoLang
    public final void synpred22_InternalLegoLang_fragment() throws RecognitionException {   
        EObject this_MinusEqual_6 = null;


        // InternalLegoLang.g:464:3: (this_MinusEqual_6= ruleMinusEqual )
        // InternalLegoLang.g:464:3: this_MinusEqual_6= ruleMinusEqual
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_MinusEqual_6=ruleMinusEqual();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_InternalLegoLang

    // $ANTLR start synpred26_InternalLegoLang
    public final void synpred26_InternalLegoLang_fragment() throws RecognitionException {   
        EObject this_GT_0 = null;


        // InternalLegoLang.g:572:3: (this_GT_0= ruleGT )
        // InternalLegoLang.g:572:3: this_GT_0= ruleGT
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_GT_0=ruleGT();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred26_InternalLegoLang

    // $ANTLR start synpred27_InternalLegoLang
    public final void synpred27_InternalLegoLang_fragment() throws RecognitionException {   
        EObject this_Equal_1 = null;


        // InternalLegoLang.g:584:3: (this_Equal_1= ruleEqual )
        // InternalLegoLang.g:584:3: this_Equal_1= ruleEqual
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_Equal_1=ruleEqual();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred27_InternalLegoLang

    // $ANTLR start synpred28_InternalLegoLang
    public final void synpred28_InternalLegoLang_fragment() throws RecognitionException {   
        EObject this_LT_2 = null;


        // InternalLegoLang.g:596:3: (this_LT_2= ruleLT )
        // InternalLegoLang.g:596:3: this_LT_2= ruleLT
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_LT_2=ruleLT();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_InternalLegoLang

    // $ANTLR start synpred29_InternalLegoLang
    public final void synpred29_InternalLegoLang_fragment() throws RecognitionException {   
        EObject this_Different_3 = null;


        // InternalLegoLang.g:608:3: (this_Different_3= ruleDifferent )
        // InternalLegoLang.g:608:3: this_Different_3= ruleDifferent
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_Different_3=ruleDifferent();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_InternalLegoLang

    // $ANTLR start synpred30_InternalLegoLang
    public final void synpred30_InternalLegoLang_fragment() throws RecognitionException {   
        EObject this_GTorEqual_4 = null;


        // InternalLegoLang.g:620:3: (this_GTorEqual_4= ruleGTorEqual )
        // InternalLegoLang.g:620:3: this_GTorEqual_4= ruleGTorEqual
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_GTorEqual_4=ruleGTorEqual();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_InternalLegoLang

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


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\5\uffff\1\14\7\uffff";
    static final String dfa_3s = "\1\4\1\0\1\25\1\uffff\1\6\1\4\7\uffff";
    static final String dfa_4s = "\1\67\1\0\1\74\1\uffff\1\6\1\76\7\uffff";
    static final String dfa_5s = "\3\uffff\1\2\2\uffff\1\6\1\10\1\1\1\3\1\7\1\4\1\5";
    static final String dfa_6s = "\1\uffff\1\1\1\0\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\2\1\5\21\uffff\1\7\1\uffff\1\3\17\uffff\1\4\13\uffff\2\6",
            "\1\uffff",
            "\1\12\46\uffff\1\12",
            "",
            "\1\5",
            "\3\14\6\uffff\10\14\2\uffff\2\14\1\uffff\2\14\6\uffff\1\14\3\uffff\24\14\1\uffff\1\14\1\13\2\14",
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

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "277:2: (this_VariableRef_0= ruleVariableRef | this_BinaryOperation_1= ruleBinaryOperation | this_TheString_2= ruleTheString | this_TheDouble_3= ruleTheDouble | this_TheInt_4= ruleTheInt | this_TheBoolean_5= ruleTheBoolean | this_EngineOperation_6= ruleEngineOperation | this_SensorOperation_7= ruleSensorOperation )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA3_2 = input.LA(1);

                         
                        int index3_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA3_2==21||LA3_2==60) ) {s = 10;}

                        else if ( (synpred9_InternalLegoLang()) ) {s = 8;}

                        else if ( (synpred11_InternalLegoLang()) ) {s = 9;}

                         
                        input.seek(index3_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA3_1 = input.LA(1);

                         
                        int index3_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalLegoLang()) ) {s = 8;}

                        else if ( (synpred11_InternalLegoLang()) ) {s = 9;}

                         
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
    static final String dfa_8s = "\12\uffff";
    static final String dfa_9s = "\1\32\1\0\10\uffff";
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

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "391:2: (this_Substraction_0= ruleSubstraction | this_Comparaison_1= ruleComparaison | this_Assignement_2= ruleAssignement | this_Division_3= ruleDivision | this_Multiplication_4= ruleMultiplication | this_Addition_5= ruleAddition | this_MinusEqual_6= ruleMinusEqual | this_PlusEqual_7= rulePlusEqual )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA4_1 = input.LA(1);

                         
                        int index4_1 = input.index();
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

                         
                        input.seek(index4_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 4, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x6BC004C4051FE070L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000040000000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00C0040005000070L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001800001000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001000001000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x6BC004C4051FC070L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00C0060005000070L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0400000000800000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x1400000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x00C0000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000040L});

}