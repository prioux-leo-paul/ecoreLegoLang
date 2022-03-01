/**
 */
package langageCompilation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Distance Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link langageCompilation.DistanceOperation#getUltrasonicsensor <em>Ultrasonicsensor</em>}</li>
 * </ul>
 *
 * @see langageCompilation.LangageCompilationPackage#getDistanceOperation()
 * @model
 * @generated
 */
public interface DistanceOperation extends SensorOperation {
	/**
	 * Returns the value of the '<em><b>Ultrasonicsensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ultrasonicsensor</em>' reference.
	 * @see #setUltrasonicsensor(UltraSonicSensor)
	 * @see langageCompilation.LangageCompilationPackage#getDistanceOperation_Ultrasonicsensor()
	 * @model required="true"
	 * @generated
	 */
	UltraSonicSensor getUltrasonicsensor();

	/**
	 * Sets the value of the '{@link langageCompilation.DistanceOperation#getUltrasonicsensor <em>Ultrasonicsensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ultrasonicsensor</em>' reference.
	 * @see #getUltrasonicsensor()
	 * @generated
	 */
	void setUltrasonicsensor(UltraSonicSensor value);

} // DistanceOperation
