/**
 */
package langageCompilation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inensity Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link langageCompilation.InensityOperation#getColorsensor <em>Colorsensor</em>}</li>
 * </ul>
 *
 * @see langageCompilation.LangageCompilationPackage#getInensityOperation()
 * @model
 * @generated
 */
public interface InensityOperation extends SensorOperation {
	/**
	 * Returns the value of the '<em><b>Colorsensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colorsensor</em>' reference.
	 * @see #setColorsensor(ColorSensor)
	 * @see langageCompilation.LangageCompilationPackage#getInensityOperation_Colorsensor()
	 * @model required="true"
	 * @generated
	 */
	ColorSensor getColorsensor();

	/**
	 * Sets the value of the '{@link langageCompilation.InensityOperation#getColorsensor <em>Colorsensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Colorsensor</em>' reference.
	 * @see #getColorsensor()
	 * @generated
	 */
	void setColorsensor(ColorSensor value);

} // InensityOperation
