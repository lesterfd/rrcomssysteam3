package wfgcml.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.providers.AbstractViewProvider;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.notation.View;

import wfgcml.diagram.edit.parts.ConditionAltnextEditPart;
import wfgcml.diagram.edit.parts.ConditionEditPart;
import wfgcml.diagram.edit.parts.FinalEditPart;
import wfgcml.diagram.edit.parts.GCMLInstanceEditPart;
import wfgcml.diagram.edit.parts.GCMLInstanceGCMLLocEditPart;
import wfgcml.diagram.edit.parts.HasNextNextEditPart;
import wfgcml.diagram.edit.parts.StartEditPart;
import wfgcml.diagram.edit.parts.WFGCMLRootEditPart;
import wfgcml.diagram.part.WFGCMLVisualIDRegistry;
import wfgcml.diagram.view.factories.ConditionAltnextViewFactory;
import wfgcml.diagram.view.factories.ConditionViewFactory;
import wfgcml.diagram.view.factories.FinalViewFactory;
import wfgcml.diagram.view.factories.GCMLInstanceGCMLLocViewFactory;
import wfgcml.diagram.view.factories.GCMLInstanceViewFactory;
import wfgcml.diagram.view.factories.HasNextNextViewFactory;
import wfgcml.diagram.view.factories.StartViewFactory;
import wfgcml.diagram.view.factories.WFGCMLRootViewFactory;

/**
 * @generated
 */
public class WFGCMLViewProvider extends AbstractViewProvider {

	/**
	 * @generated
	 */
	protected Class getDiagramViewClass(IAdaptable semanticAdapter,
			String diagramKind) {
		EObject semanticElement = getSemanticElement(semanticAdapter);
		if (WFGCMLRootEditPart.MODEL_ID.equals(diagramKind)
				&& WFGCMLVisualIDRegistry.getDiagramVisualID(semanticElement) != -1) {
			return WFGCMLRootViewFactory.class;
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
			visualID = WFGCMLVisualIDRegistry.getNodeVisualID(containerView,
					domainElement);
		} else {
			visualID = WFGCMLVisualIDRegistry.getVisualID(semanticHint);
			if (elementType != null) {
				// Semantic hint is specified together with element type.
				// Both parameters should describe exactly the same diagram element.
				// In addition we check that visualID returned by VisualIDRegistry.getNodeVisualID() for
				// domainElement (if specified) is the same as in element type.
				if (!WFGCMLElementTypes.isKnownElementType(elementType)
						|| (!(elementType instanceof IHintedType))) {
					return null; // foreign element type
				}
				String elementTypeHint = ((IHintedType) elementType)
						.getSemanticHint();
				if (!semanticHint.equals(elementTypeHint)) {
					return null; // if semantic hint is specified it should be the same as in element type
				}
				if (domainElement != null
						&& visualID != WFGCMLVisualIDRegistry.getNodeVisualID(
								containerView, domainElement)) {
					return null; // visual id for node EClass should match visual id from element type
				}
			} else {
				// Element type is not specified. Domain element should be present (except pure design elements).
				// This method is called with EObjectAdapter as parameter from:
				//   - ViewService.createNode(View container, EObject eObject, String type, PreferencesHint preferencesHint) 
				//   - generated ViewFactory.decorateView() for parent element
				if (!WFGCMLRootEditPart.MODEL_ID.equals(WFGCMLVisualIDRegistry
						.getModelID(containerView))) {
					return null; // foreign diagram
				}
				switch (visualID) {
				case GCMLInstanceEditPart.VISUAL_ID:
				case StartEditPart.VISUAL_ID:
				case FinalEditPart.VISUAL_ID:
				case ConditionEditPart.VISUAL_ID:
					if (domainElement == null
							|| visualID != WFGCMLVisualIDRegistry
									.getNodeVisualID(containerView,
											domainElement)) {
						return null; // visual id in semantic hint should match visual id for domain element
					}
					break;
				case GCMLInstanceGCMLLocEditPart.VISUAL_ID:
					if (GCMLInstanceEditPart.VISUAL_ID != WFGCMLVisualIDRegistry
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
				|| !WFGCMLVisualIDRegistry.canCreateNode(containerView,
						visualID)) {
			return null;
		}
		switch (visualID) {
		case GCMLInstanceEditPart.VISUAL_ID:
			return GCMLInstanceViewFactory.class;
		case GCMLInstanceGCMLLocEditPart.VISUAL_ID:
			return GCMLInstanceGCMLLocViewFactory.class;
		case StartEditPart.VISUAL_ID:
			return StartViewFactory.class;
		case FinalEditPart.VISUAL_ID:
			return FinalViewFactory.class;
		case ConditionEditPart.VISUAL_ID:
			return ConditionViewFactory.class;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Class getEdgeViewClass(IAdaptable semanticAdapter,
			View containerView, String semanticHint) {
		IElementType elementType = getSemanticElementType(semanticAdapter);
		if (!WFGCMLElementTypes.isKnownElementType(elementType)
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
		int visualID = WFGCMLVisualIDRegistry.getVisualID(elementTypeHint);
		EObject domainElement = getSemanticElement(semanticAdapter);
		if (domainElement != null
				&& visualID != WFGCMLVisualIDRegistry
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
		case ConditionAltnextEditPart.VISUAL_ID:
			return ConditionAltnextViewFactory.class;
		case HasNextNextEditPart.VISUAL_ID:
			return HasNextNextViewFactory.class;
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
