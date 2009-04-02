package GCML.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.providers.AbstractViewProvider;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.notation.View;

import GCML.diagram.edit.parts.CapabilityBuiltInTypeEditPart;
import GCML.diagram.edit.parts.CapabilityEditPart;
import GCML.diagram.edit.parts.ConnectionDeviceEditPart;
import GCML.diagram.edit.parts.ConnectionEditPart;
import GCML.diagram.edit.parts.ConnectionMediumEditPart;
import GCML.diagram.edit.parts.DeviceCapabilityEditPart;
import GCML.diagram.edit.parts.DeviceEditPart;
import GCML.diagram.edit.parts.GCMLDocumentEditPart;
import GCML.diagram.edit.parts.IsAttachedDeviceIDEditPart;
import GCML.diagram.edit.parts.IsAttachedEditPart;
import GCML.diagram.edit.parts.IsAttachedPersonIDEditPart;
import GCML.diagram.edit.parts.MediumActionEditPart;
import GCML.diagram.edit.parts.MediumBuiltInTypeEditPart;
import GCML.diagram.edit.parts.MediumEditPart;
import GCML.diagram.edit.parts.MediumMediumURLEditPart;
import GCML.diagram.edit.parts.PersonEditPart;
import GCML.diagram.edit.parts.PersonPersonIDEditPart;
import GCML.diagram.edit.parts.PersonPersonNameEditPart;
import GCML.diagram.edit.parts.PersonPersonRoleEditPart;
import GCML.diagram.part.GCMLVisualIDRegistry;
import GCML.diagram.view.factories.CapabilityBuiltInTypeViewFactory;
import GCML.diagram.view.factories.CapabilityViewFactory;
import GCML.diagram.view.factories.ConnectionDeviceViewFactory;
import GCML.diagram.view.factories.ConnectionMediumViewFactory;
import GCML.diagram.view.factories.ConnectionViewFactory;
import GCML.diagram.view.factories.DeviceCapabilityViewFactory;
import GCML.diagram.view.factories.DeviceViewFactory;
import GCML.diagram.view.factories.GCMLDocumentViewFactory;
import GCML.diagram.view.factories.IsAttachedDeviceIDViewFactory;
import GCML.diagram.view.factories.IsAttachedPersonIDViewFactory;
import GCML.diagram.view.factories.IsAttachedViewFactory;
import GCML.diagram.view.factories.MediumActionViewFactory;
import GCML.diagram.view.factories.MediumBuiltInTypeViewFactory;
import GCML.diagram.view.factories.MediumMediumURLViewFactory;
import GCML.diagram.view.factories.MediumViewFactory;
import GCML.diagram.view.factories.PersonPersonIDViewFactory;
import GCML.diagram.view.factories.PersonPersonNameViewFactory;
import GCML.diagram.view.factories.PersonPersonRoleViewFactory;
import GCML.diagram.view.factories.PersonViewFactory;

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
		if (GCMLDocumentEditPart.MODEL_ID.equals(diagramKind)
				&& GCMLVisualIDRegistry.getDiagramVisualID(semanticElement) != -1) {
			return GCMLDocumentViewFactory.class;
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
				if (!GCMLDocumentEditPart.MODEL_ID.equals(GCMLVisualIDRegistry
						.getModelID(containerView))) {
					return null; // foreign diagram
				}
				switch (visualID) {
				case IsAttachedEditPart.VISUAL_ID:
				case CapabilityEditPart.VISUAL_ID:
				case DeviceEditPart.VISUAL_ID:
				case ConnectionEditPart.VISUAL_ID:
				case PersonEditPart.VISUAL_ID:
				case MediumEditPart.VISUAL_ID:
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
				case MediumMediumURLEditPart.VISUAL_ID:
				case MediumBuiltInTypeEditPart.VISUAL_ID:
				case MediumActionEditPart.VISUAL_ID:
					if (MediumEditPart.VISUAL_ID != GCMLVisualIDRegistry
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
		case CapabilityEditPart.VISUAL_ID:
			return CapabilityViewFactory.class;
		case CapabilityBuiltInTypeEditPart.VISUAL_ID:
			return CapabilityBuiltInTypeViewFactory.class;
		case DeviceEditPart.VISUAL_ID:
			return DeviceViewFactory.class;
		case ConnectionEditPart.VISUAL_ID:
			return ConnectionViewFactory.class;
		case PersonEditPart.VISUAL_ID:
			return PersonViewFactory.class;
		case PersonPersonNameEditPart.VISUAL_ID:
			return PersonPersonNameViewFactory.class;
		case PersonPersonIDEditPart.VISUAL_ID:
			return PersonPersonIDViewFactory.class;
		case PersonPersonRoleEditPart.VISUAL_ID:
			return PersonPersonRoleViewFactory.class;
		case MediumEditPart.VISUAL_ID:
			return MediumViewFactory.class;
		case MediumMediumURLEditPart.VISUAL_ID:
			return MediumMediumURLViewFactory.class;
		case MediumBuiltInTypeEditPart.VISUAL_ID:
			return MediumBuiltInTypeViewFactory.class;
		case MediumActionEditPart.VISUAL_ID:
			return MediumActionViewFactory.class;
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
		case ConnectionDeviceEditPart.VISUAL_ID:
			return ConnectionDeviceViewFactory.class;
		case ConnectionMediumEditPart.VISUAL_ID:
			return ConnectionMediumViewFactory.class;
		case IsAttachedPersonIDEditPart.VISUAL_ID:
			return IsAttachedPersonIDViewFactory.class;
		case IsAttachedDeviceIDEditPart.VISUAL_ID:
			return IsAttachedDeviceIDViewFactory.class;
		case DeviceCapabilityEditPart.VISUAL_ID:
			return DeviceCapabilityViewFactory.class;
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
