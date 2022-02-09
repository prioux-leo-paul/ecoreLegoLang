/**
 */
package langageCompilation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link langageCompilation.VariableDeclaration#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see langageCompilation.LangageCompilationPackage#getVariableDeclaration()
 * @model
 * @generated
 */
public interface VariableDeclaration extends Statement {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference list.
	 * The list contents are of type {@link langageCompilation.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference list.
	 * @see langageCompilation.LangageCompilationPackage#getVariableDeclaration_Variable()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Variable> getVariable();

} // VariableDeclaration
