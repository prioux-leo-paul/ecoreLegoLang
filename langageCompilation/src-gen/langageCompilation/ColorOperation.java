/**
 */
package langageCompilation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Color Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link langageCompilation.ColorOperation#getColorsensor <em>Colorsensor</em>}</li>
 * </ul>
 *
 * @see langageCompilation.LangageCompilationPackage#getColorOperation()
 * @model
 * @generated
 */
public interface ColorOperation extends SensorOperation {

	/**
	 * Returns the value of the '<em><b>Colorsensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colorsensor</em>' reference.
	 * @see #setColorsensor(ColorSensor)
	 * @see langageCompilation.LangageCompilationPackage#getColorOperation_Colorsensor()
	 * @model required="true"
	 * @generated
	 */
	ColorSensor getColorsensor();

	/**
	 * Sets the value of the '{@link langageCompilation.ColorOperation#getColorsensor <em>Colorsensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Colorsensor</em>' reference.
	 * @see #getColorsensor()
	 * @generated
	 */
	void setColorsensor(ColorSensor value);
} // ColorOperation
