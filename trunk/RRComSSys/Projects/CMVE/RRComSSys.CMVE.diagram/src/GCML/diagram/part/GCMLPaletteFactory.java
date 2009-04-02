package GCML.diagram.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;

import GCML.diagram.providers.GCMLElementTypes;

/**
 * @generated
 */
public class GCMLPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createGCML1Group());
	}

	/**
	 * Creates "GCML" palette tool group
	 * @generated
	 */
	private PaletteContainer createGCML1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.GCML1Group_title);
		paletteContainer.setDescription(Messages.GCML1Group_desc);
		paletteContainer.add(createPerson1CreationTool());
		paletteContainer.add(createIsAttached2CreationTool());
		paletteContainer.add(createDevice3CreationTool());
		paletteContainer.add(createCapability4CreationTool());
		paletteContainer.add(createConnection5CreationTool());
		paletteContainer.add(createMedium6CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPerson1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(GCMLElementTypes.Person_2005);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Person1CreationTool_title,
				Messages.Person1CreationTool_desc, types);
		entry.setSmallIcon(GCMLElementTypes
				.getImageDescriptor(GCMLElementTypes.Person_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIsAttached2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(GCMLElementTypes.IsAttached_2001);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.IsAttached2CreationTool_title,
				Messages.IsAttached2CreationTool_desc, types);
		entry.setSmallIcon(GCMLElementTypes
				.getImageDescriptor(GCMLElementTypes.IsAttached_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDevice3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(GCMLElementTypes.Device_2003);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Device3CreationTool_title,
				Messages.Device3CreationTool_desc, types);
		entry.setSmallIcon(GCMLElementTypes
				.getImageDescriptor(GCMLElementTypes.Device_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCapability4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(GCMLElementTypes.Capability_2002);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Capability4CreationTool_title,
				Messages.Capability4CreationTool_desc, types);
		entry.setSmallIcon(GCMLElementTypes
				.getImageDescriptor(GCMLElementTypes.Capability_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnection5CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(GCMLElementTypes.Connection_2004);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Connection5CreationTool_title,
				Messages.Connection5CreationTool_desc, types);
		entry.setSmallIcon(GCMLElementTypes
				.getImageDescriptor(GCMLElementTypes.Connection_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMedium6CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(GCMLElementTypes.Medium_2006);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Medium6CreationTool_title,
				Messages.Medium6CreationTool_desc, types);
		entry.setSmallIcon(GCMLElementTypes
				.getImageDescriptor(GCMLElementTypes.Medium_2006));
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
