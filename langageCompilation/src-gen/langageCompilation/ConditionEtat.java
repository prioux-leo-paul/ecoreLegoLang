/**
 */
package langageCompilation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition Etat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link langageCompilation.ConditionEtat#getThen <em>Then</em>}</li>
 *   <li>{@link langageCompilation.ConditionEtat#getElse <em>Else</em>}</li>
 *   <li>{@link langageCompilation.ConditionEtat#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see langageCompilation.LangageCompilationPackage#getConditionEtat()
 * @model
 * @generated
 */
public interface ConditionEtat extends Statement {
	/**
	 * Returns the value of the '<em><b>Then</b></em>' containment reference list.
	 * The list contents are of type {@link langageCompilation.Statement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then</em>' containment reference list.
	 * @see langageCompilation.LangageCompilationPackage#getConditionEtat_Then()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Statement> getThen();

	/**
	 * Returns the value of the '<em><b>Else</b></em>' containment reference list.
	 * The list contents are of type {@link langageCompilation.Statement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else</em>' containment reference list.
	 * @see langageCompilation.LangageCompilationPackage#getConditionEtat_Else()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getElse();

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference list.
	 * The list contents are of type {@link langageCompilation.Comparaison}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference list.
	 * @see langageCompilation.LangageCompilationPackage#getConditionEtat_Condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Comparaison> getCondition();

} // ConditionEtat
