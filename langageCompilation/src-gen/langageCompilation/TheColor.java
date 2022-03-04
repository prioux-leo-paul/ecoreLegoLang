/**
 */
package langageCompilation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>The Color</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link langageCompilation.TheColor#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see langageCompilation.LangageCompilationPackage#getTheColor()
 * @model
 * @generated
 */
public interface TheColor extends Expression {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link langageCompilation.Colors}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see langageCompilation.Colors
	 * @see #setValue(Colors)
	 * @see langageCompilation.LangageCompilationPackage#getTheColor_Value()
	 * @model
	 * @generated
	 */
	Colors getValue();

	/**
	 * Sets the value of the '{@link langageCompilation.TheColor#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see langageCompilation.Colors
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Colors value);

} // TheColor
