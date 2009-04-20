package wfgcml.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

import wfgcml.Condition;
import wfgcml.Final;
import wfgcml.GCMLInstance;
import wfgcml.HasNext;
import wfgcml.IsNext;
import wfgcml.Start;
import wfgcml.WFGCMLRoot;
import wfgcml.WfgcmlPackage;
import wfgcml.diagram.edit.parts.ConditionAltnextEditPart;
import wfgcml.diagram.edit.parts.ConditionEditPart;
import wfgcml.diagram.edit.parts.FinalEditPart;
import wfgcml.diagram.edit.parts.GCMLInstanceEditPart;
import wfgcml.diagram.edit.parts.HasNextNextEditPart;
import wfgcml.diagram.edit.parts.StartEditPart;
import wfgcml.diagram.edit.parts.WFGCMLRootEditPart;
import wfgcml.diagram.providers.WFGCMLElementTypes;

/**
 * @generated
 */
public class WFGCMLDiagramUpdater {

	/**
	 * @generated
	 */
	public static List getSemanticChildren(View view) {
		switch (WFGCMLVisualIDRegistry.getVisualID(view)) {
		case WFGCMLRootEditPart.VISUAL_ID:
			return getWFGCMLRoot_79SemanticChildren(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWFGCMLRoot_79SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		WFGCMLRoot modelElement = (WFGCMLRoot) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getGCML().iterator(); it.hasNext();) {
			GCMLInstance childElement = (GCMLInstance) it.next();
			int visualID = WFGCMLVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == GCMLInstanceEditPart.VISUAL_ID) {
				result.add(new WFGCMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			Start childElement = modelElement.getStart();
			int visualID = WFGCMLVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == StartEditPart.VISUAL_ID) {
				result.add(new WFGCMLNodeDescriptor(childElement, visualID));
			}
		}
		{
			Final childElement = modelElement.getFinal();
			int visualID = WFGCMLVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == FinalEditPart.VISUAL_ID) {
				result.add(new WFGCMLNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator it = modelElement.getCondition().iterator(); it.hasNext();) {
			Condition childElement = (Condition) it.next();
			int visualID = WFGCMLVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ConditionEditPart.VISUAL_ID) {
				result.add(new WFGCMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getContainedLinks(View view) {
		switch (WFGCMLVisualIDRegistry.getVisualID(view)) {
		case WFGCMLRootEditPart.VISUAL_ID:
			return getWFGCMLRoot_79ContainedLinks(view);
		case GCMLInstanceEditPart.VISUAL_ID:
			return getGCMLInstance_1001ContainedLinks(view);
		case StartEditPart.VISUAL_ID:
			return getStart_1002ContainedLinks(view);
		case FinalEditPart.VISUAL_ID:
			return getFinal_1003ContainedLinks(view);
		case ConditionEditPart.VISUAL_ID:
			return getCondition_1004ContainedLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIncomingLinks(View view) {
		switch (WFGCMLVisualIDRegistry.getVisualID(view)) {
		case GCMLInstanceEditPart.VISUAL_ID:
			return getGCMLInstance_1001IncomingLinks(view);
		case StartEditPart.VISUAL_ID:
			return getStart_1002IncomingLinks(view);
		case FinalEditPart.VISUAL_ID:
			return getFinal_1003IncomingLinks(view);
		case ConditionEditPart.VISUAL_ID:
			return getCondition_1004IncomingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutgoingLinks(View view) {
		switch (WFGCMLVisualIDRegistry.getVisualID(view)) {
		case GCMLInstanceEditPart.VISUAL_ID:
			return getGCMLInstance_1001OutgoingLinks(view);
		case StartEditPart.VISUAL_ID:
			return getStart_1002OutgoingLinks(view);
		case FinalEditPart.VISUAL_ID:
			return getFinal_1003OutgoingLinks(view);
		case ConditionEditPart.VISUAL_ID:
			return getCondition_1004OutgoingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWFGCMLRoot_79ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getGCMLInstance_1001ContainedLinks(View view) {
		GCMLInstance modelElement = (GCMLInstance) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_HasNext_Next_3002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getStart_1002ContainedLinks(View view) {
		Start modelElement = (Start) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_HasNext_Next_3002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getFinal_1003ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCondition_1004ContainedLinks(View view) {
		Condition modelElement = (Condition) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Condition_Altnext_3001(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_HasNext_Next_3002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getGCMLInstance_1001IncomingLinks(View view) {
		GCMLInstance modelElement = (GCMLInstance) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_Condition_Altnext_3001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_HasNext_Next_3002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getStart_1002IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFinal_1003IncomingLinks(View view) {
		Final modelElement = (Final) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_Condition_Altnext_3001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_HasNext_Next_3002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCondition_1004IncomingLinks(View view) {
		Condition modelElement = (Condition) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_Condition_Altnext_3001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_HasNext_Next_3002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getGCMLInstance_1001OutgoingLinks(View view) {
		GCMLInstance modelElement = (GCMLInstance) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_HasNext_Next_3002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getStart_1002OutgoingLinks(View view) {
		Start modelElement = (Start) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_HasNext_Next_3002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getFinal_1003OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCondition_1004OutgoingLinks(View view) {
		Condition modelElement = (Condition) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Condition_Altnext_3001(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_HasNext_Next_3002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Condition_Altnext_3001(
			IsNext target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == WfgcmlPackage.eINSTANCE
					.getCondition_Altnext()) {
				result.add(new WFGCMLLinkDescriptor(setting.getEObject(),
						target, WFGCMLElementTypes.ConditionAltnext_3001,
						ConditionAltnextEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_HasNext_Next_3002(
			IsNext target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == WfgcmlPackage.eINSTANCE
					.getHasNext_Next()) {
				result.add(new WFGCMLLinkDescriptor(setting.getEObject(),
						target, WFGCMLElementTypes.HasNextNext_3002,
						HasNextNextEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Condition_Altnext_3001(
			Condition source) {
		Collection result = new LinkedList();
		IsNext destination = source.getAltnext();
		if (destination == null) {
			return result;
		}
		result.add(new WFGCMLLinkDescriptor(source, destination,
				WFGCMLElementTypes.ConditionAltnext_3001,
				ConditionAltnextEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_HasNext_Next_3002(
			HasNext source) {
		Collection result = new LinkedList();
		IsNext destination = source.getNext();
		if (destination == null) {
			return result;
		}
		result.add(new WFGCMLLinkDescriptor(source, destination,
				WFGCMLElementTypes.HasNextNext_3002,
				HasNextNextEditPart.VISUAL_ID));
		return result;
	}

}
