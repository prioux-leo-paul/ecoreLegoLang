/**
 */
package langageCompilation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Break Motor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link langageCompilation.BreakMotor#getEngine <em>Engine</em>}</li>
 * </ul>
 *
 * @see langageCompilation.LangageCompilationPackage#getBreakMotor()
 * @model
 * @generated
 */
public interface BreakMotor extends Expression {
	/**
	 * Returns the value of the '<em><b>Engine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Engine</em>' reference.
	 * @see #setEngine(Engine)
	 * @see langageCompilation.LangageCompilationPackage#getBreakMotor_Engine()
	 * @model required="true"
	 * @generated
	 */
	Engine getEngine();

	/**
	 * Sets the value of the '{@link langageCompilation.BreakMotor#getEngine <em>Engine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Engine</em>' reference.
	 * @see #getEngine()
	 * @generated
	 */
	void setEngine(Engine value);

} // BreakMotor
