/**
 */
package langageCompilation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vitesse Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link langageCompilation.VitesseOperation#getWheelengine <em>Wheelengine</em>}</li>
 * </ul>
 *
 * @see langageCompilation.LangageCompilationPackage#getVitesseOperation()
 * @model
 * @generated
 */
public interface VitesseOperation extends EngineOperation {

	/**
	 * Returns the value of the '<em><b>Wheelengine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wheelengine</em>' reference.
	 * @see #setWheelengine(WheelEngine)
	 * @see langageCompilation.LangageCompilationPackage#getVitesseOperation_Wheelengine()
	 * @model required="true"
	 * @generated
	 */
	WheelEngine getWheelengine();

	/**
	 * Sets the value of the '{@link langageCompilation.VitesseOperation#getWheelengine <em>Wheelengine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wheelengine</em>' reference.
	 * @see #getWheelengine()
	 * @generated
	 */
	void setWheelengine(WheelEngine value);
} // VitesseOperation
