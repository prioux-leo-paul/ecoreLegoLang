/**
 */
package langageCompilation.impl;

import langageCompilation.DistanceOperation;
import langageCompilation.LangageCompilationPackage;
import langageCompilation.UltraSonicSensor;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Distance Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link langageCompilation.impl.DistanceOperationImpl#getUltrasonicsensor <em>Ultrasonicsensor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DistanceOperationImpl extends SensorOperationImpl implements DistanceOperation {
	/**
	 * The cached value of the '{@link #getUltrasonicsensor() <em>Ultrasonicsensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUltrasonicsensor()
	 * @generated
	 * @ordered
	 */
	protected UltraSonicSensor ultrasonicsensor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DistanceOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LangageCompilationPackage.Literals.DISTANCE_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UltraSonicSensor getUltrasonicsensor() {
		if (ultrasonicsensor != null && ultrasonicsensor.eIsProxy()) {
			InternalEObject oldUltrasonicsensor = (InternalEObject) ultrasonicsensor;
			ultrasonicsensor = (UltraSonicSensor) eResolveProxy(oldUltrasonicsensor);
			if (ultrasonicsensor != oldUltrasonicsensor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							LangageCompilationPackage.DISTANCE_OPERATION__ULTRASONICSENSOR, oldUltrasonicsensor,
							ultrasonicsensor));
			}
		}
		return ultrasonicsensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UltraSonicSensor basicGetUltrasonicsensor() {
		return ultrasonicsensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUltrasonicsensor(UltraSonicSensor newUltrasonicsensor) {
		UltraSonicSensor oldUltrasonicsensor = ultrasonicsensor;
		ultrasonicsensor = newUltrasonicsensor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					LangageCompilationPackage.DISTANCE_OPERATION__ULTRASONICSENSOR, oldUltrasonicsensor,
					ultrasonicsensor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case LangageCompilationPackage.DISTANCE_OPERATION__ULTRASONICSENSOR:
			if (resolve)
				return getUltrasonicsensor();
			return basicGetUltrasonicsensor();
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
		case LangageCompilationPackage.DISTANCE_OPERATION__ULTRASONICSENSOR:
			setUltrasonicsensor((UltraSonicSensor) newValue);
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
		case LangageCompilationPackage.DISTANCE_OPERATION__ULTRASONICSENSOR:
			setUltrasonicsensor((UltraSonicSensor) null);
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
		case LangageCompilationPackage.DISTANCE_OPERATION__ULTRASONICSENSOR:
			return ultrasonicsensor != null;
		}
		return super.eIsSet(featureID);
	}

} //DistanceOperationImpl
