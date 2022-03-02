/**
 */
package langageCompilation.util;

import langageCompilation.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see langageCompilation.LangageCompilationPackage
 * @generated
 */
public class LangageCompilationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LangageCompilationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LangageCompilationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LangageCompilationPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LangageCompilationSwitch<Adapter> modelSwitch = new LangageCompilationSwitch<Adapter>() {
		@Override
		public Adapter caseProgram(Program object) {
			return createProgramAdapter();
		}

		@Override
		public Adapter caseStatement(Statement object) {
			return createStatementAdapter();
		}

		@Override
		public Adapter caseVariable(Variable object) {
			return createVariableAdapter();
		}

		@Override
		public Adapter caseLoop(Loop object) {
			return createLoopAdapter();
		}

		@Override
		public Adapter caseWhileLoop(WhileLoop object) {
			return createWhileLoopAdapter();
		}

		@Override
		public Adapter caseExpression(Expression object) {
			return createExpressionAdapter();
		}

		@Override
		public Adapter caseBinaryOperation(BinaryOperation object) {
			return createBinaryOperationAdapter();
		}

		@Override
		public Adapter caseVariableRef(VariableRef object) {
			return createVariableRefAdapter();
		}

		@Override
		public Adapter caseSubstraction(Substraction object) {
			return createSubstractionAdapter();
		}

		@Override
		public Adapter caseComparaison(Comparaison object) {
			return createComparaisonAdapter();
		}

		@Override
		public Adapter caseGT(GT object) {
			return createGTAdapter();
		}

		@Override
		public Adapter caseAssignement(Assignement object) {
			return createAssignementAdapter();
		}

		@Override
		public Adapter caseUnInteger(UnInteger object) {
			return createUnIntegerAdapter();
		}

		@Override
		public Adapter caseUnString(UnString object) {
			return createUnStringAdapter();
		}

		@Override
		public Adapter caseLT(LT object) {
			return createLTAdapter();
		}

		@Override
		public Adapter caseEqual(Equal object) {
			return createEqualAdapter();
		}

		@Override
		public Adapter caseAddition(Addition object) {
			return createAdditionAdapter();
		}

		@Override
		public Adapter caseDivision(Division object) {
			return createDivisionAdapter();
		}

		@Override
		public Adapter caseMultiplication(Multiplication object) {
			return createMultiplicationAdapter();
		}

		@Override
		public Adapter caseLTorEqual(LTorEqual object) {
			return createLTorEqualAdapter();
		}

		@Override
		public Adapter caseGTorEqual(GTorEqual object) {
			return createGTorEqualAdapter();
		}

		@Override
		public Adapter caseUnBoolean(UnBoolean object) {
			return createUnBooleanAdapter();
		}

		@Override
		public Adapter caseDifferent(Different object) {
			return createDifferentAdapter();
		}

		@Override
		public Adapter caseConditionEtat(ConditionEtat object) {
			return createConditionEtatAdapter();
		}

		@Override
		public Adapter caseMethodePrint(MethodePrint object) {
			return createMethodePrintAdapter();
		}

		@Override
		public Adapter caseUnDouble(UnDouble object) {
			return createUnDoubleAdapter();
		}

		@Override
		public Adapter caseTheBoolean(TheBoolean object) {
			return createTheBooleanAdapter();
		}

		@Override
		public Adapter caseTheDouble(TheDouble object) {
			return createTheDoubleAdapter();
		}

		@Override
		public Adapter caseTheInt(TheInt object) {
			return createTheIntAdapter();
		}

		@Override
		public Adapter caseTheString(TheString object) {
			return createTheStringAdapter();
		}

		@Override
		public Adapter casePlusEqual(PlusEqual object) {
			return createPlusEqualAdapter();
		}

		@Override
		public Adapter caseMinusEqual(MinusEqual object) {
			return createMinusEqualAdapter();
		}

		@Override
		public Adapter caseCar(Car object) {
			return createCarAdapter();
		}

		@Override
		public Adapter caseSensor(Sensor object) {
			return createSensorAdapter();
		}

		@Override
		public Adapter caseEngine(Engine object) {
			return createEngineAdapter();
		}

		@Override
		public Adapter caseColorSensor(ColorSensor object) {
			return createColorSensorAdapter();
		}

		@Override
		public Adapter caseLaserSensor(LaserSensor object) {
			return createLaserSensorAdapter();
		}

		@Override
		public Adapter caseWheelEngine(WheelEngine object) {
			return createWheelEngineAdapter();
		}

		@Override
		public Adapter caseEngineOperation(EngineOperation object) {
			return createEngineOperationAdapter();
		}

		@Override
		public Adapter caseSensorOperation(SensorOperation object) {
			return createSensorOperationAdapter();
		}

