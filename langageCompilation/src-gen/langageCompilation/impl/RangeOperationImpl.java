/**
 */
package langageCompilation.impl;

import langageCompilation.LangageCompilationPackage;
import langageCompilation.LaserSensor;
import langageCompilation.RangeOperation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Range Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link langageCompilation.impl.RangeOperationImpl#getLasersensor <em>Lasersensor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RangeOperationImpl extends SensorOperationImpl implements RangeOperation {
	/**
	 * The cached value of the '{@link #getLasersensor() <em>Lasersensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLasersensor()
	 * @generated
	 * @ordered
	 */
	protected LaserSensor lasersensor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RangeOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LangageCompilationPackage.Literals.RANGE_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LaserSensor getLasersensor() {
		if (lasersensor != null && lasersensor.eIsProxy()) {
			InternalEObject oldLasersensor = (InternalEObject) lasersensor;
			lasersensor = (LaserSensor) eResolveProxy(oldLasersensor);
			if (lasersensor != oldLasersensor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							LangageCompilationPackage.RANGE_OPERATION__LASERSENSOR, oldLasersensor, lasersensor));
			}
		}
		return lasersensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LaserSensor basicGetLasersensor() {
		return lasersensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLasersensor(LaserSensor newLasersensor) {
		LaserSensor oldLasersensor = lasersensor;
		lasersensor = newLasersensor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					LangageCompilationPackage.RANGE_OPERATION__LASERSENSOR, oldLasersensor, lasersensor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case LangageCompilationPackage.RANGE_OPERATION__LASERSENSOR:
			if (resolve)
				return getLasersensor();
			return basicGetLasersensor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case LangageCompilationPackage.RANGE_OPERATION__LASERSENSOR:
			setLasersensor((LaserSensor) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case LangageCompilationPackage.RANGE_OPERATION__LASERSENSOR:
			setLasersensor((LaserSensor) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case LangageCompilationPackage.RANGE_OPERATION__LASERSENSOR:
			return lasersensor != null;
		}
		return super.eIsSet(featureID);
	}

} //RangeOperationImpl
