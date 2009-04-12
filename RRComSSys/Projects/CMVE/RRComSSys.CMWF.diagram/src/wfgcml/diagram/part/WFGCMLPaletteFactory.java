package wfgcml.diagram.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;

import wfgcml.diagram.providers.WFGCMLElementTypes;

/**
 * @generated
 */
public class WFGCMLPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createWfgcml1Group());
	}

	/**
	 * Creates "wfgcml" palette tool group
	 * @generated
	 */
	private PaletteContainer createWfgcml1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Wfgcml1Group_title);
		paletteContainer.add(createGCML1CreationTool());
		paletteContainer.add(createNext2CreationTool());
		paletteContainer.add(createStart3CreationTool());
		paletteContainer.add(createFinal4CreationTool());
		paletteContainer.add(createCondition5CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGCML1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(WFGCMLElementTypes.GCMLInstance_1001);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.GCML1CreationTool_title,
				Messages.GCML1CreationTool_desc, types);
		entry.setSmallIcon(WFGCMLElementTypes
				.getImageDescriptor(WFGCMLElementTypes.GCMLInstance_1001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNext2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(WFGCMLElementTypes.ConditionAltnext_3001);
		types.add(WFGCMLElementTypes.HasNextNext_3002);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Next2CreationTool_title,
				Messages.Next2CreationTool_desc, types);
		entry.setSmallIcon(WFGCMLElementTypes
				.getImageDescriptor(WFGCMLElementTypes.ConditionAltnext_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStart3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(WFGCMLElementTypes.Start_1002);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Start3CreationTool_title,
				Messages.Start3CreationTool_desc, types);
		entry.setSmallIcon(WFGCMLElementTypes
				.getImageDescriptor(WFGCMLElementTypes.Start_1002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFinal4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(WFGCMLElementTypes.Final_1003);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Final4CreationTool_title,
				Messages.Final4CreationTool_desc, types);
		entry.setSmallIcon(WFGCMLElementTypes
				.getImageDescriptor(WFGCMLElementTypes.Final_1003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCondition5CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(WFGCMLElementTypes.Condition_1004);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Condition5CreationTool_title,
				Messages.Condition5CreationTool_desc, types);
		entry.setSmallIcon(WFGCMLElementTypes
				.getImageDescriptor(WFGCMLElementTypes.Condition_1004));
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
