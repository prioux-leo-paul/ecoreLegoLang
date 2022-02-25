/**
 */
package langageCompilation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Car</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link langageCompilation.Car#getEngine <em>Engine</em>}</li>
 *   <li>{@link langageCompilation.Car#getSensor <em>Sensor</em>}</li>
 * </ul>
 *
 * @see langageCompilation.LangageCompilationPackage#getCar()
 * @model
 * @generated
 */
public interface Car extends Statement {
	/**
	 * Returns the value of the '<em><b>Engine</b></em>' containment reference list.
	 * The list contents are of type {@link langageCompilation.Engine}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Engine</em>' containment reference list.
	 * @see langageCompilation.LangageCompilationPackage#getCar_Engine()
	 * @model containment="true" upper="4"
	 * @generated
	 */
	EList<Engine> getEngine();

	/**
	 * Returns the value of the '<em><b>Sensor</b></em>' containment reference list.
	 * The list contents are of type {@link langageCompilation.Sensor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor</em>' containment reference list.
	 * @see langageCompilation.LangageCompilationPackage#getCar_Sensor()
	 * @model containment="true" upper="4"
	 * @generated
	 */
	EList<Sensor> getSensor();

} // Car
