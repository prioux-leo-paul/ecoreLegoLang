/**
 */
package langageCompilation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Position Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link langageCompilation.PositionOperation#getMotorizedarmengine <em>Motorizedarmengine</em>}</li>
 * </ul>
 *
 * @see langageCompilation.LangageCompilationPackage#getPositionOperation()
 * @model
 * @generated
 */
public interface PositionOperation extends EngineOperation {
	/**
	 * Returns the value of the '<em><b>Motorizedarmengine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Motorizedarmengine</em>' reference.
	 * @see #setMotorizedarmengine(MotorizedArmEngine)
	 * @see langageCompilation.LangageCompilationPackage#getPositionOperation_Motorizedarmengine()
	 * @model required="true"
	 * @generated
	 */
	MotorizedArmEngine getMotorizedarmengine();

	/**
	 * Sets the value of the '{@link langageCompilation.PositionOperation#getMotorizedarmengine <em>Motorizedarmengine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Motorizedarmengine</em>' reference.
	 * @see #getMotorizedarmengine()
	 * @generated
	 */
	void setMotorizedarmengine(MotorizedArmEngine value);

} // PositionOperation
