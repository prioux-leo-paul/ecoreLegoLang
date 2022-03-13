/**
 */
package langageCompilation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
	 * The meta object id for the '{@link langageCompilation.impl.UnIntegerImpl <em>Un Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see langageCompilation.impl.UnIntegerImpl
	 * @see langageCompilation.impl.LangageCompilationPackageImpl#getUnInteger()
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
	 * The number of structural features of the '<em>Un Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UN_INTEGER_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Un Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UN_INTEGER_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link langageCompilation.impl.UnStringImpl <em>Un String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see langageCompilation.impl.UnStringImpl
	 * @see langageCompilation.impl.LangageCompilationPackageImpl#getUnString()
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
	 * The number of structural features of the '<em>Un String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UN_STRING_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Un String</em>' class.
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
	 * The meta object id for the '{@link langageCompilation.impl.UnBooleanImpl <em>Un Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see langageCompilation.impl.UnBooleanImpl
	 * @see langageCompilation.impl.LangageCompilationPackageImpl#getUnBoolean()
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
	 * The number of structural features of the '<em>Un Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UN_BOOLEAN_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Un Boolean</em>' class.
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
	 * The meta object id for the '{@link langageCompilation.impl.UnDoubleImpl <em>Un Double</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see langageCompilation.impl.UnDoubleImpl
	 * @see langageCompilation.impl.LangageCompilationPackageImpl#getUnDouble()
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
	 * The number of structural features of the '<em>Un Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UN_DOUBLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Un Double</em>' class.
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
	 * The meta object id for the '{@link langageCompilation.impl.CarImpl <em>Car</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see langageCompilation.impl.CarImpl
	 * @see langageCompilation.impl.LangageCompilationPackageImpl#getCar()
	 * @generated
	 */
	int CAR = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__NAME = STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Engine</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__ENGINE = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sensor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__SENSOR = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Car</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Car</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link langageCompilation.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see langageCompilation.impl.SensorImpl
	 * @see langageCompilation.impl.LangageCompilationPackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__NAME = STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__POSITION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link langageCompilation.impl.EngineImpl <em>Engine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see langageCompilation.impl.EngineImpl
	 * @see langageCompilation.impl.LangageCompilationPackageImpl#getEngine()
	 * @generated
	 */
	int ENGINE = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINE__NAME = STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINE__POSITION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Engine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Engine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINE_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link langageCompilation.impl.ColorSensorImpl <em>Color Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see langageCompilation.impl.ColorSensorImpl
	 * @see langageCompilation.impl.LangageCompilationPackageImpl#getColorSensor()
	 * @generated
	 */
	int COLOR_SENSOR = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_SENSOR__NAME = SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_SENSOR__POSITION = SENSOR__POSITION;

	/**
	 * The number of structural features of the '<em>Color Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_SENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Color Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_SENSOR_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link langageCompilation.impl.LaserSensorImpl <em>Laser Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see langageCompilation.impl.LaserSensorImpl
	 * @see langageCompilation.impl.LangageCompilationPackageImpl#getLaserSensor()
	 * @generated
	 */
	int LASER_SENSOR = 36;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LASER_SENSOR__NAME = SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LASER_SENSOR__POSITION = SENSOR__POSITION;

	/**
	 * The number of structural features of the '<em>Laser Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LASER_SENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Laser Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LASER_SENSOR_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link langageCompilation.impl.WheelEngineImpl <em>Wheel Engine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see langageCompilation.impl.WheelEngineImpl
	 * @see langageCompilation.impl.LangageCompilationPackageImpl#getWheelEngine()
	 * @generated
	 */
	int WHEEL_ENGINE = 37;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEEL_ENGINE__NAME = ENGINE__NAME;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEEL_ENGINE__POSITION = ENGINE__POSITION;

	/**
	 * The number of structural features of the '<em>Wheel Engine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEEL_ENGINE_FEATURE_COUNT = ENGINE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Wheel Engine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEEL_ENGINE_OPERATION_COUNT = ENGINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link langageCompilation.impl.EngineOperationImpl <em>Engine Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see langageCompilation.impl.EngineOperationImpl
	 * @see langageCompilation.impl.LangageCompilationPackageImpl#getEngineOperation()
	 * @generated
	 */
	int ENGINE_OPERATION = 38;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINE_OPERATION__NAME = EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINE_OPERATION__RIGHT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Engine Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINE_OPERATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Engine Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINE_OPERATION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link langageCompilation.impl.SensorOperationImpl <em>Sensor Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see langageCompilation.impl.SensorOperationImpl
	 * @see langageCompilation.impl.LangageCompilationPackageImpl#getSensorOperation()
	 * @generated
	 */
	int SENSOR_OPERATION = 39;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION__NAME = EXPRESSION__NAME;

	/**
	 * The number of structural features of the '<em>Sensor Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sensor Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link langageCompilation.impl.NewEClass43Impl <em>New EClass43</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see langageCompilation.impl.NewEClass43Impl
	 * @see langageCompilation.impl.LangageCompilationPackageImpl#getNewEClass43()
	 * @generated
	 */
	int NEW_ECLASS43 = 40;

	/**
	 * The number of structural features of the '<em>New EClass43</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_ECLASS43_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>New EClass43</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_ECLASS43_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link langageCompilation.impl.VitesseOperationImpl <em>Vitesse Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see langageCompilation.impl.VitesseOperationImpl
	 * @see langageCompilation.impl.LangageCompilationPackageImpl#getVitesseOperation()
	 * @generated
	 */
	int VITESSE_OPERATION = 41;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITESSE_OPERATION__NAME = ENGINE_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITESSE_OPERATION__RIGHT = ENGINE_OPERATION__RIGHT;

	/**
	 * The feature id for the '<em><b>Wheelengine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITESSE_OPERATION__WHEELENGINE = ENGINE_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Vitesse Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITESSE_OPERATION_FEATURE_COUNT = ENGINE_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Vitesse Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITESSE_OPERATION_OPERATION_COUNT = ENGINE_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link langageCompilation.impl.ColorOperationImpl <em>Color Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see langageCompilation.impl.ColorOperationImpl
	 * @see langageCompilation.impl.LangageCompilationPackageImpl#getColorOperation()
	 * @generated
	 */
	int COLOR_OPERATION = 42;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_OPERATION__NAME = SENSOR_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Colorsensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_OPERATION__COLORSENSOR = SENSOR_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Color Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_OPERATION_FEATURE_COUNT = SENSOR_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Color Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_OPERATION_OPERATION_COUNT = SENSOR_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link langageCompilation.impl.RangeOperationImpl <em>Range Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see langageCompilation.impl.RangeOperationImpl
	 * @see langageCompilation.impl.LangageCompilationPackageImpl#getRangeOperation()
	 * @generated
	 */
	int RANGE_OPERATION = 43;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_OPERATION__NAME = SENSOR_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Lasersensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_OPERATION__LASERSENSOR = SENSOR_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Range Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_OPERATION_FEATURE_COUNT = SENSOR_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Range Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_OPERATION_OPERATION_COUNT = SENSOR_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link langageCompilation.impl.IntensityOperationImpl <em>Intensity Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see langageCompilation.impl.IntensityOperationImpl
	 * @see langageCompilation.impl.LangageCompilationPackageImpl#getIntensityOperation()
	 * @generated
	 */
	int INTENSITY_OPERATION = 44;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENSITY_OPERATION__NAME = SENSOR_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Colorsensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENSITY_OPERATION__COLORSENSOR = SENSOR_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Intensity Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENSITY_OPERATION_FEATURE_COUNT = SENSOR_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Intensity Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENSITY_OPERATION_OPERATION_COUNT = SENSOR_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link langageCompilation.impl.UltraSonicSensorImpl <em>Ultra Sonic Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see langageCompilation.impl.UltraSonicSensorImpl
	 * @see langageCompilation.impl.LangageCompilationPackageImpl#getUltraSonicSensor()
	 * @generated
	 */
	int ULTRA_SONIC_SENSOR = 45;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULTRA_SONIC_SENSOR__NAME = SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULTRA_SONIC_SENSOR__POSITION = SENSOR__POSITION;

	/**
	 * The number of structural features of the '<em>Ultra Sonic Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULTRA_SONIC_SENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ultra Sonic Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULTRA_SONIC_SENSOR_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link langageCompilation.impl.GyroSensorImpl <em>Gyro Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see langageCompilation.impl.GyroSensorImpl
	 * @see langageCompilation.impl.LangageCompilationPackageImpl#getGyroSensor()
	 * @generated
	 */
	int GYRO_SENSOR = 46;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GYRO_SENSOR__NAME = SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GYRO_SENSOR__POSITION = SENSOR__POSITION;

	/**
	 * The number of structural features of the '<em>Gyro Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GYRO_SENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Gyro Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GYRO_SENSOR_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link langageCompilation.impl.GPSSensorImpl <em>GPS Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see langageCompilation.impl.GPSSensorImpl
	 * @see langageCompilation.impl.LangageCompilationPackageImpl#getGPSSensor()
	 * @generated
	 */
	int GPS_SENSOR = 47;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_SENSOR__NAME = SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_SENSOR__POSITION = SENSOR__POSITION;

	/**
	 * The number of structural features of the '<em>GPS Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_SENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>GPS Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_SENSOR_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link langageCompilation.impl.XGPSOperationImpl <em>XGPS Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see langageCompilation.impl.XGPSOperationImpl
	 * @see langageCompilation.impl.LangageCompilationPackageImpl#getXGPSOperation()
	 * @generated
	 */
	int XGPS_OPERATION = 48;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XGPS_OPERATION__NAME = SENSOR_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Gpssensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XGPS_OPERATION__GPSSENSOR = SENSOR_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>XGPS Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XGPS_OPERATION_FEATURE_COUNT = SENSOR_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>XGPS Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XGPS_OPERATION_OPERATION_COUNT = SENSOR_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link langageCompilation.impl.YGPSOperationImpl <em>YGPS Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see langageCompilation.impl.YGPSOperationImpl
	 * @see langageCompilation.impl.LangageCompilationPackageImpl#getYGPSOperation()
	 * @generated
	 */
	int YGPS_OPERATION = 49;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YGPS_OPERATION__NAME = SENSOR_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Gpssensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YGPS_OPERATION__GPSSENSOR = SENSOR_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>YGPS Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YGPS_OPERATION_FEATURE_COUNT = SENSOR_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>YGPS Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YGPS_OPERATION_OPERATION_COUNT = SENSOR_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link langageCompilation.impl.DistanceOperationImpl <em>Distance Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see langageCompilation.impl.DistanceOperationImpl
	 * @see langageCompilation.impl.LangageCompilationPackageImpl#getDistanceOperation()
	 * @generated
	 */
	int DISTANCE_OPERATION = 50;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_OPERATION__NAME = SENSOR_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Ultrasonicsensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_OPERATION__ULTRASONICSENSOR = SENSOR_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Distance Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_OPERATION_FEATURE_COUNT = SENSOR_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Distance Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_OPERATION_OPERATION_COUNT = SENSOR_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link langageCompilation.impl.AngleOperationImpl <em>Angle Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see langageCompilation.impl.AngleOperationImpl
	 * @see langageCompilation.impl.LangageCompilationPackageImpl#getAngleOperation()
	 * @generated
	 */
	int ANGLE_OPERATION = 51;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_OPERATION__NAME = SENSOR_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Gyrosensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_OPERATION__GYROSENSOR = SENSOR_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Angle Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_OPERATION_FEATURE_COUNT = SENSOR_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Angle Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_OPERATION_OPERATION_COUNT = SENSOR_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link langageCompilation.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see langageCompilation.impl.BooleanExpressionImpl
	 * @see langageCompilation.impl.LangageCompilationPackageImpl#getBooleanExpression()
	 * @generated
	 */
	int BOOLEAN_EXPRESSION = 52;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION__NAME = EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Boolean Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Boolean Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link langageCompilation.impl.AndImpl <em>And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see langageCompilation.impl.AndImpl
	 * @see langageCompilation.impl.LangageCompilationPackageImpl#getAnd()
	 * @generated
	 */
	int AND = 53;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__NAME = BOOLEAN_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__LEFT = BOOLEAN_EXPRESSION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__RIGHT = BOOLEAN_EXPRESSION__RIGHT;

	/**
	 * The number of structural features of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATION_COUNT = BOOLEAN_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link langageCompilation.impl.OrImpl <em>Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see langageCompilation.impl.OrImpl
	 * @see langageCompilation.impl.LangageCompilationPackageImpl#getOr()
	 * @generated
	 */
	int OR = 54;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__NAME = BOOLEAN_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__LEFT = BOOLEAN_EXPRESSION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__RIGHT = BOOLEAN_EXPRESSION__RIGHT;

	/**
	 * The number of structural features of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATION_COUNT = BOOLEAN_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link langageCompilation.impl.MotorizedArmEngineImpl <em>Motorized Arm Engine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see langageCompilation.impl.MotorizedArmEngineImpl
	 * @see langageCompilation.impl.LangageCompilationPackageImpl#getMotorizedArmEngine()
	 * @generated
	 */
	int MOTORIZED_ARM_ENGINE = 55;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTORIZED_ARM_ENGINE__NAME = ENGINE__NAME;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTORIZED_ARM_ENGINE__POSITION = ENGINE__POSITION;

	/**
	 * The number of structural features of the '<em>Motorized Arm Engine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTORIZED_ARM_ENGINE_FEATURE_COUNT = ENGINE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Motorized Arm Engine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTORIZED_ARM_ENGINE_OPERATION_COUNT = ENGINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link langageCompilation.impl.PositionOperationImpl <em>Position Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see langageCompilation.impl.PositionOperationImpl
	 * @see langageCompilation.impl.LangageCompilationPackageImpl#getPositionOperation()
	 * @generated
	 */
	int POSITION_OPERATION = 56;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_OPERATION__NAME = ENGINE_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_OPERATION__RIGHT = ENGINE_OPERATION__RIGHT;

	/**
	 * The feature id for the '<em><b>Motorizedarmengine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_OPERATION__MOTORIZEDARMENGINE = ENGINE_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Position Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_OPERATION_FEATURE_COUNT = ENGINE_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Position Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_OPERATION_OPERATION_COUNT = ENGINE_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link langageCompilation.impl.PaintballLauncherEngineImpl <em>Paintball Launcher Engine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see langageCompilation.impl.PaintballLauncherEngineImpl
	 * @see langageCompilation.impl.LangageCompilationPackageImpl#getPaintballLauncherEngine()
	 * @generated
	 */
	int PAINTBALL_LAUNCHER_ENGINE = 57;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAINTBALL_LAUNCHER_ENGINE__NAME = ENGINE__NAME;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAINTBALL_LAUNCHER_ENGINE__POSITION = ENGINE__POSITION;

	/**
	 * The number of structural features of the '<em>Paintball Launcher Engine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAINTBALL_LAUNCHER_ENGINE_FEATURE_COUNT = ENGINE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Paintball Launcher Engine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAINTBALL_LAUNCHER_ENGINE_OPERATION_COUNT = ENGINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link langageCompilation.impl.ForceOperationImpl <em>Force Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see langageCompilation.impl.ForceOperationImpl
	 * @see langageCompilation.impl.LangageCompilationPackageImpl#getForceOperation()
	 * @generated
	 */
	int FORCE_OPERATION = 58;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_OPERATION__NAME = ENGINE_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_OPERATION__RIGHT = ENGINE_OPERATION__RIGHT;

	/**
	 * The feature id for the '<em><b>Paintballlauncherengine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_OPERATION__PAINTBALLLAUNCHERENGINE = ENGINE_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Force Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_OPERATION_FEATURE_COUNT = ENGINE_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Force Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_OPERATION_OPERATION_COUNT = ENGINE_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link langageCompilation.impl.BreakMotorImpl <em>Break Motor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see langageCompilation.impl.BreakMotorImpl
	 * @see langageCompilation.impl.LangageCompilationPackageImpl#getBreakMotor()
	 * @generated
	 */
	int BREAK_MOTOR = 59;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_MOTOR__NAME = EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Engine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_MOTOR__ENGINE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Break Motor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_MOTOR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Break Motor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_MOTOR_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link langageCompilation.impl.UnColorImpl <em>Un Color</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see langageCompilation.impl.UnColorImpl
	 * @see langageCompilation.impl.LangageCompilationPackageImpl#getUnColor()
	 * @generated
	 */
	int UN_COLOR = 60;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UN_COLOR__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UN_COLOR__IS_CONST = VARIABLE__IS_CONST;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UN_COLOR__INITIAL_VALUE = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Un Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UN_COLOR_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Un Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UN_COLOR_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link langageCompilation.impl.TheColorImpl <em>The Color</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see langageCompilation.impl.TheColorImpl
	 * @see langageCompilation.impl.LangageCompilationPackageImpl#getTheColor()
	 * @generated
	 */
	int THE_COLOR = 61;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THE_COLOR__NAME = EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THE_COLOR__VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>The Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THE_COLOR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>The Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THE_COLOR_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link langageCompilation.impl.PauseImpl <em>Pause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see langageCompilation.impl.PauseImpl
	 * @see langageCompilation.impl.LangageCompilationPackageImpl#getPause()
	 * @generated
	 */
	int PAUSE = 62;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAUSE__NAME = STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAUSE__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAUSE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAUSE_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link langageCompilation.Colors <em>Colors</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see langageCompilation.Colors
	 * @see langageCompilation.impl.LangageCompilationPackageImpl#getColors()
	 * @generated
	 */
	int COLORS = 63;

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
	 * Returns the meta object for class '{@link langageCompilation.UnInteger <em>Un Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Un Integer</em>'.
	 * @see langageCompilation.UnInteger
	 * @generated
	 */
	EClass getUnInteger();

	/**
	 * Returns the meta object for the attribute '{@link langageCompilation.UnInteger#getInitialeValue <em>Initiale Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initiale Value</em>'.
	 * @see langageCompilation.UnInteger#getInitialeValue()
	 * @see #getUnInteger()
	 * @generated
	 */
	EAttribute getUnInteger_InitialeValue();

	/**
	 * Returns the meta object for class '{@link langageCompilation.UnString <em>Un String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Un String</em>'.
	 * @see langageCompilation.UnString
	 * @generated
	 */
	EClass getUnString();

	/**
	 * Returns the meta object for the attribute '{@link langageCompilation.UnString#getInitialeValue <em>Initiale Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initiale Value</em>'.
	 * @see langageCompilation.UnString#getInitialeValue()
	 * @see #getUnString()
	 * @generated
	 */
	EAttribute getUnString_InitialeValue();

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
	 * Returns the meta object for class '{@link langageCompilation.UnBoolean <em>Un Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Un Boolean</em>'.
	 * @see langageCompilation.UnBoolean
	 * @generated
	 */
	EClass getUnBoolean();

	/**
	 * Returns the meta object for the attribute '{@link langageCompilation.UnBoolean#isInitialeValue <em>Initiale Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initiale Value</em>'.
	 * @see langageCompilation.UnBoolean#isInitialeValue()
	 * @see #getUnBoolean()
	 * @generated
	 */
	EAttribute getUnBoolean_InitialeValue();

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
	 * Returns the meta object for class '{@link langageCompilation.UnDouble <em>Un Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Un Double</em>'.
	 * @see langageCompilation.UnDouble
	 * @generated
	 */
	EClass getUnDouble();

	/**
	 * Returns the meta object for the attribute '{@link langageCompilation.UnDouble#getInitialeValue1 <em>Initiale Value1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initiale Value1</em>'.
	 * @see langageCompilation.UnDouble#getInitialeValue1()
	 * @see #getUnDouble()
	 * @generated
	 */
	EAttribute getUnDouble_InitialeValue1();

	/**
	 * Returns the meta object for the attribute '{@link langageCompilation.UnDouble#getInitialeValue2 <em>Initiale Value2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initiale Value2</em>'.
	 * @see langageCompilation.UnDouble#getInitialeValue2()
	 * @see #getUnDouble()
	 * @generated
	 */
	EAttribute getUnDouble_InitialeValue2();

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
	 * Returns the meta object for class '{@link langageCompilation.Car <em>Car</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Car</em>'.
	 * @see langageCompilation.Car
	 * @generated
	 */
	EClass getCar();

	/**
	 * Returns the meta object for the containment reference list '{@link langageCompilation.Car#getEngine <em>Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Engine</em>'.
	 * @see langageCompilation.Car#getEngine()
	 * @see #getCar()
	 * @generated
	 */
	EReference getCar_Engine();

	/**
	 * Returns the meta object for the containment reference list '{@link langageCompilation.Car#getSensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sensor</em>'.
	 * @see langageCompilation.Car#getSensor()
	 * @see #getCar()
	 * @generated
	 */
	EReference getCar_Sensor();

	/**
	 * Returns the meta object for class '{@link langageCompilation.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see langageCompilation.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for the attribute '{@link langageCompilation.Sensor#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see langageCompilation.Sensor#getPosition()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Position();

	/**
	 * Returns the meta object for class '{@link langageCompilation.Engine <em>Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Engine</em>'.
	 * @see langageCompilation.Engine
	 * @generated
	 */
	EClass getEngine();

	/**
	 * Returns the meta object for the attribute '{@link langageCompilation.Engine#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see langageCompilation.Engine#getPosition()
	 * @see #getEngine()
	 * @generated
	 */
	EAttribute getEngine_Position();

	/**
	 * Returns the meta object for class '{@link langageCompilation.ColorSensor <em>Color Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Color Sensor</em>'.
	 * @see langageCompilation.ColorSensor
	 * @generated
	 */
	EClass getColorSensor();

	/**
	 * Returns the meta object for class '{@link langageCompilation.LaserSensor <em>Laser Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Laser Sensor</em>'.
	 * @see langageCompilation.LaserSensor
	 * @generated
	 */
	EClass getLaserSensor();

	/**
	 * Returns the meta object for class '{@link langageCompilation.WheelEngine <em>Wheel Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wheel Engine</em>'.
	 * @see langageCompilation.WheelEngine
	 * @generated
	 */
	EClass getWheelEngine();

	/**
	 * Returns the meta object for class '{@link langageCompilation.EngineOperation <em>Engine Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Engine Operation</em>'.
	 * @see langageCompilation.EngineOperation
	 * @generated
	 */
	EClass getEngineOperation();

	/**
	 * Returns the meta object for the containment reference '{@link langageCompilation.EngineOperation#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see langageCompilation.EngineOperation#getRight()
	 * @see #getEngineOperation()
	 * @generated
	 */
	EReference getEngineOperation_Right();

	/**
	 * Returns the meta object for class '{@link langageCompilation.SensorOperation <em>Sensor Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor Operation</em>'.
	 * @see langageCompilation.SensorOperation
	 * @generated
	 */
	EClass getSensorOperation();

	/**
	 * Returns the meta object for class '{@link langageCompilation.NewEClass43 <em>New EClass43</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>New EClass43</em>'.
	 * @see langageCompilation.NewEClass43
	 * @generated
	 */
	EClass getNewEClass43();

	/**
	 * Returns the meta object for class '{@link langageCompilation.VitesseOperation <em>Vitesse Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vitesse Operation</em>'.
	 * @see langageCompilation.VitesseOperation
	 * @generated
	 */
	EClass getVitesseOperation();

	/**
	 * Returns the meta object for the reference '{@link langageCompilation.VitesseOperation#getWheelengine <em>Wheelengine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Wheelengine</em>'.
	 * @see langageCompilation.VitesseOperation#getWheelengine()
	 * @see #getVitesseOperation()
	 * @generated
	 */
	EReference getVitesseOperation_Wheelengine();

	/**
	 * Returns the meta object for class '{@link langageCompilation.ColorOperation <em>Color Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Color Operation</em>'.
	 * @see langageCompilation.ColorOperation
	 * @generated
	 */
	EClass getColorOperation();

	/**
	 * Returns the meta object for the reference '{@link langageCompilation.ColorOperation#getColorsensor <em>Colorsensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Colorsensor</em>'.
	 * @see langageCompilation.ColorOperation#getColorsensor()
	 * @see #getColorOperation()
	 * @generated
	 */
	EReference getColorOperation_Colorsensor();

	/**
	 * Returns the meta object for class '{@link langageCompilation.RangeOperation <em>Range Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range Operation</em>'.
	 * @see langageCompilation.RangeOperation
	 * @generated
	 */
	EClass getRangeOperation();

	/**
	 * Returns the meta object for the reference '{@link langageCompilation.RangeOperation#getLasersensor <em>Lasersensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lasersensor</em>'.
	 * @see langageCompilation.RangeOperation#getLasersensor()
	 * @see #getRangeOperation()
	 * @generated
	 */
	EReference getRangeOperation_Lasersensor();

	/**
	 * Returns the meta object for class '{@link langageCompilation.IntensityOperation <em>Intensity Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intensity Operation</em>'.
	 * @see langageCompilation.IntensityOperation
	 * @generated
	 */
	EClass getIntensityOperation();

	/**
	 * Returns the meta object for the reference '{@link langageCompilation.IntensityOperation#getColorsensor <em>Colorsensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Colorsensor</em>'.
	 * @see langageCompilation.IntensityOperation#getColorsensor()
	 * @see #getIntensityOperation()
	 * @generated
	 */
	EReference getIntensityOperation_Colorsensor();

	/**
	 * Returns the meta object for class '{@link langageCompilation.UltraSonicSensor <em>Ultra Sonic Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ultra Sonic Sensor</em>'.
	 * @see langageCompilation.UltraSonicSensor
	 * @generated
	 */
	EClass getUltraSonicSensor();

	/**
	 * Returns the meta object for class '{@link langageCompilation.GyroSensor <em>Gyro Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gyro Sensor</em>'.
	 * @see langageCompilation.GyroSensor
	 * @generated
	 */
	EClass getGyroSensor();

	/**
	 * Returns the meta object for class '{@link langageCompilation.GPSSensor <em>GPS Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GPS Sensor</em>'.
	 * @see langageCompilation.GPSSensor
	 * @generated
	 */
	EClass getGPSSensor();

	/**
	 * Returns the meta object for class '{@link langageCompilation.XGPSOperation <em>XGPS Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XGPS Operation</em>'.
	 * @see langageCompilation.XGPSOperation
	 * @generated
	 */
	EClass getXGPSOperation();

	/**
	 * Returns the meta object for the reference '{@link langageCompilation.XGPSOperation#getGpssensor <em>Gpssensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gpssensor</em>'.
	 * @see langageCompilation.XGPSOperation#getGpssensor()
	 * @see #getXGPSOperation()
	 * @generated
	 */
	EReference getXGPSOperation_Gpssensor();

	/**
	 * Returns the meta object for class '{@link langageCompilation.YGPSOperation <em>YGPS Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YGPS Operation</em>'.
	 * @see langageCompilation.YGPSOperation
	 * @generated
	 */
	EClass getYGPSOperation();

	/**
	 * Returns the meta object for the reference '{@link langageCompilation.YGPSOperation#getGpssensor <em>Gpssensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gpssensor</em>'.
	 * @see langageCompilation.YGPSOperation#getGpssensor()
	 * @see #getYGPSOperation()
	 * @generated
	 */
	EReference getYGPSOperation_Gpssensor();

	/**
	 * Returns the meta object for class '{@link langageCompilation.DistanceOperation <em>Distance Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distance Operation</em>'.
	 * @see langageCompilation.DistanceOperation
	 * @generated
	 */
	EClass getDistanceOperation();

	/**
	 * Returns the meta object for the reference '{@link langageCompilation.DistanceOperation#getUltrasonicsensor <em>Ultrasonicsensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ultrasonicsensor</em>'.
	 * @see langageCompilation.DistanceOperation#getUltrasonicsensor()
	 * @see #getDistanceOperation()
	 * @generated
	 */
	EReference getDistanceOperation_Ultrasonicsensor();

	/**
	 * Returns the meta object for class '{@link langageCompilation.AngleOperation <em>Angle Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Angle Operation</em>'.
	 * @see langageCompilation.AngleOperation
	 * @generated
	 */
	EClass getAngleOperation();

	/**
	 * Returns the meta object for the reference '{@link langageCompilation.AngleOperation#getGyrosensor <em>Gyrosensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gyrosensor</em>'.
	 * @see langageCompilation.AngleOperation#getGyrosensor()
	 * @see #getAngleOperation()
	 * @generated
	 */
	EReference getAngleOperation_Gyrosensor();

	/**
	 * Returns the meta object for class '{@link langageCompilation.BooleanExpression <em>Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Expression</em>'.
	 * @see langageCompilation.BooleanExpression
	 * @generated
	 */
	EClass getBooleanExpression();

	/**
	 * Returns the meta object for the containment reference '{@link langageCompilation.BooleanExpression#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see langageCompilation.BooleanExpression#getLeft()
	 * @see #getBooleanExpression()
	 * @generated
	 */
	EReference getBooleanExpression_Left();

	/**
	 * Returns the meta object for the containment reference '{@link langageCompilation.BooleanExpression#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see langageCompilation.BooleanExpression#getRight()
	 * @see #getBooleanExpression()
	 * @generated
	 */
	EReference getBooleanExpression_Right();

	/**
	 * Returns the meta object for class '{@link langageCompilation.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And</em>'.
	 * @see langageCompilation.And
	 * @generated
	 */
	EClass getAnd();

	/**
	 * Returns the meta object for class '{@link langageCompilation.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or</em>'.
	 * @see langageCompilation.Or
	 * @generated
	 */
	EClass getOr();

	/**
	 * Returns the meta object for class '{@link langageCompilation.MotorizedArmEngine <em>Motorized Arm Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Motorized Arm Engine</em>'.
	 * @see langageCompilation.MotorizedArmEngine
	 * @generated
	 */
	EClass getMotorizedArmEngine();

	/**
	 * Returns the meta object for class '{@link langageCompilation.PositionOperation <em>Position Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position Operation</em>'.
	 * @see langageCompilation.PositionOperation
	 * @generated
	 */
	EClass getPositionOperation();

	/**
	 * Returns the meta object for the reference '{@link langageCompilation.PositionOperation#getMotorizedarmengine <em>Motorizedarmengine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Motorizedarmengine</em>'.
	 * @see langageCompilation.PositionOperation#getMotorizedarmengine()
	 * @see #getPositionOperation()
	 * @generated
	 */
	EReference getPositionOperation_Motorizedarmengine();

	/**
	 * Returns the meta object for class '{@link langageCompilation.PaintballLauncherEngine <em>Paintball Launcher Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paintball Launcher Engine</em>'.
	 * @see langageCompilation.PaintballLauncherEngine
	 * @generated
	 */
	EClass getPaintballLauncherEngine();

	/**
	 * Returns the meta object for class '{@link langageCompilation.ForceOperation <em>Force Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Force Operation</em>'.
	 * @see langageCompilation.ForceOperation
	 * @generated
	 */
	EClass getForceOperation();

	/**
	 * Returns the meta object for the reference '{@link langageCompilation.ForceOperation#getPaintballlauncherengine <em>Paintballlauncherengine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Paintballlauncherengine</em>'.
	 * @see langageCompilation.ForceOperation#getPaintballlauncherengine()
	 * @see #getForceOperation()
	 * @generated
	 */
	EReference getForceOperation_Paintballlauncherengine();

	/**
	 * Returns the meta object for class '{@link langageCompilation.BreakMotor <em>Break Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Break Motor</em>'.
	 * @see langageCompilation.BreakMotor
	 * @generated
	 */
	EClass getBreakMotor();

	/**
	 * Returns the meta object for the reference '{@link langageCompilation.BreakMotor#getEngine <em>Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Engine</em>'.
	 * @see langageCompilation.BreakMotor#getEngine()
	 * @see #getBreakMotor()
	 * @generated
	 */
	EReference getBreakMotor_Engine();

	/**
	 * Returns the meta object for class '{@link langageCompilation.UnColor <em>Un Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Un Color</em>'.
	 * @see langageCompilation.UnColor
	 * @generated
	 */
	EClass getUnColor();

	/**
	 * Returns the meta object for the attribute '{@link langageCompilation.UnColor#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Value</em>'.
	 * @see langageCompilation.UnColor#getInitialValue()
	 * @see #getUnColor()
	 * @generated
	 */
	EAttribute getUnColor_InitialValue();

	/**
	 * Returns the meta object for class '{@link langageCompilation.TheColor <em>The Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>The Color</em>'.
	 * @see langageCompilation.TheColor
	 * @generated
	 */
	EClass getTheColor();

	/**
	 * Returns the meta object for the attribute '{@link langageCompilation.TheColor#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see langageCompilation.TheColor#getValue()
	 * @see #getTheColor()
	 * @generated
	 */
	EAttribute getTheColor_Value();

	/**
	 * Returns the meta object for class '{@link langageCompilation.Pause <em>Pause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pause</em>'.
	 * @see langageCompilation.Pause
	 * @generated
	 */
	EClass getPause();

	/**
	 * Returns the meta object for the containment reference '{@link langageCompilation.Pause#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see langageCompilation.Pause#getExpression()
	 * @see #getPause()
	 * @generated
	 */
	EReference getPause_Expression();

	/**
	 * Returns the meta object for enum '{@link langageCompilation.Colors <em>Colors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Colors</em>'.
	 * @see langageCompilation.Colors
	 * @generated
	 */
	EEnum getColors();

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
		 * The meta object literal for the '{@link langageCompilation.impl.UnIntegerImpl <em>Un Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see langageCompilation.impl.UnIntegerImpl
		 * @see langageCompilation.impl.LangageCompilationPackageImpl#getUnInteger()
		 * @generated
		 */
		EClass UN_INTEGER = eINSTANCE.getUnInteger();

		/**
		 * The meta object literal for the '<em><b>Initiale Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UN_INTEGER__INITIALE_VALUE = eINSTANCE.getUnInteger_InitialeValue();

		/**
		 * The meta object literal for the '{@link langageCompilation.impl.UnStringImpl <em>Un String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see langageCompilation.impl.UnStringImpl
		 * @see langageCompilation.impl.LangageCompilationPackageImpl#getUnString()
		 * @generated
		 */
		EClass UN_STRING = eINSTANCE.getUnString();

		/**
		 * The meta object literal for the '<em><b>Initiale Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UN_STRING__INITIALE_VALUE = eINSTANCE.getUnString_InitialeValue();

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
		 * The meta object literal for the '{@link langageCompilation.impl.UnBooleanImpl <em>Un Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see langageCompilation.impl.UnBooleanImpl
		 * @see langageCompilation.impl.LangageCompilationPackageImpl#getUnBoolean()
		 * @generated
		 */
		EClass UN_BOOLEAN = eINSTANCE.getUnBoolean();

		/**
		 * The meta object literal for the '<em><b>Initiale Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UN_BOOLEAN__INITIALE_VALUE = eINSTANCE.getUnBoolean_InitialeValue();

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
		 * The meta object literal for the '<em><b>Else</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_ETAT__ELSE = eINSTANCE.getConditionEtat_Else();

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
		 * The meta object literal for the '{@link langageCompilation.impl.UnDoubleImpl <em>Un Double</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see langageCompilation.impl.UnDoubleImpl
		 * @see langageCompilation.impl.LangageCompilationPackageImpl#getUnDouble()
		 * @generated
		 */
		EClass UN_DOUBLE = eINSTANCE.getUnDouble();

		/**
		 * The meta object literal for the '<em><b>Initiale Value1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UN_DOUBLE__INITIALE_VALUE1 = eINSTANCE.getUnDouble_InitialeValue1();

		/**
		 * The meta object literal for the '<em><b>Initiale Value2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UN_DOUBLE__INITIALE_VALUE2 = eINSTANCE.getUnDouble_InitialeValue2();

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
		 * The meta object literal for the '{@link langageCompilation.impl.CarImpl <em>Car</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see langageCompilation.impl.CarImpl
		 * @see langageCompilation.impl.LangageCompilationPackageImpl#getCar()
		 * @generated
		 */
		EClass CAR = eINSTANCE.getCar();

		/**
		 * The meta object literal for the '<em><b>Engine</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAR__ENGINE = eINSTANCE.getCar_Engine();

		/**
		 * The meta object literal for the '<em><b>Sensor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAR__SENSOR = eINSTANCE.getCar_Sensor();

		/**
		 * The meta object literal for the '{@link langageCompilation.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see langageCompilation.impl.SensorImpl
		 * @see langageCompilation.impl.LangageCompilationPackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__POSITION = eINSTANCE.getSensor_Position();

		/**
		 * The meta object literal for the '{@link langageCompilation.impl.EngineImpl <em>Engine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see langageCompilation.impl.EngineImpl
		 * @see langageCompilation.impl.LangageCompilationPackageImpl#getEngine()
		 * @generated
		 */
		EClass ENGINE = eINSTANCE.getEngine();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENGINE__POSITION = eINSTANCE.getEngine_Position();

		/**
		 * The meta object literal for the '{@link langageCompilation.impl.ColorSensorImpl <em>Color Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see langageCompilation.impl.ColorSensorImpl
		 * @see langageCompilation.impl.LangageCompilationPackageImpl#getColorSensor()
		 * @generated
		 */
		EClass COLOR_SENSOR = eINSTANCE.getColorSensor();

		/**
		 * The meta object literal for the '{@link langageCompilation.impl.LaserSensorImpl <em>Laser Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see langageCompilation.impl.LaserSensorImpl
		 * @see langageCompilation.impl.LangageCompilationPackageImpl#getLaserSensor()
		 * @generated
		 */
		EClass LASER_SENSOR = eINSTANCE.getLaserSensor();

		/**
		 * The meta object literal for the '{@link langageCompilation.impl.WheelEngineImpl <em>Wheel Engine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see langageCompilation.impl.WheelEngineImpl
		 * @see langageCompilation.impl.LangageCompilationPackageImpl#getWheelEngine()
		 * @generated
		 */
		EClass WHEEL_ENGINE = eINSTANCE.getWheelEngine();

		/**
		 * The meta object literal for the '{@link langageCompilation.impl.EngineOperationImpl <em>Engine Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see langageCompilation.impl.EngineOperationImpl
		 * @see langageCompilation.impl.LangageCompilationPackageImpl#getEngineOperation()
		 * @generated
		 */
		EClass ENGINE_OPERATION = eINSTANCE.getEngineOperation();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENGINE_OPERATION__RIGHT = eINSTANCE.getEngineOperation_Right();

		/**
		 * The meta object literal for the '{@link langageCompilation.impl.SensorOperationImpl <em>Sensor Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see langageCompilation.impl.SensorOperationImpl
		 * @see langageCompilation.impl.LangageCompilationPackageImpl#getSensorOperation()
		 * @generated
		 */
		EClass SENSOR_OPERATION = eINSTANCE.getSensorOperation();

		/**
		 * The meta object literal for the '{@link langageCompilation.impl.NewEClass43Impl <em>New EClass43</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see langageCompilation.impl.NewEClass43Impl
		 * @see langageCompilation.impl.LangageCompilationPackageImpl#getNewEClass43()
		 * @generated
		 */
		EClass NEW_ECLASS43 = eINSTANCE.getNewEClass43();

		/**
		 * The meta object literal for the '{@link langageCompilation.impl.VitesseOperationImpl <em>Vitesse Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see langageCompilation.impl.VitesseOperationImpl
		 * @see langageCompilation.impl.LangageCompilationPackageImpl#getVitesseOperation()
		 * @generated
		 */
		EClass VITESSE_OPERATION = eINSTANCE.getVitesseOperation();

		/**
		 * The meta object literal for the '<em><b>Wheelengine</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VITESSE_OPERATION__WHEELENGINE = eINSTANCE.getVitesseOperation_Wheelengine();

		/**
		 * The meta object literal for the '{@link langageCompilation.impl.ColorOperationImpl <em>Color Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see langageCompilation.impl.ColorOperationImpl
		 * @see langageCompilation.impl.LangageCompilationPackageImpl#getColorOperation()
		 * @generated
		 */
		EClass COLOR_OPERATION = eINSTANCE.getColorOperation();

		/**
		 * The meta object literal for the '<em><b>Colorsensor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLOR_OPERATION__COLORSENSOR = eINSTANCE.getColorOperation_Colorsensor();

		/**
		 * The meta object literal for the '{@link langageCompilation.impl.RangeOperationImpl <em>Range Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see langageCompilation.impl.RangeOperationImpl
		 * @see langageCompilation.impl.LangageCompilationPackageImpl#getRangeOperation()
		 * @generated
		 */
		EClass RANGE_OPERATION = eINSTANCE.getRangeOperation();

		/**
		 * The meta object literal for the '<em><b>Lasersensor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANGE_OPERATION__LASERSENSOR = eINSTANCE.getRangeOperation_Lasersensor();

		/**
		 * The meta object literal for the '{@link langageCompilation.impl.IntensityOperationImpl <em>Intensity Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see langageCompilation.impl.IntensityOperationImpl
		 * @see langageCompilation.impl.LangageCompilationPackageImpl#getIntensityOperation()
		 * @generated
		 */
		EClass INTENSITY_OPERATION = eINSTANCE.getIntensityOperation();

		/**
		 * The meta object literal for the '<em><b>Colorsensor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTENSITY_OPERATION__COLORSENSOR = eINSTANCE.getIntensityOperation_Colorsensor();

		/**
		 * The meta object literal for the '{@link langageCompilation.impl.UltraSonicSensorImpl <em>Ultra Sonic Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see langageCompilation.impl.UltraSonicSensorImpl
		 * @see langageCompilation.impl.LangageCompilationPackageImpl#getUltraSonicSensor()
		 * @generated
		 */
		EClass ULTRA_SONIC_SENSOR = eINSTANCE.getUltraSonicSensor();

		/**
		 * The meta object literal for the '{@link langageCompilation.impl.GyroSensorImpl <em>Gyro Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see langageCompilation.impl.GyroSensorImpl
		 * @see langageCompilation.impl.LangageCompilationPackageImpl#getGyroSensor()
		 * @generated
		 */
		EClass GYRO_SENSOR = eINSTANCE.getGyroSensor();

		/**
		 * The meta object literal for the '{@link langageCompilation.impl.GPSSensorImpl <em>GPS Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see langageCompilation.impl.GPSSensorImpl
		 * @see langageCompilation.impl.LangageCompilationPackageImpl#getGPSSensor()
		 * @generated
		 */
		EClass GPS_SENSOR = eINSTANCE.getGPSSensor();

		/**
		 * The meta object literal for the '{@link langageCompilation.impl.XGPSOperationImpl <em>XGPS Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see langageCompilation.impl.XGPSOperationImpl
		 * @see langageCompilation.impl.LangageCompilationPackageImpl#getXGPSOperation()
		 * @generated
		 */
		EClass XGPS_OPERATION = eINSTANCE.getXGPSOperation();

		/**
		 * The meta object literal for the '<em><b>Gpssensor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XGPS_OPERATION__GPSSENSOR = eINSTANCE.getXGPSOperation_Gpssensor();

		/**
		 * The meta object literal for the '{@link langageCompilation.impl.YGPSOperationImpl <em>YGPS Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see langageCompilation.impl.YGPSOperationImpl
		 * @see langageCompilation.impl.LangageCompilationPackageImpl#getYGPSOperation()
		 * @generated
		 */
		EClass YGPS_OPERATION = eINSTANCE.getYGPSOperation();

		/**
		 * The meta object literal for the '<em><b>Gpssensor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YGPS_OPERATION__GPSSENSOR = eINSTANCE.getYGPSOperation_Gpssensor();

		/**
		 * The meta object literal for the '{@link langageCompilation.impl.DistanceOperationImpl <em>Distance Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see langageCompilation.impl.DistanceOperationImpl
		 * @see langageCompilation.impl.LangageCompilationPackageImpl#getDistanceOperation()
		 * @generated
		 */
		EClass DISTANCE_OPERATION = eINSTANCE.getDistanceOperation();

		/**
		 * The meta object literal for the '<em><b>Ultrasonicsensor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTANCE_OPERATION__ULTRASONICSENSOR = eINSTANCE.getDistanceOperation_Ultrasonicsensor();

		/**
		 * The meta object literal for the '{@link langageCompilation.impl.AngleOperationImpl <em>Angle Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see langageCompilation.impl.AngleOperationImpl
		 * @see langageCompilation.impl.LangageCompilationPackageImpl#getAngleOperation()
		 * @generated
		 */
		EClass ANGLE_OPERATION = eINSTANCE.getAngleOperation();

		/**
		 * The meta object literal for the '<em><b>Gyrosensor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGLE_OPERATION__GYROSENSOR = eINSTANCE.getAngleOperation_Gyrosensor();

		/**
		 * The meta object literal for the '{@link langageCompilation.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see langageCompilation.impl.BooleanExpressionImpl
		 * @see langageCompilation.impl.LangageCompilationPackageImpl#getBooleanExpression()
		 * @generated
		 */
		EClass BOOLEAN_EXPRESSION = eINSTANCE.getBooleanExpression();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_EXPRESSION__LEFT = eINSTANCE.getBooleanExpression_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_EXPRESSION__RIGHT = eINSTANCE.getBooleanExpression_Right();

		/**
		 * The meta object literal for the '{@link langageCompilation.impl.AndImpl <em>And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see langageCompilation.impl.AndImpl
		 * @see langageCompilation.impl.LangageCompilationPackageImpl#getAnd()
		 * @generated
		 */
		EClass AND = eINSTANCE.getAnd();

		/**
		 * The meta object literal for the '{@link langageCompilation.impl.OrImpl <em>Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see langageCompilation.impl.OrImpl
		 * @see langageCompilation.impl.LangageCompilationPackageImpl#getOr()
		 * @generated
		 */
		EClass OR = eINSTANCE.getOr();

		/**
		 * The meta object literal for the '{@link langageCompilation.impl.MotorizedArmEngineImpl <em>Motorized Arm Engine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see langageCompilation.impl.MotorizedArmEngineImpl
		 * @see langageCompilation.impl.LangageCompilationPackageImpl#getMotorizedArmEngine()
		 * @generated
		 */
		EClass MOTORIZED_ARM_ENGINE = eINSTANCE.getMotorizedArmEngine();

		/**
		 * The meta object literal for the '{@link langageCompilation.impl.PositionOperationImpl <em>Position Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see langageCompilation.impl.PositionOperationImpl
		 * @see langageCompilation.impl.LangageCompilationPackageImpl#getPositionOperation()
		 * @generated
		 */
		EClass POSITION_OPERATION = eINSTANCE.getPositionOperation();

		/**
		 * The meta object literal for the '<em><b>Motorizedarmengine</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSITION_OPERATION__MOTORIZEDARMENGINE = eINSTANCE.getPositionOperation_Motorizedarmengine();

		/**
		 * The meta object literal for the '{@link langageCompilation.impl.PaintballLauncherEngineImpl <em>Paintball Launcher Engine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see langageCompilation.impl.PaintballLauncherEngineImpl
		 * @see langageCompilation.impl.LangageCompilationPackageImpl#getPaintballLauncherEngine()
		 * @generated
		 */
		EClass PAINTBALL_LAUNCHER_ENGINE = eINSTANCE.getPaintballLauncherEngine();

		/**
		 * The meta object literal for the '{@link langageCompilation.impl.ForceOperationImpl <em>Force Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see langageCompilation.impl.ForceOperationImpl
		 * @see langageCompilation.impl.LangageCompilationPackageImpl#getForceOperation()
		 * @generated
		 */
		EClass FORCE_OPERATION = eINSTANCE.getForceOperation();

		/**
		 * The meta object literal for the '<em><b>Paintballlauncherengine</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORCE_OPERATION__PAINTBALLLAUNCHERENGINE = eINSTANCE.getForceOperation_Paintballlauncherengine();

		/**
		 * The meta object literal for the '{@link langageCompilation.impl.BreakMotorImpl <em>Break Motor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see langageCompilation.impl.BreakMotorImpl
		 * @see langageCompilation.impl.LangageCompilationPackageImpl#getBreakMotor()
		 * @generated
		 */
		EClass BREAK_MOTOR = eINSTANCE.getBreakMotor();

		/**
		 * The meta object literal for the '<em><b>Engine</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BREAK_MOTOR__ENGINE = eINSTANCE.getBreakMotor_Engine();

		/**
		 * The meta object literal for the '{@link langageCompilation.impl.UnColorImpl <em>Un Color</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see langageCompilation.impl.UnColorImpl
		 * @see langageCompilation.impl.LangageCompilationPackageImpl#getUnColor()
		 * @generated
		 */
		EClass UN_COLOR = eINSTANCE.getUnColor();

		/**
		 * The meta object literal for the '<em><b>Initial Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UN_COLOR__INITIAL_VALUE = eINSTANCE.getUnColor_InitialValue();

		/**
		 * The meta object literal for the '{@link langageCompilation.impl.TheColorImpl <em>The Color</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see langageCompilation.impl.TheColorImpl
		 * @see langageCompilation.impl.LangageCompilationPackageImpl#getTheColor()
		 * @generated
		 */
		EClass THE_COLOR = eINSTANCE.getTheColor();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THE_COLOR__VALUE = eINSTANCE.getTheColor_Value();

		/**
		 * The meta object literal for the '{@link langageCompilation.impl.PauseImpl <em>Pause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see langageCompilation.impl.PauseImpl
		 * @see langageCompilation.impl.LangageCompilationPackageImpl#getPause()
		 * @generated
		 */
		EClass PAUSE = eINSTANCE.getPause();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAUSE__EXPRESSION = eINSTANCE.getPause_Expression();

		/**
		 * The meta object literal for the '{@link langageCompilation.Colors <em>Colors</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see langageCompilation.Colors
		 * @see langageCompilation.impl.LangageCompilationPackageImpl#getColors()
		 * @generated
		 */
		EEnum COLORS = eINSTANCE.getColors();

	}

} //LangageCompilationPackage
