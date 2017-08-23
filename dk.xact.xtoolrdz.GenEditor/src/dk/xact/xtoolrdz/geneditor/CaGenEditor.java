package dk.xact.xtoolrdz.geneditor;

import org.eclipse.jface.preference.IPreferenceNode;
import org.eclipse.jface.preference.IPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceDialog;
import org.eclipse.jface.preference.PreferenceManager;
import org.eclipse.jface.preference.PreferenceNode;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.editors.text.TextEditor;

/**
 * Main class of the editor.
 * 
 * @author Michael Erichsen, Xact Consulting
 * @version 1.0.1
 */

public class CaGenEditor extends TextEditor {
	private static IPreferenceStore store;

	/**
	 * Get preferences, either from store or from opening the dialog
	 */
	private static void getPreferences() {
		store = Activator.getDefault().getPreferenceStore();
		final String keywordColour = store
				.getString(GenConstants.KEYWORD_COLOUR_PREFERENCE);
		final String operatorColour = store
				.getString(GenConstants.OPERATOR_COLOUR_PREFERENCE);
		final String builtinColour = store
				.getString(GenConstants.BUILTIN_COLOUR_PREFERENCE);
		final String tagColour = store
				.getString(GenConstants.TAG_COLOUR_PREFERENCE);
		final String noteColour = store
				.getString(GenConstants.NOTE_COLOUR_PREFERENCE);
		final String stringColour = store
				.getString(GenConstants.STRING_COLOUR_PREFERENCE);

		if (keywordColour == null || keywordColour.equals("")
				|| operatorColour == null || operatorColour.equals("")
				|| builtinColour == null || builtinColour.equals("")
				|| tagColour == null || tagColour.equals("")
				|| noteColour == null || noteColour.equals("")
				|| stringColour == null || stringColour.equals("")) {
			final IPreferencePage page = new PreferencePage();
			final PreferenceManager mgr = new PreferenceManager();
			final IPreferenceNode node = new PreferenceNode("1", page);
			mgr.addToRoot(node);

			final IWorkbench workbench = PlatformUI.getWorkbench();
			final IWorkbenchWindow window = workbench
					.getActiveWorkbenchWindow();
			final Shell shell = window.getShell();

			final PreferenceDialog dialog = new PreferenceDialog(shell, mgr);
			dialog.create();
			dialog.setMessage(page.getTitle());
			dialog.open();
		}
	}

	private ColorManager colorManager;

	public CaGenEditor() {
		super();
		colorManager = new ColorManager();
		setSourceViewerConfiguration(new GenConfiguration(colorManager));
		setDocumentProvider(new GenDocumentProvider());
		getPreferences();
	}

	@Override
	public void dispose() {
		colorManager.dispose();
		super.dispose();
	}
}
