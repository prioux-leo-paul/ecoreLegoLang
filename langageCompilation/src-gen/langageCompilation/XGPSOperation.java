/**
 */
package langageCompilation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XGPS Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link langageCompilation.XGPSOperation#getGpssensor <em>Gpssensor</em>}</li>
 * </ul>
 *
 * @see langageCompilation.LangageCompilationPackage#getXGPSOperation()
 * @model
 * @generated
 */
public interface XGPSOperation extends SensorOperation {
	/**
	 * Returns the value of the '<em><b>Gpssensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gpssensor</em>' reference.
	 * @see #setGpssensor(GPSSensor)
	 * @see langageCompilation.LangageCompilationPackage#getXGPSOperation_Gpssensor()
	 * @model required="true"
	 * @generated
	 */
	GPSSensor getGpssensor();

	/**
	 * Sets the value of the '{@link langageCompilation.XGPSOperation#getGpssensor <em>Gpssensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gpssensor</em>' reference.
	 * @see #getGpssensor()
	 * @generated
	 */
	void setGpssensor(GPSSensor value);

} // XGPSOperation
