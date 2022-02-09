/**
 */
package langageCompilation.impl;

import langageCompilation.LangageCompilationPackage;
import langageCompilation.TheDouble;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>The Double</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link langageCompilation.impl.TheDoubleImpl#getValue1 <em>Value1</em>}</li>
 *   <li>{@link langageCompilation.impl.TheDoubleImpl#getValue2 <em>Value2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TheDoubleImpl extends ExpressionImpl implements TheDouble {
	/**
	 * The default value of the '{@link #getValue1() <em>Value1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue1()
	 * @generated
	 * @ordered
	 */
	protected static final int VALUE1_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getValue1() <em>Value1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue1()
	 * @generated
	 * @ordered
	 */
	protected int value1 = VALUE1_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue2() <em>Value2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue2()
	 * @generated
	 * @ordered
	 */
	protected static final int VALUE2_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getValue2() <em>Value2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue2()
	 * @generated
	 * @ordered
	 */
	protected int value2 = VALUE2_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TheDoubleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LangageCompilationPackage.Literals.THE_DOUBLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue1() {
		return value1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue1(int newValue1) {
		int oldValue1 = value1;
		value1 = newValue1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LangageCompilationPackage.THE_DOUBLE__VALUE1,
					oldValue1, value1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue2() {
		return value2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue2(int newValue2) {
		int oldValue2 = value2;
		value2 = newValue2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LangageCompilationPackage.THE_DOUBLE__VALUE2,
					oldValue2, value2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case LangageCompilationPackage.THE_DOUBLE__VALUE1:
			return getValue1();
		case LangageCompilationPackage.THE_DOUBLE__VALUE2:
			return getValue2();
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
		case LangageCompilationPackage.THE_DOUBLE__VALUE1:
			setValue1((Integer) newValue);
			return;
		case LangageCompilationPackage.THE_DOUBLE__VALUE2:
			setValue2((Integer) newValue);
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
		case LangageCompilationPackage.THE_DOUBLE__VALUE1:
			setValue1(VALUE1_EDEFAULT);
			return;
		case LangageCompilationPackage.THE_DOUBLE__VALUE2:
			setValue2(VALUE2_EDEFAULT);
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
		case LangageCompilationPackage.THE_DOUBLE__VALUE1:
			return value1 != VALUE1_EDEFAULT;
		case LangageCompilationPackage.THE_DOUBLE__VALUE2:
			return value2 != VALUE2_EDEFAULT;
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
		result.append(" (value1: ");
		result.append(value1);
		result.append(", value2: ");
		result.append(value2);
		result.append(')');
		return result.toString();
	}

} //TheDoubleImpl
