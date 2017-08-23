package dk.xact.xtoolrdz.geneditor;

import org.eclipse.jface.preference.ColorFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

/**
 * @author Michael Erichsen, Xact Consulting
 * @version 1.0.1
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
		setDescription("Xtool for RDz CA Gen Editor");
	}

	/**
	 * Creates the field editors. Field editors are abstractions of the common
	 * GUI blocks needed to manipulate various types of preferences. Each field
	 * editor knows how to save and restore itself.
	 */
	@Override
	public void createFieldEditors() {
		final ColorFieldEditor keywordColorEditor = new ColorFieldEditor(
				GenConstants.KEYWORD_COLOUR_PREFERENCE, "&Keywords colour",
				getFieldEditorParent());
		addField(keywordColorEditor);

		final ColorFieldEditor operatorColorEditor = new ColorFieldEditor(
				GenConstants.OPERATOR_COLOUR_PREFERENCE, "&Operators colour",
				getFieldEditorParent());
		addField(operatorColorEditor);

		final ColorFieldEditor builtinColorEditor = new ColorFieldEditor(
				GenConstants.BUILTIN_COLOUR_PREFERENCE,
				"&Built-in functions colour", getFieldEditorParent());
		addField(builtinColorEditor);

		final ColorFieldEditor tagColorEditor = new ColorFieldEditor(
				GenConstants.TAG_COLOUR_PREFERENCE, "&Tags and options colour",
				getFieldEditorParent());
		addField(tagColorEditor);

		final ColorFieldEditor noteColorEditor = new ColorFieldEditor(
				GenConstants.NOTE_COLOUR_PREFERENCE, "&Notes colour",
				getFieldEditorParent());
		addField(noteColorEditor);

		final ColorFieldEditor stringColorEditor = new ColorFieldEditor(
				GenConstants.STRING_COLOUR_PREFERENCE, "&String colour",
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