		@Override
		public Adapter caseNewEClass43(NewEClass43 object) {
			return createNewEClass43Adapter();
		}

		@Override
		public Adapter caseVitesseOperation(VitesseOperation object) {
			return createVitesseOperationAdapter();
		}

		@Override
		public Adapter caseColorOperation(ColorOperation object) {
			return createColorOperationAdapter();
		}

		@Override
		public Adapter caseRangeOperation(RangeOperation object) {
			return createRangeOperationAdapter();
		}

		@Override
		public Adapter caseIntensityOperation(IntensityOperation object) {
			return createIntensityOperationAdapter();
		}

		@Override
		public Adapter caseUltraSonicSensor(UltraSonicSensor object) {
			return createUltraSonicSensorAdapter();
		}

		@Override
		public Adapter caseGyroSensor(GyroSensor object) {
			return createGyroSensorAdapter();
		}

		@Override
		public Adapter caseGPSSensor(GPSSensor object) {
			return createGPSSensorAdapter();
		}

		@Override
		public Adapter caseXGPSOperation(XGPSOperation object) {
			return createXGPSOperationAdapter();
		}

		@Override
		public Adapter caseYGPSOperation(YGPSOperation object) {
			return createYGPSOperationAdapter();
		}

		@Override
		public Adapter caseDistanceOperation(DistanceOperation object) {
			return createDistanceOperationAdapter();
		}

		@Override
		public Adapter caseAngleOperation(AngleOperation object) {
			return createAngleOperationAdapter();
		}

		@Override
		public Adapter caseBooleanExpression(BooleanExpression object) {
			return createBooleanExpressionAdapter();
		}

		@Override
		public Adapter caseAnd(And object) {
			return createAndAdapter();
		}

