package gcml.diagram.part;

import gcml.diagram.providers.GCMLElementTypes;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;

/**
 * @generated
 */
public class GCMLPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createGcml1Group());
	}

	/**
	 * Creates "gcml" palette tool group
	 * @generated
	 */
	private PaletteContainer createGcml1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Gcml1Group_title);
		paletteContainer.add(createPerson1CreationTool());
		paletteContainer.add(createIsAttached2CreationTool());
		paletteContainer.add(createIsAttachedConnectToDevice3CreationTool());
		paletteContainer.add(createIsAttachedConnectToPerson4CreationTool());
		paletteContainer.add(createDevice5CreationTool());
		paletteContainer.add(createDeviceCapabilities6CreationTool());
		paletteContainer.add(createCapability7CreationTool());
		paletteContainer.add(createConnection8CreationTool());
		paletteContainer.add(createConnectionDevices9CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPerson1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(GCMLElementTypes.Person_1004);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Person1CreationTool_title,
				Messages.Person1CreationTool_desc, types);
		entry.setSmallIcon(GCMLElementTypes
				.getImageDescriptor(GCMLElementTypes.Person_1004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIsAttached2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(GCMLElementTypes.IsAttached_1001);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.IsAttached2CreationTool_title,
				Messages.IsAttached2CreationTool_desc, types);
		entry.setSmallIcon(GCMLElementTypes
				.getImageDescriptor(GCMLElementTypes.IsAttached_1001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIsAttachedConnectToDevice3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(GCMLElementTypes.IsAttachedConnectToDevice_3001);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.IsAttachedConnectToDevice3CreationTool_title,
				Messages.IsAttachedConnectToDevice3CreationTool_desc, types);
		entry
				.setSmallIcon(GCMLElementTypes
						.getImageDescriptor(GCMLElementTypes.IsAttachedConnectToDevice_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIsAttachedConnectToPerson4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(GCMLElementTypes.IsAttachedConnectToPerson_3002);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.IsAttachedConnectToPerson4CreationTool_title,
				Messages.IsAttachedConnectToPerson4CreationTool_desc, types);
		entry
				.setSmallIcon(GCMLElementTypes
						.getImageDescriptor(GCMLElementTypes.IsAttachedConnectToPerson_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDevice5CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(GCMLElementTypes.Device_1005);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Device5CreationTool_title,
				Messages.Device5CreationTool_desc, types);
		entry.setSmallIcon(GCMLElementTypes
				.getImageDescriptor(GCMLElementTypes.Device_1005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDeviceCapabilities6CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(GCMLElementTypes.DeviceCapabilities_3003);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.DeviceCapabilities6CreationTool_title,
				Messages.DeviceCapabilities6CreationTool_desc, types);
		entry.setSmallIcon(GCMLElementTypes
				.getImageDescriptor(GCMLElementTypes.DeviceCapabilities_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCapability7CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(GCMLElementTypes.Capability_1003);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Capability7CreationTool_title,
				Messages.Capability7CreationTool_desc, types);
		entry.setSmallIcon(GCMLElementTypes
				.getImageDescriptor(GCMLElementTypes.Capability_1003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnection8CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(GCMLElementTypes.Connection_1002);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Connection8CreationTool_title,
				Messages.Connection8CreationTool_desc, types);
		entry.setSmallIcon(GCMLElementTypes
				.getImageDescriptor(GCMLElementTypes.Connection_1002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionDevices9CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(GCMLElementTypes.ConnectionDevices_3004);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ConnectionDevices9CreationTool_title,
				Messages.ConnectionDevices9CreationTool_desc, types);
		entry.setSmallIcon(GCMLElementTypes
				.getImageDescriptor(GCMLElementTypes.ConnectionDevices_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
