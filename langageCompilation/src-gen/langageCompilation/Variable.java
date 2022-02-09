/**
 */
package langageCompilation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link langageCompilation.Variable#isIsConst <em>Is Const</em>}</li>
 * </ul>
 *
 * @see langageCompilation.LangageCompilationPackage#getVariable()
 * @model abstract="true"
 * @generated
 */
public interface Variable extends Statement {
	/**
	 * Returns the value of the '<em><b>Is Const</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Const</em>' attribute.
	 * @see #setIsConst(boolean)
	 * @see langageCompilation.LangageCompilationPackage#getVariable_IsConst()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsConst();

	/**
	 * Sets the value of the '{@link langageCompilation.Variable#isIsConst <em>Is Const</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Const</em>' attribute.
	 * @see #isIsConst()
	 * @generated
	 */
	void setIsConst(boolean value);

} // Variable