		@Override
		public Adapter caseOr(Or object) {
			return createOrAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link langageCompilation.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see langageCompilation.Program
	 * @generated
	 */
	public Adapter createProgramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link langageCompilation.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see langageCompilation.Statement
	 * @generated
	 */
	public Adapter createStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link langageCompilation.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see langageCompilation.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link langageCompilation.Loop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see langageCompilation.Loop
	 * @generated
	 */
	public Adapter createLoopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link langageCompilation.WhileLoop <em>While Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see langageCompilation.WhileLoop
	 * @generated
	 */
	public Adapter createWhileLoopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link langageCompilation.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see langageCompilation.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link langageCompilation.BinaryOperation <em>Binary Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see langageCompilation.BinaryOperation
	 * @generated
	 */
	public Adapter createBinaryOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link langageCompilation.VariableRef <em>Variable Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see langageCompilation.VariableRef
	 * @generated
	 */
	public Adapter createVariableRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link langageCompilation.Substraction <em>Substraction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see langageCompilation.Substraction
	 * @generated
	 */
	public Adapter createSubstractionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link langageCompilation.Comparaison <em>Comparaison</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see langageCompilation.Comparaison
	 * @generated
	 */
	public Adapter createComparaisonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link langageCompilation.GT <em>GT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see langageCompilation.GT
	 * @generated
	 */
	public Adapter createGTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link langageCompilation.Assignement <em>Assignement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see langageCompilation.Assignement
	 * @generated
	 */
	public Adapter createAssignementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link langageCompilation.UnInteger <em>Un Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see langageCompilation.UnInteger
	 * @generated
	 */
	public Adapter createUnIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link langageCompilation.UnString <em>Un String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see langageCompilation.UnString
	 * @generated
	 */
	public Adapter createUnStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link langageCompilation.LT <em>LT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see langageCompilation.LT
	 * @generated
	 */
	public Adapter createLTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link langageCompilation.Equal <em>Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see langageCompilation.Equal
	 * @generated
	 */
	public Adapter createEqualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link langageCompilation.Addition <em>Addition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see langageCompilation.Addition
	 * @generated
	 */
	public Adapter createAdditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link langageCompilation.Division <em>Division</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see langageCompilation.Division
	 * @generated
	 */
	public Adapter createDivisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link langageCompilation.Multiplication <em>Multiplication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see langageCompilation.Multiplication
	 * @generated
	 */
	public Adapter createMultiplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link langageCompilation.LTorEqual <em>LTor Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see langageCompilation.LTorEqual
	 * @generated
	 */
	public Adapter createLTorEqualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link langageCompilation.GTorEqual <em>GTor Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see langageCompilation.GTorEqual
	 * @generated
	 */
	public Adapter createGTorEqualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link langageCompilation.UnBoolean <em>Un Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see langageCompilation.UnBoolean
	 * @generated
	 */
	public Adapter createUnBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link langageCompilation.Different <em>Different</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see langageCompilation.Different
	 * @generated
	 */
	public Adapter createDifferentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link langageCompilation.ConditionEtat <em>Condition Etat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see langageCompilation.ConditionEtat
	 * @generated
	 */
	public Adapter createConditionEtatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link langageCompilation.MethodePrint <em>Methode Print</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see langageCompilation.MethodePrint
	 * @generated
	 */
	public Adapter createMethodePrintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link langageCompilation.UnDouble <em>Un Double</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see langageCompilation.UnDouble
	 * @generated
	 */
	public Adapter createUnDoubleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link langageCompilation.TheBoolean <em>The Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see langageCompilation.TheBoolean
	 * @generated
	 */
	public Adapter createTheBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link langageCompilation.TheDouble <em>The Double</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see langageCompilation.TheDouble
	 * @generated
	 */
	public Adapter createTheDoubleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link langageCompilation.TheInt <em>The Int</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see langageCompilation.TheInt
	 * @generated
	 */
	public Adapter createTheIntAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link langageCompilation.TheString <em>The String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see langageCompilation.TheString
	 * @generated
	 */
	public Adapter createTheStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link langageCompilation.PlusEqual <em>Plus Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see langageCompilation.PlusEqual
	 * @generated
	 */
	public Adapter createPlusEqualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link langageCompilation.MinusEqual <em>Minus Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see langageCompilation.MinusEqual
	 * @generated
	 */
	public Adapter createMinusEqualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link langageCompilation.Car <em>Car</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see langageCompilation.Car
	 * @generated
	 */
	public Adapter createCarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link langageCompilation.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see langageCompilation.Sensor
	 * @generated
	 */
	public Adapter createSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link langageCompilation.Engine <em>Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see langageCompilation.Engine
	 * @generated
	 */
	public Adapter createEngineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link langageCompilation.ColorSensor <em>Color Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see langageCompilation.ColorSensor
	 * @generated
	 */
	public Adapter createColorSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link langageCompilation.LaserSensor <em>Laser Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see langageCompilation.LaserSensor
	 * @generated
	 */
	public Adapter createLaserSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link langageCompilation.WheelEngine <em>Wheel Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see langageCompilation.WheelEngine
	 * @generated
	 */
	public Adapter createWheelEngineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link langageCompilation.EngineOperation <em>Engine Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see langageCompilation.EngineOperation
	 * @generated
	 */
	public Adapter createEngineOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link langageCompilation.SensorOperation <em>Sensor Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see langageCompilation.SensorOperation
	 * @generated
	 */
	public Adapter createSensorOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link langageCompilation.NewEClass43 <em>New EClass43</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see langageCompilation.NewEClass43
	 * @generated
	 */
	public Adapter createNewEClass43Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link langageCompilation.VitesseOperation <em>Vitesse Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see langageCompilation.VitesseOperation
	 * @generated
	 */
	public Adapter createVitesseOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link langageCompilation.ColorOperation <em>Color Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see langageCompilation.ColorOperation
	 * @generated
	 */
	public Adapter createColorOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link langageCompilation.RangeOperation <em>Range Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see langageCompilation.RangeOperation
	 * @generated
	 */
	public Adapter createRangeOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link langageCompilation.IntensityOperation <em>Intensity Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see langageCompilation.IntensityOperation
	 * @generated
	 */
	public Adapter createIntensityOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link langageCompilation.UltraSonicSensor <em>Ultra Sonic Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see langageCompilation.UltraSonicSensor
	 * @generated
	 */
	public Adapter createUltraSonicSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link langageCompilation.GyroSensor <em>Gyro Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see langageCompilation.GyroSensor
	 * @generated
	 */
	public Adapter createGyroSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link langageCompilation.GPSSensor <em>GPS Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see langageCompilation.GPSSensor
	 * @generated
	 */
	public Adapter createGPSSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link langageCompilation.XGPSOperation <em>XGPS Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see langageCompilation.XGPSOperation
	 * @generated
	 */
	public Adapter createXGPSOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link langageCompilation.YGPSOperation <em>YGPS Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see langageCompilation.YGPSOperation
	 * @generated
	 */
	public Adapter createYGPSOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link langageCompilation.DistanceOperation <em>Distance Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see langageCompilation.DistanceOperation
	 * @generated
	 */
	public Adapter createDistanceOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link langageCompilation.AngleOperation <em>Angle Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see langageCompilation.AngleOperation
	 * @generated
	 */
	public Adapter createAngleOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link langageCompilation.BooleanExpression <em>Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see langageCompilation.BooleanExpression
	 * @generated
	 */
	public Adapter createBooleanExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link langageCompilation.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see langageCompilation.And
	 * @generated
	 */
	public Adapter createAndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link langageCompilation.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see langageCompilation.Or
	 * @generated
	 */
	public Adapter createOrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //LangageCompilationAdapterFactory
