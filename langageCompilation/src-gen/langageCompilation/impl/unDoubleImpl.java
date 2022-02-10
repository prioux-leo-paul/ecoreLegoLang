/**
 */
package langageCompilation.impl;

import langageCompilation.LangageCompilationPackage;
import langageCompilation.UnDouble;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Un Double</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link langageCompilation.impl.UnDoubleImpl#getInitialeValue1 <em>Initiale Value1</em>}</li>
 *   <li>{@link langageCompilation.impl.UnDoubleImpl#getInitialeValue2 <em>Initiale Value2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnDoubleImpl extends VariableImpl implements UnDouble {
	/**
	 * The default value of the '{@link #getInitialeValue1() <em>Initiale Value1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialeValue1()
	 * @generated
	 * @ordered
	 */
	protected static final int INITIALE_VALUE1_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInitialeValue1() <em>Initiale Value1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialeValue1()
	 * @generated
	 * @ordered
	 */
	protected int initialeValue1 = INITIALE_VALUE1_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitialeValue2() <em>Initiale Value2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialeValue2()
	 * @generated
	 * @ordered
	 */
	protected static final int INITIALE_VALUE2_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInitialeValue2() <em>Initiale Value2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialeValue2()
	 * @generated
	 * @ordered
	 */
	protected int initialeValue2 = INITIALE_VALUE2_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnDoubleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LangageCompilationPackage.Literals.UN_DOUBLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInitialeValue1() {
		return initialeValue1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialeValue1(int newInitialeValue1) {
		int oldInitialeValue1 = initialeValue1;
		initialeValue1 = newInitialeValue1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LangageCompilationPackage.UN_DOUBLE__INITIALE_VALUE1,
					oldInitialeValue1, initialeValue1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInitialeValue2() {
		return initialeValue2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialeValue2(int newInitialeValue2) {
		int oldInitialeValue2 = initialeValue2;
		initialeValue2 = newInitialeValue2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LangageCompilationPackage.UN_DOUBLE__INITIALE_VALUE2,
					oldInitialeValue2, initialeValue2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case LangageCompilationPackage.UN_DOUBLE__INITIALE_VALUE1:
			return getInitialeValue1();
		case LangageCompilationPackage.UN_DOUBLE__INITIALE_VALUE2:
			return getInitialeValue2();
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
		case LangageCompilationPackage.UN_DOUBLE__INITIALE_VALUE1:
			setInitialeValue1((Integer) newValue);
			return;
		case LangageCompilationPackage.UN_DOUBLE__INITIALE_VALUE2:
			setInitialeValue2((Integer) newValue);
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
		case LangageCompilationPackage.UN_DOUBLE__INITIALE_VALUE1:
			setInitialeValue1(INITIALE_VALUE1_EDEFAULT);
			return;
		case LangageCompilationPackage.UN_DOUBLE__INITIALE_VALUE2:
			setInitialeValue2(INITIALE_VALUE2_EDEFAULT);
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
		case LangageCompilationPackage.UN_DOUBLE__INITIALE_VALUE1:
			return initialeValue1 != INITIALE_VALUE1_EDEFAULT;
		case LangageCompilationPackage.UN_DOUBLE__INITIALE_VALUE2:
			return initialeValue2 != INITIALE_VALUE2_EDEFAULT;
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
		result.append(" (initialeValue1: ");
		result.append(initialeValue1);
		result.append(", initialeValue2: ");
		result.append(initialeValue2);
		result.append(')');
		return result.toString();
	}

} //UnDoubleImpl
