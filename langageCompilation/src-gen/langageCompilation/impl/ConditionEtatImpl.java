/**
 */
package langageCompilation.impl;

import java.util.Collection;

import langageCompilation.BooleanExpression;
import langageCompilation.ConditionEtat;
import langageCompilation.LangageCompilationPackage;
import langageCompilation.Statement;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition Etat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link langageCompilation.impl.ConditionEtatImpl#getThen <em>Then</em>}</li>
 *   <li>{@link langageCompilation.impl.ConditionEtatImpl#getElse <em>Else</em>}</li>
 *   <li>{@link langageCompilation.impl.ConditionEtatImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionEtatImpl extends StatementImpl implements ConditionEtat {
	/**
	 * The cached value of the '{@link #getThen() <em>Then</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThen()
	 * @generated
	 * @ordered
	 */
	protected EList<Statement> then;

	/**
	 * The cached value of the '{@link #getElse() <em>Else</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElse()
	 * @generated
	 * @ordered
	 */
	protected EList<Statement> else_;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected BooleanExpression condition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionEtatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LangageCompilationPackage.Literals.CONDITION_ETAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Statement> getThen() {
		if (then == null) {
			then = new EObjectContainmentEList<Statement>(Statement.class, this,
					LangageCompilationPackage.CONDITION_ETAT__THEN);
		}
		return then;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Statement> getElse() {
		if (else_ == null) {
			else_ = new EObjectContainmentEList<Statement>(Statement.class, this,
					LangageCompilationPackage.CONDITION_ETAT__ELSE);
		}
		return else_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanExpression getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(BooleanExpression newCondition, NotificationChain msgs) {
		BooleanExpression oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					LangageCompilationPackage.CONDITION_ETAT__CONDITION, oldCondition, newCondition);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(BooleanExpression newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject) condition).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - LangageCompilationPackage.CONDITION_ETAT__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject) newCondition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - LangageCompilationPackage.CONDITION_ETAT__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LangageCompilationPackage.CONDITION_ETAT__CONDITION,
					newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case LangageCompilationPackage.CONDITION_ETAT__THEN:
			return ((InternalEList<?>) getThen()).basicRemove(otherEnd, msgs);
		case LangageCompilationPackage.CONDITION_ETAT__ELSE:
			return ((InternalEList<?>) getElse()).basicRemove(otherEnd, msgs);
		case LangageCompilationPackage.CONDITION_ETAT__CONDITION:
			return basicSetCondition(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case LangageCompilationPackage.CONDITION_ETAT__THEN:
			return getThen();
		case LangageCompilationPackage.CONDITION_ETAT__ELSE:
			return getElse();
		case LangageCompilationPackage.CONDITION_ETAT__CONDITION:
			return getCondition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case LangageCompilationPackage.CONDITION_ETAT__THEN:
			getThen().clear();
			getThen().addAll((Collection<? extends Statement>) newValue);
			return;
		case LangageCompilationPackage.CONDITION_ETAT__ELSE:
			getElse().clear();
			getElse().addAll((Collection<? extends Statement>) newValue);
			return;
		case LangageCompilationPackage.CONDITION_ETAT__CONDITION:
			setCondition((BooleanExpression) newValue);
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
		case LangageCompilationPackage.CONDITION_ETAT__THEN:
			getThen().clear();
			return;
		case LangageCompilationPackage.CONDITION_ETAT__ELSE:
			getElse().clear();
			return;
		case LangageCompilationPackage.CONDITION_ETAT__CONDITION:
			setCondition((BooleanExpression) null);
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
		case LangageCompilationPackage.CONDITION_ETAT__THEN:
			return then != null && !then.isEmpty();
		case LangageCompilationPackage.CONDITION_ETAT__ELSE:
			return else_ != null && !else_.isEmpty();
		case LangageCompilationPackage.CONDITION_ETAT__CONDITION:
			return condition != null;
		}
		return super.eIsSet(featureID);
	}

} //ConditionEtatImpl
