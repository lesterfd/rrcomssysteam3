package wfgcml.diagram.part;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;

/**
 * @generated
 */
public class WFGCMLCreationWizard extends Wizard implements INewWizard {

	/**
	 * @generated
	 */
	private IWorkbench workbench;

	/**
	 * @generated
	 */
	protected IStructuredSelection selection;

	/**
	 * @generated
	 */
	protected WFGCMLCreationWizardPage diagramModelFilePage;

	/**
	 * @generated
	 */
	protected WFGCMLCreationWizardPage domainModelFilePage;

	/**
	 * @generated
	 */
	protected Resource diagram;

	/**
	 * @generated
	 */
	private boolean openNewlyCreatedDiagramEditor = true;

	/**
	 * @generated
	 */
	public IWorkbench getWorkbench() {
		return workbench;
	}

	/**
	 * @generated
	 */
	public IStructuredSelection getSelection() {
		return selection;
	}

	/**
	 * @generated
	 */
	public final Resource getDiagram() {
		return diagram;
	}

	/**
	 * @generated
	 */
	public final boolean isOpenNewlyCreatedDiagramEditor() {
		return openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void setOpenNewlyCreatedDiagramEditor(
			boolean openNewlyCreatedDiagramEditor) {
		this.openNewlyCreatedDiagramEditor = openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(Messages.WFGCMLCreationWizardTitle);
		setDefaultPageImageDescriptor(WFGCMLDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewWfgcmlWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	 * @generated
	 */
	public void addPages() {
		diagramModelFilePage = new WFGCMLCreationWizardPage(
				"DiagramModelFile", getSelection(), "wfgcml_diagram"); //$NON-NLS-1$ //$NON-NLS-2$
		diagramModelFilePage
				.setTitle(Messages.WFGCMLCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage
				.setDescription(Messages.WFGCMLCreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);

		domainModelFilePage = new WFGCMLCreationWizardPage(
				"DomainModelFile", getSelection(), "wfgcml") { //$NON-NLS-1$ //$NON-NLS-2$

			public void setVisible(boolean visible) {
				if (visible) {
					String fileName = diagramModelFilePage.getFileName();
					fileName = fileName.substring(0, fileName.length()
							- ".wfgcml_diagram".length()); //$NON-NLS-1$
					setFileName(WFGCMLDiagramEditorUtil.getUniqueFileName(
							getContainerFullPath(), fileName, "wfgcml")); //$NON-NLS-1$
				}
				super.setVisible(visible);
			}
		};
		domainModelFilePage
				.setTitle(Messages.WFGCMLCreationWizard_DomainModelFilePageTitle);
		domainModelFilePage
				.setDescription(Messages.WFGCMLCreationWizard_DomainModelFilePageDescription);
		addPage(domainModelFilePage);
	}

	/**
	 * @generated
	 */
	public boolean performFinish() {
		IRunnableWithProgress op = new IRunnableWithProgress() {

			public void run(IProgressMonitor monitor)
					throws InvocationTargetException, InterruptedException {
				diagram = WFGCMLDiagramEditorUtil.createDiagram(
						diagramModelFilePage.getURI(), domainModelFilePage
								.getURI(), monitor);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						WFGCMLDiagramEditorUtil.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog.openError(getContainer().getShell(),
								Messages.WFGCMLCreationWizardOpenEditorError,
								null, e.getStatus());
					}
				}
			}
		};
		try {
			getContainer().run(false, true, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				ErrorDialog.openError(getContainer().getShell(),
						Messages.WFGCMLCreationWizardCreationError, null,
						((CoreException) e.getTargetException()).getStatus());
			} else {
				WFGCMLDiagramEditorPlugin.getInstance().logError(
						"Error creating diagram", e.getTargetException()); //$NON-NLS-1$
			}
			return false;
		}
		return diagram != null;
	}
}
