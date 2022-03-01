/**
 */
package langageCompilation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Color Sensor Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link langageCompilation.ColorSensorRef#getColorsensor <em>Colorsensor</em>}</li>
 * </ul>
 *
 * @see langageCompilation.LangageCompilationPackage#getColorSensorRef()
 * @model
 * @generated
 */
public interface ColorSensorRef extends Expression {
	/**
	 * Returns the value of the '<em><b>Colorsensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colorsensor</em>' reference.
	 * @see #setColorsensor(ColorSensor)
	 * @see langageCompilation.LangageCompilationPackage#getColorSensorRef_Colorsensor()
	 * @model required="true"
	 * @generated
	 */
	ColorSensor getColorsensor();

	/**
	 * Sets the value of the '{@link langageCompilation.ColorSensorRef#getColorsensor <em>Colorsensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Colorsensor</em>' reference.
	 * @see #getColorsensor()
	 * @generated
	 */
	void setColorsensor(ColorSensor value);

} // ColorSensorRef
