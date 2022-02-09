/**
 */
package langageCompilation.impl;

import langageCompilation.LangageCompilationPackage;
import langageCompilation.unBoolean;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>un Boolean</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link langageCompilation.impl.unBooleanImpl#isInitialeValue <em>Initiale Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class unBooleanImpl extends VariableImpl implements unBoolean {
	/**
	 * The default value of the '{@link #isInitialeValue() <em>Initiale Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitialeValue()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INITIALE_VALUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInitialeValue() <em>Initiale Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitialeValue()
	 * @generated
	 * @ordered
	 */
	protected boolean initialeValue = INITIALE_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected unBooleanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LangageCompilationPackage.Literals.UN_BOOLEAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInitialeValue() {
		return initialeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialeValue(boolean newInitialeValue) {
		boolean oldInitialeValue = initialeValue;
		initialeValue = newInitialeValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LangageCompilationPackage.UN_BOOLEAN__INITIALE_VALUE,
					oldInitialeValue, initialeValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case LangageCompilationPackage.UN_BOOLEAN__INITIALE_VALUE:
			return isInitialeValue();
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
		case LangageCompilationPackage.UN_BOOLEAN__INITIALE_VALUE:
			setInitialeValue((Boolean) newValue);
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
		case LangageCompilationPackage.UN_BOOLEAN__INITIALE_VALUE:
			setInitialeValue(INITIALE_VALUE_EDEFAULT);
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
		case LangageCompilationPackage.UN_BOOLEAN__INITIALE_VALUE:
			return initialeValue != INITIALE_VALUE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (initialeValue: ");
		result.append(initialeValue);
		result.append(')');
		return result.toString();
	}

} //unBooleanImpl
