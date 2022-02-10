/**
 */
package langageCompilation.provider;

import java.util.Collection;
import java.util.List;

import langageCompilation.ConditionEtat;
import langageCompilation.LangageCompilationFactory;
import langageCompilation.LangageCompilationPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link langageCompilation.ConditionEtat} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConditionEtatItemProvider extends StatementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionEtatItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(LangageCompilationPackage.Literals.CONDITION_ETAT__THEN);
			childrenFeatures.add(LangageCompilationPackage.Literals.CONDITION_ETAT__ELSE);
			childrenFeatures.add(LangageCompilationPackage.Literals.CONDITION_ETAT__CONDITION);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ConditionEtat) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_ConditionEtat_type")
				: getString("_UI_ConditionEtat_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ConditionEtat.class)) {
		case LangageCompilationPackage.CONDITION_ETAT__THEN:
		case LangageCompilationPackage.CONDITION_ETAT__ELSE:
		case LangageCompilationPackage.CONDITION_ETAT__CONDITION:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.CONDITION_ETAT__THEN,
				LangageCompilationFactory.eINSTANCE.createWhileLoop()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.CONDITION_ETAT__THEN,
				LangageCompilationFactory.eINSTANCE.createVariableRef()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.CONDITION_ETAT__THEN,
				LangageCompilationFactory.eINSTANCE.createSubstraction()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.CONDITION_ETAT__THEN,
				LangageCompilationFactory.eINSTANCE.createGT()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.CONDITION_ETAT__THEN,
				LangageCompilationFactory.eINSTANCE.createAssignement()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.CONDITION_ETAT__THEN,
				LangageCompilationFactory.eINSTANCE.createUnInteger()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.CONDITION_ETAT__THEN,
				LangageCompilationFactory.eINSTANCE.createUnString()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.CONDITION_ETAT__THEN,
				LangageCompilationFactory.eINSTANCE.createLT()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.CONDITION_ETAT__THEN,
				LangageCompilationFactory.eINSTANCE.createEqual()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.CONDITION_ETAT__THEN,
				LangageCompilationFactory.eINSTANCE.createAddition()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.CONDITION_ETAT__THEN,
				LangageCompilationFactory.eINSTANCE.createDivision()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.CONDITION_ETAT__THEN,
				LangageCompilationFactory.eINSTANCE.createMultiplication()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.CONDITION_ETAT__THEN,
				LangageCompilationFactory.eINSTANCE.createLTorEqual()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.CONDITION_ETAT__THEN,
				LangageCompilationFactory.eINSTANCE.createGTorEqual()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.CONDITION_ETAT__THEN,
				LangageCompilationFactory.eINSTANCE.createUnBoolean()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.CONDITION_ETAT__THEN,
				LangageCompilationFactory.eINSTANCE.createDifferent()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.CONDITION_ETAT__THEN,
				LangageCompilationFactory.eINSTANCE.createConditionEtat()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.CONDITION_ETAT__THEN,
				LangageCompilationFactory.eINSTANCE.createMethodePrint()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.CONDITION_ETAT__THEN,
				LangageCompilationFactory.eINSTANCE.createUnDouble()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.CONDITION_ETAT__THEN,
				LangageCompilationFactory.eINSTANCE.createTheBoolean()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.CONDITION_ETAT__THEN,
				LangageCompilationFactory.eINSTANCE.createTheDouble()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.CONDITION_ETAT__THEN,
				LangageCompilationFactory.eINSTANCE.createTheInt()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.CONDITION_ETAT__THEN,
				LangageCompilationFactory.eINSTANCE.createTheString()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.CONDITION_ETAT__THEN,
				LangageCompilationFactory.eINSTANCE.createPlusEqual()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.CONDITION_ETAT__THEN,
				LangageCompilationFactory.eINSTANCE.createMinusEqual()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.CONDITION_ETAT__ELSE,
				LangageCompilationFactory.eINSTANCE.createWhileLoop()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.CONDITION_ETAT__ELSE,
				LangageCompilationFactory.eINSTANCE.createVariableRef()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.CONDITION_ETAT__ELSE,
				LangageCompilationFactory.eINSTANCE.createSubstraction()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.CONDITION_ETAT__ELSE,
				LangageCompilationFactory.eINSTANCE.createGT()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.CONDITION_ETAT__ELSE,
				LangageCompilationFactory.eINSTANCE.createAssignement()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.CONDITION_ETAT__ELSE,
				LangageCompilationFactory.eINSTANCE.createUnInteger()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.CONDITION_ETAT__ELSE,
				LangageCompilationFactory.eINSTANCE.createUnString()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.CONDITION_ETAT__ELSE,
				LangageCompilationFactory.eINSTANCE.createLT()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.CONDITION_ETAT__ELSE,
				LangageCompilationFactory.eINSTANCE.createEqual()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.CONDITION_ETAT__ELSE,
				LangageCompilationFactory.eINSTANCE.createAddition()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.CONDITION_ETAT__ELSE,
				LangageCompilationFactory.eINSTANCE.createDivision()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.CONDITION_ETAT__ELSE,
				LangageCompilationFactory.eINSTANCE.createMultiplication()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.CONDITION_ETAT__ELSE,
				LangageCompilationFactory.eINSTANCE.createLTorEqual()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.CONDITION_ETAT__ELSE,
				LangageCompilationFactory.eINSTANCE.createGTorEqual()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.CONDITION_ETAT__ELSE,
				LangageCompilationFactory.eINSTANCE.createUnBoolean()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.CONDITION_ETAT__ELSE,
				LangageCompilationFactory.eINSTANCE.createDifferent()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.CONDITION_ETAT__ELSE,
				LangageCompilationFactory.eINSTANCE.createConditionEtat()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.CONDITION_ETAT__ELSE,
				LangageCompilationFactory.eINSTANCE.createMethodePrint()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.CONDITION_ETAT__ELSE,
				LangageCompilationFactory.eINSTANCE.createUnDouble()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.CONDITION_ETAT__ELSE,
				LangageCompilationFactory.eINSTANCE.createTheBoolean()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.CONDITION_ETAT__ELSE,
				LangageCompilationFactory.eINSTANCE.createTheDouble()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.CONDITION_ETAT__ELSE,
				LangageCompilationFactory.eINSTANCE.createTheInt()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.CONDITION_ETAT__ELSE,
				LangageCompilationFactory.eINSTANCE.createTheString()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.CONDITION_ETAT__ELSE,
				LangageCompilationFactory.eINSTANCE.createPlusEqual()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.CONDITION_ETAT__ELSE,
				LangageCompilationFactory.eINSTANCE.createMinusEqual()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.CONDITION_ETAT__CONDITION,
				LangageCompilationFactory.eINSTANCE.createGT()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.CONDITION_ETAT__CONDITION,
				LangageCompilationFactory.eINSTANCE.createLT()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.CONDITION_ETAT__CONDITION,
				LangageCompilationFactory.eINSTANCE.createEqual()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.CONDITION_ETAT__CONDITION,
				LangageCompilationFactory.eINSTANCE.createLTorEqual()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.CONDITION_ETAT__CONDITION,
				LangageCompilationFactory.eINSTANCE.createGTorEqual()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.CONDITION_ETAT__CONDITION,
				LangageCompilationFactory.eINSTANCE.createDifferent()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == LangageCompilationPackage.Literals.CONDITION_ETAT__THEN
				|| childFeature == LangageCompilationPackage.Literals.CONDITION_ETAT__ELSE
				|| childFeature == LangageCompilationPackage.Literals.CONDITION_ETAT__CONDITION;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
