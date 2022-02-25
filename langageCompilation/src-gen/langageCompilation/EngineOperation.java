/**
 */
package langageCompilation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Engine Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link langageCompilation.EngineOperation#getRight <em>Right</em>}</li>
 *   <li>{@link langageCompilation.EngineOperation#getEngine <em>Engine</em>}</li>
 * </ul>
 *
 * @see langageCompilation.LangageCompilationPackage#getEngineOperation()
 * @model abstract="true"
 * @generated
 */
public interface EngineOperation extends Expression {

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(Expression)
	 * @see langageCompilation.LangageCompilationPackage#getEngineOperation_Right()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getRight();

	/**
	 * Sets the value of the '{@link langageCompilation.EngineOperation#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Expression value);

	/**
	 * Returns the value of the '<em><b>Engine</b></em>' reference list.
	 * The list contents are of type {@link langageCompilation.Engine}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Engine</em>' reference list.
	 * @see langageCompilation.LangageCompilationPackage#getEngineOperation_Engine()
	 * @model required="true"
	 * @generated
	 */
	EList<Engine> getEngine();
} // EngineOperation
