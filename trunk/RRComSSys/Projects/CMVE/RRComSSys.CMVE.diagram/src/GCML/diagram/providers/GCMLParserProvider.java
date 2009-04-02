package GCML.diagram.providers;

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

import GCML.GCMLPackage;
import GCML.diagram.edit.parts.CapabilityBuiltInTypeEditPart;
import GCML.diagram.edit.parts.MediumActionEditPart;
import GCML.diagram.edit.parts.MediumBuiltInTypeEditPart;
import GCML.diagram.edit.parts.MediumMediumURLEditPart;
import GCML.diagram.edit.parts.PersonPersonIDEditPart;
import GCML.diagram.edit.parts.PersonPersonNameEditPart;
import GCML.diagram.edit.parts.PersonPersonRoleEditPart;
import GCML.diagram.parsers.MessageFormatParser;
import GCML.diagram.part.GCMLVisualIDRegistry;

/**
 * @generated
 */
public class GCMLParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser capabilityBuiltInType_5001Parser;

	/**
	 * @generated
	 */
	private IParser getCapabilityBuiltInType_5001Parser() {
		if (capabilityBuiltInType_5001Parser == null) {
			capabilityBuiltInType_5001Parser = createCapabilityBuiltInType_5001Parser();
		}
		return capabilityBuiltInType_5001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createCapabilityBuiltInType_5001Parser() {
		EAttribute[] features = new EAttribute[] { GCMLPackage.eINSTANCE
				.getCapability_BuiltInType(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser personPersonName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getPersonPersonName_5002Parser() {
		if (personPersonName_5002Parser == null) {
			personPersonName_5002Parser = createPersonPersonName_5002Parser();
		}
		return personPersonName_5002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createPersonPersonName_5002Parser() {
		EAttribute[] features = new EAttribute[] { GCMLPackage.eINSTANCE
				.getPerson_PersonName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser personPersonID_5003Parser;

	/**
	 * @generated
	 */
	private IParser getPersonPersonID_5003Parser() {
		if (personPersonID_5003Parser == null) {
			personPersonID_5003Parser = createPersonPersonID_5003Parser();
		}
		return personPersonID_5003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createPersonPersonID_5003Parser() {
		EAttribute[] features = new EAttribute[] { GCMLPackage.eINSTANCE
				.getPerson_PersonID(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser personPersonRole_5004Parser;

	/**
	 * @generated
	 */
	private IParser getPersonPersonRole_5004Parser() {
		if (personPersonRole_5004Parser == null) {
			personPersonRole_5004Parser = createPersonPersonRole_5004Parser();
		}
		return personPersonRole_5004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createPersonPersonRole_5004Parser() {
		EAttribute[] features = new EAttribute[] { GCMLPackage.eINSTANCE
				.getPerson_PersonRole(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser mediumMediumURL_5005Parser;

	/**
	 * @generated
	 */
	private IParser getMediumMediumURL_5005Parser() {
		if (mediumMediumURL_5005Parser == null) {
			mediumMediumURL_5005Parser = createMediumMediumURL_5005Parser();
		}
		return mediumMediumURL_5005Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createMediumMediumURL_5005Parser() {
		EAttribute[] features = new EAttribute[] { GCMLPackage.eINSTANCE
				.getMedium_MediumURL(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser mediumBuiltInType_5006Parser;

	/**
	 * @generated
	 */
	private IParser getMediumBuiltInType_5006Parser() {
		if (mediumBuiltInType_5006Parser == null) {
			mediumBuiltInType_5006Parser = createMediumBuiltInType_5006Parser();
		}
		return mediumBuiltInType_5006Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createMediumBuiltInType_5006Parser() {
		EAttribute[] features = new EAttribute[] { GCMLPackage.eINSTANCE
				.getMedium_BuiltInType(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser mediumAction_5007Parser;

	/**
	 * @generated
	 */
	private IParser getMediumAction_5007Parser() {
		if (mediumAction_5007Parser == null) {
			mediumAction_5007Parser = createMediumAction_5007Parser();
		}
		return mediumAction_5007Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createMediumAction_5007Parser() {
		EAttribute[] features = new EAttribute[] { GCMLPackage.eINSTANCE
				.getMedium_Action(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case CapabilityBuiltInTypeEditPart.VISUAL_ID:
			return getCapabilityBuiltInType_5001Parser();
		case PersonPersonNameEditPart.VISUAL_ID:
			return getPersonPersonName_5002Parser();
		case PersonPersonIDEditPart.VISUAL_ID:
			return getPersonPersonID_5003Parser();
		case PersonPersonRoleEditPart.VISUAL_ID:
			return getPersonPersonRole_5004Parser();
		case MediumMediumURLEditPart.VISUAL_ID:
			return getMediumMediumURL_5005Parser();
		case MediumBuiltInTypeEditPart.VISUAL_ID:
			return getMediumBuiltInType_5006Parser();
		case MediumActionEditPart.VISUAL_ID:
			return getMediumAction_5007Parser();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(GCMLVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(GCMLVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (GCMLElementTypes.getElement(hint) == null) {
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
