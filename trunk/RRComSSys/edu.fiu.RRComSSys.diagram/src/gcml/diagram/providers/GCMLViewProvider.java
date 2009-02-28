package gcml.diagram.providers;

import gcml.diagram.edit.parts.CapabilityBuiltInTypeEditPart;
import gcml.diagram.edit.parts.CapabilityEditPart;
import gcml.diagram.edit.parts.ConnectionDevicesEditPart;
import gcml.diagram.edit.parts.ConnectionEditPart;
import gcml.diagram.edit.parts.DeviceCapabilitiesEditPart;
import gcml.diagram.edit.parts.DeviceDeviceIDEditPart;
import gcml.diagram.edit.parts.DeviceEditPart;
import gcml.diagram.edit.parts.IsAttachedConnectToDeviceEditPart;
import gcml.diagram.edit.parts.IsAttachedConnectToPersonEditPart;
import gcml.diagram.edit.parts.IsAttachedEditPart;
import gcml.diagram.edit.parts.PersonEditPart;
import gcml.diagram.edit.parts.PersonPersonIDEditPart;
import gcml.diagram.edit.parts.PersonPersonNameEditPart;
import gcml.diagram.edit.parts.PersonPersonRoleEditPart;
import gcml.diagram.edit.parts.UserSchemaEditPart;
import gcml.diagram.part.GCMLVisualIDRegistry;
import gcml.diagram.view.factories.CapabilityBuiltInTypeViewFactory;
import gcml.diagram.view.factories.CapabilityViewFactory;
import gcml.diagram.view.factories.ConnectionDevicesViewFactory;
import gcml.diagram.view.factories.ConnectionViewFactory;
import gcml.diagram.view.factories.DeviceCapabilitiesViewFactory;
import gcml.diagram.view.factories.DeviceDeviceIDViewFactory;
import gcml.diagram.view.factories.DeviceViewFactory;
import gcml.diagram.view.factories.IsAttachedConnectToDeviceViewFactory;
import gcml.diagram.view.factories.IsAttachedConnectToPersonViewFactory;
import gcml.diagram.view.factories.IsAttachedViewFactory;
import gcml.diagram.view.factories.PersonPersonIDViewFactory;
import gcml.diagram.view.factories.PersonPersonNameViewFactory;
import gcml.diagram.view.factories.PersonPersonRoleViewFactory;
import gcml.diagram.view.factories.PersonViewFactory;
import gcml.diagram.view.factories.UserSchemaViewFactory;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.providers.AbstractViewProvider;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class GCMLViewProvider extends AbstractViewProvider {

	/**
	 * @generated
	 */
	protected Class getDiagramViewClass(IAdaptable semanticAdapter,
			String diagramKind) {
		EObject semanticElement = getSemanticElement(semanticAdapter);
		if (UserSchemaEditPart.MODEL_ID.equals(diagramKind)
				&& GCMLVisualIDRegistry.getDiagramVisualID(semanticElement) != -1) {
			return UserSchemaViewFactory.class;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Class getNodeViewClass(IAdaptable semanticAdapter,
			View containerView, String semanticHint) {
		if (containerView == null) {
			return null;
		}
		IElementType elementType = getSemanticElementType(semanticAdapter);
		EObject domainElement = getSemanticElement(semanticAdapter);
		int visualID;
		if (semanticHint == null) {
			// Semantic hint is not specified. Can be a result of call from CanonicalEditPolicy.
			// In this situation there should be NO elementType, visualID will be determined
			// by VisualIDRegistry.getNodeVisualID() for domainElement.
			if (elementType != null || domainElement == null) {
				return null;
			}
			visualID = GCMLVisualIDRegistry.getNodeVisualID(containerView,
					domainElement);
		} else {
			visualID = GCMLVisualIDRegistry.getVisualID(semanticHint);
			if (elementType != null) {
				// Semantic hint is specified together with element type.
				// Both parameters should describe exactly the same diagram element.
				// In addition we check that visualID returned by VisualIDRegistry.getNodeVisualID() for
				// domainElement (if specified) is the same as in element type.
				if (!GCMLElementTypes.isKnownElementType(elementType)
						|| (!(elementType instanceof IHintedType))) {
					return null; // foreign element type
				}
				String elementTypeHint = ((IHintedType) elementType)
						.getSemanticHint();
				if (!semanticHint.equals(elementTypeHint)) {
					return null; // if semantic hint is specified it should be the same as in element type
				}
				if (domainElement != null
						&& visualID != GCMLVisualIDRegistry.getNodeVisualID(
								containerView, domainElement)) {
					return null; // visual id for node EClass should match visual id from element type
				}
			} else {
				// Element type is not specified. Domain element should be present (except pure design elements).
				// This method is called with EObjectAdapter as parameter from:
				//   - ViewService.createNode(View container, EObject eObject, String type, PreferencesHint preferencesHint) 
				//   - generated ViewFactory.decorateView() for parent element
				if (!UserSchemaEditPart.MODEL_ID.equals(GCMLVisualIDRegistry
						.getModelID(containerView))) {
					return null; // foreign diagram
				}
				switch (visualID) {
				case IsAttachedEditPart.VISUAL_ID:
				case ConnectionEditPart.VISUAL_ID:
				case CapabilityEditPart.VISUAL_ID:
				case PersonEditPart.VISUAL_ID:
				case DeviceEditPart.VISUAL_ID:
					if (domainElement == null
							|| visualID != GCMLVisualIDRegistry
									.getNodeVisualID(containerView,
											domainElement)) {
						return null; // visual id in semantic hint should match visual id for domain element
					}
					break;
				case CapabilityBuiltInTypeEditPart.VISUAL_ID:
					if (CapabilityEditPart.VISUAL_ID != GCMLVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case PersonPersonNameEditPart.VISUAL_ID:
				case PersonPersonIDEditPart.VISUAL_ID:
				case PersonPersonRoleEditPart.VISUAL_ID:
					if (PersonEditPart.VISUAL_ID != GCMLVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case DeviceDeviceIDEditPart.VISUAL_ID:
					if (DeviceEditPart.VISUAL_ID != GCMLVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				default:
					return null;
				}
			}
		}
		return getNodeViewClass(containerView, visualID);
	}

	/**
	 * @generated
	 */
	protected Class getNodeViewClass(View containerView, int visualID) {
		if (containerView == null
				|| !GCMLVisualIDRegistry.canCreateNode(containerView, visualID)) {
			return null;
		}
		switch (visualID) {
		case IsAttachedEditPart.VISUAL_ID:
			return IsAttachedViewFactory.class;
		case ConnectionEditPart.VISUAL_ID:
			return ConnectionViewFactory.class;
		case CapabilityEditPart.VISUAL_ID:
			return CapabilityViewFactory.class;
		case CapabilityBuiltInTypeEditPart.VISUAL_ID:
			return CapabilityBuiltInTypeViewFactory.class;
		case PersonEditPart.VISUAL_ID:
			return PersonViewFactory.class;
		case PersonPersonNameEditPart.VISUAL_ID:
			return PersonPersonNameViewFactory.class;
		case PersonPersonIDEditPart.VISUAL_ID:
			return PersonPersonIDViewFactory.class;
		case PersonPersonRoleEditPart.VISUAL_ID:
			return PersonPersonRoleViewFactory.class;
		case DeviceEditPart.VISUAL_ID:
			return DeviceViewFactory.class;
		case DeviceDeviceIDEditPart.VISUAL_ID:
			return DeviceDeviceIDViewFactory.class;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Class getEdgeViewClass(IAdaptable semanticAdapter,
			View containerView, String semanticHint) {
		IElementType elementType = getSemanticElementType(semanticAdapter);
		if (!GCMLElementTypes.isKnownElementType(elementType)
				|| (!(elementType instanceof IHintedType))) {
			return null; // foreign element type
		}
		String elementTypeHint = ((IHintedType) elementType).getSemanticHint();
		if (elementTypeHint == null) {
			return null; // our hint is visual id and must be specified
		}
		if (semanticHint != null && !semanticHint.equals(elementTypeHint)) {
			return null; // if semantic hint is specified it should be the same as in element type
		}
		int visualID = GCMLVisualIDRegistry.getVisualID(elementTypeHint);
		EObject domainElement = getSemanticElement(semanticAdapter);
		if (domainElement != null
				&& visualID != GCMLVisualIDRegistry
						.getLinkWithClassVisualID(domainElement)) {
			return null; // visual id for link EClass should match visual id from element type
		}
		return getEdgeViewClass(visualID);
	}

	/**
	 * @generated
	 */
	protected Class getEdgeViewClass(int visualID) {
		switch (visualID) {
		case IsAttachedConnectToDeviceEditPart.VISUAL_ID:
			return IsAttachedConnectToDeviceViewFactory.class;
		case IsAttachedConnectToPersonEditPart.VISUAL_ID:
			return IsAttachedConnectToPersonViewFactory.class;
		case DeviceCapabilitiesEditPart.VISUAL_ID:
			return DeviceCapabilitiesViewFactory.class;
		case ConnectionDevicesEditPart.VISUAL_ID:
			return ConnectionDevicesViewFactory.class;
		}
		return null;
	}

	/**
	 * @generated
	 */
	private IElementType getSemanticElementType(IAdaptable semanticAdapter) {
		if (semanticAdapter == null) {
			return null;
		}
		return (IElementType) semanticAdapter.getAdapter(IElementType.class);
	}
}
