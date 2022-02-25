/**
 */
package langageCompilation.util;

import langageCompilation.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see langageCompilation.LangageCompilationPackage
 * @generated
 */
public class LangageCompilationSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LangageCompilationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LangageCompilationSwitch() {
		if (modelPackage == null) {
			modelPackage = LangageCompilationPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case LangageCompilationPackage.PROGRAM: {
			Program program = (Program) theEObject;
			T result = caseProgram(program);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LangageCompilationPackage.STATEMENT: {
			Statement statement = (Statement) theEObject;
			T result = caseStatement(statement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LangageCompilationPackage.VARIABLE: {
			Variable variable = (Variable) theEObject;
			T result = caseVariable(variable);
			if (result == null)
				result = caseStatement(variable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LangageCompilationPackage.LOOP: {
			Loop loop = (Loop) theEObject;
			T result = caseLoop(loop);
			if (result == null)
				result = caseStatement(loop);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LangageCompilationPackage.WHILE_LOOP: {
			WhileLoop whileLoop = (WhileLoop) theEObject;
			T result = caseWhileLoop(whileLoop);
			if (result == null)
				result = caseLoop(whileLoop);
			if (result == null)
				result = caseStatement(whileLoop);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LangageCompilationPackage.EXPRESSION: {
			Expression expression = (Expression) theEObject;
			T result = caseExpression(expression);
			if (result == null)
				result = caseStatement(expression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LangageCompilationPackage.BINARY_OPERATION: {
			BinaryOperation binaryOperation = (BinaryOperation) theEObject;
			T result = caseBinaryOperation(binaryOperation);
			if (result == null)
				result = caseExpression(binaryOperation);
			if (result == null)
				result = caseStatement(binaryOperation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LangageCompilationPackage.VARIABLE_REF: {
			VariableRef variableRef = (VariableRef) theEObject;
			T result = caseVariableRef(variableRef);
			if (result == null)
				result = caseExpression(variableRef);
			if (result == null)
				result = caseStatement(variableRef);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LangageCompilationPackage.SUBSTRACTION: {
			Substraction substraction = (Substraction) theEObject;
			T result = caseSubstraction(substraction);
			if (result == null)
				result = caseBinaryOperation(substraction);
			if (result == null)
				result = caseExpression(substraction);
			if (result == null)
				result = caseStatement(substraction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LangageCompilationPackage.COMPARAISON: {
			Comparaison comparaison = (Comparaison) theEObject;
			T result = caseComparaison(comparaison);
			if (result == null)
				result = caseBinaryOperation(comparaison);
			if (result == null)
				result = caseExpression(comparaison);
			if (result == null)
				result = caseStatement(comparaison);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LangageCompilationPackage.GT: {
			GT gt = (GT) theEObject;
			T result = caseGT(gt);
			if (result == null)
				result = caseComparaison(gt);
			if (result == null)
				result = caseBinaryOperation(gt);
			if (result == null)
				result = caseExpression(gt);
			if (result == null)
				result = caseStatement(gt);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LangageCompilationPackage.ASSIGNEMENT: {
			Assignement assignement = (Assignement) theEObject;
			T result = caseAssignement(assignement);
			if (result == null)
				result = caseBinaryOperation(assignement);
			if (result == null)
				result = caseExpression(assignement);
			if (result == null)
				result = caseStatement(assignement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LangageCompilationPackage.UN_INTEGER: {
			UnInteger unInteger = (UnInteger) theEObject;
			T result = caseUnInteger(unInteger);
			if (result == null)
				result = caseVariable(unInteger);
			if (result == null)
				result = caseStatement(unInteger);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LangageCompilationPackage.UN_STRING: {
			UnString unString = (UnString) theEObject;
			T result = caseUnString(unString);
			if (result == null)
				result = caseVariable(unString);
			if (result == null)
				result = caseStatement(unString);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LangageCompilationPackage.LT: {
			LT lt = (LT) theEObject;
			T result = caseLT(lt);
			if (result == null)
				result = caseComparaison(lt);
			if (result == null)
				result = caseBinaryOperation(lt);
			if (result == null)
				result = caseExpression(lt);
			if (result == null)
				result = caseStatement(lt);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LangageCompilationPackage.EQUAL: {
			Equal equal = (Equal) theEObject;
			T result = caseEqual(equal);
			if (result == null)
				result = caseComparaison(equal);
			if (result == null)
				result = caseBinaryOperation(equal);
			if (result == null)
				result = caseExpression(equal);
			if (result == null)
				result = caseStatement(equal);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LangageCompilationPackage.ADDITION: {
			Addition addition = (Addition) theEObject;
			T result = caseAddition(addition);
			if (result == null)
				result = caseBinaryOperation(addition);
			if (result == null)
				result = caseExpression(addition);
			if (result == null)
				result = caseStatement(addition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LangageCompilationPackage.DIVISION: {
			Division division = (Division) theEObject;
			T result = caseDivision(division);
			if (result == null)
				result = caseBinaryOperation(division);
			if (result == null)
				result = caseExpression(division);
			if (result == null)
				result = caseStatement(division);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LangageCompilationPackage.MULTIPLICATION: {
			Multiplication multiplication = (Multiplication) theEObject;
			T result = caseMultiplication(multiplication);
			if (result == null)
				result = caseBinaryOperation(multiplication);
			if (result == null)
				result = caseExpression(multiplication);
			if (result == null)
				result = caseStatement(multiplication);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LangageCompilationPackage.LTOR_EQUAL: {
			LTorEqual lTorEqual = (LTorEqual) theEObject;
			T result = caseLTorEqual(lTorEqual);
			if (result == null)
				result = caseComparaison(lTorEqual);
			if (result == null)
				result = caseBinaryOperation(lTorEqual);
			if (result == null)
				result = caseExpression(lTorEqual);
			if (result == null)
				result = caseStatement(lTorEqual);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LangageCompilationPackage.GTOR_EQUAL: {
			GTorEqual gTorEqual = (GTorEqual) theEObject;
			T result = caseGTorEqual(gTorEqual);
			if (result == null)
				result = caseComparaison(gTorEqual);
			if (result == null)
				result = caseBinaryOperation(gTorEqual);
			if (result == null)
				result = caseExpression(gTorEqual);
			if (result == null)
				result = caseStatement(gTorEqual);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LangageCompilationPackage.UN_BOOLEAN: {
			UnBoolean unBoolean = (UnBoolean) theEObject;
			T result = caseUnBoolean(unBoolean);
			if (result == null)
				result = caseVariable(unBoolean);
			if (result == null)
				result = caseStatement(unBoolean);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LangageCompilationPackage.DIFFERENT: {
			Different different = (Different) theEObject;
			T result = caseDifferent(different);
			if (result == null)
				result = caseComparaison(different);
			if (result == null)
				result = caseBinaryOperation(different);
			if (result == null)
				result = caseExpression(different);
			if (result == null)
				result = caseStatement(different);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LangageCompilationPackage.CONDITION_ETAT: {
			ConditionEtat conditionEtat = (ConditionEtat) theEObject;
			T result = caseConditionEtat(conditionEtat);
			if (result == null)
				result = caseStatement(conditionEtat);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LangageCompilationPackage.METHODE_PRINT: {
			MethodePrint methodePrint = (MethodePrint) theEObject;
			T result = caseMethodePrint(methodePrint);
			if (result == null)
				result = caseStatement(methodePrint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LangageCompilationPackage.UN_DOUBLE: {
			UnDouble unDouble = (UnDouble) theEObject;
			T result = caseUnDouble(unDouble);
			if (result == null)
				result = caseVariable(unDouble);
			if (result == null)
				result = caseStatement(unDouble);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LangageCompilationPackage.THE_BOOLEAN: {
			TheBoolean theBoolean = (TheBoolean) theEObject;
			T result = caseTheBoolean(theBoolean);
			if (result == null)
				result = caseExpression(theBoolean);
			if (result == null)
				result = caseStatement(theBoolean);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LangageCompilationPackage.THE_DOUBLE: {
			TheDouble theDouble = (TheDouble) theEObject;
			T result = caseTheDouble(theDouble);
			if (result == null)
				result = caseExpression(theDouble);
			if (result == null)
				result = caseStatement(theDouble);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LangageCompilationPackage.THE_INT: {
			TheInt theInt = (TheInt) theEObject;
			T result = caseTheInt(theInt);
			if (result == null)
				result = caseExpression(theInt);
			if (result == null)
				result = caseStatement(theInt);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LangageCompilationPackage.THE_STRING: {
			TheString theString = (TheString) theEObject;
			T result = caseTheString(theString);
			if (result == null)
				result = caseExpression(theString);
			if (result == null)
				result = caseStatement(theString);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LangageCompilationPackage.PLUS_EQUAL: {
			PlusEqual plusEqual = (PlusEqual) theEObject;
			T result = casePlusEqual(plusEqual);
			if (result == null)
				result = caseBinaryOperation(plusEqual);
			if (result == null)
				result = caseExpression(plusEqual);
			if (result == null)
				result = caseStatement(plusEqual);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LangageCompilationPackage.MINUS_EQUAL: {
			MinusEqual minusEqual = (MinusEqual) theEObject;
			T result = caseMinusEqual(minusEqual);
			if (result == null)
				result = caseBinaryOperation(minusEqual);
			if (result == null)
				result = caseExpression(minusEqual);
			if (result == null)
				result = caseStatement(minusEqual);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LangageCompilationPackage.CAR: {
			Car car = (Car) theEObject;
			T result = caseCar(car);
			if (result == null)
				result = caseStatement(car);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LangageCompilationPackage.SENSOR: {
			Sensor sensor = (Sensor) theEObject;
			T result = caseSensor(sensor);
			if (result == null)
				result = caseStatement(sensor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LangageCompilationPackage.ENGINE: {
			Engine engine = (Engine) theEObject;
			T result = caseEngine(engine);
			if (result == null)
				result = caseStatement(engine);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LangageCompilationPackage.COLOR_SENSOR: {
			ColorSensor colorSensor = (ColorSensor) theEObject;
			T result = caseColorSensor(colorSensor);
			if (result == null)
				result = caseSensor(colorSensor);
			if (result == null)
				result = caseStatement(colorSensor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LangageCompilationPackage.LASER_SENSOR: {
			LaserSensor laserSensor = (LaserSensor) theEObject;
			T result = caseLaserSensor(laserSensor);
			if (result == null)
				result = caseSensor(laserSensor);
			if (result == null)
				result = caseStatement(laserSensor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LangageCompilationPackage.WHEEL_ENGINE: {
			WheelEngine wheelEngine = (WheelEngine) theEObject;
			T result = caseWheelEngine(wheelEngine);
			if (result == null)
				result = caseEngine(wheelEngine);
			if (result == null)
				result = caseStatement(wheelEngine);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LangageCompilationPackage.ENGINE_OPERATION: {
			EngineOperation engineOperation = (EngineOperation) theEObject;
			T result = caseEngineOperation(engineOperation);
			if (result == null)
				result = caseExpression(engineOperation);
			if (result == null)
				result = caseStatement(engineOperation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LangageCompilationPackage.SENSOR_OPERATION: {
			SensorOperation sensorOperation = (SensorOperation) theEObject;
			T result = caseSensorOperation(sensorOperation);
			if (result == null)
				result = caseExpression(sensorOperation);
			if (result == null)
				result = caseStatement(sensorOperation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LangageCompilationPackage.ENGINE_REF: {
			EngineRef engineRef = (EngineRef) theEObject;
			T result = caseEngineRef(engineRef);
			if (result == null)
				result = caseExpression(engineRef);
			if (result == null)
				result = caseStatement(engineRef);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LangageCompilationPackage.SENSOR_REF: {
			SensorRef sensorRef = (SensorRef) theEObject;
			T result = caseSensorRef(sensorRef);
			if (result == null)
				result = caseExpression(sensorRef);
			if (result == null)
				result = caseStatement(sensorRef);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LangageCompilationPackage.NEW_ECLASS43: {
			NewEClass43 newEClass43 = (NewEClass43) theEObject;
			T result = caseNewEClass43(newEClass43);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LangageCompilationPackage.VITESSE_OPERATION: {
			VitesseOperation vitesseOperation = (VitesseOperation) theEObject;
			T result = caseVitesseOperation(vitesseOperation);
			if (result == null)
				result = caseEngineOperation(vitesseOperation);
			if (result == null)
				result = caseExpression(vitesseOperation);
			if (result == null)
				result = caseStatement(vitesseOperation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LangageCompilationPackage.COLOR_OPERATION: {
			ColorOperation colorOperation = (ColorOperation) theEObject;
			T result = caseColorOperation(colorOperation);
			if (result == null)
				result = caseSensorOperation(colorOperation);
			if (result == null)
				result = caseExpression(colorOperation);
			if (result == null)
				result = caseStatement(colorOperation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LangageCompilationPackage.RANGE_OPERATION: {
			RangeOperation rangeOperation = (RangeOperation) theEObject;
			T result = caseRangeOperation(rangeOperation);
			if (result == null)
				result = caseSensorOperation(rangeOperation);
			if (result == null)
				result = caseExpression(rangeOperation);
			if (result == null)
				result = caseStatement(rangeOperation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Program</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Program</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgram(Program object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatement(Statement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoop(Loop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>While Loop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>While Loop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhileLoop(WhileLoop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryOperation(BinaryOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableRef(VariableRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substraction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substraction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstraction(Substraction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comparaison</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comparaison</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComparaison(Comparaison object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGT(GT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assignement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assignement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignement(Assignement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Un Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Un Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnInteger(UnInteger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Un String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Un String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnString(UnString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLT(LT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEqual(Equal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Addition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Addition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddition(Addition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Division</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Division</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDivision(Division object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiplication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiplication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiplication(Multiplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LTor Equal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LTor Equal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLTorEqual(LTorEqual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GTor Equal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GTor Equal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGTorEqual(GTorEqual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Un Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Un Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnBoolean(UnBoolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Different</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Different</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDifferent(Different object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition Etat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition Etat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionEtat(ConditionEtat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Methode Print</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Methode Print</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodePrint(MethodePrint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Un Double</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Un Double</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnDouble(UnDouble object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>The Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>The Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTheBoolean(TheBoolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>The Double</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>The Double</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTheDouble(TheDouble object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>The Int</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>The Int</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTheInt(TheInt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>The String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>The String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTheString(TheString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plus Equal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plus Equal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlusEqual(PlusEqual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Minus Equal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Minus Equal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinusEqual(MinusEqual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Car</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Car</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCar(Car object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensor(Sensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Engine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Engine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEngine(Engine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Color Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Color Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColorSensor(ColorSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Laser Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Laser Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLaserSensor(LaserSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wheel Engine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wheel Engine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWheelEngine(WheelEngine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Engine Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Engine Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEngineOperation(EngineOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensor Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensor Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensorOperation(SensorOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Engine Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Engine Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEngineRef(EngineRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensor Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensor Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensorRef(SensorRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>New EClass43</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>New EClass43</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNewEClass43(NewEClass43 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vitesse Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vitesse Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVitesseOperation(VitesseOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Color Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Color Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColorOperation(ColorOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRangeOperation(RangeOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //LangageCompilationSwitch
