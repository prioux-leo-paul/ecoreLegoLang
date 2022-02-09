/**
 */
package langageCompilation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see langageCompilation.LangageCompilationFactory
 * @model kind="package"
 * @generated
 */
public interface LangageCompilationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "langageCompilation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/langageCompilation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "langageCompilation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LangageCompilationPackage eINSTANCE = langageCompilation.impl.LangageCompilationPackageImpl.init();

	/**
	 * The meta object id for the '{@link langageCompilation.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see langageCompilation.impl.ProgramImpl
	 * @see langageCompilation.impl.LangageCompilationPackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 0;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__STATEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__NAME = 1;

	/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link langageCompilation.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see langageCompilation.impl.StatementImpl
	 * @see langageCompilation.impl.LangageCompilationPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link langageCompilation.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see langageCompilation.impl.VariableImpl
	 * @see langageCompilation.impl.LangageCompilationPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__IS_CONST = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link langageCompilation.impl.LoopImpl <em>Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see langageCompilation.impl.LoopImpl
	 * @see langageCompilation.impl.LangageCompilationPackageImpl#getLoop()
	 * @generated
	 */
	int LOOP = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__NAME = STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__STATEMENT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link langageCompilation.impl.WhileLoopImpl <em>While Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see langageCompilation.impl.WhileLoopImpl
	 * @see langageCompilation.impl.LangageCompilationPackageImpl#getWhileLoop()
	 * @generated
	 */
	int WHILE_LOOP = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_LOOP__NAME = LOOP__NAME;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_LOOP__STATEMENT = LOOP__STATEMENT;

	/**
	 * The feature id for the '<em><b>Loop Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_LOOP__LOOP_CONDITION = LOOP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>While Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_LOOP_FEATURE_COUNT = LOOP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>While Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_LOOP_OPERATION_COUNT = LOOP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link langageCompilation.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see langageCompilation.impl.ExpressionImpl
	 * @see langageCompilation.impl.LangageCompilationPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__NAME = STATEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link langageCompilation.impl.BinaryOperationImpl <em>Binary Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see langageCompilation.impl.BinaryOperationImpl
	 * @see langageCompilation.impl.LangageCompilationPackageImpl#getBinaryOperation()
	 * @generated
	 */
	int BINARY_OPERATION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION__NAME = EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binary Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Binary Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link langageCompilation.impl.VariableRefImpl <em>Variable Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see langageCompilation.impl.VariableRefImpl
	 * @see langageCompilation.impl.LangageCompilationPackageImpl#getVariableRef()
	 * @generated
	 */
	int VARIABLE_REF = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REF__NAME = EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REF__VARIABLE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REF_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Variable Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REF_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link langageCompilation.impl.SubstractionImpl <em>Substraction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see langageCompilation.impl.SubstractionImpl
	 * @see langageCompilation.impl.LangageCompilationPackageImpl#getSubstraction()
	 * @generated
	 */
	int SUBSTRACTION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTRACTION__NAME = BINARY_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTRACTION__LEFT = BINARY_OPERATION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTRACTION__RIGHT = BINARY_OPERATION__RIGHT;

	/**
	 * The number of structural features of the '<em>Substraction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTRACTION_FEATURE_COUNT = BINARY_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Substraction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTRACTION_OPERATION_COUNT = BINARY_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link langageCompilation.impl.ComparaisonImpl <em>Comparaison</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see langageCompilation.impl.ComparaisonImpl
	 * @see langageCompilation.impl.LangageCompilationPackageImpl#getComparaison()
	 * @generated
	 */
	int COMPARAISON = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARAISON__NAME = BINARY_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARAISON__LEFT = BINARY_OPERATION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARAISON__RIGHT = BINARY_OPERATION__RIGHT;

	/**
	 * The number of structural features of the '<em>Comparaison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARAISON_FEATURE_COUNT = BINARY_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Comparaison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARAISON_OPERATION_COUNT = BINARY_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link langageCompilation.impl.GTImpl <em>GT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see langageCompilation.impl.GTImpl
	 * @see langageCompilation.impl.LangageCompilationPackageImpl#getGT()
	 * @generated
	 */
	int GT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT__NAME = COMPARAISON__NAME;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT__LEFT = COMPARAISON__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT__RIGHT = COMPARAISON__RIGHT;

	/**
	 * The number of structural features of the '<em>GT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT_FEATURE_COUNT = COMPARAISON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>GT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT_OPERATION_COUNT = COMPARAISON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link langageCompilation.impl.AssignementImpl <em>Assignement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see langageCompilation.impl.AssignementImpl
	 * @see langageCompilation.impl.LangageCompilationPackageImpl#getAssignement()
	 * @generated
	 */
	int ASSIGNEMENT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNEMENT__NAME = BINARY_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNEMENT__LEFT = BINARY_OPERATION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNEMENT__RIGHT = BINARY_OPERATION__RIGHT;

	/**
	 * The number of structural features of the '<em>Assignement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNEMENT_FEATURE_COUNT = BINARY_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Assignement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNEMENT_OPERATION_COUNT = BINARY_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link langageCompilation.impl.unIntegerImpl <em>un Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see langageCompilation.impl.unIntegerImpl
	 * @see langageCompilation.impl.LangageCompilationPackageImpl#getunInteger()
	 * @generated
	 */
	int UN_INTEGER = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UN_INTEGER__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UN_INTEGER__IS_CONST = VARIABLE__IS_CONST;

	/**
	 * The feature id for the '<em><b>Initiale Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UN_INTEGER__INITIALE_VALUE = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>un Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UN_INTEGER_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>un Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UN_INTEGER_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link langageCompilation.impl.unStringImpl <em>un String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see langageCompilation.impl.unStringImpl
	 * @see langageCompilation.impl.LangageCompilationPackageImpl#getunString()
	 * @generated
	 */
	int UN_STRING = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UN_STRING__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UN_STRING__IS_CONST = VARIABLE__IS_CONST;

	/**
	 * The feature id for the '<em><b>Initiale Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UN_STRING__INITIALE_VALUE = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>un String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UN_STRING_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>un String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UN_STRING_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link langageCompilation.impl.LTImpl <em>LT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see langageCompilation.impl.LTImpl
	 * @see langageCompilation.impl.LangageCompilationPackageImpl#getLT()
	 * @generated
	 */
	int LT = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LT__NAME = COMPARAISON__NAME;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LT__LEFT = COMPARAISON__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LT__RIGHT = COMPARAISON__RIGHT;

	/**
	 * The number of structural features of the '<em>LT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LT_FEATURE_COUNT = COMPARAISON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>LT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LT_OPERATION_COUNT = COMPARAISON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link langageCompilation.impl.EqualImpl <em>Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see langageCompilation.impl.EqualImpl
	 * @see langageCompilation.impl.LangageCompilationPackageImpl#getEqual()
	 * @generated
	 */
	int EQUAL = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL__NAME = COMPARAISON__NAME;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL__LEFT = COMPARAISON__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL__RIGHT = COMPARAISON__RIGHT;

	/**
	 * The number of structural features of the '<em>Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_FEATURE_COUNT = COMPARAISON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_OPERATION_COUNT = COMPARAISON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link langageCompilation.impl.AdditionImpl <em>Addition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see langageCompilation.impl.AdditionImpl
	 * @see langageCompilation.impl.LangageCompilationPackageImpl#getAddition()
	 * @generated
	 */
	int ADDITION = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION__NAME = BINARY_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION__LEFT = BINARY_OPERATION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION__RIGHT = BINARY_OPERATION__RIGHT;

	/**
	 * The number of structural features of the '<em>Addition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_FEATURE_COUNT = BINARY_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Addition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_OPERATION_COUNT = BINARY_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link langageCompilation.impl.DivisionImpl <em>Division</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see langageCompilation.impl.DivisionImpl
	 * @see langageCompilation.impl.LangageCompilationPackageImpl#getDivision()
	 * @generated
	 */
	int DIVISION = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__NAME = BINARY_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__LEFT = BINARY_OPERATION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__RIGHT = BINARY_OPERATION__RIGHT;

	/**
	 * The number of structural features of the '<em>Division</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION_FEATURE_COUNT = BINARY_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Division</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION_OPERATION_COUNT = BINARY_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link langageCompilation.impl.MultiplicationImpl <em>Multiplication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see langageCompilation.impl.MultiplicationImpl
	 * @see langageCompilation.impl.LangageCompilationPackageImpl#getMultiplication()
	 * @generated
	 */
	int MULTIPLICATION = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION__NAME = BINARY_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION__LEFT = BINARY_OPERATION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION__RIGHT = BINARY_OPERATION__RIGHT;

	/**
	 * The number of structural features of the '<em>Multiplication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION_FEATURE_COUNT = BINARY_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Multiplication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION_OPERATION_COUNT = BINARY_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link langageCompilation.impl.LTorEqualImpl <em>LTor Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see langageCompilation.impl.LTorEqualImpl
	 * @see langageCompilation.impl.LangageCompilationPackageImpl#getLTorEqual()
	 * @generated
	 */
	int LTOR_EQUAL = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTOR_EQUAL__NAME = COMPARAISON__NAME;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTOR_EQUAL__LEFT = COMPARAISON__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTOR_EQUAL__RIGHT = COMPARAISON__RIGHT;

	/**
	 * The number of structural features of the '<em>LTor Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTOR_EQUAL_FEATURE_COUNT = COMPARAISON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>LTor Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTOR_EQUAL_OPERATION_COUNT = COMPARAISON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link langageCompilation.impl.GTorEqualImpl <em>GTor Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see langageCompilation.impl.GTorEqualImpl
	 * @see langageCompilation.impl.LangageCompilationPackageImpl#getGTorEqual()
	 * @generated
	 */
	int GTOR_EQUAL = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTOR_EQUAL__NAME = COMPARAISON__NAME;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTOR_EQUAL__LEFT = COMPARAISON__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTOR_EQUAL__RIGHT = COMPARAISON__RIGHT;

	/**
	 * The number of structural features of the '<em>GTor Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTOR_EQUAL_FEATURE_COUNT = COMPARAISON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>GTor Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTOR_EQUAL_OPERATION_COUNT = COMPARAISON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link langageCompilation.impl.unBooleanImpl <em>un Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see langageCompilation.impl.unBooleanImpl
	 * @see langageCompilation.impl.LangageCompilationPackageImpl#getunBoolean()
	 * @generated
	 */
	int UN_BOOLEAN = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UN_BOOLEAN__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UN_BOOLEAN__IS_CONST = VARIABLE__IS_CONST;

	/**
	 * The feature id for the '<em><b>Initiale Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UN_BOOLEAN__INITIALE_VALUE = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>un Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UN_BOOLEAN_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>un Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UN_BOOLEAN_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link langageCompilation.impl.DifferentImpl <em>Different</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see langageCompilation.impl.DifferentImpl
	 * @see langageCompilation.impl.LangageCompilationPackageImpl#getDifferent()
	 * @generated
	 */
	int DIFFERENT = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENT__NAME = COMPARAISON__NAME;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENT__LEFT = COMPARAISON__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENT__RIGHT = COMPARAISON__RIGHT;

	/**
	 * The number of structural features of the '<em>Different</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENT_FEATURE_COUNT = COMPARAISON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Different</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENT_OPERATION_COUNT = COMPARAISON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link langageCompilation.impl.ConditionEtatImpl <em>Condition Etat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see langageCompilation.impl.ConditionEtatImpl
	 * @see langageCompilation.impl.LangageCompilationPackageImpl#getConditionEtat()
	 * @generated
	 */
	int CONDITION_ETAT = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ETAT__NAME = STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Then</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ETAT__THEN = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Else</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ETAT__ELSE = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ETAT__CONDITION = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Condition Etat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ETAT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Condition Etat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ETAT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link langageCompilation.impl.MethodePrintImpl <em>Methode Print</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see langageCompilation.impl.MethodePrintImpl
	 * @see langageCompilation.impl.LangageCompilationPackageImpl#getMethodePrint()
	 * @generated
	 */
	int METHODE_PRINT = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHODE_PRINT__NAME = STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHODE_PRINT__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Methode Print</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHODE_PRINT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Methode Print</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHODE_PRINT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link langageCompilation.impl.unDoubleImpl <em>un Double</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see langageCompilation.impl.unDoubleImpl
	 * @see langageCompilation.impl.LangageCompilationPackageImpl#getunDouble()
	 * @generated
	 */
	int UN_DOUBLE = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UN_DOUBLE__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UN_DOUBLE__IS_CONST = VARIABLE__IS_CONST;

	/**
	 * The feature id for the '<em><b>Initiale Value1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UN_DOUBLE__INITIALE_VALUE1 = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initiale Value2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UN_DOUBLE__INITIALE_VALUE2 = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>un Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UN_DOUBLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>un Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UN_DOUBLE_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link langageCompilation.impl.TheBooleanImpl <em>The Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see langageCompilation.impl.TheBooleanImpl
	 * @see langageCompilation.impl.LangageCompilationPackageImpl#getTheBoolean()
	 * @generated
	 */
	int THE_BOOLEAN = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THE_BOOLEAN__NAME = EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THE_BOOLEAN__VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>The Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THE_BOOLEAN_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>The Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THE_BOOLEAN_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link langageCompilation.impl.TheDoubleImpl <em>The Double</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see langageCompilation.impl.TheDoubleImpl
	 * @see langageCompilation.impl.LangageCompilationPackageImpl#getTheDouble()
	 * @generated
	 */
	int THE_DOUBLE = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THE_DOUBLE__NAME = EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Value1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THE_DOUBLE__VALUE1 = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THE_DOUBLE__VALUE2 = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>The Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THE_DOUBLE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>The Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THE_DOUBLE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link langageCompilation.impl.TheIntImpl <em>The Int</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see langageCompilation.impl.TheIntImpl
	 * @see langageCompilation.impl.LangageCompilationPackageImpl#getTheInt()
	 * @generated
	 */
	int THE_INT = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THE_INT__NAME = EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THE_INT__VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>The Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THE_INT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>The Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THE_INT_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link langageCompilation.impl.TheStringImpl <em>The String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see langageCompilation.impl.TheStringImpl
	 * @see langageCompilation.impl.LangageCompilationPackageImpl#getTheString()
	 * @generated
	 */
	int THE_STRING = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THE_STRING__NAME = EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THE_STRING__VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>The String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THE_STRING_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>The String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THE_STRING_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link langageCompilation.impl.PlusEqualImpl <em>Plus Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see langageCompilation.impl.PlusEqualImpl
	 * @see langageCompilation.impl.LangageCompilationPackageImpl#getPlusEqual()
	 * @generated
	 */
	int PLUS_EQUAL = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_EQUAL__NAME = BINARY_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_EQUAL__LEFT = BINARY_OPERATION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_EQUAL__RIGHT = BINARY_OPERATION__RIGHT;

	/**
	 * The number of structural features of the '<em>Plus Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_EQUAL_FEATURE_COUNT = BINARY_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Plus Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_EQUAL_OPERATION_COUNT = BINARY_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link langageCompilation.impl.MinusEqualImpl <em>Minus Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see langageCompilation.impl.MinusEqualImpl
	 * @see langageCompilation.impl.LangageCompilationPackageImpl#getMinusEqual()
	 * @generated
	 */
	int MINUS_EQUAL = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_EQUAL__NAME = BINARY_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_EQUAL__LEFT = BINARY_OPERATION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_EQUAL__RIGHT = BINARY_OPERATION__RIGHT;

	/**
	 * The number of structural features of the '<em>Minus Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_EQUAL_FEATURE_COUNT = BINARY_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Minus Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_EQUAL_OPERATION_COUNT = BINARY_OPERATION_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link langageCompilation.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see langageCompilation.Program
	 * @generated
	 */
	EClass getProgram();

	/**
	 * Returns the meta object for the containment reference list '{@link langageCompilation.Program#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statement</em>'.
	 * @see langageCompilation.Program#getStatement()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Statement();

	/**
	 * Returns the meta object for the attribute '{@link langageCompilation.Program#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see langageCompilation.Program#getName()
	 * @see #getProgram()
	 * @generated
	 */
	EAttribute getProgram_Name();

	/**
	 * Returns the meta object for class '{@link langageCompilation.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see langageCompilation.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for the attribute '{@link langageCompilation.Statement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see langageCompilation.Statement#getName()
	 * @see #getStatement()
	 * @generated
	 */
	EAttribute getStatement_Name();

	/**
	 * Returns the meta object for class '{@link langageCompilation.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see langageCompilation.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link langageCompilation.Variable#isIsConst <em>Is Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Const</em>'.
	 * @see langageCompilation.Variable#isIsConst()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_IsConst();

	/**
	 * Returns the meta object for class '{@link langageCompilation.Loop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop</em>'.
	 * @see langageCompilation.Loop
	 * @generated
	 */
	EClass getLoop();

	/**
	 * Returns the meta object for the containment reference list '{@link langageCompilation.Loop#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statement</em>'.
	 * @see langageCompilation.Loop#getStatement()
	 * @see #getLoop()
	 * @generated
	 */
	EReference getLoop_Statement();

	/**
	 * Returns the meta object for class '{@link langageCompilation.WhileLoop <em>While Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>While Loop</em>'.
	 * @see langageCompilation.WhileLoop
	 * @generated
	 */
	EClass getWhileLoop();

	/**
	 * Returns the meta object for the containment reference '{@link langageCompilation.WhileLoop#getLoopCondition <em>Loop Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Loop Condition</em>'.
	 * @see langageCompilation.WhileLoop#getLoopCondition()
	 * @see #getWhileLoop()
	 * @generated
	 */
	EReference getWhileLoop_LoopCondition();

	/**
	 * Returns the meta object for class '{@link langageCompilation.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see langageCompilation.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link langageCompilation.BinaryOperation <em>Binary Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Operation</em>'.
	 * @see langageCompilation.BinaryOperation
	 * @generated
	 */
	EClass getBinaryOperation();

	/**
	 * Returns the meta object for the containment reference '{@link langageCompilation.BinaryOperation#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see langageCompilation.BinaryOperation#getLeft()
	 * @see #getBinaryOperation()
	 * @generated
	 */
	EReference getBinaryOperation_Left();

	/**
	 * Returns the meta object for the containment reference '{@link langageCompilation.BinaryOperation#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see langageCompilation.BinaryOperation#getRight()
	 * @see #getBinaryOperation()
	 * @generated
	 */
	EReference getBinaryOperation_Right();

	/**
	 * Returns the meta object for class '{@link langageCompilation.VariableRef <em>Variable Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Ref</em>'.
	 * @see langageCompilation.VariableRef
	 * @generated
	 */
	EClass getVariableRef();

	/**
	 * Returns the meta object for the reference '{@link langageCompilation.VariableRef#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see langageCompilation.VariableRef#getVariable()
	 * @see #getVariableRef()
	 * @generated
	 */
	EReference getVariableRef_Variable();

	/**
	 * Returns the meta object for class '{@link langageCompilation.Substraction <em>Substraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Substraction</em>'.
	 * @see langageCompilation.Substraction
	 * @generated
	 */
	EClass getSubstraction();

	/**
	 * Returns the meta object for class '{@link langageCompilation.Comparaison <em>Comparaison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparaison</em>'.
	 * @see langageCompilation.Comparaison
	 * @generated
	 */
	EClass getComparaison();

	/**
	 * Returns the meta object for class '{@link langageCompilation.GT <em>GT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GT</em>'.
	 * @see langageCompilation.GT
	 * @generated
	 */
	EClass getGT();

	/**
	 * Returns the meta object for class '{@link langageCompilation.Assignement <em>Assignement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignement</em>'.
	 * @see langageCompilation.Assignement
	 * @generated
	 */
	EClass getAssignement();

	/**
	 * Returns the meta object for class '{@link langageCompilation.unInteger <em>un Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>un Integer</em>'.
	 * @see langageCompilation.unInteger
	 * @generated
	 */
	EClass getunInteger();

	/**
	 * Returns the meta object for the attribute '{@link langageCompilation.unInteger#getInitialeValue <em>Initiale Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initiale Value</em>'.
	 * @see langageCompilation.unInteger#getInitialeValue()
	 * @see #getunInteger()
	 * @generated
	 */
	EAttribute getunInteger_InitialeValue();

	/**
	 * Returns the meta object for class '{@link langageCompilation.unString <em>un String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>un String</em>'.
	 * @see langageCompilation.unString
	 * @generated
	 */
	EClass getunString();

	/**
	 * Returns the meta object for the attribute '{@link langageCompilation.unString#getInitialeValue <em>Initiale Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initiale Value</em>'.
	 * @see langageCompilation.unString#getInitialeValue()
	 * @see #getunString()
	 * @generated
	 */
	EAttribute getunString_InitialeValue();

	/**
	 * Returns the meta object for class '{@link langageCompilation.LT <em>LT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LT</em>'.
	 * @see langageCompilation.LT
	 * @generated
	 */
	EClass getLT();

	/**
	 * Returns the meta object for class '{@link langageCompilation.Equal <em>Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equal</em>'.
	 * @see langageCompilation.Equal
	 * @generated
	 */
	EClass getEqual();

	/**
	 * Returns the meta object for class '{@link langageCompilation.Addition <em>Addition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Addition</em>'.
	 * @see langageCompilation.Addition
	 * @generated
	 */
	EClass getAddition();

	/**
	 * Returns the meta object for class '{@link langageCompilation.Division <em>Division</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Division</em>'.
	 * @see langageCompilation.Division
	 * @generated
	 */
	EClass getDivision();

	/**
	 * Returns the meta object for class '{@link langageCompilation.Multiplication <em>Multiplication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplication</em>'.
	 * @see langageCompilation.Multiplication
	 * @generated
	 */
	EClass getMultiplication();

	/**
	 * Returns the meta object for class '{@link langageCompilation.LTorEqual <em>LTor Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LTor Equal</em>'.
	 * @see langageCompilation.LTorEqual
	 * @generated
	 */
	EClass getLTorEqual();

	/**
	 * Returns the meta object for class '{@link langageCompilation.GTorEqual <em>GTor Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GTor Equal</em>'.
	 * @see langageCompilation.GTorEqual
	 * @generated
	 */
	EClass getGTorEqual();

	/**
	 * Returns the meta object for class '{@link langageCompilation.unBoolean <em>un Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>un Boolean</em>'.
	 * @see langageCompilation.unBoolean
	 * @generated
	 */
	EClass getunBoolean();

	/**
	 * Returns the meta object for the attribute '{@link langageCompilation.unBoolean#isInitialeValue <em>Initiale Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initiale Value</em>'.
	 * @see langageCompilation.unBoolean#isInitialeValue()
	 * @see #getunBoolean()
	 * @generated
	 */
	EAttribute getunBoolean_InitialeValue();

	/**
	 * Returns the meta object for class '{@link langageCompilation.Different <em>Different</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Different</em>'.
	 * @see langageCompilation.Different
	 * @generated
	 */
	EClass getDifferent();

	/**
	 * Returns the meta object for class '{@link langageCompilation.ConditionEtat <em>Condition Etat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Etat</em>'.
	 * @see langageCompilation.ConditionEtat
	 * @generated
	 */
	EClass getConditionEtat();

	/**
	 * Returns the meta object for the containment reference list '{@link langageCompilation.ConditionEtat#getThen <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Then</em>'.
	 * @see langageCompilation.ConditionEtat#getThen()
	 * @see #getConditionEtat()
	 * @generated
	 */
	EReference getConditionEtat_Then();

	/**
	 * Returns the meta object for the containment reference '{@link langageCompilation.ConditionEtat#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see langageCompilation.ConditionEtat#getCondition()
	 * @see #getConditionEtat()
	 * @generated
	 */
	EReference getConditionEtat_Condition();

	/**
	 * Returns the meta object for class '{@link langageCompilation.MethodePrint <em>Methode Print</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Methode Print</em>'.
	 * @see langageCompilation.MethodePrint
	 * @generated
	 */
	EClass getMethodePrint();

	/**
	 * Returns the meta object for the containment reference list '{@link langageCompilation.MethodePrint#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expression</em>'.
	 * @see langageCompilation.MethodePrint#getExpression()
	 * @see #getMethodePrint()
	 * @generated
	 */
	EReference getMethodePrint_Expression();

	/**
	 * Returns the meta object for class '{@link langageCompilation.unDouble <em>un Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>un Double</em>'.
	 * @see langageCompilation.unDouble
	 * @generated
	 */
	EClass getunDouble();

	/**
	 * Returns the meta object for the attribute '{@link langageCompilation.unDouble#getInitialeValue1 <em>Initiale Value1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initiale Value1</em>'.
	 * @see langageCompilation.unDouble#getInitialeValue1()
	 * @see #getunDouble()
	 * @generated
	 */
	EAttribute getunDouble_InitialeValue1();

	/**
	 * Returns the meta object for the attribute '{@link langageCompilation.unDouble#getInitialeValue2 <em>Initiale Value2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initiale Value2</em>'.
	 * @see langageCompilation.unDouble#getInitialeValue2()
	 * @see #getunDouble()
	 * @generated
	 */
	EAttribute getunDouble_InitialeValue2();

	/**
	 * Returns the meta object for class '{@link langageCompilation.TheBoolean <em>The Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>The Boolean</em>'.
	 * @see langageCompilation.TheBoolean
	 * @generated
	 */
	EClass getTheBoolean();

	/**
	 * Returns the meta object for the attribute '{@link langageCompilation.TheBoolean#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see langageCompilation.TheBoolean#isValue()
	 * @see #getTheBoolean()
	 * @generated
	 */
	EAttribute getTheBoolean_Value();

	/**
	 * Returns the meta object for class '{@link langageCompilation.TheDouble <em>The Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>The Double</em>'.
	 * @see langageCompilation.TheDouble
	 * @generated
	 */
	EClass getTheDouble();

	/**
	 * Returns the meta object for the attribute '{@link langageCompilation.TheDouble#getValue1 <em>Value1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value1</em>'.
	 * @see langageCompilation.TheDouble#getValue1()
	 * @see #getTheDouble()
	 * @generated
	 */
	EAttribute getTheDouble_Value1();

	/**
	 * Returns the meta object for the attribute '{@link langageCompilation.TheDouble#getValue2 <em>Value2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value2</em>'.
	 * @see langageCompilation.TheDouble#getValue2()
	 * @see #getTheDouble()
	 * @generated
	 */
	EAttribute getTheDouble_Value2();

	/**
	 * Returns the meta object for class '{@link langageCompilation.TheInt <em>The Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>The Int</em>'.
	 * @see langageCompilation.TheInt
	 * @generated
	 */
	EClass getTheInt();

	/**
	 * Returns the meta object for the attribute '{@link langageCompilation.TheInt#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see langageCompilation.TheInt#getValue()
	 * @see #getTheInt()
	 * @generated
	 */
	EAttribute getTheInt_Value();

	/**
	 * Returns the meta object for class '{@link langageCompilation.TheString <em>The String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>The String</em>'.
	 * @see langageCompilation.TheString
	 * @generated
	 */
	EClass getTheString();

	/**
	 * Returns the meta object for the attribute '{@link langageCompilation.TheString#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see langageCompilation.TheString#getValue()
	 * @see #getTheString()
	 * @generated
	 */
	EAttribute getTheString_Value();

	/**
	 * Returns the meta object for class '{@link langageCompilation.PlusEqual <em>Plus Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plus Equal</em>'.
	 * @see langageCompilation.PlusEqual
	 * @generated
	 */
	EClass getPlusEqual();

	/**
	 * Returns the meta object for class '{@link langageCompilation.MinusEqual <em>Minus Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Minus Equal</em>'.
	 * @see langageCompilation.MinusEqual
	 * @generated
	 */
	EClass getMinusEqual();

	/**
	 * Returns the meta object for the containment reference list '{@link langageCompilation.ConditionEtat#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Else</em>'.
	 * @see langageCompilation.ConditionEtat#getElse()
	 * @see #getConditionEtat()
	 * @generated
	 */
	EReference getConditionEtat_Else();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LangageCompilationFactory getLangageCompilationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link langageCompilation.impl.ProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see langageCompilation.impl.ProgramImpl
		 * @see langageCompilation.impl.LangageCompilationPackageImpl#getProgram()
		 * @generated
		 */
		EClass PROGRAM = eINSTANCE.getProgram();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__STATEMENT = eINSTANCE.getProgram_Statement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM__NAME = eINSTANCE.getProgram_Name();

		/**
		 * The meta object literal for the '{@link langageCompilation.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see langageCompilation.impl.StatementImpl
		 * @see langageCompilation.impl.LangageCompilationPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATEMENT__NAME = eINSTANCE.getStatement_Name();

		/**
		 * The meta object literal for the '{@link langageCompilation.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see langageCompilation.impl.VariableImpl
		 * @see langageCompilation.impl.LangageCompilationPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Is Const</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__IS_CONST = eINSTANCE.getVariable_IsConst();

		/**
		 * The meta object literal for the '{@link langageCompilation.impl.LoopImpl <em>Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see langageCompilation.impl.LoopImpl
		 * @see langageCompilation.impl.LangageCompilationPackageImpl#getLoop()
		 * @generated
		 */
		EClass LOOP = eINSTANCE.getLoop();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP__STATEMENT = eINSTANCE.getLoop_Statement();

		/**
		 * The meta object literal for the '{@link langageCompilation.impl.WhileLoopImpl <em>While Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see langageCompilation.impl.WhileLoopImpl
		 * @see langageCompilation.impl.LangageCompilationPackageImpl#getWhileLoop()
		 * @generated
		 */
		EClass WHILE_LOOP = eINSTANCE.getWhileLoop();

		/**
		 * The meta object literal for the '<em><b>Loop Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE_LOOP__LOOP_CONDITION = eINSTANCE.getWhileLoop_LoopCondition();

		/**
		 * The meta object literal for the '{@link langageCompilation.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see langageCompilation.impl.ExpressionImpl
		 * @see langageCompilation.impl.LangageCompilationPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link langageCompilation.impl.BinaryOperationImpl <em>Binary Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see langageCompilation.impl.BinaryOperationImpl
		 * @see langageCompilation.impl.LangageCompilationPackageImpl#getBinaryOperation()
		 * @generated
		 */
		EClass BINARY_OPERATION = eINSTANCE.getBinaryOperation();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_OPERATION__LEFT = eINSTANCE.getBinaryOperation_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_OPERATION__RIGHT = eINSTANCE.getBinaryOperation_Right();

		/**
		 * The meta object literal for the '{@link langageCompilation.impl.VariableRefImpl <em>Variable Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see langageCompilation.impl.VariableRefImpl
		 * @see langageCompilation.impl.LangageCompilationPackageImpl#getVariableRef()
		 * @generated
		 */
		EClass VARIABLE_REF = eINSTANCE.getVariableRef();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_REF__VARIABLE = eINSTANCE.getVariableRef_Variable();

		/**
		 * The meta object literal for the '{@link langageCompilation.impl.SubstractionImpl <em>Substraction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see langageCompilation.impl.SubstractionImpl
		 * @see langageCompilation.impl.LangageCompilationPackageImpl#getSubstraction()
		 * @generated
		 */
		EClass SUBSTRACTION = eINSTANCE.getSubstraction();

		/**
		 * The meta object literal for the '{@link langageCompilation.impl.ComparaisonImpl <em>Comparaison</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see langageCompilation.impl.ComparaisonImpl
		 * @see langageCompilation.impl.LangageCompilationPackageImpl#getComparaison()
		 * @generated
		 */
		EClass COMPARAISON = eINSTANCE.getComparaison();

		/**
		 * The meta object literal for the '{@link langageCompilation.impl.GTImpl <em>GT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see langageCompilation.impl.GTImpl
		 * @see langageCompilation.impl.LangageCompilationPackageImpl#getGT()
		 * @generated
		 */
		EClass GT = eINSTANCE.getGT();

		/**
		 * The meta object literal for the '{@link langageCompilation.impl.AssignementImpl <em>Assignement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see langageCompilation.impl.AssignementImpl
		 * @see langageCompilation.impl.LangageCompilationPackageImpl#getAssignement()
		 * @generated
		 */
		EClass ASSIGNEMENT = eINSTANCE.getAssignement();

		/**
		 * The meta object literal for the '{@link langageCompilation.impl.unIntegerImpl <em>un Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see langageCompilation.impl.unIntegerImpl
		 * @see langageCompilation.impl.LangageCompilationPackageImpl#getunInteger()
		 * @generated
		 */
		EClass UN_INTEGER = eINSTANCE.getunInteger();

		/**
		 * The meta object literal for the '<em><b>Initiale Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UN_INTEGER__INITIALE_VALUE = eINSTANCE.getunInteger_InitialeValue();

		/**
		 * The meta object literal for the '{@link langageCompilation.impl.unStringImpl <em>un String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see langageCompilation.impl.unStringImpl
		 * @see langageCompilation.impl.LangageCompilationPackageImpl#getunString()
		 * @generated
		 */
		EClass UN_STRING = eINSTANCE.getunString();

		/**
		 * The meta object literal for the '<em><b>Initiale Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UN_STRING__INITIALE_VALUE = eINSTANCE.getunString_InitialeValue();

		/**
		 * The meta object literal for the '{@link langageCompilation.impl.LTImpl <em>LT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see langageCompilation.impl.LTImpl
		 * @see langageCompilation.impl.LangageCompilationPackageImpl#getLT()
		 * @generated
		 */
		EClass LT = eINSTANCE.getLT();

		/**
		 * The meta object literal for the '{@link langageCompilation.impl.EqualImpl <em>Equal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see langageCompilation.impl.EqualImpl
		 * @see langageCompilation.impl.LangageCompilationPackageImpl#getEqual()
		 * @generated
		 */
		EClass EQUAL = eINSTANCE.getEqual();

		/**
		 * The meta object literal for the '{@link langageCompilation.impl.AdditionImpl <em>Addition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see langageCompilation.impl.AdditionImpl
		 * @see langageCompilation.impl.LangageCompilationPackageImpl#getAddition()
		 * @generated
		 */
		EClass ADDITION = eINSTANCE.getAddition();

		/**
		 * The meta object literal for the '{@link langageCompilation.impl.DivisionImpl <em>Division</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see langageCompilation.impl.DivisionImpl
		 * @see langageCompilation.impl.LangageCompilationPackageImpl#getDivision()
		 * @generated
		 */
		EClass DIVISION = eINSTANCE.getDivision();

		/**
		 * The meta object literal for the '{@link langageCompilation.impl.MultiplicationImpl <em>Multiplication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see langageCompilation.impl.MultiplicationImpl
		 * @see langageCompilation.impl.LangageCompilationPackageImpl#getMultiplication()
		 * @generated
		 */
		EClass MULTIPLICATION = eINSTANCE.getMultiplication();

		/**
		 * The meta object literal for the '{@link langageCompilation.impl.LTorEqualImpl <em>LTor Equal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see langageCompilation.impl.LTorEqualImpl
		 * @see langageCompilation.impl.LangageCompilationPackageImpl#getLTorEqual()
		 * @generated
		 */
		EClass LTOR_EQUAL = eINSTANCE.getLTorEqual();

		/**
		 * The meta object literal for the '{@link langageCompilation.impl.GTorEqualImpl <em>GTor Equal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see langageCompilation.impl.GTorEqualImpl
		 * @see langageCompilation.impl.LangageCompilationPackageImpl#getGTorEqual()
		 * @generated
		 */
		EClass GTOR_EQUAL = eINSTANCE.getGTorEqual();

		/**
		 * The meta object literal for the '{@link langageCompilation.impl.unBooleanImpl <em>un Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see langageCompilation.impl.unBooleanImpl
		 * @see langageCompilation.impl.LangageCompilationPackageImpl#getunBoolean()
		 * @generated
		 */
		EClass UN_BOOLEAN = eINSTANCE.getunBoolean();

		/**
		 * The meta object literal for the '<em><b>Initiale Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UN_BOOLEAN__INITIALE_VALUE = eINSTANCE.getunBoolean_InitialeValue();

		/**
		 * The meta object literal for the '{@link langageCompilation.impl.DifferentImpl <em>Different</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see langageCompilation.impl.DifferentImpl
		 * @see langageCompilation.impl.LangageCompilationPackageImpl#getDifferent()
		 * @generated
		 */
		EClass DIFFERENT = eINSTANCE.getDifferent();

		/**
		 * The meta object literal for the '{@link langageCompilation.impl.ConditionEtatImpl <em>Condition Etat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see langageCompilation.impl.ConditionEtatImpl
		 * @see langageCompilation.impl.LangageCompilationPackageImpl#getConditionEtat()
		 * @generated
		 */
		EClass CONDITION_ETAT = eINSTANCE.getConditionEtat();

		/**
		 * The meta object literal for the '<em><b>Then</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_ETAT__THEN = eINSTANCE.getConditionEtat_Then();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_ETAT__CONDITION = eINSTANCE.getConditionEtat_Condition();

		/**
		 * The meta object literal for the '{@link langageCompilation.impl.MethodePrintImpl <em>Methode Print</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see langageCompilation.impl.MethodePrintImpl
		 * @see langageCompilation.impl.LangageCompilationPackageImpl#getMethodePrint()
		 * @generated
		 */
		EClass METHODE_PRINT = eINSTANCE.getMethodePrint();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHODE_PRINT__EXPRESSION = eINSTANCE.getMethodePrint_Expression();

		/**
		 * The meta object literal for the '{@link langageCompilation.impl.unDoubleImpl <em>un Double</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see langageCompilation.impl.unDoubleImpl
		 * @see langageCompilation.impl.LangageCompilationPackageImpl#getunDouble()
		 * @generated
		 */
		EClass UN_DOUBLE = eINSTANCE.getunDouble();

		/**
		 * The meta object literal for the '<em><b>Initiale Value1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UN_DOUBLE__INITIALE_VALUE1 = eINSTANCE.getunDouble_InitialeValue1();

		/**
		 * The meta object literal for the '<em><b>Initiale Value2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UN_DOUBLE__INITIALE_VALUE2 = eINSTANCE.getunDouble_InitialeValue2();

		/**
		 * The meta object literal for the '{@link langageCompilation.impl.TheBooleanImpl <em>The Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see langageCompilation.impl.TheBooleanImpl
		 * @see langageCompilation.impl.LangageCompilationPackageImpl#getTheBoolean()
		 * @generated
		 */
		EClass THE_BOOLEAN = eINSTANCE.getTheBoolean();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THE_BOOLEAN__VALUE = eINSTANCE.getTheBoolean_Value();

		/**
		 * The meta object literal for the '{@link langageCompilation.impl.TheDoubleImpl <em>The Double</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see langageCompilation.impl.TheDoubleImpl
		 * @see langageCompilation.impl.LangageCompilationPackageImpl#getTheDouble()
		 * @generated
		 */
		EClass THE_DOUBLE = eINSTANCE.getTheDouble();

		/**
		 * The meta object literal for the '<em><b>Value1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THE_DOUBLE__VALUE1 = eINSTANCE.getTheDouble_Value1();

		/**
		 * The meta object literal for the '<em><b>Value2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THE_DOUBLE__VALUE2 = eINSTANCE.getTheDouble_Value2();

		/**
		 * The meta object literal for the '{@link langageCompilation.impl.TheIntImpl <em>The Int</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see langageCompilation.impl.TheIntImpl
		 * @see langageCompilation.impl.LangageCompilationPackageImpl#getTheInt()
		 * @generated
		 */
		EClass THE_INT = eINSTANCE.getTheInt();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THE_INT__VALUE = eINSTANCE.getTheInt_Value();

		/**
		 * The meta object literal for the '{@link langageCompilation.impl.TheStringImpl <em>The String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see langageCompilation.impl.TheStringImpl
		 * @see langageCompilation.impl.LangageCompilationPackageImpl#getTheString()
		 * @generated
		 */
		EClass THE_STRING = eINSTANCE.getTheString();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THE_STRING__VALUE = eINSTANCE.getTheString_Value();

		/**
		 * The meta object literal for the '{@link langageCompilation.impl.PlusEqualImpl <em>Plus Equal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see langageCompilation.impl.PlusEqualImpl
		 * @see langageCompilation.impl.LangageCompilationPackageImpl#getPlusEqual()
		 * @generated
		 */
		EClass PLUS_EQUAL = eINSTANCE.getPlusEqual();

		/**
		 * The meta object literal for the '{@link langageCompilation.impl.MinusEqualImpl <em>Minus Equal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see langageCompilation.impl.MinusEqualImpl
		 * @see langageCompilation.impl.LangageCompilationPackageImpl#getMinusEqual()
		 * @generated
		 */
		EClass MINUS_EQUAL = eINSTANCE.getMinusEqual();

		/**
		 * The meta object literal for the '<em><b>Else</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_ETAT__ELSE = eINSTANCE.getConditionEtat_Else();

	}

} //LangageCompilationPackage
