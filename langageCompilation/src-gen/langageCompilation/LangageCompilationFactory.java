/**
 */
package langageCompilation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see langageCompilation.LangageCompilationPackage
 * @generated
 */
public interface LangageCompilationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LangageCompilationFactory eINSTANCE = langageCompilation.impl.LangageCompilationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Program</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Program</em>'.
	 * @generated
	 */
	Program createProgram();

	/**
	 * Returns a new object of class '<em>While Loop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>While Loop</em>'.
	 * @generated
	 */
	WhileLoop createWhileLoop();

	/**
	 * Returns a new object of class '<em>Variable Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Ref</em>'.
	 * @generated
	 */
	VariableRef createVariableRef();

	/**
	 * Returns a new object of class '<em>Substraction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Substraction</em>'.
	 * @generated
	 */
	Substraction createSubstraction();

	/**
	 * Returns a new object of class '<em>GT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GT</em>'.
	 * @generated
	 */
	GT createGT();

	/**
	 * Returns a new object of class '<em>Assignement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assignement</em>'.
	 * @generated
	 */
	Assignement createAssignement();

	/**
	 * Returns a new object of class '<em>un Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>un Integer</em>'.
	 * @generated
	 */
	unInteger createunInteger();

	/**
	 * Returns a new object of class '<em>un String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>un String</em>'.
	 * @generated
	 */
	unString createunString();

	/**
	 * Returns a new object of class '<em>LT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LT</em>'.
	 * @generated
	 */
	LT createLT();

	/**
	 * Returns a new object of class '<em>Equal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equal</em>'.
	 * @generated
	 */
	Equal createEqual();

	/**
	 * Returns a new object of class '<em>Addition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Addition</em>'.
	 * @generated
	 */
	Addition createAddition();

	/**
	 * Returns a new object of class '<em>Division</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Division</em>'.
	 * @generated
	 */
	Division createDivision();

	/**
	 * Returns a new object of class '<em>Multiplication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multiplication</em>'.
	 * @generated
	 */
	Multiplication createMultiplication();

	/**
	 * Returns a new object of class '<em>LTor Equal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LTor Equal</em>'.
	 * @generated
	 */
	LTorEqual createLTorEqual();

	/**
	 * Returns a new object of class '<em>GTor Equal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GTor Equal</em>'.
	 * @generated
	 */
	GTorEqual createGTorEqual();

	/**
	 * Returns a new object of class '<em>un Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>un Boolean</em>'.
	 * @generated
	 */
	unBoolean createunBoolean();

	/**
	 * Returns a new object of class '<em>Different</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Different</em>'.
	 * @generated
	 */
	Different createDifferent();

	/**
	 * Returns a new object of class '<em>Condition Etat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition Etat</em>'.
	 * @generated
	 */
	ConditionEtat createConditionEtat();

	/**
	 * Returns a new object of class '<em>Methode Print</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Methode Print</em>'.
	 * @generated
	 */
	MethodePrint createMethodePrint();

	/**
	 * Returns a new object of class '<em>un Double</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>un Double</em>'.
	 * @generated
	 */
	unDouble createunDouble();

	/**
	 * Returns a new object of class '<em>The Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>The Boolean</em>'.
	 * @generated
	 */
	TheBoolean createTheBoolean();

	/**
	 * Returns a new object of class '<em>The Double</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>The Double</em>'.
	 * @generated
	 */
	TheDouble createTheDouble();

	/**
	 * Returns a new object of class '<em>The Int</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>The Int</em>'.
	 * @generated
	 */
	TheInt createTheInt();

	/**
	 * Returns a new object of class '<em>The String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>The String</em>'.
	 * @generated
	 */
	TheString createTheString();

	/**
	 * Returns a new object of class '<em>Plus Equal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plus Equal</em>'.
	 * @generated
	 */
	PlusEqual createPlusEqual();

	/**
	 * Returns a new object of class '<em>Minus Equal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Minus Equal</em>'.
	 * @generated
	 */
	MinusEqual createMinusEqual();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LangageCompilationPackage getLangageCompilationPackage();

} //LangageCompilationFactory
