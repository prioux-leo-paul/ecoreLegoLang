/**
 */
package langageCompilation.impl;

import langageCompilation.AngleOperation;
import langageCompilation.GyroSensor;
import langageCompilation.LangageCompilationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Angle Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link langageCompilation.impl.AngleOperationImpl#getGyrosensor <em>Gyrosensor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AngleOperationImpl extends SensorOperationImpl implements AngleOperation {
	/**
	 * The cached value of the '{@link #getGyrosensor() <em>Gyrosensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGyrosensor()
	 * @generated
	 * @ordered
	 */
	protected GyroSensor gyrosensor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AngleOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LangageCompilationPackage.Literals.ANGLE_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GyroSensor getGyrosensor() {
		if (gyrosensor != null && gyrosensor.eIsProxy()) {
			InternalEObject oldGyrosensor = (InternalEObject) gyrosensor;
			gyrosensor = (GyroSensor) eResolveProxy(oldGyrosensor);
			if (gyrosensor != oldGyrosensor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							LangageCompilationPackage.ANGLE_OPERATION__GYROSENSOR, oldGyrosensor, gyrosensor));
			}
		}
		return gyrosensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GyroSensor basicGetGyrosensor() {
		return gyrosensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGyrosensor(GyroSensor newGyrosensor) {
		GyroSensor oldGyrosensor = gyrosensor;
		gyrosensor = newGyrosensor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LangageCompilationPackage.ANGLE_OPERATION__GYROSENSOR,
					oldGyrosensor, gyrosensor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case LangageCompilationPackage.ANGLE_OPERATION__GYROSENSOR:
			if (resolve)
				return getGyrosensor();
			return basicGetGyrosensor();
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
		case LangageCompilationPackage.ANGLE_OPERATION__GYROSENSOR:
			setGyrosensor((GyroSensor) newValue);
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
		case LangageCompilationPackage.ANGLE_OPERATION__GYROSENSOR:
			setGyrosensor((GyroSensor) null);
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
		case LangageCompilationPackage.ANGLE_OPERATION__GYROSENSOR:
			return gyrosensor != null;
		}
		return super.eIsSet(featureID);
	}

} //AngleOperationImpl
