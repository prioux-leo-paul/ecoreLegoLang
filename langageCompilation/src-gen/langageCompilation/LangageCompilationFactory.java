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
	 * Returns a new object of class '<em>Un Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Un Integer</em>'.
	 * @generated
	 */
	UnInteger createUnInteger();

	/**
	 * Returns a new object of class '<em>Un String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Un String</em>'.
	 * @generated
	 */
	UnString createUnString();

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
	 * Returns a new object of class '<em>Un Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Un Boolean</em>'.
	 * @generated
	 */
	UnBoolean createUnBoolean();

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
	 * Returns a new object of class '<em>Un Double</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Un Double</em>'.
	 * @generated
	 */
	UnDouble createUnDouble();

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
	 * Returns a new object of class '<em>Car</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Car</em>'.
	 * @generated
	 */
	Car createCar();

	/**
	 * Returns a new object of class '<em>Color Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Color Sensor</em>'.
	 * @generated
	 */
	ColorSensor createColorSensor();

	/**
	 * Returns a new object of class '<em>Laser Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Laser Sensor</em>'.
	 * @generated
	 */
	LaserSensor createLaserSensor();

	/**
	 * Returns a new object of class '<em>Wheel Engine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wheel Engine</em>'.
	 * @generated
	 */
	WheelEngine createWheelEngine();

	/**
	 * Returns a new object of class '<em>New EClass43</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>New EClass43</em>'.
	 * @generated
	 */
	NewEClass43 createNewEClass43();

	/**
	 * Returns a new object of class '<em>Vitesse Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vitesse Operation</em>'.
	 * @generated
	 */
	VitesseOperation createVitesseOperation();

	/**
	 * Returns a new object of class '<em>Color Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Color Operation</em>'.
	 * @generated
	 */
	ColorOperation createColorOperation();

	/**
	 * Returns a new object of class '<em>Range Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Range Operation</em>'.
	 * @generated
	 */
	RangeOperation createRangeOperation();

	/**
	 * Returns a new object of class '<em>Intensity Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intensity Operation</em>'.
	 * @generated
	 */
	IntensityOperation createIntensityOperation();

	/**
	 * Returns a new object of class '<em>Ultra Sonic Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ultra Sonic Sensor</em>'.
	 * @generated
	 */
	UltraSonicSensor createUltraSonicSensor();

	/**
	 * Returns a new object of class '<em>Gyro Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gyro Sensor</em>'.
	 * @generated
	 */
	GyroSensor createGyroSensor();

	/**
	 * Returns a new object of class '<em>GPS Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GPS Sensor</em>'.
	 * @generated
	 */
	GPSSensor createGPSSensor();

	/**
	 * Returns a new object of class '<em>XGPS Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XGPS Operation</em>'.
	 * @generated
	 */
	XGPSOperation createXGPSOperation();

	/**
	 * Returns a new object of class '<em>YGPS Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YGPS Operation</em>'.
	 * @generated
	 */
	YGPSOperation createYGPSOperation();

	/**
	 * Returns a new object of class '<em>Distance Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Distance Operation</em>'.
	 * @generated
	 */
	DistanceOperation createDistanceOperation();

	/**
	 * Returns a new object of class '<em>Angle Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Angle Operation</em>'.
	 * @generated
	 */
	AngleOperation createAngleOperation();

	/**
	 * Returns a new object of class '<em>And</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>And</em>'.
	 * @generated
	 */
	And createAnd();

	/**
	 * Returns a new object of class '<em>Or</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Or</em>'.
	 * @generated
	 */
	Or createOr();

	/**
	 * Returns a new object of class '<em>Motorized Arm Engine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Motorized Arm Engine</em>'.
	 * @generated
	 */
	MotorizedArmEngine createMotorizedArmEngine();

	/**
	 * Returns a new object of class '<em>Position Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Position Operation</em>'.
	 * @generated
	 */
	PositionOperation createPositionOperation();

	/**
	 * Returns a new object of class '<em>Paintball Launcher Engine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Paintball Launcher Engine</em>'.
	 * @generated
	 */
	PaintballLauncherEngine createPaintballLauncherEngine();

	/**
	 * Returns a new object of class '<em>Force Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Force Operation</em>'.
	 * @generated
	 */
	ForceOperation createForceOperation();

	/**
	 * Returns a new object of class '<em>Break Motor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Break Motor</em>'.
	 * @generated
	 */
	BreakMotor createBreakMotor();

	/**
	 * Returns a new object of class '<em>Color Equal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Color Equal</em>'.
	 * @generated
	 */
	ColorEqual createColorEqual();

	/**
	 * Returns a new object of class '<em>Color Not Equal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Color Not Equal</em>'.
	 * @generated
	 */
	ColorNotEqual createColorNotEqual();

	/**
	 * Returns a new object of class '<em>Un Color</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Un Color</em>'.
	 * @generated
	 */
	UnColor createUnColor();

	/**
	 * Returns a new object of class '<em>The Color</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>The Color</em>'.
	 * @generated
	 */
	TheColor createTheColor();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LangageCompilationPackage getLangageCompilationPackage();

} //LangageCompilationFactory
