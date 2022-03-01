/**
 */
package langageCompilation.impl;

import langageCompilation.GPSSensor;
import langageCompilation.LangageCompilationPackage;
import langageCompilation.XGPSOperation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XGPS Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link langageCompilation.impl.XGPSOperationImpl#getGpssensor <em>Gpssensor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XGPSOperationImpl extends SensorOperationImpl implements XGPSOperation {
	/**
	 * The cached value of the '{@link #getGpssensor() <em>Gpssensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGpssensor()
	 * @generated
	 * @ordered
	 */
	protected GPSSensor gpssensor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XGPSOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LangageCompilationPackage.Literals.XGPS_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GPSSensor getGpssensor() {
		if (gpssensor != null && gpssensor.eIsProxy()) {
			InternalEObject oldGpssensor = (InternalEObject) gpssensor;
			gpssensor = (GPSSensor) eResolveProxy(oldGpssensor);
			if (gpssensor != oldGpssensor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							LangageCompilationPackage.XGPS_OPERATION__GPSSENSOR, oldGpssensor, gpssensor));
			}
		}
		return gpssensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GPSSensor basicGetGpssensor() {
		return gpssensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGpssensor(GPSSensor newGpssensor) {
		GPSSensor oldGpssensor = gpssensor;
		gpssensor = newGpssensor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LangageCompilationPackage.XGPS_OPERATION__GPSSENSOR,
					oldGpssensor, gpssensor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case LangageCompilationPackage.XGPS_OPERATION__GPSSENSOR:
			if (resolve)
				return getGpssensor();
			return basicGetGpssensor();
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
		case LangageCompilationPackage.XGPS_OPERATION__GPSSENSOR:
			setGpssensor((GPSSensor) newValue);
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
		case LangageCompilationPackage.XGPS_OPERATION__GPSSENSOR:
			setGpssensor((GPSSensor) null);
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
		case LangageCompilationPackage.XGPS_OPERATION__GPSSENSOR:
			return gpssensor != null;
		}
		return super.eIsSet(featureID);
	}

} //XGPSOperationImpl
