/**
 */
package langageCompilation.impl;

import langageCompilation.ForceOperation;
import langageCompilation.LangageCompilationPackage;
import langageCompilation.PaintballLauncherEngine;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Force Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link langageCompilation.impl.ForceOperationImpl#getPaintballlauncherengine <em>Paintballlauncherengine</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForceOperationImpl extends EngineOperationImpl implements ForceOperation {
	/**
	 * The cached value of the '{@link #getPaintballlauncherengine() <em>Paintballlauncherengine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaintballlauncherengine()
	 * @generated
	 * @ordered
	 */
	protected PaintballLauncherEngine paintballlauncherengine;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForceOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LangageCompilationPackage.Literals.FORCE_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaintballLauncherEngine getPaintballlauncherengine() {
		if (paintballlauncherengine != null && paintballlauncherengine.eIsProxy()) {
			InternalEObject oldPaintballlauncherengine = (InternalEObject) paintballlauncherengine;
			paintballlauncherengine = (PaintballLauncherEngine) eResolveProxy(oldPaintballlauncherengine);
			if (paintballlauncherengine != oldPaintballlauncherengine) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							LangageCompilationPackage.FORCE_OPERATION__PAINTBALLLAUNCHERENGINE,
							oldPaintballlauncherengine, paintballlauncherengine));
			}
		}
		return paintballlauncherengine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaintballLauncherEngine basicGetPaintballlauncherengine() {
		return paintballlauncherengine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaintballlauncherengine(PaintballLauncherEngine newPaintballlauncherengine) {
		PaintballLauncherEngine oldPaintballlauncherengine = paintballlauncherengine;
		paintballlauncherengine = newPaintballlauncherengine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					LangageCompilationPackage.FORCE_OPERATION__PAINTBALLLAUNCHERENGINE, oldPaintballlauncherengine,
					paintballlauncherengine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case LangageCompilationPackage.FORCE_OPERATION__PAINTBALLLAUNCHERENGINE:
			if (resolve)
				return getPaintballlauncherengine();
			return basicGetPaintballlauncherengine();
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
		case LangageCompilationPackage.FORCE_OPERATION__PAINTBALLLAUNCHERENGINE:
			setPaintballlauncherengine((PaintballLauncherEngine) newValue);
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
		case LangageCompilationPackage.FORCE_OPERATION__PAINTBALLLAUNCHERENGINE:
			setPaintballlauncherengine((PaintballLauncherEngine) null);
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
		case LangageCompilationPackage.FORCE_OPERATION__PAINTBALLLAUNCHERENGINE:
			return paintballlauncherengine != null;
		}
		return super.eIsSet(featureID);
	}

} //ForceOperationImpl
