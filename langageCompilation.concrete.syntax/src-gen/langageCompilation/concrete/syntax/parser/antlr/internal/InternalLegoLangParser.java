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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Program'", "'{'", "'}'", "'if'", "'else{'", "'while'", "'print('", "');'", "'('", "'-'", "')'", "'+'", "'*'", "'/'", "'>'", "'<'", "'=='", "'!='", "'<='", "'>='", "'='", "'+='", "'-='", "'true'", "'false'", "'const'", "'int'", "';'", "'double'", "'.'", "'bool'", "'string'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__42=42;
    public static final int T__21=21;

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

                if ( ((LA1_0>=RULE_STRING && LA1_0<=RULE_INT)||LA1_0==14||(LA1_0>=16 && LA1_0<=17)||(LA1_0>=19 && LA1_0<=20)||(LA1_0>=34 && LA1_0<=37)||LA1_0==39||(LA1_0>=41 && LA1_0<=42)) ) {
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
    // InternalLegoLang.g:156:1: ruleStatement returns [EObject current=null] : (this_WhileLoop_0= ruleWhileLoop | this_Variable_1= ruleVariable | this_Expression_2= ruleExpression | this_ConditionEtat_3= ruleConditionEtat | this_MethodePrint_4= ruleMethodePrint ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_WhileLoop_0 = null;

        EObject this_Variable_1 = null;

        EObject this_Expression_2 = null;

        EObject this_ConditionEtat_3 = null;

        EObject this_MethodePrint_4 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:162:2: ( (this_WhileLoop_0= ruleWhileLoop | this_Variable_1= ruleVariable | this_Expression_2= ruleExpression | this_ConditionEtat_3= ruleConditionEtat | this_MethodePrint_4= ruleMethodePrint ) )
            // InternalLegoLang.g:163:2: (this_WhileLoop_0= ruleWhileLoop | this_Variable_1= ruleVariable | this_Expression_2= ruleExpression | this_ConditionEtat_3= ruleConditionEtat | this_MethodePrint_4= ruleMethodePrint )
            {
            // InternalLegoLang.g:163:2: (this_WhileLoop_0= ruleWhileLoop | this_Variable_1= ruleVariable | this_Expression_2= ruleExpression | this_ConditionEtat_3= ruleConditionEtat | this_MethodePrint_4= ruleMethodePrint )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt2=1;
                }
                break;
            case 36:
            case 37:
            case 39:
            case 41:
            case 42:
                {
                alt2=2;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
            case RULE_INT:
            case 19:
            case 20:
            case 34:
            case 35:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            case 17:
                {
                alt2=5;
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
    // InternalLegoLang.g:227:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalLegoLang.g:227:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalLegoLang.g:228:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalLegoLang.g:234:1: ruleExpression returns [EObject current=null] : (this_VariableRef_0= ruleVariableRef | this_BinaryOperation_1= ruleBinaryOperation | this_TheString_2= ruleTheString | this_TheDouble_3= ruleTheDouble | this_TheInt_4= ruleTheInt | this_TheBoolean_5= ruleTheBoolean ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_VariableRef_0 = null;

        EObject this_BinaryOperation_1 = null;

        EObject this_TheString_2 = null;

        EObject this_TheDouble_3 = null;

        EObject this_TheInt_4 = null;

        EObject this_TheBoolean_5 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:240:2: ( (this_VariableRef_0= ruleVariableRef | this_BinaryOperation_1= ruleBinaryOperation | this_TheString_2= ruleTheString | this_TheDouble_3= ruleTheDouble | this_TheInt_4= ruleTheInt | this_TheBoolean_5= ruleTheBoolean ) )
            // InternalLegoLang.g:241:2: (this_VariableRef_0= ruleVariableRef | this_BinaryOperation_1= ruleBinaryOperation | this_TheString_2= ruleTheString | this_TheDouble_3= ruleTheDouble | this_TheInt_4= ruleTheInt | this_TheBoolean_5= ruleTheBoolean )
            {
            // InternalLegoLang.g:241:2: (this_VariableRef_0= ruleVariableRef | this_BinaryOperation_1= ruleBinaryOperation | this_TheString_2= ruleTheString | this_TheDouble_3= ruleTheDouble | this_TheInt_4= ruleTheInt | this_TheBoolean_5= ruleTheBoolean )
            int alt3=6;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalLegoLang.g:242:3: this_VariableRef_0= ruleVariableRef
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
                    // InternalLegoLang.g:254:3: this_BinaryOperation_1= ruleBinaryOperation
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
                    // InternalLegoLang.g:266:3: this_TheString_2= ruleTheString
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
                    // InternalLegoLang.g:278:3: this_TheDouble_3= ruleTheDouble
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
                    // InternalLegoLang.g:290:3: this_TheInt_4= ruleTheInt
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
                    // InternalLegoLang.g:302:3: this_TheBoolean_5= ruleTheBoolean
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
    // InternalLegoLang.g:317:1: entryRuleBinaryOperation returns [EObject current=null] : iv_ruleBinaryOperation= ruleBinaryOperation EOF ;
    public final EObject entryRuleBinaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryOperation = null;


        try {
            // InternalLegoLang.g:317:56: (iv_ruleBinaryOperation= ruleBinaryOperation EOF )
            // InternalLegoLang.g:318:2: iv_ruleBinaryOperation= ruleBinaryOperation EOF
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
    // InternalLegoLang.g:324:1: ruleBinaryOperation returns [EObject current=null] : (this_Substraction_0= ruleSubstraction | this_Comparaison_1= ruleComparaison | this_Assignement_2= ruleAssignement | this_Division_3= ruleDivision | this_Multiplication_4= ruleMultiplication | this_Addition_5= ruleAddition | this_MinusEqual_6= ruleMinusEqual | this_PlusEqual_7= rulePlusEqual ) ;
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
            // InternalLegoLang.g:330:2: ( (this_Substraction_0= ruleSubstraction | this_Comparaison_1= ruleComparaison | this_Assignement_2= ruleAssignement | this_Division_3= ruleDivision | this_Multiplication_4= ruleMultiplication | this_Addition_5= ruleAddition | this_MinusEqual_6= ruleMinusEqual | this_PlusEqual_7= rulePlusEqual ) )
            // InternalLegoLang.g:331:2: (this_Substraction_0= ruleSubstraction | this_Comparaison_1= ruleComparaison | this_Assignement_2= ruleAssignement | this_Division_3= ruleDivision | this_Multiplication_4= ruleMultiplication | this_Addition_5= ruleAddition | this_MinusEqual_6= ruleMinusEqual | this_PlusEqual_7= rulePlusEqual )
            {
            // InternalLegoLang.g:331:2: (this_Substraction_0= ruleSubstraction | this_Comparaison_1= ruleComparaison | this_Assignement_2= ruleAssignement | this_Division_3= ruleDivision | this_Multiplication_4= ruleMultiplication | this_Addition_5= ruleAddition | this_MinusEqual_6= ruleMinusEqual | this_PlusEqual_7= rulePlusEqual )
            int alt4=8;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalLegoLang.g:332:3: this_Substraction_0= ruleSubstraction
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
                    // InternalLegoLang.g:344:3: this_Comparaison_1= ruleComparaison
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
                    // InternalLegoLang.g:356:3: this_Assignement_2= ruleAssignement
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
                    // InternalLegoLang.g:368:3: this_Division_3= ruleDivision
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
                    // InternalLegoLang.g:380:3: this_Multiplication_4= ruleMultiplication
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
                    // InternalLegoLang.g:392:3: this_Addition_5= ruleAddition
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
                    // InternalLegoLang.g:404:3: this_MinusEqual_6= ruleMinusEqual
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
                    // InternalLegoLang.g:416:3: this_PlusEqual_7= rulePlusEqual
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
    // InternalLegoLang.g:431:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalLegoLang.g:431:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalLegoLang.g:432:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalLegoLang.g:438:1: ruleVariable returns [EObject current=null] : (this_unInteger_0= ruleunInteger | this_unString_1= ruleunString | this_unBoolean_2= ruleunBoolean | this_unDouble_3= ruleunDouble ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        EObject this_unInteger_0 = null;

        EObject this_unString_1 = null;

        EObject this_unBoolean_2 = null;

        EObject this_unDouble_3 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:444:2: ( (this_unInteger_0= ruleunInteger | this_unString_1= ruleunString | this_unBoolean_2= ruleunBoolean | this_unDouble_3= ruleunDouble ) )
            // InternalLegoLang.g:445:2: (this_unInteger_0= ruleunInteger | this_unString_1= ruleunString | this_unBoolean_2= ruleunBoolean | this_unDouble_3= ruleunDouble )
            {
            // InternalLegoLang.g:445:2: (this_unInteger_0= ruleunInteger | this_unString_1= ruleunString | this_unBoolean_2= ruleunBoolean | this_unDouble_3= ruleunDouble )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 36:
                {
                switch ( input.LA(2) ) {
                case 39:
                    {
                    alt5=4;
                    }
                    break;
                case 37:
                    {
                    alt5=1;
                    }
                    break;
                case 41:
                    {
                    alt5=3;
                    }
                    break;
                case 42:
                    {
                    alt5=2;
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
            case 37:
                {
                alt5=1;
                }
                break;
            case 42:
                {
                alt5=2;
                }
                break;
            case 41:
                {
                alt5=3;
                }
                break;
            case 39:
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
                    // InternalLegoLang.g:446:3: this_unInteger_0= ruleunInteger
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getVariableAccess().getUnIntegerParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_unInteger_0=ruleunInteger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_unInteger_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalLegoLang.g:458:3: this_unString_1= ruleunString
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getVariableAccess().getUnStringParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_unString_1=ruleunString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_unString_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalLegoLang.g:470:3: this_unBoolean_2= ruleunBoolean
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getVariableAccess().getUnBooleanParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_unBoolean_2=ruleunBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_unBoolean_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalLegoLang.g:482:3: this_unDouble_3= ruleunDouble
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getVariableAccess().getUnDoubleParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_unDouble_3=ruleunDouble();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_unDouble_3;
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
    // InternalLegoLang.g:497:1: entryRuleComparaison returns [EObject current=null] : iv_ruleComparaison= ruleComparaison EOF ;
    public final EObject entryRuleComparaison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparaison = null;


        try {
            // InternalLegoLang.g:497:52: (iv_ruleComparaison= ruleComparaison EOF )
            // InternalLegoLang.g:498:2: iv_ruleComparaison= ruleComparaison EOF
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
    // InternalLegoLang.g:504:1: ruleComparaison returns [EObject current=null] : (this_GT_0= ruleGT | this_Equal_1= ruleEqual | this_LT_2= ruleLT | this_Different_3= ruleDifferent | this_GTorEqual_4= ruleGTorEqual | this_LTorEqual_5= ruleLTorEqual ) ;
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
            // InternalLegoLang.g:510:2: ( (this_GT_0= ruleGT | this_Equal_1= ruleEqual | this_LT_2= ruleLT | this_Different_3= ruleDifferent | this_GTorEqual_4= ruleGTorEqual | this_LTorEqual_5= ruleLTorEqual ) )
            // InternalLegoLang.g:511:2: (this_GT_0= ruleGT | this_Equal_1= ruleEqual | this_LT_2= ruleLT | this_Different_3= ruleDifferent | this_GTorEqual_4= ruleGTorEqual | this_LTorEqual_5= ruleLTorEqual )
            {
            // InternalLegoLang.g:511:2: (this_GT_0= ruleGT | this_Equal_1= ruleEqual | this_LT_2= ruleLT | this_Different_3= ruleDifferent | this_GTorEqual_4= ruleGTorEqual | this_LTorEqual_5= ruleLTorEqual )
            int alt6=6;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                int LA6_1 = input.LA(2);

                if ( (synpred21_InternalLegoLang()) ) {
                    alt6=1;
                }
                else if ( (synpred22_InternalLegoLang()) ) {
                    alt6=2;
                }
                else if ( (synpred23_InternalLegoLang()) ) {
                    alt6=3;
                }
                else if ( (synpred24_InternalLegoLang()) ) {
                    alt6=4;
                }
                else if ( (synpred25_InternalLegoLang()) ) {
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
                    // InternalLegoLang.g:512:3: this_GT_0= ruleGT
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
                    // InternalLegoLang.g:524:3: this_Equal_1= ruleEqual
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
                    // InternalLegoLang.g:536:3: this_LT_2= ruleLT
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
                    // InternalLegoLang.g:548:3: this_Different_3= ruleDifferent
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
                    // InternalLegoLang.g:560:3: this_GTorEqual_4= ruleGTorEqual
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
                    // InternalLegoLang.g:572:3: this_LTorEqual_5= ruleLTorEqual
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


    // $ANTLR start "entryRuleConditionEtat"
    // InternalLegoLang.g:587:1: entryRuleConditionEtat returns [EObject current=null] : iv_ruleConditionEtat= ruleConditionEtat EOF ;
    public final EObject entryRuleConditionEtat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionEtat = null;


        try {
            // InternalLegoLang.g:587:54: (iv_ruleConditionEtat= ruleConditionEtat EOF )
            // InternalLegoLang.g:588:2: iv_ruleConditionEtat= ruleConditionEtat EOF
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
    // InternalLegoLang.g:594:1: ruleConditionEtat returns [EObject current=null] : (otherlv_0= 'if' ( (lv_Condition_1_0= ruleComparaison ) ) otherlv_2= '{' ( (lv_then_3_0= ruleStatement ) )* otherlv_4= '}' (otherlv_5= 'else{' ( (lv_else_6_0= ruleStatement ) ) otherlv_7= '}' )? ) ;
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
            // InternalLegoLang.g:600:2: ( (otherlv_0= 'if' ( (lv_Condition_1_0= ruleComparaison ) ) otherlv_2= '{' ( (lv_then_3_0= ruleStatement ) )* otherlv_4= '}' (otherlv_5= 'else{' ( (lv_else_6_0= ruleStatement ) ) otherlv_7= '}' )? ) )
            // InternalLegoLang.g:601:2: (otherlv_0= 'if' ( (lv_Condition_1_0= ruleComparaison ) ) otherlv_2= '{' ( (lv_then_3_0= ruleStatement ) )* otherlv_4= '}' (otherlv_5= 'else{' ( (lv_else_6_0= ruleStatement ) ) otherlv_7= '}' )? )
            {
            // InternalLegoLang.g:601:2: (otherlv_0= 'if' ( (lv_Condition_1_0= ruleComparaison ) ) otherlv_2= '{' ( (lv_then_3_0= ruleStatement ) )* otherlv_4= '}' (otherlv_5= 'else{' ( (lv_else_6_0= ruleStatement ) ) otherlv_7= '}' )? )
            // InternalLegoLang.g:602:3: otherlv_0= 'if' ( (lv_Condition_1_0= ruleComparaison ) ) otherlv_2= '{' ( (lv_then_3_0= ruleStatement ) )* otherlv_4= '}' (otherlv_5= 'else{' ( (lv_else_6_0= ruleStatement ) ) otherlv_7= '}' )?
            {
            otherlv_0=(Token)match(input,14,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConditionEtatAccess().getIfKeyword_0());
              		
            }
            // InternalLegoLang.g:606:3: ( (lv_Condition_1_0= ruleComparaison ) )
            // InternalLegoLang.g:607:4: (lv_Condition_1_0= ruleComparaison )
            {
            // InternalLegoLang.g:607:4: (lv_Condition_1_0= ruleComparaison )
            // InternalLegoLang.g:608:5: lv_Condition_1_0= ruleComparaison
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConditionEtatAccess().getConditionComparaisonParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_Condition_1_0=ruleComparaison();

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
              						"langageCompilation.concrete.syntax.LegoLang.Comparaison");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getConditionEtatAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalLegoLang.g:629:3: ( (lv_then_3_0= ruleStatement ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_STRING && LA7_0<=RULE_INT)||LA7_0==14||(LA7_0>=16 && LA7_0<=17)||(LA7_0>=19 && LA7_0<=20)||(LA7_0>=34 && LA7_0<=37)||LA7_0==39||(LA7_0>=41 && LA7_0<=42)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalLegoLang.g:630:4: (lv_then_3_0= ruleStatement )
            	    {
            	    // InternalLegoLang.g:630:4: (lv_then_3_0= ruleStatement )
            	    // InternalLegoLang.g:631:5: lv_then_3_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getConditionEtatAccess().getThenStatementParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_5);
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
            	    break loop7;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getConditionEtatAccess().getRightCurlyBracketKeyword_4());
              		
            }
            // InternalLegoLang.g:652:3: (otherlv_5= 'else{' ( (lv_else_6_0= ruleStatement ) ) otherlv_7= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalLegoLang.g:653:4: otherlv_5= 'else{' ( (lv_else_6_0= ruleStatement ) ) otherlv_7= '}'
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getConditionEtatAccess().getElseKeyword_5_0());
                      			
                    }
                    // InternalLegoLang.g:657:4: ( (lv_else_6_0= ruleStatement ) )
                    // InternalLegoLang.g:658:5: (lv_else_6_0= ruleStatement )
                    {
                    // InternalLegoLang.g:658:5: (lv_else_6_0= ruleStatement )
                    // InternalLegoLang.g:659:6: lv_else_6_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConditionEtatAccess().getElseStatementParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_9);
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

                    otherlv_7=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
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
    // InternalLegoLang.g:685:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalLegoLang.g:685:47: (iv_ruleEString= ruleEString EOF )
            // InternalLegoLang.g:686:2: iv_ruleEString= ruleEString EOF
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
    // InternalLegoLang.g:692:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalLegoLang.g:698:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalLegoLang.g:699:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalLegoLang.g:699:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalLegoLang.g:700:3: this_STRING_0= RULE_STRING
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
                    // InternalLegoLang.g:708:3: this_ID_1= RULE_ID
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
    // InternalLegoLang.g:719:1: entryRuleWhileLoop returns [EObject current=null] : iv_ruleWhileLoop= ruleWhileLoop EOF ;
    public final EObject entryRuleWhileLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileLoop = null;


        try {
            // InternalLegoLang.g:719:50: (iv_ruleWhileLoop= ruleWhileLoop EOF )
            // InternalLegoLang.g:720:2: iv_ruleWhileLoop= ruleWhileLoop EOF
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
    // InternalLegoLang.g:726:1: ruleWhileLoop returns [EObject current=null] : (otherlv_0= 'while' ( (lv_LoopCondition_1_0= ruleComparaison ) ) otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= '}' ) ;
    public final EObject ruleWhileLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_LoopCondition_1_0 = null;

        EObject lv_statement_3_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:732:2: ( (otherlv_0= 'while' ( (lv_LoopCondition_1_0= ruleComparaison ) ) otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= '}' ) )
            // InternalLegoLang.g:733:2: (otherlv_0= 'while' ( (lv_LoopCondition_1_0= ruleComparaison ) ) otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= '}' )
            {
            // InternalLegoLang.g:733:2: (otherlv_0= 'while' ( (lv_LoopCondition_1_0= ruleComparaison ) ) otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= '}' )
            // InternalLegoLang.g:734:3: otherlv_0= 'while' ( (lv_LoopCondition_1_0= ruleComparaison ) ) otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWhileLoopAccess().getWhileKeyword_0());
              		
            }
            // InternalLegoLang.g:738:3: ( (lv_LoopCondition_1_0= ruleComparaison ) )
            // InternalLegoLang.g:739:4: (lv_LoopCondition_1_0= ruleComparaison )
            {
            // InternalLegoLang.g:739:4: (lv_LoopCondition_1_0= ruleComparaison )
            // InternalLegoLang.g:740:5: lv_LoopCondition_1_0= ruleComparaison
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
            // InternalLegoLang.g:761:3: ( (lv_statement_3_0= ruleStatement ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_STRING && LA10_0<=RULE_INT)||LA10_0==14||(LA10_0>=16 && LA10_0<=17)||(LA10_0>=19 && LA10_0<=20)||(LA10_0>=34 && LA10_0<=37)||LA10_0==39||(LA10_0>=41 && LA10_0<=42)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalLegoLang.g:762:4: (lv_statement_3_0= ruleStatement )
            	    {
            	    // InternalLegoLang.g:762:4: (lv_statement_3_0= ruleStatement )
            	    // InternalLegoLang.g:763:5: lv_statement_3_0= ruleStatement
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
            	    break loop10;
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
    // InternalLegoLang.g:788:1: entryRuleMethodePrint returns [EObject current=null] : iv_ruleMethodePrint= ruleMethodePrint EOF ;
    public final EObject entryRuleMethodePrint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodePrint = null;


        try {
            // InternalLegoLang.g:788:53: (iv_ruleMethodePrint= ruleMethodePrint EOF )
            // InternalLegoLang.g:789:2: iv_ruleMethodePrint= ruleMethodePrint EOF
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
    // InternalLegoLang.g:795:1: ruleMethodePrint returns [EObject current=null] : ( () otherlv_1= 'print(' ( (lv_expression_2_0= ruleExpression ) )+ otherlv_3= ');' ) ;
    public final EObject ruleMethodePrint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:801:2: ( ( () otherlv_1= 'print(' ( (lv_expression_2_0= ruleExpression ) )+ otherlv_3= ');' ) )
            // InternalLegoLang.g:802:2: ( () otherlv_1= 'print(' ( (lv_expression_2_0= ruleExpression ) )+ otherlv_3= ');' )
            {
            // InternalLegoLang.g:802:2: ( () otherlv_1= 'print(' ( (lv_expression_2_0= ruleExpression ) )+ otherlv_3= ');' )
            // InternalLegoLang.g:803:3: () otherlv_1= 'print(' ( (lv_expression_2_0= ruleExpression ) )+ otherlv_3= ');'
            {
            // InternalLegoLang.g:803:3: ()
            // InternalLegoLang.g:804:4: 
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

            otherlv_1=(Token)match(input,17,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMethodePrintAccess().getPrintKeyword_1());
              		
            }
            // InternalLegoLang.g:817:3: ( (lv_expression_2_0= ruleExpression ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_STRING && LA11_0<=RULE_INT)||(LA11_0>=19 && LA11_0<=20)||(LA11_0>=34 && LA11_0<=35)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalLegoLang.g:818:4: (lv_expression_2_0= ruleExpression )
            	    {
            	    // InternalLegoLang.g:818:4: (lv_expression_2_0= ruleExpression )
            	    // InternalLegoLang.g:819:5: lv_expression_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getMethodePrintAccess().getExpressionExpressionParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_11);
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
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            otherlv_3=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getMethodePrintAccess().getRightParenthesisSemicolonKeyword_3());
              		
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
    // InternalLegoLang.g:844:1: entryRuleVariableRef returns [EObject current=null] : iv_ruleVariableRef= ruleVariableRef EOF ;
    public final EObject entryRuleVariableRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableRef = null;


        try {
            // InternalLegoLang.g:844:52: (iv_ruleVariableRef= ruleVariableRef EOF )
            // InternalLegoLang.g:845:2: iv_ruleVariableRef= ruleVariableRef EOF
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
    // InternalLegoLang.g:851:1: ruleVariableRef returns [EObject current=null] : ( ( ruleEString ) ) ;
    public final EObject ruleVariableRef() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalLegoLang.g:857:2: ( ( ( ruleEString ) ) )
            // InternalLegoLang.g:858:2: ( ( ruleEString ) )
            {
            // InternalLegoLang.g:858:2: ( ( ruleEString ) )
            // InternalLegoLang.g:859:3: ( ruleEString )
            {
            // InternalLegoLang.g:859:3: ( ruleEString )
            // InternalLegoLang.g:860:4: ruleEString
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
    // InternalLegoLang.g:880:1: entryRuleSubstraction returns [EObject current=null] : iv_ruleSubstraction= ruleSubstraction EOF ;
    public final EObject entryRuleSubstraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubstraction = null;


        try {
            // InternalLegoLang.g:880:53: (iv_ruleSubstraction= ruleSubstraction EOF )
            // InternalLegoLang.g:881:2: iv_ruleSubstraction= ruleSubstraction EOF
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
    // InternalLegoLang.g:887:1: ruleSubstraction returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '-' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleSubstraction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:893:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '-' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalLegoLang.g:894:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '-' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalLegoLang.g:894:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '-' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalLegoLang.g:895:3: otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '-' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSubstractionAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalLegoLang.g:899:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalLegoLang.g:900:4: (lv_left_1_0= ruleExpression )
            {
            // InternalLegoLang.g:900:4: (lv_left_1_0= ruleExpression )
            // InternalLegoLang.g:901:5: lv_left_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSubstractionAccess().getLeftExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_12);
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

            otherlv_2=(Token)match(input,20,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getSubstractionAccess().getHyphenMinusKeyword_2());
              		
            }
            // InternalLegoLang.g:922:3: ( (lv_right_3_0= ruleExpression ) )
            // InternalLegoLang.g:923:4: (lv_right_3_0= ruleExpression )
            {
            // InternalLegoLang.g:923:4: (lv_right_3_0= ruleExpression )
            // InternalLegoLang.g:924:5: lv_right_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSubstractionAccess().getRightExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_13);
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

            otherlv_4=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
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
    // InternalLegoLang.g:949:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // InternalLegoLang.g:949:49: (iv_ruleAddition= ruleAddition EOF )
            // InternalLegoLang.g:950:2: iv_ruleAddition= ruleAddition EOF
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
    // InternalLegoLang.g:956:1: ruleAddition returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '+' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:962:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '+' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalLegoLang.g:963:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '+' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalLegoLang.g:963:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '+' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalLegoLang.g:964:3: otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '+' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAdditionAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalLegoLang.g:968:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalLegoLang.g:969:4: (lv_left_1_0= ruleExpression )
            {
            // InternalLegoLang.g:969:4: (lv_left_1_0= ruleExpression )
            // InternalLegoLang.g:970:5: lv_left_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAdditionAccess().getLeftExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_14);
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

            otherlv_2=(Token)match(input,22,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getAdditionAccess().getPlusSignKeyword_2());
              		
            }
            // InternalLegoLang.g:991:3: ( (lv_right_3_0= ruleExpression ) )
            // InternalLegoLang.g:992:4: (lv_right_3_0= ruleExpression )
            {
            // InternalLegoLang.g:992:4: (lv_right_3_0= ruleExpression )
            // InternalLegoLang.g:993:5: lv_right_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAdditionAccess().getRightExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_13);
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

            otherlv_4=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
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
    // InternalLegoLang.g:1018:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // InternalLegoLang.g:1018:55: (iv_ruleMultiplication= ruleMultiplication EOF )
            // InternalLegoLang.g:1019:2: iv_ruleMultiplication= ruleMultiplication EOF
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
    // InternalLegoLang.g:1025:1: ruleMultiplication returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '*' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:1031:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '*' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalLegoLang.g:1032:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '*' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalLegoLang.g:1032:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '*' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalLegoLang.g:1033:3: otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '*' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMultiplicationAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalLegoLang.g:1037:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalLegoLang.g:1038:4: (lv_left_1_0= ruleExpression )
            {
            // InternalLegoLang.g:1038:4: (lv_left_1_0= ruleExpression )
            // InternalLegoLang.g:1039:5: lv_left_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMultiplicationAccess().getLeftExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_15);
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

            otherlv_2=(Token)match(input,23,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getMultiplicationAccess().getAsteriskKeyword_2());
              		
            }
            // InternalLegoLang.g:1060:3: ( (lv_right_3_0= ruleExpression ) )
            // InternalLegoLang.g:1061:4: (lv_right_3_0= ruleExpression )
            {
            // InternalLegoLang.g:1061:4: (lv_right_3_0= ruleExpression )
            // InternalLegoLang.g:1062:5: lv_right_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMultiplicationAccess().getRightExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_13);
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

            otherlv_4=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
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
    // InternalLegoLang.g:1087:1: entryRuleDivision returns [EObject current=null] : iv_ruleDivision= ruleDivision EOF ;
    public final EObject entryRuleDivision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivision = null;


        try {
            // InternalLegoLang.g:1087:49: (iv_ruleDivision= ruleDivision EOF )
            // InternalLegoLang.g:1088:2: iv_ruleDivision= ruleDivision EOF
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
    // InternalLegoLang.g:1094:1: ruleDivision returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '/' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleDivision() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:1100:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '/' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalLegoLang.g:1101:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '/' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalLegoLang.g:1101:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '/' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalLegoLang.g:1102:3: otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '/' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDivisionAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalLegoLang.g:1106:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalLegoLang.g:1107:4: (lv_left_1_0= ruleExpression )
            {
            // InternalLegoLang.g:1107:4: (lv_left_1_0= ruleExpression )
            // InternalLegoLang.g:1108:5: lv_left_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDivisionAccess().getLeftExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_16);
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

            otherlv_2=(Token)match(input,24,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDivisionAccess().getSolidusKeyword_2());
              		
            }
            // InternalLegoLang.g:1129:3: ( (lv_right_3_0= ruleExpression ) )
            // InternalLegoLang.g:1130:4: (lv_right_3_0= ruleExpression )
            {
            // InternalLegoLang.g:1130:4: (lv_right_3_0= ruleExpression )
            // InternalLegoLang.g:1131:5: lv_right_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDivisionAccess().getRightExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_13);
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

            otherlv_4=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
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
    // InternalLegoLang.g:1156:1: entryRuleGT returns [EObject current=null] : iv_ruleGT= ruleGT EOF ;
    public final EObject entryRuleGT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGT = null;


        try {
            // InternalLegoLang.g:1156:43: (iv_ruleGT= ruleGT EOF )
            // InternalLegoLang.g:1157:2: iv_ruleGT= ruleGT EOF
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
    // InternalLegoLang.g:1163:1: ruleGT returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '>' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleGT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:1169:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '>' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalLegoLang.g:1170:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '>' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalLegoLang.g:1170:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '>' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalLegoLang.g:1171:3: otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '>' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGTAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalLegoLang.g:1175:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalLegoLang.g:1176:4: (lv_left_1_0= ruleExpression )
            {
            // InternalLegoLang.g:1176:4: (lv_left_1_0= ruleExpression )
            // InternalLegoLang.g:1177:5: lv_left_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGTAccess().getLeftExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_17);
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

            otherlv_2=(Token)match(input,25,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGTAccess().getGreaterThanSignKeyword_2());
              		
            }
            // InternalLegoLang.g:1198:3: ( (lv_right_3_0= ruleExpression ) )
            // InternalLegoLang.g:1199:4: (lv_right_3_0= ruleExpression )
            {
            // InternalLegoLang.g:1199:4: (lv_right_3_0= ruleExpression )
            // InternalLegoLang.g:1200:5: lv_right_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGTAccess().getRightExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_13);
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

            otherlv_4=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
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
    // InternalLegoLang.g:1225:1: entryRuleLT returns [EObject current=null] : iv_ruleLT= ruleLT EOF ;
    public final EObject entryRuleLT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLT = null;


        try {
            // InternalLegoLang.g:1225:43: (iv_ruleLT= ruleLT EOF )
            // InternalLegoLang.g:1226:2: iv_ruleLT= ruleLT EOF
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
    // InternalLegoLang.g:1232:1: ruleLT returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '<' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleLT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:1238:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '<' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalLegoLang.g:1239:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '<' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalLegoLang.g:1239:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '<' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalLegoLang.g:1240:3: otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '<' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLTAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalLegoLang.g:1244:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalLegoLang.g:1245:4: (lv_left_1_0= ruleExpression )
            {
            // InternalLegoLang.g:1245:4: (lv_left_1_0= ruleExpression )
            // InternalLegoLang.g:1246:5: lv_left_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLTAccess().getLeftExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_18);
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

            otherlv_2=(Token)match(input,26,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getLTAccess().getLessThanSignKeyword_2());
              		
            }
            // InternalLegoLang.g:1267:3: ( (lv_right_3_0= ruleExpression ) )
            // InternalLegoLang.g:1268:4: (lv_right_3_0= ruleExpression )
            {
            // InternalLegoLang.g:1268:4: (lv_right_3_0= ruleExpression )
            // InternalLegoLang.g:1269:5: lv_right_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLTAccess().getRightExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_13);
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

            otherlv_4=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
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
    // InternalLegoLang.g:1294:1: entryRuleEqual returns [EObject current=null] : iv_ruleEqual= ruleEqual EOF ;
    public final EObject entryRuleEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqual = null;


        try {
            // InternalLegoLang.g:1294:46: (iv_ruleEqual= ruleEqual EOF )
            // InternalLegoLang.g:1295:2: iv_ruleEqual= ruleEqual EOF
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
    // InternalLegoLang.g:1301:1: ruleEqual returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '==' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:1307:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '==' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalLegoLang.g:1308:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '==' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalLegoLang.g:1308:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '==' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalLegoLang.g:1309:3: otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '==' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEqualAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalLegoLang.g:1313:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalLegoLang.g:1314:4: (lv_left_1_0= ruleExpression )
            {
            // InternalLegoLang.g:1314:4: (lv_left_1_0= ruleExpression )
            // InternalLegoLang.g:1315:5: lv_left_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEqualAccess().getLeftExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_19);
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

            otherlv_2=(Token)match(input,27,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getEqualAccess().getEqualsSignEqualsSignKeyword_2());
              		
            }
            // InternalLegoLang.g:1336:3: ( (lv_right_3_0= ruleExpression ) )
            // InternalLegoLang.g:1337:4: (lv_right_3_0= ruleExpression )
            {
            // InternalLegoLang.g:1337:4: (lv_right_3_0= ruleExpression )
            // InternalLegoLang.g:1338:5: lv_right_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEqualAccess().getRightExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_13);
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

            otherlv_4=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
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
    // InternalLegoLang.g:1363:1: entryRuleDifferent returns [EObject current=null] : iv_ruleDifferent= ruleDifferent EOF ;
    public final EObject entryRuleDifferent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDifferent = null;


        try {
            // InternalLegoLang.g:1363:50: (iv_ruleDifferent= ruleDifferent EOF )
            // InternalLegoLang.g:1364:2: iv_ruleDifferent= ruleDifferent EOF
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
    // InternalLegoLang.g:1370:1: ruleDifferent returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '!=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleDifferent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:1376:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '!=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalLegoLang.g:1377:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '!=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalLegoLang.g:1377:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '!=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalLegoLang.g:1378:3: otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '!=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDifferentAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalLegoLang.g:1382:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalLegoLang.g:1383:4: (lv_left_1_0= ruleExpression )
            {
            // InternalLegoLang.g:1383:4: (lv_left_1_0= ruleExpression )
            // InternalLegoLang.g:1384:5: lv_left_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDifferentAccess().getLeftExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_20);
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

            otherlv_2=(Token)match(input,28,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDifferentAccess().getExclamationMarkEqualsSignKeyword_2());
              		
            }
            // InternalLegoLang.g:1405:3: ( (lv_right_3_0= ruleExpression ) )
            // InternalLegoLang.g:1406:4: (lv_right_3_0= ruleExpression )
            {
            // InternalLegoLang.g:1406:4: (lv_right_3_0= ruleExpression )
            // InternalLegoLang.g:1407:5: lv_right_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDifferentAccess().getRightExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_13);
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

            otherlv_4=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
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
    // InternalLegoLang.g:1432:1: entryRuleLTorEqual returns [EObject current=null] : iv_ruleLTorEqual= ruleLTorEqual EOF ;
    public final EObject entryRuleLTorEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLTorEqual = null;


        try {
            // InternalLegoLang.g:1432:50: (iv_ruleLTorEqual= ruleLTorEqual EOF )
            // InternalLegoLang.g:1433:2: iv_ruleLTorEqual= ruleLTorEqual EOF
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
    // InternalLegoLang.g:1439:1: ruleLTorEqual returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '<=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleLTorEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:1445:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '<=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalLegoLang.g:1446:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '<=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalLegoLang.g:1446:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '<=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalLegoLang.g:1447:3: otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '<=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLTorEqualAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalLegoLang.g:1451:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalLegoLang.g:1452:4: (lv_left_1_0= ruleExpression )
            {
            // InternalLegoLang.g:1452:4: (lv_left_1_0= ruleExpression )
            // InternalLegoLang.g:1453:5: lv_left_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLTorEqualAccess().getLeftExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_21);
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

            otherlv_2=(Token)match(input,29,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getLTorEqualAccess().getLessThanSignEqualsSignKeyword_2());
              		
            }
            // InternalLegoLang.g:1474:3: ( (lv_right_3_0= ruleExpression ) )
            // InternalLegoLang.g:1475:4: (lv_right_3_0= ruleExpression )
            {
            // InternalLegoLang.g:1475:4: (lv_right_3_0= ruleExpression )
            // InternalLegoLang.g:1476:5: lv_right_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLTorEqualAccess().getRightExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_13);
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

            otherlv_4=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
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
    // InternalLegoLang.g:1501:1: entryRuleGTorEqual returns [EObject current=null] : iv_ruleGTorEqual= ruleGTorEqual EOF ;
    public final EObject entryRuleGTorEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGTorEqual = null;


        try {
            // InternalLegoLang.g:1501:50: (iv_ruleGTorEqual= ruleGTorEqual EOF )
            // InternalLegoLang.g:1502:2: iv_ruleGTorEqual= ruleGTorEqual EOF
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
    // InternalLegoLang.g:1508:1: ruleGTorEqual returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '>=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleGTorEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:1514:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '>=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalLegoLang.g:1515:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '>=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalLegoLang.g:1515:2: (otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '>=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalLegoLang.g:1516:3: otherlv_0= '(' ( (lv_left_1_0= ruleExpression ) ) otherlv_2= '>=' ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGTorEqualAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalLegoLang.g:1520:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalLegoLang.g:1521:4: (lv_left_1_0= ruleExpression )
            {
            // InternalLegoLang.g:1521:4: (lv_left_1_0= ruleExpression )
            // InternalLegoLang.g:1522:5: lv_left_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGTorEqualAccess().getLeftExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_22);
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

            otherlv_2=(Token)match(input,30,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGTorEqualAccess().getGreaterThanSignEqualsSignKeyword_2());
              		
            }
            // InternalLegoLang.g:1543:3: ( (lv_right_3_0= ruleExpression ) )
            // InternalLegoLang.g:1544:4: (lv_right_3_0= ruleExpression )
            {
            // InternalLegoLang.g:1544:4: (lv_right_3_0= ruleExpression )
            // InternalLegoLang.g:1545:5: lv_right_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGTorEqualAccess().getRightExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_13);
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

            otherlv_4=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
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
    // InternalLegoLang.g:1570:1: entryRuleAssignement returns [EObject current=null] : iv_ruleAssignement= ruleAssignement EOF ;
    public final EObject entryRuleAssignement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignement = null;


        try {
            // InternalLegoLang.g:1570:52: (iv_ruleAssignement= ruleAssignement EOF )
            // InternalLegoLang.g:1571:2: iv_ruleAssignement= ruleAssignement EOF
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
    // InternalLegoLang.g:1577:1: ruleAssignement returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_left_2_0= ruleExpression ) ) otherlv_3= '=' ( (lv_right_4_0= ruleExpression ) ) otherlv_5= ');' ) ;
    public final EObject ruleAssignement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_left_2_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:1583:2: ( ( () otherlv_1= '(' ( (lv_left_2_0= ruleExpression ) ) otherlv_3= '=' ( (lv_right_4_0= ruleExpression ) ) otherlv_5= ');' ) )
            // InternalLegoLang.g:1584:2: ( () otherlv_1= '(' ( (lv_left_2_0= ruleExpression ) ) otherlv_3= '=' ( (lv_right_4_0= ruleExpression ) ) otherlv_5= ');' )
            {
            // InternalLegoLang.g:1584:2: ( () otherlv_1= '(' ( (lv_left_2_0= ruleExpression ) ) otherlv_3= '=' ( (lv_right_4_0= ruleExpression ) ) otherlv_5= ');' )
            // InternalLegoLang.g:1585:3: () otherlv_1= '(' ( (lv_left_2_0= ruleExpression ) ) otherlv_3= '=' ( (lv_right_4_0= ruleExpression ) ) otherlv_5= ');'
            {
            // InternalLegoLang.g:1585:3: ()
            // InternalLegoLang.g:1586:4: 
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

            otherlv_1=(Token)match(input,19,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAssignementAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalLegoLang.g:1599:3: ( (lv_left_2_0= ruleExpression ) )
            // InternalLegoLang.g:1600:4: (lv_left_2_0= ruleExpression )
            {
            // InternalLegoLang.g:1600:4: (lv_left_2_0= ruleExpression )
            // InternalLegoLang.g:1601:5: lv_left_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAssignementAccess().getLeftExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_23);
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

            otherlv_3=(Token)match(input,31,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getAssignementAccess().getEqualsSignKeyword_3());
              		
            }
            // InternalLegoLang.g:1622:3: ( (lv_right_4_0= ruleExpression ) )
            // InternalLegoLang.g:1623:4: (lv_right_4_0= ruleExpression )
            {
            // InternalLegoLang.g:1623:4: (lv_right_4_0= ruleExpression )
            // InternalLegoLang.g:1624:5: lv_right_4_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAssignementAccess().getRightExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_24);
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

            otherlv_5=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
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
    // InternalLegoLang.g:1649:1: entryRulePlusEqual returns [EObject current=null] : iv_rulePlusEqual= rulePlusEqual EOF ;
    public final EObject entryRulePlusEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusEqual = null;


        try {
            // InternalLegoLang.g:1649:50: (iv_rulePlusEqual= rulePlusEqual EOF )
            // InternalLegoLang.g:1650:2: iv_rulePlusEqual= rulePlusEqual EOF
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
    // InternalLegoLang.g:1656:1: rulePlusEqual returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_left_2_0= ruleExpression ) ) otherlv_3= '+=' ( (lv_right_4_0= ruleExpression ) ) otherlv_5= ');' ) ;
    public final EObject rulePlusEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_left_2_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:1662:2: ( ( () otherlv_1= '(' ( (lv_left_2_0= ruleExpression ) ) otherlv_3= '+=' ( (lv_right_4_0= ruleExpression ) ) otherlv_5= ');' ) )
            // InternalLegoLang.g:1663:2: ( () otherlv_1= '(' ( (lv_left_2_0= ruleExpression ) ) otherlv_3= '+=' ( (lv_right_4_0= ruleExpression ) ) otherlv_5= ');' )
            {
            // InternalLegoLang.g:1663:2: ( () otherlv_1= '(' ( (lv_left_2_0= ruleExpression ) ) otherlv_3= '+=' ( (lv_right_4_0= ruleExpression ) ) otherlv_5= ');' )
            // InternalLegoLang.g:1664:3: () otherlv_1= '(' ( (lv_left_2_0= ruleExpression ) ) otherlv_3= '+=' ( (lv_right_4_0= ruleExpression ) ) otherlv_5= ');'
            {
            // InternalLegoLang.g:1664:3: ()
            // InternalLegoLang.g:1665:4: 
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

            otherlv_1=(Token)match(input,19,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPlusEqualAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalLegoLang.g:1678:3: ( (lv_left_2_0= ruleExpression ) )
            // InternalLegoLang.g:1679:4: (lv_left_2_0= ruleExpression )
            {
            // InternalLegoLang.g:1679:4: (lv_left_2_0= ruleExpression )
            // InternalLegoLang.g:1680:5: lv_left_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPlusEqualAccess().getLeftExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_25);
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

            otherlv_3=(Token)match(input,32,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getPlusEqualAccess().getPlusSignEqualsSignKeyword_3());
              		
            }
            // InternalLegoLang.g:1701:3: ( (lv_right_4_0= ruleExpression ) )
            // InternalLegoLang.g:1702:4: (lv_right_4_0= ruleExpression )
            {
            // InternalLegoLang.g:1702:4: (lv_right_4_0= ruleExpression )
            // InternalLegoLang.g:1703:5: lv_right_4_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPlusEqualAccess().getRightExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_24);
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

            otherlv_5=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
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
    // InternalLegoLang.g:1728:1: entryRuleMinusEqual returns [EObject current=null] : iv_ruleMinusEqual= ruleMinusEqual EOF ;
    public final EObject entryRuleMinusEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinusEqual = null;


        try {
            // InternalLegoLang.g:1728:51: (iv_ruleMinusEqual= ruleMinusEqual EOF )
            // InternalLegoLang.g:1729:2: iv_ruleMinusEqual= ruleMinusEqual EOF
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
    // InternalLegoLang.g:1735:1: ruleMinusEqual returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_left_2_0= ruleExpression ) ) otherlv_3= '-=' ( (lv_right_4_0= ruleExpression ) ) otherlv_5= ');' ) ;
    public final EObject ruleMinusEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_left_2_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:1741:2: ( ( () otherlv_1= '(' ( (lv_left_2_0= ruleExpression ) ) otherlv_3= '-=' ( (lv_right_4_0= ruleExpression ) ) otherlv_5= ');' ) )
            // InternalLegoLang.g:1742:2: ( () otherlv_1= '(' ( (lv_left_2_0= ruleExpression ) ) otherlv_3= '-=' ( (lv_right_4_0= ruleExpression ) ) otherlv_5= ');' )
            {
            // InternalLegoLang.g:1742:2: ( () otherlv_1= '(' ( (lv_left_2_0= ruleExpression ) ) otherlv_3= '-=' ( (lv_right_4_0= ruleExpression ) ) otherlv_5= ');' )
            // InternalLegoLang.g:1743:3: () otherlv_1= '(' ( (lv_left_2_0= ruleExpression ) ) otherlv_3= '-=' ( (lv_right_4_0= ruleExpression ) ) otherlv_5= ');'
            {
            // InternalLegoLang.g:1743:3: ()
            // InternalLegoLang.g:1744:4: 
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

            otherlv_1=(Token)match(input,19,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMinusEqualAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalLegoLang.g:1757:3: ( (lv_left_2_0= ruleExpression ) )
            // InternalLegoLang.g:1758:4: (lv_left_2_0= ruleExpression )
            {
            // InternalLegoLang.g:1758:4: (lv_left_2_0= ruleExpression )
            // InternalLegoLang.g:1759:5: lv_left_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMinusEqualAccess().getLeftExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_26);
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

            otherlv_3=(Token)match(input,33,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getMinusEqualAccess().getHyphenMinusEqualsSignKeyword_3());
              		
            }
            // InternalLegoLang.g:1780:3: ( (lv_right_4_0= ruleExpression ) )
            // InternalLegoLang.g:1781:4: (lv_right_4_0= ruleExpression )
            {
            // InternalLegoLang.g:1781:4: (lv_right_4_0= ruleExpression )
            // InternalLegoLang.g:1782:5: lv_right_4_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMinusEqualAccess().getRightExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_24);
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

            otherlv_5=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
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
    // InternalLegoLang.g:1807:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalLegoLang.g:1807:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalLegoLang.g:1808:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalLegoLang.g:1814:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLegoLang.g:1820:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalLegoLang.g:1821:2: (kw= 'true' | kw= 'false' )
            {
            // InternalLegoLang.g:1821:2: (kw= 'true' | kw= 'false' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==34) ) {
                alt12=1;
            }
            else if ( (LA12_0==35) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalLegoLang.g:1822:3: kw= 'true'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalLegoLang.g:1828:3: kw= 'false'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleunInteger"
    // InternalLegoLang.g:1837:1: entryRuleunInteger returns [EObject current=null] : iv_ruleunInteger= ruleunInteger EOF ;
    public final EObject entryRuleunInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunInteger = null;


        try {
            // InternalLegoLang.g:1837:50: (iv_ruleunInteger= ruleunInteger EOF )
            // InternalLegoLang.g:1838:2: iv_ruleunInteger= ruleunInteger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnIntegerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleunInteger=ruleunInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleunInteger; 
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
    // $ANTLR end "entryRuleunInteger"


    // $ANTLR start "ruleunInteger"
    // InternalLegoLang.g:1844:1: ruleunInteger returns [EObject current=null] : ( () ( (lv_isConst_1_0= 'const' ) )? otherlv_2= 'int' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '=' ( (lv_initialeValue_5_0= ruleEInt ) ) )? otherlv_6= ';' ) ;
    public final EObject ruleunInteger() throws RecognitionException {
        EObject current = null;

        Token lv_isConst_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_initialeValue_5_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:1850:2: ( ( () ( (lv_isConst_1_0= 'const' ) )? otherlv_2= 'int' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '=' ( (lv_initialeValue_5_0= ruleEInt ) ) )? otherlv_6= ';' ) )
            // InternalLegoLang.g:1851:2: ( () ( (lv_isConst_1_0= 'const' ) )? otherlv_2= 'int' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '=' ( (lv_initialeValue_5_0= ruleEInt ) ) )? otherlv_6= ';' )
            {
            // InternalLegoLang.g:1851:2: ( () ( (lv_isConst_1_0= 'const' ) )? otherlv_2= 'int' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '=' ( (lv_initialeValue_5_0= ruleEInt ) ) )? otherlv_6= ';' )
            // InternalLegoLang.g:1852:3: () ( (lv_isConst_1_0= 'const' ) )? otherlv_2= 'int' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '=' ( (lv_initialeValue_5_0= ruleEInt ) ) )? otherlv_6= ';'
            {
            // InternalLegoLang.g:1852:3: ()
            // InternalLegoLang.g:1853:4: 
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

            // InternalLegoLang.g:1862:3: ( (lv_isConst_1_0= 'const' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==36) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalLegoLang.g:1863:4: (lv_isConst_1_0= 'const' )
                    {
                    // InternalLegoLang.g:1863:4: (lv_isConst_1_0= 'const' )
                    // InternalLegoLang.g:1864:5: lv_isConst_1_0= 'const'
                    {
                    lv_isConst_1_0=(Token)match(input,36,FOLLOW_27); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,37,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getUnIntegerAccess().getIntKeyword_2());
              		
            }
            // InternalLegoLang.g:1880:3: ( (lv_name_3_0= ruleEString ) )
            // InternalLegoLang.g:1881:4: (lv_name_3_0= ruleEString )
            {
            // InternalLegoLang.g:1881:4: (lv_name_3_0= ruleEString )
            // InternalLegoLang.g:1882:5: lv_name_3_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getUnIntegerAccess().getNameEStringParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_28);
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

            // InternalLegoLang.g:1899:3: (otherlv_4= '=' ( (lv_initialeValue_5_0= ruleEInt ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==31) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalLegoLang.g:1900:4: otherlv_4= '=' ( (lv_initialeValue_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getUnIntegerAccess().getEqualsSignKeyword_4_0());
                      			
                    }
                    // InternalLegoLang.g:1904:4: ( (lv_initialeValue_5_0= ruleEInt ) )
                    // InternalLegoLang.g:1905:5: (lv_initialeValue_5_0= ruleEInt )
                    {
                    // InternalLegoLang.g:1905:5: (lv_initialeValue_5_0= ruleEInt )
                    // InternalLegoLang.g:1906:6: lv_initialeValue_5_0= ruleEInt
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getUnIntegerAccess().getInitialeValueEIntParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_30);
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

            otherlv_6=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
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
    // $ANTLR end "ruleunInteger"


    // $ANTLR start "entryRuleunDouble"
    // InternalLegoLang.g:1932:1: entryRuleunDouble returns [EObject current=null] : iv_ruleunDouble= ruleunDouble EOF ;
    public final EObject entryRuleunDouble() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunDouble = null;


        try {
            // InternalLegoLang.g:1932:49: (iv_ruleunDouble= ruleunDouble EOF )
            // InternalLegoLang.g:1933:2: iv_ruleunDouble= ruleunDouble EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnDoubleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleunDouble=ruleunDouble();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleunDouble; 
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
    // $ANTLR end "entryRuleunDouble"


    // $ANTLR start "ruleunDouble"
    // InternalLegoLang.g:1939:1: ruleunDouble returns [EObject current=null] : ( () ( (lv_isConst_1_0= 'const' ) )? otherlv_2= 'double' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '=' ( (lv_initialeValue1_5_0= ruleEInt ) ) (otherlv_6= '.' ( (lv_initialeValue2_7_0= ruleEInt ) ) )? )? otherlv_8= ';' ) ;
    public final EObject ruleunDouble() throws RecognitionException {
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
            // InternalLegoLang.g:1945:2: ( ( () ( (lv_isConst_1_0= 'const' ) )? otherlv_2= 'double' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '=' ( (lv_initialeValue1_5_0= ruleEInt ) ) (otherlv_6= '.' ( (lv_initialeValue2_7_0= ruleEInt ) ) )? )? otherlv_8= ';' ) )
            // InternalLegoLang.g:1946:2: ( () ( (lv_isConst_1_0= 'const' ) )? otherlv_2= 'double' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '=' ( (lv_initialeValue1_5_0= ruleEInt ) ) (otherlv_6= '.' ( (lv_initialeValue2_7_0= ruleEInt ) ) )? )? otherlv_8= ';' )
            {
            // InternalLegoLang.g:1946:2: ( () ( (lv_isConst_1_0= 'const' ) )? otherlv_2= 'double' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '=' ( (lv_initialeValue1_5_0= ruleEInt ) ) (otherlv_6= '.' ( (lv_initialeValue2_7_0= ruleEInt ) ) )? )? otherlv_8= ';' )
            // InternalLegoLang.g:1947:3: () ( (lv_isConst_1_0= 'const' ) )? otherlv_2= 'double' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '=' ( (lv_initialeValue1_5_0= ruleEInt ) ) (otherlv_6= '.' ( (lv_initialeValue2_7_0= ruleEInt ) ) )? )? otherlv_8= ';'
            {
            // InternalLegoLang.g:1947:3: ()
            // InternalLegoLang.g:1948:4: 
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

            // InternalLegoLang.g:1957:3: ( (lv_isConst_1_0= 'const' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==36) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalLegoLang.g:1958:4: (lv_isConst_1_0= 'const' )
                    {
                    // InternalLegoLang.g:1958:4: (lv_isConst_1_0= 'const' )
                    // InternalLegoLang.g:1959:5: lv_isConst_1_0= 'const'
                    {
                    lv_isConst_1_0=(Token)match(input,36,FOLLOW_31); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,39,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getUnDoubleAccess().getDoubleKeyword_2());
              		
            }
            // InternalLegoLang.g:1975:3: ( (lv_name_3_0= ruleEString ) )
            // InternalLegoLang.g:1976:4: (lv_name_3_0= ruleEString )
            {
            // InternalLegoLang.g:1976:4: (lv_name_3_0= ruleEString )
            // InternalLegoLang.g:1977:5: lv_name_3_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getUnDoubleAccess().getNameEStringParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_28);
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

            // InternalLegoLang.g:1994:3: (otherlv_4= '=' ( (lv_initialeValue1_5_0= ruleEInt ) ) (otherlv_6= '.' ( (lv_initialeValue2_7_0= ruleEInt ) ) )? )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==31) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalLegoLang.g:1995:4: otherlv_4= '=' ( (lv_initialeValue1_5_0= ruleEInt ) ) (otherlv_6= '.' ( (lv_initialeValue2_7_0= ruleEInt ) ) )?
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getUnDoubleAccess().getEqualsSignKeyword_4_0());
                      			
                    }
                    // InternalLegoLang.g:1999:4: ( (lv_initialeValue1_5_0= ruleEInt ) )
                    // InternalLegoLang.g:2000:5: (lv_initialeValue1_5_0= ruleEInt )
                    {
                    // InternalLegoLang.g:2000:5: (lv_initialeValue1_5_0= ruleEInt )
                    // InternalLegoLang.g:2001:6: lv_initialeValue1_5_0= ruleEInt
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getUnDoubleAccess().getInitialeValue1EIntParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_32);
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

                    // InternalLegoLang.g:2018:4: (otherlv_6= '.' ( (lv_initialeValue2_7_0= ruleEInt ) ) )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==40) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalLegoLang.g:2019:5: otherlv_6= '.' ( (lv_initialeValue2_7_0= ruleEInt ) )
                            {
                            otherlv_6=(Token)match(input,40,FOLLOW_29); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_6, grammarAccess.getUnDoubleAccess().getFullStopKeyword_4_2_0());
                              				
                            }
                            // InternalLegoLang.g:2023:5: ( (lv_initialeValue2_7_0= ruleEInt ) )
                            // InternalLegoLang.g:2024:6: (lv_initialeValue2_7_0= ruleEInt )
                            {
                            // InternalLegoLang.g:2024:6: (lv_initialeValue2_7_0= ruleEInt )
                            // InternalLegoLang.g:2025:7: lv_initialeValue2_7_0= ruleEInt
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getUnDoubleAccess().getInitialeValue2EIntParserRuleCall_4_2_1_0());
                              						
                            }
                            pushFollow(FOLLOW_30);
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

            otherlv_8=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
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
    // $ANTLR end "ruleunDouble"


    // $ANTLR start "entryRuleunBoolean"
    // InternalLegoLang.g:2052:1: entryRuleunBoolean returns [EObject current=null] : iv_ruleunBoolean= ruleunBoolean EOF ;
    public final EObject entryRuleunBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunBoolean = null;


        try {
            // InternalLegoLang.g:2052:50: (iv_ruleunBoolean= ruleunBoolean EOF )
            // InternalLegoLang.g:2053:2: iv_ruleunBoolean= ruleunBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnBooleanRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleunBoolean=ruleunBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleunBoolean; 
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
    // $ANTLR end "entryRuleunBoolean"


    // $ANTLR start "ruleunBoolean"
    // InternalLegoLang.g:2059:1: ruleunBoolean returns [EObject current=null] : ( () ( (lv_isConst_1_0= 'const' ) )? otherlv_2= 'bool' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '=' ( (lv_initialeValue_5_0= ruleEBoolean ) ) )? otherlv_6= ';' ) ;
    public final EObject ruleunBoolean() throws RecognitionException {
        EObject current = null;

        Token lv_isConst_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_initialeValue_5_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:2065:2: ( ( () ( (lv_isConst_1_0= 'const' ) )? otherlv_2= 'bool' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '=' ( (lv_initialeValue_5_0= ruleEBoolean ) ) )? otherlv_6= ';' ) )
            // InternalLegoLang.g:2066:2: ( () ( (lv_isConst_1_0= 'const' ) )? otherlv_2= 'bool' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '=' ( (lv_initialeValue_5_0= ruleEBoolean ) ) )? otherlv_6= ';' )
            {
            // InternalLegoLang.g:2066:2: ( () ( (lv_isConst_1_0= 'const' ) )? otherlv_2= 'bool' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '=' ( (lv_initialeValue_5_0= ruleEBoolean ) ) )? otherlv_6= ';' )
            // InternalLegoLang.g:2067:3: () ( (lv_isConst_1_0= 'const' ) )? otherlv_2= 'bool' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '=' ( (lv_initialeValue_5_0= ruleEBoolean ) ) )? otherlv_6= ';'
            {
            // InternalLegoLang.g:2067:3: ()
            // InternalLegoLang.g:2068:4: 
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

            // InternalLegoLang.g:2077:3: ( (lv_isConst_1_0= 'const' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==36) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalLegoLang.g:2078:4: (lv_isConst_1_0= 'const' )
                    {
                    // InternalLegoLang.g:2078:4: (lv_isConst_1_0= 'const' )
                    // InternalLegoLang.g:2079:5: lv_isConst_1_0= 'const'
                    {
                    lv_isConst_1_0=(Token)match(input,36,FOLLOW_33); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,41,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getUnBooleanAccess().getBoolKeyword_2());
              		
            }
            // InternalLegoLang.g:2095:3: ( (lv_name_3_0= ruleEString ) )
            // InternalLegoLang.g:2096:4: (lv_name_3_0= ruleEString )
            {
            // InternalLegoLang.g:2096:4: (lv_name_3_0= ruleEString )
            // InternalLegoLang.g:2097:5: lv_name_3_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getUnBooleanAccess().getNameEStringParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_28);
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

            // InternalLegoLang.g:2114:3: (otherlv_4= '=' ( (lv_initialeValue_5_0= ruleEBoolean ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalLegoLang.g:2115:4: otherlv_4= '=' ( (lv_initialeValue_5_0= ruleEBoolean ) )
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getUnBooleanAccess().getEqualsSignKeyword_4_0());
                      			
                    }
                    // InternalLegoLang.g:2119:4: ( (lv_initialeValue_5_0= ruleEBoolean ) )
                    // InternalLegoLang.g:2120:5: (lv_initialeValue_5_0= ruleEBoolean )
                    {
                    // InternalLegoLang.g:2120:5: (lv_initialeValue_5_0= ruleEBoolean )
                    // InternalLegoLang.g:2121:6: lv_initialeValue_5_0= ruleEBoolean
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getUnBooleanAccess().getInitialeValueEBooleanParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_30);
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

            otherlv_6=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
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
    // $ANTLR end "ruleunBoolean"


    // $ANTLR start "entryRuleunString"
    // InternalLegoLang.g:2147:1: entryRuleunString returns [EObject current=null] : iv_ruleunString= ruleunString EOF ;
    public final EObject entryRuleunString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunString = null;


        try {
            // InternalLegoLang.g:2147:49: (iv_ruleunString= ruleunString EOF )
            // InternalLegoLang.g:2148:2: iv_ruleunString= ruleunString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnStringRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleunString=ruleunString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleunString; 
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
    // $ANTLR end "entryRuleunString"


    // $ANTLR start "ruleunString"
    // InternalLegoLang.g:2154:1: ruleunString returns [EObject current=null] : ( () ( (lv_isConst_1_0= 'const' ) )? otherlv_2= 'string' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '=' ( (lv_initialeValue_5_0= ruleEString ) ) )? otherlv_6= ';' ) ;
    public final EObject ruleunString() throws RecognitionException {
        EObject current = null;

        Token lv_isConst_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_initialeValue_5_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:2160:2: ( ( () ( (lv_isConst_1_0= 'const' ) )? otherlv_2= 'string' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '=' ( (lv_initialeValue_5_0= ruleEString ) ) )? otherlv_6= ';' ) )
            // InternalLegoLang.g:2161:2: ( () ( (lv_isConst_1_0= 'const' ) )? otherlv_2= 'string' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '=' ( (lv_initialeValue_5_0= ruleEString ) ) )? otherlv_6= ';' )
            {
            // InternalLegoLang.g:2161:2: ( () ( (lv_isConst_1_0= 'const' ) )? otherlv_2= 'string' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '=' ( (lv_initialeValue_5_0= ruleEString ) ) )? otherlv_6= ';' )
            // InternalLegoLang.g:2162:3: () ( (lv_isConst_1_0= 'const' ) )? otherlv_2= 'string' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '=' ( (lv_initialeValue_5_0= ruleEString ) ) )? otherlv_6= ';'
            {
            // InternalLegoLang.g:2162:3: ()
            // InternalLegoLang.g:2163:4: 
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

            // InternalLegoLang.g:2172:3: ( (lv_isConst_1_0= 'const' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==36) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalLegoLang.g:2173:4: (lv_isConst_1_0= 'const' )
                    {
                    // InternalLegoLang.g:2173:4: (lv_isConst_1_0= 'const' )
                    // InternalLegoLang.g:2174:5: lv_isConst_1_0= 'const'
                    {
                    lv_isConst_1_0=(Token)match(input,36,FOLLOW_34); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,42,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getUnStringAccess().getStringKeyword_2());
              		
            }
            // InternalLegoLang.g:2190:3: ( (lv_name_3_0= ruleEString ) )
            // InternalLegoLang.g:2191:4: (lv_name_3_0= ruleEString )
            {
            // InternalLegoLang.g:2191:4: (lv_name_3_0= ruleEString )
            // InternalLegoLang.g:2192:5: lv_name_3_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getUnStringAccess().getNameEStringParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_28);
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

            // InternalLegoLang.g:2209:3: (otherlv_4= '=' ( (lv_initialeValue_5_0= ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==31) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalLegoLang.g:2210:4: otherlv_4= '=' ( (lv_initialeValue_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getUnStringAccess().getEqualsSignKeyword_4_0());
                      			
                    }
                    // InternalLegoLang.g:2214:4: ( (lv_initialeValue_5_0= ruleEString ) )
                    // InternalLegoLang.g:2215:5: (lv_initialeValue_5_0= ruleEString )
                    {
                    // InternalLegoLang.g:2215:5: (lv_initialeValue_5_0= ruleEString )
                    // InternalLegoLang.g:2216:6: lv_initialeValue_5_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getUnStringAccess().getInitialeValueEStringParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_30);
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

            otherlv_6=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
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
    // $ANTLR end "ruleunString"


    // $ANTLR start "entryRuleTheDouble"
    // InternalLegoLang.g:2242:1: entryRuleTheDouble returns [EObject current=null] : iv_ruleTheDouble= ruleTheDouble EOF ;
    public final EObject entryRuleTheDouble() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTheDouble = null;


        try {
            // InternalLegoLang.g:2242:50: (iv_ruleTheDouble= ruleTheDouble EOF )
            // InternalLegoLang.g:2243:2: iv_ruleTheDouble= ruleTheDouble EOF
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
    // InternalLegoLang.g:2249:1: ruleTheDouble returns [EObject current=null] : ( () ( (lv_value1_1_0= ruleEInt ) ) (otherlv_2= '.' ( (lv_value2_3_0= ruleEInt ) ) )? ) ;
    public final EObject ruleTheDouble() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_value1_1_0 = null;

        AntlrDatatypeRuleToken lv_value2_3_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:2255:2: ( ( () ( (lv_value1_1_0= ruleEInt ) ) (otherlv_2= '.' ( (lv_value2_3_0= ruleEInt ) ) )? ) )
            // InternalLegoLang.g:2256:2: ( () ( (lv_value1_1_0= ruleEInt ) ) (otherlv_2= '.' ( (lv_value2_3_0= ruleEInt ) ) )? )
            {
            // InternalLegoLang.g:2256:2: ( () ( (lv_value1_1_0= ruleEInt ) ) (otherlv_2= '.' ( (lv_value2_3_0= ruleEInt ) ) )? )
            // InternalLegoLang.g:2257:3: () ( (lv_value1_1_0= ruleEInt ) ) (otherlv_2= '.' ( (lv_value2_3_0= ruleEInt ) ) )?
            {
            // InternalLegoLang.g:2257:3: ()
            // InternalLegoLang.g:2258:4: 
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

            // InternalLegoLang.g:2267:3: ( (lv_value1_1_0= ruleEInt ) )
            // InternalLegoLang.g:2268:4: (lv_value1_1_0= ruleEInt )
            {
            // InternalLegoLang.g:2268:4: (lv_value1_1_0= ruleEInt )
            // InternalLegoLang.g:2269:5: lv_value1_1_0= ruleEInt
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTheDoubleAccess().getValue1EIntParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_35);
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

            // InternalLegoLang.g:2286:3: (otherlv_2= '.' ( (lv_value2_3_0= ruleEInt ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==40) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalLegoLang.g:2287:4: otherlv_2= '.' ( (lv_value2_3_0= ruleEInt ) )
                    {
                    otherlv_2=(Token)match(input,40,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getTheDoubleAccess().getFullStopKeyword_2_0());
                      			
                    }
                    // InternalLegoLang.g:2291:4: ( (lv_value2_3_0= ruleEInt ) )
                    // InternalLegoLang.g:2292:5: (lv_value2_3_0= ruleEInt )
                    {
                    // InternalLegoLang.g:2292:5: (lv_value2_3_0= ruleEInt )
                    // InternalLegoLang.g:2293:6: lv_value2_3_0= ruleEInt
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTheDoubleAccess().getValue2EIntParserRuleCall_2_1_0());
                      					
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
    // $ANTLR end "ruleTheDouble"


    // $ANTLR start "entryRuleTheInt"
    // InternalLegoLang.g:2315:1: entryRuleTheInt returns [EObject current=null] : iv_ruleTheInt= ruleTheInt EOF ;
    public final EObject entryRuleTheInt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTheInt = null;


        try {
            // InternalLegoLang.g:2315:47: (iv_ruleTheInt= ruleTheInt EOF )
            // InternalLegoLang.g:2316:2: iv_ruleTheInt= ruleTheInt EOF
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
    // InternalLegoLang.g:2322:1: ruleTheInt returns [EObject current=null] : ( () ( (lv_value_1_0= ruleEInt ) ) ) ;
    public final EObject ruleTheInt() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:2328:2: ( ( () ( (lv_value_1_0= ruleEInt ) ) ) )
            // InternalLegoLang.g:2329:2: ( () ( (lv_value_1_0= ruleEInt ) ) )
            {
            // InternalLegoLang.g:2329:2: ( () ( (lv_value_1_0= ruleEInt ) ) )
            // InternalLegoLang.g:2330:3: () ( (lv_value_1_0= ruleEInt ) )
            {
            // InternalLegoLang.g:2330:3: ()
            // InternalLegoLang.g:2331:4: 
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

            // InternalLegoLang.g:2340:3: ( (lv_value_1_0= ruleEInt ) )
            // InternalLegoLang.g:2341:4: (lv_value_1_0= ruleEInt )
            {
            // InternalLegoLang.g:2341:4: (lv_value_1_0= ruleEInt )
            // InternalLegoLang.g:2342:5: lv_value_1_0= ruleEInt
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
    // InternalLegoLang.g:2363:1: entryRuleTheBoolean returns [EObject current=null] : iv_ruleTheBoolean= ruleTheBoolean EOF ;
    public final EObject entryRuleTheBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTheBoolean = null;


        try {
            // InternalLegoLang.g:2363:51: (iv_ruleTheBoolean= ruleTheBoolean EOF )
            // InternalLegoLang.g:2364:2: iv_ruleTheBoolean= ruleTheBoolean EOF
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
    // InternalLegoLang.g:2370:1: ruleTheBoolean returns [EObject current=null] : ( () ( (lv_value_1_0= ruleEBoolean ) ) ) ;
    public final EObject ruleTheBoolean() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:2376:2: ( ( () ( (lv_value_1_0= ruleEBoolean ) ) ) )
            // InternalLegoLang.g:2377:2: ( () ( (lv_value_1_0= ruleEBoolean ) ) )
            {
            // InternalLegoLang.g:2377:2: ( () ( (lv_value_1_0= ruleEBoolean ) ) )
            // InternalLegoLang.g:2378:3: () ( (lv_value_1_0= ruleEBoolean ) )
            {
            // InternalLegoLang.g:2378:3: ()
            // InternalLegoLang.g:2379:4: 
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

            // InternalLegoLang.g:2388:3: ( (lv_value_1_0= ruleEBoolean ) )
            // InternalLegoLang.g:2389:4: (lv_value_1_0= ruleEBoolean )
            {
            // InternalLegoLang.g:2389:4: (lv_value_1_0= ruleEBoolean )
            // InternalLegoLang.g:2390:5: lv_value_1_0= ruleEBoolean
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
    // InternalLegoLang.g:2411:1: entryRuleTheString returns [EObject current=null] : iv_ruleTheString= ruleTheString EOF ;
    public final EObject entryRuleTheString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTheString = null;


        try {
            // InternalLegoLang.g:2411:50: (iv_ruleTheString= ruleTheString EOF )
            // InternalLegoLang.g:2412:2: iv_ruleTheString= ruleTheString EOF
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
    // InternalLegoLang.g:2418:1: ruleTheString returns [EObject current=null] : ( () ( (lv_value_1_0= ruleEString ) ) ) ;
    public final EObject ruleTheString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalLegoLang.g:2424:2: ( ( () ( (lv_value_1_0= ruleEString ) ) ) )
            // InternalLegoLang.g:2425:2: ( () ( (lv_value_1_0= ruleEString ) ) )
            {
            // InternalLegoLang.g:2425:2: ( () ( (lv_value_1_0= ruleEString ) ) )
            // InternalLegoLang.g:2426:3: () ( (lv_value_1_0= ruleEString ) )
            {
            // InternalLegoLang.g:2426:3: ()
            // InternalLegoLang.g:2427:4: 
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

            // InternalLegoLang.g:2436:3: ( (lv_value_1_0= ruleEString ) )
            // InternalLegoLang.g:2437:4: (lv_value_1_0= ruleEString )
            {
            // InternalLegoLang.g:2437:4: (lv_value_1_0= ruleEString )
            // InternalLegoLang.g:2438:5: lv_value_1_0= ruleEString
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


    // $ANTLR start "entryRuleEInt"
    // InternalLegoLang.g:2459:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalLegoLang.g:2459:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalLegoLang.g:2460:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalLegoLang.g:2466:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalLegoLang.g:2472:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalLegoLang.g:2473:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalLegoLang.g:2473:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalLegoLang.g:2474:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalLegoLang.g:2474:3: (kw= '-' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==20) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalLegoLang.g:2475:4: kw= '-'
                    {
                    kw=(Token)match(input,20,FOLLOW_36); if (state.failed) return current;
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

    // $ANTLR start synpred6_InternalLegoLang
    public final void synpred6_InternalLegoLang_fragment() throws RecognitionException {   
        EObject this_VariableRef_0 = null;


        // InternalLegoLang.g:242:3: (this_VariableRef_0= ruleVariableRef )
        // InternalLegoLang.g:242:3: this_VariableRef_0= ruleVariableRef
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
    // $ANTLR end synpred6_InternalLegoLang

    // $ANTLR start synpred8_InternalLegoLang
    public final void synpred8_InternalLegoLang_fragment() throws RecognitionException {   
        EObject this_TheString_2 = null;


        // InternalLegoLang.g:266:3: (this_TheString_2= ruleTheString )
        // InternalLegoLang.g:266:3: this_TheString_2= ruleTheString
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
    // $ANTLR end synpred8_InternalLegoLang

    // $ANTLR start synpred9_InternalLegoLang
    public final void synpred9_InternalLegoLang_fragment() throws RecognitionException {   
        EObject this_TheDouble_3 = null;


        // InternalLegoLang.g:278:3: (this_TheDouble_3= ruleTheDouble )
        // InternalLegoLang.g:278:3: this_TheDouble_3= ruleTheDouble
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_TheDouble_3=ruleTheDouble();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_InternalLegoLang

    // $ANTLR start synpred10_InternalLegoLang
    public final void synpred10_InternalLegoLang_fragment() throws RecognitionException {   
        EObject this_TheInt_4 = null;


        // InternalLegoLang.g:290:3: (this_TheInt_4= ruleTheInt )
        // InternalLegoLang.g:290:3: this_TheInt_4= ruleTheInt
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_TheInt_4=ruleTheInt();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred10_InternalLegoLang

    // $ANTLR start synpred11_InternalLegoLang
    public final void synpred11_InternalLegoLang_fragment() throws RecognitionException {   
        EObject this_Substraction_0 = null;


        // InternalLegoLang.g:332:3: (this_Substraction_0= ruleSubstraction )
        // InternalLegoLang.g:332:3: this_Substraction_0= ruleSubstraction
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
    // $ANTLR end synpred11_InternalLegoLang

    // $ANTLR start synpred12_InternalLegoLang
    public final void synpred12_InternalLegoLang_fragment() throws RecognitionException {   
        EObject this_Comparaison_1 = null;


        // InternalLegoLang.g:344:3: (this_Comparaison_1= ruleComparaison )
        // InternalLegoLang.g:344:3: this_Comparaison_1= ruleComparaison
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
    // $ANTLR end synpred12_InternalLegoLang

    // $ANTLR start synpred13_InternalLegoLang
    public final void synpred13_InternalLegoLang_fragment() throws RecognitionException {   
        EObject this_Assignement_2 = null;


        // InternalLegoLang.g:356:3: (this_Assignement_2= ruleAssignement )
        // InternalLegoLang.g:356:3: this_Assignement_2= ruleAssignement
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
    // $ANTLR end synpred13_InternalLegoLang

    // $ANTLR start synpred14_InternalLegoLang
    public final void synpred14_InternalLegoLang_fragment() throws RecognitionException {   
        EObject this_Division_3 = null;


        // InternalLegoLang.g:368:3: (this_Division_3= ruleDivision )
        // InternalLegoLang.g:368:3: this_Division_3= ruleDivision
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
    // $ANTLR end synpred14_InternalLegoLang

    // $ANTLR start synpred15_InternalLegoLang
    public final void synpred15_InternalLegoLang_fragment() throws RecognitionException {   
        EObject this_Multiplication_4 = null;


        // InternalLegoLang.g:380:3: (this_Multiplication_4= ruleMultiplication )
        // InternalLegoLang.g:380:3: this_Multiplication_4= ruleMultiplication
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
    // $ANTLR end synpred15_InternalLegoLang

    // $ANTLR start synpred16_InternalLegoLang
    public final void synpred16_InternalLegoLang_fragment() throws RecognitionException {   
        EObject this_Addition_5 = null;


        // InternalLegoLang.g:392:3: (this_Addition_5= ruleAddition )
        // InternalLegoLang.g:392:3: this_Addition_5= ruleAddition
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
    // $ANTLR end synpred16_InternalLegoLang

    // $ANTLR start synpred17_InternalLegoLang
    public final void synpred17_InternalLegoLang_fragment() throws RecognitionException {   
        EObject this_MinusEqual_6 = null;


        // InternalLegoLang.g:404:3: (this_MinusEqual_6= ruleMinusEqual )
        // InternalLegoLang.g:404:3: this_MinusEqual_6= ruleMinusEqual
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
    // $ANTLR end synpred17_InternalLegoLang

    // $ANTLR start synpred21_InternalLegoLang
    public final void synpred21_InternalLegoLang_fragment() throws RecognitionException {   
        EObject this_GT_0 = null;


        // InternalLegoLang.g:512:3: (this_GT_0= ruleGT )
        // InternalLegoLang.g:512:3: this_GT_0= ruleGT
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
    // $ANTLR end synpred21_InternalLegoLang

    // $ANTLR start synpred22_InternalLegoLang
    public final void synpred22_InternalLegoLang_fragment() throws RecognitionException {   
        EObject this_Equal_1 = null;


        // InternalLegoLang.g:524:3: (this_Equal_1= ruleEqual )
        // InternalLegoLang.g:524:3: this_Equal_1= ruleEqual
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
    // $ANTLR end synpred22_InternalLegoLang

    // $ANTLR start synpred23_InternalLegoLang
    public final void synpred23_InternalLegoLang_fragment() throws RecognitionException {   
        EObject this_LT_2 = null;


        // InternalLegoLang.g:536:3: (this_LT_2= ruleLT )
        // InternalLegoLang.g:536:3: this_LT_2= ruleLT
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
    // $ANTLR end synpred23_InternalLegoLang

    // $ANTLR start synpred24_InternalLegoLang
    public final void synpred24_InternalLegoLang_fragment() throws RecognitionException {   
        EObject this_Different_3 = null;


        // InternalLegoLang.g:548:3: (this_Different_3= ruleDifferent )
        // InternalLegoLang.g:548:3: this_Different_3= ruleDifferent
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
    // $ANTLR end synpred24_InternalLegoLang

    // $ANTLR start synpred25_InternalLegoLang
    public final void synpred25_InternalLegoLang_fragment() throws RecognitionException {   
        EObject this_GTorEqual_4 = null;


        // InternalLegoLang.g:560:3: (this_GTorEqual_4= ruleGTorEqual )
        // InternalLegoLang.g:560:3: this_GTorEqual_4= ruleGTorEqual
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
    // $ANTLR end synpred25_InternalLegoLang

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
    public final boolean synpred6_InternalLegoLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalLegoLang_fragment(); // can never throw exception
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


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\4\2\0\1\uffff\1\6\1\0\5\uffff";
    static final String dfa_3s = "\1\43\2\0\1\uffff\1\6\1\0\5\uffff";
    static final String dfa_4s = "\3\uffff\1\2\2\uffff\1\6\1\1\1\3\1\4\1\5";
    static final String dfa_5s = "\1\uffff\1\1\1\2\2\uffff\1\0\5\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\2\1\5\14\uffff\1\3\1\4\15\uffff\2\6",
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

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "241:2: (this_VariableRef_0= ruleVariableRef | this_BinaryOperation_1= ruleBinaryOperation | this_TheString_2= ruleTheString | this_TheDouble_3= ruleTheDouble | this_TheInt_4= ruleTheInt | this_TheBoolean_5= ruleTheBoolean )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA3_5 = input.LA(1);

                         
                        int index3_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalLegoLang()) ) {s = 9;}

                        else if ( (synpred10_InternalLegoLang()) ) {s = 10;}

                         
                        input.seek(index3_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA3_1 = input.LA(1);

                         
                        int index3_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalLegoLang()) ) {s = 7;}

                        else if ( (synpred8_InternalLegoLang()) ) {s = 8;}

                         
                        input.seek(index3_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA3_2 = input.LA(1);

                         
                        int index3_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalLegoLang()) ) {s = 7;}

                        else if ( (synpred8_InternalLegoLang()) ) {s = 8;}

                         
                        input.seek(index3_2);
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
    static final String dfa_7s = "\12\uffff";
    static final String dfa_8s = "\1\23\1\0\10\uffff";
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

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_8;
            this.accept = dfa_9;
            this.special = dfa_10;
            this.transition = dfa_11;
        }
        public String getDescription() {
            return "331:2: (this_Substraction_0= ruleSubstraction | this_Comparaison_1= ruleComparaison | this_Assignement_2= ruleAssignement | this_Division_3= ruleDivision | this_Multiplication_4= ruleMultiplication | this_Addition_5= ruleAddition | this_MinusEqual_6= ruleMinusEqual | this_PlusEqual_7= rulePlusEqual )";
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
                        if ( (synpred11_InternalLegoLang()) ) {s = 2;}

                        else if ( (synpred12_InternalLegoLang()) ) {s = 3;}

                        else if ( (synpred13_InternalLegoLang()) ) {s = 4;}

                        else if ( (synpred14_InternalLegoLang()) ) {s = 5;}

                        else if ( (synpred15_InternalLegoLang()) ) {s = 6;}

                        else if ( (synpred16_InternalLegoLang()) ) {s = 7;}

                        else if ( (synpred17_InternalLegoLang()) ) {s = 8;}

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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000006BC001B6070L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000006BC001B4070L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000C00180070L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000C001C0070L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004080000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000014000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000040L});

}