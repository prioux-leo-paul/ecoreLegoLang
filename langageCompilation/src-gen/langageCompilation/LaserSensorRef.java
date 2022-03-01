/**
 */
package langageCompilation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Laser Sensor Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link langageCompilation.LaserSensorRef#getLasersensor <em>Lasersensor</em>}</li>
 * </ul>
 *
 * @see langageCompilation.LangageCompilationPackage#getLaserSensorRef()
 * @model
 * @generated
 */
public interface LaserSensorRef extends Expression {
	/**
	 * Returns the value of the '<em><b>Lasersensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lasersensor</em>' reference.
	 * @see #setLasersensor(LaserSensor)
	 * @see langageCompilation.LangageCompilationPackage#getLaserSensorRef_Lasersensor()
	 * @model required="true"
	 * @generated
	 */
	LaserSensor getLasersensor();

	/**
	 * Sets the value of the '{@link langageCompilation.LaserSensorRef#getLasersensor <em>Lasersensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lasersensor</em>' reference.
	 * @see #getLasersensor()
	 * @generated
	 */
	void setLasersensor(LaserSensor value);

} // LaserSensorRef
