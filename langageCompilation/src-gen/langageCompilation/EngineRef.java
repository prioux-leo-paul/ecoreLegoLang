/**
 */
package langageCompilation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Engine Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link langageCompilation.EngineRef#getEngine <em>Engine</em>}</li>
 * </ul>
 *
 * @see langageCompilation.LangageCompilationPackage#getEngineRef()
 * @model
 * @generated
 */
public interface EngineRef extends Expression {
	/**
	 * Returns the value of the '<em><b>Engine</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Engine</em>' containment reference.
	 * @see #setEngine(Engine)
	 * @see langageCompilation.LangageCompilationPackage#getEngineRef_Engine()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Engine getEngine();

	/**
	 * Sets the value of the '{@link langageCompilation.EngineRef#getEngine <em>Engine</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Engine</em>' containment reference.
	 * @see #getEngine()
	 * @generated
	 */
	void setEngine(Engine value);

} // EngineRef
