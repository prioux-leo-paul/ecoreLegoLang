/**
 */
package langageCompilation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Angle Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link langageCompilation.AngleOperation#getGyrosensor <em>Gyrosensor</em>}</li>
 * </ul>
 *
 * @see langageCompilation.LangageCompilationPackage#getAngleOperation()
 * @model
 * @generated
 */
public interface AngleOperation extends SensorOperation {
	/**
	 * Returns the value of the '<em><b>Gyrosensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gyrosensor</em>' reference.
	 * @see #setGyrosensor(GyroSensor)
	 * @see langageCompilation.LangageCompilationPackage#getAngleOperation_Gyrosensor()
	 * @model required="true"
	 * @generated
	 */
	GyroSensor getGyrosensor();

	/**
	 * Sets the value of the '{@link langageCompilation.AngleOperation#getGyrosensor <em>Gyrosensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gyrosensor</em>' reference.
	 * @see #getGyrosensor()
	 * @generated
	 */
	void setGyrosensor(GyroSensor value);

} // AngleOperation
