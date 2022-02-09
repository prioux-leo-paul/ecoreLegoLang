/**
 */
package langageCompilation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EFELSE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link langageCompilation.EFELSE#getElseStatement <em>Else Statement</em>}</li>
 * </ul>
 *
 * @see langageCompilation.LangageCompilationPackage#getEFELSE()
 * @model
 * @generated
 */
public interface EFELSE extends ConditionEtat {
	/**
	 * Returns the value of the '<em><b>Else Statement</b></em>' containment reference list.
	 * The list contents are of type {@link langageCompilation.Statement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Statement</em>' containment reference list.
	 * @see langageCompilation.LangageCompilationPackage#getEFELSE_ElseStatement()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getElseStatement();

} // EFELSE
