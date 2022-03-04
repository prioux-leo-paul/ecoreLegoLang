/**
 */
package langageCompilation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Un Color</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link langageCompilation.UnColor#getInitialValue <em>Initial Value</em>}</li>
 * </ul>
 *
 * @see langageCompilation.LangageCompilationPackage#getUnColor()
 * @model
 * @generated
 */
public interface UnColor extends Variable {
	/**
	 * Returns the value of the '<em><b>Initial Value</b></em>' attribute.
	 * The literals are from the enumeration {@link langageCompilation.Colors}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Value</em>' attribute.
	 * @see langageCompilation.Colors
	 * @see #setInitialValue(Colors)
	 * @see langageCompilation.LangageCompilationPackage#getUnColor_InitialValue()
	 * @model
	 * @generated
	 */
	Colors getInitialValue();

	/**
	 * Sets the value of the '{@link langageCompilation.UnColor#getInitialValue <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Value</em>' attribute.
	 * @see langageCompilation.Colors
	 * @see #getInitialValue()
	 * @generated
	 */
	void setInitialValue(Colors value);

} // UnColor
