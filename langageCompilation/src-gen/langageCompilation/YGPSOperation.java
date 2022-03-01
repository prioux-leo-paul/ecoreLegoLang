/**
 */
package langageCompilation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YGPS Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link langageCompilation.YGPSOperation#getGpssensor <em>Gpssensor</em>}</li>
 * </ul>
 *
 * @see langageCompilation.LangageCompilationPackage#getYGPSOperation()
 * @model
 * @generated
 */
public interface YGPSOperation extends SensorOperation {
	/**
	 * Returns the value of the '<em><b>Gpssensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gpssensor</em>' reference.
	 * @see #setGpssensor(GPSSensor)
	 * @see langageCompilation.LangageCompilationPackage#getYGPSOperation_Gpssensor()
	 * @model required="true"
	 * @generated
	 */
	GPSSensor getGpssensor();

	/**
	 * Sets the value of the '{@link langageCompilation.YGPSOperation#getGpssensor <em>Gpssensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gpssensor</em>' reference.
	 * @see #getGpssensor()
	 * @generated
	 */
	void setGpssensor(GPSSensor value);

} // YGPSOperation
