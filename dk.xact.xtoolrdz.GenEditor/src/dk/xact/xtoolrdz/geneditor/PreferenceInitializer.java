package dk.xact.xtoolrdz.geneditor;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @author Michael Erichsen, Xact Consulting
 * @version 1.0.1
 * 
 *          <p>
 *          Class used to initialize default preference values in Xtool for RDz.
 */
public class PreferenceInitializer extends AbstractPreferenceInitializer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#
	 * initializeDefaultPreferences()
	 */
	@Override
	public void initializeDefaultPreferences() {
		final IPreferenceStore store = Activator.getDefault()
				.getPreferenceStore();
		store.setDefault(GenConstants.KEYWORD_COLOUR_PREFERENCE,
				GenConstants.DEFAULT_KEYWORD_COLOUR_PREFERENCE);
		store.setDefault(GenConstants.OPERATOR_COLOUR_PREFERENCE,
				GenConstants.DEFAULT_OPERATOR_COLOUR_PREFERENCE);
		store.setDefault(GenConstants.BUILTIN_COLOUR_PREFERENCE,
				GenConstants.DEFAULT_BUILTIN_COLOUR_PREFERENCE);
		store.setDefault(GenConstants.TAG_COLOUR_PREFERENCE,
				GenConstants.DEFAULT_TAG_COLOUR_PREFERENCE);
		store.setDefault(GenConstants.NOTE_COLOUR_PREFERENCE,
				GenConstants.DEFAULT_NOTE_COLOUR_PREFERENCE);
		store.setDefault(GenConstants.STRING_COLOUR_PREFERENCE,
				GenConstants.DEFAULT_STRING_COLOUR_PREFERENCE);
	}
}
