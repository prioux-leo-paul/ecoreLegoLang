/**
 */
package langageCompilation.impl;

import langageCompilation.LangageCompilationPackage;
import langageCompilation.MotorizedArmEngine;
import langageCompilation.PositionOperation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Position Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link langageCompilation.impl.PositionOperationImpl#getMotorizedarmengine <em>Motorizedarmengine</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PositionOperationImpl extends EngineOperationImpl implements PositionOperation {
	/**
	 * The cached value of the '{@link #getMotorizedarmengine() <em>Motorizedarmengine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotorizedarmengine()
	 * @generated
	 * @ordered
	 */
	protected MotorizedArmEngine motorizedarmengine;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PositionOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LangageCompilationPackage.Literals.POSITION_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MotorizedArmEngine getMotorizedarmengine() {
		if (motorizedarmengine != null && motorizedarmengine.eIsProxy()) {
			InternalEObject oldMotorizedarmengine = (InternalEObject) motorizedarmengine;
			motorizedarmengine = (MotorizedArmEngine) eResolveProxy(oldMotorizedarmengine);
			if (motorizedarmengine != oldMotorizedarmengine) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							LangageCompilationPackage.POSITION_OPERATION__MOTORIZEDARMENGINE, oldMotorizedarmengine,
							motorizedarmengine));
			}
		}
		return motorizedarmengine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MotorizedArmEngine basicGetMotorizedarmengine() {
		return motorizedarmengine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMotorizedarmengine(MotorizedArmEngine newMotorizedarmengine) {
		MotorizedArmEngine oldMotorizedarmengine = motorizedarmengine;
		motorizedarmengine = newMotorizedarmengine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					LangageCompilationPackage.POSITION_OPERATION__MOTORIZEDARMENGINE, oldMotorizedarmengine,
					motorizedarmengine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case LangageCompilationPackage.POSITION_OPERATION__MOTORIZEDARMENGINE:
			if (resolve)
				return getMotorizedarmengine();
			return basicGetMotorizedarmengine();
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
		case LangageCompilationPackage.POSITION_OPERATION__MOTORIZEDARMENGINE:
			setMotorizedarmengine((MotorizedArmEngine) newValue);
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
		case LangageCompilationPackage.POSITION_OPERATION__MOTORIZEDARMENGINE:
			setMotorizedarmengine((MotorizedArmEngine) null);
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
		case LangageCompilationPackage.POSITION_OPERATION__MOTORIZEDARMENGINE:
			return motorizedarmengine != null;
		}
		return super.eIsSet(featureID);
	}

} //PositionOperationImpl
