/**
 */
package langageCompilation.impl;

import langageCompilation.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LangageCompilationFactoryImpl extends EFactoryImpl implements LangageCompilationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LangageCompilationFactory init() {
		try {
			LangageCompilationFactory theLangageCompilationFactory = (LangageCompilationFactory) EPackage.Registry.INSTANCE
					.getEFactory(LangageCompilationPackage.eNS_URI);
			if (theLangageCompilationFactory != null) {
				return theLangageCompilationFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LangageCompilationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LangageCompilationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case LangageCompilationPackage.PROGRAM:
			return createProgram();
		case LangageCompilationPackage.WHILE_LOOP:
			return createWhileLoop();
		case LangageCompilationPackage.VARIABLE_REF:
			return createVariableRef();
		case LangageCompilationPackage.SUBSTRACTION:
			return createSubstraction();
		case LangageCompilationPackage.GT:
			return createGT();
		case LangageCompilationPackage.ASSIGNEMENT:
			return createAssignement();
		case LangageCompilationPackage.UN_INTEGER:
			return createUnInteger();
		case LangageCompilationPackage.UN_STRING:
			return createUnString();
		case LangageCompilationPackage.LT:
			return createLT();
		case LangageCompilationPackage.EQUAL:
			return createEqual();
		case LangageCompilationPackage.ADDITION:
			return createAddition();
		case LangageCompilationPackage.DIVISION:
			return createDivision();
		case LangageCompilationPackage.MULTIPLICATION:
			return createMultiplication();
		case LangageCompilationPackage.LTOR_EQUAL:
			return createLTorEqual();
		case LangageCompilationPackage.GTOR_EQUAL:
			return createGTorEqual();
		case LangageCompilationPackage.UN_BOOLEAN:
			return createUnBoolean();
		case LangageCompilationPackage.DIFFERENT:
			return createDifferent();
		case LangageCompilationPackage.CONDITION_ETAT:
			return createConditionEtat();
		case LangageCompilationPackage.METHODE_PRINT:
			return createMethodePrint();
		case LangageCompilationPackage.UN_DOUBLE:
			return createUnDouble();
		case LangageCompilationPackage.THE_BOOLEAN:
			return createTheBoolean();
		case LangageCompilationPackage.THE_DOUBLE:
			return createTheDouble();
		case LangageCompilationPackage.THE_INT:
			return createTheInt();
		case LangageCompilationPackage.THE_STRING:
			return createTheString();
		case LangageCompilationPackage.PLUS_EQUAL:
			return createPlusEqual();
		case LangageCompilationPackage.MINUS_EQUAL:
			return createMinusEqual();
		case LangageCompilationPackage.CAR:
			return createCar();
		case LangageCompilationPackage.COLOR_SENSOR:
			return createColorSensor();
		case LangageCompilationPackage.LASER_SENSOR:
			return createLaserSensor();
		case LangageCompilationPackage.WHEEL_ENGINE:
			return createWheelEngine();
		case LangageCompilationPackage.ENGINE_REF:
			return createEngineRef();
		case LangageCompilationPackage.SENSOR_REF:
			return createSensorRef();
		case LangageCompilationPackage.NEW_ECLASS43:
			return createNewEClass43();
		case LangageCompilationPackage.VITESSE_OPERATION:
			return createVitesseOperation();
		case LangageCompilationPackage.COLOR_OPERATION:
			return createColorOperation();
		case LangageCompilationPackage.RANGE_OPERATION:
			return createRangeOperation();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Program createProgram() {
		ProgramImpl program = new ProgramImpl();
		return program;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhileLoop createWhileLoop() {
		WhileLoopImpl whileLoop = new WhileLoopImpl();
		return whileLoop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableRef createVariableRef() {
		VariableRefImpl variableRef = new VariableRefImpl();
		return variableRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Substraction createSubstraction() {
		SubstractionImpl substraction = new SubstractionImpl();
		return substraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GT createGT() {
		GTImpl gt = new GTImpl();
		return gt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assignement createAssignement() {
		AssignementImpl assignement = new AssignementImpl();
		return assignement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnInteger createUnInteger() {
		UnIntegerImpl unInteger = new UnIntegerImpl();
		return unInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnString createUnString() {
		UnStringImpl unString = new UnStringImpl();
		return unString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LT createLT() {
		LTImpl lt = new LTImpl();
		return lt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Equal createEqual() {
		EqualImpl equal = new EqualImpl();
		return equal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Addition createAddition() {
		AdditionImpl addition = new AdditionImpl();
		return addition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Division createDivision() {
		DivisionImpl division = new DivisionImpl();
		return division;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multiplication createMultiplication() {
		MultiplicationImpl multiplication = new MultiplicationImpl();
		return multiplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LTorEqual createLTorEqual() {
		LTorEqualImpl lTorEqual = new LTorEqualImpl();
		return lTorEqual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GTorEqual createGTorEqual() {
		GTorEqualImpl gTorEqual = new GTorEqualImpl();
		return gTorEqual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnBoolean createUnBoolean() {
		UnBooleanImpl unBoolean = new UnBooleanImpl();
		return unBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Different createDifferent() {
		DifferentImpl different = new DifferentImpl();
		return different;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionEtat createConditionEtat() {
		ConditionEtatImpl conditionEtat = new ConditionEtatImpl();
		return conditionEtat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodePrint createMethodePrint() {
		MethodePrintImpl methodePrint = new MethodePrintImpl();
		return methodePrint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnDouble createUnDouble() {
		UnDoubleImpl unDouble = new UnDoubleImpl();
		return unDouble;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TheBoolean createTheBoolean() {
		TheBooleanImpl theBoolean = new TheBooleanImpl();
		return theBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TheDouble createTheDouble() {
		TheDoubleImpl theDouble = new TheDoubleImpl();
		return theDouble;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TheInt createTheInt() {
		TheIntImpl theInt = new TheIntImpl();
		return theInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TheString createTheString() {
		TheStringImpl theString = new TheStringImpl();
		return theString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlusEqual createPlusEqual() {
		PlusEqualImpl plusEqual = new PlusEqualImpl();
		return plusEqual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinusEqual createMinusEqual() {
		MinusEqualImpl minusEqual = new MinusEqualImpl();
		return minusEqual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Car createCar() {
		CarImpl car = new CarImpl();
		return car;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorSensor createColorSensor() {
		ColorSensorImpl colorSensor = new ColorSensorImpl();
		return colorSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LaserSensor createLaserSensor() {
		LaserSensorImpl laserSensor = new LaserSensorImpl();
		return laserSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WheelEngine createWheelEngine() {
		WheelEngineImpl wheelEngine = new WheelEngineImpl();
		return wheelEngine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EngineRef createEngineRef() {
		EngineRefImpl engineRef = new EngineRefImpl();
		return engineRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorRef createSensorRef() {
		SensorRefImpl sensorRef = new SensorRefImpl();
		return sensorRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewEClass43 createNewEClass43() {
		NewEClass43Impl newEClass43 = new NewEClass43Impl();
		return newEClass43;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VitesseOperation createVitesseOperation() {
		VitesseOperationImpl vitesseOperation = new VitesseOperationImpl();
		return vitesseOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorOperation createColorOperation() {
		ColorOperationImpl colorOperation = new ColorOperationImpl();
		return colorOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeOperation createRangeOperation() {
		RangeOperationImpl rangeOperation = new RangeOperationImpl();
		return rangeOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LangageCompilationPackage getLangageCompilationPackage() {
		return (LangageCompilationPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LangageCompilationPackage getPackage() {
		return LangageCompilationPackage.eINSTANCE;
	}

} //LangageCompilationFactoryImpl
