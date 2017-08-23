package dk.xact.xtoolrdz.smpeeditor;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @author Michael Erichsen, Xact Consulting
 * @version 1.0.0
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
		store.setDefault(SmpeConstants.KEYWORD_COLOUR_PREFERENCE,
				SmpeConstants.DEFAULT_KEYWORD_COLOUR_PREFERENCE);
		store.setDefault(SmpeConstants.OPERATOR_COLOUR_PREFERENCE,
				SmpeConstants.DEFAULT_OPERATOR_COLOUR_PREFERENCE);
		store.setDefault(SmpeConstants.BUILTIN_COLOUR_PREFERENCE,
				SmpeConstants.DEFAULT_BUILTIN_COLOUR_PREFERENCE);
		store.setDefault(SmpeConstants.TAG_COLOUR_PREFERENCE,
				SmpeConstants.DEFAULT_TAG_COLOUR_PREFERENCE);
		store.setDefault(SmpeConstants.NOTE_COLOUR_PREFERENCE,
				SmpeConstants.DEFAULT_NOTE_COLOUR_PREFERENCE);
		store.setDefault(SmpeConstants.STRING_COLOUR_PREFERENCE,
				SmpeConstants.DEFAULT_STRING_COLOUR_PREFERENCE);
	}
}
