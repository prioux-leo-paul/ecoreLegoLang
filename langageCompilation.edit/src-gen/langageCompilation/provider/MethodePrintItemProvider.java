/**
 */
package langageCompilation.provider;

import java.util.Collection;
import java.util.List;

import langageCompilation.LangageCompilationFactory;
import langageCompilation.LangageCompilationPackage;
import langageCompilation.MethodePrint;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link langageCompilation.MethodePrint} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MethodePrintItemProvider extends StatementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodePrintItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(LangageCompilationPackage.Literals.METHODE_PRINT__EXPRESSION);
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
	 * This returns MethodePrint.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MethodePrint"));
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
		String label = ((MethodePrint) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_MethodePrint_type")
				: getString("_UI_MethodePrint_type") + " " + label;
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

		switch (notification.getFeatureID(MethodePrint.class)) {
		case LangageCompilationPackage.METHODE_PRINT__EXPRESSION:
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

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.METHODE_PRINT__EXPRESSION,
				LangageCompilationFactory.eINSTANCE.createVariableRef()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.METHODE_PRINT__EXPRESSION,
				LangageCompilationFactory.eINSTANCE.createSubstraction()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.METHODE_PRINT__EXPRESSION,
				LangageCompilationFactory.eINSTANCE.createGT()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.METHODE_PRINT__EXPRESSION,
				LangageCompilationFactory.eINSTANCE.createAssignement()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.METHODE_PRINT__EXPRESSION,
				LangageCompilationFactory.eINSTANCE.createLT()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.METHODE_PRINT__EXPRESSION,
				LangageCompilationFactory.eINSTANCE.createEqual()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.METHODE_PRINT__EXPRESSION,
				LangageCompilationFactory.eINSTANCE.createAddition()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.METHODE_PRINT__EXPRESSION,
				LangageCompilationFactory.eINSTANCE.createDivision()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.METHODE_PRINT__EXPRESSION,
				LangageCompilationFactory.eINSTANCE.createMultiplication()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.METHODE_PRINT__EXPRESSION,
				LangageCompilationFactory.eINSTANCE.createLTorEqual()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.METHODE_PRINT__EXPRESSION,
				LangageCompilationFactory.eINSTANCE.createGTorEqual()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.METHODE_PRINT__EXPRESSION,
				LangageCompilationFactory.eINSTANCE.createDifferent()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.METHODE_PRINT__EXPRESSION,
				LangageCompilationFactory.eINSTANCE.createTheBoolean()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.METHODE_PRINT__EXPRESSION,
				LangageCompilationFactory.eINSTANCE.createTheDouble()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.METHODE_PRINT__EXPRESSION,
				LangageCompilationFactory.eINSTANCE.createTheInt()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.METHODE_PRINT__EXPRESSION,
				LangageCompilationFactory.eINSTANCE.createTheString()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.METHODE_PRINT__EXPRESSION,
				LangageCompilationFactory.eINSTANCE.createPlusEqual()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.METHODE_PRINT__EXPRESSION,
				LangageCompilationFactory.eINSTANCE.createMinusEqual()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.METHODE_PRINT__EXPRESSION,
				LangageCompilationFactory.eINSTANCE.createVitesseOperation()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.METHODE_PRINT__EXPRESSION,
				LangageCompilationFactory.eINSTANCE.createColorOperation()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.METHODE_PRINT__EXPRESSION,
				LangageCompilationFactory.eINSTANCE.createRangeOperation()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.METHODE_PRINT__EXPRESSION,
				LangageCompilationFactory.eINSTANCE.createIntensityOperation()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.METHODE_PRINT__EXPRESSION,
				LangageCompilationFactory.eINSTANCE.createXGPSOperation()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.METHODE_PRINT__EXPRESSION,
				LangageCompilationFactory.eINSTANCE.createYGPSOperation()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.METHODE_PRINT__EXPRESSION,
				LangageCompilationFactory.eINSTANCE.createDistanceOperation()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.METHODE_PRINT__EXPRESSION,
				LangageCompilationFactory.eINSTANCE.createAngleOperation()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.METHODE_PRINT__EXPRESSION,
				LangageCompilationFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.METHODE_PRINT__EXPRESSION,
				LangageCompilationFactory.eINSTANCE.createOr()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.METHODE_PRINT__EXPRESSION,
				LangageCompilationFactory.eINSTANCE.createPositionOperation()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.METHODE_PRINT__EXPRESSION,
				LangageCompilationFactory.eINSTANCE.createForceOperation()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.METHODE_PRINT__EXPRESSION,
				LangageCompilationFactory.eINSTANCE.createBreakMotor()));

		newChildDescriptors.add(createChildParameter(LangageCompilationPackage.Literals.METHODE_PRINT__EXPRESSION,
				LangageCompilationFactory.eINSTANCE.createTheColor()));
	}

}
