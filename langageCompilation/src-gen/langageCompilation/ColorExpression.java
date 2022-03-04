/**
 */
package langageCompilation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Color Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link langageCompilation.ColorExpression#getLeft <em>Left</em>}</li>
 *   <li>{@link langageCompilation.ColorExpression#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see langageCompilation.LangageCompilationPackage#getColorExpression()
 * @model abstract="true"
 * @generated
 */
public interface ColorExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(Expression)
	 * @see langageCompilation.LangageCompilationPackage#getColorExpression_Left()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getLeft();

	/**
	 * Sets the value of the '{@link langageCompilation.ColorExpression#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Expression value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(TheColor)
	 * @see langageCompilation.LangageCompilationPackage#getColorExpression_Right()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TheColor getRight();

	/**
	 * Sets the value of the '{@link langageCompilation.ColorExpression#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(TheColor value);

} // ColorExpression
