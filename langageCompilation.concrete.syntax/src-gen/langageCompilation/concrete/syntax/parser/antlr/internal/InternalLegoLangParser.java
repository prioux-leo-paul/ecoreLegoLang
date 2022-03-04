package langageCompilation.concrete.syntax.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Program'", "'{'", "';'", "'}'", "'WheelEngine'", "'on'", "'MotorizedArmEngine'", "'PaintballLauncherEngine'", "'ColorSensor'", "'LaserSensor'", "'GPSSensor'", "'GyroSensor'", "'UltraSonicSensor'", "'Car'", "'set'", "'vitesse'", "'('", "')'", "'='", "'break'", "'motor'", "'degres'", "'strength'", "'get'", "'color'", "'intensity'", "'range'", "'x'", "'y'", "'angle'", "'distance'", "'and'", "'or'", "'if'", "'else{'", "'while'", "'print('", "','", "'-'", "'+'", "'*'", "'/'", "'>'", "'<'", "'=='", "'!='", "'<='", "'>='", "'+='", "'-='", "'true'", "'false'", "'const'", "'int'", "'double'", "'.'", "'bool'", "'string'", "'black'", "'white'"
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
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int RULE_STRING=5;
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
    // InternalLegoLang.g:71:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalLegoLang.g:71:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalLegoLang.g:72:2: iv_ruleProgram= ruleProgram EOF
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
    // InternalLegoLang.g:78:1: ruleProgram returns [EObject current=null] : ( () otherlv_1= 'Program' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_statement_4_0= ruleStatement ) )* (otherlv_5= ';' )? otherlv_6= '}' ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_statement_4_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:84:2: ( ( () otherlv_1= 'Program' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_statement_4_0= ruleStatement ) )* (otherlv_5= ';' )? otherlv_6= '}' ) )
            // InternalLegoLang.g:85:2: ( () otherlv_1= 'Program' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_statement_4_0= ruleStatement ) )* (otherlv_5= ';' )? otherlv_6= '}' )
            {
            // InternalLegoLang.g:85:2: ( () otherlv_1= 'Program' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_statement_4_0= ruleStatement ) )* (otherlv_5= ';' )? otherlv_6= '}' )
            // InternalLegoLang.g:86:3: () otherlv_1= 'Program' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_statement_4_0= ruleStatement ) )* (otherlv_5= ';' )? otherlv_6= '}'
            {
            // InternalLegoLang.g:86:3: ()
            // InternalLegoLang.g:87:4: 
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
            // InternalLegoLang.g:100:3: ( (lv_name_2_0= ruleEString ) )
            // InternalLegoLang.g:101:4: (lv_name_2_0= ruleEString )
            {
            // InternalLegoLang.g:101:4: (lv_name_2_0= ruleEString )
            // InternalLegoLang.g:102:5: lv_name_2_0= ruleEString
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
            // InternalLegoLang.g:123:3: ( (lv_statement_4_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_INT)||LA1_0==15||(LA1_0>=17 && LA1_0<=25)||LA1_0==27||LA1_0==30||(LA1_0>=34 && LA1_0<=35)||LA1_0==44||(LA1_0>=46 && LA1_0<=47)||LA1_0==49||(LA1_0>=61 && LA1_0<=65)||(LA1_0>=67 && LA1_0<=70)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalLegoLang.g:124:4: (lv_statement_4_0= ruleStatement )
            	    {
            	    // InternalLegoLang.g:124:4: (lv_statement_4_0= ruleStatement )
            	    // InternalLegoLang.g:125:5: lv_statement_4_0= ruleStatement
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

            // InternalLegoLang.g:142:3: (otherlv_5= ';' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalLegoLang.g:143:4: otherlv_5= ';'
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getProgramAccess().getSemicolonKeyword_5());
                      			
                    }

                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_6());
              		
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
    // InternalLegoLang.g:156:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalLegoLang.g:156:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalLegoLang.g:157:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalLegoLang.g:163:1: ruleStatement returns [EObject current=null] : (this_WhileLoop_0= ruleWhileLoop | this_Variable_1= ruleVariable | this_Expression_2= ruleExpression | this_ConditionEtat_3= ruleConditionEtat | this_MethodePrint_4= ruleMethodePrint | this_Car_5= ruleCar | this_Sensor_6= ruleSensor | this_Engine_7= ruleEngine ) ;
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
            // InternalLegoLang.g:169:2: ( (this_WhileLoop_0= ruleWhileLoop | this_Variable_1= ruleVariable | this_Expression_2= ruleExpression | this_ConditionEtat_3= ruleConditionEtat | this_MethodePrint_4= ruleMethodePrint | this_Car_5= ruleCar | this_Sensor_6= ruleSensor | this_Engine_7= ruleEngine ) )
            // InternalLegoLang.g:170:2: (this_WhileLoop_0= ruleWhileLoop | this_Variable_1= ruleVariable | this_Expression_2= ruleExpression | this_ConditionEtat_3= ruleConditionEtat | this_MethodePrint_4= ruleMethodePrint | this_Car_5= ruleCar | this_Sensor_6= ruleSensor | this_Engine_7= ruleEngine )
            {
            // InternalLegoLang.g:170:2: (this_WhileLoop_0= ruleWhileLoop | this_Variable_1= ruleVariable | this_Expression_2= ruleExpression | this_ConditionEtat_3= ruleConditionEtat | this_MethodePrint_4= ruleMethodePrint | this_Car_5= ruleCar | this_Sensor_6= ruleSensor | this_Engine_7= ruleEngine )
            int alt3=8;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt3=1;
                }
                break;
            case 35:
            case 63:
            case 64:
            case 65:
            case 67:
            case 68:
                {
                alt3=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
            case 25:
            case 27:
            case 30:
            case 34:
            case 49:
            case 61:
            case 62:
            case 69:
            case 70:
                {
                alt3=3;
                }
                break;
            case 44:
                {
                alt3=4;
                }
                break;
            case 47:
                {
                alt3=5;
                }
                break;
            case 24:
                {
                alt3=6;
                }
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                {
                alt3=7;
                }
                break;
            case 15:
            case 17:
            case 18:
                {
                alt3=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalLegoLang.g:171:3: this_WhileLoop_0= ruleWhileLoop
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
                    // InternalLegoLang.g:183:3: this_Variable_1= ruleVariable
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
                    // InternalLegoLang.g:195:3: this_Expression_2= ruleExpression
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
                    // InternalLegoLang.g:207:3: this_ConditionEtat_3= ruleConditionEtat
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
                    // InternalLegoLang.g:219:3: this_MethodePrint_4= ruleMethodePrint
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
                    // InternalLegoLang.g:231:3: this_Car_5= ruleCar
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
                    // InternalLegoLang.g:243:3: this_Sensor_6= ruleSensor
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
                    // InternalLegoLang.g:255:3: this_Engine_7= ruleEngine
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
    // InternalLegoLang.g:270:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalLegoLang.g:270:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalLegoLang.g:271:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalLegoLang.g:277:1: ruleExpression returns [EObject current=null] : (this_VariableRef_0= ruleVariableRef | this_BinaryOperation_1= ruleBinaryOperation | this_TheString_2= ruleTheString | this_TheColor_3= ruleTheColor | this_TheDouble_4= ruleTheDouble | this_TheInt_5= ruleTheInt | this_TheBoolean_6= ruleTheBoolean | this_EngineOperation_7= ruleEngineOperation | this_BreakMotor_8= ruleBreakMotor | this_SensorOperation_9= ruleSensorOperation | this_BooleanExpression_10= ruleBooleanExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_VariableRef_0 = null;

        EObject this_BinaryOperation_1 = null;

        EObject this_TheString_2 = null;

        EObject this_TheColor_3 = null;

        EObject this_TheDouble_4 = null;

        EObject this_TheInt_5 = null;

        EObject this_TheBoolean_6 = null;

        EObject this_EngineOperation_7 = null;

        EObject this_BreakMotor_8 = null;

        EObject this_SensorOperation_9 = null;

        EObject this_BooleanExpression_10 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:283:2: ( (this_VariableRef_0= ruleVariableRef | this_BinaryOperation_1= ruleBinaryOperation | this_TheString_2= ruleTheString | this_TheColor_3= ruleTheColor | this_TheDouble_4= ruleTheDouble | this_TheInt_5= ruleTheInt | this_TheBoolean_6= ruleTheBoolean | this_EngineOperation_7= ruleEngineOperation | this_BreakMotor_8= ruleBreakMotor | this_SensorOperation_9= ruleSensorOperation | this_BooleanExpression_10= ruleBooleanExpression ) )
            // InternalLegoLang.g:284:2: (this_VariableRef_0= ruleVariableRef | this_BinaryOperation_1= ruleBinaryOperation | this_TheString_2= ruleTheString | this_TheColor_3= ruleTheColor | this_TheDouble_4= ruleTheDouble | this_TheInt_5= ruleTheInt | this_TheBoolean_6= ruleTheBoolean | this_EngineOperation_7= ruleEngineOperation | this_BreakMotor_8= ruleBreakMotor | this_SensorOperation_9= ruleSensorOperation | this_BooleanExpression_10= ruleBooleanExpression )
            {
            // InternalLegoLang.g:284:2: (this_VariableRef_0= ruleVariableRef | this_BinaryOperation_1= ruleBinaryOperation | this_TheString_2= ruleTheString | this_TheColor_3= ruleTheColor | this_TheDouble_4= ruleTheDouble | this_TheInt_5= ruleTheInt | this_TheBoolean_6= ruleTheBoolean | this_EngineOperation_7= ruleEngineOperation | this_BreakMotor_8= ruleBreakMotor | this_SensorOperation_9= ruleSensorOperation | this_BooleanExpression_10= ruleBooleanExpression )
            int alt4=11;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalLegoLang.g:285:3: this_VariableRef_0= ruleVariableRef
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
                    // InternalLegoLang.g:297:3: this_BinaryOperation_1= ruleBinaryOperation
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
                    // InternalLegoLang.g:309:3: this_TheString_2= ruleTheString
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
                    // InternalLegoLang.g:321:3: this_TheColor_3= ruleTheColor
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getTheColorParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TheColor_3=ruleTheColor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TheColor_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalLegoLang.g:333:3: this_TheDouble_4= ruleTheDouble
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getTheDoubleParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TheDouble_4=ruleTheDouble();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TheDouble_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalLegoLang.g:345:3: this_TheInt_5= ruleTheInt
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getTheIntParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TheInt_5=ruleTheInt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TheInt_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalLegoLang.g:357:3: this_TheBoolean_6= ruleTheBoolean
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getTheBooleanParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TheBoolean_6=ruleTheBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TheBoolean_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalLegoLang.g:369:3: this_EngineOperation_7= ruleEngineOperation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getEngineOperationParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EngineOperation_7=ruleEngineOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EngineOperation_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalLegoLang.g:381:3: this_BreakMotor_8= ruleBreakMotor
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getBreakMotorParserRuleCall_8());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BreakMotor_8=ruleBreakMotor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BreakMotor_8;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalLegoLang.g:393:3: this_SensorOperation_9= ruleSensorOperation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getSensorOperationParserRuleCall_9());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SensorOperation_9=ruleSensorOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SensorOperation_9;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalLegoLang.g:405:3: this_BooleanExpression_10= ruleBooleanExpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getBooleanExpressionParserRuleCall_10());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BooleanExpression_10=ruleBooleanExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BooleanExpression_10;
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
    // InternalLegoLang.g:420:1: entryRuleBinaryOperation returns [EObject current=null] : iv_ruleBinaryOperation= ruleBinaryOperation EOF ;
    public final EObject entryRuleBinaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryOperation = null;


        try {
            // InternalLegoLang.g:420:56: (iv_ruleBinaryOperation= ruleBinaryOperation EOF )
            // InternalLegoLang.g:421:2: iv_ruleBinaryOperation= ruleBinaryOperation EOF
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
    // InternalLegoLang.g:427:1: ruleBinaryOperation returns [EObject current=null] : (this_Substraction_0= ruleSubstraction | this_Comparaison_1= ruleComparaison | this_Assignement_2= ruleAssignement | this_Division_3= ruleDivision | this_Multiplication_4= ruleMultiplication | this_Addition_5= ruleAddition | this_MinusEqual_6= ruleMinusEqual | this_PlusEqual_7= rulePlusEqual ) ;
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
            // InternalLegoLang.g:433:2: ( (this_Substraction_0= ruleSubstraction | this_Comparaison_1= ruleComparaison | this_Assignement_2= ruleAssignement | this_Division_3= ruleDivision | this_Multiplication_4= ruleMultiplication | this_Addition_5= ruleAddition | this_MinusEqual_6= ruleMinusEqual | this_PlusEqual_7= rulePlusEqual ) )
            // InternalLegoLang.g:434:2: (this_Substraction_0= ruleSubstraction | this_Comparaison_1= ruleComparaison | this_Assignement_2= ruleAssignement | this_Division_3= ruleDivision | this_Multiplication_4= ruleMultiplication | this_Addition_5= ruleAddition | this_MinusEqual_6= ruleMinusEqual | this_PlusEqual_7= rulePlusEqual )
            {
            // InternalLegoLang.g:434:2: (this_Substraction_0= ruleSubstraction | this_Comparaison_1= ruleComparaison | this_Assignement_2= ruleAssignement | this_Division_3= ruleDivision | this_Multiplication_4= ruleMultiplication | this_Addition_5= ruleAddition | this_MinusEqual_6= ruleMinusEqual | this_PlusEqual_7= rulePlusEqual )
            int alt5=8;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalLegoLang.g:435:3: this_Substraction_0= ruleSubstraction
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
                    // InternalLegoLang.g:447:3: this_Comparaison_1= ruleComparaison
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
                    // InternalLegoLang.g:459:3: this_Assignement_2= ruleAssignement
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
                    // InternalLegoLang.g:471:3: this_Division_3= ruleDivision
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
                    // InternalLegoLang.g:483:3: this_Multiplication_4= ruleMultiplication
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
                    // InternalLegoLang.g:495:3: this_Addition_5= ruleAddition
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
                    // InternalLegoLang.g:507:3: this_MinusEqual_6= ruleMinusEqual
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
                    // InternalLegoLang.g:519:3: this_PlusEqual_7= rulePlusEqual
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
    // InternalLegoLang.g:534:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalLegoLang.g:534:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalLegoLang.g:535:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalLegoLang.g:541:1: ruleVariable returns [EObject current=null] : (this_UnInteger_0= ruleUnInteger | this_UnString_1= ruleUnString | this_UnBoolean_2= ruleUnBoolean | this_UnDouble_3= ruleUnDouble | this_UnColor_4= ruleUnColor ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        EObject this_UnInteger_0 = null;

        EObject this_UnString_1 = null;

        EObject this_UnBoolean_2 = null;

        EObject this_UnDouble_3 = null;

        EObject this_UnColor_4 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:547:2: ( (this_UnInteger_0= ruleUnInteger | this_UnString_1= ruleUnString | this_UnBoolean_2= ruleUnBoolean | this_UnDouble_3= ruleUnDouble | this_UnColor_4= ruleUnColor ) )
            // InternalLegoLang.g:548:2: (this_UnInteger_0= ruleUnInteger | this_UnString_1= ruleUnString | this_UnBoolean_2= ruleUnBoolean | this_UnDouble_3= ruleUnDouble | this_UnColor_4= ruleUnColor )
            {
            // InternalLegoLang.g:548:2: (this_UnInteger_0= ruleUnInteger | this_UnString_1= ruleUnString | this_UnBoolean_2= ruleUnBoolean | this_UnDouble_3= ruleUnDouble | this_UnColor_4= ruleUnColor )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 63:
                {
                switch ( input.LA(2) ) {
                case 35:
                    {
                    alt6=5;
                    }
                    break;
                case 67:
                    {
                    alt6=3;
                    }
                    break;
                case 68:
                    {
                    alt6=2;
                    }
                    break;
                case 65:
                    {
                    alt6=4;
                    }
                    break;
                case 64:
                    {
                    alt6=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }

                }
                break;
            case 64:
                {
                alt6=1;
                }
                break;
            case 68:
                {
                alt6=2;
                }
                break;
            case 67:
                {
                alt6=3;
                }
                break;
            case 65:
                {
                alt6=4;
                }
                break;
            case 35:
                {
                alt6=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalLegoLang.g:549:3: this_UnInteger_0= ruleUnInteger
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
                    // InternalLegoLang.g:561:3: this_UnString_1= ruleUnString
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
                    // InternalLegoLang.g:573:3: this_UnBoolean_2= ruleUnBoolean
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
                    // InternalLegoLang.g:585:3: this_UnDouble_3= ruleUnDouble
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
                case 5 :
                    // InternalLegoLang.g:597:3: this_UnColor_4= ruleUnColor
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getVariableAccess().getUnColorParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_UnColor_4=ruleUnColor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_UnColor_4;
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
    // InternalLegoLang.g:612:1: entryRuleComparaison returns [EObject current=null] : iv_ruleComparaison= ruleComparaison EOF ;
    public final EObject entryRuleComparaison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparaison = null;


        try {
            // InternalLegoLang.g:612:52: (iv_ruleComparaison= ruleComparaison EOF )
            // InternalLegoLang.g:613:2: iv_ruleComparaison= ruleComparaison EOF
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
    // InternalLegoLang.g:619:1: ruleComparaison returns [EObject current=null] : (this_GT_0= ruleGT | this_Equal_1= ruleEqual | this_LT_2= ruleLT | this_Different_3= ruleDifferent | this_GTorEqual_4= ruleGTorEqual | this_LTorEqual_5= ruleLTorEqual ) ;
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
            // InternalLegoLang.g:625:2: ( (this_GT_0= ruleGT | this_Equal_1= ruleEqual | this_LT_2= ruleLT | this_Different_3= ruleDifferent | this_GTorEqual_4= ruleGTorEqual | this_LTorEqual_5= ruleLTorEqual ) )
            // InternalLegoLang.g:626:2: (this_GT_0= ruleGT | this_Equal_1= ruleEqual | this_LT_2= ruleLT | this_Different_3= ruleDifferent | this_GTorEqual_4= ruleGTorEqual | this_LTorEqual_5= ruleLTorEqual )
            {
            // InternalLegoLang.g:626:2: (this_GT_0= ruleGT | this_Equal_1= ruleEqual | this_LT_2= ruleLT | this_Different_3= ruleDifferent | this_GTorEqual_4= ruleGTorEqual | this_LTorEqual_5= ruleLTorEqual )
            int alt7=6;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==27) ) {
                int LA7_1 = input.LA(2);

                if ( (synpred31_InternalLegoLang()) ) {
                    alt7=1;
                }
                else if ( (synpred32_InternalLegoLang()) ) {
                    alt7=2;
                }
                else if ( (synpred33_InternalLegoLang()) ) {
                    alt7=3;
                }
                else if ( (synpred34_InternalLegoLang()) ) {
                    alt7=4;
                }
                else if ( (synpred35_InternalLegoLang()) ) {
                    alt7=5;
                }
                else if ( (true) ) {
                    alt7=6;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalLegoLang.g:627:3: this_GT_0= ruleGT
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
                    // InternalLegoLang.g:639:3: this_Equal_1= ruleEqual
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
                    // InternalLegoLang.g:651:3: this_LT_2= ruleLT
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
                    // InternalLegoLang.g:663:3: this_Different_3= ruleDifferent
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
                    // InternalLegoLang.g:675:3: this_GTorEqual_4= ruleGTorEqual
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
                    // InternalLegoLang.g:687:3: this_LTorEqual_5= ruleLTorEqual
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
    // InternalLegoLang.g:702:1: entryRuleEngine returns [EObject current=null] : iv_ruleEngine= ruleEngine EOF ;
    public final EObject entryRuleEngine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEngine = null;


        try {
            // InternalLegoLang.g:702:47: (iv_ruleEngine= ruleEngine EOF )
            // InternalLegoLang.g:703:2: iv_ruleEngine= ruleEngine EOF
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
    // InternalLegoLang.g:709:1: ruleEngine returns [EObject current=null] : (this_WheelEngine_0= ruleWheelEngine | this_MotorizedArmEngine_1= ruleMotorizedArmEngine | this_PaintballLauncherEngine_2= rulePaintballLauncherEngine ) ;
    public final EObject ruleEngine() throws RecognitionException {
        EObject current = null;

        EObject this_WheelEngine_0 = null;

        EObject this_MotorizedArmEngine_1 = null;

        EObject this_PaintballLauncherEngine_2 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:715:2: ( (this_WheelEngine_0= ruleWheelEngine | this_MotorizedArmEngine_1= ruleMotorizedArmEngine | this_PaintballLauncherEngine_2= rulePaintballLauncherEngine ) )
            // InternalLegoLang.g:716:2: (this_WheelEngine_0= ruleWheelEngine | this_MotorizedArmEngine_1= ruleMotorizedArmEngine | this_PaintballLauncherEngine_2= rulePaintballLauncherEngine )
            {
            // InternalLegoLang.g:716:2: (this_WheelEngine_0= ruleWheelEngine | this_MotorizedArmEngine_1= ruleMotorizedArmEngine | this_PaintballLauncherEngine_2= rulePaintballLauncherEngine )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt8=1;
                }
                break;
            case 17:
                {
                alt8=2;
                }
                break;
            case 18:
                {
                alt8=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalLegoLang.g:717:3: this_WheelEngine_0= ruleWheelEngine
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEngineAccess().getWheelEngineParserRuleCall_0());
                      		
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
                    break;
                case 2 :
                    // InternalLegoLang.g:729:3: this_MotorizedArmEngine_1= ruleMotorizedArmEngine
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEngineAccess().getMotorizedArmEngineParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MotorizedArmEngine_1=ruleMotorizedArmEngine();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MotorizedArmEngine_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalLegoLang.g:741:3: this_PaintballLauncherEngine_2= rulePaintballLauncherEngine
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEngineAccess().getPaintballLauncherEngineParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PaintballLauncherEngine_2=rulePaintballLauncherEngine();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PaintballLauncherEngine_2;
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
    // $ANTLR end "ruleEngine"


    // $ANTLR start "entryRuleSensor"
    // InternalLegoLang.g:756:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalLegoLang.g:756:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalLegoLang.g:757:2: iv_ruleSensor= ruleSensor EOF
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
    // InternalLegoLang.g:763:1: ruleSensor returns [EObject current=null] : (this_LaserSensor_0= ruleLaserSensor | this_ColorSensor_1= ruleColorSensor | this_UltraSonicSensor_2= ruleUltraSonicSensor | this_GyroSensor_3= ruleGyroSensor | this_GPSSensor_4= ruleGPSSensor ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        EObject this_LaserSensor_0 = null;

        EObject this_ColorSensor_1 = null;

        EObject this_UltraSonicSensor_2 = null;

        EObject this_GyroSensor_3 = null;

        EObject this_GPSSensor_4 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:769:2: ( (this_LaserSensor_0= ruleLaserSensor | this_ColorSensor_1= ruleColorSensor | this_UltraSonicSensor_2= ruleUltraSonicSensor | this_GyroSensor_3= ruleGyroSensor | this_GPSSensor_4= ruleGPSSensor ) )
            // InternalLegoLang.g:770:2: (this_LaserSensor_0= ruleLaserSensor | this_ColorSensor_1= ruleColorSensor | this_UltraSonicSensor_2= ruleUltraSonicSensor | this_GyroSensor_3= ruleGyroSensor | this_GPSSensor_4= ruleGPSSensor )
            {
            // InternalLegoLang.g:770:2: (this_LaserSensor_0= ruleLaserSensor | this_ColorSensor_1= ruleColorSensor | this_UltraSonicSensor_2= ruleUltraSonicSensor | this_GyroSensor_3= ruleGyroSensor | this_GPSSensor_4= ruleGPSSensor )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt9=1;
                }
                break;
            case 19:
                {
                alt9=2;
                }
                break;
            case 23:
                {
                alt9=3;
                }
                break;
            case 22:
                {
                alt9=4;
                }
                break;
            case 21:
                {
                alt9=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalLegoLang.g:771:3: this_LaserSensor_0= ruleLaserSensor
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
                    // InternalLegoLang.g:783:3: this_ColorSensor_1= ruleColorSensor
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
                    // InternalLegoLang.g:795:3: this_UltraSonicSensor_2= ruleUltraSonicSensor
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
                    // InternalLegoLang.g:807:3: this_GyroSensor_3= ruleGyroSensor
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
                    // InternalLegoLang.g:819:3: this_GPSSensor_4= ruleGPSSensor
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
    // InternalLegoLang.g:834:1: entryRuleWheelEngine returns [EObject current=null] : iv_ruleWheelEngine= ruleWheelEngine EOF ;
    public final EObject entryRuleWheelEngine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWheelEngine = null;


        try {
            // InternalLegoLang.g:834:52: (iv_ruleWheelEngine= ruleWheelEngine EOF )
            // InternalLegoLang.g:835:2: iv_ruleWheelEngine= ruleWheelEngine EOF
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
    // InternalLegoLang.g:841:1: ruleWheelEngine returns [EObject current=null] : (otherlv_0= 'WheelEngine' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'on' ( (lv_position_3_0= ruleEString ) ) ) ;
    public final EObject ruleWheelEngine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_position_3_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:847:2: ( (otherlv_0= 'WheelEngine' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'on' ( (lv_position_3_0= ruleEString ) ) ) )
            // InternalLegoLang.g:848:2: (otherlv_0= 'WheelEngine' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'on' ( (lv_position_3_0= ruleEString ) ) )
            {
            // InternalLegoLang.g:848:2: (otherlv_0= 'WheelEngine' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'on' ( (lv_position_3_0= ruleEString ) ) )
            // InternalLegoLang.g:849:3: otherlv_0= 'WheelEngine' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'on' ( (lv_position_3_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWheelEngineAccess().getWheelEngineKeyword_0());
              		
            }
            // InternalLegoLang.g:853:3: ( (lv_name_1_0= ruleEString ) )
            // InternalLegoLang.g:854:4: (lv_name_1_0= ruleEString )
            {
            // InternalLegoLang.g:854:4: (lv_name_1_0= ruleEString )
            // InternalLegoLang.g:855:5: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWheelEngineAccess().getNameEStringParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_7);
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

            otherlv_2=(Token)match(input,16,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getWheelEngineAccess().getOnKeyword_2());
              		
            }
            // InternalLegoLang.g:876:3: ( (lv_position_3_0= ruleEString ) )
            // InternalLegoLang.g:877:4: (lv_position_3_0= ruleEString )
            {
            // InternalLegoLang.g:877:4: (lv_position_3_0= ruleEString )
            // InternalLegoLang.g:878:5: lv_position_3_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWheelEngineAccess().getPositionEStringParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_position_3_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWheelEngineRule());
              					}
              					set(
              						current,
              						"position",
              						lv_position_3_0,
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


    // $ANTLR start "entryRuleMotorizedArmEngine"
    // InternalLegoLang.g:899:1: entryRuleMotorizedArmEngine returns [EObject current=null] : iv_ruleMotorizedArmEngine= ruleMotorizedArmEngine EOF ;
    public final EObject entryRuleMotorizedArmEngine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMotorizedArmEngine = null;


        try {
            // InternalLegoLang.g:899:59: (iv_ruleMotorizedArmEngine= ruleMotorizedArmEngine EOF )
            // InternalLegoLang.g:900:2: iv_ruleMotorizedArmEngine= ruleMotorizedArmEngine EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMotorizedArmEngineRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMotorizedArmEngine=ruleMotorizedArmEngine();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMotorizedArmEngine; 
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
    // $ANTLR end "entryRuleMotorizedArmEngine"


    // $ANTLR start "ruleMotorizedArmEngine"
    // InternalLegoLang.g:906:1: ruleMotorizedArmEngine returns [EObject current=null] : (otherlv_0= 'MotorizedArmEngine' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'on' ( (lv_position_3_0= ruleEString ) ) ) ;
    public final EObject ruleMotorizedArmEngine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_position_3_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:912:2: ( (otherlv_0= 'MotorizedArmEngine' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'on' ( (lv_position_3_0= ruleEString ) ) ) )
            // InternalLegoLang.g:913:2: (otherlv_0= 'MotorizedArmEngine' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'on' ( (lv_position_3_0= ruleEString ) ) )
            {
            // InternalLegoLang.g:913:2: (otherlv_0= 'MotorizedArmEngine' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'on' ( (lv_position_3_0= ruleEString ) ) )
            // InternalLegoLang.g:914:3: otherlv_0= 'MotorizedArmEngine' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'on' ( (lv_position_3_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMotorizedArmEngineAccess().getMotorizedArmEngineKeyword_0());
              		
            }
            // InternalLegoLang.g:918:3: ( (lv_name_1_0= ruleEString ) )
            // InternalLegoLang.g:919:4: (lv_name_1_0= ruleEString )
            {
            // InternalLegoLang.g:919:4: (lv_name_1_0= ruleEString )
            // InternalLegoLang.g:920:5: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMotorizedArmEngineAccess().getNameEStringParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_name_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMotorizedArmEngineRule());
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

            otherlv_2=(Token)match(input,16,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getMotorizedArmEngineAccess().getOnKeyword_2());
              		
            }
            // InternalLegoLang.g:941:3: ( (lv_position_3_0= ruleEString ) )
            // InternalLegoLang.g:942:4: (lv_position_3_0= ruleEString )
            {
            // InternalLegoLang.g:942:4: (lv_position_3_0= ruleEString )
            // InternalLegoLang.g:943:5: lv_position_3_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMotorizedArmEngineAccess().getPositionEStringParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_position_3_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMotorizedArmEngineRule());
              					}
              					set(
              						current,
              						"position",
              						lv_position_3_0,
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
    // $ANTLR end "ruleMotorizedArmEngine"


    // $ANTLR start "entryRulePaintballLauncherEngine"
    // InternalLegoLang.g:964:1: entryRulePaintballLauncherEngine returns [EObject current=null] : iv_rulePaintballLauncherEngine= rulePaintballLauncherEngine EOF ;
    public final EObject entryRulePaintballLauncherEngine() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePaintballLauncherEngine = null;


        try {
            // InternalLegoLang.g:964:64: (iv_rulePaintballLauncherEngine= rulePaintballLauncherEngine EOF )
            // InternalLegoLang.g:965:2: iv_rulePaintballLauncherEngine= rulePaintballLauncherEngine EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPaintballLauncherEngineRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePaintballLauncherEngine=rulePaintballLauncherEngine();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePaintballLauncherEngine; 
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
    // $ANTLR end "entryRulePaintballLauncherEngine"


    // $ANTLR start "rulePaintballLauncherEngine"
    // InternalLegoLang.g:971:1: rulePaintballLauncherEngine returns [EObject current=null] : (otherlv_0= 'PaintballLauncherEngine' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'on' ( (lv_position_3_0= ruleEString ) ) ) ;
    public final EObject rulePaintballLauncherEngine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_position_3_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:977:2: ( (otherlv_0= 'PaintballLauncherEngine' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'on' ( (lv_position_3_0= ruleEString ) ) ) )
            // InternalLegoLang.g:978:2: (otherlv_0= 'PaintballLauncherEngine' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'on' ( (lv_position_3_0= ruleEString ) ) )
            {
            // InternalLegoLang.g:978:2: (otherlv_0= 'PaintballLauncherEngine' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'on' ( (lv_position_3_0= ruleEString ) ) )
            // InternalLegoLang.g:979:3: otherlv_0= 'PaintballLauncherEngine' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'on' ( (lv_position_3_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPaintballLauncherEngineAccess().getPaintballLauncherEngineKeyword_0());
              		
            }
            // InternalLegoLang.g:983:3: ( (lv_name_1_0= ruleEString ) )
            // InternalLegoLang.g:984:4: (lv_name_1_0= ruleEString )
            {
            // InternalLegoLang.g:984:4: (lv_name_1_0= ruleEString )
            // InternalLegoLang.g:985:5: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPaintballLauncherEngineAccess().getNameEStringParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_name_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPaintballLauncherEngineRule());
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

            otherlv_2=(Token)match(input,16,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getPaintballLauncherEngineAccess().getOnKeyword_2());
              		
            }
            // InternalLegoLang.g:1006:3: ( (lv_position_3_0= ruleEString ) )
            // InternalLegoLang.g:1007:4: (lv_position_3_0= ruleEString )
            {
            // InternalLegoLang.g:1007:4: (lv_position_3_0= ruleEString )
            // InternalLegoLang.g:1008:5: lv_position_3_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPaintballLauncherEngineAccess().getPositionEStringParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_position_3_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPaintballLauncherEngineRule());
              					}
              					set(
              						current,
              						"position",
              						lv_position_3_0,
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
    // $ANTLR end "rulePaintballLauncherEngine"


    // $ANTLR start "entryRuleColorSensor"
    // InternalLegoLang.g:1029:1: entryRuleColorSensor returns [EObject current=null] : iv_ruleColorSensor= ruleColorSensor EOF ;
    public final EObject entryRuleColorSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorSensor = null;


        try {
            // InternalLegoLang.g:1029:52: (iv_ruleColorSensor= ruleColorSensor EOF )
            // InternalLegoLang.g:1030:2: iv_ruleColorSensor= ruleColorSensor EOF
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
    // InternalLegoLang.g:1036:1: ruleColorSensor returns [EObject current=null] : (otherlv_0= 'ColorSensor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'on' ( (lv_position_3_0= ruleEInt ) ) ) ;
    public final EObject ruleColorSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_position_3_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:1042:2: ( (otherlv_0= 'ColorSensor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'on' ( (lv_position_3_0= ruleEInt ) ) ) )
            // InternalLegoLang.g:1043:2: (otherlv_0= 'ColorSensor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'on' ( (lv_position_3_0= ruleEInt ) ) )
            {
            // InternalLegoLang.g:1043:2: (otherlv_0= 'ColorSensor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'on' ( (lv_position_3_0= ruleEInt ) ) )
            // InternalLegoLang.g:1044:3: otherlv_0= 'ColorSensor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'on' ( (lv_position_3_0= ruleEInt ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getColorSensorAccess().getColorSensorKeyword_0());
              		
            }
            // InternalLegoLang.g:1048:3: ( (lv_name_1_0= ruleEString ) )
            // InternalLegoLang.g:1049:4: (lv_name_1_0= ruleEString )
            {
            // InternalLegoLang.g:1049:4: (lv_name_1_0= ruleEString )
            // InternalLegoLang.g:1050:5: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getColorSensorAccess().getNameEStringParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_7);
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

            otherlv_2=(Token)match(input,16,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getColorSensorAccess().getOnKeyword_2());
              		
            }
            // InternalLegoLang.g:1071:3: ( (lv_position_3_0= ruleEInt ) )
            // InternalLegoLang.g:1072:4: (lv_position_3_0= ruleEInt )
            {
            // InternalLegoLang.g:1072:4: (lv_position_3_0= ruleEInt )
            // InternalLegoLang.g:1073:5: lv_position_3_0= ruleEInt
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getColorSensorAccess().getPositionEIntParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_position_3_0=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getColorSensorRule());
              					}
              					set(
              						current,
              						"position",
              						lv_position_3_0,
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
    // InternalLegoLang.g:1094:1: entryRuleLaserSensor returns [EObject current=null] : iv_ruleLaserSensor= ruleLaserSensor EOF ;
    public final EObject entryRuleLaserSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLaserSensor = null;


        try {
            // InternalLegoLang.g:1094:52: (iv_ruleLaserSensor= ruleLaserSensor EOF )
            // InternalLegoLang.g:1095:2: iv_ruleLaserSensor= ruleLaserSensor EOF
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
    // InternalLegoLang.g:1101:1: ruleLaserSensor returns [EObject current=null] : (otherlv_0= 'LaserSensor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'on' ( (lv_position_3_0= ruleEInt ) ) ) ;
    public final EObject ruleLaserSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_position_3_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:1107:2: ( (otherlv_0= 'LaserSensor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'on' ( (lv_position_3_0= ruleEInt ) ) ) )
            // InternalLegoLang.g:1108:2: (otherlv_0= 'LaserSensor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'on' ( (lv_position_3_0= ruleEInt ) ) )
            {
            // InternalLegoLang.g:1108:2: (otherlv_0= 'LaserSensor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'on' ( (lv_position_3_0= ruleEInt ) ) )
            // InternalLegoLang.g:1109:3: otherlv_0= 'LaserSensor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'on' ( (lv_position_3_0= ruleEInt ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLaserSensorAccess().getLaserSensorKeyword_0());
              		
            }
            // InternalLegoLang.g:1113:3: ( (lv_name_1_0= ruleEString ) )
            // InternalLegoLang.g:1114:4: (lv_name_1_0= ruleEString )
            {
            // InternalLegoLang.g:1114:4: (lv_name_1_0= ruleEString )
            // InternalLegoLang.g:1115:5: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLaserSensorAccess().getNameEStringParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_7);
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

            otherlv_2=(Token)match(input,16,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getLaserSensorAccess().getOnKeyword_2());
              		
            }
            // InternalLegoLang.g:1136:3: ( (lv_position_3_0= ruleEInt ) )
            // InternalLegoLang.g:1137:4: (lv_position_3_0= ruleEInt )
            {
            // InternalLegoLang.g:1137:4: (lv_position_3_0= ruleEInt )
            // InternalLegoLang.g:1138:5: lv_position_3_0= ruleEInt
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLaserSensorAccess().getPositionEIntParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_position_3_0=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLaserSensorRule());
              					}
              					set(
              						current,
              						"position",
              						lv_position_3_0,
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
    // InternalLegoLang.g:1159:1: entryRuleGPSSensor returns [EObject current=null] : iv_ruleGPSSensor= ruleGPSSensor EOF ;
    public final EObject entryRuleGPSSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGPSSensor = null;


        try {
            // InternalLegoLang.g:1159:50: (iv_ruleGPSSensor= ruleGPSSensor EOF )
            // InternalLegoLang.g:1160:2: iv_ruleGPSSensor= ruleGPSSensor EOF
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
    // InternalLegoLang.g:1166:1: ruleGPSSensor returns [EObject current=null] : (otherlv_0= 'GPSSensor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'on' ( (lv_position_3_0= ruleEInt ) ) ) ;
    public final EObject ruleGPSSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_position_3_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:1172:2: ( (otherlv_0= 'GPSSensor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'on' ( (lv_position_3_0= ruleEInt ) ) ) )
            // InternalLegoLang.g:1173:2: (otherlv_0= 'GPSSensor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'on' ( (lv_position_3_0= ruleEInt ) ) )
            {
            // InternalLegoLang.g:1173:2: (otherlv_0= 'GPSSensor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'on' ( (lv_position_3_0= ruleEInt ) ) )
            // InternalLegoLang.g:1174:3: otherlv_0= 'GPSSensor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'on' ( (lv_position_3_0= ruleEInt ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGPSSensorAccess().getGPSSensorKeyword_0());
              		
            }
            // InternalLegoLang.g:1178:3: ( (lv_name_1_0= ruleEString ) )
            // InternalLegoLang.g:1179:4: (lv_name_1_0= ruleEString )
            {
            // InternalLegoLang.g:1179:4: (lv_name_1_0= ruleEString )
            // InternalLegoLang.g:1180:5: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGPSSensorAccess().getNameEStringParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_7);
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

            otherlv_2=(Token)match(input,16,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGPSSensorAccess().getOnKeyword_2());
              		
            }
            // InternalLegoLang.g:1201:3: ( (lv_position_3_0= ruleEInt ) )
            // InternalLegoLang.g:1202:4: (lv_position_3_0= ruleEInt )
            {
            // InternalLegoLang.g:1202:4: (lv_position_3_0= ruleEInt )
            // InternalLegoLang.g:1203:5: lv_position_3_0= ruleEInt
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGPSSensorAccess().getPositionEIntParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_position_3_0=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGPSSensorRule());
              					}
              					set(
              						current,
              						"position",
              						lv_position_3_0,
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
    // InternalLegoLang.g:1224:1: entryRuleGyroSensor returns [EObject current=null] : iv_ruleGyroSensor= ruleGyroSensor EOF ;
    public final EObject entryRuleGyroSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGyroSensor = null;


        try {
            // InternalLegoLang.g:1224:51: (iv_ruleGyroSensor= ruleGyroSensor EOF )
            // InternalLegoLang.g:1225:2: iv_ruleGyroSensor= ruleGyroSensor EOF
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
    // InternalLegoLang.g:1231:1: ruleGyroSensor returns [EObject current=null] : (otherlv_0= 'GyroSensor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'on' ( (lv_position_3_0= ruleEInt ) ) ) ;
    public final EObject ruleGyroSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_position_3_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:1237:2: ( (otherlv_0= 'GyroSensor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'on' ( (lv_position_3_0= ruleEInt ) ) ) )
            // InternalLegoLang.g:1238:2: (otherlv_0= 'GyroSensor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'on' ( (lv_position_3_0= ruleEInt ) ) )
            {
            // InternalLegoLang.g:1238:2: (otherlv_0= 'GyroSensor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'on' ( (lv_position_3_0= ruleEInt ) ) )
            // InternalLegoLang.g:1239:3: otherlv_0= 'GyroSensor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'on' ( (lv_position_3_0= ruleEInt ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGyroSensorAccess().getGyroSensorKeyword_0());
              		
            }
            // InternalLegoLang.g:1243:3: ( (lv_name_1_0= ruleEString ) )
            // InternalLegoLang.g:1244:4: (lv_name_1_0= ruleEString )
            {
            // InternalLegoLang.g:1244:4: (lv_name_1_0= ruleEString )
            // InternalLegoLang.g:1245:5: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGyroSensorAccess().getNameEStringParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_7);
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

            otherlv_2=(Token)match(input,16,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGyroSensorAccess().getOnKeyword_2());
              		
            }
            // InternalLegoLang.g:1266:3: ( (lv_position_3_0= ruleEInt ) )
            // InternalLegoLang.g:1267:4: (lv_position_3_0= ruleEInt )
            {
            // InternalLegoLang.g:1267:4: (lv_position_3_0= ruleEInt )
            // InternalLegoLang.g:1268:5: lv_position_3_0= ruleEInt
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGyroSensorAccess().getPositionEIntParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_position_3_0=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGyroSensorRule());
              					}
              					set(
              						current,
              						"position",
              						lv_position_3_0,
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
    // InternalLegoLang.g:1289:1: entryRuleUltraSonicSensor returns [EObject current=null] : iv_ruleUltraSonicSensor= ruleUltraSonicSensor EOF ;
    public final EObject entryRuleUltraSonicSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUltraSonicSensor = null;


        try {
            // InternalLegoLang.g:1289:57: (iv_ruleUltraSonicSensor= ruleUltraSonicSensor EOF )
            // InternalLegoLang.g:1290:2: iv_ruleUltraSonicSensor= ruleUltraSonicSensor EOF
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
    // InternalLegoLang.g:1296:1: ruleUltraSonicSensor returns [EObject current=null] : (otherlv_0= 'UltraSonicSensor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'on' ( (lv_position_3_0= ruleEInt ) ) ) ;
    public final EObject ruleUltraSonicSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_position_3_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:1302:2: ( (otherlv_0= 'UltraSonicSensor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'on' ( (lv_position_3_0= ruleEInt ) ) ) )
            // InternalLegoLang.g:1303:2: (otherlv_0= 'UltraSonicSensor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'on' ( (lv_position_3_0= ruleEInt ) ) )
            {
            // InternalLegoLang.g:1303:2: (otherlv_0= 'UltraSonicSensor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'on' ( (lv_position_3_0= ruleEInt ) ) )
            // InternalLegoLang.g:1304:3: otherlv_0= 'UltraSonicSensor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'on' ( (lv_position_3_0= ruleEInt ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getUltraSonicSensorAccess().getUltraSonicSensorKeyword_0());
              		
            }
            // InternalLegoLang.g:1308:3: ( (lv_name_1_0= ruleEString ) )
            // InternalLegoLang.g:1309:4: (lv_name_1_0= ruleEString )
            {
            // InternalLegoLang.g:1309:4: (lv_name_1_0= ruleEString )
            // InternalLegoLang.g:1310:5: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getUltraSonicSensorAccess().getNameEStringParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_7);
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

            otherlv_2=(Token)match(input,16,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getUltraSonicSensorAccess().getOnKeyword_2());
              		
            }
            // InternalLegoLang.g:1331:3: ( (lv_position_3_0= ruleEInt ) )
            // InternalLegoLang.g:1332:4: (lv_position_3_0= ruleEInt )
            {
            // InternalLegoLang.g:1332:4: (lv_position_3_0= ruleEInt )
            // InternalLegoLang.g:1333:5: lv_position_3_0= ruleEInt
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getUltraSonicSensorAccess().getPositionEIntParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_position_3_0=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getUltraSonicSensorRule());
              					}
              					set(
              						current,
              						"position",
              						lv_position_3_0,
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
    // InternalLegoLang.g:1354:1: entryRuleCar returns [EObject current=null] : iv_ruleCar= ruleCar EOF ;
    public final EObject entryRuleCar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCar = null;


        try {
            // InternalLegoLang.g:1354:44: (iv_ruleCar= ruleCar EOF )
            // InternalLegoLang.g:1355:2: iv_ruleCar= ruleCar EOF
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
    // InternalLegoLang.g:1361:1: ruleCar returns [EObject current=null] : (otherlv_0= 'Car' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_sensor_3_0= ruleSensor ) )* ( (lv_engine_4_0= ruleEngine ) )* otherlv_5= '}' ) ;
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
            // InternalLegoLang.g:1367:2: ( (otherlv_0= 'Car' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_sensor_3_0= ruleSensor ) )* ( (lv_engine_4_0= ruleEngine ) )* otherlv_5= '}' ) )
            // InternalLegoLang.g:1368:2: (otherlv_0= 'Car' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_sensor_3_0= ruleSensor ) )* ( (lv_engine_4_0= ruleEngine ) )* otherlv_5= '}' )
            {
            // InternalLegoLang.g:1368:2: (otherlv_0= 'Car' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_sensor_3_0= ruleSensor ) )* ( (lv_engine_4_0= ruleEngine ) )* otherlv_5= '}' )
            // InternalLegoLang.g:1369:3: otherlv_0= 'Car' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_sensor_3_0= ruleSensor ) )* ( (lv_engine_4_0= ruleEngine ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getCarAccess().getCarKeyword_0());
              		
            }
            // InternalLegoLang.g:1373:3: ( (lv_name_1_0= ruleEString ) )
            // InternalLegoLang.g:1374:4: (lv_name_1_0= ruleEString )
            {
            // InternalLegoLang.g:1374:4: (lv_name_1_0= ruleEString )
            // InternalLegoLang.g:1375:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getCarAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalLegoLang.g:1396:3: ( (lv_sensor_3_0= ruleSensor ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=19 && LA10_0<=23)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalLegoLang.g:1397:4: (lv_sensor_3_0= ruleSensor )
            	    {
            	    // InternalLegoLang.g:1397:4: (lv_sensor_3_0= ruleSensor )
            	    // InternalLegoLang.g:1398:5: lv_sensor_3_0= ruleSensor
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getCarAccess().getSensorSensorParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_9);
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
            	    break loop10;
                }
            } while (true);

            // InternalLegoLang.g:1415:3: ( (lv_engine_4_0= ruleEngine ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==15||(LA11_0>=17 && LA11_0<=18)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalLegoLang.g:1416:4: (lv_engine_4_0= ruleEngine )
            	    {
            	    // InternalLegoLang.g:1416:4: (lv_engine_4_0= ruleEngine )
            	    // InternalLegoLang.g:1417:5: lv_engine_4_0= ruleEngine
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getCarAccess().getEngineEngineParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_9);
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
            	    break loop11;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
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
    // InternalLegoLang.g:1442:1: entryRuleEngineOperation returns [EObject current=null] : iv_ruleEngineOperation= ruleEngineOperation EOF ;
    public final EObject entryRuleEngineOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEngineOperation = null;


        try {
            // InternalLegoLang.g:1442:56: (iv_ruleEngineOperation= ruleEngineOperation EOF )
            // InternalLegoLang.g:1443:2: iv_ruleEngineOperation= ruleEngineOperation EOF
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
    // InternalLegoLang.g:1449:1: ruleEngineOperation returns [EObject current=null] : (this_VitesseOperation_0= ruleVitesseOperation | this_PositionOperation_1= rulePositionOperation | this_ForceOperation_2= ruleForceOperation ) ;
    public final EObject ruleEngineOperation() throws RecognitionException {
        EObject current = null;

        EObject this_VitesseOperation_0 = null;

        EObject this_PositionOperation_1 = null;

        EObject this_ForceOperation_2 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:1455:2: ( (this_VitesseOperation_0= ruleVitesseOperation | this_PositionOperation_1= rulePositionOperation | this_ForceOperation_2= ruleForceOperation ) )
            // InternalLegoLang.g:1456:2: (this_VitesseOperation_0= ruleVitesseOperation | this_PositionOperation_1= rulePositionOperation | this_ForceOperation_2= ruleForceOperation )
            {
            // InternalLegoLang.g:1456:2: (this_VitesseOperation_0= ruleVitesseOperation | this_PositionOperation_1= rulePositionOperation | this_ForceOperation_2= ruleForceOperation )
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                switch ( input.LA(2) ) {
                case 26:
                    {
                    alt12=1;
                    }
                    break;
                case 33:
                    {
                    alt12=3;
                    }
                    break;
                case 32:
                    {
                    alt12=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalLegoLang.g:1457:3: this_VitesseOperation_0= ruleVitesseOperation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEngineOperationAccess().getVitesseOperationParserRuleCall_0());
                      		
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
                    break;
                case 2 :
                    // InternalLegoLang.g:1469:3: this_PositionOperation_1= rulePositionOperation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEngineOperationAccess().getPositionOperationParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PositionOperation_1=rulePositionOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PositionOperation_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalLegoLang.g:1481:3: this_ForceOperation_2= ruleForceOperation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEngineOperationAccess().getForceOperationParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ForceOperation_2=ruleForceOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ForceOperation_2;
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
    // $ANTLR end "ruleEngineOperation"


    // $ANTLR start "entryRuleSensorOperation"
    // InternalLegoLang.g:1496:1: entryRuleSensorOperation returns [EObject current=null] : iv_ruleSensorOperation= ruleSensorOperation EOF ;
    public final EObject entryRuleSensorOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorOperation = null;


        try {
            // InternalLegoLang.g:1496:56: (iv_ruleSensorOperation= ruleSensorOperation EOF )
            // InternalLegoLang.g:1497:2: iv_ruleSensorOperation= ruleSensorOperation EOF
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
    // InternalLegoLang.g:1503:1: ruleSensorOperation returns [EObject current=null] : (this_RangeOperation_0= ruleRangeOperation | this_ColorOperation_1= ruleColorOperation | this_IntensityOperation_2= ruleIntensityOperation | this_XGPSOperation_3= ruleXGPSOperation | this_YGPSOperation_4= ruleYGPSOperation | this_AngleOperation_5= ruleAngleOperation | this_DistanceOperation_6= ruleDistanceOperation ) ;
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
            // InternalLegoLang.g:1509:2: ( (this_RangeOperation_0= ruleRangeOperation | this_ColorOperation_1= ruleColorOperation | this_IntensityOperation_2= ruleIntensityOperation | this_XGPSOperation_3= ruleXGPSOperation | this_YGPSOperation_4= ruleYGPSOperation | this_AngleOperation_5= ruleAngleOperation | this_DistanceOperation_6= ruleDistanceOperation ) )
            // InternalLegoLang.g:1510:2: (this_RangeOperation_0= ruleRangeOperation | this_ColorOperation_1= ruleColorOperation | this_IntensityOperation_2= ruleIntensityOperation | this_XGPSOperation_3= ruleXGPSOperation | this_YGPSOperation_4= ruleYGPSOperation | this_AngleOperation_5= ruleAngleOperation | this_DistanceOperation_6= ruleDistanceOperation )
            {
            // InternalLegoLang.g:1510:2: (this_RangeOperation_0= ruleRangeOperation | this_ColorOperation_1= ruleColorOperation | this_IntensityOperation_2= ruleIntensityOperation | this_XGPSOperation_3= ruleXGPSOperation | this_YGPSOperation_4= ruleYGPSOperation | this_AngleOperation_5= ruleAngleOperation | this_DistanceOperation_6= ruleDistanceOperation )
            int alt13=7;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==34) ) {
                switch ( input.LA(2) ) {
                case 35:
                    {
                    alt13=2;
                    }
                    break;
                case 38:
                    {
                    alt13=4;
                    }
                    break;
                case 36:
                    {
                    alt13=3;
                    }
                    break;
                case 39:
                    {
                    alt13=5;
                    }
                    break;
                case 37:
                    {
                    alt13=1;
                    }
                    break;
                case 40:
                    {
                    alt13=6;
                    }
                    break;
                case 41:
                    {
                    alt13=7;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalLegoLang.g:1511:3: this_RangeOperation_0= ruleRangeOperation
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
                    // InternalLegoLang.g:1523:3: this_ColorOperation_1= ruleColorOperation
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
                    // InternalLegoLang.g:1535:3: this_IntensityOperation_2= ruleIntensityOperation
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
                    // InternalLegoLang.g:1547:3: this_XGPSOperation_3= ruleXGPSOperation
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
                    // InternalLegoLang.g:1559:3: this_YGPSOperation_4= ruleYGPSOperation
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
                    // InternalLegoLang.g:1571:3: this_AngleOperation_5= ruleAngleOperation
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
                    // InternalLegoLang.g:1583:3: this_DistanceOperation_6= ruleDistanceOperation
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
    // InternalLegoLang.g:1598:1: entryRuleVitesseOperation returns [EObject current=null] : iv_ruleVitesseOperation= ruleVitesseOperation EOF ;
    public final EObject entryRuleVitesseOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVitesseOperation = null;


        try {
            // InternalLegoLang.g:1598:57: (iv_ruleVitesseOperation= ruleVitesseOperation EOF )
            // InternalLegoLang.g:1599:2: iv_ruleVitesseOperation= ruleVitesseOperation EOF
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
    // InternalLegoLang.g:1605:1: ruleVitesseOperation returns [EObject current=null] : (otherlv_0= 'set' otherlv_1= 'vitesse' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' otherlv_5= '=' ( (lv_right_6_0= ruleExpression ) ) ) ;
    public final EObject ruleVitesseOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:1611:2: ( (otherlv_0= 'set' otherlv_1= 'vitesse' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' otherlv_5= '=' ( (lv_right_6_0= ruleExpression ) ) ) )
            // InternalLegoLang.g:1612:2: (otherlv_0= 'set' otherlv_1= 'vitesse' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' otherlv_5= '=' ( (lv_right_6_0= ruleExpression ) ) )
            {
            // InternalLegoLang.g:1612:2: (otherlv_0= 'set' otherlv_1= 'vitesse' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' otherlv_5= '=' ( (lv_right_6_0= ruleExpression ) ) )
            // InternalLegoLang.g:1613:3: otherlv_0= 'set' otherlv_1= 'vitesse' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' otherlv_5= '=' ( (lv_right_6_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getVitesseOperationAccess().getSetKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,26,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVitesseOperationAccess().getVitesseKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,27,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getVitesseOperationAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalLegoLang.g:1625:3: ( ( ruleFQN ) )
            // InternalLegoLang.g:1626:4: ( ruleFQN )
            {
            // InternalLegoLang.g:1626:4: ( ruleFQN )
            // InternalLegoLang.g:1627:5: ruleFQN
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

              					newCompositeNode(grammarAccess.getVitesseOperationAccess().getWheelengineWheelEngineCrossReference_3_0());
              				
            }
            pushFollow(FOLLOW_12);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,28,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getVitesseOperationAccess().getRightParenthesisKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,29,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getVitesseOperationAccess().getEqualsSignKeyword_5());
              		
            }
            // InternalLegoLang.g:1652:3: ( (lv_right_6_0= ruleExpression ) )
            // InternalLegoLang.g:1653:4: (lv_right_6_0= ruleExpression )
            {
            // InternalLegoLang.g:1653:4: (lv_right_6_0= ruleExpression )
            // InternalLegoLang.g:1654:5: lv_right_6_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVitesseOperationAccess().getRightExpressionParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_right_6_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVitesseOperationRule());
              					}
              					set(
              						current,
              						"right",
              						lv_right_6_0,
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


    // $ANTLR start "entryRuleBreakMotor"
    // InternalLegoLang.g:1675:1: entryRuleBreakMotor returns [EObject current=null] : iv_ruleBreakMotor= ruleBreakMotor EOF ;
    public final EObject entryRuleBreakMotor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBreakMotor = null;


        try {
            // InternalLegoLang.g:1675:51: (iv_ruleBreakMotor= ruleBreakMotor EOF )
            // InternalLegoLang.g:1676:2: iv_ruleBreakMotor= ruleBreakMotor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBreakMotorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBreakMotor=ruleBreakMotor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBreakMotor; 
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
    // $ANTLR end "entryRuleBreakMotor"


    // $ANTLR start "ruleBreakMotor"
    // InternalLegoLang.g:1682:1: ruleBreakMotor returns [EObject current=null] : (otherlv_0= 'break' otherlv_1= 'motor' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' ) ;
    public final EObject ruleBreakMotor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalLegoLang.g:1688:2: ( (otherlv_0= 'break' otherlv_1= 'motor' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' ) )
            // InternalLegoLang.g:1689:2: (otherlv_0= 'break' otherlv_1= 'motor' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' )
            {
            // InternalLegoLang.g:1689:2: (otherlv_0= 'break' otherlv_1= 'motor' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' )
            // InternalLegoLang.g:1690:3: otherlv_0= 'break' otherlv_1= 'motor' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBreakMotorAccess().getBreakKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,31,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getBreakMotorAccess().getMotorKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,27,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getBreakMotorAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalLegoLang.g:1702:3: ( ( ruleFQN ) )
            // InternalLegoLang.g:1703:4: ( ruleFQN )
            {
            // InternalLegoLang.g:1703:4: ( ruleFQN )
            // InternalLegoLang.g:1704:5: ruleFQN
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getBreakMotorRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBreakMotorAccess().getEngineEngineCrossReference_3_0());
              				
            }
            pushFollow(FOLLOW_12);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getBreakMotorAccess().getRightParenthesisKeyword_4());
              		
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
    // $ANTLR end "ruleBreakMotor"


    // $ANTLR start "entryRulePositionOperation"
    // InternalLegoLang.g:1729:1: entryRulePositionOperation returns [EObject current=null] : iv_rulePositionOperation= rulePositionOperation EOF ;
    public final EObject entryRulePositionOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePositionOperation = null;


        try {
            // InternalLegoLang.g:1729:58: (iv_rulePositionOperation= rulePositionOperation EOF )
            // InternalLegoLang.g:1730:2: iv_rulePositionOperation= rulePositionOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPositionOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePositionOperation=rulePositionOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePositionOperation; 
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
    // $ANTLR end "entryRulePositionOperation"


    // $ANTLR start "rulePositionOperation"
    // InternalLegoLang.g:1736:1: rulePositionOperation returns [EObject current=null] : (otherlv_0= 'set' otherlv_1= 'degres' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' otherlv_5= '=' ( (lv_right_6_0= ruleExpression ) ) ) ;
    public final EObject rulePositionOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:1742:2: ( (otherlv_0= 'set' otherlv_1= 'degres' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' otherlv_5= '=' ( (lv_right_6_0= ruleExpression ) ) ) )
            // InternalLegoLang.g:1743:2: (otherlv_0= 'set' otherlv_1= 'degres' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' otherlv_5= '=' ( (lv_right_6_0= ruleExpression ) ) )
            {
            // InternalLegoLang.g:1743:2: (otherlv_0= 'set' otherlv_1= 'degres' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' otherlv_5= '=' ( (lv_right_6_0= ruleExpression ) ) )
            // InternalLegoLang.g:1744:3: otherlv_0= 'set' otherlv_1= 'degres' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' otherlv_5= '=' ( (lv_right_6_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPositionOperationAccess().getSetKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,32,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPositionOperationAccess().getDegresKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,27,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getPositionOperationAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalLegoLang.g:1756:3: ( ( ruleFQN ) )
            // InternalLegoLang.g:1757:4: ( ruleFQN )
            {
            // InternalLegoLang.g:1757:4: ( ruleFQN )
            // InternalLegoLang.g:1758:5: ruleFQN
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPositionOperationRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPositionOperationAccess().getMotorizedarmengineMotorizedArmEngineCrossReference_3_0());
              				
            }
            pushFollow(FOLLOW_12);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,28,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getPositionOperationAccess().getRightParenthesisKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,29,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getPositionOperationAccess().getEqualsSignKeyword_5());
              		
            }
            // InternalLegoLang.g:1783:3: ( (lv_right_6_0= ruleExpression ) )
            // InternalLegoLang.g:1784:4: (lv_right_6_0= ruleExpression )
            {
            // InternalLegoLang.g:1784:4: (lv_right_6_0= ruleExpression )
            // InternalLegoLang.g:1785:5: lv_right_6_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPositionOperationAccess().getRightExpressionParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_right_6_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPositionOperationRule());
              					}
              					set(
              						current,
              						"right",
              						lv_right_6_0,
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
    // $ANTLR end "rulePositionOperation"


    // $ANTLR start "entryRuleForceOperation"
    // InternalLegoLang.g:1806:1: entryRuleForceOperation returns [EObject current=null] : iv_ruleForceOperation= ruleForceOperation EOF ;
    public final EObject entryRuleForceOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForceOperation = null;


        try {
            // InternalLegoLang.g:1806:55: (iv_ruleForceOperation= ruleForceOperation EOF )
            // InternalLegoLang.g:1807:2: iv_ruleForceOperation= ruleForceOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForceOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleForceOperation=ruleForceOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForceOperation; 
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
    // $ANTLR end "entryRuleForceOperation"


    // $ANTLR start "ruleForceOperation"
    // InternalLegoLang.g:1813:1: ruleForceOperation returns [EObject current=null] : (otherlv_0= 'set' otherlv_1= 'strength' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' otherlv_5= '=' ( (lv_right_6_0= ruleExpression ) ) ) ;
    public final EObject ruleForceOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:1819:2: ( (otherlv_0= 'set' otherlv_1= 'strength' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' otherlv_5= '=' ( (lv_right_6_0= ruleExpression ) ) ) )
            // InternalLegoLang.g:1820:2: (otherlv_0= 'set' otherlv_1= 'strength' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' otherlv_5= '=' ( (lv_right_6_0= ruleExpression ) ) )
            {
            // InternalLegoLang.g:1820:2: (otherlv_0= 'set' otherlv_1= 'strength' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' otherlv_5= '=' ( (lv_right_6_0= ruleExpression ) ) )
            // InternalLegoLang.g:1821:3: otherlv_0= 'set' otherlv_1= 'strength' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' otherlv_5= '=' ( (lv_right_6_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getForceOperationAccess().getSetKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,33,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getForceOperationAccess().getStrengthKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,27,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getForceOperationAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalLegoLang.g:1833:3: ( ( ruleFQN ) )
            // InternalLegoLang.g:1834:4: ( ruleFQN )
            {
            // InternalLegoLang.g:1834:4: ( ruleFQN )
            // InternalLegoLang.g:1835:5: ruleFQN
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getForceOperationRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForceOperationAccess().getPaintballlauncherenginePaintballLauncherEngineCrossReference_3_0());
              				
            }
            pushFollow(FOLLOW_12);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,28,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getForceOperationAccess().getRightParenthesisKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,29,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getForceOperationAccess().getEqualsSignKeyword_5());
              		
            }
            // InternalLegoLang.g:1860:3: ( (lv_right_6_0= ruleExpression ) )
            // InternalLegoLang.g:1861:4: (lv_right_6_0= ruleExpression )
            {
            // InternalLegoLang.g:1861:4: (lv_right_6_0= ruleExpression )
            // InternalLegoLang.g:1862:5: lv_right_6_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForceOperationAccess().getRightExpressionParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_right_6_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForceOperationRule());
              					}
              					set(
              						current,
              						"right",
              						lv_right_6_0,
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
    // $ANTLR end "ruleForceOperation"


    // $ANTLR start "entryRuleColorOperation"
    // InternalLegoLang.g:1883:1: entryRuleColorOperation returns [EObject current=null] : iv_ruleColorOperation= ruleColorOperation EOF ;
    public final EObject entryRuleColorOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorOperation = null;


        try {
            // InternalLegoLang.g:1883:55: (iv_ruleColorOperation= ruleColorOperation EOF )
            // InternalLegoLang.g:1884:2: iv_ruleColorOperation= ruleColorOperation EOF
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
    // InternalLegoLang.g:1890:1: ruleColorOperation returns [EObject current=null] : (otherlv_0= 'get' otherlv_1= 'color' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' ) ;
    public final EObject ruleColorOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalLegoLang.g:1896:2: ( (otherlv_0= 'get' otherlv_1= 'color' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' ) )
            // InternalLegoLang.g:1897:2: (otherlv_0= 'get' otherlv_1= 'color' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' )
            {
            // InternalLegoLang.g:1897:2: (otherlv_0= 'get' otherlv_1= 'color' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' )
            // InternalLegoLang.g:1898:3: otherlv_0= 'get' otherlv_1= 'color' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getColorOperationAccess().getGetKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,35,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getColorOperationAccess().getColorKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,27,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getColorOperationAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalLegoLang.g:1910:3: ( ( ruleFQN ) )
            // InternalLegoLang.g:1911:4: ( ruleFQN )
            {
            // InternalLegoLang.g:1911:4: ( ruleFQN )
            // InternalLegoLang.g:1912:5: ruleFQN
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
            pushFollow(FOLLOW_12);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
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
    // InternalLegoLang.g:1937:1: entryRuleIntensityOperation returns [EObject current=null] : iv_ruleIntensityOperation= ruleIntensityOperation EOF ;
    public final EObject entryRuleIntensityOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntensityOperation = null;


        try {
            // InternalLegoLang.g:1937:59: (iv_ruleIntensityOperation= ruleIntensityOperation EOF )
            // InternalLegoLang.g:1938:2: iv_ruleIntensityOperation= ruleIntensityOperation EOF
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
    // InternalLegoLang.g:1944:1: ruleIntensityOperation returns [EObject current=null] : (otherlv_0= 'get' otherlv_1= 'intensity' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' ) ;
    public final EObject ruleIntensityOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalLegoLang.g:1950:2: ( (otherlv_0= 'get' otherlv_1= 'intensity' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' ) )
            // InternalLegoLang.g:1951:2: (otherlv_0= 'get' otherlv_1= 'intensity' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' )
            {
            // InternalLegoLang.g:1951:2: (otherlv_0= 'get' otherlv_1= 'intensity' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' )
            // InternalLegoLang.g:1952:3: otherlv_0= 'get' otherlv_1= 'intensity' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIntensityOperationAccess().getGetKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,36,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getIntensityOperationAccess().getIntensityKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,27,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getIntensityOperationAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalLegoLang.g:1964:3: ( ( ruleFQN ) )
            // InternalLegoLang.g:1965:4: ( ruleFQN )
            {
            // InternalLegoLang.g:1965:4: ( ruleFQN )
            // InternalLegoLang.g:1966:5: ruleFQN
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
            pushFollow(FOLLOW_12);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
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
    // InternalLegoLang.g:1991:1: entryRuleRangeOperation returns [EObject current=null] : iv_ruleRangeOperation= ruleRangeOperation EOF ;
    public final EObject entryRuleRangeOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRangeOperation = null;


        try {
            // InternalLegoLang.g:1991:55: (iv_ruleRangeOperation= ruleRangeOperation EOF )
            // InternalLegoLang.g:1992:2: iv_ruleRangeOperation= ruleRangeOperation EOF
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
    // InternalLegoLang.g:1998:1: ruleRangeOperation returns [EObject current=null] : (otherlv_0= 'get' otherlv_1= 'range' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' ) ;
    public final EObject ruleRangeOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalLegoLang.g:2004:2: ( (otherlv_0= 'get' otherlv_1= 'range' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' ) )
            // InternalLegoLang.g:2005:2: (otherlv_0= 'get' otherlv_1= 'range' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' )
            {
            // InternalLegoLang.g:2005:2: (otherlv_0= 'get' otherlv_1= 'range' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' )
            // InternalLegoLang.g:2006:3: otherlv_0= 'get' otherlv_1= 'range' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRangeOperationAccess().getGetKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,37,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRangeOperationAccess().getRangeKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,27,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getRangeOperationAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalLegoLang.g:2018:3: ( ( ruleFQN ) )
            // InternalLegoLang.g:2019:4: ( ruleFQN )
            {
            // InternalLegoLang.g:2019:4: ( ruleFQN )
            // InternalLegoLang.g:2020:5: ruleFQN
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
            pushFollow(FOLLOW_12);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
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
    // InternalLegoLang.g:2045:1: entryRuleXGPSOperation returns [EObject current=null] : iv_ruleXGPSOperation= ruleXGPSOperation EOF ;
    public final EObject entryRuleXGPSOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXGPSOperation = null;


        try {
            // InternalLegoLang.g:2045:54: (iv_ruleXGPSOperation= ruleXGPSOperation EOF )
            // InternalLegoLang.g:2046:2: iv_ruleXGPSOperation= ruleXGPSOperation EOF
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
    // InternalLegoLang.g:2052:1: ruleXGPSOperation returns [EObject current=null] : (otherlv_0= 'get' otherlv_1= 'x' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' ) ;
    public final EObject ruleXGPSOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalLegoLang.g:2058:2: ( (otherlv_0= 'get' otherlv_1= 'x' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' ) )
            // InternalLegoLang.g:2059:2: (otherlv_0= 'get' otherlv_1= 'x' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' )
            {
            // InternalLegoLang.g:2059:2: (otherlv_0= 'get' otherlv_1= 'x' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' )
            // InternalLegoLang.g:2060:3: otherlv_0= 'get' otherlv_1= 'x' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getXGPSOperationAccess().getGetKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,38,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getXGPSOperationAccess().getXKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,27,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getXGPSOperationAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalLegoLang.g:2072:3: ( ( ruleFQN ) )
            // InternalLegoLang.g:2073:4: ( ruleFQN )
            {
            // InternalLegoLang.g:2073:4: ( ruleFQN )
            // InternalLegoLang.g:2074:5: ruleFQN
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
            pushFollow(FOLLOW_12);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
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
    // InternalLegoLang.g:2099:1: entryRuleYGPSOperation returns [EObject current=null] : iv_ruleYGPSOperation= ruleYGPSOperation EOF ;
    public final EObject entryRuleYGPSOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYGPSOperation = null;


        try {
            // InternalLegoLang.g:2099:54: (iv_ruleYGPSOperation= ruleYGPSOperation EOF )
            // InternalLegoLang.g:2100:2: iv_ruleYGPSOperation= ruleYGPSOperation EOF
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
    // InternalLegoLang.g:2106:1: ruleYGPSOperation returns [EObject current=null] : (otherlv_0= 'get' otherlv_1= 'y' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' ) ;
    public final EObject ruleYGPSOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalLegoLang.g:2112:2: ( (otherlv_0= 'get' otherlv_1= 'y' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' ) )
            // InternalLegoLang.g:2113:2: (otherlv_0= 'get' otherlv_1= 'y' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' )
            {
            // InternalLegoLang.g:2113:2: (otherlv_0= 'get' otherlv_1= 'y' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' )
            // InternalLegoLang.g:2114:3: otherlv_0= 'get' otherlv_1= 'y' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getYGPSOperationAccess().getGetKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,39,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getYGPSOperationAccess().getYKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,27,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getYGPSOperationAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalLegoLang.g:2126:3: ( ( ruleFQN ) )
            // InternalLegoLang.g:2127:4: ( ruleFQN )
            {
            // InternalLegoLang.g:2127:4: ( ruleFQN )
            // InternalLegoLang.g:2128:5: ruleFQN
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
            pushFollow(FOLLOW_12);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
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
    // InternalLegoLang.g:2153:1: entryRuleAngleOperation returns [EObject current=null] : iv_ruleAngleOperation= ruleAngleOperation EOF ;
    public final EObject entryRuleAngleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAngleOperation = null;


        try {
            // InternalLegoLang.g:2153:55: (iv_ruleAngleOperation= ruleAngleOperation EOF )
            // InternalLegoLang.g:2154:2: iv_ruleAngleOperation= ruleAngleOperation EOF
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
    // InternalLegoLang.g:2160:1: ruleAngleOperation returns [EObject current=null] : (otherlv_0= 'get' otherlv_1= 'angle' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' ) ;
    public final EObject ruleAngleOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalLegoLang.g:2166:2: ( (otherlv_0= 'get' otherlv_1= 'angle' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' ) )
            // InternalLegoLang.g:2167:2: (otherlv_0= 'get' otherlv_1= 'angle' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' )
            {
            // InternalLegoLang.g:2167:2: (otherlv_0= 'get' otherlv_1= 'angle' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' )
            // InternalLegoLang.g:2168:3: otherlv_0= 'get' otherlv_1= 'angle' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAngleOperationAccess().getGetKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,40,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAngleOperationAccess().getAngleKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,27,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getAngleOperationAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalLegoLang.g:2180:3: ( ( ruleFQN ) )
            // InternalLegoLang.g:2181:4: ( ruleFQN )
            {
            // InternalLegoLang.g:2181:4: ( ruleFQN )
            // InternalLegoLang.g:2182:5: ruleFQN
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
            pushFollow(FOLLOW_12);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
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
    // InternalLegoLang.g:2207:1: entryRuleDistanceOperation returns [EObject current=null] : iv_ruleDistanceOperation= ruleDistanceOperation EOF ;
    public final EObject entryRuleDistanceOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDistanceOperation = null;


        try {
            // InternalLegoLang.g:2207:58: (iv_ruleDistanceOperation= ruleDistanceOperation EOF )
            // InternalLegoLang.g:2208:2: iv_ruleDistanceOperation= ruleDistanceOperation EOF
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
    // InternalLegoLang.g:2214:1: ruleDistanceOperation returns [EObject current=null] : (otherlv_0= 'get' otherlv_1= 'distance' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' ) ;
    public final EObject ruleDistanceOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalLegoLang.g:2220:2: ( (otherlv_0= 'get' otherlv_1= 'distance' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' ) )
            // InternalLegoLang.g:2221:2: (otherlv_0= 'get' otherlv_1= 'distance' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' )
            {
            // InternalLegoLang.g:2221:2: (otherlv_0= 'get' otherlv_1= 'distance' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' )
            // InternalLegoLang.g:2222:3: otherlv_0= 'get' otherlv_1= 'distance' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDistanceOperationAccess().getGetKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,41,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDistanceOperationAccess().getDistanceKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,27,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDistanceOperationAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalLegoLang.g:2234:3: ( ( ruleFQN ) )
            // InternalLegoLang.g:2235:4: ( ruleFQN )
            {
            // InternalLegoLang.g:2235:4: ( ruleFQN )
            // InternalLegoLang.g:2236:5: ruleFQN
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
            pushFollow(FOLLOW_12);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleBooleanExpression"
    // InternalLegoLang.g:2261:1: entryRuleBooleanExpression returns [EObject current=null] : iv_ruleBooleanExpression= ruleBooleanExpression EOF ;
    public final EObject entryRuleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpression = null;


        try {
            // InternalLegoLang.g:2261:58: (iv_ruleBooleanExpression= ruleBooleanExpression EOF )
            // InternalLegoLang.g:2262:2: iv_ruleBooleanExpression= ruleBooleanExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBooleanExpression=ruleBooleanExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanExpression; 
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
    // $ANTLR end "entryRuleBooleanExpression"


    // $ANTLR start "ruleBooleanExpression"
    // InternalLegoLang.g:2268:1: ruleBooleanExpression returns [EObject current=null] : (this_And_0= ruleAnd | this_Or_1= ruleOr ) ;
    public final EObject ruleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject this_And_0 = null;

        EObject this_Or_1 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:2274:2: ( (this_And_0= ruleAnd | this_Or_1= ruleOr ) )
            // InternalLegoLang.g:2275:2: (this_And_0= ruleAnd | this_Or_1= ruleOr )
            {
            // InternalLegoLang.g:2275:2: (this_And_0= ruleAnd | this_Or_1= ruleOr )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                int LA14_1 = input.LA(2);

                if ( (synpred52_InternalLegoLang()) ) {
                    alt14=1;
                }
                else if ( (true) ) {
                    alt14=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalLegoLang.g:2276:3: this_And_0= ruleAnd
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBooleanExpressionAccess().getAndParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_And_0=ruleAnd();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_And_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalLegoLang.g:2288:3: this_Or_1= ruleOr
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBooleanExpressionAccess().getOrParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Or_1=ruleOr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Or_1;
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
    // $ANTLR end "ruleBooleanExpression"


    // $ANTLR start "entryRuleAnd"
    // InternalLegoLang.g:2303:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalLegoLang.g:2303:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalLegoLang.g:2304:2: iv_ruleAnd= ruleAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAnd=ruleAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnd; 
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
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalLegoLang.g:2310:1: ruleAnd returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_left_2_0= ruleExpression ) ) (otherlv_3= 'and' ( (lv_right_4_0= ruleExpression ) ) )? otherlv_5= ')' ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_left_2_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:2316:2: ( ( () otherlv_1= '(' ( (lv_left_2_0= ruleExpression ) ) (otherlv_3= 'and' ( (lv_right_4_0= ruleExpression ) ) )? otherlv_5= ')' ) )
            // InternalLegoLang.g:2317:2: ( () otherlv_1= '(' ( (lv_left_2_0= ruleExpression ) ) (otherlv_3= 'and' ( (lv_right_4_0= ruleExpression ) ) )? otherlv_5= ')' )
            {
            // InternalLegoLang.g:2317:2: ( () otherlv_1= '(' ( (lv_left_2_0= ruleExpression ) ) (otherlv_3= 'and' ( (lv_right_4_0= ruleExpression ) ) )? otherlv_5= ')' )
            // InternalLegoLang.g:2318:3: () otherlv_1= '(' ( (lv_left_2_0= ruleExpression ) ) (otherlv_3= 'and' ( (lv_right_4_0= ruleExpression ) ) )? otherlv_5= ')'
            {
            // InternalLegoLang.g:2318:3: ()
            // InternalLegoLang.g:2319:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getAndAccess().getAndAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,27,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAndAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalLegoLang.g:2332:3: ( (lv_left_2_0= ruleExpression ) )
            // InternalLegoLang.g:2333:4: (lv_left_2_0= ruleExpression )
            {
            // InternalLegoLang.g:2333:4: (lv_left_2_0= ruleExpression )
            // InternalLegoLang.g:2334:5: lv_left_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAndAccess().getLeftExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_25);
            lv_left_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAndRule());
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

            // InternalLegoLang.g:2351:3: (otherlv_3= 'and' ( (lv_right_4_0= ruleExpression ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==42) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalLegoLang.g:2352:4: otherlv_3= 'and' ( (lv_right_4_0= ruleExpression ) )
                    {
                    otherlv_3=(Token)match(input,42,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getAndAccess().getAndKeyword_3_0());
                      			
                    }
                    // InternalLegoLang.g:2356:4: ( (lv_right_4_0= ruleExpression ) )
                    // InternalLegoLang.g:2357:5: (lv_right_4_0= ruleExpression )
                    {
                    // InternalLegoLang.g:2357:5: (lv_right_4_0= ruleExpression )
                    // InternalLegoLang.g:2358:6: lv_right_4_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAndAccess().getRightExpressionParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_12);
                    lv_right_4_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAndRule());
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
                    break;

            }

            otherlv_5=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getAndAccess().getRightParenthesisKeyword_4());
              		
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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleOr"
    // InternalLegoLang.g:2384:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalLegoLang.g:2384:43: (iv_ruleOr= ruleOr EOF )
            // InternalLegoLang.g:2385:2: iv_ruleOr= ruleOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOr=ruleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOr; 
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
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // InternalLegoLang.g:2391:1: ruleOr returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_left_2_0= ruleExpression ) ) (otherlv_3= 'or' ( (lv_right_4_0= ruleExpression ) ) )? otherlv_5= ')' ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_left_2_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:2397:2: ( ( () otherlv_1= '(' ( (lv_left_2_0= ruleExpression ) ) (otherlv_3= 'or' ( (lv_right_4_0= ruleExpression ) ) )? otherlv_5= ')' ) )
            // InternalLegoLang.g:2398:2: ( () otherlv_1= '(' ( (lv_left_2_0= ruleExpression ) ) (otherlv_3= 'or' ( (lv_right_4_0= ruleExpression ) ) )? otherlv_5= ')' )
            {
            // InternalLegoLang.g:2398:2: ( () otherlv_1= '(' ( (lv_left_2_0= ruleExpression ) ) (otherlv_3= 'or' ( (lv_right_4_0= ruleExpression ) ) )? otherlv_5= ')' )
            // InternalLegoLang.g:2399:3: () otherlv_1= '(' ( (lv_left_2_0= ruleExpression ) ) (otherlv_3= 'or' ( (lv_right_4_0= ruleExpression ) ) )? otherlv_5= ')'
            {
            // InternalLegoLang.g:2399:3: ()
            // InternalLegoLang.g:2400:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getOrAccess().getOrAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,27,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getOrAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalLegoLang.g:2413:3: ( (lv_left_2_0= ruleExpression ) )
            // InternalLegoLang.g:2414:4: (lv_left_2_0= ruleExpression )
            {
            // InternalLegoLang.g:2414:4: (lv_left_2_0= ruleExpression )
            // InternalLegoLang.g:2415:5: lv_left_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOrAccess().getLeftExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_26);
            lv_left_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getOrRule());
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

            // InternalLegoLang.g:2432:3: (otherlv_3= 'or' ( (lv_right_4_0= ruleExpression ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==43) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalLegoLang.g:2433:4: otherlv_3= 'or' ( (lv_right_4_0= ruleExpression ) )
                    {
                    otherlv_3=(Token)match(input,43,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getOrAccess().getOrKeyword_3_0());
                      			
                    }
                    // InternalLegoLang.g:2437:4: ( (lv_right_4_0= ruleExpression ) )
                    // InternalLegoLang.g:2438:5: (lv_right_4_0= ruleExpression )
                    {
                    // InternalLegoLang.g:2438:5: (lv_right_4_0= ruleExpression )
                    // InternalLegoLang.g:2439:6: lv_right_4_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getOrAccess().getRightExpressionParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_12);
                    lv_right_4_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getOrRule());
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
                    break;

            }

            otherlv_5=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getOrAccess().getRightParenthesisKeyword_4());
              		
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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleConditionEtat"
    // InternalLegoLang.g:2465:1: entryRuleConditionEtat returns [EObject current=null] : iv_ruleConditionEtat= ruleConditionEtat EOF ;
    public final EObject entryRuleConditionEtat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionEtat = null;


        try {
            // InternalLegoLang.g:2465:54: (iv_ruleConditionEtat= ruleConditionEtat EOF )
            // InternalLegoLang.g:2466:2: iv_ruleConditionEtat= ruleConditionEtat EOF
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
    // InternalLegoLang.g:2472:1: ruleConditionEtat returns [EObject current=null] : (otherlv_0= 'if' ( (lv_Condition_1_0= ruleBooleanExpression ) ) otherlv_2= '{' ( (lv_then_3_0= ruleStatement ) )* otherlv_4= '}' (otherlv_5= 'else{' ( (lv_else_6_0= ruleStatement ) ) otherlv_7= '}' )? ) ;
    public final EObject ruleConditionEtat() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_Condition_1_0 = null;

        EObject lv_then_3_0 = null;

        EObject lv_else_6_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:2478:2: ( (otherlv_0= 'if' ( (lv_Condition_1_0= ruleBooleanExpression ) ) otherlv_2= '{' ( (lv_then_3_0= ruleStatement ) )* otherlv_4= '}' (otherlv_5= 'else{' ( (lv_else_6_0= ruleStatement ) ) otherlv_7= '}' )? ) )
            // InternalLegoLang.g:2479:2: (otherlv_0= 'if' ( (lv_Condition_1_0= ruleBooleanExpression ) ) otherlv_2= '{' ( (lv_then_3_0= ruleStatement ) )* otherlv_4= '}' (otherlv_5= 'else{' ( (lv_else_6_0= ruleStatement ) ) otherlv_7= '}' )? )
            {
            // InternalLegoLang.g:2479:2: (otherlv_0= 'if' ( (lv_Condition_1_0= ruleBooleanExpression ) ) otherlv_2= '{' ( (lv_then_3_0= ruleStatement ) )* otherlv_4= '}' (otherlv_5= 'else{' ( (lv_else_6_0= ruleStatement ) ) otherlv_7= '}' )? )
            // InternalLegoLang.g:2480:3: otherlv_0= 'if' ( (lv_Condition_1_0= ruleBooleanExpression ) ) otherlv_2= '{' ( (lv_then_3_0= ruleStatement ) )* otherlv_4= '}' (otherlv_5= 'else{' ( (lv_else_6_0= ruleStatement ) ) otherlv_7= '}' )?
            {
            otherlv_0=(Token)match(input,44,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConditionEtatAccess().getIfKeyword_0());
              		
            }
            // InternalLegoLang.g:2484:3: ( (lv_Condition_1_0= ruleBooleanExpression ) )
            // InternalLegoLang.g:2485:4: (lv_Condition_1_0= ruleBooleanExpression )
            {
            // InternalLegoLang.g:2485:4: (lv_Condition_1_0= ruleBooleanExpression )
            // InternalLegoLang.g:2486:5: lv_Condition_1_0= ruleBooleanExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConditionEtatAccess().getConditionBooleanExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_Condition_1_0=ruleBooleanExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConditionEtatRule());
              					}
              					set(
              						current,
              						"Condition",
              						lv_Condition_1_0,
              						"langageCompilation.concrete.syntax.LegoLang.BooleanExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getConditionEtatAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalLegoLang.g:2507:3: ( (lv_then_3_0= ruleStatement ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_ID && LA17_0<=RULE_INT)||LA17_0==15||(LA17_0>=17 && LA17_0<=25)||LA17_0==27||LA17_0==30||(LA17_0>=34 && LA17_0<=35)||LA17_0==44||(LA17_0>=46 && LA17_0<=47)||LA17_0==49||(LA17_0>=61 && LA17_0<=65)||(LA17_0>=67 && LA17_0<=70)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalLegoLang.g:2508:4: (lv_then_3_0= ruleStatement )
            	    {
            	    // InternalLegoLang.g:2508:4: (lv_then_3_0= ruleStatement )
            	    // InternalLegoLang.g:2509:5: lv_then_3_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getConditionEtatAccess().getThenStatementParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_9);
            	    lv_then_3_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getConditionEtatRule());
            	      					}
            	      					add(
            	      						current,
            	      						"then",
            	      						lv_then_3_0,
            	      						"langageCompilation.concrete.syntax.LegoLang.Statement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getConditionEtatAccess().getRightCurlyBracketKeyword_4());
              		
            }
            // InternalLegoLang.g:2530:3: (otherlv_5= 'else{' ( (lv_else_6_0= ruleStatement ) ) otherlv_7= '}' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==45) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalLegoLang.g:2531:4: otherlv_5= 'else{' ( (lv_else_6_0= ruleStatement ) ) otherlv_7= '}'
                    {
                    otherlv_5=(Token)match(input,45,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getConditionEtatAccess().getElseKeyword_5_0());
                      			
                    }
                    // InternalLegoLang.g:2535:4: ( (lv_else_6_0= ruleStatement ) )
                    // InternalLegoLang.g:2536:5: (lv_else_6_0= ruleStatement )
                    {
                    // InternalLegoLang.g:2536:5: (lv_else_6_0= ruleStatement )
                    // InternalLegoLang.g:2537:6: lv_else_6_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConditionEtatAccess().getElseStatementParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_6);
                    lv_else_6_0=ruleStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getConditionEtatRule());
                      						}
                      						add(
                      							current,
                      							"else",
                      							lv_else_6_0,
                      							"langageCompilation.concrete.syntax.LegoLang.Statement");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getConditionEtatAccess().getRightCurlyBracketKeyword_5_2());
                      			
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
    // InternalLegoLang.g:2563:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalLegoLang.g:2563:47: (iv_ruleEString= ruleEString EOF )
            // InternalLegoLang.g:2564:2: iv_ruleEString= ruleEString EOF
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
    // InternalLegoLang.g:2570:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FQN_0= ruleFQN | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_1=null;
        AntlrDatatypeRuleToken this_FQN_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:2576:2: ( (this_FQN_0= ruleFQN | this_ID_1= RULE_ID ) )
            // InternalLegoLang.g:2577:2: (this_FQN_0= ruleFQN | this_ID_1= RULE_ID )
            {
            // InternalLegoLang.g:2577:2: (this_FQN_0= ruleFQN | this_ID_1= RULE_ID )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                int LA19_1 = input.LA(2);

                if ( (synpred57_InternalLegoLang()) ) {
                    alt19=1;
                }
                else if ( (true) ) {
                    alt19=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalLegoLang.g:2578:3: this_FQN_0= ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEStringAccess().getFQNParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FQN_0=ruleFQN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_FQN_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalLegoLang.g:2589:3: this_ID_1= RULE_ID
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
    // InternalLegoLang.g:2600:1: entryRuleWhileLoop returns [EObject current=null] : iv_ruleWhileLoop= ruleWhileLoop EOF ;
    public final EObject entryRuleWhileLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileLoop = null;


        try {
            // InternalLegoLang.g:2600:50: (iv_ruleWhileLoop= ruleWhileLoop EOF )
            // InternalLegoLang.g:2601:2: iv_ruleWhileLoop= ruleWhileLoop EOF
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
    // InternalLegoLang.g:2607:1: ruleWhileLoop returns [EObject current=null] : (otherlv_0= 'while' ( (lv_LoopCondition_1_0= ruleBooleanExpression ) ) otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= '}' ) ;
    public final EObject ruleWhileLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_LoopCondition_1_0 = null;

        EObject lv_statement_3_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:2613:2: ( (otherlv_0= 'while' ( (lv_LoopCondition_1_0= ruleBooleanExpression ) ) otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= '}' ) )
            // InternalLegoLang.g:2614:2: (otherlv_0= 'while' ( (lv_LoopCondition_1_0= ruleBooleanExpression ) ) otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= '}' )
            {
            // InternalLegoLang.g:2614:2: (otherlv_0= 'while' ( (lv_LoopCondition_1_0= ruleBooleanExpression ) ) otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= '}' )
            // InternalLegoLang.g:2615:3: otherlv_0= 'while' ( (lv_LoopCondition_1_0= ruleBooleanExpression ) ) otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWhileLoopAccess().getWhileKeyword_0());
              		
            }
            // InternalLegoLang.g:2619:3: ( (lv_LoopCondition_1_0= ruleBooleanExpression ) )
            // InternalLegoLang.g:2620:4: (lv_LoopCondition_1_0= ruleBooleanExpression )
            {
            // InternalLegoLang.g:2620:4: (lv_LoopCondition_1_0= ruleBooleanExpression )
            // InternalLegoLang.g:2621:5: lv_LoopCondition_1_0= ruleBooleanExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWhileLoopAccess().getLoopConditionBooleanExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_LoopCondition_1_0=ruleBooleanExpression();

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
              						"langageCompilation.concrete.syntax.LegoLang.BooleanExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getWhileLoopAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalLegoLang.g:2642:3: ( (lv_statement_3_0= ruleStatement ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=RULE_ID && LA20_0<=RULE_INT)||LA20_0==15||(LA20_0>=17 && LA20_0<=25)||LA20_0==27||LA20_0==30||(LA20_0>=34 && LA20_0<=35)||LA20_0==44||(LA20_0>=46 && LA20_0<=47)||LA20_0==49||(LA20_0>=61 && LA20_0<=65)||(LA20_0>=67 && LA20_0<=70)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalLegoLang.g:2643:4: (lv_statement_3_0= ruleStatement )
            	    {
            	    // InternalLegoLang.g:2643:4: (lv_statement_3_0= ruleStatement )
            	    // InternalLegoLang.g:2644:5: lv_statement_3_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getWhileLoopAccess().getStatementStatementParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_9);
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
            	    break loop20;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
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
    // InternalLegoLang.g:2669:1: entryRuleMethodePrint returns [EObject current=null] : iv_ruleMethodePrint= ruleMethodePrint EOF ;
    public final EObject entryRuleMethodePrint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodePrint = null;


        try {
            // InternalLegoLang.g:2669:53: (iv_ruleMethodePrint= ruleMethodePrint EOF )
            // InternalLegoLang.g:2670:2: iv_ruleMethodePrint= ruleMethodePrint EOF
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
    // InternalLegoLang.g:2676:1: ruleMethodePrint returns [EObject current=null] : ( () otherlv_1= 'print(' ( ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ',' )+ otherlv_4= ')' ) ;
    public final EObject ruleMethodePrint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:2682:2: ( ( () otherlv_1= 'print(' ( ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ',' )+ otherlv_4= ')' ) )
            // InternalLegoLang.g:2683:2: ( () otherlv_1= 'print(' ( ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ',' )+ otherlv_4= ')' )
            {
            // InternalLegoLang.g:2683:2: ( () otherlv_1= 'print(' ( ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ',' )+ otherlv_4= ')' )
            // InternalLegoLang.g:2684:3: () otherlv_1= 'print(' ( ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ',' )+ otherlv_4= ')'
            {
            // InternalLegoLang.g:2684:3: ()
            // InternalLegoLang.g:2685:4: 
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

            otherlv_1=(Token)match(input,47,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMethodePrintAccess().getPrintKeyword_1());
              		
            }
            // InternalLegoLang.g:2698:3: ( ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ',' )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=RULE_ID && LA21_0<=RULE_INT)||LA21_0==25||LA21_0==27||LA21_0==30||LA21_0==34||LA21_0==49||(LA21_0>=61 && LA21_0<=62)||(LA21_0>=69 && LA21_0<=70)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalLegoLang.g:2699:4: ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ','
            	    {
            	    // InternalLegoLang.g:2699:4: ( (lv_expression_2_0= ruleExpression ) )
            	    // InternalLegoLang.g:2700:5: (lv_expression_2_0= ruleExpression )
            	    {
            	    // InternalLegoLang.g:2700:5: (lv_expression_2_0= ruleExpression )
            	    // InternalLegoLang.g:2701:6: lv_expression_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMethodePrintAccess().getExpressionExpressionParserRuleCall_2_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_29);
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

            	    otherlv_3=(Token)match(input,48,FOLLOW_30); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getMethodePrintAccess().getCommaKeyword_2_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);

            otherlv_4=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getMethodePrintAccess().getRightParenthesisKeyword_3());
              		
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
    // InternalLegoLang.g:2731:1: entryRuleVariableRef returns [EObject current=null] : iv_ruleVariableRef= ruleVariableRef EOF ;
    public final EObject entryRuleVariableRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableRef = null;


        try {
            // InternalLegoLang.g:2731:52: (iv_ruleVariableRef= ruleVariableRef EOF )
            // InternalLegoLang.g:2732:2: iv_ruleVariableRef= ruleVariableRef EOF
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
    // InternalLegoLang.g:2738:1: ruleVariableRef returns [EObject current=null] : ( ( ruleEString ) ) ;
    public final EObject ruleVariableRef() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalLegoLang.g:2744:2: ( ( ( ruleEString ) ) )
            // InternalLegoLang.g:2745:2: ( ( ruleEString ) )
            {
            // InternalLegoLang.g:2745:2: ( ( ruleEString ) )
            // InternalLegoLang.g:2746:3: ( ruleEString )
            {
            // InternalLegoLang.g:2746:3: ( ruleEString )
            // InternalLegoLang.g:2747:4: ruleEString
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
    // InternalLegoLang.g:2767:1: entryRuleSubstraction returns [EObject current=null] : iv_ruleSubstraction= ruleSubstraction EOF ;
    public final EObject entryRuleSubstraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubstraction = null;


        try {
            // InternalLegoLang.g:2767:53: (iv_ruleSubstraction= ruleSubstraction EOF )
            // InternalLegoLang.g:2768:2: iv_ruleSubstraction= ruleSubstraction EOF
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
    // InternalLegoLang.g:2774:1: ruleSubstraction returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '-' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleSubstraction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:2780:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '-' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalLegoLang.g:2781:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '-' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalLegoLang.g:2781:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '-' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalLegoLang.g:2782:3: otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '-' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSubstractionAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalLegoLang.g:2786:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalLegoLang.g:2787:4: (lv_left_1_0= ruleExpression )
            {
            // InternalLegoLang.g:2787:4: (lv_left_1_0= ruleExpression )
            // InternalLegoLang.g:2788:5: lv_left_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSubstractionAccess().getLeftExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_31);
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

            otherlv_2=(Token)match(input,49,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getSubstractionAccess().getHyphenMinusKeyword_2());
              		
            }
            // InternalLegoLang.g:2809:3: ( (lv_right_3_0= ruleExpression ) )
            // InternalLegoLang.g:2810:4: (lv_right_3_0= ruleExpression )
            {
            // InternalLegoLang.g:2810:4: (lv_right_3_0= ruleExpression )
            // InternalLegoLang.g:2811:5: lv_right_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSubstractionAccess().getRightExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_12);
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

            otherlv_4=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
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
    // InternalLegoLang.g:2836:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // InternalLegoLang.g:2836:49: (iv_ruleAddition= ruleAddition EOF )
            // InternalLegoLang.g:2837:2: iv_ruleAddition= ruleAddition EOF
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
    // InternalLegoLang.g:2843:1: ruleAddition returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '+' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:2849:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '+' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalLegoLang.g:2850:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '+' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalLegoLang.g:2850:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '+' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalLegoLang.g:2851:3: otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '+' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAdditionAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalLegoLang.g:2855:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalLegoLang.g:2856:4: (lv_left_1_0= ruleExpression )
            {
            // InternalLegoLang.g:2856:4: (lv_left_1_0= ruleExpression )
            // InternalLegoLang.g:2857:5: lv_left_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAdditionAccess().getLeftExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_32);
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

            otherlv_2=(Token)match(input,50,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getAdditionAccess().getPlusSignKeyword_2());
              		
            }
            // InternalLegoLang.g:2878:3: ( (lv_right_3_0= ruleExpression ) )
            // InternalLegoLang.g:2879:4: (lv_right_3_0= ruleExpression )
            {
            // InternalLegoLang.g:2879:4: (lv_right_3_0= ruleExpression )
            // InternalLegoLang.g:2880:5: lv_right_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAdditionAccess().getRightExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_12);
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

            otherlv_4=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
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
    // InternalLegoLang.g:2905:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // InternalLegoLang.g:2905:55: (iv_ruleMultiplication= ruleMultiplication EOF )
            // InternalLegoLang.g:2906:2: iv_ruleMultiplication= ruleMultiplication EOF
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
    // InternalLegoLang.g:2912:1: ruleMultiplication returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '*' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:2918:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '*' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalLegoLang.g:2919:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '*' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalLegoLang.g:2919:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '*' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalLegoLang.g:2920:3: otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '*' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMultiplicationAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalLegoLang.g:2924:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalLegoLang.g:2925:4: (lv_left_1_0= ruleExpression )
            {
            // InternalLegoLang.g:2925:4: (lv_left_1_0= ruleExpression )
            // InternalLegoLang.g:2926:5: lv_left_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMultiplicationAccess().getLeftExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_33);
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

            otherlv_2=(Token)match(input,51,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getMultiplicationAccess().getAsteriskKeyword_2());
              		
            }
            // InternalLegoLang.g:2947:3: ( (lv_right_3_0= ruleExpression ) )
            // InternalLegoLang.g:2948:4: (lv_right_3_0= ruleExpression )
            {
            // InternalLegoLang.g:2948:4: (lv_right_3_0= ruleExpression )
            // InternalLegoLang.g:2949:5: lv_right_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMultiplicationAccess().getRightExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_12);
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

            otherlv_4=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
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
    // InternalLegoLang.g:2974:1: entryRuleDivision returns [EObject current=null] : iv_ruleDivision= ruleDivision EOF ;
    public final EObject entryRuleDivision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivision = null;


        try {
            // InternalLegoLang.g:2974:49: (iv_ruleDivision= ruleDivision EOF )
            // InternalLegoLang.g:2975:2: iv_ruleDivision= ruleDivision EOF
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
    // InternalLegoLang.g:2981:1: ruleDivision returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '/' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleDivision() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:2987:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '/' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalLegoLang.g:2988:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '/' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalLegoLang.g:2988:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '/' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalLegoLang.g:2989:3: otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '/' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDivisionAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalLegoLang.g:2993:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalLegoLang.g:2994:4: (lv_left_1_0= ruleExpression )
            {
            // InternalLegoLang.g:2994:4: (lv_left_1_0= ruleExpression )
            // InternalLegoLang.g:2995:5: lv_left_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDivisionAccess().getLeftExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_34);
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

            otherlv_2=(Token)match(input,52,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDivisionAccess().getSolidusKeyword_2());
              		
            }
            // InternalLegoLang.g:3016:3: ( (lv_right_3_0= ruleExpression ) )
            // InternalLegoLang.g:3017:4: (lv_right_3_0= ruleExpression )
            {
            // InternalLegoLang.g:3017:4: (lv_right_3_0= ruleExpression )
            // InternalLegoLang.g:3018:5: lv_right_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDivisionAccess().getRightExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_12);
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

            otherlv_4=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
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
    // InternalLegoLang.g:3043:1: entryRuleGT returns [EObject current=null] : iv_ruleGT= ruleGT EOF ;
    public final EObject entryRuleGT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGT = null;


        try {
            // InternalLegoLang.g:3043:43: (iv_ruleGT= ruleGT EOF )
            // InternalLegoLang.g:3044:2: iv_ruleGT= ruleGT EOF
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
    // InternalLegoLang.g:3050:1: ruleGT returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '>' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleGT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:3056:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '>' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalLegoLang.g:3057:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '>' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalLegoLang.g:3057:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '>' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalLegoLang.g:3058:3: otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '>' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGTAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalLegoLang.g:3062:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalLegoLang.g:3063:4: (lv_left_1_0= ruleExpression )
            {
            // InternalLegoLang.g:3063:4: (lv_left_1_0= ruleExpression )
            // InternalLegoLang.g:3064:5: lv_left_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGTAccess().getLeftExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_35);
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

            otherlv_2=(Token)match(input,53,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGTAccess().getGreaterThanSignKeyword_2());
              		
            }
            // InternalLegoLang.g:3085:3: ( (lv_right_3_0= ruleExpression ) )
            // InternalLegoLang.g:3086:4: (lv_right_3_0= ruleExpression )
            {
            // InternalLegoLang.g:3086:4: (lv_right_3_0= ruleExpression )
            // InternalLegoLang.g:3087:5: lv_right_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGTAccess().getRightExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_12);
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

            otherlv_4=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
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
    // InternalLegoLang.g:3112:1: entryRuleLT returns [EObject current=null] : iv_ruleLT= ruleLT EOF ;
    public final EObject entryRuleLT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLT = null;


        try {
            // InternalLegoLang.g:3112:43: (iv_ruleLT= ruleLT EOF )
            // InternalLegoLang.g:3113:2: iv_ruleLT= ruleLT EOF
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
    // InternalLegoLang.g:3119:1: ruleLT returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '<' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleLT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:3125:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '<' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalLegoLang.g:3126:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '<' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalLegoLang.g:3126:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '<' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalLegoLang.g:3127:3: otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '<' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLTAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalLegoLang.g:3131:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalLegoLang.g:3132:4: (lv_left_1_0= ruleExpression )
            {
            // InternalLegoLang.g:3132:4: (lv_left_1_0= ruleExpression )
            // InternalLegoLang.g:3133:5: lv_left_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLTAccess().getLeftExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_36);
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

            otherlv_2=(Token)match(input,54,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getLTAccess().getLessThanSignKeyword_2());
              		
            }
            // InternalLegoLang.g:3154:3: ( (lv_right_3_0= ruleExpression ) )
            // InternalLegoLang.g:3155:4: (lv_right_3_0= ruleExpression )
            {
            // InternalLegoLang.g:3155:4: (lv_right_3_0= ruleExpression )
            // InternalLegoLang.g:3156:5: lv_right_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLTAccess().getRightExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_12);
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

            otherlv_4=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
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
    // InternalLegoLang.g:3181:1: entryRuleEqual returns [EObject current=null] : iv_ruleEqual= ruleEqual EOF ;
    public final EObject entryRuleEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqual = null;


        try {
            // InternalLegoLang.g:3181:46: (iv_ruleEqual= ruleEqual EOF )
            // InternalLegoLang.g:3182:2: iv_ruleEqual= ruleEqual EOF
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
    // InternalLegoLang.g:3188:1: ruleEqual returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '==' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:3194:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '==' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalLegoLang.g:3195:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '==' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalLegoLang.g:3195:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '==' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalLegoLang.g:3196:3: otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '==' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEqualAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalLegoLang.g:3200:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalLegoLang.g:3201:4: (lv_left_1_0= ruleExpression )
            {
            // InternalLegoLang.g:3201:4: (lv_left_1_0= ruleExpression )
            // InternalLegoLang.g:3202:5: lv_left_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEqualAccess().getLeftExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_37);
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

            otherlv_2=(Token)match(input,55,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getEqualAccess().getEqualsSignEqualsSignKeyword_2());
              		
            }
            // InternalLegoLang.g:3223:3: ( (lv_right_3_0= ruleExpression ) )
            // InternalLegoLang.g:3224:4: (lv_right_3_0= ruleExpression )
            {
            // InternalLegoLang.g:3224:4: (lv_right_3_0= ruleExpression )
            // InternalLegoLang.g:3225:5: lv_right_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEqualAccess().getRightExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_12);
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

            otherlv_4=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
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
    // InternalLegoLang.g:3250:1: entryRuleDifferent returns [EObject current=null] : iv_ruleDifferent= ruleDifferent EOF ;
    public final EObject entryRuleDifferent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDifferent = null;


        try {
            // InternalLegoLang.g:3250:50: (iv_ruleDifferent= ruleDifferent EOF )
            // InternalLegoLang.g:3251:2: iv_ruleDifferent= ruleDifferent EOF
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
    // InternalLegoLang.g:3257:1: ruleDifferent returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '!=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleDifferent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:3263:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '!=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalLegoLang.g:3264:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '!=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalLegoLang.g:3264:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '!=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalLegoLang.g:3265:3: otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '!=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDifferentAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalLegoLang.g:3269:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalLegoLang.g:3270:4: (lv_left_1_0= ruleExpression )
            {
            // InternalLegoLang.g:3270:4: (lv_left_1_0= ruleExpression )
            // InternalLegoLang.g:3271:5: lv_left_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDifferentAccess().getLeftExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_38);
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

            otherlv_2=(Token)match(input,56,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDifferentAccess().getExclamationMarkEqualsSignKeyword_2());
              		
            }
            // InternalLegoLang.g:3292:3: ( (lv_right_3_0= ruleExpression ) )
            // InternalLegoLang.g:3293:4: (lv_right_3_0= ruleExpression )
            {
            // InternalLegoLang.g:3293:4: (lv_right_3_0= ruleExpression )
            // InternalLegoLang.g:3294:5: lv_right_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDifferentAccess().getRightExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_12);
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

            otherlv_4=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
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
    // InternalLegoLang.g:3319:1: entryRuleLTorEqual returns [EObject current=null] : iv_ruleLTorEqual= ruleLTorEqual EOF ;
    public final EObject entryRuleLTorEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLTorEqual = null;


        try {
            // InternalLegoLang.g:3319:50: (iv_ruleLTorEqual= ruleLTorEqual EOF )
            // InternalLegoLang.g:3320:2: iv_ruleLTorEqual= ruleLTorEqual EOF
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
    // InternalLegoLang.g:3326:1: ruleLTorEqual returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '<=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleLTorEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:3332:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '<=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalLegoLang.g:3333:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '<=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalLegoLang.g:3333:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '<=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalLegoLang.g:3334:3: otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '<=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLTorEqualAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalLegoLang.g:3338:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalLegoLang.g:3339:4: (lv_left_1_0= ruleExpression )
            {
            // InternalLegoLang.g:3339:4: (lv_left_1_0= ruleExpression )
            // InternalLegoLang.g:3340:5: lv_left_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLTorEqualAccess().getLeftExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_39);
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

            otherlv_2=(Token)match(input,57,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getLTorEqualAccess().getLessThanSignEqualsSignKeyword_2());
              		
            }
            // InternalLegoLang.g:3361:3: ( (lv_right_3_0= ruleExpression ) )
            // InternalLegoLang.g:3362:4: (lv_right_3_0= ruleExpression )
            {
            // InternalLegoLang.g:3362:4: (lv_right_3_0= ruleExpression )
            // InternalLegoLang.g:3363:5: lv_right_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLTorEqualAccess().getRightExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_12);
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

            otherlv_4=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
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
    // InternalLegoLang.g:3388:1: entryRuleGTorEqual returns [EObject current=null] : iv_ruleGTorEqual= ruleGTorEqual EOF ;
    public final EObject entryRuleGTorEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGTorEqual = null;


        try {
            // InternalLegoLang.g:3388:50: (iv_ruleGTorEqual= ruleGTorEqual EOF )
            // InternalLegoLang.g:3389:2: iv_ruleGTorEqual= ruleGTorEqual EOF
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
    // InternalLegoLang.g:3395:1: ruleGTorEqual returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '>=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleGTorEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:3401:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '>=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalLegoLang.g:3402:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '>=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalLegoLang.g:3402:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '>=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalLegoLang.g:3403:3: otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '>=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGTorEqualAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalLegoLang.g:3407:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalLegoLang.g:3408:4: (lv_left_1_0= ruleExpression )
            {
            // InternalLegoLang.g:3408:4: (lv_left_1_0= ruleExpression )
            // InternalLegoLang.g:3409:5: lv_left_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGTorEqualAccess().getLeftExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_40);
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

            otherlv_2=(Token)match(input,58,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGTorEqualAccess().getGreaterThanSignEqualsSignKeyword_2());
              		
            }
            // InternalLegoLang.g:3430:3: ( (lv_right_3_0= ruleExpression ) )
            // InternalLegoLang.g:3431:4: (lv_right_3_0= ruleExpression )
            {
            // InternalLegoLang.g:3431:4: (lv_right_3_0= ruleExpression )
            // InternalLegoLang.g:3432:5: lv_right_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGTorEqualAccess().getRightExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_12);
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

            otherlv_4=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
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
    // InternalLegoLang.g:3457:1: entryRuleAssignement returns [EObject current=null] : iv_ruleAssignement= ruleAssignement EOF ;
    public final EObject entryRuleAssignement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignement = null;


        try {
            // InternalLegoLang.g:3457:52: (iv_ruleAssignement= ruleAssignement EOF )
            // InternalLegoLang.g:3458:2: iv_ruleAssignement= ruleAssignement EOF
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
    // InternalLegoLang.g:3464:1: ruleAssignement returns [EObject current=null] : ( () otherlv_1= 'set' ( (lv_left_2_0= ruleExpression ) ) otherlv_3= '=' ( (lv_right_4_0= ruleExpression ) ) ) ;
    public final EObject ruleAssignement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_left_2_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:3470:2: ( ( () otherlv_1= 'set' ( (lv_left_2_0= ruleExpression ) ) otherlv_3= '=' ( (lv_right_4_0= ruleExpression ) ) ) )
            // InternalLegoLang.g:3471:2: ( () otherlv_1= 'set' ( (lv_left_2_0= ruleExpression ) ) otherlv_3= '=' ( (lv_right_4_0= ruleExpression ) ) )
            {
            // InternalLegoLang.g:3471:2: ( () otherlv_1= 'set' ( (lv_left_2_0= ruleExpression ) ) otherlv_3= '=' ( (lv_right_4_0= ruleExpression ) ) )
            // InternalLegoLang.g:3472:3: () otherlv_1= 'set' ( (lv_left_2_0= ruleExpression ) ) otherlv_3= '=' ( (lv_right_4_0= ruleExpression ) )
            {
            // InternalLegoLang.g:3472:3: ()
            // InternalLegoLang.g:3473:4: 
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

            otherlv_1=(Token)match(input,25,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAssignementAccess().getSetKeyword_1());
              		
            }
            // InternalLegoLang.g:3486:3: ( (lv_left_2_0= ruleExpression ) )
            // InternalLegoLang.g:3487:4: (lv_left_2_0= ruleExpression )
            {
            // InternalLegoLang.g:3487:4: (lv_left_2_0= ruleExpression )
            // InternalLegoLang.g:3488:5: lv_left_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAssignementAccess().getLeftExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_13);
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

            otherlv_3=(Token)match(input,29,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getAssignementAccess().getEqualsSignKeyword_3());
              		
            }
            // InternalLegoLang.g:3509:3: ( (lv_right_4_0= ruleExpression ) )
            // InternalLegoLang.g:3510:4: (lv_right_4_0= ruleExpression )
            {
            // InternalLegoLang.g:3510:4: (lv_right_4_0= ruleExpression )
            // InternalLegoLang.g:3511:5: lv_right_4_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAssignementAccess().getRightExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_2);
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
    // InternalLegoLang.g:3532:1: entryRulePlusEqual returns [EObject current=null] : iv_rulePlusEqual= rulePlusEqual EOF ;
    public final EObject entryRulePlusEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusEqual = null;


        try {
            // InternalLegoLang.g:3532:50: (iv_rulePlusEqual= rulePlusEqual EOF )
            // InternalLegoLang.g:3533:2: iv_rulePlusEqual= rulePlusEqual EOF
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
    // InternalLegoLang.g:3539:1: rulePlusEqual returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_left_2_0= ruleExpression ) ) otherlv_3= '+=' ( (lv_right_4_0= ruleExpression ) ) otherlv_5= ')' ) ;
    public final EObject rulePlusEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_left_2_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:3545:2: ( ( () otherlv_1= '(' ( (lv_left_2_0= ruleExpression ) ) otherlv_3= '+=' ( (lv_right_4_0= ruleExpression ) ) otherlv_5= ')' ) )
            // InternalLegoLang.g:3546:2: ( () otherlv_1= '(' ( (lv_left_2_0= ruleExpression ) ) otherlv_3= '+=' ( (lv_right_4_0= ruleExpression ) ) otherlv_5= ')' )
            {
            // InternalLegoLang.g:3546:2: ( () otherlv_1= '(' ( (lv_left_2_0= ruleExpression ) ) otherlv_3= '+=' ( (lv_right_4_0= ruleExpression ) ) otherlv_5= ')' )
            // InternalLegoLang.g:3547:3: () otherlv_1= '(' ( (lv_left_2_0= ruleExpression ) ) otherlv_3= '+=' ( (lv_right_4_0= ruleExpression ) ) otherlv_5= ')'
            {
            // InternalLegoLang.g:3547:3: ()
            // InternalLegoLang.g:3548:4: 
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

            otherlv_1=(Token)match(input,27,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPlusEqualAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalLegoLang.g:3561:3: ( (lv_left_2_0= ruleExpression ) )
            // InternalLegoLang.g:3562:4: (lv_left_2_0= ruleExpression )
            {
            // InternalLegoLang.g:3562:4: (lv_left_2_0= ruleExpression )
            // InternalLegoLang.g:3563:5: lv_left_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPlusEqualAccess().getLeftExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_41);
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

            otherlv_3=(Token)match(input,59,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getPlusEqualAccess().getPlusSignEqualsSignKeyword_3());
              		
            }
            // InternalLegoLang.g:3584:3: ( (lv_right_4_0= ruleExpression ) )
            // InternalLegoLang.g:3585:4: (lv_right_4_0= ruleExpression )
            {
            // InternalLegoLang.g:3585:4: (lv_right_4_0= ruleExpression )
            // InternalLegoLang.g:3586:5: lv_right_4_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPlusEqualAccess().getRightExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_12);
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

            otherlv_5=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getPlusEqualAccess().getRightParenthesisKeyword_5());
              		
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
    // InternalLegoLang.g:3611:1: entryRuleMinusEqual returns [EObject current=null] : iv_ruleMinusEqual= ruleMinusEqual EOF ;
    public final EObject entryRuleMinusEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinusEqual = null;


        try {
            // InternalLegoLang.g:3611:51: (iv_ruleMinusEqual= ruleMinusEqual EOF )
            // InternalLegoLang.g:3612:2: iv_ruleMinusEqual= ruleMinusEqual EOF
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
    // InternalLegoLang.g:3618:1: ruleMinusEqual returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_left_2_0= ruleExpression ) ) otherlv_3= '-=' ( (lv_right_4_0= ruleExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleMinusEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_left_2_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:3624:2: ( ( () otherlv_1= '(' ( (lv_left_2_0= ruleExpression ) ) otherlv_3= '-=' ( (lv_right_4_0= ruleExpression ) ) otherlv_5= ')' ) )
            // InternalLegoLang.g:3625:2: ( () otherlv_1= '(' ( (lv_left_2_0= ruleExpression ) ) otherlv_3= '-=' ( (lv_right_4_0= ruleExpression ) ) otherlv_5= ')' )
            {
            // InternalLegoLang.g:3625:2: ( () otherlv_1= '(' ( (lv_left_2_0= ruleExpression ) ) otherlv_3= '-=' ( (lv_right_4_0= ruleExpression ) ) otherlv_5= ')' )
            // InternalLegoLang.g:3626:3: () otherlv_1= '(' ( (lv_left_2_0= ruleExpression ) ) otherlv_3= '-=' ( (lv_right_4_0= ruleExpression ) ) otherlv_5= ')'
            {
            // InternalLegoLang.g:3626:3: ()
            // InternalLegoLang.g:3627:4: 
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

            otherlv_1=(Token)match(input,27,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMinusEqualAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalLegoLang.g:3640:3: ( (lv_left_2_0= ruleExpression ) )
            // InternalLegoLang.g:3641:4: (lv_left_2_0= ruleExpression )
            {
            // InternalLegoLang.g:3641:4: (lv_left_2_0= ruleExpression )
            // InternalLegoLang.g:3642:5: lv_left_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMinusEqualAccess().getLeftExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_42);
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

            otherlv_3=(Token)match(input,60,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getMinusEqualAccess().getHyphenMinusEqualsSignKeyword_3());
              		
            }
            // InternalLegoLang.g:3663:3: ( (lv_right_4_0= ruleExpression ) )
            // InternalLegoLang.g:3664:4: (lv_right_4_0= ruleExpression )
            {
            // InternalLegoLang.g:3664:4: (lv_right_4_0= ruleExpression )
            // InternalLegoLang.g:3665:5: lv_right_4_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMinusEqualAccess().getRightExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_12);
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

            otherlv_5=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getMinusEqualAccess().getRightParenthesisKeyword_5());
              		
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
    // InternalLegoLang.g:3690:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalLegoLang.g:3690:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalLegoLang.g:3691:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalLegoLang.g:3697:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLegoLang.g:3703:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalLegoLang.g:3704:2: (kw= 'true' | kw= 'false' )
            {
            // InternalLegoLang.g:3704:2: (kw= 'true' | kw= 'false' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==61) ) {
                alt22=1;
            }
            else if ( (LA22_0==62) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalLegoLang.g:3705:3: kw= 'true'
                    {
                    kw=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalLegoLang.g:3711:3: kw= 'false'
                    {
                    kw=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
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
    // InternalLegoLang.g:3720:1: entryRuleUnInteger returns [EObject current=null] : iv_ruleUnInteger= ruleUnInteger EOF ;
    public final EObject entryRuleUnInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnInteger = null;


        try {
            // InternalLegoLang.g:3720:50: (iv_ruleUnInteger= ruleUnInteger EOF )
            // InternalLegoLang.g:3721:2: iv_ruleUnInteger= ruleUnInteger EOF
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
    // InternalLegoLang.g:3727:1: ruleUnInteger returns [EObject current=null] : ( () ( (lv_isConst_1_0= 'const' ) )? otherlv_2= 'int' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '=' ( (lv_initialeValue_5_0= ruleEInt ) ) )? ) ;
    public final EObject ruleUnInteger() throws RecognitionException {
        EObject current = null;

        Token lv_isConst_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_initialeValue_5_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:3733:2: ( ( () ( (lv_isConst_1_0= 'const' ) )? otherlv_2= 'int' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '=' ( (lv_initialeValue_5_0= ruleEInt ) ) )? ) )
            // InternalLegoLang.g:3734:2: ( () ( (lv_isConst_1_0= 'const' ) )? otherlv_2= 'int' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '=' ( (lv_initialeValue_5_0= ruleEInt ) ) )? )
            {
            // InternalLegoLang.g:3734:2: ( () ( (lv_isConst_1_0= 'const' ) )? otherlv_2= 'int' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '=' ( (lv_initialeValue_5_0= ruleEInt ) ) )? )
            // InternalLegoLang.g:3735:3: () ( (lv_isConst_1_0= 'const' ) )? otherlv_2= 'int' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '=' ( (lv_initialeValue_5_0= ruleEInt ) ) )?
            {
            // InternalLegoLang.g:3735:3: ()
            // InternalLegoLang.g:3736:4: 
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

            // InternalLegoLang.g:3745:3: ( (lv_isConst_1_0= 'const' ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==63) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalLegoLang.g:3746:4: (lv_isConst_1_0= 'const' )
                    {
                    // InternalLegoLang.g:3746:4: (lv_isConst_1_0= 'const' )
                    // InternalLegoLang.g:3747:5: lv_isConst_1_0= 'const'
                    {
                    lv_isConst_1_0=(Token)match(input,63,FOLLOW_43); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,64,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getUnIntegerAccess().getIntKeyword_2());
              		
            }
            // InternalLegoLang.g:3763:3: ( (lv_name_3_0= ruleEString ) )
            // InternalLegoLang.g:3764:4: (lv_name_3_0= ruleEString )
            {
            // InternalLegoLang.g:3764:4: (lv_name_3_0= ruleEString )
            // InternalLegoLang.g:3765:5: lv_name_3_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getUnIntegerAccess().getNameEStringParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_44);
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

            // InternalLegoLang.g:3782:3: (otherlv_4= '=' ( (lv_initialeValue_5_0= ruleEInt ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==29) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalLegoLang.g:3783:4: otherlv_4= '=' ( (lv_initialeValue_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getUnIntegerAccess().getEqualsSignKeyword_4_0());
                      			
                    }
                    // InternalLegoLang.g:3787:4: ( (lv_initialeValue_5_0= ruleEInt ) )
                    // InternalLegoLang.g:3788:5: (lv_initialeValue_5_0= ruleEInt )
                    {
                    // InternalLegoLang.g:3788:5: (lv_initialeValue_5_0= ruleEInt )
                    // InternalLegoLang.g:3789:6: lv_initialeValue_5_0= ruleEInt
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getUnIntegerAccess().getInitialeValueEIntParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
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
    // InternalLegoLang.g:3811:1: entryRuleUnDouble returns [EObject current=null] : iv_ruleUnDouble= ruleUnDouble EOF ;
    public final EObject entryRuleUnDouble() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnDouble = null;


        try {
            // InternalLegoLang.g:3811:49: (iv_ruleUnDouble= ruleUnDouble EOF )
            // InternalLegoLang.g:3812:2: iv_ruleUnDouble= ruleUnDouble EOF
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
    // InternalLegoLang.g:3818:1: ruleUnDouble returns [EObject current=null] : ( () ( (lv_isConst_1_0= 'const' ) )? otherlv_2= 'double' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '=' ( (lv_initialeValue1_5_0= ruleEInt ) ) otherlv_6= '.' ( (lv_initialeValue2_7_0= ruleEInt ) ) )? ) ;
    public final EObject ruleUnDouble() throws RecognitionException {
        EObject current = null;

        Token lv_isConst_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_initialeValue1_5_0 = null;

        AntlrDatatypeRuleToken lv_initialeValue2_7_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:3824:2: ( ( () ( (lv_isConst_1_0= 'const' ) )? otherlv_2= 'double' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '=' ( (lv_initialeValue1_5_0= ruleEInt ) ) otherlv_6= '.' ( (lv_initialeValue2_7_0= ruleEInt ) ) )? ) )
            // InternalLegoLang.g:3825:2: ( () ( (lv_isConst_1_0= 'const' ) )? otherlv_2= 'double' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '=' ( (lv_initialeValue1_5_0= ruleEInt ) ) otherlv_6= '.' ( (lv_initialeValue2_7_0= ruleEInt ) ) )? )
            {
            // InternalLegoLang.g:3825:2: ( () ( (lv_isConst_1_0= 'const' ) )? otherlv_2= 'double' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '=' ( (lv_initialeValue1_5_0= ruleEInt ) ) otherlv_6= '.' ( (lv_initialeValue2_7_0= ruleEInt ) ) )? )
            // InternalLegoLang.g:3826:3: () ( (lv_isConst_1_0= 'const' ) )? otherlv_2= 'double' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '=' ( (lv_initialeValue1_5_0= ruleEInt ) ) otherlv_6= '.' ( (lv_initialeValue2_7_0= ruleEInt ) ) )?
            {
            // InternalLegoLang.g:3826:3: ()
            // InternalLegoLang.g:3827:4: 
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

            // InternalLegoLang.g:3836:3: ( (lv_isConst_1_0= 'const' ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==63) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalLegoLang.g:3837:4: (lv_isConst_1_0= 'const' )
                    {
                    // InternalLegoLang.g:3837:4: (lv_isConst_1_0= 'const' )
                    // InternalLegoLang.g:3838:5: lv_isConst_1_0= 'const'
                    {
                    lv_isConst_1_0=(Token)match(input,63,FOLLOW_45); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,65,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getUnDoubleAccess().getDoubleKeyword_2());
              		
            }
            // InternalLegoLang.g:3854:3: ( (lv_name_3_0= ruleEString ) )
            // InternalLegoLang.g:3855:4: (lv_name_3_0= ruleEString )
            {
            // InternalLegoLang.g:3855:4: (lv_name_3_0= ruleEString )
            // InternalLegoLang.g:3856:5: lv_name_3_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getUnDoubleAccess().getNameEStringParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_44);
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

            // InternalLegoLang.g:3873:3: (otherlv_4= '=' ( (lv_initialeValue1_5_0= ruleEInt ) ) otherlv_6= '.' ( (lv_initialeValue2_7_0= ruleEInt ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==29) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalLegoLang.g:3874:4: otherlv_4= '=' ( (lv_initialeValue1_5_0= ruleEInt ) ) otherlv_6= '.' ( (lv_initialeValue2_7_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getUnDoubleAccess().getEqualsSignKeyword_4_0());
                      			
                    }
                    // InternalLegoLang.g:3878:4: ( (lv_initialeValue1_5_0= ruleEInt ) )
                    // InternalLegoLang.g:3879:5: (lv_initialeValue1_5_0= ruleEInt )
                    {
                    // InternalLegoLang.g:3879:5: (lv_initialeValue1_5_0= ruleEInt )
                    // InternalLegoLang.g:3880:6: lv_initialeValue1_5_0= ruleEInt
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getUnDoubleAccess().getInitialeValue1EIntParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_46);
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

                    otherlv_6=(Token)match(input,66,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getUnDoubleAccess().getFullStopKeyword_4_2());
                      			
                    }
                    // InternalLegoLang.g:3901:4: ( (lv_initialeValue2_7_0= ruleEInt ) )
                    // InternalLegoLang.g:3902:5: (lv_initialeValue2_7_0= ruleEInt )
                    {
                    // InternalLegoLang.g:3902:5: (lv_initialeValue2_7_0= ruleEInt )
                    // InternalLegoLang.g:3903:6: lv_initialeValue2_7_0= ruleEInt
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getUnDoubleAccess().getInitialeValue2EIntParserRuleCall_4_3_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
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
    // InternalLegoLang.g:3925:1: entryRuleUnBoolean returns [EObject current=null] : iv_ruleUnBoolean= ruleUnBoolean EOF ;
    public final EObject entryRuleUnBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnBoolean = null;


        try {
            // InternalLegoLang.g:3925:50: (iv_ruleUnBoolean= ruleUnBoolean EOF )
            // InternalLegoLang.g:3926:2: iv_ruleUnBoolean= ruleUnBoolean EOF
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
    // InternalLegoLang.g:3932:1: ruleUnBoolean returns [EObject current=null] : ( () ( (lv_isConst_1_0= 'const' ) )? otherlv_2= 'bool' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '=' ( (lv_initialeValue_5_0= ruleEBoolean ) ) )? ) ;
    public final EObject ruleUnBoolean() throws RecognitionException {
        EObject current = null;

        Token lv_isConst_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_initialeValue_5_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:3938:2: ( ( () ( (lv_isConst_1_0= 'const' ) )? otherlv_2= 'bool' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '=' ( (lv_initialeValue_5_0= ruleEBoolean ) ) )? ) )
            // InternalLegoLang.g:3939:2: ( () ( (lv_isConst_1_0= 'const' ) )? otherlv_2= 'bool' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '=' ( (lv_initialeValue_5_0= ruleEBoolean ) ) )? )
            {
            // InternalLegoLang.g:3939:2: ( () ( (lv_isConst_1_0= 'const' ) )? otherlv_2= 'bool' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '=' ( (lv_initialeValue_5_0= ruleEBoolean ) ) )? )
            // InternalLegoLang.g:3940:3: () ( (lv_isConst_1_0= 'const' ) )? otherlv_2= 'bool' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '=' ( (lv_initialeValue_5_0= ruleEBoolean ) ) )?
            {
            // InternalLegoLang.g:3940:3: ()
            // InternalLegoLang.g:3941:4: 
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

            // InternalLegoLang.g:3950:3: ( (lv_isConst_1_0= 'const' ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==63) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalLegoLang.g:3951:4: (lv_isConst_1_0= 'const' )
                    {
                    // InternalLegoLang.g:3951:4: (lv_isConst_1_0= 'const' )
                    // InternalLegoLang.g:3952:5: lv_isConst_1_0= 'const'
                    {
                    lv_isConst_1_0=(Token)match(input,63,FOLLOW_47); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,67,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getUnBooleanAccess().getBoolKeyword_2());
              		
            }
            // InternalLegoLang.g:3968:3: ( (lv_name_3_0= ruleEString ) )
            // InternalLegoLang.g:3969:4: (lv_name_3_0= ruleEString )
            {
            // InternalLegoLang.g:3969:4: (lv_name_3_0= ruleEString )
            // InternalLegoLang.g:3970:5: lv_name_3_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getUnBooleanAccess().getNameEStringParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_44);
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

            // InternalLegoLang.g:3987:3: (otherlv_4= '=' ( (lv_initialeValue_5_0= ruleEBoolean ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==29) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalLegoLang.g:3988:4: otherlv_4= '=' ( (lv_initialeValue_5_0= ruleEBoolean ) )
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_48); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getUnBooleanAccess().getEqualsSignKeyword_4_0());
                      			
                    }
                    // InternalLegoLang.g:3992:4: ( (lv_initialeValue_5_0= ruleEBoolean ) )
                    // InternalLegoLang.g:3993:5: (lv_initialeValue_5_0= ruleEBoolean )
                    {
                    // InternalLegoLang.g:3993:5: (lv_initialeValue_5_0= ruleEBoolean )
                    // InternalLegoLang.g:3994:6: lv_initialeValue_5_0= ruleEBoolean
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getUnBooleanAccess().getInitialeValueEBooleanParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
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
    // InternalLegoLang.g:4016:1: entryRuleUnString returns [EObject current=null] : iv_ruleUnString= ruleUnString EOF ;
    public final EObject entryRuleUnString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnString = null;


        try {
            // InternalLegoLang.g:4016:49: (iv_ruleUnString= ruleUnString EOF )
            // InternalLegoLang.g:4017:2: iv_ruleUnString= ruleUnString EOF
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
    // InternalLegoLang.g:4023:1: ruleUnString returns [EObject current=null] : ( () ( (lv_isConst_1_0= 'const' ) )? otherlv_2= 'string' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '=' ( (lv_initialeValue_5_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleUnString() throws RecognitionException {
        EObject current = null;

        Token lv_isConst_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_initialeValue_5_0=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:4029:2: ( ( () ( (lv_isConst_1_0= 'const' ) )? otherlv_2= 'string' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '=' ( (lv_initialeValue_5_0= RULE_STRING ) ) )? ) )
            // InternalLegoLang.g:4030:2: ( () ( (lv_isConst_1_0= 'const' ) )? otherlv_2= 'string' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '=' ( (lv_initialeValue_5_0= RULE_STRING ) ) )? )
            {
            // InternalLegoLang.g:4030:2: ( () ( (lv_isConst_1_0= 'const' ) )? otherlv_2= 'string' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '=' ( (lv_initialeValue_5_0= RULE_STRING ) ) )? )
            // InternalLegoLang.g:4031:3: () ( (lv_isConst_1_0= 'const' ) )? otherlv_2= 'string' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '=' ( (lv_initialeValue_5_0= RULE_STRING ) ) )?
            {
            // InternalLegoLang.g:4031:3: ()
            // InternalLegoLang.g:4032:4: 
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

            // InternalLegoLang.g:4041:3: ( (lv_isConst_1_0= 'const' ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==63) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalLegoLang.g:4042:4: (lv_isConst_1_0= 'const' )
                    {
                    // InternalLegoLang.g:4042:4: (lv_isConst_1_0= 'const' )
                    // InternalLegoLang.g:4043:5: lv_isConst_1_0= 'const'
                    {
                    lv_isConst_1_0=(Token)match(input,63,FOLLOW_49); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,68,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getUnStringAccess().getStringKeyword_2());
              		
            }
            // InternalLegoLang.g:4059:3: ( (lv_name_3_0= ruleEString ) )
            // InternalLegoLang.g:4060:4: (lv_name_3_0= ruleEString )
            {
            // InternalLegoLang.g:4060:4: (lv_name_3_0= ruleEString )
            // InternalLegoLang.g:4061:5: lv_name_3_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getUnStringAccess().getNameEStringParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_44);
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

            // InternalLegoLang.g:4078:3: (otherlv_4= '=' ( (lv_initialeValue_5_0= RULE_STRING ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==29) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalLegoLang.g:4079:4: otherlv_4= '=' ( (lv_initialeValue_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_50); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getUnStringAccess().getEqualsSignKeyword_4_0());
                      			
                    }
                    // InternalLegoLang.g:4083:4: ( (lv_initialeValue_5_0= RULE_STRING ) )
                    // InternalLegoLang.g:4084:5: (lv_initialeValue_5_0= RULE_STRING )
                    {
                    // InternalLegoLang.g:4084:5: (lv_initialeValue_5_0= RULE_STRING )
                    // InternalLegoLang.g:4085:6: lv_initialeValue_5_0= RULE_STRING
                    {
                    lv_initialeValue_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_initialeValue_5_0, grammarAccess.getUnStringAccess().getInitialeValueSTRINGTerminalRuleCall_4_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getUnStringRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"initialeValue",
                      							lv_initialeValue_5_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


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
    // $ANTLR end "ruleUnString"


    // $ANTLR start "entryRuleUnColor"
    // InternalLegoLang.g:4106:1: entryRuleUnColor returns [EObject current=null] : iv_ruleUnColor= ruleUnColor EOF ;
    public final EObject entryRuleUnColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnColor = null;


        try {
            // InternalLegoLang.g:4106:48: (iv_ruleUnColor= ruleUnColor EOF )
            // InternalLegoLang.g:4107:2: iv_ruleUnColor= ruleUnColor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnColorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnColor=ruleUnColor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnColor; 
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
    // $ANTLR end "entryRuleUnColor"


    // $ANTLR start "ruleUnColor"
    // InternalLegoLang.g:4113:1: ruleUnColor returns [EObject current=null] : ( () ( (lv_isConst_1_0= 'const' ) )? otherlv_2= 'color' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '=' ( (lv_initialValue_5_0= ruleColors ) ) )? ) ;
    public final EObject ruleUnColor() throws RecognitionException {
        EObject current = null;

        Token lv_isConst_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        Enumerator lv_initialValue_5_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:4119:2: ( ( () ( (lv_isConst_1_0= 'const' ) )? otherlv_2= 'color' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '=' ( (lv_initialValue_5_0= ruleColors ) ) )? ) )
            // InternalLegoLang.g:4120:2: ( () ( (lv_isConst_1_0= 'const' ) )? otherlv_2= 'color' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '=' ( (lv_initialValue_5_0= ruleColors ) ) )? )
            {
            // InternalLegoLang.g:4120:2: ( () ( (lv_isConst_1_0= 'const' ) )? otherlv_2= 'color' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '=' ( (lv_initialValue_5_0= ruleColors ) ) )? )
            // InternalLegoLang.g:4121:3: () ( (lv_isConst_1_0= 'const' ) )? otherlv_2= 'color' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '=' ( (lv_initialValue_5_0= ruleColors ) ) )?
            {
            // InternalLegoLang.g:4121:3: ()
            // InternalLegoLang.g:4122:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getUnColorAccess().getUnColorAction_0(),
              					current);
              			
            }

            }

            // InternalLegoLang.g:4131:3: ( (lv_isConst_1_0= 'const' ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==63) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalLegoLang.g:4132:4: (lv_isConst_1_0= 'const' )
                    {
                    // InternalLegoLang.g:4132:4: (lv_isConst_1_0= 'const' )
                    // InternalLegoLang.g:4133:5: lv_isConst_1_0= 'const'
                    {
                    lv_isConst_1_0=(Token)match(input,63,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isConst_1_0, grammarAccess.getUnColorAccess().getIsConstConstKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getUnColorRule());
                      					}
                      					setWithLastConsumed(current, "isConst", lv_isConst_1_0 != null, "const");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,35,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getUnColorAccess().getColorKeyword_2());
              		
            }
            // InternalLegoLang.g:4149:3: ( (lv_name_3_0= ruleEString ) )
            // InternalLegoLang.g:4150:4: (lv_name_3_0= ruleEString )
            {
            // InternalLegoLang.g:4150:4: (lv_name_3_0= ruleEString )
            // InternalLegoLang.g:4151:5: lv_name_3_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getUnColorAccess().getNameEStringParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_44);
            lv_name_3_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getUnColorRule());
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

            // InternalLegoLang.g:4168:3: (otherlv_4= '=' ( (lv_initialValue_5_0= ruleColors ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==29) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalLegoLang.g:4169:4: otherlv_4= '=' ( (lv_initialValue_5_0= ruleColors ) )
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_51); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getUnColorAccess().getEqualsSignKeyword_4_0());
                      			
                    }
                    // InternalLegoLang.g:4173:4: ( (lv_initialValue_5_0= ruleColors ) )
                    // InternalLegoLang.g:4174:5: (lv_initialValue_5_0= ruleColors )
                    {
                    // InternalLegoLang.g:4174:5: (lv_initialValue_5_0= ruleColors )
                    // InternalLegoLang.g:4175:6: lv_initialValue_5_0= ruleColors
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getUnColorAccess().getInitialValueColorsEnumRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_initialValue_5_0=ruleColors();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getUnColorRule());
                      						}
                      						set(
                      							current,
                      							"initialValue",
                      							lv_initialValue_5_0,
                      							"langageCompilation.concrete.syntax.LegoLang.Colors");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


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
    // $ANTLR end "ruleUnColor"


    // $ANTLR start "entryRuleTheDouble"
    // InternalLegoLang.g:4197:1: entryRuleTheDouble returns [EObject current=null] : iv_ruleTheDouble= ruleTheDouble EOF ;
    public final EObject entryRuleTheDouble() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTheDouble = null;


        try {
            // InternalLegoLang.g:4197:50: (iv_ruleTheDouble= ruleTheDouble EOF )
            // InternalLegoLang.g:4198:2: iv_ruleTheDouble= ruleTheDouble EOF
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
    // InternalLegoLang.g:4204:1: ruleTheDouble returns [EObject current=null] : ( () ( (lv_value1_1_0= ruleEInt ) ) otherlv_2= '.' ( (lv_value2_3_0= ruleEInt ) ) ) ;
    public final EObject ruleTheDouble() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_value1_1_0 = null;

        AntlrDatatypeRuleToken lv_value2_3_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:4210:2: ( ( () ( (lv_value1_1_0= ruleEInt ) ) otherlv_2= '.' ( (lv_value2_3_0= ruleEInt ) ) ) )
            // InternalLegoLang.g:4211:2: ( () ( (lv_value1_1_0= ruleEInt ) ) otherlv_2= '.' ( (lv_value2_3_0= ruleEInt ) ) )
            {
            // InternalLegoLang.g:4211:2: ( () ( (lv_value1_1_0= ruleEInt ) ) otherlv_2= '.' ( (lv_value2_3_0= ruleEInt ) ) )
            // InternalLegoLang.g:4212:3: () ( (lv_value1_1_0= ruleEInt ) ) otherlv_2= '.' ( (lv_value2_3_0= ruleEInt ) )
            {
            // InternalLegoLang.g:4212:3: ()
            // InternalLegoLang.g:4213:4: 
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

            // InternalLegoLang.g:4222:3: ( (lv_value1_1_0= ruleEInt ) )
            // InternalLegoLang.g:4223:4: (lv_value1_1_0= ruleEInt )
            {
            // InternalLegoLang.g:4223:4: (lv_value1_1_0= ruleEInt )
            // InternalLegoLang.g:4224:5: lv_value1_1_0= ruleEInt
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTheDoubleAccess().getValue1EIntParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_46);
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

            otherlv_2=(Token)match(input,66,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTheDoubleAccess().getFullStopKeyword_2());
              		
            }
            // InternalLegoLang.g:4245:3: ( (lv_value2_3_0= ruleEInt ) )
            // InternalLegoLang.g:4246:4: (lv_value2_3_0= ruleEInt )
            {
            // InternalLegoLang.g:4246:4: (lv_value2_3_0= ruleEInt )
            // InternalLegoLang.g:4247:5: lv_value2_3_0= ruleEInt
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
    // InternalLegoLang.g:4268:1: entryRuleTheInt returns [EObject current=null] : iv_ruleTheInt= ruleTheInt EOF ;
    public final EObject entryRuleTheInt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTheInt = null;


        try {
            // InternalLegoLang.g:4268:47: (iv_ruleTheInt= ruleTheInt EOF )
            // InternalLegoLang.g:4269:2: iv_ruleTheInt= ruleTheInt EOF
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
    // InternalLegoLang.g:4275:1: ruleTheInt returns [EObject current=null] : ( () ( (lv_value_1_0= ruleEInt ) ) ) ;
    public final EObject ruleTheInt() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:4281:2: ( ( () ( (lv_value_1_0= ruleEInt ) ) ) )
            // InternalLegoLang.g:4282:2: ( () ( (lv_value_1_0= ruleEInt ) ) )
            {
            // InternalLegoLang.g:4282:2: ( () ( (lv_value_1_0= ruleEInt ) ) )
            // InternalLegoLang.g:4283:3: () ( (lv_value_1_0= ruleEInt ) )
            {
            // InternalLegoLang.g:4283:3: ()
            // InternalLegoLang.g:4284:4: 
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

            // InternalLegoLang.g:4293:3: ( (lv_value_1_0= ruleEInt ) )
            // InternalLegoLang.g:4294:4: (lv_value_1_0= ruleEInt )
            {
            // InternalLegoLang.g:4294:4: (lv_value_1_0= ruleEInt )
            // InternalLegoLang.g:4295:5: lv_value_1_0= ruleEInt
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
    // InternalLegoLang.g:4316:1: entryRuleTheBoolean returns [EObject current=null] : iv_ruleTheBoolean= ruleTheBoolean EOF ;
    public final EObject entryRuleTheBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTheBoolean = null;


        try {
            // InternalLegoLang.g:4316:51: (iv_ruleTheBoolean= ruleTheBoolean EOF )
            // InternalLegoLang.g:4317:2: iv_ruleTheBoolean= ruleTheBoolean EOF
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
    // InternalLegoLang.g:4323:1: ruleTheBoolean returns [EObject current=null] : ( () ( (lv_value_1_0= ruleEBoolean ) ) ) ;
    public final EObject ruleTheBoolean() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:4329:2: ( ( () ( (lv_value_1_0= ruleEBoolean ) ) ) )
            // InternalLegoLang.g:4330:2: ( () ( (lv_value_1_0= ruleEBoolean ) ) )
            {
            // InternalLegoLang.g:4330:2: ( () ( (lv_value_1_0= ruleEBoolean ) ) )
            // InternalLegoLang.g:4331:3: () ( (lv_value_1_0= ruleEBoolean ) )
            {
            // InternalLegoLang.g:4331:3: ()
            // InternalLegoLang.g:4332:4: 
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

            // InternalLegoLang.g:4341:3: ( (lv_value_1_0= ruleEBoolean ) )
            // InternalLegoLang.g:4342:4: (lv_value_1_0= ruleEBoolean )
            {
            // InternalLegoLang.g:4342:4: (lv_value_1_0= ruleEBoolean )
            // InternalLegoLang.g:4343:5: lv_value_1_0= ruleEBoolean
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
    // InternalLegoLang.g:4364:1: entryRuleTheString returns [EObject current=null] : iv_ruleTheString= ruleTheString EOF ;
    public final EObject entryRuleTheString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTheString = null;


        try {
            // InternalLegoLang.g:4364:50: (iv_ruleTheString= ruleTheString EOF )
            // InternalLegoLang.g:4365:2: iv_ruleTheString= ruleTheString EOF
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
    // InternalLegoLang.g:4371:1: ruleTheString returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleTheString() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalLegoLang.g:4377:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalLegoLang.g:4378:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalLegoLang.g:4378:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalLegoLang.g:4379:3: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // InternalLegoLang.g:4379:3: ()
            // InternalLegoLang.g:4380:4: 
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

            // InternalLegoLang.g:4389:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalLegoLang.g:4390:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalLegoLang.g:4390:4: (lv_value_1_0= RULE_STRING )
            // InternalLegoLang.g:4391:5: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_value_1_0, grammarAccess.getTheStringAccess().getValueSTRINGTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTheStringRule());
              					}
              					setWithLastConsumed(
              						current,
              						"value",
              						lv_value_1_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
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


    // $ANTLR start "entryRuleTheColor"
    // InternalLegoLang.g:4411:1: entryRuleTheColor returns [EObject current=null] : iv_ruleTheColor= ruleTheColor EOF ;
    public final EObject entryRuleTheColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTheColor = null;


        try {
            // InternalLegoLang.g:4411:49: (iv_ruleTheColor= ruleTheColor EOF )
            // InternalLegoLang.g:4412:2: iv_ruleTheColor= ruleTheColor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTheColorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTheColor=ruleTheColor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTheColor; 
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
    // $ANTLR end "entryRuleTheColor"


    // $ANTLR start "ruleTheColor"
    // InternalLegoLang.g:4418:1: ruleTheColor returns [EObject current=null] : ( () ( (lv_value_1_0= ruleColors ) ) ) ;
    public final EObject ruleTheColor() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:4424:2: ( ( () ( (lv_value_1_0= ruleColors ) ) ) )
            // InternalLegoLang.g:4425:2: ( () ( (lv_value_1_0= ruleColors ) ) )
            {
            // InternalLegoLang.g:4425:2: ( () ( (lv_value_1_0= ruleColors ) ) )
            // InternalLegoLang.g:4426:3: () ( (lv_value_1_0= ruleColors ) )
            {
            // InternalLegoLang.g:4426:3: ()
            // InternalLegoLang.g:4427:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getTheColorAccess().getTheColorAction_0(),
              					current);
              			
            }

            }

            // InternalLegoLang.g:4436:3: ( (lv_value_1_0= ruleColors ) )
            // InternalLegoLang.g:4437:4: (lv_value_1_0= ruleColors )
            {
            // InternalLegoLang.g:4437:4: (lv_value_1_0= ruleColors )
            // InternalLegoLang.g:4438:5: lv_value_1_0= ruleColors
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTheColorAccess().getValueColorsEnumRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleColors();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTheColorRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_1_0,
              						"langageCompilation.concrete.syntax.LegoLang.Colors");
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
    // $ANTLR end "ruleTheColor"


    // $ANTLR start "entryRuleFQN"
    // InternalLegoLang.g:4459:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalLegoLang.g:4459:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalLegoLang.g:4460:2: iv_ruleFQN= ruleFQN EOF
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
    // InternalLegoLang.g:4466:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalLegoLang.g:4472:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalLegoLang.g:4473:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalLegoLang.g:4473:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalLegoLang.g:4474:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_52); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalLegoLang.g:4481:3: (kw= '.' this_ID_2= RULE_ID )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==66) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalLegoLang.g:4482:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,66,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_52); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalLegoLang.g:4499:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalLegoLang.g:4499:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalLegoLang.g:4500:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalLegoLang.g:4506:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalLegoLang.g:4512:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalLegoLang.g:4513:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalLegoLang.g:4513:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalLegoLang.g:4514:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalLegoLang.g:4514:3: (kw= '-' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==49) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalLegoLang.g:4515:4: kw= '-'
                    {
                    kw=(Token)match(input,49,FOLLOW_53); if (state.failed) return current;
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


    // $ANTLR start "ruleColors"
    // InternalLegoLang.g:4532:1: ruleColors returns [Enumerator current=null] : ( (enumLiteral_0= 'black' ) | (enumLiteral_1= 'white' ) ) ;
    public final Enumerator ruleColors() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalLegoLang.g:4538:2: ( ( (enumLiteral_0= 'black' ) | (enumLiteral_1= 'white' ) ) )
            // InternalLegoLang.g:4539:2: ( (enumLiteral_0= 'black' ) | (enumLiteral_1= 'white' ) )
            {
            // InternalLegoLang.g:4539:2: ( (enumLiteral_0= 'black' ) | (enumLiteral_1= 'white' ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==69) ) {
                alt35=1;
            }
            else if ( (LA35_0==70) ) {
                alt35=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalLegoLang.g:4540:3: (enumLiteral_0= 'black' )
                    {
                    // InternalLegoLang.g:4540:3: (enumLiteral_0= 'black' )
                    // InternalLegoLang.g:4541:4: enumLiteral_0= 'black'
                    {
                    enumLiteral_0=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getColorsAccess().getBlackEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getColorsAccess().getBlackEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalLegoLang.g:4548:3: (enumLiteral_1= 'white' )
                    {
                    // InternalLegoLang.g:4548:3: (enumLiteral_1= 'white' )
                    // InternalLegoLang.g:4549:4: enumLiteral_1= 'white'
                    {
                    enumLiteral_1=(Token)match(input,70,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getColorsAccess().getWhiteEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getColorsAccess().getWhiteEnumLiteralDeclaration_1());
                      			
                    }

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
    // $ANTLR end "ruleColors"

    // $ANTLR start synpred11_InternalLegoLang
    public final void synpred11_InternalLegoLang_fragment() throws RecognitionException {   
        EObject this_BinaryOperation_1 = null;


        // InternalLegoLang.g:297:3: (this_BinaryOperation_1= ruleBinaryOperation )
        // InternalLegoLang.g:297:3: this_BinaryOperation_1= ruleBinaryOperation
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_BinaryOperation_1=ruleBinaryOperation();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred11_InternalLegoLang

    // $ANTLR start synpred14_InternalLegoLang
    public final void synpred14_InternalLegoLang_fragment() throws RecognitionException {   
        EObject this_TheDouble_4 = null;


        // InternalLegoLang.g:333:3: (this_TheDouble_4= ruleTheDouble )
        // InternalLegoLang.g:333:3: this_TheDouble_4= ruleTheDouble
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_TheDouble_4=ruleTheDouble();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred14_InternalLegoLang

    // $ANTLR start synpred15_InternalLegoLang
    public final void synpred15_InternalLegoLang_fragment() throws RecognitionException {   
        EObject this_TheInt_5 = null;


        // InternalLegoLang.g:345:3: (this_TheInt_5= ruleTheInt )
        // InternalLegoLang.g:345:3: this_TheInt_5= ruleTheInt
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_TheInt_5=ruleTheInt();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred15_InternalLegoLang

    // $ANTLR start synpred17_InternalLegoLang
    public final void synpred17_InternalLegoLang_fragment() throws RecognitionException {   
        EObject this_EngineOperation_7 = null;


        // InternalLegoLang.g:369:3: (this_EngineOperation_7= ruleEngineOperation )
        // InternalLegoLang.g:369:3: this_EngineOperation_7= ruleEngineOperation
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_EngineOperation_7=ruleEngineOperation();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred17_InternalLegoLang

    // $ANTLR start synpred20_InternalLegoLang
    public final void synpred20_InternalLegoLang_fragment() throws RecognitionException {   
        EObject this_Substraction_0 = null;


        // InternalLegoLang.g:435:3: (this_Substraction_0= ruleSubstraction )
        // InternalLegoLang.g:435:3: this_Substraction_0= ruleSubstraction
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
    // $ANTLR end synpred20_InternalLegoLang

    // $ANTLR start synpred21_InternalLegoLang
    public final void synpred21_InternalLegoLang_fragment() throws RecognitionException {   
        EObject this_Comparaison_1 = null;


        // InternalLegoLang.g:447:3: (this_Comparaison_1= ruleComparaison )
        // InternalLegoLang.g:447:3: this_Comparaison_1= ruleComparaison
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
    // $ANTLR end synpred21_InternalLegoLang

    // $ANTLR start synpred23_InternalLegoLang
    public final void synpred23_InternalLegoLang_fragment() throws RecognitionException {   
        EObject this_Division_3 = null;


        // InternalLegoLang.g:471:3: (this_Division_3= ruleDivision )
        // InternalLegoLang.g:471:3: this_Division_3= ruleDivision
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
    // $ANTLR end synpred23_InternalLegoLang

    // $ANTLR start synpred24_InternalLegoLang
    public final void synpred24_InternalLegoLang_fragment() throws RecognitionException {   
        EObject this_Multiplication_4 = null;


        // InternalLegoLang.g:483:3: (this_Multiplication_4= ruleMultiplication )
        // InternalLegoLang.g:483:3: this_Multiplication_4= ruleMultiplication
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
    // $ANTLR end synpred24_InternalLegoLang

    // $ANTLR start synpred25_InternalLegoLang
    public final void synpred25_InternalLegoLang_fragment() throws RecognitionException {   
        EObject this_Addition_5 = null;


        // InternalLegoLang.g:495:3: (this_Addition_5= ruleAddition )
        // InternalLegoLang.g:495:3: this_Addition_5= ruleAddition
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
    // $ANTLR end synpred25_InternalLegoLang

    // $ANTLR start synpred26_InternalLegoLang
    public final void synpred26_InternalLegoLang_fragment() throws RecognitionException {   
        EObject this_MinusEqual_6 = null;


        // InternalLegoLang.g:507:3: (this_MinusEqual_6= ruleMinusEqual )
        // InternalLegoLang.g:507:3: this_MinusEqual_6= ruleMinusEqual
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
    // $ANTLR end synpred26_InternalLegoLang

    // $ANTLR start synpred31_InternalLegoLang
    public final void synpred31_InternalLegoLang_fragment() throws RecognitionException {   
        EObject this_GT_0 = null;


        // InternalLegoLang.g:627:3: (this_GT_0= ruleGT )
        // InternalLegoLang.g:627:3: this_GT_0= ruleGT
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
    // $ANTLR end synpred31_InternalLegoLang

    // $ANTLR start synpred32_InternalLegoLang
    public final void synpred32_InternalLegoLang_fragment() throws RecognitionException {   
        EObject this_Equal_1 = null;


        // InternalLegoLang.g:639:3: (this_Equal_1= ruleEqual )
        // InternalLegoLang.g:639:3: this_Equal_1= ruleEqual
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
    // $ANTLR end synpred32_InternalLegoLang

    // $ANTLR start synpred33_InternalLegoLang
    public final void synpred33_InternalLegoLang_fragment() throws RecognitionException {   
        EObject this_LT_2 = null;


        // InternalLegoLang.g:651:3: (this_LT_2= ruleLT )
        // InternalLegoLang.g:651:3: this_LT_2= ruleLT
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
    // $ANTLR end synpred33_InternalLegoLang

    // $ANTLR start synpred34_InternalLegoLang
    public final void synpred34_InternalLegoLang_fragment() throws RecognitionException {   
        EObject this_Different_3 = null;


        // InternalLegoLang.g:663:3: (this_Different_3= ruleDifferent )
        // InternalLegoLang.g:663:3: this_Different_3= ruleDifferent
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
    // $ANTLR end synpred34_InternalLegoLang

    // $ANTLR start synpred35_InternalLegoLang
    public final void synpred35_InternalLegoLang_fragment() throws RecognitionException {   
        EObject this_GTorEqual_4 = null;


        // InternalLegoLang.g:675:3: (this_GTorEqual_4= ruleGTorEqual )
        // InternalLegoLang.g:675:3: this_GTorEqual_4= ruleGTorEqual
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
    // $ANTLR end synpred35_InternalLegoLang

    // $ANTLR start synpred52_InternalLegoLang
    public final void synpred52_InternalLegoLang_fragment() throws RecognitionException {   
        EObject this_And_0 = null;


        // InternalLegoLang.g:2276:3: (this_And_0= ruleAnd )
        // InternalLegoLang.g:2276:3: this_And_0= ruleAnd
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_And_0=ruleAnd();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred52_InternalLegoLang

    // $ANTLR start synpred57_InternalLegoLang
    public final void synpred57_InternalLegoLang_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_FQN_0 = null;


        // InternalLegoLang.g:2578:3: (this_FQN_0= ruleFQN )
        // InternalLegoLang.g:2578:3: this_FQN_0= ruleFQN
        {
        if ( state.backtracking==0 ) {

          			newCompositeNode(grammarAccess.getEStringAccess().getFQNParserRuleCall_0());
          		
        }
        pushFollow(FOLLOW_2);
        this_FQN_0=ruleFQN();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred57_InternalLegoLang

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
    public final boolean synpred34_InternalLegoLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_InternalLegoLang_fragment(); // can never throw exception
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
    public final boolean synpred31_InternalLegoLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_InternalLegoLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred57_InternalLegoLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred57_InternalLegoLang_fragment(); // can never throw exception
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
    public final boolean synpred52_InternalLegoLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred52_InternalLegoLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_InternalLegoLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_InternalLegoLang_fragment(); // can never throw exception
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
    public final boolean synpred35_InternalLegoLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_InternalLegoLang_fragment(); // can never throw exception
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
    public final boolean synpred32_InternalLegoLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_InternalLegoLang_fragment(); // can never throw exception
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


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA5 dfa5 = new DFA5(this);
    static final String dfa_1s = "\22\uffff";
    static final String dfa_2s = "\1\4\1\uffff\2\0\3\uffff\2\0\11\uffff";
    static final String dfa_3s = "\1\106\1\uffff\2\0\3\uffff\2\0\11\uffff";
    static final String dfa_4s = "\1\uffff\1\1\2\uffff\1\3\1\4\3\uffff\1\7\1\uffff\1\11\1\12\1\2\1\13\1\10\1\5\1\6";
    static final String dfa_5s = "\2\uffff\1\0\1\1\3\uffff\1\2\1\3\11\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\4\1\10\22\uffff\1\3\1\uffff\1\2\2\uffff\1\13\3\uffff\1\14\16\uffff\1\7\13\uffff\2\11\6\uffff\2\5",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
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
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "284:2: (this_VariableRef_0= ruleVariableRef | this_BinaryOperation_1= ruleBinaryOperation | this_TheString_2= ruleTheString | this_TheColor_3= ruleTheColor | this_TheDouble_4= ruleTheDouble | this_TheInt_5= ruleTheInt | this_TheBoolean_6= ruleTheBoolean | this_EngineOperation_7= ruleEngineOperation | this_BreakMotor_8= ruleBreakMotor | this_SensorOperation_9= ruleSensorOperation | this_BooleanExpression_10= ruleBooleanExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA4_2 = input.LA(1);

                         
                        int index4_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalLegoLang()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index4_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA4_3 = input.LA(1);

                         
                        int index4_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalLegoLang()) ) {s = 13;}

                        else if ( (synpred17_InternalLegoLang()) ) {s = 15;}

                         
                        input.seek(index4_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA4_7 = input.LA(1);

                         
                        int index4_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalLegoLang()) ) {s = 16;}

                        else if ( (synpred15_InternalLegoLang()) ) {s = 17;}

                         
                        input.seek(index4_7);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA4_8 = input.LA(1);

                         
                        int index4_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalLegoLang()) ) {s = 16;}

                        else if ( (synpred15_InternalLegoLang()) ) {s = 17;}

                         
                        input.seek(index4_8);
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
    static final String dfa_7s = "\12\uffff";
    static final String dfa_8s = "\1\31\1\0\10\uffff";
    static final String dfa_9s = "\1\33\1\0\10\uffff";
    static final String dfa_10s = "\2\uffff\1\3\1\1\1\2\1\4\1\5\1\6\1\7\1\10";
    static final String dfa_11s = "\1\uffff\1\0\10\uffff}>";
    static final String[] dfa_12s = {
            "\1\2\1\uffff\1\1",
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
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "434:2: (this_Substraction_0= ruleSubstraction | this_Comparaison_1= ruleComparaison | this_Assignement_2= ruleAssignement | this_Division_3= ruleDivision | this_Multiplication_4= ruleMultiplication | this_Addition_5= ruleAddition | this_MinusEqual_6= ruleMinusEqual | this_PlusEqual_7= rulePlusEqual )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA5_1 = input.LA(1);

                         
                        int index5_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalLegoLang()) ) {s = 3;}

                        else if ( (synpred21_InternalLegoLang()) ) {s = 4;}

                        else if ( (synpred23_InternalLegoLang()) ) {s = 5;}

                        else if ( (synpred24_InternalLegoLang()) ) {s = 6;}

                        else if ( (synpred25_InternalLegoLang()) ) {s = 7;}

                        else if ( (synpred26_InternalLegoLang()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index5_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 5, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0xE002D00C4BFEE070L,0x000000000000007BL});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0002000000000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0xE002D00C4BFEC070L,0x000000000000007BL});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x600200044A000070L,0x0000000000000060L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000040010000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000080010000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0xE002D00C4BFE8070L,0x000000000000007BL});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x600200045A000070L,0x0000000000000060L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x6000000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000040L});

}