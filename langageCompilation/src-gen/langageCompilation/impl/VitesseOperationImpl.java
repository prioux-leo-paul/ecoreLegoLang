/**
 */
package langageCompilation.impl;

import langageCompilation.LangageCompilationPackage;
import langageCompilation.VitesseOperation;
import langageCompilation.WheelEngine;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vitesse Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link langageCompilation.impl.VitesseOperationImpl#getWheelengine <em>Wheelengine</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VitesseOperationImpl extends EngineOperationImpl implements VitesseOperation {
	/**
	 * The cached value of the '{@link #getWheelengine() <em>Wheelengine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWheelengine()
	 * @generated
	 * @ordered
	 */
	protected WheelEngine wheelengine;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VitesseOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LangageCompilationPackage.Literals.VITESSE_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WheelEngine getWheelengine() {
		if (wheelengine != null && wheelengine.eIsProxy()) {
			InternalEObject oldWheelengine = (InternalEObject) wheelengine;
			wheelengine = (WheelEngine) eResolveProxy(oldWheelengine);
			if (wheelengine != oldWheelengine) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							LangageCompilationPackage.VITESSE_OPERATION__WHEELENGINE, oldWheelengine, wheelengine));
			}
		}
		return wheelengine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WheelEngine basicGetWheelengine() {
		return wheelengine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWheelengine(WheelEngine newWheelengine) {
		WheelEngine oldWheelengine = wheelengine;
		wheelengine = newWheelengine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					LangageCompilationPackage.VITESSE_OPERATION__WHEELENGINE, oldWheelengine, wheelengine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case LangageCompilationPackage.VITESSE_OPERATION__WHEELENGINE:
			if (resolve)
				return getWheelengine();
			return basicGetWheelengine();
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
		case LangageCompilationPackage.VITESSE_OPERATION__WHEELENGINE:
			setWheelengine((WheelEngine) newValue);
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
		case LangageCompilationPackage.VITESSE_OPERATION__WHEELENGINE:
			setWheelengine((WheelEngine) null);
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
		case LangageCompilationPackage.VITESSE_OPERATION__WHEELENGINE:
			return wheelengine != null;
		}
		return super.eIsSet(featureID);
	}

} //VitesseOperationImpl
