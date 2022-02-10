/**
 * generated by Xtext 2.25.0
 */
package langageCompilation.concrete.syntax.generator;

import langageCompilation.Addition;
import langageCompilation.Assignement;
import langageCompilation.BinaryOperation;
import langageCompilation.Comparaison;
import langageCompilation.ConditionEtat;
import langageCompilation.Different;
import langageCompilation.Division;
import langageCompilation.Equal;
import langageCompilation.Expression;
import langageCompilation.GT;
import langageCompilation.GTorEqual;
import langageCompilation.LT;
import langageCompilation.LTorEqual;
import langageCompilation.Loop;
import langageCompilation.MethodePrint;
import langageCompilation.MinusEqual;
import langageCompilation.Multiplication;
import langageCompilation.PlusEqual;
import langageCompilation.Program;
import langageCompilation.Statement;
import langageCompilation.Substraction;
import langageCompilation.TheBoolean;
import langageCompilation.TheDouble;
import langageCompilation.TheInt;
import langageCompilation.TheString;
import langageCompilation.UnBoolean;
import langageCompilation.UnDouble;
import langageCompilation.UnInteger;
import langageCompilation.UnString;
import langageCompilation.Variable;
import langageCompilation.VariableRef;
import langageCompilation.WhileLoop;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class LegoLangGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EObject _head = IteratorExtensions.<EObject>head(resource.getAllContents());
    Program prog = ((Program) _head);
    String fileContent = "";
    EList<Statement> _statement = prog.getStatement();
    for (final Statement v : _statement) {
      {
        String _fileContent = fileContent;
        String _statementToPython = this.statementToPython(v);
        fileContent = (_fileContent + _statementToPython);
        String _fileContent_1 = fileContent;
        fileContent = (_fileContent_1 + "\n");
      }
    }
    String _name = prog.getName();
    String _plus = (_name + ".py");
    fsa.generateFile(_plus, ("#!/usr/bin/env python3\r\n\r\n# Import the necessary libraries\r\nimport time\r\nimport math\r\nfrom ev3dev2.motor import *\r\nfrom ev3dev2.sound import Sound\r\nfrom ev3dev2.button import Button\r\nfrom ev3dev2.sensor import *\r\nfrom ev3dev2.sensor.lego import *\r\nfrom ev3dev2.sensor.virtual import *\n\n" + fileContent));
  }
  
  public String statementToPython(final Statement v) {
    if ((v instanceof Variable)) {
      return this.varToPython(((Variable)v));
    }
    if ((v instanceof Expression)) {
      return this.expressionToPython(((Expression)v));
    }
    if ((v instanceof Loop)) {
      return this.loopToPython(((Loop)v));
    }
    if ((v instanceof ConditionEtat)) {
      String _comparaisonPython = this.comparaisonPython(((ConditionEtat)v).getCondition());
      String _plus = ("if(" + _comparaisonPython);
      String tmp = (_plus + "):");
      EList<Statement> _then = ((ConditionEtat)v).getThen();
      for (final Statement s : _then) {
        String _tmp = tmp;
        String _statementToPython = this.statementToPython(s);
        String _plus_1 = ("\n\t" + _statementToPython);
        tmp = (_tmp + _plus_1);
      }
      EList<Statement> _else = ((ConditionEtat)v).getElse();
      boolean _tripleNotEquals = (_else != null);
      if (_tripleNotEquals) {
        String _tmp_1 = tmp;
        tmp = (_tmp_1 + "\nelse :");
        EList<Statement> _else_1 = ((ConditionEtat)v).getElse();
        for (final Statement s_1 : _else_1) {
          String _tmp_2 = tmp;
          String _statementToPython_1 = this.statementToPython(s_1);
          String _plus_2 = ("\n\t" + _statementToPython_1);
          tmp = (_tmp_2 + _plus_2);
        }
      }
      return tmp;
    }
    if ((v instanceof MethodePrint)) {
      String tmp_1 = "print(";
      EList<Expression> _expression = ((MethodePrint)v).getExpression();
      for (final Expression s_2 : _expression) {
        String _tmp_3 = tmp_1;
        String _expressionToPython = this.expressionToPython(s_2);
        String _plus_3 = (_expressionToPython + ",");
        tmp_1 = (_tmp_3 + _plus_3);
      }
      return (tmp_1 + ")");
    }
    return null;
  }
  
  public String varToPython(final Variable v) {
    if ((v instanceof UnInteger)) {
      String _name = ((UnInteger)v).getName();
      String _plus = (_name + ":int=");
      int _initialeValue = ((UnInteger)v).getInitialeValue();
      return (_plus + Integer.valueOf(_initialeValue));
    }
    if ((v instanceof UnString)) {
      String _name_1 = ((UnString)v).getName();
      String _plus_1 = (_name_1 + ":str=");
      String _initialeValue_1 = ((UnString)v).getInitialeValue();
      return (_plus_1 + _initialeValue_1);
    }
    if ((v instanceof UnBoolean)) {
      String _name_2 = ((UnBoolean)v).getName();
      String _plus_2 = (_name_2 + ":bool=");
      boolean _isInitialeValue = ((UnBoolean)v).isInitialeValue();
      return (_plus_2 + Boolean.valueOf(_isInitialeValue));
    }
    if ((v instanceof UnDouble)) {
      String _name_3 = ((UnDouble)v).getName();
      String _plus_3 = (_name_3 + ":double=");
      int _initialeValue1 = ((UnDouble)v).getInitialeValue1();
      String _plus_4 = (_plus_3 + Integer.valueOf(_initialeValue1));
      String _plus_5 = (_plus_4 + ".");
      int _initialeValue2 = ((UnDouble)v).getInitialeValue2();
      return (_plus_5 + Integer.valueOf(_initialeValue2));
    }
    return null;
  }
  
  public String expressionToPython(final Expression v) {
    if ((v instanceof VariableRef)) {
      return ((VariableRef)v).getVariable().getName();
    }
    if ((v instanceof TheInt)) {
      return Integer.valueOf(((TheInt)v).getValue()).toString();
    }
    if ((v instanceof TheBoolean)) {
      return Boolean.valueOf(((TheBoolean)v).isValue()).toString();
    }
    if ((v instanceof TheString)) {
      return ((TheString)v).getValue();
    }
    if ((v instanceof TheDouble)) {
      String _string = Integer.valueOf(((TheDouble)v).getValue1()).toString();
      String _plus = (_string + ".");
      String _string_1 = Integer.valueOf(((TheDouble)v).getValue2()).toString();
      return (_plus + _string_1);
    }
    if ((v instanceof BinaryOperation)) {
      return this.binaryOperationPython(((BinaryOperation)v));
    }
    return null;
  }
  
  public String binaryOperationPython(final BinaryOperation v) {
    if ((v instanceof Multiplication)) {
      String _expressionToPython = this.expressionToPython(((Multiplication)v).getLeft());
      String _plus = (_expressionToPython + "*");
      String _expressionToPython_1 = this.expressionToPython(((Multiplication)v).getRight());
      return (_plus + _expressionToPython_1);
    }
    if ((v instanceof Addition)) {
      String _expressionToPython_2 = this.expressionToPython(((Addition)v).getLeft());
      String _plus_1 = (_expressionToPython_2 + "+");
      String _expressionToPython_3 = this.expressionToPython(((Addition)v).getRight());
      return (_plus_1 + _expressionToPython_3);
    }
    if ((v instanceof Division)) {
      String _expressionToPython_4 = this.expressionToPython(((Division)v).getLeft());
      String _plus_2 = (_expressionToPython_4 + "/");
      String _expressionToPython_5 = this.expressionToPython(((Division)v).getRight());
      return (_plus_2 + _expressionToPython_5);
    }
    if ((v instanceof Assignement)) {
      String _expressionToPython_6 = this.expressionToPython(((Assignement)v).getLeft());
      String _plus_3 = (_expressionToPython_6 + "=");
      String _expressionToPython_7 = this.expressionToPython(((Assignement)v).getRight());
      return (_plus_3 + _expressionToPython_7);
    }
    if ((v instanceof MinusEqual)) {
      String _expressionToPython_8 = this.expressionToPython(((MinusEqual)v).getLeft());
      String _plus_4 = (_expressionToPython_8 + "-=");
      String _expressionToPython_9 = this.expressionToPython(((MinusEqual)v).getRight());
      return (_plus_4 + _expressionToPython_9);
    }
    if ((v instanceof PlusEqual)) {
      String _expressionToPython_10 = this.expressionToPython(((PlusEqual)v).getLeft());
      String _plus_5 = (_expressionToPython_10 + "+=");
      String _expressionToPython_11 = this.expressionToPython(((PlusEqual)v).getRight());
      return (_plus_5 + _expressionToPython_11);
    }
    if ((v instanceof Substraction)) {
      String _expressionToPython_12 = this.expressionToPython(((Substraction)v).getLeft());
      String _plus_6 = (_expressionToPython_12 + "-");
      String _expressionToPython_13 = this.expressionToPython(((Substraction)v).getRight());
      return (_plus_6 + _expressionToPython_13);
    }
    if ((v instanceof Comparaison)) {
      return this.comparaisonPython(((Comparaison)v));
    }
    return null;
  }
  
  public String comparaisonPython(final Comparaison v) {
    if ((v instanceof GT)) {
      String _expressionToPython = this.expressionToPython(((GT)v).getLeft());
      String _plus = (_expressionToPython + ">");
      String _expressionToPython_1 = this.expressionToPython(((GT)v).getRight());
      return (_plus + _expressionToPython_1);
    }
    if ((v instanceof LT)) {
      String _expressionToPython_2 = this.expressionToPython(((LT)v).getLeft());
      String _plus_1 = (_expressionToPython_2 + "<");
      String _expressionToPython_3 = this.expressionToPython(((LT)v).getRight());
      return (_plus_1 + _expressionToPython_3);
    }
    if ((v instanceof LTorEqual)) {
      String _expressionToPython_4 = this.expressionToPython(((LTorEqual)v).getLeft());
      String _plus_2 = (_expressionToPython_4 + "<=");
      String _expressionToPython_5 = this.expressionToPython(((LTorEqual)v).getRight());
      return (_plus_2 + _expressionToPython_5);
    }
    if ((v instanceof GTorEqual)) {
      String _expressionToPython_6 = this.expressionToPython(((GTorEqual)v).getLeft());
      String _plus_3 = (_expressionToPython_6 + ">=");
      String _expressionToPython_7 = this.expressionToPython(((GTorEqual)v).getRight());
      return (_plus_3 + _expressionToPython_7);
    }
    if ((v instanceof Equal)) {
      String _expressionToPython_8 = this.expressionToPython(((Equal)v).getLeft());
      String _plus_4 = (_expressionToPython_8 + "==");
      String _expressionToPython_9 = this.expressionToPython(((Equal)v).getRight());
      return (_plus_4 + _expressionToPython_9);
    }
    if ((v instanceof Different)) {
      String _expressionToPython_10 = this.expressionToPython(((Different)v).getLeft());
      String _plus_5 = (_expressionToPython_10 + "!=");
      String _expressionToPython_11 = this.expressionToPython(((Different)v).getRight());
      return (_plus_5 + _expressionToPython_11);
    }
    return null;
  }
  
  public String loopToPython(final Loop v) {
    if ((v instanceof WhileLoop)) {
      String _comparaisonPython = this.comparaisonPython(((WhileLoop)v).getLoopCondition());
      String _plus = ("while(" + _comparaisonPython);
      String tmp = (_plus + "): ");
      EList<Statement> _statement = ((WhileLoop)v).getStatement();
      for (final Statement s : _statement) {
        String _tmp = tmp;
        String _statementToPython = this.statementToPython(s);
        String _plus_1 = ("\n\t" + _statementToPython);
        tmp = (_tmp + _plus_1);
      }
      return tmp;
    }
    return null;
  }
}
