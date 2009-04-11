package GCML.diagram.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

import GCML.diagram.edit.parts.CapabilityEditPart;
import GCML.diagram.edit.parts.ConnectionEditPart;
import GCML.diagram.edit.parts.DeviceEditPart;
import GCML.diagram.edit.parts.GCMLDocumentEditPart;
import GCML.diagram.edit.parts.IsAttachedEditPart;
import GCML.diagram.edit.parts.MediumEditPart;
import GCML.diagram.edit.parts.PersonEditPart;
import GCML.diagram.part.GCMLDiagramEditorPlugin;
import GCML.diagram.part.Messages;

/**
 * @generated
 */
public class GCMLModelingAssistantProvider extends ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof GCMLDocumentEditPart) {
			List types = new ArrayList();
			types.add(GCMLElementTypes.IsAttached_1001);
			types.add(GCMLElementTypes.Capability_1002);
			types.add(GCMLElementTypes.Device_1003);
			types.add(GCMLElementTypes.Connection_1004);
			types.add(GCMLElementTypes.Person_1005);
			types.add(GCMLElementTypes.Medium_1006);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof IsAttachedEditPart) {
			List types = new ArrayList();
			types.add(GCMLElementTypes.IsAttachedPersonID_3003);
			types.add(GCMLElementTypes.IsAttachedDeviceID_3004);
			return types;
		}
		if (sourceEditPart instanceof DeviceEditPart) {
			List types = new ArrayList();
			types.add(GCMLElementTypes.DeviceCapability_3005);
			return types;
		}
		if (sourceEditPart instanceof ConnectionEditPart) {
			List types = new ArrayList();
			types.add(GCMLElementTypes.ConnectionDevice_3001);
			types.add(GCMLElementTypes.ConnectionMedium_3002);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof CapabilityEditPart) {
			List types = new ArrayList();
			types.add(GCMLElementTypes.DeviceCapability_3005);
			return types;
		}
		if (targetEditPart instanceof DeviceEditPart) {
			List types = new ArrayList();
			types.add(GCMLElementTypes.ConnectionDevice_3001);
			types.add(GCMLElementTypes.IsAttachedDeviceID_3004);
			return types;
		}
		if (targetEditPart instanceof PersonEditPart) {
			List types = new ArrayList();
			types.add(GCMLElementTypes.IsAttachedPersonID_3003);
			return types;
		}
		if (targetEditPart instanceof MediumEditPart) {
			List types = new ArrayList();
			types.add(GCMLElementTypes.ConnectionMedium_3002);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof IsAttachedEditPart) {
			List types = new ArrayList();
			if (targetEditPart instanceof PersonEditPart) {
				types.add(GCMLElementTypes.IsAttachedPersonID_3003);
			}
			if (targetEditPart instanceof DeviceEditPart) {
				types.add(GCMLElementTypes.IsAttachedDeviceID_3004);
			}
			return types;
		}
		if (sourceEditPart instanceof DeviceEditPart) {
			List types = new ArrayList();
			if (targetEditPart instanceof CapabilityEditPart) {
				types.add(GCMLElementTypes.DeviceCapability_3005);
			}
			return types;
		}
		if (sourceEditPart instanceof ConnectionEditPart) {
			List types = new ArrayList();
			if (targetEditPart instanceof DeviceEditPart) {
				types.add(GCMLElementTypes.ConnectionDevice_3001);
			}
			if (targetEditPart instanceof MediumEditPart) {
				types.add(GCMLElementTypes.ConnectionMedium_3002);
			}
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof CapabilityEditPart) {
			List types = new ArrayList();
			if (relationshipType == GCMLElementTypes.DeviceCapability_3005) {
				types.add(GCMLElementTypes.Device_1003);
			}
			return types;
		}
		if (targetEditPart instanceof DeviceEditPart) {
			List types = new ArrayList();
			if (relationshipType == GCMLElementTypes.ConnectionDevice_3001) {
				types.add(GCMLElementTypes.Connection_1004);
			}
			if (relationshipType == GCMLElementTypes.IsAttachedDeviceID_3004) {
				types.add(GCMLElementTypes.IsAttached_1001);
			}
			return types;
		}
		if (targetEditPart instanceof PersonEditPart) {
			List types = new ArrayList();
			if (relationshipType == GCMLElementTypes.IsAttachedPersonID_3003) {
				types.add(GCMLElementTypes.IsAttached_1001);
			}
			return types;
		}
		if (targetEditPart instanceof MediumEditPart) {
			List types = new ArrayList();
			if (relationshipType == GCMLElementTypes.ConnectionMedium_3002) {
				types.add(GCMLElementTypes.Connection_1004);
			}
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof IsAttachedEditPart) {
			List types = new ArrayList();
			if (relationshipType == GCMLElementTypes.IsAttachedPersonID_3003) {
				types.add(GCMLElementTypes.Person_1005);
			}
			if (relationshipType == GCMLElementTypes.IsAttachedDeviceID_3004) {
				types.add(GCMLElementTypes.Device_1003);
			}
			return types;
		}
		if (sourceEditPart instanceof DeviceEditPart) {
			List types = new ArrayList();
			if (relationshipType == GCMLElementTypes.DeviceCapability_3005) {
				types.add(GCMLElementTypes.Capability_1002);
			}
			return types;
		}
		if (sourceEditPart instanceof ConnectionEditPart) {
			List types = new ArrayList();
			if (relationshipType == GCMLElementTypes.ConnectionDevice_3001) {
				types.add(GCMLElementTypes.Device_1003);
			}
			if (relationshipType == GCMLElementTypes.ConnectionMedium_3002) {
				types.add(GCMLElementTypes.Medium_1006);
			}
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForSource(IAdaptable target,
			IElementType relationshipType) {
		return selectExistingElement(target, getTypesForSource(target,
				relationshipType));
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForTarget(IAdaptable source,
			IElementType relationshipType) {
		return selectExistingElement(source, getTypesForTarget(source,
				relationshipType));
	}

	/**
	 * @generated
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		Collection elements = new HashSet();
		for (Iterator it = diagram.getElement().eAllContents(); it.hasNext();) {
			EObject element = (EObject) it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements
				.size()]));
	}

	/**
	 * @generated
	 */
	protected boolean isApplicableElement(EObject element, Collection types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(
				element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(
				GCMLDiagramEditorPlugin.getInstance()
						.getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog.setMessage(Messages.GCMLModelingAssistantProviderMessage);
		dialog.setTitle(Messages.GCMLModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
