package wfgcml.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import wfgcml.WfgcmlPackage;
import wfgcml.diagram.edit.parts.GCMLInstanceGCMLLocEditPart;
import wfgcml.diagram.parsers.MessageFormatParser;
import wfgcml.diagram.part.WFGCMLVisualIDRegistry;

/**
 * @generated
 */
public class WFGCMLParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser gCMLInstanceGCMLLoc_4001Parser;

	/**
	 * @generated
	 */
	private IParser getGCMLInstanceGCMLLoc_4001Parser() {
		if (gCMLInstanceGCMLLoc_4001Parser == null) {
			gCMLInstanceGCMLLoc_4001Parser = createGCMLInstanceGCMLLoc_4001Parser();
		}
		return gCMLInstanceGCMLLoc_4001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createGCMLInstanceGCMLLoc_4001Parser() {
		EAttribute[] features = new EAttribute[] { WfgcmlPackage.eINSTANCE
				.getGCMLInstance_GCMLLoc(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case GCMLInstanceGCMLLocEditPart.VISUAL_ID:
			return getGCMLInstanceGCMLLoc_4001Parser();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(WFGCMLVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(WFGCMLVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (WFGCMLElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
