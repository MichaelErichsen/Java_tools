package dk.xact.xtoolrdz.smpeeditor;

import org.eclipse.jface.preference.ColorFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

/**
 * @author Michael Erichsen, Xact Consulting
 * @version 1.0.0
 * 
 *          <p>
 *          This class represents a preference page that is contributed to the
 *          Preferences dialog. By subclassing
 *          <samp>FieldEditorPreferencePage</samp>, we can use the field support
 *          built into JFace that allows us to create a page that is small and
 *          knows how to save, restore and apply itself.
 *          <p>
 *          This page is used to modify preferences only. They are stored in the
 *          preference store that belongs to the main plug-in class. That way,
 *          preferences can be accessed directly via the preference store.
 */

public class PreferencePage extends FieldEditorPreferencePage implements
		IWorkbenchPreferencePage {
	private IPreferenceStore store;

	public PreferencePage() {
		super(GRID);
		store = Activator.getDefault().getPreferenceStore();
		setPreferenceStore(store);
		setDescription("Xtool for RDz SMP/E Editor");
	}

	/**
	 * Creates the field editors. Field editors are abstractions of the common
	 * GUI blocks needed to manipulate various types of preferences. Each field
	 * editor knows how to save and restore itself.
	 */
	@Override
	public void createFieldEditors() {
		final ColorFieldEditor keywordColorEditor = new ColorFieldEditor(
				SmpeConstants.KEYWORD_COLOUR_PREFERENCE, "&Modification control statements colour",
				getFieldEditorParent());
		addField(keywordColorEditor);

		final ColorFieldEditor operatorColorEditor = new ColorFieldEditor(
				SmpeConstants.OPERATOR_COLOUR_PREFERENCE, "&Operation codes colour",
				getFieldEditorParent());
		addField(operatorColorEditor);

		final ColorFieldEditor builtinColorEditor = new ColorFieldEditor(
				SmpeConstants.BUILTIN_COLOUR_PREFERENCE,
				"&Subparameters colour", getFieldEditorParent());
		addField(builtinColorEditor);

		final ColorFieldEditor tagColorEditor = new ColorFieldEditor(
				SmpeConstants.TAG_COLOUR_PREFERENCE, "&Tags and options colour",
				getFieldEditorParent());
		addField(tagColorEditor);

		final ColorFieldEditor noteColorEditor = new ColorFieldEditor(
				SmpeConstants.NOTE_COLOUR_PREFERENCE, "&Languages colour",
				getFieldEditorParent());
		addField(noteColorEditor);

		final ColorFieldEditor stringColorEditor = new ColorFieldEditor(
				SmpeConstants.STRING_COLOUR_PREFERENCE, "St&ring colour",
				getFieldEditorParent());
		addField(stringColorEditor);
	}

	/*
	 * Initializes this preference page for the given workbench.
	 * 
	 * This method is called automatically as the preference page is being
	 * created and initialized. Clients must not call this method.
	 * 
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	@Override
	public void init(IWorkbench workbench) {
	}
}