/**
 */
package langageCompilation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Methode Print</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link langageCompilation.MethodePrint#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see langageCompilation.LangageCompilationPackage#getMethodePrint()
 * @model
 * @generated
 */
public interface MethodePrint extends Statement {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference list.
	 * The list contents are of type {@link langageCompilation.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference list.
	 * @see langageCompilation.LangageCompilationPackage#getMethodePrint_Expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Expression> getExpression();

} // MethodePrint
