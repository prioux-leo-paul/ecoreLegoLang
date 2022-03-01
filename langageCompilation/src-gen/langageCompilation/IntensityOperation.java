/**
 */
package langageCompilation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intensity Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link langageCompilation.IntensityOperation#getColorsensor <em>Colorsensor</em>}</li>
 * </ul>
 *
 * @see langageCompilation.LangageCompilationPackage#getIntensityOperation()
 * @model
 * @generated
 */
public interface IntensityOperation extends SensorOperation {
	/**
	 * Returns the value of the '<em><b>Colorsensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colorsensor</em>' reference.
	 * @see #setColorsensor(ColorSensor)
	 * @see langageCompilation.LangageCompilationPackage#getIntensityOperation_Colorsensor()
	 * @model required="true"
	 * @generated
	 */
	ColorSensor getColorsensor();

	/**
	 * Sets the value of the '{@link langageCompilation.IntensityOperation#getColorsensor <em>Colorsensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Colorsensor</em>' reference.
	 * @see #getColorsensor()
	 * @generated
	 */
	void setColorsensor(ColorSensor value);

} // IntensityOperation
