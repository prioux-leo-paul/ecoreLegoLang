/**
 */
package langageCompilation.impl;

import langageCompilation.BreakMotor;
import langageCompilation.Engine;
import langageCompilation.LangageCompilationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Break Motor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link langageCompilation.impl.BreakMotorImpl#getEngine <em>Engine</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BreakMotorImpl extends ExpressionImpl implements BreakMotor {
	/**
	 * The cached value of the '{@link #getEngine() <em>Engine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngine()
	 * @generated
	 * @ordered
	 */
	protected Engine engine;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BreakMotorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LangageCompilationPackage.Literals.BREAK_MOTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Engine getEngine() {
		if (engine != null && engine.eIsProxy()) {
			InternalEObject oldEngine = (InternalEObject) engine;
			engine = (Engine) eResolveProxy(oldEngine);
			if (engine != oldEngine) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							LangageCompilationPackage.BREAK_MOTOR__ENGINE, oldEngine, engine));
			}
		}
		return engine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Engine basicGetEngine() {
		return engine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEngine(Engine newEngine) {
		Engine oldEngine = engine;
		engine = newEngine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LangageCompilationPackage.BREAK_MOTOR__ENGINE,
					oldEngine, engine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case LangageCompilationPackage.BREAK_MOTOR__ENGINE:
			if (resolve)
				return getEngine();
			return basicGetEngine();
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
		case LangageCompilationPackage.BREAK_MOTOR__ENGINE:
			setEngine((Engine) newValue);
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
		case LangageCompilationPackage.BREAK_MOTOR__ENGINE:
			setEngine((Engine) null);
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
		case LangageCompilationPackage.BREAK_MOTOR__ENGINE:
			return engine != null;
		}
		return super.eIsSet(featureID);
	}

} //BreakMotorImpl
